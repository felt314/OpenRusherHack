package org.rusherhack;

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
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;
import org.rusherhack.client.api.Globals;
import org.rusherhack.core.command.argument.StringCapture;

public class Class600 implements AutoCloseable {
   public boolean f9486;
   public Identifier f9487;
   public int f9488;
   public int f9489;
   public long f9490;
   public NativeImageBackedTexture f9491;
   public static long f9492 = Class066.m4320(5800432865747417666L, 5788952714768090518L, MethodHandles.lookup().lookupClass()).m4325(86665186665722L);
   public static String f9493;
   public static Object[] f9494 = new Object[35];
   public static String[] f9495 = new String[35];

   @Override
   public void close() {
      if (this.f9491 != null) {
         this.f9491.close();
      }
   }

   public void m18219(NativeImage var1) {
        
    }

   public Class600() {
      super();
      this.f9491 = null;
      this.f9487 = null;
      this.f9490 = System.currentTimeMillis();
      this.f9486 = false;
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

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f9495[var4] != null) {
         return var4;
      } else {
         Object var5 = f9494[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 14;
               case 1 -> 10;
               case 2 -> 41;
               case 3 -> 7;
               case 4 -> 43;
               case 5 -> 58;
               case 6 -> 37;
               case 7 -> 31;
               case 8 -> 36;
               case 9 -> 27;
               case 10 -> 54;
               case 11 -> 62;
               case 12 -> 24;
               case 13 -> 44;
               case 14 -> 38;
               case 15 -> 51;
               case 16 -> 6;
               case 17 -> 18;
               case 18 -> 32;
               case 19 -> 47;
               case 20 -> 26;
               case 21 -> 23;
               case 22 -> 57;
               case 23 -> 15;
               case 24 -> 3;
               case 25 -> 39;
               case 26 -> 49;
               case 27 -> 19;
               case 28 -> 30;
               case 29 -> 16;
               case 30 -> 2;
               case 31 -> 40;
               case 32 -> 11;
               case 33 -> 33;
               case 34 -> 50;
               case 35 -> 8;
               case 36 -> 42;
               case 37 -> 48;
               case 38 -> 25;
               case 39 -> 53;
               case 40 -> 20;
               case 41 -> 45;
               case 42 -> 29;
               case 43 -> 55;
               case 44 -> 60;
               case 45 -> 34;
               case 46 -> 46;
               case 47 -> 13;
               case 48 -> 59;
               case 49 -> 63;
               case 50 -> 35;
               case 51 -> 9;
               case 52 -> 12;
               case 53 -> 52;
               case 54 -> 22;
               case 55 -> 0;
               case 56 -> 5;
               case 57 -> 1;
               case 58 -> 21;
               case 59 -> 28;
               case 60 -> 17;
               case 61 -> 61;
               case 62 -> 4;
               default -> 56;
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

            f9495[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f9494[0] = "X\u0017%Y7\fX\u00172\u0005;\u0003B\\2\u001b;\u0016E-`GnV";
      f9494[1] = void.class;
      f9495[1] = "java/lang/Void";
      f9494[2] = "\u00052\u001e^[D\u00052\t\u0002WK\u001fy\t\u001cW^\u0018\b[@\u0007\u001c";
      f9494[3] = "cn_4N\u0017\u007ft]hT\u0003ow\u0016Ȝ";
      f9494[4] = int.class;
      f9495[4] = "java/lang/Integer";
      f9494[5] = "j)1l>Tv330$@f0xԲ";
      f9494[6] = boolean.class;
      f9495[6] = "java/lang/Boolean";
      f9494[7] = "\u0018\t:2%9\u0004\u00138n?-\u0014\u0010s\u007f;%\u0012\u0015)26<\u001eU\u001ap8.\u0016\u0017.";
      f9494[8] = "p[lf3 p[{:?/j\u0010{$?:ma+yn";
      f9494[9] = "\u001f7\u001c,!\u0003\u0003-\u001ep;\u0017\u0013.Ua<\u0004\u0015k\u0018m>\u001b\u0011+\u001f,2\u0004\u00170\u0016g=\u0002^\u0016\u000fp:\u0018\u0017\u0006\u001ar'\u0003\u0002 ";
      f9494[10] = ".&.Mmi%)?\u0002\u0010q6.6K";
      f9494[11] = "Z\u00014Yw|Z\u0001#\u0005{s@J#\u001b{fG;qG,%";
      f9494[12] = "[hS<nV[hD`bYA#D~bLFR\u0015+5\u000f";
      f9494[13] = "\u0015IE\b\u0001*\tSGT\u001b>\u0019P\fɒ";
      f9494[14] = long.class;
      f9495[14] = "java/lang/Long";
      f9494[15] = "Y\u0007\u0003\u0006lPR\b\u0012I\u0011E@\u0012\u0010\n";
      f9494[16] = "-2sK+\u0018&=b\u0004J\u0016-6f^";
      f9494[17] = "\u0010MP1\\GHQ^HWW\rN[$e\u0006L\u0014\u0000H\u000b\u0005\u0018\u0013\rxVAAV<";
      f9494[18] = "mrz7}\u001a5ntNv\npqq\"D[1+(N*\u0016fwq<\"\u0016~*\u0016w,\u000e1 &*hWt\u0011";
      f9494[19] = "\u001ai2/\u001bQ[cgo+ȳ 80;M\u0013I{<2Bj";
      f9494[20] = ">\u001abCGp5\u0010cA Ҧ\u0005\u0001\u007fRYqxYc\\";
      f9494[21] = "nw'\u0017\u0016\u00046k)n\u0013\u001dho&nAFf)z^\u001c\u0002?lK";
      f9494[22] = "45q,_\u001c??p.8Ԩ\u000fsl>[\u0012lv}!U";
      f9494[23] = "\nM\u0006\t\u0000G\u0001G\u0007\u000bgк1\f\u0017\u001e\u0001QXO\u001b\u0017\u000e";
      f9494[24] = "w\u001fE\u00040k\u007f\u001f]YW|#\u0012O\u0005;NrU\u0017]W\"!\u0004I\u001b>a-\rFb";
      f9494[25] = "h\u0016NcCF`\u0016V>$Q<\u001bDbHcm\\\u001e>$\u000f>\rB|ML2\u0004M\u0005";
      f9494[26] = "\u00121)\u0010D}Hdh\u0010<&D\r+A\u0002s\u001e|.\u0012N!";
      f9494[27] = "G\u0011ppV\u000b\u0019\u0011j1'DyO*s\u001e\u0015D\u001cucFhFAf7ZU\u0015\u001evo'";
      f9494[28] = "\u001d,\"c\u000ee\u0013jyhjnO)!?\u0006\\\u001ekxgj4\u0013(x%WgL8 X\u000bhN,/%St@Uq4\fk\u001d4,=\u0006o\"";
      f9494[29] = "D\u001frR-\u0015O\u0015sPJ\u0013\u007fT4\u001e7\u0015\u0003_e\u0012*zN]=R%\u0006E\f1OJ";
      f9494[30] = "{eZ\tI9po[\u000b.Լ@/H\u0012Ni!rA\u0018J";
      f9494[31] = "\u001fNLF&e\u0014DMDAƥ$\u000f]Q'sMLQX(";
      f9494[32] = "w\u001f\t\u000e\u0016srLE\\'g$[WYKUp\u001a\f\u0007'=0D\fZI3v\u001f\u0007>";
      f9494[33] = "l8\u0006)\u0007Xg2\u0007+`vW+\u00132\u0006R4;\u0018n\u001f";
      f9494[34] = "\nV0|Pj\u0013]5u,a\u001eLqjJv?Wnjik\u0007Rj|,c\bPmbOs\u0003\ft\u0007";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f9494[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f9495[var4]);
            f9494[var4] = var5;
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
      Object var5 = f9494[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f9495[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f9494[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f9494[var4] = var13;
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
               var12 = m123(1138577674393373L, 0L);
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
      Object var5 = f9494[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f9495[var4];
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
               f9494[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(1138577674393373L, 0L);
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
                     f9494[var4] = var19;
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
               var23 = m123(1138577674393373L, 0L);
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
         if (var8 != 192 && var8 != 165 && var8 != 221 && var8 != 195) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 181) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'r') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 192) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 165) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 221) {
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

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class600.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/հ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
