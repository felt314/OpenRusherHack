package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NVGglyphPosition")
public class NVGGlyphPosition extends Struct<NVGGlyphPosition> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STR;
    public static final int f010;
    public static final int MINX;
    public static final int MAXX;

    protected NVGGlyphPosition(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NVGGlyphPosition create(long var1, ByteBuffer var3) {
        return new NVGGlyphPosition(var1, var3);
    }

    public NVGGlyphPosition(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char *")
    public long str() {
        return nstr(this.address());
    }

    public float m032() {
        return m034(this.address());
    }

    public float minx() {
        return nminx(this.address());
    }

    public float maxx() {
        return nmaxx(this.address());
    }

    public static NVGGlyphPosition malloc() {
        return new NVGGlyphPosition(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGGlyphPosition calloc() {
        return new NVGGlyphPosition(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGGlyphPosition create() {
        ByteBuffer var0 = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGGlyphPosition(MemoryUtil.memAddress(var0), var0);
    }

    public static NVGGlyphPosition create(long var0) {
        return new NVGGlyphPosition(var0, null);
    }

    
    public static NVGGlyphPosition createSafe(long var0) {
        return var0 == 0L ? null : new NVGGlyphPosition(var0, null);
    }

    public static NVGGlyphPosition.Buffer malloc(int var0) {
        return new NVGGlyphPosition.Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(var0, SIZEOF)), var0);
    }

    public static NVGGlyphPosition.Buffer calloc(int var0) {
        return new NVGGlyphPosition.Buffer(MemoryUtil.nmemCallocChecked(var0, SIZEOF), var0);
    }

    public static NVGGlyphPosition.Buffer create(int var0) {
        ByteBuffer var1 = __create(var0, SIZEOF);
        return new NVGGlyphPosition.Buffer(MemoryUtil.memAddress(var1), var1, -1, 0, var0, var0);
    }

    public static NVGGlyphPosition.Buffer create(long var0, int var2) {
        return new NVGGlyphPosition.Buffer(var0, var2);
    }

    
    public static NVGGlyphPosition.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NVGGlyphPosition.Buffer(var0, var2);
    }

    @Deprecated
    public static NVGGlyphPosition mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGGlyphPosition callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGGlyphPosition mallocStack(MemoryStack var0) {
        return malloc(var0);
    }

    @Deprecated
    public static NVGGlyphPosition callocStack(MemoryStack var0) {
        return calloc(var0);
    }

    @Deprecated
    public static NVGGlyphPosition.Buffer mallocStack(int var0) {
        return malloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGGlyphPosition.Buffer callocStack(int var0) {
        return calloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGGlyphPosition.Buffer mallocStack(int var0, MemoryStack var1) {
        return malloc(var0, var1);
    }

    @Deprecated
    public static NVGGlyphPosition.Buffer callocStack(int var0, MemoryStack var1) {
        return calloc(var0, var1);
    }

    public static NVGGlyphPosition malloc(MemoryStack var0) {
        return new NVGGlyphPosition(var0.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGGlyphPosition calloc(MemoryStack var0) {
        return new NVGGlyphPosition(var0.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static NVGGlyphPosition.Buffer malloc(int var0, MemoryStack var1) {
        return new NVGGlyphPosition.Buffer(var1.nmalloc(ALIGNOF, var0 * SIZEOF), var0);
    }

    public static NVGGlyphPosition.Buffer calloc(int var0, MemoryStack var1) {
        return new NVGGlyphPosition.Buffer(var1.ncalloc(ALIGNOF, var0, SIZEOF), var0);
    }

    public static long nstr(long var0) {
        return MemoryUtil.memGetAddress(var0 + STR);
    }

    public static float m034(long var0) {
        return UNSAFE.getFloat(null, var0 + f010);
    }

    public static float nminx(long var0) {
        return UNSAFE.getFloat(null, var0 + MINX);
    }

    public static float nmaxx(long var0) {
        return UNSAFE.getFloat(null, var0 + MAXX);
    }

    static {
        Layout var0 = __struct(new Member[]{__member(POINTER_SIZE), __member(4), __member(4), __member(4)});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        STR = var0.offsetof(0);
        f010 = var0.offsetof(1);
        MINX = var0.offsetof(2);
        MAXX = var0.offsetof(3);
    }

    public static class Buffer extends StructBuffer<NVGGlyphPosition, NVGGlyphPosition.Buffer> implements NativeResource {
        private static final NVGGlyphPosition ELEMENT_FACTORY = NVGGlyphPosition.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NVGGlyphPosition.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NVGGlyphPosition.Buffer self() {
            return this;
        }

        protected NVGGlyphPosition getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char *")
        public long str() {
            return NVGGlyphPosition.nstr(this.address());
        }

        public float m032() {
            return NVGGlyphPosition.m034(this.address());
        }

        public float minx() {
            return NVGGlyphPosition.nminx(this.address());
        }

        public float maxx() {
            return NVGGlyphPosition.nmaxx(this.address());
        }
    }
}
