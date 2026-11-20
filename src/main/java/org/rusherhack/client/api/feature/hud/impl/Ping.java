/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerListHeaderS2CPacket
 *  net.minecraft.util.Formatting
 */
package org.rusherhack.client.api.feature.hud.impl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerListHeaderS2CPacket;
import net.minecraft.util.Formatting;
import org.rusherhack.Class066;
import org.rusherhack.Class253;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.network.EventPacket;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.client.api.feature.hud.TextHudElement;
import org.rusherhack.core.event.subscribe.Subscribe;

public class Ping
extends TextHudElement {
    public int f6024;
    public static long f6025 = Class066.m4320(-3546478938047859328L, -5168785886414066600L, MethodHandles.lookup().lookupClass()).m4325(8545223571538L);
    public static String[] f6026;
    public static String[] f6027;
    public static Map f6028;
    public static Object[] f6029;
    public static String[] f6030;

    @Subscribe
    public void m12004(EventLoadWorld object) {
        
    }

    /*
     * Loose catch block
     */
    @Subscribe
    public void m12005(EventPacket$Receive object) {
        
    }

    public Ping() {
        super("Ping");
        long l = f6025 ^ 0x79EF3FA8BEC2L;

        this.f6024 = -1;
    }

    @Override
    public String getText() {
        int n;
        block10: {
            int n2;
            block11: {
                int n3;
                Ping ping;
                block9: {
                    PlayerListEntry playerListEntry;
                    block8: {
                        long l = f6025 ^ 0x306792CB6970L;
                        ping = this;
                        PlayerListEntry playerListEntry2 = Globals.mc.player.networkHandler.getPlayerListEntry(Globals.mc.player.getUuid());
                        n3 = Class253.m9155();
                        n2 = 0;
                        try {
                            playerListEntry = playerListEntry2;
                            if (n3 == 0) break block8;
                            if (playerListEntry == null) break block9;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw Ping.m423(numberFormatException);
                        }
                        playerListEntry = playerListEntry2;
                    }
                    n2 = playerListEntry.getLatency();
                }
                try {
                    try {
                        try {
                            n = n2;
                            if (n3 == 0) break block10;
                            if (n != 0) break block11;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw Ping.m423(numberFormatException);
                        }
                        n = ping.f6024;
                        if (n3 == 0) break block10;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw Ping.m423(numberFormatException);
                    }
                    if (n == -1) break block11;
                }
                catch (NumberFormatException numberFormatException) {
                    throw Ping.m423(numberFormatException);
                }
                n2 = ping.f6024;
            }
            n = n2;
        }
        return String.valueOf(n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
    }

    public static NumberFormatException m423(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public static String m221(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    public static String m172(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x26B1;
        if (f6027[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])f6028.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f6028.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u039a", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            try {
DESKeySpec dESKeySpec = new DESKeySpec(byArray);
               SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
               ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
               byte[] byArray2 = f6026[n2].getBytes("ISO-8859-1");
               Ping.f6027[n2] = Ping.m221(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f6027[n2];
    }

    public static Object m173(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = Ping.m172(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }
    public static int m272(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f6030[n3] != null) {
            return n3;
        }
        Object object = f6029[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 15;
            case 1 -> 31;
            case 2 -> 22;
            case 3 -> 54;
            case 4 -> 50;
            case 5 -> 48;
            case 6 -> 44;
            case 7 -> 2;
            case 8 -> 12;
            case 9 -> 8;
            case 10 -> 46;
            case 11 -> 36;
            case 12 -> 32;
            case 13 -> 59;
            case 14 -> 55;
            case 15 -> 47;
            case 16 -> 51;
            case 17 -> 11;
            case 18 -> 29;
            case 19 -> 41;
            case 20 -> 62;
            case 21 -> 63;
            case 22 -> 3;
            case 23 -> 7;
            case 24 -> 45;
            case 25 -> 58;
            case 26 -> 52;
            case 27 -> 30;
            case 28 -> 25;
            case 29 -> 56;
            case 30 -> 13;
            case 31 -> 27;
            case 32 -> 24;
            case 33 -> 4;
            case 34 -> 60;
            case 35 -> 5;
            case 36 -> 43;
            case 37 -> 10;
            case 38 -> 35;
            case 39 -> 9;
            case 40 -> 39;
            case 41 -> 23;
            case 42 -> 37;
            case 43 -> 40;
            case 44 -> 19;
            case 45 -> 17;
            case 46 -> 20;
            case 47 -> 21;
            case 48 -> 42;
            case 49 -> 16;
            case 50 -> 61;
            case 51 -> 49;
            case 52 -> 0;
            case 53 -> 57;
            case 54 -> 34;
            case 55 -> 1;
            case 56 -> 6;
            case 57 -> 38;
            case 58 -> 18;
            case 59 -> 28;
            case 60 -> 14;
            case 61 -> 26;
            case 62 -> 53;
            default -> 33;
        };
        int[] nArray = new int[6];
        int n5 = 0;
        while (n5 < 6) {
            n2 = 7 * (5 - n5);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n4) < 0) {
                n += 128;
            }
            nArray[n5] = n;
            ++n5;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        Ping.f6030[n3] = new String(cArray);
        return n3;
    }

    public static void m273() {
        Object[] objectArray = f6029;
        f6029[0] = "Aj\u001be[2Aj\f9W=[!\f'W(\\PY\u007f\u0006";
        objectArray[1] = Integer.TYPE;
        Ping.f6030[1] = "java/lang/Integer";
        objectArray[2] = "cS^dX'\u007fI\\8B3oJ\u0017\u024c";
        objectArray[3] = "\u0017=>\u000e:X\u001c2/AG@\u000f5&\b";
        objectArray[4] = "P. 4ibL4\"hsv\\7iyw~Z234zgVr\u0000vtu^04";
        objectArray[5] = "=\u0007g\r\u0010\u0013=\u0007pQ\u001c\u001c'LpO\u001c\t = \u0012M";
        objectArray[6] = "P\u001b\u0019_\u0016OL\u0001\u001b\u0003\f[\\\u0002P\u03eb";
        objectArray[7] = "f\b3\\\u001e\bm\u0007\"\u0013~\u0011a\u000b Ov\u000b~\u0004$Iu\u001co\f5IY\u000bb";
        objectArray[8] = "vU9\u0016W)vU.J[&l\u001e.T[3ko{\u000b\u000e";
        objectArray[9] = "$Ra\u0018kz:Z{W\u0010Z\u0007w";
        objectArray[10] = "(\u0014\u0019*,_(\u0014\u000ev P2_\u000eh E5.Z0w";
        objectArray[11] = "2j{\u0014\u001ee.pyH\u0004q>s2Y\u0000y8vh\u0014\r`46iSBg4vxU\u001b>>wrN\th)6_U\u0002d8`h{\u000fd4wr";
        objectArray[12] = "aar\\y\u001b}{p\u0000c\u000fmx;\u0011g\u0007k}a\\j\u001eg=p\u0004n\u0000z`;\u001cn\u001ay|g\u0019%+xv{\u0006[\u000fmxp\u0006";
        objectArray[13] = "\u0007\u001409A\u0005\u0007\u0014'eM\n\u001d_'{M\u001f\u001a.v\"\u0015Z";
        objectArray[14] = "X\u0014u |iD\u000ew|f}T\r<\u043e";
        objectArray[15] = ",@dx\u000b\u0017,@s$\u0007\u00186\u000bs:\u0007\r1z\"aQL";
        objectArray[16] = "3F7G\u001fq3F \u001b\u0013~)\r \u0005\u0013k.|q\\D)";
        objectArray[17] = "U\u0007L\u0016\"\u001d^\b]YE\u001fK\u0003]\u0012~";
        objectArray[18] = "dZakfYdZv7jV~\u0011v)jCy`$w?";
        objectArray[19] = "MBGZ\u0016|FMV\u0015wrMFRO";
        objectArray[20] = "\u0003#\u001d\u0004&(^<I{)*@-J\u0017\u001b}\rp\u001c{u{\u0004$H\u0007u:G)-";
        objectArray[21] = "aU^nTw%\u000b\t05\u056eX\u0002\u0004i\\k$\u0002E*Q\u000e";
        objectArray[22] = "%A\f#j\u000ea\u001f[}\u000b\u022e\u001c\u0016V$b\u0012`\u0016\u0017gow";
        objectArray[23] = "S&F{d8Q7Aj\u0000,\u0000\"RzG<i\u007f\u0013/i7\u0015\u007fRldRS&F{d8Q7Aj\u0000";
        objectArray[24] = "\u0015v\u0018\u0002\u000f_N.\f\u0003b\u0012%r\u0015T\u000eZOp\u0004S\u001f>\u001f(\u001cQ\u0006T\u001d9\u001b@b";
        objectArray[25] = "+4\u000bws3|7\t*\u0002;v25si7v2m+o-+q\bq~2bN";
        objectArray[26] = "5\u0010@U%~aJ\u0012UU\u0401\\\u0016\u001fV9b6\u0014\u000eQ(\u0006fL\u0016S1ld]\u0011BU";
        objectArray[27] = "\u0016V\u00106H$\u0010\u0014N7-~\u0018I\tP\u0017/O\u0017qmC+AL\u0016:V*\u0002,";
        objectArray[28] = "+C\u0016'_Lk[R'3U{*\u0011>^\u0000}\u001a@yIA";
        objectArray[29] = "t$\u0000wvL#1\u00014\u0016Ds6e5lJx%>svBr.TqgEcJ";
        objectArray[30] = "W\u00007\u000e&WZL,\u001d\u001aOk\u0003w\u000ee[\u0013@3\u001f&&V\u0006=\u0003g^\u0015B,@\u001a";
        objectArray[31] = "4$MH\u0017Lgz\u0012\rrEg`\u0015\u0017\u001ew0,JIr\u001esm\fM\u0017CpqHpMN:c\u001f\u001f\u0010Qn\u001c";
        objectArray[32] = "q9:C\u0005!s(=Ra/\"\"/n\u0007'&)\u0014Aaq+0?K\u000bs:7./Xws06SX60=S";
        objectArray[33] = "3=<JVy*gm\u00183}1}xErc$\u00079HZi<m;Y]xX>?\u0010Z`$>~SW\u0005";
        objectArray[34] = "\u001f\u000b\u0015Ce6\u001d\u001a\u0012R\u0001'X\u0001\u0007S{=C\u0004|\u0016=dL\u000e\u0000\u0016|'AkE\u001395@\u0017ERz8%Q\u001cFm8OS\rA|\\";
        objectArray[35] = "a:[)I\u0001`:_{y\u001eg?D'\u0015,7x\u0015@C\u001bc/@*A\nd>$z\u0019\u0012f'Nx\b\u0015wC";
        objectArray[36] = "\u0004laR~aU+v\u0013\u0013?^~h\u000eDh\u0000)0b,0E|p\u0012/6Tu";
        objectArray[37] = "n|#*U\u0011c089i\u0205R{g`\u0000\u0005.{&#\r";
        objectArray[38] = "e\u000b\u0000!{Lf\r\u0011(\u0007Y7\u0016\u001a)kkgTDq\u0007\u0002#\u001b\u0003sb_ \u0007GN";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "\u0016\u0014Hq$9\u0015\u0012YxX'H\u0018Vr\u000fr\u0018I\u000e\u001efq\u0011MWr5/N\b";
    }

    public static Class m274(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Ping.m272(l, l2);
            object = f6029[n];
            try {
                if (!(object instanceof String)) break block2;
                Ping.f6029[n] = clazz = Class.forName(f6030[n]);
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field m275(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Field m276(Class clazz, String string, Class clazz2) {
        Field field = Ping.m275(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Ping.m276(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m277(long l, long l2) {
        int n = Ping.m272(l, l2);
        Object object = f6029[n];
        if (object instanceof String) {
            String string = f6030[n];
            int n2 = string.indexOf(8);
            Class clazz = Ping.m274(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Ping.m274(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Ping.m275(clazz3, string2, clazz2)) != null) {
                    Ping.f6029[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Ping.m276(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Ping.f6029[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Ping.m274(1369176624012433L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new IllegalStateException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method m278(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    public static Method m279(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Ping.m278(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Ping.m279(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method m280(long l, long l2) {
        return null;
    }

    public static MethodHandle m281(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == '\u00e5' || c == 's' || c == 'F') {
                field = Ping.m277(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 's' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Ping.m280(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'r' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'X' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static Object m282(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = Ping.m281(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        try {
           return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Ping.class, "m173", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(Ping.class, "m282", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

