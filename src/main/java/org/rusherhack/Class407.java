package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import org.rusherhack.client.api.bind.IBindManager;
import org.rusherhack.client.api.config.JsonConfiguration;
import org.rusherhack.client.api.events.client.input.EventKeyboard;
import org.rusherhack.client.api.events.client.input.EventMouse$Key;
import org.rusherhack.core.bind.BindManagerBase;
import org.rusherhack.core.bind.IBindable;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.bind;
import org.rusherhack.command.config;
import org.rusherhack.command.modules;
public class Class407 extends BindManagerBase implements IBindManager {
   public JsonConfiguration f6852;
   public Class374 f6853;
   public Class354 f6854;
   public JsonConfiguration f6855;
   public Class343 f6856;
   public JsonConfiguration f6857;
   public static long f6858 = Class066.m4320(7738529297933258000L, 8616235863776103178L, MethodHandles.lookup().lookupClass()).m4325(183467146745637L);
   public static String[] f6859;
   public static String[] f6860;
   public static long[] f6862;
   public static Integer[] f6863;
   public static Map f6864;
   public static Object[] f6865 = new Object[77];
   public static String[] f6866 = new String[77];

   @Subscribe
   public void m13190(Event090 var1) {
      this.getBindRegistry().object2ObjectEntrySet().stream().filter(var1x -> {
         return var1.m5028((IKey)var1x.getValue());
      }).forEach(var0 -> {
         ((IBindable)var0.getKey()).onKeybindEvent();
      });
   }

   @Subscribe
   public void onKey(EventMouse$Key var1) {
      int var10000 = var1.getAction();
      boolean var10003 = true;
      if (var10000 == 1 && !var1.getStage().equals(Stage.POST)) {
         Class170.f3362.post(new Event090(var1), var1.getStage());
      }
   }

   @Override
   public IKey createKeyboardKey(int var1) {
      return new Class545(var1);
   }

   @Subscribe(
      stage = Stage.ALL
   )
   public void onKeyboard(EventKeyboard var1) {
      int var10000 = var1.getAction();
      boolean var10003 = true;
      if (var10000 == 1 && !var1.getStage().equals(Stage.POST)) {
         if (var1.getKey() == 292
            || !InputUtil.isKeyPressed(MinecraftClient.getInstance().getWindow().getHandle(), 292)) {
            Class170.f3362.post(new Event090(var1), var1.getStage());
         }
      }
   }

   @Override
   public IKey parseKey(String var1) {
      return Class010.m418(var1);
   }

   @Override
   public IKey createMouseKey(int var1) {
      return new Class489(var1);
   }

   public Class407() {
      super();
      this.f6857 = JsonConfiguration.createConfiguration("binds", "modules");
      this.f6852 = JsonConfiguration.createConfiguration("binds", "macros");
      this.f6855 = JsonConfiguration.createConfiguration("binds", "other");
      this.f6856 = new Class343(this);
      this.f6853 = new Class374(this);
      this.f6854 = new Class354(this);
      Class170.f3362.subscribe(this);
      Class170.f3364.m7112().m8473(this.f6856, this.f6857);
      Class170.f3364.m7112().m8473(this.f6853, this.f6852);
      Class170.f3364.m7112().m8473(this.f6854, this.f6855);
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
   public static void m157() {
      f6865[0] = "[B7C!-[B \u001f-\"A\t \u0001-7Fxp\\|";
      f6865[1] = "\u0012\u0019v*\u00164\u0012\u0019av\u001a;\bRah\u001a.\u000f#34Ol";
      f6865[2] = "u\u0013+\u0000C,i\t)\\Y8y\nbȨ";
      f6865[3] = int.class;
      f6866[3] = "java/lang/Integer";
      f6865[4] = "\u001d*$d4\u0012\u00010&8.\u0006\u00113m))\u0015\u0017v&<#\t\u0006v0>'\u0000\u0017v\u0010>'\u0000\u0017";
      f6865[5] = "\u0010@=i7V\u001bO,&VX\u0010D(|";
      f6865[6] = boolean.class;
      f6866[6] = "java/lang/Boolean";
      f6865[7] = "M*b0NBQ0`lTVA3+}P^G6q0]GKv`hYYV++}P^G6q0UYR-q0yAG6qUYN@7dlX";
      f6865[8] = "}\u0018Sh[,a\u0002Q4A8q\u0001\u001aή";
      f6865[9] = "z}[\b\u0004lfgYT\u001exvd\u0012ɒ";
      f6865[10] = "\u0014\u0010^P\u0005\n\b\n\\\f\u001f\u001e\u0018\t\u0017\u001d\u0018\r\u001eL\\\b\u0012\u0011\u000fL|\b\u0012\u0011\u000f L\r";
      f6865[11] = "QkW/\u0013|MqUs\th]r\u001eb\u000e{[7Uw\u0004gJ7Dx\u0011l\u0010\\Fd\u000f}";
      f6865[12] = void.class;
      f6866[12] = "java/lang/Void";
      f6865[13] = long.class;
      f6866[13] = "java/lang/Long";
      f6865[14] = "jF:\u0004Sdv\\8XIpf_sŁ";
      f6865[15] = "q@2\u000fnxq@%Sbwk\u000b%Mbblzu\u00174$";
      f6865[16] = ".4wa\u0001\u00022.u=\u001b\u0016\"->\u0096";
      f6865[17] = ">\u001d7w,1\"\u00075+6%2\u0004~:164A200 \u007f\u00045 p\r\u001a\n)";
      f6865[18] = "{\u001e4\t~_\u007f\u00034\u0018c_<\f{\u000fdCf\u0003vR\u007fTx\u000fy\bc\u0018]\bp\u0019sB %x\u0016uUf'{\f4s|\u001eh\u0005";
      f6865[19] = "g%*YL\u0015{?(\u0005V\u0001k<c\u0014R\tm99Y_\u0010ay(\u0001[\u000e|$c\u0014R\tm99YW\u000ex\"9Y{\u0016m99:Q\u0015{2i<[\u0019";
      f6865[20] = "\u0006QvY,(\u001aKt\u00056<\nH?\u00141/\f\rs\u001e09GjS\u001e09\bA}\u0012";
      f6865[21] = "%\u0013APC@9\tC\fYT)\n\bȴ";
      f6865[22] = "qhxym`zgi6\u0010xi``\u007f";
      f6865[23] = "aln|s;}vl i/mu'1m'kp}|`>g0j=o(gy'\u0018r!`]f<g'ik{3u'ap";
      f6865[24] = "\u0012YWW^(\u000eCU\u000bD<\u001e@\u001eˤ";
      f6865[25] = ",H\nG\u0019o0R\b\u001b\u0003{ QC˝";
      f6865[26] = "Dn\u0007(C\u000fXt\u0005tY\u001bHwNǋ";
      f6865[27] = "TKQe)~HQS93jXR\u0018(4y^\u0017E.)bZU_1>%rjS92jWPL*9g^";
      f6865[28] = "\u0006x\u0017$/\u001c\u001ab\u0015x5\b\na^i1\u0000\fd\u0004$<\u0019\u0000$\u0013e3\u000f\u0000m^I2\u0007\u000fc\u0017\u007f/\b\u001dc\u001fd";
      f6865[29] = "78f] $+\"d\u0001:0;!/ϛ";
      f6865[30] = "\u0012V\u0002ai\b\u000eL\u0000=s\u001c\u001eOK,t\u000f\u0018\n\u00009~\u0013\t\n\u0016:y\u000e\u001eV\f-~S.Q\u0007<x\u000f\u0014F\u0000=Y\u001c\u000eA";
      f6865[31] = "TI~1bgPT~ \u007fg\u0013[17x{IT<jclWX30\u007f r_:!oznX$";
      f6865[32] = "g\u001f<G\u0001\fy\u0017&\b\\\r\u007f\u001b+K\u0001*y\f/GB";
      f6865[33] = "Mao_?*I|oN\"*\ns Y%6P|-\u0004>!Np\"^\"mkw+O27\u0016Z#@4 PX Z";
      f6865[34] = "\u0013\u0012\b\u001d#\f\r\u001a\u0012Rk\f\u0017\u0010\n\u0015b\u0017W0\u0011\u0012~\f\u0014\u0016\f";
      f6865[35] = "\u00052\u001do\u001e\u001a\u0019(\u001f3\u0004\u000e\t+T\"\u0003\u001d\u000fn\u0018(\u0002\u000bD\u0002\u0013/\b\"\u000b.\u001b&\t\u001d(!\t$";
      f6865[36] = "cR\u0010yn7}Z\n6&7gP\u0012q/,'c\u0014}$+jR\u0012}";
      f6865[37] = "t`\u0018`\u0003>hz\u001a<\u0019*xyQ\u001a";
      f6865[38] = "CcZ|A\u0001S+Y/{υ.}Mr\u001aRT.B&\u0005n@uF~G\u0014\u0013z\u0012a{";
      f6865[39] = "+lB'\tw< G5c!*.e!\u001f/ 4,p\rp hWq\u00054vR";
      f6865[40] = "q\u0016^2k7=_\u001cnWՐOBQ;:muV\u0011s,";
      f6865[41] = "0\u0019\\I3\u001d|P\u001e\u0015\u000fΒ\u000eB\u000bDb\u001cv\u0013\rH0";
      f6865[42] = "'O3\"DK#Wn#>Շ\u001e\u000fa Y\u001de\u000eid\u000f'";
      f6865[43] = "J%c\u0003qHN=>\u0002\u000bɽse1\u0001l\u001e\bd9E:$";
      f6865[44] = " ]D\u000eq@'C\u0010\u0010\r\u0015cP\u0015\nvx!VB\u0007uC`NB\r\rD{LD\faA&MFn";
      f6865[45] = "o1~WWb '.G0\u03a2^p>\u001dJ{ ?(MZ";
      f6865[46] = "-M~\u0000\u000eG-\u0014)\u001blАG\u00199\u0018\u0015\u0017$\u0015+\u001aSw{\u0012$D\u000e\u001b~O%Fl";
      f6865[47] = "`\u00113#E\u007fxO|v cb\u0005\u000erKm\u0005\u0018ybX3c\u0003:#Z\r5\u0018/r[l<\u000f1r ";
      f6865[48] = "F{\u0001t*/Gv\u0002jQ8\u0016k&k88\u0016\u0017Ggi7\u0007/@y=){";
      f6865[49] = "C\n`Gt,\u000fC\"\u001bHɐ}Q/\u000f/<\u0011\u0001'\u000e6";
      f6865[50] = "gNVd\u0015N`P\u0002zi.\u001ae2\u0004S\u0006e^\u0012<T\u00181@";
      f6865[51] = "l*\u001d-t\u0013m'\u001e3\u000f\u0004<:(%s\n6 ataU6|\u001aui\u0011`F";
      f6865[52] = "\u0010#Fb^/\u0011.E|%8@3ylTW\u0017!\u0004f\u001f,\u0016)@0%";
      f6865[53] = "\u0003zo\u0017/e\u0015o<[L6\tyKJ*5>hnJ7%\u001et\u0001M!;\u0002}dH=`\u0007\u0005";
      f6865[54] = "\u0006ovA(C\u001e19\u0014M_\u0002ez\u001471\u001beb\u0012#S\b{g\u001aMT\rq>\u001c?LS>ky";
      f6865[55] = "V\\b\u0004P>\u0000\u0002<\u001844W\u0019[\u0000P&We>\u0012\n2B^\u007f\n\n8:";
      f6865[56] = "\u001di\u001aO\u0012/Q X\u0013.ˤ#=\u0015FCu\u0019)U\u000eU";
      f6865[57] = "Fmur>'Zn+&\u0007\u0090?=,{frEn#/yNU/.og-Y=,)\u0007";
      f6865[58] = ",J\u001b\\\u0018!-S]\u0006i8tQ\u001a=V=cI\tW\n9bZf\u0007\u0019xsV^\u0000\u0007,m*VZ\u0005)hK_M\u001b)\u0013";
      f6865[59] = "\"D^N`}7[\tt>i FP\u0018\f8`\u0017\u000ftj?$X]\u0006\"?&W7";
      f6865[60] = ".{7Q$G3)8\rBTJ+5\u0003#D0x:W<x$#>\u000f~\u0002w,j\u0010B";
      f6865[61] = "\u001af\u001f\u0006N\u001dI?\u0010\u00014\u0017\u0011\u001a\u0017\u001d^\u0011\u001157\u0012Y\u0016\u000bYJ\u000bX\u0019\f8C\u001cF\u0019w";
      f6865[62] = "d\u0007!\u0018bY+\u0011q\b\u0005ӽUHq\u001fdV4IhY>";
      f6865[63] = "\u0019\u00116r\u001eK_\u0002g\u0011F_Y\u0013i}t\b\u001fM>*#LG\u001a4*ZYXM\u000e";
      f6865[64] = "3O\u0004u}=4X\f)\u0006}+S\u0000&c\u00062G\u001dwct*\u0019R\"\u0006";
      f6865[65] = "~;\u007fII\u00172r=\u0015uƌ@op@\u0018Mz{0\b\u000e";
      f6865[66] = "Ab\u00164\u0005uD~M1}wMm\u00199\u0001*`e\u0016?\u0016lji\b(\fKJst6\u001by\u001dtO1\fqA\u000f";
      f6865[67] = "\u0014/s@w\u0015\u001565\u001a\u0006\u000fV%uJ|\u0015A\"\u000e\u001a}JB75[eJHO>Fj\u001dP.7Qt\u001d+";
      f6865[68] = "8b_H,\u0015~q\u000e+t\u0001x`\u0000GFU9=^+-\u000e<cZRk\u001dm\u0000";
      f6865[69] = "Yh;\u001bI\u001d\u000f6e\u0007-\u0017X-\u001f\u001b\\x\u000e*b\u001fUCO2b\u0015-";
      f6865[70] = ";?=@30`crDUɫZ8rMl!$>v@8\\870])d`:7SUl=6%X4e*(%#";
      f6865[71] = "(n\u0013\u0012)Id'QN\u0015Ⱥ\u00166\u0010\u001boM/h\u001dZr";
      f6865[72] = "l_\fm(.{\u0013\t\u007fBxm\u001d9|+xmaXpzw|Y_n.i\u0000";
      f6865[73] = "-nb\u0004\u001a\u001fa' X&\u0015\u0013k\"\u000f[\u0015li8\u000e\u0018\u007f-+fHL\u0000/1g\u000b&";
      f6865[74] = "p,(3)[?:x#NɷA=}8-C-f!w)%";
      f6865[75] = "GL\u0015Le\u0018QN\u0014\u001b\u0003\u001dCO\u0018\u001ao/\u0017\u000eIM<x\u001f\b\u0000\u0003i\nW\b\u0002\f\u0003B@\r\u001fGxCHII}?\u0019O\u000b\u001a\u0011:DN\tx";
      f6865[76] = "2\b\u0001~\u0013(&HIh)y'TPoDY:_WrFo'PErNt]W_~H.'\u0004P*W\u00123_Tr\u0015h`P\u0000m)}l\u0001T)\u0013i,IB\u0013";
   }
}
