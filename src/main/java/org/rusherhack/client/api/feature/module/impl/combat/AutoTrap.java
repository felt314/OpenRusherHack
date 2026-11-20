package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Blocks;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.player.AutoEat;
import org.rusherhack.client.api.feature.module.impl.render.LogoutSpots;
public class AutoTrap extends ToggleableModule {
   public BooleanSetting logoutspots;
   public BooleanSetting ignoreself;
   public BlockHitResult f3939;
   public NumberSetting<Float> placerange;
   public BooleanSetting strictdir;
   public BooleanSetting antistep;
   public EnumSetting<AutoTrapTraptype> traptype;
   public EnumSetting<AutoTrapRotationTimingMethodUsedForPlacements> rotationTimingMethodUsedForPlacements;
   public BooleanSetting rotate;
   public ColorSetting color;
   public Timer f3947;
   public BooleanSetting raytrace;
   public BooleanSetting swapServerSideOnly;
   public NumberSetting<Float> enemyrange;
   public NumberSetting<Integer> movedelay;
   public BooleanSetting returnsToThePreviousItemYouWereHolding;
   public NumberSetting<Float> speed;
   public EnumSetting<AutoTrapMode> mode;
   public int f3955;
   public BlockPos f3956;
   public List<BlockPos> f3957;
   public BooleanSetting friendprotect;
   public NumberSetting<Integer> placedelay;
   public BooleanSetting automaticallySwapsToObsidian;
   public Timer f3961;
   public BooleanSetting render;
   public static long f3963 = Class066.m4320(2642811500416330580L, -6771711437949364277L, MethodHandles.lookup().lookupClass()).m4325(36243649394497L);
   public static long[] f3967;
   public static Integer[] f3968;
   public static Map f3969;

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   @Subscribe(
      stage = Stage.POST
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      long var2 = f3963 ^ 117072795155170L;
      if (this.rotationTimingMethodUsedForPlacements.getValue() == AutoTrapRotationTimingMethodUsedForPlacements.f2374 && this.f3939 != null) {
         boolean var10004 = true;
         int var4;
         if ((var4 = InventoryUtils.findItem(Items.OBSIDIAN, true, true)) < m175(17567, 6293618195362304596L ^ var2)
            || !(Boolean)this.automaticallySwapsToObsidian.getValue()
               && var4 != Globals.mc.player.getInventory().selectedSlot
               && var4 != m175(1163, 7987112112022786639L ^ var2)) {
            return;
         }

         this.m8198(this.f3939, var4);
      }
   }

   public boolean m8196(Entity var1) {
      if (var1 == null) {
         return false;
      } else {
         Vec3d var4;
         if ((var4 = var1.getVelocity()).x == 0.0 && !(var4.y > 0.0) && var4.z == 0.0) {
            return false;
         } else {
            boolean var10002 = true;
            return true;
         }
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      long var2 = f3963 ^ 70779916181421L;
      int var4 = Class253.m9154();
      AutoTrap var5 = this;
      boolean var10004 = true;
      int var9;
      if ((var9 = InventoryUtils.findItem(Items.OBSIDIAN, true, true)) < m175(17567, 6293576257030174491L ^ var2)) {
         if (this.mode.getValue() == AutoTrapMode.f8174) {
            this.sendNotification(NotificationType.ERROR, "You have no obsidian in your hotbar!");
            this.toggle();
         }
      } else if (!(Boolean)this.automaticallySwapsToObsidian.getValue()
         && var9 != Globals.mc.player.getInventory().selectedSlot
         && var9 != m175(1163, 7987070169141376768L ^ var2)) {
         if (this.mode.getValue() == AutoTrapMode.f8174) {
            this.sendNotification(NotificationType.ERROR, "You are not holding obsidian!");
            this.toggle();
         }
      } else {
         PlayerEntity var7;
         this.f3957 = this.m8203(var7 = this.m8207());
         this.f3939 = null;
         if (var4 == 0) {
            if (!AutoTotem.f3491.m7405() && !AutoSurround.f7212.m13915() && !AutoEat.f2905.m6292()) {
               if (this.mode.getValue() == AutoTrapMode.f8173) {
                  if (this.m8196(var7)) {
                     this.f3947.reset();
                  }

                  if (!this.f3947.ticksPassed(this.movedelay.getValue())) {
                     this.f3957.clear();
                     return;
                  }
               }

               if (this.mode.getValue() == AutoTrapMode.f8175 && this.m8196(var7)) {
                  this.toggle();
                  return;
               }

               Iterator var8 = this.f3957.iterator();

               AutoTrap var10;
               while (true) {
                  if (var8.hasNext()) {
                     BlockPos var6;
                     var5.f3939 = Util416.m13460(
                        var6 = (BlockPos)var8.next(),
                        (Boolean)var5.strictdir.getValue(),
                        (Boolean)var5.raytrace.getValue(),
                        var5.placerange.getValue().floatValue()
                     );
                     if (var5.f3939 == null) {
                        continue;
                     }

                     var10 = var5;
                     var5.f3956 = var6;
                     break;
                  }

                  var10 = var5;
                  break;
               }

               if (var10.f3939 == null) {
                  if ((Boolean)var5.returnsToThePreviousItemYouWereHolding.getValue() && var5.f3955 != -1) {
                     Globals.mc.player.getInventory().selectedSlot = var5.f3955;
                     var5.f3955 = -1;
                  }

                  if (var5.mode.getValue() == AutoTrapMode.f8174) {
                     var5.toggle();
                  }

                  var5.f3956 = null;
                  return;
               }

               if ((Boolean)var5.rotate.getValue()) {
                  RusherHackAPI.getRotationManager().updateRotation(var5.f3939, var5.speed.getValue());
               }

               if (var5.rotationTimingMethodUsedForPlacements.getValue() == AutoTrapRotationTimingMethodUsedForPlacements.f2373) {
                  var5.m8198(var5.f3939, var9);
               }

               return;
            }

            this.f3956 = null;
         }
      }
   }

   public void m8198(BlockHitResult var1, int var2) {
      long var3 = f3963 ^ 35434449784677L;
      if (RusherHackAPI.getRotationManager().isLookingAt(var1, (Boolean)this.raytrace.getValue()) && this.f3961.ticksPassed(this.placedelay.getValue())) {
         Hand var7 = var2 < m175(16440, 4705677567439610738L ^ var3) ? Hand.MAIN_HAND : Hand.OFF_HAND;
         if (this.f3955 == -1 || (Boolean)this.swapServerSideOnly.getValue()) {
            this.f3955 = Globals.mc.player.getInventory().selectedSlot;
         }

         if (var7 == Hand.MAIN_HAND) {
            Globals.mc.player.getInventory().selectedSlot = var2 - m175(28733, 7022740296417514360L ^ var3);
         }

         boolean var10004 = true;
         Util416.m13459(var1, var7, true);
         this.f3961.reset();
         if ((Boolean)this.swapServerSideOnly.getValue()) {
            Globals.mc.player.getInventory().selectedSlot = this.f3955;
            this.f3955 = -1;
         }
      }
   }

   @Override
   public void onEnable() {
      this.f3957.clear();
      this.f3956 = null;
      this.f3955 = -1;
   }

   public List<BlockPos> m8203(PlayerEntity var1) {
        return null;
    }

   @Override
   public void onDisable() {
      if (Globals.mc.player != null && (Boolean)this.returnsToThePreviousItemYouWereHolding.getValue() && this.f3955 != -1) {
         Globals.mc.player.getInventory().selectedSlot = this.f3955;
      }
   }

   public void m8205(List<BlockPos> var1, BlockPos var2) {
      if (!this.traptype.getValue().equals(AutoTrapTraptype.f6780)) {
         var1.add(var2);
      }

      if (!this.traptype.getValue().equals(AutoTrapTraptype.f6782)) {
         boolean var10004 = true;
         var1.add(var2.add(0, 1, 0));
      }
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      int var4 = Class253.m9155();
      AutoTrap var9 = this;
      if ((Boolean)this.render.getValue()) {
         IRenderer3D var5 = var1.getRenderer();
         var5.begin(var1.getMatrixStack());
         Iterator var8;
         Iterator var10 = var8 = this.f3957.iterator();

         while (true) {
            if (!var10.hasNext()) {
               var5.end();
               break;
            }

            BlockPos var6 = (BlockPos)var8.next();
            if (var4 == 0) {
               break;
            }

            var10 = var8;
            boolean var10003 = var6.equals(var9.f3956);
            boolean var10006 = true;
            var5.drawBox(var6, var10003, true, var9.color.getValueRGB());
         }
      }
   }

   public PlayerEntity m8207() {
      int var3 = Class253.m9155();
      AutoTrap var7 = this;
      Object var8 = this.ignoreself.getValue() ? null : Globals.mc.player;
      double var5 = this.enemyrange.getValue().floatValue();
      Iterator var11 = Globals.mc.world.getPlayers().iterator();

      label73:
      while (true) {
         Iterator var10000 = var11;

         while (true) {
            if (!var10000.hasNext()) {
               break label73;
            }

            PlayerEntity var4;
            if (!(var4 = (PlayerEntity)var11.next()).equals(Globals.mc.player)) {
               if (!RusherHackAPI.getRelationManager().isFriend(var4.getName().getString()) || !(Boolean)var7.friendprotect.getValue()) {
                  float var9;
                  if ((var9 = Globals.mc.player.distanceTo(var4)) <= var5) {
                     var5 = var9;
                     var8 = var4;
                     if (var3 == 0) {
                        break label73;
                     }
                  }
                  break;
               }

               var10000 = var11;
            } else {
               var10000 = var11;
            }
         }
      }

      if ((Boolean)var7.logoutspots.getValue()) {
         Iterator var12 = LogoutSpots.f5982.values().iterator();

         label50:
         while (true) {
            for (Iterator var15 = var12; var15.hasNext(); var15 = var12) {
               Class468 var13 = (Class468)var12.next();
               if (!RusherHackAPI.getRelationManager().isFriend(var13.m14552().getName().getString()) || !(Boolean)var7.friendprotect.getValue()) {
                  double var14;
                  if ((var14 = Util177.m7289(var13.m14553())) <= var5) {
                     var5 = var14;
                     OtherClientPlayerEntity var16 = new OtherClientPlayerEntity(Globals.mc.world, var13.m14551());
                     var16.setPosition(var13.m14553());
                     var8 = var16;
                     if (var3 == 0) {
                        return (PlayerEntity)var8;
                     }
                  }
                  continue label50;
               }
            }

            return (PlayerEntity)var8;
         }
      } else {
         return (PlayerEntity)var8;
      }
   }

   public AutoTrap() {
    }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7606;
      if (f3968[var3] == null) {
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
         long var5 = f3967[var3];
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
         Object[] var9 = (Object[])f3969.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f3969.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ƶ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f3968[var3] = var15;
      }

      return f3968[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoTrap.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ƶ" + " : " + var1 + " : " + var2.toString(), var5);
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
