package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

public class BNDwidgetTheme extends Struct<BNDwidgetTheme> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OUTLINECOLOR;
    public static final int ITEMCOLOR;
    public static final int INNERCOLOR;
    public static final int INNERSELECTEDCOLOR;
    public static final int TEXTCOLOR;
    public static final int TEXTSELECTEDCOLOR;
    public static final int SHADETOP;
    public static final int SHADEDOWN;

    protected BNDwidgetTheme(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected BNDwidgetTheme create(long var1, ByteBuffer var3) {
        return new BNDwidgetTheme(var1, var3);
    }

    public BNDwidgetTheme(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("NVGcolor")
    public NVGColor outlineColor() {
        return noutlineColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor itemColor() {
        return nitemColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor innerColor() {
        return ninnerColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor innerSelectedColor() {
        return ninnerSelectedColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor textColor() {
        return ntextColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor textSelectedColor() {
        return ntextSelectedColor(this.address());
    }

    public int shadeTop() {
        return nshadeTop(this.address());
    }

    public int shadeDown() {
        return nshadeDown(this.address());
    }

    public BNDwidgetTheme outlineColor(@NativeType("NVGcolor") NVGColor var1) {
        noutlineColor(this.address(), var1);
        return this;
    }

    public BNDwidgetTheme outlineColor(Consumer<NVGColor> var1) {
        var1.accept(this.outlineColor());
        return this;
    }

    public BNDwidgetTheme itemColor(@NativeType("NVGcolor") NVGColor var1) {
        nitemColor(this.address(), var1);
        return this;
    }

    public BNDwidgetTheme itemColor(Consumer<NVGColor> var1) {
        var1.accept(this.itemColor());
        return this;
    }

    public BNDwidgetTheme innerColor(@NativeType("NVGcolor") NVGColor var1) {
        ninnerColor(this.address(), var1);
        return this;
    }

    public BNDwidgetTheme innerColor(Consumer<NVGColor> var1) {
        var1.accept(this.innerColor());
        return this;
    }

    public BNDwidgetTheme innerSelectedColor(@NativeType("NVGcolor") NVGColor var1) {
        ninnerSelectedColor(this.address(), var1);
        return this;
    }

    public BNDwidgetTheme innerSelectedColor(Consumer<NVGColor> var1) {
        var1.accept(this.innerSelectedColor());
        return this;
    }

    public BNDwidgetTheme textColor(@NativeType("NVGcolor") NVGColor var1) {
        ntextColor(this.address(), var1);
        return this;
    }

    public BNDwidgetTheme textColor(Consumer<NVGColor> var1) {
        var1.accept(this.textColor());
        return this;
    }

    public BNDwidgetTheme textSelectedColor(@NativeType("NVGcolor") NVGColor var1) {
        ntextSelectedColor(this.address(), var1);
        return this;
    }

    public BNDwidgetTheme textSelectedColor(Consumer<NVGColor> var1) {
        var1.accept(this.textSelectedColor());
        return this;
    }

    public BNDwidgetTheme shadeTop(int var1) {
        nshadeTop(this.address(), var1);
        return this;
    }

    public BNDwidgetTheme shadeDown(int var1) {
        nshadeDown(this.address(), var1);
        return this;
    }

    public BNDwidgetTheme set(NVGColor var1, NVGColor var2, NVGColor var3, NVGColor var4, NVGColor var5, NVGColor var6, int var7, int var8) {
        this.outlineColor(var1);
        this.itemColor(var2);
        this.innerColor(var3);
        this.innerSelectedColor(var4);
        this.textColor(var5);
        this.textSelectedColor(var6);
        this.shadeTop(var7);
        this.shadeDown(var8);
        return this;
    }

    public BNDwidgetTheme set(BNDwidgetTheme var1) {
        MemoryUtil.memCopy(var1.address(), this.address(), SIZEOF);
        return this;
    }

    public static BNDwidgetTheme malloc() {
        return new BNDwidgetTheme(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static BNDwidgetTheme calloc() {
        return new BNDwidgetTheme(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static BNDwidgetTheme create() {
        ByteBuffer var0 = BufferUtils.createByteBuffer(SIZEOF);
        return new BNDwidgetTheme(MemoryUtil.memAddress(var0), var0);
    }

    public static BNDwidgetTheme create(long var0) {
        return new BNDwidgetTheme(var0, null);
    }

    
    public static BNDwidgetTheme createSafe(long var0) {
        return var0 == 0L ? null : new BNDwidgetTheme(var0, null);
    }

    public static BNDwidgetTheme.Buffer malloc(int var0) {
        return new BNDwidgetTheme.Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(var0, SIZEOF)), var0);
    }

    public static BNDwidgetTheme.Buffer calloc(int var0) {
        return new BNDwidgetTheme.Buffer(MemoryUtil.nmemCallocChecked(var0, SIZEOF), var0);
    }

    public static BNDwidgetTheme.Buffer create(int var0) {
        ByteBuffer var1 = __create(var0, SIZEOF);
        return new BNDwidgetTheme.Buffer(MemoryUtil.memAddress(var1), var1, -1, 0, var0, var0);
    }

    public static BNDwidgetTheme.Buffer create(long var0, int var2) {
        return new BNDwidgetTheme.Buffer(var0, var2);
    }

    
    public static BNDwidgetTheme.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new BNDwidgetTheme.Buffer(var0, var2);
    }

    @Deprecated
    public static BNDwidgetTheme mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDwidgetTheme callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDwidgetTheme mallocStack(MemoryStack var0) {
        return malloc(var0);
    }

    @Deprecated
    public static BNDwidgetTheme callocStack(MemoryStack var0) {
        return calloc(var0);
    }

    @Deprecated
    public static BNDwidgetTheme.Buffer mallocStack(int var0) {
        return malloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDwidgetTheme.Buffer callocStack(int var0) {
        return calloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDwidgetTheme.Buffer mallocStack(int var0, MemoryStack var1) {
        return malloc(var0, var1);
    }

    @Deprecated
    public static BNDwidgetTheme.Buffer callocStack(int var0, MemoryStack var1) {
        return calloc(var0, var1);
    }

    public static BNDwidgetTheme malloc(MemoryStack var0) {
        return new BNDwidgetTheme(var0.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static BNDwidgetTheme calloc(MemoryStack var0) {
        return new BNDwidgetTheme(var0.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static BNDwidgetTheme.Buffer malloc(int var0, MemoryStack var1) {
        return new BNDwidgetTheme.Buffer(var1.nmalloc(ALIGNOF, var0 * SIZEOF), var0);
    }

    public static BNDwidgetTheme.Buffer calloc(int var0, MemoryStack var1) {
        return new BNDwidgetTheme.Buffer(var1.ncalloc(ALIGNOF, var0, SIZEOF), var0);
    }

    public static NVGColor noutlineColor(long var0) {
        return NVGColor.create(var0 + OUTLINECOLOR);
    }

    public static NVGColor nitemColor(long var0) {
        return NVGColor.create(var0 + ITEMCOLOR);
    }

    public static NVGColor ninnerColor(long var0) {
        return NVGColor.create(var0 + INNERCOLOR);
    }

    public static NVGColor ninnerSelectedColor(long var0) {
        return NVGColor.create(var0 + INNERSELECTEDCOLOR);
    }

    public static NVGColor ntextColor(long var0) {
        return NVGColor.create(var0 + TEXTCOLOR);
    }

    public static NVGColor ntextSelectedColor(long var0) {
        return NVGColor.create(var0 + TEXTSELECTEDCOLOR);
    }

    public static int nshadeTop(long var0) {
        return UNSAFE.getInt(null, var0 + SHADETOP);
    }

    public static int nshadeDown(long var0) {
        return UNSAFE.getInt(null, var0 + SHADEDOWN);
    }

    public static void noutlineColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + OUTLINECOLOR, NVGColor.SIZEOF);
    }

    public static void nitemColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + ITEMCOLOR, NVGColor.SIZEOF);
    }

    public static void ninnerColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + INNERCOLOR, NVGColor.SIZEOF);
    }

    public static void ninnerSelectedColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + INNERSELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void ntextColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + TEXTCOLOR, NVGColor.SIZEOF);
    }

    public static void ntextSelectedColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + TEXTSELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void nshadeTop(long var0, int var2) {
        UNSAFE.putInt(null, var0 + SHADETOP, var2);
    }

    public static void nshadeDown(long var0, int var2) {
        UNSAFE.putInt(null, var0 + SHADEDOWN, var2);
    }

    static {
        Layout var0 = __struct(
            new Member[]{
                __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
                __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
                __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
                __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
                __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
                __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
                __member(4),
                __member(4)
            }
        );
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        OUTLINECOLOR = var0.offsetof(0);
        ITEMCOLOR = var0.offsetof(1);
        INNERCOLOR = var0.offsetof(2);
        INNERSELECTEDCOLOR = var0.offsetof(3);
        TEXTCOLOR = var0.offsetof(4);
        TEXTSELECTEDCOLOR = var0.offsetof(5);
        SHADETOP = var0.offsetof(6);
        SHADEDOWN = var0.offsetof(7);
    }

    public static class Buffer extends StructBuffer<BNDwidgetTheme, BNDwidgetTheme.Buffer> implements NativeResource {
        private static final BNDwidgetTheme ELEMENT_FACTORY = BNDwidgetTheme.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / BNDwidgetTheme.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected BNDwidgetTheme.Buffer self() {
            return this;
        }

        protected BNDwidgetTheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("NVGcolor")
        public NVGColor outlineColor() {
            return BNDwidgetTheme.noutlineColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor itemColor() {
            return BNDwidgetTheme.nitemColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor innerColor() {
            return BNDwidgetTheme.ninnerColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor innerSelectedColor() {
            return BNDwidgetTheme.ninnerSelectedColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor textColor() {
            return BNDwidgetTheme.ntextColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor textSelectedColor() {
            return BNDwidgetTheme.ntextSelectedColor(this.address());
        }

        public int shadeTop() {
            return BNDwidgetTheme.nshadeTop(this.address());
        }

        public int shadeDown() {
            return BNDwidgetTheme.nshadeDown(this.address());
        }

        public BNDwidgetTheme.Buffer outlineColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDwidgetTheme.noutlineColor(this.address(), var1);
            return this;
        }

        public BNDwidgetTheme.Buffer outlineColor(Consumer<NVGColor> var1) {
            var1.accept(this.outlineColor());
            return this;
        }

        public BNDwidgetTheme.Buffer itemColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDwidgetTheme.nitemColor(this.address(), var1);
            return this;
        }

        public BNDwidgetTheme.Buffer itemColor(Consumer<NVGColor> var1) {
            var1.accept(this.itemColor());
            return this;
        }

        public BNDwidgetTheme.Buffer innerColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDwidgetTheme.ninnerColor(this.address(), var1);
            return this;
        }

        public BNDwidgetTheme.Buffer innerColor(Consumer<NVGColor> var1) {
            var1.accept(this.innerColor());
            return this;
        }

        public BNDwidgetTheme.Buffer innerSelectedColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDwidgetTheme.ninnerSelectedColor(this.address(), var1);
            return this;
        }

        public BNDwidgetTheme.Buffer innerSelectedColor(Consumer<NVGColor> var1) {
            var1.accept(this.innerSelectedColor());
            return this;
        }

        public BNDwidgetTheme.Buffer textColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDwidgetTheme.ntextColor(this.address(), var1);
            return this;
        }

        public BNDwidgetTheme.Buffer textColor(Consumer<NVGColor> var1) {
            var1.accept(this.textColor());
            return this;
        }

        public BNDwidgetTheme.Buffer textSelectedColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDwidgetTheme.ntextSelectedColor(this.address(), var1);
            return this;
        }

        public BNDwidgetTheme.Buffer textSelectedColor(Consumer<NVGColor> var1) {
            var1.accept(this.textSelectedColor());
            return this;
        }

        public BNDwidgetTheme.Buffer shadeTop(int var1) {
            BNDwidgetTheme.nshadeTop(this.address(), var1);
            return this;
        }

        public BNDwidgetTheme.Buffer shadeDown(int var1) {
            BNDwidgetTheme.nshadeDown(this.address(), var1);
            return this;
        }
    }
}
