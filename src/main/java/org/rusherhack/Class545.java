package org.rusherhack;

import org.lwjgl.glfw.GLFW;
import org.rusherhack.client.api.bind.key.GLFWKey;

import org.rusherhack.command.bind;
public class Class545 extends GLFWKey {
   public static Object[] f8762 = new Object[25];
   public static String[] f8763 = new String[25];

   @Override
   public String getLabel(boolean var1) {
      return Class010.m420(this.getKeyCode(), var1);
   }

   @Override
   public int hashCode() {
      boolean var10003 = true;
      return this.getLabel(true).hashCode() + this.getKeyCode() + this.getScanCode();
   }

   @Override
   public boolean equals(Object var1) {
        return false;
    }

   @Override
   public String getDisplayLabel() {
      return this.getLabel(false).replace("_", "");
   }

   @Override
   public boolean isKeyDown() {
      int var10000 = GLFW.glfwGetKey(GLFW.glfwGetCurrentContext(), this.getKeyCode());
      boolean var10003 = true;
      if (var10000 == 1) {
         boolean var3 = true;
         return true;
      } else {
         boolean var10002 = true;
         return false;
      }
   }

   public Class545(int var1) {
      super(var1, GLFW.glfwGetKeyScancode(var1));
   }

   static {
      m157();
   }
   public static void m157() {
      f8762[0] = "\u0019\u0017\u0013]nZ\u0012\u0018\u0002\u0012\u0013B\u0001\u001f\u000b[";
      f8762[1] = "\u000e%C=U\u0004\u0005*Rr8\u0000\u00056f9\n\u001d\u0001*V9";
      f8762[2] = "m\u001c\u0005m\"fq\u0006\u000718ra\u0005LҴ";
      f8762[3] = boolean.class;
      f8763[3] = "java/lang/Boolean";
      f8762[4] = ">\u001bF4\u0001M\"\u0001Dh\u001bY2\u0002\u000fy\u001fQ4\u0007U4\u0012H8GG\u007f\u0012L$\u001bD4\u0010W<\u0004@t\u0017\u00160\u001bF4 ]%\u001dHt\u0014n0\u0005T\u007f";
      f8762[5] = "q$\u0002R\fam>\u0000\u000e\u0016u}=K\u001f\u0012}{8\u0011R\u001fdwx\u0007\u0015\u0010p0=\u0000\u0005PSR\u001027\u001bm";
      f8762[6] = int.class;
      f8763[6] = "java/lang/Integer";
      f8762[7] = "m|mo/%qfo351ae$\u0015";
      f8762[8] = "M`\"\u001aw(Qz Fm<AykȲ";
      f8762[9] = "6\u0002s^\u001e$*\u0018q\u0002\u00040:\u001b:Ȅ";
      f8762[10] = "?nk<*r:{`<!i6k\"U\nC\u0007";
      f8762[11] = long.class;
      f8763[11] = "java/lang/Long";
      f8762[12] = "_7oJ>jT8~\u0005_d_3z_";
      f8762[13] = "(3\u001e;\u0010\u001d(c\u0018ik\u001bs6\u0002\u0019\u0006\bT5\fVT\u000bg)\u00073\nOsi}jZMed\u0003-\u0011\u001b*XAgR\u0006+&\u0006,\u0004I\u0017";
      f8762[14] = "\"\u001c8\u0012\u0006Z`\u001f\u007f\u0003:Xt\u0011\u001b\u0006SQR\n,\u0000:\u000b(T2QDLc\u0002}m";
      f8762[15] = "=uM\r%|b!\u001fl=-*,G\u0007*@k#\u001e\t{+4xW\u000fGy9xKP,&b1Ml(}1)LPw)cH";
      f8762[16] = "0A\u0014\u0010,\u0014h\u001f\u0011\u001cTԛ\u000eAL[&Gp\u0006\u0007\ri{";
      f8762[17] = "m8:(b\u0015mh<z\u0019\u00136=&\nt\u0000\u0019.#?t\u001a.\u0018>#e\u0011\"/Yzf\f#)<$\"\u0018cS";
      f8762[18] = "^\f\u001d^@9\u0006R\u0018R8ȏ`\fE\u0015Jj\u001eK\u000eC\u0005V";
      f8762[19] = "\u0002{;\fb1]/im`d\u0016&\u0013\nl`mziTr1\u0013=\"\u0002=\r";
      f8762[20] = "~c\u0015\u0012z992\u001c\u0017B0*pa\u0012(2#\f\u001f\u001bs/'5N\u001b%-Gc\u0018\u0018#={<LJB";
      f8762[21] = "Ob\u001f\u0002M\u0003\raX\u0013q\u0001\u0019o$\u0010\u0000%\u0013\u007f\n}M_Ma[\u0003\n\u0014\u001b.g";
      f8762[22] = "DHZPnG\u0000\u0010I\u0014\nΉy\u0015\u0006\u0011x\u0015\u0007RMG7)CI\u0006Xj\u0010\u0012IPZ\nFDJVJ6\u0019\u0010\u00187";
      f8762[23] = "\u000f[/\u0007i%E\u0003l\r\u000ee4\tn\u0005o+\bV:W\u000e&\t\u00052\u00042y]WS";
      f8762[24] = "\u0004]U3X:C\f\\6`5=\f\n4\t:ZCZ>\u001e\\\u0003]\u000b3\u0006;L\r\u0001$`";
   }
}
