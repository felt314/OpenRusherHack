package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EyeOfEnderEntity;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.world.EventEntity$Add;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.client.api.feature.command.arg.SettingValue;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.exceptions.ValidationException;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.utils.MathUtils;

public class findstronghold extends Command {
   public Vec3d f9430;
   public Vec3d f9431;
   public Vec3d f9432;
   public Vec3d f9433;
   public static long f9434 = Class066.m4320(-1109697446390521915L, -974994898516387881L, MethodHandles.lookup().lookupClass()).m4325(228296054013835L);
   public static String[] f9435;
   public static String[] f9436;
   public static Map f9437 = new HashMap(13);
   public static Object[] f9438 = new Object[59];
   public static String[] f9439 = new String[59];

   @Subscribe
   public void onRemove(EventEntity$Remove var1) {
        
    }

   public findstronghold() {
      super(
         "findstronghold",
         "X~em6\u0004gulate where the coords to a stro:\bkdc`h,omb,:\be"
      );
      String[] var10001 = new String[]{"triangulate", null, null};
      boolean var10005 = true;
      var10001[1] = "stronghold";
      var10001[2] = "endportal";
      this.addAliases(var10001);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   @Subscribe
   public void onAdd(EventEntity$Add var1) {
        
    }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   public String m18100() {
        return null;
    }

   static {
    }

   public static Class316 m116(Class316 var0) {
      return var0;
   }

   public static String m117(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   public static String m153(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13089;
      if (f9436[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f9437.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f9437.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/է", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         try {
DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f9435[var5].getBytes("ISO-8859-1");
         f9436[var5] = m117(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f9436[var5];
   }

   public static Object m154(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = m153(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(findstronghold.class, "m154", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/է" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m157() {
      f9438[0] = "\tx~C3{\u0015b|\u001f)o\u0005a7Ԋ";
      f9438[1] = "\u00017\u001d\u0012pz\u00017\nN|u\u001b|\nP|`\u001c\r[\b.";
      f9438[2] = "BjN?^\u0012^pLcD\u0006Ns\u0007ɥ";
      f9438[3] = "bl}\"a\n~v\u007f~{\u001enu4Ȋ";
      f9438[4] = int.class;
      f9439[4] = "java/lang/Integer";
      f9438[5] = "7U\u001dUY\u001c7U\n\tU\u0013-\u001e\n\u0017U\u0006*oXM\u0003G";
      f9438[6] = double.class;
      f9439[6] = "java/lang/Double";
      f9438[7] = "\u0013BX\u0006L\u007f\u000fXZZVk\u001f[\u0011KRc\u0019^K\u0006_z\u0015\u001eZ^[d\bC\u0011_Qx\u0010T\u0011mHo\u0012DzFJc\bI";
      f9438[8] = "Bi\u0004DA#Bi\u0013\u0018M,X\"\u0013\u0006M9_SAX\u0015}";
      f9438[9] = "\u0006\u0014\u001ax%K\u001a\u000e\u0018$?_\n\rS5;W\f\b\tx6N\u0000H\b\">R\u001aH>>6J<\u0012\u0014:$";
      f9438[10] = "[T&~l0P[71\u0011(C\\>x";
      f9438[11] = void.class;
      f9439[11] = "java/lang/Void";
      f9438[12] = "\u0018\tv_*c\u0004\u0013t\u00030w\u0014\u0010?\u00124\u007f\u0012\u0015e_9f\u001eUw\u00149b\u0002\tt_;y\u001a\u0016p\u001f<8\u0016\tv_\u000bs\u0003\u000fx\u001f?@\u0016\u0017d\u0014";
      f9438[13] = "\u000e+UoC\u0012\u00121W3Y\u0006\u00022\u001c\"^\u0015\u0004wW7T\t\u0015ww7T\t\u0015\u001bG2";
      f9438[14] = "O~P\nM\u000bDqAE,\u0005OzE\u001f";
      f9438[15] = "KW\u00010\u000bTWM\u0003l\u0011@GNH}\u0015HAK\u00120\u0018QM\u000b\u0014{\u0017EAWHL\u001cO@@\u0014]\u0016OP@\u001ej";
      f9438[16] = "m2\u0007z\u0018\u0003q(\u0005&\u0002\u0017a+N7\u0006\u001fg.\u0014z\u000b\u0006kn'8\u0005\u0014c,\u0013";
      f9438[17] = "COk/cCCO|soLY\u0004|moY^u,0>";
      f9438[18] = "9NPt!b9NG(-m#\u0005G6-x$t\u0012it";
      f9438[19] = "M+NnJUM+Y2FZW`Y,FOP\u0011\rt\u0011";
      f9438[20] = "`qb,\u0015\u000f|k`p\u000f\u001blh+ũ";
      f9438[21] = "Zp=P\u000b\u0006/P6_\u001aIN^=T\u001e\u0013:";
      f9438[22] = "\u0004-O+#n\u00187Mw9z\b4\u0006f>i\u000eq]q8w\u0018qed%s>+Ai\"";
      f9438[23] = "\u0014d";
      f9438[24] = "q\u000e";
      f9438[25] = "X:";
      f9438[26] = "*yU\u001e^\u001b!vDQ4\u00185zO\u001a";
      f9438[27] = boolean.class;
      f9439[27] = "java/lang/Boolean";
      f9438[28] = "FR?\u000e\u001f6M].Ax4XV.\nC";
      f9438[29] = "[\"q$yKG8sxc_W;8idLQ~uefSU>r$J\\G.dkhJw?{gjPP";
      f9438[30] = "2B*\u0019e\u0011Gb!\u0016t^:z2\u0011}\u0017R";
      f9438[31] = "T\u0006\u0019\u0002~f\u0014V\u001fV\u0001զnS\u0012U8?\u0007\fAV|\u0006";
      f9438[32] = "1Fq_;\u0007q\u0016w\u000bDȾ\u000b\u0013z\b}^bL)\u000b9g";
      f9438[33] = "v{)f\u0000(-c& m;'x\u000e}\u001156uC&\u001f(u?,f\u000222\u0004";
      f9438[34] = "$@}*\f\u001e'\u001e6r=\t|_\"|Ag$@}*\f\u001e'\u001e6r=\n}C8n\u0003\u0004+\u001d7\u0015\u0002\u0002!\u001avl\u0001\\jBG";
      f9438[35] = "\u001d>\u001b4t9\u00141\b?\f+\u001a8\u0000&h)\u000f1*=p-\t'\u00060p!\u0014:k;uxI6\u000e)5pO\\\u000b\"4z\u00199\u0019b<|s<\u0012c6*\u0016.Rk0@";
      f9438[36] = "U[\u001d<Eu\tGE$+l\u0002@\u00016Pz\u001eZ\u00161+ \u001eTDeY(YE\u0010\\\u0014o\u0014\u0005A>\u0011x\u0007Y|";
      f9438[37] = "\u0001u[5\u000beH+Y0mfWj\u0001)\u0001T\u0000-ZtT\u0003\u0006l\u0006?\u00018\u0003'\u0000)m";
      f9438[38] = "X?*\u0014'V\u000e`wS\u001dC\u0000ov\u0003J\u0014Z?*o!W\u0006s~T$\u001c\u0000e";
      f9438[39] = "J\u0010\u0018\u0005eW\u0003N\u001a\u0000\u0003T\u001c\u000fB\u0019ofKH\u0019G<1M\tE\u000fo\nHBC\u0019\u0003";
      f9438[40] = "\u001c~rU2)@twB\u0002g\u0016 `HEw\u007f\u007fw\u001d; \u0016 $\u001e\u007f\u0019\u001c~rU2)@twB\u0002";
      f9438[41] = "\u0019>\u001e/}p\u00042F;\u0007(\u0003\u001e\u0013\u0006\u0007u\u0002?\u000b,<pI9\u001d@f6\u0005%\u0006)u*\u001d9z";
      f9438[42] = "\u0004;Z?]\t^~R>6Z\u000f)Pba\rPt\u000b\u000e]N\u001e~WlH\r_4";
      f9438[43] = ")\u007fy\n\u0003S?,n\u00049ӪD w\u000fY^ |kWA";
      f9438[44] = "P\u001a\u001b\u0007Qk\u0010\u0003T>ǷPWE\u0013E\n+\u0001\u001aN\u0002";
      f9438[45] = "J.gXB]\n7(aľfMqo\u001a\u0019\u001d\u001b.2]";
      f9438[46] = "\\)qV-\\\u001c0>o%g[5%\u001d0\tY 0\u001fL^\u001c/3\u0013\"\\\t:1o";
      f9438[47] = "G%a}Yg\u000e{cx?d\u0011:;aSVF}`?\u000f\u0001@<<wS:Ew:a?";
      f9438[48] = "<Y#N@\u007f`E{V.`pS9ETzgTB\u001fTt5\u00000\u0017\u0013ea9}P^%0[xGMy\r";
      f9438[49] = "T~RLf\nIr\nX\u001cRNYPM}UTd[# IRiZ\u0018%\u0002T\u007f6BcNHd_Q\u007fVT\u0018";
      f9438[50] = ";;|Q~k{\"3hӹP<dt\u0013%+j;)T";
      f9438[51] = "r6!=\"T2/n\u0004˻oui)\u007fy\u0014#6t8";
      f9438[52] = "\u0012H*/-0A\u0015,9]r{\u0013/ibo\u0002\u0010q\":^DIpll'G\u0017;4]";
      f9438[53] = "\n8\u0013oVS\u001c{\u0018?)\n\u000b\t\u000b/G^\u000b4QjO_";
      f9438[54] = "3\u00029!\u001eW`R?{l[<\u0000\u0017|\r[+\u0001%\u0018\u000f@hW8bQ@i\u000b^'\u0012BnQ<\"\u0005Q2l";
      f9438[55] = "-+\"?*\u0007u>#8I\u0005i5z}IBvn#00A(%{\u0001v\u0003cj!cs\u0014p6\u001c";
      f9438[56] = "*\"2\u000b\u001bL|}oL!Yrrn\u001cv\u000e(\"0p\u001dMtnfK\u0018\u0006rx";
      f9438[57] = "+\u0018*\u0019^Qq]\"\u00185\u0002 \n DbU~]x(Y\u0016(\u0005xWO\f}\u0005";
      f9438[58] = "I=Y%G\nG`\u001c$5Lyc\u0006.\nQ\u0000`XeR`F9Y+\u0004\u0019Eg\u0012s5";
   }
   public static Field m159(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m160(Class var0, String var1, Class var2) {
      Field var3 = m159(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m160(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }
   public static Method m162(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label33:
      for (Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for (int var10 = 0; var10 < var3; var10++) {
                  if (var9[var10] != var4[var10]) {
                     continue label33;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

   public static Method m163(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m162(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m163(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }
}
