package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.Class059;
import org.rusherhack.client.api.feature.hud.ResizeableHudElement;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.core.utils.StringUtils;

public class Class393 extends ResizeableHudElement {
   public static long f6416 = Class066.m4320(-7672863999991205570L, -6572818701649829220L, MethodHandles.lookup().lookupClass()).m4325(244672996777838L);
   public static String f6417;
   public static Object[] f6418 = new Object[11];
   public static String[] f6419 = new String[11];

   @Override
   public void renderContent(RenderContext var1, double var2, double var4) {
      VectorGraphic var8 = Class059.f1372;
      this.getRenderer().drawGraphicRectangle(var8, 0.0, 0.0, 64.0, 64.0);
   }

   @Override
   public double getHeight() {
      return 64.0;
   }

   public Class393() {
    }

   @Override
   public double getWidth() {
      return 64.0;
   }

   static {
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
   public static void m273() {
      f6418[0] = "x<$Q`Dd&&\rzPt%m\u001c~Xr 7QԦ";
      f6418[1] = "/@\txm\u00003Z\u000b$w\u0014#Y@5s\u001c%\\\u001ax~\u0005)\u001c\u001c3q\u0011%@@1m\u00140Z\u000751#%Q\u001a9m22S\u001e>v\u0016";
      f6418[2] = "\u00013+\u0015x\u0014\u001d))Ib\u0000\r*bXf\b\u000b/8\u0015k\u0011\u0007o>^d\u0005\u000b3brX\u0004\u0000%)Ik\u0003\u0002$~\u007f";
      f6418[3] = "1yVj,4-cT66 =`\u001f'2(;eEj?17%C!0%;y\u001f\r\f$0oT6;3lO";
      f6418[4] = "\u001dVQx\u001c\u0002\u0001LS$\u0006\u0016\u0011O\u00185\u0002\u001e\u0017JBx\u000f\u0007\u001b\nD3\u0000\u0013\u0017V\u00181\u001c\u0016\u0002L_5@>5VW&\u0006\u001e\u0011";
      f6418[5] = double.class;
      f6419[5] = "java/lang/Double";
      f6418[6] = void.class;
      f6419[6] = "java/lang/Void";
      f6418[7] = "g0\no\u0019\u000bl?\u001b x\u0005g4\u001fz";
      f6418[8] = "\nY\"\u0018&\u0011\tK rΟa_\r+\r8\u0004\u0001\\/\b";
      f6418[9] = "sW;x\u0013t9\u00020<,y$\u0012\nlJz$\u0014={,,0\f-c^.1Uj\u0001";
      f6418[10] = "-$i\u0005dF/%0B\u0006Xm4t7|]o=j\u0013\\Y|!b\u001eiPz]0G{Em`w\u0019;L\u0017a1\u001b7\r)m2\bb4+ghI?\n'd{\u001c\u0006\b->:A8\u0004.-ox:\u000etl2F6\rg9\u000bDaHt>t@lL)]";
   }
}
