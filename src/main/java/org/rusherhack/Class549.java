package org.rusherhack;

import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.core.setting.StringSetting;

public class Class549 extends Class517<StringSetting> {
   public boolean f8842;
   public String f8843;
   public static Object[] f8845 = new Object[39];
   public static String[] f8846 = new String[39];

   @Override
   public String m4900() {
      if (this.f8842) {
         return this.f8843 + "_";
      } else {
         return ((StringSetting)super.f8251).isNameVisible() ? ((StringSetting)super.f8251).getDisplayName() : "";
      }
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      if (this.f8842) {
         switch (var1) {
            case 256:
            case 257:
               this.f8842 = false;
               this.m12864();
               boolean var9 = true;
               return true;
            case 258:
            default:
               boolean var8 = true;
               return true;
            case 259:
               if (this.f8843.length() > 0) {
                  String var10001 = this.f8843;
                  int var10003 = this.f8843.length();
                  boolean var10006 = true;
                  this.f8843 = var10001.substring(0, var10003 - 1);
               }

               boolean var10002 = true;
               return true;
         }
      } else {
         return super.keyTyped(var1, var2, var3);
      }
   }

   @Override
   public boolean m4901() {
      return false;
   }

   @Override
   public boolean charTyped(char var1) {
      if (this.f8842) {
         this.f8843 = this.f8843 + var1;
         boolean var10002 = true;
         return true;
      } else {
         return super.charTyped(var1);
      }
   }

   public void m12864() {
      ((StringSetting)super.f8251).setValue(this.f8843);
   }

   @Override
   public String m4902() {
      return this.f8842 ? "" : ((StringSetting)super.f8251).getDisplayValue();
   }

   public Class549(PanelBase<?> var1, Renderer107 var2, StringSetting var3) {
      super(var1, var2, var3);
      this.f8842 = false;
      this.f8843 = "";
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      this.getPanel().getRenderer();
      this.getPanel().getFontRenderer();
      super.f6219 = this.m9517(var2, var4);
      super.render(var1, var2, var4);
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      Class549 var10;
      if (this.m5378(var1, var3)) {
         boolean var10001;
         if (!this.f8842) {
            var10001 = true;
            boolean var10003 = true;
         } else {
            var10001 = false;
            boolean var11 = true;
         }

         this.f8842 = var10001;
         if (this.f8842) {
            this.f8843 = (String)((StringSetting)super.f8251).getValue();
            var10 = this;
         } else {
            var10 = this;
            this.m12864();
         }
      } else {
         if (this.f8842) {
            this.f8842 = false;
            this.m12864();
         }

         var10 = this;
      }

      return var10.mouseClicked(var1, var3, var5);
   }

   static {
      m3938();
   }
   public static void m3938() {
      f8845[0] = "@G~W 4\\]|\u000b: L^7\u001a>(J[mW31F\u001bl\u0010|1N[|\u0015|\u0011N[|\u0015\u0010 \\P";
      f8845[1] = "jW^\u001aL\u0011vM\\FV\u0005fN\u0017WR\r`KM\u001a_\u0014l\u000bKQP\u0000`W\u0017RQ\nq\u000bprQ\nqw\\ZZ\u0001w@K";
      f8845[2] = "$\u000b[R\bl8\u0011Y\u000e\u0012x(\u0012\u0012\u001f\u0016p.\u0017HR\u001bi\"WN\u0019\u0014}.\u000b\u00125(|%\u001dY\u000e\u001fky=";
      f8845[3] = "}jW^k\u0012apU\u0002q\u0006qs\u001eσ";
      f8845[4] = int.class;
      f8846[4] = "java/lang/Integer";
      f8845[5] = "\u000f\u001c\u0014;96\u0013\u0006\u0016g#\"\u0003\u0005]ȶ";
      f8845[6] = double.class;
      f8846[6] = "java/lang/Double";
      f8845[7] = "%\u0012^f\u0014\u00069\b\\:\u000e\u0012)\u000b\u0017+\n\u001a/\u000eMf\u0007\u0003#NL!H\u0003+\u000e\\$H#+\u000e\\$/\u0007/\r{)\u0015\u0016";
      f8845[8] = "Z\u001e\t@Q5F\u0004\u000b\u001cK!V\u0007@\rL2PB\u001d\u000bW4\\\u0002\t@p4G\u0005\u0000\tp%A\u0018\u0007\u0000D";
      f8845[9] = boolean.class;
      f8846[9] = "java/lang/Boolean";
      f8845[10] = "\u0018\u001e~Lho\u0004\u0004|\u0010r{\u0014\u00077\u0001uh\u0012Bj\u0007nn\u001e\u0002~LI\u007f\u0003\u0018p\f}";
      f8845[11] = "r6J$1\u0006y9[kL\u001ej>R\"";
      f8845[12] = "$0\u0002w{x8*\u0000+al()Kɟ";
      f8845[13] = "O0%\u0013\u0019SS*'O\u0003GC)lӂ";
      f8845[14] = "w \bt\u0011Fk:\n(\u000bR{9AȮ";
      f8845[15] = "#\b\u0011*J9?\u0012\u0013vP-/\u0011XҶ";
      f8845[16] = void.class;
      f8846[16] = "java/lang/Void";
      f8845[17] = "!;\th`\u001e=!\u000b4z\n-\"@´";
      f8845[18] = "\u0014\u001ce\u000f]W\u001f\u0013t@<Y\u0014\u0018p\u001a";
      f8845[19] = "b)_}v\\0l\u001c9\u000fB'R\r\"b}=o\u0005-kN\\*\u0001(\u007f[as\u000b\"a#";
      f8845[20] = "~Q\t//\u0006zD\u0017i\u0015X,@=vnO%U\u0000Q|R,<Nn(\u000b/BOpm\rA";
      f8845[21] = "V'o; O\u0011dq\n._\u0015Skl=h\u0004{`g;_\u0013\u001d5a.I\u0006brop\fi";
      f8845[22] = "1P\u0013IY\u0012v\u0013\rxW\u0002r0\u001d\u001eT\u0002t\u0007\nx\u0002Wh\u0017\u0016CU\u0016u\u0000p";
      f8845[23] = "\u001bX/&\u0012rM\u0007c8oԯ+\u0006.k\u0003 \u001a\u0005r$\tO";
      f8845[24] = "\u0019;pn\u001cyOd<paȝ)eq#\r+\u0018f-l\u0007D";
      f8845[25] = "n2gb\u001d^14&2%ό_i\"c\u0019Z!h<&\u001f";
      f8845[26] = "5?Y\t>\t4!\u001c\u000fP\u0013g \u000bI0w1zUY?F2&\u001aSP";
      f8845[27] = " hpM\u0013\u0001\u007fn1\u001d+В\u0011f%I\u001a\u0019qu-M[k";
      f8845[28] = "\u001cR\u001f\u0010\tW\u001b\u0015\u0007\u00076Բ&VZYZX\u0017U\u0006\u0016P";
      f8845[29] = "N<R)\u0019s\u0018x\b|eǃ%<^4Y)[|\u000f5\u0003\u0010\u0019=\u001bp\\nYl\u001a*e.@o\u00134XwJe\rL";
      f8845[30] = "ZX\u001cwYk\u0005^]'ahkU\u001d3\bh\u0014\\Y9\u0019\u0001\u0002\u0001X\"\b~\u000bER3a";
      f8845[31] = "\u0003qn\\}!Q4-\u0018\u0004%P0\u000b\u000f`#PLj\u001f9bS2k\u0001|d=&<^5,]54Zt^";
      f8845[32] = "\u0012fkG\u007f\u0019\u0013x.A\u0011\u001cPu-\u0007k\u0006KpV@-VApgCq\u0019K\u001fmG \u000bB.n\u001bo\u0001- /F-\tS!1\u0003+g";
      f8845[33] = "!%`Nt)s`#\n\r9rd\u0017\u0015v.{q**d2bu[Ktk#v%Jj.%\u0018";
      f8845[34] = "jo\u0003qT\u0002=2\u001fqmϾQ3LwQC/s\u001dv\u000bzm2\t3T\u0004-c\bimAm>\u001d`\\B1q\u0017\u000f";
      f8845[35] = "g(G5\u0005\f8.\u0006e=ӄVr\u001efM\u001ek+\u0014lS";
      f8845[36] = "2rzrx\u00196gd4BG`c\\#&U`\u001fi;(GmmouxK\r";
      f8845[37] = "0\u0010\u007fB\u0000Yl\u0011t@}G`VKO\u001bEi*,\u001c\u001e\u0019lWk_\u0000(";
      f8845[38] = "4:'\ta g(2E\u000bт]g1M3`lc$Su";
   }
}
