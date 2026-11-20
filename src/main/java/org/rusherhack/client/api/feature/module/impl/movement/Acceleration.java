package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.Speed;
public enum Acceleration {
   f6249,
   f6251,
   f6253,
   f6254,
   f6257;

   public BooleanSetting acceleration;
   public NumberSetting<Double> maxspeed;
   // $VF: synthetic field
   public NumberSetting<Double> speed;
   Acceleration(double var3, double var5) {
    }
   Acceleration() {}
}
