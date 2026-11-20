package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.window.ResizeableWindow;
import org.rusherhack.client.api.ui.window.content.ComboContent;
import org.rusherhack.client.api.ui.window.content.ComboContent$AnchorSide;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.content.component.ButtonComponent;
import org.rusherhack.client.api.ui.window.content.component.CheckBoxComponent;
import org.rusherhack.client.api.ui.window.content.component.ComboBoxComponent;
import org.rusherhack.client.api.ui.window.content.component.TextComponent;
import org.rusherhack.client.api.ui.window.content.component.TextFieldComponent;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.client.api.ui.window.view.ScrollableView;
import org.rusherhack.client.api.ui.window.view.WindowView;

import org.rusherhack.client.api.feature.hud.impl.Test;
public class Scroll_Up extends ResizeableWindow {
   public List<WindowContent> f2591;
   public ScrollableView f2592;
   public static long f2593 = Class066.m4320(5774676257504063085L, -5419803244366831747L, MethodHandles.lookup().lookupClass()).m4325(259481885920467L);
   public static String[] f2594;
   public static String[] f2595;
   public static long[] f2597;
   public static Integer[] f2598;
   public static Map f2599;
   public static Object[] f2600 = new Object[40];
   public static String[] f2601 = new String[40];

   public Scroll_Up(String var1, double var2, double var4) {
        super(var1, var2, var4);
      Scroll_Up var12 = this;

      this.f2591 = new ArrayList<>();
      this.f2592 = new ScrollableView(this, this.f2591);
      this.f2592.setContextMenu(List.of(new ContextAction("Scroll Up", () -> {
         this.f2592.getScrollbar().setScrollOffset(0.0);
      }), new ContextAction("Scroll Down", () -> {
         this.f2592.getScrollbar().scroll(100.0, false);
      })));
      ArrayList var11 = new ArrayList();
      var11.add(new ContextAction("Test1", () -> {
         System.out.println("Test");
      }));
      var11.add(new ContextAction("Test2", () -> {
         System.out.println("Test");
      }));
      this.f2591.add(new ButtonComponent(this, "Test", 100.0, 20.0, () -> {
         System.out.println("Test is a cool test");
      }));
      this.f2591.add(new CheckBoxComponent(this, "Checkbox", false));
      List var15 = this.f2591;
      String[] var10004 = new String[8];
      var10004[0] = "Test1";
      boolean var10008 = true;
      var10004[1] = "Test2";
      var10004[2] = "Test3";
      var10004[3] = "Test4";
      var10004[4] = "Test5";
      var10004[5] = "Test6";
      var10004[6] = "Test7";
      var10004[7] = "Test8";
      var15.add(new ComboBoxComponent(this, var10004, 0, System.out::println));
      this.f2591.add(new TextFieldComponent(this, "Username", 100.0, false));
      ComboContent var13 = (ComboContent)null;
      boolean var10009 = true;
      TextFieldComponent var3 = new TextFieldComponent(this, "Password", 100.0, true);
      ButtonComponent var14 = new ButtonComponent(this, "Login", () -> {
         RusherHackAPI.getWindowManager().popupWindow(new POPUP());
      });
      var13.addContent(var3);
      var13.addContent(var14, ComboContent$AnchorSide.RIGHT);
      this.f2591.add(var13);
      int var8 = 0;

      for (int var16 = var8; var16 < 25; var16 = var8) {
         TextComponent var9 = new TextComponent(var12);
         var9.setContextMenu(var11);
         var9.setText("Hello window! " + var8);
         var8++;
         var12.f2591.add(var9);
      }
   }

   @Override
   public String getDescription() {
        return null;
    }

   @Override
   public WindowView getRootView() {
        return null;
    }

   static {
    }

   public static String m5835(byte[] var0) {
        return null;
    }
   public static void m1499() {
        
    }
}
