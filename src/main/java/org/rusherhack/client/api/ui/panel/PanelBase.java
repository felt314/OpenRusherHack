package org.rusherhack.client.api.ui.panel;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.ScaledElementBase;
import org.rusherhack.core.feature.IFeature;
import org.rusherhack.core.interfaces.IClickable;
import org.rusherhack.core.interfaces.IHideable;
import org.rusherhack.core.interfaces.INamed;
import org.rusherhack.core.interfaces.IScrollable;
import org.rusherhack.core.interfaces.ITickable;
import org.rusherhack.core.interfaces.ITypeable;
import org.rusherhack.core.serialize.Class062;
import org.rusherhack.core.setting.Setting;

public abstract class PanelBase<T extends IPanelItem>
   extends ScaledElementBase
   implements IRenderable2D,
   ITickable,
   IClickable,
   IScrollable,
   ITypeable,
   IHideable,
   Class062,
   INamed {
   public boolean f901;
   public List<T> items;
   public PanelHandlerBase<? extends PanelBase<T>> f902;
   public String f903;
   public static long f904 = Class066.m4320(6202624091940295528L, -4200872495557733405L, MethodHandles.lookup().lookupClass()).m4325(54765473429700L);
   public static String[] f905;
   public static String[] f906;
   public static Object[] f908 = new Object[62];
   public static String[] f909 = new String[62];

   public void setVisible(boolean var1) {
        
    }

   public List<T> getItemList() {
      return this.items;
   }

   public T addItem(T var1) {
      this.items.add((T)var1);
      return (T)var1;
   }

   public JsonElement serialize() {
        return null;
    }

   public boolean deserialize(JsonElement var1) {
        return false;
    }

   public T createFeatureItem(IFeature var1) { return null; }

   @Override
   public String getName() {
        return null;
    }

   public PanelBase(PanelHandlerBase<? extends PanelBase<T>> var1, String var2) {
    }

   @Override
   public IRenderer2D getRenderer() {
        return null;
    }

   @Override
   public IFontRenderer getFontRenderer() {
        return null;
    }

   @Override
   public boolean isHidden() {
        return false;
    }

   public T addItem(IFeature var1) {
      IPanelItem var5 = this.createFeatureItem(var1);
      this.items.add((T)var5);
      return (T)var5;
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
      f908[0] = "ZM\u0007\u007fNgDE\u001d0,{CX";
      f908[1] = "\u000e<C::~\u00053Ru[p\u000e8V/";
      f908[2] = boolean.class;
      f909[2] = "java/lang/Boolean";
      f908[3] = "\u0013h?),\u0003\u000fr=u6\u0017\u001fqvd2\u001f\u0019t,)?\u0006\u00154-np\u0006\u001dt=kp&\u001dt=k\u001c\u0017\u000f\u007f";
      f908[4] = "m4uu7Kq.w)-_a-<8*Lght>$Jw4wu\fxg'f.7[";
      f908[5] = "Zd\u0019H=$F~\u001b\u0014'0V}P\u0005#8Px\nH.!\\8\u000b\u000fa!Tx\u001b\na\u0018ew\u0010\u0003#\u0018As\u0013";
      f908[6] = "\u0001\"\u0007\u0007P%\u001d8\u0005[J1\r;NJN9\u000b>\u0014\u0007C \u0007~\u0015@\f \u000f>\u0005E\f\u0000\u000f>\u0005Ej1\u00004\fLP\u0012\u000f#\u0005";
      f908[7] = "\u0007{e4\\f\u001baghFr\u000bb,yBz\rgv4Oc\u0001'p\u007f@w\r{,|A}\u001c'K\\A}\u001c[gtJv\u001alp";
      f908[8] = "q,Q\u0017\u0012im6SK\b}}5\u0018՜";
      f908[9] = "\u0003B2\u0004Ab\bM#K<z\u001bJ*\u0002";
      f908[10] = "Q\"\u0010H\\0M8\u0012\u0014F$];Y\u0005B,[>\u0003HO5W~\u0002\u000f\u0000\u0000R5\u001a\u0003@1|1\u0004\u0003";
      f908[11] = double.class;
      f909[11] = "java/lang/Double";
      f908[12] = "\u00070tz\u0016<\f?e5z?\u0002=gzV";
      f908[13] = "[\u001c\u0000Pd6G\u0006\u0002\f~\"W\u0005I\u001dy1Q@\u0014\u001bb7]\u0000\u0000PE&@\u001a\u000e\u0010q";
      f908[14] = "'kzFXERKqII\n/SbN@CG";
      f908[15] = "'j\u0017_Sq;p\u0015\u0003Ie+s^\u0012Mm-v\u0004_@t!6\u0005\u0018\u000ft)v\u0015\u001d\u000fT)v\u0015\u001dhp-u2\u0010Ra";
      f908[16] = "K\\ \u0010=sGT![t{[\\#\u0010\u0010oG]\u0002\\0yKG";
      f908[17] = ".ZwNMm%Uf\u0001-t)Yd]";
      f908[18] = void.class;
      f909[18] = "java/lang/Void";
      f908[19] = "(C8h\u000ej4Y:4\u0014~$Zqȅ";
      f908[20] = ">&Kk\u007fI5)Z$\u0015J!%Qo";
      f908[21] = "K\u001cb=\u001bP><i2\n\u001fC$z5\u0003V+";
      f908[22] = "d }ZA\tx:\u007f\u0006[\u001dh94Ȁ";
      f908[23] = "#vt]%\u0003/~u\u0016l\u000b3vw]\b\u001f/w\\\u001f'\u0001%wm";
      f908[24] = "/5\u0005C'\u00043/\u0007\u001f=\u0010#,L\u000e9\u0018%)\u0016C4\u0001)i\u0010\b;\u0015%5L$\u0007\u0014.#\u0007\u001f4\u0013,\"P)";
      f908[25] = "<\u0004\u001aLpz \u001e\u0018\u0010jn0\u001dS\u0001nf6\u0018\tLc\u007f:X\u000f\u0007lk6\u0004S+Pj=\u0012\u0018\u0010g}a2";
      f908[26] = "\u0013Tyr\u0004E\u001fG sdɦ.\u001b~fY\u001b\u0013O\u007fr\u0014%\u0010Ed!Z\u0018DDpld";
      f908[27] = "\u000e\u000b\u0010\u0011x@\u0007\u0015\u0013*wA\u0007eU\u0011.FU^\u0007\u0017yOk\\\u0003\u0016s_R\u001d\u0011@}-";
      f908[28] = "sY>\u0015N/\"Z!\u0012!#!\u0019\u000ek\u0011w)\tbP\u0018(7\u0004^";
      f908[29] = "\t(<oWe[c|/2tP<{<ud9aim_x\u0000 {;Q\n\t(<oWe[c|/2";
      f908[30] = "\"0+\u00001\u001fs34\u0007^\u0007pp\u001b~nGx`wEg\u0018fmK\u0015>\u0015cf,\u0001$\u0001$\f";
      f908[31] = "\u0000\n\u00038\u0007\u0017\u0004K\u0013=fӛiC\u001c~\u000b\u001dP\u0002\u000e(\u0005o";
      f908[32] = "{\u001d6O9ks\u001doRAn}\u001c\fK&\u007f|\n(@A9q\ni\u000f|mp\u001e$1*hcHoIp\u007fr\nTZ!no\u001a3N;z(p";
      f908[33] = "=vVr\u007f*luIu\u0010&o6g\f rg&\n7)-y+6";
      f908[34] = "H\u0012+)/.\u0017\u000e #U?\u000e\u001b))U;\u001c\nw482\u0002\t";
      f908[35] = "eM1x,XmMheT]cL\u000b|3LbZ/wT\noZn8i^nN#\u0006dD5\u001e6i6\u000fu^Sm4]qJ4y.I6 ";
      f908[36] = "\u001e7+D+\u0012\ty\"GY\u0002\u001cu\u001bA\u0015\n\fc6WY]Jl>\u0006bT\u0015r3:";
      f908[37] = "a`\u0017(\u0006\u00000c\b/i\u00183 &VYX;0KmP\u0007%=w=\t\n 6\u0010)\u0013\u001eg\\";
      f908[38] = "Ph\u0019\u0004;W\u000ft\u0012\u000eAF\u0011L\u001f\u0013-J\f\fG\u0010}J\u00185\u0006\u0002+Dj";
      f908[39] = "%\"w`%\u0016z>|j_\u001dr:Nz$\u0007u\"}\u001bf\t#+b\"'\u001bu%\u0010p?\u000fa,wd%\u001b&F";
      f908[40] = "F\u0019\u0000%?DBX\u0010 ^D/P\u001fc3N\u0016\u0011\r5=<D\t\u0019!4[P\u0013\rf^";
      f908[41] = "s~U%\u0016\u0018\"o\tcqӉ\u001f/\u0004 LB\"{\u00054\u0001|!q\u001egOAup\n*q";
      f908[42] = "N\t-4yc\u0011\u0015&>\u0003|\u0019\u0011\f&f~tS*5>-I\u0007+!s\u0013";
      f908[43] = "\u0015S\fs\u0004\u0014\u001dSUn|\u0011\u0013R6w\u001b\u0000\u0012D\u0012||F\u001fDS3A\u0012\u001eP\u001e\rB\u0018\u0005\u0003P0\u0016\u0019\u0011Nnf\u001c\u0011\u0001T\tr\u0006\u0005F>";
      f908[44] = "~'e\rj}iil\u000e\u0018m|eU\bRev}q\u001a~\u0002(v \u001ej;idv\u0010\u0018";
      f908[45] = "B`IWzi\u0002`LW\u0019<\u0013fn\\\u007f/$wFWt)\u0013` \u0007k4\u0010$\u001a\nr.\u001c\u001a";
      f908[46] = "1V:\u0015h\u001deW.XVMvK)L-a`P'R;kfM-(h@u\u000b~\u0015<AaF@\u00119\u001cbDyP+Jl6";
      f908[47] = "y%kYbo&9`S\u0018ӴC\u007flX%!~+mLh";
      f908[48] = "=?B%7[b#I/MA\u00075Kas\u0011<gOd|+i5\u001a`w\u0010;1\u001foM";
      f908[49] = "4\u0011\u0019S\nRuAIUvՋ\u0005\u0014\u0015T\rIu\u001cR\t\u001b*";
      f908[50] = "[-YEQ\u0001_lI@0Ғ2dF\u0003]\u000b\u000b%TUSy";
      f908[51] = "\u0011;8rJ\u001cN'3x0\u0007Q26u]\"F6#tJ\u0001j#2l0VY\"gi[\fTg?\t\fUV6a`^T\u0017>_";
      f908[52] = "@Z5\u00041\u001b\u001fF>\u000eK\u0010\u0017D3\u0016/\n\bSR\u0010u\u0012\u0004L-\u0007;\u001b\u0007>";
      f908[53] = "U=\u000e\u001aQ\r]=W\u0007)\u0001V+lZI\u001b\u0002nQ\u000eH\u000fOPU\u000b\u0015\fMi\u0014\u0019C\u0002?";
      f908[54] = "C:yE\u000bF\u001c&rOqZ\u0014%sD\u0010_\u001d?lSqYG'`L\u000eN\t.c>HYE3l\u0007\tK\u0013=\u001e";
      f908[55] = "l.J[Ls32AQ6ʬVvWIZ`l6WLZ";
      f908[56] = "1/8\u0017D\u000e8( R=L5\"%Cz\\\\vcKQ\u000eg\u007f<U\\21/8\u0017D\u000e8( R=";
      f908[57] = "v+^nd5)7Ud\u001eȉLvV)s7u7D\u007f}";
      f908[58] = "/l\u0013rZVn<Ct&͑\u001ei\u001fu]MnaX(K.ugJkLIa}^,&";
      f908[59] = "\u0015\u0006,1A}\u001d\u0006u,9~\u0012\u0017NqYkBUs%X\u007f\u000fk!q@o\r\u00146?Il\u007f";
      f908[60] = "S\u0011p7:\u001eD_y4H\u000eQS@2\u0013\u001dFNo&H_\\U4wu\u000b]AyI";
      f908[61] = "\n$Jcx\u0005Q \u0015%\u0019\u0016\u0007b.u\u007f\u0015\u0007d\u0019b\u0019\u0019\u001bn\u0004 a\u0005\t|\u0018\u0018";
   }
}
