package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.setting.ColorSetting$RainbowMode;
import org.rusherhack.client.api.ui.panel.PanelBase;

public class Class147 extends Renderer271 {
   public ColorSetting f2966;
   public static long f2967 = Class066.m4320(6209592408100923021L, 4482985976283100297L, MethodHandles.lookup().lookupClass()).m4325(57146090781547L);
   public static String[] f2968;
   public static String[] f2969;
   public static long f2971;
   public static Object[] f2972 = new Object[36];
   public static String[] f2973 = new String[36];

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.m5378(var1, var3) && var5 == 0) {
         ColorSetting var10 = this.f2966;
         boolean var10001;
         if (!this.f2966.isRainbow()) {
            var10001 = true;
            boolean var10003 = true;
         } else {
            var10001 = false;
            boolean var11 = true;
         }

         var10.setRainbow(var10001);
         boolean var10002 = true;
         return true;
      } else {
         return super.mouseClicked(var1, var3, var5);
      }
   }

   @Override
   public void m6448(double var1, double var3) {
      this.getPanel().getFontRenderer().drawString(this.m4900(), 2.0, 2.0, -1);
   }

   @Override
   public String m4900() {
      return "Rainbow";
   }

   public Class147(PanelBase<?> var1, Renderer107 var2, ColorSetting var3) {
      super(var1, var2);
      this.f2966 = var3;
      Class328 var8 = new Class328(this, "Override", ColorSetting$RainbowMode.DEFAULT, var3);
      Class069 var7 = new Class069(this, "Offset", 0, 0, (int)f2971, var3);
      this.addSubItem(new Class335(var1, this, var8));
      this.addSubItem(new Renderer136(var1, this, var7));
   }

   @Override
   public boolean m4901() {
      return this.f2966.isRainbow();
   }

   @Override
   public boolean isVisible() {
      if (!this.f2966.isThemeSync()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
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
   public static void m1731() {
      f2972[0] = "\u0017[VbP}\u000bAT>Ji\u001bB\u001fɊ";
      f2972[1] = int.class;
      f2973[1] = "java/lang/Integer";
      f2972[2] = "{7\u001f\u0002B\u0016g-\u001d^X\u0002w.VO\\\nq+\f\u0002Q\u0013}k\u000bID\u0017}+\u001f\u0002s\fx*\n\u007fU\u0017`,\u0016K";
      f2972[3] = boolean.class;
      f2973[3] = "java/lang/Boolean";
      f2972[4] = "z#r9s^f9peiJv:;ĩ";
      f2972[5] = "\u0011QC\f\u001ak\rKAP\u0000\u007f\u001dH\nɖ";
      f2972[6] = "w]t\u0015`ikGvIz}{D=X}n}\u0001pT\u007fqyAw\u0015sn\u007fZ~^|h6|gI{r\u007flrKfijJ";
      f2972[7] = "r^4K)fyQ%\u0004T~jV,M";
      f2972[8] = "WT&\u0019\u0004{KN.E\u001eo[MoÅ";
      f2972[9] = double.class;
      f2973[9] = "java/lang/Double";
      f2972[10] = "\u0003lsZ\f\u0000\u001fvq\u0006\u0016\u0014\u000fu:Ⱦ";
      f2972[11] = "O.K4\u001e\tS4Ih\u0004\u001dC7\u0002y\u0000\u0015E2X4\r\fIrYsB\fA2IvB,A2Iv%\bE1n{\u001f\u0019";
      f2972[12] = "T=A\u0000E\u000bH'C\\_\u001fX$\bM[\u0017^!R\u0000V\u000eRaSG\u0019\u000eZ!CB\u00197k.HK[7O*K";
      f2972[13] = void.class;
      f2973[13] = "java/lang/Void";
      f2972[14] = "N\u001dW}$;E\u0012F2C9P\u0019Fyx";
      f2972[15] = "\u0012?G'?>\u000e%E{%*\u001e&\u000ej!\"\u0018#T',;\u0014cSl9?\u0014#G'\u000e$\u0011\"RZ(?\t$Nni\u0019\u001c$Nk\"<0\"Dl";
      f2972[16] = "sFoE\rvo\\m\u0019\u0017b\u007f_&\b\u0013jyZ|E\u001esu\u001a}\u0002Qs}Zm\u0007QS}Zm\u0007=boQ";
      f2972[17] = "KLUYggWVW\u0005}sGU\u001c\u0014y{APFYtbM\u0010@\u0012{vAL\u001c\u0011z|P\u0010{1z|PlW\u0019qwV[@";
      f2972[18] = "XQ>yT\u0016S^/65\u0018XU+l";
      f2972[19] = "/2h(?Kvmh'Nΐ\u0010?'xpY,|).?;-3/\u007f,\u0007n=y0N";
      f2972[20] = "vA5:(ds\u001e&fZnq^\u000bl<}FO#g7{qXE`jg&H:03;{\"";
      f2972[21] = "\u0010\\h\u000f\u0016R@\u00054R|A\u0001\u0005qn\u0000W\u001a\na5A\u001cBRl\t\u0002\u0012\u0014\u001d\u000e\u000b\u001a\u0012\u0004\fb\u000bD\u0010\u001el0SCR\u001b\u00000\rAH{U3\\\u0017_\u0011\u0011bNM-E\n1J\u001cAET3P|";
      f2972[22] = "S$\byZU\u0000h\u001b\u0019Ԁ3T$\u0002r\u0012Y\u0010u\u0010(`";
      f2972[23] = "|)Lp~\u0013/e_\u0010ȝu{)F{6\u001f?xT!D";
      f2972[24] = "sDk\u007fn)![|-\u001221fa,w>\u0011Kg*\u0012i \u0004q+vi5@lA";
      f2972[25] = "\u001aRIM\r;Z\u0017\u001b\u001cb I@)\u000f\b\bYA\u0017rR.^MJL[3OKrC\t0Z\u0014\u0012J_xO,";
      f2972[26] = "\u0006X\"=zpW^r+\u001ax=\fy#!mB\\!6w\u0011\u0006Qx\u007ffnV\tm)\u001a";
      f2972[27] = "B\u0000\n2]OBARu:Ǿ\u007fEQ4EM\u0013E\u000f6_-A\u001d\btZAAC\nn:\u0017\u0015EGa^\u0017\u0000\u0001Z\u000b";
      f2972[28] = "j%~\u001c\u0012f8:iNng>'NK\u000fz9<k\"Tvm+~FTc)6\u0014\u001b\u0010vm'nI\u000fa?[";
      f2972[29] = "\u000f\u0003qxK\u0001K\u001bplpU3]}-N\u001b\u000f\u001es{\u0001y\u000eQu*\u0012EM_#ep";
      f2972[30] = "(\u0016\u0002}:\u0012;\u001eD)P\u0015(\u0018\u0006|\u0017\u0005AEFx;\u0019+\u0001\u0017jak(\u0016\u0002}:\u0012;\u001eD)P";
      f2972[31] = "pVlx3\u007f!P<nSɷK\u0000/kmb1R0|?";
      f2972[32] = "E\u0007;\u0017\u0000\\\u0014\u0001k\u0001`Ά~U7W^_B\u00169\u0001\u0011=";
      f2972[33] = "(}7q?Pzb #CKjY4.%@v|]u)\u0014ai9u<P|\u0003";
      f2972[34] = "QRvNbL[L|L\u0005mug\u000e.A}8@<B8FUJ\"H:";
      f2972[35] = "\tC1VtMI\u0006c\u0007\u001bP[AR\u0000}RR=`\nk\u000eDXeUxR6";
   }
}
