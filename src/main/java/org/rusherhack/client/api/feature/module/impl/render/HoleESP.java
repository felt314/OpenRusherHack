package org.rusherhack.client.api.feature.module.impl.render;
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
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.joml.Matrix4f;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.command.clear;
import org.rusherhack.command.peek;
import org.rusherhack.client.api.feature.hud.impl.Direction;
public class HoleESP extends ToggleableModule {
   public BooleanSetting voidesp;
   public BooleanSetting outline;
   public NumberSetting<Float> thickness;
   public List<BlockPos> f8646;
   public ColorSetting doublecolor;
   public NumberSetting<Float> f8648;
   public ColorSetting obsidiancolor;
   public ColorSetting color;
   public List<BlockPos> f8651;
   public NumberSetting<Float> height;
   public ColorSetting f8653;
   public ColorSetting bedrockcolor;
   public BooleanSetting doubles;
   public EnumSetting<HoleESPMode> mode;
   public NumberSetting<Float> f8657;
   public NumberSetting<Float> f8658;
   public NumberSetting<Float> range;
   public BooleanSetting cityesp;
   public List<BlockPos> f8661;
   public BooleanSetting glow;
   public List<BlockPos> f8663;
   public static long f8664 = Class066.m4320(-5133920412993604006L, -5247318229762749096L, MethodHandles.lookup().lookupClass()).m4325(152098330927446L);
   public static Object[] f8671 = new Object[203];
   public static String[] f8672 = new String[203];

   public static boolean m16611(BlockPos var0) {
      int var10000 = Class253.m9155();
      Block var4 = Globals.mc.world.getBlockState(var0.down()).getBlock();
      int var3 = var10000;
      Block var5 = Globals.mc.world.getBlockState(var0.add(0, 0, -1)).getBlock();
      boolean var10006 = true;
      Block var6 = Globals.mc.world.getBlockState(var0.add(1, 0, 0)).getBlock();
      var10006 = true;
      Block var7 = Globals.mc.world.getBlockState(var0.add(0, 0, 1)).getBlock();
      Block var9 = Globals.mc.world.getBlockState(var0.add(-1, 0, 0)).getBlock();
      boolean var10 = Globals.mc.world.isAir(var0);
      if (var3 != 0) {
         if (var10) {
            var10 = Globals.mc.world.isAir(var0.up());
            if (var3 == 0) {
               return var10;
            }

            if (var10) {
               var10 = Globals.mc.world.isAir(var0.up().up());
               if (var3 == 0) {
                  return var10;
               }

               if (var10) {
                  var10 = m16613(var4);
                  if (var3 == 0) {
                     return var10;
                  }

                  if (var10) {
                     var10 = m16613(var5);
                     if (var3 == 0) {
                        return var10;
                     }

                     if (var10) {
                        var10 = m16613(var6);
                        if (var3 == 0) {
                           return var10;
                        }

                        if (var10) {
                           var10 = m16613(var7);
                           if (var3 == 0) {
                              return var10;
                           }

                           if (var10) {
                              var10 = m16613(var9);
                              if (var3 == 0) {
                                 return var10;
                              }

                              if (var10) {
                                 boolean var10002 = true;
                                 return true;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var10 = false;
      }

      return var10;
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   public static boolean m16613(Block var0) {
      if (!var0.equals(Blocks.OBSIDIAN) && !var0.equals(Blocks.BEDROCK)) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   public static int m16614(Mutable var0) {
        return 0;
    }

   public static boolean m16616(BlockPos var0) {
      if (m16621(var0) != null) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public static boolean m16618(BlockPos var0) {
      Block var4 = Globals.mc.world.getBlockState(var0.down()).getBlock();
      int var10000 = Class253.m9154();
      boolean var10007 = true;
      Block var5 = Globals.mc.world.getBlockState(var0.add(0, 1, -1)).getBlock();
      int var3 = var10000;
      boolean var10006 = true;
      Block var6 = Globals.mc.world.getBlockState(var0.add(1, 1, 0)).getBlock();
      var10006 = true;
      Block var7 = Globals.mc.world.getBlockState(var0.add(0, 1, 1)).getBlock();
      var10006 = true;
      Block var9 = Globals.mc.world.getBlockState(var0.add(-1, 1, 0)).getBlock();
      boolean var10 = Globals.mc.world.isAir(var0);
      if (var3 == 0) {
         if (var10) {
            var10 = Globals.mc.world.isAir(var0.up());
            if (var3 != 0) {
               return var10;
            }

            if (var10) {
               var10 = Globals.mc.world.isAir(var0.up().up());
               if (var3 != 0) {
                  return var10;
               }

               if (var10) {
                  var10 = m16613(var4);
                  if (var3 != 0) {
                     return var10;
                  }

                  if (var10) {
                     var10 = m16613(var5);
                     if (var3 != 0) {
                        return var10;
                     }

                     if (var10) {
                        var10 = m16613(var6);
                        if (var3 != 0) {
                           return var10;
                        }

                        if (var10) {
                           var10 = m16613(var7);
                           if (var3 != 0) {
                              return var10;
                           }

                           if (var10) {
                              var10 = m16613(var9);
                              if (var3 != 0) {
                                 return var10;
                              }

                              if (var10) {
                                 boolean var10002 = true;
                                 return true;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var10 = false;
      }

      return var10;
   }

   public void m16619(double var1, double var3, double var5, double var7, double var9, double var11, int var13) {
        
    }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Subscribe
   public void onRender3D(EventRender3D var1) {
        
    }

   @Override
   public String getMetadata() {
      boolean var10003 = true;
      return String.format("Holes: %s", this.f8651.size());
   }

   public static BlockPos m16621(BlockPos var0) {
        return null;
    }

   public HoleESP() {
      super("HoleESP", CommandProcessingSink.m1291("pNe=SrG=VoLnA|Y0F|Sx\u0015uZqPn"), ModuleCategory.RENDER);
      this.range = new NumberSetting<>("Range", 6.0F, 1.0F, 10.0F);
      this.height = new NumberSetting<>("Height", 0.01F, 0.01F, 1.0F);
      boolean var10014 = true;
      this.outline = new BooleanSetting("Outline", true);
      this.thickness = new NumberSetting<>("Thickness", 1.0F, 1.0F, 5.0F);
      this.glow = new BooleanSetting("Glow", false);
      this.mode = new EnumSetting<>("Mode", HoleESPMode.f6703);
      this.f8658 = new NumberSetting<>("Height", 1.0F, 0.01F, 2.0F);
      this.doubles = new BooleanSetting("Doubles", false);
      this.obsidiancolor = new ColorSetting("ObsidianColor", ColorUtils.transparency(Color.RED, 35));
      this.bedrockcolor = new ColorSetting("BedrockColor", ColorUtils.transparency(Color.GREEN, 35));
      this.doublecolor = new ColorSetting("DoubleColor", ColorUtils.transparency(Color.YELLOW, 35))
         .setVisibility(this.doubles::getValue);
      this.cityesp = new BooleanSetting("CityESP", false);
      this.f8657 = new NumberSetting<>("Range", 6.0F, 1.0F, 10.0F);
      this.color = new ColorSetting("Color", ColorUtils.transparency(Color.CYAN, 100));
      this.voidesp = new BooleanSetting("VoidESP", false);
      this.f8648 = new NumberSetting<>("Range", 6.0F, 1.0F, 10.0F);
      this.f8653 = new ColorSetting("Color", ColorUtils.transparency(Color.MAGENTA, 100));
      this.f8651 = new ArrayList<>();
      this.f8661 = new ArrayList<>();
      this.f8646 = new ArrayList<>();
      this.f8663 = new ArrayList<>();
      boolean var10003 = true;
      this.outline.addSubSettings(this.thickness);
      BooleanSetting var10000 = this.glow;
      Setting[] var10001 = new Setting[]{this.mode, null};
      boolean var10005 = true;
      var10001[1] = this.f8658;
      var10000.addSubSettings(var10001);
      var10000 = this.cityesp;
      var10001 = new Setting[]{this.f8657, null};
      var10005 = true;
      var10001[1] = this.color;
      var10000.addSubSettings(var10001);
      var10000 = this.voidesp;
      var10001 = new Setting[]{this.f8648, null};
      var10005 = true;
      var10001[1] = this.f8653;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[10];
      var10001[0] = this.range;
      var10005 = true;
      var10001[1] = this.height;
      var10001[2] = this.outline;
      var10001[3] = this.glow;
      var10001[4] = this.doubles;
      var10001[5] = this.obsidiancolor;
      var10001[6] = this.bedrockcolor;
      var10001[7] = this.doublecolor;
      var10001[8] = this.cityesp;
      var10001[9] = this.voidesp;
      this.registerSettings(var10001);
   }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8672[var4] != null) {
         return var4;
      } else {
         Object var5 = f8671[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 20;
               case 1 -> 23;
               case 2 -> 4;
               case 3 -> 13;
               case 4 -> 55;
               case 5 -> 26;
               case 6 -> 44;
               case 7 -> 9;
               case 8 -> 41;
               case 9 -> 43;
               case 10 -> 38;
               case 11 -> 10;
               case 12 -> 11;
               case 13 -> 59;
               case 14 -> 45;
               case 15 -> 53;
               case 16 -> 42;
               case 17 -> 40;
               case 18 -> 52;
               case 19 -> 34;
               case 20 -> 49;
               case 21 -> 12;
               case 22 -> 48;
               case 23 -> 24;
               case 24 -> 39;
               case 25 -> 63;
               case 26 -> 2;
               case 27 -> 8;
               case 28 -> 33;
               case 29 -> 18;
               case 30 -> 25;
               case 31 -> 61;
               case 32 -> 15;
               case 33 -> 60;
               case 34 -> 29;
               case 35 -> 31;
               case 36 -> 47;
               case 37 -> 58;
               case 38 -> 62;
               case 39 -> 50;
               case 40 -> 35;
               case 41 -> 5;
               case 42 -> 3;
               case 43 -> 32;
               case 44 -> 56;
               case 45 -> 22;
               case 46 -> 57;
               case 47 -> 1;
               case 48 -> 46;
               case 49 -> 14;
               case 50 -> 51;
               case 51 -> 21;
               case 52 -> 37;
               case 53 -> 36;
               case 54 -> 0;
               case 55 -> 17;
               case 56 -> 27;
               case 57 -> 16;
               case 58 -> 19;
               case 59 -> 6;
               case 60 -> 28;
               case 61 -> 30;
               case 62 -> 54;
               default -> 7;
            };
            int[] var7 = new int[6];

            for (int var8 = 0; var8 < 6; var8++) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for (int var14 = 0; var14 < var13.length; var14++) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            f8672[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f8671[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8672[var4]);
            f8671[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
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

   public static Field m183(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f8671[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8672[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f8671[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8671[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new IllegalStateException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = m180(853714161893497L, 0L);
            }
         }
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

   public static Method m186(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f8671[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8672[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            var11++;
            var12++;
         } while ((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for (int var16 = 0; var16 < var11; var16++) {
            int var17 = var6.indexOf(8, var12);
            var15 = m180(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m184(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f8671[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(853714161893497L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m185(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f8671[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while (var29 < var13) {
                  var28.append(var14[var29].getName());
                  if (++var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new IllegalStateException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(853714161893497L, 0L);
            }
         }
      }
   }

   public static MethodHandle m187(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'I' && var8 != 225 && var8 != 'c' && var8 != 210) {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'v') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 238) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'I') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 225) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'c') {
               var9 = var0.findStaticGetter(var12, var18, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var18, var14);
            }
         }

         return MethodHandles.dropArguments((MethodHandle)var9, var3.parameterCount() - 2, long.class, long.class);
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName())
            .append(" : ")
            .append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null "))
            .append(" : ")
            .append(var15.toString());
         throw new IllegalStateException(var13.toString());
      }
   }

   public static Object m188(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m187(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(HoleESP.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ө" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
