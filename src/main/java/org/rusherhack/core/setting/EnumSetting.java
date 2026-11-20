package org.rusherhack.core.setting;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import org.rusherhack.core.utils.StringUtils;

public class EnumSetting<T extends Enum<?>> extends Setting<T> {
   public static String f1673;
   public static Object[] f1675 = new Object[42];
   public static String[] f1676 = new String[42];

   public void decrement() {
      Enum[] var5 = (Enum[])this.getValue().getClass().getEnumConstants();
      int var10000 = this.getValue().ordinal();
      boolean var10003 = true;
      int var4;
      if ((var4 = var10000 - 1) < 0) {
         int var10002 = var5.length;
         boolean var10005 = true;
         this.setValue((T)var5[var10002 - 1]);
      } else {
         this.setValue((T)var5[var4]);
      }
   }

   public EnumSetting<T> setVisibility(BooleanSupplier var1) {
      return (EnumSetting<T>)super.setVisibility(var1);
   }

   public void increment() {
        
    }

   public String[] getOptions(boolean var1) {
        return null;
    }

   public EnumSetting<T> setChangeAction(Runnable var1) {
      return (EnumSetting<T>)super.setChangeAction(var1);
   }

   public EnumSetting<T> onChange(Consumer<T> var1) {
      return (EnumSetting<T>)super.onChange(var1);
   }

   @Override
   public JsonElement serializeValue() {
      return new JsonPrimitive(this.getValue().name());
   }

   @Override
   public boolean deserializeValue(JsonElement var1) {
        return false;
    }

   public EnumSetting(String var1, String var2, T var3) {
      super(var1, var2, (T)var3);
   }

   @Override
   public String getDisplayValue() {
      return StringUtils.toTitleCase(this.getValue().name());
   }

   public T parseValue(String var1, boolean var2) {
        return null;
    }

   public EnumSetting(String var1, T var2) {
      super(var1, (T)var2);
   }

   public static void m4084(String var0) {
      f1673 = var0;
   }

   public static String m4085() {
      return f1673;
   }

   static {
    }
   public static void m122() {
      f1675[0] = "/)A\u001fl-33CCv9#0\bRq*%uUTj,)5A\u001fM=4/O_y";
      f1675[1] = "Yy+i%CRv:&DMY}>|";
      f1675[2] = void.class;
      f1676[2] = "java/lang/Void";
      f1675[3] = "\fE<`\u00180\u0010_><\u0002$\u0000\\u-\u00057\u0006\u0019(+\u001e1\nY<`/+\u0016Z\b+\u001e1\nY<";
      f1675[4] = "]L\u001bC[\u0003AV\u0019\u001fA\u0017QURș";
      f1675[5] = "\u001dX]eqd\u0016WL*\u001cd\u0016JX";
      f1675[6] = "T\u00176BNv!7=M_9@96F[c4";
      f1675[7] = "X\u0000|\u000bY#S\u000fmD2!G\f";
      f1675[8] = int.class;
      f1676[8] = "java/lang/Integer";
      f1675[9] = "\u001d\u0013\u0002;x|\u0003\u001b\u0018t0|\u0019\u0011\u000039gY0\u001b5:l\u0016\u001c'/&y\u001b\u001b\u0011(";
      f1675[10] = "wX v\t`|W19txoP8p";
      f1675[11] = boolean.class;
      f1676[11] = "java/lang/Boolean";
      f1675[12] = "F@\u0001\u000bi\u0002ZZ\u0003Ws\u0016JYHFt\u0005L\u001c\u0013Qr\u001bZ\u001c5Qi\u001eGU3Qr\u001bZ";
      f1675[13] = "\u00022s^T\u000e\u001e(q\u0002N\u001a\u000e+:\u0013I\t\bng\u0015R\u000f\u0004.s^d\u0014\u0002,q\u0011H(\b4`\u0019H\u001c";
      f1675[14] = "Pb:H2!y[&R0}cO6Q{ld\\0\u0014&j\u007fZ<T2!XK!N<al\u0015";
      f1675[15] = "\u0001r}J\u001b\u001b\rz|\u0001R\u0013\u0011r~J6\u0007\rsU\b\u0019\u0019\u0007sd";
      f1675[16] = "*G\fr~\u0014&O\r97\u001c:G\u000frS\b&F1.p\u0016 \\\b*|";
      f1675[17] = "\u0003$.y\u000b\"\b+?6w;\u0007+9zI+";
      f1675[18] = "\u00015+~W}\u001f=11\u001f}\u00057)v\u0016fE\u00172q\n}\u00061/";
      f1675[19] = "SXx\u0017\u000b.&xs\u0018\u001aa[``\u001f\u0013(3";
      f1675[20] = "\u0019H;\\\u000fglh0S\u001e(\u0011p#T\u0017ay";
      f1675[21] = "\u0012\u0001\u000f!?a\u0013CX6\u0001gEB*1hzGS(:}}OXa:>gCN\u001b7~e\u0019>[nol\u0016CZ,8{(";
      f1675[22] = "\t%d\u000f\u0014_^>c`\u0013NE\u001fs\u0004\u0015N9x \f\u0003\u001aW-b[\u0005#\u00003}\n\u0014\u0013C'g\u0000h";
      f1675[23] = "\u0013arjyxDzu\u0005դ\u0004N5`olf\u001f{|9\u0005";
      f1675[24] = "[,\u0016JzFZnA]D@\fo&[?Z\u000br\u001c[8Ja-\u0002Y|Y\u001b)\bB>;[,\u0016JzFZnA]D";
      f1675[25] = "\u001c\u0012D(\u0002J\u0011ET#oOH\u001aC\u0018PES\u001e\u0010sRIB\u0003.";
      f1675[26] = "J\f5x\bBG\u0002!8fǺ{^>~\n\u0016B\u0013rr^s";
      f1675[27] = "\u007fBDxA>f\t\\gy?mzBn\u001f\u0006lY\\h\u0005?hU99B.r\u0006Yo\u0002f|8";
      f1675[28] = "Q;V\t5}Py\u0001\u001e\u000bik?\u0003\u000b5yUgZ\u000bk\u0000P?JGr>\bfJ\u0019\u000b";
      f1675[29] = "\"}rP&s#?%G\u0018ǫ\u0018}pRy0s\u007f|Cd\u000e!0{Jd>b$a@\u0018";
      f1675[30] = "N(zkV2\tvvgkf\u0018;F}\u0016l> m`\u0017`\u0013;p\u001bWu\u001b\"uv\tuIx\u000b";
      f1675[31] = "Kj\u0006\u0013C\u000eJ(Q\u0004}\u000b\u0018/\u0013\u000e#\u001a\u0015(\u0005cB\u001f\u00034V\b@\u0013\u0012)hSF\u0003\u0015k\b\u0005\u0006K\u001bUU\u000e\u0017C\u001c6XY\u0007Hq";
      f1675[32] = "e\bHl([dJ\u001f{\u0016ѡ_\bJnw\u00184\nF\u007fj&";
      f1675[33] = "}Ht\nN#|\n#\u001dp9!<z\u0013\u00161*wq\u0001\u001b;\u007f\u001b+\u0018\r'GM%\u0014\u0000`:LgC\u0017^";
      f1675[34] = "Ge5)V\b\u0010~2F͕t\u001a1',C\u0016K\u007f;z*M\u0005f!:\u001a\u000e\u0011|+F";
      f1675[35] = "e\u0016r:7ohAb1Zk\"\u0017yl3hXFg3g66\u0000%xj\f";
      f1675[36] = "+^Al\u001a}2\u0015Ys\"r/Xuf`f%BdgCx#X]cO\u001d(^]p\u0019{x[\u0007d\"";
      f1675[37] = "v\neZ|\u0005&\u000f?NG\u0002g+xM&\u0005sp4\f7\u0007\"\u0010bL\u007f\t\u001c";
      f1675[38] = ">z\u001bC@[ia\u001c,SJr@\fHAJ\u000e'_@W\u001e`r\u001d\u0017Q'";
      f1675[39] = "&\u0011\u0015kGV?Z\rt\u007fY\"\u0017!a$J5\n\u000eu\u007f\t#\u0019\t$\u0014\u000b/\b\u0014\u001a";
      f1675[40] = "&\u001b(\b)6$\u00179\u0015\u00170`\n3\rl\u001cv\u0011=\u0013z\u0016p\f7i(1k\u0016d\u0002*=z\u000bZY,-}I:\u000flesw";
      f1675[41] = "l\tkT ^?\u0005uRE[;;jH!J\u0017\u000epYE\u00180\u0015j\n.\u001a<\u0004w4zK.\u00065_xG?\u001b\u000b";
   }

   public EnumSetting() {}
}
