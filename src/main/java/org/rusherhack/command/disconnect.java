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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.text.Text;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.exceptions.ValidationException;

public class disconnect extends Command {
   public static long f3664 = Class066.m4320(-7915030600658884362L, -3997935206312637424L, MethodHandles.lookup().lookupClass()).m4325(180247223212763L);
   public static String[] f3665;
   public static String[] f3666;
   public static Object[] f3668 = new Object[31];
   public static String[] f3669 = new String[31];

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   public String m7634() {
      long var1;
      label22: {
         var1 = f3664 ^ 122122199855258L;
         if (Globals.mc.world != null) {
            ClientPlayerEntity var10000 = Globals.mc.player;

            try {
               if (var10000 != null) {
                  break label22;
               }
            } catch (Class316 var4) {
               throw m116(var4);
            }
         }

         try {
            throw new IllegalStateException("You must be in-game to use this command.");
         } catch (Class316 var3) {
            throw m116(var3);
         }
      }

      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "E", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Globals.mc.player.networkHandler.getConnection(),  Text.literal("[rusherhack] Disconnect upon request via command"),  -6303383874432529654L,  var1);
      return null;
   }

   public disconnect() {
      super("disconnect", "Disconnect from your current game session");
      String[] var10001 = new String[]{"dc", null, null};
      boolean var10005 = true;
      var10001[1] = "quit";
      var10001[2] = "leave";
      this.addAliases(var10001);
   }

   static {
    }

   public static Class316 m116(Class316 var0) {
      return var0;
   }

   public static String m117(byte[] var0) {
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
   public static int m156(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3669[var4] != null) {
         return var4;
      } else {
         Object var5 = f3668[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 45;
               case 1 -> 19;
               case 2 -> 57;
               case 3 -> 4;
               case 4 -> 21;
               case 5 -> 25;
               case 6 -> 54;
               case 7 -> 7;
               case 8 -> 10;
               case 9 -> 44;
               case 10 -> 8;
               case 11 -> 58;
               case 12 -> 18;
               case 13 -> 9;
               case 14 -> 38;
               case 15 -> 36;
               case 16 -> 49;
               case 17 -> 33;
               case 18 -> 24;
               case 19 -> 12;
               case 20 -> 20;
               case 21 -> 31;
               case 22 -> 47;
               case 23 -> 59;
               case 24 -> 1;
               case 25 -> 63;
               case 26 -> 55;
               case 27 -> 48;
               case 28 -> 50;
               case 29 -> 53;
               case 30 -> 11;
               case 31 -> 2;
               case 32 -> 14;
               case 33 -> 23;
               case 34 -> 30;
               case 35 -> 17;
               case 36 -> 5;
               case 37 -> 37;
               case 38 -> 61;
               case 39 -> 27;
               case 40 -> 13;
               case 41 -> 60;
               case 42 -> 52;
               case 43 -> 32;
               case 44 -> 41;
               case 45 -> 26;
               case 46 -> 42;
               case 47 -> 46;
               case 48 -> 43;
               case 49 -> 51;
               case 50 -> 15;
               case 51 -> 56;
               case 52 -> 22;
               case 53 -> 0;
               case 54 -> 62;
               case 55 -> 16;
               case 56 -> 28;
               case 57 -> 29;
               case 58 -> 40;
               case 59 -> 34;
               case 60 -> 6;
               case 61 -> 3;
               case 62 -> 39;
               default -> 35;
            };
            int[] var7 = new int[6];

            for (int var8 = 0; var8 < 6; var8++) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for (int var14 = 0; var14 < var13.length; var14++) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            f3669[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m343() {
      f3668[0] = "Jp1_0>Vj3\u0003**FixȻ";
      f3668[1] = "*2\u001f7\bZ!=\u000exuB2:\u00071";
      f3668[2] = "gE\u0018\u0016(\u0016{_\u001aJ2\u0002k\\Q[5\u0011m\u0019\u001dQ4\u0007&u\u0016V>.iY\u001e_?\u0011JV\f]";
      f3668[3] = "\u0019=9\u001f\u001f|\u0005';C\u0005h\u0015$pR\u0002{\u0013a=^\u0000d\u0017!:\u001f,k\u0005;,P\u000e}5 3\\\fg\u0012";
      f3668[4] = "\u0015\u001bP*W\u001a`;[%FU\u001d#H\"O\u001cu";
      f3668[5] = void.class;
      f3669[5] = "java/lang/Void";
      f3668[6] = "kh\u001f9A\u0005wr\u001de[\u0011gqVƙ";
      f3668[7] = "~9\u0007\u0001/\u0006b#\u0005]5\u0012r Nɛ";
      f3668[8] = "}6\u0013F|ya,\u0011\u001afmq/Zɮ";
      f3668[9] = int.class;
      f3669[9] = "java/lang/Integer";
      f3668[10] = "L\u001dMP7?L\u001dZ\f;0VVZ\u0012;%Q'\u000bKic";
      f3668[11] = "eJYh\u0001:eJN4\r5\u007f\u0001N*\r xp\u001fsZb";
      f3668[12] = "xF+\u0002\u0014Sd\\)^\u000eGt_bO\nOrZ8\u0002\u0007V~\u001a\u000b@\tDvX?";
      f3668[13] = "i5\t:~vi5\u001efrys~\u001exrlt\u000fN%#";
      f3668[14] = "+;H \u0016z+;_|\u001au1p_b\u001a`6\u0001\n=O";
      f3668[15] = "''Qjax''F6mw=lF(mb:\u001d\u0010v9!";
      f3668[16] = "S09}JxS0.!FwI{.?FbN\n{`\u001f";
      f3668[17] = "\u0019#p/`e\u0019#gslj\u0003hgml\u007f\u0004\u001935;";
      f3668[18] = "`\u0015fP>(k\u001aw\u001f_&`\u0011sE";
      f3668[19] = "Lu6T}wB%w$θ\u001eW|&T}\"Ae.$axIj$\u0018waA\u001a";
      f3668[20] = "\u0013ZJ\u001dE\u001fHBKF&\u0014H'\u0019\u0017\u001dJN\u001aJ\r\u001cN";
      f3668[21] = "j\u00115\rq6:\u0003\"U\u0014/n\u00068Rx\u001d?Jb\u0004*J=\u000b`N,28\u0007eZ\u0014";
      f3668[22] = "\b-''-(\f4{#\u0015\u007f18z e=\r.c(\u0015!W&l\")7N.\u001c";
      f3668[23] = "{Y<\u0010!;*W|\u0010\u001d;G\n\u007f\u0019c;&\n,\u0015{Rz\b%\u0002t3z[)\u001a\u001d";
      f3668[24] = "l\u0015W\u00129Z9C\t\u0016\u0002ՓR\u0017[M{O7\u0012P\u0002m3";
      f3668[25] = ";?\t|\u00073|h\u0018rx9m8<x\u00199z9\u000e\u001cCmk/\u0019r\u0007=y$u'\u00055x?\u0005qA>9T";
      f3668[26] = "\bLS\u0001\fzE\u0016\u000e\u000f6%ZV\n\u0001Z\u0017\u000b\u0011VY\u000e@EL\u0006\u0016X|SU\u000ef_%JG\u001bXQxZRj";
      f3668[27] = "~oG'9;{cB3\u0001&-b\u001f;m\u0014y&@`>C\u007fxF;;y2\"\u001b5\u0001x={\u00067q.ypG\\";
      f3668[28] = "\u001e\u000f~tO\u0006M\u0015\u007fp\"UN\u0003!#u\u0002\u0011^zOHZB\t9!MCS\u0016";
      f3668[29] = ">\u000b*A\u0001~m\u0011+El-n\u0007u\u0016;z0P-z\u0007(r\u0016t\u001d\t%i\u000e";
      f3668[30] = "_\u000b\b\u007fWyQ\u0006\u0013g2pU\r\u0011oe%\u0005\\I\u0003[uYX\u0010\u007f\u000bgN\u0000";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f3668[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3669[var4]);
            f3668[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m159(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m160(Class var0, String var1, Class var2) {
      Field var3 = m159(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m160(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m161(long var0, long var2) {
      int var4 = m156(var0, var2);
      Object var5 = f3668[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3669[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f3668[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3668[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new IllegalStateException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = m158(1308638041564672L, 0L);
            }
         }
      }
   }

   public static Method m162(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m163(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m162(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m163(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m164(long var0, long var2) {
      int var4 = m156(var0, var2);
      Object var5 = f3668[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3669[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            var11++;
            var12++;
         } while ((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for (int var16 = 0; var16 < var11; var16++) {
            int var17 = var6.indexOf(8, var12);
            var15 = m158(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m162(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f3668[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(1308638041564672L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m163(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f3668[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while (var29 < var13) {
                  var28.append(var14[var29].getName());
                  if (++var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new IllegalStateException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(1308638041564672L, 0L);
            }
         }
      }
   }

   public static MethodHandle m165(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'u' && var8 != 197 && var8 != 227 && var8 != 'p') {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'E') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 224) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'u') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 197) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 227) {
               var9 = var0.findStaticGetter(var12, var18, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var18, var14);
            }
         }

         return MethodHandles.dropArguments((MethodHandle)var9, var3.parameterCount() - 2, long.class, long.class);
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName())
            .append(" : ")
            .append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null "))
            .append(" : ")
            .append(var15.toString());
         throw new IllegalStateException(var13.toString());
      }
   }

   public static Object m166(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m165(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(disconnect.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ǝ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
