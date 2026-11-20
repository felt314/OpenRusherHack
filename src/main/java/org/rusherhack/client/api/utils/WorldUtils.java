package org.rusherhack.client.api.utils;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Predicate;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.chunk.WorldChunk;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.world.IMixinClientChunkCache;
import org.rusherhack.client.api.accessors.world.IMixinLevel;
import org.rusherhack.core.setting.Setting;

public class WorldUtils implements Globals {
   public static Setting[] f1128;
   public static Object[] f1130 = new Object[105];
   public static String[] f1131 = new String[105];

   public static List<WorldChunk> getChunks() {
        return null;
    }

   public static List<Entity> getEntitiesSorted(Entity var0, Predicate<Entity> var1) {
        return null;
    }

   public static List<Entity> getEntities(Predicate<Entity> var0) {
        return null;
    }

   public static boolean checkCollision(BlockPos var0) {
      return checkCollision(var0, VoxelShapes.fullCube(), null);
   }

   public static List<BlockPos> getCircle(Vec3i var0, float var1) {
        return null;
    }

   public static List<BlockPos> getSphere(Vec3i var0, float var1) {
      return getSphere(var0, var1, null);
   }

   public static List<Entity> getEntitiesSorted() {
      return getEntitiesSorted(Globals.mc.getCameraEntity());
   }

   public static boolean checkCollision(BlockPos var0, VoxelShape var1, Predicate<Entity> var2) {
        return false;
    }

   public static boolean isReplaceble(BlockPos var0) {
      return Globals.mc.world.getBlockState(var0).isReplaceable();
   }

   public static List<Entity> getEntities() {
      return getEntities(null);
   }

   public static List<BlockEntity> getBlockEntities(boolean var0) {
        return null;
    }

   public static List<Entity> getEntitiesSorted(Entity var0) {
      return getEntitiesSorted(var0, null);
   }

   public static List<BlockPos> getSphere(Vec3i var0, float var1, Predicate<BlockPos> var2) {
        return null;
    }

   public static void m2659(Setting[] var0) {
      f1128 = var0;
   }

   public static Setting[] m2660() {
      return f1128;
   }

   static {
    }
   public static void m194() {
      f1130[0] = "\u0006mg\u0012(\u0010\u0006mpN$\u001f\u001c&pP$\n\u001bW\"\u000e|N";
      f1130[1] = double.class;
      f1131[1] = "java/lang/Double";
      f1130[2] = "\u007f}y{\u0002Aauc4e@pnnnCF";
      f1130[3] = "\u0011\u0000\r\u0010\u0010K\u001a\u000f\u001c_qE\u0011\u0004\u0018\u0005";
      f1130[4] = "]j<J#sCb&\u0005AoD\u007f";
      f1130[5] = boolean.class;
      f1131[5] = "java/lang/Boolean";
      f1130[6] = "Y47z\u001b\\E.5&\u0001HU-~7\u0005@S($z\bY_h% \u0000EEh\u0007;\u001bER\u0013$=\u0005Z";
      f1130[7] = "J\u00120k!)V\b27;=F\u000byȱ";
      f1130[8] = "e\u001dB\u0004\u0010-n\u0012SKw5j\u000eU\u0007R$";
      f1130[9] = "\u0019\u007fO\u0000~7\u0019\u007fX\\r8\u00034XBr-\u0004E\u000e\u001b$i";
      f1130[10] = ",k72\n*0q5n\u0010> r~\u007f\u00146&w$2\u0019/*71\u007f\u001b:0j?n\u000bq4v\"p\u001cq\nT9d\u00111\u000f|&y\u0014";
      f1130[11] = ";m\u0016wK 'w\u0014+Q47t_:U<1q\u0005wX%=165V75s\u0002";
      f1130[12] = "z;v\u0013wYz;aO{V`paQ{Cg\u00011\f*";
      f1130[13] = "lE;}\u0000\nE|'g\u0002V_h7dIGX{1!\u0014AC}=a\u0000\ndl {\u000eJP2";
      f1130[14] = "#vwM0Z#v`\u0011<U9=`\u000f<@>L5Pe";
      f1130[15] = "@\u001et@S\u001b^\u0016n\u000f\u001b\u001bD\u001cvH\u0012\u0000\u0004/pD\u0019\u0007I\u001evD";
      f1130[16] = "8EEHG5$_G\u0014]!4\\\f\u0005Z22\u0019Q\u0003A4>YEHf%#CK\bR";
      f1130[17] = "\u0018Sk\u001c\u0005|ms`\u0013\u00143\u0010ks\u0014\u001dzx";
      f1130[18] = ")H2e-p)H%9!\u007f3\u0003%'!j4ru~s+";
      f1130[19] = int.class;
      f1131[19] = "java/lang/Integer";
      f1130[20] = "N2EwjaE=T8\tlP;";
      f1130[21] = float.class;
      f1131[21] = "java/lang/Float";
      f1130[22] = "\bRi\u0006K\n\bR~ZG\u0005\u0012\u0019~DG\u0010\u0015h/\u001b\u001eQ";
      f1130[23] = "\u0011P-\u001bOW8i1\u0001M\u000b\"}!\u0002\u0006\u001a%n'G[\u001c>h+\u0007OW\u0019y6\u001dA\u0017-'";
      f1130[24] = void.class;
      f1131[24] = "java/lang/Void";
      f1130[25] = "\u0002\u000bO!pm\u0002\u000bX}|b\u0018@Xc|w\u001f1\t<.<";
      f1130[26] = "\u0003>f\u0013\u0005l\u0003>qO\tc\u0019uqQ\tv\u001e\u0004 \u000bP5";
      f1130[27] = "\u0006Qcuv\u0011\u0006Qt)z\u001e\u001c\u001at7z\u000b\u001bk%o(";
      f1130[28] = ":KVq]\u0014:KA-Q\u001b \u0000A3Q\u000e'q\u0010j\bK";
      f1130[29] = "\u0003l|d(O\u001ddf+EU\u0004}kwgN\u0006\u007f";
      f1130[30] = "\u0007mQ\u0002#:\u0019eKMk:\u0003oS\nb!CXH'b:\u000f`B%x!\u000exN\fc";
      f1130[31] = "{\u0000\u0005O\td{\u0000\u0012\u0013\u0005kaK\u0012\r\u0005~f:GRU)v\t\u0010\u0012\u0017R&SIP";
      f1130[32] = "}gk)Bqcoqf\u000fkyeh:\u001eayr3)\u0018kzo~f-pxkt+>aqco-\u0002grGo:\r}";
      f1130[33] = "\u0017Nq\u001b\u001d9\u000bTsG\u0007-\u001bW8V\u0003%\u001dRb\u001b\u000e<\u0011\u0012wV\f)\u000bOyG\u001cb\u000fSdY\u000bb1q\u007fM\u0006\";P\u007fP\u00018;Tc[\u0004\u000f\u0019_~P";
      f1130[34] = "@\u0007N\u0001\u0000\u000f@\u0007Y]\f\u0000ZLYC\f\u0015]=\f\u001c\\";
      f1130[35] = "|j~:<@bbduAPb";
      f1130[36] = "?TM\u0016#*?TZJ/%%\u001fZT/0\"n\u000b\u0000\u007f{";
      f1130[37] = "\u0019\u0014{g\u0003\u0017\u0007\u001ca(`\u0003\u0003";
      f1130[38] = "v\u001136E+h\u0019)y&?lT\u00009\u001f,e";
      f1130[39] = "^D'V1y^D0\n=vD\u000f0\u0014=cC~aMe";
      f1130[40] = "mEw\u0011v$mE`Mz+w\u000e`Sz>p\u007f1\t.";
      f1130[41] = "6\u001d+|\u0004S6\u001d< \b\\,V<>\bI+'maQ";
      f1130[42] = "\u0012G(4T\u0013\u0012G?hX\u001c\b\f?vX\t\u000f}n.\u000e";
      f1130[43] = "^\\]U(v]\r\u0006E\u0019hEZBBenC7\u0001[w0GNCA%x9";
      f1130[44] = ")c\u000fmrb(&\u001bs\u001b;%>vgv`\"'\u0014y}3#X\u001af%8;:\u0004mv9D4\u001b5}!&*\u0010f|^";
      f1130[45] = "ekIF\u007f6&l\u0019IO\"rz@Q#\u0010&>\u001f\u0006O<~<O\fvx{xJ64~!mRW/=$a ";
      f1130[46] = "U3~\u0012\u0001{A#|pQ*U<j'\u0005p\b`9p\u0004/C\"x\u0001\u00031F!";
      f1130[47] = "LP\r!\u0010\"EF]<+?DLS&K[EG\u0002<T9[LQ=+";
      f1130[48] = "Kxc\u0004sw\u00183w\\\u0015o\u0016~xYy]B?&\u0006\u0015g\u0010zz\u0000%s\u0000x\u0018";
      f1130[49] = "g\u0016?\u0014g\\b\u000fa\u0011\u001fEc\u0015&\u0012eOb\u001f\u0012\u001cbD`\u001d^\u0018bD5\u00170\u0000c\u001eap=\u001d~A|\u00028\u0004 D\u0004";
      f1130[50] = "=\u001e\u001am\u0018Xa\u0005\u00194x^a\u001b\u001c1\u0014l<\\GkxVg\u001f\u001ehHBw\u001d|-\u0019\u0001c]Ei\u001cEfgGm\u0005\u0007sY\u0018(\u0003W\f";
      f1130[51] = "j1k&Dqz5y6=%g+t Q\u00173o.y\u0006@f:*!B\"x1y =";
      f1130[52] = "*uR@#\u001cy>F\u0018E\u000f{bM\u0016\u0012X$?\u0016zt\u0018|4I\u0019(\u0003\u007fm";
      f1130[53] = "I0\u0014\f\"\u0005\u0019l\u000bPAҫu?\u0002\u0001;\u001f\u0010;X\u001f=f\u001a*U\u0002}W\u0011)\u0003_A";
      f1130[54] = "XR@'EKLBBE\u001e\u0016IY_),F\u0005\u0004\bE\u0016\u0010M[\u0006u\u0002\u0000O9J{\u0016\u0012H\u0006C&\t{";
      f1130[55] = "a\\O\u001a\"khJ\u001f\u0007\u0019}iZ~\rt,bY\u001c\u0013\u007f\u007fc&D\f$#|\u001f\u001f\u0010%n\u0004";
      f1130[56] = "gp\"bb\u0011|3'n\u0010\u0015q5|n|'%p$6\u0010\u000b}ss3)Ox7v\t";
      f1130[57] = "w\u001c;7zx$\u001ag?\u0013<s\u0005+\u0007)-#O/>r1\"\u0002W<w;d\u0000&;i>g~";
      f1130[58] = "\u0006Wj\u0006 ,\r[j^B5\u0005[kZ.\u0007Q\u001f1\u0003~P\u0004J5[=2\u001aAfZB";
      f1130[59] = "\r:_\"#sSv['Az\u0001vZ8-HP7\u0006`}\u001fWnA%?nPpD&A";
      f1130[60] = "hP\u001b\u0016Ch8\f\u0004J d9L*\u001c\\j(Q\n\u0001{l.L\n\u0016 f?H\u0005D\u0010r/JgA\u001bvhOY\u001e^p80";
      f1130[61] = "+d`:]F%:ig>ՃAa\"z_\u001e/`c>P\"";
      f1130[62] = "Zm5!%z\u0019je.\u0015nM|<6y\\\u00198cn\u0015p\u0019>7#tkZ;;Q";
      f1130[63] = "z\u001bWK{b.\u0002Q]\u000b6|\u0015SFg\u0004*U\u0002\u001c7S}\u0004\rGt1c\u000f^F\u000b?|WU^i!w\u0004T!";
      f1130[64] = "lJ\u001dV$!+\u0016\u0013]\\~.\u001b\u0006O x(vEV2&,\u000f\u0007L`nR";
      f1130[65] = "U\u0003ba=\n\u0012C?3T\u0010\u0006\u0007ae8\"PB1:ouUG`r,K\u0012\u001bnyT";
      f1130[66] = "(Vn6p3)\u0013z(\u0019j,\u001d\u0017<t1#\u0012u\"\u007fb\"m{='i:\u000fe6thE\u0001zn\u007fp'\u001fq=~\u000f";
      f1130[67] = "[6\f,Dx\u0007-\u000fu$~\u00073\npHLP~Q*$|Q0\u0014gYi\u000f&\u0001\u0017";
      f1130[68] = ";Hw^\u0019xoQqHi,=FsS\u0005\u001ei\u0007(\u0004WI=E~X\u000f1>VrWi%=\u0004uK\u000b;6Wt4";
      f1130[69] = ".,_{2\u0015(*Bg\u000eJzR\u0010\u007fu\u0015w/C4aM";
      f1130[70] = "E0SD\u0017>\u0019+P\u001dw8\u00195U\u0018\u001b\nOp\u000bGH]\u0018$\u000b\u0019\b?\u0006/X\u0018w";
      f1130[71] = "\u000eh\u0007xP'\u0014u\u0006;>1\u001am9+Z#\u001a\u0011]/\u0003o\u000f(\u00063\u0002\"w";
      f1130[72] = "g\u000eG\u001e*U7RXBIУ[\u0001Q\u00133O>\u0005\u000b\r56";
      f1130[73] = "h)_4HusjZ8:q~l\u00018VC*(Pa:f-}\b\"\u0005opba-\u0004yzm^$Yf\u0013b_2Si,k\u0002-:o*.\n-[ti+\u0006_";
      f1130[74] = "\u0004f\u0013v!W\u0002wNuP\u0001\u0019qMk\u0007VF,\u00189P\u0013\u0002&Xvh\u0015\u0013{[";
      f1130[75] = "e{:?c\u0002nw:g\u0001\u001bfw;cm)23a::~gfeb~\u001cym6c\u0001";
      f1130[76] = " j\u000b#4Bcm[,\u0004V7{\u00024hdc?]o\u0004Hc9\t!eS <\u0005S\u007f\ndl\u00102dIa`b/~\t+vZ)oT(\u0007Y7\u007fI$v^)zJZ";
      f1130[77] = "-\u0014/\u001bW\u001ao\u000e}S)\u0003}\u001f\u0007OY\u001f\u0014_%YS\u001deX;\\Pc";
      f1130[78] = "\u001exE:?V\nhGXd\u000b\u000fsZ4V_B.\u0006h\u0001\u0007\no\u00024;\\\u0012pQX";
      f1130[79] = "q\f5\u0003\u0003&a\b'\u0013zr|\u0016*\u0005\u0016@(Rp\\F\u0017}\u0007t\u0004\u0005uc\f'\u0005z";
      f1130[80] = "zR#;TP Lw:mRuVyc\u0001`!\u0013!=S7xLfe\u0014\u0006hHtum";
      f1130[81] = "K\tj)\u000e\u0006\u001bUuum\n\u001a\u0015[#\u0011\u0004\u000b\b{>m\f\u0015\u0005&,U_\u0013Y.EV^\nUi{\t\u001b\f\u0005\u0016";
      f1130[82] = "kyF\u001db1;%YA\u000197tQ\u0012J53}[\n`51\u0019Z\u0017~3.(J\u0013l#Wb\u0003Oj 6y@JfR>{VAhjm}\nI\u0001i3b@\u000fpn-gCq";
      f1130[83] = "\u0017\bdvPrU\u00126>.mC\bvO\u0014f\u0013IrvOz\u0012\u0004\n";
      f1130[84] = "Xun[IG\u00070h\u000b6\u0010\u000f\"\u0013][DR6*\u0006GE\u001fN(\u0003M\u0003\u001d?/\u001dH\u0000c";
      f1130[85] = "m d~ml=|{\"\u000efQ}%.g5h*{jo\u000fl}${46;#`s\u000e";
      f1130[86] = "b+\u00102`;>0\u0013k\u0000=>.\u0016nl\u000fhkH18X??Ho\u007f:!4\u001bn\u0000";
      f1130[87] = ">0%|uwnl: \u0016{o,\u0002hvyx=Y~fu92%ujuaP4o{xd(7|ww\u00029;|&}:j= .\u00149k$,i*f.\"|\u0016";
      f1130[88] = "LYD\u0003!DQ\u0004@\nNQG\u0014z\u0006)DC\u0007Lz*[\u0015\u0017[\u0015+\u000eX\u001a!";
      f1130[89] = "P iu\u0000VD0k\u0017[\u000bA+v{i[\rq \u0017E\u0007\u0007$+.\u0001\u0002C!\u0011";
      f1130[90] = "_668\u0001QT:6`cH\\:7d\u000fz\b~m=[-]+ie\u001cOC :dc";
      f1130[91] = "%l\u001b\u0010v\u000b1|\u0019r-V4g\u0004\u001e\u001f\u0000q;SKH\u0000,|\u0019\f9\u00072y\u001ar";
      f1130[92] = " ^p9F\u0017{Foj*H,[laFzx\u001f6<*L8[3j\u0010\u0017 D`\u0006X\u0013,Nq9QN3'";
      f1130[93] = "\u007f]#W#Yd\u001e&[Q]i\u0018}[=o=]$\u0004Q\u0003`\u001fgB \u0004~\u001ad<";
      f1130[94] = "RK&\rf-\u0002\u00179Q\u0005!\u0003W\u0017\u0007y/\u0012J7\u001a^)\u0014W7\r\u0005#\u0005S8_57\u0015QZ\bg\"^Bb[a~V+aZxr\u0011\u0015>\u001f~\"n";
      f1130[95] = "Zo\u007f\u0017I*[:2\u001a3+_g$\u0004d|\u00000}Q3 D;;SJ)Rk&";
      f1130[96] = "tLW\u001eE\u00115\u0011G\u0019>\na\n[@R85L\u0001\u001e\u0002ot\u0004Q\u0016^\u001ecHRX>";
      f1130[97] = "H\u001a\u0013Eu7_V\u0010\u000b\u0015+V\u0014\u0003\u0005N+Lh\u001e\u001fp8\u0001\u0017\u001dN+(0";
      f1130[98] = "\u0000kk'\u00166\\ph~v0\\nm{\u001a\u0002\u0001)7$v5WmleG%S\u007f|\u001c\u0017eToopI)Pj\r";
      f1130[99] = "5Z:M\u000bsh\u0019ePhmg\u001e\u0017O\u0014cv\u00037Rh<r\u00019@\u0017{2\\k)";
      f1130[100] = "7qP\u0007f7h4VW\u0019rk0Q;zom%UI\u007fv3 -Tc4nv\u001c_`b3J";
      f1130[101] = "\u0018?\u00195h7Gz\u001fe\u0017h_i\u001e`knY\u0004]yy0]}\u001fc+x#";
      f1130[102] = "-C\u0011ScE}\u001f\u000e\u000f\u0000I|_&_}@rXm\u0004;[-\\S[~]}#";
      f1130[103] = "/\btW\u0006V?\ffG\u007f\u0002\"\u0012kQ\u00130sP6\u000bOg.\u0017w\t\u0013]u\u000fhZ\u007f";
      f1130[104] = "~~E</\u001dnzW,VIsdZ::{' \u0000cn,ru\u0004;)Nl~W:V";
   }

   public static org.rusherhack.core.setting.Setting[] \u041d() { return new org.rusherhack.core.setting.Setting[0]; }
}
