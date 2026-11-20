package org.rusherhack.command;
import org.rusherhack.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.client.api.feature.command.FeatureCommand;
import org.rusherhack.client.api.feature.hud.IHudElement;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.core.command.AbstractCommand;
import org.rusherhack.core.command.CommandData;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.logging.Logger;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Pair;

public class Class351 extends Command {
   public static File f5700;
   public static long f5701 = Class066.m4320(-8109007680105945065L, 6417980692390647543L, MethodHandles.lookup().lookupClass()).m4325(141588002317100L);
   public static String[] f5702;
   public static String[] f5703;
   public static Map f5704 = new HashMap(13);
   public static Object[] f5705 = new Object[107];
   public static String[] f5706 = new String[107];

   public Class351() {
    }

   @CommandExecutor
   public void m8560() {
        
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

   public static String m153(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22847;
      if (f5703[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f5704.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f5704.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/ʱ", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         try {
DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f5702[var5].getBytes("ISO-8859-1");
         f5703[var5] = m117(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f5703[var5];
   }

   public static Object m154(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = m153(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class351.class, "m154", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʱ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m156(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5706[var4] != null) {
         return var4;
      } else {
         Object var5 = f5705[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 5;
               case 1 -> 60;
               case 2 -> 56;
               case 3 -> 12;
               case 4 -> 45;
               case 5 -> 23;
               case 6 -> 41;
               case 7 -> 49;
               case 8 -> 8;
               case 9 -> 46;
               case 10 -> 10;
               case 11 -> 63;
               case 12 -> 7;
               case 13 -> 58;
               case 14 -> 40;
               case 15 -> 2;
               case 16 -> 51;
               case 17 -> 17;
               case 18 -> 39;
               case 19 -> 42;
               case 20 -> 52;
               case 21 -> 34;
               case 22 -> 3;
               case 23 -> 59;
               case 24 -> 22;
               case 25 -> 36;
               case 26 -> 15;
               case 27 -> 35;
               case 28 -> 25;
               case 29 -> 47;
               case 30 -> 48;
               case 31 -> 14;
               case 32 -> 19;
               case 33 -> 54;
               case 34 -> 28;
               case 35 -> 6;
               case 36 -> 44;
               case 37 -> 21;
               case 38 -> 43;
               case 39 -> 62;
               case 40 -> 24;
               case 41 -> 50;
               case 42 -> 20;
               case 43 -> 61;
               case 44 -> 11;
               case 45 -> 37;
               case 46 -> 18;
               case 47 -> 32;
               case 48 -> 26;
               case 49 -> 53;
               case 50 -> 1;
               case 51 -> 55;
               case 52 -> 57;
               case 53 -> 38;
               case 54 -> 9;
               case 55 -> 33;
               case 56 -> 0;
               case 57 -> 13;
               case 58 -> 30;
               case 59 -> 31;
               case 60 -> 16;
               case 61 -> 4;
               case 62 -> 29;
               default -> 27;
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

            f5706[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f5705[0] = "Hwz\u0012\r\u0004D\u007f{YD\fXwy\u0012-\u0018Dv";
      f5705[1] = "-2\u0005T\u0019!(}$G^<\"!";
      f5705[2] = "\u001bK\u0013jlJ\u0017C\u0012!%B\u000bK\u0010jxQ\nA\u001f)%o\u000bK\u0010\u0013yL\fA\f";
      f5705[3] = "HxK\\\u001a\u0017DpJ\u0017S\u001fXxH\\7\u000bDyg\u0000\u000f\u0019R";
      f5705[4] = "?U\u0015_8L3]\u0014\u0014qD/U\u0016_\u0015P3T=\u001d:N9T\f";
      f5705[5] = void.class;
      f5706[5] = "java/lang/Void";
      f5705[6] = "Q3J\u0004dxO;PK)bU1I\u00178hU&\u0012&%}B\u001dR28dO7}\u00178lB\u001eU\u0016>";
      f5705[7] = "\u001a\ra=\u0013n\u0004\u0005{rto\u0015\u001ev(Ri";
      f5705[8] = "]\bP{UoA\u0012R'O{Q\u0011\u00196HhWT^;S\u007f@\u001cV6Bi\u001c3y4J\u007fV";
      f5705[9] = "F\u000b\u000e(c>M\u0004\u001fg\u001e&^\u0003\u0016.";
      f5705[10] = "6}HY|~(uR\u0016\u001eb/h";
      f5705[11] = ";\u000e\u001c%\t\u000e%\u0006\u0006jA\u000e?\f\u001e-H\u0015\u007f,\u0005*T\u000e<\n\u0018";
      f5705[12] = "=_\u00011\u001c\r!E\u0003m\u0006\u00191FH|\u0001\n7\u0003\u0000z\u000f\f'_\u00031'>7L\u0012j\u001c\u001d\u0011B\by\u0007\u001f'_\u0007}\u0002\u001d";
      f5705[13] = "\u0016]@^#w\nGB\u00029c\u001aD\t\u0013>p\u001c\u0001D\u001f<o\u0018AC^\u0010`\n[U\u00112v:@J\u001d0l\u001d";
      f5705[14] = "0140<9<95{u1 170\u0011%<0\u0016|130*";
      f5705[15] = "\u000ejac\u0004\u0003\u0012pc?\u001e\u0017\u0002s(ϕ";
      f5705[16] = "=w1MT\u000b#\u007f+\u00025\u001c=s$X\t";
      f5705[17] = "ei_\u0007\u0014{nfNHuuemJ\u0012";
      f5705[18] = "VuEaBiJoG=X}Zl\fѢ";
      f5705[19] = "Xiu]-\u000eDsw\u00017\u001aTp<ԣ";
      f5705[20] = "/\"\tX[\\1*\u0013\u00174[7\"\u0006J";
      f5705[21] = "za\u0015v(*\u000fA\u001ey9enO\u0015r=?\u001a";
      f5705[22] = "\"t'\f[e>n%PAq.mnAFb((,MNw.h'\f`\\\"a";
      f5705[23] = "HH!p\u0019P=h*\u007f\b\u001f\\f!t\fE(";
      f5705[24] = "mb\fWQ\\\u0018B\u0007X@\u0013eZ\u0014_IZ\r";
      f5705[25] = "0p^iIV,j\\5SB<i\u0017$TQ:,Z(VN>l]iKQ0a\\4HJ1e\u0017\u0004TN2cW#kQ0a\\4HJ1ej.UH";
      f5705[26] = "Cv\u0003D`%_l\u0001\u0018z1OoJ˛";
      f5705[27] = "@k>pwpKd/?\u001cdIo8e0sD";
      f5705[28] = "{N\u0017Md/gT\u0015\u0011~;wW^\u0000z3qR\u0004Mw*}\u0012\u0016\u0006w.aN\u0015M{5pI\u001c\u00068\u0017{X\u0005\u000fs";
      f5705[29] = "\u001d\u007f\u0016;:$\u0001e\u0014g 0\u0011f_v'#\u0017#\u0012z%<\u0013c\u0015;\u000b>\u001f`\u0010{,\u001c\u0013c\u0010r-#";
      f5705[30] = "x\u001c$9i\"d\u0006&es6t\u0005mtt%r@ xv:v\u0000'9X8z\u0003\"y\u007f\u0013v\u001a\"";
      f5705[31] = boolean.class;
      f5706[31] = "java/lang/Boolean";
      f5705[32] = "0HwD<L,Ru\u0018&X<Q>\t!K:\u0014v\u000f/M*HuD\u0007\u007f:[d\u001f<\\";
      f5705[33] = "_\u0005r*$+C\u001fpv>?S\u001c;ů";
      f5705[34] = "\u0007\rK\u0006)\u0017\u001b\u0017IZ3\u0003\u000b\u0014\u0002K4\u0010\rQ@G<\u0005\u0001\u0011K\u0006\u0017\r\u000f\u0018IZ";
      f5705[35] = "F%d=\u0003PCjT5A\\";
      f5705[36] = "\u0007qOVT]\u0004}\\\u00193G\u001edXY\u000e";
      f5705[37] = "?\u000fw\r)!#\u0015uQ353\u0016>ȥ";
      f5705[38] = int.class;
      f5706[38] = "java/lang/Integer";
      f5705[39] = "H;(\u001dq\nT!*Ak\u001eD\"aPo\u0016B';\u001db\u000fNg,\\m\u0019N.ayp\u0010I\n ]e\u0016@<=Rw\u0016H'";
      f5705[40] = "\u001a\u007fT{vR\u0006eV'lF\u0016f\u001dȑ";
      f5705[41] = "\u000b\u0017\u001c\u0000|k\u0017\r\u001e\\f\u007f\u0007\u000eUMal\u0001K\u000eZgr\u0017K+Ogl";
      f5705[42] = "\u0003}=\u0018\u0012W\u001du'WxC\u001dy";
      f5705[43] = "\u00057u\t4`\u0019-wU.t\t.<D*|\u000f+f\t'e\u0003ktB'a\u001f7w\t+z\u000e0~BhX\u0005!gK#V\u000b1w@)g\u0013";
      f5705[44] = "^z\t/:[B`\u000bs ORc@b'\\T&\u001dd<ZXf\t/\u001bKE|\u0007o/";
      f5705[45] = "?R\u0014\u007f}\u001e#H\u0016#g\n3K]2`\u00195\u000e\u0010>b\u00061N\u0017\u007fL\u0004=M\u0012?k>$I\u001f\"";
      f5705[46] = "O;S\"\f\u007fD4Bma\u007fD)V";
      f5705[47] = "\\G\nDE\u0011@]\b\u0018_\u0005P^C\tX\u0016V\u001b\u001e\u000fC\u0010Z[\nDr\nFX>\u000fC\u0010Z[\n";
      f5705[48] = "G1z|^E2\u0011qsO\nO\tbtFC'";
      f5705[49] = "\u001eq\u0012~\u00123\u0016q\rDI$\u0007C\u000e#I\u0016\u0002`\t)UI\u00069\u001f(\u00104Hm\bD\u00168\u0019`\u001e\"_r\u0002lu";
      f5705[50] = "*\"\bE\u000e0n>\u0000\u0014>9|+9\u0013\u000e5*#\u0007E\u0000!-G\u0002YCop%]VT2\u0010";
      f5705[51] = "\u0003F\u000f\u0017*\u0000XF\u0006\u0006Q\u0010CJL\u0005-\u0016E'\u000b\u0000;\t\u000f\u0016]\u0014-N?";
      f5705[52] = ";\\&E\u0013;z\u001bzWymh\u001f\tY\u0002za\n4~\u0010ghc{_\u000538\u001d\u007fS\u0017?\u0005";
      f5705[53] = "\u0000{ws\u0010\u001dA<+azKS8Rg\u001fI>zsrK\u0019@~\u007f`G$";
      f5705[54] = "\u001d:\"T\u0019U@2=_x]D1\u0014_\u0013S#t\"O\u0000\nQ-9QD3\u0018:$\t\u0018QG53Tx";
      f5705[55] = ":;B4\u00145<oTrxk((}h\u001d|!9``\u001diEjAuI9;nMgE\u0004";
      f5705[56] = "J(8J13\u001c\"<\tA?\u0017/\u0004[=,\u001b50MAn\u000b(=W'3\u0003766";
      f5705[57] = "J\"\u0002\u0017\u0011H\u001b-\u0011IhH\u001605\u001d\rJ{r\u0014\bY\u001a\u0005v\u0018\u001aU'";
      f5705[58] = "$t\u001d\"Mn\"&Gftv!&&b\u0013g 0\u0002it!*6O%\n%&$C\u0018Jx1{CfNt#w~#\u0005br*\u001c|\nu/J";
      f5705[59] = "-\u0002\u001f[Q|-\u0019\u0012SlɨDMH^]&:IDLQ";
      f5705[60] = "\u0011,YX\u0019]\u0016(A@e\u001b\u00166EE\u001f\f=(^b\u0018\u0005\u001fOSI\u0003X\u0002(D\\\f\u000f{$UB\\\u0018\u001c3@M\u000ba";
      f5705[61] = "CkjD\u0018\u001cF0(Q\"Ǹ(5d@@\u0006Nhl_Kg";
      f5705[62] = "TN\u0016GG,\\N\t}\u00061pE\u0016\u001bzm\u0002[K\u0019D;\fOL}C'S_\u001a\u001b\nmHSqF\u000b+\r^\u0013\u0019\u0004<P>";
      f5705[63] = "n}^F\u0019Qa&[M#Q~fmBXFwsPeJ[~\u001a\u001fD_\u000f.d\u001bHM\u0003\u0013";
      f5705[64] = "Genkk\"\u000e/ug\u0000/\u001astg\u0000\u007f\u000fi0jb \u0000~m\n";
      f5705[65] = "%D=&z6pJm-\u0014\u0003I\u0017fso)8Lfz~R";
      f5705[66] = "'3\f5N\u0005t?\b2\u007f\u001f,\u001a\u00110\u001e\u0005$A\u0002q\u0016\b/=\u0011-\u0006[K\u007f\n6N^5{\u0006$Bc";
      f5705[67] = "{\u0011\u00122bimF\u000b<\u0006<o\f\u001e#\u0006or\nHdxk~\u0018DYij|\u001d\u001d%z6lNybw,*\u0016\u001b=x;wv";
      f5705[68] = "=0O[4Kl?\\\u0005MKa\"w\\,Mw3E8=A33\u0001\u0000/Vqb>";
      f5705[69] = "\u0002Gg4)\u000e[C{4MBb\u0014{!|S\u001c\u0010w3pn\\M`lp\u0010XAr`M";
      f5705[70] = ",\u001fw5t }\u0010dk\r p\rJ;v$g\u0010~*l({q81q~ \u000f<=cr\u001d";
      f5705[71] = "\u001a\u001fd,\u001d/\u0015Da''/\n\u0004@4M\u001b\n\u0004g(A/\u001cx%8\\\"\u0006\u001ex0C)g";
      f5705[72] = ".fJ}\u000f\u0015(4\u001096\r+4)yQ\u0018veW}]\nzX\u0012wS^#fDyGYGcX:\t\u0004%<W-Td";
      f5705[73] = "!\\i[d\u001e;[b@\u000e\u0006@\u0005k\u00071\u000f+\u0007kD7o\"\f>\u0006n\u0004 \f}\u0000\u000e";
      f5705[74] = "\u0006\u001dWKi7\u0019XJL\u00053\t\u001c}^`1d^\\K4a\u001aZPY8\\";
      f5705[75] = "\u00016:\u0011W<\u001es'\u0016;8\u000e7\r\u0000G+\u0002-9\u0016;i\u001204\f]4\u001a/?m";
      f5705[76] = "\u0016X@*,'\u0016QQ,@\"\u0018Nf5%(\u001cTA\u001e)1\u001c2\u00135<|HL\u00179.puVG<0/D\bU4%M";
      f5705[77] = "\u000b\u001a\"K9u]\u000e4\f\t$_\r\u000e^y86\u0013rBw>X\u0006(\fqD";
      f5705[78] = "\\/wM-hH\u007frOV~Tc\u0000N-zC~4_7v_\u001frD* \u0004avH8,9";
      f5705[79] = "\u0002\u0005?\u0016p$T\u0011)Q@sR\u0019)n+xYP,\t<mV\u0007U";
      f5705[80] = "R+k^\u0010\u0016R0fV-Ψ;=8Y\\\u001d@(*\u001c@";
      f5705[81] = "@a\u0016vj}\u0011n\u0005(\u0013}\u001cs+thj\u0015f\u0016Szw\u001c\u000fYro#Lq]~}/q";
      f5705[82] = "=;^(G\u0015=$M+-\u0004[?F}J\u0010!`\u000b,J";
      f5705[83] = "C\u001c0vdeY\u001b;m\u000eʱ\"@:j\u007fxYU(/c";
      f5705[84] = "\u0006\twh\\p\u0006\u0000fn0u\b\u001fQwU\u007f\f\u0005v\\Yf\fc+~Ay\u001c\fzqR'e\u0007p~@xTYbvU\u001a";
      f5705[85] = "\u0018H\u0012+H[\u0018W\u0001(\"Ի~A\u001bo]\u001b\u0005D@-H!";
      f5705[86] = "3\br4\u001c\u00004\bi4\u007f\u0005,J\u000e#B\u001f$Vm.B\u0004$5";
      f5705[87] = "C\u0002K\u0007BvTSVA;ȓ:@OJX*PY_\u0003\u0003J";
      f5705[88] = "ZMgt$\u001dZRtwNϙ<Il&u\rFIs5v";
      f5705[89] = "~A\\ \u0017-4\u001fT=r\u0005_7xE\u0014:cJ\u0003?\u001c:|";
      f5705[90] = "DC\u0006A\u000e]D\\\u0015BdӍ\"[\u001f\u001d\u0019N@\u001a\u001e\u0000\u0005'";
      f5705[91] = "-\u001atsNu\"Aqxtu=\u0001M\u007f\u0011wPCljE'.G`xI\u001a";
      f5705[92] = "5\u0007zq1Jq\u0013aoQ[NBab`J0Fmplwp\u001bz/l\tt\u0017h#Q";
      f5705[93] = "%WNu\t[0\u0007\u0006lyN#PY\u0007\u0001\u001d%X_d\u0006\u001d>X<{\u0019R+GGnI\u001a27";
      f5705[94] = "!C@U>\u0010>\u0006]RR\u0014.B`D)\u00109_TU3\u001c%>\u0012N.J~@\u0016B<FC";
      f5705[95] = "\u001d-AUvp\b}\tL\u0006w\u0006\u0002v{]w\u001b,UH\u00065\u00061\u0002\u001ax1\n#\u000e'";
      f5705[96] = "\t\u001aqxvK\u0006AtsLK\u0019\u0001Pt(Y\u0019}ep*\u001d\r\u001are%Jt";
      f5705[97] = "f\"BI\u001eOiyGB$Ov9qA_Ka.EPEG}E\u0003KX\u0011&;\u0007GJ\u001d\u001b";
      f5705[98] = "<K\u0011+ew#\u000e\f,\ts3J6>uq1Q\u0007&\t`#W\u0003'gd:KGW";
      f5705[99] = "!x\u007fe/\rno\u007fl\u0017\u00043b\u0006dk\n9x:\u001crQ/`;rg\u000bafAlrT3!y~e\u0016b\u001e";
      f5705[100] = "^z \u0017\u0005\u001eZc<Su\u001fO{\u0007\u0000\u0010\u001d\"9&\u0015DM\\=*\u0007Hp";
      f5705[101] = "Op+L\u0004bUw WnЁ.6%Q\u000b)A9~T\u0000\u0013Gu!\u0014WbA'{Pn(_6}N\fwP! .";
      f5705[102] = " -DyH1}%[r)6b1ErU0d\\\u0002wC/.mTcUh\u001e";
      f5705[103] = "\u000bS&L[$\u000bL5O1ěm] M]0\t\b.\u001dV^";
      f5705[104] = "]ZN\u000e&\u0005R^Q\u0016B\u0003N\u0002B\u001d+\u0010N?^\u0001>\u0005S N\u001c>lG\u000eA\u0017 ]\u0019\u001cI\u0002B\t\u0019\u0015Q\u001d,\u001cC[Wg'VR\u001aU\t2\f\u001c\u001c/Y3\u0017A\u0005I\u0004;\bJd";
      f5705[105] = ":k-[L/gc2P-(\u007fW3AQ8\u0004\u007flHS3jj6\u0006UI";
      f5705[106] = "UL%\u0007D>UE4\u0001(;[Z\u0006\u0012A(K\\%\u0004(jG]*\u001eN7OB!\u007f";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f5705[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5706[var4]);
            f5705[var4] = var5;
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
      Object var5 = f5705[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5706[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f5705[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5705[var4] = var13;
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
               var12 = m158(1260021185099079L, 0L);
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
      Object var5 = f5705[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5706[var4];
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
               f5705[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(1260021185099079L, 0L);
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
                     f5705[var4] = var19;
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
               var23 = m158(1260021185099079L, 0L);
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
         if (var8 != 198 && var8 != 164 && var8 != 251 && var8 != 197) {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 232) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 203) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 198) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 164) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 251) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class351.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʱ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
