package org.rusherhack.client.api;

import net.minecraft.client.MinecraftClient;

/**
 * Shared access to the Minecraft client instance.
 *
 * <p>The original class held a ZelixKlassMaster-generated reflective bootstrap that resolved
 * {@code net.minecraft.class_310} by name. That intermediary name does not exist in a Yarn
 * development environment, so the bootstrap is replaced with a direct reference. Only
 * {@code mc} and {@code f286} were ever exposed by this interface.</p>
 */
public interface Globals {
   MinecraftClient mc = MinecraftClient.getInstance();
   MinecraftClient f286 = mc;
}
