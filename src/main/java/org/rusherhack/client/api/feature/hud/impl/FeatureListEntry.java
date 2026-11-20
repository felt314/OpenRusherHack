// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.hud.impl;

import org.rusherhack.core.interfaces.INamed;
import org.rusherhack.core.setting.Setting;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.MethodHandles;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import net.minecraft.text.MutableText;
import org.rusherhack.core.animation.Animation;
import net.minecraft.util.Formatting;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;

public class FeatureListEntry extends ListHudElement$ListItem
{
    public /* synthetic */ FeatureList f1843;
    public IModule f1844;
    public static long f1845;
    public static Object[] f1846;
    public static String[] f1847;
    
    public Text m4446() {
        return null;
    }
    
    public FeatureListEntry(FeatureList f1843, ListHudElement listHudElement, IModule f1844) {
        super((ListHudElement)f1843, listHudElement);
        this.f1843 = f1843;

        this.f1844 = f1844;
    }
    
    public boolean shouldRemove() {
        return false;
    }
    
    public Text getText() {
        return null;
    }
    
    static {
    }
    
    public static MatchException m285(MatchException ex) {
        return ex;
    }
    
    public static void m194() {
        Object[] f1846 = FeatureListEntry.f1846;
        f1846[0] = "Yk(\u0003\u0018hEq*_\u0002|Ura\u0454";
        f1846[1] = Integer.TYPE;
        FeatureListEntry.f1847[1] = "java/lang/Integer";
        f1846[2] = "7\u0000\u0015[AX7\u0000\u0002\u0007MW-K\u0002\u0019MB*:S@\u0014\u0002";
        f1846[3] = "0\u0018\u001d\u007f/\u0016,\u0002\u001f#5\u0002<\u0001T\u0257";
        f1846[4] = "qB+on\u0007mX)3t\u0013}[b\"p\u001b{^8o\u00dd";
        f1846[5] = "o\u007f\u007f\u001a%0dpnUX(wwg\u001c";
        f1846[6] = "u]e\u0014~ju]rHreo\u0016rVrphg#\u000f%2";
        f1846[7] = """
                   UA\u0003\u0016&\u0015UA\u0014J*\u001aO
                   \u0014T*\u000fH{B
                   ~L""";
        f1846[8] = "S*yc\u00012O0{?\u001b&_30 ";
        f1846[9] = "\fm\r{\nb\u0007b\u001c4io\u0012o\u0013_\\m\u0003|\u000fsK`";
        f1846[10] = "\u0002Zg\u0012\"K\u0002ZpN.D\u0018\u0011pP.Q\u001f`\"\u000e{";
        f1846[11] = "l\u0013J\u007f\u0014#p\tH#\u000e7`\n\u00032\t$fOL?\u000f;b\u0015D>\bxB\u000fD<\u0007\"j\u000eC";
        f1846[12] = "&Rk\f2Y:HiP(M*K\"\u03aa";
        f1846[13] = "d\u001b\u007fa=[x\u0001}='Oh\u00026,#Gn\u0007la.^bG~*.Z~\u001b}a\"Ao\u001ct*agF\u0006|:#K";
        f1846[14] = "+TVf_d7NT:Ep'M\u001f\u04c5";
        f1846[15] = "nz\u0011\u000b\u0011;r`\u0013W\u000b/bcXF\f<d&\u0005@\u0017:hf\u0011\u000b& te%@\u0017:hf\u0011";
        f1846[16] = "ThA2[\u0013HrCnA\u0007Xq\b\u007fE\u000f^tR2H\u0016R4Uy]\u0012RtA2j\tWuTOL\u0012OsH{";
        f1846[17] = "2|u%(0.fwy2$>e<h578 an.14`u%\t )z{e=";
        f1846[18] = "B\u001eHh3^I\u0011Y'RPB\u001a]}";
        f1846[19] = Boolean.TYPE;
        FeatureListEntry.f1847[19] = "java/lang/Boolean";
        f1846[20] = "`[Z\u0016Y9|AXJC-lB\u0013[D>j\u0007TV_)}O\\[N?!`sYF)k";
        f1846[21] = ":\u0010e+MJb\u001f.\u0014Q\u000fo\u001ar}Ruz\u0004$(M\u001f2K}\u0014";
        f1846[22] = "P\u0005aT7*T\ni\u0004Gw\u0004\u001cs]+ER^*\u0001v\u0012\u0010\u001f#\u0006<xXPz:~w\u001b\u000ec\u0002zx\u0013^\u0013";
        f1846[23] = "I_\u0002\u0004,\nO^\u0016T\u0016\u0233sI\u0003U*\u0011\u0019\u0001L\f\u0016";
        f1846[24] = "\u001cMf\u0001{2\u001c\f3KA\u0444'Hh\t#uXIm\u001f,N\u001c\u0012q\u0013z1\u001d\u0017g\u001cA";
        f1846[25] = "K[5*t\u0019\u0006Bz,\u0012\u0015\u001a]'7~'K\u001a{o)pJJ#3{J\u001a[}=\u0012";
        f1846[26] = "qQPR\u001cy ONU\u007f~L\u0013A\r\u0011/-T^X\u001d\u0017rBK\u0006Gv5]\u001e\n\u007f";
        f1846[27] = "\u0014FFOO\u000b\u001c]\u0005\u0004/\u0016\u0015J=\u0017J\u0014x\r\u001a\u0006MB\u0007\f\u001f\u0010By";
        f1846[28] = "\u0011*}K\u0006&\u0015%u\u001bv{E3oB\u001aI\u0011w>\u001aI\u001e\u0017/\u007f\u001e\u0006/P*e_v'M=aUN#B51%";
        f1846[29] = "rH)iwX5\t$r\fNM\b7wnY2\t2aabvR.m7\u001dwW8b\f";
        f1846[30] = "h\u0003e5\n\u001bb\u001011h\u0019\"\u0011?-\u0001\u001aX\u0004!{T\u00052Ln\"h";
        f1846[31] = ":Tgz\u001djz\u0007/zfxfJ[{\u001a~g_b\u007ff,jN|-\u0019-oXs\u0016";
        f1846[32] = "H\u0012<R@\rB\u0000aWq¬!\u0010eT\u0018R[Cz\u0007O";
        f1846[33] = "i4\u001fL\u001eG8*\u0001K}\u0463T!\nO\u0012\u00181+\u0018\u0012\u0017";
        f1846[34] = "i&\u00104\b\u001cc4M19\u01d0\u0000'@`CG{qI!T";
        f1846[35] = "(TK+_zyJU,<\u0218\u0015\u0014OcFr|YV,@\u0014";
        f1846[36] = "K\u001f4`Lp\u0006\u0006{f*|\u001a\u0019&}FNK^z%\u0012\u0019L\u0004>x\u0011fM\u0001(w*$\u001c\u0001%s\u0010t\r_+\u001a";
        f1846[37] = """
                    \u0011\u001c;!\u0016yENl/n|\u0017\u000b\u000e,
                    n\u0017w;7Qp
                    M =\u0015bz""";
        f1846[38] = "1pU\u000f\u001f\u0004aa\u000b\u0001v[agQ\u000b\u001ai5#\u0001QL>0aC\u0016\u0010W}x\f\u0010v\u0003g\u007fR\u0005LSv!\\l";
        f1846[39] = "\u0018Ly&8n\u0012^$#\t\u03beqN  `1\u000b\u001d?s7";
        f1846[40] = "AeJ'_P\u0017l\u000b0aDFp/4\u0005VFV>\u0017aRT<M&\u000b\u001a\u001beq";
        f1846[41] = "1\u0006j)kdv\u0003ph\u001b;o\u000b~~Ll6V\"\u0012$5~]j#c0d\u001c";
        f1846[42] = "<(\u0001I{\u0017=-\u0017F@\t|\u0004\u001cS<\u0019\u0007%GT'\u000fj%\u0002Z{h";
        f1846[43] = "p!>7=;!? 0^\u04c7Ml\"t2.0,q<2";
        f1846[44] = "}6<U2\u000fy94\u0005BY%>*W\u0015\rxhp\u0003B\u000e!! Kz\n.)p";
        f1846[45] = "<\"V35x60\u000b6\u0004YUx\r%hf(8^mh\u001d9w\u0010;cp92\u001eg\u0004";
        f1846[46] = "bug-\rQcpq\"6R>Ig7[T\u0012}d\"6\u00158l}tI\u0014=zrO";
        f1846[47] = "_\u000bs\u0011\b\u0015\u000f\u001a-\u001faJ\u000f\u001cw\u0015\rxX_)C_/[\u0005e\u001c\u0011\u0017_\nmLa\u0012\t\u0004t\u001b[B\u0018Zzr";
        f1846[48] = "\u000e*-CN<V%f|\u0019\u0003\u000e*-CN<V%f";
        f1846[49] = ":)\u0015Akc;,\u0003NP`f\f\n\\=fJ!\u0016NP'`0\u000f\u0018/&e&\u0000#";
    }
    
    public static Field m196(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m197(Class clazz, String s, Class clazz2) {
        Field m196 = m196(clazz, s, clazz2);
        if (m196 != null) {
            return m196;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m197 = m197(interfaces[i], s, clazz2);
                if (m197 != null) {
                    return m197;
                }
            }
        }
        return null;
    }
    
    public static Method m199(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m200(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m199 = m199(clazz, s, clazz2, n, array);
        if (m199 != null) {
            return m199;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m200 = m200(interfaces[i], s, clazz2, n, array);
                if (m200 != null) {
                    return m200;
                }
            }
        }
        return null;
    }
    
    public static CallSite m120(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/FeatureListEntry.m120:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
}
