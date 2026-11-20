// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.Obf533;
import org.rusherhack.Obf088;

import org.rusherhack.client.api.feature.module.Module;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.pitch;
import org.rusherhack.command.yaw;
public class AntiAim extends ToggleableModule
{
    public NumberSetting<Float> custompitch;
    public EnumSetting<Obf088> yaw;
    public EnumSetting<Obf533> pitch;
    public BooleanSetting s2b2t;
    public NumberSetting<Float> spinspeed;
    public NumberSetting<Float> customyaw;
    public float f3984;
    public float f3985;
    public static long f3986;
    public static long f3990;
    
    @Subscribe(priority = 50)
    public void m8244(EventUpdate p0) {
        
    }
    
    public AntiAim() {
    }
    
    
    
    public static MatchException m285(MatchException ex) {
        return null;
    }
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    public static Field m181(Class clazz, String anObject, Class clazz2) {
        return null;
    }
    
    public static Field m182(Class clazz, String s, Class clazz2) {
        return null;
    }
    
    public static Method m184(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static Method m185(Class clazz, String s, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static CallSite m177(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
}
