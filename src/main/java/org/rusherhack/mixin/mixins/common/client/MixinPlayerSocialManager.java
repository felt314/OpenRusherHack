package org.rusherhack.mixin.mixins.common.client;
import org.rusherhack.*;

import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.network.SocialInteractionsManager;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({SocialInteractionsManager.class})
public class MixinPlayerSocialManager {
   @Shadow
   @Final
   private Map<String, UUID> playerNameByUuid;

   @Inject(
      method = {"addPlayer"},
      at = {@At("TAIL")}
   )
   private void onAddPlayer(PlayerListEntry var1, CallbackInfo var2) {
      MixinHelper.onSocialManagerAddPlayer(var1.getProfile());
   }

   @Inject(
      method = {"removePlayer"},
      at = {@At("HEAD")}
   )
   private void onRemovePlayer(UUID var1, CallbackInfo var2) {
      String var3 = null;

      for (Entry var5 : this.playerNameByUuid.entrySet()) {
         if (((UUID)var5.getValue()).equals(var1)) {
            var3 = (String)var5.getKey();
            break;
         }
      }

      MixinHelper.onSocialManagerRemovePlayer(var1, var3);
   }
}
