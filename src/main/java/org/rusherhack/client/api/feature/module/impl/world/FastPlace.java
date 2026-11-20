// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.Obf347;
import org.rusherhack.Class200;

import org.rusherhack.client.api.feature.module.Module;
import net.minecraft.entity.LivingEntity;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.config.Configuration;
import org.rusherhack.core.serialize.ISerializable;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import org.rusherhack.client.api.Globals;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.config;
public class FastPlace extends ToggleableModule
{
    public NumberSetting<Integer> tickDelayAfterPlacing;
    public static FastPlace f5871;
    public EnumSetting<Obf347> mode;
    public Class200 f5873;
    public Class200 f5874;
    public static long f5875;
    
    public boolean m11740() {
        return false;
    }
    
    public Block m11741(Item... p0) {
        return null;
    }
    
    public FastPlace() {
    }
    
    @Subscribe(stage = Stage.PRE)
    public void m11742(EventUpdate p0) {
        
    }
    
    public ModuleCommand createCommand() {
        return null;
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
