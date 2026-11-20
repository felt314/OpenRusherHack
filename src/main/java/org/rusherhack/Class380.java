package org.rusherhack;

import java.awt.Color;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.core.utils.ColorUtils;

public abstract class Class380 extends Renderer107 {
   public int f6219;
   public static String[] f6220;
   public static Object[] f6222 = new Object[27];
   public static String[] f6223 = new String[27];

   public abstract void m6448(double var1, double var3);

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      super.render(var1, var2, var4);
      this.m6448(var2, var4);
   }

   public abstract String m4900();

   public int m9517(double var1, double var3) {
        return 0;
    }

   public Class380(PanelBase<?> var1, Renderer107 var2) {
      super(var1, var2);
      this.f6219 = 0;
   }

   public static void m12312(String[] var0) {
      f6220 = var0;
   }

   public static String[] m12313() {
      return f6220;
   }

   static {
      m343();
      if (m12313() != null) {
         m12312(new String[5]);
      }
   }
   public static void m343() {
      f6222[0] = "<+!]_\u0004 1#\u0001E\u001002hπ";
      f6222[1] = double.class;
      f6223[1] = "java/lang/Double";
      f6222[2] = void.class;
      f6223[2] = "java/lang/Void";
      f6222[3] = "!T#|E\nTt(sTE)l;t]\fA";
      f6222[4] = "Au)rr\u000e4U\"}cAIM1zj\b!";
      f6222[5] = "I/W\u0005(\u0007T:\u000f'i\nL<";
      f6222[6] = "\u00004\f\b\u000bP\u001c.\u000eT\u0011D\f-EȠ";
      f6222[7] = int.class;
      f6223[7] = "java/lang/Integer";
      f6222[8] = "$h\u0005FB\u00168r\u0007\u001aX\u0002(qLȥ";
      f6222[9] = "s\u000b%\u0010\u0011po\u0011'L\u000bd\u007f\u0012lÌ";
      f6222[10] = boolean.class;
      f6223[10] = "java/lang/Boolean";
      f6222[11] = "\t'\u0007[..\u0015=\u0005\u00074:\u0005>Nȁ";
      f6222[12] = "1LeveN-Vg*\u007fZ=U,;{R;PvvvK7\u0010w19O6[o=9o6[o=UZ-[";
      f6222[13] = ":,_k6{&6]7,o65\u0016&+|0pM1-b&p{*(a'\u000bL,(}";
      f6222[14] = "(`)8-\u0005#o8wL\u000b(d<-";
      f6222[15] = "/[@\bf'vRVK\u001eƕ\u0011\u0001\u0019\r%'j\u0001BA\"F(\bUJ\u007f=(S\u0019M\u001eyz\u0001P\u001a/) \u0006Wq";
      f6222[16] = "S\u0017\fv\u001eV\u0015_L\u0018\t2ZL\nu\u0001T\u0010H\u000eyd\u0002\u0000\u001bZ}\u0002H\u0004\u001fV\u0018";
      f6222[17] = ":dP\n\u0018\u0010|,\u0010dȯt8oW\u0015\u001e\u0010bj[\u0002bM}6P\n\t\u0019~*\u0010d";
      f6222[18] = "rj/\u0014\u0011V+p$N{\u0002 jv\u001b\u0001nrj/\u0014\u0011V+p$N{";
      f6222[19] = ":0}\u000e9\u000e}2wLYՐ\u0006a$Ne^m7'E+0";
      f6222[20] = "m4#=}5?sqh\u0000&02E~a,44lOg-:4\u001d?zs?$%f`xeN";
      f6222[21] = "\u0003qr*8dZ*m5\u0002υ=s1'p;X*j8o";
      f6222[22] = "ZPf| \u0013\u0014^czBN\rMro:H\u000fXcx\tH\u000fVe\u0015\u007f\u0017\u0011\rq~)\u0014\u001aC\u001f(zUW_t~y^\u00191&%>\u0014\nJ&~r\u0013k\f'o~A\u0000Z$d0/";
      f6222[23] = "\u0003\u0001\u0017TK\u0000EIW:γd\u0003\u0000P\u0001P\u001f\u0003[\u001c\u00061]\nL\u0017[J]Q\u0000\u0010:\b\u001aY\u000bBQ\\\u0019EK,";
      f6222[24] = "\u0013\u0002Nb\u001a\u0010UJ\u000e\fեt\u0017\u000b\u000f0\u000e\u001fA\b\u0004~";
      f6222[25] = "\n\u0001:\u0001a^LIzoѸ:\b\n=\u001eg^R\u000f1\t\u001b";
      f6222[26] = "QUmF_j\bOf\u001c5=\u0007S\rk\u007fRW\u0017-\u0018[9\u0001\u0014&V5";
   }
}
