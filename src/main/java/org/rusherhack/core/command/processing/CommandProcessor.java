package org.rusherhack.core.command.processing;
import org.rusherhack.*;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import org.rusherhack.core.command.CommandManager;
import org.rusherhack.core.command.CommandUtils;
import org.rusherhack.core.command.argument.StringCapture;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.argument.parser.impl.BooleanArg;
import org.rusherhack.core.command.argument.parser.impl.ColorArg;
import org.rusherhack.core.command.argument.parser.impl.DoubleArg;
import org.rusherhack.core.command.argument.parser.impl.EnumArg;
import org.rusherhack.core.command.argument.parser.impl.IntegerArg;
import org.rusherhack.core.command.argument.parser.impl.StringArg;
import org.rusherhack.core.command.argument.parser.impl.StringCapturerArg;
import org.rusherhack.core.setting.Setting;

public class CommandProcessor {
   public Map<Predicate<Class<?>>, IArg<?>> f1556;
   public static String[] f1557;
   public static Object[] f1559 = new Object[50];
   public static String[] f1560 = new String[50];

   public void addArgumentParser(Class<?> var1, IArg<?> var2) {
        
    }

   public CommandProcessingSink processCommand(CommandManager var1, String var2) {
        return null;
    }

   public IArg<?> getArgumentParser(Class<?> var1) {
        return null;
    }

   public void addArgumentParser(Predicate<Class<?>> var1, IArg<?> var2) {
        
    }

   public CommandProcessor() {
    }

   public static void m3774(String[] var0) {
        
    }

   public static String[] m3775() {
        return null;
    }

   static {
    }
   public static void m122() {
        
    }
}
