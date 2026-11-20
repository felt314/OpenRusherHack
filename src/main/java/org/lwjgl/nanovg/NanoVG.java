package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.nanovg.NVGGlyphPosition.Buffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NanoVG {
    public static final float NVG_PI = (float) Math.PI;
    public static final int NVG_CCW = 1;
    public static final int NVG_CW = 2;
    public static final int NVG_SOLID = 1;
    public static final int NVG_HOLE = 2;
    public static final int NVG_BUTT = 0;
    public static final int NVG_ROUND = 1;
    public static final int NVG_SQUARE = 2;
    public static final int NVG_BEVEL = 3;
    public static final int NVG_MITER = 4;
    public static final int NVG_ALIGN_LEFT = 1;
    public static final int NVG_ALIGN_CENTER = 2;
    public static final int NVG_ALIGN_RIGHT = 4;
    public static final int NVG_ALIGN_TOP = 8;
    public static final int NVG_ALIGN_MIDDLE = 16;
    public static final int NVG_ALIGN_BOTTOM = 32;
    public static final int NVG_ALIGN_BASELINE = 64;
    public static final int NVG_ZERO = 1;
    public static final int NVG_ONE = 2;
    public static final int NVG_SRC_COLOR = 4;
    public static final int NVG_ONE_MINUS_SRC_COLOR = 8;
    public static final int NVG_DST_COLOR = 16;
    public static final int NVG_ONE_MINUS_DST_COLOR = 32;
    public static final int NVG_SRC_ALPHA = 64;
    public static final int NVG_ONE_MINUS_SRC_ALPHA = 128;
    public static final int NVG_DST_ALPHA = 256;
    public static final int NVG_ONE_MINUS_DST_ALPHA = 512;
    public static final int NVG_SRC_ALPHA_SATURATE = 1024;
    public static final int NVG_SOURCE_OVER = 0;
    public static final int NVG_SOURCE_IN = 1;
    public static final int NVG_SOURCE_OUT = 2;
    public static final int NVG_ATOP = 3;
    public static final int NVG_DESTINATION_OVER = 4;
    public static final int NVG_DESTINATION_IN = 5;
    public static final int NVG_DESTINATION_OUT = 6;
    public static final int NVG_DESTINATION_ATOP = 7;
    public static final int NVG_LIGHTER = 8;
    public static final int NVG_COPY = 9;
    public static final int NVG_XOR = 10;
    public static final int NVG_IMAGE_GENERATE_MIPMAPS = 1;
    public static final int NVG_IMAGE_REPEATX = 2;
    public static final int NVG_IMAGE_REPEATY = 4;
    public static final int NVG_IMAGE_FLIPY = 8;
    public static final int NVG_IMAGE_PREMULTIPLIED = 16;
    public static final int NVG_IMAGE_NEAREST = 32;
    static final long nvgCreateInternal = nvgCreateInternal();
    static final long nvgInternalParams = nvgInternalParams();
    static final long nvgDeleteInternal = nvgDeleteInternal();

    protected NanoVG() {
        throw new UnsupportedOperationException();
    }

    public static native void nnvgBeginFrame(long var0, float var2, float var3, float var4);

    public static void nvgBeginFrame(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgBeginFrame(var0, var2, var3, var4);
    }

    public static native void nnvgCancelFrame(long var0);

    public static void nvgCancelFrame(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgCancelFrame(var0);
    }

    public static native void nnvgEndFrame(long var0);

    public static void nvgEndFrame(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgEndFrame(var0);
    }

    public static native void nnvgGlobalCompositeOperation(long var0, int var2);

    public static void nvgGlobalCompositeOperation(@NativeType("NVGcontext *") long var0, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgGlobalCompositeOperation(var0, var2);
    }

    public static native void nnvgGlobalCompositeBlendFunc(long var0, int var2, int var3);

    public static void nvgGlobalCompositeBlendFunc(@NativeType("NVGcontext *") long var0, int var2, int var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgGlobalCompositeBlendFunc(var0, var2, var3);
    }

    public static native void nnvgGlobalCompositeBlendFuncSeparate(long var0, int var2, int var3, int var4, int var5);

    public static void nvgGlobalCompositeBlendFuncSeparate(@NativeType("NVGcontext *") long var0, int var2, int var3, int var4, int var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgGlobalCompositeBlendFuncSeparate(var0, var2, var3, var4, var5);
    }

    public static native void nnvgRGB(byte var0, byte var1, byte var2, long var3);

    @NativeType("NVGcolor")
    public static NVGColor nvgRGB(
        @NativeType("unsigned char") byte var0,
        @NativeType("unsigned char") byte var1,
        @NativeType("unsigned char") byte var2,
        @NativeType("NVGcolor") NVGColor var3
    ) {
        nnvgRGB(var0, var1, var2, var3.address());
        return var3;
    }

    public static native void nnvgRGBf(float var0, float var1, float var2, long var3);

    @NativeType("NVGcolor")
    public static NVGColor nvgRGBf(float var0, float var1, float var2, @NativeType("NVGcolor") NVGColor var3) {
        nnvgRGBf(var0, var1, var2, var3.address());
        return var3;
    }

    public static native void nnvgRGBA(byte var0, byte var1, byte var2, byte var3, long var4);

    @NativeType("NVGcolor")
    public static NVGColor nvgRGBA(
        @NativeType("unsigned char") byte var0,
        @NativeType("unsigned char") byte var1,
        @NativeType("unsigned char") byte var2,
        @NativeType("unsigned char") byte var3,
        @NativeType("NVGcolor") NVGColor var4
    ) {
        nnvgRGBA(var0, var1, var2, var3, var4.address());
        return var4;
    }

    public static native void nnvgRGBAf(float var0, float var1, float var2, float var3, long var4);

    @NativeType("NVGcolor")
    public static NVGColor nvgRGBAf(float var0, float var1, float var2, float var3, @NativeType("NVGcolor") NVGColor var4) {
        nnvgRGBAf(var0, var1, var2, var3, var4.address());
        return var4;
    }

    public static native void nnvgLerpRGBA(long var0, long var2, float var4, long var5);

    @NativeType("NVGcolor")
    public static NVGColor nvgLerpRGBA(
        @NativeType("NVGcolor") NVGColor var0, @NativeType("NVGcolor") NVGColor var1, float var2, @NativeType("NVGcolor") NVGColor var3
    ) {
        nnvgLerpRGBA(var0.address(), var1.address(), var2, var3.address());
        return var3;
    }

    public static native void nnvgTransRGBA(long var0, byte var2, long var3);

    @NativeType("NVGcolor")
    public static NVGColor nvgTransRGBA(@NativeType("NVGcolor") NVGColor var0, @NativeType("unsigned char") byte var1, @NativeType("NVGcolor") NVGColor var2) {
        nnvgTransRGBA(var0.address(), var1, var2.address());
        return var2;
    }

    public static native void nnvgTransRGBAf(long var0, float var2, long var3);

    @NativeType("NVGcolor")
    public static NVGColor nvgTransRGBAf(@NativeType("NVGcolor") NVGColor var0, float var1, @NativeType("NVGcolor") NVGColor var2) {
        nnvgTransRGBAf(var0.address(), var1, var2.address());
        return var2;
    }

    public static native void nnvgHSL(float var0, float var1, float var2, long var3);

    @NativeType("NVGcolor")
    public static NVGColor nvgHSL(float var0, float var1, float var2, @NativeType("NVGcolor") NVGColor var3) {
        nnvgHSL(var0, var1, var2, var3.address());
        return var3;
    }

    public static native void nnvgHSLA(float var0, float var1, float var2, byte var3, long var4);

    @NativeType("NVGcolor")
    public static NVGColor nvgHSLA(float var0, float var1, float var2, @NativeType("unsigned char") byte var3, @NativeType("NVGcolor") NVGColor var4) {
        nnvgHSLA(var0, var1, var2, var3, var4.address());
        return var4;
    }

    public static native void nnvgSave(long var0);

    public static void nvgSave(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgSave(var0);
    }

    public static native void nnvgRestore(long var0);

    public static void nvgRestore(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgRestore(var0);
    }

    public static native void nnvgReset(long var0);

    public static void nvgReset(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgReset(var0);
    }

    public static native void nnvgShapeAntiAlias(long var0, int var2);

    public static void nvgShapeAntiAlias(@NativeType("NVGcontext *") long var0, @NativeType("int") boolean var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgShapeAntiAlias(var0, var2 ? 1 : 0);
    }

    public static native void nnvgStrokeColor(long var0, long var2);

    public static void nvgStrokeColor(@NativeType("NVGcontext *") long var0, @NativeType("NVGcolor") NVGColor var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgStrokeColor(var0, var2.address());
    }

    public static native void nnvgStrokePaint(long var0, long var2);

    public static void nvgStrokePaint(@NativeType("NVGcontext *") long var0, @NativeType("NVGpaint") NVGPaint var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgStrokePaint(var0, var2.address());
    }

    public static native void nnvgFillColor(long var0, long var2);

    public static void nvgFillColor(@NativeType("NVGcontext *") long var0, @NativeType("NVGcolor") NVGColor var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgFillColor(var0, var2.address());
    }

    public static native void nnvgFillPaint(long var0, long var2);

    public static void nvgFillPaint(@NativeType("NVGcontext *") long var0, @NativeType("NVGpaint") NVGPaint var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgFillPaint(var0, var2.address());
    }

    public static native void nnvgMiterLimit(long var0, float var2);

    public static void nvgMiterLimit(@NativeType("NVGcontext *") long var0, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgMiterLimit(var0, var2);
    }

    public static native void nnvgStrokeWidth(long var0, float var2);

    public static void nvgStrokeWidth(@NativeType("NVGcontext *") long var0, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgStrokeWidth(var0, var2);
    }

    public static native void nnvgLineCap(long var0, int var2);

    public static void nvgLineCap(@NativeType("NVGcontext *") long var0, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgLineCap(var0, var2);
    }

    public static native void nnvgLineJoin(long var0, int var2);

    public static void nvgLineJoin(@NativeType("NVGcontext *") long var0, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgLineJoin(var0, var2);
    }

    public static native void nnvgGlobalAlpha(long var0, float var2);

    public static void nvgGlobalAlpha(@NativeType("NVGcontext *") long var0, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgGlobalAlpha(var0, var2);
    }

    public static native void nnvgResetTransform(long var0);

    public static void nvgResetTransform(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgResetTransform(var0);
    }

    public static native void nnvgTransform(long var0, float var2, float var3, float var4, float var5, float var6, float var7);

    public static void nvgTransform(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, float var6, float var7) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgTransform(var0, var2, var3, var4, var5, var6, var7);
    }

    public static native void nnvgTranslate(long var0, float var2, float var3);

    public static void nvgTranslate(@NativeType("NVGcontext *") long var0, float var2, float var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgTranslate(var0, var2, var3);
    }

    public static native void nnvgRotate(long var0, float var2);

    public static void nvgRotate(@NativeType("NVGcontext *") long var0, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgRotate(var0, var2);
    }

    public static native void nnvgSkewX(long var0, float var2);

    public static void nvgSkewX(@NativeType("NVGcontext *") long var0, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgSkewX(var0, var2);
    }

    public static native void nnvgSkewY(long var0, float var2);

    public static void nvgSkewY(@NativeType("NVGcontext *") long var0, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgSkewY(var0, var2);
    }

    public static native void nnvgScale(long var0, float var2, float var3);

    public static void nvgScale(@NativeType("NVGcontext *") long var0, float var2, float var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgScale(var0, var2, var3);
    }

    public static native void nnvgCurrentTransform(long var0, long var2);

    public static void nvgCurrentTransform(@NativeType("NVGcontext *") long var0, @NativeType("float *") FloatBuffer var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.check(var2, 6);
        }

        nnvgCurrentTransform(var0, MemoryUtil.memAddress(var2));
    }

    public static native void nnvgTransformIdentity(long var0);

    public static void nvgTransformIdentity(@NativeType("float *") FloatBuffer var0) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformIdentity(MemoryUtil.memAddress(var0));
    }

    public static native void nnvgTransformTranslate(long var0, float var2, float var3);

    public static void nvgTransformTranslate(@NativeType("float *") FloatBuffer var0, float var1, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformTranslate(MemoryUtil.memAddress(var0), var1, var2);
    }

    public static native void nnvgTransformScale(long var0, float var2, float var3);

    public static void nvgTransformScale(@NativeType("float *") FloatBuffer var0, float var1, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformScale(MemoryUtil.memAddress(var0), var1, var2);
    }

    public static native void nnvgTransformRotate(long var0, float var2);

    public static void nvgTransformRotate(@NativeType("float *") FloatBuffer var0, float var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformRotate(MemoryUtil.memAddress(var0), var1);
    }

    public static native void nnvgTransformSkewX(long var0, float var2);

    public static void nvgTransformSkewX(@NativeType("float *") FloatBuffer var0, float var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformSkewX(MemoryUtil.memAddress(var0), var1);
    }

    public static native void nnvgTransformSkewY(long var0, float var2);

    public static void nvgTransformSkewY(@NativeType("float *") FloatBuffer var0, float var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformSkewY(MemoryUtil.memAddress(var0), var1);
    }

    public static native void nnvgTransformMultiply(long var0, long var2);

    public static void nvgTransformMultiply(@NativeType("float *") FloatBuffer var0, @NativeType("float const *") FloatBuffer var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
            Checks.check(var1, 6);
        }

        nnvgTransformMultiply(MemoryUtil.memAddress(var0), MemoryUtil.memAddress(var1));
    }

    public static native void nnvgTransformPremultiply(long var0, long var2);

    public static void nvgTransformPremultiply(@NativeType("float *") FloatBuffer var0, @NativeType("float const *") FloatBuffer var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
            Checks.check(var1, 6);
        }

        nnvgTransformPremultiply(MemoryUtil.memAddress(var0), MemoryUtil.memAddress(var1));
    }

    public static native int nnvgTransformInverse(long var0, long var2);

    @NativeType("int")
    public static boolean nvgTransformInverse(@NativeType("float *") FloatBuffer var0, @NativeType("float const *") FloatBuffer var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
            Checks.check(var1, 6);
        }

        return nnvgTransformInverse(MemoryUtil.memAddress(var0), MemoryUtil.memAddress(var1)) != 0;
    }

    public static native void nnvgTransformPoint(long var0, long var2, long var4, float var6, float var7);

    public static void nvgTransformPoint(
        @NativeType("float *") FloatBuffer var0, @NativeType("float *") FloatBuffer var1, @NativeType("float const *") FloatBuffer var2, float var3, float var4
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0, 1);
            Checks.check(var1, 1);
            Checks.check(var2, 6);
        }

        nnvgTransformPoint(MemoryUtil.memAddress(var0), MemoryUtil.memAddress(var1), MemoryUtil.memAddress(var2), var3, var4);
    }

    public static native float nvgDegToRad(float var0);

    public static native float nvgRadToDeg(float var0);

    public static native int nnvgCreateImage(long var0, long var2, int var4);

    public static int nvgCreateImage(@NativeType("NVGcontext *") long var0, @NativeType("char const *") ByteBuffer var2, int var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1(var2);
        }

        return nnvgCreateImage(var0, MemoryUtil.memAddress(var2), var3);
    }

    public static int nvgCreateImage(@NativeType("NVGcontext *") long var0, @NativeType("char const *") CharSequence var2, int var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var4 = MemoryStack.stackGet();
        int var5 = var4.getPointer();

        int var8;
        try {
            var4.nASCII(var2, true);
            long var6 = var4.getPointerAddress();
            var8 = nnvgCreateImage(var0, var6, var3);
        } finally {
            var4.setPointer(var5);
        }

        return var8;
    }

    public static native int nnvgCreateImageMem(long var0, int var2, long var3, int var5);

    public static int nvgCreateImageMem(@NativeType("NVGcontext *") long var0, int var2, @NativeType("unsigned char *") ByteBuffer var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        return nnvgCreateImageMem(var0, var2, MemoryUtil.memAddress(var3), var3.remaining());
    }

    public static native int nnvgCreateImageRGBA(long var0, int var2, int var3, int var4, long var5);

    public static int nvgCreateImageRGBA(
        @NativeType("NVGcontext *") long var0, int var2, int var3, int var4, @NativeType("unsigned char const *") ByteBuffer var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.check(var5, var2 * var3 * 4);
        }

        return nnvgCreateImageRGBA(var0, var2, var3, var4, MemoryUtil.memAddress(var5));
    }

    public static native void nnvgUpdateImage(long var0, int var2, long var3);

    public static void nvgUpdateImage(@NativeType("NVGcontext *") long var0, int var2, @NativeType("unsigned char const *") ByteBuffer var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgUpdateImage(var0, var2, MemoryUtil.memAddress(var3));
    }

    public static native void nnvgImageSize(long var0, int var2, long var3, long var5);

    public static void nvgImageSize(@NativeType("NVGcontext *") long var0, int var2, @NativeType("int *") IntBuffer var3, @NativeType("int *") IntBuffer var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.check(var3, 1);
            Checks.check(var4, 1);
        }

        nnvgImageSize(var0, var2, MemoryUtil.memAddress(var3), MemoryUtil.memAddress(var4));
    }

    public static native void nnvgDeleteImage(long var0, int var2);

    public static void nvgDeleteImage(@NativeType("NVGcontext *") long var0, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgDeleteImage(var0, var2);
    }

    public static native void nnvgLinearGradient(long var0, float var2, float var3, float var4, float var5, long var6, long var8, long var10);

    @NativeType("NVGpaint")
    public static NVGPaint nvgLinearGradient(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        @NativeType("NVGcolor") NVGColor var6,
        @NativeType("NVGcolor") NVGColor var7,
        @NativeType("NVGpaint") NVGPaint var8
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgLinearGradient(var0, var2, var3, var4, var5, var6.address(), var7.address(), var8.address());
        return var8;
    }

    public static native void nnvgBoxGradient(
        long var0, float var2, float var3, float var4, float var5, float var6, float var7, long var8, long var10, long var12
    );

    @NativeType("NVGpaint")
    public static NVGPaint nvgBoxGradient(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        float var6,
        float var7,
        @NativeType("NVGcolor") NVGColor var8,
        @NativeType("NVGcolor") NVGColor var9,
        @NativeType("NVGpaint") NVGPaint var10
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgBoxGradient(var0, var2, var3, var4, var5, var6, var7, var8.address(), var9.address(), var10.address());
        return var10;
    }

    public static native void nnvgRadialGradient(long var0, float var2, float var3, float var4, float var5, long var6, long var8, long var10);

    @NativeType("NVGpaint")
    public static NVGPaint nvgRadialGradient(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        @NativeType("NVGcolor") NVGColor var6,
        @NativeType("NVGcolor") NVGColor var7,
        @NativeType("NVGpaint") NVGPaint var8
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgRadialGradient(var0, var2, var3, var4, var5, var6.address(), var7.address(), var8.address());
        return var8;
    }

    public static native void nnvgImagePattern(long var0, float var2, float var3, float var4, float var5, float var6, int var7, float var8, long var9);

    @NativeType("NVGpaint")
    public static NVGPaint nvgImagePattern(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        float var6,
        int var7,
        float var8,
        @NativeType("NVGpaint") NVGPaint var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgImagePattern(var0, var2, var3, var4, var5, var6, var7, var8, var9.address());
        return var9;
    }

    public static native void nnvgScissor(long var0, float var2, float var3, float var4, float var5);

    public static void nvgScissor(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgScissor(var0, var2, var3, var4, var5);
    }

    public static native void nnvgIntersectScissor(long var0, float var2, float var3, float var4, float var5);

    public static void nvgIntersectScissor(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgIntersectScissor(var0, var2, var3, var4, var5);
    }

    public static native void nnvgResetScissor(long var0);

    public static void nvgResetScissor(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgResetScissor(var0);
    }

    public static native void nnvgBeginPath(long var0);

    public static void nvgBeginPath(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgBeginPath(var0);
    }

    public static native void nnvgMoveTo(long var0, float var2, float var3);

    public static void nvgMoveTo(@NativeType("NVGcontext *") long var0, float var2, float var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgMoveTo(var0, var2, var3);
    }

    public static native void nnvgLineTo(long var0, float var2, float var3);

    public static void nvgLineTo(@NativeType("NVGcontext *") long var0, float var2, float var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgLineTo(var0, var2, var3);
    }

    public static native void nnvgBezierTo(long var0, float var2, float var3, float var4, float var5, float var6, float var7);

    public static void nvgBezierTo(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, float var6, float var7) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgBezierTo(var0, var2, var3, var4, var5, var6, var7);
    }

    public static native void nnvgQuadTo(long var0, float var2, float var3, float var4, float var5);

    public static void nvgQuadTo(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgQuadTo(var0, var2, var3, var4, var5);
    }

    public static native void nnvgArcTo(long var0, float var2, float var3, float var4, float var5, float var6);

    public static void nvgArcTo(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, float var6) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgArcTo(var0, var2, var3, var4, var5, var6);
    }

    public static native void nnvgClosePath(long var0);

    public static void nvgClosePath(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgClosePath(var0);
    }

    public static native void nnvgPathWinding(long var0, int var2);

    public static void nvgPathWinding(@NativeType("NVGcontext *") long var0, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgPathWinding(var0, var2);
    }

    public static native void nnvgArc(long var0, float var2, float var3, float var4, float var5, float var6, int var7);

    public static void nvgArc(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, float var6, int var7) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgArc(var0, var2, var3, var4, var5, var6, var7);
    }

    public static native void nnvgRect(long var0, float var2, float var3, float var4, float var5);

    public static void nvgRect(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgRect(var0, var2, var3, var4, var5);
    }

    public static native void nnvgRoundedRect(long var0, float var2, float var3, float var4, float var5, float var6);

    public static void nvgRoundedRect(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, float var6) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgRoundedRect(var0, var2, var3, var4, var5, var6);
    }

    public static native void nnvgRoundedRectVarying(long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9);

    public static void nvgRoundedRectVarying(
        @NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgRoundedRectVarying(var0, var2, var3, var4, var5, var6, var7, var8, var9);
    }

    public static native void nnvgEllipse(long var0, float var2, float var3, float var4, float var5);

    public static void nvgEllipse(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgEllipse(var0, var2, var3, var4, var5);
    }

    public static native void nnvgCircle(long var0, float var2, float var3, float var4);

    public static void nvgCircle(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgCircle(var0, var2, var3, var4);
    }

    public static native void nnvgFill(long var0);

    public static void nvgFill(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgFill(var0);
    }

    public static native void nnvgStroke(long var0);

    public static void nvgStroke(@NativeType("NVGcontext *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgStroke(var0);
    }

    public static native int nnvgCreateFont(long var0, long var2, long var4);

    public static int nvgCreateFont(
        @NativeType("NVGcontext *") long var0, @NativeType("char const *") ByteBuffer var2, @NativeType("char const *") ByteBuffer var3
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1(var2);
            Checks.checkNT1(var3);
        }

        return nnvgCreateFont(var0, MemoryUtil.memAddress(var2), MemoryUtil.memAddress(var3));
    }

    public static int nvgCreateFont(
        @NativeType("NVGcontext *") long var0, @NativeType("char const *") CharSequence var2, @NativeType("char const *") CharSequence var3
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var4 = MemoryStack.stackGet();
        int var5 = var4.getPointer();

        int var10;
        try {
            var4.nASCII(var2, true);
            long var6 = var4.getPointerAddress();
            var4.nASCII(var3, true);
            long var8 = var4.getPointerAddress();
            var10 = nnvgCreateFont(var0, var6, var8);
        } finally {
            var4.setPointer(var5);
        }

        return var10;
    }

    public static native int nnvgCreateFontAtIndex(long var0, long var2, long var4, int var6);

    public static int nvgCreateFontAtIndex(
        @NativeType("NVGcontext *") long var0, @NativeType("char const *") ByteBuffer var2, @NativeType("char const *") ByteBuffer var3, int var4
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1(var2);
            Checks.checkNT1(var3);
        }

        return nnvgCreateFontAtIndex(var0, MemoryUtil.memAddress(var2), MemoryUtil.memAddress(var3), var4);
    }

    public static int nvgCreateFontAtIndex(
        @NativeType("NVGcontext *") long var0, @NativeType("char const *") CharSequence var2, @NativeType("char const *") CharSequence var3, int var4
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var5 = MemoryStack.stackGet();
        int var6 = var5.getPointer();

        int var11;
        try {
            var5.nASCII(var2, true);
            long var7 = var5.getPointerAddress();
            var5.nASCII(var3, true);
            long var9 = var5.getPointerAddress();
            var11 = nnvgCreateFontAtIndex(var0, var7, var9, var4);
        } finally {
            var5.setPointer(var6);
        }

        return var11;
    }

    public static native int nnvgCreateFontMem(long var0, long var2, long var4, int var6, int var7);

    public static int nvgCreateFontMem(
        @NativeType("NVGcontext *") long var0,
        @NativeType("char const *") ByteBuffer var2,
        @NativeType("unsigned char *") ByteBuffer var3,
        @NativeType("int") boolean var4
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1(var2);
        }

        return nnvgCreateFontMem(var0, MemoryUtil.memAddress(var2), MemoryUtil.memAddress(var3), var3.remaining(), var4 ? 1 : 0);
    }

    public static int nvgCreateFontMem(
        @NativeType("NVGcontext *") long var0,
        @NativeType("char const *") CharSequence var2,
        @NativeType("unsigned char *") ByteBuffer var3,
        @NativeType("int") boolean var4
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var5 = MemoryStack.stackGet();
        int var6 = var5.getPointer();

        int var9;
        try {
            var5.nASCII(var2, true);
            long var7 = var5.getPointerAddress();
            var9 = nnvgCreateFontMem(var0, var7, MemoryUtil.memAddress(var3), var3.remaining(), var4 ? 1 : 0);
        } finally {
            var5.setPointer(var6);
        }

        return var9;
    }

    public static native int nnvgCreateFontMemAtIndex(long var0, long var2, long var4, int var6, int var7, int var8);

    public static int nvgCreateFontMemAtIndex(
        @NativeType("NVGcontext *") long var0,
        @NativeType("char const *") ByteBuffer var2,
        @NativeType("unsigned char *") ByteBuffer var3,
        @NativeType("int") boolean var4,
        int var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1(var2);
        }

        return nnvgCreateFontMemAtIndex(var0, MemoryUtil.memAddress(var2), MemoryUtil.memAddress(var3), var3.remaining(), var4 ? 1 : 0, var5);
    }

    public static int nvgCreateFontMemAtIndex(
        @NativeType("NVGcontext *") long var0,
        @NativeType("char const *") CharSequence var2,
        @NativeType("unsigned char *") ByteBuffer var3,
        @NativeType("int") boolean var4,
        int var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var6 = MemoryStack.stackGet();
        int var7 = var6.getPointer();

        int var10;
        try {
            var6.nASCII(var2, true);
            long var8 = var6.getPointerAddress();
            var10 = nnvgCreateFontMemAtIndex(var0, var8, MemoryUtil.memAddress(var3), var3.remaining(), var4 ? 1 : 0, var5);
        } finally {
            var6.setPointer(var7);
        }

        return var10;
    }

    public static native int nnvgFindFont(long var0, long var2);

    public static int nvgFindFont(@NativeType("NVGcontext *") long var0, @NativeType("char const *") ByteBuffer var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1(var2);
        }

        return nnvgFindFont(var0, MemoryUtil.memAddress(var2));
    }

    public static int nvgFindFont(@NativeType("NVGcontext *") long var0, @NativeType("char const *") CharSequence var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var3 = MemoryStack.stackGet();
        int var4 = var3.getPointer();

        int var7;
        try {
            var3.nASCII(var2, true);
            long var5 = var3.getPointerAddress();
            var7 = nnvgFindFont(var0, var5);
        } finally {
            var3.setPointer(var4);
        }

        return var7;
    }

    public static native int nnvgAddFallbackFontId(long var0, int var2, int var3);

    public static int nvgAddFallbackFontId(@NativeType("NVGcontext *") long var0, int var2, int var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        return nnvgAddFallbackFontId(var0, var2, var3);
    }

    public static native int nnvgAddFallbackFont(long var0, long var2, long var4);

    public static int nvgAddFallbackFont(
        @NativeType("NVGcontext *") long var0, @NativeType("char const *") ByteBuffer var2, @NativeType("char const *") ByteBuffer var3
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1(var2);
            Checks.checkNT1(var3);
        }

        return nnvgAddFallbackFont(var0, MemoryUtil.memAddress(var2), MemoryUtil.memAddress(var3));
    }

    public static int nvgAddFallbackFont(
        @NativeType("NVGcontext *") long var0, @NativeType("char const *") CharSequence var2, @NativeType("char const *") CharSequence var3
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var4 = MemoryStack.stackGet();
        int var5 = var4.getPointer();

        int var10;
        try {
            var4.nASCII(var2, true);
            long var6 = var4.getPointerAddress();
            var4.nASCII(var3, true);
            long var8 = var4.getPointerAddress();
            var10 = nnvgAddFallbackFont(var0, var6, var8);
        } finally {
            var4.setPointer(var5);
        }

        return var10;
    }

    public static native void nnvgResetFallbackFontsId(long var0, int var2);

    public static void nvgResetFallbackFontsId(@NativeType("NVGcontext *") long var0, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgResetFallbackFontsId(var0, var2);
    }

    public static native void nnvgResetFallbackFonts(long var0, long var2);

    public static void nvgResetFallbackFonts(@NativeType("NVGcontext *") long var0, @NativeType("char const *") ByteBuffer var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1(var2);
        }

        nnvgResetFallbackFonts(var0, MemoryUtil.memAddress(var2));
    }

    public static void nvgResetFallbackFonts(@NativeType("NVGcontext *") long var0, @NativeType("char const *") CharSequence var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var3 = MemoryStack.stackGet();
        int var4 = var3.getPointer();

        try {
            var3.nASCII(var2, true);
            long var5 = var3.getPointerAddress();
            nnvgResetFallbackFonts(var0, var5);
        } finally {
            var3.setPointer(var4);
        }
    }

    public static native void nnvgFontSize(long var0, float var2);

    public static void nvgFontSize(@NativeType("NVGcontext *") long var0, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgFontSize(var0, var2);
    }

    public static native void nnvgFontBlur(long var0, float var2);

    public static void nvgFontBlur(@NativeType("NVGcontext *") long var0, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgFontBlur(var0, var2);
    }

    public static native void nnvgTextLetterSpacing(long var0, float var2);

    public static void nvgTextLetterSpacing(@NativeType("NVGcontext *") long var0, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgTextLetterSpacing(var0, var2);
    }

    public static native void nnvgTextLineHeight(long var0, float var2);

    public static void nvgTextLineHeight(@NativeType("NVGcontext *") long var0, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgTextLineHeight(var0, var2);
    }

    public static native void nnvgTextAlign(long var0, int var2);

    public static void nvgTextAlign(@NativeType("NVGcontext *") long var0, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgTextAlign(var0, var2);
    }

    public static native void nnvgFontFaceId(long var0, int var2);

    public static void nvgFontFaceId(@NativeType("NVGcontext *") long var0, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgFontFaceId(var0, var2);
    }

    public static native void nnvgFontFace(long var0, long var2);

    public static void nvgFontFace(@NativeType("NVGcontext *") long var0, @NativeType("char const *") ByteBuffer var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1(var2);
        }

        nnvgFontFace(var0, MemoryUtil.memAddress(var2));
    }

    public static void nvgFontFace(@NativeType("NVGcontext *") long var0, @NativeType("char const *") CharSequence var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var3 = MemoryStack.stackGet();
        int var4 = var3.getPointer();

        try {
            var3.nASCII(var2, true);
            long var5 = var3.getPointerAddress();
            nnvgFontFace(var0, var5);
        } finally {
            var3.setPointer(var4);
        }
    }

    public static native float nnvgText(long var0, float var2, float var3, long var4, long var6);

    public static float nvgText(@NativeType("NVGcontext *") long var0, float var2, float var3, @NativeType("char const *") ByteBuffer var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        return nnvgText(var0, var2, var3, MemoryUtil.memAddress(var4), MemoryUtil.memAddress(var4) + var4.remaining());
    }

    public static float nvgText(@NativeType("NVGcontext *") long var0, float var2, float var3, @NativeType("char const *") CharSequence var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var5 = MemoryStack.stackGet();
        int var6 = var5.getPointer();

        float var10;
        try {
            int var7 = var5.nUTF8(var4, false);
            long var8 = var5.getPointerAddress();
            var10 = nnvgText(var0, var2, var3, var8, var8 + var7);
        } finally {
            var5.setPointer(var6);
        }

        return var10;
    }

    public static native void nnvgTextBox(long var0, float var2, float var3, float var4, long var5, long var7);

    public static void nvgTextBox(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, @NativeType("char const *") ByteBuffer var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnvgTextBox(var0, var2, var3, var4, MemoryUtil.memAddress(var5), MemoryUtil.memAddress(var5) + var5.remaining());
    }

    public static void nvgTextBox(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, @NativeType("char const *") CharSequence var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var6 = MemoryStack.stackGet();
        int var7 = var6.getPointer();

        try {
            int var8 = var6.nUTF8(var5, false);
            long var9 = var6.getPointerAddress();
            nnvgTextBox(var0, var2, var3, var4, var9, var9 + var8);
        } finally {
            var6.setPointer(var7);
        }
    }

    public static native float nnvgTextBounds(long var0, float var2, float var3, long var4, long var6, long var8);

    public static float nvgTextBounds(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        @NativeType("char const *") ByteBuffer var4,
        @NativeType("float *") FloatBuffer var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkSafe(var5, 4);
        }

        return nnvgTextBounds(var0, var2, var3, MemoryUtil.memAddress(var4), MemoryUtil.memAddress(var4) + var4.remaining(), MemoryUtil.memAddressSafe(var5));
    }

    public static float nvgTextBounds(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        @NativeType("char const *") CharSequence var4,
        @NativeType("float *") FloatBuffer var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkSafe(var5, 4);
        }

        MemoryStack var6 = MemoryStack.stackGet();
        int var7 = var6.getPointer();

        float var11;
        try {
            int var8 = var6.nUTF8(var4, false);
            long var9 = var6.getPointerAddress();
            var11 = nnvgTextBounds(var0, var2, var3, var9, var9 + var8, MemoryUtil.memAddressSafe(var5));
        } finally {
            var6.setPointer(var7);
        }

        return var11;
    }

    public static native void nnvgTextBoxBounds(long var0, float var2, float var3, float var4, long var5, long var7, long var9);

    public static void nvgTextBoxBounds(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        @NativeType("char const *") ByteBuffer var5,
        @NativeType("float *") FloatBuffer var6
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkSafe(var6, 4);
        }

        nnvgTextBoxBounds(var0, var2, var3, var4, MemoryUtil.memAddress(var5), MemoryUtil.memAddress(var5) + var5.remaining(), MemoryUtil.memAddressSafe(var6));
    }

    public static void nvgTextBoxBounds(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        @NativeType("char const *") CharSequence var5,
        @NativeType("float *") FloatBuffer var6
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkSafe(var6, 4);
        }

        MemoryStack var7 = MemoryStack.stackGet();
        int var8 = var7.getPointer();

        try {
            int var9 = var7.nUTF8(var5, false);
            long var10 = var7.getPointerAddress();
            nnvgTextBoxBounds(var0, var2, var3, var4, var10, var10 + var9, MemoryUtil.memAddressSafe(var6));
        } finally {
            var7.setPointer(var8);
        }
    }

    public static native int nnvgTextGlyphPositions(long var0, float var2, float var3, long var4, long var6, long var8, int var10);

    public static int nvgTextGlyphPositions(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        @NativeType("char const *") ByteBuffer var4,
        @NativeType("NVGglyphPosition *") Buffer var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        return nnvgTextGlyphPositions(
            var0, var2, var3, MemoryUtil.memAddress(var4), MemoryUtil.memAddress(var4) + var4.remaining(), var5.address(), var5.remaining()
        );
    }

    public static int nvgTextGlyphPositions(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        @NativeType("char const *") CharSequence var4,
        @NativeType("NVGglyphPosition *") Buffer var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var6 = MemoryStack.stackGet();
        int var7 = var6.getPointer();

        int var11;
        try {
            int var8 = var6.nUTF8(var4, false);
            long var9 = var6.getPointerAddress();
            var11 = nnvgTextGlyphPositions(var0, var2, var3, var9, var9 + var8, var5.address(), var5.remaining());
        } finally {
            var6.setPointer(var7);
        }

        return var11;
    }

    public static native void nnvgTextMetrics(long var0, long var2, long var4, long var6);

    public static void nvgTextMetrics(
        @NativeType("NVGcontext *") long var0,
        @NativeType("float *") FloatBuffer var2,
        @NativeType("float *") FloatBuffer var3,
        @NativeType("float *") FloatBuffer var4
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkSafe(var2, 1);
            Checks.checkSafe(var3, 1);
            Checks.checkSafe(var4, 1);
        }

        nnvgTextMetrics(var0, MemoryUtil.memAddressSafe(var2), MemoryUtil.memAddressSafe(var3), MemoryUtil.memAddressSafe(var4));
    }

    public static native int nnvgTextBreakLines(long var0, long var2, long var4, float var6, long var7, int var9);

    public static int nvgTextBreakLines(
        @NativeType("NVGcontext *") long var0,
        @NativeType("char const *") ByteBuffer var2,
        float var3,
        @NativeType("NVGtextRow *") org.lwjgl.nanovg.NVGTextRow.Buffer var4
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        return nnvgTextBreakLines(var0, MemoryUtil.memAddress(var2), MemoryUtil.memAddress(var2) + var2.remaining(), var3, var4.address(), var4.remaining());
    }

    public static int nvgTextBreakLines(
        @NativeType("NVGcontext *") long var0,
        @NativeType("char const *") CharSequence var2,
        float var3,
        @NativeType("NVGtextRow *") org.lwjgl.nanovg.NVGTextRow.Buffer var4
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var5 = MemoryStack.stackGet();
        int var6 = var5.getPointer();

        int var10;
        try {
            int var7 = var5.nUTF8(var2, false);
            long var8 = var5.getPointerAddress();
            var10 = nnvgTextBreakLines(var0, var8, var8 + var7, var3, var4.address(), var4.remaining());
        } finally {
            var5.setPointer(var6);
        }

        return var10;
    }

    @NativeType("void *")
    private static native long nvgCreateInternal();

    @NativeType("void *")
    private static native long nvgInternalParams();

    @NativeType("void *")
    private static native long nvgDeleteInternal();

    public static native void nnvgCurrentTransform(long var0, float[] var2);

    public static void nvgCurrentTransform(@NativeType("NVGcontext *") long var0, @NativeType("float *") float[] var2) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.check(var2, 6);
        }

        nnvgCurrentTransform(var0, var2);
    }

    public static native void nnvgTransformIdentity(float[] var0);

    public static void nvgTransformIdentity(@NativeType("float *") float[] var0) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformIdentity(var0);
    }

    public static native void nnvgTransformTranslate(float[] var0, float var1, float var2);

    public static void nvgTransformTranslate(@NativeType("float *") float[] var0, float var1, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformTranslate(var0, var1, var2);
    }

    public static native void nnvgTransformScale(float[] var0, float var1, float var2);

    public static void nvgTransformScale(@NativeType("float *") float[] var0, float var1, float var2) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformScale(var0, var1, var2);
    }

    public static native void nnvgTransformRotate(float[] var0, float var1);

    public static void nvgTransformRotate(@NativeType("float *") float[] var0, float var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformRotate(var0, var1);
    }

    public static native void nnvgTransformSkewX(float[] var0, float var1);

    public static void nvgTransformSkewX(@NativeType("float *") float[] var0, float var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformSkewX(var0, var1);
    }

    public static native void nnvgTransformSkewY(float[] var0, float var1);

    public static void nvgTransformSkewY(@NativeType("float *") float[] var0, float var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
        }

        nnvgTransformSkewY(var0, var1);
    }

    public static native void nnvgTransformMultiply(float[] var0, float[] var1);

    public static void nvgTransformMultiply(@NativeType("float *") float[] var0, @NativeType("float const *") float[] var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
            Checks.check(var1, 6);
        }

        nnvgTransformMultiply(var0, var1);
    }

    public static native void nnvgTransformPremultiply(float[] var0, float[] var1);

    public static void nvgTransformPremultiply(@NativeType("float *") float[] var0, @NativeType("float const *") float[] var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
            Checks.check(var1, 6);
        }

        nnvgTransformPremultiply(var0, var1);
    }

    public static native int nnvgTransformInverse(float[] var0, float[] var1);

    @NativeType("int")
    public static boolean nvgTransformInverse(@NativeType("float *") float[] var0, @NativeType("float const *") float[] var1) {
        if (Checks.CHECKS) {
            Checks.check(var0, 6);
            Checks.check(var1, 6);
        }

        return nnvgTransformInverse(var0, var1) != 0;
    }

    public static native void nnvgTransformPoint(float[] var0, float[] var1, float[] var2, float var3, float var4);

    public static void nvgTransformPoint(
        @NativeType("float *") float[] var0, @NativeType("float *") float[] var1, @NativeType("float const *") float[] var2, float var3, float var4
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0, 1);
            Checks.check(var1, 1);
            Checks.check(var2, 6);
        }

        nnvgTransformPoint(var0, var1, var2, var3, var4);
    }

    public static native void nnvgImageSize(long var0, int var2, int[] var3, int[] var4);

    public static void nvgImageSize(@NativeType("NVGcontext *") long var0, int var2, @NativeType("int *") int[] var3, @NativeType("int *") int[] var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.check(var3, 1);
            Checks.check(var4, 1);
        }

        nnvgImageSize(var0, var2, var3, var4);
    }

    public static native float nnvgTextBounds(long var0, float var2, float var3, long var4, long var6, float[] var8);

    public static float nvgTextBounds(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        @NativeType("char const *") ByteBuffer var4,
        @NativeType("float *") float[] var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkSafe(var5, 4);
        }

        return nnvgTextBounds(var0, var2, var3, MemoryUtil.memAddress(var4), MemoryUtil.memAddress(var4) + var4.remaining(), var5);
    }

    public static float nvgTextBounds(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        @NativeType("char const *") CharSequence var4,
        @NativeType("float *") float[] var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkSafe(var5, 4);
        }

        MemoryStack var6 = MemoryStack.stackGet();
        int var7 = var6.getPointer();

        float var11;
        try {
            int var8 = var6.nUTF8(var4, false);
            long var9 = var6.getPointerAddress();
            var11 = nnvgTextBounds(var0, var2, var3, var9, var9 + var8, var5);
        } finally {
            var6.setPointer(var7);
        }

        return var11;
    }

    public static native void nnvgTextBoxBounds(long var0, float var2, float var3, float var4, long var5, long var7, float[] var9);

    public static void nvgTextBoxBounds(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        @NativeType("char const *") ByteBuffer var5,
        @NativeType("float *") float[] var6
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkSafe(var6, 4);
        }

        nnvgTextBoxBounds(var0, var2, var3, var4, MemoryUtil.memAddress(var5), MemoryUtil.memAddress(var5) + var5.remaining(), var6);
    }

    public static void nvgTextBoxBounds(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        @NativeType("char const *") CharSequence var5,
        @NativeType("float *") float[] var6
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkSafe(var6, 4);
        }

        MemoryStack var7 = MemoryStack.stackGet();
        int var8 = var7.getPointer();

        try {
            int var9 = var7.nUTF8(var5, false);
            long var10 = var7.getPointerAddress();
            nnvgTextBoxBounds(var0, var2, var3, var4, var10, var10 + var9, var6);
        } finally {
            var7.setPointer(var8);
        }
    }

    public static native void nnvgTextMetrics(long var0, float[] var2, float[] var3, float[] var4);

    public static void nvgTextMetrics(
        @NativeType("NVGcontext *") long var0,
        @NativeType("float *") float[] var2,
        @NativeType("float *") float[] var3,
        @NativeType("float *") float[] var4
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkSafe(var2, 1);
            Checks.checkSafe(var3, 1);
            Checks.checkSafe(var4, 1);
        }

        nnvgTextMetrics(var0, var2, var3, var4);
    }

    static {
        LibNanoVG.initialize();
    }
}
