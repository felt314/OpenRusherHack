package org.rusherhack.client;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.setting.Setting;

public class Class021 {
   public String scope;
   public String code;
   public String client_id;
   public String grant_type;
   public String redirect_uri;
   public static long f1176 = Class066.m4320(-4491346829044537666L, 5521062597060031087L, MethodHandles.lookup().lookupClass()).m4325(187263379278528L);
   public static String[] f1177;
   public static String[] f1178;
   public static Object[] f1180 = new Object[25];
   public static String[] f1181 = new String[25];

   public Class021(String var1) {
      super();
      this.client_id = "29868cb5-1806-403e-b176-d3dcd76f3abb";
      this.code = var1;
      this.grant_type = "authorization_code";
      this.redirect_uri = "https://login.live.com/oauth20_desktop.srf";
      this.scope = "service::user.auth.xboxlive.com::MBI_SSL";
   }

   public Map<String, String> m2784() {
        return null;
    }

   static {
    }
   public static String m117(byte[] var0) {
        return null;
    }
   public static int m121(long var0, long var2) {
        return 0;
    }

   public static void m122() {
        
    }

   public static Class m123(long var0, long var2) {
        return null;
    }

   public static Field m124(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m125(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m126(long var0, long var2) {
        return null;
    }

   public static Method m127(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m128(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m129(long var0, long var2) {
        return null;
    }

   public static MethodHandle m130(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
        return null;
    }

   public static Object m131(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
        return null;
    }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
        return null;
    }
}
