package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.passive.CamelEntity;
import net.minecraft.entity.passive.DonkeyEntity;
import net.minecraft.entity.passive.LlamaEntity;
import net.minecraft.entity.passive.MuleEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity.Type;
import net.minecraft.util.Hand;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.entity.IMixinEntity;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
public class AutoMount extends ToggleableModule {
   public BooleanSetting tamed;
   public NumberSetting<Integer> delay;
   public BooleanSetting donkeys;
   public BooleanSetting pigs;
   public NumberSetting<Float> range;
   public BooleanSetting minecarts;
   public NullSetting targets;
   public BooleanSetting llamas;
   public Entity f4334;
   public BooleanSetting boats;
   public BooleanSetting horses;
   public Timer f4337;
   public BooleanSetting camels;
   public BooleanSetting rotate;

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (Globals.mc.player.hasVehicle()) {
         this.f4337.reset();
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.ALL
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
        
    }

   public boolean m8884(Entity var1) {
      if (!((IMixinEntity)var1).invokeCanAddPassenger(Globals.mc.player)) {
         return false;
      } else if (var1 instanceof AbstractHorseEntity var9) {
         if ((Boolean)this.tamed.getValue() && !var9.isTame()) {
            return false;
         } else if (var9.isBaby()) {
            return false;
         } else if (var1 instanceof DonkeyEntity || var1 instanceof MuleEntity) {
            return (Boolean)this.donkeys.getValue();
         } else if (var1 instanceof LlamaEntity) {
            return (Boolean)this.llamas.getValue();
         } else {
            return var1 instanceof CamelEntity ? (Boolean)this.camels.getValue() : (Boolean)this.horses.getValue();
         }
      } else if (var1 instanceof BoatEntity) {
         return (Boolean)this.boats.getValue();
      } else if (var1 instanceof MinecartEntity) {
         MinecartEntity var8;
         if ((var8 = (MinecartEntity)var1).getMinecartType() == Type.RIDEABLE && (Boolean)this.minecarts.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      } else {
         PigEntity var5;
         return var1 instanceof PigEntity && (var5 = (PigEntity)var1).isSaddled() ? (Boolean)this.pigs.getValue() : false;
      }
   }

   public AutoMount() {
      super("AutoMount", "Automatically mount entities", ModuleCategory.MISC);
      this.targets = new NullSetting("Targets");
      boolean var10018 = true;
      this.horses = new BooleanSetting("Horses", true);
      boolean var10017 = true;
      this.donkeys = new BooleanSetting("Donkeys", true);
      boolean var10016 = true;
      this.llamas = new BooleanSetting("Llamas", true);
      boolean var10015 = true;
      this.camels = new BooleanSetting("Camels", true);
      boolean var10014 = true;
      this.boats = new BooleanSetting("Boats", true);
      boolean var10013 = true;
      this.minecarts = new BooleanSetting("Minecarts", true);
      boolean var10012 = true;
      this.pigs = new BooleanSetting("Pigs", true);
      this.range = new NumberSetting<>("Range", 3.0F, 1.0F, 6.0F);
      this.delay = new NumberSetting<>("Delay", 0, 0, 20);
      boolean var10009 = true;
      this.tamed = new BooleanSetting("Tamed", true);
      boolean var10008 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.f4337 = new Timer();
      NullSetting var10000 = this.targets;
      Setting[] var10001 = new Setting[6];
      var10001[0] = this.horses;
      boolean var10005 = true;
      var10001[1] = this.donkeys;
      var10001[2] = this.llamas;
      var10001[3] = this.boats;
      var10001[4] = this.minecarts;
      var10001[5] = this.pigs;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.targets, null, null, null, null};
      var10005 = true;
      var10001[1] = this.range;
      var10001[2] = this.delay;
      var10001[3] = this.tamed;
      var10001[4] = this.rotate;
      this.registerSettings(var10001);
   }
}
