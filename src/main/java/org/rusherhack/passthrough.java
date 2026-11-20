package org.rusherhack;

import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Matrix4f;
import org.rusherhack.client.api.Globals;

public class passthrough extends Class253 {
   public static long f3747 = Class066.m4320(8232387207319166306L, 5296436369105594970L, MethodHandles.lookup().lookupClass()).m4325(86145253321018L);
   public static String[] f3748;
   public static String[] f3749;
   public static Object[] f3751 = new Object[22];
   public static String[] f3752 = new String[22];

   public passthrough(String var1) {
      super("passthrough", var1);
   }

   public passthrough(InputStream var1) {
      super(Class253.class.getResourceAsStream("/rusherhack/shaders/passthrough.vsh"), var1);
   }

   public passthrough() {
      super("passthrough");
   }

   @Override
   public void m6551() {
      Matrix4f var4 = new Matrix4f().setOrtho(0.0F, Globals.mc.getWindow().getScaledWidth(), Globals.mc.getWindow().getScaledHeight(), 0.0F, 0.0F, 1000.0F);
      this.m9150("projectionMatrix").m14718(var4);
      this.m9150("\u001d\u001f\u0014\u0015\u001c&\u0019\u0015\u0007=E\u000btrix").m14718(new Matrix4f());
   }

   static {
    }

   public static String m656(byte[] var0) {
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
   public static void m194() {
      f3751[0] = "\"\u0015S(\u001a\n\"\u0015Dt\u0016\u00058^Dj\u0016\u0010?/\u00147G";
      f3751[1] = "8//x^;8/8$R4\"d8:R!%\u0015jf\u0007c";
      f3751[2] = "CI*\u0016\u0016\u0013_S(J\f\u0007OPc՜";
      f3751[3] = "\u001dKF\u001eYd\u0016DWQ$|\u0005C^\u0018";
      f3751[4] = "*VZ\u0013{'6LXOa3&O\u0013Ȼ";
      f3751[5] = "\u0016\nk\u0004N?\n\u0010iXT+\u001a\u0013\"ѿ";
      f3751[6] = "@ao\"2\u0002B\u007f&A9\u0019]zp8>";
      f3751[7] = float.class;
      f3752[7] = "java/lang/Float";
      f3751[8] = void.class;
      f3752[8] = "java/lang/Void";
      f3751[9] = int.class;
      f3752[9] = "java/lang/Integer";
      f3751[10] = "+qv\u0012gD7ktN}P'h?_yX!me\u0012tA--VPzS%ob";
      f3751[11] = ".@`\u0005jd2ZbYpp\"Y)Htx$\\s\u0005ya(\u001caNye4@b\u0005{~,_fE|? @`\u0005]\u007f\"ZfElC.TbY}\u007f\"W";
      f3751[12] = "1\u0014C\u001e:H:\u001bRQ[F1\u0010V\u000b";
      f3751[13] = "\u000eLP e VN\f\u0011z4OQ\u000e}Hc\t\u000fY*\u001f`Z[\u0000ay2\u000f[\u0000\u0011";
      f3751[14] = "\u000eC\u0006\\X\u001d\\\u0016\u0006\\(\u001eZV\fRD,\u000b\u0016\\\u000b(EG\u0010WDX\u0001GF\r5";
      f3751[15] = "\f:\tS\u00167J&Y\u001d}Ӗ5d@\u0019Lm[3_XB\u000f\u000f'BS\u001faX8\u0003]}";
      f3751[16] = "Zu{JK:^)%K6n\u000eH|\\\u000f:\u001f1$^S";
      f3751[17] = "L'N_E=\f6\u0019\u001d)ŮwpXZ\u0018g\u0019'G\u001b\u0016\u0005L;M[Lg\u001duXS)";
      f3751[18] = " \u0014w,Exf\u0005`b:?q\u0002\\iF${~&-\u0001.qC{~P5\u001cC%(P)!\u001evyKD!@ yWy|\u0013qb:y\"Eq~\u0007$q\u0014j\u0013\u0007z'\u0014v.Z)v\u000f\u001b.\u0004\u007fv\u0013&sW.m~'yV{cBahA5\u001c";
      f3751[19] = "\u0015E`z DG\u0010`zPGAPjt<u\u0010\u00112)P\u001c\\\u00161b X\\@k\u0013";
      f3751[20] = "\u0013{Y0,\fB5L8IѢ(6_&v\u0011\u0014pN18n\u00166^3$\u0014Uk\u000f$I";
      f3751[21] = "DLA!s7\u001d\r\u001ch\u001e%{\b\u0006c/k\u0015_\u0019\"!\tAK\u0004)|g\u0016TE'\u001e";
   }
}
