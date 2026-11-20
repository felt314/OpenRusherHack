package org.rusherhack.client.api.ui.window.content;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.view.ListView;
import org.rusherhack.client.api.ui.window.view.ListView$Column;
import org.rusherhack.client.api.ui.window.view.WindowView;

public abstract class ListItemContent extends WindowContent {
   public long f962;
   public ListView<?> f963;
   public static long f964 = Class066.m4320(7267477468836159159L, 3772340978322108524L, MethodHandles.lookup().lookupClass()).m4325(273862476141559L);
   public static long f965;
   public static Object[] f966 = new Object[25];
   public static String[] f967 = new String[25];

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   public boolean isSelected() {
        return false;
    }

   public ListItemContent(Window var1, ListView<?> var2) {
    }

   public void onDoubleClick() {
        
    }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
        return false;
    }

   @Override
   public double getHeight() {
        return 0.0;
    }

   public abstract String getAsString(ListView$Column var1);

   @Override
   public double getWidth() {
        return 0.0;
    }

   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
        
    }

   public ListView<?> getListView() {
        return null;
    }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   static {
   }
   public static void m194() {
        
    }

   public ListItemContent() {}
}
