package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.hud.HudElement$Alignment;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement$ColorMode;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;
import org.rusherhack.client.api.render.RenderContext;

public class PotionEffectsEntry extends ListHudElement$ListItem {
   public MatrixStack f5544;
   public StatusEffectInstance f5545;
   public RegistryEntry<StatusEffect> f5547;
   public static long f5548 = Class066.m4320(-7158138467220745956L, 7145399150946180171L, MethodHandles.lookup().lookupClass()).m4325(176241972800359L);
   public static long f5549;
   public static Object[] f5550 = new Object[92];
   public static String[] f5551 = new String[92];

   public PotionEffectsEntry(PotionEffects var1, ListHudElement var2, StatusEffectInstance var3) {
    }

   @Override
   public void render(RenderContext var1, int var2) {
        
    }

   @Override
   public boolean shouldRemove() {
      if (Globals.mc.player != null && Globals.mc.player.hasStatusEffect(this.f5547)) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   @Override
   public Text getText() {
        return null;
    }

   @Override
   public double getWidth() {
        return 0.0;
    }

   static {
   }
   public static void m194() {
      f5550[0] = "@Ih\u0013c1@I\u007fOo>Z\u0002\u007fQo+]s-\u000f7k";
      f5550[1] = "\f;0oP\u0019\f;'3\\\u0016\u0016p'-\\\u0003\u0011\u0001ry\u0005@";
      f5550[2] = "v\u001a\t\u000b0ej\u0000\u000bW*qz\u0003@ʄ";
      f5550[3] = "\u001a%{\fn\u001d\u001a%lPb\u0012\u0000nlNb\u0007\u0007\u001f;\u0017;C";
      f5550[4] = "\u0018t)o\u0010\u0014\u0004n+3\n\u0000\u0014m`ɇ";
      f5550[5] = int.class;
      f5551[5] = "java/lang/Integer";
      f5550[6] = "\u001e796p\u001e\u0002-;jj\n\u0012.p{n\u0002\u0014+*6c\u001b\u0018k8}c\u001f\u00047;6j\u001e\u0015k\u0016mf.\u001d 3}l\u001f";
      f5550[7] = "jBC8_TvXAdE@f[\nuAH`^P8LQl\u001eBsLUpBA8ETa\u001elcIdiUIsCU!qH\u007fJOhUJb";
      f5550[8] = "f\u0012Xe\u0000\nz\bZ9\u001a\u001ej\u000b\u0011ȿ";
      f5550[9] = boolean.class;
      f5551[9] = "java/lang/Boolean";
      f5550[10] = "\u007f6,q>4c,.-$ s/e< (u*?q-1yj9:\"%u6e9#/dj\u0002\u0019#/d\u0016.1($b!9";
      f5550[11] = "aIVoW aIA3[/{\u0002A-[:|s\u0017r\u000eq";
      f5550[12] = double.class;
      f5551[12] = "java/lang/Double";
      f5550[13] = "3bO\u0012\b\r/xMN\u0012\u0019?{\u0006չ";
      f5550[14] = "\u000ep\u0019s;=\u0005\u007f\b<W>\u000b}\ns{";
      f5550[15] = "\u000bu\u0010<9V\u0017o\u0012`#B\u0007lYɹ";
      f5550[16] = "Ll]PrvLlJ\f~yV'J\u0012~lQV\u001bK).";
      f5550[17] = "*\u00191_[\n6\u00033\u0003A\u001e&\u0000x\u0012E\u0016 \u0005\"_H\u000f,E0\u0014H\u000b0\u00193_A\n!E\u001a\u0018Z\u000b\r\u001e24E\u001a(\u000e8\u0005\r3,\u0018\"8]\u001a(";
      f5550[18] = "ZT>Oo\u000bFN<\u0013u\u001fVMw\u0002q\u0017PH-O|\u000e\\\b?\u0004|\n@T<Ou\u000bQ\b\u0015\bn\n}S=$q\u001bXC7\u0015";
      f5550[19] = "Z\u0011eo\\2F\u000bg3F&V\b,\"B.P\rvoO7\\Mp$@#P\u0011,\u0013K)Q\u0006p\u0002A)A\u0006z5";
      f5550[20] = "\u0018Z\u00141 z\u0004@\u0016m:n\u0014C]|=}\u0012\u0006\u0000z&{\u001eF\u00141\u0001j\u0003\\\u001aq5";
      f5550[21] = "\u001aw\u0004-f\u0006\u0011x\u0015b\u0007\b\u001as\u00118";
      f5550[22] = "e\u0012w\u007fi\u0012y\bu#s\u0006i\u000b>2t\u0015oNc4o\u0013c\u000ew\u007fY\be\fu0u4o\u0014d8u\u0000";
      f5550[23] = "\u0013I^,Fu\u0013IIpJz\t\u0002InJo\u000es\u00187\u0013/";
      f5550[24] = "\\=:5~%@'8id1P$sx`9V!)5Í";
      f5550[25] = "rH\u0004V11yG\u0015\u0019L)j@\u001cP";
      f5550[26] = "U*/z\u0015eU*8&\u0019jOa88\u0019\u007fH\u0010nfM<";
      f5550[27] = "]Z+z\nE]Z<&\u0006JG\u0011<8\u0006_@`ig_";
      f5550[28] = "sGUo`-sGB3l\"i\fB-l7n}\u0019x?u";
      f5550[29] = "r%y<xyn?{`bm~<0qfex9j<k|tyxwkxh%{<byyyR{yxU\"zWfip2pf.Or;q`Gcy2";
      f5550[30] = "T:u0_pT:blS\u007fNqbrSjI\u00002/\u0002";
      f5550[31] = "\\*v/sp\\*as\u007f\u007fFaam\u007fjA\u001033'(";
      f5550[32] = "<K\u0003/sR Q\u0001siF0RJbnU6\u0017\u0017duS:W\u0003/DI&T7duS:W\u0003";
      f5550[33] = "8\r\u007fa\u000f\u0002$\u0017}=\u0015\u00164\u00146,\u0011\u001e2\u0011la\u001c\u0007>Qk*\t\u0003>\u0011\u007fa>\u0018;\u0010j\u001c\u0018\u0003#\u0016v(";
      f5550[34] = "avl/_\u001bav{sS\u0014{={mS\u0001|L-3\u0006F";
      f5550[35] = float.class;
      f5551[35] = "java/lang/Float";
      f5550[36] = "\u007f\u0000nq)\u0006\u007f\u0000y-%\teKy3%\u001cb:+m}]";
      f5550[37] = "J\u0015M4>\u000bV\u000fOh$\u001fF\f\u0004y \u0017@\t^4-\u000eLImv#\u001cD\u000bY";
      f5550[38] = "c+69+\u000f\u007f14e1\u001bo2\u007ft6\biw2x4\u0017m759<\u0002o<!c0\u0015b*\u007fS0\t|8%t1?t:4g-\u0013c7";
      f5550[39] = "9\u0000\t\u0017\fT9\u0000\u001eK\u0000[#K\u001eU\u0000N$:J\rW";
      f5550[40] = "\u0000\u00169i;uQCx'\u000bϾ1\u0016.j3aH\t{j7";
      f5550[41] = "\\MC+S\u0006\rP\u0007\"<\u000f\rVp&]\u000f\u0006OT$@`]EF=^\u001b\u0011\u001a[$<";
      f5550[42] = "\u0004_4\u0006s\u007fQYu\u000f\u0010kA_39l}ZP#b/w]Y,\u0010zd]LLR\u007f<^\u0007r\u0019,uD6|\r+b\n\b7^bx;\nv\u0006,iQ\buX{\u0007\u000bYw\u0007!9@\n>\u001d\u0010";
      f5550[43] = "\u00156\u001dSoB\u0002tO\u0015\u0016\u0017\u0002wLNz%Q3\u0011\u0018\u0016K\u0003u\u0015Jv\u000e\u0006nN)(\u0013\u000fdO@u\fWn,";
      f5550[44] = " TwqU#eQl*6(~]q\u001f\r\u007f(8grVswI8pJ2\u0019";
      f5550[45] = "\\\u0004\u0016sn\u0013\t[\u001cv\u00167e[\b6(C\u001a\n]wf";
      f5550[46] = "oqB?k\u0007ajHb\u0005\u0001cqCgi331\u001c94dl}[\u007f:[3lG;\u0005";
      f5550[47] = "%z\"*\u0012[*r2?bZ#j\u00048\u0018X(j\\=^\u000euhek\fW*\u0016";
      f5550[48] = "X%-i52B -n_;]wx?\bl\u0002*#S>)]%r002Wx";
      f5550[49] = "A\u001bo5!?N\u0013\u007f Q>G\u000bZ)56Pw-t5mD\u001d/wk:*K+*m?@I(t:Q";
      f5550[50] = "Q#m\u0015_\u001cG{'Wd\u0016Ww{\u00023D\u000f* Rd\u0012O\"%_\u001f\u0017Zhg";
      f5550[51] = "<=WL\u0017}&|F\u001d*c7~fKNq7Xwh*0`f\u0004L@2c8S\"";
      f5550[52] = "/NlWbe~\u001d7=dv2\u001f7QV&sNj=?z.\u00103Tbev\u001aP";
      f5550[53] = "p\u0017BlTZ/\u0006^(k\u0000\u007f\u001bZt\u00072/[\u0005/[eu\u001e\u0004r\u0010_k\fEqk";
      f5550[54] = "%oe}g\u0012i0xd\u00055_XMFH'D\u0000'mz\u0016z{k2g\u000f";
      f5550[55] = "\u0001H3r?\f\bD)(TZ\u000f\u0018.$\u0003\u000eRNtpT[S\fp#lR_\u0016*";
      f5550[56] = "\u000b\u0005yypWZV\"\u0013vD\u0016T\"\u007fD\u0014W\u000bt\u0013*E\u0014\r&so@\u000fVE";
      f5550[57] = "'w#w\u001ffav5i.g5M5-\u001f84*/(\u001f?";
      f5550[58] = ",^2`\n\u0016)\b$ceнE\tge\n\u0006*\u000e5c\u0017i\u007f\u0002n2\n\u0006xPh/e";
      f5550[59] = "'k\u000ey(Hv>O7\u0018ł\u0016k\u0019z \\otLz$";
      f5550[60] = "c`0\u001fFF6fq\u0016%Q1u\u0013\u0007__:f\u0017\u001aIB<\t(\u0001D\u0004e45\u0001\\\u0001\\9'@@\u000fbrt\tZ>";
      f5550[61] = "E\u001e\u001b\b\u0006\u001fGFFGj\u001eI\u0007A\u0011\u0006,\u001eD\u001fGT{KFXL\u0001CBJB\u0016j\u001aAA_\u001a\u000e\u0018\u0019\u001c\u0010v";
      f5550[62] = "Je_a]\u000fJ3\u0013p \u00123n\u0019~\u001a\u0007\u000es\u0019f\u001f>St\u0002%\u0019\u0003Nt\u001a  ";
      f5550[63] = "vjD\u001e\nq#5N\u001brĩO>\u0005\u001a\u001d~ 9W\u001c\u0000";
      f5550[64] = "Zh\u0005k{W\u000f<\u0004u\u000bՌaiEw7B\u000bkF)`,";
      f5550[65] = "\u000b\u0015|l^i\u0002\u0019f654\tTe1Y\u0006_\u0016<m\u0004QX\u0012aj[;Z\u0011?=5>YQ?=\r7UKeV";
      f5550[66] = "ZF\"\u0016\u00031\u000f\u0012#\bsȓaGb\nO$\u000bEaT\u0018J";
      f5550[67] = "\fs\u001e/~\t\u0015-\\)Nѱl-[2tBQ0[*q{\f7@iwF\u00117XlN";
      f5550[68] = "Gp48\u0000\u007fBe~z1a@ule]S\u001120=\n\u0004Ll6|]`N4k31";
      f5550[69] = "._3\u001cx^{\u00009\u0019\u0000W\u0017\u000f\u007fIoZfX?\u001a<>)\r*OdO~My\u001c\u0000";
      f5550[70] = "9{~[\"4l$t^ZϢ\u0000t?[07~%l\u0000";
      f5550[71] = ";t\u0005KQ\u0005w+\u0018R3\"AC-\u007f~8ZV 4\u000e\u0011yd\u0018OBNd}";
      f5550[72] = "DTIB\bu\u0011\u000bCGpz\u0010Fe\u0013\u0000i}P@FJ$\u0006UU\f\b\u0015";
      f5550[73] = "VMkI\u00143\u0007\u0018*\u0007$ίgB#KN/\u0019\u0013p\u0010$-\u0002\u0019l\u001b@/ZD#w";
      f5550[74] = "\u0015\nJY xOSBWGH')a\"\u0006Ov\fM\u0005yc\nV\u0014\rw";
      f5550[75] = "-\u0004\u001bkm=#\f\u0006:\n/&\u001a\u0011\u00070fy\u000e\u0013h74\u007f\u0013|";
      f5550[76] = "\u0007\"4T\u001f\\^e1VzE\u000fg=^\u0016w_&`\u0007z\u001cX\u007faW\u0010\u001e[!69";
      f5550[77] = "''nmXN60e6;A'2I?_S'Nyl[\u001e$?&nG_J";
      f5550[78] = "d\u0001ThQO5T\u0015&aըU^C/_\u0000*\u000f\u0016n\u001100\u0004\u00133\u0011\u0000j\u0003H0a";
      f5550[79] = "&sM\u001490j,P\r[&ba[\u000f Ku&R[5:*$N\u001a[uz|]\b2(e$Wk";
      f5550[80] = "|\u007ft\u0007_,~')H3-pf.\u001e_\u001f'%pH\bH}`/C\nu``7F3)x 0\u0015W+ }\u007fy";
      f5550[81] = "[.so-\"Yv. A#W7)v-\u0011\u0003sy,{FP2q+p=U';iA'_q7}%%\u0007,x\u0011";
      f5550[82] = ">6&\fg\tocgBWџ\u000f>`]9K~$!Lh";
      f5550[83] = "\u0005\r6SsJ\n\u0005&F\u0003X\t:4RbB\u0001a(Rb\u001eW\\5Rz\u001bn";
      f5550[84] = ")Tf\u001b\u0019r|\u000bl\u001eaȫ\u0010\u0003zYXqpF\u007fB\u0003";
      f5550[85] = "\u00117\u0018gOxKn\u0010i(i\u000b/\u0013=S\u0004\u001ch\u001aiFuCj\u0006((:\u00132\u0015:Ag\fj\u001fY";
      f5550[86] = "\tgP^]z\u0001d\u000bQ>x\u001cxVFRJL9\t\u001e>|@8\\B@-\u0013c6FG#\u0010\u007f\fXUb\u0013\u0004QX\u0000|\n>OJA\u007fqnO\u0019\u0004,\nkZSF\u001d";
      f5550[87] = "m\u007fV\u0012>\u000bej\u0004\tE\u0003cu\u000b\u0016,\u000fZ{\u000b\u0006(i:s\u000f\u0014&\u0000glW\u001eE";
      f5550[88] = "!\u000bN\u0019*(mTS\u0000H\u0019[8m!\r\u0004X)\u007f:Hns\u001bN\u00043\",\u0006W";
      f5550[89] = "U\\J\u0006o)OYJ\u0001\u0005 P\u000e\u001fPRw\u000eYG<\u007fs\u0000\u0019\u0002\fh1R_";
      f5550[90] = "\u0000][`9^\u000fUKuI_\u0006Mk|/L1\\Cw.J\u0006K%$ H\u000fR]q&\t\u00061";
      f5550[91] = "\u001f~B/\u0005\u0012N+\u0003a5ь.~U,\r\u0006Wa\u0000,\t";
   }
}
