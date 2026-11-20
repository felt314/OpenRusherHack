/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.screen.slot.SlotActionType
 */
package org.rusherhack.client.api.utils;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.SlotActionType;
import org.rusherhack.Class066;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.utils.InventoryUtils$1;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.setting.Setting;

public class InventoryUtils
implements Globals {
    public static long f1113;
    public static long[] f1114;
    public static Integer[] f1115;
    public static Map f1116;
    public static Object[] f1117;
    public static String[] f1118;

    /*
     * Unable to fully structure code
     */
    public static int getStackCount(Predicate<ItemStack> var0, boolean var1_1, boolean var2_2) {
        return 0;
    }

    public static void clickSlot(int n, boolean bl) {
        
    }

    public static int findItemHotbar(Predicate<ItemStack> predicate) {
        return 0;
    }

    public static /* synthetic */ Boolean lambda$getStackCount$6(Predicate predicate, AtomicInteger atomicInteger, Integer n, ItemStack object) {
        return null;
    }

    public static int getItemCount(Item item, boolean bl, boolean bl2) {
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    public static void loopInventory(BiFunction<Integer, ItemStack, Boolean> var0, boolean var1_2, boolean var2_3, boolean var3_4, boolean var4_5) {
        
    }

    public static int findItem(Predicate<ItemStack> predicate, boolean bl, boolean bl2) {
        return 0;
    }

    public static /* synthetic */ Boolean lambda$findItem$1(Predicate predicate, Comparator comparator, AtomicInteger atomicInteger, AtomicReference atomicReference, Integer n, ItemStack object) {
        return false;
    }

    public static /* synthetic */ Boolean lambda$findItemHotbar$3(Predicate predicate, Comparator comparator, AtomicInteger atomicInteger, AtomicReference atomicReference, Integer n, ItemStack object) {
        return false;
    }

    public static boolean isInventoryFull() {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public static int getItemCount(Predicate<ItemStack> var0, boolean var1_1, boolean var2_2) {
        return 0;
    }

    public static int findItem(Predicate<ItemStack> object, Comparator<ItemStack> comparator, boolean bl, boolean bl2) {
        return 0;
    }

    public static int findItemHotbar(Predicate<ItemStack> object, Comparator<ItemStack> comparator) {
        return 0;
    }

    public static /* synthetic */ Boolean lambda$getItemCount$5(Predicate predicate, AtomicInteger atomicInteger, Integer n, ItemStack object) {
        long l = f1113 ^ 0x1DAC8FB075D7L;
        Setting[] settingArray = WorldUtils.\u041d();
        boolean bl = predicate.test(object);
        if (settingArray == null) {
            if (bl) {
                atomicInteger.addAndGet(object.getCount());
            }
            bl = false;
        }
        return bl;
    }

    public static int findItem(Item item, boolean bl, boolean bl2) {
        return 0;
    }

    public static int findItemHotbar(Item item) {
        return 0;
    }

    public static int getInventorySlot(EquipmentSlot equipmentSlot) {
        return 0;
    }

    public static void swapSlots(int n, int n2) {
        
    }

    /*
     * Unable to fully structure code
     */
    static {
    }
    public static int m118(int n, long l) {
        return 0;
    }

    public static int m119(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        return 0;
    }
    public static int m193(long l, long l2) {
        return 0;
    }

    public static void m194() {
        
    }

    public static Class m195(long l, long l2) {
        return null;
    }

    public static Field m196(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m197(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m198(long l, long l2) {
        return null;
    }

    public static Method m199(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m200(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m201(long l, long l2) {
        return null;
    }

    public static MethodHandle m202(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        return null;
    }

    public static Object m203(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        return null;
    }
    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        return null;
    }
}

