package org.rusherhack.mixin.mixins.common.client.gui.screen;
import org.rusherhack.*;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
    targets = {"net.minecraft.world.inventory.ArmorSlot"}
)
public class MixinArmorSlot {
    @Inject(
        method = {"getMaxStackSize"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void getMaxStackSize(CallbackInfoReturnable<Integer> var1) {
        MixinHelper.getMaxInventoryArmorSlotStackSize(var1);
    }

    @Inject(
        method = {"mayPlace"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void mayPlace(ItemStack var1, CallbackInfoReturnable<Boolean> var2) {
        MixinHelper.mayInteractWithInventoryArmorSlot(var2);
    }

    @Inject(
        method = {"mayPickup"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void mayPickup(PlayerEntity var1, CallbackInfoReturnable<Boolean> var2) {
        MixinHelper.mayInteractWithInventoryArmorSlot(var2);
    }
}
