package org.rusherhack.client.api.events.player;
import org.rusherhack.*;

import net.minecraft.util.math.Vec3d;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;

public class EventMove extends EventCancellable {
   public double f427;
   public double f428;
   public double f429;
   public static Object[] f431 = new Object[15];
   public static String[] f432 = new String[15];

   public void setMotion(double var1, double var3, double var5) {
        
    }

   public void setZ(double var1) {
        
    }

   public EventMove(Vec3d var1) {
      super();
      this.setMotion(var1);
   }

   public void setMotion(Vec3d var1) {
      this.setMotion(var1.x, var1.y, var1.z);
   }

   public double getY() {
        return 0.0;
    }

   public Vec3d getMotion() {
        return null;
    }

   public double getX() {
        return 0.0;
    }

   public void setY(double var1) {
        
    }

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   public void setX(double var1) {
        
    }

   public double getZ() {
        return 0.0;
    }

   static {
      m122();
   }
   public static void m122() {
      f431[0] = "e\u001eIJs7y\u0004K\u0016i#i\u0007\u0000\u0007m+o\u0002ZJ`2cBK\u0012d,~\u001f\u0000\u0014m#s\t\\JD4o\u0002Z)n4o";
      f431[1] = double.class;
      f432[1] = "java/lang/Double";
      f431[2] = "VL6F\u0011\u001aVL!\u001a\u001d\u0015L\u0007!\u0004\u001d\u0000Kvp\\O";
      f431[3] = void.class;
      f432[3] = "java/lang/Void";
      f431[4] = "V\r?p5|J\u0017=,/hZ\u0014v=({\\Q=(\"gMQ+*&n\\Q\u000b*&n\\";
      f431[5] = "`9.lCwk6?#\"y`=;y";
      f431[6] = "\u0004l\u0005(L.Pw\tWLPGrT;J4\u0006}Q";
      f431[7] = "x\u000e)\f\u0014zqP/\f~n \rw\n)9z]+f\u0004n!\fj\u0002Ea$";
      f431[8] = "ch$\u001dGJ(,m@xq\u0003X\u0015J\u0005\u00184*v\u0001AQi";
      f431[9] = "HuD=5+A+B=_?\u0010v\u001a;\bhJ&GW%?\u0011w\u00073d0\u0014";
      f431[10] = "U&i\u0013\u0017'\u0001=elҐY\u001688\u0000\u0011=W7=";
      f431[11] = "%\u001aD:\u0003yq\u0001HE\u0007j`/\u00129\u001d`zjL+Fmv\u0010Eu@m\u001cP\u001f#\u0000i ZM{\u000e\u0007";
      f431[12] = "\u0012T5e{\u0006FO9\u001a\u007f\u0015Wacfe\u001fM$~td\u0014R@?{axQJdv}\u001c\u0010Ea\u001a~\u0016KH}~?\u0019N$>pb\u0004E\u00184\":\n+";
      f431[13] = "U!|{q\u000e\\\u007fz{\u001b\u001a\r\"\"}LMWr|\u0011a\u001a\f#?u \u0015\t";
      f431[14] = "=Z#\r,\u000eiA/rίp~Dr\u001e*\u0014?Kw";
   }
}
