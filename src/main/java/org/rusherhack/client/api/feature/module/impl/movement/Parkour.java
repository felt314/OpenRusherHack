package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;

public class Parkour extends ToggleableModule {
   public BooleanSetting jumpFromSlabs;
   public boolean f8604;

   @Subscribe(
      priority = -50
   )
   public void onMove(EventMove var1) {
        
    }

   public Parkour() {
      super(
         "Parkour",
         "Jumps when on $\u000b}p5pqr$\u000f of blocks",
         ModuleCategory.MOVEMENT
      );
      boolean var10009 = true;
      this.jumpFromSlabs = new BooleanSetting("Slabs", "Jump from slabs", true);
      this.registerSettings(this.jumpFromSlabs);
   }

   @Subscribe(
      stage = Stage.POST
   )
   public void m16500(Event301 var1) {
      if (this.f8604) {
         var1.m10147().jumping = true;
      }
   }
}
