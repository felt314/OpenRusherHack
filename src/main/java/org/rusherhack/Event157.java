package org.rusherhack;

import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.Event;

public class Event157 extends Event {
   public String f3194;
   public Text f3195;
   public static Object[] f3197 = new Object[12];
   public static String[] f3198 = new String[12];

   public String m6843() {
      return this.f3194;
   }

   @Deprecated
   @Nullable
   public String m6844() {
      return this.f3195 == null ? null : this.f3195.getString();
   }

   public void m6845(Text var1) {
      this.f3195 = var1;
   }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   public Event157(String var1) {
      super();
      this.f3195 = null;
      this.f3194 = var1;
   }

   @Nullable
   public Text m6846() {
      return this.f3195;
   }

   static {
      m122();
   }
   public static void m122() {
      f3197[0] = "{d\u001f?;\u0003g~\u001dc!\u0017w}VŇ";
      f3197[1] = "\\+\n)8W\\+\u001du4XF`\u001dk4MA\u0011L2c\u000f";
      f3197[2] = "ko8Nk\u0015wu:\u0012q\u0001gvqɦ";
      f3197[3] = int.class;
      f3198[3] = "java/lang/Integer";
      f3197[4] = "\u000eFi\u0004/o\u0012\\kX5{\u0002_ ɞ";
      f3197[5] = "@m\u0014\u000e\u0015\u001fKb\u0005Ah\u0007Xe\f\b";
      f3197[6] = "\u0013M\fr}q\u0018B\u001d=\u001c\u007f\u0013I\u0019g";
      f3197[7] = "m\u000fon.6k_<\u0015{\"k;,ou)x`kh{~,\u00073q*\u007f\u0017";
      f3197[8] = "T\n\u000eq\u0005AY\u0017Y\u0013Ȇ'\u0004\fX\"]@\\\u0015\t#";
      f3197[9] = "d\\oW;Y:Bd\\\u0001Ƚ]\u001a/\u0014nU8\u0019~Ifd";
      f3197[10] = "(\t\u001aJv}%\u0014M(|\u001bxK\u001cK(a#\u0014[B\u0015 zM@\u0015o{%\nI(";
      f3197[11] = "#(\\nxi.5\u000b\fv\u000f2<Zw!v4l\t";
   }
}
