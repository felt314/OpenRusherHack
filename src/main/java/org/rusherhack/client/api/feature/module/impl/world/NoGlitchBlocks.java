package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import net.minecraft.block.BlockState;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;
public class NoGlitchBlocks extends ToggleableModule {
   public BooleanSetting breakSetting;
   public BooleanSetting place;
   public static long f4693;

   public NoGlitchBlocks() {
      super(
         "NoGlitchBlocks",
         "Prevents client-side ghost blocks",
         ModuleCategory.WORLD
      );
      boolean var10009 = true;
      this.place = new BooleanSetting("Place", true);
      boolean var10008 = true;
      this.breakSetting = new BooleanSetting("Break", true);
      Setting[] var10001 = new Setting[]{this.place, null};
      boolean var10005 = true;
      var10001[1] = this.breakSetting;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void m9497(Class007 var1) {
      BlockState var6;
      if ((var6 = var1.m340()).getBlock() != Globals.mc.world.getBlockState(var1.m15855()).getBlock()) {
         boolean var7;
         if (!(var7 = var6.isAir()) || (Boolean)this.breakSetting.getValue()) {
            if (var7 || (Boolean)this.place.getValue()) {
               if (var1.m341() == (int)f4693) {
                  boolean var10003 = true;
                  var1.setCancelled(true);
               }
            }
         }
      }
   }
}
