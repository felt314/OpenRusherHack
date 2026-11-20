package org.lwjgl.nanovg;

import java.lang.reflect.Method;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.MemoryUtil;

import org.rusherhack.command.config;
final class NanoVGGLConfig {
    private NanoVGGLConfig() {
    }

    static void configGL(long var0) {
        config(var0, getFunctionProvider("org.lwjgl.opengl.GL"));
    }

    static void configGLES(long var0) {
        config(var0, getFunctionProvider("org.lwjgl.opengles.GLES"));
    }

    private static FunctionProvider getFunctionProvider(String var0) {
        try {
            Class var1 = Class.forName(var0);
            Method var2 = var1.getMethod("getCapabilities");
            var2.invoke(null);
            Method var3 = var1.getMethod("getFunctionProvider");
            return (FunctionProvider)var3.invoke(null);
        } catch (Exception var4) {
            throw new IllegalStateException(var4);
        }
    }

    private static void config(long var0, FunctionProvider var2) {
        String[] var3 = new String[]{
            "glActiveTexture",
            "glAttachShader",
            "glBindAttribLocation",
            "glBindBuffer",
            "glBindBufferRange",
            "glBindFramebuffer",
            "glBindRenderbuffer",
            "glBindTexture",
            "glBindVertexArray",
            "glBlendFunc",
            "glBlendFuncSeparate",
            "glBufferData",
            "glCheckFramebufferStatus",
            "glColorMask",
            "glCompileShader",
            "glCreateProgram",
            "glCreateShader",
            "glCullFace",
            "glDeleteBuffers",
            "glDeleteFramebuffers",
            "glDeleteProgram",
            "glDeleteRenderbuffers",
            "glDeleteShader",
            "glDeleteTextures",
            "glDeleteVertexArrays",
            "glDetachShader",
            "glDisable",
            "glDisableVertexAttribArray",
            "glDrawArrays",
            "glEnable",
            "glEnableVertexAttribArray",
            "glFinish",
            "glFlush",
            "glFramebufferRenderbuffer",
            "glFramebufferTexture2D",
            "glFrontFace",
            "glGenBuffers",
            "glGenFramebuffers",
            "glGenRenderbuffers",
            "glGenTextures",
            "glGenVertexArrays",
            "glGenerateMipmap",
            "glGetError",
            "glGetIntegerv",
            "glGetProgramiv",
            "glGetProgramInfoLog",
            "glGetShaderiv",
            "glGetShaderInfoLog",
            "glGetUniformBlockIndex",
            "glGetUniformLocation",
            "glLinkProgram",
            "glPixelStorei",
            "glRenderbufferStorage",
            "glShaderSource",
            "glStencilFunc",
            "glStencilMask",
            "glStencilOp",
            "glStencilOpSeparate",
            "glTexImage2D",
            "glTexParameteri",
            "glTexSubImage2D",
            "glUniform1i",
            "glUniform2fv",
            "glUniform4fv",
            "glUniformBlockBinding",
            "glUseProgram",
            "glVertexAttribPointer"
        };
        PointerBuffer var4 = MemoryUtil.memPointerBuffer(var0, var3.length);

        for (int var5 = 0; var5 < var3.length; var5++) {
            var4.put(var5, var2.getFunctionAddress(var3[var5]));
        }
    }
}
