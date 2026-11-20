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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.hud.ShortListHudElement;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class DubCounter extends ShortListHudElement {
   public BooleanSetting shulkers;
   public double f7894;
   public int f7895;
   public BooleanSetting label;
   public BooleanSetting singles;
   public BooleanSetting colon;
   public ColorSetting f7899;
   public static long f7900 = Class066.m4320(-1178264989641335899L, 5111043286880938374L, MethodHandles.lookup().lookupClass()).m4325(39019278219805L);
   public static String[] f7901;
   public static String[] f7902;
   public static long[] f7904;
   public static Integer[] f7905;
   public static Map f7906;
   public static Object[] f7907 = new Object[76];
   public static String[] f7908 = new String[76];

   @Override
   public Text[] getComponents() {
        return null;
    }

   @Override
   public void tick() {
        
    }

   public DubCounter() {
        super("DubCounter");
      long var1 = f7900 ^ 81779000046807L;

      boolean var10009 = true;
      this.singles = new BooleanSetting("Singles", true);
      this.shulkers = new BooleanSetting("Shulkers", false);
      boolean var10007 = true;
      this.label = new BooleanSetting("Label", true);
      this.f7899 = new DubCounterColor(this, "Color", new Color(0, m5165(24061, 6513558532311662058L ^ var1), m5165(20041, 5437084900903792223L ^ var1)))
         .setVisibility(() -> {
            return RusherHackAPI.getHudManager().isThemeColorSynced();
         })
         .setAlphaAllowed(false);
      var10007 = true;
      this.colon = new BooleanSetting("Colon", true);
      boolean var10003 = true;
      this.label.addSubSettings(this.f7899);
      Setting[] var10001 = new Setting[]{this.label, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.colon;
      var10001[2] = this.singles;
      var10001[3] = this.shulkers;
      this.registerSettings(var10001);
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
   public static int m5165(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17232;
      if (f7905[var3] == null) {
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
         long var5 = f7904[var3];
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
         Object[] var9 = (Object[])f7906.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f7906.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ѽ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f7905[var3] = var15;
      }

      return f7905[var3];
   }

   public static int m5166(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m5165(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(DubCounter.class, "m5166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ѽ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m273() {
      f7907[0] = "\u0017\u0016L\u0000\n\u0005\t\u001eVOm\u0004\u0018\u0005[\u0015K\u0002";
      f7907[1] = ">5Z\u0018n(5:KW\u000f&>1O\r";
      f7907[2] = ":\t\u0013]'l&\u0013\u0011\u0001=x6\u0010Z\u00109p0\u0015\u0000]4i<U\u0001\u0007<u&U#\u001c'u1.\u0000\u001a9j";
      f7907[3] = boolean.class;
      f7908[3] = "java/lang/Boolean";
      f7907[4] = "(\u000bz0\u0011\b6\u0003`\u007fs\u00141\u001e";
      f7907[5] = "P\u001b\u0016@bkL\u0001\u0014\u001cx\u007f\\\u0002_В";
      f7907[6] = "Ug/S `I}-\u000f:tY~fȉ";
      f7907[7] = ".|\u0001%)F2f\u0003y3R\"eHȍ";
      f7907[8] = int.class;
      f7908[8] = "java/lang/Integer";
      f7907[9] = double.class;
      f7908[9] = "java/lang/Double";
      f7907[10] = "y\u001d\u000eOQCy\u001d\u0019\u0013]LcV\u0019\r]Yd'HV\b\u001f";
      f7907[11] = "0|J\u0012wS0|]N{\\*7]P{I-F\f\t#\u000f";
      f7907[12] = "%C5\u001008%C\"L<7?\b\"R<\"8ys\bea";
      f7907[13] = "\u0007\u0005PmG\u0015\f\nA\"+\u0016\u0002\bCm\u0007";
      f7907[14] = "\u0010@\u0006q$G\u0010@\u0011-(H\n\u000b\u00113(]\rz@h\u007f\u0017";
      f7907[15] = "\u001a\u001b&H4/\u0011\u00147\u0007Y,\u001d\n1[{!\u001c\u001f";
      f7907[16] = "q~\u0013}.Wq~\u0004!\"Xk5\u0004?\"MlDUa{\u000f";
      f7907[17] = "c\u00198{V_c\u0019/'ZPyR/9ZE~#~b\u000e\u0002";
      f7907[18] = ":\u0016\u000fvJW&\f\r*PC6\u000fF;WP0J\u001b=LV<\n\u000fvkG!\u0010\u00016_";
      f7907[19] = "r]\u0018I5WnG\u001a\u0015/C~DQ\u0004(Px\u0001\f\u00023VtA\u0018I\u0005MrC\u001a\u0006)qx[\u000b\u000e)E";
      f7907[20] = "\u0000G!1\u000bz\u001c]#m\u0011n\f^hǒ";
      f7907[21] = "ov\u000fV<\u0010dy\u001e\u0019A\bw~\u0017P";
      f7907[22] = "G>a\u0010&Y[$cL<MK'(]8EM\"r\u00105\\Abu[ XA\"a\u0010\u0017CD#tm1X\\%hY";
      f7907[23] = "i\u0007\u000bYd|i\u0007\u001c\u0005hssL\u001c\u001bhft=MB1&";
      f7907[24] = "Rp\r\u001aqf'P\u0006\u0015`)F^\r\u001eds2";
      f7907[25] = "e\u0002xi\\b\u0010\"sfM-q,xmIw\u0005";
      f7907[26] = "H\u0010F\u000fk H\u0010QSg/R[QMg:U*\u0000\u00140x";
      f7907[27] = "{j J.O{j7\u0016(@a!7\b(UfPaV|\u0016";
      f7907[28] = "\u0010JqC/O\fPs\u001f5[\u001cS8\u000e2H\u001a\u0016c\u00194V\f\u0016B\u00040_\r";
      f7907[29] = " k\u0013\u0000We\tR\u000f\u001aU9\u0013F\u001f\u0019\u001e(\u0014U\u0019\\C.\u000fS\u0015\u001cWe(B\b\u0006Y%\u001c\u001c";
      f7907[30] = void.class;
      f7908[30] = "java/lang/Void";
      f7907[31] = "d*u]eix0w\u0001\u007f}h3<\u0010xnnvt\u0016vh~*w]^Zn9f\u0006eyH7|\u0015~{~*s\u0011{y";
      f7907[32] = "^KPwCYwrLmA\u0005mf\\n\n\u0014juZ+W\u0012qsVkCYVbKqM\u0019b<";
      f7907[33] = "\u0002\u0011LE6p\u001c\u0019V\n~p\u0006\u0013NMwkF2UKt`\t\u001eiQhu\u0004\u0019_V";
      f7907[34] = "-\u0001A`e#1\u001bC<\u007f7!\u0018\b-{?'\u001dR`v&+]t;d>'\u0001n/t=\u0003#o";
      f7907[35] = "T%agR=H?c;H)X<(*L!^9rgA8Ryu0S<^:(\u0000h=_\u001ag'A/^%";
      f7907[36] = "#v\r-q@~rU\u0011)Om5i(#ZgtYx-^aI";
      f7907[37] = "dd\u000b\u0001}y%iTZ\u000fj2x:Zc{$)\n\nm\u007f\"\u0014\u0000^>>:*\u0005Rw=^";
      f7907[38] = "\u0003/PAM\u0005QrHS=\u001c[-HNz\f2s\b\u0012\u0000\u0006\fv\u0004[\u0003b\u0003/PAM\u0005QrHS=";
      f7907[39] = "YO7.Qu_B0qah[\u0002=x\rZ\r@d$P\r\bG6`[6Y\u0018&qab\u0007\u0014l/\u0019d\n\u00133\u001f";
      f7907[40] = "Xc+\r\u0016|\u0014n7\u001cwȕe0s\u001b\bv^a,\u000b\u0019L";
      f7907[41] = "b\u000f&;ZciF/b0ňYI/|J,d\f||Z";
      f7907[42] = "!?Tj5l7c\tlJq&gIb\raO=\rd55tlRt$\u000f!?Tj5l7c\tlJ";
      f7907[43] = ";SP28Kz^\u000fiJMfj\u001b*#@\u0001C\u0000!:\u000b`L\u0001lp1aB\u0010 pPnC]jJ";
      f7907[44] = "#~|e:\u0012r1ya\\\u0015/2c:0'~u?bgp uqf>\u000fz\u007f{/\\";
      f7907[45] = "y)2[\u0014\u0013r`;\u0002~ɬB=-\u0017\u0018P)5+X\u0019";
      f7907[46] = "\u00173\u0000*u\u0003\u001cz\ts\u001fΊ,'\u001ffy@G/\u0019)x";
      f7907[47] = "D<t}hFX*7y\u0013LM(j\u007fo[Z\u001cfxoWF(p\u0004vVZ<ynv\u0006J<\u000bgmL\u001c+4iuYXG";
      f7907[48] = "3w?S;C%+bUD^4/\"[\u0003N]u5O>Q`0fO. 3w?S;C%+bUD";
      f7907[49] = "B/s*ZHGg9(?^ 3u-Z\rC%)p\\rNa)(@\u0011X=t.?";
      f7907[50] = "\t\u000bs39V@\u001c}3Y]T\fs.5o\u0000I-te8\b\u000bm4)@\t\ncxYQIK*ybZ@O\"I";
      f7907[51] = "x\u0011\u0010swq)^\u0015w\u0011vt]\u000f,}D%\u001aSt)\u0013w\u001d\u000f.npaAR(\u0011q\"ST)n+(Y\u001dK";
      f7907[52] = "LA\u001a\fpcG\b\u0013U\u001aɈwW\u001b\u000fa4M^A\f#";
      f7907[53] = "Rr\u0016De-NrK\u0012\n NS\u0017Go,~h\u0013Mp\u001aDi\u001cGfA\u000f2F\u0017n\u007f\n>\u000f\u0014\n";
      f7907[54] = "EV\u0000\u001eKcN\u001f\tG!ǂ~B\u001fRG \u0015J\u0019\u001dF";
      f7907[55] = "Y{\u0019W3\u0005Zq\u0006D\f\u0016X<9Fh\u0004X@^Ct\u0003\bp\u000eMp\u00055";
      f7907[56] = "w\u000blk\u0007&|Be2mʺL\u001fs'\u000be'\u0017uh\n";
      f7907[57] = "0\u0013&V9Dj\u0019,\u001f[^?T4\n7lh\u0017j\\`;<\u00144\b$X*Hi\u000e[YiZo\u000f$\u0003cP&m";
      f7907[58] = "\u0014{K=!%NqAtC?\u001b<Ya/\rOx\t;yZ\u0017pF>%8F?C:C8M2\u0002d<bG8K\u0006";
      f7907[59] = "\u000b\txOha\u0007Wa\u0002\u0014ƭf\b<Sq'\u0005\u001e`\u000ewX\bZ`Vk;\u001e\u0006=P\u0014";
      f7907[60] = "\u0012w\u0018G:\u0000\u001b-\u001b\u0005SU\u0011i{U7G\u0011OjvS\u0004E~Z\u0006hU\u001anK<";
      f7907[61] = "\u001bUlmXvZSy9?uOFTgXqAwx\u007f^fCWe\u0003\u0005'\u0013\u0007z=\u0000+Z\u0004\u001e9O+@HdxBt\u001b:";
      f7907[62] = " \nM ' #\u0000R3\u00185 ]h%r\u0007!MO9~371V8b'>[Vhr'LRM\"$0s\\U7`\\";
      f7907[63] = "Xdc\u001a8\u0011S-jCRFc xH?_\u000eqd\u0015*/_dlI\"B\u000ex1\\R";
      f7907[64] = "ng\u000f1efg=\fs\f'my{.t<iLV.k#mi2p1m=a\fu=$>\u0005\\(1'i?Ur2e\u0000";
      f7907[65] = "L\u0003\u0017|\u000b\u0006\f\u0002\u0012r;\u0019\u0012RHslNI\u0002\u0012.;HO\u0004O/J\bN\u0001A";
      f7907[66] = "\u0003bn,L\t\u0014./5/]\t.Q8Cw\r4x*BHd5l.A]\b)ly\u00172";
      f7907[67] = "\u0001C$*lK@N{q\u001ePG^o!bVA3+wz\r\u0005Qvs\"1";
      f7907[68] = "\tBA)P\nZPV;-^[@P-Al\u000f\u0005\bs\u0015;\u0006GP0MUOP^0-";
      f7907[69] = "D0\u001fKosB=\u0018\u0014_eJl\u0011\u0016\b1\u0017:KB_d\u001akDJ'b\u0017l\u001b";
      f7907[70] = "\u0005}f[\u001f\u000bW ~Io\u0006S|gT\u0006\njrgD\u0002l\u000e&2\u0004\u000bR\u000b*{\u0007o";
      f7907[71] = "\u0013k~|)\u0010\u0018\"w%Cʅ(-$)<\u0014\u0013|{9-";
      f7907[72] = "<\u000f9khg5U:)\u0001&?\u0011Zqz<8\f`q},R\bu(qd)\\ka8]<\u000f9khg5U:)\u0001";
      f7907[73] = "L\u0004+-DfD\u000f%}|dG\u0006((+3\u001eTs||a\u001d\n*}\u0007z\u001eS*";
      f7907[74] = "gA\u000eWk5:EVk5>\"8\u0007\u001b)WcC[V1ifO\u0012UU";
      f7907[75] = "*5t\f\u0002Qp?~E`K%rfP\fyr18\u0006^.'?l\u0006PV!2kY`Ls|=U\u001f\u0016yvt7";
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
}
