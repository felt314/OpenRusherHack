package org.rusherhack;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;

public class Event261 extends EventCancellable {
   public TextFieldWidget f4616;
   public DrawContext f4617;
   public static Object[] f4619 = new Object[6];

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   public DrawContext m9338() {
      return this.f4617;
   }

   public Event261(DrawContext var1, TextFieldWidget var2) {
      this.f4617 = var1;
      this.f4616 = var2;
   }

   public TextFieldWidget m9339() {
      return this.f4616;
   }

   static {
      m122();
   }
   public static void m122() {
      f4619[0] = "&\r\u000e{\u001c\u0013:\u0017\f'\u0006\u0007*\u0014Gɇ";
      f4619[1] = "#qhDcR#q\u007f\u0018o]9:\u007f\u0006oH>K/Y<";
      f4619[2] = "\u007f$\u000b\u0015&C\u007f$\u001cI*Leo\u001cW*Yb\u001eL\u000fy";
      f4619[3] = "kIU&\n-`FDik#kM@3";
      f4619[4] = "\u0000\r1\u000f'\u0003^D%cχ|\u0003\u001f%\u001b&\u0010Z\u001f3_";
      f4619[5] = "$xH\u0011<?z1\\}у@$9\n\u001f}'!?P\u0012";
   }
}
