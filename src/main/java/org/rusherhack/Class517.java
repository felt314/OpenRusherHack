package org.rusherhack;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.core.setting.Setting;

public class Class517<T extends Setting<?>> extends Renderer271 {
   public T f8251;
   public boolean f8252;
   public long f8253;
   public int f8254;
   public double f8255;
   public static long f8256 = Class066.m4320(2239238790240083593L, -5363817420938637359L, MethodHandles.lookup().lookupClass()).m4325(202938920070143L);
   public static long[] f8257;
   public static Long[] f8258;
   public static Object[] f8260 = new Object[46];
   public static String[] f8261 = new String[46];

   public String m4902() {
        return null;
    }

   @Override
   public boolean m4901() {
        return false;
    }

   @Override
   public void m6448(double var1, double var3) {
        
    }

   public T m15912() {
        return null;
    }

   public Class517(PanelBase<?> var1, Renderer107 var2, T var3) {
      super(var1, var2);
      this.f8254 = 0;
      this.f8255 = 0.0;
      this.f8253 = System.currentTimeMillis();
      this.f8251 = (T)var3;
      this.m5382(var3.getSubSettings());
   }

   @Override
   public String m4900() {
        return null;
    }

   @Override
   public boolean isVisible() {
        return false;
    }

   static {
    }
   public static int m178(long var0, long var2) {
        return 0;
    }

   public static void m1731() {
        
    }

   public static Class m180(long var0, long var2) {
        return null;
    }

   public static Field m181(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m182(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m183(long var0, long var2) {
        return null;
    }

   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m186(long var0, long var2) {
        return null;
    }

   public static MethodHandle m187(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
        return null;
    }

   public static Object m188(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
        return null;
    }

   public static CallSite m189(Lookup var0, String var1, MethodType var2) {
        return null;
    }

   Class517() { super(null, null); }
}
