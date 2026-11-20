package org.rusherhack.core.command.exceptions;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.command.processing.CommandProcessingSink;

public class BadSyntaxException extends CommandException {
   public static long f1518 = Class066.m4320(-5117939829540619567L, 2573058776111220262L, MethodHandles.lookup().lookupClass()).m4325(118797133809266L);
   public static String[] f1519;
   public static String[] f1520;
   public static Object[] f1522 = new Object[7];

   public BadSyntaxException(String var1) {
      super("Syntax error: " + var1);
   }

   @Override
   public boolean shouldPrintSyntax() {
      if (this.getContext() != null) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public BadSyntaxException(String var1, CommandProcessingSink var2) {
      super("Syntax error: " + var1, var2);
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
   public static void m194() {
      f1522[0] = "2!>E\u0011\u001b.;<\u0019\u000b\u000f>8w\b\f\u001c8}:\u0004\u000e\u0003<==E\u0006\u0016>6)\u001f\n\u00013 w(\f\u0003027\u000f&\u0016>6)\u001f\n\u00013";
      f1522[1] = "9Wjb\u0011\u0006%Mh>\u000b\u00125N#/\f\u00013\u000bn#\u000e\u001e7Kib\u0013\u00019Fh?\u0010\u001a8B#\u000f\f\u001e;Dc(3\u00019Fh?\u0010\u001a8B^%\r\u0018";
      f1522[2] = "GYw\u0004-\u0001[CuX7\u0015K@>I0\u0006M\u0005sE2\u0019IEt\u0004:\fKN`^6\u001bFX>h>\u0010{R~^>\fmSsO/\u0000AD~";
      f1522[3] = "SXW>2JOBUb(^_A\u001eɤ";
      f1522[4] = "~TKud\u0012u[Z:\u0005\u001c~P^`";
      f1522[5] = "\u00010k\"\u0018\t\u000ei3B\u0007\u0019C\u001a2$\u0014\u0019O-U=\u0016\u001d\u0007>j<\fO?";
      f1522[6] = "\u001aom\u0002w\u0005\\j9\u000b\f\u0006 m3_o\u0016@6~\u001e2o\u001af:\u0004u\u000fA+{Y\f";
   }
}
