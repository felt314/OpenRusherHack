/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.PacketType
 *  net.minecraft.network.packet.PlayPackets
 */
package org.rusherhack;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.PacketType;
import net.minecraft.network.packet.PlayPackets;
import org.rusherhack.Class066;
import org.rusherhack.Class171;
import org.rusherhack.Class253;
import org.rusherhack.client.api.ui.window.context.ContextAction;

public class Class267 {
    public static HashMap<PacketType<?>, Supplier<String>> f4647;
    public static HashMap<PacketType<?>, Supplier<String>> f4648;
    public static long f4649;
    public static String[] f4650;
    public static String[] f4651;
    public static Map f4652;
    public static Object[] f4653;
    public static String[] f4654;

    public static void m9404(PacketType<?> packetType) {
        
    }

    public static String m9407(Object object, int n) {
        long l = f4649 ^ 0x1BE73D5F93F5L;
        Object object2 = object;
        if (object2 == null) {
            return "null";
        }
        String string = "  ".repeat(n);
        if (object2 instanceof List) {
            return Class267.m9409((Packet)object2, true);
        }
        return object2.toString();
    }

    public static void m9408(PacketType<?> packetType) {
        
    }

    /*
     * Unable to fully structure code
     */
    static {
    }

    /*
     * Loose catch block
     */
    public static String m9409(Packet<?> object, boolean bl) {
        return null;
    }

    public static Exception m672(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3851;
        if (f4651[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])f4652.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f4652.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u021a", exception);
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
               byte[] byArray2 = f4650[n2].getBytes("ISO-8859-1");
               Class267.f4651[n2] = Class267.m117(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f4651[n2];
    }

    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = Class267.m153(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }
    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f4654[n3] != null) {
            return n3;
        }
        Object object = f4653[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 32;
            case 1 -> 55;
            case 2 -> 14;
            case 3 -> 40;
            case 4 -> 36;
            case 5 -> 26;
            case 6 -> 29;
            case 7 -> 13;
            case 8 -> 19;
            case 9 -> 47;
            case 10 -> 20;
            case 11 -> 16;
            case 12 -> 15;
            case 13 -> 49;
            case 14 -> 38;
            case 15 -> 63;
            case 16 -> 25;
            case 17 -> 43;
            case 18 -> 59;
            case 19 -> 58;
            case 20 -> 30;
            case 21 -> 22;
            case 22 -> 34;
            case 23 -> 48;
            case 24 -> 44;
            case 25 -> 60;
            case 26 -> 23;
            case 27 -> 56;
            case 28 -> 42;
            case 29 -> 51;
            case 30 -> 41;
            case 31 -> 0;
            case 32 -> 1;
            case 33 -> 2;
            case 34 -> 27;
            case 35 -> 45;
            case 36 -> 33;
            case 37 -> 18;
            case 38 -> 31;
            case 39 -> 9;
            case 40 -> 6;
            case 41 -> 54;
            case 42 -> 39;
            case 43 -> 61;
            case 44 -> 7;
            case 45 -> 21;
            case 46 -> 8;
            case 47 -> 53;
            case 48 -> 24;
            case 49 -> 11;
            case 50 -> 46;
            case 51 -> 57;
            case 52 -> 62;
            case 53 -> 4;
            case 54 -> 3;
            case 55 -> 52;
            case 56 -> 37;
            case 57 -> 50;
            case 58 -> 35;
            case 59 -> 17;
            case 60 -> 12;
            case 61 -> 10;
            case 62 -> 5;
            default -> 28;
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
        Class267.f4654[n3] = new String(cArray);
        return n3;
    }

    public static void m122() {
        Object[] objectArray = f4653;
        f4653[0] = "]|`s\u0019SAfb/\u0003GQe)\u0247";
        objectArray[1] = "+\u0018\u0016>E\u001b5\u0010\fq#\u000f2\u0011->\u001b";
        objectArray[2] = "@=6A\b\u0001K2'\u000ei\u000f@9#T";
        objectArray[3] = "26cQz5,>y\u001e\u001d4=%tD;2";
        objectArray[4] = "V[o)6a]T~fjhZV|+l#zS|$|";
        objectArray[5] = "\u0004/\u000e*\r)\u00185\fv\u0017=\b6G\u0169";
        objectArray[6] = "((e\u001b|-6 \u007fT\u001f92";
        objectArray[7] = "B\u0002\\.%SI\rMaXKZ\nD(";
        objectArray[8] = "t`V?\u0002H\u007foGpoL\u007fss;]Q{oC;";
        objectArray[9] = "\"\u007flV\u000e&>en\n\u00142.f%\u027e";
        objectArray[10] = Integer.TYPE;
        Class267.f4654[10] = "java/lang/Integer";
        objectArray[11] = "\u000b/\u0015`[E\u0000 \u0004/6E\u0000=\u0010";
        objectArray[12] = "*PGTU+!_V\u001b(32X_R92)]UP\t";
        objectArray[13] = "PAUUo.L[W\tu0\\X\u001c\u0018q8Z]FU|!V\u001dG\u00123&V]V\u0014j\u007f\\\\\\\u000fx)K\u001dq\u0014s%ZKF:~%V\\\\";
        objectArray[14] = Boolean.TYPE;
        Class267.f4654[14] = "java/lang/Boolean";
        objectArray[15] = Void.TYPE;
        Class267.f4654[15] = "java/lang/Void";
        objectArray[16] = "\u0016\u0000cR+\u0016\u001d\u000fr\u001d@\u0002\u001f\u0004eGl\u0015\u0012";
        objectArray[17] = "d\u000b\nDFyz\u0003\u0010\u000b$e}\u001e";
        objectArray[18] = "lG\u0018oN]rO\u0002 #GjJ\u000bm\u0014AiH\u001d";
        objectArray[19] = "1Q&69J/Y<yTP7\\54cV4^";
        objectArray[20] = "'+\u001f\u0018`xR\u000b\u0014\u0017q73\u0005\u001f\u001cumG";
        objectArray[21] = "\n\u0017\\\u0012=m\u007f7W\u001d,\"#>P\u001f.o%up\u001a.`5`";
        objectArray[22] = "\u001f\u0012.(.\u0003\u001f\u00129t\"\f\u0005Y9j\"\u0019\u0002(h?uZ";
        objectArray[23] = "2\u000b3\u0014|/2\u000b$Hp (@$Vp5/1~\u000b%s";
        objectArray[24] = "\u001c2\u0006@lZ\u001c2\u0011\u001c`U\u0006y\u0011\u0002`@\u0001\bG]3\u0002";
        objectArray[25] = "O\u0016fFE6O\u0016q\u001aI9U]q\u0004I,R,$P\u0010o\u0005\u0010~\t[,~E*P\u001b";
        objectArray[26] = ">r\u0006z\u001bW z\u001c5fG ";
        objectArray[27] = "a\u0014-\b!/a\u0014:T- {_:J-5|.k\u0013up";
        objectArray[28] = "{\fN/QDe\u0004T`2PaI} \u000bCh";
        objectArray[29] = "HmZ\r^r\u001bnT\u000e%j\u001frTc\u001cn\u0017bO\u0012J~\u0012<(";
        objectArray[30] = "1KNY\u0017*gARTn02XJT\u0002\u0002f\u001e\u001a\bTUbN\u0011C\t'fUGZn";
        objectArray[31] = "_$N*\u001b'\u001e+_D\u009bFYqC~\u0010*\u001a!^z";
        objectArray[32] = "\u001f8F\u000f%K^dRT@\u055a!cR]<Z\u001b=CT<:";
        objectArray[33] = "\u001a6Y2&P[9H\\\u00821\u001c=P<+@J-UbL\u000fW4I<vQF=I\\q[\u001e/R.u@H65";
        objectArray[34] = "7|\u0004pCvv \u0010+&\u025e\t'\u0010\"Zg3y\u0001+Z\u0007";
        objectArray[35] = "\u0006?\u0012\u0014_S\u001d#B\bc\r\u001b?S\u0006\u001f\u000b\u001dR\u0013\u0000\u0011\u0002\u001c,@\u0003\u001f\u0001g";
        objectArray[36] = "\"0A\u0004L\u0018}t\u001fB!\u0461\u0019r\u0014[A\u0017iwA\t_";
        objectArray[37] = "\u0012C\u0005W63]\u0001\u0019\u0000G%Eg\u000b\u0011&?M<J\u0001|)ENN\u001a*0\"";
        objectArray[38] = "`k\u0017fR\"<z\u00137/$6x97D2 \u007f\u00116K2[mK,W6*a\u001e>W_2{\u000b5V& cAl/";
        objectArray[39] = "$3\u0015_gP (CF\u0000Xt!CF|\"'+ES`\u0018y:LS\u0000\u001fsb^Hr\u001bh4G/";
        objectArray[40] = "\u001c\u0016?;\u0004j]\u0019.U\u0007\u000bIOl-\u001ctA\u001a,ona\u0013@+'\u0011iF\u0000iU";
        objectArray[41] = "Q'<n\u0012G\u001ee 9cD\u0019 #4\u000f-\\2u\"\u0004_X)#;c\u001d\u001e*r#\tR\\6%R";
        objectArray[42] = "('N`#;,<\u0018yD2h'\u000el>(s\"u.6\"i-Op'+iMHz\u007f9r?La) \u0015";
        objectArray[43] = "\b\u0001=b\u001eTI\u000e,\f\u00b35V\u0012=2L\u000eF\u001a4=t\\\f\u0018)e\u0005PY\n)\fI_\f\u00186~MDZ\u0001Q";
        objectArray[44] = "U\u0013W#x7[B]>E'Z\u000fd!4H\u000e\u0011B,\"9X\u0001GrE";
        objectArray[45] = "P:PUYt\n-\u0001K2bW&%IV\u000bW,V\u0012J4^7S\u00132f\u00065\tL\u0003eT&\r-[0K2\u0005\\WeY2l";
        objectArray[46] = "nU\u001fx\u000e'/Z\u000e\u0016\u01d6Fh\u0000\u0012,\u0005*+P\u000f(";
        objectArray[47] = "uK.6O\u0011qPx/(\u0007!Zi\u0007N\u000f%QR((^\"\u001ae!ZZ9L|F\u0016\u0011#]u|H\u0000*]\u0015";
        objectArray[48] = "{\u0013\u001fr\u007f\n-\u0019\u0003\u007f\u0006\tr'\u0007bg\u0013z|Fr=\u0005r\u000eBik\u001c\u0015";
        objectArray[49] = "gny{/:;\u007f}*R(1}\u001ex0\"<fo. 'b\u0001'#7';pq32y\\";
        objectArray[50] = "\u00052vFRs]l\"\u001f2h\bszB^Z_>#\u001a\r\r\u000b`~OKr]jbB2";
        objectArray[51] = "X%\u001c\nWT\u0007aBL:\u03f1cgIUZ[\u0013b\u001c\u0007D";
        objectArray[52] = "=s\u001d\u001bdX#wC\u001b[K5.\u0007ua\u001air\u007fL4D82\u0000\u001a>X5K";
        objectArray[53] = "+\u0007nI\u0010\u001bw\u0016j\u0018m\t}\u0014O\u001a\b\u000b\u0010UcH\u001d\u0001bQx\u001e\u0004f";
        objectArray[54] = "mKQ50\u00124TP:W\u000b`SK=;91\u0017\u0011ahnm\u0012G97\u00105L\u0013`W";
        objectArray[55] = "IYMY*8MB\u001b@M0\u0019K\u0012@&'t\rLUtt\u0017H\u0004@7JJ\t\n\u0010s)\u000fA\u001fSMw\u001e\b\u0006N?s\u0005^\u001f)";
        objectArray[56] = "^4{3Q)\u00003h!k=\f3O&\u000e?arct\u001b5\u0013vx\"\u0002R";
        objectArray[57] = "$\u000fT.ij%\r]~\u000bv\u0015TR${=gPIrbZ(\u0003\u0003ol(,\u0018Uv\u000b";
        objectArray[58] = "Jl\u0001c?nO9S}Uq\u001bu$y\u0019s\u0018`\u001eg)\u001eOk\u0006c2o\u0019{\u0003=U'\u0014l\u0003d$q\u0004i]\u0003l|\u0013i\u0004r:l\u00167c";
        objectArray[59] = ".stL \u0015+&&RJ\btjl]\u0011\bn\u0016wAq\u001e.)l]!\u0002\u0012";
        objectArray[60] = "7#\u001f\\\u0005\u007fm~IRb\" vTJ\u001e$&\u001b\u0014L\u0010-'eGO\u001e.\\";
        objectArray[61] = "\u001en9\u0013zE@i*\u0001@QLi\u0007\u0002+ZHo&\u0003\u000e_Lq'\u0014@P\u0019r.S;_Nm5o";
        objectArray[62] = "Q;7\\~w\u000f<$NDc\u0003<\u001e]<a\u0014+!I?wn\u007f>R86\u0015!9A*\f";
        objectArray[63] = "P\u0002k\u0005d*^Sa\u0018Y:_\u001eE\u0003=(_b\"\b<5U\u0013t\u00189k2";
        objectArray[64] = "l\b\u0002\u000f\b*-T\u0016Tm\u03a0RP\u000e\r\u001d< T\u0015[\u0004[o\u0007_F\n)k\u001c\t_m";
        objectArray[65] = "O{jL\u0017{\u001cxdOle\u001co^O\u001cyu}#R\u0014l\u0004qv@\u0014\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[66] = "e\u007f\u0016br_&/\u000bf\u0013K!?waqV<$\u00067aSbCN:vS;2\u0018*s\r\\z\u0015=sT-,\u00058-3";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Class267.m121(l, l2);
            object = f4653[n];
            try {
                if (!(object instanceof String)) break block2;
                Class267.f4653[n] = clazz = Class.forName(f4654[n]);
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
        Field field = Class267.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Class267.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = Class267.m121(l, l2);
        Object object = f4653[n];
        if (object instanceof String) {
            String string = f4654[n];
            int n2 = string.indexOf(8);
            Class clazz = Class267.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Class267.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Class267.m124(clazz3, string2, clazz2)) != null) {
                    Class267.f4653[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Class267.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Class267.f4653[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Class267.m123(156923570907546L, 0L);
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
        Method method = Class267.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Class267.m128(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00cc' || c == '\u00c7' || c == '\u00e1' || c == 'g') {
                field = Class267.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Class267.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = Class267.m130(lookup, mutableCallSite, string, methodType, l, l2);
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
            return MethodHandles.lookup().findStatic(Class267.class, "m154", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(Class267.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

