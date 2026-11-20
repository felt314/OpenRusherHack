package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.util.Pair;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.shape.VoxelShape;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.system.IChunkProcessor$Processee;
import org.rusherhack.client.api.utils.ChatUtils;

import org.rusherhack.client.api.feature.module.impl.render.Search;
public class Class522 implements IChunkProcessor$Processee {
   public static long f8428 = Class066.m4320(-4759540786724532488L, 2760145064634060547L, MethodHandles.lookup().lookupClass()).m4325(273197932789740L);
   public static String[] f8429;
   public static String[] f8430;
   public static Object[] f8432 = new Object[90];
   public static String[] f8433 = new String[90];

   @Override
   public boolean isActive() {
        return false;
    }

   public Class522() {
   }

   @Override
   public void process(ChunkPos var1, boolean var2) {
        
    }

   static {
    }
   public static String m117(byte[] var0) {
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
   public static void m122() {
      f8432[0] = "\u0006\u001ey9\t*\u001a\u0004{e\u0013>\n\u00070ҙ";
      f8432[1] = "90&\u0018]j901DQe#{1ZQp$\nc\u000f\u00020";
      f8432[2] = "iJ\u000eR\u001f4wB\u0014\u001dW4mH\fZ^/-{\nVU(`J\fV";
      f8432[3] = "P=Y\u0017\u0010vN5CXXvT?[\u001fQm\u0014\u001f@\u0018MvW9]";
      f8432[4] = void.class;
      f8433[4] = "java/lang/Void";
      f8432[5] = "\u0018t<MV\u000e\u0004n>\u0011L\u001a\u0014muĈ";
      f8432[6] = "Edz\u0003|\u000bEdm_p\u0004_/mAp\u0011X^=\u001b R";
      f8432[7] = "]~Dw9\u0001]~S+5\u000eG5S55\u001b@D\u0001`fZ";
      f8432[8] = ".0xSB3.0o\u000fN<4{o\u0011N)3\n>N\u001cb";
      f8432[9] = "\u007f$^8cY\u007f$IdoVeoIzoCb\u001e\u0018 ;";
      f8432[10] = "\u0004NpgD\u0018\u001aFj(\"\f\u001dGUc\u001e";
      f8432[11] = "\u0007#M-\u0002k\f,\\bce\u0007'X8";
      f8432[12] = boolean.class;
      f8433[12] = "java/lang/Boolean";
      f8432[13] = "PGue7\u0015L]w9-\u0001\\^<ӽ";
      f8432[14] = "T\u000bf!\u0012iH\u0011d}\b}X\u0012/ȉ";
      f8432[15] = int.class;
      f8433[15] = "java/lang/Integer";
      f8432[16] = "7q\u0016W9\u0004+k\u0014\u000b#\u0010;h_Һ";
      f8432[17] = "2\u0019\\J!;.\u0003^\u0016;/>\u0000\u0015Ȑ";
      f8432[18] = "\u001f\u0002\u00191]r\u001f\u0002\u000emQ}\u0005I\u000esQh\u00028_)\b+";
      f8432[19] = "~.~\u0013<5b4|O&!r77Ǣ";
      f8432[20] = "o\bl\"=Tq\u0000vm[@v\u0001W\"c";
      f8432[21] = "j\u000bN\u0013s\u0019v\u0011LOi\rf\u0012\u0007Ǔ";
      f8432[22] = "1\u0015 \u00047i-\u000f\"X-}=\fiI)u;\t3\u0004$l7I\u0000F*~?\u000b4";
      f8432[23] = "xw~\u001f\u000blxwiC\u0007cb<i]\u0007veM9\u0000V";
      f8432[24] = "\u001d\u0000wd\"D\u001d\u0000`8.K\u0007K`&.^\u0000:1x{\u0015";
      f8432[25] = "\u0002js2U,\teb}2.\u001cnb6\t";
      f8432[26] = "1SHB?\u00131S_\u001e3\u001c+\u0018_\u00003\t,i\n_j";
      f8432[27] = "@f3l\\_\\|10FKL\u007fz!AXJ:''Z^Fz3llE@x1#@yJ` +@M";
      f8432[28] = "oX\r\u0007vcdW\u001cH\u001a`jU\u001e\u00076";
      f8432[29] = "\u0012mr\n9l\u0012meV5c\b&eH5v\u000fW4\u0016`3";
      f8432[30] = "4\u001f[2\u007fM(\u0005YneY8\u0006\u0012\u007fbJ>COyyL2\u0003[2^]/\u0019Urj";
      f8432[31] = "tV\u001fr[.j^\u0005=\u0006/lR\b~[\bjE\fr\u0018";
      f8432[32] = "6Y5\u0004\b((Q/K@(2[7\fI3r~6\u000bE)5W-";
      f8432[33] = "L!\u0003j\u0017\u000fR)\u0019%J\u000eT%\u0014f\u00179I,\u0019nZ\u000eI2";
      f8432[34] = "rAn\u0010b_lIt_?^jEy\u001cbiwLt\u0014/^wRk";
      f8432[35] = "~0Of]\u0006u?^)0\u0002u#jb\u0002\u001fq?Zb";
      f8432[36] = "w\u0019p\u00054ci\u0011jJyys\u001bs\u0016hss\f('ux~\rt\u0016\u007fxi0g\u0017r[|\b";
      f8432[37] = "\b\u000e1f6*\u0003\u0001 )K2\u0010\u0006)`";
      f8432[38] = "@Q!/%J\\K#s?^LHhb;VJM2/6OF\r3u>S\\\r\u0005i6KzW/m$";
      f8432[39] = "om\u0006`3Aqe\u001c/{Ako\u0004hrZ+N\u0019BrZvy\u001ddo";
      f8432[40] = "\u00001K\u0012{<\u001c+INa(\f(\u0002ѕ";
      f8432[41] = "\u001c\u0002@p\u001d)\u001c\u0002W,\u0011&\u0006IW2\u00113\u00018\u0001lEp";
      f8432[42] = "q\u00151x\u0000\u0014m\u000f3$\u001a\u0000}\fx5\u001e\b{\t\"x\u0013\u0011wI03\u0013\u0015k\u00153x\u001f\u000ez\u0012:3\\5q\u00001:\u0017\u0000|\u000b3\u001b\u001d\u0005k\u000b3";
      f8432[43] = "[eLJ\u00109\\$\rTm;W*_2\u0007z\t9\nS\u00011Ye2";
      f8432[44] = "\u000e\u001f\tv4\u000eUK\u000ezQW]I4,,\u0003IHFz7\u0002V%\u0004an_XFW|4^1";
      f8432[45] = "%5M\u0018{^\",R\u001b\u001fV&![OtAA#TR`X,zG[\u007f=~8\u0002ZrO(#\u0003E\u001f";
      f8432[46] = "7T\u0018\u0015\u0001\u000f`\u0017\u0019\u0015g\u000b7\u000e\u0011\b\u0001\u0006P\b\u000b\n\u0016\u000bm\fM\u000f\u0007i6\u0004\u0007\u0016\u0002\u0004o\u0017\u000e\tg";
      f8432[47] = "W\u0014M`Z*VNU\u001eE|_\u0014~~CqUr\frB~\t\u0019O'Xo6KM#T}NNIaW\u0017\f\u0014Hz\u0003*\rN\u000eg>,ZN\u000fz_r\r\fL\u001e";
      f8432[48] = "=G\u0016sW;u\u0007\t~oԩ\fQA-\u000eqmW\n}RI";
      f8432[49] = "\u00075k-s\u0002Xq4p\u001cΆ<p,qyW\u0006/h.$";
      f8432[50] = "hMC\u0016OJ \r\\\u001bwɡY[\u0014H\u0016\u00008]_\u0018J8";
      f8432[51] = "+N\t>}\np\u001a\u000e2\u0018Ah\u000eY2}:p\u0004Fa|Yw\u001dYb\u0018";
      f8432[52] = "j>L\u0005:;+k\f\tUԎ[3\u000b\u0013,wgjZ\u0007*";
      f8432[53] = "\u0015)&iWPT|fe8ɐ$>0uIPYzmvC";
      f8432[54] = "N\u001d\u0015io\u001a\u001cD\u0012w\t\u0016O]\f|e$\u0018\u001fV\"9s\u001fL\u0005 p\tK\u0018\u0005p\tNP\u0018Wtt\u0017P\u001d\f\u001b7\u0012BD\u0001b`\u001eKKl";
      f8432[55] = "\u000b ]ZE\u001dLp\u0013A(\u001b\f\u0012\u0005OG\u001e\u001a\"b\u0010ZE\u0016'\u0001CG\u001f\u0017N";
      f8432[56] = "$\u0015v\u0001\"Ge@6\rMɏ\u0015\u00144C/Ty\u0002c\u001a#";
      f8432[57] = "\u0016\u0006\u0011T\u0006 \b\r\b\u0002jɈzWPU\u000f\u007fJ\f\u0004R\u0003";
      f8432[58] = "S$\u0006\u007f\\%\u0012qFs3Ъbv\u000f;\b:\u001f/\u000f>SU\r6\u001foR*\u0019,Mr3e\u0010t\u001ckP6\r.\u001d\u0002";
      f8432[59] = "&\u0002\u001f5<7=\tD U,/\u0004\u00002\u0012<F\nG`4j'\f\f0hR&\u0002\u001f5<7=\tD U";
      f8432[60] = "}\u000f\u001eyt({\u0011\u000ex\u0016=k\u0014,~l3`\u0007w{(-{\u000bLh)-zh";
      f8432[61] = "\u000f1G!Y~_yZ<2j\u0000-B=e=_p\u0019QSm[/Tl\t~\u001cy";
      f8432[62] = "\u0018DQh\nQG\u0000\u000e5eϿ#[\u000eu\u001b\u000f\u001eZTme";
      f8432[63] = "Wo\\\b)g\u00175\u0018GXƎ,+\u001b\u0007%5\u00178\u001a\u0007$VUlZ\u0005;mFmZ\u0004X";
      f8432[64] = "JD_<\rjM\u0005\u001e\"pr\\4D<\fb'IS{\u0011zD\u001aN!\u0010\u0013";
      f8432[65] = "X#>\u0015/\u0014Yu8FC\u001bQn\u0001\u0016'\tQ\u0012`\u0002~\fQ`6\u0019\u007f\u0013<";
      f8432[66] = "09\u001b\f\u0017(td\u0018\u0006g-5(zB\u001ah09\b\u0014\u0001i/TE\u0000Z-%&\u0013\u001b[2Hk\u0007@\u001f8:=\u001cA\u0000U";
      f8432[67] = "Tfc\u00100+\u0006?d\u000eV'U&z\u0005:\u0015\u0002d ZjBW'x\u000f7=C=*\u0012V";
      f8432[68] = "\u001ctP\\\t\u0006O*UJxZMmZP\u0014h\u0019.\u0005\bF?\u001d|S\f\u0001EI(S\\x\u0002R(\u0001X\u0005[R-Z7F^@tWN\u0011RI{:";
      f8432[69] = "'9\u001dW!cfl][NƲ\u00164ZA7/*m\u000bU1";
      f8432[70] = "63GKAY1*XH%_;;5\u0014B]->OJ\\^(CQ\u0001W\u00006 V\u0018H\u0003R";
      f8432[71] = "}lS^cl<9\u0013R\fƈL3Z\u001cmu/`GFl";
      f8432[72] = "Vn,jyD\u0017;lf\u0016Ҽg08lk[\u0017qm,g";
      f8432[73] = "6e\u001d7&7$4G9H5\\n\u0018$qc6dU*y\\78Zbw6=uTjH";
      f8432[74] = "\rRV\f\"\u001dL\u0007\u0016\u0000Mע<_\u0011\u001a4Q\u0000\u0006@\u000e2";
      f8432[75] = "/%RAc8np\u0012M\fѓ\u001e(\u0015Wut\"qDCs";
      f8432[76] = "VK~%K<EJ~$(yF\u0011|5oi/J|ePj]\u001cgdO\u0007VK~%K<EJ~$(";
      f8432[77] = "2Nz\u0000\u0018/,EcVtк^M<B\fh'J}\u0003\u0012";
      f8432[78] = "\u0015H\u0005\u0015&!\u000fP\u0003\u0012Fp\u0010R\u0006\u0007/|)\\\u0006\u0017+\u001aGG]\u000b/y\u0014Z\u0007\nF";
      f8432[79] = "\u0015Q6!.RQ\f5+^U\u0000Y0.3/RAj(3]\u0004Zk7^\u0010\u0010\u0001/=,F\u000b\u00000P";
      f8432[80] = "&e!D7Epd<\u0017T\\#U=^5I#/m\u0016(T";
      f8432[81] = "H2q\u0011g!K*6\u0010\u001b(J8,\u0011Lw\u001aew}t;I8)\u0002`!\u001b%";
      f8432[82] = "|a?R#\u0015j6f^@ū\u00127}R-\u0018m#g\u00000y\"*?Q)\u001aq7eP@";
      f8432[83] = ";nW\\\u0010\t%.\bL.N8~^N.O|`EQ\u0015\\}`D2\u0015Z~%\\SK\r<f8";
      f8432[84] = ">F\u0001w^\u0006(\u0011X{=ϿP\u0010CwP\u000b/\u0004Y%Mj:E\u0001t\u0005\u000b<\u000eQ(=";
      f8432[85] = "nLz!i\u001b/\u0019:-\u0006՟_A=7\u007fWc\u0018l#y";
      f8432[86] = "F\u0002[\u0011\rpR\u0018\t\fljD\u0003Y\u001b\u0000X\u0018B\u0000LltN\u0016B\u001e\u0016rP\u0006C|";
      f8432[87] = ")sT\u007f2\u001f{*SaT\u0013(3Mj8!\u007fq\u00177kvy*Gf%O*tBpT";
      f8432[88] = ".@7AP>)\u0001v_-)$\u0007\u0004PF'C\u0007r\u0005P=1\u0004#[LGx\u0011u\u0003I&&F7@-";
      f8432[89] = "VRE.\b\u001fQ\u0013\u00040u\u001eF\u0013;i\b[C\u0002I?\u0013Z\\o\u0004+H\u001eV\u001dR0I\u0001;PFk\r\u000bI\u0006]j\u0012f";
   }
}
