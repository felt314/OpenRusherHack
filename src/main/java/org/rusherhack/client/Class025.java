package org.rusherhack.client;
import org.rusherhack.*;

import java.awt.Color;
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
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.Class263;
import org.rusherhack.client.api.events.client.screen.EventScreen$Initialize;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.core.event.subscribe.Subscribe;

public class Class025 extends Renderer034<Renderer060> {
   public List<Renderer060> f1204;
   public static long f1205 = Class066.m4320(6206871934384322961L, 6062099101351410926L, MethodHandles.lookup().lookupClass()).m4325(242707491992784L);
   public static Object[] f1206 = new Object[52];
   public static String[] f1207 = new String[52];

   public double m2850() {
        return 0.0;
    }

   public double m2851() {
      return 18.0;
   }

   public Class025(int var1) {
      super(var1);
      this.f1204 = new ArrayList<>();
      Class170.f3362.subscribe(this);
   }

   @Override
   public List<Renderer060> m2852() {
      return this.f1204;
   }

   @Subscribe
   public void m2853(Class263 var1) {
      Class025 var6 = this;
      Iterator var5;
      Iterator var10000 = var5 = Class170.f3364.m7121().getFeatures().iterator();

      while (var10000.hasNext()) {
         Window var4 = (Window)var5.next();
         var10000 = var5;
         var6.f1204.add(new Renderer060(var6, var6, var4));
      }
   }

   @Override
   public Color m2855() {
      long var1 = f1205 ^ 121300178293541L;
      return ((org.rusherhack.client.api.ui.theme.ITheme)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "Â", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.ui.theme.ITheme.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7115(),  2725582187783265282L,  var1))).getPrimaryColor();
   }

   @Subscribe
   public void onInitialize(EventScreen$Initialize var1) {
      super.f1213.restart();
      this.m2878(false);
      this.m2878(true);
   }

   static {
      m786();
   }
   public static int m156(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1207[var4] != null) {
         return var4;
      } else {
         Object var5 = f1206[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 60;
               case 1 -> 15;
               case 2 -> 2;
               case 3 -> 37;
               case 4 -> 45;
               case 5 -> 36;
               case 6 -> 38;
               case 7 -> 22;
               case 8 -> 62;
               case 9 -> 16;
               case 10 -> 20;
               case 11 -> 39;
               case 12 -> 51;
               case 13 -> 18;
               case 14 -> 33;
               case 15 -> 1;
               case 16 -> 31;
               case 17 -> 6;
               case 18 -> 4;
               case 19 -> 27;
               case 20 -> 46;
               case 21 -> 58;
               case 22 -> 44;
               case 23 -> 23;
               case 24 -> 24;
               case 25 -> 47;
               case 26 -> 25;
               case 27 -> 35;
               case 28 -> 34;
               case 29 -> 53;
               case 30 -> 7;
               case 31 -> 13;
               case 32 -> 61;
               case 33 -> 0;
               case 34 -> 19;
               case 35 -> 30;
               case 36 -> 49;
               case 37 -> 21;
               case 38 -> 54;
               case 39 -> 57;
               case 40 -> 10;
               case 41 -> 8;
               case 42 -> 29;
               case 43 -> 17;
               case 44 -> 59;
               case 45 -> 28;
               case 46 -> 11;
               case 47 -> 9;
               case 48 -> 5;
               case 49 -> 12;
               case 50 -> 14;
               case 51 -> 48;
               case 52 -> 32;
               case 53 -> 26;
               case 54 -> 63;
               case 55 -> 50;
               case 56 -> 42;
               case 57 -> 43;
               case 58 -> 3;
               case 59 -> 52;
               case 60 -> 56;
               case 61 -> 40;
               case 62 -> 41;
               default -> 55;
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

            f1207[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m786() {
      f1206[0] = "2\f@n\f\u000f.\u0016B2\u0016\u001b>\u0015\t#\u0012\u00138\u0010Sn˻";
      f1206[1] = int.class;
      f1207[1] = "java/lang/Integer";
      f1206[2] = "\u0006l9bt:\u001av;>n.\nupħ";
      f1206[3] = "W.NE@rK4L\u0019Zf[7\u0007\b^n]2]ESwQr\\\u0002\u001csP9D\u000e\u001cNl4L\u0006W";
      f1206[4] = "\u0001R\u000en\u0005i\u001cGVLDd\u0004A";
      f1206[5] = "qR3\r]=mH1QG)}KzΝ";
      f1206[6] = "x@c?\u0004\ndZac\u001e\u001etY*r\u001a\u0016r\\p?Ǻ";
      f1206[7] = boolean.class;
      f1207[7] = "java/lang/Boolean";
      f1206[8] = void.class;
      f1207[8] = "java/lang/Void";
      f1206[9] = "aK`Y\u0019@}Qb\u0005\u0003TmR)\u0014\u0004Gk\u0017f\u0019\u0002XoMn\u0018\u0005\u001bOWn\u001a\nAgVi";
      f1206[10] = "\u001d\u001b2\u0019\u0011h\u0003\u0013(Vvi\u0012\b%\fPo";
      f1206[11] = "~T\u001b?\u0017?u[\npv1~P\u000e*";
      f1206[12] = "J8K~\u00028V\"I\"\u0018,F!\u00023\u001c$@$X~Ǻ";
      f1206[13] = "GhFC\u0006NY`\\\fdR^}";
      f1206[14] = double.class;
      f1207[14] = "java/lang/Double";
      f1206[15] = "(\u001ct2\u001bE4\u0006vn\u0001Q$\u0005=\u007f\u0006B\"@zr\u001dU5\br\u007f\fCi']}\u0004U#";
      f1206[16] = "o\u0012(\u0004(\u0012d\u001d9KU\nw\u001a0\u0002";
      f1206[17] = "\u0002w_ubD\u001em])xP\u000en\u00168|X\bkLuո";
      f1206[18] = "K'n\u0014d\"W=lH~6G>'Yz>A;}\u0014w'M{o_w#Q'l\u0014a>J1fM8\u0000M;mUa";
      f1206[19] = "\b\\\u0013Z%\u0007\u0014F\u0011\u0006?\u0013\u0004EZ\u0017;\u001b\u0002@\u0000ZӨ";
      f1206[20] = "e\u0010";
      f1206[21] = "I\u0015\u0006:^\u001dU\u000f\u0004fD\tE\fOw@\u0001C\t\u0015:M\u0018OI\u0013qB\fC\u0015O]~\rH\u0003\u0004fM\nJ\u0002SP";
      f1206[22] = "y\u0019p\n2Fe\u0003rV(Ru\u00009G,Zs\u0005c\n!C\u007fEeA.Ws\u00199B/]bE^b/]b9rJ$Vd\u000ee";
      f1206[23] = "\n&pa,5\u0016<r=6!\u0006?9Ȼ";
      f1206[24] = "Et\u001ctjvN{\r;\rnJg\u000bw(\u007f";
      f1206[25] = "Z\u0010\u0005n`LF\n\u00072zXV\tLћ";
      f1206[26] = "/B;N`p3X9\u0012zd#[r\u0003}w%\u001e9\u0016wk4\u001e\u0019\u0016wk4r)\u0013";
      f1206[27] = "E=4\fkU\u001c}1\bPÞy0\"M*\u0013\u0001h?\u000e(lDv%M-]\u00042a\u0015P";
      f1206[28] = "QXM&%\n\u0011\u0018\u0013;\u0019\u0017\u0002Y\u000b^)OWT\u000b#g\u001e\u0016[w";
      f1206[29] = "a,I\u0001\u001fK( S\u0018\u007f\u0012<)1RAC-9L\u001c\u0010\u0002\"E\r\u001dG\u0001/=U\u0000\u0004\u0003P";
      f1206[30] = "\u001bk\u0013\u0003,OB+\u0016\u0007\u0017ʿ'd\u0016\u001d{\u0019Ed\u0010\u001f'";
      f1206[31] = "\u0013\t:\u000e\u0000=G\u000f:\u001d~Б#D>\u000e\u001d,\u0013\r2\u0014\u0004";
      f1206[32] = "P7\u0015FNQ\u00064\u0006^<ϕic\u0013RC\u0019S5\u0010A[";
      f1206[33] = "PY>`M<B\u0011:a'2T\\\u0010e\\%]I-BN8T 6nJbVA%jW09";
      f1206[34] = "5f\u001dW\nJek\u001a\u001c4ՕYhIBF\u0019>eF\u0010P)";
      f1206[35] = "r*g\u001a=\u001b$)t\u0002OǰK'}X(\u001ar}7\u001e0!";
      f1206[36] = "x:u\u0012\u0014C.9f\nfңA6p\u0002ZI/6z\u000b_";
      f1206[37] = "'r\u0002y\u00035w%\u0001yd6v28`\u00025|1\u001c]\u00044~#g;T#k%Z>\n&$N";
      f1206[38] = "q\u0010(@Db%\u0016(S:҂A]?]Cw\"]*\bV\u0013";
      f1206[39] = "\u0006p^|e\u0003\u0004~^\u0013ɰ?\u0003{_r4\u0002B.S\"";
      f1206[40] = "n\u001dz%\" 0Nr/]1r\u0019e}!7tt!eg(2\u000fa%95\u000e";
      f1206[41] = ";'\u001b\u0003+<jt\u0001\bBʼPp\u001d\u0018|6.`G\n:";
      f1206[42] = "\b\u001f^\u0006\u0007@\b\u0015W\u00037U\u0014\u001bJQMO\u0003\u001c1\n\t\u0016\u0014\rLDXW\u001bq\f@O\u0016\u0014@L\u0004\u000bNi";
      f1206[43] = "{\u0012-]\u001b\u0017|Vk\u000b \nxP\\\nF\u0019OAt\u0001M\u001fxV\u0012\u0003[\nuNq\n\u001c\u001c+,";
      f1206[44] = "KW@yv1N\tE6\u001dc\u001c\u001bbs|i\u0018\u001dKBzh\u0016\u001d:3`p\b[Y3-pJg";
      f1206[45] = "\u001fzt&LAVvn?,\u0010R~v,P\u0016T\u001324\u0016\t\u0012hrtH\u0014.";
      f1206[46] = "Zd'l\u0006\u0006\u0000.at=PWiTfTCGowp=_Sp+tM\u0001\u0000x!\u000b";
      f1206[47] = "B|?0\u001c$\u0014\u007f,(nѯ{-h*\u0016y\u0017}?)\u0016\u001e";
      f1206[48] = "\u0012}LB\u000f \u0012{N\u001e`8AjWG\u001a>,/GI\f-N/AKPB";
      f1206[49] = "3\u000f,(]/:H:v?#0\b\u00184E-;\u001b\u001c)S0=t)\"Rs2\u0015:&O!]E9-F(>E,xSL";
      f1206[50] = "\u0015JP2s\u001bALP!\r\u0003%Y\u0005,g\u001aA\u000e\r05jJ\u000e[ }\u000e\u001d\u0006Gr\r";
      f1206[51] = "ONa\u0010\u001e\u001a\u000f\u000e?\r\"\u0001\u0018D\u001d\u0005R\u001dq\u0003$PX\u001e\t[9\u0013Za";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f1206[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1207[var4]);
            f1206[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m159(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m160(Class var0, String var1, Class var2) {
      Field var3 = m159(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m160(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m161(long var0, long var2) {
      int var4 = m156(var0, var2);
      Object var5 = f1206[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1207[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f1206[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1206[var4] = var13;
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
               var12 = m158(829473421637771L, 0L);
            }
         }
      }
   }

   public static Method m162(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m163(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m162(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m163(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m164(long var0, long var2) {
      int var4 = m156(var0, var2);
      Object var5 = f1206[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1207[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m158(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m162(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f1206[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(829473421637771L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m163(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f1206[var4] = var19;
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
               var23 = m158(829473421637771L, 0L);
            }
         }
      }
   }

   public static MethodHandle m165(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'L' && var8 != 255 && var8 != 'p' && var8 != 253) {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 194) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 238) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'L') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 255) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'p') {
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

   public static Object m166(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m165(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class025.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/Ɗ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
