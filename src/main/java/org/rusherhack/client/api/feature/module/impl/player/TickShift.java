package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.s2c.common.CommonPingS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventTimerSpeed;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.command.toggle;
public class TickShift extends ToggleableModule {
   public BooleanSetting s2b2t;
   public static TickShift f3867;
   public NumberSetting<Integer> ticks;
   public float f3869;
   public int f3870;
   public boolean f3871;
   public BooleanSetting autodisable;
   public EnumSetting<TickShiftMode> mode;

   public boolean m8077() {
      Vec3d var5;
      if ((var5 = Globals.mc.player.getVelocity()).x == 0.0 && !(Math.abs(var5.y) > 0.1) && var5.z == 0.0 && !PlayerUtils.hasHorizontalInput()) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   public TickShift() {
      super("TickShift", "Queue up movements while standing still", ModuleCategory.PLAYER);
      this.mode = new EnumSetting<>("Mode", TickShiftMode.f4859);
      Integer var10011 = 20;
      boolean var10014 = true;
      this.ticks = new NumberSetting<>("Ticks", var10011, 1, 100);
      this.autodisable = new BooleanSetting("AutoDisable", false);
      boolean var3 = true;
      this.s2b2t = new BooleanSetting("2b2t", true);
      this.f3869 = 1.0F;
      f3867 = this;
      Setting[] var10001 = new Setting[]{this.mode, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.ticks;
      var10001[2] = this.autodisable;
      var10001[3] = this.s2b2t;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      if (!(Boolean)this.s2b2t.getValue()) {
         if (!this.m8077() && var1.getPacket() instanceof PlayerMoveC2SPacket) {
            boolean var10003 = true;
            var1.setCancelled(true);
         }
      }
   }

   @Override
   public String getMetadata() {
      return String.valueOf(Math.min(this.f3870, this.ticks.getValue()));
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      TickShift var5 = this;
      if (!this.f3871) {
         if (this.m8077()) {
            switch (this.mode.getValue().ordinal()) {
               case 0:
                  if (this.f3870 > 0) {
                     int var10000 = 0;
                     this.f3871 = true;

                     for (int var4 = 0; var10000 < Math.min(var5.f3870, var5.ticks.getValue()); var10000 = var4) {
                        var4++;
                        Globals.mc.player.tick();
                     }

                     var5.f3871 = false;
                     if ((Boolean)var5.autodisable.getValue()) {
                        var5.toggle();
                     }
                  }

                  var5.f3870 = 0;
                  return;
               case 1:
                  if (this.f3870 > 0) {
                     boolean var10005 = true;
                     this.f3870--;
                     if (this.f3870 == 0) {
                        if ((Boolean)this.autodisable.getValue()) {
                           this.toggle();
                        }

                        this.f3869 = 1.0F;
                        return;
                     }

                     this.f3869 = this.f3870;
                     return;
                  }
                  break;
               default:
                  return;
            }
         } else {
            boolean var10006 = true;
            this.f3870++;
            this.f3869 = 1.0F;
         }
      }
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      if (var1.getPacket() instanceof PlayerPositionLookS2CPacket) {
         this.f3870 = 0;
         if ((Boolean)this.autodisable.getValue()) {
            this.toggle();
         }
      } else if ((Boolean)this.s2b2t.getValue()) {
         if ((!this.m8077() || this.f3870 > 0) && var1.getPacket() instanceof CommonPingS2CPacket) {
            boolean var10003 = true;
            var1.setCancelled(true);
         }
      }
   }

   @Subscribe
   public void onTimerSpeed(EventTimerSpeed var1) {
      if (this.mode.getValue() == TickShiftMode.f4860) {
         if (this.f3869 != 1.0F) {
            var1.setSpeed(this.f3869);
            var1.setOverrideTimer(true);
         }
      }
   }

   @Override
   public void onEnable() {
      this.f3870 = 0;
      this.f3869 = 1.0F;
   }
}
