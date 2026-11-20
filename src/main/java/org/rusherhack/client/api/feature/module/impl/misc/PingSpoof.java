/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  net.minecraft.network.ClientConnection
 *  net.minecraft.network.listener.PacketListener
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.PacketType
 *  net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket
 *  net.minecraft.text.Text
 */
package org.rusherhack.client.api.feature.module.impl.misc;

import io.netty.channel.Channel;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.PacketType;
import net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket;
import net.minecraft.text.Text;
import org.rusherhack.Class253;
import org.rusherhack.Class267;
import org.rusherhack.client.api.feature.module.impl.misc.PingSpoofDelaymode;
import org.rusherhack.client.api.feature.module.impl.misc.PingSpoofMode;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.client.IMixinConnection;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.command.clear;
import org.rusherhack.command.disconnect;
public class PingSpoof
extends ToggleableModule {
    public NumberSetting<Integer> f4814;
    public Map<Packet<?>, Long> f4815;
    public EnumSetting<PingSpoofDelaymode> delaymode;
    public static PingSpoof f4817;
    public Map<Packet<?>, Long> f4818;
    public List<PacketType<?>> f4819;
    public boolean f4820;
    public EnumSetting<PingSpoofMode> mode;
    public static long f4822;
    public static String[] f4823;
    public static String[] f4824;
    public static Map f4825;
    public static long[] f4826;
    public static Integer[] f4827;
    public static Map f4828;
    public static Object[] f4829;
    public static String[] f4830;

    @Subscribe(priority=-1010, ignoreCancelled=true)
    public void m7202(EventPacket$Send object) {
        
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void m9748(Packet<?> clientConnection) {
        
    }

    public PingSpoof() {
    }

    @Override
    public String getMetadata() {
        long l = f4822 ^ 0x4CDBA08704A4L;
        return String.format("%sms", this.f4814.getValue());
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Subscribe
    public void m9749(EventRender3D var1_1) {
        
    }

    @Override
    public void onDisable() {
        block3: {
            block2: {
                long l = f4822 ^ 0x7D270C342585L;
                int n = Class253.m9155();
                if (n == 0) break block2;
                if (Globals.mc.world != null && !Globals.mc.isConnectedToLocalServer()) break block3;
                PingSpoof pingSpoof = this;
                pingSpoof.f4818.clear();
                pingSpoof.f4815.clear();
            }
            return;
        }
        this.f4818.keySet().forEach(PingSpoof::m9754);
        this.f4818.clear();
    }

    @Subscribe(stage=Stage.PRE)
    public void m9750(EventUpdate object) {
        
    }

    /*
     * WARNING - void declaration
     */
    public boolean m9752(Packet<?> packet) {
        Packet<?> var1_3 = packet;
        PingSpoof object;
        long l = f4822 ^ 0x169E0EDDB376L;
        int n = Class253.m9154();
        PingSpoof pingSpoof = this;
        if (!((PingSpoofDelaymode)((Object)pingSpoof.delaymode.getValue())).equals((Object)PingSpoofDelaymode.f5765) || !((PingSpoofMode)((Object)pingSpoof.mode.getValue())).equals((Object)PingSpoofMode.f9065)) {
            return false;
        }
        if (Globals.mc.world == null || Globals.mc.player == null || !Globals.mc.player.isAlive() || Globals.mc.isConnectedToLocalServer() || !pingSpoof.f4819.contains(var1_3.getPacketId())) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Packet<?>, Long> entry : pingSpoof.f4815.entrySet()) {
            if (System.currentTimeMillis() - entry.getValue() < (long)((Integer)pingSpoof.f4814.getValue()).intValue()) continue;
            PingSpoof.m9748(entry.getKey());
            arrayList.add(entry.getKey());
            if (n == 0) continue;
            break;
        }
        arrayList.forEach(pingSpoof.f4815::remove);
        pingSpoof.f4815.put((Packet<?>)var1_3, System.currentTimeMillis());
        return true;
    }

    public static void m9754(Packet<?> object) {
        
    }

    /*
     * Unable to fully structure code
     */
    

    public static IllegalStateException m6252(IllegalStateException runtimeException) {
        return new IllegalStateException(runtimeException);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x255E;
        if (f4824[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])f4825.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f4825.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u0238", exception);
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
               byte[] byArray2 = f4823[n2].getBytes("ISO-8859-1");
               PingSpoof.f4824[n2] = PingSpoof.m221(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f4824[n2];
    }

    public static Object m173(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = PingSpoof.m172(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }
    public static int m175(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x486D;
        if (f4827[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f4826[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f4828.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f4828.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u0238", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            PingSpoof.f4827[n2] = n3;
        }
        return f4827[n2];
    }

    public static int m176(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = PingSpoof.m175(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static CallSite m177(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new IllegalStateException("org/rusherhack/\u0238" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int m178(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f4830[n3] != null) {
            return n3;
        }
        Object object = f4829[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 15;
            case 1 -> 10;
            case 2 -> 40;
            case 3 -> 2;
            case 4 -> 36;
            case 5 -> 51;
            case 6 -> 9;
            case 7 -> 18;
            case 8 -> 0;
            case 9 -> 49;
            case 10 -> 60;
            case 11 -> 63;
            case 12 -> 54;
            case 13 -> 11;
            case 14 -> 42;
            case 15 -> 47;
            case 16 -> 48;
            case 17 -> 61;
            case 18 -> 31;
            case 19 -> 6;
            case 20 -> 35;
            case 21 -> 23;
            case 22 -> 24;
            case 23 -> 38;
            case 24 -> 4;
            case 25 -> 56;
            case 26 -> 52;
            case 27 -> 53;
            case 28 -> 59;
            case 29 -> 8;
            case 30 -> 26;
            case 31 -> 25;
            case 32 -> 22;
            case 33 -> 13;
            case 34 -> 29;
            case 35 -> 17;
            case 36 -> 57;
            case 37 -> 41;
            case 38 -> 45;
            case 39 -> 16;
            case 40 -> 46;
            case 41 -> 3;
            case 42 -> 12;
            case 43 -> 62;
            case 44 -> 5;
            case 45 -> 58;
            case 46 -> 21;
            case 47 -> 1;
            case 48 -> 55;
            case 49 -> 7;
            case 50 -> 33;
            case 51 -> 34;
            case 52 -> 43;
            case 53 -> 28;
            case 54 -> 44;
            case 55 -> 30;
            case 56 -> 37;
            case 57 -> 19;
            case 58 -> 27;
            case 59 -> 14;
            case 60 -> 32;
            case 61 -> 20;
            case 62 -> 39;
            default -> 50;
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
        PingSpoof.f4830[n3] = new String(cArray);
        return n3;
    }
    public static Class m180(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = PingSpoof.m178(l, l2);
            object = f4829[n];
            try {
                if (!(object instanceof String)) break block2;
                PingSpoof.f4829[n] = clazz = Class.forName(f4830[n]);
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field m181(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Field m182(Class clazz, String string, Class clazz2) {
        Field field = PingSpoof.m181(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = PingSpoof.m182(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m183(long l, long l2) {
        int n = PingSpoof.m178(l, l2);
        Object object = f4829[n];
        if (object instanceof String) {
            String string = f4830[n];
            int n2 = string.indexOf(8);
            Class clazz = PingSpoof.m180(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = PingSpoof.m180(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = PingSpoof.m181(clazz3, string2, clazz2)) != null) {
                    PingSpoof.f4829[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = PingSpoof.m182(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        PingSpoof.f4829[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = PingSpoof.m180(74310517169213L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new IllegalStateException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method m184(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Method m185(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = PingSpoof.m184(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = PingSpoof.m185(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method m186(long l, long l2) {
        return null;
    }

    public static MethodHandle m187(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ef' || c == '$' || c == '\u00b5' || c == '\u00a3') {
                field = PingSpoof.m183(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = PingSpoof.m186(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static Object m188(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = PingSpoof.m187(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        try {
           return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }

    public static CallSite m265(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new IllegalStateException("org/rusherhack/\u0238" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(PingSpoof.class, "m173", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(PingSpoof.class, "m176", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(PingSpoof.class, "m188", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

