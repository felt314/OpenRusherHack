package org.rusherhack.core.event.subscribe;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import sun.misc.Unsafe;

public class MethodSubscriber$ModernLookupHandler extends MethodSubscriber$LookupHandler {
   public static long f1580 = Class066.m4320(-544178279912993076L, -5361575901009656485L, MethodHandles.lookup().lookupClass()).m4325(36172773086505L);
   public static String[] f1581;
   public static String[] f1582;
   public static Map f1583 = new HashMap(13);
   public static Object[] f1584 = new Object[20];
   public static String[] f1585 = new String[20];

   @Override
   public Lookup lookup(Class<?> var1) {
        return null;
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

   public static String m153(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21301;
      if (f1582[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f1583.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f1583.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/core/event/subscribe/MethodSubscriber$ModernLookupHandler", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         try {
DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f1581[var5].getBytes("ISO-8859-1");
         f1582[var5] = m117(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f1582[var5];
   }

   public static Object m154(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = m153(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1585[var4] != null) {
         return var4;
      } else {
         Object var5 = f1584[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 35;
               case 1 -> 17;
               case 2 -> 31;
               case 3 -> 58;
               case 4 -> 47;
               case 5 -> 13;
               case 6 -> 53;
               case 7 -> 59;
               case 8 -> 6;
               case 9 -> 46;
               case 10 -> 22;
               case 11 -> 19;
               case 12 -> 3;
               case 13 -> 24;
               case 14 -> 1;
               case 15 -> 55;
               case 16 -> 41;
               case 17 -> 40;
               case 18 -> 16;
               case 19 -> 60;
               case 20 -> 30;
               case 21 -> 28;
               case 22 -> 11;
               case 23 -> 45;
               case 24 -> 27;
               case 25 -> 42;
               case 26 -> 29;
               case 27 -> 52;
               case 28 -> 37;
               case 29 -> 39;
               case 30 -> 49;
               case 31 -> 7;
               case 32 -> 44;
               case 33 -> 5;
               case 34 -> 20;
               case 35 -> 0;
               case 36 -> 12;
               case 37 -> 61;
               case 38 -> 33;
               case 39 -> 25;
               case 40 -> 63;
               case 41 -> 9;
               case 42 -> 43;
               case 43 -> 56;
               case 44 -> 8;
               case 45 -> 4;
               case 46 -> 14;
               case 47 -> 23;
               case 48 -> 62;
               case 49 -> 50;
               case 50 -> 10;
               case 51 -> 48;
               case 52 -> 57;
               case 53 -> 51;
               case 54 -> 26;
               case 55 -> 18;
               case 56 -> 34;
               case 57 -> 21;
               case 58 -> 36;
               case 59 -> 15;
               case 60 -> 2;
               case 61 -> 38;
               case 62 -> 32;
               default -> 54;
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

            f1585[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f1584[0] = "\u0010\u0004ke#\\\u0010\u0012+\u001e F\u0002\u0017`";
      f1584[1] = "=</\u0006 L63>I|E11<\u0004z\u000e\u00114<\u000bj";
      f1584[2] = "'|=R\na,s,\u001dko'x(G";
      f1584[3] = "\u0010zE\u00040\f\u001buTKw\u000e\ftX\u00000-\u001fo[\nz(\u001buW\t{\u0013^W\\\nu\u0015\n";
      f1584[4] = "\u001ers`+A\u0015}b/FA\u0015`v";
      f1584[5] = "\u001a\u0004B>RU\u0006\u001e@bHA\u0016\u001d\u000bј";
      f1584[6] = "v(8Xs\u000e}')\u0017\u000e\u0016n  ^";
      f1584[7] = boolean.class;
      f1585[7] = "java/lang/Boolean";
      f1584[8] = void.class;
      f1585[8] = "java/lang/Void";
      f1584[9] = long.class;
      f1585[9] = "java/lang/Long";
      f1584[10] = "lG~eoOp]|9u[`^7(rHf\u001b|=xTw\u001bj>\u007fI`Gp)x\u0014P@{8~HjW|9_[pP";
      f1584[11] = "D\u001bU\u001e\u001dTUA\u0011`\u0016\u0017L\u0003\u000f\u000b#\nH\u001b\u0002*\u0004\u0010H\u007f\u001c\u001f\b\u0007DN\u001f\u0007\u0001k\u001c\u0004\u001f\u001fW\u0004W\u0010\r^m";
      f1584[12] = "\u001cJ\u0002U])\u001fR\u000b9Su\u00125^BMgTZ\u0015V_&n\f\u001cHC\"\u0001G\bZ\u0002\u0018";
      f1584[13] = "9\u0011\u0003/\f\u0012d@J&a\u0001e-Hr\u0004\u001da\u0013\u0017+\f\u0019\u0003\u0017O;\u0005\rqJ\u001er\f`";
      f1584[14] = "rCBTv\u0016c\u0019\u0006*iDo`\u0013HkBo'@QwV)H\u000bEe\u0017\u0013\u0019\u0003\u0011zQkU\u001dGi)*\\\bU<FaH\u001a\u0014\u0006";
      f1584[15] = "\u0000mZ\\^\u0000^ Y\u0011%Ļ;#X\u0018\u0014\u0005\u0007nIKJa\u0007d\u001b\u0011A]JuHO%";
      f1584[16] = "\u001fJ?(R.\u001cR6DHr\u0011|1/^d\u0016T0 ^\u001fP\\b)Sr\\Zcu3\"\u0015\tf4B`\r\n1D";
      f1584[17] = "!L*cM\u001c~\u0015\"g/Mw\t\u0003sDFs\u000f\"raCw\u0011#\u001e\u0013Y\"D+\"^Hq\u001aOlPGv\u0014~oHN\u001a";
      f1584[18] = ")H\u0019j%\u001fkBU-[B\u0016\u0010_mj\n*]N>4n*W\u001cd?RgFO:[";
      f1584[19] = "r\\DhW8c\u0006\u0000\u0016\\{zD\u001e}if~\\\u0013QIihU\u0003\u0016UxvT\u001e'V`\u007f8Al\u001c{k@\rrJh\u0013";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f1584[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1585[var4]);
            f1584[var4] = var5;
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
      Object var5 = f1584[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1585[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f1584[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1584[var4] = var13;
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
               var12 = m123(183285222151830L, 0L);
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
      Object var5 = f1584[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1585[var4];
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
               f1584[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(183285222151830L, 0L);
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
                     f1584[var4] = var19;
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
               var23 = m123(183285222151830L, 0L);
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
         if (var8 != 224 && var8 != 'Z' && var8 != 221 && var8 != 'Q') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 216) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'F') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 224) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'Z') {
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

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(MethodSubscriber$ModernLookupHandler.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/core/event/subscribe/MethodSubscriber$ModernLookupHandler" + " : " + var1 + " : " + var2.toString(), var5);
      }
}
}
