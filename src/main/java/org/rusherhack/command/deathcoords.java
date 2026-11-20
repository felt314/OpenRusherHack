package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.text.DecimalFormat;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.event.subscribe.Subscribe;

public class deathcoords extends Command {
   public Vec3d f7483;
   public DecimalFormat f7484;
   public static long f7485 = Class066.m4320(-7129230329284531491L, -4882511368110541019L, MethodHandles.lookup().lookupClass()).m4325(271444481344739L);
   public static String[] f7486;
   public static String[] f7487;
   public static Object[] f7489 = new Object[34];
   public static String[] f7490 = new String[34];

   @Subscribe
   public void m14566(Event174 var1) {
      this.f7483 = Globals.mc.player.getPos();
   }

   @CommandExecutor
   public String m14567() {
      if (this.f7483 == null) {
         return "No deaths found";
      } else {
         Object[] var10001 = new Object[]{this.f7484.format(this.f7483.x), null, null};
         boolean var10005 = true;
         var10001[1] = this.f7484.format(this.f7483.y);
         var10001[2] = this.f7484.format(this.f7483.z);
         return String.format("You last died at X: %s, Y: %s, Z: %s", var10001);
      }
   }

   public deathcoords() {
      super("deathcoords", "Tells -K7-x/0=*=xu\u0013ou last died");
      this.f7484 = new DecimalFormat("0.00");
      String[] var10001 = new String[]{"death", null};
      boolean var10005 = true;
      var10001[1] = "deathpos";
      this.addAliases(var10001);
      Class170.f3362.subscribe(this);
   }

   static {
    }
   public static String m117(byte[] var0) {
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
   public static void m157() {
      f7489[0] = "\u0001\u001dr\u000b\u0007Z\u001d\u0007pW\u001dN\r\u0004;Ѯ";
      f7489[1] = "\u0013I=H~\u0010\u0013I*\u0014r\u001f\t\u0002*\nr\n\u000es{R ";
      f7489[2] = "\u0000>O\u0005`~\u001c$MYzj\f'\u0006Þ";
      f7489[3] = "`\"$cX~k-5,%fx*<e";
      f7489[4] = "\u007f\r\u0006UdAc\u0017\u0004\t~Us\u0014O\u0018z]u\u0011\u0015UwDyQ\u0014\u00128Cy\u0011\u0005\u0014a\u001aG\u0016\u000f\u001fyCS\u0010\u000f\u000fsZd7\u0000\u0015rXu\r#\u001aeQ";
      f7489[5] = "Zc&*H'/C-%YhNM&.]2:";
      f7489[6] = ",-SR;i#4Q\u001dQx%%HRy[)>HRa";
      f7489[7] = double.class;
      f7490[7] = "java/lang/Double";
      f7489[8] = "&0e\u0010.\u001b:*gL4\u000f*),Ɋ";
      f7489[9] = "}j\fP;}}j\u001b\f7rg!\u001b\u00127g`POJ`";
      f7489[10] = "q-+\u001a9+m7)F#?}4bW'7{18\u001a*.wq\u000bX$<\u007f3?";
      f7489[11] = "\u0015\u0016w3Sc\u0015\u0016`o_l\u000f]`q_y\b,0,\u000e";
      f7489[12] = "KG<\niEW]>VsQG^uGtBA\u001b>R~^P\u001b\u001eR~^Pw.W";
      f7489[13] = "-h6O6\u001b&g'\u0000W\u0015-l#Z";
      f7489[14] = void.class;
      f7490[14] = "java/lang/Void";
      f7489[15] = "\u0007P\u001e,a<\u001bJ\u001cp{(\u000bIWa|;\r\f\u001am~$\tL\u001d,R+\u001bV\u000bcp=+M\u0014or'\f";
      f7489[16] = "k+\u0001L_!\u001e\u000b\nCNnc\u0013\u0019DG'\u000b";
      f7489[17] = "\u001f\u0002Vc.\u001b\u0003\u0018T?4\u000f\u0013\u001b\u001fĦ";
      f7489[18] = "\u0019LGA\n>NR@,ĦD\u0011\u0011TCT;HPGG";
      f7489[19] = "\u0014\u0017\u000e^Z\u007f\u0017\u0014\u001fUbծ-JOM\u0010}S\u001fOI\u0006\u0005\u0017O\bG\u001a{BO\fQb";
      f7489[20] = "x\u001dQ-o>r\u0015B.Q.BV\u00012#z<\u0003\u000165\u0002xSF8)|-SB.Q";
      f7489[21] = "\u000fr;0wAZr?&\u000fQR7&+s?\u000fr;0wAZr?&\u000f\u0003\t|~35M\u000b&zB5\u0000M?;<`\u0000I)C";
      f7489[22] = "d\u0015\u0001:\u001e\u0019?\u0017\u0007>!\u0007)\u0000\u001c+[\u001d>\u0007gqH\u001bi\b\u000e=\u0010\u0002-j\u000e,EA5\u001b\u000e:B\u000eT";
      f7489[23] = "A2B\u001edu\u0016,EsL\u000fL(J\u0002jc\u0001-\u0010O";
      f7489[24] = "\u000e\u0003[\u0013`gN\u0010\u001a\u0010[h]\u0012\u0006\u001b7Z\t_[Gk\r\tQ\u0019\u0013drP\u0010\n\u0017[";
      f7489[25] = "I+\u001e<W1\u0010j\r8h \u0011y\u0005??wK)YSU\"Os_m\u0005*\u001dp";
      f7489[26] = "X~EA.6\u0001?VE\u0011'\u0000,^BFpZ|\u0003.,%^&\u0004\u0010|-\f%";
      f7489[27] = "VPb[TQ\r[<\u001c1N\u0002;<QVNS\u0000=\u0019V\u0015";
      f7489[28] = "`\u001e//L\u000f-\u001bub#\r;\u001c.7_ca\nt9\u001d]1\u0002&:#Yc\u001e9&]\fc\u001a/^";
      f7489[29] = "t|\u0018\u001e\u0003I#b\u001fs\u000b3{.M\b\u0012N}w\u001b\fb\ru'\u000f\u0003\u001f\u000b,q\u000bs";
      f7489[30] = "\f\u0018}\u0007L1\u0005^6\t6f\nL\u0004\tWf\u001dM6m\\o\u001bO4\u0013\tf\u0018MM\u0004Zk[A<\u0004Ll\u0014 ";
      f7489[31] = "W\fL/\u001e+\u000eM_+!:\u000f^W,vmU\u000e\t@\u001c8QT\r~L0\u0003W";
      f7489[32] = "eQR\u001aDfd\u0019RA~34\fQ\u0013)dj[\t\u007f@0h\u000e\u000e\u0015\u0000#)\r";
      f7489[33] = "f\u000eA\t!\u00047\u001b@\u000f\\Ӧ\fE_\u0006&\u0003i\u001e]\u0000\"";
   }
}
