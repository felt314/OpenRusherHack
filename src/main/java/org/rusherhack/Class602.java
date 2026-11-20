package org.rusherhack;

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
import org.joml.Matrix4f;

public class Class602 extends Class253 {
   public static Class602 f9496;
   public boolean f9497;
   public static Class602 f9498;
   public static long f9499 = Class066.m4320(-3597071129089401198L, -5415016632179175139L, MethodHandles.lookup().lookupClass()).m4325(102181318292511L);
   public static String[] f9500;
   public static String[] f9501;
   public static Map f9502 = new HashMap(13);
   public static Object[] f9503 = new Object[34];
   public static String[] f9504 = new String[34];

   static {
    }

   @Override
   public void m6551() {
      long var1 = f9499 ^ 24867741681551L;
      int var3 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ó", java.lang.invoke.MethodType.methodType(int.class, long.class, long.class)), 6505525535851308488L,  var1))).intValue();
      Class602 var4 = this;

      label22: {
         Class602 var10000;
         label21: {
            try {
               var10000 = var4;
               if (var3 != 0) {
                  break label21;
               }

               if (((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), var4,  6505998435826973834L,  var1))).booleanValue()) {
                  break label22;
               }
            } catch (IllegalStateException var6) {
               throw ((IllegalStateException)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ó", java.lang.invoke.MethodType.methodType(IllegalStateException.class, java.lang.Object.class, long.class, long.class)), var6,  6506035113444471655L,  var1)));
            }

            var10000 = this;
         }

         String var10 = m657(17527, 4954353904492085160L ^ var1);
         org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), 
            ((org.rusherhack.Class472)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(org.rusherhack.Class472.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), this,  ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ó", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), m657(20700, 5154408130536565508L ^ var1),  6505620627019918611L,  var1))),  6505708070303782692L,  var1))), 
            ((org.joml.Matrix4f)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(org.joml.Matrix4f.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Class352)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ë", java.lang.invoke.MethodType.methodType(org.rusherhack.Class352.class, long.class, long.class)), 6506250894654151861L,  var1))),  6506164380581478989L,  var1))), 
            6506426543429554528L, 
            var1
         );
         org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), 
            ((org.rusherhack.Class472)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(org.rusherhack.Class472.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var10000,  ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ó", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var10,  6506104057725713539L,  var1))),  6505708070303782692L,  var1))), 
            ((org.joml.Matrix4f)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(org.joml.Matrix4f.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), 
               ((org.joml.Matrix4f)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(org.joml.Matrix4f.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Class352)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ë", java.lang.invoke.MethodType.methodType(org.rusherhack.Class352.class, long.class, long.class)), 6506250894654151861L,  var1))),  6505505046326829869L,  var1))), 
               ((org.joml.Matrix4f)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(org.joml.Matrix4f.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Class352)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ë", java.lang.invoke.MethodType.methodType(org.rusherhack.Class352.class, long.class, long.class)), 6506250894654151861L,  var1))),  6504728331137290974L,  var1))), 
               new Matrix4f(), 
               6505862921659431818L, 
               var1
            ))), 
            6506426543429554528L, 
            var1
         );
         return;
      }

      int var7 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(int.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.client.util.Window)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(net.minecraft.client.util.Window.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.client.MinecraftClient)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ë", java.lang.invoke.MethodType.methodType(net.minecraft.client.MinecraftClient.class, long.class, long.class)), 6506526708218833344L,  var1))),  6505908184488059710L,  var1))),  6506471278865372614L,  var1))).intValue();
      int var5 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(int.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.client.util.Window)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(net.minecraft.client.util.Window.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.client.MinecraftClient)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ë", java.lang.invoke.MethodType.methodType(net.minecraft.client.MinecraftClient.class, long.class, long.class)), 6506526708218833344L,  var1))),  6505908184488059710L,  var1))),  6504646576569347587L,  var1))).intValue();
      long var10001 = 376570650632942767L ^ var1;
      Matrix4f var8 = ((org.joml.Matrix4f)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(org.joml.Matrix4f.class, java.lang.Object.class, float.class, float.class, float.class, float.class, float.class, float.class, long.class, long.class)), new Matrix4f(),  0.0F,  var7,  var5,  0.0F,  0.0F,  1000.0F,  6506360633418990967L,  var1)));
      String var9 = m657(20337, var10001);
      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), 
         ((org.rusherhack.Class472)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(org.rusherhack.Class472.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), this,  ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ó", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), m657(29901, 7764031342977994513L ^ var1),  6505620627019918611L,  var1))),  6505708070303782692L,  var1))), 
         var8, 
         6506426543429554528L, 
         var1
      );
      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Class472)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "O", java.lang.invoke.MethodType.methodType(org.rusherhack.Class472.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), this,  ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ó", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var9,  6506104057725713539L,  var1))),  6505708070303782692L,  var1))),  new Matrix4f(),  6506426543429554528L,  var1);
   }

   public Class602(boolean var1) {
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

   public static String m657(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24977;
      if (f9501[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f9502.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f9502.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/մ", var10);
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
         byte[] var9 = f9500[var5].getBytes("ISO-8859-1");
         f9501[var5] = m656(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f9501[var5];
   }

   public static Object m658(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = m657(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class602.class, "m658", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/մ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f9504[var4] != null) {
         return var4;
      } else {
         Object var5 = f9503[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 19;
               case 1 -> 26;
               case 2 -> 29;
               case 3 -> 61;
               case 4 -> 60;
               case 5 -> 16;
               case 6 -> 48;
               case 7 -> 37;
               case 8 -> 2;
               case 9 -> 21;
               case 10 -> 14;
               case 11 -> 51;
               case 12 -> 43;
               case 13 -> 42;
               case 14 -> 50;
               case 15 -> 35;
               case 16 -> 52;
               case 17 -> 32;
               case 18 -> 57;
               case 19 -> 34;
               case 20 -> 24;
               case 21 -> 9;
               case 22 -> 4;
               case 23 -> 63;
               case 24 -> 10;
               case 25 -> 49;
               case 26 -> 39;
               case 27 -> 56;
               case 28 -> 55;
               case 29 -> 46;
               case 30 -> 18;
               case 31 -> 20;
               case 32 -> 33;
               case 33 -> 13;
               case 34 -> 0;
               case 35 -> 12;
               case 36 -> 54;
               case 37 -> 53;
               case 38 -> 38;
               case 39 -> 3;
               case 40 -> 41;
               case 41 -> 30;
               case 42 -> 1;
               case 43 -> 58;
               case 44 -> 8;
               case 45 -> 6;
               case 46 -> 25;
               case 47 -> 45;
               case 48 -> 28;
               case 49 -> 47;
               case 50 -> 31;
               case 51 -> 27;
               case 52 -> 59;
               case 53 -> 22;
               case 54 -> 11;
               case 55 -> 17;
               case 56 -> 62;
               case 57 -> 40;
               case 58 -> 23;
               case 59 -> 5;
               case 60 -> 15;
               case 61 -> 44;
               case 62 -> 36;
               default -> 7;
            };
            int[] var7 = new int[6];

            for (int var8 = 0; var8 < 6; var8++) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for (int var14 = 0; var14 < var13.length; var14++) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            f9504[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f9503[0] = "']EK\u0010\t%C\f(\u001b\u0012:FZQ\u001c";
      f9503[1] = "ao\u00020a'cqKSj<|t\u001d*m+";
      f9503[2] = "K\u0012#h@\u0005K\u001244L\nQY4*L\u001fV(dw\u001d";
      f9503[3] = "\u0003XE:J[\u0003XRfFT\u0019\u0013RxFA\u001eb\u0000$\u0013\u0003";
      f9503[4] = "#$9W<R?>;\u000b&F/=pԍ";
      f9503[5] = boolean.class;
      f9504[5] = "java/lang/Boolean";
      f9503[6] = "wn7\u001cD\u0001kt5@^\u0015{w~ʀ";
      f9503[7] = "\r,C[5\u0004\u00116A\u0007/\u0010\u00015\nɳ";
      f9503[8] = int.class;
      f9504[8] = "java/lang/Integer";
      f9503[9] = "8\u0000WO'y$\u001aU\u0013=m4\u0019\u001e\u00029e2\u001cDO4|>\\E\b{{>\u001cT\u000e\"\"\u0000\u001b^\u0005:{\u0001\u001bU\u0016\u001dm9\u0016\\\u0004'N6\u0001U";
      f9503[10] = ":fc\u0018\u0000@1irW}X\"n{\u001e";
      f9503[11] = "0\u0015tT/G,\u000fv\b5S<\f=Я";
      f9503[12] = float.class;
      f9504[12] = "java/lang/Float";
      f9503[13] = void.class;
      f9504[13] = "java/lang/Void";
      f9503[14] = "8/>\u001fL{$5<CVo46wRRg23-\u001f_~>s\u001e]Ql61*";
      f9503[15] = "'ssGt>,|b\b\b'#flK?\u00175q`V.;\"|";
      f9503[16] = "\u0014)!\u000f\u007fX\u001f&0@\u001eV\u0014-4\u001a";
      f9503[17] = "M\u001bv\u0017VI\u0013\u001a2uNR\u0015p4LSJO\u0010uI\u001aBqLf\u000eIR\u0017\u0012gJ+\u0013\u001a\u000bo\bMM\u001bO\r";
      f9503[18] = "=t\u0006UOGmo\\D4Piy\u0001NXb>?_\u0019\u000f5>l\u0006\u0015L\f}l\u0011\u00154";
      f9503[19] = "W\fP\u000e[R\t\u0015\nP9ЎmHWVUE\u0001\u0019\u000fFB";
      f9503[20] = "\"Y#Wg&yR)@Wҁ\u001e\u000b2^58xU3\u001a";
      f9503[21] = " yu\u0004de#{p\rYȆ\u001c;}V:6we(P#_";
      f9503[22] = ":\u0017{\u000b\\,<HxZey\u0004Jw\u0019[9\u007f\u0016 \u0017\u0018U;\u001e`[\t.gIn\u0018e";
      f9503[23] = "C\u001b]\u0007:l@\u0019X\u000e\u0007Ľ\u007f[Z\u00159:\u0004\u0007\r\u001bzV@\u001e\bV?&\u0012X[T\u0007";
      f9503[24] = "\u0001`b9t\u0013_a&[r\u0018ALc'i\u0012=;{fi\nPjukxu\ri$;v\u0018\\g)*\tE_6y$d\u0014Q;h[9\u0017\u0000kf6h\u0019\rz\u0019kkH]tt:eEL\u000b)94\u0015Bfx79\u0004=7r k\b[isd\t";
      f9503[25] = "\u0004W6]m\fV\u0011e_UѰ;\u0011d\u00197\u0001]Oe]UMU\u0014s\u00129\u0001E\\4b";
      f9503[26] = "\"F#2\u0019daF42a8uS$i\r\n$\u0013t0a`|\u0013'g\n>)\u0015>\u000e";
      f9503[27] = "3O|YJ,:\rzF!\"1q&HF;!\u0003vS\u001c*";
      f9503[28] = "eL\u000e\u0016Wl;UTH5t_Z\u0010VN\"$L\rD\u0004\u001d6N\u001c\\\nf S\u000e\u00165";
      f9503[29] = "I{C*vvJyF#Kηu;D8u \u000eg\u001366LJoSz'7\u00168]9K";
      f9503[30] = ">ky7/\fe`s \u001fȖ\u00029h>}\u0012dgiz";
      f9503[31] = "i'`RN\n2,jE~ɀUutZ\fY6.\u007fP\u001b";
      f9503[32] = "sB\u0002L(\u000f0B\u0015LPS$W\u0005\u0017<au\u0016]JP\u000b-\u0017\u0006\u0019;Ux\u0011\u001fp";
      f9503[33] = "iB\u000fRj?2I\u0005EZԓU\u0010\u001e[8!3N\u001f\u001f";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f9503[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f9504[var4]);
            f9503[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m196(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m197(Class var0, String var1, Class var2) {
      Field var3 = m196(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m197(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m198(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f9503[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f9504[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f9503[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f9503[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new IllegalStateException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = m195(1157918343101273L, 0L);
            }
         }
      }
   }

   public static Method m199(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m200(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m199(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m200(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m201(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f9503[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f9504[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            var11++;
            var12++;
         } while ((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for (int var16 = 0; var16 < var11; var16++) {
            int var17 = var6.indexOf(8, var12);
            var15 = m195(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m199(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f9503[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(1157918343101273L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m200(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f9503[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while (var29 < var13) {
                  var28.append(var14[var29].getName());
                  if (++var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new IllegalStateException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(1157918343101273L, 0L);
            }
         }
      }
   }

   public static MethodHandle m202(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 170 && var8 != 165 && var8 != 235 && var8 != 'a') {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'O') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 243) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 170) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 165) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 235) {
               var9 = var0.findStaticGetter(var12, var18, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var18, var14);
            }
         }

         return MethodHandles.dropArguments((MethodHandle)var9, var3.parameterCount() - 2, long.class, long.class);
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName())
            .append(" : ")
            .append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null "))
            .append(" : ")
            .append(var15.toString());
         throw new IllegalStateException(var13.toString());
      }
   }

   public static Object m203(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m202(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class602.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/մ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
