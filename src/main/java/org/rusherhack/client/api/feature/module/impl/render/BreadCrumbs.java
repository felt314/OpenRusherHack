package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.Class219;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.BreadCrumbsCommand;
import org.rusherhack.command.clear;
public class BreadCrumbs extends ToggleableModule {
   public List<Class219> f2414;
   public ColorSetting color;
   public BooleanSetting active;
   public NumberSetting<Integer> limit;
   public NumberSetting<Float> width;
   public static long f2419 = Class066.m4320(-6367586928355065643L, 3784813887921861662L, MethodHandles.lookup().lookupClass()).m4325(138658753346657L);
   public static long[] f2423;
   public static Integer[] f2424;
   public static Map f2425;

   

   @Override
   public ModuleCommand createCommand() {
        return null;
    }

   @Subscribe
   public void onQuit(EventQuit var1) {
        
    }

   public BreadCrumbs() {
        super("BreadCrumbs", CommandProcessingSink.m1291("YG|Bn\u0015|\u0015q\\sP=Wx]t[y\u0015dZh"), ModuleCategory.RENDER);
      long var1 = f2419 ^ 27996598683868L;

      boolean var10012 = true;
      this.active = new BooleanSetting("Active", true);
      this.width = new NumberSetting<>("Width", 1.0F, 0.1F, 5.0F);
      this.limit = new NumberSetting<>("Limit", m175(646, 8032376911983254982L ^ var1), 0, m175(14708, 7914089609456428597L ^ var1));
      this.color = (ColorSetting)null;
      this.f2414 = new ArrayList<>();
      Setting[] var10001 = new Setting[]{this.active, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.width;
      var10001[2] = this.limit;
      var10001[3] = this.color;
      this.registerSettings(var10001);
   }

   @Override
   public void onDisable() {
        
    }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
        
    }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
        
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }
   public static int m175(int var0, long var1) {
        return 0;
    }

   public static int m176(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
        return 0;
    }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
        return null;
    }
   public static Field m181(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m182(Class var0, String var1, Class var2) {
        return null;
    }
   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }
}
