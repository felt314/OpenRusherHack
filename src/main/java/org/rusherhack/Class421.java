package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Class421 {
   public static String f7011;
   public static SecretKey f7012;
   public static KeySpec f7013;
   public static SecretKeyFactory f7014;
   public static String f7015;
   public static byte[] f7016;
   public static Cipher f7017;
   public static String f7018;
   public static String f7019;
   public static long f7020 = Class066.m4320(-8743816318921662624L, -1716133711145784372L, MethodHandles.lookup().lookupClass()).m4325(279553983211443L);
   public static String[] f7021;
   public static String[] f7022;
   public static long[] f7024;
   public static Integer[] f7025;
   public static Map f7026;
   public static Object[] f7027 = new Object[53];
   public static String[] f7028 = new String[53];

   public static String m13553(byte[] var0) {
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
   public static void m122() {
      f7027[0] = "=\u0007)\u001dTm3\u0016&V\u001b~=\u0018#\\[n|\u0016!WP~|\u0017']To+[\fRFxdA";
      f7027[1] = "^\u0015x4MzU\u001ai{0bF\u001d`2";
      f7027[2] = "J#";
      f7027[3] = "\u0005\u000f8\u0000QM\f\u001c7\u0011]\fA-'\u0011A\u0006\u001d";
      f7027[4] = int.class;
      f7028[4] = "java/lang/Integer";
      f7027[5] = "\fZ2e-\u007f\u0003X1vjx\u001f\u0015\u000faz";
      f7027[6] = void.class;
      f7028[6] = "java/lang/Void";
      f7027[7] = "\u001e>";
      f7027[8] = "\u0007L";
      f7027[9] = "v\u0016cD\u0003Ij\fa\u0018\u0019]z\u000f*Ѯ";
      f7027[10] = "_\u007fC12oVlL >.\u001bMP38$AUP)";
      f7027[11] = "\f\u0015";
      f7027[12] = "\u0010E";
      f7027[13] = "\u001cD";
      f7027[14] = "D[\u0014qt`XA\u0016-ntHB]ə";
      f7027[15] = "a\u00009\u001e_oj\u000f(Q\"wy\b!\u00183vb\r+\u001a\u0003";
      f7027[16] = char.class;
      f7028[16] = "java/lang/Character";
      f7027[17] = "kkAF(pwqC\u001a2dgr\bȢ";
      f7027[18] = "e8L\u0014iMf6\u0014\u0016/B}*_\u0001i`g8H\u0006\"W";
      f7027[19] = ">\u001f";
      f7027[20] = "\u0004|]c\u0017\u0012\u000b~^pP\u0015\u00173fgJ\u0012\u000fzNFP\u0006\u000bn_";
      f7027[21] = "=I";
      f7027[22] = "\u0018lL7S!\u001bb\u00145\u0015.\u0000~_\"S\u001c\u0006lT2\u001c=\u0016NR7\u000f<\u0017yI";
      f7027[23] = "J5";
      f7027[24] = "{/";
      f7027[25] = "\u0011P|x.n\u0018Csi\"/Uboz$%\u000fzo`\u0010!\u0018Eek/";
      f7027[26] = "c\u0003\rX\u0002Ll\u0001\u000eKEKpL\bII\\')\u001e@\u007fOl\u0001";
      f7027[27] = "\u000bW";
      f7027[28] = "-\u0010\u000635~&\u001f\u0017|Tp-\u0014\u0013&";
      f7027[29] = "n&U\u0017`\u001dq%A\u0000\f\u0002c5m\u0014w\u0011g/G\u001f\f\u001f>sT\u0015eS\u007fw,\u0012c\u0014k%\\\r`\u0000|I";
      f7027[30] = "\u0012;,S)\u0016\u001efem{\u0002\u0013f9\u0000]\u0006\u0003lkQ\u0017\u001dH;-\n~Q\t?U\u000f*QGq0\\/\u0010\u0014\u0001";
      f7027[31] = "@\u00144p}h\u0017Hro\u0007ϼ+Xz7\u007f0B\u0014;3\u0007%\u001b\u00102jniZ\u0014J";
      f7027[32] = "g\u0012/$\u0018>x\u0011;3t!j\u001b;;\u001d2j&;*\u000e#{}7pO-i\u0006fx\u0014w\u0007BopN#=Gh!MN";
      f7027[33] = "{Spy\u001c\np\u0016j;sȢ\u0012WqbN\u0002n\u0016}g\r{";
      f7027[34] = "|\u0003J5Z%y\u0003Rm69r=V/W#zfXe\f=r\u000f\u0014$\bE";
      f7027[35] = "?&I${N:&Q|\u0017G.;D\"{.<%D<q^61B&\u0017G3#I(wB3;\u0011D";
      f7027[36] = "y\u0015\rf\u0000{5T\t\u001e\b\u007fwoFb\ni\u000bNWy\u0007~oE[g\u0003\u0012i\u0018\t!\u0017w:\u001dHrg";
      f7027[37] = "Z\u0001\u000esp}\u0016@\n\u000bsyN^Hk\u0017/BS\trknNVJ\u000b";
      f7027[38] = "oP~Gc\r*\\wI\u001b\u00123\rf% \u00197QcYa\u00152\u0012\u001a\u001ei\u001d0\u000f+J`\t,l&]y\bo\u0013f\u001f&\rU";
      f7027[39] = "\u000f yy\u0011pJ,pwibRR|}\u0000j5~ %V~P-%d\u0005\u000eW!#$\u0019k\u0004$bwi";
      f7027[40] = "iw%x%+5tymI#ijU`20mp\u007fkI>4,la ru(\u0014k(}zzs7+!o\u0016";
      f7027[41] = "\u001f\u000e\nB\u0013;F\u001c\rLlƻ!\u0006@\u001c\u000f'ZWHGU";
      f7027[42] = "L=.\f$)\u0010>r\u0019H3Y0v\u000e%NCa!M8+\u0010d`\u001eHuK>\"\u000b44G;ars$Caf\u000e2(F\"\u001fN0,Zf`\u000ers_\\";
      f7027[43] = "+\\\u000ec]QrN\tm\"ŗ\u0015WH8\u001dSp\u0004MyN";
      f7027[44] = "gg\u001a&\u0015\u0000\"k\u0013(m\u00110'?\"\u0016\u00024=\u0015)m\fma\u0006#\u0004@,e~~Q\u001a?#\u0000;]\u00131[";
      f7027[45] = "63\"`S34\"8c6\u0018\u0003\u0018\u001f=\u0006di\bq\r]9??$iV5!;";
      f7027[46] = "\u0011Ik M\rH[l.2Ţ/\u001a,!P\u0007Q_ (^";
      f7027[47] = "Lq`cj}\u0010r<v\u0006v@\u007f<fz\u001aC-o\"v\u007f\u0010(.q\u0006";
      f7027[48] = "y0oT\u0000  \"hZ\u007f\u0095Gf-\u0000E?}c*QF";
      f7027[49] = "w\u0001\u0014V\u007fm;@\u0010.wiy{_Ru\u007f\u0005C\u001e\u0014`cl\u000f_\u0010\u0018f8\u000f\u0011^}5=NB.";
      f7027[50] = "9[<c!\u0007`I;m^¦\u0007Pz8a\u0005b\u0003\u007fy2uu\u0002}~9\u001c9Cy\u0006";
      f7027[51] = "\u0010`A<\u001d:IrF2bҥ.iU \u0007$^vV4\u0010";
      f7027[52] = "\u0002\u0004R3W\b\u000eY\u001b\r\u0004\u0017\u0003YG`#\u0018\u0013S\u00151i\u0013U\u0000\u0014}\f@PAG\r\u000bLV\u0001[hXI\u0017R+";
   }

   public static Class m123(long var0, long var2) {
        return null;
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

}
