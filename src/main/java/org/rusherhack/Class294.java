package org.rusherhack;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.Closeable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class294 implements Closeable {
   public Class153 f4937;
   public static String f4938;
   public static long f4939 = Class066.m4320(-569715232998101046L, -998428947129067631L, MethodHandles.lookup().lookupClass()).m4325(252299213566345L);
   public static Object[] f4940 = new Object[27];
   public static String[] f4941 = new String[27];

   public void m10030() {
      this.f4937.m6740();
   }

   @Override
   public void close() {
      long var1 = f4939 ^ 55034882758410L;
      org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "n", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), this.f4937,  -2090938550567205768L,  var1);
   }

   public void m10031(Class253 var1) {
      int var7 = Class253.m9154();
      RenderSystem.disableCull();
      int var4 = var7;
      RenderSystem.enableBlend();
      Class253 var8 = var1;
      if (var4 == 0) {
         if (var1 != null) {
            var1.m9149();
         }

         this.f4937.m6739();
         if (var4 != 0) {
            return;
         }

         var8 = var1;
      }

      if (var8 != null) {
         var1.m9152();
      }

      RenderSystem.disableBlend();
      RenderSystem.enableCull();
   }

   public Class294(Class153 var1) {
      this.f4937 = var1;
   }

   public void m10033() {
      this.f4937.m6725();
   }

   public Class153 m10034() {
      return this.f4937;
   }

   public static void m10035(String var0) {
      f4938 = var0;
   }

   public static String m10036() {
      return f4938;
   }

   static {
      m122();
      if ("Powahc" == null) {
         m10035("Powahc");
      }
   }
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f4941[var4] != null) {
         return var4;
      } else {
         Object var5 = f4940[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 27;
               case 1 -> 54;
               case 2 -> 36;
               case 3 -> 48;
               case 4 -> 2;
               case 5 -> 41;
               case 6 -> 12;
               case 7 -> 9;
               case 8 -> 33;
               case 9 -> 28;
               case 10 -> 52;
               case 11 -> 11;
               case 12 -> 10;
               case 13 -> 44;
               case 14 -> 47;
               case 15 -> 5;
               case 16 -> 13;
               case 17 -> 39;
               case 18 -> 57;
               case 19 -> 43;
               case 20 -> 20;
               case 21 -> 22;
               case 22 -> 14;
               case 23 -> 23;
               case 24 -> 18;
               case 25 -> 42;
               case 26 -> 45;
               case 27 -> 25;
               case 28 -> 55;
               case 29 -> 21;
               case 30 -> 1;
               case 31 -> 6;
               case 32 -> 60;
               case 33 -> 15;
               case 34 -> 56;
               case 35 -> 4;
               case 36 -> 31;
               case 37 -> 49;
               case 38 -> 16;
               case 39 -> 7;
               case 40 -> 37;
               case 41 -> 29;
               case 42 -> 51;
               case 43 -> 53;
               case 44 -> 26;
               case 45 -> 62;
               case 46 -> 3;
               case 47 -> 63;
               case 48 -> 30;
               case 49 -> 38;
               case 50 -> 35;
               case 51 -> 34;
               case 52 -> 59;
               case 53 -> 50;
               case 54 -> 40;
               case 55 -> 24;
               case 56 -> 61;
               case 57 -> 0;
               case 58 -> 17;
               case 59 -> 8;
               case 60 -> 32;
               case 61 -> 58;
               case 62 -> 46;
               default -> 19;
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

            f4941[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f4940[0] = "fx`\u001eqAzbbBkUja)ɺ";
      f4940[1] = "3{\u0014xj-8t\u00057\u00175+s\f~";
      f4940[2] = void.class;
      f4941[2] = "java/lang/Void";
      f4940[3] = "<\u0016r+\u0000n \fpw\u001az0\u000f;ŕ";
      f4940[4] = "\u0002\u0017\"Ct\u0010\u000b\u0019!\n7\u001d\r\u00195\b*\u001bO\u000b6\u001em\u001a\f\u000ba?|\u0011\u0005\u001d=>`\f\u0015\u001d\"";
      f4940[5] = "\f0\u007f(2l\u0010*}t(x\u0000)6ɲ";
      f4940[6] = "Qq ;BnMk\"gXz]hiȓ";
      f4940[7] = int.class;
      f4941[7] = "java/lang/Integer";
      f4940[8] = char.class;
      f4941[8] = "java/lang/Character";
      f4940[9] = "p YIF/{/H\u0006'!p$L\\";
      f4940[10] = "?\b\\KG[%C\u0007:Ӎ)eB\u001d\u0002\u000eE\"A\u0003H~\u0010#C\u0002Y\u0017[eFU:";
      f4940[11] = "qJwJ==&[aUPi,OfT=O7Bh0i{q@oY\"=t\u0017\f";
      f4940[12] = "n7H0,=;i\u0018j\u001530>Rd\u0015a+bOj|*mg\u0018\t";
      f4940[13] = "n0L$_+;n\u001c~fĬTgR&\u0000-=,\u0014#WN";
      f4940[14] = "=:Wh\u0018\u0011'q\f\u0019Hce2\u001deZ\n8r\u0006&!X&8\u0013bH\u0005f#P\u0019";
      f4940[15] = "\u0000=c~8ED`&:Fɠ<0n4=B\u0007h;k&9";
      f4940[16] = "cm0)B\u00024|&6/W9z\"9KV\u0013|/7/\u0002':-0FIa?zS";
      f4940[17] = "k\u0007/3%\u0019,\u00041yU\u0011?[9w5uo\rfp.N7X9kU";
      f4940[18] = "$sj|FEq-:&\u007fʟ\u001e$t~\u0019Cwo2{N ";
      f4940[19] = "\u007f\"ov\u0005z*|?,<ÙEuqtZ|,>7q\r\u001f";
      f4940[20] = "\u001f\u0019k\n\u001aZ[D.Ndä#\u0010)K\u0002EJ[oNU&";
      f4940[21] = "\"p<F\u0003If-y\u0002}Π\u001ey~\u0007\u001bVw28\u0002L5";
      f4940[22] = "ny\u0007wz|9h\u0011h\u0017)4n\u0015gs(\u001fq\u0011k{EljGkt,',B<\u0017";
      f4940[23] = "4\u007f\u001c=>\t.4GLȟ{n5]tw\u0017)6C>\u0007";
      f4940[24] = "\u0016\u0016h\u001cxc\f]3mҫ\u0011O\b1Txt\u001aVa\u000e";
      f4940[25] = "bP^mv_%S@'\u0006X;\u0003]\u001cz3fZ\u0017.}\b>\u000fH5\u0006\reTK)eN:\u0013EU";
      f4940[26] = "1\u001fzZD4f\u000elE)`l\u001akDDGn\u001egL)4uHgC@\u007f3M0 ";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f4940[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f4941[var4]);
            f4940[var4] = var5;
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
      Object var5 = f4940[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f4941[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f4940[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f4940[var4] = var13;
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
               var12 = m123(688910822264826L, 0L);
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
      Object var5 = f4940[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f4941[var4];
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
               f4940[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(688910822264826L, 0L);
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
                     f4940[var4] = var19;
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
               var23 = m123(688910822264826L, 0L);
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
         if (var8 != 224 && var8 != 'L' && var8 != 'M' && var8 != 192) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'n') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'a') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 224) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'L') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'M') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class294.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ɋ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
