package org.rusherhack.client.api.ui.window.view;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.WindowContent;

public class TabbedView extends SimpleView {
   public WindowView f1081;
   public static Object[] f1083 = new Object[26];
   public static String[] f1084 = new String[26];

   public WindowView getActiveTabView() {
        return null;
    }

   public List<WindowView> getTabs() {
        return null;
    }

   public TabbedView(Window var1, List<WindowContent> var2) {
    }

   @Override
   public void renderViewContent(double var1, double var3) {
      super.renderViewContent(var1, var3);
   }

   public double getTabViewHeight() {
      return this.getHeight() - this.getPersistentContentHeight();
   }

   public TabbedView(String var1, Window var2, List<WindowContent> var3) {
    }

   public void setActiveTabView(WindowView var1) {
        
    }

   @Override
   public double getTopOffset() {
      return this.getTabViewHeight();
   }

   public double getPersistentContentHeight() {
        return 0.0;
    }

   @Override
   public List<WindowContent> getContent() {
        return null;
    }

   @Override
   public double getLeftOffset() {
      return super.getLeftOffset();
   }

   static {
      m786();
   }
   public static void m786() {
      f1083[0] = "\u001ae+)\u0013Z\u0004m1ft[\u0015v<<R]";
      f1083[1] = "D\u00029|,|O\r(3MrD\u0006,i";
      f1083[2] = "\u0012rkly\u001e\fzq#\u001b\u0002\u000bg";
      f1083[3] = boolean.class;
      f1084[3] = "java/lang/Boolean";
      f1083[4] = "E\t7\u0011gYY\u00135M}MI\u0010~\\yEO\u0015$\u0011t\\CU%V;[C\u00154Pb\u0002\\\u00125H;{C\u00154PbzC\u001e'";
      f1083[5] = "eiZ\u001d](\u0010IQ\u0012LgmQB\u0015E.\u0005";
      f1083[6] = "vUejJ\u0003jOg6P\u0017zL,'T\u001f|IvjY\u0006p\tw-\u0016\u0001pIf+OXoNg3\u0016\"xE`!\\ pBu";
      f1083[7] = "\u0018\u001d\u0010\u00003N\u0004\u0007\u0012\\)Z\u0014\u0004Yɚ";
      f1083[8] = double.class;
      f1084[8] = "java/lang/Double";
      f1083[9] = "\nMpU\u000f&\u0016Wr\t\u00152\u0006T9\u0018\u0011:\u0000QcU\u001c#\f\u0011b\u0012S$\fQs\u0014\n}\u0006Py\u000f\u0018=\u0011\u0011@\u0012\u00137\nHT\u0014\u0013'\u0000Qc";
      f1083[10] = "\u0002\u007f\u00129Cv\u001ee\u0010eYb\u000ef[t]j\bc\u00019Ps\u0004#\u0000~\u001ft\u0004c\u0011xF-\u001bd\u0010`\u001fP\u0004`\u0005{TU\u0004h\u0002";
      f1083[11] = "zk7OGucqu3_yah\rA\u0001ulvu\u0002V\u007f\u0011";
      f1083[12] = "TiY\r(U\u000e:OMUQ\u0007x~\u001a4Q\nx>J'\u000f\u0011cF\rmF\u0007\u0004";
      f1083[13] = "\\\u00170my\u001e\u0003\u000f\u007fy\u0000\u0011\t\u0018\rb8\u0019\u0018\u0016u!o\u0013eN<+i\u001f\u0001\u000fojbx";
      f1083[14] = "\u001f\u0004`t\u001dwE\u0011:-sλ$S!aL\u007fB\u0019d+\u0017\u001d";
      f1083[15] = "\u0017_\u0012\u0001d\u001aU]F_\u000fƓ+\u0006F^h\rA\\S\u00041";
      f1083[16] = ">T]IT-|V\t\u0017?;oJ.IY(oP\u0019.\u00067?K\u001cHY/p_e";
      f1083[17] = "\u000e\r\u001aR\ryQ\u0015UFt~K\u0003]F\bxMnLPNcI\u000fUJ\f\u001f";
      f1083[18] = "8\r\u0018Q_Cb\u0018B\b1Fn\u001d`[PFc\u001d \u000bC\u0018x\u0006XL\tQna";
      f1083[19] = "R\u0000?\u001a>\b\u0010\u0002kDU\u001e\u0003\u001e_\u0010/\n\u000f\u0019{\u00103\r%\u0005a\u00018\u0017\u0012\"j\u001c:\u0011\u0012b:\u000fd\n\t\u001a}E-\u001cn";
      f1083[20] = "nm?\u001f\u001eB4xeFpC2g{\u0015\u0016T\u0011`|\u0004p\u00116<z\u0001\u0016N.sn";
      f1083[21] = "{]GAk@\"\u000f\u0014S\u0006^#\u0018#WjN%\u0006\u0014>;Pu\u001b\u001cF|\u001a<\r";
      f1083[22] = "]Xq1\r,DB3M\u0013$Ma&=\u000fM\f\u0016p$\u0014)ME1/s";
      f1083[23] = "X'%yd \u001a%q'\u000f0dxt%`#\u001f{osmYY,&qu\"Z7p|\u000f";
      f1083[24] = "\"A^Izy{\u0013\r[\u0017pz\u001a\u001e[qgE\u0015\u000eZv}r|_D&`z\u0004\u0018\u000eov";
      f1083[25] = "7.f\u0000ZIu,2^1_f0\u0002\u000e[nj!!'\\Qd,\"g\fB:79\u001fK\bs!^";
   }
}
