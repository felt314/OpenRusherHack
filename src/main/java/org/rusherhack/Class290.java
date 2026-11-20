/*
 * Decompiled with CFR 0.152.
 */
package org.rusherhack;

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
import org.rusherhack.Class066;
import org.rusherhack.Enum168;
import org.rusherhack.Enum399;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.core.setting.Setting;

public class Class290 {
    public Enum399 f4874;
    public int f4875;
    public int f4876;
    public int f4877;
    public Enum168 f4878;
    public static Setting[] f4879;
    public static long f4880;
    public static String f4881;
    public static long[] f4882;
    public static Integer[] f4883;
    public static Map f4884;
    public static Object[] f4885;
    public static String[] f4886;

    public int hashCode() {
        long l = f4880 ^ 0x18B8A4AF174L;
        Class290 obf290 = this;
        int n = obf290.f4878.hashCode();
        n = 31 * n + obf290.f4874.hashCode();
        n = 31 * n + obf290.f4876;
        return 31 * n + obf290.f4877;
    }

    public void m9898(int n) {
        Class290 obf290;
        long l = f4880 ^ 0x45A4131EF088L;
        int n2 = n;
        Class290 obf2902 = obf290 = this;
        obf2902.f4874.m12965(obf2902.f4876, n2);
    }

    public boolean m9899() {
        long l = f4880 ^ 0x605079D4D5FL;
        try {
            if (this.f4874 == Enum399.f6725) {
                return true;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw Class290.m6741(illegalStateException);
        }
        return false;
    }

    public Enum399 m9900() {
        long l = f4880 ^ 0x6DB046AB9406L;
        return this.f4874;
    }

    public int m9901() {
        long l = f4880 ^ 0xFFA04386E3CL;
        return this.f4877;
    }

    public void m9902(int n, long l, int n2) {
        Class290 obf290;
        long l2 = f4880 ^ 0x1B3288F247D4L;
        int n3 = n2;
        Class290 obf2902 = obf290 = this;
        obf2902.f4874.m12953(obf2902.f4877, obf290.f4878.m7047(), n3, l, obf290.f4876, n);
    }

    public int m9903() {
        long l = f4880 ^ 0x5D56D2607D11L;
        return this.f4875;
    }

    public boolean equals(Object object) {
        return false;
    }

    public String toString() {
        long l = f4880 ^ 0x4770C858E178L;
        Class290 obf290 = this;
        return obf290.f4877 + "," + obf290.f4874.m12957() + "," + this.f4878.m7048();
    }

    public int m9904() {
        long l = f4880 ^ 0x42205752304CL;
        return this.f4876;
    }

    public Enum168 m9906() {
        long l = f4880 ^ 0x4272B85848D7L;
        return this.f4878;
    }

    public Class290(int n, Enum168 obf168, Enum399 object, int n2) {
    }

    public boolean m9907(int n, Enum399 object) {
        return false;
    }

    public static void m9908(Setting[] settingArray) {
        f4879 = settingArray;
    }

    public static Setting[] m9909() {
        return f4879;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
   }

    public static IllegalStateException m6741(IllegalStateException illegalStateException) {
        return new IllegalStateException(illegalStateException);
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

    public static int m118(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x160;
        if (f4883[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f4882[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f4884.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f4884.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u0243", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Class290.f4883[n2] = n3;
        }
        return f4883[n2];
    }

    public static int m119(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Class290.m118(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }
    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f4886[n3] != null) {
            return n3;
        }
        Object object = f4885[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 48;
            case 1 -> 38;
            case 2 -> 47;
            case 3 -> 41;
            case 4 -> 25;
            case 5 -> 1;
            case 6 -> 44;
            case 7 -> 13;
            case 8 -> 45;
            case 9 -> 15;
            case 10 -> 49;
            case 11 -> 26;
            case 12 -> 19;
            case 13 -> 20;
            case 14 -> 5;
            case 15 -> 6;
            case 16 -> 9;
            case 17 -> 37;
            case 18 -> 10;
            case 19 -> 18;
            case 20 -> 46;
            case 21 -> 59;
            case 22 -> 56;
            case 23 -> 53;
            case 24 -> 52;
            case 25 -> 2;
            case 26 -> 57;
            case 27 -> 30;
            case 28 -> 35;
            case 29 -> 51;
            case 30 -> 31;
            case 31 -> 8;
            case 32 -> 29;
            case 33 -> 42;
            case 34 -> 17;
            case 35 -> 22;
            case 36 -> 34;
            case 37 -> 40;
            case 38 -> 14;
            case 39 -> 11;
            case 40 -> 55;
            case 41 -> 21;
            case 42 -> 60;
            case 43 -> 58;
            case 44 -> 4;
            case 45 -> 27;
            case 46 -> 28;
            case 47 -> 23;
            case 48 -> 39;
            case 49 -> 3;
            case 50 -> 62;
            case 51 -> 33;
            case 52 -> 12;
            case 53 -> 32;
            case 54 -> 7;
            case 55 -> 54;
            case 56 -> 50;
            case 57 -> 63;
            case 58 -> 43;
            case 59 -> 16;
            case 60 -> 24;
            case 61 -> 0;
            case 62 -> 61;
            default -> 36;
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
        Class290.f4886[n3] = new String(cArray);
        return n3;
    }

    public static void m122() {
        Object[] objectArray = f4885;
        f4885[0] = "pV\u0002]8jlL\u0000\u0001\"~|OK\u0230";
        objectArray[1] = "\u0014\u0007\u0013\u001f\u0007*=>\u000f\u0005\u0005v'*\u001f\u0006Ng 9\u0019C\u0013a;?\u0015\u0003\u0007*\u001c.\b\u0019\tj(p";
        objectArray[2] = "\u001att\u00127)3Mh\b5u)Yx\u000b~d.J~N#b5Lr\u000e7)\u0012]o\u00149i&\u0003";
        objectArray[3] = Void.TYPE;
        Class290.f4886[3] = "java/lang/Void";
        objectArray[4] = "\\\u0010ZmDF@\nX1^RP\t\u0013\u0245";
        objectArray[5] = Integer.TYPE;
        Class290.f4886[5] = "java/lang/Integer";
        objectArray[6] = "+v\u00118\u0005p y\u0000wbp-r\u00008GO5v\u0013<nd\"r\u0017-Bs/";
        objectArray[7] = "\u0003e\u000e\u0010\u0018$\u001f\u007f\fL\u00020\u000f|G\u03e7";
        objectArray[8] = "I42/a\u001aU.0s{\u000eE-{\u0169";
        objectArray[9] = "u\u001c[\u0006AT~\u0013JI<Lm\u0014C\u0000";
        objectArray[10] = Character.TYPE;
        Class290.f4886[10] = "java/lang/Character";
        objectArray[11] = Boolean.TYPE;
        Class290.f4886[11] = "java/lang/Boolean";
        objectArray[12] = "*\u001a(A$)6\u0000*\u001d>=&\u0003a\f:5 \u0006;A7,,F:\u0006x\u0019)\r\"\n8(\u0007\t<\n";
        objectArray[13] = Long.TYPE;
        Class290.f4886[13] = "java/lang/Long";
        objectArray[14] = "2 VM`\u000f9/G\u0002\u0001\u00012$CX";
        objectArray[15] = "3!Zi\u0010f6!\u000eh~\u0505\u000em[g\u0003=r-^;\u0014\f";
        objectArray[16] = "\t\u0016[pGaXE\u0003\u001a\u0384\u001b\bM\bgLgHHTp}'F\u001a^!\u0004j\u0004\u0016\u0015\u001aMrQ\u001cX{\u001b{N\u001ad";
        objectArray[17] = "!d\u0015*\u0002yl&\u0019a9\u0503\u001d(\u0002-@yc}\u0002j]\u0000";
        objectArray[18] = "\u000b\u0011;]\u0011FFS7\u0016*_^\u00184,MSZch_FB\u0006\u001f(Z\u001aU7";
        objectArray[19] = "\u001c]#i0^W\u000b<:]\u0239'Pek Q[\u0010`77`";
        objectArray[20] = "2ik\u000fP\u0001c:3e\u02c0{328\u0018[\u0007s7d\u000f";
        objectArray[21] = "F%?lEb\u0017vg\u0006\u01d5\u0018B'8kBiJ=\u007fa\u007f";
        objectArray[22] = "@h]M\u0004.\u0011;\u0005'WTAi\u0006_\u00069\u0003s\u0006I>h\u001fo\u001a\u001fS*\u0005o\f'";
        objectArray[23] = ".~J@m2\"aY\u0013\u0004/\u001e Y\u0017}z`uYP`\u0003 f\u001cS}}uf[N\u0004";
        objectArray[24] = "\u0012s\u000bH\u0011D_1\u0007\u0003*s.=\u0016\u001d\u0010\u0006WpT\u0011[";
        objectArray[25] = "-aN'\u0005)|2\u0016M\u03c6S,:\u001d0\u000e/l?A'";
        objectArray[26] = "\bB\u000ef]\u0001]BI{$\u001b[\\\\cD\u007f\n\u0002_b\u0015\u0003J\u0007\u0003u$";
        objectArray[27] = "&3]\t\n9kqQB1\u0540\u001a}\n_Lqf=\u000f\u0003[@&y^N\u0000<f|\u0002Y1z`-YSA8t,P3";
        objectArray[28] = "\u0004]\u001f.\u001bTI\u001f\u0013e \u049c8\u0013Hx]\u001cDSM$J-\u0004\u0017\u001ci\u0011QD\u0012@~ \u0011\u0000C\r%\\Q\u0005\u001f\u001a\u0014\u0011L\u0000H\u001ak\u0019P\\\u0010p(\u0018AE\u001e\fh\u001d\u001dR/L,LP\tS\f)\u0010G8\u0015\nxKMHW\u001eyB-";
        objectArray[29] = "Yq\u0004+({\b\"\\A\u047c\u0001]s\u0003,/pUiD&\u0012;\u001e~P!by\n\u007fYA";
        objectArray[30] = "\"Q:rAts\u0002b\u0018\u024d\u000e#\nieJrc\u000f5r";
        objectArray[31] = "13km\u0016T43?lx\u0197\f\u007fjc\u0005\u000fp?o?\u0012>";
        objectArray[32] = ">XaB2M;X5C\\GjS8k;Kn(d\u00180Z2T$\u001dlM\u0003";
        objectArray[33] = "Jv?u\u0006v\u000743>=mv8\" \u00074\u000fu`,L";
        objectArray[34] = "W\u0002:,^D\u0002\u0002}1'Q\t\u0013}\u001c[:UBk(\u0016F\u0015G7?'\u0005YAw-CQ\u000b\u0001>U";
        objectArray[35] = "[o;Dti^ooE\u001a\u0138f!z\u001bcz\u0018tz\\~\u0003";
        objectArray[36] = "\u0016g\u0004\u0003-\u001bG4\\i\u0479a\u0017vTS,\u0018Z4X\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[37] = "q%P\u001d\"\u001f v\bw\u01baeq6V\u0015v\u000ft6\u0002\u0014";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Class290.m121(l, l2);
            object = f4885[n];
            try {
                if (!(object instanceof String)) break block2;
                Class290.f4885[n] = clazz = Class.forName(f4886[n]);
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
        Field field = Class290.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Class290.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = Class290.m121(l, l2);
        Object object = f4885[n];
        if (object instanceof String) {
            String string = f4886[n];
            int n2 = string.indexOf(8);
            Class clazz = Class290.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Class290.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Class290.m124(clazz3, string2, clazz2)) != null) {
                    Class290.f4885[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Class290.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Class290.f4885[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Class290.m123(1046313214014718L, 0L);
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
        Method method = Class290.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Class290.m128(classArray2[i], string, clazz2, n, classArray);
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
            if (c == 'P' || c == 'r' || c == '\u00a2' || c == 'i') {
                field = Class290.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'P' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Class290.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = Class290.m130(lookup, mutableCallSite, string, methodType, l, l2);
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
            return MethodHandles.lookup().findStatic(Class290.class, "m119", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Class290.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

