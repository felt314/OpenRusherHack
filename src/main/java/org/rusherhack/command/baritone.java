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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.argument.StringCapture;
import org.rusherhack.core.command.exceptions.ValidationException;

public class baritone extends Command {
   public static long f5246 = Class066.m4320(-4217371293581512398L, 2091235829666390123L, MethodHandles.lookup().lookupClass()).m4325(213260655181780L);
   public static String[] f5247;
   public static String[] f5248;
   public static Object[] f5250 = new Object[33];
   public static String[] f5251 = new String[33];

   public baritone() {
      super("baritone", "Command wrapper for baritone");
      this.addAliases("b");
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   @CommandExecutor$Argument({"command"})
   public void m10692(StringCapture var1) {
        
    }

   static {
    }

   public static Class316 m116(Class316 var0) {
      return var0;
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
      if (f5251[var4] != null) {
         return var4;
      } else {
         Object var5 = f5250[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 26;
               case 1 -> 44;
               case 2 -> 22;
               case 3 -> 51;
               case 4 -> 48;
               case 5 -> 29;
               case 6 -> 1;
               case 7 -> 32;
               case 8 -> 59;
               case 9 -> 55;
               case 10 -> 24;
               case 11 -> 58;
               case 12 -> 31;
               case 13 -> 45;
               case 14 -> 25;
               case 15 -> 54;
               case 16 -> 2;
               case 17 -> 17;
               case 18 -> 46;
               case 19 -> 27;
               case 20 -> 49;
               case 21 -> 37;
               case 22 -> 30;
               case 23 -> 28;
               case 24 -> 16;
               case 25 -> 41;
               case 26 -> 23;
               case 27 -> 4;
               case 28 -> 47;
               case 29 -> 38;
               case 30 -> 62;
               case 31 -> 21;
               case 32 -> 0;
               case 33 -> 39;
               case 34 -> 3;
               case 35 -> 60;
               case 36 -> 33;
               case 37 -> 5;
               case 38 -> 7;
               case 39 -> 50;
               case 40 -> 43;
               case 41 -> 11;
               case 42 -> 14;
               case 43 -> 34;
               case 44 -> 12;
               case 45 -> 36;
               case 46 -> 63;
               case 47 -> 56;
               case 48 -> 9;
               case 49 -> 20;
               case 50 -> 42;
               case 51 -> 18;
               case 52 -> 52;
               case 53 -> 19;
               case 54 -> 35;
               case 55 -> 10;
               case 56 -> 15;
               case 57 -> 57;
               case 58 -> 53;
               case 59 -> 8;
               case 60 -> 13;
               case 61 -> 61;
               case 62 -> 6;
               default -> 40;
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

            f5251[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f5250[0] = "--1r{\t173.a\u001d!4xɚ";
      f5250[1] = int.class;
      f5251[1] = "java/lang/Integer";
      f5250[2] = "\u0006\u0002\"v\u000f+\u001a\u0018 *\u0015?\n\u001bk;\u0012,\f^&7\u00103\b\u001e!v\u001c,\u000e\u0005(=\u0013*G#1*\u00140\u000e3$(\t+\u001b\u0015";
      f5250[3] = "h3Z\u0018%Hc<KWXPp;B\u001e";
      f5250[4] = "\u0001\u00044\u0019Xw\r\u0000h\u0011\\qM''\u0002El\f\u000b#1|Q";
      f5250[5] = ")/0\u001e:G%+l\u0016>Ae\u0007\u0000\u0016<A?!,\u0012\u001eZ$8+\u0013+Z";
      f5250[6] = "-\"wba&!&+je a\nGjg ;,kn";
      f5250[7] = "c%ve:\"o!*m>$/'ka#,o *a/#`#a~`\u0004B+ia/#e\teb/*d6";
      f5250[8] = boolean.class;
      f5251[8] = "java/lang/Boolean";
      f5250[9] = "Y\u0013!|{GE\t# aSU\nh1e[S\u000f2|hB_O\u0001>fPW\r5";
      f5250[10] = "\u001c\u00146\u0018x2\u001c\u0014!Dt=\u0006_!Zt(\u0001.q\u0007%";
      f5250[11] = "\n@2MC\u0015\u0016Z0\u0011Y\u0001\u0006Y{ˣ";
      f5250[12] = "O\u0016K\u0018DOS\fID^[C\u000f\u0002ɂ";
      f5250[13] = "SDy\u0012\u0003PSDnN\u000f_I\u000fnP\u000fJN~;\u000fV";
      f5250[14] = "1\u0017d\u0014\"\u001f1\u0017sH.\u0010+\\sV.\u0005,-'\u000ey";
      f5250[15] = "\r!>?Vk\u0011;<cL\u007f\u00018wɒ";
      f5250[16] = "k\u0006i4*~w\u001ckh0jg\u001f y7yaZmu5fe\u001aj4\u0019iw\u0000|{;\u007fG\u001bcw9e`";
      f5250[17] = "\u000e\u0014\u00008ql{4\u000b7`#\u0006,\u00180ijn";
      f5250[18] = void.class;
      f5251[18] = "java/lang/Void";
      f5250[19] = "Fy!>F\u001fMv0q'\u0011F}4+";
      f5250[20] = "\u0018U\u001f3I\u0001\u0003\u0004MKɨh\t\u001bBzJ\u0016\u0011\u0013QK";
      f5250[21] = "\u0014|r\u0012\u0005FH9*\u0016i_R?t\u0019\u0006$\u0014&.\u000e\u000f\u001eI*eOi";
      f5250[22] = "a.O\u0003\u00159a0\u0002\u0016i)7<+\u0014\u000e8;,\u001e\u0014i}'*I\u0004\u0011/j%\fn";
      f5250[23] = "XT\u0013\u0000E\n\n\u0019\u001cE/\u001d\u000eU!@N\u0017\nS\bpF\b\u0002U\u001e\\Br_@\u0019UC\u0000\u000f\u0012FB/";
      f5250[24] = "x\u0010\tjl35\u0013\u0016?\u0000:5\u0014\u001c+|:EC\u0014mq1\u007f\u001e\u0018&0W{@\u0005f\u007f>8\u001f\u0014<\u0000";
      f5250[25] = "$-X^!\nd3PIA\u000eqN\nN?P\"tNA/\u0016";
      f5250[26] = "+\u0010\u0018+\f\u001f$\f\u0013#|ҒBQ\u001ar\rAx\f\u00169L'x\bB8\u001a\u001d%\u0004\ty|";
      f5250[27] = "\u0018ZC\u007fv1D\u001f\u001b{\u001a\u007f\"YG)k5\u0018\u0004Kb*S\u0018\u0000\u001fc|iE\fT\"\u001a";
      f5250[28] = "\u000f_c`jt_Dyu[$\tXKz:$\u001eYy\u001e0w\u0019\u000egb?}\tR\u0002u*|\u001e[;!'6\u00044";
      f5250[29] = "vz+q|57bq3\u0018,I2'4y&,z,5$Eyiul{ 1bt1\u0018";
      f5250[30] = "k\u001b)w^o;Iv`2r:\u000e\u0002\u007fWx>\u0014%][{>\u001d$b2 >\futVm=\u0013 \u0018";
      f5250[31] = "T~^et8\u0010qN#Ll\nqD2\u001b;U,\u001f^}cTxZ!2r\u0015|";
      f5250[32] = "*\u000b+~\u0014un\u0004;8,!t\u00041){v*SiEE.k\u000ek \u0016\u007f)\u0014";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f5250[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5251[var4]);
            f5250[var4] = var5;
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
      Object var5 = f5250[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5251[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f5250[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5250[var4] = var13;
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
               var12 = m158(1338836266924284L, 0L);
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
      Object var5 = f5250[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5251[var4];
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
               f5250[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(1338836266924284L, 0L);
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
                     f5250[var4] = var19;
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
               var23 = m158(1338836266924284L, 0L);
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
         if (var8 != 223 && var8 != 249 && var8 != 'r' && var8 != 'F') {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'J') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'b') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 223) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 249) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'r') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(baritone.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʀ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
