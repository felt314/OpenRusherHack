package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NSVGpaint")
public class NSVGPaint extends Struct<NSVGPaint> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int COLOR;
    public static final int GRADIENT;

    protected NSVGPaint(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NSVGPaint create(long var1, ByteBuffer var3) {
        return new NSVGPaint(var1, var3);
    }

    public NSVGPaint(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("signed char")
    public byte type() {
        return ntype(this.address());
    }

    @NativeType("unsigned int")
    public int color() {
        return ncolor(this.address());
    }

    @NativeType("NSVGgradient *")
    public NSVGGradient gradient() {
        return ngradient(this.address());
    }

    public static NSVGPaint create(long var0) {
        return new NSVGPaint(var0, null);
    }

    
    public static NSVGPaint createSafe(long var0) {
        return var0 == 0L ? null : new NSVGPaint(var0, null);
    }

    public static NSVGPaint.Buffer create(long var0, int var2) {
        return new NSVGPaint.Buffer(var0, var2);
    }

    
    public static NSVGPaint.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NSVGPaint.Buffer(var0, var2);
    }

    public static byte ntype(long var0) {
        return UNSAFE.getByte(null, var0 + TYPE);
    }

    public static int ncolor(long var0) {
        return UNSAFE.getInt(null, var0 + COLOR);
    }

    public static NSVGGradient ngradient(long var0) {
        return NSVGGradient.create(MemoryUtil.memGetAddress(var0 + GRADIENT));
    }

    static {
        Layout var0 = __struct(new Member[]{__member(1), __union(new Member[]{__member(4), __member(POINTER_SIZE)})});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        TYPE = var0.offsetof(0);
        COLOR = var0.offsetof(2);
        GRADIENT = var0.offsetof(3);
    }

    public static class Buffer extends StructBuffer<NSVGPaint, NSVGPaint.Buffer> {
        private static final NSVGPaint ELEMENT_FACTORY = NSVGPaint.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NSVGPaint.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NSVGPaint.Buffer self() {
            return this;
        }

        protected NSVGPaint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("signed char")
        public byte type() {
            return NSVGPaint.ntype(this.address());
        }

        @NativeType("unsigned int")
        public int color() {
            return NSVGPaint.ncolor(this.address());
        }

        @NativeType("NSVGgradient *")
        public NSVGGradient gradient() {
            return NSVGPaint.ngradient(this.address());
        }
    }
}
