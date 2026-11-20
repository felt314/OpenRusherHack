package org.rusherhack;

import com.mojang.blaze3d.platform.GlStateManager;
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
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.command.processing.CommandProcessingSink;

public enum Enum399 {
   f6725,
   f6726,
   f6727,
   f6728,
   f6732,
   f6734;

   public Class262 f6729;
   // $VF: synthetic field
   public Class557 f6731;
   public String f6733;
   public static long f6735 = Class066.m4320(-8946464627773017459L, -3381404950663062543L, MethodHandles.lookup().lookupClass()).m4325(146482955055705L);
   public static long[] f6736;
   public static Integer[] f6737;
   public static Map f6738;
   public static Object[] f6739 = new Object[40];
   public static String[] f6740 = new String[40];

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
    }

   public void m12953(int var1, int var2, int var3, long var4, int var6, int var7) {
      this.f6729.m9352(var1, var2, var3, var4, var6, var7);
   }

   Enum399(String var3, Class262 var4, Class557 var5) {
      this.f6733 = var3;
      this.f6729 = var4;
      this.f6731 = var5;
   }

   public String m12957() {
      return this.f6733;
   }

   public void m12965(int var1, int var2) {
      this.f6731.m17203(var1, var2);
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

   public static int m118(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17509;
      if (f6737[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f6736[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f6738.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f6738.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ϙ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f6737[var3] = var15;
      }

      return f6737[var3];
   }

   public static int m119(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m118(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Enum399.class, "m119", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ϙ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m122() {
      f6739[0] = "v\u00047WVX\u007f\n4\u001e\u0015Uy\n \u001c\bS;\u001b6\u0018OQz\u00197W|[F\u001f;\r^zt\u0005;\u001e^E";
      f6739[1] = int.class;
      f6740[1] = "java/lang/Integer";
      f6739[2] = void.class;
      f6740[2] = "java/lang/Void";
      f6739[3] = "u?^6\u0011mi%\\j\u000byy&\u0017Ȟ";
      f6739[4] = long.class;
      f6740[4] = "java/lang/Long";
      f6739[5] = boolean.class;
      f6740[5] = "java/lang/Boolean";
      f6739[6] = "&`wk\u0016\u0004:zu7\f\u0010*y>Μ";
      f6739[7] = "9Rh9\u0001\u0013%Hje\u001b\u00075K!ɣ";
      f6739[8] = "g\u0005\u0011Z/#{\u001f\u0013\u000657k\u001cXɧ";
      f6739[9] = "__G\u0014%jCEEH?~SF\u000eԩ";
      f6739[10] = "xh~q\u001cwdr|-\u0006ctq7<\u0001pr4z0\u0003ovt}q\u001epxy|,\u001dky}7\u001c\u0001oz{w;>pxy|,\u001dky}J6\u0000i";
      f6739[11] = "r\u0014P\u0000\t\\y\u001bAOtDj\u001cH\u0006";
      f6739[12] = "Q!\u0002`\u001ccM;\u0000<\u0006w]8K-\u0001d[}\u0004 \u0007{_'\f!\u00008\u007f=\f#\u000fbW<\u000b";
      f6739[13] = "q\u0007e{\u0005UX>ya\u0007\tB*ibL\u03a2\u0011";
      f6739[14] = "{,c\u0013V\u000eR\u0015\u007f\tTRH\u0001o\n\u001fϹ\u001b";
      f6739[15] = "\u0001`\u001eM'\u0011\no\u000f\u0002L\u0013\u001el";
      f6739[16] = "\u0010^\u0005/>B\u001bQ\u0014`SB\u001bL\u0000";
      f6739[17] = "P]KgcL[RZ(\u0002BPY^r";
      f6739[18] = "C\u0004=4:0\u0017\b5R\u00078O\b<6=\u000bD\u001b*? \u001cU\u001d,3:\u001cS\u001b?#P.E\u0019$ma/@\u000eVk7d\u0017Y5co,[a";
      f6739[19] = "}\u0013nKG_=GgJ}ԧCYsV\u000f\u0011rRvA}_/Pm\u0011LT*G\u001f_\u0011V1\u0017.T\u0014AC\u0013 U\u0002R9\u0014s\u0017D.2Dg\\B\u001f9Ap.\fB;Z \u001f\u0007G,(&IL\u0010{K.\u0011\u0004\\C";
      f6739[20] = "\"\u000b-GE\u0011h\u0002<C)Չ\u0018\u001a-U[\u0016)\u0011(B)";
      f6739[21] = "z\u000b<Jle;\u000e+\u0003\u0011ˍFH4M!}{\u0019?\r.";
      f6739[22] = "5\u007f\t{Oktz\u001e22D\t>\u001bmKwh\u007f\u001ez\u0002";
      f6739[23] = "JY/qlMC^:>UIJA5,\u0012Y#O%,?EQ\u001d\"=;7\u0013L4<.O\u0018Hu;U^_Bxx/WXW7A";
      f6739[24] = "g#U}tA:pI}M\u0010X}Y>0G v]\u007f7<h$L?6Dc \r8M";
      f6739[25] = "6<\u000fh(>g*PhZv\u0006j\t~'!~a\r? Z63\u001c\u007f!\"=7]xZ";
      f6739[26] = ";\u00071%^\u007fz\u0002&l#r\u0007F#3Zcf\u0007&$\u0013";
      f6739[27] = "8\u0004ikv1y\u0001~\"\u000bɆ\u0004G=cnju\u0007ijo";
      f6739[28] = "\u00194Yd]\u0015M8Q\u0002`\u000e\u001e+NoG9\u000f-Hc]1+6SdK\u001d\tQCnO\u0002L`HkXp\u0002=Jp\bA\t8]\u0002F\u001c\u000b#\r3M\u0019\u001cQCnO\u0002L`HkXpHnI}K\nO=\u000b;7I\u0014`\f:TAL(@\u0002";
      f6739[29] = "HWirfl\tR~;\u001b@t\u0016{dbp\u0015W~s+";
      f6739[30] = "]?>R\u001fG\u001c:)\u001bbկa+kR\u001e\u001e\n%=\u0010\u0018";
      f6739[31] = "Rs\"&YI\u0003xb) ɼle0nRK]n5y \u0005\u0000l.)\u0011\u000e\u0005{\\/GER,?'\u001f\r\u001e\u0014";
      f6739[32] = "Zn=^/H\u001bk*\u0017RӁf#;[/R\u001e(?\u001a(";
      f6739[33] = "ibBXD](gU\u00119VU#PN@A4bUY\t";
      f6739[34] = "4.P\u001d~k`\"X{Cp31G\u0016dG\"7A\u001a~V9*]\u0007yt^:W\u0003f1o1R\u0014\u0014\u007f23ID%t7$;\nxv,t\n\u0001}a^pI\u0010sc?sB\u0018n\u000e/'C\t+?$\"T{/1%4G\u0001(bgr;Bs?`sXJ+w,K";
      f6739[35] = "A\u001bFgY&\u0000\u001eQ.$%}ZTq]:\u001c\u001bQf\u0014";
      f6739[36] = "d\u000f\u001c\u000e_;0\u0003\u0014hb2o\u0011\u001e\u0002Q3P\u0007\r\u0014X.G\u0016\u000b\u0012T4G\u0010\r\u0001D^\u007f\u0006\u000f\u001a\not\u0003\u0018h\f9?TO\u000b\u0004aw\u0018w";
      f6739[37] = "*?Ur\\hk:B;!у\u0016+\u0000r]1}%V0[\t";
      f6739[38] = "b\f]e\t\u001c#\tJ,tQ^MOs\r\u0000?\fJdD";
      f6739[39] = "cLC\u007fCC\"IT6>K_\f\u0010<T[$\u0001\u001cz\u0002\"b\r\u0016lGYo\u0001P:>";
   }
   public static Field m124(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m125(Class var0, String var1, Class var2) {
      Field var3 = m124(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m125(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }
   public static Method m127(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m128(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m127(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m128(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }
   Enum399() {}
}
