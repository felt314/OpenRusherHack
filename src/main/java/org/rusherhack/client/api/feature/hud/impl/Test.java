package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.hud.TextHudElement;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;

public class Test extends TextHudElement {
   public BooleanSetting idkAnymore;
   public BooleanSetting test1;
   public NumberSetting<Double> scale;
   public StringSetting test;
   public BooleanSetting anotherOneLol;
   public BooleanSetting test2ButSubSetting;
   public EnumSetting<TestTestenum> testenum;
   public ColorSetting testColor;
   public static long f2729 = Class066.m4320(2469208096175344594L, -8485135057777710408L, MethodHandles.lookup().lookupClass()).m4325(189493760443183L);
   public static String[] f2730;
   public static String[] f2731;
   public static Object[] f2733 = new Object[41];
   public static String[] f2734 = new String[41];

   @Override
   public double getScale() {
      return super.getScale() * this.scale.getValue();
   }

   public Test() {
      super("Test");
      this.scale = new NumberSetting<>("Scale", 1.0, 0.5, 2.0);
      this.testenum = new EnumSetting<>("TestEnum", TestTestenum.f4395);
      boolean var10012 = true;
      this.test1 = new BooleanSetting("Test1", true);
      boolean var10011 = true;
      this.test2ButSubSetting = new BooleanSetting("Test2 but sub setting", true);
      boolean var10010 = true;
      this.anotherOneLol = new BooleanSetting("ANOTHER ONE LOL", true);
      boolean var10009 = true;
      this.idkAnymore = new BooleanSetting("idk anymore", true);
      this.testColor = (ColorSetting)null;
      this.test = new StringSetting("test string", "test");
      boolean var10003 = true;
      this.test2ButSubSetting.addSubSettings(this.anotherOneLol);
      BooleanSetting var10000 = this.test1;
      Setting[] var10001 = new Setting[]{this.test2ButSubSetting, null};
      boolean var10005 = true;
      var10001[1] = this.idkAnymore;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.scale, null, null, null, null};
      var10005 = true;
      var10001[1] = this.testenum;
      var10001[2] = this.test1;
      var10001[3] = this.testColor;
      var10001[4] = this.test;
      this.registerSettings(var10001);
      var10003 = true;
      this.setToggled(true);
   }

   @Override
   public String getText() {
      return "this is an epic test";
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
      f2733[0] = "u\u0014C}Lz~\u001bR2&yj\u0017Yy";
      f2733[1] = double.class;
      f2734[1] = "java/lang/Double";
      f2733[2] = "y\"=14\u0006e8?m.\u0012u;tĿ";
      f2733[3] = "tJ[EQ\u0018hPY\u0019K\fxS\u0012\bL\u001f~\u0016O\u000eW\u0019rV[Em\u0018vZY\u0019p\boLU\u0005D";
      f2733[4] = "X0\\8q\u001bD*^dk\u000fT)\u0015ul\u001cRlHsw\u001a^,\\8P\u000bC6Rxd";
      f2733[5] = "\u0004:w0;H\u000f5f\u007fZF\u0004>b%";
      f2733[6] = ")l(q105v*-+$%ua<,7#0<:71/p(q\u001014w!8\u0010 2j&1$";
      f2733[7] = "\u007f-^{z\"t\"O4\u0016!z M{:";
      f2733[8] = boolean.class;
      f2734[8] = "java/lang/Boolean";
      f2733[9] = "b<;,\u0006\u0012~&9p\u001c\u0006n%ra\u001b\u0015h`/g\u0000\u0013d ;,1\tx#\u000fg\u0000\u0013d ;";
      f2733[10] = "pMz\u0013b7Ytf\t`kC`v\n+zDspOv|_u|\u000fb7xda\u0015lwL:";
      f2733[11] = void.class;
      f2734[11] = "java/lang/Void";
      f2733[12] = "\u0002F\u001e+\u0013\u0014\u001e\\\u001cw\t\u0000\u000e_Wǻ";
      f2733[13] = "1~8rZn-d:.@z=gq?Gi;\",9\\o7b8rjt1`:=FH;x+5F|";
      f2733[14] = "3Xp2QA.M(\u0010\u0010L6K";
      f2733[15] = "I,\u0005,U\u0013U6\u0007pO\u0007E5LaH\u0014Cp\u0004gF\u0012S,\u0007,n C?\u0016wU\u0003e1\fdN\u0001S,\u0003`K\u0003";
      f2733[16] = "9[\u0019\u0013h\u001c\u0010b\u0005\tj@\nv\u0015\n!Q\re\u0013O|W\u0016c\u001f\u000fh\u001c1r\u0002\u0015f\\\u0005,";
      f2733[17] = "-\u0011WxlH1\u000bU$v\\!\b\u001eȕ";
      f2733[18] = "f\u0019\u00011=\u007fm\u0016\u0010~@g~\u0011\u00197";
      f2733[19] = "\n8Z~\u001bI\u0016\"X\"\u0001]\u0006!\u0013ɖ";
      f2733[20] = "7*V\u0006\ns+0TZ\u0010g;3\u001fK\u0014o=6E\u0006\u0019v1vBM\fr16V\u0006;i47C{\u001dr,1_O";
      f2733[21] = "~7uD=}b-w\u0018'ir.<\t#at+fD.xxkt\u000f.|d7wD'}ukZ\u001f+M} \u007f\u000f!|";
      f2733[22] = "d;[,D. 7\u0005NC2#>X#q<:)QN\u0016o'5B'T('4<";
      f2733[23] = "x\u001f|\u000f]4-\fmU!ɮA]|\u0002Al1\u0007r\u000f\u001f";
      f2733[24] = "/8\u0000\u0013\u007fxb`\u0002G\u001ft{<\u0010\u001bXd\u0012fP\n&wci\t\f`\n/8\u0000\u0013\u007fxb`\u0002G\u001f";
      f2733[25] = "i5jp4z<&{*HřPulq:69wbx-";
      f2733[26] = "c{$vEG%86-y\u00114,\u00047\u0013#5<#+\u001f\u0017#@5v\u001b\u0016f-\"4\u001f\u0001X\u007f!q\u0005\u0005(:d;Gx";
      f2733[27] = "TwB\u0000y>_gFI\u001a<d=R\u0012b0\t6B\u0016+";
      f2733[28] = "L\u0012\\\\B^\u0019\u0001M\u0006>Ȯu]S\u0007T\n\u000f\u0015HZ\u0006";
      f2733[29] = "6Swz\u00051xZ\"abBVa\r\u001cSr;N,$\u001d{nU";
      f2733[30] = "^QZWJC\u000bBK\r6Ćg\u001eU\f\\\u0017\u001dVNQ\u000e";
      f2733[31] = "/ok~\u0015!8r=:m?+og;\u0011(<[k<\u0011$ o}@\u0007y$n8-\u0010; y\u0006\u007f\u0013~:}v:V4x\u0000";
      f2733[32] = "q\u0015@\u007f_cd\u0000\u0005,-ү\u001a\u0013F{S#g\u001b\u00032\u0017\u001aq\u0000\u0006=\u0014gyEOy-";
      f2733[33] = "\u0016\u001aL!_#C\t]{#ɂ/^C&Nq\u0017\u000bM<N";
      f2733[34] = "t\fLS,X0\u0000\u001219J*\u001eFv)#wYRP9J5\u001eRQG\u0019!\u0004IZ<]-Z+";
      f2733[35] = "i\u0018L8J\u0005l\u0011\u000e?7΅\u0005\u001fMmIGx\u0017\b$\r~n\f\r+\u000e\u0003fIDo7";
      f2733[36] = "[m}:\\a\u000e~l` Էb\"raJ5\u0018ji<\u0018";
      f2733[37] = "qbXW\u007fb$qI\r\u0003\u0011Hq^Rr=0p\t\\n";
      f2733[38] = "\re@7\u0004k\u0019hZ15/\r}b<Z;\u0004lR[\u000bi\u001c8C*\u00040\u001a~>dKo\u001c|N!\u000e%^\u0001";
      f2733[39] = "\u0012(xO\u0018VTkj\u0014$\u0006Do]\u001a@\u0014D\u00138\u0003\\\u0014\u0016,8\u0010J\u0005)";
      f2733[40] = "u\u001dAZG5 \u000eP\u0000;σLRN\u0001Qa6\u001aU\\\u0003";
   }
}
