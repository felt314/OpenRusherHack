package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import java.lang.reflect.Method;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.entity.IMixinEntity;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventInteract;
import org.rusherhack.client.api.events.player.EventInteract$Action;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
public class Criticals extends ToggleableModule {
   public static Criticals f8827;
   public boolean f8828;
   public BooleanSetting strict;
   public double[] f8830;
   public LivingEntity f8831;
   public double[] f8832;
   public BooleanSetting allowsCriticalsWhileSprinting;
   public Timer f8834;
   public EnumSetting<CriticalsMethodToAchieveCriticalHits> methodToAchieveCriticalHits;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.ALL
   )
   public void onInteract(EventInteract var1) {
        
    }

   public boolean m16933() {
      if (this.isToggled() && (Boolean)this.allowsCriticalsWhileSprinting.getValue() && this.f8831 != null) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      if (var1.getPacket() instanceof HandSwingC2SPacket && !this.f8834.passed(25.0)) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   public Criticals() {
      super("Criticals", "Always do critical hits", ModuleCategory.COMBAT);
      this.methodToAchieveCriticalHits = new EnumSetting<>("Mode", "Method to achieve critical hits", CriticalsMethodToAchieveCriticalHits.f2890);
      boolean var10006 = true;
      this.strict = new BooleanSetting("Strict", true).setVisibility(() -> {
         if (this.methodToAchieveCriticalHits.getValue() == CriticalsMethodToAchieveCriticalHits.f2886) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10015 = true;
      this.allowsCriticalsWhileSprinting = new BooleanSetting("WhileSprinting", "Allows criticals while sprinting", true);
      double[] var10007 = new double[]{0.05, 0.0, 0.0, 0.0};
      boolean var10011 = true;
      var10007[1] = 0.0;
      var10007[2] = 0.012;
      var10007[3] = 0.0;
      this.f8830 = var10007;
      double[] var10005 = new double[]{0.062, 0.0, 0.0, 0.0};
      boolean var10009 = true;
      var10005[1] = 0.0;
      var10005[2] = 0.072;
      var10005[3] = 0.0;
      this.f8832 = var10005;
      this.f8834 = new Timer();
      f8827 = this;
      Setting[] var10001 = new Setting[]{this.methodToAchieveCriticalHits, null, null};
      boolean var3 = true;
      var10001[1] = this.strict;
      var10001[2] = this.allowsCriticalsWhileSprinting;
      this.registerSettings(var10001);
   }

   public static boolean m7812() {
      if (!((IMixinEntity)Globals.mc.player).getStuckSpeedMultiplier().equals(Vec3d.ZERO)) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public String getMetadata() {
      return this.methodToAchieveCriticalHits.getDisplayValue();
   }

   @Subscribe
   public void onMove(EventMove var1) {
      if ((this.methodToAchieveCriticalHits.getValue() == CriticalsMethodToAchieveCriticalHits.f2890 || this.methodToAchieveCriticalHits.getValue() == CriticalsMethodToAchieveCriticalHits.f2888) && this.f8831 != null) {
         if (this.f8828) {
            Globals.mc.player.setSprinting(false);
         }
      }
   }

   @Subscribe(
      priority = 1000
   )
   public void onUpdate(EventUpdate var1) {
      if ((this.methodToAchieveCriticalHits.getValue() == CriticalsMethodToAchieveCriticalHits.f2890 || this.methodToAchieveCriticalHits.getValue() == CriticalsMethodToAchieveCriticalHits.f2888)
         && this.f8831 != null
         && !this.f8831.isDead()) {
         if (this.f8828) {
            Globals.mc.player.setSprinting(false);
         }

         if (!(Class220.m8445(this.f8831) > 3.0F)) {
            RusherHackAPI.getRotationManager().updateRotation(this.f8831);
            if (RusherHackAPI.getRotationManager().isLookingAt(this.f8831)) {
               if (!Globals.mc.player.isOnGround() && !RusherHackAPI.getServerState().isPlayerSprinting()
                  || this.f8834.passed(1000.0)
                  || this.methodToAchieveCriticalHits.getValue() == CriticalsMethodToAchieveCriticalHits.f2888 && Globals.mc.player.isOnGround() && Globals.mc.player.getVelocity().y < 0.0) {
                  Globals.mc.interactionManager.attackEntity(Globals.mc.player, this.f8831);
                  this.f8831 = null;
                  Globals.mc.player.networkHandler.sendPacket(new HandSwingC2SPacket(Hand.MAIN_HAND));
               }
            }
         }
      } else {
         this.f8831 = null;
      }
   }
}
