// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.Obf559;
import org.rusherhack.Obf537;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.client.api.events.world.EventEntity;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import javax.crypto.SecretKey;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import org.rusherhack.client.api.events.world.EventEntity$Add;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.core.setting.Setting;
import java.util.Collections;
import java.util.WeakHashMap;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.core.command.argument.StringCapture;
import org.rusherhack.core.event.subscribe.Subscribe;
import net.minecraft.entity.Entity;
import net.minecraft.util.Formatting;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.Globals;
import net.minecraft.client.gui.screen.DeathScreen;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import java.util.Map;
import net.minecraft.entity.player.PlayerEntity;
import java.util.Set;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.send;
import org.rusherhack.client.api.feature.hud.impl.Direction;
public class PvpInfo extends ToggleableModule
{
    public BooleanSetting totempops;
    public BooleanSetting absorption;
    public BooleanSetting selfrunout;
    public BooleanSetting sound;
    public Set<PlayerEntity> f2016;
    public BooleanSetting pearls;
    public BooleanSetting visualrange;
    public BooleanSetting strength;
    public BooleanSetting s32kDetect;
    public BooleanSetting potions;
    public BooleanSetting selfpops;
    public BooleanSetting strengthdetect;
    public boolean f2024;
    public static long f2025;
    public static String[] f2026;
    public static String[] f2027;
    public static Map f2028;
    public static long[] f2029;
    public static Integer[] f2030;
    public static Map f2031;
    public static Object[] f2032;
    public static String[] f2033;
    
    @Subscribe
    public void m4707(EventEntity$Remove eventEntity$Remove) {
        
    }
    
    public PvpInfo() {
    }
    
    @Subscribe
    public void m4708(EventUpdate p0) {
        
    }
    
    @Subscribe
    public void m4709(EventEntity$Add p0) {
        
    }
    
    @Subscribe
    void m4710(Obf559 p0) {
        
    }
    
    @Subscribe
    void m4711(Obf537 p0) {
        
    }
    
    static {}
    
    public static MatchException m285(MatchException ex) {
        return null;
    }
    
    public static String m221(byte[] array) {
        return null;
    }
    
    public static String m172(int n, long n2) {
        return null;
    }
    
    public static Object m173(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        return null;
    }
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    public static int m175(int n, long n2) {
        return 0;
    }
    
    public static int m176(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        return 0;
    }
    
    public static CallSite m177(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    public static int m178(long n, long n2) {
        return 0;
    }
    
    public static void m179() {
        
    }
    
    public static Class m180(long n, long n2) {
        return null;
    }
    
    public static Field m181(Class clazz, String anObject, Class clazz2) {
        return null;
    }
    
    public static Field m182(Class clazz, String s, Class clazz2) {
        return null;
    }
    
    public static Field m183(long n, long n2) {
        return null;
    }
    
    public static Method m184(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static Method m185(Class clazz, String s, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static Method m186(long n, long n2) {
        return null;
    }
    
    public static MethodHandle m187(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType methodType, long n, long n2) {
        return null;
    }
    
    public static Object m188(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType newType, Object[] array) {
        return null;
    }
    
    public static CallSite m265(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_1
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
}
