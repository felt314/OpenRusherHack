package org.rusherhack;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.feature.window.PopupWindow;
import org.rusherhack.client.api.ui.window.content.ComboContent;
import org.rusherhack.client.api.ui.window.content.component.ButtonComponent;
import org.rusherhack.client.api.ui.window.content.component.CheckBoxComponent;
import org.rusherhack.client.api.ui.window.content.component.TextComponent;
import org.rusherhack.client.api.ui.window.content.component.TextFieldComponent;

import org.rusherhack.command.reset;
public class Create_Profile extends PopupWindow {
   public static long f5993 = Class066.m4320(-6002205285048181142L, -5419583575187883141L, MethodHandles.lookup().lookupClass()).m4325(198978493308494L);
   public static String[] f5994;
   public static String[] f5995;
   public static Object[] f5997 = new Object[54];
   public static String[] f5998 = new String[54];

   public Create_Profile(Configs var1) {
    }

   static {
    }
   public static String m1491(byte[] var0) {
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
   public static void m1731() {
      f5997[0] = "\u000f\u0002\nAh\u001d\u0011\n\u0010\u000e\u000f\u001c\u0000\u0011\u001dT)\u001a";
      f5997[1] = "\u000fq\u0007\u001an\u0007\u0004~\u0016U\u000f\t\u000fu\u0012\u000f";
      f5997[2] = "$z+\u0006\u001e[8`)Z\u0004O(cbK\u0000G.f8\u0006\r^\"&*M\rZ>z)\u0006\u0001A/} MBc.l9D\tm*|)O\u0003\\2";
      f5997[3] = "yW\u001a*kpeM\u0018vqduNSҤ";
      f5997[4] = "3:!ic\u0002850&\u001e\u001a+29o";
      f5997[5] = "\u001c40i]S\u0000.25GG\u0010-yĬ";
      f5997[6] = "+;nYx77!l\u0005b#'\"'њ";
      f5997[7] = "9A7@\u001c+2N&\u000fq/2R\u0012DC26N\"D";
      f5997[8] = "N\u0013v\f\u0004XR\ttP\u001eLB\n?A\u001aDD\u000fe\f\u0017]HOdKXZH\u000fuM\u0001\u0003B\u000e\u007fV\u0013CUOrM\u001b]N\u000ftL\u0002\u0003b\ttA\u001doN\u0019RM\u001b]N\u000ftL\u0002";
      f5997[9] = boolean.class;
      f5998[9] = "java/lang/Boolean";
      f5997[10] = "\u001c\u0016\"v~)\u0000\f *d=\u0010\u000fkɞ";
      f5997[11] = int.class;
      f5998[11] = "java/lang/Integer";
      f5997[12] = "\u00192S\u000e%b\u0005(QR?v\u0015+\u001aC;~\u0013.@\u000e6g\u001fnRE6c\u00032Q\u000e:x\u00125XEyC\u0019'SL2v\u0014,Qm8s\u0003,Q";
      f5997[13] = void.class;
      f5998[13] = "java/lang/Void";
      f5997[14] = "?b`6Vk:-P>\u0014g";
      f5997[15] = "{\u007f\u0015\u0002X\u000few\u000fM:\u0013bj";
      f5997[16] = "^\\\r\u000b\ttBF\u000fW\u0013`REDF\u0017hT@\u001e\u000b\u001aqX\u0000\u001fLUvX@\u000eJ\f/RA\u0004Q\u001eoE\u0000\tJ\u0016q^@\u000fK\u000f/eK\u0012Q=hTB\u000ef\u0014lAA\u0004@\u0015u";
      f5997[17] = "PJ\u0003CeqLP\u0001\u001f\u007fe\\SJ\u000e{mZV\u0010CvtV\u0016\u0002\bvpJJ\u0001Czk[M\b\b9MrW\u0000\u0018{a";
      f5997[18] = "\u000bS1T$:\u0017I3\b>.\u0007Jxϯ";
      f5997[19] = "]x ~ FAb\"\":RQaiȤ";
      f5997[20] = "\"!\u0013\u001eq\u0007>;\u0011Bk\u0013.8ZSo\u001b(=\u0000\u001eb\u0002$}\u0012Ub\u00068!\u0011\u001et\u001b#7\u001bG-\"\"#\u0001@T\u001b#7\u001bG";
      f5997[21] = "B;\u001e\\~.^!\u001c\u0000d:N\"W\u0011c)Hg\u001f\u0017m/X;\u001c\\E\u001dH(\r\u0007~>n&\u0017\u0014e<X;\u0018\u0010`>";
      f5997[22] = "gu.DMB{o,\u0018WVklg\tS^mi=D^Ga)/\u000f^C}u,D\\Xej(\u0004[\u0019iu.Do[i~,\u0018mRnb;\u000fQTm";
      f5997[23] = "\u0017gd\u0002\u001fI\u000b}f^\u0005]\u001b~-O\u0001U\u001d{w\u0002\fL\u0011;vECK\u0011{gC\u001a\u0012\u000e|f[Co\u0011xs@\bj\u0011pt";
      f5997[24] = "\u0019Am\u001a\u0018\u007f\u0005[oF\u0002k\u0015X$W\u0006c\u0013]~\u001a\u000bz\u001f\u001d\u007f]D}\u001f]n[\u001d$\u0015\\d@\u000fd\u0002\u001dI[\u0007h\u0019peZ\u001eo\u0018G";
      f5997[25] = "\u000e6!$Q0\u0012,#xK$\u0002/hiO,\u0004*2$B5\bj3c\r2\b*\"eTk\u0002+(~F+\u0015j\u0011cM!\u000e3\u0005eM1\u0004*2";
      f5997[26] = double.class;
      f5998[26] = "java/lang/Double";
      f5997[27] = "\u00129Dv\u0015U\u0013gR\u0012\u001eJ^*)+B@\u00105Xr\n\\BV";
      f5997[28] = "\u000b_VtW_\bJV36wvyr\nj<\u000b_VtW_\bJV3";
      f5997[29] = "P@\u0002uCO\bU\\{|Ǻj\u0002]e\u001cSZU_\u007fF#Q\u0003\u001ax\f\u0013\u0006\u0001\u0000\"|";
      f5997[30] = ">V5=\u001c1yBi,cՈ\u0005\u00150|\tnkQ+>YR";
      f5997[31] = "YcU\u001c_/\f<M\u0018#ɍfbV\u0017\u0012~\u001c\"S\fO\u0014";
      f5997[32] = "\u0014@x\u0000\u000b]ST$\u0011t\u0380/\u0004f\u001f\nALCrC\u001b";
      f5997[33] = "q1#~\u001f$\u007f'h;u`,0Of\u001at%!\u007f\u0001Kcq qe\u0011&>1\u00130H}86#y\u0019v&L";
      f5997[34] = "H\fPE(-\u0018\u0016XDF/K\u001f+\u001d :J\u0015\u001cz&:\u001f\u0014\u0011\u0011,*K\u0016`K{ ^\tP\u0002*+@s";
      f5997[35] = "|~;\u0007U\u00058eyWi\u0010@!>\u0010\t\u001bpv<\nSk~b4\u0001\u000b\u000f$'{\u0010iZ}|}\u0017Y\u0013,wcm";
      f5997[36] = "\u0000b\u001cMhA\u0002`D_\u0004\u0017\nVIV\u007f\u001dl,\u0010W}\n\\eA\\cp";
      f5997[37] = "G,94\u0016o\u00037{d*ƞ{!hd@<@'b1X\u0001";
      f5997[38] = "l\"\u00061\u001f[; \u001cko\u0006.e\u00125\u0014*8~\u001c+\u0002 >c\u0016QTQ*x\u000ba\u0003S0\"{o\u0017[;z\u001f5R\u0014*\u0018";
      f5997[39] = ":/a\u0007O^?.h\u0017\"\u001dTz#\u001aBAd-!\u0000\u00181o{d\u0007R\u00018y~]\"";
      f5997[40] = "\u0014^+47K\u0016\\s&[\u0004\u0019LeH4DE^a8fF\u0011@";
      f5997[41] = "R\u007f\b1\u0004T\u0005}\u0012kt\u001e\u0004=\u00118\u001f\tixO4J\u001b\u0012*\bhMdT\u007f\u0010o\u000b\u001f\u00068Lht_S8\u0015!D\bQ\"OQ";
      f5997[42] = "8b1\u0005\u0014\u000b`tw\u001er\nhxQ\u0007\u0016\u0018h\u00041\u0016B\tg`kS\r\u0018\u0005";
      f5997[43] = "\u0011\b |m|\t\u0005bo\tm\u0015\u0018\u001a~lox_fjirH\bdp3\u0002";
      f5997[44] = "5\u0006\u000e\f\u001a$7\u0004V\u001ev|5\u0015t\u0017\u0010i4\u001fCp\u0016ia\u001eN\u001b\u001cy5\u001c?AKs \u0003\u000f\b\u001ax>y";
      f5997[45] = "{~:>_o}to&b5n}z=\u001e3h\u0010<;\u000f0\u007fb=e\u0019T";
      f5997[46] = "_\u001c\u007fLcl\r\u001e+R\u0018g]^\tT~`]D>kqp\\C$\\\u0018}YZxSs~_]=3)!V[8\u0003`p]EB";
      f5997[47] = "r,P\u000eH\u000edxT\bw\u001du:m_\u0013\u000fuF\b\f\n\u0012hv_\u000e\u0010H\u0018";
      f5997[48] = "]\u0002=)Zd]G>lj2Z\u0001\u0016?\u00160X\u001a''jdP\u0014e7\tgE\u0014\"V";
      f5997[49] = "2\r\u0003f*u3S\u0015\u0002'nu$\u0003r;\u00070\u001a^n%cj_\u0011\u007fG";
      f5997[50] = "I\u0016n@2\u001cY\u000fu\u0019SM\"\u0000k],GH\u001dt\u001c=$N\u000ep[0NS\u00111JS";
      f5997[51] = "xdF%\u007fN|`P|\u0003TxfP`\u0003\u0010m-Q~gJ(b@\u001c";
      f5997[52] = "}\u000eDe]$~\u001bD\"<*=\u0014D9GG}SJc_6$\u001bV1<y<YA?X#y\u0016P]";
      f5997[53] = "\u0002mG0P:Fv\u0005`lɤ>`\u0016`\u0006i\u0005f\u001c5\u001eT";
   }
}
