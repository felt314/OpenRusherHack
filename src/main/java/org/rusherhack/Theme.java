package org.rusherhack;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.gui.screen.DisconnectedScreen;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.MessageScreen;
import net.minecraft.client.gui.screen.ProgressScreen;
import net.minecraft.client.gui.screen.TaskScreen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.option.GameOptionsScreen;
import net.minecraft.client.gui.screen.option.KeybindsScreen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.world.LevelLoadingScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.theme.ITheme;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;

import org.rusherhack.command.bind;
import org.rusherhack.client.api.feature.module.impl.client.ClickGUI;
import org.rusherhack.client.api.feature.module.impl.client.Windows;
public class Theme extends Module {
   public StringSetting classic;
   public StringSetting windows;
   public static Theme f5927;
   public BooleanSetting openanywhere;
   public StringSetting hud;
   public static long f5930 = Class066.m4320(8608528961950271029L, 7604606118939753022L, MethodHandles.lookup().lookupClass()).m4325(76285875058921L);
   public static String[] f5931;
   public static String[] f5932;
   public static Object[] f5934 = new Object[91];
   public static String[] f5935 = new String[91];

   public Theme() {
      super(
         "Theme",
         "Control the look and feel of RusherHack",
         ModuleCategory.CLIENT
      );
      this.classic = new StringSetting("ClickGui", "Classic").onChange(var0 -> {
         String var5 = var0;
         int var10000 = Class253.m9154();
         Hud388 var4;
         Iterator var7 = (var4 = Class170.f3364.m7115()).m12500().iterator();
         int var3 = var10000;

         while (var7.hasNext()) {
            Object var8 = var7.next();

            ITheme var6;
            while ((var6 = (ITheme)var8).getName().equalsIgnoreCase(var5)) {
               var8 = var4;
               if (var3 == 0) {
                  var4.m12504(var6);
                  return;
               }
            }
         }
      });
      this.hud = new StringSetting("Hud", "Classic").onChange(var0 -> {
         String var5 = var0;
         int var10000 = Class253.m9155();
         Hud388 var4;
         Iterator var7 = (var4 = Class170.f3364.m7115()).m12500().iterator();
         int var3 = var10000;

         while (var7.hasNext()) {
            Object var8 = var7.next();

            ITheme var6;
            while ((var6 = (ITheme)var8).getName().equalsIgnoreCase(var5)) {
               var8 = var4;
               if (var3 != 0) {
                  var4.m12507(var6);
                  return;
               }
            }
         }
      });
      this.windows = new StringSetting("Windows", "Classic").onChange(var0 -> {
         String var5 = var0;
         int var10000 = Class253.m9154();
         Hud388 var4;
         Iterator var7 = (var4 = Class170.f3364.m7115()).m12500().iterator();
         int var3 = var10000;

         while (var7.hasNext()) {
            Object var8 = var7.next();

            ITheme var6;
            while ((var6 = (ITheme)var8).getName().equalsIgnoreCase(var5)) {
               var8 = var4;
               if (var3 == 0) {
                  var4.m12505(var6);
                  return;
               }
            }
         }
      });
      boolean var10010 = true;
      this.openanywhere = new BooleanSetting("OpenAnywhere", "Adds the ability to open theme GUIs from any screen. Even the main menu!", true);
      f5927 = this;
      Setting[] var10001 = new Setting[]{this.classic, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.hud;
      var10001[2] = this.windows;
      var10001[3] = this.openanywhere;
      this.registerSettings(var10001);
   }

   @Subscribe(
      stage = Stage.PRE
   )
   public void m11819(Event090 var1) {
      int var4 = Class253.m9154();
      if ((Boolean)this.openanywhere.getValue()) {
         if (Globals.mc.currentScreen instanceof TitleScreen
            || Globals.mc.currentScreen instanceof OptionsScreen
            || Globals.mc.currentScreen instanceof GameOptionsScreen && !(Globals.mc.currentScreen instanceof KeybindsScreen)
            || Globals.mc.currentScreen instanceof GameMenuScreen
            || Globals.mc.currentScreen instanceof ProgressScreen
            || Globals.mc.currentScreen instanceof DownloadingTerrainScreen
            || Globals.mc.currentScreen instanceof LevelLoadingScreen
            || Globals.mc.currentScreen instanceof TaskScreen
            || Globals.mc.currentScreen instanceof MessageScreen
            || Globals.mc.currentScreen instanceof DisconnectedScreen
            || Globals.mc.currentScreen instanceof DeathScreen
            || Globals.mc.currentScreen instanceof ConnectScreen
            || Globals.mc.currentScreen instanceof SelectWorldScreen
            || Globals.mc.currentScreen instanceof MultiplayerScreen) {
            Object2ObjectMap var8 = Class170.f3364.m7119().getBindRegistry();
            if (var1.m5028((IKey)var8.get(ClickGUI.f1878))) {
               ClickGUI.f1878.onKeybindEvent();
            } else if (var1.m5028((IKey)var8.get(Windows.f8104))) {
               Windows.f8104.onKeybindEvent();
            } else {
               for (Window var7 : Class170.f3364.m7121().getFeatures()) {
                  while (var1.m5028((IKey)var8.get(var7))) {
                     Windows.f8104.onKeybindEvent();
                     var7.onKeybindEvent();
                     if (var4 == 0) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   @Subscribe(
      priority = 10
   )
   public void m11822(Class263 var1) {
      Theme var5 = this;
      Iterator var10;
      Iterator var10000 = var10 = Class170.f3364.m7115().m12500().iterator();

      while (var10000.hasNext()) {
         ITheme var9;
         if ((var9 = (ITheme)var10.next()).getClickGuiHandler() != null) {
            boolean var10003 = true;
            var5.classic.addOptions(var9.getName());
         }

         if (var9.getHudHandler() != null) {
            boolean var12 = true;
            var5.hud.addOptions(var9.getName());
         }

         if (var9.getWindowHandler() != null) {
            boolean var13 = true;
            var5.windows.addOptions(var9.getName());
         }

         Class274 var6 = new Class274(var5, var9.getName());

         Iterator var7;
         for (Iterator var11 = var7 = var9.getSettings().iterator(); var11.hasNext(); var11 = var7) {
            Setting var8 = (Setting)var7.next();
            boolean var14 = true;
            var6.addSubSettings(var8);
         }

         boolean var15 = true;
         var5.registerSettings(var6);
         var10000 = var10;
         var9.initialize();
      }
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
      f5934[0] = "m\u0006*6X]s\u000e0y?\\b\u0015=#\u0019Z";
      f5934[1] = "u6U\u0012(%~9D]I+u2@\u0007";
      f5934[2] = "jJ>J:\u000evP<\u0016 \u001afSwɢ";
      f5934[3] = int.class;
      f5935[3] = "java/lang/Integer";
      f5934[4] = "GOH2(/YGR}U?Y";
      f5934[5] = "qV@U\u0019amLB\t\u0003u}O\tĐ";
      f5934[6] = "\u0018ur/Q\b\u0004opsK\u001c\u0014l;ο";
      f5934[7] = "x\u0013\nMg]d\t\b\u0011}It\nC\u0000zZrO\u0004\raMe\u0007\f\u0000p[9(#\u0002xMs";
      f5934[8] = "]><`&PV1-/[HE6.f";
      f5934[9] = boolean.class;
      f5935[9] = "java/lang/Boolean";
      f5934[10] = "\b\u0018o\n]X\u0014\u0002mVGL\u0004\u0001&GCD\u0002\u0004|\nN]\u000eD}M\u0001Y\u000f\u000feA\u0001d3\u0002mIJ";
      f5934[11] = void.class;
      f5935[11] = "java/lang/Void";
      f5934[12] = "[w?\u0002G~Gm=^]jWnvOYbQk,\u0002T{]+>IT\u007fAw=\u0002XdPp4I\u001b_[b?@PjVi=aZoAi=";
      f5934[13] = "\bg\u0013\u0011cI\u0003h\u0002^\u0004Q\u0007t\u0004\u0012!@";
      f5934[14] = "gl&\\w\u000b{v$\u0000m\u001fkuo«";
      f5934[15] = "\u0012be\bw\u0007\u000exgTm\u0013\u001e{,Ej\u0000\u0018>`Ok\u0016S{g_+;6u{";
      f5934[16] = "n\u001eO\u0019z9r\u0004ME`-b\u0007\u0006ξ";
      f5934[17] = "[L_=wkGV]am\u007fWU\u0016ɧ";
      f5934[18] = "?\u0000Yp\u0001\u000b#\u001a[,\u001b\u001f3\u0019\u0010=\u001f\u00175\u001cJp\u0012\u000e9\\X;\u0012\n%\u0000[p\u0004\u0017>\u0016Q)])9\u001cZ1\u0004";
      f5934[19] = "w9P\r\u001bhk#RQ\u0001|{ \u0019и";
      f5934[20] = "1 U\u007f>J-:W#$^=9\u001c?";
      f5934[21] = "<f\u0015?H\u00117i\u0004p$\u00129k\u0006?\b";
      f5934[22] = "tX[\u0016\u007f@hBYJeTxA\u0012[a\\~DH\u0016lEr\u0004{TbWzFO";
      f5934[23] = "U\u0010{u\fGU\u0010l)\u0000HO[l7\u0000]H*<jQ";
      f5934[24] = "$\u0017g\b\u0012\u0004$\u0017pT\u001e\u000b>\\pJ\u001e\u001e9-'\u0015H";
      f5934[25] = "\u0007T]IEC\u001bN_\u0015_W\u000bM\u0014\u0004XD\r\bX\u000eYRFdS\tS{\tH[\u0000RD*GI\u0002";
      f5934[26] = "5)\" K\u001614\"1V\u0016r;m&Q\n(4`{J\u001d68o!VQ\u0013?f0F\u000bn\u0012n?@\u001c(\u0010m%";
      f5934[27] = "4\u007f\u0000$6\b(e\u0002x,\u001c8fIi+\u000f>#\u0014o0\t2c\u0000$\u0006\u00124a\u0002k*.>y\u0013c*\u001a";
      f5934[28] = "\u007f+\u0002E'Vc1\u0000\u0019=Bs2K\u0383";
      f5934[29] = "(E\u0015\u0011us4_\u0017Mog$\\\\ҥ";
      f5934[30] = "I\u001e(z\u001c>U\u0004*&\u0006*E\u0007a7\u00019CB<1\u001a?O\u0002(z=.R\u0018&:\t";
      f5934[31] = "9+6\f\u00125%14P\b!52\u007fA\f)37%\f\u00010?w$KN(#=\u007fj\u0015$\u001e8?F\f%$\u001b0Q\u0005";
      f5934[32] = "34A\u0005es/.CY\u007fg?-\bH{o9(R\u0005vv5hSB9v=(CG9V=(CG_g2\"JNeD=5C";
      f5934[33] = "3\u001c0i\u0019\u0018\u001a%,s\u001bD\u00001<pPU\u0007\":5\rS\u001c$6u\u0019\u0018;5+o\u0017X\u000fk";
      f5934[34] = ")y^_QI5c\\\u0003K]%`\u0017\u0012LN#%J\u0014WH/e^_pH4bW\u0016pY2\u007fP\u001fD";
      f5934[35] = "\u001a\u001e,%_'o>'*Nh\u0012&4-G!z";
      f5934[36] = "\u0015\u0000c\u001bqb\u000b\byT\u0013~\f\u0015";
      f5934[37] = "`mB\u000e0(|w@R*<lt\u000bC-/j1CE#)zm@\u000e\u000b\u001bj~QU08LpKF+:zmDB.8";
      f5934[38] = "E]x]EcYGz\u0001_wID1\u0010[\u007fOAk]VfC\u0001y\u0016Vb_]z]ZyNZs\u0016\u0019[EKj\u001fR";
      f5934[39] = "ufLV\u001b\u0007\\_PL\u0019[FK@ORJAXF\n\u000fLZ^JJ\u001b\u0007}OWP\u0015GI\u0011";
      f5934[40] = "Wf2<|>K|0`f*[\u007f{qb\"]z!<o;Q: { <Qz1}yeo};va<pu;vb.JV4ak";
      f5934[41] = "6ZX\u0004\u001a)*@ZX\u0000=:C\u0011I\u00045<FK\u0004\t,0\u0006YO\t(,ZZ\u0004\u00053=]SOF\u00116LJF\r\u001f8\\ZM\u0007. ";
      f5934[42] = "\u00136\u00079\u0007q\r>\u001dvOq\u00174\u00051FjW\u0014\u001e6Zq\u00142\u0003";
      f5934[43] = "Rof\"\\?\u0003`oAQ=\u001cr\u0014x\bj\u0012nz3F1\u000e\u000e";
      f5934[44] = "\u0000z.EeB\u001avxJ\fe?Y\u0005=P.\u0000z.EeB\u001avxJ";
      f5934[45] = " \u0004\u0004?okp\b\t5\u0006ʶJ^\t9=z2\u000e\u000547";
      f5934[46] = "\u001c\u00113'\u001c#OH7\u007fc2\u0018\u0011*/$\"qK'}\u00193J\r,-RL\u001c\u00113'\u001c#OH7\u007fc";
      f5934[47] = "\u001eV\u001el[X\u0017MZtaՃ'\u0010\fi\b_J\u001b\u0013y\u000f#";
      f5934[48] = "k Rh\u001arb;\u0016p ɐRf@mIu?m_}N\t";
      f5934[49] = "r\u0014\u001c'N\n1\u000f\u001b/u\u00144\u0004\f\"\t\u00122iH*\u0007\u0016#\u0006\u0019%\u000eu";
      f5934[50] = "L4P\n\u007f\u0011\u0016l\\[\u0015ϔp3WZy\u0000\u000bi\u000fV(";
      f5934[51] = "$\u001d\u0005Wff$E\nI\u0007Ҡ\u0018\u0018\u0016Lk,g[\rKc\u0017";
      f5934[52] = "\u0014]\u0007/xUT^\u000e=\u0018UEPx-}W(\u0011[{t\u0003JQB\u007fj:";
      f5934[53] = ";c@]`gd(XC\u0006и\nqQ_95xx\u0019E|_4h\u001eEydrcN\u000e\u0006";
      f5934[54] = "3Dt\n\u0015-qIt\u0016d'jKv\u0014\r\"mXguT|0Ig\u000b\u001b4p\u0017\n";
      f5934[55] = "!\bUj/`2\b\u00022HԛL\\Vksl'OV<+";
      f5934[56] = "\np\u0018\u0012DdZ|\u0015\u0018-ƨ`&XY\u0015f\u0000pOYW";
      f5934[57] = "yX\u0011vh()T\u001c|\u0001¹\u0013\u000eQ=9*sXF={";
      f5934[58] = "\u0002\u0004#\u001aN\u0002\u0011X!A4\u0014\u0017\u001e\u0015HH\u0007\u001b\u0004!^4\u0003F\u000f#XR\u0001\u001fY4%";
      f5934[59] = "\u000eQ <<U\f\u0012+:CH\u0002\u0015\u0001!%K5\u0004$!8[\u0015\u0018K!sI\u0012\u0002)x \u0019\fi";
      f5934[60] = "&:$V}Mv6)\\\u0014øLh#\\z\b+w)]n";
      f5934[61] = "aT\u001dV\u0019P7C\u001d\u0014cWab\r\u0007\u0005_j)\u0011\f\r]dP\f\u0002\u001aB\u0007O\u0010\u001e[Jg\u0019\u0007\u001e\u00190";
      f5934[62] = "uB\tci\u000f,\u0011Y}\u0002\u0002y\u000eg'=Wj\u0012\tls\fvr^!8\u0013t\u001c\u0015oc\u000f\u0014";
      f5934[63] = "\u000ba\u0001Pv Q9\r\u0001\u001cǏ79\u0007\u0002n:T*^^\"[";
      f5934[64] = "[\bnj\u001cK\u0001Pb;vǡg_=?\u001cQ\u0007\u00024lH0";
      f5934[65] = "`_\u000ex2-zF\u000fxNҢ\u0003DO /a3^V!/";
      f5934[66] = "HOcxZ>\bVgfc1\fW5p\u0018\u001d\u001aL;n\u000e\u0017\u001cQ1\u0014^9JFev\u001e NX\\*\u0013c\u000fUgl\u00183D*";
      f5934[67] = "jT\\'\u0010[q\u0016_0pZdTn\"\u0014Hd(\ttJKiFB:\u0011W\t";
      f5934[68] = "\u000bFS>\u000ew\u000b\u001e\\ ož7FS1\u0010w\\\u0004^1\f\u0006\u0007C\u0001,\u0002xH\u000bAro";
      f5934[69] = "N\u0007\u0003]Em\f\n\u0003A4i\u001c\u0015=_XF\u0018\u000f\u0011FY|q\r\u0004BJkK\u0015\u0018I[\u0006";
      f5934[70] = "Si\u0007\"|\u001cIv\u0012v\u0004Ƃ9)\u0010 hO[i\t$vv\u0004qJs=\u0014DhNm\u0004";
      f5934[71] = "Xz\u0007:C\u0012\u0002q[-:\u0012\u000e@\f5P\u0014\u000eo,:W\u0013\u0014\u0003Q~\u0006\u0016\u0005}\u001e6FHh";
      f5934[72] = "D_\u001c]\u0014r\u0006R\u001cAev\u0016M)F\u0004r\u0018~\u001fC%p\u001d]\u0006O\u001f\u0019\u001eI^\\TgBV\u0019Ie";
      f5934[73] = "^\u001a1}\u001a}EX2jzzQ\n\u0006l\u0010HP\u001a!p\u001c|Ff'z\u0007oW_?~Eh=Vg-\u0019~C\u0019/mG\u0013";
      f5934[74] = "\u001frUj<tKqC|ZnRv^e&hT\u001b\u001am(lEtKb!\u000f";
      f5934[75] = "Fl\u00177u \u0010{\u0017u\u000f)L} ws!Gw\u001c\u000fh9\u0019s\tdt0\u001epg?5|C|\u0019p}<\u001d\u0011";
      f5934[76] = "#>#@\u0014rs2.J}cIdc\t@r#~|\u001c\u0014\n#slF\u0005`9ly\u0012}";
      f5934[77] = "O&\u000bE,AM\u007f]RQFKw\u001cA-@M\u001aXI#D\\u\tF*'";
      f5934[78] = "pj(Y[^+/)@jU}V~L\u0000S}y^C\u0007Tg\u0015#\u0007VQvklO\u0016\u000f\u001b";
      f5934[79] = "g _\u0018\u0010?:)\fLq0f3(\u001f\u0018#v5\u000b\tqnb>\u0000\u0014\n:a(\u0016r";
      f5934[80] = "\u001do5\\\u001a#G79\rpЩ!h6^\u00019PhnQ\u001fX";
      f5934[81] = "U*8Q1\\\u0006s<\tNY_)8Y'Uf'8I#3\u0006>cN1\b@53\u0005N";
      f5934[82] = "B<\u0007\\J\rF/E\u0005'TG^R\t\u0017\u0000\u00110VU@C";
      f5934[83] = "iOKQ?\u001cm\u0013\u001c\u0012\u0002\u001cg\u0012\u001f\fUK9BF`bO=\u0019B\u0018h\u0016}\u0012";
      f5934[84] = "z9\u001b\u000eLgza\u0014\u0010-ώF9\u001b\u0001Rg-{\u0016\u0001N\u0016v<I\u001c@h9t\tB-";
      f5934[85] = "\u000b\u0019UL\\)\r\\R\u0001l,\u001f\u000fU\u000b\u0010;\b;Y\f\u00107\u0014\u000fOp\u0016=\u000f\u001c^I\u000e9M\u001b4@Vj\u0011\rJ\u000f\u001e*O`";
      f5934[86] = "\u001cbY\u0005[H^oY\u0019*LNpx\u001bLODsg\u0013LOGa]zPRA0D\u0000X\u001eRg'";
      f5934[87] = "OLdZ\u00190\u001f@iPp\u0018%\u001a$\u0011H2EL3\u0011\n";
      f5934[88] = "5j+y_\t<qoaeΉ\f+2?\tKnk+;\u0017r1shl\\\u0010qjlre";
      f5934[89] = "\u0010X\u0016\u0001niAW\u001fbeoU\u007f\t\u0012y\u0006\u0010I[\u0018z=VB\u000bS\u0005";
      f5934[90] = "S\u0017ywPmSOvi1ϳo\u0017yxNm\u0004UtxR\u001c_\u0012+e\\b\u0010Zk;1";
   }
}
