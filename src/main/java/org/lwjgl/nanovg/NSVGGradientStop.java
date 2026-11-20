package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NSVGgradientStop")
public class NSVGGradientStop extends Struct<NSVGGradientStop> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COLOR;
    public static final int OFFSET;

    protected NSVGGradientStop(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NSVGGradientStop create(long var1, ByteBuffer var3) {
        return new NSVGGradientStop(var1, var3);
    }

    public NSVGGradientStop(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned int")
    public int color() {
        return ncolor(this.address());
    }

    public float offset() {
        return noffset(this.address());
    }

    public static NSVGGradientStop create(long var0) {
        return new NSVGGradientStop(var0, null);
    }

    
    public static NSVGGradientStop createSafe(long var0) {
        return var0 == 0L ? null : new NSVGGradientStop(var0, null);
    }

    public static NSVGGradientStop.Buffer create(long var0, int var2) {
        return new NSVGGradientStop.Buffer(var0, var2);
    }

    
    public static NSVGGradientStop.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NSVGGradientStop.Buffer(var0, var2);
    }

    public static int ncolor(long var0) {
        return UNSAFE.getInt(null, var0 + COLOR);
    }

    public static float noffset(long var0) {
        return UNSAFE.getFloat(null, var0 + OFFSET);
    }

    static {
        Layout var0 = __struct(new Member[]{__member(4), __member(4)});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        COLOR = var0.offsetof(0);
        OFFSET = var0.offsetof(1);
    }

    public static class Buffer extends StructBuffer<NSVGGradientStop, NSVGGradientStop.Buffer> {
        private static final NSVGGradientStop ELEMENT_FACTORY = NSVGGradientStop.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NSVGGradientStop.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NSVGGradientStop.Buffer self() {
            return this;
        }

        protected NSVGGradientStop getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned int")
        public int color() {
            return NSVGGradientStop.ncolor(this.address());
        }

        public float offset() {
            return NSVGGradientStop.noffset(this.address());
        }
    }
}
