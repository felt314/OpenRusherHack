package org.rusherhack;

import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventQuit$Reason;
import org.rusherhack.core.event.listener.EventListener;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.client.api.feature.module.impl.combat.AutoDisconnect;
public class Class542 implements EventListener {
   public static Object[] f8734 = new Object[37];
   public static String[] f8735 = new String[37];

   @Override
   public boolean isListening() {
        return false;
    }

   public Class542(AutoDisconnect var1) {
    }

   @Subscribe(
      stage = Stage.PRE
   )
   public void onQuit(EventQuit var1) {
      if (var1.getReason() == EventQuit$Reason.DISCONNECT && !Globals.mc.isConnectedToLocalServer()) {
         Globals.mc.player.networkHandler.sendChatMessage(String.valueOf('\u0000'));
      }
   }

   static {
      m122();
   }
   public static void m122() {
      f8734[0] = "\u001ea\u000bS-V\u0002{\t\u000f7B\u0012xBȞ";
      f8734[1] = "\u0005`K0\u0016]\u0019zIl\fI\ty\u0002}\u000bZ\u000f<_{\u0010\\\u0003|K0&G\u0005~I\u007f\n{\u000ffXw\nO";
      f8734[2] = "\u001f\u001e.`73\u0003\u0004,<-'\u0013\u0007gɈ";
      f8734[3] = int.class;
      f8735[3] = "java/lang/Integer";
      f8734[4] = "s\u0014`-\rIo\u000ebq\u0017]\u007f\r)ӳ";
      f8734[5] = ": / 0k&:-|*\u007f69fm.w0<< #n<|.k#j  - /q1'$klJ:5/b'\u007f7>-C-z >-";
      f8734[6] = boolean.class;
      f8735[6] = "java/lang/Boolean";
      f8734[7] = "4\u0003s$\u00112?\fbk}11\u000e`$Q";
      f8734[8] = "+\u0014)h<%7\u000e+4&1'\r`%!\"!H=#:$-\b)h\u001d50\u0012'()";
      f8734[9] = "@F}?u\bKIlp\u0014\u0006@Bh*";
      f8734[10] = "i>\u001f\bG?u$\u001dT]+e'Vɒ";
      f8734[11] = "^/D!m B5F}w4R6\rls<T3W!~%XsFyz;E.\rls<T3W!Z#T3W^j<E";
      f8734[12] = "|>\u0001'U7`$\u0003{O#p'HjK+v\"\u0012'F2zb\u0003\u007fB,g?HjK+v\"\u0012'b4v\"\u0012XR+gh4lF1|\"";
      f8734[13] = "B\u0001A\f;<I\u000ePCF$Z\tY\n";
      f8734[14] = char.class;
      f8735[14] = "java/lang/Character";
      f8734[15] = ",\u0012>'[v,\u0012){Wy6Y)eWl1(y8\u0006";
      f8734[16] = "/\u001e,o\u000bu/\u001e;3\u0007z5U;-\u0007o2$nrR";
      f8734[17] = void.class;
      f8735[17] = "java/lang/Void";
      f8734[18] = "i'Q\u0010\u0013\ru=SL\t\u0019e>\u0018]\r\u0011c;B\u0010\u0000\bo{qR\u000e\u001ag9E";
      f8734[19] = "\b\u0002S\\(o\b\u0002D\u0000$`\u0012ID\u001e$u\u00158\u0010Fs";
      f8734[20] = "g{\u001dY\u0005mdcM<é\u000e~eP\\Zhf\"T";
      f8734[21] = "&txpI\u0016'h#k3Ո\u001f-8\u007fTR~z\u007faB(";
      f8734[22] = "07\u0001F1\u000fr\"\u000bI\u0001ɞ\n/\u000f\u0012dJi,\u0017B";
      f8734[23] = "NDwx!\u0013OX,c[ɴw\u001d7w<W\u0016Jpi*-";
      f8734[24] = "\u0002(\u000b\f1A\\f\r\u001cR\u001f_e1\u0010;\u000bU\u007fkM1K^{\f\u001f2\u001a@\u0019";
      f8734[25] = "Y\u000f33}u\u0015\u0002=)\u001fj\u0001\t/'Xzh\u0004c7s}YR+re\u0014Y\u000f33}u\u0015\u0002=)\u001f";
      f8734[26] = "Q8] ^MH\u007fG/c\u0013U9E8\u000f!\u0004z\u001enYv\u0004(H2X\u0018\u00015\u0015ac";
      f8734[27] = "\u0002u\u0007Z\u001d|\u0019j\u0005\ta'\u0005n\u0018\u0001\r\u0015T/G\\PBYp\u0019\u001f\u0003#\u0015}\u0017\u0005a)R+@\u0003\u0005<\u0005r\u001ef";
      f8734[28] = "\u0019jm<\u000fAYe:/tMYDg=\u001bHOt\u0000n\u0019AO#nk\u0004\u001c\u001c\u0018";
      f8734[29] = "\\*l\u007fP\u000f\u001f\";uj\b\u0006!d(\u0003\u0004?/d8\u0007b]+m(Q\fX60{j";
      f8734[30] = "\u0013@\u0002\u0006r%\u001c\u0019\u0017PB \u0014{\u0000B::B@\u0019\u0005 5";
      f8734[31] = "@K7;A@CSg^к#YUz>\u001eEA\u0012~";
      f8734[32] = "\u0015}\u0006\u0016\u000e}\f:\u001c\u00193(\u001dm\u001a\u0005d\u007fC:Bi_y\fp\u0013UP,\u00161";
      f8734[33] = "\u0011V\b[g\u0012CUYE\u00059`nxpC3l~o75\u0016\u001aYQPg\u0015KG";
      f8734[34] = "yOHV\\f(XJ\u001b,9)I}OH+)5\u001d\\V4{D\u001d[SfD";
      f8734[35] = ",\u0014O\u0017\u00169n\u0001E\u0018&(\u0016U\u0013\nC\"vVG\u001f^A)Z[\u0017E!*\u000eN\n&";
      f8734[36] = "\u000f\"5c{v\u0000w/\"\u0016$\u0002p!\u007fAqR!y\u0013|-\u001c!9-g2\u001er";
   }
}
