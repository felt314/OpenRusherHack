package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;

public class Class203 extends Event515 {
   public BlockState f3804;
   public ItemPlacementContext f3805;
   public static long f3806 = Class066.m4320(9130353554213634657L, 1398030739071682554L, MethodHandles.lookup().lookupClass()).m4325(196848727522827L);
   public static String f3807;
   public static Object[] f3808 = new Object[9];

   @Override
   public void setCancelled(boolean var1) {
        
    }

   public BlockState m7902() {
      return this.f3804;
   }

   public Class203(ItemPlacementContext var1, BlockState var2) {
      super(var1.getBlockPos(), var1.getSide());
      this.f3805 = var1;
      this.f3804 = var2;
   }

   public ItemPlacementContext m7903() {
      return this.f3805;
   }

   static {
   }

   public static String m117(byte[] var0) {
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
   public static void m343() {
      f3808[0] = "\r[\u0010\u0018nx\u0011A\u0012Dtl\u0001BYǻ";
      f3808[1] = "]IGk\u0004zVFV$ybEA_m";
      f3808[2] = "[zJ\u0002#*G`H^9>Wc\u0003Ǝ";
      f3808[3] = "\u0005\tY\u000b63\u0005\tNW:<\u001fBNI:)\u00183\u001c\u0012nj";
      f3808[4] = "d-\b>?\u0018d-\u001fb3\u0017~f\u001f|3\u0002y\u0017N&jA";
      f3808[5] = "FG.\u0002!\tMH?M@\u0007FC;\u0017";
      f3808[6] = "7_!B\u0012.6K%3ƉH(K)\n\u00022#@u3\u000e16\u000b;I\u0005:j2";
      f3808[7] = "_z\u0002+x\u001c\u000f,T9\u001aɫe{Z(fV\u0002 I)#";
      f3808[8] = "z7^W33*a\bEQє@7\u000f\u00170m/o\u000fTh";
   }
}
