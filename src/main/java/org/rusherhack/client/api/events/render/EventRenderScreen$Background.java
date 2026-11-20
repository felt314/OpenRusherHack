package org.rusherhack.client.api.events.render;
import org.rusherhack.*;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import org.rusherhack.core.event.type.EventCancellable;

import org.rusherhack.client.api.feature.module.impl.client.Background;
public class EventRenderScreen$Background extends EventCancellable {
   public DrawContext f506;
   public Screen f507;
   public static Object[] f509 = new Object[6];

   public DrawContext getGraphics() {
        return null;
    }

   public Screen getScreen() {
        return null;
    }

   public EventRenderScreen$Background(Screen var1, DrawContext var2) {
      this.f507 = var1;
      this.f506 = var2;
   }

   static {
      m122();
   }
   public static void m122() {
      f509[0] = "n\u000fE\tW4r\u0015GUM b\u0016\fDI(d\u0013V\tD1hSGQ@/u\u000e\fU@/e\u0018P\t`7d\u0013Vu@/e\u0018PtF3d\u0018L\u0003g b\u0016EUJ4o\u0019";
      f509[1] = "KM;$=\u0001KM,x1\u000eQ\u0006,f1\u001bVw{9g";
      f509[2] = "[\u0007R'Y\u001f[\u0007E{U\u0010ALEeU\u0005F=\u0015:\u0006";
      f509[3] = "\b:m K\u0003\u00035|o*\r\b>x5";
      f509[4] = "S\u0018=\u000fkiZH0iЖ\u000fIJb\u0015z?RX8";
      f509[5] = "\u000e8N\u0010\u0006g\u0007hCv.\u0001Ua_F\u00128QuH\u001a";
   }
}
