package org.rusherhack.client.api.ui.window;
import org.rusherhack.*;

import java.util.Iterator;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.view.WindowView;

public abstract class WindowViewHandlerBase {
   public WindowHandlerBase windowHandler;
   public static String[] f949;
   public static Object[] f951 = new Object[32];
   public static String[] f952 = new String[32];

   public boolean handleViewMouseClicked(WindowView var1, double var2, double var4, int var6) {
        return false;
    }

   public WindowViewHandlerBase(WindowHandlerBase var1) {
      this.windowHandler = var1;
   }

   public void handleRenderViewContent(WindowView var1, double var2, double var4) {
      var1.renderViewContent(var2, var4);
   }

   public static void m2232(String[] var0) {
      f949 = var0;
   }

   public static String[] m2233() {
      return f949;
   }

   static {
    }
   public static void m122() {
      f951[0] = "\u001e\u0015%h2G\u0002\u000f'4(S\u0012\fl%,[\u0014\t6h!B\u0018I7/nE\u0018\t&)7\u001c&\u000e,\"/E'\u000e'1\bS\u001f\u0003.#2p\u0010\u0014'";
      f951[1] = "o\u0011\f3/\u007f\u001a1\u0007<>0g)\u0014;7y\u000f";
      f951[2] = "$\u0005\u000f\u001d2WQ%\u0004\u0012#\u0018,=\u0017\u0015*QD";
      f951[3] = void.class;
      f952[3] = "java/lang/Void";
      f951[4] = "f/+NP\u0017x'1\u00017\u0016i<<[\u0011\u0010";
      f951[5] = "s*AC_\u001fx%P\f>\u0011s.TV";
      f951[6] = "fFI\u000eqIz\\KRk]j_\u0000CoUlZZ\u000ebL`\u001a[I-K`ZJOt\u0012\u007f]KW-k`ZJOtj`QY";
      f951[7] = "vj@go\u0002hbZ(\r\u001eo\u007f";
      f951[8] = "\u0002\"$X\u001d]\u001e8&\u0004\u0007I\u000e;m\u0015\u0003A\b>7X\u000eX\u0004~6\u001fA_\u0004>'\u0019\u0018\u0006:9-\u0012\u0000_%1-\u0012\u0003M\u001f\u0012\"\u0005\n";
      f951[9] = "?4'9.:#.%e4.3-nt0&5(49=?9h5~r89($x+a\u0007/.s38\u0013).c9!$\u000e!y8#54\u0002v/*";
      f951[10] = "\u0007E";
      f951[11] = "m7X8\u000f[q-Zd\u0015Oa.\u0011u\u0011Gg+K8\u001c^kkJ\u007fSYk+[y\n\u0000a*Qb\u0018@vkh\u007f\u0013Jm2|y\u0013Zg+K";
      f951[12] = double.class;
      f952[12] = "java/lang/Double";
      f951[13] = int.class;
      f952[13] = "java/lang/Integer";
      f951[14] = boolean.class;
      f952[14] = "java/lang/Boolean";
      f951[15] = "\u0001?\u0001p\u001a\u0010\u001d%\u0003,\u0000\u0004\r&HȪ";
      f951[16] = "BTB\\E\nI[S\u00138\u0012Z\\ZZ";
      f951[17] = char.class;
      f952[17] = "java/lang/Character";
      f951[18] = "+,NOM(}.^V5r}2I?\t.`-\u0005UM+!\u007f5";
      f951[19] = "oa'\u0001^&b;+1ĀO:(gZ\u001a-c3k\u000bd";
      f951[20] = "Z(\u0007{D]\u001cv\u001a&.X\u000bk*\u007fHK\u000bq\u001d\u0018\u0013\u000e\u0005~\u0013'ER\u0004~a";
      f951[21] = "fA v~R \u001f=+\u0014B7\u0018*xnf;\u00139^s^&\u0013 i\u0014\b5\u00139,+X:@8\u0015$W7\u0001\u007f*tXd\u0000F/xEdC{(*T9~";
      f951[22] = "d\u0007\u001dUk\fg\u0003\u0010OV\u00114\u001e6K0\u00024\u0004\u0001l?\u00185\u0006\u0010VV@%\u001c\u001cT6\u001f7\u0002C,";
      f951[23] = "{/z\u001d>z$=dBFҬEln\u001a# |1g\u001f|\u001a";
      f951[24] = "=VG^L-%MFTv#:Q\u0011O\u0016Gf]\u0017N\u0019z,\n\u0000^v";
      f951[25] = "FKvf\u0014:\u0010\u0017wffd\u0007\u001fof\u001ab\u0001r.a\u001du\u0003Nxc\rl{";
      f951[26] = "\u007f\u007fpC\u001d\u0016r%|sЋ\u007f*60\u0018Y\u001ds-<I'E\u007f:3N\u001aB-+ns";
      f951[27] = "p7G\u000b@h}mK;\u0005`zc]D:hzc^V\u0000\u0001!jZBGs\"nWX";
      f951[28] = "7\u001a\"\u000ekRh\b<Q\u0013R`\u00000\u000b~wn\u001b'\u0002XVh\r?\u0002\u007f26\u0001eSv^0\n \u0001\u0013\u0002f\u000b#V,RiX\"o#]d\u0019ePsR7\u0018\\^y[t\ta\u0014.Ldf`PuQc\f&\u000eh\f\t\u000f7\tpW5\u0003-\u0015)2";
      f951[29] = "2\u0013n\u0006\u0007F?Ib6T/7WaW[\u001f.T|_=F\"YrP\r_!Dz6";
      f951[30] = "7X<O\f'aZ,Vt{eM\u0001R\u0004g\f_,Y\u0017~0S6EN\u001b";
      f951[31] = "Jqrn%'Rjsd\u001f&@y1JcM\u0011z\"~pp[-5n\u001f'Rus|u/@*!\u0003";
   }

   public WindowViewHandlerBase() {}
}
