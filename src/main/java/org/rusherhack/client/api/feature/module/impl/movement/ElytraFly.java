package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import org.rusherhack.Util240;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.input.Input;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.OnGroundOnly;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinFireworkRocketEntity;
import org.rusherhack.client.api.events.client.EventTimerSpeed;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.render.EventRenderEntity$PlayerRotations;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.baritone;
import org.rusherhack.command.bind;
import org.rusherhack.command.pitch;
import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.misc.PingSpoof;
public class ElytraFly extends ToggleableModule {
   public float f8963;
   public BooleanSetting highwayobstaclepasser;
   public NumberSetting<Float> f8965;
   public BooleanSetting useFireworkRocketsWhileFlying;
   public NumberSetting<Double> maximumSpeedToReachInKmH;
   public BooleanSetting await;
   public BooleanSetting usetimer;
   public NumberSetting<Double> speed;
   public boolean f8971;
   public BooleanSetting onlyActivateWhileLookingDown;
   public BooleanSetting autoredeploy;
   public NumberSetting<Float> pitch;
   public Class455 f8975;
   public int f8976;
   public BooleanSetting debug;
   public NullSetting packetSettings;
   public BooleanSetting onlyBoostWhileLookingDown;
   public BooleanSetting noidle;
   public BooleanSetting boost;
   public BooleanSetting onground;
   public BooleanSetting antiafk;
   public BooleanSetting automatic;
   public Timer f8985;
   public BindSetting pause;
   public BooleanSetting axisalign;
   public BooleanSetting pauseinliquids;
   public NumberSetting<Double> verticalspeed;
   public BooleanSetting preventDurabilityLoss;
   public NumberSetting<Integer> f8991;
   public NumberSetting<Double> f8992;
   public int f8993;
   public static ElytraFly f8994;
   public boolean f8995;
   public BooleanSetting boostWhileHoldingForward;
   public NumberSetting<Integer> delayedascend;
   public int f8998;
   public boolean f8999;
   public Timer f9000;
   public BooleanSetting f9001;
   public BooleanSetting boostConstantly;
   public EnumSetting<Acceleration> mode;
   public BooleanSetting inventory;
   public int f9005;
   public NullSetting boostSettings;
   public Timer f9007;
   public NumberSetting<Float> timer;
   public int f9009;
   public BooleanSetting holdGlideWhileAboveTargety;
   public BooleanSetting automaticallyTakeOffWhenYouJump;
   public EnumSetting<ElytraFlyAscend> ascend;
   public BooleanSetting descending;
   public java.util.Queue<Packet<?>> f9014;
   public NumberSetting<Integer> staticdelay;
   public NumberSetting<Integer> targety;
   public NumberSetting<Integer> boostticks;
   public BooleanSetting bypass2b2tSAnticheat;
   public long f9019;
   public double f9020;
   public float f9021;
   public boolean f9022;
   public BooleanSetting yalign;
   public NumberSetting<Double> f9024;
   public boolean f9025;
   public NullSetting controlSettings;
   public float f9027;
   public BooleanSetting lagredeploy;
   public boolean f9029;
   public boolean f9030;
   public NumberSetting<Double> distance;
   public BooleanSetting autojump;
   public NullSetting bounceSettings;
   public NumberSetting<Float> speedRequiredToStartAscendingInKmH;
   public NumberSetting<Integer> maximumy;
   public NumberSetting<Float> f9036;
   public BooleanSetting increaseSpeedAfterARubberband;
   public NumberSetting<Double> glidespeed;
   public EnumSetting<ElytraFlyDelaymode> delaymode;
   public BooleanSetting pitchspoof;
   public static long f9041 = Class066.m4320(-1761711757085736855L, -5974366905296749723L, MethodHandles.lookup().lookupClass()).m4325(211641127759011L);
   public static long[] f9045;
   public static Integer[] f9046;
   public static Map f9047;
   public static long[] f9048;
   public static Long[] f9049;
   public static Map f9050;
   public static Object[] f9051 = new Object[356];
   public static String[] f9052 = new String[356];

   public boolean m17205(boolean var1, boolean var2) {
        return false;
    }

   public ElytraFly() {
        super("ElytraFly", "Fly easier with elytras", ModuleCategory.MOVEMENT);
      int var3;
      label18: {
         long var1 = f9041 ^ 25406099536400L;

         this.mode = new EnumSetting<>("Mode", Acceleration.f6254);
         boolean var10007 = true;
         this.automaticallyTakeOffWhenYouJump = new BooleanSetting("TakeOff", "Automatically take off when you jump", true).setVisibility(() -> {
            if (this.mode.getValue() != Acceleration.f6251) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
         int var10000 = Class253.m9154();
         boolean var10009 = true;
         this.descending = new BooleanSetting("Descending", "Only activate when you are falling back down; Useful for 1.12.2 servers", true);
         this.timer = new NumberSetting<>("Timer", 1.0F, 0.05F, 1.0F).incremental(0.05F);
         boolean var10008 = true;
         this.autoredeploy = new BooleanSetting("AutoRedeploy", "Automatically redeploy into elytra if the server un-deploys you", true).setVisibility(() -> {
            if (this.mode.getValue() != Acceleration.f6251) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
         var10008 = true;
         this.usetimer = new BooleanSetting("UseTimer", true);
         var10007 = true;
         this.pauseinliquids = new BooleanSetting("PauseInLiquids", true).setVisibility(() -> {
            if (this.mode.getValue() != Acceleration.f6257 && this.mode.getValue() != Acceleration.f6249) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
         this.controlSettings = new NullSetting("Control Settings").setVisibility(() -> {
            if (this.mode.getValue() == Acceleration.f6254) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
         this.speed = new NumberSetting<>("Speed", 1.0, 0.1, 10.0).incremental(0.01);
         this.verticalspeed = new NumberSetting<>("VerticalSpeed", 1.0, 0.1, 10.0).incremental(0.1);
         this.useFireworkRocketsWhileFlying = new BooleanSetting("Fireworks", "Use firework rockets while flying", false);
         boolean var10013 = true;
         this.inventory = new BooleanSetting("Inventory", true);
         boolean var10012 = true;
         this.lagredeploy = new BooleanSetting("LagRedeploy", true);
         this.noidle = new BooleanSetting("NoIdle", false);
         Integer var39 = m175(1593, 2288540130501153361L ^ var1);
         boolean var10011 = true;
         this.delayedascend = new NumberSetting<>("DelayedAscend", var39, 1, m175(1593, 2288540130501153361L ^ var1));
         this.await = new BooleanSetting("Await", false);
         this.delaymode = new EnumSetting<>("DelayMode", ElytraFlyDelaymode.f4364);
         this.staticdelay = new NumberSetting<>(
               "StaticDelay",
               m175(1719, 3397313510070178507L ^ var1),
               m175(23424, 5542802419208065022L ^ var1),
               m175(26848, 5775256784014064784L ^ var1)
            )
            .setVisibility(() -> {
               return this.delaymode.getValue().equals(ElytraFlyDelaymode.f4363);
            });
         var3 = var10000;
         this.ascend = new EnumSetting<>("Ascend", ElytraFlyAscend.f2273);
         this.glidespeed = new NumberSetting<>("GlideSpeed", 0.0, 0.0, 0.1);
         this.boostSettings = new NullSetting("Boost Settings").setVisibility(() -> {
            if (this.mode.getValue() == Acceleration.f6253) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
         boolean var10016 = true;
         this.automatic = new BooleanSetting("Automatic", true);
         this.boostticks = new NumberSetting<>(
            "BoostTicks", "Number of ticks to boost for", m175(5389, 6723203656654963042L ^ var1), 0, m175(2586, 2986461635503414903L ^ var1)
         );
         this.targety = new NumberSetting<>(
            "TargetY",
            "The minimum Y level to ascend to",
            m175(17492, 2803562361825792039L ^ var1),
            m175(20308, 4659539745762122552L ^ var1),
            m175(30771, 1272906652432084036L ^ var1)
         );
         this.maximumy = new NumberSetting<>(
            "MaximumY",
            "The maximum Y level to ascend to",
            m175(30300, 522374059040416296L ^ var1),
            m175(17064, 2659838852888630982L ^ var1),
            m175(6851, 3971258749164900022L ^ var1)
         );
         this.speedRequiredToStartAscendingInKmH = new NumberSetting<>("EmergeSpeed", "Speed required to start ascending in km/h", 140.0F, 10.0F, 140.0F)
            .incremental(0.5);
         this.holdGlideWhileAboveTargety = new BooleanSetting("Stabilize", "Hold glide while above TargetY", false);
         this.boostConstantly = new BooleanSetting("Constant", "Boost constantly", false);
         NumberSetting var10005 = new NumberSetting<>("EmergePitch", -40.0F, -90.0F, 90.0F).incremental(1.0);
         var10008 = true;
         this.f8965 = var10005.setHidden(true);
         NumberSetting var10004 = new NumberSetting<>("GainPitch", 40.0F, -90.0F, 90.0F).incremental(1.0);
         var10007 = true;
         this.f9036 = var10004.setHidden(true);
         this.f9024 = new NumberSetting<>("Speed", 0.5, 0.1, 3.0).incremental(0.1);
         this.maximumSpeedToReachInKmH = new NumberSetting<>("SpeedLimit", "Maximum speed to reach in km/h", 190.0, 60.0, 300.0).incremental(1.0);
         var10007 = true;
         this.onlyBoostWhileLookingDown = new BooleanSetting("PitchCheck", "Only boost while looking down", true).setVisibility(() -> {
            if (!(Boolean)this.automatic.getValue()) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
         boolean var10006 = true;
         this.boostWhileHoldingForward = new BooleanSetting("UseForward", "Boost while holding forward", true).setVisibility(() -> {
            if (!(Boolean)this.automatic.getValue()) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
         this.f9001 = new BooleanSetting("LagRedeploy", false);
         this.increaseSpeedAfterARubberband = new BooleanSetting("UpdatedNCP", "Increase speed after a rubberband", false);
         this.pause = new BindSetting("Pause", NullKey.INSTANCE);
         this.packetSettings = new NullSetting("Packet Settings").setVisibility(() -> {
            if (this.mode.getValue() == Acceleration.f6251) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
         this.f8992 = new NumberSetting<>("Speed", 1.0, 0.1, 10.0).incremental(0.1);
         this.onground = new BooleanSetting("OnGround", false);
         var10007 = true;
         this.antiafk = new BooleanSetting("AntiAFK", true);
         this.bounceSettings = new NullSetting("Bounce Settings").setVisibility(() -> {
            if (this.mode.getValue() == Acceleration.f6249) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
         boolean var10054 = true;
         this.pitchspoof = new BooleanSetting("PitchSpoof", true);
         this.pitch = new NumberSetting<>("Pitch", 75.0F, 0.0F, 90.0F).incremental(1.0);
         this.onlyActivateWhileLookingDown = new BooleanSetting("Control", "Only activate while looking down", false);
         boolean var10053 = true;
         this.preventDurabilityLoss = new BooleanSetting("Packet", "Prevent durability loss", true);
         boolean var10051 = true;
         this.boost = new BooleanSetting("Boost", true);
         this.bypass2b2tSAnticheat = new BooleanSetting("Delay", "Bypass 2b2t's anticheat", false);
         boolean var10049 = true;
         this.autojump = new BooleanSetting("AutoJump", true);
         this.highwayobstaclepasser = new BooleanSetting("HighwayObstaclePasser", "Uses baritone to pass obstacles that get in your way", false);
         this.distance = new NumberSetting<>("Distance", 10.0, 1.0, 20.0).incremental(0.5);
         this.axisalign = new BooleanSetting("AxisAlign", false);
         this.yalign = new BooleanSetting("YAlign", false);
         this.f8991 = new NumberSetting<>("Level", m175(10911, 6914291277249314534L ^ var1), 5, m175(25564, 2108991887999416225L ^ var1));
         BooleanSetting var10038 = new BooleanSetting("Debug", false);
         boolean var10041 = true;
         this.debug = var10038.setHidden(true);
         this.f9021 = 1.0F;
         this.f9019 = System.currentTimeMillis();
         this.f8999 = false;
         this.f9022 = false;
         this.f9020 = 0.0;
         this.f9007 = new Timer();
         this.f9000 = new Timer();
         this.f8985 = new Timer();
         this.f8963 = 0.0F;
         this.f9027 = 0.0F;
         this.f9009 = 0;
         this.f8976 = 0;
         this.f8995 = false;
         this.f8975 = new Class455(this);
         this.f8993 = 0;
         this.f8998 = 0;
         this.f9029 = false;
         this.f8971 = false;
         this.f9005 = 0;
         this.f9014 = new ArrayDeque<>();
         this.f9025 = false;
         f8994 = this;
         BooleanSetting var5 = this.automaticallyTakeOffWhenYouJump;
         Setting[] var10001 = new Setting[]{this.descending, null};
         boolean var24 = true;
         var10001[1] = this.timer;
         var5.addSubSettings(var10001);
         BooleanSetting var6 = this.automatic;
         var10001 = new Setting[m175(30744, 3300445236705045602L ^ var1)];
         var10001[0] = this.boostticks;
         boolean var25 = true;
         var10001[1] = this.targety;
         var10001[2] = this.maximumy;
         var10001[3] = this.speedRequiredToStartAscendingInKmH;
         var10001[4] = this.boostConstantly;
         var10001[5] = this.holdGlideWhileAboveTargety;
         var10001[m175(23609, 4610609764584294475L ^ var1)] = this.f8965;
         var10001[m175(4300, 2703937052686697661L ^ var1)] = this.f9036;
         var6.addSubSettings(var10001);
         NullSetting var7 = this.boostSettings;
         var10001 = new Setting[m175(9510, 1357008009286021470L ^ var1)];
         var10001[0] = Acceleration.f6253.acceleration;
         boolean var26 = true;
         var10001[1] = this.automatic;
         var10001[2] = this.f9024;
         var10001[3] = this.maximumSpeedToReachInKmH;
         var10001[4] = this.increaseSpeedAfterARubberband;
         var10001[5] = this.onlyBoostWhileLookingDown;
         var10001[m175(9551, 2008246603984400684L ^ var1)] = this.boostWhileHoldingForward;
         var10001[m175(28088, 502062674548701656L ^ var1)] = this.pause;
         var7.addSubSettings(var10001);
         BooleanSetting var8 = this.useFireworkRocketsWhileFlying;
         var10001 = new Setting[m175(28088, 502062674548701656L ^ var1)];
         var10001[0] = this.inventory;
         boolean var27 = true;
         var10001[1] = this.lagredeploy;
         var10001[2] = this.noidle;
         var10001[3] = this.delayedascend;
         var10001[4] = this.await;
         var10001[5] = this.delaymode;
         var10001[m175(9551, 2008246603984400684L ^ var1)] = this.staticdelay;
         var8.addSubSettings(var10001);
         NullSetting var9 = this.controlSettings;
         var10001 = new Setting[m175(9551, 2008246603984400684L ^ var1)];
         var10001[0] = Acceleration.f6254.acceleration;
         boolean var28 = true;
         var10001[1] = this.speed;
         var10001[2] = this.verticalspeed;
         var10001[3] = this.useFireworkRocketsWhileFlying;
         var10001[4] = this.ascend;
         var10001[5] = this.glidespeed;
         var9.addSubSettings(var10001);
         NullSetting var10 = this.packetSettings;
         var10001 = new Setting[]{Acceleration.f6251.acceleration, null, null, null};
         boolean var29 = true;
         var10001[1] = this.f8992;
         var10001[2] = this.onground;
         var10001[3] = this.antiafk;
         var10.addSubSettings(var10001);
         BooleanSetting var11 = this.pitchspoof;
         var10001 = new Setting[]{this.pitch, null};
         boolean var30 = true;
         var10001[1] = this.onlyActivateWhileLookingDown;
         var11.addSubSettings(var10001);
         NullSetting var12 = this.bounceSettings;
         var10001 = new Setting[m175(9551, 2008246603984400684L ^ var1)];
         var10001[0] = Acceleration.f6249.acceleration;
         boolean var31 = true;
         var10001[1] = this.pitchspoof;
         var10001[2] = this.preventDurabilityLoss;
         var10001[3] = this.boost;
         var10001[4] = this.bypass2b2tSAnticheat;
         var10001[5] = this.autojump;
         var12.addSubSettings(var10001);
         var10001 = new Setting[m175(20423, 3654079493734865829L ^ var1)];
         var10001[0] = this.mode;
         boolean var32 = true;
         var10001[1] = this.automaticallyTakeOffWhenYouJump;
         var10001[2] = this.autoredeploy;
         var10001[3] = this.pauseinliquids;
         var10001[4] = this.controlSettings;
         var10001[5] = this.boostSettings;
         var10001[m175(9551, 2008246603984400684L ^ var1)] = this.packetSettings;
         var10001[m175(28088, 502062674548701656L ^ var1)] = this.bounceSettings;
         var10001[m175(9510, 1357008009286021470L ^ var1)] = this.debug;
         this.registerSettings(var10001);
         if (var3 == 0) {
            if (!Class170.f3353) {
               break label18;
            }

            Class170.f3362.subscribe(Util240.f4284);
            boolean var10003 = true;
            this.yalign.addSubSettings(this.f8991);
            BooleanSetting var13 = this.highwayobstaclepasser;
            var10001 = new Setting[]{this.distance, null, null};
            boolean var33 = true;
            var10001[1] = this.axisalign;
            var10001[2] = this.yalign;
            var13.addSubSettings(var10001);
         }

         boolean var23 = true;
         this.registerSettings(this.highwayobstaclepasser);
      }

   }

   public boolean m17206() {
      long var1 = f9041 ^ 28667212554365L;
      int var3 = Class253.m9154();
      if (!this.f9000.passed(1000.0)) {
         return false;
      } else {
         boolean var10004 = true;
         int var4;
         int var5;
         int var10000;
         if ((var4 = InventoryUtils.findItem(Items.FIREWORK_ROCKET, true, true)) < m175(5285, 5348709436576930483L ^ var1)) {
            if (!(Boolean)this.inventory.getValue() || var4 == -1) {
               return false;
            }

            int var8;
            if ((var8 = InventoryUtils.findItemHotbar(Items.AIR)) == -1) {
               var8 = m175(9510, 1356993688614906675L ^ var1);
            }

            InventoryUtils.swapSlots(var4, var8);
            var10000 = var5 = var8 + m175(20028, 5876127379292110903L ^ var1);
         } else {
            var10000 = var5 = var4;
         }

         Hand var9 = var10000 < m175(2304, 7296524577113638665L ^ var1) ? Hand.MAIN_HAND : Hand.OFF_HAND;
         int var7 = Globals.mc.player.getInventory().selectedSlot;
         if (var3 == 0) {
            if (var9 == Hand.MAIN_HAND) {
               Globals.mc.player.getInventory().selectedSlot = var5 - m175(20028, 5876127379292110903L ^ var1);
            }

            Globals.mc.interactionManager.interactItem(Globals.mc.player, var9);
            this.f9000.reset();
         }

         if (var4 < m175(20028, 5876127379292110903L ^ var1)) {
            InventoryUtils.swapSlots(var4, Globals.mc.player.getInventory().selectedSlot);
         }

         Globals.mc.player.getInventory().selectedSlot = var7;
         if ((Boolean)this.debug.getValue()) {
            ChatUtils.print(System.currentTimeMillis() + " fire work!" + var4);
         }

         boolean var10002 = true;
         return true;
      }
   }

   @Subscribe
   public void m17208(Class206 var1) {
      long var2 = f9041 ^ 64455244440812L;
      if (this.mode.getValue().equals(Acceleration.f6249) && this.m17230()) {
         var1.m7978(this.pitch.getValue());
      } else if (this.mode.getValue().equals(Acceleration.f6253) && (Boolean)this.automatic.getValue()) {
         var1.m7978(this.f8975.m14323());
      } else {
         if (this.mode.getValue().equals(Acceleration.f6254)) {
            if ((Boolean)this.useFireworkRocketsWhileFlying.getValue()) {
               Class206 var6;
               label90: {
                  if (!(Boolean)this.noidle.getValue()) {
                     if (Globals.mc.player.input.jumping && this.f9009 > this.delayedascend.getValue() && this.f8985.passed(50.0)) {
                        var1.m7978(PlayerUtils.hasHorizontalInput() ? -35.0F : -90.0F);
                        var6 = var1;
                        break label90;
                     }

                     if (Globals.mc.player.input.sneaking && this.f8985.passed(50.0)) {
                        var1.m7978(PlayerUtils.hasHorizontalInput() ? 35.0F : 90.0F);
                        var6 = var1;
                        break label90;
                     }

                     if (PlayerUtils.hasHorizontalInput() && this.f9009 >= 0) {
                        var6 = var1;
                        var1.m7978(0.0F);
                        break label90;
                     }
                  } else if (this.f9009 > m175(1593, 2288579147293002925L ^ var2)) {
                     var1.m7978(0.0F);
                  }

                  var6 = var1;
               }

               var6.m7980(this.m17212());
            }

            if (this.ascend.getValue().equals(ElytraFlyAscend.f2274) && Globals.mc.player.input.jumping && !this.f9007.passed(1600.0)) {
               var1.m7978(-70.0F);
            }
         }
      }
   }

   @Subscribe
   public void onPlayerRotations(EventRenderEntity$PlayerRotations var1) {
      if (this.mode.getValue().equals(Acceleration.f6253) && (Boolean)this.automatic.getValue() && Globals.mc.player.isFallFlying()) {
         var1.setPitch(this.f8975.m14323());
      }
   }

   public float m17212() {
        return 0.0f;
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      long var2 = f9041 ^ 58406960308993L;
      int var4 = Class253.m9154();
      ItemStack var7;
      boolean var10000;
      if ((var7 = Globals.mc.player.getEquippedStack(EquipmentSlot.CHEST)).isOf(Items.ELYTRA) && ElytraItem.isUsable(var7)) {
         var10000 = true;
         boolean var12 = true;
      } else {
         var10000 = false;
         boolean var10002 = true;
      }

      boolean var5 = var10000;
      if (this.f9022
         && !Globals.mc.player.isFallFlying()
         && (Boolean)this.automaticallyTakeOffWhenYouJump.getValue()
         && this.mode.getValue() != Acceleration.f6251) {
         if (!Globals.mc.player.isOnGround()
            && !Globals.mc.player.isTouchingWater()
            && !Globals.mc.player.isInLava()
            && !Globals.mc.player.hasVehicle()
            && !Globals.mc.player.isClimbing()
            && !Globals.mc.player.hasStatusEffect(StatusEffects.LEVITATION)) {
            var10000 = true;
            boolean var14 = true;
         } else {
            var10000 = false;
            boolean var13 = true;
         }

         boolean var8 = var10000;
         if (!(Boolean)this.automaticallyTakeOffWhenYouJump.getValue() && !(Boolean)this.autoredeploy.getValue()) {
            var10000 = false;
            boolean var16 = true;
         } else {
            var10000 = true;
            boolean var15 = true;
         }

         boolean var6 = var10000;
         label152:
         if (var4 == 0) {
            if (var6 && var8 && var5) {
               if (!this.m17231()) {
                  break label152;
               }

               if (this.mode.getValue().equals(Acceleration.f6254) && (Boolean)this.useFireworkRocketsWhileFlying.getValue() && (Boolean)this.noidle.getValue()
                  )
                {
                  this.m17206();
               }

               if (!(Boolean)this.debug.getValue()) {
                  break label152;
               }

               ChatUtils.print("take off");
               if (var4 == 0) {
                  break label152;
               }
            }

            this.f9021 = 1.0F;
         }
      } else {
         this.f9021 = 1.0F;
      }

      this.f9022 = false;
      if (this.mode.getValue().equals(Acceleration.f6249) && var5 && this.f8998 <= 0) {
         boolean var10003 = true;
         Globals.mc.player.setSprinting(true);
         label134:
         if (!Globals.mc.player.isFallFlying() && (Boolean)this.autoredeploy.getValue()) {
            if (Globals.mc.player.isOnGround() && System.currentTimeMillis() - this.f9019 > m4692(30517, 7684540218079925038L ^ var2)) {
               int var10001 = m175(1593, 2288573092335307584L ^ var2);
               this.f9019 = System.currentTimeMillis();
               this.f9029 = true;
               this.f8971 = false;
               this.f9005 = var10001;
               if (var4 == 0) {
                  break label134;
               }
            }

            if (Globals.mc.player.getVelocity().y < 0.0 && Globals.mc.player.checkFallFlying()) {
               Globals.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(Globals.mc.player, Mode.START_FALL_FLYING));
            }
         }

         if (Globals.mc.player.isOnGround()) {
            this.f9030 = false;
         }
      }

      if (this.mode.getValue().equals(Acceleration.f6254) && Globals.mc.player.isFallFlying()) {
         Globals.mc.player.setVelocity(Vec3d.ZERO);
      }
   }

   public boolean m15315() {
        return false;
    }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
        
    }

   @Subscribe(
      stage = Stage.ALL
   )
   public void onMove(EventMove var1) {
        
    }

   public double m17220(double var1) {
        return 0.0;
    }

   public double m17221(boolean var1) {
      BlockHitResult var4;
      return (var4 = Globals.mc
                  .world
                  .raycast(
                     new RaycastContext(
                        Globals.mc.player.getPos(),
                        Globals.mc.player.getPos().subtract(0.0, 5.0, 0.0),
                        ShapeType.COLLIDER,
                        var1 ? FluidHandling.NONE : FluidHandling.ANY,
                        Globals.mc.player
                     )
                  ))
               .getType()
            == Type.MISS
         ? 999.0
         : var4.getPos().distanceTo(Globals.mc.player.getPos());
   }

   @Subscribe(
      stage = Stage.PRE
   )
   public void onReceive(EventPacket$Receive var1) {
      if (var1.getPacket() instanceof PlayerPositionLookS2CPacket && var1.getStage().equals(Stage.PRE)) {
         this.f9019 = System.currentTimeMillis();
         this.f9020 = 0.0;
         if (Globals.mc.player.isFallFlying()) {
            if (this.mode.getValue() == Acceleration.f6254 && (Boolean)this.useFireworkRocketsWhileFlying.getValue() && (Boolean)this.lagredeploy.getValue()
               || this.mode.getValue() == Acceleration.f6253 && (Boolean)this.f9001.getValue()) {
               Globals.mc.player.networkHandler.sendPacket(new OnGroundOnly(false));
               Globals.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(Globals.mc.player, Mode.START_FALL_FLYING));
            }

            boolean var10004 = true;
            this.f8975.m14325(true);
            if ((Boolean)this.debug.getValue()) {
               ChatUtils.print("rubberband");
            }
         }
      }
   }

   @Subscribe(
      stage = Stage.ALL
   )
   public void m17224(Event552 var1) {
        
    }

   @Override
   public void onEnable() {
      this.f9009 = 0;
      this.f9020 = 0.0;
      this.f8975.m14325(false);
      this.f9022 = false;
   }

   @Subscribe(
      priority = -1001
   )
   public void onSend(EventPacket$Send var1) {
        
    }

   public void m17227() {
      int var3 = Class253.m9154();
      ElytraFly var4 = this;

      while (!var4.f9014.isEmpty()) {
         Packet var5 = var4.f9014.poll();
         if (var3 == 0) {
            PingSpoof.m9754(var5);
            if (!(Boolean)var4.debug.getValue()) {
               continue;
            }

            ChatUtils.print("sent queued packet " + var5.getClass().getSimpleName());
         }

         if (var3 != 0) {
            break;
         }
      }
   }

   @Subscribe
   public void onTimerSpeed(EventTimerSpeed var1) {
      if ((Boolean)this.usetimer.getValue()) {
         var1.setSpeed(this.f9021);
      }
   }

   @Subscribe(
      stage = Stage.POST,
      priority = -100
   )
   public void m17229(EventPacket$Receive var1) {
      long var2 = f9041 ^ 60267160819880L;
      Packet var6;
      if (this.mode.getValue().equals(Acceleration.f6249)
         && (Boolean)this.autoredeploy.getValue()
         && (var6 = var1.getPacket()) instanceof EntityVelocityUpdateS2CPacket
         && ((EntityVelocityUpdateS2CPacket)var6).getEntityId() == Globals.mc.player.getId()
         && !var1.isCancelled()) {
         this.f8998 = m175(1593, 2288574993468010729L ^ var2);
      }
   }

   @Override
   public boolean isListening() {
      if (!this.f8999 && super.isListening()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void onDisable() {
        
    }

   public boolean m17230() {
      long var1 = f9041 ^ 99590723755070L;
      if (!(Boolean)this.pitchspoof.getValue()) {
         return false;
      } else if ((Boolean)this.onlyActivateWhileLookingDown.getValue() && Globals.mc.player.getPitch() < 0.0F) {
         return false;
      } else {
         boolean var10003 = true;
         double var4;
         if ((var4 = this.m17221(true)) > 4.0) {
            this.f9030 = true;
         }

         if (System.currentTimeMillis() - this.f9019 > m4692(23383, 4215933864606662768L ^ var1) && var4 <= 4.0 && !this.f9030) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean m17231() {
      long var1 = f9041 ^ 62402621157981L;
      boolean var10000;
      if (!(Boolean)this.autoredeploy.getValue()
         || System.currentTimeMillis() - this.f9019 >= m4692(28770, 5375921666336736551L ^ var1) && this.mode.getValue() != Acceleration.f6253) {
         var10000 = false;
         boolean var6 = true;
      } else {
         var10000 = true;
         boolean var10002 = true;
      }

      boolean var5 = var10000;
      if (!Globals.mc.options.jumpKey.isPressed() && !var5) {
         return false;
      } else if (Globals.mc.player.getAbilities().flying) {
         return false;
      } else if ((Boolean)this.descending.getValue() && Globals.mc.player.getVelocity().y >= 0.0 && !var5) {
         return false;
      } else {
         this.f9021 = this.timer.getValue();
         if (Globals.mc.player.checkFallFlying()) {
            Globals.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(Globals.mc.player, Mode.START_FALL_FLYING));
            boolean var7 = true;
            return true;
         } else {
            return false;
         }
      }
   }

   @Subscribe
   public void m17232(Event301 var1) {
      ItemStack var5;
      boolean var12;
      if ((var5 = Globals.mc.player.getEquippedStack(EquipmentSlot.CHEST)).isOf(Items.ELYTRA) && ElytraItem.isUsable(var5)) {
         var12 = true;
         boolean var15 = true;
      } else {
         var12 = false;
         boolean var10002 = true;
      }

      boolean var6 = var12;
      Input var8 = var1.m10147();
      if (this.mode.getValue().equals(Acceleration.f6249) && ((Boolean)this.autojump.getValue() && Globals.mc.player.isFallFlying() || this.f9029)) {
         var8.jumping = true;
         this.f9029 = false;
      }

      if (var6 && this.mode.getValue().equals(Acceleration.f6254) && (Boolean)this.useFireworkRocketsWhileFlying.getValue() && !(Boolean)this.noidle.getValue()
         )
       {
         if (var8.movementForward == 0.0F
            || (!(var8.movementForward < 0.0F) || !(this.f9027 >= 0.0F)) && (!(var8.movementForward > 0.0F) || !(this.f9027 <= 0.0F))) {
            var12 = false;
            boolean var17 = true;
         } else {
            var12 = true;
            boolean var16 = true;
         }

         boolean var10 = var12;
         if (var8.movementSideways == 0.0F
            || (!(var8.movementSideways < 0.0F) || !(this.f8963 >= 0.0F)) && (!(var8.movementSideways > 0.0F) || !(this.f8963 <= 0.0F))) {
            var12 = false;
            boolean var19 = true;
         } else {
            var12 = true;
            boolean var18 = true;
         }

         var6 = var12;
         if (var10 || var6) {
            this.f8985.reset();
         }
      }

      this.f9027 = var8.movementForward;
      this.f8963 = var8.movementSideways;
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29046;
      if (f9046[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f9045[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f9047.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f9047.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ԕ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f9046[var3] = var15;
      }

      return f9046[var3];
   }

   public static int m176(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m175(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ElytraFly.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ԕ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static long m4692(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6154;
      if (f9049[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f9048[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f9050.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f9050.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ԕ", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         f9049[var3] = var15;
      }

      return f9049[var3];
   }

   public static long m4693(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = m4692(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ElytraFly.class, "m4693", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ԕ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f9052[var4] != null) {
         return var4;
      } else {
         Object var5 = f9051[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 35;
               case 1 -> 0;
               case 2 -> 48;
               case 3 -> 59;
               case 4 -> 15;
               case 5 -> 50;
               case 6 -> 38;
               case 7 -> 23;
               case 8 -> 60;
               case 9 -> 31;
               case 10 -> 4;
               case 11 -> 45;
               case 12 -> 52;
               case 13 -> 40;
               case 14 -> 54;
               case 15 -> 30;
               case 16 -> 46;
               case 17 -> 33;
               case 18 -> 34;
               case 19 -> 20;
               case 20 -> 55;
               case 21 -> 53;
               case 22 -> 2;
               case 23 -> 44;
               case 24 -> 21;
               case 25 -> 11;
               case 26 -> 37;
               case 27 -> 13;
               case 28 -> 7;
               case 29 -> 6;
               case 30 -> 63;
               case 31 -> 32;
               case 32 -> 3;
               case 33 -> 8;
               case 34 -> 24;
               case 35 -> 25;
               case 36 -> 51;
               case 37 -> 27;
               case 38 -> 47;
               case 39 -> 12;
               case 40 -> 18;
               case 41 -> 56;
               case 42 -> 28;
               case 43 -> 57;
               case 44 -> 16;
               case 45 -> 5;
               case 46 -> 43;
               case 47 -> 62;
               case 48 -> 1;
               case 49 -> 29;
               case 50 -> 41;
               case 51 -> 61;
               case 52 -> 49;
               case 53 -> 14;
               case 54 -> 17;
               case 55 -> 58;
               case 56 -> 9;
               case 57 -> 19;
               case 58 -> 36;
               case 59 -> 26;
               case 60 -> 10;
               case 61 -> 22;
               case 62 -> 42;
               default -> 39;
            };
            int[] var7 = new int[6];

            for (int var8 = 0; var8 < 6; var8++) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for (int var14 = 0; var14 < var13.length; var14++) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            f9052[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f9051[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f9052[var4]);
            f9051[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m181(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m182(Class var0, String var1, Class var2) {
      Field var3 = m181(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m182(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m183(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f9051[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f9052[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f9051[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f9051[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new IllegalStateException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = m180(1305807781869342L, 0L);
            }
         }
      }
   }

   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label33:
      for (Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for (int var10 = 0; var10 < var3; var10++) {
                  if (var9[var10] != var4[var10]) {
                     continue label33;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m184(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m185(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m186(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f9051[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f9052[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            var11++;
            var12++;
         } while ((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for (int var16 = 0; var16 < var11; var16++) {
            int var17 = var6.indexOf(8, var12);
            var15 = m180(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m184(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f9051[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1305807781869342L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m185(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f9051[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while (var29 < var13) {
                  var28.append(var14[var29].getName());
                  if (++var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new IllegalStateException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1305807781869342L, 0L);
            }
         }
      }
   }

   public static MethodHandle m187(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 250 && var8 != 222 && var8 != 'y' && var8 != 'x') {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 246) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'i') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 250) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 222) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'y') {
               var9 = var0.findStaticGetter(var12, var18, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var18, var14);
            }
         }

         return MethodHandles.dropArguments((MethodHandle)var9, var3.parameterCount() - 2, long.class, long.class);
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName())
            .append(" : ")
            .append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null "))
            .append(" : ")
            .append(var15.toString());
         throw new IllegalStateException(var13.toString());
      }
   }

   public static Object m188(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m187(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m1290(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ElytraFly.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ԕ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
