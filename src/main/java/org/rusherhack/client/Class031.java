package org.rusherhack.client;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class421;
import org.rusherhack.client.api.feature.command.arg.BlockReference;
import org.rusherhack.core.serialize.Class062;
import org.rusherhack.core.setting.Setting;

public class Class031 implements Class062 {
   public static SimpleDateFormat DATE_FORMAT;
   public boolean favorite;
   public String alias;
   public String password;
   public String username;
   public Date lastUsed;
   public static long f1251 = Class066.m4320(7242453237630384655L, 6898155935210124159L, MethodHandles.lookup().lookupClass()).m4325(199044375696507L);
   public static String[] f1252;
   public static String[] f1253;
   public static Object[] f1255 = new Object[49];
   public static String[] f1256 = new String[49];

   public Class031(String var1, String var2, String var3, Date var4) {
    }

   public JsonElement m2969() {
        return null;
    }

   static {}

   public Class031(String var1, String var2) {
    }

   public boolean m2970() {
        return false;
    }

   public boolean m2971(JsonElement var1) {
        return false;
    }

   public String m2972() {
        return null;
    }

   public Class031(JsonObject var1) {
      super();
      this.favorite = false;
      this.m2971(var1);
   }

   public static Exception m672(Exception var0) {
        return null;
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
