package org.rusherhack.core.command.argument.parser.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.exceptions.ArgumentException;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.utils.StringUtils;

public class IntegerArg implements IArg<Integer> {
   public static long f1496 = Class066.m4320(-5233525225397326727L, 8962011512318090830L, MethodHandles.lookup().lookupClass()).m4325(100108623737878L);
   public static String f1497;
   public static Object[] f1498 = new Object[13];
   public static String[] f1499 = new String[13];

   public Integer parse(CommandProcessingSink var1, String var2) {
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
      f1498[0] = "\u0002XQ,\u0007d\u001eBSp\u001dp\u000eA\u0018a\u001ac\b\u0004Um\u0018|\fDR,\u0014c\n_[g\u001beCZWp\u0006t\u001f\u0004_o\u0005}CcXv\u0010v\bXwp\u0012";
      f1498[1] = "\n\u00119M\u0013;\u0016\u000b;\u0011\t/\u0006\bp\u0000\u000e<\u0000M=\f\f#\u0004\r:M\u0011<\n\u0000;\u0010\u0012'\u000b\u0004p \u000e#\b\u00020\u00071<\n\u0000;\u0010\u0012'\u000b\u0004\r\n\u000f%";
      f1498[2] = "{YN>\u00044pV_qy,cQV8";
      f1498[3] = "60\r|\u0003u=?\u001c3dw(4\u001cx_";
      f1498[4] = "\f{WrW\u0002\u0007tF==\u0001\u0013xMv";
      f1498[5] = double.class;
      f1499[5] = "java/lang/Double";
      f1498[6] = int.class;
      f1499[6] = "java/lang/Integer";
      f1498[7] = "\u0005\u000eQBH\u001c\u0019\u0014S\u001eR\b\t\u0017\u0018\u000fU\u001b\u000fRC\u0018S\u0005\u0019Re\u0018H\u0000\u0004\u001bc\u0018S\u0005\u0019";
      f1498[8] = "m\u0012/QxBf\u001d>\u001e\u0019Lm\u0016:D";
      f1498[9] = "<\u0010^0);;O\r\f+>y\u000e\f\fjkn\u001eXw6,<\u0005a5<h>\u0010\u001e6:-du[k((aI[cbj\u0003";
      f1498[10] = "\u0003mO\u001aDqSmS\u00136sPkW\u0014zlD{H\u001462V.\u0011\u001cI1PkKy\ry\u0000w\u0017C\u0006f]{,";
      f1498[11] = "E>n2wTE6$p\u0015\u0016\u0016=h R\u0006\u007fev*oR\u0000'm5vhE>n2wTE6$p\u0015";
      f1498[12] = "`\u00100K_#!V/C?7]\u0014;\u0018\u0002~\"\u0017=]X\u001bdBk\u001aZdgD.@?";
   }
}
