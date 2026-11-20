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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.Class066;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.ui.ScaledElementBase;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.interfaces.IClickable;
import org.rusherhack.core.interfaces.ITickable;
import org.rusherhack.core.interfaces.ITypeable;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;

public abstract class Renderer026 extends ScaledElementBase implements IRenderable2D, IClickable, ITypeable, ITickable {
   public boolean f1208;
   public boolean f1209;
   public Enum024 f1210;
   public static Color f1211;
   public boolean f1212;
   public Animation f1213;
   public static long f1214 = Class066.m4320(1915049401823041512L, -2449575395274742926L, MethodHandles.lookup().lookupClass()).m4325(238961710841047L);
   public static long f1215;
   public static Object[] f1216 = new Object[88];
   public static String[] f1217 = new String[88];

   public boolean m2872() {
      return this.f1212;
   }

   public boolean m1763() {
      return this.f1209;
   }

   public boolean m2874() {
      boolean var10002 = true;
      return true;
   }

   public boolean m2875() {
      boolean var10002 = true;
      return true;
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   public Enum024 m2876() {
      return this.f1210;
   }

   public double m2877() {
      return 3.0;
   }

   public Renderer026() {
    }

   public void m2878(boolean var1) {
      Setting[] var4 = Class049.m3132();
      Renderer026 var7 = this;
      if (var4 != null) {
         if (this.f1208 == var1) {
            return;
         }

         var7 = this;
         this.f1208 = var1;
      }

      boolean var10001;
      label23: {
         var10001 = var1;
         if (var4 != null) {
            if (!var1) {
               var10001 = true;
               boolean var9 = true;
               break label23;
            }

            var10001 = false;
         }

         boolean var10003 = true;
      }

      var7.f1213.setDirection(var10001).play();
   }

   public abstract void m2879(RenderContext var1, double var2, double var4, double var6, double var8);

   public abstract Color m2855();

   public void m2881(boolean var1) {
      this.f1209 = var1;
   }

   public double m2882() {
      return this.f1213.get();
   }

   public void m2883(Enum024 var1) {
      this.f1210 = var1;
   }

   public boolean m2884() {
      return false;
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      Setting[] var8 = Class049.m3132();
      boolean var10000 = this.m2872();
      if (var8 != null) {
         if (var10000) {
            boolean var10006 = true;
            this.m2878(true);
            this.m2881(true);
            return true;
         }

         this.m2878(false);
         this.m2881(false);
         var10000 = false;
      }

      return var10000;
   }

   public int m2885() {
      return f1211.getRGB();
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      return false;
   }

   @Override
   public double getX() {
      double var3 = super.getX();
      double var5 = this.getWidth() - this.m2877();
      switch (this.m2876().ordinal()) {
         case 0:
            return var3 - var5 + var5 * this.m2882();
         case 1:
            return var3 + var5 - var5 * this.m2882();
         default:
            return var3;
      }
   }

   public boolean m2886() {
      return this.f1208;
   }

   @Override
   public double getY() {
      double var3 = super.getY();
      double var5 = this.getHeight() - this.m2877();
      switch (this.m2876().ordinal()) {
         case 2:
            return var3 + var5 - var5 * this.m2882();
         case 3:
            return var3 - var5 + var5 * this.m2882();
         default:
            return var3;
      }
   }

   public void m2887(double var1, double var3, double var5, double var7, int var9, int var10, IRenderer2D var11) {
      Setting[] var14 = Class049.m3132();
      if (var14 != null) {
         if (this.m2874()) {
            double var15 = this.m2877();
            IRenderer2D var19;
            switch (this.m2876().ordinal()) {
               case 0:
                  var1 -= var15;
                  var5 += var15;
                  var19 = var11;
                  break;
               case 1:
                  var5 += var15;
                  var19 = var11;
                  break;
               case 2:
                  var7 += var15;
                  var19 = var11;
                  break;
               case 3:
                  var3 -= var15;
                  var7 += var15;
               default:
                  var19 = var11;
            }

            boolean var10008 = true;
            var19._drawRoundedRectangle(var1, var3, var5, var7, var15, true, this.m2884(), 2.0F, var9, var10);
            return;
         }

         boolean var10007 = true;
         var11._drawRectangle(var1, var3, var5, var7, true, this.m2884(), 2.0F, var9, var10);
      }
   }

   static {
   }

   @Override
   public boolean isHovered(double var1, double var3) {
        return false;
    }

   @Override
   public void tick() {
   }

   @Override
   public boolean charTyped(char var1) {
      return false;
   }
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1217[var4] != null) {
         return var4;
      } else {
         Object var5 = f1216[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 22;
               case 1 -> 30;
               case 2 -> 50;
               case 3 -> 35;
               case 4 -> 6;
               case 5 -> 1;
               case 6 -> 36;
               case 7 -> 12;
               case 8 -> 9;
               case 9 -> 53;
               case 10 -> 48;
               case 11 -> 21;
               case 12 -> 8;
               case 13 -> 15;
               case 14 -> 26;
               case 15 -> 16;
               case 16 -> 59;
               case 17 -> 23;
               case 18 -> 31;
               case 19 -> 13;
               case 20 -> 25;
               case 21 -> 5;
               case 22 -> 42;
               case 23 -> 39;
               case 24 -> 18;
               case 25 -> 14;
               case 26 -> 56;
               case 27 -> 38;
               case 28 -> 46;
               case 29 -> 3;
               case 30 -> 4;
               case 31 -> 41;
               case 32 -> 37;
               case 33 -> 24;
               case 34 -> 47;
               case 35 -> 28;
               case 36 -> 19;
               case 37 -> 52;
               case 38 -> 40;
               case 39 -> 49;
               case 40 -> 43;
               case 41 -> 29;
               case 42 -> 57;
               case 43 -> 10;
               case 44 -> 0;
               case 45 -> 51;
               case 46 -> 44;
               case 47 -> 63;
               case 48 -> 7;
               case 49 -> 58;
               case 50 -> 55;
               case 51 -> 27;
               case 52 -> 2;
               case 53 -> 11;
               case 54 -> 45;
               case 55 -> 62;
               case 56 -> 17;
               case 57 -> 54;
               case 58 -> 33;
               case 59 -> 32;
               case 60 -> 60;
               case 61 -> 34;
               case 62 -> 20;
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

            f1217[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f1216[0] = "OmT#\u001amSwV\u007f\u0000yCt\u001dn\u0004qEqG#Ǥ";
      f1216[1] = boolean.class;
      f1217[1] = "java/lang/Boolean";
      f1216[2] = "<ACJ<\u0004 [A\u0016&\u00100X\n\u0007\"\u00186]PJľ";
      f1216[3] = int.class;
      f1217[3] = "java/lang/Integer";
      f1216[4] = "\u0016>Q~C\\\n$S\"YH\u001a'\u00183]@\u001c\"B~PY\u0010bD5_M\u001c>\u0018\u0019cL\u0017(S\"T[K\b";
      f1216[5] = double.class;
      f1217[5] = "java/lang/Double";
      f1216[6] = float.class;
      f1217[6] = "java/lang/Float";
      f1216[7] = void.class;
      f1217[7] = "java/lang/Void";
      f1216[8] = "4\f{nDT(\u0016y2^@8\u00152ȴ";
      f1216[9] = "Z\u0001D+xgF\u001bFwbsV\u0018\rff{P\u001dW+ϓ";
      f1216[10] = "cDzA=SJ}f[?\u000fPivXt\u001eWzp\u001d)\u0018L||]=SkmaG3\u0013_3";
      f1216[11] = "Wy\u0002K;0Kc\u0000\u0017!$[`K\u0006%,]e\u0011K(5Q%\u0010\fg\u0000Tn\b\u0000'1zj\u0016\u0000";
      f1216[12] = "0U\u0000\u0016/m,O\u0002J5y<LI[2j:\t\u0006V4u>S\u000eW36\u001eI\u000eU<l6H\t";
      f1216[13] = ")Vm5U;4C5\u0017\u00146,E";
      f1216[14] = "sV+RGhoL)\u000e]|\u007fOb\u001fYtyJ8RTmu\n9\u0015\u001bN\u007fE \u0019QXpA!\u0019[i^E?\u0019";
      f1216[15] = "\\M\u007f[hS\\Mh\u0007d\\F\u0006h\u0019dIAw?@=\r";
      f1216[16] = ",\u0007&A\u000f\u007f0\u001d$\u001d\u0015k \u001eo\f\u0011c&\u001b5A\u001cz*[3\n\u0013n&\u0007o\t\u0012d7[\b)\u0012d7'$\u0001\u0019o1\u00103";
      f1216[17] = "{G+\u0017#S{G<K/\\a\f<U/If}n\tz\u000b";
      f1216[18] = "\u0007\u007f\u0017\u0000\u0000U\u001be\u0015\\\u001aA\u000bf^M\u001dR\r#\u0005Z\u001bL\u001b#3A\u001eO\u001aX\u0004G\u001eS";
      f1216[19] = " K\u0010\u0000v@<Q\u0012\\lT,RYMh\\*W\u0003\u0000eE&\u0017\u0005KjQ*KY|a[+\\\u0005mk[;\\\u000fZ";
      f1216[20] = ":\u000f95Y\u0002:\u000f.iU\r D.wU\u0018'5~*\u0004";
      f1216[21] = "Q\u001dj:6qM\u0007hf,e]\u0004#w+v[A~q0pW\u0001j:\u0017aJ\u001bdz#";
      f1216[22] = "=I2I[PHi9FJ\u001f5q*ACV]";
      f1216[23] = "D\u0003\u0015\b\u000b\rX\u0019\u0017T\u0011\u0019H\u001a\\E\u0015\u0011N\u001f\u0006\b\u0018\bB_\u0000C\u0017\u001cN\u0003\\o+\u001dE\u0015\u0017T\u0018\u001aG\u0014@b";
      f1216[24] = "FH( {wZR*|acJQamekLT; hr@\u0014\bbf`HV<";
      f1216[25] = "a.\u000b^\u001bQ}4\t\u0002\u0001Em7B\u0013\u0005Mk2\u0018^\bTgr\u001e\u0015\u0007@k.B9;A`8\t\u0002\fV";
      f1216[26] = "T}5>ci!]>1r&\\E-6{o4";
      f1216[27] = "'\u0003+\u000218\u000e:7\u00183d\u0014.'\u001bxu\u0013=!^%s\b;-\u001e18/*0\u0004?x\u001bt";
      f1216[28] = "]9r:bNA#pfxZQ ;w\u007fIWetzyVS?|{~\u0015w*f}~\\";
      f1216[29] = "Iw\n\u0013s.Bx\u001b\\\u0012 Is\u001f\u0006";
      f1216[30] = "T#:*!\u0007@f;`\u001d\u0003Pd\u00111t\bPt\u0015;q\u0010]\u0018q8p\n\u0003ev$b\r=";
      f1216[31] = "|R]'\u001cw(\u0004KWÏI/WF0\u0002;-\rDl}ug\u0007R;\u0013)g]UW";
      f1216[32] = "_q&:\u000e\u001f\u000b'0Jʦ!\u0005}&*\u001dGX&02";
      f1216[33] = "\u001c\u0010B_cAHFT/y\u007fO\u0015YH}\rMO[\u0014";
      f1216[34] = "c\u0006/\u001f\u001457P9o\u001e\u000b4\u0014)\u0005Hdk\u001bw\u000fu6t\u0006,R\u001ai{X&o";
      f1216[35] = "$e\u0011\u0002\u0002-.q\u0011\u00028\u0017ra\u0016\u0013b'c}\u0013\u0001T\u001asp\u0003\u0005^/zv\u007fWZ-x%\u0002PF?\u007f\u001bD\u000eU& fC\u0012G!\u001e \u001d\u0001^~c'\u0001\u0013Y@%y\u0012\n\u0006=\"e\u0000\r8{|v\u0019RE|`d\u001el\u0001*l|\u0000\u001e\u0003pn \u007fUR2yd\rW\b0%\u001bC]S\u007fl+\u001d\f\u00020\u001e!\u0011RR$q~\r\\\u0002@$uA\u0006\\/{iOV8|o!\u0019\u0000V o{\u001el";
      f1216[36] = "e9)r\u000731o?\u0002ļ\r44-dXp3(?cf";
      f1216[37] = "G7b3)\u001f\u0013atCŢ!\u00142y$7S\u0016h{xH";
      f1216[38] = "_\u007fn\u0007qu\u0002$x\u001f\u0003|\u0002`\u0007\\a~\t\"z[}l\u000e\u001c";
      f1216[39] = "s\u001c[\u0016V\"\u007f\r\bJ6?w\u001cT\u0015Z\r Z\u0005J\rZ&\u0011\u000e\u0014Z4z\u0011T\u00136";
      f1216[40] = "!p#G=:u&57\u009e\u0004q&+\r$k*spP\\";
      f1216[41] = "\u001d\tz\u000eOZ\u0011Db\u0010#J\f\u0012}\n[_\f\u0016}\u001aR6L\u0015%\u001bGY\u0013\t+K#\nG\u0010$\u0003\u0013T\u0016Akq\u0019XH\u0011\u007f\u001eFDFA\u001b";
      f1216[42] = "0\tSm7#d_E\u001d\u000e\u001da\u0004W{h`f\u0018E|V";
      f1216[43] = "\nA5[7\u0003\u000bF;VK\fV^\u0004f\u0001c\u0001L`C/\f^Pn\u0013K";
      f1216[44] = "t<$-\\> j2]ρ\u0000%1 ;\u0003}\"-2<=;|>+c@<`,,]\u0006bs5s \u0001~a2Mf_mxm0aC\u007f\u007fSw3\u0003jz<(/\r:\u001ei#cWdq6?m\u0007\u0000$-#3\u0007m.9#3=<oi+1S`o3,]";
      f1216[45] = "N@J\u0016\u0006N\u0015\u0015\u0011K~ktC\u0012MDY\u001b\u0018G\u0016\u0019";
      f1216[46] = "1\u0015ck\u0002\u0005eCu\u001bї;a\u00144q\u0007T>\b:!c";
      f1216[47] = ":\u0004\u001e\u0014u\u001d1\u0000\u0012JNԀW\u001bS\u001fv_%\u001c\u001fK0a";
      f1216[48] = "\u000f\u0000_K\u0005y\u0003\u0011\f\u0017ed\u000b\u0000PH\tV\\F\u0001\u0017X\u0001ZM[\u0010\u00171\u0004\u001c\n_e=W\u0017\u000f]Uc\u0006F@/Y0\rCB\u001f\u0007a\\\f0\u0013\u0014;\u0000\u0010^O\u0014a\u0007|";
      f1216[49] = "?;4?\u0018Cdnob`K\u007fn4c\tH\u00058;;\nHjg'5Z,";
      f1216[50] = "K\u0017t\u001c0o\u001fAbl0*a\u001fc\u0001+<Mx&\u000e<7\u001f\u0005!\u0012.0!C\u007f\u00017o\\Dc\u00130Q\u0018\u0012o\u000b.#\u001aHmWQ";
      f1216[51] = "GK\u000bA\u001e[\u0013\u001d\u001d1Гe\u0014N\u0010V\u0000\u0017\u0016\u0014\u0012\n\u007fY\\\u001e\u0004]\u0011\u0005\\D\u00031";
      f1216[52] = "\u0017L(TFM\u001b]{\b&P\u0013L'WJbD\nv\b\u001a5ER*V\u0018HBN8Q&\u000e\u001c]!\u000e[\t\u0000O&0\u001dW\u0013VyM\u001aK\u0001QG\fW\u000f\u0018\\)PWU\u001f0";
      f1216[53] = "M0g\u0012\u0011M\u0019fqbĺs\u001e5|\u0005\u000f\u0001\u001co~Yp";
      f1216[54] = "5\u001dI$Et;\u001b\u0003a#/1bUqB*%\u001aV\u007fOu";
      f1216[55] = "`z\u0005OO?#8\u001aF5ɼ^g\u001a\u0017\u0005* ?WOJDbwP@Y*>w\nG5";
      f1216[56] = "=\u000e/\u0006\u0003\u00036\n#X8̀P\u0011b\r\u0000A\"\u0016.YF\u007fl\u0001d\u0005T\u00110\u0001>\u00028";
      f1216[57] = "kB$DdV=\u001fj]ZLm\u000f;Q6~<Nc\fZ\u0013nM1R5LrCa6";
      f1216[58] = "ocx\u001ae\u001828n\u0002\u0017\u0006;i`z'\u001d6`c\u001czF x\u0011";
      f1216[59] = "\"U\u0002zaQ.\u0018\rd\u0007\u0010\u007f\u00156\u0000<\t\u007f\u000fX};\u0015m\bf<vQt\u0005\b`v\u000bsi";
      f1216[60] = "X\u0016)?r)R\u0002)?H.\u000f\u0007&7H-\u001e\u0007#10!\u000fT\u007fQ\"!\u001b\u0002;*q5[\u0005Gm9~\u0004\u0004)19$\u0003h";
      f1216[61] = "#[nI{.)OnIA\u0014u_iX\u001b.rYiA.'t%;E,%'X<Y>\"\u0019\u001ebJ'}d\u0019~X C\"GmA\u007f>%[\u007fFAx{Hf\u0019<\u007fgZa'x)kB\u007fUzsi\u001e\u0000\u001e+1~Zr\u001cq3\"%<\u0016*|k\u0015bG{3\u0019\u001fn\u0019+'v@r\u0017{C#K>M%,|W0\u001dA\u007fh\u001ffK/#hEa'";
      f1216[62] = "H\b~;?(DEq%Yi\u0015HKAbp\u0015R$<el\u0007U\u001a}((\u001eXt!(r\u00194";
      f1216[63] = "\u001fF}\u0011\u000eZ\u0013W.MnG\u001bFr\u0012\u0002uL\u0000#M_\"JK(\u0013\u0002L\u0016Kr\u0014n";
      f1216[64] = " k[PGL,&TN!\u0019}+`KM\npW\u0004HL\u0010.*\u0003T^\u0017\u0010";
      f1216[65] = "\u0004'EF\"\u0007PqS6Ҭ9_+GD?Y^,II";
      f1216[66] = "]\u0007bQ>H\u000bZ,H\u0000R[J}Dl`\n\n-\u001d\u0000\rX\bwGoRD\u0006'#";
      f1216[67] = "B\u0013H^x\u001d\u0016E^.ȭ#\u0011\u0016SIfQ\u0013LQ\u0015";
      f1216[68] = "n;-?l\u0001:m;OÄ?=>6(rM?d4t\r";
      f1216[69] = "|5Z\u0003|\u001b(cLsϤ%/0A\u0014bW-jCH\u001d";
      f1216[70] = "!|MA=l|'[YOq|ch@5gzcEF)\n(uVF0x*/T\u001aO:rvDS)g)`\\!";
      f1216[71] = "\u001cS3{1;_\u0011,rK\u001c\"N,#{.\\\u0016a{4@";
      f1216[72] = "G\u0003vE\u0018\u001b\u0014_%V{\u001bLI'=\u0012\u001fDV*E\u001e\u000e\u0017\nJ";
      f1216[73] = "\r+Z[\"\u0004Y}L+,W\u001b\u00153\u0010!W\u0001zN\u0017=E\u0006D";
      f1216[74] = "s\u0015\t\u0005KKp\u001b\u0004Z4Vs\u0000\b\u0002Xd$FVU\u000f3uM\u0017\u0017\nL#\u0010Y\u000e4";
      f1216[75] = "JY>@A\\F\u00141^'\t\u0017\u0019\u001aWF\t\u001a\u0019Z\u0001E\u000b\u001c['\u0006Y\u0019\u001be";
      f1216[76] = "[.\u001b3G\u001fOk\u001ay{\u001b_i0(\u0012\u0010_y+.\u001a\u001bRikx\u0019\u0019T+\u0016\u007f\u0005\u000bS\u0015";
      f1216[77] = "_\u0018eJ6l\u000bNs:ǔRYF0B4*\n\u001acQWiW\u001aj\u0004*nK\bm:l0X\u00112Gk,J\u0016\f\u00015?SIq\u0006)-Tw7X:4\u000b\n0D(35K}\u00001>[\u0017}Z6R";
      f1216[78] = "\u001eoL\bw\u0015\n*MBK\u0011\u001a(g\u0013\"\u001a\u001aT\u0007\u001a&\u0018I)\u0000\u00064\u001fw";
      f1216[79] = "[\u007f\u0019^?p\u0004~AA\u0004yY`>Abjnq\u0016JilYfpLao^`\u000b\u001fu/Y\u001c";
      f1216[80] = "E\u0012^\u0004\"T\u0011DHtлj\u0016\u0017E\u0013<\u0018\u0014MGO";
      f1216[81] = "'^F!iG{VSl\u000f\u0017!S,,~@!SBp~\u001a&?";
      f1216[82] = " a=\u001fg\u0016t7+oʸ(p75U~G+bn\b";
      f1216[83] = "R\u001d\u0001N\u000bv\u000e\u0015\u0014\u0003m*I6\u0016\u001e\t'S\u001a\u0004\u007fT!@\u001b\u0014\rV{BGk";
      f1216[84] = "YUw9h:\r\u0003aIɄ\u0004\u0002Yu;ud\u0003^{6\t";
      f1216[85] = "6)t<IZb\u007fbLG\t \u0016\u001dwJ\t:x`pV\u001b=F";
      f1216[86] = "W \u0015$.\u0000\b!M;\u0015\tU?&1s\nU9\u0011&\u0015\\F-\u0012fxVR-\u0012\\";
      f1216[87] = "h\u0010+\u0010 Ot\u001djVKlK5[f\u0011(h\u0010+\u0010 Ot\u001djV";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f1216[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1217[var4]);
            f1216[var4] = var5;
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
      Object var5 = f1216[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1217[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f1216[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1216[var4] = var13;
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
               var12 = m123(2055546404336975L, 0L);
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
      Object var5 = f1216[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1217[var4];
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
               f1216[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(2055546404336975L, 0L);
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
                     f1216[var4] = var19;
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
               var23 = m123(2055546404336975L, 0L);
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
         if (var8 != 'm' && var8 != 252 && var8 != 239 && var8 != 'E') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 255) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 199) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'm') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 252) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 239) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer026.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/ƌ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
