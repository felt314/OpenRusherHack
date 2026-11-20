package org.rusherhack;

import net.minecraft.client.particle.Particle;
import net.minecraft.particle.ParticleEffect;
import org.jetbrains.annotations.Nullable;

import org.rusherhack.client.api.feature.module.impl.render.Enum575;
public class Class519 extends Event175 {
   @Nullable
   public ParticleEffect f8351;
   @Nullable
   public Enum575 f8352;
   @Nullable
   public Particle f8353;
   public static Object[] f8355 = new Object[8];

   public Class519(Enum575 var1) {
      this.f8351 = null;
      this.f8353 = null;
      this.f8352 = var1;
   }

   public Enum575 m16044() {
      return this.f8352;
   }

   public Class519(ParticleEffect var1) {
      this.f8351 = var1;
      this.f8353 = null;
      this.f8352 = null;
   }

   public ParticleEffect m16045() {
      return this.f8351;
   }

   public Particle m16046() {
      return this.f8353;
   }

   public Class519(Particle var1) {
      this.f8351 = null;
      this.f8353 = var1;
      this.f8352 = null;
   }

   static {
      m122();
   }
   public static void m122() {
      f8355[0] = "L\u001c\f\u001f&wP\u0006\u000eC<c@\u0005Eҍ";
      f8355[1] = "s/o[vDo5m\u0007lP\u007f6&Ե";
      f8355[2] = "!?]b\u0016\u0003!?J>\u001a\f;tJ \u001a\u0019<\u0005\u001e|H";
      f8355[3] = "\u00010#9h\n\u000104ed\u0005\u001b{4{d\u0010\u001c\ne$<W";
      f8355[4] = "5\fM#Rr>\u0003\\l3|5\bX6";
      f8355[5] = "\u0000n\r\u0016ZhR.\u000ewƵYV;L\tI&V)\u000e\n";
      f8355[6] = "\u000b\u000eP:%!YNS[š\u0010^_\\ -zZ\u000b\u0017e";
      f8355[7] = "Fler%A\u0014,f\u0013Ⱦp\u0013ozh{\u0000\u0016;\"b";
   }
}
