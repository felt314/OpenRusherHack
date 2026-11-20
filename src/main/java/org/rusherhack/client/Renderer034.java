package org.rusherhack.client;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.Class066;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.core.setting.Setting;

public abstract class Renderer034<T extends Renderer020> extends Renderer026 {
   public T f1262;
   public int f1263;
   public static boolean f1264;
   public static long f1265 = Class066.m4320(-8863459509661134187L, 5404494080886328226L, MethodHandles.lookup().lookupClass()).m4325(265079923121569L);
   public static long f1266;
   public static Object[] f1267 = new Object[62];
   public static String[] f1268 = new String[62];

   public abstract List<T> m2852();

   public Renderer034(int var1) {
      super();
      this.f1262 = null;
      this.f1263 = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public double getHeight() {
        return 0.0;
    }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public double getWidth() {
        return 0.0;
    }

   @Override
   public void m2879(RenderContext var1, double var2, double var4, double var6, double var8) {
        
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      boolean var8 = m2998();
      boolean var11 = super.mouseClicked(var1, var3, var5);
      if (var8) {
         if (var11) {
            label20: {
               Renderer020 var12 = this.f1262;
               if (var8) {
                  if (this.f1262 == null) {
                     break label20;
                  }

                  var12 = this.f1262;
               }

               var12.m550();
            }

            boolean var10002 = true;
            return true;
         }

         var11 = false;
      }

      return var11;
   }

   public static void m2996(boolean var0) {
      f1264 = var0;
   }

   public static boolean m2997() {
      return f1264;
   }

   public static boolean m2998() {
      boolean var0 = m2997();
      return !var0;
   }

   static {
   }
   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1268[var4] != null) {
         return var4;
      } else {
         Object var5 = f1267[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 43;
               case 1 -> 63;
               case 2 -> 35;
               case 3 -> 8;
               case 4 -> 17;
               case 5 -> 19;
               case 6 -> 1;
               case 7 -> 23;
               case 8 -> 3;
               case 9 -> 24;
               case 10 -> 51;
               case 11 -> 34;
               case 12 -> 29;
               case 13 -> 2;
               case 14 -> 59;
               case 15 -> 31;
               case 16 -> 58;
               case 17 -> 16;
               case 18 -> 15;
               case 19 -> 14;
               case 20 -> 13;
               case 21 -> 9;
               case 22 -> 6;
               case 23 -> 7;
               case 24 -> 30;
               case 25 -> 4;
               case 26 -> 33;
               case 27 -> 11;
               case 28 -> 10;
               case 29 -> 28;
               case 30 -> 0;
               case 31 -> 41;
               case 32 -> 39;
               case 33 -> 52;
               case 34 -> 53;
               case 35 -> 36;
               case 36 -> 60;
               case 37 -> 57;
               case 38 -> 18;
               case 39 -> 20;
               case 40 -> 47;
               case 41 -> 45;
               case 42 -> 49;
               case 43 -> 54;
               case 44 -> 21;
               case 45 -> 46;
               case 46 -> 5;
               case 47 -> 12;
               case 48 -> 37;
               case 49 -> 42;
               case 50 -> 27;
               case 51 -> 56;
               case 52 -> 32;
               case 53 -> 48;
               case 54 -> 62;
               case 55 -> 38;
               case 56 -> 44;
               case 57 -> 50;
               case 58 -> 61;
               case 59 -> 26;
               case 60 -> 40;
               case 61 -> 55;
               case 62 -> 25;
               default -> 22;
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

            f1268[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f1267[0] = "!kT\u0013\u0010S?cN\\wR.xC\u0006QT";
      f1267[1] = "\u001b*,D,o\u0010%=\u000bMa\u001b.9Q";
      f1267[2] = "/]rWO73Gp\u000bU##D;\u001aQ+%AaWʸ";
      f1267[3] = "Lw\u0014:d#Pm\u0016f~7@n]ɠ";
      f1267[4] = "*0>J=0*0)\u00161?0{)\b1*7\n~Qhn";
      f1267[5] = void.class;
      f1268[5] = "java/lang/Void";
      f1267[6] = "g](\u00107Z{G*L-NkDa])FmA;\u0010ǉ";
      f1267[7] = double.class;
      f1268[7] = "java/lang/Double";
      f1267[8] = "-@{#m\u001f1Zy\u007fw\u000b!Y2ns\u0003'\\h#~\u001a+\u001cid1/.Wqhq\u001e\u0000Soh";
      f1267[9] = boolean.class;
      f1268[9] = "java/lang/Boolean";
      f1267[10] = "\u0006>+/d\u0018\u001b+s\r%\u0015\u0003-";
      f1267[11] = "h\u001eJ\u0005\u0014Ot\u0004HY\u000e[d\u0007\u0003H\nSb\u0002Y\u0005Ė";
      f1267[12] = "XAAs)\u0001D[C/3\u0015TX\b>7\u001dR]Rs:\u0004^\u001dT85\u0010RA\b\u0014\t\u0011YWC/:\u0016[V\u0014\u0019";
      f1267[13] = "5 (2\u00159):*n\u000f-99a\u007f\u000b%?<;2\u0006<3|=y\t(? aN\u0002\">7=_\b\".77h";
      f1267[14] = "z/)'Vkf5+{L\u007fv6`jHwp3:'í";
      f1267[15] = int.class;
      f1268[15] = "java/lang/Integer";
      f1267[16] = "\u001a\u00123dm\u000b\u0006\b18w\u001f\u0016\u000bz)p\f\u0010N'/k\n\u001c\u000e3dL\u001b\u0001\u0014=$x";
      f1267[17] = "lJ\b_6%\u0019j\u0003P'jdr\u0010W.#\f";
      f1267[18] = "s.H)$\u0006o4Ju>\u0012\u007f7\u0001d:\u001ay2[)7\u0003urZnx \u007f=Cb26p9Bb8\u0007^=\\b";
      f1267[19] = "\u000f}n\u001f5L\u0011utPWP\u0016h";
      f1267[20] = "\u001b[JV[6\u0007AH\nA\"\u0017B\u0003\u001bE*\u0011GYVH3\u001d\u0007_\u001dG'\u0011[\u00031{&\u001aMH\nL1Fm";
      f1267[21] = "f$\u0007PM]\u0013\u0004\f_\\\u0012n\u001c\u001fXU[\u0006";
      f1267[22] = "\u0002\u0017O\fw\u0011\u001e\rMPm\u0005\u000e\u000e\u0006Ai\r\b\u000b\\\fd";
      f1267[23] = "Gs";
      f1267[24] = "89X\u001bj8t?\u001a|rku\"$E-l|5V\u001ao}|^";
      f1267[25] = "\u000e\u001f^\u0007{W\f\u0019Z\u001c\u0017V4\u001f\u0002\u0014+WZ\u001cY\bp<\u000eF\u0018Q|R\r\u001d\u0004\n\u0017";
      f1267[26] = "/^D)Fh*WF=/}yHC'CO.\u000e\u0012x\u001e\u0018(\t\u001d>\u0016f(S@0/";
      f1267[27] = "{3To\u001f\u0001)m\u001fo$ĿGa\u0015-X\u0014\u007ff\u00143\u001ee";
      f1267[28] = ",\u007f\u000eTPVm&\u000f\t9B|e.QUQq\u0019L\u0001DQ`!K\u0000Z\u0017\u0011";
      f1267[29] = "T_\u0012Qq\u0003\u0006\u0001YQJōh\u000e\u0019\u001e8\u001a\u0019N\u001f\u000b.g";
      f1267[30] = "J_TYMH\u0018\u0001\u001fYvӃv\u000f\u0019\u0001\u0013U\u0018]K\b\u0013";
      f1267[31] = "Mji\\\u001e2OlmGrȄwn-F\u0000$\u0006.+S\u0016Y";
      f1267[32] = "Is#\u0003\u000f|Lz!\u0017fi\u001fe$\r\n[H#uR]\fN$z\u0014_rN~'\u001af";
      f1267[33] = ".H8?96|\u0016s?\u0002\u0090\u0012\u0017r{|>.\u0018&o=R";
      f1267[34] = "Y\"\nX\u001a1[$\u000eCvȈc&NB\u0004'\u0012fHW\u0012Z";
      f1267[35] = "1\u001a,vV;bHjp7#l\u0013:fMY0\u0013i0^(m\u001fh77d0\b*z\u000fc1\u0016l\u000b\nh|\t'3\ribOV7\ng\u007fL(7P:qu";
      f1267[36] = "\u001e|]\u001aT|Fc\t\u000f5ƅ/>\u0016\u0001G|^~\u0010\u0014Q\u0001";
      f1267[37] = "|_\u000bdJ\b!S\nc#\u0001*BY_\u0018\u0013*P]/\u001d\u001a(D4";
      f1267[38] = "g`\fqH*5>GqsŖ[1\u0007>\u00013*q\u0001+\u0017N";
      f1267[39] = "rtK}\u0019\u0002s\"\u0017=eӏ\u001cw@.\u0017\u000fs|N\u007f\u0000";
      f1267[40] = "$M0|\u0018\u0010v\u001f9|a\u0011v\f\rV+~r\u0001/g\u0010\u0003~\n1{a";
      f1267[41] = "3A\u0018{\b\u0015a\u001fS{3\u001ebR9D\u000e@rR\u0019|\tAl\u0014h";
      f1267[42] = "Cvl.YZL\"xe5,s|-!K\nOsy5\n";
      f1267[43] = "x\u001e\u0016\u0018\u0012~z\u0018\u0012\u0003~ȰBMX\n\u0000d?AS\u0014\u001c";
      f1267[44] = "J)*\u001a<?\u0018)\u007f\u0006\u0003Բ '.D:jK,+\u0015dS";
      f1267[45] = "g^8QpB5\f1Q\t@1\u0019<Ys,g^8QpB5\f1Q\t";
      f1267[46] = "Rs6Iq<]'\"\b\u001dg\u0018%,Qtdb <Ocq\u001f,7Q\u007f\u0000";
      f1267[47] = "1\u0010}I0\u0007pI|\u0014Y\u0013a\nB@8\u0013l\n\u0002\u0010h\u0001p\u0007:\u0017i\u001f6v";
      f1267[48] = "L.k}\u007fR\u0017/||\u0004QJ7^imZJK83yBVs?2g\u0004'";
      f1267[49] = "`\bf);\\b\u000eb2WçZ\f\"3%J+L$&37f\u000fg=nIfU:3W";
      f1267[50] = "J\u001bQf\u0012rH\u001dU}~ѳp\u0010\u0012<\u0015x\rH\rh\u0000";
      f1267[51] = "\u001ab\u001cS\u000e\u0018\u001ce]_k\u0006\nf\u0017F\u0017\u0000\f\u000bPH\u0017\u0000\b5\u001cNUg";
      f1267[52] = "Vm\u0019\t5E\u000erM\u001cTãg}WS=F\\{O\f%8YjY\u0010)I\u0019lL\u0006T\u0005VlU\u0013l\u0002Wr\u0013b=I\u001foX\u001f1B\u0001s)^i\u0006\u0019(W^3[\u0017\u0011";
      f1267[53] = "\"\u0006\r3p(-R\u0019r\u001c{\u0012\fL6bx.\u0003\u0018\"#";
      f1267[54] = "|o\u001e\fDqyf\u001c\u0018-d*y\u0019\u0002AV}?H]\u0011\u0001z4\u0004\u0019\\9}5\u001a_-<vx\u0005\u0014\u0015;wfCe\u00100:y\b]\u00171$?yY\u0010?9<\u0007YJb7\u0005";
      f1267[55] = "1vH\u001f\t\u007fii\u001c\nhǎ\u00006EJ\u0016;~6\u001f\u0017\u0018\u0002";
      f1267[56] = "+7p\u0013;'y7%\u000f\u0004̴A9tM=r*2q\u001ccK}jw\r=5}0*\u0003\u0004";
      f1267[57] = "\u0012\u0018>mS~^\u001e|\nM)T9/zQ@\u0011\u00042xP1Q\u0002'n-";
      f1267[58] = "!\u0017F\u0001Ng#\u0011B\u001a\"Զ\u001bA\u0010\u001a^idG\u0017[R\f";
      f1267[59] = "\u0004*\u000bh\u0000\u007fVt@h;ɖ8zF0^bV(\u00149^\u001b";
      f1267[60] = "8Oqd\u0003xj\u0011:d8si\\Q[\u0005-y\\pc\u0002,g\u001a\u0001";
      f1267[61] = "W}%}\u0019M\u0004/c{x@\nn\u0005m\u001eC\nh2zxC\u0019#6~CE\u0001|.\u0000";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f1267[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1268[var4]);
            f1267[var4] = var5;
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
      Object var5 = f1267[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1268[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f1267[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1267[var4] = var13;
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
               var12 = m195(105300454212746L, 0L);
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
      Object var5 = f1267[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1268[var4];
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
               f1267[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(105300454212746L, 0L);
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
                     f1267[var4] = var19;
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
               var23 = m195(105300454212746L, 0L);
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
         if (var8 != 229 && var8 != 219 && var8 != 'p' && var8 != 't') {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 181) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 228) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 229) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 219) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'p') {
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

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer034.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/ʅ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public Renderer034() {}
}
