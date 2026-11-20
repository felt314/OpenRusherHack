package org.rusherhack;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;

public abstract class Renderer271 extends Class380 {
   public Animation f4696;
   public boolean f4697;
   public static Setting[] f4698;
   public static long f4699 = Class066.m4320(1153707118450928507L, 7289133487871899944L, MethodHandles.lookup().lookupClass()).m4325(169514201962840L);
   public static long f4700;
   public static long f4701;
   public static Object[] f4702 = new Object[54];
   public static String[] f4703 = new String[54];

   public abstract boolean m4901();

   public void m9516() {
      this.f4696.setTween(Easing.SINE_PULSE).restart().setDuration(f4701).setDirection(false).play();
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      long var6 = f4699 ^ 106441586592544L;
      this.f4696.get();
      if (!this.f4696.isPlaying()) {
      }

      if (this.m5207()) {
         IRenderer2D var9 = this.getPanel().getRenderer();
         int var11 = super.f6219 = this.m9517(var2, var4);
         var9.drawRectangle(0.0, 0.0, ((org.rusherhack.Renderer107)(this)).getWidth(), this.getHeight(false), var11);
      }

      super.render(var1, var2, var4);
   }

   @Override
   public int m9517(double var1, double var3) {
      if (this.f4696.isPlaying()) {
         return ColorUtils.interpolateColor(new Color(0, 0, 0, 0).getRGB(), Color.RED.getRGB(), this.f4696.get());
      } else {
         Color var8 = Hud297.f4953.getPrimaryColor();
         boolean var9;
         Color var11 = (var9 = this.m4901()) ? var8 : Renderer107.f2394;
         if (this.isHovered(var1, var3, false)) {
            Color var10000;
            if (var9) {
               var10000 = var11.darker();
            } else {
               int var10002 = (int)f4700;
               boolean var10005 = true;
               var10000 = new Color(var10002, true);
            }

            var11 = var10000;
         }

         return ColorUtils.interpolateColor(super.f6219, var11.getRGB(), 0.3F);
      }
   }

   public boolean m5207() {
      boolean var10002 = true;
      return true;
   }

   public Renderer271(PanelBase<?> var1, Renderer107 var2) {
      super(var1, var2);
      this.f4696 = new Animation();
      this.f4697 = false;
   }

   public static void m9519(Setting[] var0) {
      f4698 = var0;
   }

   public static Setting[] m3492() {
      return f4698;
   }

   
   public static int m3937(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f4703[var4] != null) {
         return var4;
      } else {
         Object var5 = f4702[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 13;
               case 1 -> 12;
               case 2 -> 30;
               case 3 -> 23;
               case 4 -> 45;
               case 5 -> 62;
               case 6 -> 26;
               case 7 -> 39;
               case 8 -> 7;
               case 9 -> 28;
               case 10 -> 3;
               case 11 -> 58;
               case 12 -> 34;
               case 13 -> 47;
               case 14 -> 24;
               case 15 -> 52;
               case 16 -> 40;
               case 17 -> 15;
               case 18 -> 33;
               case 19 -> 4;
               case 20 -> 36;
               case 21 -> 16;
               case 22 -> 49;
               case 23 -> 2;
               case 24 -> 59;
               case 25 -> 20;
               case 26 -> 56;
               case 27 -> 48;
               case 28 -> 21;
               case 29 -> 6;
               case 30 -> 25;
               case 31 -> 46;
               case 32 -> 19;
               case 33 -> 8;
               case 34 -> 37;
               case 35 -> 31;
               case 36 -> 17;
               case 37 -> 22;
               case 38 -> 60;
               case 39 -> 35;
               case 40 -> 41;
               case 41 -> 54;
               case 42 -> 50;
               case 43 -> 32;
               case 44 -> 0;
               case 45 -> 9;
               case 46 -> 38;
               case 47 -> 29;
               case 48 -> 27;
               case 49 -> 63;
               case 50 -> 53;
               case 51 -> 14;
               case 52 -> 55;
               case 53 -> 51;
               case 54 -> 44;
               case 55 -> 18;
               case 56 -> 42;
               case 57 -> 5;
               case 58 -> 61;
               case 59 -> 57;
               case 60 -> 11;
               case 61 -> 10;
               case 62 -> 1;
               default -> 43;
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

            f4703[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m3939(long var0, long var2) {
      Class var5 = null;
      int var4 = m3937(var0, var2);
      Object var6 = f4702[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f4703[var4]);
            f4702[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m3940(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m3941(Class var0, String var1, Class var2) {
      Field var3 = m3940(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m3941(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m3942(long var0, long var2) {
      int var4 = m3937(var0, var2);
      Object var5 = f4702[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f4703[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m3939(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m3939(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m3940(var12, var10, var11);
            if (var13 != null) {
               f4702[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m3941(var14[var15], var10, var11);
                  if (var13 != null) {
                     f4702[var4] = var13;
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
               var12 = m3939(1498927082032533L, 0L);
            }
         }
      }
   }

   public static Method m3943(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m3944(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m3943(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m3944(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m3945(long var0, long var2) {
      int var4 = m3937(var0, var2);
      Object var5 = f4702[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f4703[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m3939(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m3939(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m3943(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f4702[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m3939(1498927082032533L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m3944(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f4702[var4] = var19;
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
               var23 = m3939(1498927082032533L, 0L);
            }
         }
      }
   }

   public static MethodHandle m3946(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 197 && var8 != 'j' && var8 != 237 && var8 != 'D') {
            var11 = m3945(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 225) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'i') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m3942(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 197) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'j') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 237) {
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

   public static Object m3947(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m3946(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         try {
            return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
         } catch (Throwable throwable) {
            throw new IllegalStateException(throwable);
         }
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m1269(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer271.class, "m3947", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ȣ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
