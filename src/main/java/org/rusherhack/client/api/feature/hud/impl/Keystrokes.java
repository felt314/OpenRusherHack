package org.rusherhack.client.api.feature.hud.impl;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.option.KeyBinding;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.hud.ResizeableHudElement;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Pair;

public class Keystrokes extends ResizeableHudElement {
   public BooleanSetting mousebuttons;
   public BooleanSetting spacebutton;
   public ColorSetting f5534;
   public static long f5535 = Class066.m4320(4360466676254776954L, 4723294797133897707L, MethodHandles.lookup().lookupClass()).m4325(128121823154933L);
   public static String[] f5536;
   public static String[] f5537;
   public static long[] f5539;
   public static Integer[] f5540;
   public static Map f5541;
   public static Object[] f5542 = new Object[65];
   public static String[] f5543 = new String[65];

   public Keystrokes() {
      super("Keystrokes");
      this.f5534 = new KeystrokesColor(this, "Color", new Color(0, 100, 255))
         .setVisibility(() -> {
            if (!RusherHackAPI.getHudManager().isThemeColorSynced()) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         })
         .setAlphaAllowed(false);
      boolean var10009 = true;
      this.mousebuttons = new BooleanSetting("MouseButtons", true);
      boolean var10008 = true;
      this.spacebutton = new BooleanSetting("SpaceButton", true);
      Setting[] var10001 = new Setting[]{this.f5534, null, null};
      boolean var10005 = true;
      var10001[1] = this.mousebuttons;
      var10001[2] = this.spacebutton;
      this.registerSettings(var10001);
   }

   @Override
   public void renderContent(RenderContext var1, double var2, double var4) {
        
    }

   @Override
   public double getHeight() {
      return 129.0;
   }

   @Override
   public double getWidth() {
      return 129.0;
   }

   public int m11188(KeyBinding var1) {
      return var1.isPressed() ? 2097152000 : 838860800;
   }

   static {
    }
   public static String m221(byte[] var0) {
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
   public static int m272(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5543[var4] != null) {
         return var4;
      } else {
         Object var5 = f5542[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 22;
               case 1 -> 4;
               case 2 -> 26;
               case 3 -> 38;
               case 4 -> 21;
               case 5 -> 53;
               case 6 -> 61;
               case 7 -> 46;
               case 8 -> 7;
               case 9 -> 11;
               case 10 -> 31;
               case 11 -> 56;
               case 12 -> 34;
               case 13 -> 15;
               case 14 -> 36;
               case 15 -> 44;
               case 16 -> 20;
               case 17 -> 3;
               case 18 -> 10;
               case 19 -> 49;
               case 20 -> 12;
               case 21 -> 54;
               case 22 -> 5;
               case 23 -> 23;
               case 24 -> 47;
               case 25 -> 9;
               case 26 -> 6;
               case 27 -> 59;
               case 28 -> 57;
               case 29 -> 30;
               case 30 -> 13;
               case 31 -> 8;
               case 32 -> 1;
               case 33 -> 18;
               case 34 -> 52;
               case 35 -> 60;
               case 36 -> 29;
               case 37 -> 0;
               case 38 -> 37;
               case 39 -> 28;
               case 40 -> 39;
               case 41 -> 33;
               case 42 -> 35;
               case 43 -> 40;
               case 44 -> 17;
               case 45 -> 2;
               case 46 -> 48;
               case 47 -> 62;
               case 48 -> 45;
               case 49 -> 42;
               case 50 -> 24;
               case 51 -> 16;
               case 52 -> 55;
               case 53 -> 51;
               case 54 -> 25;
               case 55 -> 41;
               case 56 -> 58;
               case 57 -> 27;
               case 58 -> 63;
               case 59 -> 43;
               case 60 -> 19;
               case 61 -> 32;
               case 62 -> 14;
               default -> 50;
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

            f5543[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m273() {
      f5542[0] = "Q.zHk\rZ!k\u0007\u0007\u000eT#iH+";
      f5542[1] = boolean.class;
      f5543[1] = "java/lang/Boolean";
      f5542[2] = ">9\u0000M`\u001e\"#\u0002\u0011z\n2 I\u0000~\u00024%\u0013Ms\u001b8e\u0014\u0006f\u001f8%\u0000MQ\u0004=$\u00150w\u001f%\"\t\u0004";
      f5542[3] = "\u0017\ruQN\n\u000b\u0017w\rT\u001e\u001b\u0014<˟";
      f5542[4] = "N/\u0014\u000f_<R5\u0016SE(B6]BB;Ds\u0000DY=H3\u0014\u000fo&N1\u0016@C\u001aD)\u0007HC.";
      f5542[5] = "\"\u001c~[Km>\u0006|\u0007Qy.\u00057\u0016Vj(@\u007f\u0010Xl8\u001c|[p^(\u000fm\u0000K}\u000e\u0001w\u0013P\u007f8\u001cx\u0017U}";
      f5542[6] = "H!X=.Na\u0018D',\u0012{\fT$g\u0003|\u001fRa:\u0005g\u0019^!.N@\bC; \u000etV";
      f5542[7] = void.class;
      f5543[7] = "java/lang/Void";
      f5542[8] = "}\u0018Z@\\ya\u0002X\u001cFmq\u0001\u0013\rA~wDH\u001aG`aDm\u000fG~";
      f5542[9] = "\u0003e\u0011\u001e\u000fO\bj\u0000QrW\u001bm\t\u0018";
      f5542[10] = "EV \u0001#\u0019[^:Nk\u0019AT\"\tb\u0002\u0001u9\u000fa\tNY\u0005\u0015}\u001cC^3\u0012";
      f5542[11] = "a/%()j}5't3~m6lѯ";
      f5542[12] = "wZ0\u0013\bek@2O\u0012q{CyȻ";
      f5542[13] = int.class;
      f5543[13] = "java/lang/Integer";
      f5542[14] = "e^*t\u0013\u0019yD((\t\riGcȮ";
      f5542[15] = "e`j'n,e`}{b#\u007f+}eb6xZ-97";
      f5542[16] = "7\u0001\u0013q&\u001d7\u0001\u0004-*\u0012-J\u00043*\u0007*;Tn~";
      f5542[17] = "_w)D,MCm+\u00186YSn`\t2QUk:D?HY+<\u000f0\\Uw`\f1VD+\u0007,1VDW+\u0004:]B`<";
      f5542[18] = double.class;
      f5543[18] = "java/lang/Double";
      f5542[19] = "!|Bm\u000e?=f@1\u0014+-e\u000b \u00138+ V&\b>'`Bm//:zL-\u001b";
      f5542[20] = "#1\u0007\u001eL\u001e(>\u0016Q-\u0010#5\u0012\u000b";
      f5542[21] = "\u000b\u0003sLB\u0002\u000b\u0003d\u0010N\r\u0011Hd\u000eN\u0018\u001695W\u0019Z";
      f5542[22] = "4\u0016@\u00064\u0017(\fBZ.\u00038\u000f\tK*\u000b>\nS\u0006'\u00122JAM'\u0016.\u0016B\u0006.\u0017?Jo]\"'7\u0001JM(\u0016";
      f5542[23] = "E\u001czH\u001f\u0019E\u001cm\u0014\u0013\u0016_Wm\n\u0013\u0003X&=WB";
      f5542[24] = "mH%*\u00148qR'v\u000e,aQlg\n$gT6*\u0007=k\u0014\u0005h\t/cV1";
      f5542[25] = "l\u0005\u0013HN<p\u001f\u0011\u0014T(`\u001cZ\u0005P f\u0019\u0000H]9jY\u0006\u0003R-f\u0005Z/n,m\u0013\u0011\u0014Y;13";
      f5542[26] = "@\u0007n\tQ\u001f\\\u001dlUK\u000bL\u001e'DO\u0003J\u001b}\tB\u001aF[{BM\u000eJ\u0007'nq\u000fA\u0011lUB\bC\u0010;c";
      f5542[27] = "n\u007fjnj~reh2pjbf##tbdcyny{h#_5kcd\u007fE!{`@]D";
      f5542[28] = "'!2f\u00183;;0:\u0002'+8{+\u0006/-=!f\u000b6!}&1\u00192->{\u0001\"3,\u001e4&\u000b!-!";
      f5542[29] = "\u0014FO\u0011:\u0000CX\u001d\u0015U\u0007\u001fJ@\u0003\u0002PN\u0017\u001ao<\u000bCZKV5XA\u0016";
      f5542[30] = "in2#J\u0006ez\u000b9^[f}L)7\u0006pt0-U^% sGEA\"tv~IU\u001b";
      f5542[31] = "O#v\nZmDez\u000481^qu5D'E~en\u0006-\u0015&fS\u0005m^f\n\u0005CfOjj\u0017Y$Y\u0018a\u0015\u00036Vxs\u000fA $)a\u0013\u0002:Kcg\u0000V]Oc1\u0005J=]ys\u00138";
      f5542[32] = "~{\u0006A*\u0011p{GJ\u0017ՀN-SQ-G!gUBy ";
      f5542[33] = "^\u001c\u001cW\u0000\u0003\t\u0002NSo\u0004U\u0010\u0013E8S\u0004MN)\u0006\b\t\u0000\u0018\u0010\u000f[\u000bL";
      f5542[34] = "z)e.pGqoi \u0012\u0018|nW-t\u000bQ\u007fx%r\u000b\u0011ybqy\u0005qkx3ow";
      f5542[35] = "<2yP6q~4r\u0006Y$\u0006z~K716,=B9M75pU%}avy[Y";
      f5542[36] = "*C\u0004h|\u0004hE\u000f>\u0013ŏ\u0010\u0003\u001d9oU)\u0003\u0011nu";
      f5542[37] = "r5\b>,f03\u0003hCаHwO>%e!'\u0010l,";
      f5542[38] = "\u0017a<\u0018XNO;d\u0004'DF44\u000e[SQ\u00008\t[_M4.u\u001b\u0003T)l\u0015K_P;UIVER`.E\u001aR\u0010[";
      f5542[39] = "%BSG\u000b:(O\u0016\\no\u0018\u000eZ\u0017P/%\r\u001a\\\u0010C&@\u001b\u0018\u0002~%\u0000PXn";
      f5542[40] = "\u0006hP\u0004\u001d\tDn[RrĈ<xKR\u000fZ\u0005q\u0018PC5\rzTU\u0015ZG|G\u0001r";
      f5542[41] = " %Qu\b\u000ew;\u0003qg\t+)^g0^{|\u0001\u000b\u000e\u0005w9U2\u0007Vuu";
      f5542[42] = "\"J[)\f|`LP\u007fc/uO}#\u000f<x3I9X+jS[#\u001a=\u0018";
      f5542[43] = "\u0015[k+BR\u001d\u0003j9.]\fcp:KQ<Xt0Tg\u0006Y{:B<NTtlD^\u0016\u0001 /.";
      f5542[44] = "%.F\u0017iywk\u0013\f\u0002Ǉ\u001ao\tV<s'lI\u001d|\u001f$!HYn\"'a\u0003\u0019\u0002";
      f5542[45] = "$T9@vc9H:[\t~%S\u0019Mml%/*Iv.#@vTkvH";
      f5542[46] = "\"\tX$RX+ZZh=\u0004&\u0017\u0005>Q6rU]a\u0002a&\u0019ZbO^4\u0004^i=";
      f5542[47] = "l\u00127K\b@l\u001e`Qe\u00168\u000eS^\u0001\u00048(B}eH>\u000f7P\n\u00028\u001cc7";
      f5542[48] = "c7\n\u0019/44)X\u001d@3h;\u0005\u000b\u0017d9jPg)?4+\u000e^ l6g";
      f5542[49] = "\u001f&q\u0019hF\u001f*&\u0003\u0005\u0004K:\u0002\u0001}\u001fO\u000f/\u0001b\u0000K*K\\n\u001b\u001d,)\u0004;O^Fr\u0005?\u0003K\u007fr\th\u0019&";
      f5542[50] = "\u0001|\u0013\n\u000f*^8\u001cUo \u000e8,\u0010\u0003\n\n\"\u0005\u0002\u00025c&\b\u0016\u0013#\r.P\u0017\u0001O";
      f5542[51] = "n&\u0019fm@}$P3\rAm>f0kRZ/N;`Tm8(<6Rd \u00187p^jB";
      f5542[52] = "x@\u007f *0~Wca\u00138vGv7Do)\u001b*[y7|T}2.).P";
      f5542[53] = "sJMw+(\u007f^ty1veY\u001du\bxeI\u0019\u0013oze\u000f\u001eq7/1Lt";
      f5542[54] = "\n! mwd]?ri\u0018c\u0001-/\u007fO4Qyp\u0013qo]=$*x<_q";
      f5542[55] = "2\u0007\u001brv# \u001a\u001fy\u0004s2\t\u007f5~}9\u001a$wt-a\u0019\u0019t4f!u";
      f5542[56] = "\u00102#W\u001a}\u000e0e\u000bhw\u001b\rpY\u0005iIkvN\u0019(";
      f5542[57] = "a\u007fo$DP#ydr+в[=($MS2mwvD";
      f5542[58] = "k\u0015>+j7bF<g\u0005ko\u000bc1iY;K8j\u00057i\u00138<go<G{V";
      f5542[59] = "9'\u0007\ra\u00142a\u000b\u0003\u0003K?` \u0015yE4s$\boX2\u001cE\u00192\u001a>!FYyZRw\u0000RhV2e\u001a\u0010~$";
      f5542[60] = ".A:C]Z.MmY0\u0018z]^^K\u0002}@d^L\u0012\u0017\u001eaVB\u0019z\u0010oOYc.A:C]Z.MmY0";
      f5542[61] = "F\f/k6t\u001c_j ]g\\\u0006k\b0`Z\u0006r=9f&\u0004oi6yF\u0016u+ \u000bM\u0014/9/k_\u000em/]`]T\u007f =rG\u0016iR6p\u001d\u0004f2$j_\u0012\u0014c6v\u001c\b{)0eHo(#&r\u001d\u0014$o10&";
      f5542[62] = "x!:B\u0016P/?hFyWs-5P.\u0000\"qm<\u0010[/=>\u0005\u0019\b-q";
      f5542[63] = "B\u0001\u0002JT9\u0015\u001fPN;>I\r\rXli\u0019XU4R2\u0015\u001d\u0006\r[a\u0017Q";
      f5542[64] = "J4#in~J<'rTpF.\u0018~2sF(/iT\u007fHi{x+%\u001b,0\u0013";
   }

   public static Class m274(long var0, long var2) {
      Class var5 = null;
      int var4 = m272(var0, var2);
      Object var6 = f5542[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5543[var4]);
            f5542[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m275(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m276(Class var0, String var1, Class var2) {
      Field var3 = m275(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m276(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m277(long var0, long var2) {
      int var4 = m272(var0, var2);
      Object var5 = f5542[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5543[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m274(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m274(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m275(var12, var10, var11);
            if (var13 != null) {
               f5542[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m276(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5542[var4] = var13;
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
               var12 = m274(1463858575720980L, 0L);
            }
         }
      }
   }

   public static Method m278(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m279(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m278(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m279(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m280(long var0, long var2) {
      int var4 = m272(var0, var2);
      Object var5 = f5542[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5543[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m274(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m274(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m278(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f5542[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m274(1463858575720980L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m279(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f5542[var4] = var19;
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
               var23 = m274(1463858575720980L, 0L);
            }
         }
      }
   }

   public static MethodHandle m281(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 195 && var8 != 'G' && var8 != 'r' && var8 != 202) {
            var11 = m280(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'w') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 225) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m277(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 195) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'G') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'r') {
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

   public static Object m282(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m281(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m671(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Keystrokes.class, "m282", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʠ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
