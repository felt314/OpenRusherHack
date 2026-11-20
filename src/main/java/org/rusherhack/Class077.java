package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.text.CharacterVisitor;
import net.minecraft.text.Style;
import net.minecraft.text.TextColor;

public class Class077 implements CharacterVisitor {
   public int f1956;
   public List<Class396> f1957;
   public String f1958;
   public StringBuilder f1959;
   public TextColor f1960;
   public static long f1961 = Class066.m4320(8435062104204205328L, -8134108780441572267L, MethodHandles.lookup().lookupClass()).m4325(208226535873132L);
   public static String[] f1962;
   public static String[] f1963;
   public static Object[] f1965 = new Object[29];
   public static String[] f1966 = new String[29];

   public String m4586() {
      return this.f1958;
   }

   public List<Class396> m4587() {
      if (!this.f1959.isEmpty()) {
         this.f1957.add(new Class396(this.f1959.toString(), this.f1960 == null ? this.f1956 : this.f1960.getRgb()));
      }

      return this.f1957;
   }

   public boolean accept(int var1, Style var2, int var3) {
        return false;
    }

   public Class077(int var1) {
      super();
      this.f1957 = new ArrayList<>();
      this.f1960 = null;
      this.f1959 = new StringBuilder();
      this.f1958 = "";
      this.f1956 = var1;
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
      f1965[0] = "\u0019K\u000bWcm\u0005Q\t\u000byy\u0015RB\u000f";
      f1965[1] = "<!X\u0003dO\")BL\u0006S%4";
      f1965[2] = ">]\u0018f\u0005S5R\t)d]>Y\rs";
      f1965[3] = boolean.class;
      f1966[3] = "java/lang/Boolean";
      f1965[4] = "\fe\u0005\u0006O\u001a\u0010\u007f\u0007ZU\u000e\u0000|LȮ";
      f1965[5] = int.class;
      f1966[5] = "java/lang/Integer";
      f1965[6] = "%!U\u0015ur..DZ\bj=)M\u0013\u0019k&,G\u0011)";
      f1965[7] = "l\u0004<?2ag\u000b-pOyt\f$9";
      f1965[8] = "\u0019Zc\u0004\u0004W\u0005@aX\u001eC\u0015C*ɞ";
      f1965[9] = "?d\u001cm\u0017 ?d\u000b1\u001b/%/\u000b/\u001b:\"^]qOx";
      f1965[10] = char.class;
      f1966[10] = "java/lang/Character";
      f1965[11] = "V]c\u0011+lJGaM1xZD*і";
      f1965[12] = "\u0006\u000e\b\u0010v?\u0006\u000e\u001fLz0\u001cE\u001fRz%\u001b4N\u000b#e";
      f1965[13] = "^\u0017}\u000f\u0006ICW~cα;@\fsY\u0017KWRa";
      f1965[14] = " \u000e*W*!7P8m8=6hsU-:$S0Q51ZR%Vjj<Rp\u00122Q";
      f1965[15] = "?\u0004)\u0001wZ<\u00012\u0000\tՋ\u0004\u0004qA0\u0011aV/\u000f7+";
      f1965[16] = "s6v(#6p3m)]ȞH6.hd}-dp&cG";
      f1965[17] = "zQ:rJdy\\y`7%!h:aV?)3{p]5wH{%H=F";
      f1965[18] = "N\u0003vz0rSCu\u0016Ԡ\u0000\u0017\u0015qzk{\u0017@dr";
      f1965[19] = "s\u001a\u0014&S\u0000p\u0017W4.T7\u0000\u0005)B=p\u0016X+H\u0001sHQ~.\u0001-\u0004\u00012\u0013\u0002 G\u0013O";
      f1965[20] = "*3\u0007Z{d)>DH\u00060n)\u0016UjY+:\u0011_7\"+o\u0004W\u0006et-\u0012N;fyn\u00003";
      f1965[21] = "9\u001a~GRC.Z}+Q1c^#R\\Zf\brD8\u000fdWjOS\n2\u0006|+";
      f1965[22] = "-\u0018h>]80XkRӸJu\u0007y;Jwv\n:)";
      f1965[23] = ";0)\u0013y=&p*\u007fɈOcuzF)*1+4A";
      f1965[24] = "B\u001f]A\u0003]__^-Ӌ/\u0018\b\f]SQ\u0016\b\fM";
      f1965[25] = "\u0010-yi0_\u0013 :{M\u0003W\u0002`x1\u0013,ui;vYJu<\u007f.b";
      f1965[26] = "Z\u0017MiPT\u0006\u0001Xe+ǴeSX\u007fG\u001d\u001eS\rjO,X\u0005Yy\u001aWXPLq+";
      f1965[27] = ">?\rmo\u00060?\r}U\u001dm)Qz9/:j\u000e$kx<m\u000f$o\u001dn3A#U";
      f1965[28] = "\u0012\u001fhtIk\u001f\r51*0O\u0001l)F\u0002\u001bE=q\u0011U\u001c\u00170>\u0010+\u0012\u00170.*";
   }
}
