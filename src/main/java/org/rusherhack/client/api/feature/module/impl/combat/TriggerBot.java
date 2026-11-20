package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
public class TriggerBot extends ToggleableModule {
   public NumberSetting<Float> attackspeed;
   public Targets f3429;
   public Timer f3430;
   public BooleanSetting weaponcheck;

   public boolean m7238(ItemStack var1) {
      if (!(Boolean)this.weaponcheck.getValue()) {
         boolean var7 = true;
         return true;
      } else if (!var1.isEmpty()) {
         Item var5;
         if (!((var5 = var1.getItem()) instanceof SwordItem) && !(var5 instanceof AxeItem)) {
            return false;
         } else {
            boolean var10002 = true;
            return true;
         }
      } else {
         return false;
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (Globals.mc.currentScreen == null && this.m7238(Globals.mc.player.getMainHandStack())) {
         HitResult var5 = Globals.mc.crosshairTarget;
         EntityHitResult var6;
         if (Globals.mc.crosshairTarget instanceof EntityHitResult
            && (var6 = (EntityHitResult)var5).getType() == Type.ENTITY
            && this.f3429.m7993(var6.getEntity())) {
            if (!this.f3430.passed(1000.0F / this.attackspeed.getValue())) {
               return;
            }

            Globals.mc.interactionManager.attackEntity(Globals.mc.player, var6.getEntity());
            Globals.mc.player.swingHand(Hand.MAIN_HAND);
            this.f3430.reset();
         }
      }
   }

   public TriggerBot() {
      super(
         "TriggerBot",
         "Automatically attackt\u0014;0*7*7;-~*6?**Jaret\u001410~'1+,*Jcrosshair",
         ModuleCategory.COMBAT
      );
      this.weaponcheck = new BooleanSetting("WeaponCheck", false);
      this.attackspeed = new NumberSetting<>("AttackSpeed", 5.0F, 1.0F, 20.0F);
      Targets var10004 = new Targets();
      boolean var10008 = true;
      this.f3429 = var10004.m9193(true, false);
      this.f3430 = new Timer();
      Setting[] var10001 = new Setting[]{this.weaponcheck, null, null};
      boolean var10005 = true;
      var10001[1] = this.attackspeed;
      var10001[2] = this.f3429;
      this.registerSettings(var10001);
   }
}
