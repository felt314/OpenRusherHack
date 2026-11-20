package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.StringJoiner;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement$ColorMode;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;
import org.rusherhack.client.api.system.Colors$ColorMode;
import org.rusherhack.client.api.utils.EntityUtils;
import org.rusherhack.core.utils.MathUtils;

public class EntityListEntry extends ListHudElement$ListItem {
   public Entity f4989;
   public static long f4990 = Class066.m4320(238407598699133729L, -2723192801649453730L, MethodHandles.lookup().lookupClass()).m4325(33535202628882L);
   public static String[] f4991;
   public static String[] f4992;
   public static Object[] f4994 = new Object[83];
   public static String[] f4995 = new String[83];

   @Override
   public int getColor(int var1) {
        return 0;
    }

   @Override
   public Text getText() {
        return null;
    }

   @Override
   public boolean shouldRemove() {
        return false;
    }

   public EntityListEntry(EntityList var1, ListHudElement var2, Entity var3) {
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
   public static void m194() {
      f4994[0] = "!\f_u\u001c!=\u0016])\u00065-\u0015\u0016»";
      f4994[1] = "( K5\u0007\u0019( \\i\u000b\u00162k\\w\u000b\u00035\u001a\u000e)SG";
      f4994[2] = int.class;
      f4995[2] = "java/lang/Integer";
      f4994[3] = "t\u0006(<\u00116h\u001c*`\u000b\"x\u001faq\u000f*~\u001a;<\u00023rZ:f\n/hZ\n|\u0017*o\r\u001af\n/h";
      f4994[4] = "\u001dE\u0019\u000eP+\u0016J\bA-3\u0005M\u0001\b";
      f4994[5] = "Dpo\r\u001f;DpxQ\u00134^;xO\u0013!YJ)\u0016Ja";
      f4994[6] = ":\u0014\u000ehBl&\u000e\f4Xx6\rGɀ";
      f4994[7] = "\u001a*6;9\u0017\u000604g#\u0003\u00163\u007fv'\u000b\u00106%;\u008a";
      f4994[8] = "q=:2{sq=-nw|kv-pwil\u0007\u007f.\"";
      f4994[9] = "\u0006`UIX\u0006\u0018hO\u0006%\u0007\u001ehMO<\u001c\u0005oFZ";
      f4994[10] = "<\u0017zV/` \rx\n5t0\u000e3Ȩ";
      f4994[11] = "<?JoA\u0019 %H3[\r0&\u0003ί";
      f4994[12] = "d*\u0001 _|d*\u0016|Ss~a\u0016bSfy\u0010G;\u0004$";
      f4994[13] = "p\rn\u0003\u0016*p\ry_\u001a%jFyA\u001a0m7/\u001fNs";
      f4994[14] = "j \u0006\u00079\u001ev:\u0004[#\nf9OJ$\u0019`|\u0012L?\u001fl<\u0006\u0007\u0018\u000eq&\bG,";
      f4994[15] = "\u0004\u0016AY]\u0000\u000f\u0019P\u0016<\u000e\u0004\u0012TL";
      f4994[16] = "$g>+\u0017;8}<w\r/(~wf\n<.;*`\u0011:\"{>+'!$y<d\u000b\u001d.a-l\u000b)";
      f4994[17] = "\u000fy\u0014T=\u000f\u000fy\u0003\b1\u0000\u00152\u0003\u00161\u0015\u0012CQI`_";
      f4994[18] = float.class;
      f4995[18] = "java/lang/Float";
      f4994[19] = "\fq\fE)h\fq\u001b\u0019%g\u0016:\u001b\u0007%r\u0011KO_r";
      f4994[20] = "2\u0002\u0006>#s2\u0002\u0011b/|(I\u0011|/i/8D#z";
      f4994[21] = "Y\u007f9t\\0Ee;(F.UfpȮ";
      f4994[22] = "z\u001c4\u0011@wf\u00066MZcv\u0005}\\^kp\u0000'\u0011Sr|@ ZFv|\u00004\u0011qmy\u0001!lWva\u0007=X";
      f4994[23] = "e2\u0014\u0006gxe2\u0003Zkw\u007fy\u0003Dkbx\bV\u001c:";
      f4994[24] = "oW8y>{dX)6S\u007fdD\u001d}ab`X-}";
      f4994[25] = "pnUgnLltW;tX|w\u001c*sKz2P r]1^['xt~rS.yK]}A,";
      f4994[26] = "\u001d\u000b^q{q\u0003\u0003D>\u0000Q>.";
      f4994[27] = "C\u001d~'a?_\u0007|{{+O\u00047j|8IAl}z&_AThg\"y\u001bpe`";
      f4994[28] = double.class;
      f4995[28] = "java/lang/Double";
      f4994[29] = "L5`|\u001d+G:q3q(I8s|]";
      f4994[30] = boolean.class;
      f4995[30] = "java/lang/Boolean";
      f4994[31] = "Uf\u0017y\n\u001dI|\u0015%\u0010\tY\u007f^4\u0014\u0001_z\u0004y\u0019\u0018S:7;\u0017\n[x\u0003";
      f4994[32] = " &\u0011kH\u000e &\u00067D\u0001:m\u0006)D\u0014=\u001cVt\u0015";
      f4994[33] = "6\u0001x\u0005]k*\u001bzYG\u007f:\u00181HCw<\u001dk\u0005Nn0]lR\\j<\u001e1h@r6\u0001l";
      f4994[34] = "v3\b):\u0004j)\nu \u0010z*Ad$\u0018|/\u001b))\u0001po\u001c~;\u0005|,AD'\u001dv3\u001c#\u000b\u001eu.\u001dJ'\u0015|";
      f4994[35] = "ll%\u0007S qy}%\u0012-i\u007f";
      f4994[36] = "\n\u001d\u0013[9t\u0016\u0007\u0011\u0007#`\u0006\u0004Z\u0016'h\u0000\u0001\u0000[*q\fA&\u00008i\u0000\u001d<\u0014(j$?=";
      f4994[37] = "Wo]\u000bt<Ku_Wn([v\u0014Fj ]sN\u000bg9Q3\\@g=Mo_\u000bn<\\3vLu=ph^`j,UxTQ\"\nWqUWK&\\x";
      f4994[38] = "e\u000ec\u0004)\u000ey\u0014aX3\u001ai\u0017*I4\toRwO/\u000fc\u0012c\u0004\u001e\u0015\u007f\u0011WO/\u000fc\u0012c";
      f4994[39] = "\u0007p-W?\u0003Qo.56yMm(M2HOk25b\u0007J>m\u0004b\u001d\rgW";
      f4994[40] = "a\u001b@\u000biA=G\u0018J\u0013Lj^7QoB{S1PwD}\"\u0000[l[n\u0013\u0002]v#aPF\u000el\u0019aYFO\u0013DaH\u0017\\hQb\u001b\u00117";
      f4994[41] = "o\u0010w!&xeM'#Vu8\b\bt3w\u001b\u00134P0f4\b?\u001d,v*\f',.p0tu!;p,\b>{8uU";
      f4994[42] = "M9?0K:\u000e5?,;8\u001b7e)W\nMu<u\n]O5xq\u0001lO/?(;f\u0004q{>\\%\bqgN";
      f4994[43] = "XS^\u0014@3\u000eYIK2ȍd\u000fZ\u0006\rnU\u000f@ATT";
      f4994[44] = "#-AQvd&*\t\u000e\u0012Ѐ\u001e\u007f\u0005\\xsb4__}\n%xT[kvn\"W^\u0012";
      f4994[45] = "k]!\u001bX>(Q!\u0007(<=S{\u0002D\u000ei\u0017*Z\u0017Yn\u0014q]\u0016%`Nk\t(b\"\u0015e\u0015O!.\u0015ye";
      f4994[46] = "$%\u001do;Fc#_.ENw&\u000eb%*#>\u001c!\u007f\u001b#$[xE";
      f4994[47] = "$\u0012T\"^+bYX 0ņ\u001aS\fj^)d\tG-\u0001";
      f4994[48] = "4,B(\u0012\u0016k?\u0015iq\u0012i2M1\u001d 8u\u0011iIw?r@<\b\u000bt(C9qF8s\\-\u001e\u0011><UV";
      f4994[49] = "K\t2l;%KQhk\u00038OOP\u007fg*O3gq};\\V2w~3\"";
      f4994[50] = "3|Ir)8i7\u000e-Fˈ\u0003,\ty?\"2,Cr{";
      f4994[51] = "9F?\u001e]/9I}U.p?\u0004f\tHBl@=T$~1\u0015a\u0000Cj4\u0019fn";
      f4994[52] = "b@.EifwC}C\u0002rhZ\u001egH\u001d<X9\u00178,<B~N\u0002";
      f4994[53] = "DB\tf6@\u0013DFoMJ\u0018\u0002Tp!xLF\u0004*w/E\u001c[i.N\u001a\u000f\f(M\u001eICEl\"IO\fL\u0017";
      f4994[54] = "\u001et.A\u0012wB,v\u0014| \u0013'p\u0014+uCv(x\u0011!\u001c%wHM*\u00168";
      f4994[55] = "*'sT\u000b|ll\u007fVex\u00148*G\u0014j)-)\u0017\u0019\u0011zmpW\u001e,on Ze";
      f4994[56] = "WAVr*V\u0001ZR!VETF3+2WT`\"\bV\u0013GGRxg\u0013]\u0000\u000bB";
      f4994[57] = "I6\b-vfZb\u000e,\t}K$\u0010$eO\u001ciMr\t!X%Oy8!Bb\u0016C";
      f4994[58] = "e\u0003:W0%\"\u0005x\u0016N 7\nFI1%4\u0019$X5'8fxC28%\n?Epy[";
      f4994[59] = "\u000b=!\u001bb?W1=\u0014\u001czkdg\u0015v/\u0017/=\u0016sVPc6\u0012e*\u001b95\u0017\u001c";
      f4994[60] = "np}\u0016\u0004``*gB:r1&sBm%h{/.\u0004':s)R\n} '";
      f4994[61] = "m4dq\bI7\u007f#.gƹ]`%$WK!6> \u0004";
      f4994[62] = "[\u00053L/cE\u00176N\u0012v[\u0010j\fi\u001dZM7Jh\u007f\u0006\u0011o\u000b\u0012";
      f4994[63] = "W/\u000edBI\u001cu\ra;K\u0005w\u001ec|[lz\u0004pWK\t/\u0002s_5W/\u000edBI\u001cu\ra;";
      f4994[64] = "\u001cw\u001a\tL3\u001eq\u0000q@o\u001a{\u0002\u001dr?X%ZqDm\u0006|\u001b\rN\u007f\tqe";
      f4994[65] = "x\u0010p\u0005\u001e!x\u0010pDda}S'RdyyD1\\\u001ddq\u0013p>]eg\u0011{\u000f]\u007f HA\\\u0007qjL8A\u000f&+.";
      f4994[66] = "*\u001dDz\u001da*\u0014D;b\u0000\u0010&$\u0002)[*\u001dDz\u001da*\u0014D;";
      f4994[67] = "7)\u0014#R/t%\u0014?\"&m6J1ur0`\u0010e\"s~aP-E0raL";
      f4994[68] = "3d&h\u0017\u007fi/a7xʑ\u0003$py\u0000h2&vcxel>\"?\u0006=g?{\u0006";
      f4994[69] = "5\u00033\u001c.qoHtCAP\u0005Ss\u00178k4S9\u001c|";
      f4994[70] = "KD\b^S\u0002\u0010@\u0016^*POL\nLC\\vB\n\\G:LD\u000e\u001f\u0013D\u0014O\u000fF*";
      f4994[71] = ".c{Um'67~O\u0015\u0004\u000b\u0010\u0019w^_.c{Um'67~O";
      f4994[72] = "%b/\f\u000bM+}nQ:T*\u001bzZ\u0004\u000b'vz\r]\u0000";
      f4994[73] = "0\u000bu\u0005A`j@2Z.И\u0000[5\u000eWz1[\u007f\u0005\u0013";
      f4994[74] = "`:\u0019e\u0017\u000b<1\u0013xt^`)\u0017m\u0018l7eH3tZb5\u0010t\bPp:\u001d\n\u001bUu;\bt\b\u0001s:w";
      f4994[75] = "&\u001cP\u0019\u0002n|W\u0017FmС\u0016L\u0010\u0012\u0014t'LZ\u0019P";
      f4994[76] = "QZ|N4J\u0007E\u007f,İ0QZ|N4J\u0007E\u007f";
      f4994[77] = "N \u001b\u0007M\u0014NwB\f+\u0017J#AQ|@\u0014t\u0019=GG\u0011wK\u0004\u001b\u001fI\"";
      f4994[78] = ".r\u0007BO<ytHK46r2ZTX\u0004%q\u0004\u0002\nS$<\u0000MD4g0\u0000Q4b#sKH[5%<B3";
      f4994[79] = "W\u0012\u001a\u000b9\f\rY]TVąg\u0018\u001a_8\u001d\u0019BQ\u0018gr\u001eJ_\f)\u0012\tZA\tV";
      f4994[80] = "\u0002QT\f9\u000fX\u001a\u0013SVӥ2\u0001\u0014\u0007/\u0015\u0003\u0001^\fk";
      f4994[81] = "bW8\tWe`Q\"q[9d[ \u001dii'\u0000vqD8gC.@F>};,\u0012S3v\\8\u0017_4\u0018";
      f4994[82] = "HcXX2~\u000e(TZ\\χvhVU$zGjPO";
   }
}
