package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;

import org.rusherhack.command.baritone;
public class Class342 {
   public static int f5423;
   public static int f5424;
   public static long f5425 = Class066.m4320(-8162595774765137584L, 2949892052991709424L, MethodHandles.lookup().lookupClass()).m4325(123073973046905L);
   public static String[] f5426;
   public static String[] f5427;
   public static Object[] f5429 = new Object[41];
   public static String[] f5430 = new String[41];

   static {
    }

   public static void m11091(int var0, int var1) {
        
    }

   public static void m11092() {
      f5424 = 0;
      f5423 = 0;
   }

   public static void m11093() {
        
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
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5430[var4] != null) {
         return var4;
      } else {
         Object var5 = f5429[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 61;
               case 1 -> 38;
               case 2 -> 52;
               case 3 -> 48;
               case 4 -> 59;
               case 5 -> 37;
               case 6 -> 22;
               case 7 -> 30;
               case 8 -> 62;
               case 9 -> 40;
               case 10 -> 27;
               case 11 -> 34;
               case 12 -> 8;
               case 13 -> 42;
               case 14 -> 2;
               case 15 -> 24;
               case 16 -> 47;
               case 17 -> 32;
               case 18 -> 6;
               case 19 -> 23;
               case 20 -> 29;
               case 21 -> 25;
               case 22 -> 44;
               case 23 -> 7;
               case 24 -> 60;
               case 25 -> 12;
               case 26 -> 14;
               case 27 -> 55;
               case 28 -> 11;
               case 29 -> 16;
               case 30 -> 45;
               case 31 -> 46;
               case 32 -> 9;
               case 33 -> 0;
               case 34 -> 50;
               case 35 -> 41;
               case 36 -> 63;
               case 37 -> 58;
               case 38 -> 4;
               case 39 -> 57;
               case 40 -> 17;
               case 41 -> 26;
               case 42 -> 5;
               case 43 -> 19;
               case 44 -> 35;
               case 45 -> 21;
               case 46 -> 18;
               case 47 -> 54;
               case 48 -> 56;
               case 49 -> 39;
               case 50 -> 20;
               case 51 -> 3;
               case 52 -> 28;
               case 53 -> 10;
               case 54 -> 36;
               case 55 -> 1;
               case 56 -> 13;
               case 57 -> 51;
               case 58 -> 15;
               case 59 -> 31;
               case 60 -> 49;
               case 61 -> 33;
               case 62 -> 53;
               default -> 43;
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

            f5430[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f5429[0] = "r(&w\u001cOn2$+\u0006[~1o˂";
      f5429[1] = "`J@U3H|PB\t)\\lS\tȏ";
      f5429[2] = "kz~h=\u0015kzi41\u001aq1i*1\u000fv@=rf";
      f5429[3] = "\u001f7\u0004)6\u000b\u001f7\u0013u:\u0004\u0005|\u0013k:\u0011\u0002\rB4nR";
      f5429[4] = "IwiIpxUmk\u0015jlEn ɡ";
      f5429[5] = int.class;
      f5430[5] = "java/lang/Integer";
      f5429[6] = "7\nF\u007f\u0016\u0006;\u000e\u001aw\u0012\u0000{)Ud\u000b\u001d:\u0005QW2 ";
      f5429[7] = "qQ}<\u001dO}U!4\u0019I=yM4\u001bIg_a09R|Ff1\fR";
      f5429[8] = "1)5KQA=-iCUG}\u0001\u0005CWG'')G";
      f5429[9] = "}yx;z\u007faczg`kq`1֕";
      f5429[10] = boolean.class;
      f5430[10] = "java/lang/Boolean";
      f5429[11] = ";\\\u001b\u0017\u000b^;\\\fK\u0007Q!\u0017\fU\u0007D&f]\nU\u000f";
      f5429[12] = " \u0007p<\t1,\u0003,4\r7l\u0016p:\u001e;1\u0015,\u001c>+1\u0012m8:1#\nR'\u0012='\u0015q";
      f5429[13] = "s#\u001d\t)\u001e\u007f'A\u0001-\u0018?!\u0000\r0\u0010\u007f&A\r<\u001fp%\n\u0012s8R-\u0002\r<\u001fu\u000f\u000e\u000e<\u0016t0";
      f5429[14] = "\u0002tY\u0006\u000f6\t{HIr.\u001a|A\u0000";
      f5429[15] = "\u0005;Mx\u000b?\u0019!O$\u0011+\t\"\u00045\u0015#\u000f'^x\u0018:\u0003gm:\u0016(\u000b%Y";
      f5429[16] = "!\u0016ID\u0010N!\u0016^\u0018\u001cA;]^\u0006\u001cT<,\u000e[M";
      f5429[17] = "W{J\u0016w([\u007f\u0016\u001es.\u001bjJ\u0010`\"Fi\u00166A2\\v\\\u001aq\u0017Gu[\u001ap4";
      f5429[18] = "$\u001a\u0000P:r(\u001e\\X>th\u000b\u0013M&t(\u001c\\^!|*\b\\~!|*";
      f5429[19] = void.class;
      f5430[19] = "java/lang/Void";
      f5429[20] = "\u0013bT\u0016\u0000&\u000fxVJ\u001a2\u001f{\u001dШ";
      f5429[21] = "v,9Uu1}#(\u001a\u0014?v(,@";
      f5429[22] = "AJ\u0019\u0006gY\u0005O[7l2DO\u0014ZkLD\u000b\u0005H\u0005\u000bC\u0000\bY{\u000b\u0007\u0011\u001a7";
      f5429[23] = "\u001fN;R\u001bX^G TuLBV\u000eX\u001cS/A>\u0001\u000f\u000f^\u00131N\u000b7CK3R\u000bWAU%\u000eu";
      f5429[24] = "TZ=\u000e@\u0003QO.\u000f#_\u0000C2\tOmP\u0000iS#\u0000\u0006\u0003)VM]\\\u00051n";
      f5429[25] = "PPi\u000e%|\u0001\\']@ɜj\u00190Y=;SSjX2\u0005";
      f5429[26] = "[\u001a46+ \u001f\u001fv\u0007ĂK\\G#zwr\u0016\u001d\"u";
      f5429[27] = "#zb7Eyaw>::kri\u0001<]z~y4<:9~odz\\ycg7F";
      f5429[28] = "|n`\u001eF`<shMzi,sBY\u001bc(uki\u0013| s}E\u0017\u0006|h+]Ed:2bJz";
      f5429[29] = "J]:n8B\u0006T:i\u0006ӹt\u0005;2fK\u001d\u00016)x+";
      f5429[30] = "\u0016\u007frf\u0019'\u0013jagz{Bf}a\u0016I\u0015& ?G\u001e\u001f!\">\u0010u\u0013#mgz";
      f5429[31] = "U)1A\u001b7\u0013sxV$:\u00052KB_)\u000f+OXM104gTI.\u0013N0[^8\u0006!qRE>h";
      f5429[32] = "HL\\Mh\u0001\b\u0018\n^\u0005R\t\u001bYSyRyGB@h\u0005I\u001cBEf?F\u0017UNeVB\u001aNP\u0005";
      f5429[33] = "A\u0013(7AJA\u0012&w(NCp\"5\u0018ZQA)sSH";
      f5429[34] = "\u0016k\u000e&4jRnL\u0017Թ\u0001\u00116\u0019jh8[l\u0018e";
      f5429[35] = "P>\u000eT\u0013k\u0016dGC,f\u0000%uWMm\u00014ErVn\u00064DQ,b]6\u000e\u0017A4R%_*";
      f5429[36] = "XSZ\u0017\u0005N\u0019ZA\u0011kZ\u0005Ko\u001d\u0002E!QL\"\u0002]\b7K\u0005U[PF\u0019\n\u001a_h[A\b\u0006_\bY_\u001eZ!";
      f5429[37] = "\u0018Y0\t\u0017G^\u0003y\u001e(JHBJ\u0010M@LXm2ACLQl\r(\u0014\u001fPb\u001a\u0016TK\u0006qw";
      f5429[38] = "oy*\u0018s\td?a\n\nVd/~\u0005]\u0001:x&i3]j\"yP6Hy#";
      f5429[39] = "\u0017zY\\\u0014H\u001fgVEeĥ{;CY^\u001d\u0012wJYY";
      f5429[40] = "\u0012c\\`s@DlO1NL\u0002\u001aX-/S\u0014S\f0)M\u0019:\b=2Sy";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f5429[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5430[var4]);
            f5429[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
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

   public static Field m126(long var0, long var2) {
      int var4 = m121(var0, var2);
      Object var5 = f5429[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5430[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f5429[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5429[var4] = var13;
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
               var12 = m123(1484232752184829L, 0L);
            }
         }
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

   public static Method m129(long var0, long var2) {
      int var4 = m121(var0, var2);
      Object var5 = f5429[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5430[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m123(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m127(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f5429[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(1484232752184829L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m128(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f5429[var4] = var19;
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
               var23 = m123(1484232752184829L, 0L);
            }
         }
      }
   }

   public static MethodHandle m130(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 211 && var8 != 'C' && var8 != 'z' && var8 != 170) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 240) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'E') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 211) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'C') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'z') {
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

   public static Object m131(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m130(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class342.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʛ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
