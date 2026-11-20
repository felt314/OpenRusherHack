package org.rusherhack;

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

public class Class467 {
   public Class133 f7471;
   public static int[] f7472;
   public static long f7473 = Class066.m4320(3797758480345395095L, -6508598837869044065L, MethodHandles.lookup().lookupClass()).m4325(18452605774091L);
   public static Object[] f7474 = new Object[47];
   public static String[] f7475 = new String[47];

   public Class086 m14527(String var1) {
      long var2 = f7473 ^ 54374854994278L;
      int var10000 = Class253.m9154();
      Iterator var7 = this.f7471.m5251().iterator();
      int var4 = var10000;

      while (var7.hasNext()) {
         Class086 var6;
         Class086 var8 = var6 = (Class086)var7.next();

         while (((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "W", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var8,  3796978472234163901L,  var2))).equalsIgnoreCase(var1)) {
            var8 = var6;
            if (var4 == 0) {
               return var6;
            }
         }
      }

      return null;
   }

   public void m14528(Class086 var1) {
      this.f7471.m5251().remove(var1);
      Waypoints.f6507.m12772();
   }

   public List<Class086> m14529(String var1) {
      int var10000 = Class253.m9154();
      ArrayList var5 = new ArrayList();
      int var4 = var10000;
      Iterator var8 = this.f7471.m5251().iterator();

      while (var8.hasNext()) {
         Class086 var7;
         boolean var9 = (var7 = (Class086)var8.next()).m4936().equalsIgnoreCase(var1);
         if (var4 == 0) {
            if (!var9) {
               continue;
            }

            var5.add(var7);
         }

         if (var4 != 0) {
            break;
         }
      }

      return var5;
   }

   public List<Class086> m14530() {
      return this.f7471.m5251();
   }

   public Class086 m14531(String var1) {
      long var2 = f7473 ^ 101289549985433L;
      int var10000 = Class253.m9154();
      Iterator var5 = this.f7471.m5251().iterator();
      int var4 = var10000;

      label26:
      while (var5.hasNext()) {
         Class086 var7;
         Class086 var8 = var7 = (Class086)var5.next();

         do {
            boolean var9 = ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "W", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var8,  -1490974434220228286L,  var2))).equalsIgnoreCase(var1);
            if (var4 == 0) {
               if (!var9) {
                  continue label26;
               }

               var9 = var7.m4936().equalsIgnoreCase(Class164.f3259.getServerIP());
            }

            if (!var9) {
               continue label26;
            }

            var8 = var7;
         } while (var4 != 0);

         return var7;
      }

      return null;
   }

   public Class467() {
      super();
      this.f7471 = new Class133();
      Class170.f3364.m7112().m8473(this.f7471, this.f7471);
   }

   public void m14533() {
      Class170.f3364.m7112().m8469(this.f7471);
      Waypoints.f6507.m12772();
   }

   public void m14534(Class086 var1) {
      this.f7471.m6140(var1);
      Waypoints.f6507.m12772();
   }

   public static void m14535(int[] var0) {
      f7472 = var0;
   }

   public static int[] m14536() {
      return f7472;
   }

   static {
      m122();
      if (m14536() != null) {
         m14535(new int[3]);
      }
   }
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f7475[var4] != null) {
         return var4;
      } else {
         Object var5 = f7474[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 17;
               case 1 -> 16;
               case 2 -> 1;
               case 3 -> 31;
               case 4 -> 55;
               case 5 -> 26;
               case 6 -> 29;
               case 7 -> 33;
               case 8 -> 37;
               case 9 -> 40;
               case 10 -> 49;
               case 11 -> 58;
               case 12 -> 12;
               case 13 -> 11;
               case 14 -> 24;
               case 15 -> 47;
               case 16 -> 52;
               case 17 -> 63;
               case 18 -> 62;
               case 19 -> 20;
               case 20 -> 38;
               case 21 -> 39;
               case 22 -> 7;
               case 23 -> 50;
               case 24 -> 5;
               case 25 -> 44;
               case 26 -> 56;
               case 27 -> 19;
               case 28 -> 4;
               case 29 -> 10;
               case 30 -> 43;
               case 31 -> 28;
               case 32 -> 34;
               case 33 -> 14;
               case 34 -> 41;
               case 35 -> 18;
               case 36 -> 30;
               case 37 -> 57;
               case 38 -> 8;
               case 39 -> 9;
               case 40 -> 22;
               case 41 -> 45;
               case 42 -> 6;
               case 43 -> 15;
               case 44 -> 27;
               case 45 -> 35;
               case 46 -> 51;
               case 47 -> 2;
               case 48 -> 0;
               case 49 -> 60;
               case 50 -> 32;
               case 51 -> 42;
               case 52 -> 48;
               case 53 -> 3;
               case 54 -> 59;
               case 55 -> 53;
               case 56 -> 13;
               case 57 -> 36;
               case 58 -> 61;
               case 59 -> 54;
               case 60 -> 25;
               case 61 -> 21;
               case 62 -> 46;
               default -> 23;
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

            f7475[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f7474[0] = "fo\u00156Q%xg\u000fy6$i|\u0002#\u0010\"";
      f7474[1] = "~F9\u001e]puI(Q<~~B,\u000b";
      f7474[2] = "nS!`\n\u001ep[;/h\u0002wF";
      f7474[3] = boolean.class;
      f7475[3] = "java/lang/Boolean";
      f7474[4] = "K>\fS\u0001}W$\u000e\u000f\u001biG'Eɻ";
      f7474[5] = int.class;
      f7475[5] = "java/lang/Integer";
      f7474[6] = "}oWKzAauU\u0017`Uqv\u001eЭ";
      f7474[7] = "\u000f\u0014\"M6|\u0013\u000e \u0011,h\u0003\rkň";
      f7474[8] = "pa'\u0015{Zl{%IaN|xnê";
      f7474[9] = "o6U>a$d9Dq\u001c<w>M8";
      f7474[10] = "s+Z\u0004\u007f;o1XXe/\u007f2\u0013Â";
      f7474[11] = "f\u0014\u000b=\u0013lz\u000e\ta\txj\rBɧ";
      f7474[12] = "l\u0006W{@\u001ap\u001cU'Z\u000e`\u001f\u001e·";
      f7474[13] = void.class;
      f7475[13] = "java/lang/Void";
      f7474[14] = "|F2\\T\u0016`\\0\u0000N\u0002p_{ę";
      f7474[15] = "R`$)\u0006XNz&u\u001cL^ymǊ";
      f7474[16] = "zx\u0011\u0014\u0017\u001bfb\u0013H\r\u000fvaXY\n\u001cp$\u0005_\u0017\u0007tf\u001f@\u0000@\\Y\u0013H\f\u000fyc\f[\u0007\u0002p";
      f7474[17] = "4@1\u000fo](Z3SuI8YxBqA>\\\"\u000f|X2\u001c5NsN2UxbrF=[1ToI/[9O";
      f7474[18] = "b$";
      f7474[19] = "\u0003-";
      f7474[20] = " 1FVU\u007f<+D\nOk,(\u000fĜ";
      f7474[21] = char.class;
      f7475[21] = "java/lang/Character";
      f7474[22] = "fd\u000f\u0004\u001bnnxh\u001f\u001b&q\u0018\u0012\u0018\u000bms(U\u001d\u0010V";
      f7474[23] = ", \u0013M}Je~\u001b\nCOy*~\n\"[.8NM'@\u0015|E\r<\u001a/)\u0011\u0017/&";
      f7474[24] = "As\u0013\u000b5(\u0014c\u0015UOȂ(c\u001d\n%9\u0011`HN1H\u00122\fOsrGf\u0016\\O";
      f7474[25] = " >-\u0007\u007fq}=a\f\u0012n }K\u0013h\u007f {Q&\u0012?+={\u0013~<7> ~";
      f7474[26] = "\u007fX*\u0014DP4@:S%ɮE\u0018eJ\u001cX&@b\u0014E7";
      f7474[27] = "\\g\u0014&yg\u0011'\u001bh\u001dʼ`kN}#t\u0012,\u0014$f";
      f7474[28] = "\fX\u007f\u001497\u0005B;LRΘ<\r*\u000b9(M\u0004.HiX";
      f7474[29] = "{PHq\u0013=7J\f!tγJ\u0019N3HjzUTw\u0018";
      f7474[30] = "$C\n\u0006*\u0004'_\t]G\fwCY\u0011'h&\u0018TT(\u000b~\u001f\n\rG";
      f7474[31] = "&\u001c)Js%u]$I\u0017Ȍ\u0018\u001d0O|6t\u001e,L'[";
      f7474[32] = "~\u0006\u007fR{z#\u00053Y\u0016ɏ\u0013T}\u0016ogc\t~Zd";
      f7474[33] = "5f:\u0014|5|82SB#ae0W/Yva*\u0012<i1d1)xbq\u007fk\u0013-6klW";
      f7474[34] = ">\u000ej(\u001b\u007fsNef\u007fg\u0002\u000f3g\u001d|:Awx\u001f\u000e2\u0007zt\r6|Cev\u007f";
      f7474[35] = "\u0014:\u000ej\u0013v\u001d J2xā$nP0\u0018rKgJt@";
      f7474[36] = "\u0003'\u000f\"6LD}VgTΙ>\"UcmZ@q\u0014nn>\u000fs\u0015w$O\u0006wV'T";
      f7474[37] = "1`]AfS2|^\u001a\u000bToo\u001bcw?3;\u0003\u0013d\\k<]J\u000bR~}QWs\u0006`>\b*";
      f7474[38] = "hT%$l\u0004kH&\u007f\u0001\u0005/Op+z)9T~5l#?ItO?\u000ejYt#<\u0012i\u0002\u0019u:\u0015)\u000e# n\u000f:2";
      f7474[39] = "hw-\fW\u001a;6 \u000f3\u000b;4\u0014\\V\tVv4\tX\t:u(\n\u0003d";
      f7474[40] = "SlPli\u001a\u001e,_\"\rҏo1X7t\u0011\u0014cNldk^2N9}\u001aW6\ri\r";
      f7474[41] = "ix4w\"+&;>hZҮW33~gp;zmv N";
      f7474[42] = "YRn]ie\u0010\ff\u001aWh\u001cYy\t+n\u001a4h\u001c0t\r\f`\u0000W";
      f7474[43] = "0y%\u0005ZVei#[ ȁYi+\u0004JG`j~@^63r.GY\u000b+:5_ \u00076|,NQ\u000e2?|>";
      f7474[44] = "|\u0000SC721@\\\rSԵ@][\u0018*9;\u000fMC:C";
      f7474[45] = "\u0003<Q\u001d\u0004BO&\u0015McȠ2-UCX\bRxEE\u0006r";
      f7474[46] = "R#>~X@Z?Yc\\\u0003\u007f2)\u007f5B\u0002\"&?\u000f\u0017V85\u0003";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f7474[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f7475[var4]);
            f7474[var4] = var5;
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
      Object var5 = f7474[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f7475[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f7474[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f7474[var4] = var13;
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
               var12 = m123(77646059772251L, 0L);
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
      Object var5 = f7474[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f7475[var4];
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
               f7474[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(77646059772251L, 0L);
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
                     f7474[var4] = var19;
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
               var23 = m123(77646059772251L, 0L);
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
         if (var8 != 251 && var8 != 'R' && var8 != 'E' && var8 != 'X') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'W') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'y') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 251) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'R') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'E') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class467.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ш" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
