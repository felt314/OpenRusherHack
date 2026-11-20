package org.rusherhack.client.api.utils;
import org.rusherhack.*;

import java.io.File;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.system.MemoryUtil.MemoryAllocator;
import org.rusherhack.Class066;
import org.rusherhack.Class316;
import org.rusherhack.core.setting.Setting;

public class BufferUtils {
   public static MemoryAllocator ALLOCATOR;
   public static long f1093 = Class066.m4320(-6574510285027451875L, -5290764920821407964L, MethodHandles.lookup().lookupClass()).m4325(79266576471651L);
   public static String[] f1094;
   public static String[] f1095;
   public static Map f1096 = new HashMap(13);
   public static long f1097;
   public static Object[] f1098 = new Object[44];
   public static String[] f1099 = new String[44];

   public static ByteBuffer inputStreamToByteBuffer(InputStream var0) {
      long var1 = f1093 ^ 104042265187550L;
      ByteBuffer var3 = ((java.nio.ByteBuffer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ò", java.lang.invoke.MethodType.methodType(java.nio.ByteBuffer.class, int.class, long.class, long.class)), (int)f1097,  -7336950154388935956L,  var1)));
      ReadableByteChannel var10 = ((java.nio.channels.ReadableByteChannel)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ò", java.lang.invoke.MethodType.methodType(java.nio.channels.ReadableByteChannel.class, java.lang.Object.class, long.class, long.class)), var0,  -7340078001378373160L,  var1)));

      try {
         while (true) {
            int var5;
            int var11 = var5 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(int.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var10,  var3,  -7336633045272291271L,  var1))).intValue();

            try {
               if (var11 == -1) {
                  break;
               }

               if (var5 != 0) {
                  continue;
               }
            } catch (Throwable var8) {
            throw new IllegalStateException("reflection failure");
            }

            int var10001 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(int.class, java.lang.Object.class, long.class, long.class)), var3,  -7340007687262229287L,  var1))).intValue() * 3;
            boolean var10004 = true;
            var3 = ((java.nio.ByteBuffer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ò", java.lang.invoke.MethodType.methodType(java.nio.ByteBuffer.class, java.lang.Object.class, int.class, long.class, long.class)), var3,  var10001 >> 1,  -7337001328651249092L,  var1)));
         }
      } catch (Throwable var9) {
         if (var10 != null) {
            try {
               org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), var10,  -7336496637677286409L,  var1);
            } catch (Throwable var6) {
               org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var9,  var6,  -7337264119870922339L,  var1);
               throw new IllegalStateException(var9);
            }

            throw new IllegalStateException(var9);
         }

         throw new IllegalStateException(var9);
      }

      ByteBuffer var12;
      label39: {
         try {
            if (var10 != null) {
               var12 = var3;
               org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), var10,  -7336496637677286409L,  var1);
               break label39;
            }
         } catch (Throwable var7) {
            throw new IllegalStateException("reflection failure");
         }

         var12 = var3;
      }

      ((java.nio.ByteBuffer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(java.nio.ByteBuffer.class, java.lang.Object.class, byte.class, long.class, long.class)), var12,  (byte)0,  -7339889922270398592L,  var1))).toString();
      ((java.nio.ByteBuffer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(java.nio.ByteBuffer.class, java.lang.Object.class, long.class, long.class)), var3,  -7337307785067150649L,  var1))).toString();
      return var3;
   }

   public static ByteBuffer create(int var0) {
      long var1 = f1093 ^ 75211286072297L;
      long var3;
      long var10000 = var3 = ((java.lang.Long)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(long.class, java.lang.Object.class, long.class, long.class, long.class)), ((org.lwjgl.system.MemoryUtil.MemoryAllocator)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "é", java.lang.invoke.MethodType.methodType(org.lwjgl.system.MemoryUtil.MemoryAllocator.class, long.class, long.class)), -4244016178244460741L,  var1))),  var0,  -4244363963886170123L,  var1))).longValue();

      try {
         if (var10000 == 0L) {
            throw new OutOfMemoryError(m153(21345, 8124525670418185538L ^ var1) + var0 + m153(16809, 5373963748483821452L ^ var1));
         }
      } catch (Class316 var5) {
            throw new IllegalStateException("reflection failure");
      }

      return ((java.nio.ByteBuffer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ò", java.lang.invoke.MethodType.methodType(java.nio.ByteBuffer.class, long.class, int.class, long.class, long.class)), var3,  var0,  -4244667840161452370L,  var1)));
   }

   public static ByteBuffer resize(ByteBuffer var0, int var1) {
      long var2 = f1093 ^ 124027318724113L;
      Setting[] var4 = ((org.rusherhack.core.setting.Setting[])(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ò", java.lang.invoke.MethodType.methodType(org.rusherhack.core.setting.Setting[].class, long.class, long.class)), -1666210586101189334L,  var2)));
      int var8 = var1;
      ByteBuffer var9 = var0;
      long var5;
      long var10 = var5 = ((java.lang.Long)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(long.class, java.lang.Object.class, long.class, long.class, long.class, long.class)), ((org.lwjgl.system.MemoryUtil.MemoryAllocator)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "é", java.lang.invoke.MethodType.methodType(org.lwjgl.system.MemoryUtil.MemoryAllocator.class, long.class, long.class)), -1665754138912132413L,  var2))),  ((java.lang.Long)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ò", java.lang.invoke.MethodType.methodType(long.class, java.lang.Object.class, long.class, long.class)), var0,  -1662602963804921156L,  var2))).longValue(),  var1,  -1665482508601107315L,  var2))).longValue();
      if (var4 == null) {
         try {
            if (var10 == 0L) {
               throw new OutOfMemoryError(
                  m153(18215, 3334972748616582399L ^ var2)
                     + ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(int.class, java.lang.Object.class, long.class, long.class)), var9,  -1662915092597088746L,  var2))).intValue()
                     + m153(8185, 1571629949069728803L ^ var2)
                     + var8
                     + m153(29095, 1347285620843246206L ^ var2)
               );
            }
         } catch (Class316 var7) {
            throw new IllegalStateException("reflection failure");
         }

         var10 = var5;
      }

      return ((java.nio.ByteBuffer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ò", java.lang.invoke.MethodType.methodType(java.nio.ByteBuffer.class, long.class, int.class, long.class, long.class)), var10,  var1,  -1661865935602072746L,  var2)));
   }

   static {
    }

   public static ByteBuffer resourceToByteBuffer(ClassLoader var0, String var1) {
      long var2 = f1093 ^ 32909959007981L;
      return ((java.nio.ByteBuffer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ò", java.lang.invoke.MethodType.methodType(java.nio.ByteBuffer.class, java.lang.Object.class, long.class, long.class)), ((java.io.InputStream)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(java.io.InputStream.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var0,  var1,  4822018817835669L,  var2))),  4697938540831040L,  var2)));
   }

   public static ByteBuffer fileToByteBuffer(File var0) {
      long var1 = f1093 ^ 133318142608776L;
      return ((java.nio.ByteBuffer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ò", java.lang.invoke.MethodType.methodType(java.nio.ByteBuffer.class, java.lang.Object.class, long.class, long.class)), ((java.io.InputStream)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ò", java.lang.invoke.MethodType.methodType(java.io.InputStream.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((java.nio.file.Path)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ì", java.lang.invoke.MethodType.methodType(java.nio.file.Path.class, java.lang.Object.class, long.class, long.class)), var0,  -3784606897433862112L,  var1))),  new OpenOption[0],  -3784353773840211246L,  var1))),  -3785886338746291675L,  var1)));
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

   public static String m153(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27443;
      if (f1095[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f1096.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f1096.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/client/api/utils/BufferUtils", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         try {
DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f1094[var5].getBytes("ISO-8859-1");
         f1095[var5] = m117(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f1095[var5];
   }

   public static Object m154(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = m153(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(BufferUtils.class, "m154", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/api/utils/BufferUtils" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1099[var4] != null) {
         return var4;
      } else {
         Object var5 = f1098[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 54;
               case 1 -> 56;
               case 2 -> 37;
               case 3 -> 14;
               case 4 -> 30;
               case 5 -> 36;
               case 6 -> 41;
               case 7 -> 17;
               case 8 -> 59;
               case 9 -> 6;
               case 10 -> 13;
               case 11 -> 53;
               case 12 -> 26;
               case 13 -> 45;
               case 14 -> 62;
               case 15 -> 57;
               case 16 -> 39;
               case 17 -> 19;
               case 18 -> 24;
               case 19 -> 18;
               case 20 -> 7;
               case 21 -> 43;
               case 22 -> 42;
               case 23 -> 60;
               case 24 -> 15;
               case 25 -> 22;
               case 26 -> 3;
               case 27 -> 63;
               case 28 -> 34;
               case 29 -> 46;
               case 30 -> 52;
               case 31 -> 33;
               case 32 -> 25;
               case 33 -> 55;
               case 34 -> 40;
               case 35 -> 21;
               case 36 -> 27;
               case 37 -> 5;
               case 38 -> 38;
               case 39 -> 29;
               case 40 -> 32;
               case 41 -> 44;
               case 42 -> 16;
               case 43 -> 23;
               case 44 -> 48;
               case 45 -> 1;
               case 46 -> 11;
               case 47 -> 58;
               case 48 -> 2;
               case 49 -> 28;
               case 50 -> 51;
               case 51 -> 61;
               case 52 -> 35;
               case 53 -> 10;
               case 54 -> 4;
               case 55 -> 8;
               case 56 -> 49;
               case 57 -> 0;
               case 58 -> 9;
               case 59 -> 47;
               case 60 -> 31;
               case 61 -> 50;
               case 62 -> 20;
               default -> 12;
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

            f1099[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f1098[0] = "\u001c<QU\u000eD\u0019)ZU\u0011J\u0000:S\u0016L~\u0016#Y\t\u001bf\u0007'Z";
      f1098[1] = boolean.class;
      f1099[1] = "java/lang/Boolean";
      f1098[2] = "z6\fmw\u0017\u007f#\u0007mh\u0019f0\u000e.5-p)\u00041b5a-\u0007gV\u0005x+\u0019:Z\fy+\b\"o\u000fg";
      f1098[3] = "VZ\u001c\u0013a0J@\u001eO{$ZCU^\u007f,\\F\u000f\u0013r5P\u0006\u000eIz)J\u00069Hu#\\Z.Iz)J";
      f1098[4] = "6so~\u000bW3<PqUK(Amm@_1";
      f1098[5] = "N\u0013N\u0002T\fM\u001d\u0016!\u0003\u0016A0M\u0005\u001c\u0007V";
      f1098[6] = "\u0007Fg\u0014/r\u0004H?\u0013hp\b\tW\u001cmy\u001e";
      f1098[7] = "\u0000\u0006z\u0000\u0014e\u0003\b\"\u0007Sg\u000fI\\\u0000Nc";
      f1098[8] = "U^z#\u0006\u001a |y-^\u001dg~ul?\u000bk|_2\u0004\u0012a|+";
      f1098[9] = "uY\u0004\u0016>Pp\u00164\u001e|\\";
      f1098[10] = int.class;
      f1099[10] = "java/lang/Integer";
      f1098[11] = byte.class;
      f1099[11] = "java/lang/Byte";
      f1098[12] = "\u0001F0&:B\nI!i@F\u0019H1&vB\u000e";
      f1098[13] = "\tCq\ngW\nM)\b!X\rLb\u0007:\u0017 Jf\u0005'\\\u000fQ";
      f1098[14] = "\u001a\u0016O0Ry\u0019\u0018\u00172\u0014v\u001e\u0019\\=\u000f9\"\u0012X5\u001du\u001c\u0012{(\br3\u001fX?\u0012r\u001c";
      f1098[15] = void.class;
      f1099[15] = "java/lang/Void";
      f1098[16] = long.class;
      f1099[16] = "java/lang/Long";
      f1098[17] = "Q\u0018=\t?!R\u0016e*d)]\u001c9";
      f1098[18] = "#\u007fjo|0?eh3f$/f#\"b,)cyoo5%#x5g)?#Z.|)(Xy(b6";
      f1098[19] = "\u0014m*g\u001c =T6}\u001e|'@&~Um S ;\bk;U,{\u001c \u001cD1a\u0012`(\u001a";
      f1098[20] = "\u0006\u0011~x+(\r\u001eo7F(\r\u0003{Uj%\b\u0015z";
      f1098[21] = "ih\u0004!\u007fKbg\u0015n\u0002Sq`\u001c'";
      f1098[22] = "X&\u0003\u0010#3S)\u0012_B=X\"\u0016\u0005";
      f1098[23] = "a$\u000bDM9q:X.Hoe\u0010\u0018R@H}4\u0007CW\u0002j#\t\u0012\u0016d:&\fD-=okVI\u0016xk1\u0013.\u0016|o4XGLe;1i";
      f1098[24] = "dWySq6>N-V@46Q\u007fV!#.))Rq`8\u0012lV+%_";
      f1098[25] = "\f\u001faP\u0003eV\u00065U2tJ\u001d\u000e\u0001UrQ\u0011q\u0005\u000fkSa5@]b\u0006\boY\tg7";
      f1098[26] = "!5N\u001bo51+\u001dq`c<\u0002H\u0015he)7K\u000b\u000ft)(R\u0015ec:3,Hu6!!@\u0000au?K";
      f1098[27] = "M>\txi\u0014\u0014 \b\"\u0018M\u0011<N:CP\r)Z#DK=5O+RQ\u0019*^<\u0018\u0017\u001b4Zw&\\\r{\\F#R\u0018*\u0002/yKL/3";
      f1098[28] = "UZbt\u0018\u0001ED1\u001e\u001dWQmlr\u0002WO_8\u001e\u0012H\u000eT}\"\u0014Q[A\u0000t\u0001Z\b\u001ff$\u0004_^$";
      f1098[29] = "a'V)\u0019\u0006r|Ukg\na;3<\u001c\u0002q=\u0002<.\u001eW;\u0013<\u000e\u0000\f)U6\u0001\u0014k*\u000f+\u001fe7+\u00198V[|=V>g";
      f1098[30] = "_tUo\fT\u0006jT5}\u0005e>\f!\u0013\u0015\u000eg\u0012/\u0007lUm\u001f?\u0004\u0007\fs\u0011+}";
      f1098[31] = "r<+5\u001d-<y\u007f0l$.}\f:\u0005$%o#ZW.3kvd\u001c8|mG3\u0005<~`,?\u0002rs\u0002";
      f1098[32] = "(B\u0017\u0012W\u0013q\\\u0016H&bV|jgowUb-\u0015\\\u0013sRA]HPm";
      f1098[33] = "khuQEhg~0\u00165e:|\f\u000eM~+X1\u0012Xj2\u0003pU_?+j5\u001aMyW>7\u0019Uyj2s\bO\u0003lo=\u0001\u0004='yr\u00075";
      f1098[34] = "S[\u0015f\u001d=CEF\f\u0018kW\u007f\u001ae\u0019bUNw7\u0003i\\\u0014\u001em\u001a=Y%HcL9U\u001e\rg\u0016|2\u001e\tc\u00137[D\u00107\u0016\u0006";
      f1098[35] = "\u000ej?\u001aZ)\u001etlp_\u007f\n]9\u0014]yo+2A\u0005uTn6\u001b@\u0012Tj2\u001e\u000b{\u000esf\u001b:";
      f1098[36] = "|M% QV4Yf>;@(^y%\\QE]d!\u0007\u0001#\ra$Q:/N}}\u0000\\\u007fKx+;P<W!z]\u00009RwA";
      f1098[37] = "!^MQMCr\u001cPY'XxyB\\G$\"\u001cA\u001c[MgSSZ'";
      f1098[38] = "}\u0017>M(#'\u000ejH\u0019$\"\b)#\"4)\u0007`Jx-}\u0002Q";
      f1098[39] = "\n\u0000rh5fS\u001e||LdV\u000fY{4u@\u000ey}!a:Sav\"tQ\n\u007fx6\rS\f:t&6GZl8L";
      f1098[40] = "tXJ!\u001cmx_\u0004,~|pXX\u001cExr_\u0005u\u001fa&Z4#\u00117\"V\u000ff\u0015mg1";
      f1098[41] = "R\u0017N3\u001cH@\u0007K0 а9\t@;M^Y\u0002U$F%";
      f1098[42] = "mFi%`ZaA'(\u0002Z`Hlu\u0002Xk\u0017er9L=A)\u0018";
      f1098[43] = "4%\u0005\u0019\u0006R|1F\u0007l[d;Y\u001f\u0007>g&]DWX7#X\u0012lTt?\u0001C\n\u0004q:Wx";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f1098[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1099[var4]);
            f1098[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m124(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m125(Class var0, String var1, Class var2) {
      Field var3 = m124(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m125(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m126(long var0, long var2) {
      int var4 = m121(var0, var2);
      Object var5 = f1098[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1099[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f1098[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1098[var4] = var13;
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
               var12 = m123(1586141935720191L, 0L);
            }
         }
      }
   }

   public static Method m127(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m128(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m127(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m128(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m129(long var0, long var2) {
      int var4 = m121(var0, var2);
      Object var5 = f1098[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1099[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m123(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m127(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f1098[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(1586141935720191L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m128(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f1098[var4] = var19;
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
               var23 = m123(1586141935720191L, 0L);
            }
         }
      }
   }

   public static MethodHandle m130(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 235 && var8 != 243 && var8 != 233 && var8 != 211) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 204) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 210) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 235) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 243) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 233) {
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

   public static Object m131(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m130(var0, var1, var2, var3, var6, var9);
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(BufferUtils.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/api/utils/BufferUtils" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
