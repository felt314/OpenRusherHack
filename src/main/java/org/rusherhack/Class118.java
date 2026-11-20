package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.input.EventKeyboard;
import org.rusherhack.client.api.events.client.input.EventMouse$Key;
import org.rusherhack.client.api.events.client.input.EventMouse$Scroll;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;

public class Class118 {
   public boolean f2534;
   public static boolean f2535;
   public static long f2537 = Class066.m4320(7288287129389721047L, -3338967699939299093L, MethodHandles.lookup().lookupClass()).m4325(172849297284228L);
   public static long[] f2538;
   public static Integer[] f2539;
   public static Object[] f2541 = new Object[52];
   public static String[] f2542 = new String[52];

   @Subscribe
   public void onKey(EventMouse$Key var1) {
        
    }

   @Subscribe(
      stage = Stage.ALL
   )
   public void onKeyboard(EventKeyboard var1) {
        
    }

   public Class118(Renderer605 var1) {
    }

   static {
   }

   @Subscribe
   public void onScroll(EventMouse$Scroll var1) {
        
    }

   @Subscribe
   public void m5697(Event261 var1) {
        
    }
   public static void m122() {
      f2541[0] = "4|\u0001A6\u0018(f\u0003\u001d,\f8eH\f(\u0004>`\u0012A%\u001d2 \u0003\u0019!\u0003/}H\f(\u0004>`\u0012A-\u0003+{\u0012A\u0001\u001b>`\u0012\"+\u0018(kB$!\u0014";
      f2541[1] = int.class;
      f2542[1] = "java/lang/Integer";
      f2541[2] = "Dh\\FB\u000bXr^\u001aX\u001fHq\u0015ԑ";
      f2541[3] = double.class;
      f2542[3] = "java/lang/Double";
      f2541[4] = boolean.class;
      f2542[4] = "java/lang/Boolean";
      f2541[5] = "`\u007f]8Q0|e_dK$lf\u0014Ȑ";
      f2541[6] = "MgpG\u0002\u0004Q}r\u001b\u0018\u0010A~9\n\u001c\u0018G{cG\u0011\u0001K;r\u001f\u0015\u001fVf9\n\u001c\u0018G{cG\u0019\u001fR`cG5\u0007G{c$\u001f\u0004Qp";
      f2541[7] = "\u001etk;\u0001L\u001et|g\rC\u0004?|y\rV\u0003N,!^";
      f2541[8] = "&\u0005T \u0014\u0016:\u001fV|\u000e\u0002*\u001c\u001dm\n\n,\u0019G \u0007\u0013 Ytb\t\u0001(\u001b@";
      f2541[9] = "<\u000e\\T4S<\u000eK\b8\\&EK\u00168I!4\u001bKi";
      f2541[10] = "B3\u0019m\u001f5B3\u000e1\u0013:Xx\u000e/\u0013/_\tYpE";
      f2541[11] = "..%\u0012f\u0017..2Nj\u00184e2Pj\r3\u0014b\n?";
      f2541[12] = "\u001d\u0017\u007f)h\u0019\u0001\r}ur\r\u0011\u000e6Ċ";
      f2541[13] = "dH~mM\u000bxR|1W\u001fhQ7ȷ";
      f2541[14] = "x>PX%\u0013d$R\u0004?\u0007t'\u0019\u00158\u0014rbR\u00002\bcbD\u00026\u0001rbd\u00026\u0001r";
      f2541[15] = "!5C\u0004/-*:RKN#!1V\u0011";
      f2541[16] = "(Ay6[T4[{jA@$X0{EH\"]j6HQ.\u001d{nLO3@0{EH\"]j6@O7Fj6lW\"]jSLX%\\\u007fjM";
      f2541[17] = "j<z<A\u0011v&x`[\u0005f%3q\\\u0016``xdV\nq`ikC\u0001+\u000bkw]\u0010F/sqV\bi/\u007f~V";
      f2541[18] = void.class;
      f2542[18] = "java/lang/Void";
      f2541[19] = "h9\\\u000bC\u000bt#^WY\u001fd \u0015F]\u0017b%O\u000bP\u000ene^ST\u0010s8\u0015F]\u0017b%O\u000bX\u0010w>O\u000bt\bb%Oh^\u000bt.\u001fvR\fh'W";
      f2541[20] = "d{i,U\u007fd{~pYp~0~nYeyA.1\n";
      f2541[21] = "\u0018_z(u\u001f\u0004Exto\u000b\u0014F3Ȕ";
      f2541[22] = "{~j\u0000Ofvr\u007fAwգK5qHF9v\u007fw\u0010\u0005";
      f2541[23] = "w+&n\u0014O\"a'\u0002\u0003\u001c4\u0013v~\r\u0016.Zcc\u001d\u0018$$\"?]q";
      f2541[24] = "Dq\u0014F3l\u0018dP\tWգ\u007fk\r\u0006>o\u0001*QFW";
      f2541[25] = "v;>C\u007fA*.z\f\u001bɷM!'\u0003rB3`{C\u001b";
      f2541[26] = "l\u0005`\u00112\u001cl\u0003aU_M$\u00070L$ 7@?N9\u001e>\u001a P_\u001a\"Bh\u0014bP$\u001a+(";
      f2541[27] = "N&&fFZ\tuqk)L\u001fd\u0004~TX\u001fHA#L\u0012\u000bw!z[B\u0012\u0018";
      f2541[28] = "-+\u0018U:p<$LS\u0002|*</\u0002ku\f'\u0018\u0004\u0002m&1\u001d\u0005|,zqt";
      f2541[29] = "\u0006L\u0007|#?\u0017CSz\u001b3\u0001[0<r3\u0001'Z?\"e\u0001\u001bZ9#!l";
      f2541[30] = "nN\"\u001eMIcB7_uУ^\u00059VD\u0016cO?\u000e\u0007";
      f2541[31] = "}\bG|N7tD[&w*|Jd,\r\"uRs*\u00139xg?}\u0012thY_$\u0005$q6";
      f2541[32] = "+b\n}\u0006g*x\u001b}g;{~\u001bd\u000b\t,:@:Z^,}C2[cf{\u001bqg";
      f2541[33] = "\u000b\u0007<\u0005B2\u000b\u0001=A/V}#Y<\u001eq\u0003Ah\u0000\u001ew\u0002\u0005";
      f2541[34] = "\u001e{Ie\u0007|\u000ft\u001dc?p\u0019ll2C~\u0013v%'^n\u001d|[f\u0002.t";
      f2541[35] = "6\u0017^k?r'\u0018\nm\u0007~1\u0000q:v\u0011\"\u001dC>kocA\u0003W";
      f2541[36] = "|\t8(@'?\u0013=a.хEIdbP;|H~sPZ;\u0015uzB$zI5\u0013P;4\u001dhm\u0011gttzr_3)\n;.\u001fZ\u007f\u000b<\"\u0012g5\rda.";
      f2541[37] = "=\u0013\u0017CxDiB\tO\u0019N;Q?H\u007f^;I\u0010Lu5lRL\u0010%\b&T\u0014S\u0019YjWI[dD;@K!";
      f2541[38] = "v\u000bhsz\u001bv\ri7\u0017\u007f\u001d9Q{h\u001e~\u0019m{n\u001f:";
      f2541[39] = "X\n=}vP\u001b\u001084\u0018H\u0006\nz+SI\u0000\u001cb+t-[\u00120?wM\u0002\u0005`&\u0018\u0017\u0004Fx)xN\u0013\u0016aFfL\u0010\u001em8'\u0010Pw;9 \u001c]Jq?x_a";
      f2541[40] = "_X5y\n\u001e\n\u00124\u0015\u001dM\u001ccsi\u000eG\u0006)pt\u0003I\fW1(C ";
      f2541[41] = "\u001fF\u0004D=`\\\\\u0001\rSԳ&V\u0006\u0012-o\u0016]IAl\u001d\u001b[I\u00012$\u001aAX\u0001Sq\u001aA\u0005\u0005.lKV\u0007\u007f";
      f2541[42] = "u*h\u000fy\u0012d%<\tA\u001er=AT-\u0010q iI:qa uZ-\u000f |53";
      f2541[43] = "Z5\u001d]!\u0007\u001dfJPN\u0011\u000bw?E3\u0005\u000bZz\u0018+O\u001fd\u001aA<\u001f\u0006\u000b";
      f2541[44] = "$}2}31 n-7^+r\u001fnr!5x/17;r";
      f2541[45] = "\u001b|\u007f\u000e<\u0014D9eI]JDnd\u0019\n\u001d\u001a>=ub\u001aH|?\u0007\"J\u0019c";
      f2541[46] = "RAa;s$\u0011[dr\u001d<\fA&mF2\u0011[9dp5k\u000681d6\u000b_/a}YQYlyr9\bN<`\u001dc\u000e\r$o}:\u0019]=\u0000'&S\ra=m \u000bN]";
      f2541[47] = "i\u0010\u0011\u000eO_z\f\u0019D*Ȳ\u0004\u0019]\u0018TI4\u0012\u0012K\u0015;";
      f2541[48] = "D?t;R`\u0004o%$mw\u0016}y#\u0001EA<\"u\\\u0012K1%?\f{\u0004luxm";
      f2541[49] = "\u001aR\u0001F$,\tN\t\fA´w\u000b\u0013L?)N\n\t]?H";
      f2541[50] = "f\u001cU-7pk\u0010@l\u000fzV\\^fbnh\u001c\n15\u0013g\u0002\n0r-'V]g\u000f";
      f2541[51] = "\u0013\r{+%C\u001e\u0001nj\u001d\u038d#Ebg&N^\u0006xbo";
   }
}
