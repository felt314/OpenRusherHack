package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.bind.IBindable;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.bind;
public class BindList extends ListHudElement {
   public BooleanSetting showhidden;
   public ColorSetting disabled;
   public ColorSetting enabled;
   public static long f124 = Class066.m4320(8498831270833091991L, -872143367254849307L, MethodHandles.lookup().lookupClass()).m4325(70269573895442L);
   public static String[] f125;
   public static String[] f126;
   public static Object[] f128 = new Object[69];
   public static String[] f129 = new String[69];

   public BindList() {
      super("BindList");
      this.enabled = (ColorSetting)null;
      this.disabled = (ColorSetting)null;
      boolean var10009 = true;
      this.showhidden = new BooleanSetting("ShowHidden", true);
      boolean var10005 = true;
      super.color.setHidden(true);
      boolean var10006 = true;
      super.colorMode.setHidden(true);
      Setting[] var10001 = new Setting[]{this.enabled, null, null};
      var10005 = true;
      var10001[1] = this.disabled;
      var10001[2] = this.showhidden;
      this.registerSettings(var10001);
   }

   public boolean m266(ToggleableModule var1) {
      if (var1.getCategory().equals(ModuleCategory.CLIENT)) {
         return false;
      } else if (var1.isHidden() && !(Boolean)this.showhidden.getValue()) {
         return false;
      } else {
         IKey var5;
         if ((var5 = (IKey)Class170.f3364.m7119().getBindRegistry().get(var1)) != null && !(var5 instanceof NullKey)) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void tick() {
        
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
      f128[0] = "\u000e_umMW\u0012Ew1WC\u0002F< SK\u0004Cfm^R\b\u0003t&^V\u0014_wmRM\u0005X~&\u0011o\u000eIg/Za\u0000Yw$PP\u0018";
      f128[1] = "l.X_a\u0002p4Z\u0003{\u0016`7\u0011ɷ";
      f128[2] = int.class;
      f129[2] = "java/lang/Integer";
      f128[3] = "A0rM.3]*p\u0011>'M);Ĉ";
      f128[4] = "\u001c(7<\t|\u000025`\u0013h\u00101~X";
      f128[5] = "?4Q=\u0018X#.Sa\u0002L3-\u0018ɧ";
      f128[6] = "']s\u0012\"J,Rb]NI\"P`\u0012b";
      f128[7] = boolean.class;
      f129[7] = "java/lang/Boolean";
      f128[8] = "\buk}|r\u0014oi!ff\u0004l\"0au\u0002)n:`cIEe=jJ\u0006im4ku%f\u007f6";
      f128[9] = "49z.DG0.z?YGs+5(^[)$8uEL7(7/Y\u0000\u0012/>>IZo\u000261OM)\u00005+";
      f128[10] = "G\u0018#ju1[\u0002!6o%K\u0001j'h6MD7!s0A\u0004#jE+G\u0006!%i\u0017M\u001e0-i#";
      f128[11] = "G[.Yn:LT?\u0016\u000f4G_;L";
      f128[12] = "u\f|\u000bELi\u0016~W_Xy\u00155ύ";
      f128[13] = "+\u0007MEm%7\u001dO\u0019w1'\u001e\u0004\bs9!\u001b^E~ -[L\u000e~$1\u0007OEr? \u0000F\u000e1\u001d+\u0011_\u0007z";
      f128[14] = "\u0013L>\u0012aF\u000fV<N{R\u001fUw_|A\u0019\u0010*YgG\u0015P>\u0012@V\bJ0Rt";
      f128[15] = "\u0011!0x(k\u0015<0i5kV3\u007f~2w\f<r#)`\u00120}y5,77th%v+0j";
      f128[16] = "m\u0007n+aZi\u001an:|Z*\u0015!-{Fp\u001a,p`Qn\u0016#*|\u001dK\u0011*;lGM\u0007%,nGk\u0001";
      f128[17] = "\u001d\u000b\u001cs\u0015\u0004\u0003\u0003\u0006<r\u0005\u0012\u0018\u000bfT\u0003";
      f128[18] = "sw5t:xm\u007f/;Xdjb";
      f128[19] = "!US\u001a>0=OQF$$-L\u001aW ,+I@\u001a-5'\tRQ-1;UQ\u001a!**RXQb\u0011!@SX)$,KQy#!;KQ";
      f128[20] = "\u0006E\u001bE\u0007K\u001a_\u0019\u0019\u001d_\n\\Rɡ";
      f128[21] = "J34d\u000f.T;.+l:Pv\u0007kU)Y";
      f128[22] = "\u0006\u007f<6 \u0018\u001ae>j:\f\nfu{>\u0004\fc/63\u001d\u0000#=}3\u0019\u001c\u007f>6:\u0018\r#\u0017q!\u0019!x?]>\b\u0004h5l";
      f128[23] = "\u001bCvG\u001c\u001c\u0007Yt\u001b\u0006\b\u0017Z?\n\u0002\u0000\u0011_eG\u000f\u0019\u001d\u001fw\f\u000f\u001d\u0001CtG\u0006\u001c\u0010\u001f]\u0000\u001d\u001d<Du,\u0002\f\u0019T\u007f\u001dJ%\u001dBe \u001a\f\u0019";
      f128[24] = void.class;
      f129[24] = "java/lang/Void";
      f128[25] = "gcj\bOozv2*\u000ebbp";
      f128[26] = "-u\t\u00181z1o\u000bD+n!l@U/f'i\u001a\u0018\"\u007f+)\u001dS7{+i\t\u0018\u0000`.h\u001ce&{6n\u0000Q";
      f128[27] = "V\\\u007fu\u001f\u0003JF})\u0005\u0017ZE68\u0002\u0004\\\u0000k>\u0019\u0002P@\u007fu(\u0018LCK>\u0019\u0002P@\u007f";
      f128[28] = "_sw@\u001bHCiu\u001c\u0001\\Sj>\r\u0006OU/v\u000b\bIEsu@ {U`d\u001b\u001bXsn~\b\u0000ZEsq\f\u0005X";
      f128[29] = ")tQ |$\u0000MM:~x\u001aY]95i\u001dJ[|ho\u0006LW<|$!]J&rd\u0015\u0003";
      f128[30] = "pB\u0001\u0016H\u001alX\u0003JR\u000e|[Hɻ";
      f128[31] = "D}\u007fYH|Orn\u00165d\\ug_";
      f128[32] = "M+m&\b\bQ1oz\u0012\u001cA2$k\u0015\u000fGw\u007f|\u0013\u0011Qw\\m\b\u000eK6d";
      f128[33] = "\u000eR\u0000~bw\u0010Y\r\u0007N\u000e(e\"[\u0005-\u0013L\u001d`83\u0018A";
      f128[34] = "l2YGDItmPS-Ey<[@QC\u007fQKC\u0014Y>(_\u0012\\\u001f\u0005";
      f128[35] = "Ok%[_>Ng \u000bcfHe<aS>H,$\\Z~Jg@";
      f128[36] = "6\u0016p\u0003.|i\u0016!\u000f\u0016M\f5S&\u0016b8\u0016}Xh=8Gq";
      f128[37] = "&>eVB\u000b!8nR%\u0004!/\u0005\u0005\u001b\u0000t'8\f[\u0002?C9KN\u0002v%jHX\u0012M";
      f128[38] = "\n+u`\"|OntkNe_rok\tu6*lm! Pyo{1\u001b\n+u`\"|OntkN";
      f128[39] = "9 ew94p\"\u007fNԥ\u0005q/yp,984d4E";
      f128[40] = ",\u0011o\r*\u001ap@bY\u0016Ϙ\u0016Dk]-Zj\u0018:Py";
      f128[41] = "}#<JL]z|rP=ӃF}j\u001e\u0000\u0000\"~m\u001e^";
      f128[42] = "o{Z0788p\r9L3f.\u0001#\t?m'f85&br\f!-e{";
      f128[43] = "9\u007f\u0018N{\u0007ntOG\u0000\f0*C]\u0000\u00061~\u0019\u0018d\u00056~G";
      f128[44] = "*\b$\u0011c|.X5\u0014\u0013x.N\bK\u007fo.TH\u0016mh,\t.En~<2!\u0010\u007f83M%@n=C";
      f128[45] = "hX>\u0012\u0019Xo\u0007p\bhSS\\~\u0018\u0010Z=\u000ed\u001b\b:h\u0017`\u000e\bT:\rc\u0016h";
      f128[46] = "p'Gm07e5M\u007f_=p%bc.R-gL7;o$'N|_";
      f128[47] = "P?\u001b6`4W9\u00102\u0007(V'\u001c+jR\u000b|\u0016lco\u0002<\u0014'\u0007nE)\u0014na=F?\u0004U";
      f128[48] = "9;Un\u0005ln0\u0002g~e;fih\u001f3lk\u0012`\u0003p5\n\u0006}\u0018h&g\u0010?\u00140W";
      f128[49] = "\f=\u0000:\\L\u0005a]y=K\u0002k\r<A\\\u0015_\u0001;AP\tk\u0017G^[V`\fv\u0003\u0001\u0010il(GW\u000bu\u0001>\u0005[S\u0004";
      f128[50] = "\u0013\u0012\u0014S\u0000v\u0019SUTbҪwJV\u0012\u001b\"IO@\r\u0006\u001f\u0013VT\u0011_!\u0016@K\fb";
      f128[51] = "pKK\u0016*\u0012r\u000b\f_P\u000f LyL6\f\u0017]\\L+\u001c7A3\u0013=\u0003#R\f_\"]30";
      f128[52] = "s\ri'\u0005\t?\u001277g[+\u001cp8<[1`c*\u001fX$\r{u\u0016LM";
      f128[53] = "\u0002I\u000e\u0018~\u0001]I_\u0014F%/k`\u001b(\u0011\u0001\u001f\u001eD(@\r";
      f128[54] = "AU\tz)h\rJWjK8\u0012Dj$u:F\\W-58\r8Z*&n\u001b\u0005Sj$%\u007f";
      f128[55] = "\u0018LNd5kOG\u0019mNd\u001b\u00017`+a\u001b\u0007\t\r%v\u0016\u001e\u0015k\"p\u001d\u001ar";
      f128[56] = "\n6w{o\u0001Vgz/Sǩ0ig?/\u001cZ5}q-}";
      f128[57] = "L]n0S\u0003H\r\u007f5#\u0013H\u001b\\bG\u0001Hg25NEAZ;uL\u000e%";
      f128[58] = "&.\u001f\u0016$6r~Y\u0019\u0018#zn.\rd!xu\u001f\u0015\u0018+mv\u001c\u0003%5f{e";
      f128[59] = "B6T3\u001d\u001aEi\u001a)lюye\u00010\u000e@Cl\u000b8\txEw\u000f8W\u001e\u0016t\u0019(l";
      f128[60] = "xjL(zz~>Y#\u001dŃ\u0015;R=\u007f$/2X5x";
      f128[61] = "4y:czd3\u007f1g\u001dc#i iae%\u00040~x8c:1r}h_";
      f128[62] = "U=[\u001chg\u0010xZ\u0017\u0004j\u000egX\u0017mf7iX\u0007i\u0000U~W\u0015?f\u0006}A\u0005\u0004";
      f128[63] = ")^y\u0005(p.\u00017\u001fYƒ\u0012^-\u0000b\".\f1Q+";
      f128[64] = "RBOFA\u0013SNJ\u0016}MQGl\u0011\rQ8\u0000T\u0017\u0012\u0016^SW\u0001\u0002-";
      f128[65] = "N3\u0005\u0000t\u0011B\"\u0006]L\u0003+8FB5\u0012\u0015=P](/O.DAq\u0011J2[\\L";
      f128[66] = "\u000298[q,Vi~TM7HE#E!;U\u0005~W&9\bc-T0)3";
      f128[67] = "%|\u0016\u0011\u000bs\"#X\u000bzĴ\u001e\"@EG.z!GE\u0019";
      f128[68] = "5\u0001\u0001\u0018\u007fZ+\n\fau\u001e/\u0012\u0001\u001a\u0018Wl\u0016\\\u0005%^,\u0014\u0017a$\u00199\u0014^\u0007w\u001a/\u0004e";
   }
}
