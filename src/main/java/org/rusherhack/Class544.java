package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.core.bind.key.NullKey;

import org.rusherhack.command.bind;
import org.rusherhack.command.toggle;
public class Class544 extends Renderer271 {
   public IModule f8754;
   public static long f8755 = Class066.m4320(-4838791792361933199L, -1963854116672744258L, MethodHandles.lookup().lookupClass()).m4325(244183871262039L);
   public static String[] f8756;
   public static String[] f8757;
   public static Object[] f8759 = new Object[46];
   public static String[] f8760 = new String[46];

   @Override
   public void m6448(double var1, double var3) {
      this.getPanel().getFontRenderer().drawString(this.m4900(), 2.0, 2.0, -1);
   }

   public Class544(PanelBase<?> var1, IModule var2) {
      super(var1, null);
      this.f8754 = var2;
      this.m5382(var2.getSettings());
      if (var2 instanceof ToggleableModule var6) {
         this.addSubItem(new Class085(var1, this, new Class314(this, "Bind", "Keybind to toggle this module", NullKey.INSTANCE, var6)));
      }
   }

   @Override
   public boolean m4901() {
      if (this.f8754 instanceof ToggleableModule) {
         return ((ToggleableModule)this.f8754).isToggled();
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   @Override
   public boolean isVisible() {
      if (Class170.f3364.m7107().m14150(this.f8754) && this.f8754.isHidden()) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.m5378(var1, var3) && var5 == 0 && this.f8754 instanceof ToggleableModule) {
         ((ToggleableModule)this.f8754).toggle();
         boolean var10002 = true;
         return true;
      } else {
         return super.mouseClicked(var1, var3, var5);
      }
   }

   @Override
   public String m4900() {
      return this.f8754.getDisplayName();
   }

   public IModule m16809() {
      return this.f8754;
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
   public static void m1731() {
      f8759[0] = "M&CHDUQ<A\u0014^AA?\n\u0005YRGzM\bBEP2E\u0005SS\f\u001dj\u0007[EF";
      f8759[1] = "7)]\u0016c_<&LY\u001eG/!E\u0010";
      f8759[2] = "\u0001J<\u0004l/\u001dP>Xv;\rSuӟ";
      f8759[3] = "\u0018<pLMI\u0004&r\u0010W]\u0014%9\u0001SU\u0012 cL^L\u001e`q\u0007^H\u0002<rLRS\u0013;{\u0007\u0011u:!s\u0017SY";
      f8759[4] = "\u0018D\u00125*@\u0004^\u0010i0T\u0014][x7G\u0012\u0018\u0017r6QY]\u0010bv{\u0002Z\u0019P=L";
      f8759[5] = "+\u0007cQ)57\u001da\r3!'\u001e*ɹ";
      f8759[6] = int.class;
      f8760[6] = "java/lang/Integer";
      f8759[7] = "T\u000eF\u001ec&H\u0014DBy2X\u0017\u000fS}:^\u0012U\u001eÐ";
      f8759[8] = "m`\u0001\u0006\\[qz\u0003ZFOayHKBGg|\u0012\u0006O^k<\u0013A\u0000^c|\u0003D\u0000~c|\u0003DgZg\u007f$I]K";
      f8759[9] = "\u0005=\t\u0006C\u0010\u0019'\u000bZY\u0004\t$@K]\f\u000f!\u001a\u0006P\u0015\u0003a\u001bA\u001f\u0015\u000b!\u000bD\u001f,:.\u0000M],\u001e*\u0003";
      f8759[10] = void.class;
      f8760[10] = "java/lang/Void";
      f8759[11] = "\u0011\u007f\u001f\u001cRk\re\u001d@H\u007f\u001dfVQOl\u001b#\u001eWAj\u000b\u007f\u001d\u001ciX\u001bl\fGR{=b\u0016TIy\u000b\u007f\u0019PL{";
      f8759[12] = "0-BpO..%X?-2)8";
      f8759[13] = "\u0016\u0017i7FX\n\rkk\\L\u001a\u000e ë";
      f8759[14] = "$1\n\u0019zG8+\bE`S((CTg@.m\u0018Ca^8m>Cz[%$8Ca^8";
      f8759[15] = ",\nh\u001cQ\u00130\u0010j@K\u0007 \u0013!Ɇ";
      f8759[16] = "a4.\u0016!/}.,J;;m-g[?3k(=\u00162*gh<Q}*o(,T}\no(,T\u0011;}#";
      f8759[17] = "TK\u0014*[>HQ\u0016vA*XR]gE\"^W\u0007*H;R\u0017\u0001aG/^K]bF%O\u0017:BF%Ok\u0016jM.I\\\u0001";
      f8759[18] = double.class;
      f8760[18] = "java/lang/Double";
      f8759[19] = "%\fBf}i9\u0016@:g})\u0015\u000b+cu/\u0010Qfnl#PC-nh?\f@fbs.\u000bI-!H%\u0019B$j}(\u0012@\u0005`x?\u0012@";
      f8759[20] = boolean.class;
      f8760[20] = "java/lang/Boolean";
      f8759[21] = "6\u0012|z\b\u000e*\b~&\u0012\u001a:\u000b5Ŀ";
      f8759[22] = "\f\u0014\u0005u[,\u0010\u000e\u0007)A8\u0000\rLѶ";
      f8759[23] = "QU.FA\u0007MO,\u001a[\u0013]Lg\u000b\\\u0000[\t \u0006G\u0017LA(\u000bV\u0001\u0010n\u0001\u0001W\u0017_E%\r";
      f8759[24] = "\u0005V\u0003\u0004\u001cP\u000eY\u0012K}^\u0005R\u0016\u0011";
      f8759[25] = "\u001cM\u0016\u0019\u0014\nTR\u0010\ri5`l45/?k7R\u0006\u0017\u0011[I\u001a\u0019\u0011\u0005";
      f8759[26] = "K\u0011(srUQ\u0012|+IXLR_)/K{Cw\"$MLT\u0011%s\u0006\u001f\u001fj\"4\u0007D.";
      f8759[27] = "\u0001?t\u0003\u001b9\u0006xuX*.\u0010l:fV8\u000bc*=V?\fz|Q[&\t\u0005.MJz[<(\u0001Qzjn5]\u0012sShyF\u0012BVk$\rU.\u000ez9^*)\u001ae}\f\u0013/V~}=";
      f8759[28] = "Q\n-1)\u0006\u0006H,dEէ<\u00194>$\rV\u000f0:7}";
      f8759[29] = "y\u0004Z\u0006\u000fS\u007f\u000f\u0018\u0011h՞BY\u0004\u000bXA.\u0001\u0015\u0016\u000b>";
      f8759[30] = "?7\b~\u0010{hu\t+|ξR'\tn\u0010l)pKoE";
      f8759[31] = "u82\u007fW/'0aokўH.rp\u0014m$#kuk(54p/\u0007%,1\u000f";
      f8759[32] = "&J\u001aI\u001e\u0004{\u000b{XI\u001a\u000fS\u0000O@\u000f2t\u0012RIf?O\u001dH\u001d\n2V\u00187";
      f8759[33] = ",\u0001N|\u001d5|\u0011KfyɈ\u0015JCx\t3v\u0019E\u007f\u0005";
      f8759[34] = "\u0006Xy\u0014\u0010\"YY(E`-T\n\u001a\b\n\u0005D\u000b$u^#\u0006\u001b&H\u000b-I\u001cAJ\u000fyU\u000f3J\u001e|Tf";
      f8759[35] = "\u0003!sE)#\u0015%wVYƾm~wB)1\u000e-qE%I\u0000z|X0(Q;k\u001dY";
      f8759[36] = "sN\u0002RK-bWW\u0005; dy^RT%rI9P\u0005-cLX\u0001D:&%";
      f8759[37] = "DA.2:gD\u00113*]9Pj+715M*'e1$BKv$&a+";
      f8759[38] = "6@,GfL;OmSVǽ\u0007IcYn\u001f>O/Bn.lRs\u0001g\u0017j\u001eh\u0001VC9NoP7\u0012xY*9";
      f8759[39] = "\u0017\u0003*\u0016<\u001aX\u0006\"\u001dS\u0010E\u0005\u0014\u0015/\u0003I\u001f \u0003SOHG\"Il\u0013\u0017\u00053x";
      f8759[40] = "2dM]\u0006m?k\fI6ŝ\u00036\u0012\u001d[><jM_J\u000f<iON_}<xJO6";
      f8759[41] = "] QiK\u000b^;\u0006d,G46\u0011>SRX;\b;,\u0017I,\u0013a@\u001aP)l";
      f8759[42] = "dn\u0001 ww4~\u0004:\u0013`]uPy\"{b$\b=b\t7$Psa6f|\u00143\u0013";
      f8759[43] = "\u0013Q\u000e\n\tX\u0002H[]yH\u0018UZ\u0001\u00144@U\b\b\u0010F@D\r\ty";
      f8759[44] = "9\u0012_\u0001zSi\u0002Z\u001b\u001eΖ\u0000\u001fH\u0005a\u0014l\u0012Q\u0000\u001e";
      f8759[45] = "J\u0005p\r\u0004a\u0015\u0004!\\th\u0019G\u0010\u0005\u0012j\u0010;\"SM:OY8P\u0019bt";
   }
}
