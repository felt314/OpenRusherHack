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
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.window.PopupWindow;
import org.rusherhack.client.api.ui.window.content.ComboContent;
import org.rusherhack.client.api.ui.window.content.ComboContent$AnchorSide;
import org.rusherhack.client.api.ui.window.content.component.ButtonComponent;
import org.rusherhack.client.api.ui.window.content.component.TextComponent;
import org.rusherhack.client.api.ui.window.content.component.TextFieldComponent;

public class Class452 extends PopupWindow {
   public static long f7362 = Class066.m4320(6017485415220780327L, 5966267247086840633L, MethodHandles.lookup().lookupClass()).m4325(262600991822368L);
   public static String[] f7363;
   public static String[] f7364;
   public static Object[] f7366 = new Object[44];
   public static String[] f7367 = new String[44];

   public Class452(Relations var1, boolean var2) {
        super(String.format("New %s", var2 ? "Friend" : "Enemy"), var1, 130.0, 50.0);
      boolean var10004 = true;

      super.view.setContentPadding(5.0);
      TextComponent var8 = new TextComponent(this, "Username:");
      TextFieldComponent var5 = new TextFieldComponent(this, "", 100.0, false);
      ComboContent var6 = (ComboContent)null;
      var6.addContent(var8);
      var6.addContent(var5, ComboContent$AnchorSide.RIGHT);
      ButtonComponent var9;
      (var9 = new ButtonComponent(this, "Add", () -> {
         long var3x = f7362 ^ 24079449359959L;
         Class452 var7;
         if (var2 && !RusherHackAPI.getRelationManager().isFriend(var5.getValue())) {
            org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "V", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7109(),  var5.getValue(),  6780319145530397676L,  var3x);
            var7 = this;
         } else {
            if (!var2 && !RusherHackAPI.getRelationManager().isEnemy(var5.getValue())) {
               org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "V", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7109(),  var5.getValue(),  6779663830376061844L,  var3x);
            }

            var7 = this;
         }

         var7.onClose();
      })).setPredicate(var1x -> {
         if (!var5.getValue().isEmpty()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.addContent(var6);
      this.addContent(var9);
   }

   static {
    }
   public static String m1491(byte[] var0) {
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
   public static int m1730(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f7367[var4] != null) {
         return var4;
      } else {
         Object var5 = f7366[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 22;
               case 1 -> 62;
               case 2 -> 24;
               case 3 -> 50;
               case 4 -> 52;
               case 5 -> 32;
               case 6 -> 51;
               case 7 -> 47;
               case 8 -> 28;
               case 9 -> 17;
               case 10 -> 48;
               case 11 -> 44;
               case 12 -> 38;
               case 13 -> 14;
               case 14 -> 61;
               case 15 -> 37;
               case 16 -> 41;
               case 17 -> 7;
               case 18 -> 29;
               case 19 -> 30;
               case 20 -> 26;
               case 21 -> 23;
               case 22 -> 1;
               case 23 -> 11;
               case 24 -> 49;
               case 25 -> 58;
               case 26 -> 15;
               case 27 -> 34;
               case 28 -> 53;
               case 29 -> 60;
               case 30 -> 4;
               case 31 -> 54;
               case 32 -> 46;
               case 33 -> 8;
               case 34 -> 12;
               case 35 -> 3;
               case 36 -> 6;
               case 37 -> 36;
               case 38 -> 0;
               case 39 -> 31;
               case 40 -> 9;
               case 41 -> 56;
               case 42 -> 10;
               case 43 -> 25;
               case 44 -> 35;
               case 45 -> 40;
               case 46 -> 43;
               case 47 -> 59;
               case 48 -> 20;
               case 49 -> 63;
               case 50 -> 13;
               case 51 -> 18;
               case 52 -> 33;
               case 53 -> 57;
               case 54 -> 19;
               case 55 -> 39;
               case 56 -> 21;
               case 57 -> 27;
               case 58 -> 5;
               case 59 -> 42;
               case 60 -> 16;
               case 61 -> 2;
               case 62 -> 45;
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

            f7367[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m1731() {
      f7366[0] = "YNdG\u0004\fETf\u001b\u001e\u0018UW-ɯ";
      f7366[1] = int.class;
      f7367[1] = "java/lang/Integer";
      f7366[2] = ":]Pf\n}1RA)we\"UH`";
      f7366[3] = boolean.class;
      f7367[3] = "java/lang/Boolean";
      f7366[4] = "&\u001cZ\r+M:\u0006XQ1Y*\u0005\u0013Ж";
      f7366[5] = "\u000b1k\r9:\u0017+iQ#.\u0007(\"ɗ";
      f7366[6] = ")p\b_\u0015\u001f5j\n\u0003\u000f\u000b%iA\u0012\u000b\u0003#l\u001b_\u0006\u001a/,\u001a\u0018I\u001d/l\u000b\u001e\u0010D%m\u0001\u0005\u0002\u00042,\f\u001e\n\u001a)l\n\u001f\u0013D\u0012g\u0017\u0005!\u0003#n\u000b2\b\u00076m\u0001\u0014\t\u001e";
      f7366[7] = "l|d\u000f1+pffS+?`e-Ŋ";
      f7366[8] = "-ym*\u0016\u00161cov\f\u0002!`$Ѱ";
      f7366[9] = void.class;
      f7367[9] = "java/lang/Void";
      f7366[10] = "MBfE\u000e\u0001QXd\u0019\u0014\u0015A[/\b\u0010\u001dG^uE\u001d\u0004K\u001er\u0012\u000f\u0000G]/\".\u0011NQu\u0002\u0013\u001aoQo\n\u001b\u0011P";
      f7366[11] = "h(>v\\.t2<*F:d1w;B2b4-vO+nt\u000b-]3b(\u00119M0F\n\u0010";
      f7366[12] = "\u00170)\u000fxY\u000b*+SbM\u001b)`BfE\u001d,:\u000fk\\\u0011l(DkX\r0+\u000f}E\u0016&!V$|\u00172;Q]E\u0016&!V";
      f7366[13] = "T\u0004^KbaH\u001e\\\u0017xuX\u001d\u0017\u0006|}^\u0018MKqdRXL\f>cR\u0018]\ng:M\u001f\\\u0012>GR\u001bI\tuBR\u0013N";
      f7366[14] = "\u0012dkN:8\u000e~i\u0012 ,\u001e}\"\u0003$$\u0018xxN)=\u00148y\tf:\u0014xh\u000f?c\u001eyb\u0014-#\t8O\u000f%/\u0012Uc\u000e<(\u0013b";
      f7366[15] = "b`\u0000\u0004$k~z\u0002X>\u007fnyII:wh|\u0013\u00047nd<\u0012Cxid|\u0003E!0n}\t^3py<0C8zbe$E8jh|\u0013";
      f7366[16] = "g.1\u001d\u0017r{43A\rfk7xѻ";
      f7366[17] = "UO\u0017{=\u0007IU\u0015''\u0013YV^6#\u001b_S\u0004{.\u0002S\u0013\u0005<a\u0005SS\u0014:8\\YR\u001e!*\u001cN\u00133:\"\u0010U~\u001f;;\u0017TIT\u0014!\u0011RR\u0002\u0006&\u0016_";
      f7366[18] = double.class;
      f7367[18] = "java/lang/Double";
      f7366[19] = "zyNf;\u0004fcL:!\u0010v`\u0007+%\u0018pe]f(\u0001|%\\!g\u0006|eM'>_vdG<,\u001fa%J'$\u0001zeL&=_W~]<&\u001fVdD8&\u001fpe]";
      f7366[20] = "yN3}H?gF)2\u0000?}L1u\t$=\u007f7y\u0002#pN1y";
      f7366[21] = "/2\u0013\f\u0006C3(\u0011P\u001cW#+ZA\u0018_%.\u0000\f\u0015F)n\u0012G\u0015B52\u0011\f\u0017Y--\u0015L\u0010\u0018!2\u0013\f=B%-&G\u0012S2%\u001aA\u0011";
      f7366[22] = "<\u0003n\u001b$B7\f\u007fTEL<\u0007{\u000e";
      f7366[23] = "](YUr0\u0017*_\u001aH2\f(@eyu\r&D\u0001&!\bx";
      f7366[24] = "p$!Tk\u00125`u\u0019ZĥM'c\u0007;B1qj\u00140{";
      f7366[25] = "re+\u0011\u0011Is=}kȸ,t?}\r_\\3m~\ta";
      f7366[26] = "(\biIg\u001bmL=\u0004Vό\u0015\u000bnAgC|N*\u0015*";
      f7366[27] = "1$U&6*g-F-\u000f?`3y=n;j37~hi}&\f!695_\t.\u007f;}$Y\u007fl6\f";
      f7366[28] = "y29\u007f\f ys|#cq$'\u000f \u0005d%-8G\t /;<*\u001b#59Dy\nh%:?)[{(K";
      f7366[29] = "\u0013'\u0007L\u001d\u0011LyW\u0004dKQ\r]E\u0018[*zYW\u0019\u0011\u001a}\u0005M\u0002*";
      f7366[30] = "C\u000e<K\u0015\u0010FR-\u001ckŰ)\n:\u001a\u001aS\u0012UdJR*\u0010TbT\u0012\u0011O\n2\u001ck";
      f7366[31] = "\u0012\u001c\u000b0*\tX\u001e\r\u007f\u0010\u001cN\u001d&gv\tO\u0017\u0011\u0000zME\u0001\u0015mhN_\u0003m>y\u0005O\u0000\u0016n(\u0016Bq";
      f7366[32] = "$:2\u0016,\"#%/\u0014E `\u00109\u000f('w^z\tz0be%W*x\u001bd\"\u00048z+c~\u001e#A";
      f7366[33] = "Wi^\u000ed \u0001`M\u0005]5\u0006~q\t09\u001b\u0012\u0005\bb-\u0013)ZV2ej,U\u001f0-\u0011|\u0004\f=\\";
      f7366[34] = "\u000fF{\n{k\u000f\u0007>V\u0014:RSMUr/SYz2~kYO~_lhCM\u0006Y+3@AbHy(E?8[d>ODh\nw3>";
      f7366[35] = "Z\u0016\u0017Hxx\f\fHH\u001d}`U\u0016Ss$\u000eR\u0014\u0010\"\u0014\\RQA-z[P\u0012\u0010\u001d";
      f7366[36] = "eL\u0001\b\u000e't\u001e\u001a\rp\u0019O<!*p(1\u0013\u001f\b\u00149c\b\u001a";
      f7366[37] = "OG'}c\u000eAY||YZ\u001dDG/=\\\fYz$\u001c\\\u0016Qr/#5O\\l:0VHCq8Y";
      f7366[38] = "D.-u<\u001b\u001bz(+G\u0004\u0018k\u0006q!\u0003\u0018q1N.\u0013\u0019v+yG\u0014\u0015y*. \u0014\u0010{&\u0016y\u0016\u0005z<m)G\u0016wM";
      f7366[39] = "\u0017sK_I\u001aZ&[\u0013,KFak\u0007HYF\u001d\f\t\u0013UR&SWC\u001d+";
      f7366[40] = "\u0017\t}R-i\u0011L,\u0001\u0013`\u0016KKJ~w\u001a\\zL~\u001b\u0016\twRv}\u0001K)@\u0013%\u0012G~AhuCTs0";
      f7366[41] = "a0G~\b@2cBirV\u000f9F-\u0003\u00034f\u0018}Kz6g\u001ec\u000bAi9N+r";
      f7366[42] = "Ik,lV`Nt1n?b\rB;yZrv6:+NzMid{\u0006\u0003Ln7i\u00043K2-r?";
      f7366[43] = "\u001a\u0018EFOwP\u001aC\tulL>G\u0011\u000ef*KJ\u0006\u0018zQ\u001b\u001b\u0015\u0015\u000b";
   }

   public static Class m1732(long var0, long var2) {
      Class var5 = null;
      int var4 = m1730(var0, var2);
      Object var6 = f7366[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f7367[var4]);
            f7366[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m1733(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m1734(Class var0, String var1, Class var2) {
      Field var3 = m1733(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m1734(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m1735(long var0, long var2) {
      int var4 = m1730(var0, var2);
      Object var5 = f7366[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f7367[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m1732(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m1732(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m1733(var12, var10, var11);
            if (var13 != null) {
               f7366[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m1734(var14[var15], var10, var11);
                  if (var13 != null) {
                     f7366[var4] = var13;
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
               var12 = m1732(1560305322789690L, 0L);
            }
         }
      }
   }

   public static Method m1736(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m1737(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m1736(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m1737(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m1738(long var0, long var2) {
      int var4 = m1730(var0, var2);
      Object var5 = f7366[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f7367[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m1732(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m1732(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m1736(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f7366[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m1732(1560305322789690L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m1737(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f7366[var4] = var19;
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
               var23 = m1732(1560305322789690L, 0L);
            }
         }
      }
   }

   public static MethodHandle m1739(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 163 && var8 != 236 && var8 != 'k' && var8 != 254) {
            var11 = m1738(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'V') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 209) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m1735(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 163) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 236) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'k') {
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

   public static Object m1740(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m1739(var0, var1, var2, var3, var6, var9);
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class452.class, "m1740", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/е" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
