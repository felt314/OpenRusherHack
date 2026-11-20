package org.rusherhack.client.api.feature.module.impl.client;
import org.rusherhack.*;

import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import org.rusherhack.client.Class022;
import org.rusherhack.client.Class039;
import org.rusherhack.client.Class059;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRenderScreen;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.utils.InputUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.command.BackgroundCommand;
public class Background extends ToggleableModule {
   public Particles f4903;
   public BooleanSetting clickgui;
   public Gradient f4905;
   public BouncingLogo f4906;
   public BooleanSetting chat;
   public BooleanSetting others;
   public BooleanSetting mainmenu;
   public BooleanSetting windows;
   public NullSetting visibility;
   public BooleanSetting alwayson;
   public BooleanSetting hudeditor;
   public static long f4918;

   @Override
   public ModuleCommand createCommand() {
        return null;
    }

   public Background() {
      super("Background", "Cool additions to the background of GUIs", ModuleCategory.CLIENT);
      this.f4903 = new Particles();
      this.f4906 = new BouncingLogo();
      this.alwayson = new BooleanSetting("AlwaysOn", false);
      this.f4905 = new Gradient();
      this.visibility = new NullSetting("Visibility");
      boolean var10012 = true;
      this.clickgui = new BooleanSetting("ClickGui", true);
      boolean var10011 = true;
      this.hudeditor = new BooleanSetting("HudEditor", true);
      boolean var10010 = true;
      this.windows = new BooleanSetting("Windows", true);
      boolean var10009 = true;
      this.chat = new BooleanSetting("Chat", true);
      boolean var10008 = true;
      this.mainmenu = new BooleanSetting("MainMenu", true);
      boolean var10007 = true;
      this.others = new BooleanSetting("Others", true);
      boolean var10003 = true;
      this.f4906.addSubSettings(this.alwayson);
      NullSetting var10000 = this.visibility;
      Setting[] var10001 = new Setting[(int)f4918];
      var10001[0] = this.clickgui;
      boolean var10005 = true;
      var10001[1] = this.hudeditor;
      var10001[2] = this.windows;
      var10001[3] = this.chat;
      var10001[4] = this.mainmenu;
      var10001[5] = this.others;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.f4903, null, null, null};
      var10005 = true;
      var10001[1] = this.f4906;
      var10001[2] = this.f4905;
      var10001[3] = this.visibility;
      this.registerSettings(var10001);
   }

   @Subscribe(
      stage = Stage.ON
   )
   public void onRenderScreen(EventRenderScreen var1) {
        
    }

   @Subscribe(
      priority = 1000
   )
   public void onRender2D(EventRender2D var1) {
        
    }

   public boolean m9967(Screen var1) {
        return false;
    }
}
