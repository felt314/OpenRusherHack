package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NVGtextRow")
public class NVGTextRow extends Struct<NVGTextRow> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int START;
    public static final int END;
    public static final int NEXT;
    public static final int WIDTH;
    public static final int MINX;
    public static final int MAXX;

    protected NVGTextRow(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NVGTextRow create(long var1, ByteBuffer var3) {
        return new NVGTextRow(var1, var3);
    }

    public NVGTextRow(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char *")
    public long start() {
        return nstart(this.address());
    }

    @NativeType("char *")
    public long end() {
        return nend(this.address());
    }

    @NativeType("char *")
    public long next() {
        return nnext(this.address());
    }

    public float width() {
        return nwidth(this.address());
    }

    public float minx() {
        return nminx(this.address());
    }

    public float maxx() {
        return nmaxx(this.address());
    }

    public static NVGTextRow malloc() {
        return new NVGTextRow(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGTextRow calloc() {
        return new NVGTextRow(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGTextRow create() {
        ByteBuffer var0 = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGTextRow(MemoryUtil.memAddress(var0), var0);
    }

    public static NVGTextRow create(long var0) {
        return new NVGTextRow(var0, null);
    }

    
    public static NVGTextRow createSafe(long var0) {
        return var0 == 0L ? null : new NVGTextRow(var0, null);
    }

    public static NVGTextRow.Buffer malloc(int var0) {
        return new NVGTextRow.Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(var0, SIZEOF)), var0);
    }

    public static NVGTextRow.Buffer calloc(int var0) {
        return new NVGTextRow.Buffer(MemoryUtil.nmemCallocChecked(var0, SIZEOF), var0);
    }

    public static NVGTextRow.Buffer create(int var0) {
        ByteBuffer var1 = __create(var0, SIZEOF);
        return new NVGTextRow.Buffer(MemoryUtil.memAddress(var1), var1, -1, 0, var0, var0);
    }

    public static NVGTextRow.Buffer create(long var0, int var2) {
        return new NVGTextRow.Buffer(var0, var2);
    }

    
    public static NVGTextRow.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NVGTextRow.Buffer(var0, var2);
    }

    @Deprecated
    public static NVGTextRow mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGTextRow callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGTextRow mallocStack(MemoryStack var0) {
        return malloc(var0);
    }

    @Deprecated
    public static NVGTextRow callocStack(MemoryStack var0) {
        return calloc(var0);
    }

    @Deprecated
    public static NVGTextRow.Buffer mallocStack(int var0) {
        return malloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGTextRow.Buffer callocStack(int var0) {
        return calloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGTextRow.Buffer mallocStack(int var0, MemoryStack var1) {
        return malloc(var0, var1);
    }

    @Deprecated
    public static NVGTextRow.Buffer callocStack(int var0, MemoryStack var1) {
        return calloc(var0, var1);
    }

    public static NVGTextRow malloc(MemoryStack var0) {
        return new NVGTextRow(var0.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGTextRow calloc(MemoryStack var0) {
        return new NVGTextRow(var0.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static NVGTextRow.Buffer malloc(int var0, MemoryStack var1) {
        return new NVGTextRow.Buffer(var1.nmalloc(ALIGNOF, var0 * SIZEOF), var0);
    }

    public static NVGTextRow.Buffer calloc(int var0, MemoryStack var1) {
        return new NVGTextRow.Buffer(var1.ncalloc(ALIGNOF, var0, SIZEOF), var0);
    }

    public static long nstart(long var0) {
        return MemoryUtil.memGetAddress(var0 + START);
    }

    public static long nend(long var0) {
        return MemoryUtil.memGetAddress(var0 + END);
    }

    public static long nnext(long var0) {
        return MemoryUtil.memGetAddress(var0 + NEXT);
    }

    public static float nwidth(long var0) {
        return UNSAFE.getFloat(null, var0 + WIDTH);
    }

    public static float nminx(long var0) {
        return UNSAFE.getFloat(null, var0 + MINX);
    }

    public static float nmaxx(long var0) {
        return UNSAFE.getFloat(null, var0 + MAXX);
    }

    static {
        Layout var0 = __struct(new Member[]{__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(4)});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        START = var0.offsetof(0);
        END = var0.offsetof(1);
        NEXT = var0.offsetof(2);
        WIDTH = var0.offsetof(3);
        MINX = var0.offsetof(4);
        MAXX = var0.offsetof(5);
    }

    public static class Buffer extends StructBuffer<NVGTextRow, NVGTextRow.Buffer> implements NativeResource {
        private static final NVGTextRow ELEMENT_FACTORY = NVGTextRow.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NVGTextRow.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NVGTextRow.Buffer self() {
            return this;
        }

        protected NVGTextRow getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char *")
        public long start() {
            return NVGTextRow.nstart(this.address());
        }

        @NativeType("char *")
        public long end() {
            return NVGTextRow.nend(this.address());
        }

        @NativeType("char *")
        public long next() {
            return NVGTextRow.nnext(this.address());
        }

        public float width() {
            return NVGTextRow.nwidth(this.address());
        }

        public float minx() {
            return NVGTextRow.nminx(this.address());
        }

        public float maxx() {
            return NVGTextRow.nmaxx(this.address());
        }
    }
}
