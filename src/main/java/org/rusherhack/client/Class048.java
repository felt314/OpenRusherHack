package org.rusherhack.client;
import org.rusherhack.*;

import org.rusherhack.Renderer202;
public class Class048 extends Class023 {
   public Renderer202 f1319;
   public static Object[] f1321 = new Object[16];
   public static String[] f1322 = new String[16];

   public Class048(Renderer054 var1, Renderer202 var2) {
      super(var1);
      this.f1319 = null;
      this.f1319 = var2;
   }

   @Override
   public String m2823() {
      return this.f1319.getName();
   }

   @Override
   public void m550() {
      this.f1319.setVisible(this.f1319.isHidden());
   }

   @Override
   public boolean m2770() {
      int[] var3 = Class055.m3218();
      boolean var10000 = this.f1319.isHidden();
      if (var3 == null) {
         if (!var10000) {
            boolean var10002 = true;
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   static {
      m786();
   }
   public static void m786() {
      f1321[0] = "/\nAD4>3\u0010C\u0018.*#\u0013\b\t*\"%\u0016RD';)VS\u0003h;!\u0016C\u0006h\u001b!\u0016C\u0006\u0004*3\u001d";
      f1321[1] = "\u0005S<tOE\u000e\\-;2]\u001d[$r";
      f1321[2] = "\u0014-E_G.\b7G\u0003]:\u00184\f\u0012Y2\u001e1V_ϧ";
      f1321[3] = "?m\u0006\u001e-=#w\u0004B7)3tOƑ";
      f1321[4] = "\"w>Xo\u000e>m<\u0004u\u001a.nw\u0015q\u0012(k-XҢ";
      f1321[5] = "2e";
      f1321[6] = boolean.class;
      f1322[6] = "java/lang/Boolean";
      f1321[7] = "ao&\u0019_:}u$EE.mvoɃ";
      f1321[8] = void.class;
      f1322[8] = "java/lang/Void";
      f1321[9] = "F3/\t }M<>FAsF7:\u001c";
      f1321[10] = "\u000bA-pj'[F&\u000e<8K=+k>UE\t\"`*5V\u0018!\u000e";
      f1321[11] = "~YbU=-xHy\u001a\fɛG\u0003aEqtzSp^e";
      f1321[12] = "/Yz\u0005\rVo\u0005z\u00112ԓ\u0014RtS\f\u0005/\u0012*\u0004_o";
      f1321[13] = "*\u0000\u001e\u0005%Pz\u0007\u0015{}YV[\u001d\u0017qD\u0016\u0006\u001a\u0015s\u001egD\u001b\u0019-\"";
      f1321[14] = "w\u00026\\6\u0019q\u0013-\u0013\u0007\u0013N_j\u0011h\u001b>\u00029B:zs\\kAf\n.\u000f8\u0013\u0007";
      f1321[15] = "}DT<~Q-C_B<N= Z9&I%\u0013;~,M.BJ<-Ap~\u0006={\u001e3G@!,\u001fA";
   }
}
