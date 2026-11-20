package org.rusherhack;
import net.minecraft.client.render.VertexConsumerProvider;

import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectFunction;
import it.unimi.dsi.fastutil.objects.Reference2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSet;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.RenderLayer.MultiPhase;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.util.Identifier;
import org.rusherhack.client.api.accessors.render.IMixinBufferBuilder;
import org.rusherhack.client.api.accessors.render.IMixinMultiBufferSource$BufferSource;

public class Class199 extends Immediate implements AutoCloseable {
   public ReferenceSet<RenderLayer> f3753;
   public Reference2ObjectMap<RenderLayer, ReferenceSet<BufferBuilder>> f3754;
   public static BufferAllocator f3755;
   public boolean f3756;
   public static long f3757 = Class066.m4320(6811827737581258976L, -4131348318763075210L, MethodHandles.lookup().lookupClass()).m4325(213643501397862L);
   public static String[] f3758;
   public static String[] f3759;
   public static Map f3760 = new HashMap(13);
   public static long[] f3761;
   public static Integer[] f3762;
   public static Map f3763;
   public static Object[] f3764 = new Object[98];
   public static String[] f3765 = new String[98];

   public void draw(RenderLayer var1) {
        
    }

   @Override
   public void close() {
      long var1 = f3757 ^ 47979866546552L;
      Class199 var5 = this;
      int var10000 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(int.class, long.class, long.class)), -5629869727489580991L,  var1))).intValue();
      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "E", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, net.minecraft.client.render.RenderLayer.class, long.class, long.class)), this,  null,  -5636824684363306745L,  var1);
      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "E", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, boolean.class, long.class, long.class)), this,  false,  -5637498221943932601L,  var1);
      ObjectIterator var4 = ((it.unimi.dsi.fastutil.objects.ReferenceSet)(((org.rusherhack.Class199)(this)).f3753)).iterator();
      int var3 = var10000;

      label27:
      while (((java.util.Iterator)(var4)).hasNext()) {
         Object var8 = ((java.util.Iterator)(var4)).next();

         while (true) {
            RenderLayer var6 = (RenderLayer)var8;
            Iterator var7;
            var8 = var7 = ((java.util.Set)(((org.rusherhack.Class199)(var5)).m7815(((net.minecraft.client.render.RenderLayer)( var6))))).iterator();

            do {
               if (!((java.util.Iterator)(var8)).hasNext()) {
                  continue label27;
               }

               BufferBuilder var9 = (BufferBuilder)((java.util.Iterator)(var7)).next();
               ((net.minecraft.client.render.BuiltBuffer)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "I", java.lang.invoke.MethodType.methodType(net.minecraft.client.render.BuiltBuffer.class, java.lang.Object.class, long.class, long.class)), var9,  -5638048660345045964L,  var1))).toString();
               org.rusherhack.Class272.m9556(((net.minecraft.client.util.BufferAllocator)(((net.minecraft.client.util.BufferAllocator)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "I", java.lang.invoke.MethodType.methodType(net.minecraft.client.util.BufferAllocator.class, java.lang.Object.class, long.class, long.class)), (IMixinBufferBuilder)var9,  -5630458206431484657L,  var1))))));
               var8 = var7;
            } while (var3 != 0 || var3 != 0);
         }
      }

      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "I", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Class199)(var5)).f3753,  -5638438138002256541L,  var1);
      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "I", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Class199)(var5)).f3754,  -5631323095850901234L,  var1);
   }

   public int m7811(RenderLayer var1) {
        return 0;
    }

   static {
    }

   public boolean m7812() {
      long var1 = f3757 ^ 25647170327958L;
      int var3 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(int.class, long.class, long.class)), 4985647240172197039L,  var1))).intValue();
      boolean var10000 = ((java.util.Collection)(((org.rusherhack.Class199)(this)).f3753)).isEmpty();
      if (var3 == 0) {
         if (!var10000) {
            boolean var10002 = true;
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   public Class199(BufferAllocator var1) {
        super(var1, Object2ObjectSortedMaps.emptyMap());
      long var2 = f3757 ^ 95635950037740L;

      this.f3754 = new Reference2ObjectLinkedOpenHashMap();
      this.f3753 = new ReferenceLinkedOpenHashSet();
      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "E", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, boolean.class, long.class, long.class)), this,  false,  4204084300734280403L,  var2);
   }

   public void draw() {
        
    }

   public void drawCurrentLayer() {
        
    }

   public Set<BufferBuilder> m7815(RenderLayer var1) {
      long var2 = f3757 ^ 107804451799761L;
      int var4 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(int.class, long.class, long.class)), 5942472085932262376L,  var2))).intValue();
      Reference2ObjectMap var7 = ((org.rusherhack.Class199)(this)).f3754;
      RenderLayer var10001 = var1;
      if (var4 == 0) {
         if (!((it.unimi.dsi.fastutil.objects.Reference2ObjectMap)(var7)).containsKey( var1)) {
            return ((java.util.Set)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(java.util.Set.class, long.class, long.class)), 5941266088441660543L,  var2)));
         }

         var7 = ((org.rusherhack.Class199)(this)).f3754;
         var10001 = var1;
      }

      return (Set<BufferBuilder>)((it.unimi.dsi.fastutil.objects.Reference2ObjectFunction)(var7)).get( var10001);
   }

   public VertexConsumer getBuffer(RenderLayer var1) {
        return null;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19806;
      if (f3759[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f3760.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f3760.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/ƞ", var10);
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
         byte[] var9 = f3758[var5].getBytes("ISO-8859-1");
         f3759[var5] = m117(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f3759[var5];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class199.class, "m154", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ƞ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m2808(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22133;
      if (f3762[var3] == null) {
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
         long var5 = f3761[var3];
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
         Object[] var9 = (Object[])f3763.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f3763.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ƞ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f3762[var3] = var15;
      }

      return f3762[var3];
   }

   public static int m2809(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m2808(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class199.class, "m2809", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ƞ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3765[var4] != null) {
         return var4;
      } else {
         Object var5 = f3764[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 6;
               case 1 -> 51;
               case 2 -> 34;
               case 3 -> 52;
               case 4 -> 42;
               case 5 -> 12;
               case 6 -> 28;
               case 7 -> 59;
               case 8 -> 44;
               case 9 -> 50;
               case 10 -> 63;
               case 11 -> 54;
               case 12 -> 4;
               case 13 -> 15;
               case 14 -> 61;
               case 15 -> 33;
               case 16 -> 62;
               case 17 -> 47;
               case 18 -> 35;
               case 19 -> 3;
               case 20 -> 46;
               case 21 -> 8;
               case 22 -> 24;
               case 23 -> 27;
               case 24 -> 55;
               case 25 -> 31;
               case 26 -> 60;
               case 27 -> 11;
               case 28 -> 5;
               case 29 -> 43;
               case 30 -> 41;
               case 31 -> 53;
               case 32 -> 48;
               case 33 -> 16;
               case 34 -> 20;
               case 35 -> 57;
               case 36 -> 49;
               case 37 -> 21;
               case 38 -> 18;
               case 39 -> 14;
               case 40 -> 32;
               case 41 -> 45;
               case 42 -> 13;
               case 43 -> 39;
               case 44 -> 29;
               case 45 -> 40;
               case 46 -> 56;
               case 47 -> 23;
               case 48 -> 7;
               case 49 -> 0;
               case 50 -> 10;
               case 51 -> 58;
               case 52 -> 17;
               case 53 -> 25;
               case 54 -> 9;
               case 55 -> 2;
               case 56 -> 38;
               case 57 -> 37;
               case 58 -> 1;
               case 59 -> 30;
               case 60 -> 22;
               case 61 -> 26;
               case 62 -> 36;
               default -> 19;
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

            f3765[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f3764[0] = "4\u0003^VtC*\u000bD\u0019\tS/\u0017MY9S:/IG";
      f3764[1] = "*m\u001a\u001aK\u0014!b\u000bU*\u001a*i\u000f\u000f";
      f3764[2] = "Ru\u0013gF8No\u0011;\\,^lZǗ";
      f3764[3] = "(|\u00025<?4f\u0000i&+$eKȝ";
      f3764[4] = int.class;
      f3765[4] = "java/lang/Integer";
      f3764[5] = "/\u0005PEa\u001a/\u0005G\u0019m\u00155NG\u0007m\u00002?\u0015R>B";
      f3764[6] = "=\u0019fF\u001bZ!\u0003d\u001a\u0001N1\u0000/Ȝ";
      f3764[7] = ";pA\u0003-\u0017;pV_!\u0018!;VA!\r&J\u0007\u0015w";
      f3764[8] = "Ol\u0001T-mOl\u0016\b!bU'\u0016\u0016!wRVLBp5";
      f3764[9] = "k]hx\u0019Uk]\u007f$\u0015Zq\u0016\u007f:\u0015Ovg%aM\u0005";
      f3764[10] = "-9\u0011W!E-9\u0006\u000b-J7r\u0006\u0015-_0\u0003]Ky\u001d";
      f3764[11] = "G2)[9\"G2>\u00075-]y>\u001958Z\bdMdz\r41\u0014'8vneEf";
      f3764[12] = void.class;
      f3765[12] = "java/lang/Void";
      f3764[13] = boolean.class;
      f3765[13] = "java/lang/Boolean";
      f3764[14] = "xdot\u000f qjl=L-wjx?Q+5x{)\u0016*vx,\b\u0007!\u007fnp\t\u001b<ono";
      f3764[15] = "\u0013:&\u001dfp\u001857R\u0001r\r>7\u0019:";
      f3764[16] = "\u007f DJP-a(^\u00057,p3S_\u0011*";
      f3764[17] = "*\u001fb4m.4\u0017x{\u0010>4";
      f3764[18] = "\u0005T\u0016N#l\u0001I\u0016_>lBFYH9p\u0018IT\u0015\"g\u0006E[O>+>E^^?`\u0002C]\t\u0002g\u0006E[O\u0000d\u001c";
      f3764[19] = "(\u0002x\u001a\r>,\u001fx\u000b\u0010>o\u00107\u001c\u0017\"5\u001f:A\f5+\u00135\u001b\u0010y\u0013\u00130\n\u00112/\u00153<\u0006#";
      f3764[20] = "}d,\u007f\u0018Fa~.#\u0002Rq}eɷ";
      f3764[21] = "}\u007fF%U\u0000aeDyO\u0014qf\u000fhK\u001cwcU%F\u0005{#@hD\u0010a~NyT[`hOoB\u0007<Dlb_\u001c|OTmA\u0010`OTbK\u0011w\u007f";
      f3764[22] = "\u001a\u0005PnLC\u001e\u0018P\u007fQC]\u0017\u001fhV_\u0007\u0018\u00125MH\u0019\u0014\u001doQ\u0004<\u0013\u0014~A^:\u0005\u001biC^\u001c\u0003";
      f3764[23] = "Eo`9\u001b\u001b[gzvt\u001c]oo+";
      f3764[24] = "B\u0005C\u0011T87%H\u001eEwV+C\u0015A-\"";
      f3764[25] = "$\u001d0\u0010hV:\u0015*_\u0005L#\f'\u0003'W!\u000e";
      f3764[26] = "\u0015I2<M^\tS0`WJ\u0019P{qSB\u001fU!<^[\u0013\u00154q\\N\tH:`L\u0005\b^;vZYTr\u0018{GB\u0014v ~KB8N3tZY)T `\\N^y tYN\bh:gMH\u001f";
      f3764[27] = "\u0017Vr\u0014#\u0016\u0017VeH/\u0019\r\u001deV/\f\nl4\u0003}";
      f3764[28] = "/\u001cL=a|/\u001c[ams5W[\u007fmf2&\n*?1\"\u0015Y`\u007fJtL\u0001%";
      f3764[29] = "2Q\u001e78\u00076L\u001e&%\u0007uCQ1\"\u001b/L\\l9\f1@S6%@\t@V'$\u000b5FUp\u0019\f1@S6\u0010\u001b5FD+9\u0000";
      f3764[30] = "<b&\u0001\n8<b1]\u00067&)1C\u0006\"!Xc\u0016U`vd>N\u0014\"\r3d\u0017_";
      f3764[31] = "\bPr/\u001d,\bPes\u0011#\u0012\u001bem\u00116\u0015j27F}BVj`\u000369\u0000?2I";
      f3764[32] = "cZ\u001a=1FhU\u000brL^{R\u0002;";
      f3764[33] = "s]6WvqmU,\u0018\u0017tmU/X9h";
      f3764[34] = "l7-\u001a<!l7:F0.v|:X0;q\rh\rcy&15U\";]fo\ff";
      f3764[35] = "h_Z0VGtEXlLSdF\u0013}K@b\u0003^qI_fCY0E@`XP{JF)~IlM\\`n\\nPGuH";
      f3764[36] = "A#u\u0002\n\u001e]9w^\u0010\nM:<Ȓ";
      f3764[37] = "8{ ) $8{7u,+\"07k,>%Af>{}";
      f3764[38] = "#)H\u007f:6=!R0W,%$[}`*&&M";
      f3764[39] = "\t\u0007WbOY[\u0012O~\"\nQ\u0012Ktu^\bN\u0012#\"\u0001\r\u0018\u0011gZ\u001dK\r";
      f3764[40] = "\u001de\u0006\u0004'bOp\u001e\u0018Jά$&\u000e\u00028&[t\u0004\f(_\u001eg\u0002\u00114dF\u007f\u000e\u0017J";
      f3764[41] = "p\u001cH9YOu]Oz>\u0016gIJ(B\u0010a$Z.R\u001arIP#A\u0014\u001b";
      f3764[42] = "\u0011)XxN\t\roMF^\u001c\b\u0014\u0006*K\u001a\u001emAz\u0001\u001dt-S<Z\u001b\rj\u0003v]q";
      f3764[43] = "\u0010\u0013FGM\nB\u0006^[ YH\u0006ZQw\n\u0013R\u0003\r \fY\u0017LD_^S\u0019\\";
      f3764[44] = "\n\u001f}\b\u000e/\u001f[s\u0015c$\u0002\u0002l\u000b\u0003@U\u001e\u007f\u0018\u001d{\r\u0006s\u001ec";
      f3764[45] = "?\u0012eJW\u001b:\r6\u0013,\u001b7\b(tC\u0006iLl\u0006M^0\bT\u0014A\u0007;\t)L]\\!rd\u0016W\u0005<\u0010e\u001aO\u0019P";
      f3764[46] = "y]T$)_d@\u001a/\u0016Q~TN.A\u0005&\u0005\u0012s\u0016\\`^\u0014:*\u0000m\u0007V";
      f3764[47] = "=\f\u0015\rk\u0019c\tB\u0013TBm\bD\u000f8p>L\u0014Qe'>\u001f\u001f\u0015h^~\u0005_\u0006T\u0018;\u0011E\u00121\u001do\u0013\u0019hk[j\u0005C\n)\u0018>\u0017$";
      f3764[48] = "E;|?\u000f~\u00171r/vd\u00137`*\u001aV@s0|J\u0001Orf*Ly\u0011 {#v";
      f3764[49] = "t\u00177d\tJj\u001cj?lYd\u001a*6\u0010_bw>5\u001d@ Mn3\u0000A\u0018";
      f3764[50] = ">\u000bdR\fUl\u001e|NaȮ\u0007B%N\u0006R\u007f\u001cwS\u000f";
      f3764[51] = "tPU5,\u0001j[\bnI\u0012c}Wv5\u0002\u0018\u0001\u000bh.I`_Yu's";
      f3764[52] = "ERQ\u0015:m\fTM\u000eC([`C\u0011\"2S;Z\u0010=+QTOT36<";
      f3764[53] = "'<\u0000VQ\u0010;z\u0015hM\u00053Z\n\u0014.\u0003zy\u001f\u000f\u0016\u0006;~\\h";
      f3764[54] = "$M)\u0018\u0012z8\u000b<&\u0002o=74j\u0000l(\r*Zm;-\n%L\u0014|}@\"&Tn;\u001b$_\u0013>q\u001cN\u001f\u0001x*\u001a7XQ2-p";
      f3764[55] = "j=\"-M\u001587,=4\u000f<1>8X=kvfd\u000fj3.<gT\u001706fn4";
      f3764[56] = "\u0018vJl]HJcRp0Σ!bRq\u000b\u0010S|Y,P";
      f3764[57] = "Z\nWYfcWYC\n\u0016ӑ7\rA\fkdNM[LxX\u0007QQRz:\u0006]IN\u0016";
      f3764[58] = "f7hW\u001fxegc\u0015c&6v3M\u000f\u0014e2l\u001b_CfrbO\\}8w5Qc";
      f3764[59] = "uI\u0016&C@hQ\u001ac/\u0019|R\u0007yC++\u0015Z \u0013|w\u0014V'\u0013\u0002 D\u001aw/";
      f3764[60] = "Et\u0003KS\u000b[\u007f^\u00106\u0012My\r\n6IKo\u0001\u001cTHGw\u001dp";
      f3764[61] = "kiF9I 9|^%$ҕR*N?Vd-xD1F\u001d9)F;C%<hAx$";
      f3764[62] = "?\u0004yO\u0000\n;ScVz_3\u0005~^\u001bR/ oFz\r8\u0019i]\u0003JhSn7K\r2\u00048O\u0015_/\r\u0002";
      f3764[63] = "n\u001f=z\u0002\u001dd\u0012.tk\u0010m\u000b\u0017z\u001b\f\u0004Ahq\fJ|\u001f:l\u0005p";
      f3764[64] = ";]\t6R\u007f%VTm7v6O\u0003\r\rw+R\u00106Uo'Tn";
      f3764[65] = "J7\u0003\u001dVV\u000fwJ\u00124ɩ2bH\u0002K\u0007]w\f\fVjW|M\u0003Y\u0005B8C\u001e4";
      f3764[66] = "g^}%W\u0017wF{5)\u0003i@g0S\u0005\u000e\u001fe%F\u00165G})@h4_c6WSlGo0)RtYp'\u0012\nlUvY";
      f3764[67] = "\u0013/v\u0012}#\u0019\"e\u001c\u0014(\u00140f\u007f-\"\u0003+p\u0006jrI,\u001a";
      f3764[68] = "\\ce\n0S@%p4$L_\"kU)Pz3s4vGC5hM1\u0017\t2\u0002\u0005vM^dz[$PW^";
      f3764[69] = "ctv5=\\2v-qW՛Y*318Ebr+=>;";
      f3764[70] = "r\n\u0001a\b:#\bZ%bȄHTDe\r#s\f\\i\u000b]";
      f3764[71] = "\u0017\u0014X5\n'K\u001a_+:%\u001b\u0002a+S$\u001b\u0012p6T0\u001b\u0004:uQe\u000bBC5K%\u0018~\n)A;\u001a\u001c\u000b%Y'v";
      f3764[72] = "TN5\u0014G\u0012\u0006[-\b*\u009dm]*\u0015RUSY}\u000fK";
      f3764[73] = ";!W%1_i4O9\\\u000b\u0002eW&dX:?\u00121#b>!VgfZddA \\";
      f3764[74] = "}}~F+\u001d*-2\u0016\u0017\u0004a\n+\u0004zc\"+5\u0014}\u001ae{\u007f\u0013\u0017Zw=$\u0015n\u001d'w#\u007f";
      f3764[75] = "$f^m\u0001{1\"Pplo<w[n\u0016u'r (\u0016h.c\u001bp\u000ed(\u001dEi\u0012k,rP-\u001cvA";
      f3764[76] = "D\tqz\u001ci\u0016\u001cifq?\u0019\u0016rmqd\u001f\nll\u0013e\u0013\u0012p\u0000";
      f3764[77] = "-pGnkO)']w\u0011\u001e+k</}\u000b-}Eh-A*\u0017\u0005zk\u001a,nB*!\u001dF";
      f3764[78] = "<^\b\t\u0018;-^S\u001cyo?\u0012x\u0010\u0017n?\u00142S\u0012;/RK\u0013\b{<n";
      f3764[79] = "'.>\u0019\u00160#y$\u0000le+,=\u001c\u0010c\r'\f\u000b\u0017c*5EX\u0000t'#<\u001fP> I&\u000f\u0014|%x>X\u000bvLp)\u001b\u0007d57yQ\u0000\u000e";
      f3764[80] = "!_~\u0015rX,\u001b}U\u0011\u001bFC`\u0017nZ)V$\u0019s7#]e\u0016|X6\u0019k\u000b\u0011";
      f3764[81] = "vI\"pOl$\\:l\"4\"M:mN\u0006u\u000bk;\u001eQtA&x[.&K(h\"a-J?f@`!R#\n";
      f3764[82] = "\u0017W`\u0010|PE]n\u0000\u0005JA[|\u0005ix\u0010\u001c'Y?/\u001d\u001ez\u0005?WCLg\f\u0005";
      f3764[83] = "*\u000fWt\bFv\u0002\u000e6z\u0014(\u001dT&-@pL\btz\u001e.\u0001\b&F\u00036\rM";
      f3764[84] = "R\n\u0000.y4GN\u000e3\u0014 K\u0018\u0004-o\u0004V\r\u001eQq I\u000e\u0013>ddG\u0013~`-=PK\u0006>\u007f Yq";
      f3764[85] = "h\u000e]X\u007f$:\u0004SH\u0006>>\u0002AMj\fiE\u0019\u0011?[2\u0006AGwc5@_C\u0006";
      f3764[86] = "xiKA\u00168fb\u0016\u001as#xe,C\u001f0\u007fcU\u0004Ozx\t\u001dC\u0015-.qC\u0011\b$\u0014";
      f3764[87] = ":;\\`|\t-\u007fB#\u001a\u001a&8A-A\u001a?@Vdb\u000f$xS%eLC";
      f3764[88] = "Y\r\tS\u0011X\u000b\u0018\u0011O|\u0000\r\t\u0011N\u00102[JH\u0011@eP\u0017\nL\u0010\u0007Q\u001b\u0012P|";
      f3764[89] = "\u0015eSM=$\u00112ITG`\u0013gOK*\u001aGnR^-c\u0000>\u0018YG#\u0012xC_>dB2D5";
      f3764[90] = "qrI\u000b\u0006\"u%S\u0012|w~x[\t|,xnW\u001f\u001e-tvKs";
      f3764[91] = "\u0007T^\u001e\u000ba\n\u0007JM{ьjSHK\u0006f\u0013\u0013R\u000b\u0015Z";
      f3764[92] = "Zhga4a\b}\u007f}Y2\u0002}{w\u000eaY)\"%Yb\b+b' \"\u0012kq";
      f3764[93] = "^f3\u0011qV\u000e`.\u0010I\n]|>ip\u0000Jg(\u00107P\u0000`B";
      f3764[94] = "O\u0010_~_:\u001d\u001aQn& \u0019\u001cCkJ\u0012JX\u0013=\u001bEI\u0018\u0012i\u0019{\u0017\u001dEw&u\u0016\u001bF`Dt\u001a\u0003Z\f";
      f3764[95] = "\tE\u001ag\u0011>[P\u0002{|Ơ0\u0006\u0012a\u000ezOT\u0018o\u001e\u0003\r\u0000Y`\u00008\u000ePR\"|3RF\u0007q\u001e2^^\u001b\u001d";
      f3764[96] = "2aD\u001fYJf`\u0010\u001a2\u00186q%\u0012H\u000b6} \u0018H\u000b:k\u0014\u007f\rL>l\u0001\u001a\b\u0018<0{";
      f3764[97] = "aa}\u0001\u0002d\u007fj Zgl`d}D\n\u00164m`Q\ros=*Vg'4g}\u0000\u001fyfzt:";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f3764[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3765[var4]);
            f3764[var4] = var5;
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
      Object var5 = f3764[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3765[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f3764[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3764[var4] = var13;
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
               var12 = m123(140377049533741L, 0L);
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
      Object var5 = f3764[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3765[var4];
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
               f3764[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(140377049533741L, 0L);
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
                     f3764[var4] = var19;
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
               var23 = m123(140377049533741L, 0L);
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
         if (var8 != 'L' && var8 != 'E' && var8 != 'T' && var8 != 229) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'I') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 170) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'L') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'E') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'T') {
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

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class199.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ƞ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
