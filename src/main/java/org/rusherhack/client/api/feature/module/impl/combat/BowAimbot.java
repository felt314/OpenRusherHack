package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.TridentItem;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.RotationUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

public class BowAimbot extends ToggleableModule {
   public NumberSetting<Integer> extrapolation;
   public Targets f3235;
   public static long f3240;

   public BowAimbot() {
      super("BowAimbot", "Automatically aims your bow", ModuleCategory.COMBAT);
      Targets var10004 = new Targets();
      boolean var10008 = true;
      this.f3235 = var10004.m9193(true, false);
      this.extrapolation = new NumberSetting<>("Extrapolation", "How many ticks in the future to extrapolate", 0, 0, (int)f3240);
      Setting[] var10001 = new Setting[]{this.f3235, null};
      boolean var10005 = true;
      var10001[1] = this.extrapolation;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if (Globals.mc.player.isUsingItem()) {
         Item var6;
         if ((var6 = Globals.mc.player.getStackInHand(Globals.mc.player.getActiveHand()).getItem()) instanceof BowItem
            || var6 instanceof CrossbowItem
            || var6 instanceof TridentItem) {
            LivingEntity var7;
            if ((var7 = this.m6932()) != null) {
               float[] var5;
               Vec3d var8;
               float[] var10000 = var5 = RotationUtils.getRotations(var8 = Class006.m306(var7.getBoundingBox().getCenter(), var7, this.extrapolation.getValue()));
               boolean var10003 = true;
               float var9 = (float)(var10000[1] + Globals.mc.player.getEyePos().distanceTo(var8) * -0.15F);
               RusherHackAPI.getRotationManager().updateRotation(var5[0], var9);
            }
         }
      }
   }

   public LivingEntity m6932() {
        return null;
    }
}
