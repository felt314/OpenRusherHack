package org.rusherhack.core.setting;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.feature.command.arg.SettingValue;
import org.rusherhack.core.utils.MathUtils;

public class NumberSetting<T extends Number> extends Setting<T> {
   public T f1682;
   public boolean f1683;
   public boolean f1684;
   public static DecimalFormat f1685;
   public double f1686;
   public T f1687;
   public boolean f1688;
   public static int f1689;
   public static long f1690 = Class066.m4320(8645027349133458065L, 2750942398619022062L, MethodHandles.lookup().lookupClass()).m4325(177973110471106L);
   public static Object[] f1691 = new Object[70];
   public static String[] f1692 = new String[70];

   public T getMaximum() {
        return null;
    }

   @Override
   public JsonElement serializeValue() {
      long var1 = f1690 ^ 130595338717319L;
      return new JsonPrimitive(this.getValue());
   }

   public void setValue(double var1) {
      long var3 = f1690 ^ 132248925673188L;
      this.setValue(var1, false, false);
   }

   public T getMinimum() {
        return null;
    }

   static {}

   public NumberSetting(String var1, String var2, T var3, T var4, T var5) {
    }

   public NumberSetting<T> setHidden(boolean var1) {
      return (NumberSetting<T>)super.setHidden(var1);
   }

   public NumberSetting(String var1, T var2, T var3, T var4) {
      this(var1, "", (T)var2, (T)var3, (T)var4);
   }

   public void setValue(double var1, boolean var3, boolean var4) {
        
    }

   public NumberSetting<T> clampMax() {
        return null;
    }

   @Override
   public String getDisplayValue() {
        return null;
    }

   @Override
   public void setValueObj(Object var1) {
        
    }

   @Override
   public boolean deserializeValue(JsonElement var1) {
        return false;
    }

   public NumberSetting<T> clampMin() {
        return null;
    }

   public NumberSetting<T> setVisibility(BooleanSupplier var1) {
      return (NumberSetting<T>)super.setVisibility(var1);
   }

   public NumberSetting<T> setChangeAction(Runnable var1) {
      return (NumberSetting<T>)super.setChangeAction(var1);
   }

   public T parseValue(String var1, boolean var2) {
        return null;
    }

   public NumberSetting<T> onChange(Consumer<T> var1) {
      return (NumberSetting<T>)super.onChange(var1);
   }

   public NumberSetting<T> incremental(double var1) {
        return null;
    }

   public static void m4116(int var0) {
      f1689 = var0;
   }

   public static int m4117() {
      return f1689;
   }

   public static int m4118() {
      int var0 = m4117();
      return var0 == 0 ? 39 : 0;
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

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1692[var4] != null) {
         return var4;
      } else {
         Object var5 = f1691[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 41;
               case 1 -> 13;
               case 2 -> 50;
               case 3 -> 43;
               case 4 -> 60;
               case 5 -> 63;
               case 6 -> 26;
               case 7 -> 3;
               case 8 -> 4;
               case 9 -> 48;
               case 10 -> 28;
               case 11 -> 47;
               case 12 -> 45;
               case 13 -> 58;
               case 14 -> 62;
               case 15 -> 38;
               case 16 -> 21;
               case 17 -> 27;
               case 18 -> 55;
               case 19 -> 42;
               case 20 -> 1;
               case 21 -> 2;
               case 22 -> 8;
               case 23 -> 46;
               case 24 -> 20;
               case 25 -> 22;
               case 26 -> 0;
               case 27 -> 11;
               case 28 -> 19;
               case 29 -> 25;
               case 30 -> 53;
               case 31 -> 24;
               case 32 -> 56;
               case 33 -> 5;
               case 34 -> 31;
               case 35 -> 39;
               case 36 -> 9;
               case 37 -> 37;
               case 38 -> 17;
               case 39 -> 32;
               case 40 -> 54;
               case 41 -> 30;
               case 42 -> 16;
               case 43 -> 57;
               case 44 -> 40;
               case 45 -> 14;
               case 46 -> 10;
               case 47 -> 51;
               case 48 -> 15;
               case 49 -> 35;
               case 50 -> 6;
               case 51 -> 29;
               case 52 -> 23;
               case 53 -> 7;
               case 54 -> 34;
               case 55 -> 44;
               case 56 -> 33;
               case 57 -> 12;
               case 58 -> 52;
               case 59 -> 18;
               case 60 -> 61;
               case 61 -> 36;
               case 62 -> 59;
               default -> 49;
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

            f1692[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f1691[0] = "\f.\u001en\u0018#\u00037\u001c!r2\u0005&\u0005nZ\u0011\t=\u0005nB";
      f1691[1] = ".$dsh\u0017%+u<\t\u0019. qf";
      f1691[2] = "\u0019l)\u007f>\u0010\u0012c80C\b\u0001d1y";
      f1691[3] = "!\u0011?I1m=\u000b=\u0015+y-\bv\u0004,j+M+\u00027l'\r?I\rm#\u0001=\u0015\u0010}:\u00171\t$";
      f1691[4] = "sWb\bhwoM`Trc\u007fN+Eupy\u000bvCnvuKb\bIghQlH}";
      f1691[5] = double.class;
      f1692[5] = "java/lang/Double";
      f1691[6] = void.class;
      f1692[6] = "java/lang/Void";
      f1691[7] = "\u001a\u000e\u0017jAp\u0011\u0001\u0006%!i\u001d\r\u0004y";
      f1691[8] = boolean.class;
      f1692[8] = "java/lang/Boolean";
      f1691[9] = "qttd*\fmnv80\u0018}m=)7\u000b{(`/,\rwhtd\u001a\u0016qjv+6*{rg#6\u001e";
      f1691[10] = "stXG\u0001\nZMD]\u0003V@YT^HGGJR\u001b\u0015A\\L^[\u0001\n{]CA\u000fJO\u0003";
      f1691[11] = "t<\u0006Phi\u007f3\u0017\u001f\u0012ml2\u0007P$i{";
      f1691[12] = "\u001b~WfQ)\u0007dU:K=\u0017g\u001e+L.\u0011\"E<J0\u0007\"})W4!xY$P";
      f1691[13] = "1wW^S\f:xF\u0011.\b4dU";
      f1691[14] = short.class;
      f1692[14] = "java/lang/Short";
      f1691[15] = "\u001b#Cq\u0012\u0014\u0010,R>u\u0016\u0005'RuN";
      f1691[16] = int.class;
      f1692[16] = "java/lang/Integer";
      f1691[17] = "=OK'Qb6@Zh9b8OI";
      f1691[18] = float.class;
      f1692[18] = "java/lang/Float";
      f1691[19] = "Z,#\u00020fQ#2MZeE/9\u0006";
      f1691[20] = "We\u0013.\b \\j\u0002aj#Sc";
      f1691[21] = long.class;
      f1692[21] = "java/lang/Long";
      f1691[22] = "OE_7\u0019\u0002DJNxu\u0017QA";
      f1691[23] = byte.class;
      f1692[23] = "java/lang/Byte";
      f1691[24] = "oeA\u001a\u0007\u0012cm@QN\u001a\u007feB\u001a*\u000ecdiX\u0005\u0010idX";
      f1691[25] = "\u0015\u0006sC\u00166\u0019\u000er\b_>\u0005\u0006pC;*\u0019\u0007N\u001f\u00184\u001f\u001dw\u001b\u0014";
      f1691[26] = "\\\t(eHPW\u00069*4IX\u0006?f\nY";
      f1691[27] = "6w'8\u0017N*m%d\rZ:nnu\tR<k48\u0004K0+&s\u0004O,w%8\u0006T4h!x\u0001\u00158w'86^-q)x\u0002m8i5s";
      f1691[28] = "KI3\u00129\u0001UA)]q\u0001OK1\u001ax\u001a\u000fk*\u001dd\u0001LM7";
      f1691[29] = "_\u001eQdO%A\u0016K+\u0007%[\u001cSl\u000e>\u001b=Hj\r5T\u0011tp\u0011 Y\u0016Bw";
      f1691[30] = "\u00150\u0017J6H\u0014t\u0000DQՓ/5\u0002\u001c)_BkYS<";
      f1691[31] = ".I>\u0005\u000bf/\r)\u000blŬ\u0014\u001d*\f]<u\fsV\u0000\u0003(\u001d/\u0012Sa*\u00143\u0016l";
      f1691[32] = "\u001b|]\u0019\u0003&\u001a8J\u0017dҔ!|\u001f\u0018\u0016>Q9U\u000b\u0003";
      f1691[33] = "eGOJ@y=\u0004\u0013\r'Ǎ[\u0001\u0013\u001a\u0017u<S\u0011\u001fND";
      f1691[34] = "\u0011L6;^\u001f\u0010\b!59ӝ+\u0018\"2\bEJ\t{hUz";
      f1691[35] = "\u001f9*\u0012\u0006SN\"=\u00129\u001a\u001a )Au\u0005\u000e06A9[\u000f;6EZ\u001b\u0018+n,\u0002\u0005N\" A\\^\u00017R";
      f1691[36] = "ncU\u0016\u001d\u001ak>WQoGu\u001eT\r\t~t=J\u000b\u0013Gp1/T_L|!_\u0011\u0015_i\\";
      f1691[37] = "qvyJ:`p2nD]~&4U@&d!)o@!tK+lEdf\"-{Bl\u0005qvyJ:`p2nD]";
      f1691[38] = "@\r8=E\u0012\u0011\u001es^\u0010\u0007\u000b\u0004j\"~\u0012A\b{%\u0004QM\u0013\u0003g\u0002\u0001\u0015\b`'\u0015\u0011Ma";
      f1691[39] = "U5ih\u0007>Tq~f`2o4j<X\"\u0011uco\f[Pz$;\u0019%\u0011swo`";
      f1691[40] = "o\u0003v+te/\u0017>x\u0011{8\f)}\u0011:8L7c|dc\u0003\"\u0011*fb\t=|t=-\u001cO*v<'\u0003\"t-s2q";
      f1691[41] = "gc\u0015t*1?5E2L6|BW+&:}\u0004\u0014~&%ztQ450\u0007";
      f1691[42] = "\u001fXl\u0005)vG\u000e<CO\u007f\u0012C\u001aD\tm\u001aU>EO-C\u00013^-yA\u0001m?";
      f1691[43] = "|SnBA\u0001}\u0017yL&\u001f+\u0011B@B\u0019+m'N\u001b\u001c4\u0000y\u0015T\tFS,CT\u00196\u0016fPAdx]v[[\u0014=\u0017eN&X,\u000e`\u0016DZ%\u0012d)";
      f1691[44] = "\u000b\\u\t\rS\u0001\u00001\u0014`I\u000bZ0\t'YbT+\u0006Q\b\u0003Er\\\f7\u000b\\u\t\rS\u0001\u00001\u0014`";
      f1691[45] = "6~V^Xm<}A\u001b`\"4sF\n'2]|C\u001eY`bx\u0000\u001a\n\\6~V^Xm<}A\u001b`";
      f1691[46] = "1\u001e\u00002P0e\u001c\u0000l16kDQ\fX6qO>?L?|NXn\u0001;7\"";
      f1691[47] = "KjF6@\u001aT`J3*\u0006LnT<m\u0016%eD=\u0016@LkQ8NxKjF6@\u001aT`J3*";
      f1691[48] = "\u0006y]'m\u0013\u0007=J)\n˾<y\u001f&x\u000bL<U5m";
      f1691[49] = "j1?Ri% 1hV\tq<'\r]mc<[!\u0004`f*!b\b{\u001e";
      f1691[50] = "\fmj='~XojcFrU6=!\u0018uU,9]-dHhhb)'L;T";
      f1691[51] = "\u0017JK$@KCHKz!HL\n+-ETGv\u001f\"C\u0018\u0015\u0017\u000e{\u0019E*";
      f1691[52] = "`hc~p[*h4z\u0010\u001b6~Qqt\u001d6\u0002}(y\u0018 x>$b`ghld/\u0002eap`\u0010";
      f1691[53] = "^dr\bsZ_ e\u0006\u0014G\r {\u000eJV\u0000'mc-C\u0005>i\u0000mT\u0015f\u0000]$U\u0016'p\u0018nF\u0003Z=_*_\u00058i]*\u0001d";
      f1691[54] = "\u001dfp`Fo\u001c\"gn!qJ$IkHlH5K`]k@>\u0002jG7I1kmGgZX85Sa@=9qDo'";
      f1691[55] = "p\u001a3Ymlq^$W\nջJ\u0019}\fjh(M\u007f\f4";
      f1691[56] = "U\u001amx#\fT^zvD\u0012\u0002X_r(\u0005\u0002B\u001f-t\u0003\u001dYoh>\u0010\b$%-6\u0002\bA$i!\fo";
      f1691[57] = "38\u0013neP2|\u0004`\u0002կ\t;];bTko_;<";
      f1691[58] = "\u0017\u0002Ex\u001dq\u0016FRvzsKwWz\u001c{@<U}\u0010kR\u0001\\\"\u001b)-\u0006\ta\u0011sH\u0007Mv\u001f\u0014";
      f1691[59] = "\u0015x/\u0005';Az/[F\"H#k\u0019\u00180L9|e/`S8 ]4aE4\u0011";
      f1691[60] = "\u00158zk@XA:z5!VOy.oLdA`9f!\u0001O9<yL_\u0014v)\u000b";
      f1691[61] = "\u0003\u001e Dw\u0000X\u0013&O\u0005O[\u00104OB_2\u001dpYy\u0000\n\u0006qOu1\u0003\u001e Dw\u0000X\u0013&O\u0005";
      f1691[62] = "\u0003\f_GrER\u0017HGM\n\u0006\u000bZ\u0014\n\u001aoT@D5\u0006\u0002\n\u001b\u000b t\u0003\f_GrER\u0017HGM";
      f1691[63] = ".\u0011T\u001aC,/UC\u0014$2ySx\u0018@4y/\u001d\u0016\u00191fBCMV$\u0014\u0013L\u0012Xvv\u0011E\u000e\\I";
      f1691[64] = "SX}@~rAG.\u0006\u001emW^oQY}>WoQn\u007fX\u0006\"U%\u0013SX}@~rAG.\u0006\u001e";
      f1691[65] = "ay{h\bq`=lfoу[y9i\u001di+<sz\b";
      f1691[66] = "F\u000e\u001d+Y\u0010CS\u001fl+CKM.,iWAW?-JIGM\u0006)F,FVXmMJ\u001e\u0000\b++";
      f1691[67] = "R\\\r\u001de!S\u0018\u001a\u0013\u0002ŵhS\u0013Ma\u007f\u001a\u0002\u0000\u0006";
      f1691[68] = "}F\u0013:}-)D\u0013d\u001c%1\u0006@\u0004u+=\u0017-5q#|BD;d&$z";
      f1691[69] = "x`V\u0007OU!5\u0003\u000b.\u001f\u001aiE\u0005JZy)R\u0015\u00123#,X\u0000GPc;HX.";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f1691[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1692[var4]);
            f1691[var4] = var5;
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
      Object var5 = f1691[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1692[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f1691[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1691[var4] = var13;
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
               var12 = m123(99389087852291L, 0L);
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
      Object var5 = f1691[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1692[var4];
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
               f1691[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(99389087852291L, 0L);
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
                     f1691[var4] = var19;
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
               var23 = m123(99389087852291L, 0L);
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
         if (var8 != 209 && var8 != 223 && var8 != 239 && var8 != 'o') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'b') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 230) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 209) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 223) {
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


   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }

   public NumberSetting() {}
}
