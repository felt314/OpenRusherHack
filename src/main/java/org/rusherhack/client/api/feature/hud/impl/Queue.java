package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import com.google.gson.JsonArray;
import java.lang.invoke.MethodHandles;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.text.Text;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.hud.ShortListHudElement;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.logging.ILogger;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class Queue extends ShortListHudElement {
   public int f4704;
   public BooleanSetting normal;
   public long f4706;
   public BooleanSetting priority;
   public int f4708;
   public static long f4709 = Class066.m4320(2765573712795358939L, 2054612456972605079L, MethodHandles.lookup().lookupClass()).m4325(67608059333864L);
   public static String[] f4710;
   public static String[] f4711;
   public static Object[] f4713 = new Object[71];
   public static String[] f4714 = new String[71];

   public void m9534() {
      Class568.f9131.execute(() -> {
         Queue var3 = this;

         try {
            var3.f4708 = m9535();
            var3.f4704 = m9537();
         } catch (Throwable var4) {
            ILogger var10000 = this.getLogger();
            Object[] var10002 = new Object[]{var4.getMessage(), null};
            boolean var10006 = true;
            var10002[1] = var4;
            var10000.warn("Unable to update queue length: {0}", var10002);
         }
      });
   }

   public static int m9535() {
      JsonArray var10000 = Class551.m17076(Proxy.NO_PROXY, URI.create("https://2b2t.io/api/queue?last=true"), Class551.f8907)
         .getAsJsonArray()
         .get(0)
         .getAsJsonArray();
      boolean var10003 = true;
      return var10000.get(1).getAsInt();
   }

   public Queue() {
      super("Queue");
      boolean var10014 = true;
      this.normal = new BooleanSetting("Normal", true);
      boolean var10013 = true;
      this.priority = new BooleanSetting("Priority", true);
      this.f4706 = System.currentTimeMillis();
      this.f4708 = -1;
      this.f4704 = -1;
      Setting[] var10001 = new Setting[]{this.normal, null};
      boolean var10005 = true;
      var10001[1] = this.priority;
      this.registerSettings(var10001);
   }

   public static int m9537() {
      JsonArray var10000 = Class551.m17076(Proxy.NO_PROXY, URI.create("https://api.2b2t.dev/prioq"), Class551.f8907).getAsJsonArray();
      boolean var10003 = true;
      return var10000.get(1).getAsInt();
   }

   @Override
   public Text[] getComponents() {
        return null;
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (System.currentTimeMillis() - this.f4706 >= TimeUnit.MINUTES.toMillis(1L)) {
         this.m9534();
         this.f4706 = System.currentTimeMillis();
      }
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
   public static void m273() {
      f4713[0] = "_fr<\u0000fC|p`\u001arS\u007f;ԛ";
      f4713[1] = "1T\u001fKWp>AGz\u000bq#L";
      f4713[2] = "J\u0004\u0003\u0012\u00000E\u0011[&|\u0017";
      f4713[3] = "n 20y\u0015p((\u007f\u001a\u0001t";
      f4713[4] = "k\u001c\u0001E\u001aDg\u0014\u0000\u000eSL{\u001c\u0002E7Xg\u001d)\u0007\u0018Fm\u001d\u0018";
      f4713[5] = "\u000b\u007fqE\r7\u0000p`\np/\u0013wiC";
      f4713[6] = "\u0006\u0006\u0000d\u000eR\n\u000e\u0001/GZ\u0016\u0006\u0003d#N\n\u0007,8\u001b\\\u001c";
      f4713[7] = int.class;
      f4714[7] = "java/lang/Integer";
      f4713[8] = "\u0007\u007f\u00146#\t\u001be\u0016j9\u001d\u000bf]{>\u000e\r#\u0010w<\u0011\tc\u00176!\u000e\u0007n\u0016k\"\u0015\u0006j][>\u0011\u0005l\u001d|\u0001\u000e\u0007n\u0016k\"\u0013\u001a";
      f4713[9] = "($9\u0017RN4>;KHZ$=pZLR\"8*\u0017AK.x8\\AO2$;\u0017CT*;?WD\u0015&$9\u0017pW&/;Kr^!3,\\NX\"";
      f4713[10] = "```>\\6|zbbF\"ly)ȵ";
      f4713[11] = "\u001b\u001d\u0015}\"4\u0007\u0007\u0017!8 \u0017\u0004\\0?3\u0011A\u00016$5\u001d\u0001\u0015}\u0012.\u001b\u0003\u00172>\u0012\u0011\u001b\u0006:>&";
      f4713[12] = "blb\u001fm6icsP\u00015gaq\u001f-";
      f4713[13] = boolean.class;
      f4714[13] = "java/lang/Boolean";
      f4713[14] = long.class;
      f4714[14] = "java/lang/Long";
      f4713[15] = "5m@!Gd)wB}]p9t\tlZc?1AjTe/mB!|W?~SzGt\u0019pIi\\v/mFmYt";
      f4713[16] = "\u0016\u0016@5u8?/\\/wd%;L,<u\"(Jias9.F)u8\u001e?[3{x*a";
      f4713[17] = void.class;
      f4714[17] = "java/lang/Void";
      f4713[18] = "Gz\f\u001e CLu\u001dQ]V^o\u001f\u0012";
      f4713[19] = "\u007fY8\t5ZaQ\"FWFfL";
      f4713[20] = "I\u0015aO/CB\u001ap\u0000NMI\u0011tZ";
      f4713[21] = "\n>\u0000i\u0016\u0012\u0016$\u00025\f\u0006\u0006'IɁ";
      f4713[22] = "rvY\"xh\u0007VR-i'fXY&m}\u0012";
      f4713[23] = "J\u001fugS\u0011??~hB^^1ucF\u0004*";
      f4713[24] = "x9\u000eK/+x9\u0019\u0017#$br\u0019\t#1e\u0003HPts";
      f4713[25] = "Zp\r-n7Zp\u001aqb8@;\u001aob-GJL16n";
      f4713[26] = "5s69sZ)i4eiN9j\u007fɣ";
      f4713[27] = "rTJf!\u0011nNH:;\u0005~M\u0003+<\u0016x\b^-'\u0010tHJf\u0000\u0001iRD&4";
      f4713[28] = "!\u007fV\u0015oI=eTIu]-f\u001fԊ";
      f4713[29] = "0b}9TF.jgv\u0019\\4`~*\bV4w%\u001d\u0002V9v\u007f7\b`?q}1\u0019V";
      f4713[30] = "5<Ew;4>3T8G-13Rty=";
      f4713[31] = "5\u0004B\u0018/U+\fXWbO1\u0006A\u000bsE1\u0011\u001a-hM:0Z\u0010u";
      f4713[32] = "\u0010\u0004Wuai\f\u001eU){}\u001c\u001d\u001e8\u007fu\u001a\u0018Durl\u0016XV>rh\n\u0004Uu{i\u001bXx.wY\u0013\u0013]>}h";
      f4713[33] = "2@Sk\u000fl.ZQ7\u0015x>Y\u001a&\u0012k8\u001cX*\u001a~4\\Sk4U2US \u000f";
      f4713[34] = "G\u0016>\u0019=\u0013L\u0019/VG\u0017_\u0018?\u0019q\u0013H";
      f4713[35] = "\u0016vyg\u000b(\nl{;\u0011<\u001ao0*\u0016/\u001c*r&\u001e:\u0010jyg0\u0011\u0016c";
      f4713[36] = "\u0015A5\u00020\b`a>\r!G\u0001o5\u0006%\u001du";
      f4713[37] = "'t]_\u0017a*%K3̉\u0007e$YV\u0016vj&[3N\u007f+o\u0013Q\u0007~ {\"\t\u001cg#oD\\\u0018nq\u001e\u0018B\u0013=}eAMM~\u001b";
      f4713[38] = ".\u000e#_0\u001f#\u0017*B\n\u001f.\u000b\u001bK0N-\u000ew_aN'g*M4\u0004x\u0003$VmHB";
      f4713[39] = "h-H`Oq*(\u00167(p1%R7o`XpDdZ4<~_=\u0016\u000eh-H`Oq*(\u00167(";
      f4713[40] = "#c\u001fD\u0014p$|\u0004\u000blџAc\u0014\u0015S+ybN\u0019\u001c";
      f4713[41] = "c&YG\u001b9e{\u0005\u0019j2k8\"O\u00052k>fNS4\u007f+VJ\u000b>;D";
      f4713[42] = "\b\u00039\u001c:u[\u0002h\u0010\\ժeO:\u0016?2\u0005\u0003u\u0002g\n";
      f4713[43] = "\u001eW9G\u001eQ\\G \\#Ӽ!Q>\u000eA\u000b\u001bB-\u000e\u001d7";
      f4713[44] = "=\u0018\u0016et20\u0001\u001fxN'68Tf'*Q\u0016\\x?b6@I-2[6\u0003Jmw<`\u0016\u001f`N";
      f4713[45] = "S%\u0018\u001bm+\u00115\u0001\u0000P˴l X\u0003n4V8Y\u0007.";
      f4713[46] = "'D@C\u001cFbR\u001dW~\u0018vQ\u007f\u0015A\u001ex\u0015\u001fY\u000e\n -EY\u001aM}V\u001cVD\u000e\u001b";
      f4713[47] = "&\u001b)\"6#d\u000b09\u000bӁ\u0019Jn3h}y\u0006!'0E";
      f4713[48] = ";!=\u0019R\u00164\u007f+\u0019n\u001e<t:\u001c\u0012\t+@6\u001b\u0012\u00057t g\u0004\u0003=ubW\u000eXne[\r\u0011U3'a\u001e\u0002Uo\u001b";
      f4713[49] = "f\u0015C5:bi\u0017AP\u001dTOwb\u0017\u000bB\u0018Q\u0002+>ri^\u0000)";
      f4713[50] = "Fm M\u0014^\u001fb~\u000erJ\u0011`\r\f3C\u0000\u001cyH\u001bFD|5\u0007\u000f\u001e|";
      f4713[51] = "\u0002nE\u001cUs\u0007dJ\u001ai.\u0000`U\u0003\u0005\u001cQ'\t[QKQ&\n\t\u00185\f!TZi+\u001ff\\\u0003\u000b/SzXd";
      f4713[52] = "\u0017{lEO_\u0011<cE&^\u001bzCGBL\u001b\u0006p\u0014\u001e^\u001fjdE\u001eTv";
      f4713[53] = "W5&/\u0016>\n\u007f*,v\u007firro\u001b\"\u0017/u1HSUtw=\u0007-\bs)nv";
      f4713[54] = "\u001cT(rh<\u0004\\hy\u00137\u0016\u0018Rzh#\u0012\u000bz\u0017/bD\tfire\u001aZ\u0017";
      f4713[55] = "<xt#0=f20#K?23jIwzd$}7*}:w\f.9$*pkx,q'If6z\"gsu%z~[";
      f4713[56] = "E\b-Pk\u001d\u0007\u00184KVŰz[,\u0012f\u0018\u0010\b8G,";
      f4713[57] = "\u000b\ns~\u00175I\u001aje*Ѿ4Yr<\u001a0^\nfiP";
      f4713[58] = "/,\u0007\u001e\u001cBf-\f\n-Kl9^\u0013@ *n\b\u0002\\^wiVQ-\u0019ndF^OPooRo";
      f4713[59] = "m,X4\u0003\"lvT{3w~*SvOw\u000e#SmOzv&FpL\u001ad8\ti\u000f w+\t53";
      f4713[60] = "\u001c\"\u0017\u0012M\t\u0001\"\u0010\u0011!\b\u001f\u0000\u0010\u0012E\u0015\u0003E\u0018NAJ\u0001\u007f\u0000OE\nx,I\u0016\u001f\rB4H\u0012_t";
      f4713[61] = "|\u0003e9`x%\f;z\u0006l+\u000eHxDx!\u0014Hy|j7r=j9h$Cx|d|F";
      f4713[62] = "/A\u001f8`h\"\u0010\tTԽ\u000e)@\u0000lqh|D\t>";
      f4713[63] = "]P\u0013,R<\\V\u0002,(b`\u0013@.E?\u001eNGp\u0016N\\\u0015E|Y0\u0001\u0012\u001b/(";
      f4713[64] = "1\u0015/\u0015!6,\u0015(\u0016M\u000e\u00144\u0014-\u0000\u0010U\u0016.\u0017)'(\u000b.\u0010*";
      f4713[65] = "Q\bc#z[\u0013\r=t\u001dN\u0006\u0003`ttB?\r`dp$P\u000f:k'@^\u0014c'\u001d";
      f4713[66] = "vY\u0002Of-4I\u001bT[ԷI\bE^8s)D\nJ`";
      f4713[67] = "9)$\b\u0007y{9=\u0013:Ļ\u0006xc\u0019Y'f4,\r\u0001";
      f4713[68] = "~$`l\u001e\r<4yw#єAu'}@S!9hi\u0018k";
      f4713[69] = "(>5=\\\rj.,&a\u0002\u00173\"}\u0004\u0014f0!5\u0006kv=u \u001e\u001au>=\"a";
      f4713[70] = "\u0007F\u001b$I\n\rG@i$^\u0011Y\u000bvBI0B\u0014vaT\bG\u0010`$\\TCOb\u001eDUG\u000f\u001b";
   }
}
