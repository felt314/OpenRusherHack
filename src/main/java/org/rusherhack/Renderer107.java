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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.ui.panel.IPanelItem;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.client.api.ui.panel.PanelItemBase;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.utils.ColorUtils;

public abstract class Renderer107 extends PanelItemBase<Renderer107> {
   public boolean f2389;
   public static int f2390;
   public Animation f2391;
   public double f2392;
   public double f2393;
   public static Color f2394;
   public static boolean f2395;
   public static long f2396 = Class066.m4320(1667262197760645763L, -6100715358121966776L, MethodHandles.lookup().lookupClass()).m4325(54122795001508L);
   public static String f2397;
   public static long[] f2398;
   public static Integer[] f2399;
   public static Map f2400;
   public static long f2401;
   public static Object[] f2402 = new Object[99];
   public static String[] f2403 = new String[99];

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
        
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   public void m5376(RenderContext var1, double var2, double var4) {
        
    }

   public void m5377(double var1, double var3) {
        
    }

   @Override
   public double getHeight(boolean var1) {
        return 0.0;
    }

   @Override
   public double getWidth() {
        return 0.0;
    }

   public boolean m5378(double var1, double var3) {
        return false;
    }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   public boolean m5379() {
        return false;
    }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   public List<Renderer107> m5380() {
        return null;
    }

   public double m5381() {
        return 0.0;
    }

   public void m5382(List<Setting<?>> var1) {
        
    }

   @Override
   public boolean isHovered(double var1, double var3, boolean var5) {
        return false;
    }

   public void m5383(boolean var1) {
        
    }

   public Renderer107(PanelBase<?> var1, Renderer107 var2) {
      super(var1, var2);
      this.f2391 = new Animation(Easing.BEZIER_CURVE, f2401);
      this.f2389 = false;
   }

   public double m5385() {
        return 0.0;
    }

   static {
   }

   public static void m5386(boolean var0) {
        
    }

   public static boolean m5387() {
        return false;
    }

   public static boolean m2770() {
        return false;
    }
   public static String m117(byte[] var0) {
        return null;
    }
   public static int m156(long var0, long var2) {
        return 0;
    }

   public static void m786() {
        
    }

   public static Class m158(long var0, long var2) {
        return null;
    }

   public static Field m159(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m160(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m161(long var0, long var2) {
        return null;
    }

   public static Method m162(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m163(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m164(long var0, long var2) {
        return null;
    }

   public static MethodHandle m165(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
        return null;
    }

   public static Object m166(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
        return null;
    }

   public static CallSite m671(Lookup var0, String var1, MethodType var2) {
        return null;
    }

   Renderer107() { super(null, null); }
}
