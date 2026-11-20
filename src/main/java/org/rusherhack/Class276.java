package org.rusherhack;

import org.rusherhack.core.utils.MathUtils;

public class Class276 {
   public Class569 f4749;
   public Class569 f4750;
   public double f4752;
   public double f4753;
   public static Object[] f4755 = new Object[44];
   public static String[] f4756 = new String[44];

   public Class276 m9618(Class569 var1) {
      this.f4749 = var1;
      return this;
   }

   public void m9619(long var1, float var3) {
      if (this.f4750.f9138 < 0.0) {
         this.f4750.f9138 = 1000.0;
      }

      if (this.f4750.f9137 < 0.0) {
         this.f4750.f9137 = 1000.0;
      }

      if (this.f4750.f9138 > 1000.0) {
         this.f4750.f9138 = 0.0;
      }

      if (this.f4750.f9137 > 1000.0) {
         this.f4750.f9137 = 0.0;
      }

      var1 = System.currentTimeMillis() - var1;
      double var8 = this.f4752 / 50.0 * var1;
      this.f4750 = new Class569(this.f4750.f9138 % 1001.0, this.f4750.f9137 % 1001.0);
      this.f4750 = this.f4750.m17455(this.f4749.m17466(var8));
      this.f4752 = MathUtils.interpolate(this.f4753, this.f4752, var3);
   }

   public void m9620(int var1, int var2, float var3) {
        
    }

   public Class276 m9621(double var1) {
      this.f4753 = var1;
      return this;
   }

   public Class276(Particles var1, Class569 var2) {
    }

   static {
      m122();
   }
   public static void m122() {
      f4755[0] = "]%1\u0016g\u000fA?3J}\u001bQ<xԊ";
      f4755[1] = double.class;
      f4756[1] = "java/lang/Double";
      f4755[2] = "lQGX\u001dwpKE\u0004\u0007c`H\u000eɰ";
      f4755[3] = int.class;
      f4756[3] = "java/lang/Integer";
      f4755[4] = "!\fu\u001ebL=\u0016wBxX-\u0015<Ϫ";
      f4755[5] = "t?\\\u0004ip\u007f0MK\u0001pq?^";
      f4755[6] = float.class;
      f4756[6] = "java/lang/Float";
      f4755[7] = "W\u0003hN\u0019\u0005K\u0019j\u0012\u0003\u0011[\u001a!ӷ";
      f4755[8] = "~h\u000em\u0017\u0010br\f1\r\u0004rqGɨ";
      f4755[9] = "UJ\u0017T\u007fXIP\u0015\beLYS^\u0019b__\u0016\u0003\u001fyYSV\u0017TCXWZ\u0015\b^HNL\u0019\u0014j";
      f4755[10] = long.class;
      f4756[10] = "java/lang/Long";
      f4755[11] = void.class;
      f4756[11] = "java/lang/Void";
      f4755[12] = "s\u0014Q%n^o\u000eSytJ\u007f\r\u0018hsYyHEnh_u\bQ%YEi\u000benh_u\bQ";
      f4755[13] = "[et5\u0012]PjezsS[aa ";
      f4755[14] = boolean.class;
      f4756[14] = "java/lang/Boolean";
      f4755[15] = "TI8H\u0016AHS:\u0014\fUXPq\u0005\u000bF^\u0015,\u0003\u0010@RU8H7QOO6\b\u0003";
      f4755[16] = "c\u0018<UH\u007f\u007f\u0002>\tRko\u0001uȏ";
      f4755[17] = ";cG\u0012M\u0018'yENW\f7z\u000e_P\u001f1?UHV\u0001'?m]K\u0005\u0001eIPL";
      f4755[18] = "6\u0015K\u0012<\u000f=\u001aZ]A\u001a/\u0000X\u001e";
      f4755[19] = "js\"~%die>\u0018Ϝ\u0001js\"~%die>\u0018>`|{/xvp8\u001f";
      f4755[20] = "\u0018j\u0003E#PT8@\u0005NȨ&'\u001aJ*PFo\n\u000e";
      f4755[21] = "5-P\nqc7iEQ\u001bլ\fk\u0015\u0004\u007f7saS\u000b%\f";
      f4755[22] = "\t+! V5\u000bo4{<ȃ0md.XaOg\"!\u0002Z";
      f4755[23] = "=,|F;\u00189|bIC\u038d\u0006/\u007fJ%\u0018c,iVC\u0018j$uA&\u001b|8\u0013";
      f4755[24] = "zYj Z-<Cl%`1%Cj!>6%Yn]\\n<N<d^g<V\u0003";
      f4755[25] = "(xM[\u0017\u000e+{\u001e\u0013&>\u0015(L\u000e\u001fBh+O]W";
      f4755[26] = "GLiL>\u001a\u000b\u001e*\fSƫy\u0001pC7\u001a\u0019I`\u0007";
      f4755[27] = "Jm\"\u0004yzN=<\u000b\u0001ɍq96\u0005h,\u0018?$\u00178";
      f4755[28] = "S(\u001c\u0001\u0019~\u001fz_Atձm,\u000e\u001e\u001ai\u0004(^\u0000\u0015";
      f4755[29] = "\u001d\u0003l\u001d\u000fv\u001dV2L3r\u0010C<_Kt\u0012V-H3a\u0017@5JS)\u0007\u0004QWRl\u0012P1\u001fB(vM0ZW|\u0016\u0005 \u001e3a\u0017@5JS)\u0007\u0004Q";
      f4755[30] = "\u000e%i\\|J\u00194}@DF\n6IR T\nJ&\\6\u0010\u0006pm\u000bxRg";
      f4755[31] = "j\u0000yN)Ni\u0016e(ź+q\rdL/K9\u001d ()Ga\nrM*Q}l";
      f4755[32] = "\r#k\\ZG\u000e5w:҉\"\r#k\\ZG\u000e5w:ZN\u0006)`_YX\u001aO";
      f4755[33] = "\nR\u0016'R\u000fF\u0000Ug?Խ4\u0004\u00025Y\tQ\u0007\u0014)";
      f4755[34] = ">?M:!e:oS5Yj\u0005kY;03lmK)`";
      f4755[35] = "4LdJ2Rx\u001e'\n_З\nL~\\:Zw\u000bnX1=6BaP`\u00044KaH_\u0002r\rxA\"\fe\u0019c:";
      f4755[36] = "wF\r\u0005T@tP\u0011cǪ%lK\u0010\u0007RE$[T";
      f4755[37] = "Y_l]s\u0014]\u000frR\u000bȨb\naUn\u001a\u001fMqQe";
      f4755[38] = "\f\u0018#\u0015\u000f\u0019\bH=\u001awȢ7B)\u0001\r\tX\u001f*\u0010\u000e";
      f4755[39] = "QP\u0002rSfRSQ:bv\u0015@\u0007/\u0019\u001b]Z\u001cr\u0003!\u0016\rR0b*\u001e\u0001\u000e5\u000f`\u0014V\u0016K";
      f4755[40] = "H4Z'd\u001c\u0004f\u0019g\t\u001ava\u001c/r\u001a\u00100\u0012f{s\u001c5Z,`\u0015M;\u0013%\t";
      f4755[41] = "{uTfS\\7'\u0017&>ոE#@tXZ  Vh";
      f4755[42] = "N@\u00144\u0007\u0010[\r\u001bug\u0018_\u0006_'\u0001\u000f~\u001d@'\"\u0012F\u0018D1gL@\u001a@-\u001a\u000bP\u001eKJ";
      f4755[43] = "J)=BW\bI?!$ħmQ$ @Q\r\u00194d";
   }
}
