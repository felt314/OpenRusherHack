package org.rusherhack;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import org.rusherhack.core.event.type.Event;

public class Event068 extends Event {
   public MatrixStack f1786;
   public boolean f1787;
   public Arm f1788;
   public static Object[] f1790 = new Object[8];
   public static String[] f1791 = new String[8];

   public Arm m4350() {
      return this.f1788;
   }

   public boolean m4351() {
      return this.f1787;
   }

   public MatrixStack m4352() {
      return this.f1786;
   }

   public Event068(MatrixStack var1, Arm var2, boolean var3) {
      this.f1786 = var1;
      this.f1788 = var2;
      this.f1787 = var3;
   }

   static {
      m122();
   }
   public static void m122() {
      f1790[0] = "p\t/\"v\u0000l\u0013-~l\u0014|\u0010fk";
      f1790[1] = boolean.class;
      f1791[1] = "java/lang/Boolean";
      f1790[2] = "T!\u0019\u0018/fT!\u000eD#iNj\u000eZ#|I\u001bY\u0003z8";
      f1790[3] = "\u0016JJ#3h\u0016J]\u007f?g\f\u0001]a?r\u000bp\u000f>n7";
      f1790[4] = "-km02\u007f&d|\u007fSq-ox%";
      f1790[5] = "#\u0018\u0016BwI6\tL'к$q\u000fN^.Ty\u000bHV";
      f1790[6] = "\u001a(2M\f\u001a\u000f9h(յw\u000e 9E\bF\u000f$)";
      f1790[7] = "UojC\f5@~0&ՑX\u0004/1IZfCf4Z";
   }
}
