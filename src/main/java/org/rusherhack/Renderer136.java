// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.core.logging.ILog;
import org.rusherhack.client.api.ui.panel.PanelItemBase;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.lang.invoke.MethodHandles;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.client.api.feature.command.arg.SettingValue;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.core.utils.ColorUtils;
import java.awt.Color;
import org.rusherhack.core.utils.MathUtils;
import org.rusherhack.client.api.render.RenderContext;
import java.util.Map;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.setting.NumberSetting;

public class Renderer136 extends Class517<NumberSetting<?>>
{
    public double f2873;
    public String f2874;
    public boolean f2875;
    public boolean f2876;
    public Animation f2877;
    public static long f2878;
    public static String f2879;
    public static long[] f2880;
    public static Integer[] f2881;
    public static Map f2882;
    public static long f2883;
    public static Object[] f2884;
    public static String[] f2885;
    
    public boolean keyTyped(int p0, int p1, int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          81331321221619
        //     6: lxor           
        //     7: lstore          4
        //     9: invokestatic    org/rusherhack/Class253.m9154:()I
        //    12: istore          6
        //    14: aload_0        
        //    15: iload_1        
        //    16: istore_0       
        //    17: astore_1       
        //    18: aload_1        
        //    19: getfield        org/rusherhack/Renderer136.f2875:Z
        //    22: iload           6
        //    24: ifne            183
        //    27: ifeq            176
        //    30: goto            37
        //    33: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    36: athrow         
        //    37: iload_0        
        //    38: iload           6
        //    40: ifne            175
        //    43: goto            50
        //    46: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    49: athrow         
        //    50: tableswitch {
        //              512: 84
        //              513: 84
        //              514: 171
        //              515: 113
        //          default: 171
        //        }
        //    80: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    83: athrow         
        //    84: aload_1        
        //    85: iconst_0       
        //    86: putfield        org/rusherhack/Renderer136.f2875:Z
        //    89: aload_1        
        //    90: invokevirtual   org/rusherhack/Renderer136.m6250:()V
        //    93: goto            108
        //    96: pop            
        //    97: aload_1        
        //    98: getfield        org/rusherhack/Renderer136.f2877:Lorg/rusherhack/core/animation/Animation;
        //   101: invokevirtual   org/rusherhack/core/animation/Animation.restart:()Lorg/rusherhack/core/animation/Animation;
        //   104: invokevirtual   org/rusherhack/core/animation/Animation.play:()Lorg/rusherhack/core/animation/Animation;
        //   107: pop            
        //   108: iconst_1       
        //   109: dup            
        //   110: dup            
        //   111: pop2           
        //   112: ireturn        
        //   113: aload_1        
        //   114: getfield        org/rusherhack/Renderer136.f2874:Ljava/lang/String;
        //   117: invokevirtual   java/lang/String.length:()I
        //   120: iload           6
        //   122: ifne            170
        //   125: ifle            166
        //   128: goto            135
        //   131: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   134: athrow         
        //   135: aload_1        
        //   136: getfield        org/rusherhack/Renderer136.f2874:Ljava/lang/String;
        //   139: iconst_0       
        //   140: aload_1        
        //   141: dup_x2         
        //   142: getfield        org/rusherhack/Renderer136.f2874:Ljava/lang/String;
        //   145: invokevirtual   java/lang/String.length:()I
        //   148: iconst_1       
        //   149: dup            
        //   150: dup            
        //   151: pop2           
        //   152: isub           
        //   153: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   156: putfield        org/rusherhack/Renderer136.f2874:Ljava/lang/String;
        //   159: goto            166
        //   162: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   165: athrow         
        //   166: iconst_1       
        //   167: dup            
        //   168: dup            
        //   169: pop2           
        //   170: ireturn        
        //   171: iconst_1       
        //   172: dup            
        //   173: dup            
        //   174: pop2           
        //   175: ireturn        
        //   176: aload_1        
        //   177: iload_0        
        //   178: iload_2        
        //   179: iload_3        
        //   180: invokespecial   org/rusherhack/Class517.keyTyped:(III)Z
        //   183: ireturn        
        //    StackMapTable: 00 12 FF 00 21 00 06 01 07 00 02 01 01 04 01 00 01 07 00 21 03 48 07 00 21 43 01 5D 07 00 21 03 4B 07 00 21 0B 04 51 07 00 21 03 5A 07 00 21 03 43 01 00 43 01 00 46 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  37     80     80     84     Ljava/lang/NumberFormatException;
        //  27     43     46     50     Ljava/lang/NumberFormatException;
        //  18     30     33     37     Ljava/lang/NumberFormatException;
        //  89     93     96     108    Ljava/lang/NumberFormatException;
        //  113    128    131    135    Ljava/lang/NumberFormatException;
        //  125    159    162    166    Ljava/lang/NumberFormatException;
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
    
    public void render(RenderContext renderContext, double n, double n2) {
        long n3 = Renderer136.f2878 ^ 0x79090AB01A8AL;
        IRenderer2D renderer = ((PanelItemBase)this).getPanel().getRenderer();
        ((PanelItemBase)this).getPanel().getFontRenderer();
        int m9517 = ((Renderer271)this).m9517(n, n2);
        ((Class380)this).f6219 = m9517;
        int n4 = m9517;
        Number minimum = ((NumberSetting)super.f8251).getMinimum();
        int m9518 = Class253.m9155();
        Number maximum = ((NumberSetting)super.f8251).getMaximum();
        int n5 = m9518;
        Object value = null;
        Label_0219: {
            Label_0175: {
                try {
                    value = this;
                    if (n5 == 0) {
                        break Label_0219;
                    }
                    if (!this.f2876) {
                        break Label_0175;
                    }
                }
                catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
                double clamp = MathUtils.clamp(MathUtils.round(minimum.doubleValue() + (maximum.doubleValue() - minimum.doubleValue()) * ((n - ((Renderer107)this).m5381()) / /* invokedynamic(!) */ProcyonInvokeDynamicHelper_1.invoke(this, 4248604529975192541L, n3)), 2), minimum.doubleValue(), maximum.doubleValue());
                NumberSetting numberSetting = (NumberSetting)super.f8251;
                double n6 = clamp;
                boolean b = true;
                numberSetting.setValue(n6, b, b);
            }
            IRenderer2D renderer2D = renderer;
            double n7 = 0.0;
            renderer2D.drawRectangle(n7, n7, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_2.invoke(this, 4248604529975192541L, n3), ((Renderer107)this).getHeight(false), Renderer107.f2394.getRGB());
            value = ((Setting)super.f8251).getValue();
        }
        double n8 = (((Number)value).doubleValue() - minimum.doubleValue()) / (maximum.doubleValue() - minimum.doubleValue());
        IRenderer2D renderer2D2 = renderer;
        Renderer136 obf136 = this;
        this.f2873 = (float)MathUtils.interpolate(n8, this.f2873, 0.2);
        double clamp2 = MathUtils.clamp(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_3.invoke(this, 4248604529975192541L, n3) * this.f2873, 0.0, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_4.invoke(this, 4248604529975192541L, n3));
        Label_0406: {
            Label_0404: {
                try {
                    double n9 = 0.0;
                    renderer2D2.drawRectangle(n9, n9, MathUtils.round(clamp2, 0.1), ((Renderer107)this).getHeight(false), n4);
                    if (n5 == 0) {
                        break Label_0406;
                    }
                    if (!this.f2877.isPlaying()) {
                        break Label_0404;
                    }
                }
                catch (NumberFormatException ex2) {
                    throw m6252(ex2);
                }
                IRenderer2D renderer2D3 = renderer;
                double value2 = this.f2877.get();
                double n10 = 0.0;
                renderer2D3.drawRectangle(n10, n10, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_5.invoke(this, 4248604529975192541L, n3), ((Renderer107)this).getHeight(false), ColorUtils.transparency(Color.RED, (int)Math.max(255.0 * value2, 100.0)).getRGB());
            }
            obf136 = this;
        }
        obf136.render(renderContext, n, n2);
    }
    
    public String m4900() {
        long n = Renderer136.f2878 ^ 0x3B149FE3DCC9L;
        int m9155 = Class253.m9155();
        Label_0030: {
            try {
                Renderer136 obf136 = this;
                if (m9155 == 0) {
                    return ((Setting)obf136.f8251).getDisplayName();
                }
                boolean b = this.f2875;
                if (b) {
                    break Label_0030;
                }
                break Label_0030;
            }
            catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
            try {
                boolean b = this.f2875;
                if (b) {
                    return this.f2874;
                }
            }
            catch (NumberFormatException ex2) {
                throw m6252(ex2);
            }
        }
        Renderer136 obf136 = this;
        return ((Setting)obf136.f8251).getDisplayName();
    }
    
    public void mouseReleased(double p0, double p1, int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          111209587610644
        //     6: lxor           
        //     7: lstore          6
        //     9: invokestatic    org/rusherhack/Class253.m9154:()I
        //    12: istore          8
        //    14: aload_0        
        //    15: iload           5
        //    17: istore_0       
        //    18: astore          5
        //    20: iload           8
        //    22: ifne            84
        //    25: iload_0        
        //    26: ifne            76
        //    29: goto            36
        //    32: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    35: athrow         
        //    36: aload           5
        //    38: iload           8
        //    40: ifne            78
        //    43: goto            50
        //    46: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    49: athrow         
        //    50: getfield        org/rusherhack/Renderer136.f2876:Z
        //    53: ifeq            76
        //    56: goto            63
        //    59: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    62: athrow         
        //    63: aload           5
        //    65: iconst_0       
        //    66: putfield        org/rusherhack/Renderer136.f2876:Z
        //    69: goto            76
        //    72: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    75: athrow         
        //    76: aload           5
        //    78: dload_1        
        //    79: dload_3        
        //    80: iload_0        
        //    81: invokespecial   org/rusherhack/Class517.mouseReleased:(DDI)V
        //    84: return         
        //    StackMapTable: 00 0A FF 00 20 00 06 01 03 03 07 00 02 04 01 00 01 07 00 21 03 49 07 00 21 43 07 00 02 48 07 00 21 03 48 07 00 21 03 41 07 00 02 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  20     29     32     36     Ljava/lang/NumberFormatException;
        //  25     43     46     50     Ljava/lang/NumberFormatException;
        //  36     56     59     63     Ljava/lang/NumberFormatException;
        //  50     69     72     76     Ljava/lang/NumberFormatException;
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
    
    public boolean mouseClicked(double p0, double p1, int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          69583582840550
        //     6: lxor           
        //     7: lstore          6
        //     9: invokestatic    org/rusherhack/Class253.m9154:()I
        //    12: istore          8
        //    14: aload_0        
        //    15: iload           5
        //    17: istore_0       
        //    18: astore          5
        //    20: aload           5
        //    22: dload_1        
        //    23: dload_3        
        //    24: invokevirtual   org/rusherhack/Renderer107.m5378:(DD)Z
        //    27: iload           8
        //    29: ifne            188
        //    32: ifeq            183
        //    35: goto            42
        //    38: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    41: athrow         
        //    42: iload_0        
        //    43: iload           8
        //    45: ifne            146
        //    48: goto            55
        //    51: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    54: athrow         
        //    55: lookupswitch {
        //                0: 84
        //                2: 107
        //          default: 141
        //        }
        //    80: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    83: athrow         
        //    84: aload           5
        //    86: iconst_0       
        //    87: ifne            86
        //    90: iconst_1       
        //    91: dup            
        //    92: dup            
        //    93: pop2           
        //    94: iload           8
        //    96: ifne            87
        //    99: putfield        org/rusherhack/Renderer136.f2876:Z
        //   102: iconst_1       
        //   103: dup            
        //   104: dup            
        //   105: pop2           
        //   106: ireturn        
        //   107: aload           5
        //   109: dup            
        //   110: dup_x1         
        //   111: iconst_1       
        //   112: dup            
        //   113: dup            
        //   114: pop2           
        //   115: putfield        org/rusherhack/Renderer136.f2875:Z
        //   118: getfield        org/rusherhack/Class517.f8251:Lorg/rusherhack/core/setting/Setting;
        //   121: checkcast       Lorg/rusherhack/core/setting/NumberSetting;
        //   124: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   127: checkcast       Ljava/lang/Number;
        //   130: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   133: putfield        org/rusherhack/Renderer136.f2874:Ljava/lang/String;
        //   136: iconst_1       
        //   137: dup            
        //   138: dup            
        //   139: pop2           
        //   140: ireturn        
        //   141: aload           5
        //   143: getfield        org/rusherhack/Renderer136.f2875:Z
        //   146: iload           8
        //   148: ifne            182
        //   151: ifeq            178
        //   154: goto            161
        //   157: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   160: athrow         
        //   161: aload           5
        //   163: dup            
        //   164: iconst_0       
        //   165: putfield        org/rusherhack/Renderer136.f2875:Z
        //   168: invokevirtual   org/rusherhack/Renderer136.m6250:()V
        //   171: goto            178
        //   174: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   177: athrow         
        //   178: iconst_1       
        //   179: dup            
        //   180: dup            
        //   181: pop2           
        //   182: ireturn        
        //   183: aload           5
        //   185: getfield        org/rusherhack/Renderer136.f2875:Z
        //   188: iload           8
        //   190: ifne            228
        //   193: ifeq            220
        //   196: goto            203
        //   199: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   202: athrow         
        //   203: aload           5
        //   205: dup            
        //   206: iconst_0       
        //   207: putfield        org/rusherhack/Renderer136.f2875:Z
        //   210: invokevirtual   org/rusherhack/Renderer136.m6250:()V
        //   213: goto            220
        //   216: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   219: athrow         
        //   220: aload           5
        //   222: dload_1        
        //   223: dload_3        
        //   224: iload_0        
        //   225: invokespecial   org/rusherhack/Class517.mouseClicked:(DDI)Z
        //   228: ireturn        
        //    StackMapTable: 00 17 FF 00 26 00 06 01 03 03 07 00 02 04 01 00 01 07 00 21 03 48 07 00 21 43 01 58 07 00 21 03 41 07 00 02 FF 00 00 00 06 01 03 03 07 00 02 04 01 00 02 07 00 02 01 13 21 44 01 4A 07 00 21 03 4C 07 00 21 03 43 01 00 44 01 4A 07 00 21 03 4C 07 00 21 03 47 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  20     35     38     42     Ljava/lang/NumberFormatException;
        //  32     48     51     55     Ljava/lang/NumberFormatException;
        //  42     80     80     84     Ljava/lang/NumberFormatException;
        //  146    154    157    161    Ljava/lang/NumberFormatException;
        //  151    171    174    178    Ljava/lang/NumberFormatException;
        //  188    196    199    203    Ljava/lang/NumberFormatException;
        //  193    213    216    220    Ljava/lang/NumberFormatException;
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
    
    public boolean m5207() {
        return false;
    }
    
    public void m6250() {
        
    }
    
    public boolean charTyped(char p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          13656060060804
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: iload_1        
        //    15: istore_0       
        //    16: astore_1       
        //    17: aload_1        
        //    18: getfield        org/rusherhack/Renderer136.f2875:Z
        //    21: iload           4
        //    23: ifne            158
        //    26: ifeq            153
        //    29: goto            36
        //    32: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    35: athrow         
        //    36: iload_0        
        //    37: invokestatic    java/lang/Character.isDigit:(C)Z
        //    40: iload           4
        //    42: ifne            63
        //    45: goto            52
        //    48: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    51: athrow         
        //    52: ifne            127
        //    55: goto            62
        //    58: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    61: athrow         
        //    62: iload_0        
        //    63: sipush          22489
        //    66: ldc2_w          4236769263640038154
        //    69: lload_2        
        //    70: lxor           
        //    71: invokedynamic   BootstrapMethod #2, n:(IJ)I
        //    76: iload           4
        //    78: ifne            112
        //    81: if_icmpeq       127
        //    84: goto            91
        //    87: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    90: athrow         
        //    91: iload_0        
        //    92: sipush          12698
        //    95: ldc2_w          6541364343390678344
        //    98: lload_2        
        //    99: lxor           
        //   100: invokedynamic   BootstrapMethod #2, n:(IJ)I
        //   105: goto            112
        //   108: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   111: athrow         
        //   112: iload           4
        //   114: ifne            150
        //   117: if_icmpne       148
        //   120: goto            127
        //   123: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   126: athrow         
        //   127: aload_1        
        //   128: dup            
        //   129: getfield        org/rusherhack/Renderer136.f2874:Ljava/lang/String;
        //   132: iload_0        
        //   133: invokedynamic   BootstrapMethod #3, makeConcatWithConstants:(Ljava/lang/String;C)Ljava/lang/String;
        //   138: putfield        org/rusherhack/Renderer136.f2874:Ljava/lang/String;
        //   141: goto            148
        //   144: invokestatic    org/rusherhack/Renderer136.m6252:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   147: athrow         
        //   148: iconst_1       
        //   149: dup            
        //   150: dup            
        //   151: pop2           
        //   152: ireturn        
        //   153: aload_1        
        //   154: iload_0        
        //   155: invokespecial   org/rusherhack/Class517.charTyped:(C)Z
        //   158: ireturn        
        //    StackMapTable: 00 12 FF 00 20 00 04 01 07 00 02 04 01 00 01 07 00 21 03 4B 07 00 21 43 01 45 07 00 21 03 40 01 57 07 00 21 03 50 07 00 21 FF 00 03 00 04 01 07 00 02 04 01 00 02 01 01 4A 07 00 21 03 50 07 00 21 03 FF 00 01 00 04 01 07 00 02 04 01 00 02 01 01 02 44 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  17     29     32     36     Ljava/lang/NumberFormatException;
        //  26     45     48     52     Ljava/lang/NumberFormatException;
        //  36     55     58     62     Ljava/lang/NumberFormatException;
        //  63     84     87     91     Ljava/lang/NumberFormatException;
        //  81     105    108    112    Ljava/lang/NumberFormatException;
        //  112    120    123    127    Ljava/lang/NumberFormatException;
        //  117    141    144    148    Ljava/lang/NumberFormatException;
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
    
    public Renderer136(PanelBase<?> panelBase, Renderer107 obf107, NumberSetting<?> numberSetting) {
    }
    
    public String m4902() {
        long n = Renderer136.f2878 ^ 0x3E40656629FFL;
        int m9155 = Class253.m9155();
        Label_0038: {
            try {
                Renderer136 obf136 = this;
                if (m9155 == 0) {
                    return ((NumberSetting)obf136.f8251).getDisplayValue();
                }
                boolean b = this.f2875;
                if (b) {
                    return "";
                }
                break Label_0038;
            }
            catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
            try {
                boolean b = this.f2875;
                if (b) {
                    return "";
                }
            }
            catch (NumberFormatException ex2) {
                throw m6252(ex2);
            }
        }
        Renderer136 obf136 = this;
        return ((NumberSetting)obf136.f8251).getDisplayValue();
    }
    
    static {
   }
    
    public static IllegalStateException m6252(Throwable ex) {
        return new IllegalStateException(ex);
    }
    
    public static String m656(byte[] array) {
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
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Renderer136.m120:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static void m3938() {
        Object[] f2884 = Renderer136.f2884;
        f2884[0] = "\u0012Dhlq\u0014\u000e^j0k\u0000\u001e]!\u0244";
        f2884[1] = Integer.TYPE;
        Renderer136.f2885[1] = "java/lang/Integer";
        f2884[2] = "Qf\u0017du|M|\u00158oh]\u007f^\u017a";
        f2884[3] = "k7\u0004XzP`8\u0015\u0017\u0006Io\"\u001bT1yy5\u0017I Un8";
        f2884[4] = Boolean.TYPE;
        Renderer136.f2885[4] = "java/lang/Boolean";
        f2884[5] = "kc^Zt)wy\\\u0006n=gz\u0017\u0017i.a?J\u0011r(m\u007f^ZH)is\\\u0006U9peP\u001aa";
        f2884[6] = "\u001fBB\f?_\u0014MSCBG\u0007JZ\n";
        f2884[7] = "\u0006v)vj5\u001al+*p!\no`\u04ea";
        f2884[8] = "\u0011E#C\u0013c\r_!\u001f\tw\u001d\\j\u000e\u000ed\u001b\u00197\b\u0015b\u0017Y#C2s\nC-\u0003\u0006";
        f2884[9] = Void.TYPE;
        Renderer136.f2885[9] = "java/lang/Void";
        f2884[10] = "+\u00126r\u0002+7\b4.\u0018?'\u000b\u007f®";
        f2884[11] = Double.TYPE;
        Renderer136.f2885[11] = "java/lang/Double";
        f2884[12] = "(\u001c!]R\r#\u00130\u00123\u0003(\u00184H";
        f2884[13] = "4\u007fNry\u0007(eL.c\u00138f\u0007?g\u001b>c]rj\u00022#\\5%\u0002:cL0%\":cL0I\u0013(h";
        f2884[14] = "{\u007fO\u0012\u000e\fgeMN\u0014\u0018wf\u0006_\u0010\u0010qc\\\u0012\u001d\t}#ZY\u0012\u001dq\u007f\u0006Z\u0013\u0017`#az\u0013\u0017`_MR\u0018\u001cfhZ";
        f2884[15] = "L,\u007f\u0016BOP6}JX[@56[\\SF0l\u0016QJJpj]^^F,6qb_M:}JUH\u0011\u001a";
        f2884[16] = "_\"D!MsT-Un-jX!W2";
        f2884[17] = "`{z`\u000f6}n\"BN;eh";
        f2884[18] = "[s+\\5sGi)\u0000/gWjb\u0011(tQ/-\u001c.kUu%\u001d)(uo%\u001f&r]n\"";
        f2884[19] = "5\u0004Kje\u0012)\u001eI6\u007f\u00069\u001d\u0002'x\u0015?XY0~\u000b)Xa%c\u000f\u000f\u0002E(d";
        f2884[20] = "4\u0002\f\bo+(\u0018\u000eTu?8\u001bE\u0205";
        f2884[21] = "tj\u0003\u0004CAhp\u0001XYUxsJI^F~6\u0011^XXh6'E][iM\u0010C]G";
        f2884[22] = "~\u00125Zu]b\b7\u0006oIr\u000b|\u03c7";
        f2884[23] = "&\u007f*Ca^-p;\f\u0002S8v";
        f2884[24] = "!_ f\u001dL=E\":\u0007X-Fi+\u0003P+C3f\u000eI'\u00032!AI/C\"$Ai/C\"$&M+@\u0005)\u001c\\";
        f2884[25] = "\u0010k\"G\u0001a\u001bd3\ble\u001bx5E[h\b";
        f2884[26] = Character.TYPE;
        Renderer136.f2885[26] = "java/lang/Character";
        f2884[27] = "3V{s4\t/Ly/.\u001d?O2\u0136";
        f2884[28] = "E\u001e\u0006G\u001e]Y\u0004\u0004\u001b\u0004II\u0007O\n\u0003ZOB\r\u0006\u000bOC\u0002\u0006G GM\u000b\u0004\u001b";
        f2884[29] = ",D\u001cGi 0^\u001e\u001bs4 ]U\nt'&\u0018\u0017\u0006|2*X\u001cGR\u0019,Q";
        f2884[30] = "4BGZ\u0003JAbLU\u0012\u0005 lG^\u0016_T";
        f2884[31] = "Kf\b\u0006ar@i\u0019I\u000bqTe\u0012\u0002";
        f2884[32] = "\u001d\u0002D\f\u0001\u001c\u0001\u0018FP\u001b\b\u0011\u001b\rA\u001f\u0000\u0017\u001eW\f\u0012\u0019\u001b^EG\u0012\u001d\u0007\u0002F\f\u0010\u0006\u001f\u001dBL\u0017G\u0013\u0002D\f \f\u0006\u0004JL\u0014?\u0013\u001cVG";
        f2884[33] = "O\u0014\u0001`9 S\u000e\u0003<#4C\rH-$'EH\u0007 \"8A\u0012\u000f!%{e\u0007\u0015'%2";
        f2884[34] = "\u0002~K({AC!\u0003)GD^a}r!WipUy*Q^g3|,YP!Uh9TW\u001d";
        f2884[35] = "3U9nTukI67,W\u0014q\u0011\u0001tQ\u0011l\u0011VJn0\u000f$/\u0012r?V";
        f2884[36] = "O7\u0000k>L\u000ehHj\u0002I\u0013(\";dJ\u0013.\u0015,\u0002O\u0002l\u0018;h^\u001d.\u0015V";
        f2884[37] = "+%!\u001b\r?qu~\fn\u03eb\u0011%m\u0012\u000b;,`{\r\u0010";
        f2884[38] = "Gd\u0015\u000eri\u0004dE\u001c\u001f5\u0016c\u001a\u0019\u007fQ\n5\u001c\u0017/2\u0010?De";
        f2884[39] = "5)>(\u007f<oya?\u001c\u01b4\u000f/a#wl7lase";
        f2884[40] = "M,\u001a)vNJ2Qo\nLK0jc`\u001a\u001b-Qne\u0012\u0018L";
        f2884[41] = "\u0002Pz\u000b\u001d$\\Rl\u0014%-TU]\u0013A+T)3\u0010\u001ckX\u0012>\u0015\u0014h9\u0013q\u0018@o\u0004Vg\u0007[V\u0003[a\u001f\u001ckFM~\u0004%hRXc\u0004^9F\u0015:z";
        f2884[42] = "%\u0000FXrlf\u0000\u0016J\u001f/d\u000b]Oe5\u007f\u000e&B/=kQEX%e\u0019\u0010\u0016Zmdz\n\u001c\u0002\u001fhx\u0001M^'+xQ_3";
        f2884[43] = "'{)\u0007v\u00054{&\u0002\r\u000e-f+\u0014u\b/s:\u0003\r_!#{\u000f6R$+xn=\u0005r''U0\u0000z$F^gVv{}Sb^u\u001av\u00044R*!{\u0001<QK";
        f2884[44] = "m\u0014IT\nN0\u000f\u0012\rw\u03b4\u0000EIVJQ;HL^I00\u001f\u001aR\u0016\u000b=\u001a\u0012QwA0\u001cQ_\u0014[:D#";
        f2884[45] = "ru7\u0000`d&j*\u0000\u0003rux\u0014\"I\u001di4'\u001f3~s>\u007fm";
        f2884[46] = "x\u0004+2eh~\u0000p.\tv(\u0007\u00052ra!\u00128\u0015`|({u2ir(C629`E";
        f2884[47] = "\u001fu~9\fO\u0018k5\u007fpC\u000fMj*\u0001C\u0012z\u000ey\u0002@\u0011,3<\u0014_\n\u0015";
        f2884[48] = "\u0017\r7%u'G_\u007f`\u0011yE@X}}jH<7v(+I\u0007:s ((";
        f2884[49] = "z@ahx\u0017!RpmGBcS|/G\u0013xIp8\u007fPx\u0019bU#\u0012 X#l.Kf\u0013\u001bk,^yW`:8\u0013 )";
        f2884[50] = "G\u0011.H~,T\u0011!M\u0005<L\r'M\u0005vAI|@>{DA\u007f!tvB\u0002qBn|\u001apqK<{JK|N4x+";
        f2884[51] = "/\rVI\u001aE(\u0013\u001d\u000ffR)\u0016ZZ\u001cTD\u0006FC\u001cT)\u0001X\bZ(";
        f2884[52] = "\u001dl\u000fk\u0014\u0011G<P|w\u0474'=Qp\rPJ:O;K";
        f2884[53] = "B}DK60Sb\u0006F[6Qh\u0003q61Wh\u001aD?7+1\u0016\u0012f;\u0010<\u0013\u001aeZ\u001bkE\u0016:a\u0016nM\u0015[jA8AJ`gD0B+k0\u0012<\u001d\u0010f5\u001a?|Zk3Y1\u001f@ak+?\u0017Z;$Pn\u0003\u0017bZ";
        f2884[54] = "r]\u0015&n1y^\u0007 \u0017`ik\u0019sv}\u0012F\u0011grbw\u0018\u0014le\u0001(U\u001ay.<mC\u0005b\u0017";
        f2884[55] = """
                    i!8( 
                    z!7-[\u000ba)29[Poyj `]jqiAk
                    <}6zf\u000f4~Wq1Y8!l|4Q;@g+b]d{j.j^\u0005""";
        f2884[56] = "/\u0005Y\u0016b72\u0002\fZ\f>MZ\u0007W1:rI\u001f\u00017";
        f2884[57] = "H\u0000\nJr#O\u001eA\f\u000e6G\t\u000b0e.S\u001a\u0006]b0\u0018\\z";
        f2884[58] = "_MGP\u001b\rRH\u001bh\u0509}@\u0006\u0014\u001aY\u001eZ\fLh";
        f2884[59] = "m;i\tJo39\u007f\u0016rr;>U\u0011\u0002|3?ux\u0018t6|!\u0000\r#6y\u0010";
        f2884[60] = ",^TgU+![\b_\u027e[3\u0015\u0007-\u00178)\u001f__";
        f2884[61] = "QM\u0014BNY\u000b\u001dKU-\u040dkIAXM\u001a\u0010\u0018U\u0015\u0014d";
        f2884[62] = "\u0005W+|\td_\u0007tkj0?Wrg\f4OUxeWY\u0005\neq\u0007)\u0007\u0000g*j";
        f2884[63] = "u6\u0012.Uh/fM96\u029cO6^'SlrsH8H";
        f2884[64] = "\u001e1\u007f&6lNc7cR\u044f!j>f?>X>!{?";
        f2884[65] = "La>j|HWf<r\u0012\n@&~a^\u0015T6aa\u0012NH<na*\rHl|\f\"\u0018\u0010ad7/\u001d\u0018b\u0005";
        f2884[66] = "sLH\u0011%v`LG\u0014^fxPA\u0014^,u\u0014\u001a\u0019e!p\u001c\u0019xnv&\u0010FCcs.\u0013'H4%\"L\u001cE1-!-";
        f2884[67] = "#\u0016\u0004\u0013bh}\u0014\u0012\fZuu\u00138\u0003<{}\u0012\u0018b0sxQL\u001a%$xT}";
        f2884[68] = "nz7\u001c|[:e*\u001c\u001fxIGN\u001bn[ih7OqFi";
        f2884[69] = "\u0003\r!\u0000j\u001d\u0005\tz\u001c\u0006\u0003S\u000e\u001d\bb\u0011Srs\u001egQE\u001c-\u00028\r>";
        f2884[70] = "|\u0005\u000f:\bz,WG\u007fl\u02f6C\u0004U:Q*x\tP2RK";
        f2884[71] = "?X\u0012\b.Bo\nZMJ\u001cm\u0015b\\+\u001c`\u0015\"\u000b8\u0011eP\u001fN.\u000e~i\u0012[sNaR\u001f^{M\u0000";
        f2884[72] = ")P\u001ddydyNMbEc>DG{=v>@Gk4\u001f.\\Xm&fzCEmEntDS0&t~\u001c!j4f)NX>+{)-";
        f2884[73] = "M\u000b\\$Jp^P\\4$\u050a#\u001c\u0000,V?@\u0006\nt";
        f2884[74] = "\u0003RO.f/]PY1^2UWz>%%\\BG\u000179EF6c?=SF\u000e ?mA+";
        f2884[75] = "B 0E-\u0014\u0012rx\u0000I\u01f6}!jEtDF,oMw%M{9A(\u001e@~1BI\u001f\u000fseEtZ\u0019l~|";
        f2884[76] = "'\u001dC5\u000b\f2JC0:\u0018*\tIoW*$\u0010^f:D'M\u001ej\u0001I\"E\u001d\u000b";
        f2884[77] = "g\bS[\f\u001c=X\fLo\u00df]\u0002\u0007\tR@f\u000f\u0002\u0001Q";
        f2884[78] = "-j9LZ\u0013r;8\u00116\u0011+v\u0003D\\M\u007fg8IYE|\u00063\u001e\u000fI#=>\u001b\u0007JB6iM\u000b\u0015y;lE\bt";
        f2884[79] = ":\u0017GjICd\u0015QuqJl\u0012`r\u0015Lln\u000eqH\f`U\u0003t@\u000f\u0001PUj\u0011Oz\u0001A'H1";
        f2884[80] = "{\u007f\u0012!1\u001cb,O9P\bvi*-6\n\u007f\u0015C'(Z'\u007f\u0002x`[\u001b";
        f2884[81] = "k}qPfO5v1DY\u001f\u000epmJ2^63m\u001a 32-lA4\u000bq-<SY";
        f2884[82] = "\"+B\u007f80s*E#H\u0444\u001fy\u0002\")0n\u007f\u0006y5";
    }
    
    public static Field m1733(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m1734(Class clazz, String s, Class clazz2) {
        Field m1733 = m1733(clazz, s, clazz2);
        if (m1733 != null) {
            return m1733;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m1734 = m1734(interfaces[i], s, clazz2);
                if (m1734 != null) {
                    return m1734;
                }
            }
        }
        return null;
    }
    
    public static Method m1736(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m1737(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m1736 = m1736(clazz, s, clazz2, n, array);
        if (m1736 != null) {
            return m1736;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m1737 = m1737(interfaces[i], s, clazz2, n, array);
                if (m1737 != null) {
                    return m1737;
                }
            }
        }
        return null;
    }
    
    public static CallSite m3936(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Renderer136.m3936:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
                    handle = ((CallSite)Renderer136.m3936(lookup, "\u00f5", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Renderer136.m3936(lookup, "\u00f5", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)Renderer136.m3936(lookup, "\u00f5", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)Renderer136.m3936(lookup, "\u00f5", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Renderer136.m3936(lookup, "\u00f5", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
