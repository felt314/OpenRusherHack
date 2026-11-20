package org.lwjgl.nanovg;

import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NanoVGGLES3 {
    public static final int NVG_ANTIALIAS = 1;
    public static final int NVG_STENCIL_STROKES = 2;
    public static final int NVG_DEBUG = 4;
    public static final int NVG_IMAGE_NODELETE = 65536;

    protected NanoVGGLES3() {
        throw new UnsupportedOperationException();
    }

    public static native int nnvglCreateImageFromHandle(long var0, int var2, int var3, int var4, int var5);

    public static int nvglCreateImageFromHandle(@NativeType("NVGcontext *") long var0, @NativeType("GLuint") int var2, int var3, int var4, int var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        return nnvglCreateImageFromHandle(var0, var2, var3, var4, var5);
    }

    public static native int nnvglImageHandle(long var0, int var2);

    @NativeType("GLuint")
    public static int nvglImageHandle(@NativeType("NVGcontext *") long var0, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        return nnvglImageHandle(var0, var2);
    }

    public static native long nnvgCreate(int var0);

    @NativeType("NVGcontext *")
    public static long nvgCreate(int var0) {
        return nnvgCreate(var0);
    }

    public static native void nnvgDelete(long var0);

    public static void nvgDelete(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgDelete(var0);
    }

    public static native long nnvgluCreateFramebuffer(long var0, int var2, int var3, int var4);

    
    @NativeType("NVGLUframebuffer *")
    public static NVGLUFramebuffer nvgluCreateFramebuffer(@NativeType("NVGcontext *") long var0, int var2, int var3, int var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        long var5 = nnvgluCreateFramebuffer(var0, var2, var3, var4);
        return NVGLUFramebuffer.createSafe(var5);
    }

    public static native void nnvgluBindFramebuffer(long var0, long var2);

    public static void nvgluBindFramebuffer(@NativeType("NVGcontext *") long var0, @NativeType("NVGLUframebuffer *") NVGLUFramebuffer var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgluBindFramebuffer(var0, MemoryUtil.memAddressSafe(var2));
    }

    public static native void nnvgluDeleteFramebuffer(long var0, long var2);

    public static void nvgluDeleteFramebuffer(@NativeType("NVGcontext *") long var0, @NativeType("NVGLUframebuffer *") NVGLUFramebuffer var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgluDeleteFramebuffer(var0, var2.address());
    }

    static {
        LibNanoVG.initialize();
    }
}
