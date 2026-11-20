package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NVGpaint")
public class NVGPaint extends Struct<NVGPaint> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int XFORM;
    public static final int EXTENT;
    public static final int RADIUS;
    public static final int FEATHER;
    public static final int INNERCOLOR;
    public static final int OUTERCOLOR;
    public static final int IMAGE;

    protected NVGPaint(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NVGPaint create(long var1, ByteBuffer var3) {
        return new NVGPaint(var1, var3);
    }

    public NVGPaint(ByteBuffer var1) {
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

    @NativeType("float[2]")
    public FloatBuffer extent() {
        return nextent(this.address());
    }

    public float extent(int var1) {
        return nextent(this.address(), var1);
    }

    public float radius() {
        return nradius(this.address());
    }

    public float feather() {
        return nfeather(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor innerColor() {
        return ninnerColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor outerColor() {
        return nouterColor(this.address());
    }

    public int image() {
        return nimage(this.address());
    }

    public NVGPaint xform(@NativeType("float[6]") FloatBuffer var1) {
        nxform(this.address(), var1);
        return this;
    }

    public NVGPaint xform(int var1, float var2) {
        nxform(this.address(), var1, var2);
        return this;
    }

    public NVGPaint extent(@NativeType("float[2]") FloatBuffer var1) {
        nextent(this.address(), var1);
        return this;
    }

    public NVGPaint extent(int var1, float var2) {
        nextent(this.address(), var1, var2);
        return this;
    }

    public NVGPaint radius(float var1) {
        nradius(this.address(), var1);
        return this;
    }

    public NVGPaint feather(float var1) {
        nfeather(this.address(), var1);
        return this;
    }

    public NVGPaint innerColor(@NativeType("NVGcolor") NVGColor var1) {
        ninnerColor(this.address(), var1);
        return this;
    }

    public NVGPaint innerColor(Consumer<NVGColor> var1) {
        var1.accept(this.innerColor());
        return this;
    }

    public NVGPaint outerColor(@NativeType("NVGcolor") NVGColor var1) {
        nouterColor(this.address(), var1);
        return this;
    }

    public NVGPaint outerColor(Consumer<NVGColor> var1) {
        var1.accept(this.outerColor());
        return this;
    }

    public NVGPaint image(int var1) {
        nimage(this.address(), var1);
        return this;
    }

    public NVGPaint set(FloatBuffer var1, FloatBuffer var2, float var3, float var4, NVGColor var5, NVGColor var6, int var7) {
        this.xform(var1);
        this.extent(var2);
        this.radius(var3);
        this.feather(var4);
        this.innerColor(var5);
        this.outerColor(var6);
        this.image(var7);
        return this;
    }

    public NVGPaint set(NVGPaint var1) {
        MemoryUtil.memCopy(var1.address(), this.address(), SIZEOF);
        return this;
    }

    public static NVGPaint malloc() {
        return new NVGPaint(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGPaint calloc() {
        return new NVGPaint(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGPaint create() {
        ByteBuffer var0 = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGPaint(MemoryUtil.memAddress(var0), var0);
    }

    public static NVGPaint create(long var0) {
        return new NVGPaint(var0, null);
    }

    
    public static NVGPaint createSafe(long var0) {
        return var0 == 0L ? null : new NVGPaint(var0, null);
    }

    public static NVGPaint.Buffer malloc(int var0) {
        return new NVGPaint.Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(var0, SIZEOF)), var0);
    }

    public static NVGPaint.Buffer calloc(int var0) {
        return new NVGPaint.Buffer(MemoryUtil.nmemCallocChecked(var0, SIZEOF), var0);
    }

    public static NVGPaint.Buffer create(int var0) {
        ByteBuffer var1 = __create(var0, SIZEOF);
        return new NVGPaint.Buffer(MemoryUtil.memAddress(var1), var1, -1, 0, var0, var0);
    }

    public static NVGPaint.Buffer create(long var0, int var2) {
        return new NVGPaint.Buffer(var0, var2);
    }

    
    public static NVGPaint.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NVGPaint.Buffer(var0, var2);
    }

    @Deprecated
    public static NVGPaint mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGPaint callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGPaint mallocStack(MemoryStack var0) {
        return malloc(var0);
    }

    @Deprecated
    public static NVGPaint callocStack(MemoryStack var0) {
        return calloc(var0);
    }

    @Deprecated
    public static NVGPaint.Buffer mallocStack(int var0) {
        return malloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGPaint.Buffer callocStack(int var0) {
        return calloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGPaint.Buffer mallocStack(int var0, MemoryStack var1) {
        return malloc(var0, var1);
    }

    @Deprecated
    public static NVGPaint.Buffer callocStack(int var0, MemoryStack var1) {
        return calloc(var0, var1);
    }

    public static NVGPaint malloc(MemoryStack var0) {
        return new NVGPaint(var0.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGPaint calloc(MemoryStack var0) {
        return new NVGPaint(var0.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static NVGPaint.Buffer malloc(int var0, MemoryStack var1) {
        return new NVGPaint.Buffer(var1.nmalloc(ALIGNOF, var0 * SIZEOF), var0);
    }

    public static NVGPaint.Buffer calloc(int var0, MemoryStack var1) {
        return new NVGPaint.Buffer(var1.ncalloc(ALIGNOF, var0, SIZEOF), var0);
    }

    public static FloatBuffer nxform(long var0) {
        return MemoryUtil.memFloatBuffer(var0 + XFORM, 6);
    }

    public static float nxform(long var0, int var2) {
        return UNSAFE.getFloat(null, var0 + XFORM + Checks.check(var2, 6) * 4L);
    }

    public static FloatBuffer nextent(long var0) {
        return MemoryUtil.memFloatBuffer(var0 + EXTENT, 2);
    }

    public static float nextent(long var0, int var2) {
        return UNSAFE.getFloat(null, var0 + EXTENT + Checks.check(var2, 2) * 4L);
    }

    public static float nradius(long var0) {
        return UNSAFE.getFloat(null, var0 + RADIUS);
    }

    public static float nfeather(long var0) {
        return UNSAFE.getFloat(null, var0 + FEATHER);
    }

    public static NVGColor ninnerColor(long var0) {
        return NVGColor.create(var0 + INNERCOLOR);
    }

    public static NVGColor nouterColor(long var0) {
        return NVGColor.create(var0 + OUTERCOLOR);
    }

    public static int nimage(long var0) {
        return UNSAFE.getInt(null, var0 + IMAGE);
    }

    public static void nxform(long var0, FloatBuffer var2) {
        if (Checks.CHECKS) {
            Checks.checkGT(var2, 6);
        }

        MemoryUtil.memCopy(MemoryUtil.memAddress(var2), var0 + XFORM, var2.remaining() * 4);
    }

    public static void nxform(long var0, int var2, float var3) {
        UNSAFE.putFloat(null, var0 + XFORM + Checks.check(var2, 6) * 4L, var3);
    }

    public static void nextent(long var0, FloatBuffer var2) {
        if (Checks.CHECKS) {
            Checks.checkGT(var2, 2);
        }

        MemoryUtil.memCopy(MemoryUtil.memAddress(var2), var0 + EXTENT, var2.remaining() * 4);
    }

    public static void nextent(long var0, int var2, float var3) {
        UNSAFE.putFloat(null, var0 + EXTENT + Checks.check(var2, 2) * 4L, var3);
    }

    public static void nradius(long var0, float var2) {
        UNSAFE.putFloat(null, var0 + RADIUS, var2);
    }

    public static void nfeather(long var0, float var2) {
        UNSAFE.putFloat(null, var0 + FEATHER, var2);
    }

    public static void ninnerColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + INNERCOLOR, NVGColor.SIZEOF);
    }

    public static void nouterColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + OUTERCOLOR, NVGColor.SIZEOF);
    }

    public static void nimage(long var0, int var2) {
        UNSAFE.putInt(null, var0 + IMAGE, var2);
    }

    static {
        Layout var0 = __struct(
            new Member[]{
                __array(4, 6),
                __array(4, 2),
                __member(4),
                __member(4),
                __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
                __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
                __member(4)
            }
        );
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        XFORM = var0.offsetof(0);
        EXTENT = var0.offsetof(1);
        RADIUS = var0.offsetof(2);
        FEATHER = var0.offsetof(3);
        INNERCOLOR = var0.offsetof(4);
        OUTERCOLOR = var0.offsetof(5);
        IMAGE = var0.offsetof(6);
    }

    public static class Buffer extends StructBuffer<NVGPaint, NVGPaint.Buffer> implements NativeResource {
        private static final NVGPaint ELEMENT_FACTORY = NVGPaint.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NVGPaint.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NVGPaint.Buffer self() {
            return this;
        }

        protected NVGPaint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("float[6]")
        public FloatBuffer xform() {
            return NVGPaint.nxform(this.address());
        }

        public float xform(int var1) {
            return NVGPaint.nxform(this.address(), var1);
        }

        @NativeType("float[2]")
        public FloatBuffer extent() {
            return NVGPaint.nextent(this.address());
        }

        public float extent(int var1) {
            return NVGPaint.nextent(this.address(), var1);
        }

        public float radius() {
            return NVGPaint.nradius(this.address());
        }

        public float feather() {
            return NVGPaint.nfeather(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor innerColor() {
            return NVGPaint.ninnerColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor outerColor() {
            return NVGPaint.nouterColor(this.address());
        }

        public int image() {
            return NVGPaint.nimage(this.address());
        }

        public NVGPaint.Buffer xform(@NativeType("float[6]") FloatBuffer var1) {
            NVGPaint.nxform(this.address(), var1);
            return this;
        }

        public NVGPaint.Buffer xform(int var1, float var2) {
            NVGPaint.nxform(this.address(), var1, var2);
            return this;
        }

        public NVGPaint.Buffer extent(@NativeType("float[2]") FloatBuffer var1) {
            NVGPaint.nextent(this.address(), var1);
            return this;
        }

        public NVGPaint.Buffer extent(int var1, float var2) {
            NVGPaint.nextent(this.address(), var1, var2);
            return this;
        }

        public NVGPaint.Buffer radius(float var1) {
            NVGPaint.nradius(this.address(), var1);
            return this;
        }

        public NVGPaint.Buffer feather(float var1) {
            NVGPaint.nfeather(this.address(), var1);
            return this;
        }

        public NVGPaint.Buffer innerColor(@NativeType("NVGcolor") NVGColor var1) {
            NVGPaint.ninnerColor(this.address(), var1);
            return this;
        }

        public NVGPaint.Buffer innerColor(Consumer<NVGColor> var1) {
            var1.accept(this.innerColor());
            return this;
        }

        public NVGPaint.Buffer outerColor(@NativeType("NVGcolor") NVGColor var1) {
            NVGPaint.nouterColor(this.address(), var1);
            return this;
        }

        public NVGPaint.Buffer outerColor(Consumer<NVGColor> var1) {
            var1.accept(this.outerColor());
            return this;
        }

        public NVGPaint.Buffer image(int var1) {
            NVGPaint.nimage(this.address(), var1);
            return this;
        }
    }
}
