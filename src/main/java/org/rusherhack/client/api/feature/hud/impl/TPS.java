package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.hud.TextHudElement;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

public class TPS extends TextHudElement {
   public BooleanSetting clamped;
   public EnumSetting<TPSMode> mode;
   public static long f1976 = Class066.m4320(-5952313233857445075L, 7154650403489242258L, MethodHandles.lookup().lookupClass()).m4325(265643222404834L);
   public static String[] f1977;
   public static String[] f1978;
   public static Object[] f1980 = new Object[37];
   public static String[] f1981 = new String[37];

   public TPS() {
      super("TPS");
      this.mode = new EnumSetting<>("Mode", TPSMode.f4195);
      this.clamped = new BooleanSetting("Clamped", false);
      Setting[] var10001 = new Setting[]{this.mode, null};
      boolean var10005 = true;
      var10001[1] = this.clamped;
      this.registerSettings(var10001);
   }

   @Override
   public String getText() {
        return null;
    }

   @Override
   public String getLabel() {
      return this.mode.getValue().equals(TPSMode.f4195) ? "TPS" : "Tick-Length";
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
      f1980[0] = "ynAF\t\u001cetC\u001a\u0013\buw\bȢ";
      f1980[1] = "\u001b\u001bl_\r\u0010\u0010\u0014}\u0010p\b\u0003\u0013tY";
      f1980[2] = "\u0019qR2!\u000e\u0005kPn;\u001a\u0015h\u001bո";
      f1980[3] = "J\u0002t\u0005\"FV\u0018vY8RF\u001b=ǋ";
      f1980[4] = "tr\u0019?\u0014}\u007f}\bpustv\f*";
      f1980[5] = boolean.class;
      f1981[5] = "java/lang/Boolean";
      f1980[6] = "kn\t\u0013<Qwt\u000bO&Egw@D";
      f1980[7] = "_4FF\u001a\u001aC.D\u001a\u0000\u000eS-\u000fȜ";
      f1980[8] = "\u0006\u0006\u0005\u0016w(\u001a\u001c\u0007Jm<\n\u001fL[j/\fZ\u0011]q)\u0000\u001a\u0005\u0016@3\u001c\u00191]q)\u0000\u001a\u0005";
      f1980[9] = "=\u001fl\u0002!8!\u0005n^;,1\u0006%O<?7CxI'9;\u0003l\u0002\u0000(&\u0019bB4";
      f1980[10] = "S1#,X|O+!pBh_(jȄ";
      f1980[11] = int.class;
      f1981[11] = "java/lang/Integer";
      f1980[12] = "W\b\\!#E\"(W.2\nC&\\%6P7";
      f1980[13] = "]]&Z\\;AG$\u0006F/QDoĐ";
      f1980[14] = float.class;
      f1981[14] = "java/lang/Float";
      f1980[15] = "\u0005r+%a\u0013\u000e}:j\r\u0010\u0000\u007f8%!";
      f1980[16] = "\u0011\u0003h\u0000$6\u001a\fyOL6\u0014\u0003j";
      f1980[17] = "$/:\u0004w\u0000858Xm\u0014(6sIj\u0007.s.Oq\u0001\"3:\u0004G\u001a$18Kk&.))Ck\u0012";
      f1980[18] = "!\u0002\u001fbfn=\u0018\u001d>|z-\u001bV/{i+^\u001e)uo;\u0002\u001db]]+\u0011\f9f~\r\u001f\u0016*}|;\u0002\u0019.x~";
      f1980[19] = "I7\u0012v=;`\u000e\u000el?gz\u001a\u001eotv}\t\u0018*)pf\u000f\u0014j=;A\u001e\tp3{u@";
      f1980[20] = void.class;
      f1981[20] = "java/lang/Void";
      f1980[21] = "\u0006\u0001oJ9o\u000e\u0012e8ΨQU\u0004m\u0006h7\u0016Rh]\u0003h\u0007\u0003?Se+Q\u0006d8";
      f1980[22] = "A5f\u0006\tZK2=UeGA<{U\"W(c`J\u0014@\u0013=bT\u00059A5f\u0006\tZK2=Ue";
      f1980[23] = "\u0005]_^>)RDQTPӏ<\u0005QQn}ZF\u0007T5\u0016\u0005WV\u0003;pF\u0001SXP";
      f1980[24] = "%~\rmg\u0015eaWc\u0007Ս\u001a%\u001aaf\u0013` \u001arx-";
      f1980[25] = ">_hF\u0012::\u0000:\u0004\".}\u00121\u001cYC?^%\u0013Nrd\u0012'\u0005\"xb\u001d)\u0001\u0019&`\u00038x";
      f1980[26] = "=dG?}\u0003~2Bd\u0016\u000bcuNhje=dG?}\u0003~2Bd\u0016UknQ\u007fm\u0017;wF\u0001/\u000eh1@glXmj+";
      f1980[27] = "'o\u001c-\u001e%zhO{%r{x-E~\u001d-b\u0003l\\&s`\u001d}%t&c\u0000r\u001ffjk\b\u001d";
      f1980[28] = "w\u0001I\u0005~\u0010s^\u001bGN$M\u000bI\u000bpY4\u000f\u0016Y2";
      f1980[29] = "y\n\u0019\u0014*-=Y@\u0019FxE^A\u001f; =\u0002\u0006\n \u0011xX\u0016\u000ewi$\u001f\u0003\u0015F";
      f1980[30] = "bwN/K[?p\u001dypȦS-Hr@XkpO!\u0016";
      f1980[31] = "!*_o\rR+-\u0004<a[/ [<\bW\u0016.[,\f1s!M \u0018\n-#S1a";
      f1980[32] = "S\u0014H7Nc\u0007IN\"%sRBB5YdEvN2YhYBXNIuZ\u001cAv\u0014g\u0004\u0015##\u001fn\u0006\u001c\\-Hw\u0000-";
      f1980[33] = "5%Q*GK?w\u0001(>U6-\u00107yE_ ]=ODe2\u00115G+5%Q*GK?w\u0001(>";
      f1980[34] = ")>\u000e!z-mmW,\u0016І\u0015iV#}*{*\u0016,p";
      f1980[35] = "+9\u001fMSjojF@?\u0016\u0017:\u000e@Z9l2\u0005@]";
      f1980[36] = "FsQs\u0001A\u0006{O1>G\u0015>ifZU\u0015B\f>CC\u0014sWrAUx";
   }
}
