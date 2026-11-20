package org.rusherhack;

import java.awt.Color;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.setting.ColorSetting;

public class Renderer445 extends Renderer532 {
   public boolean f7307;
   public float f7308;
   public static Object[] f7310 = new Object[35];
   public static String[] f7311 = new String[35];

   @Override
   public double m191() {
      return 6.0;
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   public int m14131(double var1, double var3) {
      if (!(var1 < 0.0) && !(var1 > this.m190()) && !(var3 < 0.0) && !(var3 > this.m190())) {
         var1 /= this.m190();
         var3 = 1.0 - var3 / this.m190();
         return Color.HSBtoRGB(this.f7308, (float)var1, (float)var3);
      } else {
         return 0;
      }
   }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
      this.f7307 = false;
   }

   public Renderer445(Class212 var1, double var2, Class212 var4) {
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      this.f7307 = true;
      super.mouseClicked(var1, var3, var5);
      return true;
   }

   static {
      m194();
   }
   public static void m194() {
      f7310[0] = "d\u0001o$&+x\u001bmx<?h\u0018&ӝ";
      f7310[1] = double.class;
      f7311[1] = "java/lang/Double";
      f7310[2] = "2LapXO.Vc,B[>U(ɘ";
      f7310[3] = int.class;
      f7311[3] = "java/lang/Integer";
      f7310[4] = "'Ne'(T;Tg{2@+W,У";
      f7310[5] = "O\fG1+tS\u0016Em1`C\u0015\u000eɫ";
      f7310[6] = "\nq\u001f\u0003B7\u0017dG!\u0003:\u000fb";
      f7310[7] = float.class;
      f7311[7] = "java/lang/Float";
      f7310[8] = "\rm8h/l\u0011w:45x\u0001tq´";
      f7310[9] = "Np&0QZRj$lKNBioƮ";
      f7310[10] = void.class;
      f7311[10] = "java/lang/Void";
      f7310[11] = ".j+|a 2p) {4\"sb1\u007f<$v8|r%(6>7}1$jb\u001bA0/|) v's\\";
      f7310[12] = boolean.class;
      f7311[12] = "java/lang/Boolean";
      f7310[13] = "q\u0002u)\u001c0m\u0018wu\u0006$}\u001b<d\u0002,{\u001ef)\u000f5w^ab\u001a1w\u001eu)-*r\u001f`T\u000b1j\u0019|`";
      f7310[14] = "Pw\\&\\g[xMi=iPsI3";
      f7310[15] = ")~OS\u001c2 (\u0011*սO0tGS\u0013s+(I*";
      f7310[16] = "q\u0014;wOo,\u00191iv҂K\u0015,{\u000fmw\u000epuv";
      f7310[17] = "\u0010JK\u000fp.B\t\u001b\u0017\u001b˶.\n\u001b\u0005b4\u0012\u0011G\u000b\u001b";
      f7310[18] = "M*[L7w\u0005>X_[սtjHU0g\u0017 ZMf\u001d";
      f7310[19] = "L\u0011\u0017N|HEGI7б5U\u001b\u001fNs\tNG\u0011";
      f7310[20] = "\u0010i\u000e|ccHj\u00058\u0003Ǜ./Lh}y_~Gpd\u001d";
      f7310[21] = "M\u0011])q\u001a\u0000\u0010E%\u0003\u000b\u001cR|CI/\u0016J[b\u0003YH\u001eM\u007fx\t\nHD\u0018>]A_[cn\u001f\u0017V<%:T\u0000IGux\u0002\t.\u0000'bU\u0003PM&zYq";
      f7310[22] = "\u0019_Um\nYDR_s3M#\u0019VwIOQ]@6S$\u0018[RpXV\\M\u0013j3";
      f7310[23] = "[))Y>+\u000f\"|\u0013BA\b5q]\u0018{\u000f3qD-r\tOdO)o\u001bs\u007f\u0013'\u0016\u0018\"s[=*\u0003~}\">{\u000f6g\u001e%'\u0001OdO)o\u001bs\u007f\u0013'\u0016T5xN\"u\n=eAB&\u001e/tB!x\u00162{\"\u007f/T>\u007fY/m\u00027\u0018\u0018,v\u000f5{R>nYO\"L\"}\u001e,h^:+dqjK<r\u0015 aS%\u0016";
      f7310[24] = "y;K\u001dp.pm\u0015da(\\;V\tz>p\\T\tk*c`OUeS`1C\u001d\u007fo{mMd0)|0H\u0007n!a?(";
      f7310[25] = "\u0004J-\u0005\u0006`IK5\tt^c?0S.Qruq\rDo_\u000e!O\u0012f8Hu\u0004\u0005yC\u00187R\f\u001e\u0005L|E\u0013eU\u000e*Lt.V\u0015'N\u0017nD\rq4";
      f7310[26] = "K`}}Ua\u000bn5l- \u0017sOk@[G6?gJ \u0017tin-e\bfqr\\4\u0003~h\u0016";
      f7310[27] = "\u001blo&\u0010?[b'7hjG\u007f]0\u0005\u0005\u0017:-<\u000f~Gx{5h";
      f7310[28] = "[1KPuoRg\u0015)ɋ\u0012\u0000.\u0018TelX-\u0013\u0010";
      f7310[29] = "$}\u0005PZYpvP\u001a&\barKqK\u000fgrRDB\t\u001bgY@_\u001b'|\u0005N&\u0018vpMT\u001a\u0003*~4WK\u000fbd\bL\u0017\u0001\u001bgY@_\u001b'|\u0005N&^u{_QE\u0014gc\t+\u0018\u0016rePZI\u001dj|4";
      f7310[30] = ">\u0010\f6`\u00027FRO\u007f\u0012'-\u0002)|\u0012!\u001a\u0015O/\u0019j\f\u0013r{\u0012?Fo";
      f7310[31] = "Z\u0016P\u001dfk\u0002\u0015[Y\u0006ҡd_\u000f\u0012mm^\u001f\u0001Z|";
      f7310[32] = "^M7:SJ\u0003@=$jơd\u00007=\u0006W\u0007^? \t";
      f7310[33] = "d\u0011$<\"S)\u0010<0PB5R\u001fB\u001a-b@%f*N(R=0P";
      f7310[34] = "<\bnW\u00192a\u0005dI Ȕ\u0006H-\u0000Q(}\u0018oVX";
   }
}
