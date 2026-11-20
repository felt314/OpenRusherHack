/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ArmorItem
 *  net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.screen.slot.SlotActionType
 */
package org.rusherhack.client.api.feature.module.impl.player;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import org.rusherhack.Class114;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
public class XCarry
extends ToggleableModule {
    public Queue<Runnable> f3408;
    public BooleanSetting cancel;
    public static XCarry f3410;
    public Timer f3411;
    public BooleanSetting armorslots;
    public BooleanSetting shiftclick;
    public static long f3414;
    public static String[] f3415;
    public static String[] f3416;
    public static Map f3417;
    public static long[] f3418;
    public static Integer[] f3419;
    public static Map f3420;
    public static Object[] f3421;
    public static String[] f3422;

    public static /* synthetic */ void m7201(ClickSlotC2SPacket clickSlotC2SPacket, int n) {
        long l = f3414 ^ 0x251E802EABE9L;
        int n2 = n;
        ClickSlotC2SPacket clickSlotC2SPacket2 = clickSlotC2SPacket;
        Globals.mc.interactionManager.clickSlot(clickSlotC2SPacket2.getSyncId(), n2, 0, SlotActionType.PICKUP, (PlayerEntity)Globals.mc.player);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Subscribe
    public void m7202(EventPacket$Send var1_1) {
        
    }

    @Subscribe
    public void m7203(EventUpdate object) {
        
    }

    public XCarry() {
    }

    /*
     * Unable to fully structure code
     */
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7734;
        if (f3416[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])f3417.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f3417.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u0170", exception);
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
               byte[] byArray2 = f3415[n2].getBytes("ISO-8859-1");
               XCarry.f3416[n2] = XCarry.m221(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f3416[n2];
    }

    public static Object m173(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = XCarry.m172(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }
    public static int m175(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x504D;
        if (f3419[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f3418[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f3420.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f3420.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u0170", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            XCarry.f3419[n2] = n3;
        }
        return f3419[n2];
    }

    public static int m176(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = XCarry.m175(n, l);
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
            throw new IllegalStateException("org/rusherhack/\u0170" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int m178(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f3422[n3] != null) {
            return n3;
        }
        Object object = f3421[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 46;
            case 1 -> 43;
            case 2 -> 1;
            case 3 -> 32;
            case 4 -> 49;
            case 5 -> 14;
            case 6 -> 34;
            case 7 -> 20;
            case 8 -> 18;
            case 9 -> 41;
            case 10 -> 23;
            case 11 -> 24;
            case 12 -> 62;
            case 13 -> 48;
            case 14 -> 6;
            case 15 -> 27;
            case 16 -> 13;
            case 17 -> 38;
            case 18 -> 61;
            case 19 -> 11;
            case 20 -> 2;
            case 21 -> 60;
            case 22 -> 55;
            case 23 -> 4;
            case 24 -> 44;
            case 25 -> 59;
            case 26 -> 3;
            case 27 -> 10;
            case 28 -> 22;
            case 29 -> 19;
            case 30 -> 45;
            case 31 -> 31;
            case 32 -> 40;
            case 33 -> 47;
            case 34 -> 30;
            case 35 -> 39;
            case 36 -> 9;
            case 37 -> 57;
            case 38 -> 37;
            case 39 -> 8;
            case 40 -> 35;
            case 41 -> 50;
            case 42 -> 33;
            case 43 -> 54;
            case 44 -> 56;
            case 45 -> 63;
            case 46 -> 0;
            case 47 -> 36;
            case 48 -> 12;
            case 49 -> 17;
            case 50 -> 16;
            case 51 -> 53;
            case 52 -> 28;
            case 53 -> 25;
            case 54 -> 42;
            case 55 -> 58;
            case 56 -> 26;
            case 57 -> 29;
            case 58 -> 7;
            case 59 -> 51;
            case 60 -> 5;
            case 61 -> 21;
            case 62 -> 15;
            default -> 52;
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
        XCarry.f3422[n3] = new String(cArray);
        return n3;
    }
    public static Class m180(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = XCarry.m178(l, l2);
            object = f3421[n];
            try {
                if (!(object instanceof String)) break block2;
                XCarry.f3421[n] = clazz = Class.forName(f3422[n]);
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
        Field field = XCarry.m181(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = XCarry.m182(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m183(long l, long l2) {
        int n = XCarry.m178(l, l2);
        Object object = f3421[n];
        if (object instanceof String) {
            String string = f3422[n];
            int n2 = string.indexOf(8);
            Class clazz = XCarry.m180(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = XCarry.m180(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = XCarry.m181(clazz3, string2, clazz2)) != null) {
                    XCarry.f3421[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = XCarry.m182(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        XCarry.f3421[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = XCarry.m180(984209119510620L, 0L);
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
        Method method = XCarry.m184(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = XCarry.m185(classArray2[i], string, clazz2, n, classArray);
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
            if (c == 'x' || c == '\u00fe' || c == 'F' || c == '\u00f6') {
                field = XCarry.m183(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = XCarry.m186(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'm' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = XCarry.m187(lookup, mutableCallSite, string, methodType, l, l2);
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
            return MethodHandles.lookup().findStatic(XCarry.class, "m173", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(XCarry.class, "m176", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(XCarry.class, "m188", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

