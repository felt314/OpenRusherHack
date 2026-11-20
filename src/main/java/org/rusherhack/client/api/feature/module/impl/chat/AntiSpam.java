// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.Class536;
import org.rusherhack.Class484;
import org.rusherhack.Class507;
import org.rusherhack.Class253;
import org.rusherhack.Class066;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.client.api.config.Configuration;
import org.rusherhack.client.api.feature.module.Module;
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
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import java.util.Collection;
import java.util.Arrays;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.command.argument.StringCapture;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.core.serialize.ISerializable;
import java.util.Iterator;
import net.minecraft.client.network.PlayerListEntry;
import org.rusherhack.client.api.Globals;
import java.util.Map;
import java.util.HashMap;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.client.api.config.TextConfiguration;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.config;
import org.rusherhack.client.api.feature.hud.impl.Time;
public final class AntiSpam extends ToggleableModule
{
    private final BooleanSetting exclusions;
    private final Class484 f8572;
    private final BooleanSetting debug;
    private final BooleanSetting regex;
    private final BooleanSetting combine;
    private final Class484 f8576;
    private final NumberSetting<Long> time;
    private final StringSetting ignore;
    private final Class484 f8579;
    private final BooleanSetting friends;
    private TextConfiguration f8581;
    private final BooleanSetting words;
    private TextConfiguration f8583;
    private final BooleanSetting whispers;
    private final EnumSetting<AntiSpamMode> mode;
    private final NumberSetting<Integer> f8586;
    private final BooleanSetting blacklist;
    private final HashMap<String, Integer> f8588;
    private TextConfiguration f8589;
    private final BooleanSetting frequency;
    private static long f8591;
    private static String[] f8592;
    private static String[] f8593;
    private static Map f8594;
    private static long[] f8595;
    private static Integer[] f8596;
    private static Map f8597;
    private static long[] f8598;
    private static Long[] f8599;
    private static Map f8600;
    private static Object[] f8601;
    private static String[] f8602;
    
    private Class536 m16469(String s) {
        final long n = AntiSpam.f8591 ^ 0x1870F3E1A7EEL;
        final String[] split = s.split(" ");
        final int m9155 = Class253.m9155();
        String substring = null;
        final int n2 = m9155;
        boolean b = false;
        int n3 = 0;
        int i = 0;
    Label_0214_Outer:
        while (i < Math.min(split.length, 5)) {
            final String str = split[n3];
            final String s2 = substring;
            Label_0294: {
                if (n2 != 0) {
                    Label_0225: {
                        if (s2 == null) {
                            int startsWith;
                            final int n4 = startsWith = (str.startsWith("<") ? 1 : 0);
                            Label_0148: {
                                if (n2 != 0) {
                                    if (n4 == 0) {
                                        break Label_0148;
                                    }
                                    final boolean endsWith;
                                    startsWith = ((endsWith = str.endsWith(">")) ? 1 : 0);
                                }
                                if (n2 != 0) {
                                    if (n4 == 0) {
                                        break Label_0148;
                                    }
                                    startsWith = 1;
                                }
                                final String s3 = str;
                                substring = s3.substring(startsWith, s3.length() - 1);
                                final String s4 = s;
                                s = s4.substring(s4.indexOf(str) + str.length()).trim();
                                if (n2 != 0) {
                                    break;
                                }
                            }
                            final Iterator iterator = Globals.mc.player.networkHandler.getPlayerList().iterator();
                        Label_0214:
                            while (true) {
                                while (iterator.hasNext()) {
                                    String name = ((PlayerListEntry)iterator.next()).getProfile().getName();
                                    while (name.equalsIgnoreCase(str)) {
                                        final String s5;
                                        name = (substring = (s5 = str));
                                        if (n2 != 0) {
                                            break Label_0214;
                                        }
                                    }
                                    continue Label_0214_Outer;
                                }
                                String s5 = substring;
                                continue Label_0214;
                            }
                        }
                    }
                    str.toLowerCase();
                }
                boolean contains;
                i = ((contains = s2.contains("whisper")) ? 1 : 0);
                if (n2 != 0) {
                    if (i != 0) {
                        b = true;
                    }
                    final boolean endsWith2;
                    contains = (endsWith2 = str.endsWith(":"));
                }
                if (n2 == 0) {
                    continue;
                }
                if (contains) {
                    final String s6 = s;
                    s = s6.substring(s6.indexOf(str) + str.length()).trim();
                    if (n2 != 0) {
                        break;
                    }
                }
            }
            ++n3;
        }
        return new Class536(substring, s, b);
    }
    
    public String getMetadata() {
        final long n = AntiSpam.f8591 ^ 0x1A3F33C67107L;
        return this.mode.getDisplayValue();
    }
    
    private void m16470(final boolean b) {
        final long n = AntiSpam.f8591 ^ 0xC07016C051EL;
        if (Class253.m9154() == 0) {
            if (b) {
                this.f8589.write((ISerializable)this.f8572);
                this.f8583.write((ISerializable)this.f8579);
                this.f8581.write((ISerializable)this.f8576);
            }
            this.f8589.read((ISerializable)this.f8572);
            this.f8583.read((ISerializable)this.f8579);
            this.f8581.read((ISerializable)this.f8576);
        }
    }
    
    public AntiSpam() {
super("AntiSpam", "Filters spam from chat", ModuleCategory.CHAT);
        final long n = AntiSpam.f8591 ^ 0x1F05A351B59DL;
        this.mode = (EnumSetting<AntiSpamMode>)new EnumSetting("Mode", (Enum)AntiSpamMode.f1839);
        this.debug = new BooleanSetting("Debug", Boolean.valueOf(false)).setHidden(true);
        this.ignore = new StringSetting("Command", "ignore").setVisibility(() -> {
            final long n3 = AntiSpam.f8591 ^ 0x62CC1F78F760L;
            return ((Enum)((Setting)this.mode).getValue()).equals(AntiSpamMode.f1837);
        });
        final String s = "qqdvcoqr";
        final String s2 = "qqdvcoqr";
        this.exclusions = new BooleanSetting("Exclusions", Boolean.valueOf(true));
        this.friends = new BooleanSetting("Friends", Boolean.valueOf(true));
        this.whispers = new BooleanSetting("Whispers", Boolean.valueOf(true));
        this.combine = new BooleanSetting("Combine", Boolean.valueOf(false));
        this.frequency = new BooleanSetting("Frequency", Boolean.valueOf(true));
        this.f8586 = (NumberSetting<Integer>)new NumberSetting("Messages", (Number)5, (Number)1, (Number)20);
        this.time = (NumberSetting<Long>)new NumberSetting("Time", (Number)1000L, (Number)1L, (Number)10000L);
        this.blacklist = new BooleanSetting("Blacklist", Boolean.valueOf(false));
        this.words = new BooleanSetting("Words", Boolean.valueOf(true));
        this.regex = new BooleanSetting("Regex", Boolean.valueOf(true));
        this.f8588 = new HashMap<String, Integer>();
        this.f8572 = new Class484();
        this.f8579 = new Class484();
        this.f8576 = new Class484();
        this.f8589 = TextConfiguration.createConfiguration(StringCapture.$(s2), "exclusions").allowNewLines();
        this.f8583 = TextConfiguration.createConfiguration(StringCapture.$(s2), "wordblacklist").allowNewLines();
        this.f8581 = TextConfiguration.createConfiguration(StringCapture.$(s), "regexblacklist").allowNewLines();
        ((Setting)this.exclusions).addSubSettings(new Setting[] { (Setting)this.friends });
        ((Setting)this.frequency).addSubSettings(new Setting[] { (Setting)this.f8586, (Setting)this.time });
        final int m9154 = Class253.m9154();
        ((Setting)this.blacklist).addSubSettings(new Setting[] { (Setting)this.words, (Setting)this.regex });
        final int n2 = m9154;
        final Setting[] array = new Setting[/* invokedynamic(!) */0];
        array[0] = (Setting)this.mode;
        array[1] = (Setting)this.debug;
        array[2] = (Setting)this.ignore;
        array[3] = (Setting)this.exclusions;
        array[4] = (Setting)this.whispers;
        array[5] = (Setting)this.frequency;
        array[/* invokedynamic(!) */0] = (Setting)this.blacklist;
        ((Module)this).registerSettings(array);
        this.f8572.f7788.addAll(Arrays.asList("John200410", "RusherB0T", "LolRiTTeRBot", "ux1"));
        final boolean exists = ((Configuration)this.f8589).getFile().exists();
        if (n2 == 0) {
            if (exists) {
                final boolean exists2 = ((Configuration)this.f8583).getFile().exists();
                if (n2 == 0) {
                    if (exists2) {
                        final boolean exists3 = ((Configuration)this.f8581).getFile().exists();
                        if (n2 == 0 && !exists3) {}
                    }
                }
            }
        }
        this.m16470(exists);
    }
    
    @Subscribe
    private void m16472(final EventPacket$Receive p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          35722750585720
        //     6: lxor           
        //     7: lstore_2       
        //     8: invokestatic    org/rusherhack/Class253.m9155:()I
        //    11: istore          4
        //    13: aload_0        
        //    14: astore          5
        //    16: aload_1        
        //    17: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //    20: dup            
        //    21: astore_0       
        //    22: instanceof      Lnet.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
        //    25: ifeq            65
        //    28: goto            35
        //    31: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    34: athrow         
        //    35: aload_0        
        //    36: checkcast       Lnet.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
        //    39: astore          7
        //    41: aload           5
        //    43: aload           7
        //    45: invokevirtual   net.minecraft.network.packet.s2c.play.GameMessageS2CPacket.content:()Lnet.minecraft.text.Text;
        //    48: invokeinterface net.minecraft.text.Text.getString:()Ljava/lang/String;
        //    53: invokestatic    net.minecraft.util.Formatting.strip:(Ljava/lang/String;)Ljava/lang/String;
        //    56: invokevirtual   org/rusherhack/AntiSpam.m16469:(Ljava/lang/String;)Lorg/rusherhack/Class536;
        //    59: dup            
        //    60: astore          9
        //    62: goto            170
        //    65: aload_1        
        //    66: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //    69: dup            
        //    70: astore_0       
        //    71: instanceof      Lnet.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
        //    74: ifeq            120
        //    77: goto            84
        //    80: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    83: athrow         
        //    84: aload_0        
        //    85: checkcast       Lnet.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
        //    88: dup            
        //    89: astore          8
        //    91: invokevirtual   net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket.unsignedContent:()Lnet.minecraft.text.Text;
        //    94: dup            
        //    95: astore_0       
        //    96: ifnonnull       100
        //    99: return         
        //   100: aload           5
        //   102: aload_0        
        //   103: invokeinterface net.minecraft.text.Text.getString:()Ljava/lang/String;
        //   108: invokestatic    net.minecraft.util.Formatting.strip:(Ljava/lang/String;)Ljava/lang/String;
        //   111: invokevirtual   org/rusherhack/AntiSpam.m16469:(Ljava/lang/String;)Lorg/rusherhack/Class536;
        //   114: dup            
        //   115: astore          9
        //   117: goto            170
        //   120: aload_1        
        //   121: invokevirtual   org/rusherhack/client/api/events/network/EventPacket.getPacket:()Lnet.minecraft.network.packet.Packet;
        //   124: dup            
        //   125: astore_0       
        //   126: instanceof      Lnet.minecraft.network.packet.s2c.play.ProfilelessChatMessageS2CPacket;
        //   129: goto            136
        //   132: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   135: athrow         
        //   136: ifeq            169
        //   139: aload_0        
        //   140: checkcast       Lnet.minecraft.network.packet.s2c.play.ProfilelessChatMessageS2CPacket;
        //   143: astore          6
        //   145: aload           5
        //   147: aload           6
        //   149: invokevirtual   net.minecraft.network.packet.s2c.play.ProfilelessChatMessageS2CPacket.message:()Lnet.minecraft.text.Text;
        //   152: invokeinterface net.minecraft.text.Text.getString:()Ljava/lang/String;
        //   157: invokestatic    net.minecraft.util.Formatting.strip:(Ljava/lang/String;)Ljava/lang/String;
        //   160: invokevirtual   org/rusherhack/AntiSpam.m16469:(Ljava/lang/String;)Lorg/rusherhack/Class536;
        //   163: dup            
        //   164: astore          9
        //   166: goto            170
        //   169: return         
        //   170: getfield        org/rusherhack/Class536.f8627:Ljava/lang/String;
        //   173: astore          7
        //   175: aload           9
        //   177: getfield        org/rusherhack/Class536.f8626:Z
        //   180: ifeq            219
        //   183: goto            190
        //   186: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   189: athrow         
        //   190: aload           5
        //   192: getfield        org/rusherhack/AntiSpam.whispers:Lorg/rusherhack/core/setting/BooleanSetting;
        //   195: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   198: checkcast       Ljava/lang/Boolean;
        //   201: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   204: ifne            219
        //   207: goto            214
        //   210: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   213: athrow         
        //   214: return         
        //   215: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   218: athrow         
        //   219: aload           9
        //   221: getfield        org/rusherhack/Class536.f8625:Ljava/lang/String;
        //   224: dup            
        //   225: astore          8
        //   227: ifnull          397
        //   230: goto            237
        //   233: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   236: athrow         
        //   237: aload           8
        //   239: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   242: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   245: invokevirtual   net.minecraft.entity.player.PlayerEntity.getName:()Lnet.minecraft.text.Text;
        //   248: invokeinterface net.minecraft.text.Text.getString:()Ljava/lang/String;
        //   253: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   256: ifeq            267
        //   259: goto            266
        //   262: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   265: athrow         
        //   266: return         
        //   267: aload           5
        //   269: getfield        org/rusherhack/AntiSpam.exclusions:Lorg/rusherhack/core/setting/BooleanSetting;
        //   272: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   275: checkcast       Ljava/lang/Boolean;
        //   278: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   281: ifeq            397
        //   284: goto            291
        //   287: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   290: athrow         
        //   291: aload           5
        //   293: goto            300
        //   296: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   299: athrow         
        //   300: getfield        org/rusherhack/AntiSpam.friends:Lorg/rusherhack/core/setting/BooleanSetting;
        //   303: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   306: checkcast       Ljava/lang/Boolean;
        //   309: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   312: ifeq            347
        //   315: goto            322
        //   318: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   321: athrow         
        //   322: invokestatic    org/rusherhack/client/api/RusherHackAPI.getRelationManager:()Lorg/rusherhack/client/api/system/IRelationManager;
        //   325: aload           8
        //   327: invokeinterface org/rusherhack/client/api/system/IRelationManager.isFriend:(Ljava/lang/String;)Z
        //   332: ifeq            347
        //   335: goto            342
        //   338: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   341: athrow         
        //   342: return         
        //   343: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   346: athrow         
        //   347: aload           5
        //   349: getfield        org/rusherhack/AntiSpam.f8572:Lorg/rusherhack/Class484;
        //   352: invokevirtual   org/rusherhack/Class484.m15094:()Ljava/util/List;
        //   355: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   360: astore_0       
        //   361: aload_0        
        //   362: invokeinterface java/util/Iterator.hasNext:()Z
        //   367: ifeq            397
        //   370: aload_0        
        //   371: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   376: checkcast       Ljava/lang/String;
        //   379: astore          9
        //   381: aload           8
        //   383: aload           9
        //   385: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   388: ifeq            361
        //   391: iload           4
        //   393: ifeq            381
        //   396: return         
        //   397: iconst_0       
        //   398: istore_0       
        //   399: aload           5
        //   401: dup            
        //   402: getfield        org/rusherhack/AntiSpam.f8588:Ljava/util/HashMap;
        //   405: swap           
        //   406: getfield        org/rusherhack/AntiSpam.f8588:Ljava/util/HashMap;
        //   409: aload           8
        //   411: dup_x1         
        //   412: iconst_0       
        //   413: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   416: invokevirtual   java/util/HashMap.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   419: checkcast       Ljava/lang/Integer;
        //   422: invokevirtual   java/lang/Integer.intValue:()I
        //   425: iconst_1       
        //   426: dup            
        //   427: dup            
        //   428: pop2           
        //   429: iadd           
        //   430: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   433: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   436: pop            
        //   437: aload           5
        //   439: getfield        org/rusherhack/AntiSpam.f8588:Ljava/util/HashMap;
        //   442: aload           8
        //   444: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   447: checkcast       Ljava/lang/Integer;
        //   450: invokevirtual   java/lang/Integer.intValue:()I
        //   453: istore          9
        //   455: aload           5
        //   457: getfield        org/rusherhack/AntiSpam.frequency:Lorg/rusherhack/core/setting/BooleanSetting;
        //   460: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   463: checkcast       Ljava/lang/Boolean;
        //   466: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   469: ifeq            522
        //   472: goto            479
        //   475: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   478: athrow         
        //   479: iload           9
        //   481: goto            488
        //   484: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   487: athrow         
        //   488: aload           5
        //   490: getfield        org/rusherhack/AntiSpam.f8586:Lorg/rusherhack/core/setting/NumberSetting;
        //   493: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   496: checkcast       Ljava/lang/Integer;
        //   499: invokevirtual   java/lang/Integer.intValue:()I
        //   502: if_icmplt       522
        //   505: goto            512
        //   508: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   511: athrow         
        //   512: iconst_1       
        //   513: aload           5
        //   515: ldc_w           "message failed frequency check"
        //   518: invokevirtual   org/rusherhack/AntiSpam.m16473:(Ljava/lang/String;)V
        //   521: istore_0       
        //   522: iload_0        
        //   523: ifne            858
        //   526: goto            533
        //   529: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   532: athrow         
        //   533: aload           5
        //   535: getfield        org/rusherhack/AntiSpam.blacklist:Lorg/rusherhack/core/setting/BooleanSetting;
        //   538: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   541: checkcast       Ljava/lang/Boolean;
        //   544: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   547: goto            554
        //   550: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   553: athrow         
        //   554: ifeq            858
        //   557: goto            564
        //   560: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   563: athrow         
        //   564: aload           5
        //   566: goto            573
        //   569: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   572: athrow         
        //   573: getfield        org/rusherhack/AntiSpam.words:Lorg/rusherhack/core/setting/BooleanSetting;
        //   576: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   579: checkcast       Ljava/lang/Boolean;
        //   582: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   585: goto            592
        //   588: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   591: athrow         
        //   592: ifeq            711
        //   595: aload           5
        //   597: getfield        org/rusherhack/AntiSpam.f8579:Lorg/rusherhack/Class484;
        //   600: invokevirtual   org/rusherhack/Class484.m15094:()Ljava/util/List;
        //   603: invokeinterface java/util/Collection.stream:()Ljava/util/stream/Stream;
        //   608: invokedynamic   BootstrapMethod #3, apply:()Ljava/util/function/Function;
        //   613: invokeinterface java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        //   618: invokeinterface java/util/stream/Stream.toList:()Ljava/util/List;
        //   623: astore          6
        //   625: aload           7
        //   627: ldc             " "
        //   629: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   632: dup            
        //   633: astore          10
        //   635: arraylength    
        //   636: istore          11
        //   638: iconst_0       
        //   639: dup            
        //   640: istore          12
        //   642: iload           11
        //   644: if_icmpge       711
        //   647: aload           10
        //   649: iload           12
        //   651: aaload         
        //   652: astore          13
        //   654: aload           6
        //   656: aload           13
        //   658: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   661: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   666: ifne            688
        //   669: goto            676
        //   672: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   675: athrow         
        //   676: iload           4
        //   678: ifne            703
        //   681: goto            688
        //   684: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   687: athrow         
        //   688: aload           5
        //   690: iconst_1       
        //   691: aload           5
        //   693: ldc_w           "message failed word blacklist check"
        //   696: invokevirtual   org/rusherhack/AntiSpam.m16473:(Ljava/lang/String;)V
        //   699: istore_0       
        //   700: goto            713
        //   703: iinc            12, 1
        //   706: iload           12
        //   708: goto            642
        //   711: aload           5
        //   713: getfield        org/rusherhack/AntiSpam.regex:Lorg/rusherhack/core/setting/BooleanSetting;
        //   716: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   719: checkcast       Ljava/lang/Boolean;
        //   722: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   725: ifeq            858
        //   728: aload           5
        //   730: getfield        org/rusherhack/AntiSpam.f8576:Lorg/rusherhack/Class484;
        //   733: invokevirtual   org/rusherhack/Class484.m15094:()Ljava/util/List;
        //   736: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   741: astore          6
        //   743: aload           6
        //   745: invokeinterface java/util/Iterator.hasNext:()Z
        //   750: ifeq            858
        //   753: aload           6
        //   755: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   760: checkcast       Ljava/lang/String;
        //   763: astore          10
        //   765: aload           10
        //   767: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   770: astore          11
        //   772: aload           11
        //   774: goto            833
        //   777: astore          12
        //   779: aload           5
        //   781: aload           10
        //   783: ldc_w           "invalid regex pattern: "
        //   786: swap           
        //   787: invokedynamic   BootstrapMethod #4, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   792: invokevirtual   org/rusherhack/AntiSpam.m16473:(Ljava/lang/String;)V
        //   795: aload           5
        //   797: getfield        org/rusherhack/client/api/feature/module/Module.logger:Lorg/rusherhack/core/logging/ILogger;
        //   800: aload           10
        //   802: ldc_w           "Invalid regex pattern: "
        //   805: swap           
        //   806: invokedynamic   BootstrapMethod #4, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   811: iconst_1       
        //   812: dup            
        //   813: dup            
        //   814: pop2           
        //   815: anewarray       Ljava/lang/Object;
        //   818: dup            
        //   819: iconst_0       
        //   820: aload           12
        //   822: aastore        
        //   823: invokeinterface org/rusherhack/core/logging/ILog.error:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   828: aload           6
        //   830: goto            745
        //   833: aload           7
        //   835: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   838: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   841: ifeq            743
        //   844: iconst_1       
        //   845: aload           5
        //   847: ldc_w           "message failed regex blacklist check"
        //   850: invokevirtual   org/rusherhack/AntiSpam.m16473:(Ljava/lang/String;)V
        //   853: dup            
        //   854: istore_0       
        //   855: goto            859
        //   858: iload_0        
        //   859: ifeq            980
        //   862: aload           5
        //   864: goto            871
        //   867: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   870: athrow         
        //   871: getfield        org/rusherhack/AntiSpam.mode:Lorg/rusherhack/core/setting/EnumSetting;
        //   874: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   877: checkcast       Lorg/rusherhack/AntiSpamMode;
        //   880: invokevirtual   java/lang/Enum.ordinal:()I
        //   883: lookupswitch {
        //                0: 932
        //                1: 912
        //          default: 980
        //        }
        //   908: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   911: athrow         
        //   912: aload_1        
        //   913: iconst_1       
        //   914: dup            
        //   915: dup            
        //   916: pop2           
        //   917: invokevirtual   org/rusherhack/core/event/type/EventCancellable.setCancelled:(Z)V
        //   920: aload           5
        //   922: goto            929
        //   925: invokestatic    org/rusherhack/AntiSpam.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   928: athrow         
        //   929: goto            982
        //   932: ldc_w           ":c?5l"
        //   935: invokestatic    org/rusherhack/core/command/argument/StringCapture.$:(Ljava/lang/String;)Ljava/lang/String;
        //   938: iconst_2       
        //   939: anewarray       Ljava/lang/Object;
        //   942: dup            
        //   943: iconst_0       
        //   944: aload           5
        //   946: getfield        org/rusherhack/AntiSpam.ignore:Lorg/rusherhack/core/setting/StringSetting;
        //   949: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //   952: aastore        
        //   953: dup            
        //   954: iconst_1       
        //   955: dup            
        //   956: dup            
        //   957: pop2           
        //   958: aload           8
        //   960: aastore        
        //   961: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   964: astore          6
        //   966: getstatic       org/rusherhack/client/api/Globals.mc:Lnet.minecraft.client.MinecraftClient;
        //   969: getfield        net.minecraft.client.MinecraftClient.player:Lnet.minecraft.client.network.ClientPlayerEntity;
        //   972: getfield        net.minecraft.client.network.ClientPlayerEntity.networkHandler:Lnet.minecraft.client.network.ClientPlayNetworkHandler;
        //   975: aload           6
        //   977: invokevirtual   net.minecraft.client.network.ClientPlayNetworkHandler.sendChatCommand:(Ljava/lang/String;)V
        //   980: aload           5
        //   982: getfield        org/rusherhack/AntiSpam.f8588:Ljava/util/HashMap;
        //   985: aload           8
        //   987: iload           9
        //   989: iconst_1       
        //   990: dup            
        //   991: dup            
        //   992: pop2           
        //   993: iadd           
        //   994: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   997: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1000: pop            
        //  1001: getstatic       org/rusherhack/Class568.f9133:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
        //  1004: aload           5
        //  1006: aload           8
        //  1008: invokedynamic   BootstrapMethod #5, run:(Lorg/rusherhack/AntiSpam;Ljava/lang/String;)Ljava/lang/Runnable;
        //  1013: aload           5
        //  1015: getfield        org/rusherhack/AntiSpam.time:Lorg/rusherhack/core/setting/NumberSetting;
        //  1018: invokevirtual   org/rusherhack/core/setting/Setting.getValue:()Ljava/lang/Object;
        //  1021: checkcast       Ljava/lang/Long;
        //  1024: invokevirtual   java/lang/Long.longValue:()J
        //  1027: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //  1030: invokevirtual   java/util/concurrent/ScheduledThreadPoolExecutor.schedule:(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
        //  1033: pop            
        //  1034: return         
        //    StackMapTable: 00 4B FF 00 1F 00 05 07 02 B4 07 02 B6 04 01 07 00 02 00 01 07 01 DE 03 1D 4E 07 01 DE 03 FF 00 0F 00 08 07 01 F2 07 02 B6 04 01 07 00 02 00 00 07 01 FE 00 00 FF 00 13 00 05 07 02 B4 07 02 B6 04 01 07 00 02 00 00 4B 07 01 DE 43 01 20 FF 00 00 00 09 07 00 BB 07 02 B6 04 01 07 00 02 00 00 00 07 00 09 00 01 07 00 09 FF 00 0F 00 09 07 00 BB 07 02 B6 04 01 07 00 02 00 07 00 47 00 07 00 09 00 01 07 01 DE 03 53 07 01 DE 03 40 07 01 DE 03 FF 00 0D 00 09 07 00 BB 07 02 B6 04 01 07 00 02 00 07 00 47 07 00 47 07 00 09 00 01 07 01 DE 03 58 07 01 DE 03 00 53 07 01 DE 03 44 07 01 DE 43 07 00 02 51 07 01 DE 03 4F 07 01 DE 03 40 07 01 DE 03 FF 00 0D 00 09 07 00 94 07 02 B6 04 01 07 00 02 00 07 00 47 07 00 47 07 00 BB 00 00 FF 00 13 00 09 07 00 94 07 02 B6 04 01 07 00 02 00 07 00 47 07 00 47 07 00 47 00 00 FF 00 0F 00 09 07 00 BB 07 02 B6 04 01 07 00 02 00 07 00 47 07 00 47 07 00 BB 00 00 FF 00 4D 00 09 01 07 02 B6 04 01 07 00 02 00 07 00 47 07 00 47 01 00 01 07 01 DE 03 44 07 01 DE 43 01 53 07 01 DE 03 09 46 07 01 DE 03 50 07 01 DE 43 01 45 07 01 DE 03 44 07 01 DE 43 07 00 02 4E 07 01 DE 43 01 FF 00 31 00 0C 01 07 02 B6 04 01 07 00 02 07 01 BE 07 00 47 07 00 47 01 07 00 BC 01 01 00 01 01 FF 00 1D 00 0D 01 07 02 B6 04 01 07 00 02 07 01 BE 07 00 47 07 00 47 01 07 00 BC 01 01 07 00 47 00 01 07 01 DE 03 47 07 01 DE 03 0E FF 00 07 00 09 01 07 02 B6 04 01 07 00 02 00 07 00 47 07 00 47 01 00 00 41 07 00 02 FF 00 1D 00 09 01 07 02 B6 04 01 07 00 02 07 00 94 07 00 47 07 00 47 01 00 00 41 07 00 94 FF 00 1F 00 0A 01 07 02 B6 04 01 07 00 02 07 00 94 07 00 47 07 00 47 01 07 00 47 00 01 07 01 DE FF 00 37 00 0B 01 07 02 B6 04 01 07 00 02 07 00 94 07 00 47 07 00 47 01 07 00 47 07 02 57 00 01 07 02 57 FF 00 18 00 09 01 07 02 B6 04 01 07 00 02 00 07 00 47 07 00 47 01 00 00 40 01 47 07 01 DE 43 07 00 02 64 07 01 DE 03 4C 07 01 DE 43 07 00 02 02 2F 41 07 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  666    681    684    688    Ljava/lang/Exception;
        //  654    669    672    676    Ljava/lang/Exception;
        //  564    585    588    592    Ljava/lang/Exception;
        //  554    566    569    573    Ljava/lang/Exception;
        //  554    557    560    564    Ljava/lang/Exception;
        //  523    547    550    554    Ljava/lang/Exception;
        //  523    526    529    533    Ljava/lang/Exception;
        //  479    505    508    512    Ljava/lang/Exception;
        //  469    481    484    488    Ljava/lang/Exception;
        //  455    472    475    479    Ljava/lang/Exception;
        //  322    343    343    347    Ljava/lang/Exception;
        //  300    335    338    342    Ljava/lang/Exception;
        //  291    315    318    322    Ljava/lang/Exception;
        //  281    293    296    300    Ljava/lang/Exception;
        //  281    284    287    291    Ljava/lang/Exception;
        //  239    259    262    266    Ljava/lang/Exception;
        //  227    230    233    237    Ljava/lang/Exception;
        //  190    215    215    219    Ljava/lang/Exception;
        //  177    207    210    214    Ljava/lang/Exception;
        //  175    183    186    190    Ljava/lang/Exception;
        //  126    129    132    136    Ljava/lang/Exception;
        //  74     77     80     84     Ljava/lang/Exception;
        //  22     28     31     35     Ljava/lang/Exception;
        //  765    772    777    833    Ljava/lang/Exception;
        //  859    864    867    871    Ljava/lang/Exception;
        //  862    908    908    912    Ljava/lang/Exception;
        //  871    922    925    929    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0190:
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
    
    private void m16473(final String s) {
        final long n = AntiSpam.f8591 ^ 0x1A9EF5A6E111L;
        if (((Boolean)((Setting)this.debug).getValue())) {
            ChatUtils.print(s);
        }
    }
    
    public void onEnable() {
        final long n = AntiSpam.f8591 ^ 0x25262D5FFE9BL;
        this.m16470(false);
    }
    
    static {
        try {
        f8591 = Class066.m4320(-5233462726101898237L, 5452432769458153966L, (Object)MethodHandles.lookup().lookupClass()).m4325(217710566474150L);
        f8601 = new Object[180];
        f8602 = new String[180];
        m179();
        f8594 = new HashMap(13);
        final long n = AntiSpam.f8591 ^ 0x263DA236648AL;
        final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        final int opmode = 2;
        final SecretKeyFactory instance2 = SecretKeyFactory.getInstance("DES");
        final byte[] key = new byte[8];
        key[0] = (byte)(n >>> 56);
        for (int i = 1; i < 8; ++i) {
            key[i] = (byte)(n << i * 8 >>> 56);
        }
        instance.init(opmode, instance2.generateSecret(new DESKeySpec(key)), new IvParameterSpec(new byte[8]));
        final String[] f8603 = new String[33];
        int n2 = 0;
        String s;
        int n3 = (s = """
                      '\u001b\u0014\u008e\u00cb\u0006\u009c\u0089\u00c2-´\u001c½\u0094z\u00dd\u0010\u00dbo¹O¶;\u00d0\u00fdb\u00fa\u00d6	\u00e9\u0006"\u00e2\u0018@\u0094\u00ce\u00e5¿\u0081\u00e3\\®u\u0094\u008aC\u00d5m\u00eb\u00c5HG\u009b\u00cf=¬\u00e3\u0018,\u0000\u009cq$¿i\u00d6\u00e7B\u00ca\u0099P_\u00cef\u007f\u00e7\u00e3c\u008d®\u000b+(½\u001c);\u009d\u0095m\u00f6¤\u00f7\u00f5\u00e8\u00f9"\u00da\r\u00d5,^\u0010#¯Gyp[\u000b\u00d5\u0081\u00f5n©²¦:\u00dc\u00f2\u00d8@\u00f9\u0018\u0081\u0090'\u00f6~\u0081E\u000e\u00e2\u001c\u0019)\r\u00e6\u00f7.\u00c5\u00d1h}°K\u00f5\u0001(\u0092,d\u0084r¤\u00f4Z\u00ea\u0014\u00db\u00ee\u00d8\u00ea\u00e9®,¶\u000e\u000fl\u0097\u000b\u00e5¡g·\u009c\u0015\u00f4H¢\u00c6t¾°\u00e7\u00043¯ 5\u001a\u008fx\u00fa\u0004\u00e8ogc«\u000e\f\u0000¦\u00cf\u00e7\u009f\u00c0rLZ{¨b\u0004\u00e0\u00ef\u00f3K\u0095\u001b\u0010¾\u00872\u00f9mH\u00c0\u00dd\u00c8\u00cfF\u0092\u0097e\u00e5]\u0018«\u00ad\u00f3BrQ1T\u001bCDG!\u00c7kt8\u0081µ\u0001\u0016L\u0095H\u0010\u00fbI\u00e9\u00d6\u0004\u00f4%,\u0013\fy²(\u00db\u00da8\u0010\u0014ac³\u00fc\u00d6\u00f5{O#«k\u00db\u00c5\u0092L \u00d0\u00e4\u0011\u0096\u0006\u00f1²\u009b\u00f9\u0016\u009eT\u0093\u00e0Q°lZw\u00e7\u00fa\u000bd6J\u008c\u0019\u0096»{\b\u0002\u0010\u00e7\u00c2\u008b\u00c4\u00d6\u00ff6\u0094\u0015\u008d\u0086\u00f5\u0099=\u008f\u0085\u0010\u00da\u001eH#J\\u00c1%\u00ea\u00c1\u00fb\u00ce\u001d\u008dO\u000f\u0018H¤v'nW\u009e\u001dv\u00e7\u00f7u\u0095\u00f6<~ABl\u001bµb@¾\u0018\u0093))\u00c1\u00cce¾\u0004\u00d0Lp³\u00f7\u00fc\u00c9¹R\u00ec\u0098¼\u001bA\u0005\u00df\u0018:J *\u0017\u00df§\u00ffJ%w\u00d6\u0095½\u001e{\u009a\u00df \u00e9\u00d3+\u0006&@\u00fe\u008c\u001f\u0004\u00c9h*\u00ed!\u0099"¬\u00de#\u0010\u00905\u00eczKRy.\u0001\u009e\u009c\u00cfKN\u00d2^
                      TO\u000f\u0018\u0010¡x·Vl¢\u0082}½{\u00ef\u00da1\u0087\u00e7h\u0082\u00fd,"^\u00d7\u00078²\u0016\u0093\u0010\u0087WK³\u00e4\u00da,½\u001b`§\u0016\u00dab\u00e4\u0010 \u0014\u000f\u001c³\u00d9\u0086mP\u00df\u0000L\u009e\u00d3\u0095\u000f¶A\u00d5\u00f0\u00e7VºP\u008ce\u001b®"\u0091S\u0086\u0093\u0010\u0097®\u0088\\u000ex\u0019\u00f2\u0081\u0081\u008d·¤\u00dcE\u00ec@\u0090\u00dc\u00c9\u00ff\u009c\u00dd\u00ccm\u00c1\u007f\u0094\u0091LA\u001fl\u00d60n\u001e~¬¤\u00e1\u0019\u00cb®\u009b \u008f\u00f2$\u001e¿L xvuªcO\u0083Q\b_V¥,}T]\u0013Tv\u00ed¸K\u00e1\u00d8\u00dd[\u0098¡\u0010\u0089%H\u00ca¿\u008cr\u000f\u00049\u00e1q\u00ecN4\u007f\u0010>U1\u00f2\u00eb:¨&\u00f6\u0080\u0087T0\u00da2U(n´\u0087Q»°\u0096±\u00d2\u0015lj\u00c0\u00ec\u0094\u001b\u00f2\u00f0\u008d@
                      \u00c6³\u0019\u0082\u007f\u0085\u008b\u00cdg]|\u001d\u00f4u\u00d6n\u00cf\u0003º \u00efR\b\u00e5M\u0001\u0089d\u00ec7V±\u00ef\u00ce\u00cd(\u009b7G]A=\u000bTR\u00d1\u00db\f\u0085\u00eaJo )\u00ad\u00f7\u0080\u00d27\u00c5\u0099n\u008fp\u0019\u00da3\u00937\u0095\u00ff\u00f6½\u00d2¶;\u0088\u00e8i=\u00ad\u00fa\u00d4\u00df\u00f8\u0018¬\u00eb»N¢\u00f0\u009e\r²\u0016\u00c1\u00c3\u00ceA\u0015\u0096D
                      \u00ff\u009a0K \u0099(\u00e8\u0007A«\u00d4\u00cc%\u001ew\u0010 x/\u0094\u00c4\u00db\f\u008bP
º\u00fe]k.P´§\u0001FhD\u007f'¢\u00da\u0080\u00c2\u00cc¬\u0018$\u00f1\u008d.¸\u00e2.G\u0092\u008fZ\u0086:\u00ec1¥\u00c8^\u00ec\u00e6\u00d0°n:""").length();
        int n4 = 16;
        int n5 = -1;
    Label_0184:
        while (true) {
            while (true) {
                ++n5;
                final String s2 = s;
                final int beginIndex = n5;
                String s3 = s2.substring(beginIndex, beginIndex + n4);
                int n6 = -1;
                while (true) {
                    final String intern = m221(instance.doFinal(s3.getBytes("ISO-8859-1"))).intern();
                    switch (n6) {
                        default: {
                            f8603[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                continue Label_0184;
                            }
                            n3 = (s = "\u00d2'\u001d¾\u0098MO\u00c2\u00c3|\u00cc2\u00cc\u000f±\u001f\u00eb\u00ee\u0084'\u00ca½\u00c8m0\u00fe\u001c¹\u0019\u0095\u0087«\u00d7¿\u00c8\u00df3,\u00c4\u00ef\u00da¾y\u00cb©\u00eb³W\u00fa\u00dd-xµ\u0087\u0018¹\u0010\u00cd`!\u00e8²\u0000{\u00eb\u00ce\u00f2 \u001f{b\u00eeZ").length();
                            n4 = 56;
                            n5 = -1;
                            break;
                        }
                        case 0: {
                            f8603[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                break;
                            }
                            break Label_0184;
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
        f8592 = f8603;
        f8593 = new String[33];
        f8597 = new HashMap(13);
        final Cipher instance3 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode2 = 2;
        final SecretKeyFactory instance4 = SecretKeyFactory.getInstance("DES");
        final byte[] key2 = new byte[8];
        key2[0] = (byte)(n >>> 56);
        for (int j = 1; j < 8; ++j) {
            key2[j] = (byte)(n << j * 8 >>> 56);
        }
        instance3.init(opmode2, instance4.generateSecret(new DESKeySpec(key2)), new IvParameterSpec(new byte[8]));
        final long[] f8604 = new long[3];
        int n7 = 0;
        final String s5;
        final int length = (s5 = "\u0017S4\u0007\u00fd\u0011\u00c5\u0003jG<a(§\u0083\u00f1\u0011\u00c6\u00f6V\u00f1\u000b\u00f4\t").length();
        int k = 0;
        do {
            final String s6 = s5;
            final int beginIndex3 = k;
            k += 8;
            final byte[] bytes = s6.substring(beginIndex3, k).getBytes("ISO-8859-1");
            final long[] array = f8604;
            final int n8 = n7++;
            final long n9 = ((long)bytes[0] & 0xFFL) << 56 | ((long)bytes[1] & 0xFFL) << 48 | ((long)bytes[2] & 0xFFL) << 40 | ((long)bytes[3] & 0xFFL) << 32 | ((long)bytes[4] & 0xFFL) << 24 | ((long)bytes[5] & 0xFFL) << 16 | ((long)bytes[6] & 0xFFL) << 8 | ((long)bytes[7] & 0xFFL);
            final byte[] doFinal = instance3.doFinal(new byte[] { (byte)(n9 >>> 56), (byte)(n9 >>> 48), (byte)(n9 >>> 40), (byte)(n9 >>> 32), (byte)(n9 >>> 24), (byte)(n9 >>> 16), (byte)(n9 >>> 8), (byte)n9 });
            array[n8] = (((long)doFinal[0] & 0xFFL) << 56 | ((long)doFinal[1] & 0xFFL) << 48 | ((long)doFinal[2] & 0xFFL) << 40 | ((long)doFinal[3] & 0xFFL) << 32 | ((long)doFinal[4] & 0xFFL) << 24 | ((long)doFinal[5] & 0xFFL) << 16 | ((long)doFinal[6] & 0xFFL) << 8 | ((long)doFinal[7] & 0xFFL));
        } while (k < length);
        f8595 = f8604;
        f8596 = new Integer[3];
        f8600 = new HashMap(13);
        final Cipher instance5 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode3 = 2;
        final SecretKeyFactory instance6 = SecretKeyFactory.getInstance("DES");
        final byte[] key3 = new byte[8];
        key3[0] = (byte)(n >>> 56);
        for (int l = 1; l < 8; ++l) {
            key3[l] = (byte)(n << l * 8 >>> 56);
        }
        instance5.init(opmode3, instance6.generateSecret(new DESKeySpec(key3)), new IvParameterSpec(new byte[8]));
        final long[] f8605 = new long[2];
        int n10 = 0;
        final String s7;
        final int length2 = (s7 = "\u00e3\u00f4®°\u008d²¸²\u00ee\u00c3/\u00e5Y\u00f6\u00d4\u0094").length();
        int endIndex = 0;
        do {
            final String s8 = s7;
            final int beginIndex4 = endIndex;
            endIndex += 8;
            final byte[] bytes2 = s8.substring(beginIndex4, endIndex).getBytes("ISO-8859-1");
            final long[] array2 = f8605;
            final int n11 = n10++;
            final long n12 = ((long)bytes2[0] & 0xFFL) << 56 | ((long)bytes2[1] & 0xFFL) << 48 | ((long)bytes2[2] & 0xFFL) << 40 | ((long)bytes2[3] & 0xFFL) << 32 | ((long)bytes2[4] & 0xFFL) << 24 | ((long)bytes2[5] & 0xFFL) << 16 | ((long)bytes2[6] & 0xFFL) << 8 | ((long)bytes2[7] & 0xFFL);
            final byte[] doFinal2 = instance5.doFinal(new byte[] { (byte)(n12 >>> 56), (byte)(n12 >>> 48), (byte)(n12 >>> 40), (byte)(n12 >>> 32), (byte)(n12 >>> 24), (byte)(n12 >>> 16), (byte)(n12 >>> 8), (byte)n12 });
            array2[n11] = (((long)doFinal2[0] & 0xFFL) << 56 | ((long)doFinal2[1] & 0xFFL) << 48 | ((long)doFinal2[2] & 0xFFL) << 40 | ((long)doFinal2[3] & 0xFFL) << 32 | ((long)doFinal2[4] & 0xFFL) << 24 | ((long)doFinal2[5] & 0xFFL) << 16 | ((long)doFinal2[6] & 0xFFL) << 8 | ((long)doFinal2[7] & 0xFFL));
        } while (endIndex < length2);
        f8598 = f8605;
        f8599 = new Long[2];
    
        } catch (Exception exception) {
            throw new ExceptionInInitializerError(exception);
        }
    }

    private static String m221(final byte[] array) {
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

    private static void m179() {
        final Object[] f8601 = AntiSpam.f8601;
        f8601[0] = "-'\u0004@\u001a\u0003&(\u0015\u000fv\u0000(*\u0017@Z";
        f8601[1] = Boolean.TYPE;
        AntiSpam.f8602[1] = "java/lang/Boolean";
        f8601[2] = "\u000bL_{Q{\u0017V]'Ko\u0007U\u0016\u048e";
        f8601[3] = "}\rkQW0v\u0002z\u001e<$t\tmD\u00103y";
        f8601[4] = "t%-\u00025\"h?/^/6x<dO(%~y9I3#r9-\u0002\u00058t;/M)\u0004~#>E)0";
        f8601[5] = "\u007f$9`Z4c>;<@ s=p-D(u8*`I1yx+:A-cx\u001d&I5E\"7\"[";
        f8601[6] = "\u0018$\u0011!m]\u0013+\u0000n\u0010E\u0000,\t'";
        f8601[7] = Void.TYPE;
        AntiSpam.f8602[7] = "java/lang/Void";
        f8601[8] = "\u0012k%7gX\u000eq'k}L\u001erlzz_\u001871|aY\u0014w%7FH\tm+wr";
        f8601[9] = "\u00185cu>\u0012\u0013:r:_\u001c\u00181v`";
        f8601[10] = "%'* \u001cl%'=|\u0010c?l=b\u0010v8\u001di:B<";
        f8601[11] = "A5l\u000e5wA5{R9x[~{L9m\\\u000f*\u0015n/";
        f8601[12] = "X6:weTS9+8\u0007W\\0";
        f8601[13] = Long.TYPE;
        AntiSpam.f8602[13] = "java/lang/Long";
        f8601[14] = """
                    .V`\u001f 
                    2LbC:\u001e"O)R>\u0016$Js\u001f3\u000f(
                    tH!\u000b$I)x\u0000\u001a-EsX=\u0011\fEiP5\u001a3""";
        f8601[15] = ")N}@x55T\u007f\u001cb!%W4\re2#\u0012i\u000b~4/R}@D5+^\u007f\u001cY%2Hs\u0000m";
        f8601[16] = "{V+v\u007fagL)*euwOb\u04ba";
        f8601[17] = "\u001e/sc\u0012l\u0000'i,tx\u0007&HcL";
        f8601[18] = "QT\u0011\"\u000e\bMN\u0013~\u0014\u001c]MXo\u0013\u000f[\b\u0005i\b\tWH\u0011\"9\u0013KK%i\b\tWH\u0011";
        f8601[19] = "zcL@X:dkV\u000f\u0005;bg[LX\u001cdp_@\u001b";
        f8601[20] = "Jg|\u0002]\u001cTofM?\u0000Sr";
        f8601[21] = "/Wc p\u0002/Wt||\r5\u001ctb|\u00182m :.S";
        f8601[22] = """
                    ^3\u0013H\u001f\u001aB)\u0011\u0014\u0005\u000eR*Z\u0005\u0002\u001dTo\u0011\u0010\b\u0001Eo\u0000\u001f\u001d
                    \u001f\u0004\u0002\u0003\u0003\u001br \u001a\u0005\b\u0003] \u0016
                    \b""";
        f8601[23] = "e\u0018`\u0011_nn\u0017q^8l{\u001cq\u0015\u0003";
        f8601[24] = Integer.TYPE;
        AntiSpam.f8602[24] = "java/lang/Integer";
        f8601[25] = ":\u000e&\u001a~\u0002$\u0006<U\"\u00127\n(U\u0000\u0016$\u001b5\t>";
        f8601[26] = "\u000bg\u0007nwO~G\faf\u0000\u0003_\u001ffoIk";
        f8601[27] = "\u000b\u001a -\u0004\u0019\u0017\u0000\"q\u001e\r\u0007\u0003i`\u0019\u001e\u0001F+l\u0011\u000b\r\u0006 -? \u000b\u000f";
        f8601[28] = "H:(,t}=\u001a##e2\\\u0014((ah(";
        f8601[29] = "\u0019d\u000f\u000fd\"\u0005~\rS~6\u0015}FBz>\u0013x\u001c\u000fw'\u001f8\rWs9\u0002eFOs#\u0001y\u001aJ8\u0012\u0000s\u0006UF6\u0015}\rU";
        f8601[30] = "\u000b\u0000cST\u0002\u000b\u0000t\u000fX\r\u0011Kt\u0011X\u0018\u0016:%H\u0000]";
        f8601[31] = "?+3P\u0005e#11\f\u001fq32z\u040f";
        f8601[32] = "\u001a4J[\f\u0003\u0004<P\u0014P\u0013\u00170D\u0014o\u0017\u00046T_P";
        f8601[33] = "D \u001f\u0002?\u0017X:\u001d^%\u0003H9VO\"\u0010N|\u000bI9\u0016B<\u001f\u0002\u001e\u0016Y;\u0016K\u001e\u0007_&\u0011B*";
        f8601[34] = "\u0003~\u0013p\u001cY\u001fd\u0011,\u0006M\u000fgZ=\u0002E\tb\u0000p\u000f\\\u0005\"32\u0001N\r`\u0007";
        f8601[35] = "$\u001b\u0006\u0015{b$\u001b\u0011Iwm>P\u0011Wwx9!A\n&";
        f8601[36] = "s\"LwU'o8N+O3\u007f;\u0005\u0568";
        f8601[37] = "=vQFB/#~K\t\u000f59tRU\u001e?9c\tt\u000f22sRK\t>\u0003\u007fUB\r>\u0007xHK)\"2tRS\u0003(";
        f8601[38] = "_\u0007M\u0000\u0007]_\u0007Z\\\u000bRELZB\u000bGB=\u000f\u001d^";
        f8601[39] = "2 \u0017\u001fcY,(\rP\u0004X=3\u0000\n\"^";
        f8601[40] = "\u0015\u0010:1b~\u001e\u001f+~\u001eg\u0011\u001f-2 w";
        f8601[41] = "\u00193VFp:\u0007;L\t= \u001d1UU,*\u001d&\u000es7\"\u0016\u0007NN*";
        f8601[42] = "I\u0010\u0017:\u0000\u0017W\u0018\ruM\rM\u0012\u0014)\\\u0007M\u0005O\bM\nF\u0015\u00147K\u0006e\u0004\u0015.\\\u0007";
        f8601[43] = "Iq\u00141PHUk\u0016mJ\\Eh]t";
        f8601[44] = "\u0014u\u0003<_2\bo\u0001`E&\u0018lJ\u04b2";
        f8601[45] = "\\q3OHc@k1\u0013RwPhz\u0267";
        f8601[46] = "TJ\u001ew\u007f !j\u0015xno@d\u001esj54";
        f8601[47] = "\u0007`#-@h\u0007`4qLg\u001d+4oLr\u001aZ`;\u001f6";
        f8601[48] = "\u001a\u0001,q]i\u0006\u001b.-G}\u0016\u0018e<@n\u0010](0Bq\u0014\u001d/qNn\u0012\u0006&:Ah[ ?-Fr\u00120*/[i\u0007\u0016";
        f8601[49] = "\u0015;\t$uz\u0015;\u001exyu\u000fp\u001efy`\b\u0001J>.";
        f8601[50] = "rt*sAMl|0<\tMvv({\u0000V6S)|\fLqz2";
        f8601[51] = "1\u0018?/:|:\u0017.`Wx:\u000b\u001a+ee>\u0017*+";
        f8601[52] = "\u007f2\u0003Yb\u0010c(\u0001\u0005x\u0004s+J\u0014|\fu.\u0010Yq\u0015yn\u0002\u0012q\u0011e2\u0001Y}\nt5\b\u0012>(\u007f$\u0011\u001bu";
        f8601[53] = "1Od\f|{-UfPfo=V-Aa|;\u0013oMii7Sd\fGB1ZdG|";
        f8601[54] = "\t\\ZgP\u001f\u0015FX;J\u000b\u0005E\u0013*N\u0003\u0003@IgC\u001a\u000f\u0000o<Q\u0002\u0003\\u(A\u0001'~t";
        f8601[55] = "'G\u001as<\u0011'G\r/0\u001e=\f\r10\u000b:}_oe";
        f8601[56] = "Or=\u0017\u0018CQz'XuYI\u007f.\u0015B_J}";
        f8601[57] = "JEO[\u001d AJ^\u0014~-TL";
        f8601[58] = "~j\u00054:Kwd\u0006}yEhq\u0000v>F3B\tw2toj\u000es;A";
        f8601[59] = "-\u0018\u007f-Uq-\u0018hqY~7ShoYk0\"=7\b";
        f8601[60] = """
                    b\u0010Y=\u001e\u0002~
                    [a\u0004\u0016n	\u0010p\u0000\u001eh\fJ=\r\u0007dL]|\u0002\u0011d\u0005\u0010G	\u000fy!Q}
                    \u001ej\u0017Lr\u0018\u001eb\f""";
        f8601[61] = "=z\u0011[\u001fG!`\u0013\u0007\u0005S1cX\u0016\u0002@7&\u0005\u0010\u001f[3d\u001f\u000f\b\u001c\u001b[\u0013\u0007\u0004S>a\f\u0014\u000f^7";
        f8601[62] = "\u001f\u0018f8\u001e\u001a\u0001\u0010|wV\u001a\u001b\u001ad0_\u0001[;y\u001fE\u0001\u0016\ry6^";
        f8601[63] = "Zg\u0018drxDo\u0002+\u001d\u007fBg\u0017v";
        f8601[64] = "\u001b\u00163D#<n68K2s\u000f83@6){";
        f8601[65] = "uSwq\u0006S\\jkk\u0004\u000fF~{hO\u001eAm}-\u0012\u0018Zkqm\u0006S}zlw\b\u0013I$";
        f8601[66] = "*8C4]`/ws<\u001fl";
        f8601[67] = "_\u0018jw_lA\u0010p8\u0017l[\u001ah\u007f\u001ew\u001b;sy\u001d|T\u0017Oc\u0001iY\u0010yd";
        f8601[68] = "qm\u0003d&\u001bmw\u00018<\u000f}tJ)8\u0007{q\u0010d5\u001ew1\u0002/5\u001akm\u0001d9\u0001zj\b/z#q{\u0011&1-\u007fk\u0001-;\u001cg";
        f8601[69] = "Hv:x\fKaO&b\u000e\u0017{[6aE\u0006|H0$\u0018\u0000gN<d\fK@_!~\u0002\u000bt\u0001";
        f8601[70] = "O\u0001%S\u001d\u0016S\u001b'\u000f\u0007\u0002C\u0018l\u001e\u0003\nE\u001d6S\u000e\u0013I]!\u0012\u0001\u0005I\u0014l>\u0000\rF\u001a%\b\u001d\u0002T\u001a-\u0013";
        f8601[71] = "bBVR\u0015o,APPrd5I\u00023\u001bd/Bm\\\u001f\u007fh\u0013\r\u001cN>4/";
        f8601[72] = ":\\A]c7{XD\bYa`\u000f\u0007f8pfc@\u0006dh<X\u0001\u0002a=\u0006\u0013@^309X\u0003BY";
        f8601[73] = "\u0000Y[q\u0001\u0007\\MItl\u0000\u0000Klv\biU\u001c\u0018iW\u0000\u0013_E#\u001ei\u001c\u001bBxPVWX^\u0012";
        f8601[74] = """
                     SHVo aWM\u0003U\u007fq
                    \u001aN5\u001bs
                    	Kn%\u007fU\u001cWU""";
        f8601[75] = "\u00184|+GNY6&p9\u0162\"d}<[RX4s;]";
        f8601[76] = "\u001dNi\u0017-v\\L3LS\u020d'Lf\r?-@\u0006aB*";
        f8601[77] = "G\u0018\u0006\u0006`\nI\u000f\fS\u0011\u01ce#\u0005\u0018Dr[MY\fVw";
        f8601[78] = "\u0011=SIP:\u0015-E\b3\u017f{k\u000b\u0004W:@*\u000f\u0001\u0002";
        f8601[79] = "\u001c\u0015IsI\u000e]\u0017\u0013(7\u02e6&@\u0012e\u0006\u0014W^S`E";
        f8601[80] = "\u0012|<u\u0002W\u0016l*4a\u038bx*d8\u0005WCk`=P";
        f8601[81] = "}@\\\\Udc\u0001Y\u001f,z|\u0001m\fWmu\u0014P3Eql\u0010!Q\u0013(uG\u001a\u0010\u0017- }";
        f8601[82] = "\u000b\u000fQ\u001di\u0006U\fWWP\u0003\u0003\u0001q\u00044\u001f\b}@\u000b,\u001b^CLT9\u0007e";
        f8601[83] = "H6E\u000f\u00130\t4\u001fTm\u04c9r4J\u0015\u0001k\u0015~MZ\u0014";
        f8601[84] = "O\u0016vD-}\u000e\u0012s\u0011\u0017=\u000bM*\\\u0017zL\u0014/\u001a,;H\u0011z v!JU,F,)\u0016FK";
        f8601[85] = "5\u0004Puity\rQ}Rt1\u0010Dw)\u0019v\u0016Qm-~%VNsRit\nG/m\"7\u0016-";
        f8601[86] = "bF\u000fiU\tgL\u0015\"<\u0006dSi-G\u0015wP\u000e~\u0007\ni/Wh@\u0017vH\u0004(_\t\t";
        f8601[87] = "\u0005cT\u000f\u0013MDa\u000eTm\u00d9?c\u000f\u001e\t\u0012U`\b\u000b\u0003G";
        f8601[88] = "H/3Gt\u0010\u001a|\u007f\u0004\u0013\u0001FnW\u0016x\rFn\u000f\u001b*\u0014FqkGiTN\u0012";
        f8601[89] = "wy|\u0010>E7:0\t}$#8`\f>_N8=\u0010(\u0018qs~\fB";
        f8601[90] = "\u000eeH\rX\u001fOaMXbXH;\u0010i^\u001b\u000f>OR\u001f\u001f\nku";
        f8601[91] = "e5\u00196g{8+\u0017']!hL\u001a)fxm=\u001b+>:";
        f8601[92] = "qs\u0012gh!0qH<\u0016\u01a3KvK1rxp7O4'B! \u0013|ux%0\u0005=\u0016";
        f8601[93] = "\u0017k\u0004-Y~Yh\u0002/>oNbB\u007fy\u007f'7Rm\u0004-Gw\u0003,X\u0011\u0017k\u0004-Y~Yh\u0002/>";
        f8601[94] = ":$'\tU\u001e#ewS,J.(v\u0004@x\u007fi)X\u0014/\u007fk+\u0007\u0016\u0014>o.R,\u001331&[VQxl+c";
        f8601[95] = "q&o\nIUz <I+\bb`EY[\u0014\u000bk?SAT4 |O+";
        f8601[96] = "\u0004}g\u0013\u0002z\u0000|jTa>\u0016-x\u0007\u001c!\u0010Mo\u0012\n*G7hU\u0001}}|x\u0014[y\u001d<)U\u0007E\u00067tR\u0011t\u0007|,Pa9\u0013.(\u0000\u001d}\u000fs|k";
        f8601[97] = "\rrb\u001d_v\bxxV6n\u001bg\u0004YMj\u0018dc\n\ru\u0006\u001b:\u001cJh\u0019|i\\Uvf%\u007f\u001bHi\u0001v?\u0004V\u0016";
        f8601[98] = "p\r!+PV1\t$~j\u0011+v{0\u0007\u0017\u0007[g\"jQs\u000fxuQ\u0010w\n-O";
        f8601[99] = "\tEecP$ELdkk.\u000e@yc\u0002-tC~y\u0012rJO!l\u000eI";
        f8601[100] = "\bzT0n]\u000ewSz/b^|KN6\u0006\\\u0011\u000e1*\u0005MpNrf\u001c\u000e\u0011";
        f8601[101] = " L\f+f&+J_h\u0004}7\u0001\u001c\u0015:`&\u000f\u001fri 9\u0011`";
        f8601[102] = "(c\u001aX\rH2bAP<\u0277VoE]E\u0015hc\u001aHY.";
        f8601[103] = "&a~KX\u0019y2y\b\u0013uv%DU\u0019\t\u001fg0X\u0019K&&{\b\u0004\u0017\u001f2~J\u0001\u0018qnjX\u0004u";
        f8601[104] = "H{G\u001a\u001e1\t\u007fBO$d\u0013>\u001f\u0017X\nH{G\u001a\u001e1\t\u007fBO$3D(\u0001@\u001dr\u000fx\u001c\u001c$6Ky\u001eD\u001fwO|K~";
        f8601[105] = "\t;m\u000bOaH?h^u!Hn+\u0013\u000f;SkP\u0000\u0013&L?n\fL3P\u0004lPH>\u000f?-TMk5";
        f8601[106] = "\u0004RD:J/B\u0011\u0019p\u0003F\\\u0015\u0014;\u0018:Z\u0013y;L*\u0003\u000bD0Jy@i";
        f8601[107] = "ha\rq\u000f6kf\u0018{Z\\+1\u001ey3eo&\r~\b: >H|3`!9G-I\"jdJ\u0015";
        f8601[108] = "b7h7{v>#z2\u0016si/j=w~uI(/jfq.{oux\u000e9*3|$1ri/\u0016";
        f8601[109] = "%KK\u0003118\rR\u0001T=2\u0012T6mndH,^)*9\u0005O\ri-'w";
        f8601[110] = "S\u0016\u0016BaC\u0012\u0014L\u0019\u001f\u04bfiK\u0001I#QUE\u0016Cv";
        f8601[111] = "X;,\r%\u0000\u00114{P[N(j\"\f?X\u0013+&\tjb\u0014i UaYUm%\u0000[";
        f8601[112] = "~\u007fN;E+ |Hq|1yiM&;!\u0010bV7\u0005t.n\t\"\u0019O~\u007fN;E+ |Hq|";
        f8601[113] = "ac\u0004\u001b\u001bi a^@e\u03f7[>\u0013\u0010Y{g0\u0004\u001a\f";
        f8601[114] = "\u0003eu8\u001e\nBg/c`\u03c195t/\u0002\u0016Cez(\u0004";
        f8601[115] = "<7K\u0001\u000b\u001597N\t;\u0011l9+\u0006_\u0003lEK\u0014G\u0000~\"\u0018TX\u001e\u0001";
        f8601[116] = "'Q`q\u0014%fUe$.sb\u00134qU_t\b:oCUr\u00150\u0015\u0012!&\ng.S%#_]e\u0012yqRb.Qe\u001b";
        f8601[117] = "5\u0016y- -6\u0011l'uGeOg.c\u0001aTG(z*w+:tf#0A9ss)e+";
        f8601[118] = "+\u0001\u000f=d\n*JW?\u0014`\u001d0)BX`P\u0000\u0014e-Ka\u0001_=/";
        f8601[119] = "[n| 6q[<x:WsK<a=\u0000&\u001bm9Q.m\u001b;|`7,Ka";
        f8601[120] = "My\bOzIAwR\u0005\u0003BD`\u0005\u0014n]-n\u0017E{CA!P\u0015f'Hz^\u001fyYK,^\u000f\u0003";
        f8601[121] = "Ox\u0012i\u0013?\u0013l\u0000l~0_k\u0016c\u00026Y\u0006\u00167\u0012oA;\u001d1A,#";
        f8601[122] = "\u0002/OOI\u001c^;]J$\t\u0012+\\EAr\u0002*IHJ\bSn\u000bH$";
        f8601[123] = "aOGI.Fa\u001dCSOO}\f^_#}-L\u0001\u0007O\u0015m\fRJ,F-\u000bL8";
        f8601[124] = "qGE.+{&EYS\u007fdzHS:s]tHC>\u0015s!KTo*8bW>";
        f8601[125] = "2Y\u001ee\t\u000ea\u0019\u0019{{\u0002`X9u\u0001\fkKb5DPi\u001eYt@U<$";
        f8601[126] = "\n\tj^f+U^;\u001e\u007f[\\]w5y?ZLj\br\u001eZVb\u0000y!3Y1\u0012,=S\u00007\u0011,[";
        f8601[127] = "9+t=zg0kb:f\u001fezy=zsW-4c#\u001f9+l%`ezxl8x\u001f";
        f8601[128] = "u}\u0016{^c4\u007fL  \u0399O\u007f\u0019aL8(5\u001e.Y";
        f8601[129] = "M\u0005\u000fPLxM\u001aXG3y\u0014\u0011\u0018l\f,Ht_FO~\u0001\u0017\f\u0006H`s";
        f8601[130] = "\u0004)!I-qS+=4m`\f?7s}\t\u0018~=^/6S=!4\u007fb\u0013?dL(`\u000fB";
        f8601[131] = "nu6\u001d\u0005:/q3H?j5,w\u0010^g)Jy\u0000\u000ey6&6G^dR:7\u001eU=mqt\u0002?";
        f8601[132] = "t|[1_H5~\u0001j!\u056bN~T+M\u0013)4SdX";
        f8601[133] = "\u001e&\u0001w\bQ\u001d~L6\u0002=B{Z\u000e\\[[c\u00070P\u0004N\u007f<aUA^!\u0002m\nTB\u001aShOD\u001c$_7ZX'";
        f8601[134] = "bd\u0018\b\u0019%.m\u0019\u0000\"\u0005\u001fp\f\u0013Dsr<\u0005\u0012L";
        f8601[135] = "GSW%9\u0013\u001eUT%_\u0012U'P|2\u0015Bi\u0016\"b\u0017\u0014RW&gB.\u0019\u0016z5O\u0011RUf_";
        f8601[136] = "jP#;6i&Y\"3\r(\u0017D7 k?z\b>!c";
        f8601[137] = "\u0012\u001e, 2k\u0011\u00199*g\u0001@Y;-rl`D0*onVY?8ofM#j{3e\u0011\u0018+\u007f60+\u001fiyj;\u0010^m|?\u0001\u0012\u001e, 2k\u0011\u00199*g\u0001";
        f8601[138] = "I<\u0014G\u001b\u0016\b>N\u001ce\u001cs?\u0019\\]\r\u0016d\u0010Q\u001duIn\u0002\u0014\u001d\u0010\u0012g\u000fTe";
        f8601[139] = "P0c\u0013QpU:yX8\u007fV%B\u0013t}U0x\rD\u0010\u0005\"y\u0017GwVbf\t8.@%{\u0016_}\u0000:ei\u0006kG'z\u000eU+X9\u0005";
        f8601[140] = ",!\raW\u0001m%\b4mAmtKy\u0017[vq0j\u000bFi%\u000efTSu\u001e_c\u0011C+ S<\u0004_\u0010\"\u000f8\t\u0000+c\u000b=\\:";
        f8601[141] = "\u0019r)<\u0011\u0016H6k<\u007f\u0010\u0012M0#\u0003l\u0019w/;\u0012\u0002Ec=>\u007f";
        f8601[142] = "B\u0011ZpY\u0011\u0003\u0015_%cK\u0018B\nd$D~\u0012X)\u0007\u0010ES\\,R*\u0011H\u001bmX\u0014\u001d\u0017\u000eqc";
        f8601[143] = "\"}\u0015I\b\u00105q\u0014AuG(~\u0017{L\u0015w o\u0013\bP#i\f@HW=\u001b";
        f8601[144] = "3Yh\u0014\u0012i%T-\u0012.w0F]@Hg0^rDB\f-\u0006qC\u00123fEm)\u0012|8\n.SP7e\u0007\u0016";
        f8601[145] = "\fl5[\u001c<\u0000bo\u0011e9\u000bl+\u0001\u0001?l5l]\u0001hWthXTR\fl5[\u001c<\u0000bo\u0011e";
        f8601[146] = "\r\u0014\u0004\u0017j]L\u0016^L\u0014\u03417\u0014_\u0006p\u0002]\u0017X\u0013zW";
        f8601[147] = "q\u007fG\u0001\u001cNw0]Zg\u001ei;QAgO,|R\u0001\\\u000e(y\u0007;^C\u007f:\b\u0002\u001f\b/'T;[\u0003vq\u000eA\u0019H+|6";
        f8601[148] = "x\u001f\u001e\b\u0018Lv\b\u0014]i\u01b6\u001c\u0002\u0000J\n\u001dr^\u0014X\u000fp";
        f8601[149] = "\u0013i{\u0000d\u0015\u0010?{\u0010\u001e\u000e\u001fs \u000bs\u0010v\u007fw\ftWI44\u0010\u001e";
        f8601[150] = "Vz\u001bV\u0016\f\u0017xA\rh\u0010l&\r_\u0003\u000e\u00002DL\u001a";
        f8601[151] = "jKNCe\ri\u0013\u0003\u0002oa6\u001e\u0003:1\u0007/\u000eH\u0004=X:\u0012sU8\u001d*LMYg\b6w\u001c\\\"\u0018hI\u0010\u00037\u0004S";
        f8601[152] = "tkf\u000f&vvc:[+\u001c\u0006A\u001fj\u0016%'1o\u0006|'/m;\u000b";
        f8601[153] = "y\u0011\t%{\u0012~G\u000ep\u007f+:D\fu8W-S8y?W!O\foC\u0012+BYky\u0011%Q\u0012zC\u00170LS,9U{\u0011^\u0014";
        f8601[154] = "j[\u0003|t\u0014wX\u0001'H\u0454\u0012LJ30\u001e-HK>w";
        f8601[155] = "L\u001f#w[5\u000b\u0007|%$\u01851Ay @f\n\u0000}%\u0015\\\rB{y\u001egLF~,$";
        f8601[156] = "U'h,MaO&3$|\u0567++7)\u0005<\u0015'h<\u0019\u0007";
        f8601[157] = "R\n\u0017rpJKKG(\t\u001eF\u0006F\u007fe,\u0011J\u0016 \tB\u0010G]#`\u0004S\u001a\u0017j\t";
        f8601[158] = "\u0006#\u0018<DvG!Bg:\u0273<jB0P)\u0003!\u0001,:)L\u007fNo@k\u0007\"CW";
        f8601[159] = "b\u001990m\"g\u0013#{\u0004)n\u0015'7x/H\u001e\u00070i9d\u0016#J:9u\u000e -iyj\u0010_s; 7\u001d3s4!eO_t\u007f>w\u000f8'?!ip";
        f8601[160] = "jU[\u0004.h+W\u0001_P\u04fcPWT\u001e<37\u001dSQ)";
        f8601[161] = "h\u001cI\\|\u0003)\u001e\u0013\u0007\u0002§R\u001eFFnX5TA\t{";
        f8601[162] = "\u0010UC-L;QW\u0019v2\u04ca*P\u001a{Vb\u0011\u0011\u001e~\u0003X\u0016\u001c@v\n\"TW\u001d{2";
        f8601[163] = "\u0019I3SNK\u001dY%\u0012-\u0083sShDGML\u0018+X";
        f8601[164] = ",-hJ]_m/2\u0011#\u0216\u0016-3[G\u0000|.4NMU";
        f8601[165] = "M\u00198\u0005(e\u001c]z\u0005FzH\u001a@\u0010<$P\\}\u0006{#\u001bb,\u001a>{O\u0018}^|{!";
        f8601[166] = "-R!tfWlV$!\\\u0017m\u0004fl'3p\u0011|\u0010`S,\t&+!W)\\\u001c``\u000b{Q#+#\u0017\u0011";
        f8601[167] = "s)\u0014rE0p.\u0001x\u0010Z5n\u000fj\u0014Zs*\u0014l\u0012a,e\f)\u0010Zvd\u000b&A 4/V+y";
        f8601[168] = """
                     \u0014/\u0016/b\u0016^(Y:Z
                     B:'"6\u001dB g3f\u0016EzXx%
                     /}\u000e26IH7	}#q""";
        f8601[169] = "}o\u0018U4\u0003<mB\u000eJ\u0573G=\u0017X0\t'8\u001dB{";
        f8601[170] = "h?\u000eL\u001c\u0014m?\u000bD,\u00169!k_F$81LCJ\u0010.M\tIGE*w\nGT\u000e;M\fRIOm7N\u0019\u0014BU";
        f8601[171] = "cg\r{m1\"eW \u0013\u0258Ye\u0002a\u007fj>/\u0005.j";
        f8601[172] = "0?9.fq7i>{bHm`<p32\t>j&n05k6{%y";
        f8601[173] = "JVRD\"z\t\u0005RY:\u0000\u001c\u0007Gz6e\u001ej\u0007\u0003bdIQF\u0007g1s";
        f8601[174] = "%ccI\u0001\u001fda9\u0012\u007f\u0423\u001falS\u0013Dx+k\u001c\u0006";
        f8601[175] = "`+mS,Ctb~JMTh'QY6No:kY1^\u0005bfWuL`>rQ-_\u0005>\u007fZ&Ni*6I?/";
        f8601[176] = "]\u00122et\u000b\u001c[gp\u001a\f\u001c\u0002hp\u001aHY^j6!\t][?\f&\u0004\u0003S6vdO^^\u000e";
        f8601[177] = "v!BBF@7#\u0018\u00198\u010aL|UI\u0004RprBCQ";
        f8601[178] = "RY\u0004k-L\u000b\u0000\u0012ox}\u000e\u000e\u00116u\u0011<^Vg\u0012AT^\tl)\u0000P[\\V.BV\u0007WmoFSRm";
        f8601[179] = "g\u007f\u0011\\V3f}I\u001e8,avN\fo{?!\u0016`I}yjK\fI/}p";
    }
}
