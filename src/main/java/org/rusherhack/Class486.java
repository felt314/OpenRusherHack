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
import org.rusherhack.client.api.system.IRelationManager;
import org.rusherhack.client.api.utils.objects.PlayerRelation;
import org.rusherhack.client.api.utils.objects.PlayerRelation$State;

public class Class486 implements IRelationManager {
   public Class599 f7842;
   public static long f7843 = Class066.m4320(3157636816755165247L, -7449504299093428188L, MethodHandles.lookup().lookupClass()).m4325(55679660201664L);
   public static Object[] f7844 = new Object[42];
   public static String[] f7845 = new String[42];

   @Override
   public List<PlayerRelation> getFriends() {
      int var10000 = Class253.m9154();
      ArrayList var4 = new ArrayList();
      int var3 = var10000;
      Iterator var7 = this.f7842.m5251().iterator();

      while (true) {
         Iterator var8 = var7;

         do {
            if (!var8.hasNext()) {
               return var4;
            }

            var8 = var7;
         } while (var3 != 0);

         PlayerRelation var6;
         if ((var6 = (PlayerRelation)var7.next()).state() == PlayerRelation$State.FRIEND) {
            var4.add(var6);
            if (var3 != 0) {
               return var4;
            }
         }
      }
   }

   @Override
   public void addEnemy(String var1) {
      long var2 = f7843 ^ 120144291215349L;
      org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "d", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), this,  var1,  -8894008335777855335L,  var2);
      this.f7842.m5251().add((PlayerRelation)null);
      Relations.f9459.m18158();
   }

   public void m15152(PlayerRelation$State var1) {
      this.f7842.m5251().removeIf(var1x -> {
         if (var1x.state() == var1) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      Relations.f9459.m18158();
   }

   @Override
   public List<PlayerRelation> getEnemies() {
      int var10000 = Class253.m9155();
      ArrayList var4 = new ArrayList();
      Iterator var7 = this.f7842.m5251().iterator();
      int var3 = var10000;

      while (true) {
         Iterator var8 = var7;

         do {
            if (!var8.hasNext()) {
               return var4;
            }

            var8 = var7;
         } while (var3 == 0);

         PlayerRelation var6;
         if ((var6 = (PlayerRelation)var7.next()).state() == PlayerRelation$State.ENEMY) {
            var4.add(var6);
            if (var3 == 0) {
               return var4;
            }
         }
      }
   }

   public Class486() {
      super();
      this.f7842 = new Class599();
      Class170.f3364.m7112().m8473(this.f7842, this.f7842);
   }

   @Override
   public void removeFriend(String var1) {
      this.f7842.m5251().removeIf(var1x -> {
         return var1x.username().equalsIgnoreCase(var1);
      });
      Relations.f9459.m18158();
   }

   @Override
   public boolean isEnemy(String var1) {
      int var10000 = Class253.m9155();
      Iterator var7 = this.f7842.m5251().iterator();
      int var4 = var10000;

      while (var7.hasNext()) {
         Object var8 = var7.next();

         PlayerRelation var6;
         while ((var6 = (PlayerRelation)var8).username().equalsIgnoreCase(var1)) {
            var8 = var6.state();
            if (var4 != 0) {
               if (var8 == PlayerRelation$State.ENEMY) {
                  boolean var10002 = true;
                  return true;
               }

               return false;
            }
         }
      }

      return false;
   }

   @Override
   public boolean isFriend(String var1) {
      int var10000 = Class253.m9154();
      Iterator var7 = this.f7842.m5251().iterator();
      int var4 = var10000;

      while (var7.hasNext()) {
         Object var8 = var7.next();

         PlayerRelation var6;
         while ((var6 = (PlayerRelation)var8).username().equalsIgnoreCase(var1)) {
            var8 = var6.state();
            if (var4 == 0) {
               if (var8 == PlayerRelation$State.FRIEND) {
                  boolean var10002 = true;
                  return true;
               }

               return false;
            }
         }
      }

      return false;
   }

   @Override
   public void addFriend(String var1) {
      long var2 = f7843 ^ 110129741564856L;
      org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "d", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), this,  var1,  4094138603433633410L,  var2);
      this.f7842.m5251().add((PlayerRelation)null);
      Relations.f9459.m18158();
   }

   @Override
   public void removeEnemy(String var1) {
      this.f7842.m5251().removeIf(var1x -> {
         return var1x.username().equalsIgnoreCase(var1);
      });
      Relations.f9459.m18158();
   }

   static {
      m122();
   }
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f7845[var4] != null) {
         return var4;
      } else {
         Object var5 = f7844[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 50;
               case 1 -> 46;
               case 2 -> 25;
               case 3 -> 33;
               case 4 -> 62;
               case 5 -> 61;
               case 6 -> 19;
               case 7 -> 39;
               case 8 -> 2;
               case 9 -> 28;
               case 10 -> 53;
               case 11 -> 56;
               case 12 -> 44;
               case 13 -> 60;
               case 14 -> 20;
               case 15 -> 5;
               case 16 -> 13;
               case 17 -> 7;
               case 18 -> 0;
               case 19 -> 52;
               case 20 -> 48;
               case 21 -> 17;
               case 22 -> 47;
               case 23 -> 34;
               case 24 -> 12;
               case 25 -> 23;
               case 26 -> 22;
               case 27 -> 55;
               case 28 -> 15;
               case 29 -> 10;
               case 30 -> 27;
               case 31 -> 35;
               case 32 -> 42;
               case 33 -> 36;
               case 34 -> 8;
               case 35 -> 30;
               case 36 -> 40;
               case 37 -> 24;
               case 38 -> 9;
               case 39 -> 63;
               case 40 -> 4;
               case 41 -> 29;
               case 42 -> 32;
               case 43 -> 51;
               case 44 -> 1;
               case 45 -> 57;
               case 46 -> 31;
               case 47 -> 38;
               case 48 -> 3;
               case 49 -> 43;
               case 50 -> 21;
               case 51 -> 58;
               case 52 -> 45;
               case 53 -> 11;
               case 54 -> 59;
               case 55 -> 37;
               case 56 -> 14;
               case 57 -> 26;
               case 58 -> 49;
               case 59 -> 16;
               case 60 -> 41;
               case 61 -> 18;
               case 62 -> 6;
               default -> 54;
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

            f7845[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f7844[0] = "\u000e|\f\bT~\u0012f\u000eTNj\u0002eEђ";
      f7844[1] = "7NPA]%+TR\u001dG1;W\u0019ț";
      f7844[2] = "\u0007|-v:L\u001bf/* X\u000bed;$P\r`>v)I\u0001 ?,!U\u001b %:\"\\\u000bz9v\u0018U\tw/*\u001a\\\u0004o>1'W";
      f7844[3] = "{!\u0013M;Kg;\u0011\u0011!_w8Z\u0000%Wq=\u0000M(N}}\u0001\u0017 Rg}\u001b\u0001#[w'\u0007M\u0019Ru*\u0011\u0011\u001b[x2\u0000\n&P0\u0000\u0000\u0002=[";
      f7844[4] = "N\u0004\u001bu\u0006\u000fP\f\u0001:d\u0013W\u0011";
      f7844[5] = "\u000ed\u000f\u0005Fx\u0010l\u0015J\u000ex\nf\r\r\u0007cJU\u000b\u0001\fd\u0007d\r\u0001";
      f7844[6] = boolean.class;
      f7845[6] = "java/lang/Boolean";
      f7844[7] = "`MF\u0006\b<|WDZ\u0012(lT\u000fՅ";
      f7844[8] = "M\u000bX!P Q\u0011Z}J4A\u0012\u0011ç";
      f7844[9] = void.class;
      f7845[9] = "java/lang/Void";
      f7844[10] = "\u001aBqheG\u0006Xs4\u007fS\u0016[8ԩ";
      f7844[11] = "xLI.4\u000bfDSaS\nw_^;u\f";
      f7844[12] = "*>'g>O!16(_A*:2r";
      f7844[13] = "smT]E\u000bowV\u0001_\u001f\u007ft\u001dɵ";
      f7844[14] = int.class;
      f7845[14] = "java/lang/Integer";
      f7844[15] = "hbq\u0013}^cm`\\\u0000Fpji\u0015";
      f7844[16] = "pjoND\u0016lpm\u0012^\u0002|s&ċ";
      f7844[17] = "\u001c\u000e@&J\u0004\u0000\u0014BzP\u0010\u0010\u0017\tǅ";
      f7844[18] = "r\u000b:\u0012/\u001en\u00118N5\n~\u0012s_2\u0019xW.Y/\u0002|\u00154F8ET*8N4\nq\u0010']?\u0007x";
      f7844[19] = "3[:<\u001fc/A8`\u0005w?Bsq\u0001\u007f9G)<\ff5\u0007>}\u0003p5NsQ\u0002x:@:g\u001fw(@2|";
      f7844[20] = "YH<L\u000b<_T\"\tz\"\u000b]&uJ \u001e\u00131\u001a\u0011'\u000f@Z";
      f7844[21] = "J\u000b\n\u000eo8JS\u001768D\u0014\u0005RXk5N\u0000\fPQ}FP\u0002\f 'C\u000e\n6";
      f7844[22] = "\u007ffo\u00142\u0003=jcZ\u0002\u000e(:\u0000\u0014f\u001fz=oOa\u000e)V<]8\u0007)$dJe\rD";
      f7844[23] = "WFkK5-\f\u001ddEL\u000779Im\u0000IWFkK5-\f\u001ddE";
      f7844[24] = "Gi\u000b \\+G1\u0016\u0018\u0018:Ek\u0013u,-Aa\u000btb>Yp\bw\u00125\u0019wU\u0018\\/\u00197T S=\u001abm";
      f7844[25] = "\u001f'=1\b&O9)|lԧ.!o)\u0006vGv2)\u0015G";
      f7844[26] = "\u0007\b\u007f<\u001c\u001cW\u0016kqxȤ6\u000e-$\u0012L_Yp$\u0001}";
      f7844[27] = "\u0006Uv&y]]\u0000+p\u0007Ϝl\u000f%x:\u001cSTp%l";
      f7844[28] = "X\\6\u0018]F\u001aP:VmX\u000e\t>V\u0000c\rlbJ\u000eR\u0005] \u0010UAcP \u0012\rO\u0011\b7O\u0007\"";
      f7844[29] = "\u0004?fmrR\u0005;x4\u001cҁ98%.&WR9!0\u007f";
      f7844[30] = "mh@O6\u0018m0W\bNӈSo\u0001Z~\u00187-\rV0(";
      f7844[31] = "\u0006xVh^KYfKy4\nDiOs]\u0012R\u0004\\lH\u0012PtW,OO?";
      f7844[32] = "12Q-y*s>]cI/voDt5)p\u0002\u0001x/w{z\u0007d12\n";
      f7844[33] = "\u001aE-l\u0006;\u001a\u001d0TB*\u0018G59u!\u0010E:TQ>\u0001E$$Z~\u0006\u0018Kj@~F\u0019seR}\u0013 ";
      f7844[34] = "yK}\u0014yVxOcM\u0017ωDO|\u0017,\u0004|@n\u0014y=";
      f7844[35] = "uZvV0\u0017\u007f\u00075_Qɛ\u001e\n9[3\b{\u000bx_/lr\u000e7\t5\\\"\u0013-WQRfXr\bi]t['1";
      f7844[36] = "N\u000fvk`;\u0011\u0011kz\n|\u000b\u001ai{\n=I\u001cuonf\u0012\u0013{\u0016";
      f7844[37] = "\u0001\u0012\u001b3[*ZGFe%ɇkIC1Bt\u0010C\u001erK\u0015";
      f7844[38] = "\u001au@^7[\u001ci^\u001bFCLk`\n6_%,_]&NWtH\u0000,#";
      f7844[39] = "WE\u007fa!\u001b\\\u0005x<N\u0006GAj`5*QZd~# WGn\u0004'\u0012BYlt,RE\u0004\u000387Q^Qq` \fT<";
      f7844[40] = "S%\u0018C;T\b~\u0017MB}/V2rB\nWt\u0017Z&Q\f{\u0019";
      f7844[41] = "Ifg\u001b\u000e\u0015I>z#Ďi\u0011a`C\f\u0003RszC";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f7844[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f7845[var4]);
            f7844[var4] = var5;
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
      Object var5 = f7844[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f7845[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f7844[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f7844[var4] = var13;
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
               var12 = m123(873695879254454L, 0L);
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
      Object var5 = f7844[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f7845[var4];
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
               f7844[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(873695879254454L, 0L);
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
                     f7844[var4] = var19;
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
               var23 = m123(873695879254454L, 0L);
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
         if (var8 != 'S' && var8 != 248 && var8 != 'W' && var8 != 'Q') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'd') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'l') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'S') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 248) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'W') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class486.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ѵ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
