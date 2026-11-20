// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.core.logging.ILog;
import org.rusherhack.core.feature.IFeatureConfigurable;
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
import org.rusherhack.client.api.ui.window.view.RichTextView;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.event.subscribe.Subscribe;
import java.awt.Color;
import org.rusherhack.core.event.stage.Stage;
import java.util.List;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.content.ComboContent$AnchorSide;
import org.rusherhack.client.api.ui.window.content.component.ButtonComponent;
import org.rusherhack.client.api.ui.window.content.ComboContent;
import org.rusherhack.client.api.render.graphic.IGraphic;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import java.util.Collection;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.core.setting.Setting;
import java.util.Map;
import org.rusherhack.client.api.ui.window.content.component.TextFieldComponent;
import org.rusherhack.client.api.ui.window.view.TabbedView;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.client.api.feature.window.ResizeableWindow;

import org.rusherhack.client.api.feature.module.impl.chat.Timestamps;
public class Console extends ResizeableWindow
{
    public BooleanSetting timestamps;
    public static Console f8537;
    public boolean f8538;
    public TabbedView f8539;
    public TextFieldComponent f8540;
    public Class188 f8541;
    public static long f8542;
    public static String[] f8543;
    public static String[] f8544;
    public static Map f8545;
    public static long[] f8546;
    public static Integer[] f8547;
    public static Map f8548;
    public static Object[] f8549;
    public static String[] f8550;
    
    public void onKeybindEvent() {
        long n = Console.f8542 ^ 0x3D4E2DB8F84DL;
        super.onKeybindEvent();
        this.f8540.setFocused(true);
    }
    
    public Console() {
    }
    
    public void setFocused(boolean focused) {
        long n = Console.f8542 ^ 0x304A616BA685L;
        super.setFocused(focused);
        if (focused) {
            this.f8540.setFocused(true);
        }
    }
    
    @Subscribe(stage = Stage.ALL)
    public void m16405(Event157 obf157) {
        
    }
    
    public WindowView getRootView() {
        long n = Console.f8542 ^ 0x52BDB2ABAC05L;
        return (WindowView)this.f8539;
    }
    
    public RichTextView m16406() {
        long n = Console.f8542 ^ 0x68C7B96306FAL;
        return (RichTextView)this.f8541;
    }
    
    static {}
    
    public static Exception m672(Exception ex) {
        return ex;
    }
    
    public static String m5835(byte[] array) {
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
    
    public static String m5836(int n, long n2) {
        return null;
    }
    
    public static Object m5837(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        String m5836 = m5836((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, m5836), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m5836;
    }
    
    public static CallSite m177(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Console.m177:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static int m5165(int n, long n2) {
        return 0;
    }
    
    public static int m5166(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        int m5165 = m5165((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, m5165), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m5165;
    }
    
    public static CallSite m265(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Console.m265:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static int m1398(long n, long n2) {
        n ^= (n2 << 48 | n2);
        int n3 = (int)(n >>> 46);
        if (Console.f8550[n3] != null) {
            return n3;
        }
        Object o = Console.f8549[n3];
        if (!(o instanceof String)) {
            return n3;
        }
        int n5 = switch ((int)(n >>> 42 & 0x3FL)) {
            case 0 -> 28;
            case 1 -> 32;
            case 2 -> 56;
            case 3 -> 57;
            case 4 -> 42;
            case 5 -> 52;
            case 6 -> 2;
            case 7 -> 59;
            case 8 -> 37;
            case 9 -> 36;
            case 10 -> 1;
            case 11 -> 4;
            case 12 -> 19;
            case 13 -> 11;
            case 14 -> 23;
            case 15 -> 7;
            case 16 -> 33;
            case 17 -> 12;
            case 18 -> 60;
            case 19 -> 47;
            case 20 -> 18;
            case 21 -> 13;
            case 22 -> 54;
            case 23 -> 48;
            case 24 -> 0;
            case 25 -> 46;
            case 26 -> 6;
            case 27 -> 16;
            case 28 -> 49;
            case 29 -> 8;
            case 30 -> 3;
            case 31 -> 35;
            case 32 -> 26;
            case 33 -> 55;
            case 34 -> 61;
            case 35 -> 31;
            case 36 -> 44;
            case 37 -> 43;
            case 38 -> 14;
            case 39 -> 38;
            case 40 -> 39;
            case 41 -> 27;
            case 42 -> 34;
            case 43 -> 24;
            case 44 -> 25;
            case 45 -> 41;
            case 46 -> 10;
            case 47 -> 22;
            case 48 -> 5;
            case 49 -> 40;
            case 50 -> 30;
            case 51 -> 21;
            case 52 -> 15;
            case 53 -> 51;
            case 54 -> 63;
            case 55 -> 45;
            case 56 -> 62;
            case 57 -> 53;
            case 58 -> 9;
            case 59 -> 29;
            case 60 -> 17;
            case 61 -> 20;
            case 62 -> 58;
            default -> 50;
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
        Console.f8550[n3] = new String(charArray);
        return n3;
    }
    
    public static void m1399() {
        Object[] f8549 = Console.f8549;
        f8549[0] = "\"M\u0002#\u0018&>W\u0000\u007f\u00022.TK\u04d9";
        f8549[1] = "~$C\u001aFpb>AF\\dr=\n\u01b9";
        f8549[2] = """
                   l\u001flxV\u0011p\u0005n$L\u0005`\u0006%5H\rf\u0003\u007fxE\u0014jC~?
                   \u0013j\u0003o9SJ`\u0002e"A
                   wCH9I\u0006l.d8P\u0001m\u0019/\u0017J\u0007k\u0002y\u0005M\u0000f""";
        f8549[3] = "\u0001.\u0007L\u0012/\u001d4\u0005\u0010\b;\r7N\u0109";
        f8549[4] = "g\u0010Q\u007f&F{\nS#<Rk\t\u00182;AmLZ>3Ta\fQ\u007f\u0018\\o\u0005S#";
        f8549[5] = "s\u0019Z\f\u001apo\u0003XP\u0000d\u007f\u0000\u0013A\u0004ly\u0005I\f\u03b1";
        f8549[6] = ",\u000f\u0016WW\u0013'\u0000\u0007\u0018*\u000b4\u0007\u000eQ";
        f8549[7] = "q>jFQ\nz1{\t=\tt3yF\u0011";
        f8549[8] = Boolean.TYPE;
        Console.f8550[8] = "java/lang/Boolean";
        f8549[9] = "\u0013oGD/C\u000fuE\u00185W\u001fv\u000e\u026c";
        f8549[10] = Integer.TYPE;
        Console.f8550[10] = "java/lang/Integer";
        f8549[11] = "DiE\u001fr\u007fZa_P\u0010c]|";
        f8549[12] = "`\u0000]mZC~\bG\"7Yf\rNo\u0000_e\u000f";
        f8549[13] = "\u0014Qx!\u0015}\bKz}\u000fi\u0018H1l\u000ba\u001eMk!\u0006x\u0012\ryj\u0006|\u000eQz!\u0010a\u0015GpxI_\u0012M{`\u0010";
        f8549[14] = """
                    -W\u0003VVf1M\u0001
                    Lr!NJ\u001bHz'K\u0010VEc+\u000b\u0016\u001dJw'WJ\u001fVr2M\r\u001b
                    Z\u0005W\u0005\bLz!""";
        f8549[15] = Void.TYPE;
        Console.f8550[15] = "java/lang/Void";
        f8549[16] = "Qh#&w\u0017Mr!zm\u0003]qjkj\u0010[47mq\u0016Wt#&G\rQv!ik1[n0ak\u0005";
        f8549[17] = ".|\\w\u0010'2f^+\n3\"e\u0015:\u000e;$`Ow\u0003\"( N0L%(`_6\u0015|\"aU-\u0007<5 x6\u000f0.MT7\u00167/z";
        f8549[18] = "Q\u001epG1GM\u0004r\u001b+S]\u00079\n/[[\u0002cG\"BWBb\u0000mEW\u0002s\u00064\u001c]\u0003y\u001d&\\JB@\u0000-VQ\u001bT\u0006-F[\u0002c";
        f8549[19] = "3i\u001bJ\u000eo/s\u0019\u0016\u0014{?pR\u0007\u0013h95\u001a\u0001\u001dn)i\u0019J5\\9z\b\u0011\u000e\u007f\u001ft\u0012\u0002\u0015})i\u001d\u0006\u0010\u007f";
        f8549[20] = "lF\u0018bRxE\u007f\u0004xP$_k\u0014{\u001b5Xx\u0012>F3C~\u001e~Rxdo\u0003d\\8P1";
        f8549[21] = "&nHi_i:tJ5E}*w\u0001$Au,r[iLl 2Z.\u0003k rK(Z2*sA3Hr=2L(@l&rJ)Y2\u001dyW3ku,pK\u0004Bq9sA\"Ch";
        f8549[22] = "^:p\u001eo\"@2jQ'\"Z8r\u0016.9\u001a\u0018i\u00112\"Y>t";
        f8549[23] = "%%t\u0013\r\u00019?vO\u0017\u0015)<=^\u0010\u0006/yvK\u001a\u001a>yVK\u001a\u001a>\u0015fN";
        f8549[24] = """
                    /\u000eLC6
                    $\u0001]\f]\u001e&
                    JVq	+""";
        f8549[25] = "Ze\u001510\u000fF\u007f\u0017m*\u001bV|\\|.\u0013Py\u00061#\n\\9\u0007vl\r\\y\u0016p5TC~\u0017hl-\\y\u0016p5,\\r\u0005";
        f8549[26] = "J\u001e\u0013CmZV\u0004\u0011\u001fwNF\u0007Z\u000ep]@B\u0018\u0002xHL\u0002\u0013CVcJ\u000b";
        f8549[27] = ".vd\nRS[Vo\u0005C\u001c:Xd\u000eGFN";
        f8549[28] = "$a'R\u0015\\8{%\u000e\u000fH(xn\u001f\u000b@.}4R\u0006Y\"=&\u0019\u0006]>a%R\u0010@%w/\u000bI{.`)\u0006\u0002H)\u007f%+\u000eG/|7";
        f8549[29] = Double.TYPE;
        Console.f8550[29] = "java/lang/Double";
        f8549[30] = ")x\u001a7\u000eh\"w\u000bxof)|\u000f\"";
        f8549[31] = "A\u001e+#\u0002M]\u0004)\u007f\u0018YM\u0007b\u043d";
        f8549[32] = "\u0000PYU\u007fp\u001cJ[\ted\fI\u0010\u012d";
        f8549[33] = "v)\"<\u001f\bv)5`\u0013\u0007lb5~\u0013\u0012k\u0013d'DP";
        f8549[34] = "d\u0017Wi0\bx\rU5*\u001ch\u000e\u001e$-\u000fnKU1'\u0013\u007fKC3#\u001anKc3#\u001an";
        f8549[35] = "(\u001c5n*65\tmLk;-\u000f";
        f8549[36] = "_\n\u000bPD\u001aC\u0010\t\f^\u000eS\u0013B\u001dZ\u0006U\u0016\u0018PW\u001fYV\u0019\u0017\u0018\u0018Y\u0016\b\u0011AAF\u0011\t\t\u0018;Q\u001a\u000e\u001bR9Y\u001d\u001b";
        f8549[37] = "d|Kjx(xfI6b<he\u0002\u0200";
        f8549[38] = "\t%rHA]\u0015?p\u0014[I\u0005<;\u0005_A\u00039aHRX\u000fy`\u000f\u001d_\u000f9q\tD\u0006\u00058{\u0012VF\u0012yv\t^X\t9p\bG\u0006$\"a\u0012\\F%8x\u0016\\F\u00039a";
        f8549[39] = "]NB\u0007\u001fj\u001e]TU~\\)~r:Gf\b\rOH\u0004u\u001e_";
        f8549[40] = ">i+<ps=&l}\u001at\u0004l!{gyknjp!";
        f8549[41] = "I+M-}tK`Fk\u001bz\u0014t\u0010P'w\u001bwK.g|\u0003hw9c}\u001eh\u001d)#\u007fC\u001a";
        f8549[42] = "FuFb.i\u0002:[rD\u0290}8G{)1\u0003xLc6\rAhB\u007fxs\u0001cZ`D";
        f8549[43] = "v?znW~vyce<|\"`ld{lK:!1F}5t(q\u0003\u0002v?znW~vyce<";
        f8549[44] = "z,P[\u0005Ak0\u0001Tk\u014f\u0002`\u0006_\u0006G| \rG\u0019{<lRL\u0014\u0005re\u0012\tk\u001eda\b\u000b\u0013E`!\u00176";
        f8549[45] = ">r~V:D:u}NU\u0261\u0000&y\u0015+Dqa&@?8";
        f8549[46] = "^<GR.{]s\u0000\u0013D\u03a9d8B\u00149}\b;\rSx";
        f8549[47] = "OLk9;0M\u001a)9\u00055\u001cF\u001afa\\@T.~t2\u0010K4;\u0005b@\u0012)}{,IRl\u0002";
        f8549[48] = "%:?|JIid.awKy&\u001ce\u0010V\u0014k$eJ_,'/n\u000f0}\";b\u0005Zmb9?w";
        f8549[49] = "\u000e!1\u001f0 \u0013.4.\u0499K\b42C26\fc$K";
        f8549[50] = "Qg\u0016Qj-Lh\u0013`\u049cF\u0003)D\u001ar8M \u0004_";
        f8549[51] = "r<W%-P (P8FSu9\"\" Ft3\u0015E-[#nQ>6\u0005&*i|8V$4\u001b?+@vU\u0000= Vk?\u0010}\"\u000b\u0019";
        f8549[52] = "-\u001bTyD\u001a.T\u00138.\u049c\u0017]\u001f>C\u0018-L\u0003oLv";
        f8549[53] = "@c]\u0014@UV,\f%YCU\u001d\\IYB\u0005c\u001cBA]9\"\u000e\u001bNSHeQNZ/Pe\u0006IBE@%\u0004\u00140";
        f8549[54] = "\u001e\u0010\u0005?6D\tG_dMZ\u001f\u0018\u0007}1M\b,\u000bz1A\u0014\u0018\u001d\u0006 N\u0003NZgs\u0010H\u000ffo5F\u001e\u0005\f\u007fuDCw";
        f8549[55] = "4\u0002HVx\rw\u0011^\u0004\u0019%L3d7\u0019Fs\u0010\u0019\nk\u0005`\u0006K";
        f8549[56] = "iC+-I\u0018w_a9u H\u007fM\\\u0013\u001f5U-<\r\u0003\u007fA";
        f8549[57] = "-\u0010E`|\u00175\tV!\u0004:\u000b i\rS1\u0010&xQc\u0001&^Q8{\u00185\u001f";
        f8549[58] = "_UN[4%BZKj\u0204N]\u0013H\u00066(\bV\u001cP";
        f8549[59] = "HNLW1i\u0013J\fH\f~@T*Ie~@(\u0017R6`\u0011H\tN|t-";
        f8549[60] = "\u0002\u0016\u001cUA;\u0014YMdX-\u0017hGZA>\u0010\u0003X\u001f@p{WOZO=\n\u0010\u0010\u000f[A\u0012\u0010G\bC+\u0002PEU1";
        f8549[61] = "\u0018\u0013\u00053N\u0002MVQe+\u001f\u001bW32W\u0019\fM\"6O\u0000\u001cB\u0002<+\n\b@\f`I\u0000\tA\r_B\u001c\u0010G\u001b5R\\\u0012\u001ai";
        f8549[62] = "\u0017\u0013\u0002xy\u0007\u0014\\E9\u0013\u04b1-B\u0002gjVSB\u0002\u007f\u007f";
        f8549[63] = "\u0012\u001c%M6s\u000f\u0013 |8\u0018\u001e]0\u0011>&G\u00100EQxA\u001d\"\u0013o!\f\u001dv|";
        f8549[64] = "~\r\u0012 \u0017bf\u0014\u0001aodt\u000e$^%\u000b&\u001c@o\u0013zaC\u0015{o";
        f8549[65] = "Zp\u0000I\u000b;Bi\u0013\bs\r}N05s5Bc]\u0000\u001a-[p\u001c";
        f8549[66] = "*eo\u0015\u00035z)0Pg#'e@J\u00010'\u007fw-X*r\"5AZ|0\"\u000b";
        f8549[67] = "V6\n(42K9\u000f\u0019\u03a9YB&\u001a{8\"\u00038\u001cw";
        f8549[68] = "%[*v\u0016q-\u000f<g'l:|4lLh\\^(kKy6Nhi\u0016\u000b";
        f8549[69] = "Hs]\b/B\u0014/N\u0007E@SkH\u0002E\u0011ExBD;QN`]x'\u001d\u0018r]\u0015~F\u0019c/\u0011=KEcE\u0001}I\u0018\u0011";
        f8549[70] = "9n\u0011\u0007d`2i_\nT`6o$\u001a2[6r\u000e\u001b(\u001b8s\u0000\u0017egal\u0005\u001aTr#u\r\t>bcwP{";
        f8549[71] = "(k\u0018v)\u0019h`\u0000i\u0015\u0006oJ\u0014ci\u0016\u00149A#o\u0018jwHc*g";
        f8549[72] = "- x3p1- `&M4?qa!7.(v\u001a.|s?y 5wp+\u001bs2+#0qcr)~B";
        f8549[73] = "`e$:BY;ad%\u007f\u0107\u0005e'(\u0000Jnzb)N!";
        f8549[74] = "D\b<x\u0006OC\u00144&>\u0479 JiuSB^\nbmL~\u001c\u001alq\u0002\u0000\\\u0011tn>";
        f8549[75] = "U\f:d4HH\u0003?U\u01ce#@\fmd#YVC<";
        f8549[76] = "r F2x\u001ao/C\u0003Vqr F2x\u001ao/C";
        f8549[77] = "\u001a^7?\u0007K\u0011Yy27K\u0015_\u0002\"Qo\u0019O;#7S\u0018B+rK\n\u0007G&C^H\u001eO5)N\b\u001c\u0012G";
        f8549[78] = "2K>[B\u0017-\u000e?\u0015)\u00139\t\u0015XS\u001d2\u001aN\u0018E\u00159I0XN\r&u";
        f8549[79] = "\u001f\u000f\t\"\u0006m\u001dYK\"8fNiU(\u0004|BSN#\u0007h \r\u0000%Ec\u001a\u0016\u000b&Q\u0001\u001f\u000f\t\"\u0006m\u001dYK\"8";
        f8549[80] = "Y\u000bhy3&\fN</V/ZOZ|2=Z38y?-\u000bMxr'27";
        f8549[81] = "\u000eEfx\u0010:\u0010Y,l,\u001d.\":n\u0016+TB.r\\?";
        f8549[82] = "\u001e\u0017uA\u0002\u0005KR!\u0017g\u0018\u001dSGD\u0003\u001e\u001d/%A\u000e\u000eLQeJ\u0016\u0011pFaK\u000b\u0011\u001aV!IVc";
        f8549[83] = ":iGT!\u0011o,\u0013\u0002D\f9-e_/\n/<G8zGl+TF4N,n+Q<\u00118#AA|\u0013eQ";
        f8549[84] = "{W,BP9 Sl]m\u02d0\u001e\r}I\u0000}`MvQ\u001fA";
    }
    
    public static Class m1400(long n, long n2) {
        int m1398 = m1398(n, n2);
        Object o = Console.f8549[m1398];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(Console.f8550[m1398]);
                Console.f8549[m1398] = forName;
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
    
    public static Field m1401(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m1402(Class clazz, String s, Class clazz2) {
        Field m1401 = m1401(clazz, s, clazz2);
        if (m1401 != null) {
            return m1401;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m1402 = m1402(interfaces[i], s, clazz2);
                if (m1402 != null) {
                    return m1402;
                }
            }
        }
        return null;
    }
    
    public static Field m1403(long n, long n2) {
        int m1398 = m1398(n, n2);
        Object o = Console.f8549[m1398];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        String s = Console.f8550[m1398];
        int index = s.indexOf(8);
        Class m1399 = m1400(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        String substring = s.substring(index, index2);
        ++index2;
        Class m1400 = m1400(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m1399;
        while (true) {
            Field m1401 = m1401(clazz, substring, m1400);
            if (m1401 != null) {
                return (Field)(Console.f8549[m1398] = m1401);
            }
            Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    Field m1402 = m1402(interfaces[i], substring, m1400);
                    if (m1402 != null) {
                        return (Field)(Console.f8549[m1398] = m1402);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m1399.getName()).append(' ').append(m1400.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m1400(2158528993042726L, 0L);
        }
    }
    
    public static Method m1404(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m1405(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m1404 = m1404(clazz, s, clazz2, n, array);
        if (m1404 != null) {
            return m1404;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m1405 = m1405(interfaces[i], s, clazz2, n, array);
                if (m1405 != null) {
                    return m1405;
                }
            }
        }
        return null;
    }
    
    public static Method m1406(long n, long n2) {
        int m1398 = m1398(n, n2);
        Object o = Console.f8549[m1398];
        if (o instanceof String) {
            String s = Console.f8550[m1398];
            int index = s.indexOf(8);
            Class m1399 = m1400(Long.parseLong(s.substring(0, index), 36), 0L);
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
            Class m1400 = null;
            int n5 = index2 + 1;
            for (int i = 0; i < n3; ++i) {
                int index4 = s.indexOf(8, n5);
                m1400 = m1400(Long.parseLong(s.substring(n5, index4), 36), 0L);
                if (i < n4) {
                    array[i] = m1400;
                }
                n5 = index4 + 1;
            }
            Class superclass = m1399;
            while (true) {
                do {
                    Method m1401 = m1404(superclass, substring, m1400, n4, array);
                    if (m1401 != null) {
                        return (Method)(Console.f8549[m1398] = m1401);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m1399;
                    while (true) {
                        Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                Method m1402 = m1405(interfaces[j], substring, m1400, n4, array);
                                if (m1402 != null) {
                                    return (Method)(Console.f8549[m1398] = m1402);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            StringBuffer sb = new StringBuffer();
                            sb.append("NoSuchMethodException in ").append(m1399.getName()).append(' ').append(m1400.getName()).append(' ').append(substring).append('(');
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
                        clazz = m1400(2158528993042726L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m1400(2158528993042726L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    public static MethodHandle m1407(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType methodType, long n, long n2) {
        char char1 = s.charAt(0);
        Field m1403 = null;
        Method m1404 = null;
        try {
            MethodHandle target;
            if (char1 == 's' || char1 == '\u00e1' || char1 == '\u00c7' || char1 == '\u00ca') {
                m1403 = m1403(n, n2);
                Class<?> declaringClass = m1403.getDeclaringClass();
                String name = m1403.getName();
                Class<?> type = m1403.getType();
                if (char1 == 's') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == '\u00e1') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == '\u00c7') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m1404 = m1406(n, n2);
                Class<?> declaringClass2 = m1404.getDeclaringClass();
                String name2 = m1404.getName();
                MethodType methodType2 = MethodType.methodType(m1404.getReturnType(), m1404.getParameterTypes());
                if (char1 == 'J') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == '¥') {
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
            sb.append(ex.getClass().getName()).append(" : ").append((m1403 != null) ? m1403.toString() : ((m1404 != null) ? m1404.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static Object m1408(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType newType, Object[] array) {
        int n = array.length - 2;
        MethodHandle m1407 = m1407(lookup, mutableCallSite, s, newType, (long)array[n], (long)array[++n]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m1407, newType));
        try {
           return m1407.asSpreader(Object[].class, array.length).invoke(array);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    
    public static CallSite m2051(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Console.m2051:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
        // Caused by: java.lang.ClassCastException
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
                    handle = ((CallSite)Console.m265(lookup, "h", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)Console.m265(lookup, "h", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
}
