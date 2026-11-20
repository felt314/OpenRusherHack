package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import net.minecraft.block.Blocks;
import net.minecraft.block.IceBlock;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.NumberSetting;

import org.rusherhack.client.api.feature.hud.impl.Speed;
public class IceSpeed extends ToggleableModule {
   public NumberSetting<Float> speed;

   public IceSpeed() {
      super("IceSpeed", "W\u007f0vqcddJon ice", ModuleCategory.MOVEMENT);
      this.speed = new NumberSetting<>("Speed", 1.5F, 1.0F, 2.0F);
      this.registerSettings(this.speed);
   }

   @Subscribe
   public void m16344(Event460 var1) {
      boolean var8;
      if (!(var1.m14427() instanceof IceBlock) && !var1.m14427().equals(Blocks.PACKED_ICE) && !var1.m14427().equals(Blocks.BLUE_ICE)) {
         var8 = false;
         boolean var9 = true;
      } else {
         var8 = true;
         boolean var10002 = true;
      }

      boolean var5 = var8;
      if (var5) {
         var1.m14426(this.speed.getValue());
      }
   }
}
