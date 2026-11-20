// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.command;

import org.rusherhack.core.logging.ILog;
import org.rusherhack.client.api.feature.module.Module;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
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
import org.rusherhack.client.api.feature.module.IModule;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import java.nio.file.Files;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.annotations.CommandExecutor;
import java.util.Iterator;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Optional;
import java.util.Map;
import org.rusherhack.client.api.feature.command.ModuleCommand;

import org.rusherhack.client.api.feature.module.impl.render.BreadCrumbs;
public class BreadCrumbsCommand extends ModuleCommand
{
    public /* synthetic */ BreadCrumbs f8462;
    public static long f8463;
    public static String[] f8464;
    public static String[] f8465;
    public static Map f8466;
    public static Object[] f8467;
    public static String[] f8468;
    
    @CommandExecutor(subCommand = { "save" })
    @CommandExecutor$Argument({ "name" })
    public String m16236(Optional<String> child) {
        return null;
    }
    
    @CommandExecutor(subCommand = { "load" })
    @CommandExecutor$Argument({ "name" })
    public String m16237(String child) {
        return null;
    }
    
    public BreadCrumbsCommand(BreadCrumbs f8462, IModule module) {
        super(module);
        this.f8462 = f8462;

    }
    
    static {}
    
    public static Exception m672(Exception ex) {
        return ex;
    }
    
    public static String m171(byte[] array) {
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
    
    public static String m172(int n, long n2) {
        return null;
    }
    
    public static Object m173(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        String m172 = m172((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, m172), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m172;
    }
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/BreadCrumbsCommand.m174:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static int m178(long n, long n2) {
        n ^= (n2 << 48 | n2);
        int n3 = (int)(n >>> 46);
        if (BreadCrumbsCommand.f8468[n3] != null) {
            return n3;
        }
        Object o = BreadCrumbsCommand.f8467[n3];
        if (!(o instanceof String)) {
            return n3;
        }
        int n5 = switch ((int)(n >>> 42 & 0x3FL)) {
            case 0 -> 1;
            case 1 -> 58;
            case 2 -> 61;
            case 3 -> 56;
            case 4 -> 6;
            case 5 -> 24;
            case 6 -> 30;
            case 7 -> 34;
            case 8 -> 16;
            case 9 -> 23;
            case 10 -> 44;
            case 11 -> 2;
            case 12 -> 14;
            case 13 -> 54;
            case 14 -> 18;
            case 15 -> 4;
            case 16 -> 39;
            case 17 -> 41;
            case 18 -> 31;
            case 19 -> 55;
            case 20 -> 62;
            case 21 -> 47;
            case 22 -> 15;
            case 23 -> 57;
            case 24 -> 27;
            case 25 -> 17;
            case 26 -> 22;
            case 27 -> 19;
            case 28 -> 53;
            case 29 -> 43;
            case 30 -> 3;
            case 31 -> 35;
            case 32 -> 7;
            case 33 -> 60;
            case 34 -> 0;
            case 35 -> 38;
            case 36 -> 36;
            case 37 -> 51;
            case 38 -> 8;
            case 39 -> 25;
            case 40 -> 50;
            case 41 -> 46;
            case 42 -> 49;
            case 43 -> 10;
            case 44 -> 5;
            case 45 -> 52;
            case 46 -> 32;
            case 47 -> 33;
            case 48 -> 9;
            case 49 -> 12;
            case 50 -> 20;
            case 51 -> 59;
            case 52 -> 42;
            case 53 -> 48;
            case 54 -> 45;
            case 55 -> 13;
            case 56 -> 11;
            case 57 -> 37;
            case 58 -> 40;
            case 59 -> 26;
            case 60 -> 29;
            case 61 -> 28;
            case 62 -> 63;
            default -> 21;
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
        BreadCrumbsCommand.f8468[n3] = new String(charArray);
        return n3;
    }
    
    public static void m179() {
        Object[] f8467 = BreadCrumbsCommand.f8467;
        f8467[0] = "\t\u0007:%>1\u0017\u000f jY0\u0006\u0014-0\u007f6";
        f8467[1] = "Ql\"\u0000Q~Zc3O0pQh7\u0015";
        f8467[2] = "lSEQ7tg\\T\u001eJlt[]W";
        f8467[3] = Long.TYPE;
        BreadCrumbsCommand.f8468[3] = "java/lang/Long";
        f8467[4] = "5 c\u0019pZ0oS\u00112V\b3|\f;A";
        f8467[5] = Void.TYPE;
        BreadCrumbsCommand.f8468[5] = "java/lang/Void";
        f8467[6] = "?\nA\u0003<\f#\u0010C_&\u00183\u0013\b\u0267";
        f8467[7] = "\u0005Ng8n>\u0000\u0001W0,2";
        f8467[8] = Boolean.TYPE;
        BreadCrumbsCommand.f8468[8] = "java/lang/Boolean";
        f8467[9] = "_)(=x7C3*ab#S0a\u0215";
        f8467[10] = Integer.TYPE;
        BreadCrumbsCommand.f8468[10] = "java/lang/Integer";
        f8467[11] = "L8?bt)P\"=>n=@!v\u0186";
        f8467[12] = "P.HpAUL4J,[A\\7\u0001=\\RZrC1TGV2HpzlP;";
        f8467[13] = "m\nF(\u007f\u0001\u0018*M'nNy$F,j\u0014\r";
        f8467[14] = "%5%jm\u00029/'6w\u0016),l\u048d";
        f8467[15] = "e+2\u001c \u0010y10@:\u0004i2{\u00c4";
        f8467[16] = "Z\u0011<\u0001}%D\u0019&N\u001c D\u0019%\u000e2<";
        f8467[17] = "\u0001\rqNjU\n\u0002`\u0001\u0001A\b\tw[-V\u0005";
        f8467[18] = ":~S\u0006\u0006\"&dQZ\u001c66g\u001a\u0418";
        f8467[19] = "5\u001e,o\ns+\u00166 ho,\u000b";
        f8467[20] = "\u001b]]K\u0013 \u0010RL\u0004n5\u0002HNG";
        f8467[21] = "N.q\u0016*lR>sJ0xB=8[4pD8b\u00169iHxp]9mT$s\u00165vE#z]vTN2cT=";
        f8467[22] = "R* eHwN0\"9Rc^3i(UpXv+$]eT6 esNR? .H";
        f8467[23] = "}6hN_K}6\u007f\u0012SDg}\u007f\fSQ`\f-Y\u0001\u0015";
        f8467[24] = "P\bpQ\u0019.P\bg\r\u0015!JCg\u0013\u00154M21LFv";
        f8467[25] = "gx\u0017!8 lw\u0006nU$lk2%g9hw\u0002%";
        f8467[26] = "pI\u0011\u001f\f\u0001\u0005i\u001a\u0010\u001dNxq\t\u0017\u0014\u0007\u0010";
        f8467[27] = "\u001eo@QGu\u0015`Q\u001e-v\u0001lZU";
        f8467[28] = Double.TYPE;
        BreadCrumbsCommand.f8468[28] = "java/lang/Double";
        f8467[29] = "\u000019\u0002\tm\u0003?a\u0005No\u000f~\u001f\u0002Sk";
        f8467[30] = "twuX\u001fxwy-_Xz{8EP]sm";
        f8467[31] = "\u0013wS\u001ai/\u0012r\u000fzl)\u0004m?\b5uJ{DC2.t";
        f8467[32] = "!V;#R*'M<)67qJx(q'\u0018\u0014l8\u0007xuG; JI!V;#R*'M<)6";
        f8467[33] = "p\u001b\b\u0000~Ue\u001b\u0006\u0006\u0001\u0005p\u001bw\t>]\"\u001d\fB9\f\u001cIG\u0016;]&K\u000bK:l";
        f8467[34] = "\u001a)n\u001fH2Dp0\u0011:'E'.\u0000:wS.eQQw\u001a>mm";
        f8467[35] = "-[}0k=.\u000f#,\r\u03a6\u0011\u000eeqkir\b~va\r(O#)in.T$#\r";
        f8467[36] = "/Xy\u001b\u0014{8\u0011-\u0013fs!\u0004%\u00151'}PqAf}|\rz\u001d\u0018cy\u0000!";
        f8467[37] = "8E\u0019>\u0004ikDYa;o~X\n&VBiJ-;_i\u0004\u000bS7\u00015>\t\u001fj\u0000\u0004";
        f8467[38] = "U1w~\u000bnS*ptof\u000b/5q\u000ek\u0017I)h\n1Vtqf\fclwyuU<Vu5(T\r";
        f8467[39] = "\u000378'\u001fs_0y\"|\u0576=lxrA)W68mM\u0016";
        f8467[40] = "`%zpd\u001bkaj-\u001e\u0561P&}pxN3 fwr*";
        f8467[41] = "bE$Ne[>BeK\u0006\u0267\\\u001ed\u001b;\u00016D$\u00047>";
        f8467[42] = "ml*\u001dZ\r>(x\u0019([}[r\u0005E<u)'@BG>.v~Z\u00036(|\u0005\u0011\u0004g\u0016";
        f8467[43] = "0\fm-\n0/\t.;j&8\f/.&9,\u001c0.jg)H2'\ta2O8C\b<<\u0010.;\u00037m\u0010T";
        f8467[44] = "l\u0004e\nbR?\u0005%U]C7,v\u0012=?3\u0019 \u0007dY0M\"\u0003]";
        f8467[45] = "U`_r\u00003B)\u000bzr;[<\u0003|%o\u0007hW)r5\u00065\\t\f+\u00038\u0007";
        f8467[46] = "pjuEF\t.3+K4\b1b2Z4N3=(SWH(:\"7\u000f\u0005%3r\\\u000fL5;N";
        f8467[47] = "oa\u0001Mj\riv\u0007M\u000bQci\twfMku\rPlO\u00026\u001c\u0012mQa0\u0007\u0015g5";
        f8467[48] = "#G1\u00119\u001dpFqN\u0006\u0015|[*\u000f}p!\u0007&O7J#K{N\u0006";
        f8467[49] = ".Cq+}`9\u001fi\"M\u01f6GMze6n~Xzk0";
        f8467[50] = "\b\u0019@&qs\u000e\u0002G,\u0015kI\u0005\u001f<\u0015)I_\u0018$v/RX\u0012@tv\u0000\u0013\u0015!u(\f\n~";
        f8467[51] = "\nnv>L\"\u00043d;q(@pm q|B4l>\u0012zY3fZ@*Ajq.I+Hs\na\u0003+\n6aaJ;\u0002\n";
        f8467[52] = "\f5\u0007N3W\u0018e\u000f\u0015]\u02cfe7\u000e\u0014lY\u0014 R\fe";
        f8467[53] = ";TF+9@hU\u0006t\u0006@wEG3}-9\u0014Qu7\u0017;X\ft\u0006";
        f8467[54] = "K\u0000@DLW_PH\u001f\"\u0000\"\u0000\u0014\u001f\u001c\fS\u0014\u0011ILiITMGG\u0018]Q\u001b\u0017\"";
        f8467[55] = "k(ekF)8!a`x\u0411\u0007)f5\u001erd/}2\u0014\u0016>h m\u001cu8s'gx";
        f8467[56] = "\u0007\u0017v&L\u000f\u0012\u0017x 3W\u0017\u0016s4OQ\u0011{n;_V\b\u0010o>\u00036";
        f8467[57] = "[*\u0004D_%LcPL--UvXJzy\t\"\u0003\u0017-#\b\u007f\u0007BS=\rr\\";
        f8467[58] = "V,)N\u0018p\buw@j`\t8i\\j5\u001f+\"\u0000\u00015V;*<";
        f8467[59] = """
                    	\u001c,s~m\rJ\u007f$\u0001`
                    PQ{n`
                    V\u0015r\u007fvV]qd:\u007f
                    ,""";
        f8467[60] = "\u001b g\u0016H#\u001a%;vK!\u0007\u0000f\u0006WHBvfL\u001ar@:;M+";
        f8467[61] = "AgR \u0017>V;J)'\u04a5(9EkCpEjD+\u001c";
        f8467[62] = "M#XId\nK4^I\u0005Y]7GEcN|,XE@SD)\\S\u0005\bI0\f\u0019h[\u001e(A(";
        f8467[63] = """
                    '`r;
                    \u0018;$.7q[.3"\u0017\u0015E\u0007;(3
                    ! 7q7HG#cs3qM/%5!HX/+3^""";
    }
    
    public static Class m180(long n, long n2) {
        int m178 = m178(n, n2);
        Object o = BreadCrumbsCommand.f8467[m178];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(BreadCrumbsCommand.f8468[m178]);
                BreadCrumbsCommand.f8467[m178] = forName;
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
    
    public static Field m181(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m182(Class clazz, String s, Class clazz2) {
        Field m181 = m181(clazz, s, clazz2);
        if (m181 != null) {
            return m181;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m182 = m182(interfaces[i], s, clazz2);
                if (m182 != null) {
                    return m182;
                }
            }
        }
        return null;
    }
    
    public static Field m183(long n, long n2) {
        int m178 = m178(n, n2);
        Object o = BreadCrumbsCommand.f8467[m178];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        String s = BreadCrumbsCommand.f8468[m178];
        int index = s.indexOf(8);
        Class m179 = m180(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        String substring = s.substring(index, index2);
        ++index2;
        Class m180 = m180(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m179;
        while (true) {
            Field m181 = m181(clazz, substring, m180);
            if (m181 != null) {
                return (Field)(BreadCrumbsCommand.f8467[m178] = m181);
            }
            Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    Field m182 = m182(interfaces[i], substring, m180);
                    if (m182 != null) {
                        return (Field)(BreadCrumbsCommand.f8467[m178] = m182);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m179.getName()).append(' ').append(m180.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m180(99307369531169L, 0L);
        }
    }
    
    public static Method m184(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m185(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m184 = m184(clazz, s, clazz2, n, array);
        if (m184 != null) {
            return m184;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m185 = m185(interfaces[i], s, clazz2, n, array);
                if (m185 != null) {
                    return m185;
                }
            }
        }
        return null;
    }
    
    public static Method m186(long n, long n2) {
        int m178 = m178(n, n2);
        Object o = BreadCrumbsCommand.f8467[m178];
        if (o instanceof String) {
            String s = BreadCrumbsCommand.f8468[m178];
            int index = s.indexOf(8);
            Class m179 = m180(Long.parseLong(s.substring(0, index), 36), 0L);
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
            Class m180 = null;
            int n5 = index2 + 1;
            for (int i = 0; i < n3; ++i) {
                int index4 = s.indexOf(8, n5);
                m180 = m180(Long.parseLong(s.substring(n5, index4), 36), 0L);
                if (i < n4) {
                    array[i] = m180;
                }
                n5 = index4 + 1;
            }
            Class superclass = m179;
            while (true) {
                do {
                    Method m181 = m184(superclass, substring, m180, n4, array);
                    if (m181 != null) {
                        return (Method)(BreadCrumbsCommand.f8467[m178] = m181);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m179;
                    while (true) {
                        Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                Method m182 = m185(interfaces[j], substring, m180, n4, array);
                                if (m182 != null) {
                                    return (Method)(BreadCrumbsCommand.f8467[m178] = m182);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            StringBuffer sb = new StringBuffer();
                            sb.append("NoSuchMethodException in ").append(m179.getName()).append(' ').append(m180.getName()).append(' ').append(substring).append('(');
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
                        clazz = m180(99307369531169L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m180(99307369531169L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    public static MethodHandle m187(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType methodType, long n, long n2) {
        char char1 = s.charAt(0);
        Field m183 = null;
        Method m184 = null;
        try {
            MethodHandle target;
            if (char1 == '\u00dc' || char1 == 'I' || char1 == 'c' || char1 == '\u00f5') {
                m183 = m183(n, n2);
                Class<?> declaringClass = m183.getDeclaringClass();
                String name = m183.getName();
                Class<?> type = m183.getType();
                if (char1 == '\u00dc') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == 'I') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == 'c') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m184 = m186(n, n2);
                Class<?> declaringClass2 = m184.getDeclaringClass();
                String name2 = m184.getName();
                MethodType methodType2 = MethodType.methodType(m184.getReturnType(), m184.getParameterTypes());
                if (char1 == 'Z') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == '\u00e2') {
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
            sb.append(ex.getClass().getName()).append(" : ").append((m183 != null) ? m183.toString() : ((m184 != null) ? m184.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static Object m188(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType newType, Object[] array) {
        int n = array.length - 2;
        MethodHandle m187 = m187(lookup, mutableCallSite, s, newType, (long)array[n], (long)array[++n]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m187, newType));
        try {
           return m187.asSpreader(Object[].class, array.length).invoke(array);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    
    public static CallSite m177(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/BreadCrumbsCommand.m177:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
