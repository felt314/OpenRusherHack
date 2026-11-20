package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

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
import net.minecraft.item.Item;

public enum AutoTotemAlternateitem {
   f3823,
   f3825,
   f3827,
   f3828;

   public Item f3824;
   // $VF: synthetic field
   public static long f3829 = Class066.m4320(5981596902190307053L, 6789096010319136896L, MethodHandles.lookup().lookupClass()).m4325(199681664583398L);
   public static Object[] f3830 = new Object[24];
   public static String[] f3831 = new String[24];

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
    }

   AutoTotemAlternateitem(Item var3) {
      this.f3824 = var3;
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
      if (f3831[var4] != null) {
         return var4;
      } else {
         Object var5 = f3830[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 50;
               case 1 -> 24;
               case 2 -> 23;
               case 3 -> 49;
               case 4 -> 36;
               case 5 -> 20;
               case 6 -> 56;
               case 7 -> 62;
               case 8 -> 14;
               case 9 -> 4;
               case 10 -> 1;
               case 11 -> 19;
               case 12 -> 13;
               case 13 -> 31;
               case 14 -> 41;
               case 15 -> 21;
               case 16 -> 57;
               case 17 -> 43;
               case 18 -> 55;
               case 19 -> 34;
               case 20 -> 3;
               case 21 -> 52;
               case 22 -> 42;
               case 23 -> 38;
               case 24 -> 40;
               case 25 -> 39;
               case 26 -> 27;
               case 27 -> 29;
               case 28 -> 9;
               case 29 -> 45;
               case 30 -> 35;
               case 31 -> 0;
               case 32 -> 26;
               case 33 -> 54;
               case 34 -> 5;
               case 35 -> 61;
               case 36 -> 22;
               case 37 -> 15;
               case 38 -> 28;
               case 39 -> 18;
               case 40 -> 10;
               case 41 -> 51;
               case 42 -> 47;
               case 43 -> 63;
               case 44 -> 17;
               case 45 -> 46;
               case 46 -> 60;
               case 47 -> 16;
               case 48 -> 37;
               case 49 -> 33;
               case 50 -> 12;
               case 51 -> 58;
               case 52 -> 53;
               case 53 -> 48;
               case 54 -> 59;
               case 55 -> 11;
               case 56 -> 32;
               case 57 -> 8;
               case 58 -> 25;
               case 59 -> 2;
               case 60 -> 7;
               case 61 -> 6;
               case 62 -> 44;
               default -> 30;
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

            f3831[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f3830[0] = "\rhzIGo\u0011rx\u0015]{\u0001q3ǂ";
      f3830[1] = "|a {c:UX<aafOL,b*Ʊ\u001c";
      f3830[2] = "g\u001ch\u0003\u007f\b{\u0006j_e\u001ck\u0005!Nb\u000fm@lB`\u0010i\u0000k\u0003h\u0005k\u000b\u007fYd\u0012f\u001d!nb\u0010e\u000faIH\u0005k\u000b\u007fYd\u0012f";
      f3830[3] = "&\u0004}Rq\u0010-\u000bl\u001d\f\b>\feT";
      f3830[4] = "#B\u0006\n\u0006e#B\u0011V\nj9\t\u0011H\n\u007f>xC\u001c[>";
      f3830[5] = "\u000fC7\u0015`\u0011\u000fC Il\u001e\u0015\b Wl\u000b\u0012yr\f4J";
      f3830[6] = "\u0018EK\th%\u0004_IUr1\u0014\\\u0002Du\"\u0012\u0019OHw=\u0016YH\tY?\u001aZMI~\u0005\u0003^@T";
      f3830[7] = "Vrh4\u0002,\u007fKt.\u0000pe_d-KƧ6";
      f3830[8] = "fKIw\u0010umDX8{wyG";
      f3830[9] = "UDS* \u0007^KBeM\u0007^VV";
      f3830[10] = "NG\u0005xj9EH\u00147\u000b7NC\u0010m";
      f3830[11] = "X\u001f\u007fQ1\u0006W_|lѪc\u0006Dw\u0010&\u001bQ\u0019n\u0017L";
      f3830[12] = "\u0002\bG\tE\u0007\rHD4\\b\u0002\bG\tE\u0007\rHD";
      f3830[13] = "iA}R@#hEdY|0>\u0019k_; WC{Y\u00022%GtLENm@nO\u001817LkV|pk\u0016v\u000e\u0011qo\u000f}2";
      f3830[14] = "`{\u001e(.Fo;\u001d\u0015ů#> \u0016i9[i}\u000fn";
      f3830[15] = "o8(0dw)v)a\n*Vsi\"wb))e'n\u0006lt,'ny6x)>\n";
      f3830[16] = "]\u007f\u0004\u00197[R?\u0007$/>]\u007f\u0004\u00197[R?\u0007";
      f3830[17] = "}\u000e^s\u001ekrN]NO\u000e}\u000e^s\u001ekrN]";
      f3830[18] = "\u0013\u0016w(Pr\u0015P6$<bICitk<\u0014\u00106\u0018\u0007vQ\u0017v'\u0007bR_";
      f3830[19] = "cna\u0006\u0003Ue( \noE9;\u007fZ8\u001bch$6TQ!o`\tTE\"'";
      f3830[20] = "wB\u001dj\u000f0x\u0002\u001eW\u001dUwB\u001dj\u000f0x\u0002\u001e";
      f3830[21] = "{@\u0015\u0004^DvZY^bSG\u0001\u0014\u0016\u001f\u001b8[\u0018\u0013\u0006\u007f}\u0006Q\u0013\u0006\u0000'\nT\nb";
      f3830[22] = "h\u0015S\u001d\u001e1nS\u0012\u0011r!2@MA%\u007fh\u0015\u0010-I5*\u0014R\u0012I!)\\";
      f3830[23] = "&$S4\"\u007f b\u00128No|qMh\u00191'!\u0014\u0004u{d%R;uogm";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f3830[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3831[var4]);
            f3830[var4] = var5;
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
      Object var5 = f3830[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3831[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f3830[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3830[var4] = var13;
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
               var12 = m123(768585034448913L, 0L);
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
      Object var5 = f3830[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3831[var4];
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
               f3830[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(768585034448913L, 0L);
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
                     f3830[var4] = var19;
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
               var23 = m123(768585034448913L, 0L);
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
         if (var8 != 'f' && var8 != 'U' && var8 != 'r' && var8 != 229) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'p') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 239) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'f') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'U') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'r') {
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

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoTotemAlternateitem.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ƥ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   AutoTotemAlternateitem() {}
}
