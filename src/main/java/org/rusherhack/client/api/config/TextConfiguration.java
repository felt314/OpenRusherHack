/*
 * Decompiled with CFR 0.152.
 */
package org.rusherhack.client.api.config;

import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.config.Configuration;
import org.rusherhack.core.serialize.ISerializable;
import org.rusherhack.core.serialize.Class063;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.IOUtils;

import org.rusherhack.command.config;
public class TextConfiguration
extends Configuration {
    public boolean f318;
    public static long f319;
    public static String[] f320;
    public static String[] f321;
    public static Map f322;
    public static Object[] f323;
    public static String[] f324;

    public TextConfiguration allowNewLines() {
        return null;
    }

    public static TextConfiguration createConfiguration(String string) {
        return null;
    }

    public static TextConfiguration createConfiguration(String string, String string2) {
        return null;
    }

    /*
     * Loose catch block
     */
    public void write(ISerializable<?> obf063) {
        
    }

    /*
     * Loose catch block
     */
    public void read(ISerializable<?> iSerializable) {
        
    }

    public TextConfiguration(File object) {
    }

    /*
     * Unable to fully structure code
     */
    static {
    }
    public static String m656(byte[] byArray) {
        return null;
    }

    public static String m657(int n, long l) {
        return null;
    }

    public static Object m658(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        return null;
    }
    public static int m193(long l, long l2) {
        return 0;
    }

    public static void m194() {
        
    }

    public static Class m195(long l, long l2) {
        return null;
    }

    public static Field m196(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m197(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m198(long l, long l2) {
        return null;
    }

    public static Method m199(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m200(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m201(long l, long l2) {
        return null;
    }

    public static MethodHandle m202(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        return null;
    }

    public static Object m203(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
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

   public static IllegalStateException a(Throwable var0) {
        return new IllegalStateException((Throwable)null);
    }
}

