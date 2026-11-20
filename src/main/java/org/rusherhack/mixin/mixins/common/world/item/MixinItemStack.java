package org.rusherhack.mixin.mixins.common.world.item;
import org.rusherhack.*;

import java.util.List;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.TooltipContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ItemStack.class})
public class MixinItemStack {
   @Inject(
      method = {"getTooltipLines"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getItemTooltipLines(TooltipContext var1, @Nullable PlayerEntity var2, TooltipType var3, CallbackInfoReturnable<List<Text>> var4) {
      MixinHelper.getItemTooltip(ItemStack.class.cast(this), var4);
   }
}
