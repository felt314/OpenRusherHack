// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.Obf566;
import org.rusherhack.Obf222;
import org.rusherhack.Obf178;
import org.rusherhack.Obf123;
import org.rusherhack.Obf115;
import org.rusherhack.Obf090;
import org.rusherhack.Class200;
import org.rusherhack.Util416;
import org.rusherhack.Util177;
import org.rusherhack.Class586;
import org.rusherhack.Class576;
import org.rusherhack.Class253;
import org.rusherhack.Class066;
import org.rusherhack.Class007;

import net.minecraft.client.network.ClientCommonNetworkHandler;
import net.minecraft.entity.player.PlayerEntity;
import org.rusherhack.core.setting.Setting;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import javax.crypto.SecretKey;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.core.bind.key.IKey;
import java.util.Iterator;
import net.minecraft.util.math.Vec3i;
import org.rusherhack.client.api.events.client.EventUpdate;
import net.minecraft.block.BlockState;
import org.rusherhack.core.event.stage.Stage;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.math.Direction;
import java.util.Objects;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.client.api.Globals;
import net.minecraft.util.hit.BlockHitResult;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.utils.Timer;
import org.rusherhack.client.api.setting.BindSetting;
import java.util.LinkedList;
import org.rusherhack.client.api.setting.ColorSetting;
import it.unimi.dsi.fastutil.floats.FloatFloatMutablePair;
import net.minecraft.util.math.BlockPos;
import java.util.Map;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.bind;
import org.rusherhack.command.clear;
import org.rusherhack.command.config;
import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.hud.impl.TPS;
import org.rusherhack.client.api.feature.module.impl.player.AutoEat;
import org.rusherhack.client.api.feature.module.impl.player.AutoTool;
import org.rusherhack.client.api.feature.module.impl.player.MultiTask;
import org.rusherhack.client.api.feature.module.impl.player.Swing;
import org.rusherhack.client.api.feature.module.impl.render.BreakESP;
public final class FastBreak extends ToggleableModule
{
    private final BooleanSetting automaticallySwitchesToBestTool;
    private final BooleanSetting queueUpBlocksToBeMined;
    private int f5617;
    private final BooleanSetting instantlyBreakTheLastBlockYouMined;
    private final NumberSetting<Integer> ticksBetweenDestroyingBlocks;
    private final BooleanSetting cancelTheCurrentMiningProgress;
    private final Map<BlockPos, FloatFloatMutablePair> f5621;
    private final Class200 f5622;
    private BlockPos f5623;
    private long f5624;
    private int f5625;
    private final ColorSetting endcolor;
    private boolean f5627;
    private final BooleanSetting returnsToThePreviousItemYouWereHolding;
    private final BooleanSetting pullToolsOutOfInventory;
    private final BooleanSetting rotatesToTheBlockYouAreCurrentlyMining;
    private final Class200 f5631;
    private final NumberSetting<Float> widthOfOutline;
    private final BooleanSetting preventMiningThroughWalls;
    private BlockPos f5634;
    private final LinkedList<BlockPos> f5635;
    private final BindSetting bindToAbortBreaking;
    private final BooleanSetting outlineTheBox;
    private final BooleanSetting hideHiddenSides;
    private final Timer f5639;
    private final BooleanSetting multitask;
    private BlockPos f5641;
    private final BooleanSetting debug;
    private final EnumSetting<Obf115> blocks;
    private BlockPos f5644;
    private final BooleanSetting syncsMiningToTheServerTps;
    private final EnumSetting<Obf222> f5646;
    public final NumberSetting<Float> speed;
    private final BooleanSetting switchServerSideOnly;
    private final BooleanSetting breaksMultipleBlocksAtTheSameTime;
    private int f5650;
    private final BooleanSetting automaticallyRemineTheLastBlockYouMined;
    private final BooleanSetting pausewhileeating;
    private float f5653;
    private final ColorSetting startcolor;
    private final BooleanSetting f5655;
    private boolean f5656;
    private final BooleanSetting render;
    public final EnumSetting<Obf123> mode;
    private final EnumSetting<Obf178> priority;
    private int f5660;
    private final BooleanSetting staticSetting;
    private final BooleanSetting updatedncpAdjustments;
    private final BooleanSetting grimBypass;
    public static FastBreak f5664;
    private final BooleanSetting fillTheBox;
    private static long f5666;
    private static String[] f5667;
    private static String[] f5668;
    private static Map f5669;
    private static long[] f5670;
    private static Integer[] f5671;
    private static Map f5672;
    private static Object[] f5673;
    private static String[] f5674;
    
    private BlockHitResult m11341(final BlockPos blockPos) {
        final long n = FastBreak.f5666 ^ 0x2302282C5992L;
        return Util416.m13456(blockPos, (boolean)((Setting)this.preventMiningThroughWalls).getValue(), (boolean)((Setting)this.preventMiningThroughWalls).getValue(), ((PlayerEntity)Globals.mc.player).getBlockInteractionRange());
    }
    
    public String getMetadata() {
        final long n = FastBreak.f5666 ^ 0x20CE5E2174E8L;
        return this.mode.getDisplayValue();
    }
    
    @Subscribe
    private void m11343(final EventLoadWorld eventLoadWorld) {
        final long n = FastBreak.f5666 ^ 0x16C4C6D80016L;
        this.f5635.clear();
        this.f5621.clear();
        final BlockPos origin = BlockPos.ORIGIN;
        this.f5623 = origin;
        this.f5634 = origin;
        this.f5641 = origin;
        this.f5644 = origin;
        final int n2 = -1;
        this.f5627 = false;
        this.f5617 = n2;
        this.f5625 = n2;
    }
    
    private void m11345(final BlockPos blockPos, final Direction direction, final int n) {
        final long n2 = FastBreak.f5666 ^ 0x72F0B0049F1DL;
        ((ClientCommonNetworkHandler)Globals.mc.player.networkHandler).sendPacket((Packet)new PlayerActionC2SPacket(PlayerActionC2SPacket.Action.ABORT_DESTROY_BLOCK, blockPos, direction, n));
    }
    
    @Subscribe(stage = Stage.ALL)
    private void m11346(final Class576 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          97325036112013
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: aload_1        
        //    15: astore_0       
        //    16: astore_1       
        //    17: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    20: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    23: ifnull          78
        //    26: aload_0        
        //    27: iload           4
        //    29: ifne            60
        //    32: goto            39
        //    35: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    38: athrow         
        //    39: invokevirtual   org/rusherhack/Obf515.m15855:()Lnet.minecraft.util.math.BlockPos;
        //    42: ifnull          78
        //    45: goto            52
        //    48: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    51: athrow         
        //    52: aload_0        
        //    53: goto            60
        //    56: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    59: athrow         
        //    60: iload           4
        //    62: ifne            84
        //    65: invokevirtual   org/rusherhack/Obf515.m15854:()Lnet.minecraft.util.math.Direction;
        //    68: ifnonnull       83
        //    71: goto            78
        //    74: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    77: athrow         
        //    78: return         
        //    79: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    82: athrow         
        //    83: aload_0        
        //    84: invokevirtual   org/rusherhack/Obf515.m15855:()Lnet.minecraft.util.math.BlockPos;
        //    87: dup            
        //    88: astore          5
        //    90: iload           4
        //    92: ifne            131
        //    95: invokevirtual   net.minecraft.util.math.Vec3i.getY:()I
        //    98: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   101: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   104: invokeinterface net.minecraft.world.HeightLimitView.getTopY:()I
        //   109: if_icmplt       124
        //   112: goto            119
        //   115: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   118: athrow         
        //   119: return         
        //   120: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   123: athrow         
        //   124: aload_1        
        //   125: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //   128: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   131: getstatic       org/rusherhack/Obf123.f2572:Lorg/rusherhack/Obf123;
        //   134: iload           4
        //   136: ifne            229
        //   139: if_acmpne       219
        //   142: goto            149
        //   145: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   148: athrow         
        //   149: aload_1        
        //   150: iload           4
        //   152: ifne            226
        //   155: goto            162
        //   158: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   161: athrow         
        //   162: getfield        org/rusherhack/FastBreak.f5627:Z
        //   165: ifeq            219
        //   168: goto            175
        //   171: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   174: athrow         
        //   175: aload_1        
        //   176: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   179: iload           4
        //   181: ifne            226
        //   184: goto            191
        //   187: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   190: athrow         
        //   191: aload           5
        //   193: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   196: ifeq            219
        //   199: goto            206
        //   202: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   205: athrow         
        //   206: aload_0        
        //   207: iconst_1       
        //   208: dup            
        //   209: dup            
        //   210: pop2           
        //   211: invokevirtual   org/rusherhack/core/event/type/EventCancellable.setCancelled:(Z)V
        //   214: return         
        //   215: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   218: athrow         
        //   219: aload_1        
        //   220: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //   223: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   226: getstatic       org/rusherhack/Obf123.f2571:Lorg/rusherhack/Obf123;
        //   229: if_acmpne       650
        //   232: getstatic       org/rusherhack/Class505.f8128:[I
        //   235: aload_0        
        //   236: invokevirtual   org/rusherhack/Class576.getStage:()Lorg/rusherhack/core/event/stage/Stage;
        //   239: invokevirtual   java/lang/Enum.ordinal:()I
        //   242: iaload         
        //   243: tableswitch {
        //                2: 272
        //                3: 379
        //                4: 641
        //          default: 650
        //        }
        //   268: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   271: athrow         
        //   272: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   275: goto            282
        //   278: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   281: athrow         
        //   282: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   285: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   288: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.getDestroyDelay:()I
        //   293: iload           4
        //   295: ifne            377
        //   298: goto            305
        //   301: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   304: athrow         
        //   305: aload_1        
        //   306: getfield        org/rusherhack/FastBreak.ticksBetweenDestroyingBlocks:Lorg/rusherhack/core/setting/NumberSetting;
        //   309: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   312: checkcast       Ljava/lang/Integer;
        //   315: invokevirtual   java/lang/Integer.intValue:()I
        //   318: if_icmple       362
        //   321: goto            328
        //   324: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   327: athrow         
        //   328: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   331: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   334: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   337: aload_1        
        //   338: getfield        org/rusherhack/FastBreak.ticksBetweenDestroyingBlocks:Lorg/rusherhack/core/setting/NumberSetting;
        //   341: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   344: checkcast       Ljava/lang/Integer;
        //   347: invokevirtual   java/lang/Integer.intValue:()I
        //   350: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.setDestroyDelay:(I)V
        //   355: goto            362
        //   358: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   361: athrow         
        //   362: aload_1        
        //   363: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   366: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   369: aload           5
        //   371: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //   374: invokevirtual   org/rusherhack/FastBreak.m11360:(Lnet.minecraft.block.BlockState;)Z
        //   377: pop            
        //   378: return         
        //   379: aload_1        
        //   380: ldc_w           "Damage %s, %s, %s"
        //   383: iconst_3       
        //   384: anewarray       Ljava/lang/Object;
        //   387: dup            
        //   388: iconst_0       
        //   389: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   392: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   395: getfield        net.minecraft.entity.Entity.age:I
        //   398: aload_1        
        //   399: getfield        org/rusherhack/FastBreak.f5660:I
        //   402: isub           
        //   403: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   406: aastore        
        //   407: dup            
        //   408: iconst_1       
        //   409: dup            
        //   410: dup            
        //   411: pop2           
        //   412: invokestatic    java/lang/System.currentTimeMillis:()J
        //   415: aload_1        
        //   416: getfield        org/rusherhack/FastBreak.f5624:J
        //   419: lsub           
        //   420: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   423: aastore        
        //   424: dup            
        //   425: iconst_2       
        //   426: aload_1        
        //   427: iload           4
        //   429: ifne            473
        //   432: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //   435: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   438: getstatic       org/rusherhack/Obf123.f2571:Lorg/rusherhack/Obf123;
        //   441: if_acmpne       472
        //   444: goto            451
        //   447: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   450: athrow         
        //   451: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   454: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   457: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   460: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.getDestroyProgress:()F
        //   465: goto            476
        //   468: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   471: athrow         
        //   472: aload_1        
        //   473: getfield        org/rusherhack/FastBreak.f5653:F
        //   476: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   479: aastore        
        //   480: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   483: invokevirtual   org/rusherhack/FastBreak.m11371:(Ljava/lang/String;)V
        //   486: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   489: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   492: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   495: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.getDestroyProgress:()F
        //   500: fconst_1       
        //   501: aload_1        
        //   502: getfield        org/rusherhack/FastBreak.speed:Lorg/rusherhack/core/setting/NumberSetting;
        //   505: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   508: checkcast       Ljava/lang/Float;
        //   511: invokevirtual   java/lang/Float.floatValue:()F
        //   514: fsub           
        //   515: fcmpl          
        //   516: iload           4
        //   518: ifne            564
        //   521: iflt            551
        //   524: goto            531
        //   527: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   530: athrow         
        //   531: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   534: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   537: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   540: fconst_1       
        //   541: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.setDestroyProgress:(F)V
        //   546: return         
        //   547: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   550: athrow         
        //   551: aload_1        
        //   552: getfield        org/rusherhack/FastBreak.instantlyBreakTheLastBlockYouMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //   555: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   558: checkcast       Ljava/lang/Boolean;
        //   561: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   564: iload           4
        //   566: ifne            607
        //   569: ifeq            650
        //   572: goto            579
        //   575: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   578: athrow         
        //   579: aload_1        
        //   580: iload           4
        //   582: ifne            633
        //   585: goto            592
        //   588: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   591: athrow         
        //   592: getfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //   595: aload           5
        //   597: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   600: goto            607
        //   603: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   606: athrow         
        //   607: ifeq            650
        //   610: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   613: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   616: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   619: fconst_1       
        //   620: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.setDestroyProgress:(F)V
        //   625: aload_1        
        //   626: goto            633
        //   629: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   632: athrow         
        //   633: iconst_1       
        //   634: dup            
        //   635: dup            
        //   636: pop2           
        //   637: putfield        org/rusherhack/FastBreak.f5656:Z
        //   640: return         
        //   641: aload_1        
        //   642: dup            
        //   643: iconst_0       
        //   644: putfield        org/rusherhack/FastBreak.f5656:Z
        //   647: invokevirtual   org/rusherhack/FastBreak.m11348:()V
        //   650: return         
        //    StackMapTable: 00 3F FF 00 23 00 04 07 01 34 07 00 02 04 01 00 01 07 00 6A 43 07 01 34 48 07 00 6A 03 43 07 00 6A 43 07 01 34 4D 07 00 6A 03 40 07 00 6A 03 40 07 01 34 FF 00 1E 00 05 07 01 34 07 00 02 04 01 07 00 C9 00 01 07 00 6A 03 40 07 00 6A 03 46 07 01 5F 4D 07 00 6A 03 48 07 00 6A 43 07 00 02 48 07 00 6A 03 4B 07 00 6A 43 07 00 C9 4A 07 00 6A 03 48 07 00 6A 03 46 07 01 5F FF 00 02 00 05 07 01 34 07 00 02 04 01 07 00 C9 00 02 07 01 5F 07 00 0D 66 07 00 6A 03 45 07 00 6A 43 07 00 93 52 07 00 6A 43 01 52 07 00 6A 03 5D 07 00 6A 03 4E 01 01 F7 00 43 07 00 6A FF 00 03 00 05 07 01 34 07 00 02 04 01 07 00 C9 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 50 07 00 6A FF 00 03 00 05 07 01 34 07 00 02 04 01 07 00 C9 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 FF 00 00 00 05 07 01 34 07 00 02 04 01 07 00 C9 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 07 00 02 FF 00 02 00 05 07 01 34 07 00 02 04 01 07 00 C9 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 02 72 07 00 6A 03 4F 07 00 6A 03 4C 01 4A 07 00 6A 03 48 07 00 6A 43 07 00 02 4A 07 00 6A 43 01 55 07 00 6A 43 07 00 02 07 08
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  17     32     35     39     Ljava/lang/MatchException;
        //  26     45     48     52     Ljava/lang/MatchException;
        //  39     53     56     60     Ljava/lang/MatchException;
        //  60     71     74     78     Ljava/lang/MatchException;
        //  65     79     79     83     Ljava/lang/MatchException;
        //  90     112    115    119    Ljava/lang/MatchException;
        //  95     120    120    124    Ljava/lang/MatchException;
        //  131    142    145    149    Ljava/lang/MatchException;
        //  139    155    158    162    Ljava/lang/MatchException;
        //  149    168    171    175    Ljava/lang/MatchException;
        //  162    184    187    191    Ljava/lang/MatchException;
        //  175    199    202    206    Ljava/lang/MatchException;
        //  191    215    215    219    Ljava/lang/MatchException;
        //  229    268    268    272    Ljava/lang/MatchException;
        //  232    275    278    282    Ljava/lang/MatchException;
        //  282    298    301    305    Ljava/lang/MatchException;
        //  282    321    324    328    Ljava/lang/MatchException;
        //  305    355    358    362    Ljava/lang/MatchException;
        //  379    444    447    451    Ljava/lang/MatchException;
        //  432    468    468    472    Ljava/lang/MatchException;
        //  476    524    527    531    Ljava/lang/MatchException;
        //  521    547    547    551    Ljava/lang/MatchException;
        //  564    572    575    579    Ljava/lang/MatchException;
        //  569    585    588    592    Ljava/lang/MatchException;
        //  579    600    603    607    Ljava/lang/MatchException;
        //  607    626    629    633    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean m11347() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          111521801348119
        //     6: lxor           
        //     7: lstore_1       
        //     8: invokestatic    org/rusherhack/Class253.m9155:()I
        //    11: istore_3       
        //    12: aload_0        
        //    13: invokevirtual   org/rusherhack/client/api/feature/module/ToggleableModule.isToggled:()Z
        //    16: iload_3        
        //    17: ifeq            102
        //    20: ifeq            86
        //    23: goto            30
        //    26: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    29: athrow         
        //    30: aload_0        
        //    31: getfield        org/rusherhack/FastBreak.f5627:Z
        //    34: iload_3        
        //    35: ifeq            127
        //    38: goto            45
        //    41: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    44: athrow         
        //    45: ifne            116
        //    48: goto            55
        //    51: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    54: athrow         
        //    55: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //    58: aload_0        
        //    59: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //    62: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //    65: iload_3        
        //    66: ifeq            127
        //    69: goto            76
        //    72: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    75: athrow         
        //    76: ifeq            116
        //    79: goto            86
        //    82: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    85: athrow         
        //    86: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    89: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //    92: invokevirtual   net.minecraft.client.network.ClientPlayerInteractionManager.isBreakingBlock:()Z
        //    95: goto            102
        //    98: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   101: athrow         
        //   102: iload_3        
        //   103: ifeq            129
        //   106: ifeq            128
        //   109: goto            116
        //   112: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   115: athrow         
        //   116: iconst_1       
        //   117: dup            
        //   118: dup            
        //   119: pop2           
        //   120: goto            127
        //   123: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   126: athrow         
        //   127: ireturn        
        //   128: iconst_0       
        //   129: ireturn        
        //    StackMapTable: 00 12 FF 00 1A 00 03 07 00 02 04 01 00 01 07 00 6A 03 4A 07 00 6A 43 01 45 07 00 6A 03 50 07 00 6A 43 01 45 07 00 6A 03 4B 07 00 6A 43 01 49 07 00 6A 03 46 07 00 6A 43 01 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  12     23     26     30     Ljava/lang/MatchException;
        //  20     38     41     45     Ljava/lang/MatchException;
        //  30     48     51     55     Ljava/lang/MatchException;
        //  45     69     72     76     Ljava/lang/MatchException;
        //  55     79     82     86     Ljava/lang/MatchException;
        //  76     95     98     102    Ljava/lang/MatchException;
        //  102    109    112    116    Ljava/lang/MatchException;
        //  106    120    123    127    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void m11348() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          74069760977038
        //     6: lxor           
        //     7: lstore_1       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore_3       
        //    12: aload_0        
        //    13: astore          4
        //    15: aload           4
        //    17: getfield        org/rusherhack/FastBreak.switchServerSideOnly:Lorg/rusherhack/core/setting/BooleanSetting;
        //    20: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    23: checkcast       Ljava/lang/Boolean;
        //    26: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    29: iload_3        
        //    30: ifne            108
        //    33: ifne            94
        //    36: goto            43
        //    39: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    42: athrow         
        //    43: aload           4
        //    45: getfield        org/rusherhack/FastBreak.returnsToThePreviousItemYouWereHolding:Lorg/rusherhack/core/setting/BooleanSetting;
        //    48: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    51: checkcast       Ljava/lang/Boolean;
        //    54: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    57: iload_3        
        //    58: ifne            108
        //    61: goto            68
        //    64: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    67: athrow         
        //    68: ifne            94
        //    71: goto            78
        //    74: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    77: athrow         
        //    78: aload           4
        //    80: dup            
        //    81: iconst_m1      
        //    82: dup_x1         
        //    83: putfield        org/rusherhack/FastBreak.f5617:I
        //    86: putfield        org/rusherhack/FastBreak.f5625:I
        //    89: return         
        //    90: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    93: athrow         
        //    94: aload           4
        //    96: getfield        org/rusherhack/FastBreak.updatedncpAdjustments:Lorg/rusherhack/core/setting/BooleanSetting;
        //    99: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   102: checkcast       Ljava/lang/Boolean;
        //   105: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   108: iload_3        
        //   109: ifne            160
        //   112: ifeq            155
        //   115: goto            122
        //   118: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   121: athrow         
        //   122: aload           4
        //   124: getfield        org/rusherhack/FastBreak.f5639:Lorg/rusherhack/core/utils/Timer;
        //   127: ldc2_w          25.0
        //   130: invokevirtual   org/rusherhack/core/utils/Timer.passed:(D)Z
        //   133: iload_3        
        //   134: ifne            160
        //   137: goto            144
        //   140: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   143: athrow         
        //   144: ifne            155
        //   147: goto            154
        //   150: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   153: athrow         
        //   154: return         
        //   155: aload           4
        //   157: getfield        org/rusherhack/FastBreak.f5617:I
        //   160: iconst_m1      
        //   161: iload_3        
        //   162: ifne            300
        //   165: if_icmple       298
        //   168: goto            175
        //   171: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   174: athrow         
        //   175: aload           4
        //   177: getfield        org/rusherhack/FastBreak.f5617:I
        //   180: sipush          8294
        //   183: ldc2_w          163160578236549523
        //   186: lload_1        
        //   187: lxor           
        //   188: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //   193: iload_3        
        //   194: ifne            293
        //   197: goto            204
        //   200: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   203: athrow         
        //   204: if_icmplt       284
        //   207: goto            214
        //   210: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   213: athrow         
        //   214: aload           4
        //   216: getfield        org/rusherhack/FastBreak.switchServerSideOnly:Lorg/rusherhack/core/setting/BooleanSetting;
        //   219: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   222: checkcast       Ljava/lang/Boolean;
        //   225: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   228: iload_3        
        //   229: ifne            299
        //   232: goto            239
        //   235: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   238: athrow         
        //   239: ifeq            298
        //   242: goto            249
        //   245: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   248: athrow         
        //   249: aload           4
        //   251: getfield        org/rusherhack/FastBreak.updatedncpAdjustments:Lorg/rusherhack/core/setting/BooleanSetting;
        //   254: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   257: checkcast       Ljava/lang/Boolean;
        //   260: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   263: iload_3        
        //   264: ifne            299
        //   267: goto            274
        //   270: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   273: athrow         
        //   274: ifeq            298
        //   277: goto            284
        //   280: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   283: athrow         
        //   284: iconst_1       
        //   285: dup            
        //   286: goto            293
        //   289: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   292: athrow         
        //   293: dup            
        //   294: pop2           
        //   295: goto            302
        //   298: iconst_0       
        //   299: iconst_1       
        //   300: dup            
        //   301: pop2           
        //   302: istore_0       
        //   303: iload_0        
        //   304: iload_3        
        //   305: ifne            356
        //   308: ifeq            351
        //   311: goto            318
        //   314: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   317: athrow         
        //   318: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   321: aload           4
        //   323: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   326: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //   329: iload_3        
        //   330: ifne            356
        //   333: goto            340
        //   336: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   339: athrow         
        //   340: ifne            351
        //   343: goto            350
        //   346: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   349: athrow         
        //   350: return         
        //   351: aload           4
        //   353: getfield        org/rusherhack/FastBreak.f5625:I
        //   356: iload_3        
        //   357: ifne            392
        //   360: iconst_m1      
        //   361: if_icmpeq       635
        //   364: goto            371
        //   367: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   370: athrow         
        //   371: aload           4
        //   373: getfield        org/rusherhack/FastBreak.switchServerSideOnly:Lorg/rusherhack/core/setting/BooleanSetting;
        //   376: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   379: checkcast       Ljava/lang/Boolean;
        //   382: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   385: goto            392
        //   388: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   391: athrow         
        //   392: iload_3        
        //   393: ifne            468
        //   396: ifne            467
        //   399: goto            406
        //   402: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   405: athrow         
        //   406: aload           4
        //   408: getfield        org/rusherhack/FastBreak.returnsToThePreviousItemYouWereHolding:Lorg/rusherhack/core/setting/BooleanSetting;
        //   411: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   414: checkcast       Ljava/lang/Boolean;
        //   417: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   420: iload_3        
        //   421: ifne            453
        //   424: goto            431
        //   427: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   430: athrow         
        //   431: ifeq            635
        //   434: goto            441
        //   437: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   440: athrow         
        //   441: aload           4
        //   443: invokevirtual   org/rusherhack/FastBreak.m11347:()Z
        //   446: goto            453
        //   449: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   452: athrow         
        //   453: iload_3        
        //   454: ifne            468
        //   457: ifne            635
        //   460: goto            467
        //   463: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   466: athrow         
        //   467: iload_0        
        //   468: iload_3        
        //   469: ifne            544
        //   472: ifeq            502
        //   475: goto            482
        //   478: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   481: athrow         
        //   482: aload           4
        //   484: dup            
        //   485: getfield        org/rusherhack/FastBreak.f5617:I
        //   488: swap           
        //   489: getfield        org/rusherhack/FastBreak.f5625:I
        //   492: invokestatic    org/rusherhack/client/api/utils/InventoryUtils.swapSlots:(II)V
        //   495: goto            502
        //   498: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   501: athrow         
        //   502: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   505: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   508: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //   511: aload           4
        //   513: getfield        org/rusherhack/FastBreak.f5625:I
        //   516: putfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //   519: aload           4
        //   521: dup            
        //   522: iconst_m1      
        //   523: dup_x1         
        //   524: putfield        org/rusherhack/FastBreak.f5617:I
        //   527: putfield        org/rusherhack/FastBreak.f5625:I
        //   530: aload           4
        //   532: getfield        org/rusherhack/FastBreak.switchServerSideOnly:Lorg/rusherhack/core/setting/BooleanSetting;
        //   535: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   538: checkcast       Ljava/lang/Boolean;
        //   541: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   544: iload_3        
        //   545: ifne            579
        //   548: ifeq            635
        //   551: goto            558
        //   554: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   557: athrow         
        //   558: aload           4
        //   560: getfield        org/rusherhack/FastBreak.multitask:Lorg/rusherhack/core/setting/BooleanSetting;
        //   563: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   566: checkcast       Ljava/lang/Boolean;
        //   569: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   572: goto            579
        //   575: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   578: athrow         
        //   579: iload_3        
        //   580: ifne            611
        //   583: ifeq            635
        //   586: goto            593
        //   589: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   592: athrow         
        //   593: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   596: aload           4
        //   598: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   601: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //   604: goto            611
        //   607: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   610: athrow         
        //   611: ifeq            635
        //   614: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   617: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   620: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   623: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.invokeEnsureHasSentCarriedItem:()V
        //   628: goto            635
        //   631: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   634: athrow         
        //   635: return         
        //    StackMapTable: 00 4B FF 00 27 00 04 07 00 02 04 01 07 00 02 00 01 07 00 6A 03 54 07 00 6A 43 01 45 07 00 6A 03 4B 07 00 6A 03 4D 01 49 07 00 6A 03 51 07 00 6A 43 01 45 07 00 6A 03 00 44 01 4A 07 00 6A 03 58 07 00 6A FF 00 03 00 04 07 00 02 04 01 07 00 02 00 02 01 01 45 07 00 6A 03 54 07 00 6A 43 01 45 07 00 6A 03 54 07 00 6A 43 01 45 07 00 6A 03 44 07 00 6A FF 00 03 00 04 07 00 02 04 01 07 00 02 00 02 01 01 04 40 01 FF 00 00 00 04 07 00 02 04 01 07 00 02 00 02 01 01 41 01 FF 00 0B 00 04 01 04 01 07 00 02 00 01 07 00 6A 03 51 07 00 6A 43 01 45 07 00 6A 03 00 44 01 4A 07 00 6A 03 50 07 00 6A 43 01 49 07 00 6A 03 54 07 00 6A 43 01 45 07 00 6A 03 47 07 00 6A 43 01 49 07 00 6A 03 40 01 49 07 00 6A 03 4F 07 00 6A 03 69 01 49 07 00 6A 03 50 07 00 6A 43 01 49 07 00 6A 03 4D 07 00 6A 43 01 53 07 00 6A 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  15     36     39     43     Ljava/lang/MatchException;
        //  33     61     64     68     Ljava/lang/MatchException;
        //  43     71     74     78     Ljava/lang/MatchException;
        //  68     90     90     94     Ljava/lang/MatchException;
        //  108    115    118    122    Ljava/lang/MatchException;
        //  112    137    140    144    Ljava/lang/MatchException;
        //  122    147    150    154    Ljava/lang/MatchException;
        //  160    168    171    175    Ljava/lang/MatchException;
        //  165    197    200    204    Ljava/lang/MatchException;
        //  175    207    210    214    Ljava/lang/MatchException;
        //  204    232    235    239    Ljava/lang/MatchException;
        //  214    242    245    249    Ljava/lang/MatchException;
        //  239    267    270    274    Ljava/lang/MatchException;
        //  249    277    280    284    Ljava/lang/MatchException;
        //  274    286    289    293    Ljava/lang/MatchException;
        //  303    311    314    318    Ljava/lang/MatchException;
        //  308    333    336    340    Ljava/lang/MatchException;
        //  318    343    346    350    Ljava/lang/MatchException;
        //  356    364    367    371    Ljava/lang/MatchException;
        //  360    385    388    392    Ljava/lang/MatchException;
        //  392    399    402    406    Ljava/lang/MatchException;
        //  396    424    427    431    Ljava/lang/MatchException;
        //  406    434    437    441    Ljava/lang/MatchException;
        //  431    446    449    453    Ljava/lang/MatchException;
        //  453    460    463    467    Ljava/lang/MatchException;
        //  468    475    478    482    Ljava/lang/MatchException;
        //  472    495    498    502    Ljava/lang/MatchException;
        //  544    551    554    558    Ljava/lang/MatchException;
        //  548    572    575    579    Ljava/lang/MatchException;
        //  579    586    589    593    Ljava/lang/MatchException;
        //  583    604    607    611    Ljava/lang/MatchException;
        //  611    628    631    635    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Subscribe
    private void m11349(final Class007 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          132447645541220
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: aload_1        
        //    15: astore_0       
        //    16: astore_1       
        //    17: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    20: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    23: ifnull          78
        //    26: aload_0        
        //    27: iload           4
        //    29: ifne            60
        //    32: goto            39
        //    35: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    38: athrow         
        //    39: invokevirtual   org/rusherhack/Obf515.m15855:()Lnet.minecraft.util.math.BlockPos;
        //    42: ifnull          78
        //    45: goto            52
        //    48: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    51: athrow         
        //    52: aload_0        
        //    53: goto            60
        //    56: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    59: athrow         
        //    60: iload           4
        //    62: ifne            84
        //    65: invokevirtual   org/rusherhack/Class007.m340:()Lnet.minecraft.block.BlockState;
        //    68: ifnonnull       83
        //    71: goto            78
        //    74: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    77: athrow         
        //    78: return         
        //    79: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    82: athrow         
        //    83: aload_0        
        //    84: dup            
        //    85: invokevirtual   org/rusherhack/Obf515.m15855:()Lnet.minecraft.util.math.BlockPos;
        //    88: astore_0       
        //    89: invokevirtual   org/rusherhack/Class007.m340:()Lnet.minecraft.block.BlockState;
        //    92: dup            
        //    93: astore          5
        //    95: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    98: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   101: aload_0        
        //   102: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //   105: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //   108: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isOf:(Lnet.minecraft.block.Block;)Z
        //   111: iload           4
        //   113: ifne            149
        //   116: ifne            144
        //   119: goto            126
        //   122: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   125: athrow         
        //   126: aload_1        
        //   127: getfield        org/rusherhack/FastBreak.f5621:Ljava/util/Map;
        //   130: aload_0        
        //   131: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   136: pop            
        //   137: goto            144
        //   140: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   143: athrow         
        //   144: aload           5
        //   146: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isAir:()Z
        //   149: iload           4
        //   151: ifne            319
        //   154: ifeq            303
        //   157: goto            164
        //   160: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   163: athrow         
        //   164: aload_1        
        //   165: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   168: aload_0        
        //   169: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   172: iload           4
        //   174: ifne            226
        //   177: goto            184
        //   180: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   183: athrow         
        //   184: ifeq            218
        //   187: goto            194
        //   190: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   193: athrow         
        //   194: fconst_0       
        //   195: aload_1        
        //   196: dup            
        //   197: dup_x2         
        //   198: iconst_0       
        //   199: putfield        org/rusherhack/FastBreak.f5627:Z
        //   202: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   205: putfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   208: putfield        org/rusherhack/FastBreak.f5653:F
        //   211: goto            218
        //   214: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   217: athrow         
        //   218: aload_1        
        //   219: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   222: aload_0        
        //   223: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   226: iload           4
        //   228: ifne            263
        //   231: ifeq            255
        //   234: goto            241
        //   237: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   240: athrow         
        //   241: aload_1        
        //   242: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   245: putfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   248: goto            255
        //   251: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   254: athrow         
        //   255: aload_1        
        //   256: getfield        org/rusherhack/FastBreak.f5644:Lnet.minecraft.util.math.BlockPos;
        //   259: aload_0        
        //   260: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   263: iload           4
        //   265: ifne            301
        //   268: ifeq            293
        //   271: goto            278
        //   274: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   277: athrow         
        //   278: aload_1        
        //   279: dup            
        //   280: getfield        org/rusherhack/FastBreak.f5644:Lnet.minecraft.util.math.BlockPos;
        //   283: putfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //   286: goto            293
        //   289: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   292: athrow         
        //   293: aload_1        
        //   294: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   297: aload_0        
        //   298: invokevirtual   java/util/LinkedList.remove:(Ljava/lang/Object;)Z
        //   301: pop            
        //   302: return         
        //   303: aload           5
        //   305: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   308: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   311: aload_0        
        //   312: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getHardness:(Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)F
        //   315: ldc_w           -1.0
        //   318: fcmpl          
        //   319: iload           4
        //   321: ifne            361
        //   324: ifne            348
        //   327: goto            334
        //   330: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   333: athrow         
        //   334: aload_1        
        //   335: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   338: aload_0        
        //   339: invokevirtual   java/util/LinkedList.remove:(Ljava/lang/Object;)Z
        //   342: pop            
        //   343: return         
        //   344: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   347: athrow         
        //   348: aload_1        
        //   349: getfield        org/rusherhack/FastBreak.blocks:Lorg/rusherhack/core/setting/EnumSetting;
        //   352: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   355: checkcast       Lorg/rusherhack/Obf115;
        //   358: invokevirtual   java/lang/Enum.ordinal:()I
        //   361: lookupswitch {
        //                1: 388
        //                2: 430
        //          default: 468
        //        }
        //   388: aload_1        
        //   389: getfield        org/rusherhack/FastBreak.f5622:Lorg/rusherhack/Class200;
        //   392: aload           5
        //   394: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //   397: invokevirtual   org/rusherhack/Class200.m7837:(Lnet.minecraft.block.Block;)Z
        //   400: ifeq            478
        //   403: goto            410
        //   406: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   409: athrow         
        //   410: aload_1        
        //   411: iload           4
        //   413: ifeq            469
        //   416: goto            423
        //   419: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   422: athrow         
        //   423: goto            389
        //   426: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   429: athrow         
        //   430: aload_1        
        //   431: iload           4
        //   433: ifne            465
        //   436: getfield        org/rusherhack/FastBreak.f5631:Lorg/rusherhack/Class200;
        //   439: aload           5
        //   441: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //   444: invokevirtual   org/rusherhack/Class200.m7837:(Lnet.minecraft.block.Block;)Z
        //   447: ifne            478
        //   450: goto            457
        //   453: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   456: athrow         
        //   457: aload_1        
        //   458: goto            465
        //   461: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   464: athrow         
        //   465: goto            469
        //   468: return         
        //   469: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   472: aload_0        
        //   473: invokevirtual   java/util/LinkedList.remove:(Ljava/lang/Object;)Z
        //   476: pop            
        //   477: return         
        //   478: return         
        //    StackMapTable: 00 39 FF 00 23 00 04 07 01 E7 07 00 02 04 01 00 01 07 00 6A 43 07 01 E7 48 07 00 6A 03 43 07 00 6A 43 07 01 E7 4D 07 00 6A 03 40 07 00 6A 03 40 07 01 E7 FF 00 25 00 05 07 00 C9 07 00 02 04 01 07 02 10 00 01 07 00 6A 03 4D 07 00 6A 03 44 01 4A 07 00 6A 03 4F 07 00 6A 43 01 45 07 00 6A 03 53 07 00 6A 03 47 01 4A 07 00 6A 03 49 07 00 6A 03 47 01 4A 07 00 6A 03 4A 07 00 6A 03 47 01 01 4F 01 4A 07 00 6A 03 49 07 00 6A 03 4C 01 1A 40 07 00 02 50 07 00 6A 03 48 07 00 6A 43 07 00 02 42 07 00 6A 03 56 07 00 6A 03 43 07 00 6A 43 07 00 02 02 40 07 00 02 08
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  17     32     35     39     Ljava/lang/MatchException;
        //  26     45     48     52     Ljava/lang/MatchException;
        //  39     53     56     60     Ljava/lang/MatchException;
        //  60     71     74     78     Ljava/lang/MatchException;
        //  65     79     79     83     Ljava/lang/MatchException;
        //  95     119    122    126    Ljava/lang/MatchException;
        //  116    137    140    144    Ljava/lang/MatchException;
        //  149    157    160    164    Ljava/lang/MatchException;
        //  154    177    180    184    Ljava/lang/MatchException;
        //  164    187    190    194    Ljava/lang/MatchException;
        //  184    211    214    218    Ljava/lang/MatchException;
        //  226    234    237    241    Ljava/lang/MatchException;
        //  231    248    251    255    Ljava/lang/MatchException;
        //  263    271    274    278    Ljava/lang/MatchException;
        //  268    286    289    293    Ljava/lang/MatchException;
        //  319    327    330    334    Ljava/lang/MatchException;
        //  324    344    344    348    Ljava/lang/MatchException;
        //  389    403    406    410    Ljava/lang/MatchException;
        //  389    416    419    423    Ljava/lang/MatchException;
        //  410    426    426    430    Ljava/lang/MatchException;
        //  430    450    453    457    Ljava/lang/MatchException;
        //  436    458    461    465    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private int m11350(final BlockState p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          140234244884336
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          5
        //    16: getstatic       org/rusherhack/AutoTool.f9156:Lorg/rusherhack/AutoTool;
        //    19: iload           4
        //    21: ifne            89
        //    24: invokevirtual   org/rusherhack/client/api/feature/module/ToggleableModule.isToggled:()Z
        //    27: ifeq            86
        //    30: goto            37
        //    33: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    36: athrow         
        //    37: getstatic       org/rusherhack/AutoTool.f9156:Lorg/rusherhack/AutoTool;
        //    40: iload           4
        //    42: ifne            89
        //    45: goto            52
        //    48: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    51: athrow         
        //    52: getfield        org/rusherhack/AutoTool.mining:Lorg/rusherhack/core/setting/BooleanSetting;
        //    55: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    58: checkcast       Ljava/lang/Boolean;
        //    61: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    64: ifeq            86
        //    67: goto            74
        //    70: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    73: athrow         
        //    74: getstatic       org/rusherhack/AutoTool.f9156:Lorg/rusherhack/AutoTool;
        //    77: aload_1        
        //    78: invokevirtual   org/rusherhack/AutoTool.m17495:(Lnet.minecraft.block.BlockState;)I
        //    81: ireturn        
        //    82: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    85: athrow         
        //    86: getstatic       org/rusherhack/AutoTool.f9156:Lorg/rusherhack/AutoTool;
        //    89: getstatic       net.minecraft.item.ItemStack.EMPTY:Lnet.minecraft.item.ItemStack;
        //    92: aload_1        
        //    93: invokevirtual   org/rusherhack/AutoTool.m17491:(Lnet.minecraft.item.ItemStack;Lnet.minecraft.block.BlockState;)F
        //    96: fstore          9
        //    98: sipush          14370
        //   101: fconst_0       
        //   102: fstore          6
        //   104: ldc2_w          3485426953349152292
        //   107: lload_2        
        //   108: lxor           
        //   109: iconst_m1      
        //   110: istore          7
        //   112: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //   117: dup            
        //   118: istore          8
        //   120: aload           5
        //   122: getfield        org/rusherhack/FastBreak.pullToolsOutOfInventory:Lorg/rusherhack/core/setting/BooleanSetting;
        //   125: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   128: checkcast       Ljava/lang/Boolean;
        //   131: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   134: ifeq            169
        //   137: sipush          32332
        //   140: ldc2_w          4625608729784318032
        //   143: lload_2        
        //   144: lxor           
        //   145: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //   150: iload           4
        //   152: ifne            182
        //   155: goto            162
        //   158: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   161: athrow         
        //   162: goto            185
        //   165: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   168: athrow         
        //   169: sipush          18590
        //   172: ldc2_w          8510994190879018642
        //   175: lload_2        
        //   176: lxor           
        //   177: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //   182: iconst_1       
        //   183: dup            
        //   184: pop2           
        //   185: if_icmplt       370
        //   188: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   191: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   194: getfield        net.minecraft.entity.player.PlayerEntity.playerScreenHandler:Lnet.minecraft.screen.PlayerScreenHandler;
        //   197: iload           8
        //   199: invokevirtual   net.minecraft.screen.ScreenHandler.getSlot:(I)Lnet.minecraft.screen.slot.Slot;
        //   202: invokevirtual   net.minecraft.screen.slot.Slot.getStack:()Lnet.minecraft.item.ItemStack;
        //   205: astore_0       
        //   206: getstatic       org/rusherhack/AutoTool.f9156:Lorg/rusherhack/AutoTool;
        //   209: aload_0        
        //   210: aload_1        
        //   211: invokevirtual   org/rusherhack/AutoTool.m17491:(Lnet.minecraft.item.ItemStack;Lnet.minecraft.block.BlockState;)F
        //   214: fstore          10
        //   216: aload_0        
        //   217: invokevirtual   net.minecraft.item.ItemStack.getMaxDamage:()I
        //   220: aload_0        
        //   221: invokevirtual   net.minecraft.item.ItemStack.getDamage:()I
        //   224: isub           
        //   225: i2f            
        //   226: fstore_0       
        //   227: fload           10
        //   229: fload           9
        //   231: fcmpl          
        //   232: iload           4
        //   234: ifne            360
        //   237: ifgt            351
        //   240: goto            247
        //   243: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   246: athrow         
        //   247: fload           10
        //   249: fload           9
        //   251: fcmpl          
        //   252: iload           4
        //   254: ifne            367
        //   257: goto            264
        //   260: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   263: athrow         
        //   264: ifne            362
        //   267: goto            274
        //   270: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   273: athrow         
        //   274: fload           6
        //   276: fconst_0       
        //   277: fcmpl          
        //   278: iload           4
        //   280: ifne            367
        //   283: goto            290
        //   286: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   289: athrow         
        //   290: ifle            362
        //   293: goto            300
        //   296: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   299: athrow         
        //   300: fload_0        
        //   301: fconst_0       
        //   302: fcmpl          
        //   303: iload           4
        //   305: ifne            360
        //   308: goto            315
        //   311: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   314: athrow         
        //   315: ifeq            351
        //   318: goto            325
        //   321: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   324: athrow         
        //   325: fload_0        
        //   326: fload           6
        //   328: fcmpl          
        //   329: iload           4
        //   331: ifne            367
        //   334: goto            341
        //   337: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   340: athrow         
        //   341: ifle            362
        //   344: goto            351
        //   347: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   350: athrow         
        //   351: fload           10
        //   353: fstore          9
        //   355: fload_0        
        //   356: fstore          6
        //   358: iload           8
        //   360: istore          7
        //   362: iinc            8, -1
        //   365: iload           8
        //   367: goto            120
        //   370: iload           7
        //   372: ireturn        
        //    StackMapTable: 00 26 FF 00 21 00 05 07 00 02 07 02 10 04 01 07 00 02 00 01 07 00 6A 03 4A 07 00 6A 43 07 02 16 51 07 00 6A 03 47 07 00 6A 03 42 07 02 16 FF 00 1E 00 09 00 07 02 10 04 01 07 00 02 02 01 01 02 00 01 01 65 07 00 6A FF 00 03 00 09 00 07 02 10 04 01 07 00 02 02 01 01 02 00 02 01 01 42 07 00 6A 43 01 FF 00 0C 00 09 00 07 02 10 04 01 07 00 02 02 01 01 02 00 02 01 01 FF 00 02 00 09 00 07 02 10 04 01 07 00 02 02 01 01 02 00 02 01 01 FF 00 39 00 0A 02 07 02 10 04 01 07 00 02 02 01 01 02 02 00 01 07 00 6A 03 4C 07 00 6A 43 01 45 07 00 6A 03 4B 07 00 6A 43 01 45 07 00 6A 03 4A 07 00 6A 43 01 45 07 00 6A 03 4B 07 00 6A 43 01 45 07 00 6A 03 48 01 01 44 01 FF 00 02 00 09 00 07 02 10 04 01 07 00 02 02 01 01 02 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  16     30     33     37     Ljava/lang/MatchException;
        //  24     45     48     52     Ljava/lang/MatchException;
        //  37     67     70     74     Ljava/lang/MatchException;
        //  52     82     82     86     Ljava/lang/MatchException;
        //  120    155    158    162    Ljava/lang/MatchException;
        //  137    165    165    169    Ljava/lang/MatchException;
        //  227    240    243    247    Ljava/lang/MatchException;
        //  237    257    260    264    Ljava/lang/MatchException;
        //  247    267    270    274    Ljava/lang/MatchException;
        //  264    283    286    290    Ljava/lang/MatchException;
        //  274    293    296    300    Ljava/lang/MatchException;
        //  290    308    311    315    Ljava/lang/MatchException;
        //  300    318    321    325    Ljava/lang/MatchException;
        //  315    334    337    341    Ljava/lang/MatchException;
        //  325    344    347    351    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Subscribe
    private void m11351(final EventUpdate p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          14156290393793
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9155:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          5
        //    16: aload           5
        //    18: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //    21: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    24: iload           4
        //    26: ifeq            55
        //    29: getstatic       org/rusherhack/Obf123.f2572:Lorg/rusherhack/Obf123;
        //    32: if_acmpeq       47
        //    35: goto            42
        //    38: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    41: athrow         
        //    42: return         
        //    43: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    46: athrow         
        //    47: aload           5
        //    49: getfield        org/rusherhack/FastBreak.pausewhileeating:Lorg/rusherhack/core/setting/BooleanSetting;
        //    52: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    55: checkcast       Ljava/lang/Boolean;
        //    58: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    61: iload           4
        //    63: ifeq            116
        //    66: ifeq            115
        //    69: goto            76
        //    72: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    75: athrow         
        //    76: getstatic       org/rusherhack/AutoEat.f2905:Lorg/rusherhack/AutoEat;
        //    79: invokevirtual   org/rusherhack/AutoEat.m6292:()Z
        //    82: iload           4
        //    84: ifeq            116
        //    87: goto            94
        //    90: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    93: athrow         
        //    94: ifeq            115
        //    97: goto            104
        //   100: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   103: athrow         
        //   104: iconst_1       
        //   105: dup            
        //   106: dup            
        //   107: pop2           
        //   108: goto            119
        //   111: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   114: athrow         
        //   115: iconst_0       
        //   116: iconst_1       
        //   117: dup            
        //   118: pop2           
        //   119: istore_1       
        //   120: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   123: aload           5
        //   125: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   128: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //   131: iload           4
        //   133: ifeq            389
        //   136: ifne            384
        //   139: goto            146
        //   142: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   145: athrow         
        //   146: aload           5
        //   148: iload           4
        //   150: ifeq            386
        //   153: goto            160
        //   156: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   159: athrow         
        //   160: dup            
        //   161: getfield        org/rusherhack/FastBreak.f5621:Ljava/util/Map;
        //   164: swap           
        //   165: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   168: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   173: checkcast       Lit/unimi/dsi/fastutil/floats/FloatFloatMutablePair;
        //   176: dup            
        //   177: astore_0       
        //   178: ifnull          384
        //   181: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   184: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   187: aload           5
        //   189: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   192: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //   195: astore          6
        //   197: iload_1        
        //   198: iload           4
        //   200: ifeq            227
        //   203: ifne            228
        //   206: goto            213
        //   209: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   212: athrow         
        //   213: aload           5
        //   215: aload           6
        //   217: invokevirtual   org/rusherhack/FastBreak.m11360:(Lnet.minecraft.block.BlockState;)Z
        //   220: goto            227
        //   223: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   226: athrow         
        //   227: pop            
        //   228: aload_0        
        //   229: dup            
        //   230: invokeinterface it/unimi/dsi/fastutil/floats/FloatFloatPair.firstFloat:()F
        //   235: dup            
        //   236: fstore          7
        //   238: invokeinterface it/unimi/dsi/fastutil/floats/FloatFloatPair.second:(F)Lit/unimi/dsi/fastutil/floats/FloatFloatPair;
        //   243: pop            
        //   244: aload           5
        //   246: getfield        org/rusherhack/FastBreak.syncsMiningToTheServerTps:Lorg/rusherhack/core/setting/BooleanSetting;
        //   249: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   252: checkcast       Ljava/lang/Boolean;
        //   255: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   258: ifeq            280
        //   261: invokestatic    org/rusherhack/client/api/RusherHackAPI.getServerState:()Lorg/rusherhack/client/api/system/IServerState;
        //   264: invokeinterface org/rusherhack/client/api/system/IServerState.getTPS:()F
        //   269: ldc_w           20.0
        //   272: fdiv           
        //   273: goto            281
        //   276: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   279: athrow         
        //   280: fconst_1       
        //   281: fstore          8
        //   283: fload           7
        //   285: aload           6
        //   287: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   290: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   293: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   296: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   299: aload           5
        //   301: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   304: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.calcBlockBreakingDelta:(Lnet.minecraft.entity.player.PlayerEntity;Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)F
        //   307: fload           8
        //   309: fmul           
        //   310: fadd           
        //   311: fstore          7
        //   313: iload_1        
        //   314: aload_0        
        //   315: fload           7
        //   317: invokeinterface it/unimi/dsi/fastutil/floats/FloatFloatPair.first:(F)Lit/unimi/dsi/fastutil/floats/FloatFloatPair;
        //   322: pop            
        //   323: iload           4
        //   325: ifeq            354
        //   328: ifne            350
        //   331: goto            338
        //   334: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   337: athrow         
        //   338: aload           5
        //   340: invokevirtual   org/rusherhack/FastBreak.m11348:()V
        //   343: goto            350
        //   346: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   349: athrow         
        //   350: fload           7
        //   352: fconst_1       
        //   353: fcmpl          
        //   354: iload           4
        //   356: ifeq            389
        //   359: iflt            384
        //   362: goto            369
        //   365: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   368: athrow         
        //   369: aload           5
        //   371: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   374: putfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   377: goto            384
        //   380: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   383: athrow         
        //   384: aload           5
        //   386: getfield        org/rusherhack/FastBreak.f5650:I
        //   389: iload           4
        //   391: ifeq            424
        //   394: ifle            423
        //   397: goto            404
        //   400: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   403: athrow         
        //   404: aload           5
        //   406: dup            
        //   407: getfield        org/rusherhack/FastBreak.f5650:I
        //   410: iconst_1       
        //   411: dup            
        //   412: dup            
        //   413: pop2           
        //   414: isub           
        //   415: putfield        org/rusherhack/FastBreak.f5650:I
        //   418: return         
        //   419: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   422: athrow         
        //   423: iload_1        
        //   424: iload           4
        //   426: ifeq            457
        //   429: ifeq            440
        //   432: goto            439
        //   435: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   438: athrow         
        //   439: return         
        //   440: aload           5
        //   442: iload           4
        //   444: ifeq            558
        //   447: getfield        org/rusherhack/FastBreak.f5627:Z
        //   450: goto            457
        //   453: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   456: athrow         
        //   457: ifne            556
        //   460: aload           5
        //   462: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   465: invokevirtual   java/util/AbstractCollection.isEmpty:()Z
        //   468: iload           4
        //   470: ifeq            542
        //   473: goto            480
        //   476: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   479: athrow         
        //   480: ifeq            531
        //   483: goto            490
        //   486: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   489: athrow         
        //   490: aload           5
        //   492: iload           4
        //   494: ifeq            527
        //   497: goto            504
        //   500: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   503: athrow         
        //   504: getfield        org/rusherhack/FastBreak.f5625:I
        //   507: iconst_m1      
        //   508: if_icmpeq       530
        //   511: goto            518
        //   514: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   517: athrow         
        //   518: aload           5
        //   520: goto            527
        //   523: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   526: athrow         
        //   527: invokevirtual   org/rusherhack/FastBreak.m11348:()V
        //   530: return         
        //   531: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   534: aload           5
        //   536: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   539: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //   542: ifne            546
        //   545: return         
        //   546: aload           5
        //   548: dup            
        //   549: invokevirtual   org/rusherhack/FastBreak.m11354:()Lnet.minecraft.util.math.BlockPos;
        //   552: astore_0       
        //   553: goto            563
        //   556: aload           5
        //   558: dup            
        //   559: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   562: astore_0       
        //   563: aload_0        
        //   564: invokevirtual   org/rusherhack/FastBreak.m11341:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.util.hit.BlockHitResult;
        //   567: dup            
        //   568: astore          6
        //   570: ifnonnull       574
        //   573: return         
        //   574: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   577: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   580: checkcast       Lorg/rusherhack/client/api/accessors/world/IMixinClientLevel;
        //   583: invokeinterface org/rusherhack/client/api/accessors/world/IMixinClientLevel.invokeGetBlockStatePredictionHandler:()Lnet.minecraft.client.network.PendingUpdateManager;
        //   588: dup            
        //   589: astore          7
        //   591: dup            
        //   592: invokevirtual   net.minecraft.client.network.PendingUpdateManager.incrementSequence:()Lnet.minecraft.client.network.PendingUpdateManager;
        //   595: invokevirtual   net.minecraft.client.network.PendingUpdateManager.getSequence:()I
        //   598: istore          8
        //   600: invokevirtual   net.minecraft.client.network.PendingUpdateManager.close:()V
        //   603: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   606: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   609: aload_0        
        //   610: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //   613: astore_1       
        //   614: aload           5
        //   616: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   619: aload_0        
        //   620: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   623: iload           4
        //   625: ifeq            842
        //   628: ifne            828
        //   631: goto            638
        //   634: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   637: athrow         
        //   638: ldc_w           "i)U`\u00043\r`\u00043\r`\u00043"
        //   641: aload           5
        //   643: dup            
        //   644: dup_x2         
        //   645: aload           5
        //   647: iload           8
        //   649: invokevirtual   org/rusherhack/FastBreak.m11367:(I)V
        //   652: invokestatic    java/lang/System.currentTimeMillis:()J
        //   655: putfield        org/rusherhack/FastBreak.f5624:J
        //   658: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   661: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   664: getfield        net.minecraft.entity.Entity.age:I
        //   667: putfield        org/rusherhack/FastBreak.f5660:I
        //   670: invokestatic    org/rusherhack/core/utils/Pair.$:(Ljava/lang/String;)Ljava/lang/String;
        //   673: iconst_3       
        //   674: anewarray       Ljava/lang/Object;
        //   677: dup            
        //   678: iconst_0       
        //   679: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   682: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   685: getfield        net.minecraft.entity.Entity.age:I
        //   688: aload           5
        //   690: getfield        org/rusherhack/FastBreak.f5660:I
        //   693: isub           
        //   694: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   697: aastore        
        //   698: dup            
        //   699: iconst_1       
        //   700: dup            
        //   701: dup            
        //   702: pop2           
        //   703: invokestatic    java/lang/System.currentTimeMillis:()J
        //   706: aload           5
        //   708: getfield        org/rusherhack/FastBreak.f5624:J
        //   711: lsub           
        //   712: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   715: aastore        
        //   716: dup            
        //   717: iconst_2       
        //   718: aload           5
        //   720: iload           4
        //   722: ifeq            774
        //   725: goto            732
        //   728: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   731: athrow         
        //   732: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //   735: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   738: getstatic       org/rusherhack/Obf123.f2571:Lorg/rusherhack/Obf123;
        //   741: if_acmpne       772
        //   744: goto            751
        //   747: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   750: athrow         
        //   751: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   754: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   757: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   760: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.getDestroyProgress:()F
        //   765: goto            777
        //   768: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   771: athrow         
        //   772: aload           5
        //   774: getfield        org/rusherhack/FastBreak.f5653:F
        //   777: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   780: aastore        
        //   781: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   784: invokevirtual   org/rusherhack/FastBreak.m11371:(Ljava/lang/String;)V
        //   787: aload           5
        //   789: aload           6
        //   791: aload_1        
        //   792: invokevirtual   org/rusherhack/FastBreak.m11374:(Lnet.minecraft.util.hit.BlockHitResult;Lnet.minecraft.block.BlockState;)Z
        //   795: ifeq            827
        //   798: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   801: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   804: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   807: new             Lnet.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
        //   810: dup            
        //   811: getstatic       net.minecraft.util.Hand.MAIN_HAND:Lnet.minecraft.util.Hand;
        //   814: invokespecial   net.minecraft.network.packet.c2s.play.HandSwingC2SPacket.<init>:(Lnet.minecraft.util.Hand;)V
        //   817: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //   820: goto            827
        //   823: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   826: athrow         
        //   827: return         
        //   828: aload           5
        //   830: getfield        org/rusherhack/FastBreak.rotatesToTheBlockYouAreCurrentlyMining:Lorg/rusherhack/core/setting/BooleanSetting;
        //   833: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   836: checkcast       Ljava/lang/Boolean;
        //   839: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   842: iload           4
        //   844: ifeq            922
        //   847: ifeq            908
        //   850: goto            857
        //   853: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   856: athrow         
        //   857: invokestatic    org/rusherhack/client/api/RusherHackAPI.getRotationManager:()Lorg/rusherhack/client/api/system/IRotationManager;
        //   860: aload           6
        //   862: ldc_w           180.0
        //   865: invokeinterface org/rusherhack/client/api/system/IRotationManager.updateRotation:(Lnet.minecraft.util.hit.BlockHitResult;F)V
        //   870: invokestatic    org/rusherhack/client/api/RusherHackAPI.getRotationManager:()Lorg/rusherhack/client/api/system/IRotationManager;
        //   873: aload_0        
        //   874: invokeinterface org/rusherhack/client/api/system/IRotationManager.getLookRaycast:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.util.hit.BlockHitResult;
        //   879: dup            
        //   880: astore          6
        //   882: invokevirtual   net.minecraft.util.hit.BlockHitResult.getType:()Lnet.minecraft.util.hit.HitResult.Type;
        //   885: iload           4
        //   887: ifeq            916
        //   890: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //   893: if_acmpne       908
        //   896: goto            903
        //   899: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   902: athrow         
        //   903: return         
        //   904: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   907: athrow         
        //   908: aload           5
        //   910: getfield        org/rusherhack/FastBreak.updatedncpAdjustments:Lorg/rusherhack/core/setting/BooleanSetting;
        //   913: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   916: checkcast       Ljava/lang/Boolean;
        //   919: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   922: iload           4
        //   924: ifeq            991
        //   927: ifeq            971
        //   930: goto            937
        //   933: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   936: athrow         
        //   937: aload           5
        //   939: getfield        org/rusherhack/FastBreak.f5639:Lorg/rusherhack/core/utils/Timer;
        //   942: ldc2_w          25.0
        //   945: invokevirtual   org/rusherhack/core/utils/Timer.passed:(D)Z
        //   948: iload           4
        //   950: ifeq            991
        //   953: goto            960
        //   956: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   959: athrow         
        //   960: ifne            971
        //   963: goto            970
        //   966: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   969: athrow         
        //   970: return         
        //   971: aload           5
        //   973: dup            
        //   974: aload_1        
        //   975: invokevirtual   org/rusherhack/FastBreak.m11360:(Lnet.minecraft.block.BlockState;)Z
        //   978: pop            
        //   979: getfield        org/rusherhack/FastBreak.syncsMiningToTheServerTps:Lorg/rusherhack/core/setting/BooleanSetting;
        //   982: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   985: checkcast       Ljava/lang/Boolean;
        //   988: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   991: ifeq            1013
        //   994: invokestatic    org/rusherhack/client/api/RusherHackAPI.getServerState:()Lorg/rusherhack/client/api/system/IServerState;
        //   997: invokeinterface org/rusherhack/client/api/system/IServerState.getTPS:()F
        //  1002: ldc_w           20.0
        //  1005: fdiv           
        //  1006: goto            1014
        //  1009: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1012: athrow         
        //  1013: fconst_1       
        //  1014: fstore          7
        //  1016: aload           5
        //  1018: dup            
        //  1019: dup_x1         
        //  1020: getfield        org/rusherhack/FastBreak.f5653:F
        //  1023: fstore          9
        //  1025: dup            
        //  1026: getfield        org/rusherhack/FastBreak.f5653:F
        //  1029: aload_1        
        //  1030: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1033: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1036: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1039: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //  1042: aload_0        
        //  1043: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.calcBlockBreakingDelta:(Lnet.minecraft.entity.player.PlayerEntity;Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)F
        //  1046: fload           7
        //  1048: fmul           
        //  1049: fadd           
        //  1050: putfield        org/rusherhack/FastBreak.f5653:F
        //  1053: getfield        org/rusherhack/FastBreak.f5621:Ljava/util/Map;
        //  1056: aload_0        
        //  1057: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1062: checkcast       Lit/unimi/dsi/fastutil/floats/FloatFloatMutablePair;
        //  1065: dup            
        //  1066: astore_1       
        //  1067: iload           4
        //  1069: ifeq            1100
        //  1072: ifnull          1109
        //  1075: goto            1082
        //  1078: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1081: athrow         
        //  1082: aload_1        
        //  1083: aload           5
        //  1085: getfield        org/rusherhack/FastBreak.f5653:F
        //  1088: invokeinterface it/unimi/dsi/fastutil/floats/FloatFloatPair.first:(F)Lit/unimi/dsi/fastutil/floats/FloatFloatPair;
        //  1093: goto            1100
        //  1096: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1099: athrow         
        //  1100: aload_1        
        //  1101: fload           9
        //  1103: invokeinterface it/unimi/dsi/fastutil/floats/FloatFloatPair.second:(F)Lit/unimi/dsi/fastutil/floats/FloatFloatPair;
        //  1108: pop2           
        //  1109: aload           5
        //  1111: ldc_w           "Update %s, %s, %s"
        //  1114: iconst_3       
        //  1115: anewarray       Ljava/lang/Object;
        //  1118: dup            
        //  1119: iconst_0       
        //  1120: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1123: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1126: getfield        net.minecraft.entity.Entity.age:I
        //  1129: aload           5
        //  1131: getfield        org/rusherhack/FastBreak.f5660:I
        //  1134: isub           
        //  1135: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1138: aastore        
        //  1139: dup            
        //  1140: iconst_1       
        //  1141: dup            
        //  1142: dup            
        //  1143: pop2           
        //  1144: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1147: aload           5
        //  1149: getfield        org/rusherhack/FastBreak.f5624:J
        //  1152: lsub           
        //  1153: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1156: aastore        
        //  1157: dup            
        //  1158: iconst_2       
        //  1159: aload           5
        //  1161: iload           4
        //  1163: ifeq            1208
        //  1166: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //  1169: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1172: getstatic       org/rusherhack/Obf123.f2571:Lorg/rusherhack/Obf123;
        //  1175: if_acmpne       1206
        //  1178: goto            1185
        //  1181: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1184: athrow         
        //  1185: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1188: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //  1191: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //  1194: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.getDestroyProgress:()F
        //  1199: goto            1211
        //  1202: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1205: athrow         
        //  1206: aload           5
        //  1208: getfield        org/rusherhack/FastBreak.f5653:F
        //  1211: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1214: aastore        
        //  1215: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1218: invokevirtual   org/rusherhack/FastBreak.m11371:(Ljava/lang/String;)V
        //  1221: aload           5
        //  1223: iload           4
        //  1225: ifeq            1311
        //  1228: getfield        org/rusherhack/FastBreak.f5653:F
        //  1231: fconst_1       
        //  1232: aload           5
        //  1234: getfield        org/rusherhack/FastBreak.speed:Lorg/rusherhack/core/setting/NumberSetting;
        //  1237: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1240: checkcast       Ljava/lang/Float;
        //  1243: invokevirtual   java/lang/Float.floatValue:()F
        //  1246: fsub           
        //  1247: fcmpl          
        //  1248: iflt            1287
        //  1251: goto            1258
        //  1254: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1257: athrow         
        //  1258: iconst_0       
        //  1259: aload           5
        //  1261: dup_x1         
        //  1262: aload           6
        //  1264: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //  1267: aload           6
        //  1269: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //  1272: iload           8
        //  1274: invokevirtual   org/rusherhack/FastBreak.m11362:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.math.Direction;I)V
        //  1277: putfield        org/rusherhack/FastBreak.f5627:Z
        //  1280: goto            1287
        //  1283: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1286: athrow         
        //  1287: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1290: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1293: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //  1296: new             Lnet.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
        //  1299: dup            
        //  1300: getstatic       net.minecraft.util.Hand.MAIN_HAND:Lnet.minecraft.util.Hand;
        //  1303: invokespecial   net.minecraft.network.packet.c2s.play.HandSwingC2SPacket.<init>:(Lnet.minecraft.util.Hand;)V
        //  1306: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //  1309: aload           5
        //  1311: invokevirtual   org/rusherhack/FastBreak.m11348:()V
        //  1314: return         
        //    StackMapTable: 00 73 FF 00 26 00 05 07 00 02 07 02 DA 04 01 07 00 02 00 01 07 00 6A 03 40 07 00 6A 03 47 07 01 5F 50 07 00 6A 03 4D 07 00 6A 43 01 45 07 00 6A 03 46 07 00 6A 03 40 01 42 01 FF 00 16 00 05 07 00 02 01 04 01 07 00 02 00 01 07 00 6A 03 49 07 00 6A 43 07 00 02 FF 00 30 00 06 07 02 5C 01 04 01 07 00 02 07 02 10 00 01 07 00 6A 03 49 07 00 6A 43 01 00 FF 00 2F 00 07 07 02 5C 01 04 01 07 00 02 07 02 10 02 00 01 07 00 6A 03 40 02 FF 00 34 00 08 07 02 5C 01 04 01 07 00 02 07 02 10 02 02 00 01 07 00 6A 03 47 07 00 6A 03 43 01 4A 07 00 6A 03 4A 07 00 6A FF 00 03 00 05 07 01 5F 01 04 01 07 00 02 00 00 41 07 00 02 42 01 4A 07 00 6A 03 4E 07 00 6A 03 40 01 4A 07 00 6A 03 00 4C 07 00 6A 43 01 52 07 00 6A 43 01 45 07 00 6A 03 49 07 00 6A 43 07 00 02 49 07 00 6A 03 44 07 00 6A 43 07 00 02 02 00 4A 01 03 09 41 07 00 02 FF 00 04 00 05 07 00 C9 01 04 01 07 00 02 00 01 07 00 02 FC 00 0A 07 02 C3 FF 00 3B 00 08 07 00 C9 07 02 10 04 01 07 00 02 07 02 C3 07 02 8E 01 00 01 07 00 6A 03 F7 00 59 07 00 6A FF 00 03 00 08 07 00 C9 07 02 10 04 01 07 00 02 07 02 C3 07 02 8E 01 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 07 00 02 4E 07 00 6A FF 00 03 00 08 07 00 C9 07 02 10 04 01 07 00 02 07 02 C3 07 02 8E 01 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 50 07 00 6A FF 00 03 00 08 07 00 C9 07 02 10 04 01 07 00 02 07 02 C3 07 02 8E 01 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 FF 00 01 00 08 07 00 C9 07 02 10 04 01 07 00 02 07 02 C3 07 02 8E 01 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 07 00 02 FF 00 02 00 08 07 00 C9 07 02 10 04 01 07 00 02 07 02 C3 07 02 8E 01 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 02 6D 07 00 6A 03 00 4D 01 4A 07 00 6A 03 69 07 00 6A 03 40 07 00 6A 03 47 07 01 5F 45 01 4A 07 00 6A 03 52 07 00 6A 43 01 45 07 00 6A 03 00 53 01 51 07 00 6A 03 40 02 FF 00 3F 00 09 07 00 C9 07 02 5C 04 01 07 00 02 07 02 C3 02 01 02 00 01 07 00 6A 03 4D 07 00 6A 43 07 02 5E 08 F7 00 47 07 00 6A FF 00 03 00 09 07 00 C9 07 02 5C 04 01 07 00 02 07 02 C3 02 01 02 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 50 07 00 6A FF 00 03 00 09 07 00 C9 07 02 5C 04 01 07 00 02 07 02 C3 02 01 02 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 FF 00 01 00 09 07 00 C9 07 02 5C 04 01 07 00 02 07 02 C3 02 01 02 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 07 00 02 FF 00 02 00 09 07 00 C9 07 02 5C 04 01 07 00 02 07 02 C3 02 01 02 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 02 6A 07 00 6A 03 58 07 00 6A 03 57 07 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  16     35     38     42     Ljava/lang/MatchException;
        //  29     43     43     47     Ljava/lang/MatchException;
        //  55     69     72     76     Ljava/lang/MatchException;
        //  66     87     90     94     Ljava/lang/MatchException;
        //  76     97     100    104    Ljava/lang/MatchException;
        //  94     111    111    115    Ljava/lang/MatchException;
        //  120    139    142    146    Ljava/lang/MatchException;
        //  136    153    156    160    Ljava/lang/MatchException;
        //  197    206    209    213    Ljava/lang/MatchException;
        //  203    220    223    227    Ljava/lang/MatchException;
        //  238    276    276    280    Ljava/lang/MatchException;
        //  313    331    334    338    Ljava/lang/MatchException;
        //  328    343    346    350    Ljava/lang/MatchException;
        //  354    362    365    369    Ljava/lang/MatchException;
        //  359    377    380    384    Ljava/lang/MatchException;
        //  389    397    400    404    Ljava/lang/MatchException;
        //  394    419    419    423    Ljava/lang/MatchException;
        //  424    432    435    439    Ljava/lang/MatchException;
        //  440    450    453    457    Ljava/lang/MatchException;
        //  457    473    476    480    Ljava/lang/MatchException;
        //  460    483    486    490    Ljava/lang/MatchException;
        //  480    497    500    504    Ljava/lang/MatchException;
        //  490    511    514    518    Ljava/lang/MatchException;
        //  504    520    523    527    Ljava/lang/MatchException;
        //  614    631    634    638    Ljava/lang/MatchException;
        //  628    725    728    732    Ljava/lang/MatchException;
        //  638    744    747    751    Ljava/lang/MatchException;
        //  732    768    768    772    Ljava/lang/MatchException;
        //  777    820    823    827    Ljava/lang/MatchException;
        //  842    850    853    857    Ljava/lang/MatchException;
        //  882    896    899    903    Ljava/lang/MatchException;
        //  890    904    904    908    Ljava/lang/MatchException;
        //  922    930    933    937    Ljava/lang/MatchException;
        //  927    953    956    960    Ljava/lang/MatchException;
        //  937    963    966    970    Ljava/lang/MatchException;
        //  991    1009   1009   1013   Ljava/lang/MatchException;
        //  1067   1075   1078   1082   Ljava/lang/MatchException;
        //  1072   1093   1096   1100   Ljava/lang/MatchException;
        //  1109   1178   1181   1185   Ljava/lang/MatchException;
        //  1166   1202   1202   1206   Ljava/lang/MatchException;
        //  1211   1251   1254   1258   Ljava/lang/MatchException;
        //  1228   1280   1283   1287   Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public FastBreak() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          123235202127838
        //     6: lxor           
        //     7: lstore_1       
        //     8: aload_0        
        //     9: dup            
        //    10: dup2           
        //    11: ldc_w           "FastBreak"
        //    14: ldc_w           "0D\u0017W\u0019\u0016\u0010Z\u001dU\u0019ERP\u0013E\u0006S\u0000"
        //    17: invokestatic    org/rusherhack/client/api/feature/command/arg/ItemReference.m1291:(Ljava/lang/String;)Ljava/lang/String;
        //    20: getstatic       org/rusherhack/client/api/feature/module/ModuleCategory.WORLD:Lorg/rusherhack/client/api/feature/module/ModuleCategory;
        //    23: invokespecial   org/rusherhack/client/api/feature/module/ToggleableModule.<init>:(Ljava/lang/String;Ljava/lang/String;Lorg/rusherhack/client/api/feature/module/ModuleCategory;)V
        //    26: new             Lorg/rusherhack/core/setting/EnumSetting;
        //    29: aload_0        
        //    30: dup_x2         
        //    31: dup            
        //    32: pop2           
        //    33: dup            
        //    34: ldc_w           "Mode"
        //    37: getstatic       org/rusherhack/Obf123.f2571:Lorg/rusherhack/Obf123;
        //    40: invokespecial   org/rusherhack/core/setting/EnumSetting.<init>:(Ljava/lang/String;Ljava/lang/Enum;)V
        //    43: putfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //    46: new             Lorg/rusherhack/core/setting/NumberSetting;
        //    49: aload_0        
        //    50: dup            
        //    51: pop2           
        //    52: dup            
        //    53: ldc_w           "Speed"
        //    56: ldc_w           0.3
        //    59: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    62: fconst_0       
        //    63: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    66: fconst_1       
        //    67: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    70: invokespecial   org/rusherhack/core/setting/NumberSetting.<init>:(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
        //    73: ldc2_w          0.10000000149011612
        //    76: invokevirtual   org/rusherhack/core/setting/NumberSetting.incremental:(D)Lorg/rusherhack/core/setting/NumberSetting;
        //    79: putfield        org/rusherhack/FastBreak.speed:Lorg/rusherhack/core/setting/NumberSetting;
        //    82: new             Lorg/rusherhack/core/setting/NumberSetting;
        //    85: aload_0        
        //    86: dup            
        //    87: pop2           
        //    88: dup            
        //    89: ldc_w           "Delay"
        //    92: ldc_w           "Ticks between destroying blocks"
        //    95: iconst_0       
        //    96: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    99: iconst_0       
        //   100: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   103: iconst_5       
        //   104: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   107: invokespecial   org/rusherhack/core/setting/NumberSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
        //   110: putfield        org/rusherhack/FastBreak.ticksBetweenDestroyingBlocks:Lorg/rusherhack/core/setting/NumberSetting;
        //   113: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   116: aload_0        
        //   117: dup            
        //   118: pop2           
        //   119: dup            
        //   120: ldc_w           "Instamine"
        //   123: ldc_w           "Instantly mine some blocks that normally wouldn't be"
        //   126: iconst_1       
        //   127: dup            
        //   128: dup            
        //   129: pop2           
        //   130: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   133: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   136: aload_0        
        //   137: invokedynamic   BootstrapMethod #1, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   142: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   145: putfield        org/rusherhack/FastBreak.f5655:Lorg/rusherhack/core/setting/BooleanSetting;
        //   148: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   151: aload_0        
        //   152: dup            
        //   153: pop2           
        //   154: dup            
        //   155: ldc_w           "TPSSync"
        //   158: ldc_w           "Syncs mining to the server TPS"
        //   161: iconst_1       
        //   162: dup            
        //   163: dup            
        //   164: pop2           
        //   165: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   168: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   171: aload_0        
        //   172: dup_x1         
        //   173: invokedynamic   BootstrapMethod #2, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   178: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   181: putfield        org/rusherhack/FastBreak.syncsMiningToTheServerTps:Lorg/rusherhack/core/setting/BooleanSetting;
        //   184: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   187: aload_0        
        //   188: dup            
        //   189: pop2           
        //   190: dup            
        //   191: ldc_w           "Grim"
        //   194: ldc_w           "Grim bypass"
        //   197: iconst_1       
        //   198: dup            
        //   199: dup            
        //   200: pop2           
        //   201: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   204: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   207: aload_0        
        //   208: dup_x1         
        //   209: invokedynamic   BootstrapMethod #3, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   214: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   217: putfield        org/rusherhack/FastBreak.grimBypass:Lorg/rusherhack/core/setting/BooleanSetting;
        //   220: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   223: aload_0        
        //   224: dup            
        //   225: pop2           
        //   226: dup            
        //   227: ldc_w           "Raytrace"
        //   230: ldc_w           "Prevent mining through walls"
        //   233: iconst_0       
        //   234: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   237: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   240: aload_0        
        //   241: dup_x1         
        //   242: invokedynamic   BootstrapMethod #4, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   247: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   250: putfield        org/rusherhack/FastBreak.preventMiningThroughWalls:Lorg/rusherhack/core/setting/BooleanSetting;
        //   253: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   256: aload_0        
        //   257: dup            
        //   258: pop2           
        //   259: dup            
        //   260: ldc_w           "Rotate"
        //   263: ldc_w           "Rotates to the block you are currently mining"
        //   266: iconst_1       
        //   267: dup            
        //   268: dup            
        //   269: pop2           
        //   270: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   273: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   276: aload_0        
        //   277: dup_x1         
        //   278: invokedynamic   BootstrapMethod #5, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   283: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   286: putfield        org/rusherhack/FastBreak.rotatesToTheBlockYouAreCurrentlyMining:Lorg/rusherhack/core/setting/BooleanSetting;
        //   289: aload_0        
        //   290: dup            
        //   291: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   294: aload_0        
        //   295: dup_x1         
        //   296: dup            
        //   297: pop2           
        //   298: dup            
        //   299: ldc_w           "AutoSwitch"
        //   302: ldc_w           "Automatically switches to best tool"
        //   305: iconst_1       
        //   306: dup            
        //   307: dup            
        //   308: pop2           
        //   309: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   312: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   315: putfield        org/rusherhack/FastBreak.automaticallySwitchesToBestTool:Lorg/rusherhack/core/setting/BooleanSetting;
        //   318: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   321: aload_0        
        //   322: dup_x2         
        //   323: dup            
        //   324: pop2           
        //   325: dup            
        //   326: ldc_w           "Silent"
        //   329: ldc_w           "Switch server side only"
        //   332: iconst_1       
        //   333: dup            
        //   334: dup            
        //   335: pop2           
        //   336: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   339: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   342: putfield        org/rusherhack/FastBreak.switchServerSideOnly:Lorg/rusherhack/core/setting/BooleanSetting;
        //   345: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   348: aload_0        
        //   349: dup            
        //   350: pop2           
        //   351: dup            
        //   352: ldc_w           "MultiTask"
        //   355: iconst_1       
        //   356: dup            
        //   357: dup            
        //   358: pop2           
        //   359: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   362: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   365: iconst_1       
        //   366: dup            
        //   367: dup            
        //   368: pop2           
        //   369: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setHidden:(Z)Lorg/rusherhack/core/setting/BooleanSetting;
        //   372: putfield        org/rusherhack/FastBreak.multitask:Lorg/rusherhack/core/setting/BooleanSetting;
        //   375: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   378: aload_0        
        //   379: dup            
        //   380: pop2           
        //   381: dup            
        //   382: ldc_w           "Return"
        //   385: ldc_w           "Returns to the previous item you were holding"
        //   388: iconst_1       
        //   389: dup            
        //   390: dup            
        //   391: pop2           
        //   392: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   395: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   398: aload_0        
        //   399: invokedynamic   BootstrapMethod #6, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   404: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   407: putfield        org/rusherhack/FastBreak.returnsToThePreviousItemYouWereHolding:Lorg/rusherhack/core/setting/BooleanSetting;
        //   410: aload_0        
        //   411: dup            
        //   412: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   415: aload_0        
        //   416: dup_x1         
        //   417: dup            
        //   418: pop2           
        //   419: dup            
        //   420: ldc_w           "Inventory"
        //   423: ldc_w           "Pull tools out of inventory"
        //   426: iconst_1       
        //   427: dup            
        //   428: dup            
        //   429: pop2           
        //   430: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   433: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   436: putfield        org/rusherhack/FastBreak.pullToolsOutOfInventory:Lorg/rusherhack/core/setting/BooleanSetting;
        //   439: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   442: aload_0        
        //   443: dup_x2         
        //   444: dup            
        //   445: pop2           
        //   446: dup            
        //   447: ldc_w           "UpdatedNCP"
        //   450: ldc_w           "UpdatedNCP adjustments"
        //   453: iconst_0       
        //   454: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   457: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   460: putfield        org/rusherhack/FastBreak.updatedncpAdjustments:Lorg/rusherhack/core/setting/BooleanSetting;
        //   463: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   466: aload_0        
        //   467: dup            
        //   468: pop2           
        //   469: dup            
        //   470: ldc_w           "InstantRebreak"
        //   473: ldc_w           "Instantly break the last block you mined"
        //   476: iconst_1       
        //   477: dup            
        //   478: dup            
        //   479: pop2           
        //   480: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   483: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   486: putfield        org/rusherhack/FastBreak.instantlyBreakTheLastBlockYouMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //   489: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   492: aload_0        
        //   493: dup            
        //   494: pop2           
        //   495: dup            
        //   496: ldc_w           "AutoRebreak"
        //   499: ldc_w           "Automatically remine the last block you mined"
        //   502: iconst_0       
        //   503: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   506: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   509: aload_0        
        //   510: invokedynamic   BootstrapMethod #7, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   515: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   518: putfield        org/rusherhack/FastBreak.automaticallyRemineTheLastBlockYouMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //   521: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   524: aload_0        
        //   525: dup            
        //   526: pop2           
        //   527: dup            
        //   528: ldc_w           "Queue"
        //   531: ldc_w           "Queue up blocks to be mined"
        //   534: iconst_1       
        //   535: dup            
        //   536: dup            
        //   537: pop2           
        //   538: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   541: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   544: aload_0        
        //   545: dup_x1         
        //   546: invokedynamic   BootstrapMethod #8, accept:(Lorg/rusherhack/FastBreak;)Ljava/util/function/Consumer;
        //   551: invokevirtual   org/rusherhack/core/setting/BooleanSetting.onChange:(Ljava/util/function/Consumer;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   554: aload_0        
        //   555: invokedynamic   BootstrapMethod #9, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   560: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   563: putfield        org/rusherhack/FastBreak.queueUpBlocksToBeMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //   566: aload_0        
        //   567: dup            
        //   568: new             Lorg/rusherhack/core/setting/EnumSetting;
        //   571: aload_0        
        //   572: dup_x1         
        //   573: dup            
        //   574: pop2           
        //   575: dup            
        //   576: ldc_w           "Priority"
        //   579: getstatic       org/rusherhack/Obf178.f3460:Lorg/rusherhack/Obf178;
        //   582: invokespecial   org/rusherhack/core/setting/EnumSetting.<init>:(Ljava/lang/String;Ljava/lang/Enum;)V
        //   585: putfield        org/rusherhack/FastBreak.priority:Lorg/rusherhack/core/setting/EnumSetting;
        //   588: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   591: aload_0        
        //   592: dup_x2         
        //   593: dup            
        //   594: pop2           
        //   595: dup            
        //   596: ldc_w           "CancelCurrent"
        //   599: ldc_w           "Cancel the current mining progress"
        //   602: iconst_0       
        //   603: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   606: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   609: putfield        org/rusherhack/FastBreak.cancelTheCurrentMiningProgress:Lorg/rusherhack/core/setting/BooleanSetting;
        //   612: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   615: aload_0        
        //   616: dup            
        //   617: pop2           
        //   618: dup            
        //   619: ldc_w           "DoubleBreak"
        //   622: ldc_w           "Breaks multiple blocks at the same time"
        //   625: iconst_1       
        //   626: dup            
        //   627: dup            
        //   628: pop2           
        //   629: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   632: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   635: putfield        org/rusherhack/FastBreak.breaksMultipleBlocksAtTheSameTime:Lorg/rusherhack/core/setting/BooleanSetting;
        //   638: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   641: aload_0        
        //   642: dup            
        //   643: pop2           
        //   644: dup            
        //   645: ldc_w           "PauseWhileEating"
        //   648: iconst_0       
        //   649: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   652: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   655: aload_0        
        //   656: invokedynamic   BootstrapMethod #10, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   661: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   664: putfield        org/rusherhack/FastBreak.pausewhileeating:Lorg/rusherhack/core/setting/BooleanSetting;
        //   667: new             Lorg/rusherhack/core/setting/EnumSetting;
        //   670: aload_0        
        //   671: dup            
        //   672: pop2           
        //   673: dup            
        //   674: ldc_w           "Blocks"
        //   677: getstatic       org/rusherhack/Obf115.f2514:Lorg/rusherhack/Obf115;
        //   680: invokespecial   org/rusherhack/core/setting/EnumSetting.<init>:(Ljava/lang/String;Ljava/lang/Enum;)V
        //   683: aload_0        
        //   684: dup_x1         
        //   685: invokedynamic   BootstrapMethod #11, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   690: invokevirtual   org/rusherhack/core/setting/EnumSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/EnumSetting;
        //   693: putfield        org/rusherhack/FastBreak.blocks:Lorg/rusherhack/core/setting/EnumSetting;
        //   696: new             Lorg/rusherhack/client/api/setting/BindSetting;
        //   699: aload_0        
        //   700: dup            
        //   701: pop2           
        //   702: dup            
        //   703: ldc_w           "Abort"
        //   706: ldc_w           "Bind to abort breaking"
        //   709: getstatic       org/rusherhack/core/bind/key/NullKey.INSTANCE:Lorg/rusherhack/core/bind/key/NullKey;
        //   712: invokespecial   org/rusherhack/client/api/setting/BindSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Lorg/rusherhack/core/bind/key/IKey;)V
        //   715: aload_0        
        //   716: dup_x1         
        //   717: invokedynamic   BootstrapMethod #12, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   722: invokevirtual   org/rusherhack/client/api/setting/BindSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/client/api/setting/BindSetting;
        //   725: putfield        org/rusherhack/FastBreak.bindToAbortBreaking:Lorg/rusherhack/client/api/setting/BindSetting;
        //   728: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   731: aload_0        
        //   732: dup            
        //   733: pop2           
        //   734: dup            
        //   735: ldc_w           "Render"
        //   738: iconst_1       
        //   739: dup            
        //   740: dup            
        //   741: pop2           
        //   742: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   745: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   748: aload_0        
        //   749: dup_x1         
        //   750: invokedynamic   BootstrapMethod #13, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   755: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   758: putfield        org/rusherhack/FastBreak.render:Lorg/rusherhack/core/setting/BooleanSetting;
        //   761: aload_0        
        //   762: dup            
        //   763: dup_x1         
        //   764: dup2           
        //   765: new             Lorg/rusherhack/core/setting/EnumSetting;
        //   768: aload_0        
        //   769: dup_x1         
        //   770: dup            
        //   771: pop2           
        //   772: dup            
        //   773: ldc_w           "Mode"
        //   776: getstatic       org/rusherhack/Obf222.f4124:Lorg/rusherhack/Obf222;
        //   779: invokespecial   org/rusherhack/core/setting/EnumSetting.<init>:(Ljava/lang/String;Ljava/lang/Enum;)V
        //   782: putfield        org/rusherhack/FastBreak.f5646:Lorg/rusherhack/core/setting/EnumSetting;
        //   785: new             Lorg/rusherhack/client/api/setting/ColorSetting;
        //   788: aload_0        
        //   789: dup_x2         
        //   790: dup            
        //   791: pop2           
        //   792: dup            
        //   793: ldc_w           "StartColor"
        //   796: getstatic       java/awt/Color.RED:Ljava/awt/Color;
        //   799: sipush          20997
        //   802: ldc2_w          1614113910682813621
        //   805: lload_1        
        //   806: lxor           
        //   807: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //   812: invokestatic    org/rusherhack/core/utils/ColorUtils.transparency:(Ljava/awt/Color;I)Ljava/awt/Color;
        //   815: invokespecial   org/rusherhack/client/api/setting/ColorSetting.<init>:(Ljava/lang/String;Ljava/awt/Color;)V
        //   818: putfield        org/rusherhack/FastBreak.startcolor:Lorg/rusherhack/client/api/setting/ColorSetting;
        //   821: new             Lorg/rusherhack/client/api/setting/ColorSetting;
        //   824: aload_0        
        //   825: dup            
        //   826: pop2           
        //   827: dup            
        //   828: ldc_w           "EndColor"
        //   831: getstatic       java/awt/Color.GREEN:Ljava/awt/Color;
        //   834: sipush          32664
        //   837: ldc2_w          7906240845295495479
        //   840: lload_1        
        //   841: lxor           
        //   842: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //   847: invokestatic    org/rusherhack/core/utils/ColorUtils.transparency:(Ljava/awt/Color;I)Ljava/awt/Color;
        //   850: invokespecial   org/rusherhack/client/api/setting/ColorSetting.<init>:(Ljava/lang/String;Ljava/awt/Color;)V
        //   853: putfield        org/rusherhack/FastBreak.endcolor:Lorg/rusherhack/client/api/setting/ColorSetting;
        //   856: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   859: aload_0        
        //   860: dup            
        //   861: pop2           
        //   862: dup            
        //   863: ldc_w           "Fill"
        //   866: ldc_w           "Fill the box"
        //   869: iconst_1       
        //   870: dup            
        //   871: dup            
        //   872: pop2           
        //   873: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   876: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   879: putfield        org/rusherhack/FastBreak.fillTheBox:Lorg/rusherhack/core/setting/BooleanSetting;
        //   882: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   885: aload_0        
        //   886: dup            
        //   887: pop2           
        //   888: dup            
        //   889: ldc_w           "Outline"
        //   892: ldc_w           "Outline the box"
        //   895: iconst_1       
        //   896: dup            
        //   897: dup            
        //   898: pop2           
        //   899: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   902: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   905: putfield        org/rusherhack/FastBreak.outlineTheBox:Lorg/rusherhack/core/setting/BooleanSetting;
        //   908: new             Lorg/rusherhack/core/setting/NumberSetting;
        //   911: aload_0        
        //   912: dup            
        //   913: pop2           
        //   914: dup            
        //   915: ldc_w           "Width"
        //   918: ldc_w           "Width of outline"
        //   921: fconst_2       
        //   922: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   925: ldc_w           0.1
        //   928: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   931: ldc_w           3.0
        //   934: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   937: invokespecial   org/rusherhack/core/setting/NumberSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
        //   940: putfield        org/rusherhack/FastBreak.widthOfOutline:Lorg/rusherhack/core/setting/NumberSetting;
        //   943: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   946: aload_0        
        //   947: dup            
        //   948: pop2           
        //   949: dup            
        //   950: ldc_w           "Static"
        //   953: iconst_0       
        //   954: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   957: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   960: aload_0        
        //   961: invokedynamic   BootstrapMethod #14, getAsBoolean:(Lorg/rusherhack/FastBreak;)Ljava/util/function/BooleanSupplier;
        //   966: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   969: putfield        org/rusherhack/FastBreak.staticSetting:Lorg/rusherhack/core/setting/BooleanSetting;
        //   972: aload_0        
        //   973: dup            
        //   974: dup2           
        //   975: dup2           
        //   976: dup2           
        //   977: dup2           
        //   978: dup2           
        //   979: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   982: aload_0        
        //   983: dup_x1         
        //   984: dup            
        //   985: pop2           
        //   986: dup            
        //   987: ldc_w           "DepthTest"
        //   990: ldc_w           "Hide hidden sides"
        //   993: iconst_0       
        //   994: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   997: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //  1000: putfield        org/rusherhack/FastBreak.hideHiddenSides:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1003: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //  1006: aload_0        
        //  1007: dup_x2         
        //  1008: dup            
        //  1009: pop2           
        //  1010: dup            
        //  1011: ldc_w           "Debug"
        //  1014: iconst_0       
        //  1015: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1018: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //  1021: iconst_1       
        //  1022: dup            
        //  1023: dup            
        //  1024: pop2           
        //  1025: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setHidden:(Z)Lorg/rusherhack/core/setting/BooleanSetting;
        //  1028: putfield        org/rusherhack/FastBreak.debug:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1031: new             Ljava/util/LinkedList;
        //  1034: aload_0        
        //  1035: dup            
        //  1036: pop2           
        //  1037: dup            
        //  1038: invokespecial   java/util/LinkedList.<init>:()V
        //  1041: putfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //  1044: new             Ljava/util/HashMap;
        //  1047: aload_0        
        //  1048: dup            
        //  1049: pop2           
        //  1050: dup            
        //  1051: invokespecial   java/util/HashMap.<init>:()V
        //  1054: putfield        org/rusherhack/FastBreak.f5621:Ljava/util/Map;
        //  1057: new             Lorg/rusherhack/Class200;
        //  1060: aload_0        
        //  1061: dup            
        //  1062: pop2           
        //  1063: dup            
        //  1064: invokestatic    org/rusherhack/client/api/RusherHackAPI.getConfigPath:()Ljava/nio/file/Path;
        //  1067: ldc_w           "fastbreak"
        //  1070: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //  1075: ldc_w           "whitelist.json"
        //  1078: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //  1083: invokeinterface java/nio/file/Path.toFile:()Ljava/io/File;
        //  1088: invokespecial   org/rusherhack/Class200.<init>:(Ljava/io/File;)V
        //  1091: putfield        org/rusherhack/FastBreak.f5631:Lorg/rusherhack/Class200;
        //  1094: new             Lorg/rusherhack/Class200;
        //  1097: aload_0        
        //  1098: dup            
        //  1099: pop2           
        //  1100: dup            
        //  1101: invokestatic    org/rusherhack/client/api/RusherHackAPI.getConfigPath:()Ljava/nio/file/Path;
        //  1104: ldc_w           "fastbreak"
        //  1107: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //  1112: ldc_w           "blacklist.json"
        //  1115: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //  1120: invokeinterface java/nio/file/Path.toFile:()Ljava/io/File;
        //  1125: invokespecial   org/rusherhack/Class200.<init>:(Ljava/io/File;)V
        //  1128: putfield        org/rusherhack/FastBreak.f5622:Lorg/rusherhack/Class200;
        //  1131: new             Lorg/rusherhack/core/utils/Timer;
        //  1134: aload_0        
        //  1135: dup            
        //  1136: pop2           
        //  1137: dup            
        //  1138: invokespecial   org/rusherhack/core/utils/Timer.<init>:()V
        //  1141: putfield        org/rusherhack/FastBreak.f5639:Lorg/rusherhack/core/utils/Timer;
        //  1144: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //  1147: putfield        org/rusherhack/FastBreak.f5644:Lnet.minecraft.util.math.BlockPos;
        //  1150: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //  1153: putfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //  1156: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //  1159: putfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //  1162: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //  1165: putfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //  1168: putstatic       org/rusherhack/FastBreak.f5664:Lorg/rusherhack/FastBreak;
        //  1171: getfield        org/rusherhack/FastBreak.f5655:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1174: iconst_1       
        //  1175: dup            
        //  1176: dup            
        //  1177: pop2           
        //  1178: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setHidden:(Z)Lorg/rusherhack/core/setting/BooleanSetting;
        //  1181: pop            
        //  1182: getfield        org/rusherhack/FastBreak.queueUpBlocksToBeMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1185: iconst_3       
        //  1186: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1189: dup            
        //  1190: iconst_0       
        //  1191: aload_0        
        //  1192: getfield        org/rusherhack/FastBreak.priority:Lorg/rusherhack/core/setting/EnumSetting;
        //  1195: aastore        
        //  1196: dup            
        //  1197: iconst_1       
        //  1198: dup            
        //  1199: dup            
        //  1200: pop2           
        //  1201: aload_0        
        //  1202: getfield        org/rusherhack/FastBreak.cancelTheCurrentMiningProgress:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1205: aastore        
        //  1206: dup            
        //  1207: iconst_2       
        //  1208: aload_0        
        //  1209: getfield        org/rusherhack/FastBreak.breaksMultipleBlocksAtTheSameTime:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1212: aastore        
        //  1213: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1216: aload_0        
        //  1217: getfield        org/rusherhack/FastBreak.automaticallySwitchesToBestTool:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1220: iconst_4       
        //  1221: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1224: dup            
        //  1225: iconst_0       
        //  1226: aload_0        
        //  1227: getfield        org/rusherhack/FastBreak.switchServerSideOnly:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1230: aastore        
        //  1231: dup            
        //  1232: iconst_1       
        //  1233: dup            
        //  1234: dup            
        //  1235: pop2           
        //  1236: aload_0        
        //  1237: getfield        org/rusherhack/FastBreak.returnsToThePreviousItemYouWereHolding:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1240: aastore        
        //  1241: dup            
        //  1242: iconst_2       
        //  1243: aload_0        
        //  1244: getfield        org/rusherhack/FastBreak.pullToolsOutOfInventory:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1247: aastore        
        //  1248: dup            
        //  1249: iconst_3       
        //  1250: aload_0        
        //  1251: getfield        org/rusherhack/FastBreak.updatedncpAdjustments:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1254: aastore        
        //  1255: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1258: aload_0        
        //  1259: getfield        org/rusherhack/FastBreak.switchServerSideOnly:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1262: iconst_1       
        //  1263: dup            
        //  1264: dup            
        //  1265: pop2           
        //  1266: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1269: dup            
        //  1270: iconst_0       
        //  1271: aload_0        
        //  1272: getfield        org/rusherhack/FastBreak.multitask:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1275: aastore        
        //  1276: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1279: aload_0        
        //  1280: getfield        org/rusherhack/FastBreak.render:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1283: sipush          5335
        //  1286: ldc2_w          3527071600135586420
        //  1289: lload_1        
        //  1290: lxor           
        //  1291: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1296: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1299: dup            
        //  1300: iconst_0       
        //  1301: aload_0        
        //  1302: getfield        org/rusherhack/FastBreak.f5646:Lorg/rusherhack/core/setting/EnumSetting;
        //  1305: aastore        
        //  1306: dup            
        //  1307: iconst_1       
        //  1308: dup            
        //  1309: dup            
        //  1310: pop2           
        //  1311: aload_0        
        //  1312: getfield        org/rusherhack/FastBreak.startcolor:Lorg/rusherhack/client/api/setting/ColorSetting;
        //  1315: aastore        
        //  1316: dup            
        //  1317: iconst_2       
        //  1318: aload_0        
        //  1319: getfield        org/rusherhack/FastBreak.endcolor:Lorg/rusherhack/client/api/setting/ColorSetting;
        //  1322: aastore        
        //  1323: dup            
        //  1324: iconst_3       
        //  1325: aload_0        
        //  1326: getfield        org/rusherhack/FastBreak.fillTheBox:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1329: aastore        
        //  1330: dup            
        //  1331: iconst_4       
        //  1332: aload_0        
        //  1333: getfield        org/rusherhack/FastBreak.outlineTheBox:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1336: aastore        
        //  1337: dup            
        //  1338: iconst_5       
        //  1339: aload_0        
        //  1340: getfield        org/rusherhack/FastBreak.hideHiddenSides:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1343: aastore        
        //  1344: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1347: aload_0        
        //  1348: getfield        org/rusherhack/FastBreak.outlineTheBox:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1351: iconst_2       
        //  1352: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1355: dup            
        //  1356: iconst_0       
        //  1357: aload_0        
        //  1358: getfield        org/rusherhack/FastBreak.widthOfOutline:Lorg/rusherhack/core/setting/NumberSetting;
        //  1361: aastore        
        //  1362: dup            
        //  1363: iconst_1       
        //  1364: dup            
        //  1365: dup            
        //  1366: pop2           
        //  1367: aload_0        
        //  1368: getfield        org/rusherhack/FastBreak.staticSetting:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1371: aastore        
        //  1372: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1375: aload_0        
        //  1376: sipush          28512
        //  1379: ldc2_w          5365635404645186003
        //  1382: lload_1        
        //  1383: lxor           
        //  1384: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1389: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1392: dup            
        //  1393: iconst_0       
        //  1394: aload_0        
        //  1395: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //  1398: aastore        
        //  1399: dup            
        //  1400: iconst_1       
        //  1401: dup            
        //  1402: dup            
        //  1403: pop2           
        //  1404: aload_0        
        //  1405: getfield        org/rusherhack/FastBreak.speed:Lorg/rusherhack/core/setting/NumberSetting;
        //  1408: aastore        
        //  1409: dup            
        //  1410: iconst_2       
        //  1411: aload_0        
        //  1412: getfield        org/rusherhack/FastBreak.ticksBetweenDestroyingBlocks:Lorg/rusherhack/core/setting/NumberSetting;
        //  1415: aastore        
        //  1416: dup            
        //  1417: iconst_3       
        //  1418: aload_0        
        //  1419: getfield        org/rusherhack/FastBreak.f5655:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1422: aastore        
        //  1423: dup            
        //  1424: iconst_4       
        //  1425: aload_0        
        //  1426: getfield        org/rusherhack/FastBreak.syncsMiningToTheServerTps:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1429: aastore        
        //  1430: dup            
        //  1431: iconst_5       
        //  1432: aload_0        
        //  1433: getfield        org/rusherhack/FastBreak.grimBypass:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1436: aastore        
        //  1437: dup            
        //  1438: sipush          20609
        //  1441: ldc2_w          1310125870295811626
        //  1444: lload_1        
        //  1445: lxor           
        //  1446: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1451: aload_0        
        //  1452: getfield        org/rusherhack/FastBreak.preventMiningThroughWalls:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1455: aastore        
        //  1456: dup            
        //  1457: sipush          13187
        //  1460: ldc2_w          3749165815102727458
        //  1463: lload_1        
        //  1464: lxor           
        //  1465: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1470: aload_0        
        //  1471: getfield        org/rusherhack/FastBreak.rotatesToTheBlockYouAreCurrentlyMining:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1474: aastore        
        //  1475: dup            
        //  1476: sipush          3722
        //  1479: ldc2_w          7149377564524042285
        //  1482: lload_1        
        //  1483: lxor           
        //  1484: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1489: aload_0        
        //  1490: getfield        org/rusherhack/FastBreak.automaticallySwitchesToBestTool:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1493: aastore        
        //  1494: dup            
        //  1495: sipush          32332
        //  1498: ldc2_w          4625611607577536766
        //  1501: lload_1        
        //  1502: lxor           
        //  1503: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1508: aload_0        
        //  1509: getfield        org/rusherhack/FastBreak.instantlyBreakTheLastBlockYouMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1512: aastore        
        //  1513: dup            
        //  1514: sipush          3375
        //  1517: ldc2_w          3741006485298338689
        //  1520: lload_1        
        //  1521: lxor           
        //  1522: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1527: aload_0        
        //  1528: getfield        org/rusherhack/FastBreak.automaticallyRemineTheLastBlockYouMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1531: aastore        
        //  1532: dup            
        //  1533: sipush          9391
        //  1536: ldc2_w          8362431054820635147
        //  1539: lload_1        
        //  1540: lxor           
        //  1541: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1546: aload_0        
        //  1547: getfield        org/rusherhack/FastBreak.queueUpBlocksToBeMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1550: aastore        
        //  1551: dup            
        //  1552: sipush          18967
        //  1555: ldc2_w          743062767104171191
        //  1558: lload_1        
        //  1559: lxor           
        //  1560: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1565: aload_0        
        //  1566: getfield        org/rusherhack/FastBreak.pausewhileeating:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1569: aastore        
        //  1570: dup            
        //  1571: sipush          30117
        //  1574: ldc2_w          8503101327121031951
        //  1577: lload_1        
        //  1578: lxor           
        //  1579: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1584: aload_0        
        //  1585: getfield        org/rusherhack/FastBreak.blocks:Lorg/rusherhack/core/setting/EnumSetting;
        //  1588: aastore        
        //  1589: dup            
        //  1590: sipush          23112
        //  1593: ldc2_w          1761805702684478713
        //  1596: lload_1        
        //  1597: lxor           
        //  1598: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1603: aload_0        
        //  1604: getfield        org/rusherhack/FastBreak.bindToAbortBreaking:Lorg/rusherhack/client/api/setting/BindSetting;
        //  1607: aastore        
        //  1608: dup            
        //  1609: sipush          25418
        //  1612: ldc2_w          3994479311815390700
        //  1615: lload_1        
        //  1616: lxor           
        //  1617: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1622: aload_0        
        //  1623: getfield        org/rusherhack/FastBreak.render:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1626: aastore        
        //  1627: dup            
        //  1628: sipush          23089
        //  1631: ldc2_w          2821283600481422492
        //  1634: lload_1        
        //  1635: lxor           
        //  1636: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //  1641: aload_0        
        //  1642: getfield        org/rusherhack/FastBreak.debug:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1645: aastore        
        //  1646: invokevirtual   org/rusherhack/client/api/feature/module/Module.registerSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1649: getstatic       org/rusherhack/Class170.f3364:Lorg/rusherhack/Class170;
        //  1652: invokevirtual   org/rusherhack/Class170.m7112:()Lorg/rusherhack/Class221;
        //  1655: aload_0        
        //  1656: dup            
        //  1657: getfield        org/rusherhack/FastBreak.f5622:Lorg/rusherhack/Class200;
        //  1660: swap           
        //  1661: getfield        org/rusherhack/FastBreak.f5622:Lorg/rusherhack/Class200;
        //  1664: invokevirtual   org/rusherhack/Class221.m8473:(Lorg/rusherhack/core/serialize/ISerializable;Lorg/rusherhack/client/api/config/Configuration;)V
        //  1667: getstatic       org/rusherhack/Class170.f3364:Lorg/rusherhack/Class170;
        //  1670: invokevirtual   org/rusherhack/Class170.m7112:()Lorg/rusherhack/Class221;
        //  1673: aload_0        
        //  1674: dup            
        //  1675: getfield        org/rusherhack/FastBreak.f5631:Lorg/rusherhack/Class200;
        //  1678: swap           
        //  1679: getfield        org/rusherhack/FastBreak.f5631:Lorg/rusherhack/Class200;
        //  1682: invokevirtual   org/rusherhack/Class221.m8473:(Lorg/rusherhack/core/serialize/ISerializable;Lorg/rusherhack/client/api/config/Configuration;)V
        //  1685: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041_12:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void m11352(final BlockPos blockPos, final Direction direction, final int n) {
        final long n2 = FastBreak.f5666 ^ 0x17FDB221C210L;
        ((ClientCommonNetworkHandler)Globals.mc.player.networkHandler).sendPacket((Packet)new PlayerActionC2SPacket(PlayerActionC2SPacket.Action.START_DESTROY_BLOCK, blockPos, direction, n));
    }
    
    private BlockPos m11354() {
        return null;
    }
    
    @Subscribe
    private void m11355(final Class586 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          95706244273158
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          5
        //    16: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    19: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    22: ifnull          77
        //    25: aload_1        
        //    26: iload           4
        //    28: ifne            59
        //    31: goto            38
        //    34: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    37: athrow         
        //    38: invokevirtual   org/rusherhack/Obf515.m15855:()Lnet.minecraft.util.math.BlockPos;
        //    41: ifnull          77
        //    44: goto            51
        //    47: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    50: athrow         
        //    51: aload_1        
        //    52: goto            59
        //    55: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    58: athrow         
        //    59: iload           4
        //    61: ifne            83
        //    64: invokevirtual   org/rusherhack/Obf515.m15854:()Lnet.minecraft.util.math.Direction;
        //    67: ifnonnull       82
        //    70: goto            77
        //    73: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    76: athrow         
        //    77: return         
        //    78: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    81: athrow         
        //    82: aload_1        
        //    83: invokevirtual   org/rusherhack/Obf515.m15855:()Lnet.minecraft.util.math.BlockPos;
        //    86: astore_0       
        //    87: aload           5
        //    89: iload           4
        //    91: ifne            259
        //    94: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //    97: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   100: getstatic       org/rusherhack/Obf123.f2572:Lorg/rusherhack/Obf123;
        //   103: if_acmpne       257
        //   106: goto            113
        //   109: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   112: athrow         
        //   113: aload           5
        //   115: iload           4
        //   117: ifne            259
        //   120: goto            127
        //   123: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   126: athrow         
        //   127: getfield        org/rusherhack/FastBreak.f5627:Z
        //   130: ifeq            257
        //   133: goto            140
        //   136: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   139: athrow         
        //   140: aload           5
        //   142: iload           4
        //   144: ifne            259
        //   147: goto            154
        //   150: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   153: athrow         
        //   154: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   157: aload_0        
        //   158: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   161: ifeq            257
        //   164: goto            171
        //   167: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   170: athrow         
        //   171: aload           5
        //   173: iload           4
        //   175: ifne            259
        //   178: goto            185
        //   181: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   184: athrow         
        //   185: getfield        org/rusherhack/FastBreak.f5653:F
        //   188: fconst_1       
        //   189: aload           5
        //   191: getfield        org/rusherhack/FastBreak.speed:Lorg/rusherhack/core/setting/NumberSetting;
        //   194: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   197: checkcast       Ljava/lang/Float;
        //   200: invokevirtual   java/lang/Float.floatValue:()F
        //   203: fsub           
        //   204: fcmpg          
        //   205: ifge            257
        //   208: goto            215
        //   211: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   214: athrow         
        //   215: aload           5
        //   217: iload           4
        //   219: ifne            259
        //   222: goto            229
        //   225: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   228: athrow         
        //   229: getfield        org/rusherhack/FastBreak.f5653:F
        //   232: fconst_0       
        //   233: fcmpl          
        //   234: ifle            257
        //   237: goto            244
        //   240: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   243: athrow         
        //   244: aload_1        
        //   245: iconst_1       
        //   246: dup            
        //   247: dup            
        //   248: pop2           
        //   249: invokevirtual   org/rusherhack/core/event/type/EventCancellable.setCancelled:(Z)V
        //   252: return         
        //   253: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   256: athrow         
        //   257: aload           5
        //   259: ldc_w           "i)U`\u00043\r`\u00043\r`\u00043"
        //   262: aload           5
        //   264: dup            
        //   265: invokestatic    java/lang/System.currentTimeMillis:()J
        //   268: putfield        org/rusherhack/FastBreak.f5624:J
        //   271: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   274: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   277: getfield        net.minecraft.entity.Entity.age:I
        //   280: putfield        org/rusherhack/FastBreak.f5660:I
        //   283: invokestatic    org/rusherhack/core/utils/Pair.$:(Ljava/lang/String;)Ljava/lang/String;
        //   286: iconst_3       
        //   287: anewarray       Ljava/lang/Object;
        //   290: dup            
        //   291: iconst_0       
        //   292: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   295: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   298: getfield        net.minecraft.entity.Entity.age:I
        //   301: aload           5
        //   303: getfield        org/rusherhack/FastBreak.f5660:I
        //   306: isub           
        //   307: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   310: aastore        
        //   311: dup            
        //   312: iconst_1       
        //   313: dup            
        //   314: dup            
        //   315: pop2           
        //   316: invokestatic    java/lang/System.currentTimeMillis:()J
        //   319: aload           5
        //   321: getfield        org/rusherhack/FastBreak.f5624:J
        //   324: lsub           
        //   325: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   328: aastore        
        //   329: dup            
        //   330: iconst_2       
        //   331: aload           5
        //   333: iload           4
        //   335: ifne            380
        //   338: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //   341: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   344: getstatic       org/rusherhack/Obf123.f2571:Lorg/rusherhack/Obf123;
        //   347: if_acmpne       378
        //   350: goto            357
        //   353: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   356: athrow         
        //   357: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   360: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   363: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   366: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.getDestroyProgress:()F
        //   371: goto            383
        //   374: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   377: athrow         
        //   378: aload           5
        //   380: getfield        org/rusherhack/FastBreak.f5653:F
        //   383: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   386: aastore        
        //   387: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   390: invokevirtual   org/rusherhack/FastBreak.m11371:(Ljava/lang/String;)V
        //   393: aload           5
        //   395: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //   398: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   401: getstatic       org/rusherhack/Obf123.f2572:Lorg/rusherhack/Obf123;
        //   404: if_acmpeq       412
        //   407: return         
        //   408: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   411: athrow         
        //   412: aload_0        
        //   413: invokevirtual   net.minecraft.util.math.Vec3i.getY:()I
        //   416: iload           4
        //   418: ifne            456
        //   421: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   424: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   427: invokeinterface net.minecraft.world.HeightLimitView.getTopY:()I
        //   432: if_icmplt       447
        //   435: goto            442
        //   438: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   441: athrow         
        //   442: return         
        //   443: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   446: athrow         
        //   447: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   450: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   453: invokevirtual   net.minecraft.client.network.AbstractClientPlayerEntity.isCreative:()Z
        //   456: iload           4
        //   458: ifne            515
        //   461: ifne            518
        //   464: goto            471
        //   467: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   470: athrow         
        //   471: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   474: iload           4
        //   476: ifne            522
        //   479: goto            486
        //   482: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   485: athrow         
        //   486: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   489: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   492: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   495: aload_0        
        //   496: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   499: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   502: invokevirtual   net.minecraft.client.network.ClientPlayerInteractionManager.getCurrentGameMode:()Lnet.minecraft.world.GameMode;
        //   505: invokevirtual   net.minecraft.entity.player.PlayerEntity.isBlockBreakingRestricted:(Lnet.minecraft.world.World;Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.world.GameMode;)Z
        //   508: goto            515
        //   511: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   514: athrow         
        //   515: ifeq            519
        //   518: return         
        //   519: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   522: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   525: aload_0        
        //   526: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //   529: astore          6
        //   531: aload           5
        //   533: getfield        org/rusherhack/FastBreak.blocks:Lorg/rusherhack/core/setting/EnumSetting;
        //   536: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   539: checkcast       Lorg/rusherhack/Obf115;
        //   542: invokevirtual   java/lang/Enum.ordinal:()I
        //   545: lookupswitch {
        //                1: 572
        //                2: 615
        //          default: 644
        //        }
        //   572: aload           5
        //   574: goto            581
        //   577: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   580: athrow         
        //   581: getfield        org/rusherhack/FastBreak.f5622:Lorg/rusherhack/Class200;
        //   584: aload           6
        //   586: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //   589: invokevirtual   org/rusherhack/Class200.m7837:(Lnet.minecraft.block.Block;)Z
        //   592: iload           4
        //   594: ifne            663
        //   597: goto            604
        //   600: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   603: athrow         
        //   604: ifeq            647
        //   607: goto            614
        //   610: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   613: athrow         
        //   614: return         
        //   615: aload           5
        //   617: getfield        org/rusherhack/FastBreak.f5631:Lorg/rusherhack/Class200;
        //   620: aload           6
        //   622: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //   625: invokevirtual   org/rusherhack/Class200.m7837:(Lnet.minecraft.block.Block;)Z
        //   628: iload           4
        //   630: ifne            663
        //   633: ifne            647
        //   636: goto            643
        //   639: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   642: athrow         
        //   643: return         
        //   644: goto            647
        //   647: aload           6
        //   649: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   652: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   655: aload_0        
        //   656: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getHardness:(Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)F
        //   659: ldc_w           -1.0
        //   662: fcmpl          
        //   663: iload           4
        //   665: ifne            684
        //   668: ifne            679
        //   671: goto            678
        //   674: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   677: athrow         
        //   678: return         
        //   679: aload           5
        //   681: getfield        org/rusherhack/FastBreak.f5627:Z
        //   684: iload           4
        //   686: ifne            715
        //   689: ifeq            964
        //   692: goto            699
        //   695: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   698: athrow         
        //   699: aload           5
        //   701: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   704: aload_0        
        //   705: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   708: goto            715
        //   711: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   714: athrow         
        //   715: iload           4
        //   717: ifne            751
        //   720: ifne            964
        //   723: goto            730
        //   726: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   729: athrow         
        //   730: aload           5
        //   732: getfield        org/rusherhack/FastBreak.queueUpBlocksToBeMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //   735: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   738: checkcast       Ljava/lang/Boolean;
        //   741: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   744: goto            751
        //   747: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   750: athrow         
        //   751: iload           4
        //   753: ifne            799
        //   756: ifeq            948
        //   759: goto            766
        //   762: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   765: athrow         
        //   766: aload           5
        //   768: iload           4
        //   770: ifne            917
        //   773: goto            780
        //   776: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   779: athrow         
        //   780: getfield        org/rusherhack/FastBreak.cancelTheCurrentMiningProgress:Lorg/rusherhack/core/setting/BooleanSetting;
        //   783: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   786: checkcast       Ljava/lang/Boolean;
        //   789: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   792: goto            799
        //   795: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   798: athrow         
        //   799: ifne            876
        //   802: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   805: aload           5
        //   807: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   810: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //   813: iload           4
        //   815: ifne            929
        //   818: goto            825
        //   821: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   824: athrow         
        //   825: ifne            920
        //   828: goto            835
        //   831: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   834: athrow         
        //   835: aload           5
        //   837: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   840: invokestatic    org/rusherhack/Util177.m7297:(Lnet.minecraft.util.math.Vec3i;)F
        //   843: f2d            
        //   844: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   847: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   850: invokevirtual   net.minecraft.entity.player.PlayerEntity.getBlockInteractionRange:()D
        //   853: dcmpl          
        //   854: iload           4
        //   856: ifne            929
        //   859: goto            866
        //   862: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   865: athrow         
        //   866: ifle            920
        //   869: goto            876
        //   872: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   875: athrow         
        //   876: aload           5
        //   878: dup            
        //   879: dup_x1         
        //   880: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   883: swap           
        //   884: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   887: invokevirtual   java/util/LinkedList.remove:(Ljava/lang/Object;)Z
        //   890: aload           5
        //   892: dup            
        //   893: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   896: swap           
        //   897: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   900: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   903: aload           5
        //   905: iconst_m1      
        //   906: invokevirtual   org/rusherhack/FastBreak.m11367:(I)V
        //   909: pop2           
        //   910: goto            917
        //   913: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   916: athrow         
        //   917: goto            950
        //   920: aload           5
        //   922: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   925: aload_0        
        //   926: invokevirtual   java/util/LinkedList.remove:(Ljava/lang/Object;)Z
        //   929: aload           5
        //   931: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   934: aload_0        
        //   935: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   938: aload_1        
        //   939: iconst_1       
        //   940: dup            
        //   941: dup            
        //   942: pop2           
        //   943: invokevirtual   org/rusherhack/core/event/type/EventCancellable.setCancelled:(Z)V
        //   946: pop2           
        //   947: return         
        //   948: aload           5
        //   950: getfield        org/rusherhack/FastBreak.f5621:Ljava/util/Map;
        //   953: aload           5
        //   955: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   958: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   963: pop            
        //   964: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   967: getfield        net.minecraft.client.MinecraftClient.crosshairTarget:Lnet.minecraft.util.hit.HitResult;
        //   970: dup            
        //   971: astore          9
        //   973: iload           4
        //   975: ifne            1000
        //   978: instanceof      Lnet.minecraft.util.hit.BlockHitResult;
        //   981: ifeq            1037
        //   984: goto            991
        //   987: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   990: athrow         
        //   991: aload           9
        //   993: goto            1000
        //   996: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   999: athrow         
        //  1000: checkcast       Lnet.minecraft.util.hit.BlockHitResult;
        //  1003: dup            
        //  1004: astore          8
        //  1006: iload           4
        //  1008: ifne            1058
        //  1011: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //  1014: aload_0        
        //  1015: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1018: ifeq            1037
        //  1021: goto            1028
        //  1024: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1027: athrow         
        //  1028: aload           8
        //  1030: astore          7
        //  1032: aload           5
        //  1034: goto            1062
        //  1037: new             Lnet.minecraft.util.hit.BlockHitResult;
        //  1040: dup            
        //  1041: aload_0        
        //  1042: aload_1        
        //  1043: invokevirtual   org/rusherhack/Obf515.m15854:()Lnet.minecraft.util.math.Direction;
        //  1046: invokestatic    org/rusherhack/Class220.m8439:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.math.Direction;)Lnet.minecraft.util.math.Vec3d;
        //  1049: aload_1        
        //  1050: invokevirtual   org/rusherhack/Obf515.m15854:()Lnet.minecraft.util.math.Direction;
        //  1053: aload_0        
        //  1054: iconst_0       
        //  1055: invokespecial   net.minecraft.util.hit.BlockHitResult.<init>:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Direction;Lnet.minecraft.util.math.BlockPos;Z)V
        //  1058: astore          7
        //  1060: aload           5
        //  1062: aload           7
        //  1064: aload           6
        //  1066: invokevirtual   org/rusherhack/FastBreak.m11374:(Lnet.minecraft.util.hit.BlockHitResult;Lnet.minecraft.block.BlockState;)Z
        //  1069: ifeq            1087
        //  1072: aload_1        
        //  1073: iconst_1       
        //  1074: dup            
        //  1075: dup            
        //  1076: pop2           
        //  1077: invokevirtual   org/rusherhack/core/event/type/EventCancellable.setCancelled:(Z)V
        //  1080: goto            1087
        //  1083: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1086: athrow         
        //  1087: return         
        //    StackMapTable: 00 6F FF 00 22 00 05 07 00 02 07 04 CA 04 01 07 00 02 00 01 07 00 6A 43 07 04 CA 48 07 00 6A 03 43 07 00 6A 43 07 04 CA 4D 07 00 6A 03 40 07 00 6A 03 40 07 04 CA FF 00 19 00 05 07 00 C9 07 04 CA 04 01 07 00 02 00 01 07 00 6A 03 49 07 00 6A 43 07 00 02 48 07 00 6A 03 49 07 00 6A 43 07 00 02 4C 07 00 6A 03 49 07 00 6A 43 07 00 02 59 07 00 6A 03 49 07 00 6A 43 07 00 02 4A 07 00 6A 03 48 07 00 6A 03 41 07 00 02 F7 00 5D 07 00 6A FF 00 03 00 05 07 00 C9 07 04 CA 04 01 07 00 02 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 50 07 00 6A FF 00 03 00 05 07 00 C9 07 04 CA 04 01 07 00 02 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 FF 00 01 00 05 07 00 C9 07 04 CA 04 01 07 00 02 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 07 00 02 FF 00 02 00 05 07 00 C9 07 04 CA 04 01 07 00 02 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 02 58 07 00 6A 03 59 07 00 6A 03 40 07 00 6A 03 48 01 4A 07 00 6A 03 4A 07 00 6A 43 07 00 93 58 07 00 6A 43 01 02 00 42 07 00 93 FC 00 31 07 02 10 44 07 00 6A 43 07 00 02 52 07 00 6A 43 01 45 07 00 6A 03 00 57 07 00 6A 03 00 02 4F 01 4A 07 00 6A 03 00 44 01 4A 07 00 6A 03 4B 07 00 6A 43 01 4A 07 00 6A 03 50 07 00 6A 43 01 4A 07 00 6A 03 49 07 00 6A 43 07 00 02 4E 07 00 6A 43 01 55 07 00 6A 43 01 45 07 00 6A 03 5A 07 00 6A 43 01 45 07 00 6A 03 64 07 00 6A 43 07 00 02 02 48 01 12 41 07 00 02 0D FF 00 16 00 09 07 00 C9 07 04 CA 04 01 07 00 02 07 02 10 00 00 07 04 CC 00 01 07 00 6A 03 44 07 00 6A 43 07 04 CC FF 00 17 00 09 07 00 C9 07 04 CA 04 01 07 00 02 07 02 10 00 07 02 C3 07 04 CC 00 01 07 00 6A 03 FF 00 08 00 09 07 00 C9 07 04 CA 04 01 07 00 02 07 02 10 00 00 07 04 CC 00 00 54 07 02 C3 FF 00 03 00 09 07 00 C9 07 04 CA 04 01 07 00 02 07 02 10 07 02 C3 00 07 04 CC 00 01 07 00 02 54 07 00 6A 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  16     31     34     38     Ljava/lang/MatchException;
        //  25     44     47     51     Ljava/lang/MatchException;
        //  38     52     55     59     Ljava/lang/MatchException;
        //  59     70     73     77     Ljava/lang/MatchException;
        //  64     78     78     82     Ljava/lang/MatchException;
        //  87     106    109    113    Ljava/lang/MatchException;
        //  94     120    123    127    Ljava/lang/MatchException;
        //  113    133    136    140    Ljava/lang/MatchException;
        //  127    147    150    154    Ljava/lang/MatchException;
        //  140    164    167    171    Ljava/lang/MatchException;
        //  154    178    181    185    Ljava/lang/MatchException;
        //  171    208    211    215    Ljava/lang/MatchException;
        //  185    222    225    229    Ljava/lang/MatchException;
        //  215    237    240    244    Ljava/lang/MatchException;
        //  229    253    253    257    Ljava/lang/MatchException;
        //  259    350    353    357    Ljava/lang/MatchException;
        //  338    374    374    378    Ljava/lang/MatchException;
        //  383    408    408    412    Ljava/lang/MatchException;
        //  412    435    438    442    Ljava/lang/MatchException;
        //  421    443    443    447    Ljava/lang/MatchException;
        //  456    464    467    471    Ljava/lang/MatchException;
        //  461    479    482    486    Ljava/lang/MatchException;
        //  471    508    511    515    Ljava/lang/MatchException;
        //  531    574    577    581    Ljava/lang/MatchException;
        //  581    597    600    604    Ljava/lang/MatchException;
        //  581    607    610    614    Ljava/lang/MatchException;
        //  615    636    639    643    Ljava/lang/MatchException;
        //  663    671    674    678    Ljava/lang/MatchException;
        //  684    692    695    699    Ljava/lang/MatchException;
        //  689    708    711    715    Ljava/lang/MatchException;
        //  715    723    726    730    Ljava/lang/MatchException;
        //  720    744    747    751    Ljava/lang/MatchException;
        //  751    759    762    766    Ljava/lang/MatchException;
        //  756    773    776    780    Ljava/lang/MatchException;
        //  766    792    795    799    Ljava/lang/MatchException;
        //  799    818    821    825    Ljava/lang/MatchException;
        //  802    828    831    835    Ljava/lang/MatchException;
        //  825    859    862    866    Ljava/lang/MatchException;
        //  835    869    872    876    Ljava/lang/MatchException;
        //  866    910    913    917    Ljava/lang/MatchException;
        //  973    984    987    991    Ljava/lang/MatchException;
        //  978    993    996    1000   Ljava/lang/MatchException;
        //  1006   1021   1024   1028   Ljava/lang/MatchException;
        //  1062   1080   1083   1087   Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Subscribe
    private void m11357(final Obf090 obf090) {
        
    }
    
    private boolean m11360(final BlockState p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          50911760030416
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9155:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: aload_1        
        //    15: astore_0       
        //    16: astore_1       
        //    17: aload_1        
        //    18: getfield        org/rusherhack/FastBreak.automaticallySwitchesToBestTool:Lorg/rusherhack/core/setting/BooleanSetting;
        //    21: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    24: checkcast       Ljava/lang/Boolean;
        //    27: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    30: iload           4
        //    32: ifeq            66
        //    35: ifne            61
        //    38: goto            45
        //    41: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    44: athrow         
        //    45: aload_1        
        //    46: dup            
        //    47: iconst_m1      
        //    48: dup_x1         
        //    49: putfield        org/rusherhack/FastBreak.f5617:I
        //    52: putfield        org/rusherhack/FastBreak.f5625:I
        //    55: iconst_0       
        //    56: ireturn        
        //    57: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    60: athrow         
        //    61: aload_1        
        //    62: aload_0        
        //    63: invokevirtual   org/rusherhack/FastBreak.m11350:(Lnet.minecraft.block.BlockState;)I
        //    66: dup            
        //    67: istore_0       
        //    68: iconst_m1      
        //    69: iload           4
        //    71: ifeq            113
        //    74: if_icmpne       100
        //    77: goto            84
        //    80: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    83: athrow         
        //    84: aload_1        
        //    85: dup            
        //    86: iconst_m1      
        //    87: dup_x1         
        //    88: putfield        org/rusherhack/FastBreak.f5617:I
        //    91: putfield        org/rusherhack/FastBreak.f5625:I
        //    94: iconst_0       
        //    95: ireturn        
        //    96: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    99: athrow         
        //   100: iload_0        
        //   101: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   104: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   107: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //   110: getfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //   113: iload           4
        //   115: ifeq            151
        //   118: if_icmpne       134
        //   121: goto            128
        //   124: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   127: athrow         
        //   128: iconst_0       
        //   129: ireturn        
        //   130: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   133: athrow         
        //   134: aload_1        
        //   135: iload           4
        //   137: ifeq            190
        //   140: getfield        org/rusherhack/FastBreak.f5625:I
        //   143: iconst_m1      
        //   144: goto            151
        //   147: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   150: athrow         
        //   151: if_icmpeq       189
        //   154: aload_1        
        //   155: getfield        org/rusherhack/FastBreak.switchServerSideOnly:Lorg/rusherhack/core/setting/BooleanSetting;
        //   158: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   161: checkcast       Ljava/lang/Boolean;
        //   164: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   167: iload           4
        //   169: ifeq            214
        //   172: goto            179
        //   175: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   178: athrow         
        //   179: ifeq            205
        //   182: goto            189
        //   185: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   188: athrow         
        //   189: aload_1        
        //   190: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   193: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   196: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //   199: getfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //   202: putfield        org/rusherhack/FastBreak.f5625:I
        //   205: aload_1        
        //   206: dup            
        //   207: iload_0        
        //   208: putfield        org/rusherhack/FastBreak.f5617:I
        //   211: getfield        org/rusherhack/FastBreak.f5617:I
        //   214: sipush          18590
        //   217: ldc2_w          8511084045973902130
        //   220: lload_2        
        //   221: lxor           
        //   222: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //   227: iload           4
        //   229: ifeq            335
        //   232: if_icmplt       312
        //   235: goto            242
        //   238: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   241: athrow         
        //   242: aload_1        
        //   243: getfield        org/rusherhack/FastBreak.switchServerSideOnly:Lorg/rusherhack/core/setting/BooleanSetting;
        //   246: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   249: checkcast       Ljava/lang/Boolean;
        //   252: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   255: iload           4
        //   257: ifeq            297
        //   260: goto            267
        //   263: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   266: athrow         
        //   267: ifeq            343
        //   270: goto            277
        //   273: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   276: athrow         
        //   277: aload_1        
        //   278: getfield        org/rusherhack/FastBreak.updatedncpAdjustments:Lorg/rusherhack/core/setting/BooleanSetting;
        //   281: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   284: checkcast       Ljava/lang/Boolean;
        //   287: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   290: goto            297
        //   293: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   296: athrow         
        //   297: iload           4
        //   299: ifeq            323
        //   302: ifeq            343
        //   305: goto            312
        //   308: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   311: athrow         
        //   312: aload_1        
        //   313: getfield        org/rusherhack/FastBreak.f5617:I
        //   316: goto            323
        //   319: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   322: athrow         
        //   323: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   326: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   329: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //   332: getfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //   335: invokestatic    org/rusherhack/client/api/utils/InventoryUtils.swapSlots:(II)V
        //   338: iload           4
        //   340: ifne            380
        //   343: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   346: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   349: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //   352: aload_1        
        //   353: getfield        org/rusherhack/FastBreak.f5617:I
        //   356: sipush          11875
        //   359: ldc2_w          7953328081752962497
        //   362: lload_2        
        //   363: lxor           
        //   364: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //   369: irem           
        //   370: putfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //   373: goto            380
        //   376: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   379: athrow         
        //   380: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   383: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   386: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   389: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.invokeEnsureHasSentCarriedItem:()V
        //   394: iconst_1       
        //   395: dup            
        //   396: dup            
        //   397: pop2           
        //   398: ireturn        
        //    StackMapTable: 00 27 FF 00 29 00 04 07 02 10 07 00 02 04 01 00 01 07 00 6A 03 4B 07 00 6A 03 44 01 FF 00 0D 00 04 01 07 00 02 04 01 00 01 07 00 6A 03 4B 07 00 6A 03 FF 00 0C 00 04 01 07 00 02 04 01 00 02 01 01 4A 07 00 6A 03 41 07 00 6A 03 4C 07 00 6A FF 00 03 00 04 01 07 00 02 04 01 00 02 01 01 57 07 00 6A 43 01 45 07 00 6A 03 40 07 00 02 0E 48 01 57 07 00 6A 03 54 07 00 6A 43 01 45 07 00 6A 03 4F 07 00 6A 43 01 4A 07 00 6A 03 46 07 00 6A 43 01 FF 00 0B 00 04 01 07 00 02 04 01 00 02 01 01 07 60 07 00 6A 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  17     38     41     45     Ljava/lang/MatchException;
        //  35     57     57     61     Ljava/lang/MatchException;
        //  68     77     80     84     Ljava/lang/MatchException;
        //  74     96     96     100    Ljava/lang/MatchException;
        //  113    121    124    128    Ljava/lang/MatchException;
        //  118    130    130    134    Ljava/lang/MatchException;
        //  134    144    147    151    Ljava/lang/MatchException;
        //  151    172    175    179    Ljava/lang/MatchException;
        //  154    182    185    189    Ljava/lang/MatchException;
        //  214    235    238    242    Ljava/lang/MatchException;
        //  232    260    263    267    Ljava/lang/MatchException;
        //  242    270    273    277    Ljava/lang/MatchException;
        //  267    290    293    297    Ljava/lang/MatchException;
        //  297    305    308    312    Ljava/lang/MatchException;
        //  302    316    319    323    Ljava/lang/MatchException;
        //  335    373    376    380    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0242:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean m11361(final BlockPos p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          101820711235723
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: aload_1        
        //    15: astore_0       
        //    16: astore_1       
        //    17: aload_1        
        //    18: invokevirtual   org/rusherhack/client/api/feature/module/ToggleableModule.isToggled:()Z
        //    21: iload           4
        //    23: ifne            76
        //    26: ifeq            68
        //    29: goto            36
        //    32: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    35: athrow         
        //    36: aload_1        
        //    37: iload           4
        //    39: ifne            78
        //    42: goto            49
        //    45: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    48: athrow         
        //    49: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //    52: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    55: getstatic       org/rusherhack/Obf123.f2572:Lorg/rusherhack/Obf123;
        //    58: if_acmpeq       77
        //    61: goto            68
        //    64: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    67: athrow         
        //    68: iconst_0       
        //    69: goto            76
        //    72: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    75: athrow         
        //    76: ireturn        
        //    77: aload_1        
        //    78: getfield        org/rusherhack/FastBreak.f5627:Z
        //    81: iload           4
        //    83: ifne            145
        //    86: ifeq            135
        //    89: goto            96
        //    92: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    95: athrow         
        //    96: aload_1        
        //    97: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   100: aload_0        
        //   101: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   104: iload           4
        //   106: ifne            145
        //   109: goto            116
        //   112: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   115: athrow         
        //   116: ifeq            135
        //   119: goto            126
        //   122: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   125: athrow         
        //   126: iconst_1       
        //   127: dup            
        //   128: dup            
        //   129: pop2           
        //   130: ireturn        
        //   131: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   134: athrow         
        //   135: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   138: aload_1        
        //   139: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   142: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //   145: iload           4
        //   147: ifne            212
        //   150: ifne            199
        //   153: goto            160
        //   156: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   159: athrow         
        //   160: aload_1        
        //   161: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   164: aload_0        
        //   165: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   168: iload           4
        //   170: ifne            212
        //   173: goto            180
        //   176: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   179: athrow         
        //   180: ifeq            199
        //   183: goto            190
        //   186: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   189: athrow         
        //   190: iconst_1       
        //   191: dup            
        //   192: dup            
        //   193: pop2           
        //   194: ireturn        
        //   195: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   198: athrow         
        //   199: aload_1        
        //   200: getfield        org/rusherhack/FastBreak.automaticallyRemineTheLastBlockYouMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //   203: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   206: checkcast       Ljava/lang/Boolean;
        //   209: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   212: iload           4
        //   214: ifne            267
        //   217: ifeq            266
        //   220: goto            227
        //   223: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   226: athrow         
        //   227: aload_1        
        //   228: getfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //   231: aload_0        
        //   232: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   235: iload           4
        //   237: ifne            267
        //   240: goto            247
        //   243: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   246: athrow         
        //   247: ifeq            266
        //   250: goto            257
        //   253: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   256: athrow         
        //   257: iconst_1       
        //   258: dup            
        //   259: dup            
        //   260: pop2           
        //   261: ireturn        
        //   262: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   265: athrow         
        //   266: iconst_0       
        //   267: ireturn        
        //    StackMapTable: 00 25 FF 00 20 00 04 07 00 C9 07 00 02 04 01 00 01 07 00 6A 03 48 07 00 6A 43 07 00 02 4E 07 00 6A 03 43 07 00 6A 43 01 00 40 07 00 02 4D 07 00 6A 03 4F 07 00 6A 43 01 45 07 00 6A 03 44 07 00 6A 03 49 01 4A 07 00 6A 03 4F 07 00 6A 43 01 45 07 00 6A 03 44 07 00 6A 03 4C 01 4A 07 00 6A 03 4F 07 00 6A 43 01 45 07 00 6A 03 44 07 00 6A 03 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  17     29     32     36     Ljava/lang/MatchException;
        //  26     42     45     49     Ljava/lang/MatchException;
        //  36     61     64     68     Ljava/lang/MatchException;
        //  49     69     72     76     Ljava/lang/MatchException;
        //  78     89     92     96     Ljava/lang/MatchException;
        //  86     109    112    116    Ljava/lang/MatchException;
        //  96     119    122    126    Ljava/lang/MatchException;
        //  116    131    131    135    Ljava/lang/MatchException;
        //  145    153    156    160    Ljava/lang/MatchException;
        //  150    173    176    180    Ljava/lang/MatchException;
        //  160    183    186    190    Ljava/lang/MatchException;
        //  180    195    195    199    Ljava/lang/MatchException;
        //  212    220    223    227    Ljava/lang/MatchException;
        //  217    240    243    247    Ljava/lang/MatchException;
        //  227    250    253    257    Ljava/lang/MatchException;
        //  247    262    262    266    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void m11362(final BlockPos blockPos, final Direction direction, final int n) {
        final long n2 = FastBreak.f5666 ^ 0x20A0E1BC48B7L;
        ((ClientCommonNetworkHandler)Globals.mc.player.networkHandler).sendPacket((Packet)new PlayerActionC2SPacket(PlayerActionC2SPacket.Action.STOP_DESTROY_BLOCK, blockPos, direction, n));
    }
    
    public void onEnable() {
        final long n = FastBreak.f5666 ^ 0x1FD740B8FB74L;
        this.f5635.clear();
        this.f5621.clear();
        final BlockPos origin = BlockPos.ORIGIN;
        this.f5623 = origin;
        this.f5634 = origin;
        this.f5641 = origin;
        this.f5644 = origin;
    }
    
    @Subscribe(stage = Stage.ALL)
    private void m11365(final EventPacket$Send p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          31333681622785
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          6
        //    16: aload_1        
        //    17: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //    20: instanceof      Lnet.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
        //    23: iload           4
        //    25: ifne            127
        //    28: ifeq            108
        //    31: goto            38
        //    34: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    37: athrow         
        //    38: aload_1        
        //    39: invokevirtual   org/rusherhack/core/event/type/EventCancellable.isCancelled:()Z
        //    42: iload           4
        //    44: ifne            127
        //    47: goto            54
        //    50: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    53: athrow         
        //    54: ifne            108
        //    57: goto            64
        //    60: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    63: athrow         
        //    64: aload_1        
        //    65: iload           4
        //    67: ifne            109
        //    70: goto            77
        //    73: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    76: athrow         
        //    77: invokevirtual   org/rusherhack/core/event/type/Event.getStage:()Lorg/rusherhack/core/event/stage/Stage;
        //    80: getstatic       org/rusherhack/core/event/stage/Stage.POST:Lorg/rusherhack/core/event/stage/Stage;
        //    83: if_acmpne       108
        //    86: goto            93
        //    89: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    92: athrow         
        //    93: aload           6
        //    95: ldc_w           "Swing"
        //    98: invokevirtual   org/rusherhack/FastBreak.m11371:(Ljava/lang/String;)V
        //   101: goto            108
        //   104: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   107: athrow         
        //   108: aload_1        
        //   109: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //   112: iload           4
        //   114: ifne            204
        //   117: instanceof      Lnet.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
        //   120: goto            127
        //   123: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   126: athrow         
        //   127: ifeq            200
        //   130: aload_1        
        //   131: iload           4
        //   133: ifne            201
        //   136: goto            143
        //   139: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   142: athrow         
        //   143: invokevirtual   org/rusherhack/core/event/type/EventCancellable.isCancelled:()Z
        //   146: ifne            200
        //   149: goto            156
        //   152: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   155: athrow         
        //   156: aload_1        
        //   157: iload           4
        //   159: ifne            201
        //   162: goto            169
        //   165: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   168: athrow         
        //   169: invokevirtual   org/rusherhack/core/event/type/Event.getStage:()Lorg/rusherhack/core/event/stage/Stage;
        //   172: getstatic       org/rusherhack/core/event/stage/Stage.POST:Lorg/rusherhack/core/event/stage/Stage;
        //   175: if_acmpne       200
        //   178: goto            185
        //   181: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   184: athrow         
        //   185: aload           6
        //   187: getfield        org/rusherhack/FastBreak.f5639:Lorg/rusherhack/core/utils/Timer;
        //   190: invokevirtual   org/rusherhack/core/utils/Timer.reset:()V
        //   193: goto            200
        //   196: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   199: athrow         
        //   200: aload_1        
        //   201: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //   204: dup            
        //   205: astore_0       
        //   206: iload           4
        //   208: ifne            232
        //   211: instanceof      Lnet.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
        //   214: ifeq            244
        //   217: goto            224
        //   220: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   223: athrow         
        //   224: aload_0        
        //   225: goto            232
        //   228: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   231: athrow         
        //   232: checkcast       Lnet.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
        //   235: astore          5
        //   237: aload_1        
        //   238: invokevirtual   org/rusherhack/core/event/type/EventCancellable.isCancelled:()Z
        //   241: ifeq            249
        //   244: return         
        //   245: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   248: athrow         
        //   249: aload           5
        //   251: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getPos:()Lnet.minecraft.util.math.BlockPos;
        //   254: dup            
        //   255: astore_0       
        //   256: invokevirtual   net.minecraft.util.math.Vec3i.getY:()I
        //   259: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   262: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   265: invokeinterface net.minecraft.world.HeightLimitView.getTopY:()I
        //   270: if_icmplt       278
        //   273: return         
        //   274: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   277: athrow         
        //   278: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   281: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   284: aload_0        
        //   285: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //   288: astore          7
        //   290: aload           5
        //   292: aload           7
        //   294: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   297: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   300: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   303: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   306: invokevirtual   net.minecraft.entity.Entity.getWorld:()Lnet.minecraft.world.World;
        //   309: aload_0        
        //   310: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.calcBlockBreakingDelta:(Lnet.minecraft.entity.player.PlayerEntity;Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)F
        //   313: fstore          8
        //   315: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getAction:()Lnet.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
        //   318: getstatic       net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action.ABORT_DESTROY_BLOCK:Lnet.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
        //   321: if_acmpeq       530
        //   324: aload           7
        //   326: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isAir:()Z
        //   329: iload           4
        //   331: ifne            367
        //   334: goto            341
        //   337: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   340: athrow         
        //   341: ifne            530
        //   344: goto            351
        //   347: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   350: athrow         
        //   351: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   354: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   357: invokevirtual   net.minecraft.client.network.AbstractClientPlayerEntity.isCreative:()Z
        //   360: goto            367
        //   363: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   366: athrow         
        //   367: iload           4
        //   369: ifne            414
        //   372: ifne            429
        //   375: goto            382
        //   378: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   381: athrow         
        //   382: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   385: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   388: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   391: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   394: aload_0        
        //   395: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   398: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   401: invokevirtual   net.minecraft.client.network.ClientPlayerInteractionManager.getCurrentGameMode:()Lnet.minecraft.world.GameMode;
        //   404: invokevirtual   net.minecraft.entity.player.PlayerEntity.isBlockBreakingRestricted:(Lnet.minecraft.world.World;Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.world.GameMode;)Z
        //   407: goto            414
        //   410: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   413: athrow         
        //   414: iload           4
        //   416: ifne            434
        //   419: ifeq            430
        //   422: goto            429
        //   425: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   428: athrow         
        //   429: return         
        //   430: fload           8
        //   432: fconst_1       
        //   433: fcmpl          
        //   434: iload           4
        //   436: ifne            526
        //   439: iflt            510
        //   442: goto            449
        //   445: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   448: athrow         
        //   449: aload           5
        //   451: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getAction:()Lnet.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
        //   454: getstatic       net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action.START_DESTROY_BLOCK:Lnet.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
        //   457: if_acmpne       509
        //   460: goto            467
        //   463: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   466: athrow         
        //   467: aload_1        
        //   468: invokevirtual   org/rusherhack/core/event/type/Event.getStage:()Lorg/rusherhack/core/event/stage/Stage;
        //   471: getstatic       org/rusherhack/core/event/stage/Stage.POST:Lorg/rusherhack/core/event/stage/Stage;
        //   474: if_acmpne       509
        //   477: goto            484
        //   480: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   483: athrow         
        //   484: aload           6
        //   486: dup            
        //   487: getfield        org/rusherhack/FastBreak.ticksBetweenDestroyingBlocks:Lorg/rusherhack/core/setting/NumberSetting;
        //   490: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   493: checkcast       Ljava/lang/Integer;
        //   496: invokevirtual   java/lang/Integer.intValue:()I
        //   499: putfield        org/rusherhack/FastBreak.f5650:I
        //   502: goto            509
        //   505: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   508: athrow         
        //   509: return         
        //   510: aload           7
        //   512: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   515: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   518: aload_0        
        //   519: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getHardness:(Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)F
        //   522: ldc_w           -1.0
        //   525: fcmpl          
        //   526: ifne            530
        //   529: return         
        //   530: aload_1        
        //   531: invokevirtual   org/rusherhack/core/event/type/Event.getStage:()Lorg/rusherhack/core/event/stage/Stage;
        //   534: getstatic       org/rusherhack/core/event/stage/Stage.PRE:Lorg/rusherhack/core/event/stage/Stage;
        //   537: iload           4
        //   539: ifne            996
        //   542: if_acmpne       989
        //   545: goto            552
        //   548: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   551: athrow         
        //   552: getstatic       org/rusherhack/Class505.f8127:[I
        //   555: aload           5
        //   557: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getAction:()Lnet.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
        //   560: invokevirtual   java/lang/Enum.ordinal:()I
        //   563: iaload         
        //   564: lookupswitch {
        //                1: 596
        //                2: 787
        //          default: 988
        //        }
        //   592: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   595: athrow         
        //   596: aload           7
        //   598: goto            605
        //   601: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   604: athrow         
        //   605: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isAir:()Z
        //   608: iload           4
        //   610: ifne            645
        //   613: goto            620
        //   616: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   619: athrow         
        //   620: ifeq            631
        //   623: goto            630
        //   626: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   629: athrow         
        //   630: return         
        //   631: aload           6
        //   633: getfield        org/rusherhack/FastBreak.instantlyBreakTheLastBlockYouMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //   636: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   639: checkcast       Ljava/lang/Boolean;
        //   642: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   645: iload           4
        //   647: ifne            688
        //   650: ifeq            1616
        //   653: goto            660
        //   656: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   659: athrow         
        //   660: aload           6
        //   662: getfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //   665: iload           4
        //   667: ifne            706
        //   670: goto            677
        //   673: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   676: athrow         
        //   677: aload_0        
        //   678: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   681: goto            688
        //   684: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   687: athrow         
        //   688: ifeq            1616
        //   691: aload           6
        //   693: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //   696: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   699: goto            706
        //   702: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   705: athrow         
        //   706: iload           4
        //   708: ifne            777
        //   711: getstatic       org/rusherhack/Obf123.f2572:Lorg/rusherhack/Obf123;
        //   714: if_acmpne       778
        //   717: goto            724
        //   720: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   723: athrow         
        //   724: aload           6
        //   726: getfield        org/rusherhack/FastBreak.f5621:Ljava/util/Map;
        //   729: aload_0        
        //   730: fconst_1       
        //   731: dup            
        //   732: invokestatic    it/unimi/dsi/fastutil/floats/FloatFloatMutablePair.of:(FF)Lit/unimi/dsi/fastutil/floats/FloatFloatMutablePair;
        //   735: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   740: iconst_0       
        //   741: aload           6
        //   743: dup_x1         
        //   744: aload_0        
        //   745: aload           5
        //   747: aload           6
        //   749: iconst_1       
        //   750: dup            
        //   751: dup            
        //   752: pop2           
        //   753: putfield        org/rusherhack/FastBreak.f5656:Z
        //   756: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getDirection:()Lnet.minecraft.util.math.Direction;
        //   759: aload           5
        //   761: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getSequence:()I
        //   764: invokevirtual   org/rusherhack/FastBreak.m11362:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.math.Direction;I)V
        //   767: putfield        org/rusherhack/FastBreak.f5656:Z
        //   770: goto            777
        //   773: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   776: athrow         
        //   777: pop            
        //   778: aload_1        
        //   779: iconst_1       
        //   780: dup            
        //   781: dup            
        //   782: pop2           
        //   783: invokevirtual   org/rusherhack/core/event/type/EventCancellable.setCancelled:(Z)V
        //   786: return         
        //   787: aload           6
        //   789: getfield        org/rusherhack/FastBreak.grimBypass:Lorg/rusherhack/core/setting/BooleanSetting;
        //   792: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   795: checkcast       Ljava/lang/Boolean;
        //   798: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   801: iload           4
        //   803: ifne            839
        //   806: ifeq            1616
        //   809: goto            816
        //   812: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   815: athrow         
        //   816: aload           6
        //   818: getfield        org/rusherhack/FastBreak.speed:Lorg/rusherhack/core/setting/NumberSetting;
        //   821: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   824: checkcast       Ljava/lang/Float;
        //   827: invokevirtual   java/lang/Float.floatValue:()F
        //   830: fconst_0       
        //   831: fcmpl          
        //   832: goto            839
        //   835: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   838: athrow         
        //   839: iload           4
        //   841: ifne            915
        //   844: ifgt            891
        //   847: goto            854
        //   850: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   853: athrow         
        //   854: aload           6
        //   856: getfield        org/rusherhack/FastBreak.ticksBetweenDestroyingBlocks:Lorg/rusherhack/core/setting/NumberSetting;
        //   859: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   862: checkcast       Ljava/lang/Integer;
        //   865: invokevirtual   java/lang/Integer.intValue:()I
        //   868: iload           4
        //   870: ifne            915
        //   873: goto            880
        //   876: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   879: athrow         
        //   880: iconst_5       
        //   881: if_icmpge       1616
        //   884: goto            891
        //   887: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   890: athrow         
        //   891: aload           6
        //   893: iload           4
        //   895: ifne            958
        //   898: goto            905
        //   901: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   904: athrow         
        //   905: getfield        org/rusherhack/FastBreak.f5656:Z
        //   908: goto            915
        //   911: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   914: athrow         
        //   915: ifeq            949
        //   918: aload           6
        //   920: iload           4
        //   922: ifne            958
        //   925: goto            932
        //   928: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   931: athrow         
        //   932: getfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //   935: aload_0        
        //   936: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   939: ifne            1616
        //   942: goto            949
        //   945: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   948: athrow         
        //   949: aload           6
        //   951: goto            958
        //   954: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   957: athrow         
        //   958: aload_0        
        //   959: sipush          2527
        //   962: ldc2_w          4758043707684448169
        //   965: lload_2        
        //   966: lxor           
        //   967: invokedynamic   BootstrapMethod #0, d:(IJ)I
        //   972: invokevirtual   net.minecraft.util.math.BlockPos.up:(I)Lnet.minecraft.util.math.BlockPos;
        //   975: aload           5
        //   977: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getDirection:()Lnet.minecraft.util.math.Direction;
        //   980: aload           5
        //   982: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getSequence:()I
        //   985: invokevirtual   org/rusherhack/FastBreak.m11345:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.math.Direction;I)V
        //   988: return         
        //   989: aload_1        
        //   990: invokevirtual   org/rusherhack/core/event/type/Event.getStage:()Lorg/rusherhack/core/event/stage/Stage;
        //   993: getstatic       org/rusherhack/core/event/stage/Stage.POST:Lorg/rusherhack/core/event/stage/Stage;
        //   996: if_acmpne       1616
        //   999: getstatic       org/rusherhack/Class505.f8127:[I
        //  1002: aload           5
        //  1004: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getAction:()Lnet.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
        //  1007: invokevirtual   java/lang/Enum.ordinal:()I
        //  1010: iaload         
        //  1011: tableswitch {
        //                2: 1040
        //                3: 1389
        //                4: 1551
        //          default: 1616
        //        }
        //  1036: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1039: athrow         
        //  1040: aload           7
        //  1042: goto            1049
        //  1045: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1048: athrow         
        //  1049: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isAir:()Z
        //  1052: ifeq            1067
        //  1055: goto            1062
        //  1058: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1061: athrow         
        //  1062: return         
        //  1063: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1066: athrow         
        //  1067: aload           6
        //  1069: ldc_w           "Start %s, %s, %s"
        //  1072: iconst_3       
        //  1073: anewarray       Ljava/lang/Object;
        //  1076: dup            
        //  1077: iconst_0       
        //  1078: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1081: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1084: getfield        net.minecraft.entity.Entity.age:I
        //  1087: aload           6
        //  1089: getfield        org/rusherhack/FastBreak.f5660:I
        //  1092: isub           
        //  1093: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1096: aastore        
        //  1097: dup            
        //  1098: iconst_1       
        //  1099: dup            
        //  1100: dup            
        //  1101: pop2           
        //  1102: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1105: aload           6
        //  1107: getfield        org/rusherhack/FastBreak.f5624:J
        //  1110: lsub           
        //  1111: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1114: aastore        
        //  1115: dup            
        //  1116: iconst_2       
        //  1117: aload           6
        //  1119: iload           4
        //  1121: ifne            1166
        //  1124: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //  1127: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1130: getstatic       org/rusherhack/Obf123.f2571:Lorg/rusherhack/Obf123;
        //  1133: if_acmpne       1164
        //  1136: goto            1143
        //  1139: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1142: athrow         
        //  1143: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1146: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //  1149: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //  1152: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.getDestroyProgress:()F
        //  1157: goto            1169
        //  1160: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1163: athrow         
        //  1164: aload           6
        //  1166: getfield        org/rusherhack/FastBreak.f5653:F
        //  1169: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1172: aastore        
        //  1173: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1176: invokevirtual   org/rusherhack/FastBreak.m11371:(Ljava/lang/String;)V
        //  1179: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1182: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //  1185: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1188: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1191: aload_0        
        //  1192: invokevirtual   net.minecraft.world.World.canPlayerModifyAt:(Lnet.minecraft.entity.player.PlayerEntity;Lnet.minecraft.util.math.BlockPos;)Z
        //  1195: iload           4
        //  1197: ifne            1232
        //  1200: ifeq            1247
        //  1203: goto            1210
        //  1206: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1209: athrow         
        //  1210: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1213: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1216: invokevirtual   net.minecraft.entity.LivingEntity.getMainHandStack:()Lnet.minecraft.item.ItemStack;
        //  1219: getstatic       net.minecraft.item.Items.DEBUG_STICK:Lnet.minecraft.item.Item;
        //  1222: invokevirtual   net.minecraft.item.ItemStack.isOf:(Lnet.minecraft.item.Item;)Z
        //  1225: goto            1232
        //  1228: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1231: athrow         
        //  1232: iload           4
        //  1234: ifne            1283
        //  1237: ifeq            1248
        //  1240: goto            1247
        //  1243: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1246: athrow         
        //  1247: return         
        //  1248: aload           6
        //  1250: fconst_0       
        //  1251: aload           6
        //  1253: dup            
        //  1254: dup_x2         
        //  1255: aload_0        
        //  1256: invokevirtual   net.minecraft.util.math.BlockPos.toImmutable:()Lnet.minecraft.util.math.BlockPos;
        //  1259: putfield        org/rusherhack/FastBreak.f5644:Lnet.minecraft.util.math.BlockPos;
        //  1262: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //  1265: putfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //  1268: putfield        org/rusherhack/FastBreak.f5653:F
        //  1271: getfield        org/rusherhack/FastBreak.f5655:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1274: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1277: checkcast       Ljava/lang/Boolean;
        //  1280: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1283: iload           4
        //  1285: ifne            1324
        //  1288: ifeq            1616
        //  1291: goto            1298
        //  1294: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1297: athrow         
        //  1298: fload           8
        //  1300: fconst_1       
        //  1301: aload           6
        //  1303: getfield        org/rusherhack/FastBreak.speed:Lorg/rusherhack/core/setting/NumberSetting;
        //  1306: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1309: checkcast       Ljava/lang/Float;
        //  1312: invokevirtual   java/lang/Float.floatValue:()F
        //  1315: fsub           
        //  1316: fcmpl          
        //  1317: goto            1324
        //  1320: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1323: athrow         
        //  1324: iload           4
        //  1326: ifne            1372
        //  1329: iflt            1616
        //  1332: goto            1339
        //  1335: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1338: athrow         
        //  1339: aload           6
        //  1341: aload_0        
        //  1342: aload           5
        //  1344: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getDirection:()Lnet.minecraft.util.math.Direction;
        //  1347: aload           5
        //  1349: invokevirtual   net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getSequence:()I
        //  1352: invokevirtual   org/rusherhack/FastBreak.m11362:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.math.Direction;I)V
        //  1355: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1358: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //  1361: aload_0        
        //  1362: invokevirtual   net.minecraft.client.network.ClientPlayerInteractionManager.breakBlock:(Lnet.minecraft.util.math.BlockPos;)Z
        //  1365: goto            1372
        //  1368: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1371: athrow         
        //  1372: pop            
        //  1373: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1376: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //  1379: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //  1382: iconst_0       
        //  1383: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.setIsDestroying:(Z)V
        //  1388: return         
        //  1389: aload           6
        //  1391: dup            
        //  1392: dup_x1         
        //  1393: fconst_0       
        //  1394: putfield        org/rusherhack/FastBreak.f5653:F
        //  1397: getfield        org/rusherhack/FastBreak.ticksBetweenDestroyingBlocks:Lorg/rusherhack/core/setting/NumberSetting;
        //  1400: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1403: checkcast       Ljava/lang/Integer;
        //  1406: invokevirtual   java/lang/Integer.intValue:()I
        //  1409: putfield        org/rusherhack/FastBreak.f5650:I
        //  1412: aload           6
        //  1414: ldc_w           "Stop %s, %s, %s"
        //  1417: iconst_3       
        //  1418: anewarray       Ljava/lang/Object;
        //  1421: dup            
        //  1422: iconst_0       
        //  1423: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1426: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1429: getfield        net.minecraft.entity.Entity.age:I
        //  1432: aload           6
        //  1434: getfield        org/rusherhack/FastBreak.f5660:I
        //  1437: isub           
        //  1438: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1441: aastore        
        //  1442: dup            
        //  1443: iconst_1       
        //  1444: dup            
        //  1445: dup            
        //  1446: pop2           
        //  1447: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1450: aload           6
        //  1452: getfield        org/rusherhack/FastBreak.f5624:J
        //  1455: lsub           
        //  1456: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1459: aastore        
        //  1460: dup            
        //  1461: iconst_2       
        //  1462: aload           6
        //  1464: iload           4
        //  1466: ifne            1511
        //  1469: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //  1472: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1475: getstatic       org/rusherhack/Obf123.f2571:Lorg/rusherhack/Obf123;
        //  1478: if_acmpne       1509
        //  1481: goto            1488
        //  1484: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1487: athrow         
        //  1488: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1491: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //  1494: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //  1497: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.getDestroyProgress:()F
        //  1502: goto            1514
        //  1505: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1508: athrow         
        //  1509: aload           6
        //  1511: getfield        org/rusherhack/FastBreak.f5653:F
        //  1514: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1517: aastore        
        //  1518: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1521: invokevirtual   org/rusherhack/FastBreak.m11371:(Ljava/lang/String;)V
        //  1524: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1527: aload           6
        //  1529: dup_x2         
        //  1530: getfield        org/rusherhack/FastBreak.f5624:J
        //  1533: lsub           
        //  1534: ldc_w           "Broken in "
        //  1537: dup_x2         
        //  1538: pop            
        //  1539: ldc_w           " MS"
        //  1542: invokedynamic   BootstrapMethod #16, makeConcatWithConstants:(Ljava/lang/String;JLjava/lang/String;)Ljava/lang/String;
        //  1547: invokevirtual   org/rusherhack/FastBreak.m11371:(Ljava/lang/String;)V
        //  1550: return         
        //  1551: aload           6
        //  1553: getfield        org/rusherhack/FastBreak.f5644:Lnet.minecraft.util.math.BlockPos;
        //  1556: aload_0        
        //  1557: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1560: iload           4
        //  1562: ifne            1593
        //  1565: ifne            1616
        //  1568: goto            1575
        //  1571: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1574: athrow         
        //  1575: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //  1578: aload           6
        //  1580: getfield        org/rusherhack/FastBreak.f5644:Lnet.minecraft.util.math.BlockPos;
        //  1583: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //  1586: goto            1593
        //  1589: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1592: athrow         
        //  1593: ifne            1616
        //  1596: aload           6
        //  1598: dup            
        //  1599: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //  1602: dup_x1         
        //  1603: putfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //  1606: putfield        org/rusherhack/FastBreak.f5644:Lnet.minecraft.util.math.BlockPos;
        //  1609: goto            1616
        //  1612: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1615: athrow         
        //  1616: return         
        //    StackMapTable: 00 9A FF 00 22 00 06 07 00 02 07 05 7B 04 01 00 07 00 02 00 01 07 00 6A 03 4B 07 00 6A 43 01 45 07 00 6A 03 48 07 00 6A 43 07 05 7B 4B 07 00 6A 03 4A 07 00 6A 03 40 07 05 7B 4D 07 00 6A 43 01 4B 07 00 6A 43 07 05 7B 48 07 00 6A 03 48 07 00 6A 43 07 05 7B 4B 07 00 6A 03 4A 07 00 6A 03 40 07 05 7B 42 07 05 7D FF 00 0F 00 06 07 05 7D 07 05 7B 04 01 00 07 00 02 00 01 07 00 6A 03 43 07 00 6A 43 07 05 7D 0B 40 07 00 6A FF 00 03 00 06 07 05 7D 07 05 7B 04 01 07 00 F6 07 00 02 00 00 FF 00 18 00 06 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 00 01 07 00 6A 03 FF 00 3A 00 08 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 07 02 10 02 00 01 07 00 6A 43 01 45 07 00 6A 03 4B 07 00 6A 43 01 4A 07 00 6A 03 5B 07 00 6A 43 01 4A 07 00 6A 03 00 43 01 4A 07 00 6A 03 4D 07 00 6A 03 4C 07 00 6A 03 54 07 00 6A 03 00 4F 01 03 51 07 00 6A 03 67 07 00 6A 03 44 07 00 6A 43 07 02 10 4A 07 00 6A 43 01 45 07 00 6A 03 00 4D 01 4A 07 00 6A 03 4C 07 00 6A 43 07 00 C9 46 07 00 6A 43 01 4D 07 00 6A 43 07 01 5F 4D 07 00 6A 03 70 07 00 6A 43 07 01 5F 00 08 58 07 00 6A 03 52 07 00 6A 43 01 4A 07 00 6A 03 55 07 00 6A 43 01 46 07 00 6A 03 49 07 00 6A 43 07 00 02 45 07 00 6A 43 01 4C 07 00 6A 43 07 00 02 4C 07 00 6A 03 44 07 00 6A 43 07 00 02 1D 00 FF 00 06 00 08 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 07 02 10 02 00 02 07 05 1B 07 05 1B 67 07 00 6A 03 44 07 00 6A 43 07 02 10 48 07 00 6A 03 40 07 00 6A 03 F7 00 47 07 00 6A FF 00 03 00 08 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 07 02 10 02 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 50 07 00 6A FF 00 03 00 08 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 07 02 10 02 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 FF 00 01 00 08 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 07 02 10 02 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 07 00 02 FF 00 02 00 08 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 07 02 10 02 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 02 64 07 00 6A 03 51 07 00 6A 43 01 4A 07 00 6A 03 00 62 01 4A 07 00 6A 03 55 07 00 6A 43 01 4A 07 00 6A 03 5C 07 00 6A 43 01 10 F7 00 5E 07 00 6A FF 00 03 00 08 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 07 02 10 02 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 50 07 00 6A FF 00 03 00 08 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 07 02 10 02 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 FF 00 01 00 08 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 07 02 10 02 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 07 00 02 FF 00 02 00 08 07 00 C9 07 05 7B 04 01 07 00 F6 07 00 02 07 02 10 02 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 02 24 53 07 00 6A 03 4D 07 00 6A 43 01 52 07 00 6A 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  16     31     34     38     Ljava/lang/MatchException;
        //  28     47     50     54     Ljava/lang/MatchException;
        //  38     57     60     64     Ljava/lang/MatchException;
        //  54     70     73     77     Ljava/lang/MatchException;
        //  64     86     89     93     Ljava/lang/MatchException;
        //  77     101    104    108    Ljava/lang/MatchException;
        //  109    120    123    127    Ljava/lang/MatchException;
        //  127    136    139    143    Ljava/lang/MatchException;
        //  130    149    152    156    Ljava/lang/MatchException;
        //  143    162    165    169    Ljava/lang/MatchException;
        //  156    178    181    185    Ljava/lang/MatchException;
        //  169    193    196    200    Ljava/lang/MatchException;
        //  206    217    220    224    Ljava/lang/MatchException;
        //  211    225    228    232    Ljava/lang/MatchException;
        //  237    245    245    249    Ljava/lang/MatchException;
        //  256    274    274    278    Ljava/lang/MatchException;
        //  315    334    337    341    Ljava/lang/MatchException;
        //  324    344    347    351    Ljava/lang/MatchException;
        //  341    360    363    367    Ljava/lang/MatchException;
        //  367    375    378    382    Ljava/lang/MatchException;
        //  372    407    410    414    Ljava/lang/MatchException;
        //  414    422    425    429    Ljava/lang/MatchException;
        //  434    442    445    449    Ljava/lang/MatchException;
        //  439    460    463    467    Ljava/lang/MatchException;
        //  449    477    480    484    Ljava/lang/MatchException;
        //  467    502    505    509    Ljava/lang/MatchException;
        //  530    545    548    552    Ljava/lang/MatchException;
        //  542    592    592    596    Ljava/lang/MatchException;
        //  552    598    601    605    Ljava/lang/MatchException;
        //  605    613    616    620    Ljava/lang/MatchException;
        //  605    623    626    630    Ljava/lang/MatchException;
        //  645    653    656    660    Ljava/lang/MatchException;
        //  650    670    673    677    Ljava/lang/MatchException;
        //  660    681    684    688    Ljava/lang/MatchException;
        //  688    699    702    706    Ljava/lang/MatchException;
        //  706    717    720    724    Ljava/lang/MatchException;
        //  711    770    773    777    Ljava/lang/MatchException;
        //  787    809    812    816    Ljava/lang/MatchException;
        //  806    832    835    839    Ljava/lang/MatchException;
        //  839    847    850    854    Ljava/lang/MatchException;
        //  844    873    876    880    Ljava/lang/MatchException;
        //  854    884    887    891    Ljava/lang/MatchException;
        //  880    898    901    905    Ljava/lang/MatchException;
        //  891    908    911    915    Ljava/lang/MatchException;
        //  915    925    928    932    Ljava/lang/MatchException;
        //  918    942    945    949    Ljava/lang/MatchException;
        //  932    951    954    958    Ljava/lang/MatchException;
        //  996    1036   1036   1040   Ljava/lang/MatchException;
        //  999    1042   1045   1049   Ljava/lang/MatchException;
        //  1049   1055   1058   1062   Ljava/lang/MatchException;
        //  1049   1063   1063   1067   Ljava/lang/MatchException;
        //  1067   1136   1139   1143   Ljava/lang/MatchException;
        //  1124   1160   1160   1164   Ljava/lang/MatchException;
        //  1169   1203   1206   1210   Ljava/lang/MatchException;
        //  1200   1225   1228   1232   Ljava/lang/MatchException;
        //  1232   1240   1243   1247   Ljava/lang/MatchException;
        //  1283   1291   1294   1298   Ljava/lang/MatchException;
        //  1288   1317   1320   1324   Ljava/lang/MatchException;
        //  1324   1332   1335   1339   Ljava/lang/MatchException;
        //  1329   1365   1368   1372   Ljava/lang/MatchException;
        //  1389   1481   1484   1488   Ljava/lang/MatchException;
        //  1469   1505   1505   1509   Ljava/lang/MatchException;
        //  1551   1568   1571   1575   Ljava/lang/MatchException;
        //  1565   1586   1589   1593   Ljava/lang/MatchException;
        //  1593   1609   1612   1616   Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void m11367(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          2803472290112
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          6
        //    16: aload           6
        //    18: getfield        org/rusherhack/FastBreak.breaksMultipleBlocksAtTheSameTime:Lorg/rusherhack/core/setting/BooleanSetting;
        //    21: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    24: checkcast       Ljava/lang/Boolean;
        //    27: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    30: iload           4
        //    32: ifne            63
        //    35: ifeq            66
        //    38: goto            45
        //    41: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    44: athrow         
        //    45: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //    48: aload           6
        //    50: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //    53: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //    56: goto            63
        //    59: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    62: athrow         
        //    63: ifne            67
        //    66: return         
        //    67: aconst_null    
        //    68: astore          5
        //    70: aload           6
        //    72: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //    75: invokevirtual   java/util/AbstractCollection.isEmpty:()Z
        //    78: ifne            129
        //    81: aload           6
        //    83: dup            
        //    84: invokevirtual   org/rusherhack/FastBreak.m11354:()Lnet.minecraft.util.math.BlockPos;
        //    87: invokevirtual   org/rusherhack/FastBreak.m11341:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.util.hit.BlockHitResult;
        //    90: dup            
        //    91: astore          5
        //    93: iload           4
        //    95: ifne            131
        //    98: iload           4
        //   100: ifne            131
        //   103: goto            110
        //   106: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   109: athrow         
        //   110: ifnonnull       129
        //   113: goto            120
        //   116: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   119: athrow         
        //   120: aload           6
        //   122: goto            72
        //   125: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   128: athrow         
        //   129: aload           5
        //   131: ifnonnull       135
        //   134: return         
        //   135: iload_1        
        //   136: iload           4
        //   138: ifne            207
        //   141: iconst_m1      
        //   142: if_icmpne       179
        //   145: goto            152
        //   148: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   151: athrow         
        //   152: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   155: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   158: checkcast       Lorg/rusherhack/client/api/accessors/world/IMixinClientLevel;
        //   161: invokeinterface org/rusherhack/client/api/accessors/world/IMixinClientLevel.invokeGetBlockStatePredictionHandler:()Lnet.minecraft.client.network.PendingUpdateManager;
        //   166: dup            
        //   167: astore_0       
        //   168: dup            
        //   169: invokevirtual   net.minecraft.client.network.PendingUpdateManager.incrementSequence:()Lnet.minecraft.client.network.PendingUpdateManager;
        //   172: invokevirtual   net.minecraft.client.network.PendingUpdateManager.getSequence:()I
        //   175: istore_1       
        //   176: invokevirtual   net.minecraft.client.network.PendingUpdateManager.close:()V
        //   179: aload           6
        //   181: dup            
        //   182: aload           5
        //   184: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   187: putfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   190: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   193: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   196: aload           6
        //   198: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   201: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //   204: invokevirtual   org/rusherhack/FastBreak.m11360:(Lnet.minecraft.block.BlockState;)Z
        //   207: pop            
        //   208: invokestatic    org/rusherhack/client/api/RusherHackAPI.getRotationManager:()Lorg/rusherhack/client/api/system/IRotationManager;
        //   211: checkcast       Lorg/rusherhack/Class331;
        //   214: astore_0       
        //   215: aload           6
        //   217: getfield        org/rusherhack/FastBreak.rotatesToTheBlockYouAreCurrentlyMining:Lorg/rusherhack/core/setting/BooleanSetting;
        //   220: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   223: checkcast       Ljava/lang/Boolean;
        //   226: iload           4
        //   228: ifne            496
        //   231: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   234: ifeq            422
        //   237: goto            244
        //   240: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   243: athrow         
        //   244: aload_0        
        //   245: aload           6
        //   247: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   250: invokeinterface org/rusherhack/client/api/system/IRotationManager.isLookingAt:(Lnet.minecraft.util.math.BlockPos;)Z
        //   255: iload           4
        //   257: ifne            307
        //   260: goto            267
        //   263: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   266: athrow         
        //   267: ifne            387
        //   270: goto            277
        //   273: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   276: athrow         
        //   277: aload           6
        //   279: aload_0        
        //   280: aload           5
        //   282: ldc_w           180.0
        //   285: invokevirtual   org/rusherhack/Class331.updateRotation:(Lnet.minecraft.util.hit.BlockHitResult;F)V
        //   288: getfield        org/rusherhack/FastBreak.grimBypass:Lorg/rusherhack/core/setting/BooleanSetting;
        //   291: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   294: checkcast       Ljava/lang/Boolean;
        //   297: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   300: goto            307
        //   303: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   306: athrow         
        //   307: ifeq            350
        //   310: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   313: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   316: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   319: new             Lnet.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
        //   322: dup            
        //   323: getstatic       net.minecraft.util.Hand.MAIN_HAND:Lnet.minecraft.util.Hand;
        //   326: iload_1        
        //   327: aload_0        
        //   328: dup            
        //   329: getfield        org/rusherhack/Class331.f5324:F
        //   332: swap           
        //   333: getfield        org/rusherhack/Class331.f5318:F
        //   336: invokespecial   net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.<init>:(Lnet.minecraft.util.Hand;IFF)V
        //   339: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //   342: aload_0        
        //   343: goto            388
        //   346: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   349: athrow         
        //   350: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   353: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   356: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   359: new             Lnet.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.LookAndOnGround;
        //   362: dup            
        //   363: aload_0        
        //   364: dup            
        //   365: getfield        org/rusherhack/Class331.f5324:F
        //   368: swap           
        //   369: getfield        org/rusherhack/Class331.f5318:F
        //   372: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   375: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   378: invokevirtual   net.minecraft.entity.Entity.isOnGround:()Z
        //   381: invokespecial   net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.LookAndOnGround.<init>:(FFZ)V
        //   384: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //   387: aload_0        
        //   388: aload           6
        //   390: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   393: invokevirtual   org/rusherhack/Class331.getLookRaycast:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.util.hit.BlockHitResult;
        //   396: dup            
        //   397: astore_0       
        //   398: invokevirtual   net.minecraft.util.hit.BlockHitResult.getType:()Lnet.minecraft.util.hit.HitResult.Type;
        //   401: iload           4
        //   403: ifne            496
        //   406: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //   409: if_acmpeq       422
        //   412: goto            419
        //   415: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   418: athrow         
        //   419: aload_0        
        //   420: astore          5
        //   422: aload           6
        //   424: dup            
        //   425: dup_x1         
        //   426: dup2           
        //   427: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   430: aload           5
        //   432: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //   435: iload_1        
        //   436: invokevirtual   org/rusherhack/FastBreak.m11352:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.math.Direction;I)V
        //   439: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   442: aload           5
        //   444: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //   447: iload_1        
        //   448: invokevirtual   org/rusherhack/FastBreak.m11362:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.math.Direction;I)V
        //   451: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   454: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   457: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   460: new             Lnet.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
        //   463: dup            
        //   464: getstatic       net.minecraft.util.Hand.MAIN_HAND:Lnet.minecraft.util.Hand;
        //   467: invokespecial   net.minecraft.network.packet.c2s.play.HandSwingC2SPacket.<init>:(Lnet.minecraft.util.Hand;)V
        //   470: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //   473: getfield        org/rusherhack/FastBreak.f5621:Ljava/util/Map;
        //   476: aload           6
        //   478: getfield        org/rusherhack/FastBreak.f5623:Lnet.minecraft.util.math.BlockPos;
        //   481: fconst_0       
        //   482: dup            
        //   483: invokestatic    it/unimi/dsi/fastutil/floats/FloatFloatMutablePair.of:(FF)Lit/unimi/dsi/fastutil/floats/FloatFloatMutablePair;
        //   486: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   491: aload           6
        //   493: invokevirtual   org/rusherhack/FastBreak.m11348:()V
        //   496: pop            
        //   497: return         
        //    StackMapTable: 00 23 FF 00 29 00 06 07 00 02 01 04 01 00 07 00 02 00 01 07 00 6A 03 4D 07 00 6A 43 01 02 00 FF 00 04 00 06 07 00 02 01 04 01 07 02 C3 07 00 02 00 01 07 00 02 61 07 00 6A 43 07 02 C3 45 07 00 6A 03 44 07 00 6A 03 41 07 02 C3 03 4C 07 00 6A 03 FF 00 1A 00 06 07 01 5F 01 04 01 07 02 C3 07 00 02 00 00 5B 01 FF 00 20 00 06 07 05 83 01 04 01 07 02 C3 07 00 02 00 01 07 00 6A 03 52 07 00 6A 43 01 45 07 00 6A 03 59 07 00 6A 43 01 66 07 00 6A 03 24 40 07 05 83 FF 00 1A 00 06 07 02 C3 01 04 01 07 02 C3 07 00 02 00 01 07 00 6A 03 FF 00 02 00 06 07 01 5F 01 04 01 07 02 C3 07 00 02 00 00 F7 00 49 07 01 5F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  16     38     41     45     Ljava/lang/MatchException;
        //  35     56     59     63     Ljava/lang/MatchException;
        //  93     103    106    110    Ljava/lang/MatchException;
        //  98     113    116    120    Ljava/lang/MatchException;
        //  110    125    125    129    Ljava/lang/MatchException;
        //  135    145    148    152    Ljava/lang/MatchException;
        //  215    237    240    244    Ljava/lang/MatchException;
        //  231    260    263    267    Ljava/lang/MatchException;
        //  244    270    273    277    Ljava/lang/MatchException;
        //  267    300    303    307    Ljava/lang/MatchException;
        //  307    346    346    350    Ljava/lang/MatchException;
        //  398    412    415    419    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0110:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public ModuleCommand createCommand() {
        return null;
    }
    
    public void onDisable() {
        final long n = FastBreak.f5666 ^ 0x1132F29255C9L;
        this.f5627 = false;
        this.m11348();
    }
    
    @Subscribe(priority = -401)
    public void m8856(final EventRender3D p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          113190993869033
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9155:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          6
        //    16: aload           6
        //    18: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //    21: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    24: iload           4
        //    26: ifeq            55
        //    29: getstatic       org/rusherhack/Obf123.f2572:Lorg/rusherhack/Obf123;
        //    32: if_acmpeq       47
        //    35: goto            42
        //    38: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    41: athrow         
        //    42: return         
        //    43: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    46: athrow         
        //    47: aload           6
        //    49: getfield        org/rusherhack/FastBreak.render:Lorg/rusherhack/core/setting/BooleanSetting;
        //    52: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    55: checkcast       Ljava/lang/Boolean;
        //    58: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    61: iload           4
        //    63: ifeq            536
        //    66: ifeq            522
        //    69: goto            76
        //    72: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    75: athrow         
        //    76: aload_1        
        //    77: invokevirtual   org/rusherhack/client/api/events/render/EventRender3D.getRenderer:()Lorg/rusherhack/client/api/render/IRenderer3D;
        //    80: astore          5
        //    82: aload           6
        //    84: aload           5
        //    86: dup_x1         
        //    87: aload_1        
        //    88: invokevirtual   org/rusherhack/client/api/events/render/EventRender.getMatrixStack:()Lnet.minecraft.client.util.math.MatrixStack;
        //    91: invokeinterface org/rusherhack/client/api/render/IRenderer.begin:(Lnet.minecraft.client.util.math.MatrixStack;)V
        //    96: getfield        org/rusherhack/FastBreak.widthOfOutline:Lorg/rusherhack/core/setting/NumberSetting;
        //    99: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   102: checkcast       Ljava/lang/Float;
        //   105: invokevirtual   java/lang/Float.floatValue:()F
        //   108: invokeinterface org/rusherhack/client/api/render/IRenderer3D.setLineWidth:(F)V
        //   113: aload           5
        //   115: aload           6
        //   117: getfield        org/rusherhack/FastBreak.hideHiddenSides:Lorg/rusherhack/core/setting/BooleanSetting;
        //   120: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   123: checkcast       Ljava/lang/Boolean;
        //   126: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   129: invokeinterface org/rusherhack/client/api/render/IRenderer3D.setDepthTest:(Z)V
        //   134: aload           6
        //   136: getfield        org/rusherhack/FastBreak.f5621:Ljava/util/Map;
        //   139: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   144: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   149: dup            
        //   150: astore          7
        //   152: invokeinterface java/util/Iterator.hasNext:()Z
        //   157: ifeq            414
        //   160: aload           7
        //   162: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   167: checkcast       Ljava/util/Map.Entry;
        //   170: dup            
        //   171: astore_0       
        //   172: invokeinterface java/util/Map.Entry.getKey:()Ljava/lang/Object;
        //   177: checkcast       Lnet.minecraft.util.math.BlockPos;
        //   180: astore          8
        //   182: aload_0        
        //   183: invokeinterface java/util/Map.Entry.getValue:()Ljava/lang/Object;
        //   188: checkcast       Lit/unimi/dsi/fastutil/floats/FloatFloatMutablePair;
        //   191: invokeinterface it/unimi/dsi/fastutil/floats/FloatFloatPair.firstFloat:()F
        //   196: fstore          9
        //   198: aload_0        
        //   199: invokeinterface java/util/Map.Entry.getValue:()Ljava/lang/Object;
        //   204: checkcast       Lit/unimi/dsi/fastutil/floats/FloatFloatMutablePair;
        //   207: invokeinterface it/unimi/dsi/fastutil/floats/FloatFloatPair.secondFloat:()F
        //   212: fstore          10
        //   214: fload           9
        //   216: iload           4
        //   218: ifeq            268
        //   221: fload           10
        //   223: fcmpl          
        //   224: iload           4
        //   226: ifeq            430
        //   229: goto            236
        //   232: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   235: athrow         
        //   236: ifle            271
        //   239: goto            246
        //   242: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   245: athrow         
        //   246: fload           9
        //   248: f2d            
        //   249: fload           10
        //   251: f2d            
        //   252: aload_1        
        //   253: invokevirtual   org/rusherhack/client/api/events/render/EventRender.getPartialTicks:()F
        //   256: f2d            
        //   257: invokestatic    org/rusherhack/core/utils/MathUtils.interpolate:(DDD)D
        //   260: d2f            
        //   261: goto            268
        //   264: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   267: athrow         
        //   268: goto            273
        //   271: fload           9
        //   273: fstore          11
        //   275: aload           6
        //   277: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   280: iload           4
        //   282: ifeq            332
        //   285: aload           8
        //   287: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   290: ifeq            321
        //   293: goto            300
        //   296: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   299: athrow         
        //   300: fload           11
        //   302: fconst_1       
        //   303: aload           6
        //   305: getfield        org/rusherhack/FastBreak.speed:Lorg/rusherhack/core/setting/NumberSetting;
        //   308: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   311: checkcast       Ljava/lang/Float;
        //   314: invokevirtual   java/lang/Float.floatValue:()F
        //   317: fsub           
        //   318: fdiv           
        //   319: fstore          11
        //   321: fload           11
        //   323: fconst_0       
        //   324: fconst_1       
        //   325: invokestatic    org/rusherhack/core/utils/MathUtils.clamp:(FFF)F
        //   328: fstore          11
        //   330: aload           8
        //   332: aload           6
        //   334: getfield        org/rusherhack/FastBreak.startcolor:Lorg/rusherhack/client/api/setting/ColorSetting;
        //   337: invokevirtual   org/rusherhack/client/api/setting/ColorSetting.getValueRGB:()I
        //   340: aload           6
        //   342: getfield        org/rusherhack/FastBreak.endcolor:Lorg/rusherhack/client/api/setting/ColorSetting;
        //   345: invokevirtual   org/rusherhack/client/api/setting/ColorSetting.getValueRGB:()I
        //   348: fload           11
        //   350: f2d            
        //   351: aload           6
        //   353: getfield        org/rusherhack/FastBreak.fillTheBox:Lorg/rusherhack/core/setting/BooleanSetting;
        //   356: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   359: checkcast       Ljava/lang/Boolean;
        //   362: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   365: aload           6
        //   367: getfield        org/rusherhack/FastBreak.outlineTheBox:Lorg/rusherhack/core/setting/BooleanSetting;
        //   370: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   373: checkcast       Ljava/lang/Boolean;
        //   376: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   379: aload           6
        //   381: getfield        org/rusherhack/FastBreak.staticSetting:Lorg/rusherhack/core/setting/BooleanSetting;
        //   384: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   387: checkcast       Ljava/lang/Boolean;
        //   390: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   393: aload           6
        //   395: getfield        org/rusherhack/FastBreak.f5646:Lorg/rusherhack/core/setting/EnumSetting;
        //   398: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   401: checkcast       Lorg/rusherhack/Obf222;
        //   404: aload           5
        //   406: invokestatic    org/rusherhack/BreakESP.m15472:(Lnet.minecraft.util.math.BlockPos;IIDZZZLorg/rusherhack/Obf222;Lorg/rusherhack/client/api/render/IRenderer3D;)V
        //   409: aload           7
        //   411: goto            152
        //   414: aload           6
        //   416: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   419: invokevirtual   java/util/AbstractSequentialList.iterator:()Ljava/util/Iterator;
        //   422: dup            
        //   423: astore          7
        //   425: invokeinterface java/util/Iterator.hasNext:()Z
        //   430: ifeq            515
        //   433: aload           7
        //   435: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   440: checkcast       Lnet.minecraft.util.math.BlockPos;
        //   443: astore_0       
        //   444: iload           4
        //   446: ifeq            510
        //   449: aload           6
        //   451: getfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   454: aload_0        
        //   455: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   458: iload           4
        //   460: ifeq            536
        //   463: goto            470
        //   466: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   469: athrow         
        //   470: ifeq            489
        //   473: goto            480
        //   476: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   479: athrow         
        //   480: aload           7
        //   482: goto            425
        //   485: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   488: athrow         
        //   489: aload           5
        //   491: aload_0        
        //   492: iconst_0       
        //   493: iconst_1       
        //   494: dup            
        //   495: dup            
        //   496: pop2           
        //   497: aload           6
        //   499: getfield        org/rusherhack/FastBreak.startcolor:Lorg/rusherhack/client/api/setting/ColorSetting;
        //   502: invokevirtual   org/rusherhack/client/api/setting/ColorSetting.getValueRGB:()I
        //   505: invokeinterface org/rusherhack/client/api/render/IRenderer3D.drawBox:(Lnet.minecraft.util.math.BlockPos;ZZI)V
        //   510: aload           7
        //   512: goto            425
        //   515: aload           5
        //   517: invokeinterface org/rusherhack/client/api/render/IRenderer.end:()V
        //   522: aload           6
        //   524: getfield        org/rusherhack/FastBreak.automaticallyRemineTheLastBlockYouMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //   527: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   530: checkcast       Ljava/lang/Boolean;
        //   533: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   536: iload           4
        //   538: ifeq            563
        //   541: ifeq            1179
        //   544: goto            551
        //   547: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   550: athrow         
        //   551: aload           6
        //   553: getfield        org/rusherhack/FastBreak.f5627:Z
        //   556: goto            563
        //   559: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   562: athrow         
        //   563: iload           4
        //   565: ifeq            596
        //   568: ifne            1179
        //   571: goto            578
        //   574: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   577: athrow         
        //   578: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   581: aload           6
        //   583: getfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //   586: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //   589: goto            596
        //   592: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   595: athrow         
        //   596: iload           4
        //   598: ifeq            634
        //   601: ifne            1179
        //   604: goto            611
        //   607: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   610: athrow         
        //   611: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   614: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   617: aload           6
        //   619: getfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //   622: invokeinterface net.minecraft.world.WorldView.isAir:(Lnet.minecraft.util.math.BlockPos;)Z
        //   627: goto            634
        //   630: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   633: athrow         
        //   634: ifne            1179
        //   637: aload           6
        //   639: getfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //   642: astore          5
        //   644: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   647: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   650: aload           5
        //   652: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //   655: dup            
        //   656: astore          7
        //   658: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   661: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   664: aload           5
        //   666: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getHardness:(Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)F
        //   669: ldc_w           -1.0
        //   672: fcmpl          
        //   673: ifne            681
        //   676: return         
        //   677: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   680: athrow         
        //   681: aload           6
        //   683: aload           5
        //   685: invokevirtual   org/rusherhack/FastBreak.m11341:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.util.hit.BlockHitResult;
        //   688: dup            
        //   689: astore_0       
        //   690: iload           4
        //   692: ifeq            714
        //   695: ifnonnull       706
        //   698: goto            705
        //   701: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   704: athrow         
        //   705: return         
        //   706: aload           6
        //   708: getfield        org/rusherhack/FastBreak.ticksBetweenDestroyingBlocks:Lorg/rusherhack/core/setting/NumberSetting;
        //   711: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   714: checkcast       Ljava/lang/Integer;
        //   717: invokevirtual   java/lang/Integer.intValue:()I
        //   720: iload           4
        //   722: ifeq            752
        //   725: ifle            764
        //   728: goto            735
        //   731: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   734: athrow         
        //   735: aload           6
        //   737: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   740: aload           5
        //   742: invokevirtual   java/util/LinkedList.remove:(Ljava/lang/Object;)Z
        //   745: goto            752
        //   748: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   751: athrow         
        //   752: aload           6
        //   754: getfield        org/rusherhack/FastBreak.f5635:Ljava/util/LinkedList;
        //   757: aload           5
        //   759: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   762: pop2           
        //   763: return         
        //   764: invokestatic    org/rusherhack/client/api/RusherHackAPI.getRotationManager:()Lorg/rusherhack/client/api/system/IRotationManager;
        //   767: checkcast       Lorg/rusherhack/Class331;
        //   770: astore          8
        //   772: aload           6
        //   774: iload           4
        //   776: ifeq            1005
        //   779: getfield        org/rusherhack/FastBreak.rotatesToTheBlockYouAreCurrentlyMining:Lorg/rusherhack/core/setting/BooleanSetting;
        //   782: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   785: checkcast       Ljava/lang/Boolean;
        //   788: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   791: ifeq            1003
        //   794: goto            801
        //   797: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   800: athrow         
        //   801: aload           8
        //   803: aload_0        
        //   804: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   807: invokeinterface org/rusherhack/client/api/system/IRotationManager.isLookingAt:(Lnet.minecraft.util.math.BlockPos;)Z
        //   812: iload           4
        //   814: ifeq            864
        //   817: goto            824
        //   820: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   823: athrow         
        //   824: ifne            960
        //   827: goto            834
        //   830: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   833: athrow         
        //   834: aload           6
        //   836: aload           8
        //   838: aload_0        
        //   839: ldc_w           180.0
        //   842: invokevirtual   org/rusherhack/Class331.updateRotation:(Lnet.minecraft.util.hit.BlockHitResult;F)V
        //   845: getfield        org/rusherhack/FastBreak.grimBypass:Lorg/rusherhack/core/setting/BooleanSetting;
        //   848: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   851: checkcast       Ljava/lang/Boolean;
        //   854: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   857: goto            864
        //   860: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   863: athrow         
        //   864: ifeq            922
        //   867: aload           8
        //   869: aload           6
        //   871: aload           7
        //   873: invokevirtual   org/rusherhack/FastBreak.m11360:(Lnet.minecraft.block.BlockState;)Z
        //   876: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   879: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   882: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   885: new             Lnet.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
        //   888: dup            
        //   889: getstatic       net.minecraft.util.Hand.MAIN_HAND:Lnet.minecraft.util.Hand;
        //   892: iconst_0       
        //   893: aload           8
        //   895: dup            
        //   896: getfield        org/rusherhack/Class331.f5324:F
        //   899: swap           
        //   900: getfield        org/rusherhack/Class331.f5318:F
        //   903: invokespecial   net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.<init>:(Lnet.minecraft.util.Hand;IFF)V
        //   906: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //   909: aload           6
        //   911: invokevirtual   org/rusherhack/FastBreak.m11348:()V
        //   914: pop            
        //   915: goto            962
        //   918: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   921: athrow         
        //   922: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   925: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   928: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   931: new             Lnet.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.LookAndOnGround;
        //   934: dup            
        //   935: aload           8
        //   937: dup            
        //   938: getfield        org/rusherhack/Class331.f5324:F
        //   941: swap           
        //   942: getfield        org/rusherhack/Class331.f5318:F
        //   945: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   948: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   951: invokevirtual   net.minecraft.entity.Entity.isOnGround:()Z
        //   954: invokespecial   net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.LookAndOnGround.<init>:(FFZ)V
        //   957: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //   960: aload           8
        //   962: aload_0        
        //   963: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   966: invokevirtual   org/rusherhack/Class331.getLookRaycast:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.util.hit.BlockHitResult;
        //   969: dup            
        //   970: astore          9
        //   972: iload           4
        //   974: ifeq            1002
        //   977: invokevirtual   net.minecraft.util.hit.BlockHitResult.getType:()Lnet.minecraft.util.hit.HitResult.Type;
        //   980: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //   983: if_acmpeq       1003
        //   986: goto            993
        //   989: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   992: athrow         
        //   993: aload           9
        //   995: goto            1002
        //   998: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1001: athrow         
        //  1002: astore_0       
        //  1003: aload           6
        //  1005: ldc_w           "~\u001bBR\u0013\u0001\u001aR\u0013\u0001\u001aR\u0013\u0001"
        //  1008: aload           6
        //  1010: dup            
        //  1011: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1014: putfield        org/rusherhack/FastBreak.f5624:J
        //  1017: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1020: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1023: getfield        net.minecraft.entity.Entity.age:I
        //  1026: putfield        org/rusherhack/FastBreak.f5660:I
        //  1029: invokestatic    org/rusherhack/client/api/feature/command/arg/ItemReference.$:(Ljava/lang/String;)Ljava/lang/String;
        //  1032: iconst_3       
        //  1033: anewarray       Ljava/lang/Object;
        //  1036: dup            
        //  1037: iconst_0       
        //  1038: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1041: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1044: getfield        net.minecraft.entity.Entity.age:I
        //  1047: aload           6
        //  1049: getfield        org/rusherhack/FastBreak.f5660:I
        //  1052: isub           
        //  1053: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1056: aastore        
        //  1057: dup            
        //  1058: iconst_1       
        //  1059: dup            
        //  1060: dup            
        //  1061: pop2           
        //  1062: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1065: aload           6
        //  1067: getfield        org/rusherhack/FastBreak.f5624:J
        //  1070: lsub           
        //  1071: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1074: aastore        
        //  1075: dup            
        //  1076: iconst_2       
        //  1077: aload           6
        //  1079: iload           4
        //  1081: ifeq            1126
        //  1084: getfield        org/rusherhack/FastBreak.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //  1087: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1090: getstatic       org/rusherhack/Obf123.f2571:Lorg/rusherhack/Obf123;
        //  1093: if_acmpne       1124
        //  1096: goto            1103
        //  1099: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1102: athrow         
        //  1103: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1106: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //  1109: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //  1112: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.getDestroyProgress:()F
        //  1117: goto            1129
        //  1120: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1123: athrow         
        //  1124: aload           6
        //  1126: getfield        org/rusherhack/FastBreak.f5653:F
        //  1129: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1132: aastore        
        //  1133: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1136: invokevirtual   org/rusherhack/FastBreak.m11371:(Ljava/lang/String;)V
        //  1139: aload           6
        //  1141: aload_0        
        //  1142: aload           7
        //  1144: invokevirtual   org/rusherhack/FastBreak.m11374:(Lnet.minecraft.util.hit.BlockHitResult;Lnet.minecraft.block.BlockState;)Z
        //  1147: ifeq            1179
        //  1150: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1153: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1156: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //  1159: new             Lnet.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
        //  1162: dup            
        //  1163: getstatic       net.minecraft.util.Hand.MAIN_HAND:Lnet.minecraft.util.Hand;
        //  1166: invokespecial   net.minecraft.network.packet.c2s.play.HandSwingC2SPacket.<init>:(Lnet.minecraft.util.Hand;)V
        //  1169: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //  1172: goto            1179
        //  1175: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1178: athrow         
        //  1179: return         
        //    StackMapTable: 00 52 FF 00 26 00 06 07 00 02 07 05 B0 04 01 00 07 00 02 00 01 07 00 6A 03 40 07 00 6A 03 47 07 01 5F 50 07 00 6A 03 FF 00 4B 00 07 07 01 5F 07 05 B0 04 01 07 05 C2 07 00 02 07 04 9B 00 01 07 04 9B FF 00 4F 00 0A 07 05 D0 07 05 B0 04 01 07 05 C2 07 00 02 07 04 9B 07 00 C9 02 02 00 01 07 00 6A 43 01 45 07 00 6A 03 51 07 00 6A 43 02 02 41 02 FF 00 16 00 0B 07 05 D0 07 05 B0 04 01 07 05 C2 07 00 02 07 04 9B 07 00 C9 02 02 02 00 01 07 00 6A 03 14 4A 07 00 C9 FF 00 51 00 07 07 01 5F 07 05 B0 04 01 07 05 C2 07 00 02 07 04 9B 00 00 4A 07 04 9B 44 01 FF 00 23 00 07 07 00 C9 07 05 B0 04 01 07 05 C2 07 00 02 07 04 9B 00 01 07 00 6A 43 01 45 07 00 6A 03 44 07 00 6A 03 14 FF 00 04 00 07 07 01 5F 07 05 B0 04 01 07 05 C2 07 00 02 07 04 9B 00 00 FF 00 06 00 06 07 01 5F 07 05 B0 04 01 00 07 00 02 00 00 4D 01 4A 07 00 6A 03 47 07 00 6A 43 01 4A 07 00 6A 03 4D 07 00 6A 43 01 4A 07 00 6A 03 52 07 00 6A 43 01 FF 00 2A 00 07 07 01 5F 07 05 B0 04 01 07 00 C9 07 00 02 07 02 10 00 01 07 00 6A 03 FF 00 13 00 07 07 02 C3 07 05 B0 04 01 07 00 C9 07 00 02 07 02 10 00 01 07 00 6A 03 00 47 07 01 5F 50 07 00 6A 03 4C 07 00 6A 43 01 0B FF 00 20 00 08 07 02 C3 07 05 B0 04 01 07 00 C9 07 00 02 07 02 10 07 05 83 00 01 07 00 6A 03 52 07 00 6A 43 01 45 07 00 6A 03 59 07 00 6A 43 01 75 07 00 6A 03 25 41 07 05 83 FF 00 1A 00 09 07 02 C3 07 05 B0 04 01 07 00 C9 07 00 02 07 02 10 07 05 83 07 02 C3 00 01 07 00 6A 03 44 07 00 6A 43 07 02 C3 FA 00 00 41 07 00 02 F7 00 5D 07 00 6A FF 00 03 00 08 07 02 C3 07 05 B0 04 01 07 00 C9 07 00 02 07 02 10 07 05 83 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 50 07 00 6A FF 00 03 00 08 07 02 C3 07 05 B0 04 01 07 00 C9 07 00 02 07 02 10 07 05 83 00 05 07 00 02 07 01 84 07 01 9D 07 01 9D 01 FF 00 01 00 08 07 02 C3 07 05 B0 04 01 07 00 C9 07 00 02 07 02 10 07 05 83 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 07 00 02 FF 00 02 00 08 07 02 C3 07 05 B0 04 01 07 00 C9 07 00 02 07 02 10 07 05 83 00 06 07 00 02 07 01 84 07 01 9D 07 01 9D 01 02 6D 07 00 6A FF 00 03 00 06 07 01 5F 07 05 B0 04 01 00 07 00 02 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  16     35     38     42     Ljava/lang/MatchException;
        //  29     43     43     47     Ljava/lang/MatchException;
        //  55     69     72     76     Ljava/lang/MatchException;
        //  214    229    232    236    Ljava/lang/MatchException;
        //  221    239    242    246    Ljava/lang/MatchException;
        //  236    261    264    268    Ljava/lang/MatchException;
        //  275    293    296    300    Ljava/lang/MatchException;
        //  444    463    466    470    Ljava/lang/MatchException;
        //  449    473    476    480    Ljava/lang/MatchException;
        //  470    485    485    489    Ljava/lang/MatchException;
        //  536    544    547    551    Ljava/lang/MatchException;
        //  541    556    559    563    Ljava/lang/MatchException;
        //  563    571    574    578    Ljava/lang/MatchException;
        //  568    589    592    596    Ljava/lang/MatchException;
        //  596    604    607    611    Ljava/lang/MatchException;
        //  601    627    630    634    Ljava/lang/MatchException;
        //  658    677    677    681    Ljava/lang/MatchException;
        //  690    698    701    705    Ljava/lang/MatchException;
        //  714    728    731    735    Ljava/lang/MatchException;
        //  725    745    748    752    Ljava/lang/MatchException;
        //  772    794    797    801    Ljava/lang/MatchException;
        //  779    817    820    824    Ljava/lang/MatchException;
        //  801    827    830    834    Ljava/lang/MatchException;
        //  824    857    860    864    Ljava/lang/MatchException;
        //  864    918    918    922    Ljava/lang/MatchException;
        //  972    986    989    993    Ljava/lang/MatchException;
        //  977    995    998    1002   Ljava/lang/MatchException;
        //  1005   1096   1099   1103   Ljava/lang/MatchException;
        //  1084   1120   1120   1124   Ljava/lang/MatchException;
        //  1129   1172   1175   1179   Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0236:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void m11371(final String s) {
        
    }
    
    private boolean m11374(final BlockHitResult p0, final BlockState p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          129448707924869
        //     6: lxor           
        //     7: lstore_3       
        //     8: aload_0        
        //     9: astore          6
        //    11: invokestatic    org/rusherhack/Class253.m9155:()I
        //    14: aload_1        
        //    15: dup            
        //    16: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //    19: astore_0       
        //    20: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //    23: astore          7
        //    25: istore          5
        //    27: aload_2        
        //    28: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    31: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //    34: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    37: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //    40: invokevirtual   net.minecraft.entity.Entity.getWorld:()Lnet.minecraft.world.World;
        //    43: aload_0        
        //    44: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.calcBlockBreakingDelta:(Lnet.minecraft.entity.player.PlayerEntity;Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)F
        //    47: dup            
        //    48: fstore          8
        //    50: fconst_1       
        //    51: fcmpl          
        //    52: iload           5
        //    54: ifeq            75
        //    57: iflt            76
        //    60: goto            67
        //    63: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    66: athrow         
        //    67: iconst_0       
        //    68: goto            75
        //    71: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    74: athrow         
        //    75: ireturn        
        //    76: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    79: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    82: checkcast       Lorg/rusherhack/client/api/accessors/world/IMixinClientLevel;
        //    85: invokeinterface org/rusherhack/client/api/accessors/world/IMixinClientLevel.invokeGetBlockStatePredictionHandler:()Lnet.minecraft.client.network.PendingUpdateManager;
        //    90: astore          9
        //    92: aload           6
        //    94: aload           9
        //    96: dup            
        //    97: invokevirtual   net.minecraft.client.network.PendingUpdateManager.incrementSequence:()Lnet.minecraft.client.network.PendingUpdateManager;
        //   100: invokevirtual   net.minecraft.client.network.PendingUpdateManager.getSequence:()I
        //   103: istore          9
        //   105: invokevirtual   net.minecraft.client.network.PendingUpdateManager.close:()V
        //   108: aload_2        
        //   109: invokevirtual   org/rusherhack/FastBreak.m11360:(Lnet.minecraft.block.BlockState;)Z
        //   112: aload_2        
        //   113: aload           6
        //   115: dup_x1         
        //   116: aload_0        
        //   117: aload           7
        //   119: iload           9
        //   121: invokevirtual   org/rusherhack/FastBreak.m11352:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.math.Direction;I)V
        //   124: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   127: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   130: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   133: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   136: invokevirtual   net.minecraft.entity.Entity.getWorld:()Lnet.minecraft.world.World;
        //   139: aload_0        
        //   140: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.calcBlockBreakingDelta:(Lnet.minecraft.entity.player.PlayerEntity;Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)F
        //   143: fstore          8
        //   145: invokevirtual   org/rusherhack/FastBreak.m11348:()V
        //   148: pop            
        //   149: fload           8
        //   151: aload           6
        //   153: getfield        org/rusherhack/FastBreak.f5655:Lorg/rusherhack/core/setting/BooleanSetting;
        //   156: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   159: checkcast       Ljava/lang/Boolean;
        //   162: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   165: ifeq            191
        //   168: fconst_1       
        //   169: aload           6
        //   171: getfield        org/rusherhack/FastBreak.speed:Lorg/rusherhack/core/setting/NumberSetting;
        //   174: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   177: checkcast       Ljava/lang/Float;
        //   180: invokevirtual   java/lang/Float.floatValue:()F
        //   183: fsub           
        //   184: goto            192
        //   187: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   190: athrow         
        //   191: fconst_1       
        //   192: fcmpl          
        //   193: iload           5
        //   195: ifeq            231
        //   198: iflt            217
        //   201: goto            208
        //   204: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   207: athrow         
        //   208: iconst_1       
        //   209: dup            
        //   210: dup            
        //   211: pop2           
        //   212: ireturn        
        //   213: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   216: athrow         
        //   217: aload           6
        //   219: getfield        org/rusherhack/FastBreak.instantlyBreakTheLastBlockYouMined:Lorg/rusherhack/core/setting/BooleanSetting;
        //   222: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   225: checkcast       Ljava/lang/Boolean;
        //   228: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   231: iload           5
        //   233: ifeq            364
        //   236: ifeq            286
        //   239: goto            246
        //   242: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   245: athrow         
        //   246: aload           6
        //   248: getfield        org/rusherhack/FastBreak.f5641:Lnet.minecraft.util.math.BlockPos;
        //   251: aload_0        
        //   252: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   255: iload           5
        //   257: ifeq            364
        //   260: goto            267
        //   263: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   266: athrow         
        //   267: ifeq            286
        //   270: goto            277
        //   273: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   276: athrow         
        //   277: iconst_1       
        //   278: dup            
        //   279: dup            
        //   280: pop2           
        //   281: ireturn        
        //   282: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   285: athrow         
        //   286: aload           6
        //   288: fconst_0       
        //   289: aload           6
        //   291: dup_x1         
        //   292: iconst_1       
        //   293: aload           6
        //   295: aload_0        
        //   296: putfield        org/rusherhack/FastBreak.f5634:Lnet.minecraft.util.math.BlockPos;
        //   299: putfield        org/rusherhack/FastBreak.f5627:Z
        //   302: putfield        org/rusherhack/FastBreak.f5653:F
        //   305: getfield        org/rusherhack/FastBreak.f5621:Ljava/util/Map;
        //   308: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   313: aload           6
        //   315: invokedynamic   BootstrapMethod #17, test:(Lorg/rusherhack/FastBreak;)Ljava/util/function/Predicate;
        //   320: invokeinterface java/util/Collection.removeIf:(Ljava/util/function/Predicate;)Z
        //   325: aload           6
        //   327: getfield        org/rusherhack/FastBreak.f5621:Ljava/util/Map;
        //   330: aload_0        
        //   331: aload           6
        //   333: dup            
        //   334: getfield        org/rusherhack/FastBreak.f5653:F
        //   337: swap           
        //   338: getfield        org/rusherhack/FastBreak.f5653:F
        //   341: invokestatic    it/unimi/dsi/fastutil/floats/FloatFloatMutablePair.of:(FF)Lit/unimi/dsi/fastutil/floats/FloatFloatMutablePair;
        //   344: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   349: pop2           
        //   350: aload           6
        //   352: getfield        org/rusherhack/FastBreak.rotatesToTheBlockYouAreCurrentlyMining:Lorg/rusherhack/core/setting/BooleanSetting;
        //   355: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   358: checkcast       Ljava/lang/Boolean;
        //   361: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   364: iload           5
        //   366: ifeq            402
        //   369: ifeq            398
        //   372: goto            379
        //   375: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   378: athrow         
        //   379: invokestatic    org/rusherhack/client/api/RusherHackAPI.getRotationManager:()Lorg/rusherhack/client/api/system/IRotationManager;
        //   382: aload_1        
        //   383: ldc_w           180.0
        //   386: invokeinterface org/rusherhack/client/api/system/IRotationManager.updateRotation:(Lnet.minecraft.util.hit.BlockHitResult;F)V
        //   391: goto            398
        //   394: invokestatic    org/rusherhack/FastBreak.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   397: athrow         
        //   398: iconst_1       
        //   399: dup            
        //   400: dup            
        //   401: pop2           
        //   402: ireturn        
        //    StackMapTable: 00 1B FF 00 3F 00 08 07 00 C9 07 02 C3 07 02 10 04 01 07 00 02 07 06 0E 02 00 01 07 00 6A 03 43 07 00 6A 43 01 00 FF 00 6E 00 09 07 00 C9 07 02 C3 07 02 10 04 01 07 00 02 07 06 0E 02 01 00 01 07 00 6A 43 02 FF 00 00 00 09 07 00 C9 07 02 C3 07 02 10 04 01 07 00 02 07 06 0E 02 01 00 02 02 02 4B 07 00 6A 03 44 07 00 6A 03 4D 01 4A 07 00 6A 03 50 07 00 6A 43 01 45 07 00 6A 03 44 07 00 6A 03 F7 00 4D 01 4A 07 00 6A 03 4E 07 00 6A 03 43 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  50     60     63     67     Ljava/lang/MatchException;
        //  57     68     71     75     Ljava/lang/MatchException;
        //  145    187    187    191    Ljava/lang/MatchException;
        //  192    201    204    208    Ljava/lang/MatchException;
        //  198    213    213    217    Ljava/lang/MatchException;
        //  231    239    242    246    Ljava/lang/MatchException;
        //  236    260    263    267    Ljava/lang/MatchException;
        //  246    270    273    277    Ljava/lang/MatchException;
        //  267    282    282    286    Ljava/lang/MatchException;
        //  364    372    375    379    Ljava/lang/MatchException;
        //  369    391    394    398    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0246:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        try {
        f5666 = Class066.m4320(6220254347167120374L, 1134279323122230520L, (Object)MethodHandles.lookup().lookupClass()).m4325(207783799083960L);
        f5673 = new Object[363];
        f5674 = new String[363];
        m179();
        f5669 = new HashMap(13);
        final long n = FastBreak.f5666 ^ 0x7D9A5643D1FFL;
        final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        final int opmode = 2;
        final SecretKeyFactory instance2 = SecretKeyFactory.getInstance("DES");
        final byte[] key = new byte[8];
        key[0] = (byte)(n >>> 56);
        for (int i = 1; i < 8; ++i) {
            key[i] = (byte)(n << i * 8 >>> 56);
        }
        instance.init(opmode, instance2.generateSecret(new DESKeySpec(key)), new IvParameterSpec(new byte[8]));
        final String[] f5675 = new String[70];
        int n2 = 0;
        String s;
        int n3 = (s = """
                      !;\u00c5@`~e\fs8\u0084\rP\u00f1¶)\u00c6\u008d\u00d9\u00adR-U\u00ea£\u0099\u0014h\u00c5|\u0080\u00e9M@\u00c4Vª\u0085\u009f\u0000=\u00d7c9\u000bBq\u009c(\u00f9E\u00c5\u00f1Y\u0005n9\r¸\u008f\u0012\u009e\u00ee\u007f\u00d7z\u00c0\u0015\u0014.!4\u0088\u00d6j\u00de5\u0095¤\u009bu\u0012'GQVD\u000f	8§/\u00eaR\u00ec\u00fd\u00c2z_\u0003\u00c8	\u00863Zµ8xp	\u00c3\u0095\u008f\u0011»,»\u00c1\u00f0º\u00d0\u000eFmb#\u0095»\u00e0\u00ad~Q\u0087\u001d\u00ec\u00ee\u001f\u00e5\u0081eC^R\u00f5sX\u0010bB«{\u0096y\u0088K\u0099\u00f8\u009a\u00d2\u0003\u00c5#$8_aX>*\u00f6ª\u001f®\u00df\u00002\u00e8f,\u0088;M\u00f7(\u00df\u00d9vOA\u00d2\u0083\u00c6\u00d7\u00e4\u00c3\u00e7;];\u00e2=\u00e6¢\u000elF\u0007\u00cb¿\u00ff\u00c6\u00cf\u00eb\u00d8z\u00f4\u0081N\f\u00de8Dpr\u00c5.±J\u00e5\u00d6\u00f8
                      µ\u00cc=\u009a1No´\u00efk\u0014H\u0012\u00ad\u00adP\u0018\u00e1¿$%\u0099\u0085WfDX\u00efT\u00adª¶\u0017a\u00f1:\u00d2\u00d9\u00cd\b\u00e0z\u0096dU\u0010¤+%\u00fd\u0085K\u00c9\u00d5N\u00f5Z\u00ec\u00c1n\u001f\u0002\u0018¨ª(P.G\u0018\u0098¾L\u0091¼|\u00c3·\r\u009cV\u00e1\u00fd_7³ \u0010\u008f=~\u0093¿N /¡V\u0010\u00cc\u0098»a) \u0013i\u00e75\u00c4]\u00f2w\u00d1\u008aD\u00da\u00cc(\u00d7\fH\u0015;+\u0005\u00c5j²
                      \u00d2\u00f2?BQ^·8¸[.}\b\u009aNz\u0017¼D\u001a\u0002\u00ff\u00f5\u0006\u00e8\u0012\u009f¦\u00d4\u00ed]g\u001cm\u001aL\u0088;\u001f \u0095u\u00dc\u0015\u00ca\u00e1\u00f09\\u00fd\u0097¾²E¿/\u0090\u0002H}¥@-\u00dc\u0018\u00f2g[\u00ee\u0010\u00fb
                      ,½4s(8
                      \u00d9D\b¿kY
                      \u0015F¥ f\u001b\u00d9\u00c3\u0004\u00daN\u00d7`a\u0095xb\u00e3\u00c7W¹\u00d8v¾g	\u00df®\u00dd!\u0015eD\u00f1\u00142\u0010d\u009b \u00db\u00ebd_*,f\u0001\u0080uo\u0005\u008a\u0010[/	\u0084E\u009d\u001c\u0087@\u00f7~\u00de¼\u0082r°\u0010\u0017q\u009a\u008a\u00f8q«\u00fb\u0014\u000f\u001e%'¶\u00d6¡8Q\u00d5L\u00c0¹\u0095[\u00e3\u007fu§h\u009e6r\u00db\u00e2JK\u0094¤\u00f3\u001a1\u0097\u0010\u009b\u00c2M\u0087\u007f²\u0014\u00ad\u00c1\u007f\\u0000\u0091G\\mc´\u000f!S:\u0012|d\u00eb\u00ddB%\u008bH\u009d\u0004\u007f\u00ad\u0082P\u00ee\u00d2!\u0003\u0007<\u0097·¶³\u001e¼\u0087'=\u00d6K\u0099\u00c0\u009b\u00ce\u0095)W\u0098f\u000b\u00cc\u0015J	1\u0097\u00ee|\u00e6\u0011\u008b\u00f7Y\u0014§MB*\u00db\u00f4\u00ear4\u0011\u00d7|\u00ca\u0089\u0013Y\u00fa\u0018)ª\u00e3^\u00eb|\u00fb(s\u00f4\u00c9x\u008f\u00ddz\u00c7\u0002.º!\u00d7\u00cc#!»·w\u0085\u00ecO\u0015\u00d9^=¼.\u00ceq8(¿\u0012\u0011\u0003.\u0092\u00f6\u00ad\u0010\u009eC\r\u00c6\u00adK\u001du\u00cc\u00dfjwqs\u0017\u0017\u0010J\u0087	\u00da·¸`->S\u000eM\u00ef\u0015*¥\u0010\u008c\u00c4·\f´\u001a(\u00cf\u0001\u009a\b\u00df\u00f8\u0087j¬\u0010\u00ee\u00d3@ H`\u0018 \u00d3*{\u0093\u00df/\u00e12\u0018\u0097\u0089)\u009c\u00dd¨´¢O\u0099^\u008f\u00c0.\u0013\u0094,\u00c9"\u0015\bª\u00d9\u0010 F\u000fª7\u00ed¶ B\u00ad¹kW²?V\u00d373\u001a\u008f\u0089\u000b³`N\u0014¤"S¼"t\u0010\u00d5\u00e2±\u00943\u00e5\u00c9$\u0080\u0006[y\u00f2¨9\u001c\u0010^\u00cd\u0012`¥wl\u0093}\u0093J\u0014\u0092A\u00907\u0010O\u000fM\u00f4_«\u00ce8/\u00d5\u0014\u0015\u0086\u001e\u00e6\u00dc e\u00ff¨¸\u00e1\u00c7$\u00d2\u00ebz\u00c9\u00e6«\u00ceb\u008d@E\u00fc\u0014\u0095\u007f8\u00e6\u00ea]d\u001e\u00ff\u00db\u00ce¶P)\u0012>¶V»"J;\u0006\u00ca,n#\u00e0\u009a\u0084B\u00d7®\u00eeY:\u008c\u00cbc\u00c6\u0085\u00e4E\u00e6Jb,V4\u0013xL\u00ee\u00dde\u001a`»\u00c3\u00d0\u00ef>\u00d3!n°Y\u00f6\u009c²X\u00dfg\u00e8¨\u001d\u009d\u0085±'`?¬J¤:\u008a5t\u00e8;\u0017\u00fe \u0084\u00e6:¿!}\u0007\u00cb\u0082\u00fcu\u00d0\u00fb½¢'Z\u00f2\u00f8V\u00c5\u00d0\u0006¿;q8\u0001_¬o\u0088 H²\u00e2\u00fe\u008f\u0090D}\u00dc:o\u00adº\u00e6c\u0099\u00depty\u0092XEj\u001e\u001d\u00dd@©#\u00d2\u0015\u00101V\u00f07\f46\u00ca\u0090Y\u000b\u00d8%Y\u00d8Z R\u009f\u0001\u0081\u0002J\u00f4}i\u00dd\u00c8\u0090·\u00e4\u008b\u00c2\u00c3xg6F6\u009e\\G\u00e0µF\u00e7\u00e5\u00e3V\u0018E®hwq\u0087q\u009e%8\u00fb]9\u00e8\u0098\u00d1¬\u00eb\u00d0(\u0002±\u0000\u00de\u0010\u0086¢¶\u00fak	N#J\u0082¬\u00c2\u00c4\u00f6\u00d4\u001a C)\u00ed\u00cb´\u00fbq\u009eq\u00d1©c\u00f7\u0013E\u0007\u001b\u00d7]^\u00cb\u00e6"\u00e4\f\u000b\u000buh\u001cG#(\u00e3p\\P\u00cf\u00ec\u00c7©\u00cedx!²\u00e2\u00ca\u00cf²¹\u0087\u00ea\u00d8\u00eb3\u00e7<l\\_\u00d2\u00df\u008en\u00c1(=\u008dB\r\u00ed\\u0010\u0017\u0013\u00c4\u00c8"aµh3\u0082)e\u0011\u0003\u00ed\u00fb\u0018\u009f\u00e3§\u00e7p\u00ec@W\u0091\u00fdw\u001a\u001d®\u00e4\u00dd\u00c5<\u00ad\u00ee\u0093'\u00d7\u008b ¼\u007fv©BIN\u00d4¡y\u00c3\u00d49\u00d5\u009b\u00e0 ©\u009eI\u0007¡\u0084¦_\u00d9\u009f£d\u009b\u00c0\u00188\u001e\u00c4\u00f2\u00e3\u0011\u00f6\u0094\u00ee\u0013\u00db\u00f1½ \u009b@*\u00e2\u00e8\u00f4\u00eb\u0092\u009c\u00df\u00c2\u00f7\u00f8\u00c0s¦Ya¤\u0000\u00f7\u00d0Vt\u00c9\u00de\u00d2.vW\u0007\u001ev\u00feº\u00f9\u008b;\u0010\u00fc\u0081\u00db\u000f\u0018\u00efo\u0005f\u009e\u00f2\u0015j\u0083l8©\u0099\u0090t\u0084
                      \u00d1Q\u00d5·`\u00f9\u001f(W\u00d3\u009e\u00ec\u00eb\u00fc1y\\¨Yf\u008ej \u008d´\u00d1\u0013Hx\u000b\u008d\u00edJ\u008dne)H>\u001c\u00f8d!\u00e5\b*¼\u00cc(s\u00d2\u009eVF\u0083¡Y\u00fdo\u00ec°|a9\u00cdYc\u0081i\u00d8M
                      \u009d\u00d8D6\u00efp\u00f9	X¤\u008f\u00e4\\z\u009f\u0097N\u0018=\u00ff\u00e5\u0092´\u00ffH}.\u009d|\u009af\u0019\u00ca\u00ff\u0007¼?½²\u00e1\u0019c8H¥\u00ce\u00ebKf3\u00e1
                      E\u00f5°\u008a)\u00e6\u009bA\u00e6\u00d7\u00ec\u00c7¹J¨\u00ee\u00e7\u0093\u00ec\u000f\u00db²µ\u0018O\u00f2\u0001\u00c2D\u0094P\u008c\u00e1\u0018\u0007\u009c\u0086\u00c1\u009f\u00eaKym?&\u00198HL=\u008bH?\u00d9\u0099\u00ef\u007ft%l\u00f4<r¨>E\u00e1O	v\u00ce\u00c9\u0086L	\u00cb\u0081\u0000\u00c7q\u00f8\u00ed^¥A\u0084\u00cdJ\u00c45Z\u00c5\u001d\u001e\u00c5\u0011\u00ce\u0017\u00d1r\u00cb\u00e4\u00dd^w\u00d3\u000f\u009er|\u001b½t"\u001cf\u0007°4\u000b@¨zlm<d\u00e6\u009f\u008cI¢{±\u00c1\u00f0\u00d2\u00e14TM\u00cc\u00f1\u00dcE·h\u00d9\r6\u0089\u0081
                      \u0099q^\u00c2\u00c4\u00d8\u00cc\u0019\u0093\u00f8\u001e);³\f§bV\u008e
                      wk\u00e9\u00d8j\u0013\u0011\u0085\u00fe~\u00f01\u0010U-{O¸\u00d1\u0095\u001d\u007f\u0002\u0005bª\u0017\u00c6\u000f $Ov\u0086/i£\u0018\u0002\r\u00f8\u00ea®7\u0001\u00e7\u00c8±\u00c8L Y\u0096\u00c1}¿\u00cd\u00d7\u00d0H \u00c5\u0018w\u00f2\u0084\u00ecª\u0011\r©\u00dcº\u0011%ª
                      (\u00cdn\u00e6\u0094\u00f5\u00e3\u0081Y5 ¼\u001a\u0096\u00e6\u00fe\u008etr\u00d7|5\u000b#\u00fd\u00d7\u00c3\u001d´\u00e8l\u00f2©UZ\u00cc\u00c3O~R¹\u008f
 ©\u00d4³\u0098\u00ec\u001a\u0097\u008bYMN0`\u00cc\u0083«\u0095»:s;\u00ea\u00915\u0087<\u00d5\u0088¾\u008b\u009fl(\u0090²[¼\u009b\u0002W\u001eª\u009d\u0094¿\u0003qv]n\u007f\u00e1¤²\u00db\u0012\u00f1\u0083\u00cc\u0085\u0093sn¯\u0005\u00ce\u0097H\u0004u\u00c8\u009c\u00cdH\u0083Wf\u009c\u00c2\u0095f«\u00ad7\u008b\u0088\u00e4:\b\u00ca\u0017l\u0011}\u00fb\u0099\u00c6\u0010\u00c0]\u000b\u00c4¸\u008b]-\u00e7\u007f+\u0099C\u00f1\u00c83\u0093¶\u00df\u0093x\u009c\u0018\u001cG}E)\u00191\u00cb\u00cb\f\u00c6y¼\u00e6\u00cd\u0099\u007f±Y¯¢q[\u00cb\u00d7(R\u009eK5n!:\u000b\u00dc\u00d7rH\u0019}E\u00cb-&\u0011L¢:f\u008e¹¨:»\u000e\u00de\u0091\u0017b\u0093\u00e8\u00d3\u00d1\u00d3\u00e0g8\u0013	\u001b³\u0004\u0090\u0099\u00ee\u00e2\bs®\u0013Gq\u00e6h\u00c7¹»X\u000b\u0015]\u0007+¾\u0018\u00e2{\u009a\u00de9u\u009a\u009d\u00dc1\u0012\u00067\u00ef`= iD}|\u0092\u001b.\u00e4\u00ech\u00e4\u0018au\u0099\u00d9c\u00f3\u009c\u00e8\u008a \u000b\u00c3W\u0084\u00dfe\u00e1\u00f7\u0092\u000fb+7# £\u00dba\u00ec\u00d8EH\u0011\u0003|B¬\u00d1J\u00f2\u00d3t\u00934'mr\u0011¯\u00c5(\u0089[,i,\u0095\u0018»n1\u00d4³\u00c9\u00ddZl\u008ew_g#\u00ec^\u00c5®S/\u00d3\u0087L\u0019 U\u0080\u00e5'X\u00ce\u00f7"8\u00e8\u0013\u00d3Y\u00c4°4=9\u00da\u0092X\u0080\u00fc\u00c0\u00d1xN¡ªW}E\u0018D£\u0093\u0086$e\u0014\u00fb\u0001\u00cf \u00ea(L\u00eb\u009e\u00cf\u00ceA¿C·\u00df\u00f7\u0010X\u00007\u00d5µb;XJ\u001d¿(°2¢\u0080X\u0094\u00c1\u00adJJ-\u0085d¾\u00cd\u0095\u0005\u0010>¥\u0017\u00f8\u0010»l\u00ea\u00f2\u00eb\u008b\u0097\u00d6>\u00fe\u00eaU\u001b\u00de\u00fb
|\u00e2\u00e6*D\u00e1B\u00006\u00ed+P¤:¦iP\u0005Y¹k¦5\u00f4\u0094\u00825F@Q\u00de\u00ff\u00e3\u0004r¾\u00fa±\u00e2\u0094\u0085\u00de\u008a:¯_\u00de\u00c5\u00dd\u0004\u00c4N=;\u00180\u000e?\u0019\u0005\u00e7\u0012LS\u0089\u00ff\u00cf\u00c2¿\u0082¦5\u00adw\u0002\u00e5¾\u00f1\u0016@j P\u00cc\u00e9]\u00d9'¡\fe%\u009d\u00c5\u00cb\u00e1T\u00ef¾]\u00ee=k5\u0015\u00da\u0005\u00f8\u0002¢\u0005\u0094]¥¦\u0016\u0089\u00e4\u001a\u0014\u009c\u0016\u0083\u0015\u0003\u00f1\u00f4~\u00869_\u008d^t>\u0083\u00e5:\u0094>I78¬\u0010\u009ats¹3\b\u008c9k§\u00c4\u009a¹<\u0006\u008a""").length();
        int n4 = 48;
        int n5 = -1;
    Label_0184:
        while (true) {
            while (true) {
                ++n5;
                final String s2 = s;
                final int beginIndex = n5;
                String s3 = s2.substring(beginIndex, beginIndex + n4);
                int n6 = -1;
                while (true) {
                    final String intern = m221(instance.doFinal(s3.getBytes("ISO-8859-1"))).intern();
                    switch (n6) {
                        default: {
                            f5675[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                continue Label_0184;
                            }
                            n3 = (s = "`*Smw\u007f\u0083\u009cm\u00c8e\u00c6ªB\u00ad\u001f}\u00c3~\u009aib-\u00cb\u0093(\u00ecn\u0092.\u00d9F\u0010\u00f3¼A\u00d1\u00fe<\u00f9W\u00c4m=\u00cb\u00ddo]¾").length();
                            n4 = 32;
                            n5 = -1;
                            break;
                        }
                        case 0: {
                            f5675[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                break;
                            }
                            break Label_0184;
                        }
                    }
                    ++n5;
                    final String s4 = s;
                    final int beginIndex2 = n5;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n4);
                    n6 = 0;
                }
            }
        }
        f5667 = f5675;
        f5668 = new String[70];
        f5672 = new HashMap(13);
        final Cipher instance3 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode2 = 2;
        final SecretKeyFactory instance4 = SecretKeyFactory.getInstance("DES");
        final byte[] key2 = new byte[8];
        key2[0] = (byte)(n >>> 56);
        for (int j = 1; j < 8; ++j) {
            key2[j] = (byte)(n << j * 8 >>> 56);
        }
        instance3.init(opmode2, instance4.generateSecret(new DESKeySpec(key2)), new IvParameterSpec(new byte[8]));
        final long[] f5676 = new long[20];
        int n7 = 0;
        String s5;
        int n8 = (s5 = "\u0081\u00ad\u00c5\u00e5MJ\u001c®La\u00dd\u00e3\u00f5\u001b\u00deXXq\u0099G¸¢%X\u0082ª2\u00e7\\,\u0011\u00c6\u0016e\u0002S\u00d9\u00e4N\u00cc\u00f5FN\n{?\u0003\u0089\u00fb±-ed\u0082\u00ca?e¶@5¹\u008d\u00cd\u00da\u0000G9\u0001%\u00fa\u0012*w\u00f4y¬a\u00d5¨\t\t)©\u00c0±\u007f\u00d1\u00cc\\\u00eag\u00f5X£\u0004·\u008f\u009c~t\u00f1\u0084º\u0081\u009d(\u0094\u00ef\u00ad\u0093\u00c5\u00df\u00db\u0012\u00d7\u0085{´{\u00ed\u00c3\u00cd\u00cd\u0088\u0013\u00fbvR\u00e9\u00e7f¬²\u00f6\u00e4y\u00f9(E.8\u008a\u00e9\u008a").length();
        int n9 = 0;
    Label_0484:
        while (true) {
            while (true) {
                final String s6 = s5;
                final int beginIndex3 = n9;
                n9 += 8;
                final byte[] bytes = s6.substring(beginIndex3, n9).getBytes("ISO-8859-1");
                long[] array2;
                long[] array = array2 = f5676;
                int n11;
                int n10 = n11 = n7;
                ++n7;
                long n12 = ((long)bytes[0] & 0xFFL) << 56 | ((long)bytes[1] & 0xFFL) << 48 | ((long)bytes[2] & 0xFFL) << 40 | ((long)bytes[3] & 0xFFL) << 32 | ((long)bytes[4] & 0xFFL) << 24 | ((long)bytes[5] & 0xFFL) << 16 | ((long)bytes[6] & 0xFFL) << 8 | ((long)bytes[7] & 0xFFL);
                int n13 = -1;
                while (true) {
                    final long n14 = n12;
                    final byte[] doFinal = instance3.doFinal(new byte[] { (byte)(n14 >>> 56), (byte)(n14 >>> 48), (byte)(n14 >>> 40), (byte)(n14 >>> 32), (byte)(n14 >>> 24), (byte)(n14 >>> 16), (byte)(n14 >>> 8), (byte)n14 });
                    final long n15 = ((long)doFinal[0] & 0xFFL) << 56 | ((long)doFinal[1] & 0xFFL) << 48 | ((long)doFinal[2] & 0xFFL) << 40 | ((long)doFinal[3] & 0xFFL) << 32 | ((long)doFinal[4] & 0xFFL) << 24 | ((long)doFinal[5] & 0xFFL) << 16 | ((long)doFinal[6] & 0xFFL) << 8 | ((long)doFinal[7] & 0xFFL);
                    switch (n13) {
                        default: {
                            array2[n11] = n15;
                            if (n9 >= n8) {
                                n8 = (s5 = "\u00c3yK!\u0000A\u00db;T\u00e2\u00fd`\u00fcD\u00cb\u0091").length();
                                n9 = 0;
                                break;
                            }
                            continue Label_0484;
                        }
                        case 0: {
                            array[n10] = n15;
                            if (n9 >= n8) {
                                break Label_0484;
                            }
                            break;
                        }
                    }
                    final String s7 = s5;
                    final int beginIndex4 = n9;
                    n9 += 8;
                    final byte[] bytes2 = s7.substring(beginIndex4, n9).getBytes("ISO-8859-1");
                    array = (array2 = f5676);
                    n10 = (n11 = n7);
                    ++n7;
                    n12 = (((long)bytes2[0] & 0xFFL) << 56 | ((long)bytes2[1] & 0xFFL) << 48 | ((long)bytes2[2] & 0xFFL) << 40 | ((long)bytes2[3] & 0xFFL) << 32 | ((long)bytes2[4] & 0xFFL) << 24 | ((long)bytes2[5] & 0xFFL) << 16 | ((long)bytes2[6] & 0xFFL) << 8 | ((long)bytes2[7] & 0xFFL));
                    n13 = 0;
                }
            }
        }
        f5670 = f5676;
        f5671 = new Integer[20];
    
        } catch (Exception exception) {
            throw new ExceptionInInitializerError(exception);
        }
    }

    private static String m221(final byte[] array) {
        int count = 0;
        final int length;
        final char[] value = new char[length = array.length];
        for (int i = 0; i < length; ++i) {
            final int n;
            if ((n = (0xFF & array[i])) < 192) {
                value[count++] = (char)n;
            }
            else if (n < 224) {
                value[count++] = (char)((char)((char)(n & 0x1F) << 6) | (char)(array[++i] & 0x3F));
            }
            else if (i < length - 2) {
                value[count++] = (char)((char)((char)((char)(n & 0xF) << 12) | (char)(array[++i] & 0x3F) << 6) | (char)(array[++i] & 0x3F));
            }
        }
        return new String(value, 0, count);
    }

    private static void m179() {
        final Object[] f5673 = FastBreak.f5673;
        f5673[0] = "k\u001dX:z/k\u001dOfv qVOxv5v'\u001d\"!w";
        f5673[1] = Integer.TYPE;
        FastBreak.f5674[1] = "java/lang/Integer";
        f5673[2] = "n\u0012u\f!\fr\bwP;\u0018b\u000b<\u0289";
        f5673[3] = "<s\u0018m\t\f<s\u000f1\u0005\u0003&8\u000f/\u0005\u0016!I^u\\U";
        f5673[4] = "\u0012{\u001931v\u000ea\u001bo+b\u001ebP~/j\u0018g\n3\"s\u0014'\u001f~ f\u000ez\u0011o0-\u001ee\u0017x-wS@3t;j\u0013D\u000bq7j-e\u001fd&q:h\u0013x\u000el\u0019l";
        f5673[5] = Void.TYPE;
        FastBreak.f5674[5] = "java/lang/Void";
        f5673[6] = "JAB\u0018$1V[@D>%FX\u000b\u0230";
        f5673[7] = "\u001eF\u0016k6B\u0002\\\u00147,V\u0012__&+E\u0014\u001a\u0002 0C\u0018Z\u0016k\u0006X\u001eX\u0014$*d\u0014@\u0005,*P";
        f5673[8] = "<u:+Kg<u-wGh&>-iG}!Oy1\u0010";
        f5673[9] = "uiR_]i~fC\u00101jpdA_\u001d";
        f5673[10] = Boolean.TYPE;
        FastBreak.f5674[10] = "java/lang/Boolean";
        f5673[11] = "MOqh\u0011\u0002QUs4\u000b\u0016AV8%\u000f\u001eGSbh\u0002\u0007K\u0013Q*\f\u0015CQe";
        f5673[12] = "qzve3\u000bqza9?\u0004k1a'?\u0011l@1zn";
        f5673[13] = "&]B\"q[-RSm\u0012V8_\\\u0006'T)L@*0Y";
        f5673[14] = "\u0010P\u001c0\u000bQ\u0010P\u000bl\u0007^\n\u001b\u000br\u0007K\rj^-P";
        f5673[15] = "O5KgMfS/I;WrC,\u0002*SzE)Xg^cIiY=V\u007fSie'IvN3C;FFT.@:";
        f5673[16] = "w\u0007r\u00022\u0000k\u001dp^(\u0014{\u001e;O/\u0007}[fI4\u0001q\u001br\u0002\u0013\u0010l\u0001|B'";
        f5673[17] = ">8_?nx57Np\u000fv><J*";
        f5673[18] = "U\u0006H@\u0003\u0005U\u0006_\u001c\u000f\nOM_\u0002\u000f\u001fH<\u000e]]T";
        f5673[19] = "\u0004sfJ.\n\u0018id\u00164\u001e\bj/\u00070\u0016\u000eouJ=\u000f\u0002/g\u0001=\u000b\u001esdJ1\u0010\u000ftm\u0001r+\u0004ff\b9\u001e\tmd)3\u001b\u001emd";
        f5673[20] = "\u0014\u0006o[\u001c\u000b\t\u00137y]\u0006\u0011\u0015";
        f5673[21] = ";/E9\u001dO'5Ge\u0007[76\ft\u0003S13V9\u000eJ=sQr\u001bN=3E9-S:9qr\u001bN=3E";
        f5673[22] = "5\u001c\u0016`j\t+\u0014\f/\"\t1\u001e\u0014h+\u0012q?\u000fn(\u0019>\u00133t4\f3\u0014\u0005s";
        f5673[23] = "Yw3n\tQEm12\u0013EUnz\u01df";
        f5673[24] = "+)!}al73#!{x'0h0\u007fp!52}ri-u 6rm1)#}pv)6'=w7%)!}Zm!6\u00146u|6>(0v";
        f5673[25] = "L<^@4PG3O\u000fIHT4FF";
        f5673[26] = "EU\u0010<\u0007\bYO\u0012`\u001d\u001cILYq\u001a\u000fO\t\u0004w\u0001\tCI\u0010<0\u0013_J$w\u0001\tCI\u0010";
        f5673[27] = "EZ\u0007s#\u001eY@\u0005/9\nICN\u0193";
        f5673[28] = "}\u001c=\u001b\u0010\u000fa\u0006?G\n\u001bq\u0005tV\r\bw@)P\u0016\u000e{\u0000=\u001b,\u000f\u007f\f?G1\u001ff\u001a3[\u0005";
        f5673[29] = "+PB\u000bm\u00107J@Ww\u0004'I\u000b\u012d";
        f5673[30] = "h2<~.,t(>\"48d+u300b./~=)nn=5=-r2>~16c575r\u0014h$.<9";
        f5673[31] = "_2\u000e'xuv\u000b\u0012=z)l\u001f\u0002>18k\f\u0004{l>p\n\b;xuW\u001b\u0015!v5cE";
        f5673[32] = "ZiQP>\\FsS\f$HVp\u0018\u0115";
        f5673[33] = "g\u0015\b?\u0006\u0000{\u000f\nc\u001c\u0014k\fA\u01dc";
        f5673[34] = "z3w }(y=/':*u|Q '.";
        f5673[35] = "V|\u0015r SS3%zb_";
        f5673[36] = "^\u001f[m\u0013 B\u0005Y1\t4R\u0006\u0012 \r<T\u0003Hm\u0000%XCO&\u0015!X\u0003[m\":]\u0002N\u0010\u0004!E\u0004R$";
        f5673[37] = "!\u0010s\tU.=\nqUO:-\t:DH)+LaSN7=LDFN)";
        f5673[38] = "\fr$li\u0013\u0007}5#\u000e\u0011\u0012v5h5";
        f5673[39] = "%\u007f\u0019TC\u0014.p\b\u001b+\u0014 \u007f\u001b";
        f5673[40] = Float.TYPE;
        FastBreak.f5674[40] = "java/lang/Float";
        f5673[41] = "y\u0007OI\u001cUe\u001dM\u0015\u0006Au\u001e\u0006\u0004\u0001Rs[J\u000e\u0000D8\u001eM\u001e@nc\u0019D,\u000bY";
        f5673[42] = "?21zV\u0012\u0016\u000b-`TN\f\u001f=c\u001f_\u000b\f;&BY\u0010\n7fV\u00127\u001b*|XR\u0003E";
        f5673[43] = "\u007fn\u0014mosct\u00161ugsw] qour\u0007m|vy2\u0015&|ren\u0016mpiti\u001f&3K\u007fx\u0006/xEqh\u0016$rti";
        f5673[44] = "1\u000f\u0018U\u0004<-\u0015\u001a\t\u001e(=\u0016Q\u0018\u0019;;S\n\u000f\u001f%-S<\u0014\u001a&,(\u000b\u0012\u001a:";
        f5673[45] = "(}\u0004U \"4g\u0006\t:6$dM\u0018>>\"a\u0017U3'.!1\u000e!?\"}+\u001a1<\u0006_*";
        f5673[46] = Double.TYPE;
        FastBreak.f5674[46] = "java/lang/Double";
        f5673[47] = ";=/F\u0014d''-\u001a\u000ep7$f\u0113";
        f5673[48] = "~\u0014L?m+`\u001cVp%+z\u0016N7,0:6U00+y\u0010H";
        f5673[49] = "\u0013\u001e\u000fi\f \u000f\u0004\r5\u00164\u001f\u0007F$\u0011'\u0019B\u001b\"\f<\u001d\u0000\u0001=\u001b{5?\r5\u00174\u0010\u0005\u0012&\u001c9\u0019";
        f5673[50] = "wiOYP\u0016ksM\u0005J\u0002{p\u0006\u0014N\n}u\\YC\u0013q5K\u0018L\u0005q|\u00064M\r~rO\u0002P\u0002lrG\u0019";
        f5673[51] = "\u0005&6\u001b!>\u0019<4G;*\t?\u007f\u0126";
        f5673[52] = "u@ci\u0010xu@t5\u001cwo\u000bt+\u001cbhz&pD(";
        f5673[53] = ")\u00115Z\u0006*5\u000b7\u0006\u001c>%\b|\u0540";
        f5673[54] = "\u0005\u000fi\u0002\u0010-\u0005\u000f~^\u001c\"\u001fD~@\u001c7\u00185,\u001bOw";
        f5673[55] = "\n\u0012Y:\u001f\u0006\n\u0012Nf\u0013\t\u0010YNx\u0013\u001c\u0017(\u001c#AZ";
        f5673[56] = "D\u0014\u0012\u000f\u001ekD\u0014\u0005S\u0012d^_\u0005M\u0012qY.T\u0019G4\u000e\u0012\n@\u0000quC^\u0015D";
        f5673[57] = "/ P\u0019^=/ GER25kG[R'2\u001a\u0012\u0004\u0007";
        f5673[58] = """
                    C\u0010\u001d'<dC\u0010
                    {0kY[
                    e0~^*[<h;""";
        f5673[59] = "\u001fL\u0004|au\u001fL\u0013 mz\u0005\u0007\u0013>mo\u0002vFa4";
        f5673[60] = "\u0014\\\u0019{\u001b%a|\u0012t\nj\u0000r\u0019\u007f\u000e0t";
        f5673[61] = "\u0007,NG\u0005\u001a\u001b6L\u001b\u001f\u000e\u000b5\u0007\u04c6";
        f5673[62] = "z\u001cXRC\u000bf\u0006Z\u000eY\u001fv\u0005\u0011\u001f^\fp@Z\nT\u0010a@L\bP\u0019p@l\bP\u0019p";
        f5673[63] = "'\u001b\u0017<dR;\u0001\u0015`~F+\u0002^qyU-G\u0015dsI<G\u0004kfBf,\u0006wxS\u000b\b\u001eqsK$\b\u0012~s";
        f5673[64] = "J\u00170P%EV\r2\f?QF\u000ey\u053c";
        f5673[65] = "gYO9wvgYXe{y}\u0012X{{lzc\t$//";
        f5673[66] = "]l\"\u000b\u0016WAv W\fCQuk\u04bb";
        f5673[67] = ".\u001e";
        f5673[68] = Long.TYPE;
        FastBreak.f5674[68] = "java/lang/Long";
        f5673[69] = "\u0012'n7Y+\u0019(\u007fx;(\u0016!";
        f5673[70] = "\r\u001d5E7V\u0006\u0012$\nJC\u0014\b&I";
        f5673[71] = "\u001aiI]Z-\u0004aS\u0012;:\u001am\\H\u0007";
        f5673[72] = "\u0003GR\u0013\u0013\u0005\u001f]PO\t\u0011\u000f^\u001b\u02b0";
        f5673[73] = ";z.d\\v;z98Py!19&Pl&@hy\b;6s;9B@g+j";
        f5673[74] = "d,_~\u0001Dz$E1bP~";
        f5673[75] = "K*U8&1K*Bd*>QaBz*+V\u0010\u0012/}m";
        f5673[76] = "\u007f$WP\b\ta,M\u001fj\u0015{.DUj\u0015f1";
        f5673[77] = "m\u0015\u0004H\u001c%m\u0015\u0013\u0014\u0010*w^\u0013\n\u0010?p/GTA~";
        f5673[78] = "T\b7(N3P\u001579S3\u0013\u001ax.T/I\u0015usF6R\u001dm.\u000e\u001cQ\u0013x)f6R\u001dm\u0010U.\\\u001eu8p;T\u000e";
        f5673[79] = "5\u0011Qqno)\u000bS-t{9\b\u0018<ps?\rBq}j3MW<\u007f\u007f)\u0010Y-o4-\fD3x4\u0013._'ut\u0019\u000f_:rn\u0016\u0006@:p";
        f5673[80] = "\u0002nGA+h\u001etE\u001d1|\u000ew\u000e\f5t\brTA8m\u00042S\u0016*i\bq\u000e&\u000br\u0019}T\u00066s }N\u000e>x\u001f";
        f5673[81] = "B/MmHaB/Z1DnXdZ/D{_\u0015\bq\u00130";
        f5673[82] = "i\u001bVw)\u0002u\u0001T+3\u0016e\u0002\u001f\u016b";
        f5673[83] = "\u0018#\u0018=\u0011E\u00049\u001aa\u000bQ\u0014:Qp\u000fY\u0012?\u000b=\u0002@\u001e\u007f\fj\u0010D\u0012<QZ0U\u0005'\u001aa0D\u0016%\u001a";
        f5673[84] = "V]?D\u0002\tV](\u0018\u000e\u0006L\u0016(\u0006\u000e\u0013Kgz\\ZW";
        f5673[85] = "\u0006ra\u000ex\u0002\u0006rvRt\r\u001c9vLt\u0018\u001bH$\u0019'Y";
        f5673[86] = """
                    7M
                    =ln3P
                    ,qnp_E;vr*PHfdk1XP;,A2VE<Dk1XP\u0018cn,""";
        f5673[87] = "S\u00190&ivO\u00032zsb_\u0000yktqYE\"|roOE\u0003avfN";
        f5673[88] = "*6e\u0000QA6,g\\KU&/,\u00f7";
        f5673[89] = "|Qr\u001dHQ`KpAREpH;PUVv\rwZT@=HpJ\u0014mXFl";
        f5673[90] = "msl'\u0018&s{vhe6s";
        f5673[91] = "[uAvggE}[9/g_wC~&|\u001fDEr-{RuCr";
        f5673[92] = "&Awe}K&A`9qD<\n`'qQ;{1y$\u001a";
        f5673[93] = "b\u0018OBp&~\u0002M\u001ej2n\u0001\u0006#";
        f5673[94] = "\bx}\u000bP'\bxjW\\(\u00123jI\\=\u0015B8\u001c\u000ey";
        f5673[95] = ">{\u0015e9;>{\u0002954$0\u0002'5!#APrgf";
        f5673[96] = "4'\u001a\u0016y}4'\rJur.l\rTug)\u001d\\\u0000 \"";
        f5673[97] = "%.=\"\u0017~94?~\rj)7to\tb/2.\"\u0004{#r?z\u0000e>/tb\u0000\u007f=3(gKN<94x5j)7?x";
        f5673[98] = "\u0003\u0018\u0001>1x\u0003\u0018\u0016b=w\u0019S\u0016|=b\u001e\"D'e#";
        f5673[99] = "\"\\\nl)\f\"\\\u001d0%\u00038\u0017\u001d.%\u0016?fOztW";
        f5673[100] = "\f\u0011";
        f5673[101] = "f\b\"\f\u000bkz\u0012 P\u0011\u007fj\u0011kA\u0016llT T\u001cp}T1[\t{'?3G\u0017j";
        f5673[102] = "tF\u0000; \u0001jN\u001atG\u0000{U\u0017.a\u0006";
        f5673[103] = "&F.e\u007fC:\\,9eW*_g\u04d9";
        f5673[104] = "PgZu\u007f)L}X)e=\\~\u00138a5Z{Iul,V;O>c8Zg\u0013\u0012_9QqX)h.\fQ";
        f5673[105] = "\n>Hr5o\u0016$J./{\u0006'\u0001?+s\u0000\"[r&j\fbJ*\"t\u0011?\u0001.\"t\u0001)]r\u0002l\u0000\"[\u000e\"t\u0001)]o\u0003";
        f5673[106] = "\u0001\f<Sg\u0016\u001f\u0004&\u001c\u0004\u0002\u001bI\u000f\\=\u0011\u0012";
        f5673[107] = "w9\fY2tk#\u000e\u0005(`{ E\u0014/s}e\u001e\u0003)mke&\u00164iM?\u0002\u001b3";
        f5673[108] = "&M/0Kq:W-lQe*Tf}Um,Q<0Xt \u0011-h\\j=Lfl\\j-Z:0|r,Q<L\\j-Z:";
        f5673[109] = "pz]4\u001f\npzJh\u0013\u0005j1Jv\u0013\u0010m@\u001d/JT";
        f5673[110] = "\u001a\u0002l+\u001b(\u0006\u0018nw\u0001<\u0016\u001b%f\u00054\u0010\u001e\u007f+\b-\u001c^y`\u00079\u0010\u0002%L;8\u001b\u0014nw\f/";
        f5673[111] = "S|2_8<Of0\u0003\"(_e{\u01bd";
        f5673[112] = "D\u000bW<\u0018}D\u000b@`\u0014r^@@~\u0014gY1\u0011&F";
        f5673[113] = "*OJp\u001f\u0000*O],\u0013\u000f0\u0004]2\u0013\u001a7u\fmK";
        f5673[114] = "%5rj]&9/p6G2),;\u013e";
        f5673[115] = "ALoxb\u000fALx$n\u0000[\u0007x:n\u0015\\v)e7T";
        f5673[116] = "\u0018\u0019\u0012h\u00132\u0004\u0003\u00104\t&\u0014\u0000[\u03bd";
        f5673[117] = "DU1\u00177<XO3K-(HLxZ) NI\"\u0017$9B\t#M,%X\t\u0015Q$=~S?U6";
        f5673[118] = "xVi5\b\n=X#1\u0006m\u02e95&>\u0005SqJd6\u0002\u0016A";
        f5673[119] = "SK]u\u00031\u0004\nX8KJ\u000bNO2R6\rH\"qIsZ\f\u001d$Q.\u0018\t\"";
        f5673[120] = "V5'\"|>\u0003<8u`E\u0003`%\u0016h#\u0000`#!\u007fEV52%|=\u0016d47kE";
        f5673[121] = "e\u0016s!3\u000ec\u000e3b\u0003\u0572\\I($z\u001f#\u0010#~8";
        f5673[122] = "\u0003ts4\u0015_\u001etlo(P\u001d(ervW\u001d2a\u000eS\u0006A?m`J[\u00024\f";
        f5673[123] = "}\u0002 :\u007f\f{\u001a`yO\u03c0DZs:r\u0017)],a/vz\u0011l>\u007f\t8\u0019k{O";
        f5673[124] = "{\u0005%S\\gr@$X\u0014],_(^\t\n{\u0004t\u0005\\]{\u0005%S\\gr@$X\u0014";
        f5673[125] = "QQ\u0002{\u001bb\u0005\u001a\u0000u\u000f\u000e\u0004\u0005\u001bY\u000e\u007fk\u0003Z}ZwQ\u0002\u0007 ]\u000e";
        f5673[126] = "]O\u0017\u0012\u0015!\u0014\u0002\u0011\u0000\f[<7&\"pb[\u001a\u0011\u001b\n+\u0016\u001c\u0003\u0002";
        f5673[127] = "g\nao*{0\u0004t4r\u001d5\u0000ick\u001de\u0001np)s5X;t\u0011";
        f5673[128] = "T\u0000[h \u0004\u0003A^%h\u007f\u0017\u0014A2f\u0012,\u0017$lb\u0018\u0013\u0014B,\"\u0002\u0001\u0015$ki\u0003SI[)a\u0004\u0016y";
        f5673[129] = "rd,@@\\t|l\u0003p\u04b2Km~\u001a\u001aC7|d\u0003M";
        f5673[130] = "\b8DY\u0013\u0004\t#\u0003]p\u001f\u0017\"%L\u0014\u0003\u001c^BIH\f\u001e7A[@\u0001q";
        f5673[131] = "\u0001<\u0012)*:\u00104\u001cs\u0013/\u0014%,'w=\u0014\u0003=\u0004\u0013y\u0015a\u0000!zz\u0007i\rN";
        f5673[132] = "\tqVZ\u0000\u0001SwN\u0018|\u0014YvMD\u0010&\u000e6\u001d\u0019Lq\n{Q\u001dL\u000eHsVX|";
        f5673[133] = "1L\u001b&3,kJ\u0003dO9aK\u00008#\u000b2\u000f\\`Oe4WPdv6kE\f O";
        f5673[134] = "ss\n#r~ukJ`B\u01efJ~Wz)|tzB\u007f+";
        f5673[135] = "oan:0L?e;a\rKkw1lay<:k3\r\u0017{:`nl\u001e6ilt\r";
        f5673[136] = "?G9\u0018em8H<H2ViT,\u007f1=eT,'ajoWlU$8i\b9'";
        f5673[137] = "\u0001I2\u0001Uj\u0000\u0010f\u000e\u0011\nWGu{Km[p`NGcCV\tTNjROuETs\u0005*0P\u0013fR\u0013dC]6\u0004*";
        f5673[138] = "\u0017\u0000M\u0007\u001a\f\u0011\u0018\rD*\u01af.\\\fA\u0014FQ\u001e\u0004FQ";
        f5673[139] = "=R_\u0015vc;J\u001fVF\u019f\u0004SUL,%9[\u000f\u0010?";
        f5673[140] = "rP+\u0016Ldu\u000fpK-l%OqLA^r\r+\u0012\u0010\tvBm\u0015\u001dv4JjP-";
        f5673[141] = "\u0014%\u001bQ\u0003h\u0012=[\u00123\u0409-,I\u000bYwQ=S\u0012\u000e\u0012\u0014v@\u000e^jNzP\t\u0003\u0012\u0014+\u0013\u0019\\{\u00179\u001b\u00143)H-QS]y\u0011xUk";
        f5673[142] = "yv,S\u001d\u0013?zf\u001fl\u0006-\u0011l\u0002\\\u001c|q1\u000e\u0013\u0019";
        f5673[143] = "Ta]:\u0010NRy\u001dy \u0114m>\u0006?Y_\u0012g\re\u001b";
        f5673[144] = "'\u001b\u0003~BDtD\u0011\"\u0006}{N\u001f.\u001e\u0011I\u0018ZsFA\u001e\u001a\u001d<\u001a\u001ezD\u0012(\u0012G\u001e\u001d\u00122GMa_\u001a5\u0002}";
        f5673[145] = "/\u0006%]\b8)V.\u000e\u0002A\u01277n\u0010\u0016(}E3QV0)";
        f5673[146] = "dt/ouz;kmb6A ay6w,\u0007~i6w :\u007f\u0015fd~1s,2w0a%\u0015$3y-x{=n:&\u0019.:a;ew~c4?]";
        f5673[147] = "]i}uO\u001f[q=6\u007f\u041fd2!w\r\n\r13\u007f\u0000";
        f5673[148] = "2M>l\u0007\u001e5\u001e|em\u03d8WFk;\u0001\f/A8y\b";
        f5673[149] = "\u001f?k\u007fkx\u0003m7qQ'\u0018+0w-I\u001f?k\u007fkx\u0003m7qQpB*i~)uC>dfQ)\u0011o4$`5C3:\u001e";
        f5673[150] = "\u0013S\u0001..OZ\u0006\u0000-:vE[@\u0003\u0012-*M\u0004g:\u0017DTY$1v";
        f5673[151] = "8q/rh19l3(~\u000b{{,|k\u000b:s=k/ej*ho\u0017";
        f5673[152] = ")-\u000f\u001cSV/5O_cB\u0010$]F\tIl5G_^";
        f5673[153] = "R\u0018b}~v\u0005\u0016w&&\u0010\u0011\u001bb\u007f;}k\u001d:\u007f|iQ\u001cg\"{\u0010\u0000K`!<*\u0001\u0016=&E";
        f5673[154] = "+\u000fn*M(}Jnj/,|\u000fI7T+k\u0014t\u0002U0~\th!TWjK=*N9s\u0016~!/lt\u0019\u007fbA<-L{Z";
        f5673[155] = """
                     :^pQ\f\u000f'^o
                     1\u0010)\u0001r\u0006v\u0000@\u001e7SA\u000f.\u0007j\u0010Jn:^pQ\f\u000f'^o
                     1""";
        f5673[156] = "'ARb\u0015|!Y\u0012!%\u0243\u001e\u001e\tg\\maG\u0002=\u001e";
        f5673[157] = "!uq\u0005\r\u0005'm1F=¡\u0018,$UGGv|}\u0000C\u007f";
        f5673[158] = "xQAv(?~I\u00015\u0018\u03faA\n\u0013|\"u;\f\u000b<a";
        f5673[159] = "X\u0004mS/k\u0005\b\"V\u0015e\t\b9@B2W[`,/5\u000f_f\u0015dh\u0005\u001a?";
        f5673[160] = "gjUavQ.'Sso+9/SluB:U\u0006a+Y1<\u0005s#T^";
        f5673[161] = "i2U;e034My\u0019.5$J.N{eu\u0012B {%/\\%)>-uE";
        f5673[162] = "c5?S\u0011\u0019$7{]\u000ep4+(X\u001d'jtu\fqI$8&_\u0015\u0017+,.\u0006";
        f5673[163] = "\u001fF-r\u001fI\u0019^m1/\u03ca&\u0019vwVXY@}-\u0014";
        f5673[164] = "9r\u0011f\u001f5?jQ%/\u0411\u0000hD<HvzyL2\u0012";
        f5673[165] = "\u0005)vE@\n\u0001#d\fZx\u026bR.\u001f\u001eE]?)@E\u0018<";
        f5673[166] = "L9\u001f\u0015aVJ!_VQ\u03adubAJ4\u0017\u00135O_oO";
        f5673[167] = "U\u0000v5\u0007A\u000f\u0006nw{T\u0005\u0007m+\u0017fSD<tK1Q\u0007<4\u0001\\\u0015\t4)\u00011";
        f5673[168] = "T\u001a[Pj\u0006R\u0005\u001b[\u0012N+\u001cXC{\u001aO\u001aG\u0003p";
        f5673[169] = ":[r\u0017$~cP(UOfa{-\u0007)nj0=\np<\u007fSp\u0014v>\u0007\r&Q6jxT-\u000bt\u0001";
        f5673[170] = "ls&p6\u00048>hl&=<\"7\u007f =lt?},Cns)z{=m*2d~S=sg`F";
        f5673[171] = "H\u0002 \u0015u*\u001cOn\te\u0013\u001fX2{>v\u0018Df\u0015n/M@^";
        f5673[172] = "qH(-O51Mi*YH-X%tX$\u001f\tc,\u0000yH\f5,M'!\u000f'$@H";
        f5673[173] = "_Hyx5\u0015\u0000\tp-vk\u03f8q{rqV\u0007\u001c|-*\u000bfH-)9\u0004\u000fK?!4k";
        f5673[174] = "\u001a?S\u0014|(M0W\u001cp\u0014L#N)`}L#2K#~O+H\u0002nx]22";
        f5673[175] = "?R|-\u0003\u000b6\u0017}&K1h\bq Vf?S-{\u00011?R|-\u0003\u000b6\u0017}&K";
        f5673[176] = "8\u001eHpen<TN`\u0015\u001f\u000fb:V\u0015=d\u0010\u0017`+9.\u0016\u0007";
        f5673[177] = "h\u0003 -Y~3\u00017\u0016Un4\b+A\u00042eQG/W7+\u0003.,E?&";
        f5673[178] = "xM&*+ziSd#\u0016)\nFc&&{6W}d/";
        f5673[179] = "iv@?\u00181 aPh\u001e]1eRuN!7c?6Ud`'\u0000cM9\"\"?";
        f5673[180] = "!q\"~\u0000\ra $l\u0017u`$5[\u0014\rg)\u0015z\u0002\t\u001bw8kGEd50l\u0002u ,#mA\u001bpuviy";
        f5673[181] = "]OC34,LUZdQ>W@G5\u0006i\u000e\u001c\u0013aQ;TMI<-*NT\u001e";
        f5673[182] = "<rz\u007f_\u0002:j:<o\u0161\u0005\u007f'&\u0004\u0000;{2#\u0006";
        f5673[183] = "fZvVZ60\u001fv\u00168&1ZQKC5&AljU-5W\u001d\u001fTq.It\u001cFy#&";
        f5673[184] = "\u0015b_\u0013*y\\uOD,\u0015MvmFmi]\r\u001eRi+\u001cr\\Znn,";
        f5673[185] = ">h\u00029\u0000\"j{LiV\u001bbjA5\rwP>\u0002jZ \u0007>P.\u0011r6wLi\u0015z\u0007";
        f5673[186] = " ~UxT\u001epuP*\u001dcb#\u0017\bO\u0005r#\u000f'K\u000f\u0019p\u001a?\u0018Sf2\u00128]c\"+\u00019\u001e\rrrT=&";
        f5673[187] = "\n\u0012\r\u0005MP\f\nMF}\u02ba3MV\u0000\u0004AL\u0014]ZF";
        f5673[188] = "\u001c\u0006]TH\u0004UK[FQ~}cz8\u0014AOURB]\fIGK";
        f5673[189] = "\u0018<<IVxX9}N@\u0005D,1\u0010AivxwK\u0018?!*/\u0010L`];5\t\u001b\u0005";
        f5673[190] = "am*\bMC56\"\u001eU'\u039cQ1\fGM>- \u0016^\u001a[hk\u0005BJ#2g\u0015E\u0017[kdUIU>/`\u0014KA[";
        f5673[191] = "g\u007f.8N!7x<a^\u00192)9\u0018]e'%5\u0006Hp6'Eg\u000f~>.;e\bh9yE";
        f5673[192] = "L(\u0013P<ZJ0S\u0013\f\u03c3u!A\nfE\t0[\u00131 L{H\u000faX\u0016wX\b< L&\u001b\u0018cIO4\u0013\u0015\f\u001b\u0010 YRbKIu]j";
        f5673[193] = "(SB\u0006Lw.K\u0002E|\u0493\u0011\f\u0019\u0003\u0005fnU\u0012YG";
        f5673[194] = "]yU9R\u0007RxZu\"\u0019SmW\u007f^\u000eDY[x^\u0002XmM\u0004^\u0001TgF8\\\f\u0006}6?G\tD:Xo\u001e\\@\u0002";
        f5673[195] = "\u0017z\u0019z@\u0017\u0011bY9p\u0122.sK \u001a\bRbQ9Mm\u0017w\u0016,\u001aTCdX|Lm";
        f5673[196] = "h=O\u0013A\u0010on\r\u001a+\u023a\r5O\u0019NWwk\u0013\u001aDh";
        f5673[197] = "st\u0012\rC\f.?\u0017I\u0003=\"*\u001dR\u0003=2vLG\u001aS++\u000fL{Fqv\u0004V\u0015_,5\u000f7\u0000\u0005q>\u0015Y\u0019X25tLC\u00059/\u001aU\u001eF2N";
        f5673[198] = """
                     P\u0015.Q	(RK9
                     L\u0010\u022f%)V\u0012z\u000fY8L\u000b-j\u001b3HL \u0015Y;O	\u0010TT>
                     Bo\u0016\\9Orn\u0018\u0014\u007fN\u001cz\u0003\u001d?4K\u007fUI(
\u001fl\u001b\u0019~4""";
        f5673[199] = "\u001abYNj=Z3_\\}EL [XY\"PZYEs/E&H_jx dC[-u_&K\\hE\u001e+N\u0019#:\\#I\\\u0013|Lb@Hz\u007f^jM'( J \nIxy\u001f$2";
        f5673[200] = ")\u001cj+.jiMl99\u0012hI}\u00066t~{`.+r\u0013_9z's}Fd9,\u0012(Ak8o|x\u0018><W";
        f5673[201] = ">(\fj)g80L)\u0019f\u0007tM,'-x6E+b";
        f5673[202] = "v\u000b!gutp\u0013a$E\u0296OP}e7a&Som:";
        f5673[203] = "~l\u0014T\u0007?xtT\u00177\u02ebG7HVE*.4Z^H";
        f5673[204] = "\r\\#x^|RCau\u001dG\u03ef1bp\u00187U_{-[<";
        f5673[205] = "\f&?W[\u0003\u000146Kb[\u001b\u00143X\r^\r$T\t\u0013F^x+K\u001bA\u001bH";
        f5673[206] = "kYx\u001b-!\"E?\u001f%\u0010<Un\u0004(Gk\u000f8[D)?Ox\tu`#\b|\u0001";
        f5673[207] = "\u001e7>M\u0013Q\u0018/~\u000e#\u0156'4`LXEB8a\u001eE";
        f5673[208] = "%%\r\u001c\u001f!/-\u0014Pdp]?\u0005\u001e\u0005fl#WB\u000b\\=1UA^m!c\tOd";
        f5673[209] = "\u0005p_\u0018vc^*T\u001e`RG|YGi><j\n\u0018\u007f3RsW[tR\u0005v[\u001ap0R I\u00194R";
        f5673[210] = "7k\u000b[\u0015'jgD^/)fg_Hx~84\u0002$F-8;\u0006F\u0016)m`";
        f5673[211] = ",%$1Z\u000e(o\"!*j\fX\u001b<\u001b\u000f!d%8Q\t1";
        f5673[212] = "q,`o#)*vki5\u0018&,w,&V,*d+Zcpu}64z-6vW";
        f5673[213] = "g=\u0013\f\u0014\u0015a%SO$\u010d^>M\r_\u0001;2L_B";
        f5673[214] = "\u001d.\u001b\"\u0011\u0002\u001aq@\u007fp\nJ1Ax\u001c8\u001ds\u001b'Lo\u001e6L#\u001d\u0002H3\u001eg\u000eo";
        f5673[215] = "\u0017)\u001dI|I@-UI>$\u00e2\u0016\u0017\u0000mDRu@NcVU\u0016V\b?TLxOU|_-";
        f5673[216] = "\u001dPciwWBO!d4l\u020a=\"a1\u001cES;<r\u0017";
        f5673[217] = "y7/'pR)4(!\u0012Q\u007ffL!xc~vk=tWh\nk>x]c6i3*G\u00131r6h\u0000}a+cl8";
        f5673[218] = "MhM%=\u000f\u0012w\u000f(~4\u001bh\u000bQ$S\u0017_\u001ed(]\u000fyw~!T\u001e`\u000bo;MI\u0005Nz|X\u001e<\u001ai2\bH\u0005";
        f5673[219] = "\u0003c?/CB\u0005{\u007fls\u00d1:z7-\u0003YTcjn\b";
        f5673[220] = "<\u0017crO\u0015-Ryw5;\u00076V\u00075\u0018;\u001d+1D\t~\u0007.";
        f5673[221] = "\u0012,\u001e\u001eLdH*\u0006\\0zN:\u0001\u000bg+\u0013fUg\t-_+\u0003\u0006Tu@f\u0014";
        f5673[222] = "A&L\u0003m\u0005\u0003/JDax\u0013\"ND}xC#CE(\u0016\u0013z\u0016A\u0010";
        f5673[223] = "\u001b\nX9}/L\u0004Mb%IO\u0002A&7\u0012O\u0018=e?6\u001f\\F2~3R\u0014=";
        f5673[224] = "\u0006fr~\u000e+\u000f#suF\u0011Q<\u007fs[F\u0006g#)\u0007\u0011\u0006fr~\u000e+\u000f#suF";
        f5673[225] = "\u0000C2>e\bIT\"icdAK)j\u0014\u0005CW1\u000e1Y^\u0015440\u0004\u0003\u0012M";
        f5673[226] = "\u00147\u000b4\r'O4I`\u000fKHf\u0005i\u0018'z;B3GKFi\u0019c\u001a7Ws\u00004\u007fqN1Dh\u0012v\u0011j\u0019\t";
        f5673[227] = "aK-@\u0003\u0000gSm\u00033\u03a3X\u0010z\u0002P\u0005b\u0011g\u001e\n\u0013";
        f5673[228] = "}\rH\u000b\u0001;sXHDz#d\nL]\u0013 \u001e_A\u0003\b+w\\S\u000b\u0005D";
        f5673[229] = "Oba<eMN\u007f}fsw\u000elb$w\u001bv{kn'\r\u0018opggwHtea*\b\n|b$\u001a";
        f5673[230] = "I\u0002\r~$6\t\u0007Ly2K\u0015\u0012\u0000'3''FF|jppFG'=rJO\u0002&6:p";
        f5673[231] = "4MGXe\u00192U\u0007\u001bU\u044a\rB\u0010\u0007j\u0006k^\t\u0002.";
        f5673[232] = "R?5LGd\fc6Fx\u02294u0R\u0012\u007f\nm+Q@\u001eF53H\u001efIg6Px%Qn)\u0011\u0016u\b;-)";
        f5673[233] = "YF(\u000e#\u001bHXj\u0007\u001ej+Mm\u0002.\u001a\u0017\\s@'";
        f5673[234] = ";d\u001c-\u0014\u0013d%\u0015xWm\u025e]\u0019/U\u0014i\"@$\u000fV";
        f5673[235] = "p%}`\u0011$v==#!\u0396I~\"eM4p*1+\u001dbI}.`\u001c?$zq;A^w61d\u0011!5>6!!";
        f5673[236] = "^\u000b\u001ff.\u0012\u0005\b]2,~\u0002Z\u0011;;\u00120\u0007Pca~^R\u00107;\u0007\u001cX\u000e8e~\fU\r19\u0002\u001dO\u0014f\\@\u0016KSk#\u0002\u001eL\u0016[";
        f5673[237] = """
                     \u00045\u0000([o\u0003j[u:gS*ZrVU\u0004i
                     (\u0000\u0002\u0007-W)WoQ(\u0005mD\u0002\u0000'F+
                     }B/An:""";
        f5673[238] = "\u0004-a\u0003\u0000gT88\u000fG\u001d\u045aU:J\u0007{\u0005/:\rBf\u0002U=C\u0004#\r*\u007fK\u0003f=";
        f5673[239] = "?uN\u0013w\u00129m\u000ePG\u0138\u0006*\u0015\u0016>\u0003ys\u001eL|";
        f5673[240] = "Wh[q1\u0017DxZ<\u0001\u0012Dxqm{\u0003D~q|h\u0001D\u0004\u0013e<\fM=Z0=\u000fY\u0004";
        f5673[241] = "\u0019&%3n}\u001d3 1\u0016\u0083vr=5*.\u001b$8gn=vu7$(s\t7?#mC";
        f5673[242] = "]\u0005'B+z[\u001dg\u0001\u001b\u00e6dZ|Gbk\u001b\u0003w\u001d ";
        f5673[243] = "J9|-zJMf'p\u001bB\u001d&&wwpJd\u007f.&'I?;||^\u000b5%s\"'I<~ttG\u0012g$ne'\u001b8&z~[\n\"?-\u001b\\Hb6quE\u0015!=\u0010";
        f5673[244] = ">\u001f`?\u0011Yi\u0011udI?d\u001ct\u0001GC\u0007H|%\u0017\u0007|\u001f= ZO\u0007";
        f5673[245] = "3ky\u000fJ\u0002mjv\u0004$B\\ri\\ETmn;\u0000Kn<|9\u0003\u001e_ .e\r$";
        f5673[246] = """
                     i"6~:&o:v=
                     \u0211P+d$`9,:~=7\\iqm!g$3}}&:\\i,>6e5j>6;
                     g5*||d7l\u007fxD""";
        f5673[247] = "*)\u0006=+uc>\u0016j-\u0019x\"\u0014dn\u0019(#\u0013w,wxzFs\u0014";
        f5673[248] = "L/\u001b\u0013uG\u0011#T\u0016OI\u001d#O\u0000\u0018\u001eB~\u0014lv\u001b\u000esY\u0000-\u0018L'[";
        f5673[249] = "9\u0010`${7?\b gK\u03ac\u0000O;!2&\u007f\u00160{p";
        f5673[250] = "\u0010_\u0013\u0017:a\u001c^A\nTk\u001cMd\r/|\u0015XY2=`\f\\(\f::\u0010\u000b\u0019\u0010hf\u001e1";
        f5673[251] = "uF\t'D3s^Idt\u0499L\u001eZ'I(!\u0019\u0005|\u0014IuH\u0001o\u001b vZ\tbt";
        f5673[252] = "WxGhIj\u0017}\u0006o_\u0017\u000bhJ1^{9<\fj\u0007/n<\u0007:\\z\u0016f\u000b*['n";
        f5673[253] = "<\u000f\u0004q\u007fV2U\u0000q\u0013n^\\[eiH,R\u0001ai";
        f5673[254] = "\u001a=;\u0010?f\u001c%{S\u000f\u04ac#b`\u0015vw\\;kO4";
        f5673[255] = "V3cL\u0001\u0002Xfc\u0003z05;m\u0019J\u0006J58\u0019\u0005";
        f5673[256] = ")^b{\ta/F\"89f\u0010\u00019~@poX2$\u0002";
        f5673[257] = "Nc<QL\nH{|\u0012|\u010dwjn\u000b\u0016\u0015\u000b{t\u0012Ap";
        f5673[258] = "zi\tSY\u0011.\"\u000b]M}/=\u0010lH\u0019==lY\u001c\u001ay)VXAG~P";
        f5673[259] = "g[l=mAtKmp]DtKG+!BeVz*\u0018B\u007f^r!'+ T&r$K!\rr}`+";
        f5673[260] = "\u0019\u0019m\u000629I\u0012hT{DAR\u0018T&/MM7P,D\u001eX/\u0003p;\\P(F@";
        f5673[261] = "E\u0012\u00014\u001b\u0005C\nAw+\u04d8|I[1I@\u0012\u0015\u000brD\u0005";
        f5673[262] = "\u0005p*\u00047$\u0001}8\u0019cXBr\"\u000b`\u001fR\u001b\u007f\u001c2:\u0003u#Lq7F\u001b\u007f\u001da*\u0006g{\u0010s7R\u001b";
        f5673[263] = "C\rEL \u0016BT\u0011Cdv\u0007\u0016\u0012\u001b%\u001b \t\u0002\u001b%\u0017\u001d\b~K6I\u0016\u0004G\u001f%\u0007FR~\taN\n\u000f\u0010\u0010<\r\u0001nE\u00173\fB\u0000\u0015Nf\bz";
        f5673[264] = "!\u0014Z\u0010#/t\f\u0007R&\u0010x\u000f\u0018fp`df]Qa.(\u0019\u001fYfk\u0018";
        f5673[265] = "L%\u0012\u0003[$\u0016#\nA'1\u001c\"\t\u001dK\u0003LcVG\u001bT\u000f,XG]:\u001b7Q\u0007'";
        f5673[266] = "v\u0001M&\u0006[p\u0019\re6\u048dO^\u0016#OJ0\u0007\u001dy\r";
        f5673[267] = "kW )\u0003\u001b>O}k\u0006$4Hie=OoB `\u0007N2\u001f'\u0019";
        f5673[268] = "\"A\u0006\u0016\u000b\u0001yBDB\tm~\u0010\bK\u001e\u0001LFM\u0015AU\u001bD\u0018\u0013\u000b\u0002rG\n\u001b\u0006m";
        f5673[269] = "\u001cE|\u007f(9O\u001an#l\u0000@\u0010`/tlrB-t-\u0000\u001c\u0011$=|i\u001f\u0003,0\u0013";
        f5673[270] = "1*/t{\u007fu+\u007f|D\u024b\rks56}dha=;\u0012";
        f5673[271] = "(\u001d\u0018d\u0006z.\u0005X'6\u054e\u0011\u0007M>Q9k\u0016E0\u000b";
        f5673[272] = "\u000b-KP%\u0001@j^\u001d|h[\u0013YB\u007f\u0002WoHXfU2";
        f5673[273] = "VITU\fxPQ\u0014\u0016<\u0286o\u0016\u000fPEi\u0010O\u0004\n\u0007";
        f5673[274] = "stvh7\u001ft+-5V\u0017$k,2:%s)vljrpqt19\u0012+*.+(r\"u,?3\u000e3o5hV\tq/<48\u0010,l7U";
        f5673[275] = ">\u0001G+!<{\u000f\r//[\u027fb\u000f2!!v\u0005J<k%x";
        f5673[276] = " J`CsUtY.\u0013%l|H#O~\u0000N\u001c`\u0010)T\u0019\u001cnD|\u0001aFbT{\\\u0019";
        f5673[277] = "[h\u0005,[\u000bZsB(8\u000fKjG=\u007f\u001f\"7VhJ\u001eK4D`Gq[h\u0005,[\u000bZsB(8";
        f5673[278] = "\u00021\u0004S18\u0004)D\u0010\u0001\u04f8;2ZRz,^>[\u0000g";
        f5673[279] = "KQ}SR\u0006\u001bRzU0\u0003L\u0010\u001bAT\u0011Ll.\u0015WUXV/H\nR!";
        f5673[280] = "\"dv\u0019_+$|6Zo\u0403\u001b?)\\_nwv>L\bh";
        f5673[281] = "{\u001ek\u007f\u001f\u001b9\u0017m8\u0013f'\u0013r#\u0005\n\u0015B7rYYBGn&^\u001b?\u0005g \u0019\u0017B";
        f5673[282] = "kr\\\tvf8-NU2_<+Q]!\bbr\u0007\u0006Mfj*\f\u0002t558PF";
        f5673[283] = "Hx+S\r\u001fHwuXP\"\u001e%5e@K\u001e%I\u0007\u0003H\u001d-3NNN\u000f4I";
        f5673[284] = "B?G{\u001dc\\x[}x[\u007f\u0018xK>QtC_~\u001bc\\:A9\u0007e";
        f5673[285] = "z^iqD^3Gm5\u0000#\"Ykl\u001dN\fRiA\u001aD(\\Nw\u0017_.gof\u0012B(Ctl\u0018c*Yyo\u0013YC\u0006unB^>D|h\u0005RC";
        f5673[286] = "\\\u001f\u0019\bYD\u0017X\fE\u0000-\u020b!YI\bH\bY\u0003E\u0018OU!";
        f5673[287] = "#\u001a\u0005\u001am?u_\u0005Z\u000f!\u007f\u0018\t\tb\r\u007f\u001d\u0013\u0010b\u0000p\u001d5\u0007i<R\u000f\u0014\u0010n-u'\u0012\u0007j@\"\u0003\u0004\u00107.rZQ\u0014\u000f";
        f5673[288] = "\u0003\u0019d\\-\u0016\u0005\u0001$\u001f\u001d\u055d:F?Yd\u0007E\u001f4\u0003&";
        f5673[289] = """
                     \u001bztn
                     #\r;no7c\u001cms+Ov\u001cis;F\u001f\u000b5*0G!\u000f\u007f, 7&
                     <g?^%\u00184jPZ.Yden^d_t\u0015""";
        f5673[290] = "sPP,!.uH\u0010o\u0011\u0536J\u000f\u000b)h?5V\u0000s*";
        f5673[291] = "\u0017\u007fWMj$\u0004oV\u0000Z!\u0004om[< \b|~U&.iuWW33\u001buWF!N";
        f5673[292] = "PN\\Abc\u000bM\u001e\u0015`\u000f\f\u001fR\u001cwc>H\u0014G,0i\u0019L\u001czj\u0015\bV\u0005-\u000fW\u0003RB p\u0015\u000bU\u0007\u0010";
        f5673[293] = "IX\u0016#9G\u001c\u0004\u0007j_\u0010\u0010X\u0003\u007f6\u001c)V\u0003o2zIN\u001b,o\u0005\u000bF\u001ci_";
        f5673[294] = "ri\u0013Lh\u007ftqS\u000fX\u0531K6HI!n4oC\u0013c";
        f5673[295] = "3>,\u0006|dc9>_l\\fh;;o&ud.\u0007Z=bf<c}d1u&\rd9r~G";
        f5673[296] = "c/#A`$e0cJ\u0018'f:8Nq$\u001co5\u0010j/ul'\u0018g@";
        f5673[297] = "ii\u0019(0WoqYk\u0000\u0253P6B-yF/oIw;";
        f5673[298] = "\u0005\u00055K\\\bPY$\u0002:KR\u00069\u0017}[;\\5\u0006\u0004\u0005D\u001e=\u0001A5\u0005\u00055K\\\bPY$\u0002:";
        f5673[299] = "rA\u0018\u0019vgtYXZF\u0272KHJC,x7YPZ{";
        f5673[300] = "d\u0003zin!;Bs<-_\u044e:{9(6#D$x!c`";
        f5673[301] = "{_W\u0013$>!YOQX++XL\r4\u0019|\u001d\u0013RaN\u007fX\u001d\u0012\"#;V\u0015\u000f\"N-FL\u0000=2<\\UWXw;\u0015\u001d\u000f9~vF\u0011\u0015Xp7X\u0012Z'2?_Wj";
        f5673[302] = "w\u0011f2\u0006n'R>2I\u0017\u038fch`X}+\u001fyzA*NZo:Jx'Y}2G\u0017w\u000f;pW~t\u001d3}8i<R>xV}'[~\u0002\u0006f2]3}Dn5\u0018\u0003<IkpS|~Al5c=sD)~\u001c\u007f{ClN\u00012lB{<\u000fhhB\u0017t[hkAo4\nnyV\u0017u\u0006ix\u0000y%_<|8";
        f5673[303] = "b\u00177S&o~\u000e2\u0017Crb\f\f\r8he\u00116\r?x\u000f\u001e7\r>ps\u0016*\u00101\tb\u00177S&o~\u000e2\u0017C";
        f5673[304] = "0dg4\u0003!jb\u007fv\u007f4`c|*\u0013\u00062$'r\u007fo|c\"}\u0000-tdgM";
        f5673[305] = "chEnvsep\u0005-F\u01a6Z7\u001ek?b%n\u00151}";
        f5673[306] = "O/,R~-\u0018!9\t&K\u0019,57.v\u0011x0\r/+L\u007fI\\x,O8s]%qHA";
        f5673[307] = "{TSfQ\u0015r\u0011Rm\u0019/%\u0015_n\u000eF&o\ncP]-\u0006\tqXPB";
        f5673[308] = "\u000e<\u000b(\u001epT:\u0013jbe^;\u00106\u000eW\b~MmR\u0000\u0002(\u0017j\u0000qY*\u0000Q";
        f5673[309] = "[x\u0011bQ>]`Q!a-b+@%\u0004&\u0000{H7YDS{\\=\u0003&\u0003sN`a";
        f5673[310] = """
                     3\u0014\u000b5V\u000flU\u0002`\u0015q\u01e0-
                     dHA1\u0014Y;Z\u001du-	?\u0012Lk@\u000e`I\u0011
                     V\u000bdX\u0010dOV'Sq""";
        f5673[311] = "\u0016\u0004a9cBT\rg~o?J\txeySxX=4\"\u0005/]h=lPF^z5a?";
        f5673[312] = "Bz\"y\u000b\u0001\u001f1'=K0\u0019&8.IH\u001f$-?^0\u00062u~I^\u0012)|>3N\nqy9]Z\u0011x9CMBI}>-YY@=D=A\u0001E:*)Z\b\u0005@";
        f5673[313] = """
                     \f\u001cJ"Rs
                     \u0004
                     ab\u01245C\u0011'\u001bbJ\u001a\u001a}Y""";
        f5673[314] = """
                     \u0006%\u001b )\u000fP`\u001b`K\u000bQ%1+\u0007\u001dG%
                     7:\u0011Z6pn:\f\u0002i\u000f,2\u000bGYK5!
                     \u00047\u001blt\u000e<""";
        f5673[315] = "G`,#x@Axl`H\u018c~?w&1Q\u0001f||s";
        f5673[316] = "i2&\u0010Hn4j9]_\u000f5f*\fIc\u00074hU\u0017\u000fign\u001eAfjuf\u0013.6j4f\\\u001e~=kn\u0007.";
        f5673[317] = "^\u0016oP4#X\u000e/\u0013\u0004\u04c6g\u001f=\nn<\u001b\u000e'\u00139";
        f5673[318] = "\u0007 /[3*W$z\u0000\u000e-\u00036p\rb\u001fT{*Q\u000ev\u001f6.Zq4\u00171kj";
        f5673[319] = "%:\r\u00062V);_\u001b\\H)(h\u001c'R.5R\u001c BD:S\u001c!J82N\u0001.3%:\r\u00062V);_\u001b\\";
        f5673[320] = "\u0019\u0005\bT\b-P\u0012\u0018\u0003\u000eAI\u0006\u001bd\\|GS\u000e^]!\u001aTwZF=\u001eZ\b\u0018N:[j";
        f5673[321] = "N\u0007\b#a4\u0015]\u0003%w\u0005\u0019\u0007\u001f`d\u0005\f^]kyk\u0015\u0003\u001e`\u0018<\u0010\u000f_dzkF\u001d\\ \u0018";
        f5673[322] = "(fU\u001b\\^9|LL9O:y\\\u0015B\"(9RH@\u0018)d\u000fO9\u001c2x\u000bAF^:\u007fNq";
        f5673[323] = "P\u0017FZw\u001aQN\u0012U3z\b\u000f9\u0003i\u0019\b\u0012\u0012-rz\u0002\u0016\u001d\u000ek\u0006\u0013\f\u0004Y\u000eD\u0018\bCTq\u0006\u0010\u000f\u0006d";
        f5673[324] = "fg'?cQ6rye]Epv:\\9YsdB>1\u0006}p+=#\u000ep\u001f{keL`vxymA\u000f$'m'\u0006at~8#>";
        f5673[325] = "Y2\u0012\u00039a_*R@\t\u0522`mI\u0006pp\u001f4B\\2";
        f5673[326] = ">|\\\nD'8d\u001cIt\u03c1\u0007}VS\u001ea:u\f\u000f\r";
        f5673[327] = "\u0002+$oVT\u0002+5}+Z\u0003\u0014.bF&\u0003*.?[\u0017\u0019;!|+";
        f5673[328] = "*Ak,\u0005q;[r{`h,_k!\fZx\u001b1x\\\rxO34\u000fd{];9`";
        f5673[329] = "j=1P +>.\u007f\u0000v\u00126?r\\-~\u0004k1\u0003u-S9l\\ w/(vEw\u0012";
        f5673[330] = "u%!G.\u001a2$;Wz'!0!L/\\L\"aBr^v#<\u001fu''t;\u001c2\u001d&)f\u001bK\u0019=5b\u00154[52'%";
        f5673[331] = "\u0001\fO+\u0006QH\u001b_|\u0000=B\u000eU|GP8\b\r|\u0000D\u0002\tP!\u0007=\u0006\u0012L%\tBD\u001aK`9";
        f5673[332] = "%})\u001dW\u0018a|y\u0015h\u0515\u0019<u\\\u001a\u001ap?gT\u0017u";
        f5673[333] = "ET\b\u0010A#CLHSq±|\u000bS\u0015\b2\u0003RXOJ";
        f5673[334] = ">T\u001aGzAv\u0003EO!qb\u0003Y\u0017-\u001dPQ\u001bHuq>VEGqHm\tW\u001b5q";
        f5673[335] = "+o9pwe:u '\u0012|-q9}~Ny5a$(\u0019+o9pwe:u '\u0012";
        f5673[336] = """
                     F\u0001G\u001bP%\u001f
                     \u001dY;!\u0016\u0016&\u0003@;\u0011\u000b\u001c\u0003G+{\u0004\u001d\u0003F#\u0007\f\u0000\u001eIZF\u0001G\u001bP%\u001f
                     \u001dY;""";
        f5673[337] = "E\u0017\u0004B<cE\u0017\u0015PAkN\u001d\bO?|#\u0006\u0001\u0015 +\u0012\u001aSI.\u0011E\u0017\u0004B<cE\u0017\u0015PA";
        f5673[338] = "/TX\\\u000fGxZM\u0007W!nGA9_\u001cq\u0003D\u0003^A,\u0004=R\tF/C\u0007ST\u001b(:V\u0004S\u0018o\u0000WY\u000e\u001f\u0016";
        f5673[339] = """
                     @UJT!\u0013FM
                     \u0017\u0011\u03bby
                     \u0011Qh\u0002\u0006S\u001a\u000b*""";
        f5673[340] = "`ZT?\u0017\u0003;\u0000_9\u00012\"VR`\b^\u0017_^n\u00122\"\u0003\u0001w\u000f\\;^B|n";
        f5673[341] = "\u0014J=_\u0016g\u0012R}\u001c&\u00d0-\u0011a]TrD\u0012sUY";
        f5673[342] = "+\"0@ >px;F6\u000fu-]\u0003a7b\"3\u001a<tiC&@a\u007fs-?\u001d\"t\u0012z<\u0015av#!f\u001eg`\u0012";
        f5673[343] = "\u001a709RI\u0013r8cK.Fa=?GBt1{`\u0010\u0011#5}6N\u0012Qp/0\u0011G#7$5Z\u0016Mg}`^.";
        f5673[344] = "MX)=\u007f\u0000\u001e\u0007;a;9\u0011\r5m#U#_x4u9M\fq\u007f+PN\u001eyrD";
        f5673[345] = "b9}h9ud!=+\t\u03bf[:#ira>6\";o";
        f5673[346] = """
                     [aQ\u0019iv\u0002j\u000b[\u0002r\u000bv.\u0001ne\u000bln^suX:\u0011\u001c{r\u001d
                     S\u000b=p\ru
                     \u0000g2f""";
        f5673[347] = "opp.D9ih0mt\u03d2V+,,\u0006,?(>$\u000bCmw*nL-=.\u007fjt";
        f5673[348] = "Ni#@\f1Hqc\u0003<\u012bwh)\u0019VwJ`sEE";
        f5673[349] = ">\u001a\u0017T*:8\u0002W\u0017\u001a\u03f5\u0007FV\u0012$px\u0004^\u0015a@";
        f5673[350] = "\"GOWR-*\u001d\u0013Dnq'\u0016VP\u000b}'\u0001EYnn3L\u0011G\u0000z(EQ=\r*\"\u0017\u0010\u0000\u0005p~\u0004,";
        f5673[351] = "S_|h(\u0014\u0005\u001a|(J\u0010\u0004_[u1\u0017\u0013DfT'\u000f\u0000R\u0017!&S\u001bL~\"4[\u0016#,} \u0011QM|$u\u0015i";
        f5673[352] = "$~&s\u001b\u001br;&3y\u000bs~\u0001n\u0002\u0018de<[\u0003\u0003qx x\u0002de:us\u0018\n|g6xy";
        f5673[353] = "|\u001a:u*`zJ1& \u0019\u0508+q84p.Y,ythz";
        f5673[354] = "@,G'U\u0013H5J\u007fZ-\u0017.E~RzD\u007f\u0010*>\u0014\u001a \u0015q\u0000\u001c\u0003-M~";
        f5673[355] = "#E\u001e~D\bv\u0004\u001a\"\u0006ka\u000e\u0007z\u0005ky\u001aX}CZeH\u0004syP|\u001e\u001c$\u0017\u0000%K\u0018\u001c";
        f5673[356] = "\u0003(J\"b\u0017S,\u001fy_\u0010\u0007>\u0015t3\"PrD\"_\u001e\b\"\u001fv#\u000f\u0012;H\u0013a\u0004\u0016|El#\f\u00119u";
        f5673[357] = "\u0011q/y%vL}`|\u001fx@}{jH/\u001e*#\u0006\"mZicvxkB+";
        f5673[358] = "LxFX )\u0016~^\u001a\\7\u0010nYM\u000bgI:\u0007!e5IqRHf'A|";
        f5673[359] = "hO!\t\u0017^!X1^\u00112)G:]l[*\\^R\u0015UhYdSH\bo ";
        f5673[360] = "]IWAg4LSN\u0016\u0002-[WWLn\u001f\u000f\u0013\u000f\u001b<H\u000fG\u000fYm!\fU\u0007T\u0002#TK]N~2NR\n+";
        f5673[361] = "\u00028ZMj\\\u0004 \u001a\u000eZ\u049b;:\u0004I;\u001c\n&V\u00155&\u0000?\u0000\rbHPfU\tZ";
        f5673[362] = "\u0019\u0014\u0013\"\tg[\u001fV'\u0002\u0018K\u0005Q&\u0004~\\$J9\u0004]A\u001cO=\u0012\u0018\u0019\u0012\u0014>VvEBW3\u0013\u0018";
    }
}
