package org.rusherhack.client.api.ui.window.content;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.component.TextFieldComponent;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.setting.Setting;

public class ComboContent extends WindowContent {
   public WindowView f957;
   public List<Pair<WindowContent, ComboContent$AnchorSide>> f958 = new ArrayList<>();
   public static Object[] f960 = new Object[61];
   public static String[] f961 = new String[61];

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
        
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public double getWidth() {
        return 0.0;
    }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   public void addContent(WindowContent var1) {
        
    }

   public List<Pair<WindowContent, ComboContent$AnchorSide>> getContents() {
        return null;
    }

   @Override
   public void unfocus() {
        
    }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
        
    }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
        return false;
    }

   @Override
   public double getHeight() {
        return 0.0;
    }

   public void addContent(WindowContent var1, ComboContent$AnchorSide var2) {
        
    }

   public ComboContent(Window var1) {
      super(var1);
   }

   static {
      m194();
   }
   public static void m194() {
        
    }
}
