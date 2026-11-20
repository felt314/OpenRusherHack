package org.rusherhack;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.hud.impl.Direction;
public class Class573 {
   public List<ItemStack> f9196;
   public BlockPos f9197;
   public static long f9198 = Class066.m4320(-7781328703628865523L, -876865491847218400L, MethodHandles.lookup().lookupClass()).m4325(222033398652377L);
   public static long f9199;
   public static Object[] f9200 = new Object[89];
   public static String[] f9201 = new String[89];

   public List<ItemStack> m17574() {
      int var10000 = Class253.m9154();
      ArrayList var4 = new ArrayList();
      Iterator var7 = this.f9196.iterator();
      int var3 = var10000;

      while (var7.hasNext()) {
         ItemStack var6;
         boolean var8 = (var6 = (ItemStack)var7.next()).isEmpty();
         if (var3 == 0) {
            if (var8) {
               continue;
            }

            var4.add(var6);
         }

         if (var3 != 0) {
            break;
         }
      }

      return var4;
   }

   public void m17575(List<ItemStack> var1) {
      this.f9196 = var1;
   }

   public BlockPos[] m17576() {
        return null;
    }

   public int m13575() {
      return ColorUtils.transparency(Color.RED.getRGB(), 0.25F);
   }

   public Class573(BlockPos var1, List<ItemStack> var2) {
      super();
      this.f9197 = var1;
      this.f9196 = var2;
   }

   public boolean m17578(BlockPos var1) {
        return false;
    }

   public List<ItemStack> m17579() {
      return this.f9196;
   }

   public void m13577(IRenderer3D var1) {
      Class573 var4 = this;
      BlockPos[] var7;
      int var6 = (var7 = this.m17576()).length;

      int var5;
      for (int var10000 = var5 = 0; var10000 < var6; var10000 = var5) {
         BlockPos var9 = var7[var5];
         VoxelShape var8 = Globals.mc.world.getBlockState(var9).getOutlineShape(Globals.mc.world, var9);
         double var10002 = var9.getX();
         double var10003 = var9.getY();
         double var10004 = var9.getZ();
         boolean var10008 = true;
         var5++;
         var1.drawShape(var8, var10002, var10003, var10004, false, true, var4.m13575());
      }
   }

   public void m13578(MatrixStack var1) {
        
    }

   public boolean m6502() {
      return this.m17574().isEmpty();
   }

   public boolean m17583(Predicate<ItemStack> var1) {
      int var10000 = Class253.m9154();
      Iterator var7 = this.m17574().iterator();
      int var4 = var10000;

      while (var7.hasNext()) {
         ItemStack var6 = (ItemStack)var7.next();
         boolean var8 = var1.test(var6);

         while (var8) {
            var8 = true;
            boolean var10002 = true;
            if (var4 == 0) {
               return true;
            }
         }
      }

      return false;
   }

   static {
   }
   public static void m122() {
      f9200[0] = "|P%\u000e\u0007i`J'R\u001d}pIlԛ";
      f9200[1] = "6 ##\fx((9lnd/5";
      f9200[2] = "\u0001\u0000\u0017%]\u0000\u001d\u001a\u0015yG\u0014\r\u0019^h@\u0007\u000b\\\u0005\u007fF\u0019\u001d\\3dC\u001a\u001c'\u0004bC\u0006";
      f9200[3] = int.class;
      f9201[3] = "java/lang/Integer";
      f9200[4] = float.class;
      f9201[4] = "java/lang/Float";
      f9200[5] = "\u0001\u0019P9\u00111\u001c\f\b\u001bP<\u0004\n";
      f9200[6] = "\u001b#\u0003w1\u000b\u001b#\u0014+=\u0004\u0001h\u00145=\u0011\u0006\u0019EkdS";
      f9200[7] = "\u000f0\u0015Qd<\u000f0\u0002\rh3\u0015{\u0002\u0013h&\u0012\nSI1e";
      f9200[8] = "R@D*teR@SvxjH\u000bShx\u007fOz\u00027,<";
      f9200[9] = " H|5\u0012P<R~i\bD,Q5ȝ";
      f9200[10] = "&?uO\u0016\f&?b\u0013\u001a\u0003<tb\r\u001a\u0016;\u00053RH]";
      f9200[11] = ":\"\u00022ce:\"\u0015noj i\u0015po\u007f'\u0018D+:9";
      f9200[12] = "b!JHx*b!]\u0014t%xj]\nt0\u007f\u001b\bU-";
      f9200[13] = "C;$#R\u0015H45l3\u001bC?16";
      f9200[14] = boolean.class;
      f9201[14] = "java/lang/Boolean";
      f9200[15] = "$ZF\u0007T98@D[N-(C\u000fJJ%.FU\u0007G<\"\u0006fEI.*DR";
      f9200[16] = "\t/&4n0\t/1hb?\u0013d1vb*\u0014\u0015a+3";
      f9200[17] = "QGh!n\u0018QG\u007f}b\u0017K\f\u007fcb\u0002L}.85H";
      f9200[18] = "`Q\f\u000e\t\bk^\u001dAd\u000bg@\u001b\u001dF\u0006fU";
      f9200[19] = "\u0005\u0010x<Mq\u0019\nz`We\t\t1ɦ";
      f9200[20] = "\u000b^\\\u0007p\u0011\u000b^K[|\u001e\u0011\u0015KE|\u000b\u0016d\u001a\u001e(L";
      f9200[21] = "oap\ng{oagVktu*gHkar[6\u00112$";
      f9200[22] = "/o\u001aL7(3u\u0018\u0010-<#vS\u0001)4%s\tL$-)3\u000f\u0007+9%oS+\u00178.y\u0018\u0010 /sY";
      f9200[23] = "wna\u000f\rtwnvS\u0001{m%vM\u0001njT'\u0017U";
      f9200[24] = double.class;
      f9201[24] = "java/lang/Double";
      f9200[25] = void.class;
      f9201[25] = "java/lang/Void";
      f9200[26] = "i+u?6Vi+bc:Ys`b}:Lt\u00110(i\r";
      f9200[27] = "@j8m\u0015\u0007vO8m\u0002[z@\"&\u0002EzU%WS\u001a(\u001em";
      f9200[28] = "U\u000b5lq#K\u0003/#\u0016\"Z\u0018\"y0$";
      f9200[29] = "U\u0016=o\t\fK\u001e' A\fQ\u0014?gH\u0017\u0011'9kC\u0010\\\u0016?k";
      f9200[30] = "I 95A\u0018I .iM\u0017Sk.wM\u0002T\u001ay.\u0014F";
      f9200[31] = "X\u001d\t\u0017\bUX\u001d\u001eK\u0004ZBV\u001eU\u0004OE'O\rV";
      f9200[32] = "q4(iUCq4?5YLk\u007f?+YYl\u000eev\u0000";
      f9200[33] = "2]\u00077,p2]\u0010k \u007f(\u0016\u0010u j/gB.x ";
      f9200[34] = "\"\f #\u0013+\"\f7\u007f\u001f$8G7a\u001f1?6l<O";
      f9200[35] = "pS\\q\\zpSK-Puj\u0018K3P`mi\u001cj\b$";
      f9200[36] = ":Hl9ur:H{ey} \u0003{{yh'r).+,";
      f9200[37] = "\u0018{%R\u001f/\u0004a'\u000e\u0005;\u0014blˎ";
      f9200[38] = "U\u0013%9\u0013oU\u00132e\u001f`OX2{\u001fuH)e\"G?";
      f9200[39] = " :-,\u001e( ::p\u0012':q:n\u00122=\u0000m7Jvj<5c\u00002\u0011kl;K";
      f9200[40] = "\u0000%DJ&\u000b\u0005~M\u0018B^Qi_F.l\r*\u0002\u0011B\u0006\u0006uPD\u007fFW{B!|\u0000E*\u0005]\"FE-?";
      f9200[41] = "iI\u0017\u001a6?h\u001c\u0017\u001cN!}E\b8.$\u007fAw\fp|nVF\u0000+|z,\u0017_!#fP\u000b\u000710\u0007LK\f ,{P\u0013\u001c3Mg\u0010\u0018\r/1{H\b\u001eN$?QMY6\"yW\u001ac'uz\u0016M\u001b!3|AwY/$e\u0010\n\nr.g,\u0016[ 0?F\u0007])4\u0007";
      f9200[42] = "f0\u001a\u001a(>e+\u000byԐZd'\u0013\u0004$806\u001a\u0000N";
      f9200[43] = "NxfGT\u0002\u0007+xEhS\u0007=i\u001e\u0013>O!i@\u0017QO)kDhWF=:@\u0010Q\u0000;mz";
      f9200[44] = "*PR\u0002JC~\u0002K\u00060J.\u0000P\u0013g\u001dtP\f\u007fP\u0018 \u0003U\u0003L@0\u0010";
      f9200[45] = "|7-?c\u0019(e4;\u0019\u0010xg/.NG\"7rByBvd*>e\u001afw";
      f9200[46] = "!\u0007\u0001z\\T*[Uv.S&\u001eQqHar^\u0001.$S)\b\u000ew]Y:\u001dO\u0016";
      f9200[47] = "'Y\r1\u0000/ UMre4.KWm\t\u0006y\r\u00062^Q\"\u000fYw];3\tPse";
      f9200[48] = "\u001c)ng[!\u0016:{&:=\u00147d?V\u000fCp=g\nX\u001f 49\u0006b\u0010u5;:?A5b7D=H6kX\u00009\u0010)8%Sd\u001a+\u0004b[1\u001bwy1\u0006;\u0019K`6\u0000c\u001c5g:@ y,if]e@(>g\u0002X\u0001\"9>\u0000\"\u0001wfc:b\u0018\"fdG1E(dX[`\u00176<2Jf\u001e2\u0004";
      f9200[49] = "e!\u0006\u000fX%,2\u0005\u001ff8&6\u000e\u000b\u001e-&2\u000e\u001b\u0017Df>\u0001\u0012Z95c\u000b\u0010f~!$Q\u001fZ&3fRp\\%5=T\r\u000fx??h";
      f9200[50] = "C>D(V#\u0003oJ:3{\u0013xD _IG=\u001az\u000f\u001e\u0015mN)\u000b`\u000efE\"3u\u0001uV.]%\f\u007f]G";
      f9200[51] = "A?w\u0004hs\u0000vj\u0006S'\u0013rv\u0006?\u0015G6,_hBDo\u007f\u0003o?\u00172u\u0001S";
      f9200[52] = "\u0000/\u001c\rOI\u000bsH\u00017E\u000b'H\r`\u0012Tz\u0013a\u0007U\u0016'BP\bZT*";
      f9200[53] = "\u0013N\u001aY\u0016|\u000f\u0001\u000eIhҲj\u001b_C\u0015v\rO\rZ\u0011";
      f9200[54] = "\u00117\u0016+K_\u001f0\u0016>5Y\u001f+\nU\u0004D\u001bj\t:\u0004L\u0019nv<\rXHj\u000e:K^\u001fP";
      f9200[55] = "g=i<\u001442dabd%1&Y\u001d.Jf;j0X75f`2d";
      f9200[56] = "t\u007f\tU],wd\u00186ϐH-o\n_Z3*lX\r;";
      f9200[57] = "k<\\\u0010\u0014\u000el0\u001cSq\u0015b.\u0006L\u001d'5hW\u0013Lp5/\u001d\u0012\u001eLm=_\u0011qJr)_DM\u0012`k\\+K\rtk\t\u0017\u0013\u001f6hfJI\u001erj\f[O\u0017vR";
      f9200[58] = "50^\u007f9 :e_}\u0005\u007f>'\u000eyiMljP&\u0005sk&T$}u- \u0003\u001e";
      f9200[59] = "\u007f`hI!*63vK\u001dx.5j\u0018J/ue0E\u001d&w>3H!o$ 1";
      f9200[60] = "qqX\u0006Z\u0010v}\u0018E?\u000bxc\u0002ZS9/%S\u0005\u0003nu#\rS^\u0012i{\u001d@?\u000e)p\f\\C\u0012q`\u001f=_Rzq\u0003AC\njbb\\\u0007\u0000h'\bM\u0001\tl\u001f";
      f9200[61] = "#,@RSN&4R\u0019cW!VT\rS^24_Q\u0007R";
      f9200[62] = "~~hb\".|wkkM>x+rh\u001al\"\u007f&\u0004*hg yz(ad)";
      f9200[63] = "h\u000f:>u\u0011)F'<NM.C2?5 f_2a1OfW0eNIoCaa6O)E6[";
      f9200[64] = "8uUX7>;nD;;Zo7YQ!7=5\n\u0001Q6=e_K<d?6\u000f;";
      f9200[65] = "\u0019G7Vf/M\u0015.R\u001c&\u001d\u00175GKqGGk+|t\u0013\u00140W`,\u0003\u0007";
      f9200[66] = "MvKd[\u0019\u0016?E{:\u0006FtfwJ\u001a/f\u0018g\u0000\\W`^aWf";
      f9200[67] = "0Ee{[{q\fxy`/b\bdy\f\u001d6L> \\J5\u0015m|\\7fHg~`";
      f9200[68] = "'o_0^*|&Q/?3(fHN\u000e4,,K!\u000e<.(4";
      f9200[69] = "(n*\u0016f\r|\u007f#\u0012\f\u0006}iCZm\u0006+z,Ze\u0004/\u0005*SqU+},\u0015w\u0002\u0011";
      f9200[70] = "\u0001\fjd;\u001dY\u0019x8YԘ?F`o;DB\u0015=e9x";
      f9200[71] = "\u0019\u007f\u001ew\u001eW\u001ad\u000f\u0014Ӻ3\u0018b\u0017vDNK?\u001dtx";
      f9200[72] = "s:\u0013fNj+/\u0001:,ɖMp\u0019mN30#DgL\u000f";
      f9200[73] = "4\u001d\u001f\u0003P2tL\u0011\u00115jd[\u001f\u000bYX3\u0019EU\u0005\u000fhE\u0001\u001d\f}m\u001dG\u0007508F\u001aW\u0004qq[\u0018lZ18N\u0005]Vj8Z\u007f";
      f9200[74] = "?30a>|8?p\"[g6!j=7Uag;bj\u0002:ed'ch+cm#[";
      f9200[75] = "!gD&w)\"|UEϷM#pM8{/waD<";
      f9200[76] = "V?;\u0017\u001fB\u0003f3Iof \u0014QB\bV\u0003(/\u0017Q^]";
      f9200[77] = "\u000fz{xKN\u00135oh5ȗv33|I@\u0006/|hY";
      f9200[78] = "Jmx2\u000e$Ajf4i}^|v:\u0005O\t;.eQ\u0018Ifjg\u000e`Mfn#i";
      f9200[79] = "5\u001c\r6L,6\u0007\u001cUѺH1Q\f0\u0011yp\u0018\u00112";
      f9200[80] = "g\u0005c\u0006y`h\n!\u000b\u00174:\u0007\u007f\f{\u0006g@%S\u0017nf\u001azP&//\u0007xk*k7\u0014zVj:9\u0006\u001f";
      f9200[81] = "F.AON>\u00125HK$=\u0003\"R[X;\u0005OJKO\"\u001e0\u0011\u0002A=\u007f";
      f9200[82] = "{Jf]#L:\u0003{_\u0018\u0018)\u0007g_t*}C?\t#}z@~\u0007\"\u0001$\u0006~\u0000\u0018Bu\u001ab\u0003)\u0003<\u0007`8";
      f9200[83] = "FOf<\u001cA\u0012^o8vB\u0004ij9\nR\u007fM7<L\u0019\u0007Kq:\u001b#";
      f9200[84] = "@Q.r'5K\rp~_2GHty3\u0000\u0010\u000e%\"gWSYzq8kX^dw_";
      f9200[85] = ">V\u0002\u0015r0;\r\u000bG\u0016nc\u000b\u001d\u0012A9:YFF\u0016m3Y\u0007\u0013yfl\u0014\u0016";
      f9200[86] = "m\u0013\u001a5Q\u0015-B\u0014'4M=U\u001a=X\u007fj\u0019Fk\u0004(;@\u00104\fV K\u001b?4AhT@`LG.R\u0017Z";
      f9200[87] = "Yw]ek_\u0018>@gP\u000b\u000b:\\g<9_~\u0006>hn\\'Ubl\u0013\u000fz_`P";
      f9200[88] = "\t+\u0011%{Y\u0006$S(\u0015\rT)\r/y?\tnWq\u0015W\b4\bs$\u0016A)\nHx\u000e\u0002(U.rV\u0000/m";
   }

   public Class573() {}
}
