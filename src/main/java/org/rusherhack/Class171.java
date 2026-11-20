// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import java.lang.reflect.UndeclaredThrowableException;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.io.File;

public class Class171
{
   public static java.io.File f3386;
   public static boolean f3388;
    public static File f3385;
    public static Map<String, String> f3387;
    public static File f3389;
    public static Map<String, String> f3390;
    public static List<Runnable> f3391;
    public static Map<String, String> f3392;
    public static long f3393;
    public static String[] f3394;
    public static String[] f3395;
    public static Map f3396;
    public static long f3397;
    public static Object[] f3398;
    public static String[] f3399;
    
    public static void m7162() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          44128423598340
        //     6: lxor           
        //     7: lstore_0       
        //     8: ldc2_w          6816283413087891565
        //    11: lload_0        
        //    12: invokedynamic   BootstrapMethod #0, u:(JJ)Ljava/util/Map;
        //    17: ldc2_w          6818267217762785350
        //    20: lload_0        
        //    21: invokedynamic   BootstrapMethod #0, \u00c2:(Ljava/lang/Object;JJ)V
        //    26: ldc2_w          6809959568639715497
        //    29: lload_0        
        //    30: invokedynamic   BootstrapMethod #0, u:(JJ)Ljava/util/Map;
        //    35: ldc2_w          6818267217762785350
        //    38: lload_0        
        //    39: invokedynamic   BootstrapMethod #0, \u00c2:(Ljava/lang/Object;JJ)V
        //    44: ldc2_w          6817768929935498375
        //    47: lload_0        
        //    48: invokedynamic   BootstrapMethod #0, u:(JJ)Ljava/util/Map;
        //    53: ldc2_w          6818267217762785350
        //    56: lload_0        
        //    57: invokedynamic   BootstrapMethod #0, \u00c2:(Ljava/lang/Object;JJ)V
        //    62: iconst_0       
        //    63: ldc2_w          6817983344058525434
        //    66: lload_0        
        //    67: invokedynamic   BootstrapMethod #0, \u00e7:(ZJJ)V
        //    72: ldc2_w          6809664109996647333
        //    75: lload_0        
        //    76: invokedynamic   BootstrapMethod #0, u:(JJ)Ljava/io/File;
        //    81: ldc2_w          6818055421926871353
        //    84: lload_0        
        //    85: invokedynamic   BootstrapMethod #0, \u00c2:(Ljava/lang/Object;JJ)Z
        //    90: ldc2_w          6809500151241049375
        //    93: lload_0        
        //    94: invokedynamic   BootstrapMethod #0, u:(JJ)Lnet.minecraft.GameVersion;
        //    99: ldc2_w          6816377078300502704
        //   102: lload_0        
        //   103: invokedynamic   BootstrapMethod #0, \u00c2:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   108: astore_2       
        //   109: new             Ljava/io/File;
        //   112: dup            
        //   113: ldc2_w          6809664109996647333
        //   116: lload_0        
        //   117: invokedynamic   BootstrapMethod #0, u:(JJ)Ljava/io/File;
        //   122: aload_2        
        //   123: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   126: dup            
        //   127: astore_3       
        //   128: ldc2_w          6818055421926871353
        //   131: lload_0        
        //   132: invokedynamic   BootstrapMethod #0, \u00c2:(Ljava/lang/Object;JJ)Z
        //   137: sipush          5278
        //   140: ldc2_w          776258497111622904
        //   143: lload_0        
        //   144: lxor           
        //   145: invokedynamic   BootstrapMethod #1, j:(IJ)Ljava/lang/String;
        //   150: ldc2_w          6817480751656776955
        //   153: lload_0        
        //   154: invokedynamic   BootstrapMethod #0, x:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   159: pop            
        //   160: new             Ljava/io/File;
        //   163: dup            
        //   164: aload_3        
        //   165: sipush          311
        //   168: ldc2_w          195620896421777757
        //   171: lload_0        
        //   172: lxor           
        //   173: invokedynamic   BootstrapMethod #1, j:(IJ)Ljava/lang/String;
        //   178: ldc2_w          6809906983879979403
        //   181: lload_0        
        //   182: invokedynamic   BootstrapMethod #0, x:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   187: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   190: ldc2_w          6810362224832996735
        //   193: lload_0        
        //   194: invokedynamic   BootstrapMethod #0, \u00e7:(Ljava/io/File;JJ)V
        //   199: pop2           
        //   200: aload_2        
        //   201: invokedynamic   BootstrapMethod #2, run:(Ljava/lang/String;)Ljava/lang/Runnable;
        //   206: ldc2_w          6809620411623670251
        //   209: lload_0        
        //   210: invokedynamic   BootstrapMethod #0, x:(Ljava/lang/Object;JJ)Ljava/util/concurrent/Future;
        //   215: pop            
        //   216: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0771 (coming from #0765).
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2239)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.ast.AstOptimizer.InlineLambdasOptimization.tryInlineLambda(AstOptimizer.java:3622)
        //     at com.strobel.decompiler.ast.AstOptimizer.InlineLambdasOptimization.run(AstOptimizer.java:3510)
        //     at com.strobel.decompiler.ast.AstOptimizer.runOptimization(AstOptimizer.java:3899)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:220)
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
    
    static {
   }
    
    public static void m7164(Runnable runnable) {
        long n = Class171.f3393 ^ 0x700ACDAB44BDL;
        int n2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_9.invoke(4837264558373696817L, n);
        boolean b = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_10.invoke(4838853447955217219L, n);
        if (n2 != 0) {
            if (b) {
                /* invokedynamic(!) */ProcyonInvokeDynamicHelper_11.invoke(runnable, 4837321984840781000L, n);
                return;
            }
            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_13.invoke(ProcyonInvokeDynamicHelper_12.invoke(4838274407514584496L, n), runnable, 4837081970698221876L, n);
        }
    }
    
    public static String m117(byte[] array) {
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
    
    public static CallSite m120(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class171.m120:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static void m122() {
        Object[] f3398 = Class171.f3398;
        f3398[0] = "\u001cXT?F.\u0000BVc\\:\u0010A\u001d\u017c";
        f3398[1] = "3\r7@QU-\u0005-\u000f2A)";
        f3398[2] = """
                   c\u0010':\u001a\u001a\u007f
                   %f\u0000\u000eo	nw\u0004\u0006i\f4:	\u001feL5}F\u0018e\f${\u001fA[\u000b.p\u0007\u0018O\r.`\r\u0001x*!z\f\u0003i\u0010\u0002u\u001b
                   """;
        f3398[3] = "9\u007fL}P\u00152p]2-\r!wT{";
        f3398[4] = "I,r`<8I,e<07Sge\"0\"T\u00160zih";
        f3398[5] = "PN y\u0017IU\u0001\u0010qUE";
        f3398[6] = Void.TYPE;
        Class171.f3399[6] = "java/lang/Void";
        f3398[7] = "\u001b\t88zb\u0007\u0013:d`v\u0017\u0010q\u0210";
        f3398[8] = "Yk1\u001dn@Yk&AbOC &_bZDQv\u0004:\u001e";
        f3398[9] = ">Gx=\u001e\u0003\"]za\u0004\u00172^1\u0522";
        f3398[10] = "\u0005nA\n/}\u000eaPESd\u0001aV\tmt";
        f3398[11] = "m`)p`-sh3?-7ib*c<=iuqW;,rs:";
        f3398[12] = Boolean.TYPE;
        Class171.f3399[12] = "java/lang/Boolean";
        f3398[13] = "\u0004\u000b'yT!\u001a\u0003=63 \u000b\u00180l\u0015&";
        f3398[14] = "b^\u001c\u0012qXiQ\r]\u0010VbZ\t\u0007";
        f3398[15] = "\u001c}\u000bEGb\u0000g\t\u0019]v\u0010dB\u0100";
        f3398[16] = "X\u0001t\t\u0000XD\u001bvU\u001aLT\u0018=D\u001d_R]\u007fH\u0015J^\u001dt\t>BP\u0014vU";
        f3398[17] = "^\u0010\u001dQh\fQ\u0005EX2\u0016D_#D2\u0012f\u0014\u001aE#\u0011@U)E/\u000eP\u0014\u0019";
        f3398[18] = "+pkcOz$e3j\u0015`1?Uv\u0015d\u0013tlw\u0004g5";
        f3398[19] = Integer.TYPE;
        Class171.f3399[19] = "java/lang/Integer";
        f3398[20] = "@\u0017R27\u0012O\u0002\n\u0006K5";
        f3398[21] = "ik\u0007RFaf~_[\u001c{s$9G\u001c\u007f@f\u0018V\u0006{";
        f3398[22] = "5O%\u000fi\u00020\u0000\u001a\u00007\u001e+}'\u001c\"\n2";
        f3398[23] = "o@";
        f3398[24] = "oEIm~\u0012dJX\"\u0015\u0006fAOx9\u0011k";
        f3398[25] = "c=m\f~Sl(58\u0002q";
        f3398[26] = "3IW^'i/SU\u0002=}?P\u001e\u0013:n9\u0015\\\u001f2{5UW^\u001cP3\\";
        f3398[27] = "-'\u0013+nwX\u0007\u0018$\u007f89\t\u0013/{bM";
        f3398[28] = ")2fl/\u00157:|#M\t0'";
        f3398[29] = "d\u0016W\u001c\nD\u00116\\\u0013\u001b\u000bp8W\u0018\u001fQ\u0004";
        f3398[30] = ":Is\u001f\u0002/&SqC\u0018;6P:\u0401";
        f3398[31] = "(KRQX^-\u0004fE\u0010Q'XAT.R#NAB";
        f3398[32] = "c\u001aN\u0004#.\u007f\u0000LX9:o\u0003\u0007\u00f0";
        f3398[33] = "\u0018sVnF8\u0017f\u000eg\u001c\"\u0002<h{\u001c& wS\u007f\u00078\u0001w\u0004M\u00072\u000bZAa\f:\u0017`S";
        f3398[34] = "P\u001a\t5\u001df_\u000fQ<G|JU7 Gxh\u001e\f$\\fI\u001e[\u0016\\lC3\u001e:Wd_\t";
        f3398[35] = "\u0001B:\u000f\u0010w\u0004\r\n\u0007R{$V8\u001eKj8W>\u000b_s";
        f3398[36] = "\u001fw";
        f3398[37] = "}\u001fn\u001eixr\n6\u00173bgPP\u000b3fE\u001bk\u000f(xd\u001b";
        f3398[38] = "<`cV,\b za\n6\u001c0y*\u03e0";
        f3398[39] = "8ZX\u0002T;`Z\u0019Wd#dJ^i\r|{FMQU}1\u0007\"";
        f3398[40] = "h,[KA\u007fqyJ\u000b0\u03d6\u0012/B\u001eT?x/C\u0000K";
        f3398[41] = "\"\u0017\u0014GiT0Y\u001e]XGK\f\u001fGiI V\u001f\\;";
        f3398[42] = "\"/1\u0001\u0002t&qqRyz,$AR@a<'y\nA+}HqX\b#.p?\u0000Hx@";
        f3398[43] = "\u0018~s.Hb\u001cr5~,8\u000ep(/,>O r O/\u0017x,C";
        f3398[44] = "\u007fajoX5y|wu%\u0534B`ujBd&4{)ZT";
        f3398[45] = "_lNLg\u001f\u0000bZ5\u0447|\u0018,\u001aY#\u0010Z)H";
        f3398[46] = "m\u0017_PT\u000b+XUI%\u0005;[\u0004^I7j\u0017\\\u0000\u0014`l@\u000e\u0003U\u001c:^T\b%";
        f3398[47] = "=\u0010^\u0015|(x\u001cWV\u0011.\u007f\u00191R.*l\r\bSa9}\u007f";
        f3398[48] = "\u001dn\u0012\u0010\u0006\u0000\f6JNe\u0005\u001c-iS\u0004\u0007\u001d?Y.\bS\u0011(GC^\u0018\r)#E\n\\\u001c6\u0013A\u0006\u001aLR";
        f3398[49] = "%(.#/Cg-|O<K5?mOk\u0010&8evj_5)\u0017";
        f3398[50] = "\u0010(0:d0\u0004\"|r\u001d,\u0013m\u0002va25v#g{6~|xx-3\u0004hr4eJ";
        f3398[51] = """
                    \u0007X9\u000fJQ\u0013\u0003&
                    (R\u0004[/pPLR
                    2OKE\b\u000eC\u001cLW\u000e\u0002'HB\u0014\u00162""";
        f3398[52] = "7D$-B\u0001hJ0T\u0017bb\u0001;*\u0006\u00054\nu%~\rv\b7,\u0019[}F8T";
        f3398[53] = ",8TWn8s6@.\u02ff[&eH\u001e<ch=\bE";
        f3398[54] = "\b }hH\u0019\b!cwx\u0016P<sv\u0003s\u00033c<\u0016KMk#gx";
        f3398[55] = "\u0002$\u0018z=D\u00137Y:\r\u0006\u0005\u001ar\u000b\r\u0017R'R.`A\u0019;SJ";
        f3398[56] = "9]lk\u000b!)\u00179?s`1\u0017o\u0000Ix2Wy|\u001ffh\\\tc\u001fe*\u0016kiOd3m5?\rq*T4p\u001e`X";
        f3398[57] = "!\u007fFWzj~qR.\u03ff\t 1DJvc 0ZU";
        f3398[58] = "qF\u0004QGh.H\u0010(\u03bb\u000b6\u0006PD\u0003gt\u0003\u0002";
        f3398[59] = "\u001ep*=yw\u001a|lm\u001d'\u0018vy=gGOx\u007fjm;\u0019f%a\u001d}\u0012u/ a+\f/$Pv(Jrq`r$\f\"\u0015";
        f3398[60] = "\tY@\r\u0002\u0014SY[_g\u0012\u0019GCFgE\u0004W\u001eL\u001b\u0013\u001a\r\u0015<[@\u001dSV\u0005Z\u000f\u000eB$";
        f3398[61] = "\u0018V\u0012&\u000b\u0007GX\u0006_\u0266d@\u000f\u000feL\u0003DQO6";
        f3398[62] = "j6<RnG*49Z\u0017\u0017Sw2\\-K/!,\u0006&;i*?\fgG?4e\u0007\u0017";
        f3398[63] = "n`C\nT0~*\u0016^,cu*A\u001b,4h:\u001c\u0011Pbv`\u0017aObu\"]\u0003E2t;&]\u0013pa\"\u001f\\\\cpP";
        f3398[64] = "5MlrMu5Lrm}r~\\xj\u0006\u001f>^r&\u0013'p\u00062}}";
        f3398[65] = "\u0014\u0013\u0002\u0001a!K\u001d\u0016x\u03fbB\u0015]\u0000\u001cm(\u0015\\\u001e\u0003";
        f3398[66] = "\u001a|9\u0004\u001aH\u001c?c^e\u03c3~'/\u0005\u000f^C~d]\u0005.\u001b;;\u000e\u001e^E\"3\re\u0012A=3\u0010\\\u0013\u000e.\"b";
        f3398[67] = "O\u0015}-=\u0011KK=~F\u0017Q\u001fw~:\u0011Wr<w<\u001d\u001d\fdw}H-";
        f3398[68] = "(>*E\u000f+.d,L3( E2^N3\u0015x.KZ*Nck\u0017P*u5/@\nO";
        f3398[69] = "\u00167`u\u0005R\r>b4}X\u00154`b}\u000fN-u}D\u000e\u0001>d\u000f";
        f3398[70] = """
                    \u0012T~\u001a~\u0012	]|[\u0006\f\u000fQy\r\u0006\u000b\u0011\u000b=\u00119\u0010\u0018Q9`j\u0017
                    W5\u0004>\u0019IO\u0005\fb\f\u0012\u0000aXlO
                    09_x\u001d\u0007	8\u0010k\fu""";
        f3398[71] = "HL%X!v\\Fi\u0010XwK\u0010;h40\u0017H4\u000b%hO\u0016W\u000fg=E\u0013lY#j\u001fv.\u0001 tAM>\u000e=t&";
        f3398[72] = "xXn$_\u0018!\u00136./NxMr#/\u0019#Tg<\u0016\u0018lGvN";
        f3398[73] = "w\u001d^\u0001\u007f\u0018g\u0012C\u0001\u0018Ii\u0018Wyq\u001a|\bIA)\u001b6I&";
        f3398[74] = "l\u0013\u0001k[\u0001j\u000e\u001cq&\u039bQD\u001d{\u001c\u0010-\u0012\u0003!\u0017`k\u0019\u0010+V\u001c=\u0007J &";
        f3398[75] = "h\u0018P\u001c\u000bf7\u0016De\u04aa\u0005/X\u0004\tOim]V";
        f3398[76] = "+4+33\u0019(2v=\u0003\u0006w!#-TR+w~p\u0003S&w.0h\u0015i}7";
        f3398[77] = "Q\u0013ht\u00134\t\u0013)!#*\t\bTrS6`Cqn\u0013$X\r).HJ";
        f3398[78] = "\rO&K`GIU*L\u000b\u00eb3\rtApXOHxH35\u0003\u0002dMn\\XN\"K\u000b";
        f3398[79] = "\u0006\u0012!4t\u0017Y\u001c5M\u02e3t\u0007\\#)x\u001e\u0007]=6";
        f3398[80] = "7#@`\u0015W#x_ewE=.Arw\u0012f7TmN\u0013)$E\u001f";
    }
    
    public static Field m124(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m125(Class clazz, String s, Class clazz2) {
        Field m124 = m124(clazz, s, clazz2);
        if (m124 != null) {
            return m124;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m125 = m125(interfaces[i], s, clazz2);
                if (m125 != null) {
                    return m125;
                }
            }
        }
        return null;
    }
    
    public static Method m127(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m128(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m127 = m127(clazz, s, clazz2, n, array);
        if (m127 != null) {
            return m127;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m128 = m128(interfaces[i], s, clazz2, n, array);
                if (m128 != null) {
                    return m128;
                }
            }
        }
        return null;
    }
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class171.m132:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
                    handle = ((CallSite)Class171.m132(lookup, "u", MethodType.methodType(File.class, long.class, long.class))).dynamicInvoker();
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
        
        public static File invoke(long p0, long p1) {
            try {
                return (File) ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Class171.m120(lookup, "j", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        public static String invoke(int p0, long p1) {
            try {
                return (String) ProcyonInvokeDynamicHelper_2.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Class171.m132(lookup, "x", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static String invoke(Object p0, long p1, long p2) {
            try {
                return (String) ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class171.m132(lookup, "u", MethodType.methodType(File.class, long.class, long.class))).dynamicInvoker();
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
        
        public static File invoke(long p0, long p1) {
            try {
                return (File) ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Class171.m120(lookup, "j", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        public static String invoke(int p0, long p1) {
            try {
                return (String) ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Class171.m132(lookup, "x", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static String invoke(Object p0, long p1, long p2) {
            try {
                return (String) ProcyonInvokeDynamicHelper_6.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class171.m132(lookup, "\u00e7", MethodType.methodType(void.class, File.class, long.class, long.class))).dynamicInvoker();
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
        
        public static void invoke(File p0, long p1, long p2) {
            try {
                ProcyonInvokeDynamicHelper_7.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class171.m132(lookup, "\u00e7", MethodType.methodType(void.class, boolean.class, long.class, long.class))).dynamicInvoker();
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
        
        public static void invoke(boolean p0, long p1, long p2) {
            try {
                ProcyonInvokeDynamicHelper_8.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class171.m132(lookup, "x", MethodType.methodType(int.class, long.class, long.class))).dynamicInvoker();
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
        
        public static int invoke(long p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_9.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Class171.m132(lookup, "u", MethodType.methodType(boolean.class, long.class, long.class))).dynamicInvoker();
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
        
        public static boolean invoke(long p0, long p1) {
            try {
                return (boolean) ProcyonInvokeDynamicHelper_10.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Class171.m132(lookup, "\u00c2", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static void invoke(Object p0, long p1, long p2) {
            try {
                ProcyonInvokeDynamicHelper_11.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class171.m132(lookup, "u", MethodType.methodType(List.class, long.class, long.class))).dynamicInvoker();
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
        
        public static List invoke(long p0, long p1) {
            try {
                return (List) ProcyonInvokeDynamicHelper_12.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Class171.m132(lookup, "\u00c2", MethodType.methodType(boolean.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static boolean invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (boolean) ProcyonInvokeDynamicHelper_13.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
