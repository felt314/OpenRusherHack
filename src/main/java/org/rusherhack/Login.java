package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.Class031;
import org.rusherhack.client.api.ui.window.content.ListItemContent;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.client.api.ui.window.view.ListView;
import org.rusherhack.client.api.ui.window.view.ListView$Column;

public class Login extends ListItemContent {
   public Class031 f8080;
   public static long f8081 = Class066.m4320(6259053776441736845L, -8146570378159852629L, MethodHandles.lookup().lookupClass()).m4325(94953630314105L);
   public static String[] f8082;
   public static String[] f8083;
   public static Object[] f8085 = new Object[43];
   public static String[] f8086 = new String[43];

   @Override
   public String getAsString(ListView$Column var1) {
        return null;
    }

   public Login(Class031 var1, ListView<Login> var2) {
      super(Alt_Manager.f4152, var2);
      this.f8080 = var1;
      ArrayList var6 = new ArrayList();
      var6.add(new ContextAction("Login", () -> {
         Class170.f3364.m7111().m2745(this.f8080);
      }));
      var6.add(new ContextAction("Delete", () -> {
         Class170.f3364.m7111().m2746(this.f8080);
      }));
      ContextAction var10001;
      String var10003;
      Login var10004;
      if (this.f8080.favorite) {
         var10003 = "Remove from favorites";
         var10004 = this;
      } else {
         var10003 = "Add to favorites";
         var10004 = this;
      }

      var10001 = new ContextAction(var10003, () -> {
         boolean var10001x;
         if (!this.f8080.favorite) {
            var10001x = true;
            boolean var10003x = true;
         } else {
            var10001x = false;
            boolean var3x = true;
         }

         this.f8080.favorite = var10001x;
         Alt_Manager.f4152.m8561();
      });
      var6.add(var10001);
      this.setContextMenu(var6);
   }

   @Override
   public void onDoubleClick() {
        
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
