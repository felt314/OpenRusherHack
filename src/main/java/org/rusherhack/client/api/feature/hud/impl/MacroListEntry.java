package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;

import org.rusherhack.command.bind;
public class MacroListEntry extends ListHudElement$ListItem {
   public Class101 f3439;
   public static long f3440 = Class066.m4320(-4158050578295210013L, -744177365061766625L, MethodHandles.lookup().lookupClass()).m4325(263977019124831L);
   public static String[] f3441;
   public static String[] f3442;
   public static Object[] f3444 = new Object[49];
   public static String[] f3445 = new String[49];

   @Override
   public Text getText() {
      long var1 = f3440 ^ 91264977080944L;
      IKey var4;
      String var10000;
      if ((var4 = Class170.f3364.m7119().getBind(this.f3439)) instanceof NullKey) {
         var10000 = "unbound";
      } else {
         boolean var10001;
         if (!(var4 instanceof Class545)) {
            var10001 = true;
            boolean var10003 = true;
         } else {
            var10001 = false;
            boolean var7 = true;
         }

         var10000 = var4.getLabel(var10001);
      }

      String var6 = var10000;
      return Text.literal(((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "P", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), this.f3439,  -1520742304540734785L,  var1))) + " - " + var6);
   }

   @Override
   public double getHeight() {
        return 0.0;
    }

   @Override
   public double getWidth() {
        return 0.0;
    }

   @Override
   public boolean shouldRemove() {
        return false;
    }

   @Override
   public void render(RenderContext var1, int var2) {
        
    }

   public MacroListEntry(MacroList var1, ListHudElement var2, Class101 var3) {
    }

   static {
    }
   public static String m117(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3445[var4] != null) {
         return var4;
      } else {
         Object var5 = f3444[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 7;
               case 1 -> 39;
               case 2 -> 44;
               case 3 -> 49;
               case 4 -> 37;
               case 5 -> 4;
               case 6 -> 23;
               case 7 -> 53;
               case 8 -> 26;
               case 9 -> 10;
               case 10 -> 46;
               case 11 -> 1;
               case 12 -> 54;
               case 13 -> 38;
               case 14 -> 12;
               case 15 -> 43;
               case 16 -> 57;
               case 17 -> 3;
               case 18 -> 47;
               case 19 -> 62;
               case 20 -> 16;
               case 21 -> 34;
               case 22 -> 50;
               case 23 -> 14;
               case 24 -> 58;
               case 25 -> 61;
               case 26 -> 8;
               case 27 -> 13;
               case 28 -> 33;
               case 29 -> 55;
               case 30 -> 60;
               case 31 -> 31;
               case 32 -> 2;
               case 33 -> 27;
               case 34 -> 24;
               case 35 -> 32;
               case 36 -> 22;
               case 37 -> 30;
               case 38 -> 36;
               case 39 -> 5;
               case 40 -> 63;
               case 41 -> 56;
               case 42 -> 18;
               case 43 -> 21;
               case 44 -> 19;
               case 45 -> 35;
               case 46 -> 48;
               case 47 -> 11;
               case 48 -> 17;
               case 49 -> 28;
               case 50 -> 45;
               case 51 -> 20;
               case 52 -> 42;
               case 53 -> 29;
               case 54 -> 6;
               case 55 -> 52;
               case 56 -> 25;
               case 57 -> 15;
               case 58 -> 59;
               case 59 -> 51;
               case 60 -> 40;
               case 61 -> 0;
               case 62 -> 9;
               default -> 41;
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

            f3445[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f3444[0] = "Dp\u007f^YcXj}\u0002CwHi6\u009a";
      f3444[1] = "\u007fj!\u0004Lyab;K.ef\u007f";
      f3444[2] = "41$97\\(+&e-H8(mŤ";
      f3444[3] = "\u0016V*\"*\u0012\nL(~0\u0006\u001aOcɸ";
      f3444[4] = "\u0003i\u0017s+Z\u001fs\u0015/1N\u000fp^ɛ";
      f3444[5] = int.class;
      f3445[5] = "java/lang/Integer";
      f3444[6] = "\u001a!\r_R\u000e\u0006;\u000f\u0003H\u001a\u00168D\u0012L\u0012\u0010=\u001e_A\u000b\u001c}\u0018\u0014N\u001f\u0010!D\u0017O\u0015\u0001}#7O\u0015\u0001\u0001\u000f\u001fD\u001e\u00076\u0018";
      f3444[7] = double.class;
      f3445[7] = "java/lang/Double";
      f3444[8] = "\u0003\t4N8*\u001f\u00136\u0012\">\u000f\u0010}ӕ";
      f3444[9] = "r\u001d)z}\"n\u0007+&g6~\u0004`7`%xA=1{#t\u0001)zM8r\u0003+5a\u0004x\u001b:=a0";
      f3444[10] = "oB.1\u0006/dM?~j,jO=1F";
      f3444[11] = boolean.class;
      f3445[11] = "java/lang/Boolean";
      f3444[12] = "i\u001b=Opgu\u0001?\u0013jse\u0002t\u0002n{c\u0007.OcboG<\u0004cfs\u001b?OjgbG\u0016\bqfN\u001c>$nwk\f4\u0015&^o\u001a.(vwk";
      f3444[13] = "Po!m*bLu#10v\\vh 7eZ35&,cVs!m\u000brKi/-?";
      f3444[14] = "&\"e&\u00113--tip=&&p3";
      f3444[15] = "*DR#s26^P\u007fi&&]\u001bŦ";
      f3444[16] = "-N\u0002c\u001aY1T\u0000?\u0000M!WK.\u0007^'\u0012\u0007$\u0006Hl~\f#\fa#R\u0004*\r^\u0000]\u0016(";
      f3444[17] = "Wv\u001bg%rKl\u0019;?f[oR*8u]*\u001e 9c\u0016M> 9cYf\u0010,";
      f3444[18] = "]\u0006@x^2A\u001cB$D&Q\u001f\t5C5WZE?B#\u001c\u001fB/\u0002\u000ey\u0011^";
      f3444[19] = "\u001bzoN2\r\u0010u~\u0001O\u0015\u0003rwH";
      f3444[20] = "8%~t\u007fb$?|(ev4<7պ";
      f3444[21] = "sB\u000eX\u0010xsB\u0019\u0004\u001cwi\t\u0019\u001a\u001cbnxHCK ";
      f3444[22] = "\u007f\n@T]3\u007f\nW\bQ<eAW\u0016Q)b0\u0001H\u0005j";
      f3444[23] = "\u001d[dBY\u007f\u0001Af\u001eCk\u0011B-΄";
      f3444[24] = "W`o]@lW`x\u0001LcM+x\u001fLvJZ.@\u0019=";
      f3444[25] = "\u000b@\ffwdVX\u001e^љ\r_\u001c\u00137\"q\u0000X\u0013\"\u0019";
      f3444[26] = "<$$?J'z,.z;0\u0005y=}\n dzf:BY?!evB8<z\">;";
      f3444[27] = "0\u007f%YnZk7sC\nԗ\u000e(%^2\fgu=L\nR2*{WkZm':3";
      f3444[28] = "nG\u0006?T\t%K\u0007%>ԌT\u0007]7]\u001cmU\u0003`\u0007l";
      f3444[29] = "HvOGPP\u001b.\u0012V(\u0383!y\u0014\u0014FEL*LIW";
      f3444[30] = "+`%@n\u0014`l$Z\u0004Ȩ\u0011 ~Hg\u0001(r \u001f=q";
      f3444[31] = "uRj-Qk'H|t(krHItNh\u001f_3xUm%N3hN\u0004tI~+P\u007fsFgd(";
      f3444[32] = "p\u0012x\u0003wUw\u001daL\u000fAv\u0013ATeC\u007fo5\u0001`\u0017\u007f\u000e=^mV\u001b\u0003gLw\u001fa\u001fhVp.";
      f3444[33] = "EBZA\u000ev\u0019\u001aY\u0011~$\u0014Yt\u001b\u001879H[\u0013\u001e7y\u0018\u0003\u001d\u0011.\u0000E^\u0013\u0002K";
      f3444[34] = "ut|\n\u0001\u0011),\u007fZq@3zcl\rV(us7\u001eS;,gQ\u0015\u00101t\u001c\nHM&veW\u0015C5\u0013!\u000e\u0010C,j|S\u001ePI/$\\\u0012\\p}z\u000bH,t*}X\u0014U)wsKq";
      f3444[35] = "Q\bYsR8\n@\u000fi6ʗo\fSp\u000b}\u001dIO\"\u0007";
      f3444[36] = "f)\u0003\u0002TYa\"\u0013\f7L>\"\rP^@\u0007,\r@Z&iy\u0006\u0004SGa&\u000bE7";
      f3444[37] = "\u0019\u001eX&`xD\u0006J\u001ea|\b?\\{c\u0011\u0018\u001bDf?k\u0004\u0014^a\u000e";
      f3444[38] = "\u0018\u001d\u001fkumD]\u00019EΌuA\u0004q=e\u000f]\u000bk:T\u0019O\u0017xt.\u0005@\r\u007fE";
      f3444[39] = "\u007fMYwpa \tYbKr+\n+\"sv%\u0006\u0012p-!\u007fvB/p%<\u0013Bn'pF";
      f3444[40] = "`F\u0005YB\u000b<\u001e\u0006\t2Y1]>\u0018HW:N:\u0005^J<!\t\u0006CNm[\u0015\tYI\\\u001c\\\u0005]S%A\u0001\u000bN6";
      f3444[41] = "sx\u0013\u001cH^,<\u0013\tsY+1\fuO\u001a! \u0011L\u001dDvza";
      f3444[42] = "\u0000m?enp\tb6.\u0004-\u0003./yh\u001fRis!<H\u00020>f52\u001e?$a\u0004&\u0000==';\"U-w\u001e";
      f3444[43] = "\r\u001aK\u000e\u0002\b^B\u0016\u001fzǱd\u0013\u0018\nJ[Y\u0006\u0010\u0012\ne";
      f3444[44] = " 18$\u0012\u0018!-9&,\u0005}=\u001a$J\u0016J,2/A\u0010};T\u007fK\n-1i#\u0013\t}A";
      f3444[45] = "n5/&\u0003Z05<q8\t2(\u001a \\\u001b2T-x\u0003^%1-9T\u000b_";
      f3444[46] = "A\u0001\u001b\u0012/P\u0007\t\u0011W^ɬxXZ\r4J@\u0003\u0012[.";
      f3444[47] = "~4}li8\u007f(|nW%#8Zl3-4D-3<)>}\u007fmksNx)`4:w*w7nJ";
      f3444[48] = "KniUXV\rfc\u0010)Ҭrdu@\u0011F\u001b9mR";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f3444[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3445[var4]);
            f3444[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m196(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m197(Class var0, String var1, Class var2) {
      Field var3 = m196(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m197(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m198(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f3444[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3445[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f3444[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3444[var4] = var13;
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
               var12 = m195(1041226318391666L, 0L);
            }
         }
      }
   }

   public static Method m199(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m200(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m199(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m200(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m201(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f3444[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3445[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m195(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m199(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f3444[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(1041226318391666L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m200(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f3444[var4] = var19;
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
               var23 = m195(1041226318391666L, 0L);
            }
         }
      }
   }

   public static MethodHandle m202(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'p' && var8 != 'Q' && var8 != 229 && var8 != '$') {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'P') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 205) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'p') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'Q') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 229) {
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

   public static Object m203(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m202(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(MacroListEntry.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ų" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
