package org.rusherhack;

import net.minecraft.entity.LivingEntity;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.Event;

public class Event169 extends Event {
   public double f3338;
   public LivingEntity f3339;
   public static Object[] f3341 = new Object[8];
   public static String[] f3342 = new String[8];

   public double m7089() {
      return this.f3338;
   }

   public Event169(LivingEntity var1, double var2) {
      this.f3339 = var1;
      this.f3338 = var2;
   }

   public LivingEntity m7090() {
      return this.f3339;
   }

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   static {
      m122();
   }
   public static void m122() {
      f3341[0] = "\b,\u0005=\u007fX\u00146\u0007aeL\u00045LŹ";
      f3341[1] = double.class;
      f3342[1] = "java/lang/Double";
      f3341[2] = "dobA\b\u0011dou\u001d\u0004\u001e~$u\u0003\u0004\u000byU'\\UA";
      f3341[3] = "\u0000VR7iG\u001cLPksS\fO\u001bzt@\n\nPo~\\\u001b\nFmzU\n\nfmzU\n";
      f3341[4] = "O+V\u0019u\u0011D$GV\u0014\u001fO/C\f";
      f3341[5] = "F5a<c:\u0007r/5\u001b^&F_o%8\u0015sc.bv\u001c";
      f3341[6] = "=RV +~3^\u0018XĥO%\u001fId+-:IA";
      f3341[7] = "r\u0000Aj\u0003<|\f\u000f\u0012Զ\r/\fQ|BasKR,";
   }
}
