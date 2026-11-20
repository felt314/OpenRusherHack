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

public class BNDnodeTheme extends Struct<BNDnodeTheme> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NODESELECTEDCOLOR;
    public static final int WIRESCOLOR;
    public static final int TEXTSELECTEDCOLOR;
    public static final int ACTIVENODECOLOR;
    public static final int WIRESELECTCOLOR;
    public static final int NODEBACKDROPCOLOR;
    public static final int NOODLECURVING;

    protected BNDnodeTheme(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected BNDnodeTheme create(long var1, ByteBuffer var3) {
        return new BNDnodeTheme(var1, var3);
    }

    public BNDnodeTheme(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("NVGcolor")
    public NVGColor nodeSelectedColor() {
        return nnodeSelectedColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor wiresColor() {
        return nwiresColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor textSelectedColor() {
        return ntextSelectedColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor activeNodeColor() {
        return nactiveNodeColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor wireSelectColor() {
        return nwireSelectColor(this.address());
    }

    @NativeType("NVGcolor")
    public NVGColor nodeBackdropColor() {
        return nnodeBackdropColor(this.address());
    }

    public int noodleCurving() {
        return nnoodleCurving(this.address());
    }

    public BNDnodeTheme nodeSelectedColor(@NativeType("NVGcolor") NVGColor var1) {
        nnodeSelectedColor(this.address(), var1);
        return this;
    }

    public BNDnodeTheme nodeSelectedColor(Consumer<NVGColor> var1) {
        var1.accept(this.nodeSelectedColor());
        return this;
    }

    public BNDnodeTheme wiresColor(@NativeType("NVGcolor") NVGColor var1) {
        nwiresColor(this.address(), var1);
        return this;
    }

    public BNDnodeTheme wiresColor(Consumer<NVGColor> var1) {
        var1.accept(this.wiresColor());
        return this;
    }

    public BNDnodeTheme textSelectedColor(@NativeType("NVGcolor") NVGColor var1) {
        ntextSelectedColor(this.address(), var1);
        return this;
    }

    public BNDnodeTheme textSelectedColor(Consumer<NVGColor> var1) {
        var1.accept(this.textSelectedColor());
        return this;
    }

    public BNDnodeTheme activeNodeColor(@NativeType("NVGcolor") NVGColor var1) {
        nactiveNodeColor(this.address(), var1);
        return this;
    }

    public BNDnodeTheme activeNodeColor(Consumer<NVGColor> var1) {
        var1.accept(this.activeNodeColor());
        return this;
    }

    public BNDnodeTheme wireSelectColor(@NativeType("NVGcolor") NVGColor var1) {
        nwireSelectColor(this.address(), var1);
        return this;
    }

    public BNDnodeTheme wireSelectColor(Consumer<NVGColor> var1) {
        var1.accept(this.wireSelectColor());
        return this;
    }

    public BNDnodeTheme nodeBackdropColor(@NativeType("NVGcolor") NVGColor var1) {
        nnodeBackdropColor(this.address(), var1);
        return this;
    }

    public BNDnodeTheme nodeBackdropColor(Consumer<NVGColor> var1) {
        var1.accept(this.nodeBackdropColor());
        return this;
    }

    public BNDnodeTheme noodleCurving(int var1) {
        nnoodleCurving(this.address(), var1);
        return this;
    }

    public BNDnodeTheme set(NVGColor var1, NVGColor var2, NVGColor var3, NVGColor var4, NVGColor var5, NVGColor var6, int var7) {
        this.nodeSelectedColor(var1);
        this.wiresColor(var2);
        this.textSelectedColor(var3);
        this.activeNodeColor(var4);
        this.wireSelectColor(var5);
        this.nodeBackdropColor(var6);
        this.noodleCurving(var7);
        return this;
    }

    public BNDnodeTheme set(BNDnodeTheme var1) {
        MemoryUtil.memCopy(var1.address(), this.address(), SIZEOF);
        return this;
    }

    public static BNDnodeTheme malloc() {
        return new BNDnodeTheme(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static BNDnodeTheme calloc() {
        return new BNDnodeTheme(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static BNDnodeTheme create() {
        ByteBuffer var0 = BufferUtils.createByteBuffer(SIZEOF);
        return new BNDnodeTheme(MemoryUtil.memAddress(var0), var0);
    }

    public static BNDnodeTheme create(long var0) {
        return new BNDnodeTheme(var0, null);
    }

    
    public static BNDnodeTheme createSafe(long var0) {
        return var0 == 0L ? null : new BNDnodeTheme(var0, null);
    }

    public static BNDnodeTheme.Buffer malloc(int var0) {
        return new BNDnodeTheme.Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(var0, SIZEOF)), var0);
    }

    public static BNDnodeTheme.Buffer calloc(int var0) {
        return new BNDnodeTheme.Buffer(MemoryUtil.nmemCallocChecked(var0, SIZEOF), var0);
    }

    public static BNDnodeTheme.Buffer create(int var0) {
        ByteBuffer var1 = __create(var0, SIZEOF);
        return new BNDnodeTheme.Buffer(MemoryUtil.memAddress(var1), var1, -1, 0, var0, var0);
    }

    public static BNDnodeTheme.Buffer create(long var0, int var2) {
        return new BNDnodeTheme.Buffer(var0, var2);
    }

    
    public static BNDnodeTheme.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new BNDnodeTheme.Buffer(var0, var2);
    }

    @Deprecated
    public static BNDnodeTheme mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDnodeTheme callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDnodeTheme mallocStack(MemoryStack var0) {
        return malloc(var0);
    }

    @Deprecated
    public static BNDnodeTheme callocStack(MemoryStack var0) {
        return calloc(var0);
    }

    @Deprecated
    public static BNDnodeTheme.Buffer mallocStack(int var0) {
        return malloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDnodeTheme.Buffer callocStack(int var0) {
        return calloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDnodeTheme.Buffer mallocStack(int var0, MemoryStack var1) {
        return malloc(var0, var1);
    }

    @Deprecated
    public static BNDnodeTheme.Buffer callocStack(int var0, MemoryStack var1) {
        return calloc(var0, var1);
    }

    public static BNDnodeTheme malloc(MemoryStack var0) {
        return new BNDnodeTheme(var0.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static BNDnodeTheme calloc(MemoryStack var0) {
        return new BNDnodeTheme(var0.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static BNDnodeTheme.Buffer malloc(int var0, MemoryStack var1) {
        return new BNDnodeTheme.Buffer(var1.nmalloc(ALIGNOF, var0 * SIZEOF), var0);
    }

    public static BNDnodeTheme.Buffer calloc(int var0, MemoryStack var1) {
        return new BNDnodeTheme.Buffer(var1.ncalloc(ALIGNOF, var0, SIZEOF), var0);
    }

    public static NVGColor nnodeSelectedColor(long var0) {
        return NVGColor.create(var0 + NODESELECTEDCOLOR);
    }

    public static NVGColor nwiresColor(long var0) {
        return NVGColor.create(var0 + WIRESCOLOR);
    }

    public static NVGColor ntextSelectedColor(long var0) {
        return NVGColor.create(var0 + TEXTSELECTEDCOLOR);
    }

    public static NVGColor nactiveNodeColor(long var0) {
        return NVGColor.create(var0 + ACTIVENODECOLOR);
    }

    public static NVGColor nwireSelectColor(long var0) {
        return NVGColor.create(var0 + WIRESELECTCOLOR);
    }

    public static NVGColor nnodeBackdropColor(long var0) {
        return NVGColor.create(var0 + NODEBACKDROPCOLOR);
    }

    public static int nnoodleCurving(long var0) {
        return UNSAFE.getInt(null, var0 + NOODLECURVING);
    }

    public static void nnodeSelectedColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + NODESELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void nwiresColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + WIRESCOLOR, NVGColor.SIZEOF);
    }

    public static void ntextSelectedColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + TEXTSELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void nactiveNodeColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + ACTIVENODECOLOR, NVGColor.SIZEOF);
    }

    public static void nwireSelectColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + WIRESELECTCOLOR, NVGColor.SIZEOF);
    }

    public static void nnodeBackdropColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + NODEBACKDROPCOLOR, NVGColor.SIZEOF);
    }

    public static void nnoodleCurving(long var0, int var2) {
        UNSAFE.putInt(null, var0 + NOODLECURVING, var2);
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
                __member(4)
            }
        );
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        NODESELECTEDCOLOR = var0.offsetof(0);
        WIRESCOLOR = var0.offsetof(1);
        TEXTSELECTEDCOLOR = var0.offsetof(2);
        ACTIVENODECOLOR = var0.offsetof(3);
        WIRESELECTCOLOR = var0.offsetof(4);
        NODEBACKDROPCOLOR = var0.offsetof(5);
        NOODLECURVING = var0.offsetof(6);
    }

    public static class Buffer extends StructBuffer<BNDnodeTheme, BNDnodeTheme.Buffer> implements NativeResource {
        private static final BNDnodeTheme ELEMENT_FACTORY = BNDnodeTheme.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / BNDnodeTheme.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected BNDnodeTheme.Buffer self() {
            return this;
        }

        protected BNDnodeTheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("NVGcolor")
        public NVGColor nodeSelectedColor() {
            return BNDnodeTheme.nnodeSelectedColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor wiresColor() {
            return BNDnodeTheme.nwiresColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor textSelectedColor() {
            return BNDnodeTheme.ntextSelectedColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor activeNodeColor() {
            return BNDnodeTheme.nactiveNodeColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor wireSelectColor() {
            return BNDnodeTheme.nwireSelectColor(this.address());
        }

        @NativeType("NVGcolor")
        public NVGColor nodeBackdropColor() {
            return BNDnodeTheme.nnodeBackdropColor(this.address());
        }

        public int noodleCurving() {
            return BNDnodeTheme.nnoodleCurving(this.address());
        }

        public BNDnodeTheme.Buffer nodeSelectedColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDnodeTheme.nnodeSelectedColor(this.address(), var1);
            return this;
        }

        public BNDnodeTheme.Buffer nodeSelectedColor(Consumer<NVGColor> var1) {
            var1.accept(this.nodeSelectedColor());
            return this;
        }

        public BNDnodeTheme.Buffer wiresColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDnodeTheme.nwiresColor(this.address(), var1);
            return this;
        }

        public BNDnodeTheme.Buffer wiresColor(Consumer<NVGColor> var1) {
            var1.accept(this.wiresColor());
            return this;
        }

        public BNDnodeTheme.Buffer textSelectedColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDnodeTheme.ntextSelectedColor(this.address(), var1);
            return this;
        }

        public BNDnodeTheme.Buffer textSelectedColor(Consumer<NVGColor> var1) {
            var1.accept(this.textSelectedColor());
            return this;
        }

        public BNDnodeTheme.Buffer activeNodeColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDnodeTheme.nactiveNodeColor(this.address(), var1);
            return this;
        }

        public BNDnodeTheme.Buffer activeNodeColor(Consumer<NVGColor> var1) {
            var1.accept(this.activeNodeColor());
            return this;
        }

        public BNDnodeTheme.Buffer wireSelectColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDnodeTheme.nwireSelectColor(this.address(), var1);
            return this;
        }

        public BNDnodeTheme.Buffer wireSelectColor(Consumer<NVGColor> var1) {
            var1.accept(this.wireSelectColor());
            return this;
        }

        public BNDnodeTheme.Buffer nodeBackdropColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDnodeTheme.nnodeBackdropColor(this.address(), var1);
            return this;
        }

        public BNDnodeTheme.Buffer nodeBackdropColor(Consumer<NVGColor> var1) {
            var1.accept(this.nodeBackdropColor());
            return this;
        }

        public BNDnodeTheme.Buffer noodleCurving(int var1) {
            BNDnodeTheme.nnoodleCurving(this.address(), var1);
            return this;
        }
    }
}
