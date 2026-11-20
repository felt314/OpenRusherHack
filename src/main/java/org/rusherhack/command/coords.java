package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.exceptions.ValidationException;

import org.rusherhack.client.api.feature.hud.impl.Position;
public class coords extends Command {
   public static long f9638 = Class066.m4320(2088539937895002894L, 4287549438164612186L, MethodHandles.lookup().lookupClass()).m4325(156102761952079L);
   public static String[] f9639;
   public static String[] f9640;
   public static Object[] f9642 = new Object[29];
   public static String[] f9643 = new String[29];

   public coords() {
      super(
         "coords",
         "Oc|u,ucy~,oy~~i6\u0004t coords to your clipboard"
      );
      String[] var10001 = new String[]{"pos", null, null};
      boolean var10005 = true;
      var10001[1] = "position";
      var10001[2] = "coordinates";
      this.addAliases(var10001);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   public String m18480() {
      label21: {
         if (Globals.mc.world != null) {
            MinecraftClient var10000 = Globals.mc;

            try {
               if (var10000.player != null) {
                  break label21;
               }
            } catch (Class316 var4) {
               throw m116(var4);
            }
         }

         try {
            throw new IllegalStateException("You must be in-game to use this command.");
         } catch (Class316 var3) {
            throw m116(var3);
         }
      }

      Globals.mc.keyboard.setClipboard(Position.f8397.m16088());
      return "Copied coords to clipboard";
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
   public static void m157() {
      f9642[0] = ">z\u0014D\u0003\\\"`\u0016\u0018\u0019H2c]Ƞ";
      f9642[1] = "\u0014_m4oO\u001fP|{\u0012W\fWu2";
      f9642[2] = "9guH\u0007@%}w\u0014\u001dT5~<\u0005\u001aG3;q\t\u0018X7{vH4W%a`\u0007\u0016A\u0015z\u007f\u000b\u0014[2";
      f9642[3] = "\u001b!\rPBhn\u0001\u0006_S'\u0013\u0019\u0015XZn{";
      f9642[4] = void.class;
      f9643[4] = "java/lang/Void";
      f9642[5] = "\u007f2Rc3\u000bc(P?)\u001fs+\u001b.-\u0017u.Ac \u000eynS( \ne2Pc\"\u0011}-T#%Pq2Rc\u0012\u001bd4\\#&(q,@(";
      f9642[6] = "RAq>o\u001eN[sbu\n^X8֓";
      f9642[7] = ";n\u0012QC\"'t\u0010\rY67w[ȋ";
      f9642[8] = "\u0017$9UP\u001d\u000b>;\tJ\t\u001b=pӅ";
      f9642[9] = "[Pr\u000e\u000b]GJpR\u0011IWI;Ȧ";
      f9642[10] = int.class;
      f9643[10] = "java/lang/Integer";
      f9642[11] = "\u0007'A[?\u007f\u0007'V\u00073p\u001dlV\u00193e\u001a\u001d\u0006Db";
      f9642[12] = "\u007f\u0012\u000fp}\u0007\u007f\u0012\u0018,q\beY\u00182q\u001db(Hn)";
      f9642[13] = "A\u0013;F\u007fE]\t9\u001aeQM\nr\u000baYK\u000f(Fl@GO\u001b\u0004bRO\r/";
      f9642[14] = "\u00074\u0010Bc)\u00074\u0007\u001eo&\u001d\u007f\u0007\u0000o3\u001a\u000eR_6";
      f9642[15] = "\u001f4MX^P\u001f4Z\u0004R_\u0005\u007fZ\u001aRJ\u0002\u000e\u000eB\u0005";
      f9642[16] = ",KD$\u007f\u001a'DUk\u001e\u0014,OQ1";
      f9642[17] = ".f\u0010#\u001djnu\u000b=f2\u0012'^tZ\"/&\b#\u0006[/*^x\u001ff.|\t$f";
      f9642[18] = "CA\u0001|,\u007f\u0002\u0019[<@Ȗ~\u001eTa2jNBXz.\u0010";
      f9642[19] = "F/\u001dVY'\\6\u001f?ς\u001b\u001c-\u0018M\u0013+@!\u0003Qi\"N$\bEY~B?\u0014?";
      f9642[20] = "zJ\u0002f+)7NY<\u001b& !\b=g2vHAx};";
      f9642[21] = "2/\u000b3pM|v[7\u001dȬ\fsF+l\u0010v$P=mu";
      f9642[22] = "\"\u0003\u000bmY)g\u0001\u000b|40w\b?rU0`\t\r\u0016\u000e0zU\u0014\u007fIbd\nv,Fcx\\\u000f&H:ud";
      f9642[23] = "){uH\thh#/\beş\u0014 -\t\u001ak{auSZ";
      f9642[24] = "%HRak\u001el\rHhV\u0019t\u001eJ|\u0001N+C\u0011\u0010?\u001d*\u000e\\`?\u0013iJ";
      f9642[25] = "Wl.^\u00193\u001e)4W$4\u0006:6CscXmn/M$\u0000&8\u001e\u001c'\u0018g";
      f9642[26] = "\u007f%^:BJ6`D3\u007fM.sF'(\u001ap!\u001eKOS5rX$\u0019Y3t";
      f9642[27] = "\u0001h(NYJXo?\r`\u0019:(3\u001d\u0012O\nt?\u0006\u000e5\u0003z:\r\u001a\u0005_v!\u0011`";
      f9642[28] = "i\u0007P.n6?\rV(\u0014<4\u000bJ%x\u000e`K\u0017\u007f\u0014`2\u0015X8$<>\u000eDB.+c\u0014\u0012;$%:\u0019*";
   }
}
