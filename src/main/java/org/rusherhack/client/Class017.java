package org.rusherhack.client;
import org.rusherhack.*;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class316;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.graphic.VectorGraphic;

public class Class017 extends Renderer020 {
   public VectorGraphic f274;
   public static long f276 = Class066.m4320(4700026122296965548L, -7076314816692347481L, MethodHandles.lookup().lookupClass()).m4325(176641022967636L);
   public static String f277;
   public static long[] f278;
   public static Integer[] f279;
   public static Map f280;
   public static Object[] f281 = new Object[25];
   public static String[] f282 = new String[25];

   @Override
   public double getHeight() {
      return this.getFontRenderer().getFontHeight() + 2.0;
   }

   @Override
   public void m550() {
        
    }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      long var6 = f276 ^ 138979437969301L;
      int[] var8 = Class055.m3218();
      Class017 var10000 = this;
      if (var8 == null) {
         if (this.f274 == null) {
            return;
         }

         var10000 = this;
      }

      double var9 = ((org.rusherhack.client.Class017)(var10000)).getHeight() - 3.0;
      var10000.getRenderer().drawGraphicRectangle(this.f274, 1.5, 1.5, var9, var9);
   }

   public Class017(Renderer054 var1, Renderer054 var2) {
    }

   @Override
   public double getWidth() {
      long var1 = f276 ^ 104299967877987L;
      return ((org.rusherhack.client.Class017)(this)).getHeight();
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
      if (f282[var4] != null) {
         return var4;
      } else {
         Object var5 = f281[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 13;
               case 1 -> 16;
               case 2 -> 5;
               case 3 -> 12;
               case 4 -> 18;
               case 5 -> 31;
               case 6 -> 25;
               case 7 -> 59;
               case 8 -> 8;
               case 9 -> 3;
               case 10 -> 30;
               case 11 -> 29;
               case 12 -> 36;
               case 13 -> 14;
               case 14 -> 35;
               case 15 -> 6;
               case 16 -> 26;
               case 17 -> 48;
               case 18 -> 52;
               case 19 -> 21;
               case 20 -> 1;
               case 21 -> 15;
               case 22 -> 53;
               case 23 -> 49;
               case 24 -> 47;
               case 25 -> 20;
               case 26 -> 41;
               case 27 -> 63;
               case 28 -> 19;
               case 29 -> 51;
               case 30 -> 50;
               case 31 -> 39;
               case 32 -> 62;
               case 33 -> 37;
               case 34 -> 46;
               case 35 -> 56;
               case 36 -> 17;
               case 37 -> 44;
               case 38 -> 40;
               case 39 -> 23;
               case 40 -> 11;
               case 41 -> 58;
               case 42 -> 34;
               case 43 -> 45;
               case 44 -> 24;
               case 45 -> 2;
               case 46 -> 22;
               case 47 -> 43;
               case 48 -> 32;
               case 49 -> 27;
               case 50 -> 61;
               case 51 -> 4;
               case 52 -> 33;
               case 53 -> 42;
               case 54 -> 10;
               case 55 -> 60;
               case 56 -> 0;
               case 57 -> 9;
               case 58 -> 57;
               case 59 -> 28;
               case 60 -> 7;
               case 61 -> 55;
               case 62 -> 54;
               default -> 38;
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

            f282[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f281[0] = "\u00026e#\u0002w\u001e,g\u007f\u0018c\u000e/,n\u001ck\b*v#>";
      f281[1] = "\u001aU\u001c\f51\u0006O\u001eP/%\u0016LUA+-\u0010I\u000f\fѸ";
      f281[2] = void.class;
      f282[2] = "java/lang/Void";
      f281[3] = "bHZxnE~RX.tQnQ\u0013Ȣ";
      f281[4] = "MRqT\r\"QHs\b\u00176AK8\u0019\u0013>GNbT\u001e'K\u000ed\u001f\u00113GR8\u001d\r6RH\u007f\u0019Q\u0001GCb\u0015\r\u0010PAf\u0012\u00164";
      f281[5] = "fJv'1/zPt{+;jS?j/3lVe'Ӽ";
      f281[6] = "i*";
      f281[7] = double.class;
      f282[7] = "java/lang/Double";
      f281[8] = "W\u00028C\u0012aK\u0018:\u001f\bu[\u001bq\u000e\f}]\u001e+C©";
      f281[9] = "\u000bJCiI\u007f\u0017PA5Sk\u0007S\n$Wc\u0001VPiZz\r\u0016V\"Un\u0001J\n\u000eio\n\\A5^xV|";
      f281[10] = "\\~L;In@dNgSzPg\u0005vWrVb_;ZkZ\"YpU\u007fV~\u0005rIzCdBv\u0015Rt~JeSrP";
      f281[11] = "7:' #j+ %|9~;#nm=v=&4 0o1f2k?{=:nh>q,f\tH>q,\u001a%`5z*-2";
      f281[12] = "YT?%\u0012\u001dR[.jo\u0005A\\'#";
      f281[13] = "X\u001aY?\u0015\u001cS\u0015Hpt\u0012X\u001eL*";
      f281[14] = "\u000e5@\u0015\\\u0006\u0012(C|պa\u00154]\fU\u0011\u0011)Z";
      f281[15] = "#\u0011W\u0014\u00106bV\u0014\u0006{ǹ\u0019XDG\u001dme\u0012V\u0005\u0012\r)\u0006\u0016\u001d\u001bqc\u0014T\u0012{";
      f281[16] = "\u0005\u00060\\\u0005?\u0019\u001b35\u0002X[\u00051Z\u0000c\u001aBrHkb\u0018\u0001#^P#_B15";
      f281[17] = ")[\u0015LL 5F\u0016%M*1a\u0004DM'1!T\u0019G+/Y\u0019_\u001a9M";
      f281[18] = "&o,|l\u000e:r/\u0015эiy%mx8\u0014%g;q";
      f281[19] = "^D\u0007\u00168k\u0004\u0012\u0006\u000fYi\r\u00031\u001d?j\r\u0005\u0006\nY8\u001fG\u0012\u0012gl\r\u0007\u0007p";
      f281[20] = "\fOd<B\u0002\u000e\fe)?ԝ7\r5)E\u0002UT0#\u0007a";
      f281[21] = "\u0010J=WT\u0016]\u00176\u0011n\u001bM\bB\u000b\b\b`\u0019m\u0003\u000e\b I0\t\u0002\u0016X\u0004vT\u0010t";
      f281[22] = "_\u0003)\u0011*@\u0005U(\bKB\fD\u000b\u0010-Q;U#\u001b&W\fBEGu\u001cZ\u0002'\n(\u0017\u001c8";
      f281[23] = "q^] RAuCZPӗ17HM3\b\f7\\^=5";
      f281[24] = "o,\f\u0017]\u0001;>L\u0002?S+:K!EV)3U\u0005eR:/]\bP[<S\u000bWFX+7W\u0007C[Qn\b\u000bS])#NVA?loQ\u0002]G!)\f\u0010?\u0002m6X\fGO+kJn\u0002\u00034?V\u0016OEi-4WRN2n\tWF]<S";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f281[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f282[var4]);
            f281[var4] = var5;
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
      Object var5 = f281[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f282[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f281[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f281[var4] = var13;
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
               var12 = m195(979814582597282L, 0L);
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
      Object var5 = f281[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f282[var4];
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
               f281[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(979814582597282L, 0L);
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
                     f281[var4] = var19;
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
               var23 = m195(979814582597282L, 0L);
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
         if (var8 != 246 && var8 != 214 && var8 != 'a' && var8 != 'w') {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'B') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'E') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 246) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 214) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'a') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class017.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/N" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
