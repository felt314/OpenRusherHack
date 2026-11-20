package org.rusherhack;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.Freecam;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.config.JsonConfiguration;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.core.command.AbstractCommand;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.feature.IFeature;
import org.rusherhack.core.feature.IFeatureManager;
import org.rusherhack.core.interfaces.INamed;
import org.rusherhack.core.serialize.Class062;

import org.rusherhack.command.config;
import org.rusherhack.command.modules;
import org.rusherhack.command.send;
import org.rusherhack.client.api.feature.module.impl.chat.Announcer;
import org.rusherhack.client.api.feature.module.impl.chat.AntiSpam;
import org.rusherhack.client.api.feature.module.impl.chat.ArmorAlert;
import org.rusherhack.client.api.feature.module.impl.chat.AutoReply;
import org.rusherhack.client.api.feature.module.impl.chat.ChatAppend;
import org.rusherhack.client.api.feature.module.impl.chat.ChatColors;
import org.rusherhack.client.api.feature.module.impl.chat.ExtraChat;
import org.rusherhack.client.api.feature.module.impl.chat.FancyChat;
import org.rusherhack.client.api.feature.module.impl.chat.GreenText;
import org.rusherhack.client.api.feature.module.impl.chat.Greeter;
import org.rusherhack.client.api.feature.module.impl.chat.LagDetector;
import org.rusherhack.client.api.feature.module.impl.chat.RusherCrypt;
import org.rusherhack.client.api.feature.module.impl.chat.Spammer;
import org.rusherhack.client.api.feature.module.impl.chat.Timestamps;
import org.rusherhack.client.api.feature.module.impl.chat.Translate;
import org.rusherhack.client.api.feature.module.impl.client.Background;
import org.rusherhack.client.api.feature.module.impl.client.Capes;
import org.rusherhack.client.api.feature.module.impl.client.ClickGUI;
import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
import org.rusherhack.client.api.feature.module.impl.client.HUD;
import org.rusherhack.client.api.feature.module.impl.client.Windows;
import org.rusherhack.client.api.feature.module.impl.combat.Anchor;
import org.rusherhack.client.api.feature.module.impl.combat.Aura;
import org.rusherhack.client.api.feature.module.impl.combat.AutoArmor;
import org.rusherhack.client.api.feature.module.impl.combat.AutoCrystal;
import org.rusherhack.client.api.feature.module.impl.combat.AutoDisconnect;
import org.rusherhack.client.api.feature.module.impl.combat.AutoEXP;
import org.rusherhack.client.api.feature.module.impl.combat.AutoSurround;
import org.rusherhack.client.api.feature.module.impl.combat.AutoTotem;
import org.rusherhack.client.api.feature.module.impl.combat.AutoTrap;
import org.rusherhack.client.api.feature.module.impl.combat.AutoWeb;
import org.rusherhack.client.api.feature.module.impl.combat.BowAimbot;
import org.rusherhack.client.api.feature.module.impl.combat.BowSpam;
import org.rusherhack.client.api.feature.module.impl.combat.Criticals;
import org.rusherhack.client.api.feature.module.impl.combat.HoleFiller;
import org.rusherhack.client.api.feature.module.impl.combat.HotbarReplenish;
import org.rusherhack.client.api.feature.module.impl.combat.Ignite;
import org.rusherhack.client.api.feature.module.impl.combat.PvpInfo;
import org.rusherhack.client.api.feature.module.impl.combat.Quiver;
import org.rusherhack.client.api.feature.module.impl.combat.TriggerBot;
import org.rusherhack.client.api.feature.module.impl.misc.AntiAim;
import org.rusherhack.client.api.feature.module.impl.misc.AntiHunger;
import org.rusherhack.client.api.feature.module.impl.misc.AntiPacket;
import org.rusherhack.client.api.feature.module.impl.misc.AntiQuit;
import org.rusherhack.client.api.feature.module.impl.misc.AutoAccept;
import org.rusherhack.client.api.feature.module.impl.misc.AutoMount;
import org.rusherhack.client.api.feature.module.impl.misc.AutoNametag;
import org.rusherhack.client.api.feature.module.impl.misc.AutoReconnect;
import org.rusherhack.client.api.feature.module.impl.misc.AutoRespawn;
import org.rusherhack.client.api.feature.module.impl.misc.AutoSorter;
import org.rusherhack.client.api.feature.module.impl.misc.AutoTrader;
import org.rusherhack.client.api.feature.module.impl.misc.Enum186;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraChest;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraCraft;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraScreenshot;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraTab;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraTooltips;
import org.rusherhack.client.api.feature.module.impl.misc.Gamemode;
import org.rusherhack.client.api.feature.module.impl.misc.HitboxIgnore;
import org.rusherhack.client.api.feature.module.impl.misc.LagReducer;
import org.rusherhack.client.api.feature.module.impl.misc.Module603;
import org.rusherhack.client.api.feature.module.impl.misc.NoForceRotate;
import org.rusherhack.client.api.feature.module.impl.misc.PingSpoof;
import org.rusherhack.client.api.feature.module.impl.misc.PortalGui;
import org.rusherhack.client.api.feature.module.impl.movement.AutoWalk;
import org.rusherhack.client.api.feature.module.impl.movement.BoatFly;
import org.rusherhack.client.api.feature.module.impl.movement.ElytraFly;
import org.rusherhack.client.api.feature.module.impl.movement.ElytraTweaks;
import org.rusherhack.client.api.feature.module.impl.movement.EntityControl;
import org.rusherhack.client.api.feature.module.impl.movement.EntitySpeed;
import org.rusherhack.client.api.feature.module.impl.movement.Flight;
import org.rusherhack.client.api.feature.module.impl.movement.IceSpeed;
import org.rusherhack.client.api.feature.module.impl.movement.Jesus;
import org.rusherhack.client.api.feature.module.impl.movement.Module386;
import org.rusherhack.client.api.feature.module.impl.movement.NoFall;
import org.rusherhack.client.api.feature.module.impl.movement.NoSlow;
import org.rusherhack.client.api.feature.module.impl.movement.Parkour;
import org.rusherhack.client.api.feature.module.impl.movement.Safewalk;
import org.rusherhack.client.api.feature.module.impl.movement.Sprint;
import org.rusherhack.client.api.feature.module.impl.movement.Step;
import org.rusherhack.client.api.feature.module.impl.movement.TridentTweaks;
import org.rusherhack.client.api.feature.module.impl.movement.Velocity;
import org.rusherhack.client.api.feature.module.impl.movement.WaterSpeed;
import org.rusherhack.client.api.feature.module.impl.player.AntiLevitation;
import org.rusherhack.client.api.feature.module.impl.player.AutoEat;
import org.rusherhack.client.api.feature.module.impl.player.AutoFish;
import org.rusherhack.client.api.feature.module.impl.player.AutoMine;
import org.rusherhack.client.api.feature.module.impl.player.AutoTool;
import org.rusherhack.client.api.feature.module.impl.player.AutoWither;
import org.rusherhack.client.api.feature.module.impl.player.Blink;
import org.rusherhack.client.api.feature.module.impl.player.ChorusControl;
import org.rusherhack.client.api.feature.module.impl.player.FastUse;
import org.rusherhack.client.api.feature.module.impl.player.GhostHand;
import org.rusherhack.client.api.feature.module.impl.player.InventoryCleaner;
import org.rusherhack.client.api.feature.module.impl.player.MiddleClick;
import org.rusherhack.client.api.feature.module.impl.player.Module266;
import org.rusherhack.client.api.feature.module.impl.player.MultiTask;
import org.rusherhack.client.api.feature.module.impl.player.Phase;
import org.rusherhack.client.api.feature.module.impl.player.PortalGodMode;
import org.rusherhack.client.api.feature.module.impl.player.Reach;
import org.rusherhack.client.api.feature.module.impl.player.RotationLock;
import org.rusherhack.client.api.feature.module.impl.player.Swing;
import org.rusherhack.client.api.feature.module.impl.player.TickShift;
import org.rusherhack.client.api.feature.module.impl.player.XCarry;
import org.rusherhack.client.api.feature.module.impl.render.BlockOutline;
import org.rusherhack.client.api.feature.module.impl.render.Borders;
import org.rusherhack.client.api.feature.module.impl.render.BossStack;
import org.rusherhack.client.api.feature.module.impl.render.BreadCrumbs;
import org.rusherhack.client.api.feature.module.impl.render.BreakESP;
import org.rusherhack.client.api.feature.module.impl.render.Chams;
import org.rusherhack.client.api.feature.module.impl.render.Crosshair;
import org.rusherhack.client.api.feature.module.impl.render.ESP;
import org.rusherhack.client.api.feature.module.impl.render.FreeLook;
import org.rusherhack.client.api.feature.module.impl.render.FullBright;
import org.rusherhack.client.api.feature.module.impl.render.Hitmarkers;
import org.rusherhack.client.api.feature.module.impl.render.HoleESP;
import org.rusherhack.client.api.feature.module.impl.render.LogoutSpots;
import org.rusherhack.client.api.feature.module.impl.render.Nametags;
import org.rusherhack.client.api.feature.module.impl.render.NoRender;
import org.rusherhack.client.api.feature.module.impl.render.RainbowEnchant;
import org.rusherhack.client.api.feature.module.impl.render.RangeCircle;
import org.rusherhack.client.api.feature.module.impl.render.Search;
import org.rusherhack.client.api.feature.module.impl.render.Trajectories;
import org.rusherhack.client.api.feature.module.impl.render.ViewClip;
import org.rusherhack.client.api.feature.module.impl.render.ViewModel;
import org.rusherhack.client.api.feature.module.impl.render.Xray;
import org.rusherhack.client.api.feature.module.impl.render.Zoom;
import org.rusherhack.client.api.feature.module.impl.world.AirPlace;
import org.rusherhack.client.api.feature.module.impl.world.AutoTunnel;
import org.rusherhack.client.api.feature.module.impl.world.Avoid;
import org.rusherhack.client.api.feature.module.impl.world.BaseFinder;
import org.rusherhack.client.api.feature.module.impl.world.BlockTweaks;
import org.rusherhack.client.api.feature.module.impl.world.ClientSideTime;
import org.rusherhack.client.api.feature.module.impl.world.Environment;
import org.rusherhack.client.api.feature.module.impl.world.FastBreak;
import org.rusherhack.client.api.feature.module.impl.world.FastPlace;
import org.rusherhack.client.api.feature.module.impl.world.ForcePlace;
import org.rusherhack.client.api.feature.module.impl.world.LiquidInteract;
import org.rusherhack.client.api.feature.module.impl.world.MobOwner;
import org.rusherhack.client.api.feature.module.impl.world.Module011;
import org.rusherhack.client.api.feature.module.impl.world.Module578;
import org.rusherhack.client.api.feature.module.impl.world.NewChunks;
import org.rusherhack.client.api.feature.module.impl.world.NoGlitchBlocks;
import org.rusherhack.client.api.feature.module.impl.world.NoMineAnimation;
import org.rusherhack.client.api.feature.module.impl.world.Nuker;
import org.rusherhack.client.api.feature.module.impl.world.Scaffold;
import org.rusherhack.client.api.feature.module.impl.world.SelfBlock;
import org.rusherhack.client.api.feature.module.impl.world.SourceRemover;
public class Class446 implements IFeatureManager<IModule>, Class062 {
   public List<IModule> f7312;
   public boolean f7313;
   public JsonConfiguration f7314;
   public HashSet<IModule> f7315;
   public static long f7316 = Class066.m4320(-1018483780548007985L, -6646943129100774081L, MethodHandles.lookup().lookupClass()).m4325(247703204580666L);
   public static String[] f7317;
   public static String[] f7318;
   public static Object[] f7320 = new Object[102];
   public static String[] f7321 = new String[102];

   public String m14145() {
        return null;
    }

   public Class446() {
      super();
      this.f7312 = new ArrayList<>();
      this.f7313 = false;
      this.f7315 = new HashSet<>();
      this.m14152();
      this.f7313 = true;
      this.f7314 = JsonConfiguration.createConfiguration("modules", "construct");
      Class170.f3364.m7112().m8473(this, this.f7314);
      Class170.f3362.subscribe(this);
   }

   public List<IModule> m14146() {
        return null;
    }

   public void m14147(String var1, boolean var2) {
        
    }

   public List<File> m14148() {
        return null;
    }

   @Override
   public Optional<IModule> getFeature(String var1) {
        return null;
    }

   @Subscribe
   public void m14149(Class263 var1) {
        
    }

   public boolean m14150(IModule var1) {
        return false;
    }

   public boolean m14151(JsonElement var1) {
        return false;
    }

   public void m14152() {
        
    }

   public JsonElement m14153() {
        return null;
    }

   public void m14155(IModule var1) {
        
    }

   public <T extends IFeature> T m14156(Class<T> var1) {
      for (IModule var6 : this.f7312) {
         if (var6.getClass() == var1) {
            return (T)var6;
         }
      }

      return null;
   }

   static {
    }
   public static String m117(byte[] var0) {
        return null;
    }
   public static void m122() {
        
    }
}
