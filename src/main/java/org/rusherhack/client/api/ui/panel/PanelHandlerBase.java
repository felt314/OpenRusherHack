package org.rusherhack.client.api.ui.panel;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.List;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.client.api.ui.ElementHandlerBase;

public abstract class PanelHandlerBase<T extends ElementBase> extends ElementHandlerBase<T> {
   public List<T> panels = new ArrayList<>();
   public static Object[] f911 = new Object[12];
   public static String[] f912 = new String[12];

   @Override
   public IFontRenderer getFontRenderer() {
      return RusherHackAPI.fonts().getClickGuiFontRenderer();
   }

   public void addPanel(T var1) {
      this.panels.add((T)var1);
   }

   public PanelHandlerBase(boolean var1) {
      super(var1);
   }

   @Override
   public void moveElementToTop(T var1) {
      this.panels.remove(var1);
      this.panels.add((T)var1);
   }

   @Override
   public List<T> getElements() {
      return this.panels;
   }

   public T createPanel(String var1) { return null; }

   static {
      m786();
   }
   public static void m786() {
      f911[0] = "c\bOoP\r}\u0000U 2\u0011z\u001d";
      f911[1] = "\u0006<\u0013F\u0012V\r3\u0002\tsX\u00068\u0006S";
      f911[2] = boolean.class;
      f912[2] = "java/lang/Boolean";
      f911[3] = "GNp:DR[Trf^FKW9wZNMRc:WWA\u0012b}\u0018WIRrx\u0018wIRrx~FFX{qDeIOr";
      f911[4] = "]_\u0006u\u000b\u0014AE\u0004)\u0011\u0000QFO8\u0015\bWC\u0015u\u0018\u0011[\u0003\u0012\"\n\u0015W@O\u001d\u0016\u000fF^";
      f911[5] = "D\u0013\u007fmf\u001eX\t}1|\nH\n6 x\u0002N\u000flmu\u001bBOj&z\u000fN\u00136%{\u0005_OQ\u0005{\u0005_3}-p\u000eY\u0004j";
      f911[6] = "X-]\"N\u0003D7_~T\u0017T4\u0014oP\u001fR1N\"]\u0006^qhyO\u001eR-rm_\u001dv\u000fs";
      f911[7] = "IL\\/Q\u0012\u0015^MLT\u0006N@I!.R\u0012\u0016\n6D\fR\u001bXL\u0017\u0017RGG/N\u0010O\u00187";
      f911[8] = "`qnPU8`*6V5l6<B\nTh8\u000ft\u000f{d=<S\u0003So6:d\u0014588!m_Eo1 {n";
      f911[9] = "K:\u0006\u0015\u0011e\u0017(\u0017v\u0007pEQTO_!S;\n\u000fRs)h\u0011\u000f\u000elJ1\u0016\u0012Q\u001c";
      f911[10] = "%\u0002`\u0019\\\f|\ni\u0012e\u0013~\bv\u000beF(\t4\u0010^FsQ2p";
      f911[11] = "J\u001eg/6 \u0013Ju+\fi\u0019\u001dh3w\u0011\u0012\u0010n4shN\u0002\u007f";
   }

   public PanelHandlerBase() {}
}
