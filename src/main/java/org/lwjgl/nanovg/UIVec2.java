package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct UIvec2")
public class UIVec2 extends Struct<UIVec2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int f016;
    public static final int f017;
    public static final int f018;

    protected UIVec2(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected UIVec2 create(long var1, ByteBuffer var3) {
        return new UIVec2(var1, var3);
    }

    public UIVec2(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("int[2]")
    public IntBuffer m035() {
        return m059(this.address());
    }

    public int m036(int var1) {
        return m060(this.address(), var1);
    }

    public int m037() {
        return m061(this.address());
    }

    public int m038() {
        return m062(this.address());
    }

    public UIVec2 m083(@NativeType("int[2]") IntBuffer var1) {
        m065(this.address(), var1);
        return this;
    }

    public UIVec2 m084(int var1, int var2) {
        m066(this.address(), var1, var2);
        return this;
    }

    public UIVec2 m085(int var1) {
        m067(this.address(), var1);
        return this;
    }

    public UIVec2 m086(int var1) {
        m068(this.address(), var1);
        return this;
    }

    public UIVec2 set(UIVec2 var1) {
        MemoryUtil.memCopy(var1.address(), this.address(), SIZEOF);
        return this;
    }

    public static UIVec2 malloc() {
        return new UIVec2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static UIVec2 calloc() {
        return new UIVec2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static UIVec2 create() {
        ByteBuffer var0 = BufferUtils.createByteBuffer(SIZEOF);
        return new UIVec2(MemoryUtil.memAddress(var0), var0);
    }

    public static UIVec2 create(long var0) {
        return new UIVec2(var0, null);
    }

    
    public static UIVec2 createSafe(long var0) {
        return var0 == 0L ? null : new UIVec2(var0, null);
    }

    public static UIVec2.Buffer malloc(int var0) {
        return new UIVec2.Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(var0, SIZEOF)), var0);
    }

    public static UIVec2.Buffer calloc(int var0) {
        return new UIVec2.Buffer(MemoryUtil.nmemCallocChecked(var0, SIZEOF), var0);
    }

    public static UIVec2.Buffer create(int var0) {
        ByteBuffer var1 = __create(var0, SIZEOF);
        return new UIVec2.Buffer(MemoryUtil.memAddress(var1), var1, -1, 0, var0, var0);
    }

    public static UIVec2.Buffer create(long var0, int var2) {
        return new UIVec2.Buffer(var0, var2);
    }

    
    public static UIVec2.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new UIVec2.Buffer(var0, var2);
    }

    @Deprecated
    public static UIVec2 mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static UIVec2 callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static UIVec2 mallocStack(MemoryStack var0) {
        return malloc(var0);
    }

    @Deprecated
    public static UIVec2 callocStack(MemoryStack var0) {
        return calloc(var0);
    }

    @Deprecated
    public static UIVec2.Buffer mallocStack(int var0) {
        return malloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static UIVec2.Buffer callocStack(int var0) {
        return calloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static UIVec2.Buffer mallocStack(int var0, MemoryStack var1) {
        return malloc(var0, var1);
    }

    @Deprecated
    public static UIVec2.Buffer callocStack(int var0, MemoryStack var1) {
        return calloc(var0, var1);
    }

    public static UIVec2 malloc(MemoryStack var0) {
        return new UIVec2(var0.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static UIVec2 calloc(MemoryStack var0) {
        return new UIVec2(var0.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static UIVec2.Buffer malloc(int var0, MemoryStack var1) {
        return new UIVec2.Buffer(var1.nmalloc(ALIGNOF, var0 * SIZEOF), var0);
    }

    public static UIVec2.Buffer calloc(int var0, MemoryStack var1) {
        return new UIVec2.Buffer(var1.ncalloc(ALIGNOF, var0, SIZEOF), var0);
    }

    public static IntBuffer m059(long var0) {
        return MemoryUtil.memIntBuffer(var0 + f016, 2);
    }

    public static int m060(long var0, int var2) {
        return UNSAFE.getInt(null, var0 + f016 + Checks.check(var2, 2) * 4L);
    }

    public static int m061(long var0) {
        return UNSAFE.getInt(null, var0 + f017);
    }

    public static int m062(long var0) {
        return UNSAFE.getInt(null, var0 + f018);
    }

    public static void m065(long var0, IntBuffer var2) {
        if (Checks.CHECKS) {
            Checks.checkGT(var2, 2);
        }

        MemoryUtil.memCopy(MemoryUtil.memAddress(var2), var0 + f016, var2.remaining() * 4);
    }

    public static void m066(long var0, int var2, int var3) {
        UNSAFE.putInt(null, var0 + f016 + Checks.check(var2, 2) * 4L, var3);
    }

    public static void m067(long var0, int var2) {
        UNSAFE.putInt(null, var0 + f017, var2);
    }

    public static void m068(long var0, int var2) {
        UNSAFE.putInt(null, var0 + f018, var2);
    }

    static {
        Layout var0 = __struct(new Member[]{__union(new Member[]{__array(4, 2), __struct(new Member[]{__member(4), __member(4)})})});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        f016 = var0.offsetof(1);
        f017 = var0.offsetof(3);
        f018 = var0.offsetof(4);
    }

    public static class Buffer extends StructBuffer<UIVec2, UIVec2.Buffer> implements NativeResource {
        private static final UIVec2 ELEMENT_FACTORY = UIVec2.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / UIVec2.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected UIVec2.Buffer self() {
            return this;
        }

        protected UIVec2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int[2]")
        public IntBuffer m035() {
            return UIVec2.m059(this.address());
        }

        public int m036(int var1) {
            return UIVec2.m060(this.address(), var1);
        }

        public int m037() {
            return UIVec2.m061(this.address());
        }

        public int m038() {
            return UIVec2.m062(this.address());
        }

        public UIVec2.Buffer m075(@NativeType("int[2]") IntBuffer var1) {
            UIVec2.m065(this.address(), var1);
            return this;
        }

        public UIVec2.Buffer m076(int var1, int var2) {
            UIVec2.m066(this.address(), var1, var2);
            return this;
        }

        public UIVec2.Buffer m077(int var1) {
            UIVec2.m067(this.address(), var1);
            return this;
        }

        public UIVec2.Buffer m078(int var1) {
            UIVec2.m068(this.address(), var1);
            return this;
        }
    }
}
