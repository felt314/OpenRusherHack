package org.rusherhack.core.setting;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
public class StringSetting extends Setting<String> {
   public LinkedHashSet<String> f1711;
   public boolean f1712;
   public static Object[] f1714 = new Object[44];
   public static String[] f1715 = new String[44];

   public StringSetting onChange(Consumer<String> var1) {
        return null;
    }

   public StringSetting(String var1, String var2, String var3, String... var4) {
    }

   public StringSetting setVisibility(BooleanSupplier var1) {
        return null;
    }

   @Override
   public String getDisplayValue() {
        return null;
    }

   public StringSetting setNameVisible(boolean var1) {
        return null;
    }

   public StringSetting(String var1, String var2) {
    }

   @Override
   public JsonElement serializeValue() {
        return null;
    }

   public StringSetting(String var1, String var2, String var3) {
      super(var1, var2);
   }

   public boolean isNameVisible() {
        return false;
    }

   public String parseValue(String var1, boolean var2) {
        return null;
    }

   public StringSetting setChangeAction(Runnable var1) {
        return null;
    }

   public LinkedHashSet<String> getOptions() {
        return null;
    }

   public void addOptions(String... var1) {
        
    }

   public void setValue(String var1) {
        
    }

   @Override
   public boolean deserializeValue(JsonElement var1) {
        return false;
    }

   static {}
   public static void m122() {
        
    }
}
