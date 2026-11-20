package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.entity.projectile.thrown.ThrownEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinThrowableProjectile;

public class Util454 implements Globals {
   public static long f7374 = Class066.m4320(-8365964610636397556L, -6052476193516220402L, MethodHandles.lookup().lookupClass()).m4325(170605324738787L);
   public static long[] f7375;
   public static Integer[] f7376;
   public static Object[] f7378 = new Object[110];
   public static String[] f7379 = new String[110];

   public static Class370 m14302(ProjectileEntity var0, int var1) {
      double var5;
      ProjectileEntity var12;
      label21: {
         int var10000 = Class253.m9154();
         var5 = 0.0;
         int var4 = var10000;
         boolean var11 = var0 instanceof ThrownEntity;
         if (var4 == 0) {
            if (var11) {
               ThrownEntity var9;
               var5 = ((IMixinThrowableProjectile)(var9 = (ThrownEntity)var0)).invokeGetGravity();
               var12 = var0;
               break label21;
            }

            var11 = var0 instanceof ArrowEntity;
         }

         if (var11) {
            var5 = 0.05;
         }

         var12 = var0;
      }

      Vec3d var10 = var12.getPos();
      Vec3d var8 = var0.getVelocity();
      return m14306(var10, var8, var1, var5);
   }

   public static Class538 m14303(LivingEntity var0, boolean var1) {
        return null;
    }

   public static Class370 m14305(LivingEntity var0, boolean var1, int var2) {
      Class538 var20;
      if ((var20 = m14303(var0, var1)) == null) {
         return null;
      } else {
         RenderTickCounter var26 = Globals.mc.getRenderTickCounter();
         boolean var10003 = true;
         float var5 = var26.getTickDelta(true);
         Vec3d var24 = var0.getCameraPosVec(var5);
         double var6 = var20.f8675;
         double var8 = var20.f8674;
         float var21 = var20.f8673;
         float var10 = var0.getYaw();
         float var11 = var0.getPitch();
         Vec3d var12 = new Vec3d(Math.cos(var10 / 180.0F * (float) Math.PI) * 0.2F, 0.1, Math.sin(var10 / 180.0F * (float) Math.PI) * 0.2F);
         Vec3d var25 = var24.subtract(var12);
         double var13 = -Math.sin(var10 * (Math.PI / 180.0)) * Math.cos(var11 * (Math.PI / 180.0));
         double var15 = -Math.sin((var11 + var21) * (float) (Math.PI / 180.0));
         double var17 = Math.cos(var10 * (Math.PI / 180.0)) * Math.cos(var11 * (Math.PI / 180.0));
         Vec3d var22 = new Vec3d(var13, var15, var17).normalize().multiply(var8);
         return m14306(var25, var22, var2, var6);
      }
   }

   public static Class370 m14306(Vec3d var0, Vec3d var1, int var2, double var3) {
        return null;
    }

   static {
   }
   public static void m194() {
      f7378[0] = "(\u0002U#+\u000f#\rDlH\u00026\u000b";
      f7378[1] = double.class;
      f7379[1] = "java/lang/Double";
      f7378[2] = "hc\f\u001323ty\u000eO('dzEЅ";
      f7378[3] = ")=-$\u0000K)=:x\fD3v:f\fQ4\u0007h9]\u001b";
      f7378[4] = boolean.class;
      f7379[4] = "java/lang/Boolean";
      f7378[5] = "hg['&\u0016t}Y{<\u0002d~\u0012Ӣ";
      f7378[6] = float.class;
      f7379[6] = "java/lang/Float";
      f7378[7] = "c#\u001b;1!c#\fg=.yh\fy=;~\u0019]!o";
      f7378[8] = "HnN&\"0HnYz.?R%Yd.*UT\t9\u007f";
      f7378[9] = "iNL\nnWiN[VbXs\u0005[HbMtt\u0001\u00134\u0007";
      f7378[10] = "\u0013~)lOz\u000fd+0Un\u001fg`!Qf\u0019b:l\\\u007f\u0015\"\t.Rm\u001d`=";
      f7378[11] = "\u000fHOTc\u0012\u0013RM\by\u0006\u0003Q\u0006Ȏ";
      f7378[12] = int.class;
      f7379[12] = "java/lang/Integer";
      f7378[13] = "fE\u0013b\u0005\u001az_\u0011>\u001f\u000ej\\Zϒ";
      f7378[14] = "+.\u001e\u001d?J+.\tA3E1e\t_3P6\u0014[\u000bb\u0011";
      f7378[15] = "w\u000fzQ*\u001fw\u000fm\r&\u0010mDm\u0013&\u0005j5?H~D";
      f7378[16] = ";&bl`z'<`0zn7?+Ʉ";
      f7378[17] = "\u0005ul<\nq\u0005u{`\u0006~\u001f>{~\u0006k\u0018O)%^!";
      f7378[18] = "MxCc\u007f\u001cMxT?s\u0013W3T!s\u0006PB\u000e~!D";
      f7378[19] = "Els_>\u001eNcb\u0010_\u0010EhfJ";
      f7378[20] = "6\u000biZR}6\u000b~\u0006^r,@~\u0018^g+1,C\t ";
      f7378[21] = "i\u0001v>7\u0013u\u001btb-\u0007e\u0018?Ƽ";
      f7378[22] = "GpRAD\u0001GpE\u001dH\u000e];E\u0003H\u001bZJ\u0017]\u001fP";
      f7378[23] = "\f9bnA[:\u001cbnV\u00076\u0013x%V\u00196\u0006\u007fT\u0004GaM7";
      f7378[24] = "X?\u001d\u001d~lD%\u001fAdxT&Tψ";
      f7378[25] = "2)0}?g2)'!3h(b'?3}/\u0013v`k";
      f7378[26] = "Z\u001fVekrZ\u001fA9g}@TA'ghG%\u001by1#";
      f7378[27] = "Y*G\r6DY*PQ:KCaPO:^D\u0010\u0004\u0017m";
      f7378[28] = "\u0004\u001bIv}\u001b\u0004\u001b^*q\u0014\u001eP^4q\u0001\u0019!\fo%A";
      f7378[29] = "\u0018B%T\u0004m\u0018B2\b\bb\u0002\t2\u0016\bw\u0005xhIZ0";
      f7378[30] = "+u)\u001e&Z+u>B*U1>>\\*@6Ol\u0002r\u0004";
      f7378[31] = "\u000e=CX`{\u00105Y\u0017\u0002g\u0017(";
      f7378[32] = "/$+?[b/$<cWm5o<}Wx2\u001em\"\u000e";
      f7378[33] = "%\u0006\u0005X\u0002#%\u0006\u0012\u0004\u000e,?M\u0012\u001a\u000e98<CEVn(\u000f\u0010\u0005\u001c\u0015yWA";
      f7378[34] = "[\u0019\u0000il][\u0019\u00175`RAR\u0017+`GF#Eq6\u0001";
      f7378[35] = ";iz_n/%a`\u0010&/?kxW/4\u007fX~[$32ix[";
      f7378[36] = "j,lLYWj,{\u0010UXpg{\u000eUMw\u0016+[\u0002\b";
      f7378[37] = "HY\u0012\u0003>\"HY\u0005_2-R\u0012\u0005A28UcP\u001ek";
      f7378[38] = "~\f\u001e\u001e\u0016T~\f\tB\u001a[dG\t\\\u001aNc6Y\tN\u0004";
      f7378[39] = "z,:&\u001f!z,-z\u0013.`g-d\u0013;g\u0016}1D}";
      f7378[40] = "\u000e6V\u0003\u0001\u0017\u000e6A_\r\u0018\u0014}AA\r\r\u0013\f\u0011\u0014YGD0NL\u001f\r?a\u0016\u001f";
      f7378[41] = " .b&4! .uz8.:eud8;=\u0014%1lqj(zi*;\u0011x/>i";
      f7378[42] = ">Dj)\u0005O>D}u\t@$\u000f}k\tU#~/1_\u0010";
      f7378[43] = "X\u0016G\u000b\\qD\fEWFeT\u000f\u000eFBmR\nT\u000bOt^JAFMaD\u0017OW]*R\nTLZ}\u0019-mLVmY0HWAsV\u0006L@~vX\u000eEFZm[\u0001";
      f7378[44] = "\u0001vBF#`\r'\u0019\u0019\u00181\tp\u0017\u0011OoR-L}q8P,B\u001fef\u000fy";
      f7378[45] = "r\u0000\u0000\t\u000e}k\u001dQ^~gc\u0007\u000bP\u0012U7JV\fN\u00023CWZ\u0005gsB\fY~";
      f7378[46] = "\u0001;u:0Q\u00027{uNV\u000evvl\"d^:,:NV\u0003{h:v\f\u0007mi\u000b";
      f7378[47] = "j@|i\u0004\u0003j\u0002ve`\u001dgD}e\f/3\u0007\"2\\x7\u0000!o\u001b\u001dw\u0001zl`";
      f7378[48] = "\u00040L\u007fM`\ri\u000bxu<\u0004wRv\u0019\u000eV4\u0002(u2\u0006{O,\u00139UjB\u0011NiV3\u000fp\u00128Yo2";
      f7378[49] = "muft\u0016#{s3iq+y2ks\u001d\u0019-q4(KNm1op\u001c2$ujnq4.(`*K3-wm\u0014";
      f7378[50] = "6no\u0015y\u0003vo4\u0016\u0002\u0003f*3\u001fn12niA\u0002\u001brk?\u0001i\u001an9SE:Zf-6\u0005;\u0001eV";
      f7378[51] = "fxG\u001f4\u0005&y\u001c\u001cO\u00056<\u001b\u0015#7bxBCO]c|\u0016\t*\u001db'\u0015rrXg-\u0000\u00172Y<.{";
      f7378[52] = "y,\bF_\u00199-SE$\u0019)hTLH+},\u000f\u0012$\u0001=)XRO\u0000!{4V]A(m_WA\u0013DiM\u0016H\u0005/hQD$A|(YPA\u0001}sZ+";
      f7378[53] = "z@&\u0016uBzQ!\u001b\u001f\u0007}O5\u0015dy{\u0016s\u0017e\u001a)O:@\u001f";
      f7378[54] = "JLH\u0016\u0014r\u0014V\tFyf\tH\u001a\u001f\u0002\u000b\u001cU\u000b\u0018\u0019d\u0015S\u001e\ny0@\nKF\u0018l\u0011\u0005\u0017{";
      f7378[55] = "pU\u001aF\u001by'Q\u0001]#tI\bDRR|1\u0000\u0015\\\u001a\u001dy\u0005\u0014NBeqT\u001a\u0006#";
      f7378[56] = "'\u0010a#\u001e(\u007f\rf)c/{\u0018<#4x$EgO\u001azw\u0015?\"\f|\"\b";
      f7378[57] = "[xRfz$W)\t9AuS~\u00071\u0016+\t,S](|\n\"R?<\"Uw";
      f7378[58] = "F2\u0004Wu\u001c\u001dl\u0011\u000fD\u0004J(\b\b(6\u001akTTtaN3P^u\u0003Zm\u000f\u000bDZ\u0017kPR%\u0006Fd\fo";
      f7378[59] = "i@LAJ}eGG\u001f/pt\u0015EOx'*E\u001c\u0013/b-\u0015CFLn*\u001e\u001d";
      f7378[60] = "&y V-\u000b*({\t\u0016Z.\u007fu\u0001A\u0004s)/m\u007fSw# \u000fk\r(v";
      f7378[61] = "r\u0006\u0004$\tCq\n\nkwD}K\u0007r\u001bv.\u000f[*wJ\u007fG\u001a(\u0011A,V\u0017\u0015";
      f7378[62] = "aME,c\u0010?W\u0004|\u000e\f6H\u001e&b>e\fBq\u000eY$S\u000fxw\u00159M\u0000A";
      f7378[63] = "<3\u001c\r\u000f^0bGR4\u000f45IZcQl`\u00176]\u0006mi\u001cTIX2<";
      f7378[64] = "(dg\u0016Y58r4s\rm9\u001fq\n[f;tp\u0016\t\n?f1\u001f\u001fa>zcs";
      f7378[65] = "\u0017>K\u0000\u007fZI$\nP\u0012F@;\u0010\n~t\u0010wKS\u0012\u001fO<\u0015\u0003q\\\u0010z\u0000m/\u001b\u0011*\u000b\bo\u001aJ)p";
      f7378[66] = "\u0006C@ \u001fL\u0018ZF'u\u0010\tFG>\u0019\"[\u0005\u001dcuE\u001b]V`\f\t\u0006CYYI\u0017\u001f_I:\nHYJ'";
      f7378[67] = "TR6zy^\u0014Smy\u0002^\u0004\u0016jpnlPZ:/?;\u0014\u00137{{P\u0015\u000fe\u0017\u007fBT\u0006s|~^\u0006jwn?W\u0010\u0001vrm;TR6zy^\u0014Smy\u0002";
      f7378[68] = "q9ii$\u001f+=\u007fh\u0015By%xpyp-a &\u0015Zmdtn~[q6\u0018jl\u001ax skpH\u0014$a*y^\u007f%}x\u0015Bt(f&-\u0018p>g\u0017";
      f7378[69] = "M\f=\u0016\"uA]fI\u0019$E\nhANz\u0014_7-p-\u001cV=OdsC\u0003";
      f7378[70] = "\u001aD'\u007f{8\\P(c\u001f˳!Hn#s$JIrq";
      f7378[71] = "Z9T%1)\u0002$S/L%\n \r. \u0017YdSur@Y8\u0001'.>\u001em\u00146L";
      f7378[72] = "Im\u001b\u0011Lz\tl@\u00127z\u0019)G\u001b[HMm\u001dD7\"LiJ\u0007RbM2I|\n'H8\\\u0019J&\u0013;'";
      f7378[73] = "U\u0006V\ft!]U\r\b\u001awW\bU\u000eM%\u0007[\rS\u001arN\u000eL\tj\u007fHT]";
      f7378[74] = "hr/i8<6hn9U ?wtc9\u0012l2-9U~b4,94\"3;p\u0004";
      f7378[75] = "\u0007\u0005D\u0006Gf\u000bT\u001fY|7\u000f\u0003\u0011Q+iSRJ=\u0015>V_D_\u0001`\t\n";
      f7378[76] = "U_CN\u000b#\u000bE\u0002\u001ef?\u0002Z\u0018D\n\rT\u0018D\u001e[ZSD\u0003F\b9\u0010\u001bESf";
      f7378[77] = "K[\b=MH\u0018I\u00054,\u0016\u001e+G>\u0015\u001f\bB\u001f#\u0012\u0015";
      f7378[78] = "`A*\u001em^l\u0010qAV\u000fhG\u007fI\u0001Q2\u001b*%?\u00061\u001b*G+XnN";
      f7378[79] = "iVn\u00106.b\u0005\u007f\u001d\u000b-oE~\ng\u001f9\u0000#R7Hk^&\\:*\u007f\u0000y\t\u000bs2\u0006&Pj/c\tzm";
      f7378[80] = "o\u0005&u\u0014B8\u0001=n,ծVU}0A]3\u0015|kB&kPyaWC+Q\"b,\u0016)\u000f45UZ4\u0011;\fQ_k\u0004<gPC9hth\u0011\u001fgT:}K@V";
      f7378[81] = "@Up3u\tZ\u000bt*\u0005\u0011[K|7h?PIT.l\u000e\\IjTx\t\u0000Yb?y\u0015R5";
      f7378[82] = "\u0018?N_\u0017{\u0014n\u0015\u0000,*\u00109\u001b\b{tOoCdE#IeN\u0006Q}\u00160";
      f7378[83] = "Q1e $p]`>\u007f\u001f!Y70wH\u007f\u0006ae\u001bv(\u0000keybv_>";
      f7378[84] = "IDj\u0018;;MA YK<@\u0012\u0010\r+-O\u001e\u007f\u0004-8]~+Qtm\u0011\u001fw\u0000{1,";
      f7378[85] = "\u0003A\u0013&m-\u0002AB8QԿi\u001fW8 f\u0010SJ&/_";
      f7378[86] = "v*E\u001av80>J\u0006\u0012ƈM&\fF~$&'\u0010\u0014";
      f7378[87] = "'v+xqQ'4!t\u0015O*r*ty}~1u#.*!b*h%H90so\u0015";
      f7378[88] = "k4|$\u0019Aj4-:%ɪ\u0001j8:T\nx&%$[3";
      f7378[89] = "\u0006C\bbk6\r\u0010\u0019oV5\u0000P\u0018x:\u0007P\u0013H%jP\u0006T\u0013b= \u000bRIsV<\rT\u001b\u007f95\u000bA\t\u001f";
      f7378[90] = "F\u001dv\u001e(.\u0000\ty\u0002Lӈ}P$\u0004)%\u001e\u0013{B<";
      f7378[91] = "\u001f\u0002?m\u001f\u000fN\u0007 *`\u008br\u0014,e\u001dJ\u0014\u001f\u007ft\u0010wIO|-]\u0016\u0015\u001esq`";
      f7378[92] = "\b1-&=]\b *+W\b\u00077'$\u0000[Vc{H9\r\b4)s9\u001c\u000f9";
      f7378[93] = "DPk{ \r\\\u00022|\u0010\u0001CQolGV\u0019\u00070\u0000v\u0003BG;bnQ\u001b@";
      f7378[94] = "8;OZ\fbx:\u0014Ywbh\u007f\u0013P\u001bP<;I\u0006w:=?\u001eL\u0012z<d\u001d7";
      f7378[95] = "Oo7k\u0007NC>l4<\u001fGib<kA\u001f9>PU\u0016\u001e572AHA`";
      f7378[96] = "95u_he ($\b\u0018\u007f(2~\u0006tM|~!P(\u001axv\"\fc\u007f8wy\u000f\u0018";
      f7378[97] = "|ja,(\\!4`(C˓\u001c=j#>Pz6923m|.d8'\u0016|ln4CV,i=n\"\n}faS";
      f7378[98] = "h\u0003\b0Z@0\u001e\u000f:'G4\u000bU0p\u0010jX\f\\GQ4\rU'G\u0013>\u0001";
      f7378[99] = "\u0004/fXmD\u001495=)\u001a\bTpDo\u0017\u0017?qX={\u0013-0Q+\u0010\u00121b=";
      f7378[100] = "\u0004xz()cS|a3\u0011ƙ=/`j|jDqz+,\u0007\u0006%&i,fZt)5\u0011<L%x5tzX*dQ";
      f7378[101] = "Eaj\u0011mc\u001b{+A\u0000\u007f\u0012d1\u001blMB)`L\u0000t\u0014v?\u0016;t\u0005q2|ku\u000fel\u001a`&\u001ehQ";
      f7378[102] = "Yh0\u0011|oQk3\u0015\u0007qS,:\tkC\u0007`bQ:\u0014Z?$\b{zC/<\f\u0007)\u0006l7\u0015bi\u000774n:,\u0002=!\u000bz-Y>Z\u000bge@abQcsAP=\n8fB.9\ni*>-#SkmU,?\u0001\u0007sO>a\u000bjz\u00015?n";
      f7378[103] = "$H\r\u0013\u0010k(\u0019VL+:,NXD|dp\u001f\u0007(B3u\u0012\rJVm*G";
      f7378[104] = "\u001f}1E_/X($T=4Le=LQ\u0006\u001f!c\u0010\u0002Q\u001a)b\u0013\u00000FxmO=mCb8E^.\u001c$-+";
      f7378[105] = "%BM\u0003\u0004ig\n\u0018\u0000|l>_D\r+;d\u000e\u0010a\u0006r2PX\nD:gS";
      f7378[106] = "av\u000bV\u000eUxf\u0013Rr^he\u0015W\u001el:\"O\rr\u00005&M\r\u0013\\d)\u00110";
      f7378[107] = "!\u0007s,`\u0015y\u001at&\u001d\u0012}\u000f.,JE#Xv@\u007fM\u007fS4\"|Aq\u001c";
      f7378[108] = ".:lu\u0005_p -%hCy?7\u007f\u0004q/}k%T&(!,}\u0006Ek~jhh";
      f7378[109] = "+\u0001Jh=\u0017q\u0005\\i\fJ#\u001d[q`xwQ\u000b.0/sY\u0007{wJ3X\\x\fJ.\u0010E'4\u0010*\u0006D\u0016";
   }
}
