package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventInteract;
import org.rusherhack.client.api.events.player.EventInteract$Action;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.client.api.feature.hud.TextHudElement;
import org.rusherhack.core.event.subscribe.Subscribe;

public class CrystalCounter extends TextHudElement {
   public Set<Long> f2001;
   public Map<EndCrystalEntity, Long> f2002;
   public static long f2003 = Class066.m4320(-1208134712274382937L, -2141626995160080552L, MethodHandles.lookup().lookupClass()).m4325(20830568583631L);
   public static String[] f2004;
   public static String[] f2005;
   public static long[] f2007;
   public static Long[] f2008;
   public static Map f2009;
   public static Object[] f2010 = new Object[41];
   public static String[] f2011 = new String[41];

   @Subscribe
   public void onRemove(EventEntity$Remove var1) {
      Entity var5;
      if ((var5 = var1.getEntity()) instanceof EndCrystalEntity) {
         EndCrystalEntity var7 = (EndCrystalEntity)var5;
         if (this.f2002.containsKey(var7)) {
            this.f2002.remove(var7);
            this.f2001.add(System.currentTimeMillis());
         }
      }
   }

   @Override
   public String getLabel() {
      return "Crystals/S";
   }

   @Override
   public String getText() {
      return String.valueOf(this.f2001.size());
   }

   @Subscribe
   public void onInteract(EventInteract var1) {
      if (var1.getAction() == EventInteract$Action.ATTACK) {
         Entity var5;
         if ((var5 = var1.getTargetEntity()) instanceof EndCrystalEntity) {
            EndCrystalEntity var7 = (EndCrystalEntity)var5;
            this.f2002.put(var7, System.currentTimeMillis());
         }
      }
   }

   public CrystalCounter() {
      super("CrystalCounter");
      this.f2002 = new WeakHashMap<>();
      this.f2001 = new HashSet<>();
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      this.f2001.removeIf(var0 -> {
         long var1x = f2003 ^ 75175222545225L;
         if (System.currentTimeMillis() - var0 > m4692(13127, 8730324022944425635L ^ var1x)) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.f2002.entrySet().removeIf(var0 -> {
         long var1x = f2003 ^ 131573982968469L;
         if (System.currentTimeMillis() - var0.getValue() > m4692(26822, 7010387020694490367L ^ var1x)) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
   }

   static {
    }
   public static String m221(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
   public static long m4692(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32658;
      if (f2008[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f2007[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f2009.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f2009.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/µ", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         f2008[var3] = var15;
      }

      return f2008[var3];
   }

   public static long m4693(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = m4692(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(CrystalCounter.class, "m4693", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/µ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m273() {
      f2010[0] = "\u0002\u0019D7\u000f\u0001\u001e\u0003Fk\u0015\u0015\u000e\u0000\rȟ";
      f2010[1] = int.class;
      f2011[1] = "java/lang/Integer";
      f2010[2] = "z\u0016_\u001dgBf\f]A}Vv\u000f\u0016Py^p\nL\u001dtG|J]EpYa\u0017\u0016CyVl\u0001J\u001dPAp\nLz{Cp\u0016YPa\u0013T\u0007LZzY";
      f2010[3] = "0\b\u0016(Z/.\u0000\fg9;*";
      f2010[4] = "\u0002\u0014.RU}\t\u001b?\u001d4s\u0002\u0010;G";
      f2010[5] = "8$\u0005\u0002\u0001|$>\u0007^\u001bh4=LO\u001f`28\u0016\u0002\u0012y>x\u0007Z\u0016g#%L\\\u001fh.3\u0010\u00026\u007f28\u0016e\u001d}2$\u0003O\u0007";
      f2010[6] = "}\u0018\u0005\\5?}\u0018\u0012\u000090gS\u0012\u001e9%`\"@@aa";
      f2010[7] = "?J{\u0012E\u0003#PyN_\u00173S2\u0089";
      f2010[8] = " \u0011RfsJ<\u000bP:i^,\b\u001bȼ";
      f2010[9] = "\u0015m~`N5\u001ebo/,6\u0011k";
      f2010[10] = long.class;
      f2011[10] = "java/lang/Long";
      f2010[11] = "\u0016\u0000\u0003\r\u007fB\u001d\u000f\u0012B\u0002W\u000f\u0015\u0010\u0001";
      f2010[12] = "qel5|\romvz\u001f\u0019k _:&\nb";
      f2010[13] = "\u0011\u0013@*Q\u0007\r\tBvK\u0013\u001d\n\tgO\u001b\u001b\u000fS*B\u0002\u0017ORm\r\u0005\u0017\u000fCkT\\)\bI`L\u0005=\u000eIpF\u001c\n)FjG\u001e\u001b\u0013eeP\u0017";
      f2010[14] = "^\u0000M`F5U\u000f\\/;-F\bUf";
      f2010[15] = "l3\u001aQ0(r;\u0000\u001eM8r";
      f2010[16] = "8\u001e\u001d\u0005eC&\u0016\u0007J-C<\u001c\u001f\r$X|/\u0019\u0001/_1\u001e\u001f\u0001";
      f2010[17] = boolean.class;
      f2011[17] = "java/lang/Boolean";
      f2010[18] = "0zA\u0012\u001cS,`CN\u0006G<c\b_\u0002O:fR\u0012\u000fV6&CJ\u000bH+{\bK\u0001T3l\by\u0018C1|cR\u001aO+q";
      f2010[19] = "A.ab\u0001P\u0018=n\u007fn_D=\u0011(RWM/hy\rFRQz)\u0017KB..i_M(";
      f2010[20] = "(8w\u0010*\u001ek6\u007fHL\nq\"w-%\nk)\u0018Lp\u000e+9d\u0002>RdD";
      f2010[21] = "$\u0013\u001dp\u001cZ(\f\u001d\u0016Ԝ%i\f\u001ex\u0012Wr\u000b\u0012\u0016";
      f2010[22] = "\u0010!$csr\u001c>$\u0005Ɋ\r]>'k}\u007fF9+\u0005";
      f2010[23] = "[\u000e +`oV\u000bum\u000e/j\u0003&hwm\u0017\u000fg6w\u0003\u0003S\",`~\u000f\u0012|,\u000e";
      f2010[24] = "\u007f%F2c:sd\u00182\r9\u007fx\u0006&J)\u0016m\u001a&c)dv\u001d*\r./!\u0002%p\"n\u007f\u0002K";
      f2010[25] = "EB\nIw\tGTUK\f\\\u0018OGKmQ\u0004jVS\f\fCH^\\u]\u001cYA\"g\r\u0006TQ]3MNR;";
      f2010[26] = "}q\u001eC~\u0017\u007fzZS\fE{i-UpKjd`\u000fl\u0015r|\u000eA<H|\u0015";
      f2010[27] = ">g'\u0005@x<qx\u0007;+bpl\u001f`+x\f\u007f\u0011K7kj&\u0002D*\u0004";
      f2010[28] = "<Fd\"\u0007\t>P; |MkH27\u00117=\u00114,\u0002NlN%3|\f:L07\u0005]e]/I";
      f2010[29] = "^40\u000bw%\u001602M\u001e\f8Q\u001e\u007f]E^40\u000bw%\u001602M";
      f2010[30] = "{\u001c\u001aP\u0004\u001cy\nER\u007fZ<\u000b+\u0000CC$\tRQ\u001cR;w\u0010\u0007\u001eG?\u000eAX\u000fXAL\u0017Z\u001a\\8\u001dHK\u0005\"";
      f2010[31] = "Yw\u0015;+@\u0013kC\u007fNM\u000fi2j2C\u0005s{;wE]|\u001bssG\u001b\u0015";
      f2010[32] = "?g\u000b #\u0006u{]dF\u000biy9s<\u000biy(|:\u0005xte&&[`l\u000bhv\u0006n\u0005";
      f2010[33] = "<I`<)|vH5oU+aT\u0000h19a(e=4!rQ4b%>\f";
      f2010[34] = "xO\fa\b}|\u0012]*gnE\u0010\u000f?\\b+\u0012N5V\u0007{\u0016Ra\u0002iyWXkg";
      f2010[35] = "X\u001b\u0001\u001f9%\u0001\b\u000e\u0002V9\\\u0001\u0016\u0010;\u0002_d\u001b\u00005$[\u001f\u0017\u00076<1\u000fK\u0017+)N[\u000b_-C";
      f2010[36] = "\tS\u000e6!?J]\u0006nG1^K\u001c8\u0000!7\u0010]5z2K^\u0013i5O\tS\u000e6!?J]\u0006nG";
      f2010[37] = "zS*Il^#@%T\u0003Cr^78rY~B4Ji^r,";
      f2010[38] = "b\u000eqj+\u0003fS !D¸_U!`/\u0002aW7?-";
      f2010[39] = "wqAf\u001ag<%\t!dm:1\u0002t\u0002z\u001b*\u001dt!g#/\u0019bd9{+Ed\u0018w5w\n\u0019";
      f2010[40] = "C=\u0019[\u0017_G`H\u0010xъ~5]\u0010\tJ\u0018lN\u001f\u0014";
   }
   public static Field m275(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m276(Class var0, String var1, Class var2) {
      Field var3 = m275(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m276(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }
   public static Method m278(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label33:
      for (Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for (int var10 = 0; var10 < var3; var10++) {
                  if (var9[var10] != var4[var10]) {
                     continue label33;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

   public static Method m279(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m278(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m279(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }
}
