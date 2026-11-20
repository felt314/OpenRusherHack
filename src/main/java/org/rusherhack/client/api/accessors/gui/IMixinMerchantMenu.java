package org.rusherhack.client.api.accessors.gui;
import org.rusherhack.*;

import net.minecraft.screen.MerchantScreenHandler;
import net.minecraft.village.Merchant;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({MerchantScreenHandler.class})
public interface IMixinMerchantMenu {
   @Accessor("trader")
   Merchant getTrader();
}
