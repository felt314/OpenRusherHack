package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.hud.HudElement$SnapPoint;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

public class FeatureList extends ListHudElement {
   public EnumSetting<FeatureListMetadata> metadata;
   public ColorSetting f8013;
   public EnumSetting<FeatureListCase> caseSetting;
   public static long f8015 = Class066.m4320(7159311614413383458L, 3075050524376535257L, MethodHandles.lookup().lookupClass()).m4325(25511583986918L);
   public static String[] f8016;
   public static String[] f8017;
   public static long[] f8019;
   public static Integer[] f8020;
   public static Map f8021;
   public static Object[] f8022 = new Object[70];
   public static String[] f8023 = new String[70];

   public boolean m15382(IModule var1) {
      ToggleableModule var4;
      if (var1 instanceof ToggleableModule && (var4 = (ToggleableModule)var1).getCategory() != ModuleCategory.CLIENT && var4.isToggled() && !var4.isHidden()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void tick() {
        
    }

   public FeatureList() {
      super("FeatureList");
      this.caseSetting = new EnumSetting<>("Case", FeatureListCase.f5918);
      this.metadata = new EnumSetting<>("Metadata", FeatureListMetadata.f7878);
      int var10007 = 255;
      int var10009 = 255;
      this.f8013 = new FeatureListColor(this, "MetadataColor", new Color(var10009, var10007, var10009)).setVisibility(() -> {
         if (!RusherHackAPI.getHudManager().isThemeColorSynced() && this.metadata.getValue() != FeatureListMetadata.f7879) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      }).setAlphaAllowed(false);
      this.setDescription("A list of enabled modules");
      this.setToggled(true);
      this.setSnapPoint(HudElement$SnapPoint.TOP_RIGHT);
      Setting[] var10001 = new Setting[]{this.caseSetting, null, null};
      boolean var10005 = true;
      var10001[1] = this.metadata;
      var10001[2] = this.f8013;
      this.registerSettings(var10001);
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
      f8022[0] = "\u0001\u0004\u001amv \u001d\u001e\u00181l4\r\u001dSӎ";
      f8022[1] = "F~1|\t}Zd3 \u0013iJgxȦ";
      f8022[2] = "w!\u001eK0 k;\u001c\u0017*4{8Wɣ";
      f8022[3] = int.class;
      f8023[3] = "java/lang/Integer";
      f8022[4] = "5UV\u0012;W)OTN!C9L\u001f_%K?IE\u0012(R3\tcI:J?Uy]*I\u001bwx";
      f8022[5] = "vW\u0011SaDjM\u0013\u000f{PzNX\u001e\u007fX|K\u0002SrAp\u000b\u0005\u0004`E|HX4[D}h\u0017\u0013rV|W";
      f8022[6] = "\u001b8\u0012gGS\u0007\"\u0010;]G\u0017![*ZT\u0011d\u0006,AR\u001d$\u0012gpH\u0001'&,AR\u001d$\u0012";
      f8022[7] = boolean.class;
      f8023[7] = "java/lang/Boolean";
      f8022[8] = "aO,\u0002\u0014&}U.^\u000e2mVeѕ";
      f8022[9] = "@L\u0011,Xo\\V\u0013pB{LUXaEhJ\u0010\u0005g^nFP\u0011,y\u007f[J\u001flM";
      f8022[10] = "<\u0002fC*)7\rw\fK'<\u0006sV";
      f8022[11] = "E`R\u000e@\u001d[hHA'\u001cJsE\u001b\u0001\u001a";
      f8022[12] = "D]w&_\rXGuzE\u0019HD>ţ";
      f8022[13] = "!\u0000IFw\u0018=\u001aK\u001am\f-\u0019\u0000х";
      f8022[14] = "\u0007z#\\S.\u0019r9\u001312\u001eo";
      f8022[15] = "P\u000fwP\u0003NN\u0007m\u001fKNT\ruXBU\u0014>sTIRY\u000fuT";
      f8022[16] = "?!|\u001d(\u000b#;~A2\u001f385^";
      f8022[17] = "O0X:&\u0010S*Zf<\u0004C)\u0011w8\fE,K:5\u0015IlYq5\u0011U0Z:9\nD7Sqz,m-[a8\u0000";
      f8022[18] = "%//M \u000b95-\u0011:\u001f)6f\u0000>\u0017/3<M3\u000e#s.\u00063\n?/-M:\u000b.s\u0004\n!\n\u0002(,&>\u001b'8&\u0017";
      f8022[19] = "umU6l7iwWjv#yt\u001c{r+\u007fqF6\u007f2s1T}\u007f6omW6v7~1~qm6RjV]r'wz\\l:\u000eslFQj'w";
      f8022[20] = void.class;
      f8023[20] = "java/lang/Void";
      f8022[21] = "\b\u0003dW<_\u0014\u0019f\u000b&K\u0004\u001a-ә";
      f8022[22] = "\"c>-$t)l/bYl:k&+";
      f8022[23] = "@H]gYz\\R_;CnLQ\u0014ρ";
      f8022[24] = "l\u00180HiDp\u00022\u0014sP`\u0001y\u0005tCfD\"\u0012r]pD\u001a\u0007oYV\u001e>\nh";
      f8022[25] = "w\u0005\u001e\u0001\u00066k\u001f\u001c]\u001c\"{\u001cWL\u0018*}\u0019\r\u0001\u00153qY\nJ\u00007q\u0019\u001e\u00017,t\u0018\u000b|\u00117l\u001e\u0017H";
      f8022[26] = "\u0012(6M\u0015}\u000e24\u0011\u000fi\u001e1\u007f\u0000\bz\u0018t7\u0006\u0006|\b(4M.N\u0018;%\u0016\u0015m>5?\u0005\u000eo\b(0\u0001\u000bm";
      f8022[27] = "\u0012?+`\nj;\u00067z\b6!\u0012'yC'&\u0001!<\u001e!=\u0007-|\nj\u001a\u00160f\u0004*.H";
      f8022[28] = "$1-$\rb8+/x\u0017v((di\u0013~.->$\u001eg\"m,o\u001ec>1/$\u0017b/m\u0002\u007f\u001bR'&'o\u0011co\u0010$k\u000fG$*$~";
      f8022[29] = "8~H)\tH&vRfAH<|J!HS|]Q'KX3qm=WM>v[:";
      f8022[30] = "4z\u0005lH((`\u00070R<8cL!V4>f\u0016l[-2&\u0004'[).z\u0007lR(?&*7^\u00187m\u000f'T)";
      f8022[31] = "}GH\b\u0003Qa]JT\u0019Eq^\u0001E\u001dMw[[\b\u0010T{\u001bIC\u0010PgGJ\b\u001cKv@CC_i}QZJ\u0014gsAJA\u001eVk";
      f8022[32] = ":\"_)\u0001x&8]u\u001bl6;\u0016d\u001fd0>L)\u0012}<~^b\u0012y \"])\u001eb1%Tb]Y:7_k\u0016l7<]J\u001ci <]";
      f8022[33] = "eL*\u001d\u001e0yV(A\u0004$iUcP\u0000,oP9\u001d\r5c\u0010+V\r1\u007fL(\u001d\u0001*nK!VB\beZ8_\t";
      f8022[34] = "Z=\u001axO\u0000[|\u001elp\r\b7\u001b\u001dOS\u001f}\u0002w\u001a\b\u0005=g";
      f8022[35] = "/Gj\u007f\t_'_$?oo\u000fy\u0016\t3$/Gj\u007f\t_'_$?";
      f8022[36] = "\u001fB\u0012H\rd\u0016VP_oǟrJW\f^i\n\u0015\u0014\t\u001e\u0006\u001cY\u0014\u0003\u0000~C\u001a\u0011Co";
      f8022[37] = "bY<*avs\u0019}NxG7\u0014z+ %c\u0013}/\u0011~3Rd\u007fs*4U`N";
      f8022[38] = ", \t_\u000e\\s*L@v_Ct\f\u000e\u0019B%+\u0006K\u0006";
      f8022[39] = "![i\u0010+J,U:\bR\u0006NIyVcE6\u0016:S#* Z:Y=R\u007f\u0019?\u0019R";
      f8022[40] = "~2\t\u0017mX4lY\u000f\u0015ԿN`\u000eS|L<,[P/%";
      f8022[41] = "4dk=zhir*'Eɏ\r!t6#whue=}\u0016";
      f8022[42] = "9f%~O+s8uf7Ϩ\t5*iL.t\u007ft9T";
      f8022[43] = "!Og\u00109,:\u001e-\u000b\u0000.?|q\u001ao+)L\u0016Ipt*Lg\t9*- ";
      f8022[44] = "';\\ZJl.{B]+p#oZCF\nq2G\u0007N`$i]G+6>1SQZvwoT=";
      f8022[45] = "\u001cuLqm3\u0014.O?T:\u001b{,,9cH(\\;>6F\u0017@?=)\u0017&C,l-w";
      f8022[46] = "\n\\i\u0014=6\u001b\u001c(p\u0089\u0007ZLnO1}\u0003\u0016?A";
      f8022[47] = ";99Z%#$b KWg7k!A+p _-F+|<k;:6l1j*F+c?n@V(t dqU;%$\u0004";
      f8022[48] = "\u0017Zf\u0000|a\nUs\u001d\fB2a^9MQ5e\t\u0001oq\u0016Iv\u001c`d\u000b";
      f8022[49] = "\u0001b$=t\u0000\u0010\"eYƭ1\r}~e>PRqca";
      f8022[50] = "\u001f`L\u001a+*\u0013\"H\u0011P!X\u0004C\u00175-h?G\u001d*\u001bR>H\u0017<@\u001f(\u0018\u0014<1_aF\u0013P";
      f8022[51] = "K=\b\u007f\bFCf\u000b11IM#-#TLM%\u0013NX\u0017A8\t(QW_?h";
      f8022[52] = "z xAtShi$^\u0013Nt,\u0018BzMA7\"Bo5{3,GcJf<9Z\u0013Yf99D\"Zuh=$";
      f8022[53] = "]\u0000j-\t\u0000OI62n\u001dS\f\u001d%\u0015\rD\u0011)4\u000f\u0001Xp?5PWQ\b`vU\u0017>\u001c.!\u0014\u0006\u000f\u001f=p\u0010f";
      f8022[54] = ".d4Y\u0005r<-hFbo hS[\r{)yc<^dvzcM\u001e-(}\u000fP\u001d}7t>S\u000e,3\u0014";
      f8022[55] = "vN\u0019zIk'\u0014\u001bzs5%Y.b\u0017'%%E3\t`-O\u0010h\u0013 H";
      f8022[56] = "d\u007frXIg(*q\u000b ƊU}|PGt3t<N@\u0015";
      f8022[57] = "C.Kmb{\u0019<\u000fe[/K){='-I2J%[$Yd\u00002 ,A*@T";
      f8022[58] = "\u0017\u000fuJ\u007f=\u0006O4.κ\fG\u001fr\u0011sv\u001eE#\u001f";
      f8022[59] = "oLYNN\"f\fGI/>k\u0018_WB\u0005h}QFN 9E[RH5\u0006AH\u0012A(w\u0001\u0001LFD";
      f8022[60] = "|Os\u0015$y(Na\u001eXҀ\u0016@,\u00122,fLo\u0019g";
      f8022[61] = "\u001c\u00140\u001f\u0011~C\u0018-\u001b+d\u0011\u0007\u001eGS\u007f\u001523GL`\u0011\u0017W\u001f[$\u0012\u0017&_\u0012z\u0015{7LL#F\u001ah@Q'|";
      f8022[62] = "\u001d$5@p-D.1\u001e\u0013\"J*\b]\u007f\bN0!O~7'jpOs6Mf2KxM";
      f8022[63] = "\u0001Ka.u\u0014\b\u000b\u007f)\u0014\u0013\u0014\u0017z h\u0015\u0012z?3i\u0017W\u0011>rm\u0003h";
      f8022[64] = "Oz(9\u0003!^:i]7\u0010H7{7M`Dtpbs,S1{1\u0002l\u001ao|]";
      f8022[65] = "}:+1/R\"665\u0015Hp)\u0012lnRw4(liB\u001d6)=sY\u007f->\u007fn3}:+1/R\"665\u0015";
      f8022[66] = "3\u0019lak\u00042XhuT\u000fe\u0018Wi$\u0013\f_a?:\u0003}\u001f(a=o";
      f8022[67] = "|XNI\\Ny\\\u0011H1\u001fBZL\fJ^?_HSK";
      f8022[68] = "9<})\u001b^c$9!\"\u0004'\rg|N\b:M:`\u0019\u000b0<z)G\f\\";
      f8022[69] = "BLr[\nfGH-Zgt|Np\u001e\u001cv\u0001KtA\u001d";
   }
}
