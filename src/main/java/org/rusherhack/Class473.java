package org.rusherhack;

import java.awt.Color;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.client.render.DimensionEffects.SkyType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.client.api.Globals;

import org.rusherhack.client.api.feature.module.impl.world.Environment;
public class Class473 extends DimensionEffects {
   public static Object[] f7597 = new Object[31];
   public static String[] f7598 = new String[31];

   public Vec3d adjustFogColor(Vec3d var1, float var2) {
      RegistryKey var10;
      if ((var10 = Globals.mc.world.getRegistryKey()) == World.NETHER) {
         Color var9 = Environment.f4784.f4789.getValue();
         return new Vec3d(var9.getRed() / 255.0F, var9.getGreen() / 255.0F, var9.getBlue() / 255.0F);
      } else if (var10 == World.OVERWORLD) {
         Color var8 = Environment.f4784.f4788.getValue();
         return new Vec3d(var8.getRed() / 255.0F, var8.getGreen() / 255.0F, var8.getBlue() / 255.0F);
      } else if (var10 == World.END) {
         Color var7 = Environment.f4784.f4778.getValue();
         return new Vec3d(var7.getRed() / 255.0F, var7.getGreen() / 255.0F, var7.getBlue() / 255.0F);
      } else {
         return var1;
      }
   }

   public Class473() {
        super(Float.NaN, true, SkyType.NONE, true, false);
      boolean var10006 = true;

   }

   public boolean useThickFog(int var1, int var2) {
      return false;
   }

   public SkyType getSkyType() {
      return SkyType.NONE;
   }

   @Nullable
   public float[] getFogColorOverride(float var1, float var2) {
      return null;
   }

   static {
      m122();
   }
   public static void m122() {
      f7597[0] = "oc~)\u0011@ociu\u001dOu(ik\u001dZrY?5E\u001d%eff\u000fZ^3>7M";
      f7597[1] = "\\H#\u0000#[\\H4\\/TF\u00034B/AArf\u0017}\u0005";
      f7597[2] = "5\u0018j\u0013Z%5\u0018}OV*/S}QV?(\"+\u000e\u0005}";
      f7597[3] = "/\u000fzy0E3\u0015x%*Q#\u00163ɧ";
      f7597[4] = "~\u0013V;;<b\tTg!(r\n\u001fv% t\u000fE;(9xOBp==x\u000fV;\n&}\u000eCF,=e\b_r";
      f7597[5] = "S4|A\u0015JO.~\u001d\u000f^_-5ɩ";
      f7597[6] = int.class;
      f7598[6] = "java/lang/Integer";
      f7597[7] = "*:b\u0007m$7/:%,)/)";
      f7597[8] = "g\u001f\u0007\u0015;J{\u0005\u0005I!^k\u0006NѬ";
      f7597[9] = "#]\u000f\u00192\u0002?G\rE(\u0016/DFɃ";
      f7597[10] = "Pq-\u0010?\u0016Pq:L3\u0019J::R3\fMKo\rj";
      f7597[11] = "c>X\u0012)b\u007f$ZN3vo'\u0011_7~i\"K\u0012:gebxP4um L";
      f7597[12] = "\u000f5Q`\u0015!\u000f5F<\u0019.\u0015~F\"\u0019;\u0012\u000f\u0016\u007fH";
      f7597[13] = ")mVn\u001f?\"bG!~1)iC{";
      f7597[14] = "$l\u0004<Vp%;\u001eb4'|;\u001b>cs oOj4s$oE3^5-.\u0007";
      f7597[15] = "%!g820a-x!]ș\u001fq~ba<t!fd2";
      f7597[16] = "u\u0019\u0011g\u000fq%Q\u0018umտI\u001dEo\u0000c4G\u0019k\b\u001f";
      f7597[17] = "H%\\*[rO3S 8f\u00183#7Ud\u0013OP}[d\t2\n!_lu";
      f7597[18] = "n4l\u0000\u0006Docv^d\u00136cs\u00023Gj7(_dGn7-\u000f\u000e\u0001gvo";
      f7597[19] = "cL\u0015>B{;V\u001ewz\"^\n\nl\u0015.,U^n\u001cK`[\u000eh\u001f9?\u000f\faz";
      f7597[20] = ",xQ$9\u0019|`Ww[\u001d{y3q?\u000f{\u0005Prk\u0015u~Wdd\u001f\u0016";
      f7597[21] = "_\\]\\Z\u0005]W\u0013_=\u001f\rOMAQ-Z\f\u001c\u0016\u0006zZ\n\u0014\u001c\\\u0010\u001c\u0003U^=";
      f7597[22] = "JQ7\u0010G|\u000e](\t(Ԭp\u0001.J\u0014p\u001bQ6LG";
      f7597[23] = "4\u000e\u0015HC\u0010q\u001eER?\u001c`r\u001fWN\u0003jMC\u0000OA";
      f7597[24] = "-*/A9Q*< KZE}<EK6*,p|K&Wv,xCZ";
      f7597[25] = "\bz')y{\t-=w\u001b,P-8+Lx\fyl~\u001bx\byf&q>\u00018$";
      f7597[26] = "FW\u0011\u001dh\rAA\u001e\u0017\u000b\u0019\u0016Ak\u001ev\u001b{\u0001\u0011\u0019f\n\u0006[M\u001dnv";
      f7597[27] = "a&\u001c\u000f\u001b&=q\u001dMzw0-\t\u0019- opRuEv!:\n\nG}o9";
      f7597[28] = "\u0019\u000e|\u0013#~\r\r{+s\"\u0018Ro|'~K\r2+q{\n\u000e=\u0016ex\r";
      f7597[29] = "Yri)\u0006R\u001d~v0iаc\"g+\u000fS\rfk4\u0016";
      f7597[30] = ";Tz)\u001f\\\u007fXe0pʭ\u0001\u0004csLPjT{u\u001f";
   }
}
