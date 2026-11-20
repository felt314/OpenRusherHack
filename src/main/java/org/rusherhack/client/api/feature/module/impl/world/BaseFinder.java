// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.world;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.client.api.feature.module.Module;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import javax.crypto.SecretKey;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.core.utils.IOUtils;
import org.rusherhack.client.api.RusherHackAPI;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.DonkeyEntity;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.client.api.events.world.EventChunk$Load;
import net.minecraft.client.network.ServerInfo;
import java.util.Date;
import java.time.Instant;
import java.text.SimpleDateFormat;
import java.io.FileWriter;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.event.subscribe.Subscribe;
import net.minecraft.sound.SoundEvent;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.sound.SoundEvents;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import net.minecraft.block.entity.MobSpawnerBlockEntity;
import net.minecraft.util.math.Vec3i;
import net.minecraft.block.entity.BlockEntity;
import java.util.Map;
import java.io.File;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.utils.Timer;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.reset;
public class BaseFinder extends ToggleableModule
{
    public NumberSetting<Integer> f9505;
    public Timer f9506;
    public NumberSetting<Integer> f9507;
    public NumberSetting<Integer> f9508;
    public NumberSetting<Integer> f9509;
    public boolean f9510;
    public BooleanSetting ignoredungeonchests;
    public Timer f9512;
    public BooleanSetting sound;
    public NumberSetting<Integer> f9514;
    public BooleanSetting notification;
    public BooleanSetting endportals;
    public NumberSetting<Integer> f9517;
    public BooleanSetting chestrequired;
    public static File f9519;
    public NumberSetting<Integer> f9520;
    public BooleanSetting logger;
    public NumberSetting<Integer> f9522;
    public BooleanSetting beds;
    public static File f9524;
    public NumberSetting<Integer> f9525;
    public static long f9526;
    public static String[] f9527;
    public static String[] f9528;
    public static Map f9529;
    public static long[] f9530;
    public static Integer[] f9531;
    public static Map f9532;
    public static Object[] f9533;
    public static String[] f9534;
    
    @Subscribe
    public void m18254(EventUpdate eventUpdate) {
        long n = BaseFinder.f9526 ^ 0x11918CA9C515L;
        if (this.f9510) {
            ClientPlayerEntity player = Globals.mc.player;
            SoundEvent entity_EXPERIENCE_ORB_PICKUP = SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP;
            float n2 = 1.0f;
            player.playSound(entity_EXPERIENCE_ORB_PICKUP, n2, n2);
            this.f9510 = false;
        }
    }
    
    public void m18255(String s) {
        long n = BaseFinder.f9526 ^ 0x1F7070AE7901L;
        boolean booleanValue2 = false;
        Label_0051: {
            Label_0035: {
                boolean booleanValue;
                try {
                    booleanValue = (boolean)((Setting)this.notification).getValue();
                    if (false) {
                        break Label_0035;
                    }
                    break Label_0051;
                }
                catch (Throwable t) {
                    t.printStackTrace();
                }
                try {
                    if (false) {
                        ((Module)this).sendNotification(NotificationType.INFO, s);
                    }
                }
                catch (Throwable t2) {
                    t2.printStackTrace();
                }
            }
            try {
                booleanValue2 = (boolean)((Setting)this.sound).getValue();
            }
            catch (Throwable t3) {
                t3.printStackTrace();
            }
        }
        Label_0084: {
            if (!booleanValue2) {
                break Label_0084;
            }
            this.f9510 = true;
            try {
                String address = null;
                Label_0121: {
                    Label_0119: {
                        ServerInfo currentServerEntry2 = null;
                        Label_0100: {
                            ServerInfo currentServerEntry;
                            try {
                                currentServerEntry = Globals.mc.getCurrentServerEntry();
                                if (currentServerEntry != null) {
                                    break Label_0100;
                                }
                                break Label_0119;
                            }
                            catch (Throwable t4) {
                                t4.printStackTrace();
                            }
                            try {
                                if (false) {
                                    break Label_0119;
                                }
                                currentServerEntry2 = Globals.mc.getCurrentServerEntry();
                            }
                            catch (Throwable t5) {
                                t5.printStackTrace();
                            }
                        }
                        address = currentServerEntry2.address;
                        break Label_0121;
                    }
                    address = "localhost";
                }
                String s2 = address;
                FileWriter fileWriter = new FileWriter(BaseFinder.f9524, true);
                fileWriter.write("[" + s2 + "][" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date.from(Instant.now())) + "] " + s + "\n");
                FileWriter fileWriter2 = fileWriter;
                fileWriter2.flush();
                fileWriter2.close();
            }
            catch (Throwable t6) {}
        }
    }
    
    @Subscribe
    public void m18256(EventChunk$Load eventChunk$Load) {
        
    }
    
    static {}
    
    public BaseFinder() {
    }
    
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
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/BaseFinder.m174:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/BaseFinder.m177:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
        if (BaseFinder.f9534[n3] != null) {
            return n3;
        }
        Object o = BaseFinder.f9533[n3];
        if (!(o instanceof String)) {
            return n3;
        }
        int n5 = switch ((int)(n >>> 42 & 0x3FL)) {
            case 0 -> 52;
            case 1 -> 61;
            case 2 -> 34;
            case 3 -> 48;
            case 4 -> 43;
            case 5 -> 41;
            case 6 -> 62;
            case 7 -> 31;
            case 8 -> 0;
            case 9 -> 2;
            case 10 -> 47;
            case 11 -> 10;
            case 12 -> 36;
            case 13 -> 22;
            case 14 -> 56;
            case 15 -> 25;
            case 16 -> 32;
            case 17 -> 29;
            case 18 -> 50;
            case 19 -> 3;
            case 20 -> 55;
            case 21 -> 18;
            case 22 -> 59;
            case 23 -> 40;
            case 24 -> 8;
            case 25 -> 24;
            case 26 -> 17;
            case 27 -> 11;
            case 28 -> 38;
            case 29 -> 54;
            case 30 -> 33;
            case 31 -> 19;
            case 32 -> 6;
            case 33 -> 12;
            case 34 -> 37;
            case 35 -> 60;
            case 36 -> 5;
            case 37 -> 26;
            case 38 -> 28;
            case 39 -> 15;
            case 40 -> 4;
            case 41 -> 57;
            case 42 -> 9;
            case 43 -> 35;
            case 44 -> 16;
            case 45 -> 1;
            case 46 -> 42;
            case 47 -> 13;
            case 48 -> 49;
            case 49 -> 39;
            case 50 -> 30;
            case 51 -> 23;
            case 52 -> 14;
            case 53 -> 53;
            case 54 -> 46;
            case 55 -> 7;
            case 56 -> 27;
            case 57 -> 63;
            case 58 -> 44;
            case 59 -> 51;
            case 60 -> 45;
            case 61 -> 58;
            case 62 -> 21;
            default -> 20;
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
        BaseFinder.f9534[n3] = new String(charArray);
        return n3;
    }
    
    public static void m179() {
        Object[] f9533 = BaseFinder.f9533;
        f9533[0] = "m\u001aXO7cm\u001aO\u0013;lwQO\r;yp \u001fUk=";
        f9533[1] = "E\u007fV_T E\u007fA\u0003X/_4A\u001dX:XE\u0011E\b}";
        f9533[2] = "F&+\u0001m\u000fZ<)]w\u001bJ?b\u0229";
        f9533[3] = Integer.TYPE;
        BaseFinder.f9534[3] = "java/lang/Integer";
        f9533[4] = "\u0007%a1#q\u001b?cm9e\u000b<(\u056a";
        f9533[5] = Boolean.TYPE;
        BaseFinder.f9534[5] = "java/lang/Boolean";
        f9533[6] = "H2\u0016V3\fC=\u0007\u0019I\bP<\u0017V\u007f\fG";
        f9533[7] = "Q=&gB=M'$;X)]$o*\\![!5gQ8Wa\u0006%_*_#2";
        f9533[8] = "\r@/yI\u0007\r@8%E\b\u0017\u000b8;E\u001d\u0010zhf\u0014";
        f9533[9] = "q\tO4'{q\tXh+tkBXv+al3\f.|";
        f9533[10] = Float.TYPE;
        BaseFinder.f9534[10] = "java/lang/Float";
        f9533[11] = Void.TYPE;
        BaseFinder.f9534[11] = "java/lang/Void";
        f9533[12] = "7X(\f\u000b\u0010+B*P\u0011\u0004;AaA\u0016\u0017=\u0004:V\u0010\t+\u0004\u0006m,\u00111F<";
        f9533[13] = "O*Hp?hD%Y?BpW\"Pv";
        f9533[14] = "[~-=\t\bGd/a\u0013\u001cWgdp\u0017\u0014Qb>=\u001a\r]\"\u0018f\b\u0015Q~\u0002r\u0018\u0016u\\\u0003";
        f9533[15] = "\u0011$CbS:\u0012*\u001be\u00148\u001ekeb\t<";
        f9533[16] = """
                    \\c\bPGr@y
                    \f]fPzA\u001dYnV\u007f\u001bPTwZ?	\u001bTsFc
                    PVh^|\u000e\u0010Q)Rc\bPwk\r\u0004,PaVc
                    \u0010Vb""";
        f9533[17] = "<DT\u001f6:9\u000bd\u0017t6";
        f9533[18] = "P/\u001b`:6P/\f<69Jd\f\"6,M\u0015]}dg";
        f9533[19] = "\u0014\u0004\fZ\u0000\u0003\u0014\u0004\u001b\u0006\f\f\u000eO\u001b\u0018\f\u0019\t>JGUX";
        f9533[20] = "KDvN\u001cPKDa\u0012\u0010_Q\u000fa\f\u0010JV~0UI\u000f";
        f9533[21] = ">a\u001c\u0014od\"{\u001eHup2xUYrc4=\b_ie8}\u001c\u0014Sd<q\u001eHNt%g\u0012Tz";
        f9533[22] = "^$/\u0005NDB>-YTPR=f\u0140";
        f9533[23] = "sR\u0005}s%oH\u0007!i1\u007fKL0n\"y\u000e\u000e<f7uN\u0005}M?{G\u0007!";
        f9533[24] = "\u000eNT#\u001bH\u0005AElwK\u000bCG#[";
        f9533[25] = "\u001bt\u001fzM:\u0007n\u001d&W.\u0017mV7P=\u0011(\u000b1K;\u001dh\u001fz} \u001bj\u001d5Q\u001c\u0011r\f=Q(";
        f9533[26] = "JYI-\u001fRAVXbxPT]X)C";
        f9533[27] = "5!ERq~);G\u000ekj98\f\u001fly?}Q\u0019w\u007f3=ERPn.'K\u0012d";
        f9533[28] = "&/\"E\f\u001c\u000f\u0016>_\u000e@\u0015\u0002.\\EQ\u0012\u0011(\u0019\u0018W\t\u0017$Y\f\u001c.\u00069C\u0002\\\u001aX";
        f9533[29] = "\u000bW\u0018b>d\u0017M\u001a>$p\u0007NQ/ x\u0001K\u000bb-a\r\u000b\u0019)-e\u0011W\u001ab!~\u0000P\u0013)b\\\u000bA\n )R\u0005Q\u001a+#c\u001d";
        f9533[30] = "6GN%\u0013l*]Ly\tx:^\u0007h\rp<[]%\u0000i0\u001bOn\u0000m,GL%\fv=@EnOT6Q\\g\u0004";
        f9533[31] = "lwG!1JEN[;3\u0016_ZK8x\u0007XIM}%\u0001COA=1Jd^\\'?\nP\u0000";
        f9533[32] = "mP\u0007\u0016R/sX\u001dY5.bC\u0010\u0003\u0013(";
        f9533[33] = "wG5/Dz|H$`%twC :";
        f9533[34] = "\bzd:/(}Zo5>g\u001cTd>:=h";
        f9533[35] = "j/\u00033wCv5\u0001omWf6J~jD`s\u0011ilZvs0thSw";
        f9533[36] = "J0#Tm\u0015T89\u001b0\u0014R44Xm3T#0T.";
        f9533[37] = "S\u00158R09M\u001d\"\u001dx9W\u0017:Zq\"\u0017$<Vz%Z\u0015:V";
        f9533[38] = Double.TYPE;
        BaseFinder.f9534[38] = "java/lang/Double";
        f9533[39] = "B|h\u0002q\u0002^fj^k\u0016Ne!Oo\u001eH`{\u0002b\u0007D zXj\u001b^ XCq\u001bI[{Eo\u0004";
        f9533[40] = "|Vq*2\u0000b^keP\u001ceC";
        f9533[41] = "(B3+,C(B.w L2\t$i Y5xv1x\u0018";
        f9533[42] = "\r\u001e\u0000gQ\u0003\r\u001e\u0017;]\f\u0017U\u0017%]\u0019\u0010$B}\u000e";
        f9533[43] = " lmK\b0%#]CJ<\u001d\u007fr^C+";
        f9533[44] = "n^\u0004rg\\mR\u0017=\u0000FwK\u0013}=";
        f9533[45] = "@V>%05OO<jM(GG$!Z ^R\u000e+l,KC";
        f9533[46] = "vi\u0001B]\u0007ha\u001b\r7\u0013hm";
        f9533[47] = "\u001bBGx::\u0010MV7G/\u0002WTt";
        f9533[48] = "\u00180ZPh\u0012\u0004*X\fr\u0006\u0014)\u0013\u001du\u0015\u0012lS\u0011n\u000e\u0011+^\u001fn\u000e\u0018,\u00130u\u0013\u001e$T\u001d{\u0013\u001e-S*c\u0017\u0012";
        f9533[49] = "|5ys\u001e\u007fl#gybna6my5;?e0\u0015S0y<`~^8\u007f>";
        f9533[50] = """
                    BK\u0016x\b'R
                    \u0014ar2K\u001f\u0017s5""GWw\u0018pE\u0016\u0013%
                    LBK\u0016x\b'R
                    \u0014ar""";
        f9533[51] = "\u001fk'l\u001cvL{'<`q%+7i\u0019 Ck`;\f\u0018\u0019|0|X~Y+bi`";
        f9533[52] = "n\r$y\u000b\u0005p\u001e~|iRw\u000e|s\u0015<n\u0004vwVX,\b|\u007fi\r \r~s\u0002\u0000(\u000b|\u001a";
        f9533[53] = "\u007fwTei k(Nb\u0007~f}N1}\u0010\u007faS ioecR8\u0007hi\u007f\u000b27|6e\f\\";
        f9533[54] = "\u0015*9!r?F:9q\u000e\u020e/6=$n!\u0014:|2v";
        f9533[55] = "[\u0012}Y(\u000bMPoYP\u0000SB|]+e\f\u0013tMl\u0002]W&_P";
        f9533[56] = "XdW\u0004!:\u00174PQH\"\u000bqL\\$\u0010\\6\u0017\u0002wG\u001fvO\n9.\t7^QH";
        f9533[57] = "\u0007V7g\u0002\u0016]\u001cacz\u0019\u0000\u001bPm\u001e\u0005\u000bg49\u001c\u0002\u001f\u0007wb@\u0002f";
        f9533[58] = "k\u0011z\fD>\u007fN`\u000b*gu\u000eY\\Ves\u007fdMKr}\u0000~OJj\u0013C!\\@2t\u0012e\u000eR\u000e";
        f9533[59] = "4\u001fxIe51\u00131YZ#!\u0007'BZ\u007fk\u0004'Q1rc\u0002%8e59\rz@*4%F@";
        f9533[60] = "]d2H\n\u001dYtg\u001feC\rhbF\tqY)?\u0011eZ\u000edd]\u001aJ\u0018zn!";
        f9533[61] = ",$SR\u001bj:fARci7yHP\u0018\u0004{%ZF_c*a\bTc";
        f9533[62] = "][\u0014Hj\u0006\u000eK\u0014\u0018\u0016\u04aagG\u0010Mv\u0018\\KQ[n";
        f9533[63] = "0#:\n5aj96R\r7Zu;\u001ajr1x3\u001ch\u001bktr\u0004dpf|t\u0006\r";
        f9533[64] = "u[r%]\u00128\u0000\"86\u0018#c%.\u0006\u0014'X!>SC";
        f9533[65] = "\u0013]\u0013{\u00072TU\u001b?g9\u0005G\u0010#\u000b\u000bV\u0004H\u007fg`UR\u001ax\u00001\u0011\u0000\bD";
        f9533[66] = "8_0#*O&\u0014dtEU6@`c9B!tld9N=@z\u0018!N9\u0015ed,@?_\u0001'>M+\u0015yh?Q`/";
        f9533[67] = "C\u0010M\u0015P<\u0010\u0000ME,\u0278y\u0007\n\u001cR*\u0017\u0011H\u000eR";
        f9533[68] = "M^\bF\"+\u001eN\b\u0016^\u027dwO\f\u0010?.\u0018\u001f\u0016Sc";
        f9533[69] = "xm\u0000nG\u0016c6Nb,Ht(6j\\T\u001doMnF\u0014z>\t<T(";
        f9533[70] = "\u0017Q!#\\O\u001bS;$.\r\u0019f?&Cq\u0015\u0014><V\u001f\u0003V,<.";
        f9533[71] = "!k#%o1'1){W/!-xs;\u001duh -iJ lqu:(ro`$W";
        f9533[72] = "/kAW5S|{A\u0007I\u0482\u0015zE\u0001(Vz*_Bt";
        f9533[73] = ",B^\u0018.kaZ[\u0012SE\u001afyi#n<YC\u0006nv9S";
        f9533[74] = "^x?W[-\n\"x/S'\u0003wjx\u0004zP)9/\u0004x\u0014/~W\\:\u0003x";
        f9533[75] = "P@>\fS\u0015\u0002C/]>\u0012Q\u00017\nR \u0005LkP\u0003wP\u0010>\u0014OI_\u001eiR>M\u0001\u001b-\u0014^\u000eZG-m";
        f9533[76] = "{+U|#c`p\u001bpH;seY\u0015.gsr\\o$9pe%";
        f9533[77] = "rhR&ml!xRv\u0011\u0289HyVppi')L3,";
        f9533[78] = "jhI\u0016`$dn\u0012E\u00075\u0004{M\u0010va\u007f~AYf";
        f9533[79] = "\u000f\u0019\t)3,\u001dR\u000f;\f \u0017\f\f4\ft\b\t\u0007ct;\t\u0015LY";
        f9533[80] = "\u0017'r\u001fx5\u0001e`\u001f\u00000\u0006v{\u001dm\u001d\u0011d\\\u0000d6|'/\bjg\u001bvkZx[";
        f9533[81] = "Q|MC\b\f\u0017;J\u0013r\u0510k~\tE\b\t\u000b=R\u0019\bp";
        f9533[82] = "}$u\u0006Y#`s}\u0000$.dc\fB\u001c19ag_K9?\u001c";
        f9533[83] = "p*-J\u0002x6m*\u001ax\u025dJ(iL\u0002}*k2\u0010\u0002\u0004";
        f9533[84] = "57>\u001aM78?8\u0018$2c}\"\u0014X\\57>\u001aM78?8\u0018$:c`y\u0007Il?zy}\u0015l}`.\u0016\u0018d{bG";
        f9533[85] = "\u001b{WF?\u0005\u0003mTDS@\u0011}\u0000SS\u0005\u0007d\u001d\u0015+J\u0006xV/";
        f9533[86] = "FS3}>@\u0015C3-B\u0198|Dtt<V\u0012R6f<";
        f9533[87] = "0\u0013\u0015-?sc\u0003\u0015}C\u055c\n\b\u0013~*q5\u0010\u0005}(";
        f9533[88] = "\u0015\u000f/\u001b\u0011tF\u001f/Kma/\u0013+\u001e\rj\u0014\u001fj\b\u0015";
        f9533[89] = "Y5kPS0\u0003\u007f=T+ Q`/^l08>oUQ'X}4\tQ^Y5kPS0\u0003\u007f=T+";
        f9533[90] = "se}&yb u}v\u0005\u01e6Itypdg&$c38";
        f9533[91] = "#.@qGC1eFcx[%=Blx\u0015o%Yh\u0013\u0018g#[\u0001G_=,\u0004y\b^!g>";
        f9533[92] = "\rg6} \u0001B71(I\u0019^r-%%+\t5vxp|Ju.s8\u0015\\4?(I";
        f9533[93] = "Qf\"5\u001cWJ0.3a\r@=r\u0003\f\u0011H!v$\u0006\u0013!j/!\u0006\u0000Jg''\u0004i";
        f9533[94] = "b\\\nvh) P\u0000~W#fK\u0000\u001b)ue\u0016\u0018p4\"m\u0010ee'\"q\u0013\u0001'+(y,";
        f9533[95] = "\u0019\u0003MiiI\u0013_\u0011(W\u001a\u000eDm7+\u0014\u001fYM*W\u000e_\u0002F#mM\u0011\u0001RQ";
        f9533[96] = "\u001e\u001a\r\u0018)Y\u0000QYOFB\u0010\fPe!E\u001c\u0004]H/E\u001c\rZ#6S\u001d\u001bAL{K\u0018\u0011<\u0012v@\u001a\u0003W\u001f~F\u0018j\u0003X$IG\u0012LY8\u0002}";
        f9533[97] = "\nitW\n$\u0017,dXm.\u0005.F@\t<\u0005R~\u0013\u0000&\u0011(tM\u00031h";
        f9533[98] = "\u000b:$b%pX*$2Y\u04821& g9n\n*aq!";
        f9533[99] = "\u000ea\u0005{\b']q\u0005+t\u01234p\u0001-\u0015\"[ \u001bnI";
        f9533[100] = "s\tNB|\u0018<YI\u0017\u0015\u0000 \u001cU\u001ay2w[\u000eD%e4\u001bVLd\f\"ZG\u0017\u0015";
        f9533[101] = "\u0001y\u0013c1L\u000b%O\"\u000f\u001f\u0016>4?h\u001b\u0018\u000f\u0018'n\f\u001a/\u0005[3M\u0012(B<b\t@:~ 3J\u001d0Dc}I\tB";
        f9533[102] = "w.7Tyijk'[\u001eeyy\u0000WtWxi'Kxcn\u0015?K|6qi2Ez|\u0015* Hn6me!T%\f";
        f9533[103] = "\u0017:<\u0004\u0002TB/=Go\u0001't|\u0005\bDLyt\u0003\n-\u0016u5\u001b\u0006F\u001b}3\u0019o";
        f9533[104] = "\u0018Z`n\u0015\u0000KJ`>i\u0099\"\u001a&n\u0003REKb<\u0011";
        f9533[105] = "Y\u001fioH&P\u0018ruyA}.I[y}Q\u0010u&AtV\u000bo";
        f9533[106] = "r\u000eD\u0006H[!\u001eDV4\u0166H\u0012@\u0003TEs\u001e\u0001\u0015L";
        f9533[107] = "n~l\\Z\u001a=nl\f&\u0457T3'LA\u001d?>/JCtkyuE\u001c\f$xi\u000e&";
        f9533[108] = "\u0019M;9E.J];i9\u020a#Q?<Y0\u0018]~*A";
        f9533[109] = "\u0002,mwQ\u0006Abnc#]\u0005}-x_[\u0003\u00102/SU\u0012.)t\u001dYy";
        f9533[110] = "\u001a_\u0003\u001c\u001bN\u0002I\u0000\u001ew\t\u0014YB\u0018\u001bq\u0004YZD\u0006\u0018\u0012\u0018K\u001fwM@KSI\u0010\u001c\u0004\u0019Au";
        f9533[111] = "\u0007\u0010f}\u001cMD^ein\f\u0000V1r\u000bw\u0004B:\"\u0000G\u0010\u001d %n";
        f9533[112] = "1\u007f$aXN!)4#$S59\u00038BR9*\u00106X\\X,1 ENf 3:B<";
        f9533[113] = "\f\\\u001eQ\"=\u001e\u0017\u0018C\u001d4\u0014S\u001bA\u001de\u000bL\u0010\u001be*\nP[!";
        f9533[114] = "\u0017\u0015\u0016@y+D\u0005\u0016\u0010\u0005\u0090-\u0004\u0012\u0016d.BT\bU8";
        f9533[115] = "m2\u0017\u0001l\u0014>\"\u0017Q\u0010\u0165W#\u0013Wq\u00118s\t\u0014-";
        f9533[116] = "aVf9u=q\u0017d \u000f<f\u0001~2f0_\u000f~\"bV=[s531l\u001f!'\u000f";
        f9533[117] = "\u0019(g8\t\u001eJ8ghu\u0256#9cn\u0014\u001bLiy-H";
        f9533[118] = ">\u00175y3\nqG2,Z\u0012m\u0002.!6 =A~}ZN>\u0004r>\"\u0016|\u0013%FeLj\u001e$\u007f9\u00151\u000fNya\u001d`\u0014w%8Fq~q=8\u0007:\u0006><$L\u0000";
        f9533[119] = "\u0012|o\\\b\u0017\u0016l:\u000bgBNa;Y0\u0015\u00106c5YET36H\u0016\u0015Sf";
        f9533[120] = "H`K[7\n\u001bpK\u000bK\u020cr|O^+\u0014Ip\u000eH3";
        f9533[121] = "~mHd\fx-}H4p\u0217D|L2\u0011}+,VqM";
    }
    
    public static Class m180(long n, long n2) {
        int m178 = m178(n, n2);
        Object o = BaseFinder.f9533[m178];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(BaseFinder.f9534[m178]);
                BaseFinder.f9533[m178] = forName;
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
        Object o = BaseFinder.f9533[m178];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        String s = BaseFinder.f9534[m178];
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
                return (Field)(BaseFinder.f9533[m178] = m181);
            }
            Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    Field m182 = m182(interfaces[i], substring, m180);
                    if (m182 != null) {
                        return (Field)(BaseFinder.f9533[m178] = m182);
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
            clazz = m180(2342672182366413L, 0L);
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
        Object o = BaseFinder.f9533[m178];
        if (o instanceof String) {
            String s = BaseFinder.f9534[m178];
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
                        return (Method)(BaseFinder.f9533[m178] = m181);
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
                                    return (Method)(BaseFinder.f9533[m178] = m182);
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
                        clazz = m180(2342672182366413L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m180(2342672182366413L, 0L);
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
            if (char1 == 'm' || char1 == '\u00d8' || char1 == 'O' || char1 == 'k') {
                m183 = m183(n, n2);
                Class<?> declaringClass = m183.getDeclaringClass();
                String name = m183.getName();
                Class<?> type = m183.getType();
                if (char1 == 'm') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == '\u00d8') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == 'O') {
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
                if (char1 == '\u00c0') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == '¥') {
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
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/BaseFinder.m265:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_7
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_7.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_7.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_7.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_7.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_7.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_7.fence = 1;
                ProcyonInvokeDynamicHelper_7.handle = handle;
                ProcyonInvokeDynamicHelper_7.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_7.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_8
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_8.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_8.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_8.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_8.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_8.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_8.fence = 1;
                ProcyonInvokeDynamicHelper_8.handle = handle;
                ProcyonInvokeDynamicHelper_8.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_8.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_9
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_9.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_9.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_9.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_9.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_9.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_9.fence = 1;
                ProcyonInvokeDynamicHelper_9.handle = handle;
                ProcyonInvokeDynamicHelper_9.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_9.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_10
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_10.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_10.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_10.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_10.fence = 1;
                ProcyonInvokeDynamicHelper_10.handle = handle;
                ProcyonInvokeDynamicHelper_10.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_10.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_11
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_11.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_11.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_11.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_11.fence = 1;
                ProcyonInvokeDynamicHelper_11.handle = handle;
                ProcyonInvokeDynamicHelper_11.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_11.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_12
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_12.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_12.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_12.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_12.fence = 1;
                ProcyonInvokeDynamicHelper_12.handle = handle;
                ProcyonInvokeDynamicHelper_12.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_12.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_13
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_13.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_13.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_13.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_13.fence = 1;
                ProcyonInvokeDynamicHelper_13.handle = handle;
                ProcyonInvokeDynamicHelper_13.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_13.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_14
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_14.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_14.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_14.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_14.fence = 1;
                ProcyonInvokeDynamicHelper_14.handle = handle;
                ProcyonInvokeDynamicHelper_14.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_14.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_15
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_15.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_15.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_15.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_15.fence = 1;
                ProcyonInvokeDynamicHelper_15.handle = handle;
                ProcyonInvokeDynamicHelper_15.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_15.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_16
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_16.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_16.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_16.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_16.fence = 1;
                ProcyonInvokeDynamicHelper_16.handle = handle;
                ProcyonInvokeDynamicHelper_16.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_16.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_17
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_17.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_17.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_17.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_17.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_17.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_17.fence = 1;
                ProcyonInvokeDynamicHelper_17.handle = handle;
                ProcyonInvokeDynamicHelper_17.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_17.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_18
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_18.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_18.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_18.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_18.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_18.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_18.fence = 1;
                ProcyonInvokeDynamicHelper_18.handle = handle;
                ProcyonInvokeDynamicHelper_18.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_18.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_19
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_19.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_19.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_19.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_19.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_19.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_19.fence = 1;
                ProcyonInvokeDynamicHelper_19.handle = handle;
                ProcyonInvokeDynamicHelper_19.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_19.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_20
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_20.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_20.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_20.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_20.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_20.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_20.fence = 1;
                ProcyonInvokeDynamicHelper_20.handle = handle;
                ProcyonInvokeDynamicHelper_20.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_20.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_21
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_21.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_21.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_21.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_21.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_21.LOOKUP;
                try {
                    handle = ((CallSite)BaseFinder.m177(lookup, "p", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_21.fence = 1;
                ProcyonInvokeDynamicHelper_21.handle = handle;
                ProcyonInvokeDynamicHelper_21.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_21.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
