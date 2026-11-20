package org.rusherhack.core.command.argument.parser.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class006;
import org.rusherhack.Class066;
import org.rusherhack.Class316;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.exceptions.ArgumentException;
import org.rusherhack.core.command.processing.CommandProcessingSink;

public class StringArg implements IArg<String> {
   public static long f1500 = Class066.m4320(27387807544077621L, 486401698133386311L, MethodHandles.lookup().lookupClass()).m4325(174069499459216L);
   public static String f1501;
   public static Object[] f1502 = new Object[12];
   public static String[] f1503 = new String[12];

   public String parse(CommandProcessingSink var1, String var2) {
        return null;
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
      f1502[0] = "\u0013Q 7\u0016*\u000fK\"k\f>\u001fHiT";
      f1502[1] = "CmO;:\u000eHb^tG\u0016[eW=";
      f1502[2] = "\roL<\u0007;\u0011uN`\u001d/\u0001v\u0005q\u001a<\u00073H}\u0018#\u0003sO<\u0014<\u0005hFw\u001b:LmJ`\u0006+\u00103B\u007f\u0005\"LN_`\u001c \u0005\\Yu";
      f1502[3] = "!<C4wJ=&Ahm^-%\nɮ";
      f1502[4] = "e!_O`/y;]\u0013z;i8\u0016\u0002}(o}[\u000e\u007f7k=\\Os(m&U\u0004|.$#Y\u0013a?x}Q\fb6$\u0000L\u0013{4m\u0010Y\u0011f/x6J `=";
      f1502[5] = int.class;
      f1503[5] = "java/lang/Integer";
      f1502[6] = "^6h\u0004>`B,jX$tR/!I#gTjlE!xP*k\u0004<g^'jY?|_#!i#x\\%aN\u001cg^'jY?|_#\\C\"~";
      f1502[7] = "\u0003\u000b\u000ej+,\b\u0004\u001f%J\"\u0003\u000f\u001b\u007f";
      f1502[8] = "J6,Y)L\u0010-l)ϗ2Bz$T(\tF6`\u0019Q\u000bF> Pj\u000f\nzm)";
      f1502[9] = "c:j=\u0000Rgno4gEZnka\u0019H!+9q],`:hr\u0003W%hx6g";
      f1502[10] = "+)\u001f>_x/}\u001a78~{=\u000bb8:\"y\u0000f\u00026\u007f(\u0012\u000f\u0001;k:\t4\u0005w/wp6\u0005\u007fo>K2I;\"G";
      f1502[11] = ".\u0007-9*8z\u0015i-A¥\u0014Ldu/++\u0015)t(S";
   }

   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }
}
