package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.system.IWindowManager;
import org.rusherhack.client.api.ui.window.WindowViewHandlerBase;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.client.api.ui.window.view.ListView;

public class QGrC extends ListView<Login> {
   public static long f9560 = Class066.m4320(-1541227180167536265L, 7063081546791439405L, MethodHandles.lookup().lookupClass()).m4325(72175568933093L);
   public static String[] f9561;
   public static String[] f9562;
   public static Object[] f9564 = new Object[38];
   public static String[] f9565 = new String[38];

   public QGrC(String var1, List<Login> var2, List var3) {
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
   public static void m786() {
      f9564[0] = "\u0014_\u000fo\f \bE\r3\u00164\u0018FF\"\u0012<\u001eC\u001co\u001f%\u0012\u0003\u001d(P\"\u0012C\f.\t{,D\u0006%\u0011\"-D\r664\u0015I\u0004$\f\u0017\u001a^\r";
      f9564[1] = "\u001a\u0012\t\\]p\u0011\u001d\u0018\u0013 h\u0002\u001a\u0011Z";
      f9564[2] = "B2NoQ_^(L3KKN+\u0007\"OCH.]oBZDn\\(\r]D.M.T\u0004[)L6\rfD3]\u0017JOZ";
      f9564[3] = "\u0005O\f\u001bg,\u001bG\u0016T/,\u0001M\u000e\u0013&7Am\u0015\u0014:,\u0002K\b";
      f9564[4] = void.class;
      f9565[4] = "java/lang/Void";
      f9564[5] = "\u001ci\rUhT\u0002a\u0017\u001a\nH\u0005|";
      f9564[6] = ",^ST+x'QB\u001bJv,ZFA";
      f9564[7] = "7*:\u000b9,+08W#8;3sF'0=6)\u000b*)1v(Le.169J<w;73Q.7,v\nL%=7/\u001eJ%-=6)";
      f9564[8] = "`\\.|\u0001~|F, \u001bjlEgɬ";
      f9564[9] = "`C\u001d\u001dRY|Y\u001fAHMlZTPLEj_\u000e\u001dA\\f\u001f\u000fZ\u000e[f_\u001e\\W\u0002yX\u001fD\u000e`fB\u000eeIIx\u00159\\LYb_";
      f9564[10] = "\u001f\bP@m\"\u0003\u0012R\u001cw6\u0013\u0011\u0019\rs>\u0015\u0014C@Þ";
      f9564[11] = "k\u001fp:DOw\u0005rf^[g\u00069wZSa\u0003c:Ȟ";
      f9564[12] = "AuoX\u001a\u001a]om\u0004\u0000\u000eMl&ĝ";
      f9564[13] = "czTF\n>\u007f`V\u001a\u0010*oc\u001dԐ";
      f9564[14] = "anoto!}tm(u5mw&Ǝ";
      f9564[15] = "\u0006\n$48.\u001a\u0010&h\":\n\u0013mҌ";
      f9564[16] = "/I\u001duv\t3S\u001f)l\u001d#PT8h\u0015%U\u000eue\f)\u0015(.w\u0014%I2:g\u0017\u0001k3";
      f9564[17] = "2;-*/y.!/v5m>\"dg1e8'>*<|4g9}.x8$dM\ne3-%s\u0010m3(-a/";
      f9564[18] = "iz|o|Bu`~3fVec5\"b^cfoooGo&n( @of\u007f.y\u0019pa~6 `of\u007f.yaoml";
      f9564[19] = "+$S<nX7>Q`tL'=\u001aɦ";
      f9564[20] = "J7R\u00130\u001dV-PO*\tF.\u001b^.\u0001@+A\u0013#\u0018LkSX#\u001cP7P\u00135\u0001K!ZJl8J5@M\u0015\u0001K!ZJ";
      f9564[21] = "SGMj~c\\\u0017@7\u0015ӓlG\u0013?zq\u0010\u0010B>h\fV\u0005^%sl\u001c\u0014Xb\u0015";
      f9564[22] = "!x\u001c\u0015,\u007f,g\u001e\u007f1\u001fi$C\r'&~cM\u007fe#uj\u001dFrd{\u0018";
      f9564[23] = "\u0003\u0004G\u0012:\u001bP\u001c\u0018K@Ι3PA\u0015%]\u000f\u0003YJ|";
      f9564[24] = "oOA\u0014c_3H\u0018XRϟ^\u001cY\u001ec\u0018$VI\u00004";
      f9564[25] = "\u0012\b\u0002`L@X\u0018\u001c75ӯ#O\u000b,K\\C\u0005\u001a*\f:";
      f9564[26] = "b05g>\u0006'ao\u007fD\u001e6#Bx \b'2E| \u000116evD_j4ey\"\u0000746\u0015~\u0017&!hu4\u0006 f\u000e";
      f9564[27] = "V<gO\u001a#\u0007+~O!t\u0003A)R\\+\\0u_L(mzhC_(]+\u007fZ_\u0013";
      f9564[28] = "\r_}\u0001\u0016z^G\"Xlȅ=\u0004/\n]-R\u000b\u007f\u0007\u0000F";
      f9564[29] = "duv\u00077\u000b0qr\u0006I\\cnS\u0006/_imI\u000e/Za\u007fvg\"\n4\"pV.M`-\f";
      f9564[30] = "b\u000e?V3=`Zl\u0005_v2O\u0017_9q2C }2k\"3gE-sd\u00036R4s_\t.E!k?C?Cf\r";
      f9564[31] = "2M\f%`\u0001!\u001b]d\u0010\u000f9\u0013\u001a8v\u0018\u001a\u0014\u001d)\u0010_#\u0007\u0018n \u000e4\u001e\u0018";
      f9564[32] = "\u0006MuT09\\\r~\u000fJռlD\"Z%6\u0010\u0013s[7";
      f9564[33] = "+n+W|ha~5\u0000\u0005ɝ\u001a(-\u0014{)*y:\r{";
      f9564[34] = "3B \u001c<\u000foEyP\r[\u0002L>\u001dkVxP~\u0017a1n[5\u000bjKr\u001b?\u0001\r";
      f9564[35] = "i\u000e0\u0003\u000ewfMa\u0017\u007fȑWM1\u0003\r(nZv\r\u007fjkQ\u007f]F},_\r";
      f9564[36] = "\u0012}\u001e\f34W,D\u0014I>G~n\u0019-*Nt%\u0006u3Y(\u001c\u00112=+,CD44UoJ\u00078W";
      f9564[37] = ")*kh\u0013A%m?go\b%k, 0\u0011$\u007f6'o\u001d)clf\u0011\u0001\"z2XU\u0002?m78\u001f\u00139*Q";
   }
}
