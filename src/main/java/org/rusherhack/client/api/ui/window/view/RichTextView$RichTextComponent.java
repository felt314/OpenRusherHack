package org.rusherhack.client.api.ui.window.view;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.Class066;
import org.rusherhack.Class507;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.component.ParagraphComponent;
import org.rusherhack.client.api.ui.window.context.ContextAction;

public class RichTextView$RichTextComponent extends ParagraphComponent {
   public Text f1053;
   public static long f1054 = Class066.m4320(-6527074746650459619L, 4015225189408042439L, MethodHandles.lookup().lookupClass()).m4325(254683268100189L);
   public static String f1055;
   public static Object[] f1056 = new Object[39];
   public static String[] f1057 = new String[39];

   public RichTextView$RichTextComponent(Window var1, Text var2) {
      super(var1, Formatting.strip(var2.getString()));
      this.f1053 = var2;
   }

   public RichTextView$RichTextComponent(Window var1, String var2) {
      super(var1, var2);
      this.f1053 = null;
   }

   @Nullable
   @Override
   public List<ContextAction> getContextMenu() {
        return null;
    }

   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
        
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
   public static void m786() {
      f1056[0] = "hT-\u0019l>v\\7V\u000e\"qA";
      f1056[1] = "PF~\u0017\u0012x[IoXsvPBk\u0002";
      f1056[2] = boolean.class;
      f1057[2] = "java/lang/Boolean";
      f1056[3] = "\u0010iw\tpM\fsuUjY\u001cp>҇";
      f1056[4] = "/r\u0000\t,\u000e$}\u0011FQ\u00167z\u0018\u000f";
      f1056[5] = "lV$a\u0011tpL&=\u000b``Om,\u000fhfJ7a\u0002qj\n6&MvjJ' \u0014/`K-;\u0006ow\n  \u000eqlJ&!\u0017/WA;; nnT,!\u0006ow";
      f1056[6] = "/\b3|yK/\b$ uD5C$>uQ22tc$";
      f1056[7] = "`-Z\u0012&\u0003`-MN*\fzfMP*\u0019}\u0017\u001d\fr";
      f1056[8] = "8\u0011.D\u00191$\u000b,\u0018\u0003%4\bg\t\u0007-2\r=D\n4>M\u000e\u0006\u0004&6\u000f:";
      f1056[9] = void.class;
      f1057[9] = "java/lang/Void";
      f1056[10] = "|9Hd\u001f$`#J8\u00050p \u0001)\u00018v%[d\f!zeZ#C&z%K%\u001a\u007fe\"J=C\u0006z%K%\u001a\u0007z.X";
      f1056[11] = "c:i''\u0001\u0016\u001ab(6Nk\u0002q/?\u0007\u0003";
      f1056[12] = "6\u0004\u007fc\u00050*\u001e}?\u001f$:\u001d6.\u001b,<\u0018lc\u001650Xm$Y20\u0018|\"\u0000k/\u001f}:Y\u00170\u0015p\u0019\u0012=- q(\u0000a\u000b\u001f{%# !\u0002[\"\u001a56\u0018}#\u0003";
      f1056[13] = "\u0016\u0010'C\r:\u0016\u00100\u001f\u00015\f[0\u0001\u0001 \u000b*aXVb";
      f1056[14] = "TO\n\u0007w\u0000HU\b[m\u0014XVCJi\u001c^S\u0019\u0007d\u0005R\u0013\u001fLk\u0011^OCOj\u001bO\u0013$oj\u001bOo\bGa\u0010IX\u001f";
      f1056[15] = "ETd[&IETs\u0007*F_\u001fs\u0019*SXn%F\u007f\u0018";
      f1056[16] = double.class;
      f1057[16] = "java/lang/Double";
      f1056[17] = int.class;
      f1057[17] = "java/lang/Integer";
      f1056[18] = "xJC`FCdPA<\\WtS\n-X_rVP`UF~\u0016Q'\u001aA~V@!C\u0018tWJ:QXc\u0016s'ZRxOg!ZBrVP";
      f1056[19] = "\r\u0007r\u000bqQ\u0011\u001dpWkE\u0001\u001e;FoM\u0007\u001ba\u000bbT\u000b[`L-S\u000b\u001bqJt\n\u0001\u001a{QfJ\u0016[vJnT\r\u001bpKw\n2\u0014gDdV\u0003\u0005}flI\u0012\u001a{@mP";
      f1056[20] = "~:\u001e_\"\u0010b \u001c\u00038\u0004r#Wȅ";
      f1056[21] = "S^L>4zB\u0006M^7i_;\u000fod:Y\u0002[=ae3\u0002U\"#`ZYJ:b\u0005";
      f1056[22] = "5*V=&\u0011lpV1KƱ\u000f{U74\u0012i~\u0011f$h4}\u0003#1\u000e19R3K";
      f1056[23] = " euBLZ v\"F+_vcN\u0012[L\u001b$/\u0014TJ}!kED0";
      f1056[24] = "!~mBD\u0015phnO)ϕ\u001e(xEJHql{\u0018Cs";
      f1056[25] = "k~oXx4+|wGEč[0vQ9okz,\u0006/";
      f1056[26] = "4\u007f\u0014Feq\":FB\u001ex')Z%sd!@L\u0018!i\"|W\u001a|q]*N\t$z1&\u001f\u001fp\u00147+UCpx;zC\u0017\u001e\u007f3~O\u000bu{a\"[yt\u007f-zK\u0015x.;.%\u0013udg.I\u001f$r3@O\u0012n.3,CCxz]";
      f1056[27] = "g\u000b\u001e8X\u007fv^B|'ufMo`AfQ\\GkJ`fK!n\u0018+4JDx]y01";
      f1056[28] = "\u00162~Z2FW4rU]CK5'W\n\u0014\u0015g\u007f;`DIa ^8V\u0013<";
      f1056[29] = "CC0KJ\r@\u000e1WwNFE>K\u000b6\u0010V>\u0011\u001aPA@=\u001c";
      f1056[30] = "iS\u001eX}4x\u0006B\u001c\u0002!\u0005\u0003J\u00178?i\u000f\u001b\u0001l";
      f1056[31] = "\\K}oa\f\u001eY~i\u000b\u0014\n3?h6\u0010\u000eX~n:\u001f";
      f1056[32] = ")\u0014b^\u0013\u001b8A>\u001al\u000fED6\u0011V\u0010)Hg\u0007\u0002";
      f1056[33] = "4,_k(e7a^w\u00155?4[w\u001556nV\u007f~1d2B";
      f1056[34] = "\u0016&\u0014\bSjV$\f\u0017nc&5\u0013\u0007\u0016cXc\u0011\t\u0017\nJ'\r\u001f\u0007t\u001c%\u0003\u001en";
      f1056[35] = "fnH\u0015\u0005Ue#I\t8\nktF(@\u0007asM\u001c8\u0004ab\u0011\u001dT\b0tE";
      f1056[36] = "f}\\[=T7k_VP]4ho\u0006=M\u0006u]\u001b023\u007fA]>^?.W\tP";
      f1056[37] = "~7r)J\u000b&%(t)\u000b.\"qwE9zb,-)U~5njOP:d~\u0010\u0017\u000f$ {|[\u0013/f\u0011";
      f1056[38] = "\rec7\u0010?\u000e(b+-d\fxo1QO\br`<-n\ni:?Ab[\u007fn";
   }
}
