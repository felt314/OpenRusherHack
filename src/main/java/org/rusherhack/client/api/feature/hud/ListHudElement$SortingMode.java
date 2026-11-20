package org.rusherhack.client.api.feature.hud;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.command.exceptions.DispatchException;

public enum ListHudElement$SortingMode {
   ALPHABETICAL,
   LEXICOGRAPHICAL;

   public Comparator<ListHudElement$ListItem> comparator;
   public static long f635 = Class066.m4320(-6537546190819874568L, -411177967961766224L, MethodHandles.lookup().lookupClass()).m4325(77123986522886L);
   public static Object[] f636 = new Object[24];
   public static String[] f637 = new String[24];

   ListHudElement$SortingMode(Comparator<ListHudElement$ListItem> var3) {
      this.comparator = var3;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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
      f636[0] = "{\u0004>\u0013QBp\u000b/\\:@d\b";
      f636[1] = "2\u001d\u0017\u00003\u001f9\u0012\u0006O^\u001f9\u000f\u0012";
      f636[2] = "+]#U+U R2\u001aVM3U;S";
      f636[3] = "xI\b0DwdS\nl^ctPA}ZkrU\u001b0Wr~\u0015\t{WvbI\n0^ws\u0015#wEv_N\u000b[Zgz^\u0001j\u0012QxI\u001bwXeZT\u000b{";
      f636[4] = "M!qWV,d\u0018mMTp~\f}N\u001faz\u0004{KE,w\u001dw\u000bWgw\u0019kWT,~\u0018z\u000b}ke\u0019VPUGz\bs@_v2>qWEkx\nSJUg-";
      f636[5] = "\u0019\u0016>$\t\u0007\u0005\f<x\u0013\u0013\u0015\u000fwi\u0017\u001b\u0013\n-$\u001a\u0002\u001fJ?o\u001a\u0006\u0003\u0016<$\u0013\u0007\u0012J\u0015c\b\u0006>\u0011=O\u0017\u0017\u001b\u00017~_>\u001f\u0017-C\u000f\u0017\u001b";
      f636[6] = double.class;
      f637[6] = "java/lang/Double";
      f636[7] = "$xc9E<\rA\u007f#G`\u0017Uo \fq\u0013]i%V<\u001eDeeDw\u001e@y9G<\u0017Ahen{\f@D>FW\u0013Qa.Lf[gc9V{\u0011SA$FwD";
      f636[8] = "$uW\u0015\u001aL:}MZwV#d@\u0006UM!f";
      f636[9] = "C+GD{V]#]\u000b3VG)EL:M\u0007\fDK6W@%_";
      f636[10] = "=uN\u007fCZ!oL#YN1l\u0007ț";
      f636[11] = "m\f>'Eos\u0004$h\roi\u000e</\u0004t)9'\u0002\u0004oe\u0001-\u0000\u001etd\u0019!)\u0005";
      f636[12] = "\u001e\u001bQ\u0018?Y\u0002\u0001SD%M\u0012\u0002\u0018U\"^\u0014GUY A\u0010\u0007R\u0018(T\u0012\fFB$C\u001f\u001a\u0018r$_\u0001\bBU%i\t\nSF9E\u001e\u0007";
      f636[13] = "-s\u0016T:h&|\u0007\u001b[f-w\u0003A";
      f636[14] = "[N\u0000\t\u001al\u0013\u0014\rOsӪaILJ\u001eg\u0005I\fU\u0013\r";
      f636[15] = "9KBF2%{WD\u001fU7cUF\u0010/=b_>G9%?N\\\u000585z0\u0003\u0002)ccIA\u001e/:\u0004";
      f636[16] = "c\u0006e\u0018h\u0001$\u0006`E\u0019Β\\\u0000c\u000f T`EyC|9eBjDt\u0005 X&\u0018\u0019";
      f636[17] = "LMkA\u001fm\u000eQm\u0018x\u007f\u0016So\u0017\u0002u\u0017Y[\u0019\u0005~\u0015[\u0017A\u0004)\u0003\u000e/\u0011\u0011zM6*\u0005\u0004+\u0016Oh\u0019\u0002rq";
      f636[18] = "I~]?c}\u0001$Py\nȬsy\u0011|gv\u0017yQcj";
      f636[19] = "\u0017zlZ\"O_ a\u001cKj`\u0011\u001c+\faw\b\u0005 \ned\u0005]Zp\u001f\u0017(<\u0012*\u0012Q";
      f636[20] = "\u001a z:\u0016\rH2\u007fndZL-\u001aa\bIAQyy\bW\u001c3?9\rK!";
      f636[21] = "\u0002\u001c=eG-JF0#.\u0005|\u007fL\u0016d\u0001dfG\u0016jL\u0002\u001c=eG-JF0#";
      f636[22] = "jP8lx\u00192Xq\u0001~@g\u0015mFn)s\u001a{l|Wm\u000ee\u00019RqQm=|H=\r\u0000h8\u0011n\u0010000X\u0003";
      f636[23] = ">yjug\u0015i\u007f1{W\u0000\u000e-ubnA2ho.2,7o|):\u0010ru0uW";
   }

   ListHudElement$SortingMode() {}
}
