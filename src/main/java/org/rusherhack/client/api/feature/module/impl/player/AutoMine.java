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
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
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
import org.rusherhack.client.api.accessors.entity.IMixinEntity;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.client.api.feature.module.impl.world.FastBreak;
public class AutoMine extends ToggleableModule {
   public BooleanSetting requirepickaxe;
   public BooleanSetting strictdir;
   public EnumSetting<AutoMineMode> mode;
   public BooleanSetting raytrace;
   public BooleanSetting rotate;
   public BooleanSetting focused;
   public Entity f5952;
   public BooleanSetting switchSetting;
   public BooleanSetting throughentities;
   public BlockPos f5955;
   public Targets f5956;
   public static long f5957 = Class066.m4320(-1441683712368331563L, 8490780411064732762L, MethodHandles.lookup().lookupClass()).m4325(189999196105086L);
   public static long[] f5961;
   public static Integer[] f5962;
   public static Map f5963;

   @Override
   public void onEnable() {
      this.f5955 = null;
   }

   @Override
   public String getMetadata() {
      if (this.mode.getValue() == AutoMineMode.f3733) {
         return this.f5952 != null ? this.f5952.getName().getString() : "";
      } else {
         return this.mode.getDisplayValue();
      }
   }

   public boolean m11873(BlockPos var1) {
      if (Globals.mc.world.getBlockState(var1.down()).isAir()) {
         return false;
      } else {
         BlockState var5;
         if (!(var5 = Globals.mc.world.getBlockState(var1)).isAir() && var5.getBlock().getBlastResistance() >= 1200.0F) {
            boolean var11 = true;
            return true;
         } else {
            BlockPos[] var8;
            int var9 = (var8 = Util418.m13511(var1, false)).length;

            int var7;
            for (int var10000 = var7 = 0; var10000 < var9; var10000 = ++var7) {
               BlockPos var6 = var8[var7];
               BlockState var10;
               if ((var10 = Globals.mc.world.getBlockState(var6)).isAir() || var10.getBlock().getBlastResistance() < 1200.0F) {
                  return false;
               }
            }

            boolean var10002 = true;
            return true;
         }
      }
   }

   @Override
   public void onDisable() {
      Globals.mc.options.attackKey.setPressed(false);
      this.f5955 = null;
   }

   public AutoMine() {
        super("AutoMine", "Automatically mines", ModuleCategory.PLAYER);
      long var1 = f5957 ^ 84740289684098L;

      this.mode = new EnumSetting<>("Mode", AutoMineMode.f3731);
      this.focused = new BooleanSetting("Focused", false).setVisibility(() -> {
         if (this.mode.getValue() == AutoMineMode.f3731) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10005 = true;
      this.throughentities = new BooleanSetting("ThroughEntities", true).setVisibility(() -> {
         if (this.mode.getValue() == AutoMineMode.f3731) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      Targets var10000 = new Targets();
      var10005 = true;
      boolean var10007 = true;
      this.f5956 = var10000.m9192(true, false, true, true, true).m9194(() -> {
         if (this.mode.getValue() == AutoMineMode.f3733) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      var10005 = true;
      this.requirepickaxe = new BooleanSetting("RequirePickaxe", true).setVisibility(() -> {
         if (this.mode.getValue() == AutoMineMode.f3733) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      var10007 = true;
      this.switchSetting = new BooleanSetting("Switch", true);
      this.strictdir = new BooleanSetting("StrictDir", false).setVisibility(() -> {
         if (this.mode.getValue() == AutoMineMode.f3733) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.raytrace = new BooleanSetting("Raytrace", false).setVisibility(() -> {
         if (this.mode.getValue() == AutoMineMode.f3733) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      var10005 = true;
      this.rotate = new BooleanSetting("Rotate", true).setVisibility(() -> {
         if (this.mode.getValue() == AutoMineMode.f3733) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10003 = true;
      this.requirepickaxe.addSubSettings(this.switchSetting);
      Setting[] var10001 = new Setting[m175(15626, 280031149387201226L ^ var1)];
      var10001[0] = this.mode;
      var10005 = true;
      var10001[1] = this.focused;
      var10001[2] = this.throughentities;
      var10001[3] = this.f5956;
      var10001[4] = this.requirepickaxe;
      var10001[5] = this.strictdir;
      var10001[m175(31337, 4066025960263777707L ^ var1)] = this.raytrace;
      var10001[m175(17262, 6936943184491857069L ^ var1)] = this.rotate;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      int var4 = Class253.m9154();
      AutoMine var5 = this;
      if (AutoEat.f2905.m6292()) {
         Globals.mc.interactionManager.cancelBlockBreaking();
      } else {
         switch (this.mode.getValue().ordinal()) {
            case 0:
               Object var23;
               Object var31;
               if ((Boolean)this.throughentities.getValue()) {
                  Vec3d var19;
                  Vec3d var25 = (var19 = Globals.mc.player.getEyePos())
                     .add(
                        ((IMixinEntity)Globals.mc.player)
                           .invokeCalculateViewVector(Globals.mc.player.getPitch(), Globals.mc.player.getYaw())
                           .multiply(Globals.mc.player.getBlockInteractionRange())
                     );
                  var31 = var23 = Class220.m8449(new RaycastContext(var19, var25, ShapeType.OUTLINE, FluidHandling.NONE, Globals.mc.player), null);
               } else {
                  var31 = var23 = Globals.mc.crosshairTarget;
               }

               BlockHitResult var20;
               if (!(var31 instanceof BlockHitResult)
                  || (var20 = (BlockHitResult)var23).getType() != Type.BLOCK
                  || (Boolean)this.focused.getValue() && !Globals.mc.isWindowFocused()) {
                  Globals.mc.interactionManager.cancelBlockBreaking();
                  return;
               }

               Globals.mc.interactionManager.updateBlockBreakingProgress(var20.getBlockPos(), var20.getSide());
               Globals.mc.player.swingHand(Hand.MAIN_HAND);
               return;
            case 1:
               int var21 = InventoryUtils.findItemHotbar((Predicate<ItemStack>)(var0 -> {
                  return var0.getItem() instanceof PickaxeItem;
               }));
               if ((Boolean)this.requirepickaxe.getValue()
                  && var21 == -1
                  && (var21 == Globals.mc.player.getInventory().selectedSlot || (Boolean)this.switchSetting.getValue())) {
                  return;
               } else {
                  if (this.f5955 != null && Globals.mc.world.isAir(this.f5955)) {
                     this.f5955 = null;
                  }

                  BlockHitResult var18 = null;
                  Object var9 = null;
                  double var7 = Globals.mc.player.getBlockInteractionRange();
                  Iterator var6 = WorldUtils.getEntitiesSorted(Globals.mc.player, this.f5956::m7993).iterator();

                  label148: {
                     BlockHitResult var30;
                     label147:
                     while (true) {
                        for (Iterator var10000 = var6; var10000.hasNext(); var10000 = var6) {
                           Entity var10 = (Entity)var6.next();
                           if (var4 != 0) {
                              break label148;
                           }

                           if (Globals.mc.player.distanceTo(var10) > 7.0F) {
                              var30 = var18;
                              break label147;
                           }

                           BlockPos var11 = var10.getBlockPos();
                           BlockState var12;
                           if ((var12 = Globals.mc.world.getBlockState(var11)).getHardness(Globals.mc.world, var11) == -1.0F
                              && !var12.getCollisionShape(Globals.mc.world, var11).isEmpty()) {
                              continue label147;
                           }

                           if (var5.m11873(var11)) {
                              boolean var10003 = true;
                              BlockPos[] var26;
                              int var27 = (var26 = Util418.m13511(var11, true)).length;
                              int var13;
                              int var29 = var13 = 0;

                              while (true) {
                                 if (var29 >= var27) {
                                    continue label147;
                                 }

                                 BlockPos var14 = var26[var13];
                                 BlockState var15;
                                 double var16;
                                 BlockHitResult var28;
                                 if (!(var15 = Globals.mc.world.getBlockState(var14)).isAir()
                                    && (var15.getHardness(Globals.mc.world, var14) != -1.0F || var4 != 0)
                                    && (
                                       (
                                                var28 = Util416.m13456(
                                                   var14,
                                                   (Boolean)var5.strictdir.getValue(),
                                                   (Boolean)var5.raytrace.getValue(),
                                                   Globals.mc.player.getBlockInteractionRange()
                                                )
                                             )
                                             != null
                                          || var4 != 0
                                    )
                                    && (var16 = Util177.m7288(var14)) <= var7) {
                                    var7 = var16;
                                    var18 = var28;
                                    var5.f5952 = var10;
                                 }

                                 var29 = ++var13;
                              }
                           }
                        }

                        var30 = var18;
                        break;
                     }

                     if (var30 == null) {
                        return;
                     }
                  }

                  BlockPos var24 = var18.getBlockPos();
                  if (FastBreak.f5664.m11361(var24)) {
                     return;
                  } else {
                     int var22 = InventoryUtils.findItemHotbar(var0 -> {
                        return var0.getItem() instanceof PickaxeItem;
                     }, Comparator.comparingDouble(var1x -> {
                        return AutoTool.f9156.m17491(var1x, Globals.mc.world.getBlockState(var24));
                     }));
                     if ((Boolean)var5.requirepickaxe.getValue() && (Boolean)var5.switchSetting.getValue()) {
                        Globals.mc.player.getInventory().selectedSlot = var22;
                     }

                     if ((Boolean)var5.rotate.getValue()) {
                        RusherHackAPI.getRotationManager().updateRotation(var18, 180.0F);
                        if (!RusherHackAPI.getRotationManager().isLookingAt(var18, (Boolean)var5.strictdir.getValue())) {
                           return;
                        }
                     }

                     Globals.mc.interactionManager.updateBlockBreakingProgress(var24, var18.getSide());
                     Globals.mc.player.swingHand(Hand.MAIN_HAND);
                     var5.f5955 = var24;
                  }
               }
         }
      }
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31327;
      if (f5962[var3] == null) {
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
         long var5 = f5961[var3];
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
         Object[] var9 = (Object[])f5963.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f5963.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ΐ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f5962[var3] = var15;
      }

      return f5962[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoMine.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ΐ" + " : " + var1 + " : " + var2.toString(), var5);
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
