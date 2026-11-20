/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.serialization.Codec
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.ShapeContext
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.Drawable
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.TitleScreen
 *  net.minecraft.client.gui.tooltip.TooltipComponent
 *  net.minecraft.client.gui.tooltip.TooltipPositioner
 *  net.minecraft.client.gui.widget.TextFieldWidget
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.client.network.ServerAddress
 *  net.minecraft.client.network.ServerInfo
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.option.SimpleOption
 *  net.minecraft.client.option.SimpleOption.Callbacks
 *  net.minecraft.client.option.SimpleOption.ValidatingIntSliderCallbacks
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.render.BackgroundRenderer.FogData
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.DimensionEffects
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider.Immediate
 *  net.minecraft.client.render.entity.EntityRenderer
 *  net.minecraft.client.render.item.ItemRenderer
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.util.SkinTextures
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.Entity.RemovalReason
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.passive.PigEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.vehicle.BoatEntity
 *  net.minecraft.item.ItemPlacementContext
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.NetworkSide
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.PacketType
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.particle.ParticleEffect
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.tag.FluidTags
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.Text
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Arm
 *  net.minecraft.util.Hand
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.Pair
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.util.shape.VoxelShapes
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.GameMode
 *  net.minecraft.world.World
 *  net.minecraft.world.chunk.WorldChunk
 *  org.joml.Vector3f
 *  org.lwjgl.glfw.GLFW
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package org.rusherhack.mixin;
import org.rusherhack.Check;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.serialization.Codec;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.client.gui.tooltip.TooltipPositioner;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.SimpleOption;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.network.NetworkSide;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.PacketType;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameMode;
import net.minecraft.world.World;
import net.minecraft.world.chunk.WorldChunk;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;
import org.rusherhack.client.api.feature.module.impl.world.BlockTweaks;
import org.rusherhack.client.api.feature.module.impl.movement.BoatFly;
import org.rusherhack.client.api.feature.module.impl.movement.EntityControl;
import org.rusherhack.client.api.feature.module.impl.world.Environment;
import org.rusherhack.client.api.feature.module.impl.chat.ExtraChat;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraTab;
import org.rusherhack.client.api.feature.module.impl.world.ForcePlace;
import org.rusherhack.client.api.feature.module.impl.render.FullBright;
import org.rusherhack.client.api.feature.module.impl.misc.LagReducer;
import org.rusherhack.client.api.feature.module.impl.world.LiquidInteract;
import org.rusherhack.client.api.feature.module.impl.player.MultiTask;
import org.rusherhack.client.api.feature.module.impl.movement.NoSlow;
import org.rusherhack.Class007;
import org.rusherhack.client.api.feature.module.impl.world.Module011;
import org.rusherhack.Class066;
import org.rusherhack.Event068;
import org.rusherhack.Event158;
import org.rusherhack.Event163;
import org.rusherhack.Event169;
import org.rusherhack.Class170;
import org.rusherhack.Event172;
import org.rusherhack.Event174;
import org.rusherhack.client.api.feature.module.impl.render.Enum201;
import org.rusherhack.Class203;
import org.rusherhack.Event204;
import org.rusherhack.Class206;
import org.rusherhack.Event217;
import org.rusherhack.Class227;
import org.rusherhack.Event230;
import org.rusherhack.Event239;
import org.rusherhack.Event241;
import org.rusherhack.Module243;
import org.rusherhack.Class253;
import org.rusherhack.Event254;
import org.rusherhack.Event261;
import org.rusherhack.Class267;
import org.rusherhack.Class275;
import org.rusherhack.Event301;
import org.rusherhack.Event320;
import org.rusherhack.Event330;
import org.rusherhack.Event332;
import org.rusherhack.Class334;
import org.rusherhack.Class353;
import org.rusherhack.Class368;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraTabPing;
import org.rusherhack.Class381;
import org.rusherhack.Event390;
import org.rusherhack.Class391;
import org.rusherhack.Class404;
import org.rusherhack.Class417;
import org.rusherhack.Enum433;
import org.rusherhack.Class459;
import org.rusherhack.Event460;
import org.rusherhack.Enum464;
import org.rusherhack.client.api.feature.module.impl.player.Enum466;
import org.rusherhack.Event481;
import org.rusherhack.Event482;
import org.rusherhack.Event485;
import org.rusherhack.Event488;
import org.rusherhack.Class491;
import org.rusherhack.Event492;
import org.rusherhack.client.api.feature.module.impl.movement.Enum495;
import org.rusherhack.Class499;
import org.rusherhack.Event516;
import org.rusherhack.Class519;
import org.rusherhack.Class524;
import org.rusherhack.Class535;
import org.rusherhack.Event537;
import org.rusherhack.Event552;
import org.rusherhack.Event554;
import org.rusherhack.Event565;
import org.rusherhack.client.api.feature.module.impl.render.Enum575;
import org.rusherhack.Class576;
import org.rusherhack.Event581;
import org.rusherhack.Class586;
import org.rusherhack.Event601;
import org.rusherhack.client.api.feature.module.impl.misc.PingSpoof;
import org.rusherhack.client.api.feature.hud.impl.PlayerView;
import org.rusherhack.client.api.feature.module.impl.misc.PortalGui;
import org.rusherhack.client.api.feature.module.impl.render.RainbowEnchant;
import org.rusherhack.client.api.feature.module.impl.player.ShulkerCeption;
import org.rusherhack.client.api.feature.module.impl.movement.Sprint;
import org.rusherhack.client.api.feature.module.impl.movement.TridentTweaks;
import org.rusherhack.client.api.feature.module.impl.render.ViewModel;
import org.rusherhack.client.api.feature.module.impl.player.XCarry;
import org.rusherhack.client.api.feature.module.impl.render.Xray;
import org.rusherhack.client.api.feature.module.impl.render.Zoom;
import org.rusherhack.client.Freecam;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.client.IMixinKeyMapping;
import org.rusherhack.client.api.accessors.client.IMixinOptions;
import org.rusherhack.client.api.accessors.world.IMixinLevel;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventQuit$Reason;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.client.chat.EventAddChat;
import org.rusherhack.client.api.events.client.chat.EventChatMessage;
import org.rusherhack.client.api.events.client.input.EventKeyboard;
import org.rusherhack.client.api.events.client.input.EventMouse$Key;
import org.rusherhack.client.api.events.client.input.EventMouse$Move;
import org.rusherhack.client.api.events.client.input.EventMouse$Scroll;
import org.rusherhack.client.api.events.client.screen.EventResizeDisplay;
import org.rusherhack.client.api.events.client.screen.EventScreen$BuildButtons;
import org.rusherhack.client.api.events.client.screen.EventScreen$Change;
import org.rusherhack.client.api.events.client.screen.EventScreen$Initialize;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventInteract;
import org.rusherhack.client.api.events.player.EventInteract$Action;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.events.player.EventMove$Mount;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.events.render.EventRenderBlockEntity;
import org.rusherhack.client.api.events.render.EventRenderEntity;
import org.rusherhack.client.api.events.render.EventRenderEntity$Armor;
import org.rusherhack.client.api.events.render.EventRenderEntity$ItemFrameParts;
import org.rusherhack.client.api.events.render.EventRenderEntity$ItemFrameParts.Part;
import org.rusherhack.client.api.events.render.EventRenderEntity$Nametag;
import org.rusherhack.client.api.events.render.EventRenderScreen;
import org.rusherhack.client.api.events.render.EventRenderScreen$Background;
import org.rusherhack.client.api.events.world.EventChunk$Load;
import org.rusherhack.client.api.events.world.EventChunk$Unload;
import org.rusherhack.client.api.events.world.EventEntity$Add;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.core.event.EventBus;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.Event;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.MathUtils;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import org.rusherhack.client.api.feature.hud.impl.Armor;
import org.rusherhack.client.api.feature.module.impl.client.Background;
public class MixinHelper
implements Globals {
    public static boolean f1851;
    public static HashMap<String, Pair<Runnable, Runnable>> f1852;
    public static Color f1860;
    public static HashMap<EntityRenderer<?>, Class524<?>> f1865;
    public static String[] f1866;
    public static long f1867;
    public static String[] f1868;
    public static String[] f1869;
    public static Map f1870;
    public static long[] f1871;
    public static Integer[] f1872;
    public static Map f1873;
    public static long f1874;
    public static Object[] f1875;
    public static String[] f1876;
    public static String gPJN = "e97cc36b97bfd543547fabfeab157f177dc3c0be";

    public static void decorateName(PlayerListEntry callbackInfoReturnable, MutableText mutableText, CallbackInfoReturnable<MutableText> callbackInfoReturnable2) {
        
    }

    public static void addParticle(ParticleEffect objectParam, CallbackInfoReturnable<Particle> callbackInfoReturnable) {
        
    }

    public static void onAttack(PlayerEntity objectParam, Entity entity, CallbackInfo callbackInfo, int n) {
        
    }

    public static void onUpdateHitResult(float f) {
        
    }

    public static boolean stopFireworkBoost() {
        return false;
    }

    /*
     * Exception decompiling
     */
    public static double getBlockReach(double var0) {
        return var0;
    }

    public static void onHitBlock(BlockPos objectParam, Direction direction, CallbackInfoReturnable<Boolean> callbackInfoReturnable, int n) {
        
    }

    public static void preRenderItemSlot(DrawContext objectParam, Slot slot, CallbackInfo callbackInfo) {
        
    }

    public static void onRenderScreen(Screen objectParam, DrawContext drawContext, int n, int n2, float f, int n3, CallbackInfo callbackInfo) {
        
    }

    public static void loadWorld(boolean bl) {
        
    }

    public static void onBlockChange(BlockPos objectParam, BlockState blockState, int n, CallbackInfoReturnable<Boolean> callbackInfoReturnable, int n2) {
        
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Vec3d onEntityMove(Entity objectParam, Vec3d vec3d) {
        return vec3d;
    }

    public static void shouldRenderBlockFace(BlockState callbackInfoReturnable, CallbackInfoReturnable<Boolean> callbackInfoReturnable2) {
        
    }

    public static void onRenderBlockEntity(BlockEntity blockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, Object object, int n) {
        
    }

    public static void onGameStop(CallbackInfo callbackInfo) {
        
    }

    public static void onMouseScroll(long l, double d, double d2, CallbackInfo callbackInfo) {
        
    }

    public static void onRenderPanorama(float f, float f2, CallbackInfo callbackInfo) {
        
    }

    public static void getCloudColor(CallbackInfoReturnable<Vec3d> object) {
        
    }

    public static void getTabListPlayers(CallbackInfoReturnable<List<PlayerListEntry>> callbackInfoReturnable) {
        
    }

    public static void isInsidePortalThisTick(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void getBlockCollisionShape(BlockPos objectParam, BlockState blockState, ShapeContext shapeContext, CallbackInfoReturnable<VoxelShape> callbackInfoReturnable) {
        
    }

    public static boolean onRenderChatInput(DrawContext objectParam, int n, TextFieldWidget textFieldWidget) {
        return false;
    }

    public static void onSetupFog(BackgroundRenderer.FogData objectParam, CallbackInfo callbackInfo) {
        
    }

    public static Screen onSetScreen(Screen objectParam, CallbackInfo callbackInfo, int n) {
        return objectParam;
    }

    public static void onRenderScreenBackground(Screen objectParam, DrawContext drawContext, CallbackInfo callbackInfo) {
        
    }

    public static void onRenderTooltip(DrawContext objectParam, List<TooltipComponent> drawContext, int n, int n2, TooltipPositioner tooltipPositioner, int n3, CallbackInfo callbackInfo) {
        
    }

    public static boolean shouldCancelItemFramePart(int n) {
        return false;
    }

    public static void onCompleteUsingItem(LivingEntity livingEntity) {
        
    }

    public static void noSlowHook(int n, CallbackInfo callbackInfo) {
        
    }

    public static void getCameraDistance(Camera objectParam, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        
    }

    public static float getTimerSpeed() {
        return 1.0f;
    }

    public static void onGameShutdown() {
        
    }

    /*
     * Exception decompiling
     */
    public static double getEntityReach(double var0) {
        return var0;
    }

    public static void onReleaseKey(KeyBinding keyBinding) {
        
    }

    /*
     * Unable to fully structure code
     */
    public static void getLightmapBrightness(CallbackInfoReturnable<Float> var0) {
        
    }

    public static void mayPlaceInShulkerSlot(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    public static void getItemTooltip(ItemStack objectParam, CallbackInfoReturnable<List<Text>> obf1722) {
        
    }

    public static int getTabListHeight(int n) {
        return n;
    }

    public static void onEntityPushed(Entity entity, double d, double d2, double d3, CallbackInfo callbackInfo) {
        
    }

    public static void getMarkerParticleTarget(CallbackInfoReturnable<Block> obf519) {
        
    }

    public static void postGameStart() {
        
    }

    public static int getTabListBackgroundColor(int n) {
        return n;
    }

    public static void getClearColorScale(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        
    }

    public static void playerHasForwardImpulse(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    public static void onConnectToServer(ServerAddress serverAddress, ServerInfo serverInfo) {
        
    }

    public static void onRenderEffect(CallbackInfo objectParam, int n) {
        
    }

    public static boolean isPlayerDestroyingBlock(ClientPlayerInteractionManager clientPlayerInteractionManager) {
        return clientPlayerInteractionManager.isBreakingBlock();
    }

    public static boolean isRaining(World world) {
        return world.isRaining();
    }

    public static void onPlayerTick(ClientPlayerEntity objectParam, int n, CallbackInfo callbackInfo) {
        
    }

    public static /* synthetic */ void lambda$modifyOutputStateShard$4(String string) {
        long l = f1867 ^ 0x274388EC1621L;
        MixinHelper.\u03c9((String)string);
    }

    public static void onHealthUpdate(float f) {
        
    }

    public static void shouldShowEntityNametag(Entity objectParam, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    public static void setBoatInput(BoatEntity boatEntity, boolean bl, boolean bl2, CallbackInfo callbackInfo) {
        
    }

    public static int getChatLineLimit(int n) {
        return n;
    }

    public static void onViewTransform(CallbackInfo objectParam, int n) {
        
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void forcePlaceHook(PlayerEntity playerEntity, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    public static void scaleEntity(Entity entity, MatrixStack matrixStack, float f) {
        
    }

    public static void getBlockFriction(Block objectParam, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        
    }

    public static void onPushOutOfBlocks(ClientPlayerEntity objectParam, CallbackInfo callbackInfo) {
        
    }

    public static void onRenderArmorLayer(MatrixStack objectParam, VertexConsumerProvider vertexConsumerProvider, int n, LivingEntity livingEntity, float f, float f2, float f3, float f4, float f5, float f6, CallbackInfo callbackInfo) {
        
    }

    public static void forcePlaceItemHook(ClientPlayerEntity clientPlayerEntity, Hand hand) {
        
    }

    public static void spawnItemParticles(ItemStack objectParam, CallbackInfo callbackInfo) {
        
    }

    public static void modifyTridentCollision(Args args, LivingEntity livingEntity) {
        
    }

    public static void postInputTick(Input input, int n) {
        
    }

    public static void mayInteractWithInventoryArmorSlot(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    public static void getBlockShadeBrightness(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        
    }

    public static Text onRenderEntityNametag(Entity objectParam, Text text, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int n, CallbackInfo callbackInfo, int n2) {
        return text;
    }

    public static Entity getCameraEntityForPick(MinecraftClient minecraftClient) {
        return minecraftClient.getCameraEntity();
    }

    public static VertexConsumerProvider onRenderEntityMain(Entity entity, float f, float f2, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int n) {
        return vertexConsumerProvider;
    }

    public static Entity getCameraEntity(Camera camera) {
        return camera.getFocusedEntity();
    }

    public static void onRenderTablistPingIcon(DrawContext drawContext, int n, int n2, PlayerListEntry playerListEntry, CallbackInfo callbackInfo) {
        
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void onSocialManagerAddPlayer(GameProfile object) {
        
    }

    public static void onLoadChunk(int n, int n2, WorldChunk worldChunk, CallbackInfoReturnable<WorldChunk> callbackInfoReturnable, int n3) {
        
    }

    public static void onUnloadChunk(int n, int n2, CallbackInfo callbackInfo) {
        
    }

    public static void onHotbarScroll(double d, CallbackInfo callbackInfo) {
        
    }

    public static void addEatEffect(CallbackInfo callbackInfo) {
        
    }

    public static void onRenderHands(float f, MatrixStack matrixStack, VertexConsumerProvider.Immediate immediate, ClientPlayerEntity clientPlayerEntity, int n, CallbackInfo callbackInfo, int n2) {
        
    }

    public static void isNoGravity(Entity callbackInfoReturnable, CallbackInfoReturnable<Boolean> callbackInfoReturnable2) {
        
    }
    public static void onKeyPress(long l, int n, int n2, int n3, int n4, CallbackInfo callbackInfo, int n5) {
        
    }

    public static void onScreenshot(NativeImage objectParam, CallbackInfo callbackInfo) {
        
    }

    public static void isHorseSaddled(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    public static boolean m4461(Screen screen) {
        return false;
    }

    public static void resizeDisplay() {
        
    }

    public static void addParticle(Particle objectParam, CallbackInfo callbackInfo) {
        
    }

    public static void setupEnchantTexture(int n) {
        
    }

    public static void onEntityStep(Entity entity, double d, int n) {
        
    }

    public static void getLiquidBlockShape(BlockState callbackInfoReturnable, BlockView blockView, BlockPos blockPos, ShapeContext shapeContext, CallbackInfoReturnable<VoxelShape> callbackInfoReturnable2) {
        
    }

    public static void onDamageBlock(BlockPos objectParam, Direction direction, CallbackInfoReturnable<Boolean> callbackInfoReturnable, int n) {
        
    }

    public static void getPlayerSkin(CallbackInfoReturnable<SkinTextures> objectParam, AbstractClientPlayerEntity abstractClientPlayerEntity2, PlayerListEntry playerListEntry) {
        
    }

    public static void onContainerClose(CallbackInfoReturnable<Boolean> obf158) {
        
    }

    public static void onScreenInit(Screen objectParam, List<Drawable> screen, int n, boolean bl) {
        
    }

    public static void onPlaceBlock(ItemPlacementContext objectParam, BlockState blockState, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    public static void onRegisterPacket(NetworkSide networkSide, PacketType packetType) {
        
    }

    public static void initOptions(GameOptions gameOptions) {
        
    }

    public static void onRenderBlock(BlockState blockState, CallbackInfo callbackInfo) {
        
    }

    public static void getLevelEffects(CallbackInfoReturnable<DimensionEffects> registryKey) {
        
    }

    public static /* synthetic */ void lambda$modifyOutputStateShard$5(String string) {
        long l = f1867 ^ 0x49A9CD5FD20AL;
        MixinHelper.\u0157((String)string);
    }

    public static void getMaxInventoryArmorSlotStackSize(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        
    }

    public static boolean shouldTridentBoost() {
        return false;
    }

    public static void getJumpYaw(Entity entity, int n) {
        
    }

    public static long modifyPlayerListLimit(long l) {
        return l;
    }

    public static float[] getFogColor(float f, float f2, float f3) {
        Class404 event = new Class404(f, f2, f3);
        Class170.f3362.post(event);
        return new float[] { event.f6826, event.f6827, event.f6828 };
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void postChatEdited(TextFieldWidget textFieldWidget) {
        
    }

    public static void canOccludeBlock(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    public static void isKeyMappingDown(CallbackInfoReturnable<Boolean> objectParam, KeyBinding keyBinding2) {
        
    }

    public static void onElytraTravel(LivingEntity objectParam, Vec3d vec3d, int n) {
        
    }

    public static boolean shouldCancelElytraSpin() {
        return false;
    }

    public static void onEntityRemove(Entity objectParam, Entity.RemovalReason removalReason, CallbackInfo callbackInfo, int n) {
        
    }

    public static void onUpdateLightmapTexture(Vector3f vector3f, int n, int n2) {
        
    }

    public static void isPlayerPushedByFluid(PlayerEntity objectParam, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    public static void onRender2D(DrawContext drawContext, float f, int n) {
        
    }

    public static boolean shouldInstantTrident() {
        return false;
    }

    public static void onMousePress(long l, int n, int n2, int n3, CallbackInfo callbackInfo, int n4) {
        
    }

    public static void onInteract(PlayerEntity playerEntity, Entity entity, EntityHitResult entityHitResult, Hand hand, CallbackInfoReturnable<ActionResult> callbackInfoReturnable, int n) {
        
    }

    public static void canSpawnSprintParticle(CallbackInfoReturnable<Boolean> obf519) {
        
    }

    public static void multiTaskHook(int n, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        
    }

    public static boolean isSpectator(boolean bl) {
        return bl;
    }

    public static void onMouseMove(long l, double d, double d2, CallbackInfo callbackInfo) {
        
    }

    public static EntityRenderer<?> onRenderEntity(Entity entity, double d, double d2, double d3, float f, float f2, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int n, CallbackInfo callbackInfo, int n2) {
        return null;
    }

    public static Identifier getGlintTexture(Identifier identifier) {
        return identifier;
    }

    public static void getSkyColor(CallbackInfoReturnable<Vec3d> callbackInfoReturnable) {
        
    }

    /*
     * Unable to fully structure code
     */
    static {
    }

    public static void onClearChatMessages(CallbackInfo callbackInfo, boolean bl) {
        
    }

    public static void onTurn(Entity entity, double d, double d2, CallbackInfo callbackInfo) {
        
    }

    public static void onSocialManagerRemovePlayer(UUID objectParam, String object2) {
        
    }

    public static void getCameraFov(Camera callbackInfoReturnable, float f, boolean bl, CallbackInfoReturnable<Double> callbackInfoReturnable2) {
        
    }

    public static void getSunriseColor(CallbackInfoReturnable<float[]> callbackInfoReturnable) {
        
    }

    public static void getWeatherLevel(CallbackInfoReturnable<Float> callbackInfoReturnable, int n) {
        
    }

    public static void sendChatMessage(String objectParam, CallbackInfo callbackInfo, ClientPlayNetworkHandler clientPlayNetworkHandler) {
        
    }

    public static Color getCurrentModelColor() {
        return null;
    }

    public static void onDestroyBlock(BlockPos objectParam, CallbackInfoReturnable<Boolean> obf3342) {
        
    }

    public static void onStopDestroyBlock(CallbackInfo callbackInfo) {
        
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void sendPacket(Packet<?> object, CallbackInfo callbackInfo, boolean bl) {
        
    }
    public static void onCameraSetup(Camera objectParam, Entity entity, int n) {
        
    }

    public static Vec3d onPlayerMove(ClientPlayerEntity objectParam, Vec3d vec3d, int n, CallbackInfo callbackInfo) {
        if (!objectParam.equals(Globals.mc.player)) {
            return vec3d;
        }
        if (vec3d == null) {
            return Vec3d.ZERO;
        }
        EventMove event = new EventMove(vec3d);
        Class170.f3362.post(event, Stage.getStage(n));
        return event.isCancelled() ? Vec3d.ZERO : event.getMotion();
    }

    public static void onEntityAdd(int n, Entity entity, CallbackInfo callbackInfo, int n2) {
        
    }

    public static void isPlayerControllingCamera(ClientPlayerEntity callbackInfoReturnable, CallbackInfoReturnable<Boolean> callbackInfoReturnable2) {
        
    }

    public static void modifyOutputStateShard(Args objectParam, String string, Runnable runnable, Runnable runnable2) {
        
    }

    public static void onRender3D(MatrixStack matrixStack, float f, int n) {
        
    }

    public static void getFramerateLimit(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        
    }

    public static int getTabListItemColor(GameOptions gameOptions, int n) {
        return n;
    }

    public static void onDisconnect(int n, CallbackInfo callbackInfo) {
        
    }

    public static void onTick(int n) {
        
    }

    public static void onApplyItemTransforms(MatrixStack objectParam, Arm arm, boolean bl, CallbackInfo callbackInfo) {
        
    }

    public static void getBlockSpeedFactor(Block objectParam, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        
    }

    public static Text onAddMessage(Text text) {
        return text;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void onReceivePacket(Packet<?> packet, CallbackInfo callbackInfo, boolean bl) {
        
    }

    public static void onRenderOverlay(CallbackInfo callbackInfo, int n) {
        
    }

    public static void onReleaseUseItem(CallbackInfo callbackInfo) {
        
    }

    public static float getMoveYaw(Entity objectParam, float f) {
        return f;
    }

    public static void getPigPassenger(PigEntity callbackInfoReturnable, CallbackInfoReturnable<LivingEntity> callbackInfoReturnable2) {
        
    }

    public static void onRenderChat(DrawContext drawContext, int n, int n2, int n3, int n4, CallbackInfo callbackInfo) {
        
    }

    public static void isElytraFlying(LivingEntity objectParam, CallbackInfoReturnable<Boolean> callbackInfoReturnable, int n) {
        
    }

    public static void getPigInput(PigEntity callbackInfoReturnable, CallbackInfoReturnable<Vec3d> callbackInfoReturnable2) {
        
    }

    public static void m4463(String[] stringArray) {
        
    }

    public static String[] m4464() {
        return null;
    }
    public static String m117(byte[] byArray) {
        return null;
    }

    public static String m153(int n, long l) {
        return null;
    }

    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        return null;
    }

    public static CallSite m120(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        return null;
    }

    public static int m2808(int n, long l) {
        return 0;
    }

    public static int m2809(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        return 0;
    }

    public static CallSite m132(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        return null;
    }

    public static int m193(long l, long l2) {
        return 0;
    }

    public static void m194() {
        
    }

    public static Class m195(long l, long l2) {
        return null;
    }

    public static Field m196(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m197(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m198(long l, long l2) {
        return null;
    }

    public static Method m199(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m200(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m201(long l, long l2) {
        return null;
    }

    public static MethodHandle m202(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        return null;
    }

    public static Object m203(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        return null;
    }

    public static CallSite m174(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        return null;
    }

   public static IllegalStateException a(Throwable var0) {
        return new IllegalStateException((Throwable)null);
    }

   public static void \u03c9(String s) {}

   public static void \u0157(String s) {}
}

