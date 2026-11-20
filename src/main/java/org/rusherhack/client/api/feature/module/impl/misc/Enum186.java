/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.GameMessageS2CPacket
 *  net.minecraft.network.packet.s2c.play.SubtitleS2CPacket
 *  net.minecraft.util.Formatting
 *  net.minecraft.world.World
 */
package org.rusherhack.client.api.feature.module.impl.misc;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.DiscordBuild;
import com.jagrosh.discordipc.entities.RichPresence;
import com.jagrosh.discordipc.entities.pipe.PipeStatus;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.SubtitleS2CPacket;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.rusherhack.Class142;
import org.rusherhack.Class152;
import org.rusherhack.Class170;
import org.rusherhack.Class236;
import org.rusherhack.Class253;
import org.rusherhack.Class304;
import org.rusherhack.Class357;
import org.rusherhack.Class367;
import org.rusherhack.Class425;
import org.rusherhack.Class432;
import org.rusherhack.Class441;
import org.rusherhack.Class510;
import org.rusherhack.Class567;
import org.rusherhack.Class568;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.connect;
import org.rusherhack.command.reset;
import org.rusherhack.command.send;
import org.rusherhack.command.toggle;
public class Enum186
extends ToggleableModule {
    public StringSetting f3591;
    public BooleanSetting globals;
    public StringSetting f3593;
    public StringSetting httpsRusherhackOrg;
    public EnumSetting mode;
    public long f3596;
    public Class236 f3597;
    public NullSetting basicCustomization;
    public Class236 f3599;
    public Class236 f3600;
    public List<Class236> f3601;
    public int f3602;
    public static IPCClient f3603;
    public int f3604;
    public BooleanSetting priority;
    public NullSetting mainMenu;
    public Class236 f3607;
    public Timer f3608;
    public Timer f3609;
    public StringSetting f3610;
    public Class236 f3611;
    public NullSetting advanced;
    public Class236 f3613;
    public StringSetting f3614;
    public StringSetting playingServerIp;
    public static RichPresence.Builder f3617;
    public BooleanSetting serverip;
    public StringSetting f3619;
    public NullSetting inGame;
    public int f3621;
    public StringSetting f3622;
    public Class236 f3623;
    public int f3624;
    public BooleanSetting queue;
    public NullSetting inQueue;
    public StringSetting f3627;
    public Class236 f3628;
    public NumberSetting<Long> f3629;
    public static long f3630;
    public static String[] f3631;
    public static String[] f3632;
    public static Map f3633;
    public static long[] f3634;
    public static Long[] f3635;
    public static Map f3636;
    public static Object[] f3637;
    public static String[] f3638;

    @Subscribe
    public void m7556(EventPacket$Receive eventPacket$Receive) {
        
    }

    public String m7557() {
        return null;
    }

    public String m7558() {
        return null;
    }

    /*
     * Unable to fully structure code
     */
    

    @Subscribe(stage=Stage.PRE)
    public void m7560(EventUpdate object) {
        
    }

    @Override
    public void onDisable() {
        
    }

    @Subscribe
    public void m7562(Class432 object) {
        
    }

    @Override
    public void onEnable() {
        
    }

    public void m7563() {
        
    }

    public Enum186() {
    }

    public String m7564(String string) {
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
    public static long m7570(int n, long l) {
        return 0L;
    }

    public static long m7571(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        return 0L;
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

