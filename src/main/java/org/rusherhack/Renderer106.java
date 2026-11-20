package org.rusherhack;

import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public abstract class Renderer106 extends BooleanSetting {
   public static Object[] f2387 = new Object[5];
   public static String[] f2388 = new String[5];

   public void m5362(Setting<?>... var1) {
      this.addSubSettings(var1);
   }

   public Renderer106(String var1) {
      super(var1, false);
   }

   public abstract void m5363(int var1, int var2, RenderContext var3, IRenderer2D var4);

   static {
      m157();
   }
   public static void m157() {
      f2387[0] = "&d\u000ecA4:~\f?[ *}G.\\3,8\u001a(G5 x\u000ec`$=b\u0000#T";
      f2387[1] = "}Pmf$[Tiq|&\u0007N}a\u007fm\u0016Ing:0\u0010Rhkz$[uyv`*\u001bA'";
      f2387[2] = void.class;
      f2388[2] = "java/lang/Void";
      f2387[3] = "\u0013waO[\u000f\u0018xp\u0000:\u0001\u0013stZ";
      f2387[4] = "*v.\u001aj{tn='rm)K2M@l9l.AtzEh7L\"n>j#\u0016\u001b8#*3\u001cc}{|!'";
   }

   public Renderer106() {}
}
