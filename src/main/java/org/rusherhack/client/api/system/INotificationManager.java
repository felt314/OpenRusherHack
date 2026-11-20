package org.rusherhack.client.api.system;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import org.rusherhack.Class066;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.core.logging.ILog;
import org.rusherhack.core.notification.NotificationType;

import org.rusherhack.command.send;
public interface INotificationManager extends ILog {
   long f859 = Class066.m4320(-198238571271529143L, -9078663809317313839L, MethodHandles.lookup().lookupClass()).m4325(34581509440974L);
   Object[] f860 = new Object[32];
   String[] f861 = new String[32];

   @Override
   default void warn(String var1) {
      this.send(NotificationType.WARNING, var1);
   }

   void send(NotificationType var1, String var2, String var3, int var4);

   void chat(Text var1, int var2, Style var3, int var4);

   default void send(NotificationType var1, String var2) {
      this.send(var1, "", var2);
   }

   default void send(NotificationType var1, String var2, int var3) {
      this.send(var1, "", var2, var3);
   }

   default void send(NotificationType var1, String var2, String var3) {
      this.send(var1, var2, var3, var1.getTypeID());
   }

   default void chat(String var1, Style var2) {
      this.chat(Text.literal(var1).fillStyle(var2));
   }

   default void chat(String var1) {
      this.chat(var1, Style.EMPTY);
   }

   @Override
   default void debug(String var1) {
      this.send(NotificationType.DEBUG, var1);
   }

   @Override
   default void error(String var1) {
      this.send(NotificationType.ERROR, var1);
   }

   boolean shouldNotifyModuleToggles();

   default void chat(Text var1) {
      int var5 = RusherHackAPI.colors().primaryColor().getRealValue().getRGB();
      this.chat(var1, var5, Style.EMPTY.withColor(var5), 0);
   }

   @Override
   default void info(String var1) {
      this.send(NotificationType.INFO, var1);
   }

   public static void m194() {
      f860[0] = "\u0005mXX[Y\u0019wZ\u0004AM\tt\u0011\u0015EE\u000fqKXH\\\u00031L\u000fZX\u000fr\u0011?gC\u001evY\u001fJM\u001evP\u0018dM\u0004~X\u0013[";
      f860[1] = "Uy(jy8Uy?6u7O2?(u\"HCnq\"`";
      f860[2] = void.class;
      f861[2] = "java/lang/Void";
      f860[3] = "'ij$^\u0013,f{k#\u000b?ar\"";
      f860[4] = "\u0005=H\u000e>X\u0005=_R2W\u001fv_L2B\u0018\u0007\t\u0012f\u0001";
      f860[5] = "<%~3{X<%iowW&niqwB!\u001f8(.\u0002";
      f860[6] = ">#tj5$\"9v6/02:='+84?gj&!8\u007f`=4%4<=\u0007(=>#`";
      f860[7] = "\u001cg272\u000b\u0000}0k(\u001f\u0010~{z,\u0017\u0016{!7!\u000e\u001a;&|4\n\u001a{27\u0003\u0011\u001fz'J%\n\u0007|;~";
      f860[8] = int.class;
      f861[8] = "java/lang/Integer";
      f860[9] = "\bRcq\u001c\u0001\u0014Ha-\u0006\u0015\u0004K*<\u0002\u001d\u0002Npq\u000f\u0004\u000e\u000eV*\u001d\u001c\u0002RL>\r\u001f&pM";
      f860[10] = "?Q1\u007fc%\"Di]\"(:B";
      f860[11] = "J\u001dPeE2V\u0007R9_&F\u0004\u0019(X5@AY.C.C\u0006T*C.J\u0001\u0019\u0005X3L\t^(V3L\u0000Y\u001fN7@";
      f860[12] = "N0:\u00019DE?+NXJN4/\u0014";
      f860[13] = "I\u0017\u001d\u0019\b\u0010E\u0010\u0010xR\tN\u0010}\u0000K\u0017M\u001d\u001d\u0006[\u0006'U\f\u0017\u0004Y\u001dP\u0003\u001eVi";
      f860[14] = "\u0010{;_G\u0011\u0010&zM!\u0002M6YMY\u0000a\u0006\u0005\u0002\u001aV\u0019z5^K\u0003NJ";
      f860[15] = "xGe\u007f\u0005|x\u001a$mcM\u0012,\u001cFc0yH8z\u001f0$\t*";
      f860[16] = "\u00163:\u0002\u00167\u0012la\fu?P08\u001b\u000f6a69\u0015\u000fG\u0017hg\u001eO%J+7\u0002u";
      f860[17] = "6?(b1qw()xTx`9#e8J6{z9e\u001d3~x;d-o/-lT&w.#g8g`/9\u0002";
      f860[18] = "[Z/4a)W]\"U;0\\]O-\"._P/+2?5\u001ftni`\u0005C%;>P\u000e[$55<OL%/Pn\u000e\u001ave`2_O!Ui!Z\u001c\u007fol.SNO";
      f860[19] = "svED\u0019\u0011 \u007f\u0005\u0013`\u000b*w\u0012P\u001b`qq\u0012Z\u0003\u0010u.IT`";
      f860[20] = "}\u0005d0`Jq\u0002iQ*^u\u0012\u0004a`\rp\u0018xa=Lb~>64\ttF400\r\u0013Dc4kT+Ne0o3-E?ha\u0003q\u0014j?Q\nb\u00119ak\u000fm\u0018kQ";
      f860[21] = "\t\u000b])\u0006\nH\u001c\\3c\bS\u001cR%4\\\u000eJ\bqc]H\u001aV,\u000f\u001c_\u001bL";
      f860[22] = "0/xTl\u0013<(u5&\u000788\u0018\u0005lT=2d\u00051\u0015/T\"R8P9l(T<T^miZ`ZdhfS2j";
      f860[23] = ";\u0016&aQmfUv}k`kSF`\u0002kXFxp\u0006\u000f9Ng|\u0005dm\u0013qmk";
      f860[24] = "\u0012\u001bJUG#\u0012F\u000bG!\u0013o`)y!o\u0013\u0014\u0017P]oNU\u0005";
      f860[25] = "O\u001boc\u0012[I\u000b~\t\u0006VK\tve4\u0007\fU.1c\u0001P\f+n[\u000bV\b/\tYE[\u0000od\u0007AZT\u0011";
      f860[26] = "yB4nZ)'F5:$!.@8`H\u0013y\u0003f6\u001aDxF3gA(9Q2}$~=P1yI 9Qe\u0007";
      f860[27] = "<0}|<\u001f07p\u001dv\u000b4'\u001d-<X1-a-a\u0019#K'zh\\5s-|lXRqzx7\u0001j{||3fk:r =\\n5{r\r";
      f860[28] = "k\u001e\u001doS$?C\u000b~= 9\u0003<QwOjD]'\r\u007f6\u0015\bp=";
      f860[29] = "}\u0002Dc]\u0007q\u0005I\u0002\u0007\u001ez\u0005$8\u000b\u001b)\u001e\u001c2\r\u001f-y\u001fx\u0007\u001ev\u0015^o\u0006\u0004\u0013@UmQN)EZd\u0003~";
      f860[30] = "@\u0007l/Um@Z-=3N9l\u0014\ru^p\u0006crPw\f\u0006>3B";
      f860[31] = "\u0017\u000f:G2\u0000\u0017R{UT=apC$dM\u0019]bXd\u0010XO";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m194();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
