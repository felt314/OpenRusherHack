package org.rusherhack.client.api.events.player;
import org.rusherhack.*;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.Setting;

public class EventPlayerUpdate extends EventCancellable {
   public double f433;
   public double f434;
   public float f435;
   public ClientPlayerEntity f436;
   public double f437;
   public boolean f438;
   public float f439;
   public static int f440;
   public static Object[] f442 = new Object[34];
   public static String[] f443 = new String[34];

   public double getZ() {
        return 0.0;
    }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   public void setOnGround(boolean var1) {
        
    }

   public EventPlayerUpdate(ClientPlayerEntity var1) {
    }

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   public void setZ(double var1) {
        
    }

   public boolean isOnGround() {
        return false;
    }

   public void setX(double var1) {
        
    }

   public double getY() {
        return 0.0;
    }

   public float getPitch() {
        return 0.0f;
    }

   public double getX() {
        return 0.0;
    }

   public float getYaw() {
        return 0.0f;
    }

   public ClientPlayerEntity getPlayer() {
        return null;
    }

   public void setYaw(float var1) {
        
    }

   public void setPitch(float var1) {
        
    }

   public void setY(double var1) {
        
    }

   public static void m987(int var0) {
      f440 = var0;
   }

   public static int m988() {
      return f440;
   }

   public static int m989() {
      int var0 = m988();
      return var0 == 0 ? 26 : 0;
   }

   static {
    }
   public static void m122() {
      f442[0] = ",o\u0005*e`0u\u0007v\u007ft vLg{|&s\u0016*ve*3\u0007rr{7nLt{t:x\u0010*Rc&s\u0016T{t:x\u0010Qgq\"i\u0007";
      f442[1] = "\u001e;G>q7\u001e;Pb}8\u0004pP|}-\u0003\u0001\u0004$*";
      f442[2] = float.class;
      f443[2] = "java/lang/Float";
      f442[3] = boolean.class;
      f443[3] = "java/lang/Boolean";
      f442[4] = double.class;
      f443[4] = "java/lang/Double";
      f442[5] = "\u0016\"z\u0011f(\n8xM|<\u001a;3\\{/\u001c~xIq3\r~nKu:\u001c~NKu:\u001c";
      f442[6] = int.class;
      f443[6] = "java/lang/Integer";
      f442[7] = void.class;
      f443[7] = "java/lang/Void";
      f442[8] = "(U\u0004$!?4O\u0006x;+$LMi<8\"\t\u0010o'>.I\u0004$\u0000/3S\nd4";
      f442[9] = "\u00171\u0016\u0000G\tb\u0011\u001d\u000fVF\u001f\t\u000e\b_\u000fw";
      f442[10] = ",m<\u0012A\u00150w>N[\u0001 tuɈ";
      f442[11] = "\u001c\u000ba}/%\u001c\u000bv!#*\u0006@v?#?\u00011'gq";
      f442[12] = "F><J!X3\u001e7E0\u0017N\u0006$B9^&";
      f442[13] = "i\u00139\u001d9%b\u001c(RX+i\u0017,\b";
      f442[14] = "BxJ7A2G<\u0018SƊ\u0002\u0010-\u001f<[3K(Mm=?\u0013/\u001d5B2\u001d~\u0014S";
      f442[15] = "@!: L4\u0006(97}Q!\u001dTf\fg\u0006ai \u0005d\u0011";
      f442[16] = ")qut\u0010,fi&JDx'jq&v.e6+v!,)h'u\\s0irJ";
      f442[17] = "yn\n+<\u0004|*XOԮ4-;N1~\rk5Q?";
      f442[18] = "cm\u0017z:+d\u007fS-Fձ^$\u000e7%n'z\u0004p9\u0010";
      f442[19] = "!\u001es\u000fv>n\u0006 1\"j/\u0005w]\u0010=oU*\u0001G=<\u001an\u000f~{2\u0005`1";
      f442[20] = "\u000fo\u0004h^P\n+V\fl`X']=\u001d\u001d\u0007>\\h";
      f442[21] = "-\\\u0015gdV(\u0018G\u0003Ѡf1\u001dM=)_~\u0005\u001e";
      f442[22] = "e<\u0018\u007fRy`xJ\u001bԇI1tC+S-vj\u001eu";
      f442[23] = "S';\u001fS7\u001c?h!\u0007c]<?M55\u001f`e\u001cb7S>i\u001e\u001fhJ?<!";
      f442[24] = "<\"FKKm9f\u0014/^]mq\r\u001e\u000e!3f\u001aP7b;hL\u0016K<,\u007f\u0002/";
      f442[25] = "9>aj\u0011?v&2TEk7%e8w?zx9d 9;x2mRf5=zT";
      f442[26] = "\u001fy\bR\u0011\u001e@wM\u001a(\u0002AdQ\u000e\u007fU\u001b4\rb\u0012\u001e@9H\u0006U\u0000\u001dg";
      f442[27] = "p\n<P?6uNn4п\u0006'Be\u0005|{x[dP";
      f442[28] = "R'%_Ti\r)`\u0017mu\f:|\u0003:\"Vj!oWi\rge\u000b\u0010wP9";
      f442[29] = "c6#!s\u0016frqEƇ&7~xurBp`%+";
      f442[30] = "V\n6\u0001KJSNdeҳz\u0002BmUJ\u001eE\\0\u000b";
      f442[31] = "MS\u001b(\u007f'\u0012]^`F;\u0013NBt\u0011lI\u001e\u001c\u0018|'\u0012\u0013[|;9OM";
      f442[32] = "\u001f\b\u0012`\u0016\u0000\u0018\u001aV7j̈́\"A\u000b-\tE[\u001f\u0001j\u0015;\u001fN\u0003=\fD\u0012@R4j";
      f442[33] = "-|U#\rq(8\u0007G˾A\u007f)\u0000(\u0017p$,Ryq";
   }
}
