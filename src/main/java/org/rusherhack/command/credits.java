package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.ClickEvent.Action;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;

import org.rusherhack.client.api.feature.module.impl.client.Background;
import org.rusherhack.client.api.feature.module.impl.world.NewChunks;
public class credits extends Command {
   public Text[] f5013;
   public static long f5014 = Class066.m4320(-5369879264297724613L, 3954988394786005830L, MethodHandles.lookup().lookupClass()).m4325(96783734787903L);
   public static String[] f5015;
   public static String[] f5016;
   public static long[] f5018;
   public static Integer[] f5019;
   public static Map f5020;
   public static Object[] f5021 = new Object[30];
   public static String[] f5022 = new String[30];

   public credits() {
        super(
         "credits",
         "Get a list of contributors and their contributions"
      );
      int var10001 = 8;

      Text[] var3 = new Text[var10001];
      var3[0] = Text.literal("John200410 - Founder / CEO / Developer")
         .fillStyle(
            Style.EMPTY
               .withColor(65535)
               .withClickEvent(new ClickEvent(Action.OPEN_URL, "https://github.com/John200410"))
         );
      boolean var10005 = true;
      var3[1] = Text.literal("historian - Contributor")
         .fillStyle(Style.EMPTY.withClickEvent(new ClickEvent(Action.OPEN_URL, "https://github.com/FluorideHistorian")));
      var3[2] = Text.literal("charlie353535 - Background Particles")
         .fillStyle(Style.EMPTY.withClickEvent(new ClickEvent(Action.OPEN_URL, "https://github.com/charlie353535")));
      var3[3] = Text.literal("jagrosh - DiscordIPC")
         .fillStyle(Style.EMPTY.withClickEvent(new ClickEvent(Action.OPEN_URL, "https://github.com/jagrosh/DiscordIPC")));
      var3[4] = Text.literal("Experience.Monks - Gaussian Blur GLSL shader")
         .fillStyle(Style.EMPTY.withClickEvent(new ClickEvent(Action.OPEN_URL, "https://github.com/Experience-Monks/glsl-fast-gaussian-blur")));
      var3[5] = Text.literal("Shadow_Fiend - 3d Line shader")
         .fillStyle(Style.EMPTY.withClickEvent(new ClickEvent(Action.OPEN_URL, "https://github.com/h1tm4nqq")));
      var3[6] = Text.literal("etianl - Discovery of NewChunks Palette mode")
         .fillStyle(Style.EMPTY.withClickEvent(new ClickEvent(Action.OPEN_URL, "https://github.com/etianl")));
      var3[7] = Text.literal("rfresh - Help with NewChunks Palette mode")
         .fillStyle(Style.EMPTY.withClickEvent(new ClickEvent(Action.OPEN_URL, "https://github.com/rfresh2/")));
      this.f5013 = var3;
      String[] var4 = new String[6];
      var4[0] = "contributors";
      var10005 = true;
      var4[1] = "contributions";
      var4[2] = "author";
      var4[3] = "authors";
      var4[4] = "credit";
      var4[5] = "cred";
      this.addAliases(var4);
   }

   @CommandExecutor
   public Text m10181() {
        return null;
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
      f5021[0] = "4y XKe(c\"\u0004Qq8`iȂ";
      f5021[1] = "FYEu\u00138MVT:n ^Q]s";
      f5021[2] = "+\u001c\u001f\\>++\u001c\b\u00002$1W\b\u001e216&YGkq";
      f5021[3] = int.class;
      f5022[3] = "java/lang/Integer";
      f5021[4] = "\u0005\u000boS(\u001d\u0005\u000bx\u000f$\u0012\u001f@x\u0011$\u0007\u00181)HpLO\rw\u001c6\u00074\\.H|";
      f5021[5] = "u7[y\u0001~i-Y%\u001bjy.\u00124\u001fb\u007f+Hy\u0012{skZ2\u0012\u007fo7Yy\u0010dw(]9\u0017%{7[y1gu&W\u0005\u0016m\u007f7Y9\u0010n";
      f5021[6] = "~B'\u0018h5bX%Dr!r[nUu2t\u001e#Yw-p^$\u0018[\"bD2Wy4R_-[{.u";
      f5021[7] = "*|4X.2_\\?W?}\"D,P64J";
      f5021[8] = void.class;
      f5022[8] = "java/lang/Void";
      f5021[9] = "Vf>=\u0003\u0018Vf)a\u000f\u0017L-)\u007f\u000f\u0002K\\x&X@";
      f5021[10] = "\u0017hA\u0012\u0000\u000b\u0017hVN\f\u0004\r#VP\f\u0011\nR\u0000\u000eXR";
      f5021[11] = "Bn$\u0007\t\u0019Bn3[\u0005\u0016X%3E\u0005\u0003_Tb\u001cQH";
      f5021[12] = "m\u000b\f\u007f0;q\u0011\u000e#*/a\u0012Eȅ";
      f5021[13] = "pp5t\f.lj7(\u0016:|i|ɜ";
      f5021[14] = ".a,#\u0018\u000b\u0018D,#\u000fW\u0014K6h\u000fI\u0014^1\u0019^\u0010C\u001cy";
      f5021[15] = "-IJlC5&F[#\";-M_y";
      f5021[16] = "3\r\u0000:\u0016=m\u0014\u0004\u000bƐYdD\u0015d_>?\u0015\u0011wd`m\u0019\u00170\u0003;<\u001d\u0004\u000b";
      f5021[17] = "~\u007f\u0014{`|7y\u001cdXgNk\u000fni|*5\u0016jX`7}Gd<>.yv";
      f5021[18] = "Is4+HE\tbj.pK\u001d~i5\u001cyK<0iA.J<m0\u0013T\u0011du0p\u0017\u0001?pj\u001bW\u0010auR";
      f5021[19] = "\u0012,\u001c*I\u0002R\u007f\u0005z0Ȳ#tAqR\bY/\u0019iRk";
      f5021[20] = "68r\u0013J\u0017\u007f>z\frŃ\u0006+,\u0006\u0002\u000fw|b\u0019\n";
      f5021[21] = "z+A$  /l]-B5 |^!\u0015bx.\u0006|B`{jS/95<vZ";
      f5021[22] = "\u0004$\n]\u0019\u000fG~\u001fPf\u001d?\u007fP\u0000\t\nX$\u0001\u0004\u001a1\u0006v\r\u0002]V]'\t\u0011f";
      f5021[23] = "U\r)Q?d\u0015\u001cwT\u0007a\r\u0011pDP5PG*\u0010\u00076\u001dAm\u0010lv\f\u001fh";
      f5021[24] = ")qo2<\tl3,lS\u0011yaZh2\u0011n`h\fn\u0013-kz|/\u0013rk\u00132lD~3jv,@,\r";
      f5021[25] = "2\u0005,U.W3\u001fl\u001f\u0015Pa\u001cvHyb0[*\u0010-55P{@.Rn\u0001\u007fS\u0015\n5^*CgO4\u0006h/";
      f5021[26] = "|\nlZ\u0006O9\u000b4\u0018jX.O2\u0001\u0006jy\flWT=zBo\u001fRV:S1\u001aj\u0002z\rn\n\u0018G{U,f";
      f5021[27] = "\u0005\f)\u001cs\u001aE\u001dw\u0019K\u0014Q\u0001t\u0002'&\u0005E%X{q\u0003\u001bp\u001f{\u0012^Cf\u001eKHM@m] \b\\\u001ehe";
      f5021[28] = "#&d\u0014Puf'<V<bqc:OPP& d\u0019\u0007\u0007%/7G\u0007`~~3T<8%!fDN}$y$(";
      f5021[29] = "P\u000f\u001a-q8\u0015\u000eBo\u001d/\u0002JDvq\u001dV\u000e\u0014,'JQS\u001ek,(PI^!\u001duV\b\u0018}o0WPZ\u0011";
   }
}
