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
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.data.DataTracker.SerializedEntry;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventTimerSpeed;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.world.Avoid;
public class ElytraFly2b2t extends ToggleableModule {
   public NumberSetting<Double> speed;
   public NumberSetting<Float> activespeed;
   public NumberSetting<Double> speedboost;
   public BooleanSetting autoredeploy;
   public BooleanSetting takeoff;
   public boolean f6478;
   public NumberSetting<Float> timer;
   public double f6480;
   public Timer f6481;
   public BooleanSetting descending;
   public float f6483;
   public Timer f6484;
   public BooleanSetting resetspeedrubberband;
   public BooleanSetting usetimer;
   public Timer f6487;
   public BooleanSetting wait;
   public NumberSetting<Float> f6489;
   public long f6490;
   public BooleanSetting cancelmotionrubberband;
   public NumberSetting<Double> boostdelay;
   public NumberSetting<Double> delay;
   public static long f6494 = Class066.m4320(-7963546326196384210L, 2636628464256254390L, MethodHandles.lookup().lookupClass()).m4325(165323574490317L);
   public static long[] f6498;
   public static Integer[] f6499;
   public static Map f6500;
   public static long[] f6501;
   public static Long[] f6502;
   public static Map f6503;

   @Subscribe(
      stage = Stage.ALL
   )
   public void onReceive(EventPacket$Receive var1) {
      long var2;
      EventPacket$Receive var17;
      label58: {
         var2 = f6494 ^ 7911074139268L;
         Packet var6;
         if (var1.getStage().equals(Stage.POST) && (var6 = var1.getPacket()) instanceof EntityTrackerUpdateS2CPacket) {
            EntityTrackerUpdateS2CPacket var5 = (EntityTrackerUpdateS2CPacket)var6;
            Entity var13;
            if ((var13 = Globals.mc.world.getEntityById(var5.id())) != null && var13.equals(Globals.mc.player)) {
               Iterator var7 = var5.trackedValues().iterator();

               while (var7.hasNext()) {
                  SerializedEntry var8;
                  Object var9;
                  if ((var8 = (SerializedEntry)var7.next()).id() == 0 && (var9 = var8.value()) instanceof Byte) {
                     Byte var16 = (Byte)var9;
                     boolean var10001;
                     if ((var16 & m175(22306, 450195271443216027L ^ var2)) != 0) {
                        var10001 = true;
                        boolean var10003 = true;
                     } else {
                        var10001 = false;
                        boolean var18 = true;
                     }

                     this.m12742(var10001);
                     var17 = var1;
                     break label58;
                  }
               }
            }
         }

         var17 = var1;
      }

      Packet var14;
      if ((var14 = var17.getPacket()) instanceof PlayerPositionLookS2CPacket) {
         PlayerPositionLookS2CPacket var12 = (PlayerPositionLookS2CPacket)var14;
         if (var1.getStage().equals(Stage.PRE)) {
            if (Globals.mc.player.isFallFlying() || System.currentTimeMillis() - this.f6490 <= m4692(14733, 5584914089262427347L ^ var2)) {
               this.f6490 = System.currentTimeMillis();
            }

            ChatUtils.print(System.currentTimeMillis() + " rubberband");
            return;
         }
      }
   }

   public boolean m12741() {
      if (Globals.mc.player.getAbilities().flying) {
         return false;
      } else if (Globals.mc.player.isOnGround()) {
         return false;
      } else {
         ItemStack var7 = Globals.mc.player.getEquippedStack(EquipmentSlot.CHEST);
         boolean var10000;
         if (!Globals.mc.player.isOnGround()
            && !Globals.mc.player.hasVehicle()
            && !Globals.mc.player.isClimbing()
            && !Globals.mc.player.isTouchingWater()
            && !Globals.mc.player.isInLava()) {
            var10000 = true;
            boolean var9 = true;
         } else {
            var10000 = false;
            boolean var10002 = true;
         }

         boolean var5 = var10000;
         if (var7.isOf(Items.ELYTRA) && ElytraItem.isUsable(var7)) {
            var10000 = true;
            boolean var11 = true;
         } else {
            var10000 = false;
            boolean var10 = true;
         }

         boolean var6 = var10000;
         if (var5 && var6) {
            boolean var12 = true;
            return true;
         } else {
            return false;
         }
      }
   }

   public ElytraFly2b2t() {
        super("ElytraFly2b2t", "ElytraFly specifically optimized for 2b2t.org", ModuleCategory.MOVEMENT);
      long var1 = f6494 ^ 34645635147837L;

      boolean var10030 = true;
      this.takeoff = new BooleanSetting("TakeOff", true);
      boolean var10029 = true;
      this.descending = new BooleanSetting("Descending", true);
      this.timer = new NumberSetting<>("Timer", 1.0F, 0.05F, 1.0F).incremental(0.05F);
      boolean var10027 = true;
      this.autoredeploy = new BooleanSetting("AutoRedeploy", true);
      this.wait = new BooleanSetting("Wait", false);
      this.f6489 = new NumberSetting<>("Timer", 0.1F, 0.05F, 1.0F).incremental(0.05F);
      this.delay = new NumberSetting<>("Delay", 0.5, 0.05, 2.0);
      boolean var10023 = true;
      this.usetimer = new BooleanSetting("UseTimer", true);
      this.activespeed = new NumberSetting<>("ActiveSpeed", 1.0F, 0.1F, 1.0F);
      boolean var10021 = true;
      this.resetspeedrubberband = new BooleanSetting("ResetSpeedRubberband", true);
      boolean var10020 = true;
      this.cancelmotionrubberband = new BooleanSetting("CancelMotionRubberband", true);
      this.speed = new NumberSetting<>("Speed", 6.0, 0.1, 10.0).incremental(0.1);
      this.speedboost = new NumberSetting<>("SpeedBoost", 0.03, 0.01, 0.1);
      this.boostdelay = new NumberSetting<>("BoostDelay", 1.5, 0.1, 2.0).incremental(0.1);
      this.f6490 = System.currentTimeMillis();
      this.f6487 = new Timer();
      this.f6484 = new Timer();
      this.f6481 = new Timer();
      this.f6480 = 0.0;
      this.f6483 = 1.0F;
      this.f6478 = false;
      BooleanSetting var10000 = this.takeoff;
      Setting[] var10001 = new Setting[]{this.descending, null};
      boolean var10005 = true;
      var10001[1] = this.timer;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.usetimer.addSubSettings(this.activespeed);
      var10000 = this.autoredeploy;
      var10001 = new Setting[]{this.wait, null, null};
      var10005 = true;
      var10001[1] = this.f6489;
      var10001[2] = this.delay;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[m175(3103, 8798413040586000670L ^ var1)];
      var10001[0] = this.takeoff;
      var10005 = true;
      var10001[1] = this.autoredeploy;
      var10001[2] = this.usetimer;
      var10001[3] = this.resetspeedrubberband;
      var10001[4] = this.cancelmotionrubberband;
      var10001[5] = this.speed;
      var10001[m175(26576, 2010995519128003282L ^ var1)] = this.speedboost;
      var10001[m175(10165, 2902490703948718774L ^ var1)] = this.boostdelay;
      this.registerSettings(var10001);
   }

   public void m12742(boolean var1) {
      ElytraFly2b2t var9;
      label25: {
         label27: {
            int var7 = Class253.m9155();
            ChatUtils.print(System.currentTimeMillis() + " set elytra state " + var1);
            int var4 = var7;
            boolean var8 = var1;
            if (var4 != 0) {
               if (var1) {
                  this.f6483 = this.activespeed.getValue();
                  var9 = this;
                  break label25;
               }

               var9 = this;
               if (var4 == 0) {
                  break label27;
               }

               var8 = this.f6484.passed(1000.0);
            }

            if (var8) {
               ChatUtils.print("You were flying for " + this.f6484.getTime() + "ms");
            }

            var9 = this;
         }

         var9.f6484.reset();
         var9.f6487.reset();
      }

      var9.f6478 = var1;
   }

   @Subscribe(
      stage = Stage.ALL
   )
   public void onMove(EventMove var1) {
      long var2 = f6494 ^ 66765244651856L;
      if (var1.getStage().equals(Stage.PRE)) {
         if (!this.m12741()) {
            this.f6483 = 1.0F;
            this.f6480 = 0.0;
            this.f6487.reset();
            this.f6484.reset();
         } else {
            long var5 = System.currentTimeMillis() - this.f6490;
            boolean var7 = false;
            boolean var16;
            if (!Globals.mc.player.isFallFlying()) {
               if ((Boolean)this.autoredeploy.getValue() && var5 < m4692(14950, 4305634661643352815L ^ var2)) {
                  var16 = true;
                  boolean var17 = true;
               } else {
                  var16 = false;
                  boolean var10002 = true;
               }

               boolean var8 = var16;
               boolean var9 = (Boolean)this.takeoff.getValue();
               if (var8) {
                  if (this.m12744()) {
                     ChatUtils.print(System.currentTimeMillis() + " sent redeploy");
                     this.f6484.reset();
                  }

                  var1.setY(0.0);
                  var16 = var7 = true;
               } else {
                  if (!var9) {
                     this.f6483 = 1.0F;
                     return;
                  }

                  if (!this.m12746(var1.getY())) {
                     this.f6487.reset();
                     ChatUtils.print("reset speed 2");
                     this.f6480 = 0.0;
                     return;
                  }

                  ChatUtils.print(System.currentTimeMillis() + " take off " + var1.getY());
                  var16 = true;
                  var1.setY(0.0);
                  var7 = true;
               }
            } else {
               var16 = var7;
            }

            if (!var16) {
               this.f6483 = this.activespeed.getValue();
               this.f6481.reset();
            }

            if ((Boolean)this.wait.getValue() && !this.f6478 && System.currentTimeMillis() - this.f6490 < m4692(14950, 4305634661643352815L ^ var2)) {
               ChatUtils.print("test1");
               boolean var18 = true;
               var1.setCancelled(true);
            } else {
               var1.setMotion(Vec3d.ZERO);
               double var13 = Math.min(this.speed.getValue(), 3.75);
               if ((Boolean)this.cancelmotionrubberband.getValue()
                  && Globals.mc.player.isFallFlying()
                  && this.f6484.passed(1000.0)
                  && System.currentTimeMillis() - this.f6490 < m4692(19672, 8493689515711597653L ^ var2)) {
                  ChatUtils.print("cancelled move event");
                  boolean var10003 = true;
                  var1.setCancelled(true);
               } else {
                  if ((Boolean)this.resetspeedrubberband.getValue()
                     && Globals.mc.player.isFallFlying()
                     && System.currentTimeMillis() - this.f6490 >= m4692(14268, 4964869205509306167L ^ var2)
                     && System.currentTimeMillis() - this.f6490 <= m4692(25991, 8153203891574449417L ^ var2)) {
                     this.f6480 = 0.0;
                     ChatUtils.print("reset speed 1");
                  }

                  double var12 = var13;
                  if (this.f6480 > var13) {
                     var12 = this.f6480;
                  }

                  if (this.f6487.passed(this.boostdelay.getValue() * 1000.0)
                     && PlayerUtils.hasHorizontalInput()
                     && (!Avoid.f6965.isToggled() || !Avoid.f6965.f6963)) {
                     var12 += this.speedboost.getValue();
                  }

                  if (var12 > this.speed.getValue()) {
                     var12 = this.speed.getValue();
                  }

                  double[] var14;
                  double[] var10001 = var14 = PlayerUtils.getDirectionalSpeed(var12);
                  var1.setX(var14[0]);
                  var1.setZ(var10001[1]);
                  Globals.mc.player.setVelocity(var1.getMotion());
                  ChatUtils.print(System.currentTimeMillis() + " fly speed " + var12);
                  if (!var7) {
                     this.f6480 = var12;
                  }
               }
            }
         }
      }
   }

   public boolean m12744() {
      int var10000 = Class253.m9155();
      this.f6483 = this.f6489.getValue();
      int var3 = var10000;
      boolean var4 = this.f6481.passed(this.delay.getValue() * 1000.0);
      if (var3 != 0) {
         if (var4) {
            var4 = Globals.mc.player.checkFallFlying();
            if (var3 == 0) {
               return var4;
            }

            if (var4) {
               Globals.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(Globals.mc.player, Mode.START_FALL_FLYING));
               boolean var10002 = true;
               return true;
            }
         }

         ChatUtils.print(System.currentTimeMillis() + " redeploy waiting for delay");
         var4 = false;
      }

      return var4;
   }

   @Subscribe
   public void onTimerSpeed(EventTimerSpeed var1) {
      if ((Boolean)this.usetimer.getValue()) {
         var1.setSpeed(this.f6483);
      }
   }

   public boolean m12746(double var1) {
      long var3 = f6494 ^ 78532714854347L;
      if (!Globals.mc.options.jumpKey.isPressed() && System.currentTimeMillis() - this.f6490 > m4692(19672, 8493751826759393998L ^ var3)) {
         return false;
      } else if ((Boolean)this.descending.getValue() && var1 >= -0.08) {
         if (var1 < 0.1) {
            this.f6483 = this.timer.getValue();
         }

         return false;
      } else {
         this.f6483 = this.timer.getValue();
         if (Globals.mc.player.checkFallFlying()) {
            Globals.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(Globals.mc.player, Mode.START_FALL_FLYING));
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public void onEnable() {
      this.f6487.reset();
      this.f6481.reset();
      this.f6484.reset();
      this.f6483 = 1.0F;
      this.f6478 = Globals.mc.player.isFallFlying();
   }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      long var2 = f6494 ^ 103168907594529L;
      if (this.m12741() && !Globals.mc.player.isOnGround()) {
         if ((Boolean)this.wait.getValue() && !this.f6478 && System.currentTimeMillis() - this.f6490 < m4692(27968, 4881723604217380797L ^ var2)) {
            ChatUtils.print("test2");
            boolean var7 = true;
            var1.setCancelled(true);
         } else if ((Boolean)this.cancelmotionrubberband.getValue()
            && this.f6484.passed(1000.0)
            && System.currentTimeMillis() - this.f6490 < m4692(29746, 1675243465130354379L ^ var2)) {
            ChatUtils.print("cancelled player update event");
            boolean var10003 = true;
            var1.setCancelled(true);
         } else {
            float var6 = -2.0F;
            EventPlayerUpdate var10000;
            if (this.f6480 >= 11.0) {
               var6 = -1.0F;
               var10000 = var1;
            } else if (this.f6480 >= 8.3) {
               var6 = -1.3F;
               var10000 = var1;
            } else {
               if (this.f6480 >= 5.8) {
                  var6 = -1.5F;
               }

               var10000 = var1;
            }

            var10000.setPitch(var6);
         }
      }
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13316;
      if (f6499[var3] == null) {
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
         long var5 = f6498[var3];
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
         Object[] var9 = (Object[])f6500.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f6500.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ϑ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f6499[var3] = var15;
      }

      return f6499[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ElytraFly2b2t.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ϑ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static long m4692(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 226;
      if (f6502[var3] == null) {
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
         long var5 = f6501[var3];
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
         Object[] var9 = (Object[])f6503.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f6503.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ϑ", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         f6502[var3] = var15;
      }

      return f6502[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ElytraFly2b2t.class, "m4693", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ϑ" + " : " + var1 + " : " + var2.toString(), var5);
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
