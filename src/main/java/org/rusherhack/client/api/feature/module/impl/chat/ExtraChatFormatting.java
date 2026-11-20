package org.rusherhack.client.api.feature.module.impl.chat;
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
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.Formatting;
import org.rusherhack.core.command.CommandUtils;

public enum ExtraChatFormatting {
   f026,
   f027,
   f028,
   f029,
   f030,
   f031,
   f032,
   f033,
   f034,
   f035,
   f036,
   f037,
   f038,
   f039,
   f040,
   f041,
   f042,
   f045,
   f046,
   f049;

   public char f043;
   public Formatting f044;
   // $VF: synthetic field
   public String f048;
   public static long f050 = Class066.m4320(-8680652142286549988L, 5525603205234139545L, MethodHandles.lookup().lookupClass()).m4325(146941136976881L);
   public static long[] f051;
   public static Integer[] f052;
   public static Map f053;
   public static Object[] f054 = new Object[67];
   public static String[] f055 = new String[67];

   public static Formatting m114(char var0) {
      long var1 = f050 ^ 25219400103156L;
      char var6 = (char)var0;
      int var10000 = Class253.m9155();
      ExtraChatFormatting[] var7;
      int var5 = (var7 = ((org.rusherhack.client.api.feature.module.impl.chat.ExtraChatFormatting[])(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "b", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.feature.module.impl.chat.ExtraChatFormatting[].class, long.class, long.class)), 3470694299050431720L,  var1)))).length;
      int var3 = var10000;
      var10000 = var0 = 0;

      while (var10000 < var5) {
         ExtraChatFormatting var4 = var7[var0];
         var10000 = var6;
         if (var3 != 0) {
            if (var6 == var4.f043) {
               return var4.f044;
            }

            var10000 = ++var0;
         }
      }

      return Formatting.RESET;
   }

   ExtraChatFormatting(char var3, Formatting var4) {
      this.f043 = var3;
      this.f048 = "§" + var3;
      this.f044 = var4;
   }

   public String m115() {
      return this.f048;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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

   public static int m118(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30985;
      if (f052[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f051[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f053.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f053.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/A", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f052[var3] = var15;
      }

      return f052[var3];
   }

   public static int m119(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m118(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ExtraChatFormatting.class, "m119", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/A" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f055[var4] != null) {
         return var4;
      } else {
         Object var5 = f054[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 27;
               case 1 -> 16;
               case 2 -> 18;
               case 3 -> 54;
               case 4 -> 51;
               case 5 -> 1;
               case 6 -> 60;
               case 7 -> 49;
               case 8 -> 35;
               case 9 -> 41;
               case 10 -> 20;
               case 11 -> 25;
               case 12 -> 10;
               case 13 -> 48;
               case 14 -> 53;
               case 15 -> 26;
               case 16 -> 63;
               case 17 -> 29;
               case 18 -> 50;
               case 19 -> 31;
               case 20 -> 17;
               case 21 -> 7;
               case 22 -> 0;
               case 23 -> 34;
               case 24 -> 39;
               case 25 -> 23;
               case 26 -> 24;
               case 27 -> 46;
               case 28 -> 59;
               case 29 -> 28;
               case 30 -> 9;
               case 31 -> 3;
               case 32 -> 4;
               case 33 -> 62;
               case 34 -> 58;
               case 35 -> 32;
               case 36 -> 12;
               case 37 -> 5;
               case 38 -> 30;
               case 39 -> 14;
               case 40 -> 45;
               case 41 -> 2;
               case 42 -> 42;
               case 43 -> 15;
               case 44 -> 52;
               case 45 -> 8;
               case 46 -> 55;
               case 47 -> 40;
               case 48 -> 33;
               case 49 -> 22;
               case 50 -> 21;
               case 51 -> 13;
               case 52 -> 19;
               case 53 -> 36;
               case 54 -> 38;
               case 55 -> 37;
               case 56 -> 6;
               case 57 -> 44;
               case 58 -> 56;
               case 59 -> 57;
               case 60 -> 11;
               case 61 -> 43;
               case 62 -> 47;
               default -> 61;
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

            f055[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f054[0] = "\u0017\u0017l\u0002\u00180\u0017\u0017{^\u0014?\r\\{@\u0014*\n-)\u001eA";
      f054[1] = "Q`\u0011%\u00158Mz\u0013y\u000f,]yXJ";
      f054[2] = "\u0011w\u0014\u0000\u0018!8N\b\u001a\u001a}\"Z\u0018\u0019QNq";
      f054[3] = "g5ry1.{/p%+:k,;4,)mi`#*7{i\\\u0018\u0016/a+f";
      f054[4] = "=A\u001f=\u001f\u00156N\u000erb\r%I\u0007;";
      f054[5] = "be\fG+g~\u007f\u000e\u001b1sn|E\n6`h9\b\u00064\u007fly\u000fG\u001a}`z\n\u0007=Gy~\u0007\u001a";
      f054[6] = "qww*[RXNk0Y\u000eBZ{3\u0012=\u0011";
      f054[7] = "!)\u0018\u001f$\r=3\u001aC>\u0019-0Qȷ";
      f054[8] = int.class;
      f055[8] = "java/lang/Integer";
      f054[9] = char.class;
      f055[9] = "java/lang/Character";
      f054[10] = "\u0003\u007fQ\u001d\u0000\u0004\u001feSA\u001a\u0010\u000ff\u0018ɇ";
      f054[11] = "$\rLf[|\r4P|Y \u0017 @\u007f\u0012\u0013D";
      f054[12] = "p\tGO\r={\u0006V\u0000f?o\u0005";
      f054[13] = "_\u001a\u0007A\u001f9T\u0015\u0016\u000er9T\b\u0002";
      f054[14] = "G`@.};LoQa\u001c5GdU;";
      f054[15] = "HoHh\u0016V[dI\u0002\u0006TKrUUQ\r\u0019*9l\u0011DLhZ\u007f\u001aE";
      f054[16] = " \u0015\u0015zZ{0B]\u0018ʗ\u001amW\u0019sDj)\\\u0015t";
      f054[17] = "\u0007Vl_\u0005<\u0017\u0001$=\u0001]\u0007Vl_\u0005<\u0017\u0001$";
      f054[18] = "\u0011\u0018!C{f\u0001Oi!Ɏ\u0007X\u00117\u001eyaR\u001d4Y";
      f054[19] = "OX\u0014V\r[_\u000f\\4):OX\u0014V\r[_\u000f\\";
      f054[20] = "\b'Z#J\u0004\u0018p\u0012A\u0002e\b'Z#J\u0004\u0018p\u0012";
      f054[21] = "\u0019A\f\u0012Q\u0013\t\u0016Dpwr\u0019A\f\u0012Q\u0013\t\u0016D";
      f054[22] = "uZc; MfQbQ0OvG~\u0006g\u0016$\u001e\u0012?'_q]q,,^";
      f054[23] = "I`>%DDY7vGC%I`>%DDY7v";
      f054[24] = "_N-`6\u0018O\u0019e\u00027y_N-`6\u0018O\u0019e";
      f054[25] = "!6]\n\u007fa2=\\`oc\"+@78:pp,\u000exs%1O\u001dsr";
      f054[26] = "H\n\u0019v\u0015UX]Q\u0014ծ4TJ\u0019~\u000fWGA\u0018";
      f054[27] = "Yi9';1I>qE6PYi9';1I>q";
      f054[28] = "\r\u000b(wdp\u001d\\`\u0015A\u0011\r\u000b(wdp\u001d\\`";
      f054[29] = "e\u0000\u0004k-\u000euWL\t#oe\u0000\u0004k-\u000euWL";
      f054[30] = "XS\\\u0018 \u0005KX]r0\u0007[NA%g^\b\u0015-\u001c'\u0017\\TN\u000f,\u0016";
      f054[31] = "~bcY?\u0013mib3/\u0011}\u007f~dxH.#\u0012]8\u0001zeqN3\u0000";
      f054[32] = "\"=\u0018htp2jP\nnx4y\u0004q\u0010.+y\u0002p`j u\u0005\n";
      f054[33] = "\u001c\u001cw'L\u0013\u000f\u0017vM\\\u0011\u001f\u0001j\u001a\u000bHOX\u0006#K\u0001\u0018\u001be0@\u0000";
      f054[34] = "!s\u00016Vq2x\u0000\\Fs\"n\u001c\u000b\u0011*r6p2Qc%t\u0013!Zb";
      f054[35] = "|\u000e{:PslY3XƷ\u00121Lw3NbuG{44";
      f054[36] = " \u00021v\t-0Uy\u0014\u0000L \u00021v\t-0Uy";
      f054[37] = "/B?+G1?\u0015wIHP/B?+G1?\u0015w";
      f054[38] = "a#=T\u001cT8~`T%\u0558\\-8B_\tgty\u001aG8";
      f054[39] = ")Sm\u0011I:b\u0010bSyxpHp\u0007>h\u0019\u001d7\u0016\u0002;e@\u007f\u0011\u0018\u0006\"\u001cjU\u001f`(\u0010i\u0012y6fLvZE}%C4j";
      f054[40] = "6U)}\u0015&%^(\u0017\u0005$5H4@R}g\u001cXy\u001242R;j\u00195";
      f054[41] = "\u001d\u0000\u0013D7d\u000e\u000b\u0012.'f\u001e\u001d\u000eyp?LGb@0v\u0019\u0007\u0001S;w";
      f054[42] = "\u0001l8lSt\u0012g9\u0006Cv\u0002q%Q\u0014/Q/IhTf\u0005k*{_g";
      f054[43] = "_Y|\u0017Q3LR}}A1\\Da*\u0016h\u000f\u0019\r\u0013V![^n\u0000] ";
      f054[44] = "^\u000e_6-\b\u001f\n\u0018)IZeKQ.v\u0010\u0003A]-1v^@\u0006v/\u0010TL\u00051I";
      f054[45] = "2YB.\u0015\n\"\u000e\nL2k2YB.\u0015\n\"\u000e\n";
      f054[46] = "J9@eBvZn\b\u0007ʝ\u0017\u0006d^k\u001b}\u0003<\nh";
      f054[47] = "1\u00028-\u0010z\"\t9G\u0000x2\u001f%\u0010W!aKI)\u0017h5\u0005*:\u001ci";
      f054[48] = "Wn[3\nOG9\u0013Q\u0007.\u001aiN!\bPC8\u00130n\u0011\u001b3Z7\u0010HJnKQ";
      f054[49] = "\u0004%\n\u0006@\u0015\u0014rBdmt\u0004%\n\u0006@\u0015\u0014rB";
      f054[50] = "uwQp9\u0007e \u0019\u0012\u0011fuwQp9\u0007e \u0019";
      f054[51] = "'{\u001bZx\u000b4p\u001a0h\t$f\u0006g?Pt2j^\u007f\u0019#|\tMt\u0018";
      f054[52] = "T--O\u001f_Dze-\u0019>T--O\u001f_Dze";
      f054[53] = "?Y\u000fBFV,R\u000e(VT<D\u0012\u007f\u0001\ro\u001d~FAD;^\u001dUJE";
      f054[54] = "\t\t\u001cCW\u0017\u0019^T!_v\t\t\u001cCW\u0017\u0019^T";
      f054[55] = "\u0019(A\u0004\fO\t\u007f\tf\".\u0019(A\u0004\fO\t\u007f\t";
      f054[56] = "\b\u000fLzc}]UMfZ=2\u000b\u0006fewT\u0001\ne\"\u0011\t\u0000Q><w\u0003\fRyZ";
      f054[57] = "7Yv\u0003'M.Rwi7O4Dk>`\u0016i\u0018\u0007\u0007 _3^d\u0014+^";
      f054[58] = "q*\u000bs\u0001\"b!\n\u0019\u0011 r7\u0016NFy!ozw\u00060u-\u0019d\r1";
      f054[59] = "o\u0012\u0001Q57|\u0019\u0000;%5l\u000f\u001clrl>ZpU2%k\u0015\u0013F9$";
      f054[60] = "={d=\u001cI-,,_<(={d=\u001cI-,,";
      f054[61] = "\u0005\u00170)\u0006%\u0016\u001c1C\u0016'\u0006\n-\u0014A~TVA-\u00017\u0001\u0010\">\n6";
      f054[62] = "}=X?\u0007@mj\u0010]\u0002!}=X?\u0007@mj\u0010";
      f054[63] = "^\b\u0010@[,M\u0003\u0011*K.]\u0015\r}\u001cw\rOaD\\>Z\u000f\u0002WW?";
      f054[64] = "U,f)\u0016-F'gC\u0006/V1{\u0014Qv\u0005n\u0017-\u0011?Q+t>\u001a>";
      f054[65] = "yQ\u000e\u0010\r#i\u0006Fr\"ByQ\u000e\u0010\r#i\u0006F";
      f054[66] = "{5k*>Vh>j@.Tx(v\u0017y\r*w\u001a.9D\u007f2y=2E";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f054[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f055[var4]);
            f054[var4] = var5;
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
      Object var5 = f054[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f055[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f054[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f054[var4] = var13;
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
               var12 = m123(1044160636644831L, 0L);
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
      Object var5 = f054[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f055[var4];
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
               f054[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(1044160636644831L, 0L);
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
                     f054[var4] = var19;
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
               var23 = m123(1044160636644831L, 0L);
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
         if (var8 != '$' && var8 != 170 && var8 != 'B' && var8 != 255) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 248) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'b') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == '$') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 170) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'B') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ExtraChatFormatting.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/A" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   ExtraChatFormatting() {}
}
