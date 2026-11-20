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
public class friend extends Command {
   public static long f062 = Class066.m4320(70312770112371491L, -8640999611120826499L, MethodHandles.lookup().lookupClass()).m4325(51159057776935L);
   public static String[] f063;
   public static String[] f064;
   public static Object[] f066 = new Object[41];
   public static String[] f067 = new String[41];

   @CommandExecutor(
      subCommand = {"list"}
   )
   @CommandExecutor(
      subCommand = {"del", "delete", "rm", "remove"}
   )
   @CommandExecutor$Argument({"name"})
   @CommandExecutor(
      subCommand = {"add"}
   )
   @CommandExecutor$Argument({"name", "alias"})
   @CommandExecutor(
      subCommand = {"clear"}
   )
   public friend() {
      super("friend", "Mark a player as a friend");
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
      if (f067[var4] != null) {
         return var4;
      } else {
         Object var5 = f066[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 28;
               case 1 -> 52;
               case 2 -> 19;
               case 3 -> 49;
               case 4 -> 7;
               case 5 -> 17;
               case 6 -> 40;
               case 7 -> 18;
               case 8 -> 35;
               case 9 -> 10;
               case 10 -> 27;
               case 11 -> 53;
               case 12 -> 36;
               case 13 -> 60;
               case 14 -> 46;
               case 15 -> 31;
               case 16 -> 26;
               case 17 -> 16;
               case 18 -> 62;
               case 19 -> 34;
               case 20 -> 50;
               case 21 -> 47;
               case 22 -> 9;
               case 23 -> 24;
               case 24 -> 23;
               case 25 -> 55;
               case 26 -> 13;
               case 27 -> 45;
               case 28 -> 20;
               case 29 -> 22;
               case 30 -> 12;
               case 31 -> 11;
               case 32 -> 8;
               case 33 -> 43;
               case 34 -> 6;
               case 35 -> 38;
               case 36 -> 59;
               case 37 -> 56;
               case 38 -> 1;
               case 39 -> 21;
               case 40 -> 25;
               case 41 -> 3;
               case 42 -> 44;
               case 43 -> 61;
               case 44 -> 58;
               case 45 -> 0;
               case 46 -> 51;
               case 47 -> 14;
               case 48 -> 37;
               case 49 -> 39;
               case 50 -> 63;
               case 51 -> 48;
               case 52 -> 57;
               case 53 -> 4;
               case 54 -> 41;
               case 55 -> 54;
               case 56 -> 29;
               case 57 -> 5;
               case 58 -> 2;
               case 59 -> 42;
               case 60 -> 32;
               case 61 -> 15;
               case 62 -> 30;
               default -> 33;
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

            f067[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f066[0] = ".,\u001aDX\u007f26\u0018\u0018Bk\"5S\tFc$0\tDKz(p\b\u001eCf2p\u0012\b@o\"*\u000eDzf '\u0018\u0018xo-?\t\u0003Ede\r\t\u000b^o";
      f066[1] = ";\u0017\u000e\u0011s%'\r\fMi17\u000eGŔ";
      f066[2] = "\u001dI\rx.\u0018\u0001S\u000f$4\f\u0011PDТ";
      f066[3] = void.class;
      f067[3] = "java/lang/Void";
      f066[4] = "N\u0006\n,wjR\u001c\bpm~B\u001fCajmDZ\u0018vlsRZ=clm";
      f066[5] = "\u0018\u0000\u001fY\u000bC\u0013\u000f\u000e\u0016v[\u0000\b\u0007_";
      f066[6] = "z1i\u007f[jd9s0<ku\"~j\u001am";
      f066[7] = ")\u0003tw f\"\fe8Ah)\u0007ab";
      f066[8] = "! m\u001bi\u0003=:oGs\u0017-9$Vt\u0004+|dZo\u001f(;iTo\u001f!<$Ab\u0006+|DZo\u001f(;iTo\u001f!<";
      f066[9] = "Qs?\bYlO{%G.mI{'\u000e=vR|,\u001b";
      f066[10] = "\u0019d\u000eto\u001b\u0012k\u001f;\u0002\u001f\u0012w+p0\u0002\u0016k\u001bp";
      f066[11] = "J@B\u0002,\u001cVZ@^6\bFY\u000bO2\u0000@\\Q\u0002?\u0019L\u001cPX7\u0005V\u001cJN4\fFFV\u0002\u000e\u0005DK@^\f\fISQE1\u0007";
      f066[12] = "\u0010\b8M\\q\u000e\u0000\"\u0002>m\t\u001d";
      f066[13] = boolean.class;
      f067[13] = "java/lang/Boolean";
      f066[14] = "\u001f\u001bJDfi\u0003\u0001H\u0018|}\u0013\u0002\u0003ɬ";
      f066[15] = int.class;
      f067[15] = "java/lang/Integer";
      f066[16] = "-{a-\u0013hX[j\"\u0002'9Ua)\u0006}M";
      f066[17] = "{3b8Qig)`dK}w*+uOuq/q8Bl}ocsBha3`8@sy,dxG2u3b8spu8`dqyr$wsM\u007fq";
      f066[18] = "YT8d\u001a;EN:8\u0000/UMq\u000e";
      f066[19] = "Z7\u0000kRyF-\u00027HmV.Iȱ";
      f066[20] = "\u000bd#/I\u0016H%/n1KZ+.\u001f\f\u001cV')e\u0000\u0012T5R";
      f066[21] = "\u001aY\u0003DI\u0000_U\u0012%9(af%iwHRK\u0002\u001b\u0005\r^Z";
      f066[22] = "F/ypbD\u00078ov\u000eV{je)q@\u0003*|'6z@+|54\u0002\u00002rr\u000e";
      f066[23] = "m~\u0005\u00182<d(\u0015\u0018NďTw\u001b\u001b)i>>\u000fL6Q";
      f066[24] = "/?I\u001e.Wni\u0011AB\u0007}<s\u0010)\u0011um\u0012P;P+PM@x_}i\f\u0016 \u0000\u0011";
      f066[25] = "Z\u001fk\u00163n\u0013\u000b<\t\u000b~\u000e\u0014`\u000ffJ\u0019\u0010j\u0017g\u0004X\u000bd\u000e1|\u0018\u0012jI\u000b>\u000f\u001f}Agj\u0019\u000enq";
      f066[26] = "rs\\'\u0017{92\u000e{iԡCg\u001e.\u0011,*n\u00050\u0002A";
      f066[27] = "\u0019[Q\u000fvc\u0010\rA\u000f\nΰ R\u0011\u0010erM[G\u0000e";
      f066[28] = "\\\u0000\u000f\u001fVD\u0017A]C(ȧm\u0014M\u0016P\u0013\u0004\u001dV\bC~";
      f066[29] = "\u001cS\t\u001f\u00012UG^\u000091IQ+\u0002X5CQeCC;Z\u0007\u001d\u0003Z5\u001d=_\u0014W\"\u0015Q\u000b\u0002F1%";
      f066[30] = "I\rp\u001bD\r\u0000\u0019'\u0004|ǀpYn\u001c\u001dY\u0002\u001cb\r|]\u001c\rfL\u0010\t\n\u001cu|";
      f066[31] = "fwl+@\u0007&nblz\u0011:wj=\u0006\u007ffwl+@\u0007&nblz\u0015>v3j\u0017\u001cmfbTA\u0005>r5,\u0001\u001c05\u000f";
      f066[32] = ")P)\u001f^'iI'Xd!{N7\r#1\u0012\u0017{\u0001\u0018$h\u001bu\u0003\n_)P)\u001f^'iI'Xd";
      f066[33] = "\u007f4lkHh0/8oy,40sl\u00104\"]2p\u001a.u%ri\u0014iO";
      f066[34] = ")5u-^P?8#1.\t*-!J\u0015\u0015 7v2U\f.pL";
      f066[35] = ":\u0001BB\u0015\ftA\u0017Oe\u0006v\u0011UA\u0019\u0000p|\u0013\u0017\u0014WrGPV\u0018\u0016\n";
      f066[36] = "[j\u0007\u001eel\u0012~P\u0001]i\u000fx%\u0003<k\u0004h\u0010ym{\u000fn\u001b\u0012#;Zck";
      f066[37] = "\u0013<\u001a\u001dip\u0010`\u001e\u0011\u00043(k^\u0010{%P+G\u001e<\u001f\u0013*G\f>gS3IK\u0004";
      f066[38] = "~~m#\u001e\u0007=?abf\\+:Z~\u0016@Bp--VU. f/_<";
      f066[39] = "w5o\u0018Y&vk.\u0012d\u007f\u001b`9\u0014\u0000lwql\u0010\u0018\u0016w`4\u0011\u001ezf50\td";
      f066[40] = "vo\"lA\u000e?{usy\u00054O4j\u0014\u0002#\u0001uq\u001a\u001buy5h\u0014\\O0\u007f5I\r#`47@d";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f066[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f067[var4]);
            f066[var4] = var5;
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
      Object var5 = f066[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f067[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f066[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f066[var4] = var13;
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
               var12 = m158(534665192982927L, 0L);
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
      Object var5 = f066[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f067[var4];
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
               f066[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(534665192982927L, 0L);
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
                     f066[var4] = var19;
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
               var23 = m158(534665192982927L, 0L);
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
         if (var8 != 217 && var8 != 239 && var8 != 'l' && var8 != 'g') {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'Y') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'f') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 217) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 239) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'l') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(friend.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/D" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
