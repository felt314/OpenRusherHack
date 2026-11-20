package org.rusherhack.client.api.render.graphic;
import org.rusherhack.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.StackWalker.Option;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.core.setting.Setting;

public class TextureGraphic implements IGraphic {
   public int f813;
   public int f814;
   public InputStream f815;
   public int f816;
   public int f817;
   public static long f818 = Class066.m4320(6756027447727396585L, -3619081470612612945L, MethodHandles.lookup().lookupClass()).m4325(92533360381809L);
   public static String f819;
   public static Object[] f820 = new Object[25];
   public static String[] f821 = new String[25];

   public TextureGraphic(String var1, int var2, int var3) {
      this(StackWalker.getInstance(Option.RETAIN_CLASS_REFERENCE).getCallerClass().getClassLoader().getResourceAsStream(var1), var2, var3);
   }

   @Override
   public InputStream getInputStream() {
        return null;
    }

   @Override
   public int getYOffset() {
        return 0;
    }

   public TextureGraphic(InputStream var1, int var2, int var3) {
    }

   @Override
   public int getHeight() {
        return 0;
    }

   @Override
   public int getWidth() {
        return 0;
    }

   @Override
   public int getXOffset() {
        return 0;
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
      f820[0] = "r\u0000\f|F0n\u001a\u000e \\$~\u0019E1X,x\u001c\u001f|U5t\\\u00197Z!x\u0000E5F$m\u001a\u00021\u001a\u0011x\n\u001f'F Z\u0000\n\"\\,~";
      f820[1] = ";h1lpO>'\u000ec.S%Z3\u007f;G<";
      f820[2] = int.class;
      f821[2] = "java/lang/Integer";
      f820[3] = "\u000741\u000f\u0004`\u001b.3S\u001et\u000b-xɕ";
      f820[4] = "YLL}\u0019oEVN!\u0003{UU\u00050\u0004hS\u0010X6\u001fn_PL}8\u007fBJB=\f";
      f820[5] = "{uPX\u001a3\u000eU[W\u000b|sMHP\u00025\u001b";
      f820[6] = "w|x\\\u00050kfz\u0000\u001f${e1\u0011\u001b,}`k\\\u00165q j\u001bY\u0000tkr\u0017\u00191Zol\u0017";
      f820[7] = "#AWz{o(NF5\u0006w;IO|";
      f820[8] = "\u0006,*\u0019=:\u001a6(E'.\n5cT#&\f09\u0019.?\u0000p?R!+\f,cP=.\u00196$Ta\u0019\f=9X=\b\u001b?=_&,";
      f820[9] = boolean.class;
      f821[9] = "java/lang/Boolean";
      f820[10] = "\u0006z:y\u0018RsZ1v\t\u001d\u000eB\"q\u0000Tf";
      f820[11] = void.class;
      f821[11] = "java/lang/Void";
      f820[12] = "K\u0007\u001eiV\u0006@\b\u000f&+\u001e@\u0005\u0003_\u0019\u0006J\u0003\u001a,7\u001aU\u000f\u0007f";
      f820[13] = "t3\b>K$\u007f<\u0019q**t7\u001d+";
      f820[14] = "w9x[:==%jjѳ]}nb\u0018}c&/`\u0007";
      f820[15] = "-R#GfmgN1vw\r'\u0003,\u0016 b~PyI\u001e7!S Hqnr\u0006\u007fv";
      f820[16] = "%w\u000e\u000b\u0006?z)\u0017\b:Ա\u001ex\u0016\u000e](r&\u0018\u0016_P";
      f820[17] = ">P$=\u0013FqS(1/uCuP\u0015ixEmP\u000ftxTdW\u0019ubHbTT\u001fV3@%=PU?L";
      f820[18] = "H2ENS)\u0017s\r\u000e*~t?DO\u001a5\t>MOARI:\f\u000fM/H3\fT*";
      f820[19] = "=;iN5\\w'{\u007f\u0383<7ls\rr\u0002l-q\u0012";
      f820[20] = "<l:P%\\c2#S\u0019͌\u0007c\"U~Kk=,M|37b\"LyP=3)X\u0019";
      f820[21] = "|\\\t\u0005;Z6@\u001b4϶:u\u000eTI%UwS\u001aN";
      f820[22] = "1y\u000e1\u001f\u001e{e\u001c\u0000ԅ~;.\u0014rX@`o\u0016m";
      f820[23] = "\u0000\u0000}wBHJ\u001coFϻ(\nWg4\u0005\u0016Q\u0016e+";
      f820[24] = "\u0018s@|X\u0002\u0014f\\y Ӝ%=O(^\u0005\u001c\u007fWy\u001a{";
   }
}
