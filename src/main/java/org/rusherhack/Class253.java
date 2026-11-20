package org.rusherhack;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.Closeable;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gl.GlProgramManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public abstract class Class253 implements Closeable {
   public Map<String, Class472> f4512;
   public int f4513;
   public int f4514;
   public int f4515;
   public int f4516;
   public static int f4517;
   public static long f4518 = Class066.m4320(4111800715475990506L, -3065904348461722931L, MethodHandles.lookup().lookupClass()).m4325(150174734561558L);
   public static String[] f4519;
   public static String[] f4520;
   public static long[] f4522;
   public static Integer[] f4523;
   public static Map f4524;
   public static Object[] f4525 = new Object[59];
   public static String[] f4526 = new String[59];

   public int m9146(String var1, int var2) {
      GL11.glGetError();
      int var8 = GL20.glCreateShader(var2);

      try {
         GL11.glGetError();
         if (var8 == 0) {
            throw new IllegalStateException("Error creating shader. Type: " + var2);
         }
      } catch (Class316 var6) {
         throw m621(var6);
      }

      try {
         GL20.glShaderSource(var8, var1);
         GL20.glCompileShader(var8);
         if (GL20.glGetShaderi(var8, 35713) == 0) {
            throw new IllegalStateException("Error compiling Shader code: " + GL20.glGetShaderInfoLog(var8, 1024));
         }
      } catch (Class316 var7) {
         throw m621(var7);
      }

      GL20.glAttachShader(this.f4516, var8);
      return var8;
   }

   @Override
   public void close() {
      int var4;
      label24: {
         var4 = m9155();
         RenderSystem.assertOnRenderThread();
         int var3 = var4;
         var4 = this.f4513;
         byte var10001 = -1;
         if (var3 != 0) {
            if (this.f4513 != -1) {
               GL20.glDeleteShader(this.f4513);
            }

            var4 = this.f4515;
            if (var3 == 0) {
               break label24;
            }

            var10001 = -1;
         }

         if (var4 != var10001) {
            GL20.glDeleteShader(this.f4515);
         }

         var4 = this.f4516;
      }

      GL20.glDeleteProgram(var4);
   }

   public Class253(String var1) {
      this(var1, var1);
   }

   public void m9149() {
      RenderSystem.assertOnRenderThread();
      this.f4514 = 0;
      GL20.glUseProgram(this.f4516);
      this.m6551();
   }

   public Class472 m9150(String var1) {
      return this.f4512.computeIfAbsent(var1, var1x -> {
         return Class472.m14722(this.f4516, var1x);
      });
   }

   public abstract void m6551();

   public Class253(String var1, String var2) {
      this(Class253.class.getResourceAsStream("/rusherhack/shaders/" + var1 + ".vsh"), Class253.class.getResourceAsStream("/rusherhack/shaders/" + var2 + ".fsh"));
   }

   public void m9152() {
      RenderSystem.assertOnRenderThread();
      GL20.glUseProgram(this.f4514);
   }

   public Class253(InputStream var1, InputStream var2) {
        super();
      long var3 = f4518 ^ 57463514545585L;

      this.f4512 = new LinkedHashMap<>();
      this.f4514 = 0;
      try {
         this.f4516 = GlProgramManager.createProgram();
         this.f4515 = this.m9146(org.apache.commons.io.IOUtils.toString(((java.io.InputStream)(var1)),((java.nio.charset.Charset)( StandardCharsets.UTF_8))), 35633);
         this.f4513 = this.m9146(org.apache.commons.io.IOUtils.toString(((java.io.InputStream)(var2)),((java.nio.charset.Charset)( StandardCharsets.UTF_8))), 35632);
      } catch (java.io.IOException ioException) {
         throw new IllegalStateException(ioException);
      }
      GlStateManager.glLinkProgram(this.f4516);
      if (GlStateManager.glGetProgrami(this.f4516, 35714) == 0) {
         Class170.f3346.warn("Error encountered when linking shader program. Log output:");
         Class170.f3346.warn(GlStateManager.glGetProgramInfoLog(this.f4516, 32768));
      }

      GL20.glValidateProgram(this.f4516);
      if (GlStateManager.glGetProgrami(this.f4516, 35715) == 0) {
         Class170.f3346.warn("Error encountered when validating shader program. Log output:");
         Class170.f3346.warn(GlStateManager.glGetProgramInfoLog(this.f4516, 32768));
      }
   }

   public static void m9153(int var0) {
      f4517 = var0;
   }

   public static int m9154() {
      return f4517;
   }

   public static int m9155() {
      int var0 = m9154();
      return var0 == 0 ? 69 : 0;
   }

   static {
    }

   public static Class316 m621(Class316 var0) {
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
   public static void m122() {
      f4525[0] = "1\u000b\u0002\u0013fX-\u0011\u0000O|L=\u0012KȻ";
      f4525[1] = void.class;
      f4526[1] = "java/lang/Void";
      f4525[2] = "```\u0019-cincPnnonwRsh-|tD4in|#e%bgj\u007fd9\u007fwj`";
      f4525[3] = int.class;
      f4526[3] = "java/lang/Integer";
      f4525[4] = "\u0016\t\u0013%7@\u0013\u001c\u0018%4G\u001c\u0015\u0013gup5HF";
      f4525[5] = "\u0013l\u0003Vq?\u000fv\u0001\nk+\u001fuJē";
      f4525[6] = "'!(v\u0010&;;**\n2+8a;\r!-}#7\u00054!=(v.</4**";
      f4525[7] = "M?I&GLD1Jo\u0004AB1^m\u0019G\u0000 Hi^EA\"I&mO}$E|OnO>EoOQ";
      f4525[8] = "!t\u0005\u0006#\r=n\u0007Z9\u0019-mLɜ";
      f4525[9] = "z{oL\u0004nfam\u0010\u001ezvb&\u0001\u001arpg|L\u0017k|'}\u000bXl|gl\r\u00015B`f\u0006\u0019lC`m\u0015>z{md\u0007\u0004Ytzm";
      f4525[10] = "\u0015\u0015\u000f^{A\u001e\u001a\u001e\u0011\u0006Y\r\u001d\u0017X";
      f4525[11] = "yjD=\u000f\u000fw{Kv@\u001cyuN|\u0000\f8qL='0ClJ\u007f\u001d";
      f4525[12] = "\u0011`oF=*\u0014/PIc6\u000fRmUv\"\u0016";
      f4525[13] = "{][Z%;xS\u0003Xc4cOHO%\u0016y]_Hn!";
      f4525[14] = "d{4\u001b~\u0013d{#Gr\u001c~0#Yr\tyAr\r&";
      f4525[15] = "\u001c 0-gI\u001f.h/!F\u00042#8gt\u0002 (((U\u0012\u0002.-;T\u001355";
      f4525[16] = "L\u0017x\u00005wP\rz\\/c@\u000e1M+kF\u000bk\u0000&rJKyK&vV\u0017z\u0000$mN\b~@#,B\u0017x\u0000\u0002l@\r~@3PF\u0003z\\\"l@\u0000";
      f4525[17] = char.class;
      f4526[17] = "java/lang/Character";
      f4525[18] = "v\u0010d\bK\u0001j\nfTQ\u0015z\t-ѳ";
      f4525[19] = "+\n)\u000ek\u001a5\u00023A\b\u000e1";
      f4525[20] = "OddF`!Dku\t\u0001/O`qS";
      f4525[21] = "6\u001f H\u0011J(\u0017:\u0007YJ2\u001d\"@PQr8#G\\K5\u00118";
      f4525[22] = "Dd'30\u0007Ok6|]\u0003Ow\u00027o\u001eKk27";
      f4525[23] = "\u000eh{_\u001aiEji\u0002s|5*s]CyIlqP\u0019";
      f4525[24] = "b3JmfQgg\u0010:\u001d\u0005;\u0012AzE\u001082Vox\u000b_gCbt\u000e//F6eje2Hoy\u001a-7\u001c~\u001dP09Ebm\u00185mT\u0006";
      f4525[25] = "m?\u0014\u0006[qj-\u0010jƽAp\"J\bAx;1\u001fj";
      f4525[26] = "<;\")\rx<\"e*\u007fj~ q>\u0003Dc\u0001q\"\u0013n\u007f\u0007|>\u0012ji[f)Dadb-:\u0011\u0003";
      f4525[27] = ">bG&\u007fc9pCJդSc}F#`#+x\u00122\u0004";
      f4525[28] = "\u0003\u0006</yZVH*-\u0013J\\t8,~YU`//|_Q]Ur|AQ\\%:y\u0015@8/%(GY\u0001d6}%";
      f4525[29] = "t\u0002\ns\u001dI!L\u001cqwY+s\u000eh,V&P\u000en6P!['s\u00186uS\u0007}\u0013F=VSlw\f X\np\u0007D%\f\u001b\u0014HX~V\u0012u\nT\u007fXc";
      f4525[30] = "jV\u0003`r4(Z\u0002n\u000318^]vcUoWVcg%'R\u0002r\u0003";
      f4525[31] = "]I.T\u0017\u000bZ[ 8\u0002;\u0000V%Q\bKHSq@";
      f4525[32] = "Fdg\u000faDAvccӀt\u001b{f\n~\u0004S~2\u001b\u001a\u000eL/`\u0002#E_z\u0002";
      f4525[33] = "\u001e_z0usLP+4\u0018f\u0015_n'd`3T_0c`\u0014F\u00167(lCKvae7\f:{ 'o\u0010U,  lrW&;)|\u0012\u0001k`f\r";
      f4525[34] = "tt\u000bb{Csf\u000f\u000eűs)k\ngd\u0003an^v";
      f4525[35] = "NH[R\rT\u001b\u0006MPgD\u0011=HX\u000eW\u0018-R\\\u000bF\u000fv\bZ\u0003B\u0011\u0006@_WSuL]Q\u000eO\u0005\u0004X\u0005\u001f+";
      f4525[36] = "d\\\u001f/Vll\u000fH!((38_4I2;c\u00131\u0014,*\bJtDlTRF1\u0017+,\u000eHwXTk\r\u0012$Y5)\u0001\u0013*(";
      f4525[37] = "8U\u0011ww (\u0007C~K:<\u0014N`'\bhS\u00169Ke>\fGc;-;XV\u0007";
      f4525[38] = "Mm\u0010dB\u0000H9J39T\u0014L\u001bsaA\u0017l\ff\\z\u0016m\u0011K^Tp9\u0019kP_\u0000q\u001c?A;Jl\u0012f]K\u0002iFw9\u0004\u001e2\u001c~XF\u00123\u0012\u000f";
      f4525[39] = "\u0002\u00012\u0000\u0013\u0001WO$\u0002y\u0011]t<\u0002\u0001\u001f]R\u0000\u0007\u0010\u0012TE[]\u0016\u001aP[+\u0015\u0013NA?!\nB\u001cX\u0006j\u0019\u0017~";
      f4525[40] = "1\u0010eLZ7s\u001cdB+=n\u0017.oWV4\u00110OO&|\u0014d^+=dDl\u001fP5c\u001b.&";
      f4525[41] = "\u0006.6M$PS` ON@YN6N/CTl2r4HRj6ON\u0015Rt6N>]W '*4B\u0006r>\u0013\u007fQS\u0010";
      f4525[42] = "-qe\u001fi\u0007(%?H\u0012St[b\u0012qdjxl\u000e{Y\u0010%l\u0010{X`miDj<jr8\u0016s\u0005!amt";
      f4525[43] = "!Fu\u001dWC\"F6\u001am\u000bK\u0018'K\u0007V*Z+J\t'tIx\u0010\u001cF6Ey\u001em";
      f4525[44] = "#R;\u001d8\u0019$@?q))z\u001b.\u0010/\u0010&\u001e%\u000fC\u0017}R?\u001dzKxY q";
      f4525[45] = ":l14v\u0013o\"'6\u001c\u0003e\u001e57q\u0010l\t8:p\u0001{Rb<x\u0005e\"*9,\u0014\u0001(5h~\r8c&=\u001c";
      f4525[46] = "\u001eG-DgD\u0019U)(ǈtCX,Ax\u0004\u000b]xP";
      f4525[47] = ";\u001dt\u0010^\u0001x\u0005)F,\u001c\u0005Z!\u001cFAd\u0018-\u001dH0:\u000b~G]Qx\u0007\u007fI,";
      f4525[48] = "bYUaD\u001a$[X;*\u00197G\u000fQ\u0015\boW\u00180W\u0004nYi+G]<\\P`T\b^";
      f4525[49] = "8iE\u00132uk*\u0014\u0005\u000eШS.J\ng{#fO^v\u001flz\u0014\u0004\u007f~.v\u0015\n\u000et.tXRd'm%Nn";
      f4525[50] = "h-\u0013^(*=c\u0005\\B:7H\u001aP.8)H\u001dD8>>\u0013@V&<7c\bSr-S}KR,0jw\u001fH\u007fU)~A[#lbm\u00149";
      f4525[51] = "sC'\u0014\u0014\u001btQ#xŘ+.\\&\u0011\u000b[fYr\u0000";
      f4525[52] = "eE\u0013D\u0014\\bW\u0017(ɚlnP\u001aB\u0002\u0012<_KF";
      f4525[53] = ",W\u0004s^Wy\u0019\u0012q4Gs&\u0000hyRm\u000e\u0017\u0014\u000eGs\u0000\tdFB'\u0011m";
      f4525[54] = "&O7!\\\u0014s\u0001!#6\u0004y>3:m\u000bt\u001d3<Wk'\u001e:/R\u001bo\u001bn>6Qr\u00157\"F\u0019wA&F\f\u0004y\u0018:6D\u0001-\t^";
      f4525[55] = "`\u0014J\f\"*5Z\\\u000eH:?wX\u0006\u0010/<EY\u0002-UaEG\u0002,%)@\u0013\u0013H/6\u0011A\nqd%D#";
      f4525[56] = "\u0005\u000eR\u0001VM\u0002\u001cVmɸ}]\u0010\u0006\u0007\\\u001c\u001f\u001c\u0007\t-G\r\u001a^\t]\u000f\bNOm\u0017\u0012\u0006\u0017S\u001d_\u0017R\u00067";
      f4525[57] = "r/~\u0012:\u0003t;y\u001aB\"G\u000fVABN~>>\u000e:\u0012pxq";
      f4525[58] = "\u0017'q\r\u0012hBig\u000fxxHPd\u0016\u0011|LBx\u0003\u0014zV\u0019\"\u0005\u001c~Hij\u0000Ho,#w\u000e\u0011s\\krZ\u0000\u0017Vt#\b\u0019.\u001dgvj";
   }

   public static Class m123(long var0, long var2) {
        return null;
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
        return null;
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
        return null;
    }

   public static MethodHandle m130(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 236 && var8 != 200 && var8 != 'K' && var8 != 'I') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'N') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'a') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 236) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 200) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'K') {
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
         try {
            return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
         } catch (Throwable throwable) {
            throw new IllegalStateException(throwable);
         }
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m671(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class253.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ȇ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public Class253() {}
}
