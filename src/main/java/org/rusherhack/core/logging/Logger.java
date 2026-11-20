package org.rusherhack.core.logging;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.logging.output.FileOutput;
import org.rusherhack.core.setting.Setting;

public abstract class Logger implements ILogger {
   public List<ILog> outputs;
   public String f1629;
   public ILogger f1630;
   public static boolean f1631;
   public static long f1632 = Class066.m4320(591565103787399348L, 5194611205878535946L, MethodHandles.lookup().lookupClass()).m4325(252647607674549L);
   public static String[] f1633;
   public static String[] f1634;
   public static Object[] f1636 = new Object[35];
   public static String[] f1637 = new String[35];

   @Override
   public void info(String var1) {
        
    }

   @Override
   public void warn(String var1) {
        
    }

   public Logger(String var1, Path var2) {
      this(var1, null, var2);
   }

   @Override
   public ILogger getParent() {
        return null;
    }

   @Override
   public void debug(String var1) {
        
    }

   @Deprecated
   public void log(String var1) {
   }

   public Logger(String var1) {
      this(var1, (Path)null);
   }

   public Logger(String var1, ILogger var2, Path var3) {
      super();
      this.outputs = new ArrayList<>();
      this.f1629 = var1;
      this.f1630 = var2;
      if (var3 != null) {
         this.outputs.add(new FileOutput(var3));
      }
   }

   public Logger(String var1, ILogger var2) {
      this(var1, var2, null);
   }

   @Override
   public void error(String var1) {
        
    }

   @Override
   public String getName() {
        return null;
    }

   public static void m3980(boolean var0) {
      f1631 = var0;
   }

   public static boolean m3981() {
      return f1631;
   }

   public static boolean m3982() {
      boolean var0 = m3981();
      return !var0;
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
   public static void m122() {
      f1636[0] = "\u0005j@\u0014vz\u0019pBHln\ts\tYk}\u000f6KUch\u0003v@\u0014H`\r\u007fBH";
      f1636[1] = "\u0016InGM\n\nSl\u001bW\u001e\u001aP'\nP\r\u001c\u0015e\u0006X\u0018\u0010UnGv3\u0016\\n\fM";
      f1636[2] = "\u001c6[,\u001fk\u0002>Ac}w\u0005#";
      f1636[3] = "\u001f\t</@h\u0001\u0001&`\bh\u001b\u000b>'\u0001s[+% \u001dh\u0018\r8";
      f1636[4] = void.class;
      f1637[4] = "java/lang/Void";
      f1636[5] = "X!C\u007f\u0007SS.R0zK@)[y";
      f1636[6] = "d9QL\u0004\u0019\u0011\u0019ZC\u0015Vp\u0017QH\u0011\f\u0004";
      f1636[7] = "\\mOkVU@wM7LAPt\u0006ȱ";
      f1636[8] = boolean.class;
      f1637[8] = "java/lang/Boolean";
      f1636[9] = "\u0005`a\u001c[j\u0019zc@A~\ty(QFm\u000f<e]Dr\u000b|b\u001cHm\rgkWGkDAr@@q\rQgB]j\u0018w";
      f1636[10] = "f`b(5Uzz`t/Ajy+e(Rl<ii G`|b(\u000elfu";
      f1636[11] = "\u000b=\u0015tz2\u00002\u0004;\u001b<\u000b9\u0000a";
      f1636[12] = " vpL\u0000\u001a<lr\u0010\u001a\u000e,o9\u0001\u001d\u001d**d\u0007\u0006\u001b&jpL!\n;p~\f\u0015";
      f1636[13] = "TiD\f\\o!IO\u0003M \\Q\\\u0004Di4";
      f1636[14] = "8J\u001f+\u0016TMj\u0014$\u0007\u001b0r\u0007#\u000eRX";
      f1636[15] = "\rad2hW\u0011{fnrC\u0001x-Ț";
      f1636[16] = "(U{\u001d]t.B~\n0#}HEWZvrM?\u0015R-j$x\u0015]!o_!\u001eR%\u0011";
      f1636[17] = "7\r\u0010\t\u001b\u000eu\u001bI\u0011gԁ\u0007\u0002\u001b\r\u001e\\d\u000fK\bV`";
      f1636[18] = "\u0007;}@T\n\u0010#`2ӻhT7rYD\u0013\r<}]:SR4\u007f\u0002\u0001\u0003R$&2";
      f1636[19] = "*N[p0g,Y^g]7tE(c69\u0013\u0005[2';q\u0005\u001c21Y(\u0004\u0014jmbx\u0004\u00043]";
      f1636[20] = "\tgs7A{\u001e\u007fnEѥ\u0019Zk|.Qb\u0003`s*/";
      f1636[21] = "V\u0001\u001chMlA\u0019\u0001\u001aDsD\u0007\u0003fX\u000e\u0001\u000e@`N0\u0007\u0019Ew";
      f1636[22] = "'nz\u0000\u0003\u0004nml\u0003j\u0018{tn\u000b\u0016v'nz\u0000\u0003\u0004nml\u0003jJesa\fV\u0017}i7bQ\u0016mlb\u0010\u0018\u0015{o\u000b";
      f1636[23] = "D4ow^\u0012Js0g?\t\u0012w2\u0019\u0004\u0016\no=kM\u0015\u001clT\"\u0004\u0007\u001b=or\u0004\u0017B\r";
      f1636[24] = "Rhq[bsEpl)f\u0011\u0000gqJ~*\fvv\u0019\f-Mtp[7!\\s#)";
      f1636[25] = "@sw\"_2N4(2>;\u00050+6>m\u001f;.%L$\u001c--L\u0005m\u000e*|wUm\u001esL";
      f1636[26] = ",VK7,z;NVEʊ\u0018{\u0011G{&%+EY\u007f";
      f1636[27] = "x0JJ\u0004\u0001o(W8ˋc+<ES\u0014\u0018r7JWj";
      f1636[28] = ".YrrL\u000fs\u0005&`0S\u0010\u0007yhR\u0016bNz~Q\u007f+\\h{Y\rb_~x0";
      f1636[29] = "[\u0013F\u0001-\u001fL\u000b[s,\u0010I+M\u0016.}\u000e\rU\u0011*\u000fG\u000eC\u0012C";
      f1636[30] = "Un|d~\"Lmpe\u0015Ψ<+u*w:Nbv<tS\u0007pd9|!Nsr:\u0015";
      f1636[31] = "\u0017\\! }lUJx8\u0001ͽ'S*$x>D^z!0\u0002\u001c\u00010:19L\u0001 c\u0001";
      f1636[32] = "?;!\u0003ei(#<qԏ\u000bj%2\u0013by#&$\u0010";
      f1636[33] = "P`Y\u000e{5^'\u0006\u001e\u001a0\t7\u0005`!1\u001e;\u000b\u0012h2\b8b[! \u000fiY\u000b!0VY";
      f1636[34] = "z@DT/\u0005t\u0007\u001bDN\r(\u0013\u0002UNZ%\b\u001dS<\u0013&\u001e\u001e:uZ4\u0019O\u0001%Z$@\u007f";
   }
}
