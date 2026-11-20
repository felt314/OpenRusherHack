package org.rusherhack.client.api.ui.window.content;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.view.WindowView;

public class PaddingContent extends WindowContent {
   public double f968;
   public double f969;
   public static Object[] f971 = new Object[5];
   public static String[] f972 = new String[5];

   @Override
   public double getWidth() {
        return 0.0;
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      return false;
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      return false;
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      return false;
   }

   @Override
   public boolean charTyped(char var1) {
      return false;
   }

   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
   }

   @Override
   public double getHeight() {
        return 0.0;
    }

   public PaddingContent(Window var1, double var2, double var4) {
      super(var1);
      this.f969 = var2;
      this.f968 = var4;
   }

   static {
      m194();
   }
   public static void m194() {
      f971[0] = "weY)IBk\u007f[uSV{|\u0010dW^}yJ)ZGq9Kn\u0015@qyZhL\u0019{xPs^Yl9nf_SqyYDTYlrPs";
      f971[1] = double.class;
      f972[1] = "java/lang/Double";
      f971[2] = "5\u001a\u001d\u000eJw>\u0015\fA+y5\u001e\b\u001b";
      f971[3] = "3\n1\u001bN\u001aa\u001d,uŅ\u007f:\u0006t\u001aG\u001c~W1K";
      f971[4] = "@W\"K\u0002U\u0012@?%ԡ0I[gJ\u000bS\r\n\"\u001b";
   }
}
