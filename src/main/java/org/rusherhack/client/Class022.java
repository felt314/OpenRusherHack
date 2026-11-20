package org.rusherhack.client;
import org.rusherhack.*;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.Class587;
import org.rusherhack.client.api.accessors.gui.IMixinScreen;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.core.setting.Setting;

public class Class022 extends Util040 {
   public static VectorGraphic f1182;
   public Class587 f1183;
   public static long f1184 = Class066.m4320(2012182543363759754L, 5202497053065867616L, MethodHandles.lookup().lookupClass()).m4325(266049380480345L);
   public static String[] f1185;
   public static String[] f1186;
   public static long[] f1188;
   public static Integer[] f1189;
   public static Map f1190;
   public static Object[] f1191 = new Object[65];
   public static String[] f1192 = new String[65];

   public boolean keyPressed(int var1, int var2, int var3) {
      int[] var6 = Util040.m3055();
      boolean var9 = Class170.f3364.m7115().getHudHandler().keyTyped(var1, var2, var3);
      if (var6 == null) {
         if (var9) {
            boolean var10002 = true;
            return true;
         }

         var9 = super.keyPressed(var1, var2, var3);
      }

      return var9;
   }

   public boolean keyReleased(int var1, int var2, int var3) {
      return super.keyReleased(var1, var2, var3);
   }

   @Override
   public boolean mouseReleased(double var1, double var3, int var5) {
      Class170.f3364.m7115().getHudHandler().mouseReleased(var1, var3, var5);
      super.mouseReleased(var1, var3, var5);
      return true;
   }

   public Class022() {
    }

   @Override
   public void render(DrawContext var1, int var2, int var3, float var4) {
        
    }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      int[] var11 = Util040.m3055();
      boolean var10000 = Class170.f3364.m7115().getHudHandler().mouseScrolled(var1, var3, var7);
      if (var11 == null) {
         if (var10000) {
            boolean var10002 = true;
            return true;
         }

         var10000 = super.mouseScrolled(var1, var3, var5, var7);
      }

      return var10000;
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      int[] var8 = Util040.m3055();
      boolean var11 = super.mouseClicked(var1, var3, var5);
      if (var8 == null) {
         if (var11) {
            boolean var12 = true;
            return true;
         }

         var11 = Class170.f3364.m7115().getHudHandler().mouseClicked(var1, var3, var5);
      }

      if (var8 == null) {
         if (var11) {
            boolean var10002 = true;
            return true;
         }

         var11 = false;
      }

      return var11;
   }

   @Override
   public void m2802(DrawContext var1, int var2, int var3, float var4) {
   }

   @Override
   public void tick() {
      super.tick();
   }

   @Override
   public void init() {
        
    }

   @Override
   public void close() {
      long var1 = f1184 ^ 5304800018588L;
      this.mouseReleased(0.0, 0.0, 0);
      Class170.f3364.m7112().m8469(((org.rusherhack.client.api.ui.theme.ITheme)(org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "T", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.ui.theme.ITheme.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7115(),  -2149338897008935981L,  var1))));
      Class170.f3364.m7112().m8469(Class170.f3364.m7106());
      super.close();
   }

   public void mouseMoved(double var1, double var3) {
      Class170.f3364.m7115().getHudHandler().mouseMoved(var1, var3);
   }

   public boolean charTyped(char var1, int var2) {
      int[] var5 = Util040.m3055();
      boolean var8 = Class170.f3364.m7115().getHudHandler().charTyped(var1);
      if (var5 == null) {
         if (var8) {
            boolean var10002 = true;
            return true;
         }

         var8 = super.charTyped(var1, var2);
      }

      return var8;
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
      if (f1192[var4] != null) {
         return var4;
      } else {
         Object var5 = f1191[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 47;
               case 1 -> 57;
               case 2 -> 28;
               case 3 -> 55;
               case 4 -> 51;
               case 5 -> 17;
               case 6 -> 8;
               case 7 -> 1;
               case 8 -> 61;
               case 9 -> 15;
               case 10 -> 24;
               case 11 -> 0;
               case 12 -> 19;
               case 13 -> 38;
               case 14 -> 40;
               case 15 -> 36;
               case 16 -> 52;
               case 17 -> 41;
               case 18 -> 3;
               case 19 -> 35;
               case 20 -> 48;
               case 21 -> 14;
               case 22 -> 54;
               case 23 -> 32;
               case 24 -> 5;
               case 25 -> 13;
               case 26 -> 60;
               case 27 -> 25;
               case 28 -> 21;
               case 29 -> 6;
               case 30 -> 9;
               case 31 -> 37;
               case 32 -> 43;
               case 33 -> 53;
               case 34 -> 4;
               case 35 -> 11;
               case 36 -> 39;
               case 37 -> 34;
               case 38 -> 20;
               case 39 -> 63;
               case 40 -> 16;
               case 41 -> 26;
               case 42 -> 10;
               case 43 -> 59;
               case 44 -> 27;
               case 45 -> 29;
               case 46 -> 49;
               case 47 -> 46;
               case 48 -> 42;
               case 49 -> 33;
               case 50 -> 18;
               case 51 -> 22;
               case 52 -> 7;
               case 53 -> 50;
               case 54 -> 23;
               case 55 -> 44;
               case 56 -> 62;
               case 57 -> 12;
               case 58 -> 2;
               case 59 -> 58;
               case 60 -> 56;
               case 61 -> 31;
               case 62 -> 30;
               default -> 45;
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

            f1192[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f1191[0] = "Ek&ouZYq$3oNIro\"kFOw5of_C7 \"dJYj.3t\u0001Ml(oNbCa(/TLX|$/";
      f1191[1] = boolean.class;
      f1192[1] = "java/lang/Boolean";
      f1191[2] = "~a JIzb{\"\u0016Snrxi\u0007Wft}3Jï";
      f1191[3] = "B\u0004yw1G^\u001e{++SN\u001d0ȭ";
      f1191[4] = "\u0018nF:\u0005E\u0004tDf\u001fQ\u0014w\u000fſ";
      f1191[5] = "\u0016OPX}\u001f\nUR\u0004g\u000b\u001aV\u0019\u0015c\u0003\u001cSCXΗ";
      f1191[6] = "k?";
      f1191[7] = "k\u00038\u000f\u0007#w\u0019:S\u001d7g\u001aqB\u0019?a\u001f+\u000f\u0014&m_*H[>q\u0015qi\u00002L\u00101E\u00193v3>R\u0010";
      f1191[8] = "N\u00062T}(R\u001c0\bg<B\u001f{\u0019c4D\u001a!Tn-HZ \u0013!-@\u001a0\u0016!\r@\u001a0\u0016G<O\u00109\u001f}\u001f@\u00070";
      f1191[9] = "2\u001f92\u001f#.\u0005;n\u00057>\u0006p\u03a2";
      f1191[10] = "\u0014w1tSr\bm3(If\u0018nx9Mn\u001ek\"t@w\u0012+#3\u000fB\u0017`;?Os3d8>Mb\tG7)D";
      f1191[11] = void.class;
      f1192[11] = "java/lang/Void";
      f1191[12] = int.class;
      f1192[12] = "java/lang/Integer";
      f1191[13] = "OS[#\u00175SIY\u007f\r!CJ\u0012n\t)EOH#ǩ";
      f1191[14] = ".:)n2z2 +2(n\"#`#,f$&:n!\u007f(f<%.k$:`\u0012%a%-<\u0003/a5-64";
      f1191[15] = double.class;
      f1192[15] = "java/lang/Double";
      f1191[16] = "5\n\f\u0015Qq)\u0010\u000eIKe9\u0013EXLv?V\u0018^Wp3\u0016\f\u0015pa.\f\u0002UD";
      f1191[17] = "e\b\tQ0\u007f\u0010(\u0002^!0m0\u0011Y(y\u0005";
      f1191[18] = "+\u0014\u00032\u001cY7\u000e\u0001n\u0006M'\rJ\u007f\u0002E!\b\u00102ӑ";
      f1191[19] = "\u000bIR:p^~iY5a\u0011\u0003qJ2hXk";
      f1191[20] = char.class;
      f1192[20] = "java/lang/Character";
      f1191[21] = "1)>^P%-3<\u0002J1=0wƽ";
      f1191[22] = "[A\u0014D\u0012_G[\u0016\u0018\bKWX]\t\u000fXQ\u001d\u0000\u000f\u0012CU_\u001a\u0010\u0005\u0004}`\u0016\u0018\tKXZ\t\u000b\u0002FQ";
      f1191[23] = "u\u007f /\f\nie\"s\u0016\u001eyfiՑ";
      f1191[24] = "uz'*e[i`%v\u007fOycng{G\u007ff4*v^s&5m9Zrm-a9gN`%ir";
      f1191[25] = "=L|wbg!V~+xs1U5:\u007f`7\u0010w6wu;P|w\\}5Y~+";
      f1191[26] = "[?@!\u001d\u0001G%B}\u0007\u0015W&\tl\u0003\u001dQ#S!\u000e\u0004]cUj\u0001\u0010Q?\th\u001d\u0015D%NlA=s?F\u007f\u0007\u001dW";
      f1191[27] = "\\jzq\nQ@px-\u0010EPs3<\u0017VV6q0\u001fCZvzq1h\\\u007f";
      f1191[28] = "<K\u000b?AT7D\u001ap<L.C\u00139";
      f1191[29] = "H6Dw4{=\u0016Ox%4\\\u0018Ds!n(";
      f1191[30] = ";(\rmn}'2\u000f1ti71D pa14\u001emÝ";
      f1191[31] = "\u0017\f\u001fM\\\u0010\u000b\u0016\u001d\u0011F\u0004\u001b\u0015Vɥ";
      f1191[32] = "\u0005$X\u001c\u0010\u0007\u0019>Z@\n\u0013\t=\u0011Q\u000e\u001b\u000f8K\u001c\u0003\u0002\u0003xMW\f\u0016\u000f$\u0011U\u0010\u0013\u001a>VQL$\u000f5K]\u00105\u00187OZ\u000b\u0011";
      f1191[33] = "|A:\u001c7~wN+SVp|E/\t";
      f1191[34] = "\u0006\u0014\u0007l7:P\u0011CU)!-\u001c\u001a))3\b\u001b\t8$ZU\u0010\u0003-p;SG\u0019-H";
      f1191[35] = "*)Y\f\u001eB:4\u001a\u001efɭG \u0018T\u001c\u001c+s\u001a\u0013Y'~$\u001d\u0014^Fxs\u0007\u0014f";
      f1191[36] = "_\nR4\u0017x\u000b\tJ%f\"\u0005O[8# \u001c_LU\u000f<\u0004\b\u001e>\u0003~\u0019M <\u001d!X\fK0_<\u001d2\u001f.\u001e&]PJ.\u0002&b";
      f1191[37] = "W/VokZ\thSk\u0010]lrWewD\u000ecNp\u007f";
      f1191[38] = "S)sCf3\u0017+}@Y6jhxI=0\u0014ll\u001f&_P6,\u001d6!T\"z\u0006Y";
      f1191[39] = "OF\u0012%A^\u0011\u0001\u0017!:Όt@Q!@I\u0018\u001e\u0016$D";
      f1191[40] = "RIky \u0011RK*>\u0019Ѳ6F*)g\u001aHA?#)xTZ?<{\u0006SO5r\u0019";
      f1191[41] = "a\u007f3\u001dQ}5|+\f ';::\u0011z/8*(\u0007M.\\.:\u001a\u001a|7\"x\u0007_B5<'F\u001e)9~:\u0003 r'#p\u0018\u0019/c&+|\u001f9$&~\u001eJ98&A";
      f1191[42] = "V\f\u001f>O\u0018\u0002\u000f\u0007/>B\fI\u00162eL\u0011S\t;SKk]\u00169\u0004\u0019\u0000QT$A'\u0002O\u000be\u0000L\u000e\r\u0016 >N\u0010RWaUBRO\u0012_\u0007M\u0013LU>\u0001\u001a\tLm";
      f1191[43] = "b2)T2\u001a611ECJ2v\u001bH/`6l2Z._\u0007c=X'%bv6J8\\ee%\u0004C";
      f1191[44] = "s$am'(!+zn\u001f? hYzs\f-y|j\u001f0t*vxe6+oe\u0007";
      f1191[45] = "TuA\u0011\u000e%\u0010wO\u00121ҽmkJSR9\u00161E\u0013\b";
      f1191[46] = "ne\u001b\u0011k,k<O\u0005\tj<}=\u0004gx,e\r1nj0}\u0010\u000eojQ>\n\u0011h.3k\n\rh\u0011";
      f1191[47] = "\f*YV\u0004cBt\u0005A{fP)QT\u0001\u001c\f0D\u0003\u001apL,OP{uF)\u0007\u0007\u0010y\u00044B9\u0012g[u\u0003R\u001e%F0=\u0006\u0000d\\p_S\u0000x\\O";
      f1191[48] = "x\u001b#nWps\u0015r+5ը\u0012F>m\\1,Q/u\t\t";
      f1191[49] = "$\\+(=svS0+\u0005ż\u001a\u0007,\u007f~y$Wb.t\u000b";
      f1191[50] = "_h\\\u0001E<\u000bkD\u00104y\u000f6B\rN\u0003S/WZUo\u00133\\\t4j\u00196\u0014^_f[+Q`]x\u0004j\u0010\u000bQ:\u0019/._O{\u0003oL\nOg\u0003P";
      f1191[51] = "$G'\"/\u0005pD?3^_~\u0002..\u0015^x\u00146.2:p\u00043y`Q|F.<^Sb\u0019o}5_ \u0004*CnA}N1z3\u0005x\u0015Uz4BaG4|cXa\u007f";
      f1191[52] = "TC\u0003~\u0015Q\u0000C\u0018~lɾo]\u001ez\u0000\n\u000f\u0004Mc\u00134PG\nfSV\u0005G\u0016fl";
      f1191[53] = "+\r\u000b\u001c>\t(\u0007H\rW\u001d0\u0005\u0015\u0005W\u00124\u0014\f\u001d)\u0015!\u001eB\u007f4\n$\u0018K\u0000g\u001buDr@,\b+@\u0010\u0015,\u0014+\u007f";
      f1191[54] = "V3{)t9\u00020c8\u0005m\u000bbs\u0014t~\u0006g\t%;j\u0016601w\u007fW\u000b0\"}~Sj6ug~k";
      f1191[55] = "\u0001$m\fC0U$v\f:ˑ:gd\u001c\n$\n0e\u0018]U";
      f1191[56] = "\u001eFr\u0014$b@\u0001w\u0010_ѿ%E<\u001656]\u00173\r6\u000e";
      f1191[57] = "?.\"QRI:wvE0\fg1)UQ\u0013f1\tOQ\ba#,HB\u0019lJqCH\f8+w\u0014R\f";
      f1191[58] = "\u0017P?\"@uCS'31)G\u0019\u00112I'Fh}8U{NQ |P *X6'\u0000.\u0013\u0005r\"[J\u001a\u0013)rUsGW,)1s@\u00105{Pu\u0017\n5C";
      f1191[59] = "MrD\u001aq\"\u00135A\u001e\nċv!K\u0002aq\u0016!\\\u0012fN";
      f1191[60] = "TQ93t\u0016\u0010S70K\u001f\u0000V6n'-W\u0017j1uz\u0004Q03u\u0011\b\u0013-vK\u0013\u0016Ll7 \u001fTQ)\t{\u0001\t\u001b20&E\f@V0!\u0002\u0015\u001276v\u0018\u0015*";
      f1191[61] = "&^[/\blx\u0019^+sɒ\u001d\u000eBi\u0013xx\u001e_*\u0001\u0000";
      f1191[62] = "6qYglQbj\u0005!WϒRhCs)K,oVyg)0tVf5W7a\\(W";
      f1191[63] = "0o'\u000f\t3;avJk̵Z2:\f\u0002rd%+\u0014WJe%?\u0010T(0%#\u0010k";
      f1191[64] = "\u001b64Mj\u001bI9/NR\fHz\fZ>#L` C?\u0019%;tU3\u0012\u001aowM\"c";
   }

   public static Class m706(long var0, long var2) {
      Class var5 = null;
      int var4 = m704(var0, var2);
      Object var6 = f1191[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1192[var4]);
            f1191[var4] = var5;
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
      Object var5 = f1191[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1192[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m706(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m707(var12, var10, var11);
            if (var13 != null) {
               f1191[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m708(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1191[var4] = var13;
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
               var12 = m706(2380315607748504L, 0L);
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
      Object var5 = f1191[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1192[var4];
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
               f1191[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m706(2380315607748504L, 0L);
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
                     f1191[var4] = var19;
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
               var23 = m706(2380315607748504L, 0L);
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
         if (var8 != 'C' && var8 != 'U' && var8 != 'L' && var8 != 'p') {
            var11 = m712(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'T') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'c') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m709(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'C') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'U') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'L') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class022.class, "m714", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/Ô" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
