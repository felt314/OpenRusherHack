/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.MapColor
 *  net.minecraft.client.render.MapRenderer.MapTexture
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.texture.NativeImageBackedTexture
 *  net.minecraft.util.Identifier
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
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.MapColor;
import net.minecraft.client.render.MapRenderer;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraTooltips;
import org.rusherhack.Class066;
import org.rusherhack.Class253;
import org.rusherhack.client.api.Globals;

public class Class134
implements AutoCloseable {
    public NativeImage f2842;
    public long f2843;
    public /* synthetic */ ExtraTooltips f2844;
    public Identifier f2845;
    public MapRenderer.MapTexture f2846;
    public NativeImageBackedTexture f2847;
    public static long f2848;
    public static String[] f2849;
    public static String[] f2850;
    public static Map f2851;
    public static long[] f2852;
    public static Integer[] f2853;
    public static Map f2854;
    public static Object[] f2855;
    public static String[] f2856;

    /*
     * Unable to fully structure code
     */
    public void m6189(String var1_3) {
        
    }

    public Identifier m6190() {
        block0: {
            long l = f2848 ^ 0x52CEA65CF457L;
            if (this.f2845 != null) break block0;
            this.f2845 = Globals.mc.getTextureManager().registerDynamicTexture("cachedmap/", this.f2847);
        }
        return this.f2845;
    }

    public NativeImage m6191() {
        block0: {
            long l = f2848 ^ 0x11C9F531601L;
            if (this.f2842 != null || this.f2846 == null || this.f2846.texture == null) break block0;
            this.f2842 = this.f2846.texture.getImage();
        }
        return this.f2842;
    }

    public void m6192(File file) {
        
    }

    public Class134(ExtraTooltips object, MapRenderer.MapTexture mapTexture) {
    }

    public MapRenderer.MapTexture m6193() {
        long l = f2848 ^ 0x1A690764CB57L;
        return this.f2846;
    }

    @Override
    public void close() {
        long l = f2848 ^ 0x410EE5668C06L;
        if (this.f2847 != null) {
            this.f2847.close();
        }
    }

    public Class134(ExtraTooltips extraTooltips, NativeImage object) {
    }

    /*
     * Unable to fully structure code
     */
    static {
    }

    public static IllegalStateException m1393(Throwable throwable) {
        return new IllegalStateException(throwable);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x16E2;
        if (f2850[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])f2851.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f2851.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u012d", exception);
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
               byte[] byArray2 = f2849[n2].getBytes("ISO-8859-1");
               Class134.f2850[n2] = Class134.m117(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f2850[n2];
    }

    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = Class134.m153(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }
    public static int m2808(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x27AD;
        if (f2853[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f2852[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f2854.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f2854.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u012d", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Class134.f2853[n2] = n3;
        }
        return f2853[n2];
    }

    public static int m2809(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Class134.m2808(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }
    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f2856[n3] != null) {
            return n3;
        }
        Object object = f2855[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 48;
            case 1 -> 62;
            case 2 -> 33;
            case 3 -> 55;
            case 4 -> 42;
            case 5 -> 14;
            case 6 -> 45;
            case 7 -> 18;
            case 8 -> 7;
            case 9 -> 20;
            case 10 -> 50;
            case 11 -> 57;
            case 12 -> 35;
            case 13 -> 34;
            case 14 -> 26;
            case 15 -> 1;
            case 16 -> 44;
            case 17 -> 13;
            case 18 -> 58;
            case 19 -> 46;
            case 20 -> 11;
            case 21 -> 56;
            case 22 -> 38;
            case 23 -> 36;
            case 24 -> 32;
            case 25 -> 40;
            case 26 -> 23;
            case 27 -> 9;
            case 28 -> 17;
            case 29 -> 30;
            case 30 -> 21;
            case 31 -> 53;
            case 32 -> 28;
            case 33 -> 54;
            case 34 -> 27;
            case 35 -> 22;
            case 36 -> 4;
            case 37 -> 59;
            case 38 -> 2;
            case 39 -> 41;
            case 40 -> 12;
            case 41 -> 19;
            case 42 -> 31;
            case 43 -> 6;
            case 44 -> 3;
            case 45 -> 43;
            case 46 -> 51;
            case 47 -> 37;
            case 48 -> 25;
            case 49 -> 49;
            case 50 -> 39;
            case 51 -> 16;
            case 52 -> 15;
            case 53 -> 24;
            case 54 -> 63;
            case 55 -> 61;
            case 56 -> 60;
            case 57 -> 8;
            case 58 -> 10;
            case 59 -> 52;
            case 60 -> 5;
            case 61 -> 47;
            case 62 -> 0;
            default -> 29;
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
        Class134.f2856[n3] = new String(cArray);
        return n3;
    }

    public static void m122() {
        Object[] objectArray = f2855;
        f2855[0] = "\t\u001fepS\u0000\u0015\u0005g,I\u0014\u0005\u0006,\u0173";
        objectArray[1] = "\n\u000e\u0012!G/\u0001\u0001\u0003n=+\u0012\u0000\u0013!\u000b/\u0005";
        objectArray[2] = "u+\rnYgi1\u000f2Csy2D\u0246";
        objectArray[3] = Integer.TYPE;
        Class134.f2856[3] = "java/lang/Integer";
        objectArray[4] = "Q<~,5zM&|p/n]%7a(}[`zm*b_ },\"w]+iv.`P=7A(bS/wf\u0002w]+iv.`P";
        objectArray[5] = "6Ky~y'=Dh1\u0004?.Cax";
        objectArray[6] = "#x\u0013;_<?b\u0011gE(/aZvA )d\u0000;L9%$3yB+-f\u0007";
        objectArray[7] = ":\u0002mb\\g:\u0002z>Ph Iz P}'8*}\u0001";
        objectArray[8] = "2`)pnz2`>,bu(+>2b`/Zln5#";
        objectArray[9] = "z6fMxMz6q\u0011tB`}q\u000ftWg\f#S!\u0017";
        objectArray[10] = "'GUa\u0014@'GB=\u0018O=\fB#\u0018Z:}\u0013vO\u0019";
        objectArray[11] = Void.TYPE;
        Class134.f2856[11] = "java/lang/Void";
        objectArray[12] = "\t]z8\u0019B\t]md\u0015M\u0013\u0016mz\u0015X\u0014g?&E\u001a";
        objectArray[13] = Long.TYPE;
        Class134.f2856[13] = "java/lang/Long";
        objectArray[14] = "; qtFk0/`;;~\"5bx";
        objectArray[15] = ")rJ+p\u0011)r]w|\u001e39]i|\u000b4H\r6-\\${_vn't$\u000f";
        objectArray[16] = "A+bq&|A+u-*s[`u3*f\\\u0011$m";
        objectArray[17] = "/J\u001b*K\t/J\fvG\u00065\u0001\fhG\u00132p\\2\u0014P";
        objectArray[18] = "GL";
        objectArray[19] = "IfBV0\u0010IfU\n<\u001fS-U\u0014<\nT\\\u0000Lo";
        objectArray[20] = "\u0013\u0001Fzi\t\u0018\u000eW5\u0004\r\u0018\u0012c~6\u0010\u001c\u000eS~";
        objectArray[21] = "d\u00121w?<a]\u0001\u007f}0";
        objectArray[22] = Boolean.TYPE;
        Class134.f2856[22] = "java/lang/Boolean";
        objectArray[23] = "\u0004Q?c\u00124\u0018K=?\b \bHv\u0418";
        objectArray[24] = "x\u0015\u0017H^ad\u000f\u0015\u0014Dut\f^\u03a3";
        objectArray[25] = "8cI%vs$yKylg4z\u0000hho2\u007fZ%ev>?Hner\"cK%ii3dBn*K8u[ga";
        objectArray[26] = "\u0018#\u0018)\u0011W\u00049\u001au\u000bC\u0014:Qd\fP\u0012\u007f\u0013h\u0004E\u001e?\u0018)*n\u00186\u0018b\u0011";
        objectArray[27] = "ezP7\u001f4ft\b5Y;}hC\"\u001f\t{zH2P(kXN7C)joU";
        objectArray[28] = "i\u0007\u0001KEBj\tYI\u0003Mq\u0015\u0012^Eok\u0007\u0005Y\u000eX";
        objectArray[29] = ";;\u007fIt#'!}\u0015n77\"6\u0004i$1gt\ba1='\u007fIO\u001a;.";
        objectArray[30] = "Vs0g80#S;h)\u007fB]0c-%6";
        objectArray[31] = "OM\riR[@XU].y`B\u0018g\u0018PW";
        objectArray[32] = "\u000eW#\\\u0012\u007f\u0005X2\u0013sq\u000eS6I";
        objectArray[33] = "}I2'\b~{T3<3|.Q60_N\u007f\u0010lk3)}KfoW(%\u00101W";
        objectArray[34] = "u5t\u0011\"@r5u\u001c\\_xfh\u0019\u000b\n&55ugC\"l0J.\u000bgl";
        objectArray[35] = "{\u007fM\u001e *\u007f#NM\u00109ssLCGm*\"\u0016/z;v'A].=io";
        objectArray[36] = "\u007f\u0013Eud]x\u0000Vb\u000e\u054dFV_{jM7\u0012Yg>-";
        objectArray[37] = "S9~i+*T*m~A\u0203j|dg%:\u001b8b{qZ";
        objectArray[38] = "\u0016\u0017O\u001ay/\u0010\nN\u0001B#L\u0014P\u0007Bx\u0016\u0015\u001bR&yNNLj";
        objectArray[39] = ">&\u001e'&zkeHjO!8e\u00151#\u0013n)IfwDor\u00142/5+t\bfO~>x\u00116>:8dEV";
        objectArray[40] = "\rB\u001b0;[_\u0018\u001f8\\WP^\u0001'0e\u0001\u0019[}\\\\\r\u001a\u001b\u007fdP\f@\f@l\f[\u0012Y$mT\u0000Ea";
        objectArray[41] = "Ek\u000e{.3\u0014l\u001eB\u0225R\u001bu\n24;I/\u000e:";
        objectArray[42] = "Z8tA\u0016/\u0015!\u007fXl$\n zG\u0000\u0016[b#\u001flz\u0015g}\u001cS3]\"} R%\u0003,!GT8\u00027\u001a\u001f\f{\u0002.f[\u0000?_\\";
        objectArray[43] = "\u0012h\u001c\u001bx1Co\f\"\u0440P\u0012&ZX:h\u001e'\u0000O\u0005`BpR\u001aaa\u001a+\u0005\"";
        objectArray[44] = "p\b\tT\u0005\u0000!\u000f\u0019m\u0104a/\u0012\u0007\f\u001f\f|\u0007\u0013R";
        objectArray[45] = "#[+J#\u0010%F*Q\u0018\u0012pC/]t !\u0002u\u0007\u0018G}E?]q\u0015'A7:";
        objectArray[46] = "\u007fD{ei\u000b.Ck\\\u03c7j/^a,/\r)C`7";
        objectArray[47] = "*O)Q\\(&NsFcu'\u0013pQ\u0018\u0010*\u0018rK\bn+D~Mc";
        objectArray[48] = "IOtEc\u0014\u0018Hd|\u025bu\u0018Q0\u0019l\t\\]tD";
        objectArray[49] = "\u0007_\u000b$\u0005~]\u0018\u00046;e\r\u001e\u0001G\u0000h_\u0003[xI \u001a\u0003g#\u0003h\u001d\b\u00048Rv\u0003dWy]*\\\u0000V!\u0006}d";
        objectArray[50] = "?vF&\u000efe|\u001d~`b=z\u001d.\r\u000f`cA%\\0)+\u0004%`m$x\u000b-\u0018uc-\u001eB[}`vF}\u00125%vz";
        objectArray[51] = "\u0012i+h]UCn;QI4E~,/\u001aN\u0012)%- \r\u0015n+kZZBg)Q";
        objectArray[52] = "\u0010PQ?Y6\u0016MP$b4CHU(\u000e\u0006\u0012\t\u000fqbaNNE(\u000b3\u0014JMORoH\u0004\r+S7\u0013S5";
        objectArray[53] = "\u0017\u000ep<*MIMt~N\u0015GOik\"'\u0013\u000e4<N\u001c\u0014Kmr?\u001b\u0014J`\f";
        objectArray[54] = "$ \u001bCn\u0001mh^CRDr*DM9S\u001f?\u001dT2A$,P\u0014m>roPD-\u0005a\"\u0010\u001bR\u0005miG\u0018mL%,G$";
        objectArray[55] = "*+4(\u0001[.w7{1H\"'5uf\u001c{va\u0019\u000fB':j~\t_&!";
        objectArray[56] = "_d\u001em\u0014lSeDz+9A5]kPT_3Ew@*^oIq+";
        objectArray[57] = "\u000fJ\u0005\u0018\u0005&N\u001f\u001bAgg4\u001f\u0007F\u0000w\u000bVO\u0003\u0000K\u000fVN\u001a[tF\u001e\u000b\u001ag";
        objectArray[58] = "]\tSM+$\t\u000fL\u0005B8V\bS\u0018\u0015o\r_7\u001f<2]_LI\u007f,T";
        objectArray[59] = "[?\u0001\u001ct\u0012\n*\u0005\u0019\u0015\u01914hN\u001fr\u0015\u000b!\u0006Zr)\u000f!\u0007C)\u0016FiBC\u0015";
        objectArray[60] = "@6\u0014S\u0001\u001f\u001d2__s\u0001\u0017_\u0010\u0005\nT\u0018bNF\u000e\u0016";
        objectArray[61] = "\u0003vt\t)\u0012Q=%\u000f\u0010\u02cali~RjRTe\u007f\b}";
        objectArray[62] = ")BT\u0010B\\5\u0000\u0015\nrR$Bo\u000b\u001dR$D+\r\u0011D(\u0002N]\u001eY9>";
        objectArray[63] = "\u000bYn\u0017p\u0012U\u001ajU\u0014J[\u0018w@xx\u000fY,\u001e\u0014\u0012R\nv]z]K\u0001o'";
        objectArray[64] = "-S\u0016\n\u0002\u0018\u007f\t\u0012\u0002e\u0014pO\f\u001d\t&!\bTGeKvR\b\u001a\u0014\u000fpN\\z_\u001a|W\f\u000b\u001b\u001c`\u0003l@\u000e\u0010yS\u001d\u0004\b\f-3\\D\u0003A%W]\u001cX\u0016\u001d";
        objectArray[65] = "@\u0012\b\fy\u0018\u0011\u0015\u00185\u04c1y\u001e\f\fEc\u0010LV\bM\u0004";
        objectArray[66] = "8\u0004\u001fP\u0017N4D\u001b\u0002)D,A\u000bVOS\rZ\u0014VlN5_\u0010@)\u001e5K\u0010\\DM _N;";
        objectArray[67] = "\u000eGl\u000e+<_@|7=9\u0007B\u007f7fc\u0006\t*Sg;]^\u0012";
        objectArray[68] = "\u0017},$\u0007\u0000Fz<\u001d\u0412a\u0010b7,J\u001c\u0014>4\u007f";
        objectArray[69] = "J*Q\u000b0\u0003V1A\fJ1w\u0019dQJ\u000eT>B\u000e2\u0016\u0013kW";
        Object[] objectArray2 = objectArray;
        objectArray[70] = "\u0014s\u0014C\u0015\u0006Et\u0004z\u01d9g\u0015|P\u0019Q\u0018G7\u0001\u001f";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Class134.m121(l, l2);
            object = f2855[n];
            try {
                if (!(object instanceof String)) break block2;
                Class134.f2855[n] = clazz = Class.forName(f2856[n]);
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
        Field field = Class134.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Class134.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = Class134.m121(l, l2);
        Object object = f2855[n];
        if (object instanceof String) {
            String string = f2856[n];
            int n2 = string.indexOf(8);
            Class clazz = Class134.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Class134.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Class134.m124(clazz3, string2, clazz2)) != null) {
                    Class134.f2855[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Class134.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Class134.f2855[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Class134.m123(2265950952700362L, 0L);
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
        Method method = Class134.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Class134.m128(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00f6' || c == 'm' || c == '\u00d1' || c == 'g') {
                field = Class134.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Class134.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'H' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = Class134.m130(lookup, mutableCallSite, string, methodType, l, l2);
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
            throw new IllegalStateException("org/rusherhack/\u012d" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Class134.class, "m154", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(Class134.class, "m2809", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Class134.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

