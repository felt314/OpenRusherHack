/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonObject
 *  net.minecraft.client.texture.NativeImage
 */
package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.ZkmDispatch;
import org.rusherhack.ZkmDispatch;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import net.minecraft.client.texture.NativeImage;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraScreenshotMode;
import org.rusherhack.Class252;
import org.rusherhack.Event320;
import org.rusherhack.Class568;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.arg.BlockReference;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.connect;
public class ExtraScreenshot
extends ToggleableModule {
    public BooleanSetting save;
    public EnumSetting<ExtraScreenshotMode> mode;
    public static long f6352;
    public static String[] f6353;
    public static String[] f6354;
    public static Map f6355;
    public static Object[] f6356;
    public static String[] f6357;

    public ExtraScreenshot() {
        super("ExtraScreenshot", "Upload your screenshots to the web automatically", ModuleCategory.MISC);
        long l = f6352 ^ 0x44C6118ED61DL;

        ExtraScreenshot extraScreenshot = this;
        this.mode = new EnumSetting<ExtraScreenshotMode>("Mode", ExtraScreenshotMode.f4207);
        ExtraScreenshot extraScreenshot2 = this;
        this.save = new BooleanSetting("Save", true);
        Setting[] settingArray = new Setting[2];
        settingArray[0] = this.mode;
        settingArray[1] = this.save;
        this.registerSettings(settingArray);
    }

    @Subscribe
    public void m12582(Event320 obf320) {
        
    }

    public static Transferable m12583(BufferedImage bufferedImage) {
        return null;
    }

    /*
     * Loose catch block
     */
    public /* synthetic */ void m12584(NativeImage nativeImage) {
        
    }

    /*
     * Unable to fully structure code
     */
    

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

    public static CallSite m174(MethodHandles.Lookup lookup, String string, MethodType methodType) {
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

    public static CallSite m177(MethodHandles.Lookup lookup, String string, MethodType methodType) {
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

   public static String m174(String s, int i, long l) { return s; }
}

