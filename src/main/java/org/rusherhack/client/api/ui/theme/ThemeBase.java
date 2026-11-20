package org.rusherhack.client.api.ui.theme;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.core.setting.Setting;

public abstract class ThemeBase implements ITheme {
   public ColorSetting f926;
   public String f927;
   public List<Setting<?>> f928;
   public String f929;
   public static int[] f930;
   public static long f931 = Class066.m4320(-3679110062271158598L, -2073939078920136435L, MethodHandles.lookup().lookupClass()).m4325(219881426266795L);
   public static String f932;
   public static long[] f933;
   public static Integer[] f934;
   public static Map f935;
   public static Object[] f936 = new Object[32];
   public static String[] f937 = new String[32];

   @Override
   public ColorSetting getColorSetting() {
        return null;
    }

   @Override
   public List<Setting<?>> getSettings() {
        return null;
    }

   @Override
   public String getDescription() {
        return null;
    }

   @Override
   public Color getPrimaryColor() {
        return null;
    }

   public ThemeBase(String var1, String var2, Color var3) {
    }

   @Override
   public String getName() {
        return null;
    }

   public static void m2169(int[] var0) {
        
    }

   public static int[] m2170() {
        return null;
    }

   static {
    }
   public static String m171(byte[] var0) {
        return null;
    }
   public static void m194() {
        
    }

   public ThemeBase() {}
}
