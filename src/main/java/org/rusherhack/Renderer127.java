// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.client.api.render.IRenderer;
import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.client.api.ui.ScaledElementBase;
import org.rusherhack.core.setting.Setting;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import javax.crypto.SecretKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.lang.invoke.MethodHandles;
import java.util.function.Consumer;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.client.api.render.font.IFontRenderer;
import java.awt.Color;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.IRenderer2D;
import net.minecraft.client.util.Window;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.client.api.feature.hud.HudElement;
import java.util.Map;
import org.rusherhack.client.api.feature.hud.HudElement$SnapPoint;
import java.util.HashMap;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.client.api.ui.hud.HudHandlerBase;

import org.rusherhack.command.clear;
import org.rusherhack.client.api.feature.hud.impl.IP;
import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
import org.rusherhack.client.api.feature.module.impl.client.HUD;
public class Renderer127 extends HudHandlerBase
{
    public ElementBase f2688;
    public boolean f2689;
    public Class477 f2690;
    public HashMap<HudElement$SnapPoint, Double> f2691;
    public static long f2692;
    public static long[] f2693;
    public static Integer[] f2694;
    public static Map f2695;
    public static Object[] f2696;
    public static String[] f2697;
    
    public PanelHandlerBase<?> getHudManagerPanel() {
        long n = Renderer127.f2692 ^ 0x2574DDAEF5BCL;
        return (PanelHandlerBase<?>)this.f2690;
    }
    
    public boolean isElementHovered(HudElement hudElement, double n, double n2) {
        long n3 = Renderer127.f2692 ^ 0x4D2AF586CC85L;
        try {
            if (this.f2688 == hudElement) {
                return true;
            }
        }
        catch (MatchException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public void initialize() {
        super.initialize();
    }
    
    public void m5937(HudElement hudElement) {
        long n = Renderer127.f2692 ^ 0x1CD80B0A2E33L;
        int m9155 = Class253.m9155();
        Window window = Globals.mc.getWindow();
        int n2 = m9155;
        double x = hudElement.getX();
        double y = hudElement.getY();
        Label_0132: {
            Label_0114: {
                double n6 = 0.0;
                Label_0097: {
                    Label_0076: {
                        Label_0054: {
                            double n3 = 0.0;
                            try {
                                double n4;
                                n3 = (n4 = dcmpg(x, 0.0));
                                if (n2 == 0) {
                                    break Label_0076;
                                }
                                if (n3 < 0) {
                                    break Label_0054;
                                }
                                break Label_0054;
                            }
                            catch (MatchException ex) {
                                ex.printStackTrace();
                            }
                            try {
                                if (n3 < 0) {
                                    double n5 = y;
                                    hudElement.setX(0.0);
                                    break Label_0097;
                                }
                            }
                            catch (MatchException ex2) {
                                ex2.printStackTrace();
                            }
                        }
                        double n4 = dcmpl(x, (double)window.getScaledWidth());
                        try {
                            if (n4 > 0) {
                                hudElement.setX((double)window.getScaledWidth());
                            }
                        }
                        catch (MatchException ex3) {
                            ex3.printStackTrace();
                        }
                    }
                    double n5 = y;
                    try {
                        double n7;
                        n6 = (n7 = dcmpg(n5, 0.0));
                        if (n2 == 0) {
                            break Label_0132;
                        }
                        if (n6 < 0) {
                            break Label_0114;
                        }
                        break Label_0114;
                    }
                    catch (MatchException ex4) {
                        ex4.printStackTrace();
                    }
                }
                try {
                    if (n6 < 0) {
                        hudElement.setY(0.0);
                        return;
                    }
                }
                catch (MatchException ex5) {
                    ex5.printStackTrace();
                }
            }
            double n7 = dcmpl(y, (double)window.getScaledHeight());
            try {
                if (n7 > 0) {
                    hudElement.setY((double)window.getScaledHeight());
                }
            }
            catch (MatchException ex6) {
                ex6.printStackTrace();
            }
        }
    }
    
    public void renderHudElementBackground(HudElement p0, RenderContext p1, IRenderer2D p2, double p3, double p4, int p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          64877252440576
        //     6: lxor           
        //     7: lstore          9
        //     9: aload_0        
        //    10: aload_1        
        //    11: astore_0       
        //    12: astore_1       
        //    13: invokestatic    org/rusherhack/Class253.m9154:()I
        //    16: aload_0        
        //    17: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getFontRenderer:()Lorg/rusherhack/client/api/render/font/IFontRenderer;
        //    20: getstatic       org/rusherhack/CustomFont.f3033:Lorg/rusherhack/CustomFont;
        //    23: getfield        org/rusherhack/CustomFont.f3024:Lorg/rusherhack/core/setting/BooleanSetting;
        //    26: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    29: checkcast       Ljava/lang/Boolean;
        //    32: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    35: invokeinterface org/rusherhack/client/api/render/font/IFontRenderer.setDefaultShadowState:(Z)V
        //    40: istore          11
        //    42: getstatic       org/rusherhack/HUD.backgroundBehindHudElements:Lorg/rusherhack/core/setting/BooleanSetting;
        //    45: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    48: checkcast       Ljava/lang/Boolean;
        //    51: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    54: iload           11
        //    56: ifne            117
        //    59: ifne            101
        //    62: goto            69
        //    65: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    68: athrow         
        //    69: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    72: getfield        net.minecraft.client.MinecraftClient.currentScreen:Lnet.minecraft.client.gui.screen.Screen;
        //    75: instanceof      Lorg/rusherhack/client/Class022;
        //    78: iload           11
        //    80: ifne            117
        //    83: goto            90
        //    86: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    89: athrow         
        //    90: ifne            101
        //    93: goto            100
        //    96: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    99: athrow         
        //   100: return         
        //   101: aload_0        
        //   102: iload           11
        //   104: ifne            121
        //   107: instanceof      Lorg/rusherhack/client/api/feature/hud/ListHudElement;
        //   110: goto            117
        //   113: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   116: athrow         
        //   117: ifeq            164
        //   120: aload_0        
        //   121: checkcast       Lorg/rusherhack/client/api/feature/hud/ListHudElement;
        //   124: astore_0       
        //   125: iload           11
        //   127: ifne            185
        //   130: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   133: getfield        net.minecraft.client.MinecraftClient.world:Lnet.minecraft.client.world.ClientWorld;
        //   136: ifnull          164
        //   139: goto            146
        //   142: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   145: athrow         
        //   146: aload_1        
        //   147: aload_0        
        //   148: aload_3        
        //   149: iload           8
        //   151: invokedynamic   BootstrapMethod #1, accept:(Lorg/rusherhack/client/api/render/IRenderer2D;I)Ljava/util/function/Consumer;
        //   156: invokevirtual   org/rusherhack/Renderer127.m5943:(Lorg/rusherhack/client/api/feature/hud/ListHudElement;Ljava/util/function/Consumer;)V
        //   159: return         
        //   160: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   163: athrow         
        //   164: aload_3        
        //   165: dconst_0       
        //   166: dup2           
        //   167: dload           4
        //   169: dload           6
        //   171: iconst_0       
        //   172: iconst_1       
        //   173: dup_x1         
        //   174: dup            
        //   175: pop2           
        //   176: fconst_1       
        //   177: iload           8
        //   179: dup            
        //   180: invokeinterface org/rusherhack/client/api/render/IRenderer2D._drawRectangle:(DDDDZZFII)V
        //   185: return         
        //    StackMapTable: 00 0F FF 00 41 00 09 07 00 28 07 00 02 07 00 D7 07 00 83 03 03 01 04 01 00 01 07 00 37 03 50 07 00 37 43 01 45 07 00 37 03 00 4B 07 00 37 43 01 43 07 00 28 FF 00 14 00 09 07 00 BB 07 00 02 07 00 D7 07 00 83 03 03 01 04 01 00 01 07 00 37 03 4D 07 00 37 FF 00 03 00 09 07 00 28 07 00 02 07 00 D7 07 00 83 03 03 01 04 01 00 00 14
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  42     62     65     69     Ljava/lang/MatchException;
        //  59     83     86     90     Ljava/lang/MatchException;
        //  69     93     96     100    Ljava/lang/MatchException;
        //  101    110    113    117    Ljava/lang/MatchException;
        //  125    139    142    146    Ljava/lang/MatchException;
        //  130    160    160    164    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0069:
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
    
    public Renderer127() {
        super(true);
        long n = Renderer127.f2692 ^ 0x5488191F86B0L;
        ElementBase f2688 = null;
        boolean f2689 = false;

        this.f2690 = new Class477(this);
        this.f2691 = new HashMap<HudElement$SnapPoint, Double>(5);
        this.f2689 = f2689;
        this.f2688 = f2688;
    }
    
    public Color getBackgroundColor(HudElement p0, double p1, double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          134287085906420
        //     6: lxor           
        //     7: lstore          6
        //     9: invokestatic    org/rusherhack/Class253.m9155:()I
        //    12: istore          8
        //    14: aload_0        
        //    15: astore          10
        //    17: aload_1        
        //    18: instanceof      Lorg/rusherhack/client/api/feature/hud/ResizeableHudElement;
        //    21: iload           8
        //    23: ifeq            77
        //    26: ifeq            76
        //    29: goto            36
        //    32: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    35: athrow         
        //    36: aload_1        
        //    37: checkcast       Lorg/rusherhack/client/api/feature/hud/ResizeableHudElement;
        //    40: invokevirtual   org/rusherhack/client/api/feature/hud/ResizeableHudElement.isResizing:()Z
        //    43: iload           8
        //    45: ifeq            77
        //    48: goto            55
        //    51: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    54: athrow         
        //    55: ifeq            76
        //    58: goto            65
        //    61: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    64: athrow         
        //    65: iconst_1       
        //    66: dup            
        //    67: dup            
        //    68: pop2           
        //    69: goto            80
        //    72: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    75: athrow         
        //    76: iconst_0       
        //    77: iconst_1       
        //    78: dup            
        //    79: pop2           
        //    80: istore          9
        //    82: getstatic       org/rusherhack/HUD.f8698:Lorg/rusherhack/client/api/setting/ColorSetting;
        //    85: invokevirtual   org/rusherhack/client/api/setting/ColorSetting.getValueRGB:()I
        //    88: istore_0       
        //    89: aload_1        
        //    90: iload           8
        //    92: ifeq            119
        //    95: dload_2        
        //    96: dload           4
        //    98: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.isHovered:(DD)Z
        //   101: ifeq            242
        //   104: goto            111
        //   107: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   110: athrow         
        //   111: aload_1        
        //   112: goto            119
        //   115: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   118: athrow         
        //   119: aload           10
        //   121: getfield        org/rusherhack/Renderer127.f2688:Lorg/rusherhack/client/api/ui/ElementBase;
        //   124: if_acmpne       242
        //   127: iload           9
        //   129: iload           8
        //   131: ifeq            198
        //   134: goto            141
        //   137: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   140: athrow         
        //   141: ifne            242
        //   144: goto            151
        //   147: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   150: athrow         
        //   151: iload_0        
        //   152: getstatic       org/rusherhack/HUD.f8698:Lorg/rusherhack/client/api/setting/ColorSetting;
        //   155: invokevirtual   org/rusherhack/client/api/setting/ColorSetting.getAlpha:()I
        //   158: sipush          8471
        //   161: ldc2_w          4412617494118264765
        //   164: lload           6
        //   166: lxor           
        //   167: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //   172: iadd           
        //   173: sipush          14861
        //   176: ldc2_w          740684299508216995
        //   179: lload           6
        //   181: lxor           
        //   182: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //   187: invokestatic    java/lang/Math.min:(II)I
        //   190: invokestatic    org/rusherhack/core/utils/ColorUtils.transparency:(II)I
        //   193: istore_0       
        //   194: aload_1        
        //   195: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.isDragging:()Z
        //   198: iload           8
        //   200: ifeq            241
        //   203: ifeq            242
        //   206: goto            213
        //   209: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   212: athrow         
        //   213: iload_0        
        //   214: sipush          4372
        //   217: ldc2_w          2785465950788509625
        //   220: lload           6
        //   222: lxor           
        //   223: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //   228: ldc2_w          0.5
        //   231: invokestatic    org/rusherhack/core/utils/ColorUtils.interpolateColor:(IID)I
        //   234: goto            241
        //   237: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   240: athrow         
        //   241: istore_0       
        //   242: new             Ljava/awt/Color;
        //   245: dup            
        //   246: iload_0        
        //   247: iconst_1       
        //   248: dup            
        //   249: dup            
        //   250: pop2           
        //   251: invokespecial   java/awt/Color.<init>:(IZ)V
        //   254: areturn        
        //    StackMapTable: 00 18 FF 00 20 00 08 07 00 02 07 00 28 03 03 04 01 00 07 00 02 00 01 07 00 37 03 4E 07 00 37 43 01 45 07 00 37 03 46 07 00 37 03 40 01 42 01 FF 00 1A 00 08 01 07 00 28 03 03 04 01 01 07 00 02 00 01 07 00 37 03 43 07 00 37 43 07 00 28 51 07 00 37 43 01 45 07 00 37 03 6E 01 4A 07 00 37 03 57 07 00 37 43 01 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  17     29     32     36     Ljava/lang/MatchException;
        //  26     48     51     55     Ljava/lang/MatchException;
        //  36     58     61     65     Ljava/lang/MatchException;
        //  55     72     72     76     Ljava/lang/MatchException;
        //  89     104    107    111    Ljava/lang/MatchException;
        //  95     112    115    119    Ljava/lang/MatchException;
        //  119    134    137    141    Ljava/lang/MatchException;
        //  127    144    147    151    Ljava/lang/MatchException;
        //  198    206    209    213    Ljava/lang/MatchException;
        //  203    234    237    241    Ljava/lang/MatchException;
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
    
    public boolean m5939(HudElement p0, double p1, double p2, int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          67808100285843
        //     6: lxor           
        //     7: lstore          7
        //     9: aload_0        
        //    10: astore          12
        //    12: invokestatic    org/rusherhack/Class253.m9154:()I
        //    15: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    18: invokevirtual   net.minecraft.client.MinecraftClient.getWindow:()Lnet.minecraft.client.util.Window;
        //    21: invokevirtual   net.minecraft.client.util.Window.getHandle:()J
        //    24: lstore          10
        //    26: istore          9
        //    28: getstatic       org/rusherhack/HUD.snappingToScreenCorners:Lorg/rusherhack/core/setting/BooleanSetting;
        //    31: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    34: checkcast       Ljava/lang/Boolean;
        //    37: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    40: iload           9
        //    42: ifne            149
        //    45: ifeq            148
        //    48: goto            55
        //    51: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    54: athrow         
        //    55: lload           10
        //    57: sipush          24760
        //    60: ldc2_w          8187518264540985983
        //    63: lload           7
        //    65: lxor           
        //    66: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //    71: invokestatic    net.minecraft.client.util.InputUtil.isKeyPressed:(JI)Z
        //    74: iload           9
        //    76: ifne            149
        //    79: goto            86
        //    82: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    85: athrow         
        //    86: ifne            148
        //    89: goto            96
        //    92: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    95: athrow         
        //    96: lload           10
        //    98: sipush          29057
        //   101: ldc2_w          1523462728380836685
        //   104: lload           7
        //   106: lxor           
        //   107: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //   112: invokestatic    net.minecraft.client.util.InputUtil.isKeyPressed:(JI)Z
        //   115: iload           9
        //   117: ifne            149
        //   120: goto            127
        //   123: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   126: athrow         
        //   127: ifne            148
        //   130: goto            137
        //   133: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   136: athrow         
        //   137: iconst_1       
        //   138: dup            
        //   139: dup            
        //   140: pop2           
        //   141: goto            152
        //   144: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   147: athrow         
        //   148: iconst_0       
        //   149: iconst_1       
        //   150: dup            
        //   151: pop2           
        //   152: istore_0       
        //   153: iload_0        
        //   154: iload           9
        //   156: ifne            231
        //   159: ifeq            230
        //   162: goto            169
        //   165: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   168: athrow         
        //   169: aload_1        
        //   170: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.isDragging:()Z
        //   173: iload           9
        //   175: ifne            231
        //   178: goto            185
        //   181: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   184: athrow         
        //   185: ifeq            230
        //   188: goto            195
        //   191: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   194: athrow         
        //   195: iload           6
        //   197: iload           9
        //   199: ifne            231
        //   202: goto            209
        //   205: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   208: athrow         
        //   209: ifne            230
        //   212: goto            219
        //   215: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   218: athrow         
        //   219: iconst_1       
        //   220: dup            
        //   221: dup            
        //   222: pop2           
        //   223: goto            234
        //   226: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   229: athrow         
        //   230: iconst_0       
        //   231: iconst_1       
        //   232: dup            
        //   233: pop2           
        //   234: istore_0       
        //   235: iload_0        
        //   236: iload           9
        //   238: ifne            276
        //   241: ifeq            263
        //   244: goto            251
        //   247: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   250: athrow         
        //   251: aload           12
        //   253: aload_1        
        //   254: invokevirtual   org/rusherhack/Renderer127.m5940:(Lorg/rusherhack/client/api/feature/hud/HudElement;)Lorg/rusherhack/client/api/feature/hud/HudElement$SnapPoint;
        //   257: astore_0       
        //   258: aload_1        
        //   259: aload_0        
        //   260: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.setSnapPoint:(Lorg/rusherhack/client/api/feature/hud/HudElement$SnapPoint;)V
        //   263: aload           12
        //   265: aload_1        
        //   266: dload_2        
        //   267: dload           4
        //   269: iload           6
        //   271: invokespecial   org/rusherhack/client/api/ui/hud/HudHandlerBase.consumeElementMouseRelease:(Lorg/rusherhack/client/api/ui/ElementBase;DDI)Z
        //   274: pop            
        //   275: iconst_0       
        //   276: ireturn        
        //    StackMapTable: 00 20 FF 00 33 00 09 07 00 02 07 00 28 03 03 01 04 01 04 07 00 02 00 01 07 00 37 03 5A 07 00 37 43 01 45 07 00 37 03 5A 07 00 37 43 01 45 07 00 37 03 46 07 00 37 03 40 01 42 01 FF 00 0C 00 09 01 07 00 28 03 03 01 04 01 04 07 00 02 00 01 07 00 37 03 4B 07 00 37 43 01 45 07 00 37 03 49 07 00 37 43 01 45 07 00 37 03 46 07 00 37 03 40 01 42 01 4C 07 00 37 03 FF 00 0B 00 09 00 07 00 28 03 03 01 04 01 04 07 00 02 00 00 4C 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  28     48     51     55     Ljava/lang/MatchException;
        //  45     79     82     86     Ljava/lang/MatchException;
        //  55     89     92     96     Ljava/lang/MatchException;
        //  86     120    123    127    Ljava/lang/MatchException;
        //  96     130    133    137    Ljava/lang/MatchException;
        //  127    144    144    148    Ljava/lang/MatchException;
        //  153    162    165    169    Ljava/lang/MatchException;
        //  159    178    181    185    Ljava/lang/MatchException;
        //  169    188    191    195    Ljava/lang/MatchException;
        //  185    202    205    209    Ljava/lang/MatchException;
        //  195    212    215    219    Ljava/lang/MatchException;
        //  209    226    226    230    Ljava/lang/MatchException;
        //  235    244    247    251    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
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
    
    public HudElement$SnapPoint m5940(HudElement hudElement) {
        return null;
    }
    
    public void render(RenderContext renderContext, double n, double n2) {
        
    }
    
    public void m5941(HudElement p0, HudElement$SnapPoint p1, double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          19355868099777
        //     6: lxor           
        //     7: lstore          5
        //     9: aload_0        
        //    10: aload_1        
        //    11: astore_0       
        //    12: astore_1       
        //    13: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    16: invokevirtual   net.minecraft.client.MinecraftClient.getWindow:()Lnet.minecraft.client.util.Window;
        //    19: astore          8
        //    21: invokestatic    org/rusherhack/Class253.m9154:()I
        //    24: aload_0        
        //    25: dup            
        //    26: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getX:()D
        //    29: pop2           
        //    30: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getY:()D
        //    33: pop2           
        //    34: istore          7
        //    36: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    39: getfield        net.minecraft.client.MinecraftClient.currentScreen:Lnet.minecraft.client.gui.screen.Screen;
        //    42: instanceof      Lnet.minecraft.client.gui.screen.ChatScreen;
        //    45: iload           7
        //    47: ifne            82
        //    50: ifeq            81
        //    53: goto            60
        //    56: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    59: athrow         
        //    60: sipush          31621
        //    63: ldc2_w          1031247076311099416
        //    66: lload           5
        //    68: lxor           
        //    69: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //    74: goto            85
        //    77: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    80: athrow         
        //    81: iconst_0       
        //    82: iconst_1       
        //    83: dup            
        //    84: pop2           
        //    85: istore          9
        //    87: aload_2        
        //    88: iload           7
        //    90: ifne            286
        //    93: ifnull          280
        //    96: goto            103
        //    99: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   102: athrow         
        //   103: aload           8
        //   105: dup            
        //   106: invokevirtual   net.minecraft.client.util.Window.getScaledWidth:()I
        //   109: istore          10
        //   111: invokevirtual   net.minecraft.client.util.Window.getScaledHeight:()I
        //   114: istore          11
        //   116: dconst_0       
        //   117: dstore          12
        //   119: dconst_0       
        //   120: dstore          14
        //   122: getstatic       org/rusherhack/Class247.f4368:[I
        //   125: aload_2        
        //   126: invokevirtual   java/lang/Enum.ordinal:()I
        //   129: iaload         
        //   130: tableswitch {
        //                2: 160
        //                3: 192
        //                4: 204
        //                5: 222
        //          default: 235
        //        }
        //   160: iload           10
        //   162: goto            169
        //   165: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   168: athrow         
        //   169: i2d            
        //   170: ldc2_w          2.0
        //   173: ddiv           
        //   174: aload_0        
        //   175: invokevirtual   org/rusherhack/client/api/ui/ScaledElementBase.getScaledWidth:()D
        //   178: ldc2_w          2.0
        //   181: ddiv           
        //   182: dsub           
        //   183: dstore          12
        //   185: dconst_0       
        //   186: dup2           
        //   187: dstore          14
        //   189: goto            237
        //   192: iload           10
        //   194: i2d            
        //   195: dstore          12
        //   197: dconst_0       
        //   198: dup2           
        //   199: dstore          14
        //   201: goto            237
        //   204: aload_2        
        //   205: getfield        org/rusherhack/client/api/feature/hud/HudElement$SnapPoint.x:D
        //   208: dstore          12
        //   210: iload           11
        //   212: iload           9
        //   214: isub           
        //   215: i2d            
        //   216: dup2           
        //   217: dstore          14
        //   219: goto            237
        //   222: iload           10
        //   224: i2d            
        //   225: dstore          12
        //   227: iload           11
        //   229: iload           9
        //   231: isub           
        //   232: i2d            
        //   233: dstore          14
        //   235: dload           14
        //   237: dconst_0       
        //   238: iload           7
        //   240: ifne            264
        //   243: dcmpl          
        //   244: ifne            261
        //   247: goto            254
        //   250: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   253: athrow         
        //   254: dload_3        
        //   255: dstore          14
        //   257: aload_0        
        //   258: goto            268
        //   261: dload           14
        //   263: dload_3        
        //   264: dsub           
        //   265: dstore          14
        //   267: aload_0        
        //   268: dload           12
        //   270: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.setX:(D)V
        //   273: aload_0        
        //   274: dload           14
        //   276: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.setY:(D)V
        //   279: return         
        //   280: getstatic       org/rusherhack/HUD.clampToScreenEdges:Lorg/rusherhack/core/setting/BooleanSetting;
        //   283: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   286: checkcast       Ljava/lang/Boolean;
        //   289: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   292: iload           7
        //   294: ifne            432
        //   297: ifne            421
        //   300: goto            307
        //   303: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   306: athrow         
        //   307: aload_0        
        //   308: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.isDragging:()Z
        //   311: iload           7
        //   313: ifne            436
        //   316: goto            323
        //   319: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   322: athrow         
        //   323: ifeq            435
        //   326: goto            333
        //   329: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   332: athrow         
        //   333: aload           8
        //   335: invokevirtual   net.minecraft.client.util.Window.getHandle:()J
        //   338: sipush          23512
        //   341: ldc2_w          807204570406406212
        //   344: lload           5
        //   346: lxor           
        //   347: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //   352: invokestatic    net.minecraft.client.util.InputUtil.isKeyPressed:(JI)Z
        //   355: iload           7
        //   357: ifne            436
        //   360: goto            367
        //   363: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   366: athrow         
        //   367: ifne            435
        //   370: goto            377
        //   373: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   376: athrow         
        //   377: aload           8
        //   379: invokevirtual   net.minecraft.client.util.Window.getHandle:()J
        //   382: sipush          19883
        //   385: ldc2_w          3812282125446241842
        //   388: lload           5
        //   390: lxor           
        //   391: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //   396: invokestatic    net.minecraft.client.util.InputUtil.isKeyPressed:(JI)Z
        //   399: iload           7
        //   401: ifne            436
        //   404: goto            411
        //   407: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   410: athrow         
        //   411: ifne            435
        //   414: goto            421
        //   417: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   420: athrow         
        //   421: iconst_1       
        //   422: dup            
        //   423: dup            
        //   424: pop2           
        //   425: goto            432
        //   428: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   431: athrow         
        //   432: goto            439
        //   435: iconst_0       
        //   436: iconst_1       
        //   437: dup            
        //   438: pop2           
        //   439: istore          10
        //   441: iload           10
        //   443: ifeq            458
        //   446: aload_1        
        //   447: aload_0        
        //   448: invokevirtual   org/rusherhack/Renderer127.m5937:(Lorg/rusherhack/client/api/feature/hud/HudElement;)V
        //   451: goto            458
        //   454: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   457: athrow         
        //   458: return         
        //    StackMapTable: 00 2C FF 00 38 00 07 07 00 28 07 00 02 07 01 58 03 04 01 07 00 74 00 01 07 00 37 03 50 07 00 37 03 40 01 42 01 FF 00 0D 00 08 07 00 28 07 00 02 07 01 58 03 04 01 07 00 74 01 00 01 07 00 37 03 FF 00 38 00 0C 07 00 28 07 00 02 07 01 58 03 04 01 07 00 74 01 01 01 03 03 00 00 44 07 00 37 43 01 16 0B 11 0C 41 03 4C 07 00 37 03 06 FF 00 02 00 0C 07 00 28 07 00 02 07 01 58 03 04 01 07 00 74 01 01 01 03 03 00 02 03 03 43 07 00 28 FF 00 0B 00 08 07 00 28 07 00 02 07 01 58 03 04 01 07 00 74 01 00 00 45 07 01 7E 50 07 00 37 03 4B 07 00 37 43 01 45 07 00 37 03 5D 07 00 37 43 01 45 07 00 37 03 5D 07 00 37 43 01 45 07 00 37 03 46 07 00 37 43 01 02 40 01 42 01 FF 00 0E 00 09 07 00 28 07 00 02 07 01 58 03 04 01 07 00 74 01 01 00 01 07 00 37 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  36     53     56     60     Ljava/lang/MatchException;
        //  50     77     77     81     Ljava/lang/MatchException;
        //  87     96     99     103    Ljava/lang/MatchException;
        //  122    162    165    169    Ljava/lang/MatchException;
        //  237    247    250    254    Ljava/lang/MatchException;
        //  286    300    303    307    Ljava/lang/MatchException;
        //  297    316    319    323    Ljava/lang/MatchException;
        //  307    326    329    333    Ljava/lang/MatchException;
        //  323    360    363    367    Ljava/lang/MatchException;
        //  333    370    373    377    Ljava/lang/MatchException;
        //  367    404    407    411    Ljava/lang/MatchException;
        //  377    414    417    421    Ljava/lang/MatchException;
        //  411    425    428    432    Ljava/lang/MatchException;
        //  441    451    454    458    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0307:
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
    
    public void m5943(ListHudElement p0, Consumer<double[]> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          38073048141140
        //     6: lxor           
        //     7: lstore_3       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          5
        //    13: aload_0        
        //    14: aload_1        
        //    15: astore_0       
        //    16: astore_1       
        //    17: aload_0        
        //    18: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getAlignment:()Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //    21: dup            
        //    22: astore          6
        //    24: iload           5
        //    26: ifne            41
        //    29: ifnull          106
        //    32: goto            39
        //    35: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    38: athrow         
        //    39: aload           6
        //    41: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //    44: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //    47: iload           5
        //    49: ifne            103
        //    52: ifne            92
        //    55: goto            62
        //    58: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    61: athrow         
        //    62: aload           6
        //    64: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //    67: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //    70: iload           5
        //    72: ifne            107
        //    75: goto            82
        //    78: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    81: athrow         
        //    82: ifeq            106
        //    85: goto            92
        //    88: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    91: athrow         
        //    92: iconst_1       
        //    93: dup            
        //    94: dup            
        //    95: pop2           
        //    96: goto            103
        //    99: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   102: athrow         
        //   103: goto            110
        //   106: iconst_0       
        //   107: iconst_1       
        //   108: dup            
        //   109: pop2           
        //   110: istore          7
        //   112: dconst_0       
        //   113: dstore          8
        //   115: dconst_0       
        //   116: dstore          10
        //   118: dconst_0       
        //   119: dstore          12
        //   121: iconst_0       
        //   122: dup            
        //   123: istore          14
        //   125: aload_0        
        //   126: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement.getMembers:()Ljava/util/List;
        //   129: invokeinterface java/util/List.size:()I
        //   134: if_icmpge       488
        //   137: aload_0        
        //   138: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement.getMembers:()Ljava/util/List;
        //   141: iload           14
        //   143: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   148: checkcast       Lorg/rusherhack/client/api/feature/hud/ListHudElement$ListItem;
        //   151: dup            
        //   152: astore          15
        //   154: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement$ListItem.getWidth:()D
        //   157: dstore          16
        //   159: iload           14
        //   161: aload_0        
        //   162: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement.getMembers:()Ljava/util/List;
        //   165: invokeinterface java/util/List.size:()I
        //   170: iconst_1       
        //   171: dup            
        //   172: dup            
        //   173: pop2           
        //   174: isub           
        //   175: iload           5
        //   177: ifne            203
        //   180: if_icmpne       201
        //   183: goto            190
        //   186: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   189: athrow         
        //   190: iconst_1       
        //   191: dup            
        //   192: dup            
        //   193: pop2           
        //   194: goto            205
        //   197: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   200: athrow         
        //   201: iconst_0       
        //   202: iconst_1       
        //   203: dup            
        //   204: pop2           
        //   205: istore          18
        //   207: dload           16
        //   209: iload           5
        //   211: ifne            236
        //   214: dload           12
        //   216: dcmpl          
        //   217: ifle            238
        //   220: goto            227
        //   223: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   226: athrow         
        //   227: dload           16
        //   229: goto            236
        //   232: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   235: athrow         
        //   236: dstore          12
        //   238: aload           6
        //   240: ifnull          354
        //   243: getstatic       org/rusherhack/Class247.f4369:[I
        //   246: aload           6
        //   248: invokevirtual   java/lang/Enum.ordinal:()I
        //   251: iaload         
        //   252: tableswitch {
        //                2: 306
        //                3: 306
        //                4: 316
        //                5: 316
        //                6: 337
        //          default: 292
        //        }
        //   288: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   291: athrow         
        //   292: new             Ljava/lang/MatchException;
        //   295: dup            
        //   296: aconst_null    
        //   297: dup            
        //   298: invokespecial   java/lang/MatchException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   301: athrow         
        //   302: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   305: athrow         
        //   306: dload           16
        //   308: dup2           
        //   309: dsub           
        //   310: dneg           
        //   311: dconst_1       
        //   312: dadd           
        //   313: goto            352
        //   316: aload_0        
        //   317: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement.getWidth:()D
        //   320: dload           16
        //   322: dsub           
        //   323: dconst_1       
        //   324: dsub           
        //   325: iload           5
        //   327: ifeq            352
        //   330: goto            308
        //   333: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   336: athrow         
        //   337: aload_0        
        //   338: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement.getWidth:()D
        //   341: ldc2_w          2.0
        //   344: ddiv           
        //   345: dload           16
        //   347: ldc2_w          2.0
        //   350: ddiv           
        //   351: dsub           
        //   352: dstore          8
        //   354: dload           16
        //   356: ldc2_w          2.0
        //   359: dadd           
        //   360: dstore          16
        //   362: aload           15
        //   364: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement$ListItem.getHeight:()D
        //   367: dconst_1       
        //   368: dadd           
        //   369: iload           18
        //   371: iload           5
        //   373: ifne            398
        //   376: ifeq            397
        //   379: goto            386
        //   382: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   385: athrow         
        //   386: iconst_1       
        //   387: dup            
        //   388: dup            
        //   389: pop2           
        //   390: goto            401
        //   393: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   396: athrow         
        //   397: iconst_0       
        //   398: iconst_1       
        //   399: dup            
        //   400: pop2           
        //   401: i2d            
        //   402: dadd           
        //   403: dstore          19
        //   405: dload           8
        //   407: dconst_1       
        //   408: dsub           
        //   409: dstore          21
        //   411: iload           7
        //   413: ifeq            433
        //   416: aload_0        
        //   417: invokevirtual   org/rusherhack/client/api/feature/hud/ListHudElement.getHeight:()D
        //   420: dload           10
        //   422: dsub           
        //   423: dload           19
        //   425: dsub           
        //   426: goto            435
        //   429: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   432: athrow         
        //   433: dload           10
        //   435: dstore          23
        //   437: iconst_4       
        //   438: newarray        D
        //   440: dup            
        //   441: iconst_0       
        //   442: dload           21
        //   444: dastore        
        //   445: dup            
        //   446: iconst_1       
        //   447: dup            
        //   448: dup            
        //   449: pop2           
        //   450: dload           23
        //   452: dastore        
        //   453: dup            
        //   454: iconst_2       
        //   455: dload           16
        //   457: dastore        
        //   458: dup            
        //   459: iconst_3       
        //   460: dload           19
        //   462: dastore        
        //   463: astore          15
        //   465: dload           10
        //   467: aload_2        
        //   468: aload           15
        //   470: invokeinterface java/util/function/Consumer.accept:(Ljava/lang/Object;)V
        //   475: iinc            14, 1
        //   478: dload           19
        //   480: dadd           
        //   481: dstore          10
        //   483: iload           14
        //   485: goto            125
        //   488: return         
        //    Signature:
        //  (Lorg/rusherhack/client/api/feature/hud/ListHudElement;Ljava/util/function/Consumer<[D>;)V
        //    StackMapTable: 00 2E FF 00 23 00 06 07 00 BB 07 00 02 07 02 46 04 01 07 02 1C 00 01 07 00 37 03 41 07 02 1C 50 07 00 37 03 4F 07 00 37 43 01 45 07 00 37 03 46 07 00 37 43 01 02 40 01 42 01 FF 00 0E 00 0B 07 00 BB 07 00 02 07 02 46 04 01 07 02 1C 01 03 03 03 01 00 01 01 FF 00 3C 00 0D 07 00 BB 07 00 02 07 02 46 04 01 07 02 1C 01 03 03 03 01 07 02 36 03 00 01 07 00 37 03 46 07 00 37 03 FF 00 01 00 0D 07 00 BB 07 00 02 07 02 46 04 01 07 02 1C 01 03 03 03 01 07 02 36 03 00 02 01 01 41 01 FF 00 11 00 0E 07 00 BB 07 00 02 07 02 46 04 01 07 02 1C 01 03 03 03 01 07 02 36 03 01 00 01 07 00 37 03 44 07 00 37 43 03 01 71 07 00 37 03 49 07 00 37 03 41 03 07 50 07 00 37 03 4E 03 01 5B 07 00 37 43 03 46 07 00 37 43 03 FF 00 00 00 0E 07 00 BB 07 00 02 07 02 46 04 01 07 02 1C 01 03 03 03 01 07 02 36 03 01 00 02 03 01 FF 00 02 00 0E 07 00 BB 07 00 02 07 02 46 04 01 07 02 1C 01 03 03 03 01 07 02 36 03 01 00 02 03 01 FF 00 1B 00 10 07 00 BB 07 00 02 07 02 46 04 01 07 02 1C 01 03 03 03 01 07 02 36 03 01 03 03 00 01 07 00 37 03 41 03 FF 00 34 00 0B 07 00 BB 07 00 02 07 02 46 04 01 07 02 1C 01 03 03 03 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  24     32     35     39     Ljava/lang/MatchException;
        //  41     55     58     62     Ljava/lang/MatchException;
        //  52     75     78     82     Ljava/lang/MatchException;
        //  62     85     88     92     Ljava/lang/MatchException;
        //  82     96     99     103    Ljava/lang/MatchException;
        //  159    183    186    190    Ljava/lang/MatchException;
        //  180    197    197    201    Ljava/lang/MatchException;
        //  207    220    223    227    Ljava/lang/MatchException;
        //  214    229    232    236    Ljava/lang/MatchException;
        //  238    288    288    292    Ljava/lang/MatchException;
        //  243    302    302    306    Ljava/lang/MatchException;
        //  316    333    333    337    Ljava/lang/MatchException;
        //  362    379    382    386    Ljava/lang/MatchException;
        //  376    393    393    397    Ljava/lang/MatchException;
        //  411    429    429    433    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0062:
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
    
    public boolean mouseClicked(double p0, double p1, int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          137544526228476
        //     6: lxor           
        //     7: lstore          6
        //     9: aload_0        
        //    10: astore          9
        //    12: invokestatic    org/rusherhack/Class253.m9155:()I
        //    15: iconst_0       
        //    16: istore_0       
        //    17: istore          8
        //    19: aload           9
        //    21: getfield        org/rusherhack/Renderer127.f2689:Z
        //    24: iload           8
        //    26: ifeq            53
        //    29: ifeq            52
        //    32: goto            39
        //    35: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    38: athrow         
        //    39: aload           9
        //    41: getfield        org/rusherhack/Renderer127.f2690:Lorg/rusherhack/Class477;
        //    44: dload_1        
        //    45: dload_3        
        //    46: iload           5
        //    48: invokevirtual   org/rusherhack/client/api/ui/ElementHandlerBase.mouseClicked:(DDI)Z
        //    51: istore_0       
        //    52: iload_0        
        //    53: iload           8
        //    55: ifeq            111
        //    58: ifne            110
        //    61: goto            68
        //    64: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    67: athrow         
        //    68: aload           9
        //    70: dload_1        
        //    71: dload_3        
        //    72: iload           5
        //    74: invokevirtual   org/rusherhack/client/api/ui/ElementHandlerBase.consumeMouseClick:(DDI)Z
        //    77: iload           8
        //    79: ifeq            111
        //    82: goto            89
        //    85: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    88: athrow         
        //    89: ifeq            110
        //    92: goto            99
        //    95: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    98: athrow         
        //    99: iconst_1       
        //   100: dup            
        //   101: dup            
        //   102: pop2           
        //   103: istore_0       
        //   104: aload           9
        //   106: iconst_0       
        //   107: putfield        org/rusherhack/Renderer127.f2689:Z
        //   110: iload_0        
        //   111: iload           8
        //   113: ifeq            175
        //   116: ifne            174
        //   119: goto            126
        //   122: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   125: athrow         
        //   126: aload           9
        //   128: getfield        org/rusherhack/Renderer127.f2689:Z
        //   131: iload           8
        //   133: ifeq            175
        //   136: goto            143
        //   139: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   142: athrow         
        //   143: ifne            174
        //   146: goto            153
        //   149: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   152: athrow         
        //   153: aload           9
        //   155: dup            
        //   156: getfield        org/rusherhack/Renderer127.f2690:Lorg/rusherhack/Class477;
        //   159: dload_1        
        //   160: dload_3        
        //   161: iload           5
        //   163: invokevirtual   org/rusherhack/client/api/ui/ElementHandlerBase.mouseClicked:(DDI)Z
        //   166: istore_0       
        //   167: iconst_1       
        //   168: dup            
        //   169: dup            
        //   170: pop2           
        //   171: putfield        org/rusherhack/Renderer127.f2689:Z
        //   174: iload_0        
        //   175: ireturn        
        //    StackMapTable: 00 14 FF 00 23 00 07 01 03 03 01 04 01 07 00 02 00 01 07 00 37 03 0C 40 01 4A 07 00 37 03 50 07 00 37 43 01 45 07 00 37 03 0A 40 01 4A 07 00 37 03 4C 07 00 37 43 01 45 07 00 37 03 14 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  19     32     35     39     Ljava/lang/MatchException;
        //  53     61     64     68     Ljava/lang/MatchException;
        //  58     82     85     89     Ljava/lang/MatchException;
        //  68     92     95     99     Ljava/lang/MatchException;
        //  111    119    122    126    Ljava/lang/MatchException;
        //  116    136    139    143    Ljava/lang/MatchException;
        //  126    146    149    153    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
    
    public ElementBase m5944(double p0, double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          95029706428208
        //     6: lxor           
        //     7: lstore          5
        //     9: invokestatic    org/rusherhack/Class253.m9154:()I
        //    12: istore          7
        //    14: aload_0        
        //    15: astore          8
        //    17: aload           8
        //    19: dup            
        //    20: getfield        org/rusherhack/Renderer127.f2690:Lorg/rusherhack/Class477;
        //    23: invokevirtual   org/rusherhack/Class477.getScale:()F
        //    26: fstore_0       
        //    27: getfield        org/rusherhack/Renderer127.f2690:Lorg/rusherhack/Class477;
        //    30: aload           8
        //    32: dup_x1         
        //    33: getfield        org/rusherhack/Renderer127.f2690:Lorg/rusherhack/Class477;
        //    36: getfield        org/rusherhack/Class477.f7718:Lorg/rusherhack/Renderer202;
        //    39: dload_1        
        //    40: fload_0        
        //    41: f2d            
        //    42: ddiv           
        //    43: dload_3        
        //    44: fload_0        
        //    45: f2d            
        //    46: ddiv           
        //    47: invokevirtual   org/rusherhack/client/api/ui/ElementHandlerBase.isElementHovered:(Lorg/rusherhack/client/api/ui/ElementBase;DD)Z
        //    50: istore_0       
        //    51: iload           7
        //    53: ifne            95
        //    56: getfield        org/rusherhack/Renderer127.f2689:Z
        //    59: ifeq            93
        //    62: goto            69
        //    65: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    68: athrow         
        //    69: iload_0        
        //    70: ifeq            93
        //    73: goto            80
        //    76: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    79: athrow         
        //    80: aload           8
        //    82: getfield        org/rusherhack/Renderer127.f2690:Lorg/rusherhack/Class477;
        //    85: getfield        org/rusherhack/Class477.f7718:Lorg/rusherhack/Renderer202;
        //    88: areturn        
        //    89: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    92: athrow         
        //    93: aload           8
        //    95: invokevirtual   org/rusherhack/client/api/ui/hud/HudHandlerBase.getElements:()Ljava/util/List;
        //    98: invokestatic    com/google/common/collect/Lists.reverse:(Ljava/util/List;)Ljava/util/List;
        //   101: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   106: astore          9
        //   108: aload           9
        //   110: invokeinterface java/util/Iterator.hasNext:()Z
        //   115: ifeq            193
        //   118: aload           9
        //   120: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   125: checkcast       Lorg/rusherhack/client/api/feature/hud/HudElement;
        //   128: goto            135
        //   131: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   134: athrow         
        //   135: astore          10
        //   137: aload           8
        //   139: aload           10
        //   141: invokevirtual   org/rusherhack/client/api/ui/ElementHandlerBase.isEnabled:(Lorg/rusherhack/client/api/ui/ElementBase;)Z
        //   144: iload           7
        //   146: ifne            198
        //   149: iload           7
        //   151: ifne            182
        //   154: ifne            173
        //   157: goto            164
        //   160: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   163: athrow         
        //   164: aload           9
        //   166: goto            110
        //   169: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   172: athrow         
        //   173: aload           8
        //   175: aload           10
        //   177: dload_1        
        //   178: dload_3        
        //   179: invokespecial   org/rusherhack/client/api/ui/hud/HudHandlerBase.isElementHovered:(Lorg/rusherhack/client/api/feature/hud/HudElement;DD)Z
        //   182: ifeq            108
        //   185: aload           10
        //   187: iload           7
        //   189: ifne            135
        //   192: areturn        
        //   193: aload           8
        //   195: getfield        org/rusherhack/Renderer127.f2689:Z
        //   198: iload           7
        //   200: ifne            214
        //   203: ifne            230
        //   206: goto            213
        //   209: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   212: athrow         
        //   213: iload_0        
        //   214: ifeq            230
        //   217: aload           8
        //   219: getfield        org/rusherhack/Renderer127.f2690:Lorg/rusherhack/Class477;
        //   222: getfield        org/rusherhack/Class477.f7718:Lorg/rusherhack/Renderer202;
        //   225: areturn        
        //   226: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   229: athrow         
        //   230: aconst_null    
        //   231: areturn        
        //    StackMapTable: 00 17 FF 00 41 00 06 01 03 03 04 01 07 00 02 00 01 07 00 37 03 46 07 00 37 03 48 07 00 37 03 41 07 00 02 FC 00 0C 07 02 68 41 07 02 68 54 07 00 37 43 07 00 28 FF 00 18 00 08 01 03 03 04 01 07 00 02 07 02 68 07 00 28 00 01 07 00 37 03 44 07 00 37 03 48 01 FA 00 0A 44 01 4A 07 00 37 03 40 01 4B 07 00 37 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  51     62     65     69     Ljava/lang/MatchException;
        //  56     73     76     80     Ljava/lang/MatchException;
        //  69     89     89     93     Ljava/lang/MatchException;
        //  110    128    131    135    Ljava/lang/MatchException;
        //  149    157    160    164    Ljava/lang/MatchException;
        //  154    169    169    173    Ljava/lang/MatchException;
        //  198    206    209    213    Ljava/lang/MatchException;
        //  214    226    226    230    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0069:
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
    
    public void renderHudElement(HudElement hudElement, RenderContext renderContext, double n, double n2) {
        long n3 = Renderer127.f2692 ^ 0x2F640759E4CAL;
        renderContext.pose();
        HudElement$SnapPoint snapPoint = hudElement.getSnapPoint();
        this.f2691.putIfAbsent(snapPoint, 0.0);
        double doubleValue = this.f2691.get(snapPoint);
        this.m5941(hudElement, snapPoint, doubleValue);
        this.f2691.replace(snapPoint, doubleValue + ((ScaledElementBase)hudElement).getScaledHeight());
        super.renderHudElement(hudElement, renderContext, n, n2);
    }
    
    public void m5945(RenderContext renderContext, int n) {
    }
    
    public void setDefaultPositions() {
        super.setDefaultPositions();
    }
    
    public boolean m5946(HudElement p0, double p1, double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          1794742098188
        //     6: lxor           
        //     7: lstore          6
        //     9: aload_0        
        //    10: aload_1        
        //    11: astore_0       
        //    12: astore_1       
        //    13: invokestatic    org/rusherhack/Class253.m9154:()I
        //    16: aload_1        
        //    17: aload_0        
        //    18: dload_2        
        //    19: dload           4
        //    21: invokespecial   org/rusherhack/client/api/ui/hud/HudHandlerBase.consumeElementMouseMove:(Lorg/rusherhack/client/api/ui/ElementBase;DD)Z
        //    24: istore_2       
        //    25: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    28: invokevirtual   net.minecraft.client.MinecraftClient.getWindow:()Lnet.minecraft.client.util.Window;
        //    31: astore_3       
        //    32: istore          8
        //    34: getstatic       org/rusherhack/HUD.clampToScreenEdges:Lorg/rusherhack/core/setting/BooleanSetting;
        //    37: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    40: checkcast       Ljava/lang/Boolean;
        //    43: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    46: iload           8
        //    48: ifne            184
        //    51: ifne            173
        //    54: goto            61
        //    57: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    60: athrow         
        //    61: aload_0        
        //    62: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.isDragging:()Z
        //    65: iload           8
        //    67: ifne            188
        //    70: goto            77
        //    73: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    76: athrow         
        //    77: ifeq            187
        //    80: goto            87
        //    83: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    86: athrow         
        //    87: aload_3        
        //    88: invokevirtual   net.minecraft.client.util.Window.getHandle:()J
        //    91: sipush          24760
        //    94: ldc2_w          8187496231102127840
        //    97: lload           6
        //    99: lxor           
        //   100: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //   105: invokestatic    net.minecraft.client.util.InputUtil.isKeyPressed:(JI)Z
        //   108: iload           8
        //   110: ifne            188
        //   113: goto            120
        //   116: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   119: athrow         
        //   120: ifne            187
        //   123: goto            130
        //   126: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   129: athrow         
        //   130: aload_3        
        //   131: invokevirtual   net.minecraft.client.util.Window.getHandle:()J
        //   134: sipush          29057
        //   137: ldc2_w          1523431968113561554
        //   140: lload           6
        //   142: lxor           
        //   143: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //   148: invokestatic    net.minecraft.client.util.InputUtil.isKeyPressed:(JI)Z
        //   151: iload           8
        //   153: ifne            188
        //   156: goto            163
        //   159: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   162: athrow         
        //   163: ifne            187
        //   166: goto            173
        //   169: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   172: athrow         
        //   173: iconst_1       
        //   174: dup            
        //   175: dup            
        //   176: pop2           
        //   177: goto            184
        //   180: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   183: athrow         
        //   184: goto            191
        //   187: iconst_0       
        //   188: iconst_1       
        //   189: dup            
        //   190: pop2           
        //   191: istore          4
        //   193: iload           4
        //   195: iload           8
        //   197: ifne            223
        //   200: ifeq            222
        //   203: goto            210
        //   206: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   209: athrow         
        //   210: aload_1        
        //   211: aload_0        
        //   212: invokevirtual   org/rusherhack/Renderer127.m5937:(Lorg/rusherhack/client/api/feature/hud/HudElement;)V
        //   215: goto            222
        //   218: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   221: athrow         
        //   222: iload_2        
        //   223: ireturn        
        //    StackMapTable: 00 18 FF 00 39 00 07 07 00 28 07 00 02 01 07 00 74 03 04 01 00 01 07 00 37 03 4B 07 00 37 43 01 45 07 00 37 03 5C 07 00 37 43 01 45 07 00 37 03 5C 07 00 37 43 01 45 07 00 37 03 46 07 00 37 43 01 02 40 01 42 01 FF 00 0E 00 08 07 00 28 07 00 02 01 07 00 74 01 00 04 01 00 01 07 00 37 03 47 07 00 37 03 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  34     54     57     61     Ljava/lang/MatchException;
        //  51     70     73     77     Ljava/lang/MatchException;
        //  61     80     83     87     Ljava/lang/MatchException;
        //  77     113    116    120    Ljava/lang/MatchException;
        //  87     123    126    130    Ljava/lang/MatchException;
        //  120    156    159    163    Ljava/lang/MatchException;
        //  130    166    169    173    Ljava/lang/MatchException;
        //  163    177    180    184    Ljava/lang/MatchException;
        //  193    203    206    210    Ljava/lang/MatchException;
        //  200    215    218    222    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0061:
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
    
    public void renderElements(RenderContext p0, double p1, double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          100886571218635
        //     6: lxor           
        //     7: lstore          6
        //     9: aload_0        
        //    10: astore          10
        //    12: invokestatic    org/rusherhack/Class253.m9154:()I
        //    15: dload_2        
        //    16: aload           10
        //    18: dup_x2         
        //    19: dup_x2         
        //    20: getfield        org/rusherhack/Renderer127.f2691:Ljava/util/HashMap;
        //    23: invokevirtual   java/util/HashMap.clear:()V
        //    26: dload           4
        //    28: invokevirtual   org/rusherhack/Renderer127.m5944:(DD)Lorg/rusherhack/client/api/ui/ElementBase;
        //    31: putfield        org/rusherhack/Renderer127.f2688:Lorg/rusherhack/client/api/ui/ElementBase;
        //    34: istore          8
        //    36: getstatic       org/rusherhack/HUD.blur:Lorg/rusherhack/core/setting/BooleanSetting;
        //    39: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    42: checkcast       Ljava/lang/Boolean;
        //    45: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    48: iload           8
        //    50: ifne            82
        //    53: ifeq            310
        //    56: goto            63
        //    59: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    62: athrow         
        //    63: getstatic       org/rusherhack/HUD.backgroundBehindHudElements:Lorg/rusherhack/core/setting/BooleanSetting;
        //    66: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    69: checkcast       Ljava/lang/Boolean;
        //    72: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    75: goto            82
        //    78: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    81: athrow         
        //    82: iload           8
        //    84: ifne            113
        //    87: ifne            116
        //    90: goto            97
        //    93: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //    96: athrow         
        //    97: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   100: getfield        net.minecraft.client.MinecraftClient.currentScreen:Lnet.minecraft.client.gui.screen.Screen;
        //   103: instanceof      Lorg/rusherhack/client/Class022;
        //   106: goto            113
        //   109: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   112: athrow         
        //   113: ifeq            310
        //   116: getstatic       org/rusherhack/Class594.f9412:Lorg/rusherhack/Class594;
        //   119: invokevirtual   org/rusherhack/Class594.m18048:()V
        //   122: aload           10
        //   124: invokevirtual   org/rusherhack/client/api/ui/hud/HudHandlerBase.getElements:()Ljava/util/List;
        //   127: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   132: dup            
        //   133: astore          9
        //   135: invokeinterface java/util/Iterator.hasNext:()Z
        //   140: ifeq            286
        //   143: aload           9
        //   145: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   150: checkcast       Lorg/rusherhack/client/api/feature/hud/HudElement;
        //   153: astore_0       
        //   154: aload           10
        //   156: iload           8
        //   158: ifne            312
        //   161: aload_0        
        //   162: invokevirtual   org/rusherhack/client/api/ui/ElementHandlerBase.isEnabled:(Lorg/rusherhack/client/api/ui/ElementBase;)Z
        //   165: ifne            184
        //   168: goto            175
        //   171: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   174: athrow         
        //   175: aload           9
        //   177: goto            135
        //   180: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   183: athrow         
        //   184: aload_0        
        //   185: dup            
        //   186: dup_x1         
        //   187: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getStartX:()D
        //   190: d2f            
        //   191: fstore          11
        //   193: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getStartY:()D
        //   196: d2f            
        //   197: fstore          12
        //   199: iload           8
        //   201: ifne            246
        //   204: instanceof      Lorg/rusherhack/client/api/feature/hud/ListHudElement;
        //   207: ifeq            245
        //   210: goto            217
        //   213: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   216: athrow         
        //   217: aload_0        
        //   218: checkcast       Lorg/rusherhack/client/api/feature/hud/ListHudElement;
        //   221: astore          13
        //   223: aload           10
        //   225: fload           11
        //   227: fload           12
        //   229: aload           13
        //   231: dup_x2         
        //   232: invokedynamic   BootstrapMethod #3, accept:(FFLorg/rusherhack/client/api/feature/hud/ListHudElement;)Ljava/util/function/Consumer;
        //   237: invokevirtual   org/rusherhack/Renderer127.m5943:(Lorg/rusherhack/client/api/feature/hud/ListHudElement;Ljava/util/function/Consumer;)V
        //   240: aload           9
        //   242: goto            135
        //   245: aload_0        
        //   246: dup            
        //   247: invokevirtual   org/rusherhack/client/api/ui/ScaledElementBase.getScaledWidth:()D
        //   250: d2f            
        //   251: fstore          13
        //   253: invokevirtual   org/rusherhack/client/api/ui/ScaledElementBase.getScaledHeight:()D
        //   256: d2f            
        //   257: fstore          14
        //   259: getstatic       org/rusherhack/Class594.f9412:Lorg/rusherhack/Class594;
        //   262: invokevirtual   org/rusherhack/Class594.m18055:()Lorg/rusherhack/Class153;
        //   265: fload           12
        //   267: fload           11
        //   269: dup_x1         
        //   270: fload           13
        //   272: fadd           
        //   273: fload           12
        //   275: fload           14
        //   277: fadd           
        //   278: invokestatic    org/rusherhack/Class480.m14979:(Lorg/rusherhack/Class153;FFFF)V
        //   281: aload           9
        //   283: goto            135
        //   286: getstatic       org/rusherhack/Class594.f9412:Lorg/rusherhack/Class594;
        //   289: invokevirtual   org/rusherhack/Class594.m18052:()V
        //   292: getstatic       org/rusherhack/Class594.f9412:Lorg/rusherhack/Class594;
        //   295: getstatic       org/rusherhack/Hud297.strength:Lorg/rusherhack/core/setting/NumberSetting;
        //   298: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   301: checkcast       Ljava/lang/Integer;
        //   304: invokevirtual   java/lang/Integer.intValue:()I
        //   307: invokevirtual   org/rusherhack/Class594.m18053:(I)V
        //   310: aload           10
        //   312: aload_1        
        //   313: aload           10
        //   315: dup_x1         
        //   316: aload_1        
        //   317: dload_2        
        //   318: dload           4
        //   320: invokespecial   org/rusherhack/client/api/ui/hud/HudHandlerBase.renderElements:(Lorg/rusherhack/client/api/render/RenderContext;DD)V
        //   323: invokevirtual   org/rusherhack/client/api/render/RenderContext.pose:()Lnet.minecraft.client.util.math.MatrixStack;
        //   326: astore          9
        //   328: invokeinterface org/rusherhack/client/api/render/IRenderable2D.getRenderer:()Lorg/rusherhack/client/api/render/IRenderer2D;
        //   333: astore_0       
        //   334: invokevirtual   org/rusherhack/client/api/ui/hud/HudHandlerBase.getFontRenderer:()Lorg/rusherhack/client/api/render/font/IFontRenderer;
        //   337: astore          11
        //   339: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   342: getfield        net.minecraft.client.MinecraftClient.currentScreen:Lnet.minecraft.client.gui.screen.Screen;
        //   345: instanceof      Lorg/rusherhack/client/Class022;
        //   348: iload           8
        //   350: ifne            376
        //   353: ifeq            778
        //   356: goto            363
        //   359: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   362: athrow         
        //   363: aload_0        
        //   364: invokeinterface org/rusherhack/client/api/render/IRenderer.isBuilding:()Z
        //   369: goto            376
        //   372: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   375: athrow         
        //   376: dup            
        //   377: istore          12
        //   379: ifne            399
        //   382: aload_0        
        //   383: aload           9
        //   385: aload           11
        //   387: invokeinterface org/rusherhack/client/api/render/IRenderer2D.begin:(Lnet.minecraft.client.util.math.MatrixStack;Lorg/rusherhack/client/api/render/font/IFontRenderer;)V
        //   392: goto            399
        //   395: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   398: athrow         
        //   399: aload           10
        //   401: invokevirtual   org/rusherhack/client/api/ui/hud/HudHandlerBase.getElements:()Ljava/util/List;
        //   404: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   409: astore          13
        //   411: aload           13
        //   413: invokeinterface java/util/Iterator.hasNext:()Z
        //   418: ifeq            760
        //   421: aload           13
        //   423: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   428: checkcast       Lorg/rusherhack/client/api/feature/hud/HudElement;
        //   431: astore          14
        //   433: aload           10
        //   435: aload           14
        //   437: invokevirtual   org/rusherhack/client/api/ui/ElementHandlerBase.isEnabled:(Lorg/rusherhack/client/api/ui/ElementBase;)Z
        //   440: iload           8
        //   442: ifne            762
        //   445: iload           8
        //   447: ifne            493
        //   450: goto            457
        //   453: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   456: athrow         
        //   457: ifne            476
        //   460: goto            467
        //   463: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   466: athrow         
        //   467: aload           13
        //   469: goto            413
        //   472: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   475: athrow         
        //   476: aload           14
        //   478: iload           8
        //   480: ifne            498
        //   483: instanceof      Lorg/rusherhack/client/api/feature/hud/ResizeableHudElement;
        //   486: goto            493
        //   489: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   492: athrow         
        //   493: ifeq            411
        //   496: aload           14
        //   498: checkcast       Lorg/rusherhack/client/api/feature/hud/ResizeableHudElement;
        //   501: astore_1       
        //   502: aload           9
        //   504: aload           14
        //   506: dup_x1         
        //   507: dup_x2         
        //   508: aload           9
        //   510: invokevirtual   net.minecraft.client.util.math.MatrixStack.push:()V
        //   513: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getStartX:()D
        //   516: aload           14
        //   518: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getStartY:()D
        //   521: dconst_0       
        //   522: invokevirtual   net.minecraft.client.util.math.MatrixStack.translate:(DDD)V
        //   525: aload           14
        //   527: invokevirtual   org/rusherhack/client/api/ui/ScaledElementBase.getScaledWidth:()D
        //   530: dstore          15
        //   532: invokevirtual   org/rusherhack/client/api/ui/ScaledElementBase.getScaledHeight:()D
        //   535: dstore          17
        //   537: dload_2        
        //   538: dload           4
        //   540: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.isHovered:(DD)Z
        //   543: iload           8
        //   545: ifne            572
        //   548: ifeq            676
        //   551: goto            558
        //   554: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   557: athrow         
        //   558: aload_1        
        //   559: dload_2        
        //   560: dload           4
        //   562: invokevirtual   org/rusherhack/client/api/feature/hud/ResizeableHudElement.isHoveredOverIndicator:(DD)Z
        //   565: goto            572
        //   568: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   571: athrow         
        //   572: iload           8
        //   574: ifne            600
        //   577: ifeq            676
        //   580: goto            587
        //   583: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   586: athrow         
        //   587: getstatic       org/rusherhack/HUD.f8698:Lorg/rusherhack/client/api/setting/ColorSetting;
        //   590: invokevirtual   org/rusherhack/client/api/setting/ColorSetting.getValueRGB:()I
        //   593: goto            600
        //   596: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   599: athrow         
        //   600: istore          11
        //   602: aload_1        
        //   603: invokevirtual   org/rusherhack/client/api/feature/hud/ResizeableHudElement.isResizing:()Z
        //   606: iload           8
        //   608: ifne            650
        //   611: ifeq            652
        //   614: goto            621
        //   617: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   620: athrow         
        //   621: iload           11
        //   623: sipush          10112
        //   626: ldc2_w          4131250157589149200
        //   629: lload           6
        //   631: lxor           
        //   632: invokedynamic   BootstrapMethod #2, o:(IJ)I
        //   637: ldc2_w          0.5
        //   640: invokestatic    org/rusherhack/core/utils/ColorUtils.interpolateColor:(IID)I
        //   643: goto            650
        //   646: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   649: athrow         
        //   650: istore          11
        //   652: aload_0        
        //   653: dload           15
        //   655: ldc2_w          6.0
        //   658: dsub           
        //   659: dload           17
        //   661: ldc2_w          6.0
        //   664: dsub           
        //   665: ldc2_w          6.0
        //   668: dup2           
        //   669: iload           11
        //   671: invokeinterface org/rusherhack/client/api/render/IRenderer2D.drawRectangle:(DDDDI)V
        //   676: aload_0        
        //   677: dup            
        //   678: dload           15
        //   680: dup2_x1        
        //   681: aload_0        
        //   682: dload           15
        //   684: ldc2_w          6.0
        //   687: dsub           
        //   688: dload           15
        //   690: dload           17
        //   692: dup2_x2        
        //   693: ldc2_w          6.0
        //   696: dsub           
        //   697: ldc_w           1.5
        //   700: iconst_m1      
        //   701: invokeinterface org/rusherhack/client/api/render/IRenderer2D.drawLine:(DDDDFI)V
        //   706: ldc2_w          4.0
        //   709: dsub           
        //   710: dload           15
        //   712: dload           17
        //   714: dup2_x2        
        //   715: ldc2_w          4.0
        //   718: dsub           
        //   719: ldc_w           1.5
        //   722: iconst_m1      
        //   723: invokeinterface org/rusherhack/client/api/render/IRenderer2D.drawLine:(DDDDFI)V
        //   728: ldc2_w          2.0
        //   731: dsub           
        //   732: dload           15
        //   734: dload           17
        //   736: dup2_x2        
        //   737: ldc2_w          2.0
        //   740: dsub           
        //   741: ldc_w           1.5
        //   744: iconst_m1      
        //   745: invokeinterface org/rusherhack/client/api/render/IRenderer2D.drawLine:(DDDDFI)V
        //   750: aload           9
        //   752: invokevirtual   net.minecraft.client.util.math.MatrixStack.pop:()V
        //   755: iload           8
        //   757: ifeq            411
        //   760: iload           12
        //   762: ifne            778
        //   765: aload_0        
        //   766: invokeinterface org/rusherhack/client/api/render/IRenderer.end:()V
        //   771: goto            778
        //   774: invokestatic    org/rusherhack/Renderer127.m285:(Ljava/lang/MatchException;)Ljava/lang/MatchException;
        //   777: athrow         
        //   778: return         
        //    StackMapTable: 00 38 FF 00 3B 00 08 07 00 02 07 00 D7 03 03 04 01 00 07 00 02 00 01 07 00 37 03 4E 07 00 37 43 01 4A 07 00 37 03 4B 07 00 37 43 01 02 FF 00 12 00 08 07 01 7E 07 00 D7 03 03 04 01 07 02 68 07 00 02 00 01 07 02 68 FF 00 23 00 08 07 00 28 07 00 D7 03 03 04 01 07 02 68 07 00 02 00 01 07 00 37 03 44 07 00 37 03 FF 00 1C 00 0A 07 00 28 07 00 D7 03 03 04 01 07 02 68 07 00 02 02 02 00 01 07 00 37 03 1B 40 07 00 28 FF 00 27 00 08 07 01 7E 07 00 D7 03 03 04 01 07 02 68 07 00 02 00 00 FF 00 17 00 08 07 01 7E 07 00 D7 03 03 04 01 00 07 00 02 00 00 41 07 00 02 FF 00 2E 00 09 07 00 83 07 00 D7 03 03 04 01 07 01 D5 07 00 02 07 00 AA 00 01 07 00 37 03 48 07 00 37 43 01 FF 00 12 00 0A 07 00 83 07 00 D7 03 03 04 01 07 01 D5 07 00 02 07 00 AA 01 00 01 07 00 37 03 FF 00 0B 00 0B 07 00 83 07 01 7E 03 03 04 01 07 01 D5 07 00 02 00 01 07 02 68 00 00 41 07 02 68 FF 00 27 00 0C 07 00 83 07 01 7E 03 03 04 01 07 01 D5 07 00 02 00 01 07 02 68 07 00 28 00 01 07 00 37 43 01 45 07 00 37 03 44 07 00 37 03 4C 07 00 37 43 01 44 07 00 28 FF 00 37 00 0E 07 00 83 07 00 EE 03 03 04 01 07 01 D5 07 00 02 00 01 07 02 68 07 00 28 03 03 00 01 07 00 37 03 49 07 00 37 43 01 4A 07 00 37 03 48 07 00 37 43 01 FF 00 10 00 0E 07 00 83 07 00 EE 03 03 04 01 07 01 D5 07 00 02 01 01 07 02 68 07 00 28 03 03 00 01 07 00 37 03 58 07 00 37 43 01 01 FF 00 17 00 0E 07 00 83 07 00 EE 03 03 04 01 07 01 D5 07 00 02 00 01 07 02 68 07 00 28 03 03 00 00 FF 00 53 00 0B 07 00 83 07 01 7E 03 03 04 01 07 01 D5 07 00 02 00 01 07 02 68 00 00 41 01 4B 07 00 37 F8 00 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  36     56     59     63     Ljava/lang/MatchException;
        //  53     75     78     82     Ljava/lang/MatchException;
        //  82     90     93     97     Ljava/lang/MatchException;
        //  87     106    109    113    Ljava/lang/MatchException;
        //  154    168    171    175    Ljava/lang/MatchException;
        //  161    180    180    184    Ljava/lang/MatchException;
        //  199    210    213    217    Ljava/lang/MatchException;
        //  339    356    359    363    Ljava/lang/MatchException;
        //  353    369    372    376    Ljava/lang/MatchException;
        //  379    392    395    399    Ljava/lang/MatchException;
        //  433    450    453    457    Ljava/lang/MatchException;
        //  445    460    463    467    Ljava/lang/MatchException;
        //  457    472    472    476    Ljava/lang/MatchException;
        //  476    486    489    493    Ljava/lang/MatchException;
        //  537    551    554    558    Ljava/lang/MatchException;
        //  548    565    568    572    Ljava/lang/MatchException;
        //  572    580    583    587    Ljava/lang/MatchException;
        //  577    593    596    600    Ljava/lang/MatchException;
        //  602    614    617    621    Ljava/lang/MatchException;
        //  611    643    646    650    Ljava/lang/MatchException;
        //  762    771    774    778    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0457:
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
    
    public static MatchException m285(MatchException ex) {
        return ex;
    }
    
    public static int m2808(int n, long n2) {
        return 0;
    }
    
    public static int m2809(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        int m2808 = m2808((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, m2808), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m2808;
    }
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Renderer127.m132:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static int m1279(long n, long n2) {
        n ^= (n2 << 48 | n2);
        int n3 = (int)(n >>> 46);
        if (Renderer127.f2697[n3] != null) {
            return n3;
        }
        Object o = Renderer127.f2696[n3];
        if (!(o instanceof String)) {
            return n3;
        }
        int n5 = switch ((int)(n >>> 42 & 0x3FL)) {
            case 0 -> 7;
            case 1 -> 41;
            case 2 -> 63;
            case 3 -> 47;
            case 4 -> 61;
            case 5 -> 12;
            case 6 -> 18;
            case 7 -> 39;
            case 8 -> 0;
            case 9 -> 31;
            case 10 -> 11;
            case 11 -> 27;
            case 12 -> 62;
            case 13 -> 58;
            case 14 -> 17;
            case 15 -> 46;
            case 16 -> 43;
            case 17 -> 16;
            case 18 -> 44;
            case 19 -> 38;
            case 20 -> 32;
            case 21 -> 60;
            case 22 -> 20;
            case 23 -> 40;
            case 24 -> 59;
            case 25 -> 56;
            case 26 -> 14;
            case 27 -> 4;
            case 28 -> 48;
            case 29 -> 2;
            case 30 -> 1;
            case 31 -> 57;
            case 32 -> 10;
            case 33 -> 54;
            case 34 -> 6;
            case 35 -> 22;
            case 36 -> 9;
            case 37 -> 8;
            case 38 -> 35;
            case 39 -> 30;
            case 40 -> 15;
            case 41 -> 5;
            case 42 -> 52;
            case 43 -> 42;
            case 44 -> 37;
            case 45 -> 45;
            case 46 -> 19;
            case 47 -> 55;
            case 48 -> 53;
            case 49 -> 3;
            case 50 -> 50;
            case 51 -> 49;
            case 52 -> 29;
            case 53 -> 28;
            case 54 -> 24;
            case 55 -> 25;
            case 56 -> 36;
            case 57 -> 21;
            case 58 -> 51;
            case 59 -> 34;
            case 60 -> 13;
            case 61 -> 23;
            case 62 -> 26;
            default -> 33;
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
        Renderer127.f2697[n3] = new String(charArray);
        return n3;
    }
    
    public static void m343() {
        Object[] f2696 = Renderer127.f2696;
        f2696[0] = "6Cu|\u001d\u001e6Cb \u0011\u0011,\bb>\u0011\u0004+y2c@";
        f2696[1] = "l\u0018\u0002n~Ul\u0018\u00152rZvS\u0015,rOq\"Gp'\r";
        f2696[2] = "Y6\u007fwY\u000fE,}+C\u001bU/6:G\u0013S*lwJ\n_j~<J\u000eC6}wC\u000fRjP,O?Z!u<E\u000e";
        f2696[3] = Double.TYPE;
        Renderer127.f2697[3] = "java/lang/Double";
        f2696[4] = Void.TYPE;
        Renderer127.f2697[4] = "java/lang/Void";
        f2696[5] = "%&\u0014q\u001009<\u0016-\n$)?]\u0259";
        f2696[6] = Integer.TYPE;
        Renderer127.f2697[6] = "java/lang/Integer";
        f2696[7] = ">J}*\u0010W\"P\u007fv\nC2S4\u0119";
        f2696[8] = "eYD14enVU~Wh{[Z\u0015bjjHF9ug";
        f2696[9] = "\u0018|hRz\u0005\u0004fj\u000e`\u0011\u0014e!\u001fd\u0019\u0012`{Ri\u0000\u001e H\u0010g\u0012\u0016b|";
        f2696[10] = "\n&\u0015Wsr\u0016<\u0017\u000bif\u0006?\\\u0418";
        f2696[11] = """
                    )+4\u0013\u0014Z516O\u000eN%2}^
                    F#7'\u0013\u0007_/w5X\u0007[3+6\u0013\u000eZ"w\u001bH\u0002j*<>X\b[b
                    =\\u0016\u007f)0=I""";
        f2696[12] = Boolean.TYPE;
        Renderer127.f2697[12] = "java/lang/Boolean";
        f2696[13] = "n\t9)\u0012<e\u0006(f~?k\u0004*)R";
        f2696[14] = "\u001fY\u001eHjj\u0003C\u001c\u0014p~\u0013@W\u048b";
        f2696[15] = " \u000eq\u0012\nf<\u0014sN\u0010r,\u00178_\u0017a*ReY\fg&\u0012q\u0012:| \u0010s]\u0016@*\bbU\u0016t";
        f2696[16] = Long.TYPE;
        Renderer127.f2697[16] = "java/lang/Long";
        f2696[17] = "bsI\u0014g}~iKH}inj\u0000Yzzh/]_a|doI\u0014FmyuGTr";
        f2696[18] = "\u001a\u0017gP*V\u0011\u0018v\u001fKX\u001a\u0013rE";
        f2696[19] = "cP)-U/cP>qY y\u001b>oY5~jn5\u000fs";
        f2696[20] = "-z~i!31`|5;'!c7$?/'fmi26+&l.}\u0003.mt\"=2\niw#?#0Jx46";
        f2696[21] = "p=j\u0017\u0000\fl'hK\u001a\u0018|$#\u0450";
        f2696[22] = "':yr!?; {.;++#0\u010c";
        f2696[23] = Float.TYPE;
        Renderer127.f2697[23] = "java/lang/Float";
        f2696[24] = ";6S^T\f',Q\u0002N\u00187/\u001a\u0515";
        f2696[25] = "''d&v\u0005,(ui\u0015\b9.";
        f2696[26] = "4+L(B\r(1NtX\u001982\u0005e\\\u0011>7_(Q\b2w^o\u001e+88GcT=7<Fc^\f\u00198Xc";
        f2696[27] = """
                    #6/Y\\u0005
                    \u000f3C^Y\u0010\u001b#@\u0015H\u0014\u0013%EO\u0005\u0019
                    )\u0005]N\u0019\u000e5Y^\u0005\u0010\u000f$\u0005s^\u001c?,NVN\u0016\u000edxUJ\b*/BU_C""";
        f2696[28] = "\fm\u001fLz)\u0010w\u001d\u0010`=\u0000tV\u0001g.\u00061\u000b\u0007|(\nq\u001fLF)\u000e}\u001d\u0010[9\u0017k\u0011\fo";
        f2696[29] = "\u0017)s$K\u000e\u001c&bk,\f\t-b \u0017";
        f2696[30] = "{\u0017<h\"Ig\r>48]w\u000eu%<Uq\u000b/h1L}K./~yx\u00006#>HV\u0004(#";
        f2696[31] = " ?[Z\"\u001e<%Y\u00068\n,&\u0012\u0017<\u0002*#HZ1\u001b&cN\u0011>\u000f*?\u0012=\u0002\u000e!)Y\u00065\u0019}\t";
        f2696[32] = "\u00064z:Q\u001f\u00064mf]\u0010\u001c\u007fmx]\u0005\u001b\u000e:!\u0004A";
        f2696[33] = "3\u0005\\\u000f.h/\u001f^S4|?\u001c\u0015B0t9\u0019O\u000f=m5YID2y9\u0005\u0015G3s(Yrg3s(%^O8x.\u0012I";
        f2696[34] = "\u00125N\u0003%\u000e\u000e/L_?\u001a\u001e,\u0007N;\u0012\u0018)]\u00036\u000b\u0014i[H9\u001f\u00185\u0007\u007f2\u0015\u0019\"[n8\u0015\t\"QY";
        f2696[35] = "F@$\u001a\u001aG[U|8[JCS";
        f2696[36] = "8S'&VZ.I%zLN4Jn\u0245";
        f2696[37] = "ZPuIy;FJw\u0015c/VI<\u0004g'PLfIj>\\\fa\u0002\u007f:\\LuIH!YM`4n:AK|\u0000";
        f2696[38] = "0 >f\fU,:<:\u0016A<9w\u01e9";
        f2696[39] = "q\u001bl$5\u0018m\u0001nx/\f}\u0002%\u014b";
        f2696[40] = "y\u0007\u0011H1ve\u001d\u0013\u0014+bu\u001eX\u0005/js\u001b\u0002H\"s\u007f[\u0003\u000fmkc\u0011X.6g^\u0014\u0018\u0002/fd7\u0017\u0015&";
        f2696[41] = "AVB58\u001d]L@i\"\tMO\u000bx&\u0001KJQ5+\u0018G\nW~$\fKV\u000bR\u0018\r@@@i/\u001a";
        f2696[42] = "sLP=:[oVRa O\u007fU\u0019p$GyPC=)^u\u0010Ev&JyL\u0019Z\u001aKrZRa)Lp[\u0005W";
        f2696[43] = "\u0004\u001cuV\u001c[\u0018\u0006w\n\u0006O\b\u0005<\u001b\u0001\\\u000e@g\f\u0007B\u0018@Q\u0017\u0002A\u0019;f\u0011\u0002]";
        f2696[44] = "}!&\rKva;$QQbq8o@Ujw=5\rXs{}'FXwg!$\rQvv}\u0013FJjh6 AUfZ&%fUf\u007f6/W";
        f2696[45] = "b\u0003O=2\rb\u0003Xa>\u0002xHX\u007f>\u0017\u007f9\u000f h";
        f2696[46] = "\u0007W\f\u000eh\\\u001bM\u000eRrH\u000bNE\u01d9";
        f2696[47] = "g$";
        f2696[48] = "@I7\u001cz\u0012KF&S\u0010\u0011_J-\u0018";
        f2696[49] = "\u001f`$Me2\u0001h>\u0002\u0003&\u0006i\u001fM;";
        f2696[50] = "OT\u001f_(\u0004SN\u001d\u00032\u0010CMV\u00126\u0018EH\f_;\u0001I\b\u001e\u0014;\u0005UT\u001d_2\u0004D\b4\u0018)\u0005hS\u001c46\u0014MC\u0016\u0005";
        f2696[51] = "IP\u0002Ta5WX\u0018\u001b)5MR\u0000\\ .\rr\u001b[<5NT\u0006";
        f2696[52] = "`\r KP``\r7\u0017\\ozF7\t\\z}7bV\u0005";
        f2696[53] = "o\u0004\f\u0019[\tq\f\u0016V<\b`\u0017\u001b\f\u001a\u000e";
        f2696[54] = "\u000fd93$L\u0011l#|FP\u0016q";
        f2696[55] = "B\u001d\u0001\u0007l7N\u0015\u0000L%;N\u001f\u0001FevB\u001d\u0000En;U\\ @x,R";
        f2696[56] = "D~";
        f2696[57] = """
                    2h=A(g.r?\u001d2s>qt\f6{8t.A;b44<
                    ;f(h?A2g94\u0012\u001a>W1\u007f7
                    4fy[6\u0006=|0\u007f4\u001b""";
        f2696[58] = "/7\u0005dA~3-\u00078[j#.L)_b%+\u0016dR{)k\u0004/R\u007f57\u0007d[~$k.#@\u007f\b0\u0006\u000f_n- \f>\u0017G)6\u0016\u0003Gn-";
        f2696[59] = "{<\\0vws{Lp\u001d wy}%t+wiy/q3z\u0005\u001css/%;F>vq\u001a";
        f2696[60] = "SR8J\u0016s\\Ud\u0016d|\n\\|\u001c\u001f\u0002\u0001\u0003fK\u0018eZGz\u001ed";
        f2696[61] = "ImlT\u0006yF|m\u001d:t^hd\u0001WFPqs\b:\"\u0004{nZ\u0004xI~0e";
        f2696[62] = ",h~v5bmu \u007fJ\u0237\u0010g\"v:'ad\"d&\u001bbncv5!jl}sJ!n,a<8avu&\r";
        f2696[63] = "46\u0012'1.5:Sf\u000e/`%8Z4}c9Wdn0fgh";
        f2696[64] = "\u0003~@\u001du\u001a\u0002r\u0001\\J\u001bWms\u0004+\u001b\\tW\u00066t\u0003*B\u001fu\t\n{V\u00103t";
        f2696[65] = "v\u0006\u001fw)^7\u001bA~V\u0299JB\u0017v+\u0018$C\u001b7j'z\u0011A7$Vu\u0016\u001dkV";
        f2696[66] = "w85(MEt8'4q[h\u007f\u00119\u001dHe\u0003te\u001fT:=.(\u001a\n\u0005";
        f2696[67] = "\u000b\u001c9b\u0003XU])a<]\u0005\u001e\u0012_\u0006\u000f\u0006\u0002|a\\B\u0003\\C";
        f2696[68] = "s\u007f8bpV|xd>\u0002{\u0004MV\u0012Oa\u001fX[Y2Mz.s(=J&r";
        f2696[69] = "\u0011k$*uWA\u007fb&D\u0006\u0006X8#.\u0003\u0010y^):\u001d@*4w{\rC\u0015n:6\u001e\u0002i:wz\u001e}";
        f2696[70] = "-\u0012Hc\u0002sl\u000f\u0016j}\u0272\u0011PBcGln\u001eP}\u0005";
        f2696[71] = "\u007f=NKope+\u0018\u0013Vrw'C\u0010:@ a\u0012Om\u0017 %\u001a\u000fge`=CHV";
        f2696[72] = "\n:\u0018F1F\u0003y\u001b\u0010Ws\u0003~IW\u001a@\u000beXS:$U9NHh\u001a\u000ftK\u0016W\u001eRj@\u0017iD\u001fo\u001e(m\u0019\u0001d\u001f\u00167T\u0004: \u0012jJ\u000f;\u001eH'OQ\u0004\u0010X%]\u0010xD\u0015i]o4PZ.[\u0013`\u001d\u0016.$\u0000f\\O6\u0014V=\u001ePW\u0018_i[U6MP?Q(k\u0014\u0002\u007f]I>\u001bTu \u0012)\u001d\u00175RR1DP\u0004";
        f2696[73] = "\u0018/<5JjY2b<5iI47#O^@?>#So_R<~\t(I e2Ov$hf U,\u001a2+%\u000b\u0013\u001eo5.\n-D\"0p5)Zk#\u007fGiB2dN";
        f2696[74] = "xv\f[V\u000bxs\u0011k\u0007S~}\u001c<P\f#&pRQ\u0002,k\f\u0007\u0006B#|";
        f2696[75] = "_Z\u0002lh\u001f\u000fND`YDTB\u0003q<BvC\u0005w4dWE\u0013oY\u0015\u000eJ\u00183gOCOF\fc\u0012]DG29_X\u001ax0iBHY\u0019ef\u0014B$H|+VLX\u001c1gV3";
        f2696[76] = "\u007f ^\u0003x\u0007}yW\nBWzl`[&Kq\u0010\u0002\u0002/MaqW\ryG\u001c";
        f2696[77] = "^vp5w\u0010E}v-L\u0122&z+l6\u001dGc\u007f)=";
        f2696[78] = "-|e> :&(ll_04kpQev#q3o?;&/\fkb%-.21/ s\u0011";
        f2696[79] = """
                    \u0012\u007f\u0003s\u007f~
                    =\u000b%\u000em\u0007x%tj\u007f\u0007^4W\u000e>Zi\u0000`okU?
                    \u001d""";
        f2696[80] = "\u0003'y1\u0019>Z6<g ;\u000b)H1N)\u001b1x\u0007@)\n2{\u0007\\)\u001a8\u0004lP2\u001f*x8\u001d~\u001fU>\"\u00198W'~:@\u007ff";
        f2696[81] = "@Dd\u007fS'\u000fM1<0y\\]Zh\fkRQ6eZfM!68MuAM;n@j1";
        f2696[82] = "oJ$nP\u000b&\u001atdIg9\u001b9JH\u000b*\u0016E/\u0014\t6I{uY\fhv";
        f2696[83] = "MhY9=`\u001d|\u001f5\f5FkX4G4@}@4`P\u001b+M93nAfHg\fj\u001cxCf20Q}\u001dY0`Lm^8eo\u001ag#i|\"Xi_=1nX\u0016";
        f2696[84] = "Q{AT'jX*U[a\u0017\"\u0007ew_R?\u001axdXKhy\u0002Sg(\u0015pSGhn";
        f2696[85] = "6Zd<Y\u00157V%}f\u0014bIP&\u0000\u0007UXx-\u000b\u0001bO\u001e$\u0014\u0006b\f`}\u0005C45";
        f2696[86] = "-\u0019E@6h)MOAX\u0568DB\u0016\u0005\"o%[B@)";
        f2696[87] = "QAHSBkKW\u001e\u000b{iY[E\b\u0017[\u000e\u001d\u0014WG\f\u000e\u001aK\u000fD2TWNQ{6\tIEPElDL\u001boA1ZG\u001aQ\u001b|_\u0019%U\u00055L\u0016W\u0015\u001dl\u000b'";
        f2696[88] = "v>\u0003Zz\u000fg7FRG\u01cf\u0016mG\r?Xd-_Txi";
        f2696[89] = "*;YZ7\u0004sm\u0012\u001e\fX\u007f]\tMp\r+d\tHm";
        f2696[90] = "\u0005]`VM\\\u0001\tjW#\u0402l\ffR\u0019\u001cS\b3YJ";
        f2696[91] = "i\u0010\u0012\n\\MuN\u001eX3\u0206\u0013\r\u0004\u0017_Xi\u0011Z\u001b\r";
        f2696[92] = "wk.y\u000b6xlr%y7G;*,\u0019xyag)G";
        f2696[93] = """
                    \b]l\u0015\u0001m\u0001\u001eoCgc\u0017
                    +!
                    d\u0011
                    2\u0014\u0003bmYi\u0015\u00070S\u0003$\u0010Y\u000fW^:\u001bX1
\u0013?Eg5P
4DYo\u001d\bj{]2\u0003\u0003kE\u0007\u007f\u0006]TGWb\u0016\u001e5\u0012X4\u001ccn\u0005^w\\u0011.\u001d\u00070m""";
        f2696[94] = "\u0011aRK(\bN8\u000fFoiH1\u0016dy\u0019TX]Rf\u0010W$\t\u001f*\u0010(";
        f2696[95] = "#\u0018^\u0014{hhCXLDvwXGB(D&\u0019\u001f\u001fD/*I\\X%z%\u001fV%";
        f2696[96] = "#\u001f\u00198>yl\u0016L{]2?\u0002C*6%R\u0016\u001b>>8>\u001bM3!H>FZ -$3\u0010W?]$n\u0007D31)8\n[C";
        f2696[97] = "%s$5\u001b5;n/mr51u\u00038\u00135<uCoO4<6}5\u00021b\t";
        f2696[98] = "~W\u0018O,\u000e!\u000eEBko!\u0003WZ\u0010\u0003{\u0013DV|\u000e-\u001e[&";
        f2696[99] = "(A\"k\u001b+)Mc*$>|R\t\u0016\u001ex\u007fNg(D5z\u0010X,Z|i\u001f*lB%..";
        f2696[100] = "6f\u001f\u0018\u0005\u000ew6\u0010\u0013l\u0229\na@\u000f\u0017\rk4OY\u001dp";
        f2696[101] = "A8u\u001474H{vBQ<Ii,\u001cQ3BkqC6)T=)z4$Ykt\u0004m5\u001c=M@/o\\7?\u000076\u001b\u0006";
        f2696[102] = ").\u0006BV&k!Q\u0001,x/\u0006[\u0007Mk5:Y|\u001ci&%I\u0000H$j%6";
        f2696[103] = "|8WWE\u001ff.\u0001\u000f|\u001dt\"Z\f\u0010/#d\u000bSMx# \u0003\u0013M\nc8ZT|";
        f2696[104] = "\u0004&eOiY\u0005*$\u000eVXP5N2l\nS) \f6GVw\u001f";
        f2696[105] = "\u007fSE3R1!\t_cIM)\u0007[_\u000b}+\u0011Z>^r}\u001b'3\u000b0%\u001aK>]=:j";
        f2696[106] = "<;qnz\u0013=70/E\u0012h(Px,\u0019hT1.+\u001d:jkc.C\u0005";
        f2696[107] = "S+wwj\u001eOu{%\u0005\u013e)%ib?\u001f\u0016!<il";
        f2696[108] = "\rd+'L,F?-\u007fs2Y$2q\u001f\u0000\bdc.s=U:6,\rlW2h\u0016";
        f2696[109] = "2\r>%\u000e\u0019>]?5aN4\u001b\u00003\u0005\\4g2f\u001cB)\u000b?0\u0011]Y";
        f2696[110] = "\"\u001eP|$\u0015\"\u001bML~A5\u0011K L\u0016sO\u001cw\u001b\u0015u\b\u001ds`^.\u000eEL";
        f2696[111] = "9C[\u001f:/x^\u0005\u0016E\u0494\u0005\u0007S\u001e8ik\u0006__yV?@\u0005\u001ct$\u007fX\\[E";
        f2696[112] = "<\r,\u001e ws\u0004y]C>0\u0014S\u000b\n,6\u0005t\u0019C*q\u0015q\u0015/''\u0018ne/z0\u000bb\t\",=\u0014\u0012\t\u007f;.\u0018~\u0004)61h";
        f2696[113] = "0dZ|TL9'Y*2B/3\u001dVSH8ZX/\\Njd\u0002bY\u0010U`_|R\u0011k:\u0012y\f.og\fr\r\u00105*\t,2\u0014h4\u0002-\fN%1\\\u0012]L)=\u0003\"\u000b\u0017k\"b.\u0002C.'\u0003{\r\u0015$ZXl\u000bVd(\u0018tR\u0011U";
        f2696[114] = "\u001fj7p'+\u0010mk,U+/:3%5e\u0011`~ k";
        f2696[115] = "#:u\u001ecyb'+\u0017\u001cI\u001f}/\u000b|?!'b\u000e\"\u0000%z|\u0005#>\u007f7y[\u001cca=/Zv= -,e";
        f2696[116] = "(\u0005?\u000frr9\fz\u0007O\u0417H\u0002g\u000f#h5\u00145\u0011~\u0014";
        f2696[117] = "%\f,\u0018cc{V6Hx\u001f}I#\u000eoc{ONM? u\t/\u0012f}xNN";
        f2696[118] = """
                     &\u001a\u00077S\u0013(G\u00066c\u001cpL\u00130
                     \u0010IB\u0013 \u000ev'[\u0005$\u001c
                     s\u0016I$c""";
        f2696[119] = "\tC\f\u0012dG\t\u0003P\u000fX\u0010\u001eAs\u0011>\u0003)P[\u001a5\u0005\u001eG=\u0013*\u0002\u001e\u0004CJ;GH=";
        f2696[120] = "\u0014A-/!\u001a\rRvhBI\t\\On<\u001d\u0017\u0001=.$DP0";
        f2696[121] = "{v+Q8;:kuXG\u0550G2#P:})3/\u0011{B}6\"Jx|'{'\u0014Gxze,\u0015y\"7`r*w25r3V#\u007fyrL";
        f2696[122] = "\u0015A7p8=\u001dC)uGn\fQ s;\u0007\u000b\u00060h7k\u0006P=wG=\u0019\u00035:5}\u0001Zr\u000b";
        f2696[123] = "\\MhX\u0015gP\t3\u001d.cM\u000e\f\u000bH`M\b;\u001c.i\u001eJ8\u0000L`]Inf";
        f2696[124] = "uZ~<4n+\u001bn?\u000bk{XT\u000119xD;?kt}\u001a\u0004";
        f2696[125] = "\n\u00000DMA\u0001T9\u00162Y\u0000\u0016Y\u0011\u000f^\nRgKB[Tmc\u0016\\PUS9[Y\u000ej";
        f2696[126] = "4pw\u0006Fg?$~T9s5{\u001eU\t{/`\u007f\u0000\u0006-%\u001d\"YTm)|wV\u0002gT!.\u0004Bk5t!RH\u0016";
        f2696[127] = "/r\u0004E,^.~E\u0004\u0013_{a%DzJjM~\u0002.^v\"@Xc[(\u001d";
        f2696[128] = "2e\f\u0016N\u0018=bPJ<\u000excTKU\r\u00023\u0005@G\u0014cf\n\u0016Mi";
        f2696[129] = "\u0015K7rLG\u0004Brzq\u026au\u0018s%\t\u0010\u0007Xk|N!";
        f2696[130] = "\u0017\u0003|\r\u00058IYf]\u001eDU[l\f`x\u001eWe\u001c\u0001-\u0011\u0001oa";
        f2696[131] = "0~j\u0012[(0+*\u0014f}:k\u000f!,\u0012k'8\u0015\u001bs>(n\u001ff";
        f2696[132] = "\u001dQw`G1\u0019\u0005}a)\u04a8t\u0000qd\u0013qK\u0004$o@";
        f2696[133] = "\t\u0006_\u000ev\u001fF\u000f\nM\u0015E\u001c\u000e\b\u000f\u0015\u0014\u0006Z\u0019DgT\u001e\u0003^u";
        f2696[134] = "_\f_IcS[XUH\r\u01cd6]YM7\u0013\tY\fFd";
        f2696[135] = "4<\bmQ\f29@d\u0015~wkF9\u0016\u0005`\u0006\u0001m\u000e\u0012hz_7\u0014Bs\u0006\u0001m\u000e\u0012hz_7\u0014Bs\u0006";
        f2696[136] = "\u001f42\\\u0005G^)lUz\u0497#p:]\u0007\u0001Mq6\u001cF>\u0019t;GE\u0000C9>\u0019z\u0004\u001e'5\u0018D^S\"k'F\u000eN2(F\u0013\u0001\u00188U\u0017\nLZ6)CG\u0000ZI";
        f2696[137] = "h\u000f`[\u0016Li\u0003!\u001a)C* }XDX<\f\u001a\u001c\u0014L1_$FYIo` \u001bGBn^zVB\u001cQPjTP]-\u0004'\u0018P\"";
        f2696[138] = "08Dz\u0013F0m\u0004|.\u0010>+\u0018kT|08Dz\u0013F0m\u0004|.";
        f2696[139] = "J.Jnz2\u000b3\u0014g\u0005\u0221vjBoxt\u0018kN.9KF9\u0014.w:I>Hr\u0005qK=M*;+\u00068\u0013\u0015?5O+\u001cg\u007f-\u0016l-";
        f2696[140] = "\u0010\u001f_\u001b\u001bFPL\u001f\u0006`@\u0017OH\u001c\u0018U\u0017KH\f\u0011<Q\u0016C\u001c\u001d]\u0004\u0019\u0015\u0016`\u0000]KU\u001a\u0001UR\u001d_g\\\f\u0000]S\u0006\t\u0003VW.";
        f2696[141] = "xW\u0006\u0005m\u000by[GDR\n,D'\u001e;\u001d\u0019_\u001d\u001e.eqREC \u0014~U\u0019\u001fR";
        f2696[142] = "LJE!C]MF\u0004`|\\\u0018Yd \u0015I\tt?fA]\u0015\u001a\u0001<\fXK%";
        f2696[143] = "6|h,\\Pxnvn:\u03ca\thiqZFfvtz\u0002";
        f2696[144] = "v~qm\u000b\u000ewr0,4\u001b\"m[\u0010\u000e]!q4.T\u0010$/\u000b*JY7 yjR\u0000p\u0011";
        f2696[145] = "N\u0005g2\u0014\"\u001e\u0011!>%sY6y?@\u007fD\u0007]5[\u007fX\u0016qRFlXF\"8\u0018-HE\u001dh\u0018|BD#2Uy\u001c{'oKr\u001dE}\"N,\"Km \\m^\u001f l\\\u0012";
        f2696[146] = "\u000f$IN<ZM+\u001e\rF\u0004\t\u0016\u001e\u000e+\u001f\u001f:>\u000e+\u001f30\u0015\u0011-\f\u000e1\u0003p|X\u001c6FN&\u0015\u0019hyJ{\u000b\u0012iG\u00106\u000eLVI\u00004\u001c\r*\u001dMx\u001cr";
        f2696[147] = "=e.e6||xplIl\u0001%8#\"j0s*yy\u0005<itu&4j{..I";
        f2696[148] = "\u0017MD\u0011|tY_ZS\u001adE\\d@soE PIflI\u0010\u0006\u0012$s(";
        f2696[149] = "Ta,k\t\u0011Td1[XIRj<\f\u000f\u0017\u00023P%NW\\4+f\n\u0010\\";
        f2696[150] = "UV-aT6D_hii\u04e35_~5\u0007mSNwp\u000f";
        f2696[151] = "\u0007\"\u0013NnG\b3\u0012\u0007RX\u001e>\f\u0012\u0015Hw`L\u00112\u0019I:\u0001\u0014l&\u0007\"\u0013NnG\b3\u0012\u0007R";
        f2696[152] = "\"Nx]r1qZyB\u00144#T~Bx\u0006w\u0015/\u0015+Q.I|A./uKt\u001f\u0014m~EeXu8q\u0013o%$!<QaYplpQ\u001e";
        f2696[153] = "ff\u0015\"o\u0004x{\u001ez\u0006\u0004r`-#j\u0017\u007f\u001cH\u007fh\u000b \"\u00122mU\u001f";
        f2696[154] = "d'\u00060>bu.C8\u0003\u050e\u0004r\f3xye'\u0003er\u0004>0\u0005&2v~(\\a\u0003";
        f2696[155] = "$n8\u000785e>7\fQ\u052b\u0018ig\u0010*6y<hF K";
        f2696[156] = "Gp~p0/Dpll\f1X7Emm1U7\u0005:10Ut;`|5\u000bK";
        f2696[157] = "R\"qC\u0007d[seLA\u0019\fce]^p\u000f\u00195\fUb\u0016x`\u0003\u0003hk";
        f2696[158] = "q(\u0011Ne\u0011ij\u0019\u0018\u0014\u0002d/ Dl\r`SU\u0010y\u0016t2\u0000\u001f/\u001c\t";
        f2696[159] = "]f9Me)\u0013t'\u000f\u0003,\u000fm.\u001ayV\u0005;~Ln$\\w8\u0012\u0003l_e\"H=6\u0012`|w9k\fk}Ic&\t5BM}o\u001a:0\re6]\u000b";
        f2696[160] = "OvFI^BF5E\u001f8wF2\u0017XbMA4\u0017AWDGHD\u001aV@\u0015v\u001eWS\u001e*rCIX\u001f\u0014(\u000eL\u0006 \u0010u\u0010G\u0007\u001eJ8\u0015\u00198\u001a\u0017&\u001e\u0018\u0006@Z#@'\bPX1\u0001[\\\u001d\u00141~\u0017HRS7\u0002C\u0005\u001eSH\u0011EDGKxG\u001e\u0006X*tNJC]K!A\u001cI \u0016x\u0013\\EACwEV8\u001aTq\u0006\u0016JZL(A'";
        f2696[161] = "'TUBmj'\u0014\t_Q=0V)B<70L\u0018]QkdH\bC-5>RXXQ";
        f2696[162] = "d\u001eBIB\n%\u0003\u001c@=\u0012#.A_X\u001e>\u001feUC\u001e\"\u000eI2\u0004\u001c\"\u001e\u001a\\\u0005\u0010c_%\b\u0000\u001d8\\\u001bRM\u0018fc\u001f\u000fS\u0013g]EBVMXSU@D\f$\u0007\u0018\fDs";
        f2696[163] = "^G\\@QL\u0015\u001cZ\u0018nR\n\u0007E\u0016\u0002`[G\u0015On\u000bW\u0016^\f\u000f^X@Tq";
        f2696[164] = "|G\u001dR,\n5\u0017MX5f*\u0016\u0000i8\u0007*\u001b\u0000)o[+\u001bC\u00175\u0016.E|";
        f2696[165] = "6\u001c\f-'Yw\u0001R$X\u0425\n\u0002\u0015,e\u001f`\\T<f";
        f2696[166] = "L\u000f\nh\u0015e\r\u0012Taj\u04bdpB\u001da\u0013c\f\u0016P-\u0013";
        f2696[167] = "ZZp3\u0005<YZb/9\"E\u001dN.\\'E\u001bpC\u0000tJ\rn?^.P]uC";
        f2696[168] = "R}8<\u001aZSqy}%O\u0006n\u0019'LL3u#'Y4[x{zWET\u007f'&%\u000e\u0015+:pWN\rr}A";
        f2696[169] = "\u0016]g-g|O\u0011!s\nv\u0016\u00166\u0016oh\u001cQbqu~J\t[";
        f2696[170] = "y\u0013ziCq9@:t8jbVfo@l`Cwxsl`Mq\u0015\u0004;iQvtQ4?[\u000b)\bf\u007fWj|\u00070u*1(Vk;\u0014keS5\u0004\u0016;xCveC4.I\u000b";
        f2696[171] = "0x]i2:9)IftGd:X\u007fi<\t/\u0019kn7e\"OfqG93Wor;m~\u001bo\r";
        f2696[172] = "\u0016\u00112Ur\b\u0012E8T\u001c\u02ab\u007fQ PrB\u0003IbX$";
        f2696[173] = "\\.\rq(;Fy\u001c.M\u02af#+Tm$+Iy\u001f+u*";
        f2696[174] = "1'$8X-9`4x3z=b\u0005-Zq=r\u001e+Rz0b^|\u000e{0!`&C~n\u001e";
        f2696[175] = "\u0000qw\u0019\u0017h\u0001}6X(gBRw\rGiXxbd\u0018vKgr\u0018L;\u0007g\r";
        f2696[176] = "n!Gv!pjuMwO\u052f\u0007pAru08t\u0014y&";
        f2696[177] = "\u001a\u0017`(\u001f$\tTk$}\u0226t@o*\u0011?\tV=4LC\u001bLq#\u001csM\u00173<},\u0016Rj%MzM\u0010uD\u0012!\bIltDzJV\r+\u001f?\u0013O=}D}\f.7:D;E\\w\"\u001d|t";
        f2696[178] = "\u0015\u0017ZJ=r\rUR\u001cLa\u0000\u0010|M(s\u0000lEMsrPVE\u00183tm";
        f2696[179] = "YZaM>GE\u0004m\u001fQ\u0407#T\u007fXkF\u001cP*S8";
        f2696[180] = "!u=^$\b($)QbuR\t\u0019}\\0O\n\boGu!u=^$\b($)Qb";
        f2696[181] = "J\u0012-\u001fd PE<@\u0001\u044c5\u0017t\u0003h0_E?E91";
        f2696[182] = "aZ]g%\fxI\u0006 FSaaB}\"^{MP\u001cvBhR@`\"\u000f$R?";
        f2696[183] = "\u000e\u0000WZ5N\u0015\u000bQB\u000e\u0306v\u0006YB4\u0004I\u0002\fIg";
        f2696[184] = "l^G0M)-C\u001992\u018fPREuI3a\u001dL \n";
    }
    
    public static Class m1281(long n, long n2) {
        int m1279 = m1279(n, n2);
        Object o = Renderer127.f2696[m1279];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(Renderer127.f2697[m1279]);
                Renderer127.f2696[m1279] = forName;
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
    
    public static Field m1282(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m1283(Class clazz, String s, Class clazz2) {
        Field m1282 = m1282(clazz, s, clazz2);
        if (m1282 != null) {
            return m1282;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m1283 = m1283(interfaces[i], s, clazz2);
                if (m1283 != null) {
                    return m1283;
                }
            }
        }
        return null;
    }
    
    public static Field m1284(long n, long n2) {
        int m1279 = m1279(n, n2);
        Object o = Renderer127.f2696[m1279];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        String s = Renderer127.f2697[m1279];
        int index = s.indexOf(8);
        Class m1280 = m1281(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        String substring = s.substring(index, index2);
        ++index2;
        Class m1281 = m1281(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m1280;
        while (true) {
            Field m1282 = m1282(clazz, substring, m1281);
            if (m1282 != null) {
                return (Field)(Renderer127.f2696[m1279] = m1282);
            }
            Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    Field m1283 = m1283(interfaces[i], substring, m1281);
                    if (m1283 != null) {
                        return (Field)(Renderer127.f2696[m1279] = m1283);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m1280.getName()).append(' ').append(m1281.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m1281(1333960354962929L, 0L);
        }
    }
    
    public static Method m1285(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m1286(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m1285 = m1285(clazz, s, clazz2, n, array);
        if (m1285 != null) {
            return m1285;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m1286 = m1286(interfaces[i], s, clazz2, n, array);
                if (m1286 != null) {
                    return m1286;
                }
            }
        }
        return null;
    }
    
    public static Method m1287(long n, long n2) {
        int m1279 = m1279(n, n2);
        Object o = Renderer127.f2696[m1279];
        if (o instanceof String) {
            String s = Renderer127.f2697[m1279];
            int index = s.indexOf(8);
            Class m1280 = m1281(Long.parseLong(s.substring(0, index), 36), 0L);
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
            Class m1281 = null;
            int n5 = index2 + 1;
            for (int i = 0; i < n3; ++i) {
                int index4 = s.indexOf(8, n5);
                m1281 = m1281(Long.parseLong(s.substring(n5, index4), 36), 0L);
                if (i < n4) {
                    array[i] = m1281;
                }
                n5 = index4 + 1;
            }
            Class superclass = m1280;
            while (true) {
                do {
                    Method m1282 = m1285(superclass, substring, m1281, n4, array);
                    if (m1282 != null) {
                        return (Method)(Renderer127.f2696[m1279] = m1282);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m1280;
                    while (true) {
                        Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                Method m1283 = m1286(interfaces[j], substring, m1281, n4, array);
                                if (m1283 != null) {
                                    return (Method)(Renderer127.f2696[m1279] = m1283);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            StringBuffer sb = new StringBuffer();
                            sb.append("NoSuchMethodException in ").append(m1280.getName()).append(' ').append(m1281.getName()).append(' ').append(substring).append('(');
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
                        clazz = m1281(1333960354962929L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m1281(1333960354962929L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    public static MethodHandle m1288(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType methodType, long n, long n2) {
        char char1 = s.charAt(0);
        Field m1284 = null;
        Method m1285 = null;
        try {
            MethodHandle target;
            if (char1 == '\u00c3' || char1 == '\u00f9' || char1 == 'w' || char1 == '\u00e4') {
                m1284 = m1284(n, n2);
                Class<?> declaringClass = m1284.getDeclaringClass();
                String name = m1284.getName();
                Class<?> type = m1284.getType();
                if (char1 == '\u00c3') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == '\u00f9') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == 'w') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m1285 = m1287(n, n2);
                Class<?> declaringClass2 = m1285.getDeclaringClass();
                String name2 = m1285.getName();
                MethodType methodType2 = MethodType.methodType(m1285.getReturnType(), m1285.getParameterTypes());
                if (char1 == '\u00f4') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == '\u00df') {
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
            sb.append(ex.getClass().getName()).append(" : ").append((m1284 != null) ? m1284.toString() : ((m1285 != null) ? m1285.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static Object m1289(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType newType, Object[] array) {
        int n = array.length - 2;
        MethodHandle m1288 = m1288(lookup, mutableCallSite, s, newType, (long)array[n], (long)array[++n]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m1288, newType));
        try {
           return m1288.asSpreader(Object[].class, array.length).invoke(array);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    
    public static CallSite m265(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Renderer127.m265:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
                    handle = ((CallSite)Renderer127.m265(lookup, "\u00f4", MethodType.methodType(boolean.class, Object.class, Object.class, double.class, double.class, long.class, long.class))).dynamicInvoker();
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
        
        public static boolean invoke(Object p0, Object p1, double p2, double p3, long p4, long p5) {
            try {
                return (boolean) ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0, p1, p2, p3, p4, p5);
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
                    handle = ((CallSite)Renderer127.m265(lookup, "\u00f4", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_2.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Renderer127.m265(lookup, "\u00f4", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_4
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_4.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_4.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_4.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_4.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_4.LOOKUP;
                try {
                    handle = ((CallSite)Renderer127.m265(lookup, "\u00f4", MethodType.methodType(void.class, Object.class, Object.class, double.class, double.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_4.fence = 1;
                ProcyonInvokeDynamicHelper_4.handle = handle;
                ProcyonInvokeDynamicHelper_4.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, double p2, double p3, long p4, long p5) {
            try {
                ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1, p2, p3, p4, p5);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_5
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_5.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_5.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_5.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_5.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_5.LOOKUP;
                try {
                    handle = ((CallSite)Renderer127.m265(lookup, "\u00f4", MethodType.methodType(void.class, Object.class, Object.class, double.class, double.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_5.fence = 1;
                ProcyonInvokeDynamicHelper_5.handle = handle;
                ProcyonInvokeDynamicHelper_5.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, double p2, double p3, long p4, long p5) {
            try {
                ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1, p2, p3, p4, p5);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_6
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_6.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_6.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_6.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_6.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_6.LOOKUP;
                try {
                    handle = ((CallSite)Renderer127.m265(lookup, "\u00f4", MethodType.methodType(void.class, Object.class, Object.class, double.class, double.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_6.fence = 1;
                ProcyonInvokeDynamicHelper_6.handle = handle;
                ProcyonInvokeDynamicHelper_6.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, double p2, double p3, long p4, long p5) {
            try {
                ProcyonInvokeDynamicHelper_6.handle().invokeExact(p0, p1, p2, p3, p4, p5);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }

   public static int dcmpl(double var0, double var2) {
      return Double.compare(var0, var2);
   }

   public static int dcmpg(double var0, double var2) {
      return Double.compare(var0, var2);
   }
}
