package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringJoiner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.MerchantScreen;
import net.minecraft.client.gui.screen.ingame.MerchantScreen.WidgetButtonPage;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket;
import net.minecraft.screen.MerchantScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.Merchant;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerData;
import net.minecraft.village.VillagerProfession;
import net.minecraft.village.TradeOffers.Factory;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.gui.IMixinAbstractContainerScreen;
import org.rusherhack.client.api.accessors.gui.IMixinMerchantMenu;
import org.rusherhack.client.api.accessors.gui.IMixinMerchantScreen;
import org.rusherhack.client.api.accessors.gui.IMixinScreen;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.client.screen.EventScreen$BuildButtons;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.StringUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.AutoTraderCommand;
import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
public class AutoTrader extends ToggleableModule {
   public BooleanSetting autoclose;
   public NumberSetting<Integer> delay;
   public ButtonWidget f3525;
   public BooleanSetting debug;
   public Class293 f3527;
   public Int2ObjectMap<VillagerData> f3528;
   public String f3529;
   public Timer f3530;
   public static AutoTrader f3531;
   public EnumSetting<AutoTraderMode> mode;
   public NumberSetting<Float> range;
   public BooleanSetting autoopen;
   public BooleanSetting rotate;
   public static long f3536 = Class066.m4320(6701082967591111371L, -4229895908878096538L, MethodHandles.lookup().lookupClass()).m4325(135787877323033L);
   public static String[] f3537;
   public static String[] f3538;
   public static Map f3539 = new HashMap(13);
   public static Object[] f3543 = new Object[244];
   public static String[] f3544 = new String[244];

   @Subscribe
   public void onLoadWorld(EventLoadWorld var1) {
      this.f3528.clear();
   }

   @Override
   public void onEnable() {
      this.f3528.clear();
   }

   public boolean m7428(TradeOffer var1, DefaultedList<Slot> var2, int var3, int var4) {
        return false;
    }

   @Override
   public ModuleCommand createCommand() {
      return new AutoTraderCommand(this, this);
   }

   @Subscribe
   public void onBuildButtons(EventScreen$BuildButtons var1) {
        
    }

   public AutoTrader() {
      super(
         "AutoTrader",
         "Automatical83L\u0015AGTQPF\u0015B\\A]\u0015C\\Y\r\u0006agers",
         ModuleCategory.MISC
      );
      this.mode = new EnumSetting<>("Mode", AutoTraderMode.f6794);
      boolean var10018 = true;
      this.autoopen = new BooleanSetting("AutoOpen", true);
      this.range = new NumberSetting<>("Range", 3.0F, 0.1F, 6.0F);
      boolean var10016 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      boolean var10015 = true;
      this.autoclose = new BooleanSetting("AutoClose", true);
      boolean var10014 = true;
      this.delay = new NumberSetting<>("Delay", 1, 0, 20);
      BooleanSetting var10008 = new BooleanSetting("Debug", false);
      boolean var10011 = true;
      this.debug = var10008.setHidden(true);
      this.f3527 = new Class293(this, "whitelist.json");
      this.f3528 = new Int2ObjectOpenHashMap();
      this.f3530 = new Timer();
      this.f3529 = "";
      f3531 = this;
      BooleanSetting var10000 = this.autoopen;
      Setting[] var10001 = new Setting[]{this.range, null};
      boolean var10005 = true;
      var10001[1] = this.rotate;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.mode, null, null, null, null};
      var10005 = true;
      var10001[1] = this.autoopen;
      var10001[2] = this.autoclose;
      var10001[3] = this.delay;
      var10001[4] = this.debug;
      this.registerSettings(var10001);
      Class170.f3364.m7112().m8473(this.f3527, this.f3527);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   
   public static String m221(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   public static String m172(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30983;
      if (f3538[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f3539.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f3539.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/Ƃ", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         try {
DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f3537[var5].getBytes("ISO-8859-1");
         f3538[var5] = m221(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f3538[var5];
   }

   public static Object m173(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = m172(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoTrader.class, "m173", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ƃ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3544[var4] != null) {
         return var4;
      } else {
         Object var5 = f3543[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 52;
               case 1 -> 40;
               case 2 -> 30;
               case 3 -> 38;
               case 4 -> 45;
               case 5 -> 46;
               case 6 -> 12;
               case 7 -> 29;
               case 8 -> 59;
               case 9 -> 61;
               case 10 -> 42;
               case 11 -> 41;
               case 12 -> 36;
               case 13 -> 7;
               case 14 -> 10;
               case 15 -> 55;
               case 16 -> 24;
               case 17 -> 5;
               case 18 -> 9;
               case 19 -> 8;
               case 20 -> 28;
               case 21 -> 1;
               case 22 -> 17;
               case 23 -> 16;
               case 24 -> 6;
               case 25 -> 14;
               case 26 -> 22;
               case 27 -> 11;
               case 28 -> 34;
               case 29 -> 43;
               case 30 -> 60;
               case 31 -> 32;
               case 32 -> 20;
               case 33 -> 44;
               case 34 -> 49;
               case 35 -> 37;
               case 36 -> 18;
               case 37 -> 19;
               case 38 -> 58;
               case 39 -> 47;
               case 40 -> 3;
               case 41 -> 54;
               case 42 -> 53;
               case 43 -> 31;
               case 44 -> 13;
               case 45 -> 62;
               case 46 -> 2;
               case 47 -> 63;
               case 48 -> 26;
               case 49 -> 33;
               case 50 -> 57;
               case 51 -> 23;
               case 52 -> 21;
               case 53 -> 48;
               case 54 -> 25;
               case 55 -> 15;
               case 56 -> 27;
               case 57 -> 51;
               case 58 -> 39;
               case 59 -> 56;
               case 60 -> 35;
               case 61 -> 50;
               case 62 -> 0;
               default -> 4;
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

            f3544[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f3543[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3544[var4]);
            f3543[var4] = var5;
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
      Object var5 = f3543[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3544[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f3543[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3543[var4] = var13;
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
               var12 = m180(3344640195942332L, 0L);
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
      Object var5 = f3543[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3544[var4];
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
               f3543[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(3344640195942332L, 0L);
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
                     f3543[var4] = var19;
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
               var23 = m180(3344640195942332L, 0L);
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
         if (var8 != 206 && var8 != 186 && var8 != 'I' && var8 != 221) {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 194) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'E') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 206) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 186) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'I') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoTrader.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ƃ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
