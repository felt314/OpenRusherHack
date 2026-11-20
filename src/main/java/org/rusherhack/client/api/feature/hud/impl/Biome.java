package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.hud.TextHudElement;
import org.rusherhack.core.utils.StringUtils;

public class Biome extends TextHudElement {
   public static long f3379 = Class066.m4320(3300324711810809717L, 7888474871280139482L, MethodHandles.lookup().lookupClass()).m4325(38683760225623L);
   public static String[] f3380;
   public static String[] f3381;
   public static Object[] f3383 = new Object[28];

   public Biome() {
      super("Biome");
   }

   @Override
   public String getText() {
      String[] var10000 = ((String)Globals.mc.world.getBiome(Globals.mc.player.getBlockPos()).getKeyOrValue().map(var0 -> {
         return var0.getValue().toString();
      }, var0 -> {
         return "[unregistered " + var0 + "]";
      })).split(":");
      boolean var10003 = true;
      return StringUtils.toTitleCase(var10000[1]);
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
      f3383[0] = "\u0005H8|/)\u000eG)3R1\u001d@ z";
      f3383[1] = "uW\u007f6\u001b!\u0000wt9\nn}og>\u0003'\u0015";
      f3383[2] = "J\u001dzlK.J\u001dm0G!PVm.G4W'9v\u0010";
      f3383[3] = "K-y\u0016V?K-nJZ0QfnTZ%V\u0017?\u000b\bn";
      f3383[4] = "k(^\u0013C=w2\\OY)g1\u0017^]!a4M\u0013P8mt~Q^*e6J";
      f3383[5] = "k\u0007T\u0011\u0017Bk\u0007CM\u001bMqLCS\u001bXv=\u0013\u000eJ";
      f3383[6] = "6pI\u0004#\u001a?~JM`\u00114kEL'\r0mW\u0004;\u0001<s\no'\u0001=zV";
      f3383[7] = "|]5\u0014\u0016bbU/[^bx_7\u001cWy8z6\u001b[c\u007fS-";
      f3383[8] = "ih.7\u0015]bg?xtSil;\"";
      f3383[9] = "J\u0011y_\u0013\bJ\u0011n\u0003\u001f\u0007PZn\u001d\u001f\u0012W+;IFQ";
      f3383[10] = ",_Fx^a,_Q$Rn6\u0014Q:R{1e\u0004e\u000b";
      f3383[11] = "yu\u0004E8 eo\u0006\u0019\"4ulMɕ";
      f3383[12] = "\u001e54`J*\u0002/6<P>\u0012,}-W-\u0014i&:Q3\u0002i\u0000:J6\u001f \u0006:Q3\u0002";
      f3383[13] = "=l&6\u001aO=l1j\u0016@''1t\u0016U Vg+E\u0017";
      f3383[14] = "\u0003UQ&OM\u0003UFzCB\u0019\u001eFdCW\u001eo\u00171\u0014\u0014";
      f3383[15] = "\u0003J|\u00002pC\u0010{\u001aMd_\ta\u0018!V\bD8@r\u0001[E>\u00005yR\u001by\u0005M";
      f3383[16] = "\f^i%o9R\u0006,Oj1\n\u000e)OsxR\u0005+?- \u0017o%+~%\u001e^ltjI";
      f3383[17] = "E&?Ni\u001c\u001b~z$i\u0005Cjncyl\u0019*xV|\u001c\u0018,oH\u0017\u000e\u0016+iZgPNn\u0003";
      f3383[18] = "d.v;\u0005Ve.t;gC0 \u007f,\u000bqg`\"rZ&gatu\u0004X#9s\"g";
      f3383[19] = "mJ\u0017[\u000f\u000f;E\\\u0010d\n={\u0015U\u001c\r.JGD\u0002\u0016";
      f3383[20] = "\u001f\u0006\u0017V}5D\u0002\u001c\r@9J\u0019{\t2.S\u000f\u001dLy%\u0018aGG2,M\u0007\u0002\f9g#_FN27S^@Y,\\";
      f3383[21] = "\u000e\u0007\u0013GX;A\u001c\b\u0001gn]\u0019\u000e[\u000b\\\f]T\u0006V\u000b\f\u0002\u0002_ZbW\u0006\t\u0004g";
      f3383[22] = "W\u0003&gmQ\u0005\u00128|\u0015\u000e\r\u0011:iBYRLa\u0005*\u000e\u0002\u001ega.\u0004\u001e\u0012";
      f3383[23] = "\u001bk\u0013,w(Iz\r7\u000fwAy\u000f\"X \u001f.WN6kId\t>7kKd";
      f3383[24] = "\u001d;:\u000e;7L8=\u0004VȈ-dhY<u]:0\u001cVi\u001c:3\u001b&7D\u007fY";
      f3383[25] = "\u007fh\u001c'\u000e\u0005v6[\"v\u0001q\u0003_\"\u0017\u001byXAiJ\u0017h(\u001f1\u000f}";
      f3383[26] = "~Oj\u00130m'_a^P{)~j\u00124j\u0005Kp\u0003Pe\u007f\u001ea\u0010 ;'[\u000b\fa;$\\{R9~N";
      f3383[27] = "xMBh=o|G^d\u0004n*_Lmh\\}\u0018\u00137?\u000b}\u001eG4gu9F@c\u00045%^W54z>E\u0011\n";
   }
}
