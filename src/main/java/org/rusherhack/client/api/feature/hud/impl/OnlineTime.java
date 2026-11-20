package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.client.api.feature.hud.TextHudElement;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
public class OnlineTime extends TextHudElement {
   public Timer f5357;
   public static long f5358 = Class066.m4320(-3589247995813677948L, 6819456842093525650L, MethodHandles.lookup().lookupClass()).m4325(116926265327890L);
   public static String[] f5359;
   public static String[] f5360;
   public static Object[] f5362 = new Object[41];
   public static String[] f5363 = new String[41];

   @Override
   public String getText() {
      return "Online for " + (Globals.mc.player != null ? this.m10967(this.f5357.getTime()) : "UNKNOWN");
   }

   public String m10967(long var1) {
      long var5 = TimeUnit.MILLISECONDS.toHours(var1);
      var1 -= TimeUnit.HOURS.toMillis(var5);
      long var7 = TimeUnit.MILLISECONDS.toMinutes(var1);
      var1 -= TimeUnit.MINUTES.toMillis(var7);
      var1 = TimeUnit.MILLISECONDS.toSeconds(var1);
      return var5 + " hours, " + var7 + " minutes, " + var1 + " seconds";
   }

   public OnlineTime() {
      super("OnlineTime", false);
      this.f5357 = new Timer();
   }

   @Subscribe(
      stage = Stage.PRE
   )
   public void onLoadWorld(EventLoadWorld var1) {
      if (Globals.mc.player == null) {
         this.f5357.reset();
      }
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      Packet var5;
      if ((var5 = var1.getPacket()) instanceof GameMessageS2CPacket
         && ((GameMessageS2CPacket)var5).content().getString().equalsIgnoreCase("Connected to the server.")) {
         this.f5357.reset();
      }
   }

   static {
    }
   public static String m221(byte[] var0) {
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
   public static void m273() {
      f5362[0] = "vKEhT@jQG4NTzR\f˕";
      f5362[1] = "fI\u0015\u0003+\u001czS\u0017_1\bjP\\N6\u001bl\u0015\u0007Y0\u0005z\u0015&D4\f{";
      f5362[2] = "Y%^2P\u0004E?\\nJ\u0010U<\u0017ɨ";
      f5362[3] = void.class;
      f5363[3] = "java/lang/Void";
      f5362[4] = "\u0001co9\u000b3\u001dyme\u0011'\rz&t\u0015/\u000b\u007f|9\u00186\u0007?O{\u0016$\u000f}{";
      f5362[5] = "<m6|\u007f\u0019<m! s\u0016&&!>s\u0003!Wqc\"";
      f5362[6] = "-/?;4,-/(g8#7d(y860\u0015|!o";
      f5362[7] = "yv\fbs\byv\u001b>\u007f\u0007c=\u001b \u007f\u0012dLOx-X";
      f5362[8] = "V0\u0011)>\nV0\u0006u2\u0005L{\u0006k2\u0010K\nW2eR";
      f5362[9] = ")n_>w\b5t]bm\u001c%w\u0016Ȗ";
      f5362[10] = int.class;
      f5363[10] = "java/lang/Integer";
      f5362[11] = "m\u001b^\u001d&qq\u0001\\A<ea\u0002\u0017P8mg\u0007M\u001d5tkGLZzsk\u0007]\\#*U\u0000WW;sT\u0000\\D\u001cel\rUV&Fc\u001a\\";
      f5362[12] = "XTE^/vS[T\u0011Rn@\\]X";
      f5362[13] = "[\u001eFl|QG\u0004D0fEW\u0007\u000f!bMQ\u0002UloT]BD4kJ@\u001f\u000f,kPC\u0003S) aB\tO6^EW\u0007D6";
      f5362[14] = "\u0015>B*r\t\u0015>Uv~\u0006\u000fuUh~\u0013\b\u0004\u00041&V";
      f5362[15] = boolean.class;
      f5363[15] = "java/lang/Boolean";
      f5362[16] = "o\t@W\u000e\u001fq\u0001Z\u0018C\u0005k\u000bCDR\u000fk\u001c\u0018bI\u0007`=X_T";
      f5362[17] = long.class;
      f5363[17] = "java/lang/Long";
      f5362[18] = "\nx_aPl\u0016b]=Jx\u0006a\u0016,Mk\u0000$[ Ot\u0004d\\aCk\u0002\u007fU*LmKYL=Kw\u0002IY?Vl\u0017o";
      f5362[19] = "^\"\u0005b-\rU-\u0014-L\u0003^&\u0010w";
      f5362[20] = "\u0013\u0018*IRzH\u00138Vi\u007fH\u000f+\u007fV*\u0014jnM\u0007%^TnHPf/";
      f5362[21] = "7\u0002.\u0019`59I\u007f\u007fЮKiP?\rs!oY#\u001d";
      f5362[22] = "-b\\ak~ 3\u001c>VP\u0000^}\\Vz&xA:8ww8\u001e";
      f5362[23] = "yC\u0015>+a=G\u0016?@ɗG\u0005\u000eg,\u007f}Q\u001d>9\u000e";
      f5362[24] = "H>~\u0013%{\u0017<#KT:x3hK&&\u00052|V1\u0016Hq|_dkIeaHT";
      f5362[25] = "\b[Z\nA\\\u0006\u0010\u000blʳ\"\u0005\u001fM\u0012T\u001e\b\u001aG\n*\u0012\u001d\u0004D\\W\u0013\t\u0019Sl";
      f5362[26] = "\r`M\u001b\u0010l\u00001\rD-~\u0000DW\u0019Ic\u001c\u0001\\\u0000V|\u0019=Q\u0005\\dgkK\u0006S|[fN\fK\u0002";
      f5362[27] = "\u00100*\u001a\u0001\n\u001e{{|\u0003tM3w\u0004V\u0015\u000ey\"LjNM8>@\u000b\r\u0007mv|";
      f5362[28] = "j68+M:`a2br>6-\u0018r\u001926-@*\rk:2$}M6kQ";
      f5362[29] = "FU\u0003mN5K\u0004C2s'Ko\u0015`\u0014=@Oxa\u000e RJDl\u000b*J4\u0012v\b%R\b\u001fs\u0002=,";
      f5362[30] = "=!hS\u0019\n;(tCa\u001ai1x]aZf tY\u000fY5+p!";
      f5362[31] = "QZ\u00070/\u001f\\\u000bGo\u00124z}!\n_*;Q\u001d-tLU\\Lm+";
      f5362[32] = ".5wRp\u000f#d7\rM\u001d#\u0011mR0\u001d)/\f^0\u001a:*0S5\u0010\"TfI6\u001f:hkL<\u0007D";
      f5362[33] = "6\u000fd{;A<R$?Q\u001ff?&~m\u0016nS,a0\u0015";
      f5362[34] = "(k8\bp7(noK\u0001fxr\rE{hsaV\tsog>+\bgrp\u000e";
      f5362[35] = "\u001eR\u001apSs\nR\u0001h8 u\u001d\ngJ<\b\u001c\u001ez]\fE_\u001es\bqDK\u0003d8";
      f5362[36] = "?W\tt\u001d\u001e5HTw~\u001ceFQt)K;\u0011\t\u0018BB9\u0017\ns\u001c\u0010h\u001a";
      f5362[37] = "o.\u0005\u001fx?b\u007fE@E\u0014D\u000b:8\u001e\u001cN\b85\u001eQo.\u0005\u001fx?b\u007fE@";
      f5362[38] = "F!3,pNG5.;@^\u000f.<:;r\u001952$-x\u001f(8^pA\u0010!e#qU\r6U7#X\u000em(0}\t\rS";
      f5362[39] = "E0I?SDHa\t`nVH\u0011U$\u0014Q/;O\"\u0010T\u00136J(\b*E,I'\u0010\u0016H)C?n";
      f5362[40] = "\nC\u0011RnW\fJ\rB\u0016R^T0AsP3B\u0011[hC\u000fO\u0014Qp=";
   }
}
