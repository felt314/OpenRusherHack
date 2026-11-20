package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.command.Module108;
import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
import org.rusherhack.client.api.feature.module.impl.combat.AutoDisconnect;
import org.rusherhack.client.api.feature.module.impl.misc.AutoReconnect;
public class Module578 extends ToggleableModule {
   public BooleanSetting tracer;
   public BooleanSetting beam;
   public ColorSetting color;
   public BooleanSetting box;
   public BooleanSetting nametag;
   public BooleanSetting autodisconnect;
   public NumberSetting<Float> scale;
   public BooleanSetting vertical;
   public EnumSetting<Enum578> mode;
   public NumberSetting<Float> range;
   public BooleanSetting customfont;
   public static long f9280 = Class066.m4320(-6067727968580045955L, -8293775321398358408L, MethodHandles.lookup().lookupClass()).m4325(240165829248410L);
   public static Object[] f9287 = new Object[183];
   public static String[] f9288 = new String[183];

   @Subscribe
   public void onRender2D(EventRender2D var1) {
        
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   @Override
   public ModuleCommand createCommand() {
        return null;
    }

   public Module578() {
      super(
         "Waypoints",
         "Save points in the world and view them",
         ModuleCategory.WORLD
      );
      this.mode = new EnumSetting<>("Mode", Enum578.f7170);
      boolean var10016 = true;
      this.nametag = new BooleanSetting("Nametag", true);
      boolean var10015 = true;
      this.customfont = new BooleanSetting("CustomFont", true);
      boolean var10014 = true;
      this.vertical = new BooleanSetting("Vertical", true);
      this.scale = new NumberSetting<>("Scale", 1.0F, 0.1F, 5.0F);
      boolean var10012 = true;
      this.beam = new BooleanSetting("Beam", true);
      this.box = new BooleanSetting("Box", false);
      this.tracer = new BooleanSetting("Tracer", false);
      this.autodisconnect = new BooleanSetting("AutoDisconnect", false);
      this.range = new NumberSetting<>("Range", 20.0F, 0.0F, 100.0F);
      ColorSetting var10002 = (ColorSetting)null;
      boolean var10005 = true;
      this.color = var10002.setThemeSync(true);
      BooleanSetting var10000 = this.nametag;
      Setting[] var10001 = new Setting[]{this.customfont, null, null};
      var10005 = true;
      var10001[1] = this.vertical;
      var10001[2] = this.scale;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.autodisconnect.addSubSettings(this.range);
      var10001 = new Setting[7];
      var10001[0] = this.mode;
      var10005 = true;
      var10001[1] = this.nametag;
      var10001[2] = this.beam;
      var10001[3] = this.box;
      var10001[4] = this.tracer;
      var10001[5] = this.autodisconnect;
      var10001[6] = this.color;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
        
    }

   public HashMap<Class086, Vec3d> m17750() {
        return null;
    }
   public static int m178(long var0, long var2) {
        return 0;
    }
   public static Class m180(long var0, long var2) {
        return null;
    }

   public static Field m181(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m182(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m183(long var0, long var2) {
        return null;
    }

   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m186(long var0, long var2) {
        return null;
    }

   public static MethodHandle m187(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
        return null;
    }

   public static Object m188(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
        return null;
    }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
        return null;
    }
}
