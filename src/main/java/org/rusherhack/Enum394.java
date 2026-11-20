// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public enum Enum394
{
    f6420("COMMENT", 5, 2, false), 
    f6421("CLASS", 0, 1), 
    f6422("FIELD", 1, 2), 
    f6423("LOCAL_VARIABLE", 4, 4), 
    f6424("METHOD", 2, 2),
    f6428("PARAMETER", 3, 2);
    
    public int f6425;
    public boolean f6427;
    
    public static long f6429;
    public static String[] f6430;
    public static String[] f6431;
    public static Map f6432;
    public static Object[] f6433;
    public static String[] f6434;
    
    public void m4304(Class091 p0, String[] p1, int p2, boolean p3) {}
    
    public boolean m12695(int n, int n2, int n3) {
        return false;
    }
    
    public boolean m4305(Enum394[] p0, int p1) { return false; }
    

    Enum394(String s, int a, int b) { this(b, true); }
    Enum394(String s, int a, int b, boolean c) { this(b, c); }
    Enum394(int f6425, boolean f6426) {
        this.f6425 = f6425;
        this.f6427 = f6426;
    }
    
    public static Enum394 m12697(int n, String str) {
        return null;
    }
    
    public Class140 m12698(String[] array, int n, boolean b) {
        return null;
    }
    
    static {
    }
    
    Enum394(int n2) {
        this(n2, true);
    }
    
    public static IllegalArgumentException m12699(IllegalArgumentException ex) {
        return null;
    }
    
    public static String m117(byte[] array) {
        return null;
    }
    
    public static CallSite m120(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    public static void m122() {
        
    }
    
    public static Field m124(Class clazz, String anObject, Class clazz2) {
        return null;
    }
    
    public static Field m125(Class clazz, String s, Class clazz2) {
        return null;
    }
    
    public static Method m127(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static Method m128(Class clazz, String s, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }

   Enum394() {}
}
