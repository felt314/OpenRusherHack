package org.rusherhack;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.font.TextHandler;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Language;
import net.minecraft.util.Pair;
import org.lwjgl.nanovg.NanoVG;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
public class Class444 implements IFontRenderer {
   public HashMap<Class341, Pair<Integer, ByteBuffer>> f7281;
   public boolean f7282;
   public static TextHandler f7283;
   public int f7284;
   public boolean f7285;
   public float f7286;
   public float f7287;
   public Renderer346 f7288;
   public static long f7289 = Class066.m4320(7177713999644332592L, 1185903238078213250L, MethodHandles.lookup().lookupClass()).m4325(126899409889125L);
   public static String[] f7290;
   public static String[] f7291;
   public static long[] f7293;
   public static Integer[] f7294;
   public static Map f7295;
   public static Object[] f7296 = new Object[134];
   public static String[] f7297 = new String[134];

   @Override
   public double getStringWidth(String var1) {
      String var7 = Formatting.strip(var1);
      long var4;
      NanoVG.nvgSave(var4 = this.f7288.m11288());
      boolean var10003 = true;
      this.f7288.m11287(true);
      NanoVG.nvgFontSize(var4, this.f7286 / 2.0F);
      NanoVG.nvgFontFaceId(var4, this.f7284);
      float var8 = NanoVG.nvgTextBounds(var4, 0.0F, 0.0F, var7, (float[])null);
      NanoVG.nvgRestore(var4);
      return var8;
   }

   @Override
   public void scissorBox(double var1, double var3, double var5, double var7) {
      this.f7288.scissorBox(var1, var3, var5, var7);
   }

   @Override
   public void begin(MatrixStack var1) {
      long var2 = f7289 ^ 17461534454403L;
      if (!((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "B", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), this,  -5930607928539670425L,  var2))).booleanValue()) {
         this.f7282 = true;
         this.f7288.begin(var1);
      }

      this.f7285 = true;
   }

   @Override
   public void setDefaultShadowState(boolean var1) {
      this.f7285 = var1;
   }

   @Override
   public void endScissor() {
      long var1 = f7289 ^ 69014371938494L;
      org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "B", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), this.f7288,  -1172849240983586983L,  var1);
   }

   @Override
   public boolean getDefaultShadowState() {
      return this.f7285;
   }

   @Override
   public double drawString(MatrixStack var1, OrderedText var2, double var3, double var5, int var7, boolean var8) {
        return 0.0;
    }

   public boolean m14089(String var1, float var2) {
      Class341 var9;
      if ((var9 = Class121.m5756(var1)) != null) {
         long var5 = this.f7288.m11288();
         if (!this.f7281.containsKey(var9)) {
            if (!this.getClass().getClassLoader().getClass().getName().startsWith("org.rusherhack")) {
            }

            ByteBuffer var7 = Class121.m5757(var9);
            int var11 = NanoVG.nvgCreateFontMem(var5, var9.m11078().getFontName(), var7, false);
            this.f7281.put(var9, new Pair(var11, var7));
         }

         this.f7284 = (Integer)this.f7281.get(var9).getLeft();
         this.f7286 = var2;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void beginScissor() {
      long var1 = f7289 ^ 40421308026064L;
      org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "B", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), this.f7288,  -7795726711976019793L,  var1);
   }

   @Override
   public double drawText(MatrixStack var1, String var2, double var3, double var5, int var7, boolean var8, double var9, double var11) {
        return 0.0;
    }

   @Override
   public void popScissorBox() {
      long var1 = f7289 ^ 139108189958316L;
      org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "B", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), this.f7288,  3432254134150947582L,  var1);
   }

   @Override
   public double drawString(MatrixStack var1, String var2, double var3, double var5, int var7, boolean var8) {
      return this.drawString(var1, (var2 != null ? Text.literal(var2) : Text.empty()).asOrderedText(), var3, var5, var7, var8);
   }

   @Override
   public void end() {
      long var1 = f7289 ^ 40781155025078L;
      if (this.f7282) {
         org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "B", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), this.f7288,  2287306905090913321L,  var1);
         this.f7282 = false;
      }
   }

   public static int m14091(int var0) {
      return (var0 & -67108864) == 0 ? var0 | 0xFF000000 : var0;
   }

   public void m14092(String var1) {
      var1 = Formatting.strip(var1);
      long var4;
      NanoVG.nvgFontSize(var4 = this.f7288.m11288(), this.f7286 / 2.0F);
      NanoVG.nvgFontFaceId(var4, this.f7284);
      NanoVG.nvgTextAlign(var4, 9);
      float[] var7 = new float[4];
      NanoVG.nvgTextBounds(var4, 0.0F, 0.0F, var1, var7);
      float var10002 = var7[3];
      boolean var10006 = true;
      this.f7287 = var10002 - var7[1];
   }

   @Override
   public double getFontHeight() {
      return this.f7286 / 2.0F;
   }

   @Override
   public MatrixStack getMatrixStack() {
      return this.f7288.getMatrixStack();
   }

   static {
    }

   public double m14093(long var1, String var3, double var4, double var6, int var8, boolean var9) {
        return 0.0;
    }

   @Override
   public boolean isBuilding() {
      return this.f7288.isBuilding();
   }

   public Class444(Renderer346 var1) {
        super();
      Class444 var6 = this;

      this.f7282 = false;
      this.f7281 = new HashMap<>();
      this.f7284 = -1;
      this.f7287 = 0.0F;
      this.f7286 = 18.0F;
      this.f7285 = true;
      this.f7288 = var1;

      try {
         var6.m14089("Verdana", 18.0F);
      } catch (Exception var4) {
         boolean var10004 = true;
         Class170.f3346.error("Failed to load default font!", var4);
      }
   }

   @Override
   public double drawText(MatrixStack var1, StringVisitable var2, double var3, double var5, int var7, boolean var8, double var9, double var11) {
        return 0.0;
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
   public static int m704(long var0, long var2) {
        return 0;
    }

   public static void m157() {
      f7296[0] = "\u007f\u0016\u001d*erc\f\u001fv\u007ffs\u000fTЬ";
      f7296[1] = "v\u0004\u0007<\u0014\u0004j\u001e\u0005`\u000e\u0010z\u001dNʺ";
      f7296[2] = double.class;
      f7297[2] = "java/lang/Double";
      f7296[3] = void.class;
      f7297[3] = "java/lang/Void";
      f7296[4] = boolean.class;
      f7297[4] = "java/lang/Boolean";
      f7296[5] = "?=p!'\u0016#'r}=\u00023$9ȉ";
      f7296[6] = int.class;
      f7297[6] = "java/lang/Integer";
      f7296[7] = "{T\u0010\u0016S\u0002gN\u0012JI\u0016wMYɌ";
      f7296[8] = "!nf\u0011x\u0007*aw^\u0015\u0007*|c";
      f7296[9] = ",s=\u0004\u000f\u000e'|,Kb\u000e'a8)N\u0003\"w9";
      f7296[10] = "\u0012t\u0004\tG&\u0019{\u0015F:>\n|\u001c\u000f";
      f7296[11] = long.class;
      f7297[11] = "java/lang/Long";
      f7296[12] = "\u0007\"@>\u001c&\u0019*Zqz2\u001e+{>B";
      f7296[13] = "[@p%\\_POaj=Q[De0";
      f7296[14] = "0\u0006F\u0007\u0002Q0\u0006Q[\u000e^*MQE\u000eK-<\u0001\u001c[\r";
      f7296[15] = float.class;
      f7297[15] = "java/lang/Float";
      f7296[16] = "\u000f\u001eJbP1\u0013\u0004H>J%\u0003\u0007\u0003Ŝ";
      f7296[17] = "\u00056\u000bX?C\u0019,\t\u0004%W\t/Bˬ";
      f7296[18] = "\u001e\u001d:\u001bO^\u001d\u0013b8\u0018D\u0011>9\u001c\u0007U\u0006";
      f7296[19] = "Y\b\u0019s\u0007#\\\u001d\u0012s\u00055X\u0015\b:E\u001aW\u0014\u0011\u000b,";
      f7296[20] = "&$\u0007!\rk-+\u0016n`o-7\"%Rr)+\u0012%";
      f7296[21] = "rM\u0014Y\u001bFyB\u0005\u0016|DlI\u0005]G";
      f7296[22] = "2*\u0000_OD/?Xx\u000eK,";
      f7296[23] = "z\u0018\u0013,\u0018#f\u0002\u0011p\u00027v\u0001Za\u0005$pD\u0017m\u0007;t\u0004\u0010,\u000f.v\u000f\u0004v\u00039{\u0019ZF\u0003%e\u000b\u0000a\u0002\u0013m\t\u0011r\u001e?z\u0004";
      f7296[24] = "\u001f?";
      f7296[25] = "\u000etD+F7\u000etSwJ8\u0014?SiJ-\u0013N\u00017\u001f";
      f7296[26] = "Z?,&\u001ewD76iyvU,;3_p";
      f7296[27] = "$@>L_^8Z<\u0010EJ(Yw\u0001AB.\\-LL[\"\u001c+\u0007CO.@w\u0004BE?\u001c\u0010$BE?`<\fIN9W+";
      f7296[28] = "\u0004q\u0003b\\G\u001ay\u0019->[\u001dd";
      f7296[29] = "c7Jo\u0002\u0012c7]3\u000e\u001dy|]-\u000e\b~\r\ntWL";
      f7296[30] = "pv|0[jll~lA~|o5h";
      f7296[31] = "\tzfv\\U\u0015`d*FA\u0005c/Ύ";
      f7296[32] = "\u0017\u001a\u0007\u0012[\u0014\u0017\u001a\u0010NW\u001b\rQ\u0010PW\u000e\n F\b\u000eL";
      f7296[33] = "\n\rf\u001aSN\n\rqF_A\u0010FqX_T\u00177'\u0006\f\u0013";
      f7296[34] = "|d?%7:|d(y;5f/(g; a^y>lb";
      f7296[35] = "\fA_<`P\fAH`l_\u0016\nH~lJ\u0011{\u001e 8\t";
      f7296[36] = "q\u0002\u0002c\u0007>q\u0002\u0015?\u000b1kI\u0015!\u000b$l8C~^o";
      f7296[37] = "!v\u0015Cab!v\u0002\u001fmm;=\u0002\u0001mx<LT_>>";
      f7296[38] = ">W,,kE>W;pgJ$\u001c;ng_#mj7>\u001f";
      f7296[39] = "pU\u0007\u0010R;pU\u0010L^4j\u001e\u0010R^!moA\n\be";
      f7296[40] = "*h9L$a6r;\u0010>u&qpĉ";
      f7296[41] = "[d9*/2G~;v5&W}pg25Q82k: ]x9*\u0011(Sq;v";
      f7296[42] = "\u000fl\u000b|g\u0012\u0013v\t }\u0006\u0003uB1y\u000e\u0005p\u0018|t\u0017\t0\u0019;;\u0010\tp\b=bI7w\u00026z\u00106w\t%]\u0006\u000ez\u00007g%\u0001m\t";
      f7296[43] = "\u001b.z$b$\u00074xxx0\u001773i\u007f#\u0011rqew6\u001d2z$Y\u001d\u001b;";
      f7296[44] = "\u001d|q=\u0000Xh\\z2\u0011\u0017\tRq9\u0015M}";
      f7296[45] = "\u0004#4\u000bS=\u00016?\u000bQ+\u0005>%B\u0011\u0004=\u0016\u0010JS%\u0019";
      f7296[46] = "SwC5,bXxRzDbVwA";
      f7296[47] = "\f#mN\u0011-\u00109o\u0012\u000b9\u0000:$ġ";
      f7296[48] = "\u0013Y[\u001b\u0014\f\u000fCYG\u000e\u0018\u001f@\u0012V\t\u000b\u0019\u0005OP\u0012\r\u0015E[\u001b(\f\u0011IYG5\u001c\b_U[\u0001";
      f7296[49] = "~\u0019|N\u0017\u0011b\u0003~\u0012\r\u0005r\u00005\u0003\n\u0016tEn\u0014\f\bbEX\u000f\t\u000bc>o\t\t\u0017";
      f7296[50] = "_bC*G/CxAv];S{\ngZ(U>WaA.Y~C*f?DdMjR";
      f7296[51] = "\u0011#r_hQ\r9p\u0003rE\u001d:;\u0012vM\u001b?a_{T\u0017\u007fg\u0014t@\u001b#;8HA\u00105p\u0003\u007fVL\u0015";
      f7296[52] = "\u0007\u0002WH/\u0004BV\u001b%δ5D^\u0017U-[\u001d]CL@KIGX\u001a-\u000e\u0002\u0006M%";
      f7296[53] = "\u000b\u0002\u001fF\u0006~\fW\u001dAll]\u000f\u0002H+|4W\u0018\u0015\u001c\u007fZ\u000e\u001bA\u0005\u0012\u000b\u0002\u001fF\u0006~\fW\u001dAl";
      f7296[54] = ",#\"Y\u0019\u0006/wvY#[(f&_Oi|'z\u0004\u0019>tq|_X\\ |;J#";
      f7296[55] = "\u0007@UyUdB\u0014\u0019\u0014ɧUC@ZsF-C@Lj:o\u0015JCw];\nB\u001a\u0014";
      f7296[56] = "\u0004\u0018bk@l\u0014\\h4*y\u001fEo-t~\u001f_kQClGOl>Tf\u0018\u001a\u0006";
      f7296[57] = "8I~\u0007\u001c\n6E&fȲgdCw\u0016\u001f\t=@#\u000fr[?\u00147\u000b\u001c\u0002<@.f";
      f7296[58] = "B5~SyAL9&2ȱ,\u001e?wBzBG<#[";
      f7296[59] = ";\u001a,lkU5\u0016t\roU4\u0016s\rf\u0005>\u000fuhj\u0006jL\u00157h\t=\u0014rcw\u0001dw";
      f7296[60] = "/g\"E?Hsi5QON=c\u0012_+L\bk8Y5(s20\u00033\u00112r$YOVrr#\u0001\"\u0013936>uErj?Y!Zz3\\";
      f7296[61] = "f#:>R{y!\u007fd<ѳ\u0003!ja_!o&?cX";
      f7296[62] = "\u0006S,r\u00189\u0013Pq=a<\bUz:\u001dU\u0006Ox>\re\u0000\u0004uranXAp>\u0019nXWiB";
      f7296[63] = "X\u0006P\u0016\b\u001aV\n\bw\fw\u0005\u0005\nH\b\u001b\u0001\u0002THfJV\bV\u0019\nNQVVw";
      f7296[64] = ";c4\u0015-$5oltӅI2u1\u0019)&%\u007fnL";
      f7296[65] = "\u0014D\u0001\\z\u000fQ\u0010M1\u007fS\u0004\u001e\u0017j~_\u0010\u0004\u0016K\u0015\u0004\u0006N\u0017RrP\u0019FN1";
      f7296[66] = "P\"a=gcQ93g[b[.ne7P\ni2=c\u0007\t;na1k\u000enlf[`R>e9&8L>>\u0002";
      f7296[67] = "\u001aWN\u007fjt\u0014[\u0016\u001et\u0019\u0005\u0001\u0007sk(@UK";
      f7296[68] = "P#dV`oNz*\u0006\u00071Xd\u0005\u000fc-S\u0018g\u00017 Sv>\u0002c9>";
      f7296[69] = "l6s5\u0013klsc<vc?wW=\u001fw)O{0\u001aa(\u000b\"?\u0011j=1eiMbR";
      f7296[70] = "m\u0017\u0002]6r1\u0019\u0015IFt\u007f\u0013&K=nf\u0006\u0011&v,mA\u0000\u001f7ly\u001b|\u001c+#g\u001f\u001bH4+>|";
      f7296[71] = "+5\u0011MR\u0005na] ԩ44cXASY:o\u0000";
      f7296[72] = "\u0017?n`A-\u0017z~i$%D~GeA')=hlG E:=n@J";
      f7296[73] = "VP\t)^P\u000b\u001cR;=F\u000b\\osV\u0013\u0001[\r'[T\u0014 ^)\u0007N\u001dB\n$@[f";
      f7296[74] = "^hr;Tr\u0002fe/$tLlP-Tnxdq&Hi232,\u0019n\u000brr8C\u0012[x0-N}Lrox${I?a*KlC`4@I-Xst'GjWc\f M*M=f}JhY\u0003e;\u0018\u007fXlr1G*2";
      f7296[75] = "qe?\u001ex.oex\u0010\u0002a\r1*\u001ca'a6\u007f\u001efM2g#\u001fh!52!\u0018\u0002";
      f7296[76] = "\"J\u00012aq5\u0016\u0005b\\s%\r\u0000\"\\!6\u0017\u000420&c\u0015\u0003X!cg\u0006\b;c.o\u0013gb1/9\u0014\u00006.'`w";
      f7296[77] = "]Zq\n_?SV)k](TH\u0013\u0017K3[XH\b\f7EW-\u0004\u000fc\u00067-\u0006\nbD[8\u0005W-=\u000e3\fS)YJ6P\u000eR\u0004L/\tJ6@IsT1nZ\u00078\u0006_7YS!k\niBP4\u0013\niTIHRJ5_L,\u0016Oi\u00027";
      f7296[78] = "C9eRqA\u001c/8\u000f\u0001Ձ z5\tbQL}`\u000be";
      f7296[79] = "cb,\u0004\u000e,hv7En||a<]nu,k%[\u000by/?f;T{ h>\\\u0000d(1]";
      f7296[80] = "XF\u0002K\t'\u0004H\u0015_y!JB2W\u001f;oL\u000e]yw\nAAL@6JU\u001b0\u0010<\b@\u0016_\u00076W\u0015|\n\u0014vRN\u001b^\u000b~\u000b-";
      f7296[81] = "P)\u0010z\u0012[S\u007f\u0010h,\u0001G;Al@3\u0013\u007f\u001c2\u0013dP)\u0010z\u0012[S\u007f\u0010h,";
      f7296[82] = "\f\nl,\u000b-P\u0004{8{+\u001e\u000e\\0\u001d1.\by::!`Q,;F1Y\u0010l/\u001cM\\\u0006\"'\u0016#\u0005\u0005v>{w\rPt4\u001c#\u0012X-W";
      f7296[83] = "ld^x\"xbh\u0006\u0019#xpR\u001bc-scV\u0006u0u\f6\u000ey/\u007f`1[{(\u00155r\u0000{7qqw\\&L";
      f7296[84] = "\u0017fMp\u0011\u0010\u0005pI.*\u001a\u000fpVy}NR&\f-*\r\u0015bW.N\u001f\u0003f\t";
      f7296[85] = "\u001a~1<@\u0012Fp&(0\u0014\bz\u0001 V\u000e<q2=0BHyr;\t\u0003\bm(GY\tJx%(N\u0003\u0015-O}]C\u0010v()BKI\u0015";
      f7296[86] = "&)~C\u0013Zz'iWc\\4-[Q\u001dWJr>T^Fs3~@\u0004:p/1^\u0000]$09\u0007c";
      f7296[87] = ")\u000e\u0002M\u001c\u000e'\u0002Z,՛crXDK\u000e\u001brXRR";
      f7296[88] = ",,\u000f^t/q`TL\u0017={:\u0015\\v0g\u001f\u0004D\u0017gwf\u000eNu3z!\u001b5,mc;\u0015M,mu\"i";
      f7296[89] = "o\u0006\u0006[\u001b<sX\u0005\u0000$7l\u0015\"^B.G\u0000\tT$gh\t\u000fSH`=\u000b\b9";
      f7296[90] = "?kMl\u001a>z?\u0001\u0001\u0014t\n-\\e\u0019n&?=:Np',E:Nf>P";
      f7296[91] = "'sB`=\u0002\"&@wX]/1k\u007f(AFq\u0016m?A>q\u0016{&=";
      f7296[92] = "jx\t8\u001d\u00035nTemǉ\tg\byP\u0010`o]g\u0015y";
      f7296[93] = "]2w\u0005\u0019}\u0018f;h\u001b*NRl\t\r7Es\u0007R\u001b}Dj`\u0006\u0004u\u001d\t";
      f7296[94] = "j\u001e~U'\u00187R%GD\u0019'\u0012\u0018\u000f/[=\u0015z[\"\u001c(n)U~\u0006!\f}X9\u0013Z_s\u0004#\u001a8\u000b~C6a";
      f7296[95] = "\u0010z\u0011u\u000e\fBq\u001ev5\u001b\u007f$\u001egV]\u0013#KeQ7@r\u0017d_[G'\u0015c5";
      f7296[96] = "K9G~\u0005\u000bHoGl;Q\\+\u0016hWc\noG4\u00074I=\u0014~^\u000bNg\u000ea;Q\\lFvWD_1\t\u000f";
      f7296[97] = "\"~IVXNg*\u0005;Z\u00191E\u0003V\u0006\u0019>\"WI\u000e@]";
      f7296[98] = "s\u0019\u0006,\u000e\u000bvL\u0004;kR\u007fP\u0015^Z_(G\u0012<\u000eRoRi";
      f7296[99] = "L<\u001azR\u0017Kf\u0000e7GY*#wMIR9x4^HW<\u00143\u000bJPV";
      f7296[100] = "\u0000\"R_NN\\,EK>H\u0012&pINR%-MKX.\\w@\u0019B\u0017\u001d7TC>\u0012\u000by\\IPK\b-E$\u0004C]/OCP\\Uv,";
      f7296[101] = ".\r3\u001bk7)\u0004*\u0000QgT\r#\u001f:}m\u00180\u0016;";
      f7296[102] = "%R.]\u001d'!\t3\u001afԹ\u001e\t(\u0012\u00164pP+F\u000fY";
      f7296[103] = "\u000b\u001f\u0015q6\u001e\u0005\u0013M\u00105\u0015\u0007r\u0016}i\u0015\b\u0015BbaLk";
      f7296[104] = "MRFub?I\t[2\u0019Șv\t@:i,\u0018PCnpA";
      f7296[105] = ">]Xwm=?F\n-Q<5QW/=\u000ed\u0016\u000bwjY?I[#j$gW[xQ";
      f7296[106] = "E\u0001\u007f2Q~\u0001Kl}1eQEg+]W\u0006\u0006;}\f\u0000DSe=T?C\t\u007f\"1<[\tw!_eX]nLH{C\\<(ZmG\u0002\u0007/\tz\u0001Pn'\\dD9";
      f7296[107] = "\u000bu,1{o\u0005ytPȣ\u0002Tqu3\u007fnS$w4\u00158\u0006)s3rl\u0019!*P";
      f7296[108] = "[\u000e:HhvDK.I\u0016fB\u0014>EMa@\u00119V\u0016\"S\u0010<Sz%\u0006\u0012;9/f]\u0012$]kc\u0001O_Z.g\u0007\u00196R{yBp";
      f7296[109] = "-\b\u0013\u001c\u0012Th\\_q\u0012\b.v\n\r\u0007\u0004\"h\u001f\u0018\u0016\u0006RP^\u0014\u0005\u00057\\]@Fe";
      f7296[110] = "\u001f!N5w\u0012C/Y!\u0007\u0014\r%{4j\u001b\u000f'~)a\u000e6'UN7L\u001fwLwv\f\u000b-0#8\u0018\u00032W-\u007f\u0017\u0013J[*}\u000f\n2L!|\u0016sq\u000b1`\u000e\u000bq\u000b'yrO-\u0000>j\u001c\u0016.T'\u0007";
      f7296[111] = "Hm(2Y;V4fb>zO2joyj&jp2NiH3sfW\u0004Hm(2Y;V4fb>";
      f7296[112] = "\"\u001bX\u0018#[1BC\u0015A\u000f=YyL%\u001d=%\u0016N{\u0007+GBC<\u0012P";
      f7296[113] = "5FbCAbp\u0012..U8+\u0006iIT\u0019-\r\u0012\u0017U4(\u0006vSPhu}+UI11\u0019oP\u0015lJDiIL(.\u0000l\u0015\u0011Ss\u0006uLU77\u0003)\u0011.i'LtMI=8D-.";
      f7296[114] = "u\u0015\u001bqP4{\u0019C\u0010ҽYl@Zn^'(\nI!";
      f7296[115] = "]\u000f\u007f=W\u0015ZZ}:=\u0002\u001e\u000fe\"F&\u0003\u001a\u007f^\u0002\u0010\u0002\u0005u2\u0005E\u0000\u0002\u001fe\u0006\u0006\u0005\u001age\u0006\u0010\u001cf";
      f7296[116] = "- lk&@ht \u0006\u00adqb%p;5H#edaI";
      f7296[117] = "m?\u001e83Ac3FYƃ,2;G:7@5nE=]EvnJ32R|1\u001fYf\u0017r5[!f\u0017d,'";
      f7296[118] = "V%Jwr[X)\u0012\u0016á6_3O{vYH9\u0010.";
      f7296[119] = "y,A5\u0010&<x\rX\u0007p~LZ9\u0004lam{?\u000f\u0017<z\u0000>\u001cphe\bg\u007f";
      f7296[120] = "h\u0006BP\u0015\u0014w\u0004\u0007\n{Ծ\r\u0007\u001c_\u000bIc^\u001f\u000b\u0012";
      f7296[121] = "[\t\u0018&m*S\\\u0006c\u0004\"D\\\u0018rx$B1\u0003\"k1]\u000e\u0006wi&8";
      f7296[122] = "  TY\u0014\u00118'\u0018\u0003n¾J Y\f\u0005P59\u001aV\tj!/\u001f\u0014\u0017\u00126$\u001e\rn";
      f7296[123] = "5fl+\"Uih{?RS'bN=\"IY=,<oI`|l(550v.=8Z'|qhR\\\"1\u007f:=K(n*P?\n3}j71M<m\u00129)\t4g}.#Va\r";
      f7296[124] = "-W\u0010V`\u0001#[H7Ͷl}\u0004E\nrU<DQP\u000eS$ZJ]bTqXM77\u0017*XRSs\u0012v\u0005)\u000eu\u000b/AMJpWr:\u0015P>\u001c TLSj\u0005M\u0001\u0012Hi\u00105\u0001\u0012^pltANUu\b0D\u0012\b\u000e";
      f7296[125] = "Lc~t\u001c@\u0014}~/'XF{rxKj\u0010?#$\u0018=Nj)/^Q[it`'";
      f7296[126] = "f1\bF\u000fR\u007frRJ5ʢ\rc\u0002GW\u0012i\u007f\\D\f-";
      f7296[127] = "P~6\u0014s'^rnuŖJ\u000b(p\u0012a2\u000b(f\u000b";
      f7296[128] = "d^3^n+|Y\u007f\u0004\u0014Ѣ\u000e\nk\u000ew:b\r>\fpPe\tg\u0005./|J=\t\u0014";
      f7296[129] = "nX6tc`5Czd\u001d|c^fmqN3\u00197\n\"pnAlf%%lF\u00065tymHj2!{j\"";
      f7296[130] = "\u0014lxQ[B\u0002{{]0Һkz{\u001aAB\nf(\u001e^";
      f7296[131] = "Rs\u001d}?WF6\u001d\u007fUMY(N&)AN2ZFi@\u00139L(0CG !/.\u001bN#N8.D\u001bI\u001d!eWN'D\"1N#";
      f7296[132] = "V\u0015Yfr\u001dX\u0019\u0001\u0007Dp\u0006\b\u0006l\u007f\t[D]~";
      f7296[133] = "\u0019bsy\u000f\u0017\u0017n+\u0018\u0000\u00013r+|\r\u001b\u001f`J#Z\u0005\u001es2#Z\u0013\u0007\u000f";
   }

   public static Class m706(long var0, long var2) {
      Class var5 = null;
      int var4 = m704(var0, var2);
      Object var6 = f7296[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f7297[var4]);
            f7296[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m707(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m708(Class var0, String var1, Class var2) {
      Field var3 = m707(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m708(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m709(long var0, long var2) {
      int var4 = m704(var0, var2);
      Object var5 = f7296[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f7297[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m706(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m707(var12, var10, var11);
            if (var13 != null) {
               f7296[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m708(var14[var15], var10, var11);
                  if (var13 != null) {
                     f7296[var4] = var13;
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
               var12 = m706(948103626032459L, 0L);
            }
         }
      }
   }

   public static Method m710(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m711(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m710(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m711(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m712(long var0, long var2) {
      int var4 = m704(var0, var2);
      Object var5 = f7296[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f7297[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m706(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m710(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f7296[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m706(948103626032459L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m711(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f7296[var4] = var19;
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
               var23 = m706(948103626032459L, 0L);
            }
         }
      }
   }

   public static MethodHandle m713(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'K' && var8 != 'O' && var8 != 'L' && var8 != 'T') {
            var11 = m712(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'B') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 196) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m709(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'K') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'O') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'L') {
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

   public static Object m714(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m713(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class444.class, "m714", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ш" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
