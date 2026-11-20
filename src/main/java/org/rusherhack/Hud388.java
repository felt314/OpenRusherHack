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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.Class022;
import org.rusherhack.client.Enum024;
import org.rusherhack.client.Class039;
import org.rusherhack.client.Util040;
import org.rusherhack.client.Class055;
import org.rusherhack.client.Class059;
import org.rusherhack.client.api.config.Configuration;
import org.rusherhack.client.api.config.JsonConfiguration;
import org.rusherhack.client.api.ui.hud.HudHandlerBase;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.client.api.ui.theme.ITheme;
import org.rusherhack.client.api.ui.theme.IThemeManager;
import org.rusherhack.client.api.ui.window.WindowHandlerBase;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.serialize.ISerializable;
import org.rusherhack.core.utils.StringUtils;

import org.rusherhack.command.clear;
import org.rusherhack.command.config;
public class Hud388 implements IThemeManager {
   public List<Util040> f6316;
   public ITheme f6317;
   public Class039 f6318;
   public Enum297 f6319;
   public ITheme f6320;
   public Class055 f6321;
   public Class059 f6322;
   public ITheme f6323;
   public Class022 f6324;
   public HashMap<ITheme, JsonConfiguration> f6325;
   public static long f6326 = Class066.m4320(-560693115073958189L, 8251250729313726617L, MethodHandles.lookup().lookupClass()).m4325(56631469505105L);
   public static String f6327;
   public static Object[] f6328 = new Object[72];
   public static String[] f6329 = new String[72];

   @Override
   public ITheme getWindowsTheme() {
        return null;
    }

   @Override
   public WindowHandlerBase getWindowHandler() {
        return null;
    }

   public Set<ITheme> m12500() {
        return null;
    }

   public Class022 m12501() {
        return null;
    }

   @Override
   public HudHandlerBase getHudHandler() {
        return null;
    }

   @Override
   public PanelHandlerBase<?> getClickGuiHandler() {
      return this.f6317.getClickGuiHandler();
   }

   @Override
   public ITheme getDefaultTheme() {
        return null;
    }

   @Subscribe(
      priority = 10
   )
   public void m12502(Class263 var1) {
        
    }

   public Class039 m12503() {
        return null;
    }

   @Override
   public void registerTheme(ITheme var1) {
        
    }

   @Override
   public ITheme getHudTheme() {
        return null;
    }

   public void m12504(ITheme var1) {
        
    }

   public Hud388() {
    }

   public void m12505(ITheme var1) {
        
    }

   public Class055 m12506() {
        return null;
    }

   public void m12507(ITheme var1) {
        
    }

   public Class059 m12508() {
        return null;
    }

   public List<Util040> m12509() {
        return null;
    }

   @Override
   public ITheme getClickGuiTheme() {
        return null;
    }

   static {
   }
   public static String m117(byte[] var0) {
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

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
        return null;
    }
}
