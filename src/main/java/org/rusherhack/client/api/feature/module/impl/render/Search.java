package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.MobSpawnerBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import net.minecraft.world.chunk.WorldChunk;
import org.lwjgl.opengl.GL11;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.events.world.EventEntity$Add;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.client.api.utils.EntityUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.Timer;
import org.rusherhack.core.utils.TriConsumer;

import org.rusherhack.command.SearchCommand;
import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
public class Search extends ToggleableModule {
   public BooleanSetting ignorenaturalchests;
   public static Search f8270;
   public BooleanSetting alert;
   public NumberSetting<Double> range;
   public BooleanSetting debug;
   public BooleanSetting entities;
   public boolean f8275;
   public Class009 f8276;
   public BooleanSetting f8277;
   public Class242 f8278;
   public BooleanSetting outline;
   public Timer f8280;
   public BooleanSetting blocks;
   public NumberSetting<Double> f8283;
   public BooleanSetting f8284;
   public NullSetting renderSettings;
   public BooleanSetting tracer;
   public BooleanSetting fill;
   public NumberSetting<Float> width;
   public BooleanSetting sound;
   public ConcurrentHashMap<ChunkPos, Class232> f8290;
   public EnumSetting<SearchColormode> colormode;
   public BooleanSetting box;
   public BooleanSetting illegalbedrock;
   public ColorSetting color;
   public BooleanSetting ignoresinglechests;
   public static long f8296 = Class066.m4320(7812261485961589727L, -435111925001073436L, MethodHandles.lookup().lookupClass()).m4325(51870204015160L);
   public static long[] f8300;
   public static Integer[] f8301;
   public static Map f8302;
   public static long f8303;
   public static Object[] f8304 = new Object[262];
   public static String[] f8305 = new String[262];

   @Subscribe
   public void onRender3D(EventRender3D var1) {
        
    }

   @Override
   public void onDisable() {
      this.f8290.clear();
   }

   

   @Override
   public ModuleCommand createCommand() {
      return new SearchCommand(this, this);
   }

   public boolean m15951(BlockPos var1, Block var2) {
      long var3 = f8296 ^ 68488770126532L;
      BlockPos var8 = var1;
      if (!(Boolean)this.blocks.getValue()) {
         return false;
      } else if ((Boolean)this.illegalbedrock.getValue()
         && var2.equals(Blocks.BEDROCK)
         && var1.getY() > 5
         && var1.getY() < (Globals.mc.world.getRegistryKey().equals(World.NETHER) ? m175(30309, 5064175950395306847L ^ var3) : Globals.mc.world.getTopY())
         )
       {
         boolean var10002 = true;
         return true;
      } else {
         if (var2 instanceof ChestBlock) {
            if ((Boolean)this.ignorenaturalchests.getValue()) {
               Iterator var6 = WorldUtils.getBlockEntities(false).iterator();

               while (var6.hasNext()) {
                  BlockEntity var7;
                  if ((var7 = (BlockEntity)var6.next()) instanceof MobSpawnerBlockEntity
                     && ((MobSpawnerBlockEntity)var7).getPos().toCenterPos().distanceTo(var8.toCenterPos()) < 6.0) {
                     return false;
                  }
               }
            }

            if ((Boolean)this.ignoresinglechests.getValue() && Globals.mc.world.getBlockState(var8).get(ChestBlock.CHEST_TYPE) == ChestType.SINGLE) {
               return false;
            }
         }

         return this.f8278.m8833(var2);
      }
   }

   public void m15952(BiConsumer<Entity, Integer> var1) {
      int var4 = Class253.m9155();
      Search var5 = this;
      Iterator var8;
      Iterator var10000 = var8 = WorldUtils.getEntities().iterator();

      while (var10000.hasNext()) {
         Entity var6;
         if ((var6 = (Entity)var8.next()) instanceof ClientPlayerEntity) {
            var10000 = var8;
         } else if (var5.f8283.getValue() > 0.0 && var6.distanceTo(Globals.mc.player) > var5.f8283.getValue()) {
            var10000 = var8;
         } else {
            EntityType var7 = var6.getType();
            if (var4 != 0) {
               if (!var5.f8276.m396(var7)) {
                  var10000 = var8;
                  continue;
               }

               var1.accept(var6, var5.colormode.getValue().m13976(var6));
            }

            var10000 = var8;
         }
      }
   }

   @Subscribe(
      stage = Stage.POST
   )
   public void onUpdate(EventUpdate var1) {
      long var2 = f8296 ^ 124103011045881L;
      int var4 = Class253.m9155();
      if (var4 != 0) {
         if (Globals.mc.world != null) {
            List var5 = WorldUtils.getChunks();
            this.f8290.keySet().removeIf(var1x -> {
               WorldChunk var5x;
               if (!(var5x = Globals.mc.world.getChunk(var1x.x, var1x.z)).isEmpty() && var5.contains(var5x)) {
                  return false;
               } else {
                  boolean var10002 = true;
                  return true;
               }
            });
            if ((Boolean)this.blocks.getValue() && this.f8280.passed(TimeUnit.SECONDS.toMillis(f8303))) {
               org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "É", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7114(),  5124480659899470640L,  var2);
               this.f8280.reset();
            }

            if (this.f8275) {
               Globals.mc.player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
               this.f8275 = false;
            }

            return;
         }

         this.f8290.clear();
      }
   }

   public Search() {
    }

   @Override
   public void onEnable() {
      long var1 = f8296 ^ 132834045911541L;
      this.f8290.clear();
      org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "É", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7114(),  3968190323919135548L,  var1);
   }

   @Subscribe
   public void onAdd(EventEntity$Add var1) {
      if ((Boolean)this.entities.getValue() && this.f8276.m396(var1.getEntity().getType())) {
         if ((Boolean)this.f8284.getValue()) {
            ChatUtils.print("Search has found " + var1.getEntity().getName().getString());
         }

         if ((Boolean)this.f8277.getValue()) {
            this.f8275 = true;
         }
      }
   }

   public void m15958(TriConsumer<BlockPos, VoxelShape, Integer> var1) {
        
    }

   public int m15959(Block var1) {
        return 0;
    }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20776;
      if (f8301[var3] == null) {
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
         long var5 = f8300[var3];
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
         Object[] var9 = (Object[])f8302.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f8302.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ҷ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f8301[var3] = var15;
      }

      return f8301[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Search.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ҷ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8305[var4] != null) {
         return var4;
      } else {
         Object var5 = f8304[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 35;
               case 1 -> 2;
               case 2 -> 58;
               case 3 -> 34;
               case 4 -> 51;
               case 5 -> 37;
               case 6 -> 57;
               case 7 -> 63;
               case 8 -> 40;
               case 9 -> 60;
               case 10 -> 9;
               case 11 -> 3;
               case 12 -> 13;
               case 13 -> 52;
               case 14 -> 49;
               case 15 -> 59;
               case 16 -> 33;
               case 17 -> 16;
               case 18 -> 22;
               case 19 -> 47;
               case 20 -> 42;
               case 21 -> 39;
               case 22 -> 55;
               case 23 -> 61;
               case 24 -> 15;
               case 25 -> 12;
               case 26 -> 45;
               case 27 -> 0;
               case 28 -> 25;
               case 29 -> 19;
               case 30 -> 10;
               case 31 -> 17;
               case 32 -> 24;
               case 33 -> 44;
               case 34 -> 20;
               case 35 -> 11;
               case 36 -> 38;
               case 37 -> 26;
               case 38 -> 56;
               case 39 -> 48;
               case 40 -> 43;
               case 41 -> 31;
               case 42 -> 21;
               case 43 -> 54;
               case 44 -> 18;
               case 45 -> 4;
               case 46 -> 62;
               case 47 -> 30;
               case 48 -> 7;
               case 49 -> 8;
               case 50 -> 27;
               case 51 -> 41;
               case 52 -> 5;
               case 53 -> 36;
               case 54 -> 46;
               case 55 -> 32;
               case 56 -> 53;
               case 57 -> 6;
               case 58 -> 1;
               case 59 -> 29;
               case 60 -> 23;
               case 61 -> 28;
               case 62 -> 50;
               default -> 14;
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

            f8305[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f8304[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8305[var4]);
            f8304[var4] = var5;
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
      Object var5 = f8304[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8305[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f8304[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8304[var4] = var13;
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
               var12 = m180(114798520104378L, 0L);
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
      Object var5 = f8304[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8305[var4];
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
               f8304[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(114798520104378L, 0L);
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
                     f8304[var4] = var19;
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
               var23 = m180(114798520104378L, 0L);
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
         if (var8 != 'S' && var8 != 'B' && var8 != 200 && var8 != 221) {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 201) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == '$') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'S') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'B') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 200) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Search.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ҷ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
