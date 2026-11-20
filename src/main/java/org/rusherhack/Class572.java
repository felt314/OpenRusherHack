// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import org.rusherhack.client.api.events.client.input.EventMouse;
import org.rusherhack.core.interfaces.IClickable;
import org.rusherhack.client.api.render.IRenderer;
import org.rusherhack.core.bind.BindManagerBase;
import org.rusherhack.core.logging.ILog;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.Setting;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import org.rusherhack.client.api.events.client.input.EventMouse$Key;
import java.util.Iterator;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.interfaces.ITickable;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.core.bind.key.IKey;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.network.message.MessageSignatureData;
import java.nio.ByteBuffer;
import java.util.Arrays;
import net.minecraft.client.gui.hud.MessageIndicator.Icon;
import net.minecraft.client.gui.hud.MessageIndicator;
import net.minecraft.text.MutableText;
import org.rusherhack.core.notification.type.Notification;
import net.minecraft.text.Text;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.core.event.type.Event;
import org.rusherhack.client.api.events.client.internal.EventNotification;
import net.minecraft.util.Formatting;
import net.minecraft.text.Style;
import java.util.Map;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.core.notification.NotificationType;
import com.google.common.collect.ImmutableMap;
import org.rusherhack.core.notification.type.LivingNotification;
import org.rusherhack.client.api.ui.notification.RenderableNotification;
import java.util.List;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.client.api.system.INotificationManager;

import org.rusherhack.command.bind;
import org.rusherhack.command.send;
import org.rusherhack.client.api.feature.module.impl.client.HUD;
import org.rusherhack.client.api.feature.module.impl.client.HUDFilter;
import org.rusherhack.client.api.feature.module.impl.client.HUDMode;
public class Class572 implements INotificationManager, IRenderable2D, Globals
{
    public static byte[] f9183;
    public List<RenderableNotification> f9184;
    public List<LivingNotification> f9185;
    public static ImmutableMap<NotificationType, VectorGraphic> f9186;
    public static long f9187;
    public static String[] f9188;
    public static String[] f9189;
    public static Map f9190;
    public static long[] f9191;
    public static Integer[] f9192;
    public static Map f9193;
    public static Object[] f9194;
    public static String[] f9195;
    
    public void send(NotificationType notificationType, String s, String s2, int n) {
        
    }
    
    public void chat(Text text, int n, Style style, int n2) {
        long n3 = Class572.f9187 ^ 0x29839A2736E1L;
        this.m17547(text, n, style, n2, true);
    }
    
    public void m17546(RenderableNotification renderableNotification) {
        long n = Class572.f9187 ^ 0x54DDBD2E04F4L;
        this.f9184.add(renderableNotification);
    }
    
    public void m17547(Text text, int n, Style style, int n2, boolean b) {
        long n3 = Class572.f9187 ^ 0x4B0829863417L;
        if (b) {
            Class170.f3346.info(text.getString());
        }
        if (Globals.mc.world != null) {
            MessageIndicator messageIndicator = new MessageIndicator(n, (MessageIndicator.Icon)null, (Text)Text.literal("RusherHack"), "RusherHack");
            MutableText append = Text.literal("[").append((Text)Text.literal("rusherhack").fillStyle(style)).append((Text)Text.literal("] "));
            byte[] copy;
            ByteBuffer.wrap(copy = Arrays.copyOf(Class572.f9183, 256)).putInt(Class572.f9183.length, n2);
            Globals.mc.inGameHud.getChatHud().addMessage((Text)append.append(text), new MessageSignatureData(copy), messageIndicator);
        }
    }
    
    public Class572() {
    }
    
    public List<RenderableNotification> m17548() {
        long n = Class572.f9187 ^ 0x59AB723EA246L;
        return this.f9184;
    }
    
    @Subscribe
    public void m17549(EventUpdate eventUpdate) {
        long n = Class572.f9187 ^ 0x4DD4558C7462L;
        this.f9184.removeIf(LivingNotification::shouldKillSelf);
        this.f9185.removeIf(LivingNotification::shouldKillSelf);
        this.f9185.forEach(ITickable::tick);
    }
    
    public void render(RenderContext renderContext, double n, double n2) {
        long n3 = Class572.f9187 ^ 0x37E531CEA44FL;
        int m9154 = Class253.m9154();
        if (this.f9184.isEmpty()) {
            return;
        }
        ((IRenderable2D)this).getRenderer().begin(renderContext.pose(), ((IRenderable2D)this).getFontRenderer());
        Iterator<RenderableNotification> iterator2;
        Iterator<RenderableNotification> iterator = iterator2 = this.f9184.iterator();
        while (iterator.hasNext()) {
            ((IRenderable2D)iterator2.next()).render(renderContext);
            if (m9154 != 0) {
                return;
            }
            iterator = iterator2;
        }
        ((IRenderer)((IRenderable2D)this).getRenderer()).end();
    }
    
    @Subscribe
    public void m17550(EventMouse$Key eventMouse$Key) {
        long n = Class572.f9187 ^ 0x357F3E2D12BBL;
        if (eventMouse$Key.getAction() == 1 && eventMouse$Key.getButton() == 0) {
            Iterator<RenderableNotification> iterator2;
            Iterator<RenderableNotification> iterator = iterator2 = this.f9184.iterator();
            while (iterator.hasNext()) {
                ((IClickable)iterator2.next()).mouseClicked(((EventMouse)eventMouse$Key).getMouseX(), ((EventMouse)eventMouse$Key).getMouseY(), eventMouse$Key.getButton());
                iterator = iterator2;
            }
        }
    }
    
    public void m17551(Notification notification) {
        long n = Class572.f9187 ^ 0x79EC0D172458L;
        if (notification instanceof LivingNotification livingNotification) {
            this.f9185.add(livingNotification);
            if (notification instanceof RenderableNotification renderableNotification) {
                this.m17546(renderableNotification);
            }
        }
    }
    
    public void m17552(int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          21030883112623
        //     6: lxor           
        //     7: lstore_2       
        //     8: aload_0        
        //     9: astore          7
        //    11: invokestatic    org/rusherhack/Class253.m9155:()I
        //    14: getstatic       org/rusherhack/HUD.filter:Lorg/rusherhack/core/setting/EnumSetting;
        //    17: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    20: checkcast       Lorg/rusherhack/HUDFilter;
        //    23: astore          8
        //    25: istore          4
        //    27: iload_1        
        //    28: iload           4
        //    30: ifeq            58
        //    33: ifeq            61
        //    36: goto            43
        //    39: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    42: athrow         
        //    43: aload           8
        //    45: getstatic       org/rusherhack/HUDFilter.f8487:Lorg/rusherhack/HUDFilter;
        //    48: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //    51: goto            58
        //    54: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    57: athrow         
        //    58: ifeq            62
        //    61: return         
        //    62: aload           7
        //    64: getfield        org/rusherhack/Class572.f9185:Ljava/util/List;
        //    67: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    72: astore          6
        //    74: aload           6
        //    76: invokeinterface java/util/Iterator.hasNext:()Z
        //    81: ifeq            154
        //    84: aload           6
        //    86: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    91: checkcast       Lorg/rusherhack/core/notification/type/LivingNotification;
        //    94: astore_0       
        //    95: iload           4
        //    97: ifeq            149
        //   100: aload           8
        //   102: getstatic       org/rusherhack/HUDFilter.f8489:Lorg/rusherhack/HUDFilter;
        //   105: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   108: ifne            145
        //   111: goto            118
        //   114: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   117: athrow         
        //   118: aload_0        
        //   119: iload           4
        //   121: ifeq            146
        //   124: goto            131
        //   127: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   130: athrow         
        //   131: invokevirtual   org/rusherhack/core/notification/type/Notification.getID:()I
        //   134: iload_1        
        //   135: if_icmpne       74
        //   138: goto            145
        //   141: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   144: athrow         
        //   145: aload_0        
        //   146: invokevirtual   org/rusherhack/core/notification/type/LivingNotification.kill:()V
        //   149: iload           4
        //   151: ifne            74
        //   154: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   157: getfield        net.minecraft.client.MinecraftClient.inGameHud:Lnet.minecraft.client.gui.hud.InGameHud;
        //   160: invokevirtual   net.minecraft.client.gui.hud.InGameHud.getChatHud:()Lnet.minecraft.client.gui.hud.ChatHud;
        //   163: checkcast       Lorg/rusherhack/client/api/accessors/gui/IMixinChatComponent;
        //   166: astore          6
        //   168: new             Ljava/util/HashSet;
        //   171: dup            
        //   172: invokespecial   java/util/HashSet.<init>:()V
        //   175: astore_0       
        //   176: aload           6
        //   178: invokeinterface org/rusherhack/client/api/accessors/gui/IMixinChatComponent.getAllMessages:()Ljava/util/List;
        //   183: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   188: astore          5
        //   190: aload           5
        //   192: invokeinterface java/util/Iterator.hasNext:()Z
        //   197: ifeq            365
        //   200: aload           5
        //   202: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   207: checkcast       Lnet.minecraft.client.gui.hud.ChatHudLine;
        //   210: dup            
        //   211: astore          9
        //   213: invokevirtual   net.minecraft.client.gui.hud.ChatHudLine.signature:()Lnet.minecraft.network.message.MessageSignatureData;
        //   216: dup            
        //   217: astore          10
        //   219: iload           4
        //   221: ifeq            245
        //   224: ifnonnull       243
        //   227: goto            234
        //   230: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   233: athrow         
        //   234: aload           5
        //   236: goto            192
        //   239: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   242: athrow         
        //   243: aload           10
        //   245: invokevirtual   net.minecraft.network.message.MessageSignatureData.data:()[B
        //   248: dup            
        //   249: astore          10
        //   251: iconst_0       
        //   252: getstatic       org/rusherhack/Class572.f9183:[B
        //   255: arraylength    
        //   256: invokestatic    java/util/Arrays.copyOfRange:([BII)[B
        //   259: getstatic       org/rusherhack/Class572.f9183:[B
        //   262: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   265: iload           4
        //   267: ifeq            301
        //   270: ifne            289
        //   273: goto            280
        //   276: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   279: athrow         
        //   280: aload           5
        //   282: goto            192
        //   285: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   288: athrow         
        //   289: aload           10
        //   291: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //   294: getstatic       org/rusherhack/Class572.f9183:[B
        //   297: arraylength    
        //   298: invokevirtual   java/nio/ByteBuffer.getInt:(I)I
        //   301: istore          10
        //   303: aload           8
        //   305: getstatic       org/rusherhack/HUDFilter.f8489:Lorg/rusherhack/HUDFilter;
        //   308: invokevirtual   java/lang/Enum.equals:(Ljava/lang/Object;)Z
        //   311: iload           4
        //   313: ifeq            359
        //   316: ifne            351
        //   319: goto            326
        //   322: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   325: athrow         
        //   326: iload           10
        //   328: iload           4
        //   330: ifeq            359
        //   333: goto            340
        //   336: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   339: athrow         
        //   340: iload_1        
        //   341: if_icmpne       190
        //   344: goto            351
        //   347: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   350: athrow         
        //   351: aload_0        
        //   352: aload           9
        //   354: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   359: pop            
        //   360: iload           4
        //   362: ifne            190
        //   365: aload_0        
        //   366: invokeinterface java/util/Set.isEmpty:()Z
        //   371: iload           4
        //   373: ifeq            399
        //   376: ifne            444
        //   379: goto            386
        //   382: invokestatic    org/rusherhack/Class572.m1393:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   385: athrow         
        //   386: aload           6
        //   388: invokeinterface org/rusherhack/client/api/accessors/gui/IMixinChatComponent.getAllMessages:()Ljava/util/List;
        //   393: aload_0        
        //   394: invokeinterface java/util/List.removeAll:(Ljava/util/Collection;)Z
        //   399: pop            
        //   400: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   403: aload           6
        //   405: dup            
        //   406: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   409: pop            
        //   410: invokedynamic   BootstrapMethod #5, run:(Lorg/rusherhack/client/api/accessors/gui/IMixinChatComponent;)Ljava/lang/Runnable;
        //   415: invokevirtual   net.minecraft.util.thread.ThreadExecutor.send:(Ljava/lang/Runnable;)V
        //   418: return         
        //   419: astore          5
        //   421: getstatic       org/rusherhack/Class170.f3346:Lorg/rusherhack/core/logging/Logger;
        //   424: ldc_w           "Failed to filter chat notification!"
        //   427: iconst_1       
        //   428: dup            
        //   429: dup            
        //   430: pop2           
        //   431: anewarray       Ljava/lang/Object;
        //   434: dup            
        //   435: iconst_0       
        //   436: aload           5
        //   438: aastore        
        //   439: invokeinterface org/rusherhack/core/logging/ILog.warn:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   444: return         
        //    StackMapTable: 00 29 FF 00 27 00 08 07 00 02 01 04 01 00 00 07 00 02 07 02 43 00 01 07 01 46 03 4A 07 01 46 43 01 02 00 FF 00 0B 00 08 07 00 04 01 04 01 00 07 02 08 07 00 02 07 02 43 00 00 FF 00 27 00 08 07 01 C3 01 04 01 00 07 02 08 07 00 02 07 02 43 00 01 07 01 46 03 48 07 01 46 43 07 01 C3 49 07 01 46 03 40 07 01 C3 02 FF 00 04 00 08 07 00 04 01 04 01 00 07 02 08 07 00 02 07 02 43 00 00 FF 00 23 00 08 07 02 54 01 04 01 07 02 08 07 02 52 07 00 02 07 02 43 00 00 41 07 02 08 FF 00 25 00 0A 07 02 54 01 04 01 07 02 08 07 02 52 07 00 02 07 02 43 07 02 5A 07 01 30 00 01 07 01 46 03 44 07 01 46 03 41 07 01 30 FF 00 1E 00 0A 07 02 54 01 04 01 07 02 08 07 02 52 07 00 02 07 02 43 07 02 5A 07 02 8D 00 01 07 01 46 03 44 07 01 46 03 4B 01 FF 00 14 00 0A 07 02 54 01 04 01 07 02 08 07 02 52 07 00 02 07 02 43 07 02 5A 01 00 01 07 01 46 03 49 07 01 46 43 01 46 07 01 46 03 47 01 F9 00 05 50 07 01 46 03 4C 01 53 07 01 46 FF 00 18 00 08 07 02 54 01 04 01 07 00 04 07 02 52 07 00 02 07 02 43 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  365    379    382    386    Ljava/lang/Throwable;
        //  326    344    347    351    Ljava/lang/Throwable;
        //  316    333    336    340    Ljava/lang/Throwable;
        //  303    319    322    326    Ljava/lang/Throwable;
        //  270    285    285    289    Ljava/lang/Throwable;
        //  251    273    276    280    Ljava/lang/Throwable;
        //  224    239    239    243    Ljava/lang/Throwable;
        //  219    227    230    234    Ljava/lang/Throwable;
        //  118    138    141    145    Ljava/lang/Throwable;
        //  100    124    127    131    Ljava/lang/Throwable;
        //  95     111    114    118    Ljava/lang/Throwable;
        //  33     51     54     58     Ljava/lang/Throwable;
        //  27     36     39     43     Ljava/lang/Throwable;
        //  386    418    419    444    Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0118:
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
    
    public boolean shouldNotifyModuleToggles() {
        long n = Class572.f9187 ^ 0x73EAC6EDBD41L;
        return (boolean)((Setting)HUD.showNotificationsWhenModulesAreToggled).getValue();
    }
    
    static {
   }
    
    public static IllegalStateException m1393(Throwable t) {
        return new IllegalStateException(t);
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
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class572.m132:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class572.m174:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static void m343() {
        Object[] f9194 = Class572.f9194;
        f9194[0] = "?\u0001fVw\n!\t|\u0019\u0015\u0016&\u0014";
        f9194[1] = "\u0000#\u0017\u0011f \u001e+\r^. \u0004!\u0015\u0019';D\u0001\u000e\u001e; \u0007'\u0013";
        f9194[2] = Void.TYPE;
        Class572.f9195[2] = "java/lang/Void";
        f9194[3] = "\u0003\\\u001a`X+\u001dT\u0000/\u0010+\u0007^\u0018h\u00190Gm\u001ed\u00127\n\\\u0018d";
        f9194[4] = Boolean.TYPE;
        Class572.f9195[4] = "java/lang/Boolean";
        f9194[5] = "E;\rZQ\u000fY!\u000f\u0006K\u001bI\"D\u054d";
        f9194[6] = "%.\u001e-\u0001S94\u001cq\u001bG)7W`\u001cT/r\u0015l\u0014A#2\u001e-?I-;\u001cq";
        f9194[7] = "\u0019\u0016l{\u0000Z\u0012\u0019}4}B\u0001\u001et}";
        f9194[8] = "D#\u0004,w\u001aX9\u0006pm\u000eH:M\u0169";
        f9194[9] = "i8\u001d\u0007;Aj6E.l[f\u001b\u001e\u0000sJq";
        f9194[10] = "S\u001b";
        f9194[11] = "-L;-<\u00121V9q&\u0006!Ur`!\u0015'\u00102l:\u000e$W?b:\u000e-Prw7\u0017'\u0010\u0012l:\u000e$W?b:\u000e-P";
        f9194[12] = "\u0013\u0014";
        f9194[13] = Integer.TYPE;
        Class572.f9195[13] = "java/lang/Integer";
        f9194[14] = "`,qBKb`,f\u001eGmzgf\u0000Gx}\u00166]\u0016";
        f9194[15] = "J|/uG0J|8)K?P787K*WFhi\u0013";
        f9194[16] = "\"fmVUE\"fz\nYJ8-z\u0014Y_?\\*K\u0000";
        f9194[17] = "%\u0016\bLG\u0006%\u0016\u001f\u0010K\t?]\u001f\u000eK\u001c8,NW\u001c^";
        f9194[18] = "A)\u0003\u0006YIA)\u0014ZUF[b\u0014DUS\\\u0013@\u001c\u0002\u0019";
        f9194[19] = "pGs\ruFpGdQyIj\fdOy\\m}0\u0016!\u001e";
        f9194[20] = "\u001bL.j2h\u0007V,6(|\u0017Ug',t\u0011P=j!m\u001d\u0010\u000e(/\u007f\u0015R:";
        f9194[21] = "^Bz Y}BXx|CiR[3\u052e";
        f9194[22] = "\u000f3g)vZ\u0011;}f\u0019]\u00173h;";
        f9194[23] = "\u001c\u0019";
        f9194[24] = "\u001b\f";
        f9194[25] = "~Kk\u000b$ouDzD^kfEj\u000bhoq";
        f9194[26] = "L$\u0015-/[L$\u0002q#TVo\u0002o#AQ\u001eT1w\u0002";
        f9194[27] = "~(U\u0000+\u001e~(B\\'\u0011dcBB'\u0004c\u0012\u0017\u001d~";
        f9194[28] = "c\f%\u0015&wc\f2I*xyG2W*m~6c\u000es-";
        f9194[29] = "OE}\u000f{\u001eS_\u007fSa\nC\\4Bf\u0019E\u0019tN}\u0002F^y@}\u0002OY4of\u001fIQsBh\u001fIXtup\u001bE";
        f9194[30] = "\u007fL\t(Vq\u007fL\u001etZ~e\u0007\u001ejZkbvL4\u000f";
        f9194[31] = "R,\u000el7.N6\f0-:^5G!)2X0\u001dl$+Tp\u001a;6/X3G\u0001*7R,\u001a";
        f9194[32] = "CS8<VS_I:`LGOJqqHOIO+<EVE\u000f,wPREO8<gI@N-AARXH1u";
        f9194[33] = "Eto\u0011w\u0003YnmMm\u0017Im&\u0239";
        f9194[34] = "\u0018Tq\u000f:\u001a\u0004NsS \u000e\u0014M8\u04cc";
        f9194[35] = "6]H%\u0007\u0016*GJy\u001d\u0002:D\u0001h\u001a\u0011<\u0001\\n\u0001\u00170AH%0\r,B|n\u0001\u00170AH";
        f9194[36] = "\u007f\u0010\u001b\u0012QNc\n\u0019NKZs\tR\u0240";
        f9194[37] = "u~\"k\u0011\u0000\u0000^)d\u0000OaP\"o\u0004\u0015\u0015";
        f9194[38] = "U\u0005\u007f8vEH\u0010'\u001a7HP\u0016";
        f9194[39] = "icEDU5uyG\u0018O!ez\f\tH2c?Q\u000fS4o\u007fEDt%reK\u0004@";
        f9194[40] = "G\u0015kX\u0001qL\u001az\u0017`\u007fG\u0011~M";
        f9194[41] = ">M^\u0002[5\"W\\^A!2T\u0017OF24\u0011\\ZL.%\u0011|ZL.%}L_";
        f9194[42] = "WN*V#gKT(\n9s[Wc\u04da";
        f9194[43] = "?x";
        f9194[44] = "?e\na'\u0000#\u007f\b==\u00143|C,:\u000759\b90\u001b$9\u00196%\u0010~R\u001b*;\u0001";
        f9194[45] = "W^\t%u%KD\u000byo1[G@hk9]B\u001a%f Q\u0002<~t8]^&jd;y|'";
        f9194[46] = "%\u00176nx!9\r42b5)\u000e\u007f#e&/K46o:>K%9z1d '%d \t\u0004?#o8&\u00043,o";
        f9194[47] = "fu\u0004f/\u0016x}\u001e)H\u0017if\u0013sn\u0011";
        f9194[48] = "z\r\u0019\u0010>\u0005d\u0005\u0003_C\u0015d";
        f9194[49] = "\u0019[$T\u001c{\u0012T5\u001b`b\u001dT3W^r";
        f9194[50] = "O\"";
        f9194[51] = "]Kv\u0012g|AQtN}hQR?\u04f1";
        f9194[52] = "I%6\u0012\u000f4U?4N\u0015 E<\u007f_\u0011(C9%\u0012\u001c1Oy0_\u001e$U$>N\u000eoA\"8\u00124\fO/8R>)G#\u0012S\u00101I94R\t";
        f9194[53] = " {";
        f9194[54] = "{\u001d";
        f9194[55] = "ffFQ@VffQ\rLY|-Q\u0013LL{\\\u0001O\u001e";
        f9194[56] = "v\\-I\u0016{hT7\u0006wlvX8\\K";
        f9194[57] = "N:";
        f9194[58] = "FN";
        f9194[59] = "d3W\u0017\u0003\u0004x)UK\u0019\u0010h*\u001eZ\u001e\u0003no\\V\u0016\u0016b/W\u00178=d&";
        f9194[60] = "T\b\u00189D\n!(\u00136UE@&\u0018=Q\u001f4";
        f9194[61] = "\u001e?7\u0019hC\u0002%5ErW\u0012&~TuD\u0014c>Xn_\u0017$3Vn_\u001e#~CcF\u0014c\u001c^l_\u001f*\u001eXn_\u0017$3Vn_\u001e#";
        f9194[62] = "\"ui.E$<}sa(>$xz,\u001f8'z";
        f9194[63] = "\u0017\u0016y:A6\u000b\f{f[\"\u001b\u000f0w\\1\u001dJmqG7\u0011\ny:q,\u0017\b{u]\u0010\u001d\u0010j}]$";
        f9194[64] = "3\u0017U\u0004\nm8\u0018DKfn6\u001aF\u0004J";
        f9194[65] = "u\u0014w[XFk\u001cm\u0014$Rq\u0011nW";
        f9194[66] = "s19\u007f>go+;#$s\u007f(p2 {y-*\u007f-bum+8b|s777%q}77>\"<N&05)`}!24\u0002}h*88/sh*1?";
        f9194[67] = "U\u000f6D%F|6*^'\u001af\":]l\u000ba1<\u0018,\u0007z*?_!\tz*6Xl&a70P+\u000bo70Y,<w3<\r";
        f9194[68] = "!mI\u0007k:=wK[q.-t\u0000Ju&+qZ\u0007x?'1\\Lw++m\u0000`K* {K[|=|[";
        f9194[69] = "Au\u001c\f[fAu\u000bPWi[>\u000bNW|\\O\\\u0017\u000e8";
        f9194[70] = "J19uV\u0007V+;)L\u0013F(p8H\u001b@-*uE\u0002Lm,>J\u0016@1p=K\u001cQm\u0017\u001dK\u001cQ\u0011;5@\u0017W&,";
        f9194[71] = "T\u0012\u0017'\u0011\u0005H\b\u0015{\u000b\u0011X\u000b^j\u000f\u0019^\u000e\u0004'\u0002\u0000RN\u0002l\r\u0014^\u0012^@1\u0015U\u0004\u0015{\u0002\u0012W\u0005BM";
        f9194[72] = ":CDR\u0011\u001b&YF\u000e\u000b\u000f6Z\r\u001f\u000f\u00070_WR\u0002\u001e<\u001fQ\u0019\r\n0C\r51\u000b;UF\u000e\u0006\u001c";
        f9194[73] = "%%QVs\b9?S\ni\u001c)<\u0018\u001bm\u0014/9BV`\r#yD\u001do\u0019/%\u0018*d\u0013.2D;n\u0013>2N\f";
        f9194[74] = "cEN%93\u007f_Ly#'o\\\u0007h'/iY]%*6e\u0019L}.(xD\u0007h'/iY]%\"(|B]%\u000e0iY]F.3\u007fR\r@.?";
        f9194[75] = "}`\u001aa8~az\u0018=\"jqyS,&bw|\ta+{{<\u00189/efaS,&bw|\ta#ebg\ta\u000f}w|\t\u0002%~aw";
        f9194[76] = Double.TYPE;
        Class572.f9195[76] = "java/lang/Double";
        f9194[77] = "\u000f0\t65!\u0013*\u000bj/5\u0003)@{(&\u0005l\u0007v31\u0012$\u000f{\"'N\u000b-t.7\u000b#\ft\"";
        f9194[78] = "\u001aA\u007fv|Y\u0019O'q;[\u0015\u000eYv&_\u0003";
        f9194[79] = "\u0013\t\u0016;2\u0011\u001c\u001cN\u000fN6";
        f9194[80] = "W?jP1ST12WvQXpLPkU";
        f9194[81] = "f\bDpjgj\u0000E;#kj\nD1c&f\bE2hkqI`3`}q\u0006K2hEd\u0017\r\u001cxai\u0003L,";
        f9194[82] = ">8yR%k;wMFmd1+jWDw )zGXv&<n^";
        f9194[83] = "h-";
        f9194[84] = "r\u0007=B\u001fcn\u001d?\u001e\u0005w~\u001et\u0384";
        f9194[85] = "\u0000,\u001cE\u0002f\u000f9Dq~D";
        f9194[86] = "Q-3[RDM71\u0007HP]4z\u0016OC[q6\u001cNU\u0010\u001d=\u001bD|_15\u0012EC|>'\u0010";
        f9194[87] = "Y21 q\u0017E(3|k\u0003U+xml\u0010Sn4gm\u0006\u0018\t\u0014gm\u0006W\":k";
        f9194[88] = "\u000f\u0000$2t{\u0013\u001a&nno\u0003\u0019m\u007fi|\u0005\\!uhjN\u0019&e(G+\u0017:";
        f9194[89] = "(!J\u00188\\#.[WU\\#3O";
        f9194[90] = "P58!;{_7;2||Cz\u001e2z|_7:)zf~;#!|f";
        f9194[91] = "*eYh;z_ERg*5>KYl.oJ";
        f9194[92] = "\u0002P[b\u0019\u001f\rRXq^\u0018\u0011\u001fnlS\t;^XqT\t";
        f9194[93] = """
                    dA\u000b5\u000b7hI
                    ~B;hC\u000bt\u0002vdA
                    w	;s\u0000/v\u0001-sO\u0004w	\u0015f^""";
        f9194[94] = "tW=\u0002\u001bKq\u0018\r\nYG";
        f9194[95] = "v4u{\u001b>y=qtvBT\u001eB\n\u0015n~)s6\u001agz&";
        f9194[96] = "I=[p%\u0000\u001b|\u0003eK\u0270u>\u0002~r\u0015Dc\u0016\u007fqA";
        f9194[97] = "}GFm <#\u001e[xJ\u01e5\u001a\u001a^0 u\u007f\u0018\u001be&";
        f9194[98] = "~q<&\b$b42%gX\u00067=s\rz7+x}\u000e";
        f9194[99] = "XMQa\u0006HQN\t|~\u03f06NXp@BD\u001e\u000etB(\u000b\u001fJ0\u0014Z[IN2~";
        f9194[100] = "\u001d{S?\u001ciCxSd\u0000\u001bK.I\u0011\u001e\u007fa.N#\u0013tI85g\u0000qY1Xe\u000bu$";
        f9194[101] = "jK Ln,,[4\t,B)J(Y{8S\u001e#N\u007f?:\u001d*N*yS\u001e N-\u007f)\\-^|B";
        f9194[102] = """
                     \u0013
                     1bdz\u0011[#`_*\u001b\6s\b}D\u0001m\u001f=}\u0013
                     "q8;
                     Z""";
        f9194[103] = "JX?g`iD\t;y[4]O0g Y\u001dV%:?h@B.9kY\u001dV%:?h@B.9kY\u001eN$y9)FX8;[";
        f9194[104] = "xewgc^x/-\"!o;33g;\u0015,\u0018-|\u001c\u0012%:J` \u00113evp%\u0003+^0`$\u001dzb e6\u0005A";
        f9194[105] = "\u001eE/zme\u0011L+u\u0000>\u0007E%mi=}\u0018};|h\u0000S.rgY";
        f9194[106] = """
                     N\u001d]_2\\@LYA	\u0007G\u000fJ|g6I\u0011TV	UD\u000b\u0002_8\bP
                     \u0001\u000b	]\u0019GG
                     t\u0016J\u000e\\;8U\u0010\u000b
                     Fs\u0006Y\u0010;\u0002m\u0010\u0019\u0013
                     _y\u0011\u001aG;""";
        f9194[107] = "Gvn\u001fb\u0003\u0002{i\u001df\u007f\u0002w\u000e.\u001c\u007fGrb\n;\u0001\u0019~3\u0013l\u007f";
        f9194[108] = "!4*\u001eEB$qq\u0010+\u0173]0o^YN2!pR\u0010";
        f9194[109] = " \u000e-js6$\u0006.j{Qv\r=\u001b|-e\u0007'Q0h)\u001cp,{;`\u0007A";
        f9194[110] = ")\u0001ToTtyWPm>go O)Bw\u0014WV,Ddd\u000f@0\u0006\u0006";
        f9194[111] = "fkZ|\b/82Gib'\u00016B!\bfd4\u0007t\u000e";
        f9194[112] = "zNLjf*eRA0\u0003\"ySI6Tv$\u0005\u0013b\u0003.h_\u001d?e1tRG";
        f9194[113] = "Z ODZx_wXU\t\u0003\u0000\u007fE_f:\re\u001a\u0006\u001cx\u0000uK;";
        f9194[114] = "!&=\u0002nS*|cY\u000eO'\u001f;[mWw!9\n\u007fU";
        f9194[115] = "\u001e\u0005\u0007R6)^\u000bA\u000eR'\u001a/\u0012T9+\u0005\u0000\u0016^R|\u001d\u0019\u0001P\"$\u000b\u0005C2";
        f9194[116] = "k+\u001e&#;1'JaMcg1E|!Q0r\u001b*s\u0006h=D+(`w!IqMglv\u0018up=`\"_\u001b";
        f9194[117] = "Arg]O8\u0007qn\u0007#=WjFTS!>+|DY?NsjX\u001b]";
        f9194[118] = "U;F\u0000=\u001fZ2B\u000fPE_2@qmOHiG\u0003=\u0019Lk-";
        f9194[119] = " 6\rNT\u0001f5\u0004\u00148\u00022%\u0016*B\u001e!'Q\u0016R\u001b3?j";
        f9194[120] = "\u0013\u0016R/k&A\u0013\u001e?P$.R\u00046!vG\u0003\u0010*j";
        f9194[121] = "q;PN\u0018d&w\u0001Ne~5.G\"\\e3~[\u0013\u0001q2}\u000f\"[} +BG\f1q+?";
        f9194[122] = "GOa\u0001\u0006F\nN$\u0002t_[L^\u0003\u000eHE\u001bb\u0013\u000bZ] d\u0005\tLUP<\u0013\u0015\u000e7";
        f9194[123] = "U&\u001f1Iw\u00042\u0003zpr\u0004*\u001a/p#\u0005>Y*\u0002sS:[@Ip\u0012{Z:\u000b}\u0002*g";
        f9194[124] = "`:#L6\u0013z#\"RLBb+|@\u001b\u0015;{$,/P8&b\u00135I98";
        f9194[125] = "9BH#\u0006^g\f\u001eqcC'QBv\u0019J\u0016WCx\u0019;8V\u001f'\fPbO[.c";
        f9194[126] = "/9Bx\bk+1Ax\u0000\fy:R\n\u0011pw0HCK5&+\u001f>\u0000fo0.";
        f9194[127] = "I,19\fKV0<ciHF 0n\u0005z\u0010bi2X-\u001ae`uXPQ6)niO[=`l\u000fPG0:\t";
        f9194[128] = "\u007f1(:@cu2*)1\u0202\u0019orzMjd$!3V[";
        f9194[129] = "7.\u0018\u007fXte+Toc\u03a3\nkP.\u0002&c9Ub\u0012";
        f9194[130] = "X\u001f#1\u0018\b\u000fSr1e\u0015\u001b\u001f\r;\u0019mWZ|!T\u0010\u001c\t5:e\\_S0l\u0018\u0017\f\u001a+][\u0011\t\u000f18\f]X\u000fL";
        f9194[131] = "P\"\u0015eUiRs\u0007gn9Xt\u0012t9n\u0006!K\u0018\u0007(\u0000t\u001d#\u00114\ty";
        f9194[132] = "113oIoag7m#sk'(8_\u001d113oIoag7m#$v9qh\u001exo9-!# `#s;Qp6'qQ";
        f9194[133] = "\u0001Z)\u0018z1D\f'Yl_R]*Dw_\u0001[%\u001bq=\u0007\u0001*Cj_\u0001[;J.c\u0003P&D~_\u0001^>\u001e,%CS.O\u0011";
        f9194[134] = "\u0004 sO\"|Va+ZL\u01568q \u00006tWfrY5\r\t#~A}pBp7ZLoH{~X*pTv$=}4\bf\u007f@6gA}N\u00070pBx>_&l\u0000\u001awS76\u0005`5^'g8";
        f9194[135] = "\u001c\u0004[`R.NE\u0003u<\u047c \u000f_\"@d]D\fk[U\u0019P\u001d)\u0001/[]\rx<";
        f9194[136] = "\u001b\f\u0007u\u0014\u0013\u0014\u0005\u0003zyQ\u0011\u0004\u0011i\u0002/A\nUo\u001aOI\u0004\u000f:\u0000/";
        f9194[137] = "ZbRXQY@{SF+\bXs\rT|_\u0001 P8H\u001a\u0002~\u0013\u0007R\u0003\u0003`";
        f9194[138] = "6e|AX#6lhG$\tDppMC8#pyYE";
        f9194[139] = " \u00120S9\u0014(W3Cy-rO<K\u0016\u001c \u0015YX'P}X2_!\\r(";
        f9194[140] = "h\"|P[\u001ak=sRf\f\u007f0A\u0002\u0002\u001e\u007fLe\u0011\u0018\u0011)pu\u0014\n\t\u0012";
        f9194[141] = "lt{|/\f>q7l\u0014\u04bfQw%cq_0}z \u007f";
        f9194[142] = "b0\rf\u0018'6b\\g\tB$d\u001b1q\u007f7s_=\u0003/aw]WH8?1Xj\u0014!?m\u0011WH, 6\\-\n!0ga";
        f9194[143] = "?@qe\u00137#\u0005\u007ff|*G\u0006p0\u0016iv\u001a5>\u0015";
        f9194[144] = "aK=e/\"'[) mL7J/R0*$}>z;!\"J)\u001cn'&Hl l,;F<\u001c";
        f9194[145] = "h\b\u001e:K&j\u0003\u001aGX7:\b\u001d;^1W\r\u0017 ]'2K\u0014)\u0007K";
        f9194[146] = "\u001b.R\u001egAV/\u0017\u001d\u0015P\u0010\f\b\u001ei@k{\u0011\u001boS\u001b#\u0007\u0007-1";
        f9194[147] = "=j\u0003nT\u0003n?\u0003?Gln<\\2I\u0005b\u0005R2Y\u0001\u0004aG+^\u000et9Q7\u001cl";
        f9194[148] = "#\u0000/k(34RvhQ3%\u0012Im+=.\u0001\u0012,=\"v\u0004`|k&tn";
        f9194[149] = ",\u000fR\u0001IIr\u0001\u0012Z\u0005xx\u0004\u0004=\u0001\u0016nYUGC\u001b~\bh";
        f9194[150] = "76XE}\u0017u2\u001c\u0014vik1X\u0000!\"j7N\u0018!\u0005\u000eoEK-Uh<A\u0017!\u0004\u000eoEK-Uh<A\u0017!\u0004\u000eg\u001cK0Xs,O\u0002+i4*X\u0001.\u0019l<DCL";
        f9194[151] = "J[e\u0006TJ\u0018\u001a=\u0013:\u0407vQiHH\u0004K\b?\u0013Z;O\u000f#O\u0007A\r\u00023\u001e:";
        f9194[152] = "\u000eQQde\bHAE!'fXPCGp\u0000[PEpgf\u000eWS v\bK\u0001]a`f";
        f9194[153] = "nO\u000bjg\u0003<JGz\\\u01e0S\rGv&\b#UQjd";
        f9194[154] = "\u0010(aQ\nI\u001f!e^g*:\u001eLa!:s'fK\u0016\u0018O(oO\u0019";
        f9194[155] = "'VwN\"\u000fvBk\u0005\u001b\u0007}^h?&\ne\u000eeMv\\a\f\u000f\u0006u\u001d \ruDx\rq0";
        f9194[156] = "\u0015\u0019 g*ILO{u\u0015X%\u0015pk+\u001eWE&o)t\u0018Db+\u007f\u0006H\u0012f)\u0015";
        f9194[157] = "2!X4$\u0016:1Sc1/d#H\u0016)Rp#dSwO;/\b5$Kg#YS";
        f9194[158] = """
                     \u0011\u0001)m\7\u0013
                     -\u0010@=T6*{NZPE9vT8E
                     1\u0010\u00174U@~jU9E\u0011C""";
        f9194[159] = "Cx\u0015/\u0016\u0015\u0017#\u0007&\u0002z\u0015t\u0002_D\u0018Kg\u0018!\u001a\u0014\u001a~O_D\u0018\u001fh\u001ea\u0010\u0011\u0005'\u0012_";
        f9194[160] = "Um_$\u0005\\\u0007,\u00071k\u056fih\u0018<\u0016_\u0004j\u00138";
        f9194[161] = "4uDY\u0019v6$V[\"-02GCN\u001fd~\u0017\u0019\u0012H,(\u001a\u001cSy6,N\u0014\"q35\u001c\u0019X3>%M$";
        f9194[162] = "&o{\u00049\b|9)\u0003?ry3;G\u0006\u0014c^z\u0002w\u000e.#1Q>\u0015\u001for\u000b;Cb$!B r";
        f9194[163] = "\br@Z`Z\u0017nM\u0000\u0005Y\u0007~A\rikS:\u0010U:<\t~\u001a\n\u007f\u0003\u0013g\u001b\u0014\u0005^\u001ac\u0011\u000fcA\u0006nKj";
        f9194[164] = "N.E4\u0007\u0000\u0017x\u001e&8R\u0013c8\n8\fG/\u0005wEG\u0014f\u001eF";
        f9194[165] = "@b5\f\r*\u001a{q\u0005b.HxWY\u000b%{miI\u000fA\\\u007ffE\u000f/Y=7Rb";
        f9194[166] = "M\u0012[\u0002*\u001bZ@\u0002\u0001S\u0011K\u0000\u0006\u001f?#\u001aGZGkt\u001b\u0010\u0018F9\u0006KF\u001cDS\u0015@G[\u0016nOL\u0013\u001cx";
        f9194[167] = "S6gzqDVt6m\u001cEG1VDV*\u001bt<w-WP'ul\u001c";
        f9194[168] = "#QJ-*k?\u0014D.E7\"\u0012\u001c#>Z!\u0015\u000b5~f1\u0010\u0019-E`'\u0012\u000f%581\u000eMG";
        f9194[169] = "]_I3a\u000eX_\u000e(fk\u000bJJ\u000ez\f\u0018J]*a\f\u0002kQ3i\n\u0002'\u000f/a\u000f\u0002\u001c\fj>V\u000e'";
        f9194[170] = "e|\u0019P\u0006+4h\u0005\u001b?/#`\u0006[?\u007f5d_KM/c`]!\u0006,\"!\\[D!2pa";
        f9194[171] = "bf8\u001eCf64i\u001fR\u00036!.HP\u0003f7*\u0011@q6a.\u0013*:!?h\u0016\u0017f8?4_*:5 o\u0012Px80>/";
        f9194[172] = "a\tC{.16\u0003[;Odf\u001aD%#V7Z\u0014{v\u0001`\b\u001986nwZ@;Ojm\u001b@2$mk\u0017OB#la\u000fI2pjr\u001e${!z0[^9,jaf";
        f9194[173] = """
                     (\u001eI\u001dE^"A
                     \u0013\u007fD.\u001aL\u0013\u0005^9\u001d7\u0002\u0005A!K\u000b\u0012\u0000S9p\u000e\u0016\u0004\u0004n
                     L\u001b\u0014US""";
        f9194[174] = "f\u000f\u0005\u001bF\u0006eJZBJ=0\u001b\u00184GQ2-\u0003\u0002ZV2v]\u0004\u001eF>\u0018\u0001\u0016\u0019W`v";
        f9194[175] = "6\u0004\u0004\u001ab/9\r\u0000\u0015\u000f_\u0018\"2$\u000fp9\u0003\u001e\u00063\u007f0\u0007\u0011";
        f9194[176] = "8\u0019^5Z\u0006d\u000bY$\u0004hn\u000f\u001c\n\\\u0003h\u001e\u0001)]h8\u0004]%\u0004\u0014}\tZ'\u0000h";
        f9194[177] = "dR^~DJ0[D1Ht!Wun@\u0019]\tGj\u001b\u0005&@A4ON]";
        f9194[178] = "Q\u001dW$f7^\u0014S+\u000bJt?{UhgY\u0000Qign]\u000f";
        f9194[179] = "T\f\\sgH\u0006M\u0004f\t\u04e7h\u000f\u001d;0HW\u000b\u0005zr\u0006";
        f9194[180] = "\u0001v\u0012/&R\u0003}\u0016R=SR\f\u0002(*M\u00050\u0012-8U>6\u0004/.]Nn\u00123l?";
        f9194[181] = "-5\u001dV\u0018,\"<\u0019Yu]\u0014\u00031}us\"2\u0007JI|+6\b";
        f9194[182] = "m\u0003J}\u0016%:O\u001b}k/>\u0003dw\u0017@bF\u0015mZ=)\u0015\\vkqjOY \u0016:9\u0006B\u0011";
        f9194[183] = "\u001e\u0006y\f\ff\u0014\u0005{\u001f}\u053exX#L\u0001o\u0005\u0013p\u0005\u001a^";
        f9194[184] = "g\b\u0004`*\u00049Q\u0019u@\u03ed\u0000\u000bS9:\u001blL\u0000d+\u0010";
        f9194[185] = "e\u0017,G,u9\u001e`\u0002\"\u0007$\t`z(}\"\u0006'F8x0\u001e\u001c\u0000(y.O \u0010-k6t%\u0019b:\"\u0006y\u0010.\u007f,t";
        f9194[186] = "~\u000e0\u0012Ff,Oh\u0007(\u04b2B\rd\u000bR{\u007f_\u007f\u0006OmB\rc\u001b\u0013*8On\u000bB\u0017";
        f9194[187] = "\u000b&=\u0013Jj\f 1\u001c:j\u0007%8 \u000b;]@y\u0013F8\u0004q$\u0007G;P@";
        f9194[188] = "\u0000k\u0013=h\u0012DdR5)\u007fFuKp~\u007f\u0000kV5wN]\u007fW6#\u007f\b6\u001ap\"\u0002CeSk\u0013N\u0000?V=n\u0005SvM\f*\u0011B4\u0017vh\u001cRe*";
        f9194[189] = "Q\u001e\u001e=\u0004z\u0003_F(jbmDM.\u0000i\rGX4R\u000b\rJB%\bk\u000e_Xwj";
        f9194[190] = "\\z\u0013a}:\u0018uRi<W\u000ezM+kW\\pQk;-\u001e}A:\u0006";
        f9194[191] = "hj,\u0017\u0014lkc,BR\u0005)`,\u0013i<:gi\u001e\u000b:`h1\u0005i";
        f9194[192] = "RR\u0016\u0000'H\u0000WZ\u0010\u001c\u01b5o\u0013C\u0004-_\u0013[K\u0013vMo";
        f9194[193] = "XTx]FGNHqP-\u0019\\W!WA+\b\u0014}\u000b-\u0016^LxQ\u001dATT80";
        f9194[194] = "1u_C;\fky\u000b\u0004UT=o\u0004\u00199fi+TCo1;}Y\u0004,^,/\u0000\u0007UP6(Y\u0010h\n:|\u001e~";
        f9194[195] = "rCr j-/\u001fv5,\u00171Hc/+k&_\fw7ltN4%j+{\\\fw(r ]a,+()N\fw>lp\u0018v53|!%";
        f9194[196] = " Rm|7x\"Yi\u0001?xzOyl\u0004{\u001f\u0012csx$!Ekp}\u0015%Tz{'e}Bf9E";
        f9194[197] = "1\b ZSK;WcTiR-\u001d\"?\u0014Qt\u00148F\u0010[1_^\u0006\u0007Qq[$D\nA f";
        f9194[198] = "A\u0002\u001a\u0002\u0007\u0013U\\\u001d\u0002g@X\u0000\u0014\t\u001c+[\u0016\u001cO\u0002N\u0005XJ\u001dg";
        f9194[199] = "j;\u0019Wt*;/\u0005\u001cM<?'\u0007&p/(c\u000bT y,aa\u001f#8m`\u001b].(<]";
        f9194[200] = "\u0016'pH]\u0007\u0016.dN!Ld2|DF\u001c\u00032uP@";
        f9194[201] = ";v'zuag\u007fk?{\u0013hhv#g\u0013;i-~z,?ql<4\u0013";
        f9194[202] = "V\n\u0012VMQ^\u001a\u0019\u0001Xh\u0000\b\u0002t@\u0015\u0014\b/1\u001e\b_\u0004BWM\f\u0003\b\u00131";
        f9194[203] = "\tD\u0018\\LU\u000bO\u001c!DUSY\fLw\\R>K\u001e\u0004YWO\u000e\u001eBZS>H]CBTN\u0010K_\u00006";
        f9194[204] = " Jm\u0001\u0014\u0011$R,CZ.sK6\\\tCc6n[U\u0013gD2R\u0019Vi6";
        f9194[205] = "\u000f<A0.+\u0001mE.\u0015p\u0006.V\u0013{\u001bX2[mq*\u0005&Zn%\u001bPo\u0017($f\u001b<^3\u0015\"\u0005*\u001e0$\u007f\u0011+\u001dd\u0015";
        f9194[206] = ":\u0000;E\u0005'8\u000b?8\u00161H\u001f)D\u0006J?\u0006,B\u0015:g\u00100\u0000w";
        f9194[207] = "@Lg\u00040$@Es\u0002L.KVe\u00077CHQr\u0011w\u007fXT`\tLyNVv\u0001<!XJ4c";
        f9194[208] = "\u0019\u000f3nc|KNk{\r\u0460%\ntvp\u007fH\b\u007fr";
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
    
    public static CallSite m671(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class572.m671:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
