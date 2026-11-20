package org.rusherhack.client;
import org.rusherhack.*;

import java.awt.Color;
import java.io.IOException;
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
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.Class221;
import org.rusherhack.Renderer273;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.client.api.utils.objects.TextField;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
public class Renderer043 extends Renderer026 {
   public boolean f1295;
   public static Renderer043 f1296;
   public VectorGraphic f1297;
   public Renderer026 f1298;
   public TextField f1299;
   public List<Class038> f1300;
   public Class038 f1301;
   public static Color f1302;
   public int f1303;
   public static Setting[] f1304;
   public static long f1305 = Class066.m4320(964240535791715275L, -2201565101618201171L, MethodHandles.lookup().lookupClass()).m4325(204860992298368L);
   public static String f1306;
   public static long[] f1307;
   public static Integer[] f1308;
   public static Map f1309;
   public static Object[] f1310 = new Object[137];
   public static String[] f1311 = new String[137];

   public Renderer043(Renderer026 var1) {
    }

   @Override
   public double m2882() {
      return 1.0;
   }

   @Override
   public double getScale() {
      return RusherHackAPI.getThemeManager().getClickGuiHandler().getScale();
   }

   @Override
   public boolean m2886() {
      boolean var10002 = true;
      return true;
   }

   @Override
   public double getHeight() {
        return 0.0;
    }

   public void m3072() {
      Setting[] var10000 = m3080();
      this.f1299.reset();
      this.m2881(false);
      Setting[] var3 = var10000;
      PanelHandlerBase var5;
      PanelHandlerBase var6 = var5 = Class170.f3364.m7115().getClickGuiHandler();
      if (var3 == null) {
         if (!(var6 instanceof Renderer273)) {
            return;
         }

         var6 = var5;
      }

      ((Renderer273)var6).m9581(this.f1298);
   }

   @Override
   public double getWidth() {
      return this.f1298.getWidth();
   }

   @Override
   public void tick() {
      boolean var10004 = true;
      this.f1303++;
   }

   @Override
   public boolean charTyped(char var1) {
      Setting[] var4 = m3080();
      boolean var7 = this.m1763();
      if (var4 == null) {
         if (var7) {
            this.f1299.charTyped(var1);
            return true;
         }

         var7 = false;
      }

      return var7;
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   @Override
   public int m2885() {
      return f1302.getRGB();
   }

   public void m3074(RenderContext var1, double var2, double var4, double var6, double var8) {
        
    }

   static {
    }

   @Override
   public Color m2855() {
      long var1 = f1305 ^ 125527435257741L;
      return ((org.rusherhack.client.api.ui.theme.ITheme)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.ui.theme.ITheme.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7115(),  2736062556279618990L,  var1))).getPrimaryColor();
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      Setting[] var8 = m3080();
      Renderer043 var11 = this;
      if (var8 == null) {
         if (this.f1301 != null) {
            this.f1301.m3028().run();
            return true;
         }

         var11 = this;
      }

      boolean var12 = var11.f1295;
      if (var8 == null) {
         if (var11.f1295) {
            this.m3072();
            return true;
         }

         var12 = super.mouseClicked(var1, var3, var5);
      }

      return var12;
   }

   public void m3076(String var1) {
        
    }

   @Override
   public boolean m2884() {
      return this.m1763();
   }

   @Override
   public void m2879(RenderContext var1, double var2, double var4, double var6, double var8) {
        
    }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      super.render(var1, var2, var4);
   }

   public static void m3079(Setting[] var0) {
      f1304 = var0;
   }

   public static Setting[] m3080() {
      return f1304;
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

   public static int m118(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4324;
      if (f1308[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f1307[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f1309.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f1309.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/client/α", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f1308[var3] = var15;
      }

      return f1308[var3];
   }

   public static int m119(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m118(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer043.class, "m119", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/α" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1311[var4] != null) {
         return var4;
      } else {
         Object var5 = f1310[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 49;
               case 1 -> 14;
               case 2 -> 61;
               case 3 -> 53;
               case 4 -> 12;
               case 5 -> 41;
               case 6 -> 52;
               case 7 -> 24;
               case 8 -> 59;
               case 9 -> 42;
               case 10 -> 16;
               case 11 -> 0;
               case 12 -> 18;
               case 13 -> 11;
               case 14 -> 50;
               case 15 -> 25;
               case 16 -> 31;
               case 17 -> 23;
               case 18 -> 54;
               case 19 -> 21;
               case 20 -> 48;
               case 21 -> 8;
               case 22 -> 32;
               case 23 -> 27;
               case 24 -> 56;
               case 25 -> 17;
               case 26 -> 46;
               case 27 -> 9;
               case 28 -> 1;
               case 29 -> 39;
               case 30 -> 10;
               case 31 -> 44;
               case 32 -> 22;
               case 33 -> 51;
               case 34 -> 5;
               case 35 -> 28;
               case 36 -> 2;
               case 37 -> 6;
               case 38 -> 7;
               case 39 -> 26;
               case 40 -> 19;
               case 41 -> 36;
               case 42 -> 37;
               case 43 -> 30;
               case 44 -> 58;
               case 45 -> 20;
               case 46 -> 47;
               case 47 -> 55;
               case 48 -> 63;
               case 49 -> 62;
               case 50 -> 38;
               case 51 -> 35;
               case 52 -> 57;
               case 53 -> 33;
               case 54 -> 29;
               case 55 -> 34;
               case 56 -> 3;
               case 57 -> 13;
               case 58 -> 45;
               case 59 -> 40;
               case 60 -> 15;
               case 61 -> 4;
               case 62 -> 43;
               default -> 60;
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

            f1311[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f1310[0] = "Q%t\nR-M?vVH9]<=ǩ";
      f1310[1] = "\\io\u0007LfWf~H1~Daw\u0001";
      f1310[2] = "@.mj\u001c2\\4o6\u0006&L7$'\u0002.J2~jϟ";
      f1310[3] = "2`@V27.zB\n(#>y\t\u001b,+8|SV̱";
      f1310[4] = boolean.class;
      f1311[4] = "java/lang/Boolean";
      f1310[5] = int.class;
      f1311[5] = "java/lang/Integer";
      f1310[6] = "\fn\u001au/V\u0010t\u0018)5B\u0000wS81J\u0006r\tu<S\n2\b2sp\u0000}\u0011>9f\u000fy\u0010>3W!}\u000e>";
      f1310[7] = double.class;
      f1311[7] = "java/lang/Double";
      f1310[8] = "xfw\f\u001f4fnmC}(as";
      f1310[9] = "j_\u0000\u000ep<vE\u0002Rj(fFICn `C\u0013\u000ec9l\u0003\u0015El-`_IGp(uE\u000eC,\u001f`N\u0013Op\u000ewL\u0017Hk*";
      f1310[10] = ")\u0010(\u000fs$5\n*Si0%\taBm8#\f;\u000f`!/L=Do5#\u0010aGn?2L\u0006gn?20*Oe44\u0007=";
      f1310[11] = "'\b\\OuL:\u001d\u0004m4A\"\u001b";
      f1310[12] = "0[:\u001b+\u0017,A8G1\u0003<BsV5\u000b:G)\u001b8\u00126\u0007(A0\u000e,\u00072W3\u0007<].\u001b\r\u0007']\u001b\\<\u000e;";
      f1310[13] = "ajub\b&}pw>\u00122ms</\u0016:kvfb\u001b#g6`)\u00147kj<\u0005(6`|w>\u001f!<\\";
      f1310[14] = float.class;
      f1311[14] = "java/lang/Float";
      f1310[15] = void.class;
      f1311[15] = "java/lang/Void";
      f1310[16] = "\f\n\u0006t>\u0011\u0010\u0010\u0004($\u0005\u0000\u0013O9 \r\u0006\u0016\u0015t-\u0014\nV\u0013?\"\u0000\u0006\nO\b)\n\u0007\u001d\u0013\u0019#\n\u0017\u001d\u0019.";
      f1310[17] = "7zdkp>7zs7|1-1s)|$*@$p%`";
      f1310[18] = "Q\u000fOmG9M\u0015M1]-]\u0016\u0006 Y%[\u0013\\mƹ";
      f1310[19] = "\t\u0005CXZ\u001a\t\u0005T\u0004V\u0015\u0013NT\u001aV\u0000\u0014?\u0004G\u0007";
      f1310[20] = "\u0011'qF*\u007f\u0011'f\u001a&p\u000blf\u0004&e\f\u001d4Xs'";
      f1310[21] = "%m\u0002\u00053\u00039w\u0000Y)\u0017)tKH.\u0004/1\u0016N5\u0002#q\u0002\u0005\u0012\u0013>k\fE&";
      f1310[22] = "\u0011\u001a\tlHJd:\u0002cY\u0005\u0019\"\u0011dPLq";
      f1310[23] = "\u007fh\u0002wvWcr\u0000+lCsqK:hKut\u0011weRy4\u0017<jFuhK\u0010VG~~\u0000+e@|\u007fW\u001d";
      f1310[24] = "\u0007E,tQ4.|0nSh4h m\u0018y3{&(E\u007f(}*hQ4\u000fl7r_t;2";
      f1310[25] = "&m\u001d\u0015\u0019F:w\u001fI\u0003R*tTɏ";
      f1310[26] = "\u0014Yp*)^\bCrv3J\u0018@9g7B\u001eEc*:[\u0012\u0005Ph4I\u001aGd";
      f1310[27] = "]\u0018.S\u00105(8%\\\u0001zU 6[\b3=";
      f1310[28] = "\t%bpz\u001e\u0015?`,`\n\u0005<+=d\u0002\u00039qpi\u001b\u000fyw;f\u000f\u0003%+9z\n\u0016?l=&\"!%d.`\u0002\u0005";
      f1310[29] = "*+_3;<\u0003\u0012C)9`\u0019\u0006S*rq\u001e\u0015Uo/w\u0005\u0013Y/;<\"\u0002D55|\u0016\\";
      f1310[30] = "\u0004&\"}0\u001f\u001a.82W\u001e\u000b55hq\u0018";
      f1310[31] = "u 6\u001f]b~/'P<lu$#\n";
      f1310[32] = "Y\">Ys,E8<\u0005i8U;w\u0014m0S>-Y`)_~,\u001e/\u001cZ54\u0012o-t1*\u0012";
      f1310[33] = "z'w\u0001VNf=u]LZv>>ń";
      f1310[34] = "[\u0005`\n\u00111G\u001fbV\u000b%W\u001c)Љ";
      f1310[35] = "\u00022$tm~\t=5;\u0000z\t!\u0001p2g\r=1p";
      f1310[36] = "h._FJxt4]\u001aPld7\u0016\u000bW\u007fbr^\rYyr.]FqKb=L\u001dJhD3V\u000eQjr.Y\nTh";
      f1310[37] = "\u00130b\u0002\u0007?\r8xMj%\u0015=q\u0000]#\u0016?";
      f1310[38] = "b\u000e\u001ekh[~\u0014\u001c7rOn\u0017W&u\\hR\u0010+nK\u007f\u001a\u0018&\u007f]#57$wKi";
      f1310[39] = "z{Sq\u001dB\u000f[X~\f\rrCKy\u0005D\u001a";
      f1310[40] = "e\u0017-\u0003:%y\r/_ 1i\u000edN'\"oK9H<$c\u000b-\u0003\r>\u007f\b\u0019H<$c\u000b-";
      f1310[41] = "\\\">hLO)\u00025g]\u0000T\u001a&`TI<";
      f1310[42] = "}+y\u0013_3a1{OE'q20^A/w7j\u0013L6{wkT\u00032z<sX\u0003\u000fF1{PH\u000bs7\u007fZH4";
      f1310[43] = "-{\br;z1a\n.!n!bA?%f'g\u001br(\u007f+'\u001a5g\u007f#g\n0g_#g\n0\u0001n,m\u00039;M#z\n";
      f1310[44] = "SA,\u0005%`O[.Y?t_XeH;|Y]?\u00056eU\u001d\u0019^$}YA\u0003J4~}c\u0002";
      f1310[45] = "\u0005b\"\u0016y\u0006\u0019x Jc\u0012\t{k[g\u001a\u000f~1\u0016j\u0003\u0003>0Q%6\u0006u(]e\u0007\"q+\\g\u0016\u0018R$Kn";
      f1310[46] = "\u00072\\z\u001aC\f=M5fZ\u0003=KyXJ";
      f1310[47] = char.class;
      f1311[47] = "java/lang/Character";
      f1310[48] = "\u000ej\"jD@\u0012p 6^T\u0002sk'Z\\\u0004v1jWE\b60-\u0018A\t}(!\u0018|5p )S";
      f1310[49] = "4I$Bc\u0018(S&\u001ey\f8Pmϒ";
      f1310[50] = "_Yc\u0011\"\u001cCCaM8\bS@*Ș";
      f1310[51] = "\fz:\u000b\u000e&@uhBl$]j]\u0018\u0005/]zY\u0012\u00007P\u0016;\u001e\u0001;\u000est\u0019Q.0";
      f1310[52] = "OY\u0011$W'WT^jfqSI+|\u0007u]z\u001dy&wXY\u0004u\u001c\u001eC\r\nu\u0006pTRX(f";
      f1310[53] = "\u000f\u0005$K#\u0012\u000f\u0012q\u0012\\μ6F`ElW\fFw\u00105";
      f1310[54] = "pB|\u0015\u0013\u0016pU)Ll|IS:A\u001c\u00101\u0002\"JV";
      f1310[55] = "TpX\u0005\u001e\u0016\b=\u000b\b\"\u001c\tqhIZ\u0012\b\u0000\b\u0002C\u0014\u00049\u000fU@\u001cd<\u000eYI\u001f];YZA\u007fX:USBF_mV[\"DUf\u000b\u0005ZB\boR8";
      f1310[56] = "Hc]N1A\br\u0001NLI\u0016i@V-D\n\u000f[AwBKmQV\"\u001bq4\rYs\u001f\t2PP*\"";
      f1310[57] = "M\u000b_{\u0011DM\u001c\n\"n\u0011\u0019\r: \u0007\u001a\u0019q\\&\u0003\u000eJ\u0014\u0013!S\u001bt";
      f1310[58] = "&\u0016\u001a\t\u0003g&\u0001OP|Ȑ\u001f\\\u001b_Bb%\\\u001a\b\u0010]";
      f1310[59] = "E\bi.Ib\u0019E:#ud\u0018\u0004Nn\u000fp\u0012\u0002]t\u000ej\t\u0019buu7O\u0019nsL0\u0018\u001af\u0013";
      f1310[60] = "\u001dY\u001c\u0014\n\u0001\u001dJE\u001f06@JK\u0012j\u0006QVN\u0000\\;A[^\u0004V\u000eH]\"P]\f\\\u000eG\u001fZ\\I0\u001f\u0000]\u0011\u0012UP\u0007\r\u0004,\rO\u0000@_IBHPUa\u0011]O\u001d\u000e\u0004^Z\u001f\b0\\A]RSU\u0013F\rGm\u000bPJ\u000f\u001f\u0015\r\rCV\"V\u0001\u0007\u0013\rZP\\\u000eJ0KVU\u0000G@\u0012\u0012N\u0011,\f\u0018\f[\u0001\u0015\u000bO\u000fSa\u0010\nC\u0006PX\u0017]@\u000e0\bNL[\fB\u001e@M\u001fm";
      f1310[61] = "\u0012=\u0007\u000f`tC%\fE\\Ŗyx\u000e\u0012,2\u001c7\tB9\f";
      f1310[62] = "%xY(\u0006Mt`Rb:ğN;\f>\u0005\b6=Q7\\5";
      f1310[63] = "L\u001c{^5\u000e\f\r'^H\f\u000e:~F.\u000euK+IwP\rMv@.m";
      f1310[64] = "o\u000b\u0018\u00122}n[\u001cVMizK,C1zvQ\u0018UM;qR\t^0|-V\u0012.";
      f1310[65] = "Akd1;y\u0001z81Fa\u0005m~<<{\u001eh\u0005||{\u0013g<{+x\u001b\u00079z'q\u0018>>-$yx>i!7g\u001b~x}7\u001a";
      f1310[66] = "F\u0016yzS\u0012\u0001J}a#\u0014\u001a\u0002q\u0004\u001fU\u001a\u001b|=\u0018\u0002\u0019\u0013\u001c";
      f1310[67] = "4:~y2\rsfzbB\u001bm1r}B\u0019k bf0\u000fe!&\u0007";
      f1310[68] = "vxY\u001fbU1$]\u0004\u0012S6tx\u0000iTK\"\u0006\u0000yHr%Q\u0003q(w$]\nr\u0011ps^\u0002\u0012\u0015-{B\u0011oRq\u007fYa";
      f1310[69] = "$\tLO2n0\u0014\u0003\u001eCǀBQUD=/?\u0016\t@&_";
      f1310[70] = "wo`\u0003PS+\"3\u000elU*cL_\u0003Z#~c^\u0010W+\u001f5R\rK:|uCQKG";
      f1310[71] = "\u007f#4\u0018DZ\u007f\"cJ{\u000f\"`\bi1`s&3M\u001bYtq0E{";
      f1310[72] = "k\u0012{\u001cG\u0007b\u0013t\u001b<\u0004\u007f\u001f\\B]\u0002i\u000en&G\u0019s\u0005qB\u0002\u0004#\u0003\u0015";
      f1310[73] = "\u0018\u0002\\\u0010^PDO\u000f\u001dbCE\t]QbPJ\u000eIL\u0010FD\u000f\r-";
      f1310[74] = "@N\u0001\u0000<k\\C\u0007>Ƣ\u001a\u0019]\u001dO*yYLAOW#LP\rC4c]\f\r>";
      f1310[75] = "!U\u0012\u0002\te5NR\tgժLK\u0010\u0013\u0001o(\u000e\rC\u0007\u000b";
      f1310[76] = "63\u0016DS\u001c62A\u0016lJov\u0013\u0017\u0016&63\u0016DS\u001c62A\u0016l";
      f1310[77] = "\u0019\u00063CH\u0015Y\u0017oC5\u0017['7JI\u0007 QcT\nKXW>]Sv";
      f1310[78] = "LR\u001fH/ \u0010\u001fLE\u0013&\u0011^?\u0014h1\u0018K\u0002)~9\u0000\"J\u0019r8\u0001A\n\b.8|";
      f1310[79] = " \u0011<<t3q\t7vHЧKRi*wv3T4#.K\"\u000b$5)94\u0005%qH";
      f1310[80] = "ZaV|&rR6AlCwG{a|\"}C}HM$|M}96|~\u00148\u00036})F\u0007";
      f1310[81] = "?=b2xN0m&uGӨM<f)7\u00035m~\"}?$5b4&M2;cpG";
      f1310[82] = "}\u0001^\u0012c=,\u0019UX_ӂ\u0016B\u000b\u0004`xnDV\r9E";
      f1310[83] = "\f\u0014xz{!\u0001\u0011|{\u0018Тj\n)g$bS\u0012$(jS";
      f1310[84] = "~k\u0018=Z\n~|Md%YGqMs\u001e\ry)[jD0'zX6\u0018\u000e\u007flAl%";
      f1310[85] = "0\u001d+P{\b2X+_C\t:'!T\"\u0006mU/A&\u0012";
      f1310[86] = "&~\u0012HfFz3AEZ@{r>\u00145Oro\u0011\u0015&bpb&\u0012!/*4\u001f\u001e:\u0016-c\u001c\u0016Z";
      f1310[87] = "X)m^\u001a[\u001f'*OeX\n;M]\u001fV\u0001(I@\tK\u0007G/M\u0004F\u001a$o\\XFgz{L\u0015\t\u00025|\u001c\u00007";
      f1310[88] = "I\u0005sO\u001cQI\u0016*D&]\u0002\u00052lKZ\u0004\u0005+YB\\xQ [V\u000f\u001d\u001e'\u000bC1E\u0001 F\u0018T\n\u0006pS&\f\u0015\u0001=\bCC\u0012Q(6\u001b\\\u0015\u001csST[E\tM\n\u001cP\u0013\ft\rKS\u001bl$TZH\u0019\u001e2Z[\fx";
      f1310[89] = "\u00009*\u0010z\u001e\u0000.\u007fI\u0005Ш9sdL8\u0018P/)\u001f5";
      f1310[90] = "-\u000f\n\u00059^gW\u0016WEˈ\u0017Q\u001c\u000f4_t\u0011\rS4\"";
      f1310[91] = "hU<:\u0012I|N|1|͘\u0005K>+\u001aCa\u000e#{\u001c'lR03\u001dUz\\1w|";
      f1310[92] = "\t\u0000\u001fVGQ\u0015\u0012KK>M\u0004\u0014d^NQmT\u0013U\u0001\u0010\u0015RN\\X-";
      f1310[93] = "ZY\f\u000b\u0014nZNYRkӆc\u0013\r]UkY\u0013\f\n\u0007";
      f1310[94] = "Z8L\u000396\u001a)\u0010\u0003D)\u0004\u0010J\r)/(=V\u001fDl\u000f5\\\u000f',\u001ei\\r";
      f1310[95] = "\u0016\t\u0000\u0012\u0019\u001d\u0016\u001aY\u0019#\u0011]\tA$Y\u0014_\u0000_\u0000y\u0010L\u001cW\rL\u0019J`\\\u0014_\u001eN_G\u0019H\u0017']S\u0006SCB\u0012TVF}\u001a\rS\u001b\u001d\u0018U\n\u0003\u000e#@J\rNUF\u000fM][k\u001e\u0010J\u0010\u0000\u000eQ\u0017\u001a\u0005>\u0002A\u0001^\u0001L\u0014O\u0000\u001a`";
      f1310[96] = "\u0017\u0002xDnR\u0017\u0015-\u001d\u0011д.E \u0011o\u0018S\u0002|\u0015t";
      f1310[97] = "\n\u001b}B\u0017/\u0016\t)_n5\u0003\u0004<'\n4\r\u0010\"^S6\u0004\u000e@";
      f1310[98] = "L`'\u000311\u00068;QMƗvy-\u00030$\u0012;<\n(M";
      f1310[99] = "yS/\u000f.'yDzVQǠ@\u0017zToo:SlN7";
      f1310[100] = "\u0004\u0002)^\u0012T\u0004\u0015|\u0007m\u0001P\u0004W\u0003\f\u0001]\u0004\u0017S\u0000\u0003MFr\u001c\u0007SXx";
      f1310[101] = "x\tE\rM7?UA\u0016=#)\u0003 \u0017Z)!\rYNX ?o\u001bB[ux\u0017\u001d\u001fR,E";
      f1310[102] = "I:\u000eN\nl\u000e4I_ul\f=\nj\tz\u00172\u001a1Ll\u0017%\bR\f}K%u\f\u0018m\u0006j\u0010C\u001f=\u0013TH\\\u0018pH1\u0007[HevhOP\u001e`Oo\u0018S\u0016\u0000K9\u0018AKe\u0004>HTu";
      f1310[103] = "*u\u000b[\u0007**b^\u0002xJ\u0013fW\u0017\u0001qapY\u0016E\u0010";
      f1310[104] = "p>.{7_};*zTԷ\u00167vh:\\'#k'k-";
      f1310[105] = "u\t2K=\\x\f6J^ΐ\u0013\u0000`\u001a2Ma\re\u001e3";
      f1310[106] = "\u0015qwJ%5U`+JX-QwmG\"7Jr\u0016\u0007b7G}/\u000054O\u001d/W9'Q~oFe',";
      f1310[107] = "\u0015>*&)\u0011R0m7V\u0012G,\u001f>0\u0001j=066\u0001*m<4&CO\";d3}";
      f1310[108] = "$!|\u0007\t\u0001$2%\f36y2+\u0001i\f~4+\u0018\\\u0005xH\u007f\u0013^\u0011+-0\u0014\u000e\u0004\u0015u/\u0013C_p:(CVa(%/\u000e\r\u0004g\"\u007f\u001b3\\x%2@V\u0013\u007fu'~\bPsw\u007f\u0006\u000e\rz.BE\u0002\u0007*u:C_\u000esH+EV\u0000~8r\u0001M\u0011\u0015tx\u001fX\u0001,s/\u001cPa)r#\u0015SX.% \u001d3\bw4;\u001fA\u001ey5\u007f~";
      f1310[109] = "EyKV#d\u0007hBNJzFo B(|BhRT&}\u0006\t";
      f1310[110] = "{\\&8g\u000f'\u0011u5[\t&P\nd4\u0006/M%e'=7E0y\u0003\u00010,v?:\r+\u0015qh9\u0005K";
      f1310[111] = "&\u000f0T\u007f\u0019'\u000b`WA\t.\u001dRO-\u001a#a0C,\u0016}\u0004\u007fD|\u0003C";
      f1310[112] = "zw\u001cmr1nl\\f\u001c0zn%yx\u0004jx7p`#vt\u0003f\u001cbqw\u0012ma%-s\t\u001d";
      f1310[113] = "Pu7\u0016#(\u0017{p\u0007\\(\u0015r32 >\u000e}#ie(\u000ej1\n%9RjLT1)\u001f%)\u001b6y\n\u001bq\u000414Q~>\u0003a!o'v\b7$V !\u000b?DT**Va<Rw#\u000f\\y\u0002v<W96\u0005&)i";
      f1310[114] = "\u001eC\u0014\u001dSwB\u000eG\u0010ouNZ\u0002|\u001efC_x_\u001d}RT\u0000_SxK3C\u0011\t!\u0013KEL\u0000x.";
      f1310[115] = "\u0017}E\u001bM\u0013\u0003k\u0016\u0002&\u0015\u0007p \u001aK\u001f\u0007I\u0015\u001cO\u0015\u0007v|\u0006G\u0010\u0018rF\bCG\u000f\f";
      f1310[116] = "h\nq]q#h\u001d$\u0004\u000eǧQK~\u000b1$)M#\u0002h";
      f1310[117] = "?&sb\u0018L)?6dtP26g\u0003\u001fB(.3:\u0018E;6\n";
      f1310[118] = "\u0005MR\u0018Hp\u0005Z\u0007A7ԓ<\u000bVI\\*\u0005\f\u0001JT";
      f1310[119] = ".r$A2.\u007fj/\u000b\u000e9(v\u001113;(z~T|<xo@";
      f1310[120] = "\u0014\u0014\u0011W\u0001QWL\u001aV{P\u0002Sl\u0011\u0007^\bIPi@\u000e\t\u0010\u0016\u0011FS\u0000I+\u0012\t^\tKOW\u0014\u000e\u000f/";
      f1310[121] = "]Tl%RhSP;2,=LIM3M9Bz{6l;GYb:VR\\\rl:L<KR>g,";
      f1310[122] = "\u0006sK@&X\u0006d\u001e\u0019YѤ?c\u001e\t8\u000e[u\u0007L>b\u0002d\u0018\u0000g\u0007McH\u0015Y_Rd\u0005N<\u0010U4\u0010pd\u000fRyK\u0015+\b\u0002luM4\u000fO7\u0010\u00023_Z\t\u001c\u0012%\u001b^{\n\u001c$_?";
      f1310[123] = "\u0010e9aE \u001ep=uy7\u0011c8l\u0015\u0005F%f;BR\u0011v>j\u0012<\u0000f!vy";
      f1310[124] = "\u0000k4jjT\u0001odiTD\byI}5D\u0005y\t-9F\u0015;lb>\u0016\u0000\u0005";
      f1310[125] = "\n~xd\f\u0007\ni-=sR^x\u00195\u001fAS\u0004{9\u001eM\ra4>NX3";
      f1310[126] = "3Qi>l(dF?$\u0016~1H\u001f\"pm\u0006Y7){k1NQzxj#K==v-24";
      f1310[127] = "\u0015gGVT\u001cR;CM$\u0000TlXAX\u0006R\u0001FG\u0019\u0004Q}ZUM\u0019(";
      f1310[128] = "*80J\\/*/e\u0013#ɻ\u0013!0\u000bGh)|d\u0017\\\u0015z r\u0003Bgl.sG#";
      f1310[129] = "\u0003@0|WG\u0003We%(·:Y0=L\u0000\u0000\u0004d!W}";
      f1310[130] = "(P~\u0019u#(G+@\nЋ\u0011\u0010'SaemZ\u007fO3";
      f1310[131] = "*/\u00032X\rms\u0007)(\nz,\u00012E9s-f4R\nly\t>QO,I]}NO*1[ G\u0016\u0017";
      f1310[132] = "LD]\u00163\u0016\u000b\u0018Y\rC\n\no]\u0010?\u001aq\u0019\t\u000e|V\t\u001fT\u0007%k";
      f1310[133] = "|B_0Xz3\u001dQvdyo\\o&\rro ]v\u0001wiP\u00042\u001af\u0002";
      f1310[134] = "\u0005?\u0005p\u0010?T'\u000e:,(\u0003;1\u0000\u0011*\u00037_e^-S\"a";
      f1310[135] = "x72_d\u001c/ dE\u001eJz.PIxIz(g^\u001e\u0014~ls\u001e~\u0014m5x$";
      f1310[136] = "\u0017'3g.j\u000f*|)\u001f<\u000b7\t?~8\u0005\u0004?:C3\u000b./[o5\t1'1gb\u001e!B";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f1310[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1311[var4]);
            f1310[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m196(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m197(Class var0, String var1, Class var2) {
      Field var3 = m196(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m197(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m198(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f1310[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1311[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f1310[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1310[var4] = var13;
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
               var12 = m195(2202079916316231L, 0L);
            }
         }
      }
   }

   public static Method m199(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m200(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m199(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m200(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m201(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f1310[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1311[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m195(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m199(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f1310[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(2202079916316231L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m200(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f1310[var4] = var19;
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
               var23 = m195(2202079916316231L, 0L);
            }
         }
      }
   }

   public static MethodHandle m202(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 238 && var8 != 'j' && var8 != 'S' && var8 != 'g') {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 199) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'q') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 238) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'j') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'S') {
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

   public static Object m203(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m202(var0, var1, var2, var3, var6, var9);
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer043.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/α" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
