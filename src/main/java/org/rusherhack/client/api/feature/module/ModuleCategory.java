package org.rusherhack.client.api.feature.module;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.utils.objects.Scrollbar;
import org.rusherhack.core.interfaces.INamed;
import org.rusherhack.core.utils.Version;

public enum ModuleCategory implements INamed {
   MOVEMENT,
   CLIENT,
   COMBAT,
   MISC,
   RENDER,
   PLAYER,
   WORLD,
   CHAT;

   // $VF: synthetic field
   public String f727;
   public static String f728;
   public static long f729 = Class066.m4320(-5569416128433023091L, 7173721601926146032L, MethodHandles.lookup().lookupClass()).m4325(187265344139820L);
   public static long[] f730;
   public static Integer[] f731;
   public static Map f732;
   public static Object[] f733 = new Object[39];
   public static String[] f734 = new String[39];

   @Override
   public String getDisplayName() {
        return null;
    }

   ModuleCategory(String var3) {
      this.f727 = var3;
   }

   @Override
   public String getName() {
      return this.name();
   }

   public static ModuleCategory getCategoryByName(String var0) {
        return null;
    }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
    }

   @Override
   public String[] getAliases() {
      String[] var10000 = new String[]{this.getName(), null};
      boolean var10004 = true;
      var10000[1] = this.getDisplayName();
      return var10000;
   }

   public static void m1653(String var0) {
      f728 = var0;
   }

   public static String m1654() {
      return f728;
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
      f733[0] = "l{Pd\u0012\"paR8\b6`b\u0019)\f>fgCd\u0001'j'Q/\u0001#v{Rd\r8g|[/N\u001almB&\u0005\u0014b}R-\u000f%z";
      f733[1] = "OP'1\u0016~D_6~kfWX?7";
      f733[2] = "\\wWo/\u000b@mU35\u001fPn\u001e\"1\u0017VkDo<\u000eZ+E54\u0012@+_#7\u001bPqCo\u000e\u001dAj\\-?\u001fA";
      f733[3] = void.class;
      f734[3] = "java/lang/Void";
      f733[4] = "h7\u000e\u001d]gt-\fAGsd.GP@`bk\u001cGF~tk?V]an*\u0007";
      f733[5] = "W\u0001NIm}~8RSo!d,BP.0`$DU~}m=H\u0015l6m9TIo}a\"ENf6\"\u0000N_\u007f?i\u000e@Oo4c?X\u0000";
      f733[6] = "hc\u0002+D\u0000cl\u0013d/\u0002wo";
      f733[7] = "*\u001e`>C\u0002!\u0011qq.\u0002!\fe";
      f733[8] = "ER|yH\u001c0rwvYSMjdqP\u001a%";
      f733[9] = "\u0006zC\f\u007f\u0004\u001a`APe\u0010\nc\nɖ";
      f733[10] = "\u000e-\u0004{]2\u00127\u0006'G&\u00024M6C.\u00041\u0017{N7\bq\u00050N3\u0014-\u0006{B(\u0005*\u000f0\u0001\n\u000e;\u00169J";
      f733[11] = ".)\\CcV\u0007\u0010@Ya\n\u001d\u0004PZ*\u001b\u0019\fV_pV\u0014\u0015Z\u001fb\u001d\u0014\u0011FCaV\u0018\nWDh\u001d[(\\Uq\u0014\u0010&REa\u001f\u001a\u0017J\n";
      f733[12] = boolean.class;
      f734[12] = "java/lang/Boolean";
      f733[13] = "/5An\u0000s\u0006\f]t\u0002/\u001c\u0018MwI>\u0018\u0010Kr\u0013s\u0015\tG2\u00018\u0015\r[n\u0002s\u0019\u0016Ji\u000b8Z4Ax\u00121\u0011:Oh\u0002:\u001b\u000bW'";
      f733[14] = "\u001bUfzU<\u0010Zw542\u001bQso";
      f733[15] = "q\u000e\u001d\u0019\u0003^'G\u0001tuzWz\"(>Y/N\tI^\u000ffR";
      f733[16] = "*OX',\b|\u0006DJ~\u00051:@1i\f$\u0007g#t\u0005MOK{|\u0018q\u0017M, h";
      f733[17] = "\u000bz\nP\u0017 ]3\u0016=a\u0007)\t:a*'U:\u001e\u0000Jq\u001c&";
      f733[18] = "9^>fM\ro\u0017\"\u000bΖmg\rvf\u0000Q?\u000b!:p";
      f733[19] = "\u0002\u0016^*QqT_BG6\\#cj\u001dlv\\VJz\f \u0015J";
      f733[20] = "X }\b\f/\u000eiae^\"C_m\u0000\\O\u0006s5\bAs^ubT1";
      f733[21] = ";7\u001fg\u00022m~\u0003\nP? G\u0002kV)1uf7\\6&u\u001cjS.<\u000e";
      f733[22] = "]\rZ\u000eC/\u0005\u0015Q\u00038edVI\\U9X\u000eO\u000b\tI]\u0005\u0012\u0000Hu\u0005\u0003E\\8";
      f733[23] = "\t$;y:\u0005_m'\u0014B\"0P\u0007YA9nz{mjX\u000e,2q";
      f733[24] = "WK\u0004-\u0005:\u0001\u0002\u0018@g\u001dj61@_cI\u001f@ \t*U";
      f733[25] = "X\u001ccYB\u0003\u0004\u00050\u0005$\u001b\r\u001f|Tc\u000bdFn\u0001\u0015\u0019X\n1\u0001Ne]\u00110TTY\u0005\u0017g\b$Y\u0003\u0019a_B\u0005\u001aJ=9";
      f733[26] = "I\nPx|<\u001fCL\u00158\\\u0017Y\u0018x1`O_O.Af\u001fU\u0012y&>IUI\u0015";
      f733[27] = "qd&7A''-:Z\u0015G(:29\u0013.) 6#|yq0<5\u0015xk4&Z";
      f733[28] = "eBi\u001e_\n3\u000bus:.K*])b\r;\u0002}N\u0002[r\u001e";
      f733[29] = "J\tp\r\u000b\u0004\u001c@l`ɹd\u0014Z8\rFXL\\oQ";
      f733[30] = "'\u001f\u0000'*YqV\u001cJ\\y\tzy-.@-\u001b\u0019{g\\";
      f733[31] = "E6pzt(\u0013\u007fl\u0017҈H\u00134b+#(\u00193so";
      f733[32] = "aQHdpS-\u001f\u0019y\u0012ƹ_\u001a\u001f6\u007fScB\u0019a##";
      f733[33] = "\u0005X7Lx]S\u0011+!;T\u0006\u001c#ZE\fY\nrK%\u0006^\u001b6!";
      f733[34] = "@\u007f RA0\u001bo9C?xz4:\u0012R$Fl<E\u000eTCgaNOh\u001ba6\u0012?";
      f733[35] = "r\u00134:Q:$Z(W\n3pGMn\u0006kxZq6\u0000<$*";
      f733[36] = "]4\u0016(mp\u000b}\nE\u0015QaFo\"iiW0\u000ft u";
      f733[37] = "6Cg\"\"A`\n{OԪ!`AusuAjFd7\u001f";
      f733[38] = "8n\u001d\u0002nK`hJ^\u001e\u001axyE\u000be6nbK\u0015s<h\u007fAo'\u001d0i\\S\u007f\u001bg5,_{\tp{CSzHy\u0004";
   }
   ModuleCategory() {}
}
