package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import net.minecraft.client.network.PlayerListEntry;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.config.Configuration;
import org.rusherhack.client.api.config.TextConfiguration;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.utils.IOUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.SpammerCommand;
import org.rusherhack.command.clear;
import org.rusherhack.command.config;
import org.rusherhack.command.reset;
public class Spammer extends ToggleableModule {
   public TextConfiguration f2479;
   public EnumSetting<SpammerF2480> mode;
   public NumberSetting<Double> delay;
   public StringSetting defaultTxt;
   public int f2483;
   public StringSetting msg;
   public BooleanSetting whisper;
   public Class424 f2486;
   public Timer f2487;
   public NumberSetting<Double> randomdelay;

   @Override
   public void onDisable() {
      this.f2483 = 0;
   }

   public void m5580(boolean var1) {
      if (var1) {
         this.f2479.write(this.f2486);
      }

      this.f2479 = TextConfiguration.createConfiguration("spammer", ((String)this.defaultTxt.getValue()).replace(".txt", "")).allowNewLines();
      this.f2479.read(this.f2486);
      this.f2483 = 0;
   }

   @Override
   public ModuleCommand createCommand() {
      return new SpammerCommand(this, this);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (this.f2487.passed((this.delay.getValue() + new Random().nextDouble() * this.randomdelay.getValue()) * 1000.0)) {
         List var4;
         if (!(var4 = this.f2486.m13641()).isEmpty()) {
            Spammer var10000;
            label29: {
               switch (this.mode.getValue().ordinal()) {
                  case 0:
                     if (this.f2483 >= var4.size()) {
                        this.f2483 = 0;
                     }

                     this.m5585((String)var4.get(this.f2483));
                     boolean var10005 = true;
                     this.f2483++;
                     if (this.f2483 >= var4.size()) {
                        var10000 = this;
                        this.f2483 = 0;
                        break label29;
                     }
                     break;
                  case 1:
                     this.m5585((String)var4.get(new Random().nextInt(var4.size())));
               }

               var10000 = this;
            }

            var10000.f2487.reset();
         }
      }
   }

   public Spammer() {
    }

   @Override
   public String getMetadata() {
      return this.f2483 + "/" + this.f2486.m13641().size();
   }

   public void m5584() {
        
    }

   @Override
   public void onEnable() {
      this.m5580(false);
      this.m5584();
   }

   public void m5585(String var1) {
      if ((Boolean)this.whisper.getValue()) {
         List var6;
         if (!(var6 = Globals.mc.player.networkHandler.getPlayerList().stream().filter(var0 -> {
            if (!var0.getProfile().equals(Globals.mc.player.getGameProfile())) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         }).collect(Collectors.toList())).isEmpty()) {
            PlayerListEntry var7 = (PlayerListEntry)var6.get(new Random().nextInt(var6.size()));
            Globals.mc.player.networkHandler.sendChatCommand((String)this.msg.getValue() + " " + var7.getProfile().getName() + " " + var1);
         }
      } else {
         if (var1.startsWith("/")) {
            int var10000 = var1.length();
            boolean var10003 = true;
            if (var10000 > 1) {
               boolean var10004 = true;
               Globals.mc.player.networkHandler.sendChatCommand(var1.substring(1));
               return;
            }
         }

         Globals.mc.player.networkHandler.sendChatMessage(var1);
      }
   }
}
