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
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;

public enum QuiverSecondary {
   f5143,
   f5146;

   public RegistryEntry<StatusEffect> f5144;
   // $VF: synthetic field
   public static long f5147 = Class066.m4320(-3419404974843841540L, -6137817601414524919L, MethodHandles.lookup().lookupClass()).m4325(260058367647801L);
   public static Object[] f5148 = new Object[20];
   public static String[] f5149 = new String[20];

   QuiverSecondary(RegistryEntry<StatusEffect> var3) {
      this.f5144 = var3;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5149[var4] != null) {
         return var4;
      } else {
         Object var5 = f5148[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 56;
               case 1 -> 61;
               case 2 -> 42;
               case 3 -> 54;
               case 4 -> 19;
               case 5 -> 10;
               case 6 -> 2;
               case 7 -> 58;
               case 8 -> 12;
               case 9 -> 3;
               case 10 -> 14;
               case 11 -> 39;
               case 12 -> 0;
               case 13 -> 18;
               case 14 -> 1;
               case 15 -> 44;
               case 16 -> 52;
               case 17 -> 15;
               case 18 -> 32;
               case 19 -> 30;
               case 20 -> 41;
               case 21 -> 29;
               case 22 -> 35;
               case 23 -> 62;
               case 24 -> 5;
               case 25 -> 40;
               case 26 -> 51;
               case 27 -> 60;
               case 28 -> 50;
               case 29 -> 16;
               case 30 -> 47;
               case 31 -> 63;
               case 32 -> 13;
               case 33 -> 8;
               case 34 -> 27;
               case 35 -> 20;
               case 36 -> 6;
               case 37 -> 28;
               case 38 -> 4;
               case 39 -> 46;
               case 40 -> 57;
               case 41 -> 23;
               case 42 -> 26;
               case 43 -> 49;
               case 44 -> 17;
               case 45 -> 34;
               case 46 -> 7;
               case 47 -> 48;
               case 48 -> 38;
               case 49 -> 22;
               case 50 -> 31;
               case 51 -> 59;
               case 52 -> 21;
               case 53 -> 25;
               case 54 -> 53;
               case 55 -> 43;
               case 56 -> 24;
               case 57 -> 45;
               case 58 -> 9;
               case 59 -> 55;
               case 60 -> 36;
               case 61 -> 33;
               case 62 -> 11;
               default -> 37;
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

            f5149[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f5148[0] = "7P=e\u001aP+J?9\u0000D;Itȡ";
      f5148[1] = "%|\u0017c3\u001d\fE\u000by1A\u0016Q\u001bzzəE";
      f5148[2] = "\rE\u000eR\n]\u0006J\u001f\u001da_\u0012I";
      f5148[3] = "7_Ce^1<PR*31<MF";
      f5148[4] = ")\u0015fc\u0011\"\"\u001aw,l:1\u001d~e";
      f5148[5] = "Op\n\u0007g\u000eSj\b[}\u001aCiCJy\u0012El\u0019\u0007ό";
      f5148[6] = "C4AK\u001d%_.C\u0017\u00071O-\b\u0006\u0000\"IhE\n\u0002=M(BK\u001f\"C%C\u0016\u001c9B!\b&\u0000=A'H\u0001?\"C%C\u0016\u001c9B!u\f\u0001;";
      f5148[7] = "+HpfL`\u0002ql|N<\u0018e|\u007f\u0005ȤK";
      f5148[8] = "\f<pSsc\f<g\u000f\u007fl\u0016wg\u0011\u007fy\u0011\u00065O'>";
      f5148[9] = "Z2z]P\u0019Z2m\u0001\\\u0016@ym\u001f\\\u0003G\b8K\u0005@";
      f5148[10] = "`D}\u00056|kKlJWr`@h\u0010";
      f5148[11] = "NB:\u0004P1\u0017\u0007}B2ʑu\u00019\u000eCp\u000f\u0002yR_\fOGtNNvL\u0007(R2";
      f5148[12] = "G\u001af2t\u001cI\u0013aV1fG\u001af2t\u001cI\u0013a";
      f5148[13] = "!Kd\u001c!M/Bcxĝ7,\u0005p\t&Ru]&GH";
      f5148[14] = "` 8.}\u001c&f:t\r\u000e<0`$Z]ld<H3\u000e#eo5p\u001ac=";
      f5148[15] = "\u0010f)d:X\u001eo.\u00006\"\u0010f)d:X\u001eo.";
      f5148[16] = "\u0019M\u001a?r,\u0018V\u0018zK7IW\fn\f' \t\u001d~-y\u001c\f\u001a< I\u001aO@r73\u0019\u000f\u001cnKp^XM:.qEZ\b\u0003";
      f5148[17] = "w\u0001'w\u0000&1G%-p4+\u0011\u007f}'g{D'\u0011N44Dpl\r t\u001c";
      f5148[18] = ".*;Y\b\u0014-(*\u00027Y\u0012r+\nF\thqkVZu(4fJK\u000f+t:V7";
      f5148[19] = "ku~/\u0007Me|yKŏ7f;j:\u0000R?c<t";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f5148[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5149[var4]);
            f5148[var4] = var5;
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
      Object var5 = f5148[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5149[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f5148[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5148[var4] = var13;
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
               var12 = m123(721840963751702L, 0L);
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
      Object var5 = f5148[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5149[var4];
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
               f5148[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(721840963751702L, 0L);
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
                     f5148[var4] = var19;
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
               var23 = m123(721840963751702L, 0L);
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
         if (var8 != 204 && var8 != 218 && var8 != 'y' && var8 != 192) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 212) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'f') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 204) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 218) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'y') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(QuiverSecondary.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ɪ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   QuiverSecondary() {}
}
