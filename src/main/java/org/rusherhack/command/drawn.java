package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.client.api.feature.hud.impl.FeatureList;
public class drawn extends Command {
   public static long f6330 = Class066.m4320(1697752728628328179L, -5640945368748008008L, MethodHandles.lookup().lookupClass()).m4325(187259611893959L);
   public static String[] f6331;
   public static String[] f6332;
   public static Object[] f6334 = new Object[14];
   public static String[] f6335 = new String[14];

   public drawn() {
      super("drawn", "Toggle visibility of a module in the FeatureList");
   }

   @CommandExecutor
   @CommandExecutor$Argument({"module"})
   public String m12524(Module var1) {
      boolean var10001;
      if (!var1.isHidden()) {
         var10001 = true;
         boolean var10003 = true;
      } else {
         var10001 = false;
         boolean var5 = true;
      }

      var1.setHidden(var10001);
      String var10000 = var1.getName();
      if (!var1.isHidden()) {
         var10001 = true;
         boolean var6 = true;
      } else {
         var10001 = false;
         boolean var7 = true;
      }

      return "Set visibility of " + var10000 + " to " + var10001;
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
   public static void m157() {
      f6334[0] = "\u0011~w\u0004(B\rduX2V\u001dg>Ȭ";
      f6334[1] = int.class;
      f6335[1] = "java/lang/Integer";
      f6334[2] = "\nLE,\u0005w\u0016VGp\u001fc\u0006U\fa\u001bk\u0000PV,\u0016r\f\u0010Dg\u0016v\u0010LG,\u001am\u0001KNgYO\nZWn\u0012";
      f6334[3] = boolean.class;
      f6335[3] = "java/lang/Boolean";
      f6334[4] = void.class;
      f6335[4] = "java/lang/Void";
      f6334[5] = "w\bO7AUk\u0012Mk[A{\u0011\u0006Φ";
      f6334[6] = "q#\u001eof]m9\u001c3|I}:Wȵ";
      f6334[7] = ".%\\\u0017\r5%*MXp-6-D\u0011";
      f6334[8] = "@Fh\u0007]RKIyH<\\@B}\u0012";
      f6334[9] = "<$C\f\u000b\u0001 2J~ԉqc)\u000fA\u0010\u0017a8SCi";
      f6334[10] = ">\u0015uCf.uJ,\u0005^eiPU\u001c2riJ\u0015G5qfEw\f#.d,.A1oc\u0016$\u0013;g\u0004";
      f6334[11] = "Z,5w`\u0011\r #.\u0011Eaa/*hP\u0003,=em,]7zlmN\u0010%5i\u0011";
      f6334[12] = "lWF\u000e[\u0013'\b\u001fHcL;\u0012`Y\u0006NVSI\b\u0013Z'R\u0016W\u0001#";
      f6334[13] = "dy-Q2[/&t\u0017\n\n%\u0000,\u0003f\u00068@w\u0004e\t7\"<\u0012:\u000b^";
   }
}
