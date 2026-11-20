package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NSVGshape")
public class NSVGShape extends Struct<NSVGShape> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int f005;
    public static final int FILL;
    public static final int STROKE;
    public static final int OPACITY;
    public static final int STROKEWIDTH;
    public static final int STROKEDASHOFFSET;
    public static final int STROKEDASHARRAY;
    public static final int STROKEDASHCOUNT;
    public static final int STROKELINEJOIN;
    public static final int STROKELINECAP;
    public static final int MITERLIMIT;
    public static final int FILLRULE;
    public static final int FLAGS;
    public static final int BOUNDS;
    public static final int FILLGRADIENT;
    public static final int STROKEGRADIENT;
    public static final int XFORM;
    public static final int PATHS;
    public static final int NEXT;

    protected NSVGShape(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NSVGShape create(long var1, ByteBuffer var3) {
        return new NSVGShape(var1, var3);
    }

    public NSVGShape(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char[64]")
    public ByteBuffer m006() {
        return nid(this.address());
    }

    @NativeType("char[64]")
    public String idString() {
        return nidString(this.address());
    }

    @NativeType("NSVGpaint")
    public NSVGPaint fill() {
        return nfill(this.address());
    }

    @NativeType("NSVGpaint")
    public NSVGPaint stroke() {
        return nstroke(this.address());
    }

    public float opacity() {
        return nopacity(this.address());
    }

    public float strokeWidth() {
        return nstrokeWidth(this.address());
    }

    public float strokeDashOffset() {
        return nstrokeDashOffset(this.address());
    }

    @NativeType("float[8]")
    public FloatBuffer strokeDashArray() {
        return nstrokeDashArray(this.address());
    }

    public float strokeDashArray(int var1) {
        return nstrokeDashArray(this.address(), var1);
    }

    @NativeType("char")
    public byte strokeDashCount() {
        return nstrokeDashCount(this.address());
    }

    @NativeType("char")
    public byte strokeLineJoin() {
        return nstrokeLineJoin(this.address());
    }

    @NativeType("char")
    public byte strokeLineCap() {
        return nstrokeLineCap(this.address());
    }

    public float miterLimit() {
        return nmiterLimit(this.address());
    }

    @NativeType("char")
    public byte fillRule() {
        return nfillRule(this.address());
    }

    @NativeType("unsigned char")
    public byte flags() {
        return nflags(this.address());
    }

    @NativeType("float[4]")
    public FloatBuffer bounds() {
        return nbounds(this.address());
    }

    public float bounds(int var1) {
        return nbounds(this.address(), var1);
    }

    @NativeType("char[64]")
    public ByteBuffer fillGradient() {
        return nfillGradient(this.address());
    }

    @NativeType("char[64]")
    public String fillGradientString() {
        return nfillGradientString(this.address());
    }

    @NativeType("char[64]")
    public ByteBuffer strokeGradient() {
        return nstrokeGradient(this.address());
    }

    @NativeType("char[64]")
    public String strokeGradientString() {
        return nstrokeGradientString(this.address());
    }

    @NativeType("float[6]")
    public FloatBuffer xform() {
        return nxform(this.address());
    }

    public float xform(int var1) {
        return nxform(this.address(), var1);
    }

    @NativeType("NSVGpath *")
    public NSVGPath paths() {
        return npaths(this.address());
    }

    @NativeType("NSVGshape *")
    public NSVGShape next() {
        return nnext(this.address());
    }

    public static NSVGShape create(long var0) {
        return new NSVGShape(var0, null);
    }

    
    public static NSVGShape createSafe(long var0) {
        return var0 == 0L ? null : new NSVGShape(var0, null);
    }

    public static NSVGShape.Buffer create(long var0, int var2) {
        return new NSVGShape.Buffer(var0, var2);
    }

    
    public static NSVGShape.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NSVGShape.Buffer(var0, var2);
    }

    public static ByteBuffer nid(long var0) {
        return MemoryUtil.memByteBuffer(var0 + f005, 64);
    }

    public static String nidString(long var0) {
        return MemoryUtil.memASCII(var0 + f005);
    }

    public static NSVGPaint nfill(long var0) {
        return NSVGPaint.create(var0 + FILL);
    }

    public static NSVGPaint nstroke(long var0) {
        return NSVGPaint.create(var0 + STROKE);
    }

    public static float nopacity(long var0) {
        return UNSAFE.getFloat(null, var0 + OPACITY);
    }

    public static float nstrokeWidth(long var0) {
        return UNSAFE.getFloat(null, var0 + STROKEWIDTH);
    }

    public static float nstrokeDashOffset(long var0) {
        return UNSAFE.getFloat(null, var0 + STROKEDASHOFFSET);
    }

    public static FloatBuffer nstrokeDashArray(long var0) {
        return MemoryUtil.memFloatBuffer(var0 + STROKEDASHARRAY, 8);
    }

    public static float nstrokeDashArray(long var0, int var2) {
        return UNSAFE.getFloat(null, var0 + STROKEDASHARRAY + Checks.check(var2, 8) * 4L);
    }

    public static byte nstrokeDashCount(long var0) {
        return UNSAFE.getByte(null, var0 + STROKEDASHCOUNT);
    }

    public static byte nstrokeLineJoin(long var0) {
        return UNSAFE.getByte(null, var0 + STROKELINEJOIN);
    }

    public static byte nstrokeLineCap(long var0) {
        return UNSAFE.getByte(null, var0 + STROKELINECAP);
    }

    public static float nmiterLimit(long var0) {
        return UNSAFE.getFloat(null, var0 + MITERLIMIT);
    }

    public static byte nfillRule(long var0) {
        return UNSAFE.getByte(null, var0 + FILLRULE);
    }

    public static byte nflags(long var0) {
        return UNSAFE.getByte(null, var0 + FLAGS);
    }

    public static FloatBuffer nbounds(long var0) {
        return MemoryUtil.memFloatBuffer(var0 + BOUNDS, 4);
    }

    public static float nbounds(long var0, int var2) {
        return UNSAFE.getFloat(null, var0 + BOUNDS + Checks.check(var2, 4) * 4L);
    }

    public static ByteBuffer nfillGradient(long var0) {
        return MemoryUtil.memByteBuffer(var0 + FILLGRADIENT, 64);
    }

    public static String nfillGradientString(long var0) {
        return MemoryUtil.memASCII(var0 + FILLGRADIENT);
    }

    public static ByteBuffer nstrokeGradient(long var0) {
        return MemoryUtil.memByteBuffer(var0 + STROKEGRADIENT, 64);
    }

    public static String nstrokeGradientString(long var0) {
        return MemoryUtil.memASCII(var0 + STROKEGRADIENT);
    }

    public static FloatBuffer nxform(long var0) {
        return MemoryUtil.memFloatBuffer(var0 + XFORM, 6);
    }

    public static float nxform(long var0, int var2) {
        return UNSAFE.getFloat(null, var0 + XFORM + Checks.check(var2, 6) * 4L);
    }

    public static NSVGPath npaths(long var0) {
        return NSVGPath.create(MemoryUtil.memGetAddress(var0 + PATHS));
    }

    public static NSVGShape nnext(long var0) {
        return create(MemoryUtil.memGetAddress(var0 + NEXT));
    }

    static {
        Layout var0 = __struct(
            new Member[]{
                __array(1, 64),
                __member(NSVGPaint.SIZEOF, NSVGPaint.ALIGNOF),
                __member(NSVGPaint.SIZEOF, NSVGPaint.ALIGNOF),
                __member(4),
                __member(4),
                __member(4),
                __array(4, 8),
                __member(1),
                __member(1),
                __member(1),
                __member(4),
                __member(1),
                __member(1),
                __array(4, 4),
                __array(1, 64),
                __array(1, 64),
                __array(4, 6),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            }
        );
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        f005 = var0.offsetof(0);
        FILL = var0.offsetof(1);
        STROKE = var0.offsetof(2);
        OPACITY = var0.offsetof(3);
        STROKEWIDTH = var0.offsetof(4);
        STROKEDASHOFFSET = var0.offsetof(5);
        STROKEDASHARRAY = var0.offsetof(6);
        STROKEDASHCOUNT = var0.offsetof(7);
        STROKELINEJOIN = var0.offsetof(8);
        STROKELINECAP = var0.offsetof(9);
        MITERLIMIT = var0.offsetof(10);
        FILLRULE = var0.offsetof(11);
        FLAGS = var0.offsetof(12);
        BOUNDS = var0.offsetof(13);
        FILLGRADIENT = var0.offsetof(14);
        STROKEGRADIENT = var0.offsetof(15);
        XFORM = var0.offsetof(16);
        PATHS = var0.offsetof(17);
        NEXT = var0.offsetof(18);
    }

    public static class Buffer extends StructBuffer<NSVGShape, NSVGShape.Buffer> {
        private static final NSVGShape ELEMENT_FACTORY = NSVGShape.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NSVGShape.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NSVGShape.Buffer self() {
            return this;
        }

        protected NSVGShape getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char[64]")
        public ByteBuffer m006() {
            return NSVGShape.nid(this.address());
        }

        @NativeType("char[64]")
        public String idString() {
            return NSVGShape.nidString(this.address());
        }

        @NativeType("NSVGpaint")
        public NSVGPaint fill() {
            return NSVGShape.nfill(this.address());
        }

        @NativeType("NSVGpaint")
        public NSVGPaint stroke() {
            return NSVGShape.nstroke(this.address());
        }

        public float opacity() {
            return NSVGShape.nopacity(this.address());
        }

        public float strokeWidth() {
            return NSVGShape.nstrokeWidth(this.address());
        }

        public float strokeDashOffset() {
            return NSVGShape.nstrokeDashOffset(this.address());
        }

        @NativeType("float[8]")
        public FloatBuffer strokeDashArray() {
            return NSVGShape.nstrokeDashArray(this.address());
        }

        public float strokeDashArray(int var1) {
            return NSVGShape.nstrokeDashArray(this.address(), var1);
        }

        @NativeType("char")
        public byte strokeDashCount() {
            return NSVGShape.nstrokeDashCount(this.address());
        }

        @NativeType("char")
        public byte strokeLineJoin() {
            return NSVGShape.nstrokeLineJoin(this.address());
        }

        @NativeType("char")
        public byte strokeLineCap() {
            return NSVGShape.nstrokeLineCap(this.address());
        }

        public float miterLimit() {
            return NSVGShape.nmiterLimit(this.address());
        }

        @NativeType("char")
        public byte fillRule() {
            return NSVGShape.nfillRule(this.address());
        }

        @NativeType("unsigned char")
        public byte flags() {
            return NSVGShape.nflags(this.address());
        }

        @NativeType("float[4]")
        public FloatBuffer bounds() {
            return NSVGShape.nbounds(this.address());
        }

        public float bounds(int var1) {
            return NSVGShape.nbounds(this.address(), var1);
        }

        @NativeType("char[64]")
        public ByteBuffer fillGradient() {
            return NSVGShape.nfillGradient(this.address());
        }

        @NativeType("char[64]")
        public String fillGradientString() {
            return NSVGShape.nfillGradientString(this.address());
        }

        @NativeType("char[64]")
        public ByteBuffer strokeGradient() {
            return NSVGShape.nstrokeGradient(this.address());
        }

        @NativeType("char[64]")
        public String strokeGradientString() {
            return NSVGShape.nstrokeGradientString(this.address());
        }

        @NativeType("float[6]")
        public FloatBuffer xform() {
            return NSVGShape.nxform(this.address());
        }

        public float xform(int var1) {
            return NSVGShape.nxform(this.address(), var1);
        }

        @NativeType("NSVGpath *")
        public NSVGPath paths() {
            return NSVGShape.npaths(this.address());
        }

        @NativeType("NSVGshape *")
        public NSVGShape next() {
            return NSVGShape.nnext(this.address());
        }
    }
}
