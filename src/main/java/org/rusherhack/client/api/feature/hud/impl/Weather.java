package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.world.IMixinLevel;
import org.rusherhack.client.api.feature.hud.TextHudElement;

public class Weather extends TextHudElement {
   public static long f4400 = Class066.m4320(-8174884772062650789L, 8880738497983215442L, MethodHandles.lookup().lookupClass()).m4325(174515246512991L);
   public static String[] f4401;
   public static String[] f4402;
   public static Object[] f4404 = new Object[38];
   public static String[] f4405 = new String[38];

   public Weather() {
      super("Weather");
   }

   public boolean m9011() {
      if (Globals.mc.world.getDimension().hasSkyLight() && !Globals.mc.world.getDimension().hasCeiling()) {
         if (((IMixinLevel)Globals.mc.world).getThunderLevel() * ((IMixinLevel)Globals.mc.world).getRainLevel() > 0.9) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean m9012() {
      if (((IMixinLevel)Globals.mc.world).getRainLevel() > 0.2) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public String getText() {
      int var10000 = Class253.m9154();
      String var6 = "Clear";
      int var3 = var10000;
      boolean var8 = this.m9011();
      if (var3 == 0) {
         if (var8) {
            String var7 = "Thundering";
            return "Thundering";
         }

         var8 = this.m9012();
      }

      if (var8) {
         BlockPos var5 = Globals.mc.player.getBlockPos();
         var6 = ((net.minecraft.world.biome.Biome)Globals.mc.world.getBiome(var5).value()).doesNotSnow(var5) ? "Raining" : "Snowing";
      }

      return var6;
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
      f4404[0] = "g\u0012`d|\"g\u0012w8p-}Yw&p8z(&r&\u007f";
      f4404[1] = boolean.class;
      f4405[1] = "java/lang/Boolean";
      f4404[2] = ".\u001eY\u0011\u0002|2\u0004[M\u0018h\"\u0007\u0010ǀ";
      f4404[3] = "\u00136I{0\u0013\u000f,K'*\u0007\u001f/\u0000ȡ";
      f4404[4] = "\u0012I\u0014\u0001`+\u000eS\u0016]z?\u001eP]ȩ";
      f4404[5] = int.class;
      f4405[5] = "java/lang/Integer";
      f4404[6] = "!\u001fo<Ym=\u0005m`Cy-\u0006&qGq+\u0003|<Jh'CiqH}=\u001eg`X69\u0002z~O6\u0007 ajBv\u0002\b~wG";
      f4404[7] = float.class;
      f4405[7] = "java/lang/Float";
      f4404[8] = "k\u000f&~\u0007ok\u000f1\"\u000b`qD1<\u000buv5dcR";
      f4404[9] = "-t\u0018)!\u00101n\u001au;\u0004!mQd?\f'h\u000b)2\u0015+(8k<\u0007#j\f";
      f4404[10] = "@\u001d\f](Y@\u001d\u001b\u0001$VZV\u001b\u001f$C]'KBu";
      f4404[11] = "G ,5\u001b\u0012[:.i\u0001\u0006K9ex\u0005\u000eM<?5ΰ";
      f4404[12] = "0xM\u00117D;w\\^J\\(pU\u0017";
      f4404[13] = "F\u0012K[RyF\u0012\\\u0007^v\\Y\\\u0019^c[(\tM\u0007 ";
      f4404[14] = "=wk\n^w6xzE?y=s~\u001f";
      f4404[15] = "\u0013c\u0007\u000enn\u0013c\u0010Rba\t(\u0010Lbt\u000eYD\u00145";
      f4404[16] = "7c:\t8\u00047c-U4\u000b-(-K4\u001e*Y|\u0014fU";
      f4404[17] = "z\u000ej\u00134=f\u0014hO.)v\u0017#ԝ";
      f4404[18] = "\u0011{WF1l\u0011{@\u001a=c\u000b0@\u0004=v\fA\u0012Qi<";
      f4404[19] = "a5vMU\"--a5T8:3\\\u000b\u0003e_4sJD<\"&iK?";
      f4404[20] = "Gki\u0003/5\u0010;\u007f\u0013W˘wdv\u00003}\u001ee>\u00020EG&{\u001bo,Fny\u0018W";
      f4404[21] = "*gyKYpy=bK$g\u00138xHNgl2nOX\u000e){~]Mq#myK$";
      f4404[22] = "~s9o\u0007jtb=-mեD1lj\u0002y8b8q\b\u0005";
      f4404[23] = "4r\u000fGaM>c\u000b\u0005\u000bɻ\u000e0ZBd^rc\u000eYn\"";
      f4404[24] = "\no\n\rL8N\u007f\n\u0019w3[h5\u001e\u0016:ry\u0011\u001a\u0013\\\neR\rI9_q\nOw";
      f4404[25] = "\u007fT$2\b@;D$&3K.S\u001d(NB/B;\f^Z.KAtB\u00199\u0011$!VA{/";
      f4404[26] = "\u0012\u0011y\u001b\u0003{AKb\u001b~\\+\u000by\u0018\u0005fV\u0019c\u0019~";
      f4404[27] = "h\u0018\u0013l\u001a\u00135\u001f\u0002dpF;\\\bh\u001ctf\u001dY0p\u001d(]\u0010e\rQ0Jh";
      f4404[28] = "q@\u0018hFKx\u001d\\y?\u001e'\u001aZG\u0004Iq\u007fK*CM-O\u001e.YI@";
      f4404[29] = "\u001ch\u001anlK\nr\u000bj\u001c@\u0018j\u001a5prO*Gk!%\u001fuGh~J\u001f/\u00030\u001c";
      f4404[30] = "<elR,|p}{*-fgcF\u0014z:\u0002diU=b\u007fvsTF";
      f4404[31] = "ED]\"r5\u0000\u001e\u0019*\u000b!\u0010#Z=o~JS\u00140zt";
      f4404[32] = "aDff\bq2\u001e}fuïX^fe\u000el%L|du";
      f4404[33] = "\u0002?Si\u0019n\u0013rZqw\u038bh~Ek\u0013k\u0001\u007f\ri\u0010SX<HpO:YtJsw";
      f4404[34] = "#\n;d\u001a\u0017m\u0007.n+\t|\u0016;2|^#K`^\u0015_f\u00185nHXw\u0010";
      f4404[35] = "9C\u0000s^\u000fwN\u0015yo\u0011f_\u0000%8F8\bXI\u0006\u0001g\u000e\u0014'\u0010\u001bv\n";
      f4404[36] = "\u00066\u000f\u0001B\u0014\u0000k\u001b\u0006?\n\u0007p\u001d\u0006S8Q=L[\u0000o\u0000o@[]\u0000\u00005\u0004\u0003?\u0010\u0012s\u0006\u0002B\u0002\br}";
      f4404[37] = "/9|\u0006I\u001ar>m\u000e#O|}g\u0002O}+:8X\u0018*{b:_AE{8~\u0007#\u001b.;\u007f\u001c\u001d\u0012s\u007fne";
   }
}
