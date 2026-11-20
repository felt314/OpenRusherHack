package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.EnumSetting;

import org.rusherhack.command.send;
public class NoForceRotate extends ToggleableModule {
   public EnumSetting<NoForceRotateMode> mode;
   public float f5692;
   public float f5693;

   public NoForceRotate() {
      super(
         "NoForceRotate",
         "Preve>{\u000b\f_\u000b\u0017\u001a_\f\u001a\r\t\u001a\r_\u0019\r\u0010\u0012_\r\u0010\u000b\u001e\u000b\u0016A\u0004g you",
         ModuleCategory.MISC
      );
      this.mode = new EnumSetting<>("Mode", NoForceRotateMode.f3848);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.ALL
   )
   public void onReceive(EventPacket$Receive var1) {
        
    }
}
