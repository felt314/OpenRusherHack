/*
 * Decompiled with CFR 0.152.
 */
package org.rusherhack.core.event;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.event.IEventBus;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.MethodSubscriber;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.event.subscribe.SubscriberBase;
import org.rusherhack.core.event.type.Event;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.clear;
public class EventBus
implements IEventBus {
    public IdentityHashMap<Class<? extends Event>, SubscriberBase[]> f1561;
    public static String f1562;
    public static long f1563;
    public static String[] f1564;
    public static String[] f1565;
    public static Map f1566;
    public static Object[] f1567;
    public static String[] f1568;

    @Override
    public void post(Event event) {
        
    }

    @Override
    public void unsubscribe(Object object) {
        
    }

    @Override
    public void post(Event event, Stage object) {
        
    }

    @Override
    public void post(Event event, Runnable runnable) {
        
    }

    @Override
    public void post(Event event, Runnable runnable, Stage object) {
        
    }

    public static /* synthetic */ int lambda$subscribe$0(SubscriberBase subscriberBase, SubscriberBase subscriberBase2) {
        long l = f1563 ^ 0x7DC0CACBFEAL;
        SubscriberBase subscriberBase3 = subscriberBase;
        subscriberBase = subscriberBase2;
        subscriberBase2 = subscriberBase3;
        return Integer.compare(subscriberBase.getPriority(), subscriberBase2.getPriority());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void subscribe(Object var1_1) {
        
    }

    public EventBus() {
    }

    public void clear() {
        
    }

    public static void m3789(String string) {
        f1562 = string;
    }

    public static String m3790() {
        return f1562;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
    }
    public static String m117(byte[] byArray) {
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

    public static String m153(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x611D;
        if (f1565[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f1566.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f1566.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/core/event/EventBus", exception);
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
               byte[] byArray2 = f1564[n2].getBytes("ISO-8859-1");
               EventBus.f1565[n2] = EventBus.m117(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f1565[n2];
    }

    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = EventBus.m153(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }
    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f1568[n3] != null) {
            return n3;
        }
        Object object = f1567[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 15;
            case 1 -> 29;
            case 2 -> 11;
            case 3 -> 53;
            case 4 -> 47;
            case 5 -> 1;
            case 6 -> 37;
            case 7 -> 38;
            case 8 -> 44;
            case 9 -> 5;
            case 10 -> 46;
            case 11 -> 62;
            case 12 -> 27;
            case 13 -> 49;
            case 14 -> 34;
            case 15 -> 35;
            case 16 -> 41;
            case 17 -> 32;
            case 18 -> 57;
            case 19 -> 26;
            case 20 -> 43;
            case 21 -> 48;
            case 22 -> 54;
            case 23 -> 55;
            case 24 -> 19;
            case 25 -> 2;
            case 26 -> 45;
            case 27 -> 59;
            case 28 -> 3;
            case 29 -> 18;
            case 30 -> 22;
            case 31 -> 8;
            case 32 -> 6;
            case 33 -> 50;
            case 34 -> 12;
            case 35 -> 60;
            case 36 -> 16;
            case 37 -> 7;
            case 38 -> 61;
            case 39 -> 31;
            case 40 -> 17;
            case 41 -> 21;
            case 42 -> 28;
            case 43 -> 56;
            case 44 -> 52;
            case 45 -> 30;
            case 46 -> 20;
            case 47 -> 10;
            case 48 -> 39;
            case 49 -> 0;
            case 50 -> 13;
            case 51 -> 63;
            case 52 -> 36;
            case 53 -> 14;
            case 54 -> 33;
            case 55 -> 9;
            case 56 -> 51;
            case 57 -> 4;
            case 58 -> 58;
            case 59 -> 42;
            case 60 -> 23;
            case 61 -> 25;
            case 62 -> 24;
            default -> 40;
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
        EventBus.f1568[n3] = new String(cArray);
        return n3;
    }

    public static void m122() {
        Object[] objectArray = f1567;
        f1567[0] = "=-#[\u0019k!7!\u0007\u0003\u007f14j\u0016\u0004l7q!\u0003\u000ep&q\u0001\u0003\u000ep&\u001d1\u0006";
        objectArray[1] = "\u0000V'/Z,\u001cL%s@8\fOnbG+\n\n%wM7\u001b\n4xX<Aa6dF-";
        objectArray[2] = Void.TYPE;
        EventBus.f1568[2] = "java/lang/Void";
        objectArray[3] = "3Y,zT~/C.&Nj?@e7Iy9\u0005.\"Ce(\u00058 Gl9\u0005\u0018 Gl9";
        objectArray[4] = "\u0000\u0005_H&k\u001c\u001f]\u0014<\u007f\f\u001c\u0016\u0005;l\nY]\u00101p\u001bYK\u00136m\f\u0005Q\u000410<\u0002Z\u00157l\u0006\u0015]\u0014\u0016\u007f\u001c\u0012";
        objectArray[5] = Integer.TYPE;
        EventBus.f1568[5] = "java/lang/Integer";
        objectArray[6] = "gB\u0015\nP\u0002lM\u0004E7\u0000yF\u0004\u000e\f";
        objectArray[7] = "E:\u0007\u0004{6N5\u0016K\u0007/A5\u0010\u00079?";
        objectArray[8] = "\u0001Q\u00170\u0005(\n^\u0006\u007fx0\u0019Y\u000f6";
        objectArray[9] = "\u000eDt\u001d_B\u0012^vAEV\u0002]=PBE\u0004\u0018`VYC\bXt\u001d~R\u0015Bz]J";
        objectArray[10] = "}AM'z\u000f\baF(k@uyU/b\t\u001d";
        objectArray[11] = "'\u0014\u001b|+y,\u001b\n3Q}?\u001a\u001a|gy(";
        objectArray[12] = "\\{C[ynWtR\u0014%gPvPY#,{\u007fAR8f";
        objectArray[13] = "a~hp,_jqy?A_jlm";
        objectArray[14] = Boolean.TYPE;
        EventBus.f1568[14] = "java/lang/Boolean";
        objectArray[15] = "\u0002hj\u0002)1\u001c`pMN \rgh\ns= ho\u000bJ%\u0018";
        objectArray[16] = "Lq\u0000VH\nG~\u0011\u0019)\u0004Lu\u0015C";
        objectArray[17] = "5+JI5}@\u000bAF$2\u001c\u0002FD&\u007f\u001aImM7t\u0001\u0003\u001b";
        objectArray[18] = "1o^`Q=/gD/>:)oQr";
        objectArray[19] = "|\u001fX7&\u0005\t?S87Jh1X33\u0010\u001c";
        objectArray[20] = "e\u0014,\u0019AN{\u001c6V,Tb\u0005;\n\u000eO`\u0007";
        objectArray[21] = "d_^2ThoPO})}}JM>";
        objectArray[22] = ")\u0011@]ot,^fN(s7#BN$|.";
        objectArray[23] = "CU8^\u001c|6u3Q\r3W{8Z\ti#";
        objectArray[24] = "%OZ\u0005yGPoQ\nh\b1aZ\u0001lRE";
        objectArray[25] = "\u0012u_1=(gUT>,g\u001aMG9%.r";
        objectArray[26] = "Im&\u0016Q\bBb7Y\u001e\nMc$\u0016\u000b\rLb~6\u0011\nLx1\u0003\u0016\u000bM";
        objectArray[27] = "9VYy&dLvRv7+!vRk#>";
        objectArray[28] = "\u0017!8T\u0007%\t)\"\u001bf2\u0017%-AZ";
        objectArray[29] = "MZ`\u000f0\u001bSRz@W\u001aBIw\u001aq\u001c";
        objectArray[30] = "L9OW\u00037R1U\u0018~'R";
        objectArray[31] = "=z\u0005Ti4#r\u001f\u001b45%~\u0012Xi\u0012#i\u0016T*";
        objectArray[32] = "tb\u007ffVbjje)\u001ebp`}n\u0017y0S{b\u001c~}b}b";
        objectArray[33] = "#odOJk=g~\u0000\u0002k'mfG\u000bpgG|Z\"k'mfG\u000bp";
        objectArray[34] = "\u0016ftnWScF\u007faF\u001c\u0002HtjBFv";
        objectArray[35] = "FdpDt\\3D{Ke\u0013RJp@aI&";
        objectArray[36] = "WU\u0003E\u0018G_\u000b\u001d&\u001dYB\u0012g\u001f]TES\t_\u0002\u0002\u0001nZ\u0016TEE\u0000\u0003\u001c\u001c\u00039W\u0000L\u001eUT^\\H\u0002>";
        objectArray[37] = "\"=~\u0016x'c h\u0019\u0012!i\u0010c\u0011u<{%d\u0010t\u0018h4~\u001at<\u0012hf\b)?t5g\u001b+@#+cJt}rb:\u0018\u0012";
        objectArray[38] = "i0N6:00#\u0011j_:g.\\S5>r\"\u001f*?1nf ";
        objectArray[39] = "us~Bj1}ob\u000e\u000eb{kcYoogNrA\u000ec~uc\u000fwiqi'0?{z0y\rn2#b\u001f";
        objectArray[40] = ".\u0014~&`Ej@h \u0006WxQY\"oCnjx$kSi-x$~D*Tr+b\u0000\u0015";
        objectArray[41] = "@?0@j<\u001d>#B\u0015;\n\u00154\u0000t5\u00175%\u001fx\u0014\u000b;*{$9\u000eg0\u001dy8\u001deOJg<L:r\u001b.e\u001e\\";
        objectArray[42] = "e+-\u001coFm71P\u000b\u0011a)L\u0004i\u0006pj5\u000ef\u001a4U&\fs\u00023,,\u0003oF\f";
        objectArray[43] = "\u000e\u0017-i+B\u000e\b~rMO\u0011\bhf1I\u0017eqa#K\b\t(r|\u0017m";
        objectArray[44] = "j-)>\u0000+7,:<\u007f\"62\u001ah\u0014)24;i: '.1i\u0004M0\"&h\u000fr$$;l\u007f";
        objectArray[45] = "M<x<\u0000pEbf_\u0014\t\u001cw&&@b^gv&}6S=eb\u0016tCme_";
        objectArray[46] = "i\\y@a1a@e\f\u0005bdOqH\u00050gHcYh9;L\u007f2";
        objectArray[47] = "\u000f~3JENVt{\f9ZO(\u0002\b^JI%o\u0001\u0002NUN";
        objectArray[48] = "ELZ-)5KAT%J(IJJ_-<\u0014\u0000Rn57U@62s-\u0011@W8q.\u00140\u000f8 (E]\u0006d$4.";
        objectArray[49] = "5#J_hc=}T<\u0484\u001afeIPpa6|K\u0006\u0015#<rUWx*`vI<";
        objectArray[50] = "t\u0003G3mL0WQ5\u000b^\"Fs)jV5[W\"\u000b\n>B\u0014<q\r0\u0007@S";
        objectArray[51] = "Jy\u0012-7\u000e\u000e-\u0004+Q\b\u0011'\u0003)=2\u0017>\u0019.<sHx\u00141l\u001d\b'BuQB\u0003&C+l\u0013J\u007f\u0011M";
        objectArray[52] = "\u0007Y`m\f\u001d[@%wo\u000e\u0002Aay\u0015`\u0006Hq}\r\u0010\u0018]p{o\u0004\u001fXdw\u0012X\u0006\u001d~\u0014";
        objectArray[53] = "a\u0018G\u0003\u001fO`\u000e\u0006\b}Kq\u001d=]LJv\u001e\u0002\f\u0013^3";
        objectArray[54] = "AwmkM^\u001dn(q._BBjhGR%m.(\u0013\u001f]p|iJ#Bd*\"J\u0012Zokb.";
        objectArray[55] = "\u0015]d\u000b\rG\u001dAxGi\u0007\u0001_\u0005\u0013\u000b\u0007\u0000\u001c|\u0019\u0004\u001bD#o\u001b\u0011\u0003CZe\u0014\rG|Ig\u0001\u0015@\u0005Ch\u001dQ\u007f";
        objectArray[56] = "\n*\u0012\u0000e:[u\u0006E\u001a}\u001ez\u0012\u0006~cd&\t\u001dv`\u001fv\u0010\u001f \u0005]|\u001e\u0001qhT \u001a\u001d\u001a";
        objectArray[57] = "yYS3\u001e/q\u0007MP\u04abV*\u001fP<\u0006-z\u0006Rjc";
        objectArray[58] = "l.\u0017\u001e\u001f\u0012d2\u000bR{Ih!-\u0001\u0007*f\"I\n\u001dFf=\u001a\u0011{";
        objectArray[59] = "]\u0014Z\u0000C\u000b\u001c\u0012FF,\u050dc\nR\u000eRT\u0019\u0010Y\u001f@l";
        objectArray[60] = "V-$Z&L\u000b,7XYE\n2\u001d\b<Ggs&\u00065O\u001c#?\u0004c*";
        objectArray[61] = "C\\?\u0016NBK\u0002!uK\\V\u001b[L\u000bQQZ5\fT\u0007\u0015gb\u0012Y@F\nkN]\\-";
        objectArray[62] = "#\u0005\u001bRO/a\u0015KRr<f\u0014GW)8u\u001eBw\b-w\u0018!\u0012\u0015.g\u001eL\u001bI*{u";
        objectArray[63] = "\u001e\b{\u001a\u001f\u001f\u0010\u0005u\u0012|\u0012\u0012\ff/\u0012y\u0012\u001b-X\u0018H\n\u0010l\u0018|B\u0004\f(\u0007\u0006E\nI|h\u001b\u0016ODsY\u0003\u001d\u000e\u0004\u0017";
        objectArray[64] = "q=ca'\u0007\u007f0miD\u001af;bz!a}.5# Pe%tcD\u0005f<vp9Y\u007fyl\u0013";
        objectArray[65] = "*\nf]$0w\u000bu_[?`2d\f02r\u0012bfj5dRf\u000074wP\u0019W8) \u0016\u007f\n9:\"i";
        objectArray[66] = "f*$d\r(',8\"b\u0330X4,j\u001cw\".'{\u000eOa34`\t\"ho0|b";
        objectArray[67] = "T8\u0001gd:\r+^;\u00016^-)oq*7g\u001dd<0\n6T=nV";
        objectArray[68] = "XUoX\u0014\u001b\u0019HyW~\u0013\u0005M]_\u0018\u001b\u0014XhX\u0019\u001ah\u0000wFE\u0003\u000e]vUG|\t\u000ey\u0006B\u001eP^o\u0005~";
        objectArray[69] = ">\u007f'B%\u0017z+1DC\u000bc8,A.j<~!^~\u0004|!w\u001aCSb,0I.Z>(,\"";
        objectArray[70] = "sf?\u0005k639iAV#'\"\u000e\u0005?7'^o\u00176#69*\u001f+=Jg2\u0013-3'nn\u00171X";
        objectArray[71] = "+\u0002^'\u0019$mFM>\"-pXT0X+\u0017\u0006]!\u001d)m\u0001SdIF,LTfM<+B\u00112\"}fE\u00136Xzh\u0000GY";
        objectArray[72] = "\u0005jDi\t\u0019\r4Z\n\u04b3`\u0002/Ax\u0010X\n3]4";
        objectArray[73] = "\u0010~W\u0000-\u0018QcA\u000fG\u0010Mft\b=\u0016EwP\f=#QbA\u001aG\u001dKaH\u001d8G\u0011{\u0011a";
        Object[] objectArray2 = objectArray;
        objectArray[74] = "$*:\u0002=\u0006,)y_CV?1)W8;,.8O|B&!$\u000bCQ$4<\f:[+(x3rI q&\u000e#\u0000y#@";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EventBus.m121(l, l2);
            object = f1567[n];
            try {
                if (!(object instanceof String)) break block2;
                EventBus.f1567[n] = clazz = Class.forName(f1568[n]);
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field m124(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Field m125(Class clazz, String string, Class clazz2) {
        Field field = EventBus.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EventBus.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = EventBus.m121(l, l2);
        Object object = f1567[n];
        if (object instanceof String) {
            String string = f1568[n];
            int n2 = string.indexOf(8);
            Class clazz = EventBus.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EventBus.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EventBus.m124(clazz3, string2, clazz2)) != null) {
                    EventBus.f1567[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EventBus.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EventBus.f1567[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EventBus.m123(1172783310129684L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new IllegalStateException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method m127(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Method m128(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EventBus.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EventBus.m128(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method m129(long l, long l2) {
        return null;
    }

    public static MethodHandle m130(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f2' || c == 'j' || c == '\u00d2' || c == '\u00fa') {
                field = EventBus.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EventBus.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'a' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static Object m131(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EventBus.m130(lookup, mutableCallSite, string, methodType, l, l2);
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
            return MethodHandles.lookup().findStatic(EventBus.class, "m154", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(EventBus.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }
}

