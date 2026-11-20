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
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlimeBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinLocalPlayer;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventTimerSpeed;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.command.clear;
import org.rusherhack.command.peek;
import org.rusherhack.client.api.feature.hud.impl.Speed;
public class Step extends ToggleableModule {
   public BooleanSetting riding;
   public EnumSetting<StepMode> mode;
   public BooleanSetting upwards;
   public int f4257;
   public BooleanSetting strict;
   public BooleanSetting reverse;
   public double f4260;
   public NumberSetting<Float> f4261;
   public double[] f4262;
   public NumberSetting<Float> height;
   public BooleanSetting timer;
   public ConcurrentLinkedQueue<Packet<?>> f4265;
   public NumberSetting<Float> speed;
   public double[] f4267;
   public boolean f4268;
   public double[] f4269;
   public NumberSetting<Integer> packetrate;
   public float f4271;
   public double[] f4272;
   public static long f4273 = Class066.m4320(-1534114549024781165L, 7480255627235534552L, MethodHandles.lookup().lookupClass()).m4325(127962795124877L);
   public static long[] f4277;
   public static Integer[] f4278;
   public static Map f4279;

   public void m8778(double[] var1, double var2) {
        
    }

   @Override
   public void onDisable() {
      this.f4271 = 1.0F;
      Class428.f7111.m12376(false);
   }

   public Step() {
        super("Step", "Quickly step on blocks", ModuleCategory.MOVEMENT);
      long var1 = f4273 ^ 74600006636726L;

      boolean var10010 = true;
      this.upwards = new BooleanSetting("Upwards", true);
      this.height = new NumberSetting<>("Height", 2.0F, 1.0F, 2.5F);
      boolean var10008 = true;
      this.riding = new BooleanSetting("Riding", true);
      this.mode = new EnumSetting<>("Mode", StepMode.f1762);
      this.timer = new BooleanSetting("Timer", false).setVisibility(() -> {
         if (this.mode.getValue() == StepMode.f1762) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.packetrate = new NumberSetting<>("PacketRate", 4, 2, m175(23649, 593108298503219825L ^ var1)).setVisibility(() -> {
         if (this.mode.getValue() == StepMode.f1762) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.reverse = new BooleanSetting("Reverse", false);
      this.strict = new BooleanSetting("Strict", false);
      this.f4261 = new NumberSetting<>("Height", 10.0F, 0.0F, 10.0F).setVisibility(() -> {
         if (!(Boolean)this.strict.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.speed = new NumberSetting<>("Speed", 10.0F, 0.0F, 10.0F).setVisibility(() -> {
         if (!(Boolean)this.strict.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      int var10005 = m175(31714, 3766414777470209527L ^ var1);
      int var10007 = m175(19053, 1251705980253011070L ^ var1);
      int var10009 = m175(17141, 4088099762985202924L ^ var1);
      double[] var10011 = new double[]{0.42, 0.0, 0.0};
      boolean var10015 = true;
      var10011[1] = 0.75;
      var10011[2] = 1.0;
      this.f4262 = var10011;
      double[] var11 = new double[var10009];
      var11[0] = 0.42;
      boolean var10013 = true;
      var11[1] = 0.75;
      var11[2] = 1.0;
      var11[3] = 1.16;
      var11[4] = 1.23;
      var11[5] = 1.2;
      this.f4269 = var11;
      double[] var10 = new double[var10007];
      var10[0] = 0.42;
      boolean var13 = true;
      var10[1] = 0.78;
      var10[2] = 0.63;
      var10[3] = 0.51;
      var10[4] = 0.9;
      var10[5] = 1.21;
      var10[m175(1611, 1989939566558457945L ^ var1)] = 1.45;
      var10[m175(20214, 1076306989921564896L ^ var1)] = 1.43;
      this.f4272 = var10;
      double[] var6 = new double[var10005];
      var6[0] = 0.42;
      boolean var12 = true;
      var6[1] = 0.821;
      var6[2] = 0.699;
      var6[3] = 0.599;
      var6[4] = 1.022;
      var6[5] = 1.372;
      var6[m175(1611, 1989939566558457945L ^ var1)] = 1.652;
      var6[m175(17752, 8266701034948031311L ^ var1)] = 1.869;
      var6[m175(21522, 8059770569928368643L ^ var1)] = 2.019;
      var6[m175(17612, 411988005816824536L ^ var1)] = 1.907;
      this.f4267 = var6;
      this.f4265 = new ConcurrentLinkedQueue<>();
      this.f4271 = 1.0F;
      BooleanSetting var10000 = this.upwards;
      Setting[] var10001 = new Setting[]{this.height, null, null, null, null};
      boolean var7 = true;
      var10001[1] = this.riding;
      var10001[2] = this.mode;
      var10001[3] = this.timer;
      var10001[4] = this.packetrate;
      var10000.addSubSettings(var10001);
      var10000 = this.reverse;
      var10001 = new Setting[]{this.strict, null, null};
      var7 = true;
      var10001[1] = this.f4261;
      var10001[2] = this.speed;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.upwards, null};
      var7 = true;
      var10001[1] = this.reverse;
      this.registerSettings(var10001);
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   @Subscribe
   public void m8779(Event174 var1) {
      this.f4265.clear();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.ALL
   )
   public void m8780(Event169 var1) {
        
    }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      Packet var7;
      if ((var7 = var1.getPacket()) instanceof PlayerMoveC2SPacket) {
         PlayerMoveC2SPacket var5 = (PlayerMoveC2SPacket)var7;
         if (!this.f4265.isEmpty() && !this.f4265.contains(var5)) {
            boolean var10003 = true;
            var1.setCancelled(true);
         }
      }
   }

   @Subscribe
   public void onQuit(EventQuit var1) {
      this.f4265.clear();
   }

   @Subscribe(
      stage = Stage.ALL
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      int var4 = Class253.m9154();
      Step var5 = this;
      if (!this.f4268) {
         if (var1.getStage() == Stage.POST) {
            if (this.f4257 > 0) {
               boolean var18 = true;
               this.f4257--;
            } else {
               if ((Boolean)this.timer.getValue()) {
                  this.f4271 = 1.0F;
               }
            }
         } else {
            boolean var10003 = true;
            Class428.f7111.m12376(true);
            int var13;
            if (!this.f4265.isEmpty() && this.f4257 <= 0) {
               for (int var10000 = var13 = 0; var10000 < var5.packetrate.getValue(); var10000 = ++var13) {
                  Packet var6;
                  if ((var6 = var5.f4265.peek()) != null) {
                     Globals.mc.player.networkHandler.sendPacket(var6);
                     var5.f4265.poll();
                  }
               }
            }

            if (!Globals.mc.player.input.jumping && !Globals.mc.player.isTouchingWater() && !Globals.mc.player.isInLava() && !Globals.mc.player.isClimbing()) {
               if (!Module386.f6268.isToggled() || Module386.f6268.mode.getValue() != Enum386.f7455 && Module386.f6268.mode.getValue() != Enum386.f7460) {
                  if ((Boolean)var5.reverse.getValue() && ((IMixinLocalPlayer)Globals.mc.player).wasLastOnGround() && !Globals.mc.player.isOnGround()) {
                     Vec3d var14;
                     if ((var14 = Globals.mc.player.getVelocity()).y > 0.0) {
                        return;
                     }

                     Block var16;
                     if ((var16 = Globals.mc.world.getBlockState(Globals.mc.player.getLandingPos()).getBlock()) instanceof SlimeBlock
                        || var16 instanceof BedBlock) {
                        return;
                     }

                     double var7 = var14.x;
                     double var9 = var14.z;
                     double var11;
                     if ((var11 = Globals.mc.player.getY()) > Globals.mc.player.getY() - var5.f4261.getValue().floatValue()) {
                        if (!Globals.mc.world.isSpaceEmpty(Globals.mc.player, Globals.mc.player.getBoundingBox().stretch(0.0, var11, 0.0))
                           && var11 >= Globals.mc.player.getY() - 0.01) {
                           return;
                        }

                        if ((Boolean)var5.strict.getValue()) {
                           var5.f4268 = true;
                           ((IMixinLocalPlayer)Globals.mc.player).invokeSendPosition();
                           int var17 = 0;
                           boolean var10004 = true;
                           var1.setCancelled(true);
                           int var15 = 0;

                           while (true) {
                              if (var17 >= 2) {
                                 Globals.mc.player.setVelocity(var7, var14.y, var9);
                                 var5.f4268 = false;
                                 break;
                              }

                              Globals.mc.player.setVelocity(0.0, var14.y, 0.0);
                              var15++;
                              Globals.mc.player.tick();
                              if (var4 != 0) {
                                 break;
                              }

                              var17 = var15;
                           }

                           return;
                        }

                        Globals.mc.player.setVelocity(var7, -var5.speed.getValue(), var9);
                     }
                  }
               }
            }
         }
      }
   }

   @Subscribe
   public void onTimerSpeed(EventTimerSpeed var1) {
      if (this.f4271 != 1.0F) {
         var1.setSpeed(this.f4271);
         var1.setOverrideTimer(true);
      }
   }

   @Override
   public void onEnable() {
      this.f4265.clear();
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14029;
      if (f4278[var3] == null) {
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
         long var5 = f4277[var3];
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
         Object[] var9 = (Object[])f4279.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f4279.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ǫ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f4278[var3] = var15;
      }

      return f4278[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Step.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ǫ" + " : " + var1 + " : " + var2.toString(), var5);
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
