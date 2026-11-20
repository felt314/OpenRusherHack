// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.MethodHandles;
import net.minecraft.block.AbstractBlock.AbstractBlockState;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.hit.HitResult;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.block.ShapeContext;
import net.minecraft.world.chunk.WorldChunk;
import net.minecraft.util.math.Position;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.math.Box;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.Direction;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.rusherhack.client.api.accessors.entity.IMixinEntity;
import org.rusherhack.client.api.utils.RotationUtils;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;

public final class Class220 implements Globals
{
    private static final long f4109;
    private static final Object[] f4110;
    private static final String[] f4111;
    
    public static boolean m8437(final BlockPos blockPos) {
        final long n = Class220.f4109 ^ 0x6D9F02DF05E0L;
        final int m9155 = Class253.m9155();
        final float n2 = m8450(blockPos) + 1.74f;
        final Vec3d eyePos = ((Entity)Globals.mc.player).getEyePos();
        final float[] rotations = RotationUtils.getRotations(Vec3d.ofCenter((Vec3i)blockPos));
        final int n3 = m9155;
        final RaycastContext raycastContext = new RaycastContext(eyePos, eyePos.add(((IMixinEntity)Globals.mc.player).invokeCalculateViewVector(rotations[1], rotations[0]).multiply((double)n2)), RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, (Entity)Globals.mc.player);
        boolean b = false;
        try {
            final boolean equals;
            b = (equals = ((Vec3i)blockPos).equals((Object)m8449(raycastContext, null).getBlockPos()));
            if (n3 == 0) {
                return equals;
            }
            if (!b) {
                return true;
            }
            return false;
        }
        catch (final MatchException ex) {
            ex.printStackTrace();
        }
        try {
            if (!b) {
                return true;
            }
        }
        catch (final MatchException ex2) {
            ex2.printStackTrace();
        }
        return false;
    }
    
    public static Vec3d m8439(final BlockPos blockPos, @Nullable final Direction direction) {
        return null;
    }
    
    private static HitResult.Type m8441(final Vec3d p0, final Vec3d p1, final BlockPos p2, final WorldChunk p3, final boolean p4, final ShapeContext p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          74898569510236
        //     6: lxor           
        //     7: lstore          6
        //     9: aload_0        
        //    10: aload_3        
        //    11: astore_0       
        //    12: astore_3       
        //    13: invokestatic    org/rusherhack/Class253.m9154:()I
        //    16: aload_0        
        //    17: aload_2        
        //    18: invokevirtual   net.minecraft.world.chunk.WorldChunk.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //    21: astore_0       
        //    22: istore          8
        //    24: iload           4
        //    26: iload           8
        //    28: ifne            85
        //    31: ifeq            74
        //    34: goto            41
        //    37: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    40: athrow         
        //    41: aload_0        
        //    42: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getBlock:()Lnet.minecraft.block.Block;
        //    45: invokevirtual   net.minecraft.block.Block.getBlastResistance:()F
        //    48: ldc_w           1200.0
        //    51: fcmpg          
        //    52: iload           8
        //    54: ifne            85
        //    57: goto            64
        //    60: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    63: athrow         
        //    64: iflt            88
        //    67: goto            74
        //    70: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    73: athrow         
        //    74: aload_0        
        //    75: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.isAir:()Z
        //    78: goto            85
        //    81: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    84: athrow         
        //    85: ifeq            94
        //    88: aconst_null    
        //    89: areturn        
        //    90: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    93: athrow         
        //    94: getstatic       net.minecraft.world.RaycastContext.ShapeType.COLLIDER:Lnet.minecraft.world.RaycastContext.ShapeType;
        //    97: aload_0        
        //    98: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   101: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   104: aload_2        
        //   105: aload           5
        //   107: invokevirtual   net.minecraft.world.RaycastContext.ShapeType.get:(Lnet.minecraft.block.BlockState;Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.block.ShapeContext;)Lnet.minecraft.util.shape.VoxelShape;
        //   110: astore          4
        //   112: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   115: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   118: aload_3        
        //   119: aload_1        
        //   120: aload_2        
        //   121: aload           4
        //   123: aload_0        
        //   124: invokeinterface net.minecraft.world.BlockView.raycastBlock:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.util.shape.VoxelShape;Lnet.minecraft.block.BlockState;)Lnet.minecraft.util.hit.BlockHitResult;
        //   129: dup            
        //   130: astore_1       
        //   131: iload           8
        //   133: ifne            153
        //   136: ifnonnull       152
        //   139: goto            146
        //   142: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   145: athrow         
        //   146: aconst_null    
        //   147: areturn        
        //   148: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   151: athrow         
        //   152: aload_1        
        //   153: invokevirtual   net.minecraft.util.hit.BlockHitResult.getType:()Lnet.minecraft.util.hit.HitResult.Type;
        //   156: areturn        
        //    StackMapTable: 00 10 FF 00 25 00 08 07 01 1D 07 00 34 07 00 74 07 00 34 01 07 01 1F 04 01 00 01 07 00 13 03 52 07 00 13 43 01 45 07 00 13 03 46 07 00 13 43 01 02 41 07 00 13 03 FF 00 2F 00 08 07 01 1D 07 00 64 07 00 74 07 00 34 07 00 95 07 01 1F 04 01 00 01 07 00 13 03 41 07 00 13 03 40 07 00 64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  24     34     37     41     Ljava/lang/MatchException;
        //  31     57     60     64     Ljava/lang/MatchException;
        //  41     67     70     74     Ljava/lang/MatchException;
        //  64     78     81     85     Ljava/lang/MatchException;
        //  85     90     90     94     Ljava/lang/MatchException;
        //  131    139    142    146    Ljava/lang/MatchException;
        //  136    148    148    152    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
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
    
    public static HitResult.Type m8442(final Vec3d p0, final Vec3d p1, final Entity p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          47123342805771
        //     6: lxor           
        //     7: lstore          4
        //     9: invokestatic    org/rusherhack/Class253.m9154:()I
        //    12: istore          6
        //    14: aload_0        
        //    15: astore          22
        //    17: aload           22
        //    19: aload_1        
        //    20: invokevirtual   net.minecraft.util.math.Vec3d.equals:(Ljava/lang/Object;)Z
        //    23: ifeq            34
        //    26: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //    29: areturn        
        //    30: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    33: athrow         
        //    34: ldc2_w          -1.0E-7
        //    37: aload_1        
        //    38: getfield        net.minecraft.util.math.Vec3d.x:D
        //    41: aload           22
        //    43: getfield        net.minecraft.util.math.Vec3d.x:D
        //    46: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //    49: dstore          7
        //    51: ldc2_w          -1.0E-7
        //    54: aload_1        
        //    55: getfield        net.minecraft.util.math.Vec3d.y:D
        //    58: aload           22
        //    60: getfield        net.minecraft.util.math.Vec3d.y:D
        //    63: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //    66: dstore          9
        //    68: ldc2_w          -1.0E-7
        //    71: aload_1        
        //    72: getfield        net.minecraft.util.math.Vec3d.z:D
        //    75: aload           22
        //    77: getfield        net.minecraft.util.math.Vec3d.z:D
        //    80: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //    83: dstore          11
        //    85: ldc2_w          -1.0E-7
        //    88: aload           22
        //    90: getfield        net.minecraft.util.math.Vec3d.x:D
        //    93: aload_1        
        //    94: getfield        net.minecraft.util.math.Vec3d.x:D
        //    97: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //   100: dstore          13
        //   102: ldc2_w          -1.0E-7
        //   105: aload           22
        //   107: getfield        net.minecraft.util.math.Vec3d.y:D
        //   110: aload_1        
        //   111: getfield        net.minecraft.util.math.Vec3d.y:D
        //   114: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //   117: dstore          15
        //   119: ldc2_w          -1.0E-7
        //   122: aload           22
        //   124: getfield        net.minecraft.util.math.Vec3d.z:D
        //   127: aload_1        
        //   128: getfield        net.minecraft.util.math.Vec3d.z:D
        //   131: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //   134: dstore          17
        //   136: dload           13
        //   138: invokestatic    net.minecraft.util.math.MathHelper.floor:(D)I
        //   141: istore          19
        //   143: dload           15
        //   145: invokestatic    net.minecraft.util.math.MathHelper.floor:(D)I
        //   148: istore          20
        //   150: dload           17
        //   152: invokestatic    net.minecraft.util.math.MathHelper.floor:(D)I
        //   155: istore          21
        //   157: new             Lnet.minecraft.util.math.BlockPos.Mutable;
        //   160: dup            
        //   161: iload           19
        //   163: iload           20
        //   165: iload           21
        //   167: invokespecial   net.minecraft.util.math.BlockPos.Mutable.<init>:(III)V
        //   170: astore_0       
        //   171: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   174: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   177: aload_0        
        //   178: invokevirtual   net.minecraft.util.math.Vec3i.getX:()I
        //   181: invokestatic    net.minecraft.util.math.ChunkSectionPos.getSectionCoord:(I)I
        //   184: aload_0        
        //   185: invokevirtual   net.minecraft.util.math.Vec3i.getZ:()I
        //   188: invokestatic    net.minecraft.util.math.ChunkSectionPos.getSectionCoord:(I)I
        //   191: getstatic       net.minecraft.world.chunk.ChunkStatus.FULL:Lnet.minecraft.world.chunk.ChunkStatus;
        //   194: iconst_0       
        //   195: invokevirtual   net.minecraft.world.World.getChunk:(IILnet.minecraft.world.chunk.ChunkStatus;Z)Lnet.minecraft.world.chunk.Chunk;
        //   198: checkcast       Lnet.minecraft.world.chunk.WorldChunk;
        //   201: dup            
        //   202: astore          23
        //   204: ifnonnull       215
        //   207: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //   210: areturn        
        //   211: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   214: athrow         
        //   215: aload_2        
        //   216: invokestatic    net.minecraft.block.ShapeContext.of:(Lnet.minecraft.entity.Entity;)Lnet.minecraft.block.ShapeContext;
        //   219: astore_2       
        //   220: aload           22
        //   222: aload_1        
        //   223: aload_0        
        //   224: aload           23
        //   226: iload_3        
        //   227: aload_2        
        //   228: invokestatic    org/rusherhack/Class220.m8441:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.world.chunk.WorldChunk;ZLnet.minecraft.block.ShapeContext;)Lnet.minecraft.util.hit.HitResult.Type;
        //   231: dup            
        //   232: astore          24
        //   234: iload           6
        //   236: ifne            251
        //   239: ifnull          252
        //   242: goto            249
        //   245: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   248: athrow         
        //   249: aload           24
        //   251: areturn        
        //   252: dload           7
        //   254: dload           13
        //   256: dsub           
        //   257: dstore          7
        //   259: dload           9
        //   261: dload           15
        //   263: dsub           
        //   264: dstore          9
        //   266: dload           11
        //   268: dload           17
        //   270: dsub           
        //   271: dstore          11
        //   273: dload           7
        //   275: invokestatic    net.minecraft.util.math.MathHelper.sign:(D)I
        //   278: istore          24
        //   280: dload           9
        //   282: invokestatic    net.minecraft.util.math.MathHelper.sign:(D)I
        //   285: istore          25
        //   287: dload           11
        //   289: invokestatic    net.minecraft.util.math.MathHelper.sign:(D)I
        //   292: istore          26
        //   294: iload           24
        //   296: iload           6
        //   298: ifne            323
        //   301: ifne            321
        //   304: goto            311
        //   307: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   310: athrow         
        //   311: ldc2_w          1.7976931348623157E308
        //   314: goto            327
        //   317: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   320: athrow         
        //   321: iload           24
        //   323: i2d            
        //   324: dload           7
        //   326: ddiv           
        //   327: dstore          27
        //   329: iload           25
        //   331: iload           6
        //   333: ifne            358
        //   336: ifne            356
        //   339: goto            346
        //   342: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   345: athrow         
        //   346: ldc2_w          1.7976931348623157E308
        //   349: goto            362
        //   352: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   355: athrow         
        //   356: iload           25
        //   358: i2d            
        //   359: dload           9
        //   361: ddiv           
        //   362: dstore          7
        //   364: iload           26
        //   366: iload           6
        //   368: ifne            393
        //   371: ifne            391
        //   374: goto            381
        //   377: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   380: athrow         
        //   381: ldc2_w          1.7976931348623157E308
        //   384: goto            397
        //   387: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   390: athrow         
        //   391: iload           26
        //   393: i2d            
        //   394: dload           11
        //   396: ddiv           
        //   397: dstore          9
        //   399: dload           27
        //   401: iload           24
        //   403: ifle            420
        //   406: dconst_1       
        //   407: dload           13
        //   409: invokestatic    net.minecraft.util.math.MathHelper.fractionalPart:(D)D
        //   412: dsub           
        //   413: goto            425
        //   416: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   419: athrow         
        //   420: dload           13
        //   422: invokestatic    net.minecraft.util.math.MathHelper.fractionalPart:(D)D
        //   425: dmul           
        //   426: dstore          11
        //   428: dload           7
        //   430: iload           25
        //   432: ifle            449
        //   435: dconst_1       
        //   436: dload           15
        //   438: invokestatic    net.minecraft.util.math.MathHelper.fractionalPart:(D)D
        //   441: dsub           
        //   442: goto            454
        //   445: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   448: athrow         
        //   449: dload           15
        //   451: invokestatic    net.minecraft.util.math.MathHelper.fractionalPart:(D)D
        //   454: dmul           
        //   455: dstore          13
        //   457: dload           9
        //   459: iload           26
        //   461: ifle            478
        //   464: dconst_1       
        //   465: dload           17
        //   467: invokestatic    net.minecraft.util.math.MathHelper.fractionalPart:(D)D
        //   470: dsub           
        //   471: goto            483
        //   474: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   477: athrow         
        //   478: dload           17
        //   480: invokestatic    net.minecraft.util.math.MathHelper.fractionalPart:(D)D
        //   483: dmul           
        //   484: dstore          15
        //   486: dload           11
        //   488: dconst_1       
        //   489: dcmpl          
        //   490: ifle            546
        //   493: dload           13
        //   495: dconst_1       
        //   496: dcmpl          
        //   497: iload           6
        //   499: ifne            551
        //   502: ifle            546
        //   505: goto            512
        //   508: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   511: athrow         
        //   512: dload           15
        //   514: dconst_1       
        //   515: dcmpl          
        //   516: iload           6
        //   518: ifne            551
        //   521: goto            528
        //   524: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   527: athrow         
        //   528: ifle            546
        //   531: goto            538
        //   534: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   537: athrow         
        //   538: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //   541: areturn        
        //   542: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   545: athrow         
        //   546: dload           11
        //   548: dload           13
        //   550: dcmpg          
        //   551: iload           6
        //   553: ifne            634
        //   556: ifge            629
        //   559: goto            566
        //   562: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   565: athrow         
        //   566: dload           11
        //   568: dload           15
        //   570: dcmpg          
        //   571: iload           6
        //   573: ifne            616
        //   576: goto            583
        //   579: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   582: athrow         
        //   583: ifge            611
        //   586: goto            593
        //   589: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   592: athrow         
        //   593: iload           19
        //   595: iload           24
        //   597: iadd           
        //   598: istore          19
        //   600: dload           11
        //   602: dload           27
        //   604: dadd           
        //   605: dstore          11
        //   607: aload_0        
        //   608: goto            682
        //   611: iload           21
        //   613: iload           26
        //   615: iadd           
        //   616: istore          21
        //   618: dload           15
        //   620: dload           9
        //   622: dadd           
        //   623: dstore          15
        //   625: aload_0        
        //   626: goto            682
        //   629: dload           13
        //   631: dload           15
        //   633: dcmpg          
        //   634: iload           6
        //   636: ifne            672
        //   639: ifge            667
        //   642: goto            649
        //   645: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   648: athrow         
        //   649: iload           20
        //   651: iload           25
        //   653: iadd           
        //   654: istore          20
        //   656: dload           13
        //   658: dload           7
        //   660: dadd           
        //   661: dstore          13
        //   663: aload_0        
        //   664: goto            682
        //   667: iload           21
        //   669: iload           26
        //   671: iadd           
        //   672: istore          21
        //   674: dload           15
        //   676: dload           9
        //   678: dadd           
        //   679: dstore          15
        //   681: aload_0        
        //   682: iload           19
        //   684: iload           20
        //   686: iload           21
        //   688: invokevirtual   net.minecraft.util.math.BlockPos.Mutable.set:(III)Lnet.minecraft.util.math.BlockPos.Mutable;
        //   691: pop            
        //   692: aload           23
        //   694: iload           6
        //   696: ifne            790
        //   699: invokevirtual   net.minecraft.world.chunk.Chunk.getPos:()Lnet.minecraft.util.math.ChunkPos;
        //   702: getfield        net.minecraft.util.math.ChunkPos.x:I
        //   705: aload_0        
        //   706: invokevirtual   net.minecraft.util.math.Vec3i.getX:()I
        //   709: iconst_4       
        //   710: ishr           
        //   711: if_icmpne       757
        //   714: goto            721
        //   717: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   720: athrow         
        //   721: aload           23
        //   723: iload           6
        //   725: ifne            790
        //   728: goto            735
        //   731: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   734: athrow         
        //   735: invokevirtual   net.minecraft.world.chunk.Chunk.getPos:()Lnet.minecraft.util.math.ChunkPos;
        //   738: getfield        net.minecraft.util.math.ChunkPos.z:I
        //   741: aload_0        
        //   742: invokevirtual   net.minecraft.util.math.Vec3i.getZ:()I
        //   745: iconst_4       
        //   746: ishr           
        //   747: if_icmpeq       801
        //   750: goto            757
        //   753: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   756: athrow         
        //   757: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   760: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   763: aload_0        
        //   764: invokevirtual   net.minecraft.util.math.Vec3i.getX:()I
        //   767: invokestatic    net.minecraft.util.math.ChunkSectionPos.getSectionCoord:(I)I
        //   770: aload_0        
        //   771: invokevirtual   net.minecraft.util.math.Vec3i.getZ:()I
        //   774: invokestatic    net.minecraft.util.math.ChunkSectionPos.getSectionCoord:(I)I
        //   777: getstatic       net.minecraft.world.chunk.ChunkStatus.FULL:Lnet.minecraft.world.chunk.ChunkStatus;
        //   780: iconst_0       
        //   781: invokevirtual   net.minecraft.world.World.getChunk:(IILnet.minecraft.world.chunk.ChunkStatus;Z)Lnet.minecraft.world.chunk.Chunk;
        //   784: checkcast       Lnet.minecraft.world.chunk.WorldChunk;
        //   787: dup            
        //   788: astore          23
        //   790: ifnonnull       801
        //   793: getstatic       net.minecraft.util.hit.HitResult.Type.MISS:Lnet.minecraft.util.hit.HitResult.Type;
        //   796: areturn        
        //   797: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   800: athrow         
        //   801: aload           22
        //   803: aload_1        
        //   804: aload_0        
        //   805: aload           23
        //   807: iload_3        
        //   808: aload_2        
        //   809: invokestatic    org/rusherhack/Class220.m8441:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.BlockPos;Lnet.minecraft.world.chunk.WorldChunk;ZLnet.minecraft.block.ShapeContext;)Lnet.minecraft.util.hit.HitResult.Type;
        //   812: dup            
        //   813: astore          17
        //   815: ifnull          486
        //   818: aload           17
        //   820: iload           6
        //   822: ifne            815
        //   825: areturn        
        //    StackMapTable: 00 46 FF 00 1E 00 16 07 00 34 07 00 34 07 00 2E 01 04 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 34 00 01 07 00 13 03 FF 00 B0 00 11 07 01 38 07 00 34 07 00 2E 01 04 01 03 03 03 03 03 03 01 01 01 07 00 34 07 00 FB 00 01 07 00 13 03 FF 00 1D 00 12 07 01 38 07 00 34 07 01 1F 01 04 01 03 03 03 03 03 03 01 01 01 07 00 34 07 00 FB 07 01 26 00 01 07 00 13 03 41 07 01 26 00 FF 00 36 00 14 07 01 38 07 00 34 07 01 1F 01 04 01 03 03 03 03 03 03 01 01 01 07 00 34 07 00 FB 01 01 01 00 01 07 00 13 03 45 07 00 13 03 41 01 43 03 FF 00 0E 00 15 07 01 38 07 00 34 07 01 1F 01 04 01 03 03 03 03 03 03 01 01 01 07 00 34 07 00 FB 01 01 01 03 00 01 07 00 13 03 45 07 00 13 03 41 01 43 03 4E 07 00 13 03 45 07 00 13 03 41 01 43 03 52 07 00 13 43 03 FF 00 04 00 15 07 01 38 07 00 34 07 01 1F 01 04 01 03 03 03 03 03 03 01 01 01 07 00 34 07 00 FB 01 01 01 03 00 02 03 03 53 07 00 13 43 03 FF 00 04 00 15 07 01 38 07 00 34 07 01 1F 01 04 01 03 03 03 03 03 03 01 01 01 07 00 34 07 00 FB 01 01 01 03 00 02 03 03 53 07 00 13 43 03 FF 00 04 00 15 07 01 38 07 00 34 07 01 1F 01 04 01 03 03 03 03 03 03 01 01 01 07 00 34 07 00 FB 01 01 01 03 00 02 03 03 FF 00 02 00 16 07 01 38 07 00 34 07 01 1F 01 04 01 03 03 03 03 03 00 00 01 01 01 07 00 34 07 00 FB 01 01 01 03 00 00 55 07 00 13 03 4B 07 00 13 43 01 45 07 00 13 03 43 07 00 13 03 44 01 4A 07 00 13 03 4C 07 00 13 43 01 45 07 00 13 03 11 44 01 0C 44 01 4A 07 00 13 03 11 44 01 49 07 01 38 62 07 00 13 03 49 07 00 13 43 07 00 FB 51 07 00 13 03 60 07 00 FB 46 07 00 13 03 FF 00 0D 00 16 07 01 38 07 00 34 07 01 1F 01 04 01 03 03 03 03 03 07 01 26 00 01 01 01 07 00 34 07 00 FB 01 01 01 03 00 01 07 01 26
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  17     30     30     34     Ljava/lang/MatchException;
        //  204    211    211    215    Ljava/lang/MatchException;
        //  234    242    245    249    Ljava/lang/MatchException;
        //  294    304    307    311    Ljava/lang/MatchException;
        //  301    317    317    321    Ljava/lang/MatchException;
        //  329    339    342    346    Ljava/lang/MatchException;
        //  336    352    352    356    Ljava/lang/MatchException;
        //  364    374    377    381    Ljava/lang/MatchException;
        //  371    387    387    391    Ljava/lang/MatchException;
        //  399    416    416    420    Ljava/lang/MatchException;
        //  428    445    445    449    Ljava/lang/MatchException;
        //  457    474    474    478    Ljava/lang/MatchException;
        //  493    505    508    512    Ljava/lang/MatchException;
        //  502    521    524    528    Ljava/lang/MatchException;
        //  512    531    534    538    Ljava/lang/MatchException;
        //  528    542    542    546    Ljava/lang/MatchException;
        //  551    559    562    566    Ljava/lang/MatchException;
        //  556    576    579    583    Ljava/lang/MatchException;
        //  566    586    589    593    Ljava/lang/MatchException;
        //  634    642    645    649    Ljava/lang/MatchException;
        //  682    714    717    721    Ljava/lang/MatchException;
        //  699    728    731    735    Ljava/lang/MatchException;
        //  721    750    753    757    Ljava/lang/MatchException;
        //  790    797    797    801    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0512:
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
    
    public static Vec3d m8443(final Entity p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          128833490879420
        //     6: lxor           
        //     7: lstore_2       
        //     8: aload_0        
        //     9: astore          5
        //    11: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    14: invokevirtual   net.minecraft.client.MinecraftClient.getRenderTickCounter:()Lnet.minecraft.client.render.RenderTickCounter;
        //    17: iconst_1       
        //    18: dup            
        //    19: dup            
        //    20: pop2           
        //    21: invokeinterface net.minecraft.client.render.RenderTickCounter.getTickDelta:(Z)F
        //    26: fstore_0       
        //    27: invokestatic    org/rusherhack/Class253.m9155:()I
        //    30: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    33: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //    36: fload_0        
        //    37: invokevirtual   net.minecraft.entity.Entity.getCameraPosVec:(F)Lnet.minecraft.util.math.Vec3d;
        //    40: astore          7
        //    42: istore          4
        //    44: aload           5
        //    46: dup            
        //    47: fload_0        
        //    48: invokestatic    org/rusherhack/client/api/utils/EntityUtils.interpolateEntityVec:(Lnet.minecraft.entity.Entity;F)Lnet.minecraft.util.math.Vec3d;
        //    51: astore_0       
        //    52: checkcast       Lorg/rusherhack/client/api/accessors/entity/IMixinEntity;
        //    55: invokeinterface org/rusherhack/client/api/accessors/entity/IMixinEntity.getDimensions:()Lnet.minecraft.entity.EntityDimensions;
        //    60: aload_0        
        //    61: invokevirtual   net.minecraft.entity.EntityDimensions.getBoxAt:(Lnet.minecraft.util.math.Vec3d;)Lnet.minecraft.util.math.Box;
        //    64: dup            
        //    65: astore_0       
        //    66: invokevirtual   net.minecraft.util.math.Box.getCenter:()Lnet.minecraft.util.math.Vec3d;
        //    69: astore          6
        //    71: aload_0        
        //    72: getfield        net.minecraft.util.math.Box.maxX:D
        //    75: aload_0        
        //    76: getfield        net.minecraft.util.math.Box.minX:D
        //    79: dsub           
        //    80: ldc2_w          2.0
        //    83: dmul           
        //    84: dconst_1       
        //    85: dup2_x2        
        //    86: dadd           
        //    87: ddiv           
        //    88: dstore          8
        //    90: aload_0        
        //    91: getfield        net.minecraft.util.math.Box.maxY:D
        //    94: aload_0        
        //    95: getfield        net.minecraft.util.math.Box.minY:D
        //    98: dsub           
        //    99: ldc2_w          2.0
        //   102: dmul           
        //   103: dconst_1       
        //   104: dup2_x2        
        //   105: dadd           
        //   106: ddiv           
        //   107: dstore          10
        //   109: aload_0        
        //   110: getfield        net.minecraft.util.math.Box.maxZ:D
        //   113: aload_0        
        //   114: getfield        net.minecraft.util.math.Box.minZ:D
        //   117: dsub           
        //   118: ldc2_w          2.0
        //   121: dmul           
        //   122: dconst_1       
        //   123: dup2_x2        
        //   124: dadd           
        //   125: ddiv           
        //   126: dstore          12
        //   128: dload           8
        //   130: dconst_0       
        //   131: dcmpg          
        //   132: iload           4
        //   134: ifeq            158
        //   137: iflt            199
        //   140: goto            147
        //   143: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   146: athrow         
        //   147: dload           10
        //   149: dconst_0       
        //   150: dcmpg          
        //   151: goto            158
        //   154: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   157: athrow         
        //   158: iload           4
        //   160: ifeq            196
        //   163: iflt            199
        //   166: goto            173
        //   169: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   172: athrow         
        //   173: dload           12
        //   175: dconst_0       
        //   176: iload           4
        //   178: ifeq            221
        //   181: goto            188
        //   184: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   187: athrow         
        //   188: dcmpg          
        //   189: goto            196
        //   192: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   195: athrow         
        //   196: ifge            206
        //   199: aload           6
        //   201: areturn        
        //   202: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   205: athrow         
        //   206: dconst_1       
        //   207: dup2           
        //   208: dload           8
        //   210: ddiv           
        //   211: invokestatic    java/lang/Math.floor:(D)D
        //   214: dload           8
        //   216: dmul           
        //   217: dsub           
        //   218: ldc2_w          2.0
        //   221: ddiv           
        //   222: dstore          14
        //   224: dconst_1       
        //   225: dup2           
        //   226: dload           10
        //   228: ddiv           
        //   229: invokestatic    java/lang/Math.floor:(D)D
        //   232: dload           10
        //   234: dmul           
        //   235: dsub           
        //   236: ldc2_w          2.0
        //   239: ddiv           
        //   240: dstore          16
        //   242: dconst_1       
        //   243: dup2           
        //   244: dload           12
        //   246: ddiv           
        //   247: invokestatic    java/lang/Math.floor:(D)D
        //   250: dload           12
        //   252: dmul           
        //   253: dsub           
        //   254: ldc2_w          2.0
        //   257: ddiv           
        //   258: dstore          18
        //   260: dconst_0       
        //   261: dup2           
        //   262: dstore          20
        //   264: dconst_1       
        //   265: dcmpg          
        //   266: ifgt            481
        //   269: dconst_0       
        //   270: dup2           
        //   271: dstore          22
        //   273: dconst_1       
        //   274: dcmpg          
        //   275: ifgt            470
        //   278: dconst_0       
        //   279: dup2           
        //   280: iload           4
        //   282: ifeq            476
        //   285: dstore          24
        //   287: dconst_1       
        //   288: dcmpg          
        //   289: ifgt            459
        //   292: new             Lnet.minecraft.util.math.Vec3d;
        //   295: dup            
        //   296: dload           20
        //   298: aload_0        
        //   299: getfield        net.minecraft.util.math.Box.minX:D
        //   302: aload_0        
        //   303: getfield        net.minecraft.util.math.Box.maxX:D
        //   306: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //   309: dload           14
        //   311: dadd           
        //   312: dload           22
        //   314: aload_0        
        //   315: getfield        net.minecraft.util.math.Box.minY:D
        //   318: aload_0        
        //   319: getfield        net.minecraft.util.math.Box.maxY:D
        //   322: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //   325: dload           16
        //   327: dadd           
        //   328: dload           24
        //   330: aload_0        
        //   331: getfield        net.minecraft.util.math.Box.minZ:D
        //   334: aload_0        
        //   335: getfield        net.minecraft.util.math.Box.maxZ:D
        //   338: invokestatic    net.minecraft.util.math.MathHelper.lerp:(DDD)D
        //   341: dload           18
        //   343: dadd           
        //   344: invokespecial   net.minecraft.util.math.Vec3d.<init>:(DDD)V
        //   347: astore          26
        //   349: iload_1        
        //   350: iload           4
        //   352: ifeq            275
        //   355: iload           4
        //   357: ifeq            441
        //   360: ifeq            414
        //   363: goto            370
        //   366: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   369: athrow         
        //   370: aload           7
        //   372: aload           26
        //   374: iload           4
        //   376: ifeq            430
        //   379: goto            386
        //   382: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   385: athrow         
        //   386: aload           5
        //   388: iconst_0       
        //   389: invokestatic    org/rusherhack/Class220.m8442:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.entity.Entity;Z)Lnet.minecraft.util.hit.HitResult.Type;
        //   392: getstatic       net.minecraft.util.hit.HitResult.Type.BLOCK:Lnet.minecraft.util.hit.HitResult.Type;
        //   395: if_acmpne       414
        //   398: goto            405
        //   401: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   404: athrow         
        //   405: dload           24
        //   407: goto            450
        //   410: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   413: athrow         
        //   414: aload           7
        //   416: iload           4
        //   418: ifeq            446
        //   421: aload           26
        //   423: goto            430
        //   426: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   429: athrow         
        //   430: invokevirtual   net.minecraft.util.math.Vec3d.squaredDistanceTo:(Lnet.minecraft.util.math.Vec3d;)D
        //   433: aload           7
        //   435: aload           6
        //   437: invokevirtual   net.minecraft.util.math.Vec3d.squaredDistanceTo:(Lnet.minecraft.util.math.Vec3d;)D
        //   440: dcmpg          
        //   441: ifge            448
        //   444: aload           26
        //   446: astore          6
        //   448: dload           24
        //   450: dload           12
        //   452: dadd           
        //   453: dup2           
        //   454: dstore          24
        //   456: goto            287
        //   459: dload           22
        //   461: dload           10
        //   463: dadd           
        //   464: dup2           
        //   465: dstore          22
        //   467: goto            273
        //   470: dload           20
        //   472: dload           8
        //   474: dadd           
        //   475: dup2           
        //   476: dstore          20
        //   478: goto            264
        //   481: aload           6
        //   483: areturn        
        //    StackMapTable: 00 24 FF 00 8F 00 0A 07 00 9B 01 04 01 07 00 2E 07 00 34 07 00 34 03 03 03 00 01 07 00 13 03 46 07 00 13 43 01 4A 07 00 13 03 4A 07 00 13 FF 00 03 00 0A 07 00 9B 01 04 01 07 00 2E 07 00 34 07 00 34 03 03 03 00 02 03 03 43 07 00 13 43 01 02 42 07 00 13 03 FF 00 0E 00 0A 07 00 9B 01 04 01 07 00 2E 07 00 34 07 00 34 03 03 03 00 02 03 03 FF 00 2A 00 0E 07 00 9B 01 04 01 07 00 2E 07 00 34 07 00 34 03 03 03 03 03 03 03 00 01 03 FF 00 08 00 0F 07 00 9B 01 04 01 07 00 2E 07 00 34 07 00 34 03 03 03 03 03 03 03 03 00 01 03 41 01 FF 00 0B 00 10 07 00 9B 01 04 01 07 00 2E 07 00 34 07 00 34 03 03 03 03 03 03 03 03 03 00 01 03 FF 00 4E 00 11 07 00 9B 01 04 01 07 00 2E 07 00 34 07 00 34 03 03 03 03 03 03 03 03 03 07 00 34 00 01 07 00 13 03 4B 07 00 13 FF 00 03 00 11 07 00 9B 01 04 01 07 00 2E 07 00 34 07 00 34 03 03 03 03 03 03 03 03 03 07 00 34 00 02 07 00 34 07 00 34 4E 07 00 13 03 44 07 00 13 03 4B 07 00 13 FF 00 03 00 11 07 00 9B 01 04 01 07 00 2E 07 00 34 07 00 34 03 03 03 03 03 03 03 03 03 07 00 34 00 02 07 00 34 07 00 34 4A 01 44 07 00 34 01 41 03 FA 00 08 FA 00 0A FF 00 05 00 0F 07 00 9B 01 04 01 07 00 2E 07 00 34 07 00 34 03 03 03 03 03 03 03 03 00 02 03 03 FA 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  128    140    143    147    Ljava/lang/MatchException;
        //  137    151    154    158    Ljava/lang/MatchException;
        //  158    166    169    173    Ljava/lang/MatchException;
        //  163    181    184    188    Ljava/lang/MatchException;
        //  173    189    192    196    Ljava/lang/MatchException;
        //  196    202    202    206    Ljava/lang/MatchException;
        //  355    363    366    370    Ljava/lang/MatchException;
        //  360    379    382    386    Ljava/lang/MatchException;
        //  370    398    401    405    Ljava/lang/MatchException;
        //  386    410    410    414    Ljava/lang/MatchException;
        //  414    423    426    430    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0173:
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
    
    public static boolean m8444(final Vec3d vec3d) {
        final long n = Class220.f4109 ^ 0x697B92F38633L;
        try {
            if (m8449(new RaycastContext(((Entity)Globals.mc.player).getEyePos(), vec3d, RaycastContext.ShapeType.VISUAL, RaycastContext.FluidHandling.NONE, (Entity)Globals.mc.player), null).getType() != HitResult.Type.MISS) {
                return true;
            }
        }
        catch (final MatchException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public static float m8445(final Entity entity) {
        return 0.0f;
    }
    
    public static Vec3d m8446(final BlockPos p0, final Direction p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          50156483278099
        //     6: lxor           
        //     7: lstore_3       
        //     8: invokestatic    org/rusherhack/Class253.m9155:()I
        //    11: istore          5
        //    13: aload_0        
        //    14: astore          6
        //    16: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    19: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    22: aload           6
        //    24: invokevirtual   net.minecraft.world.World.getBlockState:(Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.block.BlockState;
        //    27: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    30: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    33: aload           6
        //    35: invokevirtual   net.minecraft.block.AbstractBlock.AbstractBlockState.getOutlineShape:(Lnet.minecraft.world.BlockView;Lnet.minecraft.util.math.BlockPos;)Lnet.minecraft.util.shape.VoxelShape;
        //    38: dup            
        //    39: astore          7
        //    41: iload           5
        //    43: ifeq            77
        //    46: invokevirtual   net.minecraft.util.shape.VoxelShape.isEmpty:()Z
        //    49: ifeq            75
        //    52: goto            59
        //    55: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    58: athrow         
        //    59: new             Lnet.minecraft.util.math.Box;
        //    62: dup            
        //    63: aload           6
        //    65: invokespecial   net.minecraft.util.math.Box.<init>:(Lnet.minecraft.util.math.BlockPos;)V
        //    68: goto            80
        //    71: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    74: athrow         
        //    75: aload           7
        //    77: invokevirtual   net.minecraft.util.shape.VoxelShape.getBoundingBox:()Lnet.minecraft.util.math.Box;
        //    80: astore_0       
        //    81: aload_0        
        //    82: dup            
        //    83: getfield        net.minecraft.util.math.Box.maxY:D
        //    86: aload_0        
        //    87: getfield        net.minecraft.util.math.Box.minY:D
        //    90: dsub           
        //    91: dstore          8
        //    93: getfield        net.minecraft.util.math.Box.maxX:D
        //    96: aload_0        
        //    97: dup_x2         
        //    98: getfield        net.minecraft.util.math.Box.minX:D
        //   101: dsub           
        //   102: dstore          10
        //   104: getfield        net.minecraft.util.math.Box.maxZ:D
        //   107: aload_0        
        //   108: getfield        net.minecraft.util.math.Box.minZ:D
        //   111: dsub           
        //   112: dstore          12
        //   114: dload           10
        //   116: dload           12
        //   118: dadd           
        //   119: ldc2_w          4.0
        //   122: ddiv           
        //   123: dstore          10
        //   125: new             Lnet.minecraft.util.math.Vec3d;
        //   128: dup            
        //   129: aload           6
        //   131: invokevirtual   net.minecraft.util.math.Vec3i.getX:()I
        //   134: i2d            
        //   135: ldc2_w          0.5
        //   138: dadd           
        //   139: aload           6
        //   141: invokevirtual   net.minecraft.util.math.Vec3i.getY:()I
        //   144: i2d            
        //   145: dload           8
        //   147: ldc2_w          2.0
        //   150: ddiv           
        //   151: dadd           
        //   152: aload           6
        //   154: invokevirtual   net.minecraft.util.math.Vec3i.getZ:()I
        //   157: i2d            
        //   158: ldc2_w          0.5
        //   161: dadd           
        //   162: invokespecial   net.minecraft.util.math.Vec3d.<init>:(DDD)V
        //   165: astore          7
        //   167: iload           5
        //   169: ifeq            218
        //   172: aload_1        
        //   173: ifnonnull       190
        //   176: goto            183
        //   179: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   182: athrow         
        //   183: aload           7
        //   185: areturn        
        //   186: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   189: athrow         
        //   190: aload           7
        //   192: new             Lnet.minecraft.util.math.Vec3d;
        //   195: dup            
        //   196: aload_1        
        //   197: invokevirtual   net.minecraft.util.math.Direction.getUnitVector:()Lorg/joml/Vector3f;
        //   200: invokespecial   net.minecraft.util.math.Vec3d.<init>:(Lorg/joml/Vector3f;)V
        //   203: dload           10
        //   205: invokevirtual   net.minecraft.util.math.Vec3d.multiply:(D)Lnet.minecraft.util.math.Vec3d;
        //   208: invokevirtual   net.minecraft.util.math.Vec3d.add:(Lnet.minecraft.util.math.Vec3d;)Lnet.minecraft.util.math.Vec3d;
        //   211: iload           5
        //   213: ifeq            672
        //   216: astore          7
        //   218: iload_2        
        //   219: ifeq            670
        //   222: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   225: invokevirtual   net.minecraft.client.MinecraftClient.getRenderTickCounter:()Lnet.minecraft.client.render.RenderTickCounter;
        //   228: iconst_1       
        //   229: dup            
        //   230: dup            
        //   231: pop2           
        //   232: invokeinterface net.minecraft.client.render.RenderTickCounter.getTickDelta:(Z)F
        //   237: fstore_2       
        //   238: aload           7
        //   240: astore_0       
        //   241: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   244: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   247: new             Lnet.minecraft.world.RaycastContext;
        //   250: dup            
        //   251: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   254: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   257: fload_2        
        //   258: invokevirtual   net.minecraft.entity.Entity.getCameraPosVec:(F)Lnet.minecraft.util.math.Vec3d;
        //   261: aload_0        
        //   262: getstatic       net.minecraft.world.RaycastContext.ShapeType.OUTLINE:Lnet.minecraft.world.RaycastContext.ShapeType;
        //   265: getstatic       net.minecraft.world.RaycastContext.FluidHandling.NONE:Lnet.minecraft.world.RaycastContext.FluidHandling;
        //   268: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   271: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   274: invokespecial   net.minecraft.world.RaycastContext.<init>:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.world.RaycastContext.ShapeType;Lnet.minecraft.world.RaycastContext.FluidHandling;Lnet.minecraft.entity.Entity;)V
        //   277: invokeinterface net.minecraft.world.BlockView.raycast:(Lnet.minecraft.world.RaycastContext;)Lnet.minecraft.util.hit.BlockHitResult;
        //   282: dup            
        //   283: astore          14
        //   285: invokevirtual   net.minecraft.util.hit.BlockHitResult.getType:()Lnet.minecraft.util.hit.HitResult.Type;
        //   288: getstatic       net.minecraft.util.hit.HitResult.Type.BLOCK:Lnet.minecraft.util.hit.HitResult.Type;
        //   291: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   294: iload           5
        //   296: ifeq            326
        //   299: ifeq            381
        //   302: goto            309
        //   305: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   308: athrow         
        //   309: aload           14
        //   311: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   314: aload           6
        //   316: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //   319: goto            326
        //   322: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   325: athrow         
        //   326: iload           5
        //   328: ifeq            357
        //   331: ifeq            381
        //   334: goto            341
        //   337: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   340: athrow         
        //   341: aload           14
        //   343: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //   346: aload_1        
        //   347: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   350: goto            357
        //   353: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   356: athrow         
        //   357: ifeq            381
        //   360: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   363: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   366: fload_2        
        //   367: invokevirtual   net.minecraft.entity.Entity.getCameraPosVec:(F)Lnet.minecraft.util.math.Vec3d;
        //   370: aload_0        
        //   371: invokevirtual   net.minecraft.util.math.Vec3d.squaredDistanceTo:(Lnet.minecraft.util.math.Vec3d;)D
        //   374: goto            384
        //   377: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   380: athrow         
        //   381: ldc2_w          1.7976931348623157E308
        //   384: dstore          8
        //   386: invokestatic    net.minecraft.util.math.Direction.values:()[Lnet.minecraft.util.math.Direction;
        //   389: dup            
        //   390: astore          14
        //   392: arraylength    
        //   393: istore          15
        //   395: iconst_0       
        //   396: dup            
        //   397: istore          16
        //   399: iload           15
        //   401: if_icmpge       668
        //   404: aload           14
        //   406: iload           16
        //   408: aaload         
        //   409: dup            
        //   410: astore          17
        //   412: invokevirtual   net.minecraft.util.math.Direction.getAxis:()Lnet.minecraft.util.math.Direction.Axis;
        //   415: aload_1        
        //   416: invokevirtual   net.minecraft.util.math.Direction.getAxis:()Lnet.minecraft.util.math.Direction.Axis;
        //   419: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   422: ifeq            437
        //   425: iload           5
        //   427: ifne            660
        //   430: goto            437
        //   433: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   436: athrow         
        //   437: aload           7
        //   439: new             Lnet.minecraft.util.math.Vec3d;
        //   442: dup            
        //   443: aload           17
        //   445: invokevirtual   net.minecraft.util.math.Direction.getUnitVector:()Lorg/joml/Vector3f;
        //   448: invokespecial   net.minecraft.util.math.Vec3d.<init>:(Lorg/joml/Vector3f;)V
        //   451: dload           10
        //   453: ldc2_w          0.9
        //   456: dmul           
        //   457: invokevirtual   net.minecraft.util.math.Vec3d.multiply:(D)Lnet.minecraft.util.math.Vec3d;
        //   460: invokevirtual   net.minecraft.util.math.Vec3d.add:(Lnet.minecraft.util.math.Vec3d;)Lnet.minecraft.util.math.Vec3d;
        //   463: astore          17
        //   465: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   468: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   471: fload_2        
        //   472: invokevirtual   net.minecraft.entity.Entity.getCameraPosVec:(F)Lnet.minecraft.util.math.Vec3d;
        //   475: aload           17
        //   477: invokevirtual   net.minecraft.util.math.Vec3d.squaredDistanceTo:(Lnet.minecraft.util.math.Vec3d;)D
        //   480: dstore          12
        //   482: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   485: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   488: new             Lnet.minecraft.world.RaycastContext;
        //   491: dup            
        //   492: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   495: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   498: fload_2        
        //   499: invokevirtual   net.minecraft.entity.Entity.getCameraPosVec:(F)Lnet.minecraft.util.math.Vec3d;
        //   502: aload           17
        //   504: getstatic       net.minecraft.world.RaycastContext.ShapeType.OUTLINE:Lnet.minecraft.world.RaycastContext.ShapeType;
        //   507: getstatic       net.minecraft.world.RaycastContext.FluidHandling.NONE:Lnet.minecraft.world.RaycastContext.FluidHandling;
        //   510: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   513: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   516: invokespecial   net.minecraft.world.RaycastContext.<init>:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.world.RaycastContext.ShapeType;Lnet.minecraft.world.RaycastContext.FluidHandling;Lnet.minecraft.entity.Entity;)V
        //   519: invokeinterface net.minecraft.world.BlockView.raycast:(Lnet.minecraft.world.RaycastContext;)Lnet.minecraft.util.hit.BlockHitResult;
        //   524: dup            
        //   525: astore          18
        //   527: invokevirtual   net.minecraft.util.hit.BlockHitResult.getType:()Lnet.minecraft.util.hit.HitResult.Type;
        //   530: getstatic       net.minecraft.util.hit.HitResult.Type.BLOCK:Lnet.minecraft.util.hit.HitResult.Type;
        //   533: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   536: iload           5
        //   538: ifeq            638
        //   541: ifeq            626
        //   544: goto            551
        //   547: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   550: athrow         
        //   551: aload           18
        //   553: invokevirtual   net.minecraft.util.hit.BlockHitResult.getBlockPos:()Lnet.minecraft.util.math.BlockPos;
        //   556: aload           6
        //   558: invokevirtual   net.minecraft.util.math.Vec3i.equals:(Ljava/lang/Object;)Z
        //   561: iload           5
        //   563: ifeq            665
        //   566: goto            573
        //   569: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   572: athrow         
        //   573: ifeq            660
        //   576: goto            583
        //   579: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   582: athrow         
        //   583: aload           18
        //   585: invokevirtual   net.minecraft.util.hit.BlockHitResult.getSide:()Lnet.minecraft.util.math.Direction;
        //   588: aload_1        
        //   589: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   592: iload           5
        //   594: ifeq            638
        //   597: goto            604
        //   600: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   603: athrow         
        //   604: ifne            626
        //   607: goto            614
        //   610: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   613: athrow         
        //   614: iload           5
        //   616: ifne            660
        //   619: goto            626
        //   622: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   625: athrow         
        //   626: dload           12
        //   628: dload           8
        //   630: dcmpg          
        //   631: goto            638
        //   634: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   637: athrow         
        //   638: iload           5
        //   640: ifeq            665
        //   643: ifge            660
        //   646: goto            653
        //   649: invokestatic    org/rusherhack/Class220.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   652: athrow         
        //   653: aload           17
        //   655: astore_0       
        //   656: dload           12
        //   658: dstore          8
        //   660: iinc            16, 1
        //   663: iload           16
        //   665: goto            399
        //   668: aload_0        
        //   669: areturn        
        //   670: aload           7
        //   672: areturn        
        //    StackMapTable: 00 2E FF 00 37 00 07 07 00 74 07 00 C9 01 04 01 07 00 74 07 00 95 00 01 07 00 13 03 4B 07 00 13 03 41 07 00 95 42 07 00 9B FF 00 62 00 0A 07 00 9B 07 00 C9 01 04 01 07 00 74 07 00 34 03 03 03 00 01 07 00 13 03 42 07 00 13 03 1B FF 00 56 00 0B 07 00 34 07 00 C9 02 04 01 07 00 74 07 00 34 03 03 03 07 00 64 00 01 07 00 13 03 4C 07 00 13 43 01 4A 07 00 13 03 4B 07 00 13 43 01 53 07 00 13 03 42 03 FF 00 0E 00 0D 07 00 34 07 00 C9 02 04 01 07 00 74 07 00 34 03 03 03 07 01 F1 01 01 00 01 01 FF 00 21 00 0E 07 00 34 07 00 C9 02 04 01 07 00 74 07 00 34 03 03 03 07 01 F1 01 01 07 00 C9 00 01 07 00 13 03 FF 00 6D 00 0F 07 00 34 07 00 C9 02 04 01 07 00 74 07 00 34 03 03 03 07 01 F1 01 01 07 00 34 07 00 64 00 01 07 00 13 03 51 07 00 13 43 01 45 07 00 13 03 50 07 00 13 43 01 45 07 00 13 03 47 07 00 13 03 47 07 00 13 43 01 4A 07 00 13 03 FF 00 06 00 0E 07 00 34 07 00 C9 02 04 01 07 00 74 07 00 34 03 03 03 07 01 F1 01 01 07 00 04 00 00 44 01 FA 00 02 FF 00 01 00 0A 07 00 9B 07 00 C9 01 04 01 07 00 74 07 00 34 03 03 03 00 00 41 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  41     52     55     59     Ljava/lang/MatchException;
        //  46     71     71     75     Ljava/lang/MatchException;
        //  167    176    179    183    Ljava/lang/MatchException;
        //  172    186    186    190    Ljava/lang/MatchException;
        //  285    302    305    309    Ljava/lang/MatchException;
        //  299    319    322    326    Ljava/lang/MatchException;
        //  326    334    337    341    Ljava/lang/MatchException;
        //  331    350    353    357    Ljava/lang/MatchException;
        //  357    377    377    381    Ljava/lang/MatchException;
        //  412    430    433    437    Ljava/lang/MatchException;
        //  527    544    547    551    Ljava/lang/MatchException;
        //  541    566    569    573    Ljava/lang/MatchException;
        //  551    576    579    583    Ljava/lang/MatchException;
        //  573    597    600    604    Ljava/lang/MatchException;
        //  583    607    610    614    Ljava/lang/MatchException;
        //  604    619    622    626    Ljava/lang/MatchException;
        //  614    631    634    638    Ljava/lang/MatchException;
        //  638    646    649    653    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0551:
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
    
    public static boolean m8447(final BlockPos blockPos, final Direction direction) {
        return false;
    }
    
    public static BlockHitResult m8449(final RaycastContext p0, final Predicate<BlockPos> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          84723706093971
        //     6: lxor           
        //     7: lstore_2       
        //     8: aload_0        
        //     9: aload_1        
        //    10: astore_0       
        //    11: astore_1       
        //    12: aload_1        
        //    13: invokevirtual   net.minecraft.world.RaycastContext.getStart:()Lnet.minecraft.util.math.Vec3d;
        //    16: aload_1        
        //    17: invokevirtual   net.minecraft.world.RaycastContext.getEnd:()Lnet.minecraft.util.math.Vec3d;
        //    20: aload_1        
        //    21: aload_0        
        //    22: invokedynamic   BootstrapMethod #1, apply:(Ljava/util/function/Predicate;)Ljava/util/function/BiFunction;
        //    27: invokedynamic   BootstrapMethod #2, apply:()Ljava/util/function/Function;
        //    32: invokestatic    net.minecraft.world.BlockView.raycast:(Lnet.minecraft.util.math.Vec3d;Lnet.minecraft.util.math.Vec3d;Ljava/lang/Object;Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/lang/Object;
        //    35: checkcast       Lnet.minecraft.util.hit.BlockHitResult;
        //    38: areturn        
        //    Signature:
        //  (Lnet.minecraft.world.RaycastContext;Ljava/util/function/Predicate<Lnet.minecraft.util.math.BlockPos;>;)Lnet.minecraft.util.hit.BlockHitResult;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Cannot invoke "com.strobel.assembler.metadata.TypeReference.getSimpleType()" because the return value of "com.strobel.decompiler.ast.Variable.getType()" is null
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.generateNameForVariable(NameVariables.java:252)
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.assignNamesToVariables(NameVariables.java:185)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.nameVariables(AstMethodBodyBuilder.java:1482)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.populateVariables(AstMethodBodyBuilder.java:1411)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    public static float m8450(final BlockPos blockPos) {
        return 0.0f;
    }
    
    static {
        f4109 = Class066.m4320(-341123690817238052L, -731438396216540750L, (Object)MethodHandles.lookup().lookupClass()).m4325(122624081671322L);
        f4110 = new Object[165];
        f4111 = new String[165];
        m194();
    }
    
    private static MatchException m285(final MatchException ex) {
        return ex;
    }
    
    private static int m193(long n2, final long n3) {
        n2 ^= (n3 << 48 | n3);
        final int n4 = (int)(n2 >>> 46);
        if (Class220.f4111[n4] != null) {
            return n4;
        }
        final Object o = Class220.f4110[n4];
        if (!(o instanceof String)) {
            return n4;
        }
        final int n6 = switch ((int)(n2 >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 40;
            case 2 -> 41;
            case 3 -> 50;
            case 4 -> 46;
            case 5 -> 20;
            case 6 -> 29;
            case 7 -> 57;
            case 8 -> 31;
            case 9 -> 59;
            case 10 -> 32;
            case 11 -> 18;
            case 12 -> 16;
            case 13 -> 28;
            case 14 -> 27;
            case 15 -> 54;
            case 16 -> 13;
            case 17 -> 24;
            case 18 -> 39;
            case 19 -> 22;
            case 20 -> 47;
            case 21 -> 63;
            case 22 -> 6;
            case 23 -> 36;
            case 24 -> 42;
            case 25 -> 56;
            case 26 -> 21;
            case 27 -> 2;
            case 28 -> 53;
            case 29 -> 43;
            case 30 -> 7;
            case 31 -> 61;
            case 32 -> 37;
            case 33 -> 10;
            case 34 -> 62;
            case 35 -> 26;
            case 36 -> 17;
            case 37 -> 8;
            case 38 -> 12;
            case 39 -> 19;
            case 40 -> 30;
            case 41 -> 34;
            case 42 -> 3;
            case 43 -> 44;
            case 44 -> 38;
            case 45 -> 25;
            case 46 -> 60;
            case 47 -> 49;
            case 48 -> 9;
            case 49 -> 58;
            case 50 -> 48;
            case 51 -> 11;
            case 52 -> 35;
            case 53 -> 15;
            case 54 -> 51;
            case 55 -> 14;
            case 56 -> 4;
            case 57 -> 52;
            case 58 -> 45;
            case 59 -> 0;
            case 60 -> 33;
            case 61 -> 1;
            case 62 -> 55;
            default -> 5;
        };
        final int[] array = new int[6];
        for (int i = 0; i < 6; ++i) {
            int n7 = (int)(n2 >>> 7 * (5 - i) & 0x7FL) - n6;
            if (n7 < 0) {
                n7 += 128;
            }
            array[i] = n7;
        }
        final char[] charArray = ((String)o).toCharArray();
        for (int j = 0; j < charArray.length; ++j) {
            final int n8 = array[j % array.length];
            if (n8 == 0) {
                break;
            }
            charArray[j] ^= (char)n8;
        }
        Class220.f4111[n4] = new String(charArray);
        return n4;
    }
    
    private static void m194() {
        final Object[] f4110 = Class220.f4110;
        f4110[0] = ";\u000b\u0002\u0013uO'\u0011\u0000Oo[7\u0012K\u023b";
        f4110[1] = Integer.TYPE;
        Class220.f4111[1] = "java/lang/Integer";
        f4110[2] = "x\u0003\u001e=\u001dpx\u0003\ta\u0011\u007fbH\t\u007f\u0011je9[*B*";
        f4110[3] = "!LZ\u0011\u0019\u0004!LMM\u0015\u000b;\u0007MS\u0015\u001e<v\u001c\u0007D[";
        f4110[4] = "v3\u001c{E%v3\u000b'I*lx\u000b9I?k\tZf\u0011h{:\t&[\u0013*bX";
        f4110[5] = """
                   ^"\u001d72f^"
                   k>iDi
                   u>|C\u0018])h9""";
        f4110[6] = """
                   (\u001d\u001ds\u001f*(\u001d
                   /\u0013%2V
                   1\u001305'[iA""";
        f4110[7] = Double.TYPE;
        Class220.f4111[7] = "java/lang/Double";
        f4110[8] = "\u0014`!\u0004eq\u0014`6Xi~\u000e+6Fik\tZf\u001f;*";
        f4110[9] = "$\ra\u0004n\u001b8\u0017cXt\u000f(\u0014(Ip\u0007.\u0011r\u0004}\u001e\"QAFs\f*\u0013u";
        f4110[10] = "d\u0016\u0003x\bWd\u0016\u0014$\u0004X~]\u0014:\u0004My,DgU";
        f4110[11] = "\u001592vD{\t#0*^o\u0019 {\u0194";
        f4110[12] = "fcKCD&fc\\\u001fH)|(\\\u0001H<{Y\r^\u001aw";
        f4110[13] = "G\u0018L\u0005\u007f\u001eG\u0018[Ys\u0011]S[Gs\u0004Z\"\n\u0013#O";
        f4110[14] = Boolean.TYPE;
        Class220.f4111[14] = "java/lang/Boolean";
        f4110[15] = "\u0014\u0012`;k\u0014\u0014\u0012wgg\u001b\u000eYwyg\u000e\t('\"4K";
        f4110[16] = "[zaYU9[zv\u0005Y6A1v\u001bY#F@'D\u000bh\u0011|y\u0016K#j-&D\u0001";
        f4110[17] = "\u001aL\u0018(_\u0002\u001aL\u000ftS\r\u0000\u0007\u000fjS\u0018\u0007vZ5\n";
        f4110[18] = "_#SNk2_#D\u0012g=EhD\fg(B\u0019\u0015W?j";
        f4110[19] = "hb&SbUhb1\u000fnZr)1\u0011nOuXcO6\u000b";
        f4110[20] = "C%)+]9H*8d>4]'7\u000f\u000b6L4+#\u001c;";
        f4110[21] = "\u001f\u0017lTGM\u0014\u0018}\u001b&C\u001f\u0013yA";
        f4110[22] = "C)Q\"\u001ftC)F~\u0013{YbF`\u0013n^\u0013\u0017?E)";
        f4110[23] = "\u001d8'\u0012x\u000b\u001d80Nt\u0004\u0007s0Pt\u0011\u0000\u0002a\u000f R";
        f4110[24] = "H\u000b\u0001E\u0007}H\u000b\u0016\u0019\u000brR@\u0016\u0007\u000bgU1FR_-";
        f4110[25] = ",\u001e8ns\t,\u001e/2\u007f\u00066U/,\u007f\u00131$\u007fy(U";
        f4110[26] = "I\u000e\u0004BJ9U\u0014\u0006\u001eP-E\u0017M\u05eb";
        f4110[27] = "@y";
        f4110[28] = ")\u000e`OX$)\u000ew\u0013T+3Ew\rT>44&W\r}";
        f4110[29] = "\\\u00070\u0003\bE\\\u0007'_\u0004JFL'A\u0004_A=u\u0014W\u001e";
        f4110[30] = """
                    ?
                    \u00137\u0018]?
                    \u0004k\u0014R%A\u0004u\u0014G"0U/@""";
        f4110[31] = """
                    \u0000\bSb\u0006@\u0000\bD>
                    O\u001aCD 
                    Z\u001d2\u0015\u007fS""";
        f4110[32] = "\t W\u0006\"3\t @Z.<\u0013k@D.)\u0014\u001a\u0014\u001cy";
        f4110[33] = Float.TYPE;
        Class220.f4111[33] = "java/lang/Float";
        f4110[34] = "\"Cr^\f1>Yp\u0002\u0016%.Z;\u0013\u0012-(_a^\u001f4$\u001f`\u0004\u0017(>\u001fG\u001f\n%9Xz\u001e+0$]f";
        f4110[35] = "a)";
        f4110[36] = "?;\fnL\u0004!3\u0016!\u0004\u0004;9\u000ef\r\u001f{\n\bj\u0006\u00186;\u000ej";
        f4110[37] = "dW\u0012:HHdW\u0005fDG~\u001c\u0005xDRymT'\u001d\u0013";
        f4110[38] = "\u0015W%Vj!\u0015W2\nf.\u000f\u001c2\u0014f;\bmbA2q_Q=\u0019t;$\u0000eJ";
        f4110[39] = "O[[ [\u0006SAY|A\u0012CB\u0012mE\u001aEGH H\u0003I\u0007]mJ\u0016SZS|Z]EGHg]\n\u000e`qgQ\u001aNlRz@\u0007Y";
        f4110[40] = "|\u000e8>fP|\u000e/bj_fE/|jJa4\u007f)>\u00006\b qxJMXu&;";
        f4110[41] = "m\u0013jO6\u000fo\r#79\u0003v\u000e\u007fR:";
        f4110[42] = "U.}O3\u000fU.j\u0013?\u0000Oej\r?\u0015H\u0014;Sj^";
        f4110[43] = "h\u0015 \u000em\u0015c\u001a1A\u000e\u0018v\u001c";
        f4110[44] = "\u0019h^{q\u001d\u0005r\\'k\t\u0015q\u00176o\u0001\u0013tM{b\u0018\u001f4L!j\u0004\u00054|;w\u0001\u0002cl!j\u0004\u0005";
        f4110[45] = "\u0011\u0013&\u00066b\u0011\u00131Z:m\u000bX1D:x\f)f\u0018o3";
        f4110[46] = "\u0010\u001a\u0017\u0005<C\u0010\u001a\u0000Y0L\nQ\u0000G0Y\r Z\u001cf\u0013";
        f4110[47] = "PO7I+_NG-\u0006c_TM5AjD\u0014l(npDYZ(Gk";
        f4110[48] = "\u001d|R\bGp\u0003tHG\u000fp\u0019~P\u0000\u0006kY[Q\u0007\nq\u001erJ";
        f4110[49] = "\u001c|\u007fcB}\u001c|h?Nr\u00067h!Ng\u0001F8{\u001e$";
        f4110[50] = "*cO\u0018k&*cXDg)0(XZg<7Y\t\u00042y";
        f4110[51] = "3;\u007f\u0013zH3;hOvG)phQvR.\u00018\u0004!\u0017";
        f4110[52] = "f[\n\u0016\u0010kf[\u001dJ\u001cd|\u0010\u001dT\u001cq{aO\u000eJ7";
        f4110[53] = "\u0007dsH\b2\u001b~q\u0014\u0012&\u000b}:\u011c";
        f4110[54] = "\u0004Hi\u0013\u0013\u000b2mi\u0013\u0004W>bsX\u0004I>wt)U\u0016j4<";
        f4110[55] = "\u0004<g+\tx\u0004<pw\u0005w\u001ewpi\u0005b\u0019\u0006!6Q!N:\u007fd\u0017b5k 0U";
        f4110[56] = "\bA|\r1<\u000fM\"SOh\u0006CyQ#ZR\u0007(\fO1\u0016_kN%5\u0002\u0005r6sp\u000bMa\\wdQT\u0019\u0006#b\u0019Ub\r+w\u0011?yLs4\u0010@rN&rk";
        f4110[57] = "S,:ij]\u0004&<j\fUQ<=k`g\u0005xd060\u0001|?p=]\u0003137\f\r\u0000\"!=a\u000fM.f\f1\f^<la3AR{]c`WY&04jQZ@";
        f4110[58] = "\u0005zF\u0016\r\u0014\u0000v]D1D_~PKf\u0013\u0005(\u000e'\nCL\"\b\u0019\u000fOWp";
        f4110[59] = """
                    \u0002Oti\u0000y\\r4n\u001dH\u02f3vq.\u001b:C\u001cu:A#;\u0013=0C,
                    \u0015&5
                    H""";
        f4110[60] = "u\u0001I}bNq\u0015\u0013d\u001aA$\u0000IhvspD\u0010>\u001a\u00184\u001c[wp\u001c FB\u000f&Y)\u000eQe\"Ms\u0017)";
        f4110[61] = "b!M\u001b\u000b_f5\u0017\u0002s[?1I\u0005$\fea\u0015iN\t< \u001c\u0004LD0g";
        f4110[62] = "E\u0010rql\fDB|4\u0016\u0000\u001b\u0011)$AWDLrH}\u0005\u001d\u000e)uy\u0005\u000b\u0011";
        f4110[63] = ".{\u001c];w{:\u0018\u0015Pv+h\u0000\u0001\u0007!q?]mm$(yU\u0000oi$>";
        f4110[64] = "q8\ff\u0012r0$Hhy\u007fj*\u0012j.(4zK6ykt=\u0016m\u001a*hy\u0018";
        f4110[65] = "HiG-43N'S-O+GjA8#\u0019\u0010(\u001bfrN\u001bkE=3w\u0017m\\-O";
        f4110[66] = "\u0018\u0012\u007f-{\u000b_\u0004f*\u0003\n\t\u0015t'o8UT*|\u0003\r\u001b\u000ff;~\u000bU\u001bf@";
        f4110[67] = "\u0007s\u0000p\u0005,H/\u001bz}xR\u0016\\wB$Ct]%La";
        f4110[68] = "BMU-XMX\u0011R/7FE\u0000\f![t\u0011DVx\u000f#SL\u0001+\u000fLJG\u0011F";
        f4110[69] = "|LG\u0003'\t)\rCKL\u0003uN_T 1)\u0003\u00033(\u0018`\u0002T\\}YdJ?\u00021\u0002zN\u0006\u000e7\u001bj2";
        f4110[70] = "\u0002\u0013\u0002VdsWR\u0006\u001e\u000fy\u000b\u0011\u001a\u0001cK_UB[\u000f \u001b\r\b\u001ee$\u000fW\u0011f";
        f4110[71] = "?Q[Px/bMG7\u024bP(\u001fVZ*?1\u0014F7";
        f4110[72] = "kBr\u001f\u001c**Dx\u001dv:p^x\u0001\u000e<rKi\u0016;=jCi\n(6}\"y\u001bMfu\u001eu\u0015\t\"\u0016Ge\u0018N?'A~\u001d\u0007[*_u\t\u000e1.K/\u0010v";
        f4110[73] = "s~\"ua~~:*nYwy:\u001es%qh'#r\"\u0018(;$f!r,/~\u007fY\u007fm9y{8\u007fw?$\u0014";
        f4110[74] = "\u0019\u0000S\u0001\\\u000f\u0006YAR%\u014cx\u0004[W\u0014P\u0018_LRU";
        f4110[75] = "H\u0002PV\u0018\u0012\u0004OZ\u0007s\u0012\u0019C^P\u001f M\u000f\u0000\bNw\u000f\u000fSZK\u0018\u0016\u0004C7\bG\u0019R\u0006X\u0011L\t?";
        f4110[76] = "W\u0004F6DA\\\u0006\u0013p?[Z\u0002\u001ahSi\u000eAE?\u0007>X\u0012\u001djYS\u000f\u0018\u001bi?";
        f4110[77] = "0v?b\u0003U**8`l^7;fn\u0000lc\u007f?1W;!wkdTT8|{\t\u0017\u000b7*>f\u000e\u0000'G}9\u0001Vb(d2\u0011;0v?b\u0003U**8`l";
        f4110[78] = "Z.\u0017\nS4G\"R\\6$M<%WS&F;\bQP0 >\u0014R\u000e5I,\u0016RUK";
        f4110[79] = "\u0016qtB4\"\u001a\u007f0\u0006W{\u0017m/\u0018;IG!uNWz\u0004i\u007f\u00148/Em7\u007f";
        f4110[80] = "\u001e<]\u000e=x\u00190\u0003PC,\u0010>XR/\u001eD{\u0001\rCx\u0000&ZIzt\u0006?J5";
        f4110[81] = "~k73Fg)a10 o|{01L]+<ak\u001d\nja9oKckj+8 ";
        f4110[82] = ">\\/.\r :Y5ch5<Y6x\u0004\u0007h\u001ai#YP Ol%\n75\u0019fbh30B+$\f*m\u001b=\u001fX<>W<dS4+_V|\u00165j[g{\u001ak4%";
        f4110[83] = "d/2Me\u0013d8zZ]\u0018?8f[\nOde:\f]L.ex\u000f8L3-o";
        f4110[84] = "\"\"\n\u0012:JGC\nE0LD%\n\u0004+DF^g\u0013lCI\u001c\\u001f5LX%V\u00002O^\u001cZ\u0006+_\"\"\"";
        f4110[85] = "(O\u0017n&/,J\r#C:*J\u000e8/\b~\tQb{_{K\u000e-;5\u007f_T4C";
        f4110[86] = "x/\u0014DSR!&\u0005\u0003i\rp4\bX\u0005?$yU\u0004Yh!5\bM\u0011\u0002%!RTi";
        f4110[87] = "_5I9lf[!\u0013 \u0014i\u000e4I,x[Yt\u0018v/\f\u001awTp-w\u0006&J \u00140\u001e([3~4\nrBK";
        f4110[88] = "P,\f,S\u0019\u001d!\u000f!<CO<\u0000/Pq\u001b\u007f_x\u0007&\u0019)\u0012y\u0000\u0018\u001c%\t+<";
        f4110[89] = "!~$\u000f\u0010!*|qIk;,xxQ\u0007\tx;'\t[^}yxD\u00134ym\"]k1-c}P\u0006f'e~6[2.vrMP:;~\u0018V\u0011bx\u007fg]\u00137>\u0004";
        f4110[90] = "n\u001b\u007f\u0010\u0007g9\u0011y\u0013am{\u001by\u0013\bn\u0001\f(\u0018\f2n\u0015#\ba";
        f4110[91] = "\u001f\u000eU/^P\u0002\u0002\u0010y;N\u0003\u001eLpVd\f\u0004@n_F\u0019\rurVP;\r@o\\Ue\u0005[p\u0003KT\u0003@uJ/\u0000\u0010H+_\u001e\u0006\u000bMb;\u0013\u0018\u0000YkQ\u0017\fZ@\u0013";
        f4110[92] = "2CeYf2g\u0002a\u0011\r37Py\u0005Zdm\u0007 i0a4A,\u00042,8\u0006";
        f4110[93] = "e=;\r\u0011\u001d<4*J+Bm&'\u0011Gp;azI\u0012'<''\u0004SM83}\u001d+";
        f4110[94] = "\u0013Qg\u000b^'\u0017Qq\u0014:\u007f\u0015F`\u001eVMH\u00068C:aHWmAUxCG\u0000\u0002\nw\u0015\u0002o\u001b\u0001gx\u0000zI@\"\u001d\u0000m\u0001W\u001aIGd\u001bF#EA}\u000b:q\b\u0005z\u0015^k\u0004Emy";
        f4110[95] = "\u001eKVe\u001d-\u0015CCmw3C[Yp\u001b\u0001\u0017\u001f\u0003)OVU\u0017TzO9L\u001cD\u0017";
        f4110[96] = "nv|?\n\u0019bx8{iH{k.f\u0012%l,)iP\u001e`u&xi\u0014\u007fr%~P\u0018yk5\u0002";
        f4110[97] = ":-i\u0003^b=1#\u0017<6j3s\u000eP\u0004=p)Y\u0001Sb?pQXbd$u\u0018<6w,+\r\r0l)bi";
        f4110[98] = "@*jPlJ\u0017 lS\nYF\"pXq'\u0016|4\t5\\D{1Zz'";
        f4110[99] = "F\u0007\u00041kfB\u0002\u001e|\u000esD\u0002\u001dgbA\u0010AB<>\u0016K\u0001\u001brukMO\u000fr\u000euH\u0019\u0000;jl\u0015@\u0016\u0000>zF\f\u0017{5rS\u0004}cps\u0012\u0000Ld|-L~";
        f4110[100] = "c\u0003Zh\u0003t:\nK/9+k\u0018FtU\u0019;T\u001c\"9*x\u001c\u0016xV\u007f9\u0018^\u0013";
        f4110[101] = "h\u0000vH\rLl\u0000`Wi\u0014n\u0017q]\u0005&:T.\u0006Sql\u0012h\u000b\f\u0001h\u0017rFi\u0011yW(A\u0016\u001a{\u0002n:";
        f4110[102] = "oNt\u0014a=(Xm\u0013\u0019<~I\u007f\u001eu\u000e\"\b%A\u0019<cV'\u001d(:xSny";
        f4110[103] = "-\u001b\u0003_s`)\u000fYF\u000bo|\u001a\u0003Jg](^Y\u0014\u000b7-\u0004\u001f\u001cf5`\bX-7wq\u0014\u001bG3c+\rc";
        f4110[104] = "\tW\u001dc\u0015J\rCGzmNTG\u0019}:\u0019\u000e\u0017D\u0011P\u001cWVL|RQ[\u0011";
        f4110[105] = "l9\u001d}p150\f:Jnd\"\u0001a&\\4nZ8Jny=Yb{hb8\u0010\u0006vvi,\u0019lrb35a";
        f4110[106] = "9n?3|\\>ru'\u001e\bip%>r:=2yb m90'%/\u0000;}+b\u001eP8n9hsRub~Y#Qfpt4!\u001cj7Ed\"\u000fx=(fo\u0003?\f";
        f4110[107] = "\u0016\r6pB3\u001d\u0005#x(-K\u001d9eD\u001f\u001fYc<\u0013H]Q4o\u0010'DZ$\u0002";
        f4110[108] = "0K\u0016d-o;IC\"Vu=MJ::Gi\u000e\u0015mm\u0010kXXlj.nTC>V";
        f4110[109] = "RPX=\u0003.R\u0010\u001e{j#b\rC \u0003&\t\u0001J?\rJ\u000f\u0000A+\u0006!\u0003\t^%j";
        f4110[110] = "\u000eo#\u0010X@\tc}N&\u0014\u0000m&LJ&T(~\u0014&\u0015\u0013iv@I@Rm>+";
        f4110[111] = "{M\u0011d5(:QUj^$lNkf!-sI\u0016`o9s2\be96:V\u00118` \u0001\u0002\u0007k,!z\t\u000f~$KhWQ94;9V\r<^(\u007fWPzo/s\t\u000e\u0004";
        f4110[112] = "Y\u001e:&q,XEp-\u0001kL\u00056\u001co-O\u0015s'ct@\u0004J-|sC\u0002s!zjS~";
        f4110[113] = "\u001a%wW\u001fB\u001ae1\u0011v\u0275*%`G\u0004LQ.hR\f&Oeo\u0010\u0012\u0017I~jYv";
        f4110[114] = "y>\bN~cr6\u001dF\u0014}$.\u0007[xOucY\u0007$\u0018'4\u001d\\vt/j\u000eZ\u0014(%=\u0015Vo#-(\u001d<";
        f4110[115] = "{si\u0005\r\u0010~1|\u001a}\u0015#bv\t*J{?+e\u0006K/b*\n\u001f@?";
        f4110[116] = "QuT6*+\u0006\u007fR5L#SeS4 \u0011\u0007!\nmrF\u0007#V8.)ZdV=(F";
        f4110[117] = "\u0000\u0005\u007fAZaA\u0019;O1l\u001b\u0017aMf8AC9\u001b1x\u0005\u0000eJR9\u0019Dk";
        f4110[118] = "('QXI\"-eDG9'p6NTnx(k\u00128By|6\u0012W[rl";
        f4110[119] = "\t\u0017ggV|\\Vc/=v\u0000\u0015\u007f0QDTQ'f=.Q\u000bcfP,\u001c\u0007$W\u0000/\u000f\u0015.:\u0002b\u0003R\u001fj\u0001q\u0011XrhL}Vi{)E#\u0006\u0006.hAkm";
        f4110[120] = "&HKgs_\"\\\u0011~\u000bPwIKrgb#\r\u0011-\u000b\tgUYma\rs\u000f@\u00157HzGS\u007f3\\ ^+";
        f4110[121] = "F3\u0010\u0007)AGa\u001eBSF\u0014#OY?tGg\u0011\u0002m#\u0006gCXbO@a\u0016\u0006S";
        f4110[122] = "qU\u0011!8X,\u0012\u0011$>7%\u0016\t#>LH\u0001N$1\u000es\r\u0017+ 7y\u0012\u0010(&\u000eu\u0014\t8Z";
        f4110[123] = "0mD$iW0-\u0002b\u0000o\u0000aB;rKjeVak3< _)xY84\u00050\u0000_`f\u00028<Sn\"F[1Nd?Cb=H}/?`iA1a\u0001eeZc]";
        f4110[124] = "\\,\u0012,?rW$\u0007$Ud\u0015=\u0014:.\t\u0002z\u00135l2\u000e#\u001c$U8\u0011$\u001f\"l4\u0017=\u000f^";
        f4110[125] = "/?vQ(E(3(\u000fV\u0011!=s\r:#uy\"TVIp#o[;K=/(jkH.=\"\u0007i\u0005\"z\u0013Wj\u00160p~U'\u001awAp\u00143O2pw\u0018m\u0011L";
        f4110[126] = "\u001b}\u007f=<1\u001ca5)^eKce02W\u001f\">ja\u0000\u001b#g+om\u0019nkl^{\u0016rho1b\u001db\u0005";
        f4110[127] = "\u0011=:#.v\u0015)`:VrL->=\u0001%\u0016}`Qk O<k<imC{";
        f4110[128] = "\u0019\"?.\u0012\u0001\u001fl+.i\u0019\u0016!9;\u0005+AccfV|\n7cf\u000b\u001b\u001fai!i";
        f4110[129] = "#\u007f\r;*\u0007v>\tsA\u0006&l\u0011g\u0016Q|;N\u000b|T%}Df~\u0019):";
        f4110[130] = "_YTam,TQAi\u00072\u0002I[tk\u0000V\r\u0001-;W\u0014\u0005V~?8\r\u000eF\u0013";
        f4110[131] = ".,qy\u001b:%.$?` #*-'\f\u0012wir\u007f_E~:\"2\n>u27:`";
        f4110[132] = "\u001fGfuCWB[z\u0012\u0549(\b\tk\u007f\u0011G\u0011\u0002{\u0012";
        f4110[133] = "7\u0019=OZ\u00121W)O!\n8\u001a;ZM8oXa\u0004\u0011o6\u0007<@\u001a\u000b/ZeV!_9\t)WZT1\u001c!=B\u00110]%\fE\u001dn\u0003[";
        f4110[134] = "'u\u0005N_*r4\u0001\u00064+\"f\u0019\u0012c|x1E~\ty!wL\u0013\u000b4-0";
        f4110[135] = "\u0018rm`\u0015\tM3i(~\b\u001daq<)_G6)PCZ\u001ep$=A\u0017\u00127";
        f4110[136] = "@sX7\u0003,E\u007fCe?|\u001awNjh+@!\u0011\u0006\u0004{\t+\u00168\u0001w\u0012y";
        f4110[137] = "W\u0015H\u007f\u0012\tS\u0015^`vQQ\u0002Oj\u001ac\u0005A\u00101K4\u0000\u0003O\u007f\u000e^\u0004\u0017\u0015fv\bA\u001e]u\u001c\fUDD\rFXS\fEvMPF\u0004/n\bQ\u0007\u0000\u001ei\u0004\u000fY~Mr\u0010FG\u0003K<\u0004F<\u001eU1OOC\u0015Wd\t4";
        f4110[138] = "\u0017d.^\u001e7\u0010xdJ|cGz4S\u0010Q\u0013;o\u0004A\u0006\u0017:6HMk\u0015w:\u000f|;\u0016d(\u0005\u00119[ho4";
        f4110[139] = "6\fOb\u0018j3\u0000T0$9t\u0018T7_Tc_S8\u001doo\u0006\\)$ep\u0001_/\u001div\u0018OS";
        f4110[140] = "#\u000e\u0005V\u00062#NC\u0010o\u03f9\u0013\u0002\u0003I\u001d.y\u0006\u0017\u0013\u0004V/C\u001e[\u0017<+WDBof\u007fQ\fC\u0014mwD\u0004)^ncUD[\u001e-|\u0002~\u0018\u00122qBG\u0014\u0014+a>\u0017LUkyNFM\tn\u0013\u0005\u0017[^j-\u0000\u001b@\fV";
        f4110[141] = "w5q\rXJ7vnZb]+qa\u0001\u000eo\u007f79^^8\u007fqz\u0006\u0012Sz3o\u0019b";
        f4110[142] = "\u0000WtC>\u001d\u0004Rn\u000e[\b\u0002Rm\u00157:V\u00112NdmSSm\u0000#\u0007WG7\u0019[";
        f4110[143] = "\u0015\f*\u0003Q\u0000\u000fP-\u0001>\u000b\u0012As\u000fR9F\u0005)V\u0005n\u0004\r~\u0005\u0006\u0001\u001d\u0006nh";
        f4110[144] = "b\"\u001a\u0001\u0007gdl\u000e\u0001|\u007fm!\u001c\u0014\u0010M:cFK@\u001a|&\u0017\u001e\u0004~;0\u000e\u0019|";
        f4110[145] = "i\u0013Owz\u0010i\u001b\u001b*D\u001cp\u001a\u0013hDO(\u001f\b#)Me\u0013O\u0012yNv\u0001E\u007f{\u0003zFt";
        f4110[146] = "b\u0010x\\\u007f&/\u001d{Q\u0010|}\u0000t_|N)C+\b,\u0019,\u0001tJhs(\u0015.S\u0010";
        f4110[147] = "?l\u0010;f\u0011jh\t>bsc9\u0005%{\u001fQmI}#N\u00068\u0019~!\u0010:4\u0017:es:)\u00197d\u0019>=C.\u001cO{4\u000b=vKon\u0012Ex\r~d\u0012*-Lz,y=|\u0003<$B<'I7TDy~\u000f79F4rH\u0006&\u0015)x\u001c9k\u0018*us";
        f4110[148] = "wG\u000f \u0002DeE\u000f{|HdF\u000b\u007f\u0010z2\u0002T%C-5G\u000bj\u0004G1SQs|IwB[s\u0013\u001c6F\u0013\u0018";
        f4110[149] = "EJSt1DAJEkU\u001cC]Ta9.\u001e\u001a\u000e>UIBNFl.BJ[N\u00067\u0006HSO{1H\\S4";
        f4110[150] = "Kb.b\u007fPK\"h$\u0016\u0269{=,d'Q\u000b9)~j4\u00032%'f\u000f\u0002io,\u0016T\u0001nlfi_\u0003;*\u001d";
        f4110[151] = "\u001d;bSi\"\u0004f;ER#\u0013&eI>\u0011Ge:\u0012nFB'e\\*,F3?ERz\u0003:wV8~\u0017`n.<|\u00101<\u00150%\u001f \u0005^hy\u001d%jU+~\u0017ZuNby\u00071z\u00155w~4?@9\u007fE8fO(F";
        f4110[152] = "&|\fSt\u0018-~Y\u0015\u000f\u0002+zP\rc0\u007f9\u000fZ3gz{P\u0018w\r~o\n\u0001\u000f";
        f4110[153] = "}R\u001c*w4(\u0013\u0018b\u001c5xA\u0000vKb\"\u0016^\u001a!g{PUw#*w\u0017";
        f4110[154] = "'{/G\u0006Oa}z\u00197F5?#F[tf{}\u001a\b#i>'CK\u001ae8>S7F( {E\u0006@3%2!";
        f4110[155] = "E}}\u001e)v\u0007go\u000bX(Vzk\f\u000fw\u0006'0`$=\\zw\u0004c+E}";
        f4110[156] = "\u0006#AiN_\u001adU5%N\u001e3W8r\u0019Db\u0003T\\]\rcX+@\u001a\u0019?";
        f4110[157] = "HA0}\u0004J\b\u0002/*>]\u0014\u0005 qRoIBz.>\b\u0015\u00162|E\u0003\u001d\u0003:\u0016\\G\u001f\u000b;kZ\t\u000b\u000b@";
        f4110[158] = "]Xue\u001d~ZD?q\u007f*\rFoh\u0013\u0018Y\u0005?5EO]\u0006msN\"_Ka4\u007f4PWb7\u0010-[G\u000f";
        f4110[159] = "kx\u001e)Y!j*\u0010l#-5yE|tzk.\u001d\u0010F$(o\u001b*\u001f-9(";
        f4110[160] = "\u0000\u0018}_(\\Q\u0019!ZBI\u0004\u0001'\u0005.{PC~S\u007f,\u0005\u001d|_!\u0010\t\u00138\u001bBE\fGz\b2\u0014\r\u001b\u007fb";
        f4110[161] = "E4v\u0012qhA ,\u000b\tg\u00145v\u0007eU@q,]\t>\u0004)d\u0018c:\u0010s}`4>\u001b5'\r6s\u0017r\u0016";
        f4110[162] = """
                     [NM>aU\u001aR	0
                     X@\\S2]\u000f\u001e\f
                     o
                     L^KW5i
B\u000fY""";
        f4110[163] = """
                     j\u0013\u0003x6yn\u0007YaN~/\u0013
                     n5\u00138T\raw(4\r\u0002pN"+
                     \u0001vw.-\u0013\u0011
                     """;
        f4110[164] = "\u0017[(f#+B\u001a,.H!\u001eY01$\u0013J\u0015`ntDOX0.0.KLj=H \r]`='uLY(V";
    }
    
    private static Class m195(final long n2, final long n3) {
        final int m193 = m193(n2, n3);
        final Object o = Class220.f4110[m193];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(Class220.f4111[m193]);
                Class220.f4110[m193] = forName;
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
    
    private static Field m196(final Class clazz, final String anObject, final Class clazz2) {
        for (final Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    private static Field m197(final Class clazz, final String s, final Class clazz2) {
        final Field m196 = m196(clazz, s, clazz2);
        if (m196 != null) {
            return m196;
        }
        final Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                final Field m197 = m197(interfaces[i], s, clazz2);
                if (m197 != null) {
                    return m197;
                }
            }
        }
        return null;
    }
    
    private static Field m198(final long n2, final long n3) {
        final int m193 = m193(n2, n3);
        final Object o = Class220.f4110[m193];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        final String s = Class220.f4111[m193];
        int index = s.indexOf(8);
        final Class m194 = m195(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        final String substring = s.substring(index, index2);
        ++index2;
        final Class m195 = m195(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m194;
        while (true) {
            final Field m196 = m196(clazz, substring, m195);
            if (m196 != null) {
                return (Field)(Class220.f4110[m193] = m196);
            }
            final Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    final Field m197 = m197(interfaces[i], substring, m195);
                    if (m197 != null) {
                        return (Field)(Class220.f4110[m193] = m197);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                final StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m194.getName()).append(' ').append(m195.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m195(1530243220108707L, 0L);
        }
    }
    
    private static Method m199(final Class clazz, final String anObject, final Class clazz2, final int n2, final Class[] array) {
        for (final Method method : clazz.getDeclaredMethods()) {
            Label_0097: {
                if (method.getName().equals(anObject) && method.getReturnType() == clazz2) {
                    final Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == n2) {
                        for (int j = 0; j < n2; ++j) {
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
    
    private static Method m200(final Class clazz, final String s, final Class clazz2, final int n2, final Class[] array) {
        final Method m199 = m199(clazz, s, clazz2, n2, array);
        if (m199 != null) {
            return m199;
        }
        final Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                final Method m200 = m200(interfaces[i], s, clazz2, n2, array);
                if (m200 != null) {
                    return m200;
                }
            }
        }
        return null;
    }
    
    private static Method m201(final long n2, final long n3) {
        final int m193 = m193(n2, n3);
        final Object o = Class220.f4110[m193];
        if (o instanceof String) {
            final String s = Class220.f4111[m193];
            int index = s.indexOf(8);
            final Class m194 = m195(Long.parseLong(s.substring(0, index), 36), 0L);
            ++index;
            final int index2 = s.indexOf(8, index);
            final String substring = s.substring(index, index2);
            int n4 = -1;
            int index3 = index2;
            do {
                ++n4;
            } while ((index3 = s.indexOf(8, ++index3)) > -1);
            final int n5;
            final Class[] array = new Class[n5 = n4 - 1];
            Class m195 = null;
            int n6 = index2 + 1;
            for (int i = 0; i < n4; ++i) {
                final int index4 = s.indexOf(8, n6);
                m195 = m195(Long.parseLong(s.substring(n6, index4), 36), 0L);
                if (i < n5) {
                    array[i] = m195;
                }
                n6 = index4 + 1;
            }
            Class superclass = m194;
            while (true) {
                do {
                    final Method m196 = m199(superclass, substring, m195, n5, array);
                    if (m196 != null) {
                        return (Method)(Class220.f4110[m193] = m196);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m194;
                    while (true) {
                        final Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                final Method m197 = m200(interfaces[j], substring, m195, n5, array);
                                if (m197 != null) {
                                    return (Method)(Class220.f4110[m193] = m197);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            final StringBuffer sb = new StringBuffer();
                            sb.append("NoSuchMethodException in ").append(m194.getName()).append(' ').append(m195.getName()).append(' ').append(substring).append('(');
                            int k = 0;
                            while (k < n5) {
                                sb.append(array[k].getName());
                                if (++k < n5) {
                                    sb.append(", ");
                                }
                            }
                            sb.append(')');
                            throw new IllegalStateException(sb.toString());
                        }
                        if ((clazz = clazz.getSuperclass()) != null) {
                            continue;
                        }
                        clazz = m195(1530243220108707L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m195(1530243220108707L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    private static MethodHandle m202(final MethodHandles.Lookup lookup, final MutableCallSite mutableCallSite, final String s, final MethodType methodType, final long n2, final long n3) {
        final char char1 = s.charAt(0);
        Field m198 = null;
        Method m199 = null;
        try {
            MethodHandle target;
            if (char1 == '\u00fe' || char1 == 'P' || char1 == '\u00cf' || char1 == 'J') {
                m198 = m198(n2, n3);
                final Class<?> declaringClass = m198.getDeclaringClass();
                final String name = m198.getName();
                final Class<?> type = m198.getType();
                if (char1 == '\u00fe') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == 'P') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == '\u00cf') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m199 = m201(n2, n3);
                final Class<?> declaringClass2 = m199.getDeclaringClass();
                final String name2 = m199.getName();
                final MethodType methodType2 = MethodType.methodType(m199.getReturnType(), m199.getParameterTypes());
                if (char1 == '\u00d2') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == 'E') {
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
            sb.append(ex.getClass().getName()).append(" : ").append((m198 != null) ? m198.toString() : ((m199 != null) ? m199.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    private static Object m203(final MethodHandles.Lookup lookup, final MutableCallSite mutableCallSite, final String s, final MethodType newType, final Object[] array) {
        int n2 = array.length - 2;
        final MethodHandle m202 = m202(lookup, mutableCallSite, s, newType, (long)array[n2], (long)array[++n2]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m202, newType));
        try {
           return m202.asSpreader(Object[].class, array.length).invoke(array);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    
    private static CallSite m120(final MethodHandles.Lookup p0, final String p1, final MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class220.m120:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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

   private static int dcmpl(double var0, double var2) {
      return Double.compare(var0, var2);
   }

   private static int dcmpg(double var0, double var2) {
      return Double.compare(var0, var2);
   }
}
