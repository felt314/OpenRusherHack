package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.hud.HudElement$Alignment;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.setting.BooleanSetting;

import org.rusherhack.command.bind;
public class MacroList extends ListHudElement {
   public BooleanSetting commands;
   public static long f8263 = Class066.m4320(-7430260994935016669L, 8211839293127910619L, MethodHandles.lookup().lookupClass()).m4325(190524327567605L);
   public static String[] f8264;
   public static String[] f8265;
   public static Object[] f8267 = new Object[55];
   public static String[] f8268 = new String[55];

   @Override
   public HudElement$Alignment getAlignment() {
      HudElement$Alignment var5;
      if ((var5 = super.getAlignment()) == HudElement$Alignment.TOP_CENTER || var5 == HudElement$Alignment.TOP_RIGHT) {
         return HudElement$Alignment.TOP_LEFT;
      } else {
         return var5 == HudElement$Alignment.BOTTOM_RIGHT ? HudElement$Alignment.BOTTOM_LEFT : var5;
      }
   }

   public boolean m15930(Class101 var1) {
      IKey var4;
      if ((var4 = (IKey)RusherHackAPI.getBindManager().getBindRegistry().get(var1)) != null && var4 != NullKey.INSTANCE) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public MacroList() {
      super("MacroList");
      boolean var10008 = true;
      this.commands = new BooleanSetting("Commands", true);
      this.registerSettings(this.commands);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void tick() {
        
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
   public static void m273() {
      f8267[0] = "\\$u[/(@>w\u00075<P=<\u00162/Vxp\u001c39\u001d=w\fs\u0013F:~>8$";
      f8267[1] = "HD\u0017N| T^\u0015\u0012f4D]^\u0003b<BX\u0004No%N\u0018\u0012\t`1\t\u007f2\t`1jW\u001e\u0001i0U";
      f8267[2] = "I\u0003k>\u007f!M\u001ek/b!\u000e\u0011$8e=T\u001e)e~*J\u0012&?bfo\u0015/.r<\u00128'!t+T:$;";
      f8267[3] = "V\u0006\\\u0007\t!J\u001c^[\u00135Z\u001f\u0015ȯ";
      f8267[4] = int.class;
      f8268[4] = "java/lang/Integer";
      f8267[5] = "\nqNMBo\u0016kL\u0011X{\u0006h\u0007\u0000\\s\u0000m]MQj\f-{\u0016Cr\u0000qa\u0002Sq$S`";
      f8267[6] = "\u000elZwZz\u0005cK8;t\u000ehOb";
      f8267[7] = "Ng|YuXR}~\u0005oLB~5ӂ";
      f8267[8] = "-wc1961mam#\"!n*ɫ";
      f8267[9] = "4's=\b\\?(brd_1*`=H";
      f8267[10] = boolean.class;
      f8268[10] = "java/lang/Boolean";
      f8267[11] = "n+\f]X7r1\u000e\u0001B#b2E\u0010F+d7\u001f]K2hw\u001e\u001a\u00045h7\u000f\u001c]lV0\u0005\u0017E5W0\u000e\u0004b#o=\u0007\u0016X\u0000`*\u000e";
      f8267[12] = "C~('SJHq9h.R[v0!";
      f8267[13] = "8f\u0002[\nn$|\u0000\u0007\u0010z4\u007fK\u0016\u0017i2:\u0016\u0010\fo>z\u0002[:t8x\u0000\u0014\u0016H2`\u0011\u001c\u0016|";
      f8267[14] = "\u0010Rvyo\u0012\fHt%u\u0006\u001cK?4r\u0015\u001a\u000ew2|\u0013\nRtyT!\u001aAe\"o\u0002<O\u007f1t\u0000\nRp5q\u0002";
      f8267[15] = "\u0006t\u0001FG</M\u001d\\E`5Y\r_\u000eq2J\u000b\u001aSw)L\u0007ZG<\u000e]\u001a@I|:\u0003";
      f8267[16] = void.class;
      f8268[16] = "java/lang/Void";
      f8267[17] = "RB2\u0017,HNX0K6\\^[{Ó";
      f8267[18] = "`wAK\u00116|mC\u0017\u000b\"ln\b\u0006\u000f*jkRK\u00023f+@\u0000\u00027zwCK\u000b6k+n\u0010\u0007\u0006c`K\u0000\r7+DJ\f\u0004-b`H\u0011";
      f8267[19] = "k%|\u0018BGu-fW%Fd6k\r\u0003@";
      f8267[20] = "lpf4QwpjdhKc`i/ï";
      f8267[21] = "+/<rV95'&=4%2:";
      f8267[22] = "\u0010\u001e uzF\f\u0004\")`R\u001c\u0007iİ";
      f8267[23] = "WSQ^\u0005\u001eI[K\u0011M\u001eSQSVD\u0005\u0013bUZO\u0002^SSZ";
      f8267[24] = "P*P;\\fL0RgFr\\3\u0019vBzZ6C;OcVvQpOgJ*R;Ff[v{|]gw-SPBvR=Ya";
      f8267[25] = "sw>qq\bom<-k\u001c\u007fnw<o\u0014yk-qb\ru+?:b\tiw<qk\bx+\u00156p\tTp=\u001ao\u0018q`7+'1uv-\u0016w\u0018q";
      f8267[26] = "\u0003\fhvH4\u001f\u0016j*R \u000f\u0015!ī";
      f8267[27] = "5szEB-h>9\u0010-94\u007f}/\u0011`0f|\u0017U 'u\u0001";
      f8267[28] = "L\u001a\"xv8\u000bD~6Nm\u0018^\u0004f(n/O!f5~\u000fSN>,f\u001c@*<6>\u000e\"";
      f8267[29] = "~\u0000*'\u001d2)\u000f1gx2)\n(v?\"@QnvI-&\n:|\u0002L~\u0000*'\u001d2)\u000f1gx";
      f8267[30] = "^\u0002\u001d\\7$\t\u0018\u000e[GԸd\\\r\u0002z%\u001a\u001a\u001fYvX";
      f8267[31] = "1kY\u0015\u0014\u0011fqJ\u0012dȴ\u000b5IKY\u0010us[\u0010Um";
      f8267[32] = "\u0018\u001a8Y\"I\u001dOf\u0004MΒv\u001a1\u0005vC\u0013\u001fd[+";
      f8267[33] = "v\u0011\u0000\u000bIP.S\u001eU;˻K\u001c\u0015\u0007T\u001cpT\u0018WQ";
      f8267[34] = "w=rl\u000f{~z=,pxw#d-\u001d\u0002&yj:\r:b9})p=!+22\u0016fu!yS";
      f8267[35] = "OZ\u0000\u0010\\\u0006A\u0019\u0005\t7\nLK8\u0012N\u0001^VZ\b^\u0005@'RLJ\nIV\u0003\u0013Y] ";
      f8267[36] = "YS=\u0019K\u0002\u0014L3\u001b:\u001d\u0005Nm\\F\n\u0012za[F\u0006\u000eNw'S\u0001\u0003ObU\nZRO\fM\u0004\u001a\u0001H}\u001c[\tV!";
      f8267[37] = "T\u00061v<L_\u001f99U*x,\u0017\u0002\u00180c9\u001aI>\u0004NK)s5\u001dF\u0004";
      f8267[38] = "\nm,iG3\bwt{%8^sH<\u001a>ZrpxZ)I\u000ft?L>N70\u007f[-3";
      f8267[39] = "\u001a]w\u00162`\u0011D\u007fY[\u00066wQs\u001a\u00151s\u0006B)+NF<I0#\u0001";
      f8267[40] = "A\u0004:\u0017C5OG?\u000e(?C\u0005G\u0018M:C\u0003yuE+_F}\fLl\u0010\u0006\u0002";
      f8267[41] = "P3:H.OUfd\u0015AV>0d\u0012xQ[-g\u0018/*";
      f8267[42] = "\u0000v\u0002[\u0000KX4\u001c\u0005r\u001e=tEG\u0002O\u0002+CO\fw\u0003s\u0005NJH\\u\r@r";
      f8267[43] = ":..vIv;5?\u001dwVQ\u0012\u0007[}]\n~.}]ol\u007f5l";
      f8267[44] = "IVN\u000f=v\u0011\u0014PQOԿt\u0001\r\n$:\u0012\u0007SQ=JKQ][.,\u0010\u0005W\u0010O";
      f8267[45] = "p\n\u0006i`\b%\fXa\u0001\u0018OG\u0015<qUu\u000fW\u007f?4\u007f\u000bVs`\u000e7I\u0015=\u0001";
      f8267[46] = "Ayyo$\u0005\\zs8_ˁ,-c'`\u001fU$$h `";
      f8267[47] = "\\R><`7U\u0015q|\u001f4\\L(}r\u000f_) =~sXDur.51\u0016tn./WM deN";
      f8267[48] = "B\u001c+V\"%\u0004N~\rS%\u0014\u0002\u0004P5&<\u0017(X<'\u0003~w\t?5AD0Wc{y";
      f8267[49] = "q\b*t_+z\u0011\";6[]&\u0007\fsF@;\u0014\u000bj\u0011q\b*t_+z\u0011\";";
      f8267[50] = "dI}Dg\u001boPu\u000b\u000e}Hc[?CoS;g\t\u007f\u001ef\u0001l\u0010wQ";
      f8267[51] = "\u001bThel8\u0012\u0013'%\u0013 \nBc3o&\f/u&h+\u0019](k+~v";
      f8267[52] = "\u0005\u000f Et?\u000e\u0016(\n\u001dO)!\r=XR*0\u001f&\u001dn\u001c\fn\u0013'e\u0005\u0004!";
      f8267[53] = "`\"\u0003*kt=o@\u007f\u0004fe%>-tz\faC-5gj:\u0017'~\u0006";
      f8267[54] = "\n?7*yd\u0000?3>\u0013ҍk=a'xy\r;?|a";
   }
}
