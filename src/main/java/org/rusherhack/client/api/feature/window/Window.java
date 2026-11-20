package org.rusherhack.client.api.feature.window;
import org.rusherhack.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.Class066;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.command.arg.EnchantReference;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.render.graphic.IGraphic;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.bind.IBindable;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.feature.IFeatureConfigurable;
import org.rusherhack.core.interfaces.IDraggable;
import org.rusherhack.core.interfaces.IHideable;
import org.rusherhack.core.interfaces.IScrollable;
import org.rusherhack.core.interfaces.ITickable;
import org.rusherhack.core.interfaces.ITypeable;
import org.rusherhack.core.serialize.Class062;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.bind;
import org.rusherhack.command.reset;
import org.rusherhack.command.send;
public abstract class Window
   extends ElementBase
   implements IFeatureConfigurable,
   Globals,
   IDraggable,
   IScrollable,
   ITypeable,
   ITickable,
   IHideable,
   IBindable,
   Class062 {
   public double f768;
   public String f769;
   public List<Setting<?>> f770;
   public boolean f771;
   @Nullable
   public IGraphic f772;
   public double f773;
   public double f774;
   public double f775;
   public boolean f776;
   public String f777;
   public double height;
   public double width;
   public double f778;
   public boolean f779;
   public double f780;
   public static int f781;
   public static long f782 = Class066.m4320(6730150843205134029L, -29203384235568824L, MethodHandles.lookup().lookupClass()).m4325(165937543697653L);
   public static String[] f783;
   public static String[] f784;
   public static Object[] f786 = new Object[120];
   public static String[] f787 = new String[120];

   public void setDragging(boolean var1, double var2, double var4) {
        
    }

   public void setDescription(String var1) {
        
    }

   @Override
   public void tick() {
        
    }

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public String getBindReference() {
        return null;
    }

   @Override
   public boolean isHovered(double var1, double var3) {
        return false;
    }

   public abstract WindowView getRootView();

   public JsonElement serialize() {
        return null;
    }

   @Override
   public String getDescription() {
        return null;
    }

   @Override
   public String getName() {
        return null;
    }

   public boolean isFocused() {
        return false;
    }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   @Override
   public boolean isHidden() {
        return false;
    }

   public boolean deserialize(JsonElement var1) {
        return false;
    }

   public void setIcon(IGraphic var1) {
        
    }

   @Override
   public double getHeight() {
        return 0.0;
    }

   public boolean renderIcon(double var1, double var3, double var5, double var7) {
        return false;
    }

   @Override
   public boolean reset() {
        return false;
    }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
        return false;
    }

   public void onClose() {
        
    }

   public IRenderer2D getRenderer() {
        return null;
    }

   @Override
   public boolean isDragging() {
        return false;
    }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
        
    }

   public void setHidden(boolean var1) {
        
    }

   @Override
   public double getWidth() {
        return 0.0;
    }

   public Window(String var1, double var2, double var4) {
      this(var1, 100.0, 100.0, var2, var4);
   }

   public Window(String var1, double var2, double var4, double var6, double var8) {
    }

   @Nullable
   public IGraphic getIcon() {
        return null;
    }

   public IFontRenderer getFontRenderer() {
        return null;
    }

   @Override
   public void mouseMoved(double var1, double var3) {
        
    }

   public void setFocused(boolean var1) {
        
    }

   @Override
   public void onKeybindEvent() {
        
    }

   @Override
   public List<Setting<?>> getSettings() {
        return null;
    }

   public static void m1742(int var0) {
        
    }

   public static int m1743() {
        return 0;
    }

   public static int m1744() {
        return 0;
    }

   static {
    }
   public static String m171(byte[] var0) {
        return null;
    }
   public static void m194() {
        
    }

   public Window() {}
}
