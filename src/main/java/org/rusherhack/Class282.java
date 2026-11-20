package org.rusherhack;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.utils.EntityUtils;

import org.rusherhack.client.api.feature.module.impl.render.ESP;
public class Class282 implements Class228 {
   public Entity f4803;
   public static Object[] f4806 = new Object[39];
   public static String[] f4807 = new String[39];

   @Override
   public String getName() {
      return EntityUtils.getNameForEntity(this.f4803);
   }

   public Entity m9717() {
      return this.f4803;
   }

   @Override
   public int m5077() {
        return 0;
    }

   @Override
   public Vec3d m5078() {
      return EntityUtils.interpolateEntityVec(this.f4803, Globals.mc.getRenderTickCounter().getTickDelta(false));
   }

   @Override
   public Box m5076() {
      Box var3 = this.f4803.getBoundingBox().offset(-this.f4803.getX(), -this.f4803.getY(), -this.f4803.getZ());
      double[] var5 = EntityUtils.interpolateEntityPosition(this.f4803, Globals.mc.getRenderTickCounter().getTickDelta(false));
      double var10001 = var5[0];
      boolean var10005 = true;
      return var3.offset(var10001, var5[1], var5[2]);
   }

   public Class282(ESP var1, Entity var2) {
    }

   static {
      m122();
   }
   public static void m122() {
      f4806[0] = "\u0000\u0005\t\u000bU\u0014\u001c\u001f\u000bWO\u0000\f\u001c@ȑ";
      f4806[1] = "DV!>(jXL#b2~HOhʎ";
      f4806[2] = "*6ZBJB6,X\u001ePV&/\u0013ǒ";
      f4806[3] = "M\u001c?\u0001nyM\u001c(]bvWW(CbcP&z\u001d:'";
      f4806[4] = "<\u000fk_`2 \u0015i\u0003z&0\u0016\"\u0012~.6\u0013x_s7:S\u007f\ba36\u0010\"2}+<\u000f\u007fUQ(?\u0012~<}#6";
      f4806[5] = "8]>\u0003\u0002n%Hf!Cc=N";
      f4806[6] = "\u000efkd/K\u0012|i85_\u0002\u007f\")2L\u0004:\u007f/)J\bzkd\u0018P\u0014y_/)J\bzk";
      f4806[7] = "\u0012$nTz{\u000e>l\b`o\u001e='\u0019g|\u0018xz\u001f|z\u00148nT[k\t\"`\u0014o";
      f4806[8] = "E'aE~2N(p\n\u001f<E#tP";
      f4806[9] = int.class;
      f4807[9] = "java/lang/Integer";
      f4806[10] = "Q,\tk2@M6\u000b7(T]5@&,\\[0\u001ak!EWp\u001b1)YMp++4\\J';1)YM";
      f4806[11] = float.class;
      f4807[11] = "java/lang/Float";
      f4806[12] = "P\u0006CinjP\u0006T5beJMT+bpM<\u0005s0";
      f4806[13] = "M\u000eL;)\"M\u000e[g%-WE[y%8P4\u000b$t";
      f4806[14] = "\u001e1JWDg\u001e1]\u000bHh\u0004z]\u0015H}\u0003\u000b\u0007N\u001e7";
      f4806[15] = "v\u000ee^\u0011\u0003j\u0014g\u0002\u000b\u0017z\u0017,\u0013\u000f\u001f|\u0012v^\u0002\u0006pRE\u001c\f\u0014x\u0010q";
      f4806[16] = boolean.class;
      f4807[16] = "java/lang/Boolean";
      f4806[17] = "u:V\u0007\u0019\b~5GHd\u0010m2N\u0001";
      f4806[18] = "\u007f-\u0002\u001fU~\u007f-\u0015CYqef\u0015]Ydb\u0017D\u0002\u0000";
      f4806[19] = double.class;
      f4807[19] = "java/lang/Double";
      f4806[20] = "\u007ft";
      f4806[21] = "\u0012%0$\u001f+\u0012$:NɰDK'=rP=By&s";
      f4806[22] = "\fOm=#p\u0015CeaG{\nO\u007fe+IV\u0003.\u0002+dW\u000eo2wb\u001dP\u001fn=.ZC/2;d\u00043sxw#\u0017\u0003/~=}gXcpxz\tAox$\u001e";
      f4806[23] = "4l^A>Q6=\n\u0005UAf,|W0CE7@s3Rj,K>oHwh\u0001UoMlo:U:Es?\u0003_$PoP";
      f4806[24] = "\u0001D;:&!\u0003\u0015o~M?X\u00042?59Z\u0011#(\u00008B\u0019#4\u00133Uxe#1f\u0005\u0013e&*a>G9 6oD\u001a1 #^\u000e\u001f9=q`A\u00186'M";
      f4806[25] = "!\b\u001akGK!\r\u0001l|Ev\u0012\u00064\u0010w!U]iE w\u0014Vn\f\u0010+\u0012\u001c0|";
      f4806[26] = "t\u001e-\u007fM;$\u0018wk(ПMF,yN;(\u0016*#Z";
      f4806[27] = "\u0006\u001c\u00161w9V\u001aL%\u00123R\u0001;1n=C\f=0v;E}L1nd\u0004\u0016L4uc?G\u000b*cc\u0005\u0014\u0014<r\\\u0004\u0000\u0014+|a\u0004\u0018\u001co\u0012";
      f4806[28] = "N\u001fk#\u0018\u0003N\u001ap$#\r\u0019\u0005w|O?NB,\"\u001ch\u0018\u0003'&SXD\u0005mx#";
      f4806[29] = "s\u001du\u001c\u0016i3DhH's/\u0003gFKA|G9\u001d\u0019\u0016+F|^It9AwS'";
      f4806[30] = "da*l\u001efd` \u0006ԙ\t>82>\u0015b>=)9";
      f4806[31] = "#7P2!\u001d#2K5\u001a\u0013t-Lmv!#j\u00173*vu+\u001c7jF)-Vi\u001a";
      f4806[32] = "9\u0003:r\u001b}6\u0005j,p!;~gw\u0002ya\u0001'.\u001f-";
      f4806[33] = "\u0011\u001b\u001ej'?\u0003\u001c\u0015gI8\u0015^\u0005r%\nF\u001a[.v]\u0012D\u0014.v/\u0018\u001a\u000flIb\u001eG\u001e$3?\u0016G\u000b\u0015";
      f4806[34] = "zj\u000e\u0019P~zo\u0015\u001ekp-p\u0012F\u0007B}<H\u0010k~<~ME\u0005g0v\u0011!";
      f4806[35] = "jT[Kvah\u0005\u000f\u000f\u001d\u007f3\u0014RNey1\u0001CYPx)\tCEEy.\tCUzxURYH%%>R\\S\"\u001ej\u000eZO,d7\u0006ZZ\u001dsl\u0014\u0002\n\"t(\u0013\u00064";
      f4806[36] = "`0nFW\u0014inuG(ЭY1{\u0011W\u0004&g6FM";
      f4806[37] = "d~\u00045\u000e$>k\u001e)r;4k:,\u0016)4\u0017ZuM28/\u0016;\u0003*Y";
      f4806[38] = "\r\u0017\b\u0013F`\r\u000f\u0000W(2[\u00160 b]\b\u0010\u001b^J?_\n\u0011\u0010(";
   }
}
