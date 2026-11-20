package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.config.Configuration;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.serialize.ISerializable;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.config;
import org.rusherhack.command.reset;
public class Class221 {
   public HashMap<ISerializable<?>, Configuration> f4112;
   public AtomicBoolean f4113;
   public Timer f4114;
   public boolean f4115;
   public static String[] f4116;
   public static long f4117 = Class066.m4320(5157968984219370270L, 3579209164109266840L, MethodHandles.lookup().lookupClass()).m4325(118304560279811L);
   public static String[] f4118;
   public static String[] f4119;
   public static long f4121;
   public static Object[] f4122 = new Object[53];
   public static String[] f4123 = new String[53];

   public boolean m8466(ISerializable<?> var1) {
      Configuration var5;
      if ((var5 = this.f4112.get(var1)) == null) {
         return false;
      } else {
         if (var1.shouldSerialize(false)) {
            var5.read(var1);
         }

         boolean var10002 = true;
         return true;
      }
   }

   public Class221() {
      super();
      this.f4112 = new HashMap<>();
      this.f4114 = new Timer();
      this.f4113 = new AtomicBoolean(false);
      this.f4115 = false;
      Class170.f3362.subscribe(this);
   }

   public void m8467() {
      Class170.f3346.info("Loading configs...");
      this.f4112.forEach((var0, var1x) -> {
         var1x.read((ISerializable<?>)var0);
      });
      this.f4115 = true;
   }

   @Subscribe(
      priority = 1
   )
   public void m8468(Class263 var1) {
      this.m8467();
   }

   public boolean m8469(ISerializable<?> var1) {
        return false;
    }

   public void m8471(boolean var1) {
        
    }

   @Subscribe
   public void m8472(Class432 var1) {
   }

   public void m8473(ISerializable<?> var1, Configuration var2) {
      this.f4112.put(var1, var2);
   }

   @Subscribe(
      stage = Stage.PRE
   )
   public void onUpdate(EventUpdate var1) {
      if (this.f4114.passed(TimeUnit.MINUTES.toMillis(f4121)) && !this.f4113.get()) {
         boolean var10007 = true;
         this.f4113.set(true);
         this.m8471(true);
         this.f4114.reset();
         this.f4113.set(false);
      }
   }

   public void m8475() {
      this.m8471(false);
   }

   public static void m8477(String[] var0) {
      f4116 = var0;
   }

   public static String[] m8478() {
      return f4116;
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
   public static void m122() {
      f4122[0] = "\u0017Y4ZdV\u000bC6\u0006~B\u001b@}ƹ";
      f4122[1] = void.class;
      f4123[1] = "java/lang/Void";
      f4122[2] = "\u0019<#\u0011@S\u0005&!MZG\u0015%j\\]T\u0013`(PUA\u001f #\u0011~I\u0011)!M";
      f4122[3] = ")@|ry6\"Om=\u0004.1Hdt";
      f4122[4] = "\u00076nQ\u0002l\u001b,l\r\u0018x\u000b/'Ĕ";
      f4122[5] = "|[/tgf`A-(}rpBfɜ";
      f4122[6] = int.class;
      f4123[6] = "java/lang/Integer";
      f4122[7] = "`Sm+\u0013c|Iow\twlJ$ɱ";
      f4122[8] = "\u001c#\u000e\u0018\u00073\u0002+\u0014Wa'\u0005*5\u0018Y";
      f4122[9] = "G\u00126$\u007f\u0016[\b4xe\u0002K\u000b\u007fib\u0011MN2e`\u000eI\u000e5$l\u0011O\u0015<oc\u0017\u00063%xd\rO#0zy\u0016Z\u0005";
      f4122[10] = "V\u0015a\u0015x{H\u001d{Z0{R\u0017c\u001d9`\u00126~79`O\u0001z\u0011$";
      f4122[11] = boolean.class;
      f4123[11] = "java/lang/Boolean";
      f4122[12] = "\b1r\u0012fK\u0014+pN|_\u0004(;_xW\u0002-a\u0012uN\u000emvSzX\u000e$;\u007f{P\u0001*rIf_\u0013*zR";
      f4122[13] = "\u000e\u00180d\u0010a\u0012\u000228\nu\u0002\u0001y)\rf\u0004D$/\u0010}\u0000\u0006>0\u0007:(928\u000bu\r\u0003-+\u0000x\u0004";
      f4122[14] = "t>XtT/\u0001\u001eS{E`|\u0006@|L)\u0014";
      f4122[15] = "<\u001e=ks|7\u0011,$\u0012r<\u001a(~";
      f4122[16] = "p*.QG\tn\"4\u001e\n\u0013t(-B\u001b\u0019t?vQ\u001d\u0013w\";\u001e(\bu&1S+\u0013u'=Q\u0007";
      f4122[17] = "(\u0005\f\u0016f\u00144\u001f\u000eJ|\u0000$\u001cE[{\u0013\"Y\u000eNq\u000f3Y.Nq\u000f35\u001eK";
      f4122[18] = "|jR4. `pPh44ps\u001by3'v6@n59`6as10a";
      f4122[19] = "o\u0007x\u0000-wq\u000fbO`mk\u0005{\u0013qgk\u0012 5jo`3`\bw";
      f4122[20] = long.class;
      f4123[20] = "java/lang/Long";
      f4122[21] = double.class;
      f4123[21] = "java/lang/Double";
      f4122[22] = char.class;
      f4123[22] = "java/lang/Character";
      f4122[23] = "\u00141X~\u001d5]'H(,2K1FE\u0016*\u0012`\u0011{QoK'!|G(M$[;U1F_";
      f4122[24] = "\u0019\n\\\\\\s@U\u0004\u0000g#\"\fQD\\yDEGT\n";
      f4122[25] = "\ni\u000e\u0006c:\u000bzWzҺ\u0001[k\r\u001f<0\u001a WC^8\u000f`\f\u0001$\u007f\u001dy\u0007z";
      f4122[26] = "#t\u0011)v}\"gHUϹF'c\u001f4&#/|Cm";
      f4122[27] = "j\u0006A\u0019Hw.\u000eAW5ճQYE\n\tp/\u001e\u0004\u0000K\u0013";
      f4122[28] = "\r3'y\u0011jI;'7lɗ6l#jPmH+b`\u0012\u000e";
      f4122[29] = "^\u0018~SX\u001d_\u000b'/ɵ&[\u0011|\u0013\u0001DQRn\u0012";
      f4122[30] = "99BgGq8*\u001b\u001b\u0013Jk9RuB$jwF'zv%9N#\u0014wk-\u001c\u001b";
      f4122[31] = "\u0013ze\u00100\u0015T?<W\u0000ODe5S`+\u0015\u007f;\u0013cUR>1Q\u0000";
      f4122[32] = "rR7\u001ab\u0011zMkC\u000f\u001buK[D\u007f\u0015}Uj\u00054O!7";
      f4122[33] = "~}\u0004\u0004`\f\u007fn]xՙ7)d\u001d\u0018&Mnv\u0004\u0013]";
      f4122[34] = ":.AE\u0002z0mSDfb<.L\u0005f!:.A\u0002\u001cf(7Jy";
      f4122[35] = "w(vGr=.w)\u001d\t`I#7A6|wdr\u0018qLs`qA9r4%(\u0006\t";
      f4122[36] = "d\u0015[H?ke\u0006\u00024ňP5\u0017XQ`at\\\u0002\r";
      f4122[37] = "?l\u001fT2\u0018x)F\u0013\u0002Me|Z\"~&9iAWaX~(K\u0015\u0002Hi(D\rrZ|rPk";
      f4122[38] = "n\u0012t\u0018)\t7M,D\u0012ӨUF*\u0018}_.DiB}";
      f4122[39] = ":D`\u0019\u0005L;W9eǍwnO=Z\bI)\nd\u001d8M-\t=U\u0006\nhPze";
      f4122[40] = "\u0006JS@B\u001a\u000eU\u000f\u0019/\u0004\u0001S?\u001e_\u001e\tM\u000e_\u0014DU/\u0006JT\u001f\u0017UAXM\u0014l";
      f4122[41] = "S\u0011</i|\u0000J!{\u0005a\u0002M'.iA\u000fP;#a{\u0010GZuu{\u0007Hk4>![*e:d\u007f\u0000\u001b$q>#b";
      f4122[42] = "dv#\bIZ6y5\r8W4zL\u0019H\u0003ewt\u0019GE:\u0006%\u0000\u0003\u0004(>%\u000fE[Y";
      f4122[43] = "\u0013*\u0006\n\u0003X\u000evD[oM\u0018^\u001fV\u000bP\u0004\u001b\u0013^\u0004@\u0011dCB\u0012P\u007fv\u0012Y\u001e_\u0000&\u000eO\u000e1";
      f4122[44] = "}Q~eE\u001a|B'\u0019ɳ!z\u0019|\"\u0015Et\u001cg!x\u0018xX|b\u0002_jAw\u0019";
      f4122[45] = "5WPan\r;OX%T\u001c\u007fJVuTR>MOt2\u0001eP\u001b\u0018m\b~KQb*\u001ag@*";
      f4122[46] = "7\u0000j\f W5C0\fMW!Wp\b7M6P\u000b\n=\u0017`L3\n2Q?=2\b6L'Gu\u001a/G\\";
      f4122[47] = "(,Mo\u001f^&4E+%Ju9[\u0016\u0014\u000b~5[pGPca7/NKx+Mh\\RsP";
      f4122[48] = "fj\u000b\u001d[Hl)\u0019\u001c?Rdj\u0010LS*``PX\u0002Kgm\u0019\u0010?\u0015}p\u000eC\u000eT6*R!";
      f4122[49] = "M\u001cHf\u0006%P@\n7j\t`km\u0002'\u0017!A\u0001&R H\\]d\u0003";
      f4122[50] = "\u0016vW(#}\u0017e\u000eTӗFEtZ,o$\u0017{L)";
      f4122[51] = "2r,/\u0019d`}:*hhhx\u000e>\u0003f\u000f=r9W`sy}5\u0015\u00066i87\u0013|q{!<h";
      f4122[52] = "gC\bV\u001ey5L\u001eSoc'OgG\u001f fB_G\u0010f93\u000e^T'+\u000b\u000eQ\u0012xZZ\u0017\u0015SjbZ\u0018S\f\u001b";
   }
}
