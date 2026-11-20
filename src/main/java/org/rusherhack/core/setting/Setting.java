package org.rusherhack.core.setting;
import org.rusherhack.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.core.feature.IFeature;
import org.rusherhack.core.interfaces.IHideable;
import org.rusherhack.core.serialize.Class062;

import org.rusherhack.command.reset;
public abstract class Setting<T> implements IFeature, IHideable, Class062 {
   public BooleanSupplier f1693;
   public String f1694;
   public Consumer<T> f1695;
   public Setting<?> f1696;
   public String f1697;
   public T f1698;
   public boolean f1699;
   public boolean f1700;
   public List<Setting<?>> f1701;
   public T f1702;
   public String f1703;
   public static String[] f1704;
   public static long f1705 = Class066.m4320(-993612953707053318L, -7557634286522825764L, MethodHandles.lookup().lookupClass()).m4325(94640430907812L);
   public static String[] f1706;
   public static String[] f1707;
   public static Object[] f1709 = new Object[81];
   public static String[] f1710 = new String[81];

   @Override
   public String getDisplayName() {
        return null;
    }

   @Override
   public String getDescription() {
        return null;
    }

   @Override
   public boolean reset() {
        return false;
    }

   public Setting(String var1, T var2) {
      this(var1, "", (T)var2);
   }

   public T getValue() {
        return null;
    }

   @Override
   public boolean isHidden() {
        return false;
    }

   public void addSubSettings(Setting<?>... var1) {
        
    }

   public Setting<T> setShouldSerialize(boolean var1) {
        return null;
    }

   @Override
   public String getName() {
        return null;
    }

   public boolean deserialize(JsonElement var1) {
        return false;
    }

   public Setting<T> onChange(Consumer<T> var1) {
        return null;
    }

   public String getFullName() {
        return null;
    }

   @Override
   public boolean shouldSerialize(boolean var1) {
        return false;
    }

   public abstract String getDisplayValue();

   public boolean isHiddenByDefault() {
        return false;
    }

   public List<Setting<?>> getAllSubSettings() {
      ArrayList var3 = new ArrayList(this.f1701);
      Iterator var6;
      Iterator var10000 = var6 = this.f1701.iterator();

      while (var10000.hasNext()) {
         Setting var5 = (Setting)var6.next();
         var10000 = var6;
         var3.addAll(var5.getAllSubSettings());
      }

      return var3;
   }

   public T getDefaultValue() {
        return null;
    }

   public JsonElement serialize() {
        return null;
    }

   public abstract JsonElement serializeValue();

   public Setting(String var1, String var2, T var3) {
    }

   public Setting<T> setHidden(boolean var1) {
        return null;
    }

   public List<Setting<?>> getSubSettings() {
      return this.f1701;
   }

   public Setting<?> getParent() {
      return this.f1696;
   }

   public Consumer<T> getConsumer() {
        return null;
    }

   public Setting<T> setVisibility(BooleanSupplier var1) {
        return null;
    }

   @Deprecated
   public Setting<T> setChangeAction(Runnable var1) {
        return null;
    }

   public void reset(boolean var1) {
        
    }

   public void setValueObj(Object var1) {
        
    }

   public Setting<?> getSubSetting(String var1) {
        return null;
    }

   public void setDefaultValue(T var1) {
        
    }

   public abstract boolean deserializeValue(JsonElement var1);

   public void setValue(T var1) {
        
    }

   public abstract T parseValue(String var1, boolean var2);

   public Setting<T> setDescription(String var1) {
        return null;
    }

   public static void m4135(String[] var0) {
        
    }

   public static String[] m4136() {
        return null;
    }

   static {
    }
   public static String m117(byte[] var0) {
        return null;
    }
   public static void m194() {
        
    }

   public Setting() {}
}
