package org.rusherhack.core.command.argument.parser.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class316;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.exceptions.ArgumentException;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.utils.StringUtils;

public class EnumArg<T extends Enum<T>> implements IArg<T> {
   public static long f1490 = Class066.m4320(-5255652122063333732L, -5736652682901474251L, MethodHandles.lookup().lookupClass()).m4325(197062815068559L);
   public static String[] f1491;
   public static String[] f1492;
   public static Object[] f1494 = new Object[42];
   public static String[] f1495 = new String[42];

   @Override
   public List<String> getSuggestions(CommandProcessingSink var1, String var2) {
        return null;
    }

   public T parse(CommandProcessingSink var1, String var2) {
      Class var11;
      Class var10000 = var11 = var1.getCurrentEntry().getMethodData().arguments().get(var1.getCurrentEntry().getParsedArguments().size()).type();

      try {
         if (!var10000.isEnum()) {
            throw new IllegalStateException("Invalid enum type: " + var11.getSimpleName());
         }
      } catch (Class316 var10) {
         var10.printStackTrace();
      }

      Enum[] var12;
      int var7 = (var12 = (Enum[])var11.getEnumConstants()).length;

      int var6;
      for (int var13 = var6 = 0; var13 < var7; var13 = ++var6) {
         Enum var8;
         String var9;
         if ((var9 = (var8 = var12[var6]).name()).equalsIgnoreCase(var2) || StringUtils.toTitleCase(var9).equalsIgnoreCase(var2)) {
            return (T)var8;
         }
      }

      throw new IllegalStateException("Could not find enum constant: " + var2);
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
   public static void m194() {
      f1494[0] = "\u0019\u0003\u001e:nq\u0005\u0019\u001cfte\u0015\u001aWwsv\u0013_\u001a{qi\u0017\u001f\u001d:}v\u0011\u0004\u0014qrpX\u0001\u0018foa\u0004_\u0010ylhX4\u0017aqE\u0004\u0016";
      f1494[1] = "KD fC7W^\":Y#G]i+^0A\u0018$'\\/EX#fA0KU\";B+JQi\u000b^/IW),a0KU\";B+JQ\u0014!_)";
      f1494[2] = "i0\u0012sHUb?\u0003<5Mq8\nu";
      f1494[3] = "}Gk^aOvHz\u0011\nMbK";
      f1494[4] = "Z\u0000+ft'F\u001a):n3V\u0019b+i P\\/'k?T\u001c(fv Z\u0011);u;[\u0015b\u000bi?X\u0013\",V Z\u0011);u;[\u0015\u001f!h9\u0011?)<n=Q\">'e7F\u0001#:";
      f1494[5] = ",{\t\b>)2s\u0013G\\5(q\u001a\rX=5r2\b`";
      f1494[6] = "I`Td\u0003\u001dUzV8\u0019\tEy\u001d)\u001e\u001aC<P%\u001c\u0005G|Wd2\u0007K\u007fR$\u0015,GfRn<\rRz\\.5\tRs";
      f1494[7] = "\u0013:ru\u001cS\r2h:~O\n/";
      f1494[8] = "g\u001b)f\u000e2y\u00133)a5\u007f\u001b&KI4y";
      f1494[9] = "\u0017NQgMA\u001cA@(,O\u0017JDr";
      f1494[10] = boolean.class;
      f1495[10] = "java/lang/Boolean";
      f1494[11] = "X\u0017\u0018N0\nS\u0018\t\u0001]\nS\u0005\u001d";
      f1494[12] = "\u001c(z\u000fn\u000e\u00002xSt\u001a\u001013Bs\t\u0016t~Nq\u0016\u00124y\u000f_\u0014\u001e7|Ox?\u0012.|\u0005]\t\u0014/pDr\u000f7;i@";
      f1494[13] = int.class;
      f1495[13] = "java/lang/Integer";
      f1494[14] = ".we\u0011x\u001a2mgMb\u000e\"n,ɋ";
      f1494[15] = "31`kEbF\u0011kdT-'\u001f`oPwS";
      f1494[16] = "ygI(fWe}Kt|Cu~\u0000e{Ps;MiyOw{J(uPq`CczV8eOtgGd;GkdN8FZt}LqVOv`Wdp\\GfE";
      f1494[17] = "M\u0003X\u000f()Q\u0019ZS2=A\u001a\u0011B5.G_JU30Q_lU(5L\u0016jU30Q";
      f1494[18] = "i\u0016)zm9u\f+&w-e\u000f`7p>cJ=1k8o\n)zL)r\u0010':x";
      f1494[19] = "uhK*n\u0013\u0000H@%\u007f\\}PS\"v\u0015\u0015";
      f1494[20] = ";c|\u0005\u001cANCw\n\r\u000e3[d\r\u0004G[";
      f1494[21] = void.class;
      f1495[21] = "java/lang/Void";
      f1494[22] = "`e\u0005\u001b\t\u00009w\u0007|OPyqW|\u000e\u0002{l\\\u001a\u000fU;c:EF]{tQ\u0001\u0006[~\n\u0000BUG?n\u0000\u0000\f\u0000\u0003";
      f1494[23] = "_SF9_\u000e\n\u0017\t,nZ\bQl7\u0014N\bA}$\u0001H\u0000@R\"\u00155Y\u0010^'\tE\u000b]^#n";
      f1494[24] = "DD\\`&\u0006E\u0013\u001co@\u000f\u0010\u0003o{:\u001a\u0010\u0019XK&\u001c\u0007\u000e$<>\u0012\u001aN\u001fiz]\u000f\u007f";
      f1494[25] = "K9-t\u0002JDz#|fԕ (mhY\u000e@4suXt";
      f1494[26] = "?\u0010Hx1xe\u0004[cC{y\u0012Zy.t\u007f\u0006'!y|=\u0003\u001fc#w=}";
      f1494[27] = "\u0011c\r83\r\u0011!T\u007f\u000f\u000fB8\u0002F6\u0018O%\u0011-rXI o";
      f1494[28] = "RV)Fw\u001d\n\u0010/U\u000bH\u0003EU\u0015dS\u0017RhR{\u0010\u000b)j\u0012pY\u0011\u0015:\u0014t\u001eo";
      f1494[29] = "Wi4X\u001e\"\u0002-{M/v\u0000k\u0003RSy\n{\nVSpm++PKk\u0007q?CP\u0019";
      f1494[30] = "8\u001dGMo\u0013z\u0005IPW\fj\u0007vM2\u001bc\u0016kE2\u000e\u0007B\\H/\u001dl\u0006\u001cN*c";
      f1494[31] = "\u0000]\u000fMRUBE\u0001PjDDv\u0003Q\u000f%\u0000\u0002\u001eT\u0014\u0019P\u0004\u001a\u0013j";
      f1494[32] = "`n_'OK xQ/3I!f\rW\fS:\u007fX'NK4b`";
      f1494[33] = "!\\kB)jc\u0006`BW=q\u001a\u0005M35{\u00184F+/ff;\u0013%*g[|\ff6\u001c";
      f1494[34] = "$\b\u0015$kf}\u001a\u0017C<_.\u000eM*0#-\nX\u007fU6.\u0000C&)5*\u0015\u0016C";
      f1494[35] = "O-dN^V\r5jSfI\u001d7CI\u001bC;,hT\u001aO\u00167u/\u000fF@(5\u0013\u0014K\u0010(\u000e";
      f1494[36] = "EwUq\u0017gE%\f:oƬ/{\bm\b\"\u001ep\u0010w\u0015\\";
      f1494[37] = "%$by\u0002\u0014*glqf͕N5\"eYP.)<xX*#\">mY\u0014?c=rf";
      f1494[38] = "N>\u0016OFq\u001cs\u0016K!z\u0013q\u00116\u0010e\u0015d\u0002\u0007\u001b}\u000fy|";
      f1494[39] = "\u0006\u0001c\u001b\u0018qBAe\u001efwF\rn\u0007\u001d[P\u0016`\u0019\u000bQV\u000bjc_k[\by\b\u001b+]\r\u0007\\_aG\u000e;\fYe\u0000p";
      f1494[40] = "67}udn6e$>\u001c£\\; i{+m08sfU";
      f1494[41] = "Nmy@;tW%{\u0010Z5B\u0000~\u0005>$n5d\u0014ZpT8g\u000714\u0014>byc8A$a\u0012'xG!\u001f";
   }

   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }
}
