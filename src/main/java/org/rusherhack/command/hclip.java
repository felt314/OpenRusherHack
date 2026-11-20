package org.rusherhack.command;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.ClientPlayerEntity;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.exceptions.ValidationException;
import org.rusherhack.core.utils.IOUtils;

public class hclip extends Command {
   public static long f3222 = Class066.m4320(7879975414246354539L, 2336548433606605824L, MethodHandles.lookup().lookupClass()).m4325(226965969336650L);
   public static String[] f3223;
   public static String[] f3224;
   public static Map f3225 = new HashMap(13);
   public static Object[] f3226 = new Object[38];
   public static String[] f3227 = new String[38];

   public hclip() {
      super("hclip", "Teleport horizontally");
      String[] var10001 = new String[]{"horizontaltp", null, null};
      boolean var10005 = true;
      var10001[1] = "horizontalclip";
      var10001[2] = "horizontal";
      this.addAliases(var10001);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   @CommandExecutor$Argument({"distance"})
   public String m6899(double var1) {
        return null;
    }

   static {
    }

   public static Class316 m116(Class316 var0) {
      return var0;
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

   public static String m153(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13776;
      if (f3224[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f3225.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f3225.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/Ŝ", var10);
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
         byte[] var9 = f3223[var5].getBytes("ISO-8859-1");
         f3224[var5] = m117(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f3224[var5];
   }

   public static Object m154(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = m153(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(hclip.class, "m154", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ŝ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m157() {
      f3226[0] = "4Exv9C(_z*#W8\\1;$D>\u0019j,\"Z(\u0019V\u0017\u001eB2[l";
      f3226[1] = "3-(t'88\"9;Z +%0r";
      f3226[2] = "\u001c\u0005?\nC7\u0000\u001f=VY#\u0010\u001cvG]+\u0016\u0019,\nP2\u001aY*A_&\u0016\u0005vvT,\u0017\u0012*g^,\u0007\u0012 P";
      f3226[3] = "^\u0005Tq&'B\u001fV-<3R\u001c\u001d<; TYP09?P\u0019Wq\u00150B\u0003A>7&r\u0018^25<U";
      f3226[4] = "m)Y\u0011\u001f\u001f\u0018\tR\u001e\u000ePe\u0011A\u0019\u0007\u0019\r";
      f3226[5] = void.class;
      f3227[5] = "java/lang/Void";
      f3226[6] = "=d[s\n\u00136kJ<i\u001e#m";
      f3226[7] = double.class;
      f3227[7] = "java/lang/Double";
      f3226[8] = "\u0004G-\u000f\r/\u0004G:S\u0001 \u001e\f:M\u00015\u0019}n\u0015V";
      f3226[9] = float.class;
      f3227[9] = "java/lang/Float";
      f3226[10] = "\u001b\u0006_~,~\u0007\u001c]\"6j\u0017\u001f\u0016ɖ";
      f3226[11] = int.class;
      f3227[11] = "java/lang/Integer";
      f3226[12] = "5X0]\u000bJ@x;R\u001a\u0005!v0Y\u001e_U";
      f3226[13] = "1)>\\eP-3<\u0000\u007fD=0w\u0011{L;5-\\vU7u\u001e\u001exG?7*";
      f3226[14] = "\u001d;FBWM\u001d;Q\u001e[B\u0007pQ\u0000[W\u0000\u0001\u0001]\n";
      f3226[15] = "\u0001GY~E^\nHH1/]\u001eDCz";
      f3226[16] = "O\u0005\u001cYs|O\u0005\u000b\u0005\u007fsUN\u000b\u001b\u007ffR?^D&";
      f3226[17] = "fbwBgFzxu\u001e}Rj{>İ";
      f3226[18] = "\u0007({]6\u0012\u001b2y\u0001,\u0006\u000b12ȇ";
      f3226[19] = "N'~S}7E(o\u001c\u001c9N#kF";
      f3226[20] = "2\u0011+~R\u00140Oz80\u0018it/kQ\rhUF;B\u0014gE'y\u000eUw.zu@\reO89\u0001\u001d\u000e";
      f3226[21] = "\u00140\f&ze\u0014.\u001ffCeD+\u0007;/W\u0013l\\es\u0000\u0015%\u00175(aWiV%C";
      f3226[22] = "dv\u001b\u000e\u0007\bdh\bN>\b4m\u0010\u0013R:b/LI\u0002mg{HHQ\u0002co\u0012L>";
      f3226[23] = ",\u001em##h.@<eAcqG\u0000f3hyJa$\u007f)i!<(1q{@~dpa\u0010";
      f3226[24] = "\u001e,\rfBY\u001e2\u001e&{YN7\u0006{\u0017k\u001e{_ {\u0000Q;\u000fw\u001aB\u001dz\u001f\u001cGNS\"\r}\u0005\u0002\u00122f \tLJ \u0007bE\rZK]x@NAu\u001cfKB#";
      f3226[25] = "7\bDFafb\u0012J(,\u0000e\u0003N\u0012<zbRT\u0012\u000090\t\u0012\u0014z>a\u0013\u0012(";
      f3226[26] = "\u0013p\"t.<\u001d+k(\u0014ț,{cuy~@07kqB";
      f3226[27] = "Tn/,5|V0~jWg\u000f*Bi%|\u0001:#+i=\u0011Q~''e\u00030<kfuh";
      f3226[28] = "\u0010\u0000\u000f\u00066C\u0017Q\u0015\u0006\nWN\u0016\fUv9\u0010\u0000\u000f\u00066C\u0017Q\u0015\u0006\n\tK\b\fEtBV\u000bU<3UOVUF4\u0004UVi";
      f3226[29] = "\u0016>F#\u0007\u0005U{\u001a`j\u0010/{MtP\u0000U|\u001cnP<\u0016.G(VF\u0011\u007f](j";
      f3226[30] = "[SD\u000b\u000f=[\t@\u0010m%\u00013L\u0003U#\u0011KGI\u00160";
      f3226[31] = "#~\u0015G\u0005\u0005`*\u0013BxTu/g\u001b\u0019Tb.U\u007fBCg%D\u001e\u0004F&?.D\u001c\u0006k!\u0010\u0005\u0002\rgC";
      f3226[32] = "\u0015\\RnY]\u0003S]b?F\u0015\\RnxV|\u0004]sVS\u001dF\u00112F8\u0015\\RnY]\u0003S]b?";
      f3226[33] = "e\u0006\u0006r,)nLEaW?5\u001bZ}\u0000hjF\u0001\u0011=;&\u000e\u0000u2n8\u001f";
      f3226[34] = "$)T\u0018\b$$7GX1$t2_\u0005]\u0016#u\u0004X\bA%<O\u000bZ gp\u000e\u001b1";
      f3226[35] = "2n:t\\\r9$yg'\u001bbsf{pL<$>\u0017\u001a\u0012hd;r\u001a\f{$";
      f3226[36] = "\u0001\u0017+\u001b\u001dF\u0001\t8[$FQ\f \u0006Ht\u0006K{X\u001b#\u0000\u00020\bOBBNq\u0018$";
      f3226[37] = "R\u001aP'V-I\n\u0014;5.9\u001aH3M~\u0002\b\u0016s[GR\u0010Y;\f|@N\u0019-5";
   }
   public static Field m159(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m160(Class var0, String var1, Class var2) {
      Field var3 = m159(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m160(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }
   public static Method m162(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m163(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m162(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m163(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }
}
