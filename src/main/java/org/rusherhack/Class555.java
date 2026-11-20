package org.rusherhack;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.rusherhack.core.logging.ILog;

import org.rusherhack.command.clear;
public class Class555 implements ILog {
   public List<Runnable> f8934;
   public AtomicBoolean f8935;
   public static long f8936 = Class066.m4320(-3035337214811365837L, -4233657211226213190L, MethodHandles.lookup().lookupClass()).m4325(157936644945341L);
   public static Object[] f8937 = new Object[38];
   public static String[] f8938 = new String[38];

   public Class555() {
      super();
      this.f8934 = new CopyOnWriteArrayList<>();
      this.f8935 = new AtomicBoolean();
   }

   @Override
   public void debug(String var1) {
      int var4 = Class253.m9155();
      if (var4 != 0) {
         if (Console.f8537 != null) {
            this.m17153();
            Console.f8537.m16406().add(var1, Color.BLUE.getRGB());
            return;
         }

         this.f8934.add(() -> {
            long var2x = f8936 ^ 41743097488992L;
            org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ñ", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), this,  var1,  -4950071967797484036L,  var2x);
         });
      }
   }

   @Override
   public void warn(String var1) {
      int var4 = Class253.m9154();
      if (var4 == 0) {
         if (Console.f8537 != null) {
            this.m17153();
            Console.f8537.m16406().add(var1, Color.ORANGE.getRGB());
            return;
         }

         this.f8934.add(() -> {
            long var2x = f8936 ^ 88948039473712L;
            org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ñ", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), this,  var1,  509468239289283278L,  var2x);
         });
      }
   }

   @Override
   public void error(String var1) {
      int var4 = Class253.m9155();
      if (var4 != 0) {
         if (Console.f8537 != null) {
            this.m17153();
            Console.f8537.m16406().add(var1, Color.RED.getRGB());
            return;
         }

         this.f8934.add(() -> {
            long var2x = f8936 ^ 33769077219873L;
            org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ñ", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), this,  var1,  -72015682523038708L,  var2x);
         });
      }
   }

   @Override
   public void info(String var1) {
      int var4 = Class253.m9154();
      if (var4 == 0) {
         if (Console.f8537 != null) {
            this.m17153();
            Console.f8537.m16406().add(var1, Color.LIGHT_GRAY.getRGB());
            return;
         }

         this.f8934.add(() -> {
            long var2x = f8936 ^ 13109079919340L;
            ((org.rusherhack.Class555)(this)).info(((java.lang.String)( var1)));
         });
      }
   }

   public void m17153() {
      if (!this.f8934.isEmpty() && !this.f8935.get()) {
         boolean var10004 = true;
         this.f8935.set(true);
         this.f8934.forEach(Runnable::run);
         this.f8934.clear();
         this.f8935.set(false);
      }
   }

   static {
      m122();
   }
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8938[var4] != null) {
         return var4;
      } else {
         Object var5 = f8937[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 32;
               case 1 -> 52;
               case 2 -> 31;
               case 3 -> 30;
               case 4 -> 20;
               case 5 -> 55;
               case 6 -> 3;
               case 7 -> 44;
               case 8 -> 9;
               case 9 -> 12;
               case 10 -> 26;
               case 11 -> 22;
               case 12 -> 25;
               case 13 -> 4;
               case 14 -> 11;
               case 15 -> 61;
               case 16 -> 15;
               case 17 -> 29;
               case 18 -> 63;
               case 19 -> 40;
               case 20 -> 14;
               case 21 -> 60;
               case 22 -> 28;
               case 23 -> 2;
               case 24 -> 54;
               case 25 -> 13;
               case 26 -> 5;
               case 27 -> 33;
               case 28 -> 58;
               case 29 -> 34;
               case 30 -> 41;
               case 31 -> 57;
               case 32 -> 38;
               case 33 -> 42;
               case 34 -> 18;
               case 35 -> 7;
               case 36 -> 48;
               case 37 -> 21;
               case 38 -> 27;
               case 39 -> 35;
               case 40 -> 49;
               case 41 -> 23;
               case 42 -> 45;
               case 43 -> 0;
               case 44 -> 62;
               case 45 -> 1;
               case 46 -> 51;
               case 47 -> 37;
               case 48 -> 53;
               case 49 -> 6;
               case 50 -> 56;
               case 51 -> 50;
               case 52 -> 46;
               case 53 -> 19;
               case 54 -> 59;
               case 55 -> 24;
               case 56 -> 16;
               case 57 -> 17;
               case 58 -> 43;
               case 59 -> 47;
               case 60 -> 36;
               case 61 -> 8;
               case 62 -> 39;
               default -> 10;
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

            f8938[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f8937[0] = "G\u0012W\u0015LJ[\bUIV^K\u000b\u001eԴ";
      f8937[1] = "*@0\u0011m\n!O!^\u0010\u00122H(\u0017";
      f8937[2] = void.class;
      f8938[2] = "java/lang/Void";
      f8937[3] = "\u0013$\fFu\n\r,\u0016\t\u0017\u0016\n1";
      f8937[4] = "2\u0005t5Yg,\rnz\u0014}6\u0007w&\u0005w6\u0010,5\u0003}5\raz6f7\tk75}7\bg5\u0019";
      f8937[5] = boolean.class;
      f8938[5] = "java/lang/Boolean";
      f8937[6] = "\u007f\u0014^px\u0005c\u000e\\,b\u0011s\r\u0017ɘ";
      f8937[7] = int.class;
      f8938[7] = "java/lang/Integer";
      f8937[8] = "l;\u007fz\u0007\u0000p!}&\u001d\u0014`\"6Ƞ";
      f8937[9] = "\u000fn\u001d<W4\u0011f\u0007s\u001f4\u000bl\u001f4\u0016/KL\u00043\n4\bj\u0019";
      f8937[10] = "\u001dV{^I8\u0016Yj\u0011(6\u001dRnK";
      f8937[11] = "\u001d-iB\u0005^\u00017k\u001e\u001fJ\u00114 Ҹ";
      f8937[12] = "[\b\nl2AG\u0012\b0(UW\u0011C!,]Q\u0014\u0019l!D]T\u0018+nC]\u0014\t-7\u001aB\u0013\b5nf]\u0019\u0005\u0016%L@,\u0004'7";
      f8937[13] = "=\u0002\u000fCKg \u0017Wa\nj8\u0011";
      f8937[14] = "\b]\u0001P:@\u0014F\u000ekŵx_\u0007\u0018\u00194D\u0015B\u0011\u0007";
      f8937[15] = "\u000bWd~D\u0015PG7{6\u0007]BU<\rBRZ7aX@^>lzS\r\nR.qRF0";
      f8937[16] = "9N7\n\ncs\u000b>\u001456o\u001fGGW$<\n\u007f\u001e\t`is{C\u000b=g\u0011&\u0016\t1\u0003";
      f8937[17] = "aQJm=6}JEVatvQYV56jI\u001dj}ae\u000e#ovk}\fO-}j66";
      f8937[18] = "\u0015%\u0014%\u00114\t>\u001b\u001eAj\u0016%}'\u0018j\u0007|AoOe@BDdE}B.\u0006oD6x";
      f8937[19] = "Gh\u0006&\n\u0013[s\t\u001dDBPio$\u0003MU1SlTB\u0012\u000fVg^Z\u0010c\u0014l_\u0011*";
      f8937[20] = "`U69c]cLfb\u001bԌ\\\u0010lm*\u0011:R-!}l";
      f8937[21] = "!Arl\u0007\u0003\"X\"7\u007fɫ\u001d\u0004(8NO{Fit\u00192";
      f8937[22] = "h\u0002w8/\u0000t\u0019x\u0003t88\u001b'e'Gx\u000e`>\u001e\u0005{\\x:aEn\u001b#\u0003";
      f8937[23] = "/\u0001~rA#3\u001aqIǇ\u001b{\u001cr8Jw9\u0017ssp";
      f8937[24] = "SIj .0\u0019\fc>\u0011b\u000e\u000eW;zliJg2jhVM\"k/\fP\u000e\u007f#+`\u0012\u0005~h\u0011";
      f8937[25] = "g8\u0015\u0019\u0004T4oMXmӝWb\u001aE\u0014V<8EW\u00024";
      f8937[26] = "\u000ePvfYNU@%c+HXEG$\u0010\u0019W]%yE\u001b[9";
      f8937[27] = "M.@+|$\u0017qR=\u001e&\u0011$-k&)\u0002v\u0011#q&EH\u0010b/~\u0000.R#c)}qW7ou\u00113\\6$O";
      f8937[28] = "^\u0019;a'`\rNc NInC89\u007fi\u000e\u0010oa>";
      f8937[29] = "\u001f\u001a\b`\u0019$UV\u0016icPjy%\u0018R$N\\\u0012&\u0018hPU";
      f8937[30] = "R\u0005\nY\u0016!\u0018I\u0014PlX9r,n!\u001fR\u0005\nY\u0016!\u0018I\u0014P";
      f8937[31] = "BOi\u0014)\u0016\b\n`\n\u0016K\u0003?|\u001ej[xN\"XtN\u001a\u0013wZx*";
      f8937[32] = "^_\f=2*\u0014\u0013\u00124HN\"-ltvt\u0017\u001bR>:j\u001e";
      f8937[33] = "nI3vPK$\u0005-\u007f*1\u001e8\u0013R}:\u0005>\u0002\u000e\u001bK?\u000f)0Q\u0007!\u0006";
      f8937[34] = "+\u000b;!\u000f\u00027\u00104\u001aRW,\u0011=\u001a\u0007\u0002 \u0013l&OU/TR#D_7V>aO^|l";
      f8937[35] = "DJwAMfXQxzǨ^\u0012D/\u0004\u000e7IT|\u0001";
      f8937[36] = "Q8y-vW\u001b}p3I\u0000\u000fh`%IR\u0011`xe%\u0010\u001aa3_";
      f8937[37] = "\u0010p\u0005C_uZ<\u001bJ%$L2?toK\u001c~T\nX-^?\u0018]%";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f8937[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8938[var4]);
            f8937[var4] = var5;
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
      Object var5 = f8937[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8938[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f8937[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8937[var4] = var13;
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
               var12 = m123(766731792190727L, 0L);
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
      Object var5 = f8937[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8938[var4];
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
               f8937[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(766731792190727L, 0L);
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
                     f8937[var4] = var19;
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
               var23 = m123(766731792190727L, 0L);
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
         if (var8 != 218 && var8 != 242 && var8 != 212 && var8 != 243) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 241) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'N') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 218) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 242) {
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

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class555.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ԏ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
