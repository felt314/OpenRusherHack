/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.rusherhack.Class148;
import org.rusherhack.Class153;
import org.rusherhack.Class294;
import org.rusherhack.Enum338;
import org.rusherhack.Enum338;
import org.rusherhack.client.api.accessors.client.IMixinMinecraft;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.command.arg.EnchantReference;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.system.Colors$ColorMode;
import org.rusherhack.core.command.argument.StringCapture;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.lines;

public class Module338
extends ToggleableModule {
    public static lines f5379;
    public NullSetting f5380;
    public BooleanSetting f5381;
    public BooleanSetting f5382;
    public BooleanSetting f5383;
    public BooleanSetting f5384;
    public BooleanSetting f5385;
    public EnumSetting<Enum338> f5386;
    public EnumSetting<Enum338> f5387;
    public NumberSetting<Integer> f5388;
    public NumberSetting<Float> f5389;
    public BooleanSetting f5390;
    public static Class153 f5391;
    public BooleanSetting f5392;
    public BooleanSetting f5393;
    public BooleanSetting f5394;
    public static Class294 f5395;
    public EnumSetting<Colors$ColorMode> f5396;
    public static Module338 f5397;
    public BooleanSetting f5398;
    public static long f5399;
    public static String[] f5400;
    public static String[] f5401;
    public static Map f5402;
    public static long[] f5403;
    public static Integer[] f5404;
    public static Map f5405;
    public static Object[] f5406;
    public static String[] f5407;

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Module338() {
    }

    /*
     * Unable to fully structure code
     */
    

    public void m11017(BiConsumer<Entity, Integer> biConsumer) {
        
    }

    public /* synthetic */ void m11018(float f, IRenderer3D iRenderer3D, Vec3d vec3d, Entity entity, Integer n) {
        block0: {
            long l = f5399 ^ 0x60C3DC17E794L;
            float f2 = f;
            Module338 obf338 = this;
            CallSite callSite = ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00d1", MethodType.methodType(Object.class, Object.class, float.class, long.class, long.class)), (Object)entity, (float)f2, (long)-3565784048375770387L, (long)l);
            ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(void.class, Object.class, Object.class, Object.class, int.class, long.class, long.class)), (Object)iRenderer3D, (Object)vec3d, (Object)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(Object.class, Object.class, double.class, double.class, double.class, long.class, long.class)), (Object)callSite, (double)0.0, (double)((double)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(float.class, Object.class, Object.class, long.class, long.class)), (Object)obf338, (Object)entity, (long)-3564132742797324227L, (long)l)), (double)0.0, (long)-3562846425230070216L, (long)l), (int)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(int.class, Object.class, long.class, long.class)), (Object)n, (long)-3550637573519548969L, (long)l), (long)-3560713602056046528L, (long)l);
            if (false) break block0;
            CallSite callSite2 = callSite;
            ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(void.class, Object.class, Object.class, Object.class, int.class, long.class, long.class)), (Object)iRenderer3D, (Object)callSite2, (Object)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(Object.class, Object.class, double.class, double.class, double.class, long.class, long.class)), (Object)callSite2, (double)0.0, (double)((double)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(float.class, Object.class, long.class, long.class)), (Object)entity, (long)-3559246134289863433L, (long)l)), (double)0.0, (long)-3562846425230070216L, (long)l), (int)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(int.class, Object.class, long.class, long.class)), (Object)n, (long)-3550637573519548969L, (long)l), (long)-3560713602056046528L, (long)l);
        }
    }

    public static Vec3d m11019(Vec3d object, Matrix4f object2, Matrix4f matrix4f, Vec3d vec3d) {
        return null;
    }

    public static Vec3d m11020() {
        return null;
    }

    public static void m11021(Vec3d object, Vec3d object2, int n, MatrixStack matrixStack) {
        
    }

    public boolean m11023(Entity object) {
        return false;
    }

    public /* synthetic */ void m11024(float f, Vec3d vec3d, MatrixStack matrixStack, Entity entity, Integer n) {
        block0: {
            long l = f5399 ^ 0x52F673908DBL;
            float f2 = f;
            Module338 obf338 = this;
            CallSite callSite = ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00d1", MethodType.methodType(Object.class, Object.class, float.class, long.class, long.class)), (Object)entity, (float)f2, (long)2435514601738091938L, (long)l);
            ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00d1", MethodType.methodType(void.class, Object.class, Object.class, int.class, Object.class, long.class, long.class)), (Object)vec3d, (Object)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(Object.class, Object.class, double.class, double.class, double.class, long.class, long.class)), (Object)callSite, (double)0.0, (double)((double)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(float.class, Object.class, Object.class, long.class, long.class)), (Object)obf338, (Object)entity, (long)2433858923994087282L, (long)l)), (double)0.0, (long)2432330694430212471L, (long)l), (int)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(int.class, Object.class, long.class, long.class)), (Object)n, (long)2447420648387555992L, (long)l), (Object)matrixStack, (long)2436381497742907843L, (long)l);
            if (false) break block0;
            CallSite callSite2 = callSite;
            ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00d1", MethodType.methodType(void.class, Object.class, Object.class, Object.class, int.class, Object.class, long.class, long.class)), (Object)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00f5", MethodType.methodType(Object.class, long.class, long.class)), (long)2438160674278874170L, (long)l), (Object)callSite2, (Object)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(Object.class, Object.class, double.class, double.class, double.class, long.class, long.class)), (Object)callSite2, (double)0.0, (double)((double)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(float.class, Object.class, long.class, long.class)), (Object)entity, (long)2437680582744245176L, (long)l)), (double)0.0, (long)2432330694430212471L, (long)l), (int)ZkmDispatch.invoke(Module338.m265(MethodHandles.lookup(), "\u00cf", MethodType.methodType(int.class, Object.class, long.class, long.class)), (Object)n, (long)2447420648387555992L, (long)l), (Object)matrixStack, (long)2445637288183696484L, (long)l);
        }
    }

    public float m11025(Entity object) {
        return 0.0f;
    }

    @Subscribe
    public void m11027(EventRender3D object) {
        
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

    public static CallSite m174(MethodHandles.Lookup lookup, String string, MethodType methodType) {
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

