// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.hud;
import org.rusherhack.Obf541;

import org.rusherhack.core.logging.ILog;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
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
import org.rusherhack.Class066;
import java.lang.invoke.MethodHandles;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import java.util.Iterator;
import com.google.gson.JsonArray;
import org.rusherhack.core.command.argument.StringCapture;
import org.rusherhack.core.utils.Version;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import org.rusherhack.client.api.RusherHackAPI;
import java.util.Map;
import org.rusherhack.core.setting.Setting;
import java.util.List;
import org.rusherhack.core.logging.ILogger;
import org.rusherhack.client.api.Globals;
import org.rusherhack.core.logging.ILoggable;
import org.rusherhack.core.event.listener.EventListener;
import org.rusherhack.core.bind.IBindable;
import org.rusherhack.client.api.ui.ScaledElementBase;

import org.rusherhack.command.bind;
import org.rusherhack.command.toggle;
public abstract class HudElement extends ScaledElementBase implements IHudElement, IBindable, EventListener, ILoggable, Globals
{
   public double \u042a;
   public double \u0145;
   public boolean \u01a9;
   public String P;
   public HudElement$SnapPoint \u00cb;
   public boolean \u04e9;
   public String \u0225;
   public java.util.List<Setting<?>> \u01cc;

    private boolean f597;
    private boolean f598;
    public final ILogger logger;
    public HudElement$Alignment alignment;
    private final List<Setting<?>> f599;
    private double f600;
    private HudElement$SnapPoint f601;
    private double f602;
    private String f603;
    private final String f604;
    private static String[] f605;
    private static long f606;
    private static String[] f607;
    private static String[] f608;
    private static Map f609;
    private static Object[] f610;
    private static String[] f611;
    
    public static HudElement$Alignment calculateAlignment(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          135467729132193
        //     6: lxor           
        //     7: lstore          4
        //     9: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.\u0254:()[Ljava/lang/String;
        //    12: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //    15: invokevirtual   net.minecraft.client.MinecraftClient.getWindow:()Lnet.minecraft.client.util.Window;
        //    18: astore          7
        //    20: astore          6
        //    22: dload_0        
        //    23: aload           7
        //    25: invokevirtual   net.minecraft.client.util.Window.getScaledWidth:()I
        //    28: i2f            
        //    29: fconst_2       
        //    30: fdiv           
        //    31: f2d            
        //    32: dcmpg          
        //    33: aload           6
        //    35: ifnonnull       60
        //    38: ifge            59
        //    41: goto            48
        //    44: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    47: athrow         
        //    48: iconst_1       
        //    49: dup            
        //    50: dup            
        //    51: pop2           
        //    52: goto            63
        //    55: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    58: athrow         
        //    59: iconst_0       
        //    60: iconst_1       
        //    61: dup            
        //    62: pop2           
        //    63: istore_1       
        //    64: dload_2        
        //    65: aload           7
        //    67: invokevirtual   net.minecraft.client.util.Window.getScaledHeight:()I
        //    70: i2f            
        //    71: fconst_2       
        //    72: fdiv           
        //    73: f2d            
        //    74: dcmpg          
        //    75: aload           6
        //    77: ifnonnull       102
        //    80: ifgt            101
        //    83: goto            90
        //    86: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    89: athrow         
        //    90: iconst_1       
        //    91: dup            
        //    92: dup            
        //    93: pop2           
        //    94: goto            105
        //    97: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   100: athrow         
        //   101: iconst_0       
        //   102: iconst_1       
        //   103: dup            
        //   104: pop2           
        //   105: istore          7
        //   107: iload_1        
        //   108: aload           6
        //   110: ifnonnull       156
        //   113: ifeq            155
        //   116: goto            123
        //   119: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   122: athrow         
        //   123: iload           7
        //   125: aload           6
        //   127: ifnonnull       156
        //   130: goto            137
        //   133: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   136: athrow         
        //   137: ifeq            155
        //   140: goto            147
        //   143: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   146: athrow         
        //   147: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   150: areturn        
        //   151: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   154: athrow         
        //   155: iload_1        
        //   156: aload           6
        //   158: ifnonnull       181
        //   161: ifeq            179
        //   164: goto            171
        //   167: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   170: athrow         
        //   171: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   174: areturn        
        //   175: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   178: athrow         
        //   179: iload           7
        //   181: ifeq            192
        //   184: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   187: areturn        
        //   188: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   191: athrow         
        //   192: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   195: areturn        
        //    StackMapTable: 00 1C FF 00 2C 00 05 03 03 04 07 00 67 07 00 4F 00 01 07 00 3D 03 46 07 00 3D 03 40 01 42 01 FF 00 16 00 06 00 01 03 04 07 00 67 07 00 4F 00 01 07 00 3D 03 46 07 00 3D 03 40 01 42 01 FF 00 0D 00 06 00 01 03 04 07 00 67 01 00 01 07 00 3D 03 49 07 00 3D 43 01 45 07 00 3D 03 43 07 00 3D 03 40 01 4A 07 00 3D 03 43 07 00 3D 03 41 01 46 07 00 3D 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  22     41     44     48     Ljava/lang/IllegalArgumentException;
        //  38     55     55     59     Ljava/lang/IllegalArgumentException;
        //  64     83     86     90     Ljava/lang/IllegalArgumentException;
        //  80     97     97     101    Ljava/lang/IllegalArgumentException;
        //  107    116    119    123    Ljava/lang/IllegalArgumentException;
        //  113    130    133    137    Ljava/lang/IllegalArgumentException;
        //  123    140    143    147    Ljava/lang/IllegalArgumentException;
        //  137    151    151    155    Ljava/lang/IllegalArgumentException;
        //  156    164    167    171    Ljava/lang/IllegalArgumentException;
        //  161    175    175    179    Ljava/lang/IllegalArgumentException;
        //  181    188    188    192    Ljava/lang/IllegalArgumentException;
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
    
    public double getScale() {
        final long n = HudElement.f606 ^ 0x26F9B5ED61B2L;
        return RusherHackAPI.getHudManager().getScale();
    }
    
    public void mouseMoved(final double n, final double n2) {
        final long n3 = HudElement.f606 ^ 0x25D5628AE4CL;
        try {
            if (this.isDragging()) {
                this.setStartX(n - this.\u042a);
                this.setStartY(n2 - this.\u0145);
            }
        }
        catch (final IllegalArgumentException ex) {
            ex.printStackTrace();
        }
    }
    
    public HudElement(final String f604) {
        final long n = HudElement.f606 ^ 0xAC769016462L;
        final double y = 0.25;
        final double x = 0.25;
        final double n2 = 0.0;
        final boolean \u04e9 = false;
        final HudElement$SnapPoint \u00eb = null;
        final String p = "";
        final boolean \u0283 = false;
        this.\u01a9 = \u0283;
        this.P = p;
        this.f599 = new ArrayList<Setting<?>>();
        this.\u00cb = \u00eb;
        this.alignment = HudElement$Alignment.TOP_LEFT;
        this.\u04e9 = \u04e9;
        this.\u042a = n2;
        this.\u0145 = n2;
        this.f604 = f604;
        this.logger = RusherHackAPI.createLogger(this.getName());
        super.setX(x);
        super.setY(y);
        RusherHackAPI.getBindManager().register((IBindable)this);
    }
    
    public String getName() {
        final long n = HudElement.f606 ^ 0x70409397D34DL;
        return this.\u0225;
    }
    
    public ILogger getLogger() {
        final long n = HudElement.f606 ^ 0x7DA193C440B7L;
        return this.logger;
    }
    
    public void setStartX(final double x) {
        final long n = HudElement.f606 ^ 0x69C4DF37A404L;
        Label_0065: {
            try {
                switch (((Enum)this.getAlignment()).ordinal()) {
                    case 0:
                    case 1:
                    case 3: {
                        break;
                    }
                    case 2:
                    case 4: {
                        break Label_0065;
                    }
                    default: {
                        return;
                    }
                }
            }
            catch (final IllegalArgumentException ex) {
                ex.printStackTrace();
            }
            try {
                this.setX(x);
                return;
            }
            catch (final IllegalArgumentException ex2) {
                ex2.printStackTrace();
            }
        }
        this.setX(x + this.getScaledWidth());
    }
    
    public void toggle() {
        final long n = HudElement.f606 ^ 0x445E2A74378EL;
        final String[] \u0254 = \u0254();
        boolean toggled = false;
        Label_0043: {
            Label_0031: {
                boolean b;
                try {
                    b = (toggled = this.isToggled());
                    if (\u0254 != null) {
                        break Label_0043;
                    }
                    if (true) {
                        break Label_0031;
                    }
                    break Label_0031;
                }
                catch (final IllegalArgumentException ex) {
                    ex.printStackTrace();
                }
                try {
                    if (true) {
                        toggled = true;
                        break Label_0043;
                    }
                }
                catch (final IllegalArgumentException ex2) {
                    ex2.printStackTrace();
                }
            }
            toggled = false;
        }
        this.setToggled(toggled);
    }
    
    public double getY() {
        final long n = HudElement.f606 ^ 0x2C7E3AEDC726L;
        return super.getY() * Globals.mc.getWindow().getScaledHeight();
    }
    
    public boolean isHovered(final double n, final double n2) {
        final long n3 = HudElement.f606 ^ 0x4842C13A8E0L;
        return RusherHackAPI.getThemeManager().getHudHandler().isElementHovered(this, n, n2);
    }
    
    public HudElement$SnapPoint getSnapPoint() {
        final long n = HudElement.f606 ^ 0x2C9C080FC1CEL;
        return this.\u00cb;
    }
    
    public void setStartY(final double y) {
        final long n = HudElement.f606 ^ 0x41E25876B80BL;
        Label_0065: {
            try {
                switch (((Enum)this.getAlignment()).ordinal()) {
                    case 0:
                    case 1:
                    case 2: {
                        break;
                    }
                    case 3:
                    case 4: {
                        break Label_0065;
                    }
                    default: {
                        return;
                    }
                }
            }
            catch (final IllegalArgumentException ex) {
                ex.printStackTrace();
            }
            try {
                this.setY(y);
                return;
            }
            catch (final IllegalArgumentException ex2) {
                ex2.printStackTrace();
            }
        }
        this.setY(y + this.getScaledHeight());
    }
    
    public void setSnapPoint(final HudElement$SnapPoint \u00eb) {
        final long n = HudElement.f606 ^ 0xF494D78CE29L;
        this.\u00cb = \u00eb;
    }
    
    public boolean isDragging() {
        final long n = HudElement.f606 ^ 0x8378463BA6EL;
        return this.\u04e9;
    }
    
    public HudElement$Alignment getAlignment() {
        final long n = HudElement.f606 ^ 0x1C1935EA6870L;
        return this.alignment;
    }
    
    public double getX() {
        final long n = HudElement.f606 ^ 0x75FEC66A2941L;
        return super.getX() * Globals.mc.getWindow().getScaledWidth();
    }
    
    public boolean shouldUpdateAlignment() {
        return true;
    }
    
    public boolean deserialize(final JsonElement p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          34184405387643
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.\u0254:()[Ljava/lang/String;
        //    11: astore          4
        //    13: aload_0        
        //    14: aload_1        
        //    15: astore_0       
        //    16: astore_1       
        //    17: aload_0        
        //    18: invokevirtual   com/google/gson/JsonElement.isJsonObject:()Z
        //    21: aload           4
        //    23: ifnonnull       70
        //    26: ifeq            62
        //    29: goto            36
        //    32: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    35: athrow         
        //    36: aload_0        
        //    37: aload           4
        //    39: ifnonnull       72
        //    42: goto            49
        //    45: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    48: athrow         
        //    49: invokevirtual   com/google/gson/JsonElement.isJsonNull:()Z
        //    52: ifeq            71
        //    55: goto            62
        //    58: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    61: athrow         
        //    62: iconst_0       
        //    63: goto            70
        //    66: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    69: athrow         
        //    70: ireturn        
        //    71: aload_0        
        //    72: invokevirtual   com/google/gson/JsonElement.getAsJsonObject:()Lcom/google/gson/JsonObject;
        //    75: dup            
        //    76: astore_0       
        //    77: ldc_w           "name"
        //    80: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //    83: aload           4
        //    85: ifnonnull       572
        //    88: ifeq            571
        //    91: goto            98
        //    94: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    97: athrow         
        //    98: aload_0        
        //    99: ldc_w           "name"
        //   102: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   105: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   108: aload_1        
        //   109: getfield        org/rusherhack/client/api/feature/hud/HudElement.\u0225:Ljava/lang/String;
        //   112: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   115: aload           4
        //   117: ifnonnull       572
        //   120: goto            127
        //   123: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   126: athrow         
        //   127: ifeq            571
        //   130: goto            137
        //   133: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   136: athrow         
        //   137: aload_0        
        //   138: ldc_w           "toggled"
        //   141: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   144: aload           4
        //   146: ifnonnull       194
        //   149: goto            156
        //   152: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   155: athrow         
        //   156: ifeq            187
        //   159: goto            166
        //   162: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   165: athrow         
        //   166: aload_1        
        //   167: aload_0        
        //   168: ldc_w           "toggled"
        //   171: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   174: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //   177: putfield        org/rusherhack/client/api/feature/hud/HudElement.\u01a9:Z
        //   180: goto            187
        //   183: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   186: athrow         
        //   187: aload_0        
        //   188: ldc_w           "x"
        //   191: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   194: aload           4
        //   196: ifnonnull       237
        //   199: ifeq            230
        //   202: goto            209
        //   205: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   208: athrow         
        //   209: aload_1        
        //   210: aload_0        
        //   211: ldc_w           "x"
        //   214: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   217: invokevirtual   com/google/gson/JsonElement.getAsDouble:()D
        //   220: invokespecial   org/rusherhack/client/api/ui/ScaledElementBase.setX:(D)V
        //   223: goto            230
        //   226: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   229: athrow         
        //   230: aload_0        
        //   231: ldc_w           "y"
        //   234: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   237: aload           4
        //   239: ifnonnull       292
        //   242: ifeq            273
        //   245: goto            252
        //   248: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   251: athrow         
        //   252: aload_1        
        //   253: aload_0        
        //   254: ldc_w           "y"
        //   257: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   260: invokevirtual   com/google/gson/JsonElement.getAsDouble:()D
        //   263: invokespecial   org/rusherhack/client/api/ui/ScaledElementBase.setY:(D)V
        //   266: goto            273
        //   269: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   272: athrow         
        //   273: aload_0        
        //   274: ldc_w           "snap"
        //   277: aload           4
        //   279: ifnonnull       306
        //   282: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   285: goto            292
        //   288: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   291: athrow         
        //   292: ifeq            334
        //   295: aload_0        
        //   296: ldc_w           "snap"
        //   299: goto            306
        //   302: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   305: athrow         
        //   306: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   309: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   312: astore          5
        //   314: aload_1        
        //   315: aload           5
        //   317: invokestatic    org/rusherhack/client/api/feature/hud/HudElement$SnapPoint.valueOf:(Ljava/lang/String;)Lorg/rusherhack/client/api/feature/hud/HudElement$SnapPoint;
        //   320: putfield        org/rusherhack/client/api/feature/hud/HudElement.\u00cb:Lorg/rusherhack/client/api/feature/hud/HudElement$SnapPoint;
        //   323: aload_0        
        //   324: goto            335
        //   327: astore          6
        //   329: aload_1        
        //   330: aconst_null    
        //   331: putfield        org/rusherhack/client/api/feature/hud/HudElement.\u00cb:Lorg/rusherhack/client/api/feature/hud/HudElement$SnapPoint;
        //   334: aload_0        
        //   335: ldc_w           "alignment"
        //   338: aload           4
        //   340: ifnonnull       367
        //   343: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   346: ifeq            399
        //   349: goto            356
        //   352: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   355: athrow         
        //   356: aload_0        
        //   357: ldc_w           "alignment"
        //   360: goto            367
        //   363: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   366: athrow         
        //   367: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   370: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   373: astore          5
        //   375: aload_1        
        //   376: aload           5
        //   378: invokestatic    org/rusherhack/client/api/feature/hud/HudElement$Alignment.valueOf:(Ljava/lang/String;)Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   381: putfield        org/rusherhack/client/api/feature/hud/HudElement.alignment:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   384: goto            421
        //   387: astore          6
        //   389: aload_1        
        //   390: aconst_null    
        //   391: putfield        org/rusherhack/client/api/feature/hud/HudElement.alignment:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   394: aload           4
        //   396: ifnull          421
        //   399: aload_1        
        //   400: dup            
        //   401: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getX:()D
        //   404: aload_1        
        //   405: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getY:()D
        //   408: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.calculateAlignment:(DD)Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   411: putfield        org/rusherhack/client/api/feature/hud/HudElement.alignment:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   414: goto            421
        //   417: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   420: athrow         
        //   421: aload_0        
        //   422: ldc_w           "settings"
        //   425: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   428: aload           4
        //   430: ifnonnull       570
        //   433: ifeq            566
        //   436: goto            443
        //   439: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   442: athrow         
        //   443: aload_0        
        //   444: ldc_w           "settings"
        //   447: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   450: invokevirtual   com/google/gson/JsonElement.getAsJsonArray:()Lcom/google/gson/JsonArray;
        //   453: dup            
        //   454: astore          5
        //   456: invokevirtual   com/google/gson/JsonArray.iterator:()Ljava/util/Iterator;
        //   459: astore          6
        //   461: aload           6
        //   463: invokeinterface java/util/Iterator.hasNext:()Z
        //   468: ifeq            566
        //   471: aload           6
        //   473: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   478: checkcast       Lcom/google/gson/JsonElement;
        //   481: dup            
        //   482: astore_0       
        //   483: aload           4
        //   485: ifnonnull       523
        //   488: invokevirtual   com/google/gson/JsonElement.isJsonObject:()Z
        //   491: aload           4
        //   493: ifnonnull       570
        //   496: goto            503
        //   499: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   502: athrow         
        //   503: ifeq            461
        //   506: goto            513
        //   509: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   512: athrow         
        //   513: aload_0        
        //   514: invokevirtual   com/google/gson/JsonElement.getAsJsonObject:()Lcom/google/gson/JsonObject;
        //   517: ldc_w           "name"
        //   520: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   523: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   526: astore          5
        //   528: aload_1        
        //   529: aload           5
        //   531: invokeinterface org/rusherhack/core/feature/IFeatureConfigurable.getSetting:(Ljava/lang/String;)Lorg/rusherhack/core/setting/Setting;
        //   536: dup            
        //   537: astore          5
        //   539: aload           4
        //   541: ifnonnull       556
        //   544: ifnull          461
        //   547: goto            554
        //   550: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   553: athrow         
        //   554: aload           5
        //   556: aload_0        
        //   557: invokevirtual   org/rusherhack/core/setting/Setting.deserialize:(Lcom/google/gson/JsonElement;)Z
        //   560: pop            
        //   561: aload           4
        //   563: ifnull          461
        //   566: iconst_1       
        //   567: dup            
        //   568: dup            
        //   569: pop2           
        //   570: ireturn        
        //   571: iconst_0       
        //   572: ireturn        
        //    StackMapTable: 00 3E FF 00 20 00 04 07 01 0D 07 00 02 04 07 00 67 00 01 07 00 3D 03 48 07 00 3D 43 07 01 0D 48 07 00 3D 03 43 07 00 3D 43 01 00 40 07 01 0D FF 00 15 00 04 07 01 2E 07 00 02 04 07 00 67 00 01 07 00 3D 03 58 07 00 3D 43 01 45 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 50 07 00 3D 03 46 01 4A 07 00 3D 03 50 07 00 3D 03 46 01 4A 07 00 3D 03 50 07 00 3D 03 4E 07 00 3D 43 01 49 07 00 3D FF 00 03 00 04 07 01 2E 07 00 02 04 07 00 67 00 02 07 01 2E 07 01 3B FF 00 14 00 05 07 01 2E 07 00 02 04 07 00 67 07 01 3B 00 01 07 00 3D FA 00 06 40 07 01 2E 50 07 00 3D 03 46 07 00 3D FF 00 03 00 04 07 01 2E 07 00 02 04 07 00 67 00 02 07 01 2E 07 01 3B FF 00 13 00 05 07 01 2E 07 00 02 04 07 00 67 07 01 3B 00 01 07 00 3D FA 00 0B 51 07 00 3D 03 51 07 00 3D 03 FF 00 11 00 06 07 01 0D 07 00 02 04 07 00 67 07 01 77 07 01 66 00 00 65 07 00 3D 43 01 45 07 00 3D 03 49 07 01 0D FF 00 1A 00 06 07 01 0D 07 00 02 04 07 00 67 07 01 74 07 01 66 00 01 07 00 3D 03 41 07 01 74 F9 00 09 43 01 FF 00 00 00 04 07 01 2E 07 00 02 04 07 00 67 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  292    299    302    306    Ljava/lang/IllegalArgumentException;
        //  273    285    288    292    Ljava/lang/IllegalArgumentException;
        //  242    266    269    273    Ljava/lang/IllegalArgumentException;
        //  237    245    248    252    Ljava/lang/IllegalArgumentException;
        //  199    223    226    230    Ljava/lang/IllegalArgumentException;
        //  194    202    205    209    Ljava/lang/IllegalArgumentException;
        //  156    180    183    187    Ljava/lang/IllegalArgumentException;
        //  137    159    162    166    Ljava/lang/IllegalArgumentException;
        //  127    149    152    156    Ljava/lang/IllegalArgumentException;
        //  98     130    133    137    Ljava/lang/IllegalArgumentException;
        //  88     120    123    127    Ljava/lang/IllegalArgumentException;
        //  77     91     94     98     Ljava/lang/IllegalArgumentException;
        //  49     63     66     70     Ljava/lang/IllegalArgumentException;
        //  36     55     58     62     Ljava/lang/IllegalArgumentException;
        //  26     42     45     49     Ljava/lang/IllegalArgumentException;
        //  17     29     32     36     Ljava/lang/IllegalArgumentException;
        //  314    323    327    334    Ljava/lang/IllegalArgumentException;
        //  343    360    363    367    Ljava/lang/IllegalArgumentException;
        //  335    349    352    356    Ljava/lang/IllegalArgumentException;
        //  375    384    387    399    Ljava/lang/IllegalArgumentException;
        //  389    414    417    421    Ljava/lang/IllegalArgumentException;
        //  421    436    439    443    Ljava/lang/IllegalArgumentException;
        //  483    496    499    503    Ljava/lang/IllegalArgumentException;
        //  488    506    509    513    Ljava/lang/IllegalArgumentException;
        //  539    547    550    554    Ljava/lang/IllegalArgumentException;
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
    
    public void setDescription(final String p) {
        final long n = HudElement.f606 ^ 0x3C297645E8E5L;
        this.P = p;
    }
    
    public boolean isToggled() {
        final long n = HudElement.f606 ^ 0x5B00CF700006L;
        return this.\u01a9;
    }
    
    public List<Setting<?>> getSettings() {
        final long n = HudElement.f606 ^ 0xF907510AA45L;
        return this.\u01cc;
    }
    
    public void setX(double x) {
        final long n = HudElement.f606 ^ 0x3CA977486391L;
        x /= Globals.mc.getWindow().getScaledWidth();
        super.setX(x);
    }
    
    public double getStartX() {
        final long n = HudElement.f606 ^ 0x158A5E64E26CL;
        double x = this.getX();
        double n2 = 0.0;
        try {
            switch (((Enum)this.getAlignment()).ordinal()) {
                case 0:
                case 1:
                case 3: {
                    n2 = x;
                    break;
                }
                case 2:
                case 4: {
                    return x - this.getScaledWidth();
                }
                default: {
                    return x;
                }
            }
        }
        catch (final IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return n2 + 0.0;
    }
    
    public JsonElement serialize() {
        final long n = HudElement.f606 ^ 0x7EDED8FEB1A4L;
        final String[] \u0254 = \u0254();
        final JsonObject jsonObject = new JsonObject();
        final String[] array = \u0254;
        JsonObject jsonObject4 = null;
        String s5 = null;
        String name2 = null;
        Label_0183: {
            Label_0180: {
                HudElement$Alignment hudElement$Alignment2 = null;
                Label_0162: {
                    HudElement$Alignment hudElement$Alignment = null;
                    Label_0136: {
                        JsonObject jsonObject2 = null;
                        String $ = null;
                        Label_0133: {
                            HudElement$SnapPoint hudElement$SnapPoint2 = null;
                            Label_0115: {
                                HudElement$SnapPoint hudElement$SnapPoint;
                                try {
                                    final String s = "cqqo";
                                    jsonObject2 = jsonObject;
                                    final String s2 = "\u0016";
                                    final String s3 = "g";
                                    final JsonObject jsonObject3 = jsonObject;
                                    final String s4 = "\u001b\u0004\b\f\u0003\u000e\u000b";
                                    jsonObject.addProperty("name", this.\u0225);
                                    jsonObject3.addProperty(Version.$(s4), Boolean.valueOf(this.\u01a9));
                                    jsonObject3.addProperty(StringCapture.$(s3), (Number)super.getX());
                                    jsonObject2.addProperty(Version.$(s2), (Number)super.getY());
                                    $ = StringCapture.$(s);
                                    hudElement$SnapPoint = (hudElement$SnapPoint2 = this.\u00cb);
                                    if (array != null) {
                                        break Label_0115;
                                    }
                                    if (hudElement$SnapPoint != null) {
                                        break Label_0115;
                                    }
                                    break Label_0133;
                                }
                                catch (final IllegalArgumentException ex) {
                                    ex.printStackTrace();
                                }
                                try {
                                    if (false) {
                                        break Label_0133;
                                    }
                                    hudElement$SnapPoint2 = this.\u00cb;
                                }
                                catch (final IllegalArgumentException ex2) {
                                    ex2.printStackTrace();
                                }
                            }
                            final String name = ((Enum)hudElement$SnapPoint2).name();
                            break Label_0136;
                        }
                        final String name = "null";
                        try {
                            jsonObject2.addProperty($, name);
                            jsonObject4 = jsonObject;
                            s5 = "alignment";
                            hudElement$Alignment = (hudElement$Alignment2 = this.alignment);
                            if (array != null) {
                                break Label_0162;
                            }
                            if (hudElement$Alignment != null) {
                                break Label_0162;
                            }
                            break Label_0180;
                        }
                        catch (final IllegalArgumentException ex3) {
                            throw a((Throwable)ex3);
                        }
                    }
                    try {
                        if (hudElement$Alignment == null) {
                            break Label_0180;
                        }
                        hudElement$Alignment2 = this.alignment;
                    }
                    catch (final IllegalArgumentException ex4) {
                        throw a((Throwable)ex4);
                    }
                }
                name2 = ((Enum)hudElement$Alignment2).name();
                break Label_0183;
            }
            name2 = "null";
        }
        jsonObject4.addProperty(s5, name2);
        if (!this.\u01cc.isEmpty()) {
            final JsonArray jsonArray = new JsonArray();
            final Iterator iterator = this.\u01cc.iterator();
        Label_0220:
            while (true) {
                iterator.hasNext();
                boolean shouldSerialize = false;
                while (shouldSerialize) {
                    final Setting setting;
                    shouldSerialize = (setting = (Setting)iterator.next()).shouldSerialize(false);
                    if (array == null) {
                        if (!shouldSerialize) {
                            continue Label_0220;
                        }
                        jsonArray.add(setting.serialize());
                        if (array != null) {
                            break;
                        }
                        continue Label_0220;
                    }
                }
                break;
            }
            jsonObject.add("settings", (JsonElement)jsonArray);
        }
        return (JsonElement)jsonObject;
    }
    
    public IFontRenderer getFontRenderer() {
        final long n = HudElement.f606 ^ 0x93360342BECL;
        return RusherHackAPI.fonts().getHudFontRenderer();
    }
    
    public void onDisable() {
        final long n = HudElement.f606 ^ 0x2C54F20E696CL;
        this.\u01a9 = false;
    }
    
    public String getBindReference() {
        final long n = HudElement.f606 ^ 0xC9F2B61F66L;
        return String.format("feature_hudelement_toggle_%s", this.getName().toLowerCase());
    }
    
    public void onKeybindEvent() {
        final long n = HudElement.f606 ^ 0x170D8507326AL;
        this.toggle();
    }
    
    public void render(final RenderContext renderContext, final double n, final double n2) {
        final long n3 = HudElement.f606 ^ 0x673D027CCA0FL;
        final String[] \u0254 = \u0254();
        HudElement hudElement = null;
        Label_0090: {
            Label_0088: {
                try {
                    hudElement = this;
                    if (\u0254 != null) {
                        break Label_0090;
                    }
                    if (!this.shouldUpdateAlignment()) {
                        break Label_0088;
                    }
                }
                catch (final IllegalArgumentException ex) {
                    ex.printStackTrace();
                }
                hudElement = this;
                final HudElement$Alignment calculateAlignment = calculateAlignment(this);
                Label_0066: {
                    try {
                        if (\u0254 != null) {
                            break Label_0090;
                        }
                        final HudElement$Alignment hudElement$Alignment = this.alignment;
                        final HudElement$Alignment hudElement$Alignment2 = calculateAlignment;
                        final boolean b = ((Enum)hudElement$Alignment).equals(hudElement$Alignment2);
                        if (true) {
                            break Label_0066;
                        }
                        break Label_0088;
                    }
                    catch (final IllegalArgumentException ex2) {
                        ex2.printStackTrace();
                    }
                    try {
                        final HudElement$Alignment hudElement$Alignment = this.alignment;
                        final HudElement$Alignment hudElement$Alignment2 = calculateAlignment;
                        final boolean b = ((Enum)hudElement$Alignment).equals(hudElement$Alignment2);
                        if (true) {
                            final HudElement$Alignment alignment = calculateAlignment;
                            this.correctPosition(this.alignment, calculateAlignment);
                            this.alignment = alignment;
                        }
                    }
                    catch (final IllegalArgumentException ex3) {
                        throw a((Throwable)ex3);
                    }
                }
            }
            hudElement = this;
        }
        ((IHudElement)hudElement).renderContent(renderContext, n, n2);
    }
    
    public void setToggled(boolean b2) {
        final long n = HudElement.f606 ^ 0x5C105AC14A5L;
        final String[] \u0254 = \u0254();
        boolean b = this.\u01a9;
        Label_0042: {
            boolean b3;
            try {
                final boolean \u0283;
                b3 = (\u0283 = this.\u01a9);
                if (\u0254 != null) {
                    break Label_0042;
                }
                final boolean b4 = b2;
                if (false) {
                    return;
                }
                break Label_0042;
            }
            catch (final Throwable t) {
                t.printStackTrace();
            }
            try {
                final boolean b4 = b2;
                if (false) {
                    return;
                }
            }
            catch (final Throwable t2) {
                t2.printStackTrace();
            }
            try {
                final boolean \u0283 = b2;
                try {
                    if (\u0283) {
                        this.onEnable();
                        return;
                    }
                }
                catch (final Throwable t3) {
                    t3.printStackTrace();
                }
                this.onDisable();
            }
            catch (final Throwable t4) {
                ((ILog)this.getLogger()).error("Error while toggling hud element {0}", new Object[] { this.getName(), t4 });
            }
        }
    }
    
    public double getStartY() {
        final long n = HudElement.f606 ^ 0x1A87F3804E29L;
        double y = this.getY();
        double n2 = 0.0;
        try {
            switch (((Enum)this.getAlignment()).ordinal()) {
                case 0:
                case 1:
                case 2: {
                    n2 = y;
                    break;
                }
                case 3:
                case 4: {
                    return y - this.getScaledHeight();
                }
                default: {
                    return y;
                }
            }
        }
        catch (final IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return n2 + 0.0;
    }
    
    public static HudElement$Alignment calculateAlignment(final HudElement p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          5263112998043
        //     6: lxor           
        //     7: lstore_1       
        //     8: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.\u0254:()[Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_0        
        //    13: aload_3        
        //    14: ifnonnull       115
        //    17: getfield        org/rusherhack/client/api/feature/hud/HudElement.\u00cb:Lorg/rusherhack/client/api/feature/hud/HudElement$SnapPoint;
        //    20: ifnull          114
        //    23: goto            30
        //    26: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    29: athrow         
        //    30: aload_0        
        //    31: getfield        org/rusherhack/client/api/feature/hud/HudElement.\u00cb:Lorg/rusherhack/client/api/feature/hud/HudElement$SnapPoint;
        //    34: invokevirtual   java/lang/Enum.ordinal:()I
        //    37: tableswitch {
        //                0: 90
        //                1: 98
        //                2: 102
        //                3: 106
        //                4: 110
        //          default: 76
        //        }
        //    72: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    75: athrow         
        //    76: new             Ljava/lang/MatchException;
        //    79: dup            
        //    80: aconst_null    
        //    81: dup            
        //    82: invokespecial   java/lang/MatchException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    85: athrow         
        //    86: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    89: athrow         
        //    90: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //    93: areturn        
        //    94: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    97: athrow         
        //    98: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_CENTER:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   101: areturn        
        //   102: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   105: areturn        
        //   106: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   109: areturn        
        //   110: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   113: areturn        
        //   114: aload_0        
        //   115: invokevirtual   org/rusherhack/client/api/ui/ScaledElementBase.getScaledHeight:()D
        //   118: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   121: invokevirtual   net.minecraft.client.MinecraftClient.getWindow:()Lnet.minecraft.client.util.Window;
        //   124: invokevirtual   net.minecraft.client.util.Window.getScaledHeight:()I
        //   127: i2d            
        //   128: aload_3        
        //   129: ifnonnull       169
        //   132: dcmpl          
        //   133: ifle            152
        //   136: goto            143
        //   139: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   142: athrow         
        //   143: aload_0        
        //   144: getfield        org/rusherhack/client/api/feature/hud/HudElement.alignment:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   147: areturn        
        //   148: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   151: athrow         
        //   152: aload_0        
        //   153: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getX:()D
        //   156: aload_0        
        //   157: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getStartY:()D
        //   160: aload_0        
        //   161: invokevirtual   org/rusherhack/client/api/ui/ScaledElementBase.getScaledHeight:()D
        //   164: ldc2_w          2.0
        //   167: ddiv           
        //   168: dadd           
        //   169: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.calculateAlignment:(DD)Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   172: areturn        
        //    StackMapTable: 00 12 FF 00 1A 00 03 07 00 02 04 07 00 67 00 01 07 00 3D 03 69 07 00 3D 03 49 07 00 3D 03 43 07 00 3D 03 03 03 03 03 40 07 00 02 57 07 00 3D 03 44 07 00 3D 03 FF 00 10 00 03 07 00 02 04 07 00 67 00 02 03 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     23     26     30     Ljava/lang/IllegalArgumentException;
        //  17     72     72     76     Ljava/lang/IllegalArgumentException;
        //  30     86     86     90     Ljava/lang/IllegalArgumentException;
        //  93     94     94     98     Ljava/lang/IllegalArgumentException;
        //  115    136    139    143    Ljava/lang/IllegalArgumentException;
        //  132    148    148    152    Ljava/lang/IllegalArgumentException;
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
    
    public void correctPosition(final HudElement$Alignment p0, final HudElement$Alignment p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          29588047387480
        //     6: lxor           
        //     7: lstore_3       
        //     8: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.\u0254:()[Ljava/lang/String;
        //    11: astore          5
        //    13: aload_0        
        //    14: aload_1        
        //    15: astore_0       
        //    16: astore_1       
        //    17: aload_0        
        //    18: aload_1        
        //    19: dup            
        //    20: invokevirtual   org/rusherhack/client/api/ui/ScaledElementBase.getScaledWidth:()D
        //    23: dstore          6
        //    25: invokevirtual   org/rusherhack/client/api/ui/ScaledElementBase.getScaledHeight:()D
        //    28: dstore          8
        //    30: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //    33: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //    36: aload           5
        //    38: ifnonnull       91
        //    41: ifne            80
        //    44: goto            51
        //    47: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    50: athrow         
        //    51: aload_0        
        //    52: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //    55: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //    58: aload           5
        //    60: ifnonnull       95
        //    63: goto            70
        //    66: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    69: athrow         
        //    70: ifeq            94
        //    73: goto            80
        //    76: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    79: athrow         
        //    80: iconst_1       
        //    81: dup            
        //    82: dup            
        //    83: pop2           
        //    84: goto            91
        //    87: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    90: athrow         
        //    91: goto            98
        //    94: iconst_0       
        //    95: iconst_1       
        //    96: dup            
        //    97: pop2           
        //    98: istore          10
        //   100: aload_0        
        //   101: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   104: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   107: aload           5
        //   109: ifnonnull       162
        //   112: ifne            151
        //   115: goto            122
        //   118: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   121: athrow         
        //   122: aload_0        
        //   123: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   126: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   129: aload           5
        //   131: ifnonnull       166
        //   134: goto            141
        //   137: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   140: athrow         
        //   141: ifeq            165
        //   144: goto            151
        //   147: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   150: athrow         
        //   151: iconst_1       
        //   152: dup            
        //   153: dup            
        //   154: pop2           
        //   155: goto            162
        //   158: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   161: athrow         
        //   162: goto            169
        //   165: iconst_0       
        //   166: iconst_1       
        //   167: dup            
        //   168: pop2           
        //   169: istore          11
        //   171: aload_0        
        //   172: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   175: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   178: aload           5
        //   180: ifnonnull       233
        //   183: ifne            222
        //   186: goto            193
        //   189: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   192: athrow         
        //   193: aload_0        
        //   194: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   197: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   200: aload           5
        //   202: ifnonnull       237
        //   205: goto            212
        //   208: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   211: athrow         
        //   212: ifeq            236
        //   215: goto            222
        //   218: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   221: athrow         
        //   222: iconst_1       
        //   223: dup            
        //   224: dup            
        //   225: pop2           
        //   226: goto            233
        //   229: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   232: athrow         
        //   233: goto            240
        //   236: iconst_0       
        //   237: iconst_1       
        //   238: dup            
        //   239: pop2           
        //   240: istore          12
        //   242: aload_0        
        //   243: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   246: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   249: aload           5
        //   251: ifnonnull       304
        //   254: ifne            293
        //   257: goto            264
        //   260: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   263: athrow         
        //   264: aload_0        
        //   265: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   268: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   271: aload           5
        //   273: ifnonnull       308
        //   276: goto            283
        //   279: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   282: athrow         
        //   283: ifeq            307
        //   286: goto            293
        //   289: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   292: athrow         
        //   293: iconst_1       
        //   294: dup            
        //   295: dup            
        //   296: pop2           
        //   297: goto            304
        //   300: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   303: athrow         
        //   304: goto            311
        //   307: iconst_0       
        //   308: iconst_1       
        //   309: dup            
        //   310: pop2           
        //   311: istore          13
        //   313: iload           11
        //   315: aload           5
        //   317: ifnonnull       403
        //   320: ifeq            402
        //   323: goto            330
        //   326: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   329: athrow         
        //   330: aload_2        
        //   331: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   334: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   337: aload           5
        //   339: ifnonnull       399
        //   342: goto            349
        //   345: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   348: athrow         
        //   349: ifne            388
        //   352: goto            359
        //   355: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   358: athrow         
        //   359: aload_2        
        //   360: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   363: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   366: aload           5
        //   368: ifnonnull       403
        //   371: goto            378
        //   374: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   377: athrow         
        //   378: ifeq            402
        //   381: goto            388
        //   384: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   387: athrow         
        //   388: iconst_1       
        //   389: dup            
        //   390: dup            
        //   391: pop2           
        //   392: goto            399
        //   395: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   398: athrow         
        //   399: goto            406
        //   402: iconst_0       
        //   403: iconst_1       
        //   404: dup            
        //   405: pop2           
        //   406: istore_0       
        //   407: iload           10
        //   409: aload           5
        //   411: ifnonnull       497
        //   414: ifeq            496
        //   417: goto            424
        //   420: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   423: athrow         
        //   424: aload_2        
        //   425: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   428: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   431: aload           5
        //   433: ifnonnull       493
        //   436: goto            443
        //   439: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   442: athrow         
        //   443: ifne            482
        //   446: goto            453
        //   449: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   452: athrow         
        //   453: aload_2        
        //   454: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   457: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   460: aload           5
        //   462: ifnonnull       497
        //   465: goto            472
        //   468: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   471: athrow         
        //   472: ifeq            496
        //   475: goto            482
        //   478: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   481: athrow         
        //   482: iconst_1       
        //   483: dup            
        //   484: dup            
        //   485: pop2           
        //   486: goto            493
        //   489: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   492: athrow         
        //   493: goto            500
        //   496: iconst_0       
        //   497: iconst_1       
        //   498: dup            
        //   499: pop2           
        //   500: istore          10
        //   502: iload           13
        //   504: aload           5
        //   506: ifnonnull       592
        //   509: ifeq            591
        //   512: goto            519
        //   515: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   518: athrow         
        //   519: aload_2        
        //   520: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   523: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   526: aload           5
        //   528: ifnonnull       588
        //   531: goto            538
        //   534: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   537: athrow         
        //   538: ifne            577
        //   541: goto            548
        //   544: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   547: athrow         
        //   548: aload_2        
        //   549: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.TOP_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   552: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   555: aload           5
        //   557: ifnonnull       592
        //   560: goto            567
        //   563: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   566: athrow         
        //   567: ifeq            591
        //   570: goto            577
        //   573: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   576: athrow         
        //   577: iconst_1       
        //   578: dup            
        //   579: dup            
        //   580: pop2           
        //   581: goto            588
        //   584: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   587: athrow         
        //   588: goto            595
        //   591: iconst_0       
        //   592: iconst_1       
        //   593: dup            
        //   594: pop2           
        //   595: istore          11
        //   597: iload           12
        //   599: aload           5
        //   601: ifnonnull       687
        //   604: ifeq            686
        //   607: goto            614
        //   610: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   613: athrow         
        //   614: aload_2        
        //   615: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_LEFT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   618: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   621: aload           5
        //   623: ifnonnull       683
        //   626: goto            633
        //   629: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   632: athrow         
        //   633: ifne            672
        //   636: goto            643
        //   639: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   642: athrow         
        //   643: aload_2        
        //   644: getstatic       org/rusherhack/client/api/feature/hud/HudElement$Alignment.BOTTOM_RIGHT:Lorg/rusherhack/client/api/feature/hud/HudElement$Alignment;
        //   647: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   650: aload           5
        //   652: ifnonnull       687
        //   655: goto            662
        //   658: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   661: athrow         
        //   662: ifeq            686
        //   665: goto            672
        //   668: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   671: athrow         
        //   672: iconst_1       
        //   673: dup            
        //   674: dup            
        //   675: pop2           
        //   676: goto            683
        //   679: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   682: athrow         
        //   683: goto            690
        //   686: iconst_0       
        //   687: iconst_1       
        //   688: dup            
        //   689: pop2           
        //   690: istore          12
        //   692: iload_0        
        //   693: aload           5
        //   695: ifnonnull       728
        //   698: ifeq            726
        //   701: goto            708
        //   704: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   707: athrow         
        //   708: aload_1        
        //   709: dup            
        //   710: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getX:()D
        //   713: dload           6
        //   715: dsub           
        //   716: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.setX:(D)V
        //   719: goto            726
        //   722: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   725: athrow         
        //   726: iload           10
        //   728: aload           5
        //   730: ifnonnull       763
        //   733: ifeq            761
        //   736: goto            743
        //   739: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   742: athrow         
        //   743: aload_1        
        //   744: dup            
        //   745: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getX:()D
        //   748: dload           6
        //   750: dadd           
        //   751: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.setX:(D)V
        //   754: goto            761
        //   757: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   760: athrow         
        //   761: iload           11
        //   763: aload           5
        //   765: ifnonnull       798
        //   768: ifeq            796
        //   771: goto            778
        //   774: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   777: athrow         
        //   778: aload_1        
        //   779: dup            
        //   780: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getY:()D
        //   783: dload           8
        //   785: dsub           
        //   786: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.setY:(D)V
        //   789: goto            796
        //   792: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   795: athrow         
        //   796: iload           12
        //   798: ifeq            819
        //   801: aload_1        
        //   802: dup            
        //   803: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.getY:()D
        //   806: dload           8
        //   808: dadd           
        //   809: invokevirtual   org/rusherhack/client/api/feature/hud/HudElement.setY:(D)V
        //   812: goto            819
        //   815: invokestatic    org/rusherhack/client/api/feature/hud/HudElement.a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   818: athrow         
        //   819: return         
        //    StackMapTable: 00 79 FF 00 2F 00 07 07 00 11 07 00 02 07 00 11 04 07 00 67 03 03 00 01 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 46 07 00 3D 43 01 02 40 01 42 01 FF 00 13 00 08 07 00 11 07 00 02 07 00 11 04 07 00 67 03 03 01 00 01 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 46 07 00 3D 43 01 02 40 01 42 01 FF 00 13 00 09 07 00 11 07 00 02 07 00 11 04 07 00 67 03 03 01 01 00 01 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 46 07 00 3D 43 01 02 40 01 42 01 FF 00 13 00 0A 07 00 11 07 00 02 07 00 11 04 07 00 67 03 03 01 01 01 00 01 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 46 07 00 3D 43 01 02 40 01 42 01 FF 00 0E 00 0B 07 00 11 07 00 02 07 00 11 04 07 00 67 03 03 01 01 01 01 00 01 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 46 07 00 3D 43 01 02 40 01 42 01 FF 00 0D 00 0B 01 07 00 02 07 00 11 04 07 00 67 03 03 01 01 01 01 00 01 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 46 07 00 3D 43 01 02 40 01 42 01 4E 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 46 07 00 3D 43 01 02 40 01 42 01 4E 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 4E 07 00 3D 43 01 45 07 00 3D 03 46 07 00 3D 43 01 02 40 01 42 01 4D 07 00 3D 03 4D 07 00 3D 03 41 01 4A 07 00 3D 03 4D 07 00 3D 03 41 01 4A 07 00 3D 03 4D 07 00 3D 03 41 01 50 07 00 3D 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  30     44     47     51     Ljava/lang/IllegalArgumentException;
        //  41     63     66     70     Ljava/lang/IllegalArgumentException;
        //  51     73     76     80     Ljava/lang/IllegalArgumentException;
        //  70     84     87     91     Ljava/lang/IllegalArgumentException;
        //  100    115    118    122    Ljava/lang/IllegalArgumentException;
        //  112    134    137    141    Ljava/lang/IllegalArgumentException;
        //  122    144    147    151    Ljava/lang/IllegalArgumentException;
        //  141    155    158    162    Ljava/lang/IllegalArgumentException;
        //  171    186    189    193    Ljava/lang/IllegalArgumentException;
        //  183    205    208    212    Ljava/lang/IllegalArgumentException;
        //  193    215    218    222    Ljava/lang/IllegalArgumentException;
        //  212    226    229    233    Ljava/lang/IllegalArgumentException;
        //  242    257    260    264    Ljava/lang/IllegalArgumentException;
        //  254    276    279    283    Ljava/lang/IllegalArgumentException;
        //  264    286    289    293    Ljava/lang/IllegalArgumentException;
        //  283    297    300    304    Ljava/lang/IllegalArgumentException;
        //  313    323    326    330    Ljava/lang/IllegalArgumentException;
        //  320    342    345    349    Ljava/lang/IllegalArgumentException;
        //  330    352    355    359    Ljava/lang/IllegalArgumentException;
        //  349    371    374    378    Ljava/lang/IllegalArgumentException;
        //  359    381    384    388    Ljava/lang/IllegalArgumentException;
        //  378    392    395    399    Ljava/lang/IllegalArgumentException;
        //  407    417    420    424    Ljava/lang/IllegalArgumentException;
        //  414    436    439    443    Ljava/lang/IllegalArgumentException;
        //  424    446    449    453    Ljava/lang/IllegalArgumentException;
        //  443    465    468    472    Ljava/lang/IllegalArgumentException;
        //  453    475    478    482    Ljava/lang/IllegalArgumentException;
        //  472    486    489    493    Ljava/lang/IllegalArgumentException;
        //  502    512    515    519    Ljava/lang/IllegalArgumentException;
        //  509    531    534    538    Ljava/lang/IllegalArgumentException;
        //  519    541    544    548    Ljava/lang/IllegalArgumentException;
        //  538    560    563    567    Ljava/lang/IllegalArgumentException;
        //  548    570    573    577    Ljava/lang/IllegalArgumentException;
        //  567    581    584    588    Ljava/lang/IllegalArgumentException;
        //  597    607    610    614    Ljava/lang/IllegalArgumentException;
        //  604    626    629    633    Ljava/lang/IllegalArgumentException;
        //  614    636    639    643    Ljava/lang/IllegalArgumentException;
        //  633    655    658    662    Ljava/lang/IllegalArgumentException;
        //  643    665    668    672    Ljava/lang/IllegalArgumentException;
        //  662    676    679    683    Ljava/lang/IllegalArgumentException;
        //  692    701    704    708    Ljava/lang/IllegalArgumentException;
        //  698    719    722    726    Ljava/lang/IllegalArgumentException;
        //  728    736    739    743    Ljava/lang/IllegalArgumentException;
        //  733    754    757    761    Ljava/lang/IllegalArgumentException;
        //  763    771    774    778    Ljava/lang/IllegalArgumentException;
        //  768    789    792    796    Ljava/lang/IllegalArgumentException;
        //  798    812    815    819    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    public boolean isListening() {
        final long n = HudElement.f606 ^ 0xCCED8882DEDL;
        return this.\u01a9;
    }
    
    public void mouseReleased(final double n, final double n2, final int n3) {
        final long n4 = HudElement.f606 ^ 0x7B10F73BC491L;
        final String[] \u0254 = \u0254();
        Label_0041: {
            try {
                final int dragging;
                final boolean b = (dragging = (this.isDragging() ? 1 : 0)) != 0;
                if (\u0254 != null) {
                    break Label_0041;
                }
                if (!b) {
                    return;
                }
            }
            catch (final IllegalArgumentException ex) {
                ex.printStackTrace();
            }
            int dragging = n3;
            try {
                if (dragging == 0) {
                    this.\u04e9 = false;
                }
            }
            catch (final IllegalArgumentException ex2) {
                ex2.printStackTrace();
            }
        }
    }
    
    public void setY(double y) {
        final long n = HudElement.f606 ^ 0x4DB1005DFBA4L;
        y /= Globals.mc.getWindow().getScaledHeight();
        super.setY(y);
    }
    
    public void onEnable() {
        final long n = HudElement.f606 ^ 0x22B14024C7D1L;
        this.\u01a9 = true;
    }
    
    public void postRender(final RenderContext renderContext, final double n, final double n2) {
    }
    
    public String getDescription() {
        final long n = HudElement.f606 ^ 0x1230160E7C0EL;
        return this.P;
    }
    
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        final long n4 = HudElement.f606 ^ 0x217D38701663L;
        final String[] \u0254 = \u0254();
        Label_0036: {
            try {
                final int n5 = n3;
                if (\u0254 != null) {
                    return n5 != 0;
                }
                if (n3 == 0) {
                    break Label_0036;
                }
                return false;
            }
            catch (final IllegalArgumentException ex) {
                ex.printStackTrace();
            }
            try {
                if (n3 == 0) {
                    final boolean b = true;
                    final HudElement$SnapPoint \u00eb = null;
                    final boolean \u04e9 = true;
                    this.\u042a = n - this.getStartX();
                    this.\u0145 = n2 - this.getStartY();
                    this.\u04e9 = \u04e9;
                    this.\u00cb = \u00eb;
                    return b;
                }
            }
            catch (final IllegalArgumentException ex2) {
                ex2.printStackTrace();
            }
        }
        final int n5 = 0;
        return n5 != 0;
    }
    
    public static void m1391(final String[] f605) {
        HudElement.f605 = f605;
    }
    
    public static String[] m1392() {
        return HudElement.f605;
    }
    
    static {
        try {
        f606 = Class066.m4320(211926153598040443L, -336696742382341446L, (Object)MethodHandles.lookup().lookupClass()).m4325(41030451935628L);
        final long n = HudElement.f606 ^ 0x3F8F243A587AL;
        f610 = new Object[138];
        f611 = new String[138];
        m1399();
        final String[] array = null;
        f609 = new HashMap(13);
        final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        final int opmode = 2;
        final SecretKeyFactory instance2 = SecretKeyFactory.getInstance("DES");
        final byte[] key = new byte[8];
        key[0] = (byte)(n >>> 56);
        for (int i = 1; i < 8; ++i) {
            key[i] = (byte)(n << i * 8 >>> 56);
        }
        instance.init(opmode, instance2.generateSecret(new DESKeySpec(key)), new IvParameterSpec(new byte[8]));
        final String[] f612 = new String[20];
        int n2 = 0;
        String s;
        int n3 = (s = """
                      (\u00f70\u0018·\u00fbº\u0096\u00e4\u0000\u008c>\u00c6\u00dfp>\u00104\u0000\u0007\r±\u00db\u0096S\u00ca\u00f4\u00c5¨\u00f7\u0004?\u0081\u0010]\u0094\u00f6B\u00ce\u008a¿I\u0090\u00e2\u0080\u00d9\u00fdµ\u00ecl\u0018\u0088½\u0010\u00f2oX\u00ad\u00c4\u0097"\u0016,\u0006T%\u0091<\u00fb%\u00fc\u00c6%\u00c0%@\u00ea-\u0018/©º\u0004§\u00f2c!\u008aS\u0018Q\u000b\u00d4i\u00e7T;\u001a'\u0093\u0019q,\u00e1®£\u001d8µa\u007f\u00f7\u0093\u00d4\u00e0\u009a´<\u00c7£aUGn^.k\u00d2\u0005\u008fbµ\u0086\u00ec\u00c4,\u007fa\u0014\u00c0\u0010\u00c0wz*\u00df\u00f6C\u0004pAd»\u00f2\u00d1\u00ca&\u0010\u00d3\u00d2o\u0088\u0014¸Gl\u00e4\u00d6\u0005$\u008bs-\u008c\u0010\u0090\u00f4¾\u0004s\u0010\u00d1H\u0089\u00d2\u00fc\u00f8\u00c5»\u0004\u0015\u0010\u009c¤#\u0083r\u008bmªAu\u0006\u0083¤U\u0015\u00e4\u0010\u00e3\u0096\u000b\u0087°	IC\u00fe\u00c2\u0012\u00c9J \u001b\u00e3\u0010\u0085\u0096\u00fa£j\\u001d<uY\u00c4mK-\u00f3©\u0010*\u0099\u0099DO\u00ca\u00d8\u001eg\u0086\u00d0©¢A\u00d7\u0002 \u009b\u0006\u0081\u00f4¾\u00c6\u0090]\u0096¦\u0004¼\u00e7}\u0085\u0019~H@\u001c
                      \u0003\u00f8\u00e1\u00f6q²$\u008f'\u00eb£\u0018\u008c\u00ce^\u00f8S3\u00fd\u00dcS\u007fu5\u00e3\u00f7\u0091\u00dd\u00e3\u0085\u0095\u00faS\r7Z8C¼\u00dd<<\u00c5
                      \u00cc\u00ddb7\u00e3\u00f3\u00eehr\u00ff\u00c2§\u00ff\u00ce!\u008f§\u00c4\u000b\u008f\u008a\u00ea\u00f3\u00f3\u00e5V\u00db2\u00c7\u00fb\f»Xk\u00d9\u00ee\u00eck» \u00eb¾\u00d2Wª¦
                      \u00ad\u0016\u0018º§-¢GD\u009b\u008a\u0096x\u00e7¸\b\u0000<N\u00e0+«O\u0096\u0081\u00ef\u0001 ³\u00cf\u0096	t\u00c8\u0090\u008a-`\u00cea\u00ca£\u0096\u001e\u00d7Ojo»zAhk\u00f8\u00fd\u00ebC_$\u0085\u0010\u00ad\u00e3\u001d\u0019t\u00d4a\u0086\u0012\u00e86\u0086\u00f2O\u00c8\u008a""").length();
        int n4 = 16;
        int n5 = -1;
    Label_0181:
        while (true) {
            while (true) {
                ++n5;
                final String s2 = s;
                final int beginIndex = n5;
                String s3 = s2.substring(beginIndex, beginIndex + n4);
                int n6 = -1;
                while (true) {
                    final String intern = m171(instance.doFinal(s3.getBytes("ISO-8859-1"))).intern();
                    switch (n6) {
                        default: {
                            f612[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                continue Label_0181;
                            }
                            n3 = (s = "\u00eb>|¢g\u008f¢\u00e3\\3§\u00e6\"\u00c2N\u0014}W\u0099\u00f9\u0080$]W\u00ed\u001b\u008av\u009d¿V±\u0010\u0084\u009c\u00d5¤±\u00d1p\u00c3\u0013Up\u0087\u00f7>Y\u0085").length();
                            n4 = 32;
                            n5 = -1;
                            break;
                        }
                        case 0: {
                            f612[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                break;
                            }
                            break Label_0181;
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
        f607 = f612;
        f608 = new String[20];
    
        } catch (Exception exception) {
            throw new ExceptionInInitializerError(exception);
        }
    }

   public static String[] \u0254() { return new String[0]; }

   public HudElement() { this(""); }

   private static IllegalStateException a(Throwable t) { return new IllegalStateException(t); }


    private static String m171(final byte[] array) {
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

    private static void m1399() {
        final Object[] f610 = HudElement.f610;
        f610[0] = "V\u001d,+v`J\u0007.wltZ\u0004efh|\\\u0001?+eePA-`eaL\u001d.+l`]A\u0003p`PU\n&`ja";
        f610[1] = "\u0019gaPD*\u0005}c\f^>\u0015~(\u001dZ6\u0013{rPW/\u001f;`\u001bW+\u0003gcP^*\u0012;N\u000bR\u001a\u001apk\u001bX+RTj\u0017Q1\u001bph\n";
        f610[2] = "_j1dr=Te +\u000f%Gb)b";
        f610[3] = ":\u007fv\u0006Gy:\u007faZKv 4aDKc'E1\u0019\u001a";
        f610[4] = ".xs\u0005\r\u0014.xdY\u0001\u001b43dG\u0001\u000e3B6\u001bTL";
        f610[5] = "b{d3?\u0004itu|E\u0000zue3s\u0004m";
        f610[6] = Double.TYPE;
        HudElement.f611[6] = "java/lang/Double";
        f610[7] = ">I~{v\u000b\"S|'l\u001f2P76h\u00174Um{e\u000e8\u0015l<*-2Zu0`;=^t0j\n\u0013Zj0";
        f610[8] = "I\u001dq1\"E<=z>3\nA%i9:C)";
        f610[9] = ".\u001f4w|G2\u00056+fS\"\u0006}:b[$\u0003'woB(C5<oF4\u001f6wfG%C\u001b,jw-\b><`Fe>=8~b.\u0004=-";
        f610[10] = Integer.TYPE;
        HudElement.f611[10] = "java/lang/Integer";
        f610[11] = "5\f\u007f!\u0007L)\u0016}}\u001dX9\u00156l\u0019P?\u0010l!\u0014I3P_c\u001a[;\u0012k";
        f610[12] = Boolean.TYPE;
        HudElement.f611[12] = "java/lang/Boolean";
        f610[13] = Void.TYPE;
        HudElement.f611[13] = "java/lang/Void";
        f610[14] = "\\o^\\K!@u\\\u0000Q5Pv\u0017\u0011U=VsM\\X$Z3k\u0007J<Voq\u0013Z?rMp";
        f610[15] = "\u001dR!CG{\u0001H#\u001f]o\u0011Kh\u000eYg\u0017N2CT~\u001b\u000e5\u0014Fz\u0017Mh+Z`\u0006S";
        f610[16] = "r\u000e-\t\u0003\u0001n\u0014/U\u0019\u0015~\u0017dD\u001d\u001dx\u0012>\t\u0010\u0004tR8B\u001f\u0010x\u000edA\u001e\u001aiR\u0003a\u001e\u001ai./I\u0015\u0011o\u00198";
        f610[17] = "fb\u0007W)?zx\u0005\u000b3+j{N\u001a48l>\f\u0016<-`~\u0007W\u0012\u0006fw\u0007\u001c)";
        f610[18] = "\u0016bUJ\u00079\nxW\u0016\u001d-\u001a{\u001c\u0007\u001a>\u001c>^\u000b\u0012+\u0010~UJ<\u0000\u0016w";
        f610[19] = "n>x'}_\u001b\u001es(l\u0010z\u0010x#hJ\u000e";
        f610[20] = "\u0011[<M\rd\rA>\u0011\u0017p\u001dBu\u0000\u0010c\u001b\u0007.\u0017\u0016}\r\u0007\r\u0006\rb\u0017F5";
        f610[21] = ";K_9\u0017>'Q]e\r*7R\u0016t\t\"1WL9\u0004;=\u0017M~K#!]\u0016_\u0010/\u001cXVs\t.&{Yd\u0000";
        f610[22] = "1]c)S7-GauI#=D*dM+;Ap)@27\u0001qn\u000f66Jib\u000f\u000b\nGajD\u000f?Ae`D0";
        f610[23] = "m2'-*\u001es:=bM\u001fb!08k\u0019";
        f610[24] = "e;n\nCxn4\u007fE\"ve?{\u001f";
        f610[25] = "\u0011\u0013\u001ce\u0013\u001b\u001d\u001b\u001d.Z\u0013\u0001\u0013\u001fe>\u0007\u001d\u00124'\u0011\u0019\u0017\u0012\u0005";
        f610[26] = "+O\bN\u000e)7U\n\u0012\u0014='VA\u0003\u0013.!\u0013\u001c\u0005\b(-S\bN/90I\u0006\u000e\u001b";
        f610[27] = "\u0001\"#\u00106\f\u001d8!L,\u0018\r;j]+\u000b\u000b~'Q)\u0014\u000f> \u0010%\u000b\t%)[*\r@\u00030L-\u0017\t\u0013%N0\f\u001c5";
        f610[28] = "\u000e\u00144j\u0003-\u0002\u001c5!J%\u001e\u00147j.1\u0002\u0015\u00186\u0016#\u0014";
        f610[29] = "?Vx\t\u0006B#LzU\u001cV3O1D\u001bE5\nyB\u0015C%Vz\t=q5EkR\u0006R\u0013KqA\u001dP%V~E\u0018R";
        f610[30] = "7EP\u000fet;MQD,|'ES\u000fHh;DrCh~7^";
        f610[31] = "\u0011u3Eq3\ro1\u0019k'\u001dlz\bo/\u001bi Eb6\u0017)6\u0002m\"PN\u0016\u0002m\"3f:\nd#\f";
        f610[32] = "\u0010X4\"6\u0010\fB6~,\u0004\u001cA}o+\u0017\u001a\u00041e*\u0001Qc\u0011e*\u0001\u001eH?i";
        f610[33] = "L!*\u0000t69\u0001!\u000feyD\u00192\bl0,";
        f610[34] = "s\u001f\u0015xRZo\u0005\u0017$HN\u007f\u0006\\5LFy\u0003\u0006xA_uC\u00143A[i\u001f\u0017xHZxC;\u001eUKY\u0001\u0017;EAh";
        f610[35] = "\\<r?0:@&pc*.P%;r.&V a?#?Z`gt,+V<;C'!W+gR-!G+me";
        f610[36] = "]0G\u0003{2A*E_a&Q)\u000eNe.W,T\u0003h7[lSTz3W/\u000edA2V\u000fACh W0";
        f610[37] = "L@\u0010\u001e+<9`\u001b\u0011:sXn\u0010\u001a>),";
        f610[38] = "B@\u001b#NE\\H\u0001l,Y[U";
        f610[39] = "N\"(9/\bE-9vC\u000bK/;9o";
        f610[40] = "@i\u0017b/oKf\u0006-OvGj\u0004q";
        f610[41] = "(U7\u0014UB#Z&[?A7V-\u0010";
        f610[42] = "{\u007fp2[y)lp`bw*q\u0012h\u000b|*a\u0016b\u000ed'\ru>\u0019':|rj\\gG";
        f610[43] = "$\u0010\u0017\u001b:\u00051R\u0003\u0006X\u00071g\u000b\u001b=\u000b,V/\u0011&\u000b0G\u0003ve\u0000%U\u0015\u0010=\u001ez*SK#Y7[T\u001ff\u0019J\u0016R\rg\u001b;\u0011\u0006H'fzE^N#\u001b+V\u0017\u001cX";
        f610[44] = "f\u0016\fq\u001c\u0011}\u0016\u0000;|\u0002u\u0016\u0001&;\u0012\u001cB\u0013zD\u0007a\u0013\u00003\u0016|f\u0016\fq\u001c\u0011}\u0016\u0000;|";
        f610[45] = "\u0004D?/\u0000N\\Z`P\u0015EErPlGS\u0006_!k\u0013\u0016F\"";
        f610[46] = "M\u0005hZMy\u0015\u001b7%Xr\f'`JXr\ncmTK'\u000e\u0007w\u0014Y'p";
        f610[47] = "\u0001H\bh=P\u0000I\u0019y\\\b\u000fKfp1\u0019\u0011Y\u001en8Z\\'W\u007ff\u0011[L\u0019(<\u0002c";
        f610[48] = "b\u0015nj|6:\u000b1\u0015i=#:eti6:\u001egi\u0006id\u001ds%zl%\r:\u0015";
        f610[49] = "s\u001a\u001cg\u0001npG\u00126ov{H+|\bgz^\u000fwo%/[\u000fy\u0017$wA\u0016\u0006\u0014tsG\u001f:_rf\u0019s7\u0000%g\u001c\u0018yW\u007ft$";
        f610[50] = "Fdb\f\u0019YRao\u0001vLN3j\u0005\n[Y\\n\u0015\u0016\u000fN<uCLV#mdD\u0006\u000eH#3\u001e\u00156";
        f610[51] = "A\n&^5qBW(\u000f[iIX\u0011E<xHN5N[:\u001dK5@#;EQ,?!dU\u000e)R:dYDI\u000e4:U\f\"@c`F4";
        f610[52] = "]\u000e&8\u0017l\u0005\u0010yG\u0002g\u001c35.\u0017v0huz\u00165\u001d\u0019r.Su`";
        f610[53] = "p\fz\u0012}~>Yo\r\u001dg4\u0005q\u0014tdNV{J|c?\u0016i\u0003c\u0000";
        f610[54] = "\u0007\u0006X;CR_\u0018\u0007DUYA\rM%PP[\u0012ZDYYB\u0012I<GP\u0001_7tV\u0005\u0002\u001bJ%ELP`";
        f610[55] = "nY\u001c\u001c;p \f\t\u0003[p9X\u000b\u0011\u001c`P\u0006N\u0003'q(\u0007\u0016\u0019>\u000enY\u001c\u001c;p \f\t\u0003[";
        f610[56] = """
                   \u000f{\u0003U2=\u0010}\\UJ(\u0003c\u000f\u0010+-
                   y\u0010\u0007J$\u0003`\u0010\u00142:
                   #]jz+_ \u0019\u0017+8\u0016rb""";
        f610[57] = "5]a+U#6\u0000oz;;=\u000fV0\\*<\u0019r;;hi\u001cr5Ci1\u0006kJ\u0001j.\u001fq2\u000024\u0006\u000e{Th![e5\u000322c";
        f610[58] = "6cSm\t3n}\f\u0012\u0018<onAv\u001a)fLXs\u001c3nhZnshmjCh\u00150s5<+H;y5@.\t+0\u0005";
        f610[59] = "\"rM8t\u0001'3]qD\u001br,NJ~Ed5\\2\u007f\u001d~,#";
        f610[60] = """
                   llqCJq4r.<Kz-VyS_s<f\u001e\f_&iqc]Lo;
                   /S
                   giaa\u0004PtQ""";
        f610[61] = "o^62=R7@iM\u010a4n\u0005\"r:EiQg2";
        f610[62] = "\"_@YV$zA\u001f&\u040eB#\u0004T\u0019Q3$P\u0011Y";
        f610[63] = "5={_$\u00130-{\u0005\u001cC&;-Dql;9+Uf(fn;DcPg6!]\u001cB-*|FxXm8|8";
        f610[64] = "\u0000D,]IyXZs\"\u026f\u001f[B(HR.\rG#[3";
        f610[65] = "\u001e+*&\u000eeBby%va\bj$fv6Jo?c\u000e7\u0012u&\u001c\u000eu\u0012`(z\nq\u001d{C-\u00196\u0002((cNl\u0011\u0010";
        f610[66] = "e\u0006.zX2=\u0018q\u0005M9$&(`OTbX>y],c\u0000$`\"";
        f610[67] = "K}|)H5\u0013c#VN4\u0019tw;2b\u0019!cnY,N{pV";
        f610[68] = "d\u0001\u000718k<\u001fXN-`%<\u0014'8q\bgTs92$\u0016S'|rY";
        f610[69] = "72o\u001aB\u001e);,W<\t:#^\u0013~\u001d09^\u0012F\u000f&_u\u0007R\u001e6nt\u0006C\u000fW";
        f610[70] = "\\;Fd\u000e\fYzV->:\"\\tQ{'?AgVbp\\;Fd\u000e\fYzV-";
        f610[71] = "=}t)qj8mtsI>9j\u000b3%\u0014=p\"!$+Tn 20ll),2uQ";
        f610[72] = "\u0003w\\}@\u0011\u00066L4p1}\u0014eK=#fL\u000b4\u001e\u001f\n0\u000eu\u000eV";
        f610[73] = ",}\u0000}s<=m\u0006#Oo/|90#@+f\u0015)\"zBnC5\"b!{\u0001!?\u0000";
        f610[74] = "\u001bV\r8d\u0007CHRGy\u0007kV\u000b-z\f&\u0001\r}nYMOZ'}a";
        f610[75] = "^[%[\u001cW\u0006Ez$\u0002V\fR'^f[\u0012ArZ\u0002ARSr";
        f610[76] = "\fI8KbN\u000f\u00146\u001a\fV\u0004\u001bW\u00104@\u0014\b/\u0011lZ\rw7GtM\u0016\u000f)N7\u0000hF8\u0010|\u0007\u0003\boJo?";
        f610[77] = "xF|~Dov\ble+0v\u0004NvW#z\u001ez\u001b\u0011gd\u0004jc\u0010?~\u001d\u0015zH>$\u0000leNa$x";
        f610[78] = "\u0016w\u001e\u0017N_\u0015*\u0010F N\u001b2qL\u0018Q\u000e6\tM@K\u0017IA\u0019\u0011\u0016\t4\u0010\nXDr";
        f610[79] = "\u0019G:%|\u001cAYeZ}\u0017XqUf;\u0001\u001b\\$aoD[!d5<\n\u001cJ*bf\u0019$";
        f610[80] = "D~N4V\u000f\u001c`\u0011K\u00efiG}K+L\u0017\t(^4";
        f610[81] = "Wn2\u0003$\"\u001a u\u0014F%\f^5\f6#\b\"l\n4z";
        f610[82] = "\u0004,\u000f\u001dPO\u001a%LP.V\u001f\u0003\f\bHp\u000e#\u001a\u0004R7T.FWUJ\u0005=\u000f\u0005.";
        f610[83] = "F8u\b`\"X16E\u001e5K)D\u0001\\!A3J\u0010|7M)\r\u001e 5G;|\u001d};\u0016U";
        f610[84] = "\r\t'Z|FKA;Q\u0015\u0004\u001f\u0015:QR\u0014vMzG*\u0007\u0007J.\u0002jz\r\t'Z|FKA;Q\u0015";
        f610[85] = "\u0012s\u0013\u00139;JmLl\u054f]Iu\u0017\u0006\"l\u001fp\u001c\u0015Cl@/\fT(\"\u0017u\u001fl";
        f610[86] = "^Nvaz\u001c@@sn\u0006\fXX\u000bnv\u00101\u0013\"2>\u0017LB1{ll";
        f610[87] = "O\b\f.gL\u001bEI-\u0016E\u0018\t\u00176zwIHOk\u0016\u001f\u001eM\u00162g_\f\u0004\tQ";
        f610[88] = "\f7w^Z?T)(!\u020dY\u000big]_!\n1}D";
        f610[89] = "f>!1}Bgf;(\u0002F;B92o@\u0017o% \u0002\u0000dy\"2z\u0001<c;M";
        f610[90] = "iCR\rEl1]\rrg\nn\u001dB\u000e@roEX\u0017";
        f610[91] = "%~\u000fcpk;wL.\u000e|(o>jUo?r\u0011~\u000e)}l\u000bnv(%v\u0012\u0011";
        f610[92] = "Z t<&aD.q3ZwX=3^5hZqr8*oG=O";
        f610[93] = "\u0005LP\u0016YH]R\u000fiJ.\u0004\u0012\u000f\n\u001cOWX_\u0004#\u0012\u0000\u001a\\VBAJJRi";
        f610[94] = "6)kak$n74\u001ej/w\u001e\u0004\",942u%x|tO5q+23${&q!\u000b";
        f610[95] = "w'\u0019J\u0014\u0015rf\t\u0003$\u000e4p\u0016^M\rN#\u001c\u0000E\n?c\u000eIZi";
        f610[96] = "\u0011=r8Q6I#-GP=V:t#J\"A[}*S\"R#c#\u0010o,";
        f610[97] = "Mr\u0002(E3Eh\u0003=&5Fo\u0000.\\\u0004Lo\u0010.@3+n\u0003{\u001c=Q1RxMO\u00174\u0017|[>\u0010`R<&s\u0016rS>WtB7\u0013C\u0017 \u0011yT(YwKjl";
        f610[98] = """
                   C<\u0001\u000f
                   \u000f\u001b"^p\u000b\u0004\u0002\u0001\u0012\u0019
                   \u0015.ZRM\u000bV\u0003+U\u0019N\u0016~k\u0001J\u0000Q\u0015%V\u0010\u0013i""";
        f610[99] = "\u001a\u00063vly\u001b^)o\u0013oGD)co\u0001\u001a\u00063vly\u001b^)o\u0013yY^<au}]Q'\n)9_B3r(aE[L";
        f610[100] = "-avoeR3h5\"\u001bE pGfWM0fjp\u001b\u0016pw1`j\u0011$2q\u001d";
        f610[101] = "?i\u000fY\u0017d oPYof>m\u0013\u0002\u0003F3p\u000f\u000f\u000b|,gnV\u0000,fq\u0013\u0007\u0013e4\n^\t^%%w\u000f\u001a\u0017w^";
        f610[102] = "'#\u0018\u001d\u00188\u007f=Gb\u000b:{*\u0011\u0007\u000f8fENY\f,*9K\u0018\u001ce";
        f610[103] = "\u001b\u001cU^NfC\u0002\n![mZ+:\u001d\t{\u0019\u0007K\u001a]>Yz";
        f610[104] = "_\te\u001d]\u0010A\u0000&P#\tD&f\bE.B\u0000yo\u0013\u0007\u000e\\f\u0012B\u0014G\u000e\u001d";
        f610[105] = "C(\u0015\u000bE{\u0017eP\b4r\u0014)\u000e\u0013X@Ei^J4(\u0012m\u000f\u0017Eh\u0000$\u0010t";
        f610[106] = "X[\u0012X}j]K\u0012\u0002E>\\Lq_(4\\uDY,>\\J-Q8(\u0001\f\u0011@(._0";
        f610[107] = "\u0007d\u0001t\n\u0007I1\u0014kj\u001fPd\u0006\u0014PAF}\u0014lQ\u0019\\dk";
        f610[108] = "v\b)\u000b\u001d+sI9B-\u000b\bk\u00102`\u0011\u0013~\u001dy\u0014l!Aw\u0005\u0011-1\b";
        f610[109] = "o<U3v\u00137\"\nLk\u0013\u001e;A%f\u0011?Z\u000b#6\u0005j1Etl\u0016R";
        f610[110] = "C\u0016\u001e\tm\t\u0012]\f]V\u001a\"W^\u001d*IZV\u0006\u000736\u0018U\u0019\u001e)N\u0019\r\u0003\u0007V";
        f610[111] = "\r4M~\\$\bu]7l\u0004sWtV-\u0017tS#5W6F?_0\u0016&\u000f";
        f610[112] = "}*\fLYo%4S3Xi'1\u0007_~q,%\u001f^jm!#\u0005VNo<LS\\\u00121;1\u0002O[c@";
        f610[113] = "\tj^\u0001\u001f@Qt\u0001~\u0004]hk^\u0011\u0001KX\f\u0001\u0011T\u001eOqP\u0002\u001dL4";
        f610[114] = ".U5(i\u000fxX)b\u0014\u0007*I\u001bdx& S'Cy\u000e+X!tnh-\na}m\u0015|I1 \u0014";
        f610[115] = "/:|KxZ13?\u0006\u0006M\"+MBLE(3iP`\"\u007f85\u0001}_.+|S\u0006";
        f610[116] = "|\u0001\u0012hJ\u0010}Y\bq5\u0005?D\u0004pN))_\nnX#/B\u0000\u0014\u000fP9E\u0012l\u000e\b#\\m$ZY~B\u0010uI\u0010,9";
        f610[117] = """
                    \u0014JUJqy\u0015KD[\u0010)
                    HA[l/\f%T_+*
                    UJQ.%v""";
        f610[118] = "7BjLm\\2\u0003z\u0005]Mw\u0004mZ& a\u0000k\u0002`F~\u0007vN]\u0010aH<E Ar\u0001n>";
        f610[119] = "L\u0002&*\u000bq\u0015\u0004$sdh\u001b\u001b6.\bZL]hy_\rL\u001a-6\u0015a\u0018Wh5d";
        f610[120] = "H>\u00052Vo\u001a-\u0005`oa\u00190gh\u0006j\u0019 |n\u000ea\u00140<?RuK1M8\u00060\u000bL";
        f610[121] = "r71\u0019\u0004p*)nf\u0005{3\n\"\u000f\u0004j\u001eQb[\u0005)2 e\u000f@iO`1\\\u000e.$.f\u0006\u001d\u0016";
        f610[122] = "O\u0003kem\u001b\u0017\u001d4\u001a\u01b6}B\n5\"l\u0000\u0013\u0019|p";
        f610[123] = "mw\u0018U\u0000i5iG*\u001bt\u001ck\u001eE\u0015n6~w\u001a\u0015>hj\nK\u0006w:\u0011";
        f610[124] = "A)#C\u0019#\u0006%#\u0006$tT>\u0004QM\u007fTBc\u0007_$D3dS\u001ad9";
        f610[125] = "jw_$Q\tog_~i]n`*\"\u000f^Fu\u0006*\u0006_y\u001c\u0005{\u0000@ls\u0011~\rM\u0003";
        f610[126] = "R?\u000eA!\u0010@%WEB\u001eW9\u0015Q>\u0018QT\u0000Uy\u001dW$\u001e[|\u0012+";
        f610[127] = "z\u001bA>6G\"\u0005\u001eA'F=\u0007C*0y \u0006O=-F!}\u0017z\"Sw\u0001\u0012;2\u001aGD\u0015/>\u0011;AT?w!v\u0012\u00141tJ8EN\"L";
        f610[128] = "P,\u001f\u0007\u0019u\b2@x\u01a7\u0013\u0014!\u0011\u0001\u0000|\u0006;H\u0005";
        f610[129] = "\u0002hr@T:\u0007)b\td\f|\u000f@u!\u0011\u007f\u001eRnd\u007f\u0000=n\u0002\u0018zA-'";
        f610[130] = "YQ;yeH\u0001Od\u0006\u04fe.TXe>dS\u0005K,l";
        f610[131] = "N?g@=\u0016K/g\u001a\u0005C@2$\\\u0005DG:iZb\u0012J&#'";
        f610[132] = "dCOe#VvY\u0016a@XfeKd<H\u001d\u0018A-xB`IRd*9";
        f610[133] = "\u001fI)h\u0010_GWv\u0017\u0001PFD;s\u0003EOf\"v\u0005_GB kj\u0005\u001fTyj\u001b\u0002K\u00119\u0017V\u0004Y\u0010;fQP\u001cPF.QWP\u001f:+\u0010G\u0019/";
        f610[134] = "-/\f\u0006\u00131(n\u001cO#3}p\u001f\u0019d#\u0014.Z\u000b_2l/\u0002\u0011FM-/\f\u0006\u00131(n\u001cO#";
        f610[135] = ",\rAM\u0011'<FKKor@GBP\u0013!8F\u001aJ\n^zE\u0005S\u0010&{\u001d\u001fJo";
        f610[136] = "7(?$\u000f%4u1ua;>jP\u007fY+/i(~\u000116\u00160(\u0019&-n.!ZkS";
        f610[137] = "\u00187!M]\u0010\u00071~M%\u0012\u0014.!\u001bA\b\u000b9@\u0012H\u0011\u000b*8\fARFT";
    }
}
