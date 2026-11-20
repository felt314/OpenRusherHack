package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.io.File;
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
import org.rusherhack.client.api.feature.hud.ResizeableHudElement;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.graphic.TextureGraphic;
import org.rusherhack.core.logging.ILogger;
import org.rusherhack.core.utils.StringUtils;

public class Class124 extends ResizeableHudElement {
   public int f2577;
   public int f2578;
   public TextureGraphic f2579;
   public static Class124 f2580;
   public static File f2581;
   public static long f2582 = Class066.m4320(3460157583928667875L, 4440532787024565597L, MethodHandles.lookup().lookupClass()).m4325(162736747007657L);
   public static String[] f2583;
   public static String[] f2584;
   public static Map f2585 = new HashMap(13);
   public static long[] f2586;
   public static Integer[] f2587;
   public static Map f2588;
   public static Object[] f2589 = new Object[47];
   public static String[] f2590 = new String[47];

   @Override
   public double getWidth() {
      long var1 = f2582 ^ 52733078486697L;
      return ((org.rusherhack.client.api.feature.hud.impl.Class124)(this)).f2577 / 2.0F;
   }

   public TextureGraphic m5807() {
      long var1 = f2582 ^ 17699185921278L;
      int var3 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "J", java.lang.invoke.MethodType.methodType(int.class, long.class, long.class)), 7229178602405363257L,  var1))).intValue();
      TextureGraphic var10000 = ((org.rusherhack.client.api.feature.hud.impl.Class124)(this)).f2579;
      if (var3 == 0) {
         if (var10000 == null) {
            ((org.rusherhack.client.api.feature.hud.impl.Class124)(this)).m5808();
         }

         var10000 = ((org.rusherhack.client.api.feature.hud.impl.Class124)(this)).f2579;
      }

      return var10000;
   }

   @Override
   public double getHeight() {
      long var1 = f2582 ^ 69028425315086L;
      return ((org.rusherhack.client.api.feature.hud.impl.Class124)(this)).f2578 / 2.0F;
   }

   static {
    }

   public void m5808() {
      long var1 = f2582 ^ 129831387589994L;
      Class124 var3 = this;

      try {
         int var10002 = m175(17843, 8645993332317358060L ^ var1);
         ((org.rusherhack.client.api.feature.hud.impl.Class124)(var3)).f2577 =  m175(21115, 1666976658156720165L ^ var1);
         ((org.rusherhack.client.api.feature.hud.impl.Class124)(var3)).f2578 =  var10002;
         org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "K", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, org.rusherhack.client.api.render.graphic.TextureGraphic.class, long.class, long.class)), 
            var3, 
            new TextureGraphic(
               ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "J", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), m172(27237, 1025558764972258187L ^ var1),  416245285921229163L,  var1))),
               ((org.rusherhack.client.api.feature.hud.impl.Class124)(var3)).f2577,
               ((org.rusherhack.client.api.feature.hud.impl.Class124)(var3)).f2578
            ), 
            416496687078861678L, 
            var1
         );
      } catch (Throwable var4) {
         ILogger var10000 = ((org.rusherhack.core.logging.ILogger)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "ß", java.lang.invoke.MethodType.methodType(org.rusherhack.core.logging.ILogger.class, java.lang.Object.class, long.class, long.class)), this,  417067793777315363L,  var1)));
         String var10001 = ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "J", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), m172(20483, 4015131475476449772L ^ var1),  415873087263884878L,  var1)));
         boolean var10004 = true;
         org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "ß", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var10000,  var10001,  new Object[]{var4},  416578225921665783L,  var1);
         org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "K", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, org.rusherhack.client.api.render.graphic.TextureGraphic.class, long.class, long.class)), this,  null,  416496687078861678L,  var1);
      }
   }

   @Override
   public void renderContent(RenderContext var1, double var2, double var4) {
      long var6 = f2582 ^ 132995175007998L;
      int var8 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "J", java.lang.invoke.MethodType.methodType(int.class, long.class, long.class)), 3340613690055144041L,  var6))).intValue();
      Class124 var10000 = this;
      if (var8 != 0) {
         if (((org.rusherhack.client.api.feature.hud.impl.Class124)(this)).f2579 == null) {
            org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "J", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), 
               ((org.rusherhack.core.notification.NotificationType)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "W", java.lang.invoke.MethodType.methodType(org.rusherhack.core.notification.NotificationType.class, long.class, long.class)), 3340863479859389320L,  var6))), 
               m172(27409, 8607706780139886957L ^ var6)
                  + ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "º", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.command.Class291)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "ß", java.lang.invoke.MethodType.methodType(org.rusherhack.command.Class291.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Class170)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "W", java.lang.invoke.MethodType.methodType(org.rusherhack.Class170.class, long.class, long.class)), 3340806868415823224L,  var6))),  3337929285142655867L,  var6))),  3340620541497963535L,  var6)))
                  + m172(21797, 4713235782177498972L ^ var6), 
               3337702608067421872L, 
               var6
            );
            org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "ß", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), this,  3337827565581175617L,  var6);
            return;
         }

         var10000 = this;
      }

      org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "ß", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, double.class, double.class, double.class, double.class, long.class, long.class)), 
         ((org.rusherhack.client.api.render.IRenderer2D)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "ß", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.render.IRenderer2D.class, java.lang.Object.class, long.class, long.class)), var10000,  3337212393768241270L,  var6))), 
         ((org.rusherhack.client.api.feature.hud.impl.Class124)(this)).f2579, 
         0.0, 
         0.0, 
         ((java.lang.Double)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "ß", java.lang.invoke.MethodType.methodType(double.class, java.lang.Object.class, long.class, long.class)), this,  3337268625663712667L,  var6))).doubleValue(), 
         ((java.lang.Double)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "ß", java.lang.invoke.MethodType.methodType(double.class, java.lang.Object.class, long.class, long.class)), this,  3338057693362033544L,  var6))).doubleValue(), 
         3337422071454168008L, 
         var6
      );
   }

   public Class124() {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23587;
      if (f2584[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f2585.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f2585.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/Ė", var10);
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
         byte[] var9 = f2583[var5].getBytes("ISO-8859-1");
         f2584[var5] = m221(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f2584[var5];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class124.class, "m173", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ė" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18320;
      if (f2587[var3] == null) {
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
         long var5 = f2586[var3];
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
         Object[] var9 = (Object[])f2588.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f2588.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ė", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f2587[var3] = var15;
      }

      return f2587[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class124.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ė" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m272(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f2590[var4] != null) {
         return var4;
      } else {
         Object var5 = f2589[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 59;
               case 1 -> 3;
               case 2 -> 57;
               case 3 -> 26;
               case 4 -> 58;
               case 5 -> 56;
               case 6 -> 4;
               case 7 -> 6;
               case 8 -> 35;
               case 9 -> 27;
               case 10 -> 46;
               case 11 -> 7;
               case 12 -> 2;
               case 13 -> 0;
               case 14 -> 45;
               case 15 -> 51;
               case 16 -> 14;
               case 17 -> 34;
               case 18 -> 32;
               case 19 -> 16;
               case 20 -> 54;
               case 21 -> 29;
               case 22 -> 17;
               case 23 -> 39;
               case 24 -> 10;
               case 25 -> 52;
               case 26 -> 22;
               case 27 -> 21;
               case 28 -> 44;
               case 29 -> 37;
               case 30 -> 30;
               case 31 -> 60;
               case 32 -> 49;
               case 33 -> 11;
               case 34 -> 15;
               case 35 -> 62;
               case 36 -> 40;
               case 37 -> 20;
               case 38 -> 18;
               case 39 -> 53;
               case 40 -> 63;
               case 41 -> 24;
               case 42 -> 8;
               case 43 -> 19;
               case 44 -> 50;
               case 45 -> 47;
               case 46 -> 33;
               case 47 -> 36;
               case 48 -> 43;
               case 49 -> 13;
               case 50 -> 9;
               case 51 -> 23;
               case 52 -> 55;
               case 53 -> 41;
               case 54 -> 12;
               case 55 -> 42;
               case 56 -> 28;
               case 57 -> 38;
               case 58 -> 31;
               case 59 -> 48;
               case 60 -> 1;
               case 61 -> 5;
               case 62 -> 25;
               default -> 61;
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

            f2590[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m273() {
      f2589[0] = "!\u0006\u001d+$z=\u001c\u001fw>n-\u001fTē";
      f2589[1] = int.class;
      f2590[1] = "java/lang/Integer";
      f2589[2] = "\u000eau\u001eU\t\u0012{wBO\u001d\u0002x<SH\u000e\u0004=|_S\u0015\u0007zqQS\u0015\u000e}<~H\b\bu{SF\b\b||d^\f\u0004";
      f2589[3] = "G5hm\u001ey[/j1\u0004mK,!ȇ";
      f2589[4] = "n\u001eP\u000f]{e\u0011A@ cv\u0016H\t";
      f2589[5] = "x\u0017{\u0012D|d\ryN^ht\u000e2Ⱥ";
      f2589[6] = ")a-\u000f]B5{/SGV%xdŊ";
      f2589[7] = double.class;
      f2590[7] = "java/lang/Double";
      f2589[8] = "v\u0002Kv\r8j\u0018I*\u0017,z\u001b\u0002;\u0013$|\u001eXv\u001e=p^^=\u0011)|\u0002\u0002?\r,i\u0018E;Q\u0019|\bX-\r(^\u0002M(\u0017$z";
      f2589[9] = "x6tL\u00064d,v\u0010\u001c t/=\u0001\u0018(r*gL\u00151~ju\u0007\u00155b6vL\u001c4sj[\u0017\u0010\u0004{!~\u0007\u001a5";
      f2589[10] = void.class;
      f2590[10] = "java/lang/Void";
      f2589[11] = ".3\u000e1B\u001c2)\fmX\b\"*G|\\\u0000$/\u001d1Q\u0019(o;jC\u0001$3!~S\u0002\u0000\u0011 ";
      f2589[12] = ":pIPIr&jK\fSf6i\u0000Ȋ";
      f2589[13] = "\"E%\u0019i[>_'EsO.\\lTwG(Y6\u0019z^$\u00190RuJ(El~IK#S'EzL!Rps";
      f2589[14] = "DW\u0005!7\u0013XM\u0007}-\u0007HNLl)\u000fNK\u0016!$\u0016B\u000b\u0010j+\u0002NWLF\u0017\u0003EA\u0007} \u0014\u0019a";
      f2589[15] = "#Ch\u0013-j?YjO7~/Z!^3v)_{\u0013>o%\u001f}X1{)C!Z-~<Yf^qV\u000bCnM7v/";
      f2589[16] = "}Goq~ra]m-dfq^&<cuw\u001bd0k`{[oqEK}Ro:~";
      f2589[17] = "um\r`\u0002\niw\u000f<\u0018\u001eytD-\u001f\r\u007f1\u0006!\u0017\u0018sq\r`93ux";
      f2589[18] = "\u0010o!\t'\u001eeO*\u00066Q\u0004A!\r2\u000bp";
      f2589[19] = "x D*jBd:FvpVt9\rgt^r<W*yG~|EayCb F*{Xz?Bj|\u0019v D*Z[x1HV}Qr Fj{R";
      f2589[20] = "X}\t\u0015\u001d\u0011Dg\u000bI\u0007\u0005Td@X\u0000\u0016R!\u001bO\u0006\bD!=O\u001d\rYh;O\u0006\bD";
      f2589[21] = "\tI>\u000b \r\u0015S<W:\u0019\u0005Pwν";
      f2589[22] = "\u0001qfM>/\u0004>VE|#";
      f2589[23] = "Z>\u000fXX\u0003Q1\u001e\u00179\rZ:\u001aM";
      f2589[24] = "^\t\u0007nX\u007fQ\f\u0012u τ3\u001e[7^$B\tU~Z";
      f2589[25] = "e\u0011s\u0002YU&M%Wgb\u0005r_fg\u0015fC&\u0002\u001dV:\u0015s";
      f2589[26] = "3mqDB/)e0uЍ\u0013nes\u0017^i2 4\u000f";
      f2589[27] = "yTL\u007f\u001a46]N%y!*Gxx\u0016!*A<u\u001f*x_Rz\u0003s5;";
      f2589[28] = "X<\u0019P\bjX<\t[tƮb~\u0007E\u000e~\u00199\t\u000e\u0018";
      f2589[29] = "WJ\u0000}G/\u0017B\u0003z+յl\n[\"Iy\u0016V\u001eeQ\u0015";
      f2589[30] = "{rU-q\u0012*hJ\u007f\nωG-K9c\f\"|Q&1";
      f2589[31] = "\u0013xkt\u0006s\tp*EǛOHs0%\u000e*\u0011s3zv";
      f2589[32] = "\u001663#\u001f\u001bV>0$sɸ-vh|\u0011MW*-;\t!";
      f2589[33] = "\u001cX\ru%\u0001\u0006PLD:P\u0004(_%:]\u0004h\u000ft4C\u0017\u0007Y'2_x";
      f2589[34] = "f<9|.Mw/ejNEw)>jN\u0012|)#z5Urb5\u0010%Rr5c`\u007fJf0Y/uLm+<vuO2S";
      f2589[35] = "Gg|dUE]o=UԻy\u001dk\u007f-_\u0012^0!%";
      f2589[36] = "I\u0013rCz\u0013\u0006\u001ap\u0019\u0019\u0015\u0010\u0013mGtiHGfCa\f\u0011Ge\u001c\u0019";
      f2589[37] = "&Bk\u0007rY<J*6Ϝe&Bk\u0007rY<J*";
      f2589[38] = "+w\u001fh\u0017M \"\b*yXGs\u0017n\u0003\u001e<4\u0019%\u0015t}8\u001cn\u0013\u000f:6Wxy";
      f2589[39] = "6\u0005]og\u0017g\u001fB=\u001cҘ\n\\Xis\u000et\\Xyxr";
      f2589[40] = "ax\u0011r\u001e\u0001wa\u001c.dB\r0\f0\u001e\u0004vw\u0002{\bn7{\u00070\u000e\u0015puL&d";
      f2589[41] = "SV4O\u0002\\I^u~Ŏ`\u000e^6\u001c\u001e\u001aR\u001bq\u0004";
      f2589[42] = "\t<dm\u0014YIfc-jO[=w\u001a\rHW5z7\u0003HW<}\\P\r]e%&\u0013Q\u000b0\u001bf\u001bNL1`!\u0015\u0005Z[$g\u000eTN>}g\r\u000b6";
      f2589[43] = "\u001d+zI$p\u0007#;x=LIb=\t+%Ex&\u0019T|\u0000c4\u0007=p\u001ax$x";
      f2589[44] = "u\u0016hd5\u0012o\u001e)U*Cmy699N\u0011\u001bg4;A~M42'.";
      f2589[45] = "3zXQ\u001e\u007f{~\u0006\u000b&hof8^@ko`\u000fI&n;s\u001fN[zf+]3";
      f2589[46] = "szXiy\u0011g'\u0000+\u0004\u0000`*N[~\u0005b#P\u007f^\u0001q?Xrk\bwCXun\u0005 sI~=\u000f\u001a~\u0001uz\u0003u(Rsfl'sPjk\u0003q Vv\u0004Q*\"O{k\u0007y$S\u00149\\{=^{o\u000f}!1+?\bz;Tr?\u000b%C";
   }

   public static Class m274(long var0, long var2) {
      Class var5 = null;
      int var4 = m272(var0, var2);
      Object var6 = f2589[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f2590[var4]);
            f2589[var4] = var5;
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
      Object var5 = f2589[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f2590[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m274(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m274(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m275(var12, var10, var11);
            if (var13 != null) {
               f2589[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m276(var14[var15], var10, var11);
                  if (var13 != null) {
                     f2589[var4] = var13;
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
               var12 = m274(1670162276832031L, 0L);
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
      Object var5 = f2589[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f2590[var4];
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
               f2589[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m274(1670162276832031L, 0L);
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
                     f2589[var4] = var19;
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
               var23 = m274(1670162276832031L, 0L);
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
         if (var8 != 186 && var8 != 'K' && var8 != 'W' && var8 != 229) {
            var11 = m280(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 223) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'J') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m277(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 186) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'K') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'W') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class124.class, "m282", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ė" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
