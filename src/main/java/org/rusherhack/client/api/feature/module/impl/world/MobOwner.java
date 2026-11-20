package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.Check;
import org.rusherhack.*;

import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Tameable;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.text.Text;
import org.rusherhack.client.api.accessors.entity.IMixinProjectile;
import org.rusherhack.client.api.events.render.EventRenderEntity$Nametag;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;

public class MobOwner extends ToggleableModule {
   public static MobOwner f255;
   public BooleanSetting pearls;

   @Subscribe
   void onCheck(EventRenderEntity$Nametag.Check var1) {
        
    }

   public MobOwner() {
      super("MobOwner", ")\u0018\u0011A\u0006s you t<\u007f\u0018]\u0014\u0019\u0018\u0013\t\u0014\t\u0004]\u0012\u001b]\nA\u0002o tamed a mob", ModuleCategory.WORLD);
      boolean var10009 = true;
      this.pearls = new BooleanSetting("Pearls", true);
      f255 = this;
      this.registerSettings(this.pearls);
   }

   @Subscribe
   public void onNametag(EventRenderEntity$Nametag var1) {
        
    }
}
