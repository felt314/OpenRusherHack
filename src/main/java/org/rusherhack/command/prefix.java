package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

public class prefix extends Command {
   public static long f5137 = Class066.m4320(3503431759479062208L, 8061434371204687576L, MethodHandles.lookup().lookupClass()).m4325(108905903278003L);
   public static String[] f5138;
   public static String[] f5139;
   public static Object[] f5141 = new Object[22];
   public static String[] f5142 = new String[22];

   public prefix() {
      super("prefix", "Change the chattZs\u007f}}q~tdJprefix");
   }

//    @CommandExecutor
//    @CommandExecutor$Argument({"prefix"})
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
   public static int m156(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5142[var4] != null) {
         return var4;
      } else {
         Object var5 = f5141[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 50;
               case 1 -> 9;
               case 2 -> 13;
               case 3 -> 53;
               case 4 -> 11;
               case 5 -> 8;
               case 6 -> 18;
               case 7 -> 59;
               case 8 -> 38;
               case 9 -> 57;
               case 10 -> 34;
               case 11 -> 22;
               case 12 -> 46;
               case 13 -> 10;
               case 14 -> 21;
               case 15 -> 33;
               case 16 -> 12;
               case 17 -> 47;
               case 18 -> 63;
               case 19 -> 20;
               case 20 -> 44;
               case 21 -> 2;
               case 22 -> 37;
               case 23 -> 4;
               case 24 -> 42;
               case 25 -> 51;
               case 26 -> 60;
               case 27 -> 23;
               case 28 -> 30;
               case 29 -> 3;
               case 30 -> 58;
               case 31 -> 61;
               case 32 -> 16;
               case 33 -> 48;
               case 34 -> 52;
               case 35 -> 39;
               case 36 -> 17;
               case 37 -> 14;
               case 38 -> 28;
               case 39 -> 49;
               case 40 -> 36;
               case 41 -> 55;
               case 42 -> 31;
               case 43 -> 32;
               case 44 -> 24;
               case 45 -> 27;
               case 46 -> 40;
               case 47 -> 41;
               case 48 -> 56;
               case 49 -> 35;
               case 50 -> 29;
               case 51 -> 62;
               case 52 -> 5;
               case 53 -> 1;
               case 54 -> 54;
               case 55 -> 15;
               case 56 -> 19;
               case 57 -> 6;
               case 58 -> 0;
               case 59 -> 43;
               case 60 -> 25;
               case 61 -> 26;
               case 62 -> 7;
               default -> 45;
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

            f5142[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f5141[0] = "Ocd\u0001qMQk~N\u0010HQk}\u000e>T";
      f5141[1] = "\nZJ\u0015d-\u0001U[Z\u0005#\n^_\u0000";
      f5141[2] = "qbDS-AmxF\u000f7U}{\rư";
      f5141[3] = "Ygi@`aE}k\u001czuU~ \r}fS;}\u000b`}Wyg\u0014w:\u007fFk\u001c{uZ|t\u000fpxS";
      f5141[4] = boolean.class;
      f5142[4] = "java/lang/Boolean";
      f5141[5] = "q\u0017)e2-m\r+9(9}\u000e`ȏ";
      f5141[6] = "\b\u000ewn\\G\u0003\u0001f!!_\u0010\u0006oh";
      f5141[7] = "4^i98\u0013(Dke\"\u00078G ȑ";
      f5141[8] = int.class;
      f5142[8] = "java/lang/Integer";
      f5141[9] = "\u0000iMX6T\u001csO\u0004,@\fp\u0004ĝ";
      f5141[10] = "&A\u0011\u000b\u0003x:[\u0013W\u0019l*XXɌ";
      f5141[11] = "\u001cUT\u0003Ww\u0000OV_Mc\u0010L\u001də";
      f5141[12] = "\u0019^\u0012Qk\\\u0016\f\u0010\u0006\u0011҆'\t\u0017[ \u0015CVCShl";
      f5141[13] = "Tly\u0003%(D)\"r>br2<\u000e.\u0019\u0004<*\nf(Nk!J_";
      f5141[14] = "\f\"\u0012\u0017z,\u001cgIfop\u001b\u0019V\u001e9v^\"E\u000fg\u001d";
      f5141[15] = "(G\rD\u0007HsS\u001dUlɲ\u0011\u0006AG]\u0003*\u0005E\u001d\u00128*W\u0012_U\t`\u0000\u0019\u001fl";
      f5141[16] = "/\u0004{8wUpPsp\u000eƹ\u0013\u0003z8lT#Yc9g1(Tpq7\u0000b\u0003{1\u000e";
      f5141[17] = "\nC\u001c\n6!U\u0017\u0014BO*[\u0004!A\"+W\by\u0007+tT\u001dI]2u_x";
      f5141[18] = "\tz1\u001e\u0001&M&0\u0019>ԯ4zw\u0016[0[(1\u0011RO";
      f5141[19] = "\u0000%R\u000bnE\u000fwP\\\u0014ϋ>p\u0007Z{\u000f\u000e\u007fUX,";
      f5141[20] = "v\u00024^a88\u0002m\u0016_mI\nj\u0012`j;A*\u001eo\u0004y\u0004(Q1v2D$^_";
      f5141[21] = " d=\u0005-\u0019/6?RWɻ\u001e6x\u001b4Bnml\u000b%)";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f5141[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5142[var4]);
            f5141[var4] = var5;
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
      Object var5 = f5141[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5142[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f5141[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5141[var4] = var13;
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
               var12 = m158(75310865906928L, 0L);
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
      Object var5 = f5141[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5142[var4];
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
               f5141[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(75310865906928L, 0L);
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
                     f5141[var4] = var19;
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
               var23 = m158(75310865906928L, 0L);
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
         if (var8 != 249 && var8 != 'd' && var8 != 181 && var8 != 'a') {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 238) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 254) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 249) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'd') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 181) {
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

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(prefix.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ɩ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
