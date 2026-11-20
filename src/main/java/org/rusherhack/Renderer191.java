// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.logging.ILog;
import org.rusherhack.client.Renderer026;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.render.IRenderer;
import org.rusherhack.core.interfaces.INamed;
import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.client.api.ui.ElementHandlerBase;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import javax.crypto.SecretKey;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import org.rusherhack.client.api.ui.window.WindowContentHandlerBase;
import java.io.IOException;
import org.rusherhack.client.Enum024;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.client.api.ui.window.WindowViewHandlerBase;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.awt.Color;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.core.interfaces.IPinnable;
import org.rusherhack.client.api.render.graphic.IGraphic;
import org.rusherhack.client.api.feature.window.ResizeableWindow;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.client.api.ui.window.WindowHandlerBase$WindowSide;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.render.RenderContext;
import java.util.Map;
import org.rusherhack.client.Class025;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import java.util.List;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.component.ComboBoxComponent;
import org.rusherhack.client.api.ui.window.view.ListView$Column;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.client.api.ui.window.WindowHandlerBase;

import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
public class Renderer191 extends WindowHandlerBase
{
    public VectorGraphic f3681;
    public ListView$Column f3682;
    public static int f3683;
    public VectorGraphic f3684;
    public int f3685;
    public ComboBoxComponent f3686;
    public static int f3687;
    public static int f3688;
    public static int f3689;
    public Window f3690;
    public ComboBoxComponent f3691;
    public Renderer361 f3692;
    public VectorGraphic f3693;
    public WindowView f3694;
    public int f3695;
    public List<ContextAction> f3696;
    public Class025 f3697;
    public ContextAction f3698;
    public static int f3699;
    public Renderer144 f3700;
    public static long f3701;
    public static String[] f3702;
    public static String[] f3703;
    public static Map f3704;
    public static long[] f3705;
    public static Integer[] f3706;
    public static Map f3707;
    public static Object[] f3708;
    public static String[] f3709;
    
    public void renderWindow(Window window, RenderContext renderContext, double n, double n2) {
        
    }
    
    public int getFramePadding(WindowHandlerBase$WindowSide windowHandlerBase$WindowSide) {
        long n = Renderer191.f3701 ^ 0x5F6F166E2D9BL;
        int n2 = 1;
        if (windowHandlerBase$WindowSide == WindowHandlerBase$WindowSide.TOP) {
            n2 += 12;
        }
        return n2;
    }
    
    public void renderWindowFrame(Window window, double n, double n2) {
        long n3 = Renderer191.f3701 ^ 0x1B657A7C642BL;
        int m9155 = Class253.m9155();
        IRenderer2D renderer = ((IRenderable2D)this).getRenderer();
        IFontRenderer fontRenderer = this.getFontRenderer();
        Color windowColor = this.getWindowColor(window);
        int n4 = m9155;
        renderer.drawRectangle(((ElementBase)window).getX(), ((ElementBase)window).getY(), window.getWidth(), window.getHeight(), ColorUtils.transparency(0, 0.5f));
        int hovered;
        int n5 = hovered = (window.isHovered(n, n2) ? 1 : 0);
        Label_0185: {
            if (n4 != 0) {
                if (n5 != 0) {
                    double n6 = hovered = dcmpl(n, ((ElementBase)window).getX());
                    if (n4 == 0) {
                        break Label_0185;
                    }
                    if (n6 >= 0) {
                        double n7 = hovered = dcmpg(n, ((ElementBase)window).getX() + window.getWidth());
                        if (n4 == 0) {
                            break Label_0185;
                        }
                        if (n7 <= 0) {
                            double n8 = hovered = dcmpl(n2, ((ElementBase)window).getY());
                            if (n4 == 0) {
                                break Label_0185;
                            }
                            if (n8 >= 0) {
                                double n9 = hovered = dcmpg(n2, ((ElementBase)window).getY() + 12.0);
                                if (n4 == 0) {
                                    break Label_0185;
                                }
                                if (n9 <= 0) {
                                    hovered = 1;
                                    break Label_0185;
                                }
                            }
                        }
                    }
                }
                hovered = 0;
            }
        }
        int n10 = hovered;
        IRenderer2D renderer2D = renderer;
        double x = ((ElementBase)window).getX();
        double y = ((ElementBase)window).getY();
        double width = window.getWidth();
        double n11 = 12.0;
        int n13;
        int n12 = n13 = (window.isFocused() ? 1 : 0);
        Label_0254: {
            Label_0249: {
                if (n4 != 0) {
                    if (n12 != 0) {
                        break Label_0249;
                    }
                    int n14;
                    n13 = (n14 = n10);
                }
                if (n4 != 0) {
                    if (n12 == 0) {
                        break Label_0249;
                    }
                    n13 = windowColor.brighter().getRGB();
                }
                break Label_0254;
            }
            n13 = windowColor.getRGB();
        }
        renderer2D.drawRectangle(x, y, width, n11, n13);
        fontRenderer.drawString(((INamed)window).getDisplayName(), ((ElementBase)window).getX() + 2.0, ((ElementBase)window).getY() + 2.0, -1);
        double n17;
        int n16;
        int n15 = n16 = (int)(n17 = ((window instanceof ResizeableWindow) ? 1 : 0));
        if (n4 != 0) {
            if (n15 != 0) {
                IRenderer2D renderer2D2 = renderer;
                renderer.drawLine(((ElementBase)window).getX() + window.getWidth() - 7.0, ((ElementBase)window).getY() + window.getHeight(), ((ElementBase)window).getX() + window.getWidth(), ((ElementBase)window).getY() + window.getHeight() - 7.0, 2.0f, windowColor.getRGB());
                renderer2D2.drawLine(((ElementBase)window).getX() + window.getWidth() - 2.3333333333333335, ((ElementBase)window).getY() + window.getHeight(), ((ElementBase)window).getX() + window.getWidth(), ((ElementBase)window).getY() + window.getHeight() - 2.3333333333333335, 2.0f, windowColor.getRGB());
                renderer2D2.drawLine(((ElementBase)window).getX() + window.getWidth() - 4.666666666666667, ((ElementBase)window).getY() + window.getHeight(), ((ElementBase)window).getX() + window.getWidth(), ((ElementBase)window).getY() + window.getHeight() - 4.666666666666667, 2.0f, windowColor.getRGB());
            }
            renderer.drawRectangleOutline(((ElementBase)window).getX(), ((ElementBase)window).getY(), window.getWidth(), window.getHeight(), 2.0f, windowColor.getRGB());
            n17 = (n16 = n10);
        }
        Label_0634: {
            if (n4 != 0) {
                if (n16 != 0) {
                    double n18 = n17 = dcmpl(n, ((ElementBase)window).getX() + window.getWidth() - 4.0 - 8.0);
                    if (n4 == 0) {
                        break Label_0634;
                    }
                    if (n18 >= 0) {
                        double n19 = n17 = dcmpg(n, ((ElementBase)window).getX() + window.getWidth());
                        if (n4 == 0) {
                            break Label_0634;
                        }
                        if (n19 <= 0) {
                            double n20 = n17 = dcmpl(n2, ((ElementBase)window).getY() + 1.0);
                            if (n4 == 0) {
                                break Label_0634;
                            }
                            if (n20 >= 0) {
                                double n21 = n17 = dcmpg(n2, ((ElementBase)window).getY() + 12.0);
                                if (n4 == 0) {
                                    break Label_0634;
                                }
                                if (n21 <= 0) {
                                    n17 = 1;
                                    break Label_0634;
                                }
                            }
                        }
                    }
                }
                n17 = 0;
            }
        }
        if (n17 != 0) {
            IRenderer2D renderer2D3 = renderer;
            double n22 = ((ElementBase)window).getX() + window.getWidth() - 4.0 - 8.0;
            double y2 = ((ElementBase)window).getY();
            double n23 = 12.0;
            renderer2D3.drawRectangle(n22, y2, n23, n23, ColorUtils.transparency(0, 0.35f));
        }
        if (this.f3693 != null) {
            IRenderer2D renderer2D4 = renderer;
            VectorGraphic f3693 = this.f3693;
            double n24 = ((ElementBase)window).getX() + window.getWidth() - 2.0 - 8.0;
            double n25 = ((ElementBase)window).getY() + 2.0;
            double n26 = 8.0;
            renderer2D4.drawGraphicRectangle((IGraphic)f3693, n24, n25, n26, n26);
        }
        Window window2 = window;
        if (n4 != 0) {
            if (!(window instanceof IPinnable)) {
                return;
            }
            window2 = window;
        }
        IPinnable pinnable = (IPinnable)window2;
        int n27 = n10;
        if (n4 != 0) {
            if (n27 != 0) {
                double n29;
                double n28 = n29 = dcmpl(n, ((ElementBase)window).getX() + window.getWidth() - 4.0 - 8.0 - 4.0 - 8.0);
                if (n4 != 0) {
                    if (n28 >= 0) {
                        double n30 = n29 = dcmpg(n, ((ElementBase)window).getX() + window.getWidth() - 8.0 - 4.0);
                        if (n4 != 0) {
                            if (n30 <= 0) {
                                double n31 = n29 = dcmpl(n2, ((ElementBase)window).getY() + 1.0);
                                if (n4 != 0) {
                                    if (n31 >= 0) {
                                        double n32 = n29 = dcmpg(n2, ((ElementBase)window).getY() + 12.0);
                                        if (n4 != 0) {
                                            if (n32 <= 0) {}
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int n33 = n27;
        if (n4 != 0) {
            if (n33 != 0) {
                IRenderer2D renderer2D5 = renderer;
                double n34 = ((ElementBase)window).getX() + window.getWidth() - 4.0 - 8.0 - 4.0 - 8.0;
                double y3 = ((ElementBase)window).getY();
                double n35 = 12.0;
                renderer2D5.drawRectangle(n34, y3, n35, n35, ColorUtils.transparency(0, 0.35f));
            }
            pinnable.isPinned();
        }
        VectorGraphic vectorGraphic = (n33 != 0) ? this.f3684 : this.f3681;
        if (vectorGraphic != null) {
            IRenderer2D renderer2D6 = renderer;
            VectorGraphic vectorGraphic2 = vectorGraphic;
            double n36 = ((ElementBase)window).getX() + window.getWidth() - 2.0 - 8.0 - 4.0 - 8.0;
            double n37 = ((ElementBase)window).getY() + 2.0;
            double n38 = 8.0;
            renderer2D6.drawGraphicRectangle((IGraphic)vectorGraphic2, n36, n37, n38, n38);
        }
    }
    
    public Window m7671(double n, double n2) {
        long n3 = Renderer191.f3701 ^ 0x9E3C3293CCDL;
        int m9155 = Class253.m9155();
        Iterator iterator = Lists.reverse(RusherHackAPI.getWindowManager().getVisibleWindows()).iterator();
        int i = m9155;
    Label_0035:
        while (iterator.hasNext()) {
            Window window = (Window)iterator.next();
            Window window3 = null;
            do {
                Window window2 = window3;
                if (!super.isElementHovered(window2, n, n2)) {
                    continue Label_0035;
                }
                window3 = window2;
            } while (i == 0);
            return window3;
        }
        return null;
    }
    
    public WindowViewHandlerBase getViewHandler() {
        long n = Renderer191.f3701 ^ 0x5DEC195CC838L;
        return (WindowViewHandlerBase)this.f3692;
    }
    
    public Class025 m7672() {
        long n = Renderer191.f3701 ^ 0x678789A8F86AL;
        return this.f3697;
    }
    
    public void renderElements(RenderContext renderContext, double n, double n2) {
        long n3 = Renderer191.f3701 ^ 0x4E0B61F2FF3DL;
        int m9154 = Class253.m9154();
        IRenderer2D renderer = ((IRenderable2D)this).getRenderer();
        IFontRenderer fontRenderer = this.getFontRenderer();
        renderContext.pose();
        ((IRenderer)renderer).isBuilding();
        this.f3698 = null;
        this.f3690 = this.m7671(n, n2);
        this.f3694 = null;
        this.f3682 = null;
        this.f3691 = null;
        List visibleWindows = RusherHackAPI.getWindowManager().getVisibleWindows();
        float scale = ((ElementHandlerBase)this).getScale();
        int n4 = m9154;
        Label_0242: {
            if (n4 == 0) {
                if (!(boolean)((Setting)Hud297.blur).getValue()) {
                    break Label_0242;
                }
                Class594.f9412.m18048();
            }
            Iterator iterator2;
            Iterator iterator = iterator2 = visibleWindows.iterator();
            while (true) {
                while (iterator.hasNext()) {
                    Window window = (Window)iterator2.next();
                    if (n4 != 0) {
                        Class594.f9412.m18053((int)((Setting)Hud297.strength).getValue());
                        break Label_0242;
                    }
                    iterator = iterator2;
                    Window window2 = window;
                    float n5 = (float)((ElementBase)window2).getX() * scale;
                    float n6 = (float)((ElementBase)window2).getY() * scale;
                    float n7 = (float)window2.getWidth() * scale;
                    float n8 = (float)window2.getHeight() * scale;
                    Class153 m9155 = Class594.f9412.m18055();
                    float n9 = n6;
                    float n10 = n5;
                    Class480.m14979(m9155, n10, n9, n10 + n7, n6 + n8);
                }
                Class594.f9412.m18052();
                continue;
            }
        }
        IRenderer2D renderer2D = renderer;
        super.renderElements(renderContext, n, n2);
        renderer2D.begin(renderContext.pose(), fontRenderer);
        ComboBoxComponent comboBoxComponent7;
        ComboBoxComponent comboBoxComponent6;
        ComboBoxComponent comboBoxComponent5;
        ComboBoxComponent comboBoxComponent4;
        ComboBoxComponent comboBoxComponent3;
        ComboBoxComponent comboBoxComponent2;
        ComboBoxComponent comboBoxComponent = comboBoxComponent2 = (comboBoxComponent3 = (comboBoxComponent4 = (comboBoxComponent5 = (comboBoxComponent6 = (comboBoxComponent7 = this.f3686)))));
        double scaleFactor = 0.0;
        Label_0612: {
            Label_0603: {
                if (n4 == 0) {
                    if (comboBoxComponent == null) {
                        break Label_0603;
                    }
                    ComboBoxComponent comboBoxComponent8;
                    comboBoxComponent2 = (comboBoxComponent8 = (comboBoxComponent3 = (comboBoxComponent4 = (comboBoxComponent5 = (comboBoxComponent6 = (comboBoxComponent7 = this.f3686))))));
                }
                ComboBoxComponent comboBoxComponent9 = comboBoxComponent;
                if (n4 == 0) {
                    if (!comboBoxComponent2.isOpen()) {
                        break Label_0603;
                    }
                    comboBoxComponent4 = (comboBoxComponent3 = (comboBoxComponent5 = (comboBoxComponent6 = (comboBoxComponent7 = comboBoxComponent9))));
                }
                double x = ((WindowContent)comboBoxComponent3).getX();
                double y = ((WindowContent)comboBoxComponent4).getY();
                double n11 = comboBoxComponent5.getWidth() + 12.0 + 2.0;
                double height = comboBoxComponent6.getHeight();
                double n12 = comboBoxComponent7.getOptions().length * height;
                int i = 0;
                renderer.drawRectangle(x, y + height, n11, n12, 0);
                int n13 = i;
                while (i < comboBoxComponent9.getOptions().length) {
                    String s = comboBoxComponent9.getOptions()[n13];
                    double n14 = y + height * (n13 + 1);
                    scaleFactor = n;
                    if (n4 != 0) {
                        break Label_0612;
                    }
                    double n15 = dcmpl(n, x);
                    if (n4 == 0) {
                        if (n15 >= 0) {
                            double n16 = dcmpg(n, x + n11);
                            if (n4 == 0) {
                                if (n16 <= 0) {
                                    double n17 = dcmpl(n2, n14);
                                    if (n4 == 0) {
                                        if (n17 >= 0) {
                                            double n18 = dcmpg(n2, n14 + height);
                                            if (n4 == 0) {
                                                if (n18 <= 0) {}
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int n19 = (int)n15;
                    if (n19 != 0) {
                        renderer.drawRectangle(x, n14, n11, height, this.getWindowColor(((WindowContent)comboBoxComponent9).getWindow()).getRGB());
                    }
                    IFontRenderer fontRenderer2 = fontRenderer;
                    String s2 = s;
                    double n20 = x + 2.0;
                    double n21 = n14 + 1.0;
                    int n22 = n19;
                    if (n4 == 0 && n22 == 0) {
                        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_1.invoke(22096, 0x33373384B39B3917L ^ n3);
                    }
                    fontRenderer2.drawString(s2, n20, n21, n22);
                    ++n13;
                }
            }
            scaleFactor = Globals.mc.getWindow().getScaleFactor();
        }
        double scaleFactor2 = scaleFactor;
        Globals.mc.getWindow().setScaleFactor(2.0);
        if (n4 == 0) {
            ((Renderer026)this.f3697).render(renderContext, n, n2);
            Globals.mc.getWindow().setScaleFactor(scaleFactor2);
            if (this.f3696 != null) {
                this.m7673(n, n2);
            }
            ((IRenderer)renderer).end();
        }
    }
    
    public boolean isElementHovered(Window window, double n, double n2) {
        long n3 = Renderer191.f3701 ^ 0x4070699537C2L;
        return this.f3690 == window;
    }
    
    public Renderer191(Hud297 obf297) {
    }
    
    public boolean consumeElementMouseClick(Window window, double n, double n2, int n3) {
        long n4 = Renderer191.f3701 ^ 0x64F0F2CDF454L;
        int m9154 = Class253.m9154();
        boolean hovered = window.isHovered(n, n2);
        if (m9154 == 0 && hovered) {
            double n5 = dcmpl(n, ((ElementBase)window).getX() + window.getWidth() - 4.0 - 8.0);
            if (m9154 == 0) {
                if (n5 >= 0) {
                    double n6 = dcmpg(n, ((ElementBase)window).getX() + window.getWidth());
                    if (m9154 == 0) {
                        if (n6 <= 0) {
                            double n7 = dcmpl(n2, ((ElementBase)window).getY() + 1.0);
                            if (m9154 == 0) {
                                if (n7 >= 0) {
                                    double n8 = dcmpg(n2, ((ElementBase)window).getY() + 12.0);
                                    if (m9154 == 0) {
                                        if (n8 <= 0) {}
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int n12;
            double n11;
            int n10;
            double n9 = n10 = (int)(n11 = (n12 = (int)n5));
            if (m9154 == 0) {
                if (n9 != 0) {
                    boolean b = true;
                    window.onClose();
                    return b;
                }
                n10 = (n12 = ((window instanceof IPinnable) ? 1 : 0));
            }
            int n17 = 0;
            Label_0403: {
                if (m9154 == 0) {
                    if (n10 != 0) {
                        IPinnable pinnable = (IPinnable)window;
                        double n13 = dcmpl(n, ((ElementBase)window).getX() + window.getWidth() - 4.0 - 8.0 - 4.0 - 8.0);
                        if (m9154 == 0) {
                            if (n13 >= 0) {
                                double n14 = dcmpg(n, ((ElementBase)window).getX() + window.getWidth() - 8.0 - 4.0);
                                if (m9154 == 0) {
                                    if (n14 <= 0) {
                                        double n15 = dcmpl(n2, ((ElementBase)window).getY() + 1.0);
                                        if (m9154 == 0) {
                                            if (n15 >= 0) {
                                                double n16 = dcmpg(n2, ((ElementBase)window).getY() + 12.0);
                                                if (m9154 == 0) {
                                                    if (n16 <= 0) {}
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        n17 = (n12 = (int)n13);
                        if (m9154 != 0) {
                            break Label_0403;
                        }
                        if (n17 != 0) {
                            IPinnable pinnable2 = pinnable;
                            boolean pinned = pinnable2.isPinned();
                            if (m9154 == 0 && !pinned) {}
                            pinnable2.setPinned(pinned);
                            return true;
                        }
                    }
                    this.moveElementToTop(window);
                    window.setFocused(true);
                    n11 = dcmpl(n2, ((ElementBase)window).getY());
                }
            }
            double n18 = 0.0;
            if (m9154 == 0) {
                if (n17 >= 0) {
                    n18 = dcmpg(n2, ((ElementBase)window).getY() + 12.0);
                    if (m9154 == 0) {
                        if (n18 <= 0) {}
                    }
                }
            }
            int n19 = (int)n18;
            double n20 = dcmpl(n, ((ElementBase)window).getX() + window.getWidth() - 7.0);
            if (m9154 == 0) {
                if (n20 >= 0) {
                    double n21 = dcmpg(n, ((ElementBase)window).getX() + window.getWidth());
                    if (m9154 == 0) {
                        if (n21 <= 0) {
                            double n22 = dcmpl(n2, ((ElementBase)window).getY() + window.getHeight() - 7.0);
                            if (m9154 == 0) {
                                if (n22 >= 0) {
                                    double n23 = dcmpg(n2, ((ElementBase)window).getY() + window.getHeight());
                                    if (m9154 == 0) {
                                        if (n23 <= 0) {}
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int n24 = (int)n20;
            int n26;
            int n25 = n26 = n19;
            Label_0642: {
                if (m9154 == 0) {
                    if (n25 != 0) {
                        n26 = n3;
                        if (m9154 != 0) {
                            break Label_0642;
                        }
                        if (n3 == 0) {
                            window.setDragging(true, n - ((ElementBase)window).getX(), n2 - ((ElementBase)window).getY());
                            if (m9154 == 0) {
                                return true;
                            }
                        }
                    }
                    n26 = ((window instanceof ResizeableWindow) ? 1 : 0);
                }
            }
            if (m9154 == 0) {
                if (n26 != 0) {
                    ResizeableWindow resizeableWindow = (ResizeableWindow)window;
                    int n27 = n24;
                    if (m9154 != 0) {
                        return true;
                    }
                    if (n27 != 0) {
                        resizeableWindow.setResizing(true, n - window.getWidth(), n2 - window.getHeight());
                        if (m9154 == 0) {
                            return true;
                        }
                    }
                }
                window.mouseClicked(n, n2, n3);
            }
            return true;
        }
        return hovered;
    }
    
    public IFontRenderer getFontRenderer() {
        return null;
    }
    
    public boolean consumeMouseClick(double p0, double p1, int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          76463912524341
        //     6: lxor           
        //     7: lstore          6
        //     9: invokestatic    org/rusherhack/Class253.m9154:()I
        //    12: istore          8
        //    14: aload_0        
        //    15: astore          9
        //    17: aload           9
        //    19: iload           8
        //    21: ifne            125
        //    24: getfield        org/rusherhack/Renderer191.f3696:Ljava/util/List;
        //    27: ifnull          123
        //    30: goto            37
        //    33: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    36: athrow         
        //    37: iload           5
        //    39: ifne            123
        //    42: goto            49
        //    45: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    48: athrow         
        //    49: aload           9
        //    51: iload           8
        //    53: ifne            125
        //    56: goto            63
        //    59: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    62: athrow         
        //    63: getfield        org/rusherhack/Renderer191.f3698:Lorg/rusherhack/client/api/ui/window/context/ContextAction;
        //    66: ifnull          123
        //    69: goto            76
        //    72: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    75: athrow         
        //    76: aload           9
        //    78: aconst_null    
        //    79: aload           9
        //    81: getfield        org/rusherhack/Renderer191.f3698:Lorg/rusherhack/client/api/ui/window/context/ContextAction;
        //    84: invokevirtual   org/rusherhack/client/api/ui/window/context/ContextAction.action:()Ljava/lang/Runnable;
        //    87: invokeinterface java/lang/Runnable.run:()V
        //    92: putfield        org/rusherhack/Renderer191.f3696:Ljava/util/List;
        //    95: iconst_1       
        //    96: dup            
        //    97: dup            
        //    98: pop2           
        //    99: ireturn        
        //   100: astore_0       
        //   101: getstatic       org/rusherhack/Class170.f3346:Lorg/rusherhack/core/logging/Logger;
        //   104: ldc_w           "Error while executing context action"
        //   107: iconst_1       
        //   108: dup            
        //   109: dup            
        //   110: pop2           
        //   111: anewarray       Ljava/lang/Object;
        //   114: dup            
        //   115: iconst_0       
        //   116: aload_0        
        //   117: aastore        
        //   118: invokeinterface org/rusherhack/core/logging/ILog.error:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   123: aload           9
        //   125: iload           8
        //   127: ifne            371
        //   130: getfield        org/rusherhack/Renderer191.f3686:Lorg/rusherhack/client/api/ui/window/content/component/ComboBoxComponent;
        //   133: ifnull          358
        //   136: goto            143
        //   139: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   142: athrow         
        //   143: aload           9
        //   145: getfield        org/rusherhack/Renderer191.f3686:Lorg/rusherhack/client/api/ui/window/content/component/ComboBoxComponent;
        //   148: dup            
        //   149: astore_0       
        //   150: dup            
        //   151: dup2           
        //   152: invokevirtual   org/rusherhack/client/api/ui/window/content/WindowContent.getX:()D
        //   155: dstore          10
        //   157: invokevirtual   org/rusherhack/client/api/ui/window/content/WindowContent.getY:()D
        //   160: dstore          12
        //   162: invokevirtual   org/rusherhack/client/api/ui/window/content/component/ComboBoxComponent.getWidth:()D
        //   165: ldc2_w          12.0
        //   168: dadd           
        //   169: ldc2_w          2.0
        //   172: dadd           
        //   173: dstore          14
        //   175: invokevirtual   org/rusherhack/client/api/ui/window/content/component/ComboBoxComponent.getHeight:()D
        //   178: dstore          16
        //   180: iconst_0       
        //   181: dup            
        //   182: istore          18
        //   184: aload_0        
        //   185: invokevirtual   org/rusherhack/client/api/ui/window/content/component/ComboBoxComponent.getOptions:()[Ljava/lang/String;
        //   188: arraylength    
        //   189: if_icmpge       345
        //   192: dload           12
        //   194: dload           16
        //   196: iload           18
        //   198: iconst_1       
        //   199: dup            
        //   200: dup            
        //   201: pop2           
        //   202: iadd           
        //   203: i2d            
        //   204: dmul           
        //   205: dadd           
        //   206: dstore          19
        //   208: dload_1        
        //   209: dload           10
        //   211: dcmpl          
        //   212: iload           8
        //   214: ifne            357
        //   217: iload           8
        //   219: ifne            342
        //   222: goto            229
        //   225: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   228: athrow         
        //   229: iflt            337
        //   232: goto            239
        //   235: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   238: athrow         
        //   239: dload_1        
        //   240: dload           10
        //   242: dload           14
        //   244: dadd           
        //   245: dcmpg          
        //   246: iload           8
        //   248: ifne            342
        //   251: goto            258
        //   254: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   257: athrow         
        //   258: ifgt            337
        //   261: goto            268
        //   264: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   267: athrow         
        //   268: dload_3        
        //   269: dload           19
        //   271: dcmpl          
        //   272: iload           8
        //   274: ifne            342
        //   277: goto            284
        //   280: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   283: athrow         
        //   284: iflt            337
        //   287: goto            294
        //   290: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   293: athrow         
        //   294: dload_3        
        //   295: dload           19
        //   297: dload           16
        //   299: dadd           
        //   300: dcmpg          
        //   301: iload           8
        //   303: ifne            342
        //   306: goto            313
        //   309: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   312: athrow         
        //   313: ifgt            337
        //   316: goto            323
        //   319: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   322: athrow         
        //   323: aload_0        
        //   324: dup            
        //   325: iload           18
        //   327: invokevirtual   org/rusherhack/client/api/ui/window/content/component/ComboBoxComponent.setSelected:(I)V
        //   330: goto            346
        //   333: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   336: athrow         
        //   337: iinc            18, 1
        //   340: iload           18
        //   342: goto            184
        //   345: aload_0        
        //   346: iconst_0       
        //   347: invokevirtual   org/rusherhack/client/api/ui/window/content/component/ComboBoxComponent.setOpen:(Z)V
        //   350: iconst_1       
        //   351: aload           9
        //   353: aconst_null    
        //   354: putfield        org/rusherhack/Renderer191.f3686:Lorg/rusherhack/client/api/ui/window/content/component/ComboBoxComponent;
        //   357: ireturn        
        //   358: aload           9
        //   360: dup            
        //   361: new             Ljava/util/ArrayList;
        //   364: dup            
        //   365: invokespecial   java/util/ArrayList.<init>:()V
        //   368: putfield        org/rusherhack/Renderer191.f3696:Ljava/util/List;
        //   371: getfield        org/rusherhack/Renderer191.f3697:Lorg/rusherhack/client/Class025;
        //   374: dload_1        
        //   375: dload_3        
        //   376: invokevirtual   org/rusherhack/client/Renderer026.isHovered:(DD)Z
        //   379: iload           8
        //   381: ifne            440
        //   384: ifeq            439
        //   387: goto            394
        //   390: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   393: athrow         
        //   394: aload           9
        //   396: getfield        org/rusherhack/Renderer191.f3697:Lorg/rusherhack/client/Class025;
        //   399: dload_1        
        //   400: dload_3        
        //   401: iload           5
        //   403: invokevirtual   org/rusherhack/client/Renderer034.mouseClicked:(DDI)Z
        //   406: iload           8
        //   408: ifne            440
        //   411: goto            418
        //   414: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   417: athrow         
        //   418: ifeq            439
        //   421: goto            428
        //   424: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   427: athrow         
        //   428: iconst_1       
        //   429: dup            
        //   430: dup            
        //   431: pop2           
        //   432: goto            443
        //   435: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   438: athrow         
        //   439: iconst_0       
        //   440: iconst_1       
        //   441: dup            
        //   442: pop2           
        //   443: istore_0       
        //   444: aload           9
        //   446: dup            
        //   447: dload_1        
        //   448: dload_3        
        //   449: iload           5
        //   451: invokespecial   org/rusherhack/client/api/ui/window/WindowHandlerBase.consumeMouseClick:(DDI)Z
        //   454: pop            
        //   455: getfield        org/rusherhack/Renderer191.f3696:Ljava/util/List;
        //   458: invokeinterface java/util/List.size:()I
        //   463: iload           8
        //   465: ifne            502
        //   468: aload           9
        //   470: swap           
        //   471: ifle            497
        //   474: goto            481
        //   477: invokestatic    org/rusherhack/Renderer191.m672:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   480: athrow         
        //   481: dload_1        
        //   482: d2i            
        //   483: putfield        org/rusherhack/Renderer191.f3685:I
        //   486: iconst_1       
        //   487: aload           9
        //   489: dload_3        
        //   490: d2i            
        //   491: putfield        org/rusherhack/Renderer191.f3695:I
        //   494: dup            
        //   495: istore_0       
        //   496: ireturn        
        //   497: aconst_null    
        //   498: putfield        org/rusherhack/Renderer191.f3696:Ljava/util/List;
        //   501: iload_0        
        //   502: ireturn        
        //    StackMapTable: 00 34 FF 00 21 00 07 07 00 02 03 03 01 04 01 07 00 02 00 01 07 02 30 03 47 07 02 30 03 49 07 02 30 43 07 00 02 48 07 02 30 03 57 07 02 30 FF 00 16 00 07 07 00 5D 03 03 01 04 01 07 00 02 00 00 41 07 00 02 4D 07 02 30 03 FF 00 28 00 0C 07 01 75 03 03 01 04 01 07 00 02 03 03 03 03 01 00 01 01 FF 00 28 00 0D 07 01 75 03 03 01 04 01 07 00 02 03 03 03 03 01 03 00 01 07 02 30 43 01 45 07 02 30 03 4E 07 02 30 43 01 45 07 02 30 03 4B 07 02 30 43 01 45 07 02 30 03 4E 07 02 30 43 01 45 07 02 30 03 49 07 02 30 03 44 01 FA 00 02 40 07 01 75 4A 01 FF 00 00 00 07 07 00 5D 03 03 01 04 01 07 00 02 00 00 4C 07 00 02 52 07 02 30 03 53 07 02 30 43 01 45 07 02 30 03 46 07 02 30 03 40 01 42 01 FF 00 21 00 07 01 03 03 01 04 01 07 00 02 00 01 07 02 30 43 07 00 02 4F 07 00 02 44 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  49     69     72     76     Ljava/lang/Exception;
        //  37     56     59     63     Ljava/lang/Exception;
        //  24     42     45     49     Ljava/lang/Exception;
        //  17     30     33     37     Ljava/lang/Exception;
        //  76     96     100    123    Ljava/lang/Exception;
        //  125    136    139    143    Ljava/lang/Exception;
        //  208    222    225    229    Ljava/lang/Exception;
        //  217    232    235    239    Ljava/lang/Exception;
        //  229    251    254    258    Ljava/lang/Exception;
        //  239    261    264    268    Ljava/lang/Exception;
        //  258    277    280    284    Ljava/lang/Exception;
        //  268    287    290    294    Ljava/lang/Exception;
        //  284    306    309    313    Ljava/lang/Exception;
        //  294    316    319    323    Ljava/lang/Exception;
        //  313    333    333    337    Ljava/lang/Exception;
        //  371    387    390    394    Ljava/lang/Exception;
        //  384    411    414    418    Ljava/lang/Exception;
        //  394    421    424    428    Ljava/lang/Exception;
        //  418    435    435    439    Ljava/lang/Exception;
        //  444    474    477    481    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void m7673(double n, double n2) {
        
    }
    
    public WindowContentHandlerBase getContentHandler() {
        long n = Renderer191.f3701 ^ 0x39A640CF2C46L;
        return (WindowContentHandlerBase)this.f3700;
    }
    
    static {}
    
    public static Exception m672(Exception ex) {
        return ex;
    }
    
    public static String m656(byte[] array) {
        int count = 0;
        int length;
        char[] value = new char[length = array.length];
        for (int i = 0; i < length; ++i) {
            int n;
            if ((n = (0xFF & array[i])) < 192) {
                value[count++] = (char)n;
            }
            else if (n < 224) {
                value[count++] = (char)((char)((char)(n & 0x1F) << 6) | (char)(array[++i] & 0x3F));
            }
            else if (i < length - 2) {
                value[count++] = (char)((char)((char)((char)(n & 0xF) << 12) | (char)(array[++i] & 0x3F) << 6) | (char)(array[++i] & 0x3F));
            }
        }
        return new String(value, 0, count);
    }
    
    public static String m657(int n, long n2) {
        return null;
    }
    
    public static Object m658(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        String m657 = m657((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, m657), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m657;
    }
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Renderer191.m132:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:67)
        //     at com.strobel.assembler.metadata.MethodDefinition.tryLoadBody(MethodDefinition.java:729)
        //     at com.strobel.assembler.metadata.MethodDefinition.getBody(MethodDefinition.java:83)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:194)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // Caused by: java.lang.ClassCastException: class com.strobel.assembler.ir.ConstantPool.MethodHandleEntry cannot be cast to class com.strobel.assembler.ir.ConstantPool.ConstantEntry (com.strobel.assembler.ir.ConstantPool.MethodHandleEntry and com.strobel.assembler.ir.ConstantPool.ConstantEntry are in unnamed module of loader 'app')
        //     at com.strobel.assembler.ir.ConstantPool.lookupConstant(ConstantPool.java:120)
        //     at com.strobel.assembler.metadata.ClassFileReader.Scope.lookupConstant(ClassFileReader.java:1590)
        //     at com.strobel.assembler.metadata.MethodReader.readBodyCore(MethodReader.java:299)
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:63)
        //     ... 15 more
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static int m2173(int n, long n2) {
        return 0;
    }
    
    public static int m2174(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        int m2173 = m2173((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, m2173), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m2173;
    }
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Renderer191.m174:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:67)
        //     at com.strobel.assembler.metadata.MethodDefinition.tryLoadBody(MethodDefinition.java:729)
        //     at com.strobel.assembler.metadata.MethodDefinition.getBody(MethodDefinition.java:83)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:194)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // Caused by: java.lang.ClassCastException: class com.strobel.assembler.ir.ConstantPool.MethodHandleEntry cannot be cast to class com.strobel.assembler.ir.ConstantPool.ConstantEntry (com.strobel.assembler.ir.ConstantPool.MethodHandleEntry and com.strobel.assembler.ir.ConstantPool.ConstantEntry are in unnamed module of loader 'app')
        //     at com.strobel.assembler.ir.ConstantPool.lookupConstant(ConstantPool.java:120)
        //     at com.strobel.assembler.metadata.ClassFileReader.Scope.lookupConstant(ClassFileReader.java:1590)
        //     at com.strobel.assembler.metadata.MethodReader.readBodyCore(MethodReader.java:299)
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:63)
        //     ... 15 more
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static int m1279(long n, long n2) {
        n ^= (n2 << 48 | n2);
        int n3 = (int)(n >>> 46);
        if (Renderer191.f3709[n3] != null) {
            return n3;
        }
        Object o = Renderer191.f3708[n3];
        if (!(o instanceof String)) {
            return n3;
        }
        int n5 = switch ((int)(n >>> 42 & 0x3FL)) {
            case 0 -> 32;
            case 1 -> 27;
            case 2 -> 58;
            case 3 -> 19;
            case 4 -> 23;
            case 5 -> 50;
            case 6 -> 37;
            case 7 -> 29;
            case 8 -> 52;
            case 9 -> 10;
            case 10 -> 7;
            case 11 -> 8;
            case 12 -> 26;
            case 13 -> 13;
            case 14 -> 38;
            case 15 -> 49;
            case 16 -> 57;
            case 17 -> 28;
            case 18 -> 36;
            case 19 -> 5;
            case 20 -> 59;
            case 21 -> 44;
            case 22 -> 54;
            case 23 -> 24;
            case 24 -> 22;
            case 25 -> 31;
            case 26 -> 62;
            case 27 -> 47;
            case 28 -> 61;
            case 29 -> 60;
            case 30 -> 63;
            case 31 -> 40;
            case 32 -> 25;
            case 33 -> 15;
            case 34 -> 21;
            case 35 -> 30;
            case 36 -> 20;
            case 37 -> 18;
            case 38 -> 41;
            case 39 -> 34;
            case 40 -> 45;
            case 41 -> 4;
            case 42 -> 48;
            case 43 -> 16;
            case 44 -> 12;
            case 45 -> 11;
            case 46 -> 9;
            case 47 -> 42;
            case 48 -> 35;
            case 49 -> 46;
            case 50 -> 56;
            case 51 -> 51;
            case 52 -> 17;
            case 53 -> 2;
            case 54 -> 14;
            case 55 -> 1;
            case 56 -> 53;
            case 57 -> 43;
            case 58 -> 6;
            case 59 -> 33;
            case 60 -> 3;
            case 61 -> 0;
            case 62 -> 39;
            default -> 55;
        };
        int[] array = new int[6];
        for (int i = 0; i < 6; ++i) {
            int n6 = (int)(n >>> 7 * (5 - i) & 0x7FL) - n5;
            if (n6 < 0) {
                n6 += 128;
            }
            array[i] = n6;
        }
        char[] charArray = ((String)o).toCharArray();
        for (int j = 0; j < charArray.length; ++j) {
            int n7 = array[j % array.length];
            if (n7 == 0) {
                break;
            }
            charArray[j] ^= (char)n7;
        }
        Renderer191.f3709[n3] = new String(charArray);
        return n3;
    }
    
    public static void m343() {
        Object[] f3708 = Renderer191.f3708;
        f3708[0] = "\u0007\u0018(?T\u0011\u001b\u0002*cN\u0005\u000b\u0001a\u0182";
        f3708[1] = "]L\u0016\nY^AV\u0014VCJQU_\u011f";
        f3708[2] = "!\u0012_p84=\b],\" -\u000b\u0016\u0135";
        f3708[3] = "Q\ruDwhM\u0017w\u0018m|]\u0014<\tjo[Q~\u0005bzW\u0011uDIrY\u0018w\u0018";
        f3708[4] = "{+-\u0004$ig1/X>}w2dI:uq7>\u00047l}w?Cxk}7.E!2w6$^3r`w)E;l{7/D\"2W6'H9^{!\tE;l{7/D\"";
        f3708[5] = Double.TYPE;
        Renderer191.f3709[5] = "java/lang/Double";
        f3708[6] = "r0\u00187|\u0018n*\u001akf\f~)Qzb\u0004x,\u000b7o\u001dtl\np \u001at,\u001bvyC~-\u0011mk\u0015il<v`\u0019x:\u000bXm\u0019t-\u0011";
        f3708[7] = "qbTX[JmxV\u0004A^}{\u001d\u0015EV{~GX\u01a3";
        f3708[8] = "\u001fFb\thI\u0003\\`Ur]\u0013_+\u0221";
        f3708[9] = Integer.TYPE;
        Renderer191.f3709[9] = "java/lang/Integer";
        f3708[10] = "a':\u0000\u001e\u000f}=8\\\u0004\u001bm>sM\u0000\u0013k;)\u0000\r\ng{(GB\rg;9A\u001bTY<3J\u0003\rX<8Y$\u001b`11K\u001e8o&8";
        f3708[11] = "!bo/\u0019\u0016*m~`d\u000e9jw)";
        f3708[12] = "k-@H\u000bb`\"Q\u0007w{o\"WKIk";
        f3708[13] = "\u001c%La\u0014\u0004\u0000?N=\u000e\u0010\u0010<\u0005,\n\u0018\u00169_a\u01ea";
        f3708[14] = Boolean.TYPE;
        Renderer191.f3709[14] = "java/lang/Boolean";
        f3708[15] = "Uq|$\u0017RIk~x\rFYh5i\nU_-we\u0002@Sm|$,kUd";
        f3708[16] = "LMKV\u0016E9m@Y\u0007\nXcKR\u0003P,";
        f3708[17] = Void.TYPE;
        Renderer191.f3709[17] = "java/lang/Void";
        f3708[18] = "xG\u0011'UE\rg\u001a(D\np\u007f\t/MC\u0018";
        f3708[19] = "~2b1\u000ePb(`m\u0014Dr++|\u0010Lt.q1\u02f9";
        f3708[20] = "|*}v7X`0\u007f*-Lp34;)Dv6nv$]zvo1kZz6~72\u0003p7t, CgvM1+I|/Y7+Yv6n";
        f3708[21] = "\u0002P\u001ffm^\u001cX\u0005)\u000fB\u001bE";
        f3708[22] = "3XD\u001d=\u001d8WURV\t:\\B\bz\u001e7";
        f3708[23] = """
                    \u0016;\u001eBz2
                    !\u001c\u001e`&\u001a"W\u000fd.\u001c'\rBi7\u0010g\u000b	f#\u001c;W
                    g)
g0*g)
\u001b\u001c\u0002l"\u000b,\u000b""";
        f3708[24] = "\"M3G}h>W1\u001bg|.Tz\nct(Q Gnm$\u0011!\u0000!X!Z9\fai\u000f^'\f";
        f3708[25] = "`\u00004\r\u0011\u001b}\u0015l/P\u0016e\u0013";
        f3708[26] = ">R\u000bZ~k\"H\t\u0006d\u007f2KB\u0017`w4N\u0018Zmn8\u000e\n\u0011mj$R\tZ{w?D\u0003\u0003\"I8N\b\u001b{";
        f3708[27] = "]\u000fkb\u0019=A\u0015i>\u0003)Q\u0016\"/\u0007!W\u0013xb\n8[S~)\u0005,W\u000f\"+\u0019)B\u0015e/E\u001eW\u001ex#\u0019\u000f@\u001c|$\u0002+";
        f3708[28] = "6`v_7M*zt\u0003-Y:y?\u0012*J<<x\u001f1]+tp\u0012 Kw[_\u0010(]=";
        f3708[29] = "(D\u0013UMp4^\u0011\tWd$]Z\u0018Sl\"X\u0000U^u.\u0018\u0006\u001eQa\"DZ2m`)R\u0011\tZwur";
        f3708[30] = Float.TYPE;
        Renderer191.f3709[30] = "java/lang/Float";
        f3708[31] = "aK\u0012l`[}Q\u00100zOmR[!~GkW\u0001ls^g\u0017\u0000+<YgW\u0011-e\u0000YP\u001b&}YFX\u001b&~K|{\u00141w";
        f3708[32] = "K\u00017_VmW\u001b5\u0003LyG\u0018~\u0012KjA]%\u0005MtW]\u0013\u001eHwV&$\u0018Hk";
        f3708[33] = "~\u0014]Q4.b\u000e_\r.0r\r\u0014\u001c)#tHS\u001124c\u0000[\u001c#\"?/j\u0016(?p\u0004V\u001a";
        f3708[34] = "/Ks\u0002uX3Qq^oL#R:OkD%W`\u0002f])\u0017fIiI%K:eUH.]q^fO,\\&h";
        f3708[35] = "R:AN\u0003@N C\u0012\u0019T^#\b\u0003\u001d\\X&RN\u0010ETfT\u0005\u001fQX:\b\u0007\u0003TM O\u0003_|z:G\u0010\u0019\\^";
        f3708[36] = "@e |\u000f/\\\u007f\" \u0015;L|i1\u00113Jy3|\u001c*F92;S-Fy#=\ntx~)6\u0012-gv)6\u0011?]U&!\u0018~x~)6\u0012-|~#7";
        f3708[37] = "Xk,C~1Dq.\u001fd%Tre\u0404";
        f3708[38] = "L*b4\u0010{P0`h\no@3+\u014a";
        f3708[39] = "Cteed%_ng9~1Om,\u052e";
        f3708[40] = ">Kv\u0015)\u0000\"QtI3\u00142R?X7\u001c4We\u0015:\u00058\u0017bB(\u00014T?r\f\u001c?]~L\u0016\u0014?Xv^)";
        f3708[41] = "\u001dT\u0002\u0004v+\u0001N\u0000Xl?\u0011MKIh7\u0017H\u0011\u0004e.\u001b\b7_w6\u0017T-Kg53v,";
        f3708[42] = ">)xI\nF5&i\u0006fE;$kIJ";
        f3708[43] = "\u000b\u000e0GJ&\u0000\u0001!\b+(\u000b\n%R";
        f3708[44] = "-z`0w\u001f1`blm\u000b!c)}i\u0003'fs0d\u001a+&rw+/.mj{k\u001e\niizi\u000f0Jfm`";
        f3708[45] = "9j}OH^%p\u007f\u0013RJ5s4\u022c";
        f3708[46] = "B\u0013:\u000bZ:^\t8W@.N\nsFG=HO.@\\;D\u000f:\u000bj B\r8DF\u001cH\u0015)LF(";
        f3708[47] = "!W]sFJ=M_/\\^-N\u0014>[M+\u000bI8@K'K]sgZ:QS3S";
        f3708[48] = "%Dts)4.Ke<N6;@ewu";
        f3708[49] = "\u0005$\u0006vc\u001f\u0019>\u0004*y\u000b\t=O;~\u0018\u000fx\u0012=e\u001e\u00038\u0006v_\u001f\u00074\u0004*B\u000f\u001e\"\b6v";
        f3708[50] = "\u0012s\u001c\u0016{|\f{\u0006Y\u001c}\u001d`\u000b\u0003:{";
        f3708[51] = "IX\u0018JLHUB\u001a\u0016V\\EAQ\u0007RTCD\u000bJ_MO\u0004\f\u001dMICGQ'QQIX\f";
        f3708[52] = "pj.H3olp,\u0014){|sg\u0005-szv=H jv6:\u00035nvv.H\u0002usw;5$nkq'\u0001";
        f3708[53] = "ELxC|aELo\u001fpn_\u0007o\u0001p{Xv=]%9";
        f3708[54] = "J?K<N8J?\\`B7Pt\\~B\"W\u0005\f#\u0013";
        f3708[55] = "h/km\u0004\u001dt5i1\u001e\td6\" \u001a\u0001b3xm\u0017\u0018nsK/\u0019\nf1\u007f";
        f3708[56] = "o3K5N>d<Zz-3q:";
        f3708[57] = "bg'u?Ono&>vCne'46\u000ebg&7=Cu&\u00062+Tr";
        f3708[58] = "'\u000e\u001a^M\u001e;\u0014\u0018\u0002W\n+\u0017S\u0131";
        f3708[59] = "i`M7B-uzOkX9ey\u0004z\\1c|^7Q(o<L|Q,s`O7]7bgF|\u001e\fiuMuU9d~OT_<s~O";
        f3708[60] = "A'>_\fM]=<\u0003\u0016YM>w\u0012\u0012QK;-_\u001fHG{,\u0005\u0017T]{6\u0013\u0014]M!*_-[\\:5\u001d\u001cY\\";
        f3708[61] = "[:OmZ.G M1@:W#\u0006 D2Q&\\m\u0158";
        f3708[62] = "nvl}\u0011\u0018rln!\u000b\fbo%0\u000f\u0004dj\u007f}\u0002\u001dh*~:M\u001ahjo<\u0014Cwmn$M!hw\u007f\u0005\n\bv H<\u000f\u0018lj";
        f3708[63] = "\u0016G`yz\u0018\n]b%`\f\u001a^)4d\u0004\u001c[syi\u001d\u0010\u001br>&\u001a\u0010[c8\u007fC\u000f\\b &:\u0010[c8\u007f;\u0010Pp";
        f3708[64] = """
                    \\lv^n\u000f@vt\u0002t\u001bPu?\u0013p\u0013Vpe^}
                    Z0w\u0015}\u000eFlt^k\u0013]z~\u00072(Vmx
                    y\u001bQrt'u\u0014Wqf""";
        f3708[65] = "+ziJ^l+z~\u0016Rc11~\bRv6@)Q\u000b2";
        f3708[66] = "Y\u0017\u001c[i]E\r\u001e\u0007sIU\u000eU\u0016wAS\u000b\u000f[zX_K\t\u0010uLS\u0017U'~FR\u0000\t6tFB\u0000\u0003\u0001";
        f3708[67] = "wn\u007f\u000eo[kt}RuO{w6CqG}rl\u000e|^q2jEsJ}n6iOKvx}Rx\\";
        f3708[68] = "+\u0013I%fL7\tKy|X'\n\u0000\u0379";
        f3708[69] = "~'d\u0010\tO{6v\u00058\tr0U\u0010Q\u001dp-\u007f\u00058Cmu%\u0007^J%%%j\u0003\fg2(QHC%3\u0019QF\na}\"\u001a\tH`Ls\u001aJOm/\"VWJ\u001f";
        f3708[70] = "CF*fB=\u001b_b>s)LH\u0016b\b>E]+E\u001a#L4e\u007f\n%QL>l\u00118!";
        f3708[71] = "\nU>+\b.\u0014V|-7$\bQ\u0011\u0012\f5\u001dSq)Gz_R@";
        f3708[72] = "\ttqdy\u0019\u000fe1\u0000\u0502u\buqmk\u0011Zj50";
        f3708[73] = "X>3yJ\u001c\u000f+b't\u0018\u0018\u0014!t\u0012yR!`%\u0019\u001f[i0%t";
        f3708[74] = "&RL1\u0006n&\u0000\u000b=jd-LOl!e+ZWl\u0006\u0001qOL\u007f[::\u0000\u000e~j:4IJ0Qq{\u000bK\u0001T{t\\Te\u0006d0\u000140\u00188v\\R9Phv1";
        f3708[75] = "\u0016\u0019( XpM\u0006|<2-\u000f\u0012o\b_*\t\u0012v=V,2\u0006l6S'\u0018{+,J?D@`c\b>u@n*LpN\u000b!hMAN\u0005h,\u0003z\u0005J*-2z\u000b\u0003nc\t1DAoRV{\u0012\u001b*9I3\t\u0017\u0010lH\u007f\u0018\u001bt>W;E{z\"@|\u0007\u0018+n]yu";
        f3708[76] = "}\u000f#O&/{\u001ec+\u045dC K{\u0011:#&K\u007fG";
        f3708[77] = "w{xrG>\u007f|$()9a}G*M%j\u0001'9\u00175geu&Sh\u0007";
        f3708[78] = "<0\u001f?u\u0019\";\u000e#H\u0166B,\u001b;&]#`J?#";
        f3708[79] = "u\u007f8\u0007\u0011\"75v\u0006LA)*5\u0019\u0017-\u001b~tHA~L|7\u0001\u000epw7xC\u000fA&7;D\u0002\"w{&Ap";
        f3708[80] = "n\u0004/P?sh\\-P4H8Qjs<,*QLb\u001fHiF(@5,;Yl\u001dU";
        f3708[81] = "(\tuC8U}J!\\^A\u0017\u000blB=\u001doP\u007fY m(HiX.\u0015s[rE^";
        f3708[82] = "\u0006\u000fr\u0000F\u0002\u0003\u001e`\u0015wP\n\u0018P\u001b\u001bC\u0007d4\u0004\u000fAV_\u007fKM@g";
        f3708[83] = "kM@ft`0C\u0011=J=>K\u0016\u0000u'.M\u000bx.45P{";
        f3708[84] = "F8G4\u000bi_8A)4.M(%7R3M8}gFl\u001c9\u001bn\u000e<\u001cT\u0017&FhR7Fj[m ";
        f3708[85] = ")`T[,umg\u0015\tM\u01ebSd[@p?05\u0017]uM";
        f3708[86] = "8p+:D\u0017,qj;:\u00038=JY\u0001\u0012-?+bJ]o>\u001a";
        f3708[87] = "X\u000bDM)\u001c\u0019\u000bC\u001b&#\u0004Z?Mq@\u000e\f]\u001f7M\u0013S";
        f3708[88] = "X;|sK\u0005\\a?(Wc\u0250\u00079-T\u0001\u0002a=w\u0017Z\u001e";
        f3708[89] = "+JwM\b2pU#Qbo2A0e\u000fh4A)P\u0006nH\u00131G\u001c2sX~\u0005\u001d\u0003sV7AS88\u0019u@b86P1\u000eYsy\u00120?Y}0V~\u0004\u00122rWO\u0001\u0018=%H+S\u0007yx(%O\u0010>:Kt\u0003\r;H";
        f3708[90] = "?*\u000bB7:0k\u0002VN='(\"J>!Nb\u0016\u001er0(k^Nr]";
        f3708[91] = ":N\u001c52Cx\u0004R4o f\u001b\u0011+4LTJPsi =\fS&3Do\u0013\u0017{S";
        f3708[92] = "|2E?\"u'-\u0011#H(e9\u0002\u00022-g0\u001c&\u0012)t,\u0014+' rP\u001a5&9m C=&*\u001fk\u000356u$ Lw7D$.\u00053y\u007foaG2H\u007fa(\u0003|s4.j\u0002Ms:g.Lv8u%/}'86\"\"\u001evt+'P";
        f3708[93] = "W\u0016E/m~Q\u0007\u0005K\u04d6\u0012S\u0013\u00035.)\u0018\\A4\u001f)\u0016\u0015\u0005z$bYW\u0004K~y\u0015\u0017Jv{h\u0007\u0002{";
        f3708[94] = "FNo\u0013WDI\u000ff\u0007.EZG|vSNV\r0\u0014W\u0018\u0007G\u0000";
        f3708[95] = "KPRT/>\u000e\u001b\u000bGI7r\u0018\u0018By,KB\tK*";
        f3708[96] = "\u0012c<(\\8\rze`3:\u001a\u007fdpI3+ye~IBY&8dYy_~:dRB";
        f3708[97] = "\u0010l?\u001eR\u0004W>:\u00184\u026d.j!LYTJ8>\b\u00044";
        f3708[98] = "\u000ed\u0006\u00000$U{R\u001cZ\u007f\u0000i_\u0014Z,\\m\u0001H#o\r:[\u0000Z{\u001f\u007fO\n;wS<Rr0e\u001f;L\u0011a)\u0002>>";
        f3708[99] = "\u0013\u000e;`uQPD= }6QS8\u0003{MKL%?y6\u001bL}e{P\u0012\u0004-e\u0016\rTF:h-F\u001b\u0004;Y-HR@ubf\u0007\u0010AD3fD\u0017L'b*Y\u0012>";
        f3708[100] = "K H_m{M1\b;\u00ef\u0017Md\u0013U%)\u0016\"JJq";
        f3708[101] = "f- \u001d3\u0015r)2\u0000W\u0001f(@G-Pf4$\u00152\u0014;T=\u00146T;69Bg\u001e\u000b";
        f3708[102] = "6\\Z\u001dB60M\u001ay[=o\\\u0019\u001c]\u0017mJ\u0001\u0014V&L@\u0019\u0002]\u0011mF\u000f\u001a0;bZ\u001eH\r>sH\u000by\u000b$qYUB@k3XdBN\"w\u0016_\t\u0001`v'Z\u0003\u000e7iC\b\u001cJj\t\u0016\u0016@\f7o\u001f^\u0010\fZ";
        f3708[103] = "%Q7NTA#@w*m-{AtP\u0017\u0010~PfE";
        f3708[104] = "kl-?sKo6ndo-\u0494P.by\u0013<!?=hQ";
        f3708[105] = "_\u0019A@/DUJIAOTB]nT+FB!MP.\u0001\u001fCI\u0006\u007fK/";
        f3708[106] = "iL)r.Fo]i\u00163G*ypp p;Q{{&G,7yd%[.Vu(fFV";
        f3708[107] = "c\u0014\n\bN#e\u0005Jl\u04f6Oe\u0005UWD\u007f!\u0004\u000e]\r";
        f3708[108] = "\u0017g*@@[\u0005\u007f6R$S\rc5OXT\r\u0002:JTV\u0013`(RHDw";
        f3708[109] = " ]wQW=r\u001bzL\b_|\th^\r3N^.\u0000Zd\u0019],O\u0014>z\u001ff\u0001\u0015c\u0019";
        f3708[110] = "=v}}Jp8goh{\"1a@j\u001a\"<a\u0000<\u00055\",;wJw#\u001d";
        f3708[111] = ".hUV8[(y\u00152\u01da7*m\u0013L{\fa\"QMJ\fok\u0015\u0003qG )\u00142 Gc.\u0019Qq\u000b~+k";
        f3708[112] = "_Ybw@|\u0004F6k*!FR%AK+Q;a{R3\r\u0000*4\u00102<\u0000$}T|\u0007Kk?UM\u0007E\"{\u001bvL\n`z*vBC$4\u0011=\r\u0001%\u0005Nw[[`nQ?@WZ;PsQ[>iO7\f;0uXpNXa9Eu<";
        f3708[113] = "\u0010y<IOcT~}\u001b.\u0458jm{\u001eO:\u0005& \u001d\u0012[";
        f3708[114] = """
                     [\u0011zAs\u000f^\u0000hTBW]\u0007|V	V[\u0011dV.2\u0001\u0004\u007fEs	JK=DB	D\u0002y
                     yB\u000b@x;|H\u0004\u0017g_.W@J\u0007
                     0\u000b\u0006\u0017a\u0003x[\u0006z""";
        f3708[115] = "8@k8\u000f\u0015,Dy%k\u000f)Tq5\u0017\t/9z%\u0004\u000b,^ud\r\u001fU";
        f3708[116] = "\u0007\rK\u000bz/\u0000ID\u0000?SQ3\u001fEj#CO\u0018\u0001e(\u0006";
        f3708[117] = "Km7Ifd\u0006/kH\u0002jPq0\u0015kfi\u007f0\u0005o\u0000\u0006dmDof\u000f,=D\u0002";
        f3708[118] = "\u001b<\f?sm\u001d-L[\u01eb\u0001I>R?ez]:@\"";
        f3708[119] = "%\u0017yQtQ1\u00168P\nE%Z\u001921T0Xy\tz\u001brYH";
        f3708[120] = "\u001f\u0007<\"\u0016G_\u0003gw\u0018vK\b6IB\u0006TS(*\u0013JIVZ";
        f3708[121] = " J\u00043Ccs\u0011G=\u0000\u000e|\u0018MYDpa\u000f\fb\u000f?#\u000e=b\u0001vg@\u0006)N4fq\u0006'\u0007p(JMhEq\u0019";
        f3708[122] = "s\u000b\t-A\f(\\\u0004<-\u0480B\u0002Y=]M>\u0005\u001d2V\bBQ\u0017\"\u0010B!\u0000[?\u00150";
        f3708[123] = "eG=95%(P~*[-u\\\u001b92&u $h<\"\"K; '.\u0018";
        f3708[124] = "9BeSU\t<SwFdU#g\u007fB\u0019O5E\u0018\u0018\u0016\rdD~\u0011^]d)";
        f3708[125] = "~K=LuAxZ}(\u0513-x\u000feS}\u0015\"\u000flY7";
        f3708[126] = "8kwW\u001ae |$C|;3mF^\u001a83kqI|7<)nYMl#}r3";
        f3708[127] = "<'-i\u001c&:6m\r\u001fJ:gbr\u0011-j-r|";
        f3708[128] = "~\u0004\u0005yt\u0018`\u0007G\u007fK\u0012|\u0000+@p\u0003i\u0002J{;L+\u0003{";
        f3708[129] = "q_ao\\gwN!\u000b\u01ac\u000brGdm\u00100)I56";
        f3708[130] = "E\u0016K\u0014&tC\u0007\u000bp\u054a\u0018F\u001c\u000eHlzG\\EO";
        f3708[131] = "\f\u001b^\u0017AdW\u0015\u000fL\u007f6[\u0004\u0004\u0016\u0019_\u0000\u001a\u001fK\u00165V\u0018\u0006\u000e\u007f";
        f3708[132] = "\u0000\f>bC\u000fC[#kC1\u00151|lFRII'\u007f]O9\u000e?i\\AAU,rA1";
        f3708[133] = """
                     \
                     'm\u0013EZ\u001bg	\u0000R.\u0015tl\fO\u001f1~w\fS\u000e\u001d\u0019h
                     T\u0019@$m\u001bF\fq"w\u0019WRJi8[VcJgq\u001f\u0018X\u0001(3\u001e)R\u0003 5\fO[Kp5a""";
        f3708[134] = "5-!.:\n3<aJ\u0435f1;u*v\u0003f.$t";
        f3708[135] = "POX$\t\u0011E[Z-1\u0014FAf5W\u0017LB|=W\u0012DPCTJA\u0013\r\u0006mAEKP9";
        f3708[136] = "51 ^Y'b$q\u0000g9c \rF\n$\u000em8\u0007[/hdpW[Bd,8\u0003\u0015!5`%\u0006g";
        f3708[137] = "Pqm\u001e\u0015E\u000ed9\\tYOwe\u001a\fLOse\n\u0005%\u000bd=\f\u0014AY{yQtA\u000fyc[\u001f^GboaJ_\u000bsc\u0005\u0018@O.\u0003";
        f3708[138] = "\u001f\u000b\u0005&Ap[\fDt \u0203e\u000f\n=\u001d:\u0006^F \u0018H";
        f3708[139] = "\u000f\u00066@L\f\u001b\u0002$](\f\u0003\r;$\u0016\r\\\u00126@D\u0012\u0018OV";
        f3708[140] = "uQ\u0007KbdgI\u001bY\u0006ixH-kL\u0006+NIIfbyQ\r\u0014\u0006";
        f3708[141] = "\u0011\u0004\u0000\u0012\u0019(GTLZ\u0013\u0014RR\u0002G\noE?\u0011S\u0010pLD\u0005W\u0002m(R\u0005J\u0014pSF\u0001X\t\u0014";
        f3708[142] = "!P\u0003\u0010@ vERN~*wA6\u0011\u00129z=R\u000e\u0006;+\u0006\u0019AD:\u001a";
        f3708[143] = "att4\u0016I:#y%z\u0014+\u0004}7\u0017\u000f=(\u001ar\u0004\r.u!9KO/D!7\u0002\u000ba\u007fjx@\nPuhpF\u00186|  Fu";
        f3708[144] = "#RGU]\b1\\VGeY0WM^e\u000b6TIT\u001dP%OT$\u000fW/LH\u0019\u0004]rF*N\u0015Fw_I\u001fY[r-";
        f3708[145] = ",\u001aM[vh)\u000b_NG461W_*/ \u001d0\u001a9-3@\u000bQvo2q\u000b_?+|J@\u0010}*M@B\u0018{8+I\nH{U";
        f3708[146] = ":-\u0013I\u0002qm8B\u0017<{l<>Q@uf&\u0002)P/j#HL\u0005x}qy";
        f3708[147] = "{\b;m\u000b?,\u001dj35!-\u0019\n`Q7+\u0019<a5d:[<mQ6%\u001fa\r_*2X#n\u000ef/]Q";
        f3708[148] = "K\u000fy\u000f&\u001d@\u000b!R\u0019K]I\u001f^bEZQ,`xB\\R>D\u0019IIU%[b]MG8?";
        f3708[149] = "\n@d=\u0005\"\u000fQv(4x\r`} OrkAi5\tm\b\u0010%(\f\u001f";
        f3708[150] = "W$\u0007S3f\u0013#F\u0001R\u04ed-0\u0016E;?\u0015t\u0011\u0004i";
        f3708[151] = "\u0015y\u000bz4a\u00195HgLo\u0016w)w6a\u001dd-j |\u001b\u000bMw5c\u000bs\u0016d.~{0\fs21@{C13\u0000";
        f3708[152] = "!\u0014\r=5J8\u0014\u000b \n\u0017< V9l\u001b+x\u0006-3J*\u001e\u000fecJG";
        f3708[153] = "#BgEJ+gE&\u0017+\u0519Y\u0012b\u0012Fs=@}V\u001b\u00133\\j\u0011Ypb\u0010w\u0014+";
        f3708[154] = """
                     \u000e\u0011Et\u000eJ\u0002]\u0006ivG\u001a
                     C^
                     Q\u0001\u0005S\u0005IW\u0019\u0000L}\u0012D\u0002\u001d<>\bS\u001eR\u0007uG\u0011\u001fc\u0007{\u000eUQXL4LT`]F;\u001bK\u0004\u000fY\u007fF+[\u001dD{G\u0010\u0010R\u0006zv""";
        f3708[155] = "((\u001dZP\u0000oz\u0018\\6\u0550\u0016.\u0003\b[Pr|\u001cL\u00060";
        f3708[156] = "YD*\u0017!5U\bi\nY;ZJ\u001d\u0001?(w[2\t9(7\r-\u001e'e\fFb\\&T";
        f3708[157] = "\u0011\u0005R7\rU\u0015_\u0011l\u00113GTR\u001b\tUTcC3\u0002^RTTU\u0000AQHV4\f\r\u0012U.";
        f3708[158] = "eQ1\u001b, 3S(^E0(UKK58hA(\u001ay%m3";
        f3708[159] = "l8f<\u0016w.r(=K\u00140mk\"\u0010x\u0002<+sJ\u0014n~o<F/%1-=w";
        f3708[160] = "i|\n(:ftg\u001aj\u000b5`}74m6j~#2o=w\u0001\t>v <<\f/d5\ra\r%d>os\u00159vZ";
        f3708[161] = "=%\u0005y,;|z\u0010peRec0tx=`u\u0000\u0013& =$\u0001u/hm$l";
        f3708[162] = "uz\u001e@\u0017!4x\u001dBr\u0017J\u0018rYH'l%\u0018\u0018J$n";
        f3708[163] = "a\b\u0014Fg\u0007#BZG:d=]\u0019Xa\b\u000f\fY\b8dfJ[Uf\u00004U\u001f\b\u0006";
        f3708[164] = "m/`/\u0019W$;j#J.,!v?#\u0017e-2hZT4zh #";
        f3708[165] = "pT`~b\u000b'A1 \\\u0001&EJs=\u0001+E\n%\"\u00165\b1nmT49";
        f3708[166] = "`\rTR\u007f\u0012;ZYC\u0013T<[VBi.hTWR)W!@]^z.jCBQ\"\u0015!\f\u0000P\u0013\u0015/ED\u001e(^`\u0007E/y^#\u0000HL(\u0012>\u0005:";
        f3708[167] = "W\u0000_By>Q\u0011\u001f&\u0396R\nD\u0007\u001ce2\fD\u0003J";
        f3708[168] = "\u0002\u0019Q\n\u0010\u0007\u0017\rS\u0003(\u0006\u001e\u000fW\u0000Sm\u000b\u0016\rKG\u0017\u0014\u000fT\u0003(";
        f3708[169] = "-eeV*g/dt\nJ\u027eUn&\f+z:%}\u000fv\u001b1.yRpp.fb^J\u007fos~\b!`'hr2.!2t$Y1i)x\u001eVp|5.uI8g9\u0014tB8&'w%\u000e%#U";
        f3708[170] = "Ne ~'\u0003J?c%;e\u00184 B-\u0003\u0016=8u\n\u0002\u0011%\u0006q\"\t\u001a#1fD\u000b\u0005 -d%\u0007Ic0\u001c";
        f3708[171] = "ze,\u0014Oeg~<V~<yf#$\u001a4{u(\u0015\">B\u007f6i\u001f2cb\u007fT\u001a#qwN\u0003\u000e+#j-RB6&\u0018";
        f3708[172] = "H\u0016c\u000fJWN\u0007#k\u020a;I\u0017c\u0006X_\u001b\b'[";
        f3708[173] = "\u001aHB0>2\u000eI\u00031@&\u001a\u0005,2&%\u0010\u0006s2+4\rHN7:&\u0018y";
        f3708[174] = "!\bh\u0014`\u0007'\u0019(p\u03e4k%\u001e<\u0010,\u000er\u000bmN";
        f3708[175] = """
                     \u0011[\u0018pf\u0015\u0014J
                     eWS\u001dL+m<U\u000b]	
                     fZI\f\blo\u0012\u0019\fe`'ZMB\u00061kGH0""";
        f3708[176] = ",=Q}t<l9\n(z\rt/}k+iy5QyJ<gm\u000b{,5/=\u000b\u0016";
        f3708[177] = "@\u0017'k>*F\u0006g\u000f%F\u0011\u0006}e>)\u001f\u0001clL(\u0015\bs}#&\u0012\u0016z\u000f";
        f3708[178] = "F~\u0010\u001b,]Xu\u0001\u0007\u0011\u03588lF\u001c/OI}\u0019\rm";
        f3708[179] = "I\u0015K\u001a|_O\u0004\u000b~g3\u0014Q\u0013D`S\u0012Q\u0017\u0012";
    }
    
    public static Class m1281(long n, long n2) {
        int m1279 = m1279(n, n2);
        Object o = Renderer191.f3708[m1279];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(Renderer191.f3709[m1279]);
                Renderer191.f3708[m1279] = forName;
            }
            else {
                forName = (Class)o;
            }
        }
        catch (Exception ex) {
            throw new IllegalStateException(ex.toString());
        }
        return forName;
    }
    
    public static Field m1282(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m1283(Class clazz, String s, Class clazz2) {
        Field m1282 = m1282(clazz, s, clazz2);
        if (m1282 != null) {
            return m1282;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m1283 = m1283(interfaces[i], s, clazz2);
                if (m1283 != null) {
                    return m1283;
                }
            }
        }
        return null;
    }
    
    public static Field m1284(long n, long n2) {
        int m1279 = m1279(n, n2);
        Object o = Renderer191.f3708[m1279];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        String s = Renderer191.f3709[m1279];
        int index = s.indexOf(8);
        Class m1280 = m1281(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        String substring = s.substring(index, index2);
        ++index2;
        Class m1281 = m1281(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m1280;
        while (true) {
            Field m1282 = m1282(clazz, substring, m1281);
            if (m1282 != null) {
                return (Field)(Renderer191.f3708[m1279] = m1282);
            }
            Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    Field m1283 = m1283(interfaces[i], substring, m1281);
                    if (m1283 != null) {
                        return (Field)(Renderer191.f3708[m1279] = m1283);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m1280.getName()).append(' ').append(m1281.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m1281(3087709664134641L, 0L);
        }
    }
    
    public static Method m1285(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
        for (Method method : clazz.getDeclaredMethods()) {
            Label_0097: {
                if (method.getName().equals(anObject) && method.getReturnType() == clazz2) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == n) {
                        for (int j = 0; j < n; ++j) {
                            if (parameterTypes[j] != array[j]) {
                                break Label_0097;
                            }
                        }
                        return method;
                    }
                }
            }
        }
        return null;
    }
    
    public static Method m1286(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m1285 = m1285(clazz, s, clazz2, n, array);
        if (m1285 != null) {
            return m1285;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m1286 = m1286(interfaces[i], s, clazz2, n, array);
                if (m1286 != null) {
                    return m1286;
                }
            }
        }
        return null;
    }
    
    public static Method m1287(long n, long n2) {
        int m1279 = m1279(n, n2);
        Object o = Renderer191.f3708[m1279];
        if (o instanceof String) {
            String s = Renderer191.f3709[m1279];
            int index = s.indexOf(8);
            Class m1280 = m1281(Long.parseLong(s.substring(0, index), 36), 0L);
            ++index;
            int index2 = s.indexOf(8, index);
            String substring = s.substring(index, index2);
            int n3 = -1;
            int index3 = index2;
            do {
                ++n3;
            } while ((index3 = s.indexOf(8, ++index3)) > -1);
            int n4;
            Class[] array = new Class[n4 = n3 - 1];
            Class m1281 = null;
            int n5 = index2 + 1;
            for (int i = 0; i < n3; ++i) {
                int index4 = s.indexOf(8, n5);
                m1281 = m1281(Long.parseLong(s.substring(n5, index4), 36), 0L);
                if (i < n4) {
                    array[i] = m1281;
                }
                n5 = index4 + 1;
            }
            Class superclass = m1280;
            while (true) {
                do {
                    Method m1282 = m1285(superclass, substring, m1281, n4, array);
                    if (m1282 != null) {
                        return (Method)(Renderer191.f3708[m1279] = m1282);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m1280;
                    while (true) {
                        Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                Method m1283 = m1286(interfaces[j], substring, m1281, n4, array);
                                if (m1283 != null) {
                                    return (Method)(Renderer191.f3708[m1279] = m1283);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            StringBuffer sb = new StringBuffer();
                            sb.append("NoSuchMethodException in ").append(m1280.getName()).append(' ').append(m1281.getName()).append(' ').append(substring).append('(');
                            int k = 0;
                            while (k < n4) {
                                sb.append(array[k].getName());
                                if (++k < n4) {
                                    sb.append(", ");
                                }
                            }
                            sb.append(')');
                            throw new IllegalStateException(sb.toString());
                        }
                        if ((clazz = clazz.getSuperclass()) != null) {
                            continue;
                        }
                        clazz = m1281(3087709664134641L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m1281(3087709664134641L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    public static MethodHandle m1288(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType methodType, long n, long n2) {
        char char1 = s.charAt(0);
        Field m1284 = null;
        Method m1285 = null;
        try {
            MethodHandle target;
            if (char1 == 'x' || char1 == 'P' || char1 == '\u00c4' || char1 == '\u00f0') {
                m1284 = m1284(n, n2);
                Class<?> declaringClass = m1284.getDeclaringClass();
                String name = m1284.getName();
                Class<?> type = m1284.getType();
                if (char1 == 'x') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == 'P') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == '\u00c4') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m1285 = m1287(n, n2);
                Class<?> declaringClass2 = m1285.getDeclaringClass();
                String name2 = m1285.getName();
                MethodType methodType2 = MethodType.methodType(m1285.getReturnType(), m1285.getParameterTypes());
                if (char1 == 'z') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == '\u00f2') {
                    target = lookup.findStatic(declaringClass2, name2, methodType2);
                }
                else {
                    target = lookup.findSpecial(declaringClass2, name2, methodType2, declaringClass2);
                }
            }
            return MethodHandles.dropArguments(target, methodType.parameterCount() - 2, (Class<?>[])new Class[] { Long.TYPE, Long.TYPE });
        }
        catch (Exception ex) {
            StringBuilder sb = new StringBuilder();
            sb.append(ex.getClass().getName()).append(" : ").append((m1284 != null) ? m1284.toString() : ((m1285 != null) ? m1285.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static Object m1289(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType newType, Object[] array) {
        int n = array.length - 2;
        MethodHandle m1288 = m1288(lookup, mutableCallSite, s, newType, (long)array[n], (long)array[++n]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m1288, newType));
        try {
           return m1288.asSpreader(Object[].class, array.length).invoke(array);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    
    public static CallSite m671(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Renderer191.m671:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:67)
        //     at com.strobel.assembler.metadata.MethodDefinition.tryLoadBody(MethodDefinition.java:729)
        //     at com.strobel.assembler.metadata.MethodDefinition.getBody(MethodDefinition.java:83)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:194)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // Caused by: java.lang.ClassCastException: class com.strobel.assembler.ir.ConstantPool.MethodHandleEntry cannot be cast to class com.strobel.assembler.ir.ConstantPool.ConstantEntry (com.strobel.assembler.ir.ConstantPool.MethodHandleEntry and com.strobel.assembler.ir.ConstantPool.ConstantEntry are in unnamed module of loader 'app')
        //     at com.strobel.assembler.ir.ConstantPool.lookupConstant(ConstantPool.java:120)
        //     at com.strobel.assembler.metadata.ClassFileReader.Scope.lookupConstant(ClassFileReader.java:1590)
        //     at com.strobel.assembler.metadata.MethodReader.readBodyCore(MethodReader.java:299)
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:63)
        //     ... 15 more
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_1
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_1.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_1.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_1.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_1.fence = 1;
                ProcyonInvokeDynamicHelper_1.handle = handle;
                ProcyonInvokeDynamicHelper_1.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_2
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_2.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_2.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_2.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_2.fence = 1;
                ProcyonInvokeDynamicHelper_2.handle = handle;
                ProcyonInvokeDynamicHelper_2.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_2.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_3
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_3.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_3.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_3.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_3.fence = 1;
                ProcyonInvokeDynamicHelper_3.handle = handle;
                ProcyonInvokeDynamicHelper_3.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_4
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_4.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_4.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_4.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_4.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_4.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_4.fence = 1;
                ProcyonInvokeDynamicHelper_4.handle = handle;
                ProcyonInvokeDynamicHelper_4.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_5
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_5.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_5.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_5.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_5.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_5.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_5.fence = 1;
                ProcyonInvokeDynamicHelper_5.handle = handle;
                ProcyonInvokeDynamicHelper_5.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_6
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_6.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_6.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_6.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_6.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_6.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_6.fence = 1;
                ProcyonInvokeDynamicHelper_6.handle = handle;
                ProcyonInvokeDynamicHelper_6.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_6.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_7
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_7.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_7.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_7.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_7.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_7.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_7.fence = 1;
                ProcyonInvokeDynamicHelper_7.handle = handle;
                ProcyonInvokeDynamicHelper_7.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_7.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_8
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_8.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_8.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_8.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_8.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_8.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m671(lookup, "z", MethodType.methodType(IFontRenderer.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_8.fence = 1;
                ProcyonInvokeDynamicHelper_8.handle = handle;
                ProcyonInvokeDynamicHelper_8.fence = 0;
            }
            return handle;
        }
        
        public static IFontRenderer invoke(Object p0, long p1, long p2) {
            try {
                return (IFontRenderer) ProcyonInvokeDynamicHelper_8.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_9
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_9.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_9.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_9.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_9.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_9.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m671(lookup, "z", MethodType.methodType(IFontRenderer.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_9.fence = 1;
                ProcyonInvokeDynamicHelper_9.handle = handle;
                ProcyonInvokeDynamicHelper_9.fence = 0;
            }
            return handle;
        }
        
        public static IFontRenderer invoke(Object p0, long p1, long p2) {
            try {
                return (IFontRenderer) ProcyonInvokeDynamicHelper_9.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_10
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_10.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_10.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_10.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m671(lookup, "z", MethodType.methodType(IFontRenderer.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_10.fence = 1;
                ProcyonInvokeDynamicHelper_10.handle = handle;
                ProcyonInvokeDynamicHelper_10.fence = 0;
            }
            return handle;
        }
        
        public static IFontRenderer invoke(Object p0, long p1, long p2) {
            try {
                return (IFontRenderer) ProcyonInvokeDynamicHelper_10.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_11
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_11.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_11.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_11.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_11.fence = 1;
                ProcyonInvokeDynamicHelper_11.handle = handle;
                ProcyonInvokeDynamicHelper_11.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_11.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_12
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_12.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_12.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_12.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_12.fence = 1;
                ProcyonInvokeDynamicHelper_12.handle = handle;
                ProcyonInvokeDynamicHelper_12.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_12.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_13
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_13.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_13.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_13.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_13.fence = 1;
                ProcyonInvokeDynamicHelper_13.handle = handle;
                ProcyonInvokeDynamicHelper_13.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_13.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_14
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_14.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_14.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_14.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_14.fence = 1;
                ProcyonInvokeDynamicHelper_14.handle = handle;
                ProcyonInvokeDynamicHelper_14.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_14.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_15
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_15.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_15.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_15.LOOKUP;
                try {
                    handle = ((CallSite)Renderer191.m174(lookup, "g", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_15.fence = 1;
                ProcyonInvokeDynamicHelper_15.handle = handle;
                ProcyonInvokeDynamicHelper_15.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_15.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }

   public static int dcmpl(double var0, double var2) {
      return Double.compare(var0, var2);
   }

   public static int dcmpg(double var0, double var2) {
      return Double.compare(var0, var2);
   }
}
