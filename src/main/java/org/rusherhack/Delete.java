package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.ui.window.content.ListItemContent;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.client.api.ui.window.view.ListView;
import org.rusherhack.client.api.ui.window.view.ListView$Column;
import org.rusherhack.client.api.utils.objects.PlayerRelation;

public class Delete extends ListItemContent {
   public PlayerRelation f4081;
   public static long f4082 = Class066.m4320(-5677779282565670482L, 6160981832241557981L, MethodHandles.lookup().lookupClass()).m4325(118241814960552L);
   public static String[] f4083;
   public static String[] f4084;
   public static Object[] f4086 = new Object[29];
   public static String[] f4087 = new String[29];

   public Delete(PlayerRelation var1, ListView<Delete> var2, ListView var3) {
    }

   @Override
   public String getAsString(ListView$Column var1) {
      return var1.getName().equalsIgnoreCase("username") ? this.f4081.username() : "null";
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
      if (f4087[var4] != null) {
         return var4;
      } else {
         Object var5 = f4086[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 20;
               case 1 -> 19;
               case 2 -> 33;
               case 3 -> 11;
               case 4 -> 27;
               case 5 -> 18;
               case 6 -> 43;
               case 7 -> 16;
               case 8 -> 24;
               case 9 -> 22;
               case 10 -> 21;
               case 11 -> 8;
               case 12 -> 28;
               case 13 -> 15;
               case 14 -> 14;
               case 15 -> 60;
               case 16 -> 62;
               case 17 -> 34;
               case 18 -> 39;
               case 19 -> 4;
               case 20 -> 57;
               case 21 -> 32;
               case 22 -> 3;
               case 23 -> 54;
               case 24 -> 5;
               case 25 -> 30;
               case 26 -> 49;
               case 27 -> 29;
               case 28 -> 61;
               case 29 -> 31;
               case 30 -> 0;
               case 31 -> 13;
               case 32 -> 23;
               case 33 -> 37;
               case 34 -> 6;
               case 35 -> 47;
               case 36 -> 56;
               case 37 -> 53;
               case 38 -> 2;
               case 39 -> 44;
               case 40 -> 26;
               case 41 -> 36;
               case 42 -> 63;
               case 43 -> 59;
               case 44 -> 46;
               case 45 -> 9;
               case 46 -> 42;
               case 47 -> 40;
               case 48 -> 41;
               case 49 -> 45;
               case 50 -> 58;
               case 51 -> 38;
               case 52 -> 51;
               case 53 -> 55;
               case 54 -> 25;
               case 55 -> 17;
               case 56 -> 1;
               case 57 -> 12;
               case 58 -> 10;
               case 59 -> 48;
               case 60 -> 50;
               case 61 -> 35;
               case 62 -> 7;
               default -> 52;
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

            f4087[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f4086[0] = "&BdXzz:Xf\u0004`n*[-ɰ";
      f4086[1] = int.class;
      f4087[1] = "java/lang/Integer";
      f4086[2] = "#\u0002/V\u0000\u0006?\u0018-\n\u001a\u0012/\u001bf\u001b\u001d\u0001)^=\f\u001b\u001f?^\u00017'\u0007%\u001c;";
      f4086[3] = "7\u001d,&?~<\u0012=iBf/\u00154 ";
      f4086[4] = "\u0001C!Q\u0004\u0015\u001dY#\r\u001e\u0001\rZh\u001c\u001a\t\u000b_2Q\u0017\u0010\u0007\u001f3\u000b\u001f\f\u001d\u001f)\u001d\u001c\u0005\rE5Q&\f\u000fH#\r$\u0005\u0002P2\u0016\u0019\u000e";
      f4086[5] = "%\fO~N'9\u0016M\"T3)\u0015\u00063S /PK?Q?+\u0010L~Y*)\u001bX$U=$\r\u0006\u0013S?'\u001fF4y*)\u001bX$U=$";
      f4086[6] = "3\u0019bz\u0019Q/\u0003`&\u0003E?\u0000+Ɠ";
      f4086[7] = ";M8z#e'W:&9q7TqȠ";
      f4086[8] = "\u001dZ%~J:\u0001@'\"P.\u0011Cl3T&\u0017F6~Y?\u001b\u000679\u00168\u001bF&?Oa\u0004A''\u0016\u0003\u001b[6\u0006Q*\u0005\f\u0001?T:\u001fF";
      f4086[9] = boolean.class;
      f4087[9] = "java/lang/Boolean";
      f4086[10] = "9_\r\u0007\t7%E\u000f[\u0013#5FDł";
      f4086[11] = "?ZADkz#@C\u0018qn3C\bО";
      f4086[12] = void.class;
      f4087[12] = "java/lang/Void";
      f4086[13] = "rBN=itlJTr\u000bhkW";
      f4086[14] = "\n<w\u0012hp\u00013f]\t~\n8b\u0007";
      f4086[15] = "{_k\u007f<.gEi#&:wF\"2\"2qCx\u007f/+}\u0003y8`,}Ch>9uwBb%+5`\u0003[8 ?{ZO> /qCx";
      f4086[16] = "\u0002\u0007UTNvU\u000bA\f.o_\u0004/XWa\rR@W\\>\bh\u0011\nS8\u0003\u0011\u0015\u0017\u0012e3";
      f4086[17] = "58Q}a/`9Ak\u001bĝ\n3\u001d+c$zbW'jC";
      f4086[18] = "AP\u0011[\u0004/\u0010\u001a\u001dRc%\u001c\u0004G]\u000e\u0011\u000b\u0000ME\u000f_K\b^CZ4N\u0011ICco\u0016\u000b\u001b^\u001d.\t\u0003\u001f#";
      f4086[19] = "WiR3(\u0003W)P\u000bȟ<Mh\u0010uw\u0001\u000b{S\u000b";
      f4086[20] = "$'A\u001d\u0005hw2JG48\u001daAST-vdXDT\u0014'2VM\r\u007f\"+AM4";
      f4086[21] = "\u0000\u001aU>]\u0015U\u001bE('χ?\u001e\u0013$@\u0003SK\u00124V";
      f4086[22] = ",rvh\u000e\nhqj5g\u0015lv`0\u000e\rz\u001b ?\u0019\b.p%&\u000e\b\u0017";
      f4086[23] = "7(\u007fZ\u001fN}!3_e\u001b\f`*K\u0005\u000ege3\\\u0005763=U\\\\3**Ue";
      f4086[24] = "27\t1\u0012p3 Y*hf\u000ev\f+W~0,Lh\u0004\u000f3uHn\u00191i5\u000b=h";
      f4086[25] = "VW.YX|\u0003U}\beiXPbX\u0015~z[xHe3PL#U\u0015d\\X{";
      f4086[26] = "H\u0014\u0004\u0007m\f\u0015QD\\\u001d\u0003\u0018\u00103Px\u0001uV\u001cG}U\u001eS\u0005P}l";
      f4086[27] = "WD(8;#VSx#AҰk\u0003z4\u007f5\tGy(\"";
      f4086[28] = "\u0013\u0007\u0012+m9\u0016\u001e\u0005+T?P\u0013\u0005//\u0013F\b\u000b19\u0019@\u0015\u0001Kn;W\u000eU k\"@\u000elu7/\u0017^\u0015q*nJn";
   }

   public static Class m706(long var0, long var2) {
      Class var5 = null;
      int var4 = m704(var0, var2);
      Object var6 = f4086[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f4087[var4]);
            f4086[var4] = var5;
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
      Object var5 = f4086[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f4087[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m706(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m707(var12, var10, var11);
            if (var13 != null) {
               f4086[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m708(var14[var15], var10, var11);
                  if (var13 != null) {
                     f4086[var4] = var13;
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
               var12 = m706(989282416373427L, 0L);
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
      Object var5 = f4086[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f4087[var4];
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
               f4086[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m706(989282416373427L, 0L);
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
                     f4086[var4] = var19;
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
               var23 = m706(989282416373427L, 0L);
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
         if (var8 != 'x' && var8 != 204 && var8 != 207 && var8 != 251) {
            var11 = m712(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'f') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'E') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m709(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'x') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 204) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 207) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Delete.class, "m714", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ǉ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
