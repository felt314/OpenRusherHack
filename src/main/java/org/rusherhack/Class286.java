package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.MinecraftVersion;

public class Class286 {
   public String f4838;
   public String[] f4839;
   public String f4840;
   public String f4841;
   public String f4842;
   public String[] f4843;
   public static String[] f4844;
   public static long f4845 = Class066.m4320(-8099480675967798443L, -900107601324878874L, MethodHandles.lookup().lookupClass()).m4325(167098635764605L);
   public static String[] f4846;
   public static String[] f4847;
   public static long f4849;
   public static Object[] f4850 = new Object[41];
   public static String[] f4851 = new String[41];

   public void m9802(String[] var1) {
      this.f4839 = var1;
   }

   public String m6843() {
      return this.f4840;
   }

   public void m9804(String var1) {
      this.f4841 = var1;
   }

   public String[] m9805() {
      return this.f4839;
   }

   @Override
   public boolean equals(Object var1) {
        return false;
    }

   public String m9806() {
      return this.f4841;
   }

   public void m9807(String var1) {
      this.f4838 = var1;
   }

   public String m9808() {
      return this.f4842;
   }

   public void m9809(String var1) {
      this.f4840 = var1;
   }

   public String m9810() {
      return this.f4838;
   }

   public Class286(String var1) {
      super();
      this.f4838 = null;
      this.f4840 = null;
      this.f4841 = null;
      this.f4843 = null;
      this.f4839 = new String[]{MinecraftVersion.CURRENT.getName()};
      this.f4842 = var1;
   }

   @Override
   public String toString() {
      String var10000 = this.f4842;
      String var10001 = this.f4838;
      String var10002 = this.f4840;
      String var10003 = Arrays.toString((Object[])this.f4839);
      String var10004 = this.f4841;
      String var3 = Arrays.toString((Object[])this.f4843);
      String var4 = var10004;
      String var5 = var10003;
      String var6 = var10002;
      String var7 = var10001;
      String var8 = var10000;
      return "PluginMetadata[pluginClass="
         + var8
         + ", name="
         + var7
         + ", version="
         + var6
         + ", supportedMinecraftVersions="
         + var5
         + ", description="
         + var4
         + ", authors="
         + var3
         + "]";
   }

   public String[] m9811() {
      return this.f4843;
   }

   public void m9812(String[] var1) {
      this.f4843 = var1;
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[(int)f4849];
      var10000[0] = this.f4842;
      boolean var10004 = true;
      var10000[1] = this.f4838;
      var10000[2] = this.f4840;
      var10000[3] = Arrays.hashCode((Object[])this.f4839);
      var10000[4] = this.f4841;
      var10000[5] = Arrays.hashCode((Object[])this.f4843);
      return Objects.hash(var10000);
   }

   public static void m9814(String[] var0) {
      f4844 = var0;
   }

   public static String[] m9815() {
      return f4844;
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
      f4850[0] = "Z\\G\u0002O\u001eFFE^U\nVE\u000eȒ";
      f4850[1] = "8\u0010<7%]3\u001f-xXE \u0018$1";
      f4850[2] = "O7=uD3:\u00176zU|G\u000f%}\\5/";
      f4850[3] = ",\"w|\\n08u Fz ;>ɔ";
      f4850[4] = int.class;
      f4851[4] = "java/lang/Integer";
      f4850[5] = "-Mn ]}Xme/L2%uv(E{M";
      f4850[6] = "e\u0002wru\u0010{\nm=\u001a\u0017}\u0002x`";
      f4850[7] = "_%\fJkN*\u0005\u0007Ez\u0001K\u000b\fN~[?";
      f4850[8] = "bvo\tVL\u0017Vd\u0006G\u0003vXo\rCY\u0002";
      f4850[9] = boolean.class;
      f4851[9] = "java/lang/Boolean";
      f4850[10] = "f!dVR\u0001z;f\nH\u0015j8-Ȍ";
      f4850[11] = "BC_2%^\\KE}DIBGJ'x";
      f4850[12] = "cH-$\t`hG<khncL81";
      f4850[13] = "P\u0019xX]\u001b%9sWLTD7x\\H\u000e0";
      f4850[14] = "pI'i\bZ\u0005i,f\u0019\u0015xq?a\u0010\\\u0010";
      f4850[15] = void.class;
      f4851[15] = "java/lang/Void";
      f4850[16] = char.class;
      f4851[16] = "java/lang/Character";
      f4850[17] = "\u0002\u0003_+y\u0016w#T.hY\u0016-_/l\u0003b";
      f4850[18] = "q\u0017\u0013\u001e$f\u00047\u0018\u00115)e9\u0013\u001a1s\u0011";
      f4850[19] = "\f:|\f{n\u00075mC\u001cl\u0012>m\b'";
      f4850[20] = "?\u0010@\u001f:\u000e?\u0010WC6\u0001%[W]6\u0014\"*\u0002\u0005o^";
      f4850[21] = "\u001aA}wv\n\u001aAj+z\u0005\u0000\nj5z\u0010\u0007{:n\"T";
      f4850[22] = "ra'f\u0000\u0007&$?\u0016ǌ|j&1'D\u0004|!$";
      f4850[23] = "|3Kc\t\u0018(vS\u0013ӟcqa]\u007fI\u0003w5P/";
      f4850[24] = "\nH\u0018Q-\bY\u0011YR\u0014ԉ0\u0012\u001c\u0000lV\\\u0013O\u0015/i";
      f4850[25] = "\u0017r\u0000g]vC7\u0018\u0017ђ\r\u000f5\u0016&\u0019u\u00192\u0003";
      f4850[26] = "\u000b7\u0000 {YV _<\u0017AP\u000b\u0019$v[XP\tes\u0002Uj\n,,\u00057,\u001c0&\u0000O:\u001b%\u0017";
      f4850[27] = "tx\b\u0005zi =\u0010uũ\u0012y*\u001e\u0019:r\u007f~\u0013I";
      f4850[28] = "\u000elI=\u0006\u0010\u0018k\\\f_\u0005\u0014z[l;SJy_3WR\u0019l\u001c\f";
      f4850[29] = "o\u0016O \u0012\u0015~XV$*\u0013oUO:F!>\u0019\u0017d\u001bv~PAl\u0017\u000ehWT]";
      f4850[30] = "\u0018V\u0007l\u0004CEAXphGMJ\u0002Y\u000fKI1\u000e)\f\u0018F\u000b\r`S\u001f$\nZ~\u0010\u0018H\u000b\tkS'";
      f4850[31] = "M\u00065*\u000f`\u001dX*m\u007f|\u001b\u0018*\u0015\u0013'\u0016\\(/\u0010nI[J.Gp\n\\&/\u0014eIc";
      f4850[32] = "\u001f3P(\u0012(KvHXĄS\u0007tFiV+\u0011sS";
      f4850[33] = "\u0004x\u0015]:\u007fP=\r-ȡ\u0004\t*\u0003Azd\u000f~\u000e\u0011Cm\u001f)P\u00109m\u0000|\u0017-";
      f4850[34] = "+:\u001fbZO|,H0\"P.'\u000b4e@GxN5Z\u0011+y\u001d \u0019.+:\u001fbZO|,H0\"";
      f4850[35] = "Bl\u001a[C\u001bTo\u0018[.NN\u007fE\u0007y\u001a\u0012)\u0018Z.M\u0010r\\SM\\^kX";
      f4850[36] = "HBZ^>Y\u0015U\u0005BRP\rXVD)=\u0018\u001e[\u001f0\u0007\u001bW\u0004\u0018RQOA\u0000BhR\u0006\u001e\u0007 lY\u0005YA\u0010oPLO?";
      f4850[37] = "\u000f6(|),\u00191=M\u007f4\u001a5\u000f1\u0014oK#>rxn\u00186}M~jK&)w/+N/F";
      f4850[38] = "\u001e_:Uw!J\u001a\"%ϩZ\u0006\u0018,\u00143\"\u0010\u001f9";
      f4850[39] = "Y5Y\u0004G6\rpAtWM\u0002`\u0019NX2TrEN>rV3\u001b\u0012A$Do\u001bt";
      f4850[40] = "aC]\u0002.f1\u001dBE^w'[KY%\u001an_\u0018\u0007djn\u001dH\u0005^*'\u001c\u0018\u0007.*eL\u001a=`~/Z\\\rcwfL\"";
   }
}
