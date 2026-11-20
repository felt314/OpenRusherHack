package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.core.utils.Pair;

public enum TimestampsPunctuation {
   f5223,
   f5225,
   f5227,
   f5228;

   public String f5222;
   public String f5224;
   // $VF: synthetic field
   public static long f5229 = Class066.m4320(2032326370277113333L, -5096589780433242809L, MethodHandles.lookup().lookupClass()).m4325(72089128231411L);
   public static Object[] f5230 = new Object[20];

   public String m10636() {
      return this.f5222;
   }

   TimestampsPunctuation(String var3, String var4) {
      this.f5224 = var3;
      this.f5222 = var4;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
    }

   public String m10638() {
      return this.f5224;
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
      f5230[0] = "?P*\u001d\u0013`#J(A\tt3Icɋ";
      f5230[1] = "~GG:\u0013FW~[ \u0011\u001aMjK#ZȐ\u001e";
      f5230[2] = "bjJI=y~pH\u0015'mns\u0003\u0004 ~h6X\u0013&`~6}\u0006&~";
      f5230[3] = " \u001fcw\u0019\u0011+\u0010r8d\t8\u0017{q";
      f5230[4] = "CMv?\u0011\u0017_Wtc\u000b\u0003OT?r\u000f\u000bIQe?\u0002\u0012E\u0011wt\u0002\u0016YMt?\u0000\rARp\u007f\u0007LMMv?3\u000eMFtc1\u0007JZct\r\u0001I";
      f5230[5] = "T>0h\u0002n}\u0007,r\u00002g\u0013<qKȸ4";
      f5230[6] = "h\u001c&$5Gc\u00137k^Ew\u0010";
      f5230[7] = "`|;\"]4ks*m04kn>";
      f5230[8] = "\u0018n\u000eW\u00157\u0013a\u001f\u0018t9\u0018j\u001bB";
      f5230[9] = "'xeG\u0013p|z3)˛\u0014w?<W\u0001s&=%Lc";
      f5230[10] = "L\u0011Z&;y\u0017\u0013\fH$\u001dL\u0011Z&;y\u0017\u0013\f";
      f5230[11] = "&}e\u0017 u}\u007f3yΦ\u0011w~`\u001f9u3;a\u001c";
      f5230[12] = "g\u0004\b74h/\u0006CwR+^ELu4n:\u0001\tt7\u0007d@N.;c \u0005O-R";
      f5230[13] = "(\u000ei>yXl\u001ag=\u0017X}\u0012e*PH\u0014Kq#pHp\u001aj*(&.I%!~Bj\f$\"\u0017\u001al\u0007a)i^x\tbG";
      f5230[14] = "\u0001zgm&\u001eZx1\u0003ȪzQ=>}4\u001d\u0000?'f";
      f5230[15] = "m8W]{56:\u00013nQm8W]{56:\u0001";
      f5230[16] = "}e\u001cP/\u000b&gJ>ϋo,f\u0019X6\u000bh#\u0018[";
      f5230[17] = "c\u001c\u000f\u0007\u0003Q4A\tQs\u0010X\u0016\f\u0006\u0015U<RI\u0007\u0016<b\u0013\u000e]\u001aX&V\u000f^s";
      f5230[18] = "\u0011,h/\u001avJ.>A\u000e\u0012\u0011,h/\u001avJ.>";
      f5230[19] = "\u0012r\u001a\u0003\u0000:IpLm\\^\u0012r\u001a\u0003\u0000:IpL";
   }
   TimestampsPunctuation() {}
}
