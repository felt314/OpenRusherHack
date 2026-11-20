package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.Item;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockCollisionSpliterator;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.events.player.EventMove$Mount;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.client.api.system.IRotationManager;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.RotationUtils;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.bind;
import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Speed;
public class Phase extends ToggleableModule {
   public Timer f9214;
   public BindSetting keyToThrowThePearl;
   public EnumSetting<PhaseMode> mode;
   public NumberSetting<Float> speed;
   public boolean f9218;
   public boolean f9219;
   public static long f9220 = Class066.m4320(-4517061003958146998L, 7871750711817788780L, MethodHandles.lookup().lookupClass()).m4325(186329886665564L);
   public static long[] f9224;
   public static Integer[] f9225;
   public static Map f9226;

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (this.mode.getValue() != PhaseMode.f2458) {
         if (Globals.mc.player.horizontalCollision && Globals.mc.options.sprintKey.isPressed()) {
            ClientPlayNetworkHandler var10000 = Globals.mc.player.networkHandler;
            double var10003 = Globals.mc.player.getX();
            double var10004 = Globals.mc.player.getY() - 0.05;
            double var10005 = Globals.mc.player.getZ();
            boolean var10008 = true;
            var10000.sendPacket(new PositionAndOnGround(var10003, var10004, var10005, true));
            var10000 = Globals.mc.player.networkHandler;
            var10003 = Globals.mc.player.getX();
            var10004 = Globals.mc.player.getY();
            var10005 = Globals.mc.player.getZ();
            var10008 = true;
            var10000.sendPacket(new PositionAndOnGround(var10003, var10004, var10005, true));
            var10000 = Globals.mc.player.networkHandler;
            var10003 = Globals.mc.player.getX();
            var10004 = Globals.mc.player.getY() - 0.05;
            var10005 = Globals.mc.player.getZ();
            var10008 = true;
            var10000.sendPacket(new PositionAndOnGround(var10003, var10004, var10005, true));
         }

         if (this.mode.getValue() == PhaseMode.f2459) {
            double var5 = Globals.mc.player.getHorizontalFacing().getVector().getX() * 0.1;
            double var7 = Globals.mc.player.getHorizontalFacing().getVector().getZ() * 0.1;
            if (Globals.mc.player.horizontalCollision && this.f9214.passed(200.0)) {
               ClientPlayNetworkHandler var11 = Globals.mc.player.networkHandler;
               double var16 = Globals.mc.player.getX();
               double var21 = Globals.mc.player.getY() + 0.05;
               double var26 = Globals.mc.player.getZ();
               boolean var31 = true;
               var11.sendPacket(new PositionAndOnGround(var16, var21, var26, true));
               var11 = Globals.mc.player.networkHandler;
               var16 = Globals.mc.player.getX() + var5 * 4.0;
               var21 = Globals.mc.player.getY();
               var26 = Globals.mc.player.getZ() + var7 * 4.0;
               var31 = true;
               var11.sendPacket(new PositionAndOnGround(var16, var21, var26, true));
               var11 = Globals.mc.player.networkHandler;
               var16 = Globals.mc.player.getX();
               var21 = Globals.mc.player.getY();
               var26 = Globals.mc.player.getZ();
               var31 = true;
               var11.sendPacket(new PositionAndOnGround(var16, var21, var26, true));
               this.f9214.reset();
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.ALL,
      priority = -997
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
        
    }

   public SortedSet<BlockPos> m17639(Entity var1, Box var2) {
        return null;
    }

   @Subscribe
   public void m17640(Event492 var1) {
        
    }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   public Phase() {
      super("Phase", "Phase through blocks", ModuleCategory.PLAYER);
      this.mode = new EnumSetting<>("Mode", PhaseMode.f2458);
      this.speed = new NumberSetting<>("Speed", 1.0F, 0.1F, 5.0F).setVisibility(() -> {
         if (this.mode.getValue() != PhaseMode.f2458) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.keyToThrowThePearl = new BindSetting("Throw", "Key to throw the pearl", NullKey.INSTANCE).setVisibility(() -> {
         if (this.mode.getValue() == PhaseMode.f2458) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.f9214 = new Timer();
      Setting[] var10001 = new Setting[]{this.mode, null, null};
      boolean var10005 = true;
      var10001[1] = this.speed;
      var10001[2] = this.keyToThrowThePearl;
      this.registerSettings(var10001);
   }

   @Override
   public void onEnable() {
      this.f9219 = false;
   }

   @Subscribe
   public void m17644(Event390 var1) {
      if (var1.m12556() == Enum466.f7464) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Subscribe
   public void onMove(EventMove var1) {
      if (this.mode.getValue() == PhaseMode.f2461 && !this.m17639(Globals.mc.player, Globals.mc.player.getBoundingBox()).isEmpty()) {
         Globals.mc.player.noClip = true;
         this.m17649(var1);
      }
   }

   @Subscribe
   public void m17647(Event601 var1) {
      boolean var10003 = true;
      var1.setCancelled(true);
   }

   public void m17649(EventMove var1) {
      int var7 = Class253.m9154();
      var1.setY(0.0);
      int var4 = var7;
      boolean var8 = Globals.mc.isWindowFocused();
      if (var4 == 0) {
         if (!var8) {
            return;
         }

         var8 = Globals.mc.player.input.jumping;
      }

      if (var4 == 0) {
         if (var8) {
            var1.setY(this.speed.getValue() / 10.0F);
         }

         var8 = Globals.mc.player.input.sneaking;
      }

      if (var8) {
         var1.setY(-this.speed.getValue() / 10.0F);
      }
   }

   @Subscribe
   public void onMount(EventMove$Mount var1) {
      if (this.mode.getValue() == PhaseMode.f2461 && !this.m17639(var1.getEntity(), var1.getEntity().getBoundingBox()).isEmpty()) {
         var1.getEntity().noClip = true;
         this.m17649(var1);
      }
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 916;
      if (f9225[var3] == null) {
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
         long var5 = f9224[var3];
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
         Object[] var9 = (Object[])f9226.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f9226.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ծ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f9225[var3] = var15;
      }

      return f9225[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Phase.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ծ" + " : " + var1 + " : " + var2.toString(), var5);
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
