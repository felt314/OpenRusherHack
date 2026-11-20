package org.rusherhack.client.api.utils;
import org.rusherhack.*;

import net.minecraft.text.Style;
import net.minecraft.text.Text;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;

public class ChatUtils implements Globals {
   public static Object[] f1101 = new Object[26];
   public static String[] f1102 = new String[26];

   public static void print(String var0) {
      print(var0, Style.EMPTY);
   }

   public static void print(Text var0) {
      int var4 = RusherHackAPI.colors().primaryColor().getRealValue().getRGB();
      print(var0, var4, Style.EMPTY.withColor(var4), 0);
   }

   public static void print(String var0, Style var1) {
      print(Text.literal(var0).fillStyle(var1));
   }

   public static void print(Text var0, int var1, Style var2, int var3) {
      RusherHackAPI.getNotificationManager().chat(var0, var1, var2, var3);
   }

   static {
      m194();
   }
   public static void m194() {
      f1101[0] = "<_\n \u000e\t E\b|\u0014\u001d0FCm\u0010\u00156C\u0019 \u001d\f:\u0003\u0018z\u0015\u0010 \u0003.f\u001d\b\u0006Y\u0004b\u000f";
      f1101[1] = "\u001e}HG\u001e$\u001e}_\u001b\u0012+\u00046_\u0005\u0012>\u0003G\u000e\\E|";
      f1101[2] = int.class;
      f1102[2] = "java/lang/Integer";
      f1101[3] = "\u001diO6Q\u0013\u001diXj]\u001c\u0007\"Xt]\t\u0000S\t-\u0004I";
      f1101[4] = void.class;
      f1102[4] = "java/lang/Void";
      f1101[5] = "!C2\u0007@v=Y0[Zb-Z{J^j+_!\u0007Ss'\u001f&PAw+\\{j]o!C&";
      f1101[6] = "|N\u0006]:*`T\u0004\u0001 >pWO\u0010$6vR\u0015])/z\u0012\u0012\u0016<+zR\u0006]\u000b0\u007fS\u0013 -+gU\u000f\u0014";
      f1101[7] = "a$'\u007f\u001dU}>%#\u0007Am=n2\u0003Ik84\u007f\u000ePgx\u0012$\u001cHk$\b0\fKO\u0006\t";
      f1101[8] = "v)f{{Ck<>Y:Ns:";
      f1101[9] = "X\u000bEA\u0016TS\u0004T\u000ekL@\u0003]G";
      f1101[10] = "jDK\u0006(ljD\\Z.cp\u000f\\D.vw~\n\u001ap5";
      f1101[11] = "\u000f8c\u0004nL\u0013\"aXtX\u0003!*IpP\u0005$p\u0004}I\tdwSoM\u0005'*cRV\u0014#bC\u007fX\u0014#kDQX\u000e+cOn";
      f1101[12] = "^x\u0003s\u0016\u001aUw\u0012<w\u0014^|\u0016f";
      f1101[13] = "\u0012{L1O\"K5\u0013\u0001H=\u0012c\u000b\u0001N*\u0010?JsB*L\u0005Ne\tw\r\u007f\u0010n^)s?\u0019`\n~\u0018i\u00168RGJaN1N=\u0014j\u0019o0|Iy\u0018sM<\u001e4\u0007\u0001";
      f1101[14] = "wK+b\u0004xp_*$\u007fe'YW}\u0003k$Dzs\u0003k-CTs\u0019c%Hk\u001aOcs@ \"\u0003hqF\u0011";
      f1101[15] = "\b^3$0tC\u00028-^6I[g5$?x]f;$N\u000fZ8-`tTDb,^";
      f1101[16] = "SxmIy-\u0005w5\u0011@#\u0004jl\u0014,\u0011R(5HqFPr5C><\u000eyb\u001d@|\u0007w6J+*\b/ns";
      f1101[17] = "\\\u0017\u0002t/a\u0010\u001c\u0000r\u001e2\f\u0017G\u0011`4\u000fD\u0006cl4S~\u0002u'i\u0012\u0004\\~p7lDUp$`\u0007\u0012Z(|YU\u001a\u0002!`#\u000b\u0011U\u007f\u001ebV\u0002Tcc\"\u0001OK\u0011";
      f1101[18] = "-\u0014buVm*\u0000c3-tw\u001e?wV\u001f+\u001eiuC%`Bb|-";
      f1101[19] = "w(u|.\u0004!'-$\u0017\u0001,+p*@Uq}*~\u0017U#'.\u007f|\u0003,\u007fv";
      f1101[20] = "vyG\u0017@o-g\u001d\u0016~:'e'\u000b\u00171\u0014p\u0019\u001b\u0013Uw~\u0001\u0016\u0001j&~\u001a\u0000~";
      f1101[21] = "}Eg8Z^qE;\u0002\u0002A\u007fHcn0\u00108\u0014;:g\u0012zH~p\u0018^{\u0013j\u0002X\u0013hV`g_K\u007fR\u0004";
      f1101[22] = "e\u0003b\u000f1\\b[u\u000bU\\7@i\u00169n`\u00037@k9`RhKlR6]0\u0013U\u0006eWw\u00150\u0001=@sq";
      f1101[23] = "\u0012\u0002ZfEZKL\u0005VBE\u0012\u001a\u001dV\u0004F\u0013\u0006\u0013)HGH\u0012alT^IE\n:[\u0006\u0011|ZlFP\u0001\u0001\u001a;\u000bOs";
      f1101[24] = "n\\X>l4?\\C(\u0013d>G~\u0001Y\u000bj_\u001d~mq4TJ \u0013";
      f1101[25] = "O}I\fi`\u00163\u0016<n\u007fOe\u000e<hhM9ONdh\u0011\u0003I\u0006jj\\~\tQ'u.";
   }
}
