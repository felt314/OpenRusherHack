package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BedBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.bind.key.GLFWKey;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.client.input.EventKeyboard;
import org.rusherhack.client.api.events.client.input.EventMouse$Key;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.bind;
import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.module.impl.player.AutoEat;
public class AutoTotem extends ToggleableModule {
   public BooleanSetting lethalcrystal;
   public BooleanSetting hotbarpriority;
   public boolean f3487;
   public BooleanSetting toggle;
   public BooleanSetting inventory;
   public BooleanSetting stopmotion;
   public static AutoTotem f3491;
   public boolean f3492;
   public NumberSetting<Integer> falldistance;
   public BooleanSetting nonfullarmor;
   public BooleanSetting requiresautocrystal;
   public BooleanSetting stopeating;
   public NumberSetting<Integer> health;
   public BooleanSetting onlyBlockYourShieldNearAnExplosion;
   public BooleanSetting absorptioncheck;
   public EnumSetting<AutoTotemMode> mode;
   public BooleanSetting alternatewhen;
   public int f3502;
   public NumberSetting<Integer> delay;
   public BooleanSetting totemwhen;
   public EnumSetting<AutoTotemAlternateitem> alternateitem;
   public int f3506;
   public BooleanSetting automaticallyBlocksUsingYourShield;
   public BooleanSetting whileeating;
   public BooleanSetting soft;
   public java.util.Queue<Runnable> f3510;
   public BindSetting keyheld;
   public BooleanSetting sworduse;
   public Timer f3513;
   public static long f3514 = Class066.m4320(2552587706728196735L, -6521426209517962680L, MethodHandles.lookup().lookupClass()).m4325(136672379846574L);
   public static long[] f3518;
   public static Integer[] f3519;
   public static Map f3520;

   public boolean m7394() {
      if (!(Boolean)this.automaticallyBlocksUsingYourShield.getValue()
         || Globals.mc.player.isUsingItem()
         || Globals.mc.player.getItemCooldownManager().isCoolingDown(Items.SHIELD)) {
         return false;
      } else if (!(Boolean)this.onlyBlockYourShieldNearAnExplosion.getValue()) {
         boolean var19 = true;
         return true;
      } else {
         Iterator var4 = WorldUtils.getEntities().iterator();

         while (var4.hasNext()) {
            Entity var8;
            if ((var8 = (Entity)var4.next()) instanceof EndCrystalEntity) {
               EndCrystalEntity var7 = (EndCrystalEntity)var8;
               if (Globals.mc.player.distanceTo(var7) <= 12.0F) {
                  boolean var16 = true;
                  return true;
               }
            }

            if (var8 instanceof TntEntity var6 && Globals.mc.player.distanceTo(var6) <= 8.0F) {
               boolean var15 = true;
               return true;
            }

            if (var8 instanceof CreeperEntity var13) {
               float var10000 = Globals.mc.player.distanceTo(var13);
               int var10001;
               if (var13.shouldRenderOverlay()) {
                  var10001 = 12;
               } else {
                  var10001 = 6;
                  boolean var10003 = true;
               }

               if (var10000 <= var10001) {
                  boolean var10002 = true;
                  return true;
               }
            }
         }

         if (Globals.mc.world.getRegistryKey() != World.OVERWORLD) {
            var4 = WorldUtils.getBlockEntities(false).iterator();

            while (var4.hasNext()) {
               BlockEntity var9;
               BedBlockEntity var14;
               if ((var9 = (BlockEntity)var4.next()) instanceof BedBlockEntity && Util177.m7288((var14 = (BedBlockEntity)var9).getPos()) <= 10.0F) {
                  boolean var17 = true;
                  return true;
               }
            }
         }

         if (Globals.mc.world.getRegistryKey() != World.NETHER) {
            for (BlockPos var10 : WorldUtils.getSphere(Globals.mc.player.getBlockPos(), 10.0F)) {
               if (Globals.mc.world.getBlockState(var10).isOf(Blocks.RESPAWN_ANCHOR)) {
                  boolean var18 = true;
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Subscribe
   public void onKeyboard(EventKeyboard var1) {
      int var10000 = var1.getAction();
      boolean var10003 = true;
      Object var7;
      if (var10000 == 1 && (var7 = this.keyheld.getValue()) instanceof Class545) {
         Class545 var5 = (Class545)var7;
         if (var1.getKey() == var5.getKeyCode()) {
            boolean var10001;
            if (!this.f3492) {
               var10001 = true;
               var10003 = true;
            } else {
               var10001 = false;
               var10003 = true;
            }

            this.f3492 = var10001;
         }
      }
   }

   @Subscribe(
      priority = -1337
   )
   public void onMove(EventMove var1) {
      if ((Boolean)this.stopmotion.getValue() && !this.f3510.isEmpty()) {
         var1.setMotion(0.0, Math.min(var1.getY(), 0.0), 0.0);
      }
   }

   @Subscribe
   public void onKey(EventMouse$Key var1) {
      switch (var1.getAction()) {
         case 0:
            this.f3487 = false;
            break;
         case 1:
            Object var7;
            if ((var7 = this.keyheld.getValue()) instanceof Class489) {
               Class489 var5 = (Class489)var7;
               if (var1.getButton() == var5.getKeyCode()) {
                  boolean var10001;
                  if (!this.f3492) {
                     var10001 = true;
                     boolean var10003 = true;
                  } else {
                     var10001 = false;
                     boolean var8 = true;
                  }

                  this.f3492 = var10001;
                  return;
               }
            }
      }
   }

   @Override
   public void onDisable() {
      this.f3492 = false;
   }

   @Subscribe(
      stage = Stage.POST,
      priority = -100
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if (this.alternateitem.getValue() == AutoTotemAlternateitem.f3828 && Globals.mc.player.getOffHandStack().isOf(Items.SHIELD) && this.m7394()) {
         Globals.mc.interactionManager.interactItem(Globals.mc.player, Hand.OFF_HAND);
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      AutoTotem var8 = this;
      boolean var10006 = true;
      this.f3502 = InventoryUtils.getItemCount(Items.TOTEM_OF_UNDYING, false, true);
      if (this.f3506 > 0) {
         this.f3510.clear();
         this.f3513.reset();
         boolean var10004 = true;
         this.f3506--;
      } else {
         if (!this.m7405()) {
            if ((Boolean)this.soft.getValue() && !Globals.mc.player.getOffHandStack().isEmpty() || Globals.mc.player.isCreative()) {
               return;
            }

            if (Globals.mc.currentScreen instanceof HandledScreen && !(Boolean)this.inventory.getValue()
               || (Boolean)this.inventory.getValue()
                  && !(Globals.mc.currentScreen instanceof InventoryScreen)
                  && Globals.mc.currentScreen instanceof HandledScreen) {
               return;
            }

            Item var6 = this.m7404() ? this.alternateitem.getValue().f3824 : Items.TOTEM_OF_UNDYING;
            if (Globals.mc.player.getOffHandStack().isOf(var6)) {
               return;
            }

            int var5;
            if ((var5 = InventoryUtils.findItem(var6, (Boolean)this.hotbarpriority.getValue(), false)) != -1) {
               AutoTotem var10000;
               label105: {
                  if (AutoEat.f2905.m6292()) {
                     if ((Boolean)this.stopeating.getValue()) {
                        AutoEat.f2905.f2904 = false;
                        Globals.mc.options.useKey.setPressed(false);
                        var10000 = this;
                        break label105;
                     }

                     if (!(Boolean)this.whileeating.getValue()) {
                        this.f3506 = 10;
                        return;
                     }
                  }

                  var10000 = this;
               }

               var10000.f3510.offer(() -> {
                  long var1x = f3514 ^ 71742592605529L;
                  InventoryUtils.swapSlots(var5, m175(19097, 2074074843557460324L ^ var1x));
               });
            }
         }

         boolean var7;
         boolean var10 = var7 = this.m7405();

         Runnable var9;
         while (var10 && var8.f3513.ticksPassed(var8.delay.getValue()) && (var9 = var8.f3510.poll()) != null) {
            var10 = var7;
            var9.run();
            var8.f3513.reset();
         }

         if (var7 && !var8.m7405()) {
            if (!(Globals.mc.currentScreen instanceof HandledScreen)) {
               Globals.mc.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(Globals.mc.player.currentScreenHandler.syncId));
            }

            if (!Globals.mc.options.useKey.isPressed() && var8.f3487) {
               boolean var10003 = true;
               Globals.mc.options.useKey.setPressed(true);
            }
         }
      }
   }

   public AutoTotem() {
      super("AutoTotem", "Automatically places a totem in your offhand", ModuleCategory.COMBAT);
      this.mode = new EnumSetting<>("Mode", AutoTotemMode.f4766);
      this.health = new NumberSetting<>("Health", 8, 0, 20)
         .setVisibility(() -> {
            return this.mode.getValue().equals(AutoTotemMode.f4765);
         });
      this.alternateitem = new EnumSetting<>("AlternateItem", AutoTotemAlternateitem.f3825);
      boolean var10007 = true;
      this.automaticallyBlocksUsingYourShield = new BooleanSetting("AutoBlock", "Automatically blocks using your shield", true).setVisibility(() -> {
         if (this.alternateitem.getValue() == AutoTotemAlternateitem.f3828) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10009 = true;
      this.onlyBlockYourShieldNearAnExplosion = new BooleanSetting("OnlyInExplosionRange", "Only block your shield near an explosion", true);
      this.alternatewhen = new BooleanSetting("AlternateWhen", false);
      this.requiresautocrystal = new BooleanSetting("RequiresAutoCrystal", false);
      boolean var10006 = true;
      this.sworduse = new BooleanSetting("SwordUse", true).setVisibility(() -> {
         return this.alternateitem.getValue().f3824.getDefaultStack().contains(DataComponentTypes.FOOD);
      });
      this.keyheld = new BindSetting("KeyHeld", NullKey.INSTANCE);
      var10006 = true;
      this.toggle = new BooleanSetting("Toggle", true).onChange(var1x -> {
         this.f3492 = false;
      });
      boolean var10013 = true;
      this.totemwhen = new BooleanSetting("TotemWhen", true);
      this.falldistance = new NumberSetting<>("FallDistance", 20, 0, 20);
      boolean var10012 = true;
      this.nonfullarmor = new BooleanSetting("NonFullArmor", true);
      this.lethalcrystal = new BooleanSetting("LethalCrystal", false);
      this.hotbarpriority = new BooleanSetting("HotbarPriority", false);
      this.delay = new NumberSetting<>("Delay", 0, 0, 20);
      this.stopmotion = new BooleanSetting("StopMotion", false);
      var10007 = true;
      this.stopeating = new BooleanSetting("StopEating", true);
      var10006 = true;
      this.whileeating = new BooleanSetting("WhileEating", true).setVisibility(() -> {
         if (!(Boolean)this.stopeating.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10005 = true;
      this.absorptioncheck = new BooleanSetting("AbsorptionCheck", true).setVisibility(() -> {
         return this.mode.getValue().equals(AutoTotemMode.f4765);
      });
      boolean var10011 = true;
      this.inventory = new BooleanSetting("Inventory", true);
      this.soft = new BooleanSetting("Soft", false);
      this.f3510 = new ConcurrentLinkedQueue<>();
      this.f3513 = new Timer();
      f3491 = this;
      boolean var10004 = true;
      this.absorptioncheck.setHidden(true);
      var10005 = true;
      this.inventory.setHidden(true);
      var10006 = true;
      this.soft.setHidden(true);
      boolean var10003 = true;
      this.automaticallyBlocksUsingYourShield.addSubSettings(this.onlyBlockYourShieldNearAnExplosion);
      BooleanSetting var10000 = this.alternatewhen;
      Setting[] var10001 = new Setting[]{this.requiresautocrystal, null, null};
      var10005 = true;
      var10001[1] = this.sworduse;
      var10001[2] = this.keyheld;
      var10000.addSubSettings(var10001);
      var10003 = true;
      this.keyheld.addSubSettings(this.toggle);
      var10000 = this.totemwhen;
      var10001 = new Setting[]{this.falldistance, null, null};
      var10005 = true;
      var10001[1] = this.nonfullarmor;
      var10001[2] = this.lethalcrystal;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[14];
      var10001[0] = this.mode;
      var10005 = true;
      var10001[1] = this.health;
      var10001[2] = this.absorptioncheck;
      var10001[3] = this.alternateitem;
      var10001[4] = this.automaticallyBlocksUsingYourShield;
      var10001[5] = this.alternatewhen;
      var10001[6] = this.totemwhen;
      var10001[7] = this.hotbarpriority;
      var10001[8] = this.inventory;
      var10001[9] = this.delay;
      var10001[10] = this.soft;
      var10001[11] = this.stopmotion;
      var10001[12] = this.stopeating;
      var10001[13] = this.whileeating;
      this.registerSettings(var10001);
   }

   public boolean m7404() {
      if (this.mode.getValue() == AutoTotemMode.f4765
         && Globals.mc.player.getHealth() + (this.absorptioncheck.getValue() ? Globals.mc.player.getAbsorptionAmount() : 0.0F)
            <= this.health.getValue().intValue()) {
         return false;
      } else {
         if ((Boolean)this.totemwhen.getValue()) {
            if (this.falldistance.getValue() != 0 && Globals.mc.player.fallDistance >= this.falldistance.getValue().intValue()) {
               return false;
            }

            if ((Boolean)this.nonfullarmor.getValue()) {
               Iterator var4 = Globals.mc.player.getArmorItems().iterator();

               while (var4.hasNext()) {
                  ItemStack var9;
                  if ((var9 = (ItemStack)var4.next()) == ItemStack.EMPTY || var9.getItem() instanceof ElytraItem) {
                     return false;
                  }
               }
            }

            if ((Boolean)this.lethalcrystal.getValue()) {
               Iterator var13 = WorldUtils.getEntities().iterator();

               while (var13.hasNext()) {
                  Entity var10;
                  if ((var10 = (Entity)var13.next()) instanceof EndCrystalEntity) {
                     EndCrystalEntity var6;
                     EndCrystalEntity var10000 = var6 = (EndCrystalEntity)var10;
                     boolean var10005 = true;
                     if (Util418.m13513(var10000, Globals.mc.player, true, 0) >= Globals.mc.player.getHealth() + Globals.mc.player.getAbsorptionAmount()) {
                        return false;
                     }
                  }
               }
            }
         }

         if ((Boolean)this.alternatewhen.getValue()) {
            if ((Boolean)this.requiresautocrystal.getValue() && !AutoCrystal.f6662.isToggled()) {
               return false;
            } else {
               boolean var16;
               if (!Util416.m13454(Globals.mc.player.getMainHandStack(), Globals.mc.crosshairTarget)
                  && !Util416.m13454(Globals.mc.player.getOffHandStack(), Globals.mc.crosshairTarget)) {
                  var16 = false;
                  boolean var21 = true;
               } else {
                  var16 = true;
                  boolean var20 = true;
               }

               boolean var14 = var16;
               boolean var11 = this.alternateitem.getValue().f3824.getDefaultStack().contains(DataComponentTypes.FOOD);
               if ((Boolean)this.sworduse.getValue()
                  && Globals.mc.options.useKey.isPressed()
                  && var11
                  && Globals.mc.player.getMainHandStack().getItem() instanceof SwordItem) {
                  boolean var19;
                  if (!var14) {
                     var19 = true;
                     boolean var28 = true;
                  } else {
                     var19 = false;
                     boolean var29 = true;
                  }

                  this.f3487 = var19;
                  return this.f3487;
               } else {
                  if ((Boolean)this.toggle.getValue()) {
                     var16 = this.f3492;
                  } else if (((IKey)this.keyheld.getValue()).isKeyDown() && Globals.mc.currentScreen == null) {
                     var16 = true;
                     boolean var23 = true;
                  } else {
                     var16 = false;
                     boolean var22 = true;
                  }

                  boolean var15 = var16;
                  if (var15 && !(Boolean)this.toggle.getValue() && var11) {
                     boolean var10001;
                     if (!var14) {
                        var10001 = true;
                        boolean var10003 = true;
                     } else {
                        var10001 = false;
                        boolean var27 = true;
                     }

                     this.f3487 = var10001;
                  }

                  boolean var12 = false;
                  Object var8;
                  if ((var8 = this.keyheld.getValue()) instanceof GLFWKey) {
                     GLFWKey var7 = (GLFWKey)var8;
                     if (!Globals.mc.options.useKey.matchesKey(var7.getKeyCode(), var7.getScanCode())
                        && !Globals.mc.options.useKey.matchesMouse(var7.getKeyCode())) {
                        var16 = false;
                        boolean var25 = true;
                     } else {
                        var16 = true;
                        boolean var24 = true;
                     }

                     var12 = var16;
                  }

                  if (!var15 || var14 && var12) {
                     return false;
                  } else {
                     boolean var26 = true;
                     return true;
                  }
               }
            }
         } else if (this.mode.getValue() == AutoTotemMode.f4765) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean m7405() {
      if (this.isToggled() && !this.f3510.isEmpty()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public String getMetadata() {
      return String.valueOf(this.f3502);
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18696;
      if (f3519[var3] == null) {
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
         long var5 = f3518[var3];
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
         Object[] var9 = (Object[])f3520.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f3520.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ɓ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f3519[var3] = var15;
      }

      return f3519[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoTotem.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ɓ" + " : " + var1 + " : " + var2.toString(), var5);
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
