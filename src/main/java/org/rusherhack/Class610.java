// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import org.rusherhack.core.logging.Logger;
import org.rusherhack.core.event.EventBus;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Set;
import java.lang.reflect.UndeclaredThrowableException;
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
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import org.rusherhack.core.event.subscribe.Subscribe;
import java.io.IOException;
import java.util.Map;
import java.io.File;
import org.rusherhack.client.api.plugin.IPlugin;
import java.util.HashMap;

import org.rusherhack.client.api.feature.hud.impl.IP;
public class Class610
{
    public HashMap<Class218, IPlugin> f9627;
    public HashMap<Class286, IPlugin> f9628;
    public static boolean f9629;
    public static File f9630;
    public HashMap<String, IPlugin> f9631;
    public static long f9632;
    public static String[] f9633;
    public static String[] f9634;
    public static Map f9635;
    public static Object[] f9636;
    public static String[] f9637;
    
    public Class286 m18454(IPlugin plugin) {
        return null;
    }
    
    public Class610() {
        long n = Class610.f9632 ^ 0x4503D61CF05DL;
        this.f9627 = new HashMap<Class218, IPlugin>();
        this.f9628 = new HashMap<Class286, IPlugin>();
        this.f9631 = new HashMap<String, IPlugin>();
        if (/* invokedynamic(!) */ProcyonInvokeDynamicHelper_10.invoke(3299437775051198974L, n)) {
            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_12.invoke(ProcyonInvokeDynamicHelper_11.invoke(3300756899006043809L, n), this, 3301425362864861536L, n);
        }
    }
    
    @Subscribe
    public void m18456(Class432 obf432) {
        
    }
    
    public void m18457() {
        long n = Class610.f9632 ^ 0x4D45BD23D149L;
        int n2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_21.invoke(925681154799183846L, n);
        boolean b = false;
        Label_0069: {
            Label_0060: {
                try {
                    b = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_23.invoke(ProcyonInvokeDynamicHelper_22.invoke(920368002683481606L, n), 920351557310967440L, n);
                    if (n2 == 0) {
                        break Label_0069;
                    }
                    if (b) {
                        break Label_0060;
                    }
                }
                catch (Throwable t) {

                }
                return;
            }
            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_25.invoke(927175733092135146L, n);
        }
        if (!b) {
            return;
        }
        File[] array;
        int length = (array = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_27.invoke(ProcyonInvokeDynamicHelper_26.invoke(920368002683481606L, n), 926416753263064426L, n)).length;
        int n3;
        int i = n3 = 0;
    Label_0434:
        while (true) {
            while (i < length) {
                File file = array[n3];
                Label_0163: {
                    Label_0146: {
                        try {
                            Class610 obf610 = this;
                            if (n2 == 0) {
                                break Label_0434;
                            }
                            File file2 = file;
                            long n4 = 926654503421258080L;
                            long n5 = n;
                            boolean b2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_28.invoke(this, file2, n4, n5);
                            if (!b2) {
                                break Label_0146;
                            }
                            break Label_0163;
                        }
                        catch (Throwable t2) {

                        }
                        try {
                            File file2 = file;
                            long n4 = 926654503421258080L;
                            long n5 = n;
                            boolean b2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_30.invoke(this, file2, n4, n5);
                            if (!b2) {
                                if (n2 != 0) {
                                    break Label_0163;
                                }
                            }
                        }
                        catch (Throwable t3) {

                        }
                    }
                    try {
                        Class218 obf611 = new Class218(file);
                        try {
                            Class286 obf612 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_32.invoke(obf611, 919970268766561402L, n);
                            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_34.invoke(ProcyonInvokeDynamicHelper_33.invoke(this, 920071244712503590L, n), obf612, null, 920880726358109085L, n);
                            IPlugin plugin = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_35.invoke(obf611, obf612, 919513124280048417L, n);
                            Label_0326: {
                                Label_0245: {
                                    try {
                                        if (n2 == 0) {
                                            break Label_0326;
                                        }
                                        IPlugin plugin2 = plugin;
                                        if (plugin2 != null) {
                                            break Label_0245;
                                        }
                                        break Label_0245;
                                    }
                                    catch (Throwable t4) {

                                    }
                                    try {
                                        IPlugin plugin2 = plugin;
                                        if (plugin2 != null) {
                                            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_38.invoke(ProcyonInvokeDynamicHelper_37.invoke(this, 926950198298759205L, n), obf611, plugin, 920880726358109085L, n);
                                            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_40.invoke(ProcyonInvokeDynamicHelper_39.invoke(this, 920071244712503590L, n), obf612, plugin, 920880726358109085L, n);
                                        }
                                    }
                                    catch (Throwable t5) {

                                    }
                                }
                                /* invokedynamic(!) */ProcyonInvokeDynamicHelper_42.invoke(obf611, 926814229364135667L, n);
                                /* invokedynamic(!) */ProcyonInvokeDynamicHelper_43.invoke(obf611, 926814229364135667L, n);
                            }
                        }
                        catch (Throwable t6) {
                            Throwable t7;
                            try {
                                /* invokedynamic(!) */ProcyonInvokeDynamicHelper_44.invoke(obf611, 926814229364135667L, n);
                                t7 = t6;
                                if (n2 == 0) {}
                            }
                            catch (Throwable t8) {
                                /* invokedynamic(!) */ProcyonInvokeDynamicHelper_45.invoke(t7 = t6, t8, 920556187634949681L, n);
                            }
                            t7.printStackTrace();
                        }
                    }
                    catch (Exception ex) {
                        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_49.invoke(ProcyonInvokeDynamicHelper_46.invoke(925626195858601325L, n), "" + /* invokedynamic(!) */ProcyonInvokeDynamicHelper_47.invoke(7418, 0x4B33138069DB580FL ^ n) + /* invokedynamic(!) */ProcyonInvokeDynamicHelper_48.invoke(file, 926519871058294636L, n), new Object[] { ex }, 920122919987903765L, n);
                    }
                }
                i = ++n3;
                Class610 obf610 = null;
                Iterator iterator2;
                Iterator iterator = iterator2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_52.invoke(ProcyonInvokeDynamicHelper_51.invoke(ProcyonInvokeDynamicHelper_50.invoke(obf610, 926950198298759205L, n), 926044240394857652L, n), 925895292736980779L, n);
                while (/* invokedynamic(!) */ProcyonInvokeDynamicHelper_53.invoke(iterator, 920686347077620549L, n)) {
                    IPlugin plugin3 = (IPlugin)/* invokedynamic(!) */ProcyonInvokeDynamicHelper_54.invoke(iterator2, 920954319680214728L, n);
                    iterator = iterator2;
                    /* invokedynamic(!) */ProcyonInvokeDynamicHelper_55.invoke(this, plugin3, 919889157474471803L, n);
                }
                return;
            }
            Class610 obf610 = this;
            continue Label_0434;
        }
    }
    
    public Collection<IPlugin> m18458() {
        long n = Class610.f9632 ^ 0x7BF8A0265E51L;
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_57.invoke(ProcyonInvokeDynamicHelper_56.invoke(this, -8951741029303263427L, n), -8952647081595657300L, n);
    }
    
    public Collection<IPlugin> m18460() {
        long n = Class610.f9632 ^ 0x2DAF06DA84B1L;
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_65.invoke(ProcyonInvokeDynamicHelper_64.invoke(this, 6423937502976125763L, n), 6422582486239377740L, n);
    }
    
    public void m18461(IPlugin p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          62899870991327
        //     6: lxor           
        //     7: lstore_2       
        //     8: aload_0        
        //     9: astore          5
        //    11: aload           5
        //    13: aload_1        
        //    14: ldc2_w          6794929990376400010
        //    17: lload_2        
        //    18: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)Lorg/rusherhack/Class286;
        //    23: astore_0       
        //    24: ldc2_w          6795609043768472944
        //    27: lload_2        
        //    28: invokedynamic   BootstrapMethod #0, ¤:(JJ)I
        //    33: iconst_0       
        //    34: istore          7
        //    36: aload_0        
        //    37: ldc2_w          6796263932900708554
        //    40: lload_2        
        //    41: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)[Ljava/lang/String;
        //    46: dup            
        //    47: astore          6
        //    49: arraylength    
        //    50: istore          8
        //    52: istore          4
        //    54: iconst_0       
        //    55: dup            
        //    56: istore          9
        //    58: iload           8
        //    60: if_icmpge       165
        //    63: aload           6
        //    65: iload           9
        //    67: aaload         
        //    68: ldc2_w          6794536307092023042
        //    71: lload_2        
        //    72: invokedynamic   BootstrapMethod #0, P:(JJ)Lnet.minecraft.GameVersion;
        //    77: ldc2_w          6797157295826308057
        //    80: lload_2        
        //    81: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //    86: ldc2_w          6794806040446534679
        //    89: lload_2        
        //    90: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //    95: iload           4
        //    97: ifeq            167
        //   100: goto            113
        //   103: ldc2_w          6794784498106061719
        //   106: lload_2        
        //   107: invokedynamic   BootstrapMethod #0, ¤:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   112: athrow         
        //   113: iload           4
        //   115: ifeq            162
        //   118: goto            131
        //   121: ldc2_w          6794784498106061719
        //   124: lload_2        
        //   125: invokedynamic   BootstrapMethod #0, ¤:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   130: athrow         
        //   131: ifeq            157
        //   134: goto            147
        //   137: ldc2_w          6794784498106061719
        //   140: lload_2        
        //   141: invokedynamic   BootstrapMethod #0, ¤:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   146: athrow         
        //   147: iconst_1       
        //   148: dup            
        //   149: dup            
        //   150: pop2           
        //   151: dup            
        //   152: istore          7
        //   154: goto            167
        //   157: iinc            9, 1
        //   160: iload           9
        //   162: goto            58
        //   165: iload           7
        //   167: ifne            273
        //   170: aload           5
        //   172: ldc2_w          6793818050733714477
        //   175: lload_2        
        //   176: invokedynamic   BootstrapMethod #0, \u00c7:(Ljava/lang/Object;JJ)Ljava/util/HashMap;
        //   181: aload_0        
        //   182: ldc2_w          6797447032595406323
        //   185: lload_2        
        //   186: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   191: aload_1        
        //   192: ldc2_w          6796446772173502731
        //   195: lload_2        
        //   196: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object;
        //   201: pop            
        //   202: ldc2_w          6795378157624420347
        //   205: lload_2        
        //   206: invokedynamic   BootstrapMethod #0, P:(JJ)Lorg/rusherhack/core/logging/Logger;
        //   211: aload_0        
        //   212: ldc2_w          6797447032595406323
        //   215: lload_2        
        //   216: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   221: sipush          14813
        //   224: ldc2_w          1897662792327147450
        //   227: lload_2        
        //   228: lxor           
        //   229: invokedynamic   BootstrapMethod #4, n:(IJ)Ljava/lang/String;
        //   234: swap           
        //   235: sipush          9006
        //   238: ldc2_w          4712968352614233413
        //   241: lload_2        
        //   242: lxor           
        //   243: invokedynamic   BootstrapMethod #4, n:(IJ)Ljava/lang/String;
        //   248: invokedynamic   BootstrapMethod #6, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   253: ldc2_w          6798152583625004111
        //   256: lload_2        
        //   257: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   262: return         
        //   263: ldc2_w          6794784498106061719
        //   266: lload_2        
        //   267: invokedynamic   BootstrapMethod #0, ¤:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   272: athrow         
        //   273: ldc2_w          6795378157624420347
        //   276: lload_2        
        //   277: invokedynamic   BootstrapMethod #0, P:(JJ)Lorg/rusherhack/core/logging/Logger;
        //   282: aload_0        
        //   283: ldc2_w          6797447032595406323
        //   286: lload_2        
        //   287: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   292: aload_0        
        //   293: ldc2_w          6795922708984437424
        //   296: lload_2        
        //   297: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   302: sipush          29994
        //   305: ldc2_w          6578401111660749632
        //   308: lload_2        
        //   309: lxor           
        //   310: invokedynamic   BootstrapMethod #4, n:(IJ)Ljava/lang/String;
        //   315: ldc2_w          6797530804170434662
        //   318: lload_2        
        //   319: invokedynamic   BootstrapMethod #0, ¤:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   324: aload_0        
        //   325: ldc2_w          6794415281929046874
        //   328: lload_2        
        //   329: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)[Ljava/lang/String;
        //   334: ldc2_w          6796837044184763395
        //   337: lload_2        
        //   338: invokedynamic   BootstrapMethod #0, ¤:(Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String;
        //   343: astore          10
        //   345: astore          11
        //   347: astore          12
        //   349: sipush          22443
        //   352: ldc2_w          5605602181351129546
        //   355: lload_2        
        //   356: lxor           
        //   357: invokedynamic   BootstrapMethod #4, n:(IJ)Ljava/lang/String;
        //   362: aload           12
        //   364: ldc_w           " "
        //   367: aload           11
        //   369: sipush          25461
        //   372: ldc2_w          672100755731805469
        //   375: lload_2        
        //   376: lxor           
        //   377: invokedynamic   BootstrapMethod #4, n:(IJ)Ljava/lang/String;
        //   382: aload           10
        //   384: invokedynamic   BootstrapMethod #7, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   389: ldc2_w          6798152583625004111
        //   392: lload_2        
        //   393: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   398: aload_1        
        //   399: ldc2_w          6794998926684841611
        //   402: lload_2        
        //   403: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)V
        //   408: return         
        //   409: astore          6
        //   411: aload           5
        //   413: ldc2_w          6793818050733714477
        //   416: lload_2        
        //   417: invokedynamic   BootstrapMethod #0, \u00c7:(Ljava/lang/Object;JJ)Ljava/util/HashMap;
        //   422: aload_0        
        //   423: ldc2_w          6797447032595406323
        //   426: lload_2        
        //   427: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   432: aload_1        
        //   433: ldc2_w          6796446772173502731
        //   436: lload_2        
        //   437: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object;
        //   442: pop            
        //   443: ldc2_w          6795378157624420347
        //   446: lload_2        
        //   447: invokedynamic   BootstrapMethod #0, P:(JJ)Lorg/rusherhack/core/logging/Logger;
        //   452: sipush          3697
        //   455: ldc2_w          4736909272258615313
        //   458: lload_2        
        //   459: lxor           
        //   460: invokedynamic   BootstrapMethod #4, n:(IJ)Ljava/lang/String;
        //   465: ldc2_w          6797291121713338718
        //   468: lload_2        
        //   469: invokedynamic   BootstrapMethod #0, ¤:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   474: iconst_3       
        //   475: anewarray       Ljava/lang/Object;
        //   478: dup            
        //   479: iconst_0       
        //   480: aload_0        
        //   481: ldc2_w          6797447032595406323
        //   484: lload_2        
        //   485: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   490: aastore        
        //   491: dup            
        //   492: iconst_1       
        //   493: dup            
        //   494: dup            
        //   495: pop2           
        //   496: aload_0        
        //   497: ldc2_w          6795922708984437424
        //   500: lload_2        
        //   501: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   506: aastore        
        //   507: dup            
        //   508: iconst_2       
        //   509: aload           6
        //   511: aastore        
        //   512: ldc2_w          6796664778346901379
        //   515: lload_2        
        //   516: invokedynamic   BootstrapMethod #0, w:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   521: return         
        //    StackMapTable: 00 0E FF 00 3A 00 09 07 00 6F 07 00 78 04 01 07 00 02 07 01 9F 01 01 01 00 01 01 6C 07 00 AF 49 01 47 07 00 AF 49 01 45 07 00 AF 09 09 44 01 02 41 01 F7 00 5F 07 00 AF 09 FF 00 87 00 0C 07 00 6F 07 00 78 04 01 07 00 02 07 01 9F 01 01 01 07 01 A1 07 01 A1 07 01 A1 00 01 07 00 AF
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  167    263    263    273    Ljava/lang/Throwable;
        //  113    134    137    147    Ljava/lang/Throwable;
        //  63     118    121    131    Ljava/lang/Throwable;
        //  58     100    103    113    Ljava/lang/Throwable;
        //  398    408    409    522    Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0113:
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
    
    static {}
    
    public boolean m18462(File file) {
        long n = Class610.f9632 ^ 0x315DAE7841AAL;
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_80.invoke(ProcyonInvokeDynamicHelper_77.invoke(file, -7189762669306534001L, n), ProcyonInvokeDynamicHelper_79.invoke(ProcyonInvokeDynamicHelper_78.invoke(25837, 0x4E5DCE85AF55B0FAL ^ n), -7196228655227593941L, n), -7196030898261110939L, n);
    }
    
    public static IllegalStateException m1393(Throwable t) {
        return new IllegalStateException(t);
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
    
    public static String m153(int n, long n2) {
        return null;
    }
    
    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        String m153 = m153((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, m153), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m153;
    }
    
    public static CallSite m120(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class610.m120:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static int m121(long n, long n2) {
        n ^= (n2 << 48 | n2);
        int n3 = (int)(n >>> 46);
        if (Class610.f9637[n3] != null) {
            return n3;
        }
        Object o = Class610.f9636[n3];
        if (!(o instanceof String)) {
            return n3;
        }
        int n5 = switch ((int)(n >>> 42 & 0x3FL)) {
            case 0 -> 55;
            case 1 -> 18;
            case 2 -> 31;
            case 3 -> 24;
            case 4 -> 40;
            case 5 -> 10;
            case 6 -> 2;
            case 7 -> 33;
            case 8 -> 6;
            case 9 -> 14;
            case 10 -> 42;
            case 11 -> 49;
            case 12 -> 53;
            case 13 -> 3;
            case 14 -> 25;
            case 15 -> 0;
            case 16 -> 56;
            case 17 -> 27;
            case 18 -> 57;
            case 19 -> 36;
            case 20 -> 19;
            case 21 -> 52;
            case 22 -> 7;
            case 23 -> 34;
            case 24 -> 26;
            case 25 -> 23;
            case 26 -> 48;
            case 27 -> 47;
            case 28 -> 46;
            case 29 -> 8;
            case 30 -> 5;
            case 31 -> 51;
            case 32 -> 15;
            case 33 -> 54;
            case 34 -> 43;
            case 35 -> 45;
            case 36 -> 22;
            case 37 -> 39;
            case 38 -> 16;
            case 39 -> 17;
            case 40 -> 11;
            case 41 -> 37;
            case 42 -> 62;
            case 43 -> 1;
            case 44 -> 38;
            case 45 -> 29;
            case 46 -> 32;
            case 47 -> 50;
            case 48 -> 21;
            case 49 -> 9;
            case 50 -> 60;
            case 51 -> 58;
            case 52 -> 63;
            case 53 -> 20;
            case 54 -> 41;
            case 55 -> 44;
            case 56 -> 61;
            case 57 -> 59;
            case 58 -> 4;
            case 59 -> 35;
            case 60 -> 13;
            case 61 -> 28;
            case 62 -> 30;
            default -> 12;
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
        Class610.f9637[n3] = new String(charArray);
        return n3;
    }
    
    public static void m122() {
        Object[] f9636 = Class610.f9636;
        f9636[0] = "I\f>-\u00186U\u0016<q\u0002\"E\u0015w\u0581";
        f9636[1] = "\\,0vF\u000fB$*9 \u001bE%\u000bv\u0018";
        f9636[2] = "g4`_fny<z\u0010.nc6bW'u#\u0017\u007f}'u~ {[:";
        f9636[3] = Void.TYPE;
        Class610.f9637[3] = "java/lang/Void";
        f9636[4] = "*\u0015L*\u000bF6\u000fNv\u0011R&\f\u0005g\u0015Z \t_*\u0018C,I[h\fT,\t\u0005M)_0\u0000Bj";
        f9636[5] = "x=|WyUd'~\u000bcAt$5\u01b4";
        f9636[6] = "\b|^#GO\u0003sOl:W\u0010tF%";
        f9636[7] = "\u00171P9W`\u000b+ReMt\u001b(\u0019tJg\u001dm[xBr\u0011-P9iz\u001f$Re";
        f9636[8] = "%\u0015M\u0018I79\u000fODS#)\f\u0004\u015d";
        f9636[9] = "\u0000l*Q2'\u001cv(\r(3\fuc\u0279";
        f9636[10] = Integer.TYPE;
        Class610.f9637[10] = "java/lang/Integer";
        f9636[11] = "\u001bGv_b\u0019\u0007]t\u0003x\r\u0017^?\u0012\u007f\u001e\u0011\u001b}\u001ew\u000b\u001d[v_Y \u001bR";
        f9636[12] = "lI\u0017qM\"\u0019i\u001c~\\mxg\u0017uX7\f";
        f9636[13] = "3J\u0007\"L\u001c8E\u0016m!\u00188Y\"&\u0013\u0005<E\u0012&";
        f9636[14] = "T-#\f\u001c,!\r(\u0003\rcL\t(\u001f9(~\u0014,\u0003\t(4";
        f9636[15] = "\f}@\" R\f}W~,]\u00166W`,H\u0011G\u00028u\u0002";
        f9636[16] = "\u0006\u0014o\u0017\u0016*\u001a\u000emK\f>\n\r&\u0207";
        f9636[17] = "yq\rl\u0010@\fQ\u0006c\u0001\u000fqI\u0015d\bF\u0019";
        f9636[18] = "H4%\u001d\b;T.'A\u0012/D-l\u0513";
        f9636[19] = "\u0011%$\u0017'Z\u0011%3K+U\u000bn3U+@\f\u001fc\u000es\u0004";
        f9636[20] = "2\b'8(L9\u00076wRH*\u0006&8dL=";
        f9636[21] = "J+Lp\u0000`?\u000bG\u007f\u0011/B\u0013Tx\u0018f*";
        f9636[22] = "2.l'FH9!}h'F2*y2";
        f9636[23] = Boolean.TYPE;
        Class610.f9637[23] = "java/lang/Boolean";
        f9636[24] = "/uZxXD1}@7?E fMm\u0019C";
        f9636[25] = "An\u0011X?\u001d]t\u0013\u0004%\tMwX\u01bf";
        f9636[26] = "20#ut\u001c7\u007f\u0013}6\u0010";
        f9636[27] = "5\u0004L\u0005z\n@!IJJ\u0002\u0002-\u001d";
        f9636[28] = "{ 8d-{e(\"+@a}-+fwg~/";
        f9636[29] = "EZ\u0011|\bL[R\u000b3u\\[";
        f9636[30] = "i\u007f$ \u0010\u000fww>oM\u000eq{3,\u0010)wl7 S";
        f9636[31] = "{\u0018\t>I,e\u0010\u0013q()e\u0010\u00101\u00065";
        f9636[32] = "\u0018k\u0013BvB\u0006c\t\r>B\u001ci\u0011J7Y\\Z\u0017F<^\u0011k\u0011F";
        f9636[33] = "LnZk!bRf@$ibHlXc`y\bIYdlcO`B";
        f9636[34] = "g7\u001e\r2}y?\u0004BQi}r-\u0002hzt";
        f9636[35] = "@\u001b_:,1\\\u0001]f6%L\u0002\u0016w16JG]b;*[G}b;*[+Mg";
        f9636[36] = "2\u001f\u0002B9B.\u0005\u0000\u001e#V>\u0006K\u03f4";
        f9636[37] = "?mdX\u000bj4bu\u0017v\u007f&xwT";
        f9636[38] = "B3\\pP1\u0004bRfj6\u0019gY\u0002Vg\u000e1Dk\u000e<\u0002l>8\b-G1D>\u0004o\u0001\t";
        f9636[39] = "g\u0000\u0005bo$?[\t?\u0015 =\\\u000f\u0005t1;0Hjdu!Y\u00101h([_\u0019*/&b\u000e\u0005<nM";
        f9636[40] = "\u000f r\u001c \u0016\\j'\n\u0011\u0018\u000b--\u0006}*ZauX }Za<Yk\u0014\u0002:0\u0004\u0011";
        f9636[41] = "!wG%;;\u007f*VwQ4$-Fp+Z ,\u0006g8#|uKeQ>{4\u0002w0`&%P\u001d";
        f9636[42] = "M1x\u0011\f!TdyIk\u0385&h0ZS'O0kV\u000e]\u001adq\u0013\u00114B?}Nk";
        f9636[43] = "Zkm\u0007et\u0004br\u0015\u0004\u0182:e6\u0010~>\\kb\fbN\u00014y\u000bu#@>6[\u0004";
        f9636[44] = "rcn4\u007fC|7r(\u000f\u0164\u0018`%?7_q8~3j%";
        f9636[45] = "w5})MA`3y4sM{wG.KQ+?>+\u001cCx\u000f\"rII,f5tMT\u0012";
        f9636[46] = "j@-}N\b1E+a>\u001cuU9z[gm\u0011)+T\u00063L8y>";
        f9636[47] = "?P /4\u001e>U>xW\u01d6\u0004\u0015\u007fgoYmM$k2#8\u0019>.-J`B2sW";
        f9636[48] = """
                    \u000e\u0000vC9\u000f\u0011\u0018l2«vSFvR+\u001b\u0012L9\u0002ZL
                    \u0007>
                     J\u0006Ex2""";
        f9636[49] = "Q6b\tD<\u000f?}\u001b%V189\u001e_vW6m\u0002C\u0006";
        f9636[50] = "\u0015NV\u0001O6\nVLp\u0566OJ\tK\u001c^?\u0002HJH";
        f9636[51] = "Nx.53<\u001el|gR1\u000b}x R`Av' ;8\u001azzZb'Jdf+18\u001bg\u001f`0&I?ef<d\u000f\u0007";
        f9636[52] = "R_+\u0012BE\nL4T#]HZ4\u0004YG_]O\u0001^IPL>S_\u0018M0u\rY\u001e\rJs\u0001\u001bX5";
        f9636[53] = "=\u001c)D\u0006LeG%\u0019|GfM>|MAy\\;\u0002\u0000W9\u001cXM\u0002ZyS:\u001b\f\u001fk,dL\r\u001d{E<\u0017\u0001@\u0001";
        f9636[54] = "4*\u007f-u[n<*3\u0015T%$?2n9:(4t~\u0000k4\"5\u0015";
        f9636[55] = "D<5rab[$/\u0003\u023a\u001bC.~`by\u00198+~";
        f9636[56] = "am\u0005K\u0007*96\t\u0016}.$ \u001d\u0017\u0006C3 \u001b\u0016\u00012a!J\u000b},0-N\u0018D},;\u000fs";
        f9636[57] = "IP\u001dCf\u000f\u001aTY\u0012\u001a\u0007IB|\u0005b\u0016_C\\\u0003w\u0002%BYB!\u0012D\u0011]\u0006pn\u001fL]@\"\u0014\u0019@\u001f\u0006\u001a";
        f9636[58] = "!zm&V\u00157f2\"nF*e])\nT*\u0019m=\u0001L;h?<PQG";
        f9636[59] = "Lu<7Yh\u0013\u007f/7>lJu\u0015>Np#a>#\u0004g\u001a0\"5E\f";
        f9636[60] = "\u0004|VZ%!L=W\u000eW?Z<v_<1=\u007f^\\,a]{GF:Q\u0007$A\u000eo+\u0001(\u0003HW";
        f9636[61] = "\u0000>5\u0007\u0017\b\u000ej)\u001bg\u017bjl?\u0016\b\u001fSg%B\u001cn";
        f9636[62] = "\u0001\u0007|qYRIF}%+ZEA\u0011sVM]A`!W\u001c@=\u007f`DGDL-a\u0015Z8SlrN^I\u0001m#S\"";
        f9636[63] = "f$(\"\u0017(9.;\"p*d/;F\u001e1f:;7L07'G";
        f9636[64] = "\u0003\fq\u0016av\u0010\t=\u0003\u001e\u03c8{\t.C}q\u0019S8\u0016c";
        f9636[65] = "\u001dn%MOE\u001e.?P7\u0012 -eLECFk4BS";
        f9636[66] = "P8+e\u0011\u0000\u0003(#o(\u0510nk%3\u0015\u0016\r,|3Np";
        f9636[67] = "6vG\u0011%`~7FEW}i0P\f\f}sLI\u0012.~\u007f#\u0012\u0017(b\u000f";
        f9636[68] = "n're\u0019`y!vx'nqP,\u007fJ\te`'a[x7av|'gvr-xV5w#0\u0004";
        f9636[69] = "W\u0003a\u0000!iM\u000eiF\u00185I\u0000qWd3OmdEw0R\t;Od05";
        f9636[70] = "\u000bu;m3^\u0005!'qC\u02a9avpf{B\b.+j&8";
        f9636[71] = "'\u001e@\u0015{Eo_AA\tKw@P\u0014r5|JGG0\bfGO\u0001\t";
        f9636[72] = "t\u001f-K/Rk\u00077:\u0535+)Y-Z=FhSb\nLA-\u0019'J*Oy\u0005;:";
        f9636[73] = "\u0005\fZ)`F]WVt\u001aB@ABuanVZLkwdPGF\u0011&\u001fH\u0004Qx~DDY+~w_\u0003W\u0012/kIB<";
        f9636[74] = "!lTB0s\",N_H\u0495\u001cuAE5.\u007f-RZs";
        f9636[75] = "'Uba\u001d-f_-1l'z*uh\u0000@&\fh9T: \u0000*\u007fl";
        f9636[76] = "s*-\u0012!h760\u000b@zf+\t\u0010'mf--\u001b@);&i\u0010)q`*4j|%zo+\u0003$~v2QVpd3-8\u000e+hnW";
        f9636[77] = "Hu0Y1b\u0012ceGQdHawt0dDa\u000b[,f\u0015f7\u00012eE\u001a";
        f9636[78] = "ZI\u0000\u001e\u0000\u007f\u0000_U\u0000`rVZ}\u0014\u0005p;\u001a\u000b\fXgRBP\u0000\u0005\u001d";
        f9636[79] = "\fP\u0004{Y3R\r\u0015)3<\t\b\u0015\rR(\u0013\u0012y&\th\tP\u00101\u000fl\u0014n";
        f9636[80] = "{0,JGxd(6;\u054f\u0001|\"gXDc&42F$np=fP\u001d?l+';";
        f9636[81] = "Z\u0019ln K\u001b\u0013#>QA\u0007\u007fzj6O\r\"&l+\u001eYX `iXa";
        f9636[82] = "REw\u001eJ\u0018\fLh\f+IVFh\u001f+\u0018P[+JQ\u001e\\\u0019mr";
        f9636[83] = "P?@Sm\u0001^k\\O\u001d\u0499:mJBr\u0016\u0003fP\u0016fg";
        f9636[84] = ":`2\"\\\u001a%x(Sace'/?M\u0013-f.k";
        f9636[85] = "1\bK\u0004F_g\u000eS\t6N<ZK\u0002a\u001a`\f\u0016_6I,\bR_]\u001af]D";
        f9636[86] = "uq#'\u001eRji9V\u0014+\u007frim\u0001J,v-<}Gm6h*\u001c\u0014ir9V";
        f9636[87] = """
                    0\u0001
                    ;\u000f\u007f/\u0019\u0010J\u02ef\u00069\u0011
                    p\u0007?h
\u001c1""";
        f9636[88] = "5\u001e\u0004L5\u001c*\u0006\u001e=\u01ddejY\u0019Q$\u0015\"\u0018\u0018\u0005";
    }
    
    public static Class m123(long n, long n2) {
        int m121 = m121(n, n2);
        Object o = Class610.f9636[m121];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(Class610.f9637[m121]);
                Class610.f9636[m121] = forName;
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
    
    public static Field m126(long n, long n2) {
        int m121 = m121(n, n2);
        Object o = Class610.f9636[m121];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        String s = Class610.f9637[m121];
        int index = s.indexOf(8);
        Class m122 = m123(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        String substring = s.substring(index, index2);
        ++index2;
        Class m123 = m123(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m122;
        while (true) {
            Field m124 = m124(clazz, substring, m123);
            if (m124 != null) {
                return (Field)(Class610.f9636[m121] = m124);
            }
            Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    Field m125 = m125(interfaces[i], substring, m123);
                    if (m125 != null) {
                        return (Field)(Class610.f9636[m121] = m125);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m122.getName()).append(' ').append(m123.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m123(1609336173937345L, 0L);
        }
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
    
    public static Method m129(long n, long n2) {
        int m121 = m121(n, n2);
        Object o = Class610.f9636[m121];
        if (o instanceof String) {
            String s = Class610.f9637[m121];
            int index = s.indexOf(8);
            Class m122 = m123(Long.parseLong(s.substring(0, index), 36), 0L);
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
            Class m123 = null;
            int n5 = index2 + 1;
            for (int i = 0; i < n3; ++i) {
                int index4 = s.indexOf(8, n5);
                m123 = m123(Long.parseLong(s.substring(n5, index4), 36), 0L);
                if (i < n4) {
                    array[i] = m123;
                }
                n5 = index4 + 1;
            }
            Class superclass = m122;
            while (true) {
                do {
                    Method m124 = m127(superclass, substring, m123, n4, array);
                    if (m124 != null) {
                        return (Method)(Class610.f9636[m121] = m124);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m122;
                    while (true) {
                        Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                Method m125 = m128(interfaces[j], substring, m123, n4, array);
                                if (m125 != null) {
                                    return (Method)(Class610.f9636[m121] = m125);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            StringBuffer sb = new StringBuffer();
                            sb.append("NoSuchMethodException in ").append(m122.getName()).append(' ').append(m123.getName()).append(' ').append(substring).append('(');
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
                        clazz = m123(1609336173937345L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m123(1609336173937345L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    public static MethodHandle m130(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType methodType, long n, long n2) {
        char char1 = s.charAt(0);
        Field m126 = null;
        Method m127 = null;
        try {
            MethodHandle target;
            if (char1 == '\u00c7' || char1 == '\u00c3' || char1 == 'P' || char1 == 'm') {
                m126 = m126(n, n2);
                Class<?> declaringClass = m126.getDeclaringClass();
                String name = m126.getName();
                Class<?> type = m126.getType();
                if (char1 == '\u00c7') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == '\u00c3') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == 'P') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m127 = m129(n, n2);
                Class<?> declaringClass2 = m127.getDeclaringClass();
                String name2 = m127.getName();
                MethodType methodType2 = MethodType.methodType(m127.getReturnType(), m127.getParameterTypes());
                if (char1 == 'w') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == '¤') {
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
            sb.append(ex.getClass().getName()).append(" : ").append((m126 != null) ? m126.toString() : ((m127 != null) ? m127.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static Object m131(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType newType, Object[] array) {
        int n = array.length - 2;
        MethodHandle m130 = m130(lookup, mutableCallSite, s, newType, (long)array[n], (long)array[++n]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m130, newType));
        try {
           return m130.asSpreader(Object[].class, array.length).invoke(array);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class610.m132:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
                    handle = ((CallSite)Class610.m132(lookup, "\u00c7", MethodType.methodType(HashMap.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static HashMap invoke(Object p0, long p1, long p2) {
            try {
                return (HashMap) ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Set.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static Set invoke(Object p0, long p1, long p2) {
            try {
                return (Set) ProcyonInvokeDynamicHelper_2.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Stream.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static Stream invoke(Object p0, long p1, long p2) {
            try {
                return (Stream) ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static Object invoke(Object p0, long p1, long p2) {
            try {
                return (Object) ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Stream.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static Stream invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Stream) ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Optional.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static Optional invoke(Object p0, long p1, long p2) {
            try {
                return (Optional) ProcyonInvokeDynamicHelper_6.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Optional.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static Optional invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Optional) ProcyonInvokeDynamicHelper_7.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static Object invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Object) ProcyonInvokeDynamicHelper_8.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static Object invoke(Object p0, long p1, long p2) {
            try {
                return (Object) ProcyonInvokeDynamicHelper_9.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class610.m132(lookup, "P", MethodType.methodType(boolean.class, long.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)Class610.m132(lookup, "P", MethodType.methodType(EventBus.class, long.class, long.class))).dynamicInvoker();
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
        
        public static EventBus invoke(long p0, long p1) {
            try {
                return (EventBus) ProcyonInvokeDynamicHelper_11.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                ProcyonInvokeDynamicHelper_12.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)Class610.m132(lookup, "\u00c7", MethodType.methodType(HashMap.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static HashMap invoke(Object p0, long p1, long p2) {
            try {
                return (HashMap) ProcyonInvokeDynamicHelper_13.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static void invoke(Object p0, long p1, long p2) {
            try {
                ProcyonInvokeDynamicHelper_14.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        public static void invoke(Object p0, long p1, long p2) {
            try {
                ProcyonInvokeDynamicHelper_15.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_16
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_16.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_16.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_16.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "P", MethodType.methodType(Logger.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_16.fence = 1;
                ProcyonInvokeDynamicHelper_16.handle = handle;
                ProcyonInvokeDynamicHelper_16.fence = 0;
            }
            return handle;
        }
        
        public static Logger invoke(long p0, long p1) {
            try {
                return (Logger) ProcyonInvokeDynamicHelper_16.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_17
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_17.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_17.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_17.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_17.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_17.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m120(lookup, "n", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_17.fence = 1;
                ProcyonInvokeDynamicHelper_17.handle = handle;
                ProcyonInvokeDynamicHelper_17.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(int p0, long p1) {
            try {
                return (String) ProcyonInvokeDynamicHelper_17.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_18
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_18.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_18.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_18.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_18.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_18.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_18.fence = 1;
                ProcyonInvokeDynamicHelper_18.handle = handle;
                ProcyonInvokeDynamicHelper_18.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
            try {
                return (String) ProcyonInvokeDynamicHelper_18.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_19
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_19.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_19.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_19.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_19.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_19.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_19.fence = 1;
                ProcyonInvokeDynamicHelper_19.handle = handle;
                ProcyonInvokeDynamicHelper_19.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                ProcyonInvokeDynamicHelper_19.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_20
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_20.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_20.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_20.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_20.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_20.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_20.fence = 1;
                ProcyonInvokeDynamicHelper_20.handle = handle;
                ProcyonInvokeDynamicHelper_20.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                ProcyonInvokeDynamicHelper_20.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_21
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_21.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_21.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_21.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_21.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_21.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_21.fence = 1;
                ProcyonInvokeDynamicHelper_21.handle = handle;
                ProcyonInvokeDynamicHelper_21.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(long p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_21.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_22
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_22.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_22.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_22.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_22.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_22.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "P", MethodType.methodType(File.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_22.fence = 1;
                ProcyonInvokeDynamicHelper_22.handle = handle;
                ProcyonInvokeDynamicHelper_22.fence = 0;
            }
            return handle;
        }
        
        public static File invoke(long p0, long p1) {
            try {
                return (File) ProcyonInvokeDynamicHelper_22.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_23
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_23.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_23.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_23.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_23.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_23.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_23.fence = 1;
                ProcyonInvokeDynamicHelper_23.handle = handle;
                ProcyonInvokeDynamicHelper_23.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, long p1, long p2) {
            try {
                return (boolean) ProcyonInvokeDynamicHelper_23.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_24
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_24.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_24.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_24.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_24.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_24.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(Throwable.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_24.fence = 1;
                ProcyonInvokeDynamicHelper_24.handle = handle;
                ProcyonInvokeDynamicHelper_24.fence = 0;
            }
            return handle;
        }
        
        public static Throwable invoke(Object p0, long p1, long p2) {
            try {
                return (Throwable) ProcyonInvokeDynamicHelper_24.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_25
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_25.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_25.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_25.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_25.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_25.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "P", MethodType.methodType(boolean.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_25.fence = 1;
                ProcyonInvokeDynamicHelper_25.handle = handle;
                ProcyonInvokeDynamicHelper_25.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(long p0, long p1) {
            try {
                return (boolean) ProcyonInvokeDynamicHelper_25.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_26
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_26.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_26.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_26.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_26.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_26.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "P", MethodType.methodType(File.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_26.fence = 1;
                ProcyonInvokeDynamicHelper_26.handle = handle;
                ProcyonInvokeDynamicHelper_26.fence = 0;
            }
            return handle;
        }
        
        public static File invoke(long p0, long p1) {
            try {
                return (File) ProcyonInvokeDynamicHelper_26.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_27
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_27.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_27.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_27.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_27.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_27.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(File[].class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_27.fence = 1;
                ProcyonInvokeDynamicHelper_27.handle = handle;
                ProcyonInvokeDynamicHelper_27.fence = 0;
            }
            return handle;
        }
        
        public static File[] invoke(Object p0, long p1, long p2) {
            try {
                return (File[]) ProcyonInvokeDynamicHelper_27.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_28
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_28.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_28.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_28.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_28.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_28.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(boolean.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_28.fence = 1;
                ProcyonInvokeDynamicHelper_28.handle = handle;
                ProcyonInvokeDynamicHelper_28.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (boolean) ProcyonInvokeDynamicHelper_28.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_29
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_29.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_29.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_29.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_29.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_29.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(Throwable.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_29.fence = 1;
                ProcyonInvokeDynamicHelper_29.handle = handle;
                ProcyonInvokeDynamicHelper_29.fence = 0;
            }
            return handle;
        }
        
        public static Throwable invoke(Object p0, long p1, long p2) {
            try {
                return (Throwable) ProcyonInvokeDynamicHelper_29.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_30
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_30.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_30.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_30.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_30.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_30.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(boolean.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_30.fence = 1;
                ProcyonInvokeDynamicHelper_30.handle = handle;
                ProcyonInvokeDynamicHelper_30.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (boolean) ProcyonInvokeDynamicHelper_30.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_31
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_31.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_31.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_31.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_31.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_31.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(Throwable.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_31.fence = 1;
                ProcyonInvokeDynamicHelper_31.handle = handle;
                ProcyonInvokeDynamicHelper_31.fence = 0;
            }
            return handle;
        }
        
        public static Throwable invoke(Object p0, long p1, long p2) {
            try {
                return (Throwable) ProcyonInvokeDynamicHelper_31.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_32
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_32.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_32.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_32.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_32.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_32.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Class286.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_32.fence = 1;
                ProcyonInvokeDynamicHelper_32.handle = handle;
                ProcyonInvokeDynamicHelper_32.fence = 0;
            }
            return handle;
        }
        
        public static Class286 invoke(Object p0, long p1, long p2) {
            try {
                return (Class286) ProcyonInvokeDynamicHelper_32.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_33
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_33.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_33.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_33.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_33.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_33.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "\u00c7", MethodType.methodType(HashMap.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_33.fence = 1;
                ProcyonInvokeDynamicHelper_33.handle = handle;
                ProcyonInvokeDynamicHelper_33.fence = 0;
            }
            return handle;
        }
        
        public static HashMap invoke(Object p0, long p1, long p2) {
            try {
                return (HashMap) ProcyonInvokeDynamicHelper_33.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_34
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_34.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_34.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_34.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_34.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_34.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Object.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_34.fence = 1;
                ProcyonInvokeDynamicHelper_34.handle = handle;
                ProcyonInvokeDynamicHelper_34.fence = 0;
            }
            return handle;
        }
        
        public static Object invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return (Object) ProcyonInvokeDynamicHelper_34.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_35
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_35.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_35.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_35.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_35.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_35.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(IPlugin.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_35.fence = 1;
                ProcyonInvokeDynamicHelper_35.handle = handle;
                ProcyonInvokeDynamicHelper_35.fence = 0;
            }
            return handle;
        }
        
        public static IPlugin invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (IPlugin) ProcyonInvokeDynamicHelper_35.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_36
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_36.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_36.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_36.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_36.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_36.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(Throwable.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_36.fence = 1;
                ProcyonInvokeDynamicHelper_36.handle = handle;
                ProcyonInvokeDynamicHelper_36.fence = 0;
            }
            return handle;
        }
        
        public static Throwable invoke(Object p0, long p1, long p2) {
            try {
                return (Throwable) ProcyonInvokeDynamicHelper_36.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_37
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_37.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_37.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_37.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_37.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_37.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "\u00c7", MethodType.methodType(HashMap.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_37.fence = 1;
                ProcyonInvokeDynamicHelper_37.handle = handle;
                ProcyonInvokeDynamicHelper_37.fence = 0;
            }
            return handle;
        }
        
        public static HashMap invoke(Object p0, long p1, long p2) {
            try {
                return (HashMap) ProcyonInvokeDynamicHelper_37.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_38
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_38.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_38.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_38.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_38.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_38.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Object.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_38.fence = 1;
                ProcyonInvokeDynamicHelper_38.handle = handle;
                ProcyonInvokeDynamicHelper_38.fence = 0;
            }
            return handle;
        }
        
        public static Object invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return (Object) ProcyonInvokeDynamicHelper_38.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_39
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_39.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_39.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_39.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_39.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_39.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "\u00c7", MethodType.methodType(HashMap.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_39.fence = 1;
                ProcyonInvokeDynamicHelper_39.handle = handle;
                ProcyonInvokeDynamicHelper_39.fence = 0;
            }
            return handle;
        }
        
        public static HashMap invoke(Object p0, long p1, long p2) {
            try {
                return (HashMap) ProcyonInvokeDynamicHelper_39.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_40
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_40.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_40.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_40.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_40.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_40.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Object.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_40.fence = 1;
                ProcyonInvokeDynamicHelper_40.handle = handle;
                ProcyonInvokeDynamicHelper_40.fence = 0;
            }
            return handle;
        }
        
        public static Object invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return (Object) ProcyonInvokeDynamicHelper_40.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_41
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_41.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_41.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_41.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_41.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_41.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(Throwable.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_41.fence = 1;
                ProcyonInvokeDynamicHelper_41.handle = handle;
                ProcyonInvokeDynamicHelper_41.fence = 0;
            }
            return handle;
        }
        
        public static Throwable invoke(Object p0, long p1, long p2) {
            try {
                return (Throwable) ProcyonInvokeDynamicHelper_41.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_42
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_42.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_42.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_42.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_42.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_42.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_42.fence = 1;
                ProcyonInvokeDynamicHelper_42.handle = handle;
                ProcyonInvokeDynamicHelper_42.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
            try {
                ProcyonInvokeDynamicHelper_42.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_43
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_43.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_43.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_43.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_43.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_43.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_43.fence = 1;
                ProcyonInvokeDynamicHelper_43.handle = handle;
                ProcyonInvokeDynamicHelper_43.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
            try {
                ProcyonInvokeDynamicHelper_43.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_44
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_44.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_44.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_44.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_44.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_44.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_44.fence = 1;
                ProcyonInvokeDynamicHelper_44.handle = handle;
                ProcyonInvokeDynamicHelper_44.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
            try {
                ProcyonInvokeDynamicHelper_44.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_45
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_45.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_45.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_45.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_45.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_45.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_45.fence = 1;
                ProcyonInvokeDynamicHelper_45.handle = handle;
                ProcyonInvokeDynamicHelper_45.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                ProcyonInvokeDynamicHelper_45.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_46
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_46.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_46.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_46.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_46.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_46.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "P", MethodType.methodType(Logger.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_46.fence = 1;
                ProcyonInvokeDynamicHelper_46.handle = handle;
                ProcyonInvokeDynamicHelper_46.fence = 0;
            }
            return handle;
        }
        
        public static Logger invoke(long p0, long p1) {
            try {
                return (Logger) ProcyonInvokeDynamicHelper_46.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_47
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_47.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_47.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_47.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_47.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_47.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m120(lookup, "n", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_47.fence = 1;
                ProcyonInvokeDynamicHelper_47.handle = handle;
                ProcyonInvokeDynamicHelper_47.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(int p0, long p1) {
            try {
                return (String) ProcyonInvokeDynamicHelper_47.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_48
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_48.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_48.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_48.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_48.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_48.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_48.fence = 1;
                ProcyonInvokeDynamicHelper_48.handle = handle;
                ProcyonInvokeDynamicHelper_48.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
            try {
                return (String) ProcyonInvokeDynamicHelper_48.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_49
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_49.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_49.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_49.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_49.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_49.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_49.fence = 1;
                ProcyonInvokeDynamicHelper_49.handle = handle;
                ProcyonInvokeDynamicHelper_49.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                ProcyonInvokeDynamicHelper_49.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_50
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_50.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_50.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_50.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_50.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_50.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "\u00c7", MethodType.methodType(HashMap.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_50.fence = 1;
                ProcyonInvokeDynamicHelper_50.handle = handle;
                ProcyonInvokeDynamicHelper_50.fence = 0;
            }
            return handle;
        }
        
        public static HashMap invoke(Object p0, long p1, long p2) {
            try {
                return (HashMap) ProcyonInvokeDynamicHelper_50.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_51
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_51.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_51.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_51.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_51.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_51.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Collection.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_51.fence = 1;
                ProcyonInvokeDynamicHelper_51.handle = handle;
                ProcyonInvokeDynamicHelper_51.fence = 0;
            }
            return handle;
        }
        
        public static Collection invoke(Object p0, long p1, long p2) {
            try {
                return (Collection) ProcyonInvokeDynamicHelper_51.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_52
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_52.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_52.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_52.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_52.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_52.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Iterator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_52.fence = 1;
                ProcyonInvokeDynamicHelper_52.handle = handle;
                ProcyonInvokeDynamicHelper_52.fence = 0;
            }
            return handle;
        }
        
        public static Iterator invoke(Object p0, long p1, long p2) {
            try {
                return (Iterator) ProcyonInvokeDynamicHelper_52.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_53
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_53.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_53.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_53.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_53.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_53.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_53.fence = 1;
                ProcyonInvokeDynamicHelper_53.handle = handle;
                ProcyonInvokeDynamicHelper_53.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, long p1, long p2) {
            try {
                return (boolean) ProcyonInvokeDynamicHelper_53.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_54
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_54.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_54.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_54.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_54.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_54.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_54.fence = 1;
                ProcyonInvokeDynamicHelper_54.handle = handle;
                ProcyonInvokeDynamicHelper_54.fence = 0;
            }
            return handle;
        }
        
        public static Object invoke(Object p0, long p1, long p2) {
            try {
                return (Object) ProcyonInvokeDynamicHelper_54.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_55
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_55.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_55.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_55.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_55.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_55.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_55.fence = 1;
                ProcyonInvokeDynamicHelper_55.handle = handle;
                ProcyonInvokeDynamicHelper_55.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                ProcyonInvokeDynamicHelper_55.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_56
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_56.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_56.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_56.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_56.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_56.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "\u00c7", MethodType.methodType(HashMap.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_56.fence = 1;
                ProcyonInvokeDynamicHelper_56.handle = handle;
                ProcyonInvokeDynamicHelper_56.fence = 0;
            }
            return handle;
        }
        
        public static HashMap invoke(Object p0, long p1, long p2) {
            try {
                return (HashMap) ProcyonInvokeDynamicHelper_56.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_57
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_57.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_57.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_57.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_57.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_57.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Collection.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_57.fence = 1;
                ProcyonInvokeDynamicHelper_57.handle = handle;
                ProcyonInvokeDynamicHelper_57.fence = 0;
            }
            return handle;
        }
        
        public static Collection invoke(Object p0, long p1, long p2) {
            try {
                return (Collection) ProcyonInvokeDynamicHelper_57.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_58
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_58.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_58.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_58.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_58.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_58.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_58.fence = 1;
                ProcyonInvokeDynamicHelper_58.handle = handle;
                ProcyonInvokeDynamicHelper_58.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
            try {
                ProcyonInvokeDynamicHelper_58.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_59
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_59.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_59.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_59.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_59.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_59.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_59.fence = 1;
                ProcyonInvokeDynamicHelper_59.handle = handle;
                ProcyonInvokeDynamicHelper_59.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
            try {
                ProcyonInvokeDynamicHelper_59.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_60
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_60.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_60.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_60.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_60.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_60.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "P", MethodType.methodType(Logger.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_60.fence = 1;
                ProcyonInvokeDynamicHelper_60.handle = handle;
                ProcyonInvokeDynamicHelper_60.fence = 0;
            }
            return handle;
        }
        
        public static Logger invoke(long p0, long p1) {
            try {
                return (Logger) ProcyonInvokeDynamicHelper_60.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_61
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_61.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_61.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_61.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_61.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_61.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m120(lookup, "n", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_61.fence = 1;
                ProcyonInvokeDynamicHelper_61.handle = handle;
                ProcyonInvokeDynamicHelper_61.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(int p0, long p1) {
            try {
                return (String) ProcyonInvokeDynamicHelper_61.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_62
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_62.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_62.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_62.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_62.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_62.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_62.fence = 1;
                ProcyonInvokeDynamicHelper_62.handle = handle;
                ProcyonInvokeDynamicHelper_62.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
            try {
                return (String) ProcyonInvokeDynamicHelper_62.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_63
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_63.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_63.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_63.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_63.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_63.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_63.fence = 1;
                ProcyonInvokeDynamicHelper_63.handle = handle;
                ProcyonInvokeDynamicHelper_63.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                ProcyonInvokeDynamicHelper_63.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_64
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_64.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_64.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_64.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_64.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_64.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "\u00c7", MethodType.methodType(HashMap.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_64.fence = 1;
                ProcyonInvokeDynamicHelper_64.handle = handle;
                ProcyonInvokeDynamicHelper_64.fence = 0;
            }
            return handle;
        }
        
        public static HashMap invoke(Object p0, long p1, long p2) {
            try {
                return (HashMap) ProcyonInvokeDynamicHelper_64.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_65
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_65.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_65.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_65.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_65.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_65.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(Collection.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_65.fence = 1;
                ProcyonInvokeDynamicHelper_65.handle = handle;
                ProcyonInvokeDynamicHelper_65.fence = 0;
            }
            return handle;
        }
        
        public static Collection invoke(Object p0, long p1, long p2) {
            try {
                return (Collection) ProcyonInvokeDynamicHelper_65.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_66
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_66.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_66.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_66.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_66.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_66.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m120(lookup, "n", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_66.fence = 1;
                ProcyonInvokeDynamicHelper_66.handle = handle;
                ProcyonInvokeDynamicHelper_66.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(int p0, long p1) {
            try {
                return (String) ProcyonInvokeDynamicHelper_66.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_67
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_67.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_67.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_67.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_67.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_67.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_67.fence = 1;
                ProcyonInvokeDynamicHelper_67.handle = handle;
                ProcyonInvokeDynamicHelper_67.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
            try {
                return (String) ProcyonInvokeDynamicHelper_67.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_68
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_68.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_68.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_68.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_68.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_68.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m120(lookup, "n", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_68.fence = 1;
                ProcyonInvokeDynamicHelper_68.handle = handle;
                ProcyonInvokeDynamicHelper_68.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(int p0, long p1) {
            try {
                return (String) ProcyonInvokeDynamicHelper_68.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_69
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_69.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_69.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_69.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_69.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_69.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_69.fence = 1;
                ProcyonInvokeDynamicHelper_69.handle = handle;
                ProcyonInvokeDynamicHelper_69.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
            try {
                return (String) ProcyonInvokeDynamicHelper_69.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_70
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_70.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_70.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_70.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_70.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_70.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_70.fence = 1;
                ProcyonInvokeDynamicHelper_70.handle = handle;
                ProcyonInvokeDynamicHelper_70.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (String) ProcyonInvokeDynamicHelper_70.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_71
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_71.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_71.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_71.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_71.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_71.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m120(lookup, "n", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_71.fence = 1;
                ProcyonInvokeDynamicHelper_71.handle = handle;
                ProcyonInvokeDynamicHelper_71.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(int p0, long p1) {
            try {
                return (String) ProcyonInvokeDynamicHelper_71.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_72
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_72.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_72.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_72.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_72.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_72.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_72.fence = 1;
                ProcyonInvokeDynamicHelper_72.handle = handle;
                ProcyonInvokeDynamicHelper_72.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
            try {
                return (String) ProcyonInvokeDynamicHelper_72.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_73
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_73.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_73.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_73.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_73.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_73.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(boolean.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_73.fence = 1;
                ProcyonInvokeDynamicHelper_73.handle = handle;
                ProcyonInvokeDynamicHelper_73.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (boolean) ProcyonInvokeDynamicHelper_73.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_74
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_74.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_74.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_74.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_74.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_74.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "P", MethodType.methodType(File.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_74.fence = 1;
                ProcyonInvokeDynamicHelper_74.handle = handle;
                ProcyonInvokeDynamicHelper_74.fence = 0;
            }
            return handle;
        }
        
        public static File invoke(long p0, long p1) {
            try {
                return (File) ProcyonInvokeDynamicHelper_74.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_75
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_75.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_75.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_75.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_75.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_75.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m120(lookup, "n", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_75.fence = 1;
                ProcyonInvokeDynamicHelper_75.handle = handle;
                ProcyonInvokeDynamicHelper_75.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_76
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_76.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_76.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_76.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_76.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_76.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_76.fence = 1;
                ProcyonInvokeDynamicHelper_76.handle = handle;
                ProcyonInvokeDynamicHelper_76.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_77
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_77.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_77.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_77.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_77.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_77.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_77.fence = 1;
                ProcyonInvokeDynamicHelper_77.handle = handle;
                ProcyonInvokeDynamicHelper_77.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_78
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_78.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_78.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_78.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_78.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_78.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m120(lookup, "n", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_78.fence = 1;
                ProcyonInvokeDynamicHelper_78.handle = handle;
                ProcyonInvokeDynamicHelper_78.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_79
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_79.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_79.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_79.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_79.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_79.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "¤", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_79.fence = 1;
                ProcyonInvokeDynamicHelper_79.handle = handle;
                ProcyonInvokeDynamicHelper_79.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_80
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_80.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_80.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_80.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_80.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_80.LOOKUP;
                try {
                    handle = ((CallSite)Class610.m132(lookup, "w", MethodType.methodType(boolean.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_80.fence = 1;
                ProcyonInvokeDynamicHelper_80.handle = handle;
                ProcyonInvokeDynamicHelper_80.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, Object p1, long p2, long p3) {
        return false;
    }
    }
}
