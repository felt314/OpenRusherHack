package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import net.minecraft.client.gui.screen.DeathScreen;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.deathcoords;
import org.rusherhack.command.reset;
public class AutoRespawn extends ToggleableModule {
   public BooleanSetting deathcoords;
   public Timer f5278;
   public NumberSetting<Float> delay;

   public AutoRespawn() {
      super("AutoRespawn", "Automatically respawn when you die", ModuleCategory.MISC);
      this.deathcoords = new BooleanSetting("DeathCoords", false);
      this.delay = new NumberSetting<>("Delay", 0.0F, 0.0F, 10.0F);
      this.f5278 = new Timer();
      Setting[] var10001 = new Setting[]{this.deathcoords, null};
      boolean var10005 = true;
      var10001[1] = this.delay;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void m10768(Event174 var1) {
      if ((Boolean)this.deathcoords.getValue()) {
         Object[] var10001 = new Object[]{(int)Globals.mc.player.getX(), null, null};
         boolean var10005 = true;
         var10001[1] = (int)Globals.mc.player.getY();
         var10001[2] = (int)Globals.mc.player.getZ();
         ChatUtils.print(String.format("You died at X:%d, Y:%d, Z:%d", var10001));
      }
   }

   @Subscribe(
      stage = Stage.PRE
   )
   public void onUpdate(EventUpdate var1) {
      if (Globals.mc.currentScreen instanceof DeathScreen) {
         if (this.f5278.passed(this.delay.getValue() * 1000.0F)) {
            Globals.mc.player.requestRespawn();
            Globals.mc.setScreen(null);
            this.f5278.reset();
            return;
         }
      } else {
         this.f5278.reset();
      }
   }
}
