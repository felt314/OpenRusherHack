package org.rusherhack;

import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.ui.panel.PanelBase;

public class Class212 extends Renderer107 {
   public ColorSetting f3883;
   public Class129 f3884;
   public Renderer004 f3885;
   public Renderer309 f3886;
   public Renderer445 f3887;
   public Renderer004 f3888;
   public Renderer309 f3889;
   public Renderer309 f3890;
   public Renderer309 f3891;
   public Renderer004 f3892;
   public Renderer004 f3893;
   public static Object[] f3895 = new Object[58];
   public static String[] f3896 = new String[58];

   @Override
   public boolean charTyped(char var1) {
      if (this.f3889.charTyped(var1)) {
         boolean var8 = true;
         return true;
      } else if (this.f3891.charTyped(var1)) {
         boolean var7 = true;
         return true;
      } else if (this.f3890.charTyped(var1)) {
         boolean var6 = true;
         return true;
      } else if (this.f3886.charTyped(var1)) {
         boolean var10002 = true;
         return true;
      } else {
         return super.charTyped(var1);
      }
   }

   public Class212(PanelBase<?> var1, Renderer184 var2, ColorSetting var3) {
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.f3884.isHovered(var1, var3)) {
         return this.f3884.mouseClicked(var1, var3, var5);
      } else if (this.f3887.isHovered(var1, var3)) {
         return this.f3887.mouseClicked(var1, var3, var5);
      } else if (this.f3888.isHovered(var1, var3)) {
         return this.f3888.mouseClicked(var1, var3, var5);
      } else if (this.f3892.isHovered(var1, var3)) {
         return this.f3892.mouseClicked(var1, var3, var5);
      } else if (this.f3893.isHovered(var1, var3)) {
         return this.f3893.mouseClicked(var1, var3, var5);
      } else if (this.f3885 != null && this.f3885.isHovered(var1, var3)) {
         return this.f3885.mouseClicked(var1, var3, var5);
      } else {
         this.f3889.mouseClicked(var1, var3, var5);
         this.f3891.mouseClicked(var1, var3, var5);
         this.f3890.mouseClicked(var1, var3, var5);
         this.f3886.mouseClicked(var1, var3, var5);
         return super.mouseClicked(var1, var3, var5);
      }
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      this.f3884.render(var1, var2, var4);
      this.f3887.render(var1, var2, var4);
      this.f3888.render(var1, var2, var4);
      this.f3892.render(var1, var2, var4);
      this.f3893.render(var1, var2, var4);
      this.f3889.render(var1, var2, var4);
      this.f3891.render(var1, var2, var4);
      this.f3890.render(var1, var2, var4);
      if (this.f3885 != null) {
         this.f3885.render(var1, var2, var4);
      }

      this.f3886.render(var1, var2, var4);
   }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
      this.f3884.mouseReleased(var1, var3, var5);
      this.f3887.mouseReleased(var1, var3, var5);
      this.f3888.mouseReleased(var1, var3, var5);
      this.f3892.mouseReleased(var1, var3, var5);
      this.f3893.mouseReleased(var1, var3, var5);
      if (this.f3885 != null) {
         this.f3885.mouseReleased(var1, var3, var5);
      }

      this.f3889.mouseReleased(var1, var3, var5);
      this.f3891.mouseReleased(var1, var3, var5);
      this.f3890.mouseReleased(var1, var3, var5);
      this.f3886.mouseReleased(var1, var3, var5);
      super.mouseReleased(var1, var3, var5);
   }

   @Override
   public double getHeight(boolean var1) {
      return super.getHeight(var1) + this.f3886.f8552 + 1.0;
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      if (this.f3889.keyTyped(var1, var2, var3)) {
         boolean var10 = true;
         return true;
      } else if (this.f3891.keyTyped(var1, var2, var3)) {
         boolean var9 = true;
         return true;
      } else if (this.f3890.keyTyped(var1, var2, var3)) {
         boolean var8 = true;
         return true;
      } else if (this.f3886.keyTyped(var1, var2, var3)) {
         boolean var10002 = true;
         return true;
      } else {
         return super.keyTyped(var1, var2, var3);
      }
   }

   static {
      m343();
   }
   public static void m343() {
      f3895[0] = "\\n\u000b'H\u000f@t\t{R\u001bPwBӞ";
      f3895[1] = double.class;
      f3896[1] = "java/lang/Double";
      f3895[2] = "F\u0019:\bw?Z\u00038Tm+J\u0000sƖ";
      f3895[3] = "K\u0000\u0016\u0014b,W\u001a\u0014Hx8G\u0019_ɟ";
      f3895[4] = "V\"]bpzJ8_>jnZ;\u0014Ũ";
      f3895[5] = "l\bFW\u001dVp\u0012D\u000b\u0007B`\u0011\u000fѓ";
      f3895[6] = int.class;
      f3896[6] = "java/lang/Integer";
      f3895[7] = boolean.class;
      f3896[7] = "java/lang/Boolean";
      f3895[8] = "TYNY\u001cnHCL\u0005\u0006zX@\u0007ȃ";
      f3895[9] = "T\u000e$u9LH\u0014&)#XX\u0017m\u001d";
      f3895[10] = "\u0001P\u0017PXM\u001dJ\u0015\fBY\rI^ɸ";
      f3895[11] = "bb^\u001c\u00101~x\\@\n%n{\u0017Q\u000e-h~M\u001c\u00034d>KW\f hb\u0017`\u0007*iuKq\r*yuAF";
      f3895[12] = void.class;
      f3896[12] = "java/lang/Void";
      f3895[13] = char.class;
      f3896[13] = "java/lang/Character";
      f3895[14] = "^-GuQ8B7E)K,R4\u000eĺ";
      f3895[15] = "HA'1O\u001aT[%mU\u000eDXn|Q\u0006B]41\\\u001fN\u001d3zI\u001bN]'1~\u0000K\\2LX\u001bSZ.x";
      f3895[16] = float.class;
      f3896[16] = "java/lang/Float";
      f3895[17] = "Wz\u001a{XLK`\u0018'BX[cS6EK]&\u0014;^\\Jn\u001c6OJ\u0016A>9CZSi\u001f9O";
      f3895[18] = "\u000f\u0005b\u00121\u0019\u0004\ns]P\u0017\u000f\u0001w\u0007";
      f3895[19] = "Z|i\fXl[t7\u0007;ɫc7l\bZzR2kJW";
      f3895[20] = " \u001e\u000f3~W\u007f\u000bVgEY|\u0018H2\u000eXz\u000eP2)<\"U\n3+W&\\\b#E\u0005+\\_1.\u0001\"^O_yP$\u001aI&!\u0007`\u00143b+Qe\\\u0002\"?Nje";
      f3895[21] = ".8@V\u001fh/0\u001e]|q\u0017u\t]Gjx#CT\u0001\u0018*:\n\u0017\u000ew|p\u0003Q|";
      f3895[22] = "GN\u0011\u0012>HFFO\u0019]ѩ~\u0000F\u0018$\t\u0001\u0007\u001a\u0016\"";
      f3895[23] = "\b\u0011\u0014\u0004\u001b\u000f\u000f\u0003\u0002\u001c$Ԍ6_\u0016[[\u0016O\u0007A\u001fUl";
      f3895[24] = "RNi\u0005)lBC~lЫV\u0004\u0017+\u0000x=\u0000\u001e)\u0010";
      f3895[25] = "=HTW=\u0002:ZBO\u0002ȸ\u0003\u0006V\b}\u001bz^\u0001Lsa";
      f3895[26] = "\u0001\u0005\\\u001c\u001f\u0013VY\u0000\u0019}Ah\u0000R\u001b\u0018LUW\u000eG\u001d";
      f3895[27] = ":T\u000b\u0015BWm\bW\u0010  SQ\u0005\u0012E\bn\u0006YN@";
      f3895[28] = "\u0019\"\u007fIPg\u001e~qOa}@3t]*|F%l]\r\u0018\u001e~6\\\u000fs\u001aw4La!\u0017wc^\n%\u001eus0]t\u00181uI\u0005#\\?\u000f\r\u000fuYw>M\u001bjVN";
      f3895[29] = "\u000eL\n7<N\u000fDT<_ϳ7\u0006_='S\fRX?#";
      f3895[30] = "\rM\u0019_1N\u001d@\u000e6o\u000f\"C\u001c[t\u0019\u000e$[\u00067\u0018\fO_\u000f5\bb\u001dR\u000fb\u001a\t\u0019[\rrt_J\u000fH7E\u001f^\u0010G\u000e";
      f3895[31] = ">\f-\u0002\\&6\u000e(\u0003:4:\u0012\u0010@W[=\u0007aLU4)\fnQ:";
      f3895[32] = "h&c\u001bKXi.=\u0010(ɎQh4\u0011Q\u0019.oh\u001fW";
      f3895[33] = "\u0012O#V\u001b*\u0013G}]x˗+\u0005v\\\u00007\u0010Qq^\u0004";
      f3895[34] = "Y\u0010mz{g^Lc|J}\u0000\u0001fn\u0010u\u0003\u0011tx'tgE-:&v\fA$86\u0018^L.o.sZE&\u007fJ$\u000bCby3|\\\u0007l\u0003zu\u001f\u000eb:0)^\f\u001d";
      f3895[35] = "\u0000st\u0013\u001a\u0017\u0005t6\u001e|C\\0q\u001f7BZ&i\u001f\u0010&\u0002}3\u001e\u0012M\u0006t1\u000e|\u001f\u000btf\u001c\u0017\u001b\u0002vvr@J\u00042p\u000b\u0018\u001d@<\nO\u0012KEt;\u000f\u0006TJM";
      f3895[36] = "Os\u0002|m N{\\w\u000eӤvj[{16\u000bbY~0";
      f3895[37] = "r{ol\u0003\u001eu'aj2\u00007Wxk_\u001b!{\u001f,\u0002X yt(\u000bZ0\u0017&%\u000b\r\"|\",\t\u001dL*qxLX}jegCa";
      f3895[38] = "\u001d\u001bos\b\f\u001c\u00131xkѳ$Q:y\u0013\u0011\u001f\u0005={\u0017";
      f3895[39] = "i^\u0019UZ0n\u0002\u0017Sk5:T\u0005A\u0011OhN\tOU4h\fSIkvg\u000b\u0005B\u0000rn\t\u0015,R\u007fn^\u0007GVvlNi\u001c\u00067%MPVZv'2";
      f3895[40] = "ky\u000f\u00026j4lVV\rɚPhZ_|n?|QPa";
      f3895[41] = "~U&\u000e\u001fZ!@\u007fZ$K(Hv\u000f^1zRz\u0001\u001aJz\u0010 \u0007$\bu\u0017v\fO\f|\u0015fb\u001d\u0001|Bt\t\u0019\b~R\u001aRII7Q#\u0018\u0015\b5.";
      f3895[42] = "wvPqbff4Rq\u001e~{7\u0010uDvx'\u0002csw\u001cs[!ruwwR#b\u001b%zRtpp!sPd\u001e'pu\u0014bg\u007f'1\u001a\u0018.vd8\u0014!d*%:k";
      f3895[43] = "zXq\u001c~S%M(HE]&^6\u001d\u001fU%N$\u000b(TA\u001a}I)V*\u001etK98x\u0013t\u001c+S|\u001av\fE\u0004-\u001c2\n<\\zX<puU9Q2I?\txSM";
      f3895[44] = "PNF\u001cg;UI\u0004\u0011\u0001p\u0006\u0016T\u0010{\nT\fX\u001e?qTN\u0002\u0018\u00013[IT\u0013j7RKD}8:R\u001cV\u0016<3P\f8Mlr\u0019\u000f\u0001\u000703\u001bp";
      f3895[45] = ":\u000e+Z1\u0013*\u0003<3Ɵ)lWi_`Bh^kO\u000e";
      f3895[46] = "& 6K(@r'4OE\u0018q?\u001aB=\u0016pNz_z\u0004f7\"\b>\n\u001cr*\f:\u0001e*}H4{ \"yL?\u0002xu=BEFr#8\nt\u0006f<73";
      f3895[47] = "\u0015\u0005d[\u000fsBY8^mb|\u0000j\\\b,AW6\u0000\r";
      f3895[48] = "h\u0003\t0\u00034<\u0004\u000b4nj5\u0010\u0002%%k3\u0006\u001a%\u0002\u000fk]@$\u0000doTB4n6bT\u0015&\u00052kV\u0005HRcm\u0012\u00031\n4)\u001cyu\u0000b,TH5\u0014}#m";
      f3895[49] = "<'| pNh ~$\u001d\u000fk/`5gu95l;#\u000e9w6=\u001dL6p`6vH?rpX$E?%b3 L=5\fhp\rt65\",LvI";
      f3895[50] = "z!\u0001GuS\u007f&CJ\u0013\u0007&b\u0004KI\u000f%r\u0016]~\u000eA&O\u001f\u007f\f*\"F\u001dobx/FJ}\t|&DZ\u0013^- \u0000\\j\u0006zd\u000e&#\u000f9m\u0000\u001fiSxo\u007f";
      f3895[51] = "\"\u0013AS\u0011\u0010#\u001b\u001fXrΖ\u001b]\u0016Y\u000bQdZJW\r";
      f3895[52] = "5\u0004a-:R4\f?&Yԫ\fN4'!O7\u001a3%%";
      f3895[53] = "q=:g;~p5dlXͻHvz!45#)ox`";
      f3895[54] = "\b^=Y;'\\Y?]VwRY7}'d_\\M\u00102#@\u00016J?%\u000f0pO;b\u000b\u00010[$m2";
      f3895[55] = "'`\u000brk /b\u000es\r<5K\u00125m4\u0007f\u0012*r0\"\u0002K#`#w3\u000b7\u007f,N";
      f3895[56] = "4u&\u0001`;5}x\n\u0003ˣ\r;q\u000bzzr<-\u0005|";
      f3895[57] = "q@\u001e\fF;&\u001cB\t$c\u0018E\u0010\u000bAd%\u0012LWD";
   }
}
