package org.rusherhack.client.api.feature.hud;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import org.rusherhack.Class066;
import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.core.feature.IFeatureConfigurable;
import org.rusherhack.core.interfaces.IDraggable;
import org.rusherhack.core.interfaces.ITickable;
import org.rusherhack.core.interfaces.IToggleable;
import org.rusherhack.core.serialize.Class062;

public interface IHudElement extends IFeatureConfigurable, IRenderable2D, IToggleable, ITickable, IDraggable, Class062 {
   long f612 = Class066.m4320(3089429571669043402L, 234586011836998192L, MethodHandles.lookup().lookupClass()).m4325(257558003486709L);
   Object[] f613 = new Object[8];
   String[] f614 = new String[8];

   default void renderContent(RenderContext var1, double var2, double var4) {
      this.renderContent(var1, (int)var2, (int)var4);
   }

   default boolean shouldDrawBackground() {
      boolean var10002 = true;
      return true;
   }

   @Deprecated(
      forRemoval = true
   )
   default void renderContent(RenderContext var1, int var2, int var3) {
      this.renderContent(var1, (double)var2, (double)var3);
   }

   public static void m194() {
      f613[0] = "%e='L-9\u007f?{V9)|tjR1/y.'_(#9<l_,?e?'V-.9\u0013AK<\u000f{?d[6>";
      f613[1] = "\u0002\to\\}\u0013\u001e\u0013m\u0000g\u0007\u000e\u0010&\u0011c\u000f\b\u0015|\\n\u0016\u0004Uz\u0017a\u0002\b\t& j\b\t\u001ez1`\b\u0019\u001ep\u0006";
      f613[2] = double.class;
      f614[2] = "java/lang/Double";
      f613[3] = void.class;
      f614[3] = "java/lang/Void";
      f613[4] = int.class;
      f614[4] = "java/lang/Integer";
      f613[5] = "CW\u000ejN\u000fHX\u001f%/\u0001CS\u001b\u007f";
      f613[6] = "5\r*G\u0015X;\u0012x&\u0015_c\u0011|\\$Uc\u0001|@\u00132|\u0016l\u0016\u000fR}\u0017q&UC8\u0004!\u001b\u0004Nt\u0011\u0011\u001c\u001e\u000f|M,M\u0013Ci}+M\r\u000eg\u0013oO\u0001@\u0005";
      f613[7] = "\u0017\tyC'(\u0019\u0016+\"'/A\u0015/X\u0016%A\u0005/D!B^\u0012?\u0012=\"_\u0013\"\"d,VFrN2;X\u001dB\u001b33\u0018I.M$=CyxI?~E\u0017<K30'";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m194();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
