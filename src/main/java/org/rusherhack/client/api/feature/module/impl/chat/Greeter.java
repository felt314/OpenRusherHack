// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.Obf440;
import org.rusherhack.Obf332;
import org.rusherhack.Obf198;

import org.rusherhack.core.logging.ILog;
import org.rusherhack.client.api.feature.module.Module;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.Setting;
import java.io.BufferedWriter;
import java.io.FileWriter;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import java.util.Random;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.utils.Timer;
import org.rusherhack.core.setting.NumberSetting;
import java.io.File;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.reset;
public class Greeter extends ToggleableModule
{
    public File f2034;
    public File f2035;
    public NumberSetting<Float> delay;
    public Timer f2037;
    public EnumSetting<Obf198> f2038;
    public BooleanSetting leaves;
    public EnumSetting<Obf440> filter;
    public BooleanSetting joins;
    public static long f2042;
    
    public String m4732(String replacement, File file) {
        return null;
    }
    
    public Greeter() {
    }
    
    public void m4734(String p0, File p1) {
        
    }
    
    @Subscribe
    void m4735(Obf332 obf332) {
        
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
