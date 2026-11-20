package org.rusherhack;

import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.core.setting.BooleanSetting;

public class Class113 extends Class517<BooleanSetting> {
   public static Object[] f2477 = new Object[20];
   public static String[] f2478 = new String[20];

   @Override
   public boolean m4901() {
      return (Boolean)((BooleanSetting)super.f8251).getValue();
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.m5378(var1, var3) && var5 == 0) {
         BooleanSetting var10 = (BooleanSetting)super.f8251;
         boolean var10001;
         if (!(Boolean)((BooleanSetting)super.f8251).getValue()) {
            var10001 = true;
            boolean var10003 = true;
         } else {
            var10001 = false;
            boolean var11 = true;
         }

         var10.setValue(var10001);
         boolean var10002 = true;
         return true;
      } else {
         return super.mouseClicked(var1, var3, var5);
      }
   }

   public Class113(PanelBase<?> var1, Renderer107 var2, BooleanSetting var3) {
      super(var1, var2, var3);
   }

   static {
      m3938();
   }
   public static void m3938() {
      f2477[0] = "\u001a\u0013n>0\b\u0011\u001c\u007fq\\\u000b\u001f\u001e}>p";
      f2477[1] = boolean.class;
      f2478[1] = "java/lang/Boolean";
      f2477[2] = "[S1$\u0007=GI3x\u001d)WJxi\u001a:Q\u000f%o\u0001<]O1$&-@U?d\u0012";
      f2477[3] = "s`\u0014\u000f`\u0005xo\u0005@\u0001\u000bsd\u0001\u001a";
      f2477[4] = void.class;
      f2478[4] = "java/lang/Void";
      f2477[5] = "h6\u0012\tEmt,\u0010U_yd/[ȡ";
      f2477[6] = int.class;
      f2478[6] = "java/lang/Integer";
      f2477[7] = "GV<6p\u0011[L>jj\u0005KOuê";
      f2477[8] = double.class;
      f2478[8] = "java/lang/Double";
      f2477[9] = "/1i,\u0017j3+kp\r~#( ă";
      f2477[10] = "cd^*\u0019G\u007f~\\v\u0003So}\u0017ɰ";
      f2477[11] = "\u0014a$v*S\b{&*0G\u0018xmӪ";
      f2477[12] = "\u000e<\bT^u\f*\u001c[#ǅ3h\u0006OB\u007f_*\u000bYS\u0016\u000e*\u001fHJzL'\tY#/_5\u0001S@j_8E)";
      f2477[13] = "v\fy\u0017v\u0012jJ{{d\u0016v\rm<t\u007f+\u001c`\u0003`\u001cn\u001cmG\u001a\u001bn\tl\u0017w\u0007(\u000b\u0000";
      f2477[14] = "\"\b\u0012\u0016n$>N\u0010zh.!\u0010\u0006\u0013d\u0017/\u0010\u0016\u0017\u0002p*\u0014\u0013\u0000a5*\u0019Wz";
      f2477[15] = "4j*~p\u0015svx(M\u0005`i\u0019~)\u0003`\u0015}mpOb*6k\"\u0015\r.{k<\u001f<-~ks~";
      f2477[16] = "X\u0004\u0015N\n\u001b^HK\fvȭcID\u0014J\u0017\\\u0015A\f\u0015t";
      f2477[17] = "b~K\u0019.\u0002$iOB_\r\\:V\u001e&\n<{JA>dca\rX1\u0004\"}R@_";
      f2477[18] = "\u0007rJr*F@n\u0018$\u0017BSqyrsPS\r\u001da*\u001cQ2VgxF>";
      f2477[19] = "bH_\nu\u00100\u0013R\u0010\u0017ѰROD\u0003~U9\bXQ(";
   }
}
