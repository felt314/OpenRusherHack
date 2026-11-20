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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.ListItemContent;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.client.api.ui.window.view.ListView$Column;

public class HudItem141 extends ListItemContent {
   public Class086 f2930;
   public static long f2932 = Class066.m4320(-5869570988839680922L, 8368494724527234519L, MethodHandles.lookup().lookupClass()).m4325(227647242914612L);
   public static String[] f2933;
   public static String[] f2934;
   public static Object[] f2936 = new Object[41];
   public static String[] f2937 = new String[41];

   @Override
   public String getAsString(ListView$Column var1) {
        return null;
    }

   @Nullable
   @Override
   public List<ContextAction> getContextMenu() {
        return null;
    }

   public HudItem141(Waypoints var1, Window var2, Class086 var3) {
    }

   static {
    }
   public static String m117(byte[] var0) {
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
   public static int m704(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f2937[var4] != null) {
         return var4;
      } else {
         Object var5 = f2936[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 58;
               case 1 -> 57;
               case 2 -> 6;
               case 3 -> 30;
               case 4 -> 29;
               case 5 -> 48;
               case 6 -> 35;
               case 7 -> 32;
               case 8 -> 26;
               case 9 -> 53;
               case 10 -> 20;
               case 11 -> 44;
               case 12 -> 45;
               case 13 -> 36;
               case 14 -> 40;
               case 15 -> 8;
               case 16 -> 23;
               case 17 -> 14;
               case 18 -> 51;
               case 19 -> 11;
               case 20 -> 31;
               case 21 -> 54;
               case 22 -> 1;
               case 23 -> 19;
               case 24 -> 13;
               case 25 -> 60;
               case 26 -> 43;
               case 27 -> 5;
               case 28 -> 46;
               case 29 -> 2;
               case 30 -> 21;
               case 31 -> 4;
               case 32 -> 61;
               case 33 -> 55;
               case 34 -> 15;
               case 35 -> 17;
               case 36 -> 63;
               case 37 -> 33;
               case 38 -> 9;
               case 39 -> 16;
               case 40 -> 50;
               case 41 -> 41;
               case 42 -> 18;
               case 43 -> 38;
               case 44 -> 25;
               case 45 -> 49;
               case 46 -> 24;
               case 47 -> 12;
               case 48 -> 37;
               case 49 -> 22;
               case 50 -> 0;
               case 51 -> 59;
               case 52 -> 62;
               case 53 -> 47;
               case 54 -> 39;
               case 55 -> 42;
               case 56 -> 10;
               case 57 -> 52;
               case 58 -> 7;
               case 59 -> 34;
               case 60 -> 3;
               case 61 -> 56;
               case 62 -> 27;
               default -> 28;
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

            f2937[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f2936[0] = "xJYjo:fBC%\r&a_";
      f2936[1] = "o+!oi=d$0 \b3o/4z";
      f2936[2] = boolean.class;
      f2937[2] = "java/lang/Boolean";
      f2936[3] = "D\u001aUA\u007fvX\u0000W\u001debH\u0003\u001cț";
      f2936[4] = "5\u001e\u0014e3Z>\u0011\u0005*NB-\u0016\fc";
      f2936[5] = "\u001b>s~`>\u0007$q\"z*\u0017':3~\"\u0011\"`~s;\u001dbr5s?\u0001>q~q$\u0019!u>ve\u0015>s~P'\u001b/\u007f\u0002w-\u0011>q>q.";
      f2936[6] = "c\u0013,u\\\u0004\u007f\t.)F\u0010o\neΉ";
      f2936[7] = "\"`\u000f \u001d6>z\r|\u0007\".yFm\u0003*(|\u001c \u000e3$<\u001dgA4$|\fa\u0018m;{\ryA\u000f$a\u001cX\u0006&:6+a\u00036 |";
      f2936[8] = "O\u0006.\u007f|oS\u001c,#f{C\u001fgũ";
      f2936[9] = "!ur-2\u0005=opq(\u0011-l;Ò";
      f2936[10] = "^p\r\u0019\u0014PBj\u000fE\u000eDRiDȱ";
      f2936[11] = int.class;
      f2937[11] = "java/lang/Integer";
      f2936[12] = "2fbF\u0018M.|`\u001a\u0002Y>\u007f+ă";
      f2936[13] = "\t\fT=dd\u0015\u0016Va~p\u0005\u0015\u001dћ";
      f2936[14] = void.class;
      f2937[14] = "java/lang/Void";
      f2936[15] = "9{#+J=%a!wP)5bjfT!3g0+Y8?'1l\u0016??g jOf `!r\u0016\u0004?z0SQ-!";
      f2936[16] = "d9j\u000bX\u007fx#hWBkh #FFcn%y\u000bKzbe_PYbn9EDIaJ\u001bD";
      f2936[17] = "\t<t`H<\u0015&v<R(\u0005%=-V \u0003 g`[9\u000f``7I=\u0003#=\u0007m \b*|9w(\b/t+H";
      f2936[18] = "A>bxas]$`${gM'+5\u007foK\"qxrvGbc3rr[>`xdo@(j!=VA<p&Do@(j!";
      f2936[19] = "\f(^8\u000fk\u001e>F[\\9\rWF!\nk\u001dk\\!RUX:Xe\tdY8Re5";
      f2936[20] = "q.&bm|&)!`\u0013НMw{t\u007f} :&es";
      f2936[21] = "og\u001a&)X<w[&MƗU7\u0013np\u0018ncYxuco}\u0011!6X;7\u0007$M";
      f2936[22] = "y\u000b\u0012\u0006\u0001V5\tX\u0001nνDIF\u0019\nS4\u001eA\u001e\b";
      f2936[23] = "\u0011-R*dkMrQ|\u0000=B`m\u007fe?/&[d=)\u0014r\u0011r8R";
      f2936[24] = "(rjZ:%o{z\u0016\\Է\u0016<m\u001f`8w>\u007f^lW";
      f2936[25] = "'%\u000e\u000e[d`,\u001eB=ɏ\u0019k\tK\u0001yxi\u001b\n\r\u0016";
      f2936[26] = "\u0005|\nXMGS.\u001f\rsΜ5&\u0005\u0005K\u001cPpW\u0010\u001e";
      f2936[27] = "i\u001bE'\u001c?bN\u0004)!ŖXK\u00079[`f^_<P\\";
      f2936[28] = "A,Zxu\u0012\u001dsY.\u0011ÿ\u007f$N!/\u0017N%L+/+";
      f2936[29] = "\u001c\u0010fHF~K\u0017aJ8ӟ I;^T\u007fM\u0004fOX";
      f2936[30] = "\u000bwOM\n[Gu\u0005JeI63\u0015N_D\r`\u0005\u000f_ \fc\u0006\r\u0001\u001b_sG\re";
      f2936[31] = "@.@\u001cnH\u0017)G\u001e\u0010ʩ|#@@sV\u001b$^\u0006j";
      f2936[32] = "\u000f];\u0001\u0007\u001bS\u00028Wcɵ1V2O^Y\n\u0002xY[\"";
      f2936[33] = "Q@rp\r\u0018\u0006Gursњm\u0019/f\u001f\u0019\u0000Trw\u0013";
      f2936[34] = "??[\u0015N|}:\u000fAw3\u0004y\u0014\u0003Jd?-^\u0015O\u001f>3\u0016L\f$jy\u0000Iw";
      f2936[35] = "%\u0013jM&g#Dm\u0002\u0017m\"^I\\qn(]STqk Ol=}s$AzAm`+\u001e\u0016";
      f2936[36] = "\u0001\u001dOc\u0013a]BL5wӋ?\u0015[:Id\u000e\u0014Y0IXV\u0015I%KfCML.w";
      f2936[37] = "\u0015\u001c~QRbY\u001e4V=Ԛ(\\\u007fR\u0001}\u0011\u0000 QW";
      f2936[38] = "OE\u000b)+Q\u0019\u0017\u001e|\u0015č\u007f\u001eWjt\t\u001c\u0015\u0002+z4";
      f2936[39] = "]\u0016y\u001ciFVC8\u0012Tϐl\u00113\u0004hAUMl\u0007>%\u0005\u0016}\u0007h\u001b\u0010Nx\fT";
      f2936[40] = "\u0006\nB!#}\u0016\u0019M~Oy\u000b\u0003T:\u0010`\n\u0017N=Oj\u001eE\u00100\u007f1\u000f\u0012\u0015B&8\u0013\u0001\u0015|3`\u0016\n)";
   }

   public static Class m706(long var0, long var2) {
      Class var5 = null;
      int var4 = m704(var0, var2);
      Object var6 = f2936[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f2937[var4]);
            f2936[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m707(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m708(Class var0, String var1, Class var2) {
      Field var3 = m707(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m708(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m709(long var0, long var2) {
      int var4 = m704(var0, var2);
      Object var5 = f2936[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f2937[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m706(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m707(var12, var10, var11);
            if (var13 != null) {
               f2936[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m708(var14[var15], var10, var11);
                  if (var13 != null) {
                     f2936[var4] = var13;
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
               var12 = m706(81122559032580L, 0L);
            }
         }
      }
   }

   public static Method m710(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m711(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m710(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m711(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m712(long var0, long var2) {
      int var4 = m704(var0, var2);
      Object var5 = f2936[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f2937[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m706(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m710(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f2936[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m706(81122559032580L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m711(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f2936[var4] = var19;
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
               var23 = m706(81122559032580L, 0L);
            }
         }
      }
   }

   public static MethodHandle m713(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'M' && var8 != 212 && var8 != 203 && var8 != 'e') {
            var11 = m712(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 209) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'z') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m709(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'M') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 212) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 203) {
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

   public static Object m714(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m713(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(HudItem141.class, "m714", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ĸ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
