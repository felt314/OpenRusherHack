// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.client.api.render.IScissorable;
import org.rusherhack.client.api.render.IRenderer;
import net.minecraft.client.gui.widget.ClickableWidget;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import java.util.concurrent.CopyOnWriteArrayList;
import org.rusherhack.client.api.render.IRenderer2D;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.client.api.render.RenderContext;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import org.rusherhack.client.api.Globals;
import net.minecraft.client.gui.screen.ChatScreen;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.CommandData$MethodData;
import org.rusherhack.core.command.processing.CommandProcessingSink$MethodProcessor;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.command.exceptions.CommandException;
import org.rusherhack.core.command.exceptions.BadSyntaxException;
import org.rusherhack.core.command.CommandData$ArgumentData;
import org.rusherhack.core.command.CommandManager;
import org.rusherhack.core.command.CommandData;
import org.rusherhack.core.command.AbstractCommand;
import java.util.ArrayList;
import org.rusherhack.core.command.CommandUtils;
import net.minecraft.client.gui.widget.TextFieldWidget;
import java.util.Iterator;
import java.util.Map;
import org.rusherhack.client.api.utils.objects.Scrollbar;
import java.util.List;
import org.rusherhack.core.interfaces.IScrollable;
import org.rusherhack.core.interfaces.IClickable;
import org.rusherhack.client.api.render.IRenderable2D;

import org.rusherhack.command.Class291;
import org.rusherhack.command.clear;
import org.rusherhack.command.help;
import org.rusherhack.command.prefix;
public class Renderer605 implements IRenderable2D, IClickable, IScrollable
{
    public boolean f9566;
    public int f9567;
    public double f9568;
    public Class291 f9569;
    public double f9570;
    public List<String> f9571;
    public int f9572;
    public Scrollbar f9573;
    public int f9574;
    public List<String> f9575;
    public static long f9576;
    public static String[] f9577;
    public static String[] f9578;
    public static Map f9579;
    public static long[] f9580;
    public static Integer[] f9581;
    public static Map f9582;
    public static long f9583;
    public static Object[] f9584;
    public static String[] f9585;
    
    public double m18334() {
        return 0.0;
    }
    
    public void m18335(TextFieldWidget p0) {
        
    }
    
    public double m18336(boolean b) {
        return 0.0;
    }
    
    public void m18337(String s) {
        
    }
    
    public IFontRenderer getFontRenderer() {
        return null;
    }
    
    public boolean mouseScrolled(double n, double n2, double n3) {
        return false;
    }
    
    public boolean mouseClicked(double n, double n2, int n3) {
        return false;
    }
    
    public void m18339(DrawContext drawContext, TextFieldWidget textFieldWidget) {
        
    }
    
    public boolean isHovered(double n, double n2) {
        return false;
    }
    
    public boolean m18341(TextFieldWidget textFieldWidget, int n, int n2, int n3) {
        return false;
    }
    
    public boolean m14378() {
        return false;
    }
    
    public void render(RenderContext renderContext, double n, double n2) {
        
    }
    
    public List<String> m18343() {
        return null;
    }
    
    public String m18344() {
        return null;
    }
    
    public Renderer605(Class291 f9569) {
        long n = Renderer605.f9576 ^ 0x8547BF28B6EL;
        boolean f9570 = false;
        int f9571 = -1;
        int f9572 = 0;
        int f9573 = -1;
        this.f9575 = new CopyOnWriteArrayList<String>();
        this.f9571 = new CopyOnWriteArrayList<String>();
        this.f9574 = f9573;
        this.f9567 = f9572;
        this.f9573 = new Scrollbar(new Animation(Easing.LINEAR, Renderer605.f9583).play());
        this.f9572 = f9571;
        this.f9566 = f9570;
        this.f9569 = f9569;
        Class170.f3362.subscribe((Object)new Class118(this));
    }
    
    static {
   }
    
    public static IllegalStateException m1393(Throwable t) {
        return new IllegalStateException((Throwable)null);
    }
    
    public static String m117(byte[] array) {
        return null;
    }
    
    public static CallSite m120(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    public static void m122() {
        
    }
    
    public static Field m124(Class clazz, String anObject, Class clazz2) {
        return null;
    }
    
    public static Field m125(Class clazz, String s, Class clazz2) {
        return null;
    }
    
    public static Method m127(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static Method m128(Class clazz, String s, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_1
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
    }
    }

   public static int dcmpl(double var0, double var2) {
        return 0;
    }

   public static int dcmpg(double var0, double var2) {
        return 0;
    }
}
