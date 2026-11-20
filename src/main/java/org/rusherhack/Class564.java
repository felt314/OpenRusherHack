package org.rusherhack;

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
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.util.Identifier;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.module.impl.client.Capes;
public class Class564 {
   public HashMap<PlayerListEntry, SkinTextures> f9102;
   public Timer f9103;
   public HashMap<Integer, Identifier> f9104;
   public HashMap<UUID, Integer> f9105;
   public Capes f9106;
   public static long f9107 = Class066.m4320(-7137746981833069401L, 7689009204592243485L, MethodHandles.lookup().lookupClass()).m4325(219064237079981L);
   public static String[] f9108;
   public static String[] f9109;
   public static Map f9110 = new HashMap(13);
   public static long f9111;
   public static Object[] f9112 = new Object[134];
   public static String[] f9113 = new String[134];

   public static String m17357(String var0) {
      long var1 = f9107 ^ 129946054038830L;
      int var10000 = 2 << 3 ^ 1;
      int var10001 = (2 ^ 5) << 4 ^ 2 ^ 5;
      int var10002 = 1 << 3 ^ 2;
      String var5;
      int var10003 = (var5 = var0).length();
      char[] var10005 = new char[var10003];
      int var7;
      int var12 = var7 = var10003 - 1;
      char[] var3 = var10005;
      int var6 = var10002;
      var10000 = var12;

      for (int var4 = var10000; var10000 >= 0; var10000 = var7) {
         var10001 = var7;
         int var13 = var5.charAt(var7);
         var7--;
         var3[var10001] = (char)(var13 ^ var4);
         if (var7 < 0) {
            break;
         }

         var13 = var7--;
         var3[var13] = (char)(var5.charAt(var13) ^ var6);
      }

      return new String(var3);
   }

   @Subscribe
   public void m17359(Event488 var1) {
      long var2 = f9107 ^ 70083723982947L;
      if (this.f9106.isToggled()) {
         PlayerListEntry var5 = var1.m15186();
         SkinTextures var8 = var1.m15189();
         SkinTextures var7;
         if (this.f9102.containsKey(var5) && (var7 = this.f9102.get(var5)).texture().equals(var8.texture())) {
            var1.m15185(var7);
            return;
         }

         Identifier var10;
         if ((var10 = this.m17361(var5.getProfile().getId())) != null) {
            SkinTextures var9 = new SkinTextures(var8.texture(), var8.textureUrl(), var10, var8.elytraTexture(), var8.model(), var8.secure());
            this.f9102.put(var5, var9);
            var1.m15185(var9);
         }
      }
   }

   public Identifier m17361(UUID var1) {
      long var2 = f9107 ^ 133627960340676L;
      if (!this.f9105.containsKey(var1)) {
         return null;
      } else {
         int var5 = this.f9105.get(var1);
         return this.f9104.get(var5);
      }
   }

   public Class564() {
        super();
      long var1 = f9107 ^ 30146653065025L;

      this.f9105 = new HashMap<>();
      this.f9102 = new HashMap<>();
      this.f9104 = new HashMap<>();
      this.f9103 = new Timer();
      this.f9106 = null;
      Class170.f3362.subscribe(this);
      this.m17365();
   }

   @Subscribe
   public void m14149(Class263 var1) {
      long var2 = f9107 ^ 68918095997595L;
      this.f9106 = Class170.f3364.m7107().m14156(Capes.class);
   }

   @Subscribe
   public void onLoadWorld(EventLoadWorld var1) {
      long var2 = f9107 ^ 94760864407369L;
      if (this.f9106.isToggled() && this.f9103.passed(TimeUnit.MINUTES.toMillis(f9111))) {
         this.m17365();
         this.f9103.reset();
      }
   }

   public void m17365() {
      long var1 = f9107 ^ 112507477344019L;
      Class568.f9131.submit(() -> {});
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

   public static String m153(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21197;
      if (f9109[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f9110.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f9110.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/Ԡ", var10);
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
         byte[] var9 = f9108[var5].getBytes("ISO-8859-1");
         f9109[var5] = m117(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f9109[var5];
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
      return null;
   }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f9113[var4] != null) {
         return var4;
      } else {
         Object var5 = f9112[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 29;
               case 1 -> 1;
               case 2 -> 43;
               case 3 -> 7;
               case 4 -> 13;
               case 5 -> 48;
               case 6 -> 14;
               case 7 -> 63;
               case 8 -> 41;
               case 9 -> 61;
               case 10 -> 60;
               case 11 -> 52;
               case 12 -> 62;
               case 13 -> 37;
               case 14 -> 51;
               case 15 -> 27;
               case 16 -> 25;
               case 17 -> 56;
               case 18 -> 8;
               case 19 -> 45;
               case 20 -> 40;
               case 21 -> 12;
               case 22 -> 23;
               case 23 -> 31;
               case 24 -> 34;
               case 25 -> 50;
               case 26 -> 18;
               case 27 -> 22;
               case 28 -> 6;
               case 29 -> 17;
               case 30 -> 44;
               case 31 -> 32;
               case 32 -> 3;
               case 33 -> 21;
               case 34 -> 36;
               case 35 -> 58;
               case 36 -> 55;
               case 37 -> 0;
               case 38 -> 20;
               case 39 -> 4;
               case 40 -> 9;
               case 41 -> 19;
               case 42 -> 35;
               case 43 -> 39;
               case 44 -> 5;
               case 45 -> 28;
               case 46 -> 49;
               case 47 -> 57;
               case 48 -> 30;
               case 49 -> 33;
               case 50 -> 24;
               case 51 -> 26;
               case 52 -> 46;
               case 53 -> 2;
               case 54 -> 54;
               case 55 -> 38;
               case 56 -> 47;
               case 57 -> 53;
               case 58 -> 15;
               case 59 -> 16;
               case 60 -> 11;
               case 61 -> 10;
               case 62 -> 42;
               default -> 59;
            };
            int[] var7 = new int[6];

            for (int var8 = 0; var8 < 6; var8++) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for (int var14 = 0; var14 < var13.length; var14++) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            f9113[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f9112[0] = "2FC\u0012\u0012n,NY]uo=UT\u0007Si";
      f9112[1] = "'b\bh$6,m\u0019'E8'f\u001d}";
      f9112[2] = "-n&z:\u00151t$& \u0001!woĿ";
      f9112[3] = "WRSRS(KHQ\u000eI<[K\u001a\u001fN/]\u000eX\u0013F:QNSRm2_GQ\u000e";
      f9112[4] = "n\f\u000b&:Mr\u0016\tz Yb\u0015BȎ";
      f9112[5] = int.class;
      f9113[5] = "java/lang/Integer";
      f9112[6] = " w4[\u0013*<m6\u0007\t>,n}Օ";
      f9112[7] = "=l6Qn\u0003#d,\u001e\b\u0017$e\rQ0";
      f9112[8] = "1-0qQ_/%*>2K+";
      f9112[9] = void.class;
      f9113[9] = "java/lang/Void";
      f9112[10] = "=u\u0004\f\u0011O!o\u0006P\u000b[1lMԓ";
      f9112[11] = "s}a(\u0019Emu{gT_w\u007fb;EUwh9\fOUzic&Ec|na TU";
      f9112[12] = "5\u001c\u0004$\u0007+>\u0013\u0015k`)+\u0018\u0015 [";
      f9112[13] = "\u001b\f\u0014}Z\u0015\u0010\u0003\u00052'\r\u0003\u0004\f{";
      f9112[14] = "\u0011H$(\u0002\u000b\u000f@>gy+2m";
      f9112[15] = "r?(y\u0000w}*pH\\v`'";
      f9112[16] = "MY\u000eO\u0005sQC\f\u0013\u001fgA@G\u0002\u0018tG\u0005\u001c\u0015\u001ejQ\u0005:\u0015\u0005oLL<\u0015\u001ejQ";
      f9112[17] = "QJ.ev`ZE?*\fdID/e:`^";
      f9112[18] = "FDqu\u001aKZ^s)\u0000_J]88\u0007LL\u0018z4\u000fY@Xqu!rFQ";
      f9112[19] = "\f\u0002n;LFy\"e4]\t\u0018,n?YSl";
      f9112[20] = "PrTr\u0002\u001a_g\fF~=";
      f9112[21] = "FVn\u0016m\u00193ve\u0019|VNnv\u001eu\u001f&";
      f9112[22] = "trm/\r\u007f\u0001Rf \u001c0`\\m+\u0018j\u0014";
      f9112[23] = "c:s\bO\fh5bG3\u0015g5d\u000b\r\u0005";
      f9112[24] = "mV3\u0007\bBqL1[\u0012VaOzԠ";
      f9112[25] = "41\u001d]\u001cA*9\u0007\u0012~]-$";
      f9112[26] = "J=b:yOV'`fc[F$+wdH@af{fWD!a:nBF*u`bUK<+WdWH.kpNBF*u`bUK";
      f9112[27] = boolean.class;
      f9113[27] = "java/lang/Boolean";
      f9112[28] = "0x2W\\\n,b0\u000bF\u001e<a{\u001aA\r:$0\u000fK\u0011+$\u0010\u000fK\u0011+H \n";
      f9112[29] = "TY\u001e\u000e*{HC\u001cR0oX@W˃";
      f9112[30] = "C`cPf\\]hy\u001f+FGb`C:LGu;w=]\\sp";
      f9112[31] = "ge\u0011%[#ym\u000bj\u0006\"\u007fa\u0006)[\u0005yv\u0002%\u0018";
      f9112[32] = "'\u0015?z=p9\u001d%5`q?\u0011(v=F\"\u0018%~pq\"\u0006";
      f9112[33] = "\u001eC\u000b%v\u001f\u0011VS\f,\u0005\u0004w/\b\u001b\u001e\u001aL\u0018',\u0018\u001bL";
      f9112[34] = "iOF\u0006-2fZ\u001e2Q\u0010";
      f9112[35] = ".,|Y\u0005L!9$myn\u0007\"dVNA0$eV";
      f9112[36] = "B\u0000m*\b\u0012\\\bwee\bD\r~(R\u000eG\u000f";
      f9112[37] = "\"\f0r|W\"\f'.pX8G'0pM?6wm!";
      f9112[38] = "vO(-l\rhG2b1\fnK?!l;sB2)!\fs\\-";
      f9112[39] = "AMw\b3mD\u0002H\u0007mq_\u007fu\u001bxeF";
      f9112[40] = "\u000fU\u0015HJ[\u0013O\u0017\u0014PO\u0003L\\\u0005TG\u0005I\u0006HY^\t\t5\nWL\u0001K\u0001";
      f9112[41] = "w)4J\u0019Rw)#\u0016\u0015]mb#\b\u0015Hj\u0013qTE\n";
      f9112[42] = "fPX| mxXB3mwbR[o|}bE\u0000Iguid@tz";
      f9112[43] = long.class;
      f9113[43] = "java/lang/Long";
      f9112[44] = "ChCOZ\u001a_rA\u0013@\u000eOq\n\u0002G\u001dI4Q\u0015A\u0003_4p\bE\n^";
      f9112[45] = double.class;
      f9113[45] = "java/lang/Double";
      f9112[46] = "/q!,\u001fs3k#p\u0005g#hha\u0001o%m2,\fv)- g\fr5q#,\u0000i$v*gCR/d!n\bg\"o#O\u0002b5o#";
      f9112[47] = "gC\u0010\u0011\u0006}gC\u0007M\nr}\b\u0007S\ngzyU\u000f]$";
      f9112[48] = "\u0014gK*V\u0000\u0014g\\vZ\u000f\u000e,\\hZ\u001a\t]\u000e4\u000fZ";
      f9112[49] = "\u001e\u0012z[\u0011\b\u001e\u0012m\u0007\u001d\u0007\u0004Ym\u0019\u001d\u0012\u0003(<LJQ";
      f9112[50] = "\u001cP:z\u0014\u001c\u001cP-&\u0018\u0013\u0006\u001b-8\u0018\u0006\u0001jvbA@";
      f9112[51] = "\u001fA^j{\u0014\u001fAI6w\u001b\u0005\nI(w\u000e\u0002{\u0012r.HUGF%e\u000e.\u0013\u0013v&";
      f9112[52] = "\u007f\u0018\bev\u0005c\u0002\n9l\u0011s\u0001Aн";
      f9112[53] = "\u00051E\u0003\u0003P\u00051R_\u000f_\u001fzRA\u000fJ\u0018\u000b\u0007\u0019^";
      f9112[54] = "G,x^<\u0006N\"{\u0017\u007f\bQ7}\u001c8\u000b\n\u0004t\u001d49V,s\u0019=\f";
      f9112[55] = char.class;
      f9113[55] = "java/lang/Character";
      f9112[56] = "R\u00146;y N\u000e4gc4^\r\u007fи";
      f9112[57] = "DtP\u0004QZO{AK<ZOfU";
      f9112[58] = "|~e_\u0013k`dg\u0003\t\u007fpg,\u0012\u000elv\"d\u0014\u0000jf~g_(Xvmv\u0004\u0013{";
      f9112[59] = "gi8T9]$/5TSѲXo6I0\u000bf.)E:";
      f9112[60] = "X\u0018ItL\u0004\u0007\u0003\u0010q/XF\rN_HYX\rChNXX`O~SEF\u0001Mr@]>";
      f9112[61] = "S\u0004f\u001e0O\u001aC|\u0018J\u0016\u000f^w\b*rY@u\u0014.J\u000e\u0000jMJ";
      f9112[62] = "3\u000bnSYY{\u000e6Ge\u0002&\r4Y\t0rAd\u0003Ug$\u0010kZ\u0017\u00022O0[eYz\u0016kN\u0007\ts\r9>";
      f9112[63] = "lc_\u0002\u0016#;h\u0013BrsPcQ\u0005\u0011\u007f/wI@\u0016\u001a:u\u0017\\\u0017e.mR[r";
      f9112[64] = "1\u0013kl.2e\u000bdaR\u000f\u001f!\u0002I\u0015\u0019\tv3vc6$\rgnl;";
      f9112[65] = "\u0000pD\u0004\u001c`\f3\u000bCc3jp\u0007\u0006\teW9@\u001c\u000f\u001f[}E\u0012\u0019\"\u0012:_\u0014c";
      f9112[66] = "o \u0005p8\"0<\u0011w\u0004%n2\u0017\f?&b \u001e4hf}yz";
      f9112[67] = "\r\u001ci6\u0007{JHt`\tDҫ$ut\u0007/T\u0015d:\u0002<4";
      f9112[68] = "CIz ]\u0002\u0002Vv*`G\u0001_\u007f\"\u001c<\u0013T%'\u0012Y\u0005\u000b~&`_\u0001P{#\tA\u0005_{C";
      f9112[69] = "u\tCPS+\"\u0002\u000f\u00107ҢI\n\fS\u0007k-\u0004X\u0000\u0006\u00128\\S\u000eQ~3]L\t7";
      f9112[70] = "<)\u001967BsoGnSPe\u007f\u0010,S\u00050uF&1U9n\u0014V";
      f9112[71] = "\u0017/\f*&9^z\t)TcA8/x0\u007fJDJi9bC|\u001d)&;'";
      f9112[72] = "\u0007\u001b#Y+\u001aP\u0010o\u0019OԞ;O`\u0003pSY\u001fi\u0018\"#";
      f9112[73] = ":\u0005]Ux)+KXF\u0018s,\u0012Gi!&qF?Lsr!\u0010\u000fYhj5w";
      f9112[74] = "U\n\u001af\n{\u001cM\u0000`p=\u001cR\u0005ppwXH\u000evM>\u001fR\b\f\u001e\u007f\u0000\u0007\u001fo\u001b!\\[d";
      f9112[75] = "\u0005.\u0002tZ7Jh\\,>!UibdB(Dv\u000b{D78e\u001erB-Qz\u0018m>";
      f9112[76] = "=f\u001cSr35bCY\ng,aAM\n;jeLM7r-\u007fJ7dk&aLQdi=!&\t;mikDY2v;\u001b";
      f9112[77] = "z$wK?6kjrX_ll3mwf62o\u0015\u0011cya,(X.cgV";
      f9112[78] = "\u000f}\u001f\u00007\u0011\u001c5O]\tՕ`1\u0001V5P\u001a<\u0016Qt";
      f9112[79] = "G\u0003\u0003q&-^\u0000\u001djH/X\u0018\u0001b25O\u001fzy42Y\u0011\u0013f2-%LKnw.G\u001cBu%T";
      f9112[80] = "Y[^H\u001c8[_X\u0011,Cdd<pa]%^\u0018\u0013H6\u001b\\\u001c\u0015\u0011";
      f9112[81] = " Nf9u2wE*y\u0011р\u001c\u0019/dqoeVi:)";
      f9112[82] = "\u001bG=\rx\u0003\u0013\u0005p\u0017``ǽ}xF\u007f\u0012B\u001b&\u0011:\u0001F}xA{Y[F \u0017x\u0002H}";
      f9112[83] = "q\u000b\u0000P,~u\r]\u001c@{af\u001dWzs6XUR\"g";
      f9112[84] = "q\u0016q\u0011\u0000W>P/IdE+Km\u0018\u0005H7n|\u0000d^0Km\u0012\rA6T\u0011\u0010\u0016\u001e*Ir\u001cXT3-";
      f9112[85] = "?:.\u001aS\u001a8q0X:\u0004)4.@V6xsv\u0016:\u001b)$+C_\u001a*x<'A\u0013$u'\\FX:7N";
      f9112[86] = "\u0016~DF \u0000Fn\u0013%:\u0007PE\u0017U&nJqJC>\rF?\u0000ZZ";
      f9112[87] = "_h\u007f+G#\u0010.!s#\"\u001f/\u001f;_<\u001e0v$Y#b#c-_9\u000b<e2#*\u001e5c(J5\u0018*\u001f";
      f9112[88] = "\u0005\u001eV!]\u0012U\u000e\u0001BA\u0011H\u001fh2[\u001aD\u0000\u0001-]\u00058";
      f9112[89] = "<c8xl88&b$\u0002#\u0005&lkl(kn#\u007fr";
      f9112[90] = "gzF}28q~WrJod|Nq!x\u0003}\u001ad1c~xX t\u0004sdL`)mlbS\u001c";
      f9112[91] = "$\u001e&\u001c6^ [|@XԴ\u001dXv\u0003(S~P4N2K\u001d";
      f9112[92] = "X!r.ff\u001a%pt[Կc\"4~;;[utab_";
      f9112[93] = "PPlY\u001fb\u0012Tn\u0003\"ȂkS*\tB?S\u0004j\u0016\u001b[";
      f9112[94] = "H\t+TZ\u007f\u001f\u0002g\u0014>ҽt^b\t^\"\r\u0011$W\u0006";
      f9112[95] = "BxBf\u0004hF=\u0018:jΦ{>Wo\tv\u000b:\u00125U";
      f9112[96] = "/T\bv\u0010h`\u0012V.tio\u0013!r\u0010\u0011/\u001d\u0006*Lk\"\n\u0001kt/#\bWf\u0016\u007f*\u0013\u0005\u0016";
      f9112[97] = "BZT53I\u0005\u000eIc=vІb\u0000<=\u0014\u0019_\u0001=o\u0004\u0017b";
      f9112[98] = "qI?\u0005_l2\u000f2\u00055ѼNO1\u0018V:p\u000e.\u0014\\";
      f9112[99] = "\u001ex\u0010or\u007f\u0003*\u00142Mr\u0003\u0004\u0018x1\u000e\u0001p\u0001x*s\u00042E=M";
      f9112[100] = "7X_J6%0^\\MW'']\u000b\tWc{AY\u000553rZ\u000bu";
      f9112[101] = "~]s\u0002\u0015\u0007lZy\u0001*[z`qQE^lP\u0016_X\ngXuS\u0016@~<";
      f9112[102] = "2he)Ya{=`*+\"kyc\u007fj<~\u0003).U0x>`iO6\u00028`\u007fK>:o `\u0012Z";
      f9112[103] = "\u001cQ\u0017}+bS\u0017I%OeH\u000e\np4\u001bYV\t'&e\u0018\u0017\u0006vO";
      f9112[104] = "\u000fo8\u0006d\\\u0001;k\u0007\u001dV\u001c5cmaB\u00074i6,\u0004\u00188|\u000beC\u0002>\u0006_ \u0006V+bQtUWR";
      f9112[105] = "E\u0017^(D\b\u001a\u000bJ/x\u001bH\u000b!o\u0000\u0019E\u0013\u00198@\u0006\u001cwQ(\u001e\bF\u001eN.\u0001t";
      f9112[106] = ".\u001e\u0014)\u0015bgK\u0011*g'w\u0011\u0014\u007f 7\u001eN\u0011\u007f\u0007=&\u0019Q`^Y.\u001e\u0014)\u0015bgK\u0011*g";
      f9112[107] = "+|\u0006}^i)yX%c=9zWx\u000f\u000fh8\u000e cihx]e^ /b[\u001f\u00133?a\b\u007f\u0000=&{7n\\:7`[e]%0\u0006";
      f9112[108] = "eJry\u0010't\u0004wjp}s]hEI(.\u0006\u0010cOtw^|hNkp8";
      f9112[109] = "\u0016&0\u0007\u0019~\u0007h5\u0014y$\u00001*;@q\\lR\r\u000b\u007f\u000101\u0001E5\u0018T";
      f9112[110] = "\u000b5{D\b?BraBriZ`\u007fg\u000e\u0002\u0001qhN\u0016:V1w\u0017r;\u0000mh\u0011LyFfj\u0014r";
      f9112[111] = "~F^c=jj^\u001bdXzyF!m#n}U\t\u0000i)jP\u001e= npVd";
      f9112[112] = ")\\YG2\u0002-\u0019\u0003\u001b\\Ҩ\u0010AB]$\u001ciXAC?";
      f9112[113] = "\u0007\u001a5B}I\u000f\u001ejH\u0005\u000f\u0005\u001di&4L\u0012\ru\u001b}\u000b\b\u000b\u000fHd\u0000\u0016\riHf\u001bVg1\u0017bO\u001c\u0005a\u001ey\u001dl";
      f9112[114] = "=&d;r\u000e6'{<\u0014\u000f5do<ob<e`$w\u000b#c\u007fXu\u0010|\u007fb;y^6f\u0006";
      f9112[115] = "I#=\u007fk~Fuf\u007f\u0001\u007f^so~l\u0014\u0015\"xh{)\\ebn\u0001y\u0019%{hkvO~{\u0002";
      f9112[116] = "T`9}cC\u000f;vq\u000f\u0003_&\u0013lv\u0005_!5Yu\u001fJ73}~x\u0003f7kuEJ!-m\u000fI\u000e$#{2\u0000I>%\u00011IUe9ca@N7I";
      f9112[117] = "T\u001bmztE\u0003\u0010!:\u0010ԎhL$'p\u0018\u0011\u0003by(";
      f9112[118] = "3/\u0011\f\u0010 r0\u001d\u0006-s|>\u001a\u0012Qs\f<\u0010PIli*O\u000bH\u001e2b\u0016P]|bk\r\u0002-";
      f9112[119] = "h\u001f\u001e510j\u001b\u0018l\u0001rs#@5eoof] :gs\u0000\u001a=ks\u0014\u001aPjhir]M;|\u000e";
      f9112[120] = "0H2\u0006\u0006\u0017q\t=Wo\u00124\u000e!U\ni,\u0016 ]\u0017U:\u00121Ro";
      f9112[121] = "SG\u0005nxkB\t\u0000}\u00181EP\u001fR!d\u0018\u0005gt'8AS\u000b\u007f&'F5";
      f9112[122] = "ip\u001aiI\u00126l\u000enu\u000fu}\u001f|\t\ts\u0010XhK\rs~\bx\u001cn";
      f9112[123] = "\\jMB ,\u00071\u0002NLxW,|X4jF\u000bAD!~_PGS r^5FP|e:";
      f9112[124] = "\u0000y\u001c\u0018SY\u0007\u007f\u001f\u001f2Y\u0014|^J^!\u0003c\u001e\u001dBE\u0010v\u001fV2@\u000f7CCQLA}Z'";
      f9112[125] = "J\u001b`UMCB\u0007k\u0004!S+H&EK\u0005\u0016\u0001a_M\u007f\u001aEdQ[BS\u0002~W!";
      f9112[126] = "zF/\u0003y\u0019lB>\f\u0001I\u007f_?\u0003gNb$'\u0000mDf\u00181\u0004|K\u001e";
      f9112[127] = "4L2UI[s\u0018/\u0003Gdǩt.\u0017I\u000fmE?YL\u001c\rJn\u0002\u0014\u0014o\u001ag\u0019Fd";
      f9112[128] = "a\fpuf;6\u0007<5\u0002ƣ]\u001b|q=c%\u001czr:";
      f9112[129] = "K\u0004f(m\u0007J\u000548c:\u0017Pv*hV%\u0007;t1:K\u0004rr7D\u0013\\c&>:";
      f9112[130] = "\u001b=Ghh\u007fCeV<a\u0001MiC\u0011<\u0001K9\u0001`)eEmRaP";
      f9112[131] = "!\u001a`I\u0018yi\u001f8]$\"4\u001c:CH\u0010`]a\u001d$8#Q8\u0019\u0015:&\u000f`$";
      f9112[132] = "7\u0018\"\t\\|$PrTbʋX\u0000+\u0000\u001dy#T3\u000f\u0010\u00055TuL\bo:\u0002.Lb8*\u0007r\t\u00185=\u000031\u0002e'\u0015rM]y3\u0012N";
      f9112[133] = "c5\u000eQ!g4>B\u0011EՓ_<B\u0007|;c`\u001eV(";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f9112[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f9113[var4]);
            f9112[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m124(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m125(Class var0, String var1, Class var2) {
      Field var3 = m124(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m125(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m126(long var0, long var2) {
      int var4 = m121(var0, var2);
      Object var5 = f9112[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f9113[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f9112[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f9112[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new IllegalStateException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = m123(95421041298278L, 0L);
            }
         }
      }
   }

   public static Method m127(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m128(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m127(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m128(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m129(long var0, long var2) {
      int var4 = m121(var0, var2);
      Object var5 = f9112[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f9113[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            var11++;
            var12++;
         } while ((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for (int var16 = 0; var16 < var11; var16++) {
            int var17 = var6.indexOf(8, var12);
            var15 = m123(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m127(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f9112[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(95421041298278L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m128(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f9112[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while (var29 < var13) {
                  var28.append(var14[var29].getName());
                  if (++var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new IllegalStateException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(95421041298278L, 0L);
            }
         }
      }
   }

   public static MethodHandle m130(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 210 && var8 != 195 && var8 != 242 && var8 != 'R') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'x') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'r') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 210) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 195) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 242) {
               var9 = var0.findStaticGetter(var12, var18, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var18, var14);
            }
         }

         return MethodHandles.dropArguments((MethodHandle)var9, var3.parameterCount() - 2, long.class, long.class);
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName())
            .append(" : ")
            .append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null "))
            .append(" : ")
            .append(var15.toString());
         throw new IllegalStateException(var13.toString());
      }
   }

   public static Object m131(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m130(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class564.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var4) {
         throw new IllegalStateException(var4);
      }
   }
}
