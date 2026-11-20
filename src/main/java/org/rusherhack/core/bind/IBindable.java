package org.rusherhack.core.bind;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class472;

import org.rusherhack.command.bind;
public interface IBindable {
   long f1414 = Class066.m4320(-5478736507109661917L, -6472583543685796786L, MethodHandles.lookup().lookupClass()).m4325(64672561301686L);
   String f1415 = null;
   Object[] f1416 = new Object[4];
   String[] f1417 = new String[4];

   void onKeybindEvent();

   default String getBindReference() {
        return null;
    }


   public static String m117(byte[] var0) {
        return null;
    }
   public static void m786() {
        
    }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
    }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
