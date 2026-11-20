package org.rusherhack.client.api.ui.panel;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.List;
public abstract class PanelItemBase<T extends IPanelItem> implements IPanelItem {
   public T parent;
   public PanelBase<?> panel;
   public List<T> subItems = new ArrayList<>();
   public static boolean f913;
   public static Object[] f915 = new Object[13];
   public static String[] f916 = new String[13];

   public void addSubItem(T var1) {
      this.subItems.add((T)var1);
   }

   public List<T> getSubItemList() {
      return this.subItems;
   }

   public T getParent() {
      return this.parent;
   }

   public PanelBase<?> getPanel() {
      return this.panel;
   }

   public PanelItemBase(PanelBase<?> var1, T var2) {
      this.panel = var1;
      this.parent = (T)var2;
   }

   public static void m2124(boolean var0) {
      f913 = var0;
   }

   public static boolean m2125() {
      return f913;
   }

   public static boolean m2126() {
      boolean var0 = m2125();
      return !var0;
   }

   static {
    }
   public static void m194() {
      f915[0] = "\u0005v\u001eiR?\u0019l\u001c5H+\toW$L#\u000fj\riA:\u0003*\f.\u000e:\u000bj\u001c+\u000e\u001a\u000bj\u001c+i>\u000fi;&S/";
      f915[1] = "g}(:vGyu2u\u0014[~h";
      f915[2] = "9\nf$\u0012&%\u0010dx\b25\u0013/i\f:3\u0016u$\u0001#?VtcN#7\u0016dfN\u00037\u0016df\"2%\u001d";
      f915[3] = boolean.class;
      f916[3] = "java/lang/Boolean";
      f915[4] = void.class;
      f916[4] = "java/lang/Void";
      f915[5] = ".Y*hVQ%V;'7_.]?}";
      f915[6] = "m|Y\u001boBqf[GuVae\u0010Vq^g`J\u001b|Gk K\\3Gc`[Y3~RoPPq~vkS";
      f915[7] = "92\u0007t\u001e\u0014+a\n\u000e\\pm8\u001f\u007f\u001f\u001bh2X2$Ki`Y~I\u001coa\u000f\u000e";
      f915[8] = "R+\u001cOI Bu\u0012$]rL\u0010WTUeFz\u001c[Ke *\b_E%K/\u0002\u0018\b\u001e";
      f915[9] = "U^\u0011\rTEG\r\u001cwӚ!\u0001T\t\u0006UJ\u0004^NKn";
      f915[10] = "]/>\r.tO|3wlyI,;\u000b\u0014,I\":\u000fm{\f0a";
      f915[11] = "\u0012e\"](`\u00006/'jm\u001af%'+c\u00033#\\.;\u00003";
      f915[12] = "\u0007y{\u0017\u001a}\u0015*vm[d\u0003Vd\u0000Ebie#\u001dKdWu}\u0013";
   }
}
