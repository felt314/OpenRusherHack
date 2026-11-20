package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

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
import java.util.function.BooleanSupplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.rusherhack.client.api.feature.hud.ResizeableHudElement;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.command.argument.StringCapture;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

public class Enum355 extends ResizeableHudElement {
   public EnumSetting<Obf355F5752> f5752;
   public static Identifier f5753;
   public ColorSetting f5754;
   public static long f5755 = Class066.m4320(-3762176314802511228L, 5970767182439967384L, MethodHandles.lookup().lookupClass()).m4325(175037009473912L);
   public static String[] f5756;
   public static String[] f5757;
   public static Map f5758 = new HashMap(13);
   public static long[] f5759;
   public static Integer[] f5760;
   public static Map f5761;
   public static Object[] f5762 = new Object[83];
   public static String[] f5763 = new String[83];

   @Override
   public double getHeight() {
      long var1 = f5755 ^ 81511788939593L;
      return ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "Ë", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), 
            (Obf355F5752)((java.lang.Object)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "Ë", java.lang.invoke.MethodType.methodType(java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.core.setting.EnumSetting)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "À", java.lang.invoke.MethodType.methodType(org.rusherhack.core.setting.EnumSetting.class, java.lang.Object.class, long.class, long.class)), this,  -2618953353818894606L,  var1))),  -2619411570745827847L,  var1))), 
            ((org.rusherhack.Obf355F5752)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "û", java.lang.invoke.MethodType.methodType(org.rusherhack.Obf355F5752.class, long.class, long.class)), -2613740706734415759L,  var1))), 
            -2619044135729417917L, 
            var1
         ))).booleanValue()
         ? 76.0
         : 54.0;
   }

   @Override
   public void postRender(RenderContext var1, double var2, double var4) {
        
    }

   @Override
   public void renderContent(RenderContext var1, double var2, double var4) {
   }

   static {}

   @Override
   public double getWidth() {
      long var1 = f5755 ^ 100126418109678L;
      return ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "Ë", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), 
            (Obf355F5752)((java.lang.Object)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "Ë", java.lang.invoke.MethodType.methodType(java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.core.setting.EnumSetting)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "À", java.lang.invoke.MethodType.methodType(org.rusherhack.core.setting.EnumSetting.class, java.lang.Object.class, long.class, long.class)), this,  -3026266122293705899L,  var1))),  -3025598439249833890L,  var1))), 
            ((org.rusherhack.Obf355F5752)(org.rusherhack.ZkmDispatch.invoke(m671(java.lang.invoke.MethodHandles.lookup(), "û", java.lang.invoke.MethodType.methodType(org.rusherhack.Obf355F5752.class, long.class, long.class)), -3018201616723350058L,  var1))), 
            -3026322132164723484L, 
            var1
         ))).booleanValue()
         ? 176.0
         : 162.0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22136;
      if (f5757[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f5758.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f5758.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/ʶ", var10);
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
         byte[] var9 = f5756[var5].getBytes("ISO-8859-1");
         f5757[var5] = m221(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f5757[var5];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Enum355.class, "m173", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʶ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10818;
      if (f5760[var3] == null) {
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
         long var5 = f5759[var3];
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
         Object[] var9 = (Object[])f5761.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f5761.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ʶ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f5760[var3] = var15;
      }

      return f5760[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Enum355.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʶ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m272(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5763[var4] != null) {
         return var4;
      } else {
         Object var5 = f5762[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 35;
               case 1 -> 41;
               case 2 -> 9;
               case 3 -> 40;
               case 4 -> 36;
               case 5 -> 62;
               case 6 -> 60;
               case 7 -> 34;
               case 8 -> 14;
               case 9 -> 32;
               case 10 -> 29;
               case 11 -> 1;
               case 12 -> 33;
               case 13 -> 7;
               case 14 -> 10;
               case 15 -> 55;
               case 16 -> 39;
               case 17 -> 27;
               case 18 -> 6;
               case 19 -> 45;
               case 20 -> 24;
               case 21 -> 31;
               case 22 -> 23;
               case 23 -> 50;
               case 24 -> 26;
               case 25 -> 3;
               case 26 -> 57;
               case 27 -> 19;
               case 28 -> 44;
               case 29 -> 20;
               case 30 -> 37;
               case 31 -> 59;
               case 32 -> 8;
               case 33 -> 56;
               case 34 -> 21;
               case 35 -> 13;
               case 36 -> 52;
               case 37 -> 58;
               case 38 -> 48;
               case 39 -> 47;
               case 40 -> 2;
               case 41 -> 30;
               case 42 -> 51;
               case 43 -> 22;
               case 44 -> 15;
               case 45 -> 16;
               case 46 -> 5;
               case 47 -> 49;
               case 48 -> 17;
               case 49 -> 63;
               case 50 -> 0;
               case 51 -> 11;
               case 52 -> 46;
               case 53 -> 4;
               case 54 -> 42;
               case 55 -> 43;
               case 56 -> 28;
               case 57 -> 53;
               case 58 -> 25;
               case 59 -> 54;
               case 60 -> 61;
               case 61 -> 38;
               case 62 -> 18;
               default -> 12;
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

            f5763[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m273() {
      f5762[0] = "\u000f\b*<[\u0018\u0013\u0012(`A\f\u0003\u0011cԃ";
      f5762[1] = "_\u007fN\u0016\u001duTp_Y|{_{[\u0003";
      f5762[2] = boolean.class;
      f5763[2] = "java/lang/Boolean";
      f5762[3] = "j bR1\u0018v:`\u000e+\ff9+ˊ";
      f5762[4] = "Pt#=sBLn!aiV\\mjpnEZ(7vuCVh#=DYJk\u0017vuCVh#";
      f5762[5] = "4?K\u00184\u0011(%ID.\u00058&\u0002ɂ";
      f5762[6] = "\u0013\u001bxHM\u0002\u000f\u0001z\u0014W\u0016\u001f\u00021\u0005P\u0005\u0019Gl\u0003K\u0003\u0015\u0007xHl\u0012\b\u001dv\bX";
      f5762[7] = "\f89\u000f\\\u000b\u00077(@1\u000b\u0007*<";
      f5762[8] = ":\u0013T'/K1\u001cEhBK1\u0001Q\nnF4\u0017P";
      f5762[9] = "\u001a<\u0000\\TO\u001a<\u0017\u0000X@\u0000w\u0017\u001eXU\u0007\u0006EB\b\u0017";
      f5762[10] = void.class;
      f5763[10] = "java/lang/Void";
      f5762[11] = "~-uY\u0003Fb7w\u0005\u0019Rr4<\u0014\u001dZt1fY\u0010Cxqg\u001e_Dx1v\u0018\u0006\u001dF6|\u0013\u001eDR0|\u0003\u0014]e\u0017s\u0019\u0015_t-P\u0016\u0002V";
      f5762[12] = "K4x\u0014xV@;i[\u0005NS<`\u0012";
      f5762[13] = ";5I\u0000`%;5^\\l*!~^Bl?&\u000f\u000f\u0017;|";
      f5762[14] = "PAyp\u001aySO!SMc_bzwRrH";
      f5762[15] = "\u000ep9p9^\u0012j;,#J\u0002ip='B\u0004l*p*[\b,\u00192$I\u0000n-";
      f5762[16] = "\u0018x3c\u0017}\u0018x$?\u001br\u00023$!\u001bg\u0005Bt|J";
      f5762[17] = "\u0013ZOqtn\u0018U^>\u000ej\u000bTNq8n\u001c";
      f5762[18] = "\u000fk3`\u0017-\u0013q1<\r9\u0003rz-\t1\u0005w `\u0004(\t7!:\f4\u00137\u0016;\u0003>\u0005k\u0001:\f4\u0013";
      f5762[19] = "M\u000brNO3Q\u0011p\u0012U'A\u0012;\u0003R4GWv\u000fP+C\u0017qN\\4E\fx\u0005S2\f*a\u0012T(E:t\u0010I3P\u001c";
      f5762[20] = "\u000b(\rE\u001b0\u000b(\u001a\u0019\u0017?\u0011c\u001a\u0007\u0017*\u0016\u0012H[@i";
      f5762[21] = "\u0018\u0019D\u001aQ|\u0018\u0019SF]s\u0002RSX]f\u0005#\u0001\u0004\b&";
      f5762[22] = "\u001c.h>N\u0000\u00004jbT\u0014\u00107!Ȗ";
      f5762[23] = int.class;
      f5763[23] = "java/lang/Integer";
      f5762[24] = "AAb$\u0017P][`x\rDMX+ɡ";
      f5762[25] = "`7eOq,`7r\u0013}#z|r\r}6}\r%T.r";
      f5762[26] = float.class;
      f5763[26] = "java/lang/Float";
      f5762[27] = "{\n=9T_g\u0010?eNKw\u0013ttJCq\u0016.9GZ}V)rR^}\u0016=9eEx\u0017(DC^`\u00114p";
      f5762[28] = "\u001d!O#nc\u0001;M\u007ftw\u00118\u0006nsd\u0017}Nh}b\u0007!M#UP\u00172\\xns1<Fkuq\u0007!Iops";
      f5762[29] = "\\1<SIsu\b IK/o\u001c0J\u0000>h\u000f6\u000f]8s\t:OIsT\u0018'UG3`F";
      f5762[30] = "1K^h\u000b4/CD'C45I\\`J/uhGfI$:D{|U17CM{";
      f5762[31] = "u)q6xkh<)\u00149fp:";
      f5762[32] = "\u001eOzq\b\u0006\u001eOm-\u0004\t\u0004\u0004m3\u0004\u001c\u0003u?h\\V";
      f5762[33] = "l\u001aonJqp\u0000m2Pe`\u0003&#Tmf\u0006|nYtjFz%V`f\u001a&\tjam\fm2]v1,";
      f5762[34] = "kj*~\u001b\u0006wp(\"\u0001\u0012gsc3\u0005\u001aav9~\b\u0003m6?5\u0007\u0017ajc6\u0006\u001dp6\u0004\u0016\u0006\u001dpJ(>\r\u0016v}?";
      f5762[35] = "Yci&SVYc~z_YC(~d_LDY*<\b";
      f5762[36] = "3Y\u0002 _%3Y\u0015|S*)\u0012\u0015bS?.cG8\u0004}";
      f5762[37] = "\u0004\tW\"F \u0018\u0013U~\\4\b\u0010\u001eoX<\u000e\u0015D\"U%\u0002UBiZ1\u000e\t\u001e^Q;\u000f\u001eBO[;\u001f\u001eHx";
      f5762[38] = "2:vDX?. t\u0018B+>#?\tF#8&eDK:4fw\u000fK>(:tDB?9fY\u001fN\u000f1-|\u000fD>";
      f5762[39] = "a6u+Ln},wwVzm/<fRrk*f+_kgj``P\u007fk6<Ll~` ww[i";
      f5762[40] = "\u0012AA<G~\u000e[C`]j\u001eX\bqYb\u0018]R<T{\u0014\u001dTw[o\u0018A\b[gn\u0013WC`Ti\u0011V\u0014V";
      f5762[41] = "m %D\u0002k+'eViΦW{r]\u0010f4%#\u0004\n\u00176$s]Yvi!qCivhvx\u000b\b)mtf;\u0006x%qz[Y+oy\u001e\u0004\n.=vyP\u0017}g\u001b";
      f5762[42] = "0\u007f:\u007f$}4m1=KЉ_o?f27<1n?(F:h*<!($6-<K)0}9d+vc71\u0000$)-e7`{zgmS?(\u007f5b4k5,o\u000f";
      f5762[43] = ",XD\u0017\u0004\u000f\u007f\u000fI\u0002>ԝBPW\u000fT\u0019\"\u000f\u0004E\\}";
      f5762[44] = "#T\\900 X\u00176[dyUU?[0~\u000bD?<dcX\u001eR";
      f5762[45] = "Ga|'z\u001d\u00146q2@ȶ)io?*\u000bI6<u\"o";
      f5762[46] = "eoc\u001dySa}h_\u0016ʄ\n.l\u001fw\u0019hd7_-hjsl\u001bg\u000b4\"5\u0001\u0016\t5rlRwV0prbwWgy:\u0003(Reg\n\u0003)\u0005l/k\\,\u0007r\u001fk]{\u000e:~4Xy\u0010\n~5\u000fpXk!0\rnhk g\u0004&\t4%e\u001a\u0016\t5rlRwV0prbwWgy:\u0003(Reg\n\u0003)\u0005l/k\\,\u0007r\u001fk]{\u000e:~4Xy\u0010\n~5\u000fpXk!0\rnhepx\br\b:#2\u0000\u0016Wi&`\u000fq\u0003tu:b";
      f5762[47] = "q\u0006hz\u0014<&K0)\u007fozX8!\u007fe{Q 6\u001c;*\b:G\u00185+\\>6BokHYx\u001c<}Z>,\u0001o'7";
      f5762[48] = "t4\\\t_1w8\u0017\u00064k'.N\u0005XYvi\u0014^4?7(\u001e\u0013[\u007f%7Eb\nh89E]\tds6.";
      f5762[49] = "E6NK\u0014\u000e\u0010|\fuFGQ/W\u000e+\u0007\u001c;\u0003\u0014\u0017GNyKu\u0012CTv\u000b\u0016\u0011GU?3";
      f5762[50] = "I1o\u000b~8\u000f6/\u0019\u0015Ӫs0$\fv<\rok\u0006.";
      f5762[51] = "\u0010\u0010@\u0000\u0003rNA\u0019\u001art\u001d\u0000F\u001e\u001eFJF\u0017AC\u0011O\u001f\u001f\u0013\u001fv\u001b\u0002LIr";
      f5762[52] = "s=\\\u0005\u0015\u0000&w\u001e;MJv,GRN0u\"SQNP*q\u0019Y*";
      f5762[53] = "jEQj#p1ESxE+`TPf)\u00196\u0011\r=uNuLTp9q2\u0015NgE";
      f5762[54] = "\\'\u001c<=\\[sN1D\u001cS'\u0017$8\u000bD\u0013\u001b#8\u0007X'\r_'VY'\u0004dx\u001fR-v`'_T%\u00114:\f\u000eH";
      f5762[55] = "Vi6R>}\b8oHO{[y0L#I\f?a\u0013t\u001e\tfiA\"y]{:\u001bO";
      f5762[56] = "nX\u001eWBpd[\u0016Sxc\u0002\fIV\u0017.3M\u001b\u0015BO2SYF\u0019~s\u0001\u001a\u0013x";
      f5762[57] = "\u0018\u0016Ltcw\u0005\u001dS5Xh\u0018\u0003Ll4ZIA\u00154X=\u001a\u0000Cji|HC\u0016\u000b5j\u001aGMi#d\u000b\u0001,:>p\u0014\u000eNpe0N\u007f";
      f5762[58] = "\u0004),<I6\u00165=#p%\u001b(,E\u00101\u001a*0&N`C0A";
      f5762[59] = "n\r\bW9} _K^^{?\u001cj\u000e:i?`\rW#$3\\M\u0005alR";
      f5762[60] = "\u0000Lju&\u0011T\u0013{3\u001av$hY\u0006\u001aM\u0001F;w\"\u0019^W}";
      f5762[61] = "\u0000KMH$cT\u0014\\\u000e\u00184\tRx9R[\u000bAP\u001c|;T\u0012\u001a\u0014\u0018";
      f5762[62] = "xT`(Vv|Fkj9ׅ\u0017De1@<t\u001a4hZMrCpkS#l\u001dwk9\"xVc3Y}+\u001ckWV\"eNm7\tq/F\t1\b|*O0fE.y.ng\u0005&pU4=E2\u0017\u001bjnS pOw=\tM";
      f5762[63] = "fj(#R\u000edp4nn\u000e7i\u0006w\u0007\u001a!Q*z\u0002\f \u0015s+\u0001\u001c4*0h\n\u000eZ";
      f5762[64] = "hM\u001b2}=.J[ \u0016ľR\u0014\u001a/| j\u0018J7\u007f";
      f5762[65] = "(CM=&\u001fe\u0016^iT\u0002\u0018LH/;O)\r\u001aln.(\u0013X?5\u001fiA\u001bjT";
      f5762[66] = "..>'\u0012~0p9'xu&5'|\u0014Gtxy#x)61w#\u001b*20>\u001b";
      f5762[67] = "ZO}Uf?\u001cH=G\rӕ`E Wl2\u0002\u000f{\u00176";
      f5762[68] = "<p!\u000bGki:c55[<p!\u000bGki:c";
      f5762[69] = "IRnO,4\f\\?J\u0017%]ALGq6jPdLz0]G\u0002G'v[Zs\u001d}6O=";
      f5762[70] = "pW\"\f\u000ei|\u0007:\u000fo>\u007f\u0011\u001e\u000f\u000b,\u007fm$\u0003\u0000o.Up\\\u0011)\u0012";
      f5762[71] = "\u001bP\u000e'a\u000b\u0001\u0014^0^\u0015\u001ai\bc$\u0014\u0012T\u0004a&A";
      f5762[72] = "E:UXz.\u0010p\u0017f*\u001eE:UXz.\u0010p\u0017";
      f5762[73] = "\u00156YVr\u0001RoCA\u000e[\u0000.]@biPn\u0006\u0017\u000eQ\u0002 WCn\u000eQj_'kY\u0014nWIu\u0007\u0013n=";
      f5762[74] = "HMKr(\u0000\u0012\fKn\u0011\u000fN]mwi\u001eX\\Mq|\n\"[Jwi_D\u0001\u000bwuf\u001dR\u000f`|\u0001IO\\:\u0011";
      f5762[75] = ".R\u0019u,&(J\u0011aC0([\u001dq9!(|\u001dF26(j\u0007b-'? D4,7+\u001f\u0007w'%E\u0010\u0015s,+tQG0yJt]\u0000<2%4O\u001fgC";
      f5762[76] = "0\u0011V\u00179\u000bs\u001fOUA\u0002,\u00130R\"V \u0012W\u0006?\u0005z\u007f";
      f5762[77] = "c>Pt\u0000\u001e%9\u0010fk\u000bY>\u000fjV\u00028i\u0019;Rbba\n6\u000b\u00035w[2k";
      f5762[78] = "-\u0004#\u001a\u000bo!T;\u0019j,\"B\u001f\u0011\u00116%_%\u0011\u0016&OZ|\u0000S4rZ<\b\u0014W-\u0004#\u001a\u000bo!T;\u0019j";
      f5762[79] = "i'\r;;\u001ae%\u000fnXIbu\u00133\u000f\u001e<\"K_?Jbs\u0011adJ`a";
      f5762[80] = "s*q)-\u001b\u007f(s|NCtik*\"q (0tNKputv4V{j5M";
      f5762[81] = "aw;+\u0004A?&b1uGlg=5\u0019u=%akK\"`$04EC?!2*uC>v;b\u0014\u001c;t%R\u0014\u001dl}m3K\u0018nc]m\u0016\u001bkv:9\u000bH1\u001b";
      f5762[82] = "][\t\u0018n\n\u001e\u0013\u000b\fU\u0017K\u001ej\u00113\u0014K\u0018]\u0006U\u001e\u0017S\r\u0017lIZ\u000b^|";
   }

   public static Class m274(long var0, long var2) {
      Class var5 = null;
      int var4 = m272(var0, var2);
      Object var6 = f5762[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5763[var4]);
            f5762[var4] = var5;
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
      Object var5 = f5762[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5763[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m274(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m274(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m275(var12, var10, var11);
            if (var13 != null) {
               f5762[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m276(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5762[var4] = var13;
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
               var12 = m274(126498271457221L, 0L);
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
      Object var5 = f5762[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5763[var4];
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
               f5762[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m274(126498271457221L, 0L);
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
                     f5762[var4] = var19;
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
               var23 = m274(126498271457221L, 0L);
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
         if (var8 != 192 && var8 != 'Q' && var8 != 251 && var8 != 'f') {
            var11 = m280(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 203) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 235) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m277(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 192) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'Q') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 251) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Enum355.class, "m282", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʶ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
