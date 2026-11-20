package org.rusherhack.client.api.feature.window;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
public abstract class ResizeableWindow extends PinnableWindow {
   public boolean f754;
   public double f755;
   public double f756;
   public double f757;
   public double f758;
   public double f759;
   public double f760;
   public static String[] f761;
   public static long f762 = Class066.m4320(637750514455652647L, 8119954475766241968L, MethodHandles.lookup().lookupClass()).m4325(70580408857023L);
   public static String[] f763;
   public static String[] f764;
   public static Object[] f766 = new Object[37];
   public static String[] f767 = new String[37];

   @Override
   public JsonElement serialize() {
      JsonObject var4 = super.serialize().getAsJsonObject();
      var4.addProperty("width", super.width);
      var4.addProperty("height", super.height);
      return var4;
   }

   public ResizeableWindow(String var1, double var2, double var4, double var6, double var8) {
    }

   public void setMinWidth(double var1) {
        
    }

   public ResizeableWindow(String var1, double var2, double var4) {
    }

   public void setResizing(boolean var1, double var2, double var4) {
        
    }

   @Override
   public void mouseMoved(double var1, double var3) {
        
    }

   public void setMinHeight(double var1) {
        
    }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
        
    }

   public void setMaxHeight(double var1) {
        
    }

   @Override
   public boolean deserialize(JsonElement var1) {
      if (super.deserialize(var1)) {
         JsonObject var5 = var1.getAsJsonObject();
         super.width = var5.get("width").getAsDouble();
         super.height = var5.get("height").getAsDouble();
         return true;
      } else {
         return false;
      }
   }

   public boolean isResizing() {
        return false;
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      return super.mouseClicked(var1, var3, var5);
   }

   public void setMaxWidth(double var1) {
        
    }

   public static void m1723(String[] var0) {
      f761 = var0;
   }

   public static String[] m1724() {
      return f761;
   }

   static {
    }
   public static String m221(byte[] var0) {
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
   public static void m1731() {
      f766[0] = ";=Dj\u001ct''F6\u0006`7$\r'\u0002h1!Wj\u000fq=aE!\u000fu!=Fj\u0019h:+L3@S1<J>\u000b`6#F\u0013\u0007o0 T";
      f766[1] = double.class;
      f767[1] = "java/lang/Double";
      f766[2] = "'\u0005r^S\\+\rs\u0015\u001aT7\u0005q^~@+\u0004P\u0012^V'\u001e";
      f766[3] = "\u0007\u000ekqNN\f\u0001z>3V\u001f\u0006sw";
      f766[4] = "\u0016\u0014\u007fSQ%\u001d\u001bn\u001c1<\u0011\u0017l@";
      f766[5] = void.class;
      f767[5] = "java/lang/Void";
      f766[6] = "` {n\u000bw|:y2\u0011cl92Ѱ";
      f766[7] = "\"h$w\u0000_>r&+\u001aK.qm:\u001eC(t7w\u0013Z$4%<\u0013^8h&w\u0005C#~,.\\}$t'6\u0005";
      f766[8] = "\u001aB\n\u007f\u001f\u0011\u0006X\b#\u0005\u0005\u0016[C2\u0002\u0016\u0010\u001e\u0018%\u0004\b\u0006\u001e=0\u0004\u0016";
      f766[9] = "\u0012+\u0010\u001f\u000fn\u001e#\u0011TFf\u0002+\u0013\u001f\"r\u001e*8]\rl\u0014*\t";
      f766[10] = "\u0015\u0018\u001d\u0006@\\\u001e\u0017\fI*_\n\u001b\u0007\u0002";
      f766[11] = ";dzf9\u0000NDqi(O3\\bn!\u0006[";
      f766[12] = boolean.class;
      f767[12] = "java/lang/Boolean";
      f766[13] = "k6U#D\u001ew,W\u007f^\ng/\u001cɹ";
      f766[14] = int.class;
      f767[14] = "java/lang/Integer";
      f766[15] = "Pxa~T\u000b[wp15\u0005P|tk";
      f766[16] = "yT'\"\u0011\u0004xX;,u\u0006,T\u00009\u0012\u0017-B.2uU{\t42\u0005\u0001,Z#CO\u0013<\u0007%$J\u000f8GXx\u0016\u000f!\u0001 y\u0018\u0003-8";
      f766[17] = "r\u0004]/7$%\u0017\rvY)!\u0013.j\u0015!1\u0005\u0003|Y7v\u0011\u0007`7+5^g";
      f766[18] = "&M\b\u0002TL3\u000eUz\u0006's\\\u0018\u001d\nB%\fZ\bl\u0016(J\u0003\u001c\t@x\b\u0016z";
      f766[19] = "W\u0005q7=S\u0017\\{5WбkY$<;G\u001b\rso,6QX.a&F\u0005\u000f}vW";
      f766[20] = "\u000b\u0007\u0010$b*\r\u0007\b=^6[\u000b\u0015/\"VGP\u0004//8[\u0013K";
      f766[21] = "kg=oSR~$`\u0017ϯ9~&/w\u001aWbe`";
      f766[22] = "M!^\"*oXb\u0003Z~iR7H;{`H(_Z,o\u0013d\\8{|C=2j`aO N${cCZ";
      f766[23] = "\u000474uGK\u0011ti\rѡ \u0011v&m\u000eN\r5i";
      f766[24] = "o\u001f)l\u0017\nz\\t\u0014T\fq\u0005,pN\u0013fd{\u007f\u0015_e\u0006,lE\u0006\u000b";
      f766[25] = "8\u0017e,'oe\u0017e'[%\u0006\u0013!}7xvGv. \t<\u0012+ *yhEx7[";
      f766[26] = "H\u001f_).\u000eN\u001fG0\u0012\u008auCO#vN\u0013\u0012Q cr";
      f766[27] = "Rh\n H\n\u0005{Zy&\u0007\u0001\u007fyed\u0013\u000bewtD\u0005\u0007\u007f0'J\u0017\rg[&F\u000b\u0003\u0003";
      f766[28] = "sA[(\u0001\"uAC1=!/@M#=/tRQ2S37\u001d";
      f766[29] = "n\b>RO.i\ro\u0015(m8V}Go}QC:THb?_y\u001b(,k\fxM\u0015+n]?*";
      f766[30] = "D\u001a<\u0015B%QYamƵNQ[.\r\u000b M\u0018a";
      f766[31] = "\u001chv7k*\t++OӵA\t)d/\"/\u0015j+";
      f766[32] = "?4\u001c6\u0002K>8\u00008fOk$cm]\u0011j)\u00139\nB}X]<\\\u001eh:\n/\fG\u0006";
      f766[33] = ";_\u00052N\u0004.\u001cXJΥo.\u001e\u0017*\u0007\u00012]X";
      f766[34] = "fH\u000fL9ws\u000bR4ā\u001cs\t\u001dTproJR";
      f766[35] = "|\u000f\fy2niLQ\u0001Ƣ\u0005(\u0006\u0005gpyf\u001d\u0007k";
      f766[36] = "3%\u001aHP5&fG0Ы^h&\u0015L\u0012g8>\u0011Vhe4>\u0017\t\u0010d:2\u001b0";
   }

   public ResizeableWindow() {}
}
