package org.rusherhack.core.setting;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import java.lang.invoke.MethodHandles;
import java.util.function.BooleanSupplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class564;

public class NullSetting extends Setting<Object> {
   public static int f1677;
   public static long f1678 = Class066.m4320(-8893983167406252811L, 4472197783101062815L, MethodHandles.lookup().lookupClass()).m4325(90233160497040L);
   public static String f1679;
   public static Object[] f1680 = new Object[11];
   public static String[] f1681 = new String[11];

   @Override
   public JsonElement serializeValue() {
      return null;
   }

   @Override
   public boolean deserializeValue(JsonElement var1) {
      return false;
   }

   @Override
   public Object parseValue(String var1, boolean var2) {
      return null;
   }

   public NullSetting(String var1) {
      super(var1, null);
   }

   @Override
   public String getDisplayValue() {
      return Class564.m17357(f1679);
   }

   public NullSetting setVisibility(BooleanSupplier var1) {
      return (NullSetting)super.setVisibility(var1);
   }

   public NullSetting(String var1, String var2) {
      super(var1, var2, null);
   }

   public static void m4099(int var0) {
      f1677 = var0;
   }

   public static int m4100() {
      return f1677;
   }

   public static int m4101() {
      int var0 = m4100();
      return var0 == 0 ? 52 : 0;
   }

   static {
    }
   public static String m656(byte[] var0) {
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
   public static void m157() {
      f1680[0] = "P~\u0018uU^Ld\u001a)OJ\\gQ8HYZ\"\f>S_Vb\u0018ui^S`,>S_Vb\u0018";
      f1680[1] = int.class;
      f1681[1] = "java/lang/Integer";
      f1680[2] = void.class;
      f1681[2] = "java/lang/Void";
      f1680[3] = "*xL\u001fp(6bNCj<&a\u0005ԑ";
      f1680[4] = "6R\u000f\u000fu_=]\u001e@\bG.Z\u0017\t";
      f1680[5] = "vRyHO\u0016hZc\u0007\u0007\u0016rP{@\u000e\r2q`F\r\u0006}]\\\\\u0011\u0013pZj[";
      f1680[6] = "#\u0018\u001d\b\u0013\u000f(\u0017\fGr\u0001#\u001c\b\u001d";
      f1680[7] = "pw\u0010-gE'qK-\u0006ϯJq\u001a(8N;,\u001d,y7q&\bh\u007fF,!\f)\u0006";
      f1680[8] = "gI\u001b\u000e\u001c1wA\u0015u͗A7\fN\u000b[?p]\u001bI#xrL\u0005\u0014\u001a(v\f\u0017u";
      f1680[9] = "G\u001c\u0011qH5W\u0014\u001f\n̅E\u0017YDt\u000f;P\b\u00116w";
      f1680[10] = "#\u0014\u0013M6\u00053\u001c\u001d6r\u001860\u001eMh\u001f+\n\u001eJxuq\u0012\u0005Qr\u0010(\u001f\u0015_\t\u001c0\u0002\u0004\ty\f8\f\u007f";
   }

   public NullSetting() {}
}
