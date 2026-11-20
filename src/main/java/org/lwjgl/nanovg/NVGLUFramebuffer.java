package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct NVGLUframebuffer")
public class NVGLUFramebuffer extends Struct<NVGLUFramebuffer> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FBO;
    public static final int RBO;
    public static final int TEXTURE;
    public static final int IMAGE;

    protected NVGLUFramebuffer(long var1, ByteBuffer var3) {
        super(var1, var3);
    }

    protected NVGLUFramebuffer create(long var1, ByteBuffer var3) {
        return new NVGLUFramebuffer(var1, var3);
    }

    public NVGLUFramebuffer(ByteBuffer var1) {
        super(MemoryUtil.memAddress(var1), __checkContainer(var1, SIZEOF));
    }

    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("GLuint")
    public int fbo() {
        return nfbo(this.address());
    }

    @NativeType("GLuint")
    public int rbo() {
        return nrbo(this.address());
    }

    @NativeType("GLuint")
    public int texture() {
        return ntexture(this.address());
    }

    public int image() {
        return nimage(this.address());
    }

    public static NVGLUFramebuffer create(long var0) {
        return new NVGLUFramebuffer(var0, null);
    }

    
    public static NVGLUFramebuffer createSafe(long var0) {
        return var0 == 0L ? null : new NVGLUFramebuffer(var0, null);
    }

    public static NVGLUFramebuffer.Buffer create(long var0, int var2) {
        return new NVGLUFramebuffer.Buffer(var0, var2);
    }

    
    public static NVGLUFramebuffer.Buffer createSafe(long var0, int var2) {
        return var0 == 0L ? null : new NVGLUFramebuffer.Buffer(var0, var2);
    }

    public static int nfbo(long var0) {
        return UNSAFE.getInt(null, var0 + FBO);
    }

    public static int nrbo(long var0) {
        return UNSAFE.getInt(null, var0 + RBO);
    }

    public static int ntexture(long var0) {
        return UNSAFE.getInt(null, var0 + TEXTURE);
    }

    public static int nimage(long var0) {
        return UNSAFE.getInt(null, var0 + IMAGE);
    }

    static {
        Layout var0 = __struct(new Member[]{__member(4), __member(4), __member(4), __member(4)});
        SIZEOF = var0.getSize();
        ALIGNOF = var0.getAlignment();
        FBO = var0.offsetof(0);
        RBO = var0.offsetof(1);
        TEXTURE = var0.offsetof(2);
        IMAGE = var0.offsetof(3);
    }

    public static class Buffer extends StructBuffer<NVGLUFramebuffer, NVGLUFramebuffer.Buffer> {
        private static final NVGLUFramebuffer ELEMENT_FACTORY = NVGLUFramebuffer.create(-1L);

        public Buffer(ByteBuffer var1) {
            super(var1, var1.remaining() / NVGLUFramebuffer.SIZEOF);
        }

        public Buffer(long var1, int var3) {
            super(var1, null, -1, 0, var3, var3);
        }

        Buffer(long var1, ByteBuffer var3, int var4, int var5, int var6, int var7) {
            super(var1, var3, var4, var5, var6, var7);
        }

        protected NVGLUFramebuffer.Buffer self() {
            return this;
        }

        protected NVGLUFramebuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("GLuint")
        public int fbo() {
            return NVGLUFramebuffer.nfbo(this.address());
        }

        @NativeType("GLuint")
        public int rbo() {
            return NVGLUFramebuffer.nrbo(this.address());
        }

        @NativeType("GLuint")
        public int texture() {
            return NVGLUFramebuffer.ntexture(this.address());
        }

        public int image() {
            return NVGLUFramebuffer.nimage(this.address());
        }
    }
}
