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

@NativeType("struct UIrect")
public class UIRect extends Struct<UIRect> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int f011;
    public static final int f012;
    public static final int f013;
    public static final int f014;
    public static final int f015;

    protected UIRect(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected UIRect create(long var1, ByteBuffer var3) {
        return new UIRect(var1, var3);
    }

    public UIRect(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("int[4]")
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

    public int m039() {
        return m063(this.address());
    }

    public int m040() {
        return m064(this.address());
    }

    public UIRect m053(@NativeType("int[4]") IntBuffer var1) {
        m065(this.address(), var1);
        return this;
    }

    public UIRect m054(int var1, int var2) {
        m066(this.address(), var1, var2);
        return this;
    }

    public UIRect m055(int var1) {
        m067(this.address(), var1);
        return this;
    }

    public UIRect m056(int var1) {
        m068(this.address(), var1);
        return this;
    }

    public UIRect m057(int var1) {
        m069(this.address(), var1);
        return this;
    }

    public UIRect m058(int var1) {
        m070(this.address(), var1);
        return this;
    }

    public UIRect set(UIRect var1) {
        MemoryUtil.memCopy(var1.address(), this.address(), SIZEOF);
        return this;
    }

    public static UIRect malloc() {
        return new UIRect(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static UIRect calloc() {
        return new UIRect(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static UIRect create() {
        ByteBuffer var0 = BufferUtils.createByteBuffer(SIZEOF);
        return new UIRect(MemoryUtil.memAddress(var0), var0);
    }

    public static UIRect create(long var0) {
        return new UIRect(var0, null);
    }

    
    public static UIRect createSafe(long var0) {
        return var0 == 0L ? null : new UIRect(var0, null);
    }

    public static UIRect.Buffer malloc(int var0) {
        return new UIRect.Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(var0, SIZEOF)), var0);
    }

    public static UIRect.Buffer calloc(int var0) {
        return new UIRect.Buffer(MemoryUtil.nmemCallocChecked(var0, SIZEOF), var0);
    }

    public static UIRect.Buffer create(int var0) {
        ByteBuffer var1 = __create(var0, SIZEOF);
        return new UIRect.Buffer(MemoryUtil.memAddress(var1), var1, -1, 0, var0, var0);
    }

    public static UIRect.Buffer create(long var0, int var2) {
        return new UIRect.Buffer(var0, var2);
    }

    
    public static UIRect.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new UIRect.Buffer(var0, var2);
    }

    @Deprecated
    public static UIRect mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static UIRect callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static UIRect mallocStack(MemoryStack var0) {
        return malloc(var0);
    }

    @Deprecated
    public static UIRect callocStack(MemoryStack var0) {
        return calloc(var0);
    }

    @Deprecated
    public static UIRect.Buffer mallocStack(int var0) {
        return malloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static UIRect.Buffer callocStack(int var0) {
        return calloc(var0, MemoryStack.stackGet());
    }

    @Deprecated
    public static UIRect.Buffer mallocStack(int var0, MemoryStack var1) {
        return malloc(var0, var1);
    }

    @Deprecated
    public static UIRect.Buffer callocStack(int var0, MemoryStack var1) {
        return calloc(var0, var1);
    }

    public static UIRect malloc(MemoryStack var0) {
        return new UIRect(var0.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static UIRect calloc(MemoryStack var0) {
        return new UIRect(var0.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static UIRect.Buffer malloc(int var0, MemoryStack var1) {
        return new UIRect.Buffer(var1.nmalloc(ALIGNOF, var0 * SIZEOF), var0);
    }

    public static UIRect.Buffer calloc(int var0, MemoryStack var1) {
        return new UIRect.Buffer(var1.ncalloc(ALIGNOF, var0, SIZEOF), var0);
    }

    public static IntBuffer m059(long var0) {
        return MemoryUtil.memIntBuffer(var0 + f011, 4);
    }

    public static int m060(long var0, int var2) {
        return UNSAFE.getInt(null, var0 + f011 + Checks.check(var2, 4) * 4L);
    }

    public static int m061(long var0) {
        return UNSAFE.getInt(null, var0 + f012);
    }

    public static int m062(long var0) {
        return UNSAFE.getInt(null, var0 + f013);
    }

    public static int m063(long var0) {
        return UNSAFE.getInt(null, var0 + f014);
    }

    public static int m064(long var0) {
        return UNSAFE.getInt(null, var0 + f015);
    }

    public static void m065(long var0, IntBuffer var2) {
        if (Checks.CHECKS) {
            Checks.checkGT(var2, 4);
        }

        MemoryUtil.memCopy(MemoryUtil.memAddress(var2), var0 + f011, var2.remaining() * 4);
    }

    public static void m066(long var0, int var2, int var3) {
        UNSAFE.putInt(null, var0 + f011 + Checks.check(var2, 4) * 4L, var3);
    }

    public static void m067(long var0, int var2) {
        UNSAFE.putInt(null, var0 + f012, var2);
    }

    public static void m068(long var0, int var2) {
        UNSAFE.putInt(null, var0 + f013, var2);
    }

    public static void m069(long var0, int var2) {
        UNSAFE.putInt(null, var0 + f014, var2);
    }

    public static void m070(long var0, int var2) {
        UNSAFE.putInt(null, var0 + f015, var2);
    }

    static {
        Layout var0 = __struct(new Member[]{__union(new Member[]{__array(4, 4), __struct(new Member[]{__member(4), __member(4), __member(4), __member(4)})})});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        f011 = var0.offsetof(1);
        f012 = var0.offsetof(3);
        f013 = var0.offsetof(4);
        f014 = var0.offsetof(5);
        f015 = var0.offsetof(6);
    }

    public static class Buffer extends StructBuffer<UIRect, UIRect.Buffer> implements NativeResource {
        private static final UIRect ELEMENT_FACTORY = UIRect.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / UIRect.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected UIRect.Buffer self() {
            return this;
        }

        protected UIRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int[4]")
        public IntBuffer m035() {
            return UIRect.m059(this.address());
        }

        public int m036(int var1) {
            return UIRect.m060(this.address(), var1);
        }

        public int m037() {
            return UIRect.m061(this.address());
        }

        public int m038() {
            return UIRect.m062(this.address());
        }

        public int m039() {
            return UIRect.m063(this.address());
        }

        public int m040() {
            return UIRect.m064(this.address());
        }

        public UIRect.Buffer m041(@NativeType("int[4]") IntBuffer var1) {
            UIRect.m065(this.address(), var1);
            return this;
        }

        public UIRect.Buffer m042(int var1, int var2) {
            UIRect.m066(this.address(), var1, var2);
            return this;
        }

        public UIRect.Buffer m043(int var1) {
            UIRect.m067(this.address(), var1);
            return this;
        }

        public UIRect.Buffer m044(int var1) {
            UIRect.m068(this.address(), var1);
            return this;
        }

        public UIRect.Buffer m045(int var1) {
            UIRect.m069(this.address(), var1);
            return this;
        }

        public UIRect.Buffer m046(int var1) {
            UIRect.m070(this.address(), var1);
            return this;
        }
    }
}
