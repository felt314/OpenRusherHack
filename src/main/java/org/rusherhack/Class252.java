package org.rusherhack;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
public class Class252 implements Transferable {
   public static Object[] f4458 = new Object[10];
   public static String[] f4459 = new String[10];

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      boolean var10002 = true;
      return new DataFlavor[]{DataFlavor.imageFlavor};
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      return DataFlavor.imageFlavor.equals(var1);
   }

   public Class252(BufferedImage var1) {
    }

   @Override
   public Object getTransferData(DataFlavor var1) {
        return null;
    }

   static {
      m122();
   }
   public static void m122() {
      f4458[0] = "&\u0016z\u000bPw;\u0003\"\u000e\u001fb-\u0003~\u000b\u0010e*\u0012~D:w8\u0016J\u0006\u001f`#\u0005";
      f4458[1] = boolean.class;
      f4459[1] = "java/lang/Boolean";
      f4458[2] = "~Ssm^[bIq1DOrJ:ɀ";
      f4458[3] = "S}e6P-OggjJ9_d,ɬ";
      f4458[4] = "OR5ZKKRGmR\bKBVmy\u0010LCV1^\u0001cHR$^";
      f4458[5] = "b\u0000\u0004hN\"i\u000f\u0015'/,b\u0004\u0011}";
      f4458[6] = "Gw\r\u001c\u0013DB)\u001fKh]~.P\t\u0011L\u0006u^\u0004U4D%\u001e\u000f\u0010L\u001f+\u0013Kh";
      f4458[7] = "2\u0016c%k3:\nv\u001adf0\u0017bTaj'\u001fu\u001anm5Ga*fq ";
      f4458[8] = "\u0012@b8Fc\u001a\\w\u0007E*\u0004Gj|(8\u0017B1i\u00180\u000bW\u000e{X.EEjjJ+y";
      f4458[9] = "!D9#$e$\u001a+t_ȧ\u0018\u001c>;c|iBn1#";
   }
}
