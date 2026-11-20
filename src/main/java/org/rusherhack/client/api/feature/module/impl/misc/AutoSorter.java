package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.gui.IMixinShulkerBoxMenu;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.client.screen.EventScreen$Change;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.baritone;
import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
import org.rusherhack.command.send;
public class AutoSorter extends ToggleableModule {
   public BooleanSetting render;
   public EnumSetting<AutoSorterSortmode> sortmode;
   public long f8772;
   public Timer f8773;
   public BooleanSetting active;
   public HashSet<Class422> f8775;
   public BlockPos f8776;
   public NumberSetting<Integer> chestloaddelay;
   public int f8778;
   public NumberSetting<Integer> delay;
   public Enum225 f8780;
   public Class573 f8781;
   public BlockPos f8782;
   public long f8783;
   public HashSet<Class573> f8784;
   public Class573 f8785;
   public long f8786;
   public int f8787;
   public EnumSetting<AutoSorterSelection> selection;
   public static long f8789 = Class066.m4320(-3456510834220904614L, -6797456070961214859L, MethodHandles.lookup().lookupClass()).m4325(244217284615355L);
   public static Object[] f8799 = new Object[216];
   public static String[] f8800 = new String[216];

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   public Class573 m16855(BlockPos var1) {
      int var10000 = Class253.m9155();
      Iterator var7 = this.f8775.iterator();
      int var4 = var10000;

      while (var7.hasNext()) {
         Class573 var6;
         Class573 var8 = var6 = (Class573)var7.next();

         while (var8.m17578(var1)) {
            var8 = var6;
            if (var4 != 0) {
               return var6;
            }
         }
      }

      return null;
   }

   public Enum225 m16856() {
      Class573 var5;
      if (!InventoryUtils.isInventoryFull() && (var5 = this.m16863()) != null) {
         this.f8781 = var5;
         return Enum225.f4147;
      } else {
         Class422 var6;
         if ((var6 = this.m16859()) != null) {
            this.f8781 = var6;
            return Enum225.f4146;
         } else {
            Class170.f3364.m7110().send(NotificationType.INFO, "AutoSorter finished");
            this.active.setValue(false);
            return Enum225.f4144;
         }
      }
   }

   @Override
   public void onEnable() {
      this.f8784.clear();
      this.f8775.clear();
   }

   @Subscribe
   public void onChange(EventScreen$Change var1) {
        
    }

   @Override
   public String getMetadata() {
      return this.active.getValue() ? this.f8780.name() : "INACTIVE";
   }

   @Override
   public void onDisable() {
      super.onDisable();
   }

   public AutoSorter() {
        super("AutoSorter", "Sorts items into their appropriate chests", ModuleCategory.MISC);
      int var10001 = 6;

      this.selection = new EnumSetting<>("Selection", AutoSorterSelection.f9301);
      this.sortmode = new EnumSetting<>("SortMode", AutoSorterSortmode.f5211);
      boolean var10029 = true;
      this.delay = new NumberSetting<>("Delay", 1, 0, 4);
      this.chestloaddelay = new NumberSetting<>("ChestLoadDelay", 20, 0, 20);
      this.active = new BooleanSetting("Active", false);
      boolean var10026 = true;
      this.render = new BooleanSetting("Render", true);
      this.f8784 = new HashSet<>();
      this.f8775 = new HashSet<>();
      this.f8776 = null;
      this.f8783 = System.currentTimeMillis();
      this.f8772 = System.currentTimeMillis();
      this.f8786 = System.currentTimeMillis();
      this.f8782 = null;
      this.f8785 = null;
      this.f8787 = 0;
      this.f8778 = 0;
      this.f8773 = new Timer();
      this.f8780 = Enum225.f4144;
      this.f8781 = null;
      Setting[] var3 = new Setting[var10001];
      var3[0] = this.selection;
      boolean var10005 = true;
      var3[1] = this.sortmode;
      var3[2] = this.delay;
      var3[3] = this.chestloaddelay;
      var3[4] = this.active;
      var3[5] = this.render;
      this.registerSettings(var3);
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      int var4 = Class253.m9155();
      if ((Boolean)this.render.getValue()) {
         MatrixStack var10 = var1.getMatrixStack();
         IRenderer3D var5 = var1.getRenderer();
         var5.begin(var10);
         Iterator var8;
         Iterator var12 = var8 = this.f8784.iterator();

         while (var12.hasNext()) {
            Class573 var7 = (Class573)var8.next();
            var12 = var8;
            var7.m13577(var5);
            var7.m13578(var10);
         }

         Iterator var9;
         var12 = var9 = this.f8775.iterator();

         while (true) {
            if (!var12.hasNext()) {
               var5.end();
               break;
            }

            Class422 var11 = (Class422)var9.next();
            if (var4 == 0) {
               break;
            }

            var12 = var9;
            var11.m13577(var5);
            var11.m13578(var10);
         }
      }
   }

   public Class422 m16859() {
        return null;
    }

   @Subscribe(
      stage = Stage.PRE
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
        
    }

   public Class573 m16861(BlockPos var1) {
      int var10000 = Class253.m9154();
      Iterator var7 = this.f8784.iterator();
      int var4 = var10000;

      while (var7.hasNext()) {
         Class573 var6;
         Class573 var8 = var6 = (Class573)var7.next();

         while (var8.m17578(var1)) {
            var8 = var6;
            if (var4 == 0) {
               return var6;
            }
         }
      }

      return null;
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      int var4 = Class253.m9155();
      Packet var6;
      PlayerInteractBlockC2SPacket var8;
      if ((var6 = var1.getPacket()) instanceof PlayerInteractBlockC2SPacket && (var8 = (PlayerInteractBlockC2SPacket)var6).getBlockHitResult() != null) {
         BlockPos var7 = var8.getBlockHitResult().getBlockPos();
         if (var4 != 0) {
            if (!(Globals.mc.world.getBlockEntity(var7) instanceof Inventory)) {
               return;
            }

            this.f8783 = System.currentTimeMillis();
            this.f8776 = var7;
         }
      }
   }

   public Class573 m16863() {
        return null;
    }

   public Class573 m16864(BlockPos var1) {
      Class573 var6;
      if ((var6 = this.m16861(var1)) == null) {
         var6 = this.m16855(var1);
      }

      return var6;
   }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8800[var4] != null) {
         return var4;
      } else {
         Object var5 = f8799[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 13;
               case 1 -> 8;
               case 2 -> 12;
               case 3 -> 27;
               case 4 -> 59;
               case 5 -> 62;
               case 6 -> 43;
               case 7 -> 56;
               case 8 -> 3;
               case 9 -> 20;
               case 10 -> 61;
               case 11 -> 9;
               case 12 -> 46;
               case 13 -> 41;
               case 14 -> 40;
               case 15 -> 17;
               case 16 -> 23;
               case 17 -> 28;
               case 18 -> 58;
               case 19 -> 21;
               case 20 -> 7;
               case 21 -> 42;
               case 22 -> 44;
               case 23 -> 34;
               case 24 -> 52;
               case 25 -> 63;
               case 26 -> 31;
               case 27 -> 11;
               case 28 -> 48;
               case 29 -> 49;
               case 30 -> 22;
               case 31 -> 51;
               case 32 -> 39;
               case 33 -> 36;
               case 34 -> 19;
               case 35 -> 15;
               case 36 -> 35;
               case 37 -> 29;
               case 38 -> 4;
               case 39 -> 54;
               case 40 -> 26;
               case 41 -> 16;
               case 42 -> 0;
               case 43 -> 37;
               case 44 -> 18;
               case 45 -> 45;
               case 46 -> 32;
               case 47 -> 57;
               case 48 -> 2;
               case 49 -> 55;
               case 50 -> 1;
               case 51 -> 5;
               case 52 -> 10;
               case 53 -> 33;
               case 54 -> 24;
               case 55 -> 6;
               case 56 -> 14;
               case 57 -> 25;
               case 58 -> 53;
               case 59 -> 30;
               case 60 -> 47;
               case 61 -> 38;
               case 62 -> 60;
               default -> 50;
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

            f8800[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f8799[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8800[var4]);
            f8799[var4] = var5;
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
      Object var5 = f8799[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8800[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f8799[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8799[var4] = var13;
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
               var12 = m180(1256166347602279L, 0L);
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
      Object var5 = f8799[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8800[var4];
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
               f8799[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1256166347602279L, 0L);
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
                     f8799[var4] = var19;
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
               var23 = m180(1256166347602279L, 0L);
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
         if (var8 != 'O' && var8 != 216 && var8 != 'P' && var8 != 'W') {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 196) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'l') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'O') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 216) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'P') {
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

   public static CallSite m1290(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoSorter.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ӻ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
