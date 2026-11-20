package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidFillable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.system.IRotationManager;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.hud.impl.Speed;
public class SourceRemover extends ToggleableModule {
   public ColorSetting color;
   public BooleanSetting rotate;
   public BooleanSetting render;
   public BooleanSetting pausebaritone;
   public BlockHitResult f3061;
   public BooleanSetting raytrace;
   public long f3063;
   public BooleanSetting water;
   public HashMap<BlockPos, BlockHitResult> f3065;
   public BooleanSetting swap;
   public NumberSetting<Float> range;
   public BlockPos f3068;
   public EnumSetting<SourceRemoverPriority> priority;
   public NumberSetting<Float> speed;
   public Timer f3071;
   public BooleanSetting bubblecolumns;
   public BooleanSetting lava;
   public NumberSetting<Integer> delay;
   public static long f3082;

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      int var4 = Class253.m9154();
      SourceRemover var12 = this;
      this.f3065 = this.m6569();
      if (this.f3065.isEmpty()) {
         this.f3068 = null;
         this.f3061 = null;
      } else {
         label92:
         if (this.f3071.ticksPassed(this.delay.getValue())) {
            BlockPos var10 = null;
            BlockHitResult var5 = null;
            Iterator var6 = this.f3065.entrySet().iterator();

            label89:
            while (true) {
               Iterator var10000 = var6;

               while (true) {
                  if (!var10000.hasNext()) {
                     break label89;
                  }

                  Entry var7;
                  BlockPos var8 = (BlockPos)(var7 = (Entry)var6.next()).getKey();
                  BlockHitResult var9 = (BlockHitResult)var7.getValue();
                  if (var4 != 0) {
                     break label92;
                  }

                  if (var10 != null) {
                     if (var12.priority.getValue() == SourceRemoverPriority.f3972) {
                        if (!(
                           Globals.mc.player.squaredDistanceTo(var8.getX(), var8.getY(), var8.getZ())
                              > Globals.mc.player.squaredDistanceTo(var10.getX(), var10.getY(), var10.getZ())
                        )) {
                           break;
                        }

                        var10 = var8;
                        var5 = var9;
                        if (var4 == 0) {
                           break;
                        }
                     }

                     if (var8.getY() >= var10.getY()) {
                        break;
                     }

                     var10 = var8;
                     var5 = var9;
                     if (var4 != 0) {
                        break label89;
                     }
                     break;
                  }

                  var10 = var8;
                  var5 = var9;
                  var10000 = var6;
               }
            }

            var12.f3068 = var10;
            var12.f3061 = var5;
         }

         if (var12.f3061 != null) {
            int var11;
            if ((
                  var11 = InventoryUtils.findItemHotbar(
                     (Predicate<ItemStack>)(var0 -> {
                        Item var6x;
                        if ((var6x = var0.getItem()) instanceof BlockItem) {
                           BlockItem var4x;
                           Block var7x;
                           if ((var7x = (var4x = (BlockItem)var6x).getBlock()).getDefaultState().canBucketPlace(Fluids.WATER)) {
                              return false;
                           } else if (var7x instanceof FluidFillable
                              && ((FluidFillable)var7x)
                                 .canFillWithFluid(Globals.mc.player, Globals.mc.world, BlockPos.ORIGIN, var7x.getDefaultState(), Fluids.WATER)) {
                              return false;
                           } else {
                              boolean var10002 = true;
                              return true;
                           }
                        } else {
                           return false;
                        }
                     })
                  )
               )
               != -1) {
               if (Class170.f3353 && (Boolean)var12.pausebaritone.getValue()) {
                  var12.f3063 = System.currentTimeMillis();
               }

               if (var12.f3071.ticksPassed(var12.delay.getValue())) {
                  BlockPos var13 = var12.f3061.getBlockPos();
                  net.minecraft.util.math.Direction var14 = var12.f3061.getSide();
                  if ((Boolean)var12.rotate.getValue()) {
                     IRotationManager var15;
                     (var15 = RusherHackAPI.getRotationManager()).updateRotation(var13, var14, var12.speed.getValue());
                     if (!var15.isLookingAt(var13, var14) && !var15.isLookingAt(var13.offset(var14), var14.getOpposite())) {
                        return;
                     }
                  }

                  int var16 = Globals.mc.player.getInventory().selectedSlot;
                  if ((Boolean)var12.swap.getValue() && !(Globals.mc.player.getMainHandStack().getItem() instanceof BlockItem)) {
                     Globals.mc.player.getInventory().selectedSlot = var11;
                  }

                  boolean var10004 = true;
                  Util416.m13459(var12.f3061, Hand.MAIN_HAND, true);
                  Globals.mc.player.getInventory().selectedSlot = var16;
                  var12.f3061 = null;
                  var12.f3068 = null;
                  var12.f3071.reset();
               }
            }
         }
      }
   }

   public HashMap<BlockPos, BlockHitResult> m6569() {
      SourceRemover var5 = this;
      int var10000 = Class253.m9155();
      HashMap var7 = new HashMap();
      int var3 = var10000;
      Iterator var10 = Util179.m7330(Globals.mc.player.getBlockPos(), this.range.getValue(), false).iterator();

      label85:
      while (true) {
         Iterator var12 = var10;

         label83:
         while (true) {
            boolean var13 = var12.hasNext();

            while (var13) {
               BlockPos var6 = (BlockPos)var10.next();
               BlockState var4 = Globals.mc.world.getBlockState(var6);
               FluidState var8 = Globals.mc.world.getFluidState(var6);
               Block var9 = var4.getBlock();
               if (!var8.isStill()) {
                  continue label85;
               }

               var13 = var4.isReplaceable();
               if (var3 != 0) {
                  if (var3 != 0) {
                     if (!var13) {
                        var12 = var10;
                        continue label83;
                     }

                     var13 = var8.isIn(FluidTags.WATER);
                  }

                  label79:
                  if (var3 != 0) {
                     if (var13) {
                        var13 = (Boolean)var5.water.getValue();
                        if (var3 != 0) {
                           if (!var13) {
                              var12 = var10;
                              continue label83;
                           }

                           var13 = (Boolean)var5.bubblecolumns.getValue();
                        }

                        if (var3 == 0) {
                           break label79;
                        }

                        if (!var13 && var9 == Blocks.BUBBLE_COLUMN) {
                           var12 = var10;
                           continue label83;
                        }
                     }

                     var13 = var8.isIn(FluidTags.LAVA);
                  }

                  label71: {
                     if (var3 != 0) {
                        if (!var13) {
                           break label71;
                        }

                        var13 = (Boolean)var5.lava.getValue();
                     }

                     if (!var13) {
                        var12 = var10;
                        continue label83;
                     }
                  }

                  boolean var10003 = true;
                  BlockHitResult var11;
                  BlockHitResult var14 = var11 = Util416.m13460(var6, true, (Boolean)var5.raytrace.getValue(), var5.range.getValue().floatValue());
                  if (var3 != 0) {
                     if (var14 == null) {
                        var12 = var10;
                        continue label83;
                     }

                     var7.put(var6, var11);
                  }

                  var12 = var10;
                  continue label83;
               }
            }

            return var7;
         }
      }
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      int var4 = Class253.m9155();
      SourceRemover var5 = this;
      if ((Boolean)this.render.getValue()) {
         IRenderer3D var8 = var1.getRenderer();
         var8.begin(var1.getMatrixStack());
         BlockPos var9 = this.f3068;
         Iterator var6;
         Iterator var10000 = var6 = this.f3065.keySet().iterator();

         while (true) {
            if (!var10000.hasNext()) {
               var8.end();
               break;
            }

            BlockPos var7 = (BlockPos)var6.next();
            if (var4 == 0) {
               break;
            }

            var10000 = var6;
            boolean var10003 = var7.equals(var9);
            boolean var10006 = true;
            var8.drawBox(var7, var10003, true, var5.color.getValueRGB());
         }
      }
   }

   @Subscribe
   public void m6572(Event547 var1) {
      if (System.currentTimeMillis() - this.f3063 <= f3082) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   public SourceRemover() {
        super("SourceRemover", "Blocks i>{_A\u0004earby source blocks", ModuleCategory.WORLD);
      int var10000 = Class253.m9154();

      this.priority = new EnumSetting<>("Priority", SourceRemoverPriority.f3974);
      this.range = new NumberSetting<>("Range", 4.0F, 1.0F, 6.0F);
      boolean var10025 = true;
      this.delay = new NumberSetting<>("Delay", 1, 0, 20);
      boolean var10024 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.speed = new NumberSetting<>("Speed", 180.0F, 20.0F, 180.0F).incremental(1.0);
      boolean var10022 = true;
      this.raytrace = new BooleanSetting("Raytrace", true);
      boolean var10021 = true;
      this.swap = new BooleanSetting("Swap", true);
      boolean var10020 = true;
      this.water = new BooleanSetting("Water", true);
      boolean var10019 = true;
      this.bubblecolumns = new BooleanSetting("BubbleColumns", true);
      boolean var10018 = true;
      this.lava = new BooleanSetting("Lava", true);
      boolean var10017 = true;
      this.render = new BooleanSetting("Render", true);
      ColorSetting var10011 = new ColorSetting("Color", ColorUtils.transparency(Color.CYAN, 50));
      boolean var10014 = true;
      this.color = var10011.setThemeSync(true);
      this.pausebaritone = new BooleanSetting("PauseBaritone", false);
      this.f3071 = new Timer();
      this.f3063 = System.currentTimeMillis();
      this.f3065 = new HashMap<>();
      this.f3061 = null;
      this.f3068 = null;
      boolean var10004 = true;
      this.rotate.addSubSettings(this.speed);
      int var3 = var10000;
      boolean var10003 = true;
      this.render.addSubSettings(this.color);
      var10003 = true;
      this.water.addSubSettings(this.bubblecolumns);
      SourceRemover var4 = this;
      Setting[] var10001 = new Setting[9];
      var10001[0] = this.priority;
      boolean var10005 = true;
      var10001[1] = this.range;
      var10001[2] = this.delay;
      var10001[3] = this.rotate;
      var10001[4] = this.raytrace;
      var10001[5] = this.swap;
      var10001[6] = this.water;
      var10001[7] = this.lava;
      var10001[8] = this.render;
      if (var3 == 0) {
         this.registerSettings(var10001);
         if (!Class170.f3353) {
            return;
         }

         var4 = this;
         var10003 = true;
         var10001 = new Setting[]{this.pausebaritone};
      }

      var4.registerSettings(var10001);
   }
}
