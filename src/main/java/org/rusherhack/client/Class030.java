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

public class Class030 {
   public String client_id;
   public String grant_type;
   public String device_code;
   public static long f1245 = Class066.m4320(-4148300446179032956L, -4380434286565354959L, MethodHandles.lookup().lookupClass()).m4325(50373363415081L);
   public static String[] f1246;
   public static String[] f1247;
   public static Object[] f1249 = new Object[12];
   public static String[] f1250 = new String[12];

   public Class030(String var1, String var2) {
        super();
      long var3 = f1245 ^ 137584399093413L;

      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ô", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), this,  "urn:ietf:params:oauth:grant-type:device_code",  -806122874446972536L,  var3);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ô", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), this,  var1,  -805983819087511693L,  var3);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ô", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), this,  var2,  -806022109692434084L,  var3);
   }

   public Map<String, String> m2952() {
      long var1 = f1245 ^ 117027899582134L;
      HashMap var4;
      (var4 = new HashMap()).put("grant_type", ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "W", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), this,  -2539180498402717285L,  var1))));
      var4.put("client_id", ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "W", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), this,  -2539037662291077280L,  var1))));
      var4.put("device_code", ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "W", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), this,  -2539053380761435825L,  var1))));
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
      if (f1250[var4] != null) {
         return var4;
      } else {
         Object var5 = f1249[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 12;
               case 1 -> 19;
               case 2 -> 59;
               case 3 -> 29;
               case 4 -> 61;
               case 5 -> 4;
               case 6 -> 60;
               case 7 -> 43;
               case 8 -> 2;
               case 9 -> 17;
               case 10 -> 15;
               case 11 -> 30;
               case 12 -> 1;
               case 13 -> 27;
               case 14 -> 56;
               case 15 -> 23;
               case 16 -> 14;
               case 17 -> 41;
               case 18 -> 46;
               case 19 -> 54;
               case 20 -> 16;
               case 21 -> 9;
               case 22 -> 52;
               case 23 -> 25;
               case 24 -> 7;
               case 25 -> 38;
               case 26 -> 26;
               case 27 -> 10;
               case 28 -> 63;
               case 29 -> 53;
               case 30 -> 62;
               case 31 -> 42;
               case 32 -> 8;
               case 33 -> 11;
               case 34 -> 31;
               case 35 -> 13;
               case 36 -> 6;
               case 37 -> 20;
               case 38 -> 32;
               case 39 -> 37;
               case 40 -> 28;
               case 41 -> 21;
               case 42 -> 35;
               case 43 -> 44;
               case 44 -> 39;
               case 45 -> 18;
               case 46 -> 47;
               case 47 -> 40;
               case 48 -> 48;
               case 49 -> 33;
               case 50 -> 58;
               case 51 -> 57;
               case 52 -> 34;
               case 53 -> 55;
               case 54 -> 22;
               case 55 -> 45;
               case 56 -> 50;
               case 57 -> 51;
               case 58 -> 24;
               case 59 -> 3;
               case 60 -> 5;
               case 61 -> 36;
               case 62 -> 49;
               default -> 0;
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

            f1250[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f1249[0] = "0\u0007)rS\t,\u001d+.I\u001d<\u001e`?M\u0015:\u001b:rȪ";
      f1249[1] = "\u007f\u001agy\u000e\\t\u0015v6sDg\u0012\u007f\u007f";
      f1249[2] = "&9%\u000b\u0017$:#'W\r0* lɑ";
      f1249[3] = ",'&g\u000bj0=$;\u0011~ >oѹ";
      f1249[4] = "\u001dl!\u0010Ga\u0003d;_$u\u0007";
      f1249[5] = "<>p\fE@71aC$N<:e\u0019";
      f1249[6] = "S#|CE\u001c\u00143!G$Ƈj+|TFLT5 Y$\t[</\u0006\u001a\u0017\u00071M";
      f1249[7] = "^rSK1\u0001\u001e|\u0002\u0015Q\u0003\u0018?m\u0013m@\u001c,RH \u0010[CQ\u0013j\u0002\n|\n^:Ee\u007fQ\u0014(\u0014Z$\u001cDo{";
      f1249[8] = "MF\\\u0000OC\u0000MF}L\u001e\u0002@N\u0010w\u0018\u001bMH}ZB\u0011C\u001aCD\u001e\u001c";
      f1249[9] = "m_`\u0001;$ Tz|;n5^e+(e$U\u0019\u0006ey>\u0007'\u00189t";
      f1249[10] = "-Sc\u001e8\u0011uY!]Sѧ\u0017BnI1_)\\2DS\u001a&U=\u001bm\u0004zX_";
      f1249[11] = "\u0015@1L\u0001HXK+1\u0005\u001cEJ.M9\u0019H'2\u0000\u0003\u001a\u001b\u0019,\\\u000e";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f1249[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1250[var4]);
            f1249[var4] = var5;
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
      Object var5 = f1249[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1250[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f1249[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1249[var4] = var13;
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
               var12 = m123(417816935516886L, 0L);
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
      Object var5 = f1249[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1250[var4];
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
               f1249[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(417816935516886L, 0L);
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
                     f1249[var4] = var19;
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
               var23 = m123(417816935516886L, 0L);
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
         if (var8 != 'W' && var8 != 212 && var8 != 239 && var8 != 't') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'h') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 223) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'W') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 212) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 239) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class030.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/ȋ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
