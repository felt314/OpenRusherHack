/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.minecraft.UserApiService
 *  net.minecraft.client.RunArgs
 *  net.minecraft.client.RunArgs.Network
 *  net.minecraft.client.network.SocialInteractionsManager
 *  net.minecraft.client.session.ProfileKeys
 *  net.minecraft.client.session.ProfileKeysImpl
 *  net.minecraft.client.session.Session
 *  net.minecraft.client.session.Session.AccountType
 *  net.minecraft.client.session.report.AbuseReportContext
 *  net.minecraft.client.session.report.ReporterEnvironment
 */
package org.rusherhack.client;
import org.rusherhack.ZkmDispatch;
import org.rusherhack.ZkmDispatch;

import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.UserApiService;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.RunArgs;
import net.minecraft.client.network.SocialInteractionsManager;
import net.minecraft.client.session.ProfileKeys;
import net.minecraft.client.session.ProfileKeysImpl;
import net.minecraft.client.session.Session;
import net.minecraft.client.session.report.AbuseReportContext;
import net.minecraft.client.session.report.ReporterEnvironment;
import org.rusherhack.Alt_Manager;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.client.Class031;
import org.rusherhack.client.Class052;
import org.rusherhack.client.Class058;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.client.IMixinMinecraft;
import org.rusherhack.core.setting.Setting;

public class Class019 {
    public Class052 altListConfiguration;
    public ExecutorService executor;
    public static Setting[] f1164;
    public static long f1165;
    public static String[] f1166;
    public static String[] f1167;
    public static Map f1168;
    public static Object[] f1169;
    public static String[] f1170;

    /*
     * Loose catch block
     */
    public /* synthetic */ void m2742(Class031 obf031) {
        
    }

    public Class019() {
    }

    public Session m2743(Class031 obf031) {
        return null;
    }

    public void m2744(Class031 object) {
        
    }

    public void m2745(Class031 object) {
        
    }

    public void m2746(Class031 object) {
        
    }

    public List<Class031> m2747() {
        return null;
    }

    public static void m2749(Setting[] settingArray) {
        
    }

    public static Setting[] m2750() {
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
    }

    public static IllegalStateException m1393(Throwable throwable) {
        return new IllegalStateException((Throwable)null);
    }

    public static String m117(byte[] byArray) {
        return null;
    }

    public static String m153(int n, long l) {
        return null;
    }

    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        return null;
    }
    public static int m121(long l, long l2) {
        return 0;
    }

    public static void m122() {
        
    }

    public static Class m123(long l, long l2) {
        return null;
    }

    public static Field m124(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m125(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m126(long l, long l2) {
        return null;
    }

    public static Method m127(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m128(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m129(long l, long l2) {
        return null;
    }

    public static MethodHandle m130(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        return null;
    }

    public static Object m131(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        return null;
    }

    public static CallSite m132(MethodHandles.Lookup lookup, String string, MethodType methodType) {
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
}

