package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRenderEntity$Nametag;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.system.Colors$ColorMode;
import org.rusherhack.client.api.utils.EntityUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.command.clear;
import org.rusherhack.client.api.feature.hud.impl.Armor;
import org.rusherhack.client.api.feature.hud.impl.Durability;
import org.rusherhack.client.api.feature.hud.impl.Ping;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.client.Background;
import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
import org.rusherhack.client.api.feature.module.impl.misc.Gamemode;
public class Nametags extends ToggleableModule {
   public NumberSetting<Integer> radius;
   public BooleanSetting scaleLargerWhenYouMoveCloserToTheEntity;
   public Targets f2644;
   public BooleanSetting armorstands;
   public NumberSetting<Float> f2646;
   public ColorSetting f2647;
   public BooleanSetting durability;
   public BooleanSetting rounded;
   public BooleanSetting itemname;
   public BooleanSetting entityid;
   public NumberSetting<Double> scale;
   public BooleanSetting armor;
   public EnumSetting<NametagsFriendcolor> friendcolor;
   public BooleanSetting gamemode;
   public EnumSetting<NametagsMode> mode;
   public BooleanSetting multiline;
   public BooleanSetting enchants;
   public List<Class110> f2659;
   public BooleanSetting offhand;
   public BooleanSetting simple;
   public ColorSetting color;
   public BooleanSetting ping;
   public BooleanSetting horseinfo;
   public NumberSetting<Float> f2665;
   public BooleanSetting outline;
   public BooleanSetting reversed;
   public BooleanSetting items;
   public NumberSetting<Float> width;
   public BooleanSetting customfont;
   public EnumSetting<NametagsHealth> health;
   public Formatting[] f2672;
   public BooleanSetting mainhand;
   public BooleanSetting nameplate;
   public NumberSetting<Float> f2675;
   public BooleanSetting background;
   public BooleanSetting totempops;
   public ColorSetting f2678;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Subscribe
   public void onRender2D(EventRender2D var1) {
        
    }

   public void m5909(LinkedListMultimap<ItemStack, String[]> var1, ItemStack var2) {
        
    }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String[] m5910(Entity var1) {
        return null;
    }

   public double m5911(Entity var1, IRenderer2D var2, IFontRenderer var3, double var4) {
        return 0.0;
    }

   public Formatting m5912(LivingEntity var1) {
        return null;
    }

   public double m5913(LivingEntity var1, IRenderer2D var2, IFontRenderer var3, DrawContext var4, double var5) {
        return 0.0;
    }

   public static int m5914(ItemStack var0) {
      return var0.isItemBarVisible() ? var0.getItemBarColor() : 65280;
   }

   public Nametags() {
        super(
         "Nametags",
         "9\u000e\u0005\u000f^\u000frs nametags above entities",
         ModuleCategory.RENDER
      );
      int var10001 = 6;

      this.scale = new NumberSetting<>("Scale", 1.5, 0.5, 10.0).incremental(0.1);
      boolean var10043 = true;
      this.scaleLargerWhenYouMoveCloserToTheEntity = new BooleanSetting("DistanceScaling", "Scale larger when you move closer to the entity", true);
      boolean var10041 = true;
      this.customfont = new BooleanSetting("CustomFont", true);
      this.multiline = new BooleanSetting("MultiLine", false);
      boolean var10039 = true;
      this.nameplate = new BooleanSetting("Nameplate", true);
      boolean var10038 = true;
      this.background = new BooleanSetting("Background", true);
      this.rounded = new BooleanSetting("Rounded", false);
      this.radius = new NumberSetting<>("Radius", 3, 0, 10);
      this.color = new ColorSetting("Color", ColorUtils.transparency(Color.BLACK, 100));
      boolean var10034 = true;
      this.outline = new BooleanSetting("Outline", true);
      this.width = new NumberSetting<>("Width", 2.0F, 1.0F, 5.0F).incremental(0.5);
      this.f2647 = (ColorSetting)null;
      this.health = new EnumSetting<>("Health", NametagsHealth.f3570);
      boolean var10030 = true;
      this.gamemode = new BooleanSetting("Gamemode", true);
      boolean var10029 = true;
      this.ping = new BooleanSetting("Ping", true);
      this.totempops = new BooleanSetting("TotemPops", false);
      this.entityid = new BooleanSetting("EntityID", false);
      boolean var10026 = true;
      this.horseinfo = new BooleanSetting("HorseInfo", true);
      this.friendcolor = new EnumSetting<>("FriendColor", NametagsFriendcolor.f4943);
      boolean var10024 = true;
      this.items = new BooleanSetting("Items", true);
      boolean var10023 = true;
      this.armor = new BooleanSetting("Armor", true);
      this.reversed = new BooleanSetting("Reversed", false);
      boolean var10021 = true;
      this.mainhand = new BooleanSetting("MainHand", true);
      boolean var10020 = true;
      this.offhand = new BooleanSetting("OffHand", true);
      boolean var10019 = true;
      this.durability = new BooleanSetting("Durability", true);
      this.f2675 = new NumberSetting<>("Scale", 0.5F, 0.25F, 1.0F).incremental(0.05F);
      boolean var10017 = true;
      this.enchants = new BooleanSetting("Enchants", true);
      this.mode = new EnumSetting<>("Mode", NametagsMode.f9621);
      boolean var10015 = true;
      this.simple = new BooleanSetting("Simple", true);
      this.f2678 = (ColorSetting)null;
      this.f2665 = new NumberSetting<>("Scale", 0.5F, 0.25F, 1.0F).incremental(0.05F);
      boolean var10012 = true;
      this.itemname = new BooleanSetting("ItemName", true);
      this.f2646 = new NumberSetting<>("Scale", 0.5F, 0.25F, 1.0F).incremental(0.05F);
      this.armorstands = new BooleanSetting("ArmorStands", false);
      Class607 var10004 = new Class607(this);
      boolean var10009 = true;
      this.f2644 = var10004.m9192(true, true, false, false, false).m9198(false).m9206(false, false).m9205(false).m9207(false);
      this.f2659 = new ArrayList<>();
      Formatting[] var7 = new Formatting[var10001];
      var7[0] = Formatting.GREEN;
      boolean var10005 = true;
      var7[1] = Formatting.DARK_GREEN;
      var7[2] = Formatting.YELLOW;
      var7[3] = Formatting.GOLD;
      var7[4] = Formatting.RED;
      var7[5] = Formatting.DARK_RED;
      this.f2672 = var7;
      BooleanSetting var10000 = this.nameplate;
      Setting[] var8 = new Setting[8];
      var8[0] = this.background;
      var10005 = true;
      var8[1] = this.health;
      var8[2] = this.gamemode;
      var8[3] = this.ping;
      var8[4] = this.totempops;
      var8[5] = this.entityid;
      var8[6] = this.horseinfo;
      var8[7] = this.friendcolor;
      var10000.addSubSettings(var8);
      var10000 = this.background;
      Setting[] var9 = new Setting[]{this.rounded, null, null};
      var10005 = true;
      var9[1] = this.color;
      var9[2] = this.outline;
      var10000.addSubSettings(var9);
      boolean var10003 = true;
      this.rounded.addSubSettings(this.radius);
      var10000 = this.outline;
      Setting[] var10 = new Setting[]{this.width, null};
      var10005 = true;
      var10[1] = this.f2647;
      var10000.addSubSettings(var10);
      var10000 = this.items;
      Setting[] var11 = new Setting[]{this.armor, null, null, null, null};
      var10005 = true;
      var11[1] = this.mainhand;
      var11[2] = this.offhand;
      var11[3] = this.durability;
      var11[4] = this.enchants;
      var10000.addSubSettings(var11);
      var10003 = true;
      this.armor.addSubSettings(this.reversed);
      var10003 = true;
      this.durability.addSubSettings(this.f2675);
      var10000 = this.enchants;
      Setting[] var12 = new Setting[]{this.mode, null, null};
      var10005 = true;
      var12[1] = this.simple;
      var12[2] = this.f2665;
      var10000.addSubSettings(var12);
      var10003 = true;
      this.simple.addSubSettings(this.f2678);
      var10003 = true;
      this.itemname.addSubSettings(this.f2646);
      var10003 = true;
      this.f2644.addSubSettings(this.armorstands);
      Setting[] var13 = new Setting[8];
      var13[0] = this.nameplate;
      var10005 = true;
      var13[1] = this.items;
      var13[2] = this.itemname;
      var13[3] = this.scale;
      var13[4] = this.scaleLargerWhenYouMoveCloserToTheEntity;
      var13[5] = this.customfont;
      var13[6] = this.multiline;
      var13[7] = this.f2644;
      this.registerSettings(var13);
   }

   public void m5915(Entity var1, IRenderer2D var2, IFontRenderer var3, DrawContext var4) {
      int var7;
      double var8;
      Entity var23;
      label47: {
         int var21 = Class253.m9155();
         var8 = 0.0;
         var7 = var21;
         boolean var22 = (Boolean)this.nameplate.getValue();
         if (var7 != 0) {
            if (var22) {
               var8 += this.m5911(var1, var2, var3, var8);
            }

            var23 = var1;
            if (var7 == 0) {
               break label47;
            }

            var22 = var1 instanceof LivingEntity;
         }

         if (!var22) {
            return;
         }

         var23 = var1;
      }

      LivingEntity var15 = (LivingEntity)var23;
      boolean var24 = (Boolean)this.items.getValue();
      if (var7 != 0) {
         if (var24) {
            var8 += this.m5913(var15, var2, var3, var4, var8);
         }

         var24 = (Boolean)this.itemname.getValue();
      }

      if (var7 != 0) {
         if (!var24) {
            return;
         }

         var24 = var15.getMainHandStack().isEmpty();
      }

      if (!var24) {
         MatrixStack var18 = var4.getMatrices();
         float var19 = this.f2646.getValue();
         double var10 = var3.getFontHeight();
         String var16;
         double var12 = var3.getStringWidth(var16 = var15.getMainHandStack().getName().getString());
         var18.push();
         var18.translate(0.0, -var8, 0.0);
         var18.scale(var19, var19, 1.0F);
         var3.drawString(var16, -(var12 / 2.0), -var10, -1);
         var18.pop();
         var8 += var10 * var19 + 1.0;
      }
   }

   @Subscribe
   public void onNametag(EventRenderEntity$Nametag var1) {
      if ((Boolean)this.nameplate.getValue()) {
         Entity var5 = var1.getEntity();
         if (this.f2644.m7993(var5)) {
            boolean var10003 = true;
            var1.setCancelled(true);
         }
      }
   }
}
