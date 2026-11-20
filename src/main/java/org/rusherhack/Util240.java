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
import net.minecraft.client.world.ClientWorld;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.baritone;
import org.rusherhack.client.api.feature.module.impl.movement.Acceleration;
import org.rusherhack.client.api.feature.module.impl.movement.ElytraFly;
public class Util240 implements Globals {
   public boolean f4282;
   public float f4283;
   public static Util240 f4284;
   public float f4285;
   public boolean f4286;
   public static long f4287 = Class066.m4320(-8813317511230188417L, -3904131468480240408L, MethodHandles.lookup().lookupClass()).m4325(66583706477827L);
   public static String f4288;
   public static long[] f4289;
   public static Integer[] f4290;
   public static Map f4291;
   public static long[] f4292;
   public static Long[] f4293;
   public static Map f4294;
   public static Object[] f4295 = new Object[130];
   public static String[] f4296 = new String[130];

   @Subscribe
   public void m8809(Class206 var1) {
        
    }

   public static void m8810() {
        
    }

   public Util240() {
        super();
      long var1 = f4287 ^ 86328183233471L;

      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, boolean.class, long.class, long.class)), this,  false,  -792831784617952570L,  var1);
      org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, boolean.class, long.class, long.class)), this,  false,  -796518997632239018L,  var1);
   }

   static {
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
        
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

   public static int m118(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3330;
      if (f4290[var3] == null) {
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
         long var5 = f4289[var3];
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
         Object[] var9 = (Object[])f4291.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f4291.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ǭ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f4290[var3] = var15;
      }

      return f4290[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Util240.class, "m119", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ǭ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static long m2476(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3785;
      if (f4293[var3] == null) {
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
         long var5 = f4292[var3];
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
         Object[] var9 = (Object[])f4294.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f4294.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ǭ", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         f4293[var3] = var15;
      }

      return f4293[var3];
   }

   public static long m2477(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = m2476(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Util240.class, "m2477", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ǭ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f4296[var4] != null) {
         return var4;
      } else {
         Object var5 = f4295[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 41;
               case 1 -> 36;
               case 2 -> 43;
               case 3 -> 24;
               case 4 -> 4;
               case 5 -> 31;
               case 6 -> 22;
               case 7 -> 53;
               case 8 -> 2;
               case 9 -> 21;
               case 10 -> 63;
               case 11 -> 19;
               case 12 -> 44;
               case 13 -> 37;
               case 14 -> 30;
               case 15 -> 11;
               case 16 -> 46;
               case 17 -> 12;
               case 18 -> 62;
               case 19 -> 25;
               case 20 -> 49;
               case 21 -> 27;
               case 22 -> 38;
               case 23 -> 39;
               case 24 -> 3;
               case 25 -> 32;
               case 26 -> 23;
               case 27 -> 59;
               case 28 -> 0;
               case 29 -> 13;
               case 30 -> 51;
               case 31 -> 57;
               case 32 -> 35;
               case 33 -> 58;
               case 34 -> 18;
               case 35 -> 52;
               case 36 -> 5;
               case 37 -> 54;
               case 38 -> 34;
               case 39 -> 7;
               case 40 -> 26;
               case 41 -> 55;
               case 42 -> 47;
               case 43 -> 42;
               case 44 -> 45;
               case 45 -> 17;
               case 46 -> 40;
               case 47 -> 56;
               case 48 -> 20;
               case 49 -> 60;
               case 50 -> 16;
               case 51 -> 48;
               case 52 -> 9;
               case 53 -> 1;
               case 54 -> 14;
               case 55 -> 29;
               case 56 -> 33;
               case 57 -> 15;
               case 58 -> 6;
               case 59 -> 50;
               case 60 -> 28;
               case 61 -> 10;
               case 62 -> 8;
               default -> 61;
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

            f4296[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f4295[0] = "\u001cZ|6\u0012X\u0010^ >\u0016^PK|0\u0005R\rH \u0016%B\rOa2!X\u001fW^-\tT\u001bH}";
      f4295[1] = "\u0015,Nb\u0011\n\u0019(\u0012j\u0015\fY=]\u007f\r\f\u0019*\u0012l\n\u0004\u001b>\u0012L\n\u0004\u001b";
      f4295[2] = void.class;
      f4296[2] = "java/lang/Void";
      f4295[3] = "S{\u001dcy$_\u007fAk}\"\u001fX\u000exd?^t\nK]\u0002";
      f4295[4] = "(\f\u000ea-\u001a$\bRi)\u001cd$>i+\u001c>\u0002\u0012m\t\u0007%\u001b\u0015l<\u0007";
      f4295[5] = "\u007f\u0001L]L^s\u0005\u0010UHX3)|UJXi\u000fPQ";
      f4295[6] = "[(#\u0019o2G2!Eu&W1jԣ";
      f4295[7] = boolean.class;
      f4296[7] = "java/lang/Boolean";
      f4295[8] = "\u0017\u007f\u0001kXI\u000be\u00037B]\u001bfHƩ";
      f4295[9] = "\u0003#*-fQ\u001f9(q|E\u000f:cɷ";
      f4295[10] = "\rB]\u000b]\u0015\rBJWQ\u001a\u0017\tJIQ\u000f\u0010x\u001e\u0011\u0006";
      f4295[11] = "T\u001c|mtWH\u0006~1nCX\u00055Ʌ";
      f4295[12] = int.class;
      f4296[12] = "java/lang/Integer";
      f4295[13] = long.class;
      f4296[13] = "java/lang/Long";
      f4295[14] = ".?$c\u0012?%05,z?+?&";
      f4295[15] = float.class;
      f4296[15] = "java/lang/Float";
      f4295[16] = "*tZj4U6nX6.A&m\u0013ǣ";
      f4295[17] = "\u0017\u0018N\u001f\u0005X\u000b\u0002LC\u001fL\u001b\u0001\u0007R\u001bD\u001d\u0004]\u001f\u0016]\u0011Dn]\u0018O\u0019\u0006Z";
      f4295[18] = "OR\u0012_IsOR\u0005\u0003E|U\u0019\u0005\u001dEiRhU@\u0014";
      f4295[19] = "z\u001aVSHsf\u0000T\u000fRgv\u0003\u001f\u001eUtpFB\u0018Nr|\u0006VSica\u001cX\u0013]";
      f4295[20] = ".\u0016\u001bL\u0005\b%\u0019\n\u0003d\u0006.\u0012\u000eY";
      f4295[21] = "\bU/f\u0014\u0005\u0014O-:\u000e\u0011\u0004Lf+\t\u0002\u0002\t;-\u0012\u0004\u000eI/f(\u0005\nE-:5\u0015\u0013S!&\u0001";
      f4295[22] = "k.Lww\u0005`!]8\n\u0010r;_{";
      f4295[23] = "R\u0006[_\u001a`Y\tJ\u0010pcM\u0005A[";
      f4295[24] = double.class;
      f4296[24] = "java/lang/Double";
      f4295[25] = "X\u0003!N/oS\f0\u0001LbF\n";
      f4295[26] = "'|\nL5P'|\u001d\u00109_=7\u001d\u000e9J:FLQ`";
      f4295[27] = "$/\ri!i85\u000f5;}(6D$<n.s\u0019\"'h\"3\ri\u0016r>09\"'h\"3\r";
      f4295[28] = "\u0004qC0qp\u0018kAlkd\bh\nΤ";
      f4295[29] = "\u000bO'^bN\u000bO0\u0002nA\u0011\u00040\u001cnT\u0016ueC7";
      f4295[30] = "$\u0012C$5\u001c$\u0012Tx9\u0013>YTf9\u00069(\u00043mL";
      f4295[31] = "8x~v\b\u00038xi*\u0004\f\"3i4\u0004\u0019%B9aS_";
      f4295[32] = "\rYj56v\u0001]6=2pAZ}4#o\u0006Wjr\u000bI\u000eLp5,~-]p=4p\u0000J";
      f4295[33] = "a\u0010=\u0017oOa\u0010*Kc@{[*UcU|*{\n;\u0002l\u0019(Jqy=Ay";
      f4295[34] = "\u0015x\u0012G\u00198\u0015x\u0005\u001b\u00157\u000f3\u0005\u0005\u0015\"\bBT]G";
      f4295[35] = "w\u001f\u001et\\9k\u0005\u001c(F-{\u0006W9A>}C\n?Z8q\u0003\u001etl#w\u0001\u001c;@\u001f}\u0019\r3@+";
      f4295[36] = "}'U\")yv(DmN{c#D&u";
      f4295[37] = "WO#\t$wWO4U(xM\u00044K(mJud\u001e|'\u001dI;F:mf\u0019n\u0011y";
      f4295[38] = "},Z\u000f\u000b_q(\u0006\u0007\u000fY1=I\u0012\u0017Yq*\u0006\u0001\u0010Qs>\u0006!\u0010Qs\u0015r";
      f4295[39] = "; +\u001c^\u0018; <@R\u0017!k<^R\u0002&\u001al\u000b\u0006Hq&3S@\u0002\nwk\u0000";
      f4295[40] = "V\u00021\u001abZJ\u00183FxNZ\u001bxW|F\\\u001e\"\u001aq_P^#@yCJ^\u0006XqV\\\u0002\u0003@yCJ";
      f4295[41] = "}\u0013F!\u0002#}\u0013Q}\u000e,gXQc\u000e9`)\u00007[r7\u0015^n\u001c9LD\n;V";
      f4295[42] = "\r\u000eNiH\u0003\u0011\u0014L5R\u0017\u0001\u0017\u0007$V\u001f\u0007\u0012]i[\u0006\u000bRO\"[\u0002\u0017\u000eLiW\u0019\u0006\tE\"\u0014\"\r\u001bN+_\u0017\u0000\u0010L\nU\u0012\u0017\u0010L";
      f4295[43] = "\"8_m\u0007#\"8H1\u000b,8sH/\u000b9?\u0002\u001dp^";
      f4295[44] = "N0b\u007f.\tN0u#\"\u0006T{u=\"\u0013S\n$dzV";
      f4295[45] = "IIyT\u0001aUS{\b\u001buEP0ъ";
      f4295[46] = "HM\u0002:\u0016`CB\u0013ukxPE\u001a<";
      f4295[47] = "zD;07RqK*\u007f[Q\u007fI(0w";
      f4295[48] = "N\u0019^\\v^R\u0003\\\u0000lJB\u0000\u0017\u0011hBD\u0005M\\e[HEL\u0006mGREz\u001ae_t\u001fP\u001ew";
      f4295[49] = "ik";
      f4295[50] = "1\u0016f\u0017F[-\fdK\\O=\u000f/ZXG;\nu\u0017U^7JdOQ@*\u0017/IXO'\u0001s\u0017qX;\nuiXO'\u0001slDJ?\u0010d";
      f4295[51] = "\u001f:Lon=\r.M*\u00126\u00166@1\u007f\u0004\u0018/W8\u00125\b+E?\u007f'@2IU";
      f4295[52] = "!Cr;6\u001e.\\q`PN+ZKd)G.K&va^\"!$r0H+L6:)DA";
      f4295[53] = "=V\nGq\u0004s\u0005P\u0011\t\u0000oF[\u001ce2?\n\u0001J\t\u0004dJGE5\u001b8\u0006\u0002{";
      f4295[54] = "\n/0\u0015$\"U;0\u000eDӐ6$+\u0011;.\u0007tn\n<";
      f4295[55] = ";Wnx\u0016\u00064Hm#pV1NWx\u001dTcEh4\u0000Z45g%\u001b\u0007+\n+8\u0015P[";
      f4295[56] = "u_zm)\u0005=\u001euz[\u0001\"[In<\u0010.K|n[U%W/m'\u001c3\u001fq\u0014";
      f4295[57] = "@\\\u00029Y\u0001\u001fH\u0002\"9ȯ|\u0007Y5\u0000[\u0015\r\u0018._";
      f4295[58] = "\fZ3pVcB\ti&.g^Jb+BU\b\b>q\u0013\u0002ZG2r_yCPe/.";
      f4295[59] = "nMOkKD5IN:$XuU\u001ec_5a\u0018HfEGfT\nz$\blA\u0014?O\u0005|U\u0011\u0007";
      f4295[60] = "\u001eQ~\u001e\u0012\u0014\u0003_%\u0004\u007f\u0011\u0010M%\u0006\u0013#D\u000ez]Et\u001eM5_\u0013\u001d\u0016Z\"\u000f\u007f\u0010\u0003\u000f%]\u000f\u0015\u0006H7a";
      f4295[61] = "L?Eto5\u001a%L7V'\u001a2mb*(\u0016(ZA;(\u001e0Tl,H\u00126\u0005r=/\u0011+\f2V";
      f4295[62] = "\u001d(Rj\u001cX\u000ev\u0014tgL\u0010v\u0002q9K\u0010l\u0006\r\u000eSD/\u001av\u0017D\u0013rk";
      f4295[63] = "\u0006\u001b\u0016%!o\u0004\bHe\u0010s\u0001\u001aMqG$[L\u0013\u001dvq_O\u0018otb\u0001\u000f";
      f4295[64] = "\"!y&\u0011\u0010:,l).J)\"e,Bx}f>r.@=>j!CRu'fKAV$1o&S\u001e==\u0005$WO+4h6\u001fV'^c4RB{a{9GMD";
      f4295[65] = "Cp{\u007f\\BCm?ebW_w\u0019a\u001eGR\u000b(qR\u0012Cp1f\u0005O22?~\u000eFT6=>\u001c,";
      f4295[66] = "\u0018C\u001f\u001b2\u0003\u0000N\n\u0014\rR\u001fQ\u0007\u001aZ\u0005E\u0001[vbE\u001eS\t\u001bp\r\u0007_";
      f4295[67] = "%\u0017\b\f\u0010@c\u0014\u000e\u000erP\u0018[D\u001c\u0011Cf\u000f\u001f\u0011\u001b9&U\b\u0003\bGr\u000e\u0005\tr";
      f4295[68] = "6xv\u00125Yilv\tUƸ\nul^hPk\"p\n>";
      f4295[69] = "^\u0012_ji~\u0018\u0011Yh\u000bĕc]Coh?\bPS{m";
      f4295[70] = "\u0018E\u001cM?1\u001d@[_\u0003$\u0011GBJo\u0016E\u0004\u001d\u001d8A\u001aW\u001d\u001523\u0018DCU\u0003";
      f4295[71] = "\u0003\u0018!Dv\\YP#NMY\t\r8M\u001a\u000eVPc!.WS\u001f1A3Y\b\u0005";
      f4295[72] = "(>y/5>w*y4Uգ\u0014:%#n6-llc'";
      f4295[73] = "\u0019\u0013& u\u0015\u0006OjeKG\u0019\u001820\u001c\u0010COo\\$P\u0018\u001a<16\u0018\u0001\u0016";
      f4295[74] = "S\tUG\u007fx\u0013U\r\u0014O`MM:D+|F1T@$9[\u000e\u0018]*n+";
      f4295[75] = "L\u001ccK1\u000fY\u0005;Y\t]U\u00169J^\n\u000bF`\u0016\tKSE0\u001e5^J\u001d\"";
      f4295[76] = "`u\"SEOx44\u001c?Q`*.`^Ew&7MXY\u001a+4PR\u0000%39E]?s<{\u0012NDj+,O?Pc-$FRB+4(,E\u0007s21\\]Fe}K";
      f4295[77] = "m\u00165i\u001b\u0016#Eo?c\u0012?\u0006d2\u000f hA:j[wk\u0004z9\t\u0011o\u0006:+c";
      f4295[78] = "A\u0014@Y<0S\u0017Ba~7^#N\baZ\u001b]\u0018\u0004z$A\rF\u0000\u0005c\\\u0012E\u000bcg^RWa";
      f4295[79] = "i%\f30;qd\u001a|J$~a5Lz&x%\u0015s6;vre";
      f4295[80] = "$u\u0015gj'j&O1\u0012#veD<~\u0011!%\u0014a\"F&yM8*-+iY=\u0012";
      f4295[81] = "S\u0012\u00190/)NHV7\u001e;H\u001aM1Il\u0012K\u0016]d0\u0019\u001a\u0018!yjV\u001d";
      f4295[82] = "\u0012^\f330CX\\lI)\u0012e\fs4)B\u000eV;6#";
      f4295[83] = "G:\nJv2D'\u0003\n\u001d>K.Q^y\u0018\\/@Ba5C.U3 5K!\u0002X-%_$:";
      f4295[84] = ")\u001az`B\u001d;\u0019xX\u0000\u001a6-t1\u001f>,\u000eK1\u0007\u0017J[\"i\u001e\b4\u0001r7\u001aws\u001cm4\u0011\u0011w\u001e-&{";
      f4295[85] = "2?d\bFZ <f0\u001eK\u0018,qQ\u0001]QzmY\u001c\b:w}M\u00190";
      f4295[86] = "\u0018_}\u001a4|\u0000Rh\u0015\u000b-\u001fMe\u001b\\zE\u001d;wd:\u001eOk\u001avr\u0007C";
      f4295[87] = "+sv\b1\u0007tgv\u0013Qŷ\u0017~lDl\u000ev)p\u0010:";
      f4295[88] = "/qnfb\b0-\"#\\Z/zzv\u000b\ru-%\u001a3M.xtw!\u00057t";
      f4295[89] = ":8`\u0018\u0000}*{-\u001a;`(yQDAa3ew_Rd\u0000di^G\u0000|bx@\u0003kqrlE;";
      f4295[90] = "k0JMnE%c\u0010\u001b\u0016A9 \u001b\u0016zsobGL*$=-KOg_$:\u001c\u0012\u0016";
      f4295[91] = "H5].5\u0005\u0017!]5UϏtoT8mEK#I6:";
      f4295[92] = "b#F[\u0019\b,p\u001c\ra\f03\u0017\u0000\r>fqKZ_i4>GY\u0010\u0012-)\u0010\u0004aP#1\u001b\r\u0007T!q\tg";
      f4295[93] = "Y9 B\r-\u0006- Ym՟en$V\u000e%\u000ec4B\u000b";
      f4295[94] = "d\u0003:&{\u00165\\/jEԍT\t-1}\u001dkE0?*m";
      f4295[95] = "T}z1N6\u000biz*.Ӿhy&=\u0015>Q/o}\\";
      f4295[96] = "HC?yS\\\u0019\u001c*5mɾxI(nUWG\u00055`\u0002'";
      f4295[97] = ":3S\u0000\u0013>9*\t\rxl ,\\\u0003/;{p\bUxy3*W\u0004Dz*pZ";
      f4295[98] = "-Cb4u.rWb/\u0015ǆ\u0011\u0014f v&z\u0019v4s";
      f4295[99] = "\u0012f;$\u0000'\r:wa>u\u0012m/4i\"H:sXQb\u0013o!5C*\nc";
      f4295[100] = "[*f,\u0010?Dv*i.m[!r<y:\u0001v*PAzZ#|=S2C/";
      f4295[101] = "r%G1G\u0018deR{7GuBXdXBcr?6WOm&T;G[h\u001e";
      f4295[102] = "EHuBMW\u0013R|\u0001tE\u0013EN@\u000fV\u0019\\JZ\u001dN&CbV\u0019Q\u00059fE\u001d\u0012GStF\u001f*";
      f4295[103] = "*Eb\u001b,ylFd\u0019Nę\u0017\nl\u000b\"bnLo\r ";
      f4295[104] = "$\u0011R\u001dM\\&\u0002\f]|C;\u0000\u0004A\u0007./MRD\u001d\\(\u0001\u0010X|\u0013\"\u0014\u000e\u001d\u0017\u001e2\u0000\u000b%";
      f4295[105] = "G+\u001fPi/\u0018?\u001fK\tʕ{/C\\2'By\n\u001c{";
      f4295[106] = "jw\u001e\u000eE75c\u001e\u0015%ϽV$\u0004\rIm0 \u0006M[\u0007";
      f4295[107] = "a*4E;%vh5Q\\q`h\u0004Q8c`\u00147\bc\u007flf0D!c\r";
      f4295[108] = "LUhm0;\f\u001bty\f7][ut`\u0005\r\u001d*#3RM@*z~\"[Jgt\fkNYyyjoL\u0019k\u0013";
      f4295[109] = "\b?0$fsFljr\u001e|V>etI)\u0006o=\u0018b`J-=q\".V9";
      f4295[110] = "\t%e`b[V1e{\u0002ƙ5(\u007f,?RT\u007fcxi";
      f4295[111] = "g7\u0005K/K.!M\u0015VX1!-\u000f7R5'\u0004??M=!\u0012\u0013;7g,\u0005\noJ16\fIV";
      f4295[112] = ":%f,\u0012b|&`.pӬ\u0007jz)\u0013#lgj=\u0016";
      f4295[113] = "\u001eC\u00138[\u0004X@\u0015:9,#X\u001ed\u0007\fXA\t3Z";
      f4295[114] = "{l#\t4.tc<S\u0004ч\u0005|3@}zx|:\tj@zi+K>=z`b\\\u0004";
      f4295[115] = "91*CKRwbp\u00153Vk!{\u0018_d8d!O3\u000ef4xGX\u0003v }\u007f";
      f4295[116] = ">8e~B\u001epk?(:\u001al(4%V(8eiy\n\u007fg+(/\u0005@\u007f&= :";
      f4295[117] = "P&\u0005,X\u001b\u0016%\u0003.:Īm=\bp\u0004\u0013\u0016$\u001f'Y";
      f4295[118] = "J>b~'oV%\u007f8G4R?x(.8k1x8*^\b8u&\u007f5\u0005(a#G";
      f4295[119] = "ZeX\u0006A^I8Z\u0014/ɡ0j\u0017O\u0011EKs\u0000\u0018L4\t}\u0018\u0013ER\r\u007fX\u0001/";
      f4295[120] = "\u0010D=sn.^\u0017g%\u0016*BTl(z\u0018\u0014\u00160r)OFY<qg4_Nk,\u0016vQV`%prS\u0016rO";
      f4295[121] = "JNt\u0000SQ\u0011JuQ<\f(I)TPOY\u0012-U\u0001";
      f4295[122] = "&\b2\b\u0017{9T~M))&\u0003&\u0018~~|TxtF>'\u0001(\u0019Tv>\r";
      f4295[123] = "\u0016i\u0001k_tI}\u0001p?Տ*?\u000frB$\u001a`\u001brY";
      f4295[124] = "\u0015iWv?t\u001eu\u0000|Ro\u001fl\u0000cRh\u000f\u007f\u001f%/h\u00066\b\u001fki\u001ba\fyok[sf";
      f4295[125] = "6<\fsu\u0011i(\fh\u0015қ\nk\bgv\u0019af\u0018ss";
      f4295[126] = ".\u0000lD\u0014VtHnN/S$\u0015uMx\u0004zB-!\u0010QtDi@^\u0002.\u0012";
      f4295[127] = "Gmo\u0000\u001f(Fn%Cs.Tz/\u001f\u00159ua0\u001f6$Md4\tst\u0016ql\u0018\u001a~Wj3r";
      f4295[128] = "M<\u0003M\u0015\t]\u007fNO.\u001b[z>\u0017T\u0019]z\u0013\u0011H\u001dR]\n\u001bC\u001869\u001eG\u0012\fWwM\u001dDt_wBH_\u000fF`\u0015\u0015.\u001bOf\u001d\u001cC\t\u0007\u007f\u0011vG\u0005\u00068\u0003\r^\u0012Qer\u001f_D\bw\t\u0006H\u0013U\u0006\u0003H\\KTcH\u0013@L6";
      f4295[129] = "~K\u0017\u0005[Yf\n\u0001J!Fi\u000f,z\u0011DoK\u000eE]Ya\u001c~";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f4295[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f4296[var4]);
            f4295[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m196(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m197(Class var0, String var1, Class var2) {
      Field var3 = m196(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m197(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m198(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f4295[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f4296[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f4295[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f4295[var4] = var13;
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
               var12 = m195(1444997151577830L, 0L);
            }
         }
      }
   }

   public static Method m199(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m200(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m199(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m200(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m201(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f4295[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f4296[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m195(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m199(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f4295[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(1444997151577830L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m200(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f4295[var4] = var19;
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
               var23 = m195(1444997151577830L, 0L);
            }
         }
      }
   }

   public static MethodHandle m202(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 218 && var8 != 216 && var8 != 242 && var8 != 'v') {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 165) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 202) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 218) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 216) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 242) {
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

   public static Object m203(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m202(var0, var1, var2, var3, var6, var9);
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Util240.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ǭ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
