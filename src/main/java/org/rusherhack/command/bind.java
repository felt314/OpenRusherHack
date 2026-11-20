package org.rusherhack.command;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.Formatting;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.bind.IBindable;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.feature.IFeature;

public class bind extends Command {
   public static long f5052 = Class066.m4320(3104177225300330369L, -8381133943114351100L, MethodHandles.lookup().lookupClass()).m4325(94490894633518L);
   public static String[] f5053;
   public static String[] f5054;
   public static Object[] f5056 = new Object[57];
   public static String[] f5057 = new String[57];

   @CommandExecutor(
      subCommand = {"del", "delete", "rm", "remove"}
   )
   @CommandExecutor$Argument({"feature"})
   @CommandExecutor(
      subCommand = {"clear"}
   )
   @CommandExecutor$Argument({"key"})
   @CommandExecutor(
      subCommand = {"list"}
   )
   @CommandExecutor(
      subCommand = {"add", "set"}
   )
   @CommandExecutor$Argument({"feature", "key"})
   public bind() {
      super("bind", "Manage keybinds for features");
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
      f5056[0] = "ZDt\u000f\u0013`F^vS\ttV]=B\u000egP\u0018qH\u000fq\u001b]vXO[@Z\u007fj\u0004l";
      f5056[1] = "\u0015NXOx#\tTZ\u0013b7\u0019W\u0011ȕ";
      f5056[2] = "O(;:m\u001eD'*u\u0010\u0006W #<";
      f5056[3] = "\u001b%\u000f&D\"\u0007?\rz^6\u0017<FkY%\u0011y\naX3Z\u0015\u0001fR\u001a\u00159\toS%66\u001bm";
      f5056[4] = "_`rxQ+Czp.K?Sy;5L,U<w?M:\u001e[W?M:Qpy3";
      f5056[5] = "\fORh)\r\u0010UP43\u0019\u0000V\u001b%4\n\u0006\u0013W/5\u001cMVP?u1(XL";
      f5056[6] = void.class;
      f5057[6] = "java/lang/Void";
      f5056[7] = "9Iu\u0000N@%Sw\\TT5P<Ȩ";
      f5056[8] = int.class;
      f5057[8] = "java/lang/Integer";
      f5056[9] = "B\u001c\u001e\u0018!v^\u0006\u001cD;bN\u0005Wŝ";
      f5056[10] = "t]{/=\u001fhGys'\u000bxD2b \u0018~\u0001uo;\u000fiI}b*\u00195fR`\"\u000f\u007f";
      f5056[11] = "\u0001J\\B\u0011CtjWM\u0000\f\u0015d\\F\u0004Va";
      f5056[12] = "-O'e\u0014S1U%9\u000eG!VnΣ";
      f5056[13] = "v\u001b\u0003P}\u000fj\u0001\u0001\fg\u001bz\u0002JȢ";
      f5056[14] = boolean.class;
      f5057[14] = "java/lang/Boolean";
      f5056[15] = "7$n\u0015eq+>lI\u007fe;='Xxv=xjTzi98m\u0015gv75lHdm61'xxi57g_Gv75lHdm61ZRyo";
      f5056[16] = ")`C'\u0013\u0006-}C6\u000e\u0006nr\f!\t\u001a4}\u0001|\u0012\r*q\u000e&\u000eA\u000fv\u00077\u001e\u001b\u0013q\u0019";
      f5056[17] = "a\f\u000eY\\=e\u0011\u000eHA=&\u001eA_F!|\u0011L\u0002]6b\u001dCXAzG\u001aJIQ A\fE^S g\n";
      f5056[18] = "JS\u0003G4\u0000T[\u0019\bS\u0001E@\u0014Ru\u0007";
      f5056[19] = "69)qd0=68>\u0005>6=<d";
      f5056[20] = "\u0005\u0016hMf9\u0005\u0016\u007f\u0011j6\u001f]\u007f\u000fj#\u0018,-Q?";
      f5056[21] = "\u0019\u000f\u0015&S<\u0007\u0007\u000fi.=\u0001\u0007\r 7&\u001a\u0000\u00065";
      f5056[22] = ">\fSH1+5\u0003B\u0007\\/5\u001fvLn21\u0003FL";
      f5056[23] = "V \u0015J2GR=\u0015[/G\u00112ZL([K=W\u00113LU1XK/\u0000p6QZ?Z\r\u001bYU9MK\u0019ZO";
      f5056[24] = "\u001fT\u0007%on\u001bI\u00074rnXFH#ur\u0002IE~ne\u001cEJ$r)9BC5bsDoK:dd\u0002mH %B\u0018T[)";
      f5056[25] = "sHZ6\u007f&xGKy\u0018$mLK2#";
      f5056[26] = "m\u001f@8iVs\u0017Zw\bSs\u0017Y7&O";
      f5056[27] = "M\u0013:B\u001e}S\u001b \r}iWV\tMDz^";
      f5056[28] = "\u0017{0\u0002\u0016P\u0012j3\u0015o\b\u0001z4\u0017\u0013\u000e\u0007\u0017%F\u0000\r\u0001)1\u0019\b\u0017}";
      f5056[29] = "de\fygz2r\t4\u001eebhMHr~iw\u00013po`d1";
      f5056[30] = "3d\"n}%ndv|Dt>w/b\u0013#g$s\u000e(d6zr1udbh";
      f5056[31] = "[\u0014\u0004\u0016fPQH\u0002]XDWRa\u0001%MU\u001e\u001a\u00034DF.";
      f5056[32] = "}|1\u0012\b\u001bp*0\u0014zԂ@yk\u001a\n\u0013?\"*\u0019\u001ab";
      f5056[33] = "T?c@z%Ze,@\u001eϼjeuW{&\rk/\u0018{";
      f5056[34] = "UbwaU_\th01$\f\u0007$IcA\u000ejaraCR\r bmGc";
      f5056[35] = ".\u0000+\fm[)\u0006sW\u000bRx\u001d\u000e\u0002aPqa{\u0011bR(\u000ftWaQ\u0015X7\u0000l\fr\u0019'\fh=";
      f5056[36] = "@5;\u001dD\u0015\u001c?|M5F\u0012s\u000f\u0017NQ\u001bf20\\L\u0012\u000fz\u000b^NNh;\u001bRJ\u007f";
      f5056[37] = "\u0004:3i+(E*?m\u001a!Z==gfO\u0004:3i+(E*?m\u001apM,`uq-\u0004|6\u000e#2V iib\"Z.X";
      f5056[38] = "Ek$\f7yY8/PO(J{\u0005\u0004>GKz \u0006\u007f<Ik)\u0015O";
      f5056[39] = "6(\u001fB$5c!JAC4a9nC%7V(KC8'v4$M!jq\"\u001e\u001b-b2E";
      f5056[40] = "c\u001a`%:\u001cv\f?'\u0003\u0016a\u0000\u0001'g\u0004a|33e\u0016<\u00071\"l\u0005\f";
      f5056[41] = "\n\u001c\"\u001exr\u0000@$UFh\u0010~=\b=d\rZGT<`\u0004\u001b)[zc\u0007&";
      f5056[42] = "\t\u0003<,/9\u0019\u001e01U8\u0000\u0018$;\u0012(iBa3%7\u0016\u0019 05F\t\u0003<,/9\u0019\u001e01U";
      f5056[43] = "\u0013KDrxEEGL1\u001f\u0012\u001aU\u000f~D\u0012\u0000)\u001fca\u0003\u0005\u0010\u001arb\u0014|";
      f5056[44] = ")hIM;\u001a'2\u0006M_ǩ\u0017<PTd\u0001wt\u0001O#}";
      f5056[45] = "]Q]\u0010 @\u0002\u001bF\u0004\u0010\u0019lR\u0014\t`\u000f\u0005V\u0014\u0007opUZA\u001do\u0019QZO\u0012\u0010";
      f5056[46] = "(\u00139CCW}\u0005g{:j\u0017%N=0aL\u001dmEC\u00147H{\u001b";
      f5056[47] = "\r-\r\u0014\u001df\t-\u0003\u001bbǻ4%\u0014\u000f\u0005>Sd\u0004\u0003\u0001\u000f\ra\u0002\u0003ShLq\u000e\u0007b";
      f5056[48] = "U\u0006n\u007f\u0014A\u0000\u000f;|sT\u0002\u0017\u001f~\u0015CoQ*/L\u0016\u0006\u0015-t\t/T\n4x\u0015IS\fl#s\u0013\u0017\n-u\fA\n\u00139\u001f";
      f5056[49] = "M[,N,nBZ,NQuLM^\u00104~X^0D a\u001f!3\u0004#,]S<\u0005#, ";
      f5056[50] = "/]dq\u0006*yQl2aw*]8g\u001d*\u0007U7a\nl\rY)v\u0010K-CUf\rn<Flc\u001cm+?";
      f5056[51] = "X)\u0014wL\u0001\u00199\u0018s}\u0018\b0\u0002}:\ba8\u0002v\u0012V\u001a:\u0013\u007f\u0001fX)\u0014wL\u0001\u00199\u0018s}";
      f5056[52] = "/Ih\bI`rI<\u001ap1\"Ze\u0004'f{\b9h\u001c!*W8WA!~E";
      f5056[53] = "G-Y9p<H3W%\u001dz.o\u0015(zgI.\u0005$~V\u0017+\u0003$,1V;\u000f \u001d";
      f5056[54] = "v6y\u0005\u001b[c &\u0007\"Qt,\u0005\u0003S>u- \u0001\u0012Ew<)\u0012\"";
      f5056[55] = "d\u001f'+\u000f/xL,ww~k\u000f\u001b'\u0013lks)3\u0011~6\b+\"\u0018m\u0006";
      f5056[56] = ".\u0015TU#\u0014x\u0002Q\u0018Z\r,\u0013/\t*\u0011EY\u0013\r5P+VU\u000e6m";
   }
}
