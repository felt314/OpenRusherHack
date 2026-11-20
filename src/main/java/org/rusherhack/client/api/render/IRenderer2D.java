package org.rusherhack.client.api.render;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.Class066;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.render.graphic.IGraphic;

public interface IRenderer2D extends IRenderer, IScissorable {
   long f798 = Class066.m4320(-1200035894022379915L, 8037280840903685211L, MethodHandles.lookup().lookupClass()).m4325(62670986009047L);
   Object[] f799 = new Object[18];
   String[] f800 = new String[18];

   void _drawGraphicRectangle(IGraphic var1, double var2, double var4, double var6, double var8, double var10);

   IFontRenderer getFontRenderer();

   default void _drawCircle(double var1, double var3, double var5, boolean var7, boolean var8, float var9, int var10, int var11) {
      this._drawEllipse(var1, var3, var5, var5, var7, var8, var9, var10, var11);
   }

   default void drawTriangleOutline(double var1, double var3, double var5, double var7, float var9, int var10) {
      boolean var10007 = true;
      this._drawTriangle(var1, var3, var5, var7, false, true, var9, 0, var10);
   }

   default void drawRectangle(double var1, double var3, double var5, double var7, int var9) {
      boolean var10008 = true;
      this._drawRectangle(var1, var3, var5, var7, true, false, 0.0F, var9, 0);
   }

   void flushQueue();

   default void drawGraphicRectangle(IGraphic var1, double var2, double var4, double var6, double var8) {
      this._drawGraphicRectangle(var1, var2, var4, var6, var8, 0.0);
   }

   void _drawRectangle(double var1, double var3, double var5, double var7, boolean var9, boolean var10, float var11, int var12, int var13);

   void queue(Runnable var1);

   default void drawOutlinedRectangle(double var1, double var3, double var5, double var7, float var9, int var10, int var11) {
      boolean var10008 = true;
      this._drawRectangle(var1, var3, var5, var7, true, true, var9, var10, var11);
   }

   default void drawOutlinedCircle(double var1, double var3, double var5, float var7, int var8, int var9) {
      boolean var10007 = true;
      this._drawCircle(var1, var3, var5, true, true, var7, var8, var9);
   }

   default void drawTriangle(double var1, double var3, double var5, double var7, int var9) {
      boolean var10008 = true;
      this._drawTriangle(var1, var3, var5, var7, true, false, 0.0F, var9, 0);
   }

   default void drawRectangleOutline(double var1, double var3, double var5, double var7, float var9, int var10) {
      boolean var10007 = true;
      this._drawRectangle(var1, var3, var5, var7, false, true, var9, 0, var10);
   }

   void drawGradientRectangle(double var1, double var3, double var5, double var7, double var9, double var11, int var13, int var14);

   default void begin(MatrixStack var1, IFontRenderer var2) {
      this.begin(var1);
   }

   default void drawCircle(double var1, double var3, double var5, int var7) {
      boolean var10007 = true;
      this._drawCircle(var1, var3, var5, true, false, 0.0F, var7, 0);
   }

   default void drawCircleOutline(double var1, double var3, double var5, float var7, int var8) {
      boolean var10006 = true;
      this._drawCircle(var1, var3, var5, false, true, var7, 0, var8);
   }

   default void drawOutlinedTriangle(double var1, double var3, double var5, double var7, float var9, int var10, int var11) {
      boolean var10008 = true;
      this._drawTriangle(var1, var3, var5, var7, true, true, var9, var10, var11);
   }

   @Override
   default void begin(MatrixStack var1) {
      this.begin(var1, this.getFontRenderer());
   }

   void _drawEllipse(double var1, double var3, double var5, double var7, boolean var9, boolean var10, float var11, int var12, int var13);

   void drawLine(double var1, double var3, double var5, double var7, float var9, int var10);

   void _drawRoundedRectangle(double var1, double var3, double var5, double var7, double var9, boolean var11, boolean var12, float var13, int var14, int var15);

   void _drawTriangle(double var1, double var3, double var5, double var7, boolean var9, boolean var10, float var11, int var12, int var13);

   public static void m194() {
      f799[0] = "tw^\u00055$hm\\Y/0xn\u0017H+8~kM\u0005&!r+KN)5~w\u0017b\u00154ua\\Y\"#)A";
      f799[1] = double.class;
      f800[1] = "java/lang/Double";
      f799[2] = boolean.class;
      f800[2] = "java/lang/Boolean";
      f799[3] = float.class;
      f800[3] = "java/lang/Float";
      f799[4] = int.class;
      f800[4] = "java/lang/Integer";
      f799[5] = void.class;
      f800[5] = "java/lang/Void";
      f799[6] = "Z\u0018\u001b\f-*Z\u0018\fP!%@S\fN!0G\"[\u0017xt";
      f799[7] = "\u001b\u0019^<eb\u0007\u0003\\`\u007fv\u0017\u0000\u0017q{~\u0011\u0005M<vg\u001dEKwys\u0011\u0019\u0017uev\u0004\u0003Pq9^3\u0019Xb\u007f~\u0017";
      f799[8] = "KG}DJXW]\u007f\u0018PLG^4\tTDA[nDY]M\u001bh\u000fVIAG4\fWCP\u001bS,WCPg\u007f\u0004\\HVPh";
      f799[9] = "$*?_ M/%.\u0010AC$.*J";
      f799[10] = "p*\t\u0017k#)*\u001foo$n\u0004\t\t|\u0013\u007f,\u0002\u0002z$hJS\n1)v)\r\u0010`r\u0012";
      f799[11] = "%@k] (|@}%\u001c.=Ish/&&XwHK{-[`D{ >\u0018g%r(<Lm\u0015);\u007fK\f\u001c!9+A<G2z, 5O0.&\u0010n\\s)G\u0019oD'05NvCrB~CmI90)Zj\u001cKx?P=T!3|Fr%q>>\u001a0\u0019&$'Z\f\u001f7;}\u001c0H-\"= 0\u001ev0x\u001b7[)%G";
      f799[12] = "EA:W9>\u001cA,/\u00058]H\"s(5NG2K?T\u001eK&C3dEXeDRmMZ1Nb6^\u00196/k>\\M<\u001f0-\u001fJ]\u00168/K@mM+lL!dL38US3U4m'\u0018>N>&UO'IkT\u001dY-\u001e#>V\u001a;QRn[Xg\u0013n9AA'/h(^\u001ba\u0013?2G[]\u0013iiU\u001ef\u0014,6@!";
      f799[13] = "\niJ&\u000e:Si\\^\u000f=\u0007hK^Y5T9W2\u0017)\bh-c\u0000a\bmN=\u001a0S\t\u0011eX\"W2\u0016 \u00077h";
      f799[14] = "}\u0004DCA^$\u0004R;@Yp\u0005E;\u0016Q#TYWXM\u007f\u0005#\u0007\u0011\tm[\u0018\u0000TVxd";
      f799[15] = "M.D#\u0007\u001a\u0014.R[;\u001cU'\\\u0014\u0016\u0019W.B06\u001dD2J=\u0003\u0014BN\u001e4\u0006JN ^&\u0007@/wI \u0000\u0011\u001f,Zc\u0007p\u0016$X7\r@M7\u001b0lIE5O:\\\u0012VvH[U\u001aT\"Bk\u000e\t\u0017%#b\u0006\u000bC/\u00139\u0015HDN\u001f`Q\u0002\u0010u\u0018%\u000e\u0017/";
      f799[16] = "KR(t\u0013\u0003\u0012R>\f/\u0005S[0V\u0015\u0002U[)c\u001c\u0004)\u000b%w\u0014\b\u0019P64\u0013i\u0010X4`\u0019YKKwgxPCI#mH\u000bP\n$\fA\u0003R^.<\u001a\u0010\u0011YO5\u001b\bE@=b\u0002\u000f\u00102vo\u0019\u0005[@!v\u001eP)\b7|I\u0018CCtj\u0006i\u0013N66DUDT/vxSUKu0D\u0004OR5\fDR\u0014@p7C\u0017KUO";
      f799[17] = "7p\u0000L*Tnp\u00164\u0016R/y\u0018\u007f D>t\n4xT.|\u0006\u0004#Gm{g\r+E9qWV8\u0006>\u0010^^:R4 \u0005MyUU)\u0004U-L'~\u001dRx>ls\u0006X3L;j\u0001\rA\u0004-`VE+Onv\u00194{B,*[\b,X5jg\u000e=Go,[Y'^/\u0010[\u000f|Lj+\\J#YU";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m194();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
