package org.rusherhack.client.api.system;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.Class066;
import org.rusherhack.client.api.feature.window.PopupWindow;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.window.WindowHandlerBase;
import org.rusherhack.core.feature.IFeatureManager;

public interface IWindowManager extends IFeatureManager<Window> {
   long f868 = Class066.m4320(2201867039464947291L, -8321028657611017855L, MethodHandles.lookup().lookupClass()).m4325(269679071819343L);
   Object[] f869 = new Object[24];
   String[] f870 = new String[24];

   void moveToTop(Window var1);

   IRenderer2D getRenderer();

   WindowHandlerBase getWindowHandler();

   default List<Window> getVisibleWindows() {
        return null;
    }

   @Nullable
   default Window getFocusedWindow() {
        return null;
    }

   void popupWindow(PopupWindow var1);

   IFontRenderer getFontRenderer();

   void closePopup(PopupWindow var1);

   public static void m122() {
        
    }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m122();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
