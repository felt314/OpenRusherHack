package org.rusherhack.core.command.argument.parser;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import org.rusherhack.Class066;
import org.rusherhack.core.command.processing.CommandProcessingSink;

public interface IArg<T> {
   List<String> EMPTY_SUGGESTIONS = new ArrayList<>();
   long f1473 = Class066.m4320(7883768489435499475L, -2602787294537974980L, MethodHandles.lookup().lookupClass()).m4325(190706220089340L);
   Object[] f1474 = new Object[4];
   String[] f1475 = new String[4];

   default boolean captureRemaining() {
      return false;
   }

   default T parse(CommandProcessingSink var1, String var2) { return null; }

   default List<String> getSuggestions(CommandProcessingSink var1, String var2) {
      return EMPTY_SUGGESTIONS;
   }

   public static void m122() {
      f1474[0] = "V_\u0000?vmJE\u0002clyZFIrkj\\\u0003\u0004~iuXC\u0003?ej^X\ntjl\u0017]\u0006cw}K\u0003.Pv\u007f";
      f1474[1] = "\u001ai*\u0005,I\u0004a0JNU\u0003|";
      f1474[2] = "T=N|>?_2_3_1T9[i";
      f1474[3] = ",7x'`>q3z@\u001c\u0018\u0013\n\u0011\u0017\n\u0000\u0004\u0019\r\u001b\r\u001c\f\u0010\u001b@h152z+0as<";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m122();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
