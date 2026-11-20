package org.rusherhack;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.setting.ColorSetting$RainbowMode;
import org.rusherhack.client.api.system.Colors;
import org.rusherhack.client.api.system.Colors$ColorMode;
import org.rusherhack.client.api.system.Entities;
import org.rusherhack.client.api.system.IRelationManager;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.client.api.feature.hud.impl.Speed;
public class Module216 extends Module implements Colors {
   public NullSetting rainbowSettings;
   public ColorSetting barrels;
   public NumberSetting<Integer> saturation;
   public ColorSetting far;
   public NullSetting entities;
   public NullSetting blockEntities;
   public ColorSetting end;
   public NullSetting distanceColors;
   public ColorSetting start;
   public static Module216 f4012;
   public ColorSetting hostiles;
   public ColorSetting friends;
   public ColorSetting chests;
   public NumberSetting<Float> speed;
   public ColorSetting enderchests;
   public ColorSetting enemies;
   public ColorSetting vehicles;
   public ColorSetting f4020;
   public ColorSetting neutrals;
   public ColorSetting misc;
   public ColorSetting endcrystals;
   public NumberSetting<Integer> brightness;
   public ColorSetting items;
   public EnumSetting<Enum216> mode;
   public ColorSetting close;
   public ColorSetting passives;
   public ColorSetting shulkerboxes;
   public ColorSetting players;
   public static long f4031 = Class066.m4320(3295295885879583086L, 7830669736553269333L, MethodHandles.lookup().lookupClass()).m4325(252841781021002L);
   public static String[] f4032;
   public static String[] f4033;
   public static long[] f4035;
   public static Integer[] f4036;
   public static Map f4037;
   public static Object[] f4038 = new Object[144];
   public static String[] f4039 = new String[144];

   @Override
   public Color getEntityColor(Entity var1, Colors$ColorMode var2) {
        return null;
    }

   public Module216() {
    }

   @Override
   public Color getBlockEntityColor(BlockEntity var1, Colors$ColorMode var2) {
        return null;
    }

   @Override
   public int getRainbowColor(ColorSetting var1, int var2) {
        return 0;
    }

   @Override
   public ColorSetting primaryColor() {
      long var1 = f4031 ^ 134825872796148L;
      return ((org.rusherhack.client.api.ui.theme.ITheme)(org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "¤", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.ui.theme.ITheme.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7115(),  7004533200974569654L,  var1))).getColorSetting();
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
   public static int m704(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f4039[var4] != null) {
         return var4;
      } else {
         Object var5 = f4038[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 17;
               case 1 -> 5;
               case 2 -> 15;
               case 3 -> 37;
               case 4 -> 61;
               case 5 -> 42;
               case 6 -> 29;
               case 7 -> 48;
               case 8 -> 36;
               case 9 -> 49;
               case 10 -> 35;
               case 11 -> 58;
               case 12 -> 56;
               case 13 -> 24;
               case 14 -> 54;
               case 15 -> 19;
               case 16 -> 53;
               case 17 -> 59;
               case 18 -> 22;
               case 19 -> 11;
               case 20 -> 27;
               case 21 -> 16;
               case 22 -> 60;
               case 23 -> 23;
               case 24 -> 10;
               case 25 -> 30;
               case 26 -> 44;
               case 27 -> 34;
               case 28 -> 47;
               case 29 -> 18;
               case 30 -> 12;
               case 31 -> 46;
               case 32 -> 31;
               case 33 -> 0;
               case 34 -> 41;
               case 35 -> 9;
               case 36 -> 1;
               case 37 -> 25;
               case 38 -> 62;
               case 39 -> 4;
               case 40 -> 33;
               case 41 -> 39;
               case 42 -> 38;
               case 43 -> 26;
               case 44 -> 40;
               case 45 -> 6;
               case 46 -> 52;
               case 47 -> 2;
               case 48 -> 57;
               case 49 -> 28;
               case 50 -> 3;
               case 51 -> 13;
               case 52 -> 8;
               case 53 -> 45;
               case 54 -> 14;
               case 55 -> 63;
               case 56 -> 51;
               case 57 -> 7;
               case 58 -> 43;
               case 59 -> 32;
               case 60 -> 50;
               case 61 -> 20;
               case 62 -> 55;
               default -> 21;
            };
            int[] var7 = new int[6];

            for (int var8 = 0; var8 < 6; var8++) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for (int var14 = 0; var14 < var13.length; var14++) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            f4039[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f4038[0] = "P`\",\u001c<Lz p\u0006(\\ykƼ";
      f4038[1] = "p\u001452\u0012_l\u000e7n\bK|\r|\u007f\fCz\b&2\u0001ZvH!y\u0014^v\b52#Es\t O\u0005^k\u000f<{";
      f4038[2] = ">N\u0011\\ze#[I~;h;]";
      f4038[3] = ") 4\n\u0019\u001a5:6V\u0003\u000e%9}G\u0004\u001d#| A\u001f\u001b/<4\n.\u00013?\u0000A\u001f\u001b/<4";
      f4038[4] = "*\u0018/C&%6\u0002-\u001f<1&\u0001f\u000e;\" D;\b $,\u0004/C\u001a%(\b-\u001f\u000751\u001e!\u00033";
      f4038[5] = "{Ken{>eC\u007f!3>\u007fIgf:%?h|`9.pD@z%;}Cv}";
      f4038[6] = boolean.class;
      f4039[6] = "java/lang/Boolean";
      f4038[7] = "9pH\u0018\u0011.%jJD\u000b:5i\u0001U\f)3,\\S\u0017/?lH\u0018-.:n|S\u0017/?lH";
      f4038[8] = "28(\u0019#X.\"*E9L>!aΊ";
      f4038[9] = "<1[E\r\u0001 +Y\u0019\u0017\u00150(\u0012\b\u0013\u001d6-HE\u001e\u0004:mZ\u000e\u001e\u0000&1YE\u0012\u001b76P\u000eQ9<'I\u0007\u001a";
      f4038[10] = "+vg^wM\u0002O{Du\u0011\u0018[kG>\u0000\u001fHm\u0002c\u0006\u0004NaBwM#_|Xy\r\u0017\u0001";
      f4038[11] = void.class;
      f4039[11] = "java/lang/Void";
      f4038[12] = "&\u007ft;]n:evgGz*f=vCr,cg;Nk #upNo<\u007fv;Bt-x\u007fp\u0001V&ifyJX(yvr@i0";
      f4038[13] = "zX5\u0017\u001b1fB7K\u0001%vA|Z\u00066p\u0004'M\u0000(f\u0004\u0002X\u00006";
      f4038[14] = "\u001f2]\ts1\u0014=LF\u000e)\u0007:E\u000f";
      f4038[15] = "\"UpPUQ)Za\u001f2S<QaT\t";
      f4038[16] = int.class;
      f4039[16] = "java/lang/Integer";
      f4038[17] = "\u0019+wK\f \u0012$f\u0004d \u001c+u";
      f4038[18] = float.class;
      f4039[18] = "java/lang/Float";
      f4038[19] = "%)N;\u0012b93Lg\bv)0\u0007v\u000fe/uZp\u0014c#5N;3r>/@{\u0007";
      f4038[20] = "q\u0015\u007fc+}X,cy)!B8szb0E+u??6^-y\u007f+}y<de%=Mb";
      f4038[21] = "$9h~w\u00188#j\"m\f( !3j\u001f.el?h\u0000*%k~u\u001f$(j#v\u0004%,!\u0013j\u0000&*a4U\u001f$(j#v\u00029";
      f4038[22] = ",^^\u0010ZT'QO_;Z,ZK\u0005";
      f4038[23] = "qz76Plm`5jJx}c~Ȟ";
      f4038[24] = "S\u0017 V5\u001eO\r\"\n/\n_\u000eiȌ";
      f4038[25] = "p\u001d\u001b&L1l\u0007\u0019zV%|\u0004RkR-z\u0001\b&_4vA\u000fqM0z\u0002RMP0v\u001b\u0015mM";
      f4038[26] = "(yp%^-(ygyR\"22ggR75C59\ns";
      f4038[27] = "pwh\u001d\t]lmjA\u0013I|n!P\u0017Azk{\u001d\u001aXv+|J\b\\zh!z)Msd{Z\u0014FRdaR\u001cMm";
      f4038[28] = "ld\u001e\u001b4Zld\tG8Uv/\tY8@q^X\u0000o\u0002";
      f4038[29] = "U';\u0003/2I=9_5&Y>rN25_{)Y4+I{\u001fB1(H\u0000(D14";
      f4038[30] = double.class;
      f4039[30] = "java/lang/Double";
      f4038[31] = "\u0012b{\u001cO\u001a\u000exy@U\u000e\u001e{2QQ\u0006\u0018~h\u001c\\\u001f\u0014>NGN\u0007\u0018bTS^\u0004<@U";
      f4038[32] = "Jcx]<3Vyz\u0001&'Fz1\u0010\"/@\u007fk]/6L?X\u001f!$D}l";
      f4038[33] = "\u000b0>\u000eX3\u000b0)RT<\u0011{)LT)\u0016\ny\u0011\u0005";
      f4038[34] = "f!#\u0001\u001e\u0013z;!]\u0004\u0007j8jL\u0000\u000fl=0\u0001\r\u0016`}7V\u001f\u0012l>jl\u0003\nf!7\u000b/\te<6b\u0003\u0002l";
      f4038[35] = "]k}#X*]kj\u007fT%G jaT0@Q>9\u0003";
      f4038[36] = "Csa\n!v_icV;bOj(G<qI/sP:o_/KE'kyuoH ";
      f4038[37] = "g3Px\u0015&{)R$\u000f2k*\u0019Ľ";
      f4038[38] = "`m\bl\u001f}|w\n0\u0005iltA!\u0001ajq\u001bl\fxf1\u001a+C|gz\u0002'CA[w\n/\b";
      f4038[39] = "Yq\bQ\b\u0014Ek\n\r\u0012\u0000UhAρ";
      f4038[40] = "+\u0006\t\u001b\u0017R+\u0006\u001eG\u001b]1M\u001eY\u001bH6<O\u0001I";
      f4038[41] = "Ag\u0011mIHAg\u00061EG[,\u0006/ER\\]Wp\u0017\u0019";
      f4038[42] = "C?;fI*C?,:E%Yt,$E0^\u0005}}\u001cu";
      f4038[43] = "R+[Qg4'\u0006FD?\u0016f\u000b^B*";
      f4038[44] = long.class;
      f4039[44] = "java/lang/Long";
      f4038[45] = "`q\u001fRqq|k\u001d\u000ekelhV\u001fomjm\fRbtf-\u000b\u0019wpfm\u001fR@kcl\n/fp{j\u0016\u001b'Vnj\u0016\u001elsBl\u001c\u0019";
      f4038[46] = ",oKPijs~\n(ϱ\u001a/;\u0003B4&-~\u000bW";
      f4038[47] = "\u0015\u00140?\u0001gO\u0014qe>9\u001b\u000b@yW:\u0017\u001ai\u007fd\u0019<wr9\u0001$IHs?Ymv\nhjN6\u000eMdz\u0005V\u001d\rnb\u0003;L\n~8><\u001d\u00117{\u0002g\f\u001dr\u0003";
      f4038[48] = "J\u0011Qj\n\u0010LZ\u0014j1/n\"!V|&hk\u0013m\r\u001d\u000f\u001b\u0015&H\u001d";
      f4038[49] = "\u0015\u0015H%mjJ\u0004\t]А\u001a\u0015\u0015H%mjJ\u0004\t";
      f4038[50] = "\u0007\u0003(\u00166h\u0006\u0004v@\rr\u001c$.\u0001vr\u0019\u0011\u0002\u001dg\u0013\u0006\u0018>\u0013g,W@?D\r/\u0003B~\u00183\u007f\u000eF?z";
      f4038[51] = "\u0015(D\u0004Ja\u001chI\u0004 \u007f\u001b4O\u0018~x\u001b.KdKk\u001e2\u001b\t\u001al\u000eh&";
      f4038[52] = "!!gQn<`7eJW3:0|W\u0000d`` ;31*/iCf/1#";
      f4038[53] = "rF\u0006)/\u0014p\u0003\u000e<NS&\u0003,*/N!\u0018\t\n*L,\u0000\u001b/N\u0014/AO!pD\"E\u000eCw\u0011;\u0015\u0017\u007fuT3\u0000v";
      f4038[54] = "lFD\bY43W\u0005pӷDkI\u0015\u0016_u)D\u001c\u001b";
      f4038[55] = "B\u0002Z\u000f>7@GR\u001a_d\u0016Gp\f>m\u0011\\U\"1e\u0000VVe5`\u001d\u0003RYnq\u0011F*";
      f4038[56] = "`\u001bs,_\u0013fP6,d/S/\u0006\f ?\u001e\u001f5m\u0019Xn\u0019~(\u0019";
      f4038[57] = "s-d9\u001dqp3=8a`|0\u0004.\u0005|wL0,\u00079bpk=\u000b|\u001a";
      f4038[58] = "MK6lgQO\u000e>y\u0006\u0002\u0019\u000e\u0018ob\u0010\u0019(\tL\u0006\u0007\u001f\u0014~~:\\\u000e\u0018;\u0006";
      f4038[59] = "^n\u0019\u001ct9\u0001\u007fXdεI]:Q\u000e)u_\u007fY\u001b";
      f4038[60] = "\u001fuHo\u0016:B&\u00132+\u0012oUe\u0013w\u001e&#G5\u0011jK~\u0014nL";
      f4038[61] = "*DE\u000fW'+C\u001bYl=1}G\u001e\u0010&#_o\u0004\u0006\\+_S\n\u0006cz\u0007R]l`.\u0005\u0013\u0001R0#\u0001Rc";
      f4038[62] = "OUP\u0003BhD\u0002QJ0|[G}\u0014TtL`[\u000fLrPT6J\tc\\Z\nHLkI;";
      f4038[63] = "K%\b^;R\u0016vS\u0003\u0006u6\u0017%d?P\u0012pU\tb\u0003I-";
      f4038[64] = "\bvv'\u0005x\u0010v9?d$\u0006\u000b!\u007f\u001b+Q2;1T\u007f";
      f4038[65] = "~\u0002GG l}\u0018FA[@CZH\u0011gv\"YR\u0010a";
      f4038[66] = "vy \\F-+*{\u0001{\u0007\u0015_\u0006)6@vy \\F-+*{\u0001";
      f4038[67] = "tr{\u001bF#v7s\u000e'd 7U\u0010\\~'*o\u0010[nMpu\u001b[\u007f*w7M_\u001ftr{\u001bF#v7s\u000e'";
      f4038[68] = "/\u0005/+\u0016,p\u0014nSĭ\\,Qg9K`.\u0014o,";
      f4038[69] = "\u007fzW#a!uv\u001b\"\u001d&cv\u000e;\u001d)kn\u00192e|uu\u0015Cy!vm\u001a;,?mak'q<un\u0013ro'y\u001f\u000f/l?vgZ1w3\u0007";
      f4038[70] = "mOL~\u001d5nUMxfxP\u0017C(Z/1\u0014Y)\\";
      f4038[71] = "#l\f6JV|}MNČ& 8D$\u0017\u001a\"}L1";
      f4038[72] = " \\\u0010]VP\u007fMQ%Բ #\bXO\u000b\u001c!MPZ";
      f4038[73] = "\u0001xpN\u0018*^r{_(ȁocaP\u0010 S8p\\UX";
      f4038[74] = "OGmD=}H\u0007rE[α6\u000e/Q<iD\toN=";
      f4038[75] = "\rM.:m[R\\oBǕ+\u000e\u0019f(0\u0017\f\\n=";
      f4038[76] = "\u001fQ\u001d\u001e{k@@\\fҌ\u001b\u001c\u0005U\f&'\u001e@]\u0019";
      f4038[77] = "\f\u00035D-%S\u0012t<ԄU\u000fW}Vpi\r\u0012uC";
      f4038[78] = "%V\u0014nNj\u007fVU4q4+Iq;\u0010=,RT\b>\u0011FHL;\u0001;>\u000f@+J[-OJ3L6|HZiq0<TJo\u001ca;D\u0010R\u001a!'T\u0016?K&7\u000e+8\u001a=~M\u0017c\u000b1;5";
      f4038[79] = "k{\u000b\u0001VX4jJyԃ(h/C\u0013\u000b\u0014jjK\u0006";
      f4038[80] = ")QK,\u0018X*O\u0012-dV)T\b?#F@Z\u001e4\\P|\u0001\u000f8\u0019()QK,\u0018X*O\u0012-d";
      f4038[81] = "<<\u0007qI.5|\nq# ?#\u0018|d0V,\u001fpBc;}\u0018`\u0018^<<\u0007qI.5|\nq#";
      f4038[82] = "Qy(=.\u0013S< (O@\u0005<\u0002>.I\u0002''\u0012(C\u0005@&-sRS0 f6Rh";
      f4038[83] = ",NHPL4s_\t(ƇD/\u001a\u0000B\u0011x-_\bW";
      f4038[84] = "\u0003b\u0001}\u000b\u0007\\s@\u0005џw\u0004mPc\rFF`Yn";
      f4038[85] = "g!4LIOa!=A-\u001cf7\rOI\u000efK=EN\ferlJG\f\u000b";
      f4038[86] = "8P^!\"\u00039W\u0000w\u0019\u0019#oV6e\u0019<Bt*sx9KH$sGh\u0013Is\u0019D<\u0011\b/'\u00141\u0015IM";
      f4038[87] = "\tg\u0018xJ@VvY\u0000ӵ0\n3Pj\u0017\f\bvX\u007f";
      f4038[88] = "\nqy\\\u0007\u0018W\"\"\u0001::iWHf\u0003\u001aS$$\u000b^I\by";
      f4038[89] = "p.8GZ?/?y?'OszpU\u0007sq?x@";
      f4038[90] = "&\u0017?fX\\2C%=9KHF|d\u0003\u0018#]q6\u0002g!\u0012|cF\f:\u001f.b9";
      f4038[91] = "a@\u0010,NEj\\\u000f%2RkG\u0001:^`?\n\\f\u00027|G\u001e7\u000bV=Q\u001c,2";
      f4038[92] = "l619 Q3'pAɜ!l ty~Q<>b!";
      f4038[93] = "P\u0006[x2*Q\u0001\u0005.\t0K'Yth:T\u0014yru0L\b4um(Y\u0013\u000b$5)\u000ey\bp7hRGX}3)0";
      f4038[94] = "\u0014q*\u007fz>\u0012:o\u007fA\u0014#JPH\u0006\u0011jul><u\u001as'{<";
      f4038[95] = "\u0011R\u0010d#L\b[\u00047QI\u001eC-{+G\u0015Pvnl\u001bI@\u001duaIH?";
      f4038[96] = "\u000f~\u001ev:\u0006\neG~P\t\rz\u001ca1\t\u0010\u0006\u001db?\bP}\u001cea^k";
      f4038[97] = "rai?-\u0005wz07G\b{eP9#\u000ejxm2\u0002\u000eppe9=gwkf.}\b&tp=G";
      f4038[98] = ":*5\u0014NZgynIsfN\u0001\u0011i,7:*5\u0014NZgynI";
      f4038[99] = "\u0015LL\u000ba\u001eJ]\rsΆn\u0016\u0018\u0004\u0019<R\u0014]\f\f";
      f4038[100] = "\u0012:myJjM+,\u0001ł\u001a\u0011n%k\u0017&\u0013+-~";
      f4038[101] = "Dn+l\u0011q\u0015q=\u007f+\u007f^Q!{No%uz+\u0011aNnwy\u0010\u001e\u0019xy/I Iu}n+";
      f4038[102] = "\tY\"rkvVHc\nƫ\u0006\n\rj`6:\bHbu";
      f4038[103] = "mqZc,Onk[eWC)iY;,.>wS 9\u0017oxZ W\u00124*\t=iB9.H_";
      f4038[104] = "\u0017\u000f[Vz9\u0016\tZA\u0017e\u0001\u000bPV{WUO\n\u000f/\u0000\u0006\u001cV\to<]\rZL\u0017";
      f4038[105] = "st'?ml,efGΑ\u001ct{v!k-6v\u007f,";
      f4038[106] = ")\u001a\u0001H7&)[^Q\n47X\f^qY F\u0006Ed`qI\u000fE\ne*\u001b\\X45'\u001f\u001d:";
      f4038[107] = "\u00052\t|+NZ#H\u0004ͬ>\u0006fAnv\u0002\u0004#I{";
      f4038[108] = "~L0h\u0011=`N6/|niP\u0018w\u001djgc.r aiI>\u0013\u0005ob\\!h\u000e8c\u0015S";
      f4038[109] = "\u0004Vp&\r/[G1^ϋ_\u0004@5fS/T^#>";
      f4038[110] = "]S\u0004l~\u007f\u0000\u0000_1C]>q)\u0010C+\u000b\\^k.vX\u0007\u0003";
      f4038[111] = "h&K\u001f\u001ac77\ngő\u0013kr\u0003\rG/i7\u000b\u0018";
      f4038[112] = "G,\fCy#\u0018=M;ЃSG&\u000bQ9l\u001cyOY";
      f4038[113] = "6_/\u0004*,g@9\u0017\u0010\",c9\u001f}%;-*C-y(F1N\u007fxW\u0011'@)!iA*DhC";
      f4038[114] = "\u00119W=X\u0013Lj\f`e5y\u001fq\u0007\\\u0011Hl\nj\u0001B\u00131";
      f4038[115] = "#\u001b+Ores\u0005=\u0017\u0010nt\u001c\b\u0016kts\u00012\u0016ld\u0019[(\u001dlu~\\jKh\u0015#\u001b+Ores\u0005=\u0017\u0010";
      f4038[116] = "\u0015\u0017frQ\u001cJ\u0006'\nƣl\u0016C.`\fP\u0014\u0006&u";
      f4038[117] = "mP\u0004y\\Jg\\Hx JtNDpFMx5\\uQTdM\tkJX\u0015QThRWm\u0004Js^&qYIkQ^$GRg ByDJhX\u0017g_F\u0019DJdGIa\u0011T\u007fK8}LWgD@(RLk5\\uQTdM\tkJX\u0015";
      f4038[118] = "u\u0002[k'\u00014\u0014Yp\u001e\u000en\u0013@mIY4C\u001d\u0001z\f~\fUy/\u0012e\u0000";
      f4038[119] = "LDf0cU\u001d\u001cgg\t\u000f@\\\u007f>e=\u0010\u001c f\t\b@F|+c\u0011IR/Y";
      f4038[120] = "\u0010>z;GL\u00118{,*\u0010\u0006:q;F\"R~+b\u0011u\u0001-wdRIZ<{!*";
      f4038[121] = "6\f\u001b|(\u001c0G^|\u0013\u00011\u000bNehl&\u0015D~}Uw\u001aM~\u0013P,H\u001ec-\u0000!L_\u0001";
      f4038[122] = "\u0000\u001ao^\u001c\u0007_\u000b.&Ȥw\u0007\u0015>@\u001aFE\u00187M";
      f4038[123] = "\u001c=|\u0016y\u001f\u001b}c\u0017\u001fМewn\u0012d\u0000Yil\u0014#m";
      f4038[124] = "zh\u0017}l\t;*NkUN)y\u0016k)Y>M\u001al)U\"y\f\u00108T:\u007f\u0019y$X4rw/3\f~hK->W!\u0016";
      f4038[125] = "1z|jxgnk=\u0012Ǌ\u00172.4x%+0k<m";
      f4038[126] = ";\u0010i=D_z\u0006k&}P \u0001r;*\u0007zQ,W\u0019R0\u001eg/LL+\u0012";
      f4038[127] = "Z\"$MWUZc{Tjf|F\u001cv,ap\u001d'\u0000\u000eX\u0000b'AQA";
      f4038[128] = "(\u0012qIR\u007f*Wy\\38|W]C^&|ppEX\nuOf\\^/\u0011\u0017e\u001d\n!/Gh\u0019KC(\u0012qIR\u007f*Wy\\3";
      f4038[129] = "`SJ3E\u0007aUK$([vWA3Di\"\u0013\u001bj\u0014>q@GlP\u0002*QK)(";
      f4038[130] = ",K\u0014~n\u0014&GX\u007f\u0012\u00130GMf\u0012\u0013.OI#\u007fB)_\u0013\u001ey\u00025O\u0015s(\u0005%\u0015(uh\u00195\u0013E$o\to.Cds\u0019iC\u0012ccCT";
      f4038[131] = "\u001c?s )\bZvr}\u0010U\r:u||gY\u007f-\".0\u001b>~|}\t\u001a8\u007fk\u0010";
      f4038[132] = "=\u0007\u001fU\u0005sl_\u001e\u0002o)1\u001f\u0006[\u0003\u001ba\\]\ro-8\u001a\u000fVP|`\u001bX<\u00046=\u0002[QU1-Xf";
      f4038[133] = ")?,\bD/u )\u00008_]\u0007\u001c!d\u0014)?,\bD/u )\u0000";
      f4038[134] = "83G\"\u001eKg9L3.ՙV(V<\u0016AjsG0S9";
      f4038[135] = "I\b\u001f,K7\u0016\u0019^T\u001eG\u001c\u0003C;\u00068J\u001e\u001c;w(\u0015\u0001H%\b~\b^HT";
      f4038[136] = "h9~p^Yfd+y&\u000fY<\u007f!\u001c\\2'rs\u001d#0h\u007f&YH+e-'&";
      f4038[137] = "a\u001c2\u0015Ha<OiHuV\u0015?R\u0016\u001albN?KI7?";
      f4038[138] = "=-+CvTg-j\u0019I\u000482y\u00051\u0002:'h\u0012\u0002\u0002:)n\u007f#\u000e8vlCx\u001f43\u0014\u0015\"\u0003f6(N3\u000f#Np\u00138\u0017/6%\r#\u001b^$\u007f\u0019q\u001db\u007fn\u00154e";
      f4038[139] = "r\u000fZ\u0012\u0000\u0002t\u000fS\u001fdWr\tf\u0005\u000ees\u0019A\u0019\u0002QeeP\u0018\u001aWp\fL\u0014\u0014Z\u001eZ[@^@\"XV\u001b\u0001>";
      f4038[140] = "\u0000cBY=5\u0002&JL\\rT&{W.iP\u0013VW;vT62\u000f87\u00008\f_53AZ\u000b\n,cXf\tO$v9";
      f4038[141] = "\u000b1;\u0006![T z~Ī+\u000b'~F\u007f[[9h\u001e";
      f4038[142] = "'\u001d\u001e_G\r%X\u0016J&^sX0\\BLs.WZF\u000b#I\n\t\u001dV\u001e";
      f4038[143] = "RF\u0015a\u001dQH\bZ5!\u0006U\u0017\u000egvQ\u000b@V\u000bF\u0013E\u000b\u0016yM\u000fZ\u0002";
   }

   public static Class m706(long var0, long var2) {
      Class var5 = null;
      int var4 = m704(var0, var2);
      Object var6 = f4038[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f4039[var4]);
            f4038[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m707(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m708(Class var0, String var1, Class var2) {
      Field var3 = m707(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m708(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m709(long var0, long var2) {
      int var4 = m704(var0, var2);
      Object var5 = f4038[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f4039[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m706(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m707(var12, var10, var11);
            if (var13 != null) {
               f4038[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m708(var14[var15], var10, var11);
                  if (var13 != null) {
                     f4038[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new IllegalStateException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = m706(1581459397508156L, 0L);
            }
         }
      }
   }

   public static Method m710(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label33:
      for (Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for (int var10 = 0; var10 < var3; var10++) {
                  if (var9[var10] != var4[var10]) {
                     continue label33;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

   public static Method m711(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m710(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m711(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m712(long var0, long var2) {
      int var4 = m704(var0, var2);
      Object var5 = f4038[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f4039[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            var11++;
            var12++;
         } while ((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for (int var16 = 0; var16 < var11; var16++) {
            int var17 = var6.indexOf(8, var12);
            var15 = m706(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m710(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f4038[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m706(1581459397508156L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m711(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f4038[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while (var29 < var13) {
                  var28.append(var14[var29].getName());
                  if (++var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new IllegalStateException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m706(1581459397508156L, 0L);
            }
         }
      }
   }

   public static MethodHandle m713(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 239 && var8 != 255 && var8 != 'Z' && var8 != 227) {
            var11 = m712(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 164) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'r') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m709(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 239) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 255) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'Z') {
               var9 = var0.findStaticGetter(var12, var18, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var18, var14);
            }
         }

         return MethodHandles.dropArguments((MethodHandle)var9, var3.parameterCount() - 2, long.class, long.class);
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName())
            .append(" : ")
            .append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null "))
            .append(" : ")
            .append(var15.toString());
         throw new IllegalStateException(var13.toString());
      }
   }

   public static Object m714(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m713(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Module216.class, "m714", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ƾ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
