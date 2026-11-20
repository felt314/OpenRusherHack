package org.rusherhack.client;
import org.rusherhack.*;

import java.io.IOException;
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
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.client.api.accessors.gui.IMixinScreen;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;

import org.rusherhack.client.api.feature.module.impl.client.ClickGUI;
public class Class059 extends Util040 {
   public static boolean f1371;
   public static VectorGraphic f1372;
   public static long f1373 = Class066.m4320(-5478544586656920158L, 2838621867429861135L, MethodHandles.lookup().lookupClass()).m4325(165897696181765L);
   public static String[] f1374;
   public static String[] f1375;
   public static long[] f1377;
   public static Integer[] f1378;
   public static Map f1379;
   public static Object[] f1380 = new Object[54];
   public static String[] f1381 = new String[54];

   public Class059() {
        super(Text.of("ClickGui"));
      Class059 var3 = this;


      try {
         var3.m3052(
            f1372 = new VectorGraphic(
               "rusherhack/graphics/screens/clickgui.svg", 64, 64
            )
         );
      } catch (Exception var4) {
         boolean var10004 = true;
         Class170.f3346.error("Failed to load ClickGUI icon", var4);
      }
   }

   @Override
   public void render(DrawContext var1, int var2, int var3, float var4) {
        
    }

   public void mouseMoved(double var1, double var3) {
        
    }

   @Override
   public void tick() {
        
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public void close() {
        
    }

   public boolean keyPressed(int var1, int var2, int var3) {
        return false;
    }

   public boolean charTyped(char var1, int var2) {
        return false;
    }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
        return false;
    }

   @Override
   public boolean mouseReleased(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public void init() {
        
    }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
        return false;
    }

   static {
    }
   public static String m117(byte[] var0) {
        return null;
    }
   public static int m704(long var0, long var2) {
        return 0;
    }

   public static void m157() {
        
    }

   public static Class m706(long var0, long var2) {
        return null;
    }

   public static Field m707(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m708(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m709(long var0, long var2) {
        return null;
    }

   public static Method m710(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m711(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m712(long var0, long var2) {
        return null;
    }

   public static MethodHandle m713(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
        return null;
    }

   public static Object m714(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
        return null;
    }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
        return null;
    }
}
