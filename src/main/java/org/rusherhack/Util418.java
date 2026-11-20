// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import net.minecraft.util.math.Vec3i;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.lang.invoke.MethodHandles;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;

import org.rusherhack.client.api.feature.hud.impl.Direction;
public class Util418 implements Globals
{
    public static long f7001;
    public static long f7002;
    public static Object[] f7003;
    public static String[] f7004;
    
    public static boolean m13509(BlockPos p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          6943051297549
        //     6: lxor           
        //     7: lstore_1       
        //     8: invokestatic    org/rusherhack/Class253.m9155:()I
        //    11: istore_3       
        //    12: aload_0        
        //    13: astore          4
        //    15: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    18: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    21: aload           4
        //    23: invokevirtual   net.minecraft.util.math.BlockPos.down:()Lnet.minecraft.util.math.BlockPos;
        //    26: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //    29: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isAir:()Z
        //    32: iload_3        
        //    33: ifeq            54
        //    36: ifeq            55
        //    39: goto            46
        //    42: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    45: athrow         
        //    46: iconst_0       
        //    47: goto            54
        //    50: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    53: athrow         
        //    54: ireturn        
        //    55: aload           4
        //    57: iconst_0       
        //    58: invokestatic    org/rusherhack/Util418.m13511:(Lnet.minecraft.util.math.BlockPos;Z)[Lnet.minecraft.util.math.BlockPos;
        //    61: dup            
        //    62: astore          7
        //    64: arraylength    
        //    65: istore          5
        //    67: iconst_0       
        //    68: dup            
        //    69: istore          6
        //    71: iload           5
        //    73: if_icmpge       170
        //    76: aload           7
        //    78: iload           6
        //    80: aaload         
        //    81: astore_0       
        //    82: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    85: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    88: aload_0        
        //    89: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //    92: dup            
        //    93: astore_0       
        //    94: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isAir:()Z
        //    97: iload_3        
        //    98: ifeq            174
        //   101: iload_3        
        //   102: ifeq            161
        //   105: goto            112
        //   108: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   111: athrow         
        //   112: ifne            153
        //   115: goto            122
        //   118: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   121: athrow         
        //   122: aload_0        
        //   123: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //   126: invokevirtual   net.minecraft.block.Block.getBlastResistance:()F
        //   129: ldc             1200.0
        //   131: fcmpg          
        //   132: iload_3        
        //   133: ifeq            167
        //   136: goto            143
        //   139: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   142: athrow         
        //   143: ifge            162
        //   146: goto            153
        //   149: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   152: athrow         
        //   153: iconst_0       
        //   154: goto            161
        //   157: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   160: athrow         
        //   161: ireturn        
        //   162: iinc            6, 1
        //   165: iload           6
        //   167: goto            71
        //   170: iconst_1       
        //   171: dup            
        //   172: dup            
        //   173: pop2           
        //   174: ireturn        
        //    StackMapTable: 00 14 FF 00 2A 00 04 07 00 2A 04 01 07 00 2A 00 01 07 00 14 03 43 07 00 14 43 01 00 FF 00 0F 00 07 07 00 04 04 01 07 00 2A 01 01 07 00 4F 00 01 01 FF 00 24 00 07 07 00 51 04 01 07 00 2A 01 01 07 00 4F 00 01 07 00 14 43 01 45 07 00 14 03 50 07 00 14 43 01 45 07 00 14 03 43 07 00 14 43 01 00 44 01 FF 00 02 00 07 07 00 04 04 01 07 00 2A 01 01 07 00 4F 00 00 43 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  15     39     42     46     Ljava/lang/MatchException;
        //  36     47     50     54     Ljava/lang/MatchException;
        //  94     105    108    112    Ljava/lang/MatchException;
        //  101    115    118    122    Ljava/lang/MatchException;
        //  112    136    139    143    Ljava/lang/MatchException;
        //  122    146    149    153    Ljava/lang/MatchException;
        //  143    154    157    161    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0112:
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
    
    public static float m13510(double p0, double p1, double p2, DamageSource p3, float p4, LivingEntity p5, boolean p6, int p7) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          8895404094202
        //     6: lxor           
        //     7: lstore          11
        //     9: invokestatic    org/rusherhack/Class253.m9154:()I
        //    12: istore          13
        //    14: aload           6
        //    16: fload           7
        //    18: fstore          6
        //    20: astore          7
        //    22: aload           8
        //    24: instanceof      Lnet.minecraft.entity.player.PlayerEntity;
        //    27: iload           13
        //    29: ifne            80
        //    32: ifeq            74
        //    35: goto            42
        //    38: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    41: athrow         
        //    42: aload           8
        //    44: checkcast       Lnet.minecraft.entity.player.PlayerEntity;
        //    47: dup            
        //    48: astore          14
        //    50: invokevirtual   net.minecraft.entity.player.PlayerEntity.isCreative:()Z
        //    53: iload           13
        //    55: ifne            80
        //    58: ifeq            74
        //    61: goto            68
        //    64: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    67: athrow         
        //    68: fconst_0       
        //    69: freturn        
        //    70: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    73: athrow         
        //    74: aload           8
        //    76: aconst_null    
        //    77: invokevirtual   net.minecraft.entity.Entity.isImmuneToExplosion:(Lnet.minecraft.world.explosion.Explosion;)Z
        //    80: ifeq            89
        //    83: fconst_0       
        //    84: freturn        
        //    85: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    88: athrow         
        //    89: new             Lnet.minecraft.util.math.Vec3d;
        //    92: dup            
        //    93: dload_0        
        //    94: dload_2        
        //    95: dload           4
        //    97: invokespecial   net.minecraft.util.math.Vec3d.<init>:(DDD)V
        //   100: dup            
        //   101: astore          14
        //   103: aload           8
        //   105: invokevirtual   net.minecraft.entity.Entity.getPos:()Lnet.minecraft.util.math.Vec3d;
        //   108: invokevirtual   net.minecraft.util.math.Vec3d.distanceTo:(Lnet.minecraft.util.math.Vec3d;)D
        //   111: ldc2_w          12.0
        //   114: dcmpl          
        //   115: iload           13
        //   117: ifne            210
        //   120: ifle            136
        //   123: goto            130
        //   126: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   129: athrow         
        //   130: fconst_0       
        //   131: freturn        
        //   132: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   135: athrow         
        //   136: fload           6
        //   138: fconst_2       
        //   139: fmul           
        //   140: fstore          6
        //   142: aload           14
        //   144: aload           8
        //   146: dup_x1         
        //   147: iload           9
        //   149: iload           10
        //   151: invokestatic    org/rusherhack/Util418.m13512:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.entity.LivingEntity;ZI)F
        //   154: f2d            
        //   155: dstore_2       
        //   156: aload           8
        //   158: iload           10
        //   160: invokestatic    org/rusherhack/Class006.m307:(Lnet.minecraft.entity.LivingEntity;I)Lnet.minecraft.util.math.Vec3d;
        //   163: aload           14
        //   165: invokevirtual   net.minecraft.util.math.Vec3d.squaredDistanceTo:(Lnet.minecraft.util.math.Vec3d;)D
        //   168: invokestatic    java/lang/Math.sqrt:(D)D
        //   171: fload           6
        //   173: f2d            
        //   174: ddiv           
        //   175: dstore          4
        //   177: dconst_1       
        //   178: dload           4
        //   180: dsub           
        //   181: dload_2        
        //   182: dmul           
        //   183: dup2           
        //   184: dstore_2       
        //   185: dup2           
        //   186: dmul           
        //   187: dload_2        
        //   188: dadd           
        //   189: ldc2_w          2.0
        //   192: ddiv           
        //   193: ldc2_w          7.0
        //   196: dmul           
        //   197: fload           6
        //   199: f2d            
        //   200: dmul           
        //   201: dconst_1       
        //   202: dadd           
        //   203: d2i            
        //   204: i2f            
        //   205: fstore          6
        //   207: instanceof      Lnet.minecraft.entity.player.PlayerEntity;
        //   210: iload           13
        //   212: ifne            388
        //   215: ifeq            380
        //   218: goto            225
        //   221: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   224: athrow         
        //   225: aload           7
        //   227: invokevirtual   net.minecraft.entity.damage.DamageSource.isScaledWithDifficulty:()Z
        //   230: iload           13
        //   232: ifne            359
        //   235: goto            242
        //   238: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   241: athrow         
        //   242: ifeq            355
        //   245: goto            252
        //   248: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   251: athrow         
        //   252: getstatic       org/rusherhack/Class326.f5292:[I
        //   255: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   258: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   261: invokeinterface net.minecraft.world.WorldAccess.getDifficulty:()Lnet.minecraft.world.Difficulty;
        //   266: invokevirtual   java/lang/Enum.ordinal:()I
        //   269: iaload         
        //   270: tableswitch {
        //                2: 318
        //                3: 332
        //                4: 346
        //                5: 346
        //          default: 304
        //        }
        //   300: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   303: athrow         
        //   304: new             Ljava/lang/MatchException;
        //   307: dup            
        //   308: aconst_null    
        //   309: dup            
        //   310: invokespecial   java/lang/MatchException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   313: athrow         
        //   314: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   317: athrow         
        //   318: fload           6
        //   320: fconst_2       
        //   321: fdiv           
        //   322: fconst_1       
        //   323: fadd           
        //   324: fload           6
        //   326: invokestatic    java/lang/Math.min:(FF)F
        //   329: goto            353
        //   332: fload           6
        //   334: iload           13
        //   336: ifeq            353
        //   339: goto            320
        //   342: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   345: athrow         
        //   346: fload           6
        //   348: ldc             3.0
        //   350: fmul           
        //   351: fconst_2       
        //   352: fdiv           
        //   353: fstore          6
        //   355: fload           6
        //   357: fconst_0       
        //   358: fcmpl          
        //   359: iload           13
        //   361: ifne            388
        //   364: ifne            380
        //   367: goto            374
        //   370: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   373: athrow         
        //   374: fconst_0       
        //   375: freturn        
        //   376: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   379: athrow         
        //   380: aload           7
        //   382: getstatic       net.minecraft.registry.tag.DamageTypeTags.BYPASSES_ARMOR:Lnet.minecraft.registry.tag.TagKey;
        //   385: invokevirtual   net.minecraft.entity.damage.DamageSource.isIn:(Lnet.minecraft.registry.tag.TagKey;)Z
        //   388: iload           13
        //   390: ifne            436
        //   393: ifne            428
        //   396: goto            403
        //   399: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   402: athrow         
        //   403: fload           6
        //   405: aload           7
        //   407: aload           8
        //   409: dup_x2         
        //   410: invokevirtual   net.minecraft.entity.LivingEntity.getArmor:()I
        //   413: i2f            
        //   414: aload           8
        //   416: getstatic       net.minecraft.entity.attribute.EntityAttributes.GENERIC_ARMOR_TOUGHNESS:Lnet.minecraft.registry.entry.RegistryEntry;
        //   419: invokevirtual   net.minecraft.entity.LivingEntity.getAttributeValue:(Lnet.minecraft.registry.entry.RegistryEntry;)D
        //   422: d2f            
        //   423: invokestatic    net.minecraft.entity.DamageUtil.getDamageLeft:(Lnet.minecraft.entity.LivingEntity;FLnet.minecraft.entity.damage.DamageSource;FF)F
        //   426: fstore          6
        //   428: aload           7
        //   430: getstatic       net.minecraft.registry.tag.DamageTypeTags.BYPASSES_EFFECTS:Lnet.minecraft.registry.tag.TagKey;
        //   433: invokevirtual   net.minecraft.entity.damage.DamageSource.isIn:(Lnet.minecraft.registry.tag.TagKey;)Z
        //   436: iload           13
        //   438: ifne            466
        //   441: ifne            622
        //   444: goto            451
        //   447: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   450: athrow         
        //   451: aload           8
        //   453: getstatic       net.minecraft.entity.effect.StatusEffects.RESISTANCE:Lnet.minecraft.registry.entry.RegistryEntry;
        //   456: invokevirtual   net.minecraft.entity.LivingEntity.hasStatusEffect:(Lnet.minecraft.registry.entry.RegistryEntry;)Z
        //   459: goto            466
        //   462: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   465: athrow         
        //   466: iload           13
        //   468: ifne            551
        //   471: ifeq            547
        //   474: goto            481
        //   477: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   480: athrow         
        //   481: aload           7
        //   483: getstatic       net.minecraft.registry.tag.DamageTypeTags.BYPASSES_RESISTANCE:Lnet.minecraft.registry.tag.TagKey;
        //   486: invokevirtual   net.minecraft.entity.damage.DamageSource.isIn:(Lnet.minecraft.registry.tag.TagKey;)Z
        //   489: iload           13
        //   491: ifne            551
        //   494: goto            501
        //   497: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   500: athrow         
        //   501: ifne            547
        //   504: goto            511
        //   507: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   510: athrow         
        //   511: fload           6
        //   513: getstatic       org/rusherhack/Util418.f7002:J
        //   516: l2i            
        //   517: aload           8
        //   519: getstatic       net.minecraft.entity.effect.StatusEffects.RESISTANCE:Lnet.minecraft.registry.entry.RegistryEntry;
        //   522: invokevirtual   net.minecraft.entity.LivingEntity.getStatusEffect:(Lnet.minecraft.registry.entry.RegistryEntry;)Lnet.minecraft.entity.effect.StatusEffectInstance;
        //   525: invokevirtual   net.minecraft.entity.effect.StatusEffectInstance.getAmplifier:()I
        //   528: iconst_1       
        //   529: dup            
        //   530: dup            
        //   531: pop2           
        //   532: iadd           
        //   533: iconst_5       
        //   534: imul           
        //   535: isub           
        //   536: i2f            
        //   537: fmul           
        //   538: ldc             25.0
        //   540: fdiv           
        //   541: fconst_0       
        //   542: invokestatic    java/lang/Math.max:(FF)F
        //   545: fstore          6
        //   547: fload           6
        //   549: fconst_0       
        //   550: fcmpg          
        //   551: iload           13
        //   553: ifne            580
        //   556: ifgt            572
        //   559: goto            566
        //   562: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   565: athrow         
        //   566: fconst_0       
        //   567: freturn        
        //   568: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   571: athrow         
        //   572: aload           7
        //   574: getstatic       net.minecraft.registry.tag.DamageTypeTags.BYPASSES_ENCHANTMENTS:Lnet.minecraft.registry.tag.TagKey;
        //   577: invokevirtual   net.minecraft.entity.damage.DamageSource.isIn:(Lnet.minecraft.registry.tag.TagKey;)Z
        //   580: ifne            622
        //   583: aload           8
        //   585: aload           7
        //   587: invokestatic    org/rusherhack/Util210.m8044:(Lnet.minecraft.entity.LivingEntity;Lnet.minecraft.entity.damage.DamageSource;)F
        //   590: dup            
        //   591: fstore          7
        //   593: fconst_0       
        //   594: iload           13
        //   596: ifne            625
        //   599: fcmpl          
        //   600: ifle            622
        //   603: goto            610
        //   606: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   609: athrow         
        //   610: fload           6
        //   612: fload           7
        //   614: invokestatic    net.minecraft.entity.DamageUtil.getInflictedDamage:(FF)F
        //   617: freturn        
        //   618: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   621: athrow         
        //   622: fload           6
        //   624: fconst_0       
        //   625: invokestatic    java/lang/Math.max:(FF)F
        //   628: freturn        
        //    StackMapTable: 00 3E FF 00 26 00 0A 03 03 03 02 07 00 8C 07 00 B2 01 01 04 01 00 01 07 00 14 03 FF 00 15 00 0B 03 03 03 02 07 00 8C 07 00 B2 01 01 04 01 07 00 5A 00 01 07 00 14 03 41 07 00 14 FA 00 03 45 01 44 07 00 14 03 FF 00 24 00 0B 03 03 03 02 07 00 8C 07 00 B2 01 01 04 01 07 00 65 00 01 07 00 14 03 41 07 00 14 03 F7 00 49 01 4A 07 00 14 03 4C 07 00 14 43 01 45 07 00 14 03 6F 07 00 14 03 49 07 00 14 03 41 02 0B 49 07 00 14 03 46 02 01 43 01 4A 07 00 14 03 41 07 00 14 03 47 01 4A 07 00 14 03 18 47 01 4A 07 00 14 03 4A 07 00 14 43 01 4A 07 00 14 03 4F 07 00 14 43 01 45 07 00 14 03 23 43 01 4A 07 00 14 03 41 07 00 14 03 47 01 FF 00 19 00 0B 03 03 03 02 02 07 00 B2 01 01 04 01 07 00 65 00 01 07 00 14 03 47 07 00 14 FF 00 03 00 0B 03 03 03 02 00 07 00 B2 01 01 04 01 07 00 65 00 00 FF 00 02 00 0B 03 03 03 02 00 07 00 B2 01 01 04 01 07 00 65 00 02 02 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  22     35     38     42     Ljava/lang/MatchException;
        //  50     61     64     68     Ljava/lang/MatchException;
        //  58     70     70     74     Ljava/lang/MatchException;
        //  80     85     85     89     Ljava/lang/MatchException;
        //  103    123    126    130    Ljava/lang/MatchException;
        //  120    132    132    136    Ljava/lang/MatchException;
        //  210    218    221    225    Ljava/lang/MatchException;
        //  215    235    238    242    Ljava/lang/MatchException;
        //  225    245    248    252    Ljava/lang/MatchException;
        //  242    300    300    304    Ljava/lang/MatchException;
        //  252    314    314    318    Ljava/lang/MatchException;
        //  332    342    342    346    Ljava/lang/MatchException;
        //  359    367    370    374    Ljava/lang/MatchException;
        //  364    376    376    380    Ljava/lang/MatchException;
        //  388    396    399    403    Ljava/lang/MatchException;
        //  436    444    447    451    Ljava/lang/MatchException;
        //  441    459    462    466    Ljava/lang/MatchException;
        //  466    474    477    481    Ljava/lang/MatchException;
        //  471    494    497    501    Ljava/lang/MatchException;
        //  481    504    507    511    Ljava/lang/MatchException;
        //  551    559    562    566    Ljava/lang/MatchException;
        //  556    568    568    572    Ljava/lang/MatchException;
        //  593    603    606    610    Ljava/lang/MatchException;
        //  599    618    618    622    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0225:
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
    
    public static BlockPos[] m13511(BlockPos p0, boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          12957579179072
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          5
        //    16: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    19: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    22: aload           5
        //    24: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //    27: dup            
        //    28: astore_0       
        //    29: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isAir:()Z
        //    32: iload           4
        //    34: ifne            113
        //    37: ifne            112
        //    40: goto            47
        //    43: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    46: athrow         
        //    47: aload_0        
        //    48: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //    51: instanceof      Lnet.minecraft.block.AbstractChestBlock;
        //    54: iload           4
        //    56: ifne            90
        //    59: goto            66
        //    62: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    65: athrow         
        //    66: ifne            105
        //    69: goto            76
        //    72: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    75: athrow         
        //    76: aload_0        
        //    77: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //    80: instanceof      Lnet.minecraft.block.SkullBlock;
        //    83: goto            90
        //    86: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    89: athrow         
        //    90: iload           4
        //    92: ifne            113
        //    95: ifeq            112
        //    98: goto            105
        //   101: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   104: athrow         
        //   105: aload           5
        //   107: invokevirtual   net.minecraft.util.math.BlockPos.up:()Lnet.minecraft.util.math.BlockPos;
        //   110: astore          5
        //   112: iload_1        
        //   113: iload           4
        //   115: ifne            202
        //   118: ifeq            201
        //   121: goto            128
        //   124: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   127: athrow         
        //   128: iconst_5       
        //   129: anewarray       Lnet.minecraft.util.math.BlockPos;
        //   132: dup            
        //   133: iconst_0       
        //   134: aload           5
        //   136: aastore        
        //   137: dup            
        //   138: iconst_1       
        //   139: dup            
        //   140: dup            
        //   141: pop2           
        //   142: aload           5
        //   144: getstatic       net.minecraft.util.math.Direction.NORTH:Lnet.minecraft.util.math.Direction;
        //   147: invokevirtual   net.minecraft.util.math.Direction.getVector:()Lnet.minecraft.util.math.Vec3i;
        //   150: invokevirtual   net.minecraft.util.math.BlockPos.add:(Lnet.minecraft.util.math.Vec3i;)Lnet.minecraft.util.math.BlockPos;
        //   153: aastore        
        //   154: dup            
        //   155: iconst_2       
        //   156: aload           5
        //   158: getstatic       net.minecraft.util.math.Direction.SOUTH:Lnet.minecraft.util.math.Direction;
        //   161: invokevirtual   net.minecraft.util.math.Direction.getVector:()Lnet.minecraft.util.math.Vec3i;
        //   164: invokevirtual   net.minecraft.util.math.BlockPos.add:(Lnet.minecraft.util.math.Vec3i;)Lnet.minecraft.util.math.BlockPos;
        //   167: aastore        
        //   168: dup            
        //   169: iconst_3       
        //   170: aload           5
        //   172: getstatic       net.minecraft.util.math.Direction.WEST:Lnet.minecraft.util.math.Direction;
        //   175: invokevirtual   net.minecraft.util.math.Direction.getVector:()Lnet.minecraft.util.math.Vec3i;
        //   178: invokevirtual   net.minecraft.util.math.BlockPos.add:(Lnet.minecraft.util.math.Vec3i;)Lnet.minecraft.util.math.BlockPos;
        //   181: aastore        
        //   182: dup            
        //   183: iconst_4       
        //   184: aload           5
        //   186: getstatic       net.minecraft.util.math.Direction.EAST:Lnet.minecraft.util.math.Direction;
        //   189: invokevirtual   net.minecraft.util.math.Direction.getVector:()Lnet.minecraft.util.math.Vec3i;
        //   192: invokevirtual   net.minecraft.util.math.BlockPos.add:(Lnet.minecraft.util.math.Vec3i;)Lnet.minecraft.util.math.BlockPos;
        //   195: aastore        
        //   196: areturn        
        //   197: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   200: athrow         
        //   201: iconst_4       
        //   202: anewarray       Lnet.minecraft.util.math.BlockPos;
        //   205: dup            
        //   206: iconst_0       
        //   207: aload           5
        //   209: getstatic       net.minecraft.util.math.Direction.NORTH:Lnet.minecraft.util.math.Direction;
        //   212: invokevirtual   net.minecraft.util.math.Direction.getVector:()Lnet.minecraft.util.math.Vec3i;
        //   215: invokevirtual   net.minecraft.util.math.BlockPos.add:(Lnet.minecraft.util.math.Vec3i;)Lnet.minecraft.util.math.BlockPos;
        //   218: aastore        
        //   219: dup            
        //   220: iconst_1       
        //   221: dup            
        //   222: dup            
        //   223: pop2           
        //   224: aload           5
        //   226: getstatic       net.minecraft.util.math.Direction.SOUTH:Lnet.minecraft.util.math.Direction;
        //   229: invokevirtual   net.minecraft.util.math.Direction.getVector:()Lnet.minecraft.util.math.Vec3i;
        //   232: invokevirtual   net.minecraft.util.math.BlockPos.add:(Lnet.minecraft.util.math.Vec3i;)Lnet.minecraft.util.math.BlockPos;
        //   235: aastore        
        //   236: dup            
        //   237: iconst_2       
        //   238: aload           5
        //   240: getstatic       net.minecraft.util.math.Direction.WEST:Lnet.minecraft.util.math.Direction;
        //   243: invokevirtual   net.minecraft.util.math.Direction.getVector:()Lnet.minecraft.util.math.Vec3i;
        //   246: invokevirtual   net.minecraft.util.math.BlockPos.add:(Lnet.minecraft.util.math.Vec3i;)Lnet.minecraft.util.math.BlockPos;
        //   249: aastore        
        //   250: dup            
        //   251: iconst_3       
        //   252: aload           5
        //   254: getstatic       net.minecraft.util.math.Direction.EAST:Lnet.minecraft.util.math.Direction;
        //   257: invokevirtual   net.minecraft.util.math.Direction.getVector:()Lnet.minecraft.util.math.Vec3i;
        //   260: invokevirtual   net.minecraft.util.math.BlockPos.add:(Lnet.minecraft.util.math.Vec3i;)Lnet.minecraft.util.math.BlockPos;
        //   263: aastore        
        //   264: areturn        
        //    StackMapTable: 00 11 FF 00 2B 00 05 07 00 51 01 04 01 07 00 2A 00 01 07 00 14 03 4E 07 00 14 43 01 45 07 00 14 03 49 07 00 14 43 01 4A 07 00 14 03 06 40 01 4A 07 00 14 03 F7 00 44 07 00 14 03 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  29     40     43     47     Ljava/lang/MatchException;
        //  37     59     62     66     Ljava/lang/MatchException;
        //  47     69     72     76     Ljava/lang/MatchException;
        //  66     83     86     90     Ljava/lang/MatchException;
        //  90     98     101    105    Ljava/lang/MatchException;
        //  113    121    124    128    Ljava/lang/MatchException;
        //  118    197    197    201    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
    
    public static float m13512(Vec3d p0, LivingEntity p1, boolean p2, int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          136639755876592
        //     6: lxor           
        //     7: lstore          4
        //     9: aload_0        
        //    10: iload_3        
        //    11: istore_0       
        //    12: astore_3       
        //    13: invokestatic    org/rusherhack/Class253.m9155:()I
        //    16: aload_1        
        //    17: checkcast       Lorg/rusherhack/client/api/accessors/entity/IMixinEntity;
        //    20: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinEntity.getDimensions:()Lnet.minecraft.entity.EntityDimensions;
        //    25: aload_1        
        //    26: iload_0        
        //    27: invokestatic    org/rusherhack/Class006.m307:(Lnet.minecraft.entity.LivingEntity;I)Lnet.minecraft.util.math.Vec3d;
        //    30: invokevirtual   net.minecraft.entity.EntityDimensions.getBoxAt:(Lnet.minecraft.util.math.Vec3d;)Lnet.minecraft.util.math.Box;
        //    33: dup            
        //    34: astore_0       
        //    35: getfield        net.minecraft.util.math.Box.maxX:D
        //    38: aload_0        
        //    39: getfield        net.minecraft.util.math.Box.minX:D
        //    42: dsub           
        //    43: ldc2_w          2.0
        //    46: dmul           
        //    47: dconst_1       
        //    48: dup2_x2        
        //    49: dadd           
        //    50: ddiv           
        //    51: dstore          7
        //    53: istore          6
        //    55: aload_0        
        //    56: getfield        net.minecraft.util.math.Box.maxY:D
        //    59: aload_0        
        //    60: getfield        net.minecraft.util.math.Box.minY:D
        //    63: dsub           
        //    64: ldc2_w          2.0
        //    67: dmul           
        //    68: dconst_1       
        //    69: dup2_x2        
        //    70: dadd           
        //    71: ddiv           
        //    72: dstore          9
        //    74: aload_0        
        //    75: getfield        net.minecraft.util.math.Box.maxZ:D
        //    78: aload_0        
        //    79: getfield        net.minecraft.util.math.Box.minZ:D
        //    82: dsub           
        //    83: ldc2_w          2.0
        //    86: dmul           
        //    87: dconst_1       
        //    88: dup2_x2        
        //    89: dadd           
        //    90: ddiv           
        //    91: dstore          11
        //    93: dload           7
        //    95: dconst_0       
        //    96: dcmpg          
        //    97: iload           6
        //    99: ifeq            123
        //   102: iflt            164
        //   105: goto            112
        //   108: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   111: athrow         
        //   112: dload           9
        //   114: dconst_0       
        //   115: dcmpg          
        //   116: goto            123
        //   119: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   122: athrow         
        //   123: iload           6
        //   125: ifeq            161
        //   128: iflt            164
        //   131: goto            138
        //   134: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   137: athrow         
        //   138: dload           11
        //   140: dconst_0       
        //   141: iload           6
        //   143: ifeq            185
        //   146: goto            153
        //   149: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   152: athrow         
        //   153: dcmpg          
        //   154: goto            161
        //   157: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   160: athrow         
        //   161: ifge            170
        //   164: fconst_0       
        //   165: freturn        
        //   166: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   169: athrow         
        //   170: dconst_1       
        //   171: dup2           
        //   172: dload           7
        //   174: ddiv           
        //   175: invokestatic    java/lang/Math.floor:(D)D
        //   178: dload           7
        //   180: dmul           
        //   181: dsub           
        //   182: ldc2_w          2.0
        //   185: ddiv           
        //   186: dstore          13
        //   188: dconst_1       
        //   189: dup2           
        //   190: dload           11
        //   192: ddiv           
        //   193: invokestatic    java/lang/Math.floor:(D)D
        //   196: dload           11
        //   198: dmul           
        //   199: dsub           
        //   200: ldc2_w          2.0
        //   203: ddiv           
        //   204: dstore          15
        //   206: iconst_0       
        //   207: istore          17
        //   209: iconst_0       
        //   210: istore          18
        //   212: dconst_0       
        //   213: dup2           
        //   214: dstore          19
        //   216: dconst_1       
        //   217: dcmpg          
        //   218: ifgt            373
        //   221: dconst_0       
        //   222: dup2           
        //   223: dstore          21
        //   225: dconst_1       
        //   226: dcmpg          
        //   227: ifgt            362
        //   230: dconst_0       
        //   231: dup2           
        //   232: iload           6
        //   234: ifeq            368
        //   237: goto            244
        //   240: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   243: athrow         
        //   244: dstore          23
        //   246: dconst_1       
        //   247: dcmpg          
        //   248: ifgt            351
        //   251: iload           6
        //   253: ifeq            362
        //   256: goto            263
        //   259: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   262: athrow         
        //   263: new             Lnet.minecraft.util.math.Vec3d;
        //   266: dup            
        //   267: dload           19
        //   269: aload_0        
        //   270: getfield        net.minecraft.util.math.Box.minX:D
        //   273: aload_0        
        //   274: getfield        net.minecraft.util.math.Box.maxX:D
        //   277: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //   280: dload           13
        //   282: dadd           
        //   283: dload           21
        //   285: aload_0        
        //   286: getfield        net.minecraft.util.math.Box.minY:D
        //   289: aload_0        
        //   290: getfield        net.minecraft.util.math.Box.maxY:D
        //   293: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //   296: dload           23
        //   298: aload_0        
        //   299: getfield        net.minecraft.util.math.Box.minZ:D
        //   302: aload_0        
        //   303: getfield        net.minecraft.util.math.Box.maxZ:D
        //   306: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //   309: dload           15
        //   311: dadd           
        //   312: invokespecial   net.minecraft.util.math.Vec3d.<init>:(DDD)V
        //   315: aload_3        
        //   316: aload_1        
        //   317: iload_2        
        //   318: invokestatic    org/rusherhack/Class220.m8442:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.entity.Entity;Z)Lnet.minecraft.util.hit.HitResult.Type;
        //   321: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //   324: if_acmpne       337
        //   327: goto            334
        //   330: invokestatic    org/rusherhack/Util418.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   333: athrow         
        //   334: iinc            17, 1
        //   337: iinc            18, 1
        //   340: dload           23
        //   342: dload           11
        //   344: dadd           
        //   345: dup2           
        //   346: dstore          23
        //   348: goto            246
        //   351: dload           21
        //   353: dload           9
        //   355: dadd           
        //   356: dup2           
        //   357: dstore          21
        //   359: goto            225
        //   362: dload           19
        //   364: dload           7
        //   366: dadd           
        //   367: dup2           
        //   368: dstore          19
        //   370: goto            216
        //   373: iload           17
        //   375: i2f            
        //   376: iload           18
        //   378: i2f            
        //   379: fdiv           
        //   380: freturn        
        //    StackMapTable: 00 1C FF 00 6C 00 09 07 01 22 07 00 B2 01 07 00 65 04 01 03 03 03 00 01 07 00 14 03 46 07 00 14 43 01 4A 07 00 14 03 4A 07 00 14 FF 00 03 00 09 07 01 22 07 00 B2 01 07 00 65 04 01 03 03 03 00 02 03 03 43 07 00 14 43 01 02 41 07 00 14 03 FF 00 0E 00 09 07 01 22 07 00 B2 01 07 00 65 04 01 03 03 03 00 02 03 03 FF 00 1E 00 0E 07 01 22 07 00 B2 01 07 00 65 04 01 03 03 03 03 03 01 01 03 00 01 03 FF 00 08 00 0F 07 01 22 07 00 B2 01 07 00 65 04 01 03 03 03 03 03 01 01 03 03 00 01 03 4E 07 00 14 FF 00 03 00 0F 07 01 22 07 00 B2 01 07 00 65 04 01 03 03 03 03 03 01 01 03 03 00 02 03 03 FF 00 01 00 10 07 01 22 07 00 B2 01 07 00 65 04 01 03 03 03 03 03 01 01 03 03 03 00 01 03 4C 07 00 14 03 F7 00 42 07 00 14 03 02 0D FA 00 0A FF 00 05 00 0F 07 01 22 07 00 B2 01 07 00 65 04 01 03 03 03 03 03 01 01 03 03 00 02 03 03 FA 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  93     105    108    112    Ljava/lang/MatchException;
        //  102    116    119    123    Ljava/lang/MatchException;
        //  123    131    134    138    Ljava/lang/MatchException;
        //  128    146    149    153    Ljava/lang/MatchException;
        //  138    154    157    161    Ljava/lang/MatchException;
        //  161    166    166    170    Ljava/lang/MatchException;
        //  225    237    240    244    Ljava/lang/MatchException;
        //  246    256    259    263    Ljava/lang/MatchException;
        //  251    327    330    334    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0138:
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
    
    public static float m13513(EndCrystalEntity endCrystalEntity, LivingEntity livingEntity, boolean b, int n) {
        long n2 = Util418.f7001 ^ 0x3AFEC40A442AL;
        return m13510(((Entity)endCrystalEntity).getX(), ((Entity)endCrystalEntity).getY(), ((Entity)endCrystalEntity).getZ(), ((Entity)endCrystalEntity).getDamageSources().explosion((Entity)endCrystalEntity, (Entity)Globals.mc.player), 6.0f, livingEntity, b, n);
    }
    
    public static float m13514(BlockPos blockPos, LivingEntity livingEntity, boolean b, int n) {
        long n2 = Util418.f7001 ^ 0x44CF920E3FAL;
        return m13513(new EndCrystalEntity((World)Globals.mc.world, ((Vec3i)blockPos).getX() + 0.5, (double)(((Vec3i)blockPos).getY() + 1), ((Vec3i)blockPos).getZ() + 0.5), livingEntity, b, n);
    }
    
    static {
   }
    
    public static MatchException m285(MatchException ex) {
        return ex;
    }
    
    public static void m194() {
        Object[] f7003 = Util418.f7003;
        f7003[0] = "y{B\u0003Zaea@_@uub\u000b\u042c";
        f7003[1] = "KDA}/(KDV!#'Q\u000fV?#2V~\u0004fsp";
        f7003[2] = "\u0006\f\u0010OG\u001e\u0006\f\u0007\u0013K\u0011\u001cG\u0007\rK\u0004\u001b6UR\u001aN";
        f7003[3] = Boolean.TYPE;
        Util418.f7004[3] = "java/lang/Boolean";
        f7003[4] = Integer.TYPE;
        Util418.f7004[4] = "java/lang/Integer";
        f7003[5] = Float.TYPE;
        Util418.f7004[5] = "java/lang/Float";
        f7003[6] = "@\u0001\\C\u0006X\\\u001b^\u001f\u001cLL\u0018\u0015\u000e\u0018DJ\u001dOC\u0015]F]|\u0001\u001bON\u001fH";
        f7003[7] = "g\u001dQ\u0013;>g\u001dFO71}VFQ7.z'\u0016\ff";
        f7003[8] = """
                   P\u001e7HE\u0005P\u001e \u0014I
                   JU 
                   I\u001fM$qU\u001bT""";
        f7003[9] = "\u0002ywyxm\u0002y`%tb\u00182`;tw\u001fC5d-";
        f7003[10] = "*Jfk\u007f\\6Pd7eH&S/\u0243";
        f7003[11] = "\u0011\f\u0013\f\u0015>\u0011\f\u0004P\u00191\u000bG\u0004N\u0019$\f6U\u0011Mg";
        f7003[12] = "1\f\u0012$}\r1\f\u0005xq\u0002+G\u0005fq\u0017,6T9(V";
        f7003[13] = "\f\u0017};(\\\f\u0017jg$S\u0016\\jy$F\u0011-;#}\u0005";
        f7003[14] = "yeWtQ]rjF;2PggIP\u0007RvtU|\u0010_";
        f7003[15] = "B<\nA>LB<\u001d\u001d2CXw\u001d\u00032V_\u0006L]g\u001d";
        f7003[16] = "H)NmI\u0017H)Y1E\u0018RbY/E\rU\u0013\u000bq\u001dM";
        f7003[17] = "KRdMnIKRs\u0011bFQ\u0019s\u000fbSVh!Q;\u0012";
        f7003[18] = "}8H\u001a+>}8_F'1gs_X'$`\u0002\n\fpe";
        f7003[19] = "9=~#!\u00149=i\u007f-\u001b#via-\u000e$\u00072<|N";
        f7003[20] = "{NMCJ^{NZ\u001fFQa\u0005Z\u0001FDft\u000bY\u0014";
        f7003[21] = "s\u001a7\tG\ns\u001a UK\u0005iQ KK\u0010n r\u0015\u0012S";
        f7003[22] = "\u001b3\u001c\u0012S3\u001b3\u000bN_<\u0001x\u000bP_)\u0006\t^\u0004\u0006j";
        f7003[23] = Double.TYPE;
        Util418.f7004[23] = "java/lang/Double";
        f7003[24] = "giD\u001fXE{sFCBQkp\r\u02b6";
        f7003[25] = "%<";
        f7003[26] = "\t>\u0017P1)\u00021\u0006\u001fR$\u00177";
        f7003[27] = "8<\u000f7_98<\u0018kS6\"w\u0018uS#%\u0006J+\u0004g";
        f7003[28] = "%\u001a2\u0018p\u0018%\u001a%D|\u0017?Q%Z|\u00028 w\u000f/F";
        f7003[29] = "O'\u0011b~HS=\u0013>d\\C>X\u01e0";
        f7003[30] = "\rH\u0000Y\u0004+\rH\u0017\u0005\b$\u0017\u0003\u0017\u001b\b1\u0010rEA\\u";
        f7003[31] = """
                    \u001a\u001f*7\u0006>\u001a\u001f=k
                    1\u0000T=u
                    $\u0007%k(Xc""";
        f7003[32] = "k \u0004Z\u0004gw:\u0006\u0006\u001esg9M9";
        f7003[33] = ",\u000ey\u0006\u0010\u001a,\u000enZ\u001c\u00156EnD\u001c\u000014<\u001aDG";
        f7003[34] = "IK&YBeIK1\u0005NjS\u00001\u001bN\u007fTqfG\u001b4";
        f7003[35] = "Ht \\9~Ht7\u00005qR?7\u001e5dUNfAl";
        f7003[36] = ">Cbz8y>Cu&4v$\bu84c#y$gl43Jw'&Ob\u0012&";
        f7003[37] = "nfLp#Ir|N,9]b\u007f\u0005\u0192";
        f7003[38] = ":\u001dTD J:\u001dC\u0018,E VC\u0006,P''\u0011Xt\u0014";
        f7003[39] = ";\t`BO\u0003;\tw\u001eC\f!Bw\u0000C\u0019&3'Y\u0011X";
        f7003[40] = "*>GL\u0016d6$E\u0010\fp&'\u000e\u0001\bx \"TL\u0005a,bA\u0001\u0007t6?O\u0010\u0017? \"T\u000b\u0010hk\u0005m\u000b\u001cx+\tN\u0016\re<";
        f7003[41] = "(wq\"T+\u001eRq\"Cw\u0012]kiCi\u0012Hl\u0018\u00126@\u0003$";
        f7003[42] = "B_V$\u0004$B_Ax\b+X\u0014Af\b>_e\u001a;Yt";
        f7003[43] = """
                    -	\u001d\u007f"E-	
                    #.J7B
                    =._03^ey""";
        f7003[44] = "]\u00110da\u0007V\u001e!+\u0000\t]\u0015%q";
        f7003[45] = "L\ru)h@F\t=*\u0016_K\u0010/5zm\u001bQpb\u0016\u0001L\f$6t@M\u0011(R";
        f7003[46] = "c^ C S\"\r4G\u001cV7\u0018+\u001fpd`_pB%35X(\n'\\*\u0019{D\u001c";
        f7003[47] = "\u0001mu\u0010+_@>a\u0014\u0017ZU+~L{h\u0004g/\u0011,?D.rS-YQ+b\u001b\u0017";
        f7003[48] = "\u0000\u0011V[*^\fNCU\u001aBQAV\bM\u0015\t\u0014\u000e_\u001a\u001c\rH\rTh\u0010R]\u0003";
        f7003[49] = "I#F\u0010^|\\g\u0016G2dNf\u001b\u0019^V\u0012'AF2:Q$\u0018CB~\u001d|\u0001~";
        f7003[50] = "'%\u0010,3\u001fp-\be\\K*'\u00059\u000b\u0019qp]h\\N;*\u0006ndF$8\u0013";
        f7003[51] = ".n;Y\"mjo!BM59x'U!\u0007m:{\tsP;8$@v?$yw\u000eM?hg5\t\" )4{2\"l7v|]=-d8G]q3&?(B0`h\u0004";
        f7003[52] = "j\u0004d\u0010l\f+@9\b\u001cR:\u00029\u0016p`nFcO'7l\u00149\u001axU-\u0015$\u0016\u001c";
        f7003[53] = "#\\U+/+\"\f_=\u0011s \u001fD>}Ap_\u0015g\u0011/)\f@$xp.\\\u001cY*ds\u0000\u0019)n(+\u0019$3oh\"[C>,g1c\u001f+/up\u0013[gwlMXVgr+=\u001c\u001a?k\u0016v\u0011\u001a:,f2]B#\u0011";
        f7003[54] = "\u0000\u000e9\u001c\u001bIL\u0016/\u0013y[]\u00119\u0014.\f\u0002LbxGZ^\u0007&\u001d\u0004R@\u0004";
        f7003[55] = "\u000fma,A?\u0015sv0'7\t}j0p`S*7\\He\u000bb53W$X,";
        f7003[56] = "\u000f~jCl?Xvr\n\u0003k\u0002|\u007fVT9Y+'\u0001\u0003n\u0013q|\u0001;f\fci";
        f7003[57] = "Yo|I5R@dv b9\u0004w.A|\u0002E3sY\f\u0003\u0005tm\u001fpS@qb wVWq/PqGIa\u0013";
        f7003[58] = "Fa\u0007/\u0005\u001d\u001c,\u0002g\u007f\u001b^+\u0018\u001f\u0010\\D#_p\u000f\u001d\u0017mdpC\u0003Uj\u000bo\u0002P\u001bQ";
        f7003[59] = "_+B\u0001VG\u0000,\u0012]+K\u000b3M\u0002GyXw\u001c[+\u0015\f/F\u0001IT\r2Je";
        f7003[60] = "%2\u0007vKcl)\u0014 ({y(\u001fxDI.jE&\u0015\u001e.h\u0006a\u0017b~-\u0003n(";
        f7003[61] = "\u001e|\u001ejp\u0016_8Cr\u0000HNzCllz\u001a>\u001b4<-\u001e|\u001ejp\u0016_8Cr\u0000";
        f7003[62] = "\u001dl$\tU.\u001131\u0007e2L<$Z2e\u0014i{\u000bel\u00105\u007f\u0006\u0017`O q";
        f7003[63] = "/m`ZdNn>t^XK{+k\u00064y,l0Xh.ykh\u0013cAf*;]X";
        f7003[64] = "y\u0007?i\u0007\u001a`\f5\u0000Wq(\u0014/?Y\u0011y\u001599>@h\u001aog^\u0011i\fi\u0000";
        f7003[65] = "q}G\u0015))v:\nW\u0013I\tn\u0019[\u007fsxqLBz\u0015dm\u0007Gud{8\u001eB\u0013lli\u0005\u0017,i7;\u001d+))p}HWylurwLa.1~\u0012B+mo\u0003";
        f7003[66] = "\u001e=KaG\r\\'Z4-RIX\u0016\u007fIS@$Zg_\\";
        f7003[67] = "c\u0017Ga\u001dF9ZB)g^kW$j\u0015\u0005a\u001aT.Y]x'\u001f#YX?W[o\u0001A\u0002\u001cVo\u0004\u0006rX\u001a7\u001d;";
        f7003[68] = "E\u0015AAVz\u001a\u0012\u0011\u001d+v\u0011\rNBGDBI\u0013\u0014+}\f\u0017AEO|\u001fIQ%\u0011/\u0005\u000f\u0011YAj\u0000\u0000.";
        f7003[69] = "68'\u001bh'lb'\u0005\u001a|Se=\u0012~`:::B\"\u001dh69\u0016~\u007f)7$\u001a\u001ap=,5\u001bkoh50}";
        f7003[70] = "~\u001a%J\u0017\u001e?^xRg@.\u001cxL\u000brzX\"\u0015[%x\nx@\u0003G9\u000beLg";
        f7003[71] = "\u0010lp\u000bUZ\nrg\u00173R\u0016|{\u0017d\u0005L+${\\\u0000\u0014c$\u0014CAG-";
        f7003[72] = "L\u0004\u001f?1\u0013\r@B'AM\u001c\u0002B9-\u007fHF\u001anx(@F\u001c=(F\u0001F\u001b'A\u0015\u000bCC.zTO\u001e[^";
        f7003[73] = "DA tjyI\u0002/gR{CC>|>I\u0012\u000fa+c\u001eEO>|i&MP,iR$\u0012F $.tWC/\u001b";
        f7003[74] = "\u001aAQ?:\u001d\u0015GT3A\u0503%AZ2*\u0007G\u0000[/&c";
        f7003[75] = "`\u0003\u000f\u0011wMo\u0005\n\u001d\f\u026a_\u0003\u0004\u001cgW=B\u0005\u0001k3";
        f7003[76] = ">H\u0018&x\u0014i@\u0000o\u0017@3J\r3@\u0012h\u001dUc\u0017E\"G\u000ed/M=U\u001b";
        f7003[77] = "Ne\u0004{\u007fZWn\u000e\u0012\u01241A;\b`}^^z[.F^\u0012d\u0019))AS7W\u0012)\rMuP}6L\u001e;kx8OA?\fu{@R\u0007P`xR\u0013w\u0014, K.>\u000f}\"LGa\b-~1\u0014;\u0012lyMD~\u0017cF\nDg\u0000v$KEz\f\u0012}C\u0010dVb9\u000fH}k";
        f7003[78] = "#\u0005\"N\u000f\u000b9\u001b5Ri\u0003%\u0015)R>T\u007fBu>\u0006Q'\nvQ\u0019\u0010tD";
        f7003[79] = "\rS n0\u0002L\u00004j\f\u0007Y\u0015+2`5\u000eRpl3b[U('7\rD\u0014{i\f";
        f7003[80] = "XUrUG\\BKeI!T^EyIv\u0003\u0004\u0012!%N\u0006\\Z&JQG\u000f\u0014";
        f7003[81] = "6ao\u0014\u0007\u001b8+,Jz\u00100~0@-Gj(o,\u001d\fj+)I\u0013F)u";
        f7003[82] = "\u001f\u0007f8\u0001\u001b^C; qEO\u0001;>\u001dw\u001bEciM \u001f\u0007f8\u0001\u001b^C; q";
        f7003[83] = "foL^\n;j0YP:'7?L\rmpoj\u0013]:yk6\u0017QHu4#\u0019";
        f7003[84] = "e-\u0014\u0006v}:*DZ\u000bq15\u001b\u0005gCexFY;\u00141'\u000b\u000eme.r\u0012\u000b\u000b";
        f7003[85] = "Da\u0000\u0007\u001a~\u000el\u001e\u0019uaRw \u0017\u0010cYp\r\u0011\u0013u?m\u0011N\u0017v\u0005f\b\u000f\u000e\u000e";
        f7003[86] = "'r\u007fH}Ixu/\u0014\u0000EsjpKlw /)\u0016\u0000Nnp\u007fLdO}.o,jA$mnV`Eln\u0010";
        f7003[87] = "bQ\r\u0001-\u0001=V]]P\r6I\u0002\u0002<?g\bY_mh5E\u0004\n0\f4VZ\u001aP\u0007gV\u0010^?\u0018&\u0005^e";
        f7003[88] = "=\"ok$\u0019t9|=G\u0001a8we+36z-:{df}*l+\u0019s9z;G";
        f7003[89] = """
                    \u001bKk\u0010j\u0013\f^c\u000f\u0017\u04cftYlIe
                    
                    IsLy""";
        f7003[90] = "S\u0004iuL\u0015J\u000fc\u001c\u023d~^\bvp\u0013\u000fA]ouuGW\tba\u001c\u0018PY>\u001cOBJ\u00189`\u001f\u0007O\u0017\u0006'\u001f\u001eX\u0002df\u001e\u0003Tf=nK\u001d\u000e\u0016y\"\u0013\u00043";
        f7003[91] = "\u000bayGC\u0007Q,|\u000f9\u0014\u000e6}\r9\u0015V2hLV\n\u0017a&wVF\t#!\u0018I\u0007Zm\u001a";
        f7003[92] = "\u0000<\u0017?\u001ac\u001fi\u000e:|w\u0000.\u00074\u0010ETj]i|\u007f\u0003\"\u000b5\r`V;\u000eS\u0013.\u000e \\<\fo]ng";
        f7003[93] = "\tzxk)5\u001c\u007fh#\u00136\u0018\u007ftt\u007f\u0004I3$*\"S\ff~a/l\t=,y\u0013*\u0010if/,/K;~\u0013y-\u000bl,ttn\u0004\u007f\u0014";
        f7003[94] = "z%48J\u001ec.>Q\u0106u#}0jO\u0015b.$nsL~(?,\u001a\u0013yxcQIIc9d-\u0019\ff6[j\u0019\u0015q#9+\u0018\b}G`#M\u0016'7$o\u0015\u000f\u001a";
        f7003[95] = "IL)~>t\u001eD17Q DN<k\u0006r\u001f\u0019d>Q%UC?<i-JQ*";
        f7003[96] = "~w\u001d\u0018!rr(\b\u0016\u0011e#6\u0019@}Wwr@\u0019*\u0000\u007frGDxn>r@^\u0011";
        f7003[97] = "jwW\u000fVj)\u007fI\f-j9dU\u0013AXd$\rK-n(bZ\u001d\u00172+yUt";
        f7003[98] = "LO4 \u0013IA\f;3+KKM*(Gy\u001b\fss+\u0014\u001aH4pWD_M;O";
        f7003[99] = """
                    o!t\u000e\u0013Wd85\u0017k\bd ,\u000b\u0007:2dsQTmd2<\u0000\r\u001c{g%\u0005k
                    t3<
                    
\u0010j$ l""";
        f7003[100] = "\u001dfS\u000bI\u001e^nM\b2\u001eNuQ\u0017^,\u00132\u000bH2FY4P\u0000\t\u0007\u001diHp\u0003\u001d[`R\rJ\u0006H61";
        f7003[101] = "O:\u001feo8\u0015w\u001a-\u0015 Ol|ng{M7\f*+#T\nG'+&\u0013z\u0003ks?.1\u000ekvx^uB3oE";
        f7003[102] = "\u001eiE\u001b.\u0000An\u0015GS\fJqJ\u0018?>\u001a3\u0017NS\u000b^jW\u00163\u0018BtF\u007fiU^s\u0015\u00039\u0010[|*";
        f7003[103] = ":tFYw\u0019?z\u0005\u001b\u000f\u0410Y&\u0018\tk\u00070y\u001fY7z3a\u0002\t7\u001d>\"\r\u001a\u000fA+!\u001f[\u007f\u0005gy\u0006f";
        f7003[104] = "}QSa\u0002B|\u0001Yw<\u001a~\u0012BtP(.R\u0013,<DaPA.L\u0000-\bX\u0013\u0007\r-\r\u001fcCAu\u0014\"(NApSRl\u0002\u0019in";
        f7003[105] = "{\u0018wV+ua\u0006`JM}}\b|J\u001a*'_\"&\"/\u007f\u0017#I=n,Y";
        f7003[106] = "9s1\u0000m\u001f#m&\u001c\u000b\u0017?c:\u001c\\@e4cpdE=|e\u001f{\u0004n2";
        f7003[107] = "s-e\u000e\u0003mu,t\u0018f5z:y\u0015\n\u0007(}\"Mfj+?gM\u001a:n:hr";
        f7003[108] = """
                     ]]^\u0005o\u000f\u0011EH
                     \r\u001d\u0000B^\rZJ^\u0015\u0006aq\u0001\u0018\u0014\u0007
                     s\u0003\u000e]""";
        f7003[109] = "N\u001b\\Q\u00076\u000f_\u0001Iwh\u001e\u001d\u0001W\u001bZJY[\u000eO\rH\u000b\u0001[\u0013o\t\n\u001cWw";
        f7003[110] = "rhl/\u001a\u0004*`\u007f*a\u0014v=b>6@,o<oa\u0014g6i2\u0005\u0015thy";
        f7003[111] = "r)2V72m|+SQ&r;\"]=\u0014&\u007fx\u0007Q.q7.\\ 1$.+:>\u007f|5yU!>/{B";
        f7003[112] = "%wd2rs)(q<Bot'da\u00158,r;<B1(.?=0=w;1";
        f7003[113] = "(|Rz!Wt\u007fIuH\n3lIs!\tI;Bu#\t+zCh/m";
        f7003[114] = "@YNz\u0001y\\]\u0015`q{GZ\u0014j&(\u0017\u000fO\u0006\u001fe@X\u0010b\u001ev\u001eH";
    }
    
    public static Field m196(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m197(Class clazz, String s, Class clazz2) {
        Field m196 = m196(clazz, s, clazz2);
        if (m196 != null) {
            return m196;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m197 = m197(interfaces[i], s, clazz2);
                if (m197 != null) {
                    return m197;
                }
            }
        }
        return null;
    }
    
    public static Method m199(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
        for (Method method : clazz.getDeclaredMethods()) {
            Label_0097: {
                if (method.getName().equals(anObject) && method.getReturnType() == clazz2) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
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
    
    public static Method m200(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m199 = m199(clazz, s, clazz2, n, array);
        if (m199 != null) {
            return m199;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m200 = m200(interfaces[i], s, clazz2, n, array);
                if (m200 != null) {
                    return m200;
                }
            }
        }
        return null;
    }
    
    public static CallSite m120(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Util418.m120:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
}
