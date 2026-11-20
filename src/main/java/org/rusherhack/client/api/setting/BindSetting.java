package org.rusherhack.client.api.setting;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.bind;
public class BindSetting extends Setting<IKey> {
   public static Object[] f833 = new Object[33];
   public static String[] f834 = new String[33];

   public BindSetting setVisibility(BooleanSupplier var1) {
      return (BindSetting)super.setVisibility(var1);
   }

   public IKey parseValue(String var1, boolean var2) {
      IKey var6 = RusherHackAPI.getBindManager().parseKey(var1);
      if (var2) {
         this.setValue(var6);
      }

      return var6;
   }

   public BindSetting(String var1, String var2, IKey var3) {
      super(var1, var2, var3);
   }

   @Override
   public String getDisplayValue() {
      return ((IKey)this.getValue()).getDisplayLabel();
   }

   public BindSetting onChange(Consumer<IKey> var1) {
      return (BindSetting)super.onChange(var1);
   }

   @Override
   public boolean deserializeValue(JsonElement var1) {
        return false;
    }

   public BindSetting setChangeAction(Runnable var1) {
      return (BindSetting)super.setChangeAction(var1);
   }

   public BindSetting(String var1, IKey var2) {
      super(var1, var2);
   }

   @Override
   public JsonElement serializeValue() {
      IKey var10002 = (IKey)this.getValue();
      boolean var10005 = true;
      return new JsonPrimitive(var10002.getLabel(true));
   }

   static {
      m122();
   }
   public static void m122() {
      f833[0] = "\u0004%B$\f_\u0018?@x\u0016K\b<\u000bi\u0012C\u000e9Q$\u001fZ\u0002yVo\n^\u00029B$<C\u00053vo\n^\u00029B";
      f833[1] = " =O\u000fzZ+2^@\u0007B85W\t";
      f833[2] = boolean.class;
      f834[2] = "java/lang/Boolean";
      f833[3] = "Q2\u0004s\u0019!M(\u0006/\u00035]+M>\u0004&[n\u00014\u00050\u0010+\u0006$E\u001du%\u001a";
      f833[4] = ".dw:'\u00100lmuo\u0010*fu2f\u000bjFn5z\u0010)`s";
      f833[5] = "X@WMl\u000fTHV\u0006%\u0007H@TMA\u0013TAj\u0011b\rR[S\u0015n";
      f833[6] = "|B\u0010d5\r`X\u00128/\u0019p[Y)(\nv\u001e\u0004/3\fz^\u0010d\u0014\u001dgD\u001e$ ";
      f833[7] = "\te.\u0012W~\u0002j?]6p\ta;\u0007";
      f833[8] = void.class;
      f834[8] = "java/lang/Void";
      f833[9] = "hi\u0004\"*%ts\u0006~01dpMo49bu\u0017\"9 n5\u0010i,$nu\u0004\"\u001b?kt\u0011_=$sr\rk";
      f833[10] = "\\0";
      f833[11] = "^\u00035-\u001eoB\u00197q\u0004{R\u001a|ɷ";
      f833[12] = "\tPb\u0015gt\u0015J`I}`\u0005I+Xyh\u0003Lq\u0015tq\u000f\fgR{eHkGR{e+CkZrd\u0014";
      f833[13] = "t[hC\u0005XhAj\u001f\u001fLxB!\u000e\u001bD~G{C\u0016]r\u0007]\u0018\u0004E~[G\f\u0014FZyF";
      f833[14] = "KEP\u0017peGMQ\\9m[ES\u0017]yGDxUrgMDI";
      f833[15] = "_H;rZtA@!=\u0012t[J9z\u001bo\u001bk\"|\u0018dTG\u001ef\u0004qY@(a";
      f833[16] = "x!\u00162\u0000Zs.\u0007}|C|.\u00011BS";
      f833[17] = "\f6o0\n\u001d\bw;uaCZ0\u0016p:PM-9da^R<\"4\u001aMU _";
      f833[18] = "\u00031nxygA87\"\u0002yT(A#yn]=|\u0006k|T0\r0gfDkv#`z9";
      f833[19] = "\f\u001bG%h[[\u000eC(P@]\u001ev.4F]b\u0015}*P\u0001\u001dG<+@0_Q(=[\u000f\u0010N'7;";
      f833[20] = "&ky\u0000\u0005;db Z~%qr^S\u0014'x\u000e \u0000\u001a8-j C\u000f1\u001c|\u007fJ\u0003ugoxV~";
      f833[21] = "\u001eB\u0007~1\u0012\tD\u0006B$\u0005\t\u007f\u00199>\u0002\u0014E\u0019>.h\u001f\u001b\u0016'&\n\u0011\u001d\u0012s_\u0003\u0016^D,%\u0014\u0010_x";
      f833[22] = "&.\u0014.p:x}\u0014/\u0000ſ\u0018\u007f\u00121y\u007fj$\u00022=C";
      f833[23] = "u&0qC*b 1MDP.tu.\u001c>\"#r&-`/\u007f,|Clxx.M";
      f833[24] = "1S\u0007\u001cGF|\u0000\u0007I+LhD\u0006\u0015hYp>\u000f\u001d[I>E\u001c\u001aG4;[\u001eBPEyRG\u0018+";
      f833[25] = "gP',\"\\h\u000f\"xCQ;N\u0017#%R\u0013[;+,S,2m/9Z:@ |9\u000fV";
      f833[26] = "\u0017'=\u0018\u001a2\u0000!<$\u0013.7$+B\u001b%|\u007f}\u001f\u0011x\u0007z+C\u001eH\u0017'=\u0018\u001a2\u0000!<$";
      f833[27] = "o3o\u001b\u0005n=2<\u0012i}}Hx\u001e\u000fD|kf\u0018\u0015}xg\u0003CSxt;gC\u0010m}\n";
      f833[28] = "r/(\u0003&Ke))?0Xc7:a!Ud!WM-Ads,^*]\u0019vm[:\u0000}v.N31#)4\u00053@a m_H";
      f833[29] = "4Bj\u007f\"TfC9vNI0\u0007Of\f]:\u001d^g/C<\u0007gc#&f\u00016&%\u0017b@bcN";
      f833[30] = "i\u0005P@%PmD\u0004\u0005N\u0000)$\u001c\u0001/\u0007=\u007fZA*\u0013c\u001bZ\u0002?\u001aR";
      f833[31] = ",zNk\rv{oJf5y}\u007f\u007f`Qk}\u0003\u001c3O}!|NrNm\u0010";
      f833[32] = ",Y|d7\u0005;_}X\"\u0012;qc1?\u0010*sh$8\u0018!:ic+\u000ev\u0001x3`NGQ`'e\u0011=Ff&Y";
   }

   public BindSetting() {}
}
