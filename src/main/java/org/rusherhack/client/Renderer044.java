package org.rusherhack.client;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.Class066;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.render.graphic.IGraphic;

public class Renderer044 extends Renderer020 {
   public Util040 f1312;
   public static long f1313 = Class066.m4320(6673528776740441815L, 5174076444781605822L, MethodHandles.lookup().lookupClass()).m4325(151434212055111L);
   public static Object[] f1314 = new Object[45];
   public static String[] f1315 = new String[45];

   @Override
   public double getHeight() {
      int[] var3 = Class055.m3218();
      Renderer044 var10000 = this;
      if (var3 == null) {
         if (this.f1312.m3053() != null) {
            return 30.0 + this.getFontRenderer().getFontHeight() / 2.0;
         }

         var10000 = this;
      }

      return var10000.getFontRenderer().getFontHeight() + 2.0;
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      long var6 = f1313 ^ 96420467973829L;
      int[] var18 = Class055.m3218();
      IRenderer2D var14 = this.getRenderer();
      IFontRenderer var3 = this.getFontRenderer();
      MatrixStack var12 = var1.pose();
      IGraphic var15 = this.f1312.m3053();
      String var5 = this.f1312.getTitle().getString();
      int[] var8 = var18;
      if (var8 == null) {
         if (var15 != null) {
            double var19 = 24.0;
            double var9 = ((org.rusherhack.client.Renderer044)(this)).getHeight() / 2.0 - 12.0;
            var14.drawGraphicRectangle(var15, var9, var9 - 3.0, 24.0, 24.0);
            var9 = var3.getStringWidth(var5) * 0.6;
            var9 = 0.5 + ((org.rusherhack.client.Renderer044)(this)).getWidth() / 2.0 - var9 / 2.0;
            var12.push();
            var12.translate(var9, 28.0, 0.0);
            var12.scale(0.6F, 0.6F, 1.0F);
            boolean var20 = true;
            var3.drawString(var12, var5, 0.0, 0.0, -1, true);
            var12.pop();
            return;
         }

         boolean var10008 = true;
         var3.drawString(var12, var5, 1.0, 1.0, -1, true);
      }
   }

   @Override
   public boolean m2770() {
      if (Globals.mc.currentScreen == this.f1312) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void m550() {
      Screen var3 = Globals.mc.currentScreen;
      if (Globals.mc.currentScreen != this.f1312) {
         Util040 var5;
         (var5 = this.f1312).m3050(var3);
         Globals.mc.setScreen(var5);
      }
   }

   public Renderer044(Class055 var1, Util040 var2) {
      super(var1);
      this.f1312 = var2;
   }

   @Override
   public double getWidth() {
      long var1 = f1313 ^ 130890020745779L;
      return ((org.rusherhack.client.Renderer044)(this)).getHeight();
   }

   static {
      m194();
   }
   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1315[var4] != null) {
         return var4;
      } else {
         Object var5 = f1314[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 57;
               case 1 -> 25;
               case 2 -> 53;
               case 3 -> 63;
               case 4 -> 20;
               case 5 -> 7;
               case 6 -> 32;
               case 7 -> 30;
               case 8 -> 52;
               case 9 -> 28;
               case 10 -> 35;
               case 11 -> 9;
               case 12 -> 5;
               case 13 -> 37;
               case 14 -> 34;
               case 15 -> 10;
               case 16 -> 38;
               case 17 -> 58;
               case 18 -> 55;
               case 19 -> 3;
               case 20 -> 47;
               case 21 -> 13;
               case 22 -> 4;
               case 23 -> 39;
               case 24 -> 19;
               case 25 -> 56;
               case 26 -> 27;
               case 27 -> 18;
               case 28 -> 15;
               case 29 -> 59;
               case 30 -> 41;
               case 31 -> 61;
               case 32 -> 2;
               case 33 -> 36;
               case 34 -> 60;
               case 35 -> 51;
               case 36 -> 46;
               case 37 -> 24;
               case 38 -> 17;
               case 39 -> 14;
               case 40 -> 42;
               case 41 -> 6;
               case 42 -> 22;
               case 43 -> 21;
               case 44 -> 12;
               case 45 -> 44;
               case 46 -> 16;
               case 47 -> 31;
               case 48 -> 33;
               case 49 -> 29;
               case 50 -> 54;
               case 51 -> 23;
               case 52 -> 48;
               case 53 -> 62;
               case 54 -> 49;
               case 55 -> 1;
               case 56 -> 26;
               case 57 -> 8;
               case 58 -> 50;
               case 59 -> 43;
               case 60 -> 0;
               case 61 -> 11;
               case 62 -> 45;
               default -> 40;
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

            f1315[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f1314[0] = "aG^\\G~}]\\\u0000]jm^\u0017\u0011Ybk[M\\Ό";
      f1314[1] = double.class;
      f1315[1] = "java/lang/Double";
      f1314[2] = ".j]I\u0010:2p_\u0015\n.\"s\u0014ȓ";
      f1314[3] = "t~\u0019Uqvhd\u001b\tkbxgP\u0018oj~b\nUΛ";
      f1314[4] = "&!\u000b\u001fiI:;\tCs]*8BRwU,=\u0018\u001fzL }+]t^(?\u001f";
      f1314[5] = "hd\u000e@wphd\u0019\u001c{\u007fr/\u0019\u0002{ju^I_*";
      f1314[6] = "M\u0003LWz\u001dM\u0003[\u000bv\u0012WH[\u0015v\u0007P9\fJ ";
      f1314[7] = void.class;
      f1315[7] = "java/lang/Void";
      f1314[8] = "ZZ<Zd7F@>\u0006~#VCu\u0017z+PF/Zҩ";
      f1314[9] = "N>";
      f1314[10] = "\u0000tWw\u001bF\u001cnU+\u0001R\fm\u001e:\u0005Z\nhDw\bC\u0006(B<\u0007W\nt\u001e>\u001bR\u001fnY:Gz(tQ)\u0001Z\f";
      f1314[11] = "[)\u0002Jc?G3\u0000\u0016y+W0K\u0007}#Q5\u0011Jp:]u\u0017\u0001\u007f.Q)K\u0002~$@u,\"~$@\t\u0000\nu/F>\u0017";
      f1314[12] = "g\u00192D:\u0000{\u00030\u0018 \u0014k\u0000{\t$\u001cm\u0005!D\u0081";
      f1314[13] = "\u001d\u0003YQ`3\u001d\u0003N\rl<\u0007HN\u0013l)\u00009\u0019J5m";
      f1314[14] = float.class;
      f1315[14] = "java/lang/Float";
      f1314[15] = "a\\8\f7-a\\/P;\"{\u0017/N;7|f~\u0017lu";
      f1314[16] = "\r~I^l\u001e\u0006qX\u0011\u0011\u0006\u0015vQX";
      f1314[17] = int.class;
      f1315[17] = "java/lang/Integer";
      f1314[18] = boolean.class;
      f1315[18] = "java/lang/Boolean";
      f1314[19] = ";kCj[\u001a'qA6A\u000e7r\n'E\u00061wPjH\u001f=7V!G\u000b1k\n\r{\n:}A6L\u001df]";
      f1314[20] = "\u0015c>=ub\ty<aov\u0019zwpk~\u001f\u007f-=fg\u0013?+vis\u001fcwAby\u001et+Phy\u000et!g";
      f1314[21] = ">U{:\u0017+5Zjuv%>Qn/";
      f1314[22] = "F\u0015vW\"XLE#.\"LUj#O\"AU*w\u0015&\u0019\u0018R<^|\u001d)";
      f1314[23] = "\u001a\u007f-[*\u0019\u0010/x\",`L?.\u001f>\u0007\u000e)z\u001eEY\n{(Y\"\u001b\u001c/)\"";
      f1314[24] = ")L\u00036p8aB[3\u001a'uTX0v\u0015\"\u0012\to'Bq\u0012V>&~%RE5\u001a+\"FQk&\u007fbUZWsxvA\u0004k'8eJ8j'r|VZ=h\u007fy(";
      f1314[25] = "#t8F\u007fW}(iP\u0015Qt5bXyc#t>\u0003-4p${O+H!)a\u0002\u0015";
      f1314[26] = "m*9M\b\u007fgzl4ո\u00068(;M\reftj[";
      f1314[27] = "0bt5>(<#\">Yԯ\r$xf>o= #`7S";
      f1314[28] = "\u0000&aK! ^z0]KǍ:$eI)y\u0002+'\t{C";
      f1314[29] = "\u0007[\u00198\u0006UE_F3z\u0000Z\u001ej1\u001c\u0013w\u000fE9\u001a\u00137[\u001f=B^O\u0010TgFo";
      f1314[30] = " \u001b~5Z\u000bh\u0015&00\u0014|\u0003%3\\&+Etl\u0001q,Bu0N\u0013{\rx50";
      f1314[31] = "d^,\ro_0F+\t\u001d\n9Y\u0005\u0017{\u0019\u000eH-\u001cp\u001f9_K@$X:Yq\u0002 \u00071%";
      f1314[32] = "8\bi#?P2X<Z?D+h06,IW\u000ej1h\u0018/E!kl)";
      f1314[33] = "\u0010\u0013]~ndP\u0013\u001d$\u0010bAVF$|P\u0015\u0017\u001e|\u0010;\u001dZ[,(?\u0015UYC-:\u001cNX!zu\u0011K&";
      f1314[34] = "Ig!ny(\u0017;px\u0013Ŵsf*gn$Kb\"hlKNg+sm)\u0019(&v\u0013";
      f1314[35] = "DH\u0007I5c\fF_L_|\u0018P\\O3NO\u0016\r\u0010c\u0019L\u0017W\u0010na\u0007\\\r\u0014_ NG\u0004\u0019'k\u0005\u001d\u0000(f\"\u001e\u0014\rP-iD\u0010<\u0015b)\u0011R^B-$\u0014,";
      f1314[36] = "h\u001b%A\u0005W*\u001fzJy\u0001\"Kgt\u0005\u00179Dw/H\tcCrU\u0000\u0007;F\u0018EG\u000e3F%C\u0007\u0013\"\"!\u0014\u0012UiZj_HQX\u001b#DA\\ Ph\u001eEm2^~\u0012\u001e\u00114_fQy\u0006=F{T\u0016Q2Li/@V3\u001a)W\u000b\u001di\u001e\u0018";
      f1314[37] = "c\nW4\u0004\u001d&\u0001S>4\u00132xVlOK'\u001b\u0016l\u000f\u0011";
      f1314[38] = "G@\u0017t\u0011?\u0007@W.o2\u001a\u0014\b%8eDDQISm\u000b\u0004\u0003qWe\u0004\u0006";
      f1314[39] = "eA\u00177= 4L\rz\u00033aP5;y=jCn-=?gHS+}\"v,";
      f1314[40] = "_,$)H\u0010\u0017\"|,\"\u000f\u00034\u007f/N=Tr.p\u0019jSu/,\\\b\u0004:\")\"";
      f1314[41] = "[|)\u001ck%\u000fd.\u0018\u0019p\u0006{\u0014\f\u007fs\u0006}#\u001b\u0019s[y'\u0010~q\r9ra";
      f1314[42] = "lh\u000e\\G).lQW;|1-hNAr:>lSWo<QY\fXx8l_LEi\\h\bY\u0003\"$#C\u0003\u0007\u0013";
      f1314[43] = "\r\u0004/\u0013%#\u0013G&H\\d\u0006\u0000%+mxZ\u001a\"Q%v\u0002\u001fH";
      f1314[44] = "$v P.7& `\u0005U<2/!v/90&?R\u000f=#:7_:4%Fa\u0007.2r~nEn`H\u007feRma04.\biPq}5\u0001d(:6o\u0005Uis-f\b-\"8wb9lk#~oA' yz^\u0004h`,8<S'm)F";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f1314[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1315[var4]);
            f1314[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m196(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m197(Class var0, String var1, Class var2) {
      Field var3 = m196(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m197(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m198(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f1314[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1315[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f1314[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1314[var4] = var13;
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
               var12 = m195(1533939845604438L, 0L);
            }
         }
      }
   }

   public static Method m199(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m200(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m199(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m200(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m201(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f1314[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1315[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m195(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m199(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f1314[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(1533939845604438L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m200(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f1314[var4] = var19;
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
               var23 = m195(1533939845604438L, 0L);
            }
         }
      }
   }

   public static MethodHandle m202(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'x' && var8 != 'L' && var8 != 202 && var8 != 252) {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 223) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 165) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'x') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'L') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 202) {
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

   public static Object m203(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m202(var0, var1, var2, var3, var6, var9);
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer044.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/ι" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
