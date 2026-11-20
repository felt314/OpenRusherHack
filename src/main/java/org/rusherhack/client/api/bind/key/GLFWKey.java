package org.rusherhack.client.api.bind.key;
import org.rusherhack.*;

import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.bind;
public abstract class GLFWKey implements IKey {
   public int f297;
   public int f298;
   public static String f299;
   public static Object[] f301 = new Object[16];
   public static String[] f302 = new String[16];

   public int getScanCode() {
        return 0;
    }

   public GLFWKey(int var1, int var2) {
    }

   public GLFWKey(int var1) {
    }

   public int getKeyCode() {
        return 0;
    }

   public static void m619(String var0) {
      f299 = var0;
   }

   public static String m620() {
      return f299;
   }

   static {}
   public static void m194() {
      f301[0] = "-D?'wD1^={mP!]vjiX'X,'dA+\u0018:`kUl]=p+v\u000ep\u000fB`H";
      f301[1] = int.class;
      f302[1] = "java/lang/Integer";
      f301[2] = "\u000b^i\"\u001a\u0010\u0017Dk~\u0000\u0004\u0007G o\u0007\u0017\u0001\u0002}i\u001c\u0011\rBi\";\u0000\u0010Xgb\u000f";
      f301[3] = "9}yF_[L]rIN\u00141EaNG]Y";
      f301[4] = "\u0019\u0010DpoK\u0005\nF,u_\u0015\t\rȪ";
      f301[5] = "d?=BCbo0,\r>z|7%D";
      f301[6] = void.class;
      f302[6] = "java/lang/Void";
      f301[7] = "Iv\b\b&.<V\u0003\u00077aAN\u0010\u0000>()";
      f301[8] = "!L[o\n\t*CJ k\u0007!HNz";
      f301[9] = "n4\u000f\u0002h\u0002t0\trŕ9rv\n\u001b<Aa)\u0016";
      f301[10] = "g4irS\u0016}0o\u0002\b-> li\u0006\u0013?!exb\u0016n'kf\\\u0017o.z\u0002";
      f301[11] = "\u0006\\\u000f(65^V\u0012&[ը?\u0011M2:pRG\u001d)5\t";
      f301[12] = "w\u0006ky_g/\fvw2̤NK)cS\"#\u001dyx\\[r\u0012o|Rd3\u0017iq2";
      f301[13] = "2K9D\u0016\u0001(O?4Ί:kQiDNA\"N6]'";
      f301[14] = "|\u001a]\u0003h\u0004f\u001e[sɐ?`XX\u001a<Gs\u0007D";
      f301[15] = "%7+\u000eL^?3-~Ԗe|-{\u000e\u0014\u001e52$\u0017}Y#3&\u001eB\u0018&5+~";
   }
}
