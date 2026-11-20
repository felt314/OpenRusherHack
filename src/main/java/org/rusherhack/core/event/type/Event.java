package org.rusherhack.core.event.type;
import org.rusherhack.*;

import org.rusherhack.core.event.stage.IStageable;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.setting.Setting;

public abstract class Event implements IStageable {
   public Stage f1602;
   public static int[] f1603;
   public static Object[] f1605 = new Object[15];
   public static String[] f1606 = new String[15];

   public Event(Stage var1) {
    }

   public Event() {
    }

   public void setStage(Stage var1) {
        
    }

   @Override
   public Stage getStage() {
        return null;
    }

   public Stage getPreferredStage() {
        return null;
    }

   public static void m3893(int[] var0) {
      f1603 = var0;
   }

   public static int[] m3894() {
      return f1603;
   }

   static {}
   public static void m194() {
      f1605[0] = "7~\u0006\rt5+d\u0004Qn!;gO@i2=\"\u0004Uc.,\"\u0015Zv%vI\u0017Fh4";
      f1605[1] = "6_X~tc*EZ\"nw:F\u00113id<\u0003Z&cx-\u0003L$gq<\u0003l$gq<";
      f1605[2] = ":F";
      f1605[3] = void.class;
      f1606[3] = "java/lang/Void";
      f1605[4] = "f0ZiL!z*X5V5j)\u0013$Q&llN\"J `,Zim1}6T)Y";
      f1605[5] = "$/tc\u000b\\Q\u000f\u007fl\u001a\u0013,\u0017lk\u0013ZD";
      f1605[6] = "\u001e\b";
      f1605[7] = "mP\u0001&\u0013;qJ\u0003z\t/aIHɼ";
      f1605[8] = "07ZZ$Y;8K\u0015EW03OO";
      f1605[9] = "\u0006\u0016\u00076k0\u001a\u001d\u0018QѝHT\u0002\u0005`{0\fPB;\u0001r\r\u001eE4~*\u000b\u0010FQ";
      f1605[10] = "`V~>zQ'\t`a\nՊ[Ws:i\u0015\"\u001d\u007fb1+";
      f1605[11] = "O\nm\u0016zqS\u0001rq{\t\u001d\u0001k\u0001\u007f1\u0011J|L\u00105S\re\u001e(9\u0018\u001a(q";
      f1605[12] = "L\u0002~\u001fF:P\taxҗB\u001e\u0016|IV:FD;\u0012,";
      f1605[13] = "(o$#3E k/\u001b\n2Y'tru\nh/py";
      f1605[14] = ")\u0004Zk\u0017*5\u000fE\f¸R6DK4\u0003c>@@";
   }
}
