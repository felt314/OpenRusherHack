package org.rusherhack;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinAbstractClientPlayer;

public class Util458 extends OtherClientPlayerEntity implements Globals {
   public boolean f7408;
   public static long f7409 = Class066.m4320(-5718269619587137332L, 6457002623279766235L, MethodHandles.lookup().lookupClass()).m4325(106948538015890L);
   public static Object[] f7410 = new Object[40];
   public static String[] f7411 = new String[40];

   public boolean isPushable() {
        return false;
    }

   public void m14377(boolean var1) {
        
    }

   Util458(@Nullable PlayerEntity var1, String var2) {
      super((net.minecraft.client.world.ClientWorld)var1.getWorld(), new com.mojang.authlib.GameProfile(java.util.UUID.randomUUID(), var2));
    }

   public Util458(@NotNull PlayerEntity var1) {
      this(var1, var1.getName().getString());
   }

   public boolean m14378() {
        return false;
    }

   static {}
   public static int m193(long var0, long var2) {
        return 0;
    }

   public static void m194() {
        
    }

   public static Class m195(long var0, long var2) {
        return null;
    }

   public static Field m196(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m197(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m198(long var0, long var2) {
        return null;
    }

   public static Method m199(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m200(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m201(long var0, long var2) {
        return null;
    }

   public static MethodHandle m202(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
        return null;
    }

   public static Object m203(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
        return null;
    }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
        return null;
    }
}
