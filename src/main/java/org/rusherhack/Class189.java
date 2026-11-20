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
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumers;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.BufferAllocator;

import org.rusherhack.client.api.feature.module.impl.render.Chams;
import org.rusherhack.client.api.feature.module.impl.render.ChamsMode;
public class Class189 implements VertexConsumerProvider {
   public boolean f3670;
   public Immediate f3671;
   public Immediate f3673;
   public static long f3674 = Class066.m4320(-2226251207915565098L, 6268283439229158427L, MethodHandles.lookup().lookupClass()).m4325(252883419527419L);
   public static String[] f3675;
   public static String[] f3676;
   public static long f3678;
   public static Object[] f3679 = new Object[60];
   public static String[] f3680 = new String[60];

   public VertexConsumer getBuffer(RenderLayer var1) {
        return null;
    }

   public Class501 m7652(Color var1) {
      long var2 = f3674 ^ 14360928059303L;
      return new Class501(((net.minecraft.client.render.BufferBuilder)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ê", java.lang.invoke.MethodType.methodType(net.minecraft.client.render.BufferBuilder.class, java.lang.Object.class, long.class, long.class)), Class352.f5725,  2378913161094134520L,  var2))), var1.getRGB());
   }

   public void m7653() {
      this.f3673.draw();
   }

   public Class189(Chams var1, Immediate var2) {
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
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3680[var4] != null) {
         return var4;
      } else {
         Object var5 = f3679[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 53;
               case 1 -> 5;
               case 2 -> 58;
               case 3 -> 61;
               case 4 -> 18;
               case 5 -> 43;
               case 6 -> 10;
               case 7 -> 33;
               case 8 -> 50;
               case 9 -> 30;
               case 10 -> 4;
               case 11 -> 44;
               case 12 -> 49;
               case 13 -> 20;
               case 14 -> 59;
               case 15 -> 6;
               case 16 -> 23;
               case 17 -> 26;
               case 18 -> 14;
               case 19 -> 9;
               case 20 -> 7;
               case 21 -> 57;
               case 22 -> 13;
               case 23 -> 24;
               case 24 -> 62;
               case 25 -> 60;
               case 26 -> 15;
               case 27 -> 55;
               case 28 -> 32;
               case 29 -> 42;
               case 30 -> 47;
               case 31 -> 12;
               case 32 -> 39;
               case 33 -> 51;
               case 34 -> 21;
               case 35 -> 63;
               case 36 -> 38;
               case 37 -> 17;
               case 38 -> 35;
               case 39 -> 1;
               case 40 -> 28;
               case 41 -> 52;
               case 42 -> 27;
               case 43 -> 22;
               case 44 -> 8;
               case 45 -> 48;
               case 46 -> 34;
               case 47 -> 41;
               case 48 -> 25;
               case 49 -> 3;
               case 50 -> 56;
               case 51 -> 0;
               case 52 -> 19;
               case 53 -> 29;
               case 54 -> 2;
               case 55 -> 46;
               case 56 -> 16;
               case 57 -> 40;
               case 58 -> 45;
               case 59 -> 54;
               case 60 -> 11;
               case 61 -> 37;
               case 62 -> 36;
               default -> 31;
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

            f3680[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f3679[0] = "v\u0019,\u000eIoj\u0003.RS{z\u0000eʒ";
      f3679[1] = "kp&-\f\u0012kp1q\u0000\u001dq;1o\u0000\bvJ`;V";
      f3679[2] = ":M\u007f?\u0019;'X'\u001dX6?^";
      f3679[3] = int.class;
      f3680[3] = "java/lang/Integer";
      f3679[4] = "bgJ@\u0018<bg]\u001c\u00143x,]\u0002\u0014&\u007f]\n[Lb(aR\u000f\u0006&S6\u000bWM";
      f3679[5] = void.class;
      f3680[5] = "java/lang/Void";
      f3679[6] = "r!+|.\u000fn;) 4\u001b~8bǂ";
      f3679[7] = "'\u000b&bOs9\u0003<--o>\u001e";
      f3679[8] = ">l\u000f~rc5c\u001e1\u0013m>h\u001ak";
      f3679[9] = boolean.class;
      f3680[9] = "java/lang/Boolean";
      f3679[10] = ">d2/9m>d%s5b$/%m5w#^w8f5";
      f3679[11] = "~/!A~\u0003~/6\u001dr\fdd6\u0003r\u0019c\u0015aZ+R";
      f3679[12] = "m\u0014A/P_q\u000eCsJKa\r\bҙ";
      f3679[13] = "_o\b/IvT`\u0019`4nGg\u0010)";
      f3679[14] = "8ft\u001fZ:3ieP7>3uQ\u001b\u0005#7ia\u001b";
      f3679[15] = "|5O0LT`/MlV@p,\u0006š";
      f3679[16] = "19D\u0010KL-#FLQX= \rȸ";
      f3679[17] = "1?\b\u0016^4D\u001f\u0003\u0019O{%\u0011\b\u0012K!Q";
      f3679[18] = "K\u0000C/\fH> H \u001d\u0007_.C+\u0019]+";
      f3679[19] = "M\u001f\u0018\t\u0017\u001eQ\u0005\u001aU\r\nA\u0006QÃ";
      f3679[20] = "%gBMQ\u00139}@\u0011K\u0007)~\u000b\u0000L\u0014/;V\u0006W\u0012#{BMa\t%y@\u0002M5/aQ\nM\u0001";
      f3679[21] = "+Z\b31[7@\no+O'CA~,\\!\u0006\u001cx7Z-F\b3\u0010K0\\\u0006s$";
      f3679[22] = "%kf*h]9qdvrI)r/ɰ";
      f3679[23] = "B*2g=\u001fB*%;1\u0010Xa%%1\u0005_\u0010r~bF";
      f3679[24] = "\u007f\u000f9N\u001b=c\u0015;\u0012\u0001)s\u0016p\u0003\u0006:uS=\u000f\u0004%q\u0013:N\f0s\u0018.\u0014\u0000'~\u000ep#\u0006%}\u001c0\u0004,0s\u0018.\u0014\u0000'~";
      f3679[25] = "VHa\u001d~\u007f]GpR\u0012|SEr\u001d>";
      f3679[26] = "`\u0007\u001b5\\_|\u001d\u0019iFKl\u001eRxAXj[\u000f~Z^f\u001b\u001b5kDz\u0018/~Z^f\u001b\u001b";
      f3679[27] = "\r\u0013}\u0011\u0019M\u0011\t\u007fM\u0003Y\u0001\n4\\\u0004J\u0007OoK\u0002T\u0011OLZ\u0019K\u000b\u000et";
      f3679[28] = ">s@g\u0007p\bV@g\u0010,\u0004YZ,\u00102\u0004L]]Gk]\u0007\u0015";
      f3679[29] = "\rE^OE\u0002TF\u0003S/\u000b\\\u0016f\u0015T\u001d\u0001\u0017\u0007\u0010_\u0003AzXVL\u0000]\u0019\u0005DB\t0";
      f3679[30] = "_1ugHF\u000fcjc$B\t&Q~JC\t \u001b<GK\u0006:ibKL\u0019Z$r\u001e\u0011\u0016&%q\u001aBd";
      f3679[31] = "~C\u0019\u0007m\u0014#\u0000HM]өBD\t\u0000 \u0002!\f@Y8sr\u001f\u001f\u0007aO;\u0018FA]";
      f3679[32] = "tz?--!*,e>\u0013w\"r$&rz>\u0014i3w''/fw)nE*&,qq&w4\"x\u001c";
      f3679[33] = "5'77\u001f(l5h\u007f.y\\3(d\u001fd!j:;W";
      f3679[34] = "1=\\~\u001aB?g\u0005d'Ԛ[m\u0007tBB+;\u001fpJz";
      f3679[35] = "1:b\u001f=(h9?\u0003W4kL \u0002>9\fn!Dmsvde\u001a:Hg~fBl2m:8\u0015W";
      f3679[36] = "TIX]b,\nE_B\u0002;\u0006V^Xn\tQ\u001b\u0001\u0007=^TIX]b,\nE_B\u0002";
      f3679[37] = "#yB$\u001c\u0015~:\u0013n,\u0096\u001f+D#M\u0019 ?\u0019'P";
      f3679[38] = "\u0003a[\u0004c\r\u001et\u0002zcZ\u001fJA\u0013`L)nR\u0014aMcjB\u0007i\f\bsU\u0006\f";
      f3679[39] = " \u0003\u0019I2L4^\u001dTY¹L\tHG \u0010p\u0014B\u00160";
      f3679[40] = " 8%\u0005oc}{tO_ӕ\u001c8:\\=i\u007fe(R4";
      f3679[41] = "+.s\u0010u|6;*nȳF+.s\u0010u|6;*";
      f3679[42] = "X\u000b\u0010[\u001b)OB\u0014\u0004u*[O \r\u00118[3C\u001f\nt[RF\u0014\u001446";
      f3679[43] = " \"_R\u0002|}a\u000e\u00182r\u001crF\f\b\"|rX\u0010\\\u001brdZR\u000b{rzF\u00062";
      f3679[44] = "DPv3`\u0002\f\u0019/+\u0011\u000e\u0010]\u0011\u0001[aGB +)\u0011\u0011Z$#\u0011";
      f3679[45] = "7y'\u001cK_nkxTzM^m8OK\u0013#4*\u0010\u0003";
      f3679[46] = "{@dw\u0003L+\u0012{soB-Wjt\u0003pz\u0011;\"T'{Wnn\u0011\u001a=\u0014t.o";
      f3679[47] = "!j\fzQc\u007ff\u000be1tsu\n\u007f]F.6[$\u0000\u0011!j\fzQc\u007ff\u000be1";
      f3679[48] = "\u0013][\u001eq9N\u001e\nTA\u0083/XQJ%2D\b\u0003U!";
      f3679[49] = "K+\r`\u001c7\u0015'\n\u007f|9\u0013\u0013\u0017x\u001d#\u001bHZl\u001b'Ju\u0004:A4t";
      f3679[50] = "Ze\u000f\rP\u0002\u000ff\u0016Qk\u0000Xz\u000e\b\u00072\u000e;PQZe\nwTS\u0019\u0019\u000btP\u0000kZD<R\u001d\u0017[G8\u0001o";
      f3679[51] = "Y \u000b12qV<\u00027\fa6v\n0ns\u000b(\\j}M\u0007)\u000352pY\u007fY&\f";
      f3679[52] = "SjrQ\u0019\"Oj1H!yTv-XHumx-HL\u0013\ro*WLpP}$^!";
      f3679[53] = "|\u001b\u0018#;r%\tGk\nbl\u001b\u0013vq\u000f(\u001d\u0005#gn-\u0016\u001bc\n1k\u0005\u0018\u007fily\u000b\u0011\u0012";
      f3679[54] = "\u0017yX$IQ\u0003$\\9\"ȧ{\u007f\u0004y\\V\u0015c\u0015y]";
      f3679[55] = "M\r4=G{A\u0019|.;1,Gk+Y#\u0011\u0019=qJ\u001d\u001d\u0018b.\u0005 CN8=;";
      f3679[56] = "SpW\u001d^-\r&\r\u000e`l\u0005ZW\u0000\rj)wK\u0012`!\fyRA]\u007fZ#A\u007f";
      f3679[57] = "az5bJt4y,>qvce4g\u001dD5$j?I\u0013lah}\u0011hmg&kq,\u007f#hr\r-|';\u0000";
      f3679[58] = "\u0005\u0010/uUb\u0011M+h>½iNc)C,\n\u0006*p[";
      f3679[59] = "kta\u0005JE670OzԷWqkQ\u001eN<!9N\u001a";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f3679[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3680[var4]);
            f3679[var4] = var5;
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
      Object var5 = f3679[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3680[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f3679[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3679[var4] = var13;
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
               var12 = m123(589318981845946L, 0L);
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
      Object var5 = f3679[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3680[var4];
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
               f3679[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(589318981845946L, 0L);
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
                     f3679[var4] = var19;
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
               var23 = m123(589318981845946L, 0L);
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
         if (var8 != 220 && var8 != 224 && var8 != 214 && var8 != 201) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 234) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 226) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 220) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 224) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 214) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class189.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ɛ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
