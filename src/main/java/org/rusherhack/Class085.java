package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.events.client.input.EventMouse$Key;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.bind;
public class Class085 extends Class517<BindSetting> {
   public boolean f2134;
   public Animation f2135;
   public static long f2136 = Class066.m4320(7931533870254424514L, -5287186208043243719L, MethodHandles.lookup().lookupClass()).m4325(12282259836126L);
   public static String f2137;
   public static long f2138;
   public static Object[] f2139 = new Object[52];
   public static String[] f2140 = new String[52];

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      if (this.f2134) {
         (switch (var1) {
            case 256, 259, 261 -> {
               ((BindSetting)super.f8251).setValue(NullKey.INSTANCE);
               yield this;
            }
            default -> {
               ((BindSetting)super.f8251).setValue(new Class545(var1));
               yield this;
            }
         }).f2134 = false;
         boolean var10002 = true;
         return true;
      } else {
         return super.keyTyped(var1, var2, var3);
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      Class085 var10;
      if (this.m5378(var1, var3) && var5 == 0 && !this.f2134) {
         var10 = this;
         this.f2134 = true;
      } else {
         if (this.f2134) {
            ((BindSetting)super.f8251).setValue(new Class489(var5));
            boolean var10004 = true;
            this.f2134 = false;
            return true;
         }

         var10 = this;
      }

      return var10.mouseClicked(var1, var3, var5);
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      this.getPanel().getRenderer();
      this.getPanel().getFontRenderer();
      super.render(var1, var2, var4);
   }

   @Override
   public String m4900() {
        return null;
    }

   @Override
   public boolean m4901() {
      return false;
   }

   @Override
   public String m4902() {
      return this.f2134 ? "" : ((BindSetting)super.f8251).getDisplayValue();
   }

   @Subscribe
   public void onKey(EventMouse$Key var1) {
      int var6 = var1.getAction();
      boolean var10003 = true;
      if (var6 == 1 && this.f2134) {
         ((BindSetting)super.f8251).setValue(new Class489(var1.getButton()));
         boolean var10005 = true;
         this.f2134 = false;
         var1.setCancelled(true);
      }
   }

   public Class085(PanelBase<?> var1, Renderer107 var2, BindSetting var3) {
      super(var1, var2, var3);
      this.f2134 = false;
      Animation var10001 = new Animation(Easing.LINEAR, f2138);
      boolean var10004 = true;
      this.f2135 = var10001.setLoop(true).play();
      Class170.f3362.subscribe(this);
   }

   static {
   }
   public static String m656(byte[] var0) {
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
   public static void m3938() {
      f2139[0] = "K\n}j\u001f\nW\u0010\u007f6\u0005\u001eG\u00134'\u0002\rAV{*\u0004\u0012E\fs+\u0003Qe\u0016s)\f\u000bM\u0017t";
      f2139[1] = boolean.class;
      f2140[1] = "java/lang/Boolean";
      f2139[2] = "j\u0012\f1ASv\b\u000em[Gf\u000bEÐ";
      f2139[3] = "</\u000b{*+ 5\t'0?06B67,6s\t#=0's)#=0'\u001f\u0019&";
      f2139[4] = "<7\u001d1\u0011b78\f~pl<3\b$";
      f2139[5] = void.class;
      f2140[5] = "java/lang/Void";
      f2139[6] = "*\u0017Sf~\u001d6\rQ:d\t&\u000e\u001a+c\u001a KU&e\u0005$\u0011]'bF\u0000\u0004G!b\u000f";
      f2139[7] = "w^K1dbkDIm~v{G\u0002Ŵ";
      f2139[8] = "P\u001e~'\u0005\u0019L\u0004|{\u001f\r\\\u00077j\u001b\u0005Z\u0002m'\u0016\u001cVB|\u007f\u0012\u0002K\u001f7j\u001b\u0005Z\u0002m'\u001e\u0002O\u0019m'2\u001aZ\u0002mD\u0018\u0019L\t=B\u0012\u0015";
      f2139[9] = int.class;
      f2140[9] = "java/lang/Integer";
      f2139[10] = "D&:/\"kX<8s8\u007fH?sb?lNz.d$jB::/\u0003{_ 4o7";
      f2139[11] = "7O\u000eO\u0004L+U\f\u0013\u001eX;VGɧ";
      f2139[12] = "Uiii.@Isk54TYp ȳ";
      f2139[13] = "l\\?`\u0014fpF=<\u000er`Ev-\taf\u0000=8\u0003}w\u0000,7\u0016v-k.+\bg@O6-\u0003\u007foO:\"\u0003";
      f2139[14] = "yum[xneoo\u0007bzul$Ӈ";
      f2139[15] = "\u000f7)0\u0018<\u000488\u007fe$\u0017?16";
      f2139[16] = "*:\tBgf_\u001a\u0002Mv)>\u0014\tFrsJ";
      f2139[17] = "5j/\n?L)p-V%X9sfѱ";
      f2139[18] = double.class;
      f2140[18] = "java/lang/Double";
      f2139[19] = "\u0002\u001euZu*\u001e\u0004w\u0006o>\u000e\u0007<\u0017k6\b\u0002fZf/\u0004B`\u0011i;\b\u001e<&b1\t\t`7h1\u0019\tj\u0000";
      f2139[20] = "H\"L\u001fuiT8NCo}D;\u0005RkuB>_\u001fflN~XTshN>L\u001fEuI4xTshN>L";
      f2139[21] = "Rp!\u001fm\u000eNj#Cw\u001a^ihRp\tX,$Xq\u001f\u0013i#H15Hn*zz\u0002";
      f2139[22] = "\u001b%-6-\u001d\u0007?/j7\t\u0017<d{3\u0001\u00119>6>\u0018\u001dy?qq\u0018\u00159/tq8\u00159/t\u001d\t\u00072";
      f2139[23] = "b\u001e\u001a9w\u001a~\u0004\u0018em\u000en\u0007Sti\u0006h\u0002\t9d\u001fdB\u000frk\u000bh\u001eSqj\u0001yB4Qj\u0001y>\u0018ya\n\u007f\t\u000f";
      f2139[24] = "\r\u0007{n\u0013\n\u0011\u001dy2\t\u001e\u0001\u001e2#\r\u0016\u0007\u001bhn\u0000\u000f\u000b[n%\u000f\u001b\u0007\u00072\t3\u001a\f\u0011y2\u0004\rP1";
      f2139[25] = "\u001d)>?\bh\u00013<c\u0012|\u00110wr\u0016t\u00175-?\u001bm\u001bu,xTm\u00135<}TM\u00135<}3i\u00176\u001bp\tx";
      f2139[26] = "{\u0002s?gig\u0018qc}}w\u001b:ã";
      f2139[27] = "\u0005\u0014RMUc\u0007\tYu\\8\u000f\u0019)\u0016X'^\u0019\u0016\u0014E,f";
      f2139[28] = "K\u0014rKU\"[\r5\u001681H\f\u0001H^\"\u007f\u001d)CU.H\nO@\u0000g\u001b\u0013*IJ.Ip";
      f2139[29] = "@\u0017zKa|\u0004\u000b+\u0017\u001dj\u0010\u001b_\u001aad\u001a\u0001\u0016Ot|\u000f\u0007wKde\u001ag";
      f2139[30] = "3dV\u0013\u00147#}\u0011Ny$0|1\u001a\u001f'0z\u0006\ry+a=\t\u0018\u0014s3}\nw";
      f2139[31] = "u+AA;:!t\u0002XEԼE%\u0013B7<$!\u0003[\"\\";
      f2139[32] = "zg\u0004\u0016\t=.8G\u000fwȂJiV\u0015\u0005;+mF\f\u0010[";
      f2139[33] = "6?\u001a\u0017\u001fV<v\bFyD84\u001f\u0014\u0005*6?\u001a\u0017\u001fV<v\bFy@a.\u000b\u001b\u001a[9,\u001a}\u0010[?$\u001c\u0001\u001a\u0012-uz";
      f2139[34] = "\b\u0014u\u0018\u0012@\n\t~ \f\u0012\u0017he_\u001e\u0018TQj\u001e\u0002\u0014k";
      f2139[35] = "w\u000f>\t@\\#\u000e=\r\u007fӥJ^=\u000e@Y#\u000by\u000bF";
      f2139[36] = "SA!+,e\u0005R}>\u0012e\u000f_\n>tu\u000fG%:~\u001e\u0012[;>xl\u0007\u001a/W)b\u000b\u001d3()y\u001fIA";
      f2139[37] = "FK3\u001aw-LMq\u000e\u000e(F\t\u0004\u001du?O\u001c9\"g#V\u0018H\u0015\u007f'A\u00134\u001f65\u0010u";
      f2139[38] = "',!\u0011+v%1*)!$8\u0014=N\"I4( @0;!i4)95?h+\u0016;(4P";
      f2139[39] = "7TC<\u0005teTSwcV\u001cso\u000f%\\\u0017(^:\u0013m<K\f:\u0003&";
      f2139[40] = "4\u0007L%\u001bw3\u0005S-w0\r\u0010D=\u001e$\u007f\u0005\u0005)";
      f2139[41] = "d~\u001b[?\u0015=3G\u0013\u0005\u000b6>#\u0003a\r6BF\u0007{\u00134)\u0011\u0017b\u000f[y\u0001\u0003;\u0002$y\u001a\u0017op";
      f2139[42] = "I7kI\u001d\u007fN5tAqƘp3gPI7O1z[";
      f2139[43] = "} oX<%9<>\u0004@3-,I\u001f< '6\u0003\\)%20bX9<'P";
      f2139[44] = "m7c\u0018[\u00198sf\u001e=\u000b*%dLG\u0011=\"\u001f\u001cP\u000e4 tK@\u0017(O$[TN%0$@@\u001aW";
      f2139[45] = "\u001cB_Dth\u001a\u0002_N\u0013ƯvWMEyq\n]\u0004W(\u0017\u001fO\\Ouk\u0015\u0006N\u001e\u0013";
      f2139[46] = "z`\u0013a\u0002\rdk\u001dvfƹ\u001bd\rl\u0001U\"kLp\rjpp\u000fvYS\u007f1\u0013zf\u001acu\u001b{\u0014\u000f\"ar";
      f2139[47] = "0\u0003\u001fGr%8\u0018G\u0001\u0013{\\\u000b\t\u001ay1 \u0001@\b(W5\u0013\u0018\u0010u+?Z\nA\u0013";
      f2139[48] = "!]712i&_(9^9\u0018\n'9amxX#n/P(Z-lc0z^z\"^";
      f2139[49] = "oUT%f\u001d8\u0004\u0005=\u0017?\u0012sy\fM{oUT%f\u001d8\u0004\u0005=";
      f2139[50] = "-`M/\u0015\u001d&f\u0012$)L {s+ON)\u0007E&\u0014G {U?S\u001aM";
      f2139[51] = "?(\u00188M^j%\u001e65Ш\u000ejY2\u0004\nk3\u0014nL";
   }
}
