/*
 * Decompiled with CFR 0.152.
 */
package org.rusherhack.core.utils;

import java.awt.Color;
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
import org.rusherhack.Class286;
import org.rusherhack.Class290;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

public class ColorUtils {
    public static HashMap<String[], Color> COLOR_MAP;
    public static String f1716;
    public static long f1717;
    public static long[] f1718;
    public static Integer[] f1719;
    public static Map f1720;
    public static Object[] f1721;
    public static String[] f1722;

    public static int interpolateColor(int n, int n2, double d) {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int getGradientRGB(Color[] colorArray, long l, float f) {
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
    }

    public static int getHex(int n, int n2, int n3, int n4) {
        long l = f1717 ^ 0x542C45724950L;
        int n5 = n;
        n = n4;
        n4 = n5;
        return n << 24 | n4 << 16 | n2 << 8 | n3;
    }

    public static float[] getRGBA(int n) {
        long l = f1717 ^ 0x29D1D20D8197L;
        int n2 = n;
        float f = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n2 & 0xFF) / 255.0f;
        float[] fArray = new float[4];
        fArray[0] = f2;
        fArray[1] = f3;
        fArray[2] = f4;
        fArray[3] = f;
        return fArray;
    }

    /*
     * Unable to fully structure code
     */
    public static Color parseColor(String var0) {
        return null;
    }

    public static Color transparency(Color color, int n) {
        long l = f1717 ^ 0x45CFE46A6147L;
        int n2 = n;
        Color color2 = color;
        return new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), n2);
    }

    public static Color getRainbow(long l, float f, float f2, float f3) {
        long l2 = f1717 ^ 0x527198072ABFL;
        float f4 = f;
        f = f3;
        f3 = f4;
        return new Color(ColorUtils.getRainbowRGB(l, f3, f2, f));
    }

    public static int brightness(int n, float f) {
        long l = f1717 ^ 0x7E766B17BD3FL;
        int n2 = n;
        float[] fArray = Color.RGBtoHSB(n2 >> 16 & 0xFF, n2 >> 8 & 0xFF, n2 & 0xFF, null);
        return Color.HSBtoRGB(fArray[0], fArray[1], fArray[2] * f);
    }

    public static int transparency(int n, int n2) {
        long l = f1717 ^ 0x59C7DE8CBFB7L;
        int n3 = n;
        n = n2;
        n2 = n3;
        return n << 24 | (n2 >> 16 & 0xFF) << 16 | (n2 >> 8 & 0xFF) << 8 | n2 & 0xFF;
    }

    public static int blendColors(int[] nArray, float f) {
        long l = f1717 ^ 0x2D832B591130L;
        int[] nArray2 = nArray;
        int n = (int)(f *= (float)nArray2.length);
        f -= (float)n;
        int n2 = nArray2[Math.min(n, nArray2.length - 1)];
        n = nArray2[(n + 1) % nArray2.length];
        return ColorUtils.interpolateColor(n2, n, f);
    }

    public static Color getGradient(Color[] colorArray, long l, float f) {
        int n;
        long l2 = f1717 ^ 0x3088280F5CA6L;
        Color[] colorArray2 = colorArray;
        int[] nArray = new int[colorArray2.length];
        int n2 = n = 0;
        try {
            while (n2 < colorArray2.length) {
                int n3 = n++;
                nArray[n3] = colorArray2[n3].getRGB();
                n2 = n;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw ColorUtils.a((NumberFormatException)numberFormatException);
        }
        return new Color(ColorUtils.getGradientRGB(nArray, l, f));
    }

    public static int getGradientRGB(int[] nArray, long l, float f) {
        long l2 = f1717 ^ 0x736A4368CFE3L;
        float f2 = f;
        int[] nArray2 = nArray;
        l = System.currentTimeMillis() + l;
        f2 = 360.0f / (0.05f * f2);
        f2 = (float)(l % (long)((int)f2)) / f2 * (float)nArray2.length;
        int n = (int)f2;
        int n2 = nArray2[n];
        int n3 = nArray2[(n + 1) % nArray2.length];
        return ColorUtils.interpolateColor(n2, n3, f2 -= (float)n);
    }

    public static int getRainbowRGB(long l, float f, float f2, float f3) {
        long l2 = f1717 ^ 0x20695A3CC750L;
        float f4 = f;
        f = f3;
        f3 = f4;
        long l3 = System.currentTimeMillis() + l;
        f3 = 360.0f / (0.05f * f3);
        return Color.HSBtoRGB((float)(l3 % (long)((int)f3)) / f3, f2, f);
    }

    public static Color transparency(Color color, float f) {
        long l = f1717 ^ 0x5820B8C05393L;
        float f2 = f;
        Color color2 = color;
        return new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), (int)(f2 * 255.0f));
    }

    public static int transparency(int n, float f) {
        long l = f1717 ^ 0x310BD8A0195L;
        float f2 = f;
        int n2 = n;
        return ColorUtils.transparency(n2, (int)(f2 * 255.0f));
    }

    public static void m4167(String string) {
        f1716 = string;
    }

    public static String m4168() {
        return f1716;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4602;
        if (f1719[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f1718[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f1720.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f1720.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/core/utils/ColorUtils", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ColorUtils.f1719[n2] = n3;
        }
        return f1719[n2];
    }

    public static int m119(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ColorUtils.m118(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }
    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f1722[n3] != null) {
            return n3;
        }
        Object object = f1721[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 51;
            case 2 -> 22;
            case 3 -> 57;
            case 4 -> 56;
            case 5 -> 47;
            case 6 -> 53;
            case 7 -> 13;
            case 8 -> 20;
            case 9 -> 37;
            case 10 -> 43;
            case 11 -> 28;
            case 12 -> 39;
            case 13 -> 15;
            case 14 -> 32;
            case 15 -> 52;
            case 16 -> 31;
            case 17 -> 10;
            case 18 -> 6;
            case 19 -> 14;
            case 20 -> 23;
            case 21 -> 9;
            case 22 -> 45;
            case 23 -> 12;
            case 24 -> 21;
            case 25 -> 35;
            case 26 -> 46;
            case 27 -> 36;
            case 28 -> 26;
            case 29 -> 42;
            case 30 -> 11;
            case 31 -> 48;
            case 32 -> 61;
            case 33 -> 62;
            case 34 -> 59;
            case 35 -> 63;
            case 36 -> 38;
            case 37 -> 1;
            case 38 -> 34;
            case 39 -> 7;
            case 40 -> 29;
            case 41 -> 18;
            case 42 -> 19;
            case 43 -> 54;
            case 44 -> 60;
            case 45 -> 2;
            case 46 -> 4;
            case 47 -> 24;
            case 48 -> 5;
            case 49 -> 41;
            case 50 -> 55;
            case 51 -> 17;
            case 52 -> 0;
            case 53 -> 8;
            case 54 -> 30;
            case 55 -> 40;
            case 56 -> 58;
            case 57 -> 16;
            case 58 -> 50;
            case 59 -> 3;
            case 60 -> 44;
            case 61 -> 49;
            case 62 -> 33;
            default -> 25;
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
        ColorUtils.f1722[n3] = new String(cArray);
        return n3;
    }

    public static void m122() {
        Object[] objectArray = f1721;
        f1721[0] = "j\\\u0019tCqvF\u001b(YefEP9^v`\u0000\u000b.Xhv\u0000=5]kw{\n3]w";
        objectArray[1] = "\fi\u0010V#Y\u0007f\u0001\u0019C@\u000bj\u0003EKZ\u0014e\u0007CHM\u0005m\u0016CdZ\b";
        objectArray[2] = "a!\u001c>[}};\u001ebAim8UsFzk}\bu]|g=\u001c>zmz'\u0012~N";
        objectArray[3] = "b?zy{S\u0017\u001fqvj\u001cj\u0007bqcU\u0002";
        objectArray[4] = Integer.TYPE;
        ColorUtils.f1722[4] = "java/lang/Integer";
        objectArray[5] = "G!";
        objectArray[6] = "8C,\u0011e5Mc'\u001etz0{4\u0019}3X";
        objectArray[7] = Void.TYPE;
        ColorUtils.f1722[7] = "java/lang/Void";
        objectArray[8] = "z2 i >f(\"5:*v+i$=9pn23;'fn\u0013.?.g";
        objectArray[9] = "gAT,\u0000#NxH6\u0002\u007fTlX5InS\u007f^p\u0014hHyR0\u0000#ohO*\u000ec[6";
        objectArray[10] = "\u0006~\u0018\u0006\u0004P\rq\tIg]\u0018w";
        objectArray[11] = Double.TYPE;
        ColorUtils.f1722[11] = "java/lang/Double";
        objectArray[12] = Long.TYPE;
        ColorUtils.f1722[12] = "java/lang/Long";
        objectArray[13] = "g>";
        objectArray[14] = Float.TYPE;
        ColorUtils.f1722[14] = "java/lang/Float";
        objectArray[15] = "9pD~8m$e\u001c\\y`<c";
        objectArray[16] = "\u0013\u001f";
        objectArray[17] = "3;";
        objectArray[18] = "\u001eP\u0014u\\\u0018\u0000X\u000e:;\u0019\u0011C\u0003`\u001d\u001f";
        objectArray[19] = "nFdwoJeIu8\u000eDnBqb";
        objectArray[20] = "Q\u0010\u001cxM\u007fZ\u001f\r7/|U\u0016";
        objectArray[21] = "_^_,+}TQNcVeGVG*";
        objectArray[22] = "gP\u0006\u000f-[yX\u001c@PKy";
        objectArray[23] = "\u0012u9\\\u0003\u0002\f}#\u0013e\u0016\u000b|\u0002\\]";
        objectArray[24] = Boolean.TYPE;
        ColorUtils.f1722[24] = "java/lang/Boolean";
        objectArray[25] = "O\":\u0012ZmD-+]'xV7)\u001e";
        objectArray[26] = "bCV<,\t~YT`6\u001dnZ\u001f\u0251";
        objectArray[27] = "e\u00133P \by\t1\f:\u001ci\nz\u0240";
        objectArray[28] = "st\u001e..l w\u00061G6ug\u0005V+>`}\u000b:$3g+y";
        objectArray[29] = ".,Y;H\t:,\u001b`#>\u001d\u0018o\u001c#\u0018>.C1[\f>l\u0018";
        objectArray[30] = "8B.3.\u00062\u00122wI\n*\u001e3d5\f,s\"n.\u0013?Oqm6\fV";
        objectArray[31] = "\u0018,\u0019(\u000f-Xk\u0006)f5Ftz#\\)M-\u0010|\u00036\u0017\u0012A\"\u001f:\u0018x\u001e}\u0000`')@a\foMv\u001f~VP";
        objectArray[32] = "\u001e1\u0006QL5C=_\u0019vd\u0015$b@\u0012x\u001eX\u0007\u0013\u000foL2XL\u00105s";
        objectArray[33] = "v\"VJ|\f{aG%y\u0006`Q]Lz\nqx[\u007fY!\u001c/\u0017Zv\u0017}p\u001eE}k,nC_u[,s[F\u0016ZgaFClSpo\u0018%-Qet\u0018Or\u000ez.'";
        objectArray[34] = "\u0010o\u001953K\u0004o[nXk8P!T1J\u0002w\t,%J@,";
        objectArray[35] = "@|H,|1T|\nw\u0017\u0002xLuM~0RdX5j0\u0010?";
        objectArray[36] = "H\b\u0011\u0006j\"EK\u0000io(^n\t\bf/EK:&JE\u0012D\u0004\u0013cu\u0012Y\u001c\n\u0000tYK\u0001\u000fz}NE_i1>]U\u0006\u00138)S\u000b`X{:CR\u001aQl4\u001d4[Sy/\u001d^\u0004\ffu\"";
        objectArray[37] = "\u001fgJBy\u001b\u000bg\b\u0019\u0012#-TMDH,<\u001e\u0000Xm\u0002\u0010d\tOc\\v/J\\s\u0005\f&]R-cGeNBt\u0019Nr@\u001c\u0012XLg[\u001cx\u0007\u0013x\u0001#";
        objectArray[38] = "W\u000f\u0003*\u0006\u001fN\rY5{\u04916\u0007\u00033\u0019AX\u0004P<G$[\t\u001d,\u001eJXZ\u0012r{";
        objectArray[39] = "w<\t\u00069\u001fc<K]R=S\tr\u000e+\u001c\u007f.\n\u001a+^$";
        objectArray[40] = "\u00061:\u0006Jj\u00121x]!V.\u0007\u0001;v]5\u0001\u0010gHk\u0014)*\u001f\\kVr";
        objectArray[41] = "y\u0018\f\u001f>xm\u0018NDUJT(<=Uii\u001a\u0016\u0015-}iXM";
        objectArray[42] = "\u0019b<s-,\rb~(F\u00189A\u0004E\t\u000e9JG{?/\u0011p?o?mJ";
        objectArray[43] = "JQOV2B^Q\r\rYUNT~S.W#\u0013\u000eN3\u0005ILQQi:";
        objectArray[44] = ".G\u0007\u0012Nq\"GS\u0016>\u014e\u0013\u001fSBLfwEG\u0015T\u0000";
        objectArray[45] = "\f3$*\u001f7\u0001p5E\u00146\u001ab/=\u00124\u000fs8\u000e\u00124\u0001uU~O)\f0?!\u00106V\u000fn\u007f\f:Ye1 \u0013`f03)\u00187\bk5?KP]5,/J:\u0002j3uu";
        objectArray[46] = "\u0012w+77\u0015\u0011$$iR\u0016\u0006i?1):\u0010r1/?0\u0016o;U?\u0018\u0002v3;<K\r(V:\"\u001b\u0002/1l,@\u0007\u0014";
        objectArray[47] = "}.9Ei\u000e=i&D\u0000\t%m<\u0019\u0000L$|7\u0012n\u0017\"jdu0\u0003&j9E0\u001e>sZ";
        objectArray[48] = "&\u000fP\u001c\u001dA2\u000f\u0012GvV\"\nq2<9tLR\u0017IS+\u0013MMv";
        objectArray[49] = "\u000fT8N\u0004K\u001bTz\u0015ol&l\u001fboZ\u001fV\"D\u0017N\u001f\u0014y";
        objectArray[50] = "\fv)f\u0001\u001c\u000158\t\u0002{_tgwS\u001c\u0002w%ikBXu&1\f\u001f[78\t";
        objectArray[51] = "E:<8%@\u00186ep\u001f\u001cE8a,rpE0{\"z\u001eFct|\u001f\u001dAi~z/@M06@";
        objectArray[52] = "tH_f@-)O\u001f7\"\u0577M\f\u000e4M(v_\u0002r_\u0016";
        objectArray[53] = ",X_D\u007f\u0002!\u001bN+\u0380e+\u0007SIp\u000b(T\\\u0017\u0015";
        objectArray[54] = ":0\u0004o(F.0F4Cd\u001c\u0003\u0003i\u0003e\u0019ID4:Tl#\u001bk%\u000eSrEw)\u00019-\u001ahs>hs\u0006d|T7,\u0019>CT(u\u00180>F-)\u0019\u000e)Eo.As;@3/\u007f";
        objectArray[55] = "t.{VL[u.nV<Xw \u001c\u0006ROp.p\t_H&\\p\u0004D]h0\u007f\tC\u000b\u001a";
        objectArray[56] = "XD\u0012}\u0018zLDP&sMkt8\u001c\u001a{J\\\u0002d\u000e{\b\u0007";
        objectArray[57] = "\u00125%\t3%\u001fv4f%8\u0011o/\u001e08\u0015o?\u0017YyBp>Y3&\u001dodfbx\u0001ck\f='\u001e9T]c;\u00126>\u0002<$H\t";
        objectArray[58] = "\u0010\u0006[Oh[\u0011\u0006NO\u0018T\u0013\u0005g\u001ed7\u0010E[M\u007fZ\u001a\u0015G\t\u0018";
        objectArray[59] = "'\u001fgT2\u000f*\\v;\u0013/\tdLl\u001d!\u0015#xI?T=OyI*T";
        objectArray[60] = "sd$0{\u0017gdfk\u0010\u0000wa\u0010+}\u0002|\u001ddki\u0005%w;4v_\u001a";
        objectArray[61] = "G>\u001e\"')S>\\yL\u0014g\b(\u0005\u0010\u0018..\u001c8-:V:\u001czv";
        objectArray[62] = "jWhHo%~W*\u0013\u0004\u0017Gs^)m$xOxQy$:\u0014";
        objectArray[63] = "l\u0002\u0001. GaA\u0010A%Mzd?\u000b\u0003 =\u0004\t+uJb[\u0016qJJ}\u0002\u0017\u007f7Xx^\u0016A";
        objectArray[64] = "fmKB('rm\t\u0019C0bhjN/_4.II|5kqV\u0013C";
        objectArray[65] = "'u\u0014\u001c\u0010<3uVG{\u0003\u0014E)26D'u\u0014\u001c\u0010<3uVG";
        objectArray[66] = "0La-wd$L#v\u001cM\u0014q^\u000bC\u001c0La-wd$L#v";
        objectArray[67] = "\u0018\u0002\u0018\u0000\u0002 E\u0005XQ`\u0364!FIR\u000f%\u001a\u0015E\u0014\u001d\u001b\u001cF\u001a\u0005YkX\u0015_S`";
        objectArray[68] = "\"\u0018{1!vq\u001bc.H* \u0000Z$86I\u0014l)5q.Bbr0J";
        objectArray[69] = "h`,&\u0016#5a<a*\u021b\t}.`H}g~}o\u0016\u0018ds0\u007fOvg ?!*";
        objectArray[70] = ";g1Ro2:g$R\u001f&(iV\u0002q&?g:\r|!i\u0015:\u0000g4'y5\r`bUy8\u0016u,9v5\u0011#^";
        objectArray[71] = "dWb\n;Qi\u0014se\u05da6c\bn\u00074X`[aYQ\u000b2S|\\!Oa\u0016*e";
        Object[] objectArray2 = objectArray;
        objectArray[72] = "\u001a%d\u001ft(\u0013&9\u001c\n:\u0007>}\u001el-&%b\u001eO0\u001e f\b\na\n }\u0010:a\u00178ds";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ColorUtils.m121(l, l2);
            object = f1721[n];
            try {
                if (!(object instanceof String)) break block2;
                ColorUtils.f1721[n] = clazz = Class.forName(f1722[n]);
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
        Field field = ColorUtils.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ColorUtils.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = ColorUtils.m121(l, l2);
        Object object = f1721[n];
        if (object instanceof String) {
            String string = f1722[n];
            int n2 = string.indexOf(8);
            Class clazz = ColorUtils.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ColorUtils.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ColorUtils.m124(clazz3, string2, clazz2)) != null) {
                    ColorUtils.f1721[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ColorUtils.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ColorUtils.f1721[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ColorUtils.m123(1364581273120708L, 0L);
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
        Method method = ColorUtils.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ColorUtils.m128(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00ff' || c == '\u00ef' || c == '\u00c8' || c == '\u00c0') {
                field = ColorUtils.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ff' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ColorUtils.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = ColorUtils.m130(lookup, mutableCallSite, string, methodType, l, l2);
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
            return MethodHandles.lookup().findStatic(ColorUtils.class, "m119", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ColorUtils.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }
}

