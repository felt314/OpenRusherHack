package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NVGLUframebuffer")
public class NVGLUFramebufferBGFX extends Struct<NVGLUFramebufferBGFX> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CTX;
    public static final int HANDLE;
    public static final int IMAGE;
    public static final int VIEWID;

    protected NVGLUFramebufferBGFX(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NVGLUFramebufferBGFX create(long var1, ByteBuffer var3) {
        return new NVGLUFramebufferBGFX(var1, var3);
    }

    public NVGLUFramebufferBGFX(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("NVGcontext *")
    public long ctx() {
        return nctx(this.address());
    }

    @NativeType("bgfx_frame_buffer_handle_t")
    public short handle() {
        return nhandle(this.address());
    }

    public int image() {
        return nimage(this.address());
    }

    @NativeType("bgfx_view_id_t")
    public short viewId() {
        return nviewId(this.address());
    }

    public static NVGLUFramebufferBGFX create(long var0) {
        return new NVGLUFramebufferBGFX(var0, null);
    }

    
    public static NVGLUFramebufferBGFX createSafe(long var0) {
        return var0 == 0L ? null : new NVGLUFramebufferBGFX(var0, null);
    }

    public static NVGLUFramebufferBGFX.Buffer create(long var0, int var2) {
        return new NVGLUFramebufferBGFX.Buffer(var0, var2);
    }

    
    public static NVGLUFramebufferBGFX.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NVGLUFramebufferBGFX.Buffer(var0, var2);
    }

    public static long nctx(long var0) {
        return MemoryUtil.memGetAddress(var0 + CTX);
    }

    public static short nhandle(long var0) {
        return UNSAFE.getShort(null, var0 + HANDLE);
    }

    public static int nimage(long var0) {
        return UNSAFE.getInt(null, var0 + IMAGE);
    }

    public static short nviewId(long var0) {
        return UNSAFE.getShort(null, var0 + VIEWID);
    }

    static {
        Layout var0 = __struct(new Member[]{__member(POINTER_SIZE), __member(2), __member(4), __member(2)});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        CTX = var0.offsetof(0);
        HANDLE = var0.offsetof(1);
        IMAGE = var0.offsetof(2);
        VIEWID = var0.offsetof(3);
    }

    public static class Buffer extends StructBuffer<NVGLUFramebufferBGFX, NVGLUFramebufferBGFX.Buffer> {
        private static final NVGLUFramebufferBGFX ELEMENT_FACTORY = NVGLUFramebufferBGFX.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NVGLUFramebufferBGFX.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NVGLUFramebufferBGFX.Buffer self() {
            return this;
        }

        protected NVGLUFramebufferBGFX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("NVGcontext *")
        public long ctx() {
            return NVGLUFramebufferBGFX.nctx(this.address());
        }

        @NativeType("bgfx_frame_buffer_handle_t")
        public short handle() {
            return NVGLUFramebufferBGFX.nhandle(this.address());
        }

        public int image() {
            return NVGLUFramebufferBGFX.nimage(this.address());
        }

        @NativeType("bgfx_view_id_t")
        public short viewId() {
            return NVGLUFramebufferBGFX.nviewId(this.address());
        }
    }
}
