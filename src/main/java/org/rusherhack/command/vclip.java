package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.ClientPlayerEntity;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.exceptions.ValidationException;

public class vclip extends Command {
   public static long f155 = Class066.m4320(-4099845514019854578L, -7040199468818212568L, MethodHandles.lookup().lookupClass()).m4325(83477564349073L);
   public static String[] f156;
   public static String[] f157;
   public static Object[] f159 = new Object[32];
   public static String[] f160 = new String[32];

   public vclip() {
      super("vclip", "Teleport vertically");
      String[] var10001 = new String[]{"verticaltp", null, null};
      boolean var10005 = true;
      var10001[1] = "verticalclip";
      var10001[2] = "vertical";
      this.addAliases(var10001);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   @CommandExecutor$Argument({"distance"})
   public String m322(double var1) {
      label22: {
         if (Globals.mc.world != null) {
            ClientPlayerEntity var10000 = Globals.mc.player;

            try {
               if (var10000 != null) {
                  break label22;
               }
            } catch (Class316 var6) {
               throw m116(var6);
            }
         }

         try {
            throw new IllegalStateException("You must be in-game to use this command.");
         } catch (Class316 var5) {
            throw m116(var5);
         }
      }

      Globals.mc.player.setPosition(Globals.mc.player.getX(), Globals.mc.player.getY() + var1, Globals.mc.player.getZ());
      boolean var10003 = true;
      return String.format("Teleported you %s blocks", var1);
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
      f159[0] = "*AN\u001e-w*AYB!x0\nY\\!m7{\r\u0004v";
      f159[1] = double.class;
      f160[1] = "java/lang/Double";
      f159[2] = "^\u0007<\\d\bB\u001d>\u0000~\u001cR\u001eu<";
      f159[3] = "k?\u001ejwrw%\u001c6mfg&WȰ";
      f159[4] = void.class;
      f160[4] = "java/lang/Void";
      f159[5] = ":TSw}n&NQ+gz6M\u001aɟ";
      f159[6] = int.class;
      f160[6] = "java/lang/Integer";
      f159[7] = "\u0001g>f\u001b\\\u001d}<:\u0001H\r~w+\u0005@\u000b{-f\bY\u0007;,!G^\u0007{='\u001e\u00079|7,\u0006^-z7<\fG\u001a]8&\rE\u000bg\u001b)\u001aL";
      f159[8] = "[#\u000704\u0014P,\u0016\u007fI\fC+\u001f6";
      f159[9] = "t\u0010a*8.\u00010j%)a`>a.-;\u0014";
      f159[10] = "\t2bRd!\u0015(`\u000e~5\u0005++\u001fz=\u0003.qRw$\u000fnc\u0019w \u00132`Ru;\u000b-d\u0012rz\u00072bRT8\t#n.s2\u00032`\u0012u1";
      f159[11] = "4\u0005y1dO(\u001f{m~[8\u001c0|zS>\u0019j1wJ2YYsyX:\u001bm";
      f159[12] = "\u007fMag V\u007fMv;,Ye\u0006v%,Lbw&x}";
      f159[13] = "\u001eT\u000b\u001ag(\u0015[\u001aU\r+\u0001W\u0011\u001e";
      f159[14] = ")8Drc6)8S.o93sS0o,4\u0002\u0006o6";
      f159[15] = "\"zYhK\u0002>`[4Q\u0016.c\u0010%V\u0005(&])T\u001a,fZhx\u0015>|L'Z\u0003\u000egS+X\u0019)";
      f159[16] = "b~%SQR\u0017^.\\@\u001djF=[IT\u0002";
      f159[17] = "vYADRi}VP\u000b3gv]TQ";
      f159[18] = "\u0012Q\u0014J\u0007LL\u0002\f{\u0002D\u000f_\u0015\u00170\u0013H\u0004KKg\u0010LUJ\u000b\u000b\u0014\u0011GM{";
      f159[19] = "J;\u000bv\t;\u000b/Vzx2so]p\b%\u001d+P`\u0004[I;Iz\u00065\r6Yvx";
      f159[20] = "$u\u0005/*Dz&\u001d\u001e/L9{\u0004r\u001d\u001cu\"_\u001es\u001e/#\u0013rwC=$c'uK}k\u000f#(Yz\u001bZ! \u00195w^|2\u001eE Yf5\u0010>t\u0002s5!";
      f159[21] = "\u00061J\u0018)zP~\\A\u0017շ:0\u001e\u0011pz^}MFp\u0017";
      f159[22] = "Kv k\u001el\u0019zfklxv%zz\u0007>\u0004(\"|\u000eTK{px\u0006&F#vql";
      f159[23] = "/I\u00071P7\"\u0011\u00018:+uP\u000b3FE/I\u00071P7\"\u0011\u00018:{j\u0014\u0001:\u0000'iJ\u000bZ\u0007&{A\u0004(\n~}Hn";
      f159[24] = "PJ\u001e)\u0004\u001d\u0013\u0017\u0004%vUoG\u0019q\u001d\u0013\u001dJAw\u0014yR\u0019\u0013s\u001c\u000b_A\u0015zv";
      f159[25] = "m/G\u001f9\u0015=0F\u0015\\O9W\u0015\f!K19A\u0015.C";
      f159[26] = "P\u001d\u0017 \u0014QZF\u0011+}I\b\u0013\u0001\":YaNC%EG\rJ\u001e7B7P\u001d\u0017 \u0014QZF\u0011+}";
      f159[27] = "5\u001a\u0019W\u0000L.M\u0019\u0000p\\0\u00116\u000e\u0011\\'\u0010\u0004j\u001aV`\u0003\u0000\u0017\u001dDa\u0006\u007fQJM#L\u0004\u0005\u0011X#}";
      f159[28] = "\u007f\u0006H8[}+\u001fG08}.\u0013Q5o*qN\nYQ#0\u000eJ3@\u007f)\u0002";
      f159[29] = ";4h&vwegp\u0017s\u007f&:i{A(aa4.\u0016+e06gz/8\"1\u0017";
      f159[30] = "Si?\\FT\u0007p0T%T\u0002|&Qr\u0003\\+~=DT\u0005 \"X\u001a\u0007\u001d";
      f159[31] = "5&A\t@bkuY8Ej((@Tw=os\u001e\u0007 >k\"\u001fHL:60\u00188";
   }
}
