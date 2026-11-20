package org.rusherhack;

import com.google.gson.JsonArray;
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
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.config.JsonConfiguration;
import org.rusherhack.client.api.feature.window.PopupWindow;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.system.IWindowManager;
import org.rusherhack.client.api.ui.window.WindowHandlerBase;
import org.rusherhack.core.serialize.Class062;

import org.rusherhack.command.config;
public class Renderer434 implements IWindowManager, Class062 {
   public Set<Window> f7183;
   public JsonConfiguration f7184;
   public static long f7185 = Class066.m4320(-4497539192800982652L, 2278020937920243274L, MethodHandles.lookup().lookupClass()).m4325(57376876226598L);
   public static String[] f7186;
   public static String[] f7187;
   public static Object[] f7189 = new Object[76];
   public static String[] f7190 = new String[76];

   @Override
   public void closePopup(PopupWindow var1) {
        
    }

   public Renderer434() {
      super();
      this.f7184 = JsonConfiguration.createConfiguration("windows", "layout");
      this.f7183 = Collections.synchronizedSet(new LinkedHashSet<>());
      this.m13891(new Console());
      this.m13891(new Alt_Manager());
      this.m13891(new Waypoints());
      this.m13891(new Relations());
      this.m13891(new Configs());
      Class170.f3364.m7112().m8473(this, this.f7184);
   }

   @Override
   public IFontRenderer getFontRenderer() {
        return null;
    }

   public boolean m13889(JsonElement var1) {
        return false;
    }

   @Override
   public IRenderer2D getRenderer() {
        return null;
    }

   @Override
   public void popupWindow(PopupWindow var1) {
        
    }

   @Override
   public void moveToTop(Window var1) {
        
    }

   @Override
   public WindowHandlerBase getWindowHandler() {
        return null;
    }

   @Override
   public List<Window> getVisibleWindows() {
        return null;
    }

   @Override
   public Iterable<Window> getFeatures() {
        return null;
    }

   @Override
   public Optional<Window> getFeature(String var1) {
        return null;
    }

   public JsonElement m13890() {
        return null;
    }

   public void m13891(Window var1) {
        
    }

   static {
    }
   public static String m117(byte[] var0) {
        return null;
    }
   public static int m193(long var0, long var2) {
        return 0;
    }

   public static void m194() {
        
    }

   public static Class m195(long var0, long var2) {
        return null;
    }

   public static Field m196(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m197(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m198(long var0, long var2) {
        return null;
    }

   public static Method m199(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m200(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m201(long var0, long var2) {
        return null;
    }

   public static MethodHandle m202(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
        return null;
    }

   public static Object m203(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
        return null;
    }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
        return null;
    }
}
