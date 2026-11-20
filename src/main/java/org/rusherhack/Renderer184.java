package org.rusherhack;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.ui.panel.PanelBase;
import org.rusherhack.core.utils.ColorUtils;

public class Renderer184 extends Class517<ColorSetting> {
   public static long f3582 = Class066.m4320(5172996088723431121L, 4693526558836369063L, MethodHandles.lookup().lookupClass()).m4325(171057716613991L);
   public static Object[] f3583 = new Object[44];
   public static String[] f3584 = new String[44];

   @Override
   public boolean m5207() {
      return super.m5207();
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      int var8 = var5;
      if (var5 == 0 && !this.m5380().isEmpty() && this.m5378(var1, var3)) {
         var8 = 1;
      }

      return super.mouseClicked(var1, var3, var8);
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      long var6 = f3582 ^ 48844869498778L;
      IRenderer2D var9 = this.getPanel().getRenderer();
      this.getPanel().getFontRenderer();
      super.f6219 = this.m9517(var2, var4);
      super.render(var1, var2, var4);
      var9.drawOutlinedRectangle(
         ((java.lang.Double)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "æ", java.lang.invoke.MethodType.methodType(double.class, java.lang.Object.class, long.class, long.class)), this,  4250507622776913615L,  var6))).doubleValue() - 22.0,
         2.0,
         8.0,
         8.0,
         1.0F,
         ColorUtils.transparency(((ColorSetting)super.f8251).getValue().getRGB(), 1.0F),
         Color.BLACK.getRGB()
      );
   }

   public Renderer184(PanelBase<?> var1, Renderer107 var2, ColorSetting var3) {
      super(var1, var2, var3);
      this.addSubItem(new Class212(var1, this, var3));
      if (var3.isThemeSyncAllowed()) {
         this.addSubItem(new Class237(var1, this, var3));
      }

      if (var3.isRainbowAllowed()) {
         this.addSubItem(new Class147(var1, this, var3));
      }
   }

   static {
      m3938();
   }
   public static int m1730(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3584[var4] != null) {
         return var4;
      } else {
         Object var5 = f3583[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 51;
               case 1 -> 60;
               case 2 -> 21;
               case 3 -> 46;
               case 4 -> 11;
               case 5 -> 18;
               case 6 -> 12;
               case 7 -> 8;
               case 8 -> 43;
               case 9 -> 5;
               case 10 -> 10;
               case 11 -> 61;
               case 12 -> 2;
               case 13 -> 39;
               case 14 -> 14;
               case 15 -> 55;
               case 16 -> 38;
               case 17 -> 6;
               case 18 -> 44;
               case 19 -> 48;
               case 20 -> 27;
               case 21 -> 26;
               case 22 -> 1;
               case 23 -> 23;
               case 24 -> 22;
               case 25 -> 33;
               case 26 -> 13;
               case 27 -> 16;
               case 28 -> 17;
               case 29 -> 59;
               case 30 -> 4;
               case 31 -> 42;
               case 32 -> 32;
               case 33 -> 28;
               case 34 -> 62;
               case 35 -> 7;
               case 36 -> 41;
               case 37 -> 29;
               case 38 -> 57;
               case 39 -> 45;
               case 40 -> 56;
               case 41 -> 49;
               case 42 -> 34;
               case 43 -> 54;
               case 44 -> 40;
               case 45 -> 63;
               case 46 -> 37;
               case 47 -> 31;
               case 48 -> 36;
               case 49 -> 52;
               case 50 -> 24;
               case 51 -> 3;
               case 52 -> 9;
               case 53 -> 15;
               case 54 -> 30;
               case 55 -> 47;
               case 56 -> 58;
               case 57 -> 20;
               case 58 -> 19;
               case 59 -> 35;
               case 60 -> 25;
               case 61 -> 53;
               case 62 -> 50;
               default -> 0;
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

            f3584[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m3938() {
      f3583[0] = "/H\f\u0019=\u000f3R\u000eE'\u001b#QEƿ";
      f3583[1] = "WT_\u0007?GKN][%S[M\u0016ɝ";
      f3583[2] = "\u001d_T\"F]\u0001EV~\\I\u0011F\u001dȊ";
      f3583[3] = int.class;
      f3584[3] = "java/lang/Integer";
      f3583[4] = "\u000f\u0016,+\u001bJ\u0013\f.w\u0001^\u0003\u000fe÷";
      f3583[5] = "\u0014&G+=j\n.]d_v\r3";
      f3583[6] = double.class;
      f3584[6] = "java/lang/Double";
      f3583[7] = boolean.class;
      f3584[7] = "java/lang/Boolean";
      f3583[8] = "X\u0010tKI\u0001D\nv\u0017S\u0015T\t=\u0006W\u001dR\fgKZ\u0004^Lf\f\u0015\u0004V\fv\t\u0015$V\fv\ty\u0015D\u0007";
      f3583[9] = "kHL=6KwRNa,_gQ\u0005p(WaT_=%Nm\u0014Yv*ZaH\u0005u+Pp\u0014bU+PphN} [v_Y";
      f3583[10] = ".m@p[/2wB,A;\"t\t=E3.qSpH*(1U;G>$m\t\u0017{?/{B,L(s[";
      f3583[11] = "s]j+\u001dioGhw\u0007}\u007fD#ζ";
      f3583[12] = "\"\u0005\u0018JK\u0015>\u001f\u001a\u0016Q\u0001.\u001cQ\u0007U\t(\u0019\u000bJX\u0010$Y\f\u0001M\u0014$\u0019\u0018Jz\u000f!\u0018\r7\\\u00149\u001e\u0011\u0003";
      f3583[13] = "Fv\u007fF]1[c'd\u001c<Ce";
      f3583[14] = "g\u0006Bbyp{\u001c@>cdk\u001f\u000b/dwmZP8bi{Zf#gjz!Q%gv";
      f3583[15] = float.class;
      f3584[15] = "java/lang/Float";
      f3583[16] = "q\u0016\u001fT<#m\f\u001d\b&7}\u000fVə";
      f3583[17] = "\u000f\u0016ng \u000f\u0013\fl;:\u001b\u0003\u000f'*>\u0013\u0005\n}g3\n\tJ| |\n\u0001\nl%|*\u0001\nl%\u001b\u000e\u0005\tK(!\u001f";
      f3583[18] = void.class;
      f3584[18] = "java/lang/Void";
      f3583[19] = "M<~o\n\u0007Q&|3\u0010\u0013A%7ӳ";
      f3583[20] = "h%\u001a:aSt?\u0018f{Gd<Sw|Tby\u000eqgRn9\u001a:@Cs#\u0014zt";
      f3583[21] = "XL\u0001SI-DV\u0003\u000fS9TUH\u001eW1RP\u0012SZ(^\u0010\u0013\u0014\u0015(VP\u0003\u0011\u0015\u0011g_\b\u0018W\u0011C[\u000b";
      f3583[22] = "g\u001e%G\u0007Xl\u00114\bfVg\u001a0R";
      f3583[23] = "\u0018iL2\u001c\u0010M0M1#\u001aK)s0E\t|8[;N\u000fK/=iMI\u001ajP5]\u001bJU";
      f3583[24] = "7h/!@\u0019b1.\"\u007f\u0013d(\u0004)\u0019\u0010d.3>\u007fCm& \u007f\u0000Bk6\"D";
      f3583[25] = "&%\u0018\b\u0017u1\"\u0004w\u0007\u00146z]\b\u001f(4,Zw\u0011+s:\u0016K\u0013}tE";
      f3583[26] = "S(z`\u0018$\u00041|lgԪjk8;\u0001.\u000e(=\u007f\fJ";
      f3583[27] = "_\u0001\u0018*\u0015{\u0016C\u0012fg{\tM!:\u000bh\u00041B\"[k\u0014T\u00029\u000edd";
      f3583[28] = "*-^~\u000b\u001b}4XrtȬ\u0013n\u001c%\u0012\u0011w-\u0019a\u001fu";
      f3583[29] = "\u0005/\u0015=s*S2\\z\u0017sN\u000bDbqxR.dgsuJ<A\u0003*\"N2Vl+y\u000bi-";
      f3583[30] = " KM&4>i\tGjFм\u001b@Uk9.k\u0002\u00177=Q";
      f3583[31] = "j\rGF\u0012)<\u0010\u000e\u0001vp!/\u001f\u0015\u0013|\u0001\u0002\u0019\u0013?u>\u0014\u0000\u0015\u001a\u0011gC\u0004\u001b\r~f\u0018A@v";
      f3583[32] = "v}5`?qsm39\u0000fpjR#jN`kl^m~lkp3r>%;\t5a4l~1d~`\u007f\u0006";
      f3583[33] = "ctLT\u0018t:<MYdԘS\u007fM\u0018\u0002y7<H\\\u000f";
      f3583[34] = "t\u0016uQv\u0018=T\u007f\u001d\u0004ƤO\u001aj\u001c{\u0007*ZqItws_/_t\u00123DzP\u0004J\u007f]p[kK$\u0018+ ";
      f3583[35] = "~\"\u000eFX^(?G\u0001<\t# h\u0011X\u001b#\\\u0007GP\btl\\\u0011\u0004\fN";
      f3583[36] = "E\u0002`Zv\u0012LR;IL\u0007VT:H4\u0012VP:X={\u0016\u0001`U(\u001fU\u0004$XL\u0012^T6V7\u000bSY%3vG\u0010[8W5BTV\\";
      f3583[37] = "6M}GO\u0000t\u000f!C0\u0011v~$@L\u0001\r\u000eqCS\u000bb\u000f*\u0006\bp";
      f3583[38] = "u)1+\\q.\u007fe/f\u000b\u0000_\u0016\u0006fp{z3\u007fV+-.7";
      f3583[39] = "l\u0001<1e!c\\du\u001dρ\u0006\u0001~1b5cAedmE:D;rm z_n}\u001d\u007f:\u0001aiy<?El\r";
      f3583[40] = ">VN[@z;FH\u0002\u007fk9Q*\f\u0019i0-LY\u000eakH\u0019\u0000\u000fbT";
      f3583[41] = "RkV/v/\t=\u0002+Lp\u000e(`\u000e\u0006\u001fYh\u0006'({\u001amB*L";
      f3583[42] = "SG\u0003a\u001dERA\u0013c&V\u0016J\u000eX[F\bB\u0017rJ`\u0001H\rv@U\bNq#_\u0006\u0013S\u0014cDS\u001c#Mf\u001aE\u001cF\r}OJl\u001f\b#YJ\t_\u0013vV:PZM`V_\u0010A\u0018o&S\u001eJ\u001bz]J\u0013G\b\u001f\u001c\u0006PE\u0015{_\u0003\u0014Hq%\u001a\u0006\nG\u0015f\u001fB\u0007#\u001a~\u001dJ\u0014\u001bKaIYl";
      f3583[43] = ",\u0018\u0018\te4?\u0003\u0018N\u001bт@\u0017\u0016\u0003cf \u0006\u0004\u0013p";
   }

   public static Class m1732(long var0, long var2) {
      Class var5 = null;
      int var4 = m1730(var0, var2);
      Object var6 = f3583[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3584[var4]);
            f3583[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m1733(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m1734(Class var0, String var1, Class var2) {
      Field var3 = m1733(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m1734(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m1735(long var0, long var2) {
      int var4 = m1730(var0, var2);
      Object var5 = f3583[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3584[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m1732(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m1732(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m1733(var12, var10, var11);
            if (var13 != null) {
               f3583[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m1734(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3583[var4] = var13;
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
               var12 = m1732(1571553465656145L, 0L);
            }
         }
      }
   }

   public static Method m1736(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m1737(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m1736(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m1737(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m1738(long var0, long var2) {
      int var4 = m1730(var0, var2);
      Object var5 = f3583[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3584[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m1732(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m1732(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m1736(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f3583[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m1732(1571553465656145L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m1737(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f3583[var4] = var19;
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
               var23 = m1732(1571553465656145L, 0L);
            }
         }
      }
   }

   public static MethodHandle m1739(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 245 && var8 != 'l' && var8 != 'H' && var8 != 242) {
            var11 = m1738(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 230) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 250) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m1735(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 245) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'l') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'H') {
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

   public static Object m1740(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m1739(var0, var1, var2, var3, var6, var9);
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer184.class, "m1740", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ƈ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
