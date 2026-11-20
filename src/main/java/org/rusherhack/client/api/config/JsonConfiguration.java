/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 */
package org.rusherhack.client.api.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
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
import org.rusherhack.core.serialize.Class062;

import org.rusherhack.command.config;
public class JsonConfiguration
extends Configuration {
    public static Gson GSON;
    public static String[] f311;
    public static long f312;
    public static String[] f313;
    public static String[] f314;
    public static Map f315;
    public static Object[] f316;
    public static String[] f317;

    /*
     * Unable to fully structure code
     */
    static {
    }

    /*
     * Loose catch block
     */
    public void read(ISerializable<?> object) {
        
    }

    public JsonConfiguration(File object) {
    }

    public static JsonConfiguration createConfiguration(String string) {
        return null;
    }

    /*
     * Loose catch block
     */
    public void write(ISerializable<?> object) {
        
    }

    public static JsonConfiguration createConfiguration(String string, String string2) {
        return null;
    }

    public static void m653(String[] stringArray) {
        
    }

    public static String[] m654() {
        return null;
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
}

