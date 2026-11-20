package org.rusherhack;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.accessors.entity.IMixinEntity;

public class Class006 {
   public static Object[] f153 = new Object[28];
   public static String[] f154 = new String[28];

   public static Vec3d m305(Vec3d var0, Vec3d var1, LivingEntity var2, int var3) {
      boolean var10003 = true;
      if (var3 >= 1 && !(Math.abs(var1.lengthSquared()) < 1.0E-5)) {
         Vec3d var7 = var1.multiply(var3);
         Vec3d var8;
         return (var8 = ((IMixinEntity)var2).callCollide(var7)).lengthSquared() > 1.0E-7 ? var0.add(var8.x, var8.y, var8.z) : var0;
      } else {
         return var0;
      }
   }

   public static Vec3d m306(Vec3d var0, LivingEntity var1, int var2) {
      return m305(var0, var1.getVelocity(), var1, var2);
   }

   public static Vec3d m307(LivingEntity var0, int var1) {
      return m306(var0.getPos(), var0, var1);
   }

   static {
      m122();
   }
   public static void m122() {
      f153[0] = "0WA8?\u0010;XPwB\b(_Y>";
      f153[1] = int.class;
      f154[1] = "java/lang/Integer";
      f153[2] = "Je?CU\\V\u007f=\u001fOHF|v ";
      f153[3] = "\u0015d^\u0007\u0012z\t~\\[\bn\u0019}\u0017ɝ";
      f153[4] = char.class;
      f154[4] = "java/lang/Character";
      f153[5] = "O8\u000e\txYO8\u0019UtVUs\u0019KtCR\u0002H\u0013&";
      f153[6] = "=qc7\u001fI=qtk\u0013F':tu\u0013S K&*B\u0019";
      f153[7] = "JN!XI\u001fAA0\u0017*\u0012TG";
      f153[8] = double.class;
      f154[8] = "java/lang/Double";
      f153[9] = "}\u0002\bE28a\u0018\n\u0019(,q\u001bAɭ";
      f153[10] = "g[\n<L\u0015{A\b`V\u0001kBCqR\tmG\u0019<_\u0010a\u0007\fq]\u0005{Z\u0002`MNmG\u0019{J\u0019&` {F\tfl\u0003fW\u0014q";
      f153[11] = "]{3|\u0013\u007fVt\"3rq]\u007f&i";
      f153[12] = "\u001a.gpW|B!iin/L+\u0007*\u001cyV/f{\u0010&\u001dP:eQ6Y1ki\u000e}&";
      f153[13] = "Qq\u0018\u0014,6Pr\f\u001dNȈo-\u000f\u0001?2\u000fo\u001e\\)Q";
      f153[14] = "3K\u0000JQ\u0013nNC\u0014o\u001aeO\u001a?\b\u0015hJ\u0012\u0019oJrB\u001bM\u0000\bk\u0012\u0018tT\u000feNG\u001b\u0016\u00165M~";
      f153[15] = "\u0018\u0010_`zTZ\t\u000fcC^N\u0012Vb/l\u001aV\f:C\u0006QQFz\"W]\u000e\r\u0005";
      f153[16] = "\u00138\f\t{\u001b\u0011+\fRD´*n\nZ!PE,\u0013\n\"i\u0011+\u001dV}\u0006S2MUDUCl\bZ?\u0017K6I3}\u0000M$\u0017S?\u0011\u00102t\b:\u0000Ol\u001bJ#PLU";
      f153[17] = "%r:\u00127Sr`4vi\u0007,`x\u0016\rS#hu\u0015m\u001125cv";
      f153[18] = "VwW\u000b\b\u001d\u0014\u007f\rJa\u0003\u0007b\u000e\u0010\r1S.QFQfQ`\u0007\u0012X\t\u0013yW\u0011a";
      f153[19] = "<6\t\u0011[J~/Y\u0012b@j4\u0000\u0013\u000er>p[Mb\u0018uw\u0010\u000b\u0003Iy([t_W88\u001f\u0015\u000e[gs`I\u0010\u001aw7\u0001\u0018\u001cE<H[\n\u000b@>'\u0019\u0013[C\u0007";
      f153[20] = "1(eJ_\u0018s15If\u0012g*lH\n 3n6\u0016fJxi|P\u0007\u001bt67/]\tc35@\u001f\u001030\f";
      f153[21] = "V3FDH^\u0014*\u0016Gq_\f KM&\bVp\u0017!LCR=P@\u001dO\rv";
      f153[22] = "Nf~\u000f\nA\f\u007f.\f3@\u0014us\u0006d\u0017N%.j\u000e\\Jhh\u000b_P\u0015#";
      f153[23] = "/\u00172\rbj-\u00042V]Ć\u0016A4^8!y\u0003-\u000e;\u0018*\u0013sK4ch\u001b)\n]!\u007f\u001d;T=cn@-7ff\u007f\u001fsX$\u007f/\u001cJ";
      f153[24] = "T\"vg:r\u0016*,&Sl\u00057/|?^Qzr c\tS5&~jf\u0011,v}S";
      f153[25] = "\u001c\u0003gZ\u001bD^\u001a7Y\"EF\u0010jSu\u0012\u001c@4?\u001fY\u0018\rq^NUGF";
      f153[26] = "zK%>SdxX%el\u007fC\u001c>b\u000b+-X j\u0003\u0016yE;cQx=[3kl";
      f153[27] = "E\u0015\u0019 \u0006J\u0012\u0007\u0017DW\u0013C\u0012n8<JC\u000fV'\\\bRR@D\u0007L\u0014\rI9\u0002\u0013K\u0012'";
   }
}
