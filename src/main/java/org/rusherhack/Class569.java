package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.math.Vec2f;

public class Class569 {
   public double f9137;
   public double f9138;
   public static long f9139 = Class066.m4320(7092139521624215510L, -1631407543990125341L, MethodHandles.lookup().lookupClass()).m4325(216140186547256L);
   public static String[] f9140;
   public static String[] f9141;
   public static long f9143;
   public static long[] f9144;
   public static Long[] f9145;
   public static Map f9146;
   public static Object[] f9147 = new Object[25];
   public static String[] f9148 = new String[25];

   public Class569 m17454(double var1) {
      return this.m17458(new Class569(var1, var1));
   }

   public Class569 m17455(Class569 var1) {
      return new Class569(this.f9138 + var1.f9138, this.f9137 + var1.f9137);
   }

   public double m17456(double var1, double var3) {
      var1 -= this.f9138;
      var3 -= this.f9137;
      return var1 * var1 + var3 * var3;
   }

   public void m17457(Vec2f var1) {
      this.f9138 = var1.x;
      this.f9137 = var1.y;
   }

   @Override
   public String toString() {
      double var3 = this.f9137;
      double var5 = this.f9138;
      return "Vec2d[" + var5 + ", " + var3 + "]";
   }

   public Class569(Vec2f var1) {
      super();
      this.m17457(var1);
   }

   public Class569 m17458(Class569 var1) {
      return new Class569(this.f9138 / var1.f9138, this.f9137 / var1.f9137);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         boolean var7 = true;
         return true;
      } else if (var1 instanceof Class569 var5) {
         if (this.f9138 == var5.f9138 && this.f9137 == var5.f9137) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void m17459(Class569 var1) {
      this.f9138 = var1.f9138;
      this.f9137 = var1.f9137;
   }

   @Override
   public int hashCode() {
      long var3 = 7L;
      var3 = 31L * var3 + Double.doubleToLongBits(this.f9138);
      long var10000 = 31L * var3 + Double.doubleToLongBits(this.f9137);
      return (int)(var10000 ^ var10000 >> (int)f9143);
   }

   public Class569 m17460(double var1, double var3) {
      return this.m17455(new Class569(var1, var3));
   }

   public double m17461(Class569 var1) {
      double var4 = var1.f9138 - this.f9138;
      double var6 = var1.f9137 - this.f9137;
      return Math.sqrt(var4 * var4 + var6 * var6);
   }

   public static double m17462(double var0, double var2, double var4, double var6) {
      var0 -= var4;
      var2 -= var6;
      return Math.sqrt(var0 * var0 + var2 * var2);
   }

   public Class569(Class569 var1) {
      super();
      this.m17459(var1);
   }

   public void m17463(double var1, double var3) {
      this.f9138 = var1;
      this.f9137 = var3;
   }

   public Class569(double var1, double var3) {
      super();
      this.f9138 = var1;
      this.f9137 = var3;
   }

   public static double m17464(double var0, double var2, double var4, double var6) {
      var0 -= var4;
      var2 -= var6;
      return var0 * var0 + var2 * var2;
   }

   public Class569 m17465(Class569 var1) {
      return new Class569(this.f9138 * var1.f9138, this.f9137 * var1.f9137);
   }

   public Class569 m17466(double var1) {
      return this.m17465(new Class569(var1, var1));
   }

   public double m17467(double var1, double var3) {
      var1 -= this.f9138;
      var3 -= this.f9137;
      return Math.sqrt(var1 * var1 + var3 * var3);
   }

   public double m17468(Class569 var1) {
      double var4 = var1.f9138 - this.f9138;
      double var6 = var1.f9137 - this.f9137;
      return var4 * var4 + var6 * var6;
   }

   public Class569() {
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
      f9147[0] = ")\t\u0003\u00191~5\u0013\u0001E+j%\u0010Jԅ";
      f9147[1] = double.class;
      f9148[1] = "java/lang/Double";
      f9147[2] = "\u0017c#GFm\u0017c4\u001bJb\r(4\u0005Jw\nYe]\u001a";
      f9147[3] = float.class;
      f9148[3] = "java/lang/Float";
      f9147[4] = "^/\u0005>\u0016wU \u0014quz@&";
      f9147[5] = "\u0010h~_\u001e\b\fr|\u0003\u0004\u001c\u001cq7ɷ";
      f9147[6] = int.class;
      f9148[6] = "java/lang/Integer";
      f9147[7] = "W}8\u007f:\u001aKg:# \u000e[dqȥ";
      f9147[8] = void.class;
      f9148[8] = "java/lang/Void";
      f9147[9] = "t}K3Kv\u007frZ|!uk~Q7";
      f9147[10] = long.class;
      f9148[10] = "java/lang/Long";
      f9147[11] = "\rx.[(0\u0006w?\u0014I>\r|;N";
      f9147[12] = "ULfm|S\u0017\u000fku\u0002\u0016\u0017\u000fe\u001fz\u0016\u001fJu\u007f\u007f\u0000\u0015uadsR\u0002\u0015drym";
      f9147[13] = "yVI|#\u0017*\u0010[CɾxyVI|#\u0017*\u0010[C~\u001ey\u0013\b..\u001dgH6";
      f9147[14] = "c\u0005\fQIH0C\u001enғ'c\u0005\fQIH0C\u001enE\\pA\u0013\u0001\u0016\u001ab~";
      f9147[15] = "EWW.!\r\u0017\fFbEȸyR[*:\u001d\u001f\nBm#a";
      f9147[16] = ",2&#^\u0010mak{!\u0013wf3,vD-7l@\u001bCdh8yM\u0000r5";
      f9147[17] = "r\u001al:\u007f\u0005>\u0010o&D\u0018+\t:\")(+07 +>-\b+F<\u000f=K<&9\u00197to'tI5\u000e996\u0011L";
      f9147[18] = "\u000b\u0002*F}\u007fXD8yǊ\u0010\u001f\u0002$Fqp\u001a\u0014.";
      f9147[19] = "kJuI]k8\fgvԋ\u0004=\b{\u0015Bi|[6M=9a]4HPibCov";
      f9147[20] = "t\u000f ZU|5\\m\u0002*\u007f/[5U}(u\nk9\u0010/<U>\u0000Fl*\b";
      f9147[21] = "wL;b!4$\n)]([&\t'<?9gV=`Af%T%##'zNy]";
      f9147[22] = " ?q>\u00046syc\u0001ӧY ?q>\u00046syc\u0001\b\"3{nn[d!D";
      f9147[23] = ";\u0019\u0017\f\t`h_\u00053Ƚ\u000f;\u0019\u0017\f\t`h_\u00053\u0005t(]\b\\V2:b";
      f9147[24] = "\u0015\u001coQs{FZ}nĊ\u0014\u0001\u001caQ\u007ft\u0004\nk";
   }
}
