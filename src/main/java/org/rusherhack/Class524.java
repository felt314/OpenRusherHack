package org.rusherhack;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;

public class Class524<T extends Entity> extends EntityRenderer<T> {
   public EntityRenderer<T> f8458;
   public static Object[] f8460 = new Object[35];
   public static String[] f8461 = new String[35];

   public boolean shouldRender(T var1, Frustum var2, double var3, double var5, double var7) {
      return this.f8458.shouldRender(var1, var2, var3, var5, var7);
   }

   public void render(T var1, float var2, float var3, MatrixStack var4, VertexConsumerProvider var5, int var6) {
      this.f8458.render(var1, var2, var3, var4, var5, var6);
   }

   public TextRenderer getTextRenderer() {
      return this.f8458.getTextRenderer();
   }

   public Identifier getTexture(T var1) {
      return this.f8458.getTexture(var1);
   }

   public Vec3d getPositionOffset(T var1, float var2) {
      return this.f8458.getPositionOffset(var1, var2);
   }

   public void renderLabelIfPresent(T var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5, float var6) {
      this.f8458.renderLabelIfPresent(var1, var2, var3, var4, var5, var6);
   }

   public int getSkyLight(T var1, BlockPos var2) {
      return this.f8458.getSkyLight(var1, var2);
   }

   public int getBlockLight(T var1, BlockPos var2) {
      return this.f8458.getBlockLight(var1, var2);
   }

   public boolean hasLabel(T var1) {
      return this.f8458.hasLabel(var1);
   }

   public Class524(EntityRenderer<T> var1) {
      super(
         new Context(
            Globals.mc.getEntityRenderDispatcher(),
            Globals.mc.getItemRenderer(),
            Globals.mc.getBlockRenderManager(),
            Globals.mc.getEntityRenderDispatcher().getHeldItemRenderer(),
            Globals.mc.getResourceManager(),
            Globals.mc.getEntityModelLoader(),
            Globals.mc.textRenderer
         )
      );
      this.f8458 = var1;
      super.shadowRadius = var1.shadowRadius;
      super.shadowOpacity = var1.shadowOpacity;
   }

   static {
      m122();
   }
   public static void m122() {
      f8460[0] = "MP\f4:iQJ\u000eh }AIEӒ";
      f8460[1] = "@[E^_'@[R\u0002S(Z\u0010R\u001cS=]a\tI\u0005";
      f8460[2] = "]Lmo\u0014\u0007]Lz3\u0018\bG\u0007z-\u0018\u001d@v(s@Y";
      f8460[3] = "H\r+&\t}H\r<z\u0005rRF<d\u0005gU7m;W,";
      f8460[4] = int.class;
      f8461[4] = "java/lang/Integer";
      f8460[5] = "z=XZ>ez=O\u00062j`vO\u00182\u007fg\u0007\u001eMe<";
      f8460[6] = float.class;
      f8461[6] = "java/lang/Float";
      f8460[7] = "d'Rq\u00130x=P-\t$h>\u001b<\r,n;Aq\u00005b{r3\u000e'j9F";
      f8460[8] = " K\u0018<\u001d: K\u000f`\u00115:\u0000\u000f~\u0011 =q_#@";
      f8460[9] = "(-\rz\u001f`(-\u001a&\u0013o2f\u001a8\u0013z5\u0017JfE";
      f8460[10] = boolean.class;
      f8461[10] = "java/lang/Boolean";
      f8460[11] = "x2:\u001a,bx2-F mby-X xe\bz\u0001y<";
      f8460[12] = "P\b}\u001eX$P\bjBT+JCj\\T>M2=\u0005\fz";
      f8460[13] = void.class;
      f8461[13] = "java/lang/Void";
      f8460[14] = "\u0019\u0010 \u0017\"\"\u0019\u00107K.-\u0003[7U.8\u0004*f\r|";
      f8460[15] = " Dv[B\u0010 Da\u0007N\u001f:\u000fa\u0019N\n=~0@\u0019H";
      f8460[16] = "kZ\u0010vs(kZ\u0007*\u007f'q\u0011\u00074\u007f2v`Pn.u";
      f8460[17] = double.class;
      f8461[17] = "java/lang/Double";
      f8460[18] = "\u0017%|E0F\u001c*m\nQH\u0017!iP";
      f8460[19] = "4\u0003:_&\u0016'\u0001?=7\n6\u0002-jeUd]A\u00016\u0013\"]pB$\n;";
      f8460[20] = "\u0003H]u\u0017D\u0017P\u001e\u000b\u0015[\u0004UHg'\fG\u0004\u00123p\u000f\u001e\fLs\u000bQG\u0005V\u000bJZGV\u0014t\nZ\u001a\u000b/0AL@JQa\bW@5";
      f8460[21] = "`\u0001\u0017Mm\u001ct\u0019T3o\u0003g\u001c\u0002_]U*G_34\u0003`\u0013[\fe\u0007~\u0013e";
      f8460[22] = "\u0019\nl\u0018\\T\r\u0012/f^K\u001e\u0017y\nl\u001dSL%f\u0002@[\u0014f\u001d\\\u0019R\u000e\u001e\fYJ\u001a\u0011 \u001cZB\u001dwu_\u0007\u001f\u0004\u000e`\u001a\u000bAb\u001c'Z\u0002@\u001b\tbV\\&\tN\"_]_\u001c\u000b.\u0001;\u0019[Ir\u001a\u0001\u0017\u0005Gef";
      f8460[23] = "@Dj0\u007fOT\\)Nv\\V]t\u0019$\u0003\u0004\u0002\u0018rwEB\u0002)1e\\[";
      f8460[24] = "K\u0005\u001cS\r9_\u001d_-\u000f&L\u0018\tA=q\u000bAP\u001cjrVA\rU\u0011,\u000fH\u0017-V.H\u0001U\u001c\u00156Q\u0018nDU5I\u001b\u0017\u0015T'Kx";
      f8460[25] = "6L\u007fwF=%Nz\u0015W!4MhB\u0005~f\u0013\u0004)V8 \u00125jD!9";
      f8460[26] = "\u001d\rcm\u0012vB\u0001$qqsJs`o\u000bm^Blc\u000e.";
      f8460[27] = "2HeM\u000b\u0014!J`/İi&PlQ\u0013\u001b2H/";
      f8460[28] = "6c\u0004b\bh\"{G\u001c\nw1~\u0011p8!|%O\u001cV|t}\u000eg\b%}gv'\u000f'q%Mf_ ,\u001e";
      f8460[29] = "\re'+S/\u0019}dUQ0\nx29cfG\"kU\r;O{-.SbFaU<Z?\rr;jQ:\n\u0018j)Vf\u0015~i1\n:v('5T/\u0019i5%M]M)/mK#\u001c`4m4a\u0019`,n\u0005\"\u000by5U\u00051Lhih\r<FgU";
      f8460[30] = "b!2B:kv9q<8te<'P\n\"(fy<d\u007f ?8G:&)%@\u0003d'u z\r:)b\\";
      f8460[31] = "9JV\u0005\u0013\u00115FSFlNeYH\u0012;\u0019;\u000b\u0016~RM\u007f[\u0012A\u0003Ia[";
      f8460[32] = "np<G'\u000fzh\u007f9%\u0010im)U\u0017F$6p9y\u001b,n6B'B%tN\u0005/\u0005l6\u007fF=\u001cu\rrV8\u0004.<1D!\u001d\u001522[{\u001es1*\u0007'}%\u007f.Y2\u0012dm>@@F.wvF>\u0017mlv9q\u0011/}r\u0004y\u001c%rN";
      f8460[33] = "\u0015\rA2*Y\u0001\u0015\u0002L(F\u0012\u0010T \u001a\u0011RH\u0003sM\u0012\bIP46LQ@JLwGQ\u0013\b37G\fN3w|QV\u000fM&5JVp";
      f8460[34] = "w(Vr\u0011\u001cc0\u0015\f\u0018\u000fa1H[JP3o.0\u0019\u0016un\u0015s\u000b\u000fl";
   }
}
