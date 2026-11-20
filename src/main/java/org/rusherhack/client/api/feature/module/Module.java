package org.rusherhack.client.api.feature.module;
import org.rusherhack.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.core.event.listener.EventListener;
import org.rusherhack.core.logging.ILoggable;
import org.rusherhack.core.logging.ILogger;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.send;
public abstract class Module implements IModule, EventListener, ILoggable, Globals {
   public ILogger logger;
   public boolean f712;
   public boolean f713;
   public ModuleCategory f714;
   public boolean f715;
   public List<Setting<?>> f716;
   public String f717;
   public String f718;
   public static String f719;
   public static long f720 = Class066.m4320(-6636781905055064383L, 4152102870729762408L, MethodHandles.lookup().lookupClass()).m4325(276213510030391L);
   public static String[] f721;
   public static String[] f722;
   public static Object[] f724 = new Object[74];
   public static String[] f725 = new String[74];

   public JsonElement serialize() {
        return null;
    }

   @Override
   public String getDescription() {
        return null;
    }

   @Override
   public void sendNotification(NotificationType var1, String var2) {
        
    }

   @Override
   public void sendNotification(NotificationType var1, String var2, int var3) {
        
    }

   @Override
   public ILogger getLogger() {
        return null;
    }

   public void setHidden(boolean var1) {
        
    }

   @Override
   public List<Setting<?>> getSettings() {
        return null;
    }

   public void setNotifications(boolean var1) {
        
    }

   public Module(String var1, String var2, ModuleCategory var3) {
    }

   public boolean deserialize(JsonElement var1) {
        return false;
    }

   public ModuleCommand createCommand() {
        return null;
    }

   @Override
   public String getName() {
        return null;
    }

   public Module(String var1, ModuleCategory var2) {
      this(var1, "", var2);
   }

   @Override
   public void registerSettings(Setting<?>... var1) {
        
    }

   public boolean areNotificationsEnabled() {
        return false;
    }

   @Override
   public boolean isHidden() {
        return false;
    }

   public void setListening(boolean var1) {
        
    }

   @Override
   public boolean isListening() {
        return false;
    }

   @Override
   public ModuleCategory getCategory() {
        return null;
    }

   public static void m1633(String var0) {
        
    }

   public static String m1634() {
        return null;
    }

   static {}
   public static String m171(byte[] var0) {
        return null;
    }
   public static void m194() {
        
    }

   public Module() {}
}
