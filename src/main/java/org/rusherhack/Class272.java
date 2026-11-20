package org.rusherhack;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import it.unimi.dsi.fastutil.objects.Reference2LongMap;
import it.unimi.dsi.fastutil.objects.Reference2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceList;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.BufferAllocator;
import org.rusherhack.client.api.accessors.render.IMixinByteBufferBuilder;

import org.rusherhack.command.clear;
public class Class272 {
   public static ReferenceList<BufferAllocator> f4715;
   public static Reference2LongMap<BufferAllocator> f4716;
   public static ReferenceList<BufferAllocator> f4717;
   public static long f4718 = Class066.m4320(293128926621352461L, 4910151446477087808L, MethodHandles.lookup().lookupClass()).m4325(195429724617415L);
   public static long[] f4719;
   public static Integer[] f4720;
   public static long f4722;
   public static Object[] f4723 = new Object[47];
   public static String[] f4724 = new String[47];

   public static void m9556(BufferAllocator var0) {
      int var10000 = Class253.m9155();
      RenderSystem.assertOnRenderThread();
      int var3 = var10000;
      boolean var4 = f4717.remove(var0);
      if (var3 != 0) {
         if (!var4) {
            return;
         }

         var0.clear();
         f4715.add(var0);
      }
   }

   public Class272() {
   }

   public static BufferAllocator m9557() {
        return null;
    }

   static {
   }

   public static int m9558() {
      return f4715.size() + f4717.size();
   }

   public static void m9560() {
      int var2 = Class253.m9155();
      if (!f4717.isEmpty()) {
         ObjectListIterator var3;
         for (ObjectListIterator var10000 = var3 = f4717.iterator(); var10000.hasNext(); var10000 = var3) {
            ((BufferAllocator)var3.next()).clear();
            if (var2 == 0) {
               return;
            }
         }

         f4715.addAll(f4717);
         f4717.clear();
      }

      f4716.reference2LongEntrySet().removeIf(var0x -> {
         if (System.currentTimeMillis() - var0x.getLongValue() > f4722) {
            if (f4715.contains(var0x.getKey())) {
               f4715.remove(var0x.getKey());
               ((BufferAllocator)var0x.getKey()).close();
            }

            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
   }
   public static void m122() {
      f4723[0] = "A&W\u0001y\b]<U]c\u001cM?\u001eȉ";
      f4723[1] = "\f\rO\u0012tK\b\u0010O\u0003iKK\u001f\u0000\u0014nW\u0011\u0010\rIu@\u000f\u001c\u0002\u0013i\f7\u001c\u0007\u0002hG\u000b\u001a\u0004+sQ\u0011";
      f4723[2] = int.class;
      f4724[2] = "java/lang/Integer";
      f4723[3] = "g\u0018\"fU?{\u0002 :O+k\u0001kɎ";
      f4723[4] = "\u0013S\u0001\u00156$\u0018\\\u0010ZW*\u0013W\u0014\u0000";
      f4723[5] = boolean.class;
      f4724[5] = "java/lang/Boolean";
      f4723[6] = "F\u0002\u0002EH?Z\u0018\u0000\u0019R+J\u001bKȟ";
      f4723[7] = "j~E2OuncE#Ru-l\n4Uiwc\u0007iN~io\b3R2Qo\r\"Symi\u000eumsmm&&Q8Fd\u001f5X";
      f4723[8] = "\u0006]SWbg\u0006]D\u000bnh\u001c\u0016D\u0015n}\u001bg\u001eN67";
      f4723[9] = void.class;
      f4724[9] = "java/lang/Void";
      f4723[10] = long.class;
      f4724[10] = "java/lang/Long";
      f4723[11] = "\u001f\u0014\u001b&\u000e\u0001\u0014\u001b\nis\u0014\u0006\u0001\b*";
      f4723[12] = "oN\u0000Fd@qF\u001a\t\u0003A`]\u0017S%G";
      f4723[13] = "`314}jd.1%`j'!~2gv}.so|ac\"|5`-F%u$pwZ\"k";
      f4723[14] = "DeD]iaZm^\u0012!a@gFU(z\u0000T@Y#}MeFY";
      f4723[15] = "<Kf\\\u0006\u00168VfM\u001b\u0016{Y)Z\u001c\n!V$\u0007\u0007\u001d?Z+]\u001bQ\u0007Z.L\u001a\u001a;\\-\u001b$\u0010;X\u0005H\u0018";
      f4723[16] = "!k,%:q%v,4'qfyc# m<vn~;z\"za$'6\u0007}h57l\u0004vq$\u001dl-mc$;j";
      f4723[17] = "MJDbiQDDG+*\\BDS)7Z\u0000VP?p[CV\u0007\u001eaPJ@[\u001f}MZ@D";
      f4723[18] = ":p\bxH:&j\n$R.6iA5V&0l\u001bx[?<,\u000e5Y*&q\u0000$Ia'g\u00012_={K\"?B&;@\u0016\"_\r d\t3H\r k\u00032_=";
      f4723[19] = "?R\f,896A\u001a/U#bN\u0016Fo;fA\u0012%)'kUj";
      f4723[20] = "=cRk$w=;X5\u001fs\u007f\u001f\u0007(cc\u0004n_<~~t \u001f>f\u0012";
      f4723[21] = "HX&\u001e\u0007}Z\u0019*^h~X\u0013%\u001a\u0014PE2%\u0006\u0004zY4(\u001a\u0005~Ohv\u0010T}D\b'\u0004\u0003&#";
      f4723[22] = ">X\\\u0011#\fuJ\u0017\\BԀ\u0004\u000fR\u0002.\u0018c\u000fS\u000e3`";
      f4723[23] = ";\u001edIp,p\f/\u0004\u0011ș\u0001IjZ}8fIkV`@";
      f4723[24] = "/\u001e\u0000\u001c&TrY]$*6tND\u001d1Fu[\\NC\n#_\u0007V3\u000b6GT$";
      f4723[25] = "3Rb\u001b.9n\u0015?#4[=\u000e!^u\"e\u0010>H";
      f4723[26] = "D9}C_[\u001bhoX E\u0014)BSQ*C+hAXI\u00057eU ";
      f4723[27] = "`{JU\u0000\n7sP\u0019n\u0019f}c\u0003\u000f\u0010wlAdQ\u0012hoB\u0002TJy:;";
      f4723[28] = "K\u0001WKD\u001bI\f\u0001Kx\t\u0012\u0019\u0011Ix\\\u0006B\u0000C\u0018\r\u0012\u0015[$";
      f4723[29] = "nH\u0016Lw\u007f3\u000fKtԕ\u001d0B\u0018O)x0\u001a\u0012\u0011";
      f4723[30] = "FN0\u001f\u0018wF\u0016:A#s\u0003\u0012zM_u\u0005\u007fjG\u001by\u0019\u000f}[Hy\u007f";
      f4723[31] = "\u001a>\u000f\u001a{CB \u0010\fEB\u000e%r];S\f!\u0011\u001b'^\u0018YM\u0003&T\n?H[7\u0001sf\u0016\u0004+C\u0015cN\u0015~:";
      f4723[32] = "\u0012\u0005\u0015q\n_Y\u0002\u0012{m\u0019N\u0001Nc\u0000\"Md@!\u0007\u001dQ\u0015Ql\u000e\r#X\u0014q\f\u000fS\u0016Ts\u0014c";
      f4723[33] = "U\b'FbD\bOz~Ț&\u000b\u0002)E<C\u000bZ#\u001b";
      f4723[34] = "\tB&\u007f+G\t\u001a,!\u0010X]\u0016q:}\"\n\r\u007f;hAL\u0011r/\u0010\u001e\r\u001fw(`PM\u001doD";
      f4723[35] = "sCa:S|s\u001bkdhr-\u0014-h\t\u007f1rk\u007f\u0001f2\u0011-c\frJNlm\tu:\u0000,o\u0011\u0019";
      f4723[36] = "Y\u00130TO\u0013YK:\nt\u001d\u0004Oi\u0015tH\u0010\u001ej\b\u0014\u0019\u0004I1o";
      f4723[37] = "\u0019sa\u000bM \u0019+kUv>A0<0O9A.)WO8M3Q";
      f4723[38] = "vzX6:N.dG \u0004MrxB5isx{JK>Ivb](xU{v%t`TqdCq8E$\u001d";
      f4723[39] = "*Oi\rS8*\u0017cSh'~\u001b>H\u0005\u0013r\u0004\"Jhgm\u0017&N\u000b!q\u001a26";
      f4723[40] = "\u0016!n#EX\u0014,8#yDF\"3+\u0015v\u0015fctH!\u0015.o&\u001eAD:8}y";
      f4723[41] = "f_;_Muf\u00071\u0001vy3\u0002\u000b^\by \u0016h\u0018\u0014t4n7Y\u001aq3\u001ey\u0019\u0018i_";
      f4723[42] = "\u0000_aH-#\u0000\u0007k\u0016\u0016/U\u0002\u0018\u0017rF\u0000_aH-#\u0000\u0007k\u0016\u0016z\u0004\u00020\u001ff4D\u0000(s";
      f4723[43] = "-q\u000b\u001b+s$b\u001d\u0018Fotf+\u001c6s\u001d!P\u001d'cmo\u0010\u001f?\u000f";
      f4723[44] = "}S_CaI\"\u0002MX\u001eW-CgYxW\u001eVGCs8\u007f[@Pg^z\u0003Q\u0005\u001e";
      f4723[45] = "\u0006{s\u001ewY^el\bIZ\u0002rc\u0019$F\u0004q4'.F\u0000Qh\u001f3Q4qrcxASpi_3FTz\u000e";
      f4723[46] = "%\"\u000bS\u001bEk.\u0003\u0001&Rhe\u001f\\@EI~\u0000\\cXq{\u0004J&\u0006q|\u000bH@\u0003)m^1";
   }
}
