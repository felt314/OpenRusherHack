package org.rusherhack.core.event.subscribe;
import org.rusherhack.*;

import org.rusherhack.core.event.listener.EventListener;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.Event;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.Setting;

public abstract class SubscriberBase {
   public boolean f1592;
   public boolean f1593;
   public int f1594;
   public Object f1595;
   public EventListener f1596;
   public Stage f1597;
   public static String f1598;
   public static Object[] f1600 = new Object[36];
   public static String[] f1601 = new String[36];

   public SubscriberBase(Object var1, Subscribe var2) {
    }

   public boolean shouldInvoke(Event var1) {
        return false;
    }

   public Object getClassObject() {
        return null;
    }

   public boolean shouldIgnoreCancelledEvents() {
        return false;
    }

   public abstract void invoke(Event var1);

   public int getPriority() {
        return 0;
    }

   public static void m3878(String var0) {
      f1598 = var0;
   }

   public static String m3879() {
      return f1598;
   }

   static {
    }
   public static void m122() {
      f1600[0] = " t\u001e*\u000bX<n\u001cv\u0011L,mWg\u0016_*(\u001cr\u001cC;(\nq\u001b^,t\u0010f\u001c\u0003\u001cs\u001bw\u001a_&d\u001cv;L<c";
      f1600[1] = boolean.class;
      f1601[1] = "java/lang/Boolean";
      f1600[2] = int.class;
      f1601[2] = "java/lang/Integer";
      f1600[3] = "L9Vy\u0004\u001bG6G6e\u0015L=Cl";
      f1600[4] = "\rdP\fG\u0018\u0011~RP]\f\u0001}\u0019AZ\u001f\u00078RTP\u0003\u00168DVT\n\u00078dVT\n\u0007";
      f1600[5] = "q\"?\u0011\u0014\u0014m8=M\u000e\u0000};vɋ";
      f1600[6] = "s\u001d`\u0016\u0011oo\u0007bJ\u000b{\u007f\u0004)[\fhyAbN\u0006thAkQ\u0010ny\u0001bJM_j\niL/so\u001bbV\u0006h";
      f1600[7] = "ZoTy.nQ`E6YvBgL\u007f";
      f1600[8] = "\u0004Ph\u000fwV\u0018JjSmB\bI!BjQ\u000e\fjW`M\u001f\f{XuFEgyDkW(CaB`O\u0007CmM`";
      f1600[9] = "N\u00047\u001a\\\u0002R\u001e5FF\u0016B\u001d~WA\u0005DX5BK\u0019UX$M^\u0012\u000f3&Q@\u0003";
      f1600[10] = void.class;
      f1601[10] = "java/lang/Void";
      f1600[11] = "\u007fh2z,\u007fcr0&6ksq{71xu4&1*~yt2z\rodn<:9";
      f1600[12] = "fe\u0017\\r0\u0013E\u001cSc\u007fn]\u000fTj6\u0006";
      f1600[13] = "E\u0010\u0013\\\u001d\fY\n\u0011\u0000\u0007\u0018I\tZ\u0011\u0000\u000bOL\u0011\u0004\n\u0017^L\u0007\u0007\r\nI\u0010\u001d\u0010\nWy\u0017\u0016\u0001\f\u000bC\u0000\u0011";
      f1600[14] = char.class;
      f1601[14] = "java/lang/Character";
      f1600[15] = "\u001f\u001b?\bI\u0014\u0018\u0017%sĺuYU)\u001cDKCK}";
      f1600[16] = "?\u0011\u0018RF88\u001d\u0002)ĥY?O]M\u000b5hJ\u0017K";
      f1600[17] = "\u0002%G\u0004&.HfC[\u001dյ2)I]!h\u0003!KFe\u0014";
      f1600[18] = "%'\u007fS\u001ds\"+e(J\u0012%hpKK+'}=E )aeaC\u0019+t(o(";
      f1600[19] = "nlj\u001c\f89i \u001a|\u0018\u0018L\u001b%8\bU9<@\u0018$9n9\n\u001e";
      f1600[20] = "\tHH%at\u0005IH~QqY\u0010K`1\u0015\r\u000bJ!;\u007fF\tM'Q";
      f1600[21] = ")X}\u0001\u0007\n~]7\u0007w/VrE^\u0019^vF)\t\u001c\u0014p";
      f1600[22] = "\u000f\u001e'\r\u0001bDE3\u001d='B\u00131\u0019=gPB:\u0004Q0U\b<t";
      f1600[23] = "I7hv6JN;r\rƌ+\u000fy~b;\u0015\u0015g*";
      f1600[24] = "\u001f\u0007\u0015aDhT\\\u0001qx7A\u0005\u000bb\u0015\u001dG\u0005\u0007u\u001c2C\u000fle\u0006=ASR\u007f\u0018i.";
      f1600[25] = ";\u0002\u001a\u000eL\n<\u000e\u0000uɇk:_\u0007M\u0016\u0019yX\b\u000e";
      f1600[26] = ".8\u0010j)'v5\tsD4i\u001d\u0013v88t8\u0014bD(l2\u001d=z2rfr";
      f1600[27] = "S3?1$JT?%Jȝ+U=.s)JY<.(\u0019";
      f1600[28] = "\u00153Da{\u000e^hPqGH^6Zb&LUW\u0004e)\rN=Og.\u000b$";
      f1600[29] = "*A*<3#iY|:\t&lx/>b*sW+4\t:iX)h7 w\fF";
      f1600[30] = "\u0015Ol&\u0011\u000b\u0012Cv]Ѯj\u0013A}d\u001c\u000b\u001f@}?,U\u0011\u001b 'ERRO(]";
      f1600[31] = "\u0013C\u0016\u001b\u001cE\u0017\\U\r{\u0013@C3\u0010\u0016\u0012@E\u0011\u0007\u0017'QV\u0004\u0007{GC\u0007\u000f\u001a\u0017\u0010FM\tj";
      f1600[32] = ")f\u0019B\u0001@.j\u00039z!++\n\u0004VK`)\r\u0002";
      f1600[33] = "6k xx(1g:\u0003ɿI1:?d(;i7&}";
      f1600[34] = "bQA\u001cR\bfN\u0002\n5^1Qg\u0011\\^1-\u0007\u0003\rU,AP\u0006GS\\";
      f1600[35] = "\u001eB\u001bX\u0011j\u0012C\u001b\u0003!`C\u0015\r(]\u000b\u001a\u0001\u0019\\KaQ\u0003\u001eZ!:RB\u0014\u0004BvN\r\u0019a";
   }

   public SubscriberBase() {}
}
