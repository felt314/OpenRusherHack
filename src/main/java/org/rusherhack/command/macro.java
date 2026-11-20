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
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.argument.StringCapture;
public class macro extends Command {
   public static long f2318 = Class066.m4320(-271028418163372731L, -7792241219556519527L, MethodHandles.lookup().lookupClass()).m4325(88303838473083L);
   public static String[] f2319;
   public static String[] f2320;
   public static Object[] f2322 = new Object[54];
   public static String[] f2323 = new String[54];

   @CommandExecutor
   @CommandExecutor$Argument({"macro"})
   @CommandExecutor(
      subCommand = {"bind"}
   )
   @CommandExecutor$Argument({"macro", "bind"})
   @CommandExecutor(
      subCommand = {"list"}
   )
   @CommandExecutor$Argument({"macro"})
   @CommandExecutor(
      subCommand = {"remove", "rm"}
   )
   @CommandExecutor$Argument({"macro", "command"})
   @CommandExecutor(
      subCommand = {"add"}
   )
   @CommandExecutor$Argument({"macro", "command"})
   public macro() {
      super("macro", "Manage macros");
      this.addAliases("macros");
   }

//    @CommandExecutor(
//       subCommand = {"delete", "del"}
//    )
//    @CommandExecutor$Argument({"macro"})
//    @CommandExecutor(
//       subCommand = {"create"}
//    )
//    @CommandExecutor$Argument({"name", "key"})
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
      if (f2323[var4] != null) {
         return var4;
      } else {
         Object var5 = f2322[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 42;
               case 1 -> 21;
               case 2 -> 48;
               case 3 -> 16;
               case 4 -> 20;
               case 5 -> 40;
               case 6 -> 56;
               case 7 -> 10;
               case 8 -> 28;
               case 9 -> 45;
               case 10 -> 18;
               case 11 -> 50;
               case 12 -> 39;
               case 13 -> 41;
               case 14 -> 36;
               case 15 -> 29;
               case 16 -> 58;
               case 17 -> 61;
               case 18 -> 11;
               case 19 -> 14;
               case 20 -> 23;
               case 21 -> 6;
               case 22 -> 0;
               case 23 -> 3;
               case 24 -> 1;
               case 25 -> 38;
               case 26 -> 44;
               case 27 -> 54;
               case 28 -> 27;
               case 29 -> 59;
               case 30 -> 30;
               case 31 -> 34;
               case 32 -> 32;
               case 33 -> 62;
               case 34 -> 55;
               case 35 -> 4;
               case 36 -> 5;
               case 37 -> 17;
               case 38 -> 24;
               case 39 -> 7;
               case 40 -> 9;
               case 41 -> 8;
               case 42 -> 57;
               case 43 -> 60;
               case 44 -> 26;
               case 45 -> 52;
               case 46 -> 2;
               case 47 -> 33;
               case 48 -> 47;
               case 49 -> 37;
               case 50 -> 46;
               case 51 -> 12;
               case 52 -> 49;
               case 53 -> 43;
               case 54 -> 35;
               case 55 -> 25;
               case 56 -> 51;
               case 57 -> 63;
               case 58 -> 15;
               case 59 -> 13;
               case 60 -> 22;
               case 61 -> 31;
               case 62 -> 53;
               default -> 19;
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

            f2323[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f2322[0] = "\u0015#C`\u0005y\t9A<\u001fm\u0019:\n¤";
      f2322[1] = "U\u001cm2?\u0018K\u0014w}]\u0004L\t";
      f2322[2] = "<\u0019vT\u0006? \u0003t\b\u001c+0\u0000?\u0099";
      f2322[3] = "z;\u001f\u0019-=f!\u001dE7)v\"VɃ";
      f2322[4] = "Nu\u0013\u007f\u0006AEz\u00020gONq\u0006j";
      f2322[5] = boolean.class;
      f2323[5] = "java/lang/Boolean";
      f2322[6] = ")5`\u0000\u0017_\":qOjG1=x\u0006";
      f2322[7] = ")V4I\u000bQ5L6\u0015\u0011E%O}*";
      f2322[8] = "4\u007fYxn5(e[$t!8f\u00105s2>#]9q-:cZx]\"(yL7\u007f4\u0018bS;}.?";
      f2322[9] = "luQgz@\u0019UZhk\u000fdMIobF\f";
      f2322[10] = void.class;
      f2323[10] = "java/lang/Void";
      f2322[11] = "U<\n\u001dIvI&\bASbY%CÆ";
      f2322[12] = "P\r\u0004$\u0015\u0006L\u0017\u0006x\u000f\u0012\\\u0014Mš";
      f2322[13] = "!i?rY6=s=.C\"-pv?D1+5:5E'`Y12O\u000e/u9;N1\fz+9";
      f2322[14] = "\u000f\bHI&K\u0013\u0012J\u0015<_\u0003\u0011\u0001\u0004;L\u0005TM\u000e:ZN3m\u000e:Z\u0001\u0018C\u0002";
      f2322[15] = "NA'7<qR[%k&eBXnz!vD\u001d\"p `\u000fX%``MjV9";
      f2322[16] = "(^G?\u007fw4DEcec$G\u000eϹ";
      f2322[17] = "AL`\u0011\u0016D]VbM\fPMU)\\\u000bCK\u0010dP\t\\OPc\u0011\u0005CIKjZ\nE\u0000msM\r_I}fO\u0010D\\[";
      f2322[18] = "q\\|\u001c\u0004RoTfSeWoTe\u0013KK";
      f2322[19] = "_\u0017\u0011*2gA\u001f\u000bezg[\u0015\u0013\"s|\u001b5\b%ogX\u0013\u0015";
      f2322[20] = "+:*\u0004e2520K-2/8(\f$)o\u001d)\u000b(3(42";
      f2322[21] = "JU\u00143FqVO\u0016o\\eFL]ț";
      f2322[22] = int.class;
      f2323[22] = "java/lang/Integer";
      f2322[23] = "\u001eC\u0005I\r;\u0015L\u0014\u0006p#\u0006K\u001dOa\"\u001dN\u0017MQ";
      f2322[24] = "L\u001codQFP\u0006m8KR@\u0005&)LAF@k%N^B\u0000ldFK@\u000bx>J\\M\u001d&\tL^N\u000ff.fK@\u000bx>J\\M";
      f2322[25] = "O;\na|\u0016P<\u0006Yсq\u0018}\u0016\"~\u0017E(\u001cb\u0001";
      f2322[26] = "|c\u001c#/)+~E\"\u0011$E%B',w||B/.M\u007f$\u001e}+t&$\u0016\u007f\u0011";
      f2322[27] = "`*C\u0011iU>1WT\u0010Ϯ]}SVu\r6{\bUvha+\u0006\fu\u0003gp\u0005\u000f\u0010";
      f2322[28] = "\u0015\u0015|{B\\H@v;=S@F\u001d;\r\u0002\\A \u007fX\u0004\u0013*&|VJKH#iLE,";
      f2322[29] = "M4MI-\u0004\u001ep\u001aLQPLssNa\u0007QdN\n4\u0001\u001e\u000f";
      f2322[30] = "aE2T\n--_e\u0014hϵQ\u0004(@\u0017)7H2\u0017W";
      f2322[31] = "\u0000V#\u00062L\u001c\u0014\u007f^VɧmD=\r:\u0005\u0010L*V=>";
      f2322[32] = "\b>nT\u0018\u007f[8r@ 9\u0000Y\u007fEA#\b\u0002?U\u001f \u0002i9\u000e\u001c#g";
      f2322[33] = "'+\u000biZe(!Y,jt#6\u007f{\u0000v*J\u0000n\u0001k)(\u0005{\u001bdNvQ-\u000f~%p\n.\f\u001b";
      f2322[34] = "W\u007fOgz!\u0004;\u0018b\u0006}A\t\u0015 k\u001a\u0000tI+m'D!Od\u0006!\u000b|\u00010;e^zN[";
      f2322[35] = "\u0011$t/\n>B\"h;2m\u0006`t\"^\u0004Br&!WoD)%\"2kBur|\b8DifD";
      f2322[36] = "i\u000569K\\:\u0003*-s\u000f~A64\u001ffhB0>H\u001b`Uk9s\t:T0jIZ<H.R";
      f2322[37] = "\u001e.R5\u0001\u000bC{Xu~\u0017JtT0\u0013m\u001c!\u000b>\u0015PXt\rq~V[zC)\u001cSN`LN";
      f2322[38] = "\u0004i`\"\u0004qY<jb{xP*\u00017\u0000|Qm|?\u0017'VV:iCgVk~<E(=";
      f2322[39] = "\"C\u0003h\u0017iq\u0007Tmk35 G9\u0010?(\u0004=o\u00179>\u001f_j\u0002#1x";
      f2322[40] = "\u0011t\u0002\t\u000ehL!\bIquI9\u000er\u001fuC'X\u000f\u0017b\u0018 c";
      f2322[41] = "q\bF%5\u0014=\u0012\u0011eW\u000eAI\u0012#0\u001c?\u0010H'>r";
      f2322[42] = "Q\u0005\u001e'\u001e-\u001d\u001fIg|ǟa\u001eE%M\"\u000e\u0014\u0004a\u0011K";
      f2322[43] = "\u001d\u0003!\u001cPPNGv\u0019,\u000e\u0018@\u001fMF\u000b\u001f\u0004 KGS\t8s\u001b\u0012W\r\u0003 _ERq";
      f2322[44] = "\u0016,@H^=OvDF0ϟ&}@R\b>AbG^0xZxIHR}ObF/";
      f2322[45] = "x}B5hzrq\u000b&\u0013j$b9>u}I/\u00023ht)qJby\u0011 \u007fC$#o/u\u0011a\u0013.w#\u0013;y\u007fuz\u001f_";
      f2322[46] = "V`\u0005nHY\u000f:\u0001`&ʆffCh]X\u0000;\u0016b\u001d'";
      f2322[47] = "E\u0011vJ%;B\\\"QI|RV,F&\u0007\u0012FrE,l\u0014\u001dqFI";
      f2322[48] = "Et?^1?\u00160h[MeG\u0017{\u000f6iO3\u0001\u000e1=R61\u000e$uWO>\\pdM%o^)h)";
      f2322[49] = "\bX%\u001a<|\u0005Uw\u0010\u0006\"g\u0015sOck\f\u0013(L`\u000e[C&\u0015ce]\u0018%\u0016\u0006";
      f2322[50] = "e\u0002i'}~z\u0005e\u001fotw=}zm\u00197\u0011+zer1J(y\u0000";
      f2322[51] = "\u0003'5u1.\u001c 9M+/.39'-/\u0001\u00136 *5mavp,-\u00070t) I";
      f2322[52] = "\u000f\u0001Vh>A\fF\u0013i[E^\u0017\"5:EI\u0016\u0010QeL\u000b\u0011\u000441\u001d\u000f\tkne\u0011R\u001f\u0001?gH^{";
      f2322[53] = "6\u001aW\u0003T>o@S\r:ȴ\u0006\u0019D[_%m\u001f\u001fX\\@h\\S\\G'w[_d";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f2322[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f2323[var4]);
            f2322[var4] = var5;
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
      Object var5 = f2322[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f2323[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f2322[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f2322[var4] = var13;
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
               var12 = m158(327321318595903L, 0L);
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
      Object var5 = f2322[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f2323[var4];
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
               f2322[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(327321318595903L, 0L);
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
                     f2322[var4] = var19;
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
               var23 = m158(327321318595903L, 0L);
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
         if (var8 != 224 && var8 != 'f' && var8 != 'C' && var8 != 226) {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'I') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 246) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 224) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'f') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'C') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(macro.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ã" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
