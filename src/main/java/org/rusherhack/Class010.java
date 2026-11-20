/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package org.rusherhack;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
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
import org.rusherhack.Class253;
import org.rusherhack.Class489;
import org.rusherhack.Class545;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;

import org.rusherhack.command.bind;
public class Class010 {
    public static String f199;
    public static String f200;
    public static Int2ObjectMap<String[]> f201;
    public static Int2ObjectMap<String[]> f202;
    public static Int2ObjectMap<String[]> f203;
    public static String f204;
    public static long f205;
    public static String[] f206;
    public static String[] f207;
    public static Map f208;
    public static Object[] f209;
    public static String[] f210;

    public static IKey m418(String string) {
        block13: {
            String string2;
            block14: {
                block12: {
                    long l = f205 ^ 0x184200BCDA8DL;
                    string2 = string;
                    string2 = string2.replace("_", "").toUpperCase();
                    try {
                        if (!string2.startsWith("MOUSE")) break block12;
                    }
                    catch (NumberFormatException numberFormatException) {
                        numberFormatException.printStackTrace();
                    }
                    string2 = string2.substring("MOUSE".length());
                    int n = Class010.m419(string2);
                    try {
                        if (n != -1) {
                            return new Class489(n);
                        }
                        break block13;
                    }
                    catch (NumberFormatException numberFormatException) {
                        numberFormatException.printStackTrace();
                    }
                }
                try {
                    if (!string2.startsWith("KEY")) break block14;
                }
                catch (NumberFormatException numberFormatException) {
                    numberFormatException.printStackTrace();
                }
                string2 = string2.substring("KEY".length());
            }
            int n = Class010.m422(string2);
            try {
                if (n != -1) {
                    return new Class545(n);
                }
            }
            catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
            }
            try {
                n = Integer.parseInt(string2);
                return new Class545(n);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        return NullKey.INSTANCE;
    }

    public static int m419(String string) {
        long l = f205 ^ 0x7138770A3FDAL;
        String string2 = string;
        string2 = string2.replace("_", "");
        ObjectIterator objectIterator = f201.int2ObjectEntrySet().iterator();
        int n = Class253.m9154();
        block6: while (true) {
            boolean bl = objectIterator.hasNext();
            block7: while (bl) {
                Int2ObjectMap.Entry entry = (Int2ObjectMap.Entry)objectIterator.next();
                String[] stringArray = (String[])entry.getValue();
                int n2 = stringArray.length;
                int n3 = 0;
                block8: while (true) {
                    int n4;
                    int n5 = n4 = n3;
                    while (true) {
                        block10: {
                            try {
                                if (n5 >= n2) continue block6;
                                n3 = stringArray[n4].replace("_", "").equalsIgnoreCase(string2) ? 1 : 0;
                                if (n != 0) continue block8;
                            }
                            catch (NumberFormatException numberFormatException) {
                                numberFormatException.printStackTrace();
                            }
                            if (n != 0) continue block7;
                            try {
                                try {
                                    if (n != 0) continue;
                                    if (n3 == 0) break block10;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    numberFormatException.printStackTrace();
                                }
                                return entry.getIntKey();
                            }
                            catch (NumberFormatException numberFormatException) {
                                numberFormatException.printStackTrace();
                            }
                        }
                        n5 = ++n4;
                    }
                }
            }
            break;
        }
        return -1;
    }

    public static String m420(int n, boolean bl) {
        return null;
    }

    public static String m421(int n, boolean bl) {
        long l = f205 ^ 0x6BC007E2829BL;
        int n2 = n;
        String string = ((String[])f201.get(n2))[0];
        try {
            if (bl) {
                return "MOUSE_" + string;
            }
        }
        catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    static {
    }

    public static int m422(String string) {
        long l = f205 ^ 0x7CD8CFF5252AL;
        String string2 = string;
        string2 = string2.replace("_", "");
        ObjectIterator objectIterator = f202.int2ObjectEntrySet().iterator();
        int n = Class253.m9155();
        block6: while (true) {
            boolean bl = objectIterator.hasNext();
            block7: while (bl) {
                Int2ObjectMap.Entry entry = (Int2ObjectMap.Entry)objectIterator.next();
                String[] stringArray = (String[])entry.getValue();
                int n2 = stringArray.length;
                int n3 = 0;
                block8: while (true) {
                    int n4;
                    int n5 = n4 = n3;
                    while (true) {
                        block10: {
                            try {
                                if (n5 >= n2) continue block6;
                                n3 = stringArray[n4].replace("_", "").equalsIgnoreCase(string2) ? 1 : 0;
                                if (n == 0) continue block8;
                            }
                            catch (NumberFormatException numberFormatException) {
                                numberFormatException.printStackTrace();
                            }
                            if (n == 0) continue block7;
                            try {
                                try {
                                    if (n == 0) continue;
                                    if (n3 == 0) break block10;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    numberFormatException.printStackTrace();
                                }
                                return entry.getIntKey();
                            }
                            catch (NumberFormatException numberFormatException) {
                                numberFormatException.printStackTrace();
                            }
                        }
                        n5 = ++n4;
                    }
                }
            }
            break;
        }
        return -1;
    }

    public static NumberFormatException m423(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x47A5;
        if (f207[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])f208.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f208.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/T", exception);
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
               byte[] byArray2 = f206[n2].getBytes("ISO-8859-1");
               Class010.f207[n2] = Class010.m117(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f207[n2];
    }

    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = Class010.m153(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }
    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f210[n3] != null) {
            return n3;
        }
        Object object = f209[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 29;
            case 1 -> 63;
            case 2 -> 15;
            case 3 -> 27;
            case 4 -> 40;
            case 5 -> 36;
            case 6 -> 17;
            case 7 -> 16;
            case 8 -> 49;
            case 9 -> 28;
            case 10 -> 50;
            case 11 -> 52;
            case 12 -> 3;
            case 13 -> 30;
            case 14 -> 55;
            case 15 -> 10;
            case 16 -> 39;
            case 17 -> 57;
            case 18 -> 26;
            case 19 -> 2;
            case 20 -> 41;
            case 21 -> 60;
            case 22 -> 56;
            case 23 -> 47;
            case 24 -> 19;
            case 25 -> 43;
            case 26 -> 7;
            case 27 -> 6;
            case 28 -> 61;
            case 29 -> 23;
            case 30 -> 59;
            case 31 -> 12;
            case 32 -> 21;
            case 33 -> 1;
            case 34 -> 33;
            case 35 -> 34;
            case 36 -> 24;
            case 37 -> 5;
            case 38 -> 48;
            case 39 -> 51;
            case 40 -> 58;
            case 41 -> 54;
            case 42 -> 0;
            case 43 -> 13;
            case 44 -> 4;
            case 45 -> 32;
            case 46 -> 38;
            case 47 -> 31;
            case 48 -> 18;
            case 49 -> 35;
            case 50 -> 53;
            case 51 -> 20;
            case 52 -> 25;
            case 53 -> 62;
            case 54 -> 46;
            case 55 -> 42;
            case 56 -> 44;
            case 57 -> 37;
            case 58 -> 9;
            case 59 -> 8;
            case 60 -> 45;
            case 61 -> 22;
            case 62 -> 11;
            default -> 14;
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
        Class010.f210[n3] = new String(cArray);
        return n3;
    }

    public static void m122() {
        Object[] objectArray = f209;
        f209[0] = "\r\u0013j\r>\u001f\t\u000ej\u001c#\u001fJ\u0001%\u000b$\u0003\u0010\u000e(V?\u0014\u000e\u0002'\f#X+\u0005.\u001d3\u00027\u00020";
        objectArray[1] = "N\u0015*dw\u0005J\b*uj\u0005\t\u0007ebm\u0019S\bh?v\u000eM\u0004gejBh\u0003ntz\u0018n\u0015acx\u0018H\u0013";
        objectArray[2] = "\f\u0007\u001b\u0011/'\u0012\u000f\u0001^H&\u0003\u0014\f\u0004n ";
        objectArray[3] = "\u0012X)#0\u0010\u0019W8lQ\u001e\u0012\\<6";
        objectArray[4] = "(WHd;&,JHu&&oE\u0007b!:5J\n?<!5PHX;;sl\u0004{0,5n\u0007aq\n/W\u0014h";
        objectArray[5] = Integer.TYPE;
        Class010.f210[5] = "java/lang/Integer";
        objectArray[6] = ":D [S\f1K1\u0014.\u0014\"L8]";
        objectArray[7] = "l\bMZ\u001aDg\u0007\\\u0015w@g\u001bh^E]c\u0007X^";
        objectArray[8] = "ZG0?\u0006?F]2c\u001c+V^y\u0217";
        objectArray[9] = "\u00108\u0006Fh\u0007\f\"\u0004\u001ar\u0013\u001c!O\u0420";
        objectArray[10] = "#Ri'2\u0004?Hk{(\u0010/K ]";
        objectArray[11] = "-\u001abi\bS&\u0015s&hJ*\u0019qz`P5\u0016u|cG$\u001ed|OP)";
        objectArray[12] = "\u0003=e`Wu\u0007 eqJuD/*fMi\u001e ';Pr\u001e:e\\WhX\u0006)\u007f\\\u007f\u001e\u0004*e";
        objectArray[13] = "-iV'o$1sT{u0!p\u001f\u0237";
        objectArray[14] = Boolean.TYPE;
        Class010.f210[14] = "java/lang/Boolean";
        objectArray[15] = "n&?Pv8r<=\fl,b?v\u001dk?dz:\u0017j)/?=\u0007*\u0003t845a4";
        objectArray[16] = "pwn_Si{x\u007f\u00104kns\u007f[\u000f";
        objectArray[17] = "\u0016\f\"N~n\u0006\u001102'|\u0015\u000b:N!zxHmT+zH\r:I7\u0000";
        objectArray[18] = "\r,\f\u0000B\u0003FnY\u0003r^Y#\u001f<H\u0006Ub\u0006X\bWW#c";
        objectArray[19] = "~!44\u000501;r z\u0532Cf+%\u001ab'dv+\u001dR";
        objectArray[20] = "\u007f5#0\u0004Z0/e${\u0261Br<!\u001b\b&pa/\u001c8";
        objectArray[21] = "K4\u001bYUW\u001ac[Bm\u0000t2\u001e\u0015UR\u00166\u0018R\u0007iKv[\u0013V\u000bOp\u001cAm";
        objectArray[22] = "-\u0000!n8Ir\n(\u007fFIl\u00103h<Sw\u0015H/#MqJ,-~Cvztn/Ho\u0001+d&Y\u0011";
        objectArray[23] = "5NBD>~jDKU@adRDB \u00052QT^pa0\fZY@";
        objectArray[24] = "N?\u00154J\u0018\u001fhU/r\u04ddq:\u0011/\bX\ne\u001b&\u0019&Jc\u0014&BBH>\u001a!r";
        objectArray[25] = "\u001a\u007f\u0019QdZ\u0017`BV\u000f_\u0019`_@NA\f\u001a\u0018Wf]\u000eaG]oLp!ARo\u0017\u0014#\u001c\\h'";
        objectArray[26] = "Aie\u0015d\u0000\u0010>%\u000e\\\u027f~`c\t%[\u0004:%\u0018;";
        objectArray[27] = "ACFD\u0014F\u0010\u0014\u0006_,\u0381~J@XU\u001d\u0004\u0010\u0006IK";
        objectArray[28] = "^i~U\u001eK\u0001cwD`]\u001bn~K\u001bq\rupU\r{\u000bhz/\\J\u000biiT\u0003@\u0002x\u0017F\\\u000b\u000b(fO\nJ[\u0013";
        objectArray[29] = ";x2-\u001b,j/r6#\u0296\u0004}66Yl\u007f\"<?H\u0012?$3?\u0013v=y=8#";
        objectArray[30] = "h<gF\u0013h=|qA(BG\u001c]unHLGhGNy:,=\u0007X~";
        objectArray[31] = "V.X\u001f[Q\t.Q\u000e%Q\u00167K\u0019^u\u000b\"Qe\u0019P\u0003$O\u001eFZ\n51\f\u0019\u0011\u0003e@\u0005OPS^";
        objectArray[32] = " \u0014sen_rR~7RTvUT>.xvX\u0015c7D{\u0019qajJ|)";
        objectArray[33] = ";!F2iSd+O#\u0017Rj#K!|E\u0007f@.{HmgL(y(:4I$wB;8O&\u0017\u0014}2U6lKw;DH";
        objectArray[34] = "R\u0007\fQ\u001b\u0014\u0014]I\u0006d\u0123l]O^\u001e\u0007\u0017\u0002EW\u000fyP\u001b\\M\u001a\u0002\u000f\u0011U\\d";
        objectArray[35] = "\u0002=\u0005\u00051xP{\bW\rsT|=QiaT\u0000Y\u0006l-\\d\u0019Wnl9";
        objectArray[36] = "n`\u0017$+T?7W?\u0013\u0409Qi\u00118j\u000f+3W)t";
        objectArray[37] = "=!Ri|1ggCw\u00193p%<+|4miX)!:jY\u0006.xzh=F\u007fz;\rc\u0002q(.i#SsiK";
        objectArray[38] = "\b!>?\u0015=Rg/!p&^%j\u0001\u001a%U2,\u000b\u0016;B(\u000b+\fGV$!:H)F93F";
        objectArray[39] = "\b\u0016>o4\u000fRP/qQ\u001aU\u0012P-4\nX^4/i\u0004_nj(0D]\n*y2\u00058";
        objectArray[40] = "${LH]N{qEY#I\u007f\\]JNOSh^_#\tbh_LXVhaN2";
        objectArray[41] = "f\bw\u0019D\u001e9ZmV8\u027cW\u000fg\u0001B\u0001,Pm\bS\u007fkIt\u0012F\u00044C}\u00038";
        objectArray[42] = "+\u0010^\u0011o(`R\u000b\u0012_s{\u0014w@/o\u0012\u0006\r\u00166(c\u000f[Wf\u0013";
        Object[] objectArray2 = objectArray;
        objectArray[43] = "H.z*2b\u0019s:1\n\u03fcw&a'jl\u0013$<)m\\\u001e!?11-\u0017w~a\n`\rt~&q?\u0007}oX";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Class010.m121(l, l2);
            object = f209[n];
            try {
                if (!(object instanceof String)) break block2;
                Class010.f209[n] = clazz = Class.forName(f210[n]);
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
        Field field = Class010.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Class010.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = Class010.m121(l, l2);
        Object object = f209[n];
        if (object instanceof String) {
            String string = f210[n];
            int n2 = string.indexOf(8);
            Class clazz = Class010.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Class010.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Class010.m124(clazz3, string2, clazz2)) != null) {
                    Class010.f209[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Class010.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Class010.f209[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Class010.m123(221478085585329L, 0L);
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
        Method method = Class010.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Class010.m128(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00aa' || c == '\u00da' || c == 'U' || c == '\u00f3') {
                field = Class010.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Class010.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = Class010.m130(lookup, mutableCallSite, string, methodType, l, l2);
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
            return MethodHandles.lookup().findStatic(Class010.class, "m154", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(Class010.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

