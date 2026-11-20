package org.rusherhack;

import org.rusherhack.core.logging.ILog;
import org.rusherhack.core.logging.ILogger;
import org.rusherhack.core.logging.Logger;
import org.slf4j.LoggerFactory;

public class Class548 implements ILog {
   public Logger f8801;
   public org.slf4j.Logger f8802;
   public static Object[] f8804 = new Object[20];
   public static String[] f8805 = new String[20];

   @Override
   public void error(String var1) {
      this.f8802.error(var1);
   }

   @Override
   public void debug(String var1) {
      this.f8802.debug(var1);
   }

   public Class548(Logger var1) {
      super();
      this.f8801 = var1;
      Renderer268.m9427(() -> {
         this.f8802 = LoggerFactory.getLogger(var1.getName());
      });
   }

   @Override
   public void info(String var1) {
      this.f8802.info(var1);
   }

   @Override
   public void warn(String var1) {
      this.f8802.warn(var1);
   }

   public ILogger m16889() {
      return this.f8801.getParent();
   }

   static {
      m122();
   }
   public static void m122() {
      f8804[0] = "[\u000b\u0019Km\u0007G\u0011\u001b\u0017w\u0013W\u0012Pҙ";
      f8804[1] = "{\u00170\u001d\u0010(rQ=\u001d/+s\u00022A";
      f8804[2] = "!Y\u000f\t\u001e\u0012*V\u001eFc\n9Q\u0017\u000f";
      f8804[3] = void.class;
      f8805[3] = "java/lang/Void";
      f8804[4] = "4x \u0013^+(b\"OD?8aiȦ";
      f8804[5] = "/'+m\u0013f$(:\"o\u007f+(<nQo";
      f8804[6] = "\u000fc#I{L\u0013y!\u0015aX\u0003zj\u0004fK\u0005?(\bn^\t\u007f#IEV\u0007v!\u0015";
      f8804[7] = "\u0006^d\u0011C\u0006\u001aDfMY\u0012\nG-\\^\u0001\f\u0002oPV\u0014\u0000Bd\u0011x?\u0006KdZC";
      f8804[8] = "p\"X^&qydU^\u0019rx7Z\u0002\u0013||$P\u0002,";
      f8804[9] = "uZ\u0018\u0003>#~U\tL_-u^\r\u0016";
      f8804[10] = "\f\u001d\r>\u001e\u0018\nB\u001ai}N]\u0004$1\u0007LV\u0004|e\u001fLH@\u001b#\u0004[Qx";
      f8804[11] = "y\u0004P$x\u0002:\u001b\u0016K}\u000ek\u0004\u0005K(\u00009\u0014S.~Rl\tjqq\\\u007f\u001c\u0004ss[<y";
      f8804[12] = "4N\u0003\\v15\u000e\u0016\u0018\t;dI-\u0003f;dOi]jld\f\f\u000b89y5\u0011\u00193;`TR\u0006uT";
      f8804[13] = "\u0001\u001fG\u0011@rU\u0018\u0001pŽ\u0014\u0013\u001b\u0005\u001fUuP\u0004C";
      f8804[14] = "\u0016NhM\u000fpUQ.\"\u000bk\u0014T(\"_rV^kG\t \u0003CR\u0018\u0006.\u0010V<\u001a\u0004)S3";
      f8804[15] = "$\u0000\\\u001a\u0017|g\u001f\u001au\u001f{2\u001afL\u001d%1D\u0003\u001aOp,}\\\u0015Ac9\u0013^\u0017F \\";
      f8804[16] = "\u0019RDi.z\u001f\rS>M,HKsf(.%\u000eV7 z@X\u0004b=C";
      f8804[17] = "F Kiz)\u0015c@gEђ|dRn\u007f,A'N2yIF?\u001dp 'D=\u001a3E";
      f8804[18] = "*\u0017\u000erFoi\bH\u001dPg(\f4$L6?SQr\u001ec\"j\u000e}\u0010p7\u0004\f\u007f\u00173R";
      f8804[19] = "T\u001ax,TF\u0000\u001d>Mʬ \u0002\u0006q+K\u0019\u0004Yf|";
   }
}
