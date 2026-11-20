// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import net.minecraft.entity.Entity;
import org.rusherhack.client.api.events.network.EventPacket;
import org.rusherhack.core.event.type.EventCancellable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import org.rusherhack.core.event.stage.Stage;
import net.minecraft.network.packet.Packet;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import java.util.HashMap;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.lang.invoke.MethodHandles;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import net.minecraft.client.network.ServerInfo;
import org.rusherhack.client.api.ui.window.WindowViewHandlerBase;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import java.util.Map;
import java.util.LinkedList;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.system.IServerState;

import org.rusherhack.command.clear;
public class Class164 implements IServerState, Globals
{
    public double f3258;
    public static Class164 f3259;
    public float f3260;
    public long f3261;
    public int f3262;
    public float f3263;
    public double f3264;
    public boolean f3265;
    public double f3266;
    public LinkedList<Double> f3267;
    public int f3268;
    public long f3269;
    public float f3270;
    public boolean f3271;
    public static long f3272;
    public static String f3273;
    public static long[] f3274;
    public static Integer[] f3275;
    public static Map f3276;
    public static long f3277;
    public static Object[] f3278;
    public static String[] f3279;
    
    public long getLastUpdate() {
        long n = Class164.f3272 ^ 0x7624A4FBB4ECL;
        return this.f3269;
    }
    
    public Class164() {
        long n = Class164.f3272 ^ 0x6E9547F2C627L;
        float f3263 = 20.0f;
        long f3264 = Class164.f3277;
        int f3265 = 20;
        this.f3268 = f3265;
        this.f3261 = f3264;
        this.f3269 = f3264;
        this.f3267 = new LinkedList<Double>();
        this.f3263 = f3263;
    }
    
    public double getPlayerY() {
        long n = Class164.f3272 ^ 0x40523623AD5DL;
        return this.f3258;
    }
    
    public boolean isPlayerSprinting() {
        long n = Class164.f3272 ^ 0x5460DE89B5ECL;
        return this.f3265;
    }
    
    public ItemStack m6982(Hand hand) {
        return null;
    }
    
    public String getServerIP() {
        return null;
    }
    
    public boolean isPlayerSneaking() {
        long n = Class164.f3272 ^ 0x5D706A0E96EFL;
        return this.f3271;
    }
    
    @Subscribe
    public void m6983(EventPacket$Receive p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          66527022567350
        //     6: lxor           
        //     7: lstore_2       
        //     8: aload_0        
        //     9: aload_1        
        //    10: astore_0       
        //    11: astore_1       
        //    12: invokestatic    org/rusherhack/Class253.m9155:()I
        //    15: invokestatic    java/lang/System.currentTimeMillis:()J
        //    18: lstore          5
        //    20: istore          4
        //    22: aload_0        
        //    23: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //    26: instanceof      Lnet.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
        //    29: iload           4
        //    31: ifeq            93
        //    34: ifne            86
        //    37: goto            44
        //    40: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    43: athrow         
        //    44: aload_0        
        //    45: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //    48: instanceof      Lnet.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
        //    51: iload           4
        //    53: ifeq            93
        //    56: goto            63
        //    59: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    62: athrow         
        //    63: ifne            86
        //    66: goto            73
        //    69: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    72: athrow         
        //    73: aload_1        
        //    74: lload           5
        //    76: putfield        org/rusherhack/Class164.f3269:J
        //    79: goto            86
        //    82: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    85: athrow         
        //    86: aload_0        
        //    87: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //    90: instanceof      Lnet.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
        //    93: ifeq            112
        //    96: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    99: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   102: ifnonnull       117
        //   105: goto            112
        //   108: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   111: athrow         
        //   112: return         
        //   113: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   116: athrow         
        //   117: aload_1        
        //   118: getfield        org/rusherhack/Class164.f3267:Ljava/util/LinkedList;
        //   121: invokevirtual   java/util/LinkedList.size:()I
        //   124: iload           4
        //   126: ifeq            166
        //   129: iconst_5       
        //   130: if_icmpge       168
        //   133: goto            140
        //   136: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   139: athrow         
        //   140: aload_1        
        //   141: getfield        org/rusherhack/Class164.f3267:Ljava/util/LinkedList;
        //   144: ldc2_w          20.0
        //   147: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   150: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   153: aload_1        
        //   154: lload           5
        //   156: putfield        org/rusherhack/Class164.f3261:J
        //   159: goto            166
        //   162: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   165: athrow         
        //   166: pop            
        //   167: return         
        //   168: lload           5
        //   170: aload_1        
        //   171: getfield        org/rusherhack/Class164.f3261:J
        //   174: lsub           
        //   175: lstore          7
        //   177: ldc2_w          1000.0
        //   180: aload_1        
        //   181: dup_x2         
        //   182: dup_x2         
        //   183: lload           5
        //   185: putfield        org/rusherhack/Class164.f3261:J
        //   188: lload           7
        //   190: l2d            
        //   191: ddiv           
        //   192: ldc2_w          20.0
        //   195: dmul           
        //   196: dstore          5
        //   198: getfield        org/rusherhack/Class164.f3267:Ljava/util/LinkedList;
        //   201: dload           5
        //   203: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   206: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   209: pop            
        //   210: getfield        org/rusherhack/Class164.f3267:Ljava/util/LinkedList;
        //   213: iload           4
        //   215: ifeq            255
        //   218: invokevirtual   java/util/LinkedList.size:()I
        //   221: ldc             60
        //   223: if_icmple       248
        //   226: goto            233
        //   229: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   232: athrow         
        //   233: aload_1        
        //   234: getfield        org/rusherhack/Class164.f3267:Ljava/util/LinkedList;
        //   237: invokevirtual   java/util/LinkedList.removeFirst:()Ljava/lang/Object;
        //   240: pop            
        //   241: goto            248
        //   244: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   247: athrow         
        //   248: dconst_0       
        //   249: dstore          5
        //   251: aload_1        
        //   252: getfield        org/rusherhack/Class164.f3267:Ljava/util/LinkedList;
        //   255: invokevirtual   java/util/LinkedList.descendingIterator:()Ljava/util/Iterator;
        //   258: astore_0       
        //   259: iconst_0       
        //   260: istore          7
        //   262: aload_0        
        //   263: invokeinterface java/util/Iterator.hasNext:()Z
        //   268: ifeq            314
        //   271: iload           7
        //   273: ldc             20
        //   275: aload_1        
        //   276: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   279: pop            
        //   280: if_icmpge       314
        //   283: goto            290
        //   286: invokestatic    org/rusherhack/Class164.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   289: athrow         
        //   290: dload           5
        //   292: aload_0        
        //   293: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   298: checkcast       Ljava/lang/Double;
        //   301: iinc            7, 1
        //   304: invokevirtual   java/lang/Double.doubleValue:()D
        //   307: dadd           
        //   308: dstore          5
        //   310: aload_0        
        //   311: goto            263
        //   314: aload_1        
        //   315: dload           5
        //   317: iload           7
        //   319: i2d            
        //   320: ddiv           
        //   321: d2f            
        //   322: putfield        org/rusherhack/Class164.f3263:F
        //   325: return         
        //    StackMapTable: 00 1B FF 00 28 00 05 07 00 F6 07 00 02 04 01 04 00 01 07 00 5C 03 4E 07 00 5C 43 01 45 07 00 5C 03 48 07 00 5C 03 46 01 4E 07 00 5C 03 40 07 00 5C 03 52 07 00 5C 03 55 07 00 5C 43 01 01 FF 00 3C 00 06 07 00 F6 07 00 02 04 01 03 04 00 01 07 00 5C 03 4A 07 00 5C 03 46 07 00 47 FF 00 07 00 06 07 00 E5 07 00 02 04 01 03 01 00 01 07 00 E5 56 07 00 5C 03 17
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  22     37     40     44     Ljava/lang/MatchException;
        //  34     56     59     63     Ljava/lang/MatchException;
        //  44     66     69     73     Ljava/lang/MatchException;
        //  63     79     82     86     Ljava/lang/MatchException;
        //  93     105    108    112    Ljava/lang/MatchException;
        //  96     113    113    117    Ljava/lang/MatchException;
        //  117    133    136    140    Ljava/lang/MatchException;
        //  129    159    162    166    Ljava/lang/MatchException;
        //  198    226    229    233    Ljava/lang/MatchException;
        //  218    241    244    248    Ljava/lang/MatchException;
        //  263    283    286    290    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
    
    public float getTPS(boolean b) {
        long n = Class164.f3272 ^ 0x2181FC1E4DAFL;
        try {
            if (b) {
                return Math.min(this.f3263, 20.0f);
            }
        }
        catch (MatchException ex) {
            ex.printStackTrace();
        }
        return this.f3263;
    }
    
    static {
   }
    
    public float getPlayerYaw() {
        long n = Class164.f3272 ^ 0x27FFCF9FCFD0L;
        return this.f3270;
    }
    
    @Subscribe
    public void m6984(EventLoadWorld eventLoadWorld) {
        long n = Class164.f3272 ^ 0x43DB742C7E80L;
        this.f3267.clear();
        this.f3261 = System.currentTimeMillis();
    }
    
    public double getPlayerX() {
        long n = Class164.f3272 ^ 0x4AA93D3D849CL;
        return this.f3264;
    }
    
    public int getPlayerSlot() {
        long n = Class164.f3272 ^ 0x63A75A2743FBL;
        return this.f3262;
    }
    
    @Subscribe(stage = Stage.POST, priority = -1337)
    public void m6985(EventPacket$Send eventPacket) {
        
    }
    
    public float getPlayerPitch() {
        long n = Class164.f3272 ^ 0x64C1DFCD6795L;
        return this.f3260;
    }
    
    public double getPlayerZ() {
        long n = Class164.f3272 ^ 0x3BFB825E308CL;
        return this.f3266;
    }
    
    public static MatchException m285(MatchException ex) {
        return ex;
    }
    
    public static String m117(byte[] array) {
        int count = 0;
        int length;
        char[] value = new char[length = array.length];
        for (int i = 0; i < length; ++i) {
            int n;
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
    
    public static CallSite m120(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class164.m120:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static void m157() {
        Object[] f3278 = Class164.f3278;
        f3278[0] = "K(\bf\u0004\u000fW2\n:\u001e\u001bG1A\u012c";
        f3278[1] = Float.TYPE;
        Class164.f3279[1] = "java/lang/Float";
        f3278[2] = Long.TYPE;
        Class164.f3279[2] = "java/lang/Long";
        f3278[3] = "'0>x,X,?/7OU92 \\zW(!<pmZ";
        f3278[4] = ".0^#\u00172%?Olt?09";
        f3278[5] = Double.TYPE;
        Class164.f3279[5] = "java/lang/Double";
        f3278[6] = Integer.TYPE;
        Class164.f3279[6] = "java/lang/Integer";
        f3278[7] = "Ur\u0005\u0011d$Ur\u0012Mh+O9\u0012Sh>HH@\r?u";
        f3278[8] = "BSwHJ.BS`\u0014F+X\u0018`\nF>_i4R\u0011";
        f3278[9] = "x\u0007Ru0gx\u0007E)<hbLE7<}e=\u0017mk?";
        f3278[10] = "9SM3<m9SZo0b#\u0018Zq0w$i\b*h=";
        f3278[11] = "hhLq:\ntrN- \u001edq\u0005\u0106";
        f3278[12] = ",\u007f";
        f3278[13] = "X\u0017\u0000k\"0D\r\u000278$T\u000eI&<,R\u000b\u0013k15^K )?'V\t\u0014";
        f3278[14] = "\u0000Rw\u001eZ3\u0000R`BV<\u001a\u0019`\\V)\u001dh0\u0001\u0007";
        f3278[15] = "Y\u0005e\u001ev\u0002G\r\u007fQ\u0011\u0003V\u0016r\u000b7\u0005";
        f3278[16] = "\thq_\u0001\u0011\u0002g`\u0010`\u001f\tldJ";
        f3278[17] = "q.:\u001eD#z!+Q. n- \u001a";
        f3278[18] = "l'+\u0011N\u0005p=)MT\u0011`>b\u0239";
        f3278[19] = "\u0013#m\u0004\u0002\u001b\u000f9oX\u0018\u000f\u001f:$I\u001c\u0007\u0019?~\u0004\u0011\u001e\u0015\u007fo\\\u0015\u0000\b\"$D\u0015\u001a\u000b>xA^+\n4d^ \u000f\u001f:o^";
        f3278[20] = "=A+s[]=A</WR'\n<1WG {mh\u000f\u0002";
        f3278[21] = "\u0018\u001d6J\u0005q\u0006\u0015,\u0005gm\u001c\u0017%Ogm\u0001\b";
        f3278[22] = Boolean.TYPE;
        Class164.f3279[22] = "java/lang/Boolean";
        f3278[23] = "8=\u0001\bK\u00038=\u0016TG\f\"v\u0016JG\u0019%\u0007C\u0015\u001e";
        f3278[24] = "[-YbGdE%C-&s[)Lw\u001a";
        f3278[25] = "\u001d{F<R\b\u0016tWs/\u001d\u0004nU0";
        f3278[26] = Void.TYPE;
        Class164.f3279[26] = "java/lang/Void";
        f3278[27] = "h\u000b'J\u0011rh\u000b0\u0016\u001d}r@0\b\u001dhu1ePN";
        f3278[28] = "t=uD}g\u007f2d\u000b\u0000\u007fl5mB";
        f3278[29] = "]\u001bi{k0A\u0001k'q$Q\u0002 6u,W\u0007z{x5[G{<72[\u0007j:nke\u0000`1v2d\u0000k\"Q$\\\rb0k\u0007S\u001ak";
        f3278[30] = "C\u0011[d\u0002dC\u0011L8\u000ekYZL&\u000e~^+\u001dr[5\t\u0017C+\u001c~rF\u0017~V";
        f3278[31] = "\u00001}vAd\u00001j*Mk\u001azj4M~\u001d\u000b;`\u001e5";
        f3278[32] = "\u000bv";
        f3278[33] = "!{o\u001b\u0016=!{xG\u001a2;0xY\u001a'<A)\rOl";
        f3278[34] = "-=G(\u0005C-=Pt\tL7vPj\tY0\u0007\u0001>^\u0012";
        f3278[35] = "h?yo\u0016]t%{3\fId&0\"\u000bZbc{7\u0001Fscj8\u0014M)\bh$\n\\D,p\"\u0001Dk,|-\u0001";
        f3278[36] = """
                    T\u00122R\u0018DMF4\u0012eUX\u0002?
                    \bgV\u001b(\u0003e\u0002YA)
                    \u000e\bB\u0013ln""";
        f3278[37] = "h7bW4'cb6UEpkfo\u0001\u0012%552m'p6o6\u0013 dfz";
        f3278[38] = "a|\u0012\u0001\u0014ruaOy\u01b8\u0016?a@\u0005\t}5z\u0012@";
        f3278[39] = "\tfuw.%\u001d{(\u000f\u046dA\u0012dylj3\u001e-g";
        f3278[40] = "\u001b\"=[j2\u000f?`#\u0553V\u0000 1@.$\fi/";
        f3278[41] = "Ah}m\u0010$Uu \u0015\u0000@\u001e|uoW,\u0015\"cqizKwk+\u0005q\u0015au\u0015";
        f3278[42] = "\u001bl\bOIQ]n\u000fR#OH)\u000fIO}\u001ekS\u0013\u001e*[,\u000fM\u001eXWe\u0011.";
        f3278[43] = ")(wa7\u00004=)c\u0006\u0018 /smj*ti)5?}3*si;\u000f?cm\nx\u0004-0.xtM3S";
        f3278[44] = "Z\u0018\\.9r\u001c\u001a[3Sl\t][(?^_\u0018\u0006sc\tZM\\v55\u001a\u001dQ,S";
        f3278[45] = "\u0013X\u001a*Wz\u0007EGR\u0491\u001e\u001bZ\u00193\u0015u\u0014XJ ";
        f3278[46] = "]P*r~9IMw\n\u04b9]\u0001H(ii`\u0002Y}k";
        f3278[47] = "obh/Xm{\u007f5W\u0203\tdfi5\u001aqw}d4";
        f3278[48] = "xM\u0000Aw\u0001wOSRL\u0006xO\u0004M*\u0006tR\u0000a0\u0007o]\u0013G6j|N\u000bE5\r/P\u0016[L";
        f3278[49] = "t+\u0000\u001ez4{)S\rA%t7\b\u0001,\u0011x(\u0014\u0003A5(?\u0013A<!vh\b\u007f";
        f3278[50] = "ai.~\u0000Wnk}m;Wh}(e;]gi'}FNasp\u001f";
        f3278[51] = "<HBoYraV^d)ml[_s~:3\u0006\u0004\u001fFa0Z\u0006 T8oQ";
        f3278[52] = "Pl[\"\u001dSU)\t?zERkM;\u0000RyuV\u001c\u0007[[\u0012Zk\u0017C\u0001oN5@X?x\u00017\u0006\u0001Bl_`\u001d?";
        f3278[53] = "jC}pP2=Kw03\u01e4ZOt2V37S#-\u000e";
        f3278[54] = "\u0001e4\u001fC\u0019\u001cpj\u001dr\u0001\bb0\u0013\u001e3^ iKHd\u000ba=\u0016I\u001c\u0018z0\u0017r";
        f3278[55] = "'\u0019OVz~9\u000fH\u0015A~/\u0014BO-L{R\u0019\u0016|\u001b&SP\u0017y{'\u0001FAA";
        f3278[56] = "f\u0012/\rG< \u0010(\u0010-\"5W(\u000bA\u0010b\u0010sU\u0012GcMv\u0010I,iV$U-";
        f3278[57] = "v@+]o[b]v%yRoc#LgRi`#Bj?/G5L(DmDy[\u0016";
        f3278[58] = "\b-dE7CU3xNGWT/}R+e\u0000n \u0005GP\u0005:'D~[Pn%5";
        f3278[59] = "=he\u0010&.<+&\u000f_8^s:M;) t.\u001d.\u0014<\u007fh\u0015bj;k8\u0000_";
        f3278[60] = "k4}f\u0014\u0014v!#d%\fb3yjI>6u#2\u001diq6yn\u0018\u001b}\u007fg\r[\u0010o,$\u007fWYqO";
        f3278[61] = ">?qNI;3.0U'i?)\u0019ALe?)AEIl\"99V]kbU";
        f3278[62] = "j4\u000b\u0018T\\e6X\u000bo^k!d\u0013^Z{s\u0019\u0007\u0000\r`M\n\u0006\u0002U<5\u0019\u001d\u000fT\u0007";
        f3278[63] = "\u0015*1\u001adj\b?o\u0018Ur\u001c-5\u00169@HkoNi\u0017J7k\r1|@,9HU,\u0017o)\u0015>&\f=lq";
        f3278[64] = "x\u0019\nwfO&\u0019\u001e0\u0004\u0012\"%@t}\u00079T\u001dja\f";
        f3278[65] = "_?/?j0Fk)\u007f\u00173]65nP#4i.=k)_c5o.M_?/?j0Fk)\u007f\u0017";
        f3278[66] = "9q|JC\u0004,{`\t$\u001c%]gTO\u0010:rc^$\u0013!{l\t\\\u0000:vm2";
        f3278[67] = "-\u001fAK\b6~\u0001\\Uq1-\u001ecC\u0001-D\u000bZC\u0013j<\u0018AN\u0012Q";
        f3278[68] = """
                    YMmR\u0001m
                    SpLxl]Gu7\u0012;]K7J\u0006e
                    P	""";
        f3278[69] = "']wN\u0007\u0004a_pSm\u001at\u0018pH\u0001(\"Z,\u0012Q\u007fg\u001dpLP\rkTn/";
        f3278[70] = ";0e;ZY:bsmb^%gvb\u000b]_7kv\u000b\u0007$uh:\u001c9";
        f3278[71] = "q>*\u007fY\u000ek4~93\u0511\u001asg6ZOa1dzMq";
        f3278[72] = "5\u0005E@GOs\u0007B]-Qf@BFAc5\u0004\u001d\u0010-\u000b0[P\u0019\u0012YoMG!";
        f3278[73] = "}\u0005XqB\u001ci\u0018\u0005\t\u0500x#\u0018\nu_\u0013)\u0003X0";
        f3278[74] = "Z0H\u0010Un\u001c2O\r?p\tuO\u0016SB^2\u0014K\u0006\u0015_o\u0011\r[~UtCH?";
        f3278[75] = "\tl\u0007i]w\u001dqZ\u0011\u038c\u0013\u0002h\u0006s\u001fk\u0011s\u000br";
        f3278[76] = "#\u007fR\u000f[t,}\u0001\u001c`d/tPn\\c<o\u0003\u0015\u001e`px=";
        f3278[77] = "&jddJ>`hcy  u/cbL\u0012\"h8<\u0010E#5=yD.).o< ";
        f3278[78] = "\t\u000em\u00060\u000fD_a\r\r\tN\u0002m\u0019d\n4Rp\rdPO\u0010sAsn";
        f3278[79] = "g\u0011!y\rnz\u0004\u007f{<vn\u0016%uPD8T|-\u0005\u0013m\u0015(p\u0007k~\u000e%q<";
        f3278[80] = "8o8T\u007fZ%zfVNB1h<X\"pe.f\u0001\u007f'grbC*Lmi0\u0006N\u001c:* [%\u0016!xe?";
        f3278[81] = "K\u000f\u0014w\\lMW\u0013u1iAN\u001f)][\u0015\bCr\u000b\f\u0010N\r'\u000fwRMA01";
        f3278[82] = "T%\u000e)QR\u00116\\`)Z\u000e*1gP_\fqCk\u0019Ao2HyJ\u0002\u001d>\u0001g)A\u0016,R$[M_21";
        f3278[83] = ">e|qp\\*x!\t\u04948gbb`7C%a.w";
        f3278[84] = "hI8w!7|Te\u000f\u024cS6Tjs<8<O86";
        f3278[85] = "R4l8\u0004\u0016\u0012dabbO\u0001$kf\u000e}Qd01b\u0016\u0010*b?\u0019T\u0013fu\u0001]\u0011\u000b*3>\u000fN\u001d=\u000b";
        f3278[86] = "P.[\u007fSW\u0007&Q?0\u0412`\"R=UV\r>\u0005\"\r";
        f3278[87] = "\u0001\u0004JX8-\u0015\u0019\u0017 \u024aI\u001a\u0006FC|;\u0016OX";
        f3278[88] = "\u0013w|~`\rNi`u\u0010\u0012CdabGE\u001d39\u000e.EEhouhGBu";
        f3278[89] = "o%\u0016R\u0003t{8K*\u0471\u00103=\u0014I\u0014-0,AK";
        f3278[90] = "V%wd>2K0)f\u000f*_\"shc\u0018\u000bd)1?O\t8-sk$\u0003#\u007f6\u000ftT`okd~O2*\u000f";
        f3278[91] = "ji&O9rw3uI\u0007&wta\u001ba1Vo~\u001bB,njz\r\u0007ti`x\u0018:wx5zv";
    }
    
    public static Field m707(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m708(Class clazz, String s, Class clazz2) {
        Field m707 = m707(clazz, s, clazz2);
        if (m707 != null) {
            return m707;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m708 = m708(interfaces[i], s, clazz2);
                if (m708 != null) {
                    return m708;
                }
            }
        }
        return null;
    }
    
    public static Method m710(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m711(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m710 = m710(clazz, s, clazz2, n, array);
        if (m710 != null) {
            return m710;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m711 = m711(interfaces[i], s, clazz2, n, array);
                if (m711 != null) {
                    return m711;
                }
            }
        }
        return null;
    }
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class164.m174:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
