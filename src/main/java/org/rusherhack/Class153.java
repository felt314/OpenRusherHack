/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager
 *  net.minecraft.client.render.BufferRenderer
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL30
 */
package org.rusherhack;

import com.mojang.blaze3d.platform.GlStateManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.render.BufferRenderer;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL30;
import org.rusherhack.Class066;
import org.rusherhack.Enum112;
import org.rusherhack.Enum168;
import org.rusherhack.Class290;
import org.rusherhack.Enum399;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.utils.BufferUtils;

import org.rusherhack.command.clear;
public class Class153
implements AutoCloseable {
    public static Class290 f3138;
    public int f3139;
    public static Class290 f3140;
    public int f3141;
    public Enum112 f3142;
    public ByteBuffer f3143;
    public int f3144;
    public static Class290 f3145;
    public int f3146;
    public int f3147;
    public static Class290 f3148;
    public ByteBuffer f3149;
    public int f3150;
    public int f3151;
    public boolean f3152;
    public static long f3153;
    public static String f3154;
    public static long[] f3155;
    public static Integer[] f3156;
    public static Map f3157;
    public static Object[] f3158;
    public static String[] f3159;

    public void m6723(int ... object) {
        
    }

    public Class153 m6724(float f, float f2, float f3) {
        long l = f3153 ^ 0x6C903C7CAE8AL;
        Class153 obf153 = this;
        int n = f3138.m9903();
        Class153 obf1532 = obf153;
        obf1532.m6737(n);
        ByteBuffer byteBuffer = obf1532.f3143.putFloat(f);
        Class153 obf1533 = obf153;
        obf153.f3143.putFloat(f2);
        obf1533.f3143.putFloat(f3);
        obf153.f3139 += n;
        return obf1533;
    }

    public void m6725() {
        
    }

    public int m6726() {
        long l = f3153 ^ 0x32C840D69612L;
        return this.f3147;
    }

    public Class153 m6727(float f, float f2) {
        long l = f3153 ^ 0x3970DA4C4B9DL;
        Class153 obf153 = this;
        int n = f3140.m9903();
        Class153 obf1532 = obf153;
        obf1532.m6737(n);
        ByteBuffer byteBuffer = obf1532.f3143.putFloat(f);
        Class153 obf1533 = obf153;
        obf153.f3143.putFloat(f2);
        obf1533.f3139 += n;
        return obf1533;
    }

    public Class153 m6728(Matrix3f object, float f, float f2, float f3) {
        return null;
    }

    public Class153(Enum112 obf112, Class290 ... obf290Array) {
    }

    public Class153 m6729(float f, float f2, float f3, float f4) {
        long l = f3153 ^ 0x1CDD40311D56L;
        float f5 = f4;
        Class153 obf153 = this;
        return obf153.m6736((int)(f * 255.0f), (int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f5 * 255.0f));
    }

    public Class153 m6730(byte by, byte by2, byte by3, byte by4) {
        long l = f3153 ^ 0xFD62F16D9D9L;
        Class153 obf153 = this;
        int n = f3148.m9903();
        Class153 obf1532 = obf153;
        obf1532.m6737(n);
        ByteBuffer byteBuffer = obf1532.f3143.put(by);
        Class153 obf1533 = obf153;
        obf153.f3143.put(by2);
        obf1533.f3143.put(by3);
        obf153.f3143.put(by4);
        obf153.f3139 += n;
        return obf1533;
    }

    public void m6731(int n) {
        block2: {
            long l = f3153 ^ 0x7F81EE4DE404L;
            int n2 = n;
            Class153 obf153 = this;
            try {
                if (obf153.f3149.remaining() >= n2) break block2;
            }
            catch (IllegalStateException illegalStateException) {
                throw Class153.m6741(illegalStateException);
            }
            Class153 obf1532 = obf153;
            n2 = obf1532.f3149.position();
            obf153.f3149 = BufferUtils.resize(obf1532.f3149, (int)((double)obf153.f3149.capacity() * 1.5));
            obf1532.f3149.position(n2);
        }
    }

    public Class153 m6732(Matrix4f object, float f, float f2, float f3) {
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
    }

    public Class153 m6733(float f, float f2, float f3) {
        long l = f3153 ^ 0xC4F432F27F2L;
        Class153 obf153 = this;
        int n = f3145.m9903();
        Class153 obf1532 = obf153;
        obf1532.m6737(n);
        ByteBuffer byteBuffer = obf1532.f3143.putFloat(f);
        Class153 obf1533 = obf153;
        obf153.f3143.putFloat(f2);
        obf1533.f3143.putFloat(f3);
        obf153.f3139 += n;
        return obf1533;
    }

    public void m6734() {
        
    }

    @Override
    public void close() {
        long l = f3153 ^ 0x287FED544706L;
        Class153 obf153 = this;
        GlStateManager._glDeleteBuffers((int)obf153.f3141);
        GlStateManager._glDeleteBuffers((int)obf153.f3144);
        GL30.glDeleteVertexArrays((int)obf153.f3147);
        BufferRenderer.resetCurrentVertexBuffer();
    }

    public int m6735() {
        Class153 obf153;
        block5: {
            block4: {
                long l = f3153 ^ 0x4F45628AADBDL;
                try {
                    try {
                        if (this.f3142 != Enum112.f2469) break block4;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw Class153.m6741(illegalStateException);
                    }
                    Class153 obf1532 = this;
                    obf153 = obf1532;
                    ++obf1532.f3151;
                    obf1532.m6737(obf1532.f3150);
                    Class153 obf1533 = this;
                    Class153 obf1534 = this;
                    obf1532.f3143.put(obf1533.f3139, obf1533.f3143, obf1534.f3139 - obf1534.f3150, this.f3150);
                    Class153 obf1535 = this;
                    this.f3139 += obf1535.f3150;
                    obf1535.f3143.position(this.f3139);
                    Class153 obf1536 = this;
                    ++obf1536.f3151;
                    obf1536.f3146 += 2;
                    break block5;
                }
                catch (IllegalStateException illegalStateException) {
                    throw Class153.m6741(illegalStateException);
                }
            }
            Class153 obf1537 = this;
            obf153 = obf1537;
            obf1537.m6723(this.f3151);
            ++obf1537.f3151;
        }
        return obf153.f3151 - 1;
    }

    public Class153 m6736(int n, int n2, int n3, int n4) {
        long l = f3153 ^ 0x27608A3C7783L;
        int n5 = n4;
        Class153 obf153 = this;
        return obf153.m6730((byte)n, (byte)n2, (byte)n3, (byte)n5);
    }

    public void m6737(int n) {
        block2: {
            long l = f3153 ^ 0xE9135E3493L;
            int n2 = n;
            Class153 obf153 = this;
            try {
                if (obf153.f3143.remaining() >= n2) break block2;
            }
            catch (IllegalStateException illegalStateException) {
                throw Class153.m6741(illegalStateException);
            }
            Class153 obf1532 = obf153;
            n2 = obf1532.f3143.position();
            obf153.f3143 = BufferUtils.resize(obf1532.f3143, (int)((double)obf153.f3143.capacity() * 1.5));
            obf1532.f3143.position(n2);
        }
    }

    public Class153 m6738(int n) {
        return null;
    }

    public void m6739() {
        
    }

    public void m6740() {
        
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x340B;
        if (f3156[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f3155[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f3157.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f3157.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u0150", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Class153.f3156[n2] = n3;
        }
        return f3156[n2];
    }

    public static int m119(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Class153.m118(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static CallSite m120(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new IllegalStateException("org/rusherhack/\u0150" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f3159[n3] != null) {
            return n3;
        }
        Object object = f3158[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 3;
            case 1 -> 22;
            case 2 -> 21;
            case 3 -> 47;
            case 4 -> 43;
            case 5 -> 8;
            case 6 -> 23;
            case 7 -> 16;
            case 8 -> 9;
            case 9 -> 19;
            case 10 -> 49;
            case 11 -> 38;
            case 12 -> 11;
            case 13 -> 62;
            case 14 -> 32;
            case 15 -> 35;
            case 16 -> 59;
            case 17 -> 44;
            case 18 -> 52;
            case 19 -> 34;
            case 20 -> 42;
            case 21 -> 53;
            case 22 -> 13;
            case 23 -> 40;
            case 24 -> 26;
            case 25 -> 51;
            case 26 -> 45;
            case 27 -> 4;
            case 28 -> 1;
            case 29 -> 30;
            case 30 -> 24;
            case 31 -> 31;
            case 32 -> 5;
            case 33 -> 41;
            case 34 -> 61;
            case 35 -> 25;
            case 36 -> 17;
            case 37 -> 14;
            case 38 -> 56;
            case 39 -> 57;
            case 40 -> 39;
            case 41 -> 6;
            case 42 -> 2;
            case 43 -> 15;
            case 44 -> 28;
            case 45 -> 55;
            case 46 -> 10;
            case 47 -> 18;
            case 48 -> 60;
            case 49 -> 27;
            case 50 -> 7;
            case 51 -> 37;
            case 52 -> 50;
            case 53 -> 29;
            case 54 -> 0;
            case 55 -> 58;
            case 56 -> 63;
            case 57 -> 54;
            case 58 -> 36;
            case 59 -> 46;
            case 60 -> 12;
            case 61 -> 20;
            case 62 -> 48;
            default -> 33;
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
        Class153.f3159[n3] = new String(cArray);
        return n3;
    }

    public static void m122() {
        Object[] objectArray = f3158;
        f3158[0] = ";V:\f%2'L8P?&7Os\u0224";
        objectArray[1] = Integer.TYPE;
        Class153.f3159[1] = "java/lang/Integer";
        objectArray[2] = "[KI]g8XE\u0011~0\"ThJZ/3C";
        objectArray[3] = "99Y\u001d\u001dt%#[A\u0007`5 \u0010\u0133";
        objectArray[4] = "\u0002(0\u00055h\u001e22Y/|\u000e1y\u017b";
        objectArray[5] = Void.TYPE;
        Class153.f3159[5] = "java/lang/Void";
        objectArray[6] = "/BX9\u0005^$MIvb^)FI9Ga1BZ=nJ&F^,B]+";
        objectArray[7] = Byte.TYPE;
        Class153.f3159[7] = "java/lang/Byte";
        objectArray[8] = Boolean.TYPE;
        Class153.f3159[8] = "java/lang/Boolean";
        objectArray[9] = "\u001cn\u0013\u0018/\u001d\u0000t\u0011D5\t\u0010wZU1\u0001\u0016r\u0000\u0018<\u0018\u001a2\u0001B4\u0004\u000026C;\u000e\u0016n!B4\u0004\u0000";
        objectArray[10] = "\u0016Hkh\u000b\u0004\nRi4\u0011\u0010\u001aQ\"\u0205";
        objectArray[11] = Long.TYPE;
        Class153.f3159[11] = "java/lang/Long";
        objectArray[12] = "5;|<],0.w<^+?'|~\u001f\u001c\u0016z)";
        objectArray[13] = "\u0013/@\u001b'\u001c\u0013/WG+\u0013\tdWY+\u0006\u000e\u0015\u0006\r|";
        objectArray[14] = "\u007f()154c2+m/ s1`\u0177";
        objectArray[15] = "PA.\u000fF&L[,S\\2\\Xg\u03f8";
        objectArray[16] = "B\b\u00043Y\u0004@\u0016MPR\u001f_\u0013\u001b.U";
        objectArray[17] = "b\u0005\u007fiI\f`\u001b6\u0011F\u0000y\u0018jtE";
        objectArray[18] = Float.TYPE;
        Class153.f3159[18] = "java/lang/Float";
        objectArray[19] = "K]\r1AAWG\u000fm[UGDD|_]AA\u001e1RDM\u0001\u0018z]PA]DMVZ@J\u0018\\\\ZPJ\u0012k";
        objectArray[20] = "ZA\u0005V\u000e~QN\u0014\u0019sfBI\u001dP";
        objectArray[21] = "UH\"\u0000p#\\F!I3.ZF5K.(\u0018W#Oi*YU\"\u0000Z eS.Zx\u0001WI.Ix>";
        objectArray[22] = ",S";
        objectArray[23] = "4\t_|p>6\u0017\u0016\u001f{%)\u0012@f|";
        objectArray[24] = "${\u007fl\u001d_&e6\u0014\u0012S?fjv\u0011";
        objectArray[25] = "\u000b~\r\u0013\u001cC\u0000q\u001c\\}M\u000bz\u0018\u0006";
        objectArray[26] = "tLu\u0019q\"1S\u007f\u0006\u001ed0INA\"\u007f?Q2\u001aa'w5w\u0005%y\"\u000b2\u001a/fM";
        objectArray[27] = "\u0007\u001b5zvYB\u0004?e\u0019\u001fC\u001eOyeg\u0007_r&!]F_hu\u0019^GYkp'\u001bXSt\u001f";
        objectArray[28] = "a\\HeL\u000e+AHg6R[\u0003TzP\u0004+IIzR";
        objectArray[29] = "Kj\t\u0015rf\u0017dINM\u029aq(N\u0015?`\rs\rMw\u0004L)\u0011\u0004)x\u0017jILM9Mv\u0000\u00121b\u000e.Hvp8\u0012g\u0016\n+{J/rL2\u007f\u0012*\u0010\u0010<?I\u0015";
        objectArray[30] = "I \twr\t\u0015.I,M\u038asfOhtSI'Or'";
        objectArray[31] = "@)\u001bc\u0001{\n4\u001ba{\u027czu_yB3@4_c\u0011";
        objectArray[32] = "_ih'V\u001a\u00026`of\u0423`j>j_]Z+>p\fe";
        objectArray[33] = ">\b\u0014o\u0001|b\u0006T4>\u04e0\u0004NRp\u0007&>\u000fRjT\u001e?\u0015\u001e|_/n\b^m>";
        objectArray[34] = "Ig3\u0005r'\u0015is^M,s$\"\u0006(t\u001a%w\f#EOr(\u0003|,N'\"\bM";
        objectArray[35] = "['\u007f\u001d=0\u00153cC\f \u000f\u0019tKF2\u00058tWwORke\u00144u\u0013k\u007fG\f";
        objectArray[36] = "2kRV*Y.aU\u000b\u001bIYkKWrI4pI\u0012v";
        objectArray[37] = "A\u0001\t\u0003\u0000\u0010\u000f\u0015\u0015]1\u0000\u0015:\u000eU]%\f\u001e\u0001^KoHM\u0013\n\tU\tM\tY1VL\fV\u000b\u000b\u0017L\u0016\u00053\n\r\u0000\u0000\u000e\u0002[\u0010@\u0011o";
        objectArray[38] = "3+\u0017)>do%Wr\u0001\u01a8\tm\u0015qdi7(\n{{";
        objectArray[39] = "AW#\u001a\u0012\u007f\u0004H)\u0005}*\u0011Vq\u0014\u001c=\t.!B\u0001x@\u0014`B\u001b+x";
        objectArray[40] = "Yj}m87\u0013w}oB\u04e3c69w{\u007fYw9m(GZ2x2z}\u001b2baB";
        objectArray[41] = ">5\\\u0013*8+dG\u0015\u0016&+lD\fx=+`\"\u0018k0)}RO|*n\u0005M\n|\")u\u001a\u001dfeQ";
        objectArray[42] = "9pA\u0013|\"d/I[L\u03f2\u0006s\u0017^ue<2\u0017D&]90OR!$drUILd;6\u0013\u001av%;,@\"w?w:K\u0013&\"7+*";
        objectArray[43] = "nC<dEQ2M|?z\u0531T\u0005z{C\u000bnDza\u0010";
        objectArray[44] = ">o\u001c8?\u0001ba\\c\u0000.\u0004)\u001e`e\f:l\u0001jz";
        objectArray[45] = "9t\u0004\ni\rezDQV\u0478\u00032B\u0015oW9sB\u000f<";
        objectArray[46] = "\u00078\u0014eu\u0012P/\u000e\"\r\u0013h.\u001a%d\u0013\u00055\u0018``";
        objectArray[47] = "\r\fvh\u0018<Q\u000263'\u02447J0w\u001ef\r\u000b0mM";
        objectArray[48] = "\u0002PuM)^LDi\u0013\u0018NVn~\u001bFLH]~\rQ[HHb\u0006\u0018\u0018\u000f]*E\"Y\u000fGy}";
        objectArray[49] = "HK't g\u0006_;*\u0011w\u001cp \"}F\u0015@=)aQ\u0002@(5\u0011!EFx|+`E\\+D*z\tJ u{gI[A";
        objectArray[50] = "P|RcYX\u0015cX|6\u0002\b`\bz6_TyP>\f\u001eTc\u0003\u0006\u000f\u001fR`\u00068J\u0000X\u007fi";
        objectArray[51] = "b,\u0017]\u001d\u0017\u007f<\u001fR\"1`2k\u0001F\u000bs;m\u0011L\bb,\\l\u001b[so\u001fVZ[i<'W@\u0017\u007f7\u0016\u0006]WnV";
        objectArray[52] = "[\u0001\u0014@vl\u0007\u000fT\u001bI\u04c9aAUHx>\u001e\u001c\n@0";
        objectArray[53] = "F(**}f\u00167pc\u0005k/>3u<q@n,/u";
        objectArray[54] = "1ht25$mf4i\n\u03ba\u000b-j(l<{gw(n";
        objectArray[55] = "45_3\"'\"?Xn\u00134_5F2z72.Dw~";
        objectArray[56] = "UB\u000eb\u0007u\u0019\u000e_o\u007f\u0006d\u0001\u0012}\u000e4]M^,\u0003";
        objectArray[57] = "s5)Vv]?yx[\u000e\bBv5I\u007f\u001c{:y\u0018r";
        objectArray[58] = "H\u0011A\"_^\u0014\u001f\u0001y`\u027crSK,\tDL\u0001Uz\u0006";
        objectArray[59] = "]=z\u000b_.\u0004()\u001e/7\u00194/\u0013B\\Zd:V\u0017f\u001bd \u0005/e\u001ab#\u0000\u0011 \u0005h<o";
        objectArray[60] = "F?T9]\u000e\u001a1\u0014bb\u0203|y\u0012&[TF8\u0012<\b";
        objectArray[61] = "8\u0011N\u000b?\u0017}\u000eD\u0014PQf\u0013\u0014\u00121NghLS,\u00109R\rS6C\u0001";
        objectArray[62] = "\u000bF\u00029aX\u0007\u0007\u0003\u0001\u057e?YG\u00018&\u0005\u0018G\u001bk\u001e";
        objectArray[63] = "Hl>\"-TD-?\u001a\u020b3\u001am=#j\t[m'pR";
        objectArray[64] = ",\u0014X#\u0010%u\u0001\u000b6`-\u007f\u000b\u00055\rW+\t_\"\u000fin\u0016U=`n/\f]\u007fZ//\u0016\u000eGY.)\u0015\u000by\u001c1#\nd";
        objectArray[65] = "W>G'/k\u000b0\u0007|\u0010Rm~\u0006/!9\u0012#Y'i";
        objectArray[66] = "X>x$*U\u000408\u007f\u0015\u05bdbza6eVS+|vt7";
        objectArray[67] = "[\u0017/\tr*_BvC\r=KAq\bc&KM\u0017\u0018f<\b\u0019v\u000el;U(|\u0018px\u0000Ij\u0012w%1";
        objectArray[68] = "q*k\u0004\t\u0010-$+_6(Kj*\f\u0007B47u\u0004O";
        objectArray[69] = "\u0000:A\u001dmd\\4\u0001FR\u050c:+EO8>^'Y\u00135\u0006\u0001'K\u000e37P:\u000b\u001fR";
        objectArray[70] = "r\rd~^\f%\u001a~9&\u000e\u001d\u001bj>O\rp\u0000h{K";
        objectArray[71] = "\u0002<\u0019S\u0007~^2Y\b8\u00da8x\u0000AH}\t)\u001d\u0001Y\u001c";
        objectArray[72] = ">\fNK8\\b\u0002\u000e\u0010\u0007\u0448\u0004J\bT>\u0006>\u000b\bNm>=NI\u0011?\u0004|NSB\u0007\u00079\u000f\f\u0010=F9\u0015_(>\u0003xJ\r\u0012\u007f\u0003b\u00195\u0012xEgLWNv\u0005<s";
        objectArray[73] = "kN7\u001b!P}D0F\u0010A\u0000N.\u001ay@mU,_}";
        objectArray[74] = "5s\txWr=x\\:kjij\u0002`\u0007X8-^<U\u000f?t\u0013w\n>niSfk";
        objectArray[75] = "C\u007fqI2U\rkm\u0017\u0003E\u0017Bz\u001dnV\u001ePz\u0003\u007fG\u0003Gm\u0003j[\b\u000e.D\u007f\u0013K4oDe@s5u\bsKBdhHb*";
        objectArray[76] = "\bE\u0001KQvMZ\u000bT>2\\YSOX)WS:\u0017\u00034\b\u0004\u0000V\u0003.[<";
        objectArray[77] = "\u0001\u0003\u0001\u007f\u0011\u001fK\u001e\u0001}k\u0112;_EeRW\u0001\u001eE\u007f\u0001";
        objectArray[78] = "E`hoTB\u0000\u007fbp;\u0004\u0001e\u001dn\\\u0015\u0000\u00198n\u0003\u0015\rt#lF\u0011| *1^\u0013Be5;A|";
        objectArray[79] = "mQ\u001b_kr(N\u0011@\u00044)T \u000390m\u0010\u001aB9*>(\u0019C?);\u0016\\\\56T\u0011\u001dF=tnP\u001d\\nLm\u0015\\\u0003<v,\u0015FP\u0004u-\u0013EU:02\u0019Z:";
        objectArray[80] = "q?\by\u0013/4 \u0002f|z,+Zf|(1}VsBm.wI\u001c";
        objectArray[81] = "\u0013+~p(I]?b.\u0019YG\u0016b)f{G7}-\u007fJXZ!}e\u000f\u001b``}\u007f\\#c%< \u000e\u0019\"%&s6\u001agdy!\f[g~*\u0019\tY?h-`T\u001b%s@\"TR*yqsI\u0012;\u0018";
        objectArray[82] = "`j\u001cGNN.~\u0000\u0019\u007f^4Q\u0007\u0019\u0011\\*W\u0013\u000b\u00161i&\u0006NG\u000b(&\u001c\u001d\u007f\b) \u001f\u0018AM6*\u0000wF\f,\"BM\u0007\f6qzL\u001d@ zK\u001d\u0000\u00001\u001b";
        objectArray[83] = "1\u0015\u001ceR 6H\u0000hbg]\u001d\u001cn\u0012rf\n\u001d|\u001eK0\u001d\u0018w[p'\u001c\n{b";
        objectArray[84] = "\u0000PrG\u0010DEOxX\u007f\u0014]H1\"F\u0003\u0002L&\u001c\u0003\u001c\bSI";
        objectArray[85] = "{-R\u0006\u0017Y+2\bOo\\\u0012;KYVN}kT\u0003\u001f";
        objectArray[86] = "\u0005Gj.M]YI*ur\u0435?\u0001,1K\u0007\u0005@,+\u0018?\u0004Z`=\u0013\u000eUG ,r";
        objectArray[87] = "\u001fpTH\u0011>C~\u0014\u0013.\u01bb%dK\u0013G-H\u007fIVC\\Nk\u0017B_1UiRF.7A7FZC,CrB+\u0014#^l\u0010IH-\u001e7/";
        objectArray[88] = "Ofzr \u0016\u0018q`5X\u0016 pt21\u0017Mkvw5";
        objectArray[89] = "[y2u\u0017\u0015\u0007wr.(\u016ba?tj\u0011O[~tpB";
        objectArray[90] = ";pS<\t\u000eg~\u0013g6\u0156\u00010\u00124\u0007\\~mM<O";
        objectArray[91] = "L\u000f'\r\u0006\u0017\t\u0010-\u0012iQ\u0012\r}\u0014\bN\u0013v%U\u0015\u0010MLdU\u000fCuOeS\fFK\nzY\u0013)";
        objectArray[92] = ";\u001b|i+{g\u0015<2\u0014\u0591\u0001]:v-!;\u001c:l~";
        objectArray[93] = "m\n-X\rj=\u0015w\u0011u)\u0004\u001c4\u0007L}kL+]\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[94] = "eagF\u0004o9o'\u001d;\u048a_ux\u001dR|2nzXV\r4z$LJ`/xaH;f;&uTV}9cq%\u0001r$}#G]|d&\u001c";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Class153.m121(l, l2);
            object = f3158[n];
            try {
                if (!(object instanceof String)) break block2;
                Class153.f3158[n] = clazz = Class.forName(f3159[n]);
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
        Field field = Class153.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Class153.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = Class153.m121(l, l2);
        Object object = f3158[n];
        if (object instanceof String) {
            String string = f3159[n];
            int n2 = string.indexOf(8);
            Class clazz = Class153.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Class153.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Class153.m124(clazz3, string2, clazz2)) != null) {
                    Class153.f3158[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Class153.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Class153.f3158[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Class153.m123(1790333300419927L, 0L);
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
        Method method = Class153.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Class153.m128(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00d0' || c == '\u00d9' || c == '\u00d1' || c == 'h') {
                field = Class153.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Class153.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = Class153.m130(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        try {
            try {
               return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
            } catch (Throwable throwable) {
               throw new IllegalStateException(throwable);
            }
        } catch (Throwable throwable) {
            throw new IllegalStateException(throwable);
        }
    }
    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Class153.class, "m119", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Class153.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

