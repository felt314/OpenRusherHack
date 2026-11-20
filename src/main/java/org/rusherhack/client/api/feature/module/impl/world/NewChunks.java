/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.Blocks
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket
 *  net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraft.world.chunk.ArrayPalette
 *  net.minecraft.world.chunk.ChunkSection
 *  net.minecraft.world.chunk.Palette
 *  net.minecraft.world.chunk.PalettedContainer
 *  net.minecraft.world.chunk.PalettedContainer.Data
 *  net.minecraft.world.chunk.WorldChunk
 */
package org.rusherhack.client.api.feature.module.impl.world;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.awt.Color;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ArrayPalette;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.Palette;
import net.minecraft.world.chunk.PalettedContainer;
import net.minecraft.world.chunk.WorldChunk;
import org.rusherhack.Class164;
import org.rusherhack.Class170;
import org.rusherhack.client.api.feature.module.impl.world.NewChunksYlevel;
import org.rusherhack.Class253;
import org.rusherhack.Class300;
import org.rusherhack.client.api.feature.module.impl.world.NewChunksMode;
import org.rusherhack.command.NewChunksCommand;
import org.rusherhack.Util494;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.world.IMixinPalettedContainer;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.render.EventRender;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.events.world.EventChunk$Load;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.client.api.utils.EntityUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.IOUtils;

import org.rusherhack.command.clear;
public class NewChunks
extends ToggleableModule {
    public BooleanSetting chat;
    public ColorSetting overworld;
    public BooleanSetting outline;
    public BooleanSetting alertsForNewChunks;
    public BooleanSetting sound;
    public ColorSetting nether;
    public static File f2813;
    public BooleanSetting log;
    public NullSetting colors;
    public EnumSetting<NewChunksYlevel> ylevel;
    public NumberSetting<Float> width;
    public ColorSetting end;
    public HashMap<RegistryKey<World>, HashSet<ChunkPos>> f2820;
    public BooleanSetting fill;
    public BooleanSetting inverse;
    public HashSet<ChunkPos> f2823;
    public BooleanSetting ignoresNewSectionsUnderYLevel0;
    public NullSetting renderSettings;
    public HashSet<ChunkPos> f2826;
    public NumberSetting<Integer> customylevel;
    public EnumSetting<NewChunksMode> mode;
    public IntSet f2829;
    public static SimpleDateFormat f2830;
    public static NewChunks f2831;
    public boolean f2832;
    public static long f2833;
    public static String[] f2834;
    public static String[] f2835;
    public static Map f2836;
    public static long[] f2837;
    public static Integer[] f2838;
    public static Map f2839;
    public static Object[] f2840;
    public static String[] f2841;

    @Subscribe
    public void m6158(EventRender3D object) {
    }

    @Override
    public ModuleCommand createCommand() {
        return null;
    }

    @Override
    public void onEnable() {
        
    }

    @Subscribe(stage=Stage.ON)
    public void m6159(EventChunk$Load eventChunk$Load) {
        
    }

    @Subscribe
    public void m6160(EventQuit object) {
        
    }

    public void m6161(BlockPos blockPos, BlockState object) {
        
    }

    /*
     * Unable to fully structure code
     */
    

    public static /* synthetic */ void m6162(AtomicBoolean atomicBoolean, Vec3i vec3i, BlockState object) {
        long l = f2833 ^ 0xAC4D01414D7L;
        atomicBoolean.set(true);
    }

    /*
     * Loose catch block
     */
    public void m6163(ChunkPos object) {
        
    }

    @Subscribe
    public void m6165(EventPacket$Receive eventPacket$Receive) {
        
    }

    public NewChunks() {
    }

    @Subscribe
    public void m6166(EventUpdate object2) {
        
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

