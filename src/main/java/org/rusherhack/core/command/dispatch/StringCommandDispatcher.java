package org.rusherhack.core.command.dispatch;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.command.CommandData;
import org.rusherhack.core.command.CommandManager;
import org.rusherhack.core.command.ICommandSource;
import org.rusherhack.core.command.exceptions.CommandException;
import org.rusherhack.core.command.exceptions.DispatchException;
import org.rusherhack.core.command.exceptions.UnknownCommandException;
import org.rusherhack.core.command.exceptions.ValidationException;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.command.processing.CommandProcessingSink$ProcessedCommand;
import org.rusherhack.core.logging.ILogger;
import org.rusherhack.core.setting.Setting;

public class StringCommandDispatcher implements ICommandDispatcher<String> {
   public CommandManager commandManager;
   public static int f1508;
   public static long f1509 = Class066.m4320(-7494739009848009131L, 279249274595859575L, MethodHandles.lookup().lookupClass()).m4325(225566765202797L);
   public static String[] f1510;
   public static String[] f1511;
   public static Object[] f1513 = new Object[89];
   public static String[] f1514 = new String[89];

   public String dispatch(ICommandSource var1, String var2) {
      String var15 = var2;

      try {
         if (var15.isEmpty()) {
            throw new IllegalStateException("Empty command");
         }
      } catch (Exception var14) {
         var14.printStackTrace();
      }

      CommandProcessingSink var6 = this.commandManager.getCommandProcessor().processCommand(this.commandManager, var2);

      try {
         if (!var1.validate(var6.getCommandData())) {
            throw new IllegalStateException("You do not have permission to execute this command");
         }
      } catch (Exception var13) {
         var13.printStackTrace();
      }

      CommandProcessingSink$ProcessedCommand var18;
      CommandProcessingSink$ProcessedCommand var22 = var18 = var6.finish();

      try {
         label68: {
            try {
               if (var22 != null) {
                  break label68;
               }
            } catch (Exception var11) {
               var11.printStackTrace();
            }

            throw new IllegalStateException("Unknown command: " + var15);
         }
      } catch (Exception var12) {
         var12.printStackTrace();
      }

      CommandData var19 = var18.commandData();
      Method var16 = var18.methodData().method();
      LinkedHashMap var21 = var18.parsedArguments();

      try {
         try {
            if (var16.getReturnType().isAssignableFrom(String.class)) {
               return (String)var16.invoke(var19.getCommand(), var21.values().toArray());
            }
         } catch (Exception var9) {
            var9.printStackTrace();
         }

         var16.invoke(var19.getCommand(), var21.values().toArray());
         return null;
      } catch (IllegalAccessException | InvocationTargetException var10) {
         Throwable var17;
         Throwable var24 = var17 = var10.getCause();

         try {
            try {
               if (!(var24 instanceof CommandException)) {
                  throw new IllegalStateException("Failed to dispatch command", var10);
               }
            } catch (Exception var7) {
               var7.printStackTrace();
            }

            throw new IllegalStateException(var17);
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }
      return null;
   }

   public StringCommandDispatcher(CommandManager var1) {
    }

   public String execute(ICommandSource var1, String var2) {
        return null;
    }

   public static void m3645(int var0) {
      f1508 = var0;
   }

   public static int m3630() {
      return f1508;
   }

   public static int m3647() {
      int var0 = m3630();

      try {
         return var0 == 0 ? 70 : 0;
      } catch (IndexOutOfBoundsException var1) {
         var1.printStackTrace();
      }
      return 0;
   }

   static {
    }

   public static Exception m672(Exception var0) {
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
   public static void m122() {
      f1513[0] = "G\u0004JcTR[\u001eH?NFK\u001d\u0003.IUMXN\"KJI\u0018IcBN[\u0006L9EO\u0006%Y?OIO5B KFF\u0012i$UWI\u0002N%CU";
      f1513[1] = "\u0013-SSS\u0005\u000f7Q\u000fI\u0011\u001f4\u001a\u001eN\u0002\u0019qW\u0012L\u001d\u001d1PSh3\u00132Y\u001cO\u0014/0A\u000fB\u0015";
      f1513[2] = "'\u0018WSYC,\u0017F\u001c$[?\u0010OU";
      f1513[3] = "`l\u001a)M9|v\u0018uW-luSdP>j0\u001ehR!np\u0019)O>`}\u0018tL%aySDP!b\u007f\u0013co>`}\u0018tL%ay.nQ'+S\u0018sW#kN\u000fh\\)|m\u0012u";
      f1513[4] = "Yd0E\u0000dGl*\nbx]n#@fp@m\u000bE^";
      f1513[5] = "M\u0019\b\"%yQ\u0003\n~?mA\u0000Ao8~GE\fc:aC\u0005\u000b\"\u0014cO\u0006\u000eb3AC\u0005\u000ek2~";
      f1513[6] = int.class;
      f1514[6] = "java/lang/Integer";
      f1513[7] = "uY{(\ftiCyt\u0016`y@2e\u0011s\u007f\u0005\u007fi\u0013l{Ex(=nwF}h\u001aTnBpu";
      f1513[8] = boolean.class;
      f1514[8] = "java/lang/Boolean";
      f1513[9] = "t#pW|Uj+j\u0018\u001eIm6";
      f1513[10] = "\u0012\u000b,!J.\u000e\u0011.}P:\u001e\u0012elW)\u0018W(`U6\u001c\u0017/!]#\u001e\u001c;{Q4\u0013\neZV0\u0013\u0016<a{4\u0010\u0014*a\\\u001e\u0005\u001a.\u007fL2\u0012\u0017";
      f1513[11] = "4i1k\u001b\\?f $fD,a)mwE7d#oG";
      f1513[12] = "5#_BMA@\u0003TM\\\u000e!\r_FXTU";
      f1513[13] = "\u0016\u0001\u0000?o9\n\u001b\u0002cu-\u001a\u0018Irr>\u001c]\u000b~z+\u0010\u001d\u0000?T\u0000\u0016\u0014\u0000to";
      f1513[14] = "\u0014uQuw5\boS)m!\u0018l\u00188j2\u001e)U4h-\u001aiRu`8\u0018bF/l/\u0015t\u0018\u0018j-\u0016fX?@8\u0018bF/l/\u0015";
      f1513[15] = "\u001a;ls\u0015J\u00114}<tD\u001a?yf";
      f1513[16] = "\u0017av\u0013\u0015i\u000b{tO\u000f}\u001bx?^\bn\u001d=dI\u000ep\u000b=BI\u0015u\u0016tDI\u000ep\u000b";
      f1513[17] = "\u000ekJ2Kg\u0012qHnQs\u0002r\u0003\u007fV`\u00047NsT\u007f\u0000wI2\\j\u0002|]hP}\u000fj\u0003JX~\b}LhP}\u000f\\U\u007f\\b\u0015pBr";
      f1513[18] = "=!quJ\u00026.`:0\u0006%/pu\u0006\u00022";
      f1513[19] = "!xQFe\u000b=bS\u001a\u007f\u001f-a\u0018\u000bx\f+$U\u0007z\u0013/dRFg\f!iS\u001bd\u0017 m\u0018+x\u0013#kX\fG\f!iS\u001bd\u0017 me\u0001y\u0015";
      f1513[20] = "=oL+:O!uNw [1v\u0005f'H73Gj/];sL+\u0001v=z";
      f1513[21] = "R\u0001.\u0013}2'!%\u001cl}F/.\u0017h'2";
      f1513[22] = void.class;
      f1514[22] = "java/lang/Void";
      f1513[23] = "gQ_>'|{K]b=hkH\u0016s:{m\r[\u007f8diM\\>\u0016feNY~1MiWY";
      f1513[24] = "\u0013%:Q?o\u0018*+\u001eT{\u001a!<Dxl\u0017";
      f1513[25] = "\u001b\u0007\"\u001e&`\u0007\u001d B<t\u0017\u001ekS;g\u0011[&_9x\u0015\u001b!\u001e1m\u0017\u00105D=z\u001a\u0006kt=f\u0004\u00141S<P\f\u0016 @ |\u001b\u001b";
      f1513[26] = "r<7'm/n&5{w;~%~jp(x`#lk.t 7'L?i:9gx";
      f1513[27] = "\b\u001b7\u000f\"\u000f};<\u00003@\u0000#/\u0007:\th";
      f1513[28] = "WGmj(4\\H|%t=[J~hrvpCoci<";
      f1513[29] = "H\u0017}\u0018]]=7v\u0017L\u0012\\9}\u001cHH(";
      f1513[30] = "IL]`i\fWDG/\u0004\u0016OANb3\u0010LC";
      f1513[31] = "\u0006RvH?bsr}G.-\u0012|vL*wf";
      f1513[32] = "#([\u001d5(('JRX((:^";
      f1513[33] = "\u001ce\u001c@0m\u0017j\r\u000fLd\u0010h\u000fBjh\u0000a%Q{s\u0017p\u0003NpD\u000eg\u000fQjh\u0019j";
      f1513[34] = "(,8\u0016EI46:J_]$5q[XN\"p<WZQ&0;\u0016GN(=:KDU)9q{XQ*?1\\gN(=:KDS5";
      f1513[35] = "`\u0010j'<B|\nh{&Vl\t#j!EjLnf#Zn\fi'>E`\u0001hz=^a\u0005#J!Zb\u0003cm\u001eE`\u0001hz=^a\u0005^` \\+2\u007ff-R|\u0011hm\rXb\u000flg*";
      f1513[36] = "&b+\u0018\u0016M:x)D\fY*{bU\u000bJ,>/Y\tU(~(\u0018'W$}-X\u0000|(d-\u0012)]=x#R Y=q";
      f1513[37] = "\u001asF35ooSM<$ \u0012K^;-iz";
      f1513[38] = ">_F|hU\"ED rA2F\u000f1uR4\u0003B=wM0CE|[B\"YS3yT\u0012BL?{N5";
      f1513[39] = "mZ-nq?sR7!\u0012+w";
      f1513[40] = "rK7m[\u0015k\u001fi\f9x,Y7=\u0006\u0017l\u001b8|c\u0016!D90\u0000\u0000tIh\f";
      f1513[41] = "\u001fZG~B2\u0001]\u001bc0#\u0010YypL1\u0007C\u007flH!}@^x\t!LU\u001c!^L";
      f1513[42] = "\bK\n\u001a\b\u0001\u001d\tSMeQ\u0016\u007f\u0014X\u0004_\u000b_\u0005G\b~\u0017Q\n#\u0000M\b\u000f\u0002\u0012\u0015\u000fQXo\u001e\u0001P\t]\u000fC\u0003[\u001f6";
      f1513[43] = "UEy\r~u\u0017\u0013v\u001a\u0013h\u0002'u\u000err\n|0\u0005*l\u001b\rb\u0012t%e";
      f1513[44] = ",O\u0016\u0013J\u0010n\u0019\u0019\u0004'\u0018d\u000e\u000b\fKq%\u0007_\u0012Y\u0000w\u0010\u0001['A%\u0006\u001f\u0007F\u0003s\t\bj";
      f1513[45] = "v&ux\u000e\u001e,.tbe\u0013 9P|\u0000\u0019$#wC\u001f\u001b&(``\u0002\u0006M\"+a\u000e\u0015q4u%\u0003|";
      f1513[46] = "5g\u0015\u000eLS2k\u001eQ4F q\u0018VX#/r\u001cRF]1u@O4";
      f1513[47] = "\u000e\u0012x\u0010[iT\u001ay\n0dX\rR\u0014_dX\u000b\u0016BW1UKk\u0016\\e\u0004q";
      f1513[48] = "Q@&\u0012,VD\u0010<]\u001d\u0017;B5YeEJ\u0010\"\u0007,;\u0002\n}\u0018cJP\u001d#Q\u001d";
      f1513[49] = "\u000220\u0007@ZXg/\u0019/\u0011]/;~\u0013\u0017\rl3\u0011SU\u0002-V";
      f1513[50] = "\u000e\u0018Y64$\u0018\tQe\u000ez\t\u001b}8un\r\bUU7d]\u001fF$es\u0003V8";
      f1513[51] = "F\u0003\ny|\u0018IFCj\u001e\u001dG@yvd\bGZNFx\u000ePM21dN[PBko\u001cA<";
      f1513[52] = "Vm2_#\u000eH||_R՞7~|ViV\u0006w\u007fGk?";
      f1513[53] = "4\u0013/!=\b*\u0014s<O\u00170\u0012,!\"v?\u00120x1\u0010)\u0007!\"O\u0012'\n*'1\b0\b.B&\b-V5.0\u001d<\fK";
      f1513[54] = "M\"\u000b=tVP6I{NII\u0019I8'D.4B$/PP.U&+5";
      f1513[55] = "\u0001A:w\u0000R\u0007C%5k@\u0016V =k\u0014\u001d\u0015?9\u001aF\nKvG\u000f\\\nM\"9\u0015K\bIG)ZMS\u0010$?\u000f@\u0002,";
      f1513[56] = "-iW\b\u001b\u0007\u007f~\tAe\u0017oU\u000b\b\u0019\u0007\u0014%\n\u0010\u0001\u001dtx\b\u001b\u0017v";
      f1513[57] = "bA)ayf{\u0015w\u0000ȧ\u000b<S)1$d|\u0011&pA";
      f1513[58] = "F\u0001:u(2C\u0005~rQ:BGFv*.FTn\u001bh$\u0016C}j:3H\n\u0003";
      f1513[59] = "$-VIY\u0011!>\n\u0002#\u0011*:\u0015\u0014O 9/\u0013\u001cN\u000f?;nB\u0019\u0005! \u0000\u0017[\u0000(@";
      f1513[60] = "!U\fei]8\u0001R\u0004=Q8BTx:PC\u0003\f~*O|\u0002E\u007f 0zK\u0004|/A(\\Z5Q\t2\u0003Ez [%]\f\u0004";
      f1513[61] = ":zm19-?i1zC00k5f/\u00194k<\u0001;?0(-q<3;wU";
      f1513[62] = "8\u000b+|#h!_u\u001dr\u0005:\\|fp;\"\u001e\"z\u001beb\u0002av%} \\}\u001d";
      f1513[63] = "%<7#\u0013P;-y#b̞D/y*Y\bu&z;[a*g%d^\u0002<2(5b";
      f1513[64] = "\u001b0TjYT\u000f0\tda\u0012\bm\u0010h\u001al\u0002{Uz[\u000f\u001fo\u0017<a";
      f1513[65] = "\u0015\u0006\u001a\"l\u000b\u001bE\u0017?\u001d\u0017uM\u0001keE\u0004\u001f\u00165,;L\u0005I*cJ\u001e\u0012\u0017c\u001d";
      f1513[66] = "`\fE^}_aEDT\u0002\u001e0Y^Ik\u001c4=PKg\u00055E\u0003\u001d;\u001bY\u0000[Ef\u000b9]YNp`";
      f1513[67] = "@P_p\f|\u001a[\rj`c\u0017V;h\u001aw\u0017F*{\u000fq\u001fG\u0005}\u001b\fA\u0010\u000fc\u0000b\u0014R\nj`";
      f1513[68] = "\u0007l7({8\u001e8iI(2\u0000fo//\u0010\feo&./e8e' >\u0007bm&:";
      f1513[69] = "l\u007f\u0018x_.6tJb31;yn`H3\u001ah\\uS^jx\u00158V1*:\u001ay3";
      f1513[70] = "Fh~QB^E=u\u0006|_\u0001do\u0004\u0007\\2yk\u0014\u0019J\u001d\u007f\u007fiEVB{z\u0018\u0017A\u001c2\u0004T\u0018G\u001fhd\t\u001aL\t\u0003:\u0006\u001a^\u00143`S\u0005@{";
      f1513[71] = "81y}\u000bwb9xg`zn.Od\r{b\"\u0017'\u0011,{,fu\u0006r2R";
      f1513[72] = "W2!\tue\u001b89\u0018Ih\u0004>\u001c\n2|\u0000-4gpvP:'\u0016\"a\u000esY";
      f1513[73] = "m\u0018\u001ffZ tLA\u0007ƒM3\n\u001f6\u0007\"sH\u0010wb";
      f1513[74] = "\u001fkuvG\"M|+?9=A`)gES\u001fkuvG\"M|+?97W|-kG-@~)\u000e\u0000\"\u001fb2\u007fR5A+L";
      f1513[75] = "o4Xh\"=v`\u0006\tw `0\u0014uwP4j\u0013reo5#\u0012x\u001ai|b\u0011wk;k<X\t#!4#\u0017xq6jji";
      f1513[76] = "Y\u007f\b\u007fxoV:Al\u001akT&Qvz\u0005R-\b=`}W>Tv\u001a";
      f1513[77] = "\u0002s\u0016-;4\u0007wR*B(\u000b.R'.\u000b\u0011(I?\u0019\"\r5F3Bn\u000f)K(\"3\r\"]C";
      f1513[78] = "T\u0005;\u001e\u0003!\u000eP$\u0000l~\u0007\u0016][\u0011 [\u000f2\u001bS/\u001aj4\u0019\u0017+\u0014\f\"\f\u0006qj";
      f1513[79] = "\u001dyu?\u000e0\u0014x`ri<\u001c8No\u0012(\u0018+f\u0002P\"H<us\u00025\u0016u\u000b";
      f1513[80] = "`C\u001c\u001f0Ao\u0006U\fRDa\u0000o\n7Ne\u001aH6.Qm\u001aKmkZ5\u0004Z\u001c9MkM$";
      f1513[81] = "P\bA\u0007fIS\u0014O\u0010_\u001d[\u0014g\u0017\"\t[h@C!OQ\u000bIB4\u00026";
      f1513[82] = "\u0000~&,\"C\u0016 b!K\u0007\u001d)7*0\u0004,)9\"\"\u0019\u000bNg$%\u001c\f,=,$\u0006gw-~3\u0001\u0016%: z\u007f\u000bqd5)\u0015\u00044-&K";
      f1513[83] = "bI)o;\u0013gZu$A\u0000bAt6'\u0007IMm6A\u0004kAt39W=\u001dj_";
      f1513[84] = "9|&ZQ3:)-\ro%iq1\u0018\u00066iL-\u0004\u0013#tS=\u0019\u0013Jky9\u0007\u000328/e\u0019ow`w8\t\u000f*b|.bR.ds7\u0002\u000f,oe\\\\\u0000,}xl\u0006U3c\u0017";
      f1513[85] = "f[B[!kc_\u0006\\Xcb\u001d0R>pb\u0011\u00075437\u0013\u0019_;v~\u0000{";
      f1513[86] = "D)\u001f\u0000;\u000eKlV\u0013Y\u000bEjl\u0015<\u0001ApK>0\u0018A\u0016H\u001c<\u0001Dn\u001bJ`\u001f(";
      f1513[87] = "\u0001x#P\u000fST:&YoF[0\"2S@\u000bs*]\u0013\u0002\u00042O";
      f1513[88] = "\u0003G3\f{BP\u0011o\u0012\u0017U\u0001U\u001d\u000er_\u0005O:in@\u000eK;\u0016|F\fXV";
   }

   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }
}
