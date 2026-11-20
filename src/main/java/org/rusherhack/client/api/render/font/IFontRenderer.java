package org.rusherhack.client.api.render.font;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.StringVisitable;
import net.minecraft.util.Language;
import org.rusherhack.Class066;
import org.rusherhack.client.api.config.Configuration;
import org.rusherhack.client.api.render.IRenderer;
import org.rusherhack.client.api.render.IScissorable;

import org.rusherhack.command.config;
public interface IFontRenderer extends IRenderer, IScissorable {
   long f810 = Class066.m4320(-4130863091303595339L, 7691271930822568713L, MethodHandles.lookup().lookupClass()).m4325(53178369848600L);
   Object[] f811 = new Object[44];
   String[] f812 = new String[44];

   default double drawString(String var1, double var2, double var4, int var6, boolean var7) {
        return 0.0;
    }

   default double drawString(OrderedText var1, double var2, double var4, int var6, boolean var7) {
        return 0.0;
    }

   default double drawString(String var1, double var2, double var4, int var6) {
        return 0.0;
    }

   default List<String> splitString(String var1, double var2) {
        return null;
    }

   default double drawText(String var1, double var2, double var4, int var6, double var7, double var9) {
        return 0.0;
    }

   default double drawString(StringVisitable var1, double var2, double var4, int var6, boolean var7) {
        return 0.0;
    }

   default double drawText(StringVisitable var1, double var2, double var4, int var6, boolean var7, double var8, double var10) {
        return 0.0;
    }

   double drawString(MatrixStack var1, String var2, double var3, double var5, int var7, boolean var8);

   default double drawText(String var1, double var2, double var4, int var6, boolean var7, double var8, double var10) {
        return 0.0;
    }

   double drawText(MatrixStack var1, String var2, double var3, double var5, int var7, boolean var8, double var9, double var11);

   default String trimStringToWidth(String var1, double var2) {
        return null;
    }

   double getStringWidth(String var1);

   default double drawText(StringVisitable var1, double var2, double var4, int var6, double var7, double var9) {
        return 0.0;
    }

   double drawString(MatrixStack var1, OrderedText var2, double var3, double var5, int var7, boolean var8);

   void setDefaultShadowState(boolean var1);

   double getFontHeight();

   boolean getDefaultShadowState();

   double drawText(MatrixStack var1, StringVisitable var2, double var3, double var5, int var7, boolean var8, double var9, double var11);

   default double drawString(OrderedText var1, double var2, double var4, int var6) {
        return 0.0;
    }

   default double drawString(StringVisitable var1, double var2, double var4, int var6) {
        return 0.0;
    }

   public static void m194() {
        
    }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m194();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
