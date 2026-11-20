package org.rusherhack.client.api.events.render;
import org.rusherhack.*;

import net.minecraft.client.gui.DrawContext;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.core.event.stage.Stage;

public class EventRender2D extends EventRender {
   public RenderContext f450;
   public static Object[] f452 = new Object[6];

   public DrawContext getGraphics() {
        return null;
    }

   public RenderContext getRenderContext() {
        return null;
    }

   public EventRender2D(DrawContext var1, float var2) {
      super(var1.getMatrices(), var2);
      this.f450 = new RenderContext(var1, var2);
   }

   @Override
   public Stage getStage() {
        return null;
    }

   static {
      m157();
   }
   public static void m157() {
        
    }
}
