/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.blaze3d.platform.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.SlabBlock
 *  net.minecraft.block.StairsBlock
 *  net.minecraft.block.entity.AbstractFurnaceBlockEntity
 *  net.minecraft.block.entity.BarrelBlockEntity
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.ChestBlockEntity
 *  net.minecraft.block.entity.DispenserBlockEntity
 *  net.minecraft.block.entity.EnderChestBlockEntity
 *  net.minecraft.block.entity.HopperBlockEntity
 *  net.minecraft.block.entity.ShulkerBoxBlockEntity
 *  net.minecraft.block.enums.BlockHalf
 *  net.minecraft.block.enums.SlabType
 *  net.minecraft.client.gl.Framebuffer
 *  net.minecraft.client.render.Frustum
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.entity.EntityRenderer
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.state.property.Property
 *  net.minecraft.util.crash.CrashException
 *  net.minecraft.util.crash.CrashReport
 *  net.minecraft.util.crash.CrashReportSection
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.shape.VoxelShapes
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.LightType
 *  net.minecraft.world.biome.BiomeKeys
 */
package org.rusherhack.client.api.feature.module.impl.render;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.DispenserBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.state.property.Property;
import net.minecraft.util.crash.CrashException;
import net.minecraft.util.crash.CrashReport;
import net.minecraft.util.crash.CrashReportSection;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.LightType;
import net.minecraft.world.biome.BiomeKeys;
import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
import org.rusherhack.Class079;
import org.rusherhack.Class094;
import org.rusherhack.Enum112;
import org.rusherhack.client.api.feature.module.impl.render.ESPHowTheInsideOfTheObjectShouldBeFilled;
import org.rusherhack.Class153;
import org.rusherhack.Class170;
import org.rusherhack.Enum216;
import org.rusherhack.Class220;
import org.rusherhack.Class228;
import org.rusherhack.Class253;
import org.rusherhack.Class282;
import org.rusherhack.Class294;
import org.rusherhack.Class352;
import org.rusherhack.Class360;
import org.rusherhack.Class476;
import org.rusherhack.Class480;
import org.rusherhack.Class580;
import org.rusherhack.client.api.feature.module.impl.render.ESPF5463;
import org.rusherhack.client.api.feature.module.impl.client.ShaderTest;
import org.rusherhack.Targets;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.events.render.EventRenderEntity;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.render.graphic.TextureGraphic;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.system.Colors$ColorMode;
import org.rusherhack.client.api.utils.EntityUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.MathUtils;
import org.rusherhack.core.utils.Timer;
import org.rusherhack.mixin.MixinHelper;
import org.rusherhack.outline;

import org.rusherhack.command.clear;
import org.rusherhack.command.peek;
import org.rusherhack.command.reset;
public class ESP
extends ToggleableModule {
    public NumberSetting<Float> thickness;
    public List<Class228> f5439;
    public Targets f5440;
    public BooleanSetting outline;
    public NullSetting targets;
    public TextureGraphic f5443;
    public BooleanSetting showLightLevelsThroughWalls;
    public BooleanSetting customfont;
    public Class360 f5446;
    public EnumSetting<ESPHowTheInsideOfTheObjectShouldBeFilled> howTheInsideOfTheObjectShouldBeFilled;
    public static outline f5448;
    public BooleanSetting dispensers;
    public EnumSetting<Colors$ColorMode> f5450;
    public Class476 f5451;
    public NullSetting imageSettings;
    public BooleanSetting fillTheInsideOfTheObject;
    public BooleanSetting outlineTheObject;
    public BooleanSetting others;
    public NumberSetting<Integer> f5456;
    public NumberSetting<Float> scale;
    public BooleanSetting hoppers;
    public BooleanSetting showsWhatBlocksMobsCanSpawnOn;
    public BooleanSetting itemnames;
    public BooleanSetting shulkerboxes;
    public BooleanSetting enderchests;
    public EnumSetting<ESPF5463> f5463;
    public Class153 f5464;
    public BooleanSetting entities;
    public NumberSetting<Integer> f5466;
    public ColorSetting color;
    public BooleanSetting f5468;
    public BooleanSetting fadeTheOutline;
    public static ESP f5470;
    public Object2BooleanMap<Vec3d> f5471;
    public EnumSetting<Colors$ColorMode> colormode;
    public BooleanSetting tunnels;
    public NumberSetting<Float> f5474;
    public NullSetting csgoSettings;
    public NullSetting shaderSettings;
    public Timer f5477;
    public BooleanSetting furnaces;
    public EnumSetting<ESPF5463> mode;
    public NumberSetting<Integer> f5480;
    public NumberSetting<Float> width;
    public NumberSetting<Integer> f5482;
    public BooleanSetting itemframes;
    public NullSetting boxSettings;
    public BooleanSetting barrels;
    public NumberSetting<Double> range;
    public List<BlockPos> f5487;
    public BooleanSetting rainbowgradient;
    public BooleanSetting fill;
    public BooleanSetting chests;
    public boolean f5491;
    public BooleanSetting storages;
    public Class294 f5493;
    public static long f5494;
    public static String[] f5495;
    public static String[] f5496;
    public static Map f5497;
    public static long[] f5498;
    public static Integer[] f5499;
    public static Map f5500;
    public static Object[] f5501;
    public static String[] f5502;

    @Subscribe(stage=Stage.POST)
    public void m11128(EventRender2D object) {
        
    }

    @Override
    public String getMetadata() {
        return null;
    }

    public void m11130(Entity object, double d, double d2, double d3, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider) {
        
    }

    @Subscribe
    public void m11131(EventRender2D object) {
        
    }

    /*
     * Unable to fully structure code
     */
    

    public boolean m11134(BlockEntity object) {
        return false;
    }

    public ESP() {
    }

    @Subscribe
    public void m11135(EventUpdate object) {
        
    }

    public boolean m11136(Entity object) {
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Subscribe
    public void m11137(EventRender3D var1_3) {
        
    }

    public static /* synthetic */ int m11139(Class228 obf228, Class228 obf2282) {
        long l = f5494 ^ 0x146694D6C637L;
        Class228 obf2283 = obf228;
        net.minecraft.util.math.Vec3d obf228Pos = obf2283.m5078();
        return Double.compare(obf2282.m5078().distanceTo(Globals.mc.getCameraEntity().getPos()), obf228Pos.distanceTo(Globals.mc.getCameraEntity().getPos()));
    }

    public float[] m11140(Box object, int n, int n2) {
        return null;
    }

    public static IllegalStateException m1393(Throwable throwable) {
        return new IllegalStateException((Throwable)null);
    }

    public static String m221(byte[] byArray) {
        return null;
    }

    public static String m172(int n, long l) {
        return null;
    }

    public static Object m173(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        return null;
    }
    public static int m175(int n, long l) {
        return 0;
    }

    public static int m176(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        return 0;
    }

    public static CallSite m177(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        return null;
    }

    public static int m178(long l, long l2) {
        return 0;
    }
    public static Class m180(long l, long l2) {
        return null;
    }

    public static Field m181(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m182(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m183(long l, long l2) {
        return null;
    }

    public static Method m184(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m185(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m186(long l, long l2) {
        return null;
    }

    public static MethodHandle m187(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        return null;
    }

    public static Object m188(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        return null;
    }

    public static CallSite m265(MethodHandles.Lookup lookup, String string, MethodType methodType) {
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
}

