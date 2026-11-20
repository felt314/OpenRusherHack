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
import java.util.Iterator;
import java.util.Optional;
import java.util.StringJoiner;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.client.api.feature.command.arg.PlayerReference;
import org.rusherhack.client.api.utils.objects.PlayerRelation;
import org.rusherhack.client.api.utils.objects.PlayerRelation$State;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
public class enemy extends Command {
   public static long f9474 = Class066.m4320(-3608350986195739252L, -9129839809344131748L, MethodHandles.lookup().lookupClass()).m4325(205826930918222L);
   public static String[] f9475;
   public static String[] f9476;
   public static Object[] f9478 = new Object[40];
   public static String[] f9479 = new String[40];

   @CommandExecutor(
      subCommand = {"list"}
   )
   @CommandExecutor(
      subCommand = {"clear"}
   )
   @CommandExecutor(
      subCommand = {"add"}
   )
   @CommandExecutor$Argument({"name", "alias"})
   @CommandExecutor(
      subCommand = {"del", "delete", "rm", "remove"}
   )
   @CommandExecutor$Argument({"name"})
   public enemy() {
      super("enemy", "Mark a player as an enemy");
   }

   static {
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
      if (f9479[var4] != null) {
         return var4;
      } else {
         Object var5 = f9478[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 38;
               case 1 -> 11;
               case 2 -> 44;
               case 3 -> 31;
               case 4 -> 32;
               case 5 -> 2;
               case 6 -> 58;
               case 7 -> 50;
               case 8 -> 36;
               case 9 -> 52;
               case 10 -> 55;
               case 11 -> 37;
               case 12 -> 12;
               case 13 -> 25;
               case 14 -> 18;
               case 15 -> 23;
               case 16 -> 54;
               case 17 -> 33;
               case 18 -> 51;
               case 19 -> 19;
               case 20 -> 30;
               case 21 -> 39;
               case 22 -> 48;
               case 23 -> 34;
               case 24 -> 13;
               case 25 -> 16;
               case 26 -> 62;
               case 27 -> 40;
               case 28 -> 42;
               case 29 -> 59;
               case 30 -> 10;
               case 31 -> 15;
               case 32 -> 26;
               case 33 -> 57;
               case 34 -> 5;
               case 35 -> 35;
               case 36 -> 8;
               case 37 -> 61;
               case 38 -> 17;
               case 39 -> 47;
               case 40 -> 4;
               case 41 -> 7;
               case 42 -> 27;
               case 43 -> 9;
               case 44 -> 22;
               case 45 -> 46;
               case 46 -> 0;
               case 47 -> 41;
               case 48 -> 21;
               case 49 -> 28;
               case 50 -> 49;
               case 51 -> 24;
               case 52 -> 20;
               case 53 -> 45;
               case 54 -> 63;
               case 55 -> 53;
               case 56 -> 60;
               case 57 -> 56;
               case 58 -> 3;
               case 59 -> 1;
               case 60 -> 43;
               case 61 -> 29;
               case 62 -> 14;
               default -> 6;
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

            f9479[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f9478[0] = "\u0010hS\u0011\r{\frQM\u0017o\u001cq\u001aŔ";
      f9478[1] = "$jig\u0011\u001e8pk;\u000b\n(s н";
      f9478[2] = "\nUNU\u0000t\u0016OL\t\u001a`\u0006L\u0007ɽ";
      f9478[3] = int.class;
      f9479[3] = "java/lang/Integer";
      f9478[4] = "d\u0001E@v\u0015x\u001bG\u001cl\u0001h\u0018\f\rh\tn\u001dV@e\u0010b]W\u0007*\u0017b\u001dF\u0001sN\\\u001aL\nk\u0017H\u001cL\u001aa\u000e\u007f;C\u0000`\fn\u0001`\u000fw\u0005";
      f9478[5] = "Y\t\u0011;\\CR\u0006\u0000t![A\u0001\t=";
      f9478[6] = "#x(.ImVX#!X\"7V(*\\xC";
      f9478[7] = boolean.class;
      f9479[7] = "java/lang/Boolean";
      f9478[8] = ",kv2zP0qtn`D r?\u007fdL&we2iU*7wyiQ6kt2kJ.tprl\u000b\"kv2XI\"`tnZ@%|cyfF&";
      f9478[9] = void.class;
      f9479[9] = "java/lang/Void";
      f9478[10] = "\u001e_L#:U\u0002EN\u007f A\u0012F\u0005գ";
      f9478[11] = "Kewn:DW\u007fu2 PG|>ȴ";
      f9478[12] = "#Mkxw%?Wi.m1/T\"5j\")\u0011y\"l<?\u0011_\"w9\"XY\"l<?";
      f9478[13] = "L9\u0007q\t\u001bP#\u0005-\u0013\u000f@ N<\u0017\u0007F%\u0014q\u001a\u001eJe\u0015+\u0012\u0002Pe\u000f=\u0011\u000b@?\u0013q+\u0002B2\u0005-)\u000bO*\u00146\u0014\u0000\u0007\u0018\u0014>\u000f\u000b";
      f9478[14] = "5-].\fM+%GakL:>J;MJ";
      f9478[15] = "U:8\n*H^5)EKFU>-\u001f";
      f9478[16] = "L:)C\u0014SR23\fiRT21EpIO5:P";
      f9478[17] = "\u0018~VCR;\u0013qG\f??\u0013msG\r\"\u0017qCG";
      f9478[18] = "x\\\u0001\u007f=\u0017dF\u0003#'\u0003tEH2#\u000br@\u0012\u007f.\u0012~\u0000\u0013%&\u000ed\u0000\t3%\u0007tZ\u0015\u007f\u001f\u000evW\u0003#\u001d\u0007{O\u00128 \f";
      f9478[19] = "\u000b\u001e@?35\u0015\u0016ZpQ)\u0012\u000b";
      f9478[20] = "\u0019&:~\u0006\u001e\u00146',>FE*6NW]K`v,UOXaJ";
      f9478[21] = "v\u0002\u00051\u0000Lx\u001bFWĵ3\"]B+\u0012\nz\u0004\u0018fk";
      f9478[22] = "m;4O\u0003@7&\"[a\u0012k2ZL\u001f\u001e64\"\\\f\u0018~^0C\u000f\u0012eej^\u0019\u0006\u0007";
      f9478[23] = "]f%>wm\u001b&3p\u001cսge(xyv[9:jb\u001d";
      f9478[24] = "\u0003zQ#Tz\rc\u0012E\u0381\u0005\u0003zQ#Tz\rc\u0012";
      f9478[25] = "\u0000\u001d\u001c\u0006<:\u0006\u000e\u0006\u001fG{;O\u001d\u001f\u007f-\u0006\u0013\u001e\b;W\u0000\u000f\u0001@=j\\\f\u0016\u0004G";
      f9478[26] = "A\n\u0019{\u0011\"\u0019SC6hƼx\u0002\u001bhPq\u0016JZl\b\u001bFKHf\u0013k\tVBfh";
      f9478[27] = "\u0006\u001f_4D\"Z\u001cHp>qZ\u001e]eB\u001f\u0006\u001f_4D\"Z\u001cHp>#T\u0003S5[sT\u0002Z\f\u0005dZ\\B1YgM\u00188";
      f9478[28] = "X\"\u0014[#9\u0000{N\u0016Za\u001aVLJ?qa Q@bz\\|RW&\u0000\\y@@!g\u001ct@]Z";
      f9478[29] = "\u0015=|\u0004\u0018:I>k@byG\"fQ%i./f_X;L-tLY\u0007\u0015=|\u0004\u0018:I>k@b";
      f9478[30] = "dS!)\nMaBouqQ0H3\u0017JL>\u0015$*\u0016O)Q^";
      f9478[31] = "Fy3RabJu9_]/Vh2T47@\u0005sI:jW8/J-.-";
      f9478[32] = "\u0012\btbyeJQ./\u0000&FT-`m\u0011M\\/o\u0000gPVrd=;SA6\u001e>$DP1nq9NPJ";
      f9478[33] = "{cfL\u0002rz\u007faA;ukigNGsm\u0004,[K$/:!KVv\u0017";
      f9478[34] = "vf>\u0001\u00027.?dL{g#3M\u001b\u0016k>_;\u0006\u001c65bg\u0005\u000brOax\u0012\u001au?.e\u0018\u001a\u000e";
      f9478[35] = "\u001d\bdJ\u0014^EQ>\u0007m\bIM\u0017P\u0000\u0002E\\!6\u0001\u0000_ZcP\u0000\u001cXWZ";
      f9478[36] = "\u0001!^Xtp_9NL\u0011#?lXE(*]c\u0003NaJ\u00004F\u0005q(\u000foML\u0011";
      f9478[37] = "#*\u0001\u0011\u000f9oo\u0010\f?h\u0013n\u0006\u000b\u0007>.2\u0005\u001cCD(.\u001aTEyt-\r\u0010?";
      f9478[38] = "$\u000fZ\u00036#)\u001fGQ\u000e}|\bl^~a\u0015NHYifr\u000eEYt\u001d";
      f9478[39] = "4\u000695a\u001c|G=m\u000b?Cw\u0013\\\u000bC9Unge\u000bxQ6";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f9478[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f9479[var4]);
            f9478[var4] = var5;
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
      Object var5 = f9478[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f9479[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f9478[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f9478[var4] = var13;
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
               var12 = m158(1101804775113639L, 0L);
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
      Object var5 = f9478[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f9479[var4];
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
               f9478[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(1101804775113639L, 0L);
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
                     f9478[var4] = var19;
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
               var23 = m158(1101804775113639L, 0L);
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
         if (var8 != 212 && var8 != 223 && var8 != 220 && var8 != 'q') {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 243) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'H') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 212) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 223) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 220) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(enemy.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ծ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
