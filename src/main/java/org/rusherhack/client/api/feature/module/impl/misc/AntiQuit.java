package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.text.Text;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.gui.IMixinPauseScreen;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.disconnect;
public class AntiQuit extends ToggleableModule {
   public BooleanSetting gameclose;
   public boolean f2610;
   public BooleanSetting disconnect;

   public AntiQuit() {
      super(
         "AntiQuit",
         "Prevents accidental disconnects and game closes",
         ModuleCategory.MISC
      );
      boolean var10009 = true;
      this.disconnect = new BooleanSetting("Disconnect", true);
      boolean var10008 = true;
      this.gameclose = new BooleanSetting("GameClose", true);
      Setting[] var10001 = new Setting[]{this.disconnect, null};
      boolean var10005 = true;
      var10001[1] = this.gameclose;
      this.registerSettings(var10001);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.PRE
   )
   public void onQuit(EventQuit var1) {
        
    }
}
