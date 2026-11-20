package org.rusherhack;

import java.awt.Color;
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
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.utils.ColorUtils;

public class Class335 extends Class517 {
   public Animation f5348;
   public boolean f5349;
   public static long f5350 = Class066.m4320(-198496306333974441L, 2374237715042013761L, MethodHandles.lookup().lookupClass()).m4325(191136488383953L);
   public static long f5351;
   public static long[] f5352;
   public static Long[] f5353;
   public static Map f5354;
   public static Object[] f5355 = new Object[79];
   public static String[] f5356 = new String[79];

   public String[] m10945() {
      Setting var5;
      if ((var5 = super.f8251) instanceof EnumSetting) {
         EnumSetting var10000 = (EnumSetting)var5;
         boolean var10003 = true;
         return var10000.getOptions(true);
      } else {
         Setting var6 = super.f8251;
         return super.f8251 instanceof StringSetting ? ((StringSetting)var6).getOptions().toArray(new String[0]) : null;
      }
   }

   @Override
   public boolean m5207() {
      return false;
   }

   @Override
   public String m4902() {
      return super.f8251.getDisplayValue();
   }

   public Class335(PanelBase<?> var1, Renderer107 var2, EnumSetting<?> var3) {
      super(var1, var2, var3);
      this.f5349 = false;
      this.f5348 = new Animation(Easing.BEZIER_CURVE, 100L);
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   @Override
   public int m9517(double var1, double var3) {
        return 0;
    }

   public double m10949() {
      return super.getHeight(false);
   }

   public boolean m10950(double var1, double var3) {
      long var5 = f5350 ^ 132933543646233L;
      if (var1 >= this.m5381()
         && var1 <= this.m5381() + ((java.lang.Double)(org.rusherhack.ZkmDispatch.invoke(m3936(java.lang.invoke.MethodHandles.lookup(), "r", java.lang.invoke.MethodType.methodType(double.class, java.lang.Object.class, long.class, long.class)), this,  -1086387218336853831L,  var5))).doubleValue()
         && var3 >= this.m5385()
         && var3 <= this.m5385() + this.m10949()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      Class335 var9 = this;
      if (this.m5378(var1, var3)) {
         if (this.m10950(var1, var3)) {
            switch (var5) {
               case 0:
                  if (super.f8251 instanceof EnumSetting) {
                     ((EnumSetting)super.f8251).increment();
                     boolean var23 = true;
                     return true;
                  }
               case 1:
                  if (super.f8251 instanceof EnumSetting) {
                     ((EnumSetting)super.f8251).decrement();
                     boolean var22 = true;
                     return true;
                  }
               default:
                  if (var5 <= 2) {
                     boolean var10001;
                     if (!this.f5349) {
                        var10001 = true;
                        boolean var10003 = true;
                     } else {
                        var10001 = false;
                        boolean var25 = true;
                     }

                     this.f5349 = var10001;
                     if (!this.f5349) {
                        var10001 = true;
                        boolean var26 = true;
                     } else {
                        var10001 = false;
                        boolean var27 = true;
                     }

                     this.f5348.setDirection(var10001).play();
                     boolean var10002 = true;
                     return true;
                  }
            }
         } else if (this.f5349) {
            String[] var17 = this.m10945();
            double var10 = this.getPanel().getFontRenderer().getFontHeight() + 1.0;
            double var12 = 13.0;
            String[] var18;
            int var14 = (var18 = var17).length;

            int var15;
            for (int var19 = var15 = 0; var19 < var14; var19 = var15) {
               String var16 = var18[var15];
               if (var3 >= var9.m5385() + var12 && var3 <= var9.m5385() + var12 + var10) {
                  if (var9.f8251 instanceof EnumSetting var20) {
                     boolean var10004 = true;
                     var20.parseValue(var16, true);
                  } else {
                     var9.f8251.setValue(var16);
                  }

                  boolean var24 = true;
                  return true;
               }

               var15++;
               var12 += var10;
            }
         }
      }

      return var9.mouseClicked(var1, var3, var5);
   }

   public Class335(PanelBase<?> var1, Renderer107 var2, StringSetting var3) {
      super(var1, var2, var3);
      this.f5349 = false;
      this.f5348 = new Animation(Easing.BEZIER_CURVE, 100L);
   }

   @Override
   public double getHeight(boolean var1) {
      int var11 = Class253.m9154();
      double var5 = 0.0;
      int var4 = var11;
      Class335 var12 = this;
      if (var4 == 0) {
         if (!this.f5349) {
            if (var4 != 0) {
               return super.getHeight(var1) + var5;
            }

            if (!this.f5348.isPlaying()) {
               return super.getHeight(var1) + var5;
            }
         }

         var12 = this;
      }

      double var7 = var12.getPanel().getFontRenderer().getFontHeight() + 1.0;
      var5 = (var12.m10945().length * var7 + 3.0) * this.f5348.get();
      return super.getHeight(var1) + var5;
   }

   static {
   }
   public static int m1730(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5356[var4] != null) {
         return var4;
      } else {
         Object var5 = f5355[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 51;
               case 1 -> 37;
               case 2 -> 44;
               case 3 -> 57;
               case 4 -> 24;
               case 5 -> 23;
               case 6 -> 41;
               case 7 -> 58;
               case 8 -> 22;
               case 9 -> 53;
               case 10 -> 38;
               case 11 -> 33;
               case 12 -> 10;
               case 13 -> 42;
               case 14 -> 8;
               case 15 -> 31;
               case 16 -> 4;
               case 17 -> 21;
               case 18 -> 6;
               case 19 -> 29;
               case 20 -> 14;
               case 21 -> 52;
               case 22 -> 7;
               case 23 -> 3;
               case 24 -> 34;
               case 25 -> 60;
               case 26 -> 54;
               case 27 -> 55;
               case 28 -> 46;
               case 29 -> 16;
               case 30 -> 11;
               case 31 -> 13;
               case 32 -> 17;
               case 33 -> 30;
               case 34 -> 48;
               case 35 -> 32;
               case 36 -> 45;
               case 37 -> 26;
               case 38 -> 62;
               case 39 -> 15;
               case 40 -> 25;
               case 41 -> 35;
               case 42 -> 2;
               case 43 -> 20;
               case 44 -> 0;
               case 45 -> 49;
               case 46 -> 1;
               case 47 -> 63;
               case 48 -> 39;
               case 49 -> 59;
               case 50 -> 28;
               case 51 -> 47;
               case 52 -> 40;
               case 53 -> 27;
               case 54 -> 18;
               case 55 -> 56;
               case 56 -> 61;
               case 57 -> 50;
               case 58 -> 9;
               case 59 -> 12;
               case 60 -> 36;
               case 61 -> 5;
               case 62 -> 43;
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

            f5356[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m3938() {
      f5355[0] = ":{\f6U\r&a\u000ejO\u00196bEʊ";
      f5355[1] = double.class;
      f5356[1] = "java/lang/Double";
      f5355[2] = boolean.class;
      f5356[2] = "java/lang/Boolean";
      f5355[3] = "\fA_b\u0001\t\u0011T\u0007@@\u0004\tR";
      f5355[4] = "\\U.\u0003 -@O,_:9PLgȫ";
      f5355[5] = int.class;
      f5356[5] = "java/lang/Integer";
      f5355[6] = "FQ\u0004w3xZK\u0006+)lJHMȔ";
      f5355[7] = "\u001d:F\u0010Y\u000e\u0001 DLC\u001a\u0011#\u000fɊ";
      f5355[8] = "\u0010whu{y\fmj)am\u001cn!Ϩ";
      f5355[9] = "=D\u001f\ng6!^\u001dV}\"1]VGy*7X\f\nt3;\u0018\rM;7:S\u0015A;\u0017:S\u0015AW\"!S";
      f5355[10] = "H~-{\u0004nTd/'\u001ezDgd6\u0019iB\"?!\u001fwT\"\t:\u001atUY><\u001ah";
      f5355[11] = "J8\u0010Q4\tV\"\u0012\r.\u001dF!Y\u001c)\u000e@d\u0004\u001a2\bL$\u0010Q\u0015\bW#\u0019\u0018\u0015\u0019Q>\u001e\u0011!";
      f5355[12] = "c^T@\u000e]}VN\u000flAgTGEhIzWqDT";
      f5355[13] = "~8\u0017k\u000eP\u000b\u0018\u001cd\u001f\u001fj\u0016\u0017o\u001bE\u001e";
      f5355[14] = "\u0002\u0018d\u0003\b\"w8o\f\u0019m\u00166d\u0007\u001d7b";
      f5355[15] = "t>v1\u0010Rh$tm\nFx'?ҭ";
      f5355[16] = "1hqKU1-rs\u0017O%=q8\u0006H6;4e\u0000S07tqKt!*n\u007f\u000b@";
      f5355[17] = "bX7\u0014AS~B5H[GnA~Y\\Th\u0004#_GRdD7\u0014vHxG\u0003_GRdD7";
      f5355[18] = "\u0012.Yq^\u0016g\u000eR~OY\u001a\u0016AyF\u0010r";
      f5355[19] = "W=\u0005\u001e\u0001fK'\u0007B\u001br[$LÂ";
      f5355[20] = "W%rY\r)K?p\u0005\u0017=[<;\u0014\u0010.]yt\u0019\u00161Y#|\u0018\u0011r}6f\u001e\u0011;";
      f5355[21] = "\f\u0017B%+!\u0010\r@y15\u0000\u000e\u000bh6&\u0006KDe09\u0002\u0011Ld7z\"\u000bLf8 \n\nK";
      f5355[22] = "(\u00163pW_4\f1,MK$\u000fz=IC\"\n pDZ.J!7\u000bZ&\n12\u000bz&\n12gK4\u0001";
      f5355[23] = "VgG%W\u0019J}EyM\rZ~\u000ehI\u0005\\{T%D\u001cP;RnK\b\\g\u000emJ\u0002M;iMJ\u0002MGEeA\tKpR";
      f5355[24] = "_p-;nhT\u007f<t\u000ff_t8.";
      f5355[25] = void.class;
      f5356[25] = "java/lang/Void";
      f5355[26] = "a$c*m j+re\u00108y,{,";
      f5355[27] = "\u0013bi\u000eO \u0018mxA$\"\fn";
      f5355[28] = "g\b\u0016|\u0012\u001a\u0012(\u001ds\u0003Uo0\u000et\n\u001c\u0007";
      f5355[29] = "tT\u001c]PFhN\u001e\u0001JRxMU\u0010NZ~H\u000f]CCr\b\u000e\u001a\fCzH\u001e\u001f\fczH\u001e\u001fkG~K9\u0012QV";
      f5355[30] = "\u0000\u00122F\u0007\u001a\u001c\b0\u001a\u001d\u000e\f\u000b{\u000b\u0019\u0006\n\u000e!F\u0014\u001f\u0006N'\r\u001b\u000b\n\u0012{!'\n\u0001\u00040\u001a\u0010\u001d]$";
      f5355[31] = "2z<aMf.`>=Wr>cu,Sz8f/a^c4&.&\u0011V1m6*Qg\u001fi(*";
      f5355[32] = "\u0010iI\\S'\fsK\u0000I3\u001cp\u0000\u0011M;\u001auZ\\@\"\u00165\\\u0017O6\u001ai\u0000;r1\u0016h]\u001dS3\u001dwK";
      f5355[33] = "km\u0007\\\\Tw6\u0003L!Qb`L#LM<v@^P\u00168f=";
      f5355[34] = "lfS\u0002\f6s,Y\tg4oav\u000f\u0001'Xp^\u0004\n!og8\u0007X)9,F\u0016[?k\u001d";
      f5355[35] = "cX\u0018C[\u000e|\u0012\u0012H0\f`_)DV\u000f`Y\u001eS0\u0000|]\u0003XP\rm^\u0010)";
      f5355[36] = "de+{\tPuf=)8Bq3&\u001bDTj<6@YGpbd<D\u001e`#Y0\u0006Mp9#xQH\u000b*g#CMqb0&8\u0015z0\",\u0006\u0016j6\"@H\u0010h!::\u0000GmZ";
      f5355[37] = "M\u0012.\r\u0015j\u0018\u0011|[+շv\u0014b\\P{H\u0017rZP\u0017";
      f5355[38] = "\u000b[)\u000b/\u0011\rY*lȕrR\u0018)Q}\u0015W\u001ay\u0017";
      f5355[39] = "z_g\u0019@\u001b/\\5O~ȿAY+H\u0005\n\u007fZ;N\u0005f";
      f5355[40] = "(u23\t\u007f.w1Tΰ\u001c8p;/Wfp'>TD\"+5;.\fu.Nc%^g$p`5XgH";
      f5355[41] = "-b\u001ej\u001b\nz8B:p~\r\ndK*c\u000b\u0005\u007fX=4-b\u001ej\u001b\nz8B:";
      f5355[42] = "N.\n`H\u0017S:\u0019:9\u0001G6&\u0001IPI1\u0014{\u0001\u0007LJ";
      f5355[43] = "t$lKXrs?e@'ψH{jNGs6|qGL";
      f5355[44] = "j\"\u001c/pxl \u001fH\u038b\u001bz'\u00153.a2p\u0010H";
      f5355[45] = "g%5\u0005@)eu:\nqmi.-\u0017\u0016lH(&l\u0001(a45\u0016I\u007fdO&R\u0012ma5n\u0005\u0017\u0016rq5\u0017\u0012l:&0l\u0001(a45\u0016I\u007fdO6\u000f\u001adp>;\u001e\rv\u0002";
      f5355[46] = "\u0000N/n\u000fW\u0011M9<>F\u0002\r\u00132XU/\u001c<:^Uo\u0001c6EJ\u0015I43>";
      f5355[47] = "MJI\u0016\u000b\rKHJqղnL\u0018XI\u000b\u0012QAH\b6";
      f5355[48] = "#\u001e)\u0017|\u0014?E-\u0007\u0001\u0006#\u0006\u0013\u0018?\n5\u0019iPh\u000fN";
      f5355[49] = "t`W{%TrbT\u001cwZh\u001bP}wWh[\u0004dr\n{<\u0001f\"L\u0014+\u0003\u007fcTncTz\u0018";
      f5355[50] = "``\u001aZw'n#U\u000b\u001d8caP\u000bC)nfFf|)q#\u0016\u001aapab+_e*7tLZgzq\u001bI\fd>wgQ\u0005z&\n";
      f5355[51] = "$\u000f\u00185\"\u00148T\u001c%_\u0012$\u0017n+%\u0004\"\u0017C-9ip\u0013Hw0\u000eu\u0011\u00181_\u0004-Q]7\"\u0018vUMJ";
      f5355[52] = " yr@x\u0004.:=\u0011\u0012\u000f'i9\u0011w\u000e,~C\u001cq\b8p2\u0011`\u001f*\u0002";
      f5355[53] = "\bx6.W)\u000e829j)Pug8\u0012/R`v/!/RnpBQ9\\rf|R)Zr\ny\u001b\"Me4z\u000b$M\tz|\t3Us2+\fH\rx`9\u0006v\u000ehf9j";
      f5355[54] = "(\t\rB\u0010`}Y\u0001\u0004oe\u007fO%p%\n)B\u0015D\u00034*R\u0013Do";
      f5355[55] = "',\u00067Z\u000e%{\u0016)>бK:G.E\u00101r\u0010!>";
      f5355[56] = "f[x)xth\u00187x\u0012|a\\\u000emnrkF2\u0015+kf\u001d&r.i6[IwqqeJrv*q< ";
      f5355[57] = "3*z;\t\u0001&4q 0\u001042_)T\u00164Nn>\\\u0007#,l\u007fZ\u0015Y.b+B\u0019(#s<Pk";
      f5355[58] = "sj\u000e=\t`uh\rZŦ\u0003co\u0007!Wy+8\u0002ZD=p*\u0007 \fjuQ]\"^>|6X \u000ex\u0013";
      f5355[59] = "|\u000e\tjy\u0011)^\u0005,\u0006\u0017/N\u0018z|{|\u000e\tjy\u0011)^\u0005,\u0006";
      f5355[60] = "-*] $I/}M>@ʉA<\u001c3;W;tK6@";
      f5355[61] = "L\u0010j\"\u001b{PKn2fgZ,44\u0017gG\u001bPd\u001el\u001c\u001b7a\u001c<Zt";
      f5355[62] = "G\u0016b\u0019L$\u0013\u0014f\u001e+!\u0015\u0011\u001e\bW/\u001f\u000b\"p\u001b<G\u0001a\u0016[3\u0019\u0013Y";
      f5355[63] = "@\u0013\u0010>\u0007)\u0000\u001cN,?3\u0017(U(V>pPQ3G=\u000bQ\u00159@OA\u001fN*M4@[D-?";
      f5355[64] = "R,D\u0018xlP{T\u0006\u001c~S6d\tpm^JKV\u007fj]0\u0003\u0001z\u0011";
      f5355[65] = "#!\u0000#u=6?\u000b8L8$9797/-,\n\u0006%34({9%,qx\u0007$|<0E";
      f5355[66] = " i\u001f\rw\u000b=}\fW\u0006\u001d)q\"\u0001g\u001d$qb\u001c8\u0011?n\u0018To\u0014D";
      f5355[67] = "\u0004eO\u00013%\u0002gLfgFX!]\u0000p6\u000e1\u001e\u000f\u000ez\u001b&C\u0018~,\u000beLf";
      f5355[68] = "\u000e`6l\u0018a\f09c)&\fr\u000enH%\u0010m/ON.kj6n[,\u001ag'yI^";
      f5355[69] = "(\u0019\u0007\u0012jbx\\\nF\u001bԅ\u0015]\u001fA`l+^\u000fG`";
      f5355[70] = "BWM\u0014=s@\u0000]\nYǝ.A\f\u0007\"mT\t[\u0002Y~\u0010RI\u0007#6GW2]!d\u0013^UX#4U1";
      f5355[71] = "\u000bgX\u0007As\u0016>HF|b\u0013sJ[\u0007\u000f\u0005pOS\u0006m\u00071IA|6\u0012d\u001eP\u001b3\u00104X?";
      f5355[72] = "\u001e2H5WHX;S'3DM+h#RNI-A\u0012TOG-0c\tY](Z6YU\u001bW";
      f5355[73] = "n\u001c\u000b\bgxh\u001e\boԝ\u001bcC[\u0010'f\u007f\u0018_\u0000";
      f5355[74] = "ea/\bP\u001bcc,o՟xg9'\u0006\u0007Cfb'_m";
      f5355[75] = "%n\u001bEsG(\u007f\u0018V\u0002K<v\u001aooL:v\u0003ZfJFo[VyD<'\fS\u0002Wx|\u001eVx\u001f/yeE<D=|\u001f\rkAFo[VyD<'\fS\u0002\u001c7u\u001eY<\u001f's\u001e5bD-m\u0017DoU:\u007fe";
      f5355[76] = "*]Dc\u001fV$\u001e\u000b2uP&M\u000f2\u0010\\&Zu?\u0016Z2T\u00042\u0007M &";
      f5355[77] = "Mqzq5H\u00130l1_KC6[g9IJJmu4NE'r?>E.";
      f5355[78] = "v1 wg[{} 9\tѳ\u001f&zrrRu3dyi";
   }

   public static Class m1732(long var0, long var2) {
      Class var5 = null;
      int var4 = m1730(var0, var2);
      Object var6 = f5355[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5356[var4]);
            f5355[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m1733(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m1734(Class var0, String var1, Class var2) {
      Field var3 = m1733(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m1734(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m1735(long var0, long var2) {
      int var4 = m1730(var0, var2);
      Object var5 = f5355[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5356[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m1732(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m1732(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m1733(var12, var10, var11);
            if (var13 != null) {
               f5355[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m1734(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5355[var4] = var13;
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
               var12 = m1732(1713462411291547L, 0L);
            }
         }
      }
   }

   public static Method m1736(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m1737(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m1736(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m1737(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m1738(long var0, long var2) {
      int var4 = m1730(var0, var2);
      Object var5 = f5355[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5356[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m1732(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m1732(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m1736(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f5355[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m1732(1713462411291547L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m1737(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f5355[var4] = var19;
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
               var23 = m1732(1713462411291547L, 0L);
            }
         }
      }
   }

   public static MethodHandle m1739(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 195 && var8 != 'i' && var8 != 255 && var8 != 254) {
            var11 = m1738(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'r') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 's') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m1735(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 195) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'i') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 255) {
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

   public static Object m1740(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m1739(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m3936(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class335.class, "m1740", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ʒ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
