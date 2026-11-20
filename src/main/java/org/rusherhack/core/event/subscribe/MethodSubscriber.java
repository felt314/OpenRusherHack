package org.rusherhack.core.event.subscribe;
import org.rusherhack.*;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import org.rusherhack.Class079;
import org.rusherhack.Class316;
import org.rusherhack.core.command.argument.StringCapture;
import org.rusherhack.core.event.type.Event;
import org.rusherhack.core.setting.Setting;

public class MethodSubscriber extends SubscriberBase {
   public Consumer<Object> f1587;
   @Override
   public void invoke(Event var1) {
        
    }

   public MethodSubscriber(Object var1, Subscribe var2, Method var3) {
    }
   public static Object[] m3872() {
      return new Object[0];
   }

   public static Object[] m3873(Object var0, Object var1, Object var2) {
      return new Object[]{var0, var1, var2};
   }

   public static Object[] m3874(Object var0, Object var1) {
      return new Object[]{var0, var1};
   }

   public static Object[] m3875(Object var0, Object var1, Object var2, Object var3, Object var4, Object var5) {
      return new Object[]{var0, var1, var2, var3, var4, var5};
   }

   public static Object[] m3840(Object var0) {
      return new Object[]{var0};
   }

   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }
}
