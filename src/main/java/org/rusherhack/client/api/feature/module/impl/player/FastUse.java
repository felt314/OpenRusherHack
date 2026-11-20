// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.Class139;

import net.minecraft.block.AbstractBlock.AbstractBlockState;
import net.minecraft.entity.LivingEntity;
import org.rusherhack.core.setting.Setting;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import org.rusherhack.core.bind.key.NullKey;
import net.minecraft.world.World;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import org.rusherhack.client.api.accessors.client.IMixinMinecraft;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.core.event.subscribe.Subscribe;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.item.ExperienceBottleItem;
import org.rusherhack.client.api.Globals;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.client.api.utils.InventoryUtils;
import net.minecraft.item.Items;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.core.utils.Timer;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.core.setting.NumberSetting;
import net.minecraft.block.Block;
import java.util.HashSet;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.FastUseCommand;
import org.rusherhack.command.bind;
import org.rusherhack.command.clear;
import org.rusherhack.command.config;
import org.rusherhack.command.pitch;
import org.rusherhack.command.reset;
public class FastUse extends ToggleableModule
{
    public int f8309;
    public Class139 f8310;
    public BooleanSetting pitch;
    public static HashSet<Block> f8312;
    public BooleanSetting exp;
    public BooleanSetting silentthrow;
    public NumberSetting<Integer> delay;
    public BindSetting throwSetting;
    public boolean f8317;
    public Timer f8318;
    public static long f8319;
    
    public FastUse() {
    }
    
    public ModuleCommand createCommand() {
        return null;
    }
    
    @Subscribe
    public void m15993(EventPlayerUpdate eventPlayerUpdate) {
        
    }
    
    @Subscribe
    public void m15994(EventUpdate eventUpdate) {
        
    }
    
    public boolean m15995() {
        return false;
    }
    
    
    
    public String getMetadata() {
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
    
    public static Method m184(Class clazz, String anObject, Class clazz2, int n3, Class[] array) {
        return null;
    }
    
    public static Method m185(Class clazz, String s, Class clazz2, int n3, Class[] array) {
        return null;
    }
    
    public static CallSite m177(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
}
