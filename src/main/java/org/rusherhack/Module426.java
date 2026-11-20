package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.command.baritone;
import org.rusherhack.command.bind;
import org.rusherhack.client.api.feature.hud.impl.Time;
public class Module426 extends Module {
   public BindSetting customKeyThatPausesBaritoneWhileHeld;
   public NumberSetting<Float> time;
   public BooleanSetting pauseBaritoneWhileTheServerSLagging;
   public static long f7081 = Class066.m4320(-1711828537620463030L, -8604002528206000385L, MethodHandles.lookup().lookupClass()).m4325(185315910120440L);
   public static String[] f7082;
   public static String[] f7083;
   public static Object[] f7085 = new Object[47];
   public static String[] f7086 = new String[47];

   @Override
   public ModuleCommand createCommand() {
      return null;
   }

   @Subscribe
   public void m13674(Event547 var1) {
      if (((IKey)this.customKeyThatPausesBaritoneWhileHeld.getValue()).isKeyDown()) {
         boolean var6 = true;
         var1.setCancelled(true);
      } else {
         if ((Boolean)this.pauseBaritoneWhileTheServerSLagging.getValue()
            && (float)(System.currentTimeMillis() - Class164.f3259.getLastUpdate()) > this.time.getValue() * 1000.0F) {
            boolean var10003 = true;
            var1.setCancelled(true);
         }
      }
   }

   public Module426() {
      super("Baritone", "Control Baritone settings", ModuleCategory.CLIENT);
      boolean var10010 = true;
      this.pauseBaritoneWhileTheServerSLagging = new BooleanSetting("LagStop", "Pause baritone while the server's lagging", true);
      this.time = new NumberSetting<>("Time", 3.0F, 1.0F, 10.0F);
      this.customKeyThatPausesBaritoneWhileHeld = new BindSetting("PauseBind", "Custom key that pauses baritone while held", NullKey.INSTANCE);
      boolean var10003 = true;
      this.pauseBaritoneWhileTheServerSLagging.addSubSettings(this.time);
      Setting[] var10001 = new Setting[]{this.pauseBaritoneWhileTheServerSLagging, null};
      boolean var10005 = true;
      var10001[1] = this.customKeyThatPausesBaritoneWhileHeld;
      this.registerSettings(var10001);
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
   public static void m157() {
      f7085[0] = "CBwL\u0011g_Xu\u0010\u000bsO[>\u0001\u000f{I^dL\u0002bE\u001ev\u0007\u0002fYBuL\u000e}HE|\u0007M_CTe\u000e\u0006QMDu\u0005\f`U";
      f7085[1] = "?mT*\u007f\u001e#wVve\n3t\u001dgb\u001951Qmc\u000f~tV}#%%s_Oh\u0012";
      f7085[2] = "&l\u000etCk:v\f(Y\u007f*uGȮ";
      f7085[3] = "\u0005C)\u001e\u0002\u0019\u000eL8Q\u007f\u0001\u001dK1\u0018";
      f7085[4] = "CD9]?[HK(\u0012SXFI*]\u007f";
      f7085[5] = boolean.class;
      f7086[5] = "java/lang/Boolean";
      f7085[6] = "\rX#|2\u001b\u0011B! (\u000f\u0001Ajљ";
      f7085[7] = "{\u001afP\tzg\u0000d\f\u0013nw\u0003/\u001d\u0014}qFr\u001b\u000f{}\u0006fP5zy\nd\f(j`\u001ch\u0010\u001c";
      f7085[8] = "\u0017\u0002108t\u000b\u00183l\"`\u001b\u001bx}%s\u001d^%{>u\u0011\u001e10\u0019d\f\u0004?p-";
      f7085[9] = "\b\r&,bR!4:6`\u000e; *5+\u001f<3,pv\u0019'5 0bR\u0000$=*l\u00124z";
      f7085[10] = void.class;
      f7086[10] = "java/lang/Void";
      f7085[11] = "_\u00058\fp\u0007C\u001f:Pj\u0013S\u001cqAn\u001bU\u0019+\fc\u0002YY,Gv\u0006Y\u00198\f@\u001b^\u0013\fGv\u0006Y\u00198";
      f7085[12] = "2\b\f\u0017\u0012\u0017.\u0012\u000eK\b\u0003>\u0011EZ\u000f\u00108T\u0018\\\u0014\u00164\u0014\f\u0017\"\r2\u0016\u000eX\u000e18\u000e\u001fP\u000e\u0005";
      f7085[13] = ">\u0014\u0014\u0013\"\u0018\"\u000e\u0016O8\f2\r]^<\u00044\b\u0007\u00131\u001d8H\u0015X1\u0019$\u0014\u0016\u0013=\u00025\u0013\u001fX~ >\u0002\u0006Q5";
      f7085[14] = "W}\nk\u000f\u001e~D\u0016q\rBdP\u0006rFScC\u00007\u001bUxE\fw\u000f\u001e_T\u0011m\u0001^k\n";
      f7085[15] = "$'1\u000783/( HP3!'3";
      f7085[16] = float.class;
      f7086[16] = "java/lang/Float";
      f7085[17] = "\u001c\u0018v0\\\"\u0000\u0002tlF6\u0010\u0001?}A%\u0016DdjG;\u0000DEwC2\u0001";
      f7085[18] = "A7=*)\u0005]-?v3\u0011M.tȂ";
      f7085[19] = int.class;
      f7086[19] = "java/lang/Integer";
      f7085[20] = "6cA`AX*yC<[L:z\bĪ";
      f7085[21] = long.class;
      f7086[21] = "java/lang/Long";
      f7085[22] = "v{L\u001b2\u0002jaNG(\u0016zb\u0005V/\u0005|'I\\.\u00137bNLn>RlR";
      f7085[23] = "^VO\u0012m\tUY^]\f\u0007^RZ\u0007";
      f7085[24] = "\u001cAB\u00061%\u0000[@Z+1\u0010X\u000bK,\"\u0016\u001d@^&>\u0007\u001dQQ35]vSM-$0RKK&<\u001fRGD&";
      f7085[25] = " V[g @+YJ(]U9CHk";
      f7085[26] = "\u0006f\u001f1\u000bIQ8@S&p)\u0010e\u000fmZSaA5\u0010\r\r>";
      f7085[27] = "JXlf8p\u001c\t,kD\u000053JO\u0002\n>h/6>!\u000fYyg~,";
      f7085[28] = "~d9V?~?xwIVǺG8;Jgjy88]+\u000e}?|\u000120}<kMV";
      f7085[29] = "a\u0001,Q7\u00040Y [O\u00013[-Z\b\u0011Z\u0004)\t(\u0015 A`T \u007fa\u0001,Q7\u00040Y [O";
      f7085[30] = "H\"\u0011WcX\u0005s\u000e_\u001dʥtsVU&_\u0006)\u0016@w";
      f7085[31] = "5N !\u0005`u\u0014'%;rg\u001f\u001f2Q@f\u000f8.]tpsu5\u0004q:\u0013|/Ky\u000bL}$Yam\u001e\">\u0000\u001b";
      f7085[32] = "=\r\u0001\u0002:\u0017(LE\u001e\u0000ȠQ[X\u0013mH+\u000e\u0006\rxy";
      f7085[33] = "9TD3\u0007\u00030XVb8\u00169\u0015l5C\u0005\t\u0011D5D\u0014T\u0004W6]\u0002(\u0011Z$\u0007y";
      f7085[34] = "/E\u001e*eub\u0014\u0001\"\u001bp\u0013\u0010\u0001x}pcQ\u001d6b\u0019*OX!rikS\u0016>\u001b";
      f7085[35] = "=\u0004\u000e=\u0000\\=\u0005]`lY0\u001b],2^0\u0001YP\u0006^:L\ri\fZ.\u001d4";
      f7085[36] = "#16^Fw*=$\u000fyɈNag]\u001624hkOG";
      f7085[37] = "'\tc\u00044j6\u001f#\u0007Zq2&\u007f\u0012\u0016w6\u0003\u0012X#..\u000fh\u001djs&e";
      f7085[38] = "wjn(2\u0007:;q LĥK6+&1\u0000%g{'7";
      f7085[39] = "E\b>*':\u0014P2 _+\u0019Q&!6' _&12AEO|+5;\u0000\u0006!#_";
      f7085[40] = "\u0002<\u0010[\u001f\u0014Om\u000fSaơ>`\u0004T\u0013C_5\rK_";
      f7085[41] = "_'pr%PWx!4ZL\u0003s 3&[\u0014G,4&W\bs:HkLQvp(bV\u001e~Awc]\ff'%<GU\u001c";
      f7085[42] = "\u0019M#]t \u0019Lp\u0000\u00185\u0019Qd]_%p_p^(rIUtJyK\u0019M#]t \u0019Lp\u0000\u0018";
      f7085[43] = "u3\u0016hH/%?X|(8\u001eeZ{\u0019p eYlU\u0014$b\u001d0L*$a\n|(";
      f7085[44] = "\u0003ffTRBC<aPlVP'\\S\bDP[m_SD]fy[\f\b=";
      f7085[45] = "5C\u0011\u0016\u000fX#O\u0011\u0000fL7Xe\u0019\u0000\\7@J\u001d\n7a]\u0010\u0017\fM$\u0014M\u001ff\bcOL\n\u0000Z<U\u0015p";
      f7085[46] = ")\u0003wm$!&\u0003\"?J24\u001fim,%\u0015\u0004vm\u000f8-\u0001r{J46\u000fv{6!;\u001d,\u0000";
   }
}
