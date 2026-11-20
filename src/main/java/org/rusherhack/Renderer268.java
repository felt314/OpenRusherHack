package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.nio.file.Path;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.IRusherHack;
import org.rusherhack.client.api.bind.IBindManager;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.system.Colors;
import org.rusherhack.client.api.system.Entities;
import org.rusherhack.client.api.system.Fonts;
import org.rusherhack.client.api.system.IChunkProcessor;
import org.rusherhack.client.api.system.IHudManager;
import org.rusherhack.client.api.system.IInteractions;
import org.rusherhack.client.api.system.INotificationManager;
import org.rusherhack.client.api.system.IRelationManager;
import org.rusherhack.client.api.system.IRotationManager;
import org.rusherhack.client.api.system.IServerState;
import org.rusherhack.client.api.system.IWindowManager;
import org.rusherhack.client.api.ui.theme.IThemeManager;
import org.rusherhack.core.command.ICommandManager;
import org.rusherhack.core.event.IEventBus;
import org.rusherhack.core.feature.IFeatureManager;
import org.rusherhack.core.logging.ILogger;

import org.rusherhack.command.bind;
import org.rusherhack.command.config;
import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
public class Renderer268 implements IRusherHack {
   public Class170 f4655;
   public static long f4656 = Class066.m4320(-3526217897495547540L, 8982346163714942449L, MethodHandles.lookup().lookupClass()).m4325(137320305009405L);
   public static String[] f4657;
   public static String[] f4658;
   public static Object[] f4660 = new Object[64];
   public static String[] f4661 = new String[64];

   @Override
   public IServerState getServerState() {
      return Class164.f3259;
   }

   @Override
   public Fonts fonts() {
      return CustomFont.f3033;
   }

   @Override
   public Path getConfigPath() {
      return Class367.f6017.toPath().resolve("config");
   }

   @Override
   public IRelationManager getRelationManager() {
      return this.f4655.m7109();
   }

   @Override
   public IRenderer3D getRenderer3D() {
      return Class352.f5725;
   }

   public static void m9427(Runnable var0) {
      Runnable var3 = var0;

      try {
         Class var10000 = Class.forName("org.rusherhack.launcher.Bootstrap");
         boolean var10004 = true;
         Class[] var10003 = new Class[]{Runnable.class};
         Method var5 = var10000.getDeclaredMethod(Class079.m4669("execMain", var10000, var10003), var10003);
         var10004 = true;
         var5.invoke(null, var3);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }
   }

   @Override
   public IChunkProcessor getChunkProcessor() {
      return this.f4655.m7114();
   }

   @Override
   public IWindowManager getWindowManager() {
      return this.f4655.m7121();
   }

   @Override
   public IHudManager getHudManager() {
      return this.f4655.m7106();
   }

   @Override
   public ICommandManager getCommandManager() {
      return this.f4655.m7105();
   }

   @Override
   public String getVersion() {
      return Class367.f6014;
   }

   @Override
   public Entities entities() {
      return Module087.f2190;
   }

   @Override
   public IEventBus getEventBus() {
      return Class170.f3362;
   }

   @Override
   public IFeatureManager<IModule> getModuleManager() {
      return this.f4655.m7107();
   }

   @Override
   public IBindManager getBindManager() {
      return this.f4655.m7119();
   }

   @Override
   public IRenderer2D getRenderer2D() {
      return Renderer346.f5592;
   }

   @Override
   public Colors colors() {
        return null;
    }

   @Override
   public INotificationManager getNotificationManager() {
      return this.f4655.m7110();
   }

   @Override
   public IThemeManager getThemeManager() {
      return this.f4655.m7115();
   }

   public Renderer268(Class170 var1) {
      super();
      this.f4655 = var1;
   }

   @Override
   public IInteractions interactions() {
      return Class092.f2256;
   }

   @Override
   public ILogger createLogger(String var1) {
      return new Class534(var1, Class170.f3346, null);
   }

   @Override
   public IRotationManager getRotationManager() {
      return this.f4655.m7108();
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
      f4660[0] = "6q\u0018{4M*k\u001a'.Y:hQľ";
      f4660[1] = "`m$r*\u0006|w&.0\u0012ltmϢ";
      f4660[2] = "\u000e\u001f\u0002N\\?\u0012\u0005\u0000\u0012F+\u0002\u0006Kɻ";
      f4660[3] = "\u0001\u0002\u0015J\u00058\u001d\u0018\u0017\u0016\u001f,\r\u001b\\ˌ";
      f4660[4] = ")@c\u001d\u001cS5ZaA\u0006G%Y*Ш";
      f4660[5] = "*W\u001b|L.6M\u0019 V:&NRϊ";
      f4660[6] = "\u0003PPy\u0015\\\b_A6hD\u001bXH\u007f";
      f4660[7] = "\u0014V@1Nc\u001fYQ~#c\u001fDE";
      f4660[8] = "2\u00038\u0017 4G#3\u00181{*#3\u0005%n";
      f4660[9] = "t\u001cAuR\u0010\u007f\u0013P:\u000e\u0019x\u0011Rw\bRS\u0018C|\u0013\u0018";
      f4660[10] = "q\u001a\u0003jkNz\u0015\u0012%\n@q\u001e\u0016\u007f";
      f4660[11] = "\u001ew\u0005Z\u001a2kW\u000eU\u000b}\nY\u0005^\u000f'~";
      f4660[12] = "L0l~BqP*n\"Xe@)%3_vFli9^`\r\u0000b>TIB,j7Uva#x5";
      f4660[13] = "$^NemY/Q_*\u0017]<POe!Y+";
      f4660[14] = void.class;
      f4661[14] = "java/lang/Void";
      f4660[15] = "XY\bZ}}DC\n\u0006giT@A\u0017caRE\u001bZnx^\u0005\u001d\u0011alRYA&jfSN\u001d7`fCN\u0017\u0000";
      f4660[16] = "E\u0019R\u0007&\u000eY\u0003P[<\u001aI\u0000\u001bò";
      f4660[17] = "\u0002Cf\u001co\u000e\u001eYd@u\u001a\u000eZ/П";
      f4660[18] = "\u0006ip[\u0001&\u001asr\u0007\u001b2\np9Ν";
      f4660[19] = "g1R|iG{+P sSk(\u001b1t@mmP$~\\|mp$~\\|\u0001@!";
      f4660[20] = "z5\b(1Mf/\nt+Yv,Aɂ";
      f4660[21] = "4nSSci(tQ\u000fy}8w\u001a¨";
      f4660[22] = "C\u0004]f2._\u001e_:(:O\u001d\u0014˅";
      f4660[23] = "*\u00124b\ny6\b6>\u0010m&\u000b}ӂ";
      f4660[24] = "VM\u001a\u0000eoJW\u0018\\\u007f{ZTSŊ";
      f4660[25] = "[jOO49GpM\u0013.-Ws\u0006Ġ";
      f4660[26] = "\u00183\u000eF\u0010@\u0004)\f\u001a\nT\u0014*Gǖ";
      f4660[27] = "k\u0015\"24\u001ew\u000f n.\ng\fkʮ";
      f4660[28] = "\u0019Id~(\u0019\u001c\u0006Tvj\u0015";
      f4660[29] = "\u0002!zC|4\u0001/\"D;6\rn\\C&2";
      f4660[30] = "\u001c\u0018:g~N\u0000\u00028;dZ\u0010\u0001sհ";
      f4660[31] = "\u0003(88Lm\u001f2:dVy\u000f1qՆ";
      f4660[32] = "E<2^\\dY&0\u0002FpI%{Є";
      f4660[33] = "|*\u000fq\u0003$`0\r-\u00190p3F<\u001e#vv\u00040\u00166z6\u000fq=>t?\r-";
      f4660[34] = "*=b\u000b}I1tp\u0012\u001dϗ@f\"\u0011vJ#}k\u0003o";
      f4660[35] = "6\tPH{\u0019o\nK@\u001fϸ\r\u0017\u0000\u000f{Ov\u000bI_'";
      f4660[36] = "ld\u000eq\"+k#\bM3Oe`\n0i01cVu";
      f4660[37] = "Ig6\u0018\u0004L\bt?\u0014\u007fG\u0018i\u001e\u0018\u0014L\u001co?\u0019:E\tu5\u0019\u007f\u0014\u0018kh\u001a\u001eF\rk?uBZ\u001eknJATL$RK\u001dV\f,?\u0019NCH\u0015";
      f4660[38] = ":2W?\u0003\t=uQ\u0003գm<9\ts\u0016\u0013ltZ9y";
      f4660[39] = "A&0&)=Fa6\u001aƴYI3ixjaS5 fS";
      f4660[40] = ",n|6(5-y~8\u0013ЛM`pj,a\"agh\"";
      f4660[41] = "FMLXjYG_\b[Wɸ)YM_*\u0000MX_\u001b)";
      f4660[42] = "*A,*}O-\u0006*\u0016ӭ++\u0003,l6Y}X'z\u0007";
      f4660[43] = "w\u0015%t\u001dRk\\u(sUsvsl\u0013)wNb.\u001aV$Qhms";
      f4660[44] = "\u0017OV~:\u001fDP\\=S\u001a\u0019TI$-\rt\u0013C>i\u000f\u0015AV>>`\u0017OV~:\u001fDP\\=S";
      f4660[45] = "Z\u0005\u0002J@w\u0001\u0014SW#Ȓc\u0012@M\u001fw\u0007\u0015\u0007K";
      f4660[46] = "z\u007f\nk_\u001d}8\fWСyxh\u0006,\u001aCgn\u0011/%";
      f4660[47] = "\b5\ts\u001b?Q6\u0012{\u007fɴ3t\u000fuEhR&\u001au\u0012";
      f4660[48] = "NJ!^+gI\r'bƀ\u0003\u0019Z\"\u000f,xPQ>\u0019Q";
      f4660[49] = "(6XH\u0002p/q^tǬ\u0014/1@\u0004Dl=2Y\u0011x";
      f4660[50] = ".jt'T\u0003!<k'2ɘL02?T\u0017>?d T";
      f4660[51] = "I9~I\u000e[N~xuϠ?J\"cKH_\u001f1&\ft";
      f4660[52] = "=BTSMr:\u0005Roӭ\u0016=DL\u0012R.1\u0001D\r";
      f4660[53] = "I[xb\u001bON\u001c~^Ŀ+@Da8\u001eU@\u001abca";
      f4660[54] = "]HCNiS\u000f\u001bV\nP_\u0005TZT=>\\\u0015DKj_\u001aDGOP\u0001\u001e\u0010D\fnD\u000fJ]7o\u0001\u001aV\u0007V)P\u0019R=";
      f4660[55] = "\u0018}qny>X?sy\u0003.(=s\u007f9mIof\u007fn\u0002\u0014l`;lcFy`l\u0003";
      f4660[56] = "\u001e\u0002\u0019mU\u0010_\u0011\u0010a.\u001aE\n;iK\u0019\"L\u0010~\u0014\u001bC\u001e\u0005~Ct\u001e\u0002\u0019mU\u0010_\u0011\u0010a.";
      f4660[57] = "0?\r\u000fL8};\u000e_'+{g\nL|/hm\u000fl]:jkl\u0001_c;c\u0012\u0001V9~\u0006";
      f4660[58] = "Z\u0019lne\u0001]^jRѮe\u000f\u000f?-s\\R\u0001l6\u001f";
      f4660[59] = "is?|K<n49@ŴXam\"zA)8l<x1";
      f4660[60] = "\u0003\u0004YufkH\u0015Y8\fɖ9PS`}jR\u001bB`0";
      f4660[61] = "?KNX6\u0006nF\u0011LG\u0014V\u0013DK}W7AQK*8jBW\u000f(Y8WWXG";
      f4660[62] = "B.S\u0010f\u0011F/[\u0012\u0000ɘ\"5M\u0000\u007f\u000fZ1F\b}";
      f4660[63] = "Nj7\tm\u001fYp+ESө#y8HcNLn\"T/";
   }
}
