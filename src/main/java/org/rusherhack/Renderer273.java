package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.EnumMap;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.Renderer026;
import org.rusherhack.client.Renderer054;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.clear;
import org.rusherhack.command.send;
import org.rusherhack.client.api.feature.module.impl.client.ClickGUI;
import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
public class Renderer273 extends PanelHandlerBase<Renderer202> {
   public Renderer026 f4725;
   public EnumMap<ModuleCategory, Renderer202> f4726;
   public Renderer202 f4727;
   public Enum297 f4728;
   public static long f4729 = Class066.m4320(-976117018411935936L, -2397543519534722732L, MethodHandles.lookup().lookupClass()).m4325(233819542753950L);
   public static long f4730;
   public static Object[] f4731 = new Object[140];
   public static String[] f4732 = new String[140];

   @Override
   public float getScale() {
        return 0.0f;
    }

   public void m9577() {
        
    }

   @Override
   public void setDefaultPositions() {
        
    }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public void initialize() {
        
    }

   public void m9579(IModule var1, Setting<?> var2) {
        
    }

   @Override
   public void renderElements(RenderContext var1, double var2, double var4) {
        
    }

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   public Renderer273(Enum297 var1) {
      super(false);
      this.f4726 = new EnumMap<>(ModuleCategory.class);
      this.f4727 = null;
      this.f4725 = null;
      this.f4728 = var1;
   }

   @Override
   public boolean consumeMouseClick(double var1, double var3, int var5) {
        return false;
    }

   public Renderer202 m9580(String var1) {
        return null;
    }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   @Override
   public void tick() {
        
    }

   public void m9581(Renderer026 var1) {
        
    }

   static {
   }
   public static int m1279(long var0, long var2) {
        return 0;
    }

   public static void m343() {
        
    }

   public static Class m1281(long var0, long var2) {
        return null;
    }

   public static Field m1282(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m1283(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m1284(long var0, long var2) {
        return null;
    }

   public static Method m1285(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m1286(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m1287(long var0, long var2) {
        return null;
    }

   public static MethodHandle m1288(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
        return null;
    }

   public static Object m1289(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
        return null;
    }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
        return null;
    }
}
