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
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShapes;
import org.jetbrains.annotations.Nullable;
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
import org.rusherhack.client.api.feature.module.impl.render.HoleESP;
public class AutoWeb extends ToggleableModule {
   public BooleanSetting automaticallySwapsToObsidian;
   public NumberSetting<Float> range;
   public EnumSetting<AutoWebRotationTimingMethodUsedForPlacements> rotationTimingMethodUsedForPlacements;
   public int f5890;
   public BlockPos f5891;
   public EnumSetting<AutoWebTarget> target;
   public BooleanSetting render;
   public List<BlockPos> f5894;
   public BooleanSetting returnsToThePreviousItemYouWereHolding;
   public NumberSetting<Float> speed;
   public BooleanSetting strictdir;
   public BlockHitResult f5898;
   public NumberSetting<Integer> height;
   public BooleanSetting swapServerSideOnly;
   public NumberSetting<Float> webdistance;
   public BooleanSetting rotate;
   public Timer f5903;
   public NumberSetting<Integer> delay;
   public BooleanSetting ignoreownhole;
   public ColorSetting color;
   public BooleanSetting raytrace;
   public EnumSetting<AutoWebMode> mode;
   public static long f5909 = Class066.m4320(-7093780512869769619L, -7847041476701488920L, MethodHandles.lookup().lookupClass()).m4325(239929123939022L);
   public static long[] f5913;
   public static Integer[] f5914;
   public static Map f5915;

   @Nullable
   public PlayerEntity m11774() {
      if (this.target.getValue() == AutoWebTarget.f9454) {
         return Globals.mc.player;
      } else {
         Iterator var4 = WorldUtils.getEntitiesSorted(Globals.mc.player).iterator();

         while (var4.hasNext()) {
            Entity var6;
            PlayerEntity var7;
            if ((var6 = (Entity)var4.next()) instanceof PlayerEntity
               && !(var7 = (PlayerEntity)var6).equals(Globals.mc.player)
               && !RusherHackAPI.getRelationManager().isFriend(var7.getName().getString())) {
               return var7;
            }
         }

         return null;
      }
   }

   public void m11775(BlockHitResult var1, int var2) {
      long var3 = f5909 ^ 29893372518720L;
      if (RusherHackAPI.getRotationManager().isLookingAt(var1) && this.f5903.ticksPassed(this.delay.getValue())) {
         Hand var7 = var2 < m175(29528, 5310664338125156736L ^ var3) ? Hand.MAIN_HAND : Hand.OFF_HAND;
         if (this.f5890 == -1 || (Boolean)this.swapServerSideOnly.getValue()) {
            this.f5890 = Globals.mc.player.getInventory().selectedSlot;
         }

         if (var7 == Hand.MAIN_HAND) {
            Globals.mc.player.getInventory().selectedSlot = var2 - m175(30636, 6576156550903854457L ^ var3);
         }

         boolean var10004 = true;
         Util416.m13459(var1, var7, true);
         this.f5903.reset();
         if ((Boolean)this.swapServerSideOnly.getValue()) {
            Globals.mc.player.getInventory().selectedSlot = this.f5890;
            this.f5890 = -1;
         }
      }
   }

   public List<BlockPos> m11777() {
        return null;
    }

   @Override
   public void onEnable() {
      this.f5894.clear();
      this.f5891 = null;
      this.f5890 = -1;
   }

   public AutoWeb() {
        super("AutoWeb", "<\b\t\u0012\u0010\u001c\t\u0014\u001e\u001cA\u0006ly places web", ModuleCategory.COMBAT);
      long var1 = f5909 ^ 111857492305532L;

      this.mode = new EnumSetting<>("Mode", AutoWebMode.f2773);
      this.target = new EnumSetting<>("Target", AutoWebTarget.f9455);
      this.webdistance = new NumberSetting<>("WebDistance", 2.5F, 1.0F, 6.0F).setVisibility(() -> {
         if (this.target.getValue() == AutoWebTarget.f9455) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10005 = true;
      this.ignoreownhole = new BooleanSetting("IgnoreOwnHole", true).setVisibility(() -> {
         if (this.target.getValue() == AutoWebTarget.f9455) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      var10005 = true;
      Integer var10003 = 1;
      boolean var10006 = true;
      this.height = new NumberSetting<>("Height", var10003, 1, 3).setVisibility(() -> {
         if (this.target.getValue() != AutoWebTarget.f9455) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.range = new NumberSetting<>("Range", 4.5F, 1.0F, 6.0F);
      this.delay = new NumberSetting<>("Delay", 0, 0, m175(2164, 1375830294483733905L ^ var1));
      boolean var10013 = true;
      this.strictdir = new BooleanSetting("StrictDir", true);
      this.raytrace = new BooleanSetting("Raytrace", false);
      boolean var10011 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.speed = new NumberSetting<>("Speed", 180.0F, 20.0F, 180.0F).incremental(1.0);
      this.rotationTimingMethodUsedForPlacements = new EnumSetting<>("Timing", "Rotation timing method used for placements", AutoWebRotationTimingMethodUsedForPlacements.f4622);
      boolean var10009 = true;
      this.automaticallySwapsToObsidian = new BooleanSetting("Swap", "Automatically swaps to obsidian", true);
      boolean var10008 = true;
      this.swapServerSideOnly = new BooleanSetting("Silent", "Swap server side only", true);
      boolean var10007 = true;
      this.returnsToThePreviousItemYouWereHolding = new BooleanSetting("Return", "Returns to the previous item you were holding", true).setVisibility(() -> {
         if (!(Boolean)this.swapServerSideOnly.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      var10011 = true;
      this.render = new BooleanSetting("Render", true);
      ColorSetting var8 = new ColorSetting("Color", ColorUtils.transparency(Color.CYAN, m175(6742, 2645037647987285944L ^ var1)));
      var10008 = true;
      this.color = var8.setThemeSync(true);
      this.f5903 = new Timer();
      this.f5890 = -1;
      BooleanSetting var10000 = this.automaticallySwapsToObsidian;
      Setting[] var10001 = new Setting[]{this.swapServerSideOnly, null};
      var10005 = true;
      var10001[1] = this.returnsToThePreviousItemYouWereHolding;
      var10000.addSubSettings(var10001);
      var10000 = this.rotate;
      var10001 = new Setting[]{this.speed, null};
      var10005 = true;
      var10001[1] = this.rotationTimingMethodUsedForPlacements;
      var10000.addSubSettings(var10001);
      boolean var6 = true;
      this.render.addSubSettings(this.color);
      var10001 = new Setting[m175(19204, 2686280753828744933L ^ var1)];
      var10001[0] = this.mode;
      var10005 = true;
      var10001[1] = this.target;
      var10001[2] = this.webdistance;
      var10001[3] = this.ignoreownhole;
      var10001[4] = this.height;
      var10001[5] = this.range;
      var10001[m175(11346, 743171786449365428L ^ var1)] = this.delay;
      var10001[m175(19172, 667119264415829774L ^ var1)] = this.strictdir;
      var10001[m175(24169, 2764341949823474562L ^ var1)] = this.raytrace;
      var10001[m175(170, 4393104196817093957L ^ var1)] = this.rotate;
      var10001[m175(21561, 4208386048002380254L ^ var1)] = this.automaticallySwapsToObsidian;
      var10001[m175(9146, 5259444546063378007L ^ var1)] = this.render;
      this.registerSettings(var10001);
   }

   @Override
   public void onDisable() {
      if (Globals.mc.player != null && (Boolean)this.returnsToThePreviousItemYouWereHolding.getValue() && this.f5890 != -1) {
         Globals.mc.player.getInventory().selectedSlot = this.f5890;
      }
   }

   @Subscribe(
      stage = Stage.POST
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      long var2 = f5909 ^ 78757444875244L;
      if (this.rotationTimingMethodUsedForPlacements.getValue() == AutoWebRotationTimingMethodUsedForPlacements.f4623 && this.f5898 != null) {
         boolean var10004 = true;
         int var4;
         if ((var4 = InventoryUtils.findItem(Items.COBWEB, true, true)) < m175(4117, 7660623136068321389L ^ var2)
            || !(Boolean)this.automaticallySwapsToObsidian.getValue()
               && var4 != Globals.mc.player.getInventory().selectedSlot
               && var4 != m175(16611, 4817561753057595551L ^ var2)) {
            return;
         }

         this.m11775(this.f5898, var4);
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      long var2 = f5909 ^ 120864021058673L;
      int var4 = Class253.m9154();
      AutoWeb var8 = this;
      boolean var10004 = true;
      int var7;
      if ((var7 = InventoryUtils.findItem(Items.COBWEB, true, true)) < m175(4117, 7660669602857297904L ^ var2)) {
         if (this.mode.getValue() == AutoWebMode.f2772) {
            this.sendNotification(NotificationType.ERROR, "You have no webs in your hotbar!");
            this.toggle();
         }
      } else if (!(Boolean)this.automaticallySwapsToObsidian.getValue()
         && var7 != Globals.mc.player.getInventory().selectedSlot
         && var7 != m175(16611, 4817515343311107842L ^ var2)) {
         if (this.mode.getValue() == AutoWebMode.f2772) {
            this.sendNotification(NotificationType.ERROR, "You are not holding a web!");
            this.toggle();
         }
      } else {
         this.f5894 = this.m11777();
         this.f5898 = null;
         if (var4 == 0) {
            if (!AutoTotem.f3491.m7405() && !AutoSurround.f7212.m13915() && !AutoEat.f2905.m6292()) {
               Iterator var5 = this.f5894.iterator();

               AutoWeb var10000;
               while (true) {
                  if (var5.hasNext()) {
                     BlockPos var6;
                     var8.f5898 = Util416.m13457(
                        var6 = (BlockPos)var5.next(),
                        VoxelShapes.empty(),
                        (Boolean)var8.strictdir.getValue(),
                        (Boolean)var8.raytrace.getValue(),
                        var8.range.getValue().floatValue()
                     );
                     if (var8.f5898 == null) {
                        continue;
                     }

                     var10000 = var8;
                     var8.f5891 = var6;
                     break;
                  }

                  var10000 = var8;
                  break;
               }

               if (var10000.f5898 == null) {
                  if ((Boolean)var8.returnsToThePreviousItemYouWereHolding.getValue() && var8.f5890 != -1) {
                     Globals.mc.player.getInventory().selectedSlot = var8.f5890;
                     var8.f5890 = -1;
                  }

                  if (var8.mode.getValue() == AutoWebMode.f2772) {
                     var8.toggle();
                  }

                  var8.f5891 = null;
                  return;
               }

               if ((Boolean)var8.rotate.getValue()) {
                  RusherHackAPI.getRotationManager().updateRotation(var8.f5898, var8.speed.getValue());
               }

               if (var8.rotationTimingMethodUsedForPlacements.getValue() == AutoWebRotationTimingMethodUsedForPlacements.f4622) {
                  var8.m11775(var8.f5898, var7);
               }

               return;
            }

            this.f5891 = null;
         }
      }
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      int var4 = Class253.m9155();
      AutoWeb var9 = this;
      if ((Boolean)this.render.getValue() && this.f5891 != null) {
         IRenderer3D var5 = var1.getRenderer();
         var5.begin(var1.getMatrixStack());
         Iterator var8;
         Iterator var10 = var8 = this.f5894.iterator();

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
            boolean var10003 = var6.equals(var9.f5891);
            boolean var10006 = true;
            var5.drawBox(var6, var10003, true, var9.color.getValueRGB());
         }
      }
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20846;
      if (f5914[var3] == null) {
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
         long var5 = f5913[var3];
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
         Object[] var9 = (Object[])f5915.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f5915.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ͽ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f5914[var3] = var15;
      }

      return f5914[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoWeb.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ͽ" + " : " + var1 + " : " + var2.toString(), var5);
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
