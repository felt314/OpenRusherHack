package org.rusherhack.client.api.accessors.entity;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({Entity.class})
public interface IMixinEntity {
   @Accessor
   EntityDimensions getDimensions();

   @Accessor
   Vec3d getStuckSpeedMultiplier();

   @Accessor("stuckSpeedMultiplier")
   void setStuckSpeedMultiplier(Vec3d var1);

   @Accessor("wasTouchingWater")
   void setTouchingWater(boolean var1);

   @Invoker("collide")
   Vec3d callCollide(Vec3d var1);

   @Invoker("getSharedFlag")
   boolean invokeGetSharedFlag(int var1);

   @Invoker("calculateViewVector")
   Vec3d invokeCalculateViewVector(float var1, float var2);

   @Invoker("canAddPassenger")
   boolean invokeCanAddPassenger(Entity var1);
}
