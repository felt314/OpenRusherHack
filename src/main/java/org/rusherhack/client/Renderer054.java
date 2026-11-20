package org.rusherhack.client;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.Renderer202;
import org.rusherhack.Renderer273;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.core.setting.Setting;

public class Renderer054 extends Renderer034<Renderer020> {
   public List<Renderer020> f1343;
   public Renderer043 f1344;
   public static long f1345 = Class066.m4320(-6643504153477185003L, 2625415172237171588L, MethodHandles.lookup().lookupClass()).m4325(151935579219431L);
   public static long f1346;
   public static Object[] f1347 = new Object[51];
   public static String[] f1348 = new String[51];

   public void m3198() {
      int[] var3 = Class055.m3218();
      PanelHandlerBase var5;
      PanelHandlerBase var10000 = var5 = Class170.f3364.m7115().getClickGuiHandler();
      if (var3 == null) {
         if (!(var10000 instanceof Renderer273)) {
            return;
         }

         var10000 = var5;
      }

      ((Renderer273)var10000).m9581(this.f1344);
      boolean var10003 = true;
      this.f1344.m2881(true);
   }

   @Override
   public List<Renderer020> m2852() {
      return this.f1343;
   }

   @Override
   public Color m2855() {
      long var1 = f1345 ^ 126744751459368L;
      return ((org.rusherhack.Hud388)(Class170.f3364.m7115())).getClickGuiTheme().getPrimaryColor();
   }

   @Override
   public void m2878(boolean var1) {
      boolean var10003 = true;
      super.m2878(true);
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   @Override
   public double getScale() {
      return RusherHackAPI.getThemeManager().getClickGuiHandler().getScale();
   }

   @Override
   public IRenderer2D getRenderer() {
      return Class170.f3364.m7115().getClickGuiHandler().getRenderer();
   }

   public Renderer054(int var1) {
    }

   @Override
   public boolean charTyped(char var1) {
      return super.charTyped(var1);
   }

   @Override
   public IFontRenderer getFontRenderer() {
      return Class170.f3364.m7115().getClickGuiHandler().getFontRenderer();
   }

   static {
   }
   public static int m156(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1348[var4] != null) {
         return var4;
      } else {
         Object var5 = f1347[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 61;
               case 1 -> 19;
               case 2 -> 49;
               case 3 -> 15;
               case 4 -> 46;
               case 5 -> 63;
               case 6 -> 59;
               case 7 -> 6;
               case 8 -> 56;
               case 9 -> 62;
               case 10 -> 16;
               case 11 -> 39;
               case 12 -> 51;
               case 13 -> 37;
               case 14 -> 45;
               case 15 -> 41;
               case 16 -> 10;
               case 17 -> 26;
               case 18 -> 27;
               case 19 -> 43;
               case 20 -> 2;
               case 21 -> 18;
               case 22 -> 42;
               case 23 -> 25;
               case 24 -> 53;
               case 25 -> 60;
               case 26 -> 29;
               case 27 -> 5;
               case 28 -> 21;
               case 29 -> 0;
               case 30 -> 9;
               case 31 -> 58;
               case 32 -> 36;
               case 33 -> 4;
               case 34 -> 32;
               case 35 -> 38;
               case 36 -> 54;
               case 37 -> 28;
               case 38 -> 3;
               case 39 -> 48;
               case 40 -> 47;
               case 41 -> 30;
               case 42 -> 8;
               case 43 -> 31;
               case 44 -> 11;
               case 45 -> 50;
               case 46 -> 1;
               case 47 -> 23;
               case 48 -> 17;
               case 49 -> 44;
               case 50 -> 12;
               case 51 -> 22;
               case 52 -> 24;
               case 53 -> 20;
               case 54 -> 57;
               case 55 -> 34;
               case 56 -> 52;
               case 57 -> 40;
               case 58 -> 7;
               case 59 -> 14;
               case 60 -> 55;
               case 61 -> 33;
               case 62 -> 13;
               default -> 35;
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

            f1348[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m786() {
      f1347[0] = "uK.H\u001c\fiQ,\u0014\u0006\u0018yRg\u0005\u0002\u0010\u007fW=Hё";
      f1347[1] = "!\u001cjkpd?\u0014p$\u0012x8\t";
      f1347[2] = "aH,l%1}R.0?%mQeϼ";
      f1347[3] = "\u000b\u001b\u000ebO#\u0017\u0001\f>U7\u0007\u0002G/Q?\u0001\u0007\u001db\\&\rG\u001c%\u0013&\u0005\u0007\f \u0013\u0006\u0005\u0007\f u7\n\r\u0005)O\u0014\u0005\u001a\f";
      f1347[4] = "\u001dZ\u0003xY\u0016\u0001@\u0001$C\u0002\u0011CJĽ";
      f1347[5] = "=O3=x\u0019!U1ab\r1Vzpf\u00057S =k\u001c;\u0013&vd\b7OzZX\t<Y1ak\u000e>XfW";
      f1347[6] = "\u000eLB\fjQ\u0012V@PpE\u0002U\u000bAtM\u0004PQ\fyT\b\u0010WGv@\u0004L\u000bkJA\u000fZ@P}VSz";
      f1347[7] = " y\u0016zS\u0000<c\u0014&I\u0014,`_7M\u001c*e\u0005z@\u0005&%\u0004=\u000f\u0001'n\u001c1\u000f<\u001bc\u00149D8.e\u00103D\u0007";
      f1347[8] = "Y-24>\u0018E70h$\fU4{y \u0004S1!4-\u001d_q\u0007o?\u0005S-\u001d{/\u0006w\u000f\u001c";
      f1347[9] = "A&\rA&\u0019]<\u000f\u001d<\rM?D\f8\u0005K:\u001eA5\u001cGz\u001f\u0006z)B1\u0007\n:\u0018f5\u0004\u000b8\t\\\u0016\u000b\u001c1";
      f1347[10] = float.class;
      f1348[10] = "java/lang/Float";
      f1347[11] = "\u0005?\u00049\bX\u0019%\u0006e\u0012L\t&Mt\u0016D\u000f#\u00179\u001b]\u0003c\u0011r\u0014I\u000f?Mq\u0015C\u001ec*Q\u0015C\u001e\u001f\u0006y\u001eH\u0018(\u0011";
      f1347[12] = "u~Uh6iidW4,}yg\u001c%(u\u007fbFh%ls\"G/jhri_#jUNdW+!";
      f1347[13] = "hAkV\nduT3tKimR";
      f1347[14] = "\u0013\u0017\u0001Fk,\u000f\r\u0003\u001aq8\u001f\u000eH\u000bu0\u0019\u000b\u0012Fƕ";
      f1347[15] = boolean.class;
      f1348[15] = "java/lang/Boolean";
      f1347[16] = void.class;
      f1348[16] = "java/lang/Void";
      f1347[17] = "\f\u0003^\u0013\u0000\u001f\u0010\u0019\\O\u001a\u000b\u0000\u001a\u0017^\u001e\u0003\u0006\u001fM\u0013Ӎ";
      f1347[18] = "\u0017}";
      f1347[19] = "3P%P&\u001f/J'\f<\u000b?Il\u001d8\u00039L6Pϥ";
      f1347[20] = "6OrX5;*Up\u0004//:V;ɑ";
      f1347[21] = "\u007fj5&GWcp7z]Css|ɼ";
      f1347[22] = ":CB)\u00131$KXft05PU<R6";
      f1347[23] = "\u0004{\u0010\u001aMd\u000ft\u0001U,j\u0004\u007f\u0005\u000f";
      f1347[24] = "\u0003|Zx\u001f:\u001ffX$\u0005.\u000fe\u00135\u0002=\t N3\u0019;\u0005`Zx>*\u0018zT8\n";
      f1347[25] = "\fY^e\u0015\ryyUj\u0004B\u0004aFm\r\u000bl";
      f1347[26] = "V8";
      f1347[27] = "Z\u0018]?U\t\u0005N_h.W\n\b{gOS\u0004;MbnQ\u0001\u0018TnT8]\r\tgG\u0003\u001eMS8.";
      f1347[28] = "MV\u000f5\r/\u001eK_82yNAOE]%MT]:P\"\u0018@3";
      f1347[29] = "v7K<Isvi\u001b') #`q8\u0013'*b\u000e5\u0014r>\f\u001bnP2qt@iLqO";
      f1347[30] = "j\u0005t3\u0011N!\f6<-\u001a>\u000b@8L\u001e08v=m\u001c5\u001bo1Wui\u000e28DN*Nhg-";
      f1347[31] = "\u0004,+\u0010h.\u0016{`U\u001aԴd|=L!(Uf\"V{U";
      f1347[32] = "\u001b{|\u0005u\u0006R6\u007f\u0002I· |:\u001a,\u0005\u001f5w\u0019+";
      f1347[33] = "\u000frdzn?\u0002rv{\u0003нf$ rxo\u001e\u007f'n;Q\f/eb8+\t)d{\u0003";
      f1347[34] = "\u007ft\u001cD\tT}\"\u0017P9ԗ\u0014|\u0018\u0004H\u0015p`H\u0006\u0002k";
      f1347[35] = "8\u0000\u0001V85y\u0004\u000e*ҰEm@\u001a\u0011k,{J^\u0015";
      f1347[36] = "VP\u0003\u0016,JT\u0006\b\u0002\u001cӝ=X\u0007Vm\u000bYDWT'uWX\u0010\u0001'\u000fR^\u0011\u0018\u001c";
      f1347[37] = "?~JN\u0017[r+CJkKbi\u007f\r\nAfoV<\f@ho'F\u0007J7qZ\f[A~\u0015";
      f1347[38] = "IjqeBFEqek>ӷ$b$xOMJo$jN Njdl\u0005ZKleu>";
      f1347[39] = "MW=a#\"M\tmzCy\b\u0001}c?\u007f\u000elim\u007fhK\\:p/et";
      f1347[40] = "zeL@\u000fp;aC<Ҏ\u0000)>RUWz,8SLl";
      f1347[41] = "\u0007ymZ\u001bWD97\u0005r\u0003P|\u0019Z\u001f\tPf(ErU\u0006:?^HUXj$>";
      f1347[42] = "<f\u007fl|\u001du+|k@ѓ\u0007cwv/\u001e<(~4 \"";
      f1347[43] = "&U\u000egv\u0012kJZb\u000f\u0006vQh}b\fvh]{f\u0006vW4 c\u0004'V\u0005\u007f5\u0006p-";
      f1347[44] = "s7\u0011`YB23\u001e\u001cд2s6IwZ\bsh\u0019l";
      f1347[45] = "K[y@\u0002AK[!\u0014{G\u0018_\u001a\u001b\u0012L\u0018#~\u001c\u0005\u0017\u0010\u001d-\u001b\u001aWu";
      f1347[46] = "A}`\u0014$Y\u0012`0\u0019\u001b\tFa\u001a\tk\u0015/pe\u001d`WW+b\u0001#i";
      f1347[47] = "\u007f\u0001N\u007f<.<A\u0014 Uz(\u00049|3i\u001f\u0015\u0011w8o(\u0002w$,e7A\u0015t5{)x";
      f1347[48] = "V\u00025=MD\fU0\"uP\u0007F\b+\u0013S\u0007@?<u\u0003\u0013\u0004ox\u0010\u000e\u0001U7F";
      f1347[49] = "\u000fb6n-8Dkta\u0011l[l\u0002ephU_4`Mc[u$\u0001!h[)5~l=R-I";
      f1347[50] = "\u0005pIh\\\tDtF\u0014VyRvB/V\u001dDr\u001ai?\u0017\u0000#\u0010}[\u0001\u0004{V\u0014";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f1347[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1348[var4]);
            f1347[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m159(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m160(Class var0, String var1, Class var2) {
      Field var3 = m159(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m160(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m161(long var0, long var2) {
      int var4 = m156(var0, var2);
      Object var5 = f1347[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1348[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f1347[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1347[var4] = var13;
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
               var12 = m158(1631825839815838L, 0L);
            }
         }
      }
   }

   public static Method m162(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m163(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m162(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m163(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m164(long var0, long var2) {
      int var4 = m156(var0, var2);
      Object var5 = f1347[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1348[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m158(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m162(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f1347[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(1631825839815838L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m163(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f1347[var4] = var19;
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
               var23 = m158(1631825839815838L, 0L);
            }
         }
      }
   }

   public static MethodHandle m165(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 226 && var8 != '$' && var8 != 218 && var8 != 202) {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'p') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'U') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 226) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == '$') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 218) {
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

   public static Object m166(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m165(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer054.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/п" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
