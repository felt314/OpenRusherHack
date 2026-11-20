package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import java.awt.Color;
import net.minecraft.client.render.DimensionEffects;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;
public class Environment extends ToggleableModule {
   public ColorSetting f4776;
   public BooleanSetting nether;
   public ColorSetting f4778;
   public ColorSetting color;
   public BooleanSetting changesTheColorOfClouds;
   public BooleanSetting overworld;
   public boolean f4782;
   public BooleanSetting changesTheColorOfTheWorld;
   public static Environment f4784;
   public BooleanSetting end;
   public BooleanSetting changesTheColorOfTheSky;
   public DimensionEffects f4787;
   public ColorSetting f4788;
   public ColorSetting f4789;

   public Environment() {
    }
}
