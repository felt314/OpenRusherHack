// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import java.net.URLConnection;
import java.util.concurrent.Future;
import java.io.OutputStream;
import java.util.Set;
import java.nio.charset.Charset;
import org.rusherhack.core.logging.Logger;
import com.google.gson.JsonObject;
import java.lang.reflect.UndeclaredThrowableException;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import javax.crypto.SecretKey;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.google.gson.GsonBuilder;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.net.URL;
import java.net.HttpURLConnection;
import com.google.gson.JsonElement;
import java.net.URI;
import java.net.Proxy;
import java.util.regex.Pattern;
import java.util.Map;
import com.google.gson.Gson;
import java.util.HashMap;

public class Class551
{
    public static HashMap<String, String> f8905;
    public static Gson f8906;
    public static Map<String, String> f8907;
    public static Pattern f8908;
    public static long f8909;
    public static String[] f8910;
    public static String[] f8911;
    public static Map f8912;
    public static long[] f8913;
    public static Integer[] f8914;
    public static Map f8915;
    public static Object[] f8916;
    public static String[] f8917;
    
    public static JsonElement m17064(Proxy proxy, URI uri) {
        return null;
    }
    
    public static <T> T m17065(Proxy p0, URI p1, Map<String, String> p2, Class<T> p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          102281425990148
        //     6: lxor           
        //     7: lstore          4
        //     9: ldc2_w          2580229954067896973
        //    12: lload           4
        //    14: invokedynamic   BootstrapMethod #0, \u00fa:(JJ)I
        //    19: istore          6
        //    21: aload_0        
        //    22: aload_1        
        //    23: astore_0       
        //    24: astore_1       
        //    25: aload_1        
        //    26: ifnonnull       72
        //    29: new             Ljava/lang/IllegalArgumentException;
        //    32: dup            
        //    33: sipush          26942
        //    36: ldc2_w          9120480245309456040
        //    39: lload           4
        //    41: lxor           
        //    42: invokedynamic   BootstrapMethod #1, t:(IJ)Ljava/lang/String;
        //    47: ldc2_w          2578870062694879322
        //    50: lload           4
        //    52: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //    57: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    60: athrow         
        //    61: ldc2_w          2581821550399698467
        //    64: lload           4
        //    66: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //    71: athrow         
        //    72: aload_0        
        //    73: ifnonnull       119
        //    76: new             Ljava/lang/IllegalArgumentException;
        //    79: dup            
        //    80: sipush          6427
        //    83: ldc2_w          6567926285968887453
        //    86: lload           4
        //    88: lxor           
        //    89: invokedynamic   BootstrapMethod #1, t:(IJ)Ljava/lang/String;
        //    94: ldc2_w          2580313248046710136
        //    97: lload           4
        //    99: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   104: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   107: athrow         
        //   108: ldc2_w          2581821550399698467
        //   111: lload           4
        //   113: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   118: athrow         
        //   119: aload_2        
        //   120: ldc2_w          2576732319392602272
        //   123: lload           4
        //   125: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   130: astore_2       
        //   131: aload_1        
        //   132: new             Ljava/util/HashMap;
        //   135: aload_0        
        //   136: dup_x1         
        //   137: dup            
        //   138: pop2           
        //   139: dup            
        //   140: invokespecial   java/util/HashMap.<init>:()V
        //   143: aload_2        
        //   144: sipush          23853
        //   147: ldc2_w          2906670388672236210
        //   150: lload           4
        //   152: lxor           
        //   153: invokedynamic   BootstrapMethod #1, t:(IJ)Ljava/lang/String;
        //   158: ldc2_w          2578870062694879322
        //   161: lload           4
        //   163: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   168: ldc2_w          2582081245417695748
        //   171: lload           4
        //   173: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/google/gson/JsonElement;
        //   178: dup            
        //   179: astore_0       
        //   180: ifnull          257
        //   183: aload_3        
        //   184: iload           6
        //   186: ifeq            256
        //   189: goto            203
        //   192: ldc2_w          2581821550399698467
        //   195: lload           4
        //   197: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   202: athrow         
        //   203: ifnull          257
        //   206: goto            220
        //   209: ldc2_w          2581821550399698467
        //   212: lload           4
        //   214: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   219: athrow         
        //   220: ldc2_w          2576897114561547370
        //   223: lload           4
        //   225: invokedynamic   BootstrapMethod #0, \u00e2:(JJ)Lcom/google/gson/Gson;
        //   230: aload_0        
        //   231: aload_3        
        //   232: ldc2_w          2576603589579028456
        //   235: lload           4
        //   237: invokedynamic   BootstrapMethod #0, U:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object;
        //   242: goto            256
        //   245: ldc2_w          2581821550399698467
        //   248: lload           4
        //   250: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   255: athrow         
        //   256: areturn        
        //   257: aconst_null    
        //   258: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/net/Proxy;Ljava/net/URI;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Class<TT;>;)TT;
        //    StackMapTable: 00 0B FF 00 3D 00 06 07 00 7E 07 00 80 07 00 82 07 00 84 04 01 00 01 07 00 40 0A 63 07 00 40 0A FF 00 48 00 06 07 00 86 07 00 80 07 00 88 07 00 84 04 01 00 01 07 00 40 4A 07 00 84 45 07 00 40 0A 58 07 00 40 4A 07 00 04 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  25     61     61     72     Ljava/lang/IllegalArgumentException;
        //  72     108    108    119    Ljava/lang/IllegalArgumentException;
        //  180    189    192    203    Ljava/lang/IllegalArgumentException;
        //  183    206    209    220    Ljava/lang/IllegalArgumentException;
        //  203    242    245    256    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0203:
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
    
    public static JsonElement m17067(Proxy proxy, URI uri, Map<String, String> map, String s, String s2) {
        return null;
    }
    
    public static String m17068(String s) {
        return null;
    }
    
    static {}
    
    public static <T> T m17069(Proxy proxy, URI uri, Object o, Class<T> clazz) {
        return (T)/* invokedynamic(!) */ProcyonInvokeDynamicHelper_89.invoke(proxy, uri, o, clazz, new HashMap(), -8500010670539686932L, Class551.f8909 ^ 0x235B44E09BC1L);
    }
    
    public static List<String> m17070(Proxy proxy, URI uri) {
        return null;
    }
    
    public static String m17071(Map<String, String> p0) {
        return null;
    }
    
    public static List<String> m17072(Proxy proxy, URI uri, Map<String, String> map) {
        return null;
    }
    
    public static List<String> m17073(HttpURLConnection t) {
        return null;
    }
    
    public static HttpURLConnection m17074(Proxy proxy, URI uri) {
        return null;
    }
    
    public static List<String> m17075(Proxy proxy, URI uri, Map<String, String> map, String s, String s2) {
        return null;
    }
    
    public static JsonElement m17076(Proxy proxy, URI uri, Map<String, String> map) {
        return null;
    }
    
    public static Map<String, String> m17077(Map<String, String> map, String s, String s2) {
        long n = Class551.f8909 ^ 0x29A3893BAA52L;
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_180.invoke(map, ProcyonInvokeDynamicHelper_177.invoke(s, ProcyonInvokeDynamicHelper_176.invoke(-4929610034698308840L, n), -4935169490617764397L, n), ProcyonInvokeDynamicHelper_179.invoke(s2, ProcyonInvokeDynamicHelper_178.invoke(-4929610034698308840L, n), -4935169490617764397L, n), -4928608805159005302L, n);
        return map;
    }
    
    public static void m17078(Proxy proxy, URI uri, Object o) {
        
    }
    
    public static <T> T m17079(Proxy p0, URI p1, Object p2, Class<T> p3, Map<String, String> p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          15598193147778
        //     6: lxor           
        //     7: lstore          5
        //     9: ldc2_w          -1275871412150895186
        //    12: lload           5
        //    14: invokedynamic   BootstrapMethod #0, \u00fa:(JJ)I
        //    19: istore          7
        //    21: aload_0        
        //    22: astore          8
        //    24: aload           8
        //    26: ifnonnull       72
        //    29: new             Ljava/lang/IllegalArgumentException;
        //    32: dup            
        //    33: sipush          13330
        //    36: ldc2_w          5080514686065028627
        //    39: lload           5
        //    41: lxor           
        //    42: invokedynamic   BootstrapMethod #1, t:(IJ)Ljava/lang/String;
        //    47: ldc2_w          -1276403173122363138
        //    50: lload           5
        //    52: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //    57: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    60: athrow         
        //    61: ldc2_w          -1273909373477356635
        //    64: lload           5
        //    66: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //    71: athrow         
        //    72: aload_1        
        //    73: iload           7
        //    75: ifne            139
        //    78: ifnonnull       138
        //    81: goto            95
        //    84: ldc2_w          -1273909373477356635
        //    87: lload           5
        //    89: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //    94: athrow         
        //    95: new             Ljava/lang/IllegalArgumentException;
        //    98: dup            
        //    99: sipush          29535
        //   102: ldc2_w          9159346187568310605
        //   105: lload           5
        //   107: lxor           
        //   108: invokedynamic   BootstrapMethod #1, t:(IJ)Ljava/lang/String;
        //   113: ldc2_w          -1274607199258960420
        //   116: lload           5
        //   118: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   123: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   126: athrow         
        //   127: ldc2_w          -1273909373477356635
        //   130: lload           5
        //   132: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   137: athrow         
        //   138: aload_2        
        //   139: ifnonnull       171
        //   142: aload           8
        //   144: aload_1        
        //   145: aload           4
        //   147: ldc2_w          -1276719775168662148
        //   150: lload           5
        //   152: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/google/gson/JsonElement;
        //   157: goto            231
        //   160: ldc2_w          -1273909373477356635
        //   163: lload           5
        //   165: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   170: athrow         
        //   171: aload           8
        //   173: aload_1        
        //   174: aload           4
        //   176: ldc2_w          -1277710112190283284
        //   179: lload           5
        //   181: invokedynamic   BootstrapMethod #0, \u00e2:(JJ)Lcom/google/gson/Gson;
        //   186: aload_2        
        //   187: ldc2_w          -1273588293252267741
        //   190: lload           5
        //   192: invokedynamic   BootstrapMethod #0, U:(Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String;
        //   197: sipush          11288
        //   200: ldc2_w          8288278225838814725
        //   203: lload           5
        //   205: lxor           
        //   206: invokedynamic   BootstrapMethod #1, t:(IJ)Ljava/lang/String;
        //   211: ldc2_w          -1276403173122363138
        //   214: lload           5
        //   216: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   221: ldc2_w          -1273614759983110270
        //   224: lload           5
        //   226: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/google/gson/JsonElement;
        //   231: astore_0       
        //   232: aload_0        
        //   233: ifnull          310
        //   236: aload_3        
        //   237: iload           7
        //   239: ifne            309
        //   242: goto            256
        //   245: ldc2_w          -1273909373477356635
        //   248: lload           5
        //   250: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   255: athrow         
        //   256: ifnull          310
        //   259: goto            273
        //   262: ldc2_w          -1273909373477356635
        //   265: lload           5
        //   267: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   272: athrow         
        //   273: ldc2_w          -1277710112190283284
        //   276: lload           5
        //   278: invokedynamic   BootstrapMethod #0, \u00e2:(JJ)Lcom/google/gson/Gson;
        //   283: aload_0        
        //   284: aload_3        
        //   285: ldc2_w          -1276844737985742226
        //   288: lload           5
        //   290: invokedynamic   BootstrapMethod #0, U:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object;
        //   295: goto            309
        //   298: ldc2_w          -1273909373477356635
        //   301: lload           5
        //   303: invokedynamic   BootstrapMethod #0, \u00fa:(Ljava/lang/Object;JJ)Ljava/lang/Throwable;
        //   308: athrow         
        //   309: areturn        
        //   310: aconst_null    
        //   311: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/net/Proxy;Ljava/net/URI;Ljava/lang/Object;Ljava/lang/Class<TT;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)TT;
        //    StackMapTable: 00 11 FF 00 3D 00 08 07 00 80 07 00 7E 07 00 04 07 00 84 07 00 82 04 01 07 00 80 00 01 07 00 40 0A 4B 07 00 40 0A 5F 07 00 40 0A 40 07 00 04 54 07 00 40 0A 7B 07 00 86 FF 00 0D 00 08 07 00 86 07 00 7E 07 00 04 07 00 84 07 00 82 04 01 07 00 80 00 01 07 00 40 4A 07 00 84 45 07 00 40 0A 58 07 00 40 4A 07 00 04 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  24     61     61     72     Ljava/lang/IllegalArgumentException;
        //  72     81     84     95     Ljava/lang/IllegalArgumentException;
        //  78     127    127    138    Ljava/lang/IllegalArgumentException;
        //  139    160    160    171    Ljava/lang/IllegalArgumentException;
        //  232    242    245    256    Ljava/lang/IllegalArgumentException;
        //  236    259    262    273    Ljava/lang/IllegalArgumentException;
        //  256    295    298    309    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0256:
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
    
    public static JsonElement m17080(HttpURLConnection in) {
        return null;
    }
    
    public static IllegalStateException m1393(Throwable t) {
        return new IllegalStateException((Throwable)null);
    }
    
    public static String m117(byte[] array) {
        return null;
    }
    
    public static String m153(int n, long n2) {
        return null;
    }
    
    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        return null;
    }
    
    public static CallSite m120(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    public static int m2808(int n, long n2) {
        return 0;
    }
    
    public static int m2809(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        return 0;
    }
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    public static int m121(long n, long n2) {
        return 0;
    }
    
    public static void m122() {
        
    }
    
    public static Class m123(long n, long n2) {
        return null;
    }
    
    public static Field m124(Class clazz, String anObject, Class clazz2) {
        return null;
    }
    
    public static Field m125(Class clazz, String s, Class clazz2) {
        return null;
    }
    
    public static Field m126(long n, long n2) {
        return null;
    }
    
    public static Method m127(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static Method m128(Class clazz, String s, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static Method m129(long n, long n2) {
        return null;
    }
    
    public static MethodHandle m130(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType methodType, long n, long n2) {
        return null;
    }
    
    public static Object m131(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType newType, Object[] array) {
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
        
        public static HttpURLConnection invoke(Object p0, Object p1, long p2, long p3) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static JsonElement invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static HashMap invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Proxy invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static URI invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static JsonElement invoke(Object p0, Object p1, long p2, long p3) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static JsonObject invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static JsonElement invoke(Object p0, Object p1, long p2, long p3) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Object invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static HashMap invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Object invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Logger invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Charset invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static byte[] invoke(Object p0, Object p1, long p2, long p3) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static int invoke(long p0, long p1) {
        return 0;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static HttpURLConnection invoke(Object p0, Object p1, long p2, long p3) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Set invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Iterator invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static OutputStream invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, Object p1, long p2, long p3) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, long p1, long p2) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static JsonElement invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, long p1, long p2) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, Object p1, long p2, long p3) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static JsonElement invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static int invoke(long p0, long p1) {
        return 0;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static HashMap invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static boolean invoke(Object p0, Object p1, long p2, long p3) {
        return false;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static boolean invoke(Object p0, Object p1, long p2, long p3) {
        return false;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static HashMap invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Object invoke(Object p0, Object p1, long p2, long p3) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static HashMap invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Object invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static HashMap invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Proxy invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static URI invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static JsonElement invoke(Object p0, Object p1, long p2, long p3) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static JsonObject invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static JsonElement invoke(Object p0, Object p1, long p2, long p3) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Object invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static HashMap invoke(long p0, long p1) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Object invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        return null;
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Logger invoke(long p0, long p1) {
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static Future invoke(Object p0, long p1, long p2) {
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
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
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_81
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
        
        public static Pattern invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_82
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
        
        public static GsonBuilder invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_83
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
        
        public static Gson invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_84
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
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_85
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
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_86
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
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_87
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
        
        public static String invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_88
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
        
        public static Map invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_89
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
        
        public static Object invoke(Object p0, Object p1, Object p2, Object p3, Object p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_90
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
        
        public static HttpURLConnection invoke(Object p0, Object p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_91
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
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_92
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
        
        public static List invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_93
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
        
        public static int invoke(long p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_94
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
        
        public static HttpURLConnection invoke(Object p0, Object p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_95
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
        
        public static Set invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_96
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
        
        public static Iterator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_97
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
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_98
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
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_99
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
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_100
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
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_101
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
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_102
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
        
        public static List invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_103
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_104
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
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_105
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
        
        public static List invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_106
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
        
        public static int invoke(long p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_107
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
        
        public static int invoke(Object p0, long p1, long p2) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_108
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
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_109
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_110
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
        
        public static int invoke(Object p0, long p1, long p2) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_111
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
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_112
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
        
        public static InputStream invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_113
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_114
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
        
        public static InputStream invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_115
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
        
        public static InputStream invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_116
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
        
        public static Charset invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_117
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
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_118
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
        
        public static boolean invoke(Object p0, Object p1, long p2, long p3) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_119
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_120
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_121
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
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_122
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_123
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
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_124
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_125
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
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_126
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
        
        public static void invoke(Object p0, Object p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_127
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
        
        public static URL invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_128
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
        
        public static URLConnection invoke(Object p0, Object p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_129
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
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_130
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
        
        public static void invoke(Object p0, int p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_131
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
        
        public static void invoke(Object p0, int p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_132
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
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_133
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
        
        public static Charset invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_134
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
        
        public static byte[] invoke(Object p0, Object p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_135
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
        
        public static int invoke(long p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_136
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
        
        public static HttpURLConnection invoke(Object p0, Object p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_137
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
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_138
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
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_139
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
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_140
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
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_141
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
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_142
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
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_143
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
        
        public static String invoke(int p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_144
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
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_145
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
        
        public static Set invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_146
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
        
        public static Iterator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_147
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
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_148
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
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_149
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
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_150
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
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_151
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
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_152
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_153
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
        
        public static OutputStream invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_154
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
        
        public static void invoke(Object p0, Object p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_155
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
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_156
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
        
        public static List invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_157
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_158
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
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_159
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
        
        public static void invoke(Object p0, Object p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_160
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
        
        public static List invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_161
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
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_162
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
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_163
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
        
        public static int invoke(long p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_164
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
        
        public static HttpURLConnection invoke(Object p0, Object p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_165
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
        
        public static Set invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_166
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
        
        public static Iterator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_167
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
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_168
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
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_169
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
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_170
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
        
        public static Object invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_171
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
        
        public static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_172
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
        
        public static JsonElement invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_173
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_174
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
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_175
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
        
        public static JsonElement invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_176
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
        
        public static Charset invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_177
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
        
        public static String invoke(Object p0, Object p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_178
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
        
        public static Charset invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_179
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
        
        public static String invoke(Object p0, Object p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_180
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
        
        public static Object invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_181
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
        
        public static Object invoke(Object p0, Object p1, Object p2, Object p3, long p4, long p5) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_182
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
        
        public static int invoke(long p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_183
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
        
        public static int invoke(Object p0, long p1, long p2) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_184
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
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_185
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_186
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
        
        public static int invoke(Object p0, long p1, long p2) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_187
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
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_188
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
        
        public static InputStream invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_189
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_190
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
        
        public static InputStream invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_191
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_192
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
        
        public static Gson invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_193
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
        
        public static Charset invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_194
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
        
        public static Object invoke(Object p0, Object p1, Object p2, long p3, long p4) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_195
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_196
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_197
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
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_198
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
        
        public static Throwable invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_199
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
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_200
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
        
        public static void invoke(Object p0, Object p1, long p2, long p3) {
        
    }
    }
}
