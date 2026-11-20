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
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameMode;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.EntityUtils;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.command.AutoDisconnectCommand;
import org.rusherhack.command.disconnect;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Time;
import org.rusherhack.client.api.feature.module.impl.misc.AutoReconnect;
public class AutoDisconnect extends ToggleableModule {
   public BooleanSetting illegaldisconnect;
   public BooleanSetting tntminecarts;
   public BooleanSetting lethalcrystal;
   public NumberSetting<Float> amount;
   public BooleanSetting totempop;
   public double f5091;
   public BooleanSetting time;
   public boolean f5093;
   public BooleanSetting ylevel;
   public SimpleDateFormat f5095;
   public BooleanSetting donTDisconnectIfHoldingTotem;
   public NumberSetting<Float> f5097;
   public BooleanSetting disableAutoreconnect;
   public Targets f5099;
   public NumberSetting<Integer> f5100;
   public DecimalFormat f5101;
   public BooleanSetting coordinates;
   public NumberSetting<Integer> threshold;
   public static AutoDisconnect f5104;
   public BooleanSetting alwayson;
   public BooleanSetting health;
   public BooleanSetting disableAfterDisconnecting;
   public double f5108;
   public NumberSetting<Float> range;
   public static long f5110 = Class066.m4320(4385095989918880988L, -4498174197819260598L, MethodHandles.lookup().lookupClass()).m4325(184107610579741L);
   public static Object[] f5117 = new Object[157];
   public static String[] f5118 = new String[157];

   @Override
   public ModuleCommand createCommand() {
      return new AutoDisconnectCommand(this, this);
   }

   @Subscribe
   public void m10342(Event559 var1) {
      if (!Globals.mc.isConnectedToLocalServer() && !this.m10346()) {
         if (var1.m17272().equals(Globals.mc.player) && (Boolean)this.totempop.getValue()) {
            this.m10347("you have popped a totem");
         }
      }
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      Packet var7;
      if ((var7 = var1.getPacket()) instanceof HealthUpdateS2CPacket) {
         HealthUpdateS2CPacket var5 = (HealthUpdateS2CPacket)var7;
         if (!Globals.mc.isConnectedToLocalServer() && !this.m10346()) {
            this.m10344(var5.getHealth());
         }
      } else {
         if (var1.getPacket() instanceof DisconnectS2CPacket) {
            this.f5093 = true;
         }
      }
   }

   public void m10344(float var1) {
      if ((Boolean)this.health.getValue() && !(var1 > this.amount.getValue()) && !(var1 <= 0.0F) && !(Globals.mc.currentScreen instanceof DeathScreen)) {
         if ((Boolean)this.donTDisconnectIfHoldingTotem.getValue()) {
            boolean var10004 = true;
            if (InventoryUtils.getItemCount(Items.TOTEM_OF_UNDYING, false, true) > this.threshold.getValue() || Globals.mc.player.isHolding(Items.TOTEM_OF_UNDYING)
               )
             {
               return;
            }
         }

         this.m10347("you only have " + this.f5101.format((double)var1) + " health left");
      }
   }

   @Subscribe(
      priority = -900
   )
   public void onUpdate(EventUpdate var1) {
      AutoDisconnect var5 = this;
      if (!Globals.mc.isConnectedToLocalServer() && !this.m10346()) {
         this.f5093 = false;
         this.m10344(Globals.mc.player.getHealth());
         if ((Boolean)this.coordinates.getValue() && (this.f5108 != -1.0 || this.f5091 != -1.0)) {
            if (this.f5108 == -1.0) {
               this.f5108 = Globals.mc.player.getX();
            }

            if (this.f5091 == -1.0) {
               this.f5091 = Globals.mc.player.getZ();
            }

            if (Util177.m7289(new Vec3d(this.f5108, Globals.mc.player.getY(), this.f5091)) <= this.f5097.getValue()) {
               this.m10347("you are in range of your coordinates");
               return;
            }
         }

         if ((Boolean)this.ylevel.getValue() && (int)Globals.mc.player.getY() < this.f5100.getValue()) {
            Object[] var10002 = new Object[]{this.f5100.getValue(), null};
            boolean var10006 = true;
            var10002[1] = (int)Globals.mc.player.getY();
            this.m10347(String.format("you went below Y level %s (%s)", var10002));
         } else {
            Iterator var8 = WorldUtils.getEntities().iterator();

            label84:
            while (true) {
               for (Iterator var10000 = var8; var10000.hasNext(); var10000 = var8) {
                  Entity var7 = (Entity)var8.next();
                  if ((Boolean)var5.lethalcrystal.getValue() && var7 instanceof EndCrystalEntity) {
                     EndCrystalEntity var6;
                     EndCrystalEntity var10 = var6 = (EndCrystalEntity)var7;
                     boolean var10005 = true;
                     if (Util418.m13513(var10, Globals.mc.player, true, 0) >= Globals.mc.player.getHealth() + Globals.mc.player.getAbsorptionAmount()) {
                        var5.m10347("a potentially lethal crystal is in range");
                        return;
                     }
                  }

                  if (!var5.f5099.m7993(var7)) {
                     continue label84;
                  }

                  if (!(var7 instanceof Util458)) {
                     if (Globals.mc.player.distanceTo(var7) <= var5.range.getValue() && var7.isAlive()) {
                        String var9 = var7 instanceof PlayerEntity ? ((PlayerEntity)var7).getDisplayName().getString() : EntityUtils.getNameForEntity(var7);
                        var5.m10347(var9 + " is in range");
                        return;
                     }
                     continue label84;
                  }
               }

               return;
            }
         }
      }
   }

   @Override
   public String getMetadata() {
      return String.valueOf(this.amount.getValue());
   }

   public AutoDisconnect() {
    }

   public boolean m10346() {
      if (!Globals.mc.player.isSpectator() && Globals.mc.interactionManager.getCurrentGameMode() != GameMode.SPECTATOR) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   public void m10347(String var1) {
      long var2 = f5110 ^ 89863076206863L;
      if (this.f5093) {
      }

      this.f5093 = true;
      String var5 = this.time.getValue() ? "\n" + this.f5095.format(new Date()) : "";
      String var8 = "AutoDisconnect has disconnected you because " + var1 + var5;
      if ((Boolean)this.illegaldisconnect.getValue()) {
         Globals.mc.player.networkHandler.sendChatMessage(String.valueOf('\u0000'));
      }

      org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "y", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Globals.mc.player.networkHandler.getConnection(),  Text.literal("[rusherhack] " + var8),  -7536190312653856949L,  var2);
      this.sendNotification(NotificationType.DEBUG, var8);
      if ((Boolean)this.disableAfterDisconnecting.getValue()) {
         this.toggle();
         this.f5108 = this.f5091 = -1.0;
      }

      if ((Boolean)this.disableAutoreconnect.getValue()) {
         AutoReconnect.f3087.setToggled(false);
      }
   }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5118[var4] != null) {
         return var4;
      } else {
         Object var5 = f5117[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 0;
               case 1 -> 2;
               case 2 -> 19;
               case 3 -> 6;
               case 4 -> 15;
               case 5 -> 16;
               case 6 -> 44;
               case 7 -> 4;
               case 8 -> 35;
               case 9 -> 55;
               case 10 -> 1;
               case 11 -> 59;
               case 12 -> 50;
               case 13 -> 5;
               case 14 -> 12;
               case 15 -> 33;
               case 16 -> 47;
               case 17 -> 62;
               case 18 -> 58;
               case 19 -> 60;
               case 20 -> 42;
               case 21 -> 14;
               case 22 -> 38;
               case 23 -> 17;
               case 24 -> 21;
               case 25 -> 24;
               case 26 -> 25;
               case 27 -> 53;
               case 28 -> 3;
               case 29 -> 10;
               case 30 -> 34;
               case 31 -> 41;
               case 32 -> 31;
               case 33 -> 32;
               case 34 -> 20;
               case 35 -> 61;
               case 36 -> 26;
               case 37 -> 57;
               case 38 -> 29;
               case 39 -> 43;
               case 40 -> 52;
               case 41 -> 46;
               case 42 -> 9;
               case 43 -> 8;
               case 44 -> 30;
               case 45 -> 22;
               case 46 -> 48;
               case 47 -> 37;
               case 48 -> 18;
               case 49 -> 7;
               case 50 -> 56;
               case 51 -> 63;
               case 52 -> 28;
               case 53 -> 54;
               case 54 -> 40;
               case 55 -> 23;
               case 56 -> 49;
               case 57 -> 27;
               case 58 -> 45;
               case 59 -> 11;
               case 60 -> 39;
               case 61 -> 51;
               case 62 -> 13;
               default -> 36;
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

            f5118[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f5117[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5118[var4]);
            f5117[var4] = var5;
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
      Object var5 = f5117[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5118[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f5117[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5117[var4] = var13;
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
               var12 = m180(779114852286099L, 0L);
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
      Object var5 = f5117[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5118[var4];
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
               f5117[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(779114852286099L, 0L);
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
                     f5117[var4] = var19;
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
               var23 = m180(779114852286099L, 0L);
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
         if (var8 != 'd' && var8 != 'a' && var8 != 'O' && var8 != 'h') {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'y') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 213) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'd') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'a') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'O') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoDisconnect.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ɣ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
