package org.rusherhack.core.command.argument.parser.impl;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.List;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.exceptions.ArgumentException;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.setting.Setting;

public class BooleanArg implements IArg<Boolean> {
   public static String[] TRUE_ALIASES;
   public static String[] FALSE_ALIASES;
   @Override
   public List<String> getSuggestions(CommandProcessingSink var1, String var2) {
        return null;
    }

   public Boolean parse(CommandProcessingSink var1, String var2) {
        return null;
    }
}
