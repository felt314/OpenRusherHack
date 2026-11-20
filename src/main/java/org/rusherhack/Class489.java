package org.rusherhack;

import org.lwjgl.glfw.GLFW;
import org.rusherhack.client.api.bind.key.GLFWKey;

import org.rusherhack.command.bind;
public class Class489 extends GLFWKey {
   public static Object[] f7874 = new Object[24];
   public static String[] f7875 = new String[24];

   @Override
   public String getDisplayLabel() {
      boolean var10003 = true;
      return this.getLabel(true).replace("_", "");
   }

   @Override
   public String getLabel(boolean var1) {
      return Class010.m421(this.getKeyCode(), var1);
   }

   public Class489(int var1) {
      super(var1, -1);
   }

   @Override
   public boolean equals(Object var1) {
        return false;
    }

   @Override
   public boolean isKeyDown() {
      int var10000 = GLFW.glfwGetMouseButton(GLFW.glfwGetCurrentContext(), this.getKeyCode());
      boolean var10003 = true;
      if (var10000 == 1) {
         boolean var3 = true;
         return true;
      } else {
         boolean var10002 = true;
         return false;
      }
   }

   @Override
   public int hashCode() {
      boolean var10003 = true;
      return this.getLabel(true).hashCode() + this.getKeyCode() + this.getScanCode();
   }

   static {
      m157();
   }
   public static void m157() {
      f7874[0] = " _W[=\u0016<EU\u0007'\u0002,F\u001eӕ";
      f7874[1] = "t=ri z\u007f2c&]bl5jo";
      f7874[2] = "EluH-2Ncd\u0007@6N\u007fPLr+Jc`L";
      f7874[3] = "\u0006Qqe%A\u001aKs9?U\nH8г";
      f7874[4] = boolean.class;
      f7875[4] = "java/lang/Boolean";
      f7874[5] = "\u001f%&-Fy\u0003?$q\\m\u0013<oɷ";
      f7874[6] = ">6\u0014\nBp\",\u0016VXd2/]Ȣ";
      f7874[7] = int.class;
      f7875[7] = "java/lang/Integer";
      f7874[8] = "1Bo\"x^-Xm~bJ=[&ofB;^|\"k[7\u001ejedOp[mu$l\u0012v_GoR";
      f7874[9] = "%QKKDI9KI\u0017^])H\u00021";
      f7874[10] = "7*vu\u0006I2?}u\rR>/?\u001c&x\u000f";
      f7874[11] = long.class;
      f7875[11] = "java/lang/Long";
      f7874[12] = "G\\K{\u0017\u001fLSZ4v\u0011GX^n";
      f7874[13] = "9\fUxGJ:\u0001\u0013hw]\u0003XS|\u001bU?\u0013R>K48\u0019Rk\u0016\bs\u0018\u0010;w";
      f7874[14] = "\u001f\u0001Qe|G\u001a\u0017V\u001dǞ'[\u0001\u0016{b\u0019[\u0019\u0019\u001d\u007f^\\\u001e\f#\u007fFSx";
      f7874[15] = "(J@\u0011{hh\u0016U\u001f\u00179{\f~\u0011~0]\u0017I\u0017\u0017k.LCGn&)\fCz";
      f7874[16] = "+ym\u0007`\u007f+aba\u007f,+d{\nhAjoq\u0005|+?el\u000f\u0005x<cv\u0018o-6~|a}8,fw_} #\u0000";
      f7874[17] = ":\u0014M_\\\u0010<\u0002\f\u0018>\u0001`\u000bMiS\u0012A\u0002O]S.y\u0019NAXn;\u001a\u000f\u0016W\u0014g\u0019\u000e_>S<YT\u001bG\u001e;\u0019T&\u0003V8\u0003\u000f_NQx\u00032";
      f7874[18] = "<1S9s>:'\u0012~\u0011/f.S\u000f|<I=V:|&~\u000bK&m-r<,\u007fn}2)V#m|{@";
      f7874[19] = "\u0010k\u001f^x\u0011C0ZPAȯ,<Z\u0013'KUq]S'v";
      f7874[20] = ">%9A\u001cc>=6'\u00194=<\r@\u00150Fa~\u001b\u001f`?,y[\u001f]";
      f7874[21] = "E(\u001a'f&\u0016w\u0010*\u001fԂ{uNiyw\u00028I)yJA8\u001c7ewFsN(\u001f2\u00027\u00100!2\u001a8v";
      f7874[22] = ":D\r\u0014{9z\u0018\u0018\u001a\u0017hi\u0002+\u0012fLc\u0012\u0005\u007f*?8\u0018U\u0006g8x\u0018h";
      f7874[23] = "#Ms\u0005$M @5\u0015\u0014\\t^K\u0013~^}\"5\n~Qc\u001f2A,N\u0019Zv\u0005rV'Zn\n\u0014";
   }
}
