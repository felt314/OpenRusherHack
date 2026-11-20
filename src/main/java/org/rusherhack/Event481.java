package org.rusherhack;

import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.client.gui.tooltip.TooltipPositioner;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;

public class Event481 extends EventCancellable {
   public List<TooltipComponent> f7753;
   public int f7754;
   public TooltipPositioner f7755;
   public DrawContext f7756;
   public int f7757;
   public static Object[] f7759 = new Object[15];
   public static String[] f7760 = new String[15];

   public List<TooltipComponent> m15026() {
      return this.f7753;
   }

   public Event481(DrawContext var1, List<TooltipComponent> var2, int var3, int var4, TooltipPositioner var5) {
      this.f7756 = var1;
      this.f7753 = var2;
      this.f7754 = var3;
      this.f7757 = var4;
      this.f7755 = var5;
   }

   public int m15027() {
      return this.f7754;
   }

   public MatrixStack m15028() {
      return this.f7756.getMatrices();
   }

   public TooltipPositioner m15029() {
      return this.f7755;
   }

   @Override
   public Stage getPreferredStage() {
      return Stage.POST;
   }

   public int m15030() {
      return this.f7757;
   }

   public DrawContext m15031() {
      return this.f7756;
   }

   static {
      m122();
   }
   public static void m122() {
      f7759[0] = "C<Y\u001fAN_&[C[ZO%\u0010ѝ";
      f7759[1] = int.class;
      f7760[1] = "java/lang/Integer";
      f7759[2] = ">+:fA{>+-:Mt$`-$Ma#\u0011}{\u001e";
      f7759[3] = "wO\u0015]igkU\u0017\u0001ss{V\\\u0010t`}\u0013\u0017\u0005~|l\u0013\u0001\u0007zu}\u0013!\u0007zu}";
      f7759[4] = "g\u0001\u0015\n#\u001cy\t\u000fEA\u0000~\u0014";
      f7759[5] = "\nWq\u0012<t\nWfN0{\u0010\u001cfP0n\u0017m1\ti*";
      f7759[6] = "z\u000e\u0005guzz\u000e\u0012;yu`E\u0012%y`g4Iy(#";
      f7759[7] = "@-H\u0019@*K\"YV!$@)]\f";
      f7759[8] = "`J\u0017\u0017*M9\u001e\u001eqøwz\u0019\u0015\u001e<\t|^\u0000";
      f7759[9] = "\u0014L\u0017%\u0004GAGEeomiu%\u001fUW@\u0014\u0012m\u0000\\\u0012T";
      f7759[10] = "\"\u0010mS/\u0013*M:V_\u0015v\b1R3'&Mm\top'I3R6\u001fcD#\u000e_";
      f7759[11] = "A\u001e\\\u0012Kg\u0018JUtҁ]\u001d\u0015\f\u0012T>\u0015H[\u0017";
      f7759[12] = "\u000et\u0015?\"=W \u001cYˮ\u0007\u0014'\u001764y\u0012`\u0002";
      f7759[13] = "\u001e\u0002{85EGVr^Ă\u007fG\\y5=\u001c\u0012W/=";
      f7759[14] = "|1.b{\u0007%e'\u0004Ċ=#!%doB|5'a";
   }
}
