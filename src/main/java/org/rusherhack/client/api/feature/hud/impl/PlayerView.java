package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.DiffuseLighting;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.hud.ResizeableHudElement;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.utils.InputUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.utils.MathUtils;

public class PlayerView extends ResizeableHudElement {
   public static boolean f8204;
   public BooleanSetting forward;
   public double f8206;
   public double f8207;
   public static long f8208 = Class066.m4320(4212092278542044768L, -2499486010316598822L, MethodHandles.lookup().lookupClass()).m4325(53199709839465L);
   public static String[] f8209;
   public static String[] f8210;
   public static long[] f8212;
   public static Integer[] f8213;
   public static Map f8214;
   public static Object[] f8215 = new Object[103];
   public static String[] f8216 = new String[103];

   public static void m15818(DrawContext var0, int var1, int var2, int var3, float var4, float var5, LivingEntity var6, float var7) {
      var4 = (float)Math.atan(var4 / 40.0F);
      var5 = (float)Math.atan(var5 / 40.0F);
      Quaternionf var10 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf var11 = new Quaternionf().rotateX(var5 * 20.0F * (float) (Math.PI / 180.0));
      var10.mul(var11);
      float var12 = var6.bodyYaw;
      float var13 = var6.prevBodyYaw;
      float var14 = var6.getYaw();
      float var15 = var6.getPitch();
      float var16 = var6.prevPitch;
      float var17 = var6.prevYaw;
      float var18 = var6.prevHeadYaw;
      float var19 = var6.headYaw;
      var6.bodyYaw = var6.prevBodyYaw = 180.0F + var4 * 20.0F;
      var6.setYaw(180.0F + var4 * 40.0F);
      var6.setPitch(-var5 * 20.0F);
      var6.prevPitch = var6.getPitch();
      var6.prevYaw = var6.getYaw();
      var6.headYaw = var6.getYaw();
      var6.prevHeadYaw = var6.getYaw();
      m15819(var0, var1, var2, var3, var10, var11, var6, var7);
      var6.bodyYaw = var12;
      var6.prevBodyYaw = var13;
      var6.setYaw(var14);
      var6.setPitch(var15);
      var6.prevPitch = var16;
      var6.prevYaw = var17;
      var6.prevHeadYaw = var18;
      var6.headYaw = var19;
   }

   @Override
   public void renderContent(RenderContext var1, double var2, double var4) {
   }

   @Override
   public double getWidth() {
      return 50.0;
   }

   static {
    }

   @Override
   public void postRender(RenderContext var1, double var2, double var4) {
      long var6;
      int var8;
      label37: {
         label33: {
            var6 = f8208 ^ 105473254424402L;
            var2 = (int)InputUtils.getMouseX();
            int var10000 = Class253.m9155();
            var4 = (int)InputUtils.getMouseY();
            var2 = -var2;
            var4 = -var4;
            var8 = var10000;
            boolean var16 = (Boolean)this.forward.getValue();
            if (var8 != 0) {
               if (!var16) {
                  break label33;
               }

               var16 = true;
               boolean var10002 = true;
            }

            f8204 = var16;
            var2 = 0.0;
            var4 = 0.0;
            if (var8 != 0) {
               break label37;
            }
         }

         if (Globals.mc.currentScreen != null) {
            var2 += this.getStartX() + this.getScaledWidth() / 2.0;
            var4 += this.getStartY() + this.getScaledHeight() / 2.0 - 20.0;
            if (var8 != 0) {
               break label37;
            }
         }

         var2 = (int)(-(this.f8207 * 100.0));
         var4 = (int)(-(this.f8206 * 100.0));
      }

      int var11 = 5;
      boolean var17 = Globals.mc.player.isFallFlying();
      if (var8 != 0) {
         if (var17) {
            var11 = m175(2787, 3341089886438163589L ^ var6);
         }

         var17 = Globals.mc.getEntityRenderDispatcher().shouldRenderHitboxes();
      }

      boolean var10 = var17;
      Globals.mc.getEntityRenderDispatcher().setRenderHitboxes(false);
      m15818(
         var1.graphics(),
         (int)(((java.lang.Double)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "é", java.lang.invoke.MethodType.methodType(double.class, java.lang.Object.class, long.class, long.class)), this,  -246016415006272740L,  var6))).doubleValue() / 2.0),
         (int)(((java.lang.Double)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "é", java.lang.invoke.MethodType.methodType(double.class, java.lang.Object.class, long.class, long.class)), this,  -245927837127026571L,  var6))).doubleValue() - var11),
         m175(23178, 7730996633069409518L ^ var6),
         (float)var2,
         (float)var4,
         Globals.mc.player,
         var1.partialTicks()
      );
      Globals.mc.getEntityRenderDispatcher().setRenderHitboxes(var10);
      f8204 = false;
   }

   public PlayerView() {
      super("PlayerView");
      this.forward = new BooleanSetting("Forward", false);
      this.f8207 = 0.0;
      this.f8206 = 0.0;
      this.registerSettings(this.forward);
   }

   public static void m15819(DrawContext var0, int var1, int var2, int var3, Quaternionf var4, @Nullable Quaternionf var5, LivingEntity var6, float var7) {
      DrawContext var13 = var0;
      int var14 = Class253.m9154();
      var13.getMatrices().push();
      var13.getMatrices().translate(var1, var2, 50.0);
      var13.getMatrices().scale(var3, var3, -var3);
      var13.getMatrices().multiply(var4);
      int var10 = var14;
      DiffuseLighting.method_34742();
      EntityRenderDispatcher var12 = MinecraftClient.getInstance().getEntityRenderDispatcher();
      if (var10 == 0) {
         if (var5 != null) {
            var5.conjugate();
            var12.setRotation(var5);
         }

         var12.setRenderShadows(false);
         RenderSystem.runAsFancy(() -> {
            long var4x = f8208 ^ 110933298803553L;
            var12.render(var6, 0.0, 0.0, 0.0, 0.0F, var7, var13.getMatrices(), var13.getVertexConsumers(), m175(13723, 68735198908921805L ^ var4x));
         });
         var13.draw();
         var12.setRenderShadows(true);
         var13.getMatrices().pop();
         DiffuseLighting.enableGuiDepthLighting();
      }
   }

   @Subscribe
   public void m15820(Event516 var1) {
      double var4 = var1.m15870() / 360.0;
      double var6 = var1.m15869() / 360.0;
      this.f8206 = MathUtils.clamp(this.f8206 + var6, -2.0, 2.0);
      this.f8207 = MathUtils.clamp(this.f8207 + var4, -2.0, 2.0);
   }

   @Override
   public double getHeight() {
      return 70.0;
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
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29436;
      if (f8213[var3] == null) {
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
         long var5 = f8212[var3];
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
         Object[] var9 = (Object[])f8214.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f8214.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ҭ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f8213[var3] = var15;
      }

      return f8213[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(PlayerView.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ҭ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m272(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8216[var4] != null) {
         return var4;
      } else {
         Object var5 = f8215[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 55;
               case 1 -> 63;
               case 2 -> 39;
               case 3 -> 20;
               case 4 -> 43;
               case 5 -> 4;
               case 6 -> 44;
               case 7 -> 12;
               case 8 -> 32;
               case 9 -> 17;
               case 10 -> 11;
               case 11 -> 62;
               case 12 -> 19;
               case 13 -> 29;
               case 14 -> 36;
               case 15 -> 0;
               case 16 -> 48;
               case 17 -> 49;
               case 18 -> 42;
               case 19 -> 16;
               case 20 -> 45;
               case 21 -> 47;
               case 22 -> 18;
               case 23 -> 50;
               case 24 -> 21;
               case 25 -> 52;
               case 26 -> 33;
               case 27 -> 25;
               case 28 -> 1;
               case 29 -> 51;
               case 30 -> 61;
               case 31 -> 14;
               case 32 -> 60;
               case 33 -> 38;
               case 34 -> 13;
               case 35 -> 46;
               case 36 -> 53;
               case 37 -> 5;
               case 38 -> 35;
               case 39 -> 54;
               case 40 -> 30;
               case 41 -> 41;
               case 42 -> 26;
               case 43 -> 15;
               case 44 -> 58;
               case 45 -> 10;
               case 46 -> 6;
               case 47 -> 27;
               case 48 -> 7;
               case 49 -> 59;
               case 50 -> 22;
               case 51 -> 24;
               case 52 -> 2;
               case 53 -> 34;
               case 54 -> 56;
               case 55 -> 28;
               case 56 -> 57;
               case 57 -> 3;
               case 58 -> 9;
               case 59 -> 31;
               case 60 -> 37;
               case 61 -> 23;
               case 62 -> 8;
               default -> 40;
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

            f8216[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m273() {
      f8215[0] = "y/\u0016Iy8y/\u0001\u0015u7cd\u0001\u000bu\"d\u0015QT&";
      f8215[1] = "p5Bj\u0002)p5U6\u000e&j~U(\u000e3m\u000f\u0002qVw:3Z%\u001c3Ad\u0003}W";
      f8215[2] = "\u0014T}B_.\u0014Tj\u001eS!\u000e\u001fj\u0000S4\tn=Y\np";
      f8215[3] = "6K\u0000@0\u00026K\u0017\u001c<\r,\u0000\u0017\u0002<\u0018+qLWe";
      f8215[4] = "\u001fi\u00193gk\u001fi\u000eokd\u0005\"\u000eqkq\u0002S\\/35";
      f8215[5] = double.class;
      f8216[5] = "java/lang/Double";
      f8215[6] = float.class;
      f8216[6] = "java/lang/Float";
      f8215[7] = "l)I\u0007\u001a\u0013l)^[\u0016\u001cvb^E\u0016\tq\u0013\t\u001cNM";
      f8215[8] = int.class;
      f8216[8] = "java/lang/Integer";
      f8215[9] = void.class;
      f8216[9] = "java/lang/Void";
      f8215[10] = "\u0004bX}\u001a~\u0018xZ!\u0000j\b{\u00110\u0004b\u000e~K}\t{\u0002>J:FX\bqS6\fN\u0007uR6\u0006\u007f)qL6";
      f8215[11] = "tB\u0000=s\u0016hX\u0002ai\u0002x[IҾ";
      f8215[12] = boolean.class;
      f8216[12] = "java/lang/Boolean";
      f8215[13] = "7;{3\u0012R+!yo\bF;\"2ț";
      f8215[14] = "b1&:\u0001Z~+$f\u001bNn(ow\u001fFh-5:\u0012_dm4`\u001aC~m\bz\u0003Zy\u00165}\u001f\\";
      f8215[15] = "-NBla1-NU0m>7\u0005U.m+0t\u0007q<a";
      f8215[16] = "r\u0006=\u001c;\u001fn\u001c?@!\u000b~\u001ftQ%\u0003x\u001a.\u001c(\u001atZ<W(\u001eh\u0006?\u001c!\u001fyZ\u0012G-/q\u00117W'\u001e";
      f8215[17] = "R\u001c\u0003S\u0002oR\u001c\u0014\u000f\u000e`HW\u0014\u0011\u000euO&DL_";
      f8215[18] = "c\rxl\u00062\u007f\u0017z0\u001c&o\u00141!\u0018.i\u0011kl\u00157eQm'\u001a#i\r1\u0010\u0011)h\u001am\u0001\u001b)x\u001ag6";
      f8215[19] = "|HL-b$`RNqx0pQ\u0005ɷ";
      f8215[20] = "1?6 \"\u0013-%4|8\u0007=&\u007fm?\u0014;c\"k$\u00127#6 \u0003\u0003*98`7";
      f8215[21] = "B,\u0013cGdI#\u0002,&jB(\u0006v";
      f8215[22] = "\u0014lYA7F\bv[\u001d-R\u0018u\u0010\f*A\u001e0M\n1G\u0012pYA\u0007\\\u0014r[\u000e+`\u001ejJ\u0006+T";
      f8215[23] = "q\"z\u007f\u001b5q\"m#\u0017:kim=\u0017/l\u00189e@";
      f8215[24] = "r7.%Dgy8?j(dw:=%\u0004";
      f8215[25] = "\u0014\u0015;kf\u0004\b\u000f97|\u0010\u0018\fr&x\u0018\u001e\t(ku\u0001\u0012I\u001b){\u0013\u001a\u000b/";
      f8215[26] = "R8\u0000\u001c&'R8\u0017@*(Hs\u0017^*=O\u0002@\u0001|";
      f8215[27] = ">JT\u0016$i5EEYGd C";
      f8215[28] = "\"\u0007@\u000f?i \u0019\tp g9\u0010UO<i#\u0013";
      f8215[29] = "a\u0014)MD&c\n`2[(z\u0003<\rG&`\u0000-";
      f8215[30] = "(Yr}o(4Cp!u<$@;0q4\"Ea}|-.\u0005`:3*.Eq<js$D{'x%3\u0005V<s)\"Sa\u0012~).D{";
      f8215[31] = "\u000epQ\u0006\u0002x\u0005\u007f@I\u007f`\u0016xI\u0000";
      f8215[32] = "eSYfV\u0019yI[:L\riJ\u0010+K\u001eo\u000fX-E\u0018\u007fS[fm*o@J=V\tINP.M\u000b\u007fS_*H\t";
      f8215[33] = "/M1e6:\u0006t-\u007f4f\u001c`=|\u007fw\u001bs;9\"q\u0000u7y6:'d*c8z\u0013:";
      f8215[34] = "&\u001acs}M&\u001at/qB<Qt1qW; $m(";
      f8215[35] = "\u001d\u0018E\r\u0014Y\u0014\u0016FDWT\u0012\u0016RFJRP\u0004QP\rS\u0013\u0004\u0006q\u001cX\u001a\u0012Zp\u0000E\n\u0012E";
      f8215[36] = "+d\u0017Wx\u001a k\u0006\u0018\u0004\u0003/k\u0000T:\u0013";
      f8215[37] = "e/DB=\u0010y5F\u001e'\u0004i6\rӜ";
      f8215[38] = "RB|5,[NX~i6O^[5x1\\X\u001eno7BN\u001eVz*FhDrw-";
      f8215[39] = "I\u0010?rX)\n\u001e=ghv\u001b\\\u001ep\u0001}\u001bL\u001az\u0004e\u0016 y \u0018s\r^<dUgv";
      f8215[40] = "\u001ae\u0015Cd\nJpIA\u0003TNgHKof\u0019!\u0019\u0014<1AbF\u0016x\u000e\u001ekN\u0012\u0003\u000fGwHRaA\u001cpO,";
      f8215[41] = "a\u0011\u000b\t2?d\u0011H\u0019\u0002:hDI\u001eE*\u0001\u0010V\u0014<.?NN\u001cxDa\u0011\u000b\t2?d\u0011H\u0019\u0002";
      f8215[42] = ".a\bmPe9q\u0005RIu8j\u000e>{%}6Ub,!:7\u00065\u0017q/k\u0004R";
      f8215[43] = "NjG)\u0014o\u001ffTrq{J'x,\foJ\u000b=wJdM C2\u000e)Y[";
      f8215[44] = "dK0}'\u001a;O$}HҍTH?#w\u0002)_/.HC3\u00182.8\u0011.\u001c?Bu\u0019nD82'\u0004jIT\u007f/D2N$-2@?\"h>s\u0006n^h3+\u001bT\u001e(y0D(\u001e%!-~=Zl!2N/\u001ch=HB(\u0019,x4B%A1Bv\u001a8B* 8A?ET";
      f8215[45] = "V;\u0015rB#V#\u0004&r Q-$7\u001b5@\u0001\u007fwI?V*\u00012\rrBQ";
      f8215[46] = "1H\u0003z\u0001\rnA\u000b~zW.Um#\u0018PkO\u0010~\u0019W21\u000f9\u0014\b(\u000eP0\u001c\fS";
      f8215[47] = "s.4\u0017ZGwr-R*Oun=\tF}!/cW*\u0010a\"gVNXt-bn";
      f8215[48] = "6\u0011NG\u0010\u0013$WJ[jM>\u0004\u0012H=\u001dgQJ$V_d\u0011LXVR<\f";
      f8215[49] = "A;\u001fD|.Ac\u001e\u0005\u001ceI4\u0012F`r^\u0000\u001eA`~B4\b=yo\u00198NY`z\\+s\u0003xsD%\u0011M#tC[";
      f8215[50] = "d@\u0002:t@4U^8\u0013\u001e0B_2\u007f,g\u0004\u000em({cZS5m\u0019-\u0001T2\u0013";
      f8215[51] = "\u001f/4\u0000\u0011LW:;\u0005)MH*d]E\u007f\u001eg9\u0007)\u0018G1:P\u0017F_9~:\u0017LI6zXY\u0017N1\u0004";
      f8215[52] = "_H\u0017*Rd\u0000L\u0003*=ioM\u001eyXj\r\u0010\u001c%_\u0000\u0003L\u001fpWb^NCw=";
      f8215[53] = "\n$y\u007f\u001dG\u0010.|\"gD\u0001\"dx\u000bvVb>&^!R:h\u007f\u0019C\u001caoxg";
      f8215[54] = "\t;,@&0A.#E\u001e1^>|\u001dr\u0003\t~%K TQ;r@ek\u000e2zD\u001ejW.|\u0004|$\f){z";
      f8215[55] = "\f\u0003x*;mS\u0007l*TfQ\u0016Ct8u\\j .$cG\u0014ejiw<";
      f8215[56] = "\u0003\u0003V\"`U\u0014\u0013[\u001dyE\u0015\bPqK\u0015PT\n%\u001c\u0011\u0003\u0016Q zE\u0010RS\u001d";
      f8215[57] = "JX<j}R\u0015\\(j\u0012Y\u0017M\u00188sY\u001aMXi)F\u0010J&,m\u000b\u00041";
      f8215[58] = "b[O\u001ea3p\u001dK\u0002\u001bmjN\u0013\u0011L=1\u0019O}'\u007f0[M\u0001'rhF";
      f8215[59] = "duW\u0006\u001aC~\u007fR[`@osJ\u0001\fr93\u0015ZZ%<kF\u0006\u001eGr0A\u0001`";
      f8215[60] = "j8@\u0005\u001fc:-\u001c\u0007x=>:\u001d\r\u0014\u000fi|LREXo:F\u0012B$o7\u001e\u000fxd/}\u0005P\u0004d\"%\u0018jD$h>G\u0016D)0#}T\u001c438\u001f\u001aG34F";
      f8215[61] = "066\u0018Y,\"p2\u0004#r8#j\u0017t\"cs?{\u001f`b64\u0007\u001fm:+";
      f8215[62] = "\u0001Qlq\u0014?CJ-+uɽy\u0017';\u001f:\u0007Rcv\u000bA";
      f8215[63] = "*\u001cC\\y\u00132N\u0001D\u0017\u0000NF\u0002K{\u001d7RB\u0005/,*[\nV&U>\u001bD\u0002\u0017";
      f8215[64] = "I'YKY\u000fI?H\u001fi\fN1h\u000e\u0000\u0019_\u001c3NR\u0013I6M\u000b\u0016^]M";
      f8215[65] = "B:\u0001aP\u0019Ff\u0018$ \u0011Dz\b\u007fL#\u0010;U! \u001f\u0015o\u0011hM\u001bIvT\u0018";
      f8215[66] = "^$x\bm[Lb|\u0014\u0017\u0005V1$\u0007@U\rl{k+\u0017\f$z\u0017+\u001aT9";
      f8215[67] = "\u0012&6%hQM/>!\u0013\u0014\u0017#1c~>pc$$kT\fc)|vn\u0012&6%hQM/>!\u0013";
      f8215[68] = "I.\u0015:7\u000b\u0019;I8PU\u001d,H2<gJj\u0019ml0LkX?+N\t/\u0015+P\fK B..I\u000fmVUl\u000b\u0000:S+)OM.(k4\\\u0010.J%o[\u0017P";
      f8215[69] = "6\u0013\u0006/'\u0011i\u0017\u0012/Hɥ\u0006\u0010\tqw\t{\u0007\u0019|HHa@\u0004|8\u001a|D\t\u0010u\u0012<\u001c\u000e`'\u000f8\u0011b-/O`\u0016\u0012\u007f2Kmz\u0000i&O}E_`.K\u0006\u0018\u001b~r\u000e9G\u0012vvuo\u0002Zs2E}D^oHIzA\u001a*4Iw\u0019\u0007\u0010v\u0011j\u001a\u001cr8Jm\u001db";
      f8215[70] = "4D?ry\u001a6G,h\u001dF?+90tZ$F=lm\u001f";
      f8215[71] = "#J'v\u0012c'\u0016>3b`)\u001b*c57wKs\u000f\u0003ctJus\u0005|8\u0011";
      f8215[72] = "\u0006\u0001^@/^\u0014GZ\\U\u000b\u0002\u0005\u0006D99TGZ\u001ehnS\u0005][o\u0012S\b\u0005FU";
      f8215[73] = "\u0003P\u0003tX\u001d\\T\u0017t7ϗ3\u0005\\;]\u0002M@\u0018vI";
      f8215[74] = "v_AfF\u0015d\u0019Ez<K~J\u001dik\u0018.\u0017C\u0005\u0000Y$_Cy\u0000T|B";
      f8215[75] = "c\u0010Tr\t={\u001fAko$y\tcm!7b\u0004[\u0016\u0017<h\u0010\u0011xT4x\u0001*(\u000b2d\u0011HfP5co";
      f8215[76] = "# U=\u0012\u001ba;\u0014gsυ[f\u001ew\u0019\u001e%#Z:\re";
      f8215[77] = "\u000fqf2W\u0015Hmil*B\u0012`ls*\u0015MycpTP\t4w\u000b\u0016\u0012\u0006cruSVKw\t7\u0011Y\u001crwrU\u0014\b\t50ZC\rwpt\u0017Wv";
      f8215[78] = "tf\u000b%{\u000e+b\u001f%\u0014ѡD?\r}*\u0000za\u0015un";
      f8215[79] = "Cbn6I;\bdb?sիr<nl\u0015g\u0002nsh\u0018\u000b";
      f8215[80] = "~&~\u0016}>vqc\u0018\u001c1`vbx clu\u007f\u0006e'!a\u0004D'(vdz\u0001ceb\u001f";
      f8215[81] = "D2\u001c\f'1\u000f4\u0010\u0005\u001dɘul\u001cV{m\u0005>\u0001Rv\u0001";
      f8215[82] = "wi{qc-(moq\fɥG<$>f29y`sr";
      f8215[83] = "{5\u0016>\u0005\u001cis\u0012\"\u007fI\u007f1N:\u0013{)s\u0012`@,.1\u0015%EP.<M8\u007f\u0012v!N#\u001d\\-&I]";
      f8215[84] = "|!\u0016NU\u0003,4JL2](#KF^o\u007fe\u001a\u0019\u00038{;GALZ5`@F2";
      f8215[85] = "J\u0000\u0019\u0010\u0016b\u001b\u001bXJx3[\u000eY\u0016\u00197ZgK\u001d\u0019c]\u001a\\\r\u0014\\";
      f8215[86] = "&.X'H`w\"K|-t\"cg\"P`\"N\"y\u0016k%d\\<R&1\u001f";
      f8215[87] = "\u001c>}\u0001O\u0018M%<[!^\u001e#9\u0006HB+8.\u0004Z&K%~\u001f\u001bZK(&\u0002!";
      f8215[88] = "2Y\u0005fO\u001fdTN}4\u001f2LjnP\r20Z?^HoOJuZ\f_";
      f8215[89] = "=kkp<\u000f~eie\fPo'Jre[o7QtmPb'\u0011%7Oh o`s\u0002|[";
      f8215[90] = "\u001adeo*DE`qoEҘ*cm 4QDo`ox";
      f8215[91] = "w69D%M?#6A\u001dL 3i\u0019q~v~4N\u001d\u0019/(7\u0014#G7 s~";
      f8215[92] = "\u0013r\u0004A0\u0002\u001ew\u0005@]\u001c\u0011m\\H1.B(\u0006\u001f]I\u001ev\u0002Ec\u0017\u0006~F/";
      f8215[93] = ">0*1^m) '\u000eG}(;,bu-mgv4\".07+p@`k0,\u000e";
      f8215[94] = " Tt_\u0006\u0015%T7O6\u0004'\u0002/H_\b\u001e\f/X[np\u0007,\u001b\\P.\u001f$_6";
      f8215[95] = "\u0016u9\u001dLH\u00043=\u00016\u0016\u001e`e\u0012aFE18~\n\u0004Du;\u0002\n\t\u001ch";
      f8215[96] = "/`3x\b\u0014pi;|sQ*e4>\u001eyM%!y\u000b\u00111%,!\u0016+/`3x\b\u0014pi;|s";
      f8215[97] = "8HE!_w*\u000eA=%\"<L\u001d%I\u0010j\u000eA\u007f\u001bGmLF:\u001f;mA\u001e'%y5\\\u001d<G7n[\u001aB";
      f8215[98] = "o~\u0016\u001b^\u00100w\u001e\u001f%Dja\u001a\\JFqjxC\\A7|G\u001cUI3\u0007";
      f8215[99] = "/D594a+\u0018,|Db%\u00158,\u00135{B`@+o|\u00161;&j}\u0017";
      f8215[100] = "I`3E\u001d([&7Yg}MdkA\u000bO\u001b&7\u001b[\u0018\u001cd0^]d\u001cihCg";
      f8215[101] = "n=?\u001b\u0000\u0014&(0\u001e8\u001598oFT'ou3\u00118@6#1K\u0006\u001e.+u!\u0006\u00148$qCHO?#\u000f";
      f8215[102] = "\u00172>\\Ab_'1Yyc@7n\u0001\u0015Q\u0016z3Zy=\u0014+lZ@`M54fE=]!u\u0018\u0000y\u00105\u000eZBvG0p\u001f\u0006;SK2]\tlV5w\u0019Dx-wr]\u0001<Qw\u007f\u0005\u001c\u0006\u001175\u001eCz\u0011:m\u0003y?Sva\u0001BoF*cfE{Tr7\u0001\u0017jJ+\u000e[\u001e<K'~\t\u00038FK0\u0002\u0015fS)~Y\u0012a-";
   }

   public static Class m274(long var0, long var2) {
      Class var5 = null;
      int var4 = m272(var0, var2);
      Object var6 = f8215[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8216[var4]);
            f8215[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m275(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m276(Class var0, String var1, Class var2) {
      Field var3 = m275(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m276(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m277(long var0, long var2) {
      int var4 = m272(var0, var2);
      Object var5 = f8215[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8216[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m274(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m274(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m275(var12, var10, var11);
            if (var13 != null) {
               f8215[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m276(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8215[var4] = var13;
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
               var12 = m274(1524261894800681L, 0L);
            }
         }
      }
   }

   public static Method m278(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m279(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m278(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m279(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m280(long var0, long var2) {
      int var4 = m272(var0, var2);
      Object var5 = f8215[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8216[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m274(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m274(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m278(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f8215[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m274(1524261894800681L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m279(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f8215[var4] = var19;
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
               var23 = m274(1524261894800681L, 0L);
            }
         }
      }
   }

   public static MethodHandle m281(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 253 && var8 != 't' && var8 != 'q' && var8 != 255) {
            var11 = m280(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 233) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 217) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m277(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 253) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 't') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'q') {
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

   public static Object m282(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m281(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m671(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(PlayerView.class, "m282", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ҭ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
