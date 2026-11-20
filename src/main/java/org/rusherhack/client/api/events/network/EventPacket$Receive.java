package org.rusherhack.client.api.events.network;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.network.packet.Packet;
import org.rusherhack.Class066;

public class EventPacket$Receive extends EventPacket {
   public static String[] f399;
   public static Object[] f400 = new Object[7];
   public static String[] f401 = new String[7];

   public EventPacket$Receive(Packet<?> var1) {
      super(var1);
   }

   public static void m891(String[] var0) {
      f399 = var0;
   }

   public static String[] m892() {
      return f399;
   }

   static {
      long var0 = Class066.m4320(5607772609941805274L, -4273980295137524049L, MethodHandles.lookup().lookupClass()).m4325(249081627625202L) ^ 34315264537537L;
      m786();
      if (((java.lang.String[])(org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "M", java.lang.invoke.MethodType.methodType(java.lang.String[].class, long.class, long.class)), 7862992192147836455L,  var0))) == null) {
         org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "M", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), new String[3],  7862756974868232730L,  var0);
      }
   }

   public static int m156(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f401[var4] != null) {
         return var4;
      } else {
         Object var5 = f400[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 22;
               case 1 -> 20;
               case 2 -> 7;
               case 3 -> 21;
               case 4 -> 13;
               case 5 -> 18;
               case 6 -> 33;
               case 7 -> 42;
               case 8 -> 16;
               case 9 -> 53;
               case 10 -> 0;
               case 11 -> 46;
               case 12 -> 47;
               case 13 -> 14;
               case 14 -> 50;
               case 15 -> 24;
               case 16 -> 29;
               case 17 -> 61;
               case 18 -> 41;
               case 19 -> 19;
               case 20 -> 39;
               case 21 -> 32;
               case 22 -> 4;
               case 23 -> 56;
               case 24 -> 43;
               case 25 -> 8;
               case 26 -> 63;
               case 27 -> 40;
               case 28 -> 27;
               case 29 -> 49;
               case 30 -> 34;
               case 31 -> 31;
               case 32 -> 2;
               case 33 -> 58;
               case 34 -> 45;
               case 35 -> 54;
               case 36 -> 15;
               case 37 -> 10;
               case 38 -> 59;
               case 39 -> 17;
               case 40 -> 9;
               case 41 -> 3;
               case 42 -> 23;
               case 43 -> 60;
               case 44 -> 44;
               case 45 -> 57;
               case 46 -> 12;
               case 47 -> 30;
               case 48 -> 35;
               case 49 -> 37;
               case 50 -> 51;
               case 51 -> 5;
               case 52 -> 6;
               case 53 -> 62;
               case 54 -> 25;
               case 55 -> 38;
               case 56 -> 36;
               case 57 -> 48;
               case 58 -> 55;
               case 59 -> 11;
               case 60 -> 28;
               case 61 -> 1;
               case 62 -> 52;
               default -> 26;
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

            f401[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m786() {
      f400[0] = "zd\u001eid\u0014f~\u001c5~\u0000v}W.z\bpx\riw\u0011|8\u001c1s\u000faeW)s\u0015by\u000b,8$cs\u00173F\u0000v}\u001c323pu\u001c.`\u0004";
      f400[1] = "h3\u001c\u00075C\u001d\u0013\u0017\b$\f`\u000b\u0004\u000f-E\b";
      f400[2] = void.class;
      f401[2] = "java/lang/Void";
      f400[3] = "V\tv%\u0010|#)}*\u00013^1n-\bz6";
      f400[4] = "$'`.g /(qa\u0006.$#u;";
      f400[5] = "\u001dYG<\r!\u001b\u0013V\rԞ\\JJR7\u0019$\u0015V\u00021ue\u0011S]4\u0011d\rR\n\r";
      f400[6] = "3\u001c\u000brER5V\u001aCĂ/d\u000f\u001eyQW;\u0013N\u007f=";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f400[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f401[var4]);
            f400[var4] = var5;
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
      Object var5 = f400[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f401[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f400[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f400[var4] = var13;
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
               var12 = m158(343079991148030L, 0L);
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
      Object var5 = f400[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f401[var4];
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
               f400[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(343079991148030L, 0L);
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
                     f400[var4] = var19;
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
               var23 = m158(343079991148030L, 0L);
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
         if (var8 != 162 && var8 != 165 && var8 != 242 && var8 != 'g') {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == '$') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'M') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 162) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 165) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 242) {
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

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(EventPacket$Receive.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/api/events/network/EventPacket$Receive" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
