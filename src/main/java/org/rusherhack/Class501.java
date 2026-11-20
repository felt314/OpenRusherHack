package org.rusherhack;

import net.minecraft.client.render.VertexConsumer;

public class Class501 implements VertexConsumer {
   public int f8095;
   public VertexConsumer f8096;
   public static Object[] f8098 = new Object[12];
   public static String[] f8099 = new String[12];

   public VertexConsumer color(int var1, int var2, int var3, int var4) {
      return this;
   }

   public VertexConsumer vertex(float var1, float var2, float var3) {
      this.f8096.vertex(var1, var2, var3).color(this.f8095);
      return this;
   }

   public VertexConsumer normal(float var1, float var2, float var3) {
      return this;
   }

   public VertexConsumer light(int var1, int var2) {
      this.f8096.light(var1, var2);
      return this;
   }

   public Class501(VertexConsumer var1, int var2) {
      this.f8096 = var1;
      this.f8095 = var2;
   }

   public VertexConsumer overlay(int var1, int var2) {
      this.f8096.overlay(var1, var2);
      return this;
   }

   public VertexConsumer texture(float var1, float var2) {
      this.f8096.texture(var1, var2);
      return this;
   }

   static {
      m122();
   }
   public static void m122() {
      f8098[0] = ":\f[cst:\fL?\u007f{ GL!\u007fn'6\u001bx&%";
      f8098[1] = int.class;
      f8099[1] = "java/lang/Integer";
      f8098[2] = "1\"W\u001b_\u0013-8UGE\u0007=;\u001eҭ";
      f8098[3] = float.class;
      f8099[3] = "java/lang/Float";
      f8098[4] = "`U\u000e\u000e^KkZ\u001fA?E`Q\u001b\u001b";
      f8098[5] = "9\u0013\u0011!j(7\u001eH\\r}!\u0014\u00160@.eK@b\u0017a/\u0015\u00187*ymNq-eq4\u001fL5'*]\u0010\u0016<jme\u001e\u001be\u0017";
      f8098[6] = "hG\u0014\u0003\fL(\u001d\u0011^`ƈR\u000fX]\tWo\u0017\u001a\u0006";
      f8098[7] = "v@UDcb6\u001aP\u0019\u000fBL\u001d\f\u001brot\u0013\u0001B";
      f8098[8] = "\u00136R~g\u001e\u001d;\u000b\u0003\u007fK\u000b1UoM\u001cM`\b:\u001aW\u00050[h'OGk2rhG\u001e:\u000fj*\u001cw5Ucg[O;X:\u001a";
      f8098[9] = "e=]\u001bq\u0001k0\u0004fiT}:Z\n[\u0003;k\u0004]\f\u0003f`D\u00174\u000181\rf6^;#L^4\u0000jj=\u0002kY|'\u0005\ff\u0000\u0001";
      f8098[10] = "J7QA\u0012\u0013D:\b<\nFR0VP8\u0011\u0014a\b\u0006o\u0011IjHMW\u0013\u0017;\u0001<UL\u0014)@\u0004W\u0012E`1\u0006\b\u0011W!\t\u0004V@\u001ePU[\u000fVSh[VV+";
      f8098[11] = "ow\u000e>Y+azWCA~wp\t/s(:,W~$byq\u0007(\u0019z;*n'CsvmV)N*\u000b";
   }
}
