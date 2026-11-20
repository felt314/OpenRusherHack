package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import net.minecraft.item.FishingRodItem;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.command.send;
import org.rusherhack.command.toggle;
public class AutoFish extends ToggleableModule {
   public BooleanSetting autodisable;
   public NumberSetting<Integer> castdelay;
   public long f3328;

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      Packet var5;
      if ((var5 = var1.getPacket()) instanceof PlaySoundS2CPacket) {
         PlaySoundS2CPacket var7 = (PlaySoundS2CPacket)var5;
         Globals.mc.send(() -> {
            if (var7.getSound().value() == SoundEvents.ENTITY_FISHING_BOBBER_SPLASH) {
               boolean var7x = Globals.mc.player.getOffHandStack().getItem() instanceof FishingRodItem;
               boolean var9;
               if (!(Globals.mc.player.getMainHandStack().getItem() instanceof FishingRodItem) && !var7x) {
                  var9 = false;
                  boolean var10 = true;
               } else {
                  var9 = true;
                  boolean var10002 = true;
               }

               boolean var5x = var9;
               if (var5x) {
                  Globals.mc.interactionManager.interactItem(Globals.mc.player, var7x ? Hand.OFF_HAND : Hand.MAIN_HAND);
                  Globals.mc.player.swingHand(var7x ? Hand.OFF_HAND : Hand.MAIN_HAND);
               }

               if ((Boolean)this.autodisable.getValue()) {
                  this.toggle();
               }
            }
         });
      }
   }

   @Override
   public String getMetadata() {
      return String.valueOf(this.castdelay.getValue());
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (Globals.mc.player.fishHook != null) {
         this.f3328 = System.currentTimeMillis();
      } else {
         boolean var6 = Globals.mc.player.getOffHandStack().getItem() instanceof FishingRodItem;
         boolean var10000;
         if (!(Globals.mc.player.getMainHandStack().getItem() instanceof FishingRodItem) && !var6) {
            var10000 = false;
            boolean var8 = true;
         } else {
            var10000 = true;
            boolean var10002 = true;
         }

         boolean var5 = var10000;
         if (var5 && System.currentTimeMillis() - this.f3328 >= this.castdelay.getValue() * 50) {
            Globals.mc.interactionManager.interactItem(Globals.mc.player, var6 ? Hand.OFF_HAND : Hand.MAIN_HAND);
            Globals.mc.player.swingHand(var6 ? Hand.OFF_HAND : Hand.MAIN_HAND);
            this.f3328 = System.currentTimeMillis();
         }
      }
   }

   public AutoFish() {
      super("AutoFish", "Automatically reels your fishing rod", ModuleCategory.PLAYER);
      this.autodisable = new BooleanSetting("AutoDisable", false);
      this.castdelay = new NumberSetting<>("CastDelay", 20, 0, 30);
      this.f3328 = System.currentTimeMillis();
      Setting[] var10001 = new Setting[]{this.autodisable, null};
      boolean var10005 = true;
      var10001[1] = this.castdelay;
      this.registerSettings(var10001);
   }
}
