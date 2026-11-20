package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.ButtonWidget.Builder;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.gui.IMixinAbstractContainerScreen;
import org.rusherhack.client.api.accessors.gui.IMixinScreen;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.client.screen.EventScreen$BuildButtons;
import org.rusherhack.core.event.listener.EventListener;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraChest;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraChestMode;
public class Class182 implements EventListener {
   public ButtonWidget f3555;
   public ButtonWidget f3556;
   public ExtraChestMode f3558;
   public static long f3559 = Class066.m4320(1280693732542945611L, -607479101261342685L, MethodHandles.lookup().lookupClass()).m4325(181000775588741L);
   public static String[] f3560;
   public static String[] f3561;
   public static long[] f3563;
   public static Integer[] f3564;
   public static Map f3565;
   public static Object[] f3566 = new Object[115];
   public static String[] f3567 = new String[115];

   public Class182(ExtraChest var1) {
    }

   @Subscribe
   public void onBuildButtons(EventScreen$BuildButtons var1) {
      Screen var5;
      if ((var5 = var1.getScreen()) instanceof HandledScreen) {
         HandledScreen var7;
         IMixinAbstractContainerScreen var9 = (IMixinAbstractContainerScreen)(var7 = (HandledScreen)var5);
         Builder var10001 = ButtonWidget.builder(Text.literal("Steal"), var1x -> {
            this.f3558 = ExtraChestMode.f2750;
         });
         boolean var10004 = true;
         Objects.requireNonNull(Globals.mc.textRenderer);
         this.f3555 = var10001.size(35, 9 + 6).position(var7.width / 2 + var9.getImageWidth() / 2, var7.height / 2 - var9.getImageHeight() / 2).build();
         var10001 = ButtonWidget.builder(Text.literal("Fill"), var1x -> {
            this.f3558 = ExtraChestMode.f2752;
         });
         var10004 = true;
         Objects.requireNonNull(Globals.mc.textRenderer);
         this.f3556 = var10001.size(35, 9 + 6).position(var7.width / 2 + var9.getImageWidth() / 2, var7.height / 2 - var9.getImageHeight() / 2 + 9 + 7).build();
         ((IMixinScreen)var7).invokeAddRenderableWidget(this.f3555);
         ((IMixinScreen)var7).invokeAddRenderableWidget(this.f3556);
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   @Override
   public boolean isListening() {
        return false;
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
      f3566[0] = ")\u000b;\u0017B\u000e5\u00119KX\u001a%\u0012rƽ";
      f3566[1] = "o\u0017u\u0018\t\ro\u0017bD\u0005\u0002u\\bZ\u0005\u0017r-5\u0007\\Q";
      f3566[2] = "yp8BfJej:\u001e|^uiqŎ";
      f3566[3] = "\u0018]\u0011\u001dc=\u0018]\u0006Ao2\u0002\u0016\u0006_o'\u0005gQ\u0005;";
      f3566[4] = int.class;
      f3567[4] = "java/lang/Integer";
      f3566[5] = "a\u0006b\u0015\u0014h}\u001c`I\u000e|m\u001f+X\ntk\u001aq\u0015\u0007mgZdX\u0005x}\u0007jI\u00153i\u0001l\u0015/Pg\flU'\u007f}\u0000wZ\u0005iM\u001bkO\u0007t`\u0011wh\u0005ok\u0011k";
      f3566[6] = "\fv\u001czQ\u001e\fv\u000b&]\u0011\u0016=\u000b8]\u0004\u0011L\\e\u0004BFp\u00045O\u0004=$P`\f";
      f3566[7] = "EN0t'sYT2(=gIWyȮ";
      f3566[8] = "H\u0002Nf\u0007\u0001T\u0018L:\u001d\u0015D\u001b\u0007Ɏ";
      f3566[9] = "2\u001c8Iv8.\u0006:\u0015l,>\u0005q\u0004k?8@*\u0013m!.@\u0016(Q94\u0002,";
      f3566[10] = "Y^,k}LRQ=$\u0000TAV4m";
      f3566[11] = "^}W}V\u0011^}@!Z\u001eD6@?Z\u000bCG\u0011f\rI";
      f3566[12] = "V\u000f(&\u00170V\u000f?z\u001b?LD?d\u001b*K5h9Bl\u001c\t0i\t*g^n<K";
      f3566[13] = "@\nf\u001c\u0016\n\\\u0010d@\f\u001eL\u0013/Q\b\u0016J\u0016u\u001c\u0005\u000fFVdD\u0001\u0011[\u000b/Q\b\u0016J\u0016u\u001c\u0017\u001c]\u001dd\\J:Y\u001doF7\u001c]\u001dd\\";
      f3566[14] = "!d!\u0002\u001e]!d6^\u0012R;/6@\u0012G<^a\u001fD";
      f3566[15] = "|\u0012?Qv(`\b=\rl<p\u000bv\u001ch4v\u000e,Qe-zN9\u001cg8`\u00137\rwst\u00151QM\u0010z\u00181\u0011W>a\u0005=\u0011";
      f3566[16] = "\t]-\u0011eR\t]:Mi]\u0013\u0016:SiH\u0014gj\t<";
      f3566[17] = "$*ju\u0014T80h)\u000e@(3#8\nH.6yu\u0007Q\"vJ7\tC*4~";
      f3566[18] = "\u0006sG\u0000<}\u0006sP\\0r\u001c8PB0g\u001bI\u0000\u001fa";
      f3566[19] = ":B\u0000x4O&X\u0002$.[6[I5)H0\u001e\u00049+W4^\u0003x'H2E\n3(N{c\u0013$/T2s\u0006&2O'U";
      f3566[20] = "\"{k7Y'\"{|kU(80|uU=?A,+\u0003";
      f3566[21] = "zN1L4\u0012zN&\u00108\u001d`\u0005&\u000e8\bgtpPlK";
      f3566[22] = ")Xd^K\u00157P~\u0011*\u0002)\\qK\u0016";
      f3566[23] = "w$%yh\u0019|+46\t\u0017w 0l";
      f3566[24] = ":3=k0G:3*7<H x*)<]'\txrd\u0017";
      f3566[25] = boolean.class;
      f3567[25] = "java/lang/Boolean";
      f3566[26] = "!AY?)[!ANc%T;\nN}%A<{\u001c&t\u0001";
      f3566[27] = "RFV\u0015b\u0018RFAIn\u0017H\rAWn\u0002O|\u0013\f<D";
      f3566[28] = "\u0019\u007f\u0004|e\f\u0005e\u0006 \u007f\u0018\u0015fM;";
      f3566[29] = ")W\u0019/&=)W\u000es*23\u001c\u000em*'4m\\6zg";
      f3566[30] = "\"\u0005QxU,\"\u0005F$Y#8NF:Y6??\u0016b\n";
      f3566[31] = "\u0019mW\u0001/n\u0005wU]5z\u0015t\u001eL2i\u00131E[4w\u00051dF0~\u0004";
      f3566[32] = void.class;
      f3567[32] = "java/lang/Void";
      f3566[33] = "\u000e\u001f\u0007\\qt\u000e\u001f\u0010\u0000}{\u0014T\u0010\u001e}n\u0013%EA*";
      f3566[34] = "v\u0007K,V\u0014v\u0007\\pZ\u001blL\\nZ\u000ek=\u000e4\u000eJ";
      f3566[35] = "\u0015\u001a+uEn\t\u0000))_z\u0019\u0003b8Xi\u001fF?>Co\u0013\u0006+ud~\u000e\u001c%5P";
      f3566[36] = "9f8@fd2i)\u000f\u0001f'b)D:";
      f3566[37] = "WlKEcqWl\\\u0019o~M'\\\u0007okJV\u000e\\<+";
      f3566[38] = "F*\u0005&\b-Z0\u0007z\u00129J3Lk\u0015*Lv\u0011m\u000e,@6\u0005&4-D:\u0007z)=],\u000bf\u001d";
      f3566[39] = "\u0002[M(\\\u0003\u0002[ZtP\f\u0018\u0010ZjP\u0019\u001fa\u000e2\u0007";
      f3566[40] = "lw\u001f[_6pm\u001d\u0007E\"`nV\u0016B1f+\u000b\u0010Y7jk\u001f[o,li\u001d\u0014C\u0010fq\f\u001cC$";
      f3566[41] = "}7\u0019[H\u0012}7\u000e\u0007D\u001dg|\u000e\u0019D\b`\r_F\u0012J";
      f3566[42] = "k\\M5x\u000b`S\\z\u0014\bnQ^58";
      f3566[43] = "9-X\u0012~h'%B]\u001ct 8";
      f3566[44] = "pU9.dKn]#a9JhQ.\"dmnF*.'";
      f3566[45] = "qZe\u007f,\"qZr# -k\u0011r= 8l` gwz";
      f3566[46] = "\n$}Fp\u0001\u0014,g\t8\u0001\u000e&\u007fN1\u001aN\u0015yB:\u001d\u0003$\u007fB";
      f3566[47] = "@:A\u000fX;B;RTbĸ\"-SD\u00047Y8XR\u001fEB0NQ\u0019z\u001c8B\rb";
      f3566[48] = "2\u0003\u001bZ\u0015$p\u0013\u001bZ~o4\u0017dU\u0005hIGRL\u0010w4\u0006G\r\u0001\u0014s\u000fXZ\u001di2\u001a\u0019K~h8\u001aKK\u0017qpDI4";
      f3566[49] = "uf,\u001b\u000el2fx_ne$~)E\u0002Wu<u\u0019Q\u0000sp1L\r}2ep]n:;z'A\u0013{.;6\"Rd,;)N\u0015dx\u007fI";
      f3566[50] = "YW!(EX\u0012\u0014'(7X\r\u0016}4[j\\T!h\u000f=_\u0013xi\u000b\u0007\u001b\u0005-h7\r\u0012\u0011!?QF[\u0017}S\u000bY\u0005S}?LYQ\u0017\u001d";
      f3566[51] = "\u00032\u0005dQF\u00013\u0016?kվa.\u001f=\u0001F\\,X6\r";
      f3566[52] = "FD\u0005>54\u0012E\u000b(\u000e5\u001a_1:t7\u001aEj82?\u001bO\u000b(5?\u001a#";
      f3566[53] = " 6{\u0017~=9va@\u001c;7w}Ap\ta2 \u001a,^$dt\\m3dk{\u0019\u001c";
      f3566[54] = "ayA0\u0001\u000fk?\u001e)c\u0012i{O.\u000f >6\u0017wcMv\u007fA*\u001e\fc>PIY\u0005|iL4\u0018\u0010=x/s\u0011\u000fjdR2\u0004N{\u0007L'\b\n9w\u0012$\u0005F\u0004aW#\u0002\u000bulV.\u0002wadKt_G\u007f{\u001f.c";
      f3566[55] = "\u007f\u0005w$)l<\u0011~(G};&w-!\u007f@\fa(\"g\u007fRi$~\u001c";
      f3566[56] = "*\u0012(#s\n)\t*u\u000b\u001a3\t\u0003#w\u00187m9*3\u0018g\u0000)u3\u0013W\r4&n\bhS<*2s";
      f3566[57] = "#C*\u0005\rigU\u007f\u000416qF/X]\u0004 \u0001s\u0000\tS#S+__#`G\"S1=!K(YQ*w\\r?";
      f3566[58] = "z~0vt&,uosKly|,{1{Rb7\\6rp\u0005>!v&p}>$7g\u0014jj'{rljof:\u0016";
      f3566[59] = "\u0004.}BK-E\u007frP7w\u001aoA@Sk\u0011\u0013%[Ox\u001fndN\u000ei|";
      f3566[60] = "+\u001bn\u001e<=q\u0003h\u001e^I\u0012[p\u0002%a,\u0001h\u0004%";
      f3566[61] = "%\u007f\u0004y$!3z\u0001?\\*0x\u0006#0\u0018b:_}\\u/|\b'!4:=\u0019D>u%e\u0007\u007f;,?;f";
      f3566[62] = "\u0017f\\5q\r\u0015gOnKȇugFr!H\u001cc\u0005m\"";
      f3566[63] = "f#aT\u001f7s(wOm)d.qU\u0001\u001b6c/\nm,{>tIRrs2(2";
      f3566[64] = ">R\u000b\u0016\\F<S\u0018Mfȷ\\CTH\nT=SSH\u000b8<X\u0004H\u001d\u0007bP\b\u0014f";
      f3566[65] = "[\u001c\u0018\u0018'^Y\u001d\u000bC\u001dȒ9\u001fFCqGZ\u001f\u000b\u0013f";
      f3566[66] = "#m_}.=!lL&\u0014ƇAlE:~x(h\u0006%}";
      f3566[67] = ",`\u001a\u0004p/k`N@\u0010&}x\u001fZ|\u0014,:C\u0006+C*v\u0007Ss>kcFB\u0010yb|\u0011^m8w=\u0000=,'u=\u001fQk'!y\u007f";
      f3566[68] = "L\u007f3iB\u0011Ocf.%ICc;sHaIq\u0006}CDHg5zAEz|0\u007fHT%w<|_CI$ aJ(O}0jND\u001ca-\u007f%";
      f3566[69] = "\u007f5!D\u001e %\"rJ{$~NpAJ;%7*\u000b\u0000(";
      f3566[70] = ")Y\rj.:s\u0013Gy\u001e-#OX|Iz}\u001f\u0001\u0010w\u007f'NPqgx'O";
      f3566[71] = "a2\f2D#;*\n2&xXr\u0012.]\u007ff(\n(]";
      f3566[72] = "0T\u001f5K\u001a3O\u001dc3\u0005*M\u001c\u0019Z\u001f&Kq#S[&\u001b\u001c3\f[-+\u0011._\u00066\u0014O&SZM";
      f3566[73] = "uISSNip\u001fA?ʺ\r*\u001e\u0003DXha]\u0005D";
      f3566[74] = "b\u00071y!&?\u0000cpN59\u000fkq\u0019ab]>%Na*\u001aa~3 ?[p";
      f3566[75] = "f}\u0001fw`%7\u00072\f60zxie60FTmc9!\u0006\u0003~t7>{Bk5&]";
      f3566[76] = "\tSB/VfNS\u0016k6oXKGqZ]\t\t\u001b-\u000f\n\f\n\u001bmDoGI\u001dm6";
      f3566[77] = "p21\u0007}E'$}^\u0004ՕMs}\u0018jV02hY{5";
      f3566[78] = "`@*L__7Vf\u0015&ɶ]\u0001fSHL @s\u0012Y/";
      f3566[79] = "By*P\u001aM\u0018a,Px\u001e\u0002}$O\u0003s\u0014;p\u001b\u001c\u000b\u0014>1Zx\u0013\tl(PGM\u0001`t+";
      f3566[80] = "9\rp\u0013-Ac\u0015v\u0013OS\u0000Mn\u000f4\u001d>\u0017v\t4";
      f3566[81] = "E<{%+'\u001b?vi\u00169G?t4Ah\u0019c,Xu9M/-(+:@c";
      f3566[82] = "\u001a,8\u001cTM\u0018-+GnƷx0bMRY\u001b$b\\\u0014";
      f3566[83] = "Rtu\u000f\u00037P3~\u0003}vWft\u001e%cMvz\t}0Duy\u0006\u0000qQ4he\u001dxZhlZCpV4\u0017";
      f3566[84] = "{\u00014\\0g~X.\u0002Q9tG,Z=\u000b&\u0005s\u0002Q3hK*O*&c]1=";
      f3566[85] = "'\u0015\u0018W\"<%R\u0013[\\{.\u0017\u0017A\\d \bG\u0001lz?\\\u001d=";
      f3566[86] = ")d\u001f9R`,2\rUО\u0004-v\u0010n\fz/w\u00035";
      f3566[87] = "\u001fF(a7*\u0018D$o\u000e|s\u0003/fn>\u0003@;obPLU\"b` \u000fA+n\u000e";
      f3566[88] = "$<\\Rs]~v\u0016ACJ.*\tD\u0014\u001dpyT(&Z!>\u000fP,\u001c~'";
      f3566[89] = "\"'5j9\u0002am3>BTt Le+Tt\u0003ll>[\u0019f\u007fx,Xd'j9=;";
      f3566[90] = "3dgB\t\u0002ojo\u001ai\u00159gWM\r\u00079\u001bf\u001fTJ0cf\u001a\u0015\u000bT";
      f3566[91] = "\"0w\\5\\x(q\\W\u0005a%qA>\u0006\u001bsb_9\u0001f2w\u001e(b";
      f3566[92] = "\u0013Q/8] \u0007Q>~7&\u001a\u0014%c[\u0014NXu>7|\u001e\f%jG?\n\u0005)\u0004";
      f3566[93] = "\u001c^\u0003+i$\u0019\b\u0011Gd@G\u000eW-r:\u001eK\u001d)\r}@\f\u00058w$\u0005F\u0001G";
      f3566[94] = "!e\u0011t:r8%\u000b#X\u007f:5\u0013)\u000f.faME9{:<\u0005*\"w&`";
      f3566[95] = "\u001c\u0016S)98\u0019\u0012AgFq\"SQq&3R\u0010Ex*]\u001d\u0005\\u(-^\u0011UyF";
      f3566[96] = "A6A\u007fWBC7R$mӆ#5\u001f$\u0001[@5Rt\u0016";
      f3566[97] = "w\u007f2\u0014:)n?(CX.l/0I\u000fu1sd% 1o\u007f,K64j9";
      f3566[98] = "edtV(\u0004|$n\u0001J\u0002r%r\u0000&0#d*^wg\u007f+~\u00021X!#r^J";
      f3566[99] = "D\u0017f^d\u001fF\u0016u\u0005^ƕ&\u00148\u00052\u0006E\u0014uU%";
      f3566[100] = "\u0001e9!gzCu9!\f1\u001bioO68\u0002ua2w-Cd\u0002";
      f3566[101] = "OLg*@JV\u00049(?XOGm(Z#NBn(GZMYl~?";
      f3566[102] = "B\nBnfiG\\P\u0002ұ\r\u001d\u0019Iy`3G\u0001Oy";
      f3566[103] = "7S\u0010-xL,_\fq\nF;E\u0011.fti\u0007Hp\n\u0019$A\u001f*wX1\u0000\u000eIh\u0019.X\u0010rm@4\u0006q";
      f3566[104] = "]B6P\u007fN\u001aWb\u001bBEFAhL+I\u007fOh\\//AT`D9\u0010\u001f\\l\u0018B";
      f3566[105] = "\u001c\u0013:\u0006Fb\u0007\u001f&Z4c\u001c\u0014?\u000ec2BG`b\u000e\u007f\u0005\u00178\u001fOjD\u0006";
      f3566[106] = "\u0001rX<\u00058\u0004$JP\u0092\\^%\b+\u00139\u0015f\u000e+";
      f3566[107] = "\\V{\u001d>>\u0001Q)\u0014Q-\u0007^!\u0015\u0006y\\\fuHQy\u0014K+\u001a,8\u0001\n:";
      f3566[108] = "AV-2C\"\u001b\u001cg!s5K@x$$b\u0015\u0012&H\u001e`[Uc%\u001e'\u0015R";
      f3566[109] = "^m %%%Ea<yW$^j%-\u0000u\u00009xA,4\u0004i*qn$\u0004i";
      f3566[110] = "7\u00166]M<w\u00199\u0018<?(\u0014;KkntE`'G/r\u00174\u0017\u0005?r\u0017";
      f3566[111] = "d=$||k>wnoL|n+qj\u001b+0|)\u00066/iwwe/os ";
      f3566[112] = "\u000e\u001f-R\u001eT\u000bF7\f\u007f\n\u0001Y5T\u00138S\u001be\u000b\u007f\u0000\u001dU3A\u0004\u0015\u0016C(3\u001f\u001d\u0000@.\fA\u0015\f\u001cU";
      f3566[113] = "B\u0015\b\u001czM\u0018\r\u000e\u001c\u0018\u001c{U\u0016\u0000c\u0011E\u000f\u000e\u0006c";
      f3566[114] = "~<\u0017a?@<,\u0017aT\u000by8Af1px=Bf,\t{&@0T";
   }
}
