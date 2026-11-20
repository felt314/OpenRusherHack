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
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.argument.StringCapture;
import org.rusherhack.core.command.exceptions.ValidationException;

public class send extends Command {
   public static long f5575 = Class066.m4320(1641001735385172480L, -4390146654796357615L, MethodHandles.lookup().lookupClass()).m4325(249542663983741L);
   public static String[] f5576;
   public static String[] f5577;
   public static Object[] f5579 = new Object[31];
   public static String[] f5580 = new String[31];

   public send() {
      super("send", "Send a chat message to the server");
      this.addAliases("chat");
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
//    @CommandExecutor
//    @CommandExecutor$Argument({"string"})
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
      f5579[0] = "q\u0010TKUrm\nV\u0017Of}\t\u001dԀ";
      f5579[1] = "q3!n\u00153z<0!h+i;9h";
      f5579[2] = boolean.class;
      f5580[2] = "java/lang/Boolean";
      f5579[3] = "!3-6\u0012R=)/j\bF-*dȞ";
      f5579[4] = int.class;
      f5580[4] = "java/lang/Integer";
      f5579[5] = "p\r]\u000f'kl\u0017_S=\u007f|\u0014\u0014B:lzQYN8s~\u0011^\u000f4lx\nWD;j1,NS<px<[Q!km\u001a";
      f5579[6] = "\u001apq\u0006\nu\u001apfZ\u0006z\u0000;fD\u0006o\u0007J3\u001bS";
      f5579[7] = void.class;
      f5580[7] = "java/lang/Void";
      f5579[8] = "v#\u0000\u0012hnj9\u0002Nrzz:Iʙ";
      f5579[9] = "\u0000zqR\b)\u001c`s\u000e\u0012=\fc8Ȉ";
      f5579[10] = "\"\u0010D\u0011\"d>\nFM8p.\t\r\\<x(\fW\u00111a$LdS?s,\u000eP";
      f5579[11] = "\u001b\u001cBS\u0002\u0011\u001b\u001cU\u000f\u000e\u001e\u0001WU\u0011\u000e\u000b\u0006&\u0005L_";
      f5579[12] = "h&\u0011<\u0014Th&\u0006`\u0018[rm\u0006~\u0018Nu\u001cS!A";
      f5579[13] = "@a\u001b5yh@a\fiugZ*\fwur][X/\"";
      f5579[14] = "1\u0003\u0003H\u0002%-\u0019\u0001\u0014\u00181=\u001aJ\u0005\u001f\";_\u0007\t\u001d=?\u001f\u0000H12-\u0005\u0016\u0007\u0013$\u001d\u001e\t\u000b\u0011>:";
      f5579[15] = "1\u000feX\u0018~D/nW\t197}P\u0000xQ";
      f5579[16] = "\t\u0014&X\u0015\u0004\u0002\u001b7\u0017t\n\t\u00103M";
      f5579[17] = "\u001aW~?\u00196KK$BȤI\u0007Lz#](\tX(B\u00173OWx#\u0019'\u001d6";
      f5579[18] = "B`LUT4Lt\u001e4\u0015)[`\bO14NztD\u0014mS \u0015J\u0000?2#\u0006VShMf\u0014_\u000eU";
      f5579[19] = "RxlK\fLU}$D3Ȭh) \u0017W\u0019\u0006-a\u0010\u000eu";
      f5579[20] = "\u0003'\u001eK\\\u0012]=M[2QD!\u001cS]*H!ET\bKF5\u00175";
      f5579[21] = "h#~3xef7,R9yr\":(#bwY|//`t7xn(9\u0018)<j#>y'(8B";
      f5579[22] = "Vx>WF\u0000\u0003ra\u0017,\u0014\u0007jg\f@&V+8Q\u001dq\u001al?\n\u0016\u0010\u0014xmk\u0011\u0013\u0003yk\u0014Q\u000bP.\u0007";
      f5579[23] = "W7\u0017[\u000e<Yf\u0014O>1i7\u0011KX8\u0013y\tKPXWc\u001bM^\"\u0019{\u001bE>";
      f5579[24] = "D'\u0013^iRG'DOQH\u0010\u001c\u0017R`P\u001a M\u001f5K";
      f5579[25] = "\"?N]{F|%\u001dM\u0015R\u00193W\u001btDx=CI\u0015\u000ec{L\u0019t\u0000w)-";
      f5579[26] = "e(\u007f=uU2;z)\f[8;I m[/:{DeRif?(6Rk*\u0000yn[;;\u007f9v\blW";
      f5579[27] = "TG#\u001fe?\u000e\nv\u0004\u0004m\nWv\u000eS:U\n-b4f\u000f\u0001q\be9\u0005\\";
      f5579[28] = "oq\u00160tx:{Ip\u001el>cOkr^o\"\u00107&\t#e\u0017m$h-qE\f#k:pCscsi'/";
      f5579[29] = "!\u0013\u000fT}V{^ZO\u001c\u0004\u007f\u0003ZEKS!T\u0002)-[tP\u0004\u0010dQu\u0016";
      f5579[30] = "\u0014\u00062\u0012|l]\f3TF;DZ<@\u0011n\u0014\u000bd,z;\u001c\u000b2]/1CK";
   }
}
