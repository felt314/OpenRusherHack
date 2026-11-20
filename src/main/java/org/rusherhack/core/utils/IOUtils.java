package org.rusherhack.core.utils;
import org.rusherhack.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.rusherhack.Class066;
import org.rusherhack.core.setting.Setting;

public class IOUtils {
   public static int[] f1723;
   public static long f1724 = Class066.m4320(-4006862449746245066L, -288640866241809383L, MethodHandles.lookup().lookupClass()).m4325(26764494267099L);
   public static Object[] f1725 = new Object[43];
   public static String[] f1726 = new String[43];

   public static void writeStringToFile(File var0, String var1, boolean var2, boolean var3) {
      long var4 = f1724 ^ 104899316386639L;
      String var6 = var1;
      if (var2) {
         var6 = var1 + "\n";
      }

      FileWriter var8;
      boolean var10003;
      if (!var3) {
         var10003 = true;
         boolean var10005 = true;
      } else {
         var10003 = false;
      }

      try {
         var8 = new FileWriter(var0, var10003);
         var8.write(var6);
         var8.flush();
         var8.close();
      } catch (IOException ioException) {
         throw new IllegalStateException(ioException);
      }
   }

   public static String m1291(String var0) {
      long var1 = f1724 ^ 72594810038839L;
      int var10000 = 2 << 3 ^ 1;
      int var10001 = 5 << 4 ^ 2 ^ 5;
      int var10002 = 4 << 4 ^ 2 ^ 5;
      String var5;
      int var10003 = (var5 = var0).length();
      char[] var10005 = new char[var10003];
      int var7;
      int var11 = var7 = var10003 - 1;
      char[] var3 = var10005;
      int var6 = var10002;
      var10000 = var11;

      for (int var4 = var10001; var10000 >= 0; var10000 = var7) {
         var10001 = var7;
         int var12 = var5.charAt(var7);
         var7--;
         var3[var10001] = (char)(var12 ^ var4);
         if (var7 < 0) {
            break;
         }

         var12 = var7--;
         var3[var12] = (char)(var5.charAt(var12) ^ var6);
      }

      return new String(var3);
   }

   public static String toString(InputStream var0, boolean var1) {
        return null;
    }

   public static boolean createFile(File var0) {
      long var1 = f1724 ^ 68992745298631L;
      File var3 = var0;

      try {
         var3.getParentFile().mkdirs();
         return var3.createNewFile();
      } catch (IOException var4) {
         var4.printStackTrace();
         return false;
      }
   }

   public static String readStringFromFile(File var0, boolean var1) {
        return null;
    }

   public static void m4187(int[] var0) {
      f1723 = var0;
   }

   public static int[] m4188() {
      return f1723;
   }

   static {
    }
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1726[var4] != null) {
         return var4;
      } else {
         Object var5 = f1725[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 56;
               case 1 -> 1;
               case 2 -> 49;
               case 3 -> 42;
               case 4 -> 22;
               case 5 -> 30;
               case 6 -> 40;
               case 7 -> 58;
               case 8 -> 47;
               case 9 -> 15;
               case 10 -> 53;
               case 11 -> 55;
               case 12 -> 11;
               case 13 -> 61;
               case 14 -> 3;
               case 15 -> 51;
               case 16 -> 17;
               case 17 -> 7;
               case 18 -> 23;
               case 19 -> 8;
               case 20 -> 12;
               case 21 -> 27;
               case 22 -> 28;
               case 23 -> 32;
               case 24 -> 18;
               case 25 -> 4;
               case 26 -> 33;
               case 27 -> 20;
               case 28 -> 44;
               case 29 -> 35;
               case 30 -> 36;
               case 31 -> 59;
               case 32 -> 57;
               case 33 -> 46;
               case 34 -> 0;
               case 35 -> 38;
               case 36 -> 48;
               case 37 -> 31;
               case 38 -> 16;
               case 39 -> 5;
               case 40 -> 39;
               case 41 -> 54;
               case 42 -> 24;
               case 43 -> 37;
               case 44 -> 14;
               case 45 -> 25;
               case 46 -> 34;
               case 47 -> 2;
               case 48 -> 41;
               case 49 -> 21;
               case 50 -> 60;
               case 51 -> 43;
               case 52 -> 52;
               case 53 -> 10;
               case 54 -> 63;
               case 55 -> 6;
               case 56 -> 9;
               case 57 -> 19;
               case 58 -> 50;
               case 59 -> 29;
               case 60 -> 45;
               case 61 -> 26;
               case 62 -> 13;
               default -> 62;
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

            f1726[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f1725[0] = "K\u0000{!]\u0011@\u000fjn \tS\bc'1\bH\ri%\u0001";
      f1725[1] = "o'u^HTd(d\u00115Lw/mX";
      f1725[2] = "(\u0001\\\\HV4\u001b^\u0000RB$\u0018\u0015\u0011VJ\"\u001dO\\[S.]N\u001b\u0014T.\u001d_\u001dM\r\u0010\u001aU\u0016UT\u0004\u001cU\u0006_M3;Z\u001c^O\"\u0001y\u0013IF";
      f1725[3] = "%\u0011Y4^99\u000b[hD-)\b\u0010yC>/MKnE 9MwUy8#\u000fM";
      f1725[4] = "m\u000euv[Xf\u0001d9!\\u\u0000tv\u0017Xb";
      f1725[5] = "/~\u0013\u00045\t*1'\u0010}\u0006 m\u0000\u0001I\u0005${\u0000\u0017";
      f1725[6] = void.class;
      f1726[6] = "java/lang/Void";
      f1725[7] = "$3 J@28)\"\u0016Z&(*i\u0007]5.o2\u0010[+8o\u0013\r_\"9";
      f1725[8] = "HXPRd]aaLHf\u0001{u\\K-\u0010|fZ\u000ep\u0016g`VNd]@qKTj\u001dt/";
      f1725[9] = "9{";
      f1725[10] = "-_";
      f1725[11] = "-{\u0000\u0014Yq(40\u001c\u001b}\u000et\u0006\u0000\u0003K3h\u0013\u0014\u001a";
      f1725[12] = "<1=\\\u0015<9~\u0002SK \"\u0003?O^4;";
      f1725[13] = boolean.class;
      f1726[13] = "java/lang/Boolean";
      f1725[14] = ")f}\u0014\r{,)M\u001cOw\u0014ub\u0001F`";
      f1725[15] = "4^\u00014Td?Q\u0010{)q-K\u00128";
      f1725[16] = int.class;
      f1726[16] = "java/lang/Integer";
      f1725[17] = char.class;
      f1726[17] = "java/lang/Character";
      f1725[18] = "q\r\u0007V\u0001rtB7^C~";
      f1725[19] = "\u0004\u001e.?X#\u0001Q\u0011\u001132\r\u001a(*\u001f%\u0000";
      f1725[20] = "\nI\u001d c(\u0001F\fo\u0002&\nM\b5";
      f1725[21] = "bjw^\u001b-)2w\u0001yȤX1*@B,g1}Z\u0006S";
      f1725[22] = "T:\\{\f~U{\u0019n|w\u000f%\u001d\u007f| \u0004/\u0003j\u001cm\u000b.\u0005\u0012";
      f1725[23] = "\u0013tH7.\n\u0007}V!\u0013\u000f\u001e\u007f]#\u0013X\u0015uC6s\u0015\u001atEN";
      f1725[24] = "\"\u007fD/1(y:].]33iD)0\u001e${c495I5L);g3fU09X";
      f1725[25] = "\u0019\u0010ScD#RHS<&!D/\u001fwG;LtStB1MJ[\u007fH:#E\u0002q@bY\u0016\u001bhB]X\u0019\u001fdJ D\u0005\\\r";
      f1725[26] = "\u00076\u0018'\u0006\u0013\n=IC\u0003\u001b3,Z\"\u0019\u0013h+M?\u0016\u0010\u00157Q|\u007f";
      f1725[27] = "C!\u0017/Qk\u00168\f4a}z=\u0013.\b=\u0007!\u000fma*\u0017:\u0017>\u001c6\u000by~";
      f1725[28] = "\u0010iH~\u0006p\u001db\u0019\u001a\u0016g\u0007b\u0016v\u007fd\u0012s\u0019v\u0002x\u000e0pu\u0019'\u001bv\u001fx\u0012v\u007f";
      f1725[29] = " i\u001b\u001e-*<uXw%:=k\u001b\u0017A=7\u007f[M;%gcZw";
      f1725[30] = "M\u000bu_x+\u0006Su\u0000\u001aӧwP(A!*HP\u007f[eUK\u0000(Tb5\u0006\u000f)R\u001a";
      f1725[31] = "hZ=n1\\3\u001f$o]Cn]\f}'Ae]\u001au9A\u0003J/}'@s\u0011jd&,";
      f1725[32] = "\u0007?e\u0015x!LgeJ\u001a6=a.\u0019|c\f&n\u001d\"_\u0007 7\u001d&n@`3C\u001a";
      f1725[33] = "\u0013as\u001d\u0014\u0015\u0007hm\u000b)\u0015\u001epf\u0004)G\u0015`x\u001cI\n\u001aa~d";
      f1725[34] = "EC+\u0004yz\u000f\u001c(U\u001ck\u001aFo\u0007\u001c<\u0011Lq\u0012|q\u001eMwj";
      f1725[35] = "\u007f,\u001dF*E8l\u0019\u0018\u0016\u001d);$]n\f?:\u0004[{\u0018Em\u0004BpHt*DF.ty8\u0012En\u001447\u0013C\u0016";
      f1725[36] = "\u001cx<>\u0017b\bq\"(*s\u000fu.**w\u0018h;+Wk\u0004+R{Ea\u0010l26J`\u0016\u0014";
      f1725[37] = "8f3k{x {3 \u001c!0mnBq=8qje{?Qpneu),lr&\u001c";
      f1725[38] = "rN}2|\u001f2\\`1\u001dķO\u0013b3{\u0004v_b# y";
      f1725[39] = "\t\u0014 !\u0002X\u0007L198D\u001f\u0017;;c@\f\u001d>\u001bBU\u000e\u001b]{WQ\u0000\u000e=6XP\u0006v";
      f1725[40] = "Y\u0005\u001f;a(E\u0019\\Rf5K\u0012*.\r?N\u0013_hw'\u001e\u000f^Rg.Z\u0015\u001e q(IPc";
      f1725[41] = "NA\u001fRwu\u0015\u0004\u0006S\u001b`FV\u0017R`\u0005\u0014[\nN$\u007fGB\u0013L\u001b";
      f1725[42] = "x\u0010~F!+2O}\u0017D+.\u001b-l%7.r:E88/\u000f&Y{Q";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f1725[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1726[var4]);
            f1725[var4] = var5;
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
      Object var5 = f1725[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1726[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f1725[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1725[var4] = var13;
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
               var12 = m123(1472360923342919L, 0L);
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
      Object var5 = f1725[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1726[var4];
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
               f1725[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(1472360923342919L, 0L);
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
                     f1725[var4] = var19;
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
               var23 = m123(1472360923342919L, 0L);
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
         if (var8 != 210 && var8 != 'T' && var8 != 'E' && var8 != 242) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'h') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 216) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 210) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'T') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'E') {
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


   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }
}
