package org.rusherhack.client.api.system;
import org.rusherhack.*;

import java.awt.Color;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import org.rusherhack.client.api.setting.ColorSetting;

public interface Colors {
   Color getEntityColor(Entity var1, Colors$ColorMode var2);

   Color getBlockEntityColor(BlockEntity var1, Colors$ColorMode var2);

   int getRainbowColor(ColorSetting var1, int var2);

   ColorSetting primaryColor();
}
