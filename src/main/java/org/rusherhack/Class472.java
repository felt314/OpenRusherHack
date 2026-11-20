package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.nio.FloatBuffer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryStack;

public class Class472 {
   public int f7580;
   public String f7581;
   public static boolean f7582;
   public static long f7583 = Class066.m4320(-4466218198562771236L, 3250620453548552843L, MethodHandles.lookup().lookupClass()).m4325(62438882133804L);
   public static long f7584;
   public static Object[] f7585 = new Object[34];
   public static String[] f7586 = new String[34];

   public Class472(String var1, int var2) {
      this.f7581 = var1;
      this.f7580 = var2;
   }

   public void m14717(boolean var1) {
      byte var10001;
      if (var1) {
         var10001 = 1;
         boolean var10003 = true;
      } else {
         var10001 = 0;
         boolean var6 = true;
      }

      GL20.glUniform1i(this.f7580, var10001);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void m14718(Matrix4f var1) {
        
    }

   public void m14719(float var1, float var2, float var3) {
      GL20.glUniform3f(this.f7580, var1, var2, var3);
   }

   public void m14721(int var1) {
      GL20.glUniform1i(this.f7580, var1);
   }

   public static Class472 m14722(int var0, String var1) {
      var0 = GL20.glGetUniformLocation(var0, var1);
      return new Class472(var1, var0);
   }

   public void m14723(float var1) {
      GL20.glUniform1f(this.f7580, var1);
   }

   public void m14724(float var1, float var2) {
      GL20.glUniform2f(this.f7580, var1, var2);
   }

   public static void m14725(boolean var0) {
      f7582 = var0;
   }

   public static boolean m14726() {
      return f7582;
   }

   public static boolean m14727() {
      boolean var0 = m14726();
      return !var0;
   }

   static {
   }

   public static IllegalStateException m1393(Throwable var0) {
      return new IllegalStateException(var0);
   }
   public static void m122() {
      f7585[0] = "pA0)&WuT;)%Pz]0kdgS\u0000e";
      f7585[1] = int.class;
      f7586[1] = "java/lang/Integer";
      f7585[2] = "MRe\u0003$YF]tLI]FA@\u0007{@B]p\u0007";
      f7585[3] = "\u007f>\u007f;QSc$}gKGs'6р";
      f7585[4] = "\u0001M`\u0010,]\nBq_VY\u0019Ca\u0010`]\u000e";
      f7585[5] = "7{\u000e%Lo+a\fyV{;bGȍ";
      f7585[6] = void.class;
      f7586[6] = "java/lang/Void";
      f7585[7] = float.class;
      f7586[7] = "java/lang/Float";
      f7585[8] = "X ?#dHZ>v@oSE; 9h";
      f7585[9] = "UO2]\u0013\u001cVAjzQ\u001d^Z\u0006I[\u0014Z\\";
      f7585[10] = "~\"\\\\f{{7W\\yub$^\u001f$At=T\u0000s_e1X\u0019";
      f7585[11] = boolean.class;
      f7586[11] = "java/lang/Boolean";
      f7585[12] = "\u0013\u0012\u001ex'_\u0018\u001d\u000f7ZG\u000b\u001a\u0006~";
      f7585[13] = char.class;
      f7586[13] = "java/lang/Character";
      f7585[14] = "8\u007fm\u0016%|3p|YDr8{x\u0003";
      f7585[15] = "wjz? B!py1]_'u\u0000e6P3ujddIq\t>0=I6c?b$\u000bJ";
      f7585[16] = "\u0012[\u001bWm@\u0016\\\u0014hsGu\u0007\u0010\u0006{YMZ\u001fhm\u001eA_JW'ZAaLP\"SC\u000f\u0000\u0019eJ(\\IVlHF\u0010\u0000\u0011u#\u0015YO\u0018wMY\u0010\b\u0001\u001c\u001fM\u0018\u0010X\u007fSP\u000b\u000eh";
      f7585[17] = "=\u0019e'1\ra]3`M\u0383\u0007S11s\b8\u0019u1";
      f7585[18] = "{,?s#\r'hi4_ZA-+v?J1jgp93{j,l&C<&*j_";
      f7585[19] = "Qp\u0016x{@\u001ap\u0005s\u001eՅj`J* \u001eU*\u000e*\u001e";
      f7585[20] = "&'aQCam'rZ&ɝ\u001d7=\u0003\u0018?\"}y\u0003&";
      f7585[21] = "&)\u0002\u0016/\u0007zmTQS˒\u001c-\u0013W9Rnq\u0006\u0007(9 w\u0012\bcZlj\u0001\u0016S";
      f7585[22] = "gqW SqcvX\u001fMv\u0012&ABDs3,Gzfu6\"A~Et]:\u0000v\u001c)bpDv\"(etQcK,f/\\\u001fS/4u\u0006 \u0019k4K";
      f7585[23] = "\u007f Sv\u00035!tLosh\"#Bu\u0013\f>xD7H3t<D\t";
      f7585[24] = "Y\u00045q\u007f;\u0004\u0007?e\u0004!\u0002\u0001.x\u0004v\u0003\u001f4%g:\u001e\f*\u0015";
      f7585[25] = "S\u0016}WDnW\u0011rhZi4Jv\u0006Rw\f\u0016yhD0\u0000\u0012,W\u000et\u0000,*P\u000b}\u0002Bf\u0019Ldi\u0011/VEf\u0007]f\u0011\\\rUIn\t\u0005n\u0019T}\u00175";
      f7585[26] = "Kqvz\u0004/OvyE\u001a(,-}+\u00126\u0014r}E\u0004q\u0018u'zN5\u0018Kmx\u001crJt'<\u001cLM.e$E/\u00013v:u";
      f7585[27] = "/\u001a\u0006qx\u0006hV\u0000w\u0001\u001fy\u000b'ly\u000eo\n\u0007jl\u001a\u0015]\u0001ka\u000fe\u001aMmgv)\u0002\u0005p1\u0015e\u001f\u0016n\u0001";
      f7585[28] = "R#U0x%\u000eg\u0003w\u0004нh'Dqnp\u001a{Q!\u007f\u001b";
      f7585[29] = "EK;,gI\u0018H18\u001cC\u0006@0+DE\u0001I[w~X\u001eR**}R\n)";
      f7585[30] = "[\u0014-}\u001a-\u0006\u0017'ia9\r\u0012)~\n\u0012\u0000\u0011$ea-Y\u001fs\"^g\u001d\u001fM'\n<\u001d\n'&X%_v";
      f7585[31] = "M\u0019\u000en\u000e/\u0013M\u0011w~}\u001d\u0015\nX\u0002\u0016\fA\u0019/E)F\u0005\u0019\u0011OyF@Hx\u0018gG\u0001p";
      f7585[32] = "/\u0017Vf$9+\u0010YY:>HK]72 phU%/;e\u0011R'U+(D\u0002bjalD<f-d\u007fFN:84n-\u000225#iG\u0003`,a\u0015\u0011Y 4jv]D3*Z";
      f7585[33] = "\u0003\u0006d|`\\\u0007\u0001kC~[dZo-vE\\\u0005`C`\u0002P\u00025|*FP<3{/ORR\u007f2hV9\u0000k:p\u000fZLv)n?";
   }
}
