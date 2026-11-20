package org.rusherhack;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import org.rusherhack.core.event.type.EventCancellable;

public class Event492 extends EventCancellable {
   public BlockPos f7968;
   public ShapeContext f7969;
   public BlockState f7970;
   public VoxelShape f7971;
   public static Object[] f7973 = new Object[10];

   public ShapeContext m15298() {
      return this.f7969;
   }

   public BlockState m15299() {
      return this.f7970;
   }

   public void m15300(VoxelShape var1) {
      this.f7971 = var1;
   }

   public VoxelShape m15301() {
      return this.f7971;
   }

   public Event492(BlockPos var1, BlockState var2, ShapeContext var3, VoxelShape var4) {
      super();
      this.f7968 = var1;
      this.f7970 = var2;
      this.f7969 = var3;
      this.f7971 = var4;
   }

   public BlockPos m15302() {
      return this.f7968;
   }

   static {
      m122();
   }
   public static void m122() {
      f7973[0] = "|kT1^\u001c`qVmD\bpr\u001dѠ";
      f7973[1] = "H\b\u0017R}2H\b\u0000\u000eq=RC\u0000\u0010q(U2QJ(k";
      f7973[2] = "s\b)\u001e\u0013Is\b>B\u001fFiC>\\\u001fSn2n\u0007L\u0016";
      f7973[3] = "USi\u001f}>US~Cq1O\u0018~]q$Hi/\u0007%";
      f7973[4] = "\u0007*5pS\n\u0007*\",_\u0005\u001da\"2_\u0010\u001a\u0010sm\r[";
      f7973[5] = "%\u001a!\u0004\u0014..\u00150Ku %\u001e4\u0011";
      f7973[6] = "Ev\u0006h@'\u0018qG\u0012ÞY\u0018;Dj\u0001)G'\u0000k";
      f7973[7] = "b\u001f'\u0016z:?\u0018flӃD{\u001e!\u00077>kL(";
      f7973[8] = "(\rMz\u001b{u\n\f\u0000ҝ\u0005v\u000bL{Yi5@M0";
      f7973[9] = "\u0002i9Gth_nx=ȟ\u0016\\%*Shm\u001a?8D";
   }
}
