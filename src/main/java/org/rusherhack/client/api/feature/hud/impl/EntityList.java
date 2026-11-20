package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.world.EventEntity$Add;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.clear;
public class EntityList extends ListHudElement {
   public Int2ObjectMap<Entity> f6903;
   public BooleanSetting combineallitems;
   public BooleanSetting distance;
   public BooleanSetting metadata;
   public Targets f6907;
   public BooleanSetting pops;
   public BooleanSetting health;
   public ColorSetting f6910;
   public BooleanSetting ping;
   public boolean f6912;
   public BooleanSetting combineduplicates;
   public static long f6914 = Class066.m4320(2822072777336131359L, -4138474045533958563L, MethodHandles.lookup().lookupClass()).m4325(32692425997631L);
   public static String[] f6915;
   public static String[] f6916;
   public static long[] f6918;
   public static Integer[] f6919;
   public static Map f6920;
   public static Object[] f6921 = new Object[111];
   public static String[] f6922 = new String[111];

   public boolean m13282(Entity var1) {
      if (var1 != null && this.f6903.containsKey(var1.getId()) && this.f6907.m7993(var1)) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Subscribe
   public void onAdd(EventEntity$Add var1) {
      this.m13288(var1.getEntity());
   }

   public void m13285() {
      EntityList var4 = this;
      int var10000 = Class253.m9154();
      this.f6903.clear();
      int var3 = var10000;
      Iterator var6;
      Iterator var7 = var6 = WorldUtils.getEntities().iterator();

      while (true) {
         if (!var7.hasNext()) {
            var4.getMembers().clear();
            var4.f6912 = true;
            break;
         }

         Entity var5 = (Entity)var6.next();
         if (var3 != 0) {
            break;
         }

         var7 = var6;
         var4.m13288(var5);
      }
   }

   public EntityList() {
      super("EntityList");
      boolean var10005 = true;
      this.combineduplicates = new BooleanSetting("CombineDuplicates", true).onChange(var1x -> {
         this.m13285();
      });
      this.combineallitems = new BooleanSetting("CombineAllItems", false).onChange(var1x -> {
         this.m13285();
      });
      Targets var10000 = new Targets();
      var10005 = true;
      var10000 = var10000.m9192(true, false, false, false, false);
      boolean var10004 = true;
      var10000 = var10000.m9206(true, false);
      boolean var10003 = true;
      this.f6907 = var10000.m9207(true).m9201(false).m9202(false).m9203(false).m9195(this::m13285);
      boolean var10010 = true;
      this.metadata = new BooleanSetting("Metadata", true);
      this.health = new BooleanSetting("Health", false);
      int var10009 = 1;
      this.distance = new BooleanSetting("Distance", true);
      this.ping = new BooleanSetting("Ping", false);
      this.pops = new BooleanSetting("Pops", false);
      int var10007 = 255;
      var10009 = 255;
      this.f6910 = new EntityListColor(this, "Color", new Color(var10009, var10007, var10009)).setVisibility(() -> {
         if (!RusherHackAPI.getHudManager().isThemeColorSynced()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      }).setAlphaAllowed(false);
      this.f6903 = new Int2ObjectOpenHashMap();
      var10003 = true;
      this.combineduplicates.addSubSettings(this.combineallitems);
      BooleanSetting var5 = this.metadata;
      Setting[] var10001 = new Setting[]{this.health, null, null, null, null};
      var10005 = true;
      var10001[1] = this.distance;
      var10001[2] = this.ping;
      var10001[3] = this.pops;
      var10001[4] = this.f6910;
      var5.addSubSettings(var10001);
      var10001 = new Setting[]{this.combineduplicates, null, null};
      var10005 = true;
      var10001[1] = this.f6907;
      var10001[2] = this.metadata;
      this.registerSettings(var10001);
   }

   @Override
   public boolean shouldUpdateAlignment() {
      if (super.shouldUpdateAlignment() && this.isDragging()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Subscribe
   public void onLoadWorld(EventLoadWorld var1) {
      this.m13285();
   }

   @Override
   public void onEnable() {
      this.m13285();
      super.onEnable();
   }

   public void m13288(Entity var1) {
      if (var1 != null && this.f6907.m7993(var1)) {
         this.f6903.put(var1.getId(), var1);
         this.f6912 = true;
      }
   }

   @Override
   public void tick() {
        
    }

   @Subscribe
   public void onRemove(EventEntity$Remove var1) {
      this.f6903.remove(var1.getEntity().getId());
      this.f6912 = true;
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
      f6921[0] = "i\u001c-YZGu\u0006/\u0005@Se\u0005dΙ";
      f6921[1] = void.class;
      f6922[1] = "java/lang/Void";
      f6921[2] = "jOvq\nJvUt-\u0010^fV?ə";
      f6921[3] = int.class;
      f6922[3] = "java/lang/Integer";
      f6921[4] = "TV\u0006N3:HL\u0004\u0012).XOO\u0003-&^J\u0015N ?R\n3\u00152'^V)\u0001\"$zt(";
      f6921[5] = ".\u0011[n\u001dF2\u000bY2\u0007R\"\b\u0012#\u0003Z$\rHn\u000eC(MO9\u001cG$\u000e\u0012\t'F%.].\u000eT$\u0011";
      f6921[6] = boolean.class;
      f6922[6] = "java/lang/Boolean";
      f6921[7] = "8>\u001e\rIY$$\u001cQSM4'Wɗ";
      f6921[8] = "O$\\\"XMS>^~BYC=\u0015Ȅ";
      f6921[9] = "\u0013n#S\u0000p\u0018a2\u001c|i\u0017a4PBy";
      f6921[10] = "e\u0001K\u0007rDn\u000eZH\u001eG`\fX\u00072";
      f6921[11] = "(S\u0002%P\u00044I\u0000yJ\u0010$JKhM\u0003\"\u000f\u0016nV\u0005.O\u0002%`\u001e(M\u0000jL\"\"U\u0011bL\u0016";
      f6921[12] = "Ge\u0014\f\u001eN[\u007f\u0016P\u0004ZK|]A\u0003IM9\u0000G\u0018OAy\u0014\f?^\\c\u001aL\u000b";
      f6921[13] = ",g$\u0012\u001fQ\u0005^8\b\u001d\r\u001fJ(\u000bV\u001c\u0018Y.N\u000b\u001a\u0003_\"\u000e\u001fQ$N?\u0014\u0011\u0011\u0010\u0010";
      f6921[14] = "Y\tql\u0011\u0003E\u0013s0\u000b\u0017U\u00108!\u000f\u001fS\u0015bl\u0002\u0006_Ue'\u0017\u0002_\u0015ql \u0019Z\u0014d\u0011\u0006\u0002B\u0012x%";
      f6921[15] = "Wd(\u0003F,K~*_\\8[}aN[+]8,BY4Yx+\u0003Q![s?Y]6Vean[4Uw!Iq![s?Y]6V";
      f6921[16] = "\r\\b.Z\u0002\u0006Ssa'\u001a\u0015Tz(";
      f6921[17] = "tSpj\u0010whIr6\ncxJ9'\rp~\u000fq!\u0003vnSrj+D~@c1\u0010gXNy\"\u000benSv&\u000eg";
      f6921[18] = "hwk\fmpANw\u0016o,[Zg\u0015$=\\IaPy;GOm\u0010mp`^p\nc0T\u0000";
      f6921[19] = "e`Q}\u000bK{hK2CKabSuJP!BHrVKbdU";
      f6921[20] = "\u0017_k%+?\tWqjc?\u0013]i-j$S|r+i/\u001cPN1u:\u0011Wx6";
      f6921[21] = "zt:\u001e\u0016{fn8B\fovmsS\u000b|p(>_\tcth9\u001e\u0001vvc-D\ra{ust\r}eg)S\fKme8@\u0010gzh";
      f6921[22] = "\u0005|ZK\u0007(\u001bt@\u0004`)\noM^F/";
      f6921[23] = "dta\u001f(\u000bo{pPI\u0005dpt\n";
      f6921[24] = "|o7}\u0016Ixr7l\u000bI;}x{\fUaru&\u0011Nah7A\u0016T'T{b\u001dCaVxx";
      f6921[25] = "\u001a29l\u0017\u0011\u0004:##u\r\u0003'";
      f6921[26] = "0j\u0005\u001a\u0015\u00130j\u0012F\u0019\u001c*!\u0012X\u0019\t-P@\u0006AM";
      f6921[27] = "^t`\u0007%)Bnb[?=Rm)J;5Ths\u00076,X(aL6(Dtb\u0007?)U(K@$(yscl;9\\ci]";
      f6921[28] = "{Su\u000fozgIwSunwJ<BqfqOf\u000f|\u007f}\u000fgUtcg\u000fENocptfHq|";
      f6921[29] = "Z\u00076<\u0016IF\u001d4`\f]V\u001e\u007fq\bUP\u001b%<\u0005L\\[4d\u0001RA\u0006\u007fe\u000bNY\u0011\u007fW\u0012Y[\u0001\u0014|\u0010UA\f";
      f6921[30] = "\u001f,\u0000Uf4\u00036\u0002\t| \u00135I\u0018x(\u00150\u0013Uu1\u0019p\u0001\u001eu5\u0005,\u0002U|4\u0014p+\u0012g58+\u0003>x$\u001d;\t\u000f0\r\u0019-\u00132`$\u001d";
      f6921[31] = "@>U\u001eY\u0002@>BBU\rZuB\\U\u0018]\u0004\u0010\u0002\rR";
      f6921[32] = "<V8v}s7Y)9\u0010s7D=";
      f6921[33] = "xNW\u0011l&xN@M`)b\u0005@S`<et\u0012\n5}";
      f6921[34] = "J\u001eSx\u001cKJ\u001eD$\u0010DPUD:\u0010QW$\u0016aH\u001b";
      f6921[35] = "'W&l:*;M.0 >+No!$6-K5l)/!\u000b'')+=W.l *,\u000b\t7,\u001a$@,'&+";
      f6921[36] = "<MZd\"} WX88i0T\u0013˜";
      f6921[37] = "Q\u0000\u001985EU\u001d\u0019)(E\u0016\u0012V>/YL\u001d[c4NR\u0011T9(\u0002w\u0016](8X{\u001b[!>OL\u001dX#";
      f6921[38] = "\u00046\u000f&%{\b>\u000emlw\b4\u000fg,:\u00046\u000ed'w\u0013w.a1`\u0014";
      f6921[39] = "08o^\u0010o;7~\u0011ww?+x]Rf";
      f6921[40] = "aC\u007f|\u0019\u0005\u007fKe3v\u0002yCpQ^\u0003\u007f";
      f6921[41] = "~.SW@\u000fb4Q\u000bZ\u001br7\u001aџ";
      f6921[42] = "i(\u0017]9Wi(\u0000\u00015Xsc\u0000\u001f5Mt\u0012RDm\f";
      f6921[43] = "\u0002\u001eEn\u001cK\u001c\u0016_!qQ\u0004\u0013VlFW\u0007\u0011";
      f6921[44] = "\b1AXz\u000f\u0014+C\u0004`\u001b\u0004(\bȦ";
      f6921[45] = "Mz1\b\n\u0015Q`3T\u0010\u0001AcxE\u0017\u0012G&%C\f\u0014Kf1\b=\u000eWe\u0005C\f\u0014Kf1";
      f6921[46] = "\u00159W\"(\u0018L!X7\u0010Ԧ(yW6kZI\u007f\r,jb\u00159W\"(\u0018L!X7\u0010";
      f6921[47] = "Wj\u0016\u007fC6\u00143V{-9\u0001g\u0017uj)h?\u0012gG.\u0016xR`\u0015GWj\u0016\u007fC6\u00143V{-";
      f6921[48] = "+M8\u001e\u00172 Z/}ɯT \u001cj\u0000\\+-\u001ec\u0016";
      f6921[49] = "&\u0004\n-{\u001e-\u0013\u001dNӇx!\u0015\u001e$h\u0006fU\u0019v";
      f6921[50] = ".G\u007fnpjpM bL< @\tu021MDrsj(Y(}58<<";
      f6921[51] = "c#m@\tCh4z#Ί%hr?^BZep6H";
      f6921[52] = "\u007fI\u00187IGo\u0005\n58Rr^\u001f*U(pUI-YMr[\u001428\u0014gD\u0012=FS'C@T";
      f6921[53] = "(Uq\u001a>p2\u0016>K\u0007r%BAD9`r\u0017;_ir5.9^b{3N(Da\u001b";
      f6921[54] = "_`\u007f\u0000\u0007|Q'%@kjXp'F\u0017}OD+A\u0017qSp==\u0007+Gy)M\btPmFE\u0015uUe&T\u000fv5";
      f6921[55] = "=;z*[\u00052}(>>\f1x#(R>a4}s>\r&:9 Y\fl: O";
      f6921[56] = "s_WGvp)\u001fO\u001d\njt\tRDkgh,C\\\n;|\u0001MF;1~_\u0014-6yl\u0005GSq9kW.";
      f6921[57] = "\u0001\u0013I:JW\n\u0004^YY1\u0007G\u001b5AZ\u0003BX)0\f\u0007CN([\b\u0002\u0000RY";
      f6921[58] = "}e\u0017Q'\u000e<l\u0017\u0004JӔ\u0005c\u0017\u0002-\u000186\u0014G4";
      f6921[59] = "+Q\u0011\u0016\\\u0001;\u001d\u0003\u0014-\u0005/N\u0018\u000f-\u00165F\u0011\u000fM\u0007/Eq";
      f6921[60] = ")#YoEescA59j w]hB\u00140)Ld\u0006/8n\u001fi9";
      f6921[61] = "d;m)\u001cLa=-p\u007fՊ\u001f$1|\u000e\tde=\u007f\u001f";
      f6921[62] = "\u0010j)\u001cxcJ*1F\u0004h\u001d?7\bi\u0012J5>\u0015o#@7`L\u0004}\u001ek)\u0017a\u007f\u001066v";
      f6921[63] = "CmP.\u0007&HzGMǳ@Ix\u0004\"\u0011.\u0004?^u";
      f6921[64] = "$d\u001cQ\u001aH%n\u001c\nbHr\"f\u0010\u000ebv8O\u0002\u000f]\u001feF\u0012\u000fLs$\u001d\u000e\u0000'";
      f6921[65] = "u\u0016H\f\u001d\t4\u001fHYp̌\r\u0015F\u0005\u0013\u0005b\u0005\n\u0017\u0011";
      f6921[66] = "\u0019If\u000bDT\u0012^qha2\u0012\u00184\u0015\u000fM\u001f\u001a=\u0003";
      f6921[67] = "\u0012o~k\u001bB\u001d),\u007f~K\u001e,'i\u0012yNn}>~\u0014\u001c>$eO\u001e\u001e`}\u000e";
      f6921[68] = "8aNNG\u007fn!\u0006^z%3mW@\u0016\u0017e(\n\u0018F@\"vXVG;cz[Gz|&n]N\u0004;fi\u000f'";
      f6921[69] = "4\u0012'J\u0015#yU}\u001dy6h\u0012FD\u0002,o\u000f|D\u0005<\u0005\u0002eWG uT`X\u0015M4\u0012'J\u0015#yU}\u001dy";
      f6921[70] = "\u0018\u0012)<\u0005'L\u0000\"5c;\u001f\u0012\u001d*\u0013'vU#8\t2\b\u0012c?[[";
      f6921[71] = "Y>WA\u007f7\u0003~O\u001b\u0003-]cGQ\u0003>GkNQc/]h.";
      f6921[72] = "1T8Y\u0013h-\u000f-Es._\u0004.\u0004Oed\u001c4\u000e\u0001\u00025\bx\b\u00149-\u0012rFs";
      f6921[73] = "\u0019\u001c?\u0013\"\u0011\u0012\u000b(pӌw\u0012Mm\ri\b\u001fOd\u001b";
      f6921[74] = "\u0002\u0010u\u0017QAV\u0002~\u001e7[\u0001\u001b{lXS]\u0012f\tZ]\u0000\r\u0007";
      f6921[75] = "{P8!_\fk\u001c*#.\nwNX-@RbC=/N\u000f}\"d:Q\tr\\#zV[\u001b";
      f6921[76] = "u<k'u}! y1MձLez-.z}oxsw\u0011";
      f6921[77] = "%D\u0006,@\fqX\u0014:xȹ\u001c\u001d\u0017&\u001b\u000b-\u0017\u0015xB`";
      f6921[78] = "npb1\u0001\u0015t3-`8\u0015ho5q}\u0019cfRu\u0007Oup)3\u0003Ct";
      f6921[79] = "\u0004<`<]\u0014\u000f+w_ɄrG+n?]\u0012V1m_";
      f6921[80] = "t[e*\u0003'\u007fLrIƇA.\r7,\u001c-!Ke8y91Wn3\u0019(+T\u000e";
      f6921[81] = "\u0018\u000bK!X\t\u0013\u001c\\Bȴo\u001e\u001cD2\u001a\u0015G\u0004K'";
      f6921[82] = "u5\u00012.+ 6D+\\wk\b]. \u007fv\"VU3x!0Z01v|/;i$iz E.dn(I";
      f6921[83] = "=\"-\u0014\u0002]|y1\u001biP}\u001e2\u0014\f\\M%6\u001e\u0013jw$9\u0014\u00051::-\u0013\u0000O}z*Ai";
      f6921[84] = "[o\u0010Gl0\u0002w\u001fRT׀f-\fH>#\u0018jLOlJ[o\u0010Gl0\u0002w\u001fRT";
      f6921[85] = "\tr\n&ht\u00131EwQp\u0005u\u007fq4u\u0005sA\u001c1m\bjKs!!\u001ah:";
      f6921[86] = "h\u0005]\r\u001f\u0017~\u0003\u0000W/\u001bc\u0014\f\u000fC)0Y\\S/\u0018~\u0011\u0005U\u0010N>Y\u0015h";
      f6921[87] = "aS<\u007fo\u001ejP-r\u000e\u001enB\nir\u0010\u007f_*t\u000e\u0011q^$~a\u0001=L&\u000f";
      f6921[88] = "\u0004\r6m\u001fP\u001c\u001c63{W\u0018:k:\u0014R\u000e\n\fi\u0003I\t\u000fr.CN[f";
      f6921[89] = "T;Y\"z{\r#V7BՇiyE-(h\u0017>\u0005*z\u0001T;Y\"z{\r#V7B";
      f6921[90] = "N\u0003^PO\b\u0017\u001bQEwȔsAB_\u001d\u001b\r\u0006\u0002XOrO\u0005EJ\u001e\f\bEB\u0018wN\u000b\u0002PI\t\tK\u0005\u0002 K\n\f\u0017S^\fJ\u000bE:\u001c\u000f\r\u0019\u0014D[O\nK}\u0007^\u0013\u0002K\u0007^F\u001c\u0017s";
      f6921[91] = "-ALL7\u0007tYCY\u000fմ\u0010\u0003PCe\u0014nD\u0010D7}-ALL7\u0007tYCY\u000f";
      f6921[92] = "v\u0015ca\u000b\u0007\"E( p\u0005+\u0003L4\u0014\u0017+\u007f}3A\u0013'\u001a\u007f=\u001c\fF";
      f6921[93] = "_6<\u0019c4Azn\u001f\u0004<K4\u001fZ~3W\u000f7[xZ\\!g\\h7\u001awo_\u0004!J7'Kx`L\"h ";
      f6921[94] = "uq\u000eUS6~f\u00196ʧP~ \\K\u0018/s\"U]";
      f6921[95] = "Pi\u0017hBq[~\u0000\u000bѢ\u0017\u000b0\u0005aDfQp\u001d;";
      f6921[96] = "\u000e![\u0007\u001e1Zq\u0010Fe5R'qF\u000f\u0007S7VZ\u00033EKF\u0000\u0017:Q;I_\u0000.>3T^\u0005&^\"N]e";
      f6921[97] = "&MQ\b\r\u0005>\\QVi\u0002:j\u0011Y\u0006\f @\u00040U\u001b>L\u0002N\u0012[9\u001ek";
      f6921[98] = "q\u001bG\u001e\u0007\"<\\\u001dIk7-\u001b1\u0015\u0013,).\u001c\u0015\f3-\u000bxM\u00133*\u000e\u0006\nS4xgI\rT#,\t\u0004J\u000et@";
      f6921[99] = "0TC'lLiLL2T\u0557\rK\u0018n1SaD^<%61RX==Hv\u0012_oT";
      f6921[100] = "\u0019au+\u0000\u0011\t-g)q\u001f\u0005~o!\r\u0019\u0003\u0013{3\u0003\u0005\u001fo/!\b\fy";
      f6921[101] = "\\o\u0003%TMLi\u0018i3\u00185h\u001bd\u000fS\u000ep\u0001nA4_dMhT\u000fG~G&3";
      f6921[102] = "\\,{R\u0011s\u0006lc\bmzA`\u0002\u0002\u0002l_w3\b\u00002\u0006\u001cmV\\{]yoX\u0001d<sl\t\u0014cYqbT\u000b\u0002";
      f6921[103] = "LJGb#c\u0015RHw\u001bԣq\b[mqp\u000fO\u001bj#\u0019ML\\xrg\n\f[*\u001b$\u000fPS*a}\u0017_F\u0012";
      f6921[104] = "\u0014wP@\f\rW.\u0010Db\u0016LyHJ\u000b\u001auwHZ\u000f|\u0017fSM\u000b\u0002P&T\u001fb";
      f6921[105] = "}U\u0002-$}pW\u000b;\u0015e+&[9sm mW(un!\u0006\u0006a%>M]\u0003ih32P\u0001`~\u0002";
      f6921[106] = "\"\u0017*^&\u00072[8\\W\u0012/\u0000-C:!&\u0001JA&\u0010)\u00047W4U:evE(\u0002+\u001b1\u0005/PB";
      f6921[107] = "2\u00163yy-9\u0001$\u001aЅK9Gag244Ehq";
      f6921[108] = "v8\f\u0016-4}/\u001buѦR}i^\bf-pkW\u001e";
      f6921[109] = "wd\u0013]F\u000b.|\u001cH~\u05fdJ&\u000fR\u0014\u00184aOUFqwd\u0013]F\u000b.|\u001cH~";
      f6921[110] = "\u0018dB<q\tXf\u0002\u007fMξed\u0002w(\u000f\tkD%<";
   }
}
