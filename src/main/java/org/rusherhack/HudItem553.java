package org.rusherhack;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.ListItemContent;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.client.api.ui.window.view.ListView$Column;

public class HudItem553 extends ListItemContent {
   public File f8922;
   public static long f8924 = Class066.m4320(-301180553295513467L, 2358122872789127207L, MethodHandles.lookup().lookupClass()).m4325(193256742468638L);
   public static String[] f8925;
   public static String[] f8926;
   public static Object[] f8928 = new Object[37];
   public static String[] f8929 = new String[37];

   public boolean m2928() {
      return this.m17116().equalsIgnoreCase(Class170.f3364.m7107().m14145());
   }

   public String m17116() {
      return this.f8922.getName().replace(".json", "");
   }

   public HudItem553(Configs var1, Window var2, File var3) {
    }

   @Override
   public String getAsString(ListView$Column var1) {
        return null;
    }

   @Nullable
   @Override
   public List<ContextAction> getContextMenu() {
        return null;
    }

   @Override
   public void onDoubleClick() {
      String var4 = this.m17116();
      Class446 var10000 = Class170.f3364.m7107();
      boolean var10004 = true;
      var10000.m14147(var4, true);
   }

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
   public static void m157() {
      f8928[0] = "M)f\u0001\u000f\fS!|Nm\u0010T<";
      f8928[1] = "-9fMk\u0006&6w\u0002\n\b-=sX";
      f8928[2] = boolean.class;
      f8929[2] = "java/lang/Boolean";
      f8928[3] = "tm,\u0014\"ehw.H8qxteY?b~1>N9|h1\u0006[$xNk\"V#";
      f8928[4] = "*2$C(Z!=5\fUB2:<E";
      f8928[5] = "&hO\u0002\u0015&:rM^\u000f2*q\u0006Ȫ";
      f8928[6] = int.class;
      f8929[6] = "java/lang/Integer";
      f8928[7] = "~[\u0013|,:bA\u0011 6.rBZ՟";
      f8928[8] = "d,T\u000bcAx6VWyUh5\u001dɑ";
      f8928[9] = "r]\u0002qPTnG\u0000-J@~DKĴ";
      f8928[10] = "S\u001c\u000fDSOO\u0006\r\u0018I[_\u0005Fч";
      f8928[11] = void.class;
      f8929[11] = "java/lang/Void";
      f8928[12] = "Y_\u000eN\noEE\f\u0012\u0010{UFGȌ";
      f8928[13] = "JTO[j\bO\u001b\u007fS(\u0004";
      f8928[14] = ":#]Qv\b&9_\rl\u001c6:\u0014\u001ch\u00140?NQe\r<\u007fO\u0016*\n<?^\u0010sS#8_\b*1<\"N)m\u0018\"uy\u0010h\b8?";
      f8928[15] = "\u00110s\f\u0016k\r*qP\f\u007f\u001d):A\bw\u001b,`\f\u0005n\u0017laKJi\u0017,pM\u00130\b+qUJR\u00171`t\r{\t";
      f8928[16] = "A7|E\fXJ8m\na\\J.YASAN8iA";
      f8928[17] = "f;\u0007\u0011C\u001fl0\u0004l\u0015\u0001ePW\u0000\u001b\rl1_\u0003\u001a\b\ti\u000bT\u0004]ml\u000f\u0012\u001fm";
      f8928[18] = "(epsgW,cv\"W\u001b\u00121# mMp;sb87)cs#-U#31vW";
      f8928[19] = "yeR-MvyqVr7ԕG>\u0015aNu5:C{\f\u000f";
      f8928[20] = "\u00061\f\u0004\u0011@\faNQkXP QW\u0000O=2W^\u000eP\u0006>[T\u0006\"W:U[\u0019\u0019[6_Sk\u0019Ta\u000fD\t\u0013\u0004#Z>";
      f8928[21] = "6CKT>hv\u0002P@\u0003Ȏ\nG\u000e\u0014bli\tW\u0012}W";
      f8928[22] = "Z)\u0017vU7Z=\u0013)/ϰds\u000e6\u00124\u001ds\u001a2M";
      f8928[23] = "\u0006M|n@D\u0007Sk`:IZ]\\k_K7\u001as;\u0000\\U\u0010#yU&";
      f8928[24] = "d)\u001b.\u0005f;!Z??¼Tu^<[k0+X7UZ";
      f8928[25] = "BR&\u007fB\u000f\u001dI4l+ˤ\u007f\b$kG\r\u001d\t:|I";
      f8928[26] = "Er\u001aZn\u001c\u001az[KTÆuw\u001dM1\u001c\u000fe\u0007I=";
      f8928[27] = "}b'iWY\"y5z>ѹ@0,#F\u0011$5(e]!";
      f8928[28] = "GipC7(\u0018a1R\rωw4q\u0004mp\u001e<c\u0006d";
      f8928[29] = "\u0015i#k|sJr1x\u0015Ϋ(2!fk1\u0014m)'z";
      f8928[30] = "-\fz\u00059v)Z`GC\u007f\u0012\rbEy~p\u00072\u0007,\u0004+S3\u0004s`.Wu\u001fC4(ZoM'j.Qa|";
      f8928[31] = "d\u0018?0Pme\u0006(>*c8\u00104 G\u000fl\u0011a$\u001aki\u0015'?*";
      f8928[32] = "L\u0010&^\u001ew\fQ=J#γp\u00135\u001c\u00192\u0012\u0019e^LHKAe\u001fY*A\u0011'J#";
      f8928[33] = "<dI\u001a#\u0017c\u007f[\tJӝ\u00014NQp\u0015c>\u001e\u0013%o";
      f8928[34] = "8 Q]/)<vK\u001fUӫ\u0007!I\u001do!e+\u0019_:[";
      f8928[35] = "uNm\u001aVt\u007f\u001e/O,{7Z=DWW!A3ZA]'\\9 \u0017\u007fw\u001d.B\u001d/5HT\u0019I.6\u00170\u001cMh-'";
      f8928[36] = "1W/)\u001drnL=:tc\f\u0002zb\bdeW#9\u0019\n2\u0007x'\u001acg^#6t";
   }
}
