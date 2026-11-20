package org.rusherhack;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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
import org.rusherhack.client.api.feature.hud.IHudElement;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.client.api.utils.objects.Scrollbar;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.feature.IFeature;
import org.rusherhack.core.interfaces.IDraggable;
import org.rusherhack.core.utils.ColorUtils;

public class Renderer202 extends PanelBase<Renderer107> implements IDraggable {
   public double f3785;
   public static int f3786;
   public double f3787;
   public boolean f3788;
   public Scrollbar f3789;
   public Animation f3790;
   public boolean f3791;
   public static Color f3792;
   public static int f3793;
   public int f3794;
   public static long f3795 = Class066.m4320(2719000404226945435L, 2006912846021054752L, MethodHandles.lookup().lookupClass()).m4325(182105654016267L);
   public static String[] f3796;
   public static String[] f3797;
   public static long[] f3799;
   public static Long[] f3800;
   public static Map f3801;
   public static Object[] f3802 = new Object[125];
   public static String[] f3803 = new String[125];

   @Override
   public boolean isDragging() {
        return false;
    }

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   @Override
   public double getWidth() {
        return 0.0;
    }

   public Renderer202(PanelHandlerBase<Renderer202> var1, String var2) {
      super(var1, var2);
      this.f3790 = new Animation(Easing.BEZIER_CURVE, 300L).play();
      this.f3788 = true;
      this.f3791 = false;
      this.f3785 = 0.0;
      this.f3787 = 0.0;
      this.f3794 = 0;
      this.f3789 = new Scrollbar(new Animation(Easing.LINEAR, 300L).play());
   }

   @Override
   public void mouseMoved(double var1, double var3) {
        
    }

   public boolean m7874(double var1, double var3) {
        return false;
    }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
        
    }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   public double m7875() {
        return 0.0;
    }

   public List<Renderer107> m7876() {
        return null;
    }

   @Override
   public boolean isHovered(double var1, double var3) {
        return false;
    }

   public Scrollbar m7877() {
        return null;
    }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
        return false;
    }

   public Renderer107 m7879(IFeature var1) {
        return null;
    }

   @Override
   public JsonElement serialize() {
        return null;
    }

   static {
    }

   public boolean m7880() {
        return false;
    }

   @Override
   public boolean deserialize(JsonElement var1) {
        return false;
    }

   public void m7881(boolean var1) {
        
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public double getHeight() {
        return 0.0;
    }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }
   public static String m656(byte[] var0) {
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

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
        return null;
    }

   Renderer202() { super(null, null); }
}
