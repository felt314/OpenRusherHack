package org.rusherhack.command;
import org.rusherhack.*;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.StringJoiner;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
public class config extends Command {
   public static File f7104;
   public static long f7105 = Class066.m4320(9067313747169828146L, 7014630763487005499L, MethodHandles.lookup().lookupClass()).m4325(53324771449252L);
   public static String[] f7106;
   public static String[] f7107;
   public static Object[] f7109 = new Object[54];
   public static String[] f7110 = new String[54];

   @CommandExecutor(
      subCommand = {"create"}
   )
   @CommandExecutor$Argument({"profile name"})
   public config() {
      super("config", "Manage your configs");
      this.addAliases("configs");
   }

   @CommandExecutor(
      subCommand = {"reload"}
   )
   public String m13730() {
      Class170.f3364.m7112().m8467();
      return "Reloaded configs";
   }

   static {
    }

   @CommandExecutor
   public String m13731() {
      boolean var10003 = true;
      return String.format("Current module profile: %s", Class170.f3364.m7107().m14145());
   }

   @CommandExecutor(
      subCommand = {"list"}
   )
   @CommandExecutor(
      subCommand = {"delete"}
   )
   @CommandExecutor$Argument({"profile name"})
   @CommandExecutor(
      subCommand = {"load", "set"}
   )
   @CommandExecutor$Argument({"profile name"})
   @CommandExecutor(
      subCommand = {"save"}
   )
   public String m13735() {
        return null;
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
      f7109[0] = "TV\u0015qlnHL\u0017-vzXO\\Ĵ";
      f7109[1] = "}{])\u0004daa_u\u001epqb\u0014Ъ";
      f7109[2] = "Jn&\n%>Aa7EX&Rf>\f";
      f7109[3] = "D2yv\u0006+1\u0012ry\u0017dP\u001cyr\u0013>$";
      f7109[4] = "%. V\u001e#94\"\n\u00047)7i\u001b\u0003$/r2\f\u0005:9r\u0017\u0019\u0005$";
      f7109[5] = "6 \u0013+sk((\td\u0014j93\u0004>2l";
      f7109[6] = ";5JE/c0:[\nNm;1_P";
      f7109[7] = "-\u007f^5X\b&pOz5\f&l{1\u0007\u0011\"pK1";
      f7109[8] = "__\u0013\f1$CE\u0011P+0SFZȤ";
      f7109[9] = int.class;
      f7110[9] = "java/lang/Integer";
      f7109[10] = "\u0002\u0010NjJJ\u001e\nL6P^\u000e\t\u0007'TV\b\f]jYO\u0004L\\-\u0016H\u0004\fM+O\u0011:\u000bG WH.\rG0]Q\u0019*H*\\S\b\u0010k%KZ";
      f7109[11] = "@\u001e!*\f\\EQ\u0011\"NP";
      f7109[12] = "a\u0019\u0015\u000f\u0001\u0019\u007f\u0011\u000f@c\u0005x\f";
      f7109[13] = boolean.class;
      f7110[13] = "java/lang/Boolean";
      f7109[14] = "O\u001d\btxkS\u0007\n(b\u007fC\u0004Aє";
      f7109[15] = "F&X\raXZ<ZQ{LJ?\u0011ɗ";
      f7109[16] = "\u000fm}\u0014Nv\u0013w\u007fHTb\u0003t4YPj\u0005qn\u0014]s\t1HOOk\u0005mR[_h!OS";
      f7109[17] = "#]\n\u000b\u000e\u0019 SR\fI\u001b,\u0012,\u000bT\u001f";
      f7109[18] = "\u0016y\u0006\b3'\nc\u0004T)3\u001a`Oǫ";
      f7109[19] = void.class;
      f7110[19] = "java/lang/Void";
      f7109[20] = "uM\u001f@NeiW\u001d\u001cTqyTV\rSb\u007f\u0011\u001b\u0001Q}{Q\u001c@}riK\n\u000f_dYP\u0015\u0003]~~";
      f7109[21] = "}2Dpd\u0004\b\u0012O\u007fuKu\n\\x|\u0002\u001d";
      f7109[22] = "\u001c\rE\tm\u0013\u0002\u0005_F\u0010\u0012\u0004\u0005]\u000f\t\t\u001f\u0002V\u001a";
      f7109[23] = "\nEP\u00059\u001b\u007f`UJ\t\u0013=l\u0001";
      f7109[24] = "a\u000bZ\u0011/C.ILQJ\u00150CY v\u0019-\f_J-\u0012m\u000b%";
      f7109[25] = "m\u0011h\u001aKyo_:qԲ\u001bo\u0005,\u001eRvjU+N(";
      f7109[26] = "iW\u007f\u001e\u001fd(\u0013b\u001dzռWQ{B\u000ba7_e\u0013\u0013\u001c";
      f7109[27] = "\u001ft1:\u0000V\u001d:cQϝ4\u001ft1:\u0000V\u001d:c";
      f7109[28] = "pI\u007f3h01\rb0\rȑNO{o|5.Ae>dH";
      f7109[29] = "\t\b\u00070;\u001eO\u0003Vv\u0005\u0014W\u0015Yeyz\t\b\u00070;\u001eO\u0003Vv\u0005@P\u0011\u0001<:\u0015L\u0013D\f<\u001d\u000bS\u0002hz\u0016Z\u0015<";
      f7109[30] = "z+<@_C|&\u007f\u0015&ռ\u001187M\\\u0013q$4BIx";
      f7109[31] = "Vpr\u000e\u00017WgcIz QvgP\u00047<4g\u000fFdXrl^\u0000ZVpr\u000e\u00017WgcIz";
      f7109[32] = "mI<CN\u0018=\u0004<\u00007IVO4I\u000b[2\t?\u0018Meo\u0011hN\t\u0001)\u001a9\b7";
      f7109[33] = "9\n\u0005\u0002\u0003n<Z\u0002Ryx\u0000X\u001eVE=d\u001e\u0015\u0007\u0003\u00031\u0001\u001cUCsx\u0004A\u0002yoy\u0007\u0003\u0006\u0019sz\b\u0016m";
      f7109[34] = "4; \rL&:g)\u0004vѤ]6}\bH1<:,\t\u001d";
      f7109[35] = ";\u0000\rG|\u0017>P\n\u0017\u0006ӊ\u0002R\u0016\u0013:Df\u0014\u001dB|z";
      f7109[36] = "mJrW~1+A#\u0011@8-P \u000f;\u0014;K.\u0011-\u001e=V.ky2o\u0011w\u000f?9>WIZ 0l\u00179\u0013%m;-";
      f7109[37] = "dy(B(\\a?%G\u0016MfhT\u0010\u007f\u0018mi?\\kXx\u0004:PjK4|?\u0016gN\n";
      f7109[38] = "\u0013\u001dLes:U\u0016\u001d#M.G\u0002\u00130&3*G\u001ee*3A\u000b\n%?^\u0017\u0013K> 5[\u0007\u000b+MgMAKg)!F\u0010\rY";
      f7109[39] = "Y\u000f+\r]PU^*X'U\bN2}FU\u0004NN\\\u0017K\u000eEvMIIP5";
      f7109[40] = "%g\u0007\"*Z}rS9XI\u001a4\u0005xd[~r\u000e)\"e#jY\u007ff\u0001ea\b9X";
      f7109[41] = "16\u0016l\u0014s=g\u00179n}lp5;\u000b\u007f\u00015\u0014iR,es\u001f8\u0014\u0012";
      f7109[42] = "3LVE|c?\u001dW\u0010\u0006os\u0017H\u0007}\u00022\u0016VC<r{\u0013\u000b\u0014\u0006";
      f7109[43] = "5\u0017fb5\u0005?\u0014f\u007fKZy\u0000gn7\\\u007fm!?4\n`]d}\"J\u0005";
      f7109[44] = "jL!\u001c|ImN|M\u001eIm\f\u0007FxHa\u001f\u0014HbF\u0000\u001a1S$]m\u001b&Bc&";
      f7109[45] = "\"Y\b}:\u0017'\u001f\u0005x\u0004\u0013+\u007f\bhe\t#$Mu?Sr@\u000b~n\u0015L";
      f7109[46] = ",,#|_@ }\")%Mqr+>H!-v#z\u001fQds~-%";
      f7109[47] = "?\u0014}Hr|0Vx\u001f\u0016p?\u0007KCwp(\u0006y'{|9\u0006`^yb\"W\u0002Ko\u007f)\u0000bWlp<k";
      f7109[48] = "`T\u000bM@un\b\u0002Dzq\t\u0000\u0003\u001d\u0007%y\u0003\u0012V\u0014\u0018`\u0006\\PGhc\u0017\u0017Cz";
      f7109[49] = "@=mZrKBs?1Ƀ)\u0010='Zh\u0012\u00160d\u000f\u0011";
      f7109[50] = "\u0007A\u0018h46B\u0003\u000e(QfR\u0002!4!z;H\u0007<i<K\u0001\u0002a>\u0006";
      f7109[51] = "l\b\u0001>\"\u001cm\u001f\u0010yY\ra;\u0012`4q6O\u0016:#\u0010:\u001e\u0017oY";
      f7109[52] = "\u0001yP\u001c#x\u0007t\u0013IZϟjj[\u0011 (\nvX\u001e5C";
      f7109[53] = "{PE~M'~\u0000B.7ɺB\u000bCjR4|\u0001@jOJ";
   }
}
