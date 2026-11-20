package org.rusherhack;

import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.client.api.system.IInteractions;

public class Class092 implements IInteractions {
   public static Class092 f2256 = new Class092();
   public static Object[] f2258 = new Object[12];
   public static String[] f2259 = new String[12];

   @Nullable
   @Override
   public BlockHitResult getBlockPlaceHitResult(BlockPos var1, boolean var2, boolean var3, double var4) {
      return Util416.m13460(var1, var2, var3, var4);
   }

   static {
      m122();
   }

   @Override
   public boolean placeBlock(BlockPos var1, Hand var2, boolean var3) {
      boolean var10004 = true;
      return Util416.m13464(var1, var2, true, var3);
   }

   @Override
   public boolean useBlock(BlockPos var1, Hand var2, boolean var3, boolean var4) {
      return Util416.m13463(var1, var2, var3, var4);
   }

   public Class092() {
   }

   @Override
   public boolean useBlock(BlockHitResult var1, Hand var2, boolean var3) {
      return Util416.m13459(var1, var2, var3);
   }

   @Nullable
   @Override
   public BlockHitResult getBlockHitResult(BlockPos var1, boolean var2, boolean var3, double var4) {
      return Util416.m13456(var1, var2, var3, var4);
   }
   public static void m122() {
      f2258[0] = "W!oR\fnK;m\u000e\u0016z[8&·";
      f2258[1] = "}^\u000fd&>}^\u00188*1g\u0015\u0018&*$`dIyxo";
      f2258[2] = "[55<J([5\"`F'A~\"~F2F\u000fp \u0011y";
      f2258[3] = boolean.class;
      f2259[3] = "java/lang/Boolean";
      f2258[4] = double.class;
      f2259[4] = "java/lang/Double";
      f2258[5] = "\u001f*x9t\u001a\u001f*oex\u0015\u0005ao{x\u0000\u0002\u0010?./F";
      f2258[6] = "w@e]_>|Ot\u0012>0wDpH";
      f2258[7] = "Y\u001dyp${QG\u007f\u001eŵK\u0012Ok!f3\u0007\u001cd\u001ec4V\u001cp|7z\u000e^\u0016$guV\\sc(0\b%,#du\u0011@kl!+h\u001f+ d2\rXde:K";
      f2258[8] = ".w\n\u001e\u001er&-\fpȥBe%\u0018O\\:pv\u0017pZ\u007f!q\u001c\u0015\u001d0d/eJ]|!6\u0000\r\u00129\u007fO^I\u0010-#*\n\u0014\\+\u001ft\u001f\u001f\r9c1\u0014\u001d\u001aB";
      f2258[9] = "Pfh['iX<n5ȌY\u001b4z\ne!\u000egu5cd_`~P$+\u001a>\u0007\u000fdg_'bH+\"\u0001^<\f)6];hQe0ae}Z4\"\u001d vX#Y";
      f2258[10] = "2fY\u00128Q:<_|Ĉay4KCz\u0019lgD|\u007f\u001e=gP\u001e+Pe%6F{_='S\u00014\u001ac^\fAx_z;K\u000e=\u0001\u0003d\u000bBx\u0018f#D\u0007&a";
      f2258[11] = "G.\u0013 \fTOt\u0015NӷdMl\u0013#\t\u0018\bg\u00114r]\t(E(\u0010\tGp\u0007NHYH(\u0005+\u000f\u0016\rv|tOZHo\u00193\u0000\u001f\u0016\u0016";
   }
}
