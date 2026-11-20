package org.rusherhack.client.api.feature.module.impl.misc;
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
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.OnGroundOnly;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.system.IServerState;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Direction;
public class Lagger extends ToggleableModule {
   public EnumSetting<LaggerMode> mode;
   public NumberSetting<Integer> packets;
   public static long f2436 = Class066.m4320(4234412895777828896L, 3906459128856473496L, MethodHandles.lookup().lookupClass()).m4325(235839137234404L);
   public static long[] f2440;
   public static Integer[] f2441;
   public static Map f2442;

   public Lagger() {
        super("Lagger", "Spam servers with packets", ModuleCategory.MISC);
      long var1 = f2436 ^ 85912026373414L;

      this.mode = new EnumSetting<>("Mode", LaggerMode.f7850);
      Integer var10006 = m175(31462, 6141843369191382296L ^ var1);
      boolean var10009 = true;
      this.packets = new NumberSetting<>("Packets", var10006, 1, m175(15479, 7101434538137738122L ^ var1));
      Setting[] var10001 = new Setting[]{this.mode, null};
      boolean var10005 = true;
      var10001[1] = this.packets;
      this.registerSettings(var10001);
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   @Subscribe
   public void onQuit(EventQuit var1) {
      this.toggle();
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      long var2 = f2436 ^ 133559598919430L;
      int var4 = Class253.m9154();
      Lagger var20 = this;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var15;
      int var16;
      switch (this.mode.getValue().ordinal()) {
         case 0:
            int var47 = 0;
            boolean var49 = true;

            for (int var19 = 0; var47 < var20.packets.getValue(); var47 = var19) {
               var19++;
               Globals.mc
                  .player
                  .networkHandler
                  .sendPacket(new PlayerActionC2SPacket(Action.SWAP_ITEM_WITH_OFFHAND, BlockPos.ORIGIN, net.minecraft.util.math.Direction.DOWN));
            }
            break;
         case 1:
            RecipeEntry var18 = ExtraCraft.f7996.f8002.get("gold_ingot");
            RecipeEntry var24 = ExtraCraft.f7996.f8002.get("iron_ingot");

            int var28;
            for (int var46 = var28 = 0; var46 < var20.packets.getValue(); var46 = ++var28) {
               if (Globals.mc.player.age % 2 == 0 && var18 != null) {
                  boolean var65 = true;
                  Globals.mc.player.networkHandler.sendPacket(new CraftRequestC2SPacket(0, var18, true));
                  if (var4 == 0) {
                     continue;
                  }
               }

               if (var24 != null) {
                  boolean var66 = true;
                  Globals.mc.player.networkHandler.sendPacket(new CraftRequestC2SPacket(0, var24, true));
               }
            }
            break;
         case 2:
            double var10002 = Globals.mc.player.getX();
            double var56 = Globals.mc.player.getY();
            double var58 = Globals.mc.player.getZ();
            boolean var10007 = true;
            PositionAndOnGround var17 = new PositionAndOnGround(var10002, var56, var58, true);
            var10002 = Globals.mc.player.getX();
            var56 = Globals.mc.player.getY() + 1.0E-9;
            var58 = Globals.mc.player.getZ();
            var10007 = true;
            PositionAndOnGround var23 = new PositionAndOnGround(var10002, var56, var58, true);

            int var27;
            for (int var45 = var27 = 0; var45 < var20.packets.getValue() / 2; var45 = var27) {
               Globals.mc.player.networkHandler.sendPacket(var17);
               var27++;
               Globals.mc.player.networkHandler.sendPacket(var23);
            }
            break;
         case 3:
            for (int var44 = var16 = 0; var44 < var20.packets.getValue(); var44 = var16) {
               var16++;
               Globals.mc.player.networkHandler.sendPacket(new HandSwingC2SPacket(Hand.MAIN_HAND));
            }
            break;
         case 4:
            for (int var39 = var15 = 0; var39 < var20.packets.getValue(); var39 = ++var15) {
               int var21;
               for (var39 = var21 = m175(26636, 2142589334109060560L ^ var2); var39 <= m175(24236, 2054715646277733235L ^ var2); var39 = ++var21) {
                  ItemStack var25;
                  if ((var25 = Globals.mc.player.playerScreenHandler.getSlot(var21).getStack()) != ItemStack.EMPTY && var25.getItem() instanceof ArmorItem) {
                     var39 = var25.getCount();
                     boolean var52 = true;
                     if (var39 == 1) {
                        var52 = true;
                        InventoryUtils.clickSlot(var21, true);
                     }
                  }
               }

               for (var39 = var21 = 5; var39 <= m175(23470, 3928188108057398901L ^ var2); var39 = ++var21) {
                  ItemStack var26;
                  if ((var26 = Globals.mc.player.playerScreenHandler.getSlot(var21).getStack()) != ItemStack.EMPTY && var26.getItem() instanceof ArmorItem) {
                     var39 = var26.getCount();
                     boolean var54 = true;
                     if (var39 == 1) {
                        var54 = true;
                        InventoryUtils.clickSlot(var21, true);
                     }
                  }
               }
            }
            break;
         case 5:
            String var14 = "RUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACK";

            int var5;
            for (int var37 = var5 = 0; var37 < var20.packets.getValue(); var37 = ++var5) {
               Iterator var6 = WorldUtils.getBlockEntities(false).iterator();

               while (var6.hasNext()) {
                  BlockEntity var7;
                  if ((var7 = (BlockEntity)var6.next()) instanceof SignBlockEntity) {
                     SignBlockEntity var29 = (SignBlockEntity)var7;
                     ClientPlayNetworkHandler var38 = Globals.mc.player.networkHandler;
                     BlockPos var51 = var29.getPos();
                     boolean var63 = true;
                     var38.sendPacket(
                        new UpdateSignC2SPacket(
                           var51,
                           true,
                           "RUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACK",
                           "RUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACK",
                           "RUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACK",
                           "RUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACKRUSHERHACK"
                        )
                     );
                     if (var4 != 0) {
                        break;
                     }
                  }
               }
            }
            break;
         case 6:
            for (int var36 = var13 = 0; var36 < var20.packets.getValue() / 4; var36 = var13) {
               Globals.mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(2));
               boolean var60 = true;
               Globals.mc.player.networkHandler.sendPacket(new OnGroundOnly(true));
               Globals.mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(2));
               var60 = true;
               var13++;
               Globals.mc.player.networkHandler.sendPacket(new OnGroundOnly(true));
            }
         case 7:
         default:
            break;
         case 8:
            for (int var34 = var12 = 0; var34 < var20.packets.getValue(); var34 = var12) {
               ClientPlayNetworkHandler var35 = Globals.mc.player.networkHandler;
               Hand var50 = Hand.MAIN_HAND;
               float var10005 = RusherHackAPI.getServerState().getPlayerYaw();
               IServerState var62 = RusherHackAPI.getServerState();
               var12++;
               var35.sendPacket(new PlayerInteractItemC2SPacket(var50, 0, var10005, var62.getPlayerPitch()));
            }
            break;
         case 9:
            for (int var33 = var11 = 0; var33 < var20.packets.getValue(); var33 = var11) {
               Globals.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(Globals.mc.player, Mode.START_SPRINTING));
               var11++;
               Globals.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(Globals.mc.player, Mode.STOP_SPRINTING));
            }
            break;
         case 10:
            for (int var31 = var10 = 0; var31 < var20.packets.getValue(); var31 = var10) {
               Globals.mc
                  .player
                  .networkHandler
                  .sendPacket(new PlayerActionC2SPacket(Action.START_DESTROY_BLOCK, Globals.mc.player.getBlockPos(), net.minecraft.util.math.Direction.DOWN));
               ClientPlayNetworkHandler var32 = Globals.mc.player.networkHandler;
               Action var10003 = Action.STOP_DESTROY_BLOCK;
               BlockPos var10004 = Globals.mc.player.getBlockPos();
               var10++;
               var32.sendPacket(new PlayerActionC2SPacket(var10003, var10004, net.minecraft.util.math.Direction.DOWN));
            }
            break;
         case 11:
            for (int var30 = var9 = 0; var30 < var20.packets.getValue(); var30 = var9) {
               var9++;
               Globals.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(Globals.mc.player, Mode.START_FALL_FLYING));
            }
            break;
         case 12:
            for (int var10000 = var8 = 0; var10000 < var20.packets.getValue(); var10000 = var8) {
               boolean var10006 = true;
               var8++;
               Globals.mc.player.networkHandler.sendPacket(new BoatPaddleStateC2SPacket(true, true));
            }
      }
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22655;
      if (f2441[var3] == null) {
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
         long var5 = f2440[var3];
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
         Object[] var9 = (Object[])f2442.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f2442.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ú", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f2441[var3] = var15;
      }

      return f2441[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Lagger.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ú" + " : " + var1 + " : " + var2.toString(), var5);
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
