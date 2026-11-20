// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.Obf592;
import org.rusherhack.Obf301;
import org.rusherhack.Obf193;
import org.rusherhack.Class200;
import org.rusherhack.Class590;
import org.rusherhack.Class499;
import org.rusherhack.Class253;
import org.rusherhack.Class066;

import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.client.api.events.network.EventPacket;
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
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.entity.Entity;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.BlockState;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.core.event.subscribe.Subscribe;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import java.util.Map;
import net.minecraft.util.math.Direction;
import it.unimi.dsi.fastutil.Pair;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import java.util.SortedMap;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.utils.Timer;
import java.util.WeakHashMap;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.clear;
import org.rusherhack.command.config;
import org.rusherhack.command.pitch;
import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.movement.Safewalk;
public final class Scaffold extends ToggleableModule
{
    private final Class200 f2974;
    private final ColorSetting color;
    private double f2976;
    private final BooleanSetting hideHiddenSides;
    private final BooleanSetting automaticallySwapToTheBlock;
    private final BooleanSetting onlyPlaceBlocksInFrontOfYou;
    private final BooleanSetting raytrace;
    private final NumberSetting<Integer> f2981;
    private final BooleanSetting silent;
    private final WeakHashMap<Integer, Long> f2983;
    private final NumberSetting<Integer> f2984;
    private final BooleanSetting f2985;
    private float f2986;
    private final BooleanSetting render;
    private final NumberSetting<Integer> f2988;
    private final Timer f2989;
    private final EnumSetting<Obf193> allowsYouToSprintOnCertainAnticheats;
    private final BooleanSetting buildUpFaster;
    private float f2992;
    private final BooleanSetting rotate;
    private final BooleanSetting preventsYouFromWalkingOffTheEdgeOfBlocks;
    private final EnumSetting<Obf592> blocks;
    private SortedMap<BlockPos, BlockHitResult> f2996;
    private final BooleanSetting allowsYouToJumpWithoutIncreasingHeight;
    private final BooleanSetting f2998;
    private final Class200 f2999;
    private final NumberSetting<Integer> range;
    private final Timer f3001;
    private final BooleanSetting sneakAtTheEdgeOfBlocks;
    private final BooleanSetting strictdir;
    private final Timer f3004;
    private final BooleanSetting adjustRotationsForUpdatedNcp;
    private final NumberSetting<Float> widthOfOutline;
    private final BooleanSetting placeBlocksAroundYou;
    private Pair<BlockPos, BlockHitResult> f3008;
    private final BooleanSetting sendRotationsInstantly;
    private final NumberSetting<Integer> delayBetweenBlockPlacements;
    private final BooleanSetting onlyExpandWhileMoving;
    private Direction f3012;
    private static long f3013;
    private static String[] f3014;
    private static String[] f3015;
    private static Map f3016;
    private static long[] f3017;
    private static Integer[] f3018;
    private static Map f3019;
    private static long f3020;
    private static Object[] f3021;
    private static String[] f3022;
    
    @Subscribe
    private void m6468(final EventPacket$Receive eventPacket$Receive) {
        
    }
    
    @Subscribe
    private void m6469(final EventUpdate p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          98360479040086
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          5
        //    16: aload           5
        //    18: invokedynamic   BootstrapMethod #0, test:(Lorg/rusherhack/Scaffold;)Ljava/util/function/Predicate;
        //    23: iconst_1       
        //    24: dup            
        //    25: dup_x1         
        //    26: dup            
        //    27: pop2           
        //    28: invokestatic    org/rusherhack/client/api/utils/InventoryUtils.findItem:(Ljava/util/function/Predicate;ZZ)I
        //    31: dup            
        //    32: istore_1       
        //    33: aload           5
        //    35: aconst_null    
        //    36: putfield        org/rusherhack/Scaffold.f3008:Lit/unimi/dsi/fastutil/Pair;
        //    39: iload           4
        //    41: ifne            100
        //    44: sipush          12267
        //    47: ldc2_w          2989684752303252037
        //    50: lload_2        
        //    51: lxor           
        //    52: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //    57: if_icmplt       162
        //    60: goto            67
        //    63: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    66: athrow         
        //    67: aload           5
        //    69: iload           4
        //    71: ifne            188
        //    74: goto            81
        //    77: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    80: athrow         
        //    81: getfield        org/rusherhack/Scaffold.automaticallySwapToTheBlock:Lorg/rusherhack/core/setting/BooleanSetting;
        //    84: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    87: checkcast       Ljava/lang/Boolean;
        //    90: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    93: goto            100
        //    96: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    99: athrow         
        //   100: ifne            177
        //   103: iload_1        
        //   104: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   107: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   110: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //   113: getfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //   116: iload           4
        //   118: ifne            159
        //   121: goto            128
        //   124: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   127: athrow         
        //   128: if_icmpeq       177
        //   131: goto            138
        //   134: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   137: athrow         
        //   138: iload_1        
        //   139: sipush          9519
        //   142: ldc2_w          9201479221162109071
        //   145: lload_2        
        //   146: lxor           
        //   147: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //   152: goto            159
        //   155: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   158: athrow         
        //   159: if_icmpeq       177
        //   162: aload           5
        //   164: getfield        org/rusherhack/Scaffold.f2996:Ljava/util/SortedMap;
        //   167: invokeinterface java/util/Map.clear:()V
        //   172: return         
        //   173: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   176: athrow         
        //   177: aload           5
        //   179: dup            
        //   180: dup_x1         
        //   181: iload_1        
        //   182: invokevirtual   org/rusherhack/Scaffold.m6478:(I)Ljava/util/SortedMap;
        //   185: putfield        org/rusherhack/Scaffold.f2996:Ljava/util/SortedMap;
        //   188: getfield        org/rusherhack/Scaffold.f2996:Ljava/util/SortedMap;
        //   191: invokeinterface java/util/SortedMap.entrySet:()Ljava/util/Set;
        //   196: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   201: dup            
        //   202: astore_0       
        //   203: invokeinterface java/util/Iterator.hasNext:()Z
        //   208: ifeq            285
        //   211: aload_0        
        //   212: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   217: checkcast       Ljava/util/Map.Entry;
        //   220: dup            
        //   221: astore          7
        //   223: invokeinterface java/util/Map.Entry.getKey:()Ljava/lang/Object;
        //   228: checkcast       Lnet.minecraft.util.math.BlockPos;
        //   231: astore          6
        //   233: aload           7
        //   235: invokeinterface java/util/Map.Entry.getValue:()Ljava/lang/Object;
        //   240: checkcast       Lnet.minecraft.util.hit.BlockHitResult;
        //   243: dup            
        //   244: astore          8
        //   246: iload           4
        //   248: ifne            319
        //   251: ifnonnull       269
        //   254: goto            261
        //   257: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   260: athrow         
        //   261: aload_0        
        //   262: goto            203
        //   265: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   268: athrow         
        //   269: aload           5
        //   271: dup            
        //   272: aload           6
        //   274: aload           8
        //   276: invokestatic    it/unimi/dsi/fastutil/Pair.of:(Ljava/lang/Object;Ljava/lang/Object;)Lit/unimi/dsi/fastutil/Pair;
        //   279: putfield        org/rusherhack/Scaffold.f3008:Lit/unimi/dsi/fastutil/Pair;
        //   282: goto            287
        //   285: aload           5
        //   287: getfield        org/rusherhack/Scaffold.f3008:Lit/unimi/dsi/fastutil/Pair;
        //   290: iload           4
        //   292: ifne            316
        //   295: ifnonnull       306
        //   298: goto            305
        //   301: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   304: athrow         
        //   305: return         
        //   306: aload           5
        //   308: getfield        org/rusherhack/Scaffold.f3008:Lit/unimi/dsi/fastutil/Pair;
        //   311: invokeinterface it/unimi/dsi/fastutil/Pair.right:()Ljava/lang/Object;
        //   316: checkcast       Lnet.minecraft.util.hit.BlockHitResult;
        //   319: astore_0       
        //   320: iconst_0       
        //   321: istore          7
        //   323: aload           5
        //   325: getfield        org/rusherhack/Scaffold.rotate:Lorg/rusherhack/core/setting/BooleanSetting;
        //   328: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   331: checkcast       Ljava/lang/Boolean;
        //   334: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   337: iload           4
        //   339: ifne            882
        //   342: ifeq            860
        //   345: goto            352
        //   348: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   351: athrow         
        //   352: invokestatic    org/rusherhack/client/api/RusherHackAPI.getRotationManager:()Lorg/rusherhack/client/api/system/IRotationManager;
        //   355: checkcast       Lorg/rusherhack/Class331;
        //   358: astore          6
        //   360: aload           5
        //   362: getfield        org/rusherhack/Scaffold.allowsYouToSprintOnCertainAnticheats:Lorg/rusherhack/core/setting/EnumSetting;
        //   365: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   368: iload           4
        //   370: ifne            401
        //   373: getstatic       org/rusherhack/Obf193.f3713:Lorg/rusherhack/Obf193;
        //   376: if_acmpne       550
        //   379: goto            386
        //   382: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   385: athrow         
        //   386: aload           5
        //   388: getfield        org/rusherhack/Scaffold.adjustRotationsForUpdatedNcp:Lorg/rusherhack/core/setting/BooleanSetting;
        //   391: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   394: goto            401
        //   397: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   400: athrow         
        //   401: checkcast       Ljava/lang/Boolean;
        //   404: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   407: ifne            550
        //   410: aload_0        
        //   411: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   414: invokevirtual   net.minecraft.util.math.BlockPos.toCenterPos:()Lnet.minecraft.util.math.Vec3d;
        //   417: astore          8
        //   419: aload           6
        //   421: aload           5
        //   423: aload           8
        //   425: invokevirtual   org/rusherhack/Scaffold.m6475:(Lnet.minecraft.util.math.Vec3d;)F
        //   428: fstore          9
        //   430: aload_0        
        //   431: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   434: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   437: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   440: invokevirtual   net.minecraft.entity.Entity.getYaw:()F
        //   443: iload           4
        //   445: ifne            540
        //   448: fload           9
        //   450: invokevirtual   org/rusherhack/Class331.m10867:(Lnet.minecraft.util.math.BlockPos;FF)Lnet.minecraft.util.hit.BlockHitResult;
        //   453: invokevirtual   net.minecraft.util.hit.BlockHitResult.getType:()Lnet.minecraft.util.hit.HitResult.Type;
        //   456: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //   459: if_acmpeq       512
        //   462: goto            469
        //   465: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   468: athrow         
        //   469: aload           6
        //   471: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   474: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   477: invokevirtual   net.minecraft.entity.Entity.getYaw:()F
        //   480: fload           9
        //   482: aload           5
        //   484: getfield        org/rusherhack/Scaffold.f2988:Lorg/rusherhack/core/setting/NumberSetting;
        //   487: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   490: checkcast       Ljava/lang/Integer;
        //   493: invokevirtual   java/lang/Integer.intValue:()I
        //   496: i2f            
        //   497: invokevirtual   org/rusherhack/Class331.updateRotation:(FFF)V
        //   500: iload           4
        //   502: ifeq            612
        //   505: goto            512
        //   508: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   511: athrow         
        //   512: aload           6
        //   514: aload_0        
        //   515: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   518: aload           5
        //   520: getfield        org/rusherhack/Scaffold.f2988:Lorg/rusherhack/core/setting/NumberSetting;
        //   523: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   526: checkcast       Ljava/lang/Integer;
        //   529: invokevirtual   java/lang/Integer.intValue:()I
        //   532: i2f            
        //   533: goto            540
        //   536: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   539: athrow         
        //   540: invokeinterface org/rusherhack/client/api/system/IRotationManager.updateRotation:(Lnet.minecraft.util.math.BlockPos;F)V
        //   545: iload           4
        //   547: ifeq            612
        //   550: aload           6
        //   552: aload_0        
        //   553: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   556: aload           5
        //   558: getfield        org/rusherhack/Scaffold.adjustRotationsForUpdatedNcp:Lorg/rusherhack/core/setting/BooleanSetting;
        //   561: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   564: checkcast       Ljava/lang/Boolean;
        //   567: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   570: ifeq            593
        //   573: goto            580
        //   576: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   579: athrow         
        //   580: aload_0        
        //   581: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //   584: aload           5
        //   586: goto            596
        //   589: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   592: athrow         
        //   593: aconst_null    
        //   594: aload           5
        //   596: getfield        org/rusherhack/Scaffold.f2988:Lorg/rusherhack/core/setting/NumberSetting;
        //   599: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   602: checkcast       Ljava/lang/Integer;
        //   605: invokevirtual   java/lang/Integer.intValue:()I
        //   608: i2f            
        //   609: invokevirtual   org/rusherhack/Class331.updateRotation:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.math.Direction;F)V
        //   612: aload           5
        //   614: dup            
        //   615: dup_x1         
        //   616: getstatic       org/rusherhack/Class170.f3364:Lorg/rusherhack/Class170;
        //   619: invokevirtual   org/rusherhack/Class170.m7108:()Lorg/rusherhack/Class331;
        //   622: getfield        org/rusherhack/Class331.f5324:F
        //   625: putfield        org/rusherhack/Scaffold.f2986:F
        //   628: getstatic       org/rusherhack/Class170.f3364:Lorg/rusherhack/Class170;
        //   631: invokevirtual   org/rusherhack/Class170.m7108:()Lorg/rusherhack/Class331;
        //   634: getfield        org/rusherhack/Class331.f5318:F
        //   637: putfield        org/rusherhack/Scaffold.f2992:F
        //   640: getfield        org/rusherhack/Scaffold.f3001:Lorg/rusherhack/core/utils/Timer;
        //   643: invokevirtual   org/rusherhack/core/utils/Timer.reset:()V
        //   646: aload           6
        //   648: aload_0        
        //   649: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   652: invokevirtual   org/rusherhack/Class331.getLookRaycast:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.util.hit.BlockHitResult;
        //   655: dup            
        //   656: astore          8
        //   658: invokevirtual   net.minecraft.util.hit.BlockHitResult.getType:()Lnet.minecraft.util.hit.HitResult.Type;
        //   661: iload           4
        //   663: ifne            694
        //   666: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //   669: if_acmpne       799
        //   672: goto            679
        //   675: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   678: athrow         
        //   679: aload           5
        //   681: getfield        org/rusherhack/Scaffold.sendRotationsInstantly:Lorg/rusherhack/core/setting/BooleanSetting;
        //   684: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   687: goto            694
        //   690: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   693: athrow         
        //   694: checkcast       Ljava/lang/Boolean;
        //   697: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   700: iload           4
        //   702: ifne            736
        //   705: ifeq            798
        //   708: goto            715
        //   711: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   714: athrow         
        //   715: aload           5
        //   717: getfield        org/rusherhack/Scaffold.adjustRotationsForUpdatedNcp:Lorg/rusherhack/core/setting/BooleanSetting;
        //   720: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   723: checkcast       Ljava/lang/Boolean;
        //   726: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   729: goto            736
        //   732: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   735: athrow         
        //   736: ifne            798
        //   739: aload           6
        //   741: aload_0        
        //   742: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   745: aload           5
        //   747: dup            
        //   748: getfield        org/rusherhack/Scaffold.f2986:F
        //   751: swap           
        //   752: getfield        org/rusherhack/Scaffold.f2992:F
        //   755: invokevirtual   org/rusherhack/Class331.m10867:(Lnet.minecraft.util.math.BlockPos;FF)Lnet.minecraft.util.hit.BlockHitResult;
        //   758: dup            
        //   759: astore          8
        //   761: iload           4
        //   763: ifne            795
        //   766: invokevirtual   net.minecraft.util.hit.BlockHitResult.getType:()Lnet.minecraft.util.hit.HitResult.Type;
        //   769: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //   772: if_acmpne       787
        //   775: goto            782
        //   778: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   781: athrow         
        //   782: return         
        //   783: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   786: athrow         
        //   787: iconst_1       
        //   788: dup            
        //   789: dup            
        //   790: pop2           
        //   791: istore          7
        //   793: aload           8
        //   795: goto            801
        //   798: return         
        //   799: aload           8
        //   801: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //   804: iload           4
        //   806: ifne            838
        //   809: aload_0        
        //   810: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //   813: if_acmpeq       860
        //   816: goto            823
        //   819: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   822: athrow         
        //   823: aload           5
        //   825: getfield        org/rusherhack/Scaffold.adjustRotationsForUpdatedNcp:Lorg/rusherhack/core/setting/BooleanSetting;
        //   828: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   831: goto            838
        //   834: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   837: athrow         
        //   838: checkcast       Ljava/lang/Boolean;
        //   841: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   844: iload           4
        //   846: ifne            882
        //   849: ifeq            860
        //   852: goto            859
        //   855: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   858: athrow         
        //   859: return         
        //   860: aload           5
        //   862: dup            
        //   863: getfield        org/rusherhack/Scaffold.f2989:Lorg/rusherhack/core/utils/Timer;
        //   866: swap           
        //   867: getfield        org/rusherhack/Scaffold.delayBetweenBlockPlacements:Lorg/rusherhack/core/setting/NumberSetting;
        //   870: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   873: checkcast       Ljava/lang/Integer;
        //   876: invokevirtual   java/lang/Integer.intValue:()I
        //   879: invokevirtual   org/rusherhack/core/utils/Timer.ticksPassed:(I)Z
        //   882: ifne            886
        //   885: return         
        //   886: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   889: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   892: aload_0        
        //   893: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   896: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //   899: astore          6
        //   901: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   904: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   907: aload_0        
        //   908: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   911: invokevirtual   net.minecraft.world.World.getBlockEntity:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.entity.BlockEntity;
        //   914: ifnonnull       977
        //   917: aload           6
        //   919: getstatic       net.minecraft.block.Blocks.ANVIL:Lnet.minecraft.block.Block;
        //   922: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isOf:(Lnet.minecraft.block.Block;)Z
        //   925: iload           4
        //   927: ifne            988
        //   930: goto            937
        //   933: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   936: athrow         
        //   937: ifne            977
        //   940: goto            947
        //   943: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   946: athrow         
        //   947: aload           6
        //   949: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //   952: instanceof      Lnet.minecraft.block.SlabBlock;
        //   955: iload           4
        //   957: ifne            992
        //   960: goto            967
        //   963: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   966: athrow         
        //   967: ifeq            991
        //   970: goto            977
        //   973: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   976: athrow         
        //   977: iconst_1       
        //   978: dup            
        //   979: dup            
        //   980: pop2           
        //   981: goto            988
        //   984: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   987: athrow         
        //   988: goto            995
        //   991: iconst_0       
        //   992: iconst_1       
        //   993: dup            
        //   994: pop2           
        //   995: istore          8
        //   997: aload           5
        //   999: iload           4
        //  1001: ifne            1227
        //  1004: getfield        org/rusherhack/Scaffold.buildUpFaster:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1007: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1010: checkcast       Ljava/lang/Boolean;
        //  1013: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1016: ifeq            1218
        //  1019: goto            1026
        //  1022: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1025: athrow         
        //  1026: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1029: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1032: getfield        net.minecraft.client.network.ClientPlayerEntity.input:Lnet.minecraft.client.input.Input;
        //  1035: getfield        net.minecraft.client.input.Input.jumping:Z
        //  1038: iload           4
        //  1040: ifne            1063
        //  1043: goto            1050
        //  1046: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1049: athrow         
        //  1050: ifeq            1218
        //  1053: goto            1060
        //  1056: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1059: athrow         
        //  1060: invokestatic    org/rusherhack/client/api/utils/PlayerUtils.hasHorizontalInput:()Z
        //  1063: iload           4
        //  1065: ifne            1099
        //  1068: ifne            1218
        //  1071: goto            1078
        //  1074: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1077: athrow         
        //  1078: aload           5
        //  1080: getfield        org/rusherhack/Scaffold.f2985:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1083: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1086: checkcast       Ljava/lang/Boolean;
        //  1089: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1092: goto            1099
        //  1095: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1098: athrow         
        //  1099: iload           4
        //  1101: ifne            1170
        //  1104: ifeq            1138
        //  1107: goto            1114
        //  1110: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1113: athrow         
        //  1114: iload           8
        //  1116: iload           4
        //  1118: ifne            1170
        //  1121: goto            1128
        //  1124: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1127: athrow         
        //  1128: ifne            1218
        //  1131: goto            1138
        //  1134: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1137: athrow         
        //  1138: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1141: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1144: ldc2_w          0.42
        //  1147: dconst_0       
        //  1148: dup2_x2        
        //  1149: invokevirtual   net.minecraft.entity.Entity.setVelocity:(DDD)V
        //  1152: aload           5
        //  1154: getfield        org/rusherhack/Scaffold.f3004:Lorg/rusherhack/core/utils/Timer;
        //  1157: ldc2_w          1500.0
        //  1160: invokevirtual   org/rusherhack/core/utils/Timer.passed:(D)Z
        //  1163: goto            1170
        //  1166: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1169: athrow         
        //  1170: iload           4
        //  1172: ifne            1215
        //  1175: ifeq            1233
        //  1178: goto            1185
        //  1181: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1184: athrow         
        //  1185: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1188: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1191: ldc2_w          -0.28
        //  1194: dconst_0       
        //  1195: dup2_x2        
        //  1196: invokevirtual   net.minecraft.entity.Entity.setVelocity:(DDD)V
        //  1199: iload_1        
        //  1200: aload           5
        //  1202: getfield        org/rusherhack/Scaffold.f3004:Lorg/rusherhack/core/utils/Timer;
        //  1205: invokevirtual   org/rusherhack/core/utils/Timer.reset:()V
        //  1208: goto            1215
        //  1211: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1214: athrow         
        //  1215: goto            1234
        //  1218: aload           5
        //  1220: dup            
        //  1221: getfield        org/rusherhack/Scaffold.f2989:Lorg/rusherhack/core/utils/Timer;
        //  1224: invokevirtual   org/rusherhack/core/utils/Timer.reset:()V
        //  1227: getfield        org/rusherhack/Scaffold.f3004:Lorg/rusherhack/core/utils/Timer;
        //  1230: invokevirtual   org/rusherhack/core/utils/Timer.reset:()V
        //  1233: iload_1        
        //  1234: sipush          22543
        //  1237: ldc2_w          3351668881007515052
        //  1240: lload_2        
        //  1241: lxor           
        //  1242: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //  1247: if_icmpge       1260
        //  1250: getstatic       net.minecraft.util.Hand.MAIN_HAND:Lnet.minecraft.util.Hand;
        //  1253: goto            1263
        //  1256: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1259: athrow         
        //  1260: getstatic       net.minecraft.util.Hand.OFF_HAND:Lnet.minecraft.util.Hand;
        //  1263: astore          9
        //  1265: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1268: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1271: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //  1274: getfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //  1277: istore          6
        //  1279: aload           9
        //  1281: getstatic       net.minecraft.util.Hand.MAIN_HAND:Lnet.minecraft.util.Hand;
        //  1284: if_acmpne       1321
        //  1287: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1290: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1293: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //  1296: iload_1        
        //  1297: sipush          17597
        //  1300: ldc2_w          9165170337567607056
        //  1303: lload_2        
        //  1304: lxor           
        //  1305: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //  1310: isub           
        //  1311: putfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //  1314: goto            1321
        //  1317: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1320: athrow         
        //  1321: iload           7
        //  1323: iload           4
        //  1325: ifne            1446
        //  1328: ifeq            1391
        //  1331: goto            1338
        //  1334: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1337: athrow         
        //  1338: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1341: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //  1344: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //  1347: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.invokeEnsureHasSentCarriedItem:()V
        //  1352: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1355: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1358: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //  1361: new             Lnet.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
        //  1364: dup            
        //  1365: aload           9
        //  1367: iconst_0       
        //  1368: aload           5
        //  1370: dup            
        //  1371: getfield        org/rusherhack/Scaffold.f2986:F
        //  1374: swap           
        //  1375: getfield        org/rusherhack/Scaffold.f2992:F
        //  1378: invokespecial   net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.<init>:(Lnet.minecraft.util.Hand;IFF)V
        //  1381: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //  1384: goto            1391
        //  1387: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1390: athrow         
        //  1391: aload_0        
        //  1392: aload           9
        //  1394: iconst_1       
        //  1395: dup            
        //  1396: dup            
        //  1397: pop2           
        //  1398: invokestatic    org/rusherhack/Util416.m13459:(Lnet.minecraft.util.hit.BlockHitResult;Lnet.minecraft.util.Hand;Z)Z
        //  1401: aload           5
        //  1403: getfield        org/rusherhack/Scaffold.f2983:Ljava/util/WeakHashMap;
        //  1406: iload_1        
        //  1407: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1410: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1413: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1416: invokevirtual   java/util/WeakHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1419: aload           5
        //  1421: aload_0        
        //  1422: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //  1425: invokevirtual   net.minecraft.util.math.Direction.getOpposite:()Lnet.minecraft.util.math.Direction;
        //  1428: putfield        org/rusherhack/Scaffold.f3012:Lnet.minecraft.util.math.Direction;
        //  1431: pop2           
        //  1432: aload           5
        //  1434: getfield        org/rusherhack/Scaffold.silent:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1437: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1440: checkcast       Ljava/lang/Boolean;
        //  1443: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1446: ifeq            1470
        //  1449: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1452: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1455: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //  1458: iload           6
        //  1460: putfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //  1463: goto            1470
        //  1466: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1469: athrow         
        //  1470: return         
        //    StackMapTable: 00 7C FF 00 3F 00 05 07 00 02 01 04 01 07 00 02 00 01 07 00 5C 03 49 07 00 5C 43 07 00 02 4E 07 00 5C 43 01 57 07 00 5C FF 00 03 00 05 07 00 02 01 04 01 07 00 02 00 02 01 01 45 07 00 5C 03 50 07 00 5C FF 00 03 00 05 07 00 02 01 04 01 07 00 02 00 02 01 01 02 4A 07 00 5C 03 4A 07 00 02 FF 00 0E 00 05 07 01 0F 01 04 01 07 00 02 00 01 07 01 0F FF 00 35 00 08 07 01 0F 01 04 01 07 00 02 07 01 1C 07 01 17 07 01 1F 00 01 07 00 5C 03 43 07 00 5C 03 F8 00 0F 41 07 00 02 4D 07 00 5C 03 00 49 07 02 1B 42 07 01 1F FF 00 1C 00 07 07 01 1F 01 04 01 07 00 02 00 01 00 01 07 00 5C 03 FF 00 1D 00 07 07 01 1F 01 04 01 07 00 02 07 01 32 01 00 01 07 00 5C 03 4A 07 00 5C 43 07 02 1B FF 00 3F 00 09 07 01 1F 01 04 01 07 00 02 07 01 32 01 07 02 1D 02 00 01 07 00 5C 03 66 07 00 5C 03 57 07 00 5C FF 00 03 00 09 07 01 1F 01 04 01 07 00 02 07 01 32 01 07 02 1D 02 00 03 07 01 32 07 01 1C 02 F9 00 09 59 07 00 5C FF 00 03 00 07 07 01 1F 01 04 01 07 00 02 07 01 32 01 00 02 07 01 32 07 01 1C 48 07 00 5C FF 00 03 00 07 07 01 1F 01 04 01 07 00 02 07 01 32 01 00 02 07 01 32 07 01 1C FF 00 02 00 07 07 01 1F 01 04 01 07 00 02 07 01 32 01 00 04 07 01 32 07 01 1C 07 02 12 07 00 02 0F FF 00 3E 00 08 07 01 1F 01 04 01 07 00 02 07 01 32 01 07 01 1F 00 01 07 00 5C 03 4A 07 00 5C 43 07 02 1B 50 07 00 5C 03 50 07 00 5C 43 01 69 07 00 5C 03 40 07 00 5C 03 47 07 01 1F 02 00 41 07 01 1F 51 07 00 5C 03 4A 07 00 5C 43 07 02 1B 50 07 00 5C 03 FF 00 00 00 07 07 01 1F 01 04 01 07 00 02 00 01 00 00 55 01 03 FF 00 2E 00 07 07 01 1F 01 04 01 07 00 02 07 02 1F 01 00 01 07 00 5C 43 01 45 07 00 5C 03 4F 07 00 5C 43 01 45 07 00 5C 03 46 07 00 5C 43 01 02 40 01 42 01 FF 00 1A 00 08 07 01 1F 01 04 01 07 00 02 07 02 1F 01 01 00 01 07 00 5C 03 53 07 00 5C 43 01 45 07 00 5C 03 42 01 4A 07 00 5C 03 50 07 00 5C 43 01 4A 07 00 5C 03 49 07 00 5C 43 01 45 07 00 5C 03 5B 07 00 5C 43 01 4A 07 00 5C 03 59 07 00 5C 43 01 02 48 07 00 02 05 40 01 55 07 00 5C 03 42 07 01 E1 FF 00 35 00 09 07 01 1F 01 04 01 07 00 02 01 01 01 07 01 E1 00 01 07 00 5C 03 4C 07 00 5C 03 70 07 00 5C 03 76 01 53 07 00 5C 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  33     60     63     67     Ljava/lang/MatchException;
        //  44     74     77     81     Ljava/lang/MatchException;
        //  67     93     96     100    Ljava/lang/MatchException;
        //  100    121    124    128    Ljava/lang/MatchException;
        //  103    131    134    138    Ljava/lang/MatchException;
        //  128    152    155    159    Ljava/lang/MatchException;
        //  159    173    173    177    Ljava/lang/MatchException;
        //  246    254    257    261    Ljava/lang/MatchException;
        //  251    265    265    269    Ljava/lang/MatchException;
        //  287    298    301    305    Ljava/lang/MatchException;
        //  323    345    348    352    Ljava/lang/MatchException;
        //  360    379    382    386    Ljava/lang/MatchException;
        //  373    394    397    401    Ljava/lang/MatchException;
        //  430    462    465    469    Ljava/lang/MatchException;
        //  448    505    508    512    Ljava/lang/MatchException;
        //  469    533    536    540    Ljava/lang/MatchException;
        //  540    573    576    580    Ljava/lang/MatchException;
        //  550    589    589    593    Ljava/lang/MatchException;
        //  658    672    675    679    Ljava/lang/MatchException;
        //  666    687    690    694    Ljava/lang/MatchException;
        //  694    708    711    715    Ljava/lang/MatchException;
        //  705    729    732    736    Ljava/lang/MatchException;
        //  761    775    778    782    Ljava/lang/MatchException;
        //  766    783    783    787    Ljava/lang/MatchException;
        //  801    816    819    823    Ljava/lang/MatchException;
        //  809    831    834    838    Ljava/lang/MatchException;
        //  838    852    855    859    Ljava/lang/MatchException;
        //  901    930    933    937    Ljava/lang/MatchException;
        //  917    940    943    947    Ljava/lang/MatchException;
        //  937    960    963    967    Ljava/lang/MatchException;
        //  947    970    973    977    Ljava/lang/MatchException;
        //  967    981    984    988    Ljava/lang/MatchException;
        //  997    1019   1022   1026   Ljava/lang/MatchException;
        //  1004   1043   1046   1050   Ljava/lang/MatchException;
        //  1026   1053   1056   1060   Ljava/lang/MatchException;
        //  1063   1071   1074   1078   Ljava/lang/MatchException;
        //  1068   1092   1095   1099   Ljava/lang/MatchException;
        //  1099   1107   1110   1114   Ljava/lang/MatchException;
        //  1104   1121   1124   1128   Ljava/lang/MatchException;
        //  1114   1131   1134   1138   Ljava/lang/MatchException;
        //  1128   1163   1166   1170   Ljava/lang/MatchException;
        //  1170   1178   1181   1185   Ljava/lang/MatchException;
        //  1175   1208   1211   1215   Ljava/lang/MatchException;
        //  1234   1256   1256   1260   Ljava/lang/MatchException;
        //  1279   1314   1317   1321   Ljava/lang/MatchException;
        //  1321   1331   1334   1338   Ljava/lang/MatchException;
        //  1328   1384   1387   1391   Ljava/lang/MatchException;
        //  1446   1463   1466   1470   Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071_1:
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
    
    public Scaffold() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          94799257864316
        //     6: lxor           
        //     7: lstore_1       
        //     8: aload_0        
        //     9: dup            
        //    10: dup2           
        //    11: dup2           
        //    12: dup2           
        //    13: dup2           
        //    14: dup2           
        //    15: ldc_w           "Scaffold"
        //    18: ldc_w           ")4\u001c.\u0005 \u001c(\u000b \u0004-\u0011a\n3\u0001%\u000f$\u001ba\t/\fa\u001c.\u001f$\u001a2H6\u00015\u0000a\n-\u0007\"\u00032"
        //    21: invokestatic    org/rusherhack/Class507.m15676:(Ljava/lang/String;)Ljava/lang/String;
        //    24: getstatic       org/rusherhack/client/api/feature/module/ModuleCategory.WORLD:Lorg/rusherhack/client/api/feature/module/ModuleCategory;
        //    27: invokespecial   org/rusherhack/client/api/feature/module/ToggleableModule.<init>:(Ljava/lang/String;Ljava/lang/String;Lorg/rusherhack/client/api/feature/module/ModuleCategory;)V
        //    30: new             Lorg/rusherhack/core/setting/EnumSetting;
        //    33: aload_0        
        //    34: dup_x2         
        //    35: dup            
        //    36: pop2           
        //    37: dup            
        //    38: ldc_w           "Blocks"
        //    41: getstatic       org/rusherhack/Obf592.f9381:Lorg/rusherhack/Obf592;
        //    44: invokespecial   org/rusherhack/core/setting/EnumSetting.<init>:(Ljava/lang/String;Ljava/lang/Enum;)V
        //    47: putfield        org/rusherhack/Scaffold.blocks:Lorg/rusherhack/core/setting/EnumSetting;
        //    50: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //    53: aload_0        
        //    54: dup            
        //    55: pop2           
        //    56: dup            
        //    57: ldc_w           "Swap"
        //    60: ldc_w           "Automatically swap to the block"
        //    63: iconst_1       
        //    64: dup            
        //    65: dup            
        //    66: pop2           
        //    67: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    70: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //    73: putfield        org/rusherhack/Scaffold.automaticallySwapToTheBlock:Lorg/rusherhack/core/setting/BooleanSetting;
        //    76: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //    79: aload_0        
        //    80: dup            
        //    81: pop2           
        //    82: dup            
        //    83: ldc_w           "Silent"
        //    86: iconst_1       
        //    87: dup            
        //    88: dup            
        //    89: pop2           
        //    90: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    93: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //    96: putfield        org/rusherhack/Scaffold.silent:Lorg/rusherhack/core/setting/BooleanSetting;
        //    99: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   102: aload_0        
        //   103: dup            
        //   104: pop2           
        //   105: dup            
        //   106: ldc_w           "Safewalk"
        //   109: ldc_w           "Prevents you from walking off the edge of blocks"
        //   112: iconst_0       
        //   113: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   116: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   119: putfield        org/rusherhack/Scaffold.preventsYouFromWalkingOffTheEdgeOfBlocks:Lorg/rusherhack/core/setting/BooleanSetting;
        //   122: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   125: aload_0        
        //   126: dup            
        //   127: pop2           
        //   128: dup            
        //   129: ldc_w           "Sneak"
        //   132: ldc_w           "Sneak at the edge of blocks"
        //   135: iconst_0       
        //   136: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   139: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   142: putfield        org/rusherhack/Scaffold.sneakAtTheEdgeOfBlocks:Lorg/rusherhack/core/setting/BooleanSetting;
        //   145: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   148: aload_0        
        //   149: dup            
        //   150: pop2           
        //   151: dup            
        //   152: ldc_w           "Expand"
        //   155: ldc_w           "Place blocks around you"
        //   158: iconst_0       
        //   159: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   162: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   165: putfield        org/rusherhack/Scaffold.placeBlocksAroundYou:Lorg/rusherhack/core/setting/BooleanSetting;
        //   168: new             Lorg/rusherhack/core/setting/NumberSetting;
        //   171: aload_0        
        //   172: dup            
        //   173: pop2           
        //   174: dup            
        //   175: ldc_w           "Range"
        //   178: iconst_4       
        //   179: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   182: iconst_1       
        //   183: dup            
        //   184: dup            
        //   185: pop2           
        //   186: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   189: iconst_4       
        //   190: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   193: invokespecial   org/rusherhack/core/setting/NumberSetting.<init>:(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
        //   196: putfield        org/rusherhack/Scaffold.range:Lorg/rusherhack/core/setting/NumberSetting;
        //   199: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   202: aload_0        
        //   203: dup            
        //   204: pop2           
        //   205: dup            
        //   206: ldc_w           "OnlyForward"
        //   209: ldc_w           "Only place blocks in front of you"
        //   212: iconst_1       
        //   213: dup            
        //   214: dup            
        //   215: pop2           
        //   216: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   219: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   222: putfield        org/rusherhack/Scaffold.onlyPlaceBlocksInFrontOfYou:Lorg/rusherhack/core/setting/BooleanSetting;
        //   225: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   228: aload_0        
        //   229: dup            
        //   230: pop2           
        //   231: dup            
        //   232: ldc_w           "WhileMoving"
        //   235: ldc_w           "Only expand while moving"
        //   238: iconst_1       
        //   239: dup            
        //   240: dup            
        //   241: pop2           
        //   242: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   245: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   248: putfield        org/rusherhack/Scaffold.onlyExpandWhileMoving:Lorg/rusherhack/core/setting/BooleanSetting;
        //   251: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   254: aload_0        
        //   255: dup            
        //   256: pop2           
        //   257: dup            
        //   258: ldc_w           "Tower"
        //   261: ldc_w           "Build up faster"
        //   264: iconst_0       
        //   265: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   268: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   271: putfield        org/rusherhack/Scaffold.buildUpFaster:Lorg/rusherhack/core/setting/BooleanSetting;
        //   274: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   277: aload_0        
        //   278: dup            
        //   279: pop2           
        //   280: dup            
        //   281: ldc_w           "Strict"
        //   284: ldc_w           "Disable tower for certain blocks for Updated-NCP"
        //   287: iconst_1       
        //   288: dup            
        //   289: dup            
        //   290: pop2           
        //   291: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   294: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   297: putfield        org/rusherhack/Scaffold.f2985:Lorg/rusherhack/core/setting/BooleanSetting;
        //   300: new             Lorg/rusherhack/core/setting/EnumSetting;
        //   303: aload_0        
        //   304: dup            
        //   305: pop2           
        //   306: dup            
        //   307: ldc_w           "StrictSprint"
        //   310: ldc_w           "Allows you to sprint on certain anticheats"
        //   313: getstatic       org/rusherhack/Obf193.f3713:Lorg/rusherhack/Obf193;
        //   316: invokespecial   org/rusherhack/core/setting/EnumSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   319: aload_0        
        //   320: invokedynamic   BootstrapMethod #2, accept:(Lorg/rusherhack/Scaffold;)Ljava/util/function/Consumer;
        //   325: invokevirtual   org/rusherhack/core/setting/EnumSetting.onChange:(Ljava/util/function/Consumer;)Lorg/rusherhack/core/setting/EnumSetting;
        //   328: putfield        org/rusherhack/Scaffold.allowsYouToSprintOnCertainAnticheats:Lorg/rusherhack/core/setting/EnumSetting;
        //   331: aload_0        
        //   332: dup            
        //   333: dup2           
        //   334: dup2           
        //   335: dup2           
        //   336: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   339: aload_0        
        //   340: dup_x1         
        //   341: dup            
        //   342: pop2           
        //   343: dup            
        //   344: ldc_w           "HoldY"
        //   347: ldc_w           "Allows you to jump without increasing height"
        //   350: iconst_1       
        //   351: dup            
        //   352: dup            
        //   353: pop2           
        //   354: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   357: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   360: putfield        org/rusherhack/Scaffold.allowsYouToJumpWithoutIncreasingHeight:Lorg/rusherhack/core/setting/BooleanSetting;
        //   363: new             Lorg/rusherhack/core/setting/NumberSetting;
        //   366: aload_0        
        //   367: dup_x2         
        //   368: dup            
        //   369: pop2           
        //   370: dup            
        //   371: ldc_w           "Delay"
        //   374: ldc_w           "Delay between block placements"
        //   377: iconst_0       
        //   378: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   381: iconst_0       
        //   382: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   385: iconst_4       
        //   386: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   389: invokespecial   org/rusherhack/core/setting/NumberSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
        //   392: putfield        org/rusherhack/Scaffold.delayBetweenBlockPlacements:Lorg/rusherhack/core/setting/NumberSetting;
        //   395: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   398: aload_0        
        //   399: dup            
        //   400: pop2           
        //   401: dup            
        //   402: ldc_w           "StrictDir"
        //   405: iconst_1       
        //   406: dup            
        //   407: dup            
        //   408: pop2           
        //   409: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   412: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   415: putfield        org/rusherhack/Scaffold.strictdir:Lorg/rusherhack/core/setting/BooleanSetting;
        //   418: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   421: aload_0        
        //   422: dup            
        //   423: pop2           
        //   424: dup            
        //   425: ldc_w           "Raytrace"
        //   428: iconst_0       
        //   429: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   432: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   435: putfield        org/rusherhack/Scaffold.raytrace:Lorg/rusherhack/core/setting/BooleanSetting;
        //   438: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   441: aload_0        
        //   442: dup            
        //   443: pop2           
        //   444: dup            
        //   445: ldc_w           "Rotate"
        //   448: iconst_1       
        //   449: dup            
        //   450: dup            
        //   451: pop2           
        //   452: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   455: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   458: putfield        org/rusherhack/Scaffold.rotate:Lorg/rusherhack/core/setting/BooleanSetting;
        //   461: new             Lorg/rusherhack/core/setting/NumberSetting;
        //   464: aload_0        
        //   465: dup            
        //   466: pop2           
        //   467: dup            
        //   468: ldc_w           "Speed"
        //   471: sipush          16703
        //   474: ldc2_w          8469131301225612991
        //   477: lload_1        
        //   478: lxor           
        //   479: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //   484: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   487: iconst_1       
        //   488: dup            
        //   489: dup            
        //   490: pop2           
        //   491: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   494: sipush          28880
        //   497: ldc2_w          1256777827758733150
        //   500: lload_1        
        //   501: lxor           
        //   502: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //   507: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   510: invokespecial   org/rusherhack/core/setting/NumberSetting.<init>:(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
        //   513: putfield        org/rusherhack/Scaffold.f2988:Lorg/rusherhack/core/setting/NumberSetting;
        //   516: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   519: aload_0        
        //   520: dup            
        //   521: pop2           
        //   522: dup            
        //   523: ldc_w           "Constant"
        //   526: ldc_w           "Keep rotations for however many ticks for Updated-NCP"
        //   529: iconst_0       
        //   530: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   533: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   536: putfield        org/rusherhack/Scaffold.f2998:Lorg/rusherhack/core/setting/BooleanSetting;
        //   539: new             Lorg/rusherhack/core/setting/NumberSetting;
        //   542: aload_0        
        //   543: dup            
        //   544: pop2           
        //   545: dup            
        //   546: ldc_w           "Ticks"
        //   549: iconst_1       
        //   550: dup            
        //   551: dup            
        //   552: pop2           
        //   553: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   556: iconst_1       
        //   557: dup            
        //   558: dup            
        //   559: pop2           
        //   560: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   563: sipush          21696
        //   566: ldc2_w          6894297519387726671
        //   569: lload_1        
        //   570: lxor           
        //   571: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //   576: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   579: invokespecial   org/rusherhack/core/setting/NumberSetting.<init>:(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
        //   582: putfield        org/rusherhack/Scaffold.f2981:Lorg/rusherhack/core/setting/NumberSetting;
        //   585: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   588: aload_0        
        //   589: dup            
        //   590: pop2           
        //   591: dup            
        //   592: ldc_w           "Strict"
        //   595: ldc_w           "Adjust rotations for Updated-NCP"
        //   598: iconst_0       
        //   599: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   602: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   605: putfield        org/rusherhack/Scaffold.adjustRotationsForUpdatedNcp:Lorg/rusherhack/core/setting/BooleanSetting;
        //   608: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   611: aload_0        
        //   612: dup            
        //   613: pop2           
        //   614: dup            
        //   615: ldc_w           "Instant"
        //   618: ldc_w           "Send rotations instantly"
        //   621: iconst_1       
        //   622: dup            
        //   623: dup            
        //   624: pop2           
        //   625: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   628: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   631: aload_0        
        //   632: invokedynamic   BootstrapMethod #3, getAsBoolean:(Lorg/rusherhack/Scaffold;)Ljava/util/function/BooleanSupplier;
        //   637: invokevirtual   org/rusherhack/core/setting/BooleanSetting.setVisibility:(Ljava/util/function/BooleanSupplier;)Lorg/rusherhack/core/setting/BooleanSetting;
        //   640: putfield        org/rusherhack/Scaffold.sendRotationsInstantly:Lorg/rusherhack/core/setting/BooleanSetting;
        //   643: ldc2_w          -999.0
        //   646: aload_0        
        //   647: dup_x2         
        //   648: dup_x2         
        //   649: aload_0        
        //   650: dup            
        //   651: dup_x1         
        //   652: dup2           
        //   653: dup2           
        //   654: dup2           
        //   655: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   658: aload_0        
        //   659: dup_x1         
        //   660: dup            
        //   661: pop2           
        //   662: dup            
        //   663: ldc_w           "Render"
        //   666: iconst_1       
        //   667: dup            
        //   668: dup            
        //   669: pop2           
        //   670: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   673: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   676: putfield        org/rusherhack/Scaffold.render:Lorg/rusherhack/core/setting/BooleanSetting;
        //   679: new             Lorg/rusherhack/client/api/setting/ColorSetting;
        //   682: aload_0        
        //   683: dup_x2         
        //   684: dup            
        //   685: pop2           
        //   686: dup            
        //   687: ldc_w           "Color"
        //   690: getstatic       java/awt/Color.CYAN:Ljava/awt/Color;
        //   693: sipush          10916
        //   696: ldc2_w          8857090712287128865
        //   699: lload_1        
        //   700: lxor           
        //   701: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //   706: invokestatic    org/rusherhack/core/utils/ColorUtils.transparency:(Ljava/awt/Color;I)Ljava/awt/Color;
        //   709: invokespecial   org/rusherhack/client/api/setting/ColorSetting.<init>:(Ljava/lang/String;Ljava/awt/Color;)V
        //   712: iconst_1       
        //   713: dup            
        //   714: dup            
        //   715: pop2           
        //   716: invokevirtual   org/rusherhack/client/api/setting/ColorSetting.setThemeSync:(Z)Lorg/rusherhack/client/api/setting/ColorSetting;
        //   719: putfield        org/rusherhack/Scaffold.color:Lorg/rusherhack/client/api/setting/ColorSetting;
        //   722: new             Lorg/rusherhack/core/setting/NumberSetting;
        //   725: aload_0        
        //   726: dup            
        //   727: pop2           
        //   728: dup            
        //   729: ldc_w           "Width"
        //   732: ldc_w           "Width of outline"
        //   735: fconst_2       
        //   736: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   739: ldc_w           0.1
        //   742: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   745: ldc_w           3.0
        //   748: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   751: invokespecial   org/rusherhack/core/setting/NumberSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
        //   754: putfield        org/rusherhack/Scaffold.widthOfOutline:Lorg/rusherhack/core/setting/NumberSetting;
        //   757: new             Lorg/rusherhack/core/setting/BooleanSetting;
        //   760: aload_0        
        //   761: dup            
        //   762: pop2           
        //   763: dup            
        //   764: ldc_w           "DepthTest"
        //   767: ldc_w           "Hide hidden sides"
        //   770: iconst_0       
        //   771: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   774: invokespecial   org/rusherhack/core/setting/BooleanSetting.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
        //   777: putfield        org/rusherhack/Scaffold.hideHiddenSides:Lorg/rusherhack/core/setting/BooleanSetting;
        //   780: new             Lorg/rusherhack/core/setting/NumberSetting;
        //   783: aload_0        
        //   784: dup            
        //   785: pop2           
        //   786: dup            
        //   787: ldc_w           "Extrapolation"
        //   790: iconst_0       
        //   791: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   794: iconst_0       
        //   795: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   798: sipush          11624
        //   801: ldc2_w          6712047770696723172
        //   804: lload_1        
        //   805: lxor           
        //   806: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //   811: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   814: invokespecial   org/rusherhack/core/setting/NumberSetting.<init>:(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
        //   817: iconst_1       
        //   818: dup            
        //   819: dup            
        //   820: pop2           
        //   821: invokevirtual   org/rusherhack/core/setting/NumberSetting.setHidden:(Z)Lorg/rusherhack/core/setting/NumberSetting;
        //   824: putfield        org/rusherhack/Scaffold.f2984:Lorg/rusherhack/core/setting/NumberSetting;
        //   827: new             Lorg/rusherhack/Class200;
        //   830: aload_0        
        //   831: dup            
        //   832: pop2           
        //   833: dup            
        //   834: invokestatic    org/rusherhack/client/api/RusherHackAPI.getConfigPath:()Ljava/nio/file/Path;
        //   837: ldc_w           "scaffold"
        //   840: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //   845: ldc_w           "whitelist.json"
        //   848: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //   853: invokeinterface java/nio/file/Path.toFile:()Ljava/io/File;
        //   858: invokespecial   org/rusherhack/Class200.<init>:(Ljava/io/File;)V
        //   861: putfield        org/rusherhack/Scaffold.f2999:Lorg/rusherhack/Class200;
        //   864: new             Lorg/rusherhack/Class200;
        //   867: aload_0        
        //   868: dup            
        //   869: pop2           
        //   870: dup            
        //   871: invokestatic    org/rusherhack/client/api/RusherHackAPI.getConfigPath:()Ljava/nio/file/Path;
        //   874: ldc_w           "scaffold"
        //   877: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //   882: ldc_w           "blacklist.json"
        //   885: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //   890: invokeinterface java/nio/file/Path.toFile:()Ljava/io/File;
        //   895: invokespecial   org/rusherhack/Class200.<init>:(Ljava/io/File;)V
        //   898: putfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //   901: new             Ljava/util/WeakHashMap;
        //   904: aload_0        
        //   905: dup            
        //   906: pop2           
        //   907: dup            
        //   908: invokespecial   java/util/WeakHashMap.<init>:()V
        //   911: putfield        org/rusherhack/Scaffold.f2983:Ljava/util/WeakHashMap;
        //   914: new             Lorg/rusherhack/core/utils/Timer;
        //   917: aload_0        
        //   918: dup            
        //   919: pop2           
        //   920: dup            
        //   921: invokespecial   org/rusherhack/core/utils/Timer.<init>:()V
        //   924: putfield        org/rusherhack/Scaffold.f2989:Lorg/rusherhack/core/utils/Timer;
        //   927: new             Lorg/rusherhack/core/utils/Timer;
        //   930: aload_0        
        //   931: dup            
        //   932: pop2           
        //   933: dup            
        //   934: invokespecial   org/rusherhack/core/utils/Timer.<init>:()V
        //   937: putfield        org/rusherhack/Scaffold.f3004:Lorg/rusherhack/core/utils/Timer;
        //   940: new             Lorg/rusherhack/core/utils/Timer;
        //   943: aload_0        
        //   944: dup            
        //   945: pop2           
        //   946: dup            
        //   947: invokespecial   org/rusherhack/core/utils/Timer.<init>:()V
        //   950: putfield        org/rusherhack/Scaffold.f3001:Lorg/rusherhack/core/utils/Timer;
        //   953: new             Ljava/util/TreeMap;
        //   956: aload_0        
        //   957: dup            
        //   958: pop2           
        //   959: dup            
        //   960: invokespecial   java/util/TreeMap.<init>:()V
        //   963: putfield        org/rusherhack/Scaffold.f2996:Ljava/util/SortedMap;
        //   966: putfield        org/rusherhack/Scaffold.f2976:D
        //   969: getfield        org/rusherhack/Scaffold.automaticallySwapToTheBlock:Lorg/rusherhack/core/setting/BooleanSetting;
        //   972: iconst_1       
        //   973: dup            
        //   974: dup            
        //   975: pop2           
        //   976: anewarray       Lorg/rusherhack/core/setting/Setting;
        //   979: dup            
        //   980: iconst_0       
        //   981: aload_0        
        //   982: getfield        org/rusherhack/Scaffold.silent:Lorg/rusherhack/core/setting/BooleanSetting;
        //   985: aastore        
        //   986: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //   989: aload_0        
        //   990: getfield        org/rusherhack/Scaffold.preventsYouFromWalkingOffTheEdgeOfBlocks:Lorg/rusherhack/core/setting/BooleanSetting;
        //   993: iconst_1       
        //   994: dup            
        //   995: dup            
        //   996: pop2           
        //   997: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1000: dup            
        //  1001: iconst_0       
        //  1002: aload_0        
        //  1003: getfield        org/rusherhack/Scaffold.sneakAtTheEdgeOfBlocks:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1006: aastore        
        //  1007: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1010: aload_0        
        //  1011: getfield        org/rusherhack/Scaffold.placeBlocksAroundYou:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1014: iconst_3       
        //  1015: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1018: dup            
        //  1019: iconst_0       
        //  1020: aload_0        
        //  1021: getfield        org/rusherhack/Scaffold.range:Lorg/rusherhack/core/setting/NumberSetting;
        //  1024: aastore        
        //  1025: dup            
        //  1026: iconst_1       
        //  1027: dup            
        //  1028: dup            
        //  1029: pop2           
        //  1030: aload_0        
        //  1031: getfield        org/rusherhack/Scaffold.onlyPlaceBlocksInFrontOfYou:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1034: aastore        
        //  1035: dup            
        //  1036: iconst_2       
        //  1037: aload_0        
        //  1038: getfield        org/rusherhack/Scaffold.onlyExpandWhileMoving:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1041: aastore        
        //  1042: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1045: aload_0        
        //  1046: getfield        org/rusherhack/Scaffold.buildUpFaster:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1049: iconst_1       
        //  1050: dup            
        //  1051: dup            
        //  1052: pop2           
        //  1053: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1056: dup            
        //  1057: iconst_0       
        //  1058: aload_0        
        //  1059: getfield        org/rusherhack/Scaffold.f2985:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1062: aastore        
        //  1063: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1066: aload_0        
        //  1067: getfield        org/rusherhack/Scaffold.rotate:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1070: iconst_4       
        //  1071: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1074: dup            
        //  1075: iconst_0       
        //  1076: aload_0        
        //  1077: getfield        org/rusherhack/Scaffold.f2988:Lorg/rusherhack/core/setting/NumberSetting;
        //  1080: aastore        
        //  1081: dup            
        //  1082: iconst_1       
        //  1083: dup            
        //  1084: dup            
        //  1085: pop2           
        //  1086: aload_0        
        //  1087: getfield        org/rusherhack/Scaffold.f2998:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1090: aastore        
        //  1091: dup            
        //  1092: iconst_2       
        //  1093: aload_0        
        //  1094: getfield        org/rusherhack/Scaffold.adjustRotationsForUpdatedNcp:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1097: aastore        
        //  1098: dup            
        //  1099: iconst_3       
        //  1100: aload_0        
        //  1101: getfield        org/rusherhack/Scaffold.sendRotationsInstantly:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1104: aastore        
        //  1105: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1108: aload_0        
        //  1109: getfield        org/rusherhack/Scaffold.f2998:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1112: iconst_1       
        //  1113: dup            
        //  1114: dup            
        //  1115: pop2           
        //  1116: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1119: dup            
        //  1120: iconst_0       
        //  1121: aload_0        
        //  1122: getfield        org/rusherhack/Scaffold.f2981:Lorg/rusherhack/core/setting/NumberSetting;
        //  1125: aastore        
        //  1126: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1129: aload_0        
        //  1130: getfield        org/rusherhack/Scaffold.render:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1133: iconst_3       
        //  1134: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1137: dup            
        //  1138: iconst_0       
        //  1139: aload_0        
        //  1140: getfield        org/rusherhack/Scaffold.color:Lorg/rusherhack/client/api/setting/ColorSetting;
        //  1143: aastore        
        //  1144: dup            
        //  1145: iconst_1       
        //  1146: dup            
        //  1147: dup            
        //  1148: pop2           
        //  1149: aload_0        
        //  1150: getfield        org/rusherhack/Scaffold.widthOfOutline:Lorg/rusherhack/core/setting/NumberSetting;
        //  1153: aastore        
        //  1154: dup            
        //  1155: iconst_2       
        //  1156: aload_0        
        //  1157: getfield        org/rusherhack/Scaffold.hideHiddenSides:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1160: aastore        
        //  1161: invokevirtual   org/rusherhack/core/setting/Setting.addSubSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1164: aload_0        
        //  1165: sipush          6547
        //  1168: ldc2_w          79868114492694034
        //  1171: lload_1        
        //  1172: lxor           
        //  1173: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //  1178: anewarray       Lorg/rusherhack/core/setting/Setting;
        //  1181: dup            
        //  1182: iconst_0       
        //  1183: aload_0        
        //  1184: getfield        org/rusherhack/Scaffold.blocks:Lorg/rusherhack/core/setting/EnumSetting;
        //  1187: aastore        
        //  1188: dup            
        //  1189: iconst_1       
        //  1190: dup            
        //  1191: dup            
        //  1192: pop2           
        //  1193: aload_0        
        //  1194: getfield        org/rusherhack/Scaffold.automaticallySwapToTheBlock:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1197: aastore        
        //  1198: dup            
        //  1199: iconst_2       
        //  1200: aload_0        
        //  1201: getfield        org/rusherhack/Scaffold.preventsYouFromWalkingOffTheEdgeOfBlocks:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1204: aastore        
        //  1205: dup            
        //  1206: iconst_3       
        //  1207: aload_0        
        //  1208: getfield        org/rusherhack/Scaffold.placeBlocksAroundYou:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1211: aastore        
        //  1212: dup            
        //  1213: iconst_4       
        //  1214: aload_0        
        //  1215: getfield        org/rusherhack/Scaffold.buildUpFaster:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1218: aastore        
        //  1219: dup            
        //  1220: iconst_5       
        //  1221: aload_0        
        //  1222: getfield        org/rusherhack/Scaffold.allowsYouToSprintOnCertainAnticheats:Lorg/rusherhack/core/setting/EnumSetting;
        //  1225: aastore        
        //  1226: dup            
        //  1227: sipush          1919
        //  1230: ldc2_w          8662392217574932733
        //  1233: lload_1        
        //  1234: lxor           
        //  1235: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //  1240: aload_0        
        //  1241: getfield        org/rusherhack/Scaffold.allowsYouToJumpWithoutIncreasingHeight:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1244: aastore        
        //  1245: dup            
        //  1246: sipush          8417
        //  1249: ldc2_w          4115797564444845922
        //  1252: lload_1        
        //  1253: lxor           
        //  1254: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //  1259: aload_0        
        //  1260: getfield        org/rusherhack/Scaffold.delayBetweenBlockPlacements:Lorg/rusherhack/core/setting/NumberSetting;
        //  1263: aastore        
        //  1264: dup            
        //  1265: sipush          2549
        //  1268: ldc2_w          2899066434996702835
        //  1271: lload_1        
        //  1272: lxor           
        //  1273: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //  1278: aload_0        
        //  1279: getfield        org/rusherhack/Scaffold.strictdir:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1282: aastore        
        //  1283: dup            
        //  1284: sipush          25955
        //  1287: ldc2_w          7174305800824218347
        //  1290: lload_1        
        //  1291: lxor           
        //  1292: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //  1297: aload_0        
        //  1298: getfield        org/rusherhack/Scaffold.raytrace:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1301: aastore        
        //  1302: dup            
        //  1303: sipush          9317
        //  1306: ldc2_w          6982900953175729134
        //  1309: lload_1        
        //  1310: lxor           
        //  1311: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //  1316: aload_0        
        //  1317: getfield        org/rusherhack/Scaffold.rotate:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1320: aastore        
        //  1321: dup            
        //  1322: sipush          14008
        //  1325: ldc2_w          5925360457404297525
        //  1328: lload_1        
        //  1329: lxor           
        //  1330: invokedynamic   BootstrapMethod #1, c:(IJ)I
        //  1335: aload_0        
        //  1336: getfield        org/rusherhack/Scaffold.render:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1339: aastore        
        //  1340: invokevirtual   org/rusherhack/client/api/feature/module/Module.registerSettings:([Lorg/rusherhack/core/setting/Setting;)V
        //  1343: aload_0        
        //  1344: dup            
        //  1345: dup_x1         
        //  1346: dup2           
        //  1347: dup2           
        //  1348: dup2           
        //  1349: dup2           
        //  1350: dup2           
        //  1351: dup2           
        //  1352: dup2           
        //  1353: dup2           
        //  1354: dup2           
        //  1355: dup2           
        //  1356: dup2           
        //  1357: dup2           
        //  1358: dup2           
        //  1359: dup2           
        //  1360: dup2           
        //  1361: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1364: getstatic       net.minecraft.block.Blocks.GRAVEL:Lnet.minecraft.block.Block;
        //  1367: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1370: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1373: getstatic       net.minecraft.block.Blocks.SAND:Lnet.minecraft.block.Block;
        //  1376: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1379: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1382: getstatic       net.minecraft.block.Blocks.ANVIL:Lnet.minecraft.block.Block;
        //  1385: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1388: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1391: getstatic       net.minecraft.block.Blocks.CHIPPED_ANVIL:Lnet.minecraft.block.Block;
        //  1394: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1397: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1400: getstatic       net.minecraft.block.Blocks.DAMAGED_ANVIL:Lnet.minecraft.block.Block;
        //  1403: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1406: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1409: getstatic       net.minecraft.block.Blocks.COBWEB:Lnet.minecraft.block.Block;
        //  1412: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1415: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1418: getstatic       net.minecraft.block.Blocks.SWEET_BERRY_BUSH:Lnet.minecraft.block.Block;
        //  1421: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1424: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1427: getstatic       net.minecraft.block.Blocks.POWDER_SNOW:Lnet.minecraft.block.Block;
        //  1430: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1433: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1436: getstatic       net.minecraft.block.Blocks.CHEST:Lnet.minecraft.block.Block;
        //  1439: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1442: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1445: getstatic       net.minecraft.block.Blocks.ENDER_CHEST:Lnet.minecraft.block.Block;
        //  1448: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1451: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1454: getstatic       net.minecraft.block.Blocks.ENCHANTING_TABLE:Lnet.minecraft.block.Block;
        //  1457: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1460: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1463: getstatic       net.minecraft.block.Blocks.CAULDRON:Lnet.minecraft.block.Block;
        //  1466: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1469: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1472: getstatic       net.minecraft.block.Blocks.HOPPER:Lnet.minecraft.block.Block;
        //  1475: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1478: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1481: getstatic       net.minecraft.block.Blocks.SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1484: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1487: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1490: getstatic       net.minecraft.block.Blocks.WHITE_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1493: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1496: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1499: getstatic       net.minecraft.block.Blocks.ORANGE_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1502: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1505: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1508: getstatic       net.minecraft.block.Blocks.MAGENTA_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1511: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1514: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1517: getstatic       net.minecraft.block.Blocks.LIGHT_BLUE_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1520: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1523: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1526: getstatic       net.minecraft.block.Blocks.YELLOW_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1529: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1532: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1535: getstatic       net.minecraft.block.Blocks.LIME_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1538: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1541: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1544: getstatic       net.minecraft.block.Blocks.PINK_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1547: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1550: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1553: getstatic       net.minecraft.block.Blocks.GRAY_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1556: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1559: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1562: getstatic       net.minecraft.block.Blocks.LIGHT_GRAY_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1565: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1568: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1571: getstatic       net.minecraft.block.Blocks.CYAN_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1574: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1577: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1580: getstatic       net.minecraft.block.Blocks.PURPLE_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1583: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1586: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1589: getstatic       net.minecraft.block.Blocks.BLUE_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1592: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1595: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1598: getstatic       net.minecraft.block.Blocks.BROWN_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1601: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1604: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1607: getstatic       net.minecraft.block.Blocks.GREEN_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1610: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1613: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1616: getstatic       net.minecraft.block.Blocks.RED_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1619: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1622: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1625: getstatic       net.minecraft.block.Blocks.BLACK_SHULKER_BOX:Lnet.minecraft.block.Block;
        //  1628: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1631: getfield        org/rusherhack/Scaffold.f2999:Lorg/rusherhack/Class200;
        //  1634: getstatic       net.minecraft.block.Blocks.STONE:Lnet.minecraft.block.Block;
        //  1637: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1640: getfield        org/rusherhack/Scaffold.f2999:Lorg/rusherhack/Class200;
        //  1643: getstatic       net.minecraft.block.Blocks.COBBLESTONE:Lnet.minecraft.block.Block;
        //  1646: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1649: getfield        org/rusherhack/Scaffold.f2999:Lorg/rusherhack/Class200;
        //  1652: getstatic       net.minecraft.block.Blocks.OBSIDIAN:Lnet.minecraft.block.Block;
        //  1655: invokevirtual   org/rusherhack/Class200.m7840:(Lnet.minecraft.block.Block;)V
        //  1658: getstatic       org/rusherhack/Class170.f3364:Lorg/rusherhack/Class170;
        //  1661: invokevirtual   org/rusherhack/Class170.m7112:()Lorg/rusherhack/Class221;
        //  1664: aload_0        
        //  1665: dup            
        //  1666: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1669: swap           
        //  1670: getfield        org/rusherhack/Scaffold.f2974:Lorg/rusherhack/Class200;
        //  1673: invokevirtual   org/rusherhack/Class221.m8473:(Lorg/rusherhack/core/serialize/ISerializable;Lorg/rusherhack/client/api/config/Configuration;)V
        //  1676: getstatic       org/rusherhack/Class170.f3364:Lorg/rusherhack/Class170;
        //  1679: invokevirtual   org/rusherhack/Class170.m7112:()Lorg/rusherhack/Class221;
        //  1682: aload_0        
        //  1683: dup            
        //  1684: getfield        org/rusherhack/Scaffold.f2999:Lorg/rusherhack/Class200;
        //  1687: swap           
        //  1688: getfield        org/rusherhack/Scaffold.f2999:Lorg/rusherhack/Class200;
        //  1691: invokevirtual   org/rusherhack/Class221.m8473:(Lorg/rusherhack/core/serialize/ISerializable;Lorg/rusherhack/client/api/config/Configuration;)V
        //  1694: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039_2:
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
    
    @Subscribe(stage = Stage.POST)
    private void m6470(final Obf301 obf301) {
        
    }
    
    private BlockHitResult m6471(final BlockPos p0, final BlockState p1, final VoxelShape p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          36080357655328
        //     6: lxor           
        //     7: lstore          4
        //     9: invokestatic    org/rusherhack/Class253.m9154:()I
        //    12: istore          6
        //    14: aload_0        
        //    15: aload_1        
        //    16: astore_0       
        //    17: astore_1       
        //    18: aload_2        
        //    19: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    22: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    25: aload_0        
        //    26: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.canPlaceAt:(Lnet.minecraft.world.WorldView;Lnet.minecraft.util.math.BlockPos;)Z
        //    29: ifne            38
        //    32: aconst_null    
        //    33: areturn        
        //    34: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    37: athrow         
        //    38: aload_0        
        //    39: aload_3        
        //    40: aload_1        
        //    41: getfield        org/rusherhack/Scaffold.strictdir:Lorg/rusherhack/core/setting/BooleanSetting;
        //    44: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    47: checkcast       Ljava/lang/Boolean;
        //    50: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    53: aload_1        
        //    54: getfield        org/rusherhack/Scaffold.raytrace:Lorg/rusherhack/core/setting/BooleanSetting;
        //    57: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    60: checkcast       Ljava/lang/Boolean;
        //    63: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    66: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    69: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //    72: invokevirtual   net.minecraft.entity.player.PlayerEntity.getBlockInteractionRange:()D
        //    75: invokestatic    org/rusherhack/Util416.m13457:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.shape.VoxelShape;ZZD)Lnet.minecraft.util.hit.BlockHitResult;
        //    78: dup            
        //    79: astore_0       
        //    80: iload           6
        //    82: ifne            102
        //    85: ifnonnull       101
        //    88: goto            95
        //    91: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    94: athrow         
        //    95: aconst_null    
        //    96: areturn        
        //    97: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   100: athrow         
        //   101: aload_0        
        //   102: iload           6
        //   104: ifne            313
        //   107: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //   110: getstatic       net.minecraft.util.math.Direction.UP:Lnet.minecraft.util.math.Direction;
        //   113: if_acmpeq       312
        //   116: goto            123
        //   119: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   122: athrow         
        //   123: aload_2        
        //   124: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //   127: instanceof      Lnet.minecraft.block.SlabBlock;
        //   130: iload           6
        //   132: ifne            213
        //   135: goto            142
        //   138: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   141: athrow         
        //   142: ifne            181
        //   145: goto            152
        //   148: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   151: athrow         
        //   152: aload_2        
        //   153: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //   156: instanceof      Lnet.minecraft.block.StairsBlock;
        //   159: iload           6
        //   161: ifne            213
        //   164: goto            171
        //   167: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   170: athrow         
        //   171: ifeq            312
        //   174: goto            181
        //   177: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   180: athrow         
        //   181: aload_1        
        //   182: iload           6
        //   184: ifne            217
        //   187: goto            194
        //   190: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   193: athrow         
        //   194: getfield        org/rusherhack/Scaffold.allowsYouToJumpWithoutIncreasingHeight:Lorg/rusherhack/core/setting/BooleanSetting;
        //   197: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   200: checkcast       Ljava/lang/Boolean;
        //   203: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   206: goto            213
        //   209: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   212: athrow         
        //   213: ifeq            223
        //   216: aload_1        
        //   217: getfield        org/rusherhack/Scaffold.f2976:D
        //   220: goto            247
        //   223: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   226: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   229: invokevirtual   net.minecraft.entity.Entity.getY:()D
        //   232: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   235: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   238: invokeinterface net.minecraft.world.HeightLimitView.getTopY:()I
        //   243: i2d            
        //   244: invokestatic    java/lang/Math.min:(DD)D
        //   247: dstore          7
        //   249: dload           7
        //   251: dup2           
        //   252: invokestatic    net.minecraft.util.math.MathHelper.floor:(D)I
        //   255: i2d            
        //   256: dcmpl          
        //   257: ifne            312
        //   260: aload_0        
        //   261: invokevirtual   net.minecraft.util.hit.HitResult.getPos:()Lnet.minecraft.util.math.Vec3d;
        //   264: astore_2       
        //   265: new             Lnet.minecraft.util.hit.BlockHitResult;
        //   268: dup            
        //   269: new             Lnet.minecraft.util.math.Vec3d;
        //   272: dup            
        //   273: aload_2        
        //   274: getfield        net.minecraft.util.math.Vec3d.x:D
        //   277: aload_2        
        //   278: getfield        net.minecraft.util.math.Vec3d.y:D
        //   281: invokestatic    net.minecraft.util.math.MathHelper.floor:(D)I
        //   284: i2d            
        //   285: ldc2_w          0.9
        //   288: dadd           
        //   289: aload_2        
        //   290: getfield        net.minecraft.util.math.Vec3d.z:D
        //   293: invokespecial   net.minecraft.util.math.Vec3d.<init>:(DDD)V
        //   296: aload_0        
        //   297: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //   300: aload_0        
        //   301: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   304: aload_0        
        //   305: invokevirtual   net.minecraft.util.hit.BlockHitResult.isInsideBlock:()Z
        //   308: invokespecial   net.minecraft.util.hit.BlockHitResult.<init>:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Direction;Lnet.minecraft.util.math.BlockPos;Z)V
        //   311: areturn        
        //   312: aload_0        
        //   313: areturn        
        //    StackMapTable: 00 1A FF 00 22 00 06 07 01 1C 07 00 02 07 02 1F 07 04 18 04 01 00 01 07 00 5C 03 FF 00 34 00 06 07 01 1F 07 00 02 07 02 1F 07 04 18 04 01 00 01 07 00 5C 03 41 07 00 5C 03 40 07 01 1F 50 07 00 5C 03 4E 07 00 5C 43 01 45 07 00 5C 03 4E 07 00 5C 43 01 45 07 00 5C 03 48 07 00 5C 43 07 00 02 4E 07 00 5C 43 01 43 07 00 02 05 57 03 FB 00 40 40 07 01 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  18     34     34     38     Ljava/lang/MatchException;
        //  80     88     91     95     Ljava/lang/MatchException;
        //  85     97     97     101    Ljava/lang/MatchException;
        //  102    116    119    123    Ljava/lang/MatchException;
        //  107    135    138    142    Ljava/lang/MatchException;
        //  123    145    148    152    Ljava/lang/MatchException;
        //  142    164    167    171    Ljava/lang/MatchException;
        //  152    174    177    181    Ljava/lang/MatchException;
        //  171    187    190    194    Ljava/lang/MatchException;
        //  181    206    209    213    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0123:
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
    private void m6473(final Class499 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          112872147503267
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9155:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: aload_1        
        //    15: astore_0       
        //    16: astore_1       
        //    17: aload_1        
        //    18: getfield        org/rusherhack/Scaffold.preventsYouFromWalkingOffTheEdgeOfBlocks:Lorg/rusherhack/core/setting/BooleanSetting;
        //    21: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    24: checkcast       Ljava/lang/Boolean;
        //    27: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    30: iload           4
        //    32: ifeq            65
        //    35: ifeq            141
        //    38: goto            45
        //    41: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    44: athrow         
        //    45: aload_1        
        //    46: getfield        org/rusherhack/Scaffold.sneakAtTheEdgeOfBlocks:Lorg/rusherhack/core/setting/BooleanSetting;
        //    49: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    52: checkcast       Ljava/lang/Boolean;
        //    55: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    58: goto            65
        //    61: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    64: athrow         
        //    65: iload           4
        //    67: ifeq            83
        //    70: ifeq            141
        //    73: goto            80
        //    76: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    79: athrow         
        //    80: invokestatic    org/rusherhack/Safewalk.m359:()Z
        //    83: iload           4
        //    85: ifeq            133
        //    88: ifeq            141
        //    91: goto            98
        //    94: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    97: athrow         
        //    98: aload_0        
        //    99: iload           4
        //   101: ifeq            137
        //   104: goto            111
        //   107: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   110: athrow         
        //   111: invokevirtual   org/rusherhack/Obf249.m8984:()Lnet.minecraft.client.option.KeyBinding;
        //   114: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   117: getfield        net.minecraft.client.MinecraftClient.options:Lnet.minecraft.client.option.GameOptions;
        //   120: getfield        net.minecraft.client.option.GameOptions.sprintKey:Lnet.minecraft.client.option.KeyBinding;
        //   123: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   126: goto            133
        //   129: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   132: athrow         
        //   133: ifeq            141
        //   136: aload_0        
        //   137: iconst_0       
        //   138: invokevirtual   org/rusherhack/Class499.m15527:(Z)V
        //   141: return         
        //    StackMapTable: 00 0F FF 00 29 00 04 07 04 4E 07 00 02 04 01 00 01 07 00 5C 03 4F 07 00 5C 43 01 4A 07 00 5C 03 42 01 4A 07 00 5C 03 48 07 00 5C 43 07 04 4E 51 07 00 5C 43 01 43 07 04 4E 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  17     38     41     45     Ljava/lang/MatchException;
        //  35     58     61     65     Ljava/lang/MatchException;
        //  65     73     76     80     Ljava/lang/MatchException;
        //  83     91     94     98     Ljava/lang/MatchException;
        //  88     104    107    111    Ljava/lang/MatchException;
        //  98     126    129    133    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0098:
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
    
    @Subscribe
    private void m6474(final EventMove eventMove) {
        final long n = Scaffold.f3013 ^ 0x6DE9926B910DL;
        final int m9155 = Class253.m9155();
        Label_0045: {
            try {
                if (m9155 == 0) {
                    break Label_0045;
                }
                final Scaffold scaffold = this;
                final BooleanSetting booleanSetting = scaffold.preventsYouFromWalkingOffTheEdgeOfBlocks;
                final Object o = ((Setting)booleanSetting).getValue();
                final Boolean b = (Boolean)o;
                final boolean b2 = b;
                if (b2) {
                    break Label_0045;
                }
                return;
            }
            catch (final MatchException ex) {
                ex.printStackTrace();
            }
            try {
                final Scaffold scaffold = this;
                final BooleanSetting booleanSetting = scaffold.preventsYouFromWalkingOffTheEdgeOfBlocks;
                final Object o = ((Setting)booleanSetting).getValue();
                final Boolean b = (Boolean)o;
                final boolean b2 = b;
                if (!b2) {
                    return;
                }
                Safewalk.f4227.f4232 = false;
            }
            catch (final MatchException ex2) {
                ex2.printStackTrace();
            }
        }
        Safewalk.f4227.m8731((Entity)Globals.mc.player, eventMove, (boolean)((Setting)this.sneakAtTheEdgeOfBlocks).getValue());
    }
    
    private float m6475(final Vec3d vec3d) {
        return 0.0f;
    }
    
    @Subscribe
    private void m6476(final EventPacket$Send eventPacket$Send) {
        
    }
    
    public void onEnable() {
        final long n = Scaffold.f3013 ^ 0x733FB144CD9DL;
        final double f2976 = -999.0;
        final Pair<BlockPos, BlockHitResult> f2977 = null;
        this.f2996.clear();
        this.f3008 = f2977;
        this.f2976 = f2976;
    }
    
    private SortedMap<BlockPos, BlockHitResult> m6478(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          99883662729608
        //     6: lxor           
        //     7: lstore_2       
        //     8: aload_0        
        //     9: astore          5
        //    11: invokestatic    org/rusherhack/Class253.m9155:()I
        //    14: new             Ljava/util/TreeMap;
        //    17: dup            
        //    18: invokedynamic   BootstrapMethod #4, applyAsDouble:()Ljava/util/function/ToDoubleFunction;
        //    23: invokestatic    java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
        //    26: invokespecial   java/util/TreeMap.<init>:(Ljava/util/Comparator;)V
        //    29: astore          14
        //    31: istore          4
        //    33: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    36: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //    39: getfield        net.minecraft.entity.player.PlayerEntity.playerScreenHandler:Lnet.minecraft.screen.PlayerScreenHandler;
        //    42: iload_1        
        //    43: invokevirtual   net.minecraft.screen.ScreenHandler.getSlot:(I)Lnet.minecraft.screen.slot.Slot;
        //    46: invokevirtual   net.minecraft.screen.slot.Slot.getStack:()Lnet.minecraft.item.ItemStack;
        //    49: invokevirtual   net.minecraft.item.ItemStack.getItem:()Lnet.minecraft.item.Item;
        //    52: dup            
        //    53: astore          6
        //    55: iload           4
        //    57: ifeq            82
        //    60: instanceof      Lnet.minecraft.item.BlockItem;
        //    63: ifeq            90
        //    66: goto            73
        //    69: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    72: athrow         
        //    73: aload           6
        //    75: goto            82
        //    78: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    81: athrow         
        //    82: checkcast       Lnet.minecraft.item.BlockItem;
        //    85: dup            
        //    86: astore_1       
        //    87: goto            93
        //    90: aload           14
        //    92: areturn        
        //    93: invokevirtual   net.minecraft.item.BlockItem.getBlock:()Lnet.minecraft.block.Block;
        //    96: dup            
        //    97: astore          6
        //    99: invokevirtual   net.minecraft.block.Block.getDefaultState:()Lnet.minecraft.block.BlockState;
        //   102: dup            
        //   103: astore_1       
        //   104: dup            
        //   105: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   108: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   111: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   114: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getCollisionShape:(Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.util.shape.VoxelShape;
        //   117: astore          6
        //   119: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   122: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   125: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   128: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isFullCube:(Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)Z
        //   131: ifeq            142
        //   134: dconst_1       
        //   135: goto            150
        //   138: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   141: athrow         
        //   142: aload           6
        //   144: getstatic       net.minecraft.util.math.Direction.Axis.Y:Lnet.minecraft.util.math.Direction.Axis;
        //   147: invokevirtual   net.minecraft.util.shape.VoxelShape.getMax:(Lnet.minecraft.util.math.Direction.Axis;)D
        //   150: dstore          8
        //   152: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   155: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   158: invokevirtual   net.minecraft.entity.Entity.getY:()D
        //   161: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   164: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   167: invokeinterface net.minecraft.world.HeightLimitView.getTopY:()I
        //   172: i2d            
        //   173: invokestatic    java/lang/Math.min:(DD)D
        //   176: dstore          10
        //   178: aload           5
        //   180: iload           4
        //   182: ifeq            303
        //   185: getfield        org/rusherhack/Scaffold.f2976:D
        //   188: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   191: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   194: invokeinterface net.minecraft.world.WorldView.getBottomY:()I
        //   199: i2d            
        //   200: dcmpg          
        //   201: iflt            301
        //   204: goto            211
        //   207: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   210: athrow         
        //   211: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   214: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   217: invokevirtual   net.minecraft.entity.Entity.isOnGround:()Z
        //   220: iload           4
        //   222: ifeq            261
        //   225: goto            232
        //   228: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   231: athrow         
        //   232: ifne            301
        //   235: goto            242
        //   238: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   241: athrow         
        //   242: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   245: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   248: getfield        net.minecraft.client.network.ClientPlayerEntity.input:Lnet.minecraft.client.input.Input;
        //   251: getfield        net.minecraft.client.input.Input.jumping:Z
        //   254: goto            261
        //   257: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   260: athrow         
        //   261: iload           4
        //   263: ifeq            334
        //   266: ifeq            308
        //   269: goto            276
        //   272: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   275: athrow         
        //   276: invokestatic    org/rusherhack/client/api/utils/PlayerUtils.hasHorizontalInput:()Z
        //   279: iload           4
        //   281: ifeq            334
        //   284: goto            291
        //   287: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   290: athrow         
        //   291: ifne            308
        //   294: goto            301
        //   297: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   300: athrow         
        //   301: aload           5
        //   303: dload           10
        //   305: putfield        org/rusherhack/Scaffold.f2976:D
        //   308: aload           5
        //   310: iload           4
        //   312: ifeq            339
        //   315: getfield        org/rusherhack/Scaffold.allowsYouToJumpWithoutIncreasingHeight:Lorg/rusherhack/core/setting/BooleanSetting;
        //   318: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   321: checkcast       Ljava/lang/Boolean;
        //   324: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   327: goto            334
        //   330: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   333: athrow         
        //   334: ifeq            345
        //   337: aload           5
        //   339: getfield        org/rusherhack/Scaffold.f2976:D
        //   342: goto            347
        //   345: dload           10
        //   347: dstore          12
        //   349: dload           12
        //   351: dload           8
        //   353: dsub           
        //   354: invokestatic    net.minecraft.util.math.MathHelper.floor:(D)I
        //   357: istore          7
        //   359: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   362: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   365: invokevirtual   net.minecraft.entity.Entity.getVelocity:()Lnet.minecraft.util.math.Vec3d;
        //   368: dup            
        //   369: astore          8
        //   371: getfield        net.minecraft.util.math.Vec3d.x:D
        //   374: invokestatic    java/lang/Math.abs:(D)D
        //   377: ldc2_w          0.01
        //   380: dcmpl          
        //   381: iload           4
        //   383: ifeq            441
        //   386: ifgt            430
        //   389: goto            396
        //   392: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   395: athrow         
        //   396: aload           8
        //   398: getfield        net.minecraft.util.math.Vec3d.z:D
        //   401: invokestatic    java/lang/Math.abs:(D)D
        //   404: ldc2_w          0.01
        //   407: dcmpl          
        //   408: iload           4
        //   410: ifeq            445
        //   413: goto            420
        //   416: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   419: athrow         
        //   420: ifle            444
        //   423: goto            430
        //   426: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   429: athrow         
        //   430: iconst_1       
        //   431: dup            
        //   432: dup            
        //   433: pop2           
        //   434: goto            441
        //   437: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   440: athrow         
        //   441: goto            448
        //   444: iconst_0       
        //   445: iconst_1       
        //   446: dup            
        //   447: pop2           
        //   448: istore          9
        //   450: iconst_0       
        //   451: dup            
        //   452: istore_0       
        //   453: iload           9
        //   455: ifeq            496
        //   458: aload           5
        //   460: getfield        org/rusherhack/Scaffold.f2984:Lorg/rusherhack/core/setting/NumberSetting;
        //   463: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   466: checkcast       Ljava/lang/Integer;
        //   469: invokevirtual   java/lang/Integer.intValue:()I
        //   472: iconst_1       
        //   473: dup            
        //   474: dup            
        //   475: pop2           
        //   476: iadd           
        //   477: iload           4
        //   479: ifeq            497
        //   482: goto            489
        //   485: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   488: athrow         
        //   489: goto            500
        //   492: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   495: athrow         
        //   496: iconst_1       
        //   497: dup            
        //   498: dup            
        //   499: pop2           
        //   500: if_icmpge       903
        //   503: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   506: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   509: iload_0        
        //   510: invokestatic    org/rusherhack/Class006.m307:(Lnet.minecraft.entity.LivingEntity;I)Lnet.minecraft.util.math.Vec3d;
        //   513: astore          10
        //   515: new             Lnet.minecraft.util.math.BlockPos;
        //   518: dup            
        //   519: aload           10
        //   521: getfield        net.minecraft.util.math.Vec3d.x:D
        //   524: invokestatic    net.minecraft.util.math.MathHelper.floor:(D)I
        //   527: iload           7
        //   529: aload           10
        //   531: getfield        net.minecraft.util.math.Vec3d.z:D
        //   534: invokestatic    net.minecraft.util.math.MathHelper.floor:(D)I
        //   537: invokespecial   net.minecraft.util.math.BlockPos.<init>:(III)V
        //   540: dup            
        //   541: astore          11
        //   543: invokestatic    org/rusherhack/client/api/utils/WorldUtils.isReplaceble:(Lnet.minecraft.util.math.BlockPos;)Z
        //   546: iload           4
        //   548: ifeq            581
        //   551: ifne            573
        //   554: goto            561
        //   557: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   560: athrow         
        //   561: iload           4
        //   563: ifne            896
        //   566: goto            573
        //   569: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   572: athrow         
        //   573: iconst_0       
        //   574: goto            581
        //   577: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   580: athrow         
        //   581: istore          12
        //   583: aconst_null    
        //   584: astore          13
        //   586: invokestatic    net.minecraft.util.math.Direction.values:()[Lnet.minecraft.util.math.Direction;
        //   589: dup            
        //   590: astore          15
        //   592: arraylength    
        //   593: istore          16
        //   595: iconst_0       
        //   596: dup            
        //   597: istore          17
        //   599: iload           16
        //   601: if_icmpge       832
        //   604: aload           15
        //   606: iload           17
        //   608: aaload         
        //   609: dup            
        //   610: astore          18
        //   612: iload           4
        //   614: ifeq            952
        //   617: getstatic       net.minecraft.util.math.Direction.UP:Lnet.minecraft.util.math.Direction;
        //   620: if_acmpne       642
        //   623: goto            630
        //   626: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   629: athrow         
        //   630: iload           4
        //   632: ifne            824
        //   635: goto            642
        //   638: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   641: athrow         
        //   642: aload           11
        //   644: aload           18
        //   646: invokevirtual   net.minecraft.util.math.BlockPos.offset:(Lnet.minecraft.util.math.Direction;)Lnet.minecraft.util.math.BlockPos;
        //   649: dup            
        //   650: astore          18
        //   652: invokestatic    org/rusherhack/client/api/utils/WorldUtils.isReplaceble:(Lnet.minecraft.util.math.BlockPos;)Z
        //   655: iload           4
        //   657: ifeq            677
        //   660: ifne            680
        //   663: goto            670
        //   666: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   669: athrow         
        //   670: iconst_1       
        //   671: dup            
        //   672: dup            
        //   673: pop2           
        //   674: dup            
        //   675: istore          12
        //   677: goto            834
        //   680: invokestatic    net.minecraft.util.math.Direction.values:()[Lnet.minecraft.util.math.Direction;
        //   683: dup            
        //   684: astore          19
        //   686: arraylength    
        //   687: istore          20
        //   689: iconst_0       
        //   690: dup            
        //   691: istore          21
        //   693: iload           20
        //   695: if_icmpge       824
        //   698: aload           19
        //   700: iload           21
        //   702: aaload         
        //   703: dup            
        //   704: astore          22
        //   706: invokevirtual   net.minecraft.util.math.Direction.getAxis:()Lnet.minecraft.util.math.Direction.Axis;
        //   709: iload           4
        //   711: ifeq            952
        //   714: getstatic       net.minecraft.util.math.Direction.Axis.Y:Lnet.minecraft.util.math.Direction.Axis;
        //   717: if_acmpne       739
        //   720: goto            727
        //   723: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   726: athrow         
        //   727: iload           4
        //   729: ifne            809
        //   732: goto            739
        //   735: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   738: athrow         
        //   739: aload           18
        //   741: aload           22
        //   743: invokevirtual   net.minecraft.util.math.BlockPos.offset:(Lnet.minecraft.util.math.Direction;)Lnet.minecraft.util.math.BlockPos;
        //   746: invokestatic    org/rusherhack/client/api/utils/WorldUtils.isReplaceble:(Lnet.minecraft.util.math.BlockPos;)Z
        //   749: iload           4
        //   751: ifeq            821
        //   754: goto            761
        //   757: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   760: athrow         
        //   761: ifne            809
        //   764: goto            771
        //   767: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   770: athrow         
        //   771: aload           18
        //   773: astore          13
        //   775: iload           4
        //   777: ifeq            819
        //   780: aload           22
        //   782: aload           5
        //   784: getfield        org/rusherhack/Scaffold.f3012:Lnet.minecraft.util.math.Direction;
        //   787: if_acmpeq       809
        //   790: goto            797
        //   793: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   796: athrow         
        //   797: iload           4
        //   799: ifne            824
        //   802: goto            809
        //   805: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   808: athrow         
        //   809: iinc            21, 1
        //   812: goto            819
        //   815: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   818: athrow         
        //   819: iload           21
        //   821: goto            693
        //   824: iinc            17, 1
        //   827: iload           17
        //   829: goto            599
        //   832: iload           12
        //   834: ifeq            864
        //   837: aload           14
        //   839: dup            
        //   840: aload           5
        //   842: aload           11
        //   844: dup_x1         
        //   845: aload_1        
        //   846: aload           6
        //   848: invokevirtual   org/rusherhack/Scaffold.m6471:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.block.BlockState;Lnet.minecraft.util.shape.VoxelShape;)Lnet.minecraft.util.hit.BlockHitResult;
        //   851: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   856: pop            
        //   857: goto            905
        //   860: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   863: athrow         
        //   864: aload           13
        //   866: ifnull          903
        //   869: aload           14
        //   871: dup            
        //   872: aload           5
        //   874: aload           13
        //   876: dup_x1         
        //   877: aload_1        
        //   878: aload           6
        //   880: invokevirtual   org/rusherhack/Scaffold.m6471:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.block.BlockState;Lnet.minecraft.util.shape.VoxelShape;)Lnet.minecraft.util.hit.BlockHitResult;
        //   883: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   888: pop            
        //   889: goto            905
        //   892: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   895: athrow         
        //   896: iinc            0, 1
        //   899: iload_0        
        //   900: goto            453
        //   903: aload           14
        //   905: invokeinterface java/util/Map.isEmpty:()Z
        //   910: iload           4
        //   912: ifeq            958
        //   915: ifeq            944
        //   918: goto            925
        //   921: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   924: athrow         
        //   925: aload           14
        //   927: getstatic       net.minecraft.util.math.BlockPos.ORIGIN:Lnet.minecraft.util.math.BlockPos;
        //   930: aconst_null    
        //   931: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   936: pop            
        //   937: goto            944
        //   940: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   943: athrow         
        //   944: aload           5
        //   946: getfield        org/rusherhack/Scaffold.placeBlocksAroundYou:Lorg/rusherhack/core/setting/BooleanSetting;
        //   949: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   952: checkcast       Ljava/lang/Boolean;
        //   955: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   958: iload           4
        //   960: ifeq            994
        //   963: ifeq            1034
        //   966: goto            973
        //   969: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   972: athrow         
        //   973: aload           5
        //   975: getfield        org/rusherhack/Scaffold.onlyExpandWhileMoving:Lorg/rusherhack/core/setting/BooleanSetting;
        //   978: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   981: checkcast       Ljava/lang/Boolean;
        //   984: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   987: goto            994
        //   990: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   993: athrow         
        //   994: iload           4
        //   996: ifeq            1055
        //   999: ifeq            1041
        //  1002: goto            1009
        //  1005: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1008: athrow         
        //  1009: invokestatic    org/rusherhack/client/api/utils/PlayerUtils.hasHorizontalInput:()Z
        //  1012: iload           4
        //  1014: ifeq            1055
        //  1017: goto            1024
        //  1020: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1023: athrow         
        //  1024: ifne            1041
        //  1027: goto            1034
        //  1030: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1033: athrow         
        //  1034: aload           14
        //  1036: areturn        
        //  1037: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1040: athrow         
        //  1041: aload           5
        //  1043: getfield        org/rusherhack/Scaffold.onlyPlaceBlocksInFrontOfYou:Lorg/rusherhack/core/setting/BooleanSetting;
        //  1046: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1049: checkcast       Ljava/lang/Boolean;
        //  1052: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1055: iload           4
        //  1057: ifeq            1081
        //  1060: ifeq            1287
        //  1063: goto            1070
        //  1066: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1069: athrow         
        //  1070: iconst_1       
        //  1071: dup            
        //  1072: dup            
        //  1073: pop2           
        //  1074: goto            1081
        //  1077: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1080: athrow         
        //  1081: dup            
        //  1082: istore_0       
        //  1083: aload           5
        //  1085: getfield        org/rusherhack/Scaffold.range:Lorg/rusherhack/core/setting/NumberSetting;
        //  1088: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1091: checkcast       Ljava/lang/Integer;
        //  1094: invokevirtual   java/lang/Integer.intValue:()I
        //  1097: iconst_1       
        //  1098: dup            
        //  1099: dup            
        //  1100: pop2           
        //  1101: iadd           
        //  1102: if_icmpge       1381
        //  1105: new             Lnet.minecraft.util.math.BlockPos;
        //  1108: dup            
        //  1109: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1112: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1115: invokevirtual   net.minecraft.entity.Entity.getBlockX:()I
        //  1118: getstatic       org/rusherhack/Class590.f9369:[I
        //  1121: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1124: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1127: invokevirtual   net.minecraft.entity.Entity.getHorizontalFacing:()Lnet.minecraft.util.math.Direction;
        //  1130: invokevirtual   java/lang/Enum.ordinal:()I
        //  1133: iaload         
        //  1134: lookupswitch {
        //                1: 1164
        //                2: 1181
        //          default: 1185
        //        }
        //  1160: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1163: athrow         
        //  1164: iload_0        
        //  1165: goto            1172
        //  1168: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //  1171: athrow         
        //  1172: ineg           
        //  1173: iload           4
        //  1175: ifne            1186
        //  1178: goto            1172
        //  1181: iload_0        
        //  1182: goto            1186
        //  1185: iconst_0       
        //  1186: iadd           
        //  1187: iload           7
        //  1189: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1192: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1195: invokevirtual   net.minecraft.entity.Entity.getBlockZ:()I
        //  1198: getstatic       org/rusherhack/Class590.f9369:[I
        //  1201: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1204: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1207: invokevirtual   net.minecraft.entity.Entity.getHorizontalFacing:()Lnet.minecraft.util.math.Direction;
        //  1210: invokevirtual   java/lang/Enum.ordinal:()I
        //  1213: iaload         
        //  1214: lookupswitch {
        //                3: 1240
        //                4: 1250
        //          default: 1254
        //        }
        //  1240: iload_0        
        //  1241: ineg           
        //  1242: iload           4
        //  1244: ifne            1255
        //  1247: goto            1241
        //  1250: iload_0        
        //  1251: goto            1255
        //  1254: iconst_0       
        //  1255: iadd           
        //  1256: invokespecial   net.minecraft.util.math.BlockPos.<init>:(III)V
        //  1259: astore          10
        //  1261: aload           14
        //  1263: aload           5
        //  1265: aload           10
        //  1267: dup_x1         
        //  1268: aload_1        
        //  1269: iinc            0, 1
        //  1272: aload           6
        //  1274: invokevirtual   org/rusherhack/Scaffold.m6471:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.block.BlockState;Lnet.minecraft.util.shape.VoxelShape;)Lnet.minecraft.util.hit.BlockHitResult;
        //  1277: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1282: pop            
        //  1283: iload_0        
        //  1284: goto            1083
        //  1287: new             Lnet.minecraft.util.math.BlockPos;
        //  1290: dup            
        //  1291: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1294: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1297: invokevirtual   net.minecraft.entity.Entity.getBlockX:()I
        //  1300: iload           7
        //  1302: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //  1305: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //  1308: invokevirtual   net.minecraft.entity.Entity.getBlockZ:()I
        //  1311: invokespecial   net.minecraft.util.math.BlockPos.<init>:(III)V
        //  1314: aload           5
        //  1316: getfield        org/rusherhack/Scaffold.range:Lorg/rusherhack/core/setting/NumberSetting;
        //  1319: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1322: checkcast       Ljava/lang/Integer;
        //  1325: invokevirtual   java/lang/Integer.intValue:()I
        //  1328: i2f            
        //  1329: invokestatic    org/rusherhack/client/api/utils/WorldUtils.getCircle:(Lnet.minecraft.util.math.Vec3i;F)Ljava/util/List;
        //  1332: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1337: dup            
        //  1338: astore_0       
        //  1339: invokeinterface java/util/Iterator.hasNext:()Z
        //  1344: ifeq            1381
        //  1347: aload_0        
        //  1348: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1353: checkcast       Lnet.minecraft.util.math.BlockPos;
        //  1356: astore          10
        //  1358: aload_0        
        //  1359: aload           14
        //  1361: aload           5
        //  1363: aload           10
        //  1365: dup_x1         
        //  1366: aload_1        
        //  1367: aload           6
        //  1369: invokevirtual   org/rusherhack/Scaffold.m6471:(Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.block.BlockState;Lnet.minecraft.util.shape.VoxelShape;)Lnet.minecraft.util.hit.BlockHitResult;
        //  1372: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1377: pop            
        //  1378: goto            1339
        //  1381: aload           14
        //  1383: areturn        
        //    Signature:
        //  (I)Ljava/util/SortedMap<Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.hit.BlockHitResult;>;
        //    StackMapTable: 00 7F FF 00 45 00 0E 07 00 02 01 04 01 07 00 02 07 04 C0 00 00 00 00 00 00 00 07 03 34 00 01 07 00 5C 03 44 07 00 5C 43 07 04 C0 07 FF 00 02 00 0E 07 00 02 07 04 AF 04 01 07 00 02 07 04 C0 00 00 00 00 00 00 00 07 03 34 00 01 07 04 AF FF 00 2C 00 0E 07 00 02 07 02 1F 04 01 07 00 02 07 04 18 00 00 00 00 00 00 00 07 03 34 00 01 07 00 5C 03 47 03 FF 00 38 00 0C 07 00 02 07 02 1F 04 01 07 00 02 07 04 18 00 03 03 00 00 07 03 34 00 01 07 00 5C 03 50 07 00 5C 43 01 45 07 00 5C 03 4E 07 00 5C 43 01 4A 07 00 5C 03 4A 07 00 5C 43 01 45 07 00 5C 03 41 07 00 02 04 55 07 00 5C 43 01 44 07 00 02 05 41 03 FF 00 2C 00 0C 07 00 02 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 00 03 03 07 03 34 00 01 07 00 5C 03 53 07 00 5C 43 01 45 07 00 5C 03 46 07 00 5C 43 01 02 40 01 42 01 FF 00 04 00 0D 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 03 07 03 34 00 01 01 5F 07 00 5C FF 00 03 00 0D 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 03 07 03 34 00 02 01 01 42 07 00 5C 43 01 FF 00 00 00 0D 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 03 07 03 34 00 02 01 01 FF 00 02 00 0D 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 03 07 03 34 00 02 01 01 FF 00 38 00 0D 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 07 02 1D 07 01 1C 03 07 03 34 00 01 07 00 5C 03 47 07 00 5C 03 43 07 00 5C 43 01 FF 00 11 00 11 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 07 02 1D 07 01 1C 01 07 01 1C 07 03 34 07 05 3C 01 01 00 01 01 FF 00 1A 00 12 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 07 02 1D 07 01 1C 01 07 01 1C 07 03 34 07 05 3C 01 01 07 02 12 00 01 07 00 5C 03 47 07 00 5C 03 FF 00 17 00 12 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 07 02 1D 07 01 1C 01 07 01 1C 07 03 34 07 05 3C 01 01 07 01 1C 00 01 07 00 5C 03 46 01 02 FF 00 0C 00 15 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 07 02 1D 07 01 1C 01 07 01 1C 07 03 34 07 05 3C 01 01 07 01 1C 07 05 3C 01 01 00 01 01 FF 00 1D 00 16 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 07 02 1D 07 01 1C 01 07 01 1C 07 03 34 07 05 3C 01 01 07 01 1C 07 05 3C 01 01 07 02 12 00 01 07 00 5C 03 47 07 00 5C 03 51 07 00 5C 43 01 45 07 00 5C 03 55 07 00 5C 03 47 07 00 5C 03 45 07 00 5C 03 41 01 FF 00 02 00 12 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 07 02 1D 07 01 1C 01 07 01 1C 07 03 34 07 05 3C 01 01 07 02 1B 00 00 FA 00 07 41 01 59 07 00 5C 03 5B 07 00 5C FF 00 03 00 0D 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 07 02 1D 07 01 1C 03 07 03 34 00 00 FF 00 06 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 00 41 07 03 34 4F 07 00 5C 03 4E 07 00 5C 03 47 07 02 1B 45 01 4A 07 00 5C 03 50 07 00 5C 43 01 4A 07 00 5C 03 4A 07 00 5C 43 01 45 07 00 5C 03 42 07 00 5C 03 4D 01 4A 07 00 5C 03 46 07 00 5C 43 01 41 01 F7 00 4C 07 00 5C FF 00 03 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 03 08 04 51 08 04 51 01 43 07 00 5C FF 00 03 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 04 08 04 51 08 04 51 01 01 FF 00 08 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 03 08 04 51 08 04 51 01 FF 00 03 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 03 08 04 51 08 04 51 01 FF 00 00 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 04 08 04 51 08 04 51 01 01 FF 00 35 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 05 08 04 51 08 04 51 01 01 01 FF 00 00 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 06 08 04 51 08 04 51 01 01 01 01 FF 00 08 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 05 08 04 51 08 04 51 01 01 01 FF 00 03 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 05 08 04 51 08 04 51 01 01 01 FF 00 00 00 0E 01 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 06 08 04 51 08 04 51 01 01 01 01 1F FF 00 33 00 0E 07 01 0F 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 01 07 01 0F FF 00 29 00 0E 00 07 02 1F 04 01 07 00 02 07 04 18 01 07 02 1D 01 00 00 00 00 07 03 34 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  55     66     69     73     Ljava/lang/MatchException;
        //  60     75     78     82     Ljava/lang/MatchException;
        //  119    138    138    142    Ljava/lang/MatchException;
        //  178    204    207    211    Ljava/lang/MatchException;
        //  185    225    228    232    Ljava/lang/MatchException;
        //  211    235    238    242    Ljava/lang/MatchException;
        //  232    254    257    261    Ljava/lang/MatchException;
        //  261    269    272    276    Ljava/lang/MatchException;
        //  266    284    287    291    Ljava/lang/MatchException;
        //  276    294    297    301    Ljava/lang/MatchException;
        //  308    327    330    334    Ljava/lang/MatchException;
        //  371    389    392    396    Ljava/lang/MatchException;
        //  386    413    416    420    Ljava/lang/MatchException;
        //  396    423    426    430    Ljava/lang/MatchException;
        //  420    434    437    441    Ljava/lang/MatchException;
        //  453    482    485    489    Ljava/lang/MatchException;
        //  458    492    492    496    Ljava/lang/MatchException;
        //  543    554    557    561    Ljava/lang/MatchException;
        //  551    566    569    573    Ljava/lang/MatchException;
        //  561    574    577    581    Ljava/lang/MatchException;
        //  612    623    626    630    Ljava/lang/MatchException;
        //  617    635    638    642    Ljava/lang/MatchException;
        //  652    663    666    670    Ljava/lang/MatchException;
        //  706    720    723    727    Ljava/lang/MatchException;
        //  714    732    735    739    Ljava/lang/MatchException;
        //  727    754    757    761    Ljava/lang/MatchException;
        //  739    764    767    771    Ljava/lang/MatchException;
        //  775    790    793    797    Ljava/lang/MatchException;
        //  780    802    805    809    Ljava/lang/MatchException;
        //  797    812    815    819    Ljava/lang/MatchException;
        //  834    860    860    864    Ljava/lang/MatchException;
        //  864    892    892    896    Ljava/lang/MatchException;
        //  905    918    921    925    Ljava/lang/MatchException;
        //  915    937    940    944    Ljava/lang/MatchException;
        //  958    966    969    973    Ljava/lang/MatchException;
        //  963    987    990    994    Ljava/lang/MatchException;
        //  994    1002   1005   1009   Ljava/lang/MatchException;
        //  999    1017   1020   1024   Ljava/lang/MatchException;
        //  1009   1027   1030   1034   Ljava/lang/MatchException;
        //  1024   1037   1037   1041   Ljava/lang/MatchException;
        //  1055   1063   1066   1070   Ljava/lang/MatchException;
        //  1060   1074   1077   1081   Ljava/lang/MatchException;
        //  1083   1160   1160   1164   Ljava/lang/MatchException;
        //  1105   1165   1168   1172   Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0211:
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
    private void m6479(final EventRender3D p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          102968205933376
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          5
        //    16: aload           5
        //    18: getfield        org/rusherhack/Scaffold.render:Lorg/rusherhack/core/setting/BooleanSetting;
        //    21: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    24: checkcast       Ljava/lang/Boolean;
        //    27: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    30: ifne            38
        //    33: return         
        //    34: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    37: athrow         
        //    38: aload_1        
        //    39: invokevirtual   org/rusherhack/client/api/events/render/EventRender3D.getRenderer:()Lorg/rusherhack/client/api/render/IRenderer3D;
        //    42: astore_0       
        //    43: aload           5
        //    45: aload_0        
        //    46: dup_x1         
        //    47: aload_1        
        //    48: invokevirtual   org/rusherhack/client/api/events/render/EventRender.getMatrixStack:()Lnet.minecraft.client.util.math.MatrixStack;
        //    51: invokeinterface org/rusherhack/client/api/render/IRenderer.begin:(Lnet.minecraft.client.util.math.MatrixStack;)V
        //    56: getfield        org/rusherhack/Scaffold.widthOfOutline:Lorg/rusherhack/core/setting/NumberSetting;
        //    59: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    62: checkcast       Ljava/lang/Float;
        //    65: invokevirtual   java/lang/Float.floatValue:()F
        //    68: invokeinterface org/rusherhack/client/api/render/IRenderer3D.setLineWidth:(F)V
        //    73: aload_0        
        //    74: aload           5
        //    76: getfield        org/rusherhack/Scaffold.hideHiddenSides:Lorg/rusherhack/core/setting/BooleanSetting;
        //    79: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    82: checkcast       Ljava/lang/Boolean;
        //    85: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    88: invokeinterface org/rusherhack/client/api/render/IRenderer3D.setDepthTest:(Z)V
        //    93: aload           5
        //    95: getfield        org/rusherhack/Scaffold.f3008:Lit/unimi/dsi/fastutil/Pair;
        //    98: iload           4
        //   100: ifne            130
        //   103: ifnull          136
        //   106: goto            113
        //   109: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   112: athrow         
        //   113: aload           5
        //   115: getfield        org/rusherhack/Scaffold.f3008:Lit/unimi/dsi/fastutil/Pair;
        //   118: invokeinterface it/unimi/dsi/fastutil/Pair.first:()Ljava/lang/Object;
        //   123: goto            130
        //   126: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   129: athrow         
        //   130: checkcast       Lnet.minecraft.util.math.BlockPos;
        //   133: goto            137
        //   136: aconst_null    
        //   137: astore_1       
        //   138: aload           5
        //   140: getfield        org/rusherhack/Scaffold.f2996:Ljava/util/SortedMap;
        //   143: invokeinterface java/util/SortedMap.entrySet:()Ljava/util/Set;
        //   148: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   153: dup            
        //   154: astore          6
        //   156: invokeinterface java/util/Iterator.hasNext:()Z
        //   161: ifeq            263
        //   164: aload           6
        //   166: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   171: checkcast       Ljava/util/Map.Entry;
        //   174: dup            
        //   175: astore          7
        //   177: invokeinterface java/util/Map.Entry.getKey:()Ljava/lang/Object;
        //   182: checkcast       Lnet.minecraft.util.math.BlockPos;
        //   185: astore          8
        //   187: iload           4
        //   189: ifne            269
        //   192: iload           4
        //   194: ifne            258
        //   197: goto            204
        //   200: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   203: athrow         
        //   204: aload           7
        //   206: invokeinterface java/util/Map.Entry.getValue:()Ljava/lang/Object;
        //   211: checkcast       Lnet.minecraft.util.hit.BlockHitResult;
        //   214: ifnonnull       233
        //   217: goto            224
        //   220: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   223: athrow         
        //   224: aload           6
        //   226: goto            156
        //   229: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   232: athrow         
        //   233: aload_0        
        //   234: aload           8
        //   236: dup            
        //   237: aload_1        
        //   238: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //   241: iconst_1       
        //   242: dup            
        //   243: dup            
        //   244: pop2           
        //   245: aload           5
        //   247: getfield        org/rusherhack/Scaffold.color:Lorg/rusherhack/client/api/setting/ColorSetting;
        //   250: invokevirtual   org/rusherhack/client/api/setting/ColorSetting.getValueRGB:()I
        //   253: invokeinterface org/rusherhack/client/api/render/IRenderer3D.drawBox:(Lnet.minecraft.util.math.BlockPos;ZZI)V
        //   258: aload           6
        //   260: goto            156
        //   263: aload_0        
        //   264: invokeinterface org/rusherhack/client/api/render/IRenderer.end:()V
        //   269: return         
        //    StackMapTable: 00 12 FF 00 22 00 05 07 00 02 07 05 42 04 01 07 00 02 00 01 07 00 5C 03 FF 00 46 00 05 07 05 57 07 05 42 04 01 07 00 02 00 01 07 00 5C 03 4C 07 00 5C 43 07 02 1B 05 40 07 01 1C FF 00 12 00 06 07 05 57 07 01 1C 04 01 07 00 02 07 01 0F 00 01 07 01 0F FF 00 2B 00 08 07 05 57 07 01 1C 04 01 07 00 02 07 01 0F 07 01 17 07 01 1C 00 01 07 00 5C 03 4F 07 00 5C 03 44 07 00 5C 03 18 F9 00 04 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  16     34     34     38     Ljava/lang/MatchException;
        //  43     106    109    113    Ljava/lang/MatchException;
        //  103    123    126    130    Ljava/lang/MatchException;
        //  187    197    200    204    Ljava/lang/MatchException;
        //  192    217    220    224    Ljava/lang/MatchException;
        //  204    229    229    233    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0204:
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
    
    public void onDisable() {
        final long n = Scaffold.f3013 ^ 0x7DDA036E6320L;
        Safewalk.f4227.f4231 = false;
    }
    
    @Subscribe(stage = Stage.PRE, priority = 1000)
    private void m6481(final EventPlayerUpdate p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          29108592310805
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: aload_1        
        //    15: astore_0       
        //    16: astore_1       
        //    17: aload_1        
        //    18: getfield        org/rusherhack/Scaffold.f2996:Ljava/util/SortedMap;
        //    21: invokeinterface java/util/Map.isEmpty:()Z
        //    26: iload           4
        //    28: ifne            67
        //    31: ifeq            42
        //    34: goto            41
        //    37: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    40: athrow         
        //    41: return         
        //    42: aload_1        
        //    43: getfield        org/rusherhack/Scaffold.f2998:Lorg/rusherhack/core/setting/BooleanSetting;
        //    46: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    49: checkcast       Ljava/lang/Boolean;
        //    52: iload           4
        //    54: ifne            147
        //    57: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    60: goto            67
        //    63: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    66: athrow         
        //    67: ifeq            140
        //    70: aload_1        
        //    71: iload           4
        //    73: ifne            147
        //    76: goto            83
        //    79: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    82: athrow         
        //    83: dup            
        //    84: getfield        org/rusherhack/Scaffold.f3001:Lorg/rusherhack/core/utils/Timer;
        //    87: swap           
        //    88: getfield        org/rusherhack/Scaffold.f2981:Lorg/rusherhack/core/setting/NumberSetting;
        //    91: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    94: checkcast       Ljava/lang/Integer;
        //    97: invokevirtual   java/lang/Integer.intValue:()I
        //   100: invokevirtual   org/rusherhack/core/utils/Timer.ticksPassed:(I)Z
        //   103: ifne            140
        //   106: goto            113
        //   109: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   112: athrow         
        //   113: invokestatic    org/rusherhack/client/api/RusherHackAPI.getRotationManager:()Lorg/rusherhack/client/api/system/IRotationManager;
        //   116: aload_1        
        //   117: dup            
        //   118: getfield        org/rusherhack/Scaffold.f2986:F
        //   121: swap           
        //   122: getfield        org/rusherhack/Scaffold.f2992:F
        //   125: ldc_w           180.0
        //   128: invokeinterface org/rusherhack/client/api/system/IRotationManager.updateRotation:(FFF)V
        //   133: goto            140
        //   136: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   139: athrow         
        //   140: aload_1        
        //   141: getfield        org/rusherhack/Scaffold.allowsYouToSprintOnCertainAnticheats:Lorg/rusherhack/core/setting/EnumSetting;
        //   144: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   147: getstatic       org/rusherhack/Obf193.f3715:Lorg/rusherhack/Obf193;
        //   150: if_acmpne       211
        //   153: aload_0        
        //   154: iconst_0       
        //   155: invokevirtual   org/rusherhack/client/api/events/player/EventPlayerUpdate.setOnGround:(Z)V
        //   158: invokestatic    org/rusherhack/client/api/RusherHackAPI.getServerState:()Lorg/rusherhack/client/api/system/IServerState;
        //   161: invokeinterface org/rusherhack/client/api/system/IServerState.isPlayerSprinting:()Z
        //   166: ifeq            211
        //   169: goto            176
        //   172: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   175: athrow         
        //   176: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   179: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   182: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   185: new             Lnet.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
        //   188: dup            
        //   189: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   192: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   195: getstatic       net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode.STOP_SPRINTING:Lnet.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
        //   198: invokespecial   net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.<init>:(Lnet.minecraft.entity.Entity;Lnet.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;)V
        //   201: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //   204: goto            211
        //   207: invokestatic    org/rusherhack/Scaffold.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   210: athrow         
        //   211: return         
        //    StackMapTable: 00 10 FF 00 25 00 04 07 05 81 07 00 02 04 01 00 01 07 00 5C 03 00 54 07 00 5C 43 01 4B 07 00 5C 43 07 00 02 59 07 00 5C 03 56 07 00 5C 03 46 07 02 1B 58 07 00 5C 03 5E 07 00 5C 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  17     34     37     41     Ljava/lang/MatchException;
        //  42     60     63     67     Ljava/lang/MatchException;
        //  67     76     79     83     Ljava/lang/MatchException;
        //  70     106    109    113    Ljava/lang/MatchException;
        //  83     133    136    140    Ljava/lang/MatchException;
        //  147    169    172    176    Ljava/lang/MatchException;
        //  153    204    207    211    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
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
        f3013 = Class066.m4320(-7377867252009189043L, 7572168542647029153L, (Object)MethodHandles.lookup().lookupClass()).m4325(90626215439966L);
        f3021 = new Object[373];
        f3022 = new String[373];
        m179();
        f3016 = new HashMap(13);
        final long n = Scaffold.f3013 ^ 0x50C6BFC1A778L;
        final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        final int opmode = 2;
        final SecretKeyFactory instance2 = SecretKeyFactory.getInstance("DES");
        final byte[] key = new byte[8];
        key[0] = (byte)(n >>> 56);
        for (int i = 1; i < 8; ++i) {
            key[i] = (byte)(n << i * 8 >>> 56);
        }
        instance.init(opmode, instance2.generateSecret(new DESKeySpec(key)), new IvParameterSpec(new byte[8]));
        final String[] f3023 = new String[50];
        int n2 = 0;
        String s;
        int n3 = (s = """
                      \u00cbdc\u000f\u0093\u00e5\u00e8G\u00f2?R\u00ad\u00f1<\u00ec\u00d9\u000fª6\u00cd\u00f0O$?\u00dc\u00807©I4¿\u0082@\u00fd"S \u00fc\u00d1f\u001a^\\u00f4Yx\u00ed}\u007f&_¦\u00cf®WB/©³¹2KMz\u001f\u0093\u009a]xB\u0003n<\u0011u\u0092_(¶¡¸(¬\u00f3\r\u008dV\u00efG\u00f8J\u00c1X\u0000=@\u0091 \u00f5\u009b\u00fd>\u00deU8¸\u0014oU¼w\u0093\f\u00ee\r\u00c1&\u00ccy\u00f3iA~\u0084P»\u00e1\u0003/z \u0012\u0014\u00e9y\u001d\u0096³}\u0093\u0086|K\u0007\u00e5ª\u00c8\u00d9/
                      \u0010wkM³\u000b\u009e\u00e4\u0006\u0013L±+(\u0085}w\u00c0$\u0004b\u008de\f\u00f8\u008c.\u0001'\u0012[\u00eb@\u0010\u00dc¤\bb\u00cd¿\u00ffA\u00f0\u00cf¦0\u009f\u00f4Pc\u0089U\u00f0µ\u0010\u007f]K%1\u008co\u000eY \u0012º>\u00f0µ\u00f6\u0010³\u00dc«\u0082}\u00d6¹'¥\u0097[
                      "cY\u001c`[\u00c0\u0017\u0089²r\u001c\u00f9Oµ\u0010\u00f8\u00fe>)\u00f7\u0019\u009e\u00de\u00e7\u00deKµe\u00da\u0088\u0090¸\u00830\u008d\u00f8c\u0012³>P©(\u00d3*C\u0092\u00dd\u0014S!\u0091\u000b\u00c7d :\u00d71l%¸C\u00e2\u00c9¡§\u00d0\u00ce\u0085V¹@x\u00c5\f¹6\u00c7\u00ca?\u001f²\u00e3µ
                      q¦7:\u00d9T\u00ea[\u0083\u0090\u0018EQ\u00ca(Sf\u0087o\u00e0\u00eaª½¶ª3z®\u0082\u00ad*\u00c8y\u0017\u00cdMq\u008b©[\u008b\u008a2iZ¼^£\u0001¯]\u00e3:\u0011¾\u0010~\u00c9\u00ea\u00d5²d\u00df\u00f6@R\u009c\u001f¤\u00fd\u00e2±H\u0017L\u00f0¿c\u00f0\u00d6\u00ecX^3\u009cµ\u00c3_\u0003\u00f4\u00cf\u007fA\u00ea}\u001c.\u00e0A\u009dK\f¢\u0090\u00cf\u00cb\u00e6Y\u00859i9\u0002·\u00d1¥\u00c9"\u0092^\u00e2\u009be_Bª\u00cae¹cU\u00f1\u00f5\u0007t\u00e00m\u001fq¦/I3\u00ec0\u001c\u001e\u00ffb\u00ee\u00959\u0005\u00ce\u00e1½\6d\u00cc\u008c\u0018\u00c8¹?\u00c3\u00d2¾|`L _©\f82·\u00c1M¦"\u00ec\u001e¥\u001b\u00c6\u00c9²\u008fL\u0082\u00c2\u0010\u00c4¼3[?T\fq\u0012l½2\u00e6¾e\u00ec\u0088\u00ceH\u0090\u000e\u00dcµ)³®]½\u001c\u00eeQl\u00f0\u00fc\u00fe\u008b\u00c0
                      e\u008dg\u0082\u00d1\u00deL\u0096\u0010\u009e\u009f\u00dbWQ\u008a®¹\u0097-¤4&Tx\u0017O\u00fd\u00e4H&\u00d3Iµ]a\u00e2Nn£@\u00dc\u009c\u0091\u0092)\u0089}\u00d8¨v¥«q¯S\u0014\u00f0\u00d3\u00e3\u00c6\u009b~[\u00e9)*\u008b\u00f1\u008c\u00fb\u00f7\u001c\u00ef1\u0013\u00ad\u00ce\u00e6\u00c7&\u0092\u00cf\u0097h\u00e8#\u0000\u001a\u00f8a2?k\u0007'M\u00d6+3\u00cd\u00d4g\\u00c0\u0004O\u00e4\u00c5qmk\u00c3\u00d1\u00ca¨\u0018\u0088\u0010\u00d1\u00dd\u000bl.p\u00d2LY\u00fb\u0086\u00ceQ\u00e8\u0011\u0091\u00e5KL\u009a\u009e\u00050\u00e6\u0000\f\u0003\u009e°\u0085]\u009e\u00ce\u00e4}\u001bbY#w\u00c3\u008d\u008f.\u009f]\u00ad>l\u0012\u00d6N³\u0006E\u001c\u00ee.\u00c90\u00f6L\u00f5'\u0085·\rY\u0088¨N8\u00d4y\u001e\u00c9§\u00efwS¿v04\u0000AsO\u00ea\u0096\u0081Dxp\u008e\f36 o\u00e5\u0097]°\u00c0:\u00fav\u0013\u0012m:L«\u00ca9\u001ee\u00c2\u0013\u00f4\u001b\u00db?J\u0097BM\u0010¶\u0093\u000b»\u00c7O1\u00fcL\u0006\u00f55\u00ef\u00d9\u008d\u00fdX\u00c21\u0016©	D\u00f3©\u0000\u001d\u0000\u00d0º\u0082Lt¤\u00ea£\u008a#X\u00ad»\u00c5\u0090\u009c\u000b¬\u009e\u0083\u008bhQ
                      \u000e\u00ff¬tA\u009a´K\u00fc\u00c2h`\u00ea\u00d8\u00ed!A=\u008a\u00125\u008eR\u0010\u00d6\u007fP\u00f5\u00d8\u00c0\u00eb5!)2\u008ar£\u00c4\u0003m\u0081\u0006\u008d)\u00f4\u00f7\u00caoW\u00e7308\u00d5\u00cf½(4\u00f7][\u0098\u00d0\u00d5;\u00demx\u00de`\u0004¯\u00d0u&\u00e1\u00c2¤i\u00cb*¬\u00d1¬\u00f1\u00cf\u0086m¯\u008dW\u0000\u001f&y\u00cd\u00f3\u00c5°\u00db\u00e2\u0017\u00d8«\u0002\u00119fe\u0010\u008a-\u0091r\u0017$ZB\u009f\u0099r\u00ce\u0018ih\u0081 \u00ea¹ \u0016\u00f7\u00fd\u001b5\u0003\u00cd\u001c\u00e9\u00ec²\u001a\u00c3\u0089²db\u0085f\u00f25\u00f1\u00fbY"Q ?ª\u001074\u00d0\u009b\u0080¨\u009e.®g\u008a\u00cc´b\u00ad· \u00cc\u00d6[Mec½\u00caj\u00d1\u00fd\u00f5\u001az\u001d\u00cd¯\u0087\u00f4\u008f~\u0085 \u0001\u00043g	\u00e2\u0080`
                      \u0010\u00fc\u001f1SH\b\u00df¸9\u00c3¾\u001d;\u0094\u00ee\u000b \u00cd\u00cd\u0011¯*5´¤m\u0017\u00c8m\u00008\u009e(\u00e7\u00c7b\u007f3\u0014\u0092\u00cc\u00c0\u00d2\u00ecnE\u00fc\u0082nH\r*\u00eb\u00d4\u00f3\u0089aWx¨Z}¨;\u00ffl\u00c3\u0097\u00fd\u00d4\u0004\u0094>j\u00db\u00c4N~\u001d^n\u00c5\u00da\u009fV\u00f6I\u0006C\u001bL\u0085*\u00da\\²t\u00d7\u00d7/6\u008e"\u00efbU\u009f\u00de\u00d7W\r;\u008e\b\u0096^\u0096\u00c9z6\u00e8\u00f4\u0010¦\u0002\u00fbC\u0014il\u00d3\u0094u\u00e9\u00c4\u00c5\u00c90j\u0010K¦J\u00c3\u00d8\u00ea;\u009c@\u0082\u00f5\u00d6\u00d6\u0004\u00c21(k\u00c6\u0090º\u00cc\u00fa4D\u00d7q\u00c7\u00c9\u009f-\u001e\u00e2d\u0012,I\u00ed\u001c9\u00dc+\r\u00e9\u00f7\u00f8µ!©+\u00d2\u00efmo.!\u001f\u0018\u00de\u009a\u0097\u0084\u001bq\u0007|Db\u00f6[}\u00e9\u00d6¼S\u0083\u00d2ºb\u00f5a\u00ef\u0018\u0091\u00e3H\u00ef\u001c¯\u00f6g\u0001\u00db\u0014~_3\u0087\u00d3z\b¤¾\u00c2\u00cfg¡\u0010\u00e8\u00ca\u009am\u008a"£\u001e!=-\u00c1¯\u00fed¶H\b\u0095d¾\u00edW\u00ad\u00f1B\u0089¨\u008f\u00cbf\u001a\u000f\u001d¤mr\u00faµ@F\u00cay¢\u0019\u009d\u00fe\u00cf/@\u001d@\u001a¢R\u00d3\u0082V_;d\u00ceS\u0090^¤\u0095i2\u00eb\u00e5\u00c7MWxN\u0010\u00ea\u008b\u00138)\u0088\u0095b2\u00c5\b\u00c28\u00e3miZ\u0095\u0088\u008as«>«±\u0081\u00d2\u00edD\u00c3.\u00fb®\u001e®#\u00d1\u0002\u00f9u\u00faI\u00d4\u009d\u00e5\u0088O^f\u00d9»\u0004^T\u00fb\u00c3;ªmr\u00d1\u0015§\u00daKaA
                      *\u0010\u008bR\u00c7m²L+ª\u008aL\u00e2º\u0085EZ; G\u0099\u00c30¤TG\u008b|±\u000b\u0002*\u00d4cRZ\u0099\u00cfk\u0005r¥9\u009e\u008a£@@\u00f2¦\u00d2\u0010\u0084\u00fb\u0010\u007f\u00ca\u008c
                      \u00e9\u00ca\u009c\u009f\u0013\u00d2¶Y\u0086 X\u00f7p<\u00fb\u00d7\u0017?\u008ae\u0092\u0092\u00de\u00e5U¿\u0093»ZD \u00cb½\u0098G(¨³»\u0081©H\u0010\u00cf\u001a\u00f6\u0010\u0088]\u00e8w\u00d7\u00e7gl\u00fd?½¶\u0010g\u0082§$\u00c3D\u001c.¾«\u0007\u00cc\u0083²\u0099A\u0018\u00f2\u00ce@Nt\u00c2\u00cc:\u0096\u00f2\u001av¦\u00f5\u00ef\u0083\u0091\u00c6#7\u000fs}\u0006 \u00c0\u00d4\u00c3\u00d6\u009a=\u00ce¯\u008d\u00c9S\u00f5´\u00c4`9\u0012h[\u009a·¶\u00ebK\u001a\u00e4\u00c2U\u0012[µV\u0010\u0090¨<O¾4!¼¥M\u009b'\u0002\u00e9\u00ceGPr\u0004\u008b<\u0004pzo³\u009bu¬\u00ed\u0091Y\u00e2X\u00c5dZ\u001f\u00df\u00e1\u00cfrY\u000f0eº\u00f7\u0014\\TJt\u0001º\u00f4/\u00c3I>\u00f2R\u00dc\u001a¯\u0081v=\u00c2S.0H(\u00d9
_µ\u00fe\u00e1»\u0003
W\u00dar\u00f9\u00eb\u0019T\u00dc\u00163´T\u00c9\u00c8 \u0017\u00e6\u0083(/ª\u00d3Ui\u0084ª"\u001e\u00f5¿\u00f9¹x\u00c2"\u0013\u00d9\u00ce\u0099+«d¤\u000f\u00e9·\u0083\u0018\u0017\u00d2\u00d3Z\b\u00c8U\u00e9/iS\u00e1\u0082\u0018\u00ea\u008a±\u00f0\u001b\u0084\u0015j\u00e89\u0010tV/\u00ce!\u00cfqOa\u0007\u00fd\u00f2N\u00e9\u0004\b""").length();
        int n4 = 32;
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
                            f3023[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                continue Label_0184;
                            }
                            n3 = (s = """
                                      8\r\u00df¤\u009a\u008b#\u0080\u0007B(\u00d4\u00c8m\u00d7q\u0091\u0089\u00d0\u00ca\u00cbsQ\u00f5W\u009eY\\½
                                      ·¸V\u0087\u00ad\u00f0mN\u00de`0bT\u00det©z\u009d\u00e8n\u0006b\u0098\u0090'¡\u009d\u00e8Q\u00e69Ab\u00fa1\u00ff4\u0007\u00ea¢L\u000f\u00c2\u001bo&²\u0000\u0093\u00f9\u00d3\u00c9\u001b¸¢\u00f5\u001c\u00ef\u0010+³\u00f6}R\u009e[}\u00ce\u009a\u001d·\u00d5¤N
                                      """).length();
                            n4 = 88;
                            n5 = -1;
                            break;
                        }
                        case 0: {
                            f3023[n2++] = intern;
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
        f3014 = f3023;
        f3015 = new String[50];
        f3019 = new HashMap(13);
        final Cipher instance3 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode2 = 2;
        final SecretKeyFactory instance4 = SecretKeyFactory.getInstance("DES");
        final byte[] key2 = new byte[8];
        key2[0] = (byte)(n >>> 56);
        for (int j = 1; j < 8; ++j) {
            key2[j] = (byte)(n << j * 8 >>> 56);
        }
        instance3.init(opmode2, instance4.generateSecret(new DESKeySpec(key2)), new IvParameterSpec(new byte[8]));
        final long[] f3024 = new long[16];
        int n7 = 0;
        String s5;
        int n8 = (s5 = "\f\u00fe±\u00fd=\u00ed\u00da-ª\u00d1´¡(ª\u00f7\u0002;h\u00f4\u0092¿\u00e8W\u00c4\u00f9\u009b6\u0091F\u0005\u00d8§n¨\u00d2\u009a[\u0087¢)\u00f5\u00c4\u00c0lbqa\u0018\u000e<\u0098\n\u00c8<C\u00c4©\u00d6\u0013[\u00da-\u0086me\u0094\u00fb#\u00d4i\u009cbT\u00f6D\u0015#\u0081t\u00c3_/\u00dd\u009a|iB\u0094\u00c83{\u00dd)\u0086§\u00d8\u00db¥K¡\u00e0\u0082¾\u001cxt;X\u00ef;\u008cu").length();
        int n9 = 0;
    Label_0491:
        while (true) {
            while (true) {
                final String s6 = s5;
                final int beginIndex3 = n9;
                n9 += 8;
                final byte[] bytes = s6.substring(beginIndex3, n9).getBytes("ISO-8859-1");
                long[] array2;
                long[] array = array2 = f3024;
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
                                n8 = (s5 = "\u009e°\u00d3^ Sge¡TH\u008f\u00c9\u00f5\u000f\u008e").length();
                                n9 = 0;
                                break;
                            }
                            continue Label_0491;
                        }
                        case 0: {
                            array[n10] = n15;
                            if (n9 >= n8) {
                                break Label_0491;
                            }
                            break;
                        }
                    }
                    final String s7 = s5;
                    final int beginIndex4 = n9;
                    n9 += 8;
                    final byte[] bytes2 = s7.substring(beginIndex4, n9).getBytes("ISO-8859-1");
                    array = (array2 = f3024);
                    n10 = (n11 = n7);
                    ++n7;
                    n12 = (((long)bytes2[0] & 0xFFL) << 56 | ((long)bytes2[1] & 0xFFL) << 48 | ((long)bytes2[2] & 0xFFL) << 40 | ((long)bytes2[3] & 0xFFL) << 32 | ((long)bytes2[4] & 0xFFL) << 24 | ((long)bytes2[5] & 0xFFL) << 16 | ((long)bytes2[6] & 0xFFL) << 8 | ((long)bytes2[7] & 0xFFL));
                    n13 = 0;
                }
            }
        }
        f3017 = f3024;
        f3018 = new Integer[16];
        final Cipher instance5 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode3 = 2;
        final SecretKeyFactory instance6 = SecretKeyFactory.getInstance("DES");
        final byte[] key3 = new byte[8];
        key3[0] = (byte)(n >>> 56);
        for (int k = 1; k < 8; ++k) {
            key3[k] = (byte)(n << k * 8 >>> 56);
        }
        instance5.init(opmode3, instance6.generateSecret(new DESKeySpec(key3)), new IvParameterSpec(new byte[8]));
        final long n16 = -770782668005495988L;
        final byte[] doFinal2 = instance5.doFinal(new byte[] { (byte)(n16 >>> 56), (byte)(n16 >>> 48), (byte)(n16 >>> 40), (byte)(n16 >>> 32), (byte)(n16 >>> 24), (byte)(n16 >>> 16), (byte)(n16 >>> 8), (byte)n16 });
        f3020 = (((long)doFinal2[0] & 0xFFL) << 56 | ((long)doFinal2[1] & 0xFFL) << 48 | ((long)doFinal2[2] & 0xFFL) << 40 | ((long)doFinal2[3] & 0xFFL) << 32 | ((long)doFinal2[4] & 0xFFL) << 24 | ((long)doFinal2[5] & 0xFFL) << 16 | ((long)doFinal2[6] & 0xFFL) << 8 | ((long)doFinal2[7] & 0xFFL));
    
        } catch (Exception exception) {
            throw new ExceptionInInitializerError(exception);
        }
    }
   private static IllegalStateException m285(Throwable t) { return new IllegalStateException(t); }


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
        final Object[] f3021 = Scaffold.f3021;
        f3021[0] = ":t'\u00016\u001f&n%],\u000b6mn\u0110";
        f3021[1] = "\u000e00^54\u0005?!\u0011V9\u00102.zc;\u0001!2Vt6";
        f3021[2] = "r%&nJTn?$2P@~<o\u0246";
        f3021[3] = Integer.TYPE;
        Scaffold.f3022[3] = "java/lang/Integer";
        f3021[4] = "K\u001f.P.1W\u0005,\f4%G\u0006g\u0196";
        f3021[5] = Boolean.TYPE;
        Scaffold.f3022[5] = "java/lang/Boolean";
        f3021[6] = "a#[g1\u0019}9Y;+\rm:\u0012*,\u001ek\u007fO,7\u0018g?[g\u0001\u0003a=Y(-?k%H -\u000b";
        f3021[7] = "\u00079GLJx\f6V\u0003&{\u00024TL\n";
        f3021[8] = "\u000f\u0006=,pY\u0013\u001c?pjM\u0003\u001ftanE\u0005\u001a.,c\\\tZ\u001dnmN\u0001\u0018)";
        f3021[9] = "\"&\u00135>\u0003\"&\u0004i2\f8m\u0004w2\u0019?\u001cT*c";
        f3021[10] = "\u0013JbQ\u0001*\u0013Ju\r\r%\t\u0001u\u0013\r0\u000ep'MUt";
        f3021[11] = "g%u\u0010\f\u0003{?wL\u0016\u0017k<<]\u0012\u001fm9f\u0010\u001f\u0006aywH\u001b\u0018|$<N\u0012\u0017q2`\u0010;\u0000m9fs\u0011\u0000m";
        f3021[12] = Void.TYPE;
        Scaffold.f3022[12] = "java/lang/Void";
        f3021[13] = ";x\u007fm\u0002D;xh1\u000eK!3h/\u000e^&B<wY";
        f3021[14] = "#/\u001eNGX?5\u001c\u0012]L/6W\u0003Z_)s\n\u0005AY%3\u001eNfH8)\u0010\u000eR";
        f3021[15] = "'92V'*,6#\u0019F$'='C";
        f3021[16] = "TX=K~9HB?\u0017d-XAt\u01f0";
        f3021[17] = "\u0005\u0011Ri\u007f-\u0019\u000bP5e9\t\b\u001b\u04e7";
        f3021[18] = "C\f8ER3H\u0003)\n/+[\u0004 C";
        f3021[19] = "w\ty81zk\u0013{d+n{\u00100u,}}Upy7f~\u0012}w7fw\u00150X,{q\u001dwu\"{q\u0014pB:\u007f}";
        f3021[20] = "TP\u0016\u000b\u0012\rHJ\u0014W\b\u0019XI_\u0523";
        f3021[21] = "\\,Oj\u0007^@6M6\u001dJP5\u0006'\u0019BV0\\j\u0014[ZpN!\u0014_F,Mj\u0018DW+D![f\\:](\u0010";
        f3021[22] = "]\t\t|\u007f)A\u0013\u000b e=Q\u0010@\u0533";
        f3021[23] = "\u0004\bM)M\t\u0018\u0012OuW\u001d\b\u0011\u0004\u0198";
        f3021[24] = "]g\u0011\u001ad%]g\u0006Fh*G,\u0006Xh?@]T\u0003={";
        f3021[25] = "k\u001b\u001cSfZk\u001b\u000b\u000fjUqP\u000b\u0011j@v!ZO?\u000b";
        f3021[26] = "(BhlNH(B\u007f0BG2\t\u007f.BR5x-u\u001a\u0018";
        f3021[27] = "\u0017\u0004v6/#\u0017\u0004aj#,\rOat#9\n>3/{x";
        f3021[28] = "NTE<\"}NTR`.rT\u001fR~.gSn\u0003$w$";
        f3021[29] = "8j\u0013d{)$p\u00118a=4sZ)f.26\u0007/}(>v\u0013dL2\"u'/}(>v\u0013";
        f3021[30] = "%*|JWK%*k\u0016[D?ak\b[Q8\u0010:V\u000e\u0014";
        f3021[31] = "o_h\\mxrJ0~,ujL";
        f3021[32] = Double.TYPE;
        Scaffold.f3022[32] = "java/lang/Double";
        f3021[33] = """
                    N\u0016\u0012\u0002\u0004KR\f\u0010^\u001e_B\u000f[O\u001aWD
                    \u0001\u0002\u0017NHJ\u0006I\u0002JH
                    \u0012\u00025QM\u000b\u0007\u007f\u0013JU
\u001bK""";
        f3021[34] = "\u001d\u0000{w\u000e'\u0001\u001ay+\u00143\u0011\u00192:\u0013 \u0017\\o<\b&\u001b\u001c{w2'\u001f\u0010y+/7\u0006\u0006u7\u001b";
        f3021[35] = "\u0010\u0003\"p,69:>j.j#..ie{$=(,8}?;$l,6\u0018*9v\"v,t";
        f3021[36] = "AMo\u007fL@]Wm#VTMT&\u013a";
        f3021[37] = "\u000f?.\u000fQ7\u0013%,SK#\u0003&g\u01ec";
        f3021[38] = "O\"\\\u000f\u000fDL,\u0004\bHF@mz\u000fUB";
        f3021[39] = "M]E]\u0019|H\u0012uU[p";
        f3021[40] = "\u007f\tH\u0003\u001aGa\u0001RLRG{\u000bJ\u000b[\\;*Q\rXWt\u0006m\u0017DBy\u0001[\u0010";
        f3021[41] = "D-\u0003Wo\u0003X7\u0001\u000bu\u0017H4J\u001ar\u0004Nq\u0007\u0016p\u001bJ1\u0000W|\u0004L*\t\u001cs\u0002\u0005\f\u0010\u000bt\u0018L\u001c\u0005\ti\u0003Y:";
        f3021[42] = "d\u0019\u0007\u00184Ko\u0016\u0016WSIz\u001d\u0016\u001ch";
        f3021[43] = "\u000b]I\f/!\u0000RXCG!\u000e]K";
        f3021[44] = Float.TYPE;
        Scaffold.f3022[44] = "java/lang/Float";
        f3021[45] = "ds-NN\u001ez{7\u0001\u0006\u001e`q/F\u000f\u0005 Q4A\u0013\u001ecw)";
        f3021[46] = "\u0000~\u000f\u0005s()G\u0013\u001fqt3S\u0003\u001c:e4@\u0005Ygc/F\t\u0019s(\bW\u0014\u0003}h<\t";
        f3021[47] = "`eb}gf|\u007f`!}rl|+0yzjyq}tcf9c6tgze`}x|kbi6;^`sp?pPnc`4zav";
        f3021[48] = "pTu~>ylNw\"$m|M<3#~z\bg$%`l\bQ? cmsf9 \u007f";
        f3021[49] = "a9IOOQ}#K\u0013UEm \u0000\u0002QMk%ZO\\Tge|\u0014NLk9f\u0000^OO\u001bg";
        f3021[50] = "\u0003TN\u0007*h\u001fNL[0|\u000fM\u0007J7o\t\bZL*t\rJ@S=3%uL[1|\u0000OSH:q\t";
        f3021[51] = "@!!(k5\\;#tq!L8heu)J=2(x0F}%iw&F4hEv.I:!sk![:)h";
        f3021[52] = "hb6]G\bvj,\u0012:\u0012pw%X$\u001cr";
        f3021[53] = "VM3xx\u001bJW1$b\u000fZTz\u0204";
        f3021[54] = "pV6y4jpV!%8ej\u001d!;8pmlucm";
        f3021[55] = "\u001b\u001dk\u0015\u001c\u0015\u0007\u0007iI\u0006\u0001\u0017\u0004\"X\u0002\t\u0011\u0001x\u0015\u000f\u0010\u001dAyO\u0007\f\u0007A[T\u001c\f\u0010:xR\u0002\u0013";
        f3021[56] = "A\u0017\u00055]VA\u0017\u0012iQY[\\\u0012wQL\\-C(\b\r";
        f3021[57] = "G\u0012J\u0012e\u0019Y\u001aP]\u0007\u0005^\u0007";
        f3021[58] = "\u0005%pfNY\u0005%g:BV\u001fng$BC\u0018\u001f6{\u0016\u0000";
        f3021[59] = "Af{H\u0014OwC{H\u0003\u0013{La\u0003\u0003\r{YfrRR/\u001a.";
        f3021[60] = "d\nyw! o\u0005h8B-z\u0003";
        f3021[61] = " \u001e\u001bU\u007f\u001e \u001e\f\ts\u0011:U\f\u0017s\u0004=$]H!O";
        f3021[62] = "K3Z-S)K3Mq_&QxMo_3V\t\u001c7\r";
        f3021[63] = "/-dWHP1%~\u0018%J(<sD\u0007Q*>";
        f3021[64] = "s5tN[}m=n\u0001\u0013}w7vF\u001af7\u0000mk\u001a}{8gi\u0000fz k@\u001b";
        f3021[65] = "9;6VMx9;!\nAw#p!\u0014Ab$\u0001tK\u0018";
        f3021[66] = "s?\tl:Rs?\u001e06]it\u001e.6Hn\u0005L{e\t";
        f3021[67] = "K\u001a\u0007IX*K\u001a\u0010\u0015T%QQ\u0010\u000bT0V AQ\u0000";
        f3021[68] = "N\u001do\b7mN\u001dxT;bTVxJ;wS'*\u0011h7";
        f3021[69] = "Pg\u0002KHMPg\u0015\u0017DBJ,\u0015\tDWM]GR\u0016\u0011";
        f3021[70] = "Z\u0012{$/\u000fZ\u0012lx#\u0000@Ylf#\u0015G(=9wV\u0010\u0014ck1\u0015kE<?s";
        f3021[71] = "ay\u0018\u0007W1ay\u000f[[>{2\u000fE[+|C_\u001c\tj";
        f3021[72] = "H[L)1-TANu+9DB\u0005\u0552";
        f3021[73] = "jQ";
        f3021[74] = "SxIQ0HMpS\u001eWI\\k^DqO";
        f3021[75] = "@IUTPc\\SW\bJwLP\u001c7";
        f3021[76] = "a?\u0001c&ga?\u0016?*h{t\u0016!*}|\u0005D~{7";
        f3021[77] = "r\u0001\u0016H&/n\u001b\u0014\u0014<;~\u0018_\u000583x\u001d\u0005H5*t]\u0004\u0012=6n]!\n5#x\u0001$\u0012=6n";
        f3021[78] = "&Qp~5*&Qg\"9%<\u001ag<90;k7inv";
        f3021[79] = "K!;\f{\u0017O<;\u001df\u0017\f3t\na\u000bV<yWE\u001fK'";
        f3021[80] = "\u0004@\n\u0013C;\u001aH\u0010\\>+\u001a";
        f3021[81] = "E`L\u001f\u0011-YzNC\u000b9Iy\u0005R\u000f1O|_\u001f\u0002(C<YT\r<O`\u0005x1=DvNC\u0006*\u0019V";
        f3021[82] = "(}X3&64gZo<\"$d\u0011~8*\"aK353.!Zk1-3|\u0011o1-#jM3\u00115\"aKO1-#jM.\u0010";
        f3021[83] = "fL\u0015Qp5xD\u000f\u001e\u0013!|\t&^*2u";
        f3021[84] = "N_ }\u0006\u000bRE\"!\u001c\u001fBFi0\u0018\u0017DC3}\u0015\u000eH\u0003\"%\u0011\u0010U^i!\u0011\u0010EH5}1\bDC3\u0001\u0011\u0010EH5";
        f3021[85] = "tS3OJ_tS$\u0013FPn\u0018$\rFEiisT\u001f\u0001";
        f3021[86] = "\u0006\u0005?#6|\u001a\u001f=\u007f,h\n\u001cvn(`\f\u0019,#%y\u0000Y*h*m\f\u0005vD\u0016l\u0007\u0013=\u007f!{";
        f3021[87] = "+~mQ\ff7do\r\u0016r'g$\u04ea";
        f3021[88] = "Aw+o\u0015\u001aAw<3\u0019\u0015[<<-\u0019\u0000\\MlpM";
        f3021[89] = "\u001c~\u0015\u000fM\u0016\u001c~\u0002SA\u0019\u00065\u0002MA\f\u0001DR\u0011\u0014";
        f3021[90] = "\tf\u0018\u001e\u0015!\u0015|\u001aB\u000f5\u0005\u007fQ\u01cd";
        f3021[91] = "{OD\t5\r{OSU9\u0002a\u0004SK9\u0017fu\u0001\u0011nU";
        f3021[92] = "\u007f\bZH0Pc\u0012X\u0014*Ds\u0011\u0013\u02eb";
        f3021[93] = "ww\rd\u001c\u001bww\u001a8\u0010\u0014m<\u001a&\u0010\u0001jMKyHVz~\u00189\u0002-+&I";
        f3021[94] = "\u0011\u001f\u00128n?\r\u0005\u0010dt+\u001d\u0006[up#\u001b\u0003\u00018}:\u0017C\u0006oo>\u001b\u0000[_N%\n\f\u0001\u007fs$3\f\u001bw{/\f";
        f3021[95] = "~\u0006f/$\u0011u\tw`F\u0012z\u0000";
        f3021[96] = Long.TYPE;
        Scaffold.f3022[96] = "java/lang/Long";
        f3021[97] = "eK5k}DyQ77gPiR|&`Co\u0017'1f]y\u0017\u0006,bTx";
        f3021[98] = "\u001eu\u00041E\"\u0002o\u0006m_6\u0012lM|[>\u0014i\u00171V'\u0018)\u0016k^;\u0002)*qA2\u001fs\fmN\u0002\u0005n\u000fl";
        f3021[99] = "\u0004\\\u0002(G\u007f\u001aT\u0018g\u000f\u007f\u0000^\u0000 \u0006d@m\u0006,\rc\r\\\u0000,";
        f3021[100] = "<w(C\u0000J<w?\u001f\fE&<?\u0001\fP!Mm_[\u001b";
        f3021[101] = ")=KD\u0003y75Q\u000bzi\"7uD^d\u000e=M";
        f3021[102] = "$~v0\u00193$~al\u0015<>5ar\u0015)9D4-B";
        f3021[103] = "Yd=#ABYd*\u007fMMC/*aMXD^\u007f>\u0018";
        f3021[104] = "d\u0014gl{|d\u0014p0ws~_p.wfy.!w/#";
        f3021[105] = "\u0015Je$XL\tPgxBX\u0019S,iFP\u001fVv$KI\u0013\u0016ciI\\\tKmxY\u0017\u0019TkoDMTqOcRP\u0014uwf^P*TcsOK=YoogV\u001e]";
        f3021[106] = "\u0016u\n3,%\u0016u\u001do *\f>\u001dq ?\u000bOL(yz";
        f3021[107] = "7:(mTv+ *1Nb;#a\u03b8";
        f3021[108] = "t\u000bA\u000ePh\u007f\u0004PA-}m\u001eR\u0002";
        f3021[109] = "cIs\u001dZ\u0014cIdAV\u001by\u0002d_V\u000e~s5\u000b\u0003E)OkRD\u000eR\u001e?\u0007\u000e";
        f3021[110] = "p\u0004cO\u0005Ol\u001ea\u0013\u001f[|\u001d*\u0002\u001bSz\u0018pO\u0016JvXa\u0017\u0012Tk\u0005*\u000f\u0012Nh\u0019v\nY\u007fi\u0013j\u0015'[|\u001da\u0015";
        f3021[111] = "BA\u001f9lZBA\be`UX\n\b{`@_{Y/5\u000b";
        f3021[112] = """
                     :j\u001aG'y&p\u0018\u001b=m6sS
                     :~06\u0018\u001f0b!6	\u0010%i{]\u000b\f;x\u0016y\u0013
                     0`9y\u001f\u00050""";
        f3021[113] = "_Gjc\r/C]h?\u0017;S^#.\u00133U[yc\u001e*Y\u001b~4\f.UX#\u0004,?BCh?,.QAh";
        f3021[114] = "\t=\f\u001a\r*\u0015'\u000eF\u0017>\u0005$EW\u00136\u0003!\u001f\u001a\u001e/\u000fa\u000eB\u001a1\u0012<ED\u0013>\u001f*\u0019\u001a:)\u0003!\u001fd\u0013>\u001f*\u0019a\u000f;\u0007;\u000e";
        f3021[115] = "0rV>]=0rAbQ2*9A|Q'-H\u0010&\u0005g";
        f3021[116] = "1Qw&Cb1Q`zOm+\u001a`dOx,k1;\u001b;{Woi]x\u0000\u00060=\u001c";
        f3021[117] = "Ip";
        f3021[118] = "D\u0010";
        f3021[119] = "0YYD^\u00030YN\u0018R\f*\u0012N\u0006R\u0019-c\u0019_\u0000R";
        f3021[120] = "\u001ea\u001d,b\t]*\u0019L\u056dw\u001b9\u001bw,\u0016C#\n6";
        f3021[121] = "O);\u007f\u001bM\fb?\u001f\u03173Jq=$UR\u0012k,e";
        f3021[122] = "jW*b2\b*[hzo92I>a=E4OS\":^(K6'9E7YS";
        f3021[123] = "f\u0011E>Y\u0012f\rE$R*0\u001fD\u0005\u000fL3\u001fB2\u0018*f\u0011\u0005g\t\u0011;\u001eC![*";
        f3021[124] = "\u000e\u0018zi;\u0018\u0005\u0016=pC 5J$o1\u0005\u000fH)k)";
        f3021[125] = "\u007fZvf\u001b#m\u0001sf%pf\r#!{wf\u0017']Xff\u0007tg\u0014`<\u0016J";
        f3021[126] = """
                     w\u0014Ym-0?@\u0019"n
                     !\u001c\u0019Pz{N\u0018\u0001cl0u\u0015\u000ew+
                     """;
        f3021[127] = ",\u001f-C\u0011))TsL\u001b\u0015{G#L\fB.\u0017v\u0013`.w[<LZ,z_$";
        f3021[128] = "8~[OR>~0[B\u0002Xo WE\u0003\u000f8z\u0007\u0019o=|<S]V$}<S";
        f3021[129] = "\u0000!tG\"\u0012\u001a2|\u001aC\u001b\u00022q\u0012\u0014L[b)FC\u0015\u0005bgE:\u0010\b1%";
        f3021[130] = """
                     rx\u0006
                     \u0013yp3	
                     \u001eG1d\u0001T\u0007*K`\u0000C\u0002}pm\u000fWEG"m\u0014HC|/b\u0000\u000fy""";
        f3021[131] = "8\u0012\u0017G1(%\u001eCAW-\"\bxT31)t\u001cXo//\u0013I\fgsD";
        f3021[132] = "crC\f4|{\"K\n]\u007fho%Y9mhI4z]*`+\u0018[:\u007f4#D0";
        f3021[133] = """
                     x\u0013H\u000bFl(V
                     \u000b\u0016\u0007=J9\u0002E},@\u000eoOz<D	VV{<Du
                     Wz(QL\u0013Vz(-""";
        f3021[134] = "s9\u001b\u0001IXraC\u001c/L/~\u001f\u0003C~x>O^\u001f)y`\u0002\u0016K\u0013{m\u0006\u000e/";
        f3021[135] = "\u0012!'D\u001at\u0013y\u007fY|`Nf#F\u0010R\u001e%x\u001c|<\u001ft>@\u0016oO}x\u001c|";
        f3021[136] = "&6\u0018\u000bT\t#tRDLv{|\u000f\u0014C\u001fx\u0006Y\u0010\u001d\u0015wa\fD\u0015I\u001c";
        f3021[137] = "zm\u0017\u0000o#)/\u0015^sX/<\u0007gd3#<\u0007?7`|nGOfb+8\u0010?";
        f3021[138] = "Y\u001eDE\u001btR\bEO wM\u001e\u001aGIt7H\u001e\u0019C{P\u001dJ\u0011\u001f\u0010";
        f3021[139] = "4(\u0019\u001flk/*F\u0003S59iG\u0006?\u0007k*\u001eXS02(UZ*5?{\u0017a";
        f3021[140] = "\u001d\u0001\u0006A~P\u001b\u0004\bN\u0005\u0007B\u0002\u001cDRP\u001d^@(<\u0011\u001c\u0017\u0013\u0017:W\u001d_\u0012";
        f3021[141] = "u)\u001b'vA{e[c\u001cZ \u0019\u001b3bV0 \u001d6lY";
        f3021[142] = "n\\\u0000t\u001di-\u0017\u0004\u0014\u02ef\u0017k\u0004\u0006/Sv3\u001e\u0017n";
        f3021[143] = "\rr\u0015\u001f\u0018\n\u0006|R\u0006`\u04196 @X\u001b\u000bO+N\u001f\u0002";
        f3021[144] = "f}JD?$&:\u0000OdB\"~\u001cMy/\u0005a\fMy#8`p\u001d;$ef\n[b%6cp\u001d9,\"g\u001aNi%d;pY}&28J\u0015{|#\u0006@Ec-%`\u000f\u0019:(_";
        f3021[145] = "/G~\u0019\n\u00079Bc\u0017a\u03c5W\u0004:\u0019\u001e\u0010+\u0012?\u0004\u0010";
        f3021[146] = "q\\GP\u0001IkOO\r`@sOB\u00057\u0017*\u001b\u001aQ`Nt\u001fTR\u0019KyL\u0016";
        f3021[147] = """
                     O"?Q\u0010Y\u001fwmP\u000e2\u0013#-T\u0011^!wl\u000fG	v3)P\u001b\fL\u007f/
                     
                     2\u000b65YH\bG0oHv""";
        f3021[148] = "\u001diq|=\u001e^\"u\u001c\u01bb`B,\u007fx*\u0000\u001b4\"g";
        f3021[149] = "M_=-@=\u001e\u000f4k\u001cW\u001a\u0002>4M\u0000MZkk\u001fWM_=-@=\u001e\u000f4k\u001c";
        f3021[150] = "\u0007M\u0014vcfD\u0006\u0010\u0016\u0133\u0018\u0002\u0015\u0012--yZ\u000f\u0003l";
        f3021[151] = "J\u007f2r\\W\t46\u0012\u051d)O'4)\u0012H\u0017=%h";
        f3021[152] = "<\u0018\r,+j=@U1MulN\r%\u001a <\u001aRIt\"nH\u0018uqi0G\u0012";
        f3021[153] = "M$e*$yIc+1hE\u000e7!?*ED;<=,#\u000bge8V";
        f3021[154] = "F9v]\f\u0013\\*~\u0000m\u001aD*s\b:M\u001d\u007f*]m\u0014Cze_\u0014\u0011N)'";
        f3021[155] = "9\u001ehu\u0012\u0004yY\"~Ib}\u001d>|T\u000fZ\u0002.|T\u0003g\u0003RhP\u0006m[h$V\\|e/mL\u000f>_ck\u0016\u001e\u0000\u0018*qE\\:T,+Tb0\u00044zR\u0004\u007fXm\u007f(";
        f3021[156] = "I\u001dW\u00149\u0010X\u001e]D\u0004\u00055OUDgS\u000e\u001cQFo)^AQF~\u0012\rESN\u0004";
        f3021[157] = "$\fCW\u000bt6WFW570X\u0002\u0001r'YA\u0007\bXwc\r\u0001RII$\fCW\u000bt6WFW5";
        f3021[158] = "\"\u0011;A~a#Ic\\\u0018u~V?CtG(\u0013c\u001b'\u0010)OgGsw|\u001bo\u001b\u0018";
        f3021[159] = "Wp\u007f?\b9V('\"n&\u0007&\u007f69sWw'ZTp_;r`\u001e-\u0018+v";
        f3021[160] = "\u0011~'\u001d5JKlyHgpMz?D?\u001c\u007f.z\u001cep\u0011{{\u0019eIOq/\u001fcpMj>M$ITk>MX";
        f3021[161] = "&\u007f`UIT#4>ZChq'nZT?$w;\u00028S};qZ\u0002Qp?i";
        f3021[162] = "lpf*@~?{4\"@\u0004;su=_\u0004<v\u007f=\u0019?1ykz#";
        f3021[163] = "\u0002/G_\u0002|AdC?\u0210\u0002\u0007wA\u0004Lc_mPE";
        f3021[164] = "&_\u0004Y\u0006|'\u0007\\D`hz\u0018\u0000[\fZ,]\\\u0003Q\r-\u0001X_\u000bjxUP\u0003`";
        f3021[165] = "\u0014s\u000eOLnG#\u0007\t\u0010\u0004H\"\u001cRJhzvX\u000b\u0012=-uPISuRp\u0012\u0003\u001cm-";
        f3021[166] = "\b\u0016&\u001e\tnK]\"~\u019e\u0010^@1A\u000fm\nBp\u0007";
        f3021[167] = "\u0019_G\u0000\u001d>GU\u0013\u0006\u001b\u0007NR\u0012YLP\u0019\nG\u0000\u001a\u0007\u0019_G\u0000\u001d>GU\u0013\u0006\u001b";
        f3021[168] = "F1s=g0\\\"{`\u00069D\"vhQn\u001dt+>\u00067Cr`?\u007f2N!\"";
        f3021[169] = "R)RoTU\u0004{\u001atYe\nnMg\\\u0019\fh $[\u0002\u0010lE!X\u0019\u000f~ ";
        f3021[170] = "[;\nL;$\u0002h\u001fA'A\u0003x K==\u0013\u0003VL83\u00069TA<+b";
        f3021[171] = "[l\u0012N\u0002\u0012Sn\u000fB\u0004q\bg\u0018H\u001fq[lG\u0010\u001c\u000f\\pFUBqRk\u0011F\u0003\u0017\u001d7HCy";
        f3021[172] = "}.\u001c\u00061\u0003g=\u0014[P\n\u007f=\u0019S\u0007] aL\u000eP\u0004xm\u000f\u0004)\u0001u>M";
        f3021[173] = "yM\u0003$VsqO\u001e(P\u0010-M\nC\u001dq&D\u001c%R-\u007fAf";
        f3021[174] = "{\u0014iv`y(D`0<\u0013%Rkjgz&(=n9p)Oh:1,B";
        f3021[175] = "#*\u0000c\u000f~}0\u000fy\u0014\u001eg.]r\u0012s@1Mr\u0012\u007f}01f\u0016zwh\u000b*\u0010 fVLc\ns$l\u0000ePb\u001a+I\u007f\u0003  gO%\u0012\u001e*7Wt\u0014xek\u000eqn";
        f3021[176] = "7t\u000fF#Z?e\rG$d`o\u000eN.313_\u0017B^k6\u0000A%\u000b?>\\";
        f3021[177] = "\"\r\\>q\u001d!GW/'$f7T}~\u001exM\u0012$\u007fM}7T*|\u001du\r\u000e8\"H'7V!eV|\rT,aN\u0018\f\u000f>j@\"\u000e\u0002:r$}J\u0010*d\u001ddK\u0010*\u0018\u001dy[\u0010r%IsI\u00139\u0018";
        f3021[178] = "\t!`\u0013\u0016a\u00027a\u0019-jg#3HI>\u0003(%IC";
        f3021[179] = "\u0013u;H\u001d=S2qCF[\u0531\u000e8\u0016AaJt~O@2O\u000e|PC6\u001440V\u0019'*syLJe\u0010?\u007f\u0016[[\u0013omU\u0016fGe\u007fV][";
        f3021[180] = "sbv[M\r#'4[\u001df#60?D\u001b757\u0006]\u001a75KZ\\\u001b# rC]\u001b#\\";
        f3021[181] = "5oU%EE/|]x$L7|Pps\u001bn/\f$$B0,F']G=\u007f\u0004";
        f3021[182] = "0K~L\r&1\u0013&Qk2l\fzN\u0007\u0000:N&\u0014VW|\b~DUm0\u000e$Uk";
        f3021[183] = "$x\u001bSs&yw]\u0015!\u001dfvZ'uea{z\u0006ca\u001d D\u0016jy'\"I\u0012r\u001d-z@\u0004b{b&\u0019\u0001\u0018";
        f3021[184] = "G\u000bU\u001a6\u0010\u0001RTI3j\u0010T^D:=G\r\u0002\u0010njG\u000bU\u001a6\u0010\u0001RTI3";
        f3021[185] = "qv8DI//|:F2XDD\u001d-Vhvd \u0011\bbtf";
        f3021[186] = "Upv+R\nOc~v3\u0003Wcs~dT\u000e7&#3\rP3e)J\b]`'";
        f3021[187] = "c\u0001zR5r7\u000bhQ~O?\rjOc#\rY)\u00104tZYj\u0015fw(\\sEm\"Z";
        f3021[188] = "\u0017d\u001e/\u000e\u0018E8\u0016x~L\u0019 \u000ey\u0012~NbT$F)Mm\u0017a\u0012X\u0018 \u0014yF)Mb\b$\u001eS\u000b;\tw\u001b)M5\n'\u0013\u0013\u0017'TrA)";
        f3021[189] = "vHF\u0001 Ct\u0003I\u0001-} TX8#\u0019?B\u001e\u0003.\u0016+\u0005$Q.\r4\u0003\u001f\\!\u0019s9";
        f3021[190] = "L>z}$k\u001c{8}t\u0000\u0010a!\u0019-}\bi; 4|\biG|5}\u001c|~e4}\u001c\u0000\"d5i\t9;e5iu";
        f3021[191] = "t`4\u0019m_2o?\u001bq953r2e_%3j\u001daUNel\u0004~]tga\u0000f9~?h\u0016v_1c1\u0013\f";
        f3021[192] = "H\u0016Kcu\u001aPFCe\u001c\rC\u000b/?q\u0013C,\u00029wv\u0015\u0015\u000e-xL\u0017\u0018\n5\u001c\u0010OOO6p\b\u001fGI_";
        f3021[193] = "O'-(YZ\u001cw$n\u00050\u0013v?5_\\!\"{l\u0006\u000ev\"/m\u0005\rO|%9\u0003\u000bv";
        f3021[194] = "4\u0016\u000e9p,j\u001cZ?v\u0015j\u0000Ze+|iz\fauvf\u001dY5}*\r";
        f3021[195] = "u0dbdSo#l?\u0005Zw#a7R\r.u9`\u0005Tpsw`|Q} 5";
        f3021[196] = "syYZ\u0013|5}G\u0000\u0019\u0017%q^\u007fJk0}Ra_~!\u007f\"\u0003E'sy\\\u0004Y&6'\"";
        f3021[197] = "\u0004f\u001dL]\n\u001eu\u0015\u0011<\u0003\u0006u\u0018\u0019kT_$DJ<\r\u0001%\u000eNE\b\fvL";
        f3021[198] = "3\u00190yZ}pR4\u0019\u0550\u0003l\\>}Mc5Dcb";
        f3021[199] = "\u0000lw\u0002I]\u0016h-\u0005sH\u0000fu\u001b\u000f_\u0017Ry\u001c\u000fS\u000bfo`\rC\u0016yu\u0019MWS8\u0014P\u0012T\u0002sr\u001fN\r\u0007\t";
        f3021[200] = "\u001e\\\u0012\u001c[\f]\u0017\u0016|\u00d7rA\u0019\u001c\u0018L\u0012\u0018\u0001A\u0007";
        f3021[201] = "u~\b,gt65\fL\u00f6\np&\u000ew)k(<\u001f6";
        f3021[202] = "eqn)\u007f75$<(a\\9p|,~0\u000b$=w$c\\x}1p ea|1p\\fx8/r;3,0s\u0019";
        f3021[203] = "9&F[\u00193/#[Ur\u021dAeBU\u001br&#ZECO";
        f3021[204] = "j\r\u000eu\u0004\u001bj\u000e\u0001mXu\u0528`Vb^\u001e9\u0002\u000b;\u0002O3";
        f3021[205] = "r#f&#/1hbF\u0100Qw{`}m0/aq<";
        f3021[206] = "U\u0004ty|i\u0016Op\u0019\u0561\u0017P\\r\"2v\bFcc";
        f3021[207] = "D)R/Y\u000f\u0014|\u0000.Gd\u0018(@*X\b*|\u0001q\u0003U} A7V\u0018D9@7Vd\u00188A#C]\u00019A#?\u0001\u00008U6\u0006\u0018\u00018UJ";
        f3021[208] = "JQ\u0012gV\u007f\u0013\u0002\u0007jJ\u001a\u000b\u0014\t\u0005A~\u0003\u0012O>Lq\u0017UulLj\bSNaC~Oi\u001caXaIR\u0011nL&s";
        f3021[209] = "T)p#_\u0001\u0017btC\u0107\u007f\u000bl~'H\u001fRt#8";
        f3021[210] = "\"\r:>+1tT?hJ\u01d5I[ 2)vr\b$0!\f\"U$007qQ&8J";
        f3021[211] = "\u0004`\u001d\u0001b\u0019\u0019d\u0016]\u0006k2P>a\u0006J\u0002nC_9W\u0006e\u001f";
        f3021[212] = ":98\u007ffc;a`b\u0000wf~<}lE0<`'<\u0012vz8w>(:|bf\u0000";
        f3021[213] = "`\u00048+}0k\n\u007f2\u0005\u0494[Vf-w-aTk)o";
        f3021[214] = "XV\u001fs$\u0017\u0005YY5v,\rOK4\u0005K\u00115\u001bu)\u0016\u0001O],(E\u00045\u0019)2^\u0005\u000f\u001b$6Fa\u000e@6=H[\fM2%,[P\u001a($K\u000e\u0004\u0012tO\u001c\u0000SM1)S\\\nHK";
        f3021[215] = ")*C\u001f4;t%\u0005Yf\u0000k$\u0002c>f}\u0016\u001fK#`\u00104\u0006C2>*x\u0000\u0019#\u0000 (\u0018H%fotAM_";
        f3021[216] = "U\"\u0005 \u007f\rO1\r}\u001e\u0004W1\u0000uIS\u000edY$\u001e\nPa\u0016\"g\u000f]2T";
        f3021[217] = "k;u7l\u001a+|?<7|\u0389@2/2\u0011lz~)h\u0000";
        f3021[218] = "iE\u001d\"`G*\u000e\u0019B\u027e9l\u001d\u001by.X4\u0007\n8";
        f3021[219] = "N>L5'~\u001cbDbW*@z\\c;\u0018\u00178\u00054kO\u0017o_\u007fivQv^|gO\u00148Z>75Ra[m2O\u0016dAv3u\u0014iEnW";
        f3021[220] = "W[}hPzMHu51sUHx=f$\f\u001c$k1}R\u0018njHx_K,";
        f3021[221] = "TM\u000f~b>QT_u7L\u0003PXx6\u001bT\n\u000e'Zu\u0011\u000bW$(p\b[\\q";
        f3021[222] = "p\\\u0004k\u0015'3\u0017\u0000\u000b\u03ceYp[\u000b1\u000b#6\u0002\nb\u000eY*]\u001d:\u001bhx\u0001\u0015mk` \u0001TfQ:2_\u00014k`(\t\u0010:V4\"\u001b\u0013qk";
        f3021[223] = "0S5\u001cP?6V;\u0013+hoP/\u0019|?1\u0003ru\u0012td\u0004q\u0014\u0014~pA2";
        f3021[224] = "f2W\u0014`\u001d|!_I\u0001\u0014d!RAVC=q\r\u0017\u0001\u001acqD\u0016x\u001fn\"\u0006";
        f3021[225] = "\u0010\u0018#\u0015a\u0015\u0010\u001b,\r={\u0154u{\u0002;\u0010C\u0017&[gAI";
        f3021[226] = "CtTZn\u000e\u00126\u000eJai\u0017)\u0007G}>@r[\u0013,iCtTZn\u000e\u00126\u000eJa";
        f3021[227] = "\u000e\u001b!gl]\u0005\u0015f~\u0014\u05445I\u007faf@\u000fKre~$";
        f3021[228] = "[\r7?/J\tQ?h_\u001eUI'i3,\u0002\u000b}6c{XSz|d\u0002]^)>_";
        f3021[229] = "\u0004aZ<f\r\u00059\u0002!\u0000\u0019X&^>l+\u000fa\u0005`0|P'C0|EI&C0\u0000";
        f3021[230] = "aH+l)U3\u0014#;Y\u0001o\f;:538Nafed;A\"\"5\u0015n\f!:ad;N=g9\u001e}\u0017<4<d9\u0012&/=^;\u001f\"7Y";
        f3021[231] = "Y8q \u0012<\r:0fj\u015c67i\"\u0018zO2dqZA\u00066ip\u0010'Ij0uj";
        f3021[232] = "7>o|:\u001dwy%wa{\u0220E(dd\u00160\u007fdb>\u0007";
        f3021[233] = "NNyDKf\u0018\u0018b\u0001;tK\u0018X\u0003QFJ\b\u007f\u001f]r\\t}\u000f@mF\r=\u001b\u0005,'Db\u0018TgA\u000b>AQ\u001d";
        f3021[234] = "B<f\u001c}y\u0002{,\u0017&\u001f\u0014* 8 x\u0018\u001d5\r,v\u0000;\\EyyA'&\u0003 x\u0012\"\\E&s\u0006va\u0011,a\u0005=\\";
        f3021[235] = " /gx\u001d\u0004\"dhx\u0010:a#yA\u001e^i%?z\u0013Q}b\u0005(\u0013Jbd>%\u001c^%^l%\u0007A#ea*\u0013\u0006\u0019";
        f3021[236] = "\tvf71kJ=bW\u0523\u0015V3h3&u\u000f+5,";
        f3021[237] = "\\\u0003\rSZ3JZN\n\"\u0010d?7\u007f\"0E\u001b\u0013K^&\u001cXJ";
        f3021[238] = "\u001c\u001f39UX\u001dGk$3GLI30d\u0016\u0011\u0015g\\\nCTB'fXYM\u001el";
        f3021[239] = "7q\u0019RB\u0000t:\u001d2\u04c5~2)\u001f\t\f\u001fj3\u000eH";
        f3021[240] = "3@%'?\fp\u000b!G\u03f8r3E\": \u0018`\u0015+||";
        f3021[241] = "\u0003%\u0005iu\\@n\u0001\t\u02a9\"\u0003bSqy\u001e\u0007%\u001dj5";
        f3021[242] = "O\bshw,U\u001b{5\u0016%M\u001bv=Ar\u0014M(i\u0016+JK`jo.G\u0018\"";
        f3021[243] = "[J/[5\u001c\u0018\u0001+;\u02f5b^\u0012)\u0000{\u0003\u0006\b8A";
        f3021[244] = "8\tK\u0014\u000b=s_C\n\u000e@dU]\t\u0011,V\b\u001aSN@8\u0006GS\u0016:~_F\u0000\u0013@b\u0000QX\u0006q0\\Y\u000fv";
        f3021[245] = "lK)bl\u0006h\fgy :-\\masVUPkgwFlIjgw:nWkhz\u0000lZop\u001e";
        f3021[246] = "/\u0018twX\u00145\u000b|*9\u001d-\u000bq\"nJtX-u9\u0013*[gu@\u0016'\b%";
        f3021[247] = "uK\u0003<\f\u0007oX\u000bam\u000ewX\u0006i:Y.\u000f\\5m\u0000p\b\u0010>\u0014\u0005}[R";
        f3021[248] = "Y\u001b+V\u001eVC\b#\u000b\u007f_[\b.\u0003(\b\u0002YzR\u007fQ\\X8T\u0006TQ\u000bz";
        f3021[249] = "+[_f\u0007umCO>:\u0225SQ_f]p8\u001dGq\u0007\u0012!XHjAo\"K\u001e0:\"2FAu\\mn\u001fD\u000f";
        f3021[250] = "S\nfSE$\u0007\u0000tP\u000e\u0019\u000f\u0006vN\u0013u=R5\u0011D%jR5O\u001a$\f\u0014{O\u0017tj";
        f3021[251] = "]EGSYpGVO\u000e8y_VB\u0006o-\u0001\u000b\u0019[8wX\u0006TQArUU\u0016";
        f3021[252] = "[IT1\u000f\n\u001e\f\u0017:\u00003\r\u001e\u0015\u0011\fI\t\u0017\u0004ZT\t\u001e\u001d\u0005;\f\\XK\u0017Z\u0010K\u0006\u001eW`\\M\\\u000ficVA\u0010\u0012Y5\u0004\t\u000b\u001fi";
        f3021[253] = "6gXAdTu,\\!s*vn[\u0019cVm`U!c\u001aefH]x\u0014k^";
        f3021[254] = "S\"\u001cd7l[3\u0017jv\u000e\u000e9\b:Pg\u000e#\u0003U7s\u000fd^$mq\u000f`VU";
        f3021[255] = "\bj\u0019\u0012\u001d`Z6\u0011Em4\u0006.\tD\u0001\u0006QmY\u001eWQ\u000b4TQV(\u000e9\u0007\u0013mj\t/\u001bGWh\u0004+\u0003#";
        f3021[256] = "'~DAc[=mL\u001c\u0002R%mA\u0014U\u0005|=\u001eE\u0002\\\"=WC{Y/n\u0015";
        f3021[257] = "e.FF`U\u007f=N\u001b\u0001\\g=C\u0013V\u000b>j\u0018B\u0001R`mUDxWm>\u0017";
        f3021[258] = ";ye\u0001{6v8l\u0017\u001c<'?\u000f\u0005f-'9\u000f\u0014u/'CnVm\"ty3W'7+C";
        f3021[259] = "\u001eP\u0013.}YJRRh\u0005\u00e4q_\u000b,w\u001f\bZ\u0006\u007f5$J]\u0010ca\u001eHP\u0014{\u0005";
        f3021[260] = "7\b\u001aRg\u0012tC\u001e2\u040ela^\r\ra\u00115\\LK";
        f3021[261] = """
                     I\u0018\b6y\u0002\rU
                     "y}\u001b@\u0017+n\u0007\u0011A\u001d\u001f`\u0000\u001aC\u001fS>M	V\rbd\u0018HF\u0010S>B
                     B\f,z\u000f\bV\fS""";
        f3021[262] = "\u0005f9xuc\u000em=<\u000f\u0081hk%h4k\t3?yu";
        f3021[263] = "t\u001axP\\|7Q|0\u026c\u00020[u]\u001c8|]/L";
        f3021[264] = "?Y>\\M7lRlTMM|Z8PRMo_'K\u0014vbP3\f.";
        f3021[265] = "\u0011\tI\u000bK\u000b\u000b\u001aAV*\u0002\u0013\u001aL^}UJM\u0010\t*\f\u0014JZ\tS\t\u0019\u0019\u0018";
        f3021[266] = "m0\u0013\u000eN\u0017k5\u001d\u00015@23\t\u000bb\u0017mnRg\f\u001f9#\u0010\u001aGI1=\u0015";
        f3021[267] = """
                     ?7kRV\u000b}5nDZ7`g-T[[R3k\u000f\u0002
                     \u00050m
                     EHba/PUG\u0005""";
        f3021[268] = "\u001dh6:CdCr9 X\u0004Ylk+^i~s{+^eCr\u0007{\u001cb\u001et}=EcMq\u0007?Z`I*=s\\:X\u00147#Dk^rx\u007f\u001dn$";
        f3021[269] = "XD\u0017,/l\u000bOE$/\u0016\u0006H~)(f\u001a\u001cE$'r]&\u0017$<m[\u001d\u001a+(*a\u001f\u001c) u\u001bL\u0017{(ua";
        f3021[270] = "8b1\u0012\u0019'\"q9Ox.:q4G/yc i\u0017x =!\"\u0010\u0001%0r`";
        f3021[271] = ";W*l7{>Zy.\fg6Mwy`Uj\f)\"\facA&n=3?Iq\u001e";
        f3021[272] = "$\u0016\u001as=\u000b>\u0005\u0012.\\\u0002&\u0005\u001f&\u000bU\u007fP@v\\\f!U\tq%\t,\u0006K";
        f3021[273] = "\ttmM\u0005/B\"eS\u0000RU({P\u001f>g~>\u000e@m0\u007fb\b\u001b9W*6\u0000GR";
        f3021[274] = "v\u001e1%\u0000s>JqjCI \u0016q\u0005S-2\u0016\r2^94A6?Q-s{";
        f3021[275] = "%\u0016k\u0002*V$N3\u001fLByQo\u0000 p-\u001d0V|'-\u0012n\tqAk\\n\u0004!'";
        f3021[276] = "\u001e\u0000d\u0012GESAm\u0004 O\u0002F\u000f\u001c\\I\u0013[2\u001deI\tS:\u0016Z VFd\u0003A@\b\\k\u0019Z ";
        f3021[277] = "\u0014,7r\",\u001c=<|cNS9!>v\tCP|>~t\u001d!&<~p\u0015P|?i\u007f\u00142t.bqUP";
        f3021[278] = "S|Pya\u0016\u00107T\u0019ZhS;\u0006amTW|Hz!";
        f3021[279] = "hq@%gHmr[:u-1v\\\u0018t]-\u001f\u001c<d_5%\u001e1`GQ";
        f3021[280] = "(SPuV=)\u000b\bh0)t\u0014Tw\\\u001b$U\u000b-\fL|\u0015IyLue\u0014Iy0";
        f3021[281] = "\u0007j\f|f\bC{\u0014ti6_\u0005WucIYg\b`<FG\u0005T\u007f=UUb\u0001+5\t><Q{k\u000bXz\u001f{f[>";
        f3021[282] = "\u0004\u0015\toFM^MR(](]\u001dJVGR\\\u0006Vp\\AY5Wn]T=OSkRL\u0007M^oJ(";
        f3021[283] = ",\u0011`U~j)\u0012{Jl\u000fs\u0012wR\u0000fq\u000f|\u0014;k~\u001b;.";
        f3021[284] = "y\u0010dv2[c\u0003l+SR{\u0003a#\u0004\u0005\"S4tS\\|Swt*Yq\u00005";
        f3021[285] = "/ow-|\u0013d9\u007f3yns3a0f\u0002Ae$n9V\u0016dxhb\u0005q1,`>n";
        f3021[286] = "\u0003;$\u001bp\"Am&\bN\u021799}L-%^l)DqN";
        f3021[287] = "H\f\"C\t[\u000bG&#\u01ae%MT$\u0018GD\u0015N5Y";
        f3021[288] = "\u001b\u0004Bla:XOF\f\u047fD\u001b_B`|>HT\u0010h|";
        f3021[289] = "a>\u0019Em&eyW^!\u001a$!M^dB1;]Ps\u001ab%\u001e^t}7q\u0016\u0002\u001f!:=TY%#79L=";
        f3021[290] = "~n?Oba->6\t>\u000b\"?-Rdg\u0010ki\u000b>0Gkm\\~j-8=U86G";
        f3021[291] = "'s\u0006\u001bLed8\u0002{\u0255\u001b';\rBX%%p\u0002BU";
        f3021[292] = "f'\bg4\u00152-\u001ad\u007f(:+\u0018zbD\b\u007f[%5\u0010_\u007fXtxI5,\b}>\u0015_";
        f3021[293] = "\b@ZqcL\u0015L\u000ew\u0005V\u001dB\u0016fBFt\u001c\u000e3fC\u0013IZ;:(\b@ZqcL\u0015L\u000ew\u0005";
        f3021[294] = "^<Djn\u001aH9Yd\u0005\u0462&>@/e\\@~\u0007en\u0007&";
        f3021[295] = "\u0001\u0000p\u0001\u0003u\bB(U\u007f/k\u0010cQF6T\u0019!\t\u0012";
        f3021[296] = "\beF[4/\u0019g\u0019\u000e\u000e\"\rM\u0018^h*\u0006\u0006\u0006Pg)UbGG~:ke\u001b\tb\u007f\u0001t\u0019V7E";
        f3021[297] = "Ei}J_\u0012Sm'Me\u0006Ejrn\u0002\u0001Ib\u007fC\f\u0001Ikx(\t\u0017L6z\u0017\u0014\u0013Gj\u001eC\u0000\u001cKv%\u0010\u0004\u001eC\f.I\u0003\u0012Rja\u0015Z\u0017(";
        f3021[298] = "a\u0001+(\u001eH\"J/H\u02f96b]z+\u000bQ7\trw`\u000f`_ 6\u0005V3J-*`";
        f3021[299] = "}3\u000bD\f*+e\u0010\u0001|>yu/\u0017\u0018,y\t\u0018\u001a\f*.2\u0015\u0015\u0018m\u0014";
        f3021[300] = "%?\n4/;ft\u000eT\u03a1Ezz\u000408%#bY/";
        f3021[301] = "\bgT8RZ\u0012t\\e3S\ntQmd\u0004S\"\t93]\r$G:JX\u0000w\u0005";
        f3021[302] = "i4uzf}*\u007fq\u001a\u0262\u0003lls!(b4vb`";
        f3021[303] = "\u0000WuJ\"\"C\u001cq*\u0425\\\u0000\u0010#R.`\u0004WmIb";
        f3021[304] = "rllg5x,lhr1\u0016)2ie+{\u00052l\u007f2{\b=lY%p4\u001f~x2w%8V~%sHdvd'l.+*=\"\u0016";
        f3021[305] = "\u0010\bOAPnAJ\u0015Q_\tDU\u001c\\C^\u0013\u000e@\b\u0016\t\u0010\bOAPnAJ\u0015Q_";
        f3021[306] = "SI\u0015\u0014_5\u0010\u0002\u0011t\u0248K\t\u0013B\u0018\u001b!\u0018\u0011\u001dM";
        f3021[307] = "b]\u0017oSF!\u0016\u0013\u000f\u02338=\u0005F3DT%UN5";
        f3021[308] = "\u0003Al8\u0002lZY1'kw\bAK=\u0007`\b[\u000bg\tq\u0017Y1e\u0004u\u000f=m \fh\f]48Qwe";
        f3021[309] = "vN\u0001?\u0016Y}E\u0005{l\u02cf\u001b\u0012M=\u0013\u001b#\u0019F9W";
        f3021[310] = "^\u001a\u0006WzRU\u0002\u001cP\u001b\u0014T\u000e\u0000@c\u0001T\n\u0000PjhJ\u001c\u0005R`T\u0014\u0016\u0007P\u001bRK_\u0005P|\u0007\u001fWY;\u007f\u0013M\u000e\u001d\u0007!\u0019O\ff";
        f3021[311] = "0cen\u0011\"u&&e\u001e\u001bh\"\u0002h\u000b\u007f`25o\u0017v\t`fcI{s&?b\u001a~\tb:x\u0001\u007f3`7|\u0019\u001b";
        f3021[312] = "\u0013\u0015];\"R\t\u0006UfC[\u0011\u0006Xn\u0014\fHS\u00022CU\u0016VN9:P\u001b\u0005\f";
        f3021[313] = "\t\u0016h \"<DWa6E6\u0015P\u0012.#7\u0019C\u0001 99xU(w82G\u001c:7$Y";
        f3021[314] = "$\u000bF;\u0017\r#\u0019A=r\u0017~\u0006Dm\u001b\u001bG\bD}\u001f}\"\u0003]r\u0016G \u000eYjr";
        f3021[315] = "\u001d\u0000\u0004GJ4\u0007\u0013\f\u001a+=\u001f\u0013\u0001\u0012|jFDXC+3\u0018C\u0017ER6\u0015\u0010U";
        f3021[316] = "bmnCUZ6g|@\u001eg>a~^\u0003\u000b\f5=\u0001T^[7`C\u0016\u0003a5mG\u000eg";
        f3021[317] = "\u0015\r\t|c\u001cL^\u001cq\u007fyGQ\u0003wgy\u001cT\bqg\u001fS\bQt\u001d";
        f3021[318] = "!F\u001b#\u0004\u0019 \u001eC>b\r}\u0001\u001f!\u000e?+FBy[h)B\u001e(_\u000eo\f\u001e%\u000fh";
        f3021[319] = "\u0017!_5[,\u0011g^}Z\u0013@8\r)\\D\u0017i^r0*W`\u0010.WoQh^0";
        f3021[320] = "WaAMc\u001c\u000bg\u0019Pfx\u0206\u001b@U%\b\r|\u0005S-F\u0013\u001b";
        f3021[321] = "%Ix\u001f*)n\u001fp\u0001/Ty\u0015n\u000208KH)XnT%FtX7.c\u001fu\u000b2T&Ai\u0000=8y\u0011v\u001alT";
        f3021[322] = "\u001c\u001eCAwv\u0015\\\u001b\u0015\u000b&v\u000eP\u001125I\u0007\u0012If";
        f3021[323] = "2\u0011\u001d?-0aA\u0014yqZuD\u0017?!!\u000b\u0014N{'+7\\\f'.6\u000b";
        f3021[324] = "4Z@L+v3HGJNx`T[\u001a\th\t\u000bD\n<b3\tI\u000e$\u00064Z@L+v3HGJN";
        f3021[325] = "?&Fm1m=mIm<Sm0B(22`,g9*So3T/ahb<@h[hd*V0aji.NT";
        f3021[326] = "Ru5K\u00153\u000fq*Z\u0016\\\u041dMq\u0011\u00187\u001aqtZF8\u0010M";
        f3021[327] = ":_Q l];\u0007\t=\nIf\u0018U\"f{0]\by:,2\u001eY)k\u0012:\u000f[(l,";
        f3021[328] = "b\u001e\u0003\u000fLS$P\u0003\u0002\u001c55@\u000f\u0005\u001dbb\u001a_XqP&\\\u000b\u001dHI'\\\u000b";
        f3021[329] = "u#D|\u007fOt{\u001ca\u0019[)d@~ui}(\u0010!!>!e]pe\u00078d]p\u0019[9eIe B8eI\u0019|C9q\\ eB9q )xX+bFf$\u0001.\u0018";
        f3021[330] = "j\u0000D\u0015\u0018+p\u0013LHy\"h\u0013A@.u1E\u001a\u0017y,oCW\u0017\u0000)b\u0010\u0015";
        f3021[331] = "dCm^mX6Yt\u0002&b8DhXz\u000e\n\u0016*\u0001$bgL,[v\u00052\u0018$\u0007\u001d[6\u0017z\td\u000bf[-^\u001d";
        f3021[332] = "*\u0003a}_&`S;+IZkQ!S@\u0015j[ rJZ+^ fB`)S$~&jqZ2n@%-\u00037\u0014";
        f3021[333] = "\u0015kq\u001f\u001fQV u\u007f\u02ef/\u00103wDQNH)f\u0005";
        f3021[334] = "\u0005QY\r.'F\u001a]m\u0191YY\u0015M\u0004,`@\u0014M\u0004";
        f3021[335] = "H\u0005\u000eNj6\u000bN\n.\u0109HM]\b\u0015$)\u0015G\u0019T";
        f3021[336] = "\u0014u)AbVI6dC\u0005\b\u00188v\u001ai:Ju.L\u0005\u000fH\u007fq\u0006=\u0006\u0005=l}";
        f3021[337] = "%?;\u0017q1ft?w\u04d1Oa~6\u001a1u-xl\u000b";
        f3021[338] = "\u000ba;hC\u001cM8:;Ff_& ;G\u001d269\"X\\\t;66\u001ff\t=  G\\\u000b0$8#";
        f3021[339] = ":j%\rp\u001f|$%\u0000 ym4)\u0007!.:nyYM\u001c~(-\u001ft\u0005\u007f(-";
        f3021[340] = "{%Z9uT{&U!):\u011fH\u0002./Q(*_ws\u0000\"";
        f3021[341] = "0\u0013\t#&%y\u0001I?Mf.,V: \u001a3\u001a\\46c0\u0005\u0006nM";
        f3021[342] = "\"B`b~pvHra5M~Np\u007f(!L\u001a3 pr\u001b\u001a2yu-a\\kx&(\u001b";
        f3021[343] = "\u0013n+W9P[pu\u000b*/Dp-\u0006\u0015SGtKS+JQ~\"\u0006)\u0017XnKQ6RXuqS;V@\u0011p\b)]N+r\u0005-E*+.R7DM~zZk/";
        f3021[344] = "qW\u0015v&1kD\u001d+G8sD\u0010#\u0010o*\u0011JtG6t\u0014\u0006t>3yGD";
        f3021[345] = "vg$\u001e{H3r&\u0015!&\u042e\u0000f\u0019dT+:d\u0014`LO0<\u001dv\\)\u007f`Ds&";
        f3021[346] = "Uy5sA'\u0017/7`\u007f\u052bo{l$\u001c \b.8,@K";
        f3021[347] = "@<\u0002\u0003\u001al\u0003w\u0006c\u04dc\u0012Ed\u0004XTs\u001d~\u0015\u0019";
        f3021[348] = """
                     j\u001c
                     s!@:LF$v96\u001aH}wU\u0004H
                     "/92F\u000b!w\u0002o\u0005F#\u0010""";
        f3021[349] = "T?\u001cL%2\u0002?\u001e@)C\u000bb]@\u007f/96\u0018\u001c%{n5D\u0018{(\t`\u0010\u0010'C";
        f3021[350] = "20X\u0003Hyj*IBxcc-iY\u0003yd0SY\u0004i\u000e+KY\u0003}riXI\u0012\u001820X\u0003Hyj*IBx";
        f3021[351] = "WE\u0015<vR\u0002Q\u0014z14\u0000T\u0007f'cS\u0005S:K\r\u001eJT?-X\nK\u0012x";
        f3021[352] = "fNQ*\u0010\u0015/\\\u00116{PrD\b3\u0005G\u001fT\n6\u0018P$\u0007\u000e4\u0010*fNQ*\u0010\u0015/\\\u00116{";
        f3021[353] = "4t\u0011dNmiu[q\u0011Wo18q\u0019&c0;m\n6h6\u0001s\u001fW5(\u001dg\u0014m7%\u0019\u007fp";
        f3021[354] = "OAH\u0005;h\u001d\u001d@RK<A\u0005XS'\u000e\u0011@\u0003\ntY\u0017\u001bEF/c\u0015\u0016A^K";
        f3021[355] = "K\u0007/u\u007f\u0000Q\u0014'(\u001e\tI\u0014* I^\u0010Erq\u001e\u0007ND<wg\u0002C\u0017~";
        f3021[356] = "bpk\u001cYEi~,\u0005!\u00e7Y&k^\u001fAb%f\u0016K<fe=\u0002QP:z&\u0018!\u0007;d%\u0003\u001b\u00056`=g\u0011]?v-\u0001^\u0001fsW";
        f3021[357] = "69Mm\u000b\u000b,*E0j\u00024*H8=Umy\u0014ij\f3z^o\u0013\t>)\u001c";
        f3021[358] = "p13\u007fuq:ltoqK/dvo{'\u001d400,tJ323#w:b0du J9kis1,v70vK";
        f3021[359] = "!_CdQUb\u0014G\u0004\u023d+$\u0007E?\u001fJ|\u001dT~";
        f3021[360] = "LyuX\u000bV\u000f2q8\u0384(L\u007f}VHN\n1}[\u0018(\b8xUK\u0012D>\"Du";
        f3021[361] = ".C!_~Kw\u00104Rb.z\u001d:Gquz\u0007F\u0004bWn\u001dwDn\u0015v@F";
        f3021[362] = "O5Vj\tHU&^7hAM&S??\u0016\u0014p\bjhOJvEh\u0011JG%\u0007";
        f3021[363] = "b[\u001ex\u007fmxH\u0016%\u001ed`H\u001b-I39\u0019Cz\u001ejg\u0018\rzgojKO";
        f3021[364] = "A\u0002UC{\u0007\u0007[T\u0010~}\u001dQO\u0019|\u0011/\u0005\u000bA*Fx\u0005\u000f\u0017f\u001c\u0012V_\u001e @x\u0005\r\u001f!\u001d\u0002CT\u001er\u0018x";
        f3021[365] = "m,Ap'\u0007+u@#\"}1\u007f[* \u0011\u0003.\u0019wzMT+\u0018+)@2mV+$\u0010T";
        f3021[366] = "KtF)o\u0001\u001e`Go(g\u001ceTs>0O4\u0001'R^\u0002{\u0007*4\u000b\u0016zAm";
        f3021[367] = "\n\bY\u000b%\u001e\f\rW\u0004^IU\u000bC\u000e\t\u001e\u000b\\\u001bbo\u001cP\u0003A\u0013nD\b\u001e";
        f3021[368] = "`'5\b\u0000}z4=Uatb40]6#;`l\fazed&\n\u0018\u007fh7d";
        f3021[369] = """
                     cVWEBG`\u001c\\T\u0014~\u04dcl_YG\u0003hQ\u000bSU\u0000#l_HT@d
                     
                     \\U\u0006#l]ZV\f=V_WR\u0014YW\u0004EY\u001acU	AA~""";
        f3021[370] = ".\u0000\u000b\u0005\b1{]P\u0014\tC\u007fFK\u0013X%hgP\fX\u0006u_U\bNC-FTS\u00052wDTW\rC";
        f3021[371] = "A=!Q'\u0014\u0002v%1\u0558j\u001bgv]c\u0000\ne)\b";
        f3021[372] = "zOD\u0014ID9\u0004@t\u0431:zNJ\u0016I_#\u001d_\u001bU";
    }
}
