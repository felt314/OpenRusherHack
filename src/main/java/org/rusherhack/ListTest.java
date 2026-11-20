package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.window.ResizeableWindow;
import org.rusherhack.client.api.ui.window.content.component.ParagraphComponent;
import org.rusherhack.client.api.ui.window.view.ListView;
import org.rusherhack.client.api.ui.window.view.ListView$Column;
import org.rusherhack.client.api.ui.window.view.TabbedView;
import org.rusherhack.client.api.ui.window.view.WindowView;

public class ListTest extends ResizeableWindow {
   public ListView$Column f4567;
   public ListView$Column f4568;
   public List<HudItem358> f4569;
   public ListView<HudItem358> f4570;
   public TabbedView f4571;
   public static long f4572 = Class066.m4320(-3122947336232092419L, -6066675426798951758L, MethodHandles.lookup().lookupClass()).m4325(106084723204508L);
   public static String[] f4573;
   public static String[] f4574;
   public static long f4576;
   public static Object[] f4577 = new Object[26];
   public static String[] f4578 = new String[26];

   @Override
   public String getDescription() {
      return null;
   }

   @Override
   public WindowView getRootView() {
      return this.f4571;
   }

   public ListTest() {
    }

   static {
    }

   public static String m5835(byte[] var0) {
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
   public static void m1399() {
      f4577[0] = "\bD\u0014eNw\u0016L\u000e*,k\u0011Q";
      f4577[1] = "gp\u0017B\u0013(l\u007f\u0006\rr&gt\u0002W";
      f4577[2] = boolean.class;
      f4578[2] = "java/lang/Boolean";
      f4577[3] = "|nc<3}`ta`)ipw*Ȟ";
      f4577[4] = "nC/2!BpK5}LXiR8!nCkP";
      f4577[5] = "Fcx?\u00178Xkbp_8Baz7V#\u0002Va\u0017W9jw`=M.Cl";
      f4577[6] = "KDK{%)W^I'?=G]\u00026;5AXX{6,M\u0018Y<y+MXH: rs_B18+r_I\"\u001f=JR@0%\u001eEEI";
      f4577[7] = "5$u\\ga>+d\u0013\u001ay-,mZ";
      f4577[8] = "_^[\u0005\u00022CDYY\u0018&SG\u0012H\u001c.UBH\u0005\u00117Y\u0002IB^0YBXD\u0007iFEY\\^\u000bY_H}\u0019\"G";
      f4577[9] = "\b;B\u00127q\u0014!@N-e\u0004\"\u000b_*v\u0002gFS(i\u0006'A\u0012\u0006k\n$DR!Q\u0013 IO";
      f4577[10] = double.class;
      f4578[10] = "java/lang/Double";
      f4577[11] = "\u000b\u000b5\u001d*+\u0017\u00117A0?\u0007\u0012|P47\u0001\u0017&\u001d9.\rW'Zv)\r\u00176\\/p\u0012\u00107Dv\u0012\r\n&e1;\u0013]\u0011\\4+\t\u0017";
      f4577[12] = "M5PZnUQ/R\u0006tAA,\u0019ʐ";
      f4577[13] = int.class;
      f4578[13] = "java/lang/Integer";
      f4577[14] = "f?\u0000\u00051\u0006z%\u0002Y+\u0012j&IH/\u001al#\u0013\u0005\"\u0003`c\u0012Bm\u0004`#\u0003D4]\u007f$\u0002\\m'h/\u0005N'%`(\u0010";
      f4577[15] = "B[\fqY\u0007\u0004NON\n\u0014\u0011#Ov\u0004@\u0013Y\u0007*\u001aA}\u001a\brX\u001eC\\\u0006\u007fZx";
      f4577[16] = "f\u000f^\u000eDb=FV\u0004}ƈ\\\u000bC\u0013B7#MVP";
      f4577[17] = "D\u001cVc\u0015H\u001eMChi[\u0018\u0014Bh\u0013Q\u0019\u001e{g\u00150CH];U\u000f\u000fK]yi\u000b\u0012\u001dX}\u0011QC\bS\u0001";
      f4577[18] = "[\u000b\u0018YT(^Z\u001e\u0005e9eWO\u0003\u0019l\u001f\u0013Z]\n\u0015X\u0005F\u0019\u001co\u001c\u0010\u0018\ne";
      f4577[19] = "\u000b8~8\u0007;Pqv2>Ɍ1j%:\u0006/A`q4C";
      f4577[20] = "&\"c>|8j$(#C~\u001a{|&?+`?ix,R')u<:(c<+/C";
      f4577[21] = "\b8d\rz\u0018^%(\n\u0006IY+SRb]P!\u0018\biFI>bL|\u0018ZG#XjBI?y\t\u007fI5xwJ6\u001cP{rW7 \u0005vbQ~^G }D\u0006";
      f4577[22] = "\u0005AJO\u0001W^\bBE8Ȇ?GPT\u0000D\u0007\u0011M\u0018\u0007";
      f4577[23] = "]>/\u001b3d\u0015spD\rԴmq#\u001eqz\u001756@b";
      f4577[24] = "\u0006e\t\u001c'TPxE\u001b[\u0005Wv>C?\u0011^|u\u00194\nGc\u000f]!TT\u001aE\u0015!\bCd\u0007C>\u001d;";
      f4577[25] = ",|\u0000\u0018E\u0014d1_G{Ԝ\u001c?\u0006\u0015\u001c\t-3\u0006\u001a\t";
   }
}
