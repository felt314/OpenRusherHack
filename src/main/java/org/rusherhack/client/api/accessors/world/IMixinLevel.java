package org.rusherhack.client.api.accessors.world;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.world.entity.EntityLookup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({World.class})
public interface IMixinLevel {
   @Accessor("rainLevel")
   float getRainLevel();

   @Accessor("thunderLevel")
   float getThunderLevel();

   @Invoker("getEntities")
   EntityLookup<Entity> getEntities();
}
