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

public class BNDtheme extends Struct<BNDtheme> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BACKGROUNDCOLOR;
    public static final int REGULARTHEME;
    public static final int TOOLTHEME;
    public static final int RADIOTHEME;
    public static final int TEXTFIELDTHEME;
    public static final int OPTIONTHEME;
    public static final int CHOICETHEME;
    public static final int NUMBERFIELDTHEME;
    public static final int SLIDERTHEME;
    public static final int SCROLLBARTHEME;
    public static final int TOOLTIPTHEME;
    public static final int MENUTHEME;
    public static final int MENUITEMTHEME;
    public static final int NODETHEME;

    protected BNDtheme(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected BNDtheme create(long var1, ByteBuffer var3) {
        return new BNDtheme(var1, var3);
    }

    public BNDtheme(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("NVGcolor")
    public NVGColor backgroundColor() {
        return nbackgroundColor(this.address());
    }

    public BNDwidgetTheme regularTheme() {
        return nregularTheme(this.address());
    }

    public BNDwidgetTheme toolTheme() {
        return ntoolTheme(this.address());
    }

    public BNDwidgetTheme radioTheme() {
        return nradioTheme(this.address());
    }

    public BNDwidgetTheme textFieldTheme() {
        return ntextFieldTheme(this.address());
    }

    public BNDwidgetTheme optionTheme() {
        return noptionTheme(this.address());
    }

    public BNDwidgetTheme choiceTheme() {
        return nchoiceTheme(this.address());
    }

    public BNDwidgetTheme numberFieldTheme() {
        return nnumberFieldTheme(this.address());
    }

    public BNDwidgetTheme sliderTheme() {
        return nsliderTheme(this.address());
    }

    public BNDwidgetTheme scrollBarTheme() {
        return nscrollBarTheme(this.address());
    }

    public BNDwidgetTheme tooltipTheme() {
        return ntooltipTheme(this.address());
    }

    public BNDwidgetTheme menuTheme() {
        return nmenuTheme(this.address());
    }

    public BNDwidgetTheme menuItemTheme() {
        return nmenuItemTheme(this.address());
    }

    public BNDnodeTheme nodeTheme() {
        return nnodeTheme(this.address());
    }

    public BNDtheme backgroundColor(@NativeType("NVGcolor") NVGColor var1) {
        nbackgroundColor(this.address(), var1);
        return this;
    }

    public BNDtheme backgroundColor(Consumer<NVGColor> var1) {
        var1.accept(this.backgroundColor());
        return this;
    }

    public BNDtheme regularTheme(BNDwidgetTheme var1) {
        nregularTheme(this.address(), var1);
        return this;
    }

    public BNDtheme regularTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.regularTheme());
        return this;
    }

    public BNDtheme toolTheme(BNDwidgetTheme var1) {
        ntoolTheme(this.address(), var1);
        return this;
    }

    public BNDtheme toolTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.toolTheme());
        return this;
    }

    public BNDtheme radioTheme(BNDwidgetTheme var1) {
        nradioTheme(this.address(), var1);
        return this;
    }

    public BNDtheme radioTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.radioTheme());
        return this;
    }

    public BNDtheme textFieldTheme(BNDwidgetTheme var1) {
        ntextFieldTheme(this.address(), var1);
        return this;
    }

    public BNDtheme textFieldTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.textFieldTheme());
        return this;
    }

    public BNDtheme optionTheme(BNDwidgetTheme var1) {
        noptionTheme(this.address(), var1);
        return this;
    }

    public BNDtheme optionTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.optionTheme());
        return this;
    }

    public BNDtheme choiceTheme(BNDwidgetTheme var1) {
        nchoiceTheme(this.address(), var1);
        return this;
    }

    public BNDtheme choiceTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.choiceTheme());
        return this;
    }

    public BNDtheme numberFieldTheme(BNDwidgetTheme var1) {
        nnumberFieldTheme(this.address(), var1);
        return this;
    }

    public BNDtheme numberFieldTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.numberFieldTheme());
        return this;
    }

    public BNDtheme sliderTheme(BNDwidgetTheme var1) {
        nsliderTheme(this.address(), var1);
        return this;
    }

    public BNDtheme sliderTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.sliderTheme());
        return this;
    }

    public BNDtheme scrollBarTheme(BNDwidgetTheme var1) {
        nscrollBarTheme(this.address(), var1);
        return this;
    }

    public BNDtheme scrollBarTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.scrollBarTheme());
        return this;
    }

    public BNDtheme tooltipTheme(BNDwidgetTheme var1) {
        ntooltipTheme(this.address(), var1);
        return this;
    }

    public BNDtheme tooltipTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.tooltipTheme());
        return this;
    }

    public BNDtheme menuTheme(BNDwidgetTheme var1) {
        nmenuTheme(this.address(), var1);
        return this;
    }

    public BNDtheme menuTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.menuTheme());
        return this;
    }

    public BNDtheme menuItemTheme(BNDwidgetTheme var1) {
        nmenuItemTheme(this.address(), var1);
        return this;
    }

    public BNDtheme menuItemTheme(Consumer<BNDwidgetTheme> var1) {
        var1.accept(this.menuItemTheme());
        return this;
    }

    public BNDtheme nodeTheme(BNDnodeTheme var1) {
        nnodeTheme(this.address(), var1);
        return this;
    }

    public BNDtheme nodeTheme(Consumer<BNDnodeTheme> var1) {
        var1.accept(this.nodeTheme());
        return this;
    }

    public BNDtheme set(
        NVGColor var1,
        BNDwidgetTheme var2,
        BNDwidgetTheme var3,
        BNDwidgetTheme var4,
        BNDwidgetTheme var5,
        BNDwidgetTheme var6,
        BNDwidgetTheme var7,
        BNDwidgetTheme var8,
        BNDwidgetTheme var9,
        BNDwidgetTheme var10,
        BNDwidgetTheme var11,
        BNDwidgetTheme var12,
        BNDwidgetTheme var13,
        BNDnodeTheme var14
    ) {
        this.backgroundColor(var1);
        this.regularTheme(var2);
        this.toolTheme(var3);
        this.radioTheme(var4);
        this.textFieldTheme(var5);
        this.optionTheme(var6);
        this.choiceTheme(var7);
        this.numberFieldTheme(var8);
        this.sliderTheme(var9);
        this.scrollBarTheme(var10);
        this.tooltipTheme(var11);
        this.menuTheme(var12);
        this.menuItemTheme(var13);
        this.nodeTheme(var14);
        return this;
    }

    public BNDtheme set(BNDtheme var1) {
        MemoryUtil.memCopy(var1.address(), this.address(), SIZEOF);
        return this;
    }

    public static BNDtheme malloc() {
        return new BNDtheme(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static BNDtheme calloc() {
        return new BNDtheme(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static BNDtheme create() {
        ByteBuffer var0 = BufferUtils.createByteBuffer(SIZEOF);
        return new BNDtheme(MemoryUtil.memAddress(var0), var0);
    }

    public static BNDtheme create(long var0) {
        return new BNDtheme(var0, null);
    }

    
    public static BNDtheme createSafe(long var0) {
        return var0 == 0L ? null : new BNDtheme(var0, null);
    }

    public static BNDtheme.Buffer malloc(int var0) {
        return new BNDtheme.Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(var0, SIZEOF)), var0);
    }

    public static BNDtheme.Buffer calloc(int var0) {
        return new BNDtheme.Buffer(MemoryUtil.nmemCallocChecked(var0, SIZEOF), var0);
    }

    public static BNDtheme.Buffer create(int var0) {
        ByteBuffer var1 = __create(var0, SIZEOF);
        return new BNDtheme.Buffer(MemoryUtil.memAddress(var1), var1, -1, 0, var0, var0);
    }

    public static BNDtheme.Buffer create(long var0, int var2) {
        return new BNDtheme.Buffer(var0, var2);
    }

    
    public static BNDtheme.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new BNDtheme.Buffer(var0, var2);
    }

    @Deprecated
    public static BNDtheme mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDtheme callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDtheme mallocStack(MemoryStack var0) {
        return malloc(var0);
    }

    @Deprecated
    public static BNDtheme callocStack(MemoryStack var0) {
        return calloc(var0);
    }

    @Deprecated
    public static BNDtheme.Buffer mallocStack(int var0) {
        return malloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDtheme.Buffer callocStack(int var0) {
        return calloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDtheme.Buffer mallocStack(int var0, MemoryStack var1) {
        return malloc(var0, var1);
    }

    @Deprecated
    public static BNDtheme.Buffer callocStack(int var0, MemoryStack var1) {
        return calloc(var0, var1);
    }

    public static BNDtheme malloc(MemoryStack var0) {
        return new BNDtheme(var0.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static BNDtheme calloc(MemoryStack var0) {
        return new BNDtheme(var0.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static BNDtheme.Buffer malloc(int var0, MemoryStack var1) {
        return new BNDtheme.Buffer(var1.nmalloc(ALIGNOF, var0 * SIZEOF), var0);
    }

    public static BNDtheme.Buffer calloc(int var0, MemoryStack var1) {
        return new BNDtheme.Buffer(var1.ncalloc(ALIGNOF, var0, SIZEOF), var0);
    }

    public static NVGColor nbackgroundColor(long var0) {
        return NVGColor.create(var0 + BACKGROUNDCOLOR);
    }

    public static BNDwidgetTheme nregularTheme(long var0) {
        return BNDwidgetTheme.create(var0 + REGULARTHEME);
    }

    public static BNDwidgetTheme ntoolTheme(long var0) {
        return BNDwidgetTheme.create(var0 + TOOLTHEME);
    }

    public static BNDwidgetTheme nradioTheme(long var0) {
        return BNDwidgetTheme.create(var0 + RADIOTHEME);
    }

    public static BNDwidgetTheme ntextFieldTheme(long var0) {
        return BNDwidgetTheme.create(var0 + TEXTFIELDTHEME);
    }

    public static BNDwidgetTheme noptionTheme(long var0) {
        return BNDwidgetTheme.create(var0 + OPTIONTHEME);
    }

    public static BNDwidgetTheme nchoiceTheme(long var0) {
        return BNDwidgetTheme.create(var0 + CHOICETHEME);
    }

    public static BNDwidgetTheme nnumberFieldTheme(long var0) {
        return BNDwidgetTheme.create(var0 + NUMBERFIELDTHEME);
    }

    public static BNDwidgetTheme nsliderTheme(long var0) {
        return BNDwidgetTheme.create(var0 + SLIDERTHEME);
    }

    public static BNDwidgetTheme nscrollBarTheme(long var0) {
        return BNDwidgetTheme.create(var0 + SCROLLBARTHEME);
    }

    public static BNDwidgetTheme ntooltipTheme(long var0) {
        return BNDwidgetTheme.create(var0 + TOOLTIPTHEME);
    }

    public static BNDwidgetTheme nmenuTheme(long var0) {
        return BNDwidgetTheme.create(var0 + MENUTHEME);
    }

    public static BNDwidgetTheme nmenuItemTheme(long var0) {
        return BNDwidgetTheme.create(var0 + MENUITEMTHEME);
    }

    public static BNDnodeTheme nnodeTheme(long var0) {
        return BNDnodeTheme.create(var0 + NODETHEME);
    }

    public static void nbackgroundColor(long var0, NVGColor var2) {
        MemoryUtil.memCopy(var2.address(), var0 + BACKGROUNDCOLOR, NVGColor.SIZEOF);
    }

    public static void nregularTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + REGULARTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void ntoolTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + TOOLTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nradioTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + RADIOTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void ntextFieldTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + TEXTFIELDTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void noptionTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + OPTIONTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nchoiceTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + CHOICETHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nnumberFieldTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + NUMBERFIELDTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nsliderTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + SLIDERTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nscrollBarTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + SCROLLBARTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void ntooltipTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + TOOLTIPTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nmenuTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + MENUTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nmenuItemTheme(long var0, BNDwidgetTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + MENUITEMTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nnodeTheme(long var0, BNDnodeTheme var2) {
        MemoryUtil.memCopy(var2.address(), var0 + NODETHEME, BNDnodeTheme.SIZEOF);
    }

    static {
        Layout var0 = __struct(
            new Member[]{
                __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
                __member(BNDnodeTheme.SIZEOF, BNDnodeTheme.ALIGNOF)
            }
        );
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        BACKGROUNDCOLOR = var0.offsetof(0);
        REGULARTHEME = var0.offsetof(1);
        TOOLTHEME = var0.offsetof(2);
        RADIOTHEME = var0.offsetof(3);
        TEXTFIELDTHEME = var0.offsetof(4);
        OPTIONTHEME = var0.offsetof(5);
        CHOICETHEME = var0.offsetof(6);
        NUMBERFIELDTHEME = var0.offsetof(7);
        SLIDERTHEME = var0.offsetof(8);
        SCROLLBARTHEME = var0.offsetof(9);
        TOOLTIPTHEME = var0.offsetof(10);
        MENUTHEME = var0.offsetof(11);
        MENUITEMTHEME = var0.offsetof(12);
        NODETHEME = var0.offsetof(13);
    }

    public static class Buffer extends StructBuffer<BNDtheme, BNDtheme.Buffer> implements NativeResource {
        private static final BNDtheme ELEMENT_FACTORY = BNDtheme.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / BNDtheme.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected BNDtheme.Buffer self() {
            return this;
        }

        protected BNDtheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("NVGcolor")
        public NVGColor backgroundColor() {
            return BNDtheme.nbackgroundColor(this.address());
        }

        public BNDwidgetTheme regularTheme() {
            return BNDtheme.nregularTheme(this.address());
        }

        public BNDwidgetTheme toolTheme() {
            return BNDtheme.ntoolTheme(this.address());
        }

        public BNDwidgetTheme radioTheme() {
            return BNDtheme.nradioTheme(this.address());
        }

        public BNDwidgetTheme textFieldTheme() {
            return BNDtheme.ntextFieldTheme(this.address());
        }

        public BNDwidgetTheme optionTheme() {
            return BNDtheme.noptionTheme(this.address());
        }

        public BNDwidgetTheme choiceTheme() {
            return BNDtheme.nchoiceTheme(this.address());
        }

        public BNDwidgetTheme numberFieldTheme() {
            return BNDtheme.nnumberFieldTheme(this.address());
        }

        public BNDwidgetTheme sliderTheme() {
            return BNDtheme.nsliderTheme(this.address());
        }

        public BNDwidgetTheme scrollBarTheme() {
            return BNDtheme.nscrollBarTheme(this.address());
        }

        public BNDwidgetTheme tooltipTheme() {
            return BNDtheme.ntooltipTheme(this.address());
        }

        public BNDwidgetTheme menuTheme() {
            return BNDtheme.nmenuTheme(this.address());
        }

        public BNDwidgetTheme menuItemTheme() {
            return BNDtheme.nmenuItemTheme(this.address());
        }

        public BNDnodeTheme nodeTheme() {
            return BNDtheme.nnodeTheme(this.address());
        }

        public BNDtheme.Buffer backgroundColor(@NativeType("NVGcolor") NVGColor var1) {
            BNDtheme.nbackgroundColor(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer backgroundColor(Consumer<NVGColor> var1) {
            var1.accept(this.backgroundColor());
            return this;
        }

        public BNDtheme.Buffer regularTheme(BNDwidgetTheme var1) {
            BNDtheme.nregularTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer regularTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.regularTheme());
            return this;
        }

        public BNDtheme.Buffer toolTheme(BNDwidgetTheme var1) {
            BNDtheme.ntoolTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer toolTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.toolTheme());
            return this;
        }

        public BNDtheme.Buffer radioTheme(BNDwidgetTheme var1) {
            BNDtheme.nradioTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer radioTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.radioTheme());
            return this;
        }

        public BNDtheme.Buffer textFieldTheme(BNDwidgetTheme var1) {
            BNDtheme.ntextFieldTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer textFieldTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.textFieldTheme());
            return this;
        }

        public BNDtheme.Buffer optionTheme(BNDwidgetTheme var1) {
            BNDtheme.noptionTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer optionTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.optionTheme());
            return this;
        }

        public BNDtheme.Buffer choiceTheme(BNDwidgetTheme var1) {
            BNDtheme.nchoiceTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer choiceTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.choiceTheme());
            return this;
        }

        public BNDtheme.Buffer numberFieldTheme(BNDwidgetTheme var1) {
            BNDtheme.nnumberFieldTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer numberFieldTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.numberFieldTheme());
            return this;
        }

        public BNDtheme.Buffer sliderTheme(BNDwidgetTheme var1) {
            BNDtheme.nsliderTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer sliderTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.sliderTheme());
            return this;
        }

        public BNDtheme.Buffer scrollBarTheme(BNDwidgetTheme var1) {
            BNDtheme.nscrollBarTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer scrollBarTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.scrollBarTheme());
            return this;
        }

        public BNDtheme.Buffer tooltipTheme(BNDwidgetTheme var1) {
            BNDtheme.ntooltipTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer tooltipTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.tooltipTheme());
            return this;
        }

        public BNDtheme.Buffer menuTheme(BNDwidgetTheme var1) {
            BNDtheme.nmenuTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer menuTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.menuTheme());
            return this;
        }

        public BNDtheme.Buffer menuItemTheme(BNDwidgetTheme var1) {
            BNDtheme.nmenuItemTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer menuItemTheme(Consumer<BNDwidgetTheme> var1) {
            var1.accept(this.menuItemTheme());
            return this;
        }

        public BNDtheme.Buffer nodeTheme(BNDnodeTheme var1) {
            BNDtheme.nnodeTheme(this.address(), var1);
            return this;
        }

        public BNDtheme.Buffer nodeTheme(Consumer<BNDnodeTheme> var1) {
            var1.accept(this.nodeTheme());
            return this;
        }
    }
}
