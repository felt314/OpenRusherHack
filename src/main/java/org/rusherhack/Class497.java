package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.core.setting.NullSetting;

import org.rusherhack.command.send;
import org.rusherhack.client.api.feature.module.impl.client.Windows;
public class Class497 extends NullSetting {
   public static long f8070 = Class066.m4320(-5425278354285965815L, 1204197988014994679L, MethodHandles.lookup().lookupClass()).m4325(129928993042530L);
   public static Object[] f8071 = new Object[21];
   public static String[] f8072 = new String[21];

   @Override
   public boolean shouldSerialize(boolean var1) {
      return false;
   }

   public Class497(Windows var1, String var2, Window var3) {
    }

   @Override
   public void setValue(Object var1) {
        
    }

   static {
      m122();
   }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8072[var4] != null) {
         return var4;
      } else {
         Object var5 = f8071[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 52;
               case 1 -> 15;
               case 2 -> 24;
               case 3 -> 14;
               case 4 -> 35;
               case 5 -> 1;
               case 6 -> 58;
               case 7 -> 59;
               case 8 -> 23;
               case 9 -> 29;
               case 10 -> 54;
               case 11 -> 12;
               case 12 -> 40;
               case 13 -> 27;
               case 14 -> 42;
               case 15 -> 9;
               case 16 -> 30;
               case 17 -> 25;
               case 18 -> 38;
               case 19 -> 11;
               case 20 -> 44;
               case 21 -> 34;
               case 22 -> 49;
               case 23 -> 16;
               case 24 -> 60;
               case 25 -> 21;
               case 26 -> 48;
               case 27 -> 18;
               case 28 -> 37;
               case 29 -> 31;
               case 30 -> 26;
               case 31 -> 62;
               case 32 -> 36;
               case 33 -> 6;
               case 34 -> 4;
               case 35 -> 51;
               case 36 -> 46;
               case 37 -> 2;
               case 38 -> 7;
               case 39 -> 50;
               case 40 -> 57;
               case 41 -> 19;
               case 42 -> 47;
               case 43 -> 0;
               case 44 -> 39;
               case 45 -> 55;
               case 46 -> 61;
               case 47 -> 3;
               case 48 -> 22;
               case 49 -> 56;
               case 50 -> 20;
               case 51 -> 45;
               case 52 -> 33;
               case 53 -> 63;
               case 54 -> 10;
               case 55 -> 32;
               case 56 -> 17;
               case 57 -> 5;
               case 58 -> 41;
               case 59 -> 13;
               case 60 -> 43;
               case 61 -> 28;
               case 62 -> 8;
               default -> 53;
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

            f8072[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f8071[0] = "45|PU\u001945k\fY\u0016.~k\u0012Y\u0003)\u000f;O\b";
      f8071[1] = "AC]U\bCJLL\u001atZELJVJJ";
      f8071[2] = void.class;
      f8072[2] = "java/lang/Void";
      f8071[3] = "\fL\u0012+\u0005!\u0010V\u0010w\u001f5\u0000U[Җ";
      f8071[4] = ",0\\8\u0007\b0*^d\u001d\u001c )\u0015u\u0019\u0014&,O8\u0014\r*l]s\u0014\t60^8\u0002\u0014-&Ta[**,_y\u0002";
      f8071[5] = "sDc\u001fB%o^aCX1\u007f]*R\\9yXp\u001fQ u\u0018C]_2}Zw";
      f8071[6] = "!s\u0004)\u001d\f=i\u0006u\u0007\u0018-jMι";
      f8071[7] = "c\u0005cR,h\u007f\u001fa\u000e6|o\u001c*\u001f2ti\u0019pRϑ";
      f8071[8] = ",:3_0z0 1\u0003*n #zĚ";
      f8071[9] = "t\n\u0010~4\u001bt\n\u0007\"8\u0014nA\u0007<8\u0001i0Pcn";
      f8071[10] = "\u000f,\u001a\u001e\u0005Y\u00136\u0018B\u001fM\u00035SЫ";
      f8071[11] = "QQ\u0010\u0002q\u000eZ^\u0001M\u0010\u0000QU\u0005\u0017";
      f8071[12] = "&X\nB$\u0001b\u000bR\u000f]ɛ\u001a[B\u000eaHz\u0004P^!q";
      f8071[13] = "'\u001a\u0018r\u001cEx\u0011IdvЊ\u001aB\u001f'\u0006\u0002j\u0006L\u007fK{";
      f8071[14] = "xpsl\u001bg/(nbrƓB,z6\u00185(hp}H";
      f8071[15] = "<X\b]Ol|\u0006\fO&5keYE\u0017(0\u0003]GK";
      f8071[16] = "\u000fUy,x\u0016P^(:\u0012Ζ2\f%x~B\fS.)h";
      f8071[17] = "yWd\u001e;n&\\5\bQƁD\r,\u0012>!>]=\u001e*P";
      f8071[18] = "@\u001b3McWD\u0019o56\\R\u0000eY\u0004\b\u001eP?\u0005S\bD\u0005?S:_\u0013\u0005r5j^K\u0006d\u000b<ND\u0019\u0002";
      f8071[19] = "]u\u001c\u0004.*\rd\u0010\u0010_5\u0004{\u001178\f\u0004}|P0k\tl\u0016\u0014: Y\u0005E\u0004:6\u0005;\u0013\u00145)c";
      f8071[20] = "\u001e\u0012t\u0012(0\u001a\u0010(j};\f\t\"\u0006OoMQzj&:\u0015\u0013\u007f\u001a{1\u0014XESw3\u0016\u000f{\u0005g<\ti";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f8071[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8072[var4]);
            f8071[var4] = var5;
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
      Object var5 = f8071[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8072[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f8071[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8071[var4] = var13;
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
               var12 = m123(830361900909837L, 0L);
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
      Object var5 = f8071[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8072[var4];
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
               f8071[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(830361900909837L, 0L);
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
                     f8071[var4] = var19;
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
               var23 = m123(830361900909837L, 0L);
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
         if (var8 != 232 && var8 != 'N' && var8 != 'I' && var8 != 'Q') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 196) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'j') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 232) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'N') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'I') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class497.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ғ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
