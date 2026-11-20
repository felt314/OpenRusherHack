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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.window.ResizeableWindow;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.client.api.ui.window.view.TabbedView;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.client.api.utils.objects.PlayerRelation;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.clear;
public class Relations extends ResizeableWindow {
   public static Relations f9459;
   public t0uf8b f9460;
   public TabbedView f9461;
   public t0uf8b f9462;
   public List<Delete> f9463;
   public List<Delete> f9464;
   public static long f9465 = Class066.m4320(946275432313532056L, -7256840541516818457L, MethodHandles.lookup().lookupClass()).m4325(234437293329452L);
   public static String[] f9466;
   public static String[] f9467;
   public static long[] f9469;
   public static Integer[] f9470;
   public static Map f9471;
   public static Object[] f9472 = new Object[54];
   public static String[] f9473 = new String[54];

   public Relations() {
    }

   public void m18158() {
        
    }

   @Override
   public WindowView getRootView() {
      return this.f9461;
   }

   @Subscribe
   public void m18159(Class263 var1) {
      this.m18158();
   }

   static {
    }
   public static String m5835(byte[] var0) {
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
   public static int m1398(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f9473[var4] != null) {
         return var4;
      } else {
         Object var5 = f9472[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 13;
               case 1 -> 10;
               case 2 -> 31;
               case 3 -> 30;
               case 4 -> 40;
               case 5 -> 53;
               case 6 -> 56;
               case 7 -> 27;
               case 8 -> 0;
               case 9 -> 17;
               case 10 -> 52;
               case 11 -> 42;
               case 12 -> 26;
               case 13 -> 35;
               case 14 -> 60;
               case 15 -> 57;
               case 16 -> 7;
               case 17 -> 29;
               case 18 -> 9;
               case 19 -> 2;
               case 20 -> 44;
               case 21 -> 34;
               case 22 -> 19;
               case 23 -> 33;
               case 24 -> 28;
               case 25 -> 21;
               case 26 -> 45;
               case 27 -> 3;
               case 28 -> 47;
               case 29 -> 16;
               case 30 -> 11;
               case 31 -> 22;
               case 32 -> 18;
               case 33 -> 39;
               case 34 -> 43;
               case 35 -> 23;
               case 36 -> 58;
               case 37 -> 38;
               case 38 -> 5;
               case 39 -> 1;
               case 40 -> 25;
               case 41 -> 48;
               case 42 -> 4;
               case 43 -> 49;
               case 44 -> 32;
               case 45 -> 14;
               case 46 -> 15;
               case 47 -> 50;
               case 48 -> 8;
               case 49 -> 46;
               case 50 -> 20;
               case 51 -> 37;
               case 52 -> 59;
               case 53 -> 24;
               case 54 -> 41;
               case 55 -> 63;
               case 56 -> 6;
               case 57 -> 61;
               case 58 -> 54;
               case 59 -> 36;
               case 60 -> 55;
               case 61 -> 51;
               case 62 -> 62;
               default -> 12;
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

            f9473[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m1399() {
      f9472[0] = "4&dh&>(<f4<*8?-ԫ";
      f9472[1] = "#~YleM?d[0\u007fY/g\u0010!{Q)bJlvH%\"K+9O%bZ-`\u0016:e[59l-n\\'sn%iI";
      f9472[2] = "\u0005Ymy\bm\u001bQw6ol\nJzlIj";
      f9472[3] = "\u001dH~k\\\u0007\u0016Go$=\t\u001dLk~";
      f9472[4] = "0v}\u0000J].~gO(A)c";
      f9472[5] = boolean.class;
      f9473[5] = "java/lang/Boolean";
      f9472[6] = "c-\"L31\u007f7 \u0010)%o4kĉ";
      f9472[7] = "O(\u001d,\u0004\u0005S2\u001fp\u001e\u0011C1TѶ";
      f9472[8] = "\u000f (W\u001c+\u0013:*\u000b\u0006?\u00039aɿ";
      f9472[9] = int.class;
      f9473[9] = "java/lang/Integer";
      f9472[10] = "U|L:w[IfNfmOYe\u0005c";
      f9472[11] = "l%9smsp?;/wg`<p>sof9*s~vjy+41qj9:2h(u>;*1Jj$*\u000bvct";
      f9472[12] = void.class;
      f9473[12] = "java/lang/Void";
      f9472[13] = "do+)d\u001exu)u~\nhvbɳ";
      f9472[14] = "\u0003jSI\u0013%\u001fpQ\u0015\t1\u000fs\u001a*";
      f9472[15] = "\b\u0002r\u0003\u0001\u0005\u0003\rcL|\u001d\u0010\nj\u0005";
      f9472[16] = "3^K;Ga/DIg]u?G\u0002vZf9\u0002@zRs5BK;y{;KIg";
      f9472[17] = "_#Q=lPC9SavDS:\u0018pqWU\u007fZ|yBY?Q=Wi_6";
      f9472[18] = "d\u0002egUW\u0011\"nhD\u0018p,ec@B\u0004";
      f9472[19] = "p\\\u0018BP\u007flF\u001a\u001eJk|EQ\u000fNcz@\u000bBCzv\u0000\u0019\tC~j\\\u001aBUcqJ\u0010\u001b\fXz]\u0016\u0016Gk}B\u001a;Kd{A\b";
      f9472[20] = double.class;
      f9473[20] = "java/lang/Double";
      f9472[21] = "KVNPL*WLL\fV>GO\u0007\u001dQ-A\nL\b[1P\nl\b[1Pf\\\r";
      f9472[22] = "\t,2kD \u0015607^4\u00055{&Z<\u00030!kW%\u000fp3 W!\u0013,0kA<\b::2\u0018\u0002\u000f01*A";
      f9472[23] = "h\u0014Fv\u0004}t\u000eD*\u001eid\r\u000f;\u001aab\bUv\u0017xnHS=\u0018lb\u0014\u000f?\u0004iw\u000eH;XA@\u0014@(\u001ead";
      f9472[24] = "r,W\u0000x\u0010n6U\\b\u0004~5\u001eMe\u0017xpQ@c\b|*YAdK\\0YCk\u0011t1^";
      f9472[25] = ";(\u001ezr7|#\u0006%\u001e/o6\u001bC$$o:Y}`)a/g";
      f9472[26] = "\f\t\u0004\u001a_q\t\u0003\u0004\u001f0i[\tzB]mK[D\u0006Pc^eFD\n0\u0006[AI\u0000:7";
      f9472[27] = "\u0015\u001cG\u001d\u0000f\u0001\u0005K\u0004`Μ|\u001cF_[tEO\u000b[P\u001a\u0015\u0005\bZ\u000e#FH\fQ`";
      f9472[28] = "\"Kpm00a\u0014+hY0\u001e\u001fum#\"o\u00153}%";
      f9472[29] = "\u000e|,F\u0001k\f*.\u00199ȋ0y.\u0004H-\rz3JFR";
      f9472[30] = "2J`i;\u001fq\u0015;lRϊ\u000eHg<>\u001de\u000b8g;";
      f9472[31] = "J\u0000!\u0016AL\u0000\rg/ρ2@\bcM^CE\u0002cH";
      f9472[32] = "qEqe\u0003D\u007fC|l;^#YtuG$~PydK\u001d%\u001es};";
      f9472[33] = "(eP\u0002i\b7fT\u0005\n\f+cs\u0016m\u0011Fp\b\r3H!aR\u0011;wvmX\u0016zN-#R\u000f\n";
      f9472[34] = "\u0010\u000e+\u001cg{Z\u0003m%ү\u0005\u0010\u000e+\u001cg{Z\u0003m";
      f9472[35] = "M\u0011d;\u001f\u001a\u0013\u0012<e#V\"\u001e*>\u0018\u0014\u001bMg:\u0013zK\u0007d;MC\u0018J`0#";
      f9472[36] = "hH\u001a\u0012pH6M\u001b\u001f\u0012I8T7\u0014sK3D\u0002n)J+J\u0016\u001f,@+Oy";
      f9472[37] = "\u0003c\u001f\u001cF\u0013]f\u001e\u0011$\u0012S\u007f1\u0006I\u0018_n\u0007`\u001f\u0011@a\u0013\u0011\u001a\u001b@d|";
      f9472[38] = "{\u00022Q\b\u00191\u000fth\u0016g{VkV\u0002\u001esXgUxVz\u00030\u0012\u0001^t\u000f3h";
      f9472[39] = "hsq\t)d\"~70έ\u001aie'[)#2+-BY";
      f9472[40] = ".\u001b1!i#+\u00111$\u00069q\u001a&9\u0006bg\u001d$3?9)\u0017=C";
      f9472[41] = "\n+\u0016a-\u0019ItMdDҨ6xQn=\u000e\\wBn+";
      f9472[42] = "S7B\u0011q.\u0010h\u0019\u0014\u0018ěo4\u001b\u001ed'\u0001j\u001e\u001fiE";
      f9472[43] = "\u0015>]`\u000eP_3\u001bYҚ.V5\u0001aA@\u0015>^";
      f9472[44] = "U|*6iP\u001fql\u000fο.['u3k\u0011\u001c{*}";
      f9472[45] = "\u0010\"KZA|\u0017?\u0013\u0006}w\u00014\u0017A}s\u000bpKUD Ft@;\u0011'\u00020\u001e]Fc\u00121p\u000b\u000fp\u0010>IPAz\tN";
      f9472[46] = "\u0016(ak1G\u0004}34QF\u00170\u001f;7}\u0017-5:-=\u0017,%!i_Cr1<Q\r\b&1*hVF,(Z";
      f9472[47] = "6\u0018.VK\u007f|\u0015hoɣ\u0001<\u0010l\rTp9\u001al\b";
      f9472[48] = "O\u007f\u000bN)\u0016@l\u000bXU\u0007_k\u0013\\/\u001dHlh\r8\u0011^?VI5\u001fK\u0001XE?\u0017R8\u0003\u000b5\u000e\"";
      f9472[49] = "\u000bW\u001e[\u0001a\u000e]\u001e^nqLV\u001aP\u0012wJ;YW\u0017)\\E\u001e\\\u000fv0";
      f9472[50] = "<H\u000e!j4.\u001d\\~\n5=Ppql\u00111@Ip\n#0SN(hwnGS\u0010:<:GE)ar0^5";
      f9472[51] = "TMy\u0006UpQGy\u0003:f\u0001!=\tW}Q\u001fy\u0004Yho\u001bj\tF?Q_g\u0007S\u0001TMy\u0006UpQGy\u0003:";
      f9472[52] = "zw\u0011QL\u00110zWhīot,NTNP3p\u0011\u001a";
      f9472[53] = "kRP\u0018L<,YHG \";GoLP>R\u0000\u0015\u001b\u0010sl\u0007\u0018\u0011\u001aB";
   }

   public static Class m1400(long var0, long var2) {
      Class var5 = null;
      int var4 = m1398(var0, var2);
      Object var6 = f9472[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f9473[var4]);
            f9472[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m1401(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m1402(Class var0, String var1, Class var2) {
      Field var3 = m1401(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m1402(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m1403(long var0, long var2) {
      int var4 = m1398(var0, var2);
      Object var5 = f9472[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f9473[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m1400(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m1400(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m1401(var12, var10, var11);
            if (var13 != null) {
               f9472[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m1402(var14[var15], var10, var11);
                  if (var13 != null) {
                     f9472[var4] = var13;
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
               var12 = m1400(243776051370154L, 0L);
            }
         }
      }
   }

   public static Method m1404(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m1405(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m1404(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m1405(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m1406(long var0, long var2) {
      int var4 = m1398(var0, var2);
      Object var5 = f9472[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f9473[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m1400(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m1400(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m1404(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f9472[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m1400(243776051370154L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m1405(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f9472[var4] = var19;
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
               var23 = m1400(243776051370154L, 0L);
            }
         }
      }
   }

   public static MethodHandle m1407(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'K' && var8 != 207 && var8 != 213 && var8 != 'V') {
            var11 = m1406(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 223) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 227) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m1403(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'K') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 207) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 213) {
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

   public static Object m1408(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m1407(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m2051(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Relations.class, "m1408", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/խ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
