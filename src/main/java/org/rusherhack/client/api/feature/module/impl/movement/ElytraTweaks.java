// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.Obf330;
import org.rusherhack.Obf074;
import org.rusherhack.Class253;
import org.rusherhack.Class066;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.client.api.events.network.EventPacket;
import org.rusherhack.client.api.events.world.EventEntity;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.client.api.feature.module.Module;
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
import org.rusherhack.client.api.events.client.EventUpdate;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.core.setting.Setting;
import java.util.ArrayDeque;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import net.minecraft.entity.LivingEntity;
import java.util.Iterator;
import net.minecraft.entity.Entity.RemovalReason;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinFireworkRocketEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.entity.Entity;
import org.rusherhack.client.api.utils.WorldUtils;
import java.util.Map;
import net.minecraft.util.math.ChunkPos;
import java.util.HashSet;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.utils.Timer;
import net.minecraft.network.packet.Packet;
import java.util.Queue;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.module.impl.misc.PingSpoof;
public final class ElytraTweaks extends ToggleableModule
{
    private final EnumSetting<Obf074> delaymode;
    private final BooleanSetting nobounce;
    private final BooleanSetting onground;
    private final BooleanSetting extendTheLifespanOfFireworkRocketsOn2b2t;
    private final Queue<Packet<?>> f6804;
    private final BooleanSetting fixrocketdesync;
    private boolean f6806;
    private boolean f6807;
    private boolean f6808;
    private boolean f6809;
    private final BooleanSetting f6810;
    private final Timer f6811;
    private int f6812;
    private final Timer f6813;
    private final NumberSetting<Integer> f6814;
    private final BooleanSetting inventory;
    private final HashSet<ChunkPos> f6816;
    private static long f6817;
    private static String[] f6818;
    private static String[] f6819;
    private static Map f6820;
    private static long[] f6821;
    private static Integer[] f6822;
    private static Map f6823;
    private static Object[] f6824;
    private static String[] f6825;
    
    private void m13095() {
        final long n = ElytraTweaks.f6817 ^ 0x690CE13B0794L;
        final int m9154 = Class253.m9154();
        final Iterator iterator = WorldUtils.getEntities().iterator();
        final int n2 = m9154;
    Label_0024:
        while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                Entity entity3;
                final Entity entity2;
                final Entity entity = entity2 = (entity3 = (Entity)iterator.next());
                Label_0064: {
                    try {
                        if (n2 != 0) {
                            break Label_0064;
                        }
                        if (!(entity instanceof FireworkRocketEntity)) {
                            continue Label_0024;
                        }
                    }
                    catch (final ArrayIndexOutOfBoundsException ex) {
                        ex.printStackTrace();
                    }
                    entity3 = entity2;
                }
                final IMixinFireworkRocketEntity mixinFireworkRocketEntity = (IMixinFireworkRocketEntity)entity3;
                Label_0099: {
                    LivingEntity attachedEntity = null;
                    try {
                        attachedEntity = mixinFireworkRocketEntity.getAttachedEntity();
                        if (n2 != 0) {
                            break Label_0099;
                        }
                        if (attachedEntity == null) {
                            continue Label_0024;
                        }
                    }
                    catch (final ArrayIndexOutOfBoundsException ex2) {
                        ex2.printStackTrace();
                    }
                    mixinFireworkRocketEntity.getAttachedEntity();
                    try {
                        if (!((Entity)attachedEntity).equals((Object)Globals.mc.player)) {
                            iterator2 = iterator;
                            continue;
                        }
                    }
                    catch (final ArrayIndexOutOfBoundsException ex3) {
                        ex3.printStackTrace();
                    }
                }
                try {
                    Globals.mc.world.removeEntity(entity2.getId(), Entity.RemovalReason.DISCARDED);
                    continue Label_0024;
                }
                catch (final ArrayIndexOutOfBoundsException ex4) {
                    this.f6806 = true;
                    if (n2 == 0) {
                        continue Label_0024;
                    }
                }
                break;
            }
            break;
        }
    }
    
    @Subscribe
    private void m13096(final EventPlayerUpdate p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          78119542972984
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: aload_1        
        //    15: astore_0       
        //    16: astore_1       
        //    17: aload_1        
        //    18: getfield        org/rusherhack/ElytraTweaks.extendTheLifespanOfFireworkRocketsOn2b2t:Lorg/rusherhack/core/setting/BooleanSetting;
        //    21: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    24: checkcast       Ljava/lang/Boolean;
        //    27: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    30: iload           4
        //    32: ifne            837
        //    35: ifeq            828
        //    38: goto            45
        //    41: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    44: athrow         
        //    45: aload_1        
        //    46: getfield        org/rusherhack/ElytraTweaks.f6808:Z
        //    49: iload           4
        //    51: ifne            142
        //    54: goto            61
        //    57: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    60: athrow         
        //    61: ifeq            138
        //    64: goto            71
        //    67: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    70: athrow         
        //    71: aload_1        
        //    72: getfield        org/rusherhack/ElytraTweaks.f6816:Ljava/util/HashSet;
        //    75: invokevirtual   java/util/HashSet.clear:()V
        //    78: invokestatic    org/rusherhack/client/api/utils/WorldUtils.getChunks:()Ljava/util/List;
        //    81: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    86: dup            
        //    87: astore_0       
        //    88: invokeinterface java/util/Iterator.hasNext:()Z
        //    93: ifeq            133
        //    96: aload_0        
        //    97: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   102: checkcast       Lnet.minecraft.world.chunk.WorldChunk;
        //   105: astore          5
        //   107: aload_0        
        //   108: aload_1        
        //   109: getfield        org/rusherhack/ElytraTweaks.f6816:Ljava/util/HashSet;
        //   112: aload           5
        //   114: invokevirtual   net.minecraft.world.chunk.Chunk.getPos:()Lnet.minecraft.util.math.ChunkPos;
        //   117: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   120: pop            
        //   121: iload           4
        //   123: ifne            665
        //   126: goto            88
        //   129: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   132: athrow         
        //   133: aload_1        
        //   134: iconst_0       
        //   135: putfield        org/rusherhack/ElytraTweaks.f6808:Z
        //   138: aload_1        
        //   139: getfield        org/rusherhack/ElytraTweaks.f6812:I
        //   142: iconst_m1      
        //   143: iload           4
        //   145: ifne            283
        //   148: if_icmpeq       281
        //   151: goto            158
        //   154: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   157: athrow         
        //   158: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   161: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   164: invokevirtual   net.minecraft.entity.LivingEntity.isFallFlying:()Z
        //   167: iload           4
        //   169: ifne            250
        //   172: goto            179
        //   175: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   178: athrow         
        //   179: ifne            240
        //   182: goto            189
        //   185: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   188: athrow         
        //   189: aload_1        
        //   190: getfield        org/rusherhack/ElytraTweaks.f6810:Lorg/rusherhack/core/setting/BooleanSetting;
        //   193: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   196: checkcast       Ljava/lang/Boolean;
        //   199: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   202: iload           4
        //   204: ifne            250
        //   207: goto            214
        //   210: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   213: athrow         
        //   214: ifne            240
        //   217: goto            224
        //   220: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   223: athrow         
        //   224: aload_1        
        //   225: dup            
        //   226: iconst_1       
        //   227: dup            
        //   228: dup            
        //   229: pop2           
        //   230: putfield        org/rusherhack/ElytraTweaks.f6809:Z
        //   233: goto            549
        //   236: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   239: athrow         
        //   240: aload_1        
        //   241: getfield        org/rusherhack/ElytraTweaks.f6811:Lorg/rusherhack/core/utils/Timer;
        //   244: ldc2_w          55000.0
        //   247: invokevirtual   org/rusherhack/core/utils/Timer.passed:(D)Z
        //   250: iload           4
        //   252: ifne            285
        //   255: ifeq            281
        //   258: goto            265
        //   261: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   264: athrow         
        //   265: aload_1        
        //   266: dup            
        //   267: iconst_1       
        //   268: dup            
        //   269: dup            
        //   270: pop2           
        //   271: putfield        org/rusherhack/ElytraTweaks.f6809:Z
        //   274: goto            549
        //   277: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   280: athrow         
        //   281: iconst_0       
        //   282: iconst_1       
        //   283: dup            
        //   284: pop2           
        //   285: istore_0       
        //   286: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   289: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   292: invokevirtual   net.minecraft.entity.Entity.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   295: astore          5
        //   297: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   300: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   303: invokevirtual   net.minecraft.entity.Entity.getVelocity:()Lnet.minecraft.util.math.Vec3d;
        //   306: astore          7
        //   308: new             Lnet.minecraft.util.math.BlockPos;
        //   311: dup            
        //   312: aload           5
        //   314: invokevirtual   net.minecraft.util.math.Vec3i.getX:()I
        //   317: i2d            
        //   318: aload           7
        //   320: getfield        net.minecraft.util.math.Vec3d.x:D
        //   323: ldc2_w          5.0
        //   326: dmul           
        //   327: dadd           
        //   328: d2i            
        //   329: aload           5
        //   331: invokevirtual   net.minecraft.util.math.Vec3i.getY:()I
        //   334: aload           5
        //   336: invokevirtual   net.minecraft.util.math.Vec3i.getZ:()I
        //   339: i2d            
        //   340: aload           7
        //   342: getfield        net.minecraft.util.math.Vec3d.z:D
        //   345: ldc2_w          5.0
        //   348: dmul           
        //   349: dadd           
        //   350: d2i            
        //   351: invokespecial   net.minecraft.util.math.BlockPos.<init>:(III)V
        //   354: astore          6
        //   356: aload_1        
        //   357: getfield        org/rusherhack/ElytraTweaks.f6816:Ljava/util/HashSet;
        //   360: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   363: astore          8
        //   365: aload           8
        //   367: invokeinterface java/util/Iterator.hasNext:()Z
        //   372: ifeq            482
        //   375: aload           8
        //   377: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   382: checkcast       Lnet.minecraft.util.math.ChunkPos;
        //   385: astore          9
        //   387: aload           6
        //   389: invokevirtual   net.minecraft.util.math.Vec3i.getX:()I
        //   392: aload           9
        //   394: invokevirtual   net.minecraft.util.math.ChunkPos.getStartX:()I
        //   397: iload           4
        //   399: ifne            415
        //   402: if_icmplt       365
        //   405: aload           6
        //   407: invokevirtual   net.minecraft.util.math.Vec3i.getX:()I
        //   410: aload           9
        //   412: invokevirtual   net.minecraft.util.math.ChunkPos.getEndX:()I
        //   415: iload           4
        //   417: ifne            440
        //   420: if_icmpgt       365
        //   423: goto            430
        //   426: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   429: athrow         
        //   430: aload           6
        //   432: invokevirtual   net.minecraft.util.math.Vec3i.getZ:()I
        //   435: aload           9
        //   437: invokevirtual   net.minecraft.util.math.ChunkPos.getStartZ:()I
        //   440: iload           4
        //   442: ifne            465
        //   445: if_icmplt       365
        //   448: goto            455
        //   451: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   454: athrow         
        //   455: aload           6
        //   457: invokevirtual   net.minecraft.util.math.Vec3i.getZ:()I
        //   460: aload           9
        //   462: invokevirtual   net.minecraft.util.math.ChunkPos.getEndZ:()I
        //   465: if_icmpgt       365
        //   468: iconst_1       
        //   469: dup            
        //   470: dup            
        //   471: pop2           
        //   472: dup            
        //   473: istore_0       
        //   474: iload           4
        //   476: ifne            392
        //   479: goto            483
        //   482: iload_0        
        //   483: ifne            548
        //   486: aload_1        
        //   487: dup            
        //   488: iconst_1       
        //   489: dup            
        //   490: dup            
        //   491: pop2           
        //   492: putfield        org/rusherhack/ElytraTweaks.f6809:Z
        //   495: goto            502
        //   498: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   501: athrow         
        //   502: getfield        org/rusherhack/ElytraTweaks.f6804:Ljava/util/Queue;
        //   505: invokeinterface java/util/Collection.isEmpty:()Z
        //   510: ifne            548
        //   513: aload_1        
        //   514: getfield        org/rusherhack/ElytraTweaks.f6804:Ljava/util/Queue;
        //   517: invokeinterface java/util/Queue.poll:()Ljava/lang/Object;
        //   522: checkcast       Lnet.minecraft.network.packet.Packet;
        //   525: invokestatic    org/rusherhack/PingSpoof.m9748:(Lnet.minecraft.network.packet.Packet;)V
        //   528: aload_1        
        //   529: iload           4
        //   531: ifne            549
        //   534: goto            541
        //   537: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   540: athrow         
        //   541: goto            502
        //   544: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   547: athrow         
        //   548: aload_1        
        //   549: getfield        org/rusherhack/ElytraTweaks.f6809:Z
        //   552: iload           4
        //   554: ifne            600
        //   557: ifeq            591
        //   560: goto            567
        //   563: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   566: athrow         
        //   567: iconst_0       
        //   568: aload_1        
        //   569: dup            
        //   570: dup_x2         
        //   571: iconst_m1      
        //   572: aload_1        
        //   573: iconst_0       
        //   574: putfield        org/rusherhack/ElytraTweaks.f6807:Z
        //   577: putfield        org/rusherhack/ElytraTweaks.f6812:I
        //   580: invokevirtual   org/rusherhack/ElytraTweaks.m13095:()V
        //   583: putfield        org/rusherhack/ElytraTweaks.f6809:Z
        //   586: return         
        //   587: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   590: athrow         
        //   591: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   594: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   597: invokevirtual   net.minecraft.entity.LivingEntity.isFallFlying:()Z
        //   600: iload           4
        //   602: ifne            635
        //   605: ifne            650
        //   608: goto            615
        //   611: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   614: athrow         
        //   615: aload_1        
        //   616: getfield        org/rusherhack/ElytraTweaks.f6810:Lorg/rusherhack/core/setting/BooleanSetting;
        //   619: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   622: checkcast       Ljava/lang/Boolean;
        //   625: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   628: goto            635
        //   631: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   634: athrow         
        //   635: iload           4
        //   637: ifne            837
        //   640: ifeq            828
        //   643: goto            650
        //   646: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   649: athrow         
        //   650: invokestatic    org/rusherhack/client/api/utils/WorldUtils.getEntities:()Ljava/util/List;
        //   653: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   658: goto            665
        //   661: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   664: athrow         
        //   665: astore_0       
        //   666: aload_0        
        //   667: invokeinterface java/util/Iterator.hasNext:()Z
        //   672: ifeq            828
        //   675: aload_0        
        //   676: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   681: checkcast       Lnet.minecraft.entity.Entity;
        //   684: dup            
        //   685: astore          5
        //   687: iload           4
        //   689: ifne            719
        //   692: instanceof      Lnet.minecraft.entity.projectile.FireworkRocketEntity;
        //   695: iload           4
        //   697: ifne            837
        //   700: goto            707
        //   703: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   706: athrow         
        //   707: ifeq            666
        //   710: goto            717
        //   713: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   716: athrow         
        //   717: aload           5
        //   719: checkcast       Lnet.minecraft.entity.projectile.FireworkRocketEntity;
        //   722: dup            
        //   723: astore          7
        //   725: checkcast       Lorg/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity;
        //   728: dup            
        //   729: astore          6
        //   731: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity.getAttachedEntity:()Lnet.minecraft.entity.LivingEntity;
        //   736: ifnull          666
        //   739: aload           6
        //   741: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity.getAttachedEntity:()Lnet.minecraft.entity.LivingEntity;
        //   746: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   749: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   752: invokevirtual   net.minecraft.entity.Entity.equals:(Ljava/lang/Object;)Z
        //   755: iload           4
        //   757: ifne            672
        //   760: iload           4
        //   762: ifne            799
        //   765: ifne            783
        //   768: goto            775
        //   771: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   774: athrow         
        //   775: aload_0        
        //   776: goto            667
        //   779: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   782: athrow         
        //   783: aload_1        
        //   784: iload           4
        //   786: ifne            818
        //   789: getfield        org/rusherhack/ElytraTweaks.f6812:I
        //   792: goto            799
        //   795: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   798: athrow         
        //   799: iconst_m1      
        //   800: if_icmpeq       808
        //   803: return         
        //   804: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   807: athrow         
        //   808: aload_1        
        //   809: dup            
        //   810: aload           7
        //   812: invokevirtual   net.minecraft.entity.Entity.getId:()I
        //   815: putfield        org/rusherhack/ElytraTweaks.f6812:I
        //   818: getfield        org/rusherhack/ElytraTweaks.f6811:Lorg/rusherhack/core/utils/Timer;
        //   821: invokevirtual   org/rusherhack/core/utils/Timer.reset:()V
        //   824: aload_0        
        //   825: goto            667
        //   828: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   831: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   834: invokevirtual   net.minecraft.entity.LivingEntity.isFallFlying:()Z
        //   837: iload           4
        //   839: ifne            872
        //   842: ifeq            875
        //   845: goto            852
        //   848: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   851: athrow         
        //   852: aload_1        
        //   853: getfield        org/rusherhack/ElytraTweaks.nobounce:Lorg/rusherhack/core/setting/BooleanSetting;
        //   856: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   859: checkcast       Ljava/lang/Boolean;
        //   862: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   865: goto            872
        //   868: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   871: athrow         
        //   872: ifne            876
        //   875: return         
        //   876: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   879: iload           4
        //   881: ifne            984
        //   884: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   887: new             Lnet.minecraft.world.RaycastContext;
        //   890: dup            
        //   891: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   894: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   897: invokevirtual   net.minecraft.entity.Entity.getPos:()Lnet.minecraft.util.math.Vec3d;
        //   900: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   903: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   906: invokevirtual   net.minecraft.entity.Entity.getPos:()Lnet.minecraft.util.math.Vec3d;
        //   909: ldc2_w          -0.05
        //   912: dconst_0       
        //   913: dup2_x2        
        //   914: invokevirtual   net.minecraft.util.math.Vec3d.add:(DDD)Lnet.minecraft.util.math.Vec3d;
        //   917: getstatic       net.minecraft.world.RaycastContext.ShapeType.COLLIDER:Lnet.minecraft.world.RaycastContext.ShapeType;
        //   920: getstatic       net.minecraft.world.RaycastContext.FluidHandling.NONE:Lnet.minecraft.world.RaycastContext.FluidHandling;
        //   923: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   926: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   929: invokespecial   net.minecraft.world.RaycastContext.<init>:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.world.RaycastContext.ShapeType;Lnet.minecraft.world.RaycastContext.FluidHandling;Lnet.minecraft.entity.Entity;)V
        //   932: invokeinterface net.minecraft.world.BlockView.raycast:(Lnet.minecraft.world.RaycastContext;)Lnet.minecraft.util.hit.BlockHitResult;
        //   937: invokevirtual   net.minecraft.util.hit.BlockHitResult.getType:()Lnet.minecraft.util.hit.HitResult.Type;
        //   940: getstatic       net.minecraft.util.hit.HitResult.Type.BLOCK:Lnet.minecraft.util.hit.HitResult.Type;
        //   943: if_acmpne       1004
        //   946: goto            953
        //   949: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   952: athrow         
        //   953: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   956: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   959: dconst_0       
        //   960: dup2           
        //   961: dup2_x2        
        //   962: invokevirtual   net.minecraft.entity.Entity.setVelocity:(DDD)V
        //   965: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   968: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   971: invokevirtual   net.minecraft.entity.player.PlayerEntity.stopFallFlying:()V
        //   974: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   977: goto            984
        //   980: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   983: athrow         
        //   984: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   987: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   990: new             Lnet.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.OnGroundOnly;
        //   993: dup            
        //   994: iconst_1       
        //   995: dup            
        //   996: dup            
        //   997: pop2           
        //   998: invokespecial   net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.OnGroundOnly.<init>:(Z)V
        //  1001: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //  1004: return         
        //    StackMapTable: 00 5B FF 00 29 00 04 07 01 5C 07 00 02 04 01 00 01 07 00 37 03 4B 07 00 37 43 01 45 07 00 37 03 FF 00 10 00 04 07 00 4F 07 00 02 04 01 00 01 07 00 4F FF 00 28 00 05 07 00 4F 07 00 02 04 01 07 00 AB 00 01 07 00 37 FA 00 03 FF 00 04 00 04 07 01 5E 07 00 02 04 01 00 00 43 01 4B 07 00 37 03 50 07 00 37 43 01 45 07 00 37 03 54 07 00 37 43 01 45 07 00 37 03 4B 07 00 37 03 49 01 4A 07 00 37 03 4B 07 00 37 03 FF 00 01 00 04 07 01 5E 07 00 02 04 01 00 02 01 01 41 01 FF 00 4F 00 08 01 07 00 02 04 01 07 00 D1 07 00 D1 07 00 D8 07 00 4F 00 00 FF 00 1A 00 09 01 07 00 02 04 01 07 00 D1 07 00 D1 07 00 D8 07 00 4F 07 00 EE 00 01 01 FF 00 16 00 09 01 07 00 02 04 01 07 00 D1 07 00 D1 07 00 D8 07 00 4F 07 00 EE 00 02 01 01 4A 07 00 37 03 FF 00 09 00 09 01 07 00 02 04 01 07 00 D1 07 00 D1 07 00 D8 07 00 4F 07 00 EE 00 02 01 01 4A 07 00 37 03 FF 00 09 00 09 01 07 00 02 04 01 07 00 D1 07 00 D1 07 00 D8 07 00 4F 07 00 EE 00 02 01 01 FA 00 10 40 01 4E 07 00 37 43 07 00 02 62 07 00 37 43 07 00 02 42 07 00 37 03 FF 00 00 00 04 00 07 00 02 04 01 00 01 07 00 02 4D 07 00 37 03 53 07 00 37 03 48 01 4A 07 00 37 03 4F 07 00 37 43 01 4A 07 00 37 03 4A 07 00 37 43 07 00 4F FF 00 00 00 04 07 00 4F 07 00 02 04 01 00 00 40 07 00 4F 44 01 FF 00 1E 00 05 07 00 4F 07 00 02 04 01 07 00 59 00 01 07 00 37 43 01 45 07 00 37 03 41 07 00 59 FF 00 33 00 07 07 00 4F 07 00 02 04 01 07 00 59 07 00 61 07 00 5B 00 01 07 00 37 03 43 07 00 37 03 4B 07 00 37 43 01 44 07 00 37 03 49 07 00 02 FF 00 09 00 04 00 07 00 02 04 01 00 00 48 01 4A 07 00 37 03 4F 07 00 37 43 01 02 00 F7 00 48 07 00 37 03 5A 07 00 37 43 07 00 6D 13
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  17     38     41     45     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  35     54     57     61     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  45     64     67     71     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  107    129    129    133    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  142    151    154    158    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  148    172    175    179    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  158    182    185    189    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  179    207    210    214    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  189    217    220    224    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  214    236    236    240    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  250    258    261    265    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  255    277    277    281    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  415    423    426    430    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  440    448    451    455    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  483    495    498    502    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  502    534    537    541    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  513    544    544    548    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  549    560    563    567    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  557    587    587    591    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  600    608    611    615    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  605    628    631    635    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  635    643    646    650    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  640    658    661    665    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  687    700    703    707    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  692    710    713    717    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  760    768    771    775    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  765    779    779    783    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  783    792    795    799    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  799    804    804    808    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  837    845    848    852    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  842    865    868    872    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  876    946    949    953    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  884    977    980    984    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    private void m13097(final EventRender3D eventRender3D) {
    }
    
    @Subscribe
    private void m13098(final EventPacket$Receive p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          126498720126074
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9155:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          5
        //    16: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    19: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //    22: invokevirtual   net.minecraft.entity.LivingEntity.isFallFlying:()Z
        //    25: iload           4
        //    27: ifeq            106
        //    30: ifne            92
        //    33: goto            40
        //    36: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    39: athrow         
        //    40: aload           5
        //    42: getfield        org/rusherhack/ElytraTweaks.f6810:Lorg/rusherhack/core/setting/BooleanSetting;
        //    45: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    48: checkcast       Ljava/lang/Boolean;
        //    51: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    54: iload           4
        //    56: ifeq            106
        //    59: goto            66
        //    62: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    65: athrow         
        //    66: ifne            92
        //    69: goto            76
        //    72: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    75: athrow         
        //    76: iconst_m1      
        //    77: aload           5
        //    79: dup_x1         
        //    80: iconst_0       
        //    81: putfield        org/rusherhack/ElytraTweaks.f6807:Z
        //    84: putfield        org/rusherhack/ElytraTweaks.f6812:I
        //    87: return         
        //    88: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    91: athrow         
        //    92: aload           5
        //    94: getfield        org/rusherhack/ElytraTweaks.extendTheLifespanOfFireworkRocketsOn2b2t:Lorg/rusherhack/core/setting/BooleanSetting;
        //    97: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   100: checkcast       Ljava/lang/Boolean;
        //   103: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   106: iload           4
        //   108: ifeq            390
        //   111: ifeq            383
        //   114: goto            121
        //   117: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   120: athrow         
        //   121: aload_1        
        //   122: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //   125: iload           4
        //   127: ifeq            212
        //   130: instanceof      Lnet.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
        //   133: ifeq            208
        //   136: goto            143
        //   139: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   142: athrow         
        //   143: aload           5
        //   145: dup            
        //   146: iconst_1       
        //   147: dup            
        //   148: dup            
        //   149: pop2           
        //   150: putfield        org/rusherhack/ElytraTweaks.f6809:Z
        //   153: goto            160
        //   156: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   159: athrow         
        //   160: getfield        org/rusherhack/ElytraTweaks.f6804:Ljava/util/Queue;
        //   163: invokeinterface java/util/Collection.isEmpty:()Z
        //   168: ifne            383
        //   171: aload           5
        //   173: getfield        org/rusherhack/ElytraTweaks.f6804:Ljava/util/Queue;
        //   176: invokeinterface java/util/Queue.poll:()Ljava/lang/Object;
        //   181: checkcast       Lnet.minecraft.network.packet.Packet;
        //   184: invokestatic    org/rusherhack/PingSpoof.m9748:(Lnet.minecraft.network.packet.Packet;)V
        //   187: aload           5
        //   189: iload           4
        //   191: ifeq            420
        //   194: goto            201
        //   197: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   200: athrow         
        //   201: goto            160
        //   204: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   207: athrow         
        //   208: aload_1        
        //   209: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //   212: dup            
        //   213: astore          6
        //   215: instanceof      Lnet.minecraft.network.packet.s2c.common.CommonPingS2CPacket;
        //   218: iload           4
        //   220: ifeq            390
        //   223: ifeq            383
        //   226: goto            233
        //   229: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   232: athrow         
        //   233: aload           6
        //   235: checkcast       Lnet.minecraft.network.packet.s2c.common.CommonPingS2CPacket;
        //   238: astore_0       
        //   239: aload           5
        //   241: getfield        org/rusherhack/ElytraTweaks.f6812:I
        //   244: iload           4
        //   246: ifeq            390
        //   249: iconst_m1      
        //   250: if_icmpeq       383
        //   253: goto            260
        //   256: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   259: athrow         
        //   260: aload           5
        //   262: getfield        org/rusherhack/ElytraTweaks.f6807:Z
        //   265: iload           4
        //   267: ifeq            390
        //   270: goto            277
        //   273: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   276: athrow         
        //   277: ifeq            383
        //   280: goto            287
        //   283: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   286: athrow         
        //   287: aload           5
        //   289: dup            
        //   290: aload_1        
        //   291: iconst_1       
        //   292: dup            
        //   293: dup            
        //   294: pop2           
        //   295: invokevirtual   org/rusherhack/core/event/type/EventCancellable.setCancelled:(Z)V
        //   298: getfield        org/rusherhack/ElytraTweaks.f6804:Ljava/util/Queue;
        //   301: aload_0        
        //   302: invokeinterface java/util/Queue.add:(Ljava/lang/Object;)Z
        //   307: pop            
        //   308: getfield        org/rusherhack/ElytraTweaks.f6804:Ljava/util/Queue;
        //   311: iload           4
        //   313: ifeq            356
        //   316: goto            323
        //   319: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   322: athrow         
        //   323: invokeinterface java/util/Collection.size:()I
        //   328: iconst_3       
        //   329: if_icmple       357
        //   332: goto            339
        //   335: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   338: athrow         
        //   339: aload           5
        //   341: getfield        org/rusherhack/ElytraTweaks.f6804:Ljava/util/Queue;
        //   344: invokeinterface java/util/Queue.poll:()Ljava/lang/Object;
        //   349: goto            356
        //   352: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   355: athrow         
        //   356: pop            
        //   357: return         
        //   358: astore_0       
        //   359: aload           5
        //   361: invokevirtual   org/rusherhack/client/api/feature/module/Module.getLogger:()Lorg/rusherhack/core/logging/ILogger;
        //   364: ldc_w           "Failed to handle packet"
        //   367: iconst_1       
        //   368: dup            
        //   369: dup            
        //   370: pop2           
        //   371: anewarray       Ljava/lang/Object;
        //   374: dup            
        //   375: iconst_0       
        //   376: aload_0        
        //   377: aastore        
        //   378: invokeinterface org/rusherhack/core/logging/ILog.error:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   383: aload_1        
        //   384: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //   387: instanceof      Lnet.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
        //   390: iload           4
        //   392: ifeq            426
        //   395: ifeq            554
        //   398: goto            405
        //   401: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   404: athrow         
        //   405: aload           5
        //   407: getfield        org/rusherhack/ElytraTweaks.fixrocketdesync:Lorg/rusherhack/core/setting/BooleanSetting;
        //   410: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   413: goto            420
        //   416: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   419: athrow         
        //   420: checkcast       Ljava/lang/Boolean;
        //   423: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   426: ifeq            554
        //   429: invokestatic    org/rusherhack/client/api/utils/WorldUtils.getEntities:()Ljava/util/List;
        //   432: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   437: astore_0       
        //   438: aload_0        
        //   439: invokeinterface java/util/Iterator.hasNext:()Z
        //   444: ifeq            554
        //   447: aload_0        
        //   448: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   453: checkcast       Lnet.minecraft.entity.Entity;
        //   456: dup            
        //   457: astore          6
        //   459: iload           4
        //   461: ifeq            479
        //   464: instanceof      Lnet.minecraft.entity.projectile.FireworkRocketEntity;
        //   467: ifeq            438
        //   470: goto            477
        //   473: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   476: athrow         
        //   477: aload           6
        //   479: checkcast       Lnet.minecraft.entity.projectile.FireworkRocketEntity;
        //   482: checkcast       Lorg/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity;
        //   485: dup            
        //   486: astore_1       
        //   487: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity.getAttachedEntity:()Lnet.minecraft.entity.LivingEntity;
        //   492: iload           4
        //   494: ifeq            513
        //   497: ifnull          438
        //   500: goto            507
        //   503: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   506: athrow         
        //   507: aload_1        
        //   508: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity.getAttachedEntity:()Lnet.minecraft.entity.LivingEntity;
        //   513: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   516: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   519: iload           4
        //   521: ifeq            540
        //   524: invokevirtual   net.minecraft.entity.Entity.equals:(Ljava/lang/Object;)Z
        //   527: ifeq            438
        //   530: goto            537
        //   533: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   536: athrow         
        //   537: aload           6
        //   539: dup            
        //   540: getstatic       net.minecraft.entity.Entity.RemovalReason.DISCARDED:Lnet.minecraft.entity.Entity.RemovalReason;
        //   543: invokevirtual   net.minecraft.entity.Entity.setRemoved:(Lnet.minecraft.entity.Entity.RemovalReason;)V
        //   546: invokevirtual   net.minecraft.entity.Entity.onRemoved:()V
        //   549: iload           4
        //   551: ifne            438
        //   554: return         
        //    StackMapTable: 00 36 FF 00 24 00 05 07 00 02 07 01 95 04 01 07 00 02 00 01 07 01 64 03 55 07 01 64 43 01 45 07 01 64 03 4B 07 01 64 03 4D 01 4A 07 01 64 03 51 07 01 64 03 4C 07 01 64 43 07 00 02 64 07 01 64 43 07 00 02 42 07 01 64 03 43 07 01 08 FF 00 10 00 06 07 00 02 07 01 95 04 01 07 00 02 07 01 08 00 01 07 01 64 03 FF 00 16 00 06 07 01 73 07 01 95 04 01 07 00 02 07 01 08 00 01 07 01 64 03 4C 07 01 64 43 01 45 07 01 64 03 5F 07 01 64 43 07 01 03 4B 07 01 64 03 4C 07 01 64 43 07 01 5E 00 FF 00 00 00 05 07 01 5E 07 01 95 04 01 07 00 02 00 01 07 01 64 18 46 01 4A 07 01 64 03 4A 07 01 64 43 07 01 5E 45 01 FF 00 0B 00 05 07 00 4F 07 01 5E 04 01 07 00 02 00 00 FF 00 22 00 06 07 00 4F 07 01 5E 04 01 07 00 02 07 00 59 00 01 07 01 64 03 41 07 00 59 FF 00 17 00 06 07 00 4F 07 00 61 04 01 07 00 02 07 00 59 00 01 07 01 64 03 45 07 00 8C 53 07 01 64 03 FF 00 02 00 06 07 00 4F 07 00 61 04 01 07 00 02 07 00 59 00 02 07 00 59 07 00 59 FF 00 0D 00 05 07 01 5E 07 01 5E 04 01 07 00 02 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  171    204    204    208    Ljava/lang/Throwable;
        //  160    194    197    201    Ljava/lang/Throwable;
        //  130    153    156    160    Ljava/lang/Throwable;
        //  121    136    139    143    Ljava/lang/Throwable;
        //  106    114    117    121    Ljava/lang/Throwable;
        //  66     88     88     92     Ljava/lang/Throwable;
        //  40     69     72     76     Ljava/lang/Throwable;
        //  30     59     62     66     Ljava/lang/Throwable;
        //  16     33     36     40     Ljava/lang/Throwable;
        //  121    208    358    383    Ljava/lang/Throwable;
        //  323    349    352    356    Ljava/lang/Throwable;
        //  287    332    335    339    Ljava/lang/Throwable;
        //  277    316    319    323    Ljava/lang/Throwable;
        //  260    280    283    287    Ljava/lang/Throwable;
        //  249    270    273    277    Ljava/lang/Throwable;
        //  239    253    256    260    Ljava/lang/Throwable;
        //  215    226    229    233    Ljava/lang/Throwable;
        //  208    357    358    383    Ljava/lang/Throwable;
        //  390    398    401    405    Ljava/lang/Throwable;
        //  395    413    416    420    Ljava/lang/Throwable;
        //  459    470    473    477    Ljava/lang/Throwable;
        //  487    500    503    507    Ljava/lang/Throwable;
        //  513    530    533    537    Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    private void m13099(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          124552311840368
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          6
        //    16: iload_1        
        //    17: sipush          15388
        //    20: ldc2_w          1445380881612572340
        //    23: lload_2        
        //    24: lxor           
        //    25: invokedynamic   BootstrapMethod #0, g:(IJ)I
        //    30: iload           4
        //    32: ifne            165
        //    35: if_icmpge       163
        //    38: goto            45
        //    41: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    44: athrow         
        //    45: aload           6
        //    47: getfield        org/rusherhack/ElytraTweaks.inventory:Lorg/rusherhack/core/setting/BooleanSetting;
        //    50: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    53: checkcast       Ljava/lang/Boolean;
        //    56: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    59: iload           4
        //    61: ifne            82
        //    64: goto            71
        //    67: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    70: athrow         
        //    71: ifeq            98
        //    74: goto            81
        //    77: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    80: athrow         
        //    81: iload_1        
        //    82: iconst_m1      
        //    83: iload           4
        //    85: ifne            106
        //    88: if_icmpne       99
        //    91: goto            98
        //    94: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    97: athrow         
        //    98: return         
        //    99: getstatic       net.minecraft.item.Items.AIR:Lnet.minecraft.item.Item;
        //   102: invokestatic    org/rusherhack/client/api/utils/InventoryUtils.findItemHotbar:(Lnet.minecraft.item.Item;)I
        //   105: dup            
        //   106: istore_0       
        //   107: iconst_m1      
        //   108: iload           4
        //   110: ifne            158
        //   113: if_icmpne       137
        //   116: goto            123
        //   119: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   122: athrow         
        //   123: sipush          3638
        //   126: ldc2_w          70345919593165978
        //   129: lload_2        
        //   130: lxor           
        //   131: invokedynamic   BootstrapMethod #0, g:(IJ)I
        //   136: istore_0       
        //   137: iload_1        
        //   138: iload_0        
        //   139: invokestatic    org/rusherhack/client/api/utils/InventoryUtils.swapSlots:(II)V
        //   142: iload_0        
        //   143: sipush          7023
        //   146: ldc2_w          6559817707999896001
        //   149: lload_2        
        //   150: lxor           
        //   151: invokedynamic   BootstrapMethod #0, g:(IJ)I
        //   156: iadd           
        //   157: dup            
        //   158: istore          5
        //   160: goto            167
        //   163: iload_1        
        //   164: dup            
        //   165: istore          5
        //   167: sipush          9281
        //   170: ldc2_w          2292700068893630186
        //   173: lload_2        
        //   174: lxor           
        //   175: invokedynamic   BootstrapMethod #0, g:(IJ)I
        //   180: if_icmpge       193
        //   183: getstatic       net.minecraft.util.Hand.MAIN_HAND:Lnet.minecraft.util.Hand;
        //   186: goto            196
        //   189: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   192: athrow         
        //   193: getstatic       net.minecraft.util.Hand.OFF_HAND:Lnet.minecraft.util.Hand;
        //   196: astore_0       
        //   197: iload           4
        //   199: ifne            329
        //   202: aload_0        
        //   203: getstatic       net.minecraft.util.Hand.MAIN_HAND:Lnet.minecraft.util.Hand;
        //   206: if_acmpne       265
        //   209: goto            216
        //   212: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   215: athrow         
        //   216: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   219: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   222: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //   225: iload           5
        //   227: sipush          7023
        //   230: ldc2_w          6559817707999896001
        //   233: lload_2        
        //   234: lxor           
        //   235: invokedynamic   BootstrapMethod #0, g:(IJ)I
        //   240: isub           
        //   241: putfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //   244: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   247: getfield        net.minecraft.client.MinecraftClient.interactionManager:Lnet.minecraft.client.network.ClientPlayerInteractionManager;
        //   250: checkcast       Lorg/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode;
        //   253: invokeinterface org/rusherhack/client/api/accessors/client/IMixinMultiPlayerGameMode.invokeEnsureHasSentCarriedItem:()V
        //   258: goto            265
        //   261: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   264: athrow         
        //   265: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   268: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   271: checkcast       Lorg/rusherhack/client/api/accessors/world/IMixinClientLevel;
        //   274: invokeinterface org/rusherhack/client/api/accessors/world/IMixinClientLevel.invokeGetBlockStatePredictionHandler:()Lnet.minecraft.client.network.PendingUpdateManager;
        //   279: dup            
        //   280: invokevirtual   net.minecraft.client.network.PendingUpdateManager.incrementSequence:()Lnet.minecraft.client.network.PendingUpdateManager;
        //   283: invokevirtual   net.minecraft.client.network.PendingUpdateManager.getSequence:()I
        //   286: istore          5
        //   288: invokevirtual   net.minecraft.client.network.PendingUpdateManager.close:()V
        //   291: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   294: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   297: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   300: new             Lnet.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
        //   303: dup            
        //   304: aload_0        
        //   305: iload           5
        //   307: invokestatic    org/rusherhack/client/api/RusherHackAPI.getServerState:()Lorg/rusherhack/client/api/system/IServerState;
        //   310: invokeinterface org/rusherhack/client/api/system/IServerState.getPlayerYaw:()F
        //   315: invokestatic    org/rusherhack/client/api/RusherHackAPI.getServerState:()Lorg/rusherhack/client/api/system/IServerState;
        //   318: invokeinterface org/rusherhack/client/api/system/IServerState.getPlayerPitch:()F
        //   323: invokespecial   net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket.<init>:(Lnet.minecraft.util.Hand;IFF)V
        //   326: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //   329: iload_1        
        //   330: sipush          7023
        //   333: ldc2_w          6559817707999896001
        //   336: lload_2        
        //   337: lxor           
        //   338: invokedynamic   BootstrapMethod #0, g:(IJ)I
        //   343: iload           4
        //   345: ifne            378
        //   348: if_icmpge       381
        //   351: goto            358
        //   354: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   357: athrow         
        //   358: iload_1        
        //   359: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   362: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   365: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //   368: getfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //   371: goto            378
        //   374: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   377: athrow         
        //   378: invokestatic    org/rusherhack/client/api/utils/InventoryUtils.swapSlots:(II)V
        //   381: return         
        //    StackMapTable: 00 1F FF 00 29 00 06 07 00 02 01 04 01 00 07 00 02 00 01 07 00 37 03 55 07 00 37 43 01 45 07 00 37 03 40 01 4B 07 00 37 03 00 FF 00 06 00 06 07 00 02 01 04 01 00 07 00 02 00 02 01 01 FF 00 0C 00 06 01 01 04 01 00 07 00 02 00 01 07 00 37 03 0D FF 00 14 00 06 01 01 04 01 00 07 00 02 00 02 01 01 FF 00 04 00 06 07 00 02 01 04 01 00 07 00 02 00 00 FF 00 01 00 06 07 00 02 01 04 01 00 07 00 02 00 02 01 01 FF 00 01 00 06 00 01 04 01 01 07 00 02 00 01 01 55 07 00 37 03 42 07 01 BE FF 00 0F 00 06 07 01 BE 01 04 01 01 07 00 02 00 01 07 00 37 03 6C 07 00 37 03 3F 58 07 00 37 03 4F 07 00 37 FF 00 03 00 06 07 01 BE 01 04 01 01 07 00 02 00 02 01 01 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  16     38     41     45     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  35     64     67     71     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  45     74     77     81     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  82     91     94     98     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  107    116    119    123    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  167    189    189    193    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  197    209    212    216    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  202    258    261    265    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  329    351    354    358    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  348    371    374    378    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    private boolean m13100() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          59042416183575
        //     6: lxor           
        //     7: lstore_1       
        //     8: aload_0        
        //     9: astore          6
        //    11: invokestatic    org/rusherhack/Class253.m9154:()I
        //    14: iconst_0       
        //    15: istore          4
        //    17: istore_3       
        //    18: invokestatic    org/rusherhack/client/api/utils/WorldUtils.getEntities:()Ljava/util/List;
        //    21: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    26: astore          5
        //    28: aload           5
        //    30: invokeinterface java/util/Iterator.hasNext:()Z
        //    35: ifeq            272
        //    38: aload           5
        //    40: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    45: checkcast       Lnet.minecraft.entity.Entity;
        //    48: dup            
        //    49: astore_0       
        //    50: iload_3        
        //    51: ifne            68
        //    54: instanceof      Lnet.minecraft.entity.projectile.FireworkRocketEntity;
        //    57: ifeq            28
        //    60: goto            67
        //    63: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    66: athrow         
        //    67: aload_0        
        //    68: checkcast       Lnet.minecraft.entity.projectile.FireworkRocketEntity;
        //    71: checkcast       Lorg/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity;
        //    74: dup            
        //    75: astore_0       
        //    76: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity.getAttachedEntity:()Lnet.minecraft.entity.LivingEntity;
        //    81: iload_3        
        //    82: ifne            101
        //    85: ifnull          28
        //    88: goto            95
        //    91: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    94: athrow         
        //    95: aload_0        
        //    96: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity.getAttachedEntity:()Lnet.minecraft.entity.LivingEntity;
        //   101: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   104: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   107: invokevirtual   net.minecraft.entity.Entity.equals:(Ljava/lang/Object;)Z
        //   110: iload_3        
        //   111: ifne            141
        //   114: ifeq            28
        //   117: goto            124
        //   120: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   123: athrow         
        //   124: aload           6
        //   126: getfield        org/rusherhack/ElytraTweaks.delaymode:Lorg/rusherhack/core/setting/EnumSetting;
        //   129: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   132: checkcast       Lorg/rusherhack/Obf074;
        //   135: getstatic       org/rusherhack/Obf074.f1936:Lorg/rusherhack/Obf074;
        //   138: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   141: iload_3        
        //   142: ifne            243
        //   145: ifeq            237
        //   148: goto            155
        //   151: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   154: athrow         
        //   155: aload_0        
        //   156: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity.getLife:()I
        //   161: aload           6
        //   163: getfield        org/rusherhack/ElytraTweaks.extendTheLifespanOfFireworkRocketsOn2b2t:Lorg/rusherhack/core/setting/BooleanSetting;
        //   166: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   169: checkcast       Ljava/lang/Boolean;
        //   172: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   175: iload_3        
        //   176: ifne            216
        //   179: goto            186
        //   182: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   185: athrow         
        //   186: ifeq            219
        //   189: goto            196
        //   192: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   195: athrow         
        //   196: sipush          8441
        //   199: ldc2_w          8364899291960266039
        //   202: lload_1        
        //   203: lxor           
        //   204: invokedynamic   BootstrapMethod #0, g:(IJ)I
        //   209: goto            216
        //   212: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   215: athrow         
        //   216: goto            225
        //   219: aload_0        
        //   220: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity.getLifeTime:()I
        //   225: if_icmpge       237
        //   228: iconst_1       
        //   229: dup            
        //   230: dup            
        //   231: pop2           
        //   232: ireturn        
        //   233: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   236: athrow         
        //   237: aload_0        
        //   238: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinFireworkRocketEntity.getLife:()I
        //   243: aload           6
        //   245: getfield        org/rusherhack/ElytraTweaks.f6814:Lorg/rusherhack/core/setting/NumberSetting;
        //   248: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   251: checkcast       Ljava/lang/Integer;
        //   254: invokevirtual   java/lang/Integer.intValue:()I
        //   257: if_icmpge       28
        //   260: iconst_1       
        //   261: dup            
        //   262: dup            
        //   263: pop2           
        //   264: dup            
        //   265: istore          4
        //   267: iload_3        
        //   268: ifne            35
        //   271: ireturn        
        //   272: iload           4
        //   274: ireturn        
        //    StackMapTable: 00 19 FF 00 1C 00 06 07 01 5E 04 01 01 07 00 4F 07 00 02 00 00 46 01 FF 00 1B 00 06 07 00 59 04 01 01 07 00 4F 07 00 02 00 01 07 00 37 03 40 07 00 59 FF 00 16 00 06 07 00 61 04 01 01 07 00 4F 07 00 02 00 01 07 00 37 03 45 07 00 8C 52 07 00 37 03 50 01 49 07 00 37 03 5A 07 00 37 FF 00 03 00 06 07 00 61 04 01 01 07 00 4F 07 00 02 00 02 01 01 45 07 00 37 43 01 4F 07 00 37 FF 00 03 00 06 07 00 61 04 01 01 07 00 4F 07 00 02 00 02 01 01 42 01 FF 00 05 00 06 07 00 61 04 01 01 07 00 4F 07 00 02 00 02 01 01 47 07 00 37 03 45 01 FF 00 1C 00 06 07 01 5E 04 01 01 07 00 4F 07 00 02 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  50     60     63     67     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  76     88     91     95     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  101    117    120    124    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  141    148    151    155    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  145    179    182    186    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  155    189    192    196    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  186    209    212    216    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  225    233    233    237    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0155:
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
    
    public void onEnable() {
        final long n = ElytraTweaks.f6817 ^ 0x30CC36174A28L;
        this.f6812 = -1;
    }
    
    public ElytraTweaks() {
super("ElytraTweaks", "Elytra behaviour tweaks", ModuleCategory.MOVEMENT);
        final long n = ElytraTweaks.f6817 ^ 0xB33D11336D8L;
        this.fixrocketdesync = new BooleanSetting("FixRocketDesync", Boolean.valueOf(false));
        this.nobounce = new BooleanSetting("NoBounce", Boolean.valueOf(false));
        this.extendTheLifespanOfFireworkRocketsOn2b2t = new BooleanSetting("GrimRocket", "Extend the lifespan of firework rockets on 2b2t", Boolean.valueOf(true));
        this.f6810 = new BooleanSetting("GrimDisabler", "Bypass grim movement checks when an elytra and fireworks are in your inventory", Boolean.valueOf(false));
        this.delaymode = (EnumSetting<Obf074>)new EnumSetting("DelayMode", (Enum)Obf074.f1936);
        this.f6814 = (NumberSetting<Integer>)new NumberSetting("StaticDelay", (Number)0, (Number)0, (Number)500).setVisibility(() -> {
            final long n2 = ElytraTweaks.f6817 ^ 0x778AAC23DAAAL;
            try {
                if (((Setting)this.delaymode).getValue() == Obf074.f1934) {
                    return true;
                }
            }
            catch (final ArrayIndexOutOfBoundsException ex) {
                throw m1393(ex);
            }
            return false;
        });
        final boolean f6806 = false;
        final boolean b = false;
        final int f6807 = -1;
        final boolean f6808 = false;
        this.onground = new BooleanSetting("OnGround", Boolean.valueOf(false)).setHidden(true);
        this.inventory = new BooleanSetting("Inventory", Boolean.valueOf(true));
        this.f6811 = new Timer();
        this.f6813 = new Timer();
        this.f6816 = new HashSet<ChunkPos>();
        this.f6804 = new ArrayDeque<Packet<?>>();
        this.f6807 = f6808;
        this.f6812 = f6807;
        this.f6808 = b;
        this.f6809 = b;
        this.f6806 = f6806;
        ((Setting)this.f6810).addSubSettings(new Setting[] { (Setting)this.delaymode, (Setting)this.f6814, (Setting)this.onground, (Setting)this.inventory });
        ((Module)this).registerSettings(new Setting[] { (Setting)this.fixrocketdesync, (Setting)this.nobounce, (Setting)this.extendTheLifespanOfFireworkRocketsOn2b2t, (Setting)this.f6810 });
    }
    
    @Subscribe
    private void m13101(final Obf330 obf330) {
        
    }
    
    @Subscribe
    private void m13102(final EventEntity$Remove eventEntity$Remove) {
        
    }
    
    @Subscribe
    private void m13104(final EventPacket$Send eventPacket$Send) {
        final long n = ElytraTweaks.f6817 ^ 0x2B4513A78720L;
        final int m9155 = Class253.m9155();
        Label_0059: {
            boolean booleanValue = false;
            Label_0045: {
                boolean b;
                try {
                    b = (booleanValue = (boolean)((Setting)this.extendTheLifespanOfFireworkRocketsOn2b2t).getValue());
                    if (m9155 == 0) {
                        break Label_0059;
                    }
                    if (b) {
                        break Label_0045;
                    }
                    return;
                }
                catch (final ArrayIndexOutOfBoundsException ex) {
                    ex.printStackTrace();
                }
                try {
                    if (true) {
                        return;
                    }
                    booleanValue = (((EventPacket)eventPacket$Send).getPacket() instanceof CommonPongC2SPacket);
                }
                catch (final ArrayIndexOutOfBoundsException ex2) {
                    ex2.printStackTrace();
                }
            }
            try {
                if (booleanValue) {
                    this.f6808 = true;
                }
            }
            catch (final ArrayIndexOutOfBoundsException ex3) {
                ex3.printStackTrace();
            }
        }
    }
    
    @Subscribe
    private void m13105(final EventUpdate p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          50549588059689
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          6
        //    16: aload           6
        //    18: getfield        org/rusherhack/ElytraTweaks.f6806:Z
        //    21: iload           4
        //    23: ifne            83
        //    26: ifeq            69
        //    29: goto            36
        //    32: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    35: athrow         
        //    36: iconst_0       
        //    37: aload           6
        //    39: dup_x1         
        //    40: iconst_0       
        //    41: iconst_m1      
        //    42: aload           6
        //    44: dup_x1         
        //    45: dup_x2         
        //    46: iconst_0       
        //    47: putfield        org/rusherhack/ElytraTweaks.f6807:Z
        //    50: putfield        org/rusherhack/ElytraTweaks.f6812:I
        //    53: invokevirtual   org/rusherhack/ElytraTweaks.m13095:()V
        //    56: putfield        org/rusherhack/ElytraTweaks.f6809:Z
        //    59: putfield        org/rusherhack/ElytraTweaks.f6806:Z
        //    62: goto            69
        //    65: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    68: athrow         
        //    69: aload           6
        //    71: getfield        org/rusherhack/ElytraTweaks.f6810:Lorg/rusherhack/core/setting/BooleanSetting;
        //    74: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    77: checkcast       Ljava/lang/Boolean;
        //    80: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    83: iload           4
        //    85: ifne            116
        //    88: ifeq            290
        //    91: goto            98
        //    94: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    97: athrow         
        //    98: aload           6
        //   100: getfield        org/rusherhack/ElytraTweaks.f6813:Lorg/rusherhack/core/utils/Timer;
        //   103: ldc2_w          1000.0
        //   106: invokevirtual   org/rusherhack/core/utils/Timer.passed:(D)Z
        //   109: goto            116
        //   112: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   115: athrow         
        //   116: iload           4
        //   118: ifne            143
        //   121: ifeq            290
        //   124: goto            131
        //   127: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   130: athrow         
        //   131: aload           6
        //   133: invokevirtual   org/rusherhack/ElytraTweaks.m13100:()Z
        //   136: goto            143
        //   139: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   142: athrow         
        //   143: iload           4
        //   145: ifne            179
        //   148: ifne            290
        //   151: goto            158
        //   154: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   157: athrow         
        //   158: aload           6
        //   160: getfield        org/rusherhack/ElytraTweaks.onground:Lorg/rusherhack/core/setting/BooleanSetting;
        //   163: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   166: checkcast       Ljava/lang/Boolean;
        //   169: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   172: goto            179
        //   175: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   178: athrow         
        //   179: iload           4
        //   181: ifne            241
        //   184: ifne            225
        //   187: goto            194
        //   190: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   193: athrow         
        //   194: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   197: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   200: invokevirtual   net.minecraft.entity.Entity.isOnGround:()Z
        //   203: iload           4
        //   205: ifne            241
        //   208: goto            215
        //   211: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   214: athrow         
        //   215: ifne            290
        //   218: goto            225
        //   221: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   224: athrow         
        //   225: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   228: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   231: invokevirtual   net.minecraft.entity.Entity.isTouchingWater:()Z
        //   234: goto            241
        //   237: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   240: athrow         
        //   241: iload           4
        //   243: ifne            275
        //   246: ifne            290
        //   249: goto            256
        //   252: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   255: athrow         
        //   256: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   259: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   262: getstatic       net.minecraft.entity.effect.StatusEffects.LEVITATION:Lnet.minecraft.registry.entry.RegistryEntry;
        //   265: invokevirtual   net.minecraft.entity.LivingEntity.hasStatusEffect:(Lnet.minecraft.registry.entry.RegistryEntry;)Z
        //   268: goto            275
        //   271: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   274: athrow         
        //   275: iload           4
        //   277: ifne            302
        //   280: ifeq            291
        //   283: goto            290
        //   286: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   289: athrow         
        //   290: return         
        //   291: getstatic       net.minecraft.item.Items.FIREWORK_ROCKET:Lnet.minecraft.item.Item;
        //   294: iconst_1       
        //   295: dup            
        //   296: dup_x1         
        //   297: dup            
        //   298: pop2           
        //   299: invokestatic    org/rusherhack/client/api/utils/InventoryUtils.findItem:(Lnet.minecraft.item.Item;ZZ)I
        //   302: dup            
        //   303: istore_1       
        //   304: aload           6
        //   306: getfield        org/rusherhack/ElytraTweaks.inventory:Lorg/rusherhack/core/setting/BooleanSetting;
        //   309: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   312: checkcast       Ljava/lang/Boolean;
        //   315: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   318: iload           4
        //   320: ifne            354
        //   323: ifeq            341
        //   326: goto            333
        //   329: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   332: athrow         
        //   333: iconst_0       
        //   334: goto            357
        //   337: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   340: athrow         
        //   341: sipush          7023
        //   344: ldc2_w          6559910456177613208
        //   347: lload_2        
        //   348: lxor           
        //   349: invokedynamic   BootstrapMethod #0, g:(IJ)I
        //   354: iconst_1       
        //   355: dup            
        //   356: pop2           
        //   357: if_icmpge       361
        //   360: return         
        //   361: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   364: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   367: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //   370: getfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //   373: istore          5
        //   375: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   378: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   381: getstatic       net.minecraft.entity.EquipmentSlot.CHEST:Lnet.minecraft.entity.EquipmentSlot;
        //   384: invokevirtual   net.minecraft.entity.player.PlayerEntity.getEquippedStack:(Lnet.minecraft.entity.EquipmentSlot;)Lnet.minecraft.item.ItemStack;
        //   387: dup            
        //   388: astore_0       
        //   389: getstatic       net.minecraft.item.Items.ELYTRA:Lnet.minecraft.item.Item;
        //   392: invokevirtual   net.minecraft.item.ItemStack.isOf:(Lnet.minecraft.item.Item;)Z
        //   395: dup            
        //   396: istore          7
        //   398: iload           4
        //   400: ifne            451
        //   403: ifne            450
        //   406: goto            413
        //   409: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   412: athrow         
        //   413: aload_0        
        //   414: invokevirtual   net.minecraft.item.ItemStack.isEmpty:()Z
        //   417: iload           4
        //   419: ifne            451
        //   422: goto            429
        //   425: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   428: athrow         
        //   429: ifne            450
        //   432: goto            439
        //   435: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   438: athrow         
        //   439: iconst_1       
        //   440: dup            
        //   441: dup            
        //   442: pop2           
        //   443: goto            454
        //   446: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   449: athrow         
        //   450: iconst_0       
        //   451: iconst_1       
        //   452: dup            
        //   453: pop2           
        //   454: istore          8
        //   456: getstatic       net.minecraft.item.Items.ELYTRA:Lnet.minecraft.item.Item;
        //   459: iconst_1       
        //   460: dup            
        //   461: dup_x1         
        //   462: dup            
        //   463: pop2           
        //   464: invokestatic    org/rusherhack/client/api/utils/InventoryUtils.findItem:(Lnet.minecraft.item.Item;ZZ)I
        //   467: istore_0       
        //   468: iload           7
        //   470: iload           4
        //   472: ifne            611
        //   475: ifne            556
        //   478: goto            485
        //   481: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   484: athrow         
        //   485: iload_0        
        //   486: aload           6
        //   488: getfield        org/rusherhack/ElytraTweaks.inventory:Lorg/rusherhack/core/setting/BooleanSetting;
        //   491: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   494: checkcast       Ljava/lang/Boolean;
        //   497: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   500: iload           4
        //   502: ifne            543
        //   505: goto            512
        //   508: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   511: athrow         
        //   512: ifeq            530
        //   515: goto            522
        //   518: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   521: athrow         
        //   522: iconst_0       
        //   523: goto            546
        //   526: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   529: athrow         
        //   530: sipush          7023
        //   533: ldc2_w          6559910456177613208
        //   536: lload_2        
        //   537: lxor           
        //   538: invokedynamic   BootstrapMethod #0, g:(IJ)I
        //   543: iconst_1       
        //   544: dup            
        //   545: pop2           
        //   546: if_icmpge       550
        //   549: return         
        //   550: aload           6
        //   552: iload_0        
        //   553: invokevirtual   org/rusherhack/ElytraTweaks.m13099:(I)V
        //   556: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   559: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   562: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   565: new             Lnet.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
        //   568: dup            
        //   569: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   572: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   575: getstatic       net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode.START_FALL_FLYING:Lnet.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
        //   578: invokespecial   net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.<init>:(Lnet.minecraft.entity.Entity;Lnet.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;)V
        //   581: invokevirtual   net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket:(Lnet.minecraft.network.packet.Packet;)V
        //   584: iload           4
        //   586: ifne            641
        //   589: iload           8
        //   591: aload           6
        //   593: dup            
        //   594: iload_1        
        //   595: invokevirtual   org/rusherhack/ElytraTweaks.m13099:(I)V
        //   598: getfield        org/rusherhack/ElytraTweaks.f6813:Lorg/rusherhack/core/utils/Timer;
        //   601: invokevirtual   org/rusherhack/core/utils/Timer.reset:()V
        //   604: goto            611
        //   607: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   610: athrow         
        //   611: ifeq            627
        //   614: aload           6
        //   616: iload_0        
        //   617: invokevirtual   org/rusherhack/ElytraTweaks.m13099:(I)V
        //   620: goto            627
        //   623: invokestatic    org/rusherhack/ElytraTweaks.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   626: athrow         
        //   627: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   630: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   633: invokevirtual   net.minecraft.entity.player.PlayerEntity.getInventory:()Lnet.minecraft.entity.player.PlayerInventory;
        //   636: iload           5
        //   638: putfield        net.minecraft.entity.player.PlayerInventory.selectedSlot:I
        //   641: return         
        //    StackMapTable: 00 43 FF 00 20 00 06 07 00 02 07 02 F0 04 01 00 07 00 02 00 01 07 00 37 03 5C 07 00 37 03 4D 01 4A 07 00 37 03 4D 07 00 37 43 01 4A 07 00 37 03 47 07 00 37 43 01 4A 07 00 37 03 50 07 00 37 43 01 4A 07 00 37 03 50 07 00 37 43 01 45 07 00 37 03 4B 07 00 37 43 01 4A 07 00 37 03 4E 07 00 37 43 01 4A 07 00 37 03 00 4A 01 FF 00 1A 00 06 07 00 02 01 04 01 00 07 00 02 00 01 07 00 37 43 01 43 07 00 37 43 01 FF 00 0C 00 06 07 00 02 01 04 01 00 07 00 02 00 02 01 01 FF 00 02 00 06 07 00 02 01 04 01 00 07 00 02 00 02 01 01 03 FF 00 2F 00 07 07 02 DC 01 04 01 01 07 00 02 01 00 01 07 00 37 03 4B 07 00 37 43 01 45 07 00 37 03 46 07 00 37 03 40 01 42 01 FF 00 1A 00 08 01 01 04 01 01 07 00 02 01 01 00 01 07 00 37 03 56 07 00 37 FF 00 03 00 08 01 01 04 01 01 07 00 02 01 01 00 02 01 01 45 07 00 37 43 01 43 07 00 37 43 01 FF 00 0C 00 08 01 01 04 01 01 07 00 02 01 01 00 02 01 01 FF 00 02 00 08 01 01 04 01 01 07 00 02 01 01 00 02 01 01 03 05 72 07 00 37 43 01 4B 07 00 37 03 0D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  16     29     32     36     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  26     62     65     69     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  83     91     94     98     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  88     109    112    116    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  116    124    127    131    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  121    136    139    143    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  143    151    154    158    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  148    172    175    179    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  179    187    190    194    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  184    208    211    215    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  194    218    221    225    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  215    234    237    241    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  241    249    252    256    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  246    268    271    275    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  275    283    286    290    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  304    326    329    333    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  323    337    337    341    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  398    406    409    413    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  403    422    425    429    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  413    432    435    439    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  429    446    446    450    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  468    478    481    485    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  475    505    508    512    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  485    515    518    522    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  512    526    526    530    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  556    604    607    611    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  611    620    623    627    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0194:
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
        final long n = ElytraTweaks.f6817 ^ 0x3E29843DE495L;
        this.f6812 = -1;
        this.m13095();
        this.f6804.clear();
    }
    
    static {
        try {
        f6817 = Class066.m4320(7334835216188924534L, -4328112834572755403L, (Object)MethodHandles.lookup().lookupClass()).m4325(278132182942764L);
        f6824 = new Object[197];
        f6825 = new String[197];
        m179();
        f6820 = new HashMap(13);
        final long n = ElytraTweaks.f6817 ^ 0x7267EC689351L;
        final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        final int opmode = 2;
        final SecretKeyFactory instance2 = SecretKeyFactory.getInstance("DES");
        final byte[] key = new byte[8];
        key[0] = (byte)(n >>> 56);
        for (int i = 1; i < 8; ++i) {
            key[i] = (byte)(n << i * 8 >>> 56);
        }
        instance.init(opmode, instance2.generateSecret(new DESKeySpec(key)), new IvParameterSpec(new byte[8]));
        final String[] f6826 = new String[13];
        int n2 = 0;
        String s;
        int n3 = (s = """
                      \u009bG\u00ef¥\u00f7!\u0095\u00e7ªnª±«\u00fd\u001d°\u0019\u00cb"\u00d5\u00c0Qn\u00c9´$7\u008f\u0013L.\u00echX\u00ce3\u00f2\u00e4\b\u0080\u00cf\u00116s\u0096\u00139Z\u0018º\u00d1\u00db\u0090\u009b¥\u009b)l8\u0003\u0098£Ce$1\u008b\u00d0|V\u009c\u0093\u00e0 \u00f8¶\u009fv¿\u008d±\u00caA\u001d)\u00f2¤A\u00f5\u0083\u0094ra¯5_\u008394\u009e\u009b\u0001\u008fU\u0080/\u0018'ª\\u0091½Y\u00e6"n\u0011\u00df¥©\u00ffc\u001e	~\u00ef¦`Fr#P»(\u0095O\u008d6\u001d\u0007\u00df\u001b\u00e0³\u00f9y\u00d9\u00f8\u00879w\u00ce\u00ce\u00fe\u00d5as\u00d2\u001fX\u0085>\u00e1 \u000e\u00deN4°\u009b$\u008b\u0010¾D\u00cf&Z\u00c97i\u00c3\u0082_ij¯-z\u00c4¯\u00eb2\u00e9?¿\u000f&\u0019d\u008aNª`\u0087:\u00cc"5\u0004\u00fdkHoW~\u00dcC\ra«\u0019\u00d3/	c\u00d7m\u00fds§bs]\r¼YR\u00fd)\u00fc¬,zR\u008ed\u0007\u0007\u0007\u00f6A¨\u00d9\u0019-e¦^\u0082\u000f>P\u00f1\u00dc\u001e\u00cc$\u00ca«\u00f3¾\u00fa\u0090µ\u001e\u00f9\u001a\u00e7\u0013\u000f(#Yy \u00eb\u0083\u0001\u0086¤\u00ea\u00f1¹lN\u009a\u0016v\u00f8\u00ea\u00d0t£\u00e73
                      \u00d9\u00e5n\u0081r\u0014\u0089\u0014[±\u008c \u00d2\u0001}|lK\u00f7V¢ºS?\u009e1\u00de\u00c2\u00e16\u00ea\u00e1t\u00f0\u000e\u00c9^}§¨®\u00adYR ²as·k*\u00cd:\u0084{\u00d2\u0092\u0099O\u00f2¬\u00f9-^\u0082c\u00cbC\u0091V"[\u00ec\u00dd\u0017\u00c2³xc\u00e9'\u00e9\u008c\u0006©Q\u00dcFl\u00e4»]Q[\u00c6b1~6\u000bel\u00e2S~\u00d8c\u00c2¹£ªx\u000fp\u00f3\u0007\u00fdu®yd\u00c1\u0019\u0091z¦rSc\u0011\u009b(¤\u00d6\u009er
                      \u0095	6T\u00cf\u00d1\u0086!b\u00c0\u00d9\u00f7\u00eb\u00f0o\u00ee\u0083F\u0081\u00c5\u0084\u008bt\u00fb
\u0015\u00ef\u00d1\u00e9\u00db«\u00fa5\u00cb7\u0015\u00f8\u00ca\u00dc_\u00ca¨\u0094O\u00c4)\u001b\u0093\u00ecp\u00c1\u00f3]½²\u0085EB\u00e0\u00c1\u0098 \u00c4L:i\u007f&§\u00fb&\u0015¨\u0095'\u00e6\u00eb[¯>¿®\u009aµhz¨¶µ'´\u00d0l\u00d3""").length();
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
                            f6826[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                continue Label_0184;
                            }
                            n3 = (s = "·\u0095sU¯B\u00e60\u008cf\u0006\u00ec\u00d0#*H\u00d7M¡«\f<0\u0088t¹\u00f1\r°\u00e0G\u008e \u00c0\u00f4{\u0007t\u00d9\u00e0\u0004Y\u00de\u0094\u00db\u00faJ\u00e6[2\u0017g\u001du\u0002\u00c3\u00fc8\u009d\u0014´e±n\u00ad").length();
                            n4 = 32;
                            n5 = -1;
                            break;
                        }
                        case 0: {
                            f6826[n2++] = intern;
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
        f6818 = f6826;
        f6819 = new String[13];
        f6823 = new HashMap(13);
        final Cipher instance3 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode2 = 2;
        final SecretKeyFactory instance4 = SecretKeyFactory.getInstance("DES");
        final byte[] key2 = new byte[8];
        key2[0] = (byte)(n >>> 56);
        for (int j = 1; j < 8; ++j) {
            key2[j] = (byte)(n << j * 8 >>> 56);
        }
        instance3.init(opmode2, instance4.generateSecret(new DESKeySpec(key2)), new IvParameterSpec(new byte[8]));
        final long[] f6827 = new long[8];
        int n7 = 0;
        String s5;
        int n8 = (s5 = "\u00e8\u00e0\u008f\u0016«\u00d2.)¢y\u0014\u00ff3Fh\u0080\u00d7B\u000b2\u00ea\u00d4A7\u000b?Z\"2¾{\u0087\u0097\u000f\u00c8\u00c1S\u00ed%ej\f\u0000]\u0082\u001b\u00fe\u008d").length();
        int n9 = 0;
    Label_0484:
        while (true) {
            while (true) {
                final String s6 = s5;
                final int beginIndex3 = n9;
                n9 += 8;
                final byte[] bytes = s6.substring(beginIndex3, n9).getBytes("ISO-8859-1");
                long[] array2;
                long[] array = array2 = f6827;
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
                                n8 = (s5 = "\u00fe\u0093\u0006ªJ\u00ecw\u00de\u00fe \u0014)p\u00d1>\u009b").length();
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
                    array = (array2 = f6827);
                    n10 = (n11 = n7);
                    ++n7;
                    n12 = (((long)bytes2[0] & 0xFFL) << 56 | ((long)bytes2[1] & 0xFFL) << 48 | ((long)bytes2[2] & 0xFFL) << 40 | ((long)bytes2[3] & 0xFFL) << 32 | ((long)bytes2[4] & 0xFFL) << 24 | ((long)bytes2[5] & 0xFFL) << 16 | ((long)bytes2[6] & 0xFFL) << 8 | ((long)bytes2[7] & 0xFFL));
                    n13 = 0;
                }
            }
        }
        f6821 = f6827;
        f6822 = new Integer[8];
    
        } catch (Exception exception) {
            throw new ExceptionInInitializerError(exception);
        }
    }
    
    private static Class m180(final long n, final long n2) {
        final int m178 = m178(n, n2);
        final Object o = ElytraTweaks.f6824[m178];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(ElytraTweaks.f6825[m178]);
                ElytraTweaks.f6824[m178] = forName;
            }
            else {
                forName = (Class)o;
            }
        }
        catch (final Exception ex) {
            throw new IllegalStateException(ex.toString());
        }
        return forName;
    }
    
    private static Field m181(final Class clazz, final String anObject, final Class clazz2) {
        for (final Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    private static Field m182(final Class clazz, final String s, final Class clazz2) {
        final Field m181 = m181(clazz, s, clazz2);
        if (m181 != null) {
            return m181;
        }
        final Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                final Field m182 = m182(interfaces[i], s, clazz2);
                if (m182 != null) {
                    return m182;
                }
            }
        }
        return null;
    }
    
    private static Field m183(final long n, final long n2) {
        final int m178 = m178(n, n2);
        final Object o = ElytraTweaks.f6824[m178];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        final String s = ElytraTweaks.f6825[m178];
        int index = s.indexOf(8);
        final Class m179 = m180(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        final String substring = s.substring(index, index2);
        ++index2;
        final Class m180 = m180(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m179;
        while (true) {
            final Field m181 = m181(clazz, substring, m180);
            if (m181 != null) {
                return (Field)(ElytraTweaks.f6824[m178] = m181);
            }
            final Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    final Field m182 = m182(interfaces[i], substring, m180);
                    if (m182 != null) {
                        return (Field)(ElytraTweaks.f6824[m178] = m182);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                final StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m179.getName()).append(' ').append(m180.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m180(72421224839730L, 0L);
        }
    }
    
    private static Method m184(final Class clazz, final String anObject, final Class clazz2, final int n, final Class[] array) {
        for (final Method method : clazz.getDeclaredMethods()) {
            Label_0097: {
                if (method.getName().equals(anObject) && method.getReturnType() == clazz2) {
                    final Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == n) {
                        for (int j = 0; j < n; ++j) {
                            if (parameterTypes[j] != array[j]) {
                                break Label_0097;
                            }
                        }
                        return method;
                    }
                }
            }
        }
        return null;
    }
    
    private static Method m185(final Class clazz, final String s, final Class clazz2, final int n, final Class[] array) {
        final Method m184 = m184(clazz, s, clazz2, n, array);
        if (m184 != null) {
            return m184;
        }
        final Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                final Method m185 = m185(interfaces[i], s, clazz2, n, array);
                if (m185 != null) {
                    return m185;
                }
            }
        }
        return null;
    }
    
    private static Method m186(final long n, final long n2) {
        final int m178 = m178(n, n2);
        final Object o = ElytraTweaks.f6824[m178];
        if (o instanceof String) {
            final String s = ElytraTweaks.f6825[m178];
            int index = s.indexOf(8);
            final Class m179 = m180(Long.parseLong(s.substring(0, index), 36), 0L);
            ++index;
            final int index2 = s.indexOf(8, index);
            final String substring = s.substring(index, index2);
            int n3 = -1;
            int index3 = index2;
            do {
                ++n3;
            } while ((index3 = s.indexOf(8, ++index3)) > -1);
            final int n4;
            final Class[] array = new Class[n4 = n3 - 1];
            Class m180 = null;
            int n5 = index2 + 1;
            for (int i = 0; i < n3; ++i) {
                final int index4 = s.indexOf(8, n5);
                m180 = m180(Long.parseLong(s.substring(n5, index4), 36), 0L);
                if (i < n4) {
                    array[i] = m180;
                }
                n5 = index4 + 1;
            }
            Class superclass = m179;
            while (true) {
                do {
                    final Method m181 = m184(superclass, substring, m180, n4, array);
                    if (m181 != null) {
                        return (Method)(ElytraTweaks.f6824[m178] = m181);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m179;
                    while (true) {
                        final Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                final Method m182 = m185(interfaces[j], substring, m180, n4, array);
                                if (m182 != null) {
                                    return (Method)(ElytraTweaks.f6824[m178] = m182);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            final StringBuffer sb = new StringBuffer();
                            sb.append("NoSuchMethodException in ").append(m179.getName()).append(' ').append(m180.getName()).append(' ').append(substring).append('(');
                            int k = 0;
                            while (k < n4) {
                                sb.append(array[k].getName());
                                if (++k < n4) {
                                    sb.append(", ");
                                }
                            }
                            sb.append(')');
                            throw new IllegalStateException(sb.toString());
                        }
                        if ((clazz = clazz.getSuperclass()) != null) {
                            continue;
                        }
                        clazz = m180(72421224839730L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m180(72421224839730L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    private static MethodHandle m187(final MethodHandles.Lookup lookup, final MutableCallSite mutableCallSite, final String s, final MethodType methodType, final long n, final long n2) {
        final char char1 = s.charAt(0);
        Field m183 = null;
        Method m184 = null;
        try {
            MethodHandle target;
            if (char1 == '\u00e5' || char1 == 'T' || char1 == 'o' || char1 == 'F') {
                m183 = m183(n, n2);
                final Class<?> declaringClass = m183.getDeclaringClass();
                final String name = m183.getName();
                final Class<?> type = m183.getType();
                if (char1 == '\u00e5') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == 'T') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == 'o') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m184 = m186(n, n2);
                final Class<?> declaringClass2 = m184.getDeclaringClass();
                final String name2 = m184.getName();
                final MethodType methodType2 = MethodType.methodType(m184.getReturnType(), m184.getParameterTypes());
                if (char1 == '¥') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == '£') {
                    target = lookup.findStatic(declaringClass2, name2, methodType2);
                }
                else {
                    target = lookup.findSpecial(declaringClass2, name2, methodType2, declaringClass2);
                }
            }
            return MethodHandles.dropArguments(target, methodType.parameterCount() - 2, (Class<?>[])new Class[] { Long.TYPE, Long.TYPE });
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append(ex.getClass().getName()).append(" : ").append((m183 != null) ? m183.toString() : ((m184 != null) ? m184.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    private static Object m188(final MethodHandles.Lookup lookup, final MutableCallSite mutableCallSite, final String s, final MethodType newType, final Object[] array) {
        int n = array.length - 2;
        final MethodHandle m187 = m187(lookup, mutableCallSite, s, newType, (long)array[n], (long)array[++n]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m187, newType));
        try {
           return m187.asSpreader(Object[].class, array.length).invoke(array);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    
    private static CallSite m265(final MethodHandles.Lookup p0, final String p1, final MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/ElytraTweaks.m265:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:67)
        //     at com.strobel.assembler.metadata.MethodDefinition.tryLoadBody(MethodDefinition.java:729)
        //     at com.strobel.assembler.metadata.MethodDefinition.getBody(MethodDefinition.java:83)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:194)
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
        // Caused by: java.lang.ClassCastException: class com.strobel.assembler.ir.ConstantPool.MethodHandleEntry cannot be cast to class com.strobel.assembler.ir.ConstantPool.ConstantEntry (com.strobel.assembler.ir.ConstantPool.MethodHandleEntry and com.strobel.assembler.ir.ConstantPool.ConstantEntry are in unnamed module of loader 'app')
        //     at com.strobel.assembler.ir.ConstantPool.lookupConstant(ConstantPool.java:120)
        //     at com.strobel.assembler.metadata.ClassFileReader.Scope.lookupConstant(ClassFileReader.java:1590)
        //     at com.strobel.assembler.metadata.MethodReader.readBodyCore(MethodReader.java:299)
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:63)
        //     ... 15 more
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static class ProcyonInvokeDynamicHelper_1
    {
        private static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_1.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_1.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_1.LOOKUP;
                try {
                    handle = ((CallSite)ElytraTweaks.m177(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_1.fence = 1;
                ProcyonInvokeDynamicHelper_1.handle = handle;
                ProcyonInvokeDynamicHelper_1.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static class ProcyonInvokeDynamicHelper_2
    {
        private static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_2.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_2.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_2.LOOKUP;
                try {
                    handle = ((CallSite)ElytraTweaks.m177(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_2.fence = 1;
                ProcyonInvokeDynamicHelper_2.handle = handle;
                ProcyonInvokeDynamicHelper_2.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_2.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static class ProcyonInvokeDynamicHelper_3
    {
        private static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_3.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_3.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_3.LOOKUP;
                try {
                    handle = ((CallSite)ElytraTweaks.m177(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_3.fence = 1;
                ProcyonInvokeDynamicHelper_3.handle = handle;
                ProcyonInvokeDynamicHelper_3.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }

   private static IllegalStateException m1393(Throwable t) { return new IllegalStateException(t); }
   private static int m178(long a, long b) { return 0; }
   private static java.lang.invoke.CallSite m177(java.lang.invoke.MethodHandles.Lookup l, String s, java.lang.invoke.MethodType t) { return null; }


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
        final Object[] f6824 = ElytraTweaks.f6824;
        f6824[0] = "UH8^c\u0003K@\"\u0011\u0004\u0002Z[/K\"\u0004";
        f6824[1] = "oI#.\u0010\u0010dF2aq\u001eoM6;";
        f6824[2] = "\u0012\u00017pKG\u0012\u0001 ,GH\bJ 2G]\u000f;um\u001e";
        f6824[3] = Integer.TYPE;
        ElytraTweaks.f6825[3] = "java/lang/Integer";
        f6824[4] = "5c_\u0011\u000b65cHM\u00079/(HS\u0007,(Y\u001a\r_h\u007feG^\u0015,\u00043\u001e\r_";
        f6824[5] = Void.TYPE;
        ElytraTweaks.f6825[5] = "java/lang/Void";
        f6824[6] = "1/1&y\t-53zc\u001d=6x\u020e";
        f6824[7] = "/Dn\u0007p73^l[j##]'Jn+%X}\u0007c2)\u0018hJa'3Ef[ql%X}@v;n\u007fD@z+.p`[g5/Db{m!+S}ll6)Bp";
        f6824[8] = "w)rN?zw)e\u00123umbe\f3`j\u00137Sb*";
        f6824[9] = "rLn\u001et\u001cnVlBn\b~U'\u03d1";
        f6824[10] = Boolean.TYPE;
        ElytraTweaks.f6825[10] = "java/lang/Boolean";
        f6824[11] = "JH2WP\u001dT@(\u00182\u0001S]";
        f6824[12] = "\u007fj\u0015eZ\\cp\u00179@Hss\\(D@uv\u0006eIYy65'GKqt\u0001";
        f6824[13] = "NHT@8\u0012NHC\u001c4\u001dT\u0003C\u00024\bSr\u0013_e";
        f6824[14] = "\u0002\u000e6?BN\u0002\u000e!cNA\u0018E!}NT\u001f4s#\u0016\u0010";
        f6824[15] = "*f\u0000\u0017]P!i\u0011X'T2h\u0001\u0017\u0011P%";
        f6824[16] = "\u001f*\u001bH8]\u001f*\f\u00144R\u0005a\f\n4G\u0002\u0010XRc";
        f6824[17] = "\u0003\n\u0000#VH\u001f\u0010\u0002\u007fL\\\u000f\u0013InHT\t\u0016\u0013#EM\u0005V\u0012yMQ\u001fV0bVQ\b-\u0013dHN";
        f6824[18] = "\b\u001a/vs\u007f\u0014\u0000-*ik\u0004\u0003f;mc\u0002\u0006<v`z\u000eF-.dd\u0013\u001bf6d~\u0010\u0007:3/O\u0011\r&,Qk\u0004\u0003-,";
        f6824[19] = "D:>\u0006\"\tD:)Z.\u0006^q)D.\u0013Y\u0000x\u001dvV";
        f6824[20] = "q`'\u0005 jmz%Y:~}ynH=m{<3N&kw|'\u0005\u0010pq~%J<L{f4B<x";
        f6824[21] = "O_4jxBDP%%\u0014AJR'j8";
        f6824[22] = "6\u0019X)CY*\u0003ZuYM:\u0000\u0011d^^<ELbEX0\u0005X)bI-\u001fViV";
        f6824[23] = "6y/n,|*c-26h:`f#1{<%;%*}0e/n\u001bg,f\u001b%*}0e/";
        f6824[24] = "&$M-S.:>OqI:*=\u0004`N),xYfU/ 8M-o.$4Oqr>=\"CmF";
        f6824[25] = "af ?fR}|\"c|Fm\u007fi`";
        f6824[26] = "F[\u0002.\"vMT\u0013aEtX_\u0013*~";
        f6824[27] = "\u0011\u001czP\u0000/\r\u0006x\f\u001a;\u001d\u00053\u001d\u001d(\u001b@h\n\u001b6\r@I\u0017\u001f?\f";
        f6824[28] = Double.TYPE;
        ElytraTweaks.f6825[28] = "java/lang/Double";
        f6824[29] = "\fl\u007f\fB/\u0010v}PX;\u0000u6A_(\u00060}TU4\u00170l[@?M[nG^. \u007fvAU6\u000f\u007fzNU";
        f6824[30] = "FTR[=\u0004X\\H\u0014[\u0010_]w_g";
        f6824[31] = "q[dwr@q[s+~Ok\u0010s5~Zla!`-\u001a";
        f6824[32] = "=a_\u001dZ\u0019=aHAV\u0016'*H_V\u0003 [\u0018\n\u0002I";
        f6824[33] = "UxX\u0002^dUxO^RkO3O@R~HB\u001f\u0015\u00058";
        f6824[34] = "\u0000=\tyd\u0019\u0000=\u001e%h\u0016\u001av\u001e;h\u0003\u001d\u0007Od0T\r4\u001c$z/\\lM";
        f6824[35] = "sZ<~Q_sZ+\"]Pi\u0011+<]En`zd\u000f";
        f6824[36] = "t$ks\u007f5t$|/s:no|1s/i\u001e-n!d";
        f6824[37] = "\u0005pj& D\u001bxpi_D\ndy";
        f6824[38] = ")ZZ\u000et|)ZMRxs3\u0011MLxf4`\u001d\u0019,,c\\BAjf\u0018\f\u0017\u0016)";
        f6824[39] = "Lg2=\u0004uLg%a\bzV,%\u007f\boQ]w%^-";
        f6824[40] = "Da^d\u0000lDaI8\fc^*I&\fvY[\u0018r\\=";
        f6824[41] = "0/G!74,5E}- <6\u000e\u0237";
        f6824[42] = "BC\u0015\u0000%qBC\u0002\\)~X\b\u0002B)k_yW\u001d|";
        f6824[43] = "Lo.\u001e\u001c\u0002Lo9B\u0010\rV$9\\\u0010\u0018QUi\tDR\u0006i6Q\u0002\u0018}8n\u0002";
        f6824[44] = "4s\u0018\u00156N4s\u000fI:A.8\u000fW:T)I]\rm\u0016";
        f6824[45] = "x#PEH\u0012d9R\u0019R\u0006t:\u0019\bV\u000er?CE[\u0017~\u007fD\u0012I\u0013r<\u0019\"i\u0002e'R\u0019i\u0013v%R";
        f6824[46] = Float.TYPE;
        ElytraTweaks.f6825[46] = "java/lang/Float";
        f6824[47] = "\u007fh@2kgcrBnqssq\t\u007fu{utS2xby4uijzuho}zyQJn";
        f6824[48] = "syU!f.syB}j!i2Bcj4nC\u0010==\u007f";
        f6824[49] = """
                    \u0000qH
                    Jn\u001ckJVPz\fh\u0001GTr
                    m[
                    Yk\u0006-ZPQw\u001c-fJN~\u0001w@VAN\u001bjCW""";
        f6824[50] = "j>;>RUj>,b^Zpu,|^Ow\u0004~'\u0006\u000e";
        f6824[51] = "\u0014=gt\u0014d\u0014=p(\u0018k\u000evp6\u0018~\t\u0007%iO";
        f6824[52] = "I\u0019\u001e;\u000b}I\u0019\tg\u0007rSR\ty\u0007gT#]'V&";
        f6824[53] = "1x\u007fm\u00132-b}1\t&=a6 \r.;dlm\u000077$y \u0002\"-yw1\u0012i)ej/\u0005i\u0017Gq;\b)\u001dfq&\u000f3\u0012on&\r";
        f6824[54] = "afyw>7}|{+$#m\u007f0: +kzjw-2g:\u007f:/'}gq+?lmxw<\"6 ]S04+`Yk58+^x\u007f )0Ius<\u0001-jq";
        f6824[55] = "S\u0010D7(\u0013S\u0010Sk$\u001cI[Su$\tN*\u0001!uH";
        f6824[56] = "\u001dA\u0005-*W\u0001[\u0007q0C\u0011XL`4K\u0017]\u0016-9R\u001b\u001d\u0007u=L\u0006@Lt7P\u001eWLF.G\u001cG'm,K\u0006J";
        f6824[57] = "\u001f[P\u007fB\u0010\u0003AR#X\u0004\u0013B\u0019\u0535";
        f6824[58] = "6<eum\u0014=3t:\u0010\f.4}s";
        f6824[59] = "\u0010\u000b\u0015M<\u001e\f\u0011\u0017\u0011&\n\u001c\u0012\\\u0000!\u0019\u001aW\u001e\f)\f\u0016\u0017\u0015M\u0007'\u0010\u001e";
        f6824[60] = "{g,g?Y\u000eG'h.\u0016oI,c*L\u001b";
        f6824[61] = "sMi\u001bHhoWkGR|\u007fT VVtyQz\u001b[mu\u0011hP[iiMk\u001bWrxJbP\u0014Ps[{Y_";
        f6824[62] = "4\u0004i\u0001?e(\u001ek]%q8\u001d L\"b>Xb@*w2\u0018i\u0001\u0004\\4\u0011iJ?";
        f6824[63] = "ti\u00198\u000f4]P\u0005\"\rhGD\u0015!Fy@W\u0013d\u001b\u007f[Q\u001f$\u000f4|@\u0002>\u0001tH\u001e";
        f6824[64] = "%TS\u0000X\u000b9NQ\\B\u001f)M\u001aMF\u0017/H@\u0000K\u000e#\bRKK\n?TQ\u0000G\u0011.SXK\u00043%BABO=+RQIE\f3";
        f6824[65] = "x\u000e'W\u007fed\u0014%\u000beqt\u0017n\u001aayr\u00124Wl`~R5\u0010#U{\u0019-\u001ccdU\u001d3\u001c";
        f6824[66] = "W`> TfIh$o\u001cfSb<(\u0015}\u0013C'.\u0016v\\o\u001b4\ncQh-3";
        f6824[67] = "#ss9v\u0017\nJo#tK\u0010^\u007f ?Z\u0017Myeb\\\fKu%v\u0017+Zh?xW\u001f\u0004";
        f6824[68] = "\u001fv^7jc\u001fvIkfl\u0005=Iufy\u0002L\u0018!32UpFxty.!\u0012->";
        f6824[69] = "\b>)\u000eHe\b>>RDj\u0012u>LD\u007f\u0015\u0004k\u0018\u001d<";
        f6824[70] = "7+X$Q\\7+Ox]S-`Of]F*\u0011\u001d9\f\u0001";
        f6824[71] = "m>\u001awogm>\r+chwu\r5c}p\u0004_n;7";
        f6824[72] = "-#\u00164V\u001b-#\u0001hZ\u00147h\u0001vZ\u00010\u0019S(\u0002F";
        f6824[73] = "$q\u00188H\\xuA\"*V,$##M\u0002=.N\"\u0012^@w\u001f'FE?4L\"\u0011?";
        f6824[74] = "U\u0012h\u000e}#S\u0003c\u0005\u001c\u0549k\u0000b_a#Q\u001dsUu";
        f6824[75] = "hmKw\u001a\u0016~n\u0004q#\u001ezhadY\u000fznauJ\rz\u0014DrS\u0015weTy\u001eI\u0017";
        f6824[76] = "A\u0011e\\\u0016\u001eG\u0000nWw\u0204\u007f\u0003o\r\n\u001eE\u001e~\u0007\u001e";
        f6824[77] = "f\"QJ3_a8\u0011\u0016LUa5K\u001d\u001b\u0002;c\u0015q*A~cP\u0015-[>?";
        f6824[78] = " Vo:It!Q$:x#0\u000b8\u001d\u0004 4-3 \u0012$+m%:\u0014=jU6>\u001b}QW6-\u0014'7\u0012$,\u0014M";
        f6824[79] = "\u0005\u0006fv\u0016-\f\u0011ip{ \u0003\u0010b!,wY@>M\u0018u^\u0018=q\u0004+\bG";
        f6824[80] = "3XUc`\u0017tIFj\t\u0007/IR(\tPs\\\u000b+uWvAER";
        f6824[81] = ">\u0012\u001e\u0011~6>\u0010\u0004\u0001\u001e?nB\u0003\u0017Ih1\u001fX{'=}R]\u0003\u007fnrN";
        f6824[82] = "\u0015%\u000b6su\u00134\u0000=\u0012\u0521+8Wa+uZd\u0016{/";
        f6824[83] = "\ta9MZF\u0012%zS6D\u000e'\u001aHRX\u0005[~CGI\u0002=;QFIh";
        f6824[84] = "@IT2IKBKZ 9\u001fX\\\u0000,nH\u0006\fYp9\bA\u0001\u00160\u0003\nC\u000f\u0004";
        f6824[85] = """
                    \u001a1\u0014,&^\u001cr\u0002bI
                    Jq"s'\b{l\u0003\u007fI_E|
                    x/\u001aW}
                    \u0012""";
        f6824[86] = "\u0001]\u0005\roP\u0017\u0007GCW\b\u0006\u0010[T;:QW\u0005\fomWTC\u0003.\u0011PQ^MW";
        f6824[87] = "=(FF\u0018}+r\u0004\b %:e\u0018\u001fL\u0017m%HB\u0010@h%\u0004\u0014Z?+v\u0001C ";
        f6824[88] = "\\\"\u0006q/\tZ3\rzN\u01fdba_9~\b\u001efZ$0q";
        f6824[89] = "7V7\u001d\u000fFo\u0014,\u0002\u000f9K!\u0013-6tH:MYCCs\u001a2\u0001\u0001Xl\u001a";
        f6824[90] = "]0-\u00065w\u001a9?F>I\u00011<\u0019?%3cqG`I[`<\u0015\"6\u001839BX";
        f6824[91] = "9A}\u0006b}#Vr\u0015\u0002|?ZU\u0002ip?Z\r\u0007h,4DvZxs0&";
        f6824[92] = "%K}<OO#Zv7.\u04a2\u001b\u000b pBMdHsu\u0015";
        f6824[93] = "+\u000f5b\u0015\u00146AsjdJ<Boa\bxl\u000056d\u00153Ocl\u0002P!Nc\u0006";
        f6824[94] = "D&Z#S0\u00145\u0003=\"9\u001f_Qc[6\u00148QaA&";
        f6824[95] = "\u0006@^,\u0016x\u0010\u001a\u001cb. \u0001\r\u0000uB\u0012UA_#\u001eE\u000b\n\u0000)C&\u0002\u001d\u000f/.";
        f6824[96] = "YPVGG^\u001eYD\u0007L`\u0005QGXM\f7\u0007\u0002\u0005\u0015\\`M]TZ[X^Y[\u001a`_\u0000GTP\u001f\u001cSB\u0003*";
        f6824[97] = "r\u0012?A\u0018[5\u0003,HqAq#4\b\rQ\nQm\f\u001dZu\u0012>\tJ ";
        f6824[98] = "#zT1\b=p)\u000fqcd'>\bn\u000fVq{W5^\u0001q\u007f\r3\u0000aw8\u001anc=r:Xp\u001f:w'\u0016\t";
        f6824[99] = "#s%OV\u00010ru!DX1\u0005qQX1u\u007f`M^N6,e\u001a$";
        f6824[100] = "p%Gt:L0{G+1(&vP\flG&vVH2\u0017)$F6wI7t\u0010H";
        f6824[101] = "JTMa5\rYU\u001d\u000f!PS\u0018tw \u0000^\u0002\u0019v\u007f\\#";
        f6824[102] = "79\b!]:k{\\6QS`b\u0000(R\u0004>=V}>\"ho\u001dw\u00061l`]";
        f6824[103] = "\u00075\u001e\rfg\u0001$\u0015\u0006\u0007\u00ff9uCAkeF6\u0010D<";
        f6824[104] = "\u0014UZq\u00004\u001c\b\u001bo\u0005\u0005\u04f4iY\"\tzR\r\r%\t\u007fHiY\"\tzR\r\r%\t\u007fHi";
        f6824[105] = "@]B\u000bD\u000e\u001e\n\u0012H|\u0268|\bM@\u0010[\u001aM_A\u00101";
        f6824[106] = """
                     \u000f\rY5O
                     \\YE&FhX\u0006U3F?\u000f]	g\u0010h\u000f\rY5O
                     \\YE&F""";
        f6824[107] = "\u0003\u0012\u0012\u00053*_S\b\u0001K!\fT\u0018@KgYWEE7`\\J\u000b<";
        f6824[108] = "B\u00001\\;3TZs\u0012\u0003kEMo\u0005oY\u0015\u000e>S\u00031\u0014Mc\u0018|rGH4b";
        f6824[109] = "$\u001e\u007f\u001b~|2D=UF$#S!B*\u0016t\u0013|\u001c{A6K3E|p3I3]F";
        f6824[110] = """
                     b\u0018]l\u0017<c\u001f\u0016l&krE
                     KZhv#\u0017lJu(\u001b\u0004hE5\u0013\u001cZvJ\u007fl_	s\u001d\u0005,\u001f\u001af\\zoL\u001f1&?qR
                     `@zcS
                     
                     """;
        f6824[111] = "\t\f\u0001u\u0005QU\bXogS\u0011X@\u007f\u001bU\u00175S&^\\\u001f\u0005@'\u000e2";
        f6824[112] = "`g$c3hfv/hR\u0106^u.2/hdh?8;";
        f6824[113] = "\rXf\"q\r\u0016\u001c%<\u001d\u0010\u0005\u0006f#Z\u0000lXy?q\u0004\n\u001dk>qn\rXf\"q\r\u0016\u001c%<\u001d";
        f6824[114] = "3+\u0017)%\u001fhs\u0011i\u001a\u001a5lcuf\u0014$qCh\u001aJ?lHre\u0004ayI\u0013";
        f6824[115] = ";`*\t[)\"kxSd-@k,\u000f\u0002!;6<P\u0006C|?>\u0000\u001d?{:#Nd";
        f6824[116] = "|+\u001d\u0012]\u0007#x\rR>P\u007f=2\u0001ZB\u007fA\u0014\u000f\u0003Bt,\u0015P_?";
        f6824[117] = ">Z>}\f97\t {\u001e\u0002b\u000f$d\bnP^a5T=\u0007[`b\u0016a<R3|\u0010s\u0007";
        f6824[118] = "\u0018\u001an:\u001dZ\u000e@,t%\t\u0013F4hr\\C\u0017l\u0004YW\fT>|^\u0005\u001b\u0010";
        f6824[119] = "&[{f\u000e\u0010 Jpmo\u0494\u0018\\f8^\u0001c\u001bw+W";
        f6824[120] = "&\nxtB\bc\u000fj%T8~Tt+SUP_v\u0006T_tQQ0YDrjp!\\YtNk+VxvTf(]B\u001f\u000b2*I[$\u0002a4OI\u001f";
        f6824[121] = """
                     \u0005s#B[\u0004G2>\u0006\u0004\u007f],$_\u0004\u0012q,!E\u001d\u0012|#!c
                     \u0019@\u00013B\u001d\u001eQ&\u001bD
                     \u001a<vb@W\u0006@qg]\u0019\u007f""";
        f6824[122] = """
                     Q`\u0018oM\u0012\r"LxA{\u0006;\u0010fB,XjF9.
                     \u000e6\r9\u0016\u0019
                     9M""";
        f6824[123] = "!\u001b5,GR'\n>'&\u04bd\u001f[h`JP`\u0018;e\u001d";
        f6824[124] = "d\u000f8\u007fbN8Mlhn'3T0vmpm\fc(\u0001V;Y-)9E?Vm";
        f6824[125] = "b;S \u0010U,eF!qK!1U/\rM'\\FvHD/lUw\u0018*";
        f6824[126] = """
                     \u0017\u001e@\u0001
                     
                     \u0001D\u0002O2R\u0010S\u001eX^`C\u0016D\u000f2\bAS\u0012EMK\u0012VE?""";
        f6824[127] = "\r3e\u0016>z\u000b\"n\u001d_\u024a3!oG\"z\t<~M6";
        f6824[128] = "\u0010himd\u0017\u00062+#\\O\u0017%740}Chjhl*\u001d\"7h1I\u001458n\\";
        f6824[129] = "\u0016\u0017[HndDW\u000e\u0017V|\u001c\rTC?p%\u0003TS;\u0016DVLB,i\u0007\u0005I\u0015V";
        f6824[130] = "O/ODMuIhX\u0019.{\u0015\u007fN\u0012y/J#\u001bO..Iw\u0010\u001dN(\u000e`M";
        f6824[131] = "[L\f;6+KGAgV5HK$;?+HM-6)ZZUC.6k\u001dG\u0010#V";
        f6824[132] = "1V-k\u000187G&``)\u000f@#)\u000f~iJ c\u0003@fF>4^&lEt8`";
        f6824[133] = "/@&\u0014o.*B&\fUz:X4\u00139Hn\u001cnJm\u001fmF%\u0018?y(T$\u0018U";
        f6824[134] = "\u0006e50\u001b6\u0000&#~tbV%\u0003o\u001a`;c%\u007f\u0018g]&7~\u0018\r";
        f6824[135] = "jK9;\u0015qmF,lnpvF8o9!*\u0017a\u0003T|fG6e\u0011ngG";
        f6824[136] = "?<p!mdm|%~Uh;%f*\u0012xR~';9l-=t>n\u0016?<p!mdm|%~U";
        f6824[137] = "Z`@)\u000e'\u0002|\u0001,a$Sf\u0010w\r\u0016\u000e!J!a{\\k\u001cz\u0007>Nj\u001c\u0010";
        f6824[138] = "PuP]\t\u0012\bi\u0011Xf\u0011Ys\u0000\u0003\n#\u00044ZTfNV~\f\u000e\u0000\u000bD\u007f\fd";
        f6824[139] = "j\tMxj1#JV#-\u000b<_[Tvw2NV\u0019y3o\nL%*`4J'";
        f6824[140] = "M$<=~/\b+%3<JX\u0015gh%5\u000bq3o%0\u0011\u0015gh%5\u000bq3o%0\u0011\u0015";
        f6824[141] = "LhhCh\u0014J+~\r\u0007@\u001c(S\u0001{F\u001a4w\u0011JI\r5f\f\u0007\u0011N6d\u0003d\u0013\u00161y}";
        f6824[142] = "Q8U\u001d\u001b\u0004\tkZ\u0001!\u0019\u0005(G\u0007M+Qk\u0018\\\u001b|\r4\u0017\u0011XD\u0006,A\u001b!\u001aU$[\u0006D\u0000\u0019.\\`";
        f6824[143] = "_\u001fpU,\"O\u0014=\tL<L\u0018XU%\"L\u001eXP08Ad\u007fSs\"AU8A /!";
        f6824[144] = "\u0017yt@+6\u0001#6\u000e\u0013n\u00104*\u0019\u007f\\CpwO\u00132\u0016$,\u0017.u\u000fx4\u0001\u00134A4&\u0004lw\u00121q~";
        f6824[145] = "pO`\u0011\f'#\u001c;Qg~t\u000b<N\u000bL\"If\u0011V\u001b%O$\u0019\u001eg\"J9Wg";
        f6824[146] = "r\t-42_{\u001e\"2_Yx\u000e-h3k,Jv6__.N(4cCp\u0018w\u000f<\u0007)\u0017v3 Y\u007fHMld\u0000pIqp:V/r*t?\u0007x\u0011#c0\u0001\u0015";
        f6824[147] = "(q\u0000\u0014Y=.`\u000b\u001f8\u0175\u00164\u0003UT/pq\u0011TTE*6\u0019\u0014A9-3\u0004Z8";
        f6824[148] = "\rFdjH9\u001b\u001c&$pa\n\u000b:3\u001cS\\Ngh@\u0004\u001a\u0017?l\u000bk\u001d\u001a*;p";
        f6824[149] = "+~;llh9b, \u000eb)|\u00020ux.a80rhD95luv)j&:lkDo\"63{5}>!\u007f\u0019";
        f6824[150] = "(\tZ\u00030\u0014*Q]\u001eN\u001aoKQ\u00195wnQ\u0005\u0000(\u001ao\u000eY}qKjZB\u00022\u0018o\r8";
        f6824[151] = "vt\u0019r%_.hXwJ\\\u007frI,&n\"5\u0013uJ\u0003p\u007fE!,Fb~EK";
        f6824[152] = "z3\u0007USBliE\u001bk\u001a}~Y\f\u0007()2\tSS\u007fs9\u0005\u000ePCogSQk\u001c+>\\PW\u0000uh\u0003k\bD,g\u0002W\u0014\u001az89WS\u0007 {EPV\u001an\u0002";
        f6824[153] = "8!q84a=#q \u000e5-9c?b\u0007y}9f5Pz'r4d6?5s4\u000e";
        f6824[154] = "6vt>\"\u001d,:~9D\u001d=7d%(/it;r\u007fx61zy;\u001c1+:%D";
        f6824[155] = "\u001eW\u007fY:\b\u0018FtR[\u0454 L'R8\u0012C\u0010#\u000b\"";
        f6824[156] = "vu5\u0004 60|fXdR!yi\u00007\u0005r)<^[k$tb\rf,=(z\u001b";
        f6824[157] = "M\u0001q6j\u0019DRo0x\"\u0011Tk/nN#\u0005.~5\u0018t\u0003u>eH\u0012Fg?e\"";
        f6824[158] = "nsX\u001e?C)bK\u0017VCw}[/lZgc\\I)Hfc6";
        f6824[159] = "DJ(tX\u000eYW$-'\u0006]E/)\\k\\_{0A\u0006]\u0000'M\u0018WXT<2[\u0004]\u0003F";
        f6824[160] = "a^O(\r_gOD#l\u051d_\u001bLi\u0000M9^^h\u0000";
        f6824[161] = ".;\u0014\bD~i*\u0007\u0001-}1#\u001e9Ubk:\u001cTT=7G";
        f6824[162] = "j1)\u001e\u001eap6<\u0011fdd&\f\u0007\u0000td>#\u0003\n\u001f6f;\u0002\u001c`u5>Uf#1\"w\u0017\u001a$4?9n";
        f6824[163] = "w~`CE\u000f/b!F*\f~x0\u001dF>#?jE*Squ<\u0010L\u0016ct<z";
        f6824[164] = "5c\u0004ig\u00023r\u000fb\u0006\u048d\u000bq\u000e8{\u00021l\u001f2o";
        f6824[165] = "lEd\u0007\u001a.oG`\u001f]T8\u0002~\u001f\\TlDd\u0007Y08Cd\u0002CTlE|\u0000\u0016&d\u0019o\u001c\u001bTi@|H_(nEa\u0006&";
        f6824[166] = """
                     t]]P,'vA\u0019\u0006?^#P
                     \u000f#	s\bXWOg!\u000b\\b6e=O
                     \u001b""";
        f6824[167] = "$h~C .\"yuHA\u02d7\u001axa\u0014|4kj}\u00030";
        f6824[168] = "\u000f]q2\fN\tLz9m\u05231@-eTN@\u001cl\u007fP";
        f6824[169] = "hU\u001b`\u0013C;\u0006@ x\u001al\u0011G?\u0014(<S\u001dhxEc\u001cK2\u001e\u0000q\u001dKX";
        f6824[170] = "sX\\B\u0004Ur_\u0017B5\u0017}\n\u001f\u007fQ\u000b~\u0018g\u001eW\u001dn\t\u0001[E\u001cnc]FD\u0000h\u0005\u0018TE\u0000\u0002__\\\u0005\u0015~XZAKl";
        f6824[171] = "=5m5=\u0000}kmj6d~fihw\u0018iq]dp\u0018emir\f]moibh\u000e;nh5\fX<s6pp_9nx\t";
        f6824[172] = "ep#! ixm/x_ \u0005b?vfs`\u007f\"z?";
        f6824[173] = "\\\u0005EU@\u0004U\u0012JS-\tZ\u0013A\u0002z^\u0000C\u001fnN\\\u0007\u001b\u001eRR\u0002QD";
        f6824[174] = "\u001f0>*C5\u001a2>2ya\n(,-\u0015S^lvtE\u0004]6=&\u0013b\u0018$<&y";
        f6824[175] = "iV\\5U\u00131\u0005S)o\u000e=FN/\u0003<j\u000b\u0012uoQ2KB\"\t\u0014 JBHTV5\u0000M(R\u0011\"].tW\u0013`CRsR\u000e.:";
        f6824[176] = "ml\u0010\u007f\u0018O*}\u0003vq]y|~6\u0016\thv\u00137IU\u0015/B2\u001dNjl\u00117J4";
        f6824[177] = "\u0012DbY\u007fTL\u00132\u001aG\u050b.\u0011m\u0012+\u0001HT\u007f\u0013+k";
        f6824[178] = "\tkSN\u0004U\u0016x\u001cXuI\u0018o\bK\"\u001aI;T'\u0005NFk\u001dU\u001a]\t}";
        f6824[179] = "4od N\b2~o+/\u01bf\n\u007f8/N\u0014a{\u007fsH";
        f6824[180] = "J\u0010]3E;\u0016\u0014\u0004)'3JD\u000f*'d\u0016QV)[c\u0013L\u0018P";
        f6824[181] = "<L\u001b?mt:]\u00104\f\u03d0\u0002^\u0011nqt8C\u0000de";
        f6824[182] = "|r\u0000D[\u0018|p\u001aT;\u0011,\"\u001dBlFrq@.I\u0014+\"\u001d_WB=&";
        f6824[183] = "91ksSC/k)=k\u001b>|5*\u0007)m9l}kG?:n.\u0012E#~8=kG?m* U\u00006\u007fj+k";
        f6824[184] = "\u0001JVj\u0000\u0014\u0007[]aa\u014e?\n\u000b&\r\u0016@IX#Zl";
        f6824[185] = "&CeD)7.B'\u0010J 1Fy\u001e&\u0012e\u0000!AvE8@)@%#`\\hEJ";
        f6824[186] = "\u007fQ|0P\u000ebLpi/&\u001fC`g\u0016\u0014z^}kO";
        f6824[187] = "z\u001fNU$/|\u000eE^E\u042eD_\u0013\u0019)-;\u001c@\u001c~";
        f6824[188] = "\u000bp\u0017\u001d4|\f\"\u0000YZa\u001a<\t\u00056SJzVRe\u0004\u001b*V\u00048\u007fF:\t\u0000Z8O8Y\u001b&?J%\u0017b";
        f6824[189] = """
                     \u0010\u0016(HN&\r\u0007"\6g\u0010\u0001	TZp\u0010\u001bI
                     
                     `\u0011\u00076IYeF}$^Wa\u0005G9O]u}""";
        f6824[190] = "X\u0017?/x%\u0007D/o\u001btZ\u0011\u0015(qF[\u000124}rM}w<\u007fr]\u0019$j~s\n}rmc-O\u0001uh~c6";
        f6824[191] = "m@)E$$d\u00137C6\u001f?\u001c(G*\u001fh@7\f>coE*BG";
        f6824[192] = "\u001b@rI6\\G\u0001hMNU\u0010\u0006n\u001d\"-\u001aF)\u0015u\u0011\u0006\u0018\u007fJN\u0012E\u0001y\n1Q\u0016\u0004.p";
        f6824[193] = "\fo'\u001e#|W7!^\u001cy\n(UDap\u0004/\u001e\u001b{j\u00015aU%\u007f\u0000T";
        f6824[194] = "\u000eX\u0001w_$\u0016\u0007J$c7\u0012[U#4`H\n\u0001O\u001e7C\u000e\r2\u0006h\b]";
        f6824[195] = "7\u000f$!Z\n(\u001ck7+\u0016&\u000b\u007f$|Ew^+H[\u0011x\u000fj:D\u00027\u0019";
        f6824[196] = "O\";F)\u001eO !VI\u0017\u001fr&@\u001e@A%~,#H@!z\u00115\u0012\u0002o";
    }
}
