// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.Obf409;

import org.rusherhack.core.feature.IFeatureConfigurable;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.event.subscribe.Subscribe;
import java.util.OptionalDouble;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.MinecraftClient;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.core.utils.MathUtils;
import java.util.Map;
import org.rusherhack.core.setting.EnumSetting;
import java.util.LinkedList;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.client.api.feature.hud.TextHudElement;

public class Speed extends TextHudElement
{
    public double f4438;
    public BooleanSetting average;
    public NumberSetting<Double> time;
    public LinkedList<Double> f4441;
    public EnumSetting<Obf409> measurement;
    public static long f4443;
    public static String[] f4444;
    public static String[] f4445;
    public static Map f4446;
    public static Object[] f4447;
    public static String[] f4448;
    
    public String getText() {
        return null;
    }
    
    public double m9057() {
        return 0.0;
    }
    
    @Subscribe
    public void m9058(EventPlayerUpdate eventPlayerUpdate) {
        
    }
    
    public Speed() {
    }
    
    static {
    }
    
    public static MatchException m285(MatchException ex) {
        return null;
    }
    
    public static String m221(byte[] array) {
        return null;
    }
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    public static void m273() {
        
    }
    
    public static Field m275(Class clazz, String anObject, Class clazz2) {
        return null;
    }
    
    public static Field m276(Class clazz, String s, Class clazz2) {
        return null;
    }
    
    public static Method m278(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static Method m279(Class clazz, String s, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static CallSite m265(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
}
