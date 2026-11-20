package org.rusherhack.client.api.accessors.packet;
import org.rusherhack.*;

import net.minecraft.network.NetworkPhase;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({NetworkPhase.class})
public interface IMixinConnectionProtocol {
}
