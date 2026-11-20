package org.rusherhack;

import com.google.gson.JsonObject;
import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.IPCListener;
import com.jagrosh.discordipc.entities.Packet;
import com.jagrosh.discordipc.entities.User;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.core.notification.NotificationType;

import org.rusherhack.command.send;
import org.rusherhack.client.api.feature.module.impl.misc.Enum186;
public class Class081 implements IPCListener {
   public static long f2115 = Class066.m4320(-7555668817833682949L, 1997724482363254581L, MethodHandles.lookup().lookupClass()).m4325(85901278781958L);
   public static String[] f2116;
   public static String[] f2117;
   public static Object[] f2119 = new Object[24];
   public static String[] f2120 = new String[24];

   public void onActivityJoinRequest(IPCClient var1, String var2, User var3) {
   }

   public void onPacketReceived(IPCClient var1, Packet var2) {
   }

   public void onDisconnect(IPCClient var1, Throwable var2) {
      Class170.f3364.m7110().send(NotificationType.ERROR, "Discord Rich Presence disconnected");
   }

   public void onActivityJoin(IPCClient var1, String var2) {
   }

   public void onPacketSent(IPCClient var1, Packet var2) {
   }

   public void onClose(IPCClient var1, JsonObject var2) {
   }

   public void onReady(IPCClient var1) {
        
    }

   public void onActivitySpectate(IPCClient var1, String var2) {
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
   public static void m122() {
      f2119[0] = "/,.F\u0014\u000b+1,\u001b\u0016D(*0\u000b\u0011\u0018(*3\u000bP#\u001c\u0000\u0000\u0004\u0017\u000f\"7";
      f2119[1] = "d\u0017\"/\u001e+`\n r\u001cdc\u0011<b\u001b8c\u0011?bZ/i\f&u\u001d/tV\u001dh\u0017\"W\n*r\u0011$d\u001d";
      f2119[2] = void.class;
      f2120[2] = "java/lang/Void";
      f2119[3] = "W')L?pS:+\u0011=?P!7\u0001:cP!4\u0001{tZ<-\u0016<tGf\u0011\u00110c";
      f2119[4] = "1T\u0011r\u000eh:[\u0000=sp)\\\tt";
      f2119[5] = "y_un@CeEw2ZWuF<ī";
      f2119[6] = "+/6O&;754\u0013</'6\u007f\u0558";
      f2119[7] = "QM*LRWUP(\u0011P\u0018VK4\u0001WDVK7\u0001\u0016S\\V.\u0016QSA\f\u0015\u000b[^bP\"\u0011]XQGc M_^F\"\u0010";
      f2119[8] = "k3\u0002;e\tw)\u0000g\u007f\u001dg*Kv{\u0015a/\u0011;v\fmo\u0016ld\ba,K\\Y\u0013p(\u0003|t\u001dp(\n{Z\u001dj \u0002pe";
      f2119[9] = "IcOy\u0016\u0011UyM%\f\u0005Ez\u00064\u000b\u0016C?F8\u0010\r@xK6\u0010\rI\u007f\u0006\u0019\u000b\u0010OwA4\u0005\u0010O~F\u0003\u001d\u0014C";
      f2119[10] = "9 \fRWN%:\u000e\u000eMZ59EǶ";
      f2119[11] = "(.\u0007H\tn44\u0005\u0014\u0013z$7N\u0005\u0017r\"2\u0014H\u03a2";
      f2119[12] = "\u0010$,/\u0001X\u001b+=``V\u0010 9:";
      f2119[13] = "\t\u001f./8\u0010\f\u0006?pQRY\u0005.No\u0019F\u0018s57LD\u0011Bu=E\u000e\u0012 >)\u0014Tc{-8E\u0005\u0012/'6N4";
      f2119[14] = "\u0006S\u0013IS!^\u0006\u0011@b\u0017b9&hbd\b\u0011\u001a\u0003\u0019<]\u0013\u0013";
      f2119[15] = "?q\u001a*,G:9\u0017G-\u001a`,0&=\u0017^:\u0007<;\u0011m-j~g\u0007;.V--\u001eb@S$?\u001b71\u0007.1\u0010\u0006";
      f2119[16] = "yP*ra\u0011=K6']\u0010.V\u0001*8\u0012C\u0011+/g\u000e!Z?~=\u007f";
      f2119[17] = "O8Ou\u00062\r#\u0011a7ʑ\u007fi\u001ek\r}\u001d\"\n:W\fD>\u001e=Fn\u000f*Og7";
      f2119[18] = "B\u0018\u000e_BNGP\u00032W\u0013\u0007b\u0003HB\u0013\u001dU#IU\u0004{\u0013\u0004_\tB\u0015W\u001fC\\~";
      f2119[19] = "fbDL\u0004q=.\u0007DdΪ])\r\u0012\u0003t8rAQ\u000b";
      f2119[20] = "\u007f5\n.\t@$yI&iǂDy\r(\u0004G$\u007f\u000bx\u0003%";
      f2119[21] = "]\"ct~+\u0004)qo\f,\u001dxmh\f\u007fQi4j0,\u001bpm\u0004";
      f2119[22] = "fa)Vz\u001c($>Z\u0001оYb~QqV4;uCj";
      f2119[23] = "m\ri!\u0001\u00075Xk(0=\u0015s\\Z\u000eL!F*!V\u0019#O";
   }
}
