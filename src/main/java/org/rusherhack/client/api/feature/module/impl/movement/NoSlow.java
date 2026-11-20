package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CobwebBlock;
import net.minecraft.block.IceBlock;
import net.minecraft.block.PowderSnowBlock;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.module.impl.combat.Criticals;
public class NoSlow extends ToggleableModule {
   public boolean f2784;
   public BooleanSetting blocks;
   public BooleanSetting sneak;
   public BooleanSetting slimeblocks;
   public BooleanSetting soulsand;
   public static NoSlow f2789;
   public EnumSetting<NoSlowMode> mode;
   public BooleanSetting items;
   public BooleanSetting webs;
   public BooleanSetting ice;
   public static long f2798;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.POST
   )
   public void m6115(Event301 var1) {
        
    }

   @Subscribe
   public void m6116(Event460 var1) {
      if ((Boolean)this.blocks.getValue()) {
         if ((Boolean)this.soulsand.getValue() && var1.m14427().equals(Blocks.SOUL_SAND)) {
            var1.m14426(1.0F);
         }
      }
   }

   @Subscribe
   public void m6117(Event217 var1) {
      if ((Boolean)this.blocks.getValue()) {
         boolean var9;
         if (!(Boolean)this.ice.getValue()
            || !(var1.m8316() instanceof IceBlock)
               && !var1.m8316().equals(Blocks.PACKED_ICE)
               && !var1.m8316().equals(Blocks.FROSTED_ICE)
               && !var1.m8316().equals(Blocks.BLUE_ICE)) {
            var9 = false;
            boolean var11 = true;
         } else {
            var9 = true;
            boolean var10002 = true;
         }

         boolean var5 = var9;
         if (var5) {
            var1.m8314(0.6F);
         } else {
            if ((Boolean)this.slimeblocks.getValue() && var1.m8316().equals(Blocks.SLIME_BLOCK)) {
               var9 = true;
               boolean var13 = true;
            } else {
               var9 = false;
               boolean var12 = true;
            }

            var5 = var9;
            if (var5) {
               var1.m8314(0.6F);
            }
         }
      }
   }

   @Subscribe
   public void onMove(EventMove var1) {
        
    }

   public NoSlow() {
      super("NoSlow", "Removes item slow down", ModuleCategory.MOVEMENT);
      this.mode = new EnumSetting<>("Mode", NoSlowMode.f7599);
      boolean var10014 = true;
      this.items = new BooleanSetting("Items", true);
      boolean var10013 = true;
      this.blocks = new BooleanSetting("Blocks", true);
      this.ice = new BooleanSetting("Ice", false);
      boolean var10011 = true;
      this.webs = new BooleanSetting("Webs", true);
      this.soulsand = new BooleanSetting("SoulSand", false);
      this.slimeblocks = new BooleanSetting("SlimeBlocks", false);
      this.sneak = new BooleanSetting("Sneak", false);
      f2789 = this;
      BooleanSetting var10000 = this.blocks;
      Setting[] var10001 = new Setting[]{this.ice, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.webs;
      var10001[2] = this.soulsand;
      var10001[3] = this.slimeblocks;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.mode, null, null, null};
      var10005 = true;
      var10001[1] = this.items;
      var10001[2] = this.blocks;
      var10001[3] = this.sneak;
      this.registerSettings(var10001);
   }

   public List<Vec3d> m6119() {
        return null;
    }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }
}
