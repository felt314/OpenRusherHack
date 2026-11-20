package org.rusherhack.client.api.accessors.client;
import org.rusherhack.*;

import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import net.minecraft.client.network.SocialInteractionsManager;
import net.minecraft.client.render.RenderTickCounter.Dynamic;
import net.minecraft.client.session.ProfileKeys;
import net.minecraft.client.session.Session;
import net.minecraft.client.session.report.AbuseReportContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({MinecraftClient.class})
public interface IMixinMinecraft {
   @Accessor("timer")
   Dynamic getTimer();

   @Accessor
   int getRightClickDelay();

   @Accessor("rightClickDelay")
   void setRightClickDelay(int var1);

   @Invoker("startUseItem")
   void invokeStartUseItem();

   @Accessor("user")
   @Mutable
   void setUser(Session var1);

   @Accessor("playerSocialManager")
   @Mutable
   void setPlayerSocialManager(SocialInteractionsManager var1);

   @Accessor("profileKeyPairManager")
   @Mutable
   void setProfileKeyPairManager(ProfileKeys var1);

   @Accessor("reportingContext")
   @Mutable
   void setReportingContext(AbuseReportContext var1);

   @Accessor("userApiService")
   @Mutable
   void setUserApiService(UserApiService var1);

   @Invoker("createUserApiService")
   UserApiService invokeCreateUserApiService(YggdrasilAuthenticationService var1, RunArgs var2);

   @Accessor("authenticationService")
   YggdrasilAuthenticationService getAuthenticationService();
}
