package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// $VF: synthetic class
public class Class368 {
   public static Object[] f6022 = new Object[19];
   public static String[] f6023 = new String[19];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f6023[var4] != null) {
         return var4;
      } else {
         Object var5 = f6022[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 9;
               case 1 -> 7;
               case 2 -> 23;
               case 3 -> 16;
               case 4 -> 41;
               case 5 -> 5;
               case 6 -> 14;
               case 7 -> 1;
               case 8 -> 55;
               case 9 -> 8;
               case 10 -> 24;
               case 11 -> 42;
               case 12 -> 54;
               case 13 -> 10;
               case 14 -> 19;
               case 15 -> 63;
               case 16 -> 43;
               case 17 -> 35;
               case 18 -> 33;
               case 19 -> 32;
               case 20 -> 58;
               case 21 -> 40;
               case 22 -> 13;
               case 23 -> 53;
               case 24 -> 56;
               case 25 -> 4;
               case 26 -> 2;
               case 27 -> 38;
               case 28 -> 15;
               case 29 -> 36;
               case 30 -> 27;
               case 31 -> 61;
               case 32 -> 25;
               case 33 -> 31;
               case 34 -> 39;
               case 35 -> 48;
               case 36 -> 29;
               case 37 -> 12;
               case 38 -> 44;
               case 39 -> 3;
               case 40 -> 51;
               case 41 -> 52;
               case 42 -> 26;
               case 43 -> 11;
               case 44 -> 22;
               case 45 -> 57;
               case 46 -> 30;
               case 47 -> 46;
               case 48 -> 59;
               case 49 -> 37;
               case 50 -> 34;
               case 51 -> 18;
               case 52 -> 17;
               case 53 -> 60;
               case 54 -> 45;
               case 55 -> 0;
               case 56 -> 20;
               case 57 -> 62;
               case 58 -> 28;
               case 59 -> 49;
               case 60 -> 47;
               case 61 -> 50;
               case 62 -> 21;
               default -> 6;
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

            f6023[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f6022[0] = "'R=']j;H?{G~+Ktΐ";
      f6022[1] = "\u0004\u0019";
      f6022[2] = " `uv$\u0005<zw*>\u0011,y<;9\u0002*<w.3\u001e;<a,7\u0017*<A,7\u0017*";
      f6022[3] = "S)kfOtz\u0010w|M(`\u0004g\u007f\u00069g\u0017a:M,m\u000bp:[.i\u0002a:{.i\u0002a/";
      f6022[4] = "\u0012\u007fi\u0005\u001d\n\u000eekY\u0007\u001e\u001ef Ŗ";
      f6022[5] = int.class;
      f6023[5] = "java/lang/Integer";
      f6022[6] = "V\u00156&<'\u007f,*<>{e8:?uŴ6";
      f6022[7] = "tT";
      f6022[8] = "9W\u0016*|\u000f2X\u0007e\u001d\u00019S\u0003?";
      f6022[9] = "\u0007)\u000f<cp\u000f1\u0017WՒ\u0014[&\u0004-*/\u00040\u001a'";
      f6022[10] = "\u0013\u000e0Q,\u007f\u0016HtQLDsz\t\u000eu%LWj\u000b3aL";
      f6022[11] = "or\u00117\u0003U-n\u0010j~V<hQb\u0005(ioLoOBoqR6~";
      f6022[12] = "FgkVG\u0005C!/V'>;\u0005\u000e3\u001d_E;2P\u0018\u0019\u0001;";
      f6022[13] = "\u0013\u000b\u000bs_gQ\u0017\n.\"6)OHv\u001agT\rTwG";
      f6022[14] = "~p~`UR{6:`5O--:hN1~0*4VV((#n5";
      f6022[15] = "TBD_%@\u0016^E\u0002Xpn\u0006\u0007Z`@\u0013D\u001b[=";
      f6022[16] = "\u0007]a\u0000'=\u000fEykĄY[Rj\u0011nb\u0004Dt\u001b";
      f6022[17] = "n;rlUSk}6l5W.n*o\\TT9)`KIi|'oY0";
      f6022[18] = "M)\u0018\u0019+V\u000f5\u0019DVL\r;DG?OwlGH(RJ)IG:+";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f6022[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f6023[var4]);
            f6022[var4] = var5;
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
      Object var5 = f6022[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f6023[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f6022[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f6022[var4] = var13;
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
               var12 = m123(629570598504610L, 0L);
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
      Object var5 = f6022[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f6023[var4];
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
               f6022[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(629570598504610L, 0L);
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
                     f6022[var4] = var19;
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
               var23 = m123(629570598504610L, 0L);
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
         if (var8 != 209 && var8 != 241 && var8 != 212 && var8 != 233) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 201) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 237) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 209) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 241) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 212) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class368.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ι" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
