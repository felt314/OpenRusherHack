package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;

public class Class156 extends Util458 {
   public int f3186;
   public Vec3d f3187;
   public static long f3188 = Class066.m4320(8383700142277584629L, 2273940946074576930L, MethodHandles.lookup().lookupClass()).m4325(179914041270985L);
   public static long[] f3189;
   public static Integer[] f3190;
   public static Map f3191 = new HashMap(13);
   public static Object[] f3192 = new Object[54];
   public static String[] f3193 = new String[54];

   public void kill() {
      long var1 = f3188 ^ 27574204151578L;
      int var3 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ã", java.lang.invoke.MethodType.methodType(int.class, long.class, long.class)), -5398515892465839530L,  var1))).intValue();
      Class156 var10000 = this;
      if (var3 != 0) {
         if (((java.lang.Float)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "I", java.lang.invoke.MethodType.methodType(float.class, java.lang.Object.class, long.class, long.class)), this,  -5398562315610126964L,  var1))).floatValue() <= 0.0F) {
            return;
         }

         var10000 = this;
      }

      var10000.kill();
   }

   public void setHealth(float var1) {
        
    }

   public Class156(@Nullable PlayerEntity var1, String var2) {
        super(var1, var2);
      long var3 = f3188 ^ 55974326342224L;

      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "I", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, boolean.class, long.class, long.class)), this,  true,  -8043549032868913722L,  var3);
      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "z", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, net.minecraft.util.math.Vec3d.class, long.class, long.class)), this,  ((net.minecraft.util.math.Vec3d)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "I", java.lang.invoke.MethodType.methodType(net.minecraft.util.math.Vec3d.class, java.lang.Object.class, long.class, long.class)), this,  -8043435777753489512L,  var3))),  -8044204648810850728L,  var3);
   }

   static {
    }
   public static int m118(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21246;
      if (f3190[var3] == null) {
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
         long var5 = f3189[var3];
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
         Object[] var9 = (Object[])f3191.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f3191.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ŕ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f3190[var3] = var15;
      }

      return f3190[var3];
   }

   public static int m119(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m118(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class156.class, "m119", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ŕ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m704(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3193[var4] != null) {
         return var4;
      } else {
         Object var5 = f3192[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 13;
               case 1 -> 25;
               case 2 -> 39;
               case 3 -> 48;
               case 4 -> 1;
               case 5 -> 60;
               case 6 -> 27;
               case 7 -> 49;
               case 8 -> 0;
               case 9 -> 26;
               case 10 -> 18;
               case 11 -> 5;
               case 12 -> 63;
               case 13 -> 36;
               case 14 -> 10;
               case 15 -> 34;
               case 16 -> 59;
               case 17 -> 3;
               case 18 -> 52;
               case 19 -> 37;
               case 20 -> 20;
               case 21 -> 50;
               case 22 -> 62;
               case 23 -> 40;
               case 24 -> 15;
               case 25 -> 33;
               case 26 -> 51;
               case 27 -> 28;
               case 28 -> 11;
               case 29 -> 9;
               case 30 -> 61;
               case 31 -> 4;
               case 32 -> 6;
               case 33 -> 7;
               case 34 -> 29;
               case 35 -> 12;
               case 36 -> 57;
               case 37 -> 47;
               case 38 -> 2;
               case 39 -> 23;
               case 40 -> 16;
               case 41 -> 32;
               case 42 -> 44;
               case 43 -> 19;
               case 44 -> 53;
               case 45 -> 35;
               case 46 -> 22;
               case 47 -> 30;
               case 48 -> 43;
               case 49 -> 58;
               case 50 -> 17;
               case 51 -> 24;
               case 52 -> 46;
               case 53 -> 55;
               case 54 -> 54;
               case 55 -> 41;
               case 56 -> 42;
               case 57 -> 45;
               case 58 -> 38;
               case 59 -> 21;
               case 60 -> 14;
               case 61 -> 31;
               case 62 -> 56;
               default -> 8;
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

            f3193[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f3192[0] = "\u0012BV$W\u0002\u000eXTxM\u0016\u001e[\u001fş";
      f3192[1] = double.class;
      f3193[1] = "java/lang/Double";
      f3192[2] = "ke|\u0004!jw\u007f~X;~g|5ɞ";
      f3192[3] = "\u0016`\u0016q\u0007[\u0016`\u0001-\u000bT\f+\u00013\u000bA\u000bZSmS\u0001";
      f3192[4] = boolean.class;
      f3193[4] = "java/lang/Boolean";
      f3192[5] = "\u0000n\tW\u000fp\u0000n\u001e\u000b\u0003\u007f\u001a%\u001e\u0015\u0003j\u001dTNMS.";
      f3192[6] = "JH\u0015\b.7JH\u0002T\"8P\u0003\u0002J\"-WrR\u0012rj";
      f3192[7] = int.class;
      f3193[7] = "java/lang/Integer";
      f3192[8] = float.class;
      f3193[8] = "java/lang/Float";
      f3192[9] = "D%d7WEX?fkMQH<-ȟ";
      f3192[10] = "5\u0014\u0006\t\ro5\u0014\u0011U\u0001`/_\u0011K\u0001u(.D\u0014X";
      f3192[11] = "Kr\u0017]0`Kr\u0000\u0001<oQ9\u0000\u001f<zVHPGl0";
      f3192[12] = void.class;
      f3193[12] = "java/lang/Void";
      f3192[13] = "\u0012,{\u0006\u0005\u0019\u0012,lZ\t\u0016\bglD\t\u0003\u000f\u00168\u0018Z";
      f3192[14] = "c:\u001b)Y3c:\fuU<yq\fkU)~\u0000^5\rm";
      f3192[15] = "h[A>F3h[VbJ<r\u0010V|J)ua\u0007#\u0012n";
      f3192[16] = "6{?1\t-6{(m\u0005\",0(s\u00057+Ay,]|";
      f3192[17] = "j;w\u0011\u001b\bj;`M\u0017\u0007pp`S\u0017\u0012w\u00011\u000bFQ";
      f3192[18] = "\u0005BH\bNy\u0019XJTTm\t[\u0001ES~\u000f\u001eJPYb\u001e\u001ejPYb\u001erZU";
      f3192[19] = ":\u0019.EX\u0011&\u0003,\u0019B\u00056\u0000g\bE\u00160E,\u001dO\n!E=\u0012Z\u0001{.?\u000eD\u0010";
      f3192[20] = "\ruy/\u007f{\runsst\u0017>nmsa\u0010O<3+&";
      f3192[21] = "%C6B\u0002J%C!\u001e\u000eE?\b!\u0000\u000eP8ytTW\u0013";
      f3192[22] = ":+r~{\f:+e\"w\u0003 `e<w\u0016'\u00115a&";
      f3192[23] = "\u0016\u000eG7\u001a\u001a\n\u0014Ek\u0000\u000e\u001a\u0017\u000ez\u0004\u0006\u001c\u0012T7\t\u001f\u0010Rgu\u0007\r\u0018\u0010S";
      f3192[24] = ", \u001922Q0:\u001bn(E 9Pŷ";
      f3192[25] = "C\u001ew\u001d;<C\u001e`A73YU`_7&^$1\u0007e";
      f3192[26] = "?aJd`Q#{H8zE3x\u0003Ѷ";
      f3192[27] = "k+k;2\u0018`$ztS\u0016k/~.";
      f3192[28] = "\u0011\fFU$\b\u0011\\Mk0T\u0007\fM\u0007\u0002\u0003@W\u0013[U\u0000K\u0012\u0013\u0004mD\u0016\u000f\u0010k";
      f3192[29] = "hSaJ\r\u0011h\u0003jt\u0015 ;S`\tA\u0018b^hH|\u0019b^pID@oV1t";
      f3192[30] = "k:^X\u0003MkjUf\u0017\u0011}:U\n%B9k\bfH\u0017{bL[CCx52\\\u0002\u001as'V\tIGjZ";
      f3192[31] = "\n\u0016q>~\\U\u0005pa\u0013PP\u0001j0D\u0007\r]5e\u0013\u0002W\fo;/[V\u0012j";
      f3192[32] = "`\n\u001cz\u001e\u001a`Z\u0017Dĩ+7[\u0000#TRe\u0000\u001d\u007f";
      f3192[33] = "p\u0017f\u001bWdpGm%C8f\u0017mIqk\"L0%\u001b-\u007fHg\u001fK4vH\n";
      f3192[34] = "0A\u001e;)uk\u0004\u000fa@Ԭ\u000e\u0006Q{'wwT\nf{L";
      f3192[35] = "\u0004]\u000bk\u001b?_\u0018\u001a1rɟ:\u001aD+\u0015=CH\u001f6I\u0006";
      f3192[36] = "lR6fj0c\r$c\u00147>K?gx\u0005c\u000bo>\u0014kcIfo,/>Te\u0000-b-\u000e08i?0\r_9$,jXg}y1i7cft34\u000b:gj6S\b.0e4<G\"?qRnO:?yh>V3?\u0014o+R`m.?2[`\u0000.\"5E\"d{ih\\_0sc>O#opc/7";
      f3192[37] = "=_ )x*<\u000e(?\u001556\r>=BbnZ`i\u00150o\u0000'*i'5\n<";
      f3192[38] = ".o_aL@r3M<s\u0082OkD=\u0001\u0005+>\u000f`\u0018x\u007f6\u00056\u000b\u0004 5\u0005's";
      f3192[39] = "\rE)_~\u000f\r\u0015\"ajS\u001bE\"\rX\u0007V\u0018~Q\u000f^\tZz\u00191Y\u0001\u0019ta";
      f3192[40] = "a[\u00003p_a\u000b\u000b\rd\u0003w[\u000baVS5\u0000P\r>\u001f;J\nbq\u00134^l";
      f3192[41] = "S!\u001e\u0005\"I\u0004rX]S[\\.DS\u0004\f\u0003s\u001f?lPT%^]c\u000fF ";
      f3192[42] = "\u0003BL)\u0004I\u0003\u0012G\u0017\u0010\u0015\u0015BG{\"FQ\u001d\u001b\u0017H\u0000\f\u001dM-\u0018\u0019\u0005\u001d '\u0012I\u0004Z\\x\u0011I\u0015\"";
      f3192[43] = "M9\u001b\u0000TL\u0018:\u0004E9Ө\"4\u001f\u0013CHP6F\u0000T";
      f3192[44] = "+\"4j\u001c^+r?Tμo!,'k\u0015Q&$de";
      f3192[45] = "Y\\~?8B\u0012\u0007x~W\u001d\u0005Fx!;/S\u0002%\u007fWI\u0018C{*6A\u0014Z|F>\u0017\t\u0007f 'C\u0006\n\u0018{f\b\u000f\u0001a)=\u0015S:(!f\u0015\u0010Fw\"f\u0004h";
      f3192[46] = "H\u001f\u0017\u001d&%JF\u0004\n\\/D\u0005\u0000g0-G\u000fAY.6\\\f|W;fN\u0006\u0000\b8f_~";
      f3192[47] = "UE8fNm\u0007\u000f\"d#zY\u00126vt)\tEn\u001aNdUG(wIoZA";
      f3192[48] = "nb0\f>r91vTO`amjZ\u00187?956~hfya\f53`8";
      f3192[49] = "]\\N@wOJ]U\u0016KEYfD\u0012u\u001aC\u001a\u0013A3B";
      f3192[50] = "D\n\"nC\u0010DZ)PWLR\n)<e\u001b\u0015Qti2\u0018\u001e\u0014w?\n\\C\ttP";
      f3192[51] = "Iy<uaC\u001b3&w\fTE.2e[\u0007\u0014rf\taJI{,dfAF}";
      f3192[52] = "O[Djq\u0001O\u000bOTe]Y[O8W\n\u001e\u0000\u0011k\u0000\t\u0015E\u0011;8MHX\u0012T";
      f3192[53] = "|\u001a0AY\b|J;\u007fMTj\u001a;\u0013\u007f\u0007.Cf\u007f\u0012Ip\b!\u001bG\u0002-\u0011\\";
   }

   public static Class m706(long var0, long var2) {
      Class var5 = null;
      int var4 = m704(var0, var2);
      Object var6 = f3192[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3193[var4]);
            f3192[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m707(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m708(Class var0, String var1, Class var2) {
      Field var3 = m707(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m708(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m709(long var0, long var2) {
      int var4 = m704(var0, var2);
      Object var5 = f3192[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3193[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m706(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m707(var12, var10, var11);
            if (var13 != null) {
               f3192[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m708(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3192[var4] = var13;
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
               var12 = m706(1901499479319455L, 0L);
            }
         }
      }
   }

   public static Method m710(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m711(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m710(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m711(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m712(long var0, long var2) {
      int var4 = m704(var0, var2);
      Object var5 = f3192[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3193[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m706(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m710(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f3192[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m706(1901499479319455L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m711(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f3192[var4] = var19;
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
               var23 = m706(1901499479319455L, 0L);
            }
         }
      }
   }

   public static MethodHandle m713(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 162 && var8 != 'z' && var8 != 'Q' && var8 != 211) {
            var11 = m712(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'I') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 227) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m709(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 162) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'z') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'Q') {
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

   public static Object m714(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m713(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class156.class, "m714", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ŕ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
