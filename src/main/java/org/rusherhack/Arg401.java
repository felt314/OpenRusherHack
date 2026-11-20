package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.exceptions.ArgumentException;
import org.rusherhack.core.command.processing.CommandProcessingSink;

public class Arg401 implements IArg<EntityType<?>> {
   public static long f6786 = Class066.m4320(-7915744761861538600L, -1204162063784933904L, MethodHandles.lookup().lookupClass()).m4325(258621274667008L);
   public static String f6787;
   public static Object[] f6788 = new Object[28];
   public static String[] f6789 = new String[28];

   @Override
   public List<String> getSuggestions(CommandProcessingSink var1, String var2) {
        return null;
    }

   public EntityType<?> m13046(CommandProcessingSink var1, String var2) {
      return (EntityType<?>)EntityType.get(var2).orElseThrow(() -> {
         return new IllegalStateException(f6787 + var2);
      });
   }

   static {
   }
   public static String m117(byte[] var0) {
        return null;
    }
   public static void m194() {
        
    }
}
