package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NSVGimage")
public class NSVGImage extends Struct<NSVGImage> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int SHAPES;

    protected NSVGImage(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NSVGImage create(long var1, ByteBuffer var3) {
        return new NSVGImage(var1, var3);
    }

    public NSVGImage(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    public float width() {
        return nwidth(this.address());
    }

    public float height() {
        return nheight(this.address());
    }

    @NativeType("NSVGshape *")
    public NSVGShape shapes() {
        return nshapes(this.address());
    }

    public static NSVGImage create(long var0) {
        return new NSVGImage(var0, null);
    }

    
    public static NSVGImage createSafe(long var0) {
        return var0 == 0L ? null : new NSVGImage(var0, null);
    }

    public static NSVGImage.Buffer create(long var0, int var2) {
        return new NSVGImage.Buffer(var0, var2);
    }

    
    public static NSVGImage.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NSVGImage.Buffer(var0, var2);
    }

    public static float nwidth(long var0) {
        return UNSAFE.getFloat(null, var0 + WIDTH);
    }

    public static float nheight(long var0) {
        return UNSAFE.getFloat(null, var0 + HEIGHT);
    }

    public static NSVGShape nshapes(long var0) {
        return NSVGShape.create(MemoryUtil.memGetAddress(var0 + SHAPES));
    }

    static {
        Layout var0 = __struct(new Member[]{__member(4), __member(4), __member(POINTER_SIZE)});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        WIDTH = var0.offsetof(0);
        HEIGHT = var0.offsetof(1);
        SHAPES = var0.offsetof(2);
    }

    public static class Buffer extends StructBuffer<NSVGImage, NSVGImage.Buffer> {
        private static final NSVGImage ELEMENT_FACTORY = NSVGImage.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NSVGImage.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NSVGImage.Buffer self() {
            return this;
        }

        protected NSVGImage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float width() {
            return NSVGImage.nwidth(this.address());
        }

        public float height() {
            return NSVGImage.nheight(this.address());
        }

        @NativeType("NSVGshape *")
        public NSVGShape shapes() {
            return NSVGImage.nshapes(this.address());
        }
    }
}
