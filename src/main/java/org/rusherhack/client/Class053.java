package org.rusherhack.client;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.Renderer273;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;

public class Class053 implements Class038 {
   public IModule f1337;
   public static boolean f1338;
   public static long f1339 = Class066.m4320(7809342235754659280L, 785275625733049686L, MethodHandles.lookup().lookupClass()).m4325(46315929382358L);
   public static String f1340;
   public static Object[] f1341 = new Object[25];
   public static String[] f1342 = new String[25];

   public Class053(IModule var1) {
      this.f1337 = var1;
   }

   @Override
   public String m3029() {
      return this.f1337.getCategory().getDisplayName() + f1340 + this.f1337.getName();
   }

   public IModule m3179() {
      return this.f1337;
   }

   @Override
   public Runnable m3028() {
      return () -> {
         boolean var3 = m3182();
         PanelHandlerBase var5;
         PanelHandlerBase var10000 = var5 = Class170.f3364.m7115().getClickGuiHandler();
         if (!var3) {
            if (!(var10000 instanceof Renderer273)) {
               return;
            }

            var10000 = var5;
         }

         ((Renderer273)var10000).m9579(this.f1337, null);
      };
   }

   public static void m3181(boolean var0) {
      f1338 = var0;
   }

   public static boolean m3182() {
      return f1338;
   }

   public static boolean m3183() {
      boolean var0 = m3182();
      return !var0;
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
      f1341[0] = "BN\u000eMdH^T\f\u0011~\\NWGɄ";
      f1341[1] = "G/\u001c/83[5\u001es\"'K6Ub&/M3\u000f/+6As\u001dd+2]/\u001e/')L(\u0017dd\u000fe2\u001ft&#";
      f1341[2] = "S\u00023\u0012\u00059O\u00181N\u001f-_\u001bz_\u0018>Y^'Y\u00038U\u001e3\u0012$)H\u0004=R\u0010";
      f1341[3] = void.class;
      f1342[3] = "java/lang/Void";
      f1341[4] = "GFP\u0016A6[\\RJ[\"K_\u0019Ά";
      f1341[5] = "7\u0014x\"q!+\u000ez~k5;\r1oo==\bk\"b$1Hje-$9\bz`-\u00049\bz`K56\u0002siq\u00169\u0015z";
      f1341[6] = "`'{I^l|=y\u0015Dxl>2Č";
      f1341[7] = "=x4\u0007M\u000e!b6[W\u001a1a}JS\u00127d'\u0007Ј";
      f1341[8] = "_9&2]\u001cC#$nG\bS oɨ";
      f1341[9] = boolean.class;
      f1342[9] = "java/lang/Boolean";
      f1341[10] = "]6-yKPA,/%QDQ/d4ULW*>yXU[j,2XQG6/yTJV1&2\u0017h] ?;\\fS0/0VWK";
      f1341[11] = "0\bQ@u\u000f;\u0007@\u000f\b\u0017(\u0000IF";
      f1341[12] = "M6,\fnyQ,.PtmA/eAs~Gj\"LhiP\"*Ay\u007f\f\r\u0005CqiF";
      f1341[13] = "\u000fuS7\u0000\u001b\u0004zBxa\u0015\u000fqF\"";
      f1341[14] = "\n\u001dI\b9\u0018\u0003\\\u0018gԀfXHY\u0019}\u000f\u000f\u001c\u001b\r\u0003_\u0006\u0019\u001f\u0017r\\\u000f\u0019^g9[\u0001@^\u0005sV\u0007S'";
      f1341[15] = "!n`*[it26h;ѱ\u001d8e-Z}&8a3B\u0000";
      f1341[16] = "E'\t\u0010\u0006.E#\u0017\b{z\u0013c;\u0015\u001a~\u001dP\r\u0010;|\u0018s\u0014\u001c\u0001\u0015B\"@\f\u001bh\u0004|\r\u0001{";
      f1341[17] = "\rt.4NxH-re\"z_1\u0005eYmV$8BKp_MvtMn\ru29D\u007f2";
      f1341[18] = "pL~R)\u001e4FmV\u0011ƟM\u001fv[rDp\u001bp\u0018`!w\u001c\u007fJhC=\u0011yY\u0011";
      f1341[19] = "p){*\u0010\u00154#h.(CMybnL\u0012v8a8X*p<%5\u0010\u00111?s!(";
      f1341[20] = "nG<%gC;\u001bjg\u0007ΔR\u0016lfyJ;C00;";
      f1341[21] = "{SLKz~?Y_OBΆF\u0000DB!${\u0004B\u00013A";
      f1341[22] = "q\u0011n[k\b&GiW[\r,\u000bD[>\u000fAHr] ]y\f?T1b";
      f1341[23] = "H(=$!3\u001f|\u007f0_5\u001c?\b3#7\u001e$9+_eH$s62 \u0011x\"Z";
      f1341[24] = "P0QiY}\u0014:BmaЀmd[l\u001f<\u00043\u000f.\u000b";
   }

   public Class053() {}
}
