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
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.ClientPlayerEntity;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.client.api.feature.module.impl.movement.ElytraFly;
public class Class455 {
   public int f7380;
   public boolean f7381;
   public float f7382;
   public int f7383;
   public long f7384;
   public float f7385;
   public int f7386;
   public static long f7388 = Class066.m4320(1683516623422264545L, -5928779562349825563L, MethodHandles.lookup().lookupClass()).m4325(54057903208209L);
   public static String[] f7389;
   public static String[] f7390;
   public static long[] f7392;
   public static Integer[] f7393;
   public static Map f7394;
   public static long[] f7395;
   public static Long[] f7396;
   public static Map f7397;
   public static Object[] f7398 = new Object[79];
   public static String[] f7399 = new String[79];

   public float m14323() {
      return this.f7382;
   }

   public Class455(ElytraFly var1) {
    }

   public void m14324(ClientPlayerEntity var1) {
        
    }

   public void m14325(boolean var1) {
      this.f7381 = false;
      this.f7386 = this.f7380 = this.f7383 = 0;
      this.f7382 = this.f7385 = 0.0F;
      this.f7384 = System.currentTimeMillis();
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
   public static long m7887(int var0, long var1) {
        return 0L;
    }

   public static long m7888(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = m7887(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class455.class, "m7888", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/й" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m122() {
      f7398[0] = "~`G@I&bzE\u001cS2ry\u000eԋ";
      f7398[1] = "=Y]*s!6VLe\u000e9%QE,";
      f7398[2] = "lg@up\u0001ghQ:\u0013\frn";
      f7398[3] = double.class;
      f7399[3] = "java/lang/Double";
      f7398[4] = "^\u001ax;\u001a\u0000U\u0015itp\u0003A\u0019b?";
      f7398[5] = "^hT\u000e\u0003\u001dBrVR\u0019\tRq\u001dЙ";
      f7398[6] = int.class;
      f7399[6] = "java/lang/Integer";
      f7398[7] = "\u001e#kV}\u0017\u00029i\ng\u0003\u0012:\"լ";
      f7398[8] = long.class;
      f7399[8] = "java/lang/Long";
      f7398[9] = "abI\u001eBCjmXQ*CdbK";
      f7398[10] = float.class;
      f7399[10] = "java/lang/Float";
      f7398[11] = "<C1Q.\u0019<C&\r\"\u0016&\b&\u0013\"\u0003!ywKp";
      f7398[12] = "\u001dh/\u0011oh\u0001r-Mu|\u0011qf\\ro\u00174;Zii\u001bt/\u0011_r\u001dv-^sN\u0017n<Vsz";
      f7398[13] = "iaWc\nKu{U?\u0010_ex\u001e.\u0017Lc=C(\fJo}Wc6KkqU?+[rgY#\u001f";
      f7398[14] = "Vo\u0014:`KJu\u0016fz_Zv]w}L\\3\u0006`{RJ3>ufVli\u001axa";
      f7398[15] = "@obQR)K`s\u001e5+^ksU\u000e";
      f7398[16] = "\u001eR\u0016\u0012h)\u0002H\u0014Nr=\u0012K_Ɉ";
      f7398[17] = "cBjQ\u000bEcB}\r\u0007Jy\t}\u0013\u0007_~x)KP";
      f7398[18] = ";JX~T\u0006'PZ\"N\u00127S\u0011ɖ";
      f7398[19] = "\u0000\u00134\u001ds\u001c\u001c\t6Ai\b\f\n}Pn\u001b\nO Vu\u001d\u0006\u000f4\u001dR\f\u001b\u0015:]f";
      f7398[20] = "\u001fHx,\u001cF\u0014Gic}H\u001fLm9";
      f7398[21] = "xH^T~\u0019f@D\u001b3\u0003|J]G\"\t|]\u0006a9\u0001w|F\\$";
      f7398[22] = boolean.class;
      f7399[22] = "java/lang/Boolean";
      f7398[23] = void.class;
      f7399[23] = "java/lang/Void";
      f7398[24] = "\u0013l\u0017K!X\u0018c\u0006\u0004M[\u0016a\u0004Ka";
      f7398[25] = "q-[hRJm7Y4H^}4\u0012%LV{1HhAOwqN#N[{-\u0012\u0014EQz:N\u0005OQj:D2";
      f7398[26] = "GK]\u000f{.[Q_Sa:KR\u0014Be2MWN\u000fh+A\u0017OU`7[\u0017yIh/}MSMz";
      f7398[27] = "\u001enpt\n`\u0015aa;wu\u0007{cx";
      f7398[28] = "[\t,`mp\b\u0017 \u000eɑIM\u000bumq R\u0004v\u000en7\u000b\u0016,gq8\bu";
      f7398[29] = "=E\u0007o!?5O\u00053\u001c|cn\u0014<}ibO}j\"98Y\u0000-,}=4Gn%<iI\u0000`a9\u0004";
      f7398[30] = "\u001eZ#i(|CE8jR,CV6s?\u001eMO!zRz\u001a\u0012`z/=\u0014Ve\u0017";
      f7398[31] = "uKWc\u0014B~A\u000b+*гN\u0006LjGKqSW4M";
      f7398[32] = "\u001e\u0018\u0005-Q?\u0016\u0012\u0007qliM\u0012\u007f(R9\u001b\u0004\u0002o\\}\u001eiE,U<J\u0014\u0002\"\u00119'";
      f7398[33] = "xm#c~\\87);@ȻE1({*L9`(n:";
      f7398[34] = "dE\u0019D:J$\u001f\u0013\u001c\u0004ʾY\u001eJ\u001e8^$YDZ=3c\u001aM\u001biN$\u0014\t\u001e\u0004";
      f7398[35] = "I\u0000o\u0014\u0002@\u0016\u0012h\u0019bR\u0013\n?\u0007<U\u0013\u0010;{]QJ\u00143C\u0018]\b\tV";
      f7398[36] = "\u0013\u0019ZE@*DXMRy-N[GD\u0015\u001f\u001a\u001f\u001c\u001ayr\u001d\u001e\u001bN\u00045\u0013Z\u001e#Cv\u001a\u001bJ^\u0004x^\u001e'\u0019Gq\u001fJZ^I5\u001a'\u0017\u001d\u0004.\u001aE@\\\u00139#";
      f7398[37] = "\u0010%.)zGP\u007f$qDȹ-t87)_P|}p4";
      f7398[38] = "]\u00151\b~f\nT&\u001fGj\fF(\u0002\u0010=V\u0016tn}:T\u0017!\u0013:4\u0010\u0012";
      f7398[39] = "op\t\n-\"81\u001e\u001d\u0014.>#\u0010\u0000CydsMl.~fr\u0019\u0011ip\"w";
      f7398[40] = "XMqx\u0005\u0012SG-0;ѻc\u0000jqV\u001b\\Uq/\\";
      f7398[41] = "g/s\u0004Q='uy\\oƢZ\u007fr[\u0014!0~q\u0001\u0014";
      f7398[42] = "}[.r hz\u000e5cM3rN;a55p[*vMh*\u000bjv0/$Oo\u001bwl-\u000e;f0bi\u000bV!sk(_+f}/-2l%tnyO++0k\u0014";
      f7398[43] = "`\f4S\u0000at\u0011;\u0013cyo\u0014U\u0006\u0007edh7\u0014Zu9Wb\u000f\u0004\u007f\t";
      f7398[44] = "\u0012c`! \\\u0019i<i\u001e\f)xfve\u000eUhg~#eCtgju\u0019Suo,\u001e";
      f7398[45] = "Vu&.n\u001e^\u007f$rSZ\u0016~ \u0011i\u001fV81l.\u0011\u0012=\\+m\u0018Si!lc\\V\u0004";
      f7398[46] = "V\u0000c%\u0016#^\nay+w\b\n\u0019 \u0015%S\u001cdg\u001baVq#$\u0012 \u0002\fd*V%o";
      f7398[47] = "3w\"MFNs-(\u0015xŦ\u000e'#\u0012\u0003Rd& H\u0003";
      f7398[48] = "*\u001d\\@EW}\\KW|Pw_AA\u0010b#\u0013\u0011\u001eA5 \u001d\u0018\u001a\u0011Hg\u0013\\\u001f|\u000f$\u001a\u001dK\u0001H*^\u0018&F\u000b#\u001fL[\u0001\u0005g\u001a!\u0016BH|\u001aCA\u0003_k#";
      f7398[49] = "cl\u007f\u00139{#6uK\u0007ԃ^<~L|g4=}\u0016|";
      f7398[50] = "sb1b\u0001\u001738;:?ҡN3'|R\u000f3;b;O";
      f7398[51] = "\u0003!h+y\u000e\n\u007fon\u0002\u000b\u00053lrn9Q\u007f3$2nXqqs;\f\u000f0fd\u0002";
      f7398[52] = "woX>S+ .O)j'&<A4=p|l\u001fXPw~mH%\u0017y:h";
      f7398[53] = "j9\b\u0016\u0005|*c\u0002N;ƘWh\u001e\bVd*`[OK";
      f7398[54] = "4(BB\\x=vE\u0007'}2:F\u001bKOdx\u001aA\u001b\u0018`+\u001b\u0005B %'Y\u0018'";
      f7398[55] = "\u0013\u001fG4aX\u0017\u0013R<\u0001ՈxSB5l\u0018G\u0006Ykf(";
      f7398[56] = "YTgnz3\u0019\u000em6Dջd\u0004f1?/\u000e\u0005ek?";
      f7398[57] = "]\u007fD:E}Vu\u0018r{Ƴf3Bq\u0011-\u001abBd\u0001";
      f7398[58] = "P?EF_3\u0010eO\u001eaӃmnSX\f+\u0010f\u0016\u001f\u0011";
      f7398[59] = "}&5\u001az^v,iRD8Fh8\u0017=\u0002~-4U ";
      f7398[60] = "\\'1|x{Rw`1\u001fi]eQ%{{]\u0019b,%:B&2!c{0";
      f7398[61] = "@$M\"\u0003:W#\r'i\u0005`\u00127X%\u0005-4\r#U4I#\ncP";
      f7398[62] = "o\u0007!\u001a\u0006\u0007fY&_}\u0002i\u0015%C\u00110>R~\u001dMg>W|\u0018\u0010\u001ayY8\u001d}";
      f7398[63] = "]\t\u0017-2+\u001dS\u001du\fώ`Y\u0016rw7\nX\u0015(w";
      f7398[64] = "8\u001eL:kX3\u0014\u0010rUк\u0003PA7,\u0004;\u0015Mu1";
      f7398[65] = "v~\fH\u0001d}tP\u0000?ƻMa\u0016@T<=`\u0002\u0004^";
      f7398[66] = "KV\u0003M\r/C\\\u0001\u00110k\u0013AyH\u000e)NJ\u0004\u000f\u0000mK'CL\t,\u001fZ\u0004BM)r";
      f7398[67] = "-qeg\"@:v%bHX'I9?,E;\fe=3N)p4=&^@1> \"M<`>52$";
      f7398[68] = "\u000b\u001ec\u000e?\u0018\u0002@dKD\u001d\r\fgW(/Y@8\u0001uxPNzV}\u001a\u0007\u000fmAD\u0017[\u00148\n5\u0017\t\u001cy0";
      f7398[69] = "tnq\u0011\u000ej\u007fd-Y0ȅO#j\u0018]cpvqFW";
      f7398[70] = "\u0002\u001c\u0015\f\r&BF\u001fT3ǝ?\u0013\u0002WX>O\u0012\u0016\u0013R_\u0005CAS^\"BM\u0005V3";
      f7398[71] = "F\u0005\f e\u000e\u0006_\u0006x[\u009f{U\r\u007f \u0012\u0011T\u000e% ";
      f7398[72] = "`xmFz\u0019ly*\u0017G\bha0\u0014.\u0004Qo0\u0004*ba|l\u0012&\u0012`h(\u0018G";
      f7398[73] = "\u000b/\u0015\u0017ic\u00147W\u0017\u0016vk)\u0011]u9\u00026\u001e^\u0016&\u0015o\f\u0004\u007f9\u001alo";
      f7398[74] = "t!4GX~4{>\u001ffфIq5\u0018\u001db#p6B\u001d";
      f7398[75] = ";E\u000f\u001f1n{\u001f\u0005G\u000fχ\u0006\u0015\u000e@trl\u0014\r\u001at";
      f7398[76] = "W\u001b*\u0000j\u0001[\u001f9R\u000b\u0007LF-E\u000b\u0003H\u001d(Zb\u001cG\u001eKV0\u001b\t\u001d:Vb\u0013H'";
      f7398[77] = ",A\u0014E^}#C\u001bV..0A\bYH9\u0011Z\u0017Yk$)_\u0013O.x+@\u0018]R)+U\b4";
      f7398[78] = "@lq,CjKf-d}ʿ{ pq\u001em\u0002`*{F";
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
}
