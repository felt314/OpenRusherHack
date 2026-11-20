// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.hud;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.core.feature.IFeatureConfigurable;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import org.rusherhack.Class066;
import java.lang.invoke.MethodHandles;
import org.rusherhack.core.setting.Setting;
import java.util.Objects;
import org.rusherhack.client.api.RusherHackAPI;
import java.awt.Color;
import java.util.ArrayList;
import org.rusherhack.client.api.render.RenderContext;
import java.util.Map;
import org.rusherhack.core.setting.BooleanSetting;
import java.util.List;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.client.api.setting.ColorSetting;

public abstract class ListHudElement extends HudElement
{
    public ColorSetting color;
    public EnumSetting<ListHudElement$SortingMode> sortMode;
    public int f638;
    public double f639;
    public List<ListHudElement$ListItem> f640;
    public double f641;
    public BooleanSetting animations;
    public List<String> f642;
    public boolean f643;
    public EnumSetting<ListHudElement$ColorMode> colorMode;
    public static long f644;
    public static String[] f645;
    public static String[] f646;
    public static Map f647;
    public static long[] f648;
    public static Integer[] f649;
    public static Map f650;
    public static Object[] f651;
    public static String[] f652;
    
    
    public ListHudElement(String s) {
        this(s, true);
    }
    
    public void setMax(int \u0271) {
        
    }
    
    public ListHudElement(String s, boolean f643) {
    }
    
    public void renderContent(RenderContext p0, double p1, double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          128558741572000
        //     6: lxor           
        //     7: lstore          6
        //     9: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.\u0254:()[Ljava/lang/String;
        //    12: astore          8
        //    14: aload_0        
        //    15: aload_1        
        //    16: astore_0       
        //    17: astore_1       
        //    18: aload_1        
        //    19: aload           8
        //    21: ifnonnull       166
        //    24: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u02b0:Ljava/util/List;
        //    27: invokeinterface java/util/List.isEmpty:()Z
        //    32: ifeq            165
        //    35: goto            42
        //    38: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    41: athrow         
        //    42: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    45: getfield        net.minecraft.client.MinecraftClient.currentScreen:Lnet.minecraft.client.gui.screen.Screen;
        //    48: aload           8
        //    50: ifnonnull       83
        //    53: goto            60
        //    56: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    59: athrow         
        //    60: ifnull          159
        //    63: goto            70
        //    66: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    69: athrow         
        //    70: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    73: getfield        net.minecraft.client.MinecraftClient.currentScreen:Lnet.minecraft.client.gui.screen.Screen;
        //    76: goto            83
        //    79: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    82: athrow         
        //    83: invokestatic    org/rusherhack/client/api/RusherHackAPI.getThemeManager:()Lorg/rusherhack/client/api/ui/theme/IThemeManager;
        //    86: invokeinterface org/rusherhack/client/api/ui/theme/IThemeManager.getHudEditorScreen:()Lnet.minecraft.client.gui.screen.Screen;
        //    91: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    94: ifeq            159
        //    97: aload_1        
        //    98: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getFontRenderer:()Lorg/rusherhack/client/api/render/font/IFontRenderer;
        //   101: dup            
        //   102: dup_x1         
        //   103: ldc_w           "(empty list)"
        //   106: invokeinterface org/rusherhack/client/api/render/font/IFontRenderer.getStringWidth:(Ljava/lang/String;)D
        //   111: ldc2_w          2.0
        //   114: dadd           
        //   115: dstore          9
        //   117: invokeinterface org/rusherhack/client/api/render/font/IFontRenderer.getFontHeight:()D
        //   122: ldc2_w          2.0
        //   125: dadd           
        //   126: dstore          11
        //   128: ldc_w           "(empty list)"
        //   131: dconst_1       
        //   132: dup2           
        //   133: aload_1        
        //   134: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.color:Lorg/rusherhack/client/api/setting/ColorSetting;
        //   137: invokevirtual   org/rusherhack/client/api/setting/ColorSetting.getValueRGB:()I
        //   140: invokeinterface org/rusherhack/client/api/render/font/IFontRenderer.drawString:(Ljava/lang/String;DDI)D
        //   145: dload           11
        //   147: aload_1        
        //   148: dup_x2         
        //   149: dload           9
        //   151: putfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u04d1:D
        //   154: putfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u0502:D
        //   157: pop2           
        //   158: return         
        //   159: aload_1        
        //   160: dconst_0       
        //   161: putfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u0502:D
        //   164: return         
        //   165: aload_1        
        //   166: aload_0        
        //   167: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement.\u0497:(Lorg/rusherhack/client/api/render/RenderContext;)V
        //   170: return         
        //    StackMapTable: 00 0B FF 00 26 00 06 07 00 41 07 00 02 03 03 04 07 00 B9 00 01 07 00 37 03 4D 07 00 37 43 07 01 9C 45 07 00 37 03 48 07 00 37 43 07 01 9C FB 00 4B 05 40 07 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  18     35     38     42     Ljava/lang/MatchException;
        //  24     53     56     60     Ljava/lang/MatchException;
        //  42     63     66     70     Ljava/lang/MatchException;
        //  60     76     79     83     Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
    
    public double getWidth() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          39500015153655
        //     6: lxor           
        //     7: lstore_1       
        //     8: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.\u0254:()[Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_0        
        //    13: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u04d1:D
        //    16: aload_3        
        //    17: ifnonnull       99
        //    20: dconst_0       
        //    21: dcmpg          
        //    22: ifgt            95
        //    25: goto            32
        //    28: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    31: athrow         
        //    32: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    35: aload_3        
        //    36: ifnonnull       69
        //    39: goto            46
        //    42: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    45: athrow         
        //    46: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //    49: ifnull          75
        //    52: goto            59
        //    55: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    58: athrow         
        //    59: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    62: goto            69
        //    65: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    68: athrow         
        //    69: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    72: ifnonnull       95
        //    75: aload_0        
        //    76: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getFontRenderer:()Lorg/rusherhack/client/api/render/font/IFontRenderer;
        //    79: aload_0        
        //    80: invokeinterface org/rusherhack/core/interfaces/INamed.getDisplayName:()Ljava/lang/String;
        //    85: invokeinterface org/rusherhack/client/api/render/font/IFontRenderer.getStringWidth:(Ljava/lang/String;)D
        //    90: dreturn        
        //    91: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    94: athrow         
        //    95: aload_0        
        //    96: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u04d1:D
        //    99: dreturn        
        //    StackMapTable: 00 0C FF 00 1C 00 03 07 00 02 04 07 00 B9 00 01 07 00 37 03 49 07 00 37 43 07 01 70 48 07 00 37 03 45 07 00 37 43 07 01 70 05 4F 07 00 37 03 43 03
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
    
    public void add(ListHudElement$ListItem listHudElement$ListItem) {
        
    }
    
    public void tick() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          98713246477354
        //     6: lxor           
        //     7: lstore_1       
        //     8: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.\u0254:()[Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_0        
        //    13: astore          4
        //    15: aload           4
        //    17: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u02b0:Ljava/util/List;
        //    20: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    25: dup            
        //    26: astore_0       
        //    27: invokeinterface java/util/Iterator.hasNext:()Z
        //    32: ifeq            55
        //    35: aload_0        
        //    36: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    41: checkcast       Lorg/rusherhack/client/api/feature/hud/ListHudElement$ListItem;
        //    44: astore          5
        //    46: aload_0        
        //    47: aload           5
        //    49: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement$ListItem.tick:()V
        //    52: goto            27
        //    55: aload           4
        //    57: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u02b0:Ljava/util/List;
        //    60: invokedynamic   BootstrapMethod #4, test:()Ljava/util/function/Predicate;
        //    65: invokeinterface java/util/Collection.removeIf:(Ljava/util/function/Predicate;)Z
        //    70: iconst_0       
        //    71: istore_0       
        //    72: pop            
        //    73: iload_0        
        //    74: aload           4
        //    76: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u02b0:Ljava/util/List;
        //    79: invokeinterface java/util/List.size:()I
        //    84: if_icmpge       143
        //    87: iload_0        
        //    88: aload_3        
        //    89: ifnonnull       140
        //    92: goto            99
        //    95: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    98: athrow         
        //    99: aload           4
        //   101: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u0271:I
        //   104: if_icmple       136
        //   107: goto            114
        //   110: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   113: athrow         
        //   114: aload           4
        //   116: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u02b0:Ljava/util/List;
        //   119: iload_0        
        //   120: iinc            0, -1
        //   123: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
        //   128: pop            
        //   129: goto            136
        //   132: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   135: athrow         
        //   136: iinc            0, 1
        //   139: iload_0        
        //   140: goto            74
        //   143: new             Ljava/util/ArrayList;
        //   146: dup            
        //   147: invokespecial   java/util/ArrayList.<init>:()V
        //   150: astore_0       
        //   151: aload           4
        //   153: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u02b0:Ljava/util/List;
        //   156: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   161: dup            
        //   162: astore          5
        //   164: invokeinterface java/util/Iterator.hasNext:()Z
        //   169: ifeq            212
        //   172: aload           5
        //   174: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   179: checkcast       Lorg/rusherhack/client/api/feature/hud/ListHudElement$ListItem;
        //   182: astore          6
        //   184: aload_3        
        //   185: ifnonnull       272
        //   188: aload           5
        //   190: aload_0        
        //   191: aload           6
        //   193: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement$ListItem.getText:()Lnet.minecraft.text.Text;
        //   196: invokeinterface net.minecraft.text.Text.getString:()Ljava/lang/String;
        //   201: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   204: pop            
        //   205: goto            164
        //   208: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   211: athrow         
        //   212: aload_0        
        //   213: aload           4
        //   215: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u03ec:Ljava/util/List;
        //   218: invokevirtual   java/util/ArrayList.equals:(Ljava/lang/Object;)Z
        //   221: aload_3        
        //   222: ifnonnull       263
        //   225: ifne            272
        //   228: goto            235
        //   231: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   234: athrow         
        //   235: aload           4
        //   237: dup            
        //   238: aload_0        
        //   239: putfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u03ec:Ljava/util/List;
        //   242: aload_3        
        //   243: ifnonnull       269
        //   246: goto            253
        //   249: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   252: athrow         
        //   253: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u01f4:Z
        //   256: goto            263
        //   259: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   262: athrow         
        //   263: ifne            267
        //   266: return         
        //   267: aload           4
        //   269: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement.resort:()V
        //   272: return         
        //    StackMapTable: 00 17 FF 00 1B 00 04 07 01 C0 04 07 00 B9 07 00 02 00 01 07 01 C0 1B FF 00 12 00 04 01 04 07 00 B9 07 00 02 00 01 01 54 07 00 37 43 01 4A 07 00 37 03 51 07 00 37 03 43 01 02 FF 00 14 00 05 07 00 D5 04 07 00 B9 07 00 02 07 01 C0 00 01 07 01 C0 FF 00 2B 00 06 07 00 D5 04 07 00 B9 07 00 02 07 01 C0 07 00 09 00 01 07 00 37 FA 00 03 52 07 00 37 03 4D 07 00 37 43 07 00 02 45 07 00 37 43 01 03 41 07 00 02 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  74     92     95     99     Ljava/lang/MatchException;
        //  87     107    110    114    Ljava/lang/MatchException;
        //  99     129    132    136    Ljava/lang/MatchException;
        //  184    208    208    212    Ljava/lang/MatchException;
        //  212    228    231    235    Ljava/lang/MatchException;
        //  225    246    249    253    Ljava/lang/MatchException;
        //  235    256    259    263    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0099:
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
    
    public List<ListHudElement$ListItem> getMembers() {
        return null;
    }
    
    public double getHeight() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          55932804611152
        //     6: lxor           
        //     7: lstore_1       
        //     8: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.\u0254:()[Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_0        
        //    13: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u0502:D
        //    16: aload_3        
        //    17: ifnonnull       97
        //    20: dconst_0       
        //    21: dcmpg          
        //    22: ifgt            93
        //    25: goto            32
        //    28: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    31: athrow         
        //    32: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    35: aload_3        
        //    36: ifnonnull       69
        //    39: goto            46
        //    42: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    45: athrow         
        //    46: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //    49: ifnull          75
        //    52: goto            59
        //    55: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    58: athrow         
        //    59: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    62: goto            69
        //    65: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    68: athrow         
        //    69: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //    72: ifnonnull       93
        //    75: aload_0        
        //    76: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getFontRenderer:()Lorg/rusherhack/client/api/render/font/IFontRenderer;
        //    79: invokeinterface org/rusherhack/client/api/render/font/IFontRenderer.getFontHeight:()D
        //    84: ldc2_w          2.0
        //    87: dadd           
        //    88: dreturn        
        //    89: invokestatic    org/rusherhack/client/api/feature/hud/ListHudElement.a:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    92: athrow         
        //    93: aload_0        
        //    94: getfield        org/rusherhack/client/api/feature/hud/ListHudElement.\u0502:D
        //    97: dreturn        
        //    StackMapTable: 00 0C FF 00 1C 00 03 07 00 02 04 07 00 B9 00 01 07 00 37 03 49 07 00 37 43 07 01 70 48 07 00 37 03 45 07 00 37 43 07 01 70 05 4D 07 00 37 03 43 03
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
    
    public void resort() {
        
    }
    
    static {
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
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/client/api/feature/hud/ListHudElement.m132:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static CallSite m177(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/client/api/feature/hud/ListHudElement.m177:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static void m1499() {
        Object[] f651 = ListHudElement.f651;
        f651[0] = "\u001dHe\u0001\u000e\t\u0001Rg]\u0014\u001d\u0011Q,L\u0010\u0015\u0017Tv\u0001\u001d\f\u001b\u0014dJ\u001d\b\u0007Hg\u0001\u0014\t\u0016\u0014NF\u000f\b:Ofj\u0010\u0019\u001f_l[";
        f651[1] = "\u0004vBnx\u0019\u0018l@2b\r\bo\u000b#e\u001e\u000e*V%~\u0018\u0002jBnO\u0002\u001eiv%~\u0018\u0002jB";
        f651[2] = "@TH\f@Q^\\RC\"MYA";
        f651[3] = "G/HSEFY'R\u001c(\\@>_@\nGB<";
        f651[4] = Void.TYPE;
        ListHudElement.f652[4] = "java/lang/Void";
        f651[5] = "\u0005q\u001c\b)\\\u0019k\u001eT3H\thUE7@\u000fm\u000f\b:Y\u0003-\u001dC:]\u001fq\u001e\b3\\\u000e-7O(]\"v\u001fc7L\u0007f\u0015R\u007fz\u0005q\u000fO5N'l\u001fC";
        f651[6] = "\u0016M|L1\u000e\nW~\u0010+\u001a\u001aT5\u0001,\t\u001c\u0011h\u00077\u000f\u0010Q|L\u0010\u001e\rKr\f$";
        f651[7] = "\u0004Duv\bU\u000fKd9i[\u0004@`c";
        f651[8] = Boolean.TYPE;
        ListHudElement.f652[8] = "java/lang/Boolean";
        f651[9] = "5All9Q)[n0#E9X%!'M?]\u007fl*T3\u001dm'*P/Anl#Q>\u001dG+8P\u0012Fo\u0007'A7Ve6oh3@\u007f\u000b?A7";
        f651[10] = "P\u0002N[5\u0014L\u0018L\u0007/\u0000\\\u001b\u0007\u0016+\bZ\u001e][&\u0011V^O\u0010&\u0015J\u0002L[/\u0014[^a\u0000#$S\u0015D\u0010)\u0015";
        f651[11] = "#\u0000ST\u000f\u0017V X[\u001eX+8K\\\u0017\u0011C";
        f651[12] = ")\u001cL'7&5\u0006N{-2%\u0005\u0005j):#\u0000_'$#/@Yl+7#\u001c\u0005o*=2@bO*=2<Ng!64\u000bY";
        f651[13] = Double.TYPE;
        ListHudElement.f652[13] = "java/lang/Double";
        f651[14] = "%l!\u001fGB.c0P$O;n?;\u0011M*}#\u0017\u0006@";
        f651[15] = """
                   \u0004q*\u0006\u001c`\u0018k(Z\u0006t\bhcK\u0002|\u000em9\u0006\u000fe\u0002-
                   D\u0001w
                   o>""";
        f651[16] = ":'\u0014jPr:'\u00036\\} l\u0003(\\h'\u001dSu\r";
        f651[17] = "9<v4\u0000N9<ah\fA#wav\fT$\u00064)U";
        f651[18] = "Ec\u001cfz\u0014Ec\u000b:v\u001b_(\u000b$v\u000eXY_|!";
        f651[19] = Integer.TYPE;
        ListHudElement.f652[19] = "java/lang/Integer";
        f651[20] = "Z\u000em\u0014-^F\u0014oH7JV\u0017$Y3BP\u0012~\u0014>[\\Ry_+_\\\u0012m\u0014\u001cDY\u0013xi:_A\u0015d]";
        f651[21] = "Sgrq@\\O}p-ZH_~;\u022b";
        f651[22] = "O\u0012\u0003`tvD\u001d\u0012/\tnW\u001a\u001bf";
        f651[23] = "l\u0010\u000e\u001cihp\n\f@s|`\tGQtofL\u001cFrqpL$SouV\u0016\u0000^h";
        f651[24] = "A\u0005\u001e}\u0001<]\u001f\u001c!\u001b(M\u001cW0\u001f K\u0019\r}\u00129GY\u000b6\u001d-K\u0005W\u0001\u0016'J\u0012\u000b\u0010\u001c'Z\u0012\u0001'";
        f651[25] = "\u0013my\"\u0017X\u000fw{~\rL\u001ft0o\tD\u0019qj\"\u0004]\u00151Ly\u0016E\u0019mVm\u0006F=OW";
        f651[26] = "-\u001eGBWQ1\u0004E\u001eME!\u0007\u000e\u000fIM'\u0002TBDT+BU\u0005\u000bP*\tM\t\u000bm\u0016\u0004E\u0001@i#\u0002A\u000b@V";
        f651[27] = "\u0003P_0\bW\u0003PHl\u0004X\u0019\u001bHr\u0004M\u001ej\u001f-R";
        f651[28] = "W(>v/W\\'/9CTR%-vo";
        f651[29] = "F{g]i\u00103[lRx_NC\u007fUq\u0016&";
        f651[30] = "Z3oDu\bD;u\u000b=\b^1mL4\u0013\u001e\u0010vJ7\u0018Q<JP+\r\\;|W";
        f651[31] = "_-\u0015\u0004SIC7\u0017XI]S4\\INNUq\u0014O@HE-\u0017\u0004hzU>\u0006_SYs0\u001cLH[E-\u0013HMY";
        f651[32] = "0ag]!\u000e\u0019X{G#R\u0003LkDhC\u0004_m\u00015E\u001fYaA!\u000e8H|[/N\f\u0016";
        f651[33] = "\u000et\u0011\f9F\u0012n\u0013P#R\u0002mXA'Z\u0004h\u0002\f*C\b(\u0010G*G\u0014t\u0013\f#F\u0005(:K8G)s\u0012g'V\fc\u0018Vop\u000ej\u0019P\u0006\\\u0005c";
        f651[34] = "wiI0K\u000f\u0002IB?Z@\u007fQQ8S\t\u0017";
        f651[35] = "\u0002\u0019\u001f@8\u0013\u001c\u0011\u0005\u000fp\u0013\u0006\u001b\u001dHy\bF;\u0006Oe\u0013\u0005\u001d\u001b";
        f651[36] = "?\u001c\u0011zk?!\u0014\u000b5\n(?\u0018\u0004o6";
        f651[37] = "p|2\u00066elf0Z,q|e{K+bz &M0dv`2\u0006\u0006\u007fpb0I*Czz!A*w";
        f651[38] = "Ep/,qDYj-pkPIifalCO,!lwTXd)afB\u0004K\u0006cnTN";
        f651[39] = "Q\u001e\u0016KZ8O\u0016\f\u0004=9^\r\u0001^\u001b?";
        f651[40] = "E&\u001ddr\u0014[.\u0007+:\u0014A$\u001fl3\u000f\u0001\u0017\u0019`8\bL&\u001f`";
        f651[41] = "X\u00133E\b\u0002F\u001b)\ng\u0005@\u0013<hO\u0004F";
        f651[42] = "m\u000f\u001eL%Um\u000f\t\u0010)ZwD\t\u000e)Op5XW~\r";
        f651[43] = "*#@\u007f2%69B#(1&:\t2,9 ?S\u007f! ,\u007fT(3$ <\t\u0018\b%!\u001cF?!7 #";
        f651[44] = "aCSs~\u001bjLB<\u001d\u0016\u007fJ";
        f651[45] = "\u0000#\u0007\u00178Z\u001c9\u0005K\"N\f:NZ&F\n?\u0014\u0017+_\u0006\u007f\u0006\\+[\u001a#\u0005\u0017\"Z\u000b\u007f(L.j\u00034\r\\$[K\u0010\fP-A\u00024\u000eM";
        f651[46] = "4\u0000\u000e+ot4\u0000\u0019wc{.K\u0019icn):N0:*";
        f651[47] = "T3`a_\u0019H)b=E\rX*),B\u001e^of!D\u0001Z5n CBz/n\"L\u0018R.i";
        f651[48] = "T\f\u000e\u0007\"sH\u0016\f[8gX\u0015GJ<o^\u0010\u001d\u00071vRP\u000fL1rN\f\f\u00078s_P%@#rs\u000b\rl<cV\u001b\u0007]t4";
        f651[49] = "m\u0000";
        f651[50] = "a~Tg~c9eZ\u000b\u01f8\u001d`|\u001bn4-=%@0";
        f651[51] = "e\u0013L8VS7_\u00108g\u0010\u000b\u000fL4\u0006Vy\u0006N;[<e\u0007F9\rNl\u0005Idg";
        f651[52] = """
                   ;GQz$\u000e)
                   	e_\u001d0REp\u0018\rY\u000b[,:SiV\u0002wdc;GQz$\u000e)
                   	e_""";
        f651[53] = "\u0000\u0013\u0005a7\u0000K\u0015\u00130Y&v&9E\u001e-a? N\u0018)r2x5<\u001fT\u0018\u001a~:\t\u0005";
        f651[54] = "G\u0016Ho{ZAB\u000fg\u0001JSV2,g\u001bIT\f~a\\_-\u0003{9S@\u0013Q}~E9";
        f651[55] = "d~YfJC`~X4.R6=smER=$WoX=%\u007fA3^Q::_0$";
        f651[56] = "A\u0017\u0013B6\u0012\u0019\f\u001d.#\u0001\u0001)\fB0\f}G\u000b\u0016<\u0015C\u0015\rQ*l";
        f651[57] = "~pS^shb LY\f>ja\u007fUw)ctBre4j\u001d]R`0moTPom\u0007";
        f651[58] = "\r\u0017{8n9U\fuT\u048bG^\u0004{$h#Q\u0018`5\u0014}A\u0004|,$9H\u000b{T";
        f651[59] = "\u001e;LR\u0001<\t|^\u000be/\u0003}.\u0000\u0003x\u001ex\u0010R\u0005?\b\u0001";
        f651[60] = "s\rMZ\u00120r\u0019_\u001ek.z\u001f]_\u00179m+QX\u00175q\u001fG$\u000e=r\fAK\u0012ml\u0000<\u001e\u001b&n\b\fZ\u0012)ip";
        f651[61] = """
                   \f\u001dJsurM\u0013\f?
                   e\u001e\u0003\u0013hfWIEB71\u0000I\u000f\u0001vr0\r\u0006\u000eq
                   """;
        f651[62] = "~\u0011<vv\u0000&\u0001<4O\u0015&\u0013nJ#P(\u000bm;#\u0003#\f\u0003";
        f651[63] = ")4Ik}+s'Hl\u0006&\"0@zQq}m\u001b\u0016m$-'C,i0<&";
        f651[64] = "e8U,>+=#[@\u03a0U`)\u0014|};89\u0014>";
        f651[65] = "nW(3P\u0018hO#/0\u0007=[/=J}?O= L\u00190S&10\u0011nR)>A\u0011=Y.P\n\r\"D;`N\u0004-CC";
        f651[66] = "!nT)l`!:Z/\u0006&4{B$|1\u001feY\u0003{8=\u0002\u00037`9c9M7x Y>M#cfbpM;z\\";
        f651[67] = "\u001aK%\\TDZ\u001cd\u0001*\u000fjT$AZ\u001cTH.RL";
        f651[68] = "Y^^\u000bqe\u0001EPg\u02b3\u001b\\O\u001f[2u\u0004_\u001f\u0019";
        f651[69] = "\u0003Nk \u0018MUMw(#A\u0003RP;GS\u0003tA\u0018#BPAd<RB\u0003JcR";
        f651[70] = "'\u0000\u0002\u00131Q)\u0007X\r\f\u0194J\tU\u0018m\n8\u0000W\u00170`$\u0001_\u0015f\u0012-\u0003PH\f";
        f651[71] = "3:\u0018\u0011%\"4-\u0019F\u001f\u053e\u000f:P\u0007.'?#FFo_";
        f651[72] = "Tm6+6rPm7yX\u0250k4-=it[-;|(\f";
        f651[73] = "G\u0002@sf(DRW%\u001ej\u0013Cl|ep\u0014^V|b`~[\tbckOF\u000f '\u0011G\u0002@sf(DRW%\u001e";
        f651[74] = "|\u0017P`\u0005\u001cz\u000f[|e\u0016/\u0001re\u0004\u001c+\u0001Zd\u0003y2GY`\u0001\u0005%\u0000K9e";
        f651[75] = "D\u0005\u0012 \u001etB\u001d\u0019<~~\u0017\u0013&\"\u0012m\u001aoH%Fa\u0003Q\u001a#\u0001wz";
        f651[76] = "4\u0011\u001c|PZl\u0001\u001c>iN`\u0004D>\u00044a_L*\u0007Ea\fG-i\b\u007f\u0007FzRF\u007f\u001f_@";
        f651[77] = "%\u0018\u001e\u0016\u000ba>F\u0003\u0013q7(\u0006'\u0017\u001d\u001d,\u001c\u000e\u0005\u001c\"E\u0007\f\u000b\u000e95\u0011Z\u000fAX";
        f651[78] = "HU7]_[W\u0010)^%}q7\u0010 ``l*\u0003'y7HU7]_[W\u0010)^";
        f651[79] = "\u000f\bdZ;C\t\u0010oF[I\\\u001eST+Z1\u001ec\u0000d\u0016R\u000fbUk&";
        f651[80] = "\u0013g<{\u0002\u001f\u0017g=)l\u000eA$\u0011s\n\u001dv59x\u0001\u001bA\"_$\u001d\bIc%\u007fQ\u0019JX";
        f651[81] = "yB\u0012F\u0000<8LT\n\u007f+k\\K]\u0013\u0019<\u001a\u001a\u0002CN7F\u0013J\u0006pe@T\\\u007f\u007f`\u0018[CA-f_M:N(>PR\u0004\u001c.yF+\u0000\u000f<\u007fX\u001bD\u00063x ";
        f651[82] = "s-]\u0000!~fa\u0003\u0019\u0019fq\\P\u001bt~a?\n\buy";
        f651[83] = "f4F:\bw<'G=szm0O+$-3`\u0016G\u0012du3J;Jkgc";
        f651[84] = """
                   W*\u0000JKm\ff\u0011Ipx
                   '2S
                   v\u000146N\u001ck\u0007[\u0007I\u001cv
)\u000eK\u0013+gj\u000f\u0017\u0000nY8	P\u0016\u0017""";
        f651[85] = ":x,\u0015>'l{0\u001d\u0005?:d\u0017\u0006~%=y-\u0006y5W|r\u0018x>fatZ<D:x,\u0015>'l{0\u001d\u0005";
        f651[86] = "\u0007QPJz)\u000bU\u001dZ\u001c%\u000bNlYp\u0007\nSPCf\u0011\rHAIzJ\u0007BUJ}6_MG\u001a\u001c";
        f651[87] = "\u0003\u000b0|\u00037\u0004\u001c1+9\u0335?\u000bxj\b2\u000f\u0012n+IJ\u0005\u001drjAzA\u0014}m9";
        f651[88] = "=*\u0015#0\u00119zF4\u0000\u0018.?07p\u0004Gy\u0015keHw$L0;x";
        f651[89] = "h\u0005Q\u001bJ\rlU\u0002\fz\u0002\u007f\u001bNbF\u0016t\u000e\bY\b\u0016l\u00172";
        f651[90] = "\u0010AW\u001a\u0012qHQWX+vE]h\u001aYyL\u000bSTYaU1UE\u001az\u0019\u0001\b\u001cA$)";
        f651[91] = "/SRRpQt\u001fCQKGeKDl7Q~DT7%MsCQE,O|\u001e;\u0006-\u0013o[\u0005T+Ty\"\nQs[f\u001cXW4M\u001fN\u0005X!EnNVS&+.D\u0003G2\u0015|BDQK";
        f651[92] = "c,G}-/;7I\u00118<#\rTp81#M\bwo!&sZq(7_";
        f651[93] = "4\u001e(^e\u0013+[6]\u001f\u00180L2\u0002v\u001bJLm\u000bu\u0011;L>\u0000r\u007f";
        f651[94] = "io=w\u001fO1t3\u001b\u000eV1i9^\u0002]8\u000ez&\u0017_-7yv\u0000\t";
        f651[95] = "\nv\bIj\u001fRm\u0006%{\u0006Rp\f%}\u0001SeMF+\u0002Om";
        f651[96] = " &\u000bw\u0011f{j\u001at*s}+,uL`P:\u0003}J`\u0010f\u0004*Ze.4\u0002mL\u001c";
        f651[97] = "IK2\u00069C\bEtJFT[Uk\u001d*f\f\u0013:Bw1\fYy\u0003>\u0001HPv\u0004F";
        f651[98] = "gsU0\u007fM?h[\\\u007f^ uQ \u0005\t+`R.5M\"oU\\";
        f651[99] = "|kU3|\u001f7mCb\u0012\u0016 kP5h\u0014;iR\\(\u00168s\u0016;~M#b";
        f651[100] = "{\u000e\t_'\u000f`P\u0014Z]Yv\u0010,C0Sv)\u0019E4Yv\u0016pB>Ju\n\u0013N:\u0007el";
        f651[101] = ":\u0016J0ww<\u000eA,\u0017}i\u0000a>v}d\u0000!bq*t\u0005\u001f0wmb|";
        f651[102] = """
                    \bD\u00142U\u0018PT\u0014pl\u0019\\H+bR\u0019[ZZb\u0001\u0012\4\u0017|
                    \u0013\u000b\u000fY|\u0012
                    1""";
        f651[103] = "OZ\u0002T6bT\u000bJ\u001cQ\u0012xp;h\u0010\u0015)P\u001e](9\u0015KO\u0015`";
        f651[104] = ",\r,\u001b\u001bp,\u0016j\u0017~r.\u0013xO\u0005\u001fk\u001cwND$%\u001coW~\"4_t\u001bN\u007fm\u0004*+";
        f651[105] = "qyJ^39g/N\u0011R(wNKL7$GuOF(\u0012}t@L>I1q\u001aDbyl(A\u001aR";
        f651[106] = "H=5s\"QKm\"%Z\u000f\u0017K't<\u0007\u001c\u0000 ca\f\u0017e; a\rq9zo4\u0010H:*xbh";
        f651[107] = "L\nZ2<tC\u0016A#@hD\u0003IB?r\u001a\u0004[0~|\\H$";
        f651[108] = """
                    5
                    \u0006 ey2\u001d\u0007w_kd\u0010h&;ydl
                    =9a3WD=!x	""";
        f651[109] = "=\u0002\u0010@\u0002c;\u001a\u001b\\bzb\u0003\u0018#Xvq\u0011\u0003\u0013\u001c\u007f~\u0016{";
        f651[110] = "i=D\"PH1&JNCP49S2KQ3':6P\u000e:%AsZ\rh";
        f651[111] = "I.x\u0010\u0014ZVkf\u0013n[NmjN\u00156\u000bbeOT\rEb}Vn\u000bT!f\u001a^V\rz8*";
        f651[112] = "^^SZ~\u0000\u0006E]6\u04dd~SY\u0015F}@\u0001_RP";
        f651[113] = "Z\u007fQ\u0011E\u001a\u0002oQS|\u000e\u000ej\tS\u00115\r\u000f\u0014\\\u0011\u001b\u001dr^C\u0011\u001bc2\r\u001c\u0019DSoTGGt";
        f651[114] = "8J\u000e@t\u0001nI\u0012HO\u00198V\"V7\u0002<c\u000fV(\u001d8Fk\u000f,S0\u001a[Ru\bn*\u0006R*\u0010nIPQ6\u0018U";
        f651[115] = "=UrA\u0013U=N4MvS*ZOM\u0004\\#\ft\u0003\u0004D:6r\u0012G_v\u0006/K\u001c\u0001F";
        f651[116] = "z(cw\u00115\"3m\u001b\u0010,<5X|\u0007&Fp i\u00053\u007fsp~S";
        f651[117] = "@;\u007f\u001bth\u0018+\u007fYM}\u001e1<'wm\u00066~@!6\u001d'@\u001d=t\u00003pY4{\u0007K";
        f651[118] = "FSFH-v\u001eCF\n\u0014y\u0003N\u0003\u001dh\u007f\u0005#\u0003\u001awaOJ\u0007J$v\u007f";
        f651[119] = "V\u001e?P\u0012=\u000e\u00051<\u0001C\u0003F\u007f[\u00038\n\u0010(Qh*SA&W\u0013#\u0005\u0016,<";
        f651[120] = "\u001e#T\u0006\u0005\u001f\fn\f\u0019~\u0018\u001b5Y\f\u0017\u0014\";Y\u001c\u0013rA1\f\u0004NB\u001chWZ~";
        f651[121] = "heae\u001c\u0016yd4j,\u001ayu\u0003&V\u0014rfX4J\u0019uc*=H\u0016(\t";
        f651[122] = "dz}>6T{?c=Lr]\u0018ZC\to^\tHXLF$?<~ Ya!?";
        f651[123] = "1,l\fk<7x+\u0004\u0011 &g\u0016Ow}?n(\u001dq:)\u0017'\u0018)56)u\u001en#O&pFa<qtv\u0001wE";
        f651[124] = "-XOehXuHO'QWoe\u0015!-G\u0014\u0015\u0013h4\u0006$HJ3j6";
        f651[125] = "&RbhRq|Aco)|-Vky~+s\u00013\u0015E)!Be-Cit\u0000";
        f651[126] = "\u00168jZ AN#d6\u0550?\u001b?,F#\u0001I9kP";
        f651[127] = "B\u000b*}\u000b\u0002\u001a\u0010$\u0011\u0208|\u0012T;{\u001f\r\u0012\u00070|";
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
    
    public static CallSite m671(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/client/api/feature/hud/ListHudElement.m671:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
                    handle = ((CallSite)ListHudElement.m177(lookup, "r", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)ListHudElement.m177(lookup, "r", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_3
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_3.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_3.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_3.LOOKUP;
                try {
                    handle = ((CallSite)ListHudElement.m177(lookup, "r", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1);
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
