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
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.baritone;
public class Class384 implements Class608 {
   public static long f6237 = Class066.m4320(2320640014322784221L, -246680990830604788L, MethodHandles.lookup().lookupClass()).m4325(11643391288665L);
   public static String[] f6238;
   public static String[] f6239;
   public static Map f6240 = new HashMap(13);
   public static Object[] f6241 = new Object[72];
   public static String[] f6242 = new String[72];

   @Override
   public void m12373(String var1) {
        
    }

   public static String m12374() {
        return null;
    }

   @Override
   public void m12375(boolean var1) {
        
    }

   @Override
   public void m12376(boolean var1) {
        
    }

   @Override
   public void m12377(double var1, double var3, double var5) {
        
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      long var2 = f6237 ^ 59414924495825L;
      Event547 var5 = new Event547();
      int var10000 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "º", java.lang.invoke.MethodType.methodType(int.class, long.class, long.class)), 1474936637527445671L,  var2))).intValue();
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "µ", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.core.event.EventBus)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(org.rusherhack.core.event.EventBus.class, long.class, long.class)), 1476248584079316931L,  var2))),  var5,  1477036503047867663L,  var2);
      int var4 = var10000;
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "å", java.lang.invoke.MethodType.methodType(void.class, boolean.class, long.class, long.class)), ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "µ", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), var5,  1468604000078577062L,  var2))).booleanValue(),  1468215002477905513L,  var2);
      boolean var6 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "µ", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), var5,  1468604000078577062L,  var2))).booleanValue();
      if (var4 != 0) {
         if (!var6) {
            return;
         }

         var6 = true;
         boolean var10002 = true;
      }

      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "å", java.lang.invoke.MethodType.methodType(void.class, boolean.class, long.class, long.class)), var6,  1468215002477905513L,  var2);
   }

   @Override
   public void m12379(BlockPos var1) {
        
    }

   public Class384() {
    }

   @Override
   public boolean m12380() {
        return false;
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

   public static String m153(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25461;
      if (f6239[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f6240.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f6240.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/η", var10);
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
         byte[] var9 = f6238[var5].getBytes("ISO-8859-1");
         f6239[var5] = m117(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f6239[var5];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class384.class, "m154", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/η" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f6242[var4] != null) {
         return var4;
      } else {
         Object var5 = f6241[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 30;
               case 1 -> 6;
               case 2 -> 56;
               case 3 -> 38;
               case 4 -> 29;
               case 5 -> 22;
               case 6 -> 32;
               case 7 -> 15;
               case 8 -> 14;
               case 9 -> 8;
               case 10 -> 36;
               case 11 -> 39;
               case 12 -> 17;
               case 13 -> 50;
               case 14 -> 45;
               case 15 -> 0;
               case 16 -> 2;
               case 17 -> 31;
               case 18 -> 37;
               case 19 -> 7;
               case 20 -> 54;
               case 21 -> 9;
               case 22 -> 52;
               case 23 -> 21;
               case 24 -> 10;
               case 25 -> 43;
               case 26 -> 26;
               case 27 -> 63;
               case 28 -> 3;
               case 29 -> 11;
               case 30 -> 58;
               case 31 -> 27;
               case 32 -> 5;
               case 33 -> 53;
               case 34 -> 46;
               case 35 -> 60;
               case 36 -> 47;
               case 37 -> 44;
               case 38 -> 61;
               case 39 -> 33;
               case 40 -> 40;
               case 41 -> 12;
               case 42 -> 24;
               case 43 -> 51;
               case 44 -> 49;
               case 45 -> 20;
               case 46 -> 4;
               case 47 -> 62;
               case 48 -> 19;
               case 49 -> 1;
               case 50 -> 28;
               case 51 -> 57;
               case 52 -> 55;
               case 53 -> 23;
               case 54 -> 34;
               case 55 -> 16;
               case 56 -> 41;
               case 57 -> 25;
               case 58 -> 59;
               case 59 -> 42;
               case 60 -> 18;
               case 61 -> 48;
               case 62 -> 35;
               default -> 13;
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

            f6242[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f6241[0] = "iW!\u0001Z(uM#]@<eNhȩ";
      f6241[1] = int.class;
      f6242[1] = "java/lang/Integer";
      f6241[2] = "?\u0015*G_\"#\u000f(\u001bE63\fc\nB%5I(\u001fH9$I\b\u001fH9$%8\u001a";
      f6241[3] = "6T~\u00066?*N|Z,+:M7K+8<\b|^!$-\bmQ4/wcoM*>";
      f6241[4] = void.class;
      f6242[4] = "java/lang/Void";
      f6241[5] = "]d#]emA~!\u0001\u007fyQ}jτ";
      f6241[6] = "!\u0003\u0004\u000e*y=\u0019\u0006R0m-\u001aMɔ";
      f6241[7] = "kK\rGlBwQ\u000f\u001bvVgRD\nqEa\u0017\u000f\u001f{Yp\u0017\u001e\u0010nR*|\u001c\fpCGX\u0004\n{[hX\b\u0005{";
      f6241[8] = boolean.class;
      f6242[8] = "java/lang/Boolean";
      f6241[9] = "\u001a\u0017\u000e~Mh\u0006\r\f\"W|\u0016\u000eG2";
      f6241[10] = "hw57OTtm7kU@dn|Ų";
      f6241[11] = "v[5\\)AhS/\u0013HDhS,SfX";
      f6241[12] = "=K @m\u001a6D1\u000f\f\u0014=O5U";
      f6241[13] = "fmX$\u0001\u000bji\u0004,\u0005\r*|K9\u001d\rjk\u0004.\u0014\bg\"c\u001d\u0014\u0010l";
      f6241[14] = "5[v\u0002\f\\9_*\n\bZyOp\u0002\u0014@yxa\u001f\fV%xh\u0004\u001bX\u0007Uw";
      f6241[15] = "m\u0005`O\u0014<f\nq\u0000i$u\rxIx%n\brKH";
      f6241[16] = ",\u0013\u000e\u0010:\u0014'\u001c\u001f_G\f4\u001b\u0016\u0016";
      f6241[17] = "\u0005QcG\u001d\f\u0019Ka\u001b\u0007\u0018\tH*\n\u0003\u0010\u000fMpG\u000e\t\u0003\rq\u0000A\u000e\u0003M`\u0006\u0018W\tLj\u001d\n\u0001\u001e\rG\u0006\u0001\r\u000f[p(\f\r\u0003Lj";
      f6241[18] = "V\u0001\u0013?O/Z\u0005O7K)\u001a\"\u0000$R4[\u000e\u0004\u0017k\t";
      f6241[19] = "\u001eN\u001bhiG\u0012JG`mARf+`oA\b@\u0007dMZ\u0013Y\u0000exZ";
      f6241[20] = "u\u0003\u001f_\u000b-y\u0007CW\u000f+9+/W\r+c\r\u0003S";
      f6241[21] = "0C\u0011#\"\f<GM+&\n|@\u0006\"7\u0015;M\u0011d\u001f33V\u000b#8\u0004\u0010G\u000b+ \n=P";
      f6241[22] = "1{6\u001aa\u0013=\u007fj\u0012e\u0015}j6\u001cv\u0019 ij:W\u001d!s0\u001c{\u0019\u0003h+\u0010p\u000f ";
      f6241[23] = "C7'a\u001c`O3{i\u0018f\u000f&4|\u0000fO1{k\tcBx\u001cX\t{I?;o+`O\"'g\u0004B@84o\r}";
      f6241[24] = "w^t,:RkDvp F{G=a'U}\u0002pm%JyBw,)U\u007fY~g&S6\u007fgp!I\u007forr<RjI";
      f6241[25] = "rU'$F\u0003~Q{,B\u0005>D'\"Q\tcG{\u0004q\u0019c@: u\u0003qX\u0005?]\u000fuG&";
      f6241[26] = "Gm0\u001c[fKil\u0014_`\u000b|#\u0001G`Kkl\u0012@hI\u007fl2@hI";
      f6241[27] = "\u0015o7(=|\u0019kk 9zYm*,$r\u0019jk,(}\u0016i 3gZ4a(,(}\u0013C$/(t\u0012|";
      f6241[28] = "+S#'r\u0013 \\2h\u001e\u0010.^0'2";
      f6241[29] = "TQP[4uXU\fS0s\u0018cGF4sXWQ";
      f6241[30] = "'M4-\u001eZ+Ih%\u001a\\k\u007f#0\u001e\\+K5`9P1X/*\r";
      f6241[31] = "+ 9elC /(*\u0001G 3\u001ca3Z$/,a";
      f6241[32] = "#iv>\"W/n/(HA~,Ld.N}677*T\"P";
      f6241[33] = "{l\u0015\u0018}'a4NZ\u0018!pjP\b_1\u00190\u0012\u0004 %h\u007f\u0012\u001c\"_{l\u0015\u0018}'a4NZ\u0018";
      f6241[34] = "\u0001bdY-+\\ffVK>\u0019~wS&\f\u001ehr6/k\rw`Z.1\u001cl";
      f6241[35] = "\u0003\u0010g^Q\t\u0012\u001eoT6_\u000e\u0019\u007f\\WR\u0012\u007fgT_\u000b\u0018\u0019:\f\r\niA<T\u000eN\u0018\u000e<L\f4";
      f6241[36] = "!'%/C)97.\u0017ԓ@y>2k\u0018.{/-|s";
      f6241[37] = "Nv3\u000fU+\u0006q`\u000f%5\u0012c\u0015^^&\u007fvgS]:\u001ab(NHZ";
      f6241[38] = "1]H1\tS)MC\tɠ:iD_uRTkU@b9";
      f6241[39] = "wuo-B.o1f(9'yUwkX=q\u000ea~]0y3ppU:\u001e";
      f6241[40] = "\f>)G\"e\u001d!,\u0015_l\n$H\u00048}\u00064}\u0004_o\u000b)u\u0003$i\u001c!v~";
      f6241[41] = "nU>~\u0002R:Ov,2\u0007aH7+[\u001aFZ*\"2\u0001oW$(\u000f\u0010a_.O";
      f6241[42] = "H6eB\u001e%PrlGe3Y5l\u0018\tZK\"e\u0015\u0002gZ,m\u001fe3Z)=\u0005\u001a+\u001e 8~";
      f6241[43] = "D06Ve\u0018W>5[\u0004\u0013D}\u0007_x\u001cHg0|i\u001c@\u007f>Q~|G8aT9\rU`\"_\u0004";
      f6241[44] = "\u000e.GuN\u001f\u000frTy*\u0007\u00068V^G\t\f%VEL)\u0006%V~M\u0006as\u0013>@\b\u0018\u007f\u0014gVb";
      f6241[45] = "~\u000fAu2\u0013m\u0001BxS\u0018~Bp|/\u0017rXG^4\u0011oDOq\u0016\u001euWGx)w|SEd7\n}\u000fVhS";
      f6241[46] = "wG23\r\u0006dI1>l\rw\n\u0010.\u0017\u001e}\u0013\u00144\u0005\u0006B\f<8\u0001\u0019av;\"\u0006\u001e~\u0014 hR\u001f\u001a";
      f6241[47] = "(v\b\u0005\u001b\u001b;p\u000b\u0018`M9c\u0007\u0000\u001cMId\u0003\u0019\u000bGtu\r\u0011\u0001 w1\rE\u001aQ81\u0015G`";
      f6241[48] = "'E\u0014\u001b(.3\n\t\u000eH7) \b\u0019)-!{\u001e\f, )F\u000f\u0002$*N";
      f6241[49] = "~?T2\u0017\u0005f{]7l\u0013o<]h\u0000z){Q6\u0016\u000bf{I4l\u0013l \fu\u0013\u000b()\t\u000e";
      f6241[50] = ",m\u0017]G4->F[?|Ln\u0012ET7q\u007f\u001cM^P&k\u0019JXm7e\u0011@?";
      f6241[51] = "\u001am\fh\u0012\f\u0016jU~x\u0014Q\fLo\u0003\u0018L(6<G\u0014\u0012.GsG\f\u0010T";
      f6241[52] = "o\f\r9iYtFY8\rTb\u0001(\"d_\u000f\u001c\f,|Uv\u000fX>d;";
      f6241[53] = "HMwBavYRr\u0010\u001c\u007fNW\u0015\u0016`lBM!\u0000\u001csDE!\u001d`.@G.{";
      f6241[54] = "%o)!l\u007f\u007fmo#SӔ\u001b$>+8w#sm'o";
      f6241[55] = "CMB?>\u001fA[\u0016xY\n(L\u0017$2A\u0015]\u0019,8&BI\u001c+>\u001bSG\u0014!Y";
      f6241[56] = "^{k)i)_'x%\r.\\yg#q9KN|?f9Jm\u00066k%\u0000&?bqmR\u0016<&j$Rk{86h1";
      f6241[57] = "I \u000bK\u000fz\u001es\u0007\u001cv:\u00175\u0016 L8\u001f(\u0013\\Ny\u0000uj\u001a\b%\u0000-\u0017]\u0016yLN";
      f6241[58] = "C\bQKnkE\u001fYH\u0013\u007fB\u0018xTruF\u001eQdzjN\u0018GH~\u0010BUINrtQ[JC\u0013";
      f6241[59] = "\u0010:D;1z\u0002b\u00070\fj\u0005[\u0013%lj\u0018lzg3jFy\u000b(3rD\u0003";
      f6241[60] = "9\u0001\u00144NRd\u0005\u0016;(G!\u001d\u0007>Eq3\u0002\u0019\u001cNj3\u0018\u0013[L\u00125\u0014\u00107GH$\u000f";
      f6241[61] = "LRLzl|\u0012K\u0019&\u0001$w\f\u0013 c*H\bFbyMK^@\u007ffrO\u000b\u0002e\u0001";
      f6241[62] = "~KSV^N*Q\u001b\u0004n\u0016kdI\u001b\u000f\t}-\u001cX\u000fOj\\SX\u0017M\u0010";
      f6241[63] = "${7.wR(|n8\u001dJo\u000fh<aZ\u0014|2%%Qe32='+";
      f6241[64] = "\nwV !\tWsT/G\u001c\u0012kE***\u0000t[\b!*\u0000lU5G\u0011U\u007fJ%+\u001a\u000fnQ";
      f6241[65] = "l<d|;Awv0}_Xa1Ag6GE+bX6_lMok6Rb4|?$J\fwpg/@q0n;c#";
      f6241[66] = "+wC\u001b@A{q\u001cV#Fm\u0003O\u0000HJr,K\n#\u0019))\u001e\u001cRV)1\u001cf";
      f6241[67] = "HTTsh\u007f[ZW~\ttH\u0019vtl~L\u0003QV`}L\nPi\tz]\u0001Eh2i[\u0002X\u0013";
      f6241[68] = "GJP%n\u001e\u0016WVv\u000eίy\u0015\u0004&6\b\bZ\u0004>4";
      f6241[69] = "`GP\u001f\u0000`r\u001f\u0013\u0014=~c\u00026\u0014Aq\u000eNWGW{wBP\u001eA\u0011";
      f6241[70] = "\u0018`\u0005MVY\u0013:\u0014V<K\u00158\u0017R<\u0005\u001a<\u0004YGV\u001e&[";
      f6241[71] = "%\u000f\fPu\u001f4\u0001\u0004Z\u0012^($\u000fD\u007fX\u0004\t\u0013V\u0012H \u0004\u0003\\/Y.\f\t;";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f6241[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f6242[var4]);
            f6241[var4] = var5;
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
      Object var5 = f6241[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f6242[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f6241[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f6241[var4] = var13;
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
               var12 = m123(878731462453509L, 0L);
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
      Object var5 = f6241[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f6242[var4];
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
               f6241[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(878731462453509L, 0L);
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
                     f6241[var4] = var19;
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
               var23 = m123(878731462453509L, 0L);
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
         if (var8 != 248 && var8 != 211 && var8 != 162 && var8 != 229) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 181) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 186) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 248) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 211) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 162) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class384.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/η" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
