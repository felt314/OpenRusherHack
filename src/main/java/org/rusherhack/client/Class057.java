package org.rusherhack.client;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.Renderer273;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.core.setting.Setting;

public class Class057 extends Class053 {
   public Setting<?> f1357;
   public String f1358;
   public static long f1359 = Class066.m4320(8020961468005897032L, 5108872926347387655L, MethodHandles.lookup().lookupClass()).m4325(135943544808580L);
   public static String[] f1360;
   public static String[] f1361;
   public static Object[] f1363 = new Object[38];
   public static String[] f1364 = new String[38];

   public Setting<?> m3244() {
      return this.f1357;
   }

   public Class057(IModule var1, Setting<?> var2, String var3) {
    }

   @Override
   public String m3029() {
        return null;
    }

   public Class057(IModule var1, Setting<?> var2) {
      this(var1, var2, "");
   }

   @Override
   public Runnable m3028() {
      return () -> {
         boolean var3 = Class053.m3182();
         PanelHandlerBase var5;
         PanelHandlerBase var10000 = var5 = Class170.f3364.m7115().getClickGuiHandler();
         if (!var3) {
            if (!(var10000 instanceof Renderer273)) {
               return;
            }

            var10000 = var5;
         }

         Renderer273 var6 = (Renderer273)var10000;
         var6.m9579(this.m3179(), null);
         var6.m9579(this.m3179(), this.f1357);
      };
   }

   static {}
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
   public static void m194() {
      f1363[0] = "\u0015W8\u0014!:\tM:H;.\u0019NqY?&\u001fK+\u0014ҧ";
      f1363[1] = "\u0017\"2|2_\u000b80 (K\u001b;{Ȧ";
      f1363[2] = "GJMHe\u0003[PO\u0014\u007f\u0017KS\u0004\u0005x\u0004M\u0016Y\u0003c\u0002AVMHD\u0013\\LC\bp";
      f1363[3] = "F\u0004F\u0013\u0019\u000bM\u000bW\\d\u0013^\f^\u0015";
      f1363[4] = "\u000fQ>V|\u0003\u0013K<\nf\u0017\u0003Hw\u001ba\u0004\u0005\r,\fg\u001a\u0013\r\u0014\u0019z\u001e5W0\u0014}";
      f1363[5] = "{\"{\u0010\r{\u000e\u0002p\u001f\u001c4s\u001ac\u0018\u0015}\u001b";
      f1363[6] = boolean.class;
      f1364[6] = "java/lang/Boolean";
      f1363[7] = "g&=SBil),\u001c#gg\"(F";
      f1363[8] = " DLOp=+K]\u0000\r%8LTI\u001c$#I^K,";
      f1363[9] = int.class;
      f1364[9] = "java/lang/Integer";
      f1363[10] = "Jy-oI3Vc/3S'F`d\"W/@e>oЌ";
      f1363[11] = ".C}nL\\[cva]\u0013&{efTZN";
      f1363[12] = void.class;
      f1364[12] = "java/lang/Void";
      f1363[13] = "lszm71pix1-%`j3ɤ";
      f1363[14] = "\u001e1.II\u0004\u0002+,\u0015S\u0010\u0012(g\u0004W\u0018\u0014-=IZ\u0001\u0018m/\u0002Z\u0005\u00041,IV\u001e\u00156%\u0002\u00158<,-\u0012W\u0014";
      f1363[15] = "$dl>C{8~nbYo(}%ή";
      f1363[16] = "W\u0013mTS4K\to\bI [\n$\u0019M(]\u000f~T@1QO\u007f\u0013\u000f1Y\u000fo\u0016\u000f\u0011Y\u000fo\u0016i V\u0005f\u001fS\u0003Y\u0012o";
      f1363[17] = "gX\u0014m%1{B\u00161?%kA]Ĩ";
      f1363[18] = "hQ\u0001f\u007fo>\u0016B\u0005*\u0011?\u0011Ml|k:PCb@(8\u0011\u001a9:-y\u001f\u0014\u0005";
      f1363[19] = ".ihVHej)mC2uy-CRIbp8~u[\u007fyQ5XIje8j\\R+\u0014";
      f1363[20] = "!%uwm(l>ur\u001dՄ\u0010/>z -q|p*'G*~irg8n>lg\u001dwu&jum5|:e\u0017";
      f1363[21] = "^&Mli0\u0014hY\"\fxdmL(|%\r2H3=T^<\\#}=\u00018Gb\f";
      f1363[22] = ")lEU:P'}ETYF-qk\u00018B#B]\u0004\u0019@&aD\b#)*wP\u0002gQ?m\u001e\u0002Y";
      f1363[23] = "t\\]\u000fq_0\u001cX\u001a\u000bՁN[][g\\r\t\u0001Zj ";
      f1363[24] = ",>_AbaknT\u0016ZǢ\u0013iMK%=o:\b\b0\\#0P\u001e8,a9L\u0011Z";
      f1363[25] = ";R\u000b\u0003\u0012X|\u0002\u0000T*Ɲ\u0004PTU\u0017\u000fe\u0003\u001a\u0005\u0010e";
      f1363[26] = "2\u0000k\f\u001c=>\u0015`\u001e~ϩX\u0014e\u0004\u000652\u0018p\u000f\u0014";
      f1363[27] = "0@=EW\u0017oD&\u0004&\u001fqf#MZ\u000f\n\u0017;\u0004Y\u001fvD~GL~";
      f1363[28] = "`WOD0&6\u0010\f'ŮX4BFW~1kF]\u0016";
      f1363[29] = "\u00164;4\u0003wI0 ur`E;=)5p,bq/\u001b{\u001ce!;\u0012\u001e\u00164;4\u0003wI0 ur";
      f1363[30] = ">\n\n\u00130]:\u001f\u0007\fQD{\n\u001b\u001a=-9\u0019\r\f Df\u001d\u0016MQ\u0010{\u000e\u0019\u001d!\u0014n\u0003\u0006|";
      f1363[31] = "t*\u00030\u0005\u001bp?\u000e/d\n/)\u0012%\u0018kw0\u0019c\u000b\u0016.b\u0000\"dQ\")\u000f.\r\u000e&2N_Y\u00135=\u001e/]\u00068\"\u007f";
      f1363[32] = "\u0012\u0014\u000b;-2\u001e\u0001\u0000)OЩx\u0003\u001a&\u007f;\u0001\r\u000b&~X";
      f1363[33] = "YZ\u0017+*\u007f\u001e\n\u001c|\u0012ѓf\r\u0005!m#\u001a^@bxB";
      f1363[34] = "h(\u000b\u0010\u007fq/x\u0000GG\u038bW\u007f\u0019\u001a8-+,\\Y-L";
      f1363[35] = "=\u0016+\n]\u0010yV.\u001f'̐\u0007\u0011+^K\u0013;Cw_Fo7K,\u000bE\u001fuB0\u0004'";
      f1363[36] = "\u001b\u0019iw\u00192M^*\u0014ʈLO_|q\\3\u000b\u001fyd";
      f1363[37] = "QVW@\u0017t\u0015\u0016RUmd\u0006\u0012hL\u0017f\r\u00120\u001fUl\u000e\u0014O[\u0015i\u001bn";
   }
}
