package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.entity.vehicle.BoatEntity;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinLocalPlayer;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class EntityControl extends ToggleableModule {
   public BooleanSetting horsejump;
   public BooleanSetting control;
   public static EntityControl f3641;
   public BooleanSetting boatfixyaw;

   public EntityControl() {
      super("EntityControl", "Ride entities without saddles and modify their speed", ModuleCategory.MOVEMENT);
      boolean var10011 = true;
      this.control = new BooleanSetting("Control", true);
      boolean var10010 = true;
      this.horsejump = new BooleanSetting("HorseJump", true);
      this.boatfixyaw = new BooleanSetting("BoatFixYaw", false);
      f3641 = this;
      Setting[] var10001 = new Setting[]{this.control, null, null};
      boolean var10005 = true;
      var10001[1] = this.horsejump;
      var10001[2] = this.boatfixyaw;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if ((Boolean)this.horsejump.getValue()) {
         ((IMixinLocalPlayer)Globals.mc.player).setJumpRidingScale(1.0F);
      }

      Entity var4;
      if ((Boolean)this.boatfixyaw.getValue() && (var4 = Globals.mc.player.getVehicle()) instanceof BoatEntity) {
         ((BoatEntity)var4).setYaw(Globals.mc.player.getYaw());
      }
   }
}
