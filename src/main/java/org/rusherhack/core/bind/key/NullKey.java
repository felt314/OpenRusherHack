package org.rusherhack.core.bind.key;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class290;
import org.rusherhack.command.bind;
public class NullKey implements IKey {
   public static NullKey INSTANCE;
   public static boolean f1421;
   public static long f1422 = Class066.m4320(-2776676272502083053L, 4993394016808107572L, MethodHandles.lookup().lookupClass()).m4325(135340825620747L);
   public static String f1423;
   public static Object[] f1424 = new Object[9];
   public static String[] f1425 = new String[9];

   @Override
   public boolean isKeyDown() {
      return false;
   }

   @Override
   public String getLabel(boolean var1) {
        return null;
    }

   static {
    }

   public static void m3407(boolean var0) {
      f1421 = var0;
   }

   public static boolean m3408() {
      return f1421;
   }

   public static boolean m3409() {
      boolean var0 = m3408();
      return !var0;
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
   public static void m194() {
      f1424[0] = "\r>5)x%\u0011$7ub1\u0001'|de\"\u0007b0nd4L'7~$\u001e\u0017 >Lo)";
      f1424[1] = boolean.class;
      f1425[1] = "java/lang/Boolean";
      f1424[2] = void.class;
      f1425[2] = "java/lang/Void";
      f1424[3] = "]Ezt=EA_x('QQ\\3ș";
      f1424[4] = "T\rm[P\u0014_\u0002|\u0014-\fL\u0005u]";
      f1424[5] = "\u0006DH/2\u0003\rKY`S\r\u0006@]:";
      f1424[6] = "\u0011+<p\u0005V\u001e(*\u001eϢ8M,&`\u0010\u0002Et9wt\u0001\u0005u\u007fsHB\fdw\u001e";
      f1424[7] = "\u0012\u0017+R<>B@?VMӵ(\u0010-R.8H\u0016+\u0012s@\u0012Um\u000e5 \u0014S-SM";
      f1424[8] = "\u0015w2FvK\u001at$(ӽ%Ip(Vc\u001fA(7A\u0007";
   }
}
