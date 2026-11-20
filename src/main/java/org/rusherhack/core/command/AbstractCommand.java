package org.rusherhack.core.command;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.rusherhack.core.feature.IFeature;
import org.rusherhack.core.interfaces.IHideable;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.StringUtils;

public abstract class AbstractCommand implements IFeature, IHideable {
   public String f1426;
   public String f1427;
   public List<String> f1428;
   public static Setting[] f1429;
   public static Object[] f1431 = new Object[32];
   public static String[] f1432 = new String[32];

   @Override
   public boolean isHidden() {
      return false;
   }

   @Override
   public String getName() {
        return null;
    }

   @Override
   public String getDisplayName() {
        return null;
    }

   @Override
   public String getDescription() {
        return null;
    }

   @Override
   public String[] getAliases() {
        return null;
    }

   public AbstractCommand(String var1, String var2) {
    }

   public void addAliases(String... var1) {
        
    }

   public static void m3424(Setting[] var0) {
      f1429 = var0;
   }

   public static Setting[] m3425() {
      return f1429;
   }

   static {
    }
   public static void m194() {
      f1431[0] = ",s\u0007\u0011;\u00042{\u001d^T\u00034s\b\u0003";
      f1431[1] = "o\n\u0000uHz\u001a*\u000bzY5{$\u0000q]o\u000f";
      f1431[2] = "`Gd\u0000?Y~O~O]EyR";
      f1431[3] = "\u000f\u0011g\u0005S%\u0011\u0019}J>?\t\u001ct\u0007\t9\n\u001e";
      f1431[4] = boolean.class;
      f1432[4] = "java/lang/Boolean";
      f1431[5] = "K\u0015\f0\b\u0004W\u000f\u000el\u0012\u0010G\fE}\u0015\u0003AI\bq\u0017\u001cE\t\u000f0;\u0013W\u0013\u0019\u007f\u0019\u0005g\b\u0006s\u001b\u001f@";
      f1431[6] = "= \u001fw1E\u0014\u0019\u0003m3\u0019\u000e\r\u0013nx\b\t\u001e\u0015+%\u000e\u0012\u0018\u0019k1E5\t\u0004q?\u0005\u0001W";
      f1431[7] = "{ /Dy9g:-\u0018c-w9f\td>q|;\u000f\u007f8}</DX)`&!\u0004l";
      f1431[8] = "er\u001fs\\\u001f\u0010R\u0014|MPmJ\u0007{D\u0019\u0005";
      f1431[9] = "z\u0016<!.\u000ef\f>}4\u001av\u000fuɻ";
      f1431[10] = "W\u0019Y\u0018FH\"9R\u0017W\u0007_!A\u0010^N7";
      f1431[11] = void.class;
      f1432[11] = "java/lang/Void";
      f1431[12] = "\u001e\"Oq1Ek\u0002D~ \n\u0016\u001aWy)C~";
      f1431[13] = "=%^=\u0015k\u0014\u001cB'\u00177\u000e\bR$\\&\t\u001bTa\u0001 \u0012\u001dX!\u0015k5\fE;\u001b+\u0001R";
      f1431[14] = "\u0011\u0019\u0003w8_\u001a\u0016\u00128EG\t\u0011\u001bq";
      f1431[15] = "qW!q%vmM#-?b}Nh<8q{\u000b3+>om\u000b\u0015+%jpB\u0013+>om";
      f1431[16] = "L1\u0019\u0017Nn9\u0011\u0012\u0018_!X\u001f\u0019\u0013[{,";
      f1431[17] = "e\u0003\u0004z\u0011\f\u0010#\u000fu\u0000Cq-\u0004~\u0004\u0019\u0005";
      f1431[18] = "Ag\u0012![(Jh\u0003n:&Ac\u00074";
      f1431[19] = "'\u0006:i.\u000ea\u000e||S\u001a\u001cE{h3\u0002'I}y-\u007f";
      f1431[20] = "\u0002a!{\u0016=O+&ykԥ?irc\u0006!Cazg\u0010D";
      f1431[21] = "~\u001d}\u0017?grA5*5z\n\u001b~V\\j~\u00025M5jtDh*ez6\u0014jAff\"\u0017\u0005";
      f1431[22] = "\u0006X[\u0005o\u0018@P\u001d\u0010\u0012Ќ=CH_{\rP\u0011\u001bS{";
      f1431[23] = "@2>Y]z\u0006:xL J{)-\u0003Io\u0016{~\u000fI";
      f1431[24] = "~>m\u0011LO}\"y\u0012#X \fo\u0005JUG.%\u0007\u0013C../AN$,umODM,\u007f+\u0012#";
      f1431[25] = ".\u001c\u000fL9\u0017-\u0000\u001bOV\u0015{\u000b>F2|-\u000b\u0007\\+\u001f'X\u0013DVGx\b\u0014Go@.\f\b\"";
      f1431[26] = "y\u0015qnj\u0000?\u001d7{\u0017\u001bBYay)\u000b{\u0001cw+q|\br;mH$\n|9\u0017";
      f1431[27] = "=\\1VXC{TwC%ȼ\u0006\u001fpWEO=\u0013vF[26\u001e>Y]\b<\\>\r%";
      f1431[28] = "s[\u0007f>f5SAsC\u0383H\u0010\u0003u-x#\u0013\u001fa.";
      f1431[29] = "x}\u0011v$]>uWcYE/c'y8E8b\u0015\u001di@:b\u000baaH>tn-i\\'wT'+\\s\u000f";
      f1431[30] = "'^?\nQZj\u00148\b,͜\u001aVl\u0012AFf^d\u0016W#*Vp\u000fT\u0019 \u0014p[,";
      f1431[31] = "nd7$2'}sa|K<`W:;/-Lb *K)k:2#&{862G\",6b?*p\u007f:b[";
   }

   public AbstractCommand() {}
}
