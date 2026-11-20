package org.rusherhack;

import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.utils.InputUtils;

public class Class353 extends passthrough {
   public static long f5739;
   public static long f5740 = Class066.m4320(-8643783495464098060L, 2595281750038309211L, MethodHandles.lookup().lookupClass()).m4325(175890119738579L);
   public static String[] f5741;
   public static String[] f5742;
   public static Object[] f5744 = new Object[31];
   public static String[] f5745 = new String[31];

   public Class353(String var1) {
      super("mainmenu/" + var1);
   }

   static {
    }

   @Override
   public void m6551() {
      super.m6551();
      float var3 = Globals.mc.getWindow().getFramebufferWidth();
      float var5 = Globals.mc.getWindow().getFramebufferHeight();
      this.m9150("time").m14723((float)(System.currentTimeMillis() - f5739) / 1000.0F);
      this.m9150("resolution").m14724(var3, var5);
      this.m9150("mouse")
         .m14724(
            (float)InputUtils.getMouseX() / Globals.mc.getWindow().getScaledWidth(), (float)InputUtils.getMouseY() / Globals.mc.getWindow().getScaledHeight()
         );
   }

   public Class353(InputStream var1) {
      super(var1);
   }

   public static String m171(byte[] var0) {
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
   public static void m157() {
      f5744[0] = "1\u0011\u0001Wk;-\u000b\u0003\u000bq/=\bHˊ";
      f5744[1] = long.class;
      f5745[1] = "java/lang/Long";
      f5744[2] = "\u0011O\u007f]?*\u001a@n\u0012B?\bZlQ";
      f5744[3] = "\u007f])\u0002N(\u007f]>^B'e\u0016>@B2bgn\u001d\u0013";
      f5744[4] = "pg'@lBpg0\u001c`Mj,0\u0002`Xm]b^5\u001a";
      f5744[5] = "`XNV\u0017P|BL\n\rDlA\u0007\u001b\tLjD]V\u0004Uf\u0004\\\f\fI|\u0004`\u0016\u0015P{\u007f]\u0011\tV";
      f5744[6] = double.class;
      f5745[6] = "java/lang/Double";
      f5744[7] = "8|_c\u001b\u001a$f]?\u0001\u000e4e\u0016ɋ";
      f5744[8] = "Qgfxa\u0011Zhw7\u001c\tIo~~";
      f5744[9] = "3zZ7~d/`Xkdp?c\u0013ь";
      f5744[10] = float.class;
      f5745[10] = "java/lang/Float";
      f5744[11] = void.class;
      f5745[11] = "java/lang/Void";
      f5744[12] = int.class;
      f5745[12] = "java/lang/Integer";
      f5744[13] = "\u001ak4{\u0016G\u0006q6'\fS\u0016r}6\b[\u0010w'{\u0005B\u001c7\u00149\u000bP\u0014u ";
      f5744[14] = "\u0002\u000ek5!\u0006\u001e\u0014ii;\u0012\u000e\u0017\"x?\u001a\b\u0012x52\u0003\u0004Rj~2\u0007\u0018\u000ei50\u001c\u0000\u0011mu7]\f\u000ek5\u001a\u0007\b\u0011^~5\u0016\u001f\u0019bx6";
      f5744[15] = "\u001bY\b\f\t\u001a\u0010V\u0019Ch\u0014\u001b]\u001d\u0019";
      f5744[16] = "\u00013\u0005(byC?\u0016#\u001e\"Vs\u0017#r\u0010\u00015It%G\u00004\f:'<\u0001cH?\u001e";
      f5744[17] = "H?dIE \t9zN((\u0019zBTU<\u0019V\u0007\u000fJ.\u0006yz\fR+O\u0006";
      f5744[18] = "I\u0019xay{HSvl\u0012ġuW'y\"!\u0010\u000f!wpJK\u0011usp{\b\nfv\u0012";
      f5744[19] = "\u0002m1<dPAv\"9\u0006Ǚ<+c66\nYse8da\u0002.<bm\u0004Z(20\u0006";
      f5744[20] = "j}\u0019Q#a)f\nTAɯT;\u0001\u0000}aj>\u001eY'Pk}\u000eG{h48NDA";
      f5744[21] = "HD\u000e\u001d\u007f#I\u0013J\u0018F=\u001e\u0003\u0015\u0004*\u000fOCE]Fh\r\u000f\u0005\u001c;?\u0001\u0010\u0005c";
      f5744[22] = "0\u0014&\u007f\u0012ncG8)ryj*~\u007f\u0000p}\u0014<s\u0013{";
      f5744[23] = "\u001e\u0015Z[\fz\u0019V_\fg+w\u0011Y\u0003Wl\u0012I_\r\u0005\u0007I\u0014\u0006W\fb\u0011\u0012\b\u0005g";
      f5744[24] = "Gca6\u0007_\u0006e\u007f1jW\u0016&G+\u0017C\u0016\u000b\u0002p\bQ\t%\u007fs\u0010T@Z";
      f5744[25] = "\u0017\u0014BB\u0017y\u0016C\u0006G.gASY[BU\u0010\u0012\u0001\u0002.2R_ICSe^@I<";
      f5744[26] = "\u0002p\u00198!%\\~X[ƄW\u001fzG)*.\u0007iO";
      f5744[27] = "+X\u0014\u0017\u001bV*\u000fP\u0012\"H}\u001f\u000f\u000eNz,^WS\"\u001dn\u0013\u001f\u0016_Jb\f\u001fi";
      f5744[28] = "H/*\u001e\u0006\u001fIxn\u001b?\u0001\u001eh1\u0007S3O(aQ?T\rd!\u001fB\u0003\u0001{!`";
      f5744[29] = "\u001a\u0004#Z.LY\u001f0_Fҫ$B;\u000bzL\u001aG$R }\u001a\ru\bwC\u001f\u0012,RFB\\\u00022\u000e~\u001d\u0019B14";
      f5744[30] = "~:kjz8*p2e\u001ei:1ubx~\u001b*jb[c#/nt\u001ex*$}tg`9,\u000f";
   }
}
