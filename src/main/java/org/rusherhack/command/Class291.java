package org.rusherhack.command;
import org.rusherhack.*;

import java.awt.Font;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.config.TextConfiguration;
import org.rusherhack.client.api.feature.command.arg.BlockReference;
import org.rusherhack.client.api.feature.command.arg.EnchantReference;
import org.rusherhack.client.api.feature.command.arg.ItemReference;
import org.rusherhack.client.api.feature.command.arg.PlayerReference;
import org.rusherhack.client.api.feature.command.arg.SettingValue;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.bind.BindManagerBase;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.command.AbstractCommand;
import org.rusherhack.core.command.CommandManager;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.feature.IFeature;
import org.rusherhack.core.serialize.Class063;
import org.rusherhack.core.setting.Setting;

public class Class291 extends CommandManager implements Class063 {
   public TextConfiguration f4887;
   public Renderer605 f4888;
   public String f4889;
   public static Class378 f4890;
   public static long f4891 = Class066.m4320(-8939168549764821083L, -7984439204401531702L, MethodHandles.lookup().lookupClass()).m4325(115423106084586L);
   public static String[] f4892;
   public static String[] f4893;
   public static Object[] f4895 = new Object[69];
   public static String[] f4896 = new String[69];

   static {
    }

   public void m9927() {
        
    }

   @Subscribe(
      priority = -9999
   )
   public void m9928(Event157 var1) {
        
    }

   @Override
   public boolean shouldSerialize(boolean var1) {
        return false;
    }

   public boolean m9929(String var1) {
        return false;
    }

   public String m9930() {
        return null;
    }

   public Renderer605 m9931() {
        return null;
    }

   public Event157 m9932(String var1, boolean var2) {
        return null;
    }

   @Override
   public String getPrefix() {
        return null;
    }

   public Class291() {
    }

   public void m9933() {
        
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

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
        return null;
    }
}
