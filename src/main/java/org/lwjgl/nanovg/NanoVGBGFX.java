package org.lwjgl.nanovg;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.MemoryUtil.MemoryAllocator;

public class NanoVGBGFX {
    public static final int NVG_IMAGE_NODELETE = 65536;

    protected NanoVGBGFX() {
        throw new UnsupportedOperationException();
    }

    public static long nnvgCreate(int var0, short var1, long var2) {
        long var4 = NanoVGBGFX.Functions.Create;
        return JNI.invokeCPP(var0, var1, var2, var4);
    }

    @NativeType("NVGcontext *")
    public static long nvgCreate(
        @NativeType("int32_t") boolean var0, @NativeType("bgfx_view_id_t") int var1, @NativeType("bgfx_allocator_interface_t *") long var2
    ) {
        return nnvgCreate(var0 ? 1 : 0, (short)var1, var2);
    }

    public static void nvgDelete(@NativeType("NVGcontext *") long var0) {
        long var2 = NanoVGBGFX.Functions.Delete;
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        JNI.invokePV(var0, var2);
    }

    public static void nnvgSetViewId(long var0, short var2) {
        long var3 = NanoVGBGFX.Functions.SetViewId;
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        JNI.invokePCV(var0, var2, var3);
    }

    public static void nvgSetViewId(@NativeType("NVGcontext *") long var0, @NativeType("bgfx_view_id_t") int var2) {
        nnvgSetViewId(var0, (short)var2);
    }

    @NativeType("uint16_t")
    public static short nvgGetViewId(@NativeType("NVGcontext *") long var0) {
        long var2 = NanoVGBGFX.Functions.GetViewId;
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        return JNI.invokePC(var0, var2);
    }

    public static long nnvgluCreateFramebuffer(long var0, int var2, int var3, int var4) {
        long var5 = NanoVGBGFX.Functions.luCreateFramebuffer;
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        return JNI.invokePP(var0, var2, var3, var4, var5);
    }

    
    @NativeType("NVGLUframebuffer *")
    public static NVGLUFramebufferBGFX nvgluCreateFramebuffer(
        @NativeType("NVGcontext *") long var0, @NativeType("int32_t") int var2, @NativeType("int32_t") int var3, @NativeType("int32_t") int var4
    ) {
        long var5 = nnvgluCreateFramebuffer(var0, var2, var3, var4);
        return NVGLUFramebufferBGFX.createSafe(var5);
    }

    public static void nnvgluBindFramebuffer(long var0) {
        long var2 = NanoVGBGFX.Functions.luBindFramebuffer;
        JNI.invokePV(var0, var2);
    }

    public static void nvgluBindFramebuffer(@NativeType("NVGLUframebuffer *") NVGLUFramebufferBGFX var0) {
        nnvgluBindFramebuffer(MemoryUtil.memAddressSafe(var0));
    }

    public static void nnvgluDeleteFramebuffer(long var0) {
        long var2 = NanoVGBGFX.Functions.luDeleteFramebuffer;
        JNI.invokePV(var0, var2);
    }

    public static void nvgluDeleteFramebuffer(@NativeType("NVGLUframebuffer *") NVGLUFramebufferBGFX var0) {
        nnvgluDeleteFramebuffer(var0.address());
    }

    public static void nnvgluSetViewFramebuffer(short var0, long var1) {
        long var3 = NanoVGBGFX.Functions.luSetViewFramebuffer;
        JNI.invokeCPV(var0, var1, var3);
    }

    public static void nvgluSetViewFramebuffer(@NativeType("bgfx_view_id_t") int var0, @NativeType("NVGLUframebuffer *") NVGLUFramebufferBGFX var1) {
        nnvgluSetViewFramebuffer((short)var0, var1.address());
    }

    public static void nvgCreateBgfxTexture(
        @NativeType("NVGcontext *") long var0, @NativeType("bgfx_texture_handle_t") short var2, int var3, int var4, int var5
    ) {
        long var6 = NanoVGBGFX.Functions.CreateBgfxTexture;
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        JNI.invokePCV(var0, var2, var3, var4, var5, var6);
    }

    private static void org_lwjgl_nanovg_setup(
        @NativeType("void *") long var0,
        @NativeType("void *") long var2,
        @NativeType("void *") long var4,
        @NativeType("void *") long var6,
        @NativeType("void *") long var8
    ) {
        long var10 = NanoVGBGFX.Functions.org_lwjgl_nanovg_setup;
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.check(var2);
            Checks.check(var4);
            Checks.check(var6);
            Checks.check(var8);
        }

        JNI.invokePPPPPV(var0, var2, var4, var6, var8, var10);
    }

    static {
        MemoryAllocator var0 = MemoryUtil.getAllocator((Boolean)Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.get(true));
        org_lwjgl_nanovg_setup(var0.getRealloc(), var0.getFree(), NanoVG.nvgCreateInternal, NanoVG.nvgInternalParams, NanoVG.nvgDeleteInternal);
    }

    private static class BGFX {
        private static final SharedLibrary library;

        static SharedLibrary getLibrary() {
            return library;
        }

        static {
            try {
                library = (SharedLibrary)Class.forName("org.lwjgl.bgfx.BGFX").getMethod("getLibrary").invoke(null);
            } catch (Exception var1) {
                throw new IllegalStateException(var1);
            }
        }
    }

    public static final class Functions {
        public static final long Create = APIUtil.apiGetFunctionAddress(NanoVGBGFX.BGFX.getLibrary(), "nvgCreate");
        public static final long Delete = APIUtil.apiGetFunctionAddress(NanoVGBGFX.BGFX.getLibrary(), "nvgDelete");
        public static final long SetViewId = APIUtil.apiGetFunctionAddress(NanoVGBGFX.BGFX.getLibrary(), "nvgSetViewId");
        public static final long GetViewId = APIUtil.apiGetFunctionAddress(NanoVGBGFX.BGFX.getLibrary(), "nvgGetViewId");
        public static final long luCreateFramebuffer = APIUtil.apiGetFunctionAddress(NanoVGBGFX.BGFX.getLibrary(), "nvgluCreateFramebuffer");
        public static final long luBindFramebuffer = APIUtil.apiGetFunctionAddress(NanoVGBGFX.BGFX.getLibrary(), "nvgluBindFramebuffer");
        public static final long luDeleteFramebuffer = APIUtil.apiGetFunctionAddress(NanoVGBGFX.BGFX.getLibrary(), "nvgluDeleteFramebuffer");
        public static final long luSetViewFramebuffer = APIUtil.apiGetFunctionAddress(NanoVGBGFX.BGFX.getLibrary(), "nvgluSetViewFramebuffer");
        public static final long CreateBgfxTexture = APIUtil.apiGetFunctionAddress(NanoVGBGFX.BGFX.getLibrary(), "nvgCreateBgfxTexture");
        public static final long org_lwjgl_nanovg_setup = APIUtil.apiGetFunctionAddress(NanoVGBGFX.BGFX.getLibrary(), "org_lwjgl_nanovg_setup");

        private Functions() {
        }
    }
}
