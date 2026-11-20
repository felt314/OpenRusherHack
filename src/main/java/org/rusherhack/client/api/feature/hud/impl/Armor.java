package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.hud.ResizeableHudElement;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.module.impl.render.Nametags;
public class Armor extends ResizeableHudElement {
   public BooleanSetting autoadjust;
   public BooleanSetting hotbarlock;
   public double f4242;
   public EnumSetting<ArmorDurability> durability;
   public EnumSetting<ArmorAxis> axis;
   public static long f4245 = Class066.m4320(8590507189558229041L, 5101297253019826020L, MethodHandles.lookup().lookupClass()).m4325(259839784559903L);
   public static String[] f4246;
   public static String[] f4247;
   public static long[] f4249;
   public static Integer[] f4250;
   public static Map f4251;
   public static Object[] f4252 = new Object[113];
   public static String[] f4253 = new String[113];

   public Armor() {
      super("Armor");
      this.durability = new EnumSetting<>("Durability", ArmorDurability.f6032);
      this.axis = new EnumSetting<>("Axis", ArmorAxis.f6044);
      boolean var10006 = true;
      this.hotbarlock = new BooleanSetting("HotbarLock", true).setVisibility(() -> {
         return this.axis.getValue().equals(ArmorAxis.f6044);
      });
      boolean var10005 = true;
      this.autoadjust = new BooleanSetting("AutoAdjust", true).setVisibility(() -> {
         return this.axis.getValue().equals(ArmorAxis.f6044);
      });
      this.f4242 = 9.0;
      boolean var10003 = true;
      this.hotbarlock.addSubSettings(this.autoadjust);
      Setting[] var10001 = new Setting[]{this.durability, null, null};
      var10005 = true;
      var10001[1] = this.axis;
      var10001[2] = this.hotbarlock;
      this.registerSettings(var10001);
   }

   public int m8755() {
      long var1 = f4245 ^ 127236485905886L;
      if (!(Boolean)this.autoadjust.getValue()) {
         return 0;
      } else {
         int var4 = 0;
         if (!Globals.mc.player.isCreative()
            && (
               Globals.mc.player.isSubmergedIn(FluidTags.WATER)
                  || Math.min(Globals.mc.player.getAir(), Globals.mc.player.getMaxAir()) < Globals.mc.player.getMaxAir()
            )) {
            var4 = m175(32512, 1332442698619376063L ^ var1);
         }

         Entity var7;
         if ((var7 = Globals.mc.player.getVehicle()) instanceof LivingEntity) {
            LivingEntity var5;
            int var10000;
            if ((var5 = (LivingEntity)var7).isLiving()) {
               var10000 = (int)(var5.getMaxHealth() + 0.5F) / 2;
            } else {
               var10000 = 0;
               boolean var10002 = true;
            }

            int var8 = var10000;
            if (var8 > m175(24738, 256167297618365979L ^ var1)) {
               var8 = m175(23438, 7619310303243924787L ^ var1);
            }

            int var9 = (int)Math.ceil(var8 / 10.0);
            if (var8 == 0 && Globals.mc.interactionManager.hasStatusBars()) {
               var9 = 1;
            }

            return var4 + m175(4284, 5018168998200229378L ^ var1) * var9 - m175(4284, 5018168998200229378L ^ var1);
         } else {
            return Globals.mc.player.isCreative() ? m175(2099, 3965760044911306383L ^ var1) : var4;
         }
      }
   }

   @Override
   public boolean shouldUpdateAlignment() {
      return false;
   }

   @Override
   public void postRender(RenderContext var1, double var2, double var4) {
        
    }

   @Override
   public double getHeight() {
      return this.axis.getValue().equals(ArmorAxis.f6045) ? 76.0 : 19.0 + (!this.durability.getValue().equals(ArmorDurability.f6032) ? this.f4242 : 0.0);
   }

   @Override
   public double getWidth() {
      return this.axis.getValue().equals(ArmorAxis.f6044) ? 76.0 : 19.0 + (!this.durability.getValue().equals(ArmorDurability.f6032) ? this.f4242 : 0.0);
   }

   @Override
   public void renderContent(RenderContext var1, double var2, double var4) {
        
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
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12965;
      if (f4250[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f4249[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f4251.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f4251.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ǫ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f4250[var3] = var15;
      }

      return f4250[var3];
   }

   public static int m176(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m175(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Armor.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ǫ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m273() {
      f4252[0] = " NBM\u0010\u0016<T@\u0011\n\u0002,W\u000bƉ";
      f4252[1] = "\u0012\f+\u001fz~\u000e\u0016)C`j\u001e\u0015bRgy\u0018P?T|\u007f\u0014\u0010+\u001fMe\b\u0013\u001fT|\u007f\u0014\u0010+";
      f4252[2] = "Z\u000f\u0002\u0014\u001erF\u0015\u0000H\u0004fV\u0016KΥ";
      f4252[3] = "$\u0005\u000em\u0010F/\n\u001f\"qH$\u0001\u001bx";
      f4252[4] = boolean.class;
      f4253[4] = "java/lang/Boolean";
      f4252[5] = "1\u0004t:S@-\u001evfIT=\u001d=wNG;X`qUA7\u0018t:rP*\u0002zzF";
      f4252[6] = ">mX0\u001a?\"wZl\u0000+2t\u0011ɪ";
      f4252[7] = "lF\nQL\u0002p\\\b\rV\u0016`_Cɹ";
      f4252[8] = int.class;
      f4253[8] = "java/lang/Integer";
      f4252[9] = "XI_d\u0011CDS]8\u000bWTP\u0016ϗ";
      f4252[10] = double.class;
      f4253[10] = "java/lang/Double";
      f4252[11] = "\u001eK6)h.\u0015D'f\u0004-\u001bF%)(";
      f4252[12] = "GgD2\"\u0014n^X( HtJH+kYsYNn6_h_B.\"\u0014ON_4,T{\u0010";
      f4252[13] = void.class;
      f4253[13] = "java/lang/Void";
      f4252[14] = "D\u000bEUd\fX\u0011G\t~\u0018H\u0012\f\u0018z\u0010N\u0017VUw\tBWW\u00128\u000eB\u0017F\u0014aW|\u0010L\u001fy\u000e}\u0010G\f^\u0018E\u001dN\u001ed;J\nG";
      f4252[15] = "7(?+>\f<'.dC\u0014/ '-";
      f4252[16] = "\u001cRd\u0012<U\u0000HfN&A\u0010K-_!R\u0016\u000epY:T\u001aNd\u0012\fO\u001cLf] s\u0016TwU G";
      f4252[17] = "iLZ\u0016jGwD@Y\"GmNX\u001e+\\-oC\u0018(WbC\u007f\u00024BoDI\u0005";
      f4252[18] = "EI\u0004k^SYS\u00067DGIPM&CTO\u0015\u0005 MR_I\u0006ke`OZ\u00170^CiT\r#EA_I\u0002'@C";
      f4252[19] = "\rD&l\\H$}:v^\u0014>i*u\u0015\u00059z,0H\u0003\"| p\\H\u0005m=jR\b13";
      f4252[20] = "]o#M%5Au!\u0011?!Qvj\u000082W31\u0017>,A3\u0010\n:%@";
      f4252[21] = "\u001a%#\u001e$q\u0004-9QCp\u001564\u000bev";
      f4252[22] = "q>2\u0005S\u0017m$0YI\u0003}'{HM\u000b{\"!\u0005@\u0012wb'NO\u0006{>{MN\fjb\u001cmN\fj\u001e0EE\u0007l)'";
      f4252[23] = "\u001e/c\r~\"\u001e/tQr-\u0004dtOr8\u0003\u0015&\u0014*r";
      f4252[24] = "+>\u000bk=R7$\t7'F''B&#N!\"\u0018k.W-b\n .S1>\tk'R b$0+b()\u0001 !S";
      f4252[25] = "\u0004dv]W\t\u0004da\u0001[\u0006\u001e/a\u001f[\u0013\u0019^6F\u0002W";
      f4252[26] = "Cg`82!Cgwd>.Y,wz>;^]#\"i";
      f4252[27] = "yj\nK\u001b\u0001yj\u001d\u0017\u0017\u000ec!\u001d\t\u0017\u001bdPOS@Y";
      f4252[28] = "aT\u0014Z\u0000FaT\u0003\u0006\fI{\u001f\u0003\u0018\f\\|nQDY\u001e";
      f4252[29] = ">\bX<w1\"\u0012Z`m%2\u0011\u0011qi-4\u0014K<d48TMwk 4\b\u0011@`*5\u001fMQj*%\u001fGf";
      f4252[30] = "s9e6CM\u007f1d}\nA\u007f;ewJ\fs9dtAAdxDqWVc";
      f4252[31] = "W\u001f%;|\u0002I\u0017?t\u001e\u001eN\n";
      f4252[32] = "NpPR\t\tNpG\u000e\u0005\u0006T;G\u0010\u0005\u0013SJ\u0017MT";
      f4252[33] = "/\u0018/Vgs3\u0002-\n}g#\u0001fŤ";
      f4252[34] = "\u001d53l`Q\u001d5$0l^\u0007~$.lK\u0000\u000fuq:\t";
      f4252[35] = "E^uVo>YDw\nu*IG<\u001bq\"OBfV|;C\u0002U\u0014r)K@a";
      f4252[36] = float.class;
      f4253[36] = "java/lang/Float";
      f4252[37] = "hMS`cTtWQ<y@dT\u001a-}HbQ@`pQn\u0011F+\u007fEbM\u001a\u0007CDi[Q<pCkZ\u0006\n";
      f4252[38] = "\u00133\u00069gk\u000f)\u0004e}\u007f\u001f*Otyw\u0019/\u00159tn\u0015o\u0013r{z\u00193O^G{\u0012%\u0004eplN\u0005";
      f4252[39] = "<Zw7\u001a4 @uk\u0000 0C>ɲ";
      f4252[40] = "c}li\b\u0002\u007fgn5\u0012\u0016od%$\u0016\u001eia\u007fi\u001b\u0007e!y\"\u0014\u0013i}%\u000e(\u0012bkn5\u001f\u0005";
      f4252[41] = "-(<8iy&'-w\nt3!";
      f4252[42] = "bPe\u0017 HbPrK,Gx\u001brU,R\u007fj\"\ru\u0017";
      f4252[43] = "\u0012`*\u000f\u000bo\u0012`=S\u0007`\b+=M\u0007u\u000fZh\u0019P4";
      f4252[44] = "8\u000b\u001fW-\u001a8\u000b\b\u000b!\u0015\"@\b\u0015!\u0000%1]Jv";
      f4252[45] = "QDFQC\u0016QDQ\rO\u0019K\u000fQ\u0013O\fL~\u0003M\u0017H";
      f4252[46] = "\u001ahQ\b\u001d;\u001ahFT\u00114\u0000#FJ\u0011!\u0007R\u0014\u0015@k";
      f4252[47] = "TS\u001aPb#\u0011SEQ\u0010А.\u000eE\u000e\u007f\"JT\u0016]~_AVM\u0004*cA\u0003X[\u0010bR\u000fP\u0003!\"\u0016QV`-#O\u0014IQmg\u0011\u0012*Q/cC\u0002D\u0010w#Cn";
      f4252[48] = "\u0007<\u000f\u00178u[.R\u0013@kQ*C\u0014\u0007{8u\u0005\u0006$q\u00041\u0002\u001c=\u0015\u0007<\u000f\u00178u[.R\u0013@";
      f4252[49] = "\u0012\u0006<]t1E\u0007%eƬHPL&T!,\u001e\u0012!";
      f4252[50] = "O\u001f&632\u0018\u001e?\u000e0KO\u00061~0rK[->Yw\u0011\n/g`sL\u0016o\u000e";
      f4252[51] = "\u0003am\u000f\u000bl\u0000a;\u0007{~\u0003~~\f<nj'\u007f\u0000\u0001c[g;^\u0007\u0000\u0003am\u000f\u000bl\u0000a;\u0007{";
      f4252[52] = "\u0016Q{,%\u001eVKc6H\u0006\fF\u0001j4\u0002\u0017C0*p\\\u0011 <+)\u0019\u000e\u0011|ow\u001fm\u001d}62\u0000\\]9h4c";
      f4252[53] = "\u0014hCXt\u001e\u00142T\u0007\u001e\u0010\u0018pQ\\r\"J7\n\u0004\u001eNNsU_\"\nIiL;";
      f4252[54] = "5iZ\u0014\u0013U53MKy[9qH\u0010\u0015ii=\u0015Ky@*0QNC\u0002:cVw";
      f4252[55] = "\u0006^1\\\\5\u0006\u0004&\u00036;\nF#XZ\t\\\u0003~\u0003\u0006^\u0006J2MLg\u0007\u0006xB6";
      f4252[56] = "\u0011T\u0017\u001c=3A\u0014JB\u00019\u0017C\u0010\\}.\u0000w\u001c[}\"\u001cC\n'm,\u0018R\u0017N;{\u0004Wq\u0016>\u007f\u0017@\u001fWf?\u0017,";
      f4252[57] = "\u001f:@3JmEi\u001327l\u0012)N;[^Eo\u001fd\f\tNj\u00121[g\u000f2R17";
      f4252[58] = "\u0015S?\u001e\u0001\u0016BR&&вo\u0016\u0010%VT\fCH!\u0017";
      f4252[59] = "\u0012AAFp\u0015\u0012\u001bV\u0019\u001a\u001b\u001eYSBv)N\u001b\r\u0014\u001aC\u000fDIF+\u0003K\u001aO%";
      f4252[60] = "\u0011o79\u0004&\u0016!su5\u007f\u0003#n.YMS`6x5!U j-\teR:sI";
      f4252[61] = "7$3\u0004ks6p1\u0011\u00042>5=\u001a\u007f%S/,^zx(..\u000e>H77n\u001e4365>Z\u0004";
      f4252[62] = "P E7\u001d_\u0010:]-pIF0[LO\u001aH!\u0000/\u001aBL`?sHA[n\\&\u0010E\u001aQ";
      f4252[63] = "\u001f3$\u0011\u0005gH2=)ɜ\u001e\u001e4<S\f/^pbUo";
      f4252[64] = "\u0013q\u0002?L[\u001c8D|<Ҋu.C.X[I.\u00161\u0007aH=\u001a9_P\byD?<";
      f4252[65] = "\u0003\r37\u001d\u0007\u001a\u0001?h \u000b\u001e\\=kw\\B\f`8 \u0018BS'yY]\u0000Zb";
      f4252[66] = "'{\\V$>}jP\n[\u007f\u0016bYU5#zaY\u0003=S\u007fpLU+?|p\u001a][";
      f4252[67] = "tu\u0017-U\u0006t \u0002ro_v1\u0010.\u0003m$|Nqo\u0001 2\u0014-SE'(\rI";
      f4252[68] = "\u00060\u001c#\r8W4\u0006-r3A#\u00146\t^\u0002c\u00109\u0016g_,\u000f3re\u0003!\u00196N!\u0004;\u0000R";
      f4252[69] = "W\u0010/\u0010c8X\u0010&Z\t6Z\u0006\r\fo%m\u0017%\u0007d#Z\u0000C\u0005p9\b\u0010%\u0006x6Vz";
      f4252[70] = "#F[h;4}JOoZi/-O;'4+TT>3w";
      f4252[71] = "+\u0016j\u0002$\u001a+L}]N\u0014'\u000ex\u0006\"&wM$QNL6\u0013b\u0002\u007f\frMda";
      f4252[72] = "\u00146@~\u0001G\u0017>O kN\u00173{=\u0011@\u001c \u007f \u0007]\u001aOI:\u0005O\n#J:SGzp\u0018\"\u001b\u001e\u0019%@&Z!";
      f4252[73] = "\u0010Z\u0004\u00145q\u001bFXL\u0005,\u0014[ \u001fu0}\u001b]\ra(A_Z\u0017xL";
      f4252[74] = "%\\D\u0005\u0006QtX^\u000byX\u001b\fK\u0015\bH}]O\u000f\u0006";
      f4252[75] = "\u0001x,^n\u000eYq(\u0010\rV\u000evwIad_7/\u0014\r\u000e\u001fkmM<N[5k.";
      f4252[76] = "\n})j\fR[y3dsy4-&z\u0002KR|\"`\f";
      f4252[77] = "h+f\u001e)'c7:F\u0019|h!xx#'h:`A~hw0\u0004";
      f4252[78] = "\u001fwCQ\u0017o\u001c\u007fL\u000f}e\u000bg\\5\u0001s\u0010hLn\u0014r\u001f`S\u0002\u0017rIh#QEj\u00011@\u0004\u001dn@\u000e\u001cV\u001eyNmI\u000e\u001a8q3_\u000f\u0007j@s\u001bQ\u0001\tN6@\u001eBj\u001bnD_}";
      f4252[79] = "vJi]\u001b\u001b1\\3\u0006wՆK\u0018s\u0003\rEzX7]\u000b&";
      f4252[80] = "PDh0kfP\u0011}oQ?R\u0000o3=\r\u0000M4jQgC\u001du7`'\u0007CsT";
      f4252[81] = "j8fyX\u0010-.<\"4ɴWj|'NNf*8yH-";
      f4252[82] = "w-)y7$u10'\u000b:g 6\"g\b0mnu\u000bd1#2!7 69+E";
      f4252[83] = "\u0010<9\u000ff:\u001f<0E\f \u001d*\u000e\be!\f\u0006UK48\u0000i6\u001el<AVdK06\u001c8%\u0013p6p";
      f4252[84] = "{f`\u0001\u0019 e7sZ\u007f'oe{\u0002\u007f-mdu\u0019\u001bw>7td\u00114b5p\u0002\u0012<mk\u001aU@qoft\u0014\u00181o\n";
      f4252[85] = "z1@<\"Qy9ObHXy4nd.KT%Al(K\u0014w\u0018`8\bw\"@dy7";
      f4252[86] = "\u00184*${fBgy%\u0006g\u0015'$,jUBaus7\u0002Idx&jl\b<8&\u0006";
      f4252[87] = "l0<}\u0006@;1%EԀ9: =t\t\\-* t";
      f4252[88] = "\u001fh=&\u001d2\bb &x,\u0018\u007f\u001bv\u00036\u001fb!v\u0004&uh*/I0\bdy/\u0005W\u001fh=&\u001d2\bb &x";
      f4252[89] = "L\u001ecGp\f\u0014\u0017g\t\u0013TC\u00108P\u007ff\u0012Ph\t\u0013\fR\r\"T\"L\u0016S$7";
      f4252[90] = "[\tz\u001bSe@\fnX<r_ZcOk%\u0001\t>#AmA\u000b;XCqXU";
      f4252[91] = "~GNQ\u001anp\u0016MNh:\u0013\u0016KQ\u0006f\u007f\u0015K\u0007\u000e\u0016z\u0004^Q\u0018zy\u0004\bYh";
      f4252[92] = "\u0019Y9\tY\u001e\u001e\u0017}EhG\u000b\u0015`\u001e\u0004uXQ>BhZ]\u0017pE\tR\u0000\u0018?y";
      f4252[93] = "\u0018\tg>iyC\u0019:-\u00199\u001c\u0019kOy.\u0015\r{+#}F\f\u0006";
      f4252[94] = "\r4sAqj^mvS\u0013w4j*\u000ebzF9s\u000bp";
      f4252[95] = ":A(2J\u0006wC1|0\u001bk\u0007\u0011*T\tk{u~]\u001fbB(1B\u0015\u0006";
      f4252[96] = "l=b\u0019\u0007\u0002?dg\u000be\\Uc;V\u0014\u0012'0bS\u0006";
      f4252[97] = "CL\u001cK@\u001b\u0006LCJ2ׯ9\u0011C\u0015]\u001a]K\u0010F\\gVIK\u001f\b[V\u001c^@2ZE\u0010V\u0018\u0003\u001a\u0001NP{\u000f\u001bX\u000bOJO_\u0006\r,\u0002^\u001d\\\u0017A\u001c\u000f\u000e\u0007qB\u0002RXS\u0017A\n]\u00069@\u0013G_\u000bW\u0001K\u0007_g";
      f4252[98] = "\"\u0006ve\u0015K\"Sc:/\u0012 BqfC r\u000f(0/J1_kb\u001e\nu\u0001m\u0001";
      f4252[99] = "g\u0006\n\u0001~=|\u0003\u001eB\u0011!oD\u0017^}\u00138\u0002I\t*D`JLIry8CH\u0007\u0011";
      f4252[100] = "D\u001cY\u0003Z\u001c\t\u001e@M \u0007\u0014Je\u000fJ5\u0015ZB\u0013F\u0001\u0003&R\u001dB\u0010\u001eO\u0004J^\u0015x\u0017\u0001NM\u0002\u0016VY\u000eMn";
      f4252[101] = "\u0007:r16\u000bP;k\tȔrEph8c\u0016\u000b.o";
      f4252[102] = "A\u001f\u0015z\u0010|N\u001f\u001c0zfL\t\"}\u0013g]$y>B~QJ\u001ak\u001az\u0010uH>FpM\u001b\tf\u0006p!";
      f4252[103] = "q_\u000f\u0018\u0003\u0001p\u0013E\u0017yVqB\u001a\u0006.\u0007-\u0013Nj\u001e\u0007bV\u0002\u0018\u0010B`T";
      f4252[104] = "F<n\u007fG_G>>;wE^-*h\u000bCX@={\u0015B\u0012}6gI\u001a\"";
      f4252[105] = "l^$v\u000bK0LyrsA4Kqu\u001aM\rEqe\u001e+h\u0017j|\u0017\u0017,\u0010pes";
      f4252[106] = "\u001d\u000eYtr(NW\\f\u00107]\u0014\u000eakZ\u001eT\nntcC\u001b\u0015d\u0010a\u001f\u0016\u0003a,%\u0018\f\u001a\u0005";
      f4252[107] = "bt)N\u001d\u00015u0vՋx4d(G\u0012\u001d#n5G";
      f4252[108] = "\u0002\u0010\t/\u0017^\u0014B\b(l\u0002\u001fCr&SS\u0014C\u001cg\u000b\u0013\u0014/";
      f4252[109] = "sm\u0017<\u00026s7\u0000ch8\u007fu\u00058\u0004\n/6Z`h /k\u001b!\u0011emb^_Sfmm\u0001c\u0017awte";
      f4252[110] = "<\u0002\u001eB\u0001N'\u0007\n\u0001nY8Q\u0007\u00169\u000ef\u0006_z\u000fS+_\t\u0011\u000f\t<\u0000";
      f4252[111] = "o1l\u0018g\u001b5b?\u0019\u001a\u001ab\"b\u0010v(3`>N$\u007fwe|\u0007&\u001e\u007f8sH\u001a\u00074 rK{\u000fi/=wbDq.>\u0016j\u0019~a\u0002F%Cb2l\u0007}\u0003b^";
      f4252[112] = "B\u001d^el\u0017C\u0019\\c\u0007\u0012W\u0006tla\u0011W\u0000C{\u0007\u0004V\u0000Kgj\u001a\u0007\u0013\u0010\u0001";
   }
   public static Field m275(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m276(Class var0, String var1, Class var2) {
      Field var3 = m275(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m276(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }
   public static Method m278(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m279(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m278(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m279(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }
}
