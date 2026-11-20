package org.rusherhack.client;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.block.BlockState;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.stat.StatHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.Class066;
public class Class056 extends ClientPlayerEntity {
   public static long f1354 = Class066.m4320(8819615570270010824L, -6239071941165075722L, MethodHandles.lookup().lookupClass()).m4325(178667748561331L);
   public static Object[] f1355 = new Object[44];
   public static String[] f1356 = new String[44];

   public boolean isMainPlayer() {
        return false;
    }

   public boolean isCamera() {
        return false;
    }

   Class056() {
      super(null, null, null, null, null, false, false);
    }

   public void tick() {
        
    }

   public boolean isPushedByFluids() {
        return false;
    }

   public boolean collidesWithStateAtPos(BlockPos var1, BlockState var2) {
        return false;
    }

   public boolean isSpectator() {
        return false;
    }

   static {
      m122();
   }
   public static int m121(long var0, long var2) {
        return 0;
    }

   public static void m122() {
        
    }

   public static Class m123(long var0, long var2) {
        return null;
    }

   public static Field m124(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m125(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m126(long var0, long var2) {
        return null;
    }

   public static Method m127(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m128(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m129(long var0, long var2) {
        return null;
    }

   public static MethodHandle m130(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
        return null;
    }

   public static Object m131(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
        return null;
    }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
        return null;
    }
}
