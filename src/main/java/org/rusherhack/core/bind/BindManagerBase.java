package org.rusherhack.core.bind;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.bind;
public abstract class BindManagerBase {
   public Object2ObjectMap<IBindable, IKey> f1409 = new Object2ObjectArrayMap();
   public static String f1410;
   public static Object[] f1412 = new Object[41];
   public static String[] f1413 = new String[41];

   public void unregister(IBindable var1) {
        
    }

   public IKey getBind(IBindable var1) {
        return null;
    }

   public void setBind(IBindable var1, IKey var2) {
        
    }

   public Object2ObjectMap<IBindable, IKey> getBindRegistry() {
        return null;
    }

   public void setBind(String var1, IKey var2) {
        
    }

   public void register(IBindable var1, IKey var2) {
        
    }

   public static void m3367(String var0) {
        
    }

   public static String m3368() {
        return null;
    }

   static {
    }
   public static void m194() {
        
    }
}
