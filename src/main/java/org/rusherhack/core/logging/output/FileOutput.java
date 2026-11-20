/*
 * Decompiled with CFR 0.152.
 */
package org.rusherhack.core.logging.output;

import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.logging.ILog;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.IOUtils;

public class FileOutput
implements ILog {
    public static SimpleDateFormat DATE_FORMAT;
    public File f1638;
    public static boolean f1639;
    public static long f1640;
    public static String[] f1641;
    public static String[] f1642;
    public static Map f1643;
    public static long f1644;
    public static Object[] f1645;
    public static String[] f1646;

    @Override
    public void info(String object) {
        
    }

    /*
     * Loose catch block
     */
    @Override
    public void debug(String object) {
        
    }

    @Override
    public void error(String object) {
        
    }

    @Override
    public void warn(String object) {
        
    }

    public SimpleDateFormat getTimestampFormat() {
        long l = f1640 ^ 0x6590A383EA2FL;
        return DATE_FORMAT;
    }

    public FileOutput(File object) {
    }

    /*
     * Unable to fully structure code
     */
    static {
    }

    public FileOutput(Path object) {
    }

    public static void m4002(boolean bl) {
        f1639 = bl;
    }

    public static boolean m3811() {
        return f1639;
    }

    public static boolean m4004() {
        boolean bl = FileOutput.m3811();
        return !bl;
    }
    public static String m656(byte[] byArray) {
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

    public static String m657(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x36AB;
        if (f1642[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])f1643.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f1643.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/core/logging/output/FileOutput", exception);
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
               byte[] byArray2 = f1641[n2].getBytes("ISO-8859-1");
               FileOutput.f1642[n2] = FileOutput.m656(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f1642[n2];
    }

    public static Object m658(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = FileOutput.m657(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }
    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f1646[n3] != null) {
            return n3;
        }
        Object object = f1645[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 61;
            case 1 -> 13;
            case 2 -> 10;
            case 3 -> 1;
            case 4 -> 11;
            case 5 -> 34;
            case 6 -> 7;
            case 7 -> 45;
            case 8 -> 41;
            case 9 -> 27;
            case 10 -> 47;
            case 11 -> 22;
            case 12 -> 51;
            case 13 -> 26;
            case 14 -> 46;
            case 15 -> 50;
            case 16 -> 48;
            case 17 -> 54;
            case 18 -> 6;
            case 19 -> 56;
            case 20 -> 8;
            case 21 -> 4;
            case 22 -> 60;
            case 23 -> 63;
            case 24 -> 2;
            case 25 -> 62;
            case 26 -> 31;
            case 27 -> 33;
            case 28 -> 12;
            case 29 -> 49;
            case 30 -> 19;
            case 31 -> 3;
            case 32 -> 16;
            case 33 -> 9;
            case 34 -> 15;
            case 35 -> 40;
            case 36 -> 29;
            case 37 -> 35;
            case 38 -> 28;
            case 39 -> 58;
            case 40 -> 37;
            case 41 -> 42;
            case 42 -> 57;
            case 43 -> 17;
            case 44 -> 43;
            case 45 -> 52;
            case 46 -> 14;
            case 47 -> 38;
            case 48 -> 18;
            case 49 -> 24;
            case 50 -> 32;
            case 51 -> 5;
            case 52 -> 20;
            case 53 -> 36;
            case 54 -> 25;
            case 55 -> 55;
            case 56 -> 44;
            case 57 -> 53;
            case 58 -> 23;
            case 59 -> 21;
            case 60 -> 39;
            case 61 -> 59;
            case 62 -> 30;
            default -> 0;
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
        FileOutput.f1646[n3] = new String(cArray);
        return n3;
    }

    public static void m122() {
        Object[] objectArray = f1645;
        f1645[0] = "\u0014OGb\tI\bUE>\u0013]\u0018V\u000e/\u0014N\u001e\u0013N#\u000fU\u001dTC-\u000fU\u0014S\u000e8\u0002L\u001e\u0013n#\u000fU\u001dTC-\u000fU\u0014S";
        objectArray[1] = "X\u0013\u0005cK\u0001S\u001c\u0014,6\u0019@\u001b\u001de";
        objectArray[2] = ",\u001b=\u0019\u000f\u00180\u0001?E\u0015\f \u0002tT\u0012\u001f&G/C\u0014\u00010G\u0017V\t\u0005\u0016\u001d3[\u000e";
        objectArray[3] = "S\u0006/y\u0012\u0017P\n<6u\rJ\u00138vH";
        objectArray[4] = Boolean.TYPE;
        FileOutput.f1646[4] = "java/lang/Boolean";
        objectArray[5] = "#&\u0016XUOV\u0006\u001dWD\u00007\b\u0016\\@ZC";
        objectArray[6] = "fH\u0007[Imc\u00077S\u000ba";
        objectArray[7] = "\u0011Rch\u007fo\rHa4e{\u001dK*%bh\u001b\u000eq2dv\r\u000eM\tXn\u0017Lw";
        objectArray[8] = Void.TYPE;
        FileOutput.f1646[8] = "java/lang/Void";
        objectArray[9] = "%\u000e:\u000fq\u00119\u00148Sk\u0005)\u0017sBl\u0016/R1Nd\u0003#\u0012:\u000fl\u0011>\f(U-\"#\u00108nv\u0010:\t)";
        objectArray[10] = "`\t\u001aB\u000bvo\u0010\u0018\rvkg\u0018\u0000Fac~\r*LWok\u001c";
        objectArray[11] = "Zd{?~ADlap\u0014UD`";
        objectArray[12] = "?\b\u001bIG_4\u0007\n\u0006,K6\f\u001d\\\u0000\\;";
        objectArray[13] = "a>zB\u0004\bb0\"EC\nnq\\B^\u000e";
        objectArray[14] = "Cs(lor]{2#\"hGq+\u007f3bGfpY(jLG0d5";
        objectArray[15] = "eK\u0013\u0001\u001b}\u0010n\u0016N+uRbB";
        objectArray[16] = Long.TYPE;
        FileOutput.f1646[16] = "java/lang/Long";
        objectArray[17] = "\u0006,Q9\u000fA\r#@vmB\u0002*";
        objectArray[18] = "\u0004OTlQL\u000f@E#,Y\u001dZG`";
        objectArray[19] = ")eh\u0018MW5\u007fjDWC%|!UPP#9|SKV/yh\u0018lG2cfXX";
        objectArray[20] = "\u0007WI}\u0007\\rwBr\u0016\u0013\u000foQu\u001fZg";
        objectArray[21] = "T\\\u00117M^!|\u001a8\\\u0011\\d\t?UX4";
        objectArray[22] = "CpxAnBH\u007fi\u000e\u000fLCtmT";
        objectArray[23] = "0@mti%#K)O}C/Ll+; eZjO#%fN=,i3`*";
        objectArray[24] = ";U{lG\u0018x\u0017.l&I\u0002Uy+B\u000fa\u001fo-&\u0017d\u001c{zE]r\u001a\u001f";
        objectArray[25] = "PKZ\u0007\u000ba\u0004\u0011B\u0016ke\r^ V\u0001y\u0001AB\u0002[a\u0010!";
        objectArray[26] = ":/OpFy2'G= \f\u001a\u0017qOI)6yLvA!>4";
        objectArray[27] = "\u000eKAp&BD]G\u0014!G\u0010V%u0A|_\u001c/(K\u001f\u0015\n)L\u001aBQ\u0004x-\u001c\rT\u0005\u0014";
        objectArray[28] = "\u0007\u0013@X,PM\u0005F<(T\u000f\u0010\u0012@FA\u0013N\u001fV%\u000b\u0005H{\u0007?\nJ\tG\ry\u000bOu\tZ}W\u001f\u0016CL{3";
        objectArray[29] = "\u007f~~RO.p`c\t1u&taZM\u001bq1u]\u000b\u007f3j~Q1i'5`YR#13\u0004";
        objectArray[30] = "\u0010. !2KK6aq\r\u00ce.|$dsAOzkar-";
        objectArray[31] = "\fdqMM\u0007\u0004ew\u001cs\u0013Fak\r(\u0017Ukn-\t\u0002Wm\rL\b\u0015\rjj\u0013\t\u0014Z\u0000";
        objectArray[32] = "N\u0006{\u0003eBN^.R\u0002C\u0015o.Db?CQ;I:Z\u0013L&H\u0002";
        objectArray[33] = "h\u0005\u000b@oy3\u001dJ\u0010P\u04adVW\u000f\u0005.s7Q@\u0000/\u001fk\u0017OH:x4\u0016N\u001fP";
        objectArray[34] = "j\n?g?\r(Q4k\u0005\u0007 R+\t?\u0003 ^.kkY8ON9:\u00184\u000f*{a\u001385";
        objectArray[35] = "g3Aob\u0013gk\u0014>\u0005\n2y\u0001\u0011b\u0002:l\u001c9in1iL)w\u0000a?\u0013d\u0005";
        objectArray[36] = "*3386]*kfiQEunny* -<s}=A+sv|Q";
        objectArray[37] = "\u0005S^K`\"VDB\u0017Q\u0539iF\u0016\t*'\u0014S\u0010\u0015jX";
        objectArray[38] = "c\u0012\u0012v\u0012'cJG'u>>XR\u0003\u0014>2X.$\u0017<4XT6Kg3#";
        objectArray[39] = ":)[\r*Gp?]i!_\u0005*\u0018\u00151$sq\u001c\u0017,Eu>\u0019\u0016@";
        objectArray[40] = "*p\u001eh&G\"x\u0016%@\u0002$\\\u001a3$\u001f8\u0019\u0011<q\u00031wAj.NCs\u0010f=\f-#F9p~";
        objectArray[41] = "\u0000\"\feTa\u0000zY43sQov7Vq<aVeWv_+@c3";
        objectArray[42] = "#lXY%9#4\r\bB)o<\u001f\u001e9D$c\u0018\u001c.%\",\u001d\u001dB";
        objectArray[43] = "\b9Q\u000bD%\t7RP*`O7V^qcO7L\\vx{7N^*#\u0004j\u0011TW#\\?@3Xy\u000e2@P\u0012o\bV\u0011\rVaY7\u0017BS`5m\u0014OTsTk[JU\u001f\b-T\u0002@xW,UU*";
        objectArray[44] = "3\u0006x)\u000f4h\u001e9y0\u0433\rT|lN>lR3iOR";
        objectArray[45] = "H\u00157\t\u0005 \u0013\rvY:\u017bv@<\f\u0001!\u000b@dYP";
        objectArray[46] = "j\u0013\u0006*Y#jKS{>1;^bxD30^tpZ3V\u001e\u000b-\u00059+\u001eSxT^";
        objectArray[47] = "bX M\u000by9@a\u001d4p1MF\u0015Qr'Ms\u0011LQ;K\u007f\u001dH\u001fbA`\u0015J m_}N4";
        objectArray[48] = "j<\u001b\txe1$ZYG\u0152T'G\u000b#i7mQ\rGq2nEZ$;$h!\r<}e?FR=|2U";
        objectArray[49] = "j?2c\f\u0003jgg2k\u0004;hg=\u0006\"1\u000e2iWE1s21\u0002\u0014V50$\u0015\u001273\u007f!\u0014~";
        objectArray[50] = "$\u0015H+%J\u007f\r\t{\u001a`S ?ETk@9;N\u001a\u0012j\u0006\u0013l%\u001dt\u001bH";
        objectArray[51] = "z\u0016\u0002J\r\\!\u000eC\u001a2SDO\\\u000f\u000e\u0004(G]\t_:t\u001bDO\fV|\u001aB\u001e2";
        objectArray[52] = "9B\u0003D% 4\u0006Q]O2;\u001fAH\b\"R\u0011W\u00142><A\u0001K\u007fL9B\u0003D% 4\u0006Q]O";
        objectArray[53] = "\b{vh\"#[lj4\u0013\u0326dn>*h&\u0019{86(YY{zfy>\u0006z{1\u0013";
        objectArray[54] = "\u001cU\f\n3pLH\u0011\u000b\u000biJ}\u0011\u001ff\u0015\u0011\u0002L@lh\u0011Z\u0019\u0011\u000b";
        objectArray[55] = "Z\"y\u001e\u001c_H5%_l\u0005L(9N\n\u0012m3&N)\u000fU6\"Xl\u0004Zc>Q\u0002T\f<s#";
        objectArray[56] = "9\u0002\u0006\u00074\u0010b\u001aGW\u000b7\u0007ZZBzNb\nG_{v:\u0010B\u000fa\u0011e\u0011CX\u000b";
        Object[] objectArray2 = objectArray;
        objectArray[57] = "v\\\u000e\u0006RuwR\r]<$1^\u001cBQ\u0001*W\u0018>\u0000~w\b\u0012C\u0000&\"Yu\u0005\u000235_\u0014\u0003M643";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = FileOutput.m121(l, l2);
            object = f1645[n];
            try {
                if (!(object instanceof String)) break block2;
                FileOutput.f1645[n] = clazz = Class.forName(f1646[n]);
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
        Field field = FileOutput.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = FileOutput.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = FileOutput.m121(l, l2);
        Object object = f1645[n];
        if (object instanceof String) {
            String string = f1646[n];
            int n2 = string.indexOf(8);
            Class clazz = FileOutput.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = FileOutput.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = FileOutput.m124(clazz3, string2, clazz2)) != null) {
                    FileOutput.f1645[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = FileOutput.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        FileOutput.f1645[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = FileOutput.m123(1550079799076926L, 0L);
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
        Method method = FileOutput.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = FileOutput.m128(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00c8' || c == 'e' || c == '\u00cd' || c == '\u00fc') {
                field = FileOutput.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = FileOutput.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = FileOutput.m130(lookup, mutableCallSite, string, methodType, l, l2);
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
            return MethodHandles.lookup().findStatic(FileOutput.class, "m658", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(FileOutput.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

