// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.core.command.processing;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import org.rusherhack.Class066;
import java.lang.invoke.MethodHandles;
import org.rusherhack.core.setting.Setting;
import java.util.Iterator;
import org.rusherhack.core.command.CommandData$MethodData;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.rusherhack.core.command.CommandManager;
import java.util.StringJoiner;
import java.util.ArrayList;
import java.util.HashSet;
import org.rusherhack.core.command.CommandData;
import java.util.LinkedHashMap;
import java.util.function.Consumer;

import org.rusherhack.command.clear;
public class CommandProcessingSink implements Consumer<String>
{
    public LinkedHashMap<CommandData, HashSet<CommandProcessingSink$MethodProcessor>> candidates;
    public ArrayList<String> arguments;
    public CommandData commandData;
    public CommandProcessor commandProcessor;
    public StringBuilder inputBuffer;
    public CommandProcessingSink$MethodProcessor f1549;
    public StringJoiner commandString;
    public CommandManager commandManager;
    public static long f1550;
    public static String[] f1551;
    public static String[] f1552;
    public static Map f1553;
    public static Object[] f1554;
    public static String[] f1555;
    
    public CommandProcessingSink$ProcessedCommand finish() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          14010272261135
        //     6: lxor           
        //     7: lstore_1       
        //     8: invokestatic    org/rusherhack/core/command/processing/CommandProcessor.\u0149:()[Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_0        
        //    13: astore          5
        //    15: aload           5
        //    17: getfield        org/rusherhack/core/command/processing/CommandProcessingSink.commandData:Lorg/rusherhack/core/command/CommandData;
        //    20: ifnonnull       51
        //    23: new             Lorg/rusherhack/core/command/exceptions/UnknownCommandException;
        //    26: dup            
        //    27: aload           5
        //    29: getfield        org/rusherhack/core/command/processing/CommandProcessingSink.inputBuffer:Ljava/lang/StringBuilder;
        //    32: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    35: ldc             "Unknown command: "
        //    37: swap           
        //    38: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    43: invokespecial   org/rusherhack/core/command/exceptions/UnknownCommandException.<init>:(Ljava/lang/String;)V
        //    46: athrow         
        //    47: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    50: athrow         
        //    51: aconst_null    
        //    52: astore          9
        //    54: iconst_0       
        //    55: istore          8
        //    57: aload           5
        //    59: getfield        org/rusherhack/core/command/processing/CommandProcessingSink.candidates:Ljava/util/LinkedHashMap;
        //    62: invokevirtual   java/util/LinkedHashMap.keySet:()Ljava/util/Set;
        //    65: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    70: astore          7
        //    72: aload           7
        //    74: invokeinterface java/util/Iterator.hasNext:()Z
        //    79: ifeq            348
        //    82: aload           7
        //    84: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    89: checkcast       Lorg/rusherhack/core/command/CommandData;
        //    92: astore          6
        //    94: aload           5
        //    96: getfield        org/rusherhack/core/command/processing/CommandProcessingSink.candidates:Ljava/util/LinkedHashMap;
        //    99: aload           6
        //   101: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   104: checkcast       Ljava/util/HashSet;
        //   107: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   110: astore          6
        //   112: aload           6
        //   114: invokeinterface java/util/Iterator.hasNext:()Z
        //   119: ifeq            72
        //   122: aload           6
        //   124: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   129: checkcast       Lorg/rusherhack/core/command/processing/CommandProcessingSink$MethodProcessor;
        //   132: astore_0       
        //   133: aload           5
        //   135: dup            
        //   136: aload_0        
        //   137: putfield        org/rusherhack/core/command/processing/CommandProcessingSink.Y:Lorg/rusherhack/core/command/processing/CommandProcessingSink$MethodProcessor;
        //   140: getfield        org/rusherhack/core/command/processing/CommandProcessingSink.arguments:Ljava/util/ArrayList;
        //   143: aload_0        
        //   144: getfield        org/rusherhack/core/command/processing/CommandProcessingSink$MethodProcessor.\u0439:I
        //   147: aload           5
        //   149: getfield        org/rusherhack/core/command/processing/CommandProcessingSink.arguments:Ljava/util/ArrayList;
        //   152: invokevirtual   java/util/ArrayList.size:()I
        //   155: invokevirtual   java/util/ArrayList.subList:(II)Ljava/util/List;
        //   158: iconst_0       
        //   159: anewarray       Ljava/lang/String;
        //   162: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   167: checkcast       [Ljava/lang/String;
        //   170: astore          4
        //   172: iconst_1       
        //   173: dup            
        //   174: dup            
        //   175: pop2           
        //   176: istore          10
        //   178: aload_0        
        //   179: aload           4
        //   181: invokevirtual   org/rusherhack/core/command/processing/CommandProcessingSink$MethodProcessor.process:([Ljava/lang/String;)V
        //   184: aload_0        
        //   185: aload_3        
        //   186: ifnull          89
        //   189: aload_3        
        //   190: ifnull          357
        //   193: goto            263
        //   196: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   199: athrow         
        //   200: astore          4
        //   202: aload           4
        //   204: instanceof      Lorg/rusherhack/core/command/exceptions/BadSyntaxException;
        //   207: aload_3        
        //   208: ifnull          238
        //   211: ifeq            262
        //   214: goto            221
        //   217: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   220: athrow         
        //   221: aload           4
        //   223: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   226: ldc             "few"
        //   228: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   231: goto            238
        //   234: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   237: athrow         
        //   238: aload_3        
        //   239: ifnull          260
        //   242: ifeq            262
        //   245: goto            252
        //   248: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   251: athrow         
        //   252: iconst_0       
        //   253: goto            260
        //   256: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   259: athrow         
        //   260: istore          10
        //   262: aload_0        
        //   263: getfield        org/rusherhack/core/command/processing/CommandProcessingSink$MethodProcessor.\u0439:I
        //   266: aload_0        
        //   267: invokevirtual   org/rusherhack/core/command/processing/CommandProcessingSink$MethodProcessor.getParsedArguments:()Ljava/util/LinkedHashMap;
        //   270: invokevirtual   java/util/HashMap.size:()I
        //   273: iadd           
        //   274: istore          4
        //   276: aload           9
        //   278: ifnull          337
        //   281: iload           10
        //   283: aload_3        
        //   284: ifnull          328
        //   287: goto            294
        //   290: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   293: athrow         
        //   294: ifeq            326
        //   297: goto            304
        //   300: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   303: athrow         
        //   304: iload           4
        //   306: aload_3        
        //   307: ifnull          119
        //   310: goto            317
        //   313: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   316: athrow         
        //   317: iload           8
        //   319: if_icmplt       112
        //   322: aload_0        
        //   323: goto            338
        //   326: iload           4
        //   328: aload_3        
        //   329: ifnull          119
        //   332: iload           8
        //   334: if_icmple       112
        //   337: aload_0        
        //   338: astore          9
        //   340: iload           4
        //   342: istore          8
        //   344: aload_3        
        //   345: ifnonnull       112
        //   348: aload           5
        //   350: aload           9
        //   352: putfield        org/rusherhack/core/command/processing/CommandProcessingSink.Y:Lorg/rusherhack/core/command/processing/CommandProcessingSink$MethodProcessor;
        //   355: aload           9
        //   357: aload_3        
        //   358: ifnull          389
        //   361: ifnonnull       387
        //   364: goto            371
        //   367: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   370: athrow         
        //   371: new             Lorg/rusherhack/core/command/exceptions/BadSyntaxException;
        //   374: dup            
        //   375: ldc             "Invalid syntax"
        //   377: aload           5
        //   379: invokespecial   org/rusherhack/core/command/exceptions/BadSyntaxException.<init>:(Ljava/lang/String;Lorg/rusherhack/core/command/processing/CommandProcessingSink;)V
        //   382: athrow         
        //   383: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   386: athrow         
        //   387: aload           9
        //   389: aload_3        
        //   390: ifnull          418
        //   393: getfield        org/rusherhack/core/command/processing/CommandProcessingSink$MethodProcessor.\u02ae:Lorg/rusherhack/core/command/exceptions/CommandException;
        //   396: ifnull          416
        //   399: goto            406
        //   402: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   405: athrow         
        //   406: aload           9
        //   408: getfield        org/rusherhack/core/command/processing/CommandProcessingSink$MethodProcessor.\u02ae:Lorg/rusherhack/core/command/exceptions/CommandException;
        //   411: athrow         
        //   412: invokestatic    org/rusherhack/core/command/processing/CommandProcessingSink.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   415: athrow         
        //   416: aload           9
        //   418: invokevirtual   org/rusherhack/core/command/processing/CommandProcessingSink$MethodProcessor.processed:()Lorg/rusherhack/core/command/processing/CommandProcessingSink$ProcessedCommand;
        //   421: areturn        
        //    StackMapTable: 00 28 FF 00 2F 00 05 07 00 02 04 07 00 95 00 07 00 02 00 01 07 00 2C 03 FF 00 14 00 09 07 00 05 04 07 00 95 00 07 00 02 00 07 00 68 01 07 00 0C 00 00 50 07 00 05 FF 00 16 00 09 07 00 05 04 07 00 95 00 07 00 02 07 00 68 07 00 68 01 07 00 0C 00 00 46 01 FF 00 4C 00 0A 07 00 0C 04 07 00 95 07 00 95 07 00 02 07 00 68 07 00 68 01 07 00 0C 01 00 01 07 00 2C 43 07 00 2C FF 00 10 00 0A 07 00 0C 04 07 00 95 07 00 2C 07 00 02 07 00 68 07 00 68 01 07 00 0C 01 00 01 07 00 2C 03 4C 07 00 2C 43 01 49 07 00 2C 03 43 07 00 2C 43 01 01 FF 00 00 00 0A 07 00 0C 04 07 00 95 07 00 05 07 00 02 07 00 68 07 00 68 01 07 00 0C 01 00 01 07 00 0C FF 00 1A 00 0A 07 00 0C 04 07 00 95 01 07 00 02 07 00 68 07 00 68 01 07 00 0C 01 00 01 07 00 2C 43 01 45 07 00 2C 03 48 07 00 2C 43 01 08 41 01 08 40 07 00 0C FF 00 09 00 09 07 00 05 04 07 00 95 00 07 00 02 00 07 00 68 01 07 00 0C 00 00 48 07 00 0C 49 07 00 2C 03 4B 07 00 2C 03 41 07 00 0C 4C 07 00 2C 03 45 07 00 2C 03 41 07 00 0C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  15     47     47     51     Ljava/lang/Exception;
        //  178    184    200    263    Ljava/lang/Exception;
        //  189    196    196    200    Ljava/lang/Exception;
        //  202    214    217    221    Ljava/lang/Exception;
        //  211    231    234    238    Ljava/lang/Exception;
        //  238    245    248    252    Ljava/lang/Exception;
        //  242    253    256    260    Ljava/lang/Exception;
        //  276    287    290    294    Ljava/lang/Exception;
        //  281    297    300    304    Ljava/lang/Exception;
        //  294    310    313    317    Ljava/lang/Exception;
        //  357    364    367    371    Ljava/lang/Exception;
        //  361    383    383    387    Ljava/lang/Exception;
        //  389    399    402    406    Ljava/lang/Exception;
        //  393    412    412    416    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0294:
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
    
    public String getCommandString() {
        long n = CommandProcessingSink.f1550 ^ 0x53F55B5CEAD4L;
        return this.commandString.toString();
    }
    
    public static String m1291(String s) {
        long n = CommandProcessingSink.f1550 ^ 0x2A6A869BE226L;
        int n2 = 3;
        int n3 = n2 << n2 ^ 0x5;
        int n4 = (0x3 ^ 0x5) << 3 ^ 0x5;
        String s2;
        int length = (s2 = s).length();
        char[] array = new char[length];
        int n5;
        int i = n5 = length - 1;
        char[] value = array;
        char c = (char)n4;
        int n6 = n3;
        while (i >= 0) {
            char[] array2 = value;
            String s3 = s2;
            int index = n5;
            char char1 = s3.charAt(index);
            --n5;
            array2[index] = (char)(char1 ^ n6);
            if (n5 < 0) {
                break;
            }
            char[] array3 = value;
            String s4 = s2;
            int index2 = n5--;
            array3[index2] = (char)(s4.charAt(index2) ^ c);
            i = n5;
        }
        return new String(value);
    }
    
    public CommandProcessingSink$MethodProcessor getCurrentEntry() {
        return null;
    }
    
    public List<String> getArguments() {
        long n = CommandProcessingSink.f1550 ^ 0x3FE034AF5B5EL;
        return this.arguments;
    }
    
    @Override
    public void accept(String e) {
        
    }
    
    public CommandData getCommandData() {
        long n = CommandProcessingSink.f1550 ^ 0xF84388A774BL;
        return this.commandData;
    }
    
    public CommandProcessingSink(CommandManager commandManager, CommandProcessor commandProcessor) {
    }
    
    static {
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
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/core/command/processing/CommandProcessingSink.m120:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
        Object[] f1554 = CommandProcessingSink.f1554;
        f1554[0] = "G\u000f\u0016Io.[\u0015\u0014\u0015u:K\u0016_\u0004r)MS\u0012\bp6I\u0013\u0015Im)G\u001e\u0014\u0014n2F\u001a_$r6E\u001c\u001f\u0003M)G\u001e\u0014\u0014n2F\u001a\"\u000es0";
        f1554[1] = "\u0003CYN\fQ\u001dKC\u0001qP\u001bKAHhK\u0000LJ]";
        f1554[2] = "%\u001eq`N1.\u0011`/3)=\u0016if";
        f1554[3] = "?Yr.u4!Qhk\u001250Je143";
        f1554[4] = "=l3;\u0007:6c\"tf4=h&.";
        f1554[5] = "bX'\tL\u0014|P=F*\u0000{Q\u0002\r\u0016";
        f1554[6] = Boolean.TYPE;
        CommandProcessingSink.f1555[6] = "java/lang/Boolean";
        f1554[7] = "X~.\bH_Sq?G%[Sm\u000b\f\u0017FWq;\f";
        f1554[8] = """
                   \u000eOh\u001d)\r\u0012UjA3\u0019\u0002V!P4
                   \u0004\u0013l\6\u0015\u0000Sk\u001d+
                   \u000e^j@(\u0011\u000fZ!p4\u0015\f\\aW\u000b
                   \u000e^j@(\u0017\u0013""";
        f1554[9] = "([Ngt{]{Ehe4 cVol}H";
        f1554[10] = "hz\u0010W*3vr\n\u0018H/lp\u0003RL'qs+Wt";
        f1554[11] = "\rm\f\u0015C\u0005\u0006b\u001dZ>\u001d\u0015e\u0014\u0013/\u001c\u000e`\u001e\u0011\u001f";
        f1554[12] = " D+<5\u001b<^)`/\u000f,]bq(\u001c*\u0018/}*\u0003.X(<\u0004\u0001\"[-|#*.B-";
        f1554[13] = "wEsq~0k_q-d${\\:<c7}\u0019w0a(yYpqO*uZu1h\byYu8i7";
        f1554[14] = "(9/RzY#6>\u001d\u0011M!=)G=Z,";
        f1554[15] = "=IHh\u0017)#AR'x.%IGEP/#";
        f1554[16] = "\bb\u0001o=|\u0016j\u001b _`\u0011w";
        f1554[17] = Void.TYPE;
        CommandProcessingSink.f1555[17] = "java/lang/Void";
        f1554[18] = "t\"M\u0002sxh8O^ilx;\u0004On\u007f~~OZdco~YYc~x\"CNd#H%H_b\u007fr2O^Clh5";
        f1554[19] = "cFe(M$\u007f\\gtW0o_,eP#i\u001aaiR<mZf(O#cWguL8bS,EP<aUlbo#cWguL8bSQoQ:(ygrW>hdpi\\4\u007fGmt";
        f1554[20] = "4\u0013zW\\N(\tx\u000bFZ8\n3\u04d9";
        f1554[21] = "5TTz5(+\\N5H8+";
        f1554[22] = " awpT\u0006UA|\u007fEI4OwtA\u0013@";
        f1554[23] = "/\u001c\f/\u001dEZ<\u0007 \f\n;2\f+\bPO";
        f1554[24] = """
                    m
                    N$\u0017qq\u0010Lx\rea\u0013\u0007i
                    vgVJe\bic\u0016M$\u0000|a\u001dY~\fkl\u000b\u0007I
                    io\u0019Gn |a\u001dY~\fkl""";
        f1554[25] = Integer.TYPE;
        CommandProcessingSink.f1555[25] = "java/lang/Integer";
        f1554[26] = "V=\u0018n0kJ'\u001a2*\u007fZ$Q#-l\\a\u001c//sX!\u001bn2lV,\u001a31wW(Q\u0003-sT.\u0011$\u0012lV,\u001a31wW(,),u\u001d\u001f\r/!{J<\u001a$\u0001qT\"\u001e.&";
        f1554[27] = "\u0012u\u0004\u001fQ4gU\u000f\u0010@{\u001aM\u001c\u0017I2r";
        f1554[28] = "m@l2-\u000bqZnn7\u001faY%\u007f0\fg\u001cxy+\nk\\l2\f\u001bvFbr8";
        f1554[29] = "I'?TJm<\u00074[[\"A\u001f'\\Rk)";
        f1554[30] = "G}\u007fhq\u00182]tg`WOEg`i\u001e'";
        f1554[31] = Character.TYPE;
        CommandProcessingSink.f1555[31] = "java/lang/Character";
        f1554[32] = "\nT\u0010\u0005|\\\r\u0005^\b\u0006S]K\u0013b=\u000f_I^\u0007oSWGo";
        f1554[33] = "f\u0013K#Z]r\u0011O*6\u000eg\u0006m-L\u001ag\u0016|>Y\u001co\u0017S8Ma5GH5\n\u001av\u0019K>6";
        f1554[34] = "\u001b\";\u00012_\u000f{l\u0004K\u01e1v'k_{U\u0010!4\u000e48L$jW&^J{;\u0018K";
        f1554[35] = "\u001e\"O\u0014I%\u0014~\u001d\u0015\"vI.p\u001e\u0018pWs\u0015LDxYBL\u001a\u001c`F<\u001bTC\"%";
        f1554[36] = "LxS{#,J'\u00024N!\u0011'\u0017\"/,\rAV$\u007f{\u0013z\u0002{p3v}Tu1)\b*\u001a*sJ";
        f1554[37] = "6n.04nnm%cH\u0152\u000bi44sv5u,,9\u0013";
        f1554[38] = "s~Me3\u000e0 Nn\u000f\r1?0/5\u001a>rU}i\u00120C\u000b.`\u0007}&Yrh\tLx\n{}D)*Vssu";
        f1554[39] = "WW\u0001\u007fh>\u0003UIiV E\u0001\t|*&ClIz)&C\u0005N+g+9";
        f1554[40] = "W0MR\u0016W\u0005l\u0016\u0019*\u0015\u0000V\u0000\u0011K\u000f\b\rFR\u0012Y\nk@\rC\u0016g";
        f1554[41] = "F[X3YS^\u0001\u0002'cVK.B-\n[,\b\b/\u0007VO\t\u0005nX*CW@3\u001fIBZ\u0001lc";
        f1554[42] = "Qt$\u0013\u0018>\u0007re\"\u0014R\u000edp\u0019\u0016#Q.b\u0019}cFp&I\f<\u0006b&\"";
        f1554[43] = "4\u000bH\rpyfW\u0013FL.|N\u0014R G>\u000fA\u0004!!8P\u0010KLw9\u0007@\br%e\\\u000b4";
        f1554[44] = "?\u0007Xpf\u00179X\t?\u000b\u0015hX\u000f<kqeR\u000b!1\u0018\u007fS\u0006<\u000b";
        f1554[45] = "o(\u0005f.X9.DW*Ry<@\u001d6Zo,FW{\t0x\u0000i)Uk3";
        f1554[46] = "<\u0000im1\u00002\u001f\u007f&\u000e\u0017m\u0000aFs\u0013G\u0001hxg\u001f`f7$6Ia\u00001{g\u0006\fVky~FuXto5y";
        f1554[47] = "\u0015Zb\u0005,G\u001f\u00060\u0004G\u001cRW'];\u001aT:g[8\u001aTS`\nv\u0017.";
        f1554[48] = "<]Z,\b.5W\u0019&6=2\nN$6=?\u0015\u00168Xf*\u0004K^";
        f1554[49] = "\u0018\u0012\u001d\bBeN\u0014\\9Ln\u0013\u001eM_KR\n\u0001E_H\t\u0007DHUUgN\u0000\u001f";
        f1554[50] = "NI\u0000^O\u0001W\\RO\"G%\u0016\u0004\u001e\u0012\u0006C\u0010[O]k\u001f\u0015\u0005\u0016O\r\u0019JTY\"";
        f1554[51] = "m\u001cAG\u0017Ky\u001eEN{\u02d1\u0001\u0015\u0000M\t\u0012qNBA@";
        f1554[52] = "w\u0010E\n<EqO\u0014EQH-@\u0007s-#-E\u0016[kJ7D\u001bFQG3\u0013\u0007U5J+Y\f:";
        f1554[53] = "\u007fkw_Udva4Ukgt#g-\u000bp~00D\u0011qs-\n";
        f1554[54] = "\u0006xtovKO<#\u0003mI\u001bG%l5\u0014\u0012|q3:\\w6'ohW\u0019\u007fc8\u0004";
        f1554[55] = "c3ifu\u001d;gr:M\u0517\u00012}lv\u0013?.et<v";
        f1554[56] = "[c\t\u0000\u0001h\reH1\u000fcPoYW\bH\\vY1TbQz\u000fHZ}G1";
        f1554[57] = "mh\u000f-\u0005iyj\u000b$i-{f\u001a'\u0012.lmq+\u0002+9?\u001a(\u000608\u0001";
        f1554[58] = "/X|j\\ty^=[R\u007f$T,=U](W,4TbA\u0000,6C -@(6]";
        f1554[59] = "7y{KF]>s8AxL1/\u0006\u0002BJ/rcP\u001eB!C:\u0006FZ>=mH\u0019\u0018]";
        f1554[60] = "\u00011\u0012pp<\u0019kHdJ$\u0017`\b}6\"\u0011\rH{5\"\u0011dO*{/k";
        f1554[61] = "\u0015=\"\u001b&:C;c**,\u0014)~G%*\u0000Tq\u0010>$E,x\u001a}.";
        f1554[62] = """
                    L3V9vC\u00140]j
                    \u00eeq4L=1[O(T%{>\u001a9TklPA,E6
                    """;
        f1554[63] = "\"#2!\u0001xa}1*=`po\u0014=A\u0003s%=:\u0003|''u,=";
        f1554[64] = ")oh\u001d`~=ml\u0014\f:?a}\u0017w9Eb|\u001d7'{~d\u0005}B.odKj,uzu\u0016\f";
        f1554[65] = ")#gu;/`g0\u00195&\u0003`qx/.X&2!y,> mp6A";
        f1554[66] = "kTN]0seKX\u0016\u000fe6No@sj<^Q-e6;V\u0010T}laB*";
        f1554[67] = "L}{:}=Ew80C>[-B)89&'j#\"\u007fO=k.?EF+m)y,\\*`4C/\u001a'br:7@}vH";
        f1554[68] = "S94\u0004\u000eq\u0005?u5\u0002vV=uIk'\u0004h=X\r![9r5\u0000tOak[[a^<\r";
        f1554[69] = "[E\u000f_G_\rCNnIZS@W\u0002KOXW6Q\u001fND\u0010M\u0012AMO";
        f1554[70] = "BC\u001dT_I\u0002G\u001dJgJ\u001eV;I\u0002@\u001aL\u001cb\u000eY\u001a*J\u0017_\u0015\u001eLLH\u000eZs\u001a\u0016J\u0017\u001a\n\u0014\t\\\\%";
        f1554[71] = "]iL\u001d%\u000f\u000bo\r,\u0011c_i\u000bK,_Kk\u000fB";
        f1554[72] = "X1--1\f_`c K\u0005\u000b%\u0014';\u0019bbmt4\u0006\u001c5#+ve";
        f1554[73] = "VmBi\u001fg\u00041\u0019\"#8\u001d\u001d\u0016(_(flLn\\:\u0018;\u00021\u001eY";
        f1554[74] = "eOqcpz&\u0011rhLz;\u0000a\u0012,m1\u00136{6l<\u000e\f";
        f1554[75] = "|f{fI*#&if\"4 cS0Y $p{]\u0018bu/{;\u001e=$`\u0016";
        f1554[76] = "\"\u0014]6&faJ^=\u001arpU | ro\u0018E.|za)\u001b}uo,LI!}a\u001d";
        f1554[77] = "7z\u0018`3S#x\u001ci_\u045e[s\nl>U2i\u000ba#";
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
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/core/command/processing/CommandProcessingSink.m132:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
