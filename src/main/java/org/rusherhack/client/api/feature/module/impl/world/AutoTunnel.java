package org.rusherhack.client.api.feature.module.impl.world;
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
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.BlockState;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.client.IMixinMultiPlayerGameMode;
import org.rusherhack.client.api.accessors.entity.IMixinEntity;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.module.impl.combat.AutoTotem;
import org.rusherhack.client.api.feature.module.impl.movement.AutoWalk;
import org.rusherhack.client.api.feature.module.impl.player.AutoEat;
public class AutoTunnel extends ToggleableModule {
   public BlockPos f7612;
   public NumberSetting<Integer> width;
   public NumberSetting<Float> range;
   public Timer f7615;
   public BooleanSetting autowalk;
   public NumberSetting<Integer> height;
   public BooleanSetting rotate;
   public NumberSetting<Integer> angles;
   public Timer f7620;
   public List<BlockPos> f7621;
   public EnumSetting<AutoTunnelF7622> mode;
   public BooleanSetting whilemoving;
   public BlockPos f7624;
   public NumberSetting<Integer> delay;
   public BooleanSetting render;
   public BlockPos f7627;
   public static long f7628 = Class066.m4320(-8538253223610365215L, 404627208161645981L, MethodHandles.lookup().lookupClass()).m4325(172147138250485L);
   public static long[] f7632;
   public static Integer[] f7633;
   public static Map f7634;

   public List<BlockPos> m14799() {
        return null;
    }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      long var2 = f7628 ^ 112803606062740L;
      int var4 = Class253.m9154();
      AutoTunnel var6 = this;
      if ((Boolean)this.render.getValue() && this.f7621 != null && !this.f7621.isEmpty() && !this.mode.getValue().equals(AutoTunnelF7622.f7723)) {
         var1.getMatrixStack().push();
         var1.getRenderer().begin(var1.getMatrixStack());
         var1.getRenderer().setLineWidth(2.0F);
         Iterator var5;
         Iterator var10000 = var5 = this.f7621.iterator();

         while (true) {
            if (!var10000.hasNext()) {
               var1.getRenderer().end();
               var1.getMatrixStack().pop();
               break;
            }

            BlockPos var8 = (BlockPos)var5.next();
            if (var4 != 0) {
               break;
            }

            if (Globals.mc.world.isAir(var8)) {
               var10000 = var5;
            } else {
               int var7 = ColorUtils.transparency(var8.equals(var6.f7612) ? Color.RED : Color.CYAN, m175(16107, 6183693923985299823L ^ var2)).getRGB();
               var10000 = var5;
               IRenderer3D var10001 = var1.getRenderer();
               boolean var10006 = true;
               var10001.drawBox(var8, true, true, var7);
            }
         }
      }
   }

   public AutoTunnel() {
        super("AutoTunnel", "Automatically tunnels through blocks", ModuleCategory.WORLD);
      long var1 = f7628 ^ 21368517320754L;
      int var10000 = Class253.m9155();

      this.mode = new EnumSetting<>("Mode", AutoTunnelF7622.f7724);
      Integer var10015 = 2;
      boolean var10018 = true;
      this.height = new NumberSetting<>("Height", var10015, 1, 5);
      boolean var10016 = true;
      Integer var10014 = 1;
      boolean var10017 = true;
      this.width = new NumberSetting<>("Width", var10014, 1, 5);
      this.angles = new NumberSetting<>("Angles", 4, 4, m175(20256, 3221431309474491905L ^ var1));
      this.range = new NumberSetting<>("Range", 4.5F, 1.0F, 4.5F);
      boolean var10013 = true;
      this.delay = new NumberSetting<>("Delay", 1, 0, m175(11377, 93410838609235281L ^ var1));
      boolean var10012 = true;
      this.whilemoving = new BooleanSetting("WhileMoving", true);
      boolean var10011 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      boolean var10010 = true;
      this.render = new BooleanSetting("Render", true);
      this.autowalk = new BooleanSetting("AutoWalk", false);
      this.f7620 = new Timer();
      this.f7615 = new Timer();
      int var3 = var10000;
      if (var3 != 0) {
         if (Class170.f3353) {
            boolean var10003 = true;
            this.registerSettings(this.mode);
         }

         Setting[] var10001 = new Setting[m175(14475, 9110298423700101548L ^ var1)];
         var10001[0] = this.height;
         boolean var10005 = true;
         var10001[1] = this.width;
         var10001[2] = this.range;
         var10001[3] = this.delay;
         var10001[4] = this.whilemoving;
         var10001[5] = this.rotate;
         var10001[m175(16834, 6011803872213065958L ^ var1)] = this.render;
         var10001[m175(24843, 1701894153648357422L ^ var1)] = this.autowalk;
         this.registerSettings(var10001);
      }
   }

   public static int[] m14801(int var0) {
        return null;
    }

   @Subscribe
   public void m14802(Event301 var1) {
      if ((Boolean)this.autowalk.getValue() && !this.mode.getValue().equals(AutoTunnelF7622.f7723)) {
         var1.m10147().movementForward = 1.0F;
      }
   }

   public boolean m14803(BlockPos var1) {
      BlockState var6;
      if (!(var6 = Globals.mc.world.getBlockState(var1)).isAir() && var6.getHardness(Globals.mc.world, var1) > -1.0F) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (this.mode.getValue().equals(AutoTunnelF7622.f7723)) {
         Class342.m11091(this.height.getValue(), this.width.getValue());
      } else if (AutoEat.f2905.m6292() || AutoTotem.f3491.m7405()) {
         Globals.mc.interactionManager.cancelBlockBreaking();
         this.f7624 = this.f7627 = this.f7612 = null;
      } else if (!(Boolean)this.whilemoving.getValue() || PlayerUtils.hasHorizontalInput()) {
         this.f7621 = this.m14799();
         AutoTunnel var11;
         if (this.f7620.ticksPassed(this.delay.getValue())) {
            this.f7624 = null;
            this.f7621.sort(Comparator.comparing(Class220::m8450));
            Iterator var9 = this.f7621.iterator();

            while (true) {
               if (!var9.hasNext()) {
                  var11 = this;
                  break;
               }

               BlockPos var6;
               if (!Class220.m8437(var6 = (BlockPos)var9.next())) {
                  var11 = this;
                  this.f7624 = var6;
                  break;
               }
            }

            var11.f7620.reset();
            var11 = this;
         } else {
            if (this.f7627 != null) {
               this.f7624 = this.f7627;
            }

            var11 = this;
         }

         var11.f7612 = this.f7624;
         if (this.f7624 == null || Globals.mc.world.isAir(this.f7624)) {
            Globals.mc.interactionManager.cancelBlockBreaking();
            this.f7624 = null;
         } else if (!FastBreak.f5664.m11361(this.f7624)) {
            if ((Boolean)this.rotate.getValue()) {
               RusherHackAPI.getRotationManager().updateRotation(this.f7624);
            }

            BlockHitResult var10;
            if ((var10 = RusherHackAPI.getRotationManager().getLookRaycast(this.f7624)).getType() == Type.MISS) {
               if ((Boolean)this.rotate.getValue()) {
                  return;
               }

               net.minecraft.util.math.Direction var7 = Globals.mc.player.getHorizontalFacing().getOpposite();
               var10 = new BlockHitResult(Class220.m8439(this.f7624, var7), var7, this.f7624, false);
            }

            int var8 = ((IMixinMultiPlayerGameMode)Globals.mc.interactionManager).getDestroyDelay();
            ((IMixinMultiPlayerGameMode)Globals.mc.interactionManager).setDestroyDelay(0);
            Globals.mc.interactionManager.updateBlockBreakingProgress(this.f7624, var10.getSide());
            Globals.mc.player.swingHand(Hand.MAIN_HAND);
            ((IMixinMultiPlayerGameMode)Globals.mc.interactionManager).setDestroyDelay(var8);
            this.f7627 = this.f7624;
            this.f7624 = null;
         }
      }
   }

   @Override
   public void onEnable() {
      if (this.mode.getValue().equals(AutoTunnelF7622.f7723)) {
         Class342.m11092();
      }
   }

   @Override
   public void onDisable() {
      if (this.mode.getValue().equals(AutoTunnelF7622.f7723)) {
         Class342.m11093();
      }
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5861;
      if (f7633[var3] == null) {
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
         long var5 = f7632[var3];
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
         Object[] var9 = (Object[])f7634.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f7634.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/њ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f7633[var3] = var15;
      }

      return f7633[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoTunnel.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/њ" + " : " + var1 + " : " + var2.toString(), var5);
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
