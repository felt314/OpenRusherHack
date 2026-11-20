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
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.core.command.CommandUtils;

public class Class149 extends Renderer202 {
   public static long f3104 = Class066.m4320(-3024637487990879524L, 654857773812361159L, MethodHandles.lookup().lookupClass()).m4325(168425236209152L);
   public static String f3105;
   public static Object[] f3106 = new Object[33];
   public static String[] f3107 = new String[33];

   public Class149(Renderer273 var1, Renderer273 var2) {
    }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   static {
   }
   public static String m171(byte[] var0) {
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

   public static int m156(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3107[var4] != null) {
         return var4;
      } else {
         Object var5 = f3106[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 4;
               case 1 -> 61;
               case 2 -> 30;
               case 3 -> 56;
               case 4 -> 35;
               case 5 -> 60;
               case 6 -> 25;
               case 7 -> 0;
               case 8 -> 59;
               case 9 -> 63;
               case 10 -> 24;
               case 11 -> 31;
               case 12 -> 8;
               case 13 -> 18;
               case 14 -> 57;
               case 15 -> 62;
               case 16 -> 15;
               case 17 -> 34;
               case 18 -> 26;
               case 19 -> 23;
               case 20 -> 27;
               case 21 -> 58;
               case 22 -> 16;
               case 23 -> 43;
               case 24 -> 54;
               case 25 -> 28;
               case 26 -> 39;
               case 27 -> 32;
               case 28 -> 55;
               case 29 -> 41;
               case 30 -> 7;
               case 31 -> 17;
               case 32 -> 13;
               case 33 -> 20;
               case 34 -> 1;
               case 35 -> 52;
               case 36 -> 19;
               case 37 -> 38;
               case 38 -> 29;
               case 39 -> 53;
               case 40 -> 51;
               case 41 -> 48;
               case 42 -> 37;
               case 43 -> 9;
               case 44 -> 46;
               case 45 -> 5;
               case 46 -> 21;
               case 47 -> 49;
               case 48 -> 45;
               case 49 -> 12;
               case 50 -> 2;
               case 51 -> 40;
               case 52 -> 47;
               case 53 -> 22;
               case 54 -> 11;
               case 55 -> 14;
               case 56 -> 44;
               case 57 -> 42;
               case 58 -> 36;
               case 59 -> 6;
               case 60 -> 50;
               case 61 -> 33;
               case 62 -> 10;
               default -> 3;
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

            f3107[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m786() {
      f3106[0] = "*\fTyl\u000e6\u0016V%v\u001a&\u0015\u001d4r\u0012 \u0010Gy\u007f\u000b,PU2\u007f\u000f0\fVys\u0014!\u000b_206*\u001aF;{8$\nV0q\t<";
      f3106[1] = "p\u00038H\u000b\u0007l\u0019:\u0014\u0011\u0013|\u001aq\u0005\u0015\u001bz\u001f+H\u0018\u0002v_*\u000fW7s\u00142\u0003\u0017\u0006]\u0010,\u0003";
      f3106[2] = double.class;
      f3107[2] = "java/lang/Double";
      f3106[3] = void.class;
      f3107[3] = "java/lang/Void";
      f3106[4] = "WsE#3kKiG\u007f)\u007f[j\fŊ";
      f3106[5] = "?\\=83C#F?d)W3Etȱ";
      f3106[6] = "dC]*B[xY_vXOhZ\u0014ɰ";
      f3106[7] = "\u0016h'R?\u0003\nr%\u000e%\u0017\u001aqnɺ";
      f3106[8] = int.class;
      f3107[8] = "java/lang/Integer";
      f3106[9] = "-Qm}X)3Yw2322]V}\u0006";
      f3106[10] = "\u0013*h>.\u007f\u000f0jb4k\u001f3!s0c\u00196{>=z\u0015vzyrz\u001d6j|rZ\u001d6j|\u001ek\u000f=";
      f3106[11] = boolean.class;
      f3107[11] = "java/lang/Boolean";
      f3106[12] = "&-rHu&-\"c\u0007\u0019%# aH5";
      f3106[13] = "\u0005]Z'\"H\u0019GX{8\\\tD\u0013Ʉ";
      f3106[14] = "XJ~\u0017:IDP|K ]TS7Z'NR\u0016j\\<H^V~\u0017\nSXT|X&oRLmP&[";
      f3106[15] = "Q&Pm\r\u0002M<R1\u0017\u0016]?\u0019 \u0010\u0005[zD&\u000b\u0003W:Pm,\u0012J ^-\u0018";
      f3106[16] = "\u0013i\u0013  V\u0018f\u0002oAX\u0013m\u00065";
      f3106[17] = "9W\u0015\\:w%M\u0017\u0000 c5N\\Ǔ";
      f3106[18] = "w\"c5ur\"\u007f,P\u0007G]\u000f\u001b\fLh||8i==!3";
      f3106[19] = "[`\rJn\u0005J$@1iWYN}\bc\u0003\u001bb\f\n|\nO\u001eG\n~KJx\u0011\bs\n%";
      f3106[20] = "\"[>\u0015n03\u001fsn}b uNWc6bY?U|?6%";
      f3106[21] = "wc8v\u0007Ktf#g?ҥLe!-\\Ut.e&B";
      f3106[22] = ".\u0001^\u0001nA-\u0004E\u0010VQ\u0015\u0000\b\u00107\bt[]Q<8)\fH\u0001fYrY\t\nV";
      f3106[23] = ">2t=Koi?qp.ճ\u0003c#vP|>fj/N\u0013";
      f3106[24] = "l (Q8n'd#O_ƳWayI%,oa\u007f\n:";
      f3106[25] = "7=@[Rj&y\r A85\u00120\u0019_lw?A\u001b@e#C";
      f3106[26] = "+IW,v\u001a:\r\u001aWqH)f'n{\u001ckKVld\u0015?7\u001dlfT:QKnk\u0015U";
      f3106[27] = ".\u0004t1EBk[`?$Ej+s8HIwk--\u001fM)\ntd\\@\u0011";
      f3106[28] = ":c\u0018\u0002Osf{\u0017\u0017$~mb\u0002\u0016MrTl\u0002\u0006I\u00145|]\u0012\u001cul5\u001e\u001f$";
      f3106[29] = "U.f\r\u00011\u0018n>Z~Ƽd/x\n\u0005o\u0001&g\n\u0010";
      f3106[30] = "Q}\u0014.n\\Ys\t.\fMUd8+h_U\u0018\f-3@E|\u000f2l\u001b8";
      f3106[31] = " \nnqc) \f-n\u0019~s\u001d\u0015av.|\u001cqbiq'a\u007fd&sc\u0005|{y(\u001e";
      f3106[32] = "\u000fz\u0004\u000bkm\u0014k\r\u000b\u0017s\th|[vs\u0004h<\u000ff%ZhM\ry,\u000e\u0014";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f3106[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3107[var4]);
            f3106[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m159(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m160(Class var0, String var1, Class var2) {
      Field var3 = m159(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m160(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m161(long var0, long var2) {
      int var4 = m156(var0, var2);
      Object var5 = f3106[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3107[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f3106[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3106[var4] = var13;
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
               var12 = m158(1162889039652085L, 0L);
            }
         }
      }
   }

   public static Method m162(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m163(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m162(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m163(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m164(long var0, long var2) {
      int var4 = m156(var0, var2);
      Object var5 = f3106[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3107[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m158(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m162(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f3106[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(1162889039652085L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m163(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f3106[var4] = var19;
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
               var23 = m158(1162889039652085L, 0L);
            }
         }
      }
   }

   public static MethodHandle m165(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 198 && var8 != 'j' && var8 != 232 && var8 != 249) {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 242) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 230) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 198) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'j') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 232) {
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

   public static Object m166(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m165(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m671(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class149.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ň" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
