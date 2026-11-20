package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import java.io.File;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.FogShape;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.config.Configuration;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.command.XrayCommand;
import org.rusherhack.command.config;
import org.rusherhack.command.reload;
import org.rusherhack.command.toggle;
public class Xray extends ToggleableModule {
   public static BooleanSetting softreload;
   public Class200 f4677;
   public static Xray f4678;
   public static EnumSetting<XrayMode> mode;
   public static NumberSetting<Integer> f4680;

   public Class200 m9475() {
      return this.f4677;
   }

   

   public static void m9476() {
      if ((Boolean)softreload.getValue()) {
         m9478();
      } else {
         Globals.mc.worldRenderer.reload();
      }
   }

   public static void m9478() {
   }

   @Override
   public void onDisable() {
      Globals.mc.chunkCullingEnabled = true;
      m9476();
   }

   @Override
   public void onEnable() {
      if (Globals.mc.world == null) {
         this.toggle();
      } else {
         Globals.mc.chunkCullingEnabled = false;
         m9476();
      }
   }

   @Override
   public ModuleCommand createCommand() {
      return new XrayCommand(this, this);
   }

   @Subscribe
   public void m9479(Class535 var1) {
      if (var1.m16518() == FogType.FOG_TERRAIN) {
         var1.f8613 = FogShape.CYLINDER;
         var1.f8614 = -1.0F;
         var1.f8611 = 1000000.0F;
      }
   }

   public Xray() {
      super("Xray", "See ores through blocks", ModuleCategory.RENDER);
      this.f4677 = new Class200(new File(Configuration.CONFIG_DIRECTORY.resolve("xray").toFile(), "blocks.json"));
      f4678 = this;
      if (this.f4677.m5251().isEmpty()) {
         this.f4677.m7840(Blocks.COAL_ORE);
         this.f4677.m7840(Blocks.DEEPSLATE_COAL_ORE);
         this.f4677.m7840(Blocks.DIAMOND_ORE);
         this.f4677.m7840(Blocks.DEEPSLATE_DIAMOND_ORE);
         this.f4677.m7840(Blocks.EMERALD_ORE);
         this.f4677.m7840(Blocks.DEEPSLATE_EMERALD_ORE);
         this.f4677.m7840(Blocks.GOLD_ORE);
         this.f4677.m7840(Blocks.DEEPSLATE_GOLD_ORE);
         this.f4677.m7840(Blocks.IRON_ORE);
         this.f4677.m7840(Blocks.DEEPSLATE_IRON_ORE);
         this.f4677.m7840(Blocks.LAPIS_ORE);
         this.f4677.m7840(Blocks.DEEPSLATE_LAPIS_ORE);
         this.f4677.m7840(Blocks.REDSTONE_ORE);
         this.f4677.m7840(Blocks.DEEPSLATE_REDSTONE_ORE);
         this.f4677.m7840(Blocks.COPPER_ORE);
         this.f4677.m7840(Blocks.DEEPSLATE_COPPER_ORE);
         this.f4677.m7840(Blocks.NETHER_QUARTZ_ORE);
         this.f4677.m7840(Blocks.NETHER_GOLD_ORE);
         this.f4677.m7840(Blocks.ANCIENT_DEBRIS);
         this.f4677.m7840(Blocks.WATER);
         this.f4677.m7840(Blocks.LAVA);
      }

      Class170.f3364.m7112().m8473(this.f4677, this.f4677);
   }
}
