package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NVGcolor")
public class NVGColor extends Struct<NVGColor> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RGBA;
    public static final int f006;
    public static final int f007;
    public static final int f008;
    public static final int f009;

    protected NVGColor(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NVGColor create(long var1, ByteBuffer var3) {
        return new NVGColor(var1, var3);
    }

    public NVGColor(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("float[4]")
    public FloatBuffer rgba() {
        return nrgba(this.address());
    }

    public float rgba(int var1) {
        return nrgba(this.address(), var1);
    }

    public float m008() {
        return m024(this.address());
    }

    public float m009() {
        return m025(this.address());
    }

    public float m010() {
        return m026(this.address());
    }

    public float m011() {
        return m027(this.address());
    }

    public NVGColor rgba(@NativeType("float[4]") FloatBuffer var1) {
        nrgba(this.address(), var1);
        return this;
    }

    public NVGColor rgba(int var1, float var2) {
        nrgba(this.address(), var1, var2);
        return this;
    }

    public NVGColor m020(float var1) {
        m028(this.address(), var1);
        return this;
    }

    public NVGColor m021(float var1) {
        m029(this.address(), var1);
        return this;
    }

    public NVGColor m022(float var1) {
        m030(this.address(), var1);
        return this;
    }

    public NVGColor m023(float var1) {
        m031(this.address(), var1);
        return this;
    }

    public NVGColor set(NVGColor var1) {
        MemoryUtil.memCopy(var1.address(), this.address(), SIZEOF);
        return this;
    }

    public static NVGColor malloc() {
        return new NVGColor(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGColor calloc() {
        return new NVGColor(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGColor create() {
        ByteBuffer var0 = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGColor(MemoryUtil.memAddress(var0), var0);
    }

    public static NVGColor create(long var0) {
        return new NVGColor(var0, null);
    }

    
    public static NVGColor createSafe(long var0) {
        return var0 == 0L ? null : new NVGColor(var0, null);
    }

    public static NVGColor.Buffer malloc(int var0) {
        return new NVGColor.Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(var0, SIZEOF)), var0);
    }

    public static NVGColor.Buffer calloc(int var0) {
        return new NVGColor.Buffer(MemoryUtil.nmemCallocChecked(var0, SIZEOF), var0);
    }

    public static NVGColor.Buffer create(int var0) {
        ByteBuffer var1 = __create(var0, SIZEOF);
        return new NVGColor.Buffer(MemoryUtil.memAddress(var1), var1, -1, 0, var0, var0);
    }

    public static NVGColor.Buffer create(long var0, int var2) {
        return new NVGColor.Buffer(var0, var2);
    }

    
    public static NVGColor.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NVGColor.Buffer(var0, var2);
    }

    @Deprecated
    public static NVGColor mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGColor callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGColor mallocStack(MemoryStack var0) {
        return malloc(var0);
    }

    @Deprecated
    public static NVGColor callocStack(MemoryStack var0) {
        return calloc(var0);
    }

    @Deprecated
    public static NVGColor.Buffer mallocStack(int var0) {
        return malloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGColor.Buffer callocStack(int var0) {
        return calloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGColor.Buffer mallocStack(int var0, MemoryStack var1) {
        return malloc(var0, var1);
    }

    @Deprecated
    public static NVGColor.Buffer callocStack(int var0, MemoryStack var1) {
        return calloc(var0, var1);
    }

    public static NVGColor malloc(MemoryStack var0) {
        return new NVGColor(var0.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGColor calloc(MemoryStack var0) {
        return new NVGColor(var0.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static NVGColor.Buffer malloc(int var0, MemoryStack var1) {
        return new NVGColor.Buffer(var1.nmalloc(ALIGNOF, var0 * SIZEOF), var0);
    }

    public static NVGColor.Buffer calloc(int var0, MemoryStack var1) {
        return new NVGColor.Buffer(var1.ncalloc(ALIGNOF, var0, SIZEOF), var0);
    }

    public static FloatBuffer nrgba(long var0) {
        return MemoryUtil.memFloatBuffer(var0 + RGBA, 4);
    }

    public static float nrgba(long var0, int var2) {
        return UNSAFE.getFloat(null, var0 + RGBA + Checks.check(var2, 4) * 4L);
    }

    public static float m024(long var0) {
        return UNSAFE.getFloat(null, var0 + f006);
    }

    public static float m025(long var0) {
        return UNSAFE.getFloat(null, var0 + f007);
    }

    public static float m026(long var0) {
        return UNSAFE.getFloat(null, var0 + f008);
    }

    public static float m027(long var0) {
        return UNSAFE.getFloat(null, var0 + f009);
    }

    public static void nrgba(long var0, FloatBuffer var2) {
        if (Checks.CHECKS) {
            Checks.checkGT(var2, 4);
        }

        MemoryUtil.memCopy(MemoryUtil.memAddress(var2), var0 + RGBA, var2.remaining() * 4);
    }

    public static void nrgba(long var0, int var2, float var3) {
        UNSAFE.putFloat(null, var0 + RGBA + Checks.check(var2, 4) * 4L, var3);
    }

    public static void m028(long var0, float var2) {
        UNSAFE.putFloat(null, var0 + f006, var2);
    }

    public static void m029(long var0, float var2) {
        UNSAFE.putFloat(null, var0 + f007, var2);
    }

    public static void m030(long var0, float var2) {
        UNSAFE.putFloat(null, var0 + f008, var2);
    }

    public static void m031(long var0, float var2) {
        UNSAFE.putFloat(null, var0 + f009, var2);
    }

    static {
        Layout var0 = __struct(new Member[]{__union(new Member[]{__array(4, 4), __struct(new Member[]{__member(4), __member(4), __member(4), __member(4)})})});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        RGBA = var0.offsetof(1);
        f006 = var0.offsetof(3);
        f007 = var0.offsetof(4);
        f008 = var0.offsetof(5);
        f009 = var0.offsetof(6);
    }

    public static class Buffer extends StructBuffer<NVGColor, NVGColor.Buffer> implements NativeResource {
        private static final NVGColor ELEMENT_FACTORY = NVGColor.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NVGColor.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NVGColor.Buffer self() {
            return this;
        }

        protected NVGColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("float[4]")
        public FloatBuffer rgba() {
            return NVGColor.nrgba(this.address());
        }

        public float rgba(int var1) {
            return NVGColor.nrgba(this.address(), var1);
        }

        public float m008() {
            return NVGColor.m024(this.address());
        }

        public float m009() {
            return NVGColor.m025(this.address());
        }

        public float m010() {
            return NVGColor.m026(this.address());
        }

        public float m011() {
            return NVGColor.m027(this.address());
        }

        public NVGColor.Buffer rgba(@NativeType("float[4]") FloatBuffer var1) {
            NVGColor.nrgba(this.address(), var1);
            return this;
        }

        public NVGColor.Buffer rgba(int var1, float var2) {
            NVGColor.nrgba(this.address(), var1, var2);
            return this;
        }

        public NVGColor.Buffer m012(float var1) {
            NVGColor.m028(this.address(), var1);
            return this;
        }

        public NVGColor.Buffer m013(float var1) {
            NVGColor.m029(this.address(), var1);
            return this;
        }

        public NVGColor.Buffer m014(float var1) {
            NVGColor.m030(this.address(), var1);
            return this;
        }

        public NVGColor.Buffer m015(float var1) {
            NVGColor.m031(this.address(), var1);
            return this;
        }
    }
}
