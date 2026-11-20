package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.Speed;
public class Flight extends ToggleableModule {
   public NumberSetting<Double> maxspeed;
   public BooleanSetting bobfix;
   public double f8233;
   public NumberSetting<Float> verticalspeed;
   public BooleanSetting antikick;
   public NumberSetting<Float> speed;
   public int f8237;
   public EnumSetting<FlightMode> mode;
   public BooleanSetting acceleration;
   public NumberSetting<Double> f8240;
   public int f8241;

   public double m12440() {
      if ((Boolean)this.bobfix.getValue() && !PlayerUtils.hasHorizontalInput()) {
         switch (this.f8237) {
            case 0:
               return -0.04;
            case 1:
               return 0.04;
            default:
               return 0.0;
         }
      } else {
         return Globals.mc.player.age % 2 == 0 ? 0.04 : -0.04;
      }
   }

   public Flight() {
      super("Flight", "s\r\u0006y like a bird", ModuleCategory.MOVEMENT);
      this.mode = new EnumSetting<>("Mode", FlightMode.f2962);
      this.speed = new NumberSetting<>("Speed", 1.0F, 0.1F, 10.0F).incremental(0.1);
      this.verticalspeed = new NumberSetting<>("VerticalSpeed", 1.0F, 0.1F, 10.0F).setVisibility(() -> {
         if (this.mode.getValue() == FlightMode.f2962) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10014 = true;
      this.antikick = new BooleanSetting("AntiKick", true);
      var10014 = true;
      BooleanSetting var10009 = new BooleanSetting("BobFix", true);
      boolean var10012 = true;
      this.bobfix = var10009.setHidden(true);
      this.acceleration = new BooleanSetting("Acceleration", false);
      this.f8240 = new NumberSetting<>("Speed", 1.0, 0.0, 2.0).incremental(0.05);
      this.maxspeed = new NumberSetting<>("MaxSpeed", 2.0, 1.0, 10.0).incremental(0.1);
      this.f8233 = 0.0;
      this.f8241 = 0;
      BooleanSetting var10000 = this.acceleration;
      Setting[] var10001 = new Setting[]{this.f8240, null};
      boolean var10005 = true;
      var10001[1] = this.maxspeed;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.antikick.addSubSettings(this.bobfix);
      var10001 = new Setting[]{this.mode, null, null, null, null};
      var10005 = true;
      var10001[1] = this.speed;
      var10001[2] = this.verticalspeed;
      var10001[3] = this.antikick;
      var10001[4] = this.acceleration;
      this.registerSettings(var10001);
   }

   @Subscribe(
      stage = Stage.POST,
      priority = -100
   )
   public void onReceive(EventPacket$Receive var1) {
      Packet var6;
      if ((var6 = var1.getPacket()) instanceof EntityVelocityUpdateS2CPacket
         && ((EntityVelocityUpdateS2CPacket)var6).getEntityId() == Globals.mc.player.getId()
         && !var1.isCancelled()) {
         this.f8233 = 0.0;
         this.f8241 = 4;
      }
   }

   @Override
   public void onDisable() {
      if (Globals.mc.player != null) {
         this.f8241 = 0;
         this.f8233 = this.speed.getValue().floatValue();
         PlayerAbilities var5;
         PlayerAbilities var10000 = var5 = Globals.mc.player.getAbilities();
         var10000.allowFlying = var10000.flying = Globals.mc.player.isCreative();
         var5.setFlySpeed(0.05F);
         Globals.mc.player.setVelocity(0.0, 0.0, 0.0);
      }
   }

   @Subscribe
   public void onMove(EventMove var1) {
      if (!Class428.f7111.m12380() && this.f8241 <= 0) {
         double var5 = this.m15886(this.speed.getValue().floatValue());
         Flight var11;
         switch (this.mode.getValue().ordinal()) {
            case 0:
               boolean var10002 = true;
               int var10 = 0;
               if (Globals.mc.player.input.jumping) {
                  var10++;
               }

               if (Globals.mc.player.input.sneaking) {
                  var10--;
               }

               if (var10 != 0 || !(Boolean)this.antikick.getValue()) {
                  var1.setY(var10 * this.verticalspeed.getValue());
               }

               double[] var8 = PlayerUtils.getDirectionalSpeed(var5);
               var11 = this;
               var1.setX(var8[0]);
               var1.setZ(var8[1]);
               break;
            case 1:
               PlayerAbilities var9;
               PlayerAbilities var10000 = var9 = Globals.mc.player.getAbilities();
               boolean var10004 = true;
               var10000.allowFlying = var10000.flying = true;
               var9.setFlySpeed((float)(0.05F * var5));
            default:
               var11 = this;
         }

         if ((Boolean)var11.antikick.getValue()
            && !Globals.mc.player.isOnGround()
            && Globals.mc.player.age % 20 == 0
            && var1.getY() > Math.max(0.0, this.m12440())) {
            var1.setY(-0.04);
         }
      }
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   public double m15886(double var1) {
        return 0.0;
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (Class428.f7111.m12380()) {
         this.f8233 = 0.0;
         this.f8241 = 4;
      } else if (this.f8241 > 0) {
         boolean var4 = true;
         this.f8241--;
      } else {
         if ((Boolean)this.antikick.getValue() && !Globals.mc.player.isOnGround()) {
            boolean var10004 = true;
            this.f8237++;
            if (Globals.mc.player.age % 20 == 0) {
               this.f8237 = 0;
            }

            Globals.mc.player.setVelocity(Globals.mc.player.getVelocity().x, this.m12440(), Globals.mc.player.getVelocity().z);
         }
      }
   }
}
