package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.core.command.processing.CommandProcessor;

public class Class237 extends Renderer271 {
   public ColorSetting f4217;
   public static long f4218 = Class066.m4320(-3542189345714941137L, 4519849161184172348L, MethodHandles.lookup().lookupClass()).m4325(102721704826345L);
   public static String f4219;
   public static Object[] f4220 = new Object[25];
   public static String[] f4221 = new String[25];

   @Override
   public String m4900() {
        return null;
    }

   @Override
   public boolean m4901() {
      return this.f4217.isThemeSync();
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.m5378(var1, var3) && var5 == 0) {
         ColorSetting var10 = this.f4217;
         boolean var10001;
         if (!this.f4217.isThemeSync()) {
            var10001 = true;
            boolean var10003 = true;
         } else {
            var10001 = false;
            boolean var11 = true;
         }

         var10.setThemeSync(var10001);
         boolean var10002 = true;
         return true;
      } else {
         return super.mouseClicked(var1, var3, var5);
      }
   }

   public Class237(PanelBase<?> var1, Renderer107 var2, ColorSetting var3) {
      super(var1, var2);
      this.f4217 = var3;
   }

   @Override
   public void m6448(double var1, double var3) {
      this.getPanel().getFontRenderer().drawString(this.m4900(), 2.0, 2.0, -1);
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
   public static void m1731() {
      f4220[0] = "|s\u0004`\r6`i\u0006<\u0017\"pjM-\u0013*vo\u0017`\u001e3z/\u0010+\u000b7zo\u0004`<,\u007fn\u0011\u001d\u001a7gh\r)";
      f4220[1] = boolean.class;
      f4221[1] = "java/lang/Boolean";
      f4220[2] = "<5\u0015\u0004Y7 /\u0017XC#0,\\Ǐ";
      f4220[3] = "\fF|\u001adQ\u0010\\~F~E\u0000_5Ȳ";
      f4220[4] = int.class;
      f4221[4] = "java/lang/Integer";
      f4220[5] = "\u000fn;2sx\u0013t9nil\u0003wrɨ";
      f4220[6] = "gD\\NHQ{^^\u0012REk]\u0015\u0092";
      f4220[7] = double.class;
      f4221[7] = "java/lang/Double";
      f4220[8] = "\u000ef\u001eY9-\u0012|\u001c\u0005#9\u0002\u007fW\u0014$*\u0004:\u001a\u0018&5\u0000z\u001dY;*\u000ew\u001c\u000481\u000fsW4$5\fu\u0017\u0013\u001b*\u000ew\u001c\u000487\u0013";
      f4220[9] = ".9OxgX%6^7\u001a@61W~";
      f4220[10] = "\u0005=\u0011J)!\u0019'\u0013\u001635\t$X\u00077=\u000f!\u0002J:$\u0003a\u0003\ru$\u000b!\u0013\bu\u0004\u000b!\u0013\b\u00195\u0019*";
      f4220[11] = "9g\u0018\":*%}\u001a~ >5~Qo.63{\u000b\")/?;\ri&;3gQj'1\";6J'1\"G\u001ab,:$p\r";
      f4220[12] = "%VT\u001aR\u001a9LVFH\u000e)O\u001dWL\u0006/JG\u001aA\u001f#\nF]\u000e\u001f+JVX\u000e?+JVXi\u001b/IqUS\n";
      f4220[13] = "\f\u00147\\#)\u0007\u001b&\u0013B'\f\u0010\"I";
      f4220[14] = "Z\u0011;\u0002\u0010\r[Xi^sƵfT5\u0005K\nZ\u0014d]\u0015f[X9\u0000\u001fZ\u001b\ta^s\u001d\u001d\u00104\u0004L\u0014\tS\u0004";
      f4220[15] = "x\rNeu\u001f,\tXx\r\u001a*\u001cyzk\t\u001d\rQq`\u000f*\u001a7\"|\u0019!\u000b\u0006rk\u000b\"`";
      f4220[16] = "\u001a:p\u001f7\u0004J-b\u001c\\Y_\"c\" OD-sybM\u001b'u\u0016=\tDr\u001cDm\b\u001d' \u0004<PCK!Ha\rIwa\u00199S%p,\u00013\u000f['\"Ha5\u0018z!A0\tX+y\u001f\\";
      f4220[17] = "\u000fLx$B\u000bY\bv +ȭ5H)`DNK\u001f')\u0016t";
      f4220[18] = "3w\r\u0004 s6d\\\u0013\u001cj\n%\u0000Rs|hc^\u0014 \u00036%\u0007\u0006cap{AU\u001c";
      f4220[19] = ".\r:jf{e\f#\u000f?oH\u0003)j3Oe\u0005/\u000f%omSx0,{.c";
      f4220[20] = "dVu\u001c>IaE$\u000b\u0002\u0382]\u0006<OnP2Yx\u0010;9";
      f4220[21] = "=>\n\u0003\u0001av?\u0013fBc{\f\u0014\u000b\\c\\!\u0012\r9u|)DZ\u0006|hjt\\Wpbh\u001b\u0017Vi\u0007";
      f4220[22] = "$.Y0(Mh9\u0004mQQ\u0019uFk=\u0014v*\u00024h}'3\u000098\u0012xw_lQ";
      f4220[23] = "t\u0011\u0017+j+\u007f\u001c\u001blP\")\u001f3\u007f6  cT{)5<\t\u0000\u007f?(D";
      f4220[24] = "YTyik8\\G(~Wт`\u0000&z2p\u000fK'c";
   }
}
