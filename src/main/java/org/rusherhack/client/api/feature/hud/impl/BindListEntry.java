package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.text.Text;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.bind.key.IKey;

import org.rusherhack.command.bind;
public class BindListEntry extends ListHudElement$ListItem {
   public ToggleableModule f4560;
   public static long f4562 = Class066.m4320(3924664620589080051L, -1202125999899976845L, MethodHandles.lookup().lookupClass()).m4325(168450600854045L);
   public static String f4563;
   public static Object[] f4564 = new Object[38];
   public static String[] f4565 = new String[38];

   public BindListEntry(BindList var1, ListHudElement var2, ToggleableModule var3) {
    }

   @Override
   public int getColor(int var1) {
        return 0;
    }

   @Override
   public Text getText() {
      int var10000 = Class253.m9154();
      String var6 = this.f4560.getName();
      int var3 = var10000;
      IKey var5;
      if ((var5 = (IKey)Class170.f3364.m7119().getBindRegistry().get(this.f4560)) != null) {
         boolean var10002;
         label18: {
            var10002 = var5 instanceof Class545;
            if (var3 == 0) {
               if (!var10002) {
                  var10002 = true;
                  boolean var7 = true;
                  break label18;
               }

               var10002 = false;
            }

            boolean var10004 = true;
         }

         var6 = var6.concat(f4563 + var5.getLabel(var10002) + "]");
      }

      return Text.literal(var6);
   }

   @Override
   public boolean shouldRemove() {
        return false;
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
      f4564[0] = ")t\u00162\u0017\u001c5n\u0014n\r\b%m_Ț";
      f4564[1] = int.class;
      f4565[1] = "java/lang/Integer";
      f4564[2] = "F\u0019'_#.Z\u0003%\u00039:J\u0000n;";
      f4564[3] = "|7w\u001c0b`-u@*vp.>Q.~v+d\u001c#gzkcW6cz+w\u001c\u0001x\u007f*ba'cg,~U";
      f4564[4] = "r=\f\u0011mdn'\u000eMwp~$Eȵ";
      f4564[5] = "\u00063e\u0013>_\u001a)gO$K\n*,^ C\f/v\u0013-Z\u0000odX-^\u001c3g\u0013!E\r4nXb~\u0006&eQ)K\u000b-gp#N\u001c-g";
      f4564[6] = boolean.class;
      f4565[6] = "java/lang/Boolean";
      f4564[7] = "tT5\u000b \u0013iAm)a\u001eqG";
      f4564[8] = "/\\;^2\u000b3F9\u0002(\u001f#ErȄ";
      f4564[9] = "m\n\u000fxm\u0007q\u0010\r$w\u0013a\u0013FĽ";
      f4564[10] = "\u0016L#\"\bp\u001dC2muh\u000eD;$";
      f4564[11] = "$O_N738U]\u0012-'(V\u0016\u0003*4.\u0013Z\t+\"eV]\u0019k\u000f\u0000XA";
      f4564[12] = "Vpr\b'kJjpT=\u007fZi;E:l\\,wO;z\u0017@|H1SXltA0l{cfC";
      f4564[13] = "q}2Yy\u001du`2Hd\u001d6o}_c\u0001l`p\u0002x\u0016rl\u007fXdZWkvIt\u0000*F~Fr\u0017lD}\\";
      f4564[14] = "hN\u0006Km?tT\u0004\u0017w+dWO\u0006s#bR\u0015K~:n\u0012\u0007\u0000~>rN\u0004Kr%cI\r\u00001\u0007hX\u0014\tz";
      f4564[15] = "aPoL(gaPx\u0010$h{\u001bx\u000e$}|j)Ws?";
      f4564[16] = "~\u00003$0s~\u0000$x<|dK$f<ic:r8h*";
      f4564[17] = "\u0005\u001dR\u0001\u0002\u0012\u000e\u0012CNc\u001c\u0005\u0019G\u0014";
      f4564[18] = "/\rH*Y\f3\u0017JvC\u0018#\u0014\u0001Ϭ";
      f4564[19] = "$\u0005\u0016pc\u0001}RALԳf'UA+<^ \u0016\u001a,S";
      f4564[20] = ";#|x-\u0000o.)~_Џ\u0002uk?3E;+tq09>~~\"f\\~2m|_";
      f4564[21] = "\t!:~NxPvmBȧ\u001f\nqm%\u0011'\r26\"~";
      f4564[22] = "nd.^I\u001c35%O3πP3(\\^\u00042nyWO";
      f4564[23] = "\n\u000e\u0019\u000b)=\u0005\t\u0003\u0000@:R\u000b\u000e\u000b<Q\n\u000e\u0019\u000b)=\u0005\t\u0003\u0000@nV\u0011\f\u000b,aQ\u000b\u0007b";
      f4564[24] = "_dBLgm\u000bi\u0017J\u0015Ҩf3F\u0016t(W7\u0015\ng";
      f4564[25] = "\u00117;J.0\u0019b>BU-L!AJ?/E]9\u00138!\u00188y_+\u007f!bf_<+MmaE7B";
      f4564[26] = ".:1./?. '~UĀ\u0014}1>9#-#.p:";
      f4564[27] = "^\tb#Y*\u0000\u0016, %r\u001e-{ Jw\b\u001d\u001cs\u0015~\u0006Hy3YmXq";
      f4564[28] = "\n\b4I\r@\u000e[(Zq\u001e]\u001f\tA\u0015\f]cjCN\u0012A\u001e1D\u0016@0";
      f4564[29] = "\u00073zh\\'P=9 .#Z,\u000e3H m=+3U0M!DcI.P>?/U/SP";
      f4564[30] = "\u0000B~~|m\\Ynb\u001ea\\@Ai{c1\u0003d|wg]\fcf|\u000e";
      f4564[31] = "A\u000b/\u001aq4E\u0006{\u0004\u001d=E\u0019v\fq\u000f\u0014^*T%X\u0017\u0006j\u0002t4\u0018\u0001p\t\u001d2\u0016\u0017vVd4W\u0017jk";
      f4564[32] = "]\"P?zp\u0011>Q<\u0014d\u0001922e:Q9\b5lb\bEX)%6\u0010\u007f_ }ol";
      f4564[33] = "`z\u0012T.9=+\u0019ETǏ^\u007fG\u00053k.z\u0000Wi[";
      f4564[34] = "\u001e\u0012\u0007Y\u000blJ\u001fR_yŰ'E\u0003\u0003\u0018)\u0016AP\u001f\u000b";
      f4564[35] = "g>Z\u0010C=g$L@94]\u007f[\f\u000368x\\NW]`;PDR8g<\u0012\u00109";
      f4564[36] = "\u0013\u000bQy\u0016X\u0013\u0011G)lŏ)NDxUJ\u0010\u001aI-S";
      f4564[37] = "?|Q@\u0014Fd{\t\u0012eTok4l/;;)PD\n\u0003<j\u000bCe";
   }
}
