package org.rusherhack.client;
import org.rusherhack.*;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.Class551;
import org.rusherhack.core.logging.Logger;
import org.rusherhack.core.setting.Setting;

public class Class058 {
   public GameProfile selectedProfile;
   public String username;
   public String password;
   public static String MS_AUTH_CODE_ENDPOINT;
   public static URI MS_DEVICE_CODE_TOKEN_ENDPOINT;
   public static URI MC_PROFILE_ENDPOINT;
   public static String CLIENT_ID;
   public static URI MC_LOGIN_ENDPOINT;
   public static URI MS_TOKEN_ENDPOINT;
   public static URI XSTS_AUTH_ENDPOINT;
   public static URI MS_DEVICE_CODE_REQUEST_ENDPOINT;
   public String accessToken;
   public static URI XBL_AUTH_ENDPOINT;
   public Class031 alt;
   public static long f1365 = Class066.m4320(-8279459053463382016L, 8904813173185605946L, MethodHandles.lookup().lookupClass()).m4325(233829726108113L);
   public static String[] f1366;
   public static String[] f1367;
   public static Object[] f1369 = new Object[88];
   public static String[] f1370 = new String[88];

   public void m3264() {
      long var1 = f1365 ^ 32153629211275L;
      HashMap var4;
      (var4 = new HashMap()).put("Authorization", "Bearer " + ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), this,  8685280164685754867L,  var1))));
      Class032 var5;
      Class032 var10001 = var5 = Class551.m17079(Proxy.NO_PROXY, ((java.net.URI)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "º", java.lang.invoke.MethodType.methodType(java.net.URI.class, long.class, long.class)), 8686149639227895203L,  var1))), null, Class032.class, var4);
      this.selectedProfile = new GameProfile(var5.f1257, var5.name);
      this.m3270(var10001.name);
   }

   public void m3265(Class031 var1) {
      long var2 = f1365 ^ 64647031840684L;
      Setting[] var4 = Class019.m2750();
      Class058 var7 = this;
      Class031 var10001 = var1;
      if (var4 == null) {
         this.alt = var1;
         this.m3270(((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var1,  -7083774618421440417L,  var2))));
         this.m3273(((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var1,  -7081976515974750077L,  var2))));
         if (!var1.m2970()) {
            return;
         }

         var7 = this;
         var10001 = var1;
      }

      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), var7,  var10001.m2972(),  -7084312028349934380L,  var2);
   }

   public void m3266(Class035 var1) {
      long var2 = f1365 ^ 76696297474771L;
      Setting[] var4 = Class019.m2750();
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), this,  ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var1,  -3974822870958661336L,  var2))),  -3976668900021272149L,  var2);
      this.m3264();
      Class031 var7 = this.alt;
      if (var4 == null) {
         if (this.alt == null) {
            return;
         }

         var7 = this.alt;
         Class031 var10001 = this.alt;
         String var10003 = this.m3278();
         org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), var10001,  var10003,  -3976785227349948455L,  var2);
         org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), var7,  var10003,  -3977206722270821088L,  var2);
         var7 = this.alt;
      }

      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), var7,  "refresh_token:" + ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var1,  -3978696255371509175L,  var2))),  -3978722551107553796L,  var2);
   }

   public Class035 m3267(String var1, String var2) {
      long var3 = f1365 ^ 80816584703268L;
      Class036 var6 = new Class036(var1);
      Class028 var7 = Class551.m17069(Proxy.NO_PROXY, ((java.net.URI)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "º", java.lang.invoke.MethodType.methodType(java.net.URI.class, long.class, long.class)), 9162437826748217677L,  var3))), var6, Class028.class);
      Class029 var5 = new Class029(((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var7,  9162535885865526734L,  var3))));
      Class028 var9 = Class551.m17069(Proxy.NO_PROXY, ((java.net.URI)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "º", java.lang.invoke.MethodType.methodType(java.net.URI.class, long.class, long.class)), 9161985506217619953L,  var3))), var5, Class028.class);
      Class045 var8 = new Class045(var7.DisplayClaims.xui[0].uhs, ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var9,  9162535885865526734L,  var3))));
      Class035 var10000 = Class551.m17069(Proxy.NO_PROXY, ((java.net.URI)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "º", java.lang.invoke.MethodType.methodType(java.net.URI.class, long.class, long.class)), 9169084310170122035L,  var3))), var8, Class035.class);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), var10000,  var2,  9169285498011923902L,  var3);
      return var10000;
   }

   public Class051 m3268() {
      long var1 = f1365 ^ 14434296357651L;
      boolean var10005 = true;
      Class050 var4 = new Class050("29868cb5-1806-403e-b176-d3dcd76f3abb", true);
      return Class551.m17065(Proxy.NO_PROXY, ((java.net.URI)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "º", java.lang.invoke.MethodType.methodType(java.net.URI.class, long.class, long.class)), -6840091415951324564L,  var1))), var4.m3146(), Class051.class);
   }

   public void m3269() {
        
    }

   static {
    }

   public void m3270(String var1) {
      long var2 = f1365 ^ 96802993421479L;
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), this,  var1,  -90719776845293116L,  var2);
   }

   public GameProfile m3272() {
      return this.selectedProfile;
   }

   public void m3273(String var1) {
      long var2 = f1365 ^ 91582649448790L;
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), this,  var1,  8885690440960584178L,  var2);
   }

   public Class035 m3274(String var1) {
      long var2 = f1365 ^ 35572485283116L;
      Setting[] var9 = Class019.m2750();
      Class030 var6 = new Class030("29868cb5-1806-403e-b176-d3dcd76f3abb", var1);
      Setting[] var4 = var9;
      Class042 var7;
      Class042 var10 = var7 = Class551.m17065(Proxy.NO_PROXY, ((java.net.URI)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "º", java.lang.invoke.MethodType.methodType(java.net.URI.class, long.class, long.class)), -6978198099135090993L,  var2))), var6.m2952(), Class042.class);
      if (var4 == null) {
         if (var10 == null) {
            return null;
         }

         var10 = var7;
      }

      String var11 = ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var10,  -6975988260025948641L,  var2)));
      if (var4 == null) {
         if (var11 == null) {
            return null;
         }

         var11 = ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var7,  -6978281022911779691L,  var2)));
      }

      return var11 != null ? this.m3267("d=" + ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var7,  -6975988260025948641L,  var2))), ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var7,  -6978281022911779691L,  var2)))) : null;
   }

   public String m3275() {
      long var1 = f1365 ^ 131308525541182L;
      return ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), this,  -7694272114185549926L,  var1)));
   }

   public Class035 m3276(String var1) {
      long var2 = f1365 ^ 88367185438369L;
      Class058 var8 = this;
      HashMap var4;
      (var4 = new HashMap()).put("client_id", "29868cb5-1806-403e-b176-d3dcd76f3abb");
      var4.put("refresh_token", var1);
      var4.put("grant_type", "refresh_token");

      try {
         Class042 var7 = Class551.m17065(Proxy.NO_PROXY, ((java.net.URI)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "º", java.lang.invoke.MethodType.methodType(java.net.URI.class, long.class, long.class)), 7259496077431560873L,  var2))), var4, Class042.class);
         return var8.m3267("d=" + ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var7,  7259028163033849234L,  var2))), ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), var7,  7252302165284591384L,  var2))));
      } catch (Throwable var5) {
         Logger var9 = Class170.f3346;
         Object[] var10002 = new Object[]{var5.getMessage(), null};
         boolean var10006 = true;
         var10002[1] = var5;
         var9.error("Failed to log in with token: {0}", var10002);
         throw new IllegalStateException("Failed to log in with token.");
      }
   }

   public String m3278() {
      long var1 = f1365 ^ 74387072827116L;
      return ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), this,  -218801186872190065L,  var1)));
   }

   public Class058() {
        super();
      long var1 = f1365 ^ 49660500235081L;

      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "Ø", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.String.class, long.class, long.class)), this,  "",  1245914208781686833L,  var1);
      this.alt = null;
   }

   public String m3279() {
      long var1 = f1365 ^ 102726222532172L;
      return ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "¢", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), this,  886945349152949556L,  var1)));
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
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1370[var4] != null) {
         return var4;
      } else {
         Object var5 = f1369[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 42;
               case 1 -> 16;
               case 2 -> 4;
               case 3 -> 53;
               case 4 -> 46;
               case 5 -> 61;
               case 6 -> 8;
               case 7 -> 47;
               case 8 -> 25;
               case 9 -> 24;
               case 10 -> 51;
               case 11 -> 49;
               case 12 -> 40;
               case 13 -> 36;
               case 14 -> 31;
               case 15 -> 12;
               case 16 -> 60;
               case 17 -> 32;
               case 18 -> 23;
               case 19 -> 11;
               case 20 -> 3;
               case 21 -> 62;
               case 22 -> 7;
               case 23 -> 43;
               case 24 -> 63;
               case 25 -> 5;
               case 26 -> 39;
               case 27 -> 58;
               case 28 -> 38;
               case 29 -> 0;
               case 30 -> 20;
               case 31 -> 50;
               case 32 -> 45;
               case 33 -> 56;
               case 34 -> 52;
               case 35 -> 13;
               case 36 -> 26;
               case 37 -> 57;
               case 38 -> 27;
               case 39 -> 44;
               case 40 -> 6;
               case 41 -> 10;
               case 42 -> 17;
               case 43 -> 33;
               case 44 -> 48;
               case 45 -> 21;
               case 46 -> 34;
               case 47 -> 59;
               case 48 -> 35;
               case 49 -> 18;
               case 50 -> 55;
               case 51 -> 15;
               case 52 -> 30;
               case 53 -> 19;
               case 54 -> 9;
               case 55 -> 14;
               case 56 -> 22;
               case 57 -> 29;
               case 58 -> 28;
               case 59 -> 2;
               case 60 -> 41;
               case 61 -> 37;
               case 62 -> 54;
               default -> 1;
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

            f1370[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f1369[0] = ">U5\u0001{\u0003\"O7]a\u00172L|Le\u001f4I&\u0001ԯ";
      f1369[1] = "\u000e\\s\u0001\u00045\u0012Fq]\u001e!\u0002E:L\u001a)\u0004@`\u0001ɞ";
      f1369[2] = "yjL8)`re]wTxabT>";
      f1369[3] = "iZY\u0017NUu@[KTAeC\u0010ZPIcFJ\u0017ý";
      f1369[4] = "\u0017=\u0002\n{9>\u0004\u001e\u0010ye$\u0010\u000e\u00132t#\u0003\bVor8\u0005\u0004\u0016{9\u001f\u0014\u0019\fuy+J";
      f1369[5] = void.class;
      f1370[5] = "java/lang/Void";
      f1369[6] = boolean.class;
      f1370[6] = "java/lang/Boolean";
      f1369[7] = "OK,dr\u0014DD=+\u0019\u0000FO*q5\u0017K";
      f1369[8] = ":\fC+\u0007%&\u0016Aw\u001d16\u0015\nf\u001990\u0010P+˫";
      f1369[9] = "Q&%2S$M<'nI0]?l\u007fM8[:62\u038b";
      f1369[10] = "@ab\u000bp\u0014\\{`Wj\u0000Lx+Fn\bJ}q\u000bÏ";
      f1369[11] = "o\u001d`FL@q\u0015z\t/Tu";
      f1369[12] = "9\"9X'!%8;\u0004=55;pտ";
      f1369[13] = "\u0005%\u0016=ws\n0N\f+r\u0017=";
      f1369[14] = "Ks3>g^Dfk\n\u001by";
      f1369[15] = "M\u0003\f\u007f\u000eDF\f\u001d0cDF\u0011\t";
      f1369[16] = "#P:L6U(_+\u0003W[#T/Y";
      f1369[17] = "\u0015\t>(\u001a4\t\u0013<t\u0000 \u0019\u0010wŭ";
      f1369[18] = "\re{f]\u0017\u0011\u007fy:G\u0003\u0001|2+@\u0010\u00079p'H\u0005\u000by{fc\r\u0005py:";
      f1369[19] = "\u0004\u0002B\rOe\u0018\u0018@QUq\b\u001b\u000b@Qy\u000e\u001eQ\r\\`\u0002^PJ\u0013g\u0002\u001eALJ><\u0019KGRg=\u0019@Tuq\u0005\u0014IFOR\n\u0003@";
      f1369[20] = "k}\u0005=wRwg\u0007amFgdLpjUa!\u000e|b@ma\u0005=Lkkh";
      f1369[21] = "E&V{\u0013x0\u0006]t\u00027Q\bV\u007f\u0006m%";
      f1369[22] = "%^21Bx9D0mXl)G{|_\u007f/\u0002 kYa9\u0002\u0005~Y\u007f";
      f1369[23] = "M='\u0015M\fD3$\\\u000e\u0002[&\"WI\u0001\u000072XE\u0013Z;%USMo'>SE\rZ;)ZT\nA<\u000fCC\u0006^&#TN";
      f1369[24] = "s&o\u001eDPx)~Q>Tk(n\u001e\bP|";
      f1369[25] = "D\u001f\u001d~\u001c\u0016X\u0005\u001f\"\u0006\u0002H\u0006T3\u0002\nN\u0003\u000e~ǎ";
      f1369[26] = "SSN\u007fN\u007fOIL#Tk_J\u00072PcYO]\u007fՀ";
      f1369[27] = "0LFht\u000f,VD4n\u001b<U\u000f%j\u0013:PUhύ";
      f1369[28] = "Y$\u0003W\u001e'p\u001d\u001fM\u001c{j\t\u000fNWjn\u0001\tK\r'ωS";
      f1369[29] = "B&\u001aI}\u0011K(\u0019\u0000>\u001fT=\u001f\u000by\u001c\u000f\u000e\u0016\nu.S&\u0011\u000e|\u001b";
      f1369[30] = "-\u0014LmXF1\u000eN1BR!\r\u0005 FZ'\b_mȡ";
      f1369[31] = "J}yd]EVg{8GQFd0)CY@ajdȖ";
      f1369[32] = "XK6ufvFC,:\u001dV{n";
      f1369[33] = "Edk\n?\u001dY~iV%\tI}\"G!\u0001Oxx\n\u03a2";
      f1369[34] = "z|^l7\u0018ks\u0007S0\u0016fB\u0005o?J&s\u0002='\b";
      f1369[35] = "\tL_@\u007f\u0004\nO@^\u0016\u0010\u0004KR//\u0017\u001c@TJd\u0006\u0002\u001f";
      f1369[36] = "ie\u000b\u0015\u0014\u001axjR*\u0002\u0019r \u0016M\u0000\u001c\tb\b[\u0014\u001bl)\u0019EK";
      f1369[37] = "c\u0013z=x\u0003r\u001c#\u0002Ǽi:Lil}\fq]w3\u0016R\u007fPfhm\u000f>Hz\u0002";
      f1369[38] = "=SuxTg:\u0001m:h¼\u0004Sjp\u0006;aQy\u007fWV";
      f1369[39] = "SO[B%,\u000fLWI\u001d\u0005RJJMt8xU[Hx23P\f\u0012fuHWO\u0017c";
      f1369[40] = "\u0000/\"s1,\u000e<(%IŐ?y8{$=Tx,p6A";
      f1369[41] = ">=DlL_e'\u00054)hH\u000ec\nn~^Y\n4V\u0012j(Q.\u0017J";
      f1369[42] = "Jfqk,C[i(Tĺ)\u00139b:)LX(|eB\u0014L\"*1 WQ7pT";
      f1369[43] = "S\u0000\u001d4pT\u0010\u001d\bn\u0015_\u0005\r\nvna\u0012\u0001\u0004`s6W\u0007\u0016c~S\u001c\u0016\b<";
      f1369[44] = "K\u00072\u001f#hM\u001dv\u0016Fo\u0018\b0K=u\"\u001a-E+su_+W(~\u0010\u0014:Iw";
      f1369[45] = "Y.\u0011'WXH!H\u0018|in\\>FxytG8_u\u007fnL4[ttn]5TauxV/\u0018\bHDb\raS\u000b\u0006k";
      f1369[46] = "\u007ff<P4;s{xGMy\u00130%N#>v{4P|U*h5Q&0ay+\u000eM";
      f1369[47] = "\u0018Dpc7}K\u0018<uRv\u000fS+uR\"\u0014X\"d7i\u0005F}\u000f?}\u0016W4ln&\u000fJL4.f\u000bC7io~\u0017)";
      f1369[48] = "\u001et\u001cI>vUe\u0002\u0016Ur\\X\b_)b')\u0014\u0017;~B+\u0007\u0018j\u0013";
      f1369[49] = "\u0012S^;k\u0010\u0003\\\u0007\u0004l\u0011\u0019\u0000G\u007fY\u001d\u0011\u0000Z\u0004<\u001b\u0003\u0003Waw\n\u001d\\";
      f1369[50] = "HyN\u001bJG\u0014zB\u0010r~OdJ\u0016r\u001bIvI\u001b\u0017PXh\u0016";
      f1369[51] = "?)\f>\t+.&U\u00017\u000b\u001b@'\\;\u0001\bZ(M?\u0006\u001eQ2\u0001V;\"e\u0010x\rx`l";
      f1369[52] = "=5Y}\u0003y>6Fcjj5W\\\"\t`ajFjQm";
      f1369[53] = "AXt:b5\u0015\u0000q.\u0002*CGH'y>GT`J;$_Uf/p5A\n\r";
      f1369[54] = "\u007fW\u0015Ag|y\fI^\u0015i\u0014\u0007\u001e\u0001s8xVB[g";
      f1369[55] = "r\b\u0013\u0004T4#\u001eC^o\u0090BOWS\u0002$)NCX\u0010X{\u0011_\r\u0004=0\u0000ARoa#\u0001@\b\n*2\u001f\u001fcP!r\u001dR\bQ5y\u000f.";
      f1369[56] = "2G;PH]#HboΔ7k\u0018(\u0001MR \t6^&\u000e3\b7\u0004CE\"\u0016ho\u001bQ(@<\rXL=\u001aY";
      f1369[57] = "c\\\u001c6hubVV;UȭY\u0004\u0019~+og[D6/\u0005";
      f1369[58] = "}\u001cYi\u000fDl\u0013\u0000V1uAyl\u001f<r]uv\u0010-vZc}\na\u001fg_I(\u0018D$\u001d@";
      f1369[59] = "r \u0002\u0015_yc/[*մ\u0013+\u007f\u0011DZv`n\u000f\u001b1(nc\u001e@Ju/{\u0002*";
      f1369[60] = "_*y5Q3N% \nz\u0002hXVT~\u0012rCPMs\u0014hNVSb\u0014dHLGy\u0015gSZLcY\u000enfxA U-$q";
      f1369[61] = "y_&<AFhP\u007f\u0003jgN9\u001eDam],\u0013Ni`A&\u0005Es,(\u001b9qQUsX{x";
      f1369[62] = "MV#e.\u0001J\u0004;'\u0012ǖtS$,|[\u0011\u001852#0";
      f1369[63] = "\u0006jj~\u0016e\u0007~aljvDoZy\rv\t*>p\u0013~A\u00130t\u0012>\u0000w9j\u001av9y=kZ7]p#c\u0012\u000e";
      f1369[64] = "\u0002\n2\r ,V\u001d:\rX<l^2F6{\t\u0015#Xi\u0010U\u0006\"Y3u\u001e\u0017<\u0006X";
      f1369[65] = "7 $F^;f6t\u001ceӺ\u0007i}^Y2v2g\u001f\u0001W6\"dS\u001b.ma&Zeh~ht]\u000eijcf!\f*d<bZ\f(l;\u0019K\u0002/7a}B\u001c'\u007fX";
      f1369[66] = "\u000b\u000eZY\u0004\u000f\u001a\u0001\u0003f/><l\u007f%'#<}~*2\"*vdf[\u001f\u0016BF\u001f\u0000\\TK";
      f1369[67] = "\u000e\u0003v\u00128z\u001f\f/-?\u0010RBi\u001d,bTWn@V,\u0011@$W$*\u0004Gy-";
      f1369[68] = "\u0013q\u0000w;uBgP-\u0000\u0558#8Yo<|RcC.d\u0019\u0012s@b~`I0\u0002k\u0000sDq\r)dzZyE\u0010id@mFkifHj=/y)NuV.m\"\\\tWwx)\u001am^ipa#";
      f1369[69] = ")&}\u0002\fC'3:[p@+#\u0004\u000e\u000bT/0,cIN71*\u0006\u0002_)nA";
      f1369[70] = ">\u0001\u0011u\u0003\\o\u0017A/8Ʋ\u000eHHm\u0004U\u007f\u0013R,\\0?\u0003Q`FId@\u0013i8Zi\u0001\u001c+\\Sw\tT\u0012QMm\u001dWiQOe\u001a,x_H>@HqA@vy";
      f1369[71] = "\u0012J\u007fTl3\u0015\tzQP8\u000e\u0015DM*xK\u00154D\"3I";
      f1369[72] = "EOO[;\\T@\u0016d.[A\u001cF\u00188Z}\u000bJ\n4RHqNX5GO\u000b_\u0018?K";
      f1369[73] = "C(|GAoDzd\u0005}#\u0001y`\u0019\u0014;\u0017\u0014#\u001e\f0\u0011qh\u000f\u0012o";
      f1369[74] = "Q@5\u00061J@Ol9ǽ \n\u0002*G5[WC2[_";
      f1369[75] = "D51\u0013IP\u001fvs\u001a7B\u000f\"%\u001dZ)L.=\u000f\\L\u0007?#P7\u0018\u000f2>\u001fNCLp7a";
      f1369[76] = "\n\u0019^S\u0004\u0007\u001b\u0016\u0007lοmWAFU\u000f\u000f\u0014\\S\u000fjV\u0016ZB\u0006\u0011\u000bWB^l";
      f1369[77] = "8gf\u0001?i>}\"\bZ}mmsC!Cza}U<\u0014?goV1qtvq\t";
      f1369[78] = "r`Ta\u0010C.sX|!¢\u00161F(L\u0000}0R#^|";
      f1369[79] = "=\u001cy\"Ae:Na`}=`Ava}meQqq\u0018&tO.";
      f1369[80] = "\t V\u000f*P\u0018/\u000f0ԯ:P\u007fE^/_\u001bn[\u0001D";
      f1369[81] = "~F\u0000R2>oIYm\u0019\u001fI<%\"\u001d\u0012I5$!\u0004\u0013_>>mm.c\n\u001c\u00146m!\u0003";
      f1369[82] = "d?An\u001e\u0019'\"T4{\u000147A:\u0000\u001b\u0005>X:\u001d{`8J9\u0010\u001e+)Tf";
      f1369[83] = "gB9Zh;`\u0010!\u0018Tr7\u0005$\u001d3p2~f\u0003%d5\u001b-\u0012;;";
      f1369[84] = "R\u00183]H1^V%X8˽4\u00175\u0006U#_\u0016!\rG_";
      f1369[85] = "=/8OK\b, apϓbdp+\u001eN\u0007/a5A%";
      f1369[86] = "x\u0014,pHi(\u0006}rp+y\u001f\u001c4\u0011'w\u000fy\u007f\u00009(";
      f1369[87] = "\u000f~\u001d\rM+\u001eqD2^:\u0002:\u0019[F,oy\u001eCM*\n2\u000f]\u0012";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f1369[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1370[var4]);
            f1369[var4] = var5;
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
      Object var5 = f1369[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1370[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f1369[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1369[var4] = var13;
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
               var12 = m123(1186842776198749L, 0L);
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
      Object var5 = f1369[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1370[var4];
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
               f1369[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(1186842776198749L, 0L);
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
                     f1369[var4] = var19;
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
               var23 = m123(1186842776198749L, 0L);
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
         if (var8 != 162 && var8 != 216 && var8 != 186 && var8 != 223) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'c') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 198) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 162) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 216) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 186) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class058.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/Ԧ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
