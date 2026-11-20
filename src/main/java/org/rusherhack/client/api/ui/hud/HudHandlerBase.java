// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.ui.hud;

import org.rusherhack.core.feature.IFeatureManager;
import org.rusherhack.client.api.ui.ScaledElementBase;
import org.rusherhack.core.interfaces.INamed;
import org.rusherhack.client.api.render.IRenderer;
import org.rusherhack.client.api.render.IRenderable2D;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.rusherhack.Class066;
import java.lang.invoke.MethodHandles;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Iterator;
import net.minecraft.client.MinecraftClient;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.Globals;
import java.awt.Color;
import org.rusherhack.client.api.ui.ElementBase;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.feature.hud.HudElement;
import org.rusherhack.client.api.ui.ElementHandlerBase;

public abstract class HudHandlerBase extends ElementHandlerBase<HudElement>
{
    public IFontRenderer f889;
    public static Setting[] f890;
    public static long f891;
    public static Object[] f892;
    public static String[] f893;
    
    public boolean mouseScrolled(double n, double n2, double n3) {
        return false;
    }
    
    public IFontRenderer getFontRenderer() {
        long n = HudHandlerBase.f891 ^ 0x43227079085EL;
        return RusherHackAPI.fonts().getHudFontRenderer();
    }
    
    public void renderHudElement(HudElement hudElement, RenderContext renderContext, double n, double n2) {
        
    }
    
    public void renderPrimitiveHudElement(HudElement hudElement, RenderContext renderContext, double stringWidth, double n) {
        
    }
    
    public void renderElements(RenderContext renderContext, double n, double n2) {
        
    }
    
    public void initialize() {
        
    }
    
    public boolean isElementHovered(HudElement hudElement, double n, double n2) {
        return false;
    }
    
    public void mouseMoved(double n, double n2) {
        
    }
    
    public boolean keyTyped(int n, int n2, int n3) {
        return false;
    }
    
    public void render(RenderContext renderContext, double n, double n2) {
        
    }
    
    public void mouseReleased(double n, double n2, int n3) {
        
    }
    
    public void setDefaultPositions() {
        
    }
    
    public PanelHandlerBase<?> getHudManagerPanel() {
        long n = HudHandlerBase.f891 ^ 0x33006133AB91L;
        return RusherHackAPI.getThemeManager().getDefaultTheme().getHudHandler().getHudManagerPanel();
    }
    
    public void renderHudElementBackground(HudElement hudElement, RenderContext renderContext, IRenderer2D renderer2D, double n, double n2, int n3) {
        long n4 = HudHandlerBase.f891 ^ 0x2D75D508AC2DL;
        double n5 = 0.0;
        renderer2D._drawRectangle(n5, n5, ((ElementBase)hudElement).getWidth(), ((ElementBase)hudElement).getHeight(), true, false, 1.0f, n3, n3);
    }
    
    public boolean charTyped(char c) {
        return false;
    }
    
    public HudHandlerBase(boolean b) {
    }
    
    public List<HudElement> getElements() {
        long n = HudHandlerBase.f891 ^ 0x6BEC012C37DL;
        return (List<HudElement>)ImmutableList.copyOf(((IFeatureManager)RusherHackAPI.getHudManager()).getFeatures());
    }
    
    public Color getBackgroundColor(HudElement hudElement, double n, double n2) {
        long n3 = HudHandlerBase.f891 ^ 0x6C569A90F7D9L;
        return RusherHackAPI.getHudManager().getBackgroundColor();
    }
    
    public boolean mouseClicked(double n, double n2, int n3) {
        return false;
    }
    
    public void moveElementToTop(HudElement hudElement) {
        long n = HudHandlerBase.f891 ^ 0x1B4D733DC384L;
        RusherHackAPI.getHudManager().moveToTop(hudElement);
    }
    
    public boolean consumeElementMouseClick(HudElement hudElement, double n, double n2, int n3) {
        return false;
    }
    
    public void tick() {
        
    }
    
    public static void m2052(Setting[] f890) {
        HudHandlerBase.f890 = f890;
    }
    
    public static Setting[] m2053() {
        return HudHandlerBase.f890;
    }
    
    static {
    }
    
    public static void m786() {
        Object[] f892 = HudHandlerBase.f892;
        f892[0] = "34-&\u0007F/./z\u001dR?-dk\u0019Z9(>&\u0014C5h9q\u0006G9+dA=F8\u000b+f\u0014T94";
        f892[1] = "C,Ve\u0003;^9\u000eGB6F?";
        f892[2] = "B\u0003Y\tBI^\u0019[UX]N\u001a\u0010D\\UH\u001fJ\tQLD_lRCTH\u0003vFSWl!w";
        f892[3] = "|o:O\u000eR`u8\u0013\u0014Fpvs\u0002\u0010Nvs)O\u001dWz3(\bROfys)\tC[|3\u0005\u0010Ba_<\u0012\u0019";
        f892[4] = "}\u000e(%VTv\u00019j,Pe\u0000)%\u001aTr";
        f892[5] = "eF< >]y\\>|$Ii_um AoZ/ -Xc\u001a.gbmfQ6k\"\\BU5j Mxv:})";
        f892[6] = Double.TYPE;
        HudHandlerBase.f893[6] = "java/lang/Double";
        f892[7] = Integer.TYPE;
        HudHandlerBase.f893[7] = "java/lang/Integer";
        f892[8] = Boolean.TYPE;
        HudHandlerBase.f893[8] = "java/lang/Boolean";
        f892[9] = "ny\u001aX\u0018\u0001rc\u0018\u0004\u0002\u0015b`S\u0015\u0006\u001dde\tX\u000b\u0004h%\b\u001fD\u0004`e\u0018\u001aD$`e\u0018\u001a\"\u0015oo\u0011\u0013\u00186`x\u0018";
        f892[10] = "k=\n\u0011z\u0013B\u0004\u0016\u000bxOX\u0010\u0006\b3^_\u0003\u0000MnXD\u0005\f\rz\u0013c\u0014\u0011\u0017tSWJ";
        f892[11] = "Dl\u001d[[&mU\u0001AYzwA\u0011B\u0012kpR\u0017\u0007OmkT\u001bG[&LE\u0006]Ufx\u001b";
        f892[12] = Void.TYPE;
        HudHandlerBase.f893[12] = "java/lang/Void";
        f892[13] = "bY7=4Z~C5a.Nn@~p*FhE$='_d\u0005%zh[eN=vhfYC5~#";
        f892[14] = "fe\u0019\u00199+z\u007f\u001bE#?j|PT'7ly\n\u0019*.`9\u000b^e*ar\u0013Re\u0017]\u007f\u001bZ.\u0013hy\u001fP.,";
        f892[15] = ",\u001el6\u0013\u00030\u0004nj\t\u0017 \u0007%{\r\u001f&\u0002\u007f6\u0000\u0006*By}\u000f\u0012&\u001e%J\u0004\u0018'\ty[\u000e\u00187\tsl";
        f892[16] = "4Z?v\u0004!(@=*\u001e58Cv;\u001a=>F,v\u0017$2\u0006*=\u00180>Zv\u0011$15L=*\u0013&il";
        f892[17] = "$\fi73\u001d$\f~k?\u0012>G~u?\u000796),fC";
        f892[18] = "[\u0000\u0000# }G\u001a\u0002\u007f:iW\u0019In>aQ\u001c\u0013#3x]\\\u0015h<lQ\u0000Ik=f@\\.K=f@ \u0002c6mF\u0017\u0015";
        f892[19] = "U\u0018_?|\u0004I\u0002]cf\u0010Y\u0001\u0016rb\u0018_\u0004L?o\u0001SDJt`\u0015_\u0018\u0016X\\\u0014T\u000e]ck\u0003";
        f892[20] = "\u001fZ6\u0007`\u001c\u0003@4[z\b\u0013C\u007fJ~\u0000\u0015F%\u0007s\u0019\u0019\u0006#L|\r\u0015Z\u007f`@\f\u001eL4[s\u000b\u001cMcm";
        f892[21] = Character.TYPE;
        HudHandlerBase.f893[21] = "java/lang/Character";
        f892[22] = "}\u001fmH\u001dQc\u0017w\u0007zPr\fz]\\V";
        f892[23] = "8T\u000fy\u0001\u00073[\u001e6`\t8P\u001al";
        f892[24] = "\u0013]&EkV\u0013]1\u0019gY\t\u00161\u0007gL\u000egaX4";
        f892[25] = "+\u0006[[sF7\u001cY\u0007iR'\u001f\u0012\u0016mZ!\u001aH[`C-ZZ\u0010`G1\u0006Y[iF Zt\u0000ev(\u0011Q\u0010oG";
        f892[26] = "\u0000L\u0010\u0015\u001e\u0004\u001cV\u0012I\u0004\u0010\fUYX\u0000\u0018\nP\u0003\u0015\r\u0001\u0006\u0010\u0002RB4\u0003[\u001a^\u0002\u0005-_\u0004^";
        f892[27] = "=BB!(\u0011#JXnJ\r$W";
        f892[28] = "\"YkR\u001eM>Ci\u000e\u0004Y.@\"\u001f\u0000Q(ExR\rH$\u0005j\u0019\rL8YiR\u0004M)\u0005@\u0015\u001fL\u0005^h9\u0000] Nb\b";
        f892[29] = "\f/7l\u001dS\f/ 0\u0011\\\u0016d .\u0011I\u0011\u0015ps@";
        f892[30] = "#\f\u0002\u007fe8#\f\u0015#i79G\u0015=i\">6@b0";
        f892[31] = "\u0017\u0012\u0005\"[\r\u000b\b\u0007~A\u0019\u001b\u000bLoF\n\u001dN\u0011i]\f\u0011\u000e\u0005\"z\u001d\f\u0014\u000bbN";
        f892[32] = "i\u0010b\u007f#\u0012\u001c0ip2]a(zw;\u0014\t";
        f892[33] = Float.TYPE;
        HudHandlerBase.f893[33] = "java/lang/Float";
        f892[34] = "x\u0013\u0000tC9d\t\u0002(Y-t\nI9]%r\u000f\u0013tP<~O 6^.v\r\u0014";
        f892[35] = "\bp>_ul\bp)\u0003yc\u0012;)\u001dyv\u0015J}E.";
        f892[36] = "L.\u001a\u001d\")@&\u001bVk%@,\u001a\\+hL.\u001b_ %[o>^(3[ \u0015_ \nF2\u0003";
        f892[37] = "S\u007fbmH~Xps\"/f\\lun\nw";
        f892[38] = "#4\u007fA=3?.}\u001d''/-6\f 4)h~\n.294}A\u0006\u0000)'l\u001a=#\u0001'v\u000e(#>";
        f892[39] = "\u000b.55H\u007f~\u000e>:Y0\u0003\u0016-=Pyk";
        f892[40] = "B?wi\u0016{^%u5\foN&>$\bgH#di\u0005~Dce.J]N,|\"\u0000KA(}\"\nzo,c\"";
        f892[41] = "guY%4`{o[y.tkl\u0010h*|miJ%'ea)Mr5amj\u0010M){|t";
        f892[42] = "\u000e\u0011\u0013-\u0017C\u0005\u001e\u0002bj[\u0016\u0019\u000b+";
        f892[43] = "hd^\fPAt~\\PJUd}\u0017AMFb8PLVQupXAGG)_wCOQc";
        f892[44] = "i :`5Yf'q[6\ty\u0010)0:\u000b\u007f===5/b>'!Y]9f)*0\u0004z82[";
        f892[45] = "3z;c8Squ?c\u0007R%o\u001ainY%\u007f\u001eckA(\u0013}aiM\"b.s8FH";
        f892[46] = "\u0014Q[/r*^\u0002N \u0019wU,P)|{H\u001dt#g{T\fXDygP\u001b\t&piI^4xzx^\u000bE+h)Ua\b'wfD\u0010[5&m.\\Oziq\u001f_]-{\u0016";
        f892[47] = "T^\u0012ZV S\bQ\u0018/#Y\u001dH@C\u0011\tX\u0014\u001b\u001fF_\n\u0012[N%S\u0019\u0010\u0018/";
        f892[48] = "|?`\u0003XQ6lu\f3\u0002+sE\u0001X\u000e)uh\u0015U\u0001\rhk\u000fIm&~q\u0012\u000e\u000f/phW3Q%a\u007f\u0002B\u000270th\u000f\u000e(\u007fe\u0019\\\u001cyt\u000fQ\u000fQ/~f\bL\u000f4\u000f";
        f892[49] = "jtmH\u0010\u0002z\u007fgDa\u000f{zKD\u001a\u0018rovc\b\u0005{\u0006{JX]oo7@\u001fQ\u0016";
        f892[50] = "5\u0004\u000e\u0018Zo<\n\u0017]gb8\t+\u001e\u000ew)%p^\u0004c%\u001f\u0001\r\u00162.u";
        f892[51] = "\u0000\u0007iIT\u0016C\u0001o\u00139\u0005@3u@S\u0000V\u0012\u0013H\b\u001d\u0001\u001dcF\u0007\u001bX~.R\u0007\u0014\\O-@P\u0006;";
        f892[52] = "U\u001dnA!6\u001fN{NJe\u0002QAW&O\u0006KhE'p7DgG.\nQI?R,qQC}\u0013J";
        f892[53] = "[f5Gp\u0010\u0018`3\u001d\u001d\t\u0007y4Zx\u000f%x2\\p9\u000be(Cyb\\|!Ww\u0013\u000fnp\\\u001d^\u0003q?Ml\r\u0011 4'!\u0001\u000eo%Vr\u0013_dO\u001af\\\u0010x~\u0019t\u000b\u0002\u001f";
        f892[54] = "p$T\u0000d\u0014|7VC\u0005\u0012v3\u000e\u001bi !u_D>w+4_\u0004{\u0019!*\tF\u0005";
        f892[55] = "K\rP4Cb\b\u000bVn.l\u0011\u001fIT\u001ekA\fT:\u0014u\u0017N*";
        f892[56] = "\u001bjkgH\u0011\u001dhjg/\u0002\u0019\u007f`zxUF\";\u0016L\u001e\n|;gS\u000fC\u007f";
        f892[57] = "T6pu\r$T5:xf9@'L$\u000f*P!o2f.Q%o#\u001d,Df:I";
        f892[58] = """
                   T
                   _?\b-\u001eYJ0c\u0126n\u0005L9\u001c|\u000eS@h
                   \u0011""";
        f892[59] = "\t|\u000b1D6Jz\rk)?_y=<G-Oa\r\tN?Sy\u00106O?25\n`Q:\\?\u00146\u0013D";
        f892[60] = """
                   \u0017\u0003S
                   /\u001cT\u0005UPB\u0005K\u001cR\u0017'\u0003i\u001dT\u0011/%H\u001bB	BRO\u0014Y\u00003\u0001]ERj~\rB
                   C\u001b-\u001f\u0013\u0001)W/W@EQZ,\b@z\u0014\u0011|\u001eKK\u0017\u0003+\f,""";
        f892[61] = "\u0016P(dnkO\u0013v\u007f\u001fmB\u0010NBU\u0002\u0012\u0001-a z\u001f\u0002ra\u001f";
        f892[62] = " B\u00042\u001c\fcD\u0002hq\u001b|F\u0005?*\u0015a\\\u001a6\u001c\u0012\u001b\u0007\u001d<\u0001\u0014jT\u000fm\n~'X\u0010\"\u001b\u000ftJA)qBxU\u000e8\u0000\u0011j\u0004\u0005RL\u0005%K\u0019cO\u0017rY~";
        f892[63] = "vPVXm\u001c=Q\u000e\u0018\u000f\t*\u0012qXc&.\b]Ab\u001cGT\u0001Jd\r{\u001eR_kf";
        f892[64] = "\u0014\u0007.<\u000f1I\u001d'~?\u0529p\u0005x?E:\u0017\u0002 \u007f\u0005H";
        f892[65] = "_FbnMfSU`-,`YQ8u@R\u000e\u0017i*\u0011\u0005RO(/C>\t\u001d4,,cV]e}\u00178\u0004Af\u0012JgD\u00107)\u00115X\u0013X\"W4LS6(Ib\u000e-";
        f892[66] = "jZZT2\u0010cTC\u0011\u000f\u0013qkCPb\bgG$\u0012l\u001czAUA~Mq+\u0018Ma\u0002`ZK_0\t\n\u0016_\u0010\u007f\u0015;\u0015MGmr";
        f892[67] = "\n&\u001b0\u00145@u\u000e?\u007f`0-E<\u001fxLu\u0013%D\t\u000b'\u0013;\u000euSq\n`\u007f";
        f892[68] = "jD\u001e,?\u0004cJ\u0007i\u0002\tgI;*k\u001cvd`ja\bz_\u00119sYq5";
        f892[69] = "#!\u0013{41`'\u0015!Y&\u007f%\u0012v\u0012'y3\nv5C$;\u0007k32w)V`Y\u007f{6\u0019q(,ig\u0012\u001bd.!4Vci-~4i&\"}h?X%0*zX";
        f892[70] = "\u0001\u001aD$\\\u001bB\u001cB~1\u0002]\u0005E9T\u0004\u007f\u0004C?\\3W\u0007S-J\u0004:_]*A\u0003K\fO{Ji\u0006\u0000P4[\u0018U\u0012\u0001?1TWZR{IYT\u0005RD\u0001\u0012\u000b\u001b@*\u000b\f]Y>";
        f892[71] = "\u0017v\u0007i\u001fB\u0013z\u000b? RCe\"}LxG\u007f\u000boMG.u\u0018z\u001bQ\u0013z\u001f1 ";
        f892[72] = "]Qj\u001e\u0002'T_s[?=Z[h>R#QMndU|\u0005Rs^P=OK\u0014X\\+MJe\u000bNzF (\u0007Q5WQ{\u0015\u0000>=\u0010oUG;S\u001aq\u0003\u0005E";
        f892[73] = "y-sYM;p#j\u001cp6t CD\u0016%C1kO\u001d#t&\rH\u0011cz\"<\u001b\u00167i\\";
        f892[74] = "O\u0001\b\t?_C\u0012\nJ^YI\u0016R\u00122k\u001eP\u0003Mb<\u0018\t\\\u00054MK\u001b\r\u000e^\u0000G\u0004B\u001f/SUUIub_J\u001aX\u00041M\u001b\u00112E%\r\\\u0014\\O;[\u001ej";
        f892[75] = "sY\u00199\u0011*0_\u001fc|3/F\u0018$\u00195\rG\u001e\"\u0011\u001d/^\u000eY@;&P\t(\u0013)w[ce\u001f68J\u00126\rg3 S\"M 6NY<\u001bbH";
        f892[76] = "*L\u00192y=6W\nw\u001d*'2\u0019rr>+O\u001fps>";
        f892[77] = "\u0011w0>fPBpd-\u0018\u000e\u0017jQ!b\u0000\u001cyU<t\u001d\u001a\u0016v2!\\\u0003\u007f:8fPz*i3h\u000b\u000by{bca";
        f892[78] = "t)hj.<vra+\\cs3\\{,\u007f\u001aua(,d+vs\u007f>\u0003";
        f892[79] = "\u0002;<9>z_!5{\u000e\u037cf9j:tq\u0001>2z4\u0003V8<|pm\\&j>\u000e";
        f892[80] = "U9qn.p\u001fjdaE)\bwsH!!\ndxy\u0019+3nf\u0005%=\u0011s#g,3\b6\u001e5>}\u0017wp? +U\t";
        f892[81] = "hcf]a\u001a+e`\u0007\f\r4ggPV\u00057wuFa\u0004S&\u007fS|\u0002\"um\u0002whoyrMf\u0019<k#F\fU>#p\u0002tX=|p=<\u0013bbbS6\r4 \u001c";
        f892[82] = "\u000e*J\u000f{B\fqCN\t\u001b\r;Dsf\u0019\\&Z\u00165\u001bYt8";
        f892[83] = "6\u007f\"\tiuuy$S\u0004}``4\u0004~\u0007g?`\u001bc=b~*\u0002\u0004;nh(\u0003uh|9#i8dcv2\u0018kv2}XY\u007f6ux6Sa`7\u0006";
        f892[84] = "!\bLYP\u001fr\u000f\u0018J.B0\u0000\taRT+\u000f\u0019:RAsT\u000fS\u001eK4Xv\u0006M@:\u0003\u0007U_\u00111iJY@^ \u0018\u0019K\u0011UJT\u001b\u0003B\u00112Y\u0018\\B.v\n\u0018JD_%\u0018IA.";
        f892[85] = "7@\u001bkf\\9\u0010\u0002+_[0\u0014\u00112_Z6A\f5<V%COT4Pg\u0018\u000eegW3\u000bpd$\u0000%\u0005\u001en:Vg{";
        f892[86] = ">,63V\u001dt\u007f#<=[iz55Gl`q<5[]\u007f\u001c3a\u0005Sc&6 OJ\u0004 :6MKus(gF!8\u007f7(WPkmf#=\u0011\u007f-!&S\u001ba{cX";
        f892[87] = "LV\u000b2\u001c\u007f\u0006\u0005\u001e=w9\u001b\u0000\b4\r\u001b\f\u0007\u00018\u000b\"\b\u000b$$\u001b\u000e\u0012\u000b\u00014\u0011?v\u0006\u0015'\r~\u0014\u000f\u001b>HC\u001c_\\+\u0010y\u0019\u001e\u00162w\u007f\u0015\b\u00143\u0006,\u0007Y\u001fYK \u0018\u0016\u000e(\u00182I\u001ddi\fr\u000e\u0018\nc\u0012$Lf";
        f892[88] = """
                   +\u0002B<H\\%R[|qf-C@|+\\*E@e\u001eU,9\u0015`\u001fA+HFrNJA\u0005Jm\u0001[0VX<
                   1}ZGs\u001b@.H\u0016xq\r"WYi\u0000^0\u0006R\u0003LJ\u007fIN2OX([)>
                   \u000f1^\u0018=\u0018X#9Oa\u0001\f.\u0002\u00143\u001d\u000fA\u0004D:\u001d\u000e9	Ge\u001d1|T\u0010oNIqWOoq\u0001:\bQ}\u001f\u000b$^\u0013\u0003""";
        f892[89] = "0\u001aA\f\u0007%c\u001d\u0015\u001fy{6\u00075\b\u001fh\u001b\u0016\u001a\u0000\u0019h[G\u0018\u0001\t~*\u0014\nP\u0002\u0014";
        f892[90] = "?=&DGJ3.$\u0007&L9*|_J~nl-\u0000\u0017)d--@XGn3{\u0002&";
        f892[91] = "76_Xpb}eJW\u001b1`z}Wv;``LH\u001b<fb\rNfndj\n3";
        f892[92] = "\u0012\u001c6(1@\u0001M=i\u0000Q\u001d\u00078k|+@\u0007ni~EJ\u00198+\u0000";
        f892[93] = "1x\u0010bTT?w\u0016;7K=569[X0IU;YT:8\u0006)\b_P";
        f892[94] = "!:i\u000bg\u000b%6e]X\u001bu)P\u00025\u0011u\u0010e\u00041\u001bu/\f\u000bi\u0010(l`[&\u001eiU";
        f892[95] = "2e\u0000_{\u00027$JF\u001cW\"5@M}S#\\X\u0012&E!:_De\u0007X";
        f892[96] = "\u0011X@\u0001bE\u0018VYD_H\u001cUe\u00106C\u001c)\u0002\u00181W\u001bXQ\n`\\q";
        f892[97] = "<Hfd@Xv\u001bsk+\u0512\u0006\u0013h5H\u001a7@oa[";
        f892[98] = "0KS}\u0006Z`\u0004]<?Y4\u0006{ Q_$\u001eK\u0011_[<\u00177|\u0001Q$\u0018M7\u0000\tdz";
        f892[99] = "V[G\u0005GZS\u001a\r\u001c \u0018[\u0019\u0012wK\u000b\u0006\u001e\u001e\u0014G\u0018\u0004]\u007f";
        f892[100] = "A\u001b\u00172\r:D\u0013\u0001\"<%W\u001d82P\u0004]\u0007\u0004\u0015Q,V\f\u0002\"FJQ\u0000B,B{\u0002\u0007\u0016?<";
        f892[101] = "5g\u000b$Z\u0014va\r~7\rnw\u000b\u0018F\u001ecrq*\u000e\nj'@9E]6\u001eL?\t\u0016i/O-^\u0004\u000e";
        f892[102] = "\\#M7<0\u0016pX8Wv\u000buN1-L\u001b\u007fo8:i\u000bu^\\7}\u0018i\u001f>>s\u0001,\"6n4\u0014t\u00183/~\r\u0013\u001e?9|\fbM-hwf/A2'f\u0017|Sc,\fVh\u0013$)b\\vEfW";
        f892[103] = "+H9#\u0003*a\u001b,,hl|\u001e:%\u0012Vl\u0014\u001b,\u0005s|\u001e*\u0002\u0001}r\u0017,/\u0015p}x69\u0016l,\u001a?7\u000f)\u0011\u0012op\u001aq+\u0017.:\u0003\u0016{C=wQ{u\u0013$7h*r\u0016&\"\u0019y`G-HTu\u007f\b<9\u0007g.\u0003Vu\u0005/}G.x\u0006p}xf3Yno\u0016l-\u000f,\u0011";
        f892[104] = "dHYn\u000b\u0010'N_4f\u00039P_o\u000f\u0006>CN\u000eV\u0019nI]`\\\u00078\u000b#";
        f892[105] = "\n>(o\b\u000e\u00041.6k\u0011\u0006s\u00118\n\u0011\u000bsQi\b\u0010\u001be :\u001aA\u0010\u000f";
        f892[106] = "\u0012D]\u0011\t\u0014PKY\u00116\u0015\u0004Q|\u001b_\u001e\u0004Ag\u001dW\u0015\tQ'LU\u0014\u0019GV\u001fGE\u0012-";
        f892[107] = "hy\n\u001e,jyzM\u0004CewkE(-\u000ehoJ\u0002)ujz\tWCvz-E\u0000'gyj_o";
        f892[108] = "7Ko\u0015&o>EvP\u001bw:\\}\u0002a\r=\u0003)\u001d|78Bc\u0004\u001b14Ta\u0005jb&\u0005jo'n9J{\u001et|hA\u0011_`</D\u007fU~jm:";
        f892[109] = ")\u001ePLQucMEC:\"tHDZ_$^JRBW/okXZA$XJ^LYIs_A]\u0007+zQX\u0018:up@OMK&b\u0011D'\u0006*}^UVU8,U?\u001aWp\u007f\u0011G\u0017T/\u007f.\u0002\\\u00049t\u001f\u0001NS+\u0013";
        f892[110] = "\u0010J\u001b#Q\u0002BH\u0013$,\u001e\u000eL\u0005wP\u0018\b!\u0011\u007f^\u0003\u0000\u001e\u0013$WBr";
        f892[111] = "\u000fZ2\u0002HlL\\4X%}YR\u0014\u0013]sX#u\u000f\u001cr\u000b[x\fCr4\u001e%[I!L\u0013&\u0004I\u001e\tNq\u000e\u001af\u0004M.\u000e%#O\u001d8\u0005\u0014 ]J*b";
        f892[112] = "T\u000f\u00047cn\u0017\t\u0002m\u000ey\b\u000b\u0005:K{\u0011\u001b\u0012W2\u007f\u0001\u0006\u0014&amP\r~kmr\u001f\u001c\u000f8\u007f#\u0014vN,?d\u0011\u0018D2i&o";
        f892[113] = "\u0001Sh\\_AK\u0000}S4\u0012V\u001fIPR\u0001a\u000ea[Y\u0007V\u0019\u0007\\UGX\u001d6\u000fR\u0013Kc";
        f892[114] = "6\u001a2\u0006KP$\u001d$\u000e.A<\u001a[\\U\u001d\"\b5VKK`v";
        f892[115] = "\"Ii`u\u0014&Ee6J\u0005|@prJ\u0010aIq8:\u0015i_a\t";
        f892[116] = "k\u001bh\u00079hd\u001c#<02y\fN[\t2\u007farM+/:\u0003{C2j\u0007Qi\r-+i[w[oU";
        f892[117] = "\u0004\u0016r\u001bi\u0014\u0002\u0014s\u001b\u000e\u0007\u0006\u0003y\u0006YPXT!ji\u0016\r\u0001~Vg\u0016[Q";
        f892[118] = "@l9h  Rk/`E=WJ-c!0Mf?\u0002x'\u0012p73{5EbP";
        f892[119] = "[uM\u0011\u0002aZ*P\u000ei5[5u\u0001\u000f6[3B\u0016i0\r\"\u0010U\u0004>];Pl";
        f892[120] = """
                    #P<\u0017a\u0004i\u0003)\u0018
                    \u0442\u0019_/\u0011uUy	#@c8)\u001bb\u0004tV#\u00054F
                    """;
    }
    
    public static Field m159(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m160(Class clazz, String s, Class clazz2) {
        Field m159 = m159(clazz, s, clazz2);
        if (m159 != null) {
            return m159;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m160 = m160(interfaces[i], s, clazz2);
                if (m160 != null) {
                    return m160;
                }
            }
        }
        return null;
    }
    
    public static Method m162(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m163(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m162 = m162(clazz, s, clazz2, n, array);
        if (m162 != null) {
            return m162;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m163 = m163(interfaces[i], s, clazz2, n, array);
                if (m163 != null) {
                    return m163;
                }
            }
        }
        return null;
    }
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/client/api/ui/hud/HudHandlerBase.m174:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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

   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }

   public static int dcmpl(double var0, double var2) {
      return Double.compare(var0, var2);
   }

   public static int dcmpg(double var0, double var2) {
      return Double.compare(var0, var2);
   }
}
