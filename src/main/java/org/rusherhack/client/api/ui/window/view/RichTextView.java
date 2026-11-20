package org.rusherhack.client.api.ui.window.view;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.text.Text;
import org.rusherhack.Class066;
import org.rusherhack.client.api.feature.window.Window;

import org.rusherhack.command.clear;
public class RichTextView extends ScrollableView {
   public Queue<RichTextView$RichTextComponent> f1058;
   public List<RichTextView$RichTextComponent> f1059;
   public static long f1060 = Class066.m4320(3055854413473217516L, -1279658469137801241L, MethodHandles.lookup().lookupClass()).m4325(190990543498312L);
   public static long f1061;
   public static Object[] f1062 = new Object[37];
   public static String[] f1063 = new String[37];

   public RichTextView(Window var1) {
    }

   public void newComponent(RichTextView$RichTextComponent var1, int var2) {
        
    }

   @Override
   public void renderViewContent(double var1, double var3) {
        
    }

   public RichTextView(String var1, Window var2) {
    }

   public void clear() {
        
    }

   @Override
   public boolean shouldClampToBottom() {
      boolean var10002 = true;
      return true;
   }

   public void add(String var1, int var2) {
        
    }

   public void add(Text var1, int var2) {
      RichTextView$RichTextComponent var6 = new RichTextView$RichTextComponent(this.getWindow(), var1);
      this.newComponent(var6, var2);
   }

   static {
   }
   public static void m343() {
      f1062[0] = "\u0005~\rnS\u0018\u0019d\u000f2I\f\tgD#M\u0004\u000fb\u001en@\u001d\u0003\"\u001f)\u000f\u001a\u0003b\u000e/VC\u001ce\u000f7\u000f?\u0003o\u0002\u0014D\u0015\u001eZ\u0003%V";
      f1062[1] = "\u0006}E4HZ\u001agGhRN\nd\fyVF\faV4[_\u0000!Ws\u0014X\u0000aFuM\u0001\u001ffGm\u0014}\u0000lJN_W\u001dYK\u007fM\u000b;fArnJ\u0011{auW_\u0006aGtN";
      f1062[2] = int.class;
      f1063[2] = "java/lang/Integer";
      f1062[3] = void.class;
      f1063[3] = "java/lang/Void";
      f1062[4] = "\u001e9)Q9'\u0002#+\r#3\u0012 `ȋ";
      f1062[5] = "f\u0014V},\fm\u001bG2Q\u0014~\u001cN{";
      f1062[6] = "{h3\u001f\rApg\"P`Ep{\u0016\u001bRXtg&\u001b";
      f1062[7] = boolean.class;
      f1063[7] = "java/lang/Boolean";
      f1062[8] = "cI\u0003\f.C\u007fS\u0001P4WoPJA0_iU\u0010\f=Fe\u0015\u0011KrAeU\u0000M+\u0018zR\u0001UraeU\u0000M+`e^\u0013";
      f1062[9] = "00&R\u0016,E\u0010-]\u0007c8\b>Z\u000e*P";
      f1062[10] = char.class;
      f1063[10] = "java/lang/Character";
      f1062[11] = "\u0011)4\u0012\u000f~\r36N\u0015j\u001d0}_\u0011b\u001b5'\u0012\u001c{\u0017u&US|\u001757S\n%\u001d4=H\u0018e\nu\u0004U\u0013o\u0011,\u0010S\u0013\u007f\u001b5'";
      f1062[12] = "QW:he\u0016MM84\u007f\u0002]Ns%{\n[K)hv\u0013W\u000b;#v\u0017KW8h`\nPA2194WK9)`";
      f1062[13] = "M\u0006KhT\tM\u0006\\4X\u0006WM\\*X\u0013P<\rs\u000fQ";
      f1062[14] = "\u0010`\u0006 \u0006\u001a\u0010`\u0011|\n\u0015\n+\u0011b\n\u0000\rZG<^C";
      f1062[15] = ".!xV{\u00190)b\u0019\u0004\u0019!5k";
      f1062[16] = "\u0004'4\u001ag\u0017\u000f(%U\u0006\u0019\u0004#!\u000f";
      f1062[17] = "`#l$N\b|9nxT\u001cl:%iP\u0014j?\u007f$]\rf\u007f~c\u0012\nf?oeKSl>e~Y\u0013{\u007fheQ\r`?ndHS_0yk[\u000fn!cIS\u0010\u007f>eoR\t";
      f1062[18] = "4%\u0004NC\u0015*-\u001e\u0001!\t-0";
      f1062[19] = "R}]:\u0007\"\noLx;(Wm=j^q@1Y<TxP\u0001\u0000a\u0000$X9Y>D&;";
      f1062[20] = "\u0011+\u001bNTD\u00178\u0012S=T\u0016>~]X\r\u0001b\u001a\u000bR\u0004\u0011RCV\u0006X\u0019j\u001a\tBZz";
      f1062[21] = "V'*}aJ^|.\u0019;\u001bKW$|%\u0011Rq%e]O\u000fr\u007fs#\u0017\n#.\u0019d\t\bn1z3\b\u0005nC#`\u001bDx8gf\u0017H\u001c";
      f1062[22] = "'MJ\nm\u0000/\u0016Nn8<~JF\u0000+\u0007?\u0014\\\u0000Q\u0007y\u0013M\u0014jF'\tMn";
      f1062[23] = "Nh^dC>F3Z\u0000ԛ\u0002G*Ry\u0016{A9[d";
      f1062[24] = "}H6\u0016H\u0016,\\1\u0011u\u0006-R\u001d\n\u0013\u0015-H*m\u001e\u0010%W?\u0014\u0018\u0003,JV";
      f1062[25] = "\u0012Ka\u001f}RY\f5\u0011\u0010XNSxGqUR58E|\b\u0013W4V,B)\be\u0015uP\u0011Q:Qw3";
      f1062[26] = "\"6n\u007fhps\"ixUΩ\u001fns>2ls46<9\u000f";
      f1062[27] = "\u000e\u0017\u001a^VZEPNP;E\\\r\u0002\u0002|U5V\u0016\u000f^FH\u0003@\u000e\u0006;\u000e\u0017\u001a^VZEPNP;";
      f1062[28] = "]@IoWb\r\u000e\u0017o>)ZM`2Z5M1\u0012*\u0002 ERE+\u000f 7\u000b\u00168N6LO\u00104BR";
      f1062[29] = "SOM5Z[\u0014\u000e_d(\f\u0001Hk;N\u000f\u000bK4jY\r\u000bOFb\u0019X\r4";
      f1062[30] = "@\f}\u000b+\u0019\u0011\u0018z\f\u0016\u001d\u0010\u0016V\u0017p\u001a\u0010\fa4w\u001d\u0001jv\ts\u001f\u0014\u0013p\u001az\u0002}P \u001df\u0002\u0006\u0014&\u0011jf";
      f1062[31] = "1B\u0018!>\u0019aY\u00148O\u0017m_I!#%<\u0018\u0015ywr;]Lw\"\u0013p\u001a\u0018yO\u001b0OF|#J|\u0012\u0017F";
      f1062[32] = "I\u0003e/w\f\u0011\u0011tmK\u000e[2`m7\u001e Bd..\f\u0018\u001b;j,o";
      f1062[33] = "`\u000669,3f\u0015?$E!o\u0012::Ep6\u0012#$>40\u001e/@";
      f1062[34] = "\u0002\u0007S=?rZ\u0015B\u007f\u0003i\f\u001fW\u0007it[\u0000\u0003c?~R\u00103";
      f1062[35] = "uC_TL\u001c}\u0018[0\u0019L{x\u0007QAGf\u0013WJM^\u0017AI\f\u0002Rt\u0016H\u0001\u0002 -E[@\u0014[iCWLp";
      f1062[36] = "\u0003)1Ep(\u000br5!Ј\u0014\bn8\u001bpwP|)Y";
   }

   public RichTextView() {}
}
