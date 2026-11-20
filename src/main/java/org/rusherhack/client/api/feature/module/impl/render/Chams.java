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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhase;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.crash.CrashException;
import net.minecraft.util.crash.CrashReport;
import net.minecraft.util.crash.CrashReportSection;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.events.render.EventRenderEntity;
import org.rusherhack.client.api.events.render.EventRenderEntity$Nametag;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.system.Colors$ColorMode;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.mixin.MixinHelper;

import org.rusherhack.command.clear;
import org.rusherhack.command.peek;
import org.rusherhack.command.toggle;
public class Chams extends ToggleableModule {
   public EnumSetting<ChamsColormode> colormode;
   public boolean f2325;
   public Color f2326;
   public Entity f2327;
   public MultiPhase f2328;
   public Targets f2329;
   public NullSetting fillSettings;
   public Class189 f2331;
   public NumberSetting<Integer> alpha;
   public BooleanSetting glint;
   public List<Entity> f2334;
   public static Chams f2335;
   public EnumSetting<ChamsMode> mode;
   public AtomicBoolean f2337;
   public ColorSetting f2338;
   public static long f2339 = Class066.m4320(8170673725280617609L, -593273053341708285L, MethodHandles.lookup().lookupClass()).m4325(223365425647007L);
   public static long[] f2343;
   public static Integer[] f2344;
   public static Map f2345;
   public static Object[] f2346 = new Object[213];
   public static String[] f2347 = new String[213];

   @Subscribe(
      stage = Stage.PRE
   )
   public void onRenderEntity(EventRenderEntity var1) {
      if (!this.f2337.get()) {
         Entity var6 = var1.getEntity();
         if (this.f2329.m7993(var6)) {
            this.f2334.add(var6);
            var1.setRenderModel(false);
         }
      }
   }

   public static void m5208(Entity var0, double var1, double var3, double var5, float var7, MatrixStack var8, VertexConsumerProvider var9) {
      float var17 = var7;
      Entity var26 = var0;
      var1 = MathHelper.lerp(var7, var0.lastRenderX, var0.getX()) - var1;
      var3 = MathHelper.lerp(var7, var0.lastRenderY, var0.getY()) - var3;
      var5 = MathHelper.lerp(var7, var0.lastRenderZ, var0.getZ()) - var5;
      float var12 = MathHelper.lerp(var7, var0.prevYaw, var0.getYaw());
      EntityRenderer var13 = Globals.mc.getEntityRenderDispatcher().getRenderer(var0);

      try {
         Vec3d var14 = var13.getPositionOffset(var26, var17);
         var1 += var14.getX();
         var3 += var14.getY();
         var5 += var14.getZ();
         var8.push();
         var8.translate(var1, var3, var5);
         var13.render(var26, var12, var17, var8, var9, Globals.mc.getEntityRenderDispatcher().getLight(var26, var17));
         var8.pop();
      } catch (Throwable var16) {
         CrashReport var19;
         CrashReport var27 = var19 = CrashReport.create(var16, "Rendering entity in world");
         CrashReportSection var15 = var27.addElement("Entity being rendered");
         var0.populateCrashReport(var15);
         CrashReportSection var22;
         (var22 = var27.addElement("\"E\u000fnderer details")).add("Assigned renderer", var13);
         var22.add("Rotation", var12);
         var22.add("Delta", var7);
         throw new CrashException(var19);
      }
   }

   @Subscribe
   public void onNametag(EventRenderEntity$Nametag var1) {
      if (this.f2329.m7993(var1.getEntity()) && this.f2337.get()) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Override
   public void onEnable() {
      if (this.f2325) {
         this.toggle();
         this.sendNotification(NotificationType.ERROR, "Please update to the latest version of Sodium to use Chams");
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Subscribe
   public void onRender3D(EventRender3D var1) {
        
    }

   @Subscribe(
      stage = Stage.POST
   )
   public void onRender2D(EventRender2D var1) {
      this.f2334.clear();
   }

   public Chams() {
    }
  public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23875;
      if (f2344[var3] == null) {
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
         long var5 = f2343[var3];
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
         Object[] var9 = (Object[])f2345.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f2345.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ä", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f2344[var3] = var15;
      }

      return f2344[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Chams.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ä" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f2347[var4] != null) {
         return var4;
      } else {
         Object var5 = f2346[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 19;
               case 1 -> 35;
               case 2 -> 12;
               case 3 -> 41;
               case 4 -> 25;
               case 5 -> 27;
               case 6 -> 38;
               case 7 -> 59;
               case 8 -> 18;
               case 9 -> 8;
               case 10 -> 11;
               case 11 -> 3;
               case 12 -> 42;
               case 13 -> 32;
               case 14 -> 57;
               case 15 -> 36;
               case 16 -> 63;
               case 17 -> 9;
               case 18 -> 13;
               case 19 -> 48;
               case 20 -> 44;
               case 21 -> 23;
               case 22 -> 7;
               case 23 -> 40;
               case 24 -> 2;
               case 25 -> 33;
               case 26 -> 34;
               case 27 -> 47;
               case 28 -> 24;
               case 29 -> 14;
               case 30 -> 54;
               case 31 -> 43;
               case 32 -> 62;
               case 33 -> 1;
               case 34 -> 20;
               case 35 -> 10;
               case 36 -> 5;
               case 37 -> 29;
               case 38 -> 26;
               case 39 -> 4;
               case 40 -> 17;
               case 41 -> 49;
               case 42 -> 21;
               case 43 -> 22;
               case 44 -> 51;
               case 45 -> 52;
               case 46 -> 30;
               case 47 -> 31;
               case 48 -> 45;
               case 49 -> 39;
               case 50 -> 37;
               case 51 -> 16;
               case 52 -> 58;
               case 53 -> 15;
               case 54 -> 56;
               case 55 -> 28;
               case 56 -> 60;
               case 57 -> 55;
               case 58 -> 6;
               case 59 -> 53;
               case 60 -> 50;
               case 61 -> 0;
               case 62 -> 61;
               default -> 46;
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

            f2347[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f2346[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f2347[var4]);
            f2346[var4] = var5;
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
      Object var5 = f2346[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f2347[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f2346[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f2346[var4] = var13;
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
               var12 = m180(108028677616194L, 0L);
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
      Object var5 = f2346[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f2347[var4];
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
               f2346[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(108028677616194L, 0L);
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
                     f2346[var4] = var19;
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
               var23 = m180(108028677616194L, 0L);
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
         if (var8 != 'J' && var8 != 'M' && var8 != 202 && var8 != 'a') {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 246) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 198) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'J') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'M') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 202) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Chams.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ä" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
