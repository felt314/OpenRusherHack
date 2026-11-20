package org.rusherhack;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.VertexSorter;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.util.Window;
import org.joml.Matrix4f;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.screen.EventResizeDisplay;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.clear;
public class Class476 extends SimpleFramebuffer {
   public Class253 f7713;
   public static Object[] f7715 = new Object[52];
   public static String[] f7716 = new String[52];

   public void m14916() {
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

   public void m14917(Framebuffer var1) {
      if (this.f7713 != null) {
         this.f7713.m9152();
      }

      var1.beginWrite(false);
   }

   @Subscribe
   public void onResizeDisplay(EventResizeDisplay var1) {
      Window var4 = Globals.mc.getWindow();
      this.resize(var4.getFramebufferWidth(), var4.getFramebufferHeight(), MinecraftClient.IS_SYSTEM_MAC);
   }

   public void m14919(boolean var1) {
      if (var1) {
         this.clear(MinecraftClient.IS_SYSTEM_MAC);
      }

      this.beginWrite(false);
      if (this.f7713 != null) {
         this.f7713.m9149();
      }
   }

   public void m14920(Class253 var1) {
      this.f7713 = var1;
   }

   public Class476() {
        super(Globals.mc.getFramebuffer().textureWidth, Globals.mc.getFramebuffer().textureHeight, true, MinecraftClient.IS_SYSTEM_MAC);
      boolean var10009 = true;

      this.f7713 = null;
      this.setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      Class170.f3362.subscribe(this);
   }

   public void m14921() {
      this.m14917(Globals.mc.getFramebuffer());
   }

   static {
      m122();
   }
   public static void m122() {
      f7715[0] = "&\u0010qx\u0002\u001a:\ns$\u0018\u000e*\t8Љ";
      f7715[1] = "`f\u00119n\b||\u0013et\u001cl\u007fXɣ";
      f7715[2] = "\u0012y5^L\u0017\u000ec7\u0002V\u0003\u001e`|ɶ";
      f7715[3] = int.class;
      f7716[3] = "java/lang/Integer";
      f7715[4] = boolean.class;
      f7716[4] = "java/lang/Boolean";
      f7715[5] = void.class;
      f7716[5] = "java/lang/Void";
      f7715[6] = "@>\u001c@LK@>\u000b\u001c@DZu\u000b\u0002@Q]\u0004[_\u0011";
      f7715[7] = "l+WV{el+@\nwjv`@\u0014w\u007fq\u0011\u0011O ";
      f7715[8] = "\u0010(,\u0019Be\f2.EXq\u001c1eT\\y\u001a4?\u0019Q`\u0016t\f[_r\u001e68";
      f7715[9] = float.class;
      f7716[9] = "java/lang/Float";
      f7715[10] = "63rW\u0004\u001b*)p\u000b\u001e\u000f:*;\u001a\u0019\u001c<op\u000f\u0013\u0000-oP\u000f\u0013\u0000-\u0003`\n";
      f7715[11] = "\u0005RqUB\u000b\u000e]`\u001a#\u0005\u0005Vd@";
      f7715[12] = "n<G\u0007Rfr&E[Hrb%\u000eł";
      f7715[13] = "\b\u000fmU\u0004Z\b\u000fz\t\bU\u0012Dz\u0017\b@\u00155(K]\u0002";
      f7715[14] = "zR\u0012\u001fOMs\\\u0011V\f@u\\\u0005T\u0011F7N\u0006BVGtNQcGL}X\rb[QmX\u0012";
      f7715[15] = ">\u0018x;\u0017\b<\u00061X\u001c\u0013#\u0003g!\u001b";
      f7715[16] = "d)1\u0005NUm'2L\rXk'&N\u0010^)60JW\\h41\u0005dVT2=_Fwf(=LFH#%0JPIXri\u0018\u0017";
      f7715[17] = "6i~v\u001b+?g}?X&9gi=E {v\u007f9\u0002\":t~v1(\u0006rr,\u0013\t4hr?\u00136qe\u007f9\u00057\n2&kC";
      f7715[18] = "/L\r;zx/L\u001agvw5\u0007\u001ayvb2vA'\" ";
      f7715[19] = "k_~TJI9X}\r.ԒR\bx\rC\u0018h\rf^\u0017r";
      f7715[20] = "V\u0003\u001bFB\u001e\fUK\u007fŃyRVOG\\\u000b\u001f\u0003\u001a\u00139B\u0013\u0006G\u0002\u0004\u001dP\u000fC\u007f";
      f7715[21] = "/\u001a7{u\f=\u0004'r\u0016{\u00036\u0011\u000fWz\u0018 \u0011\u0011Lw\u00122\u0002\u0012VuE\u0011';'_u\u00039+.";
      f7715[22] = "})\u007f\u0018f%'\u007f/!x/8%%MJ{~~~!''t((\u001b\"9'|B\u001bxr)/x\u001ef!}EyKb&97y\u0010~9D~>H|?y!}AxB";
      f7715[23] = "\tJ~\u0012\"DS\u001c.+<NLF.G\u000e\u001a\n\u001d~+bIOB>Yb\u0012S]C\u0010%JQ[~OfCU&";
      f7715[24] = "=vM$9\\oqN}]¥\u0004 R$<\u001a9\u007f\u0011-8g";
      f7715[25] = "\u0013_$5{\u0005I\tt\fe\u000fVS~`WX\u0010\u000e(0\u0000XO\u0003tf:]QP \f:\u0007\u001a^s6?\u0019I\n\u00197j\u001dNNk71\u0001Q3\"pi\u0003W\u000e}3`\u0007*";
      f7715[26] = "0H$#\u000fb}\u001dqwj~l\u001c)w=)1Aw\u001bPu=\u001c'!UknH";
      f7715[27] = "2w\u000eust<q\u0010!M3nv84**na\u001c/*.Fc\u001c4,8\u0003c\u001e$2r}e\u0010<6Ho6Y4t-?7Q>Ms\u007fc\u00013p,<j\u0005N";
      f7715[28] = "S\u0019]\u001d.{Z\u0018D\u0010Ur\u000f\u0006\\\u00119@^G\u0004HU-\u0007JQ\u001co(\u0019\u0019\u0005v";
      f7715[29] = "F,jz%\u0014\u001cz:CξsF-4*:H\u0014*7s";
      f7715[30] = "\rW\u0012_\u0018F\u0003Q\f\u000b&\u0016]Q\u0015\u000eB\u0017vN\u0011\u0002Jz\u0007V\u0015\u0005[GX\u0015\u001c\u0001&";
      f7715[31] = "\u0000\f\n.?!\t\r\u0013#D(\\\u0013\u000b\"(\u001a\rS[tDwT_\u0006/~rJ\fRE";
      f7715[32] = "ev6$K!kp(puw0f>s;`2`\u0003r\rt.b$ruvnj=y\u0010'jg>\u001f\u001f|%:;/\rb53XtO|1m=%Kq2\u000b2~\u0004,7; `\u0014%T0.v\u0014`iog\u007f\u0010\u001d";
      f7715[33] = "\u000fG\u0010q9>AOMy\u0003ҏ?\u001a\u0012`n/G\u001c\\a=";
      f7715[34] = "w-^N\u001d\u0013y+@\u001a#B 9Z\u0011Ne\"=V\u0019#\u0014:9Q\b\u001eKy0Uu";
      f7715[35] = "*\u001bh\u0002.\u0010pM8;0\u001ao\u00172W\u0002N)Lk;k\fs\u0016eU/GuHU\u0005.\u0017rG;Ae\u0011,wk@5\u0016#\u0019/\u000b3H\u0013I.[4G}\re]jw(\u000b<Z(JwH5^U";
      f7715[36] = "TuL.wwR=Bx\u0012i\u00059\u0012\u007f~[R\u007fL()\fY&\u0013si`P'\n~\u0012";
      f7715[37] = "No\\\u0007z\u0007\u0003:\tS\u001f\u0010\u001e*UXs\"Jl\u000e\u0002\u001fN\u0019)QBmNB5N?$\t\u001a7H\u0002{J\u001335";
      f7715[38] = "8\u0005t\u0003*V6\u0003jW\u0014\u0005d\u0004BBs\bd\u0013fYs\fL\u0011fBu\u001a\t\u0011dRkPw\u0017jJoj";
      f7715[39] = "Sch\u0013$D\t58*6#\u0011k2G%\u001f\u0011l<*$G\rb/\u0016$@\u0003\u000f";
      f7715[40] = "+!{0\u0002\u00179?k9a`\u0007\r\nk\u0000Vp#:y\u001eFy";
      f7715[41] = "J\u0019?)Z\u000bLW>z \b\bM'/Z\u0012\u001fJ\\t\u001e\t\u0005A<xQB\b'g8I\u0012\b\u001a8{@\u0016u";
      f7715[42] = ":pa3s\\ktl0\u0015k\u001c\u0010GV~\u00030/f3/\u0007=,";
      f7715[43] = "wJL\u0012t\u0019:\u001f\u0019F\u0011\u0005+\u001eAFFRvC\u001c*+\u000ez\u001eO\u0010.\u0010)J";
      f7715[44] = "50|\u0002]\u0001d4q\u0001;?\u0004AJ.\u007f<\u001eC\u001d\f\u0001\u0005;lx]\u0005\b8";
      f7715[45] = "N\u001bVTZ#\u001a\u0019GPd+\u0018`\u001b\u0000Zr\u0016\u001b\u001dHT.";
      f7715[46] = "q%~\u000e[twmpR>j i URXt(z\b>2t|xWL\u007f!),2";
      f7715[47] = "/\u0012prb\u000e}\u0015s+\u0006Π\u0016DorgH+\u001b,{c5";
      f7715[48] = "?\u001f\u000fNQJ1\u0019\u0011\u001ao\u001ac\f\b\b\u000b\nD\u0006\f\u0013\u00038s\u0004\nuT\ng\u0003\u001cH\u000bIn\u0007a";
      f7715[49] = "a.?'8vgf1{]c<sew\n4b&:\u001bfg\"z|if<>e";
      f7715[50] = "}\u0007o\t^*s\u0001q]`y!\u0006__\u001aj!\nZU\u001aj-\u001cn2\f*u\u00008W\\+}\n\u0001";
      f7715[51] = "76b\u0006\u0004.m`2?\u001a$r:8S(p4ag?D#q>\"MDxm!_\u0004\u0003 o'b[@)kZ";
   }
}
