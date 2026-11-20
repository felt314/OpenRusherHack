package org.rusherhack;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.config.Configuration;
import org.rusherhack.client.api.utils.objects.PlayerRelation;
import org.rusherhack.client.api.utils.objects.PlayerRelation$State;

import org.rusherhack.command.config;
public class Class599 extends Class099<PlayerRelation> {
   public static long f9480 = Class066.m4320(-8121089413102857286L, -3777793255121363500L, MethodHandles.lookup().lookupClass()).m4325(195511342102125L);
   public static String[] f9481;
   public static String[] f9482;
   public static Object[] f9484 = new Object[19];

   public PlayerRelation m18202(JsonElement var1) {
        return null;
    }

   public Class599() {
      super(new File(Configuration.CONFIG_DIRECTORY.toFile(), "relations.json"));
   }

   static {
    }

   public static String m171(byte[] var0) {
        return null;
    }
   public static void m343() {
        
    }
}
