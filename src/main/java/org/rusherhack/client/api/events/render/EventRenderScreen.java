package org.rusherhack.client.api.events.render;
import org.rusherhack.*;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;

public class EventRenderScreen extends EventCancellable {
   public int f511;
   public DrawContext f512;
   public float f513;
   public int f514;
   public Screen f515;
   public static Object[] f517 = new Object[15];
   public static String[] f518 = new String[15];

   public Screen getScreen() {
        return null;
    }

   public EventRenderScreen(Screen var1, DrawContext var2, int var3, int var4, float var5) {
      this.f515 = var1;
      this.f512 = var2;
      this.f511 = var3;
      this.f514 = var4;
      this.f513 = var5;
   }

   @Override
   public Stage getPreferredStage() {
      return Stage.POST;
   }

   public DrawContext getGraphics() {
        return null;
    }

   public float getPartialTick() {
        return 0.0f;
    }

   public int getMouseY() {
        return 0;
    }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   public MatrixStack getMatrixStack() {
        return null;
    }

   public int getMouseX() {
        return 0;
    }

   static {
      m122();
   }
   public static void m122() {
      f517[0] = "\u0017i=2Ok\u000bs?nU\u007f\u001bpt\u007fQw\u001du.2\\n\u00115?jXp\fhtnXp\u001c~(2xh\u001du.NXp\u001c~(O^l\u001d~4";
      f517[1] = "\u0002JwQn/\u0002J`\rb \u0018\u0001`\u0013b5\u001fp0L1";
      f517[2] = float.class;
      f518[2] = "java/lang/Float";
      f517[3] = int.class;
      f518[3] = "java/lang/Integer";
      f517[4] = "h'# Yrt=!|Cfd>jmDub{!xNis{7zJ`b{\u0017zJ`b";
      f517[5] = "A\u007fQt^\u0013A\u007fF(R\u001c[4F6R\t\\E\u0011i\u0004";
      f517[6] = "\u0004RH[R\u001e\u0004R_\u0007^\u0011\u001e\u0019_\u0019^\u0004\u0019h\b@\u0007@";
      f517[7] = "\u007f\u0012TC8\u001bt\u001dE\fY\u0015\u007f\u0016AV";
      f517[8] = "q}43/\u001btqjCюyq\">&&\u00160e=\u007f";
      f517[9] = "\u0002\u0015z^\f7\u0000JeM0R~qI.\u000b5VZ)\u0013\tjII";
      f517[10] = "\u001f<<.Us^{?w:yKx0,VK\u001b=lw\n\u001c\u001ax<5V C=: :";
      f517[11] = "Afo\u000e\u000b\u001bDj1~\u008cyA`oA\u0012\u0012\u0015b6C";
      f517[12] = "|39\u0000MUy?gpɦ7~,;\t\u001bN)(cL";
      f517[13] = "Ik\u001a\u0015zALgDeѺ#J7\u0019Y\"F\u0017fFZ";
      f517[14] = "=_|$\u0004Q8S\"Tɮ3>\u0003\u007fh\\VcR k";
   }
}
