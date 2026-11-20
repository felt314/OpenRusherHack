package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NSVGpath")
public class NSVGPath extends Struct<NSVGPath> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PTS;
    public static final int NPTS;
    public static final int CLOSED;
    public static final int BOUNDS;
    public static final int NEXT;

    protected NSVGPath(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NSVGPath create(long var1, ByteBuffer var3) {
        return new NSVGPath(var1, var3);
    }

    public NSVGPath(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("float *")
    public FloatBuffer pts() {
        return npts(this.address());
    }

    public int npts() {
        return nnpts(this.address());
    }

    @NativeType("char")
    public byte closed() {
        return nclosed(this.address());
    }

    @NativeType("float[4]")
    public FloatBuffer bounds() {
        return nbounds(this.address());
    }

    public float bounds(int var1) {
        return nbounds(this.address(), var1);
    }

    @NativeType("NSVGpath *")
    public NSVGPath next() {
        return nnext(this.address());
    }

    public static NSVGPath create(long var0) {
        return new NSVGPath(var0, null);
    }

    
    public static NSVGPath createSafe(long var0) {
        return var0 == 0L ? null : new NSVGPath(var0, null);
    }

    public static NSVGPath.Buffer create(long var0, int var2) {
        return new NSVGPath.Buffer(var0, var2);
    }

    
    public static NSVGPath.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NSVGPath.Buffer(var0, var2);
    }

    public static FloatBuffer npts(long var0) {
        return MemoryUtil.memFloatBuffer(MemoryUtil.memGetAddress(var0 + PTS), nnpts(var0) << 1);
    }

    public static int nnpts(long var0) {
        return UNSAFE.getInt(null, var0 + NPTS);
    }

    public static byte nclosed(long var0) {
        return UNSAFE.getByte(null, var0 + CLOSED);
    }

    public static FloatBuffer nbounds(long var0) {
        return MemoryUtil.memFloatBuffer(var0 + BOUNDS, 4);
    }

    public static float nbounds(long var0, int var2) {
        return UNSAFE.getFloat(null, var0 + BOUNDS + Checks.check(var2, 4) * 4L);
    }

    public static NSVGPath nnext(long var0) {
        return create(MemoryUtil.memGetAddress(var0 + NEXT));
    }

    static {
        Layout var0 = __struct(new Member[]{__member(POINTER_SIZE), __member(4), __member(1), __array(4, 4), __member(POINTER_SIZE)});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        PTS = var0.offsetof(0);
        NPTS = var0.offsetof(1);
        CLOSED = var0.offsetof(2);
        BOUNDS = var0.offsetof(3);
        NEXT = var0.offsetof(4);
    }

    public static class Buffer extends StructBuffer<NSVGPath, NSVGPath.Buffer> {
        private static final NSVGPath ELEMENT_FACTORY = NSVGPath.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NSVGPath.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NSVGPath.Buffer self() {
            return this;
        }

        protected NSVGPath getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("float *")
        public FloatBuffer pts() {
            return NSVGPath.npts(this.address());
        }

        public int npts() {
            return NSVGPath.nnpts(this.address());
        }

        @NativeType("char")
        public byte closed() {
            return NSVGPath.nclosed(this.address());
        }

        @NativeType("float[4]")
        public FloatBuffer bounds() {
            return NSVGPath.nbounds(this.address());
        }

        public float bounds(int var1) {
            return NSVGPath.nbounds(this.address(), var1);
        }

        @NativeType("NSVGpath *")
        public NSVGPath next() {
            return NSVGPath.nnext(this.address());
        }
    }
}
