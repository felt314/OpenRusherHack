package com.jagrosh.discordipc.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.prefs.Preferences;
import net.lenni0451.reflect.Methods;

public class WinRegistry {
    public static int HKEY_CURRENT_USER = -2147483647;
    public static int HKEY_LOCAL_MACHINE = -2147483646;
    public static int REG_SUCCESS = 0;
    public static int KEY_ALL_ACCESS = 983103;
    public static int KEY_READ = 131097;
    public static Preferences userRoot = Preferences.userRoot();
    public static Preferences systemRoot = Preferences.systemRoot();
    public static Class<? extends Preferences> userClass = (Class<? extends Preferences>)userRoot.getClass();
    public static Method regOpenKey;
    public static Method regCloseKey;
    public static Method regQueryValueEx;
    public static Method regEnumValue;
    public static Method regQueryInfoKey;
    public static Method regEnumKeyEx;
    public static Method regCreateKeyEx;
    public static Method regSetValueEx;
    public static Method regDeleteKey;
    public static Method regDeleteValue;
    public static float javaSpec;

    public WinRegistry() {
    }

    public static String readString(int var0, String var1, String var2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return null;
    }

    public static String readString(long var0, String var2, String var3) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return null;
    }

    public static Map<String, String> readStringValues(int var0, String var1) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        if (var0 == -2147483646) {
            return readStringValues(systemRoot, var0, var1);
        } else if (var0 == -2147483647) {
            return readStringValues(userRoot, var0, var1);
        } else {
            throw new IllegalArgumentException("hkey=" + var0);
        }
    }

    public static List<String> readStringSubKeys(int var0, String var1) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return null;
    }

    public static void createKey(int var0, String var1) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        
    }

    public static void createKey(long var0, String var2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        
    }

    public static void writeStringValue(int var0, String var1, String var2, String var3) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        
    }

    public static void writeStringValue(long var0, String var2, String var3, String var4) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        
    }

    public static void deleteKey(int var0, String var1) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        
    }

    public static void deleteValue(int var0, String var1, String var2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        
    }

    public static int deleteValue(Preferences var0, int var1, String var2, String var3) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return 0;
    }

    public static int deleteKey(Preferences var0, int var1, String var2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return 0;
    }

    public static String readString(Preferences var0, int var1, String var2, String var3) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return null;
    }

    public static String readString(Preferences var0, long var1, String var3, String var4) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return null;
    }

    public static Map<String, String> readStringValues(Preferences var0, int var1, String var2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        HashMap var3 = new HashMap();
        int[] var4 = (int[])Methods.invoke(var0, regOpenKey, new Object[]{var1, toCstr(var2), 131097});
        if (var4[1] != 0) {
            return null;
        } else {
            int[] var5 = (int[])Methods.invoke(var0, regQueryInfoKey, new Object[]{var4[0]});
            int var6 = var5[0];
            int var7 = var5[3];

            for (int var8 = 0; var8 < var6; var8++) {
                byte[] var9 = (byte[])Methods.invoke(var0, regEnumValue, new Object[]{var4[0], var8, var7 + 1});
                String var10 = readString(var1, var2, new String(var9));
                var3.put(new String(var9).trim(), var10);
            }

            Methods.invoke(var0, regCloseKey, new Object[]{var4[0]});
            return var3;
        }
    }

    public static List<String> readStringSubKeys(Preferences var0, int var1, String var2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return null;
    }

    public static int[] createKey(Preferences var0, int var1, String var2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return null;
    }

    public static long[] createKey(Preferences var0, long var1, String var3) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return null;
    }

    public static void writeStringValue(Preferences var0, int var1, String var2, String var3, String var4) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        
    }

    public static void writeStringValue(Preferences var0, long var1, String var3, String var4, String var5) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        
    }

    public static byte[] toCstr(String var0) {
        return null;
    }

    static {
    }
}
