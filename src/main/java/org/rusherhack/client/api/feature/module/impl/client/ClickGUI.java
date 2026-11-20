package org.rusherhack.client.api.feature.module.impl.client;
import org.rusherhack.*;

import org.rusherhack.client.Class059;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.setting.NumberSetting;

import org.rusherhack.command.ClickGUICommand;
import org.rusherhack.command.modules;
import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
public class ClickGUI extends ToggleableModule {
   public static NumberSetting<Float> changeHowBigTheClickguiIs;
   public static ClickGUI f1878;
   public static long f1883;

   @Override
   public boolean reset() {
      boolean var4 = super.reset();
      Class170.f3364.m7115().getClickGuiHandler().setDefaultPositions();
      return var4;
   }

   @Override
   public String[] getAliases() {
      String[] var10000 = new String[]{this.getName(), null, null, null};
      boolean var10004 = true;
      var10000[1] = "gui";
      var10000[2] = "click";
      var10000[3] = "menu";
      return var10000;
   }

   @Override
   public ModuleCommand createCommand() {
      return new ClickGUICommand(this, this);
   }

   @Override
   public void onEnable() {
      Class059 var4 = Class170.f3364.m7115().m12508();
      var4.m3050(Globals.mc.currentScreen);
      Globals.mc.setScreen(var4);
      this.toggle();
   }

   

   public ClickGUI() {
      super("ClickGUI", "Screen to configure modules", ModuleCategory.CLIENT);
      f1878 = this;
      Class170.f3364.m7119().setBind(this, new Class545((int)f1883));
      this.setNotifications(false);
      this.registerSettings(changeHowBigTheClickguiIs);
   }
}
