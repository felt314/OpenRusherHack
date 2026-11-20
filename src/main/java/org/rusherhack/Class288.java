package org.rusherhack;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.core.bind.IBindable;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.serialize.Class062;

import org.rusherhack.command.bind;
public abstract class Class288 implements Class062 {
   public static long f4865 = Class066.m4320(-4107639053815748550L, 8713917035839046456L, MethodHandles.lookup().lookupClass()).m4325(216170154229261L);
   public static String[] f4866;
   public static String[] f4867;
   public static Object[] f4869 = new Object[46];
   public static String[] f4870 = new String[46];

   public void m9864(IBindable var1, JsonObject var2) {
   }

   public JsonElement m9865() {
        return null;
    }

   public boolean m9866(JsonElement var1) {
        return false;
    }

   public abstract boolean m9867(String var1);

   public Class288(Class407 var1) {
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
   public static void m122() {
      f4869[0] = "}\u001foYVVa\u0005m\u0005LBq\u0006&ȶ";
      f4869[1] = "\u0003\u0018\u0001g\u0014\u0007\u001f\u0002\u0003;\u000e\u0013\u000f\u0001HΡ";
      f4869[2] = "\u0014c\u000em'@\u0010~\u000e|:@SqAk=\\\t~L6&K\u0017rCl:\u00072uJ}*].rT";
      f4869[3] = "N1x{\u001a(J,xj\u0007(\t#7}\u00004S,: \u001b#M 5z\u0007oh'<k\u00175n13|\u00155H7";
      f4869[4] = "s|\u0000\"[%mt\u001am<$|o\u00177\u001a\"";
      f4869[5] = "f[\\R7.mTM\u001dV*f_IG";
      f4869[6] = "n(SeOxr2Q9Ulb1\u001aȿ";
      f4869[7] = "f |B\f*m/m\rq2~(dD";
      f4869[8] = "RRT\t8n^ZUBqfBRW\t\u0015r^SxU-`H";
      f4869[9] = ",\u0007#/`t \u000f\"d)|<\u0007 /Mh \u0006\u000bmbv*\u0006:";
      f4869[10] = void.class;
      f4870[10] = "java/lang/Void";
      f4869[11] = "D2v\u0017Fg@/v\u0006[g\u0003 9\u0011\\{Y/4LGlG#;\u0016[ b$2\u0007Kz\u001f\t:\bMmY\u000b9\u0012";
      f4869[12] = "S*;2?\u0012O09n%\u0006_3r\u007f!\u000eY6(2,\u0017Uv)h$\u000bOv3~'\u0002_,/2\u001e\u0004N70p/\u0006N";
      f4869[13] = "\u0015\u0016VMW+\t\fT\u0011M?\u0019\u000f\u001f\u0000J,\u001fJS\nK:T\u000fT\u001a\u000b\u00171\u0001H";
      f4869[14] = boolean.class;
      f4870[14] = "java/lang/Boolean";
      f4869[15] = ".X'$\b3*E'5\u00153iJh\"\u0012/3Ee\u007f\t8-Ij%\u0015t\bNc4\u0005.uck;\u000393ah!B\u001f)X{(";
      f4869[16] = "ac;h!C}y94;Wmzr%<Dk?>/=R X\u001e/=Ros0#";
      f4869[17] = ",\u0017UV)20\rW\n3& \u000e\u001c\u001b45&KP\u00115#m'[\u0016?\n\"\u000bS\u001f>5\u0001\u0004A\u001d";
      f4869[18] = "3^\u001bD\ry?V\u001a\u000fDq#^\u0018D e?_9\b\u0000s3E";
      f4869[19] = "\u0017Pq\u0014<Y\u000bJsH&M\u001bI8n";
      f4869[20] = "|a\u0015\\e\u001b'n[;ʊ*u<C\u00009K2\u007fN^";
      f4869[21] = "M{\u00030i]O;]aQ\u0006\bi\u001f0-\u0000\u000e\u0004_? \u0015\u000f`[<j\u0003t";
      f4869[22] = "bQU+KG\"_\u001e6&X5_RV\u001a\u0004!S\u0015,\u001eB*@.";
      f4869[23] = "\u0013\u0002-UMcI[*@whB\bS\u0007\u0019{P\u0003lB\u0015:\u0013dl\u0002\ngR\u001c.\u0007On.";
      f4869[24] = "o=uY]S42;>ʰba70@X]$;q\u0003?";
      f4869[25] = "@ai4n@\f b=W\u0011p\"e%5S\td!4+=M\"'89D\u000bf6&W";
      f4869[26] = "\u0001G4s1^\u0000\u001a3qU\n]\u0000\u0016 ?\bT|c0:\u001e\fG-s0\u00040Ao67\u000bI\u0007+')e";
      f4869[27] = "\u0010F?\blTKIqoȎe\u001d\u001f\u007f\r`\u001c[[n\u0013\u000eTYM{S5\u001a\u001aGao";
      f4869[28] = "9\\O\u00067\u0004/\u001cUASR>X`_5Q\tIDS)P5OG>n\u0000,FDG(D=X*";
      f4869[29] = ",94oh\u0010 lc4TB*,\u0010k2A\u001d=5k/Q=!Z5.Q%9kx1D!P";
      f4869[30] = "hK(6\n-gS\u007f<6}lLKnRol0)=On:J-{D}\u0001";
      f4869[31] = "\u001b\u0016m]$\u001a\u001dG-D[\t\u001c\u001a\bU<\u0018\u001d\f,^[]M\t2A\"\u001b\t\u0018,/f]\u000f\u0014>V \u0019\u001e\nP\u0010`\u001d\u0016\n(ReX\u001fv";
      f4869[32] = "i\u0016Q\u001eL5f\u0003\u001c\u0016!Ñ\u0005D\u001e\u000bCa|\u0002Z\u001a]\u000f4BENE45\u001fBL!";
      f4869[33] = "\rM;\u001em\u001fVBuyƁ.\u0003G~\u0007h\u0011FK?D\u000f\u001fDF\u007fE4Q\u0007Ley";
      f4869[34] = "Z\u007fhrW\u001f\u0000&ogm\u001c\u001btlw\u0011\u001a\u001d\u0019,`\u0016\u0000\n`ln]\u001dg";
      f4869[35] = "E\u0015Q\ti&\u0018\u0018\u0002\t\u0015ƻyF\\\u001aw!\u0000\u0000\u0018\u000biODF\u001e\u0007{6\u0002\u0002\u000f\u0019\u0015";
      f4869[36] = "\u0013*\tlU_^5\u001ch<\tF2\u0018e@Tk:\u0017cW\u0012a6\ttM5A,u7C\bEhO5\u0003V\u0014P";
      f4869[37] = "~o%_T%;cd\u001c3u-}\u0016Zqa'g\u0016[Is1\u0001bGMvzc8\u001eJc@";
      f4869[38] = "\u001d>#Is`\u0012&tCO0\u00199]\u0015>_H\u007fg\u0004t%L9l\u0017O";
      f4869[39] = "\u001c/S\u0019\u0004\u0017G \u001d~\u0557&F3\tF\u0002\u001fPs\u0013\u0001fMLv\u001e\u0001\u001cK\u001d6\u0007~Y\u001dQ-\u0010\u0006\u001b\u0018\u0014$l";
      f4869[40] = "\u0019!h,\u0006\u000b\\-)oa[J3[)#O@)U8\u0003YL3\u00129\u0001\tU0h?PILO";
      f4869[41] = "ScuGn*\bl; f\u001b_izLpr\u0002d)L\f'\r7&\\ez\u0000d& ";
      f4869[42] = "\fojE\t!La!Xd8_jWU\u0014$6 hW\u001fd\rn+]\u0005X";
      f4869[43] = ".wa'Fj(&!>9\u007f(k\\h\u0004o'y%.@~9\u0017b;Cn\"('7\u0002-E";
      f4869[44] = "7\u0012d\\z\u001a;G3\u0007F\\1\u0007@X K\\F7F.I%\u0000sW:'m@l\u0003\"\u001cl\u001dk\u0001F\u0018g\u0006lE>ZbCe9";
      f4869[45] = "`O8pdv%Cy3\u0003&3]\u000buX5$@$a\u0003tc^ `z2'O>\u000e";
   }

   public Class288() {}
}
