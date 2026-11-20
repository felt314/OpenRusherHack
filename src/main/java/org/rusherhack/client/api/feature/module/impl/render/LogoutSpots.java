package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.awt.Color;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.Vec2f;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.events.world.EventEntity$Add;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.command.clear;
import org.rusherhack.client.api.feature.hud.impl.Time;
import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
public class LogoutSpots extends ToggleableModule {
   public EnumSetting<LogoutSpotsMode> mode;
   public BooleanSetting render;
   public NumberSetting<Float> scale;
   public BooleanSetting message;
   public NumberSetting<Integer> opacity;
   public BooleanSetting box;
   public ColorSetting color;
   public Object2LongMap<PlayerEntity> f5973;
   public BooleanSetting health;
   public BooleanSetting text;
   public ColorSetting f5976;
   public NumberSetting<Float> linewidth;
   public BooleanSetting time;
   public BooleanSetting customfont;
   public BooleanSetting ghost;
   public BooleanSetting delete;
   public static Map<String, Class468> f5982;
   public static long f5990;

   

   @Subscribe
   public void onRender2D(EventRender2D var1) {
      LogoutSpots var5 = this;
      if ((Boolean)this.text.getValue()) {
         MatrixStack var14 = var1.getMatrixStack();
         IRenderer2D var9 = RusherHackAPI.getRenderer2D();
         IFontRenderer var8 = this.customfont.getValue() ? RusherHackAPI.fonts().getCustomFontRenderer() : RusherHackAPI.fonts().getVanillaFontRenderer();
         var9.begin(var14, var8);
         Iterator var7 = f5982.values().iterator();

         label48:
         while (true) {
            Iterator var10000 = var7;

            while (var10000.hasNext()) {
               Class468 var6;
               if ((var6 = (Class468)var7.next()).f7476.getWorld().getRegistryKey() != Globals.mc.world.getRegistryKey()) {
                  continue label48;
               }

               if (Util177.m7289(var6.f7479) > 200.0F) {
                  var10000 = var7;
               } else {
                  Vec2f var12;
                  if ((var12 = RusherHackAPI.getRenderer3D().projectToScreen(var6.f7479.add(0.0, 2.3, 0.0))) == null) {
                     var10000 = var7;
                  } else {
                     double var10 = Globals.mc.gameRenderer.getCamera().getPos().distanceTo(var6.f7479);
                     var10 = Math.max(var5.scale.getValue().floatValue() / 1.5, var5.scale.getValue().floatValue() / 1.5 * (8.0 / var10));
                     var14.push();
                     var14.translate(var12.x, var12.y, 0.0F);
                     var14.scale((float)var10, (float)var10, 1.0F);
                     String var13 = var6.f7477.getName();
                     if ((Boolean)var5.health.getValue()) {
                        double var10001 = var6.f7476.getHealth();
                        boolean var10004 = true;
                        var13 = var13 + ", " + MathUtils.round(var10001, 1) + "HP";
                     }

                     if ((Boolean)var5.time.getValue()) {
                        var13 = var13 + ", " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - var6.f7478) + "m ago";
                     }

                     IFontRenderer var16;
                     switch (var5.mode.getValue().ordinal()) {
                        case 0:
                           Object[] var17 = new Object[]{Formatting.GRAY, null, null, null};
                           boolean var18 = true;
                           var17[1] = var6.f7479.x;
                           var17[2] = var6.f7479.y;
                           var17[3] = var6.f7479.z;
                           var13 = var13 + String.format(" %s(%.1f, %.1f, %.1f)", var17);
                           var16 = var8;
                           break;
                        case 1:
                           Object[] var10002 = new Object[]{Formatting.GRAY, null};
                           boolean var10006 = true;
                           var10002[1] = Util177.m7289(var6.f7479);
                           var13 = var13 + String.format(" %s(%.1f meters)", var10002);
                        default:
                           var16 = var8;
                     }

                     var16.drawString(var13, -(var8.getStringWidth(var13) / 2.0), 0.0, var5.f5976.getValueRGB());
                     var14.pop();
                     var10000 = var7;
                  }
               }
            }

            var9.end();
            return;
         }
      }
   }

   @Subscribe
   public void onAdd(EventEntity$Add var1) {
      if ((Boolean)this.delete.getValue()) {
         f5982.remove(var1.getEntity().getName().getString());
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe
   public void m11905(Event332 var1) {
        
    }

   @Subscribe
   public void onQuit(EventQuit var1) {
      f5982.clear();
   }

   @Subscribe
   public void onRemove(EventEntity$Remove var1) {
      Entity var5;
      if ((var5 = var1.getEntity()) instanceof PlayerEntity) {
         PlayerEntity var7 = (PlayerEntity)var5;
         this.f5973.put(var7, System.currentTimeMillis());
      }
   }

   @Override
   public void onDisable() {
      f5982.clear();
   }

   public LogoutSpots() {
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      this.f5973.object2LongEntrySet().removeIf(var0 -> {
         if (System.currentTimeMillis() - var0.getLongValue() > f5990) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      int var4 = Class253.m9154();
      LogoutSpots var9 = this;
      if ((Boolean)this.render.getValue() && (Boolean)this.box.getValue()) {
         IRenderer3D var5 = var1.getRenderer();
         var5.begin(var1.getMatrixStack());
         var5.setLineWidth(this.linewidth.getValue());
         Iterator var8 = f5982.values().iterator();

         label32:
         while (true) {
            Iterator var10 = var8;

            while (true) {
               if (!var10.hasNext()) {
                  break label32;
               }

               Class468 var6;
               if ((var6 = (Class468)var8.next()).f7476.getWorld().getRegistryKey() != Globals.mc.world.getRegistryKey()) {
                  break;
               }

               if (!(Util177.m7289(var6.f7479) > 200.0F)) {
                  if (!(Boolean)var9.box.getValue()) {
                     break;
                  }

                  double var10001 = var6.f7479.x - 0.3;
                  double var10003 = var6.f7479.z - 0.3;
                  boolean var10010 = true;
                  var5.drawBox(var10001, var6.f7479.y, var10003, 0.6, 2.0, 0.6, false, true, var9.color.getValueRGB());
                  if (var4 != 0) {
                     break label32;
                  }
                  break;
               }

               var10 = var8;
            }
         }

         var5.end();
      }
   }
}
