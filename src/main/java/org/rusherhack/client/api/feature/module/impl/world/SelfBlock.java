package org.rusherhack.client.api.feature.module.impl.world;
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
import net.minecraft.block.AbstractSkullBlock;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.LookAndOnGround;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Direction;
public class SelfBlock extends ToggleableModule {
   public BooleanSetting obsidian;
   public BlockPos f7046;
   public BooleanSetting skulls;
   public BooleanSetting only;
   public EnumSetting<SelfBlockMode> mode;
   public boolean f7050;
   public BooleanSetting enderchests;
   public BooleanSetting insidecheck;
   public long f7053;
   public BooleanSetting center;
   public BooleanSetting rotate;
   public static long f7056 = Class066.m4320(-3793501312245430109L, 3370090591042592625L, MethodHandles.lookup().lookupClass()).m4325(98384733468002L);
   public static long[] f7060;
   public static Integer[] f7061;
   public static Map f7062;
   public static long f7063;

   public int m13612() {
        return 0;
    }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public Vec3d m13613() {
      Vec3d var4 = Globals.mc.player.getPos();
      int var10000 = Class253.m9154();
      int var5 = 0;
      Vec3d var9 = var4.add(0.0, 1.0, 0.0);
      int var3 = var10000;

      label39:
      while (true) {
         for (int var10 = switch (var5) {
            case 0 -> {
               var9 = var4.add(2.5, 0.0, 0.0);
               yield var5;
            }
            case 1 -> {
               var9 = var4.add(-2.5, 0.0, 0.0);
               yield var5;
            }
            case 2 -> {
               var9 = var4.add(0.0, 0.0, 2.5);
               yield var5;
            }
            case 3 -> {
               var9 = var4.add(0.0, 0.0, -2.5);
               yield var5;
            }
            default -> var5;
         }; var10 != 3; var10 = var5) {
            var5++;
            BlockPos var7 = new BlockPos(MathHelper.floor(var9.x), MathHelper.floor(var9.y + 1.0), MathHelper.floor(var9.z));
            BlockPos var8 = new BlockPos(MathHelper.floor(var9.x), MathHelper.floor(var9.y), MathHelper.floor(var9.z)).add(0, 2, 0);
            boolean var11 = Globals.mc.world.getBlockState(var7).isFullCube(Globals.mc.world, var7);
            if (var3 == 0) {
               if (var11) {
                  continue label39;
               }

               var11 = Globals.mc.world.getBlockState(var8).isFullCube(Globals.mc.world, var8);
            }

            if (var11) {
               continue label39;
            }

            if (var3 == 0) {
               return var9;
            }

            var9 = var9.add(2.5, 0.0, 0.0);
         }

         return var9;
      }
   }

   @Override
   public void onEnable() {
      int var3 = Class253.m9154();
      if (var3 == 0) {
         if (Globals.mc.player != null) {
            BlockPos var10 = new BlockPos(Globals.mc.player.getBlockPos());
            if (Globals.mc.player.getY() % 1.0 > 0.2) {
               boolean var10003 = true;
               var10 = var10.add(0, 1, 0);
            }

            this.f7053 = System.currentTimeMillis();
            if ((Boolean)this.insidecheck.getValue() && Globals.mc.world.getBlockState(var10).isSolid()) {
               this.sendNotification(NotificationType.ERROR, "You are already inside of a block!", this.insidecheck.hashCode());
               this.toggle();
               return;
            }

            if (!Globals.mc.player.isOnGround()) {
               this.sendNotification(NotificationType.ERROR, "You must be on the ground to toggle this!");
               this.toggle();
               return;
            }

            int var5;
            if ((var5 = this.m13612()) == -1) {
               this.sendNotification(NotificationType.ERROR, "You do not have any blocks in your hotbar!");
               this.toggle();
               return;
            }

            if ((Boolean)this.center.getValue()) {
               double var6 = var10.getX() + 0.5;
               double var8 = var10.getZ() + 0.5;
               Globals.mc.player.setPosition(var6, Globals.mc.player.getY(), var8);
               ClientPlayNetworkHandler var10000 = Globals.mc.player.networkHandler;
               double var10004 = Globals.mc.player.getY();
               boolean var10008 = true;
               var10000.sendPacket(new PositionAndOnGround(var6, var10004, var8, true));
            }

            this.f7046 = var10;
            switch (this.mode.getValue().ordinal()) {
               case 0:
                  Globals.mc.player.jump();
                  this.f7050 = false;
                  return;
               case 1:
                  label44: {
                     Globals.mc
                        .player
                        .networkHandler
                        .sendPacket(new PositionAndOnGround(Globals.mc.player.getX(), Globals.mc.player.getY() + 0.42, Globals.mc.player.getZ(), false));
                     Globals.mc
                        .player
                        .networkHandler
                        .sendPacket(new PositionAndOnGround(Globals.mc.player.getX(), Globals.mc.player.getY() + 0.753, Globals.mc.player.getZ(), false));
                     Globals.mc
                        .player
                        .networkHandler
                        .sendPacket(new PositionAndOnGround(Globals.mc.player.getX(), Globals.mc.player.getY() + 1.0, Globals.mc.player.getZ(), false));
                     if ((Boolean)this.rotate.getValue()) {
                        Globals.mc
                           .player
                           .networkHandler
                           .sendPacket(
                              new Full(
                                 Globals.mc.player.getX(), Globals.mc.player.getY() + 1.16, Globals.mc.player.getZ(), Globals.mc.player.getYaw(), 90.0F, false
                              )
                           );
                        if (var3 == 0) {
                           break label44;
                        }
                     }

                     Globals.mc
                        .player
                        .networkHandler
                        .sendPacket(new PositionAndOnGround(Globals.mc.player.getX(), Globals.mc.player.getY() + 1.16, Globals.mc.player.getZ(), false));
                  }

                  Globals.mc.player.setPosition(Globals.mc.player.getX(), Globals.mc.player.getY() + 1.16, Globals.mc.player.getZ());
                  this.m13618(var5, (Boolean)this.rotate.getValue());
                  Globals.mc.player.setPosition(Globals.mc.player.getX(), Globals.mc.player.getY() - 1.16, Globals.mc.player.getZ());
               default:
                  return;
            }
         }

         this.toggle();
      }
   }

   public SelfBlock() {
      super("SelfBlock", "Glitches you inside of a block", ModuleCategory.WORLD);
      this.mode = new EnumSetting<>("Mode", SelfBlockMode.f4139);
      boolean var10019 = true;
      this.insidecheck = new BooleanSetting("InsideCheck", true);
      boolean var10018 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.center = new BooleanSetting("Center", false);
      boolean var10016 = true;
      this.only = new BooleanSetting("Only", true);
      boolean var10015 = true;
      this.obsidian = new BooleanSetting("Obsidian", true);
      boolean var10014 = true;
      this.enderchests = new BooleanSetting("EnderChests", true);
      boolean var10013 = true;
      this.skulls = new BooleanSetting("Skulls", true);
      this.f7053 = System.currentTimeMillis();
      this.f7046 = BlockPos.ORIGIN;
      this.f7050 = false;
      this.setNotifications(false);
      BooleanSetting var10000 = this.only;
      Setting[] var10001 = new Setting[]{this.obsidian, null, null};
      boolean var10005 = true;
      var10001[1] = this.enderchests;
      var10001[2] = this.skulls;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.insidecheck, null, null, null};
      var10005 = true;
      var10001[1] = this.rotate;
      var10001[2] = this.center;
      var10001[3] = this.only;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      if (var1.getPacket() instanceof PlayerPositionLookS2CPacket) {
         this.toggle();
      }
   }

   @Override
   public void onDisable() {
      this.f7050 = false;
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (System.currentTimeMillis() - this.f7053 >= f7063) {
         this.sendNotification(NotificationType.ERROR, "Timed out!");
         this.toggle();
      } else {
         if (this.mode.getValue().equals(SelfBlockMode.f4138)) {
            int var8;
            if ((var8 = this.m13612()) == -1) {
               this.sendNotification(NotificationType.INFO, "You do not have any blocks in your hotbar!");
               this.toggle();
               return;
            }

            Item var6;
            VoxelShape var7;
            if (((var6 = Globals.mc.player.playerScreenHandler.getSlot(var8).getStack().getItem()) instanceof BlockItem
                     ? (var7 = ((BlockItem)var6).getBlock().getDefaultState().getCollisionShape(Globals.mc.world, this.f7046))
                     : (var7 = VoxelShapes.fullCube()))
                  .isEmpty()
               || Globals.mc.world.isSpaceEmpty(var7.getBoundingBox().offset(this.f7046))) {
               if (!this.f7050) {
                  this.f7050 = true;
                  return;
               }

               this.m13618(var8, false);
            }
         }
      }
   }

   public void m13618(int var1, boolean var2) {
      long var3 = f7056 ^ 45913064475361L;
      Hand var6 = var1 < m175(2238, 604081545818374963L ^ var3) ? Hand.MAIN_HAND : Hand.OFF_HAND;
      int var7 = Globals.mc.player.getInventory().selectedSlot;
      if (var6 == Hand.MAIN_HAND) {
         Globals.mc.player.getInventory().selectedSlot = var1 - m175(5765, 5206713585870740746L ^ var3);
      }

      if (!var2 && (Boolean)this.rotate.getValue()) {
         Globals.mc.player.networkHandler.sendPacket(new LookAndOnGround(Globals.mc.player.getYaw(), 90.0F, Globals.mc.player.isOnGround()));
      }

      BlockPos var9 = this.f7046.down();
      BlockHitResult var12 = new BlockHitResult(Class220.m8439(var9, net.minecraft.util.math.Direction.UP), net.minecraft.util.math.Direction.UP, var9, false);
      boolean var10004 = true;
      Util416.m13459(var12, var6, true);
      Globals.mc.player.getInventory().selectedSlot = var7;
      Vec3d var10 = this.m13613();
      Globals.mc.player.networkHandler.sendPacket(new PositionAndOnGround(var10.x, var10.y, var10.z, false));
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4005;
      if (f7061[var3] == null) {
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
         long var5 = f7060[var3];
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
         Object[] var9 = (Object[])f7062.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f7062.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ї", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f7061[var3] = var15;
      }

      return f7061[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(SelfBlock.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ї" + " : " + var1 + " : " + var2.toString(), var5);
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
