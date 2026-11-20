// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.hud.impl;

import java.lang.reflect.UndeclaredThrowableException;
import net.minecraft.world.World;
import org.rusherhack.core.setting.Setting;
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
import org.rusherhack.client.api.Globals;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Date;
import java.util.Map;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.client.api.feature.hud.TextHudElement;

public class Time extends TextHudElement
{
    public EnumSetting<TimeFormat> format;
    public BooleanSetting seconds;
    public EnumSetting<TimeMode> mode;
    public BooleanSetting amPm;
    public StringSetting hMmSsA;
    public static long f8524;
    public static String[] f8525;
    public static String[] f8526;
    public static Map f8527;
    public static long[] f8528;
    public static Integer[] f8529;
    public static Map f8530;
    public static long[] f8531;
    public static Long[] f8532;
    public static Map f8533;
    public static Object[] f8534;
    public static String[] f8535;
    
    public Date m16377(long n) {
        long n2 = Time.f8524 ^ 0x212CE2C30EECL;
        long n3 = (n = n - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_1.invoke(27235, 0x51B22F500C8556E0L ^ n2) + /* invokedynamic(!) */ProcyonInvokeDynamicHelper_2.invoke(27431, 0x4311DACAC8AF57A5L ^ n2)) / /* invokedynamic(!) */ProcyonInvokeDynamicHelper_3.invoke(27186, 0x44BBCFA1654856B3L ^ n2);
        long n4 = (n -= n3 * /* invokedynamic(!) */ProcyonInvokeDynamicHelper_4.invoke(27186, 0x44BBCFA1654856B3L ^ n2)) / /* invokedynamic(!) */ProcyonInvokeDynamicHelper_5.invoke(24124, 0x79A982C0ADABE2BCL ^ n2);
        long n5 = (long)Math.floor((n -= n4 * /* invokedynamic(!) */ProcyonInvokeDynamicHelper_6.invoke(15061, 0x7BE1A078F6E0653L ^ n2)) / 16.666666666666668);
        n = (long)Math.floor((n - n5 * 16.666666666666668) / 0.2777777777777778);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ENGLISH);
        int n6 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_7.invoke(24106, 0x3C57150AAA75D027L ^ n2);
        Calendar calendar = instance;
        int n7 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_8.invoke(27288, 0x53C53520A349E496L ^ n2);
        int n8 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_9.invoke(28743, 0x6C5B5111D1D87E48L ^ n2);
        Calendar calendar2 = instance;
        int n9 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_10.invoke(7592, 0x11AABC07006E13A4L ^ n2);
        int year = 0;
        Calendar calendar3 = instance;
        calendar3.setLenient(true);
        int hourOfDay = 0;
        int date = 1;
        int n10 = 0;
        calendar3.set(year, n10, date, hourOfDay, n10, 0);
        calendar2.add(n9, (int)n3);
        calendar2.add(n8, (int)n4);
        calendar.add(n7, (int)n5);
        calendar.add(n6, (int)n + 1);
        return calendar.getTime();
    }
    
    public Time() {
    }
    
    public String getText() {
        return null;
    }
    
    static {
    }
    
    public static MatchException m285(MatchException ex) {
        return ex;
    }
    
    public static String m221(byte[] array) {
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
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Time.m174:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static CallSite m265(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Time.m265:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static CallSite m671(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Time.m671:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
    
    public static void m273() {
        Object[] f8534 = Time.f8534;
        f8534[0] = "s\t\u0017z\u0010do\u0013\u0015&\np\u007f\u0010^\u0252";
        f8534[1] = Integer.TYPE;
        Time.f8535[1] = "java/lang/Integer";
        f8534[2] = "@\u001fz\u001e-\u001f\\\u0005xB7\u000bL\u00063\u00f2";
        f8534[3] = "<8]\u0002$}77LMEs<<H\u0017";
        f8534[4] = Boolean.TYPE;
        Time.f8535[4] = "java/lang/Boolean";
        f8534[5] = "y\u0011\u0015>W]e\u000b\u0017bMIu\b\\\u04c3";
        f8534[6] = "\u0002\u001f\u0018\u0002h)\u001e\u0005\u001a^r=\u000e\u0006QOu.\bC\fIn(\u0004\u0003\u0018\u0002_2\u0018\u0000,In(\u0004\u0003\u0018";
        f8534[7] = "G!l+W\u0002L.}d4\u000fY#r\u000f\u0001\rH0n#\u0016\u0000";
        f8534[8] = "lnhFH.ptj\u001aR:`w!\u000bU)f2|\rN/jrhFi>whf\u0006]";
        f8534[9] = "l6\u0007<,\u0019p,\u0005`6\r`/Nq1\u001efj\u0003}3\u0001b*\u0004<.\u001el'\u0005a-\u0005m#NQ1\u0001n%\u000ev\u000e\u001el'\u0005a-\u0005m#3{0\u0007";
        f8534[10] = "i\u0012*$J\u0002b\u001d;k7\u001aq\u001a2\"";
        f8534[11] = "\u0003t@\u001d6A\fmBRK\\\u0004eZ\u0019\\T\u001dpp\u0013jX\ba";
        f8534[12] = "\n$\t|'\u0002\u0014,\u00133M\u0016\u0014 ";
        f8534[13] = "<xVL4{ bT\u0010.o0a\u001f\u0491";
        f8534[14] = ")b\u0007V%o\"m\u0016\u0019Il,o\u0014Ve";
        f8534[15] = "l?ps\b$l?g/\u0004+vtg1\u0004>q\u00052n]";
        f8534[16] = Long.TYPE;
        Time.f8535[16] = "java/lang/Long";
        f8534[17] = "\txrlsv\u0015bp0ib\u0005a;!nq\u0003$f'uw\u000fdrlRw\u0014c{%Rf\u0012~|,f";
        f8534[18] = "$yTS\u001c\u00058cV\u000f\u0006\u0011(`\u001d\u001e\u0001\u0002.%@\u0018\u001a\u0004\"eTS,\u001f$gV\u001c\u0000#.\u007fG\u0014\u0000\u0017";
        f8534[19] = ":s]wl~&i_+vj6j\u0014:rb0oNw\u007f{</}5qi4mI";
        f8534[20] = "\u0000\u0014\u0003<\u000eV\u0000\u0014\u0014`\u0002Y\u001a_\u0014~\u0002L\u001d.D#S";
        f8534[21] = "1TxHM;-Nz\u0014W/=M1\u040f";
        f8534[22] = "Y+\u0006'_cR$\u0017h<nG\"";
        f8534[23] = Double.TYPE;
        Time.f8535[23] = "java/lang/Double";
        f8534[24] = "P[Hp;}NSR?ViV_Putz";
        f8534[25] = Void.TYPE;
        Time.f8535[25] = "java/lang/Void";
        f8534[26] = "N\u007f\u0014sD@Pw\u000e<&ZG\u007f\u000ew";
        f8534[27] = "=<>qi\u0005#4$>\u0013\u0019:8\u0012\u007f)\u0015";
        f8534[28] = "|=HIC\u0014b5R\u0006\u000b\u0014x?JA\u0002\u000f8\u001eQG\u0001\u0004w2m]\u001d\u0011z5[Z";
        f8534[29] = "Z\u001e\t0|rF\u0004\u000blffV\u0007@}auPB\b{os@\u001e\u000b0GAP\r\u001ak|bv\u0003\u0000xg`@\u001e\u000f|bb";
        f8534[30] = "\u001cp|[va5I`At=/]pB?,(Nv\u0007b*3HzGva\u0014Yg]x! \u0007";
        f8534[31] = """
                    y\u0002WX\u0006mu\u0011
                    V=s!\u0017GIzcHHT\u0019Xn/\u0002V^L\ry\u0002WX\u0006mu\u0011
                    V=""";
        f8534[32] = "*8d\u007fr0x3:t\f4)$\n?<l~4`fmd\"H36=f9\"jg5:E(kke!&,l}g]";
        f8534[33] = "Ux!sy\u000fWs1J\u0573}V*|qo\u0017\u000f{t-\u0013";
        f8534[34] = "\u001e}__ju\u001cvOf\u0259\u0007\u001d/\u0002]|mD~\n\u0001\u0000";
        f8534[35] = "\u001arXfO)\u0000r\u001fe+_=\u0003 NpR{-Z3Bv@7ZtA";
        f8534[36] = "\u00018k%g+\u0001`e0\u00167V+>3jY\u0001 <+pi\u000f!?:\u0016f_kk s&Q*:Z";
        f8534[37] = "N8i[6\u0001X+=\u000bR\u0011H'\t\u0007)\u000bO:3\u0007.\u001b%97\u00141\u0018[a4V<jN8i[6\u0001X+=\u000bR";
        f8534[38] = "N\"V5\u0001}A*V6~dJ=Qh\u0012V\u0017|\b7~kJ=Hr\u001dqF(M\u000f";
        f8534[39] = "\u000f]I#\u00108FP\u0019,/\u052a4U\u001al\u0012._C\t8B";
        f8534[40] = "\u001f\ne\r\u0014\u007fV\u00075\u0002+\u01ff$\u00026B\u0016iO\u0014%\u0016F";
        f8534[41] = "\rne\u0001`x\u0004d2\b\u001fd\u000305Bcs\u0014\u00049Ec\u007f\b0/9{sU?0V&cP4TY~s\u0007#7]ye\u0005_";
        f8534[42] = "4Sm\u0001'wb\rq\u0017[\u0001\r\u0005z\u0012006S$\u000e&";
        f8534[43] = "_}#s)G\\k:eFDSy!v\u0011\u0013\f$z\u001a/IU.:f AU-";
        f8534[44] = "?\u0018MgL1v\u0015\u001dhs\u046f\u0004G\u0011{Cr=\u0011@(J";
        f8534[45] = "\n\u0014\u0001#,*V\u0015\u0015'\u0011\u0190gO\u0001\"!2\u0002\u000f\u000fcpHX\u001eU(k-\u0018\u0010\u0014y\u0011";
        f8534[46] = "U4\u007f*-(\u001c9/%\u0012\u032fn=\"'k'\r'.2nZ^&(*tjP'+;\u0012";
        f8534[47] = "+6E8[#p%\u001fce5{(~0\u0001'{T\u001a>\u001c#l5Cg\u001bd\u0016";
        f8534[48] = "`|W\tH\u0011)\"\\N0&Q|\n\u001dH\u0013+5T\u0016\u000f";
        f8534[49] = "n%tm1\u0000<.*fO\u0002l)[r4\u0011h3qyO\fx. i)\fo?%\u0014.S=<~/4Sz?\u001a{?\u0003x+w)4]sU";
        f8534[50] = "X7D\u000fN?L.CS>7R<\u001c\u0018>6X*\u001a\\P&Z9\u0001bQ7G:E\fA5T!{";
        f8534[51] = "ts[FL-.~P\bpkrfd\u001f\u0015}A{Y\u0017\u001atr\u001a\u0019\u0018Mu|}S\u001a\na\u001fqK\u000f@,\"+F\u0004\u000e\u0010";
        f8534[52] = "|Q4%\u007f`.Zj.\u0001v~]\u001e1gl~G&\\:c.D9;paiPZ<``z]98gvx!";
        f8534[53] = "D\u007fzXo\u001d\u0012!fN\u0013\n})mKxZF\u007f3Wn";
        f8534[54] = "5G\nL\u001a\u0014c\u0019\u0016ZfBuU\u001bC\u001d/6O\u000b^\u001cNo\u0016\f\u0019f\u0014b\u0015\u0017D\u0001^`R\u0003'";
        f8534[55] = ".p\u0003IO#tpC\u0010%3\u0010(\u0013J\u0015euh\u001d\u000bD\u001f/yG@_zow\u0006\u0011%";
        f8534[56] = "`\u0005g\u0015B\u000b2\u000e9\u001e<\u001db\t\tU\fW4\tc\f]_hu0\\\r]s\u001fi\r\u0005\u0001\u000fL9]\u0007\u001ae\u0015hU[f6E8W@\fo\u00140\u000b<_?D2\u0010V\u0006nLnl\u0005V>Nu\u0006\\\u00076\u0012\t\f]\u000bf\tj\bZ\u001ddu";
        f8534[57] = "bc9qL\u0000+ni~s\u018fY<emCC`j4>J";
        f8534[58] = "X\u000f\u0018B$@\n\u0004FIZBZ\u0003*Z?@7O\u0007\\+K\u0007A\u0006_:-";
        f8534[59] = "\u0007\u00161,\u0001\u001dQH-:}AD\u0015(!\u0014B>@yvFZT\u0019(~\u001a&";
        f8534[60] = "G/C3{O\u000eqHt\u0003X\u000fcF/x5LyV2yT\u0015 Qu\u0003\u000e\u0018#J(dD\u001ad^K";
        f8534[61] = ")4,y*U%'qw\u0011_\u007f\"%hxSF,%x|5#+|`rRi);t\u0011";
        f8534[62] = "babFm>+l2IR\u04e6Yi;Nbpd36E,";
        f8534[63] = "QjEOLzLeH\b=cV\nW\u001e[oRgT\bBy";
        f8534[64] = "&\u001a\u0015\u0001\rk|\u0017\u001eO1- \u000f2PJ7'\u0012\bPM'M\u0011\fCR$3I\u000f\u0001_V&\u001a\u0015\u0001\rk|\u0017\u001eO1";
        f8534[65] = "nL~1JN'A.>uUU\u0012.$I^jSs8\u001f<hO*|\u0017\u0003)\u00126*u";
        f8534[66] = "?c\u0004B1~?t\u0015GLw3f#\u0019)u\f}\u0019\u0015L'0 O\u0002)g>a\u001ex-a% \u0002\u001e-v4%\u007f";
    }
    
    public static Field m275(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m276(Class clazz, String s, Class clazz2) {
        Field m275 = m275(clazz, s, clazz2);
        if (m275 != null) {
            return m275;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m276 = m276(interfaces[i], s, clazz2);
                if (m276 != null) {
                    return m276;
                }
            }
        }
        return null;
    }
    
    public static Method m278(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
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
    
    public static Method m279(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m278 = m278(clazz, s, clazz2, n, array);
        if (m278 != null) {
            return m278;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m279 = m279(interfaces[i], s, clazz2, n, array);
                if (m279 != null) {
                    return m279;
                }
            }
        }
        return null;
    }
    
    public static CallSite m16402(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Time.m16402:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
                    handle = ((CallSite)Time.m671(lookup, "v", MethodType.methodType(long.class, int.class, long.class))).dynamicInvoker();
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
        
        public static long invoke(int p0, long p1) {
            try {
                return (long) ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Time.m671(lookup, "v", MethodType.methodType(long.class, int.class, long.class))).dynamicInvoker();
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
        
        public static long invoke(int p0, long p1) {
            try {
                return (long) ProcyonInvokeDynamicHelper_2.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Time.m671(lookup, "v", MethodType.methodType(long.class, int.class, long.class))).dynamicInvoker();
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
        
        public static long invoke(int p0, long p1) {
            try {
                return (long) ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Time.m671(lookup, "v", MethodType.methodType(long.class, int.class, long.class))).dynamicInvoker();
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
        
        public static long invoke(int p0, long p1) {
            try {
                return (long) ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Time.m671(lookup, "v", MethodType.methodType(long.class, int.class, long.class))).dynamicInvoker();
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
        
        public static long invoke(int p0, long p1) {
            try {
                return (long) ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Time.m671(lookup, "v", MethodType.methodType(long.class, int.class, long.class))).dynamicInvoker();
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
        
        public static long invoke(int p0, long p1) {
            try {
                return (long) ProcyonInvokeDynamicHelper_6.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Time.m265(lookup, "o", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)Time.m265(lookup, "o", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_8.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)Time.m265(lookup, "o", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
        
        public static int invoke(int p0, long p1) {
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
                    handle = ((CallSite)Time.m265(lookup, "o", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
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
        
        public static int invoke(int p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_10.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
