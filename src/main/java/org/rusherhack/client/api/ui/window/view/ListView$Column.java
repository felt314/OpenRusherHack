package org.rusherhack.client.api.ui.window.view;
import org.rusherhack.client.api.ui.window.content.ListItemContent;
import org.rusherhack.*;

import java.util.Comparator;
import org.rusherhack.core.interfaces.INamed;

public class ListView$Column<T extends ListItemContent> implements INamed {
   public double f1032;
   public String f1033;
   public Comparator<T> f1034;
   public static Object[] f1036 = new Object[12];
   public static String[] f1037 = new String[12];

   public ListView$Column(ListView var1, String var2, double var3) {
    }

   void setComparator(Comparator<T> var1) {
        
    }

   ListView$Column(String var1, Comparator<T> var2, double var3, double param5) {
    }

   @Override
   public String getName() {
        return null;
    }

   public ListView$Column(ListView var1, String var2) {
      this(var1, var2, 1.0);
   }

   Comparator<T> getComparator() {
        return null;
    }

   static {
      m122();
   }
   public static void m122() {
        
    }
}
