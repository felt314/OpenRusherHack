/*
 * Decompiled with CFR 0.152.
 */
package org.rusherhack;

import java.io.BufferedReader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class091;
import org.rusherhack.Class253;
import org.rusherhack.Class316;
import org.rusherhack.Enum394;
import org.rusherhack.Class462;
import org.rusherhack.Class579;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.reset;
public class Class448 {
    public static String f7327;
    public static char f7328;
    public static String f7329;
    public static String f7330;
    public static String f7331;
    public static String f7332 = "\t";
    public static Setting[] f7333;
    public static long f7334;
    public static String[] f7335;
    public static String[] f7336;
    public static Map f7337;
    public static long[] f7338;
    public static Integer[] f7339;
    public static Map f7340;
    public static Object[] f7341;
    public static String[] f7342;

    public static String m14191(String string) {
        long l = f7334 ^ 0x23B454CD7446L;
        String string2 = string;
        int n = string2.indexOf(92);
        try {
            if (n < 0) {
                return string2;
            }
        }
        catch (IllegalStateException runtimeException) {
            throw Class448.m6252(runtimeException);
        }
        StringBuilder stringBuilder = new StringBuilder(string2.length() - 1);
        int n2 = 0;
        do {
            int n3;
            block9: {
                stringBuilder.append(string2, n2, n++);
                if (n >= string2.length()) {
                    throw new IllegalStateException("incomplete escape sequence at the end");
                }
                n3 = "\\nr0t".indexOf(string2.charAt(n));
                try {
                    try {
                        if (n3 >= 0) break block9;
                    }
                    catch (IllegalStateException runtimeException) {
                        throw Class448.m6252(runtimeException);
                    }
                    throw new IllegalStateException(new StringBuilder().insert(0, "invalid escape character: \\").append(string2.charAt(n)).toString());
                }
                catch (IllegalStateException runtimeException) {
                    throw Class448.m6252(runtimeException);
                }
            }
            stringBuilder.append("\\\n\r\u0000\t".charAt(n3));
            n2 = n + 1;
        } while ((n = string2.indexOf(92, n2)) >= 0);
        StringBuilder stringBuilder2 = stringBuilder;
        String string3 = string2;
        stringBuilder2.append(string3, n2, string3.length());
        return stringBuilder2.toString();
    }

    public static String m14192(String string, boolean bl) {
        long l = f7334 ^ 0x23E9FFFAFE7DL;
        boolean bl2 = bl;
        String string2 = string;
        try {
            if (bl2) {
                return Class448.m14191(string2);
            }
        }
        catch (IllegalStateException runtimeException) {
            throw Class448.m6252(runtimeException);
        }
        return string2;
    }

    public Class448() {
    }

    public static /* synthetic */ String m14193(String string) {
        long l = f7334 ^ 0xCF5C79588CDL;
        return Class448.m14191(string);
    }

    public static Class462 m14194(int n, int n2, String[] stringArray, Map<String, String> map) {
        long l = f7334 ^ 0x717D421C0710L;
        int n3 = n;
        ArrayList<String> arrayList = new ArrayList<String>();
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        int n4 = n = 3;
        try {
            while (n4 < stringArray.length) {
                arrayList.add(stringArray[n]);
                hashMap.put(stringArray[n], n++ - 3);
                n4 = n;
            }
        }
        catch (IllegalStateException runtimeException) {
            throw Class448.m6252(runtimeException);
        }
        return new Class462(n3, n2, Collections.unmodifiableList(arrayList), Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(new HashMap<String, String>(map)));
    }

    /*
     * Loose catch block
     */
    public static void m14195(BufferedReader object, Class091 obf091) {
        
    }

    public static int m14196(String string) {
        int n;
        block10: {
            int n2;
            long l = f7334 ^ 0x49D25B06FC0CL;
            String string2 = string;
            int n3 = string2.length();
            int n4 = Class253.m9154();
            int n5 = n2 = 0;
            try {
                while (true) {
                    try {
                        try {
                            try {
                                if (n5 >= n3) break;
                                n = string2.charAt(n2);
                                if (n4 != 0) break block10;
                            }
                            catch (IllegalStateException runtimeException) {
                                throw Class448.m6252(runtimeException);
                            }
                            if (n4 != 0) break block10;
                        }
                        catch (IllegalStateException runtimeException) {
                            throw Class448.m6252(runtimeException);
                        }
                        if (n != 9) break;
                    }
                    catch (IllegalStateException runtimeException) {
                        throw Class448.m6252(runtimeException);
                    }
                    n5 = ++n2;
                }
            }
            catch (IllegalStateException runtimeException) {
                throw Class448.m6252(runtimeException);
            }
            n = n2;
        }
        return n;
    }

    /*
     * Unable to fully structure code
     */
    public static Class579 m14198(BufferedReader var0) {
        return null;
    }

    public static /* synthetic */ String m14199(String string, boolean bl) {
        long l = f7334 ^ 0x347901CCED37L;
        boolean bl2 = bl;
        String string2 = string;
        return Class448.m14192(string2, bl2);
    }

    public static void m14200(Setting[] settingArray) {
        f7333 = settingArray;
    }

    public static Setting[] m14201() {
        return f7333;
    }

    /*
     * Unable to fully structure code
     */
    static {
    }

    public static IllegalStateException m6252(IllegalStateException runtimeException) {
        return new IllegalStateException(runtimeException);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3F64;
        if (f7336[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f7337.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f7337.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u0430", exception);
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
               byte[] byArray2 = f7335[n2].getBytes("ISO-8859-1");
               Class448.f7336[n2] = Class448.m117(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f7336[n2];
    }

    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = Class448.m153(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }
    public static int m2808(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6FA;
        if (f7339[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f7338[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f7340.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f7340.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u0430", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Class448.f7339[n2] = n3;
        }
        return f7339[n2];
    }

    public static int m2809(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Class448.m2808(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }
    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f7342[n4] != null) {
            return n4;
        }
        Object object = f7341[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 50;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 16;
                break;
            }
            case 4: {
                n3 = 15;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 59;
                break;
            }
            case 7: {
                n3 = 56;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 25;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 40;
                break;
            }
            case 12: {
                n3 = 5;
                break;
            }
            case 13: {
                n3 = 53;
                break;
            }
            case 14: {
                n3 = 21;
                break;
            }
            case 15: {
                n3 = 12;
                break;
            }
            case 16: {
                n3 = 49;
                break;
            }
            case 17: {
                n3 = 29;
                break;
            }
            case 18: {
                n3 = 31;
                break;
            }
            case 19: {
                n3 = 55;
                break;
            }
            case 20: {
                n3 = 22;
                break;
            }
            case 21: {
                n3 = 39;
                break;
            }
            case 22: {
                n3 = 11;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 23;
                break;
            }
            case 25: {
                n3 = 27;
                break;
            }
            case 26: {
                n3 = 7;
                break;
            }
            case 27: {
                n3 = 61;
                break;
            }
            case 28: {
                n3 = 34;
                break;
            }
            case 29: {
                n3 = 20;
                break;
            }
            case 30: {
                n3 = 18;
                break;
            }
            case 31: {
                n3 = 62;
                break;
            }
            case 32: {
                n3 = 28;
                break;
            }
            case 33: {
                n3 = 0;
                break;
            }
            case 34: {
                n3 = 44;
                break;
            }
            case 35: {
                n3 = 42;
                break;
            }
            case 36: {
                n3 = 17;
                break;
            }
            case 37: {
                n3 = 14;
                break;
            }
            case 38: {
                n3 = 8;
                break;
            }
            case 39: {
                n3 = 10;
                break;
            }
            case 40: {
                n3 = 26;
                break;
            }
            case 41: {
                n3 = 24;
                break;
            }
            case 42: {
                n3 = 1;
                break;
            }
            case 43: {
                n3 = 63;
                break;
            }
            case 44: {
                n3 = 41;
                break;
            }
            case 45: {
                n3 = 19;
                break;
            }
            case 46: {
                n3 = 45;
                break;
            }
            case 47: {
                n3 = 4;
                break;
            }
            case 48: {
                n3 = 47;
                break;
            }
            case 49: {
                n3 = 54;
                break;
            }
            case 50: {
                n3 = 60;
                break;
            }
            case 51: {
                n3 = 37;
                break;
            }
            case 52: {
                n3 = 38;
                break;
            }
            case 53: {
                n3 = 51;
                break;
            }
            case 54: {
                n3 = 57;
                break;
            }
            case 55: {
                n3 = 52;
                break;
            }
            case 56: {
                n3 = 58;
                break;
            }
            case 57: {
                n3 = 35;
                break;
            }
            case 58: {
                n3 = 48;
                break;
            }
            case 59: {
                n3 = 46;
                break;
            }
            case 60: {
                n3 = 3;
                break;
            }
            case 61: {
                n3 = 13;
                break;
            }
            case 62: {
                n3 = 30;
                break;
            }
            default: {
                n3 = 43;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        Class448.f7342[n4] = new String(cArray);
        return n4;
    }

    public static void m122() {
        Object[] objectArray = f7341;
        f7341[0] = "j\u0001\u0006YH\tv\u001b\u0004\u0005R\u001df\u0018O\u0530";
        objectArray[1] = "K\u0016jNm~U\u001ep\u0001\u000ejQ";
        objectArray[2] = "-\r4Em~&\u0002%\n\u0010f5\u0005,C\u0001g.\u0000&A1";
        objectArray[3] = "\u0003\u001e`f\u0005\u001d\b\u0011q)d\u0013\u0003\u001aus";
        objectArray[4] = "u_(|v\u0001~P93\u000b\u0019mW0z";
        objectArray[5] = Integer.TYPE;
        Class448.f7342[5] = "java/lang/Integer";
        objectArray[6] = "k\b9\u001d`\u001b\u001e(2\u0012qTc0!\u0015x\u001d\u000b";
        objectArray[7] = "H\u0002\r\u00151`T\u0018\u000fI+tD\u001bD\u03f6";
        objectArray[8] = "$p\u0011Ce\\8j\u0013\u001f\u007fH(iX\u00b7";
        objectArray[9] = "8E@/23MeK #|0}X'*5X";
        objectArray[10] = Boolean.TYPE;
        Class448.f7342[10] = "java/lang/Boolean";
        objectArray[11] = Void.TYPE;
        Class448.f7342[11] = "java/lang/Void";
        objectArray[12] = "s\u007f\u001frv>oe\u001d.l*\u007ffV\u025a";
        objectArray[13] = "\u0006'|\u007f\ra\u0018/f0bf\u001e'sm";
        objectArray[14] = "hZ--{<\u001dz&\"js|t-)n)\b";
        objectArray[15] = "Y\u000e\\-XDp7@7Z\u0018j#P4\u0011\u03a79";
        objectArray[16] = "(J\u0013>\u007fY4P\u0011beM$SZ\u0420";
        objectArray[17] = "|O'$E`y\u0000\u00130\ros\\4!9lwJ47";
        objectArray[18] = "w\u0004\u000f\u0016oSi\f\u0015Y\rOn\u0011";
        objectArray[19] = "r5\u0010hqnn/\u00124kz~,Y%lixi\u0014)nv|)\u0013hsir$\u00125prs Y\u0005lvp&\u0019\"Sir$\u00125pto";
        objectArray[20] = "5W\u00020`Z>X\u0013\u007f\u001cC1B\u001d<+s'U\u0011!:_0X";
        objectArray[21] = "BO'\u000e(~^U%R2jNVn\u021e";
        objectArray[22] = "\u0001\u000fRM|\r\u001f\u0007H\u0002\u0011\u0017\u0007\u0002AO&\u0011\u0004\u0000W";
        objectArray[23] = "9\u001f\u001b>\bh2\u0010\nqoj'\u001b\n:T";
        objectArray[24] = Character.TYPE;
        Class448.f7342[24] = "java/lang/Character";
        objectArray[25] = "\u007f\u0001<E\u000eJt\u000e-\ncNt\u0012\u0019AQSp\u000e)A";
        objectArray[26] = "@\u001eZ\u0006\b\u00165>Q\t\u0019YH&B\u000e\u0010\u0010 ";
        objectArray[27] = "\\@~\u001b\u0004A@Z|G\u001eUPY7\u0476";
        objectArray[28] = "a{\b\u0015+sHB\u0014\u000f)/RV\u0004\fb>UE\u0002I?8NC\u000e\t+siR\u0013\u0013%3]\f";
        objectArray[29] = "O6;#=\fLr,9Y\u000fOaCa8\u001f\u0012j=>6\u001aO\r|68\u0014\u001a`}e9\u0018#";
        objectArray[30] = "2\u000f\u001ef\u001d\\ UGf`\u0216X\u000bF;_\u00017\u000e\u00192\u001cgc\b\u0013i\u0006\bfW\u001a*`";
        objectArray[31] = "p8(\u000bq\rbbq\u000b\f\u041b\u001ae.WfIsgw\u0001=6*>+\u00035D`65V\f";
        objectArray[32] = "}N\u00130&i}\u000eL0\u001bg?\fAlw\u000e}\u0015U;|p\"\u001bPf\u001b4}K\u00167|4=\u0014\u0016\n";
        objectArray[33] = "\\\u0002N\u0013\u0014zY]GPrn\u001f^BPr._W\u001cJ\u001d+\u0000^_,Il\u0017B[U\u000fj\u0003\u0003#MH{\u0007^ZJJ~X:";
        objectArray[34] = "0\u0007*Dp\u0016y\u0001{I\u0001\u050c\u0000ZbWy\u0014y\u001cdC8l";
        objectArray[35] = "Y-C:)b\u0010+\u00127X\u0241ip\u000b) `\u00106\r=a\u0018";
        objectArray[36] = "\u0004\ryBA2\u0004M&B|)Yl:\u0002\u001d3Q7}@\u0011jXXx\u001f\u0018)>";
        objectArray[37] = "4eAr\u0014\u000f/6Q\u0011C\u0018((CpN\u0004\r9[\u0011\u0012\u001e7eMoM\u001028*.E\u001e<mG/\u0016\u001f0T";
        objectArray[38] = ">S5$&\u0003>\u0013j$\u001b\r|\u0011gxwd?Qg!}\u000b:\u000enb\u001b^>V0#|^~\t0\u001e";
        objectArray[39] = "\bMG\u0017Rl\r\u0012NT4g^\u0013ETT\u0003\b\fZPLzN\nN\u00114";
        objectArray[40] = "\u0001Y\u0010\"y1\u0002FPc\u0001\u0179<\u0001\u0017by7EG\u0011v8O\f\u0003\r*8=F\u000b\u0013\u007f\u0001";
        objectArray[41] = "Jy\u000fAfpJ9PA[~\b;]\u001d7\u0017\u00109RG*l\u0002:\u0001J[,\t3H\u0003\"j\u000f'\t{`n\u0000;H\u0002&h\u0014z0Aa(J~WA!wJC";
        objectArray[42] = "\u001ft+Q4\r\r.rQI\u0575ups\fvP\u001au,\u000556N2;\u00191O\b4/XI";
        objectArray[43] = "\u0004\\\t31U\u0011\u001e\u0012R\u0167(\u0001[\u0000**B\u0002\u001f\u00170N";
        objectArray[44] = ".k8M\u001b|.+gM&zr*j\rZ\u001b/(w\u000f^bi.cN& ,<8\u0011I%s5{w\u001c!+k:\u0010\u001catk\u0007";
        objectArray[45] = "C{:}e\u0014\u001f1pa\u001de\u007f13ieV\u0006w5}$.Ds:aeW\u0002u. \u001d\u0015\u0006z2adS\u0000ns\u0019\"C\u001exst#\u0010\u001ftJ";
        objectArray[46] = "Ji6rQ\u001eJ)irl\u0010\b+d.\u0000yK*y0\u0014\u0000\r,mqlCJl3u\u000bC\n33H";
        objectArray[47] = "]0lh\u0004\u000fB#7\u007fj\rU7jt\u000b\u001eR;g|\u00074R)q\u0018\u0006KK*ir\u0005\u000f\\0\rtQ\bK6gw\u0015\u001fQR";
        objectArray[48] = "^\u001f!)A9EL1J\u00054X.p+\u0004xCP/%\u0001%$\u0014+3L.ZK%6\u0011I\u001eO3{\u001a7AA6&}";
        objectArray[49] = "k9w\u0019\u001cWnf~ZzY6mwV=VP:cV\u0002@)|eBC8kxj^\u0002A-~~\u001fz";
        objectArray[50] = "\u000b\u0002\u0012\u000b\u0005rTZ\r\t>i\rE\u0007^\u007fw\u0018?G\u000bS.\u0002PBTZmd\u0004\u0005CFi\u001dB\u0003W\u0007\u0011";
        objectArray[51] = "_3\rQk[\u0000k\u0012SPFYj\u001e\u0004\u0017V05\u001a\u0019(@Is\u001c\ri8_3\rQk[\u0000k\u0012SP";
        objectArray[52] = "x\u001aOg$J{^X}@[uSZ\u001f{YdYOf=_p\u00187";
        objectArray[53] = "\n\u000bf\u007fp\u0017\u000fTo<\u0016\u0013QZq\tjx\nJ{8n\u0001LLoy\u0016\u0018\u000e\t21(\u0006KX;@";
        objectArray[54] = "?\u001f\u0005g\u001d*-E\\g`\u041aU\u001b\u001c'\u0018i,]\u001a3Y\u0011nY\u0015/\u0018h(_\u0001n`poN\u00053\u0019wmKZW\u001a >CY'\u0001s. \u0004)P~%\u001eXkZqU";
        objectArray[55] = "-j1f\u000768(*\u0007\u0533K>g+dD;%4;\u0007";
        objectArray[56] = "\u0001#75r5]i})\n\u0461=o$/:wCl;o{\u000f\\h)1nv[j,n\n4D\"?)srB6~Q5b\\ ~<41],Ga3l\u0005k5+;rPR";
        objectArray[57] = "A3!e\u0018GSixee\u010c+7y8Z\u001aD2&1\u0019|\u0014a '\\\u0011\u00152!+eG\u0013a~3\nBLh=U";
        objectArray[58] = "DqF\u001fkF\u0018>D\u0005\u0019W\u0012\u001aS\u0015xM\u001aAF^ N\u0013*B\btFuz\u0017\u0002&M\u001a\u007fH\u000be+";
        objectArray[59] = "\u0010QTd\u000e+L\u001b\u001exv\u0522,IYlJ(]^Ep\u0013\u0011\u0017YTx\u000ehQ_@9v.AAV9\u001b/\u0012@Z\u0000";
        objectArray[60] = "\u0004\u0015xqM\n\u0004U'qp\u0004FW*-\u001cm^\u0010}r\u0001S@U,{pW\u0004\u0010}v\u0017WDO}K";
        objectArray[61] = "\u0002~(\u0012blTsu^[d\u0001y{#`x\u0018{`Z&~\f:\u0018\u0013bbP:jYj|\u0005\u0003";
        objectArray[62] = "\u0013\u0018Ewbi\u0010\u0007\u00056\u001a\u0578.\u0012\u00076{hS\u0007E-\u001a'\u0017\u0018\u0003~hm\u001f\u0006VG";
        objectArray[63] = "cd~_\u0010Dq>'_m\u0228\t1c_\\Fdgn\u0002\u0010\u007f`go\u000e\u0012\u0002u%to";
        objectArray[64] = "M\"sHxSZ&mYC\u000e!`3_|DNelV?\"\u001acf\r%M\u001f<oNC";
        objectArray[65] = "q{\u0003\u000fQ|nhX\u0018?~y|\u0005\u0013^m~p\b\u001bRFvab\u0005\u000eh|%\u0012\u001e]x\u001fcS\u0014\\?ox\u0000\u0004?";
        objectArray[66] = "\u0015%\u0017?/Y\u0010z\u001e|I[W`\u0013d26\u0014|\u00031.HKr\u0006lI\tC|\b9$\b\u0010}\u0004\u0000";
        objectArray[67] = "dro\u000b\fSv(6\u000bq\u0001\u000e fW\u001c\u00183,h\u0006\u000bhc$cV\u0001Uo*2Aq";
        objectArray[68] = "\u001d)\u0011$3;\u0018v\u0018gU5@}\u0011k\u0012:&*\u0005k-,_l\u0003\u007flT\u001dh\fc--[n\u0018\"Uo_a\u0004c,)YuE\u001b";
        objectArray[69] = "3\u0018tJB\u001f$Q6\u0016$\u027d]\u001buA\u001b\u00182\u001e*HX~f\u0018 \u0013B\u0011cG)P$";
        objectArray[70] = "{\u0002P)\t{-\u000f\re0l|\u0004\rd0&(\u001cX!Bl \u0002\r\u0018";
        objectArray[71] = "\u001bC#{<%G\tigD\u00de'\t*o<g^O,{}\u001f\u001c\n> \"p\u0019U7cD#VB7g~\u007f\u001c\b+\u001f";
        Object[] objectArray2 = objectArray;
        objectArray[72] = "2\"\u000enfdd/S\"_s56R\u001b>o5_\u0005g26>0\u00008;uX";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Class448.m121(l, l2);
            object = f7341[n];
            try {
                if (!(object instanceof String)) break block2;
                Class448.f7341[n] = clazz = Class.forName(f7342[n]);
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
        Field field = Class448.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Class448.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = Class448.m121(l, l2);
        Object object = f7341[n];
        if (object instanceof String) {
            String string = f7342[n];
            int n2 = string.indexOf(8);
            Class clazz = Class448.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Class448.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Class448.m124(clazz3, string2, clazz2)) != null) {
                    Class448.f7341[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Class448.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Class448.f7341[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Class448.m123(255958455283105L, 0L);
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
        Method method = Class448.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Class448.m128(classArray2[i], string, clazz2, n, classArray);
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
            if (c == 'B' || c == '\u00ea' || c == '\u00c9' || c == 'R') {
                field = Class448.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Class448.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = Class448.m130(lookup, mutableCallSite, string, methodType, l, l2);
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
            return MethodHandles.lookup().findStatic(Class448.class, "m154", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(Class448.class, "m2809", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Class448.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

