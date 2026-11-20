package org.rusherhack.client.api.events.render;
import org.rusherhack.*;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.Setting;

public class EventRenderEntity$Nametag extends EventCancellable {
   public enum Check { A }


   public int f480;
   public Text f481;
   public VertexConsumerProvider f482;
   public Entity f483;
   public MatrixStack f484;
   public static Object[] f486 = new Object[24];
   public static String[] f487 = new String[24];

   public Text getDisplayName() {
        return null;
    }

   public Entity getEntity() {
        return null;
    }

   public MatrixStack getMatrixStack() {
        return null;
    }

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   public void setDisplayName(Text var1) {
        
    }

   public int getPackedLight() {
        return 0;
    }

   public EventRenderEntity$Nametag(Entity var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5) {
    }

   public VertexConsumerProvider getBuffer() {
        return null;
    }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   static {
      m122();
   }
   public static void m122() {
      f486[0] = "=xZvE{!bX*_o1a\u0013;[g7dIvV~;$X.R`&y\u0013*R`6oOvrx7dI\nR`6oO\u001dYz;~D|yo?oI9P";
      f486[1] = "\u0002y\u0014,X1\u0002y\u0003pT>\u00182\u0003nT+\u001fCT7\fo";
      f486[2] = int.class;
      f487[2] = "java/lang/Integer";
      f486[3] = "wyv\u000b[\nwyaWW\u0005m2aIW\u0010jC0\u0010\u0000R";
      f486[4] = "8\u0017TUS-8\u0017C\t_\"\"\\C\u0017_7%-\u0011I\u0007s";
      f486[5] = "G\t\u001b^QgG\t\f\u0002]h]B\f\u001c]}Z3[E\u00049";
      f486[6] = "{Fh\u0013d\"g\\jO~6w_!^y%q\u001ajKs9`\u001a|Iw0q\u001a\\Iw0q";
      f486[7] = "H|\u0015\u0016*KTf\u0017J0_De\\[7LB \u0001],JN`\u0015\u0016\u000b[Sz\u001bV?";
      f486[8] = " \\\r\u001cSbU|\u0006\u0013B-(d\u0015\u0014Kd@";
      f486[9] = "!8@a5|=\"B=/h-!\t,+`+$Sa&y'dB9\"g:9\t=\"g*/Ua\u0002\u007f+$S\u001d\"g*/U";
      f486[10] = boolean.class;
      f487[10] = "java/lang/Boolean";
      f486[11] = "gMOu\u0014U{WM)\u000eAkT\u0006ȯ";
      f486[12] = void.class;
      f487[12] = "java/lang/Void";
      f486[13] = "%cfniy.lw!\bw%gs{";
      f486[14] = "fP[&.u;D\u0016Wƶ\u0016=RX:\u007f(nCU>";
      f486[15] = ")F;#-Q\u007fQl~LjOb\\/%U%N?y2\u0002x";
      f486[16] = "#oD{(^~{\t\nչ={o\u000fi}S(,Ke";
      f486[17] = "\u0003l,K8FQ,s\u0004\u0004Ջ?/j\u0004}S\u0007//Gb*";
      f486[18] = ":H\u0003@h\u001bg\\N1˒x`K@\u0001(\bg\r\nT";
      f486[19] = "*6/~$d$2n!MƯ\u0014m}#3{/o/.p\u001e";
      f486[20] = "}\ni5 D \u001e$DЍ'&H'5a@xIv.";
      f486[21] = "M;\\o\u0017)\u0010/\u0011\u001eOJ\u00138C{\u001c(Q;Ja&uV/K.D7U&Q\u001e";
      f486[22] = "`0wP\u000f6=$:!ʜU8\"~J\u00065h*jA";
      f486[23] = "\b|j|M\u007f\u0006x+#$ð6'8!Z`\r%j,\u0019\u0005\u0006`/']j\\&mm$";
   }

}
