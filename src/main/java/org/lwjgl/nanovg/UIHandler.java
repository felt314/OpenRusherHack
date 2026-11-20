package org.lwjgl.nanovg;

import org.lwjgl.system.Callback;

public abstract class UIHandler extends Callback implements UIHandlerI {
    public static UIHandler create(long var0) {
        UIHandlerI var2 = (UIHandlerI)Callback.get(var0);
        return (UIHandler)(var2 instanceof UIHandler ? (UIHandler)var2 : new UIHandler.Container(var0, var2));
    }

    
    public static UIHandler createSafe(long var0) {
        return var0 == 0L ? null : create(var0);
    }

    public static UIHandler create(UIHandlerI var0) {
        return (UIHandler)(var0 instanceof UIHandler ? (UIHandler)var0 : new UIHandler.Container(var0.address(), var0));
    }

    protected UIHandler() {
        super(CIF);
    }

    UIHandler(long var1) {
        super(var1);
    }

    private static final class Container extends UIHandler {
        private final UIHandlerI delegate;

        Container(long var1, UIHandlerI var3) {
            super(var1);
            this.delegate = var3;
        }

        @Override
        public void invoke(int var1, int var2) {
            this.delegate.invoke(var1, var2);
        }
    }
}
