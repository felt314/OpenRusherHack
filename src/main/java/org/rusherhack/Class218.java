// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;

import java.lang.reflect.UndeclaredThrowableException;
import org.rusherhack.core.logging.ILog;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import javax.crypto.SecretKey;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.jar.JarEntry;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.jar.JarFile;
import java.net.URLStreamHandler;
import java.net.MalformedURLException;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.io.Reader;
import com.google.gson.stream.JsonReader;
import java.io.InputStreamReader;
import org.rusherhack.client.api.config.JsonConfiguration;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.Nullable;
import java.net.URL;
import java.io.InputStream;
import org.rusherhack.client.api.plugin.IPlugin;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.io.File;
import java.util.HashMap;
import java.net.URLClassLoader;

import org.rusherhack.command.config;
public final class Class218 extends URLClassLoader
{
    private final HashMap<String, byte[]> f4088;
    private final File f4089;
    private static boolean f4090;
    private final HashMap<String, byte[]> f4091;
    private static long f4092;
    private static String[] f4093;
    private static String[] f4094;
    private static Map f4095;
    private static long[] f4096;
    private static Integer[] f4097;
    private static Map f4098;
    private static Object[] f4099;
    private static String[] f4100;
    
    static {
        try {
        f4092 = Class066.m4320(5411954185927736789L, -6940732803413060286L, (Object)MethodHandles.lookup().lookupClass()).m4325(193782925597443L);
        final long n = Class218.f4092 ^ 0x3C0C8F7856C3L;
        f4099 = new Object[107];
        f4100 = new String[107];
        m122();
        f4095 = new HashMap(13);
        final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        final int opmode = 2;
        final SecretKeyFactory instance2 = SecretKeyFactory.getInstance("DES");
        final byte[] key = new byte[8];
        key[0] = (byte)(n >>> 56);
        for (int i = 1; i < 8; ++i) {
            key[i] = (byte)(n << i * 8 >>> 56);
        }
        instance.init(opmode, instance2.generateSecret(new DESKeySpec(key)), new IvParameterSpec(new byte[8]));
        final String[] f4101 = new String[32];
        int n2 = 0;
        String s;
        int n3 = (s = """
                      h\u00c9\u0015*KY¥\u0097J\u00da¶¡\u0006\u00de½\r8X\u00fe2D
                      i\u00cf\u001c·\u00ca\u00f5²Vn\u00dd,bo¬u\u009b\u00d6\u009cx\u00c8z\u00ed²¦p,Z½\u0018©µm\u00dfQ\u00f3'\u008e+u¿E\u00e0y\u00ff\u00fb\u00e9'\u00e3I\u00e1¨\u0010s\u00d9H\u00e2\u0011\u00c3K·\u00154r\u00c7\u00ca\u0016\u00e4E \u00cdd°\u00db\u00e4\u00d0¢\u009cD\u00e9j\u00823\r\u007f2\u0090\u00c1\u001fxp¶_\u0018\u0091\u0006\u00ff.+\u009f\u00cb\u00e0\u0010\u00e3\u008f\u00f9y9\u0003\fG\u0015\u00efn§\u00ef\u00065\f\u0010½\u0014#-\u000ee\u0084\u00cf\u00efU\u00d6\u00adg^u¿@{,¹[^\u00f4I	\u00c5\u008c\u00eaj\u001f\u0097\u0084~qS½\u008b\u0017\u0085E\u00f4\u0091^\u00c8\u00c3\u00c3¨\u0091½j\u0080\u007fkM3tH\u0086§´§\u00f5V\u00fa\u009a¦o.\u00918r\u000bO]\u009cE\u00ff)\u0002,¨(yª\u00ec8\u0017\u00c6\u0015m\u00ed/G\u00fcN\u0086M\u00fc\u001c\u00f8:,\\u001e\u001ei\u0097\u00df-a\u00f55\u00cdY\u00c5\u0087\u0092º\u00ff\u00d5\u0007\u00d1H5 \u00fd1\u00c8\u0093\u00de°aR\u0085\u00f3¯\u00fd\u0091Bx¿¥£¨\u00den\u008d\u00ea¨M[ooF±\u00f28«m\u00ea\u0006\u00da\u00d3\u00c9L\u0080m(\u00eb\u00fao\u00e0Gx»\u00fczO\u0087ªkBv\u00c6»\u00fe¬\u00ed:\u00e1\u0012\u00d8m\f]@u\f\u00c3\u000f[\u00f8E\u00ef d´\u0014\u0088^\u00edD/±\u00c1\u009e\u0017\u0018\u0098²,\u0088Kx\u00d5\u0082x-\u00fa_\u00f3\u00c1\u008dy>\u00e2\u001a(\u0001\u00fbC\u0019°.\u0096\u0083\u009bª]Vu\u00f0m\u00c9\u00ee\u00ff\u00ecA\u00dd`\u0010\u00000©|g\u00f2\u008c\u001e9¾+c\u00d7\u0093\u0002\u00f4(\u00f7¼\u009a\u009b¡\u0086£\u0016\u008b;1\u0087&\u00cb;\u0015\u00ce\u0000\u008f¦D\u009aV\u0018ª\u0099\u00db£/\u00ef¨\u00caX\u001a\u0016\u008b\u00ddr,\u00110\u00ec\u00d2®\u00e3^´:\u0086D\f\u0080\u00e7j\u0091\u0099¾2a\u0095r}|\u00cb\f\u0097\u00e1¶¾D\u0007\u0002\u0014V|q4`\u00fc\u009fn<ª§ 5\u0091>k\u0010v\u00e5OQ\u00cc\u0081\u00c9\u009d\u0001S\u0017\u008e48\u00c6s\u00106\u00d6:r\u00f8²¤\u00ef\u00e7\u00df\u00f51\u00d8\u00d7\u008f¨\u0010\u008f\u008b\u00eb^¬\u00ca\u00fbºi\u00c6\u0017´\u00dd9\u0003r(\u00d4¼h¤Z\u0011\\µ@E²g¢\u00d6\u009c\u00fc\u00dc\u00c4\u0003*\u00e59º©$\u00c1°\u00dd\u00e7,\u008b}\u00cf\u0091\u0093\u00edh\u00c2¦u\u0010\u00e1\u009c7:~\u0095\u0086o\u00f9y\u00e8\u008c\u0091(² 8Ru\
                      \b\u0000\u00f2e\u0003e\u00daµZ¿\u0006\u00f1o<\u0012\u0080\u00daqª¿l°GX{\u00fd\u00c6~i¼\u009e2S\u008e\u0018\u009e\u0089\u00df\u00c8f+&°\u00c5\u0013h
                      \u000b-^±N(\u00ce\u00c3/\u009fj\u0082\u00d2\u009a\u0097-¦\u0016\u009d\u0004\u00e9}*\u00d8CY\u00e9\u00f6\f\u0017\u00dcº\u0094@@!\u00f0/\u0087@³\u0087£`\u00d8\u0014\u00c0#a\u00d1y	\u009f\u0081\u0099\u00fd\u0089\u00e4	\u0011Xb^\u0085X\u00def\u00e8²Ec1,\u00ee-\u000eE¢D\u008e\u00cf;U\u0099\u0085¼\u00d9\u00f2\u00ee\u0002\u0093-\u00df\u0089Oª¥\u00ef\u00caY\u00f0I\u0085\u0082\u0017\u00c7\u00d8¾\u00c4\u00e1\u00f2\u009b\u001c\u008b\u00f7\u00dby\u00eeh¸\u0082\u00fb\u0001\u0080C\u00cd\u000e\u00d0;B\u0089\u0013\u0002b\u00ccR\u0005\u00e7\u00fc\u00e4\u0084\u00d8\u0082b\u0010\u00eaª
                      µ\u00c3 d|U\u00eeE\u0091n\u00fcA)\u009c)`ob!<\f\u008c\u001d\u008a@:\u00fbl\u0084¿DO¢\u00fb\u001e-\u00cf_¦\u0098uO\u00e2\u001a\u0093\u0098\rº\u00c4g!\u0086\u0014ª6\u00132\u0005-H\u0018\u00ec\u008b\u0013\u00e3©\u00fb\u00c3\u00e0k&%\u00e9§7g~\u008a0&¹¸\u00c7\f\u0001 \u0090¹\u00d8\u00f9%@K;
                      ¯\u00fejG]ª£\u00c7\u007f\u00f75N\u00cf^nt½\u001bu¡\u0087-H=GjQªJ\u00dfY\u00cb\u00fe\u00f7\u0012\u00c3\u0096F\u0086/\u00df\u00efLY*S\u0084\u00ce\u009e#wg\u0014<\u00e4©\u00d0»=\\¿0]\u00f8\u00c0\u0083\u001c\u00ee|(P&<\u00f6¬\u0001
                      \u0010\u00e0\u0004·\u00e1\u0093U/Z\u0011\u0097}\u0094¬	t48\u00f9\u0004\u0011s\u00d4D±\u00d2f\u00e9\u00ce\b\u009a\u0014\u00dd\u00c0P\u0085VxG`Z\u008e4¼<¨(®\u00ebU\u001b\u0094[@\u00e7~@Zv\u001a\u008c\u0099
                      %	\u00efM\u009eQ)¿rsR\u00f7s^_\u00d3\u00dcK\u0012<\u000b´\u00c8¨\r\u0082\u0082\u00c4\u009eR}¼¦L>\bm\u00e8O\u0019\u00cf\u0010\u00cb\u00d9\u00ad´\u0006\u0080A>,\u00c99ZC²!2\u0010	\u0085W¤§\u00d5\u00dc%\u00f0_G9\u00e5\u0015%\u00dbAª\u00d7l\u00f4\u00e0\f\u00e7¿\u0085\u0017\u00d6¿£ji\u00f3©
                      J\u0010¹¤\u0081\u0083C\u0084Sc=B)q\u00fe>\u00c84"9\u0086\u001aA1\u008ac\u00d5l\u0098\u008eQ\u00e8\u0016\u00e8\u00d6\u00e7'a\u0011\u008a\u00cc\u0007\u0019]u\u00f5©\u00916³\u0099]\u00c7°\u00e8\u0014M<$\u0080\u00ec\u009e\u00db\u00d5\u008c\u0092W\b\u007f\u00d8-X,§u\u00eb3.\u0091\u0006,\u009c¼¢\u00ca\u00dc\u007f\u0089-\u008c\u00c1\f<\u00cb\u0092\u00fd8\u00997!Kp\u00c0\u00daE\u00e1|0\u00e8\u00f2\u0086\u0019m\u00ea«t¹\u0088<\u008a$\u00e6|\u0080\u00043%P\u0010K\u00cf\u001d\u00eaw¬B«X\u008d\u00d1/)\u00fe\u008b0QU\u0090\u008a\u007fq@\u0082\u001e\u0001\u00ddBo1\u00e0¦5\u0097\u00c6\u0093\u00e5®\u0013 #\u0015;\u00e6\u009b\\u008b\u00185\u00f58\u0012\u0091v?@\u00e2\u0086\u009eI&k´\u00f7¾\u00c4\u00e6\u00e2l\u00c8\u000f.\u001b\u00cb\u00c2\u008d\u00d0i\u00f0¡j7I\u0086\u00c6\u00c5\u00f8\u009a96W\u008d\u008aje\u00d0 \u00c2.\u00ec\u00c8\u000exAO\u000f\u0089\u00dbQ\u009d\u00f2lµ\u00ed&\u00cb\u009e\u00ec\u001d\u0015\u00db\u0087\u00fc»\u00df\u00ca\u00eb©\u00d5o¶7\u00dfºªv\u0006]ª\u0003Fu7\u00fa\u00ee>\u009a¢¥\u00f8@\u00050¡\u00c8º}\u0010\u008b½\u00d8\u00f2\u0099K\u00d5M\u008b\u00e0\u00e6\u00c1u|¹H8A²\u00e5Q\u0083Ml\u0018\u0085w]i¿3¥^|\u00ffg\u00f3\u00c1\u0092\u00c1o¯\u00d3\u00db\u0007\u001c\u00e0\u00c4\u00d3\u000b\u000fR\u00ca"¹zG\u00d3\u00d8hI\u00cc®]_ \u001bS\u00904\u00c9\u00f3¥\u0010\u00128w¢\u000f\u0092\u00f8|\u00dc?9\u0012(¯\u00c6  \u0097v\u0006·£\u00c7K|\u00e5\u0018\u00db\u00ec:0\u0083\u00e8¶\u008b/Zd:\u0084t¿\u00ebµ\u00edq\u000b\u00e7\u00058z>ª@z:?\u00cbW\u00fbd|\u00f9e\u0099@\u00f4f`\u008c\u0006?A\u0085¿²\u008e\u00d20Q\u0003{¶3{;Z\u0094\u00e5J\u0016n¹L\u00ea\u0012¾$\u00f6\u000b.
                      \u00ca\u0098£\u00c4""").length();
        int n4 = 16;
        int n5 = -1;
    Label_0179:
        while (true) {
            while (true) {
                ++n5;
                final String s2 = s;
                final int beginIndex = n5;
                String s3 = s2.substring(beginIndex, beginIndex + n4);
                int n6 = -1;
                while (true) {
                    final String intern = m117(instance.doFinal(s3.getBytes("ISO-8859-1"))).intern();
                    switch (n6) {
                        default: {
                            f4101[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                continue Label_0179;
                            }
                            n3 = (s = "W0/\u00c5\u00d0U·\u00fb\u00ca\u00e1\u00c9\u0019\u00dd¢\u00f21I\u00c5t\u00844ª\u0090\u00da\u00c8\u0084º-'\u001f\u00ff\u0089\u00cb \u0088\u0001\u00c2\u0085\u00ea\u007f%¢Q#?\u00e1\u0016\u00d3\u00d3§#\u007f\u009f§\u001b!\u0089\t\u008cJ\u00e6\u00ebQ\u00c6¦b\u0086\u00e0aBnw\u0017\u0006\\\u00f5i\u0096\u00f8¤<\u0092²\u0088¹µo\u00day¾\u0096br\u00f4<]¥\u0001\\\u00d2\u00e5C\u009fD\u00cb\u00e0!7¯º/;\u001ak\u0006<\u0098\u00cc\u00ff©\u00ffETN\u00fb§\u0090;q&Q\u0011\u00cen\u0099a¢\u00e5\u0086\u0096½\u00ff\u0001P\u0083\u000fL\u00cci\u0015\u0096\u0086\u0006\u009d\u00d52´\u0010Z\u0096\u0095(`\u00efz\u00eb*1\u00ed\u00cd\u00f8\u00c8F:.h\u00f6X\u00f4/v\u0010\u00ec\u009f\u00ad\u008e°\u00f2Fu\u001e\u0095\u0096\u0014\u00f6c\u00deRA!E\\©\u00ed\u009f°\u000f¶\u008b·\u00c1#\u000fA\u0003N7wV\u00d9S½\u00d7C¿").length();
                            n4 = 24;
                            n5 = -1;
                            break;
                        }
                        case 0: {
                            f4101[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                break;
                            }
                            break Label_0179;
                        }
                    }
                    ++n5;
                    final String s4 = s;
                    final int beginIndex2 = n5;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n4);
                    n6 = 0;
                }
            }
        }
        f4093 = f4101;
        f4094 = new String[32];
        f4098 = new HashMap(13);
        final Cipher instance3 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode2 = 2;
        final SecretKeyFactory instance4 = SecretKeyFactory.getInstance("DES");
        final byte[] key2 = new byte[8];
        key2[0] = (byte)(n >>> 56);
        for (int j = 1; j < 8; ++j) {
            key2[j] = (byte)(n << j * 8 >>> 56);
        }
        instance3.init(opmode2, instance4.generateSecret(new DESKeySpec(key2)), new IvParameterSpec(new byte[8]));
        final long[] f4102 = new long[3];
        int n7 = 0;
        final String s5;
        final int length = (s5 = "nT\u00ef\u008ao\u008ab\u0090\u001dh\u0093\u00f7\u00eb\u0017j+\u009d>\u0001o&µ\u0016\u00fe").length();
        int k = 0;
        do {
            final String s6 = s5;
            final int beginIndex3 = k;
            k += 8;
            final byte[] bytes = s6.substring(beginIndex3, k).getBytes("ISO-8859-1");
            final long[] array = f4102;
            final int n8 = n7++;
            final long n9 = ((long)bytes[0] & 0xFFL) << 56 | ((long)bytes[1] & 0xFFL) << 48 | ((long)bytes[2] & 0xFFL) << 40 | ((long)bytes[3] & 0xFFL) << 32 | ((long)bytes[4] & 0xFFL) << 24 | ((long)bytes[5] & 0xFFL) << 16 | ((long)bytes[6] & 0xFFL) << 8 | ((long)bytes[7] & 0xFFL);
            final byte[] doFinal = instance3.doFinal(new byte[] { (byte)(n9 >>> 56), (byte)(n9 >>> 48), (byte)(n9 >>> 40), (byte)(n9 >>> 32), (byte)(n9 >>> 24), (byte)(n9 >>> 16), (byte)(n9 >>> 8), (byte)n9 });
            array[n8] = (((long)doFinal[0] & 0xFFL) << 56 | ((long)doFinal[1] & 0xFFL) << 48 | ((long)doFinal[2] & 0xFFL) << 40 | ((long)doFinal[3] & 0xFFL) << 32 | ((long)doFinal[4] & 0xFFL) << 24 | ((long)doFinal[5] & 0xFFL) << 16 | ((long)doFinal[6] & 0xFFL) << 8 | ((long)doFinal[7] & 0xFFL));
        } while (k < length);
        f4096 = f4102;
        f4097 = new Integer[3];
        f4090 = "false".equals("true");
    
        } catch (Exception exception) {
            throw new ExceptionInInitializerError(exception);
        }
    }
    
    private static Class m123(final long n, final long n2) {
        final int m121 = m121(n, n2);
        final Object o = Class218.f4099[m121];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(Class218.f4100[m121]);
                Class218.f4099[m121] = forName;
            }
            else {
                forName = (Class)o;
            }
        }
        catch (final Exception ex) {
            throw new IllegalStateException(ex.toString());
        }
        return forName;
    }
    
    private static Field m124(final Class clazz, final String anObject, final Class clazz2) {
        for (final Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    private static Field m125(final Class clazz, final String s, final Class clazz2) {
        final Field m124 = m124(clazz, s, clazz2);
        if (m124 != null) {
            return m124;
        }
        final Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                final Field m125 = m125(interfaces[i], s, clazz2);
                if (m125 != null) {
                    return m125;
                }
            }
        }
        return null;
    }
    
    private static Field m126(final long n, final long n2) {
        final int m121 = m121(n, n2);
        final Object o = Class218.f4099[m121];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        final String s = Class218.f4100[m121];
        int index = s.indexOf(8);
        final Class m122 = m123(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        final String substring = s.substring(index, index2);
        ++index2;
        final Class m123 = m123(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m122;
        while (true) {
            final Field m124 = m124(clazz, substring, m123);
            if (m124 != null) {
                return (Field)(Class218.f4099[m121] = m124);
            }
            final Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    final Field m125 = m125(interfaces[i], substring, m123);
                    if (m125 != null) {
                        return (Field)(Class218.f4099[m121] = m125);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                final StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m122.getName()).append(' ').append(m123.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m123(500599963348887L, 0L);
        }
    }
    
    private static Method m127(final Class clazz, final String anObject, final Class clazz2, final int n, final Class[] array) {
        for (final Method method : clazz.getDeclaredMethods()) {
            Label_0097: {
                if (method.getName().equals(anObject) && method.getReturnType() == clazz2) {
                    final Class<?>[] parameterTypes = method.getParameterTypes();
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
    
    private static Method m128(final Class clazz, final String s, final Class clazz2, final int n, final Class[] array) {
        final Method m127 = m127(clazz, s, clazz2, n, array);
        if (m127 != null) {
            return m127;
        }
        final Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                final Method m128 = m128(interfaces[i], s, clazz2, n, array);
                if (m128 != null) {
                    return m128;
                }
            }
        }
        return null;
    }
    
    private static Method m129(final long n, final long n2) {
        final int m121 = m121(n, n2);
        final Object o = Class218.f4099[m121];
        if (o instanceof String) {
            final String s = Class218.f4100[m121];
            int index = s.indexOf(8);
            final Class m122 = m123(Long.parseLong(s.substring(0, index), 36), 0L);
            ++index;
            final int index2 = s.indexOf(8, index);
            final String substring = s.substring(index, index2);
            int n3 = -1;
            int index3 = index2;
            do {
                ++n3;
            } while ((index3 = s.indexOf(8, ++index3)) > -1);
            final int n4;
            final Class[] array = new Class[n4 = n3 - 1];
            Class m123 = null;
            int n5 = index2 + 1;
            for (int i = 0; i < n3; ++i) {
                final int index4 = s.indexOf(8, n5);
                m123 = m123(Long.parseLong(s.substring(n5, index4), 36), 0L);
                if (i < n4) {
                    array[i] = m123;
                }
                n5 = index4 + 1;
            }
            Class superclass = m122;
            while (true) {
                do {
                    final Method m124 = m127(superclass, substring, m123, n4, array);
                    if (m124 != null) {
                        return (Method)(Class218.f4099[m121] = m124);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m122;
                    while (true) {
                        final Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                final Method m125 = m128(interfaces[j], substring, m123, n4, array);
                                if (m125 != null) {
                                    return (Method)(Class218.f4099[m121] = m125);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            final StringBuffer sb = new StringBuffer();
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
                        clazz = m123(500599963348887L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m123(500599963348887L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    private static MethodHandle m130(final MethodHandles.Lookup lookup, final MutableCallSite mutableCallSite, final String s, final MethodType methodType, final long n, final long n2) {
        final char char1 = s.charAt(0);
        Field m126 = null;
        Method m127 = null;
        try {
            MethodHandle target;
            if (char1 == '\u00d8' || char1 == '\u00eb' || char1 == '\u00fd' || char1 == '\u00f1') {
                m126 = m126(n, n2);
                final Class<?> declaringClass = m126.getDeclaringClass();
                final String name = m126.getName();
                final Class<?> type = m126.getType();
                if (char1 == '\u00d8') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == '\u00eb') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == '\u00fd') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m127 = m129(n, n2);
                final Class<?> declaringClass2 = m127.getDeclaringClass();
                final String name2 = m127.getName();
                final MethodType methodType2 = MethodType.methodType(m127.getReturnType(), m127.getParameterTypes());
                if (char1 == '¥') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == 'K') {
                    target = lookup.findStatic(declaringClass2, name2, methodType2);
                }
                else {
                    target = lookup.findSpecial(declaringClass2, name2, methodType2, declaringClass2);
                }
            }
            return MethodHandles.dropArguments(target, methodType.parameterCount() - 2, (Class<?>[])new Class[] { Long.TYPE, Long.TYPE });
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append(ex.getClass().getName()).append(" : ").append((m126 != null) ? m126.toString() : ((m127 != null) ? m127.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    private static Object m131(final MethodHandles.Lookup lookup, final MutableCallSite mutableCallSite, final String s, final MethodType newType, final Object[] array) {
        int n = array.length - 2;
        final MethodHandle m130 = m130(lookup, mutableCallSite, s, newType, (long)array[n], (long)array[++n]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m130, newType));
        try {
           return m130.asSpreader(Object[].class, array.length).invoke(array);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    
    private static CallSite m174(final MethodHandles.Lookup p0, final String p1, final MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class218.m174:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
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
        // Caused by: java.lang.ClassCastException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static class ProcyonInvokeDynamicHelper_1
    {
        private static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_1.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_1.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_1.LOOKUP;
                try {
                    handle = ((CallSite)Class218.m174(lookup, "¥", MethodType.methodType(URL.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static URL invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (URL) ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }

   public Class218(java.io.File file) { super(new java.net.URL[0]); this.f4088 = new HashMap<>(); this.f4089 = file; this.f4091 = new HashMap<>(); }
   private static int m121(long a, long b) { return 0; }


    private static String m117(final byte[] array) {
        int count = 0;
        final int length;
        final char[] value = new char[length = array.length];
        for (int i = 0; i < length; ++i) {
            final int n;
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

    private static void m122() {
        final Object[] f4099 = Class218.f4099;
        f4099[0] = "&a`1\u0014b:{bm\u000ev*x)|\te,=kp\u0001p }`1*x.tbm";
        f4099[1] = ".>)\u0019\u0000 %18V}8661\u001f";
        f4099[2] = Void.TYPE;
        Class218.f4100[2] = "java/lang/Void";
        f4099[3] = "\u001eQ,buj\u0002K.>o~\u0012He\u0127";
        f4099[4] = "j\u0007};Ewv\u001d\u007fg_cf\u001e4\u0213";
        f4099[5] = Integer.TYPE;
        Class218.f4100[5] = "java/lang/Integer";
        f4099[6] = "\\H9I>-B@#\u0006X9EA\u0002I`";
        f4099[7] = ":v\b=h\u00121y\u0019r\t\u001c:r\u001d(";
        f4099[8] = "\u001d\"\u0003g5V\u00018\u0001;/B\u0011;J\u0180";
        f4099[9] = """
                   \u001c\u0011#\bb
                   \u0017\u001e2G\u0018\u000e\u0004\u001f"\b.
                   \u0013""";
        f4099[10] = Boolean.TYPE;
        Class218.f4100[10] = "java/lang/Boolean";
        f4099[11] = "7)";
        f4099[12] = "l)y0\u00060g&h\u007fk0g;|";
        f4099[13] = "W 5ZIqK:7\u0006Se[9|\u0017Wm]<&ZZtQ|'\u001d\u0015AT7?\u0011Upz3!\u0011";
        f4099[14] = """
                    \u0006-0H=}	8hdr\u007f
                    #4Dvw9\u001e
                    lkp	<2@|}""";
        f4099[15] = "\u0003Bg\u0000\ru\bMvOp`\u001aWt\f";
        f4099[16] = "\u0015gF \u0018\u001d\t}D|\u0002\t\u0019~\u000f\u0446";
        f4099[17] = "#O\"G;\u0007=G8\b\u007f\u0013;\u0000\u001eGg4 B1";
        f4099[18] = "\u0013nXTd2\rfB\u001b0.\t!t\\:\u0002\u0017{\\L";
        f4099[19] = "FW;vqhC\u0018\u0004y/tXe9e:`A";
        f4099[20] = "Q{-<E\u0013Zt<s(\u0017Zh\b8\u001a\n^t88";
        f4099[21] = "\f\u0017\n@x\u0012\u0012\u001f\u0010\u000f\u0013\t\u0013\u001b\u0019S7\u0013\u000f\u0019\u0012";
        f4099[22] = "};C@i/xtsH+#";
        f4099[23] = "d\u0016\u001a$=kx\f\u0018x'\u007fh\u000fSi lnJ\u0011e(yb\n\u001a$\u0006Rd\u0003";
        f4099[24] = "o9-\u0019%Y\u001a\u0019&\u00164\u0016{\u0017-\u001d0L\u000f";
        f4099[25] = "\u001cS";
        f4099[26] = Character.TYPE;
        Class218.f4100[26] = "java/lang/Character";
        f4099[27] = "+}K&~,'uJm7$;}H&S0'|vzp.!fO~|";
        f4099[28] = "\u0001\u001e]C\u0003(\u001d\u0004_\u001f\u0019<\r\u0007\u0014\u0253";
        f4099[29] = "\u001d82\u0017^\u001d\u001103\\\u0017\u0015\r81\u0017s\u0001\u00119\u0010[S\u0017\u001d#";
        f4099[30] = "$Y3J\u0012\u0002(Q2\u0001[\n4Y0J?\u001e(X\u001f\u0016\u0007\f>";
        f4099[31] = "#m\u0019,<x/e\u0018gup3m\u001a,\u001cd/l";
        f4099[32] = "m,VT#+a$W\u001fj#},UT70|&Z\u0017j\u000e},U(!%j&I";
        f4099[33] = "Z$\u0018XWFQ+\t\u0017\u000bOV)\u000bZ\r\u0004d<\u001e\\";
        f4099[34] = "b5\u0002%~+~/\u0000yd?n,Kh`7h)\u0011%m.di\u0006db8d KA\u007f1c\u0004\nej7j2\u0017jx7b)";
        f4099[35] = "4j\"\u0013Qz;\u007fz'-X";
        f4099[36] = ">-{\u0010\u000bXK\rp\u001f\u001a\u00176\u0015c\u0018\u0013^^";
        f4099[37] = "\u000e46-\u000e\u001e\u0002<7fG\u0016\u001e45-#\u0002\u00025\u001eo\f\u001c\b5/";
        f4099[38] = "\u000ffX\u001b#1zFS\u00142~\u0007^@\u0013;7o";
        f4099[39] = "g\tj\u007fY[{\u0013h#COk\u0010#2GGm\u0015y\u007fJ^aU}=^Ia\u0015#\u0018{B}\u001cd?";
        f4099[40] = "[\b[\\\u000e$P\u0007J\u0013R-W\u0005H^Tfr\u0006CNT:D\nYRR";
        f4099[41] = ".\u0004'V%_[$,Y4\u0010:*'R0JN";
        f4099[42] = "\rO\u000b&Mcxo\u0000)\\,\u0005w\u0013.Uem";
        f4099[43] = "b\u001a\u00125`.\u0017:\u0019:qaj\"\n=x(\u0002";
        f4099[44] = "]G]:\u0019\u001e(gV5\bQEgV(\u001cD";
        f4099[45] = "5|)e_$.$wf2(3i\u0006~J:\"N;b_.;\u0015,~\u0002':w\"u^=^y-g\u0003\u007f!.-b\bG";
        f4099[46] = ">S}\u0007\u00185\u007f\u0006*\u0006%;)FU\u0017@9D\u0003)\u001eU.9Vp@\u0015T";
        f4099[47] = "w;\u0003]+\nm.\u0007\u0006M\u026d\u0015p\u0000\u0000=\fh%Y^}v";
        f4099[48] = "G|cJfA\u0012ve%?^Gp\\\u001cdXYm!I=\u0006\u0019\u0017eE4XIt&\u0019=H)";
        f4099[49] = "\u0014eR;3\u0015A<\f{I\u0003J9N\"(\u000eV__\"p\tLgT3sY-`\u000bv&\u0014D=Y'3h";
        f4099[50] = "0u\u00117T5n)\nkm`>i\"!/t4s\" \u0017f\"\u0015R`\r\u007f)h\u00079S?Sq\u000bg\u001c6?,\u000f0W\u000f";
        f4099[51] = "iXl2u\u0018:X0}\u0014RX\u0006;#d\u0004%Sb}$~a\u0005a3n\u00034\\?s\u0014";
        f4099[52] = "QfarBPR>} &Go`b.\u001a\u001a\u001d7|z\\";
        f4099[53] = "\u0007\u000f;\u0014\u001a\u000bRVeT`\u0012SS4\u0018\u0000v\u0005K6\\\t\u001c\u0004\\>\t`";
        f4099[54] = ">b\u000f\u000ef\u0007\u007f7X\u000f[\t)w(\n'\u0006#q\u001aw'\u00198q[H:\u0002!ba";
        f4099[55] = "m9UeG+8`\u000b%=-)iNiG72l5.C;lj_/T39\u0003\u000ekPn=i\u000f|X;T:\u000fuM,)oV+\rV";
        f4099[56] = ">g=e;^\u007f2jd\u0006P)r\rq|D%i5\u001c?\u0005$~)aj\\z>S";
        f4099[57] = "B\bLTd2J\u001c[\r]*B\u0001^&9!J\u001cD\u0017]p_\u001e\u001e\u0004`vN\u0015\u0019k";
        f4099[58] = "8I*Q\u001f\u0002\"\\.\ny\u046eZGl\u0010\u0003DeZw\t\u0010~c[y\f\u0019\u001d \u0007p\u001cy";
        f4099[59] = "i+x\u000f`<s>|T\u0006\u0101\u000b`{Rv:v5\"\f6@";
        f4099[60] = "$\u00167\u0007&r.\u0003j@\u001cs3\u0018\u001a\u0019gi7\u00010\u0012\u001cn$\u000eaC})#Y\"\u007f e1[4B&t:\\[";
        f4099[61] = "QScDT\u000eR\u000b\u007f\u00160\u0018\b\u0000i>T\u0015\u0014\u0012\u0005L\n\u001c\u001f\u0013x\u0019SB_i5\u0010W\u001a\u0003\u0003bK\b\u0005o";
        f4099[62] = "}\u0016q\t#r*\b%O\u001bo,\u000f\u001c\tko}\u001c!\u000fzdzs Et<.N&T\u007f;A";
        f4099[63] = "(\u000e \u0019Bj:\u0007#Z>i=M+\u0019>=}W<\u0019Ch$\t|cE~.\rp\u0002\u0002yyNLZ^n'W/\u0019\u0002g77";
        f4099[64] = "8\u001e\u0005D\\\u0002n\u0001\u0001\u001dd\u0168RG_\u0018\u0014H/\u0012\u0006FT2kD\u0005\b\u001eO>\u001d[Hd";
        f4099[65] = "\\MFk<P\u000bMC`\u0004U]NU\u0013`KzVE7\u007f/PJ@<~K\\U\u0002*\u0004";
        f4099[66] = "-\u0002\u001c:o\u0019x[Bz\u0015\u001ey@\u0018#~\t\u0014Y\u00168t\u0000lT\u0010:vduR\u000e+q\u001cxT\f)\u0015].X\f0h\bw\u0006LJ";
        f4099[67] = "KF\u00175IoP\u001eI6$gDH\u0002%$5@E\u0019(Gv\u001cL\tH";
        f4099[68] = "u$ML\u0010z+xV\u0010) \u007f?7\u0018\u0013 f>JMJ~&D\b\u0018\u0014/j-UJE:\u0016";
        f4099[69] = """
                    Q@o\u0017;H\u0004\u00191WAX\u0011\u0007f\u0003:5T
                    `[.\bR\u001bk\\A
                    QG`\u001b(W\u0003\u0016ug""";
        f4099[70] = "F9<9Ay\u000405:~-\u0014.\u001c\"\u0006<\u0002/<$\u0013(x|<$\u0018{E>5-\u001bDA\"-?\u001e'\u0002~$/~";
        f4099[71] = "b:wT_J5$#\u0012gS99f\u0001\u0006^%\u001cw\u0019g\u0004.0&\u0007Z\u0002?;!hX\u0001c0f\u0001\u0005S2%\u001a";
        f4099[72] = """
                    B\2J-d\u0015\u0007mUAa\u001fE\u0019A*j\u001bC8@
                    i\u0014B)V<e\u000e^/,<oIX8\u0013\u007fw	^UV0b
                    \u00032\\%?M9""";
        f4099[73] = "V5\u001b>\u0014=\u0001+Ox,7\u0017,v>\\ V?K8M+QPJrCs\u0005mLcHtjl\u0006m\u0010 Wj\u0017f\u0017O";
        f4099[74] = "}S\u0010\u000bI0uG\u0007Rp.yQ;S\n#]N\u0013Q\u001d(lQ~\u000bIs\u007fV\u0017V\u001b\"j*";
        f4099[75] = """
                    \b	<~\u001e5\u000bQ ,z\u03e26
                    :%\u001a'UIf,
                    G""";
        f4099[76] = "sR(S`~5S)\u001e\u0001pIX/\u0010n#0\r%\u0016";
        f4099[77] = "\u0011NBv\u0015p\u0017QR7h\u056a+\u0007B\"PcA\u0006U*\u0005\n";
        f4099[78] = "=\u001fFR\u001dX3\u0014\u001aHy[-5\u0017H\u0014Q*\u001e\fCy\u0005oD\u0019N\u0010X=\u0015\f2";
        f4099[79] = "4\u001a\u0000QBb.\u000f\u0004\n$\u04dcVQ\u0003\fTd+\u0004ZR\u0014\u001eo\bS\fD},TZ\u001c$";
        f4099[80] = " !+\u0013\u0003o&>;R~\u024c\u001ah+GF|pi<O\u0013\u0015";
        f4099[81] = "\u0000PA|,\u000e^\fZ \u0015[\u000eLrjWO\u0004VcktQ\u0002LZox4Z\n[aoI\u000fS\u0005!\u0015U\u0011O\u0004ki\b[_Z\u0011";
        f4099[82] = "HJl[$hR_h\u0000B\u017f*\u0001o\u00062nWT6Xr\u0014\u0013X?\u0006\"wP\u00046\u0016B";
        f4099[83] = ">Q;4'\u0017$D?oA\u02fa\\\u001a8i1\u0011!Oa7qk";
        f4099[84] = "s\u0003j\u001d/Wq\u001b(G\u0011sN9\u0010,uE-\u0003,It\u0006-A";
        f4099[85] = "\u00004H\u0005~<\u0003lTW\u001a¸>2KY&vLeU\r`";
        f4099[86] = "\u0018:?0r\u0007\u001bb#b\u0016\u001bGf5[{\u000eA}#j{u\u001f:9ql\bJcg1\u0016\u0012^}:kr\u0014Cn'\u0001";
        f4099[87] = "_\u001d?^\u0007\u001fY\u0000,Cm\u001c@\b$f\u0011\u0001U\f'=\u0001\u0011GTzBV\u0011B_B";
        f4099[88] = "U-k&!GO8o}Gz7#-g=\u0001\b>6~.;\u000e?8{'XMc1kG";
        f4099[89] = "\u0001-\u00143^t\u0002u\ba:\u0187?y\u001exE;\u0003-\n`W";
        f4099[90] = "9^vS\u001fWd\u0014f\reD5P@\u0017>W\"Mo\u0003e\u0012bLy\u0016\u0018G;\u00129l";
        f4099[91] = "\u0002M;Pc\u0000\bVdM_\u0011\u0006M\u0000V8\u0006\u0006K$]_GQQ(V\"\u0012\b\u000fh,fD\u000bA\"Q3\u001dU\u0001X\u0015e\u001e\u001bK%@<@[1";
        f4099[92] = "!<zQJ~`i-Pwp6)XE\ft!4lT\u0016x=U-\u0012\u0017o!(xKI/[";
        f4099[93] = "\u001e;x\u001bwv\u0005c&\u0018\u001ax\u0013.l\u0007wnu?o\b%,\u000b7{\u001f|\u0015";
        f4099[94] = "V\\\u000f{vlLI\u000b \u0010\u04d74\u0017\f&`jIBUx \u0010";
        f4099[95] = "*H\r\"X/+\u000b\r`\"$4VP\u001dY-(1P?D)p\u000b\nbM+NW\u000b%F:tUU?\u001aJrAZcMwtPQd\"";
        f4099[96] = "\u0007KiluIS_q~H\u001a\u0004[Uz-\u0018i\u001e)s8\u000f\u0014Kp-xu";
        f4099[97] = ">ph\u00014vkznnsf*}WW6o a*\u0002o1`\u001bn\u000efo0x-Ro\u007fP";
        f4099[98] = "F\u001b9\u001c{P\\\u000e=G\u001d\u016d$P:AmVY\u0005c\u001f-,\u001d\tjA}O^UcQ\u001d";
        f4099[99] = "o]Ks\u0016\u001buHO(p\u0499\rS\r2\n]2N\u0016+\u0019g";
        f4099[100] = "@c9?D\"C;%m 9~g$uFoC%-|EP@\"$h\u001fm\u0002+-k ";
        f4099[101] = "g\t\u007f!2+fJ\u007fcH y\u0017\"\u001e3)ep?$:%i\u001583wu\u0003@\";.\"i\u0017yd1N?\u0000(`'s9\u0011#gH";
        f4099[102] = "D>/\u007f.\fGf3-J\u0012\u0017j(('5\u001em25JG@d947\u0012\u0019:yN*\u0013\u0003b3*&\fAtIu4\u0013Bm#t#\u001b\u0017\u0004r0'F\u0013ns'/\u0013z4,),\u0012\u0010cwv3~";
        f4099[103] = "\u0011_q\u001b74\u0012\u0007mIS\u0394/Z.\u0017<:F\u0007|F)";
        f4099[104] = """
                     M0\u0003o1?E:
                     {^5\u0006)
                     i\u00051\u0015#\u000fI$$\u0017%l,>'\u001c(\u000fob.\fH""";
        f4099[105] = "\bv\u0006['!\u0006}ZAC,\u000elpR&.c)\f[39\u001e|U\u0005sC";
        f4099[106] = "qW`MMv&WeFubyZd\u0011u0}W\u007f\u001c\u0016s!^o|";
    }
}
