package org.rusherhack.client.api.events.world;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.entity.Entity.RemovalReason;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.setting.Setting;

public class EventEntity$Remove extends EventEntity {
   public RemovalReason f530;
   public static Object[] f532 = new Object[17];
   public static String[] f533 = new String[17];

   public EventEntity$Remove(Entity var1, RemovalReason var2) {
    }

   public RemovalReason getReason() {
        return null;
    }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   static {
      m786();
   }
   public static void m786() {
      f532[0] = "\u0019?\u0000Fkd\u0005%\u0002\u001aqp\u0015&I\u000bvc\u0013c\u0014\rme\u001f#\u0000FJt\u00029\u000e\u0006~";
      f532[1] = "a#XEld\u0014\u0003SJ}+i\u001b@Mtb\u0001";
      f532[2] = "\u0015\u0012\u00025op\t\b\u0000iud\u0019\u000bKxql\u001f\u000e\u00115|u\u0013N\u0000mxk\u000e\u0013Klrw\u0016\u0004K^k`\u0014\u0014 uil\u000e\u0019AIxh\u0015\u0016\u0000";
      f532[3] = "}\u0016Y\u0007\u000baa\f[[\u0011uq\u000f\u0010ɝ";
      f532[4] = "svt/x?olvsb+\u007fo=bf#yjg/k:u*vwo$hw=ve8p`=D|/rpVo~#h}";
      f532[5] = "u;";
      f532[6] = "e\u0018p\u0010>}\u00108{\u001f/2m h\u0018&{\u0005";
      f532[7] = void.class;
      f533[7] = "java/lang/Void";
      f532[8] = "\u0002\u0011=i\u0010V\u001e\u000b?5\nB\u000e\bt$\rQ\bM?1\u0007M\u0019M)3\u0003D\bM\t3\u0003D\b";
      f532[9] = "*7\u00079-)*7\u0010e!&0|\u0010{!37\rB%yw`1\u001fv33\u001bgF%y";
      f532[10] = "u@|\u0002!\u001e~OmM@\u0010uDi\u0017";
      f532[11] = "FX<'\u0002_K\u000688l<!r\u0000y\u000bX\u0018Q;tU\\\u0007";
      f532[12] = "|6x\b]P.f%p՜n{rz\u0014VT5ff\u0014=";
      f532[13] = "\u0003l,\u0001\u007f^Yp.\u000b\u001cU:8s[u\u0006W|+Um<\u0000<r\r&QDd|\u0015\u001c";
      f532[14] = "Y\u0016BB\u0010$\u0007\u001dAJ!ήbCG\u0011@\"S\u001c_]DX";
      f532[15] = "\u0012\u0010a\u001a\u0000\u0013J@<b̟-\u0015Tc\u0006\u000b\u0017[@\u007f\u0006`\u0011[Nh\u0019\u001e\u0013\u0014T=b";
      f532[16] = "W4#`:|\r(!jYѥnd>c?r^1xo!";
   }
}
