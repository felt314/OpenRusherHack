package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIntPair;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.PendingUpdateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EndCrystalItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.LookAndOnGround;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import org.apache.commons.lang3.tuple.MutablePair;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.client.IMixinMultiPlayerGameMode;
import org.rusherhack.client.api.accessors.world.IMixinClientLevel;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventInteract;
import org.rusherhack.client.api.events.player.EventInteract$Action;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.events.world.EventEntity$Add;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.system.IRotationManager;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.client.api.utils.EntityUtils;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.RotationUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.MathUtils;
import org.rusherhack.core.utils.StringUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.bind;
import org.rusherhack.command.clear;
import org.rusherhack.command.peek;
import org.rusherhack.command.reset;
import org.rusherhack.command.send;
import org.rusherhack.client.api.feature.hud.impl.Armor;
import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.hud.impl.FeatureList;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
import org.rusherhack.client.api.feature.module.impl.player.AutoEat;
import org.rusherhack.client.api.feature.module.impl.player.Swing;
import org.rusherhack.client.api.feature.module.impl.render.ESP;
import org.rusherhack.client.api.feature.module.impl.world.FastBreak;
public class AutoCrystal extends ToggleableModule {
   public Vec3d f6532;
   public int f6533;
   public NumberSetting<Integer> mswait;
   public NumberSetting<Integer> pauseathp;
   public BooleanSetting syncBreakingWithTheClient;
   public BooleanSetting theNumberOfCrystalsInYourInventory;
   public float f6538;
   public NumberSetting<Float> maximumRangeToCrystal;
   public NumberSetting<Integer> ticksToPausePlacing;
   public BooleanSetting attemptToAttackCrystalsWhileEating;
   public List<LivingEntity> f6542;
   public ColorSetting theColorOfTheBox;
   public BooleanSetting attemptToPlaceCrystalsWhileMining;
   public NumberSetting<Integer> mindamage;
   public EndCrystalEntity f6546;
   public LivingEntity f6547;
   public NumberSetting<Float> maximumRatioBetweenTargetAndSelfDamage;
   public EnumSetting<AutoCrystalF6549> mode;
   public BooleanSetting switchToACrystal;
   public int f6551;
   public NullSetting damagecalcs;
   public Class410 f6553;
   public NumberSetting<Integer> f6554;
   public NumberSetting<Integer> f6555;
   public EndCrystalEntity f6556;
   public BooleanSetting placeACrystalAfterOneIsDestroyed;
   public ColorSetting f6558;
   public NumberSetting<Integer> f6559;
   public BooleanSetting depthtest;
   public NumberSetting<Integer> ignoreticks;
   public BooleanSetting speeds;
   public NumberSetting<Integer> f6563;
   public NumberSetting<Integer> ticksexisted;
   public BooleanSetting switchServerSideOnly;
   public NumberSetting<Integer> health;
   public BooleanSetting fillTheBox;
   public Map<BlockPos, Long> f6568;
   public BooleanSetting outlineTheBox;
   public BooleanSetting switchToAWeaponWhenYouHaveWeakness;
   public BooleanSetting targetEsp;
   public BlockPos f6572;
   public NumberSetting<Float> maximumRangeToBlock;
   public BooleanSetting hideHiddenSides;
   public float f6575;
   public Timer f6576;
   public NumberSetting<Float> widthOfOutline;
   public boolean f6578;
   public int f6579;
   public NumberSetting<Integer> f6580;
   public int f6581;
   public EnumSetting<AutoCrystalRenderingTransitionStyle> renderingTransitionStyle;
   public BooleanSetting fill;
   public BlockPos f6584;
   public NumberSetting<Integer> placespeed;
   public BlockPos f6586;
   public BooleanSetting faceplaceIfTargetDoesNotHaveFullArmor;
   public boolean f6588;
   public int f6589;
   public BooleanSetting renderABoxOnTheCurrentPlacePosition;
   public NumberSetting<Float> f6591;
   public BooleanSetting swingHandUponAttackingACrystal;
   public ColorSetting theColorOfTheText;
   public BooleanSetting theCurrentDamageCalculations;
   public Map<BlockPos, Enum167> f6595;
   public BooleanSetting attemptToPlaceCrystalsWhileEating;
   public NumberSetting<Integer> checklimit;
   public BooleanSetting nameOfTheCurrentTarget;
   public EnumSetting<AutoCrystalRaycastBlockFace> raycastBlockFace;
   public Timer f6600;
   public NumberSetting<Float> width;
   public BooleanSetting waitsASetAmountOfTicksBeforeResetting;
   public EnumSetting<AutoCrystalHowTargetsAreSelected> howTargetsAreSelected;
   public NumberSetting<Integer> explodespeed;
   public BlockPos f6605;
   public Timer f6606;
   public BooleanSetting whatToDisplayOnHud;
   public Deque<MutablePair<BlockPos, Integer>> f6608;
   public BooleanSetting motion;
   public EndCrystalEntity f6610;
   public BindSetting bindToForceFaceplacing;
   public net.minecraft.util.math.Direction f6612;
   public NumberSetting<Integer> ignoreratiounder;
   public boolean f6614;
   public Set<Long> f6615;
   public BooleanSetting visualdebug2;
   public LivingEntity f6617;
   public BooleanSetting f6618;
   public BooleanSetting f6619;
   public NumberSetting<Float> maximumRangeToBlockIfItIsHidden;
   public Set<BlockPos> f6621;
   public EnumSetting<AutoCrystalTimingMethodUsedForBreakingAndPlacing> timingMethodUsedForBreakingAndPlacing;
   public BooleanSetting attemptToAttackCrystalsWhileMining;
   public BooleanSetting forTheServerCrystalpvpCc;
   public int f6625;
   public NumberSetting<Float> selfdamageratio;
   public LivingEntity f6627;
   public BooleanSetting placeCrystals;
   public BooleanSetting renderTheCurrentPlacePositionDamage;
   public DecimalFormat f6630;
   public NumberSetting<Integer> maximumTimesYouCanAttackACrystal;
   public NullSetting calculateDamage;
   public int f6633;
   public NullSetting predictionSettings;
   public LivingEntity f6635;
   public ColorSetting f6636;
   public NullSetting explodeCrystals;
   public EndCrystalEntity f6638;
   public NumberSetting<Integer> fadespeed;
   public BooleanSetting debug2;
   public BooleanSetting visualdebug;
   public BooleanSetting useCustomFontRenderer;
   public NumberSetting<Double> speedOfBoxSliding;
   public EndCrystalEntity f6644;
   public float f6645;
   public BooleanSetting pauseExplodingAndPlacingUntilRotated;
   public Timer f6647;
   public BooleanSetting randomizesRotationSpeed;
   public BooleanSetting placeRenders;
   public NumberSetting<Integer> f6650;
   public Int2IntMap f6651;
   public BooleanSetting forServersWithVersionsBelow113;
   public Timer f6653;
   public BooleanSetting f6654;
   public EnumSetting<AutoCrystalF6549> methodUsedForSwapping;
   public BooleanSetting debug;
   public NumberSetting<Integer> selfdamagelimit;
   public Set<Long> f6658;
   public BooleanSetting calculateDamageThroughExplodableBlocks;
   public BooleanSetting silent;
   public Int2ObjectMap<EndCrystalEntity> f6661;
   public static AutoCrystal f6662;
   public NullSetting miscellaneousSettings;
   public NumberSetting<Integer> f6664;
   public NumberSetting<Integer> ticksToWaitBeforeUnpausing;
   public Targets f6666;
   public BooleanSetting returnsToThePreviousItemYouWereHolding;
   public NumberSetting<Integer> selfextrapolation;
   public Map<EndCrystalEntity, Long> f6669;
   public BooleanSetting settingsControllingWhenToFaceplace;
   public NumberSetting<Integer> howManyTicksInTheFutureToExtrapolate;
   public NumberSetting<Integer> f6672;
   public EnumSetting<AutoCrystalWhatActionShouldRunFirst> whatActionShouldRunFirst;
   public NumberSetting<Float> maximumRangeToCrystalIfItIsHidden;
   public float f6675;
   public BooleanSetting f6676;
   public BooleanSetting destroyPlacedCrystalUponSpawning;
   public BooleanSetting crystalEsp;
   public NumberSetting<Integer> armorpercent;
   public BooleanSetting syncPlacingWithTheClient;
   public BooleanSetting rotations;
   public NumberSetting<Integer> f6682;
   public BooleanSetting swingHandUponPlacingACrystal;
   public NumberSetting<Integer> f6684;
   public boolean f6685;
   public Int2ObjectMap<IntIntPair> f6686;
   public BooleanSetting f6687;
   public int f6688;
   public BooleanSetting f6689;
   public static long f6690 = Class066.m4320(-8865528178668307727L, -6998537209896026008L, MethodHandles.lookup().lookupClass()).m4325(204431541023139L);
   public static long[] f6694;
   public static Integer[] f6695;
   public static Map f6696;
   public static long[] f6697;
   public static Long[] f6698;
   public static Map f6699;

   public Class122 m12818(EndCrystalEntity var1, LivingEntity var2, EndCrystalEntity var3, float var4) {
        return null;
    }

   @Subscribe(
      stage = Stage.PRE,
      priority = 1000
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if ((Boolean)this.waitsASetAmountOfTicksBeforeResetting.getValue() && this.f6579 > 0) {
         RusherHackAPI.getRotationManager().updateRotation(this.f6675, this.f6538, 180.0F);
         boolean var10004 = true;
         this.f6579--;
      }
   }

   @Subscribe
   public void onQuit(EventQuit var1) {
      boolean var10003 = true;
      this.m12846(true);
   }

   public Enum167 m12823(BlockPos var1) {
        return null;
    }

   public void m12824(int var1, boolean var2, AutoCrystalF6549 var3, boolean var4, int var5) {
      long var6 = f6690 ^ 76733554997312L;
      if (this.f6533 == m175(19682, 9010758304001687214L ^ var6)) {
         this.f6533 = Globals.mc.player.getInventory().selectedSlot;
      }

      this.f6551 = var1;
      this.f6588 = var2;
      this.f6614 = var4;
      AutoCrystal var10;
      switch (var3.ordinal()) {
         case 0:
            Globals.mc.player.getInventory().selectedSlot = this.f6551 % m175(26678, 3813634434612648556L ^ var6);
            var10 = this;
            break;
         case 1:
            m12831(this.f6551, Globals.mc.player.getInventory().selectedSlot);
            this.f6578 = true;
         default:
            var10 = this;
      }

      boolean var10004 = true;
      var10.f6589 = var5 + 1;
      this.f6653.reset();
   }

   @Subscribe
   public void onLoadWorld(EventLoadWorld var1) {
      boolean var10004 = true;
      this.m12846(true);
      this.m12855();
   }

   public void m12826() {
        
    }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      Packet var5;
      if ((var5 = var1.getPacket()) instanceof PlayerInteractBlockC2SPacket) {
         PlayerInteractBlockC2SPacket var7 = (PlayerInteractBlockC2SPacket)var5;
         if (Globals.mc.player.getStackInHand(var7.getHand()).getItem() instanceof EndCrystalItem) {
            this.f6584 = var7.getBlockHitResult().getBlockPos();
         }
      }
   }

   public boolean m12829(EndCrystalEntity var1, BlockPos var2) {
      if (this.timingMethodUsedForBreakingAndPlacing.getValue() == AutoCrystalTimingMethodUsedForBreakingAndPlacing.f3450) {
         return false;
      } else {
         if ((Boolean)this.pauseExplodingAndPlacingUntilRotated.getValue()) {
            if (var1 != null) {
               if (!RusherHackAPI.getRotationManager().isLookingAt(var1)) {
                  this.m12868("awaiting crystal rotations");
                  return true;
               }
            } else {
               if (var2 == null) {
                  boolean var10002 = true;
                  return true;
               }

               if (!RusherHackAPI.getRotationManager().isLookingAt(var2)) {
                  this.m12868("awaiting block rotations");
                  return true;
               }
            }

            if (this.f6633 > 0) {
               boolean var10007 = true;
               this.f6633--;
               this.m12868("awaiting pause ticks");
               return true;
            }

            this.f6633 = this.ticksToWaitBeforeUnpausing.getValue();
         }

         return false;
      }
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      Packet var5;
      if ((var5 = var1.getPacket()) instanceof PlaySoundS2CPacket) {
         PlaySoundS2CPacket var6 = (PlaySoundS2CPacket)var5;
         Globals.mc
            .send(
               () -> {
                  if (var6.getCategory() == SoundCategory.BLOCKS && SoundEvents.ENTITY_GENERIC_EXPLODE.matches(var6.getSound())) {
                     float var10000 = 12.0F;
                     double var5x = var6.getX();
                     double var7 = var6.getY();
                     double var9 = var6.getZ();
                     Vec3d var11 = new Vec3d(var5x, var7, var9);
                     Box var17 = new Box(
                        MathHelper.floor(var5x - 12.0 - 1.0),
                        MathHelper.floor(var7 - 12.0 - 1.0),
                        MathHelper.floor(var9 - 12.0 - 1.0),
                        MathHelper.floor(var5x + 12.0 + 1.0),
                        MathHelper.floor(var7 + 12.0 + 1.0),
                        MathHelper.floor(var9 + 12.0 + 1.0)
                     );
                     Iterator var18 = Globals.mc.world.getNonSpectatingEntities(EndCrystalEntity.class, var17).iterator();

                     label25:
                     while (true) {
                        Iterator var19 = var18;

                        while (var19.hasNext()) {
                           EndCrystalEntity var12;
                           EndCrystalEntity var20 = var12 = (EndCrystalEntity)var18.next();
                           double var13 = Math.sqrt(var20.squaredDistanceTo(var11)) / 12.0;
                           double var21 = var5x = var20.getX() - var5x;
                           double var22 = var21 * var21;
                           double var10001 = var7 = var12.getEyeY() - var7;
                           double var23 = var22 + var10001 * var10001;
                           var10001 = var9 = var12.getZ() - var9;
                           double var15 = Math.sqrt(var23 + var10001 * var10001);
                           if (var13 > 1.0) {
                              continue label25;
                           }

                           if (var15 == 0.0) {
                              var19 = var18;
                           } else {
                              var5x /= var15;
                              var7 /= var15;
                              var9 /= var15;
                              var19 = var18;
                              var12.kill();
                              Globals.mc.world.removeEntity(var12.getId(), RemovalReason.KILLED);
                           }
                        }

                        return;
                     }
                  }
               }
            );
      }
   }

   public static void m12831(int var0, int var1) {
      int var7 = Class253.m9155();
      Globals.mc.interactionManager.clickSlot(Globals.mc.player.currentScreenHandler.syncId, var0, var1, SlotActionType.SWAP, Globals.mc.player);
      Globals.mc.interactionManager.tick();
      int var4 = var7;
      MinecraftClient var8 = Globals.mc;
      if (var4 != 0) {
         if (Globals.mc.currentScreen instanceof HandledScreen) {
            return;
         }

         var8 = Globals.mc;
      }

      var8.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(Globals.mc.player.currentScreenHandler.syncId));
   }

   public AutoCrystal() {
    }

   @Subscribe
   public void onRender2D(EventRender2D var1) {
        
    }

   public boolean m12836(LivingEntity var1) {
      AutoCrystal var5 = this;
      if (!(Boolean)this.settingsControllingWhenToFaceplace.getValue()) {
         return false;
      } else if (((IKey)this.bindToForceFaceplacing.getValue()).isKeyDown()) {
         boolean var10 = true;
         return true;
      } else if (var1.getHealth() + var1.getAbsorptionAmount() <= this.health.getValue().intValue()) {
         boolean var9 = true;
         return true;
      } else {
         Iterator var7 = var1.getArmorItems().iterator();

         label52:
         while (true) {
            for (Iterator var10000 = var7; var10000.hasNext(); var10000 = var7) {
               ItemStack var6 = (ItemStack)var7.next();
               if ((Boolean)var5.faceplaceIfTargetDoesNotHaveFullArmor.getValue() && (var6.isEmpty() || var6.isOf(Items.ELYTRA))) {
                  boolean var8 = true;
                  return true;
               }

               if (!var6.isEmpty()) {
                  if ((int)((float)(var6.getMaxDamage() - var6.getDamage()) / var6.getMaxDamage() * 100.0F) <= var5.armorpercent.getValue()) {
                     boolean var10002 = true;
                     return true;
                  }
                  continue label52;
               }
            }

            return false;
         }
      }
   }

   public void m12838() {
      int var3 = Class253.m9155();
      AutoCrystal var5 = this;
      if ((Boolean)this.placeCrystals.getValue()) {
         this.m12868("searching positions");
         Object2IntOpenHashMap var14 = new Object2IntOpenHashMap();
         int var17 = (int)Math.ceil(this.maximumRangeToBlock.getValue().floatValue());
         int var15 = Globals.mc.player.getBlockX();
         int var7 = MathHelper.floor(Globals.mc.player.getEyeY());
         int var8 = Globals.mc.player.getBlockZ();
         int var9 = Math.max(var7 - var17, Globals.mc.world.getBottomY());
         int var10 = Math.min(var7 + var17, Globals.mc.world.getTopY());

         int var11;
         int var12;
         for (int var10000 = var11 = var15 - var17; var10000 <= var15 + var17; var10000 = ++var11) {
            int var13;
            for (int var23 = var12 = var8 - var17; var23 <= var8 + var17; var23 = ++var12) {
               for (int var24 = var13 = var9; var24 < var10; var24 = ++var13) {
                  int var4 = MathHelper.square(var15 - var11);
                  int var6 = MathHelper.square(var7 - var13);
                  int var16 = MathHelper.square(var8 - var12);
                  if (var4 + var6 + var16 <= MathHelper.square(var17)) {
                     BlockPos var18 = new BlockPos(var11, var13, var12);
                     Enum167 var19;
                     if ((var19 = var5.m12823(var18)) == Enum167.f3291) {
                        var5.f6621.add(var18);
                        var5.f6595.remove(var18);
                        if (var3 != 0) {
                           continue;
                        }
                     }

                     int var10002 = var14.getOrDefault(var19, 0);
                     boolean var10005 = true;
                     var14.put(var19, var10002 + 1);
                     if (var19 != Enum167.f3292 && (var19 != Enum167.f3294 || (Boolean)var5.visualdebug2.getValue())) {
                        var5.f6595.put(var18, var19);
                        if (var3 != 0) {
                           continue;
                        }
                     }

                     var5.f6595.remove(var18);
                  }
               }
            }
         }

         boolean var10004 = true;
         var5.m12868(String.format("found %s positions", var5.f6621.size()));
         if ((Boolean)var5.debug.getValue() && var5.f6621.isEmpty()) {
            StringJoiner var20 = new StringJoiner(", ");
            ObjectIterator var21;
            ObjectIterator var25 = var21 = var14.object2IntEntrySet().iterator();

            while (true) {
               if (!var25.hasNext()) {
                  var5.m12868(String.valueOf(var20));
                  break;
               }

               it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var22 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry)var21.next();
               var20.add(StringUtils.toTitleCase(((Enum167)var22.getKey()).name()) + ": " + var22.getIntValue());
               if (var3 == 0) {
                  break;
               }

               var25 = var21;
            }
         }
      }
   }

   @Override
   public void onEnable() {
      boolean var10004 = true;
      this.m12846(true);
      this.m12855();
   }

   @Override
   public void onDisable() {
      this.f6589 = 0;
      this.m6214();
      this.m12846(true);
   }

   @Subscribe
   public void onRemove(EventEntity$Remove var1) {
      label91: {
         int var4 = Class253.m9154();
         int var7 = var1.getEntity().getId();
         if (var1.getEntity() instanceof LivingEntity) {
            this.f6542.removeIf(var1x -> {
               if (var1x.getId() == var7) {
                  boolean var6x = true;
                  return true;
               } else {
                  boolean var10002x = true;
                  return false;
               }
            });
            if (var4 == 0) {
               break label91;
            }
         }

         Entity var8;
         if ((var8 = var1.getEntity()) instanceof EndCrystalEntity) {
            EndCrystalEntity var6 = (EndCrystalEntity)var8;
            this.f6661.remove(var7);
            this.f6651.remove(var7);
            this.f6686.remove(var7);
            if (this.f6669.remove(var6) != null) {
               this.f6658.add(System.currentTimeMillis());
            }
         }
      }

      if (Globals.mc.player != null) {
         Entity var9;
         if ((Boolean)this.placeACrystalAfterOneIsDestroyed.getValue()
            && (this.f6617 != null || this.f6635 != null)
            && (var9 = var1.getEntity()) instanceof EndCrystalEntity) {
            EndCrystalEntity var11;
            EndCrystalEntity var10000 = var11 = (EndCrystalEntity)var9;
            BlockPos var10 = var10000.getBlockPos().down();
            if (!var10000.equals(this.f6610) || this.f6556 != null && !var11.equals(this.f6556)) {
               return;
            }

            boolean var12;
            BlockPos var10001;
            if (this.f6605 != null) {
               var12 = true;
               boolean var10002 = true;
               var10001 = var10;
            } else {
               var12 = false;
               var10001 = var10;
            }

            boolean var14;
            if (!var10001.equals(this.f6605)) {
               var14 = true;
               boolean var10003 = true;
            } else {
               var14 = false;
               boolean var15 = true;
            }

            if (var12 & var14) {
               return;
            }

            AutoCrystal var13;
            switch (this.renderingTransitionStyle.getValue().ordinal()) {
               case 0:
               case 1:
                  var13 = this;
                  this.f6608.clear();
                  break;
               case 2:
                  this.f6608.removeIf(var1x -> {
                     return ((BlockPos)var1x.getLeft()).equals(var10);
                  });
               default:
                  var13 = this;
            }

            var13.f6608.addFirst(MutablePair.of(this.f6586 = var10, this.f6636.getAlpha()));
            this.f6576.reset();
            this.f6547 = this.f6627 = this.f6617 != null ? this.f6617 : this.f6635;
            this.m12845(null, this.f6586);
         }
      }
   }

   public boolean m12841(Entity var1) {
      if (var1 instanceof LivingEntity var5) {
         this.f6542.add(var5);
         return true;
      } else if (var1 instanceof EndCrystalEntity var7) {
         if (this.f6651.getOrDefault(var7.getId(), 0) > this.maximumTimesYouCanAttackACrystal.getValue()) {
            return false;
         } else {
            this.f6661.put(var7.getId(), var7);
            boolean var10002 = true;
            return true;
         }
      } else {
         return false;
      }
   }

   @Subscribe
   public void onAdd(EventEntity$Add var1) {
        
    }

   @Subscribe(
      stage = Stage.POST
   )
   public void m12844(EventPlayerUpdate var1) {
        
    }

   public void m12845(EndCrystalEntity var1, BlockPos var2) {
      long var3 = f6690 ^ 116300620065L;
      if ((Boolean)this.rotations.getValue()) {
         IRotationManager var8 = RusherHackAPI.getRotationManager();
         int var10000;
         if ((Boolean)this.randomizesRotationSpeed.getValue()) {
            var10000 = ThreadLocalRandom.current().nextInt(m175(21079, 3323734845064706422L ^ var3)) - m175(23914, 557698681239795273L ^ var3);
         } else {
            var10000 = 0;
            boolean var10002 = true;
         }

         int var7 = var10000;
         AutoCrystal var13;
         if (var1 != null) {
            float[] var9 = RotationUtils.getRotations(var1.getPos());
            Class331 var11 = (Class331)var8;
            float var17 = var9[0];
            boolean var10006 = true;
            AutoCrystal var12;
            if (var11.m10864(var1, var17, var9[1])) {
               float var10001 = var9[0];
               boolean var10005 = true;
               var8.updateRotation(var10001, var9[1], this.explodespeed.getValue() + var7);
               var12 = this;
            } else {
               var8.updateRotation(var1, (float)(this.explodespeed.getValue() + var7));
               var12 = this;
            }

            var12.m12868("rotating to end crystal");
            var13 = this;
         } else {
            if (var2 != null) {
               float[] var10 = RotationUtils.getRotations(Class220.m8439(var2, this.f6612 != null ? this.f6612 : net.minecraft.util.math.Direction.UP));
               Class331 var14 = (Class331)var8;
               float var18 = var10[0];
               boolean var20 = true;
               AutoCrystal var15;
               if (var14.m10867(var2, var18, var10[1]).getType() != Type.MISS) {
                  float var16 = var10[0];
                  boolean var19 = true;
                  var8.updateRotation(var16, var10[1], this.placespeed.getValue() + var7);
                  var15 = this;
               } else {
                  var8.updateRotation(var2, null, this.placespeed.getValue() + var7);
                  var15 = this;
               }

               var15.m12868("rotating to block pos");
            }

            var13 = this;
         }

         var13.f6579 = this.f6563.getValue();
         this.f6675 = Class170.f3364.m7108().f5324;
         this.f6538 = Class170.f3364.m7108().f5318;
      }
   }

   public void m12846(boolean var1) {
        
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   public boolean m12849(BlockPos var1, Entity var2) {
      if (var1.equals(var2.getBlockPos().add(net.minecraft.util.math.Direction.NORTH.getVector()))) {
         boolean var7 = true;
         return true;
      } else if (var1.equals(var2.getBlockPos().add(net.minecraft.util.math.Direction.SOUTH.getVector()))) {
         boolean var6 = true;
         return true;
      } else if (var1.equals(var2.getBlockPos().add(net.minecraft.util.math.Direction.WEST.getVector()))) {
         boolean var5 = true;
         return true;
      } else if (var1.equals(var2.getBlockPos().add(net.minecraft.util.math.Direction.EAST.getVector()))) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      long var2;
      int var4;
      AutoCrystal var5;
      IRenderer3D var7;
      AutoCrystal var10000;
      label98: {
         var2 = f6690 ^ 10196490480451L;
         var4 = Class253.m9154();
         var5 = this;
         this.m12864();
         (var7 = var1.getRenderer()).begin(var1.getMatrixStack());
         if ((Boolean)this.targetEsp.getValue() && this.f6627 != null) {
            var7.setLineWidth(this.widthOfOutline.getValue());
            var7.setDepthTest((Boolean)this.hideHiddenSides.getValue());
            if ((Boolean)this.motion.getValue() && this.howManyTicksInTheFutureToExtrapolate.getValue() > 0) {
               Vec3d var6 = Class006.m307(this.f6627, this.howManyTicksInTheFutureToExtrapolate.getValue());
               Box var20 = this.f6627.getBoundingBox().offset(-var6.x, -var6.y, -var6.z);
               double var8 = MathUtils.interpolate(var6.x, this.f6627.prevX, var1.getPartialTicks()) + var20.minX;
               double var10 = MathUtils.interpolate(var6.y, this.f6627.prevY, var1.getPartialTicks()) + var20.minY;
               double var12 = MathUtils.interpolate(var6.z, this.f6627.prevZ, var1.getPartialTicks()) + var20.minZ;
               var7.drawBox(
                  var8,
                  var10,
                  var12,
                  var20.getLengthX(),
                  var20.getLengthY(),
                  var20.getLengthZ(),
                  (Boolean)this.fillTheBox.getValue(),
                  (Boolean)this.outlineTheBox.getValue(),
                  this.theColorOfTheBox.getValueRGB()
               );
               var10000 = this;
               break label98;
            }

            var7.drawBox(
               this.f6627,
               var1.getPartialTicks(),
               (Boolean)this.fillTheBox.getValue(),
               (Boolean)this.outlineTheBox.getValue(),
               this.theColorOfTheBox.getValueRGB()
            );
         }

         var10000 = this;
      }

      if ((Boolean)var10000.crystalEsp.getValue() && this.f6546 != null) {
         var7.setLineWidth(this.width.getValue());
         var7.setDepthTest((Boolean)this.depthtest.getValue());
         var7.drawBox(this.f6546, var1.getPartialTicks(), (Boolean)this.fill.getValue(), (Boolean)this.f6618.getValue(), this.f6558.getValueRGB());
      }

      label89: {
         if ((Boolean)this.placeRenders.getValue() && (Boolean)this.renderABoxOnTheCurrentPlacePosition.getValue() && !this.f6608.isEmpty()) {
            var7.setLineWidth(this.f6591.getValue());
            var7.setDepthTest((Boolean)this.f6676.getValue());
            Iterator var24;
            switch (this.renderingTransitionStyle.getValue().ordinal()) {
               case 0:
                  BlockPos var25 = (BlockPos)this.f6608.peek().getLeft();
                  var7.drawBox(var25, (Boolean)this.f6619.getValue(), (Boolean)this.f6654.getValue(), this.f6636.getValueRGB());
                  var10000 = this;
                  break label89;
               case 1:
                  Vec3d var22 = Vec3d.of((BlockPos)this.f6608.peek().getLeft());
                  if (this.f6532.equals(Vec3d.ZERO)) {
                     this.f6532 = var22;
                     var10000 = this;
                  } else {
                     if (!this.f6532.equals(var22)) {
                        double var28 = MathUtils.interpolate(var22.x, this.f6532.x, this.speedOfBoxSliding.getValue() / 10.0);
                        double var30 = MathUtils.interpolate(var22.y, this.f6532.y, this.speedOfBoxSliding.getValue() / 10.0);
                        double var32 = MathUtils.interpolate(var22.z, this.f6532.z, this.speedOfBoxSliding.getValue() / 10.0);
                        this.f6532 = new Vec3d(var28, var30, var32);
                     }

                     var10000 = this;
                  }

                  double var29 = var10000.f6532.x;
                  double var31 = this.f6532.y;
                  double var33 = this.f6532.z;
                  double var14 = 1.0;
                  double var16 = 1.0;
                  double var18 = 1.0;
                  if ((Boolean)this.f6676.getValue()) {
                     var29 -= 0.001;
                     var31 -= 0.001;
                     var33 -= 0.001;
                     var14 += 0.002;
                     var16 += 0.002;
                     var18 += 0.002;
                  }

                  var7.drawBox(
                     var29, var31, var33, var14, var16, var18, (Boolean)this.f6619.getValue(), (Boolean)this.f6654.getValue(), this.f6636.getValueRGB()
                  );
                  var10000 = this;
                  break label89;
               case 2:
                  for (Iterator var34 = var24 = this.f6608.iterator(); var34.hasNext(); var34 = var24) {
                     MutablePair var21;
                     BlockPos var27 = (BlockPos)(var21 = (MutablePair)var24.next()).getLeft();
                     int var9 = (Integer)var21.getRight();
                     var7.drawBox(
                        var27, (Boolean)var5.f6619.getValue(), (Boolean)var5.f6654.getValue(), ColorUtils.transparency(var5.f6636.getValueRGB(), var9)
                     );
                  }
            }
         }

         var10000 = var5;
      }

      Iterator var26;
      if ((Boolean)var10000.visualdebug.getValue()) {
         for (Iterator var37 = var26 = var5.f6595.entrySet().iterator(); var37.hasNext(); var37 = var26) {
            Entry var23 = (Entry)var26.next();
            BlockPos var10001 = (BlockPos)var23.getKey();
            boolean var10005 = true;
            var7.drawBox(var10001, true, true, ColorUtils.transparency(Color.RED.getRGB(), m175(14293, 4966180654254020225L ^ var2)));
            if (var4 != 0) {
               return;
            }
         }
      }

      var7.end();
   }

   public void m12853(EndCrystalEntity var1, int var2) {
        
    }

   @Override
   public String getMetadata() {
      if (!(Boolean)this.whatToDisplayOnHud.getValue()) {
         return "";
      } else {
         if (Class170.f3364.m7106().m17898(FeatureList.class).metadata.getValue() == FeatureListMetadata.f7878) {
            boolean var10000 = true;
            boolean var10002 = true;
         } else {
            boolean var7 = false;
         }

         StringJoiner var6 = new StringJoiner(" ");
         if ((Boolean)this.nameOfTheCurrentTarget.getValue() && this.f6627 != null) {
            var6.add(EntityUtils.getNameForEntity(this.f6627));
         }

         if ((Boolean)this.theNumberOfCrystalsInYourInventory.getValue()) {
            boolean var10005 = true;
            var6.add(String.valueOf(InventoryUtils.getItemCount(Items.END_CRYSTAL, false, true)));
         }

         if ((Boolean)this.theCurrentDamageCalculations.getValue()) {
            var6.add(this.f6630.format((double)this.f6645) + "," + this.f6630.format((double)this.f6575));
         }

         if ((Boolean)this.speeds.getValue()) {
            var6.add(this.f6658.size() + "," + this.f6615.size());
         }

         return String.valueOf(var6);
      }
   }

   public void m12855() {
      AutoCrystal var3 = this;
      this.f6542.clear();
      Iterator var5;
      Iterator var10000 = var5 = WorldUtils.getEntities().iterator();

      while (var10000.hasNext()) {
         Entity var4 = (Entity)var5.next();
         var10000 = var5;
         var3.m12841(var4);
      }
   }

   @Subscribe
   public void onInteract(EventInteract var1) {
      Entity var5;
      if (var1.getAction() == EventInteract$Action.ATTACK && (var5 = var1.getTargetEntity()) instanceof EndCrystalEntity) {
         EndCrystalEntity var7 = (EndCrystalEntity)var5;
         this.f6610 = var7;
      }
   }

   public void m12857(BlockPos var1, net.minecraft.util.math.Direction var2, int var3) {
        
    }

   public Class122 m12858(LivingEntity var1) {
        return null;
    }

   public void m12859(EndCrystalEntity var1, BlockPos var2, boolean var3) {
        
    }

   public Class410 m12861(BlockPos var1, LivingEntity var2, BlockPos var3, float var4) {
        return null;
    }

   public void m6214() {
      long var1 = f6690 ^ 704174055194L;
      if (this.f6533 != m175(17780, 7550880417116033144L ^ var1)) {
         if (this.f6588 || this.f6614 && this.f6653.ticksPassed(this.f6589)) {
            this.f6653.reset();
            if (this.f6578) {
               m12831(
                  this.f6533 + m175(29868, 6093620433169686961L ^ var1),
                  this.f6551 != m175(17780, 7550880417116033144L ^ var1)
                     ? this.f6551 % m175(13735, 3867278049071161506L ^ var1)
                     : Globals.mc.player.getInventory().selectedSlot
               );
            }

            Globals.mc.player.getInventory().selectedSlot = this.f6533;
            this.f6533 = this.f6551 = m175(17780, 7550880417116033144L ^ var1);
            this.f6588 = this.f6578 = this.f6614 = false;
         }
      }
   }

   public void m12864() {
      long var1 = f6690 ^ 236842205417L;
      if (!(Globals.mc.player.getHealth() + Globals.mc.player.getAbsorptionAmount() <= this.pauseathp.getValue().intValue()) && !AutoTotem.f3491.m7405()) {
         boolean var6 = AutoEat.f2905.m6292();
         boolean var5 = FastBreak.f5664.m11347();
         if (var6 && !(Boolean)this.attemptToAttackCrystalsWhileEating.getValue() || var5 && !(Boolean)this.attemptToAttackCrystalsWhileMining.getValue()) {
            this.f6644 = null;
         }

         if (var6 && !(Boolean)this.attemptToPlaceCrystalsWhileEating.getValue() || var5 && !(Boolean)this.attemptToPlaceCrystalsWhileMining.getValue()) {
            this.f6586 = null;
         }

         if (this.f6644 != null || this.f6586 != null) {
            if (this.f6547 != null && this.f6666.m7993(this.f6547)) {
               if (!(Boolean)this.rotations.getValue() || !this.m12829(this.f6644, this.f6586)) {
                  Class122 var7;
                  if (this.f6644 != null
                     && this.f6647.passed(this.mswait.getValue().intValue())
                     && (var7 = this.m12818(this.f6644, this.f6547, null, Math.min(0.5F, (float)this.mindamage.getValue().intValue()))) != null) {
                     boolean var10000;
                     if (this.m12836(this.f6547) && this.m12849(this.f6644.getBlockPos().down(), this.f6547)) {
                        var10000 = true;
                        boolean var10 = true;
                     } else {
                        var10000 = false;
                        boolean var10002 = true;
                     }

                     var5 = var10000;
                     if (var7.f2567 >= this.mindamage.getValue().intValue() || var5) {
                        this.f6556 = null;
                        this.m12853(this.f6644, m175(7143, 1666330850254049555L ^ var1));
                     }
                  }

                  Class410 var8;
                  if (this.f6586 != null
                     && this.f6576.passed(this.f6650.getValue().intValue())
                     && this.m12823(this.f6586) == Enum167.f3291
                     && (var8 = this.m12861(this.f6586, this.f6547, null, Math.min(0.5F, (float)this.f6672.getValue().intValue()))) != null) {
                     boolean var10001;
                     if (this.m12836(this.f6547) && this.m12849(this.f6586, this.f6547)) {
                        var10001 = true;
                        boolean var11 = true;
                     } else {
                        var10001 = false;
                        boolean var10003 = true;
                     }

                     this.f6685 = var10001;
                     if (var8.f6929 >= this.f6672.getValue().intValue() || this.f6685) {
                        this.f6605 = null;
                        this.m12857(this.f6586, var8.f6933, m175(14307, 164243870982995215L ^ var1));
                     }
                  }

                  this.m6214();
               }
            }
         }
      }
   }

   public Class410 m12867(LivingEntity var1) {
        return null;
    }

   public void m12868(String var1) {
      if ((Boolean)this.debug.getValue()) {
         ChatUtils.print(var1);
      }
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32758;
      if (f6695[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f6694[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f6696.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f6696.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ϔ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f6695[var3] = var15;
      }

      return f6695[var3];
   }

   public static int m176(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m175(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoCrystal.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ϔ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static long m4692(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17456;
      if (f6698[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f6697[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f6699.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f6699.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ϔ", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         f6698[var3] = var15;
      }

      return f6698[var3];
   }

   public static long m4693(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = m4692(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoCrystal.class, "m4693", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ϔ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static Field m181(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m182(Class var0, String var1, Class var2) {
      Field var3 = m181(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m182(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }
   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label33:
      for (Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for (int var10 = 0; var10 < var3; var10++) {
                  if (var9[var10] != var4[var10]) {
                     continue label33;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m184(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m185(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }
}
