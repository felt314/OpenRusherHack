package org.rusherhack.client.api.events.render;
import org.rusherhack.*;

import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.world.World;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderer3D;

public class EventRender3D extends EventRender {
   public Camera f454;
   public IRenderer3D f455;
   public static String[] f456;
   public static Object[] f458 = new Object[16];
   public static String[] f459 = new String[16];

   public EventRender3D(IRenderer3D var1, MatrixStack var2, Camera var3, float var4) {
      super(var2, var4);
      this.f455 = var1;
      this.f454 = var3;
   }

   public World getLevel() {
      return Globals.mc.world;
   }

   public IRenderer3D getRenderer() {
        return null;
    }

   public Camera getCamera() {
        return null;
    }

   public static void m1031(String[] var0) {
      f456 = var0;
   }

   public static String[] m1032() {
      return f456;
   }

   static {
    }
   public static void m157() {
      f458[0] = ",R\u0018N\bS0H\u001a\u0012\u0012G KQ\u0003\u0016O&N\u000bN\u001bV*\u000e\u001a\u0016\u001fH7SQ\u0012\u001fH'E\rN?P&N\u000b2\u001fH'E\rS>";
      f458[1] = "~\u007f\u0004u\u0019z\u000b_\u000fz\b5vG\u001c}\u0001|\u001e";
      f458[2] = "Mc{v\u007fc8Cpyn,E[c~ge-";
      f458[3] = void.class;
      f459[3] = "java/lang/Void";
      f458[4] = "z<s\fb\u0006f&qPx\u0012v%:A|\u001ap `\fq\u0003|`fG~\u0017p<:kB\u0016{*qPu\u0001&\n";
      f458[5] = "[\u0016?BHo[\u0016(\u001eD`A](\u0000DuF,\u007f]\u001d2";
      f458[6] = "O\u0010\u0006?$2S\n\u0004c>&C\tOr:.E\f\u0015?77IL&}9%A\u000e\u0012";
      f458[7] = "&\u000eva\u001d\u0000&\u000ea=\u0011\u000f<Ea#\u0011\u001a;41~@";
      f458[8] = "D9{[=fD9l\u00071i^rl\u00191|Y\u00039Fh";
      f458[9] = ":WGp}&1XV?\u001c(:SRe";
      f458[10] = "=uT \r+2uU\\ҐEd}\u00121\u0019\u007f4>\u000eb";
      f458[11] = "_\n5y\\EP\n4\u0005u+\u0004\u0003it\u000b\u001b\rJq:3";
      f458[12] = "~b\b\u0011SX{b\u001b\u0016iV)\u0004MJ\u0019P)k\u0016K\n\\";
      f458[13] = "Z!\u0006\u0006E\u0014U!\u0007zϠz\u0002 \\JZ\u000bB*O\u0003";
      f458[14] = "jt,\u0016\tk1u?\u001abj6%8\u00195=ixcu_`(35\u0016X>h!";
      f458[15] = "\u0004tIF,\u0016\u000btH:Ηx_}\u0015K{HV4\r\u0005CB\u001en\u000b\u0006&\u0006Xi\u0019:";
   }
}
