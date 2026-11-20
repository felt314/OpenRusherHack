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
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.MathUtils;

public class Class129 extends Renderer532 {
   public boolean f2764;
   public float f2765;
   public static long f2766 = Class066.m4320(-6278736259027537212L, -1048331951729060978L, MethodHandles.lookup().lookupClass()).m4325(170099540649606L);
   public static Object[] f2767 = new Object[47];
   public static String[] f2768 = new String[47];

   public Class129(Class212 var1, int var2, Class212 var3) {
        super(var1, var2, var3);
      long var4 = f2766 ^ 12600006824842L;

      this.f2764 = false;
      this.f2765 = (float)(((org.rusherhack.Renderer107)(super.f8551)).getWidth() - 2.0);
   }

   @Override
   public double m191() {
      return this.f2765;
   }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
      this.f2764 = false;
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      this.f2764 = true;
      super.mouseClicked(var1, var3, var5);
      return true;
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   static {
      m194();
   }
   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f2768[var4] != null) {
         return var4;
      } else {
         Object var5 = f2767[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 58;
               case 1 -> 25;
               case 2 -> 7;
               case 3 -> 27;
               case 4 -> 24;
               case 5 -> 61;
               case 6 -> 48;
               case 7 -> 52;
               case 8 -> 36;
               case 9 -> 62;
               case 10 -> 26;
               case 11 -> 23;
               case 12 -> 14;
               case 13 -> 31;
               case 14 -> 42;
               case 15 -> 51;
               case 16 -> 54;
               case 17 -> 15;
               case 18 -> 57;
               case 19 -> 13;
               case 20 -> 8;
               case 21 -> 19;
               case 22 -> 38;
               case 23 -> 28;
               case 24 -> 56;
               case 25 -> 49;
               case 26 -> 33;
               case 27 -> 44;
               case 28 -> 53;
               case 29 -> 20;
               case 30 -> 39;
               case 31 -> 0;
               case 32 -> 45;
               case 33 -> 1;
               case 34 -> 30;
               case 35 -> 43;
               case 36 -> 6;
               case 37 -> 11;
               case 38 -> 37;
               case 39 -> 9;
               case 40 -> 63;
               case 41 -> 59;
               case 42 -> 55;
               case 43 -> 50;
               case 44 -> 40;
               case 45 -> 32;
               case 46 -> 2;
               case 47 -> 10;
               case 48 -> 12;
               case 49 -> 35;
               case 50 -> 29;
               case 51 -> 4;
               case 52 -> 41;
               case 53 -> 18;
               case 54 -> 47;
               case 55 -> 16;
               case 56 -> 5;
               case 57 -> 3;
               case 58 -> 22;
               case 59 -> 34;
               case 60 -> 17;
               case 61 -> 21;
               case 62 -> 46;
               default -> 60;
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

            f2768[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f2767[0] = "\rt)A}'\u0011n+\u001dg3\u0001m`\fc;\u0007h:An\"\u000b(=\n{&\u000bh)AL=\u000ei<<j&\u0016o \b";
      f2767[1] = int.class;
      f2768[1] = "java/lang/Integer";
      f2767[2] = "\u001e*vC\u0004w\u00020t\u001f\u001ec\u00123?ŉ";
      f2767[3] = float.class;
      f2768[3] = "java/lang/Float";
      f2767[4] = "m*~L\n\u0006q0|\u0010\u0010\u0012a37\u0001\u0017\u0001gvj\u0007\f\u0007k6~L+\u0016v,p\f\u001f";
      f2767[5] = "\u001fPBV^m\u0014_S\u0019?c\u001fTWC";
      f2767[6] = void.class;
      f2768[6] = "java/lang/Void";
      f2767[7] = "|wdy6\u0004ab<[w\tyd";
      f2767[8] = "\u001a,";
      f2767[9] = ",f";
      f2767[10] = "\u0006O~X,:\u001aU|\u00046.\nV7\u0084";
      f2767[11] = double.class;
      f2768[11] = "java/lang/Double";
      f2767[12] = "Ed6?`YY~4czMI}\u007fȗ";
      f2767[13] = "(\f{W!D4\u0016y\u000b;P$\u00152Ү";
      f2767[14] = "^v@&f\u0016BlBz|\u0002Ro\tk{\u0011T*R|}\u000fB*dgx\fCQSax\u0010";
      f2767[15] = "4sc\u0015Gi(iaI]}8j*ɏ";
      f2767[16] = "j{\u001bWD\bva\u0019\u000b^\u001cfbRѓ";
      f2767[17] = "z0u/\u0014(f*ws\u000e<v)<ʩ";
      f2767[18] = "\u001ahdX\u000e\u001e\u0006rf\u0004\u0014\n\u0016q-\u0015\u0010\u0002\u0010twX\u001d\u001b\u001c4q\u0013\u0012\u000f\u0010h-?.\u000e\u001b~f\u0004\u0019\u0019G^";
      f2767[19] = "\u0016\u00046\u0016 >\n\u001e4J:*\u001a\u001d\u007fƈ";
      f2767[20] = boolean.class;
      f2768[20] = "java/lang/Boolean";
      f2767[21] = "L^\u0018Y$&PD\u001a\u0005>2@GQ\u00149!F\u0002\n\u0003??P\u00022\u0016\";vX\u0016\u001b%";
      f2767[22] = " \f\u0015A4*tZ\u000bXO˞\u0019Y\u0010\u0012&'|\u0003\f\u0014)";
      f2767[23] = "=D\u001a6H3wA\u001d\u007f0ծ\rW\u0018t\tkw[\t(0";
      f2767[24] = ",\u001bOY+Fc\u0012\r8+\u0017a1W@$\u0013\u001d\b]\u0002}\u001fg\u0004L^D";
      f2767[25] = "f\u0005<LxL0\u0001!C\tЀW\u00008Ru\f.V&\u0011d";
      f2767[26] = "\u0013X|TlC\\Q>5l\u0012^amY\u0003\u000fL\u00019Py\u0003]]\u0000";
      f2767[27] = "\u0003\u000bAFM+\u0001\u0006RE#w\u0012\u001ePuBa\u0003\u0013By^g\f\u0016IS#$\u0012\tS\u000fZr\fJB>\u001ca\u0016\u000b\u001eGJ\u007fU\u001a/\u0001Ye\u0014FVWG&\u0005w\u0015F\u001br\u000e\u0012OZ\u001d}h\u0007A\u0004\u001a~\u0012\u000bPX#'\u0005\u001cHERa\u0016\u000fP>";
      f2767[28] = "PI2i+)\u0006M/fZȖa\u001fq{<5\u000f\u000e'1<";
      f2767[29] = "K^>hF/\u001f\b q=ŏr]12X8\t\u000b\u007f<\u0003";
      f2767[30] = "\u001ceC\u001awlJa^\u0015\u0006r@#g\u0017`q@%P\u0000\u0006vQ1E\u00146t\\\"Fz";
      f2767[31] = "\u0000\u00155\u0004s,\u0011C\u007f\u0004\u001eӶl\u0019$\u001e\u007f-PV-\\";
      f2767[32] = "x9dE[A:dgJ7ѼGe}XK\u000f>3c\u001bZ>";
      f2767[33] = "\n?\u0005\u001eBjXn\u0016\u0019 ɝ`;\u0011\u001dI`\u0005a\r\u001bF";
      f2767[34] = "B0}Sjp\r9?2j!\u000f\u001c{_h*s#o\b<)\t/~T\u0005";
      f2767[35] = "IgjU{DJ%e\u0001@]\u001f#_\u0003$[\u001f_:\u0013-_\u001e#9\u0017/\u0019rcl\u0001']\u0003%\u007f\u0012?&";
      f2767[36] = "ea7N%F;hlLZ\u007f\u0016Z J\u001a~\u0013\u0010,C`\u001c<j R<%)~f\u0014?_%o:-*Kc)9W&Z?\u0010bI8@%{7]j\\Y.8O?Y2{,\u001d#%";
      f2767[37] = "Mr\u0010.SN\u000f/\u0013!?ʌr.\t3C\u0000\u000bx\u0017pR1";
      f2767[38] = "`|r\u0012xj\"!q\u001d\u0014z2cN\u0010xi?\u001f.\u000bjinfx\u0015)x_";
      f2767[39] = "5^\u0015j>\u001dc\u001e\u0011}]\u0001&\u000f\u000fa%\u0014&\u000b\u000fq,}`\u0017\u0002y\"\u001e>\u001eY{]\r2\\P\u007f'\u0001#\u0000i&,\u0016?\u0019\nx%M=f";
      f2767[40] = "\u00172\u001c\u0000[ACd\u0002\u0019 C.7YPM@Dg\u0005\u0010I*DeZ\u0006J@\u00149\u001a\u0002 ";
      f2767[41] = "?5V'l\u000emdE \u000eϰU4@brS,b^!cbjqD`?\u001b<o\u0007q\u000e\u0012;1\u0003yt\u001e*m:";
      f2767[42] = "\u0016J2V2-\u0001H3X\nȔ}\u001b4\njz\u0012\f6\u000bd";
      f2767[43] = "qad\u001b-$`7.\u001b@̿\u001d6(\u0011{(qdy\u0002|";
      f2767[44] = "m0N\u0010\u0002g\"9\fq\u00026 \u0019V\f\u0000[,=\bH\b! ,Tq";
      f2767[45] = "Bh}\u001fC&Uj|\u0011{\u0016)h9G\u0012/L2%A\u001dI\u0013*y\u0016\u001d,I6\u007f\u0019{sQj(\u0019\u001e)Ml'\u007fA1\u0011;'\u001a\u001b-\u00174AE\u0003q@4$\u001f\u001fwOR}\u0012\u0010.R#;\u0001\u00036)";
      f2767[46] = "\u0017BkInw\t\u001dhU\u0001n\u001d\u0015lL\u0001:\u0003\u0002u\u0005xl\u001dAd4>\u007f\u0007\u00008MhaD\u0011\t\u000b{{\u0005Mp]e8\u0014|6N\u007fyH\u0005`P<hy";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f2767[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f2768[var4]);
            f2767[var4] = var5;
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
      Object var5 = f2767[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f2768[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f2767[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f2767[var4] = var13;
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
               var12 = m195(379183257045799L, 0L);
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
      Object var5 = f2767[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f2768[var4];
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
               f2767[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(379183257045799L, 0L);
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
                     f2767[var4] = var19;
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
               var23 = m195(379183257045799L, 0L);
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
         if (var8 != 250 && var8 != 181 && var8 != 'u' && var8 != 'g') {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'q') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 193) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 250) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 181) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'u') {
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

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class129.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ĥ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
