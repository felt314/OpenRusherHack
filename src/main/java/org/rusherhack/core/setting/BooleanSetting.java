package org.rusherhack.core.setting;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.MethodHandles;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.Class019;
import org.rusherhack.core.utils.IOUtils;

public class BooleanSetting extends Setting<Boolean> {
   public static String[] f1667;
   public static String[] f1668;
   public static Setting[] f1669;
   public static long f1670 = Class066.m4320(1781798689682388012L, -7742404703809935831L, MethodHandles.lookup().lookupClass()).m4325(268591176858333L);
   public static Object[] f1671 = new Object[40];
   public static String[] f1672 = new String[40];

   @Override
   public JsonElement serializeValue() {
      return new JsonPrimitive((Boolean)this.getValue());
   }

   public BooleanSetting setChangeAction(Runnable var1) {
      return (BooleanSetting)super.setChangeAction(var1);
   }

   static {
    }

   public BooleanSetting setVisibility(BooleanSupplier var1) {
      return (BooleanSetting)super.setVisibility(var1);
   }

   @Override
   public boolean deserializeValue(JsonElement var1) {
        return false;
    }

   @Override
   public String getDisplayValue() {
      return ((Boolean)this.getValue()).toString();
   }

   public BooleanSetting(String var1, Boolean var2) {
      super(var1, var2);
   }

   public Boolean parseValue(String var1, boolean var2) {
        return null;
    }

   public BooleanSetting setHidden(boolean var1) {
      return (BooleanSetting)super.setHidden(var1);
   }

   public BooleanSetting onChange(Consumer<Boolean> var1) {
      return (BooleanSetting)super.onChange(var1);
   }

   public BooleanSetting(String var1, String var2, Boolean var3) {
      super(var1, var2, var3);
   }

   public static void m4068(Setting[] var0) {
      f1669 = var0;
   }

   public static Setting[] m4069() {
      return f1669;
   }
   public static String m656(byte[] var0) {
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
      f1671[0] = "~5#\u0014!!b/!H;5r,jY<&ti7_' x)#\u0014\u0011;~+![=\u0007t30S=3";
      f1671[1] = "zKT\u0004\nfdCNKBf~IV\fK}>iM\u000bWf}OP";
      f1671[2] = "Vqq\u0006X<HykI\u0010<Rss\u000e\u0019'\u0012Rh\b\u001a,]~T\u0012\u00069Pyb\u0015";
      f1671[3] = ".<(+Z %39d6#+1;+\u001a";
      f1671[4] = boolean.class;
      f1672[4] = "java/lang/Boolean";
      f1671[5] = "e\u0007%97cy\u001d'e-wi\u001elt*do[1r1bc\u001b%9\u0016s~\u0001+y\"";
      f1671[6] = "\r0'lD&\u0006?6#%(\r42y";
      f1671[7] = void.class;
      f1672[7] = "java/lang/Void";
      f1671[8] = "8{FZ\toM[MU\u0018 0C^R\u0011iX";
      f1671[9] = "R\u0006\u0015\u0014_2{?\t\u000e]na+\u0019\r\u0016\u007ff8\u001fHKy}>\u0013\b_2Z/\u000e\u0012Qrnq";
      f1671[10] = "I\u001a=z?KU\u0000?&%_E\u0003tȠ";
      f1671[11] = "]}8\"\u00139(]3-\u0002vUE *\u000b?=";
      f1671[12] = ">u \u0012`W5z1]\u001dO&}8\u0014";
      f1671[13] = "\u0003U\u0011\u000fIR\bZ\u0000@5K\u0007Z\u0006\f\u000b[";
      f1671[14] = "\u00183!!1 \u0004)#}+4\u0014*hl,'\u0012o3{*9\u0004o\u000f@\u0016!\u001e-5";
      f1671[15] = "kRL8dawHNd~ugK\u0005uz}aN_8×";
      f1671[16] = "<{2+>:\u0015B.1<f\u000fV>2ww\bE8w*q\u0013C47>:4R)-0z\u0000\f";
      f1671[17] = "\u001e#MK\u00111\u0012+L\u0000X9\u000e#NK<-\u0012\"p\u0017\u001f3\u00148I\u0013\u0013";
      f1671[18] = "iJ+D\u0003\u0002eB*\u000fJ\nyJ(D.\u001eeK\u0003\u0006\u0001\u0000oK2";
      f1671[19] = "\u0012\r1DB\u0004RV:\u0017r\u0003O1!\u0002\u0013\u0019Gjm\u001d\u0018\u0003R[2\u0005J\u0012(";
      f1671[20] = "JKo\u0017\u0011U\n\u0010dD!P\u0019H~Ff@p\u0016xW\u001e\u0012NSmE\u0010.JKo\u0017\u0011U\n\u0010dD!";
      f1671[21] = "fv!e_jg( \u001dV|v\t'qA|lI|fQ.6w9sC \n%yzUcq$'{-";
      f1671[22] = "9V[8\u001e\u00179PX8r\roM\u007f6\u0016\u000bo1\u001d6CNrVHa\u0000\u0018\u0002\f\u001f=\u0012\u0019p\r]a\u0014v";
      f1671[23] = "\u0007\u0011$\u00162p\u0006O%nС\u000bT^%T,fPN&P";
      f1671[24] = "\u0012B<6\u0012:\u0019[&9w}#\t3c\u000b+\u0012V+1\u001aQ\u0013\\<u\r`LDndw";
      f1671[25] = "\u001e\u0001\u0019^\u0007<\u0013\u001a\u0015\\dd\u000f:\u0003]\u0000h\u001d\u0016d\u0000\u001fyKLZE\nkEp";
      f1671[26] = "&#\u0015\u0004\u001e\u00123e\u0014C$ѤOh\u0001PX\u0014~7\u0019\u0002In\u007f=\u000eF^_ %\\W$";
      f1671[27] = "_lj\u0004\u007fU^2k|Ƅ.Y3=\u0013cSPj=A\r";
      f1671[28] = "p! \fDnq\u007f!t_\u0015#}|EKz%}(\u000f6*\u007f%v\tY,\u007fq<t";
      f1671[29] = "w\u0016cn4GvHb\u0016=Qgbd\u007f Sv`oj'[})5}&X%\u0019bt7\f\u001bE;q>N`DepF";
      f1671[30] = "78aT7\r6f`,>\u001b'YgW$\u001c:cgP4va?zE/\u0015>9f^E\u001ad`~^>\u001b:a\u0006";
      f1671[31] = "]EhEZF_@p\u000ek@J;mP\ryK\u0018sV\u0017@O\u0014\u0016\r\u0010]\u000eE(H\u0005O\u0000y";
      f1671[32] = "H^I9)\u000eI\u0000HA<\u0013o\u0001G'4\u0018$X\u00113$\bJ\u0000\u0010/)uH^I9)\u000eI\u0000HA";
      f1671[33] = "5O9:\bw4\u00118BӉ\f3\u0010n-\u0014q:In\u007fz1g\u0012>-\b0%N8B";
      f1671[34] = "0F(mY\f2C0&h\u00041\u0006\u001fd\"\f;\u001e;v\u000ekf\u0001* TU#\u00148.h";
      f1671[35] = "}\u007fFw2\u000b|!G\u000fГp.0G5,\u001d* D1";
      f1671[36] = "cym\u001eG[a|uUvSb9Z\u00174Gh#K\u0016\u0017Yn9r\u0012\u001b<e4n\b\u0015\u0005h/b\nv";
      f1671[37] = "\u0000y?,o=\u0001'>Te/\u0016=5\nt\"\u0011+Xdx,\u0010<i;`~\u0001Fb/ayPx':swl|?8!v\u0017<d3rF";
      f1671[38] = "I<].:O\u0016$\u000f?@\u0013\u0000$^6;?\u0016?P(-5\u0010\"ZRp\u001b\u0013%Mc/\u0003A47h;\u0002Fe\t-.\u0010HY";
      f1671[39] = "\u0016\u00147I`6\u0016\u00124I\f8@\u000f\u0013Gh*@sqG=o]\u0014$\u0010~9-";
   }

   public BooleanSetting() {}

   public static Setting[] Ɓ() { return new Setting[0]; }
}
