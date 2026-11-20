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
import net.minecraft.world.World;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.exceptions.ValidationException;

public class travel extends Command {
   public static long f8736 = Class066.m4320(1387537114421217678L, -3006011475830188576L, MethodHandles.lookup().lookupClass()).m4325(43514905167681L);
   public static String[] f8737;
   public static String[] f8738;
   public static Object[] f8740 = new Object[45];
   public static String[] f8741 = new String[45];

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   @CommandExecutor$Argument({"waypoint"})
   public String m16752(Class086 var1) {
        return null;
    }

   public travel() {
      super(
         "travel",
         "\u001c-$$;h*):!<'&-h<'h/'h<'h'&-h'.ha\u0013our waypoints"
      );
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
      if (f8741[var4] != null) {
         return var4;
      } else {
         Object var5 = f8740[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 41;
               case 1 -> 25;
               case 2 -> 59;
               case 3 -> 43;
               case 4 -> 61;
               case 5 -> 27;
               case 6 -> 0;
               case 7 -> 44;
               case 8 -> 40;
               case 9 -> 13;
               case 10 -> 58;
               case 11 -> 53;
               case 12 -> 6;
               case 13 -> 1;
               case 14 -> 39;
               case 15 -> 62;
               case 16 -> 47;
               case 17 -> 54;
               case 18 -> 10;
               case 19 -> 45;
               case 20 -> 24;
               case 21 -> 63;
               case 22 -> 16;
               case 23 -> 32;
               case 24 -> 34;
               case 25 -> 35;
               case 26 -> 50;
               case 27 -> 11;
               case 28 -> 19;
               case 29 -> 5;
               case 30 -> 2;
               case 31 -> 51;
               case 32 -> 17;
               case 33 -> 49;
               case 34 -> 4;
               case 35 -> 14;
               case 36 -> 57;
               case 37 -> 22;
               case 38 -> 48;
               case 39 -> 3;
               case 40 -> 18;
               case 41 -> 8;
               case 42 -> 30;
               case 43 -> 21;
               case 44 -> 23;
               case 45 -> 20;
               case 46 -> 37;
               case 47 -> 60;
               case 48 -> 9;
               case 49 -> 7;
               case 50 -> 15;
               case 51 -> 33;
               case 52 -> 26;
               case 53 -> 56;
               case 54 -> 46;
               case 55 -> 42;
               case 56 -> 28;
               case 57 -> 31;
               case 58 -> 29;
               case 59 -> 36;
               case 60 -> 38;
               case 61 -> 12;
               case 62 -> 55;
               default -> 52;
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

            f8741[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f8740[0] = "4*D\u0005\u0010D4*SY\u001cK.aSG\u001c^)\u0010\u0001\u0012N\u001a";
      f8740[1] = "\t\u001ek\u0006V \t\u001e|ZZ/\u0013U|DZ:\u0014$*\u001b\tx";
      f8740[2] = "%+PCh)91R\u001fr=)2\u0019ș";
      f8740[3] = "V+Ti\u0016\u0002]$E&k\u001aN#Lo";
      f8740[4] = "DD?\t\u0006%X^=U\u001c1H]vö";
      f8740[5] = "2\\z~;R.Fx\"!F>E3ɖ";
      f8740[6] = int.class;
      f8741[6] = "java/lang/Integer";
      f8740[7] = "_q4\u0003\u007f\u0000Ck6_e\u0014Sh}ӟ";
      f8740[8] = "\u001d'AG3\u000f\u0011#\u001dO7\tQ\u0004R\\.\u0014\u0010(Vo\u0017)";
      f8740[9] = "\\CD\"grPG\u0018*ct\u0010kt*atJMX.CoQT_/vo";
      f8740[10] = "LZqDZ`@^-L^f\u0000rAL\\fZTmH";
      f8740[11] = "lW\u0004k\u001bb\u0019w\u000fd\n-xy\u0004o\u000ew\f";
      f8740[12] = "\u00118!ivX\u0011865zW\u000bs6+zB\f\u0002gs(";
      f8740[13] = double.class;
      f8741[13] = "java/lang/Double";
      f8740[14] = "\r\u0004nr\u0017\u0004\r\u0004y.\u001b\u000b\u0017Oy0\u001b\u001e\u0010>,oB";
      f8740[15] = "\\dW\u0005R.P`\u000b\rV(\u0010uW\u0003E$Mv\u000b%e4MqJ\u0001a._iu\u001eI\"[vV";
      f8740[16] = "c\u000fmn8\u0017\u007f\u0015o2\"\u0003o\u0016$#&\u000bi\u0013~n+\u0012eSM,%\u0000m\u0011y";
      f8740[17] = "\"\r~ab=\"\ri=n28Fi#n'?79~?";
      f8740[18] = "\\\u0002sgM'P\u0006/oI!\u0010\u0013`zQ!P\u0004/iV)R\u0010/IV)R";
      f8740[19] = void.class;
      f8741[19] = "java/lang/Void";
      f8740[20] = "3^\u0002\u000byg/D\u0000Wcs?GKFd`9\u0002\u0010Qb~/\u00026Qy{2K0Qb~/";
      f8740[21] = "\u0014\u00048$W\u001e\u0014\u0004/x[\u0011\u000eO/f[\u0004\t>{>\f";
      f8740[22] = "48d\u0013a\u0006?7u\\\u0000\b4<q\u0006";
      f8740[23] = "t:xT;\u0018pttn/E{ j9{\u0019/t>n=Jmy6\u0016|\u0014d";
      f8740[24] = "g2+'_\u0019.\u007f*t#ƒ^zq}M\u000b3<.!\u001cfdp'uN\u000b\"/{$#";
      f8740[25] = "{\u001e\\}_<y\\_&g5-Ztt\u00027@\u001c\u0002{\t7-Z]'XZ";
      f8740[26] = "\u0016Z\u0000\u0016~4\u001c\u000f\f\u0011\u0007ȁ-\t\u0010\u001aj8AK\u0011\u0016fX";
      f8740[27] = ":)\u0005Uxjj{Y\u001a\u0001|\u0007+\u0010\u0000=ixb]\u0001n\u0015>`\bV}jw-\t\u0005\u0001";
      f8740[28] = "Kv\u0005\u000fL\u000fLtUQ7\u001e\u001bid\u0012P\u000f\u0017yQ\u00127O\nvA\u000fU\u0001\u0016dUh";
      f8740[29] = "4V8@<'zJ*T[*gV\u0003G: cP*w2?kV<[6E5\u0010&X*{tK=\u0004[";
      f8740[30] = "\u000e;\b+F\u0005HdTz+\u0006Sq\u000b,Wh\u000e;\b+F\u0005HdTz+X\rd\u0016\u007f\u0016\u0001\u0004ePE\u0011XRe\u0003(W\u0007\u000e4n";
      f8740[31] = "-)\u001a\u0015nQ ?CK\u001c\rp%\u001fKp?$iO\u0014!h,f\u0001\u0016 \u0015|2\u0003\u001c\u001cY\"'E\u0010a\tv%O,-WccCQ}\u0003ai\u007f\u001cl\r$+F\u0011zTzY";
      f8740[32] = "%1a*Y}!\u007fm\u0010M *+sG\u0019|~p.\u0010_/<r/h\u001eq5";
      f8740[33] = "eG\u0014P\u0015\u001chQM\u000egK4Z\u0015\u00050\u001cn\nIiV\u001a+\rM\u0014\u0006N)\u0007";
      f8740[34] = "\u0016x=WwSE1eC\u0017WJ}8M{e\u001d>i\u001a,2[o#\u0017'J\u001a1**";
      f8740[35] = "N0\ti^\u0007C&P7,P\u001f-\b<{\u0007E}UP\u001d\u0001\u0000zP-MU\u0002p";
      f8740[36] = " \u000fdL,BaT\u007f\u0010]\u0013rIRT&\u0000xPVN4\u0018GO~B0\u0007d5pGe\u0005dE(W7\u0011\u001f";
      f8740[37] = "m^\u0012g>\u0014o\u001c\u0011<\u0006,VV\fb?\u0000o[\u001a;ar";
      f8740[38] = "0o\u000eB8a+jUUXb1R^\u0002f=\"2\u0005S?b";
      f8740[39] = "'\u0013\u001d\u000e+:%Q\u001eU\u0013҉\u001cW\u001d\u0015.ld\u0016C\u001c\u0013";
      f8740[40] = "l\\YuH54L\u000ba3>hN.kZ!LT\rTZ9e2\r6\u0002+{\\\u001f1\u000e\"\u0005^\u0007u].z\f\u00044SE";
      f8740[41] = "\u0017'k7-N@%*<@\tz!g>.H\u0017g8b\u007f%@+16-H\u0006tmg@";
      f8740[42] = "\u0011Y\u0003[0\u0005J\bZ\u0004H\u000b\u001b\u0005Y\r\u001f\\DX\u0002ay\u001c\u001f\u0015]\u0000*UG\u0001";
      f8740[43] = "4}X2\u0017G9k\u0001le\u0010e`Yg2G?0\u0007\u000bTAz7\u0001v\u0004\u0015x=";
      f8740[44] = "\t>7\u0006z{RonY\u0002u\u0003bmPU\"]55<o~\u0010ub\u0000kz\u001c2";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f8740[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8741[var4]);
            f8740[var4] = var5;
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
      Object var5 = f8740[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8741[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f8740[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8740[var4] = var13;
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
               var12 = m158(1609233325994494L, 0L);
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
      Object var5 = f8740[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8741[var4];
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
               f8740[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(1609233325994494L, 0L);
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
                     f8740[var4] = var19;
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
               var23 = m158(1609233325994494L, 0L);
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
         if (var8 != 'v' && var8 != 244 && var8 != 255 && var8 != 'A') {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 205) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'n') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'v') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 244) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 255) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(travel.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ӳ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
