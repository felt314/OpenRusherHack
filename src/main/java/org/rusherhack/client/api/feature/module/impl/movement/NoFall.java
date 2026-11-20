package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.FluidDrainable;
import net.minecraft.block.HayBlock;
import net.minecraft.block.HoneyBlock;
import net.minecraft.block.PointedDripstoneBlock;
import net.minecraft.block.PowderSnowBlock;
import net.minecraft.block.SlimeBlock;
import net.minecraft.block.enums.Thickness;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.DamageUtil;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.World;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.entity.IMixinLivingEntity;
import org.rusherhack.client.api.accessors.world.IMixinBucketItem;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.system.IRotationManager;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.module.impl.combat.Criticals;
import org.rusherhack.client.api.feature.module.impl.world.FastBreak;
import org.rusherhack.client.api.feature.module.impl.world.FastBreakMode;
public class NoFall extends ToggleableModule {
   public BlockHitResult f5259;
   public Timer f5260;
   public int f5261;
   public EnumSetting<NoFallMode> mode;
   public boolean f5263;
   public int f5264;
   public boolean f5265;
   public NumberSetting<Float> distance;
   public BlockPos f5267;
   public static long f5268 = Class066.m4320(-7167575482334620148L, -8001851370241959236L, MethodHandles.lookup().lookupClass()).m4325(69274768300888L);
   public static long[] f5272;
   public static Integer[] f5273;
   public static Map f5274;

   @Subscribe(
      priority = 1000
   )
   public void onUpdate(EventUpdate var1) {
        
    }

   public void m6358() {
        
    }

   @Subscribe(
      stage = Stage.POST,
      priority = 1
   )
   public void m10738(Event301 var1) {
      if (this.f5263) {
         Input var5;
         Input var7 = var5 = var1.m10147();
         var7.pressingForward = var7.pressingLeft = var7.pressingBack = var7.pressingRight = false;
         var5.movementForward = var5.movementSideways = 0.0F;
         if (Globals.mc.player.isOnGround() || Criticals.m7812() || Globals.mc.player.isTouchingWater() || Globals.mc.player.isInLava()) {
            this.f5263 = false;
         }
      }
   }

   public BlockPos m10739() {
      int var10000 = Class253.m9155();
      int var10001 = Globals.mc.player.getBlockY();
      boolean var10004 = true;
      int var4 = var10001 - 1;
      int var3 = var10000;

      while (true) {
         MinecraftClient var8;
         if (var4 > Globals.mc.world.getBottomY()) {
            BlockPos var7 = new BlockPos(Globals.mc.player.getBlockX(), var4, Globals.mc.player.getBlockZ());
            var8 = Globals.mc;
            if (var3 != 0) {
               BlockState var6;
               boolean var9 = (var6 = Globals.mc.world.getBlockState(var7)).isAir();
               if (var3 != 0) {
                  if (var9) {
                     var4--;
                     if (var3 != 0) {
                        continue;
                     }
                  }

                  var9 = var6.getBlock() instanceof FluidBlock;
               }

               if (var9) {
                  int var10002 = var7.getX();
                  int var10003 = var7.getY();
                  boolean var10006 = true;
                  return new BlockPos(var10002, var10003 + 1, var7.getZ());
               }

               return var7;
            }
         } else {
            var8 = Globals.mc;
         }

         return var8.player.getBlockPos();
      }
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   public float m10740(BlockState var1) {
      int var4 = Class253.m9154();
      if (var1.isIn(BlockTags.FALL_DAMAGE_RESETTING)) {
         return 0.0F;
      } else {
         Block var8;
         if (!((var8 = var1.getBlock()) instanceof PowderSnowBlock) && (!(var8 instanceof SlimeBlock) || Globals.mc.player.bypassesLandingEffects())) {
            float var6;
            float var7;
            label75: {
               var6 = Math.max(Globals.mc.player.fallDistance, 10.0F);
               var7 = 1.0F;
               if (var8 instanceof BedBlock) {
                  var6 *= 0.5F;
                  if (var4 == 0) {
                     break label75;
                  }
               }

               if (var8 instanceof HayBlock) {
                  var7 = 0.2F;
                  if (var4 == 0) {
                     break label75;
                  }
               }

               if (var8 instanceof HoneyBlock) {
                  var7 = 0.2F;
                  if (var4 == 0) {
                     break label75;
                  }
               }

               if (var8 instanceof PointedDripstoneBlock
                  && var1.get(PointedDripstoneBlock.VERTICAL_DIRECTION) == net.minecraft.util.math.Direction.UP
                  && var1.get(PointedDripstoneBlock.THICKNESS) == Thickness.TIP) {
                  var6 += 2.0F;
                  var7 = 2.0F;
               }
            }

            float var10;
            if ((var10 = ((IMixinLivingEntity)Globals.mc.player).invokeCalculateFallDamage(var6, var7)) <= 0.0F) {
               return 0.0F;
            } else {
               float var9;
               if ((var9 = Util210.m8044(Globals.mc.player, Globals.mc.player.getDamageSources().fall())) > 0.0F) {
                  var10 = DamageUtil.getInflictedDamage(var10, var9);
               }

               return var10;
            }
         } else {
            return 0.0F;
         }
      }
   }

   public boolean m10741() {
        return false;
    }

   public float m10742(BlockState var1, BlockPos var2, ItemStack var3) {
      float var10;
      if ((var10 = var1.getHardness(Globals.mc.world, var2)) == -1.0F) {
         return 0.0F;
      } else {
         int var8;
         float var9;
         if ((var9 = var3.getMiningSpeedMultiplier(var1)) > 1.0F && !var3.isEmpty() && (var8 = Util210.m8037(Enchantments.EFFICIENCY, var3)) > 0) {
            int var10001 = var8 * var8;
            boolean var10004 = true;
            var9 += var10001 + 1;
         }

         if (StatusEffectUtil.hasHaste(Globals.mc.player)) {
            int var10002 = StatusEffectUtil.getHasteAmplifier(Globals.mc.player);
            boolean var10005 = true;
            var9 *= 1.0F + (var10002 + 1) * 0.2F;
         }

         StatusEffectInstance var11;
         if ((var11 = Globals.mc.player.getStatusEffect(StatusEffects.MINING_FATIGUE)) != null) {
            var9 *= switch (var11.getAmplifier()) {
               case 0 -> 0.3F;
               case 1 -> 0.09F;
               case 2 -> 0.0027F;
               default -> 8.1E-4F;
            };
         }

         if (Globals.mc.player.isSubmergedIn(FluidTags.WATER) && !Util210.m8036(Globals.mc.player)) {
            var9 /= 5.0F;
         }

         if (!Globals.mc.player.isOnGround()) {
            var9 /= 5.0F;
         }

         return var9 / var10 / (var1.isToolRequired() && !var3.isSuitableFor(var1) ? 100.0F : 30.0F);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.ALL,
      priority = -998
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
        
    }

   public float m10745(ItemStack var1) {
      Item var7;
      if ((var7 = var1.getItem()) instanceof BucketItem) {
         Fluid var5;
         if ((var5 = ((IMixinBucketItem)((BucketItem)var7)).getContent()) == Fluids.WATER && Globals.mc.world.getRegistryKey() != World.NETHER) {
            return 0.0F;
         }

         if (var5 == Fluids.LAVA && Globals.mc.player.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) {
            return 0.0F;
         }
      } else if (var7 instanceof BlockItem) {
         Block var9;
         if ((var9 = ((BlockItem)var7).getBlock()) == Blocks.SLIME_BLOCK) {
            return 0.1F;
         }

         return this.m10740(var9.getDefaultState());
      }

      return 999.0F;
   }

   @Override
   public void onEnable() {
      this.f5265 = true;
      this.f5267 = null;
      this.f5261 = this.f5264 = -1;
   }

   public static void m10746(int var0, int var1) {
      int var7 = Class253.m9154();
      Globals.mc.interactionManager.clickSlot(Globals.mc.player.currentScreenHandler.syncId, var0, var1, SlotActionType.SWAP, Globals.mc.player);
      int var4 = var7;
      Globals.mc.interactionManager.tick();
      MinecraftClient var8 = Globals.mc;
      if (var4 == 0) {
         if (Globals.mc.currentScreen instanceof HandledScreen) {
            return;
         }

         var8 = Globals.mc;
      }

      var8.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(Globals.mc.player.currentScreenHandler.syncId));
   }

   @Subscribe
   public void onLoadWorld(EventLoadWorld var1) {
      this.f5267 = null;
      this.f5261 = this.f5264 = -1;
   }

   public NoFall() {
      super("NoFall", "Stops fall damage on some servers", ModuleCategory.MOVEMENT);
      this.mode = new EnumSetting<>("Mode", NoFallMode.f9442).onChange(var1x -> {
         this.f5265 = true;
      });
      this.distance = new NumberSetting<>("Distance", 3.0F, 1.0F, 10.0F);
      this.f5260 = new Timer();
      this.f5261 = -1;
      this.f5264 = -1;
      Setting[] var10001 = new Setting[]{this.mode, null};
      boolean var10005 = true;
      var10001[1] = this.distance;
      this.registerSettings(var10001);
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22022;
      if (f5273[var3] == null) {
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
         long var5 = f5272[var3];
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
         Object[] var9 = (Object[])f5274.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f5274.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ʃ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f5273[var3] = var15;
      }

      return f5273[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(NoFall.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʃ" + " : " + var1 + " : " + var2.toString(), var5);
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
