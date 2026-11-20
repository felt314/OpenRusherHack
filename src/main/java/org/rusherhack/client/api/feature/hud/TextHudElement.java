package org.rusherhack.client.api.feature.hud;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import org.rusherhack.Class066;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public abstract class TextHudElement extends HudElement {
   public ColorSetting f696;
   public boolean f697;
   public BooleanSetting label;
   public ColorSetting f699;
   public static double PADDING = 1.0;
   public double f700;
   public BooleanSetting colon;
   public static int[] f702;
   public static long f703 = Class066.m4320(5022962897880134626L, -5321138463617747889L, MethodHandles.lookup().lookupClass()).m4325(105752743855429L);
   public static String[] f704;
   public static String[] f705;
   public static long[] f707;
   public static Integer[] f708;
   public static Map f709;
   public static Object[] f710 = new Object[65];
   public static String[] f711 = new String[65];

   @Override
   public double getWidth() {
        return 0.0;
    }

   public TextHudElement(String var1) {
    }

   public TextHudElement(String var1, boolean var2) {
    }

   public abstract String getText();

   @Override
   public boolean shouldUpdateAlignment() {
      boolean var10002 = true;
      return true;
   }

   @Override
   public double getHeight() {
      return this.getFontRenderer().getFontHeight() + 2.0;
   }

   @Override
   public void renderContent(RenderContext var1, double var2, double var4) {
        
    }

   public String getLabel() {
      return this.getName();
   }

   public static void m1611(int[] var0) {
      f702 = var0;
   }

   public static int[] m1612() {
      return f702;
   }

   static {}
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
   public static void m1499() {
      f710[0] = "\u0006\"_i&D\u001a8]5<P\n;\u0016$8X\f>Li5A\u0000~^\"5E\u001c\"]i<D\r~p20t\u00055U\":E";
      f710[1] = "o\u0019\u001bh\u0000;\u001a9\u0010g\u0011tg!\u0003`\u0018=\u000f";
      f710[2] = "szkS\r\u001fo`i\u000f\u0017\u000b\u007fc\"\u001e\u0010\u0018y&e\u0013\u000b\u000fnnm\u001e\u001a\u00192AB\u001c\u0012\u000fx";
      f710[3] = "\u000e<r\u0013(0\u00053c\\U(\u00164j\u0015";
      f710[4] = "Yj /\u0003rEp\"s\u0019fUsib\u001dnSv3/\u0010w_65d\u001fcSjig\u001eiB6\u000eG\u001eiBJ\"o\u0015bD}5";
      f710[5] = "p4FUhil.D\tr}|-\u000f\u0018vuz(UU{lvhf\u0017u~~*R";
      f710[6] = ";\f\u0006\u00066u;\f\u0011Z:z!G\u0011D:o&6A\u0019k";
      f710[7] = double.class;
      f711[7] = "java/lang/Double";
      f710[8] = "6\u000f,Opt6\u000f;\u0013|{,D;\r|n+5nR%";
      f710[9] = "\u0013(\u00194+L\u0013(\u000eh'C\tc\u000ev'V\u000e\u0012Z.p";
      f710[10] = "}39\u001cmZa);@wNq*pQsFw/*\u001c~_{o8W~[g3;\u001cwZvo\nWg[Z4:wsJ\u007f$0F";
      f710[11] = "3R\u0005PSz/H\u0007\fIn?KLȊ";
      f710[12] = "7s";
      f710[13] = void.class;
      f711[13] = "java/lang/Void";
      f710[14] = "2\u0004\u0014xb#.\u001e\u0016$x7>\u001d]5\u007f$8X\u00003d\"4\u0018\u0014xR92\u001a\u00167~\u00058\u0002\u0007?~1";
      f710[15] = ">x\u0016\u0018}=5w\u0007W\u0011>;u\u0005\u0018=";
      f710[16] = boolean.class;
      f711[16] = "java/lang/Boolean";
      f710[17] = "K\u0013[DssW\tY\u0018igG\n\u0012\tntAOO\u000furM\u000f[DRcP\u0015U\u0004f";
      f710[18] = "p\u0007_L'n\u0005'TC6!x?GD?h\u0010";
      f710[19] = "\u0002(%XJM+\u00119BH\u00111\u0005)A\u0003\u00006\u0016/\u0004^\u0006-\u0010#DJM\n\u0001>^D\r>_";
      f710[20] = "(h,gx\u001d4r.;b\t$qe*f\u0001\"t?gk\u0018.4> $\u001f.t/&}F\u0010s%-e\u001f\u0011s.>B\t)~',x*&i.";
      f710[21] = "\\y']u4@c%\u0001o P`n\u0010k(Ve4]f1Z%3\u0016s5Ze']D._d2 b5Gb.\u0014";
      f710[22] = "Ncf$:kRydx \u007fBz/i'lD?go)jTcd$\u0001XDpu\u007f:{b~ol!yTc`h${";
      f710[23] = "G\u0002q{Hyn;maJ%t/}b\u00014s<{'\\2h:wgHyO+j}F9{u";
      f710[24] = "K&sxvTU.i7>TO.qp7O\u000f\u0005jv4D@)Vl(QM.`k";
      f710[25] = "ODt\u001bZ\u0011:d\u007f\u0014K^G|l\u0013B\u0017/";
      f710[26] = "i\u0004\u0006!\u0002\u0016u\u001e\u0004}\u0018\u0002e\u001dOl\u001c\nc\u0018\u0015!\u0011\u0013oX\u0007j\u0011\u0017s\u0004\u0004!\u0013\fk\u001b\u0000a\u0014Mg\u0004\u0006! \u000fg\u000f\u0004}\"\u0006`\u0013\u0013j\u001e\u0000c";
      f710[27] = int.class;
      f711[27] = "java/lang/Integer";
      f710[28] = "5&X.\u001b+>)Iaz%5\"M;";
      f710[29] = "H+\u0018todT1\u001a(upD2Q9qxB7\u000bt|aNw-/nyB+7;~zf\t6";
      f710[30] = "O=<\u0016yHS'>Jc\\C.u[gTE!/\u0016jMIa(AxIE\"uqCHD\u0002:VjZE=";
      f710[31] = "\u001egp\u001c\u0007K\n|n\u000enM\u001exa\u0003)]wvf\t\fOGes\rU3\u001egp\u001c\u0007K\n|n\u000en";
      f710[32] = "\u000efk\u001dH\u0014Sd&\u0017qANtf4\rWU{voKM\u0005  U\u0003FL~\u0019R\u001bUL#}\fMNJ\u001d$\u0005\tU\nyzS\u0012S4|k\u0016\u000bP\u000bq!\u0006J-\twa\u0017OIW!z\u0011q";
      f710[33] = "Ox\b'`\u0013L.X`\u001bF\u0018<{>`Q\u0011)F\u0019rL\u0018@\r?*\u0014LzE4cJu";
      f710[34] = "\u0014\u001dO%_@\u0014J\u0014)4џ+\u0018QsVG\u001b\u000bDw\u000f";
      f710[35] = "4'\u000eeP\u001ei%CoiHc 2p\u000f[N1\u001dx\t[\u000ea\u0016o\u0011\u0019j?@t\u0017'";
      f710[36] = "`NW]5\u0000jH_W[KcK\u0007I'\\t\u007f\u000bN'PhK\u001d24PtH\u0017\r+\u0001s\u001ff\u0003a\u000ftC\u001a_j\u0001o$";
      f710[37] = "]-q~\u0007^]z*rlJ\u000f>Q&\u0006H\u0006B//]\u0018[xg$\u0014Fb";
      f710[38] = "\u0006O)\u007f1QVJ?-\\\u000f[N)\u007f\u000bX\u0004\u0013r\u0013a\u0007D_5v&\u0004WL";
      f710[39] = "\u000234\u000e=\u001d\u0002do\u0002V·=l4\u0004f\u001fY`2U6f\ffnE1\u001aPm`^V";
      f710[40] = "Ub\u000e0'~\bmKbCvMLP7&z}wT=9LGv[7/\u0017\\jW8?'O\u007fSaC";
      f710[41] = "h9\u0002`WvhnYl<ŌWk\f)D335Z2B";
      f710[42] = "\u000774)\u0000\r\u0016=.db\u0010\u0000;\u0010\u007f\u0006\u0002\u0000G,p\u0005\u0015W.3{\u0002\u0005m";
      f710[43] = "(b\u0002^'l;>Z\u0003V?I:\u0000^k*sr\u000b\u00175\u0013s`QRo);k\u0018\fV";
      f710[44] = "YR+\u001a\u000biY\u0005p\u0016`ūfP0\u0010\u0004`_YtO\u0019";
      f710[45] = "AIfkE7A\u001e=g.#\u0013Z^7^0~\u001cbk\u0013uDTi\"ML";
      f710[46] = "TtEo;\u0010T#\u001ecPΗkr\u0010o*\fVb\u001cb`";
      f710[47] = "7;Pz:<>\u007f\u000fgHj785w,x7\u001e$THd(=\u0011cwib-P\u001e";
      f710[48] = "_nq@\u001dcNdk\r\u007fհ5~wE\u000etMn{\u0003\u001c\u0011";
      f710[49] = "$\u001b]Fm\u001f5\u0011G\u000b\u000f\u0004\"\u0007|\u0004e6#\u0017[\u0018i\u00025kH\u0018u\u0001?TWIrVNZ\u001dGu\n2\u0006\u0016Inm";
      f710[50] = "|\u0001\u0013<Ox:\u000e\u001e\u0002ɹH \u001fGs@00\u0013\u0001a%";
      f710[51] = "R_y\u0013\u001a\u001dR\b\"\u001fqұmY,\u0013\u000b\u0001PI \u001eA";
      f710[52] = "w\u001aE$\u000fSv\u0015Hf~\u0016\u001bQWlC\u0003!\u0019\\%\u001d:!\u000b\u0006`G\u0000i\u0000O>~";
      f710[53] = "*Mx:aMlBu\u0004d\u0010ji\u007faf},O'92GdDng\u000b";
      f710[54] = "\u0010\u0017D\u001cT\u001e\u0019S\u001b\u0001&\\\u0010\u00146\u001c^G\u0014!\u001b\u001cAX\u0010\u0004\u007f\u0012\\@\u001f\u0014O\u0001IDFh\u0012\u0007\u001dC\u000fQ\u001bCB^}";
      f710[55] = "\"eg\u0006rn:8z\nCn,u_\u0015/D(ov\u0007.{AjmV)e(7b\u0013{\u0001";
      f710[56] = "'adp'qaniN\",gMm(1\u001bvef#7,a\u000305?3\":m7r9\u001b";
      f710[57] = "\u000e5\u001a}g\u0019\u001a.\u0004o\u000e\u000b\u0000)\u0012bg\u00079'\u0012rca\r4\u0011mrQ\u001e!\u00154\u000e";
      f710[58] = "\tqJ27h@0Rj\u000e3Y\u000f\u0016;j:_?F>|h";
      f710[59] = "\u0010X~O\u0005%\u0010\u000f%CnƦ/ZeE\n,\u0016S!\u001a\u0017";
      f710[60] = "\u0013%YN\u00027N'\u0014D;aD\"p@AoO1t]WrI^\u0011\\\n3\u0010dYWCm)cADC0M=\u0017_E\u000e";
      f710[61] = ".?<Z9\u0016'{cGKT.<Y_0N)!c_7^C 9\u0007-H>2fD /.?<Z9\u0016'{cGK";
      f710[62] = "37|\r\u000b\\u8q3խlo)(B\u0004\u0014\u007f%nPa]5khT\u001d\u0001>es3";
      f710[63] = "{=\u0016\u0012MT+8\u0000@ \n&<\u0016\u0012w]xkN~\u001e\u0018z+L\u001eK\u0001.i";
      f710[64] = "q2jgn'qe1k\u00056Nm20e=.ew,w\\~ah6d<v$t$\u0005";
   }

   public TextHudElement() {}
}
