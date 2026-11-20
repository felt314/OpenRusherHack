package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.FireworkRocketItem;
import net.minecraft.item.Item;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.world.RaycastContext.FluidHandling;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.world.IMixinBucketItem;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventInteract;
import org.rusherhack.client.api.events.player.EventInteract$Action;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class ForcePlace extends ToggleableModule {
   public Item f7516;
   public BooleanSetting placeBlocksOnContainers;
   public boolean f7518;
   public BooleanSetting spawnFireworksOnContainers;
   public static ForcePlace f7520;
   public BooleanSetting openEntityContainers;

   public boolean m14623(Item var1) {
      if ((Boolean)this.spawnFireworksOnContainers.getValue() && var1 instanceof FireworkRocketItem) {
         boolean var8 = true;
         return true;
      } else {
         if ((Boolean)this.placeBlocksOnContainers.getValue()) {
            if (var1 instanceof BlockItem) {
               boolean var7 = true;
               return true;
            }

            if (var1 instanceof BucketItem var5) {
               if (Item.raycast(
                        Globals.mc.world,
                        Globals.mc.player,
                        ((IMixinBucketItem)var5).getContent() == Fluids.EMPTY ? FluidHandling.SOURCE_ONLY : FluidHandling.NONE
                     )
                     .getType()
                  != Type.MISS) {
                  boolean var10002 = true;
                  return true;
               }

               return false;
            }
         }

         return false;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.ALL
   )
   public void onSend(EventPacket$Send var1) {
        
    }

   @Subscribe
   public void onInteract(EventInteract var1) {
      if ((Boolean)this.openEntityContainers.getValue() && var1.getAction() != EventInteract$Action.ATTACK) {
         boolean var10003 = true;
         var1.setUsingSecondaryAction(true);
      }
   }

   public ForcePlace() {
      super(
         "ForcePlace",
         "yEHJLZ\tH\tKEFJB\tFG\tKEFJBZ\t^AL[L\tPF\\\tGF[DHEEP\t^F\\E\u001d\u000e open a gui by sneaking",
         ModuleCategory.WORLD
      );
      boolean var10012 = true;
      this.placeBlocksOnContainers = new BooleanSetting("Blocks", "Place blocks on containers", true);
      this.openEntityContainers = new BooleanSetting("Entities", "Open entity containers", false);
      this.spawnFireworksOnContainers = new BooleanSetting("Fireworks", "Spawn fireworks on containers", false);
      f7520 = this;
      Setting[] var10001 = new Setting[]{this.placeBlocksOnContainers, null, null};
      boolean var10005 = true;
      var10001[1] = this.openEntityContainers;
      var10001[2] = this.spawnFireworksOnContainers;
      this.registerSettings(var10001);
   }
}
