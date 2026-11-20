package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.FireworkRocketRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.util.collection.DefaultedList;

import org.rusherhack.client.api.feature.module.impl.misc.ExtraCraft;
public class Class260 extends FireworkRocketRecipe {
   public static long f4613 = Class066.m4320(1319133390230235857L, 8133049885949565167L, MethodHandles.lookup().lookupClass()).m4325(134241938446108L);
   public static Object[] f4614 = new Object[12];
   public static String[] f4615 = new String[12];

   public Class260(ExtraCraft var1, CraftingRecipeCategory var2) {
      super(var2);
   }

   public DefaultedList<Ingredient> getIngredients() {
      long var1 = f4613 ^ 28607049773217L;
      Ingredient var10000 = ((net.minecraft.recipe.Ingredient)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "j", java.lang.invoke.MethodType.methodType(net.minecraft.recipe.Ingredient.class, long.class, long.class)), -7496250400441242281L,  var1)));
      Ingredient[] var10001 = new Ingredient[4];
      boolean var10006 = true;
      var10001[0] = ((net.minecraft.recipe.Ingredient)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "P", java.lang.invoke.MethodType.methodType(net.minecraft.recipe.Ingredient.class, java.lang.Object.class, long.class, long.class)), new ItemConvertible[]{((net.minecraft.item.Item)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "j", java.lang.invoke.MethodType.methodType(net.minecraft.item.Item.class, long.class, long.class)), -7497147354493333198L,  var1)))},  -7497254165956647818L,  var1)));
      var10006 = true;
      var10001[1] = ((net.minecraft.recipe.Ingredient)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "P", java.lang.invoke.MethodType.methodType(net.minecraft.recipe.Ingredient.class, java.lang.Object.class, long.class, long.class)), new ItemConvertible[]{((net.minecraft.item.Item)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "j", java.lang.invoke.MethodType.methodType(net.minecraft.item.Item.class, long.class, long.class)), -7497206971370743748L,  var1)))},  -7497254165956647818L,  var1)));
      var10006 = true;
      var10001[2] = ((net.minecraft.recipe.Ingredient)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "P", java.lang.invoke.MethodType.methodType(net.minecraft.recipe.Ingredient.class, java.lang.Object.class, long.class, long.class)), new ItemConvertible[]{((net.minecraft.item.Item)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "j", java.lang.invoke.MethodType.methodType(net.minecraft.item.Item.class, long.class, long.class)), -7497206971370743748L,  var1)))},  -7497254165956647818L,  var1)));
      var10006 = true;
      var10001[3] = ((net.minecraft.recipe.Ingredient)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "P", java.lang.invoke.MethodType.methodType(net.minecraft.recipe.Ingredient.class, java.lang.Object.class, long.class, long.class)), new ItemConvertible[]{((net.minecraft.item.Item)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "j", java.lang.invoke.MethodType.methodType(net.minecraft.item.Item.class, long.class, long.class)), -7497206971370743748L,  var1)))},  -7497254165956647818L,  var1)));
      return ((net.minecraft.util.collection.DefaultedList)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "P", java.lang.invoke.MethodType.methodType(net.minecraft.util.collection.DefaultedList.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var10000,  var10001,  -7497318907841177796L,  var1)));
   }

   static {
      m122();
   }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f4615[var4] != null) {
         return var4;
      } else {
         Object var5 = f4614[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 8;
               case 1 -> 34;
               case 2 -> 21;
               case 3 -> 55;
               case 4 -> 29;
               case 5 -> 39;
               case 6 -> 45;
               case 7 -> 0;
               case 8 -> 6;
               case 9 -> 31;
               case 10 -> 9;
               case 11 -> 38;
               case 12 -> 62;
               case 13 -> 54;
               case 14 -> 18;
               case 15 -> 15;
               case 16 -> 5;
               case 17 -> 14;
               case 18 -> 23;
               case 19 -> 28;
               case 20 -> 36;
               case 21 -> 35;
               case 22 -> 46;
               case 23 -> 57;
               case 24 -> 37;
               case 25 -> 50;
               case 26 -> 27;
               case 27 -> 43;
               case 28 -> 7;
               case 29 -> 19;
               case 30 -> 59;
               case 31 -> 20;
               case 32 -> 3;
               case 33 -> 47;
               case 34 -> 61;
               case 35 -> 13;
               case 36 -> 40;
               case 37 -> 48;
               case 38 -> 49;
               case 39 -> 52;
               case 40 -> 11;
               case 41 -> 63;
               case 42 -> 58;
               case 43 -> 51;
               case 44 -> 22;
               case 45 -> 17;
               case 46 -> 30;
               case 47 -> 26;
               case 48 -> 25;
               case 49 -> 60;
               case 50 -> 44;
               case 51 -> 16;
               case 52 -> 10;
               case 53 -> 41;
               case 54 -> 56;
               case 55 -> 1;
               case 56 -> 32;
               case 57 -> 33;
               case 58 -> 2;
               case 59 -> 24;
               case 60 -> 42;
               case 61 -> 53;
               case 62 -> 12;
               default -> 4;
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

            f4615[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f4614[0] = "<m7:\u000fa<m f\u0003n&& x\u0003{!Wr,W>";
      f4614[1] = "P+nQ\u0001RP+y\r\r]J`y\u0013\rHM\u0011(L[\n";
      f4614[2] = "\u001c\u00177yc\u0016\u0017\u0018&6\u0002\u0018\u001c\u0013\"l";
      f4614[3] = "{K\u0014Y\u0016\u007f\u000ek\u001fV\u00070oe\u0014]\u0003j\u001b";
      f4614[4] = "B\u000bA\u0000_Zt.A\u0000H\u0006x![KH\u0018x4\\:\u001aM*r\u0014";
      f4614[5] = "}`~H(F}`i\u0014$Ig+i\n$\\`Z;^u\u001d";
      f4614[6] = "K3]\b\u0005KK3JT\tDQxJJ\tQV\t\u0018\u0011Q\u0010";
      f4614[7] = "V&\u001c,.\u0017E2\u0019L*\u0011U/\u000b\u001buH\u0001tg\")\u000bX!\u00001=\u000e";
      f4614[8] = "\u001c\u0013l*\"x\u000e\rrQ'v\u0018\tn=\u0015\"\\S0kB\"\u0001Tb)zc\u0000\u00157Qx+_\u0004n3!\"\u0001W\t)8~\u001f\tj;&`d";
      f4614[9] = "_}q\f;\u001dLitl4\u0017Mpm\u0000\u0006J\t!3lk\u0007\u000b i\u000b?\u0014@m\n\u0002<\u0001Qzm\u0011(\u00041";
      f4614[10] = "0\tG0;\fz\u0017N'\u0001Rj\u0000R-V\f3P\nA=\f;\u0016L1kLo\u0001";
      f4614[11] = "-\u0018Dx9zg\u0006Mo\u0003$w\u0011QeTz*D\n\t?z&\u0007Oyi:r\u0010";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f4614[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f4615[var4]);
            f4614[var4] = var5;
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
      Object var5 = f4614[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f4615[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f4614[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f4614[var4] = var13;
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
               var12 = m123(164043829690026L, 0L);
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
      Object var5 = f4614[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f4615[var4];
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
               f4614[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(164043829690026L, 0L);
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
                     f4614[var4] = var19;
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
               var23 = m123(164043829690026L, 0L);
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
         if (var8 != 'N' && var8 != 192 && var8 != 'j' && var8 != 'L') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'J') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'P') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'N') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 192) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'j') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class260.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ȑ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
