package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.client.IMixinKeyMapping;
import org.rusherhack.client.api.events.client.input.EventKeyboard;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Ping;
import org.rusherhack.client.api.feature.module.impl.client.Background;
public class ExtraTab extends ToggleableModule {
   public BooleanSetting colors;
   public static ExtraTab f5504;
   public BooleanSetting friends;
   public BooleanSetting toggle;
   public BooleanSetting self;
   public BooleanSetting onlyshow;
   public ColorSetting color;
   public EnumSetting<ExtraTabSorting> sorting;
   public ColorSetting background;
   public ColorSetting item;
   public static Comparator<PlayerListEntry> f5513;
   public BooleanSetting f5514;
   public NumberSetting<Integer> maxheight;
   public BooleanSetting enemies;
   public BooleanSetting f5517;
   public NumberSetting<Integer> players;
   public boolean f5519;
   public static Comparator<PlayerListEntry> f5520;
   public ColorSetting names;
   public EnumSetting<ExtraTabPing> ping;
   public static long f5523 = Class066.m4320(5592553609267670033L, 6029799856349669952L, MethodHandles.lookup().lookupClass()).m4325(167803267051327L);
   public static long[] f5527;
   public static Integer[] f5528;
   public static Map f5529;
   public static Object[] f5530 = new Object[135];
   public static String[] f5531 = new String[135];

   public ExtraTab() {
        super("ExtraTab", "Modifications to the tablist", ModuleCategory.MISC);
      long var1 = f5523 ^ 104689257078657L;

      this.sorting = new EnumSetting<>("Sorting", ExtraTabSorting.f8515);
      this.ping = new EnumSetting<>("Ping", ExtraTabPing.f6165);
      this.onlyshow = new BooleanSetting("OnlyShow", false);
      boolean var10022 = true;
      this.friends = new BooleanSetting("Friends", true);
      boolean var10021 = true;
      this.enemies = new BooleanSetting("Enemies", true);
      this.players = new NumberSetting<>("Players", m175(10607, 6712557137418921207L ^ var1), 0, m175(13271, 4585935694894415426L ^ var1));
      this.maxheight = new NumberSetting<>(
         "MaxHeight",
         "Change the maximum number of rows before creating a new column",
         m175(19263, 4850566206932829867L ^ var1),
         5,
         m175(5787, 6711730150522559242L ^ var1)
      );
      this.toggle = new BooleanSetting("Toggle", false);
      boolean var10017 = true;
      this.colors = new BooleanSetting("Colors", true);
      int var10016 = m175(3341, 5783833115827339423L ^ var1);
      boolean var10019 = true;
      this.background = new ColorSetting("Background", new Color(var10016, true));
      int var10015 = m175(14929, 5580565347011508167L ^ var1);
      boolean var10018 = true;
      this.item = new ColorSetting("Item", new Color(var10015, true));
      this.names = new ColorSetting("Names", new Color(-1));
      boolean var10013 = true;
      this.self = new BooleanSetting("Self", true);
      ColorSetting var10007 = (ColorSetting)null;
      boolean var10010 = true;
      this.color = var10007.setRainbow(true);
      boolean var10011 = true;
      this.f5517 = new BooleanSetting("Friends", true);
      var10010 = true;
      this.f5514 = new BooleanSetting("Enemies", true);
      this.f5519 = false;
      f5504 = this;
      boolean var10003 = true;
      this.self.addSubSettings(this.color);
      BooleanSetting var10000 = this.onlyshow;
      Setting[] var10001 = new Setting[]{this.friends, null};
      boolean var10005 = true;
      var10001[1] = this.enemies;
      var10000.addSubSettings(var10001);
      var10000 = this.colors;
      var10001 = new Setting[m175(7534, 1857580591972815101L ^ var1)];
      var10001[0] = this.background;
      var10005 = true;
      var10001[1] = this.item;
      var10001[2] = this.names;
      var10001[3] = this.self;
      var10001[4] = this.f5517;
      var10001[5] = this.f5514;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[m175(11783, 7879853267185017744L ^ var1)];
      var10001[0] = this.sorting;
      var10005 = true;
      var10001[1] = this.ping;
      var10001[2] = this.onlyshow;
      var10001[3] = this.players;
      var10001[4] = this.maxheight;
      var10001[5] = this.toggle;
      var10001[m175(25369, 9152063133525831305L ^ var1)] = this.colors;
      this.registerSettings(var10001);
   }

   @Override
   public void onEnable() {
      this.f5519 = false;
   }

   

   @Subscribe
   public void m11163(Class499 var1) {
      if (var1.m8984().equals(Globals.mc.options.playerListKey) && (Boolean)this.toggle.getValue() && this.f5519) {
         boolean var10003 = true;
         var1.m15527(true);
      }
   }

   @Subscribe
   public void onKeyboard(EventKeyboard var1) {
      if (!(Boolean)this.toggle.getValue()) {
         this.f5519 = false;
      }

      int var6 = var1.getAction();
      boolean var10003 = true;
      if (var6 == 1) {
         if (var1.getKey() == ((IMixinKeyMapping)Globals.mc.options.playerListKey).getKey().getCode()) {
            boolean var10001;
            if (!this.f5519) {
               var10001 = true;
               var10003 = true;
            } else {
               var10001 = false;
               var10003 = true;
            }

            this.f5519 = var10001;
         }
      }
   }

   public MutableText m11165(PlayerListEntry var1, MutableText var2) {
        return null;
    }

   public List<PlayerListEntry> m11166(List<PlayerListEntry> var1) {
        return null;
    }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8460;
      if (f5528[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f5527[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f5529.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f5529.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ʟ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f5528[var3] = var15;
      }

      return f5528[var3];
   }

   public static int m176(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m175(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ExtraTab.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʟ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5531[var4] != null) {
         return var4;
      } else {
         Object var5 = f5530[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 21;
               case 1 -> 29;
               case 2 -> 11;
               case 3 -> 54;
               case 4 -> 51;
               case 5 -> 18;
               case 6 -> 36;
               case 7 -> 26;
               case 8 -> 8;
               case 9 -> 32;
               case 10 -> 4;
               case 11 -> 46;
               case 12 -> 43;
               case 13 -> 2;
               case 14 -> 19;
               case 15 -> 28;
               case 16 -> 5;
               case 17 -> 16;
               case 18 -> 31;
               case 19 -> 55;
               case 20 -> 1;
               case 21 -> 40;
               case 22 -> 12;
               case 23 -> 3;
               case 24 -> 52;
               case 25 -> 17;
               case 26 -> 53;
               case 27 -> 7;
               case 28 -> 27;
               case 29 -> 22;
               case 30 -> 63;
               case 31 -> 10;
               case 32 -> 23;
               case 33 -> 50;
               case 34 -> 58;
               case 35 -> 9;
               case 36 -> 48;
               case 37 -> 14;
               case 38 -> 33;
               case 39 -> 60;
               case 40 -> 37;
               case 41 -> 62;
               case 42 -> 59;
               case 43 -> 41;
               case 44 -> 20;
               case 45 -> 34;
               case 46 -> 6;
               case 47 -> 38;
               case 48 -> 44;
               case 49 -> 35;
               case 50 -> 25;
               case 51 -> 0;
               case 52 -> 42;
               case 53 -> 47;
               case 54 -> 15;
               case 55 -> 56;
               case 56 -> 45;
               case 57 -> 39;
               case 58 -> 13;
               case 59 -> 30;
               case 60 -> 49;
               case 61 -> 24;
               case 62 -> 61;
               default -> 57;
            };
            int[] var7 = new int[6];

            for (int var8 = 0; var8 < 6; var8++) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for (int var14 = 0; var14 < var13.length; var14++) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            f5531[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f5530[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5531[var4]);
            f5530[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m181(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m182(Class var0, String var1, Class var2) {
      Field var3 = m181(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m182(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m183(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f5530[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5531[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f5530[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5530[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new IllegalStateException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = m180(1923616881803986L, 0L);
            }
         }
      }
   }

   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label33:
      for (Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for (int var10 = 0; var10 < var3; var10++) {
                  if (var9[var10] != var4[var10]) {
                     continue label33;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m184(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m185(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m186(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f5530[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5531[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            var11++;
            var12++;
         } while ((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for (int var16 = 0; var16 < var11; var16++) {
            int var17 = var6.indexOf(8, var12);
            var15 = m180(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m184(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f5530[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1923616881803986L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m185(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f5530[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while (var29 < var13) {
                  var28.append(var14[var29].getName());
                  if (++var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new IllegalStateException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1923616881803986L, 0L);
            }
         }
      }
   }

   public static MethodHandle m187(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 233 && var8 != 'H' && var8 != 'O' && var8 != 'h') {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'w') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 163) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 233) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'H') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'O') {
               var9 = var0.findStaticGetter(var12, var18, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var18, var14);
            }
         }

         return MethodHandles.dropArguments((MethodHandle)var9, var3.parameterCount() - 2, long.class, long.class);
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName())
            .append(" : ")
            .append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null "))
            .append(" : ")
            .append(var15.toString());
         throw new IllegalStateException(var13.toString());
      }
   }

   public static Object m188(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m187(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ExtraTab.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʟ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
