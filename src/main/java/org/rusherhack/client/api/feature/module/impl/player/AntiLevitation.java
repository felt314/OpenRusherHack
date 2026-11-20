package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import net.minecraft.entity.effect.StatusEffects;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.EnumSetting;
public class AntiLevitation extends ToggleableModule {
   public EnumSetting<AntiLevitationActionTakenWhenLevitationIsActive> actionTakenWhenLevitationIsActive;

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      int var4 = Class253.m9155();
      if (Globals.mc.player.hasStatusEffect(StatusEffects.LEVITATION)) {
         switch (this.actionTakenWhenLevitationIsActive.getValue().ordinal()) {
            case 0:
               Globals.mc.player.removeStatusEffect(StatusEffects.LEVITATION);
               return;
            case 1:
               double var5;
               label30: {
                  Globals.mc.player.getAbilities().flying = false;
                  var5 = 0.0;
                  if (Globals.mc.options.jumpKey.isPressed() && !Globals.mc.options.sneakKey.isPressed()) {
                     var5 = 0.1;
                     if (var4 != 0) {
                        break label30;
                     }
                  }

                  if (Globals.mc.options.sneakKey.isPressed() && !Globals.mc.options.jumpKey.isPressed()) {
                     var5 = -0.15;
                  }
               }

               Globals.mc.player.setVelocity(Globals.mc.player.getVelocity().x, var5, Globals.mc.player.getVelocity().z);
         }
      }
   }

   @Override
   public String getMetadata() {
      return this.actionTakenWhenLevitationIsActive.getDisplayValue();
   }

   public AntiLevitation() {
      super("AntiLevitation", "Removes the levitation effect", ModuleCategory.PLAYER);
      this.actionTakenWhenLevitationIsActive = new EnumSetting<>("Mode", "Action taken when levitation is active", AntiLevitationActionTakenWhenLevitationIsActive.f249);
      this.registerSettings(this.actionTakenWhenLevitationIsActive);
   }
}
