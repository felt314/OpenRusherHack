package org.rusherhack;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.Window;
import net.minecraft.util.math.MathHelper;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.command.clear;
import org.rusherhack.client.api.feature.module.impl.movement.Velocity;
public class Particles extends Renderer106 {
   public ColorSetting color;
   public NumberSetting<Float> radius;
   public EnumSetting<ParticlesMode> mode;
   public List<Class276> f6744;
   public NumberSetting<Float> repelradius;
   public NumberSetting<Float> maxlinedist;
   public NumberSetting<Integer> particles;
   public NumberSetting<Float> thickness;
   public NumberSetting<Float> repelforce;
   public NumberSetting<Float> bubbleexpansionfactor;
   public NumberSetting<Float> velocity;
   public NumberSetting<Float> bubbledistanceexponent;
   public long f6753;
   public BooleanSetting circles;
   public static long f6755 = Class066.m4320(-711270721999663845L, 8335539233807334084L, MethodHandles.lookup().lookupClass()).m4325(113739524156918L);
   public static String[] f6756;
   public static String[] f6757;
   public static long[] f6759;
   public static Integer[] f6760;
   public static Map f6761;
   public static Object[] f6762 = new Object[114];
   public static String[] f6763 = new String[114];

   @Override
   public void m5363(int var1, int var2, RenderContext var3, IRenderer2D var4) {
        
    }

   public Particles() {
    }

   public Class569 m12989(Class569 var1) {
      Window var5 = Globals.mc.getWindow();
      return new Class569(var1.f9138 % 1000.0, var1.f9137 % 1000.0).m17454(1000.0).m17465(new Class569(var5.getScaledWidth(), var5.getScaledHeight()));
   }

   public void m9560() {
      Particles var6 = this;
      int var10000 = Class253.m9154();
      this.f6744.clear();
      int var3 = var10000;
      Random var4 = new Random(System.nanoTime());
      int var5;
      var10000 = var5 = 0;

      while (true) {
         if (var10000 < var6.particles.getValue()) {
            Class569 var8 = var6.m12989(new Class569(var4.nextFloat() * 1000.0F, var4.nextFloat() * 1000.0F));
            Class569 var7 = new Class569(var4.nextFloat() * 2.0F - 1.0F, var4.nextFloat() * 2.0F - 1.0F);
            List var13 = var6.f6744;
            Class276 var10001 = new Class276(var6, var8).m9618(var7);
            float var10002 = var6.velocity.getValue();
            var5++;
            var13.add(var10001.m9621(var10002));
            var10000 = var5;
            if (var3 == 0) {
               continue;
            }
            break;
         }

         var10000 = 0;
         break;
      }

      label30:
      for (int var10 = var10000; var10000 < 100; var10000 = ++var10) {
         Iterator var14 = var6.f6744.iterator();

         while (true) {
            Iterator var9 = var14;

            do {
               if (!var14.hasNext()) {
                  continue label30;
               }

               Class276 var11 = (Class276)var9.next();
               var14 = var9;
               var11.m9619(0L, 0.0F);
            } while (var3 != 0);
         }
      }
   }

   static {
    }
   public static String m171(byte[] var0) {
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
   public static void m786() {
      f6762[0] = "/sWp\u0011a3iU,\u000bu#j\u001eӉ";
      f6762[1] = "\u0014\f-U\u0013_\b\u0016/\t\tK\u0018\u0015dΡ";
      f6762[2] = "Io#\u0004\nsUu!X\u0010gEvjI\u0017tC37O\frOs#\u0004=hSp\u0017O\frOs#";
      f6762[3] = "3h\u0016Cj/8g\u0007\f\u000b!3l\u0003V";
      f6762[4] = boolean.class;
      f6763[4] = "java/lang/Boolean";
      f6762[5] = "\u000f?,f8\u001b\u0013%.:\"\u000f\u0003&e+%\u001c\u0005c8->\u001a\t#,f\u0019\u000b\u00149\"&-";
      f6762[6] = "\u0007\\\\6&\u000b\u0019TFyA\n\bOK#g\f";
      f6762[7] = "I~Sf* UdQ:04Eg\u001aպ";
      f6762[8] = double.class;
      f6763[8] = "java/lang/Double";
      f6762[9] = "^QNlZ}BKL0@iRH\u0007!GzT\rZ'\\|XMNlf}\\AL0{mEW@,O";
      f6762[10] = "IU\u0013P\u000b/UO\u0011\f\u0011;ELZɸ";
      f6762[11] = int.class;
      f6763[11] = "java/lang/Integer";
      f6762[12] = ",V*^8_0L(\u0002\"K Oc\u0013&C&J9^+Z*\n>\u0015>^*J*^\tE/K?#/^7M#\u0017";
      f6762[13] = "u\u0018}1\u0006Ei\u0002\u007fm\u001cQy\u00014ȴ";
      f6762[14] = float.class;
      f6763[14] = "java/lang/Float";
      f6762[15] = void.class;
      f6763[15] = "java/lang/Void";
      f6762[16] = "JG=)\u0016KV]?u\f_F^td\u000bL@\u001b)b\u0010JL[=)&QJY?f\nm@A.n\nY";
      f6762[17] = "[d\b'+\u0003Pk\u0019hC\u0003^d\n";
      f6762[18] = "%\u0013\u0001k-\u00139\t\u000377\u0007)\nHȱ";
      f6762[19] = "iAm'\u0000Ou[o{\u001a[eX$j\u001eSc]~'\u0013Jo\u001dxl\u001c^cA$@ _hWo{\u0017H4w";
      f6762[20] = "=t}e\u0007V#|g*eJ$a";
      f6762[21] = "\u001dA7@\u001d\u0000\u0001[5\u001c\u0007\u0014\u0011X~\r\u0003\u001c\u0017]$@\u000e\u0005\u001b\u001d\"\u000b\u0001\u0011\u0017A~<\n\u001b\u0016V\"-\u0000\u001b\u0006V(\u001a";
      f6762[22] = ">\u0015_JaY>\u0015H\u0016mV$^H\bmC#/\u001fQ4\u0007";
      f6762[23] = "\u000bu\u001a{\u0006*\u0000z\u000b4a(\u0015q\u000b\u007fZ";
      f6762[24] = "X}>&HZEhf\u0004\tW]n";
      f6762[25] = "#\u001d6qzB#\u001d!-vM9V!3vX>'qj$\u0019";
      f6762[26] = "\"\nl\b]^>\u0010nTGJ.\u0013%E@Y(V~RFG>VHICD?-\u007fOCX";
      f6762[27] = long.class;
      f6763[27] = "java/lang/Long";
      f6762[28] = "\u001b\n50jN\u0010\u0005$\u007f\u0006M\u001e\u0007&0*";
      f6762[29] = "\u007fxA+v\u0017cbCwl\u0003sa\bfh\u000budR+e\u0012y$T`j\u0006ux\bLV\u0007~nCwa\u0010";
      f6762[30] = "?\u001cjw\\\u00034\u0013{8?\u000e!\u0015";
      f6762[31] = "d#p\u000eO=o,aA2(}6c\u0002";
      f6762[32] = ".lC\u0001\u001b\u00122vA]\u0001\u0006\"u\nß";
      f6762[33] = "9\u001b\u001d>\u0018j\u0010\"\u0001$\u001a6\n6\u0011'Q'\r%\u0017b\f!\u0016#\u001b\"\u0018j12\u00068\u0016*\u0005l";
      f6762[34] = "\u000249\u001f)\u0003\u001c<#Pa\u0003\u00066;\u0017h\u0018F\u0017 \u0011k\u0013\t;\u001c\u000bw\u0006\u0004<*\f";
      f6762[35] = "XZnZH.D@l\u0006R:TC'Н";
      f6762[36] = "T3\u000e\u0011H8_<\u001f^5 L;\u0016\u0017";
      f6762[37] = "sYUAFOoCW\u001d\\[\u007f@\u001c\fXSyEFAUJu\u0005G\u0006\u001aMuEV\u0000C\u0014KB\\\u000b[MJBW\u0018|[rO^\nFx}XW";
      f6762[38] = "o\u0013$,s+q\u001b>c;+k\u0011&$20+1=#.+h\u0017 ";
      f6762[39] = "\u000f&k\u0000<\t\u0011.qO@\u001d\u000b#r\f";
      f6762[40] = "$Q\f\u0011w`$Q\u001bM{o>\u001a\u001bS{z9kK\u000e*";
      f6762[41] = "MZ`\u000bw\u0010MZwW{\u001fW\u0011wI{\nP`%\u0015.H";
      f6762[42] = "|\u0018\u001c\u0004eF`\u0002\u001eX\u007fRp\u0001UI{Zv\u0004\u000f\u0004vCzD<FxQr\u0006\b";
      f6762[43] = "-Z\u0004x\u0018L/\u0001\u0003#f\u000b'\u0004G$!\u001bN[\u0007(_\u001f4\u0011EtWu-Z\u0004x\u0018L/\u0001\u0003#f";
      f6762[44] = "B()xBW\\3*Fϓ6\u0007,+/\u0014\\\u0006=3)/\u000b[69}E\nJ.?F";
      f6762[45] = "\u001c,$\u000b\u0016N\u000406BoC\u00127!\u00061D\u0012-%z\u0006\u0016\f)#G\u0006H\u000b3H";
      f6762[46] = "!v?\u007f\u00140?m<AѪQ0q|x\u0004;&n$1y";
      f6762[47] = "\u0000\u0007z^Co\u0019\u0007k\\-Ӥe\u000ev\u0005M/\u0007U-AU\u001f\f\n-\u0002Pu\u001a\u0015uK-";
      f6762[48] = "4/\u001a24\u0003w1B-\u000f\u0004g3!3t\u001e`.\u001b3s\u000e\n)\u0001b0\u001d7#\u001fos\u007f4/\u001a24\u0003w1B-\u000f";
      f6762[49] = "P\u0015]'E\b\f\u0018\u0000by\tFL\u001bR\u0018\u001fWA\t\u0019D\u001e\rG\u0002#\u0012\u0017^Gd$\u0002T^C^r\u000b\u0007^%YbH\u0007Z\u001f\u000fk\u001b\u0007<\u001a\u0018c\u0002\nU_\u0001z\u0013eUG^ \u0004\u000fCX\u0006iy";
      f6762[50] = "6\u0013\u0007^b\u00159O\rOS\u0010:N\u000fz2\u0013>(\tZh\u0017.LV\u001a>\tS";
      f6762[51] = "-\u0002i*5\u0007-\t;}J\b:\u0015*].\t>\u0019Vzq\u0014.\u000ekz/\u00134e";
      f6762[52] = "IM9\u00133=\u001f\\j\u001cM1A^l\u0016M3G\t<\u0011'%XQul";
      f6762[53] = "Q#\u001bq\r\u001aE0\u0018M jQ#\u001bq\r\u001aE0\u0018";
      f6762[54] = "\u0003\u007f\t\u0004WM\u0007\u007f\u0014]<G\n>6\u000eX[\u0001BW\u001bF]\u0003+\u0012\u0002_Ll";
      f6762[55] = "C\u000b\u0012J\u001dD[\u0018I\u0013&AN\u001dw?l.\u001c\u001dW\u000bIGY\u0004N\u001a&";
      f6762[56] = "x\u0005X?\r@f\u001e[\u0001ѿ!>\u0000Da[]}\u001e\u001c~";
      f6762[57] = "A*\u0003+\u00010W\u007f\u001br|w8mGv\u0007aZ*\u001ax\u0016[@(\u001fhF9\u0007u\u0011y|";
      f6762[58] = "i\u0014\u0019p\u000bg5\u0019D57`hKA(7da\u001a\u0010<\u000f2`\u001fNN^h?\u001d]$HwgT ";
      f6762[59] = ".||eyx-lze\u0004x#{c8hJw:8b<\u001ds|2=b'%ua=\u0004 56a9>v<ea_9f\u007feeeoo,e\u0003b\u007f,,a94v\u007f,\u0007";
      f6762[60] = "\u0003\bLHyJ\b\tMR\u0013Ѓ2\u0005J\u0010rTVZ\nFl)[_LRx\u0014[\u0001KH\u0013@P^\u000fVyVO\u0006F+";
      f6762[61] = "k&ry.\u0011j7j\u007f\u0015ƬVzr!w\u001dl,{rw";
      f6762[62] = "~\u0018c,4 \u007f\t{*\u000f\u0099CDctm,y\u0012j'mJ~\u0018c,4 \u007f\t{*\u000f";
      f6762[63] = "-4b\u0000\u000353/a>ȻT4- _\u00130kmvA";
      f6762[64] = "\u0003\u000e>\u001enaE\u0012f\u001a\u00114\u0014b \u0018unE\u0010#\u0014 0";
      f6762[65] = "|3\u0002\u001eI#2-L\u0019;\")&{KK>@f\u0000G\u0002(:,B\u001b\nB";
      f6762[66] = "b+{7\u000b\bkb|;e\u0012t'\"3\t %fzneHe!9;\f\r|8(T";
      f6762[67] = "B&C\u0001\u0011NV5@=\u001bGS5\u0019Fv\u0004A<\u001d[\u001a]\u001f>\u0013=M\u0003Oe\u0017G\u0007A\u0013m}";
      f6762[68] = "HR5';OW[+\u007f\u0003OL\\Qxx\u0006IEk.qUI#l>2UM\u0019:7aU+\u001e*taQ\u0011H#'a7";
      f6762[69] = "Npbk@\u001f\u0000n,l2\u0018\u001fn!S\b\u0011\u0012~;?QO\u0010p]";
      f6762[70] = "\u00060\b8\u001eK\u0007!\u0010>%α;l\u0012*L\u001aQm\u00032J!\u0006*B3C\u001bP#\u00113%";
      f6762[71] = "<\u0001\u001cR:%j\u0010O]D+<\u0013 \u0017+\"0\u0019LNu >\u007f\u001b\u0010%{:\u0005QRysP";
      f6762[72] = "#XmK G=CnuѨ&e]q\u0015vZ&C)\n";
      f6762[73] = "]&<Vh^\u000e..\u0014Qɫb}?S*]\u000b8&J;2";
      f6762[74] = "\u0013}G\u001dC\u001d\rfD#ɶ|Ux[C\u0015\u0000\u0016f\u0003\\";
      f6762[75] = "8\u0017\u001eb\u0018u&\f\u001d\\\u000e\u0014p\t]&\u001e+&\b\u001d5";
      f6762[76] = "r\\@\u0013<&y]A\tVȾC\u000fF\n-**J_\u0013<E|L@\u000b9,9UY\u001aV,xJC\u001bk,&MYp?'y\tG\u001a)8!@:";
      f6762[77] = "b\u001dL!<\u001d|\u0006O\u001fӱ|p\u0019\bs3@&\tH|";
      f6762[78] = "o)8d\fY{:;X&)o)8d\fY{:;";
      f6762[79] = "QGv/\u000b\u0017O\\u\u0011\rvBS5 \n\u0013BZttf\u001dX\u0018>}\u0003\u001dQYj\u0011";
      f6762[80] = "?\u007fR\u0014\n\u000e4~S\u000e`Т\u000e.SF\u0002\u000b4xZ\u0015\u0002m?\u007fR\u0014\n\u000e4~S\u000e`";
      f6762[81] = "S\nDhVoZCCd8uE\u0006\u001dlTG\u0014FM58/T\u0000\u0006dQjM\u0019\u0017\u000b";
      f6762[82] = "01\u0015{L\u0002.*\u0016EƋc$*P:_\u0004r;\u00035";
      f6762[83] = "~\t\u001d\"!{`\u0012\u001e\u001cҶ\u001a8\f\u0001|wf{\u0012Yc";
      f6762[84] = "\u0013,\u001d\u0019$dE=N\u0016Zl\u0012.!Y&y\u0004=H\u001c?`\u0015R\u001b\t:c\u0019>BW8m\u007f";
      f6762[85] = "\u000b\u0006S.ve\u000f\u0006Nw\u001dp\r_O Z`d\u0004N7fa\rAW.w\u000e\u000b\u0006S.ve\u000f\u0006Nw\u001d";
      f6762[86] = "Yr$\bJBAn6A3_Zj5\u0014tO3gs\u0003JJ\u000eg-\u0004P!Yr$\bJBAn6A3";
      f6762[87] = "\u001d1,\t4G\u00160-\u0013^Ȅ,`7\u00117\u001fFa&\t1$\u001d1,\t4G\u00160-\u0013^";
      f6762[88] = ";GJrT_j\u0005Yx?_<\u0004UvVC\t\u001fBtD'<ESnT\u001a<\u001bTt?";
      f6762[89] = "\u001b\u001d\b$\u001c;J_\u001b.w;\u0012_\u0006A\u0019'K\u0014\u0019yO&NJk";
      f6762[90] = "\u0018\u00074 \"GF\u001e'>\u0012Ƨ\u007f\u0007h+iE\u001d@5%x\u007f\u0007B05(\u001d@\u001f>$\u0012";
      f6762[91] = "u,\u0003\u0011{4k7\u0000/ɈU3)\u001fO-)p7GP";
      f6762[92] = "\bY7^7>\tH/X\fӗ5\u0005-Leo_\u0004<TcT\bY7^7>\tH/X\f";
      f6762[93] = "-=3aF))=8;'?{=\f9C-{Ah?G0p-1aE>\u0016";
      f6762[94] = "wa\u001e8^wiz\u001d\u0006ɲ\u00161d\u0002f\bjrzZy";
      f6762[95] = ")L#V9\u00161_x\u000f\u0002#\tg@!\u0002\u001c#\u0019&Wh\u00040B\u007f";
      f6762[96] = ".\u0011\\\u0012O:0\n_,Ѫ[h\u0014@L\u0019'+\n\u0018S";
      f6762[97] = "iJvuTKjF#+n\\\u007f[r-\u0002n(\u001d,zU9iW+)\u0000F`\u001e,%n";
      f6762[98] = "8yK\u0011I>dt\u0016Tu?. \rk\u001459IOTD12s\u0019]\u00171Tt\t\u001e\u00175n\"\u0000M\u0017Si2CM\u0013i?;\u0010Mun/x\u0010IO8&+\u0010/\u001ch.0\u0019\u0012\u001c6)*r\u0010\t)/&\u001bU\u00100>I\u001bMOj)#\rR\u0017#T";
      f6762[99] = "N\u0015 /rq\u0018\u0014`<\u00195\u0013\u0012S1a.\u0017'~1~1\u0013\u0002\u001an$/G\u0004`$fsOn*.#4\u0015Q|/c'~";
      f6762[100] = "\u001cEC$!zFRZzM:\u0007IN85/\u0007MN(<F\u001dJ\u0017yv,\u0005YL My\u0001ZS,$<\u0018CBC-,B\u001a\u0013)5?\u0019C(";
      f6762[101] = "m\u0002\u0000kyo.\u001cXtBt5)\u0005b$|>b\u001ct9j1\\\u0004i3tS\\\u0005n\"(/\u001f\u001b6=\u0013";
      f6762[102] = "4E2@G\u000ebTaO9\b$VtVE\u000e\";2Q\u0006Q*Z|OHVX";
      f6762[103] = "@044\u001a]^+7\n\u0011<\u00065(jL@E+pu";
      f6762[104] = "xKO)\u0005\u001d;U\u00176>\u0000 @P$[\f WC->\\=\u001aH/\u0004\n4IHI\u0000\u0001#K\u00115C\u001f{T*";
      f6762[105] = "7<{\u001c\u0010&a=;\u000f{vj;\u001f\u000f\u001fdjG!\fD#<-9\u001f\u001fz\u0007";
      f6762[106] = "\u0003&p[Y\"\u0001}w\u0000'q\u0007{*\u0007N}>u*\u0017J\u001b[!/SMa\u0011cs['";
      f6762[107] = "^B\b@/>@Y\u000b~Ȑ_\u001c\u001d\u001dEr$\u001bZ\u0010\u001e";
      f6762[108] = "$-dx3r$1\u007f{^'!-\r.<p~<g8#(7A";
      f6762[109] = "\tN\u0004\u0002\u001fE\u001d]\u0007>\u00175\tN\u0004\u0002\u001fE\u001d]\u0007";
      f6762[110] = "&E,\u0013\u001c\b8^/-Ɍi`@0MJ\u0015#^hR";
      f6762[111] = "a[[',njZZ=FՆP\n@?/6:\u000bQ')";
      f6762[112] = "\u0012#w\"F(\u001d\u007f}3w \nbb7\u00117+y}72*\u0013|y!w*\u000b#y'\u0013uKugZ";
      f6762[113] = "\u0010*U\u001c\r\u0010\u0011;M\u001a6ţ-vUDT\u001c\u0017 \\\u0017T";
   }
}
