package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.hud.HudElement$SnapPoint;
import org.rusherhack.client.api.feature.hud.TextHudElement;
import org.rusherhack.core.setting.StringSetting;

public class Watermark extends TextHudElement {
   public StringSetting rusherhack;
   public static long f4046 = Class066.m4320(6261021598687222045L, -7212455217809351002L, MethodHandles.lookup().lookupClass()).m4325(57788651163000L);
   public static String[] f4047;
   public static String[] f4048;
   public static Object[] f4050 = new Object[25];
   public static String[] f4051 = new String[25];

   @Override
   public String getText() {
      return ((String)this.rusherhack.getValue()).replace("+", "") + " " + Class367.f6014;
   }

   public Watermark() {
      super("Watermark", false);
      this.rusherhack = new StringSetting("Text", "rusherhack");
      this.setToggled(true);
      this.setSnapPoint(HudElement$SnapPoint.TOP_LEFT);
      this.registerSettings(this.rusherhack);
   }

   static {
    }

   public static String m221(byte[] var0) {
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
   public static void m273() {
      f4050[0] = "\u0017d\u007f$p\u001c\u000b~}xj\b\u001b}6ǎ";
      f4050[1] = "\u0017U$\u0013t\u0016\u000bO&On\u0002\u001bLm^i\u0011\u001d\t0Xr\u0017\u0011I$\u0013U\u0017\nN-ZU\u0006\fS*Sa";
      f4050[2] = "*\u0017sx\"\u00136\rq$8\u0007&\u000e:5?\u0014 Kr31\u00120\u0017qx\u0019  \u0004`#\"\u0003\u0006\nz09\u00010\u0017u4<\u0003";
      f4050[3] = "pZ+NAlYc7TC0Cw'W\b!Dd!\u0012U'_b-RAlxs0HO,L-";
      f4050[4] = void.class;
      f4051[4] = "java/lang/Void";
      f4050[5] = "DD\f\u0011y\u0001X^\u000eMc\u0015H]E\\g\u001dNX\u001f\u0011j\u0004B\u0018\rZj\u0000^D\u000e\u0011h\u001bF[\nQoZJD\f\u0011B\u0000N[9Zm\u0011YS\u0005\\n";
      f4050[6] = "D\u001ewd8+O\u0011f+E3\\\u0016ob";
      f4050[7] = "\u0004Rs#\u007fX\u0018Hq\u007feL\bK:naD\u000eN`#l]\u0002\u000erhlY\u001eRq#eX\u000f\u000e\\xih\u0007EyhcY";
      f4050[8] = "49Nre\u0004(#L.\u007f\u00108 \u0007?{\u0018>%]rv\u00012eO9v\u0005.9Lr\u007f\u0004?ea)s47.D9y\u0005\u007f\u0018G=g!4\"G(";
      f4050[9] = boolean.class;
      f4051[9] = "java/lang/Boolean";
      f4050[10] = "_Q_D%\tCK]\u0018?\u001dSH\u0016\u009f";
      f4050[11] = "\u0012GaJ@M\u0019Hp\u0005-I\u0019TDN\u001fT\u001dHtN";
      f4050[12] = "\"MIX8B>WK\u0004\"V.T\u0000Ϯ";
      f4050[13] = " ,N\u000bb\u0000<6LWx\u0014,5\u0007F\u007f\u0007*pZ@d\u0001&0N\u000bC\u0010;*@Kw";
      f4050[14] = "#~ou]U(q~:<[#zz`";
      f4050[15] = "qr\u0016\u0002W\u0007ybJ2Լy.iKL_\u0013w<\u0006Y";
      f4050[16] = "`\u001a,\u001fSch\u0007:\u0011kt4\u0005*\n\u0017c#1&\r\u0017o?\u00050qQaa\u0015&\u0010\u00147$\u0003KK\u00140bZ{H\u0019s?j";
      f4050[17] = "I|r*\u007f\u001eHsx/GԐv~&\u007f?G\u0011xp%{{Jr(9{\u001cL$r}G";
      f4050[18] = "o\u0000rM=\u001ciV(\t\u0001\u0001>H(\\j\u0016S\u0000%\u0004z\t+Hr\fl{cY}Ns\u0003+\u000euX\u0001Gc\u000e4\tfA5Tp5";
      f4050[19] = "L\r(\u0012]<\u0010Qi\td)p\f)E\u001c9\u0017\n\u007f\u001fX\u0005L\u0000'\u0003XbJV}Gd";
      f4050[20] = "1\u0015!Km/=](\u0012Wȳ\u0001Qx\u0014/|fW.Nk";
      f4050[21] = "9\u0018;U\u0000S;G.\u0000~Ui^\u0005\b\u0017V\\E?\b\u0002.:\u001fa\t\u0000Q\u007fR,\u0005~\u0014{\u001ce^N\u0017v_8n";
      f4050[22] = "mwgl\u0019`o(r9gf=1^0\br4 nWY|! m=\u0015t6u\u0002m\u0018#k}2n\u0015`6M";
      f4050[23] = "\u001f;~\u000eYh\u0017?/\u00160|C-J\u001aTnCQ}J[r\u0014*$H^#.";
      f4050[24] = "\u000b+5\u00116\u007fNfx\u001dH\\rN]2\u0005Ni\u00164KwgKiq\u0006:k";
   }
}
