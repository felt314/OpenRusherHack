package org.rusherhack.client.api;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import org.rusherhack.Class066;
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
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.bind;
import org.rusherhack.command.send;
public class RusherHackAPI {
   public static String f290;
   public static long f291 = Class066.m4320(7084404818078353807L, 7169064842432084146L, MethodHandles.lookup().lookupClass()).m4325(9932482948505L);
   public static Object[] f292 = new Object[59];
   public static String[] f293 = new String[59];

   public static IInteractions interactions() {
        return null;
    }

   public static IFeatureManager<IModule> getModuleManager() {
        return null;
    }

   public static Path getConfigPath() {
      long var0 = f291 ^ 104589637879498L;
      return ((java.nio.file.Path)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "ð", java.lang.invoke.MethodType.methodType(java.nio.file.Path.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.client.api.IRusherHack)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "e", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.IRusherHack.class, long.class, long.class)), -955797769188524681L,  var0))),  -955539118392983769L,  var0)));
   }

   public static String getVersion() {
        return null;
    }

   public static IRenderer3D getRenderer3D() {
        return null;
    }

   public static ICommandManager getCommandManager() {
        return null;
    }

   public static ILogger createLogger(String var0) {
        return null;
    }

   public static IRenderer2D getRenderer2D() {
        return null;
    }

   public static INotificationManager getNotificationManager() {
        return null;
    }

   public static Colors colors() {
        return null;
    }

   @Deprecated
   public static void sendNotification(NotificationType var0, String var1) {
        
    }

   public static IThemeManager getThemeManager() {
        return null;
    }

   public static Fonts fonts() {
        return null;
    }

   public static IRotationManager getRotationManager() {
        return null;
    }

   public static Entities entities() {
        return null;
    }

   static {
    }

   public static IBindManager getBindManager() {
        return null;
    }

   public static IHudManager getHudManager() {
        return null;
    }

   public static IServerState getServerState() {
        return null;
    }

   public static IRelationManager getRelationManager() {
        return null;
    }

   public static IWindowManager getWindowManager() {
        return null;
    }

   @Deprecated
   public static void sendNotification(NotificationType var0, String var1, String var2) {
        
    }

   public static IEventBus getEventBus() {
        return null;
    }

   public static IChunkProcessor getChunkProcessor() {
        return null;
    }

   public static void m592(String var0) {
      f290 = var0;
   }

   public static String m593() {
      return f290;
   }
   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f293[var4] != null) {
         return var4;
      } else {
         Object var5 = f292[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 25;
               case 1 -> 2;
               case 2 -> 21;
               case 3 -> 12;
               case 4 -> 62;
               case 5 -> 56;
               case 6 -> 43;
               case 7 -> 19;
               case 8 -> 13;
               case 9 -> 33;
               case 10 -> 10;
               case 11 -> 22;
               case 12 -> 34;
               case 13 -> 16;
               case 14 -> 50;
               case 15 -> 14;
               case 16 -> 18;
               case 17 -> 37;
               case 18 -> 54;
               case 19 -> 49;
               case 20 -> 5;
               case 21 -> 44;
               case 22 -> 30;
               case 23 -> 3;
               case 24 -> 59;
               case 25 -> 42;
               case 26 -> 36;
               case 27 -> 58;
               case 28 -> 11;
               case 29 -> 7;
               case 30 -> 55;
               case 31 -> 47;
               case 32 -> 20;
               case 33 -> 51;
               case 34 -> 28;
               case 35 -> 26;
               case 36 -> 61;
               case 37 -> 39;
               case 38 -> 0;
               case 39 -> 52;
               case 40 -> 6;
               case 41 -> 29;
               case 42 -> 40;
               case 43 -> 46;
               case 44 -> 41;
               case 45 -> 17;
               case 46 -> 32;
               case 47 -> 24;
               case 48 -> 9;
               case 49 -> 27;
               case 50 -> 57;
               case 51 -> 53;
               case 52 -> 15;
               case 53 -> 60;
               case 54 -> 38;
               case 55 -> 1;
               case 56 -> 31;
               case 57 -> 23;
               case 58 -> 48;
               case 59 -> 45;
               case 60 -> 8;
               case 61 -> 4;
               case 62 -> 35;
               default -> 63;
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

            f293[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f292[0] = "166\u000eH -,4RR4=/\u007fCV<;*%\u000e[%7j\u0003UI=;6\u0019AY>\u001f\u0014\u0018";
      f292[1] = "\u0000 Z\u0017 \n\u001c:XK:\u001e\f9\u0013Z>\u0016\n<I\u00173\u000f\u0006|tk'\f\u00077Oq3\u001c\u0004";
      f292[2] = "\u0017Wc_g)\u000bMa\u0003}=\u001bN*\u0012y5\u001dKp_t,\u0011\u000bf\u0018{8VlF\u0018{85Dj\u0010r9\n";
      f292[3] = "JSa:OnA\\pu2vR[y<";
      f292[4] = "\u001dgt\u000f4F\u0001}vS.R\u0011~=B*Z\u0017{g\u000f'C\u001b;`X5G\u0017x=h\u000f]\u0006pa@%G\u001bz}R";
      f292[5] = "\u001eD\u0003!\f&\u0002^\u0001}\u00162\u0012]Jl\u0012:\u0014X\u0010!\u001f#\u0018\u0018\u0016j\u00107\u0014DJF,6\u001fR\u0001}\u001b!Br";
      f292[6] = "\u00160\u001c\u001ff\u0011\n*\u001eC|\u0005\u001a)URx\r\u001c,\u000f\u001fu\u0014\u0010l\u000eX:\u0010\u0011'\u0016T:--*\u001e\\q)\u0018,\u001aVq\u0016";
      f292[7] = "iVeCF#uLg\u001f\\7eO,\u000e[$c\nd\bU\"sVgC}\u0010cEv\u0018F3KEl\fS3t";
      f292[8] = ">;EIwj\"!G\u0015m~2\"\f\u0004iv4'VIdo8gQ\u001evk4$\f.Vz#?G\u0015Vk0=G";
      f292[9] = "6\rF\u0018\u0018s*\u0017DD\u0002g:\u0014\u000fU\u0006o<\u0011U\u0018\u000bv0QRO\u0019r<\u0012\u000f\u007f$i-\u0016G_\tg-\u0016NX'g7\u001eFS\u0018";
      f292[10] = "\u000f&><H\u0017\u0013<<`R\u0003\u0003?wqU\u0010\u0005z*wN\u0016\t:><i\u0007\u0014 0|]";
      f292[11] = "(kT3`\u001a]K_<qU SL;x\u001cH";
      f292[12] = "S'*<%-O=(`?9_>cɦ";
      f292[13] = "H\r>n-mT\u0017<27yD\u0014w#0jBQ7/+qA\u0016:!+qH\u0011w\u000e0lN\u00190#>lN\u00107\u0014&hB";
      f292[14] = void.class;
      f293[14] = "java/lang/Void";
      f292[15] = "yQ~\u0003{ceK|_awuH7Ne\u007fsMm\u0003hf\u007f\rjTzbsN7dAcrnxChqsQ";
      f292[16] = "7c\u007fu\u0019:+y})\u0003.;z68\u0007&=\u007flu\n?1?k\"\u0018;=|6\u0018\u0004#7ck";
      f292[17] = "\u0004;mG9!\u0018!o\u001b#5\b\"$\n$&\u000ego\u001f.:\u001fgC,=1\u0005=H\u001c8";
      f292[18] = ",}\u0004D8#/s\\C\u007f!#2\"Db%";
      f292[19] = "\u001c\u007fV\u0005\u0016\u0002\u0000eTY\f\u0016\u0010f\u001fH\b\u001e\u0016cE\u0005\u0005\u0007\u001a#CN\n\u0013\u0016\u007f\u001fb6\u0012\u001diTY\u0001\u0005AI";
      f292[20] = "h&,i]\u0019t<.5G\rd?e$C\u0005b:?iN\u001cnz8>\\\u0018b9e\u000e}\u0003s5?.@\u0002J5%&H\tu";
      f292[21] = ":uq<9\u001b&os`#\u000f6l8q$\u001c0)u}&\u00034ir<\u0002-:j{s%\n\u0018fxs,\u000b'";
      f292[22] = "P\fnmsPL\u0016l1iD\\\u0015' mLZ\u0010}m`UVPz:rQZ\u0013'\nS@S\u001f}*nKr\u001fg\"f@M";
      f292[23] = "[\u0004kGB\u0003G\u001ei\u001bX\u0017W\u001d\"\n\\\u001fQ\u0018xGQ\u0006]X\u007f\u0010C\u0002Q\u001b\" s\u001eA\u0018g9B\u0019W\u0013\u007f\u001a_\u0004";
      f292[24] = "\u0005\u0017=\u0000_\u001e\u0019\r?\\E\n\t\u000etMB\u0019\u000fK6AJ\f\u0003\u000b=\u0000d'\u0005\u0002=K_";
      f292[25] = "E5\r@Io0\u0015\u0006OX M\r\u0015HQi%";
      f292[26] = "B\u001aD8N\u000e^\u0000FdT\u001aN\u0003\ruP\u0012H\u0006W8]\u000bDFPoO\u000fH\u0005\r_k\u0012C\fLaq\u001aC\tDsN";
      f292[27] = "m\b4nP\u0007q\u001262J\u0013a\u0011}#N\u001bg\u0014'nC\u0002kT 9Q\u0006g\u0017}\u0006M\u001cv\t";
      f292[28] = "=\f\n\u0002d!!\u0016\b^~51\u0015COz=7\u0010\u0019\u0002w$;P\u001eUe 7\u0013Cix ;\n\u0004Ie";
      f292[29] = "\u001f>Vl\u001e\f\u00141G#\u007f\u0002\u001f:Cy";
      f292[30] = "m{!5Kq8aqU\u001d\"+D))\u0013!6i')\u0013(1G'3\u001b :xNk\u0011.&95kK4f\u0002";
      f292[31] = "\u001f\u0005\u001898B\u0000\r\u000f_)A\u00120\u000e9*A\u0014\u0007\u0019e\n,\u0002\f\u0003fwS^T\u001e4F";
      f292[32] = "e?rj\u001cLz7e\f\u0003Dh=se\t^u7owb\u0018e4qnSIo e\f";
      f292[33] = "t6b!0\u0013!,2Aɦ-? v'wC (a";
      f292[34] = "oX35\\Q:BcUɯooDei\u0003\u00036O=4e";
      f292[35] = "K,\u0012\u000e\tAT$\u0005h\u0018BF\u0018\u0004\u0012\tB@\u0018\u0015\u0001\u000bB:~\fT\u0015OV<\u0003\u000b\u0007/";
      f292[36] = "\u0015Q\n\u0011}e\nY\u001dwlf\u0018u\u0016\u0011mj\u000bf\u0018\u000bc\u000b\b\u0007H\t:4\u0000[\u001e\u0012\u0003";
      f292[37] = "A\ryV#\u0000^\u0005n06\tT\u0005xK]\u0004V\u000beS1U\u000f\u001bz0";
      f292[38] = ">AW\u0019sv!I@\u007fbu3tA\u001bdd.IJ:d~&AA\u0005\rv/UP\u0003h!0CO\u007f";
      f292[39] = "\u001ap51|G\u0005x\"WmD\u0017_3;G@\rv!:x)\u0001%*ozIVa+;\u0002";
      f292[40] = "Ah3'f\u0013^`$Aw\u0010LA/=y\u0013Ql!=y\u001aVB!'q\u0012]}H\u007f{\u001cA<3\u007f!\u0006\u0001\u0007";
      f292[41] = "TESzM\u0000KMD\u001c\\\u0003YpEz_\u0003_GR'\u007fn\u001eNT|SQWQS\u007f3";
      f292[42] = "KZKK\fGK\u0000Q\u000b7G\u0018_F:\u0006\rOB\u0012BY]\u000f^*\u0000R\u0005I_FYY]\u00149\u0010_\u000e\u0000\u0013UITV]uP\u0013QFC\u0007\\H\u0003\f<";
      f292[43] = "O`7`6[Ph \u0006%SBn0g%N>m,>u\u000bFv|<%5";
      f292[44] = "0\u0003zn\"]m\u0004,jNՆ\u000f^oxuAw@a+.'";
      f292[45] = "n7)\u001do\u0004q?>{~\u0007c\u00042\u0016t\u0007Z14\u0012~\u0007eXn\u0019`\u0015yc#\u0017t\u0012\u001f";
      f292[46] = "] D:\u0017\u0013B(S\\\u0002\u0007A&C1-\u001aC R&iGIv\u0003:\u0005\u001eB.^\\\tMA4C:WGQ=?";
      f292[47] = "k\u001cN\u0018G\u001ft\u0014Y~V\u001cf-X\u0004B\u0010}\u00155D\\H&\u0015Y\u001dW\u0010{s";
      f292[48] = "(rc}\u0004%7zt\u001b\u0014,?ac\u001b\u001b3<$fqEs<o\u0018";
      f292[49] = "\u001a\u0017\u0000`G@\u0005\u001f\u0017\u0006VC\u0017\"\u001czPR\n\u001f\u001dCPH\u0002\u0017\u0016|9B\u001a\u0013\u0012t\u0007\u0017\u0016\u0014\u0017\u0006";
      f292[50] = "\u001a=\u0001x5$\u00055\u0016\u001e$'\u0017\u0018\u001bx'\u000f\u00024\u0013q&0kk\u0001 +%\u001bb\u001a$;J";
      f292[51] = "\u001bCF\u001f'#NY\u0016\u007fw\u001d\u0011]N\rrbAS@\u0003\u001e-F][\u0013a}HSU\u007f";
      f292[52] = "\u0014J~*71\u000bBiL&2\u0019`b 4;\b`l* 0\b_\u0005qy-\u0019Ch4\"<\u0019%";
      f292[53] = "/Zq*S\u000e0RfLB\r\"~j1K\u0003\u0006Om'@\u001b%RpLB[8J2)R\u000f'\u000e\n";
      f292[54] = ":ih\u0010iB%a\u007fvxA7Yr\u0010{K4Cz\u0010~C&|\u0013\u0017~Cqbv\u0014fF%\u0006";
      f292[55] = "al|`Ev~dk\u0006TulNyk]dZ~|\u0006P&{<z~Vg+b\u0007";
      f292[56] = "YF_-Y,\u0004A\t)5̩f\u001bJ;\u000e0\u001e\u0005DhUV\u000fB^ J$\u0003\u0019\fj5";
      f292[57] = "lZ3\u0004\rY9@cdŤglFeXR\u000b5M=\u00054\u000eoH-\u001bF\u00024\u001agd";
      f292[58] = "\u001d}4U(5\u0002u#396\u0010Y(V32\n~\nZ02\u0003\u007f53;>\u0012/7\n?d\\)O";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f292[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f293[var4]);
            f292[var4] = var5;
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
      Object var5 = f292[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f293[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f292[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f292[var4] = var13;
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
               var12 = m123(2107905154166671L, 0L);
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
      Object var5 = f292[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f293[var4];
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
               f292[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(2107905154166671L, 0L);
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
                     f292[var4] = var19;
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
               var23 = m123(2107905154166671L, 0L);
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
         if (var8 != 186 && var8 != 225 && var8 != 'e' && var8 != 223) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 240) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 241) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 186) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 225) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'e') {
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

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(RusherHackAPI.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/api/RusherHackAPI" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
