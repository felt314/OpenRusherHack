package org.rusherhack.command;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.StringJoiner;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Formatting;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.command.arg.BlockReference;
import org.rusherhack.client.api.feature.command.arg.PlayerReference;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

import org.rusherhack.client.api.feature.module.impl.render.Search;
public class SearchCommand extends ModuleCommand {
   public static long f7275 = Class066.m4320(-5745228200107277052L, 7289586311514650841L, MethodHandles.lookup().lookupClass()).m4325(274589498765201L);
   public static Object[] f7279 = new Object[78];
   public static String[] f7280 = new String[78];

   @CommandExecutor(
      subCommand = {"blocks add"}
   )
   @CommandExecutor$Argument({"block", "color"})
   public String m14061(BlockReference var1, Optional<Color> var2) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"entities remove", "entities delete", "entities rm", "entities del", "entity remove", "entity delete", "entity rm", "entity del"}
   )
   @CommandExecutor$Argument({"entity type"})
   public String m14063(EntityType<?> var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blocks remove", "blocks delete", "blocks rm", "blocks del"}
   )
   @CommandExecutor$Argument({"block"})
   public String m14064(BlockReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"entities clear", "entity clear"}
   )
   public String m14065() {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blocks list"}
   )
   public String m150() {
        return null;
    }

   @CommandExecutor(
      subCommand = {"entities list", "entity list"}
   )
   public String m14067() {
        return null;
    }

   @Override
   public boolean isHidden() {
        return false;
    }

   @CommandExecutor(
      subCommand = {"entities add", "entity add"}
   )
   @CommandExecutor$Argument({"entity type", "color"})
   public String m14070(EntityType<?> var1, Optional<Color> var2) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blocks clear"}
   )
   public String m14071() {
        return null;
    }

   public SearchCommand(Search var1, IModule var2) {
    }
   public static int m178(long var0, long var2) {
        return 0;
    }
   public static Class m180(long var0, long var2) {
        return null;
    }

   public static Field m181(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m182(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m183(long var0, long var2) {
        return null;
    }

   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m186(long var0, long var2) {
        return null;
    }

   public static MethodHandle m187(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
        return null;
    }

   public static Object m188(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
        return null;
    }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
        return null;
    }
}
