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
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.item.BowItem;
import net.minecraft.item.EggItem;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.Item;
import net.minecraft.item.SnowballItem;
import net.minecraft.item.ThrowablePotionItem;
import net.minecraft.item.TridentItem;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;

public class BowSpam extends ToggleableModule {
   public EnumSetting<BowSpamBowbomb> bowbomb;
   public NumberSetting<Integer> ticks;
   public BooleanSetting others;
   public static long f8152 = Class066.m4320(6593949736810787103L, -8217056521500844417L, MethodHandles.lookup().lookupClass()).m4325(66189484953724L);
   public static long[] f8156;
   public static Integer[] f8157;
   public static Map f8158;

   public BowSpam() {
        super("BowSpam", "Spam arrows", ModuleCategory.COMBAT);
      long var1 = f8152 ^ 32824782636142L;

      this.ticks = new NumberSetting<>("Ticks", 3, 0, m175(1218, 5681264107089813026L ^ var1));
      this.bowbomb = new EnumSetting<>("BowBomb", BowSpamBowbomb.f6119);
      this.others = new BooleanSetting("Others", false).setVisibility(() -> {
         if (this.bowbomb.getValue() != BowSpamBowbomb.f6119) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10003 = true;
      this.registerSettings(this.ticks);
   }

   @Override
   public String getMetadata() {
      return String.valueOf(this.ticks.getValue());
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      long var2 = f8152 ^ 47043567212971L;
      int var4 = Class253.m9155();
      if (this.bowbomb.getValue() != BowSpamBowbomb.f6119 && this.m15718(var1.getPacket())) {
         Globals.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(Globals.mc.player, Mode.START_SPRINTING));
         if (var4 != 0) {
            int var6;
            switch (this.bowbomb.getValue().ordinal()) {
               case 1:
                  Globals.mc
                     .player
                     .networkHandler
                     .sendPacket(new PositionAndOnGround(Globals.mc.player.getX(), Globals.mc.player.getY() - 0.0642, Globals.mc.player.getZ(), false));
                  if (var4 != 0) {
                     break;
                  }
               case 2:
                  for (int var8 = var6 = 0; var8 < m175(32100, 7172005351884208706L ^ var2); var8 = var6) {
                     Globals.mc
                        .player
                        .networkHandler
                        .sendPacket(
                           new PositionAndOnGround(
                              Globals.mc.player.getX() + new Random().nextDouble() / 10000.0,
                              Globals.mc.player.getY() + 1.0E-8,
                              Globals.mc.player.getZ() + new Random().nextDouble() / 10000.0,
                              false
                           )
                        );
                     ClientPlayNetworkHandler var9 = Globals.mc.player.networkHandler;
                     double var10003 = Globals.mc.player.getX();
                     double var10004 = Globals.mc.player.getY();
                     double var10005 = Globals.mc.player.getZ();
                     boolean var10008 = true;
                     var6++;
                     var9.sendPacket(new PositionAndOnGround(var10003, var10004, var10005, true));
                     if (var4 == 0) {
                        return;
                     }
                  }
            }

            Globals.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(Globals.mc.player, Mode.STOP_SPRINTING));
         }
      }
   }

   public boolean m15718(Packet<?> var1) {
      PlayerActionC2SPacket var5;
      if (var1 instanceof PlayerActionC2SPacket && (var5 = (PlayerActionC2SPacket)var1).getAction() == Action.RELEASE_USE_ITEM) {
         Item var8;
         if (!((var8 = Globals.mc.player.getActiveItem().getItem()) instanceof BowItem) && !(var8 instanceof TridentItem)) {
            return false;
         } else {
            boolean var10 = true;
            return true;
         }
      } else if (!(var1 instanceof PlayerInteractItemC2SPacket var9 && (Boolean)this.others.getValue())) {
         return false;
      } else {
         Item var7;
         if (!((var7 = Globals.mc.player.getStackInHand(var9.getHand()).getItem()) instanceof EggItem)
            && !(var7 instanceof SnowballItem)
            && !(var7 instanceof EnderPearlItem)
            && !(var7 instanceof ThrowablePotionItem)) {
            return false;
         } else {
            boolean var10002 = true;
            return true;
         }
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      long var2 = f8152 ^ 72994294269378L;
      if (Globals.mc.player.isUsingItem() && this.ticks.getValue() != 0) {
         Item var4;
         if ((var4 = Globals.mc.player.getActiveItem().getItem()) instanceof BowItem || var4 instanceof TridentItem) {
            int var10000 = Globals.mc.player.getItemUseTime();
            int var10001;
            BowSpam var10002;
            if (var4 instanceof BowItem) {
               var10001 = 3;
               var10002 = this;
            } else {
               var10001 = m175(382, 7104672221396507184L ^ var2);
               var10002 = this;
            }

            if (var10000 >= Math.max(var10001, var10002.ticks.getValue())) {
               Globals.mc.interactionManager.stopUsingItem(Globals.mc.player);
            }
         }
      }
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5537;
      if (f8157[var3] == null) {
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
         long var5 = f8156[var3];
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
         Object[] var9 = (Object[])f8158.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f8158.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ң", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f8157[var3] = var15;
      }

      return f8157[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(BowSpam.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ң" + " : " + var1 + " : " + var2.toString(), var5);
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
