package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.text.Text;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement$ColorMode;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;
import org.rusherhack.client.api.system.Colors$ColorMode;

public class HudItem337 extends ListHudElement$ListItem {
   public Class<? extends Entity> f5371;
   public List<Entity> f5372 = new ArrayList<>();
   public EntityType<?> f5374;
   public static long f5375 = Class066.m4320(-5095383654163610422L, -1550979289009847129L, MethodHandles.lookup().lookupClass()).m4325(245346323756767L);
   public static String f5376;
   public static Object[] f5377 = new Object[43];
   public static String[] f5378 = new String[43];

   public HudItem337(ListHudElement var1, Class<? extends Entity> var2, EntityType<?> var3, EntityType var4) {
    }

   @Override
   public boolean shouldRemove() {
      return this.f5372.isEmpty();
   }

   @Override
   public int getColor(int var1) {
        return 0;
    }

   @Override
   public Text getText() {
      return Text.empty().append(this.f5374.getName()).append(f5376 + this.f5372.size());
   }

   @Override
   public void tick() {
        
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
   public static void m194() {
      f5377[0] = "s\u0015A7\u0016\u001ao\u000fCk\f\u000e\u007f\f\bȟ";
      f5377[1] = int.class;
      f5378[1] = "java/lang/Integer";
      f5377[2] = "\u0001$NU&\\\u001d>L\t<H\r=\u0007˭";
      f5377[3] = "pF\u0013\u000bK-l\\\u0011WQ9|_Zɑ";
      f5377[4] = "c^\u000bFt(\u007fD\t\u001an<oGBΆ";
      f5377[5] = "Ct\u001blaTCt\f0m[Y?\f.mN^N^p5\n";
      f5377[6] = boolean.class;
      f5378[6] = "java/lang/Boolean";
      f5377[7] = "\u0016,6.\u0010K\b$,arW\u000f9";
      f5377[8] = "\rWHFjx\u0013_R\t\"x\tUJN+cIfLB d\u0004WJB";
      f5377[9] = "d^\f\u001fk\u0011xD\u000eCq\u0005hGERu\rnB\u001f\u001fx\u0014b\u0002\u0018Hj\u0010nAErv\bd^\u0018";
      f5377[10] = "be'\u0011z/~\u007f%M`;n|n\\d3hy4\u0011i*d93F{.hzn|g6be3\u001bK5ax2rg>h";
      f5377[11] = " \u0003}dz_=\u0016%F;R%\u0010";
      f5377[12] = "k#vJ\u0001\u001ew9t\u0016\u001b\ng:?\u0007\u001f\u0002a?eJ\u0012\u001bm\u007fC\u0011\u0000\u0003a#Y\u0005\u0010\u0000E\u0001X";
      f5377[13] = "Z\u0013\u0011\r\u001eCF\t\u0013Q\u0004WV\nX@\u0000_P\u000f\u0002\r\rF\\O\u0010F\rB@\u0013\u0013\r\u0004CQO:J\u001fB}\u0014\u0012f\u0000SX\u0004\u0018WHuZ\r\u0019Q!YQ\u0004";
      f5377[14] = "'\u0015\u0013ZW&,\u001a\u0002\u00156('\u0011\u0006O";
      f5377[15] = "&3dw\u001c9:)f+\u0006-**-:\u0001>,op<\u001a8 /dw+\"<,P<\u001a8 /d";
      f5377[16] = ">\u001c9RD6\"\u0006;\u000e^\"2\u0005p\u001fY14@-\u0019B78\u00009Re&%\u001a7\u0012Q";
      f5377[17] = "tGF\u0006*\\tGQZ&Sn\fQD&Fi}\u0003\u001a~\f";
      f5377[18] = ">pW[$r>p@\u0007(}$;@\u0019(h#J\u0011@\u007f*";
      f5377[19] = "z%o\u001b*.z%xG&!`nxY&4g\u001f.\u0007rw";
      f5377[20] = "\u0000@sI[4\u000bOb\u0006&,\u0018HkO";
      f5377[21] = "D]Zu\u001e!\u0000SF)z \u0017^mr\u0006.\u0006Sks\u001e(\u0000\"\u001bw\u000b)\u0000\u0019G$Awz\u001cPf\u001f6\u0016A_/\u0017OJ\u001dCuE=\u0003X\u001bfz";
      f5377[22] = "Id8}\u0010]Mg~(jЕpm8m\u0017\u000e\u000ey9b\u001a";
      f5377[23] = " ojB`.|-9(խBa-o\u0016g\"*)6(";
      f5377[24] = "\r\t)\b!\u001bQKzbȕwLK,\\&\u0017\u0007Oub";
      f5377[25] = "0xNEH\u00023/\u0017Q6\u0013` OP[(cE\u0015JTWv:YO\u000fU\ry\u0016S\u000e\u0004i>\u0010JRi";
      f5377[26] = "HO5[x\u0004S\f7D\u0001\u001cNJ;^m.\u001f\rg\u0006:yO[cUg\u0018\u0013J;\\\u0001";
      f5377[27] = "\u001e!fy5O\u001a\" ,OM'y:\u007f!\u001eA&dk\"$\u001d&6xuBBx\"{O";
      f5377[28] = "K6/\u0002gY\u0018/mQWH\u001c3qG,#E(l\\3M\u0001&p\u0000W";
      f5377[29] = "'C\b\u0006\u0002!3B\u0007\u000b::!\u0006\u0017\u001cV\bqJFD:45\u0014\u0015\u0002G/v\u0016\n{";
      f5377[30] = "iMe\n\u000f\u00034B,\u0002v4\u000btK.=oiMe\n\u000f\u00034B,\u0002";
      f5377[31] = "Zpo= w^s)hZͤc/k41b\b,<m%";
      f5377[32] = "lY\u000f\u007f\u001bbkQ\bm~ʔW\u000f\u0005q\u0018~lSV;F\u0004k\n\u001b8\u0013`,\f\u0002d~";
      f5377[33] = "8J\u0014M&\u0007v\u0016\u0010P\u001f$U8r~T\u007f8J\u0014M&\u0007v\u0016\u0010P";
      f5377[34] = "Q\u000fT^w3RX\rJ\t7\u0001N2E31RXR\u000e7hl[\u000eH`i\u0012\u000fQ\r1X";
      f5377[35] = "\u0003%u\"4!\u0000r,6J+EUv16;>$-4r'Zc+-.J";
      f5377[36] = "\t\\Gc>\u0016\r_\u00016Dԋ0\u0005\u0013e;\u0018V\u0002\u001bb)";
      f5377[37] = "G\u0015e\u00135s@\u001db\u0001Pž|Ca\u0005/p\u001aDi\u0002=\u0015\u0015\u0016pR\",\u0017\u00063\u0011P";
      f5377[38] = "B\u0017|W3\u0018A@%CM\b\u001eXw<=I\u0016\u0014p\\vMO*";
      f5377[39] = "k\u001a]jK\tfJ\bm'\rlX2eC\u001fl$\u00050Z\u000b0ZQo\u001fZ\u0001";
      f5377[40] = "'T\"\u0016\bBn\u0011z\u00057_z\u0017\u001b8}0gQ(I]P,Uqw";
      f5377[41] = "G\u0001%{o4\u001b\u0010}r\t0F\u0010}pe\u0002\u0011S#&2UG\u001dvp5.P\u0006,q\t9FTqqheW\fx\u0017";
      f5377[42] = "9oy\u0002>\u000fe~!\u000bX\u000b8~!\t49l:qSbn>{/\f!\u0013%8-\u0013X\u00028:-\b9^)b$n";
   }

   public HudItem337() {}
}
