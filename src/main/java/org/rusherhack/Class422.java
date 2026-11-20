package org.rusherhack;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.core.utils.ColorUtils;

public class Class422 extends Class573 {
   public ItemStack f7029;
   public DefaultedList<ItemStack> f7031;
   public static long f7032 = Class066.m4320(4242686976343789555L, 6829635954204896613L, MethodHandles.lookup().lookupClass()).m4325(219363261733194L);
   public static long[] f7033;
   public static Integer[] f7034;
   public static Object[] f7036 = new Object[90];
   public static String[] f7037 = new String[90];

   @Override
   public int m13575() {
      return ColorUtils.transparency(Color.GREEN.getRGB(), 0.25F);
   }

   public boolean m13576() {
      int var10000 = Class253.m9155();
      Iterator var5 = this.m17579().iterator();
      int var3 = var10000;

      while (var5.hasNext()) {
         boolean var6 = ((ItemStack)var5.next()).isEmpty();

         while (var6) {
            var6 = false;
            if (var3 != 0) {
               return false;
            }
         }
      }

      boolean var10002 = true;
      return true;
   }

   public Class422(BlockPos var1, List<ItemStack> var2, List var3) {
    }

   @Override
   public void m13577(IRenderer3D var1) {
      super.m13577(var1);
   }

   @Override
   public void m13578(MatrixStack var1) {
      if (!this.f7029.isEmpty()) {
         Vec3d var11 = Class352.f5725.f5722;
         double var5 = super.f9197.getX() + 0.5;
         double var7 = super.f9197.getY() + 0.8;
         double var9 = super.f9197.getZ() + 0.5;
         var1.push();
         var1.translate(var5 - var11.x, var7 - var11.y, var9 - var11.z);
         var1.scale(0.25F, 0.25F, 0.25F);
         Globals.mc
            .getItemRenderer()
            .renderItem(
               this.f7029, ModelTransformationMode.GROUND, 15728880, 0, var1, Globals.mc.getBufferBuilders().getEntityVertexConsumers(), Globals.mc.world, 0
            );
         var1.pop();
      }
   }

   public boolean m13579(DefaultedList<ItemStack> var1, DefaultedList<ItemStack> var2) {

      int var8;
      for (int var10000 = var8 = 0; var10000 < var2.size(); var10000 = ++var8) {
         ItemStack var9 = (ItemStack)var2.get(var8);
         ItemStack var6 = (ItemStack)var1.get(var8);
         if (!ItemStack.areItemsEqual(var9, var6)) {
            return false;
         }

         ItemEnchantmentsComponent var10 = var9.getEnchantments();
         ItemEnchantmentsComponent var11 = var6.getEnchantments();
         if (!var10.equals(var11)) {
            return false;
         }
      }

      boolean var10002 = true;
      return true;
   }

   public void m13580() {
      this.f7029 = null;
      this.f7031 = null;
      Iterator var5;
      Class422 var10000;
      if ((var5 = this.m17574().iterator()).hasNext()) {
         ItemStack var6 = (ItemStack)var5.next();
         var10000 = this;
         this.f7029 = var6;
      } else {
         var10000 = this;
      }

      if (var10000.f7029 != null && Block.getBlockFromItem(this.f7029.getItem()) instanceof ShulkerBoxBlock) {
         this.f7031 = DefaultedList.ofSize(27, ItemStack.EMPTY);
         Class438.m13992(this.f7029, this.f7031);
      }
   }

   public boolean m13581(ItemStack var1) {
        return false;
    }

   static {
   }
   public static void m194() {
      f7036[0] = "Q>~5l5Q>ii`:Kuiw`/L\u0004;,8e";
      f7036[1] = ";S(\u0002+C;S?^'L!\u0018?@'Y&ie\u001fv\u001e";
      f7036[2] = "T,1\u0011\bYH63M\u0012MX5xȹ";
      f7036[3] = int.class;
      f7037[3] = "java/lang/Integer";
      f7036[4] = "A_-'!\"A_:{--[\u0014:e-8\\ek:{z";
      f7036[5] = "H_\t4MKCP\u0018{,EH[\u001c!";
      f7036[6] = boolean.class;
      f7037[6] = "java/lang/Boolean";
      f7036[7] = "OK<\u0012\u00057SQ>N\u001f#CRuй";
      f7036[8] = "8\u000fAWO3$\u0015C\u000bU'4\u0016\bȍ";
      f7036[9] = "\u001d35tI\"\u0003;/;.#\u0012 \"a\b%";
      f7036[10] = "\u0000}\u00100&c\u001cg\u0012l<w\fdYп";
      f7036[11] = void.class;
      f7037[11] = "java/lang/Void";
      f7036[12] = "\u0007=Mu~?\u0007=Z)r0\u001dvZ7r%\u001a\u0007\bl*d";
      f7036[13] = "BE\u0002n\bM\\M\u0018!jQ[P";
      f7036[14] = "!tf\u0019z[=ndE`O-m/Ԍ";
      f7036[15] = "r\"J9s,r\"]e\u007f#hi]{\u007f6o\u0018\f%*}";
      f7036[16] = "\u0011)\u001d7==\f<E\u0015|0\u0014:";
      f7036[17] = "\u0017\u0015tP(Q\u000b\u000fv\f2E\u001b\f=\u001d5V\u001dIf\n3H\u000bIP\u00116K\n2g\u00176W";
      f7036[18] = float.class;
      f7037[18] = "java/lang/Float";
      f7036[19] = "d2*zJ\u0003d2=&F\f~y=8F\u0019y\bja\u001f]";
      f7036[20] = "\n.q#>\u0011\n.f\u007f2\u001e\u0010efa2\u000b\u0017\u00147>`@";
      f7036[21] = double.class;
      f7037[21] = "java/lang/Double";
      f7036[22] = ";\u00058\u001euK;\u0005/ByD!N/\\yQ&?~\u0004+";
      f7036[23] = "[&e8zR[&rdv]AmrzvHF\u001c)'&";
      f7036[24] = "3k^v8</q\\*\"(?r\u0017;& 9wMv+957~4%+=uJ";
      f7036[25] = "9>d\u0004?E9>sX3J#usF3_$\u0004#\u001bb";
      f7036[26] = "@aBP\u0019|@aU\f\u0015sZ*U\u0012\u0015f][\u000fOL";
      f7036[27] = "k|-wo\u0018k|:+c\u0017q7:5c\u0002vFml;F";
      f7036[28] = "L_\u007fA&;L_h\u001d*4V\u0014h\u0003*!Qe:Vxe";
      f7036[29] = "dBgFwCdBp\u001a{L~\tp\u0004{Yyx%[\"";
      f7036[30] = "\u001e\u0000A!F_\u0002\u001aC}\\K\u0012\u0019\bʽ";
      f7036[31] = "W\fN{:FW\fY'6IMGY96\\J6\u000e`n\u0016";
      f7036[32] = "\u0000n\u0006~8\u0002\u0000n\u0011\"4\r\u001a%\u0011<4\u0018\u001dTFel\\Jh\u001e1&\u00181?Gim";
      f7036[33] = "[\u0010\f=~\u0011G\n\u000ead\u0005W\tEӨ";
      f7036[34] = "(e\u007fb,V4\u007f}>6B$|6/1Q\"9k)*W.y\u007fb\u001bM2zK)*W.y\u007f";
      f7036[35] = "^\f1\"\u0010zB\u00163~\nnR\u0015xɹ";
      f7036[36] = "N\u007f\u000f\u0001\u000e\u001cRe\r]\u0014\bBfFL\u0013\u001bD#\u001bJ\b\u001dHc\u000f\u0001/\fUy\u0001A\u001b";
      f7036[37] = "yfD}\"\u001acm\u0000(B2IMvVB\u0017u\u007fVp%\r~;\u0003";
      f7036[38] = "\u000f_b\"=\u0003T\\b;\u0005ĭ2X%4|BX\t>2:y\b\u001f3&>\u0013Y\u00045`\u0005EO^e$tC\\\u001bb_";
      f7036[39] = "/(f!dJtpfFgV5us*U\u0006y+)y\u0002A/w,)zF1{\u0014";
      f7036[40] = "J+Hn\tW\u001b)\u0014:4ծ{dM`[U\u000be\u001e.^0";
      f7036[41] = "\u0017RzN [\u001cOmRD\\\u0018GfE\u0013\u000bB\u0017:))B\u001eWgO6B\u0003G";
      f7036[42] = "\u0013Xq4M_\u0018Ef()X\u001cMm?~\u000fF\u001d0SDF\u001a]l5[F\u0007M";
      f7036[43] = "}a3k\u001e)'\u007f'uu6pf:u\u0019\u0004$&j*u2'a'nMjrk\"\u0012";
      f7036[44] = "3B#gG`oB/;{y2Q\u007fa\u0017Ke\u0017.>@\u001c`\\q`\u0014!bC!>{";
      f7036[45] = "K)h}\u0004z\u0013|bxx'Gosg\u0014\u0015\u0010(*?HBL.ag\u001e3\u0017va\u0000\u0017-\u0013wwd\u0018,Hy\u0013:Cx@-s0\u0016(@\u0013);B(\u0014s#n\u0012(*\u007f|<\u0019~V#|0EBKnc9\u00050X,m}x WusiF/La#\u0000By\u0010y-`H,@y\u0013?\t,L|.=\u0016|\u0012\u0013";
      f7036[46] = "Mok\u00005C\u0018%b\u001eG[\\<|\u0002?N\\8|\u00126'\u001cn \u0013yG\u0016;p\u0013GLT'x\u0012x\u001d\\>\"y}\u001c\u001c?$\u0019wIL?\u001a";
      f7036[47] = "^Jv^8\u0001\u0005IvG\u0000ǹcM1Hy@\t\u001c*N?";
      f7036[48] = ")\u0010\u0006z\u0016\u0013*WDh)\u0011)W\\\u007fE#}\u0013\u0006&\u0012t~\u0010\u0006r\u0017\u0014tEVr)";
      f7036[49] = "P[A\t\u0012p\nEU\u0017ydQML\u001c.3\u000e\u0010\u0017p\u001ak\bOM\n\u0000pUI";
      f7036[50] = "\b\u0013w3\u001dtU\u0015(`aӷl\u0010as\u0006-\u0005\u001b|d\u001a";
      f7036[51] = "!!\u0016&\u0015\bz\"\u0016?-\u001b\u001c!I?]\u000b ,@dPr!yH+TN,p\u0013&-";
      f7036[52] = "lvFf\u0007jv}\u00023gbklcD-\r<+\u0003aYm6~Sag";
      f7036[53] = "\u0005M^_p3YMR\u0003L*\u0004^\u0002Y \u0018S\u0018S\u0006qO\u0002P\u0010\\'pSX\t\u0006L$\u001bP\u0000Usu\u0013IZ>'=\u001b@\t\u0001v5\u0002\u001ab\u0001=!\u000fM_\u0003\"qQ\"";
      f7036[54] = "_'\u0016\u0018Pm\u0004\u007f\u0016\u007fSqEz\u0003\u0013a#\b$\\\u007f\na\u0005'\u001f\u000e\fr@ d";
      f7036[55] = "~Mtj\u007f$/Vr,D/8]ez8)>0!z~p.Ubn %D";
      f7036[56] = "\\w\bE\u001a\u001a\u0007/\b\"\u0019\u0006F*\u001dN+T\u000brK\"L\f\u0005w\u0005X\u0000\u0019F#z";
      f7036[57] = "2mkn[^nmg2gG3~7h\u000bud8f7[\"3r0r\u0002D,r-bgO.e*j\u0001P.x:\u000f\nR9\u007f2i\u0015R$oW0\u0016L8mj2\t\u001cf\u0002";
      f7036[58] = "\u00037x\u0004\na\f6#\nnk\r5%\f99Waq`\u0001jU<%\u0004\u000ek\u000e2";
      f7036[59] = "W.Yxo\u007fA7Tr\u0015!S^[c|=S$\u0001}h#";
      f7036[60] = "\u0000R<\u001fd\u0016QI:Y_\u0019WS7\u00013+\u0003\u0017m_d|\u0000\u0014m\fa\u001c\nA=\f_GB\u0012l\u001fg\u0013QF8fe\u0001QVl\f4\u001aW\u0010W";
      f7036[61] = "^c\u001e\u0016`KU~\t\n\u0004LQv\u0002\u001dS\u001b\u000b&\\qiRWf\u0003\u0017vRJv";
      f7036[62] = "`k\u0005X};#\u007f[\r\u0017>7yy\u000bg\"^>BZ*%/8Q\u001f-^";
      f7036[63] = "'\f\u00013k\u0006|\u000f\u0001*SЯ\u001aWY.i\u0019+_W.b";
      f7036[64] = ",x7\u0016M2w{7\u000fuΝ\u0011#0\u0019\u0012.`xh\u0019";
      f7036[65] = "=t\u0016[/)>3TI\u0010+=3L^|\u0019iw\u0016\u0007,Njt\u0016S..`!FS\u0010";
      f7036[66] = "?Mkx\u0001~|Y5-k}lT-FPc<\u001f(~\u0004phKQ";
      f7036[67] = "K>1'dK\u001fyc1\tԖq>hscH\u00114=#cv";
      f7036[68] = "}\u001a5NJ2)]gX'ɖG\u001al\u001aM1'\u00109JM\u000f";
      f7036[69] = "\u001ev\u0010E\u001cl\u0001v\u001eUf5\u0003}\u0018A\u000f6y+B\u001d\fl\u0019!\u0017M\fR";
      f7036[70] = "kL\u0002\rR)7L\u000eQn0j_^\u000b\u0002\u0002=\u0019\u000fT_U8RP\n\u0001h:M\u0000Tn";
      f7036[71] = "t>\u001agF\u0016s \u0016_D\u0017s1\u001c$)UveC&\u0011\u0001e1\u0017_\u0015\u00132e\u0003.\u0013\u0000wbx";
      f7036[72] = ":Jr:k\u0015gL-i\u0017ȁ^Cql/Tc\u001ew3|";
      f7036[73] = ", bzsawxb\u001dp}6}wqB/{-,\u001ds-8zvl(u8\u001dv gw,l-xg\u0010v`, napsi'\u0015";
      f7036[74] = "E\bOT\u001adZSHL|8MNSK\u0010\n\u001a\t\u000b\u0014D]E\\J^\u0015lYTKT|";
      f7036[75] = "\b<k9l!S?k Tφ5=,xi D;?=n[";
      f7036[76] = "Ze<(\u0003p\u001ezf:`qOw\u0005\"\u0004cO\u000b`3]%[34 \tq\"";
      f7036[77] = "!v;8g\u0005z.;_o\u0015*/%\b1L|tI9<\u0006 -8bd\u0006";
      f7036[78] = "`UU\u001cX\u0001;VU\u0005`ɝ]W\u001e\u000f\u0006\u0014`U\u0001_X{";
      f7036[79] = "_\u0010[1UGW\u001e[:0ư9\u0014FlV\nVH\\{M";
      f7036[80] = "\r6K\n\u0014`\\4\u0017^)ї<%I\u0001K8[&\u000eCY";
      f7036[81] = "\fKa\u0015\u0005\u001c]I=A8ŋ=\u0004d\u001bW\u001eM\u00057UR{";
      f7036[82] = "/s=\u0014\u0010T-*&Pwȸ\u0010wa\u001a\u0010Xa,9\u001aw\u0004mz%S\u001dUv|chHO~w3UJP.)\\";
      f7036[83] = "y1u\u0011+x(*sW\u0010i\">sh*)y& \b |)&\u001e";
      f7036[84] = "S+f;YLRx(><]\u001ez#=@[\u0018\u0017g=\u0006\u0002\br$)XWb";
      f7036[85] = "1Lu\u001bN\u001dj\u0014u|M\u0001+\u0011`\u0010\u007fWnL8C(\nj\u0003`\u001aYQ2\u0003\u0007\u001a\u0015\u001e0\u0017vAM\u001eWMz@\u0015\u0017&Ki\u0005\u0012l";
      f7036[86] = "I\u0005_\u0001v\u000f\u001f\u0017]G\u0018\u0012M\u001bAYt \u0011Z\u0019\u0005\u0018GGX\u001cAb\u000bR\u001bH>q\u0015^XOF'\u0007\\\u001e!";
      f7036[87] = "\u0000\nm7*\u0016Z\u0014y)A\t\r\rd)-;ZK5ryl\u0005Kx6'U\u001a\u0010\u007f.A";
      f7036[88] = "\u0003>\u0018\u000b\u0011:\u0000yZ\u0019.8\u0003yB\u000eB\nW=\u0018W\u0016]T>\u0018\u0003\u0010=^kH\u0003.";
      f7036[89] = "5a9Rc\u0010dz?\u0014X\u0015b`R\u0011c@e\"2\u001b6\u0010e\u001ciSeAv$=@1\u0015\u000f";
   }
}
