package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;

public class BlockTweaks extends ToggleableModule {
   public static BlockTweaks f5770;
   public BooleanSetting abort;
   public List<Item> f5772;

   @Subscribe
   public void onSend(EventPacket$Send var1) {
   }

   public BlockTweaks() {
        super("BlockTweaks", "aBPT^F\u0015SZG\u0015W\r\u0006ock related actions", ModuleCategory.WORLD);
      int var10001 = 12;

      boolean var10009 = true;
      this.abort = new BooleanSetting("Abort", "Allows you to stop and continue mining at the same break progress", true);
      Item[] var3 = new Item[var10001];
      var3[0] = Items.FLINT_AND_STEEL;
      boolean var10005 = true;
      var3[1] = Items.END_CRYSTAL;
      var3[2] = Items.OAK_DOOR;
      var3[3] = Items.DARK_OAK_DOOR;
      var3[4] = Items.ACACIA_DOOR;
      var3[5] = Items.IRON_DOOR;
      var3[6] = Items.BIRCH_DOOR;
      var3[7] = Items.JUNGLE_DOOR;
      var3[8] = Items.SPRUCE_DOOR;
      var3[9] = Items.REDSTONE;
      var3[10] = Items.REPEATER;
      var3[11] = Items.COMPARATOR;
      this.f5772 = Lists.newArrayList(var3);
      (f5770 = this).registerSettings(this.abort);
   }
}
