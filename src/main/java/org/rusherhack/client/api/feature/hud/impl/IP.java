package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.hud.TextHudElement;
import org.rusherhack.core.setting.BooleanSetting;

public class IP extends TextHudElement {
   public BooleanSetting port;
   public static long f2507 = Class066.m4320(2266978702413031491L, -1009806509316701728L, MethodHandles.lookup().lookupClass()).m4325(248961204044495L);
   public static String[] f2508;
   public static String[] f2509;
   public static Object[] f2511 = new Object[34];
   public static String[] f2512 = new String[34];

   public IP() {
      super("IP");
      boolean var10008 = true;
      this.port = new BooleanSetting("Port", true);
      this.registerSettings(this.port);
   }

   @Override
   public String getText() {
      String var5 = Globals.mc.getCurrentServerEntry() != null ? Globals.mc.getCurrentServerEntry().address : "Singleplayer";
      if (var5.contains(":") && !(Boolean)this.port.getValue()) {
         var5 = var5.substring(0, var5.lastIndexOf(":"));
      }

      return var5;
   }

   static {
    }
   public static String m221(byte[] var0) {
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
   public static void m273() {
      f2511[0] = "\u0003\u0019\u000f0Y&\b\u0016\u001e\u007f5%\u0006\u0014\u001c0\u0019";
      f2511[1] = boolean.class;
      f2512[1] = "java/lang/Boolean";
      f2511[2] = "3\u0010TX' /\nV\u0004=4?\t\u001dц";
      f2511[3] = "bK^? ViDOp]NzCF9";
      f2511[4] = "QW%j\u0013-MM'6\t9]Nl'\u000e*[\u000b$!\u0000,KW'j(\u001e[D61\u0013=}J,\"\b?KW#&\r=";
      f2511[5] = "g;*Xd[N\u00026Bf\u0007T\u0016&A-\u0016S\u0005 \u0004p\u0010H\u0003,Dd[o\u00121^j\u001b[L";
      f2511[6] = void.class;
      f2512[6] = "java/lang/Void";
      f2511[7] = "uWKa-\u001fiMI=7\u000byN\u0002ŉ";
      f2511[8] = "\u0014[\u0007y`\t\bA\u0005%z\u001d\u0018BN4}\u000e\u001e\u0007\u00132f\b\u0012G\u0007yP\u0013\u0014E\u00056|/\u001e]\u0014>|\u001b";
      f2511[9] = "bcj\u0004+ubc}X'zx(}F'o\u007fY(\u001et";
      f2511[10] = "Yy\u0015Rw}Yy\u0002\u000e{rC2\u0002\u0010{gDCRM*";
      f2511[11] = ".6`K\u0015i%9q\u0004xm%%EOJp!9uO";
      f2511[12] = "-\u001dCEIw1\u0007A\u0019Sc!\u0004\nɭ";
      f2511[13] = int.class;
      f2512[13] = "java/lang/Integer";
      f2511[14] = "AC\u000e\\o@]Y\f\u0000uTMZGȆ";
      f2511[15] = "\u0015\u001c~H8\"\t\u0006|\u0014\"6\u0019\u00057\u0005&>\u001f\u0000mH+'\u0013@^\n%5\u001b\u0002j";
      f2511[16] = "\u001d\u001a*y5n\u0001\u0000(%/z\u0011\u0003cշ";
      f2511[17] = "\u0000V\u001chm8\u001cL\u001e4w,\fOU%p?\n\n\b#k9\u0006J\u001chL(\u001bP\u0012(x";
      f2511[18] = "x\u0018U;\u0016\ts\u0017Dtw\u0007x\u001c@.";
      f2511[19] = "\u001aR[.\u001fI\u001c\b\u00167fXE^\u0000:1\r\u001b\r]V\\]MJ\u001a5\u001fD_I";
      f2511[20] = "L)\u000fc\u00136J,\u0019\n\u00002N/\u0012M\u0010[\u0013i\u000e{\u0005+G+\u001bt~=Q\"\u0016g\u0013;T4\u007f";
      f2511[21] = " t.l\u0005N`& +xAr1,4\u0014s&pqcx\u001a~r4*\u0007\u001c$?-S";
      f2511[22] = "nm-\u001er\u0000-t?\u001d\f\b3`8\u000em\u0005/\u0006{\u0001e\u001d%w:\u0015pST?\u007f\u0016}\u0018$k=\u0003rc";
      f2511[23] = "I=\u0007s\f0EwZnmȇx4[l\u0006=\u0016?Qs\u001c^";
      f2511[24] = "\u001bn@\\\r;Mc\u001c\u0003=ѐ\"(\u0015\bD)Ak\f\u001aGW\u0018y\u0017\u0018C4[`\u0005\u001b=";
      f2511[25] = "Y\u0013T\u001e\u0011\u001c\\\u0014L\u000fx\fdCE\u001dB\u0005\bK\u0006\u0016\u001feU\u0000[K\u0018\t]CP\u0016x";
      f2511[26] = "GwS\u0005O\u0007ArElH\rFhN\u0005D4Hh^\u0001\"S\u001a}R\u0017R\u0007Xh]l";
      f2511[27] = "\u000fw\u0014e\u0010\fH \u000bh~FYw\u0010.\u0002QNC\u001c)\u0002]Rw\nUEMIr\u000b-\u001bM\nxqi\u0004\r\niH-\u000e\u0003L\u0018";
      f2511[28] = "o\u0004\u000e2\u0019|`\\X`p)ma\b;\u0012s{\u000bHi\u001c4";
      f2511[29] = "ykDn\u000f1:rVmq6*{QV\u0017>.pjyqh(iTi\u0012+1{W\u0017@1?kNyK; q-";
      f2511[30] = "Pzu~\tpXwyvdϏ:-\u007f.\u001diYnf<\u001e\u0017\u0000|}>\u001atCeo=d";
      f2511[31] = "\u0018wm(+~[n\u007f+Uf_v\u007f-/|Ds\u0004`6aI\u007fjk<~S\u001c52)vAr>86l\"&o8,cAev*/\u001d";
      f2511[32] = "9\u00127s)2<\u0015/b@Ȟ\u0004Mid#4y\u001eld'";
      f2511[33] = "$r]5,\f#pV8V\u0004\"cj22\u0016\"\u001f_;/\u0010/&X+&\u0017O";
   }
}
