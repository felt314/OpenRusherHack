package org.rusherhack.client;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.graphic.IGraphic;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.client.api.ui.window.WindowHandlerBase;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.module.impl.client.Windows;
public class Class039 extends Util040 {
   public static IGraphic f1276;
   public static IGraphic f1277;
   public static long f1278 = Class066.m4320(520770009340072645L, -4818172325723695340L, MethodHandles.lookup().lookupClass()).m4325(188217188024232L);
   public static String[] f1279;
   public static String[] f1280;
   public static long[] f1282;
   public static Integer[] f1283;
   public static Map f1284;
   public static Object[] f1285 = new Object[61];
   public static String[] f1286 = new String[61];

   public Class039() {
        super(Text.of("Windows"));
      Class039 var3 = this;


      try {
         var3.m3052(
            f1276 = new VectorGraphic(
               "rusherhack/graphics/screens/windows.svg", 128, 128
            )
         );
         f1277 = new VectorGraphic(
            "rusherhack/graphics/windows/default_icon.svg", 32, 32
         );
      } catch (Throwable var4) {
         boolean var10004 = true;
         Class170.f3346.error("Failed to load window icons: ", var4);
      }
   }

   @Override
   public boolean shouldPause() {
      return false;
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public boolean mouseReleased(double var1, double var3, int var5) {
      super.mouseReleased(var1, var3, var5);
      Class170.f3364.m7115().getWindowHandler().mouseReleased(var1, var3, var5);
      return true;
   }

   public void mouseMoved(double var1, double var3) {
      super.mouseMoved(var1, var3);
      Class170.f3364.m7115().getWindowHandler().mouseMoved(var1, var3);
   }

   public boolean charTyped(char var1, int var2) {
      Class170.f3364.m7115().getWindowHandler().charTyped(var1);
      return super.charTyped(var1, var2);
   }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      int[] var10000 = Util040.m3055();
      boolean var12 = super.mouseScrolled(var1, var3, var5, var7);
      int[] var11 = var10000;
      boolean var13 = Class170.f3364.m7115().getWindowHandler().mouseScrolled(var1, var3, var7);
      if (var11 == null) {
         if (var13) {
            boolean var10002 = true;
            return true;
         }

         var13 = var12;
      }

      return var13;
   }

   @Override
   public void init() {
      super.init();
   }

   @Override
   public void render(DrawContext var1, int var2, int var3, float var4) {
        
    }

   @Override
   public void tick() {
      Class170.f3364.m7115().getWindowHandler().tick();
      super.tick();
   }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      return super.mouseDragged(var1, var3, var5, var6, var8);
   }

   static {
    }

   @Override
   public void close() {
      int[] var10000 = Util040.m3055();
      super.close();
      int[] var3 = var10000;
      Iterator var5;
      Iterator var6 = var5 = Class170.f3364.m7121().getVisibleWindows().iterator();

      while (true) {
         if (!var6.hasNext()) {
            this.mouseReleased(0.0, 0.0, 0);
            break;
         }

         ((Window)var5.next()).getRootView().unfocus();
         if (var3 != null) {
            break;
         }

         var6 = var5;
      }
   }

   public boolean keyPressed(int var1, int var2, int var3) {
      int[] var6 = Util040.m3055();
      boolean var9 = Class170.f3364.m7115().getWindowHandler().keyTyped(var1, var2, var3);
      if (var6 == null) {
         if (var9) {
            boolean var10002 = true;
            return true;
         }

         var9 = super.keyPressed(var1, var2, var3);
      }

      return var9;
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
   public static void m157() {
      f1285[0] = "4$[c<%(>Y?&18=\u0012.\"9>8Hc/ 2xI$`\u001573Q( $\u00137R)\"5)\u0014]>+";
      f1285[1] = "5_\u0010\u000bSQ)E\u0012WIE9FYFMM?C\u0003\u000b@T3\u0003\u0005@O@?_YwDJ>H\u0005fNJ.H\u000fQ";
      f1285[2] = double.class;
      f1286[2] = "java/lang/Double";
      f1285[3] = void.class;
      f1286[3] = "java/lang/Void";
      f1285[4] = "i;[\b\u001dVu!YT\u0007Be\"\u0012E\u0000QcgOC\u001bWo'[\b<Fr=UH\b";
      f1285[5] = "BSe>iq7sn1x>Jk}6qw\"";
      f1285[6] = "G2\u001c\u000fk\u0007[(\u001eSq\u0013K+UŊ";
      f1285[7] = "K\u001b\u000f\u0014\u001f_W\u0001\rH\u0005KG\u0002FY\u0001CA\u0007\u001c\u0014ϵ";
      f1285[8] = "r\u001f";
      f1285[9] = "CF\\BDk_\\^\u001e^\u007fO_\u0015ϒ";
      f1285[10] = "\u007fiTJ\u001e\u001bcsV\u0016\u0004\u000fsp\u001d\u0007\u0000\u0007uuGJ\r\u001ey5F\rB\u0019yuW\u000b\u001b@Gr]\u0000\u0003\u0019Xz]\u0000\u0000\u000bbYR\u0017\t";
      f1285[11] = "\u0011\u0010Q>Y\u000f\r\nSbC\u001b\u001d\t\u0018sG\u0013\u001b\fB>Τ";
      f1285[12] = "\u0001#~\u0011L\f\u001d9|MV\u0018\r:7ɋ";
      f1285[13] = "\u007f\t";
      f1285[14] = "r\\v:l\u001enFtfv\n~E?wq\u0019x\u0000}{y\ft@v:R\u0004zItf";
      f1285[15] = "GA\u0002/\u0018.[[\u0000s\u0002:KXKb\u00062M]\u0011/\u000b+A\u001d\u0017d\u0004?MAKf\u0018:X[\fbD\u0012oA\u0004q\u00022K";
      f1285[16] = "I[eVBCUAg\nXWEB,\u001b_DC\u0007n\u0017WQOGeVyzIN";
      f1285[17] = "<N\u0000qA\u000e7A\u0011><\u0016$F\u0018w";
      f1285[18] = "S%\u0000`\u000f]&\u0005\u000bo\u001e\u0012G\u000b\u0000d\u001aH3";
      f1285[19] = "\b\u0013nn{J\u0014\tl2a^\u0004\n'#fM\u0002Oj/dR\u0006\u000fmnyM\b\u0002l3zV\t\u0006'\u0003fR\n\u0000g$YM\b\u0002l3zV\t\u0006Z)gT";
      f1285[20] = "\u0016t\u000e ER\nn\f|_F\u001amGm[N\u001ch\u001d VW\u0010(\u000fkVS\ft\f TH\u0014k\b`S\t\u0018t\u000e rI\u001an\b`Cu\u001c`\f|RI\u001ac";
      f1285[21] = boolean.class;
      f1286[21] = "java/lang/Boolean";
      f1285[22] = "(U3\u000e_\u00106])A8\u0011'F$\u001b\u001e\u0017";
      f1285[23] = "aO\u0013\u001bFqj@\u0002T'\u007faK\u0006\u000e";
      f1285[24] = "\u001aI!\f\u0016=\u0006S#P\f)\u0016PhA\b!\u0010U2\f\u00058\u001c\u00153KJ?\u001cU\"M\u0013f\u0003R#UJ\u001f\u001cU\"M\u0013\u001e\u001c^1";
      f1285[25] = "D\u001b<*ESX\u0001>v_GH\u0002ug[ON\u0007/*VVBG=aVR^\u001b>*@OE\r4s\u0019qB\u0007?k@";
      f1285[26] = "(!\f$B\u00166)\u0016k \n14";
      f1285[27] = "\u001a/e\u0004N;\u00065gXT/\u00166,б";
      f1285[28] = int.class;
      f1286[28] = "java/lang/Integer";
      f1285[29] = char.class;
      f1286[29] = "java/lang/Character";
      f1285[30] = "C\u0002\u0018\u0016\nl\u0010CF\u001fxp@\f\ng\u0017{\u0010B\u001f\u0018\u001bg\u0014\u001ev";
      f1285[31] = "%\u001a\u0003\u000b\u0002G)U\\\feT\u0019\u001a\u0018\u001a\u0018\u000etK\u001b\u0001\u0007";
      f1285[32] = "+KWP\u0004e,OOj\u0012r#J^\u0010ha.FI\u0017\u0007e=T3PP|xJY\b\u0003/(&\tR\u000b\")LQ\u0001XrE\u001cJ\n\u0018#\u007f^_\u0000\u0015\u001f";
      f1285[33] = "\u001bZK2Cm\u0017\u0015\u00145$Ϋ'W\u0019?Jr_[V`M";
      f1285[34] = ":-?J\tJf<1\ny\u0014i.\u0003P\u001f\u0017c-\u001cX\u001f\u0017`?&1F\u001b=2=\u000e\u000bK>,\\";
      f1285[35] = "PhDMI\\Wl\\wYGUf M\\FN9\u001a\u000fILC\u0005";
      f1285[36] = "}t@\u0000\u007f t-E\u0003NwM-\u0004\u0011*y}xG@/\u001e}f\u0015\u001f).(%D\u001aN";
      f1285[37] = "I205R:E}o25Ɠub#>V.Hn+<\u000bB";
      f1285[38] = "\t\u0017dbm8ZTjf\u0016+dE1q|cZBrgo\u0007\u000f\u0011bwr9\bRtd\u0016";
      f1285[39] = "tM fa#d\t j\u0004f}^9hy`\u001b\n'ct'!H2iy\u001b";
      f1285[40] = "\"\u001fDz/\u0006%\u001b\\@&\u001b1\tM\u001b(\u0006+\u0016D-/|vJC}/\u0016.\u0019\u0010-CFt\u0011\u001d,)\u001e'BM@yD/OL*!\u0017|\u001f -9\u0007%\fNy.\u001ctr";
      f1285[41] = "I\u0013\\L\u001a\r\u0012Y\f]gՐr\u0013VV\u0017C\u0012K\u0002\u0014\u00021";
      f1285[42] = "\r\u0014\u0013:\u0001\u0018\u0004M\u001690ұ=\u0017\u0016 [VA\u001b\u0015#\u000e";
      f1285[43] = "\t\r\u00175\u0016VSL\u001d+zF\u0004\u000e,3\u001dU7\u0013\u001b+zF\u0014\f\u00131BVP\f\u001fT";
      f1285[44] = "qigSj?<9dM\u000bc#x\u0002Bsm\"\t<Rox!n%SeaNk?Wso)r>]j\u0000,h:Kdg5i0R\u000bm4r7Me9#if3";
      f1285[45] = "ej\u0012x4G42U%\rɢXaW}fX$mT~3(br\rl1\u0012 g\u0007a\r";
      f1285[46] = "9\u0017G0(8,SDh\u00107)R\u001bt\u00101lD\u0016j.6/R\u0005\u000e{#)\u0014\u0001an?n\u0012|4i:#\u0014Fv|0.(";
      f1285[47] = "M!gk\\\u0019J%\u007fQU\u0004^7n\u001aT\u0002H/n=0Y\u001b/>=Z\u0001H|nQ\n[@qo;R\b\u0013!\u00033Q\u0007[#d*P\rBLn+K\n]\":<P[#";
      f1285[48] = "\u0011x#a\u001b%\u00017dop9}-#i\u001aqC*`\u007f\t\u0015\u0016ypo\u0014+\u0011:f|p";
      f1285[49] = "W\u00144Y?{\u0006Ls\u0004\u0006ʐjD,\f9f\u0011O,M8\u0014";
      f1285[50] = "1V\u000b\u0019\u0018c>\u0016\u0012\u0011{f,\n\r\n\u0007`*g\u0019\u001d\u0015v\"\u001dJ\\K\u007fP";
      f1285[51] = "a?\u0000Kt+f;\u0018q}6r)\t4\u007f/b>dK 22>\u000e\u0013sabR^I{lc8\u0006\u001a(<\u000fh\u001d\u0011hm5*\b\u001beQ";
      f1285[52] = "m\f2\u0001HLaCm\u0006/хQ\u0003.\fTD`_?\u0002\u00144";
      f1285[53] = "'\u0017JZJ\u000bjGID+_x\u001e\tfZLu\u001bsYA_i\u0016\u001f\u0002DW)w\u001e@P]f\u0019JWK\f\u0018";
      f1285[54] = "pZK9c\u0018y\u0003N:RԹ@YN#9V<UM l";
      f1285[55] = "Yl%\u0012r8\n-{\u001b\u0000\"^i\r\u000ep>7\u007f1\u0018i<Y+&\u00038B";
      f1285[56] = "jin&\u0001\u00150(d8m\u0011gjA \u0006\u0017q{cG\u0000\u0010q\u007fq)T\u0007j.\u000f}\u0014\nz*5?\u0001\u0000w\u0016";
      f1285[57] = "qjJ:G@x3O9v\u001b,\u007f\u0015&\u001a){>IyH~{;\u0016|\u001a\u0014#hE,vDy`H-\u001c\u001c*3\u0018A\u0014\u001f%{\u001a&\r\u001e/bu,\f\u0005(}\u001bx\u001b\u001ey\u0003";
      f1285[58] = "m\u000baV\u0000A<S&\u000b9ȫP[y\u0003\u0006\\+PyB\u0007.j\u0013~B\u0005\u0014(\u0006tO9";
      f1285[59] = "7R~]%I;Z|\u0000I\u001b;^E_2\u0015<Fva(\u0012:EdEI\u0015g^a]-\u001a'Gi>";
      f1285[60] = "rgx%D.uc`\u001fM9aqqEE:qcgrD^&2\u007f\"D4~a,r(d$i!sB<w:q\u001fJ?xrsxS>rk\u001c%Q>l6&gD4a\n";
   }
}
