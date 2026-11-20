package org.rusherhack;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.rusherhack.client.api.config.JsonConfiguration;
import org.rusherhack.core.serialize.Class062;

import org.rusherhack.command.clear;
import org.rusherhack.command.config;
public abstract class Class099<T extends Class062> extends JsonConfiguration implements Class062 {
   public List<T> f2351 = new ArrayList<>();
   public static int f2352;
   public static Object[] f2354 = new Object[28];
   public static String[] f2355 = new String[28];

   public void m5248(T var1) {
        
    }

   public T m401(JsonElement var1) { return null; }

   public boolean m5250(JsonElement var1) {
        return false;
    }

   public Class099(File var1) {
      super(var1);
   }

   public List<T> m5251() {
        return null;
    }

   public JsonElement m5252() {
        return null;
    }

   public static void m5253(int var0) {
        
    }

   public static int m5254() {
        return 0;
    }

   public static int m5255() {
        return 0;
    }

   static {
      m786();
      if (m5255() == 0) {
         m5253(101);
      }
   }
   public static void m786() {
        
    }

   public Class099() { super((java.io.File)null); }
}
