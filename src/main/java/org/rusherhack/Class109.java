package org.rusherhack;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.rusherhack.core.bind.IBindable;

import org.rusherhack.command.bind;
public class Class109 {
   public static long f2410 = Class066.m4320(1583960166974800104L, -8843324269497337286L, MethodHandles.lookup().lookupClass()).m4325(252019188154659L);
   public static Object[] f2411 = new Object[42];
   public static String[] f2412 = new String[42];

   public Class101 m5432(String var1) {
      if (this.m5436(var1) != null) {
         return null;
      } else {
         Class101 var6;
         (var6 = new Class101()).m5284(var1);
         Class170.f3364.m7119().register(var6);
         return var6;
      }
   }

   public List<Class101> m5433() {
      int var10000 = Class253.m9155();
      ArrayList var4 = new ArrayList();
      ObjectIterator var5 = Class170.f3364.m7119().getBindRegistry().keySet().iterator();
      int var3 = var10000;

      while (var5.hasNext()) {
         IBindable var7;
         IBindable var9 = var7 = (IBindable)var5.next();
         if (var3 != 0) {
            if (!(var9 instanceof Class101)) {
               continue;
            }

            var9 = var7;
         }

         Class101 var8 = (Class101)var9;
         var4.add(var8);
         if (var3 == 0) {
            break;
         }
      }

      return var4;
   }

   public boolean m5435(Class101 var1) {
      Class170.f3364.m7119().unregister(var1);
      boolean var10002 = true;
      return true;
   }

   public Class101 m5436(String var1) {
      long var2 = f2410 ^ 67928426011189L;
      int var10000 = Class253.m9155();
      Iterator var7 = this.m5433().iterator();
      int var4 = var10000;

      while (var7.hasNext()) {
         Class101 var6;
         Class101 var8 = var6 = (Class101)var7.next();

         while (((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "æ", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var8,  9134927934162715370L,  var2))).equalsIgnoreCase(var1)) {
            var8 = var6;
            if (var4 != 0) {
               return var6;
            }
         }
      }

      return null;
   }

   public boolean m5437(String var1) {
      Class101 var5;
      if ((var5 = this.m5436(var1)) == null) {
         return false;
      } else {
         Class170.f3364.m7119().getBindRegistry().remove(var5);
         boolean var10002 = true;
         return true;
      }
   }

   static {
      m122();
   }
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f2412[var4] != null) {
         return var4;
      } else {
         Object var5 = f2411[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 11;
               case 1 -> 25;
               case 2 -> 24;
               case 3 -> 0;
               case 4 -> 12;
               case 5 -> 23;
               case 6 -> 35;
               case 7 -> 50;
               case 8 -> 56;
               case 9 -> 31;
               case 10 -> 32;
               case 11 -> 61;
               case 12 -> 13;
               case 13 -> 52;
               case 14 -> 26;
               case 15 -> 39;
               case 16 -> 17;
               case 17 -> 2;
               case 18 -> 34;
               case 19 -> 47;
               case 20 -> 9;
               case 21 -> 7;
               case 22 -> 44;
               case 23 -> 43;
               case 24 -> 37;
               case 25 -> 55;
               case 26 -> 1;
               case 27 -> 62;
               case 28 -> 21;
               case 29 -> 54;
               case 30 -> 29;
               case 31 -> 20;
               case 32 -> 40;
               case 33 -> 42;
               case 34 -> 14;
               case 35 -> 19;
               case 36 -> 63;
               case 37 -> 57;
               case 38 -> 41;
               case 39 -> 38;
               case 40 -> 27;
               case 41 -> 10;
               case 42 -> 58;
               case 43 -> 3;
               case 44 -> 5;
               case 45 -> 16;
               case 46 -> 49;
               case 47 -> 51;
               case 48 -> 45;
               case 49 -> 36;
               case 50 -> 28;
               case 51 -> 15;
               case 52 -> 59;
               case 53 -> 4;
               case 54 -> 33;
               case 55 -> 8;
               case 56 -> 22;
               case 57 -> 53;
               case 58 -> 46;
               case 59 -> 60;
               case 60 -> 30;
               case 61 -> 18;
               case 62 -> 6;
               default -> 48;
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

            f2412[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f2411[0] = "hc\b\u000e+\u0002ty\nR1\u0016dzAÕ";
      f2411[1] = "<\u0004\\\u000e\u001c` \u001e^R\u0006t0\u001d\u0015ɔ";
      f2411[2] = "U0\u001a&(xI*\u0018z2lY)SȎ";
      f2411[3] = int.class;
      f2412[3] = "java/lang/Integer";
      f2411[4] = ",Xtq^80Bv-D, A=Ĵ";
      f2411[5] = "\r\u0013!miz\u0011\t#1sn\u0001\nh t}\u0007O$*ukL#/-\u007fB\u0003\u000f'$~} \u00005&";
      f2411[6] = "jIRi\u007f_nTRxb_-[\u001doeCwT\u00102~TiX\u001fhb\u0018L_\u0016yrB1r\u001evtUwp\u001dl";
      f2411[7] = "t \rM\u0015Q\u007f/\u001c\u0002hIl(\u0015K";
      f2411[8] = "\u00116}]&.\r,\u007f\u0001<:\u001d/4\u0099";
      f2411[9] = "\u0001ft\u001f\u001cU\u001d|vC\u0006A\r\u007f=ϙ";
      f2411[10] = "\u0014_\u007f/L8\u001fPn`-6\u0014[j:";
      f2411[11] = char.class;
      f2412[11] = "java/lang/Character";
      f2411[12] = "\u0012CKot\u0014\u000eYI3n\u0000\u001eZ\u0002\"i\u0013\u0018\u001fN(h\u0005Sxn(h\u0005\u001cS@$";
      f2411[13] = void.class;
      f2412[13] = "java/lang/Void";
      f2411[14] = "3f\t[\u001dx7{\tJ\u0000xttF]\u0007d.{K\u0000\u001cs0wDZ\u0000?\u0015pMK\u0010e\twS";
      f2411[15] = "uXB~!pqEBo<p2J\rx;lhE\u0000% {vI\u000f\u007f<7SN\u0006n,mUX\ty.ms^";
      f2411[16] = "\u0001\u001aljB^\u001f\u0012v%%_\u000e\t{\u007f\u0003Y";
      f2411[17] = "kVs'PXu^ih2DrC";
      f2411[18] = boolean.class;
      f2412[18] = "java/lang/Boolean";
      f2411[19] = "PX:4B1LB8hX%\\Asy\\-ZD)4Q4V\u0004?s^ \u0011c\u001fs^ rK3{W!M";
      f2411[20] = "[/^V~.\b*L0xL\u0017tJPk+\u000bkJ0m*\u0000r[Wq5\u0000\u0012";
      f2411[21] = "^P\u0014'\u000b\u0005\u000e\u0019\u0012/f^K\u0005R(\u001aXMhA!\u0017Z\u000f\u000eR\"[\u00067";
      f2411[22] = "6\u000bu\u000f\u000ei2YnEge1\u0012y4X;$\u00025\u000b\u0004<b\u001b\u0005";
      f2411[23] = "e\u000b\u001dg\u0003?\u007f\n\u000bx`,c\u0019y5X=oEFi_{vu\u00152\u0012/}\u0016\u0000c\u001c|\u000f";
      f2411[24] = "$?O mjgqNr\u0002У\u001a=\u0018cakh}\u0018z3V+mN|\u007fla<Rd\u0002";
      f2411[25] = "\u001ab5ug\r\u001a~8 \u0002AG\u007fi\u007fcG]h~\u00102LO}{v=FS{\u0004!oPBx>k>LZ\u0005";
      f2411[26] = "\u0010\u0012\u000b\u000fJ-N\rT^$Ԣ)O[\u0005F(Q\r\u0018\u0001XB";
      f2411[27] = "y2m\b&#'-2YHȕ@o=\u0002*&8-~\u00064L";
      f2411[28] = "\u0000OUf7bDLTkSϠ:\u000eW.b:\u0006JT/o";
      f2411[29] = "URmxq\u0016\u0006W\u007f\u001eʿt\u000f\u0011vs}\u000e\u0015\u0010`l\u001e";
      f2411[30] = "R%\u0004}P(F6T|:?S(\u000bvF(DGZ}T=A!UwH;>v\u0007aY8\u0004<V}AE";
      f2411[31] = "K\\!&=6\u000b\\8t\u0000 \u001b\u000029`DLY8'j<\u000e\u001a<9\u0000";
      f2411[32] = "\u0018I*6\r#B\u0018'km|IV\u0012d\u0011\u001fM\u001fuo\u0000%\u001dVsgm";
      f2411[33] = "\r_[\u001a<g\u0017^M\u0005_|\u001bLE\u001e#z\u001d!U\u001e/&\u000eKQL4lg";
      f2411[34] = ")\u001f+w55jQ*%Zfz\\\u0000!?d\u0017\u001d|494e]|-k\t";
      f2411[35] = "W[`qW\u0013WGm$2M\u0001@\u001buTN6Q>uI^\u0016MQ(\\AS\\mr\rL\u000e<";
      f2411[36] = "'ebY('t`p?ğE*ba\\z7jbx\u000eG{(5\"P{8f4p?";
      f2411[37] = "5\u001cP\u0001.xq\u001fQ\fJǐ\u000fYU\u000f&#u\u000bVLpD";
      f2411[38] = "\u0013R\u00078|&\u0017\u0000\u001cr\u0015,\u0010@1ne0yWOq\u007f>\u001aB\u001e\u007f,L";
      f2411[39] = "9\u0011E#\u001bQc@H~{\u0017h\u001aAb\u0016m:G^|KRf@\u0018e{R=\u0007F,D\u000e:A_\u001c";
      f2411[40] = "/M*\u0002\u0015\u0016oM3P(\u000fr\u001e,(Td(H3\u0003B\u001cj\u000b7\u001d(T.\u0018;\u0002I\u0016\"\u000f+a";
      f2411[41] = "H\u001a\u001ei;u\b\u001a\u0007;\u0006j\f]\u000bn}F\u001aF\u0005pkL\u001c[\u000f\n;=\tC_x{=\u0010\u0011bf>u\u001fR\u0001so{L ";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f2411[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f2412[var4]);
            f2411[var4] = var5;
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
      Object var5 = f2411[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f2412[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f2411[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f2411[var4] = var13;
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
               var12 = m123(712916302510178L, 0L);
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
      Object var5 = f2411[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f2412[var4];
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
               f2411[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(712916302510178L, 0L);
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
                     f2411[var4] = var19;
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
               var23 = m123(712916302510178L, 0L);
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
         if (var8 != 240 && var8 != 194 && var8 != 209 && var8 != 186) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 230) {
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
            if (var8 == 240) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 194) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 209) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class109.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/õ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
