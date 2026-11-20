// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.core.command;

import org.rusherhack.core.logging.ILog;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import org.rusherhack.Class066;
import java.lang.invoke.MethodHandles;
import org.rusherhack.Class079;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import java.lang.annotation.Annotation;
import org.rusherhack.core.command.annotations.CommandExecutor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Function;
import java.util.Comparator;
import org.rusherhack.core.interfaces.INamed;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Iterator;
import org.rusherhack.core.command.dispatch.StringCommandDispatcher;
import java.util.HashMap;
import org.rusherhack.core.setting.Setting;
import java.util.Map;
import org.rusherhack.core.command.dispatch.ICommandDispatcher;
import org.rusherhack.core.logging.ILogger;
import org.rusherhack.core.command.processing.CommandProcessor;

public class CommandManager implements ICommandManager
{
    public CommandProcessor commandProcessor;
    public ILogger logger;
    public ICommandDispatcher<?> dispatcher;
    public Map<AbstractCommand, CommandData> f1453;
    public static long f1454;
    public static String f1455;
    public static Object[] f1456;
    public static String[] f1457;
    
    public CommandProcessor getCommandProcessor() {
        long n = CommandManager.f1454 ^ 0x716FE9B0A0A1L;
        return this.commandProcessor;
    }
    
    public ILogger getLogger() {
        long n = CommandManager.f1454 ^ 0x8BEF8F06763L;
        return this.logger;
    }
    
    public ICommandDispatcher<?> getDispatcher() {
        long n = CommandManager.f1454 ^ 0x431615213C76L;
        return this.dispatcher;
    }
    
    public CommandManager(CommandProcessor commandProcessor, ICommandDispatcher<?> commandDispatcher, ILogger logger) {
        long n = CommandManager.f1454 ^ 0x25D8F630F327L;
        ICommandDispatcher<?> commandDispatcher2;
        Object o = commandDispatcher2 = commandDispatcher;
        this.f1453 = new HashMap<AbstractCommand, CommandData>();
        this.logger = logger;
        if (commandDispatcher2 == null) {
            o = new StringCommandDispatcher(this);
        }
        Object dispatcher = o;
        this.commandProcessor = commandProcessor;
        this.dispatcher = (ICommandDispatcher<?>)dispatcher;
    }
    
    public CommandData getCommandData(String anotherString) {
        return null;
    }
    
    public Optional<AbstractCommand> getFeature(String anotherString) {
        return null;
    }
    
    public String getPrefix() {
        return "";
    }
    
    public List<AbstractCommand> getFeatures() {
        return null;
    }
    
    public CommandManager(ILogger logger) {
        this(new CommandProcessor(), null, logger);
    }
    
    public CommandManager(CommandProcessor commandProcessor, ILogger logger) {
        this(commandProcessor, null, logger);
    }
    
    public CommandData getCommandData(AbstractCommand abstractCommand) {
        return null;
    }
    
    public void registerFeature(AbstractCommand abstractCommand) {
        
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
    
    public static void m122() {
        Object[] f1456 = CommandManager.f1456;
        f1456[0] = "yIB\u0017A<eS@K[(uP\u000bZ\\;s\u0015FV^$wUA\u0017p&{VDWW\u0004wUD^V;";
        f1456[1] = "\u001f\u0015(\u001dHx\u0001\u001d2R+l\u0005";
        f1456[2] = "\\C/.#cWL>aBm\\G:;";
        f1456[3] = "C7\u0016]Da_-\u0014\u0001^uO._\u0010YfIk\u001d\u001cQsE+\u0016]\u007fXC\"\u0016\u0016D";
        f1456[4] = "\u0018Rt?\u0006Y\u0004Hvc\u001cM\u0014K=r\u001b^\u0012\u000ep~\u0019A\u0016Nw?5N\u0004Tap\u0017X4O~|\u0015B\u0013";
        f1456[5] = Void.TYPE;
        CommandManager.f1457[5] = "java/lang/Void";
        f1456[6] = "\u0016BG\u0003\u0013\t\bJ]Lq\u0015\u000fW";
        f1456[7] = " P!1vY<J#mlM,Ih|k^*\f%piA.L\"1`E<R'kgDak\u0005piA.L\"[m_?C2|lI=";
        f1456[8] = "\u007fU\u000b\u0011TicO\tMN}sLB\\Inu\t\u000fPKqqI\b\u0011Vn\u007fD\tLUu~@B|Iq}F\u0002[vn\u007fD\tLUsb";
        f1456[9] = "\nEqT)]\u0014Mk\u001bDG\rTfGf\\\u000fV";
        f1456[10] = "!wa<\tV?\u007f{sAV%uc4HMePb3DW\"yy";
        f1456[11] = "N\u0018CU'5P\u0010Y\u001aZ%P";
        f1456[12] = "cbpjM\u001c}jj%*\u001dlqg\u007f\f\u001b";
        f1456[13] = "O%=\t<9f\u001c!\u0013>e|\b1\u0010ut{\u001b7U(r`\u001d;\u0015<9G\f&\u000f2ysR";
        f1456[14] = "\b])Yaq}}\"Vp>\u0000e1Qywh";
        f1456[15] = "3\u0011oT\u000f\u0003-\u0019u\u001bn\u0006-\u0019v[@\u001a";
        f1456[16] = "(\u0003-%\u001a_#\f<j`[0\r,%V_'";
        f1456[17] = Boolean.TYPE;
        CommandManager.f1457[17] = "java/lang/Boolean";
        f1456[18] = "r\u000e3#/Dy\u0001\"lR\\j\u0006+%";
        f1456[19] = "\f[\u000eAq9\u0007T\u001f\u000e-0\u0000V\u001dC+{+_\fH01";
        f1456[20] = ",u2\u001e%E'z#QHE'g7";
        f1456[21] = "\u0005\\\u0013F\u001bV\u0019F\u0011\u001a\u0001B\tEZ\u000b\u0006Q\u000f\u0000\u0017\u0007\u0004N\u000b@\u0010F*L\u0007C\u0015\u0006\rg\u000bZ\u0015";
        f1456[22] = "\u0006B.\u0018x}\rM?W\u0015y\rQ\u000b\u001c'd\tM;\u001c";
        f1456[23] = "\n!p//O\u0014)j`@H\u0012!\u007f=";
        f1456[24] = " \u007fREMjU_YJ\\%4QRAX\u007f@";
        f1456[25] = "|I$-*K\ti/\";\u0004U`( 9IS+\u0003)(BHau";
        f1456[26] = "g:\u0011\u0002<)y2\u000bMQ3a7\u0002\u0000f5b5";
        f1456[27] = "`\u0017GWY\u001c|\rE\u000bC\bl\u000e\u000e\u001aD\u001bjKC\u0016F\u0004n\u000bDWJ\u0007a\nT\u0018_\u0000`\u000bSWh\u0006b\bA\u0017O,w\u0000C\f_\u0006}Aa\u000bL\u001cb\u0000N\r";
        f1456[28] = "\u007f\u0014}`\u00165\n4vo\u0007zw,eh\u000e3\u001f";
        f1456[29] = "'|)\u0011A\u001e;f+M[\n+e`\u051f";
        f1456[30] = "\u0011$D\u001b\u0003o\u000f,^T^n\t S\u0017\u0003I\u000f7W\u001b@";
        f1456[31] = "@>\u0019Xnm^6\u0003\u0017&mD<\u001bP/v\u0004\u000f\u001d\\$qI>\u001b\\";
        f1456[32] = "+&U70:^\u0006^8!u\u0002\u000fY:#8\u0004Dk/6>K";
        f1456[33] = "\u0006lg\u001c\u0001msLl\u0013\u0010\"\u000eT\u007f\u0014\u0019kf";
        f1456[34] = "Y~s=\u0012mEdqa\byUg:p\u000fjS\"ag\ttE\"]\\5l_`g";
        f1456[35] = "b[rS\bZ~Ap\u000f\u0012NnB;\u001e\u0015]h\u0007v\u0012\u0017BlGqS\u001bAcFa\u001c\u000eFbGfS9@`Dt\u0013\u001ejuLv\b\u000e@\u007f";
        f1456[36] = "*]*JL*_}!E]e\"e2BT,J";
        f1456[37] = "~XJ\u0011\r2bBHM\u0017&rA\u0003\\\u00105t\u0004AP\u0018 xDJ\u00116\u000b~M";
        f1456[38] = "C~sK\r\u001a6^xD\u001cUWPsO\u0018\u000f#";
        f1456[39] = ";\u0018\u0011X\b.0\u0017\u0000\u0017T'7\u0015\u0002ZRl\u0005\u0000\u0017\\";
        f1456[40] = "C\u0018x_A\b68sPPGW6x[T\u001d#";
        f1456[41] = "QtR#iMZ{Cl&OUzP#3HT{\n\u0003)OTaE6.NU";
        f1456[42] = "\u0014CJh\u001e@acAg\u000f\u000f\fcAz\u001b\u001a";
        f1456[43] = "pGUi\u00011d\u0018@>m\"g>C3\n?u\u000bD2\u000b\u001bf\u001a^8\u000b?\u001c\u001bW7\bswI\u001e>WCv\u000b@:\r \u007f\u001d\u001d:m";
        f1456[44] = "\u0018]3i|\"EP?{\u0012(AR,nh\"@XT8s2\u0019]37s{[7jmu-HV7`y?&";
        f1456[45] = "j3\u0002vyQ8z\u000b)I[}\b\u001bh(U`(\nw$t|&\u0005\u0013%Hd.Pxw\u0001m{`y5_i!\u0003p#\u0002iA";
        f1456[46] = "f%~knOsg}{\n\u0019j9kpk\u0014v_y|s\r3e|wd\u0016\r5k|e\u0012n<}!er";
        f1456[47] = "\u0001\u000fSFN/_@M\\)7B\u0010E^U1D}\u000fE@1@FQ\u000bR)>";
        f1456[48] = "l\u007f#T(\u000fs|3d=\u001aag1\u0018*\r@k#\u0018:\rc\u0006q\u000f|\u001a0}1\u0003:N\u000e:v\u0018'Fad4\u001a6w";
        f1456[49] = "\f\u000f\u001e2n\u0012^F\u0017m^\u0016\r\u00010:5\u001d\t\u0007\u0011;\u001b\u0014\u001c\u001d\u001b;%y\u0000\u0013\u0019%8\u0007\u0007\u0016\u0018-^";
        f1456[50] = "C2\u0001=\u0012V\u001d$\u000ex._\u0013$5cJ6\u001eu\u001a|M\u000f@8L<.\\\u0003-\u0013gMU\u0015p\u0013\u0007";
        f1456[51] = ">*\u000fkT/g/\u000e8:\u007fjk68@/|tHdZ(i\u0017\u000f{\u0005kdiSa\u0002~\u0007";
        f1456[52] = "V*u]\u007f\u001fI)emt\u0000[<q\u0017\u0010]V8p\u0000v\rH/r";
        f1456[53] = "S\u000e|\n\u0001kR\t#Se~X\u0003:^egC\u0004}U\u000fxJ\u0016$3";
        f1456[54] = "\u0013?\u0017l\u0004!\u0019=\u0015.>q\u001f+\u0000\u000bCu5*\t5Wy\u0012M\u0007*Wm\u001ap\u0012hT}~ \u001e+\u0002%@*\u001c)@\u001f";
        f1456[55] = "K1OU{%T2_e}]C1\u0016Zs=VwFU\u00147Px\u0019\u0002t\"\u0016(\u0016e";
        f1456[56] = "&9msbR2fx$\u000e['uT$eM1r|%jMJca*a@)jwwa v5a/?O(wc>\u000e";
        f1456[57] = "5\u0004Z\u00105_l\u0001[C[\u0003aH8\u0017'`3K\u000f\u000b<\u0019m\u0004\u0011\u0011[";
        f1456[58] = "y $x#\u0012`-0h\u001b\u03ab\u001a-2hi\u0017'8pkysq<!s\u007fNd~\"c\u001b";
        f1456[59] = "\rQ[2T,M]\u001dfj8[F&6\u000f:6Q\u001a6\u00183\u000bDX5\bW";
        f1456[60] = "\u0014gD5d\u0013\u0019m\u000b1\u0004\u0018\u0011f>$x\u001a\u0017\u0017\u001f0o\u001dKv\u001219\nw}\u0007(k\u0011\u0014t\u0011ukq";
        f1456[61] = "6\r=&E|\"R(q)a7A\u0002wOc \\&B@t3X fDt\u0006L5wR\u000e?E\"t\u0011?%_we)";
        f1456[62] = "Ee\rB~GP'\u000eR\u001a\u0001V{\u0005L\u001a\u0011Tv\u0016T'\u0004\u0016u\u00060}\bM%\u0002Zb\u0001_|d";
        f1456[63] = "j\u0012O%T9uD\u0014r=-p\u0013o/X3d\u001fHHZ$nCB\"E-|\u001a$";
        f1456[64] = """
                    /[
                    \u0014g+f\u0001\u001b\u0003\u0006\u007f,\u001a\u0006\u0017\u0006y,	\u0013	;ln
                    \u0003m}-*[\u001bWw~k\u0007aQ:n6Q\u000e\u000fxl'`""";
        f1456[65] = """
                    JwU}Z\u000e
                    {\u0013)d\u001a\u001c`'t\u0005\u001c
                    q\u0015\u0010\u0003\u0007\u0012&\bz\u001c\u000e\u0000\u007fn""";
        f1456[66] = "\u0011Bo\u001eBi\u0004\u0000l\u000e&5\u0001uc\u0014Z%zRz\tI4\u0019[lTIT";
        f1456[67] = "zT6\\\u0015@(\u001d?\u0003%Eq\\\u0012P@F\u0016M.PWO+XlSG+zT6\\\u0015@(\u001d?\u0003%";
        f1456[68] = "nHnR\u001dDeR3R!\u0016yP\u000bJY\u0014RE2V!\u0012nE%_\u001c\u0007,F5;";
        f1456[69] = "3H^\fOu'\u0017K[#f$1E[N|$\u0019DTN\u00075\u0004K_Cd<\u0012\u0016_#";
        f1456[70] = "4}KS\u001b+39\u0016\r'}8yP\u0012'y!f\u001c_\u001c~e;Bc";
        f1456[71] = "YBx\u0005S_\u0007\fj\u001d-\u0004\u0000KW\u000f]\u0018iZm\u0007B\u0004\nS{ZBd";
        f1456[72] = """
                    }Fm\u0007]xi\u0019xP1e|
                    T]Wmm\u001faZVl\u0011\u001aoYT:zH&P\u000b
                    j\u0007\u007fC
                    g}Ft@1""";
        f1456[73] = "c3W\u0002H\u0013:6VQ&R3j\u0013\u0005],;3\b\u0013E\u0015e~^S&";
        f1456[74] = "\u00136lFaFMx~^\u001f\u001bN4y!&\u0007\u001c?f_z\u001d\u001b*\u0005";
        f1456[75] = ":P\"9?z0R {\u0005+:^\u0002xo\u000f0G<lc(,\"e\u007fx~kB;iw;W";
        f1456[76] = "C\npLJ4\u0003\u00066\u0018t*xPvON4\u0000\u000e1\u001f\u0004O";
        f1456[77] = "<\u0016hxj|b\u0000g=Vul\u0000\u0015{,#{\u000fk'6$nl\u007f>3s`\u000fv(ns\u0000";
        f1456[78] = "*\u0012\u007fO\u0001g(\u0017 \u0010z2>l'\u000b\u0006[>\u0017:K\u0000a4D{\u0017zg?U|L\u001a9)Z9p";
        f1456[79] = "\u000bRl!lvU\u001f:a\u000f.\u0016\u0002p3s(\u0010o:(f(\u0014Tdft0j";
        f1456[80] = "{\u0018A3AP|\\\u001cm}\f|d\u001fyB\u0010q\u001aCcE\u0005\u0012\rZdMW)\n\u001e9\u0013k";
        f1456[81] = "\u0017/O-\\lN*N~2+Snv~HlUq\b\"Rk@\u0012O=\r(Ml\u0013'\n=.+\fxI0Pw\u0016\u007f\\S";
        f1456[82] = "~ahY\u001b\u001atcj\u001b!M\u007f\u007fV\b]Dt\u007f\u0013\t\u0011T/\u007fa\u001dNAx\u0013/\u001f\\\u001e/sq\tS[\u0013//\u0019A\u0015|qm\u001bP$";
        f1456[83] = "$aP|F(1#Sl\"x6fPjYT }^tO^&`T\u000eIo&i]3\\-%y9d^p {ZmH- \u001b";
        f1456[84] = "o31ZL\u001ep0!j\u04aaf4wa\u0000MYmr`S";
        f1456[85] = """
                    X_{\u0016z	YLm\u0006
                    F>I{\u0005x\u000e\u0003\\9\u0006hjUXh\u001enW@\u001ak\u000e
                    """;
        f1456[86] = "cJr\u001a\u001fM|Ib*\u001bRdVrL\u001cm{TpG\u000bNfI\u001b\u0017\u0017U;\n|\u0011\fMj";
        f1456[87] = "\u0013\u0001\u0004|;\nM\u0017\u000b9\u0007\u0011H\u0001\u0005F9\u0000H\u0015\u0017'd\rD\u0007yz;\u0016OJ\u0016$y\u0014^{";
        f1456[88] = "DV\u0007d S\u001a@\b!\u001cR\u0004A\u00007`T\u0002,J,uT\u0006\u0017\u0014bgLx";
        f1456[89] = "cmc\u0012Q\u001fioaPkZcc@G\u0011Lhc\u0018C\u0019Z2%&I\u001bXp\u001f$\u0012\u0017A?pzP\u0015P\u000e";
        f1456[90] = "VdTC#*\u0004-]\u001c\u0013.Wjm[k,@}ROh::zDDvqQ(\rM)A";
        f1456[91] = "/)N\u007fRBq?A:nCh\u001eV=\u0012S\u00139O \u0001Bp0Y}\u0001\"";
        f1456[92] = "\u001d\u001d@l<I\u001f\u0018\u001f3G\u000e\u000e]\u0014:\"u\t\u0018\u0005h=O\u0003KD4G\u0016\u0002\u0018\u00013%\u001b\bW\u0005S";
        f1456[93] = "i\u001bJ\u001eenv\u0018Z.e{w,NGvkq\u000fX.6lvX\u001fNhzy\u001d#";
        f1456[94] = "'\u0014e\f|\u000f-\u0016gNF^'\u001aUW#T#\u0000r0}Zq\u000b K=V7_\u001e";
        f1456[95] = "4l\u0006GfJ+o\u0016weS-m\u0006\u000bbR;ooKxKjt\u001d\u001e4\fi";
        f1456[96] = "\u0007\u000e\u0006ii@\u0013Q\u0013>\u0005]\u0006B.<\u007f[\u000eS\n8\u007fn\u001aF\u001b.\u0005N\u0006X\u000b<`N\u0005P\u0018U";
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
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/core/command/CommandManager.m132:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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

   public CommandManager() {}
}
