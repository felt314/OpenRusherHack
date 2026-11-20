package org.rusherhack.core.notification.type;
import org.rusherhack.*;

import org.rusherhack.core.notification.NotificationType;

public abstract class Notification {
   public NotificationType f1660;
   public String f1661;
   public int f1662;
   public static String f1663;
   public static Object[] f1665 = new Object[16];
   public static String[] f1666 = new String[16];

   public String getText() {
        return null;
    }

   public Notification(String var1, NotificationType var2, int var3) {
      this.f1661 = var1;
      this.f1660 = var2;
      this.f1662 = var3;
   }

   public Notification(String var1, NotificationType var2) {
      this(var1, var2, var2.getTypeID());
   }

   public int getID() {
        return 0;
    }

   public NotificationType getType() {
        return null;
    }

   public static void m4053(String var0) {
      f1663 = var0;
   }

   public static String m4054() {
      return f1663;
   }

   static {
    }
   public static void m122() {
      f1665[0] = "TA=2]\u0015_N,} \rLI%4";
      f1665[1] = int.class;
      f1666[1] = "java/lang/Integer";
      f1665[2] = "-\u00112/\u001581\u000b0s\u000f,!\b{b\b?'M;n\u0013$$\n6`\u0013$-\r{u\u001e='M\u001bn\u0013$$\n6`\u0013$-\r";
      f1665[3] = "Q%#1(QM?!m2E]<jɫ";
      f1665[4] = char.class;
      f1666[4] = "java/lang/Character";
      f1665[5] = void.class;
      f1666[5] = "java/lang/Void";
      f1665[6] = "\u00049M(q<\u0018#Otk(\b \u0004el;\u000eeDiw \r\"Igw \u0004%\u0004Hl=\u0002-Ceb=\u0002$DRz9\u000e";
      f1665[7] = "P\u0010\u001eAM~[\u001f\u000f\u000e,pP\u0014\u000bT";
      f1665[8] = "\u0003%|z&NG%+wDƛ:dmduS\u0004dyaD\u000f\u0000<byyWU9r\u001a";
      f1665[9] = "(\u000bJ{\u000e@l\u000b\u001dvlV\u0011KB\"\u0001\u0007,\u0016Gc\u0010=+\u0017\u001dvV\u0000v\u0012\\gl";
      f1665[10] = "%H01\u0004KaHg<f|\u001c\t!/WV\"\t5*f";
      f1665[11] = "pZb\u000e|X4Z5\u0003\u001eġI\u001bs\u0010/Ew\u001bg\u0015";
      f1665[12] = "u=c`l:u)fQhi(-a1\f~+/|ht{r|\u001d";
      f1665[13] = "3c\\KM\u001awc\u000bF/Ҙ\n%KEQ\u00001aLZ@";
      f1665[14] = ">8\u0012i\u0016P>,\u0017X\u001d\u000el=%$v\u0014`*\ra\u000e\u00119ylb\f\u001ez:\u0006?\f\u00109G";
      f1665[15] = ">)(G\u00055z)\u007fJgҏ\u0007)#J\u0006q\u007f,z\u0019";
   }

   public Notification() {}
}
