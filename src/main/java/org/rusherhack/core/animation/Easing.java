package org.rusherhack.core.animation;
import org.rusherhack.*;

import java.util.function.Function;
public enum Easing implements Function<Double, Double> {
   EASE_IN,
   EASE_OUT,
   LINEAR,
   EASE_IN_OUT,
   SINE_PULSE,
   BEZIER_CURVE;

   public Function<Double, Double> f1403;
   // $VF: synthetic field
   Easing(Function<Double, Double> var3) {
      this.f1403 = var3;
   }

   public Double apply(Double var1) {
        return null;
    }
   Easing() {}
}
