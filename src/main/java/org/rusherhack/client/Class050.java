package org.rusherhack.client;
import org.rusherhack.*;

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

public class Class050 {
   public String client_id;
   public String scope;
   public static long f1327 = Class066.m4320(3885474287228760835L, 2168703699236002274L, MethodHandles.lookup().lookupClass()).m4325(85437668891666L);
   public static String[] f1328;
   public static String[] f1329;
   public static Object[] f1331 = new Object[11];
   public static String[] f1332 = new String[11];

   @Deprecated
   public Class050(String var1) {
      this(var1, false);
   }

   public Class050(String var1, boolean var2) {
      super();
      this.client_id = var1;
      this.scope = "XboxLive.signin" + (var2 ? " offline_access" : "");
   }

   public Map<String, String> m3146() {
      long var1 = f1327 ^ 122700748180301L;
      HashMap var4;
      (var4 = new HashMap()).put("client_id", ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ë", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), this,  3755449098213685009L,  var1))));
      var4.put("scope", ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ë", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), this,  3755359626388936028L,  var1))));
      return var4;
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
      if (f1332[var4] != null) {
         return var4;
      } else {
         Object var5 = f1331[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 0;
               case 1 -> 50;
               case 2 -> 49;
               case 3 -> 40;
               case 4 -> 57;
               case 5 -> 14;
               case 6 -> 45;
               case 7 -> 28;
               case 8 -> 3;
               case 9 -> 42;
               case 10 -> 7;
               case 11 -> 2;
               case 12 -> 55;
               case 13 -> 51;
               case 14 -> 16;
               case 15 -> 35;
               case 16 -> 54;
               case 17 -> 59;
               case 18 -> 25;
               case 19 -> 21;
               case 20 -> 22;
               case 21 -> 43;
               case 22 -> 9;
               case 23 -> 34;
               case 24 -> 17;
               case 25 -> 46;
               case 26 -> 18;
               case 27 -> 8;
               case 28 -> 60;
               case 29 -> 19;
               case 30 -> 62;
               case 31 -> 27;
               case 32 -> 63;
               case 33 -> 52;
               case 34 -> 11;
               case 35 -> 24;
               case 36 -> 41;
               case 37 -> 4;
               case 38 -> 26;
               case 39 -> 12;
               case 40 -> 31;
               case 41 -> 29;
               case 42 -> 1;
               case 43 -> 13;
               case 44 -> 36;
               case 45 -> 15;
               case 46 -> 61;
               case 47 -> 5;
               case 48 -> 44;
               case 49 -> 47;
               case 50 -> 30;
               case 51 -> 56;
               case 52 -> 38;
               case 53 -> 32;
               case 54 -> 10;
               case 55 -> 39;
               case 56 -> 58;
               case 57 -> 6;
               case 58 -> 53;
               case 59 -> 23;
               case 60 -> 33;
               case 61 -> 20;
               case 62 -> 48;
               default -> 37;
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

            f1332[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f1331[0] = "\u0018\\,)4\u0007\u0004F.u.\u0013\u0014Eed*\u001b\u0012@?)Ω";
      f1331[1] = "FHE0'>MGT\u007fZ&^@]6";
      f1331[2] = "\u000b3\t2\"0\u0015;\u0013}A$\u0011";
      f1331[3] = "\u0007g@B&\f\fhQ\rG\u0002\u0007cUW";
      f1331[4] = "yNTE)\u001aeTV\u00193\u000euW\u001d\b4\u001ds\u0012P\u00046\u0002wRWE:\u001dqI^\u000e5\u001b8oG\u00192\u0001q\u007fR\u001b/\u001adY";
      f1331[5] = ".A%&?\b2['z%\u001c\"XlȎ";
      f1331[6] = "6\\^\u007f\rKkK\u0010z}MrE.yALoFO~\rS49\u0014\u007f\u0004UpX\u00133\u001b\u000e\u000f\u0003\u0012:\u001dJn\u0004^%F5";
      f1331[7] = "\nbh/AJY; DWAP 4DVPS>i6NO\n";
      f1331[8] = "\u0004\u0006Ku\"}\u0005SLw\u001e6?M\u000ecx*MU\u0011:\u001e`ES\u00127lxZ\nt";
      f1331[9] = "Ce7A\u0016\u0012\u0010<\u007f*\u0010\u0016\u001f2`V,\u0013\u0012_|P\u001f\u0014N-dOF";
      f1331[10] = "\u0005<@veNG-Y(\tϊ>>G/o\u0001L&Xv\tKD [{{S[y=";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f1331[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1332[var4]);
            f1331[var4] = var5;
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
      Object var5 = f1331[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1332[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f1331[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1331[var4] = var13;
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
               var12 = m123(216480791960463L, 0L);
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
      Object var5 = f1331[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1332[var4];
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
               f1331[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(216480791960463L, 0L);
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
                     f1331[var4] = var19;
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
               var23 = m123(216480791960463L, 0L);
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
         if (var8 != 235 && var8 != 'W' && var8 != 170 && var8 != 210) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'M') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'x') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 235) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'W') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 170) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class050.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/ϯ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
