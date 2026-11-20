package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NSVGgradient")
public class NSVGGradient extends Struct<NSVGGradient> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int XFORM;
    public static final int SPREAD;
    public static final int f003;
    public static final int f004;
    public static final int NSTOPS;
    public static final int PSTOPS;

    protected NSVGGradient(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NSVGGradient create(long var1, ByteBuffer var3) {
        return new NSVGGradient(var1, var3);
    }

    public NSVGGradient(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("float[6]")
    public FloatBuffer xform() {
        return nxform(this.address());
    }

    public float xform(int var1) {
        return nxform(this.address(), var1);
    }

    @NativeType("char")
    public byte spread() {
        return nspread(this.address());
    }

    public float m002() {
        return nfx(this.address());
    }

    public float m003() {
        return nfy(this.address());
    }

    public int nstops() {
        return nnstops(this.address());
    }

    @NativeType("NSVGgradientStop[1]")
    public NSVGGradientStop.Buffer pstops() {
        return npstops(this.address());
    }

    @NativeType("NSVGgradientStop")
    public NSVGGradientStop pstops(int var1) {
        return npstops(this.address(), var1);
    }

    public static NSVGGradient create(long var0) {
        return new NSVGGradient(var0, null);
    }

    
    public static NSVGGradient createSafe(long var0) {
        return var0 == 0L ? null : new NSVGGradient(var0, null);
    }

    public static NSVGGradient.Buffer create(long var0, int var2) {
        return new NSVGGradient.Buffer(var0, var2);
    }

    
    public static NSVGGradient.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NSVGGradient.Buffer(var0, var2);
    }

    public static FloatBuffer nxform(long var0) {
        return MemoryUtil.memFloatBuffer(var0 + XFORM, 6);
    }

    public static float nxform(long var0, int var2) {
        return UNSAFE.getFloat(null, var0 + XFORM + Checks.check(var2, 6) * 4L);
    }

    public static byte nspread(long var0) {
        return UNSAFE.getByte(null, var0 + SPREAD);
    }

    public static float nfx(long var0) {
        return UNSAFE.getFloat(null, var0 + f003);
    }

    public static float nfy(long var0) {
        return UNSAFE.getFloat(null, var0 + f004);
    }

    public static int nnstops(long var0) {
        return UNSAFE.getInt(null, var0 + NSTOPS);
    }

    public static NSVGGradientStop.Buffer npstops(long var0) {
        return NSVGGradientStop.create(var0 + PSTOPS, nnstops(var0));
    }

    public static NSVGGradientStop npstops(long var0, int var2) {
        return NSVGGradientStop.create(var0 + PSTOPS + Checks.check(var2, nnstops(var0)) * NSVGGradientStop.SIZEOF);
    }

    static {
        Layout var0 = __struct(
            new Member[]{__array(4, 6), __member(1), __member(4), __member(4), __member(4), __array(NSVGGradientStop.SIZEOF, NSVGGradientStop.ALIGNOF, 1)}
        );
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        XFORM = var0.offsetof(0);
        SPREAD = var0.offsetof(1);
        f003 = var0.offsetof(2);
        f004 = var0.offsetof(3);
        NSTOPS = var0.offsetof(4);
        PSTOPS = var0.offsetof(5);
    }

    public static class Buffer extends StructBuffer<NSVGGradient, NSVGGradient.Buffer> {
        private static final NSVGGradient ELEMENT_FACTORY = NSVGGradient.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NSVGGradient.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NSVGGradient.Buffer self() {
            return this;
        }

        protected NSVGGradient getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("float[6]")
        public FloatBuffer xform() {
            return NSVGGradient.nxform(this.address());
        }

        public float xform(int var1) {
            return NSVGGradient.nxform(this.address(), var1);
        }

        @NativeType("char")
        public byte spread() {
            return NSVGGradient.nspread(this.address());
        }

        public float m002() {
            return NSVGGradient.nfx(this.address());
        }

        public float m003() {
            return NSVGGradient.nfy(this.address());
        }

        public int nstops() {
            return NSVGGradient.nnstops(this.address());
        }

        @NativeType("NSVGgradientStop[1]")
        public NSVGGradientStop.Buffer pstops() {
            return NSVGGradient.npstops(this.address());
        }

        @NativeType("NSVGgradientStop")
        public NSVGGradientStop pstops(int var1) {
            return NSVGGradient.npstops(this.address(), var1);
        }
    }
}
