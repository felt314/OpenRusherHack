package org.rusherhack;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.VertexSorter;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.util.Window;
import org.joml.Matrix4f;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.screen.EventResizeDisplay;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.clear;
public class Class349 extends SimpleFramebuffer {
   public int f5675;
   public long f5676;
   public static long f5677 = Class066.m4320(-4958740378180263758L, 5633892248034816020L, MethodHandles.lookup().lookupClass()).m4325(33838345022882L);
   public static long[] f5678;
   public static Integer[] f5679;
   public static Object[] f5681 = new Object[54];
   public static String[] f5682 = new String[54];

   public void m11397() {
      this.clear(false);
      this.beginWrite(false);
   }

   public void m11398(int var1) {
      this.f5675 = var1;
   }

   public Class349(boolean var1) {
        super(Globals.mc.getFramebuffer().textureWidth, Globals.mc.getFramebuffer().textureHeight, true, MinecraftClient.IS_SYSTEM_MAC);
      boolean var10011 = true;

      this.f5675 = 60;
      this.f5676 = 0L;
      this.setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      Class170.f3362.subscribe(this);
   }

   public boolean m6294() {
      if (System.currentTimeMillis() - this.f5676 >= 1000 / this.f5675) {
         this.f5676 = System.currentTimeMillis();
         return true;
      } else {
         return false;
      }
   }

   public void m11400() {
      this.endWrite();
      Globals.mc.getFramebuffer().beginWrite(false);
   }

   @Subscribe
   public void onResizeDisplay(EventResizeDisplay var1) {
      Window var4 = Globals.mc.getWindow();
      this.resize(var4.getFramebufferWidth(), var4.getFramebufferHeight(), MinecraftClient.IS_SYSTEM_MAC);
   }

   public void m11402() {
      Matrix4f var3 = RenderSystem.getProjectionMatrix();
      VertexSorter var4 = RenderSystem.getVertexSorting();
      Window var6 = Globals.mc.getWindow();
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA, SrcFactor.ZERO, DstFactor.ONE);
      this.draw(var6.getFramebufferWidth(), var6.getFramebufferHeight(), false);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setProjectionMatrix(var3, var4);
   }

   static {
   }
   public static void m122() {
      f5681[0] = "\u001a\fQ]na\u0006\u0016S\u0001tu\u0016\u0015\u0018˟";
      f5681[1] = boolean.class;
      f5682[1] = "java/lang/Boolean";
      f5681[2] = void.class;
      f5682[2] = "java/lang/Void";
      f5681[3] = "_\u000b8\u0001{Y_\u000b/]wVE@/CwCB1\u007f\u001e&";
      f5681[4] = "l\u0019\t\\Z`l\u0019\u001e\u0000VovR\u001e\u001eVzq#LB\u00038";
      f5681[5] = "iM0QE\n`C3\u0018\u0006\u0007fC'\u001a\u001b\u0001$Q$\f\\\u0000gQs-M\u000bnG/,Q\u0016~G0";
      f5681[6] = ",XF9\u001dm.F\u000fZ\u0016v1CY#\u0011";
      f5681[7] = int.class;
      f5682[7] = "java/lang/Integer";
      f5681[8] = "&V\u0016\u001br4/X\u0015R19)X\u0001P,?kI\u0017Tk=*K\u0016\u001bX7\u0016M\u001aAz\u0016$W\u001aRz)aZ\u0017Tl(\u001a\rN\u0006+";
      f5681[9] = "\u0018-E%\u0001_\u0011#FlBR\u0017#Rn_TU2Dj\u0018V\u00140E%+\\(6I\u007f\t}\u001a,Il\tB_!Dj\u001fC$v\u001d8Y";
      f5681[10] = "\u000e='\u00188\t\u0012'%D\"\u001d\u0002$nU&\u0015\u0004!4\u0018+\f\ba\u0007Z%\u001e\u0000#3";
      f5681[11] = "s7[\tb\u0000s7LUn\u000fi|LKn\u001an\r\u0017\u0015:X";
      f5681[12] = "[\u0010x3\u0017-G\nzo\r9W\t1ț";
      f5681[13] = long.class;
      f5682[13] = "java/lang/Long";
      f5681[14] = "R\u0015M1AvN\u000fOm[b^\f\u0004ɫ";
      f5681[15] = "@\u0006\u001e'r=K\t\u000fh\u000f(Y\u0013\r+";
      f5681[16] = "\u007fB\u0001i\b|\u007fB\u00165\u0004se\t\u0016+\u0004fbxGpS";
      f5681[17] = "+\"{]<#78y\u0001&7';2\u0010!$!~y\u0005+80~Y\u0005+80\u0012i\u0000";
      f5681[18] = "\u0006?DJ\u001d\u0018\r0U\u0005|\u0016\u0006;Q_";
      f5681[19] = float.class;
      f5682[19] = "java/lang/Float";
      f5681[20] = "?\u001fCI~y#\u0005A\u0015dm3\u0006\nČ";
      f5681[21] = "\u0012a\u0010$Z\u0017G9C-kȣ\":B!V\u0011_\u007f\u0012u\u0010z";
      f5681[22] = "\u0012>Z~\u000bKEcZ<hpjI6\u0003)qq_6\u001d2|{M%\u001e(~,:[}PTPm\u0006}\u0012";
      f5681[23] = ".]\u0000%\u001c{)DXH\u0017ri]\\$%&/\u0006\u0003HKt$OPsO#-\u0002;q\tbdPW6\u001fbp=";
      f5681[24] = "~WLp] yN\u0014\u001dV)9W\u0010qd}\u007f\fI\u001d_) FF-\rtxUwq^!4\u0006G#\u0003y'7\u001bpV5t\u0007I-\u000e&E[\u001axBuu\tG QD|L\nl^(;Z\nx3";
      f5681[25] = "J\u000bVO<xM\u0012\u000e\"7q\r\u000b\nN\u0005%KWU\"kg\f\u001a\u0000N,q\f\u000em";
      f5681[26] = "b\u0006E1My9H\u0014f'm4\u000b# @t4\u001c\u0007;@p\u001c\u001e\u0007 FfYK\u0012e@j\"\u001c\u001b\"X\u0016f\u0005\u0014;\u001duh\u0013\u001c6'/\"\n\n7Kh4\n\u001eZ";
      f5681[27] = "E%X#+\u0016Sq\u00076E\u001aN'\f0\u0012M\u0013zR\\xIDw\u0003!=\u0019\u00101";
      f5681[28] = "b*\u001e>BN;>T59J4:\u000ecUxe{V:9\u0012d-SoDW4y\u0015\u0004";
      f5681[29] = "68W\u0019r:mv\u0006N\u00189l2\u0000\u0018|8G-\u0004\u0014tU42\u0014\u0003u9s$\u0014\u0017\u0018";
      f5681[30] = "\u000ey m\u001f>Wmjfd:Xi00\b\b\t)`fdb\b~m<\u0019'X*+W";
      f5681[31] = "`*%1y$;dtf\u0013!?6}6]6=0@7k\"!2g7\u0013u7ft$v 1?uZ-q`cx&z,`!\u001bd\u007fv4%~1y/5[%`(s8'r=(1[b`'b&7%v'vK";
      f5681[32] = "q}_\bRZmf[\u0014-Ӧ\u001cwXENC,!M\u000bA";
      f5681[33] = "Y}\b?S|\u00023Yh9~\u0004e\\0TY\u0006aP89*\u0019qG9Um\u000fqST";
      f5681[34] = "\u00037\u0005\r\u000ek\u0000{\u0004\u0013mbTv^\u0014\u0001P\u00030\u0000CV\u0007\u0002fNI\u0016f[r\u0004Bm";
      f5681[35] = "54\u0019x7\u001f2-A\u0015<\u0016r4Ey\u000eB4o\u001f\u0015`\u0010?&I.dG6k\",\"\u0006\u007f9Nk4\u0006kT";
      f5681[36] = "[o\u001eM\u001e5M;AXp2\\|NU\u001c\u0000\b:\u0015\u000fpnZ1\\YKj\r8\u00112I,LqC^\u000e:Le.";
      f5681[37] = "f\u0000):lU=Nxm\u0006U0\rO+aX0\u001ak0a\\\u0018\u0018k+gJ]M~naF&\u001aw)y:";
      f5681[38] = "K,,D`$L5t)k-\f,pEYzJq&\u0015\u000e}M'*Bs8\u001dsl)3}\u001bq|Tv-O7\u0017\u0010eq\u0002',\u00142xOL.Rs1\u001d iDs%p";
      f5681[39] = "\u007fXx dv(\u0005xb\u0007M\u0007/C&=1y\u0001?q`1;";
      f5681[40] = "7d\"\u001eu\u001f0}zsЧ{=?eO%\u001f3tv\n";
      f5681[41] = "P.w}\u0000;\u000619r\u007fpF'3u\u0005jQ Hu\rnCw0\"\u0019fBMqe\u0002zV!6s\u0002n;";
      f5681[42] = "b=H`{U7;\u0011a\u0005b\u0011\u000b2\u000f;\\a>\u000bjnZ8?";
      f5681[43] = "\u0005\"I\u001e_#\u0013v\u0016\u000b1/\u000e \u001d\rfxS}@a\f|\u0004p\u0012\u001cI,P6";
      f5681[44] = "S3\u001e\u0017\u0000i\u00065G\u0016~W7\u0014t1:T-\u0016#F\u00121\u0002!F\u0013\u0014h\u0003";
      f5681[45] = "\u0010WH2M4\u0012\bVe73D7\u000b3\f(L[\b\u007f\r6";
      f5681[46] = "h$H<\u0018qo=\u0010Q\u001f\u0015:-\u0017#\u0006|(y\u00157v|: \u0001!\u001fnn\"\u0015Q";
      f5681[47] = "\u0003\u0019]!5\u0000\u0000U\\?V\tTX\u00068:;\u0000\u0019\\eV\u0006V\u0014\u001914\u0010\u0002K\f_";
      f5681[48] = "{g\tTlT )X\u0003\u0006W-x^BbG\nrZYju=p\\??@=gZSxV=s7";
      f5681[49] = "Bq$\u001fM/Eh|rF&\u0005qx\u001etrC*#r\u001ev\u0012,t\u000f[&Fj\u001fO\u001e Dzb\nNt\u0002\u0011&\u0019\u00129\u0012*\"N\u001bty(d\u000fR&\u0015or\u000fFK";
      f5681[50] = "yPu\u0005A\n~I-hЧn\u007f\r%UD\u0013:]q\u0013";
      f5681[51] = "\"T&6\u0005a!\u0018'(fcy\u0004y$14'Q&H_f)\u001bvs[1 V";
      f5681[52] = "NB\u001bs\u0014\u0000\u0015\fJ$~\u0000\u0018O{u\u0004\u0013\u0018C~\u007f\u0004\u0013\u0014UJ\u0018A\u001d\u001aR\u001f{O\u000b\u0012_%";
      f5681[53] = "kI:K\u001b\u0006sW-Lg\u0004\u007fW*K\u0001\u0013^L5K\"\u000efI1]g^9Ql\u0018\u0003PrB)&";
   }
}
