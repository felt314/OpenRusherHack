package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import org.rusherhack.client.api.feature.hud.ListHudElement;

import org.rusherhack.client.api.feature.hud.impl.EntityList;
import org.rusherhack.client.api.feature.hud.impl.HudItem337;
public class Class442 extends HudItem337 {
   public Item f7268;
   public int f7269;
   public static long f7270 = Class066.m4320(-5649272219591353021L, 4857695991401641296L, MethodHandles.lookup().lookupClass()).m4325(199118336668333L);
   public static String f7271;
   public static Object[] f7272 = new Object[26];
   public static String[] f7273 = new String[26];

   public Class442(EntityList var1, ListHudElement var2, ItemEntity var3) {
    }

   @Override
   public void tick() {
        
    }

   @Override
   public Text getText() {
      return Text.empty().append(this.f7268.getName()).append(f7271 + this.f7269);
   }

   static {
   }

   public static String m656(byte[] var0) {
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
      f7272[0] = "\u0002\u001eZ\u001aaM\u001c\u0016@U\u0006L\r\rM\u000f J";
      f7272[1] = "\u0018`a.\u0013\u0019\u0013opar\u0017\u0018dt;";
      f7272[2] = "E\u001cW(Ci[\u0014Mg!u\\\t";
      f7272[3] = "\u0018/\u0000Tzb\u00045\u0002\b`v\u00146Iˬ";
      f7272[4] = "}\u000e\u000b)\u0002`}\u000e\u001cu\u000eogE\u001ck\u000ez`4N0V0";
      f7272[5] = int.class;
      f7273[5] = "java/lang/Integer";
      f7272[6] = "\u000esvfI$\u000esa:E+\u00148a$E>\u0013I3}\u0010\u007f";
      f7272[7] = boolean.class;
      f7273[7] = "java/lang/Boolean";
      f7272[8] = "w'-B,\u0017k=/\u001e6\u0003{>dъ";
      f7272[9] = ")8\r}q5)8\u001a!}:3s\u001a?}/4\u0002Hd%n";
      f7272[10] = "\u0018vAy\u007fr\u0018vV%s}\u0002=V;sh\u0005L\u0007b$*";
      f7272[11] = "\u0013\"j!+\f\u0013\"}}'\u0003\ti}c'\u0016\u000e\u0018+=sU";
      f7272[12] = "\u001f6 46J\u001491{KR\u0007>82";
      f7272[13] = "Z7\u007fco\u001f\u001f6,^{\u0014\u00150N,z\u0001X4.3 \te";
      f7272[14] = "A\t6zSBA\n4:6՞|K)b\\F@\u000b1=[";
      f7272[15] = " tM\u0001XX`|\u0007\u00076\u0007reV\u0001Z5#\"\nY\rb/\"G\u001c\u0007_{zI\f6";
      f7272[16] = "Z\u0010[?$\u001c\n\r\u000f7X\u0006\f\u0003\u0002544^NZcX]\u001a\u0018\b4d\u001d\u0002G\u000fR";
      f7272[17] = "NqT~0r\u0016z\u001ftMs\u000bl\u001fe1u\r\u0001Zw|/\u0005g\u001fv/\u0012";
      f7272[18] = "5\u001dc@m\u0002f\u0010!G\f̄\u000f\u0019+H~\u0001oA \u0003t";
      f7272[19] = "vu,J`>&hxB\u001c$ fu@p\u0016r+)\u0018\u001c}t'qK{%3x)'";
      f7272[20] = "GC\u001d->\u000e\u0007[B*XW\u0014D\u001a 4eF\bFwX\r\u0014C\u001d)bM\u001c\t\u001bG";
      f7272[21] = "`\u000eu\u00038B2\u000f4\u0016\t\u001c1\u000b,\u0000e.bF|\\\tB3N!\u001bv\u0012.\u001a)g";
      f7272[22] = "\u001c[Q\u001b\u00150YZ\u0002&\u0007?Xf\rV\u001bV\u001f_\u0018W\u0007:[\u0018_\u0017g";
      f7272[23] = "w$DW\u0013\u0005w'F\u0017vīJd\u0019\u0015\u0012\u000b-<^JJ";
      f7272[24] = "\u0011\u001b\u001bo\u0004\bEC\u0015\u007f5PL\\\nrYb\u001b\u001fT$\u000e5\u0011RUd[\u0005E\u0011\u0007w5\u0005\u001aQ\u0010$\bQB_\u0000\u0015";
      f7272[25] = "\u0000WA\u000e0RT\u000fO\u001e\u0001\n]\u0010P\u0013m8\tT\u0000I;o\u000f\u0001K\u0013oUO\t\u0001\u0015\u0001_\u000b\u001dJE<\u000bS\u0013Zt";
   }
}
