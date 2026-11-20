/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtElement
 *  net.minecraft.nbt.NbtHelper
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.RegistryWrapper.WrapperLookup
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.collection.DefaultedList
 */
package org.rusherhack;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import org.rusherhack.client.api.feature.module.impl.misc.ExtraTooltips;
import org.rusherhack.Class066;
import org.rusherhack.Class253;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.config.JsonConfiguration;

import org.rusherhack.command.clear;
import org.rusherhack.command.config;
public class Class258 {
    public /* synthetic */ ExtraTooltips f4601;
    public DefaultedList<ItemStack> f4602;
    public static long f4603;
    public static String[] f4604;
    public static String[] f4605;
    public static Map f4606;
    public static long f4607;
    public static Object[] f4608;
    public static String[] f4609;

    public Class258(ExtraTooltips object) {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void m9294() {
        
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void m9295() {
        
    }

    /*
     * Unable to fully structure code
     */
    static {
    }

    public static IllegalStateException m1393(Throwable throwable) {
        return new IllegalStateException(throwable);
    }

    public static String m117(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    public static String m153(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x58C2;
        if (f4605[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])f4606.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f4606.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/\u020e", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            try {
DESKeySpec dESKeySpec = new DESKeySpec(byArray);
               SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
               ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
               byte[] byArray2 = f4604[n2].getBytes("ISO-8859-1");
               Class258.f4605[n2] = Class258.m117(((Cipher)objectArray[0]).doFinal(byArray2));
            } catch (Exception exception) {
               throw new IllegalStateException(exception);
            }
        }
        return f4605[n2];
    }

    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = Class258.m153(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }
    public static int m121(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f4609[n3] != null) {
            return n3;
        }
        Object object = f4608[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 63;
            case 1 -> 0;
            case 2 -> 12;
            case 3 -> 45;
            case 4 -> 35;
            case 5 -> 14;
            case 6 -> 36;
            case 7 -> 54;
            case 8 -> 37;
            case 9 -> 23;
            case 10 -> 42;
            case 11 -> 6;
            case 12 -> 21;
            case 13 -> 48;
            case 14 -> 22;
            case 15 -> 15;
            case 16 -> 24;
            case 17 -> 47;
            case 18 -> 33;
            case 19 -> 25;
            case 20 -> 20;
            case 21 -> 10;
            case 22 -> 4;
            case 23 -> 53;
            case 24 -> 29;
            case 25 -> 40;
            case 26 -> 9;
            case 27 -> 7;
            case 28 -> 58;
            case 29 -> 5;
            case 30 -> 61;
            case 31 -> 17;
            case 32 -> 41;
            case 33 -> 39;
            case 34 -> 52;
            case 35 -> 1;
            case 36 -> 3;
            case 37 -> 28;
            case 38 -> 2;
            case 39 -> 56;
            case 40 -> 19;
            case 41 -> 49;
            case 42 -> 44;
            case 43 -> 57;
            case 44 -> 26;
            case 45 -> 32;
            case 46 -> 27;
            case 47 -> 34;
            case 48 -> 16;
            case 49 -> 51;
            case 50 -> 13;
            case 51 -> 55;
            case 52 -> 43;
            case 53 -> 11;
            case 54 -> 50;
            case 55 -> 30;
            case 56 -> 18;
            case 57 -> 46;
            case 58 -> 8;
            case 59 -> 60;
            case 60 -> 62;
            case 61 -> 38;
            case 62 -> 59;
            default -> 31;
        };
        int[] nArray = new int[6];
        int n5 = 0;
        while (n5 < 6) {
            n2 = 7 * (5 - n5);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n4) < 0) {
                n += 128;
            }
            nArray[n5] = n;
            ++n5;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        Class258.f4609[n3] = new String(cArray);
        return n3;
    }

    public static void m122() {
        Object[] objectArray = f4608;
        f4608[0] = "di\\H+\u0012diK\u0014'\u001d~\"K\n'\byS\u001aUqJ";
        objectArray[1] = Integer.TYPE;
        Class258.f4609[1] = "java/lang/Integer";
        objectArray[2] = "EWJp\u001e_NX[?\u007fQES_e";
        objectArray[3] = "BB\u0002M.\nBB\u0015\u0011\"\u0005X\t\u0015\u000f\"\u0010_xGTzZ";
        objectArray[4] = "+vLqG2+v[-K=1=[3K(6L\u000ek\u0018";
        objectArray[5] = "\u0017 \u0010F\u001be\u001c/\u0001\tf}\u000f(\b@";
        objectArray[6] = "< [\u000eN\n< LRB\u0005&kLLB\u0010!\u001a\u0019\u0013\u001b";
        objectArray[7] = "\u0019{Qf\u0014D\u0019{F:\u0018K\u00030F$\u0018^\u0004A\u0010|L\u0018";
        objectArray[8] = Void.TYPE;
        Class258.f4609[8] = "java/lang/Void";
        objectArray[9] = "\u0005&`=JL\u0019<baPX\t?)\u0215";
        objectArray[10] = "w\u0002[\u000e\u0017)k\u0018YR\r={\u001b\u0012C\t5}\u001eH\u000e\u0004,q^IT\f0k^SB\u000f9{\u0004O\u000e6?j\u001fPL\u0007=j";
        objectArray[11] = "Ix\u00028y[Ep\u0003s0SYx\u00018YGEy";
        objectArray[12] = "Di\u001c^h:A&8Z'7Kz";
        objectArray[13] = "T6%\u000eGvX>$E\u000e~D6&\u000eSmE<)M\u000eSD6&rExS<:";
        objectArray[14] = "J\t\u00073GuJ\t\u0010oKzPB\u0010qKoW3A$\u001c,";
        objectArray[15] = "bm\\mazbmK1mux&K/m`\u007fW\u001fz>!";
        objectArray[16] = "Rw)sjKRw>/fDH<>1fQOMjo5\u0017\u0018q1<tQc%ej3";
        objectArray[17] = "b\u0018W,G&b\u0018@pK)xS@nK<\u007f\"\u00117\u0018\u007f";
        objectArray[18] = "=\u0010>\u001euj#\u0018$Q\u0014o#\u0018'\u0011:s";
        objectArray[19] = "LiM:3RPsOf)F@p\u0004w-NFu^: WJ5I{/AJ|\u0004^2HMXEz'NDnXu5NLu";
        objectArray[20] = Boolean.TYPE;
        Class258.f4609[20] = "java/lang/Boolean";
        objectArray[21] = "\u000eT*Xf[\u0012N(\u0004|O\u0002Mc\u03b3";
        objectArray[22] = "\u000f{g)(_\n4W!jS";
        objectArray[23] = "Y-rij?Y-e5f0Cfe+f%D\u00175v7";
        objectArray[24] = ")L,u\bb5V.)\u0012v%Ue\u0255";
        objectArray[25] = "oM/2C4dB>}90wC.2\u000f4`";
        objectArray[26] = "d\u001d`&\\,x\u0007bzF8h\u0004)kA+nAkgI>b\u0001`&g\u0015d\b";
        objectArray[27] = "693\u0007@uC\u00198\bQ:\"\u00173\u0003U`V";
        objectArray[28] = "\u0015M6\u0018-[\u001eB'W@_\u001e^\u0013\u001crB\u001aB#\u001c";
        objectArray[29] = "MrVn@IF}G!\u001c@A\u007fEl\u001a\u000bsjPj";
        objectArray[30] = "W\u0004\u0001X,$K\u001e\u0003\u000460[\u001dH\u001528]\u0018\u0012X?!QX\u0000\u0013?%M\u0004\u0003X=>U\u001b\u0007\u0018:\u007fY\u0004\u0001X\u001c=W\u0015\r$;7]\u0004\u0003\u0018=4";
        objectArray[31] = "\u0013P\u001f\u001ap4\u000fJ\u001dFj \u001fIVWn(\u0019L\f\u001ac1\u0015\f?Xm#\u001dN\u000b";
        objectArray[32] = "y]=vX3uU<=\u0011;i]>vu/u\\\u00154Z1\u007f\\$";
        objectArray[33] = "V\u0015\u0003\u001f\u0013FZ\u001d\u0002TZNF\u0015\u0000\u001f>ZZ\u0014!S\u001eLV\u000e";
        objectArray[34] = "\u000e-\\c\u0000u\u000e-K?\fz\u0014fK!\fo\u0013\u0017\u001ax\\.";
        objectArray[35] = "\bN\u00017s5\bN\u0016k\u007f:\u0012\u0005\u0016u\u007f/\u0015tG-&k";
        objectArray[36] = "0;\u0003\u0005)m,!\u0001Y3y<\"JH7q:'\u0010\u0005:h6g\u0002N:l*;\u0001\u00056w;<\bNuU0-\u0011G>";
        objectArray[37] = "\u001b73U^*\u0007-1\tD>\u0017.z\u0018C-\u0011k8\u0014K8\u001d+3Ue\u0013\u001b\"3\u001e^";
        objectArray[38] = "mnD\u0006c>mnSZo1w%SDo.pT\u0007\u001c8";
        objectArray[39] = "{G\n\u0004\b^{G\u001dX\u0004Qa\f\u001dF\u0004Df}I\u0013W\u0004";
        objectArray[40] = "8mVz;U&eL5@u\u001bH";
        objectArray[41] = "*j\u001f-\\G/%>>\u001bZ%y";
        objectArray[42] = "\u0002\u0017\u000e~,\u0017\u000e\u001f\u000f5e\u001f\u0012\u0017\r~8\f\u0013\u001d\u0002=e2\u0012\u0017\r\u00079\u0011\u0015\u001d\u0011";
        objectArray[43] = "wE-*K\u0015wE:vG\u001am\u000e:hG\u000fj\u007fh3\u001fN";
        objectArray[44] = "6xwt\u000b\u000ed,awl\u0018l/~e;M2|#\tPJd~{9W\u0007px";
        objectArray[45] = "\u0015]S\u0006o1H\u0015\u0003\u0001U8GZ+\u000028u_\b\u00078$*^\n\u0014?'\u0017\u0014\u000bA;^VE\b\u001co>\u0013N\r\u001dU";
        objectArray[46] = "\u001b\u001fQ6\u0015d\u001cRE0t*NGEg3:'QC2\u000b1\u0019C@dth\u001bJ\u0004kDoV^\u0002\n";
        objectArray[47] = "/=-WBe(-|B;#\u0011p!W\u0007n!wlC\u0001\u000f-pt\u0002Z?*=`\u0004;";
        objectArray[48] = "\u001c\"4B\u0005\u0015AjdE?\u001cN%LDX\u001cy7gSR\u0000#jtMYCN<hPSz\u0012e`S]A\u0019`qS?";
        objectArray[49] = "k11@dIv3g@\u0000]a4\u0003\u0003gL`\"'\b\u0000\b11g\u00180\u000f|%ay<\bdd:I;Epb[DxKphj\u0016aXvX";
        objectArray[50] = "\u0018NW\r\u0015F\u001bX\u0017\u001ao\u00ffuPF\u0017\rH\u000bS@K\u0005";
        objectArray[51] = "+Qp\u0007xs.Z'UB%%\f\u007f\t\u0015rzQ$e~6+\u001e\"\u001c+2$X";
        objectArray[52] = "\u000f{mJb_Q/'\\\u001a\u0557o|'QgB\u0006\u007f1\u0011p";
        objectArray[53] = "#qpP:1~9 W\u0000\"{K1Jf^ys&Bk&gw+N\u0000\"|h-\u0017`gwm,-=&ctz\u001co?prJ";
        objectArray[54] = "_\u001e[qa}\u001a\u0015^p[vG\u0019A{[ [\u0001G&jrB\u0012A\u0016";
        objectArray[55] = "\u0002{XBZ\u0019\u0007p\u000f\u0010`D\u00007SG\fvTv\u000e\u0010`\u001aW&NG\u0018H\u00030M ";
        objectArray[56] = "h|A9=\u0006o1U?\\L98Ll7[T#\u0011w0R=.\u0012bb67yZi8_:zO;\\\nh)\u0014dl\r%=\u0012\u0005";
        objectArray[57] = "-0\u00172 )pnSj\u0018>z#M<t\f(n\u0013c\u00186w?]?z7ko\u0017[";
        objectArray[58] = "\u0004/SG6%\u0007)\u000fOQ6\u001a#OY*[\u0007\"TU59\u0006>\u0004\u001fQ";
        objectArray[59] = "*R;zYA-\u001f/|8\u000f\u007f\n/+\u007f\u001f\u0016W(x\u0004@,\u0013j\u007fIq*R;zYA-\u001f/|8";
        objectArray[60] = "<8i;H@af-cpWk+35\u001ce9fkcpO<*57\u000e@l52R";
        objectArray[61] = "ZMA's\u0010V]\u001a?\u000b\u00039\u0003L17N\t\u0004\u0001%1/\u0005\u0003\u0019dj\u001f\u0002N\rb\u000b";
        objectArray[62] = "\u000f(\u0005\u00161\u000b\u0012*S\u0016U\u001f\u0005-o\u0013i\u001fU _\u0014$\u000bSA\nU9\u0019\u00029\u0014Q4\u0015i|\u0017P(FX.\u000eC.v";
        objectArray[63] = "j\u000e`< KmCt:A\u0016/O`d:{oH7<pA+\n0qA\u00166Ryd#\u0017*\u00023\u0000";
        objectArray[64] = "hVT%{Cd\u0005A&\u0006\u001dfoKhm\u001a7WNc:H";
        objectArray[65] = "\u0014\u007f\f~$\u000e\u001f*\u0016\u0011}Y\r \u0015}O\rIzK*\u0018F\nx\rt&T\t.r(b\nMqHl \r\u0000@\u0017.f[Mz\u001c{|4";
        objectArray[66] = "\u0017BO\t\ty\tFB\u0005bn\u001fDj\u001d z\u0015^d\f\u0000l\u0019D#\u0000\u000bkK\\^\u001d\t=K8";
        objectArray[67] = "3\u0003m\u0015}!5\u001b}V\u0018}8\rq\rtOnK+T \u0018iMxVy(n\u0000lP\u0018\u007f,\u0015u\u000f{s*\r-j";
        objectArray[68] = "0hg0$22!:&G#%%\u001e8(#%#Z&. y9c85.+Y";
        objectArray[69] = "o7[\\\u0016\u0007( NWw\u0017t5FA E,a\u001d\u001dw\u0010u;_BJ\u001c()\u0012";
        objectArray[70] = "eY\u0012\u0014\u001f:{]\u001f\u0018t-m_7\u0000/>zB\u0018\u0014t~<JB\u001aDyq^D{";
        objectArray[71] = "AK\f\u001c\u0007nJ\u001e\u0016s@9Xt\u0000\b\u0003+AJ\u0012\u000bUT\u001d\u000eLO\nnYLK\u0002;m^JNB\u0001)\u001cM\u0003s";
        objectArray[72] = "\u0014aS\u000f\\\u001dAe\\Ie\u0001E`\\\u0017\t3\u0013$\u0007LTd\u0015&R\u001e\u0007]R&S\u0017e";
        objectArray[73] = "\u0010)BuC\u000f\u001b|X\u001a\u0014Q\u0018\u007fF\u001aBM\nk\f+\u0010T\u0019m<";
        objectArray[74] = "\u001eMw*Ct\u001dK+\"$a\nMy4IL\u001d_^)@gpMp(Tn\u0012Llx\u001e\n";
        objectArray[75] = "gTm\u001d<tg^#\u001fE\u052eYJ)^:+gX*\bE";
        objectArray[76] = "ML9iw\u001aKT)*\u0012FFB%q~t\u0010\u0004\u007f)+#LG!rw@@A9*\u0012\u001f\u0017Wyw\"\u0018ZC\u007f\u0016";
        objectArray[77] = ";@\u001a\u0013P_;JT\u0011)\u023c\u0005^^PV\u0000;L]\u0006)";
        objectArray[78] = "efW\u0011\u0011rj6H\u0016tp\u007f\u0007V\r\u0015jw\\\u0016K\u001d0yl\u0011\u0006\t6\u0018";
        objectArray[79] = "?D1\u001f\u0013j9O-Kaa;\b6I\rSoNf\u0014P\u0004jH?\u0012\u00004m\u0005+\u0014amf\u0013g\\\u000fkm\u000f3.";
        objectArray[80] = "QL\"Hn9]\u00110\u0005\u0001aUP!RmS\u0001\u0014{\u000f:\u0004Q\u001c&\u0004sjW\u0017:P\u0001=B\u0012}\u0004;y\u0000\u001505";
        objectArray[81] = "+e\u0010\u0018g\u0019v;T@_\u000e|vJ\u00163<,5\u0011Ogk{mM\t#\tmtK\b_\u0000zkI\u0010o\u0004.0Qq4\b!mF\u0018&Tkl*";
        objectArray[82] = "\u001dsN\u0016&\n\u0013w\u0016SZu*V1jeBKlM\u00058\n\u001bk";
        objectArray[83] = "\u001et\u0010 z\u001e\f(Z!\u0016\u0016\u000eOZ*m\u001a\u0013k *v\u0017\u0005sB+jGO\u0017";
        objectArray[84] = "\u0012`*OI\u0014L4`Y1\u001arj\u007fN\b\u0019\u0000g VUs\u0012ev\u0011[\u0001\u001f:nL1";
        objectArray[85] = "6>QFSfk`\u0015\u001ekzm<\u000fC<$4jT/Q{68S]\f%r`";
        objectArray[86] = "\\bWzK\u0006\u0000b\u0006y:\u0016TyP\u0018\u0006UT?W(\u0001\u0018@96zP\u0012[=J~FYC\u0003\u000b`E\u0014\r2YyV\u0012=";
        objectArray[87] = "\u0004?z6;JYw*1\u0001KA %\tzB]GqtoIY|zq~I;$,{}Z\\:)/e%\u0002=~w0\u001fF\u007fy:\u0001";
        objectArray[88] = "'%\u001al5n,p\u0000\u0003r50wdqrl=\u007fZcq:B";
        objectArray[89] = "x\u0003\u001aKh*%]^\u0013P=/\u0010@E<\u000f\u007fS\u001b\u001dnX(\u000bGZ,:>\u0012A[P3)\rCC`7}V[\";3#\u000fA\u0012?gx\u0017 ";
        objectArray[90] = "+CqDN\"u\u0017;R6\u04b4KLt]YyqG!G";
        objectArray[91] = "ZTo~\u0005zQQ~~g*\u000f\fz\u007fg|\u0013\u0014|\"V.\n\u0007z\u0012";
        objectArray[92] = "\u001bIs\t\u000b\u0004\u001eB$[1R\u0015\u0014|\u0007f\u0005KC$kH[\u0010\u001cc\u0001\u000f\u0007D\u0000";
        objectArray[93] = "\u0004D2^\u000ft\u0019Fd^kf\u000fQX[W`^Lh\\\u001atX-=\u001d\u0007f\tU#\u0019\njb";
        objectArray[94] = "dm8ZB{#1lF9tpv<XUF 4b\u00009j%p2FWqd4!?";
        Object[] objectArray2 = objectArray;
        objectArray[95] = "z:\u0013,5\u001bqo\tCfLc\u0005\u001f81^z;\r;g!&\u007fS\u007f8\u001bb=T2\t";
    }

    public static Class m123(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Class258.m121(l, l2);
            object = f4608[n];
            try {
                if (!(object instanceof String)) break block2;
                Class258.f4608[n] = clazz = Class.forName(f4609[n]);
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field m124(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Field m125(Class clazz, String string, Class clazz2) {
        Field field = Class258.m124(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Class258.m125(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m126(long l, long l2) {
        int n = Class258.m121(l, l2);
        Object object = f4608[n];
        if (object instanceof String) {
            String string = f4609[n];
            int n2 = string.indexOf(8);
            Class clazz = Class258.m123(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Class258.m123(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Class258.m124(clazz3, string2, clazz2)) != null) {
                    Class258.f4608[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Class258.m125(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Class258.f4608[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Class258.m123(178209365238214L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new IllegalStateException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method m127(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    public static Method m128(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Class258.m127(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Class258.m128(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method m129(long l, long l2) {
        return null;
    }

    public static MethodHandle m130(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'V' || c == '\u00f6' || c == 'U' || c == '\u00e4') {
                field = Class258.m126(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'V' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Class258.m129(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'k' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'u' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static Object m131(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = Class258.m130(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        try {
           return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Class258.class, "m154", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(Class258.class, "m131", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

