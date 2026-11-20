package org.rusherhack.client.api.system;
import org.rusherhack.*;

import net.minecraft.entity.Entity;

public interface Entities {
   boolean isProjectileEntity(Entity var1);

   boolean isVehicleEntity(Entity var1);

   boolean isPassiveMob(Entity var1);

   boolean isHostileMob(Entity var1);

   boolean isNeutralMob(Entity var1);
}
