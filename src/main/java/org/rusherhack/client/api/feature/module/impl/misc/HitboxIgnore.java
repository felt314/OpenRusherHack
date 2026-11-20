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
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.HitboxIgnoreCommand;
public class HitboxIgnore extends ToggleableModule {
   public BooleanSetting players;
   public BooleanSetting hostiles;
   public Class200 f7493;
   public BooleanSetting neutrals;
   public BooleanSetting blocks;
   public BooleanSetting crystals;
   public static HitboxIgnore f7497;
   public BooleanSetting vehicles;
   public BooleanSetting passives;
   public BooleanSetting entities;
   public BooleanSetting pickaxeonly;
   public BooleanSetting rightclickcompatibility;
   public static long f7503 = Class066.m4320(7956065840211821254L, 243045093667821443L, MethodHandles.lookup().lookupClass()).m4325(23636864625048L);
   public static long f7507;
   public static Object[] f7508 = new Object[101];
   public static String[] f7509 = new String[101];

   @Subscribe
   public void m14585(Event482 var1) {
        
    }

   public HitboxIgnore() {
      super("HitboxIgnore", "Ignore entity hitboxes when mining", ModuleCategory.MISC);
      boolean var10018 = true;
      this.pickaxeonly = new BooleanSetting("PickaxeOnly", true);
      boolean var10017 = true;
      this.rightclickcompatibility = new BooleanSetting("RightClickCompatibility", true);
      boolean var10016 = true;
      this.entities = new BooleanSetting("Entities", true);
      boolean var10015 = true;
      this.players = new BooleanSetting("Players", true);
      boolean var10014 = true;
      this.crystals = new BooleanSetting("Crystals", true);
      this.hostiles = new BooleanSetting("Hostiles", false);
      this.passives = new BooleanSetting("Passives", false);
      this.neutrals = new BooleanSetting("Neutrals", false);
      this.vehicles = new BooleanSetting("Vehicles", false);
      this.blocks = new BooleanSetting("Blocks", false);
      this.f7493 = new Class200(RusherHackAPI.getConfigPath().resolve("hitboxignore").resolve("blocks.json").toFile());
      f7497 = this;
      Class170.f3364.m7112().m8473(this.f7493, this.f7493);
      BooleanSetting var10000 = this.entities;
      Setting[] var10001 = new Setting[(int)f7507];
      var10001[0] = this.players;
      boolean var10005 = true;
      var10001[1] = this.crystals;
      var10001[2] = this.hostiles;
      var10001[3] = this.passives;
      var10001[4] = this.neutrals;
      var10001[5] = this.vehicles;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.pickaxeonly, null, null, null};
      var10005 = true;
      var10001[1] = this.rightclickcompatibility;
      var10001[2] = this.entities;
      var10001[3] = this.blocks;
      this.registerSettings(var10001);
   }

   public boolean m14586(Entity var1) {
      long var2 = f7503 ^ 37346990481221L;
      if (var1 instanceof PlayerEntity) {
         return (Boolean)this.players.getValue();
      } else if (var1 instanceof EndCrystalEntity) {
         return (Boolean)this.crystals.getValue();
      } else if (((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "ä", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Module087.f2190,  var1,  5977403664884806449L,  var2))).booleanValue()) {
         return (Boolean)this.hostiles.getValue();
      } else if (((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "ä", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Module087.f2190,  var1,  5974557178471885194L,  var2))).booleanValue()) {
         return (Boolean)this.neutrals.getValue();
      } else if (((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "ä", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Module087.f2190,  var1,  5974174424423922471L,  var2))).booleanValue()) {
         return (Boolean)this.passives.getValue();
      } else if ((Boolean)this.vehicles.getValue() && ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "ä", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Module087.f2190,  var1,  5977770016906274892L,  var2))).booleanValue()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public ModuleCommand createCommand() {
      return new HitboxIgnoreCommand(this, this);
   }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f7509[var4] != null) {
         return var4;
      } else {
         Object var5 = f7508[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 5;
               case 1 -> 44;
               case 2 -> 21;
               case 3 -> 2;
               case 4 -> 24;
               case 5 -> 30;
               case 6 -> 47;
               case 7 -> 16;
               case 8 -> 10;
               case 9 -> 63;
               case 10 -> 13;
               case 11 -> 50;
               case 12 -> 38;
               case 13 -> 26;
               case 14 -> 7;
               case 15 -> 27;
               case 16 -> 39;
               case 17 -> 32;
               case 18 -> 23;
               case 19 -> 51;
               case 20 -> 20;
               case 21 -> 49;
               case 22 -> 11;
               case 23 -> 34;
               case 24 -> 33;
               case 25 -> 36;
               case 26 -> 3;
               case 27 -> 56;
               case 28 -> 41;
               case 29 -> 37;
               case 30 -> 31;
               case 31 -> 57;
               case 32 -> 35;
               case 33 -> 18;
               case 34 -> 53;
               case 35 -> 42;
               case 36 -> 59;
               case 37 -> 8;
               case 38 -> 0;
               case 39 -> 6;
               case 40 -> 58;
               case 41 -> 60;
               case 42 -> 15;
               case 43 -> 28;
               case 44 -> 29;
               case 45 -> 1;
               case 46 -> 55;
               case 47 -> 4;
               case 48 -> 19;
               case 49 -> 48;
               case 50 -> 9;
               case 51 -> 61;
               case 52 -> 40;
               case 53 -> 54;
               case 54 -> 62;
               case 55 -> 17;
               case 56 -> 22;
               case 57 -> 46;
               case 58 -> 14;
               case 59 -> 25;
               case 60 -> 45;
               case 61 -> 43;
               case 62 -> 12;
               default -> 52;
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

            f7509[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f7508[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f7509[var4]);
            f7508[var4] = var5;
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
      Object var5 = f7508[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f7509[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f7508[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f7508[var4] = var13;
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
               var12 = m180(1256340048801763L, 0L);
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
      Object var5 = f7508[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f7509[var4];
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
               f7508[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1256340048801763L, 0L);
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
                     f7508[var4] = var19;
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
               var23 = m180(1256340048801763L, 0L);
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
         if (var8 != 211 && var8 != 240 && var8 != 'p' && var8 != 214) {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 228) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'V') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 211) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 240) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'p') {
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

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(HitboxIgnore.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ь" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
