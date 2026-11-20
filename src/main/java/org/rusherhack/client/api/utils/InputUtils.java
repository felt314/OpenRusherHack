package org.rusherhack.client.api.utils;
import org.rusherhack.*;

import org.rusherhack.client.api.Globals;

public class InputUtils implements Globals {
   public static Object[] f1108 = new Object[16];
   public static String[] f1109 = new String[16];

   public static double getMouseX() {
      return Globals.mc.mouse.getX() * Globals.mc.getWindow().getScaledWidth() / Globals.mc.getWindow().getWidth();
   }

   public static double getMouseY() {
      return Globals.mc.mouse.getY() * Globals.mc.getWindow().getScaledHeight() / Globals.mc.getWindow().getHeight();
   }

   static {
      m194();
   }
   public static void m194() {
      f1108[0] = ")5(=\u0003p)5?a\u000f\u007f3~?\u007f\u000fj4\u000fo\"^";
      f1108[1] = ")PHSn\u0002)P_\u000fb\r3\u001b_\u0011b\u00184j\rM7Z";
      f1108[2] = "YhU\u0016R\u000bYhBJ^\u0004C#BT^\u0011DR\u0012\t\r";
      f1108[3] = "U\u0004\u001fKvDI\u001e\u001d\u0017lPY\u001dV\u0006hX_\u0018\fKeASX?\tkS[\u001a\u000b";
      f1108[4] = int.class;
      f1109[4] = "java/lang/Integer";
      f1108[5] = double.class;
      f1109[5] = "java/lang/Double";
      f1108[6] = "X (?\u0011\u0012S/9pp\u001cX$=*";
      f1108[7] = ">\u0017H%\u0002V=]GCVG<OI/d\u0016|\u001f\u0016C\b\u001azBT3I\u0014\u007f\u0016.";
      f1108[8] = "M9\u0012>=8\u0012s@\u00003.V)\u0016l\u0001y\u0010wA;V=\u0012/\u00171*>X q";
      f1108[9] = "\u0013Q\tS:>\u0010\u001b\u00065n/\u0011\t\bY\\~QYQ50rW\u0004\u0015Eq|RPo";
      f1108[10] = "gOANu]9F\u0011\u0013MJ66\u001c\u000e.\u00116MCD|";
      f1108[11] = ":\u000e\u0010K0]9D\u001f-dL8V\u0011AV\u001dy\u000eI-:\u0011~[\f]{\u001f{\u000fv";
      f1108[12] = "{Vy\u0004I\"x\u001cvb\u001d3y\u000ex\u000e/b8V%bCn?\u0003e\u0012\u0002`:W\u001f";
      f1108[13] = "\u0011\u001f#J\u0005zFD4D4aE\u0001,SXS\u0011Ct\u000f4?K\r.^\n8T\u000354";
      f1108[14] = "^/_\u0017\u0010R\u0001e\r)\u0015HT;P~B\u0016\u0003n<\u0010\u0019FGnBGBQI";
      f1108[15] = ")\u0007Ut\u0005}~\\Bz4f}\u0019ZmXT)[\u0002648s\u0015X`\n?l\u001bC\n";
   }
}
