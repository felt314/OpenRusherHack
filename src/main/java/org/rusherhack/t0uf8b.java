package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.client.api.ui.window.view.ListView;
import org.rusherhack.core.utils.StringUtils;

public class t0uf8b extends ListView<Delete> {
   public static long f1968 = Class066.m4320(-8883438823839575687L, 3865797129155625005L, MethodHandles.lookup().lookupClass()).m4325(94850498375498L);
   public static String[] f1969;
   public static String[] f1970;
   public static Object[] f1972 = new Object[42];
   public static String[] f1973 = new String[42];

   public t0uf8b(String var1, Window var2, List<Delete> var3, List var4) {
    }

   static {
    }
   public static String m656(byte[] var0) {
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
      if (f1973[var4] != null) {
         return var4;
      } else {
         Object var5 = f1972[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 49;
               case 1 -> 61;
               case 2 -> 57;
               case 3 -> 39;
               case 4 -> 31;
               case 5 -> 51;
               case 6 -> 1;
               case 7 -> 19;
               case 8 -> 41;
               case 9 -> 56;
               case 10 -> 35;
               case 11 -> 62;
               case 12 -> 53;
               case 13 -> 3;
               case 14 -> 21;
               case 15 -> 40;
               case 16 -> 60;
               case 17 -> 17;
               case 18 -> 9;
               case 19 -> 25;
               case 20 -> 20;
               case 21 -> 63;
               case 22 -> 33;
               case 23 -> 4;
               case 24 -> 7;
               case 25 -> 36;
               case 26 -> 52;
               case 27 -> 18;
               case 28 -> 0;
               case 29 -> 28;
               case 30 -> 54;
               case 31 -> 13;
               case 32 -> 16;
               case 33 -> 8;
               case 34 -> 42;
               case 35 -> 29;
               case 36 -> 55;
               case 37 -> 6;
               case 38 -> 15;
               case 39 -> 23;
               case 40 -> 48;
               case 41 -> 37;
               case 42 -> 12;
               case 43 -> 22;
               case 44 -> 26;
               case 45 -> 27;
               case 46 -> 44;
               case 47 -> 2;
               case 48 -> 24;
               case 49 -> 59;
               case 50 -> 30;
               case 51 -> 34;
               case 52 -> 47;
               case 53 -> 5;
               case 54 -> 32;
               case 55 -> 11;
               case 56 -> 46;
               case 57 -> 58;
               case 58 -> 45;
               case 59 -> 10;
               case 60 -> 43;
               case 61 -> 50;
               case 62 -> 14;
               default -> 38;
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

            f1973[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m786() {
      f1972[0] = "\u001e |\u007f1Z\u0002:~#+N\u0012952/F\u0014<o\u007f\"_\u0018|I.0G\u0014 S0 D0\u0002R";
      f1972[1] = "\u0003Osc+/\u001fUq?1;\u000fV:.53\tS`c8*\u0005\u0013g4*.\tP:\u0004\u000e3\u0002Y{:\u0014;\u0002\\s(+";
      f1972[2] = "_nfk]XCtd7GLSw/2";
      f1972[3] = "0I5z0\b,S7&*\u001c<P|Թ";
      f1972[4] = "\t:Rr\u0007n\u0015 P.\u001dz\u0005#\u001b?\u0019r\u0003&Ar\u0014k\u000ffS9\u0014o\u0013:Pr\u0002r\b,Z+[K\t8@,\"r\b,Z+";
      f1972[5] = void.class;
      f1973[5] = "java/lang/Void";
      f1972[6] = "$(\u0012\u0007Di82\u0010[^}(1[ł";
      f1972[7] = "RCGwooNYE+u{^Z\u000eЭ";
      f1972[8] = "\u0007ci\u0019pY\flxV\rA\u001fkq\u001f";
      f1972[9] = "Q\u0010N\u001c\r\u000fM\nL@\u0017\u001b]\t\u0007ȴ";
      f1972[10] = int.class;
      f1973[10] = "java/lang/Integer";
      f1972[11] = "\u0000V)\u001dH$\u001cL+AR0\fO`PV8\nJ:\u001d[!\u0006\n;GS=\u001c\n!QP4\fP=\u001dj=\u000e]+Ah4\u0003E:ZU?";
      f1972[12] = "\u001f\u0013r\u0002Bt\u0003\tp^X`\u0013\n;ɘ";
      f1972[13] = "\u000e\u0018@~',\u0012\u0002B\"=8\u0002\u0001\tƗ";
      f1972[14] = "\u0010<REs\u0011\f&P\u0019i\u0005\u001c%\u001b&";
      f1972[15] = "aYo*\tr\u007fQueknxL";
      f1972[16] = "\u007f (~\\w\n\u0000#qM8k\u000e(zIb\u001f";
      f1972[17] = "-#KS`\u001619I\u000fz\u0002!:\u0002\u001e~\n'?XSs\u0013+\u007fY\u0014<\u0014+?H\u0012eM48I\n</+\"X+{\u00065";
      f1972[18] = " ?\u0003<%\u0017>7\u0019sm\u0017$=\u00014d\fd\u001d\u001a3x\u0017';\u0007";
      f1972[19] = ":4\u000b\u0000\u001aq1;\u001aO{\u007f:0\u001e\u0015";
      f1972[20] = "(;j[\u0014p4!h\u0007\u000ed$\"#\u0016\nl\"'y[\u0007u.gx\u001cHr.'i\u001a\u0011+$&c\u0001\u0003k3gZ\u001c\ba(>N\u001a\bq\"'y";
      f1972[21] = "\\U~FL[@O|\u001aVOPL7\u000bQ\\V\tl\u001cWB@\tJ\u001cLG]@L\u001cWB@";
      f1972[22] = "\u0007H\u0010\u0011?+\u001bR\u0012M%?\u000bQY\\!7\rT\u0003\u0011,.\u0001\u0014\u0002Vc)\u0001T\u0013P:p\u001eS\u0012Hc\u0012\u0001I\u0003i$;\u001f\u001e4P!+\u0005T";
      f1972[23] = "PT8JQ\u0000_\u0000y]?ϴ9X!K\u0004\u0010]\nxBRr\u0004\u00073\u0000]\u0016V^:V?";
      f1972[24] = "e\u000b\u00194\u0018u7@Q}iŉYMSp\u001b-%\u0002\u0005=\r\u0017";
      f1972[25] = "Pv8\u00180X\u001f u\u000e\n^\u0000)b\u0014gj\u0017-h\ff$P.uQh@\u0002w|\u0007\n\u001f\u0017>5\t;\u0018Rpaj";
      f1972[26] = "^\b\u0011\bH\n\u0004S\u0010\u0011yՑ`]I\b\u0001L\u0010XQL\u00191";
      f1972[27] = "<Iq~qFn\u000297\u0000Κ\u0000\u000ezwyUb\\1?0";
      f1972[28] = "]\u001b~\"\u0000M\u0017\u00134\u007feτg\u00163y\u000fU\b\u001c?0\t";
      f1972[29] = "nF\u0018BmP<\u001f\u0011\u0014\u000fZ4^\r\u0010s4nF\u0018BmP<\u001f\u0011\u0014\u000f^6[U\u0018bX>N\u0016y2V#\u001f\n\u001d`\u000f*Ih";
      f1972[30] = "@)Y-i\u0004\u0017p@8\u0010@Fni+tVW\u007fn/t_A{N%\u0010W\u0017\"Wzq\u0002W)DF+AY\"Fw,\u0004\u0017v%";
      f1972[31] = "{\u0004,\u0011\\>*Pi\u001a.-0TnGG5&9)C^k)]{\u001aW=K";
      f1972[32] = "YSiG|C\u0016\u0005$QFE\t\f3K+r\u0002\u00041DF\u0002\u0006\u0019oW\"P_\u001095}E\u0016Y7\u0004z\u0000X\rT";
      f1972[33] = "\u001eUM\u001d\r\u001f\u0014Y\u0004\u001bl\u0017\u0019)\u0018H\t\u001fGG\u0014M\u0012\u000bw@\bN\u0006\u0011\u0018J\u0004\u0007\u0000p";
      f1972[34] = "I\u0014\u0000ZdZD\u0002\u0013djIQ,\u001b\u0002iCR6\u0013\u0002lK@\tz]o\u001a_\u0002\u000b\u000b\u007f\u001a\u001ds";
      f1972[35] = "\u00112(Lp?\u0001=|\rOy\u0011!ZR)~\u0011-mp\"d\u0001]xIvh\u001d2rE?n|fkG\u007faMa.\t+\u0002";
      f1972[36] = "\u001fLT\u007fY#\\\u0011\u0015jcμ&\u0017\u000b1\u0001%_]\u0003{\\";
      f1972[37] = "\u0013\u0013:xAc\u000e\u001a~b#\u007f~_'w\u00181\u001a\r~~NSC\u00005<A7\u0011Y<j#";
      f1972[38] = "e=d9E\u0004&`%,\u007f\r\\l:|N\u001aaf'}Agl9ew\u0002Zf$dx\u007f";
      f1972[39] = "om.r5Cg> pHӌ^m|'xR0<(bs";
      f1972[40] = "z1\u001fo3l,!\u001f-Be$#\\e\u001d|%7FbB&*'Dd!%%*F\u001dyg1kB,~\"\u007f?!";
      f1972[41] = "`C\u001b-1m7\u001a\u00028H;g\u0014,!,/n\u001eg{*\"0\u001a\u0003)s+fx\t<'biD^<,=\u000b";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f1972[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1973[var4]);
            f1972[var4] = var5;
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
      Object var5 = f1972[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1973[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f1972[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1972[var4] = var13;
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
               var12 = m158(1341786555889624L, 0L);
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
      Object var5 = f1972[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1973[var4];
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
               f1972[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(1341786555889624L, 0L);
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
                     f1972[var4] = var19;
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
               var23 = m158(1341786555889624L, 0L);
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
         if (var8 != 'R' && var8 != 162 && var8 != 'g' && var8 != 210) {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 237) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 225) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'R') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 162) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'g') {
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

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(t0uf8b.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/w" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
