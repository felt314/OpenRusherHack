/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.tutorial.TutorialStep
 */
package org.rusherhack;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.tutorial.TutorialStep;
import org.rusherhack.client.api.feature.module.impl.client.ClickGUI;
import org.rusherhack.Class066;
import org.rusherhack.Class070;
import org.rusherhack.Class079;
import org.rusherhack.Class109;
import org.rusherhack.Class221;
import org.rusherhack.Class263;
import org.rusherhack.Renderer268;
import org.rusherhack.command.Class291;
import org.rusherhack.Class331;
import org.rusherhack.Class384;
import org.rusherhack.Hud388;
import org.rusherhack.Class407;
import org.rusherhack.Class432;
import org.rusherhack.Renderer434;
import org.rusherhack.Class446;
import org.rusherhack.Class467;
import org.rusherhack.Class486;
import org.rusherhack.Util494;
import org.rusherhack.Class534;
import org.rusherhack.Class545;
import org.rusherhack.Class564;
import org.rusherhack.Class572;
import org.rusherhack.Class587;
import org.rusherhack.Class594;
import org.rusherhack.Class608;
import org.rusherhack.Class610;
import org.rusherhack.client.Class019;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.bind.key.GLFWKey;
import org.rusherhack.client.api.config.JsonConfiguration;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventQuit$Reason;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.EventBus;
import org.rusherhack.core.logging.Logger;

import org.rusherhack.command.bind;
import org.rusherhack.command.config;
public class Class170 {
    public Class446 f3343;
    public static boolean f3344;
    public Class407 f3345;
    public static Logger f3346;
    public JsonConfiguration f3347;
    public Class610 f3348;
    public Class070 f3349;
    public static Path f3350;
    public Class587 f3351;
    public Class564 f3352;
    public static boolean f3353;
    public Hud388 f3354;
    public Util494 f3355;
    public Renderer268 f3356;
    public Class467 f3357;
    public Renderer434 f3358;
    public Class572 f3359;
    public static boolean f3360;
    public Class109 f3361;
    public static EventBus f3362;
    public Class221 f3363;
    public static Class170 f3364;
    public Class331 f3365;
    public Class291 f3366;
    public Class019 f3367;
    public Class486 f3368;
    public static String f3369;
    public static long f3370;
    public static String[] f3371;
    public static String[] f3372;
    public static Map f3373;
    public static long[] f3374;
    public static Integer[] f3375;
    public static Map f3376;
    public static Object[] f3377;
    public static String[] f3378;

    public Class109 m7103() {
        long l = f3370 ^ 0x8142E082FEDL;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)6940260998375809534L, (long)l);
    }

    public void m7104() {
        
    }

    public Class291 m7105() {
        long l = f3370 ^ 0x43A91AACF7L;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)-2067931990249329949L, (long)l);
    }

    public Class587 m7106() {
        long l = f3370 ^ 0x30CAC4459E19L;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)-3337392772312828873L, (long)l);
    }

    public Class446 m7107() {
        long l = f3370 ^ 0x65C9846D82F5L;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)-3656369542681692569L, (long)l);
    }

    public Class331 m7108() {
        long l = f3370 ^ 0x37CF065E85BAL;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)-3888846828171601701L, (long)l);
    }

    public Class486 m7109() {
        long l = f3370 ^ 0x671E68C3DF6EL;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)-8007331625925722299L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Class170() {
    }

    public Class572 m7110() {
        long l = f3370 ^ 0xF03A5D06B43L;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)2664951764356996927L, (long)l);
    }

    public Class019 m7111() {
        long l = f3370 ^ 0x5EF9597E781EL;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)4011352705429749998L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        f3362 = new EventBus();
    }

    public Class221 m7112() {
        long l = f3370 ^ 0x63BEE67F2C0L;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)-4805362298566527442L, (long)l);
    }

    public Util494 m7114() {
        long l = f3370 ^ 0xCE3B327EC7EL;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)-6632662635932586744L, (long)l);
    }

    public Hud388 m7115() {
        long l = f3370 ^ 0x158DA59751C5L;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)2183372353408167552L, (long)l);
    }

    public Class467 m7116() {
        long l = f3370 ^ 0x7B97C61D2D07L;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)7102091562425013128L, (long)l);
    }

    public Class610 m7117() {
        long l = f3370 ^ 0x1C35973C8F5BL;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)-4547042672479629823L, (long)l);
    }

    public static void m6358() {
        
    }

    public Class407 m7119() {
        long l = f3370 ^ 0x219C304F84C9L;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)-3783218812168667078L, (long)l);
    }

    public void m7120() {
        
    }

    public Renderer434 m7121() {
        long l = f3370 ^ 0x5F1A8AAA8414L;
        return ZkmDispatch.invoke(Class170.m174(MethodHandles.lookup(), "\u00eb", MethodType.methodType(Object.class, Object.class, long.class, long.class)), (Object)this, (long)-3770844357785108724L, (long)l);
    }

    public static void m7122(String string) {
        f3369 = string;
    }

    public static String m7123() {
        return f3369;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x64F2;
        if (f3372[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])f3373.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f3373.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u016b", exception);
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
               byte[] byArray2 = f3371[n2].getBytes("ISO-8859-1");
               Class170.f3372[n2] = Class170.m117(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f3372[n2];
    }

    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = Class170.m153(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    public static CallSite m120(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new IllegalStateException("org/rusherhack/\u016b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int m2808(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x61A1;
        if (f3375[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f3374[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f3376.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f3376.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u016b", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Class170.f3375[n2] = n3;
        }
        return f3375[n2];
    }

    public static int m2809(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Class170.m2808(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static CallSite m132(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new IllegalStateException("org/rusherhack/\u016b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f3378[n3] != null) {
            return n3;
        }
        Object object = f3377[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 53;
            case 1 -> 36;
            case 2 -> 37;
            case 3 -> 2;
            case 4 -> 26;
            case 5 -> 25;
            case 6 -> 21;
            case 7 -> 54;
            case 8 -> 58;
            case 9 -> 47;
            case 10 -> 10;
            case 11 -> 28;
            case 12 -> 15;
            case 13 -> 33;
            case 14 -> 29;
            case 15 -> 39;
            case 16 -> 44;
            case 17 -> 38;
            case 18 -> 19;
            case 19 -> 49;
            case 20 -> 30;
            case 21 -> 50;
            case 22 -> 7;
            case 23 -> 20;
            case 24 -> 63;
            case 25 -> 22;
            case 26 -> 5;
            case 27 -> 27;
            case 28 -> 34;
            case 29 -> 11;
            case 30 -> 3;
            case 31 -> 60;
            case 32 -> 23;
            case 33 -> 0;
            case 34 -> 31;
            case 35 -> 12;
            case 36 -> 24;
            case 37 -> 16;
            case 38 -> 62;
            case 39 -> 41;
            case 40 -> 56;
            case 41 -> 57;
            case 42 -> 6;
            case 43 -> 17;
            case 44 -> 51;
            case 45 -> 32;
            case 46 -> 42;
            case 47 -> 46;
            case 48 -> 18;
            case 49 -> 55;
            case 50 -> 61;
            case 51 -> 9;
            case 52 -> 13;
            case 53 -> 59;
            case 54 -> 14;
            case 55 -> 1;
            case 56 -> 45;
            case 57 -> 52;
            case 58 -> 40;
            case 59 -> 35;
            case 60 -> 48;
            case 61 -> 43;
            case 62 -> 4;
            default -> 8;
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
        Class170.f3378[n3] = new String(cArray);
        return n3;
    }

    public static void m122() {
        Object[] objectArray = f3377;
        f3377[0] = "?d9g\u000b|#~;;\u0011h3}p\u0122";
        objectArray[1] = "PZ\b\u000f;'L@\nS!3\\CA\u01ec";
        objectArray[2] = "X-\r<<\u0000D7\u000f`&\u0014T4D\u029f";
        objectArray[3] = "g93yA\u0002{#1%[\u0016k z\u03e9";
        objectArray[4] = "S0\u001a>::O*\u0018b ._)S\u00e5";
        objectArray[5] = "^j\f;\u0000\u0006Bp\u000eg\u001a\u0012RsE\u049b";
        objectArray[6] = "|C\u0012i7Y`Y\u00105-MpZ[\u0517";
        objectArray[7] = "9\u0018\u0018c\\~%\u0002\u001a?Fj5\u0001Q\u0209";
        objectArray[8] = "a\u0011\u0012d=G}\u000b\u00108'Sm\b[)#[k\r\u0001d\u008e";
        objectArray[9] = "1\u000bR:d\u007f-\u0011Pf~k=\u0012\u001b\u0460";
        objectArray[10] = "bJ\u0012u+\u001a~P\u0010)1\u000enS[86\u001dh\u0016\u00194>\bdV\u0012u\u0015\u0000j_\u0010)";
        objectArray[11] = "R1-<|\u0000N+/`f\u0014^(dqa\u0007Xm?fg\u0019Nm\u0007sz\u001dh7#~}";
        objectArray[12] = "\u000b\u001an\u001d\u0005\n\u0000\u0015\u007fRx\u0012\u0013\u0012v\u001b";
        objectArray[13] = ".\u0017TbbE%\u0018E->L\"\u001aG`8\u0007\u0002\u001fGo(";
        objectArray[14] = "\u000b\u0003\u001eBFL\u0000\f\u000f\r'B\u000b\u0007\u000bW";
        objectArray[15] = Void.TYPE;
        Class170.f3378[15] = "java/lang/Void";
        objectArray[16] = Boolean.TYPE;
        Class170.f3378[16] = "java/lang/Boolean";
        objectArray[17] = "mo@q[_f`Q>6_f}E";
        objectArray[18] = "2\u001eA}V#.\u0004C!L7>\u0007\b\u0248";
        objectArray[19] = "T_\u0014X\u0013IHE\u0016\u0004\t]XF]\u0015\u000eN^\u0003\u001f\u0019\u0006[RC\u0014X(pTJ";
        objectArray[20] = "Y)@\u0001w:,\tK\u000efuM\u0007@\u0005b/9";
        objectArray[21] = "\u0013f\u001b\f\u0017\u0012\u000f|\u0019P\r\u0006\u001f\u007fR\u0439";
        objectArray[22] = "tg{8\"\u0018h}yd8\fx~2\u045e";
        objectArray[23] = "Cw\u000fwh\u0014_m\r+r\u0000OnF:u\u0013I+\r/\u007f\u000fX+-/\u007f\u000fXG\u001d*";
        objectArray[24] = "\\]-64F@G/j.RPDd{)AV\u0001/n#]G\u00019l'TV\u0001\u0019l'TV";
        objectArray[25] = "1`\u001f\t\u000fA-z\u001dU\u0015U=yVD\u0012F;<\u001dQ\u0018Z*<\f^\rQpW\u000eB\u0013@";
        objectArray[26] = "ch\u00187NK\u007fr\u001akT_oqQzPWit\u000b7]Ne4\u001aoYPxiQzPWit\u000b7yHit\u000bHIWx>-|]Mct";
        objectArray[27] = "\u0004\u0013I\u0018\u0014\u001c\u0018\tKD\u000e\b\b\n\u0000U\n\u0000\u000e\u000fZ\u0018\u0007\u0019\u0002OHS\u0007\u001d\u001e\u0013K\u0018\u0005\u0006\u0006\fOX\u0002G\n\u0013I\u00186\u0005\n\u0018KD4\f\r\u0004\\S\b\n\u000e";
        objectArray[28] = "8G38{3$]1da'4^z\u038e";
        objectArray[29] = "M\r^Rb8HBnZ 4";
        objectArray[30] = "lV\u0017\u0010wsgY\u0006_\u001cgeR\u0011\u00050ph";
        objectArray[31] = "7Hhtn=<Gy;\u00039<[Mp1.8G}p";
        objectArray[32] = "-Ej\u0003`[.K2\u0004'Y\"\nL\u0003:]";
        objectArray[33] = "h`\u0010o|sco\u0001 \u0001fqu\u0003c";
        objectArray[34] = "\"\u001c!'%|>\u0006#{?h.\u0005h\u0419";
        objectArray[35] = "F[uCp\u000bZAw\u001fj\u001fJB<\u05ed";
        objectArray[36] = "9Wz<9;%Mx`#/5N3\u0590";
        objectArray[37] = "J\n{2G3V\u0010yn]'F\u00132\u021a";
        objectArray[38] = Integer.TYPE;
        Class170.f3378[38] = "java/lang/Integer";
        objectArray[39] = "y'J4\u00112e=Hh\u000b&u>\u0003y\u000f.s;Y4\u00027\u007f{Nu\r!\u007f2\u0003P\u0010(x\u0016Bt\u0005.q _{\u0017.y;";
        objectArray[40] = "\u0003j\u001bqG^\u001fp\u0019-]J\u000fsR\u013b";
        objectArray[41] = "Hs\u001e(\u00151Ti\u001ct\u000f%DjWl";
        objectArray[42] = ",-\u0017\u0019\"\u000f07\u0015E8\u001b 4^\u015a";
        objectArray[43] = "e\u0014\n`/+y\u000e\b<5?i\rC\u02fc";
        objectArray[44] = "\u0000SO6Y]\f[N}\u0010Q\fQOwP\u001c\nS\f^W^\u0006O";
        objectArray[45] = "\u0016?!r+\u0011c\u001a$=\u001b\u0019!\u0016p";
        objectArray[46] = "/\u00109[:JZ02T+\u0005;>9_/_O";
        objectArray[47] = "M<*\u001c\"\u0013Q&(@8\u0007A%c\u0122";
        objectArray[48] = "PTH\u001b|\bLNJGf\u001c\\M\u0001Va\u000fZ\b\\P|\u0014^JFOkSvuJGg\u001cSOUTl\u0011Z";
        objectArray[49] = "Y\u0003\fzh\u0013E\u0019\u000e&r\u0007U\u001aE7v\u000fS\u001f\u001fz{\u0016__\b;t\u0000_\u0016E\u0017u\bP\u0018\f!h\u0007B\u0018\u0004:";
        objectArray[50] = "U>H<w5I$J`m!Y'\u0001\u0577";
        objectArray[51] = "\u0004w)_5\u0011\u0018m+\u0003/\u0005\bn`\u0091";
        objectArray[52] = "#d Di\u0012?~\"\u0018s\u0006/}i\u0382";
        objectArray[53] = "^:\tyt\tB \u000b%n\u001dR#@\u047a";
        objectArray[54] = "K,vLMUW6t\u0010WAG5?\u055b";
        objectArray[55] = "eUR\fB\u0011eUEPN\u001e\u007f\u001eENN\u000bxo\u0015\u0014\u0018M";
        objectArray[56] = "Xp;=Q,Xp,a]#B;,\u007f]6EJ|%\u000bp\u0012v#rO6i&\u007f%";
        objectArray[57] = "Z/aMOgZ/v\u0011Ch@dv\u000fC}G\u0015&R\u0017";
        objectArray[58] = "*Is_G)*Id\u0003K&0\u0002d\u001dK37s4A\u001e";
        objectArray[59] = "23G\u0006C\u0005.)EZY\u0011>*\u000eK]\u00198/T\u0006P\u00004oBA_\u0014s*EQ\u001f7\u0011\u0007wcT\t";
        objectArray[60] = "Tj *80Tj7v4?N!7h4*IPg5e";
        objectArray[61] = ";\u0016n\u00153_;\u0016yI?P!]yW?E&,+\nk\u0001";
        objectArray[62] = "\u0014yM\u001c@^\bcO@ZJ\u0018`\u0004Q]Y\u001e%LWS_\u000eyO\u001c{m\u001ej^G@N";
        objectArray[63] = "Y*h\"\u0007EE0j~\u001dQU3!o\u0019YS6{\"\u0014@_vH`\u001aRW4|";
        objectArray[64] = "VXUl\u007f\\JBW0eHZA\u001c!b[\\\u0004P+cM\u0017h[,idXDS%h[{KA'";
        objectArray[65] = "81iX%+<,iI8+\u007f#&^?7%,+\u0003$ ; $Y8l\u001e'-H(6c\n%G.!%\b&]";
        objectArray[66] = "v>%\u0012;,$c&\u0007_6/o:ko2({;\u001ac-wb]\u0002=1t<<\u000bf)1\u0001";
        objectArray[67] = "\u0013=rC@aJ7\"Lzs,k|G\u00009]gc\u0018\u0019_\u001c>x\\\u001c.\u0010!'Ez";
        objectArray[68] = "\r\u0007x2eL\u0001\u0018'+\u0003VZ\u0004e!b[Fb}4iWY\u001cs+y\u0003=\b`5dO^\u0006s49=";
        objectArray[69] = "hKv:<\\b\u0001gZ\u01580dOnd:He\u000b{9";
        objectArray[70] = "=yh~\tl73y\u001e\u04d6\u0000i>dsI<u-jq";
        objectArray[71] = "x\t\u0013Q\u001d1+L\u0019Zp\"~K1S\u001b)zM\u0010R>,~S\u0011>@(rM\u001bOL7-T}\u000f\u001e #W@]@/q7";
        objectArray[72] = "d>\u000b\u0001|wnt\u001aa\u0164\u001b<f\u0011\\yz5=\t\u0019D";
        objectArray[73] = "]rU\u000f\u001b\u0001W8Do\u0263m\u0016+EU\u0018W\u0006wP\u0011";
        objectArray[74] = "X\u0007\u0004Hr\u0007\n_Y\u000e\n\u0004VJq\u001dq\f_KD\u001aR\u0002GV8Go\nAPIKpUX6";
        objectArray[75] = "\u001bd\rg\u001d~\u0019*N.w\u0242`!Im\u0007m\u0019#\u0007.N";
        objectArray[76] = "Xp\u0013q\u0000\u0004R:\u0002\u0011\u018dh\u00121\u0002h\\\u0012\u0010!\u001fo";
        objectArray[77] = "\u0011E\u0005a%KC\u001dX'][\u0015,P\"='\u0017\tI3%\u001b\u000b\u001aG1]";
        objectArray[78] = "X)ov\u000f{Rc~\u0016\u0443\u0017P*n*Z|\fnysW";
        objectArray[79] = "f\u001eVkH\u00188\u0005Td0zN;f\u000b_\\e\u0000B1\u0001Gg\u000f";
        objectArray[80] = "R\u0018\u0014_\u00013\u0012\u0015[Qq\u032b.\u0018\u0004ZLeO\u0011_B\tX";
        objectArray[81] = "qGxZVT{\ri:\u04a48-\u0006:W\u001cD!L{\u000b";
        objectArray[82] = "()b7\u000f\"2(,vr\u0231Jfuf\b$;jj9\u0011";
        objectArray[83] = "~6\u0001Pl_{7\r[+a(jA;&\u001fw;C[v\u0000-?=\niQ{y]Zv\u000b\u007f\u0007";
        objectArray[84] = "\u000e\u00193-zp\u0004S\"M\u0432\u001c\u000fF.7$m\u0003Yq.Bu]Erp#|\u0006]7M";
        objectArray[85] = "y\u0003J*O\u0012+[\u0017l7\u001by^\u0017oL~pK\u000brE\u001d~X\n/7";
        objectArray[86] = "\u0017\fq\u000b #\u0019\u000fu\t\u0011euU,\u000bk/\u0004Y3TrIE\u0000(\u0010w8I\u001fw\t\u0011";
        objectArray[87] = "e\u001boXRRoQ~8\u0453>,\u001aj\u0001\tUiQl\u0000";
        objectArray[88] = "\u0000D-x\u0015\u0014\n\u000e<\u0018\u0285x[\u0007,\u007f_\u001bU\u0014-\"";
        objectArray[89] = ")Qu\u001d6\u0013#\u001bd}\u0143\u007fq\to@3\u001exRw\u0005\u000e";
        objectArray[90] = "k\u001c&WMVaV77\u0151:aJdS\u0012U+\u001ea\u000b";
        objectArray[91] = "|E2\u001a\u0014^.\u00181\u000fpH9\u0000-\u0019p\u0015&\u001b0\u0005\u0001\u00199D)c\u0019G%Gw\u0002\u0010\u001c=\u0002J";
        objectArray[92] = "\u00156+-n\u001dGh$\u007f\u000e[I.F,p\u0010\u0018&&|oJ\u001cXwc>\u001cZ8'|d\u0018$1${3\u001dE8\u007fcv ";
        objectArray[93] = "n\u00031\u0019;\u0014a\u001cb\u0011\u0006\u0012x\u001d<\u0000\u0006Og\u0006!\u001cwCxY8zyG9\nfA~O9\r[\u0013d\u0019?Z:\u001a?\u0001zg";
        objectArray[94] = "y<!E Qu#~\\FA2\u0014%G:QI39B!R*=*C| ";
        objectArray[95] = "at\u0018Q\bS21\u0012ZeAm00W\u0000B\nz\u0013_\u001fI{v\f\u0000\u0006/at\u0018Q\bS21\u0012Ze";
        objectArray[96] = "+\"}T;L*|v\u0002ER9v|U?H.q\u0007\u000f;\u0019xbg_$C|\u001cn\\#\u0014y}g\u0007;QD";
        objectArray[97] = "}K)\u000eDL/\u0013tH<Mn\u001bnMG t\u0003hVNCz\u0010i\u000b<";
        objectArray[98] = "U;i\u007f\u0013\u0001\u0000b85I:\u0003k$LOK'a4b\"C\u0015l!~@KRo#\u000f";
        objectArray[99] = "B/E5h^\u001c3\u001d4\u0019\fI=~#~\u001bI;Z(\u0019SA \\?h_^\u007fEY)\u0006E;@(%\u0019\u001a\"&";
        objectArray[100] = "g_U(251_P7xY0\u0000\u0005>.\u000eg_YbB`e\u0018\u0015a0?\"P\u00169";
        objectArray[101] = "\u0010(\u0010>!R\u001ab\u0001^\u0466>\u001b(\rbs\u0006\u001f\"\u00100";
        objectArray[102] = "\u001e10\u0004 WBg#[>(\u01f8\t!\u0007+GJurB!L'0u\b;\u0010U`0R*K'";
        objectArray[103] = "*Q\u001ed _r\u001b\u0010j9av\nt9|\\a\u0011\u0018o|Y~[";
        objectArray[104] = "\u0007j\u0007,\u0017VO~^<g\u0488uq^}\u0006K\u00189J$\u0016";
        objectArray[105] = "R\u0002-\u00052\u001bT\u0002'\u001f_3z.\u001b+\u0006!r7V\u001d6\u0007J\u00061\u001b6\rP";
        objectArray[106] = "[5Bj+^A4\f+V\u03e79)\u0001fiFU{Y;/";
        objectArray[107] = "M\u0002\n\u0017tjGH\u001bw'\u0006C\u0007\u000e\u000e(}\u0011Z\r\u001b";
        objectArray[108] = "T\u001eF\u001aq\u001c\u0006CE\u000f\u0015\u000b\u0006KC\f\u0015W\u000e@D\u0005d[\u0011\u001f]c|\u0005\r\u001c\u0003\u0002u^\u0015Y>";
        objectArray[109] = "=k\nx3\u001a<5\u0001.M\u001468\u0019hM\u001603M/,\u001fk+\b\u0012";
        objectArray[110] = "_gS.l\u000fU-BN\u0385c\u0007?Isi\u0002\u000edQ6T";
        objectArray[111] = "xc\u0005=)^r)\u0014]\u050b2pa\u0003`tM,7\u0010?j2";
        objectArray[112] = "\u0004\f+]p<\r\r-\u001f\u001c\u0533|\r?\u000ee\"\u001e\u0005x\rgS";
        objectArray[113] = "?\u00014\u001efk5K%~\u03e0\u0007?\u00014\u001efk5K%";
        objectArray[114] = "w3\u0005C#[~2\u0003\u0001O\u026d\u000f2\u0011\u00106Em:V\u001344";
        objectArray[115] = "4B\u0013:kSf\u001c\u001ch\u000b\u0015hP7a`\u0003~W\u001f`o\u0003\u0005F\u0007wl\u001cfH\u0014v1nlN\u001876\u000fe\u0015\u0000r\u000b";
        objectArray[116] = "P9Q\u000f$2Zs@o\u0232^X;H\b&&\u0003j]\u0006s";
        objectArray[117] = "6Z*C<\"<\u0010;#\u01ebN;Q;\u0012|4}\u0004oE";
        objectArray[118] = "\u000ex(\u00110\u0000F+=\u00184fY' \u001ca1\nxpC\r_\t#$Ek\u0017Z6-A";
        objectArray[119] = "\u0001T,\u0019^\n\u0005\u0001:V[kW\t\"bC\rT>3GC\u0010D\u001e/(\u001bZ\u0004\u000f%\u0016\u001e[\b\u0004b(";
        objectArray[120] = "l|\u0003\u007f\\=f6\u0012\u001f\u01b2Qcz\u0013m\u00032#>\u0004}";
        objectArray[121] = "/ \u000bD>\n.~\u0000\u0012@\u0017'e\r. \u001d)e\u001eM9\u0003?aqA>\u0003 fK\u001f%\u0001/\u001e\u0018L&R}\u007f\u0011\u0017>\u0017@";
        objectArray[122] = "\u0010\u0005AaA=\u001aOP\u0001\u0154QJZLh\u0000j]FB;";
        objectArray[123] = "\"A\u0002^aDn_C\u001e\r\u0208_SS\u001esM:\u001fM_3";
        objectArray[124] = "^[P=/\u001fT\u0011A]\u0183sVYI:-\u000b\r\b\\4xs";
        objectArray[125] = "S|Pam\u0002Ej\u000e9]\u001bIdS\u0005>O\u0012%Fil\u0017Oc>flB\u0011bR44\u001fW\u001aWg;C\u0013{^<#\u0006.";
        objectArray[126] = "\u0007\u0010DG~[\u001a^\u0019\u0002F\u013fa\u0006\u0018\u0002~K\u001c\fCQ%";
        objectArray[127] = "\u0011e-2vm\u001b/<R\u015b\u0001\u0019g+o+~E1805";
        objectArray[128] = "o\u0000Q)\u0013!eJ@I\u04f1M1\u0004W#U(0Z\\u";
        objectArray[129] = ";\fU7P\u000e4\u0013\u0006?m\u001a>\u0012YT]\u00006\u0012Y%Q\u001fi\u000b?+U^:U\u0004,]^=hV6\u000bXj\t_m\u0013\u001dW";
        objectArray[130] = "9OrMRCr\u000bi\fUrn\u0014~Q^%9K)\u000e\rr9N\"\nH\u0002\u007fKpJ\\";
        objectArray[131] = "1A(DG\u0012;\u000b9$\u0016~d\u0017mC\u0002O}\u0003>V\u007f\u001alB3YN\u0003x\u0011&$";
        objectArray[132] = "\u0003m\u0004\u000eh7\\*L\r0ET7\u0010\u0017?\u0012\u0000hMOnE\u0003j\u001e\nk'^2\u0003Ik";
        objectArray[133] = "b\u001d2pnzhW#\u0010\u01f1\u0016h_7,-*1\u001b+|";
        objectArray[134] = "A\b\u007fz\u001aU\u0013P\"<b]CB?\u000b\u0003]OBC;\u0000\u0002\u001e\u0000r$\u0007\bH9";
        objectArray[135] = "]\u0012,TE%\\L'\u0002;8UW*>[2[W9]B,MSVWY&\u000f\u00117^\u0002>J,";
        objectArray[136] = "\r.R3M7_v\u000fu54\u0003c(eP6n/\u000bmO=\u001f#\u00142V[";
        objectArray[137] = "\u0019\u001fF`\u000bMY\u0000\r*q\u01c4f\u0013V}L\u0012\u0007\u001a\re\t/";
        objectArray[138] = "KV\u0007]y2A\u001c\u0016=\u0255^@\u000b\u0007\u0003\u007f/\u0010\\\u000b[";
        objectArray[139] = "40\u001d-\u001eMih\u0000n\u001e/ha\u00024ACZ5Bn\u001c/47Ok\\_r2\u001d+H/dn\u0018i\u001bNm5\u0000,&";
        objectArray[140] = "K(p!+`\u000ecv H\u04df3zk~u6Rs0f0\u000b";
        objectArray[141] = "qgA\u0010^MloBz\u02576~}Q\u0014\u0011Qeu\u001e\u001d`G3mP\u0013\u0003\r3v\u001dz\tTh0\u001c\u001b\u0000\u000fpu!";
        objectArray[142] = "\u0010hFRlz\u001a\"W2\u043c\u0016OcV\\,qLcZ]";
        objectArray[143] = ";\u0002_B=ve\u0019]ME\u000b\u0012|\\\\),,F\u0002G+#";
        objectArray[144] = "l3eI\u0012>aqe\u0000(\u0135\u001e3~QYou><Q\u0010";
        objectArray[145] = "\u0018u\u0014\f\u000bOE-\tO\u000b-D$\u000b\u0015TAvpKL\f-X0\u001d\fBOPw\u001e\u000e3TX#\u000e\u0004Q\\\u001f \fuYT\\.\u0005\u0016WG]sw";
        objectArray[146] = "\u0018\u001d\u000e\u007fGB\u0012W\u001f\u001f\u0005.VM\u0012uAUKE\u0011";
        objectArray[147] = "^#\r$niC+\u000eN\u03cc\u0012H+\u000bsmsAp\u00136P";
        objectArray[148] = "?pS-r\u00075:BM\u0113k0,_7%QipT\"";
        Object[] objectArray2 = objectArray;
        objectArray[149] = "(\u0010\"\u0017>\u001fwWj\u0014fm\u007fJ6\u000ei:(\u001bdW\u0005T/N2Wc\u001c|[;S";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Class170.m121(l, l2);
            object = f3377[n];
            try {
                if (!(object instanceof String)) break block2;
                Class170.f3377[n] = clazz = Class.forName(f3378[n]);
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
        Field field = Class170.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Class170.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = Class170.m121(l, l2);
        Object object = f3377[n];
        if (object instanceof String) {
            String string = f3378[n];
            int n2 = string.indexOf(8);
            Class clazz = Class170.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Class170.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Class170.m124(clazz3, string2, clazz2)) != null) {
                    Class170.f3377[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Class170.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Class170.f3377[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Class170.m123(1002131541457452L, 0L);
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
        Method method = Class170.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Class170.m128(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00eb' || c == '\u00c8' || c == '\u00e5' || c == '\u00e4') {
                field = Class170.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00eb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Class170.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'C' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = Class170.m130(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        try {
           return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }

    public static CallSite m174(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new IllegalStateException("org/rusherhack/\u016b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Class170.class, "m154", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(Class170.class, "m2809", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Class170.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

