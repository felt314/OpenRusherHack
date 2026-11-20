package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.Class039;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;

public class clear extends Command {
   public static long f1946 = Class066.m4320(8472308197563063818L, -5439567486814424366L, MethodHandles.lookup().lookupClass()).m4325(140791896821234L);
   public static String[] f1947;
   public static String[] f1948;
   public static Object[] f1950 = new Object[32];
   public static String[] f1951 = new String[32];

   @CommandExecutor
   public String m4556() {
      if (Globals.mc.currentScreen instanceof Class039) {
         Console.f8537.m16406().clear();
         return "Cleared console";
      } else {
         Globals.mc.inGameHud.getChatHud().clear(false);
         return "Cleared chat";
      }
   }

   public clear() {
      super("clear", "Clear chat and console output");
      String[] var10001 = new String[]{"clr", null, null};
      boolean var10005 = true;
      var10001[1] = "cl";
      var10001[2] = "clean";
      this.addAliases(var10001);
   }

   static {
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
      f1950[0] = "uVBp[\u0017iL@,A\u0003yO\u000b=E\u000b\u007fJQpH\u0012s\nP7\u0007'vAH;G\u0016XEV;";
      f1950[1] = "3\u000b8\u0003\u001a08\u0004)Lg(+\u0003 \u0005";
      f1950[2] = "\u0002i\u0007g*1\u001es\u0005;0%\u000epN*4-\bu\u0014g94\u00045\u0012,6 \biN\u001b=*\t~\u0012\n7*\u0019~\u0018=";
      f1950[3] = ",(d\u0004[\u001f02fXA\u000b 1-IF\u0018&t`ED\u0007\"4g\u0004h\b0.qKJ\u001e\u00005nGH\u0004'";
      f1950[4] = "%\u0006\u0004p\tbP&\u000f\u007f\u0018-->\u001cx\u0011dE";
      f1950[5] = void.class;
      f1951[5] = "java/lang/Void";
      f1950[6] = "BbDMJG^xF\u0011PSN{\rɥ";
      f1950[7] = int.class;
      f1951[7] = "java/lang/Integer";
      f1950[8] = "i\"V3\u001d\ti\"Ao\u0011\u0006siAq\u0011\u0013t\u0018\u0011,@";
      f1950[9] = ";U\u001a&\u00193;U\rz\u0015<!\u001e\rd\u0015)&o]:M";
      f1950[10] = "bS\u0016f8\f~I\u0014:\"\u0018nJ_Ҝ";
      f1950[11] = "\u0012J4p\\T\u000eP6,F@\u001eS}=BH\u0018V'pOQ\u0014\u0016&7\u0000V\u0014V71Y\u000f\u000bQ6)\u0000s\u0014[;\nKY\tn:;Y";
      f1950[12] = "<N ~\u0010` T\"\"\nt0Wi3\u000e|6R3~\u0003e:\u0012\u0000<\rw2P4";
      f1950[13] = "\u0000\u0010\n\u0010YW\u0000\u0010\u001dLUX\u001a[\u001dRUM\u001d*J\r\u0003";
      f1950[14] = "\u0014N\u0007F<\u0007\bT\u0005\u001a&\u0013\u0018WN\u001a";
      f1950[15] = "9?=\u0010\u000b\u001c%%?L\u0011\b5&tɊ";
      f1950[16] = "\t<({t8\t<?'x7\u0013w?9x\"\u0014\u0006of!";
      f1950[17] = boolean.class;
      f1951[17] = "java/lang/Boolean";
      f1950[18] = "ksdsxu`|u<\u0019{kwqf";
      f1950[19] = "w\u0014/!4\u0018%Vxr\nȾKT~~g\u0018p\u0011?83g";
      f1950[20] = "[!T%;E\u001eg\\y@L\u0004sQ-\u0017\u001bZ&\bA~MTe\ny:_\tp";
      f1950[21] = "g\u001cY'rI{W3m\u0000^g\u0014O%|H\u007f\n3;{V`\u0002O-cH\u001c";
      f1950[22] = "@8\u0007zb\u0001\u001c}\fo\u0004҆\u007f2Qz4\u0002Ee\u0011peo";
      f1950[23] = "IFb\u001543\u0015\u0003i\u0000R\u0014vC7\u000b#;\u0018\u001fr\u00006";
      f1950[24] = "\u0000id_\r\u001b\u0002/=MuH9j\"N\t\u0000E|:Pu\u001eBb%X\t\bZ|Y";
      f1950[25] = "j|TtY\u001dkd\u001b66D1\u0002W3WE!e\u0012u_\u0019";
      f1950[26] = "f\u00076\u0018\u0005w#A>D~~9U3\u0010))g\u0005j|O}#V4CBy)W";
      f1950[27] = "hh\\Dhv0)\u001c\u001f\u0006.\u0001>L_a~<.@\u001c<Gh6SF?zx:\u0010\u001b\u0006";
      f1950[28] = "\u00040 38+Es&c\u0003\u007fRa\u0016nb\u007fE`$\n9iPh$c:rL2_69w\u000e=<l<oC\r";
      f1950[29] = "vQP4Ud\u007f\u0000L..`q\u0011W3BR%]\u000fd.o`WW6Qiq\u0016\u000bT\u0012?}]\u00077H:e\u00107";
      f1950[30] = "x\u001aMMz8<\b\u0010XEe+\t\u001cQ)W\u007fJ@\rEjz\u0012\u001cM$c+\u000e\u00066";
      f1950[31] = "\u0012\u0019fL1yEYl\u001d\\(FM~\u0006\\\u007f\u0018A'L?%\u001dYj|";
   }
}
