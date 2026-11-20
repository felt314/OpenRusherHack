package org.rusherhack.client.api.events.player;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.Setting;

public class EventInteract extends EventCancellable {
   public Hand f415;
   public boolean f416;
   public EventInteract$Action f417;
   public EntityHitResult f418;
   public Entity f419;
   public static Object[] f421 = new Object[24];
   public static String[] f422 = new String[24];

   public Hand getHand() {
        return null;
    }

   public EntityHitResult getHitResult() {
        return null;
    }

   public void setUsingSecondaryAction(boolean var1) {
        
    }

   public boolean isUsingSecondaryAction() {
        return false;
    }

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   public EventInteract$Action getAction() {
        return null;
    }

   public EventInteract(Entity var1, Hand var2, boolean var3, EventInteract$Action var4, EntityHitResult var5) {
    }

   public Entity getTargetEntity() {
        return null;
    }

   static {
      m122();
   }
   public static void m122() {
      f421[0] = "f\u0016\u0011n6Mz\f\u00132,Yj\u000fX#(Ql\n\u0002n%H`J\u00136!V}\u0017X0(Yp\u0001\u0004n\u0001Nl\n\u0002\t*Ll\u0016\u0017#0";
      f421[1] = boolean.class;
      f422[1] = "java/lang/Boolean";
      f421[2] = "\r\u007fs\u0010;g\r\u007fdL7h\u00174dR7}\u0010E6\f`6";
      f421[3] = "6615b-66&in\",}&wn7+\ft)6s";
      f421[4] = "$v(>t[$v?bxT>=?|xA9Lo)/\u0004";
      f421[5] = "w|<\u0006[!kf>ZA5{euKE=}`/\u0006H$q >^L:l}uXE5ak)\u0006l\"}`/aG }|:K]pYm/AF:";
      f421[6] = "9\fEb}B%\u0016G>gV5\u0015\f/c^3\u0010VbnG?PG:jY\"\r\f<cV/\u001bPbJA3\u0010V\u001ccV/\u001bP\u0019\u007fS7\nG";
      f421[7] = int.class;
      f422[7] = "java/lang/Integer";
      f421[8] = void.class;
      f422[8] = "java/lang/Void";
      f421[9] = "@~sy\n~\\dq%\u0010jLg:4\u0017yJ\"g2\f\u007fFbsy+n[x}9\u001f";
      f421[10] = ">\u001cT\u0001GMK<_\u000eV\u00026$L\t_K^";
      f421[11] = "\u0016sm`\u000f<\nio<\u0015(\u001aj$Ⱥ";
      f421[12] = "Nj8(gMRp:t}YBsqezJD6:ppVU6,rt_D6\frt_D";
      f421[13] = "<>'5\u0014M716zuC<:2 ";
      f421[14] = "\tp\u0014n\u0016S\u0017r\u0019\u0002ϱhSl\u000bz\r\u0015\t{Jp";
      f421[15] = ",V\f4p)kBU;\nǾ\u0010\u0003\u001c'3,uB\u0016jfI-D\u001f538k\u0001Um\n";
      f421[16] = "AY,\u007f\u00124\u0003]l1c\f+k\u001d>\u001ce\u0000W}|\u0018%N";
      f421[17] = "AP`\u0004QL@RrA:ԕ\u007f\tn\u001eB\u001d\u0004Lr\u0014[t";
      f421[18] = "^c#0\u0004\u000b@a.\\Ƌ0\u0005u?1\u0004S\u000eb::";
      f421[19] = "\u0006z6Z\u0017)\u0018x;6ƭ\u0012_}2\n\u000fq_pa\\";
      f421[20] = "\u0014`D\u0001;\u001a\nbImח!O|^\r:\u001b\n+\u001d\u0015";
      f421[21] = "T\u000f\u0002Y\u0010\u007fJ\r\u000f5ąD\r\u001e\u0015\f\u00029Q\u0013\u001bV";
      f421[22] = "}yA\u00130w:m\u0018\u001cJʘA,Q\u0000sr$m[M&\u0017";
      f421[23] = ")8`'p?7:mKy\u0004v&zuzd&,j5\u0010;,?8!pk&/xK";
   }
}
