// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.hud;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.core.feature.IFeatureConfigurable;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import javax.crypto.SecretKey;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import org.rusherhack.client.api.render.font.IFontRenderer;
import net.minecraft.text.StringVisitable;
import org.rusherhack.client.api.render.RenderContext;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import org.rusherhack.Class066;
import java.lang.invoke.MethodHandles;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.client.api.RusherHackAPI;
import java.awt.Color;
import java.util.Map;
import net.minecraft.text.Text;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.client.api.setting.ColorSetting;

public abstract class ShortListHudElement extends HudElement
{
    public ColorSetting f676;
    public double f677;
    public EnumSetting<ShortListHudElement$TextAxis> axis;
    public static double PADDING = 1.0;
    public Text[] f679;
    public double f680;
    public static Text COMMA_SEPARATOR_COMPONENT;
    public static long f681;
    public static String[] f682;
    public static String[] f683;
    public static Map f684;
    public static long[] f685;
    public static Integer[] f686;
    public static Map f687;
    public static Object[] f688;
    public static String[] f689;
    
    public ShortListHudElement(String s) {
    }
    
    public abstract Text[] getComponents();
    
    public double getWidth() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          76623175071591
        //     6: lxor           
        //     7: lstore_1       
        //     8: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.\u0254:()[Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_0        
        //    13: getfield        org/rusherhack/client/api/feature/hud/ShortListHudElement.\u0123:D
        //    16: aload_3        
        //    17: ifnonnull       99
        //    20: dconst_0       
        //    21: dcmpg          
        //    22: ifgt            95
        //    25: goto            32
        //    28: invokestatic    org/rusherhack/client/api/feature/hud/ShortListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    31: athrow         
        //    32: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    35: aload_3        
        //    36: ifnonnull       69
        //    39: goto            46
        //    42: invokestatic    org/rusherhack/client/api/feature/hud/ShortListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    45: athrow         
        //    46: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //    49: ifnull          75
        //    52: goto            59
        //    55: invokestatic    org/rusherhack/client/api/feature/hud/ShortListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    58: athrow         
        //    59: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    62: goto            69
        //    65: invokestatic    org/rusherhack/client/api/feature/hud/ShortListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    68: athrow         
        //    69: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    72: ifnonnull       95
        //    75: aload_0        
        //    76: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getFontRenderer:()Lorg/rusherhack/client/api/render/font/IFontRenderer;
        //    79: aload_0        
        //    80: invokeinterface org/rusherhack/core/interfaces/INamed.getDisplayName:()Ljava/lang/String;
        //    85: invokeinterface org/rusherhack/client/api/render/font/IFontRenderer.getStringWidth:(Ljava/lang/String;)D
        //    90: dreturn        
        //    91: invokestatic    org/rusherhack/client/api/feature/hud/ShortListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    94: athrow         
        //    95: aload_0        
        //    96: getfield        org/rusherhack/client/api/feature/hud/ShortListHudElement.\u0123:D
        //    99: dreturn        
        //    StackMapTable: 00 0C FF 00 1C 00 03 07 00 02 04 07 00 B4 00 01 07 00 86 03 49 07 00 86 43 07 00 9B 48 07 00 86 03 45 07 00 86 43 07 00 9B 05 4F 07 00 86 03 43 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  12     25     28     32     Ljava/lang/MatchException;
        //  20     39     42     46     Ljava/lang/MatchException;
        //  32     52     55     59     Ljava/lang/MatchException;
        //  46     62     65     69     Ljava/lang/MatchException;
        //  69     91     91     95     Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    static {}
    
    public double getHeight() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          92918254516928
        //     6: lxor           
        //     7: lstore_1       
        //     8: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.\u0254:()[Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_0        
        //    13: getfield        org/rusherhack/client/api/feature/hud/ShortListHudElement.\u043a:D
        //    16: aload_3        
        //    17: ifnonnull       97
        //    20: dconst_0       
        //    21: dcmpg          
        //    22: ifgt            93
        //    25: goto            32
        //    28: invokestatic    org/rusherhack/client/api/feature/hud/ShortListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    31: athrow         
        //    32: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    35: aload_3        
        //    36: ifnonnull       69
        //    39: goto            46
        //    42: invokestatic    org/rusherhack/client/api/feature/hud/ShortListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    45: athrow         
        //    46: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //    49: ifnull          75
        //    52: goto            59
        //    55: invokestatic    org/rusherhack/client/api/feature/hud/ShortListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    58: athrow         
        //    59: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    62: goto            69
        //    65: invokestatic    org/rusherhack/client/api/feature/hud/ShortListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    68: athrow         
        //    69: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    72: ifnonnull       93
        //    75: aload_0        
        //    76: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getFontRenderer:()Lorg/rusherhack/client/api/render/font/IFontRenderer;
        //    79: invokeinterface org/rusherhack/client/api/render/font/IFontRenderer.getFontHeight:()D
        //    84: ldc2_w          2.0
        //    87: dadd           
        //    88: dreturn        
        //    89: invokestatic    org/rusherhack/client/api/feature/hud/ShortListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    92: athrow         
        //    93: aload_0        
        //    94: getfield        org/rusherhack/client/api/feature/hud/ShortListHudElement.\u043a:D
        //    97: dreturn        
        //    StackMapTable: 00 0C FF 00 1C 00 03 07 00 02 04 07 00 B4 00 01 07 00 86 03 49 07 00 86 43 07 00 9B 48 07 00 86 03 45 07 00 86 43 07 00 9B 05 4D 07 00 86 03 43 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  12     25     28     32     Ljava/lang/MatchException;
        //  20     39     42     46     Ljava/lang/MatchException;
        //  32     52     55     59     Ljava/lang/MatchException;
        //  46     62     65     69     Ljava/lang/MatchException;
        //  69     89     89     93     Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    public void tick() {
        
    }
    
    public void renderContent(RenderContext renderContext, double n, double n2) {
        
    }
    
    public static MatchException m285(MatchException ex) {
        return ex;
    }
    
    public static String m1491(byte[] array) {
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
    
    public static String m657(int n, long n2) {
        return null;
    }
    
    public static Object m658(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        String m657 = m657((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, m657), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m657;
    }
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/client/api/feature/hud/ShortListHudElement.m132:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static int m175(int n, long n2) {
        return 0;
    }
    
    public static int m176(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        int m175 = m175((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, m175), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m175;
    }
    
    public static CallSite m177(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/client/api/feature/hud/ShortListHudElement.m177:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static int m1498(long n, long n2) {
        n ^= (n2 << 48 | n2);
        int n3 = (int)(n >>> 46);
        if (ShortListHudElement.f689[n3] != null) {
            return n3;
        }
        Object o = ShortListHudElement.f688[n3];
        if (!(o instanceof String)) {
            return n3;
        }
        int n5 = switch ((int)(n >>> 42 & 0x3FL)) {
            case 0 -> 41;
            case 1 -> 51;
            case 2 -> 9;
            case 3 -> 31;
            case 4 -> 57;
            case 5 -> 4;
            case 6 -> 35;
            case 7 -> 29;
            case 8 -> 39;
            case 9 -> 33;
            case 10 -> 20;
            case 11 -> 18;
            case 12 -> 63;
            case 13 -> 46;
            case 14 -> 60;
            case 15 -> 24;
            case 16 -> 61;
            case 17 -> 55;
            case 18 -> 48;
            case 19 -> 1;
            case 20 -> 3;
            case 21 -> 8;
            case 22 -> 45;
            case 23 -> 58;
            case 24 -> 50;
            case 25 -> 38;
            case 26 -> 25;
            case 27 -> 15;
            case 28 -> 32;
            case 29 -> 42;
            case 30 -> 43;
            case 31 -> 2;
            case 32 -> 10;
            case 33 -> 19;
            case 34 -> 14;
            case 35 -> 40;
            case 36 -> 27;
            case 37 -> 49;
            case 38 -> 26;
            case 39 -> 52;
            case 40 -> 37;
            case 41 -> 11;
            case 42 -> 16;
            case 43 -> 47;
            case 44 -> 5;
            case 45 -> 36;
            case 46 -> 23;
            case 47 -> 13;
            case 48 -> 30;
            case 49 -> 28;
            case 50 -> 59;
            case 51 -> 17;
            case 52 -> 56;
            case 53 -> 44;
            case 54 -> 0;
            case 55 -> 7;
            case 56 -> 22;
            case 57 -> 12;
            case 58 -> 21;
            case 59 -> 53;
            case 60 -> 62;
            case 61 -> 34;
            case 62 -> 54;
            default -> 6;
        };
        int[] array = new int[6];
        for (int i = 0; i < 6; ++i) {
            int n6 = (int)(n >>> 7 * (5 - i) & 0x7FL) - n5;
            if (n6 < 0) {
                n6 += 128;
            }
            array[i] = n6;
        }
        char[] charArray = ((String)o).toCharArray();
        for (int j = 0; j < charArray.length; ++j) {
            int n7 = array[j % array.length];
            if (n7 == 0) {
                break;
            }
            charArray[j] ^= (char)n7;
        }
        ShortListHudElement.f689[n3] = new String(charArray);
        return n3;
    }
    
    public static void m1499() {
        Object[] f688 = ShortListHudElement.f688;
        f688[0] = "/\u000b\u001b\u001d\u0006\u00193\u0011\u0019A\u001c\r#\u0012RP\u0018\u0005%\u0017\b\u001d\u0015\u001c)W\u001aV\u0015\u00185\u000b\u0019\u001d\u001c\u0019$W/[\u001b\u001e45\u0015@\u0000$5\u001d9_\u0011\u0001%\u0017\b";
        f688[1] = Double.TYPE;
        ShortListHudElement.f689[1] = "java/lang/Double";
        f688[2] = "y_6|iyy_! evc\u0014!>ecdepg2!";
        f688[3] = "\bQ[3+8\u0014KYo1,\u0004H\u0012~5$\u0002MH38=\u000e\rZx89\u0012QY318\u0003\rth=\b\u000bFQx79CbPt>#\nFRi";
        f688[4] = Integer.TYPE;
        ShortListHudElement.f689[4] = "java/lang/Integer";
        f688[5] = "=\u001d`Jo\u000e!\u0007b\u0016u\u001a1\u0004)\u0007q\u00127\u0001sJ|\u000b;Aa\u0001|\u000f'\u001dbJu\u000e6AO\u0011y>>\nj\u0001s\u000f";
        f688[6] = "m;!$\\iq!#xF}a\"hiBug'2$Olkg4o@xg;hlArvg\u000fLArv\u001b#dJyp,4";
        f688[7] = "u~l\u001fu9u~{Cy6o5{]y#hD-\u0002,h";
        f688[8] = "7E?FgI7E(\u001akF-\u000e(\u0004kS*\u007f~Z?\u0010";
        f688[9] = "[9\u0011ZK{G#\u0013\u0006QoW X\u0017UgQ%\u0002ZX~]e\u0010\u0011XzA9\u0013ZQ{Pe%\u001cV|@\u0007\u001f\u0007MFA/3\u0018\\cQ%\u0002PmkL?7\fP}";
        f688[10] = "\u0002l\u0014\u001cWP\u001ev\u0016@MD\u000eu]QIL\bp\u0007\u001cDU\u00040\u0015WDQ\u0018l\u0016\u001cMP\t0 ZJW\u0019R\u001aAQm\u0018z6^@H\bp\u0007\u0016\u0017";
        f688[11] = "S\u001f";
        f688[12] = """
                   \u001a1\u001b
                   v?\u0006+\u0019Vl+\u0016(RGk8\u0010m\u000fAp>\u001c-\u001b
                   W/\u00017\u0015Jc""";
        f688[13] = "#75^)8(8$\u0011H6#3 K";
        f688[14] = "f^\u0018\u0004]j{K@&\u001cgcM";
        f688[15] = """
                   mz;G\u0010[q`9\u001b
                   Oacr
                   
\\g&/\f\u0016Zkf;G'@we\u000f\f\u0016Zkf;""";
        f688[16] = "4\n?kS\u007fA*4dB0<2'cKyT";
        f688[17] = "\u001a\b17h.\u0011\u0007 x\u000b#\u0004\n/\u0013>!\u0015\u00193?),";
        f688[18] = "\t\t^h\u0017A\u0015\u0013\\4\rU\u0005\u0010\u0017%\t]\u0003\u0015Mh\u0004D\u000fUJ#\u0011@\u000f\u0015^h&[\n\u0014K\u0015\u0000@\u0012\u0012W!";
        f688[19] = "L\"wAr+G-f\u000e\u000f3T*oG";
        f688[20] = "!(\u001d-vl\u0017\r\u001d-a0\u001b\u0002\u0007fa.\u001b\u0017\u0000\u00170wLUH";
        f688[21] = ",3D`w~'<U/\u0014s2:";
        f688[22] = "(ntZ&94tv\u0006<-$w=\u00178%\"rgZ5<.2a\u0011:(\"n==\u0006))xv\u00065.+y!0";
        f688[23] = "P\u0007it\u00120L\u001dk(\b$\\\u001e 9\f,Z\u001bzt\u00015V[|?\u000e!Z\u0007 \u00132 Q\u0011k(\u00057\r1";
        f688[24] = "r973\u0019%n#5o\u00031~ ~~\u0004\"xe9s\u001f5o-1~\u000e#3\u0002\u001e|\u00065y";
        f688[25] = ",sVS;O0iT\u000f![ j\u001f\u001e%S&oES(J*/v\u0011&X\"mB";
        f688[26] = "q\u0000A[<?q\u0000V\u000700kKV\u00190%l:\u0006Da";
        f688[27] = "Gj*h\u0016mGj=4\u001ab]!=*\u001awZPhuC";
        f688[28] = "y]\u001fYR\u0010y]\b\u0005^\u001fc\u0016\b\u001b^\ndg\\C\t";
        f688[29] = "U}k\u0016\u0006 IgiJ\u001c4Yd\"[\u0018<_ax\u0016\u0015%S!^M\u0007=_}DY\u0017>{_E";
        f688[30] = "\u0003\u001bd-\u0014%\u001f\u0001fq\u000e1\u000f\u0002-`\n9\t\u0007w-\u0007 \u0005Gpz\u0015$\t\u0004-J.%\b$bm\u00077\t\u001b";
        f688[31] = Boolean.TYPE;
        ShortListHudElement.f689[31] = "java/lang/Boolean";
        f688[32] = "U\u00196\u0014w%I\u00034Hm1Y\u0000\u007fYj\"_E4L`>NE\"Og#Y\u00198X`~i\u001e3If\"S\t4HG1I\u000e";
        f688[33] = "f\u001bea0SP>ea'\u000f\\1\u007f*'\u0011\\$x[vH\u000bf0";
        f688[34] = "1\u0018m ne-\u0002o|tq=\u0001$msb;Dlk}d+\u0018o UV;\u000b~{nu\u001d\u0005dhuw+\u0018klpu";
        f688[35] = ",j\u001c]\u001c)\u0005S\u0000G\u001eu\u001fG\u0010DUd\u0018T\u0016\u0001\bb\u0003R\u001aA\u001c)$C\u0007[\u0012i\u0010\u001d";
        f688[36] = Void.TYPE;
        ShortListHudElement.f689[36] = "java/lang/Void";
        f688[37] = "JZQQ\u001f\u0005V@S\r\u0005\u0011FC\u0018\u001c\u0002\u0002@\u0006C\u000b\u0004\u001cV\u0006b\u0016\u0000\u0015W";
        f688[38] = "C\u001c\b\u0001\u001eW]\u0014\u0012NVWG\u001e\n\t_L\u0007?\u0011\u000f\\GH\u0013-\u0015@RE\u0014\u001b\u0012";
        f688[39] = "=+`h4~|99\rdpx\t:hszb/;qp\u001db-;q6}i/$s\u000b";
        f688[40] = "\n-_Xp\u0013K?\u0006=\u0164pH-\u0003VqNV;\u0013";
        f688[41] = "6V-sq9wDt\u0016\u0005\u001dJzYA\u0015\u0017WvJ_\u0012\u001dUh[Q\u000b\u0002Hy]P\u0012Z6@`i>?>\u0001k+";
        f688[42] = "9FN\r^sz\\\u0007\r vyK\u001e\u000fIu\u0003\u001d\u000f\u001bMp=\u0019D\u0005]\u0011";
        f688[43] = "0}n\n@9z&4Sq&ff\u001fV\u0010&m\u007f;T\rI1{gV\u000f+ra.Vq";
        f688[44] = "\u0011Z\u0015\u0012K9\u0010\u000f\u001dC34\u001c\u0017:IH#\u0015\u0002\u0007nZ>\u001ck\u001aO\fgO\u0000FA\t8q";
        f688[45] = "\u0011\u001bh+m\u0015QJ)#TC@\u000eXt2Pm\u001fw|4P-\t\u007fr?\u0012\u0013\u0017ibT";
        f688[46] = "(\u0016U;D\u0014hG\u00143}An\u0016TX\u0001Wu\u0019D\u0003@\u0016%\u0004Gq\u0019\u0011o\u0014+x\u0014L\u007fA\u0015f\u0002\\\u0014\u0004Bb\u0016\u0013*\u001aTr}\u0017d\rFbC\u0013/\u0013V\u0003\u0006Du\u0014\u0015=\u0018Re\u007f";
        f688[47] = "M\u0006:+A-EG1i1-\u0019\u0005*3]\u001fNFtj\bHI\u0004$oN3\u001b\u001a#.1";
        f688[48] = "P!^_wB\u00123A^G\u001c\u0014#R\\.\u001fnuCH*\u001aPq\bV:{";
        f688[49] = "G\u0006GHx#\u0014VAZ\u001bax\u0007E]r|\u001cTF]\"";
        f688[50] = "5\u0003 \u0002Ng:\u000f&\b7g>\u000b<CKp)?0DK|5\u000b&8P{h\u0007/\u0000Ym1\u0002]@X.4\u0006/SXw7d";
        f688[51] = "YB'*\rSJ\u00064>kN \u0010/jW\\KL!o\bbL\u001bwiU\t\u0010\u0015r6k";
        f688[52] = "/Ld3d2'\roq\u00142{Ot+x\u0000*\b(s,WzT+p*<&Z./\u0014jk]/3o8uZnL";
        f688[53] = "\u000b\bayC9\f\u0006k`!3\u000b\n}uvdTW&\u0019@$\u0001\u0006$a^4\u0018\u0002";
        f688[54] = "{\rXPV\u001e{\u0010\tU-Fc!\bWHJS\u001a\f]W|i\u001b\u0003WA'}E\bTI\u001cb\u0016\u0001[-";
        f688[55] = "qU$\u001b_~~VpX?b\u0014^*\u001a\u0003p\u007f\u0002$\u001f\\NxUr\u0019\u0001%$[wF?";
        f688[56] = "l`\r~x$$\"\u0015iHu1g0{,g1\u001b_-&c `^~!d\\";
        f688[57] = "3\u00133sV\nz\u0018~nf\u0000o\u0015TX,o8\u0019|z\u0007Q<Rbjf";
        f688[58] = "\u000b7\u0010o\fyY)\u0017.sg[6\u001e3\u001fU\u000frNiI\u0002\u000f5\u000e+\u0003g\u0007t\u0005is?K.E+\bmU#\u0004T";
        f688[59] = "U@GH\f\b\u0014R\u001e-\u03d7k\u0005W\b\u001dH\u0012UD\nS";
        f688[60] = "d]\u0006Q)w.\u0006\\\b\u0018\u025b_PSW >/B\u000f\t'\u0007";
        f688[61] = "\u000e%\r]g0O7T81S\\r[R4kU<O_X8\t'ZT`1G3W8";
        f688[62] = "M\rH$\u0013\u000e\f\u001f\u0011AC\u0000\b;\u0014-P\rt\u001f\u001c GSJ\u0001\n0,";
        f688[63] = ",.\u0018\u001b\u0017]m<A~\u02a4>~#D\u001b\u0019\u0002w=J\u001f";
        f688[64] = "YbF\fI8P|H\bx\u007f_zn\r\u0000d[OC\r\u001f{_j'\f@d\\b\u001c\u0013\u0013mS\u0006L\r\u0019a\u0003:E\u0013\u0017e2";
        f688[65] = "DCT\u0013o2M\u0010\u0013\u0014\u0013>JQlR\u007f\u0014NKE@~+'N\\\u001fy*\u001eNAN|Q";
        f688[66] = "[\u0013W\u00164J\u0019\u0001H\u0017\u0004#eCT\u001eaC\\\u0001F\u0001`";
        f688[67] = "Ug4\u0015D\u0007\u0014ump\u0449d\u0017gh\u001bEZ\tqx";
        f688[68] = "+PD:o_a\u000b\u001ec^@}K2e8SJZ\u001an3U}M|>7Q(\u000eE~f\u0010 7";
        f688[69] = "G%%\u0016FjN;+\u0012w9A=\u001a\u001a\u0013+AAu\tJ2\u001c$<\u0002\u0007/,";
        f688[70] = "\u0007#1k\u001bw\u000fb:)k}S \u001ah\u0011sX3Ax\f-\u0002b*$\u0002(]\\";
        f688[71] = "\u001bW\u000f)'+ZEVL\u0360HDQT0%(OSK2";
        f688[72] = "\u0001+13i5\\<4<\u0016/\nU1mn*\u000316cd3";
        f688[73] = "1u}J\u000b?,m:Vgb5g\u0000K\u000ef7)>U\u0018v\\liQ\f9br\u007fAg|5vk\u000eYb#f\u0000";
        f688[74] = "(\tO\u0019~,hX\u000e\u0011Gzy\u001cj]=tr\u000fn@+it`]Fx)*\u000b\u0001H}v\u0014\u001bX@,+*\u0005NPG";
        f688[75] = """
                   )x
                   \r2" f\u0004	\u0003e/`5	x\u007f(}\u000f	\u007foBe\u0005\u000ejy) \fT|\u001e)x
                   
2" f\u0004	\u0003""";
        f688[76] = "\b>^w\u0014N\u000f0TnvD\b<B{!\u0013Vk\u001a\u0017\u0014W\u000b3L|\f\u001aSl";
        f688[77] = "BB\u0011\u001a\u00187L@\u0015Ty$ANuI\u001f'AHB^y$HBRXE)J\nU$";
    }
    
    public static Class m1500(long n, long n2) {
        int m1498 = m1498(n, n2);
        Object o = ShortListHudElement.f688[m1498];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(ShortListHudElement.f689[m1498]);
                ShortListHudElement.f688[m1498] = forName;
            }
            else {
                forName = (Class)o;
            }
        }
        catch (Exception ex) {
            throw new IllegalStateException(ex.toString());
        }
        return forName;
    }
    
    public static Field m1501(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m1502(Class clazz, String s, Class clazz2) {
        Field m1501 = m1501(clazz, s, clazz2);
        if (m1501 != null) {
            return m1501;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m1502 = m1502(interfaces[i], s, clazz2);
                if (m1502 != null) {
                    return m1502;
                }
            }
        }
        return null;
    }
    
    public static Field m1503(long n, long n2) {
        int m1498 = m1498(n, n2);
        Object o = ShortListHudElement.f688[m1498];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        String s = ShortListHudElement.f689[m1498];
        int index = s.indexOf(8);
        Class m1499 = m1500(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        String substring = s.substring(index, index2);
        ++index2;
        Class m1500 = m1500(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m1499;
        while (true) {
            Field m1501 = m1501(clazz, substring, m1500);
            if (m1501 != null) {
                return (Field)(ShortListHudElement.f688[m1498] = m1501);
            }
            Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    Field m1502 = m1502(interfaces[i], substring, m1500);
                    if (m1502 != null) {
                        return (Field)(ShortListHudElement.f688[m1498] = m1502);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m1499.getName()).append(' ').append(m1500.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m1500(935021239108951L, 0L);
        }
    }
    
    public static Method m1504(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m1505(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m1504 = m1504(clazz, s, clazz2, n, array);
        if (m1504 != null) {
            return m1504;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m1505 = m1505(interfaces[i], s, clazz2, n, array);
                if (m1505 != null) {
                    return m1505;
                }
            }
        }
        return null;
    }
    
    public static Method m1506(long n, long n2) {
        int m1498 = m1498(n, n2);
        Object o = ShortListHudElement.f688[m1498];
        if (o instanceof String) {
            String s = ShortListHudElement.f689[m1498];
            int index = s.indexOf(8);
            Class m1499 = m1500(Long.parseLong(s.substring(0, index), 36), 0L);
            ++index;
            int index2 = s.indexOf(8, index);
            String substring = s.substring(index, index2);
            int n3 = -1;
            int index3 = index2;
            do {
                ++n3;
            } while ((index3 = s.indexOf(8, ++index3)) > -1);
            int n4;
            Class[] array = new Class[n4 = n3 - 1];
            Class m1500 = null;
            int n5 = index2 + 1;
            for (int i = 0; i < n3; ++i) {
                int index4 = s.indexOf(8, n5);
                m1500 = m1500(Long.parseLong(s.substring(n5, index4), 36), 0L);
                if (i < n4) {
                    array[i] = m1500;
                }
                n5 = index4 + 1;
            }
            Class superclass = m1499;
            while (true) {
                do {
                    Method m1501 = m1504(superclass, substring, m1500, n4, array);
                    if (m1501 != null) {
                        return (Method)(ShortListHudElement.f688[m1498] = m1501);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m1499;
                    while (true) {
                        Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                Method m1502 = m1505(interfaces[j], substring, m1500, n4, array);
                                if (m1502 != null) {
                                    return (Method)(ShortListHudElement.f688[m1498] = m1502);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            StringBuffer sb = new StringBuffer();
                            sb.append("NoSuchMethodException in ").append(m1499.getName()).append(' ').append(m1500.getName()).append(' ').append(substring).append('(');
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
                        clazz = m1500(935021239108951L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m1500(935021239108951L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    public static MethodHandle m1507(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType methodType, long n, long n2) {
        char char1 = s.charAt(0);
        Field m1503 = null;
        Method m1504 = null;
        try {
            MethodHandle target;
            if (char1 == '\u00f9' || char1 == 'h' || char1 == 'i' || char1 == '\u00c3') {
                m1503 = m1503(n, n2);
                Class<?> declaringClass = m1503.getDeclaringClass();
                String name = m1503.getName();
                Class<?> type = m1503.getType();
                if (char1 == '\u00f9') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == 'h') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == 'i') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m1504 = m1506(n, n2);
                Class<?> declaringClass2 = m1504.getDeclaringClass();
                String name2 = m1504.getName();
                MethodType methodType2 = MethodType.methodType(m1504.getReturnType(), m1504.getParameterTypes());
                if (char1 == '\u00d6') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == 'u') {
                    target = lookup.findStatic(declaringClass2, name2, methodType2);
                }
                else {
                    target = lookup.findSpecial(declaringClass2, name2, methodType2, declaringClass2);
                }
            }
            return MethodHandles.dropArguments(target, methodType.parameterCount() - 2, (Class<?>[])new Class[] { Long.TYPE, Long.TYPE });
        }
        catch (Exception ex) {
            StringBuilder sb = new StringBuilder();
            sb.append(ex.getClass().getName()).append(" : ").append((m1503 != null) ? m1503.toString() : ((m1504 != null) ? m1504.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static Object m1508(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType newType, Object[] array) {
        int n = array.length - 2;
        MethodHandle m1507 = m1507(lookup, mutableCallSite, s, newType, (long)array[n], (long)array[++n]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m1507, newType));
        try {
           return m1507.asSpreader(Object[].class, array.length).invoke(array);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    
    public static CallSite m671(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/client/api/feature/hud/ShortListHudElement.m671:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    public static class ProcyonInvokeDynamicHelper_1
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_1.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_1.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_1.LOOKUP;
                try {
                    handle = ((CallSite)ShortListHudElement.m177(lookup, "z", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
        
        public static int invoke(int p0, long p1) {
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
    public static class ProcyonInvokeDynamicHelper_2
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_2.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_2.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_2.LOOKUP;
                try {
                    handle = ((CallSite)ShortListHudElement.m177(lookup, "z", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_2.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }

   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }
}
