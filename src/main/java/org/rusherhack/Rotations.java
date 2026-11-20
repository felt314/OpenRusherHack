package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.core.setting.BooleanSetting;

public class Rotations extends Module {
   public BooleanSetting placefix;
   public BooleanSetting fixRotationsOnStrictServersLike2b2t;
   public float f8889;
   public float f8890;
   public static Rotations f8891;
   public static long f8892 = Class066.m4320(5311752061271893543L, -9095790481023419573L, MethodHandles.lookup().lookupClass()).m4325(33341059430127L);
   public static String[] f8893;
   public static String[] f8894;
   public static Object[] f8896 = new Object[22];
   public static String[] f8897 = new String[22];

   public Rotations() {
      super("Rotations", "Control global rotation settings", ModuleCategory.CLIENT);
      boolean var10015 = true;
      this.fixRotationsOnStrictServersLike2b2t = new BooleanSetting("MoveFix", "Fix rotations on strict servers like 2b2t", true);
      this.placefix = new BooleanSetting("PlaceFix", "Fix block placements while your rotations are being spoofed", false);
      this.f8890 = -999.0F;
      this.f8889 = -999.0F;
      f8891 = this;
      this.registerSettings(this.fixRotationsOnStrictServersLike2b2t);
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
   public static void m157() {
      f8896[0] = "#q\u0005tn,?k\u0007(t8/hLƗ";
      f8896[1] = "J&\u000bi+DA)\u001a&V\\R.\u0013o";
      f8896[2] = "i#zR\r(u9x\u000e\u0017<e:3\u001f\u00134c?iR\u001e-o\u007f{\u0019\u001e)s#xR\u00122b$q\u0019Q\u0010i5h\u0010\u001a\u001eg%x\u001b\u0010/\u007f";
      f8896[3] = "(X\u001b\u0017\f\u0002#W\nX`\u0001-U\b\u0017L";
      f8896[4] = boolean.class;
      f8897[4] = "java/lang/Boolean";
      f8896[5] = "\u001eG~\u00103N\u0002]|L)Z\u0012^7Ը";
      f8896[6] = float.class;
      f8897[6] = "java/lang/Float";
      f8896[7] = "\u007f1\u000f[`\u000ec+\r\u0007z\u001as(F\u0016}\tum\u001b\u0010f\u000fy-\u000f[P\u0014\u007f/\r\u0014|(u7\u001c\u001c|\u001c";
      f8896[8] = "*Q\u001d*1:6K\u001fv+.&HTg/& M\u000e*\"?,\r\u001ca\";0Q\u001f*. !V\u0016am\u0002*G\u000fh&";
      f8896[9] = "LT\u0000`\u001fIem\u001cz\u001d\u0015\u007fy\fyV\u0004xj\n<\u000b\u0002cl\u0006|\u001fID}\u001bf\u0011\tp#";
      f8896[10] = void.class;
      f8897[10] = "java/lang/Void";
      f8896[11] = "z2\u0018B'tf(\u001a\u001e=`v+Q\u000f9hp.\u000bB4q|n\u0019\t4u`2\u001aB6nx-\u001e\u00021/t2\u0018B\u0005mt9\u001a\u001e\u0007ds%\r\t;bp";
      f8896[12] = "2\u000bAt|%9\u0004P;\u001d+2\u000fTa";
      f8896[13] = "\u001f]\u0017W4\"\u001e\u0011H0ǱN\u001d\u000b\u001e\u000b:wB\u000f\u0018H\u0004wN\u0006B\u000e=(J\u0000\u00010";
      f8896[14] = "E[i\u0005\u0000w\u001cT/\u0005iB8eZ>5\tE[i\u0005\u0000w\u001cT/\u0005";
      f8896[15] = "\u0013\u007f\u0007F\u000e\u001a\u0012u\u0001\u001cd\\@|\u0015\u0010#L)\"\u0014\u0017\u000b\u001aM%S\u0001\u0018\"\u0013\u007f\u0007F\u000e\u001a\u0012u\u0001\u001cd";
      f8896[16] = "\"|\u001dN7\u007f%=I\tRԤ\u001e|\u001eOotxy\u0012\f3";
      f8896[17] = "}3!%x\u0014zrub\u001d®A3=xv\u0006xk3`d";
      f8896[18] = "Dy4\u0000O*\u0007{-Cs\"\u0017/*\u0001\u000f5\u0000\u001b&\u0006\u000f9\u001c/0zM9\u001d\"p\u0016M4\u0015|KEN3\u00131{\u0019\u00156B@";
      f8896[19] = "\u000b=\u0000)3Y\f|TnVʗ7=Q\u007fm\\W:\u0010+*";
      f8896[20] = "kPY\u0015f\u0004l\u0011\rR\u0003\u0092WPZ\u0014>\u000f1UVWb";
      f8896[21] = "n\u007f\u0003KwM=|]J\u0018\u0010Q9\u000e\u0011#\u0002hf\n\u0017`<hj\u0003M&\u00057n\u0005\u000e\u0018";
   }
}
