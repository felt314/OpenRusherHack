// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.chat;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.logging.ILog;
import org.rusherhack.client.api.feature.module.Module;
import net.minecraft.client.network.ClientCommonNetworkHandler;
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
import java.lang.invoke.MethodHandles;
import com.google.gson.JsonObject;
import java.io.File;
import java.net.URI;
import java.net.Proxy;
import java.util.HashMap;
import java.nio.file.Files;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import net.minecraft.util.Formatting;
import net.minecraft.text.Text;
import org.rusherhack.client.api.events.client.chat.EventChatMessage;
import java.util.concurrent.atomic.AtomicReference;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.core.bind.BindManagerBase;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.client.api.events.client.chat.EventAddChat;
import org.rusherhack.client.api.RusherHackAPI;
import net.minecraft.network.packet.Packet;
import java.util.Arrays;
import net.minecraft.network.message.LastSeenMessagesCollector.LastSeenMessages;
import net.minecraft.network.message.MessageBody;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.packet.IMixinClientPacketListener;
import net.minecraft.network.encryption.NetworkEncryptionUtils.SecureRandomUtil;
import java.time.Instant;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import java.util.Map;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.bind;
public class Translate extends ToggleableModule
{
    public static String[] f7663;
    public BooleanSetting receiving;
    public BooleanSetting notice;
    public EnumSetting<TranslateOutput> output;
    public BooleanSetting f7667;
    public BooleanSetting sending;
    public BooleanSetting privatemessages;
    public static String[] f7670;
    public EnumSetting<TranslateOutput> input;
    public BooleanSetting keeporiginal;
    public boolean f7673;
    public static long f7674;
    public static String[] f7675;
    public static String[] f7676;
    public static Map f7677;
    public static long[] f7678;
    public static Integer[] f7679;
    public static Map f7680;
    public static Object[] f7681;
    public static String[] f7682;
    
    public String getMetadata() {
        long n = Translate.f7674 ^ 0x564AA9C18AC3L;
        return String.format("%s, %s", ((Enum)((Setting)this.input).getValue()).name(), ((Enum)((Setting)this.output).getValue()).name());
    }
    
    public ChatMessageC2SPacket m14853(String s) {
        return null;
    }
    
    @Subscribe
    public void m14857(EventAddChat p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          2506251715131
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9154:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          6
        //    16: aload           6
        //    18: getfield        org/rusherhack/Translate.receiving:Lorg/rusherhack/core/setting/BooleanSetting;
        //    21: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //    24: checkcast       Ljava/lang/Boolean;
        //    27: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    30: iload           4
        //    32: ifne            49
        //    35: ifeq            52
        //    38: goto            41
        //    41: aload           6
        //    43: getfield        org/rusherhack/Translate.f7673:Z
        //    46: goto            49
        //    49: ifeq            53
        //    52: return         
        //    53: new             Ljava/util/concurrent/atomic/AtomicReference;
        //    56: dup            
        //    57: aload_1        
        //    58: invokevirtual   org/rusherhack/client/api/events/client/chat/EventAddChat.getChatComponent:()Lnet.minecraft.text.Text;
        //    61: invokespecial   java/util/concurrent/atomic/AtomicReference.<init>:(Ljava/lang/Object;)V
        //    64: dup            
        //    65: astore          7
        //    67: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    70: checkcast       Lnet.minecraft.text.Text;
        //    73: invokeinterface net.minecraft.text.Text.getString:()Ljava/lang/String;
        //    78: invokestatic    net.minecraft.util.Formatting.strip:(Ljava/lang/String;)Ljava/lang/String;
        //    81: astore_0       
        //    82: iconst_0       
        //    83: istore          5
        //    85: aload_0        
        //    86: ldc_w           "/"
        //    89: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    92: iload           4
        //    94: ifne            141
        //    97: ifne            124
        //   100: goto            103
        //   103: aload_0        
        //   104: ldc_w           ".*<(.*?)>.*"
        //   107: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //   110: iload           4
        //   112: ifne            182
        //   115: goto            118
        //   118: ifne            180
        //   121: goto            124
        //   124: aload           6
        //   126: getfield        org/rusherhack/Translate.privatemessages:Lorg/rusherhack/core/setting/BooleanSetting;
        //   129: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   132: checkcast       Ljava/lang/Boolean;
        //   135: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   138: goto            141
        //   141: iload           4
        //   143: ifne            162
        //   146: ifeq            173
        //   149: goto            152
        //   152: aload_0        
        //   153: ldc_w           "whispers: "
        //   156: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   159: goto            162
        //   162: iload           4
        //   164: ifne            178
        //   167: ifne            174
        //   170: goto            173
        //   173: return         
        //   174: iconst_1       
        //   175: dup            
        //   176: dup            
        //   177: pop2           
        //   178: istore          5
        //   180: iload           5
        //   182: iload           4
        //   184: ifne            197
        //   187: ifeq            200
        //   190: goto            193
        //   193: iconst_m1      
        //   194: goto            197
        //   197: goto            207
        //   200: aload_0        
        //   201: ldc_w           "<"
        //   204: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   207: istore          8
        //   209: iload           5
        //   211: iload           4
        //   213: ifne            233
        //   216: aload_0        
        //   217: swap           
        //   218: ifeq            236
        //   221: goto            224
        //   224: ldc_w           " whispers: "
        //   227: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   230: goto            233
        //   233: goto            242
        //   236: ldc_w           ">"
        //   239: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   242: istore          9
        //   244: aload_0        
        //   245: dup            
        //   246: iload           8
        //   248: iconst_1       
        //   249: dup            
        //   250: dup            
        //   251: pop2           
        //   252: iadd           
        //   253: iload           9
        //   255: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   258: astore          8
        //   260: iload           9
        //   262: iload           5
        //   264: iload           4
        //   266: ifne            292
        //   269: ifeq            291
        //   272: goto            275
        //   275: sipush          2815
        //   278: ldc2_w          3156451763874991218
        //   281: lload_2        
        //   282: lxor           
        //   283: invokedynamic   BootstrapMethod #2, m:(IJ)I
        //   288: goto            295
        //   291: iconst_2       
        //   292: iconst_1       
        //   293: dup            
        //   294: pop2           
        //   295: iadd           
        //   296: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   299: astore          9
        //   301: aload           8
        //   303: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   306: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   309: invokevirtual   net.minecraft.entity.player.PlayerEntity.getName:()Lnet.minecraft.text.Text;
        //   312: invokeinterface net.minecraft.text.Text.getString:()Ljava/lang/String;
        //   317: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   320: iload           4
        //   322: ifne            370
        //   325: ifeq            365
        //   328: goto            331
        //   331: aload           6
        //   333: getfield        org/rusherhack/Translate.notice:Lorg/rusherhack/core/setting/BooleanSetting;
        //   336: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   339: checkcast       Ljava/lang/Boolean;
        //   342: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   345: ifeq            351
        //   348: goto            351
        //   351: iload           5
        //   353: iload           4
        //   355: ifne            370
        //   358: ifne            365
        //   361: goto            364
        //   364: return         
        //   365: aload           9
        //   367: invokevirtual   java/lang/String.length:()I
        //   370: iload           4
        //   372: ifne            400
        //   375: iconst_1       
        //   376: dup            
        //   377: dup            
        //   378: pop2           
        //   379: if_icmpgt       386
        //   382: goto            385
        //   385: return         
        //   386: aload           6
        //   388: getfield        org/rusherhack/Translate.keeporiginal:Lorg/rusherhack/core/setting/BooleanSetting;
        //   391: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   394: checkcast       Ljava/lang/Boolean;
        //   397: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   400: iload           4
        //   402: ifne            424
        //   405: ifne            422
        //   408: goto            411
        //   411: aload_1        
        //   412: iconst_1       
        //   413: dup            
        //   414: dup            
        //   415: pop2           
        //   416: invokevirtual   org/rusherhack/core/event/type/EventCancellable.setCancelled:(Z)V
        //   419: goto            422
        //   422: iload           5
        //   424: istore_1       
        //   425: getstatic       org/rusherhack/Class568.f9131:Ljava/util/concurrent/ExecutorService;
        //   428: aload           6
        //   430: aload           9
        //   432: aload_0        
        //   433: iload_1        
        //   434: aload           7
        //   436: invokedynamic   BootstrapMethod #3, run:(Lorg/rusherhack/Translate;Ljava/lang/String;Ljava/lang/String;ZLjava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Runnable;
        //   441: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //   446: return         
        //    StackMapTable: 00 26 FF 00 29 00 06 07 00 02 07 01 3A 04 01 00 07 00 02 00 00 47 01 02 00 FF 00 31 00 07 07 00 42 07 01 3A 04 01 01 07 00 02 07 01 38 00 00 4E 01 05 50 01 0A 49 01 0A 00 43 01 01 41 01 0A 43 01 02 46 01 FF 00 10 00 08 07 00 42 07 01 3A 04 01 01 07 00 02 07 01 38 01 00 01 07 00 42 48 01 42 07 00 42 45 01 FF 00 20 00 09 07 00 42 07 01 3A 04 01 01 07 00 02 07 01 38 07 00 42 01 00 02 07 00 42 01 FF 00 0F 00 09 07 00 42 07 01 3A 04 01 01 07 00 02 07 01 38 07 00 42 01 00 02 07 00 42 01 FF 00 00 00 09 07 00 42 07 01 3A 04 01 01 07 00 02 07 01 38 07 00 42 01 00 03 07 00 42 01 01 FF 00 02 00 09 07 00 42 07 01 3A 04 01 01 07 00 02 07 01 38 07 00 42 01 00 03 07 00 42 01 01 FF 00 23 00 09 07 00 42 07 01 3A 04 01 01 07 00 02 07 01 38 07 00 42 07 00 42 00 00 13 0C 00 44 01 0E 00 4D 01 0A 0A 41 01
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083_1:
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
    
    public Translate() {
    }
    
    public TranslateOutput m14858(String s) {
        return null;
    }
    
    @Subscribe
    public void m14860(EventChatMessage eventChatMessage) {
        
    }
    
    public String[] m14861(Enum461 obf461, String s, TranslateOutput obf462) {
        return null;
    }
    
    static {}
    
    public static IllegalStateException m1393(Throwable t) {
        return new IllegalStateException(t);
    }
    
    public static String m221(byte[] array) {
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
    
    public static String m172(int n, long n2) {
        return null;
    }
    
    public static Object m173(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        String m172 = m172((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, m172), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m172;
    }
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Translate.m174:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Translate.m177:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static int m178(long n, long n2) {
        n ^= (n2 << 48 | n2);
        int n3 = (int)(n >>> 46);
        if (Translate.f7682[n3] != null) {
            return n3;
        }
        Object o = Translate.f7681[n3];
        if (!(o instanceof String)) {
            return n3;
        }
        int n5 = switch ((int)(n >>> 42 & 0x3FL)) {
            case 0 -> 19;
            case 1 -> 55;
            case 2 -> 52;
            case 3 -> 4;
            case 4 -> 40;
            case 5 -> 39;
            case 6 -> 48;
            case 7 -> 60;
            case 8 -> 20;
            case 9 -> 32;
            case 10 -> 10;
            case 11 -> 15;
            case 12 -> 6;
            case 13 -> 22;
            case 14 -> 23;
            case 15 -> 3;
            case 16 -> 17;
            case 17 -> 2;
            case 18 -> 38;
            case 19 -> 11;
            case 20 -> 1;
            case 21 -> 53;
            case 22 -> 56;
            case 23 -> 16;
            case 24 -> 59;
            case 25 -> 37;
            case 26 -> 45;
            case 27 -> 27;
            case 28 -> 44;
            case 29 -> 61;
            case 30 -> 29;
            case 31 -> 5;
            case 32 -> 7;
            case 33 -> 28;
            case 34 -> 35;
            case 35 -> 31;
            case 36 -> 58;
            case 37 -> 13;
            case 38 -> 63;
            case 39 -> 30;
            case 40 -> 42;
            case 41 -> 50;
            case 42 -> 25;
            case 43 -> 24;
            case 44 -> 47;
            case 45 -> 26;
            case 46 -> 43;
            case 47 -> 33;
            case 48 -> 34;
            case 49 -> 57;
            case 50 -> 14;
            case 51 -> 12;
            case 52 -> 49;
            case 53 -> 21;
            case 54 -> 41;
            case 55 -> 9;
            case 56 -> 36;
            case 57 -> 18;
            case 58 -> 62;
            case 59 -> 0;
            case 60 -> 54;
            case 61 -> 8;
            case 62 -> 46;
            default -> 51;
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
        Translate.f7682[n3] = new String(charArray);
        return n3;
    }
    
    public static void m179() {
        Object[] f7681 = Translate.f7681;
        f7681[0] = "P\u0015Ue\t\u0015[\u001aD*t\rH\u001dMc";
        f7681[1] = Boolean.TYPE;
        Translate.f7682[1] = "java/lang/Boolean";
        f7681[2] = "\u00023#\u00153~\u000234I?q\u0018x4W?d\u001f\tf\tj";
        f7681[3] = "\u0018-\u0002b\f_\u00047\u0000>\u0016K\u00144K\u0411";
        f7681[4] = "\u00012l\u00193\u0016\u001d(nE)\u0002\r+%T.\u0011\u000bnxR5\u0017\u0007.l\u0019\u0004\r\u001b-XR5\u0017\u0007.l";
        f7681[5] = "RN.\u0016\u000e\u001cNT,J\u0014\b^Wg\u047a";
        f7681[6] = "01Sx\u000fx,+Q$\u0015l<(\u001a\u03e4";
        f7681[7] = "O-p\f\t\u001d:\r{\u0003\u0018RG\u0015h\u0004\u0011\u001b/";
        f7681[8] = "\u000fX\u0003mN\u0006\u0013B\u00011T\u0012\u0003AJ P\u001a\u0005D\u0010m]\u0003\t\u000466O\u001b\u0005X,\"_\u0018!z-";
        f7681[9] = "m&\\A\u0013\u0006q<^\u001d\t\u0012a?\u0015\f\r\u001ag:OA\u0000\u0003kzH\u0016\u0012\u0007g9\u0015&/\u001cv=]\u0006\u0002\u0012v=T\u0001,\u0012l5\\\n\u0013";
        f7681[10] = "M5\u0014\u001f\rSQ/\u0016C\u0017GA,]\u0237";
        f7681[11] = Integer.TYPE;
        Translate.f7682[11] = "java/lang/Integer";
        f7681[12] = "B!P]z\u001cB!G\u0001v\u0013XjG\u001fv\u0006_\u001b\u0017B'";
        f7681[13] = "\u00143\u001f,\u001a\u001f\u00143\bp\u0016\u0010\u000ex\bn\u0016\u0005\t\tX0N";
        f7681[14] = Void.TYPE;
        Translate.f7682[14] = "java/lang/Void";
        f7681[15] = "[\u001eK6\u0005\\[\u001e\\j\tSAU\\t\tFF$\r-P\u0006";
        f7681[16] = "\r=E\u007fW*\r=R#[%\u0017vR=[0\u0010\u0007\u0003d\f{";
        f7681[17] = "l%-@=\\g*<\u000fGXt+,@q\\c";
        f7681[18] = "5#\u001f\u0010YP)9\u001dLCD9:V]DW?\u007f\u000b[_Q3?\u001f\u0010iJ5=\u001d_Ev?%\fWEB";
        f7681[19] = "NyZ\b/cPq@GbyJ{Y\u001bssJl\u0002\buyIqOG@bKuE\nSsB}^\fouA";
        f7681[20] = "\u0005\u001dDk[t\u000e\u0012U$:z\u0005\u0019Q~";
        f7681[21] = "J%p\u000bF\u0015J%gWJ\u001aPngIJ\u000fW\u001f6\u0010\u001dM";
        f7681[22] = "Jyk EzJy||IuP2|bI`WC*<\u001d#";
        f7681[23] = "08}J\u0002Q,\"\u007f\u0016\u0018E<!4\u0007\u001fV:di\u0001\u0004P6$}J#A+>s\n\u0017";
        f7681[24] = ")m6<|x)m!`pw3&!~pb4Wq!)";
        f7681[25] = "fS;\u007f<)zI9#&=jJr2!.l\u000f>8 8'c5?*\u0011hO=6+.K@/4";
        f7681[26] = ")iz|!\u00105sx ;\u0004%p31<\u0017#5q=4\u0002/uz|\u001a))|";
        f7681[27] = "<Yu\u0006%SIy~\t4\u001c(wu\u00020F\\";
        f7681[28] = "L/\u0018bb(L/\u000f>n'Vd\u000f n2Q\u0015^y9y\u0006)\u0000-|2}\u007f^x8";
        f7681[29] = "jhA('+vrCt=?fq\be:,`4Ei83dtB(0&f\u007fVr<1ki\bE:3h{Hb\u0010&f\u007fVr<1k";
        f7681[30] = "E(+PTkN':\u001f8h@%8P\u0014";
        f7681[31] = "+ \u001d\u0014\u0007\u00027:\u001fH\u001d\u0016'9TY\u0019\u001e!<\u000e\u0014\u0014\u0007-|=V\u001a\u0015%>\t";
        f7681[32] = "\u0017x\u0001I\"j\u000bb\u0003\u00158~\u001baH\u0004<v\u001dd\u0012I1o\u0011$\u0000\u00021k\rx\u0003I=p\u001c\u007f\n\u0002~R\u0017n\u0013\u000b5";
        f7681[33] = ",G\u0001\u000fzM0]\u0003S`Y ^HBgJ&\u001b\nNo_*[\u0001\u000fAt,R\u0001Dz";
        f7681[34] = ",t,D\u0006.0n.\u0018\u001c: me\u055b";
        f7681[35] = "\u007fy3\u0000\u0006\u000baq)OK\u0011{{0\u0013Z\u001b{lk$P\u001bvm1\u000eZ-pj3\bK\u001b";
        f7681[36] = "\u001fD\u001d5Nh\u0014K\fz#l\u0014W81\u0011q\u0010K\b1";
        f7681[37] = "8%i\u0005\u0011\u0015$?kY\u000b\u00014< H\u000f\t29z\u0005\u0002\u0010>yk]\u0006\u000e#$ H\u000f\t29z\u0005\u0000\b6# n\u0015\u00059#OO\u0007#?6z";
        f7681[38] = """
                    \u00100\u001b\u0016*\u0013\f*\u0019J0\u0007\u001c)R[7\u0014\u001al\u0019N=\b\u000bl\bA(\u0003Q\u0007
                    ]6\u0012<#\u0012[=
                    \u0013#\u001eT=""";
        f7681[39] = "\u000e\u001b&-\u00030\u0005\u00147b\u007f)\n\u00141.A9";
        f7681[40] = "RSM\u001ck\u001cRSZ@g\u0013H\u0018Z^g\u0006Oi\u000e\u00060";
        f7681[41] = "\u001f1Kz/\u001aj\u0011@u>U\u000b\u001fK~:\u000f\u007f";
        f7681[42] = "\u0011i3\fU2dI8\u0003D}\u0019Q+\u0004M4q";
        f7681[43] = "@|R^\u001e<5\\YQ\u000fsHDJV\u0006: ";
        f7681[44] = "\u0006;\u001f]\u001b\u0014\u00183\u0005\u0012F\u0015\u001e?\bQ\u001b2\u0018(\f]X";
        f7681[45] = "6w&$\u0012x(\u007f<kZx2u$,ScrF\" Xd?w$ ";
        f7681[46] = ";0|6{HN\u0010w9j\u00073\bd>cN[";
        f7681[47] = "`7sj\u0015r~?i%zux7|x";
        f7681[48] = ":%`\u001eJnO\u0005k\u0011[!.\u000b`\u001a_{Z";
        f7681[49] = """
                    -5.\u0014\u0014G1/,H\u000eS!,gY
                    [')=\u0014\u0007B+i,L\u0003\64gY
                    [')=\u0014\u0005Z#3g\u007f\u0010W,3
                    R\u0007F\u000f":I\u0007U'""";
        f7681[50] = "CBb;\u0019fHMstd~[Jz=u\u007f@Op?E";
        f7681[51] = "J~2\u001fGaJ~%CKnP5%]K{WDt\u0006\u0013?";
        f7681[52] = "^\"-DS4^\":\u0018_;Di:\u0006_.C\u0018oY\n";
        f7681[53] = "-^xgu--^o;y\"7\u0015o%y70d>|!r";
        f7681[54] = "L(w\u000f}(e\u0011k\u0015\u007ft\u007f\u0005{\u00164\u03b4,";
        f7681[55] = "?cz\u0002\u0000H\u0016Zf\u0018\u0002\u0014\fNv\u001bI\u0005\u000b]p^\u0014\u0003\u0010[|\u001e\u0000H7Ja\u0004\u000e\b\u0003\u0014";
        f7681[56] = "ug\u00075&\"i}\u0005i<6y~Nx8>\u007f{\u001455's;\u0006~5#og\u0005598~`\f~z\u001auq\u0015w1\u0014{a\u0005|;%c";
        f7681[57] = "L(\u0019\tp]e\u0011\u0005\u0013r\u0001\u007f\u0005\u0015\u00109\u0010x\u0016\u0013Ud\u0016c\u0010\u001f\u0015p]D\u0001\u0002\u000f~\u001dp_";
        f7681[58] = "Tz\u001c^\u00160[oDjj\u0017";
        f7681[59] = "yw Y\u0006\u0010em\"\u0005\u001c\u0004uni\u057e";
        f7681[60] = "Kg\u001e\u000bQ:Uo\u0004D2.Q";
        f7681[61] = "&=\u001f\tVj%3G\u000e\u0011h)r/\u0001\u0014a?";
        f7681[62] = "\u0017\r\u0014suC\u0014\u0003Lt2A\u0018B2s/E";
        f7681[63] = "\u001b\u001f";
        f7681[64] = "8\u001d@5'\u0004$\u0007Bi=\u00104\u0004\t\u057f";
        f7681[65] = "'_f\u0012X\u0013\"\u0010V\u001a\u001a\u001f";
        f7681[66] = "91\b\u0004h\u00166$P54\u0017+)";
        f7681[67] = "||,\u000e\u0002\u001fpt-EK\u0017l|/\u000e/\u0003p}\u0004L\u0000\u001dz}5";
        f7681[68] = "*C}FU(&K|\r\u001c :C~Fx4&B_\nX\"*X";
        f7681[69] = "\nRCe \u000f\t\\\u001bgf\u0000\u0012@Pp 2\u0014R[`o\u0013\u0004p]e|\u0012\u0005GF";
        f7681[70] = "^*hqE^]$0s\u0003QF8{dEs\\*lc\u000eD";
        f7681[71] = "X\u000bWOx}W\u001e\u000f{\u0004_w\u0004BA2v@";
        f7681[72] = "=z\u0002(\u0013\u000e>v\u0011gt\u0014$o\u0015'I";
        f7681[73] = "<c!\u0014-V y#H7B0zhY3J6\u007f2\u0014>S:?'Y<F b)H,\r#p%Q:W}X\u000bS'J=R*S:M'A'Y4F']/I+F=t4";
        f7681[74] = "#\f=\u0006!\u0010#\f*Z-\u001f9G*D-\n>6~\u001e\u007fN";
        f7681[75] = "[!\u00045^\r[!\u0013iR\u0002Aj\u0013wR\u0017F\u001bC.\u0002Q\u0011'\u001cz@\u0017jsD)\u0005";
        f7681[76] = Long.TYPE;
        Translate.f7682[76] = "java/lang/Long";
        f7681[77] = "\f*j{x`\f*}'to\u0016a}9tz\u0011\u0010)c$9F,r4fz=x(d'";
        f7681[78] = "`T\u000f=]\u000f`T\u0018aQ\u0000z\u001f\u0018\u007fQ\u0015}nL%\u0000^";
        f7681[79] = "\u0000G]\\ch\u0000GJ\u0000og\u001a\fJ\u001eor\u001d}\u001eF88";
        f7681[80] = "C\f\u0018,\tcC\f\u000fp\u0005lYG\u000fn\u0005y^6[4W=\t\n\u0000c\u0017yr^T3R";
        f7681[81] = "\u0017j=!|]\u0017j*}pR\r!*cpG\nP~9\"\u0001]l%nbG&8\u007f<'";
        f7681[82] = "\u0013?J\u0004\u0014t\u0013?]X\u0018{\tt]F\u0018n\u000e\u0005\t\u001cJ(";
        f7681[83] = "Pd`g0\u007f\f7py^\u044b79hab2\u00070zj ";
        f7681[84] = "h\"D+S\u007f?4Z$!\u04daRzL*\u001c>5<\u001ap!{<)[yL5-=\u0012I";
        f7681[85] = "#Pq\nd0h\u00072\u0018f\tuS<%`rfe-\foLwE;\bfda>y\u000fgu~E,Qupe>";
        f7681[86] = ".rNz\r\"=-\t$p!$7\u001fx\u001cHc!\u0011#\t/%wK\u001e\u0002u`+\u000ft\u0011*'ur";
        f7681[87] = "\\\u0010G(%d\u001aF\u001d\u00158n\u0005\u0011Xu\\3S\u0010\u001cz2\u007fX\u0002T\u0015";
        f7681[88] = "r{'J:2v:~JE16xx\u000eEc\"a\"\r\"%t;\u001f\u001d}-2zn\u0011u9=\u0002";
        f7681[89] = ",R\u0018\u007f\u0007'{D\u0006puv\u0016^E-\u001cmg\u000b\u0000,\u001e\u001f}\u000eNt\u0007n(KOvu";
        f7681[90] = "n\\2@Br9J,O0\u043eTP0G@%)YeP[";
        f7681[91] = "v1[&v]r<Is7.3go\"2DO9\b%1_unW{v\u0019O";
        f7681[92] = "\u000eef_6zYsxPD\u03b04}9X8s\u00048:D|";
        f7681[93] = "wz\u00138#\u001f l\r7Q\u0384M&\u001ea3\u00173!M!`";
        f7681[94] = "EzY;1g\u0003,\u0003\u00062m\u0002pSm%\u0000\u0002vK;ypK\u007fPhHx\u0018e\u0007781\u0011~T\u0006wn\u0019)Ca18C\u0014";
        f7681[95] = """
                    w.\u00010:U1x[\r8J,!\u001e\r|\\+}\u001bj:
                    q@\u001d4&NypX7:
                    H""";
        f7681[96] = "l\t>,8\u0007{\rq$\u0001\u0016d\u001ag.VB9L=z\u0001\u0011{Jm{~\u0006\u007f\u0005e";
        f7681[97] = "=\u000f\u0005Ec3!\u001b\u0006\u001d\t22v\b\u0019mocMX\u0010t'";
        f7681[98] = "t<F\u0016\bU2j\u001c+\u0014[79EF\n2t<F\u0016\bU2j\u001c+H\t1jFG\u0010S9;%";
        f7681[99] = """
                    \u000e[W\\N
                    XC\u0015\u0013@gX_Ud^%LUOjO\u0005ZYU-\u001c\rM\f\u0013HW
                    \u0006C\u0017-""";
        f7681[100] = "\u0010hAa\u0012OG~_n`\u0500*6\u001cyX\u0014FnFq\t";
        f7681[101] = "\u000eTFJ\u001aR@ER\u0003*\u040a2\u0005DP\u0017FUC\u0012\n*";
        f7681[102] = "';8)\u0017P'x\"=&\u0000/>\u0019>I\u0000/8]?H\u0001{sgg_\u0015sB";
        f7681[103] = "s[\u0010?~dr[\u000b>\u0019?p\\\u00108u\r'\u001fNn'Zt^M1 %cZ\u00029\u00194f@\u00108'5f[\u0011_";
        f7681[104] = "*( cEKl~z^@KQ!<3Fg|=.^\u0003Bv{:9E\u0014,F";
        f7681[105] = "9nj\"WS}s%j'Xa|~\u007fp\u000f8/\"\u0013\u001eIp jvZT?h";
        f7681[106] = """
                     t#\u001aSY&qs
                     W
                     T+)\u00051\u000f9-,\u0015C
                     i=(F1""";
        f7681[107] = "b\u007fjZT</w$\u0018=\u025f]~fF\u0005i32mTM\u0006";
        f7681[108] = "\u001b,\t9:EK%\u0010q\u0000\u0010J&\tmWG\u0014sP\u00011\u0011A:\u0017=|\u0019Lp";
        f7681[109] = "\u0002\u0002\u0000\u0001\u001faU\u0014\u001e\u000em38\u001a_\u0006\u0011h\b_\\\u001aU";
        f7681[110] = "\u0000\u0010[\u0011\u0015vFF\u0001,\u0002vE\u001bQPl.Q\u001d\u0005U\u000bh\u0007G8\\\u0010 Z\u001dWQ\u0015}O~\u0007B\u000f,F\u0019A\u0014U\u0011";
        f7681[111] = "I[f_]@\u000f\r<b_Z\u001cNy\u0018EA\u001955RJ\u001f\u0019[yYXWv\nk\u0001\u0019^\u0011L=[$";
        f7681[112] = "&K+}\u000b\u0003bVd5{\b~Y? ,_'\u000beLB\u0019o\u0005+)\u0006\u0004 M";
        f7681[113] = "tN\u000bB4\u0006cJDJ\r\u001cpLVKa.$\b\u0007\u0010<ywWKOlEb_PP\r\u0010c\rX\u0015r\u0007gBP,";
        f7681[114] = "Q[^BMa\u0006M@M?\u040akW\\EO6\u0016^\tRT";
        f7681[115] = "c>nOle'#!\u0007\u001cn;,z\u0012K9b\u007f'~%\u007f*pn\u001babe8";
        f7681[116] = "*\u0011.L`>:\u0018/F[t+\bVPbbz\u00191G\"`9t?\u0005*q>\u00053\r>~F";
        f7681[117] = "et\u0002~Evu}\u0003t~(dmzbG*5|\u001du\u0007(v\u0011";
        f7681[118] = "~t<\u001em{8\"f#ye<s;XUs'}%N_u:w_\u001cz\u007f|c8Z,%A#dY,\u007f-{>Q}\u001c";
        f7681[119] = "&;w!\u000f`.=e24d$#C)Pv._pyY7.8g9[tI";
        f7681[120] = "N}O\u0006$\\O}T\u0007C\u0007MzO\u0001/5\u001a9\u0011Wxb\u001fhL[:\u0005Y>\u0016f-\u0019@fHX,\u0019[g/";
        f7681[121] = "\u0007\u0016>jMAEByg A\u001dD&lw\u0014M\u0015~\u0000\u0019\u0017MY'f@\u0016\rL)";
        f7681[122] = "e\u001f,W 7.HoE\"\u000e3\u001cag,a:\u001cqy u'\u0018rQ\u0000h7\u0016qQ7\u000ee\u0011c^6\u007f>\u0001m\u00061\u000e";
        f7681[123] = "\t\u0006\u001bdeq\b\u0006\u0000e\u0002*\n\u0001\u001bcn\u0018^EK:<O\u000e\u0003Fj;0\u0019\u0007\tb\u0002";
        f7681[124] = "+\u0017\"4\fQv\u0016.*\b<yQ)1\u000eQ\u0012\u0014*;OEuR|ar\u0005.M(&\u001fX/A6\"r";
        f7681[125] = "/>{/\u0019\u0004k#4gi\u000fw,or>X.q3\u001eP\u001efp{{\u0014\u0003)8";
        f7681[126] = "^vLRqSWdG\u0010L\u000eIxM\u00130\u000e9oOT(\nE\u007f\u001a\t,cP-W\u00104\u0012\\%C\u001fL";
        f7681[127] = "\\DD\u001f\u001c0\u001d\u001d^I\u0003S\u001f\u0017FI+7\u00010^Y\u000f(eC\u0010K\u001d(_\u0014O\u0015ZneC\u0010YXcX\u0019\u0011J\u001bbe";
        f7681[128] = "\"\"\nL`pE\n\u0004\u0007?lH\u001bi\u001eeoZ%PM=6\"K\n\u0011~z\u0019MT\u0017xh\"\"\"";
        f7681[129] = "M~1S\n)\u0014;mOk\"Nod[<v\u00139<\rk.S3dV\u000ew\u0016ox";
        f7681[130] = "E^~I9BDMq\r\u0007\u0003&\u0002oS:VAD9\t\u0007\u0010H^<I`V\u001e\u0004\u0001";
        f7681[131] = "3\u000f\n:3\u0011q[M7^\u001a%L\u001672(u\fIo^\u00126\\\u001c+eG5RNP";
        f7681[132] = "3u*\u0013$\u00026y\u007f\u001dJ\u00040ypN#\b\twp^'nn%n\u001b)\u00026\u007ffJJ";
        f7681[133] = "MuQ;':\u0018v_i\\nMwf-&`Fd=n2b\u001drZ(d8 ";
        f7681[134] = "pLm@\u0001NlAcN>[sKk\u0017[ \u007fM7\u001b]OrHj\u000e>^6Tg\u001bP\u0018iQd~";
        f7681[135] = "\u0015ELB-f\u0002NR^Q0\t\u0003lT*$\r\u0010D9n1\u0007BP^(g]\u007f";
        f7681[136] = "j2c\u0012\bN2av\u0010\u001dq\u000e\u0005A<@qj51\u000b\u001f\u001f36`\u0016\b";
        f7681[137] = "Rn\u001c'C\u0015\u0005x\u0002(1\u04c1h2\u0011~S\u001d\u00165B>\u0000";
        f7681[138] = "aW7\u0015\u0016e6A)\u001ad\u049f[\u000b4\u001e]0\"Hm\u001e\u000f]d^2J\u001d:\"\bhwX37Ia\u001a\u0016\"#\u0000Q\b]8'\u0001aM^$c0";
        f7681[139] = "k\u0015\u0012sQ+n\u0019G}?9f\u001aQ.x)\u000fG\u00179\u0007$c\u001fM1VGk\u0015\u0012sQ+n\u0019G}?";
        f7681[140] = "l(fO\u0011\\*~<r\u0003\\5:l\u0013\u000e@S>g\u0003U\n#wn\u0018\u0006;j}\u007fJ\u000bW2'w\u001bh";
        f7681[141] = "=MT\u007ft\u001btJ\u001bi taNZby\u0018S\u001f\u001d?%M\u0004\u001aIx}Lv\\\u001b<#L\u0004";
        f7681[142] = "^eiQ@}\u0010t}\u0018p}\u001bvlL\u000b\u0010\u000f2h\u0014\u001dw\u0018rjWp)Yq=K\u001cq\u0003yl(";
        f7681[143] = "\u000fPoCSxAA{\nc|3\u0002mV\u001a%^L|BS";
        f7681[144] = "~~l=0kiz#5\tqz|14eC.8`l6\u0014.\u007f!byqjbn*\t}i=?jvjmr7S";
        f7681[145] = ":EM\u0013$1<Q_\u0013]'/Ce\u001e44\tXK\u0006:./YR~06.UUEe5 \u0007.";
        f7681[146] = "\u001bv\u001bT\u0010\u0014L`\u0005[b\u0131!z\u0019S\u0012C\\sLD\t";
        f7681[147] = "K\r){\u0018h\u0011\u000fs1\rU\u001b0-1\u0018jBO-|\u0000n\u00150-<\u00029\f]p=\u000e'\b0->Y6HW.?\ne\u00160+n\u0007h\u000bWm8]UM^w=\u001d2\u000b\b-\u0000]<\fA\u007fm\u000b$N\u000eq\u0000";
        f7681[148] = "(\u001c\u0011t YnJKI\"C}\t\u000e38XxrBy7\u0006x\u001c\u000er%N\u0017BB'aQy\u000eI5)>(\u001c\u0011t YnJKI";
        f7681[149] = "n8+v\u001c_nu3rK \u0011N\u0000\u0011vg\u0007XWp\u001d\\h9(pPDln";
        f7681[150] = "M2\u001bpE8\u00181\u0015\">fM0\u0017}RT\u001cwK%\u0006\u0003\u001f\"\u0014'GdYtN\u001aPx@,\u0010$Qx[-w";
        f7681[151] = "h\u0010C8\"Z.F\u0019\u0005:[;\u0013PB5=h\u0010C8\"Z.F\u0019\u0005k\r9FOk'\u0006+\u000e ";
        f7681[152] = "&h]|Y_=aR2+\\2mvkML2uYoG'f*G:HK>pOk+Ng`CzZBotL\u0002";
        f7681[153] = ".hUv\u0012Zh7Puw]6 u~\u000b_0QN|\u001a_`/\b{\u0015OPh\u000bmOW<0Qe\u001e4";
        f7681[154] = "\tz\t@p`WhV\u000b}\u001f]p\u0005]\u007fr0)\u0000Y.fWoV\u0003\u0013&\\(\u000eU}\u007f_y\u0013B\u0013 ^uSCtf\b/n";
        f7681[155] = "\u0002Q`F)&ZPz\u001aD7b\u0001oFyb\u0005G9\u001cD$\f]<\\#bZ\u0007\u0001";
        f7681[156] = "P\u0003h=\u0001\u0018CP\"|z\u001bKE\u007f>zI_\\%=\u001d\u000f\t\u0006\u00184\u0006GT\\w9\u0003\u001aA?q|\u000b\bIN}t\u001f\u00071";
        f7681[157] = "-9ae\u0010.w;;/\u0005\u0013\u0529\u0004e Qp.cf!\u0002#p";
        f7681[158] = "lGE\u001e+w*\u0011\u001f#,y7TKd<\u0010>\u0010K\u001f?w)PI\\R/=J\u001bZ5ik\u0010&";
        f7681[159] = "6Jb>n\u0006c\u0014p;u}jIp\"m\u0011X\u00182x4C\u000f\u001dn8m\u0005bV1$`\u0014\u000f";
        f7681[160] = "M-\rjxG\u0017'Tk!5?VtH\u0018\fO&CtjVE\u007fB-";
        f7681[161] = "Hg\n:+\u0019H$\u0010.\u001a\\@q\u000e1fKWE\u00026fGKq\u0014J#\u001dLw\u0006zaGNqSJs\u001e\\`\u0017;\u007f\u0016Hoo";
        f7681[162] = "\u0004dy'A\u0005Jumnq&86{2\bXUxj&A";
        f7681[163] = "Sy^\u001c4\u0019\u0005a\u001cS:t\u0005}\\$$/\u0016jA\u000b0tU~CP&\u0013\u0013(\u0019m";
        f7681[164] = "\r]|<m(\r\u0006&/\u000b\"^\u001b\u0003)w,]\u0006.'w,T\u0001\u0000'm$\\\n?N54\u000bY: 1uRYE";
        f7681[165] = "\"/$5z\tl>0|J\u001aw%5!1d'x0 r]y>+4sd";
        f7681[166] = "`)Er,\u0000#pE AU[wI\"x\u0014\"4\u0010\"*";
        f7681[167] = "H~*#p\u0019\u0005vda\u0019\u0543w\u007f&?!L\u00193--i#";
        f7681[168] = ">4\u0018ly3p%\f%I8k?\u0019\u0015v0ag\rr0f;Z";
        f7681[169] = "(,\u00158\r;+-FkS\\ioT[Ze|.E<M%~m(6\u000e1-\u007fO!N3n\u0012EbZ`|uR\"X#\u0011";
        f7681[170] = "u\u0012j\u00012/\"\u0004t\u000e@\u0409OJb\u0000}n(\f4Z@e-\u0018n\u0006~/qDhc";
        f7681[171] = "My3\u00113J\f*!Q\"'\u0416Ii\u001e2JL0m\u0013 \u001f\rI";
        f7681[172] = "tUAcH\u0018#C_l:\u0419NYCdJO3P\u0016sQ";
        f7681[173] = "i\u0000|\fyA$\bqF\u0003\u00185\u0013v\u001ao*aP*F\u0003\u001d1\u001fs\r<A4\u0012}}";
        f7681[174] = "\f|bd\u0014\u0000U}\"q\u001afP)/t\u0016\nbyi+AY5}j}\u0018\u0006\t+ksN[5-ke\u000f\u001eD!cq\u0000f";
        f7681[175] = "h\u0012\u00068/Mi\u0012\u001d9H\u0016k\u0015\u0006?$$?QVersk\u0017\n23H>\u0014\u0004`H\u001d}\t\u0006?v\u001c}\u0012\u0007X";
        f7681[176] = "T2@LTeU2[M3>W5@K_\f\u0000v\u001e\u001d\t[\u00036P\u001dC>G+\u001fU35A)@K\r4A2A,";
        f7681[177] = "I}\u000f,\rY\u001ek\u0011#\u007f\u0141sq\r+\u000f\u000e\u000exX<\u0014";
        f7681[178] = "\u000f(j/pxI~0\u0012rcY<uiV~L&\t-g|\r?nk1&0\u007f2h1|\\'h``\u001f";
        f7681[179] = ">hD\u000esy6nV\u001dH{=`u\u0012\"I<pR\u000e.}*\f\u0017T){8<U\u000e+}m\fGW9l)}K_-cQ";
        f7681[180] = "808Z(nb2b\u0010=S_\r<\u001fi0;j?\u001e:ce\r:O7nxj|\u0019mS";
        f7681[181] = "\u0006\u007fh:O\u0016]ofbHgGv};4^^$q:X\u001eOe)=4^^drhO[F/f=4";
        f7681[182] = "_Rec*z\bD{lX\u016be^gd(-\u0018W2s3";
        f7681[183] = "sprx(u/u\u007fvX/~ebz4\u001d*);'X'muhfcrn{:\u001d1rbgzl=zvh\u0002";
        f7681[184] = "('0Ju%it\"\ndH\u0443\u0017jEt%)nnHfph\u0017";
        f7681[185] = "FF}\u000f\u0010+\r\u0019a\u0002\u0001F\u0014Cb\u0010?\u007fG\u001b<hQ\"AN\u007f\u0019\u00126\u0007Huh";
        f7681[186] = "\u0010E\u0017#%bTXXkUbDF\u0007u9P\u0014\u0001V\u0012jiJ\u0007\u001eu,?\u0010:X|6:P]\u001e*l\u0007";
        f7681[187] = "_s\tkVF\u000fz\u0010#l\u0013\u000ey\t?;DP.QS\u0017B\u0013~\u0000=U\u0016Ts";
        f7681[188] = "\u0005.KgX\u0011N)\u0000(\\tS)MY]\u001a_yH>\u001bL\u0005D\b0\u001c\u0005W)^(^JYD";
    }
    
    public static Class m180(long n, long n2) {
        int m178 = m178(n, n2);
        Object o = Translate.f7681[m178];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(Translate.f7682[m178]);
                Translate.f7681[m178] = forName;
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
    
    public static Field m181(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m182(Class clazz, String s, Class clazz2) {
        Field m181 = m181(clazz, s, clazz2);
        if (m181 != null) {
            return m181;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m182 = m182(interfaces[i], s, clazz2);
                if (m182 != null) {
                    return m182;
                }
            }
        }
        return null;
    }
    
    public static Field m183(long n, long n2) {
        int m178 = m178(n, n2);
        Object o = Translate.f7681[m178];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        String s = Translate.f7682[m178];
        int index = s.indexOf(8);
        Class m179 = m180(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        String substring = s.substring(index, index2);
        ++index2;
        Class m180 = m180(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m179;
        while (true) {
            Field m181 = m181(clazz, substring, m180);
            if (m181 != null) {
                return (Field)(Translate.f7681[m178] = m181);
            }
            Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    Field m182 = m182(interfaces[i], substring, m180);
                    if (m182 != null) {
                        return (Field)(Translate.f7681[m178] = m182);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m179.getName()).append(' ').append(m180.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m180(1425767196823232L, 0L);
        }
    }
    
    public static Method m184(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m185(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m184 = m184(clazz, s, clazz2, n, array);
        if (m184 != null) {
            return m184;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m185 = m185(interfaces[i], s, clazz2, n, array);
                if (m185 != null) {
                    return m185;
                }
            }
        }
        return null;
    }
    
    public static Method m186(long n, long n2) {
        int m178 = m178(n, n2);
        Object o = Translate.f7681[m178];
        if (o instanceof String) {
            String s = Translate.f7682[m178];
            int index = s.indexOf(8);
            Class m179 = m180(Long.parseLong(s.substring(0, index), 36), 0L);
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
            Class m180 = null;
            int n5 = index2 + 1;
            for (int i = 0; i < n3; ++i) {
                int index4 = s.indexOf(8, n5);
                m180 = m180(Long.parseLong(s.substring(n5, index4), 36), 0L);
                if (i < n4) {
                    array[i] = m180;
                }
                n5 = index4 + 1;
            }
            Class superclass = m179;
            while (true) {
                do {
                    Method m181 = m184(superclass, substring, m180, n4, array);
                    if (m181 != null) {
                        return (Method)(Translate.f7681[m178] = m181);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m179;
                    while (true) {
                        Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                Method m182 = m185(interfaces[j], substring, m180, n4, array);
                                if (m182 != null) {
                                    return (Method)(Translate.f7681[m178] = m182);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            StringBuffer sb = new StringBuffer();
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
                        clazz = m180(1425767196823232L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m180(1425767196823232L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    public static MethodHandle m187(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType methodType, long n, long n2) {
        char char1 = s.charAt(0);
        Field m183 = null;
        Method m184 = null;
        try {
            MethodHandle target;
            if (char1 == '\u00ca' || char1 == 'J' || char1 == 'Y' || char1 == '\u00e3') {
                m183 = m183(n, n2);
                Class<?> declaringClass = m183.getDeclaringClass();
                String name = m183.getName();
                Class<?> type = m183.getType();
                if (char1 == '\u00ca') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == 'J') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == 'Y') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m184 = m186(n, n2);
                Class<?> declaringClass2 = m184.getDeclaringClass();
                String name2 = m184.getName();
                MethodType methodType2 = MethodType.methodType(m184.getReturnType(), m184.getParameterTypes());
                if (char1 == '\u00c4') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == 'S') {
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
            sb.append(ex.getClass().getName()).append(" : ").append((m183 != null) ? m183.toString() : ((m184 != null) ? m184.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static Object m188(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType newType, Object[] array) {
        int n = array.length - 2;
        MethodHandle m187 = m187(lookup, mutableCallSite, s, newType, (long)array[n], (long)array[++n]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m187, newType));
        try {
           return m187.asSpreader(Object[].class, array.length).invoke(array);
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
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Translate.m265:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
                    handle = ((CallSite)Translate.m265(lookup, "S", MethodType.methodType(TranslateOutput[].class, long.class, long.class))).dynamicInvoker();
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
        
        public static TranslateOutput[] invoke(long p0, long p1) {
            try {
                return (TranslateOutput[]) ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Translate.m177(lookup, "m", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)Translate.m177(lookup, "m", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)Translate.m177(lookup, "m", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Translate.m177(lookup, "m", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Translate.m177(lookup, "m", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_6.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
