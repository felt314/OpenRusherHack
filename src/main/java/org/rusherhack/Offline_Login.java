package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.Class031;
import org.rusherhack.client.api.feature.window.PopupWindow;
import org.rusherhack.client.api.ui.window.content.ComboContent;
import org.rusherhack.client.api.ui.window.content.ComboContent$AnchorSide;
import org.rusherhack.client.api.ui.window.content.component.ButtonComponent;
import org.rusherhack.client.api.ui.window.content.component.TextComponent;
import org.rusherhack.client.api.ui.window.content.component.TextFieldComponent;

public class Offline_Login extends PopupWindow {
   public static long f5328 = Class066.m4320(8738923231613889842L, 2700794128957117440L, MethodHandles.lookup().lookupClass()).m4325(115013794556412L);
   public static String[] f5329;
   public static String[] f5330;
   public static long f5332;
   public static Object[] f5333 = new Object[41];
   public static String[] f5334 = new String[41];

   public Offline_Login(Alt_Manager var1) {
      super("Offline Login", var1, 150.0, 50.0);
      super.view.setContentPadding(10.0);
      TextComponent var7 = new TextComponent(this, "Username: ");
      TextFieldComponent var4;
      (var4 = new TextFieldComponent(this, 100.0)).setCharacterFilter(var0 -> {
         if (var0 != (int)f5332) {
            boolean var3 = true;
            return true;
         } else {
            boolean var10002 = true;
            return false;
         }
      });
      ComboContent var6 = (ComboContent)null;
      var6.addContent(var7, ComboContent$AnchorSide.LEFT);
      var6.addContent(var4, ComboContent$AnchorSide.RIGHT);
      ButtonComponent var10001 = new ButtonComponent(this, "Login", () -> {
         String var5;
         if (!(var5 = var4.getValue()).isEmpty()) {
            Class170.f3364.m7111().m2745(new Class031(var5, ""));
            this.onClose();
         }
      });
      this.addContent(var6);
      this.addContent(var10001);
   }

   static {
    }
   public static String m1491(byte[] var0) {
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
      f5333[0] = "*\feg\u0014\u00076\u0016g;\u000e\u0013&\u0015,Ģ";
      f5333[1] = "[\u0004r\u001eA)P\u000bcQ<1C\fj\u0018";
      f5333[2] = boolean.class;
      f5334[2] = "java/lang/Boolean";
      f5333[3] = "P`\u001bg=CLz\u0019;'W\\yR*#_Z|\bg\u008e";
      f5333[4] = "V%\u000eV\u0016)J?\f\n\f=Z<G˶";
      f5333[5] = "WI\u0016:\u0015rKS\u0014f\u000ff[P_ɠ";
      f5333[6] = "9dd/.\u0002%~fs4\u00165}-b0\u001e3xw/=\u0007?8vhr\u0000?xgn+Y5ymu9\u0019\"8`n1\u00079xfo(Y\u0002s{u\u001a\u001e3zgB3\u001a&ymd2\u0003";
      f5333[7] = "kA\u0002\u0012\u0012sw[\u0000N\bggXK_\foa]\u0011\u0012\u0001vm\u001d\u0003Y\u0001rqA\u0000\u0012\u0017ojW\nKNVkC\u0010L7ojW\nK";
      f5333[8] = void.class;
      f5334[8] = "java/lang/Void";
      f5333[9] = "QU\u001b`$%MO\u0019<>1]LR-:9[I\b`ɾ";
      f5333[10] = "&xy]f}:b{\u0001|i*a0ɵ";
      f5333[11] = int.class;
      f5334[11] = "java/lang/Integer";
      f5333[12] = ":\u001b;/=x1\u0014*`P|1\b,-gq\"";
      f5333[13] = char.class;
      f5334[13] = "java/lang/Character";
      f5333[14] = "s)r:\u0006Wo3pf\u001cC\u007f0;w\u0018Ky5a:\u0015Ruu`}ZUu5q{\u0003\f\u007f4{`\u0011LhuV{\u0019@s\u0018zz\u0000Gr/1U\u001aAt4gG\u001dFy";
      f5333[15] = "#=A5Ia?'CiSu/$\bxW})!R5Zd%aSr\u0015c%!BtL::&Cl\u0015G%\"Vw^B%*Q";
      f5333[16] = "h\t\u001b\b}bv\u0001\u0001G5bl\u000b\u0019\u0000<y,8\u001f\f7~a\t\u0019\f";
      f5333[17] = ".\u001a\\\u0017>\u000e2\u0000^K$\u001a\"\u0003\u0015Ì";
      f5333[18] = "[X\u0012|ZKGB\u0010 @_WA[1DWQD\u0001|IN]\u0004\u0000;\u0006I]D\u0011=_\u0010WE\u001b&MF@\u00046=FJQR\u0001\u0013KJ]E\u001b";
      f5333[19] = "\u0000W8k\u000fO\u001cM:7\u0015[\fNq&\u0011S\nK+k\u001cJ\u0006\u000b*,SM\u0006K;*\n\u0014\fJ11\u0018T\u001b\u000b\b,\u0013^\u0000R\u001c*\u0013N\nK+";
      f5333[20] = "O\u0013aZ`TS\tc\u0006z@C\n(\u0017~HE\u000frZsQIOs\u001d<VI\u000fb\u001be\u000fC\u000eh\u0000wOTOE\u001b\u007fCO\"i\u001afDN\u0015";
      f5333[21] = double.class;
      f5334[21] = "java/lang/Double";
      f5333[22] = "]\u0004?E_\u0010V\u000b.\n>\u001e]\u0000*P";
      f5333[23] = "Yg9m^\u0007\u000b9gda,}\u0016X\u0002\bW\r7;mZ\tS>";
      f5333[24] = "7$`k\b^nu10jCk(tU\u0003R{/tn\u0018L0x";
      f5333[25] = "\u0014\u0005do\u0018\u0007\u0018\fz2d\u0005E\u0002W5\r\u0004A\u0015`8\u001e0I\u001a`8\u001e~B\u0013e9\u001c\u000e\u0010\u001bp.d@\u0015Nc1\u0015\u0018\u0011\f}U";
      f5333[26] = "}\u001fRNu--RM\rHԯ\u0017V\f\u0012,%&\u0010HI3D.RW\u0010)uh\u0016\f\u000fH";
      f5333[27] = "Ar\u0018C\u0016\u001c\u001fjTGoԆ~'W\u0016WX\u0010h]U\u000bf";
      f5333[28] = "Ig\u0001\u0010>c\u00124C ϧZIg\u0001\u0010>c\u00124C";
      f5333[29] = "\u001a\b]5\u001e\u0011\b\u001eO6`WqI\u001e/\u0004\u001a@\u000fZt\u001b{HME-\u0001J\u000e\t\u001e2`";
      f5333[30] = "O2\b\u0014D\u001c\tvS\u000b%L\rB\u000b\bY\\v6\f\u000fHF\u001am\u000fK^-";
      f5333[31] = "\nP\u001e3Z\u0000S\u0001Oh8\n[]>j^\u001fZW\t\rT\bTI\u0014j_\u0018KVu3\u0005SHU\u0004k\u0001\u0011V1";
      f5333[32] = "\u001bp\u001d1}|@#_\u0001əEE+]}a<\u001c1^}\u001a";
      f5333[33] = "YC^-X>W\f\u001e&h-YPk-\u000e8XZ\\J\u0004/VDA-\u000f?I[ #WyZ\u0003Oq\t'S<\u001ewX;QMFs\u001a%5";
      f5333[34] = "4r\fpX\u001cf,Ryg)\u001c\u0002qCg\u001abp^ \bH<.W";
      f5333[35] = "\f,\u001asNsHi@.!\"6jQ(\\&S,J*PK\r!@4L.K:B8!";
      f5333[36] = "}aF;p}f\u007f\rl\u000f=yr|6i:yhK\tf*xoQ>\u000f+nv^-qy}oYQ1{$qS i\u007ffo7";
      f5333[37] = "[ptM@$Wyj\u0010<2\nwR\u001eX \n\u000b5JZ9\u0006:s\u000e\u0001&g";
      f5333[38] = "@.c\tri\u000f(~^\u000f8\u0010,tgf7\r(\u000e\b`2A:qC>4\u001dE";
      f5333[39] = "\u001e\fN-\fVG]\u001fvnRE&At\u0015X#S\u0018#\u0011QR\u000b\u001ca\u000f5";
      f5333[40] = "\u0019K]o&C@Q^o]ӛ#\u0012\u001fq$E\u001fA[h\":\u001d\u0011Tl9KE\u0015\u0016r]";
   }
}
