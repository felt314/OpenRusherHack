package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.command.pitch;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.render.HoleESP;
public class Anchor extends ToggleableModule {
   public BooleanSetting raytrace;
   public NumberSetting<Float> f4580;
   public BooleanSetting center;
   public NumberSetting<Integer> f4582;
   public BooleanSetting onlyDescendWhileLookingAtSetPitch;
   public BooleanSetting descendIntoDoubleHoles;
   public NumberSetting<Integer> height;
   public BooleanSetting autodisable;
   public NumberSetting<Integer> range;
   public BooleanSetting descend;
   public NumberSetting<Integer> delay;
   public int f4590;
   public NumberSetting<Float> speed;

   public Anchor() {
      super("Anchor", "Stops your movement when you are over a hole", ModuleCategory.COMBAT);
      Integer var10018 = 2;
      boolean var10021 = true;
      this.height = new NumberSetting<>("Height", var10018, 1, 5);
      boolean var10019 = true;
      this.center = new BooleanSetting("Center", true);
      boolean var6 = true;
      this.raytrace = new BooleanSetting("RayTrace", true);
      this.range = new NumberSetting<>("Range", 0, 0, 3);
      this.speed = new NumberSetting<>("Speed", 0.2F, 0.1F, 0.25F);
      this.descend = new BooleanSetting("Descend", false);
      this.f4580 = new NumberSetting<>("Speed", 0.1F, 0.1F, 1.0F);
      this.descendIntoDoubleHoles = new BooleanSetting("Doubles", "Descend into double holes", false);
      this.autodisable = new BooleanSetting("AutoDisable", false);
      this.onlyDescendWhileLookingAtSetPitch = new BooleanSetting("PitchControl", "Only descend while looking at set pitch", false);
      this.f4582 = new NumberSetting<>(
         "Pitch", 45, -90, 90
      );
      this.delay = new NumberSetting<>("Delay", 30, 0, 60);
      this.f4590 = 0;
      BooleanSetting var10000 = this.center;
      Setting[] var10001 = new Setting[]{this.range, null, null};
      boolean var10005 = true;
      var10001[1] = this.raytrace;
      var10001[2] = this.speed;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.descend.addSubSettings(this.f4580);
      var10003 = true;
      this.onlyDescendWhileLookingAtSetPitch.addSubSettings(this.f4582);
      var10001 = new Setting[7];
      var10001[0] = this.height;
      var10005 = true;
      var10001[1] = this.center;
      var10001[2] = this.descend;
      var10001[3] = this.descendIntoDoubleHoles;
      var10001[4] = this.autodisable;
      var10001[5] = this.onlyDescendWhileLookingAtSetPitch;
      var10001[6] = this.delay;
      this.registerSettings(var10001);
   }

   public boolean m9271(Entity var1, BlockPos var2) {
      if (Globals.mc
            .world
            .raycast(new RaycastContext(Globals.mc.player.getPos(), Vec3d.ofCenter(var2), ShapeType.COLLIDER, FluidHandling.NONE, var1))
            .getType()
         == Type.MISS) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public boolean m9272(BlockPos var1) {
      if (!HoleESP.m16611(var1) && (!(Boolean)this.descendIntoDoubleHoles.getValue() || !HoleESP.m16616(var1))) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   @Override
   public void onEnable() {
      this.f4590 = 0;
   }

   @Subscribe(
      priority = -69
   )
   public void onMove(EventMove var1) {
        
    }
}
