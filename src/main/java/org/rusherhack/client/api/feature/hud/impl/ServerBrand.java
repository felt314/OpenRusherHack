package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.hud.TextHudElement;

public class ServerBrand extends TextHudElement {
   public static long f2141 = Class066.m4320(-8685051183475151783L, -3412997568271988588L, MethodHandles.lookup().lookupClass()).m4325(126244125009734L);
   public static String[] f2142;
   public static String[] f2143;
   public static Object[] f2145 = new Object[20];
   public static String[] f2146 = new String[20];

   @Override
   public String getLabel() {
      return "Brand";
   }

   @Override
   public String getText() {
      return Globals.mc.getCurrentServerEntry() != null ? Globals.mc.getNetworkHandler().getBrand() : "Vanilla";
   }

   public ServerBrand() {
      super("ServerBrand");
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
      f2145[0] = "<\u0001\u000e`AQ<\u0001\u0019<M^&J\u0019\"MK!;L}\u0018";
      f2145[1] = "g)\"\u007f\u0014\u0002l&30i\u001a\u007f!:y";
      f2145[2] = "\u0019k7CKR\u0019k \u001fG]\u0003  \u0001GH\u0004Qp\\\u0016";
      f2145[3] = "\u0007JDA\u001d\u0015\u0007JS\u001d\u0011\u001a\u001d\u0001S\u0003\u0011\u000f\u001ap\u0006[B";
      f2145[4] = ">\u0016[MM\u0002\"\fY\u0011W\u00162\u000f\u0012ɥ";
      f2145[5] = int.class;
      f2146[5] = "java/lang/Integer";
      f2145[6] = "wk\u0010W8Wkq\u0012\u000b\"C{rY\u001a&K}w\u0003W+Rq70\u0015%@yu\u0004";
      f2145[7] = "\u000e9\u001e*\\G\u0012#\u001cvFS\u0002 WgA@\u0004e\fpG^\u0012e)eG@";
      f2145[8] = "`~\u001eWO\u0003|d\u001c\u000bU\u0017lgW©";
      f2145[9] = "\u001a/mPo5\u00065o\fu!\u00166$Ȋ";
      f2145[10] = "\ri\u0006CV5\u0011s\u0004\u001fL!\u0001pOȧ";
      f2145[11] = "Q\u0011IF=\u007fZ\u001eX\t\\qQ\u0015\\S";
      f2145[12] = "A*\u001b?j-Do\u0015\u0003v&]v\u000eoDv\u001b)X;\u00132[u\u0015`s*],i";
      f2145[13] = "e\f\u001a&\u0019YgD\u000fxdΟ[\u0005\u001cx\u0018W;\u001d\u001a!dM!\u001f\u001ax\u0004U'Ff";
      f2145[14] = "\u0013\u0003\u0018r\u0019\nO\u0011\u0003<pPDzJm\u001a_B\u0006\u0016q\u0014M";
      f2145[15] = "Q,>M\u001b9\r00_v \u000504@\u001a\u0012Qqi\u0017v\u007f\u0004=%V\b/\u0006>e'";
      f2145[16] = "[\u0013afsF\u0007\u000fot\u001e_\u000f\u000fkkrm[N56\u001eZ^\u00017ux_\u001b\u000f\u000b";
      f2145[17] = "i1$\u007fQ\u001b(\u007f<,!\nU8&&]E5  \u007f!_/\" &AG){\\";
      f2145[18] = "\u007f3aYZ-\"6e\u00018ԢEpf\u001dA%4s;ZYB";
      f2145[19] = "MLpS\u0002\u0014\u0000\u0004*JlCp\u0003`M\u0005\u0012I\u0000pDU*NF}BT\u0013MVt\u0012l";
   }
}
