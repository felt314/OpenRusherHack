package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.window.PopupWindow;
import org.rusherhack.client.api.ui.window.content.component.TextComponent;
import org.rusherhack.client.api.ui.window.view.SimpleView;

public class POPUP extends PopupWindow {
   public static long f3174 = Class066.m4320(-7187167024179338267L, -6012756585598614610L, MethodHandles.lookup().lookupClass()).m4325(191742063955596L);
   public static String[] f3175;
   public static String[] f3176;
   public static Object[] f3178 = new Object[13];
   public static String[] f3179 = new String[13];

   public POPUP() {
      super("POPUP!", null, 150.0, 50.0);
      ((SimpleView)this.getRootView()).setTopPadding(20.0);
      this.addContent(new TextComponent(this, "this is a popup!"));
   }

   static {
    }

   public static String m1491(byte[] var0) {
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
   public static void m1731() {
      f3178[0] = " myt\\Z<w{(FN,t09BF*qjtO_&1x?O[:m{tYF!{q-\u0000\u007f ok*yF!{q-";
      f3178[1] = "k>R-Nxw.PqTlg'\u001b`Pda\"A-]}mb@j\u0012zm\"QlK#g#[wYcpbbjRik;vlRya\"A";
      f3178[2] = void.class;
      f3179[2] = "java/lang/Void";
      f3178[3] = "\u0015I[D8v\tSY\u0018\"b\u0019P\u0012\t&j\u001fUHD+s\u0013\u0015I\u0003dt\u0013UX\u0005=-\fRY\u001ddP\u0013VL\u0006/U\u0013^K";
      f3178[4] = double.class;
      f3179[4] = "java/lang/Double";
      f3178[5] = "P\u0005\" +YL\u001f |1M\\\u001ckm5EZ\u00191 8\\VY0gw[V\u0019!a.\u0002I\u001e yw{V\u0019!a.zV\u00122";
      f3178[6] = "B\f\u001d(mP^\u0016\u001ftwDN\u0015TȀ";
      f3178[7] = "\u001cq{WK}\u0017~j\u00186e\u0004ycQ";
      f3178[8] = "gl8XxMlc)\u0017\u0019Cgh-M";
      f3178[9] = "\u0012^>>3\u0005F\u00028\u0006:\tW;=a):J\f%\u0006n\u0019L\u0010cv8^V\u000eZ";
      f3178[10] = ")HBGoFpAI\u0015\u0015\u0380\u0015\u001bWLk\u0007gERL/{(H\u0002\ti\tvM\u0002M\u0015";
      f3178[11] = "\td\u0006K}\u0013]8\u0000sr\u001e\\\u0010\u0005\u0015g\u001fV'bJ%\u0016W+\f\u001c|K][[\u0017pCJ!\u001e\u0001cB0";
      f3178[12] = "'3\u000b&\u001c|';\u0007tpwp&)|\bTt6\u0019z\u0016c\u001d`\tt\u001djq*\u0007t\u001b\f$>\u001e*\nva(\r+p";
   }
}
