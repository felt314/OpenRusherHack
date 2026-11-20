package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.core.interfaces.IClickable;
import org.rusherhack.core.interfaces.ITypeable;

public abstract class Renderer532 implements IClickable, ITypeable, IRenderable2D {
   public Class212 f8551;
   public double f8552;
   public static long f8554 = Class066.m4320(-29380569207516342L, -802575216904502302L, MethodHandles.lookup().lookupClass()).m4325(84251762039355L);
   public static Object[] f8555 = new Object[29];
   public static String[] f8556 = new String[29];

   public Renderer532(Class212 var1, double var2, Class212 var4) {
    }

   public abstract double m191();

   @Override
   public boolean charTyped(char var1) {
      return false;
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      return false;
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public IFontRenderer getFontRenderer() {
      return this.f8551.getPanel().getFontRenderer();
   }

   public double m190() {
      long var1 = f8554 ^ 82830932009621L;
      return ((java.lang.Double)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "e", java.lang.invoke.MethodType.methodType(double.class, java.lang.Object.class, long.class, long.class)), this.f8551,  -6446412434062891168L,  var1))).doubleValue() - 2.0;
   }

   public double m16429() {
      return this.f8552 + this.m191() + 1.0;
   }

   @Override
   public boolean isHovered(double var1, double var3) {
      if (var1 >= this.f8551.m5381()
         && var1 <= this.f8551.m5381() + this.m190()
         && var3 >= this.f8551.m5385() + this.f8552
         && var3 <= this.f8551.m5385() + this.f8552 + this.m191()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public IRenderer2D getRenderer() {
      return this.f8551.getPanel().getRenderer();
   }

   static {
      m122();
   }
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8556[var4] != null) {
         return var4;
      } else {
         Object var5 = f8555[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 59;
               case 1 -> 34;
               case 2 -> 23;
               case 3 -> 46;
               case 4 -> 56;
               case 5 -> 33;
               case 6 -> 14;
               case 7 -> 29;
               case 8 -> 31;
               case 9 -> 5;
               case 10 -> 41;
               case 11 -> 30;
               case 12 -> 22;
               case 13 -> 39;
               case 14 -> 21;
               case 15 -> 11;
               case 16 -> 17;
               case 17 -> 12;
               case 18 -> 48;
               case 19 -> 35;
               case 20 -> 42;
               case 21 -> 55;
               case 22 -> 50;
               case 23 -> 57;
               case 24 -> 47;
               case 25 -> 45;
               case 26 -> 9;
               case 27 -> 62;
               case 28 -> 37;
               case 29 -> 58;
               case 30 -> 54;
               case 31 -> 44;
               case 32 -> 53;
               case 33 -> 49;
               case 34 -> 2;
               case 35 -> 4;
               case 36 -> 32;
               case 37 -> 28;
               case 38 -> 8;
               case 39 -> 7;
               case 40 -> 26;
               case 41 -> 27;
               case 42 -> 36;
               case 43 -> 16;
               case 44 -> 13;
               case 45 -> 51;
               case 46 -> 3;
               case 47 -> 40;
               case 48 -> 43;
               case 49 -> 6;
               case 50 -> 18;
               case 51 -> 10;
               case 52 -> 1;
               case 53 -> 52;
               case 54 -> 0;
               case 55 -> 60;
               case 56 -> 61;
               case 57 -> 20;
               case 58 -> 38;
               case 59 -> 15;
               case 60 -> 19;
               case 61 -> 25;
               case 62 -> 63;
               default -> 24;
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

            f8556[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f8555[0] = "T1U%\u001e[H+Wy\u0004OX(\u001cӜ";
      f8555[1] = "l\u001f/\noLp\u0005-VuX`\u0006fɐ";
      f8555[2] = double.class;
      f8556[2] = "java/lang/Double";
      f8555[3] = "7\u0004'HqW+\u001e%\u0014kC;\u001dn\u0094";
      f8555[4] = "A\u0011s|'\"]\u000bq =6M\b:ɔ";
      f8555[5] = int.class;
      f8556[5] = "java/lang/Integer";
      f8555[6] = "8 ;\u000b}/$:9Wg;49rƕ";
      f8555[7] = "E\u0014b\u0004s%Y\u000e`Xi1I\r+Im9O\bq\u0004` CHpC/ K\b`F/\u0000K\b`FC1Y\u0003";
      f8555[8] = "&l\u007f\u001b\u0017\u0001:v}G\r\u0015*u6V\t\u001d,pl\u001b\u0004\u0004 0jP\u000b\u0010,l6|7\u0011'z}G\u0000\u0006{Z";
      f8555[9] = "\u0004#\u000fWd\"\u00189\r\u000b~6\b:F\u001az>\u000e?\u001cWw'\u0002\u007f\u001d\u00108'\n?\r\u00158\u0007\n?\r\u0015_#\u000e<*\u0018e2";
      f8555[10] = "\u000fu}\u0014_(\u0013o\u007fHE<\u0003l4YA4\u0005in\u0014L-\t)i_Y)\ti}\u0014n2\fhhiH)\u0014nt]";
      f8555[11] = boolean.class;
      f8556[11] = "java/lang/Boolean";
      f8555[12] = "}Vx::\\aLzf HqO1w$@wJk:)Y{\nmq&MwV1r'Gf\nVR'Gfvzz,L`Am";
      f8555[13] = "bL_S\u0001`iCN\u001c`nbHJF";
      f8555[14] = "}\u0015-?\"d)\n%O9T>\u0015&r//+\t$O*,|Pa4?0~m";
      f8555[15] = "=RlzQ1iMd\nԱ\u0001=\u0010&o\u001e8cKae ";
      f8555[16] = ",ZZ|\\?/X\u0010rg\"}Ynp\u00011JHF{\n7}_ '\u00054n\u001a^r\u0005ui%";
      f8555[17] = "59y;\u0004\"6;35??d:Y=Y<d<n*?n7'},V0f?sP";
      f8555[18] = "M>R:ic\rfRh\u0004ˤw>\u0016+agN`MlkY";
      f8555[19] = "M:e5\"\u0003\rbegOV\u001a|D?#E\u0017\u0000!d5\\I9\u007f?rVw";
      f8555[20] = ",\u0016W\u0013r!lP\u0005\u0019\nɀ\u0016PB\u0010wi'\u0019_Kr\u0019";
      f8555[21] = "\u0000.&\u0005\u001e\u0010T1.uђ \u0000ll\u0010Q\u0019^7+\u001a";
      f8555[22] = "\u0019E\f=S\u001eD\u001b\t%?\u001aK\u0007)!R\u0004K \u0004'Ta\u0019\u0004H,\\\u001e\u0016J\u0011z?^\u0018\u0002\t-@\u0003F\u0007\u0011A";
      f8555[23] = "W7*In2\u0003(\"9ō\u0002Q6#Eb|\t,p\u0000";
      f8555[24] = "O5O@0\u0006\u001b*G0ȏ6I4FL<H\u0011.\u0015\t";
      f8555[25] = ";D$\u0012f'o[,b҇\u0017;\u0006n\u0007).e])\r\u0017";
      f8555[26] = "u\nI\u001c\t\u000b-\u0010\u001aYtӁILN\u0019\b\u00196\u0011\u0010\u001c\u0010";
      f8555[27] = "XB79]m\u0018\u001a7k0ЕbBs(Ui[\u001c(o_W";
      f8555[28] = "`M.9\u0017},Tshwh3U\u0015l\u0011j:)qz\rle[rxGb^";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f8555[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8556[var4]);
            f8555[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m124(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m125(Class var0, String var1, Class var2) {
      Field var3 = m124(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m125(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m126(long var0, long var2) {
      int var4 = m121(var0, var2);
      Object var5 = f8555[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8556[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f8555[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8555[var4] = var13;
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
               var12 = m123(915669433507869L, 0L);
            }
         }
      }
   }

   public static Method m127(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m128(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m127(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m128(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m129(long var0, long var2) {
      int var4 = m121(var0, var2);
      Object var5 = f8555[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8556[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m123(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m127(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f8555[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(915669433507869L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m128(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f8555[var4] = var19;
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
               var23 = m123(915669433507869L, 0L);
            }
         }
      }
   }

   public static MethodHandle m130(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 195 && var8 != 'H' && var8 != 205 && var8 != 'Y') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'e') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'B') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 195) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'H') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 205) {
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

   public static Object m131(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m130(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer532.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ӗ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public Renderer532() {}
}
