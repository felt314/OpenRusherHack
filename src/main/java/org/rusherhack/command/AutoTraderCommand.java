package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent.Builder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.MathHelper;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.command.arg.EnchantReference;
import org.rusherhack.client.api.feature.command.arg.PlayerReference;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

import org.rusherhack.client.api.feature.module.impl.misc.AutoTrader;
public class AutoTraderCommand extends ModuleCommand {
   public static long f8040 = Class066.m4320(2771696494099059939L, -1470823580025816856L, MethodHandles.lookup().lookupClass()).m4325(37029821979848L);
   public static long[] f8044;
   public static Integer[] f8045;
   public static Map f8046;

   @CommandExecutor(
      subCommand = {"trades remove", "trades rm", "trades del", "trades delete"}
   )
   @CommandExecutor$Argument({"index"})
   public String m15447(int var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"trades clear"}
   )
   public String m15448() {
        return null;
    }

   public AutoTraderCommand(AutoTrader var1, IModule var2) {
    }

   @CommandExecutor(
      subCommand = {"trades add"}
   )
   @CommandExecutor$Argument({"firstToSell", "firstToSellMaxPrice", "secondToSell", "secondToSellMaxPrice", "toBuy", "toBuyEnchants"})
   public String m15449(Item var1, Optional<Integer> var2, Optional<Item> var3, Optional<Integer> var4, Optional<Item> var5, Optional<EnchantReference> var6) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"trades list"}
   )
   public String m15450() {
        return null;
    }
   public static int m175(int var0, long var1) {
        return 0;
    }

   public static int m176(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
        return 0;
    }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
        return null;
    }
   public static Field m181(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m182(Class var0, String var1, Class var2) {
        return null;
    }
   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }
}
