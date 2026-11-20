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
import java.util.function.Predicate;
import net.minecraft.client.network.PendingUpdateManager;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.client.IMixinMinecraft;
import org.rusherhack.client.api.accessors.client.IMixinMultiPlayerGameMode;
import org.rusherhack.client.api.accessors.world.IMixinClientLevel;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.pitch;
import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.hud.impl.Test;
public class TridentTweaks extends ToggleableModule {
   public NumberSetting<Integer> f2048;
   public BooleanSetting inventory;
   public BooleanSetting allowsYouToInstantlyUseTridents;
   public Timer f2051;
   public BooleanSetting allowsYouToUseTridentsOutOfWater;
   public NumberSetting<Float> pitch;
   public BooleanSetting pitchspoof;
   public BooleanSetting test;
   public BooleanSetting automaticallyUseTridentBoostWhileMoving;
   public NumberSetting<Integer> delay;
   public static TridentTweaks f2058;
   public BooleanSetting grimdisabler;
   public BooleanSetting spam;
   public static long f2061 = Class066.m4320(-105050049571373578L, 7440401507937967200L, MethodHandles.lookup().lookupClass()).m4325(281250431721832L);
   public static Object[] f2068 = new Object[132];
   public static String[] f2069 = new String[132];

   public TridentTweaks() {
      super(
         "TridentTweaks",
         "Tweak the way that Tridents work",
         ModuleCategory.MOVEMENT
      );
      boolean var10020 = true;
      this.allowsYouToUseTridentsOutOfWater = new BooleanSetting("Anywhere", "Allows you to use tridents out of water", true);
      boolean var10019 = true;
      this.allowsYouToInstantlyUseTridents = new BooleanSetting("Instant", "Allows you to instantly use tridents", true);
      this.spam = new BooleanSetting("Spam", "Automatically use a trident while right clicking", false);
      Integer var10014 = 3;
      boolean var10017 = true;
      this.delay = new NumberSetting<>("Delay", var10014, 1, 20);
      this.automaticallyUseTridentBoostWhileMoving = new BooleanSetting("AutoBoost", "Automatically use trident boost while moving", false);
      Integer var10012 = 3;
      boolean var10015 = true;
      this.f2048 = new NumberSetting<>("Delay", var10012, 1, 20);
      this.pitchspoof = new BooleanSetting("PitchSpoof", false);
      this.pitch = new NumberSetting<>("Pitch", 0.0F, -90.0F, 90.0F);
      boolean var9 = true;
      this.grimdisabler = new BooleanSetting("GrimDisabler", "Bypass grim movement checks when a trident is in your inventory", true);
      boolean var10010 = true;
      this.inventory = new BooleanSetting("Inventory", true);
      boolean var10009 = true;
      BooleanSetting var10004 = new BooleanSetting("Test", true);
      boolean var10007 = true;
      this.test = var10004.setHidden(true);
      this.f2051 = new Timer();
      f2058 = this;
      boolean var10003 = true;
      this.spam.addSubSettings(this.delay);
      BooleanSetting var10000 = this.automaticallyUseTridentBoostWhileMoving;
      Setting[] var10001 = new Setting[]{this.f2048, null};
      boolean var10005 = true;
      var10001[1] = this.pitchspoof;
      var10000.addSubSettings(var10001);
      var10003 = true;
      this.pitchspoof.addSubSettings(this.pitch);
      var10000 = this.grimdisabler;
      var10001 = new Setting[]{this.inventory, null};
      var10005 = true;
      var10001[1] = this.test;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.allowsYouToUseTridentsOutOfWater, null, null, null, null};
      var10005 = true;
      var10001[1] = this.allowsYouToInstantlyUseTridents;
      var10001[2] = this.spam;
      var10001[3] = this.automaticallyUseTridentBoostWhileMoving;
      var10001[4] = this.grimdisabler;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if ((Boolean)this.allowsYouToUseTridentsOutOfWater.getValue() || Globals.mc.player.isTouchingWaterOrRain()) {
         if ((Boolean)this.spam.getValue()
            && Globals.mc.player.isUsingItem()
            && Globals.mc.player.getActiveItem().isOf(Items.TRIDENT)
            && this.f2051.ticksPassed(this.delay.getValue())) {
            Globals.mc.interactionManager.stopUsingItem(Globals.mc.player);
            ((IMixinMinecraft)Globals.mc).setRightClickDelay(0);
            this.f2051.reset();
         }

         if ((!Globals.mc.player.isUsingItem() || Globals.mc.player.getActiveItem().isOf(Items.TRIDENT))
            && (!Globals.mc.player.isOnGround() || PlayerUtils.hasHorizontalInput() || !(Globals.mc.player.getVelocity().y < 0.0))) {
            if (!Class428.f7111.m12380()) {
               if ((Boolean)this.automaticallyUseTridentBoostWhileMoving.getValue()
                  && Globals.mc.player.input.pressingForward
                  && this.f2051.ticksPassed(this.f2048.getValue())) {
                  float var4 = Globals.mc.player.getPitch();
                  if ((Boolean)this.pitchspoof.getValue()) {
                     Globals.mc.player.setPitch(this.pitch.getValue());
                  }

                  boolean var10004 = true;
                  this.m4755(true);
                  if ((Boolean)this.pitchspoof.getValue()) {
                     Globals.mc.player.setPitch(var4);
                  }

                  this.f2051.reset();
               } else {
                  if ((Boolean)this.grimdisabler.getValue()) {
                     this.m4755(false);
                  }
               }
            }
         }
      }
   }

   public void m4755(boolean var1) {
        
    }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f2069[var4] != null) {
         return var4;
      } else {
         Object var5 = f2068[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 20;
               case 1 -> 7;
               case 2 -> 40;
               case 3 -> 29;
               case 4 -> 56;
               case 5 -> 27;
               case 6 -> 49;
               case 7 -> 13;
               case 8 -> 4;
               case 9 -> 17;
               case 10 -> 48;
               case 11 -> 32;
               case 12 -> 6;
               case 13 -> 5;
               case 14 -> 14;
               case 15 -> 37;
               case 16 -> 30;
               case 17 -> 3;
               case 18 -> 16;
               case 19 -> 46;
               case 20 -> 39;
               case 21 -> 61;
               case 22 -> 8;
               case 23 -> 12;
               case 24 -> 25;
               case 25 -> 11;
               case 26 -> 31;
               case 27 -> 33;
               case 28 -> 54;
               case 29 -> 21;
               case 30 -> 34;
               case 31 -> 60;
               case 32 -> 52;
               case 33 -> 53;
               case 34 -> 36;
               case 35 -> 19;
               case 36 -> 18;
               case 37 -> 28;
               case 38 -> 35;
               case 39 -> 62;
               case 40 -> 50;
               case 41 -> 57;
               case 42 -> 51;
               case 43 -> 0;
               case 44 -> 9;
               case 45 -> 38;
               case 46 -> 45;
               case 47 -> 63;
               case 48 -> 43;
               case 49 -> 47;
               case 50 -> 41;
               case 51 -> 22;
               case 52 -> 15;
               case 53 -> 26;
               case 54 -> 59;
               case 55 -> 58;
               case 56 -> 2;
               case 57 -> 44;
               case 58 -> 55;
               case 59 -> 10;
               case 60 -> 1;
               case 61 -> 42;
               case 62 -> 24;
               default -> 23;
            };
            int[] var7 = new int[6];

            for (int var8 = 0; var8 < 6; var8++) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for (int var14 = 0; var14 < var13.length; var14++) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            f2069[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f2068[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f2069[var4]);
            f2068[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
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

   public static Field m183(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f2068[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f2069[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f2068[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f2068[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new IllegalStateException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = m180(1514268578103748L, 0L);
            }
         }
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

   public static Method m186(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f2068[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f2069[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            var11++;
            var12++;
         } while ((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for (int var16 = 0; var16 < var11; var16++) {
            int var17 = var6.indexOf(8, var12);
            var15 = m180(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m184(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f2068[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1514268578103748L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m185(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f2068[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while (var29 < var13) {
                  var28.append(var14[var29].getName());
                  if (++var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new IllegalStateException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1514268578103748L, 0L);
            }
         }
      }
   }

   public static MethodHandle m187(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'c' && var8 != 'b' && var8 != 'D' && var8 != 199) {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 's') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'Z') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'c') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'b') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'D') {
               var9 = var0.findStaticGetter(var12, var18, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var18, var14);
            }
         }

         return MethodHandles.dropArguments((MethodHandle)var9, var3.parameterCount() - 2, long.class, long.class);
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName())
            .append(" : ")
            .append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null "))
            .append(" : ")
            .append(var15.toString());
         throw new IllegalStateException(var13.toString());
      }
   }

   public static Object m188(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m187(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(TridentTweaks.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Á" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
