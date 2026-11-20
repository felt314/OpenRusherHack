package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NanoSVG {
    public static final int NSVG_PAINT_UNDEF = -1;
    public static final int NSVG_PAINT_NONE = 0;
    public static final int NSVG_PAINT_COLOR = 1;
    public static final int NSVG_PAINT_LINEAR_GRADIENT = 2;
    public static final int NSVG_PAINT_RADIAL_GRADIENT = 3;
    public static final int NSVG_SPREAD_PAD = 0;
    public static final int NSVG_SPREAD_REFLECT = 1;
    public static final int NSVG_SPREAD_REPEAT = 2;
    public static final int NSVG_JOIN_MITER = 0;
    public static final int NSVG_JOIN_ROUND = 1;
    public static final int NSVG_JOIN_BEVEL = 2;
    public static final int NSVG_CAP_BUTT = 0;
    public static final int NSVG_CAP_ROUND = 1;
    public static final int NSVG_CAP_SQUARE = 2;
    public static final int NSVG_FILLRULE_NONZERO = 0;
    public static final int NSVG_FILLRULE_EVENODD = 1;
    public static final int NSVG_FLAGS_VISIBLE = 1;

    protected NanoSVG() {
        throw new UnsupportedOperationException();
    }

    public static native long nnsvgParseFromFile(long var0, long var2, float var4);

    
    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParseFromFile(@NativeType("char const *") ByteBuffer var0, @NativeType("char const *") ByteBuffer var1, float var2) {
        if (Checks.CHECKS) {
            Checks.checkNT1(var0);
            Checks.checkNT1(var1);
        }

        long var3 = nnsvgParseFromFile(MemoryUtil.memAddress(var0), MemoryUtil.memAddress(var1), var2);
        return NSVGImage.createSafe(var3);
    }

    
    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParseFromFile(@NativeType("char const *") CharSequence var0, @NativeType("char const *") CharSequence var1, float var2) {
        MemoryStack var3 = MemoryStack.stackGet();
        int var4 = var3.getPointer();

        NSVGImage var11;
        try {
            var3.nASCII(var0, true);
            long var5 = var3.getPointerAddress();
            var3.nASCII(var1, true);
            long var7 = var3.getPointerAddress();
            long var9 = nnsvgParseFromFile(var5, var7, var2);
            var11 = NSVGImage.createSafe(var9);
        } finally {
            var3.setPointer(var4);
        }

        return var11;
    }

    public static native long nnsvgParse(long var0, long var2, float var4);

    
    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParse(@NativeType("char *") ByteBuffer var0, @NativeType("char const *") ByteBuffer var1, float var2) {
        if (Checks.CHECKS) {
            Checks.checkNT1(var0);
            Checks.checkNT1(var1);
        }

        long var3 = nnsvgParse(MemoryUtil.memAddress(var0), MemoryUtil.memAddress(var1), var2);
        return NSVGImage.createSafe(var3);
    }

    
    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParse(@NativeType("char *") CharSequence var0, @NativeType("char const *") CharSequence var1, float var2) {
        MemoryStack var3 = MemoryStack.stackGet();
        int var4 = var3.getPointer();

        NSVGImage var11;
        try {
            var3.nASCII(var0, true);
            long var5 = var3.getPointerAddress();
            var3.nASCII(var1, true);
            long var7 = var3.getPointerAddress();
            long var9 = nnsvgParse(var5, var7, var2);
            var11 = NSVGImage.createSafe(var9);
        } finally {
            var3.setPointer(var4);
        }

        return var11;
    }

    public static native long nnsvgDuplicatePath(long var0);

    
    @NativeType("NSVGpath *")
    public static NSVGPath nsvgDuplicatePath(@NativeType("NSVGpath *") NSVGPath var0) {
        long var1 = nnsvgDuplicatePath(var0.address());
        return NSVGPath.createSafe(var1);
    }

    public static native void nnsvgDelete(long var0);

    public static void nsvgDelete(@NativeType("NSVGimage *") NSVGImage var0) {
        nnsvgDelete(var0.address());
    }

    @NativeType("NSVGrasterizer *")
    public static native long nsvgCreateRasterizer();

    public static native void nnsvgRasterize(long var0, long var2, float var4, float var5, float var6, long var7, int var9, int var10, int var11);

    public static void nsvgRasterize(
        @NativeType("NSVGrasterizer *") long var0,
        @NativeType("NSVGimage *") NSVGImage var2,
        float var3,
        float var4,
        float var5,
        @NativeType("unsigned char *") ByteBuffer var6,
        int var7,
        int var8,
        int var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.check(var6, var8 * var9);
        }

        nnsvgRasterize(var0, var2.address(), var3, var4, var5, MemoryUtil.memAddress(var6), var7, var8, var9);
    }

    public static native void nnsvgDeleteRasterizer(long var0);

    public static void nsvgDeleteRasterizer(@NativeType("NSVGrasterizer *") long var0) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nnsvgDeleteRasterizer(var0);
    }

    static {
        LibNanoVG.initialize();
    }
}
