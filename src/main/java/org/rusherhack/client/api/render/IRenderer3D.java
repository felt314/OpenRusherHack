package org.rusherhack.client.api.render;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import org.rusherhack.Class066;

public interface IRenderer3D extends IRenderer {
   long f801 = Class066.m4320(5837650205543394227L, 1901118658070219108L, MethodHandles.lookup().lookupClass()).m4325(200002306361582L);
   Object[] f802 = new Object[11];
   String[] f803 = new String[11];

   void drawBox(Entity var1, float var2, boolean var3, boolean var4, int var5);

   BufferBuilder getTrianglesBuffer();

   BufferBuilder getLinesBuffer();

   void drawShape(VoxelShape var1, double var2, double var4, double var6, boolean var8, boolean var9, int var10);

   BufferBuilder getQuadsBuffer();

   Vec2f projectToScreen(Vec3d var1);

   void setDepthTest(boolean var1);

   void lineStrip(double var1, double var3, double var5, int var7);

   void drawBox(BlockPos var1, boolean var2, boolean var3, int var4);

   void drawLine(double var1, double var3, double var5, double var7, double var9, double var11, int var13);

   default void drawLine(Vec3d var1, Vec3d var2, int var3) {
      this.drawLine(var1.x, var1.y, var1.z, var2.x, var2.y, var2.z, var3);
   }

   default void lineStrip(Vec3d var1, int var2) {
      this.lineStrip(var1.x, var1.y, var1.z, var2);
   }

   void drawPlane(double var1, double var3, double var5, double var7, double var9, Direction var11, boolean var12, boolean var13, int var14);

   BufferBuilder getTriangleFanBuffer();

   BufferBuilder getLineStripBuffer();

   void drawBox(double var1, double var3, double var5, double var7, double var9, double var11, boolean var13, boolean var14, int var15);

   void setLineWidth(float var1);

   public static void m194() {
      f802[0] = "\u001c%4@N:\u001c%#\u001cB5\u0006n#\u0002B \u0001\u001frZ\u0010";
      f802[1] = double.class;
      f803[1] = "java/lang/Double";
      f802[2] = "\t@fmRD\u0015Zd1HP\u0005Y/ LX\u0003\\umAA\u000f\u001cs&NU\u0003@/\nrT\bVd1ECUv";
      f802[3] = int.class;
      f803[3] = "java/lang/Integer";
      f802[4] = void.class;
      f803[4] = "java/lang/Void";
      f802[5] = "[w~& pPxoiA~[sk3";
      f802[6] = "Z4r^\u001e/\u0000?v'\u000e3Wa#pYi\u0007=O[\u000bc\n<4JQi";
      f802[7] = "DRS)\u0011&GU\u0012i/y\u001cSB\u0003Sg\u001cM/$D,M\fT5\u001e&}IDi\u001f$\u0006X\u001ec/a\u0016\u0004\u001faTpL\u000e/bH \u0012\u000e_#ObM5\u0014fFp\u0017LP$\u0011`}";
      f802[8] = "\nr*\u001en\u0006Py.g~\u001a\u0007'{0)@Wz\u0017\u001b{JZzl\n!@";
      f802[9] = "\u0016<\u0000?\"0\u0015;A\u007f\u001cgU2\u0003\n}mB[\u0000%-;\u0016 \u0011\u007f'\u000bS0M~%pBjGN``\u001ekE5q:\u0014[\u0000%-;\u0016 \u0011\u007f'\u000bS0M~%pBjGN``\u001ekE5q:\u0014[F)!d\u0014+\u0007.c;/`B'qaV$\u0000pa\u000b";
      f802[10] = "4\u0004s\u0000%>n\u000fwy5\"9Q\".bxi\u000fN\u00050rd\f5\u0014jx";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m194();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
