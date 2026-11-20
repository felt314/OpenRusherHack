package org.rusherhack.client.api.feature.module.impl.client;
import org.rusherhack.*;

import java.awt.Color;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.core.command.exceptions.DispatchException;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.hud.impl.Direction;
public class Module096 extends ToggleableModule {
   public BlockPos f2280;
   public static String f2282;
   public static long f2283;

   public Module096() {
    }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      int var4 = Class253.m9155();
      Module096 var5 = this;
      if (this.f2280 != null) {
         IRenderer3D var10 = var1.getRenderer();
         var10.begin(var1.getMatrixStack());
         var10.setDepthTest(false);
         net.minecraft.util.math.Direction[] var11;
         int var8 = (var11 = net.minecraft.util.math.Direction.values()).length;
         int var7;
         int var10000 = var7 = 0;

         while (true) {
            if (var10000 >= var8) {
               var10.end();
               break;
            }

            net.minecraft.util.math.Direction var6 = var11[var7];
            if (var4 == 0) {
               break;
            }

            int var9 = ColorUtils.transparency(Class220.m8447(var5.f2280, var6) ? Color.GREEN.getRGB() : Color.RED.getRGB(), (int)f2283);
            BlockPos var10001 = var5.f2280.add(var6.getVector());
            boolean var10005 = true;
            var7++;
            var10.drawBox(var10001, true, true, var9);
            var10000 = var7;
         }
      }
   }

   @Subscribe
   public void m5108(Class586 var1) {
      this.f2280 = var1.m15855();
   }
}
