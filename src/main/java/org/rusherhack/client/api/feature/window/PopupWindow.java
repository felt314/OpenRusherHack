package org.rusherhack.client.api.feature.window;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.List;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.view.SimpleView;
import org.rusherhack.client.api.ui.window.view.SimpleView$Alignment;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.setting.Setting;

public abstract class PopupWindow extends Window {
   public List<WindowContent> content;
   public SimpleView view;
   public static Object[] f752 = new Object[26];
   public static String[] f753 = new String[26];

   @Override
   public WindowView getRootView() {
      return this.view;
   }

   @Override
   public boolean shouldSerialize(boolean var1) {
      return false;
   }

   public void addContent(WindowContent var1) {
      this.content.add(var1);
   }

   @Override
   public void onClose() {
      RusherHackAPI.getWindowManager().closePopup(this);
   }

   public PopupWindow(String var1, Window var2, double var3, double var5) {
    }

   static {
      m157();
   }
   public static void m157() {
      f752[0] = "4\tLd~+(\u0013N8d?8\u0010\u0005)`7>\u0015_dm.2UM/m*.\tNd{75\u001fD=\"\u000e4\u000b^:[75\u001fD=";
      f752[1] = "\u0013\r\rUe{\u000f\u0017\u000f\t\u007fo\u001f\u0014D\u0018{g\u0019\u0011\u001eUv~\u0015Q\u001f\u00129y\u0015\u0011\u000e\u0014` \n\u0016\u000f\f9]\u0015\u0012\u001a\u0017rX\u0015\u001a\u001d";
      f752[2] = "BGd\u000e\fX\\O~AnD[R";
      f752[3] = "?\u007f\u0016\u00101\u00044p\u0007_P\n?{\u0003\u0005";
      f752[4] = boolean.class;
      f753[4] = "java/lang/Boolean";
      f752[5] = "j\u001f6\u0006T9v\u00054ZN-f\u0006\u007fKJ%`\u0003%\u0006G<lC\u0003]U$`\u001f\u0019IE'D=\u0018";
      f752[6] = "\u0013\u000eR\u0014|I\u000f\u0014PHf]\u001f\u0017\u001bYbU\u0019\u0012A\u0014oL\u0015RFC}H\u0019\u0011\u001bsYU\u0012\u0018ZMC]\u0012\u001dR_|";
      f752[7] = void.class;
      f753[7] = "java/lang/Void";
      f752[8] = "1vp\u001bY{-lrGCo=o9VD|;*dP_z7jp\u001bxk*p~[L";
      f752[9] = "eP~@0W\u0010puO!\u0018mhfH(Q\u0005";
      f752[10] = "$\f\"\u0005$=8\u0016 Y>)(\u0015kH:!.\u00101\u000578\"P#N7<>\f \u0005!!%\u001a*\\x\u001f\"\u0010!D!";
      f752[11] = int.class;
      f753[11] = "java/lang/Integer";
      f752[12] = "\u0000\u001d\u0003\u001ftl\u001c\u0007\u0001Cnx\f\u0004JRjp\n\u0001\u0010\u001fgi\u0006A\u0011X(n\u0006\u0001\u0000^q7\u0019\u0006\u0001F(J\u0006\u0002\u0014]cO\u0006\n\u0013\u0015Gu\u0006\b\n\\cw\u001b";
      f752[13] = "Np\u0007O^GRj\u0005\u0013DSBiN\u0002@[Dl\u0014OMBH,'\rCP@n\u0013";
      f752[14] = " D\u0003\u0002\u0015` D\u0014^\u0019o:\u000f\u0014@\u0019z=~D\u001dH";
      f752[15] = "m=T\rIZ#\"RQ9ξSsIU\u0005McuD\u001c] nvV\rX[7pBS9";
      f752[16] = "KQsoC\f\bJ.\fD\u0016\u0018LL5S\u000e\tKr<B\u001aE";
      f752[17] = "i3\u0004G\n-0=JBqy<84\u0002\u0017-2iKU\u0015!kT\u000fT\u0003t15XA\u001d!P";
      f752[18] = "=YF<*;;OP6X:kCw->9a@m%><iRRLd7\u007f\u000eF|id8E(";
      f752[19] = "bi.f\b\u00026!\"vnԙ_.kn^\u0018%{j5\u0002x";
      f752[20] = "Bb0[\u000el\u00154m\u0005sn\u0018\u0005<Z\rw\rcj\u0014M1";
      f752[21] = "*Y%b\u001dldF#>mѫ\u0014\u00178:Q{$\u00115s\t\u0016";
      f752[22] = "\u0005#a3\u0007\nU+8mb#x\u000f^\u001e8h\u0005#a3\u0007\nU+8m";
      f752[23] = "E,64?L\u00067kW-P\u001d2d1:7B)9(=\n\u001b'w-";
      f752[24] = "\u0016p\u0007B! \u001fa\u0013\u000eYeBe7Z8qI|\u0013X%\u001e\u001fs\u001d^<|O{D\u0000Y#\u0015`\u001e_\"z\u0013t@>";
      f752[25] = ">N?Gc(3\u001dx\f\rsfK=\u001bU\u007fzQ>v3z=O?\rpa`,{LtxcW\"J`&\u0002";
   }

   public PopupWindow() {}
}
