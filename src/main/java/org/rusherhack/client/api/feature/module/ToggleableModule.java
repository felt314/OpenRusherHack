/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package org.rusherhack.client.api.feature.module;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
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
import org.rusherhack.Class066;
import org.rusherhack.Class286;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.core.bind.BindManagerBase;
import org.rusherhack.core.bind.IBindable;
import org.rusherhack.core.interfaces.INamed;
import org.rusherhack.core.interfaces.IToggleable;
import org.rusherhack.core.notification.NotificationType;

import org.rusherhack.command.bind;
import org.rusherhack.command.send;
import org.rusherhack.command.toggle;
public abstract class ToggleableModule
extends Module
implements IToggleable,
IBindable {
    public boolean f735;
    public static String[] f736;
    public static long f737;
    public static String[] f738;
    public static String[] f739;
    public static Map f740;
    public static Object[] f741;
    public static String[] f742;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean isListening() {
        return false;
    }

    public ToggleableModule(String string, String string2, ModuleCategory iNamed) {
    }

    @Override
    public boolean deserialize(JsonElement object) {
        return false;
    }

    @Override
    public void toggle() {
        
    }

    @Override
    public JsonElement serialize() {
        return null;
    }

    @Override
    public boolean isToggled() {
        return false;
    }

    @Override
    public void onDisable() {
    }

    public ToggleableModule(String string, ModuleCategory iNamed) {
    }

    @Override
    public void onEnable() {
    }

    @Override
    public String getBindReference() {
        return null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onKeybindEvent() {
        
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void setToggled(boolean var1_3) {
        
    }

    public static void m1672(String[] stringArray) {
        f736 = stringArray;
    }

    public static String[] m1673() {
        return f736;
    }

    /*
     * Unable to fully structure code
     */
    static {}
    public static String m1491(byte[] byArray) {
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

    public static String m657(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2C70;
        if (f739[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])f740.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f740.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("org/rusherhack/client/api/feature/module/ToggleableModule", exception);
            }
            try {
                byte[] byArray = new byte[8];
                byArray[0] = (byte)(l >>> 56);
                for (int i = 1; i < 8; ++i) {
                    byArray[i] = (byte)(l << i * 8 >>> 56);
                }
                try {
DESKeySpec dESKeySpec = new DESKeySpec(byArray);
                   SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                   ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                   byte[] byArray2 = f738[n2].getBytes("ISO-8859-1");
                   ToggleableModule.f739[n2] = ToggleableModule.m1491(((Cipher)objectArray[0]).doFinal(byArray2));
                } catch (Exception exception) {
                   throw new IllegalStateException(exception);
                }
            } catch (Exception exception2) {
                throw new IllegalStateException(exception2);
            }
        }
        return f739[n2];
    }

    public static Object m658(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ToggleableModule.m657(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    public static CallSite m132(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new IllegalStateException("org/rusherhack/client/api/feature/module/ToggleableModule" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int m704(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f742[n3] != null) {
            return n3;
        }
        Object object = f741[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 59;
            case 1 -> 46;
            case 2 -> 26;
            case 3 -> 31;
            case 4 -> 5;
            case 5 -> 12;
            case 6 -> 42;
            case 7 -> 32;
            case 8 -> 63;
            case 9 -> 29;
            case 10 -> 37;
            case 11 -> 54;
            case 12 -> 33;
            case 13 -> 20;
            case 14 -> 15;
            case 15 -> 44;
            case 16 -> 61;
            case 17 -> 57;
            case 18 -> 22;
            case 19 -> 45;
            case 20 -> 38;
            case 21 -> 19;
            case 22 -> 47;
            case 23 -> 8;
            case 24 -> 0;
            case 25 -> 2;
            case 26 -> 30;
            case 27 -> 40;
            case 28 -> 49;
            case 29 -> 51;
            case 30 -> 50;
            case 31 -> 35;
            case 32 -> 58;
            case 33 -> 1;
            case 34 -> 43;
            case 35 -> 23;
            case 36 -> 55;
            case 37 -> 4;
            case 38 -> 39;
            case 39 -> 14;
            case 40 -> 28;
            case 41 -> 34;
            case 42 -> 9;
            case 43 -> 7;
            case 44 -> 16;
            case 45 -> 62;
            case 46 -> 21;
            case 47 -> 52;
            case 48 -> 25;
            case 49 -> 3;
            case 50 -> 56;
            case 51 -> 10;
            case 52 -> 18;
            case 53 -> 60;
            case 54 -> 6;
            case 55 -> 41;
            case 56 -> 36;
            case 57 -> 13;
            case 58 -> 27;
            case 59 -> 53;
            case 60 -> 17;
            case 61 -> 11;
            case 62 -> 24;
            default -> 48;
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
        ToggleableModule.f742[n3] = new String(cArray);
        return n3;
    }

    public static void m157() {
        Object[] objectArray = f741;
        f741[0] = "\u001dH1}m8\u0001R3!w,\u0011Qx0s$\u0017T\"}~=\u001b\u001406~9\u0007H3}r\"\u0016O:61\u0019\u001d]1?z,\u0010V3\u001ep)\u0007V3";
        objectArray[1] = "GFUJx|LID\u0005\u0002x_HTJ4|H";
        objectArray[2] = Boolean.TYPE;
        ToggleableModule.f742[2] = "java/lang/Boolean";
        objectArray[3] = Void.TYPE;
        ToggleableModule.f742[3] = "java/lang/Void";
        objectArray[4] = "\b\u0003\"o\u001e`\u0014\u0019 3\u0004t\u0004\u001ak\"\u0000|\u0002\u001f1o\re\u000e_#$\ra\u0012\u0003 o\u0001z\u0003\u0004)$BX\b\u00150-\t";
        objectArray[5] = "[\n\u000f*tYP\u0005\u001ee\tAC\u0002\u0017,";
        objectArray[6] = "qC^\\e;}K_\u0017,3aC]\\H'}Bv\u001eg9wBG";
        objectArray[7] = "(9fsa\u0003]\u0019m|pL \u0001~{y\u0005H";
        objectArray[8] = "\u001cs|n%\t\u0000i~2?\u001d\u0010j5#8\u000e\u0016/y)9\u0018]Cr.31\u0012oz'2\u000e1`h%";
        objectArray[9] = "!\u0018]~sWT8Vqb\u001856]zfBA";
        objectArray[10] = "\u0017y,]=w\u001cv=\u0012Qt\u0012t?]}";
        objectArray[11] = "U\"b:A3Y*cq\b;E\"a:l/Y#@vL9U9";
        objectArray[12] = "\u001b?`d-\\\u0007%b87H\u0017&)\u0274";
        objectArray[13] = "*N\u0019|Y|6T\u001b Ch&WP1G` R\n|Jy,\u0012\u001c;Emku<;Em\b]\u00103Ll7";
        objectArray[14] = "mp\u0019*MYqj\u001bvWMaiPgP^g,\u001cmQH,K<mQHc`\u0012a";
        objectArray[15] = "\u0014\u0010hcF\u0002\b\nj?\\\u0016\u0018\t!.X\u001e\u001e\f{cU\u0007\u0012L]8G\u001f\u001e\u0010G,W\u001c:2F";
        objectArray[16] = "5eL(8[)\u007fNt\"O9|\u0005e&G?y_(+^39X\u007f9Z?z\u0005O\u0004A.~Mo)O.~Dh\u0007O4vLc8";
        objectArray[17] = "\u0010IV\u0003\u0010!\fST_\n5\u001cP\u001fN\r&\u001a\u0015XC\u00161\r]PN\u0007'Qr\u007fL\u000f1\u001b";
        objectArray[18] = "\u0018\r&K\u0003\u0006\u0004\u0017$\u0017\u0019\u0012\u0014\u0014o\u0006\u001d\u001a\u0012\u00115K\u0010\u0003\u001eQ2\u001c\u0002\u0007\u0012\u0012o,9\u0006\u00132 \u000b\u0010\u0014\u0012\r";
        objectArray[19] = "\u001d\u0003\u0013\u001aR+\u0001\u0019\u0011FH?\u0011\u001aZWO,\u0017_\u001a[T7\u0014\u0018\u0017UT7\u001d\u001fZzO*\u001b\u0017\u001dWA*\u001b\u001e\u001a`Y.\u0017";
        objectArray[20] = Integer.TYPE;
        ToggleableModule.f742[20] = "java/lang/Integer";
        objectArray[21] = ")\u0011\u0004>\u0010`5\u000b\u0006b\nt%\bMs\rg#M\u000f\u007f\u0005r/\r\u0004>+Y)\u0004";
        objectArray[22] = "oE{m\u001eJ\u001aepb\u000f\u0005{k{i\u000b_\u000f";
        objectArray[23] = "!%`Y?==?b\u0005%)-<)\u0014\":+yk\u0018*/'9`Y\u0004\u0004!0`\u0012?";
        objectArray[24] = "\b\u0003\u0002Drq\u0003\f\u0013\u000b\u0013\u007f\b\u0007\u0017Q";
        objectArray[25] = "\u007fF\u0001k\u0005Oy\u001bZ{?R)\u001bE\u007fxB@E\u0001x\u0003F<\u0004StD,\u007fF\u0001k\u0005Oy\u001bZ{?";
        objectArray[26] = "Stgq&m\u00022zpA8Wv^/=6Tks!=6]l]!'>UgbH+<[;$$\u007fhDa\u0018";
        objectArray[27] = "d)n\u001b4\u001d8x.ae-ft\u007f\\aP2rr\u0013\u000f\u00143r(\u000fr@5\u007fga";
        objectArray[28] = "\n'YC{<Vv\u00199;aMJEV/h\\z\"\u0003yf\r|^B+jJ\u0016\u0018V\u007fbNjZG.g1";
        objectArray[29] = "\u0005\u0002\u0010Z :\u0003\u0010O\u000fE*\u0002\u00002\u000b>=\u000b\u0015\u000f,, \u0002|BR (\u0003\u001bG\u0013}{o";
        objectArray[30] = "LP\u0014=\"\\\u0010\u0001TGu\u0001\f\f\u0015&p\b\u0016\u0013\u0002G%\u0003\u0006\u0011T)tS\u0017\fo} \u0006K\u000b\u0013<r\n\fa";
        objectArray[31] = "w\u0006\u0016G\u0005ErGK\u0014iL,D\u0016C\u0015\"w\u0006\u0016G\u0005ErGK\u0014iL-C\u0019S\u001b\u0018 \u0001\u0013*U\u001a.S\u001fMP[s\u0000s";
        objectArray[32] = "*c a.dv2`\u001b\u0197T,h)%h5ji2%\u0015n~m5di,o<0\u001b";
        objectArray[33] = ":_GM\u001cC~^\u001b\\v\u0011iM|]\u0011\u0000h[XVvD=DIK\u0011A|\u0019\u001a'IA<X\u001eDO\u001cgH$\u001d\u0019Gk^X_\b\u0016n!";
        objectArray[34] = "\u0004S$\u0018KjXL:M\"/X[5\u000e^8O4e\b\u001dmX\u000e?\u0016\u001dj5\u000e;JL*IL*\u001bIU";
        objectArray[35] = "\u0011RC|GoE\u0006\\&{x\u0016_NM\u0017cE\tF7Bh\u001bK\"qCf\u0016UEt\u0002;E9O&\u0015eC\\\u001a/\u0014~{\u0003Mr\u0015|\u0007A\\#\u0010\u0003";
        objectArray[36] = "\u001b6\u0004\u0012[\n\u0019w\u0012G=\u0011['&\u001fA\u0019O+\u000b\u0011A\u0019F,\u001b5[\u0011K.\r\u0014=B\u0018 \\\u0012A\u0003J,\u001bx";
        objectArray[37] = "%[\u001998\tt\u000b\b$\u0003\btH!2I\u0000~P\u0005 eg#\r\u0002ui\u001bb_\u000e2\u0003";
        objectArray[38] = "%\u0005Ckg6hB\u0017z\u000bq\u0018EJbf1\u007f@\u000b?5]$A\u0017jg:!\u0000J9\u000b";
        objectArray[39] = "r\u0014G8d\u001e&@XbX\tx\u0018[m44\u007f\u0003Gg)7\u007f\u0013[m5.\u007f\u0010Im5\t\u0018E\u001fcd\u0018d\u0004Mo#r";
        objectArray[40] = "6{<p\u0001-\"c{`9+!p\"d9zco(r^\u007f\"2{\u001eW &`<l\u0003-djE$Vy5u9fG(0\n";
        objectArray[41] = "\u0013td\fl1O%$v0gd$d\u001f=eEE%\u0019hoW9g\b9j(";
        objectArray[42] = ".&Nd- \u007f`SeJu*${<,v\u00021W4%w=X\u0000::w.g\\%$\"G";
        objectArray[43] = "Y\u0002\u0010\u00014\r\bD\r\u0000SX]\u0000/E?rY\u001a\u0006W>M0\u0017\u0011R5IV\u0007\u000fQ/7";
        objectArray[44] = "&n\u0016$s\u0019z?V^\u0548)'f\u0007b\"Uf4\u000b%";
        objectArray[45] = "P\u0015~[mZRTh\u000e\u000b\u01b2jU\"TfD\rPc\t5(";
        objectArray[46] = "x\f \n(\u0002)\\1\u0017\u0013\u0003)\u001f\u0018\u0001Q\u0017#\u0005\u0016\u0010q\u0001/\u001fQEm\u000f.\tj\u0001lS?c";
        objectArray[47] = "Z[^(O\tJE]21\u0000\\Yq)]\u0012UHh)^\u0000UH\u007f)U\bK~H4P\t^%\u000ew[S[YO%W\u00141\u0019\f+\\\u0003V\u001cMv\u000fo";
        objectArray[48] = "\u00184`Y*D\u001auv\fLYO4BZ)[\"t<V!ZEq}\u000br6";
        objectArray[49] = "\u0002\b\u0015\nBb\u000eJBH8\u025e2ID\u0017U1UL\u0005J\u0006]\u000eM\u0019\u001fT:\u000b\fDL8";
        objectArray[50] = "S\fiV2w\u0017\r5GX#\u0001\u000e\n\u0000`)\u0001\u001em\u0005!tRr6S)<W\u001cg\u00038!l";
        objectArray[51] = "g\u0013R\u007f\bPeRD*nM0\u0013rr\u0001M0\u00156zV]l\u0000\u000b/\f\u001f&o";
        objectArray[52] = "\u0006\u001eac/kZO!\u0019h<R@~t\u0014aR\u0010tfh#CAq\u0019";
        objectArray[53] = "zE\t%$_\u007f\u0004TvHD!9\u000b7%B\r\u0014\u0017%H\u0004~\u0018\u0001$/\u0001?ERH";
        objectArray[54] = "\u0015s#B/*I\"c8owT#1\\uhCBdWej\u0015,5\u0007tw.";
        objectArray[55] = "\u0017\u000bjK\u0001,B\u00004\te\u0017=%\u0013{\t6E[0\u0001\\=\u001b\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[56] = "/oitnIs>)\u000e2\u001fY8{d1\u0014\u0014d}1;\u0006h&l`>y";
    }

    public static Class m706(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ToggleableModule.m704(l, l2);
            object = f741[n];
            try {
                if (!(object instanceof String)) break block2;
                ToggleableModule.f741[n] = clazz = Class.forName(f742[n]);
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field m707(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Field m708(Class clazz, String string, Class clazz2) {
        Field field = ToggleableModule.m707(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ToggleableModule.m708(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field m709(long l, long l2) {
        int n = ToggleableModule.m704(l, l2);
        Object object = f741[n];
        if (object instanceof String) {
            String string = f742[n];
            int n2 = string.indexOf(8);
            Class clazz = ToggleableModule.m706(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ToggleableModule.m706(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ToggleableModule.m707(clazz3, string2, clazz2)) != null) {
                    ToggleableModule.f741[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ToggleableModule.m708(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ToggleableModule.f741[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ToggleableModule.m706(1715653741626183L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new IllegalStateException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method m710(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Method m711(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ToggleableModule.m710(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ToggleableModule.m711(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method m712(long l, long l2) {
        return null;
    }

    public static MethodHandle m713(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cf' || c == 'd' || c == '\u00d2' || c == 'y') {
                field = ToggleableModule.m709(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cf' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ToggleableModule.m712(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'H' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static Object m714(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ToggleableModule.m713(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        try {
            try {
               return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
            } catch (Throwable throwable) {
               throw new IllegalStateException(throwable);
            }
        } catch (Throwable throwable) {
            throw new IllegalStateException(throwable);
        }
    }
    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ToggleableModule.class, "m658", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ToggleableModule.class, "m714", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

   public ToggleableModule() {}
}

