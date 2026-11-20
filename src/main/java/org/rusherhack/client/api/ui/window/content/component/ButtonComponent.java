package org.rusherhack.client.api.ui.window.content.component;
import org.rusherhack.*;

import java.util.function.Predicate;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.interfaces.INamed;
import org.rusherhack.core.setting.Setting;

public class ButtonComponent extends WindowContent implements INamed {
   public String f980;
   public Runnable f981;
   public double f982;
   public Predicate<ButtonComponent> f983;
   public boolean f984;
   public double f985;
   public static Object[] f987 = new Object[28];
   public static String[] f988 = new String[28];

   public boolean isEnabled() {
        return false;
    }

   public void setAction(Runnable var1) {
        
    }

   @Override
   public String getName() {
        return null;
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   public boolean isPressed() {
        return false;
    }

   public void setHeight(double var1) {
        
    }

   @Override
   public double getWidth() {
        return 0.0;
    }

   public void setWidth(double var1) {
        
    }

   public void setPredicate(Predicate<ButtonComponent> var1) {
        
    }

   public void setPressed(boolean var1) {
        
    }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
        
    }

   public void onClick() {
        
    }

   @Override
   public double getHeight() {
        return 0.0;
    }

   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
   }

   public void setLabel(String var1) {
        
    }

   public ButtonComponent(Window var1, String var2, Runnable var3) {
      this(var1, var2, -1.0, -1.0, var3);
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      return false;
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      return false;
   }

   public ButtonComponent(Window var1, String var2, double var3, double var5, Runnable var7) {
    }

   @Override
   public boolean charTyped(char var1) {
      return false;
   }

   static {
      m194();
   }
   public static void m194() {
      f987[0] = "\u0006z60S\"\u001a`4lI6\nc\u007f}M>\ff%0@'\u0000&$w\u000f \u0000f5qVy\ng?jD9\u001d&2qL'\u0006f4pUy+}%jN9*g<nN9\ff%";
      f987[1] = boolean.class;
      f988[1] = "java/lang/Boolean";
      f987[2] = "\u001bPW85\u001f\u0010_FwH\u0007\u0003XO>";
      f987[3] = double.class;
      f988[3] = "java/lang/Double";
      f987[4] = "A.ads\u0001J!p+\u000f\u0018E!vg1\b";
      f987[5] = "\u001bI\u00154G_\u0005A\u000f{\u000f_\u001fK\u0017<\u0006D_x\u00110\rC\u0012I\u00170";
      f987[6] = "\u0018N)Rz2\u0004T+\u000e`&\u0014W`\u001fd.\u0012R:Ri7\u001e\u0012;\u0015&0\u001eR*\u0013\u007fi\u0014S \bm)\u0003\u0012-\u0013e7\u0018R+\u0012|i#Y6\bK(\u001aL!\u0012m)\u0003";
      f987[7] = "U\u001f\u0005[\u0019\n|&\u0019A\u001bVf2\tBPGa!\u000f\u0007\rAz'\u0003G\u0019\n]6\u001e]\u0017Jih";
      f987[8] = "j%0$_Ev?2xEQf<yɾ";
      f987[9] = void.class;
      f988[9] = "java/lang/Void";
      f987[10] = "Rdy^D^Ykh\u0011%PR`lK";
      f987[11] = "a#6hYn}944Czm:\u007f%Grk?%hJkg\u007f$/\u0005lg?5)\\5m>?2Nuz\u007f\u0006/E\u007fa&\u0012)Eok?%";
      f987[12] = "(\u0013>K\u000f\u000e4\t<\u0017\u0015\u001a$\nw\u0006\u0011\u0012\"\u000f-K\u001c\u000b.O+\u0000\u0013\u001f\"\u0013w\u0003\u0012\u00153O\u0010#\u0012\u001533<\u000b\u0019\u001e5\u0004+";
      f987[13] = "\u00194\u0014@\u0013\u001eE9B\brљ%bJ\n\n\u0012\u001e9^\rHr";
      f987[14] = "\r.SM\tCSyGvŧ{\u0007+\u0002\u0017\u0003\u0001O.\f\u0011";
      f987[15] = "3kXx\u001d\u001em<LC\u0016@H5V(\u0012&=/\t1\u001fBj>Z9q";
      f987[16] = "&\"\tVP=xu\u001dmU\u0005+|\u0005\u001cGuwt\u001d\r<8r{\u0017\u0016Ldzc\u0006m";
      f987[17] = ",#o\u001c]z*faH2x~\"LBTkI3dI_m~$\u0002\u0015Qu-2xNOqx^";
      f987[18] = "vN3#S*(\u0019'\u0018ě\u0012|KbyYh4Nl\u007f";
      f987[19] = "&\u0005Hz_Z}\u001bL/3O{\u001ad#U\\V\u000bK+S\\\u0016\\\u0015zRFl\u0014\u0010tT ";
      f987[20] = "6\t<\u0001\n_qIr\u0003i]p_\u0002R\u0017\u0019\u007fWf\u0005\u0006Jw9";
      f987[21] = "\u0007=J3\u000e%\u0001xDga)C\u0000@t\f2U,'0^vY&]x[x_@\u001d5_)^:U0Q/8y\u0018s\\.\u0004-At\u0004H";
      f987[22] = "]+\u0017E\u0017Q\u0003|\u0003~\u0089iV!F\u0013\u0018\u0011\u0011a\b\u0011";
      f987[23] = "\u0005\u001fEh\u001c-[HQSվ\u0015\u000eWLjOp^YX>";
      f987[24] = "h3\u001a\u0012hY6d\u000e)ŷaa6\f\u0014b]5o\u000bL";
      f987[25] = "\u0003\u0013R8\u001b@X\rVmwU^\fkz\r[U\u001fog\u001bFSp\th\u000fY_\u001c\f\u007f\u001bH3J\u000f8\u0016\\I\u0002\n6\u0010:";
      f987[26] = "bx@\u0018]\u00042vTLb\u001d4qZ!]_8x_D\u001a\u000e<a&\u0018]\u0018dl\u001aL\u0004\u001f<\n";
      f987[27] = "G9\u001ea\u000et\u0019n\nZԐLNm\t9\u000e Kz\u001d(";
   }
}
