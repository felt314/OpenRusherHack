package org.rusherhack.client.api.system;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.rusherhack.Class066;
public interface IRotationManager {
   long f862 = Class066.m4320(5805024572605929061L, -922199702349647999L, MethodHandles.lookup().lookupClass()).m4325(270829123422392L);
   Object[] f863 = new Object[19];
   String[] f864 = new String[19];

   default boolean isLookingAt(BlockPos var1) {
      return this.isLookingAt(var1, null);
   }

   boolean isLookingAt(BlockPos var1, Direction var2);

   default boolean isLookingAt(BlockHitResult var1, boolean var2) {
      return this.isLookingAt(var1.getBlockPos(), var2 ? var1.getSide() : null);
   }

   default void updateRotation(float var1, float var2) {
      this.updateRotation(var1, var2, 180.0F);
   }

   void updateRotation(float var1, float var2, float var3);

   void updateRotation(Entity var1, float var2);

   default void updateRotation(BlockPos var1, float var2) {
      this.updateRotation(var1, null, var2);
   }

   void updateRotation(BlockHitResult var1, float var2);

   default boolean isLookingAt(BlockHitResult var1) {
      boolean var10004 = true;
      return this.isLookingAt(var1, true);
   }

   BlockHitResult getLookRaycast(BlockPos var1);

   boolean isLookingAt(Entity var1);

   default void updateRotation(Entity var1) {
      this.updateRotation(var1, 180.0F);
   }

   void updateRotation(BlockPos var1, Direction var2, float var3);

   default void updateRotation(BlockPos var1) {
      this.updateRotation(var1, 180.0F);
   }

   public static void m194() {
      f863[0] = "5\u0018+6\u0006[)\u0002)j\u001cO9\u0001b{\u0018G?\u000486\u0015^3D?a\u0007Z?\u0007bQ&A.\u000b8q\u001b@\u0017\u000b\"y\u0013K(";
      f863[1] = "?_n\b6L?_yT:C%\u0014yJ:V\"e(\u0015h\u001d";
      f863[2] = float.class;
      f864[2] = "java/lang/Float";
      f863[3] = void.class;
      f864[3] = "java/lang/Void";
      f863[4] = "q\u001cz!!vm\u0006x};b}\u00053ɻ";
      f863[5] = "Zayi\u0004~Zan5\bq@*n+\bdG[>~_\"";
      f863[6] = "tuZ'\\\u001dtuM{P\u0012n>MeP\u0007iO\u001c:\u0004D";
      f863[7] = boolean.class;
      f864[7] = "java/lang/Boolean";
      f863[8] = "&\t.j\u001f &\t96\u0013/<B9(\u0013:;3kvK~";
      f863[9] = "MJbU0\u0006FEs\u001aQ\bMNw@";
      f863[10] = "`3owKKjcl\u0010FCj;y}a\\z;yq\\]\u0006 i*A\u0003a6xb;\u0007h-~p\u0000_t\"k\u0010\u0002Kf\"gyE\u0001dj\u0005*CZx*n/C\u000bjR";
      f863[11] = "mQ\u0015k2KoL\u001b8WH;J\u001cg;zo\tC0o-jX\u0003{7\u00162D\fnW";
      f863[12] = ")CL#E\u007f#\u0013ODTt\u000bEA'Ti kZDGcuX\u001e#Qr=\"\u001a*Jt/\u0019B6EaO\u001fH<Z7vPK?_\u000f";
      f863[13] = ")\u0000H_\u001bW#PK8\u0002't\\K\t\u000eY2\u0019^]k\u001cr\b\u0013]\u0015Z7\u001dG8";
      f863[14] = "(z\u0003\u0002>\u0001\"*\u0000e3\t\"r\u0015\b\u0014\u00162r\u0015\u0004)\u0017N&\u0012\u001f$\n)`\u0019T>qwk\t\u0015,\u00180!\u000b]NK6z\u0017\u001d%N6+\u0005e";
      f863[15] = "Ws\\\r8F]#_j5N]{J\u0007\u0012QM{J\u000b/P1+F\n8TXl\f\bp6\bbV\u001a*_O(TRH\u000fArF\b!H\u000bp\u000ejrNPlN\u0001wN\u0001~6";
      f863[16] = "H\u0018G\n@>BHDmQ5j\u001eJ\u000eQ(A0Qm\u000b)G\u0012H\u000b\t4IA-P^6AA\u0014\u001f]5Dy\u0010\u0003H!\u0016@_\u0000K$.";
      f863[17] = "[Ox|>@Q\u001f{\u001b3HQGnv\u0014WAGnz)V=\\~!4\bZJoiN\tMNby'N\u0007L*\u001btH\\PjpqH\rB\u0012";
      f863[18] = "\fnD) %\u000esJzE&ZuM%)\u0014\u000e6\u0012}zCEe\u00178}$St_B";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m194();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
