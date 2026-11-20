package org.rusherhack.client.api.events.render;
import org.rusherhack.*;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.Setting;

public class EventRenderEntity extends EventCancellable {
   public MatrixStack f493;
   public double f494;
   public int f495;
   public float f496;
   public boolean f497;
   public VertexConsumerProvider f498;
   public float f499;
   public double f500;
   public Entity f501;
   public double f502;
   public static Object[] f504 = new Object[31];
   public static String[] f505 = new String[31];

   public double getY() {
        return 0.0;
    }

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   public double getX() {
        return 0.0;
    }

   public double getZ() {
        return 0.0;
    }

   public int getPackedLight() {
        return 0;
    }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   public Entity getEntity() {
        return null;
    }

   public float getPartialTicks() {
        return 0.0f;
    }

   public MatrixStack getMatrixStack() {
        return null;
    }

   public void setRenderModel(boolean var1) {
        
    }

   public VertexConsumerProvider getBuffer() {
        return null;
    }

   public void setBufferSource(VertexConsumerProvider var1) {
        
    }

   public float getRotationYaw() {
        return 0.0f;
    }

   public boolean shouldRenderModel() {
        return false;
    }

   public EventRenderEntity(
      Entity var1, double var2, double var4, double var6, float var8, float var9, MatrixStack var10, VertexConsumerProvider var11, int var12
   ) {
    }

   static {
      m122();
   }
   public static void m122() {
      f504[0] = "\\|\f(\u0004\u0018@f\u000et\u001e\fPeEe\u001a\u0004V`\u001f(\u0017\u001dZ \u000ep\u0013\u0003G}Et\u0013\u0003Wk\u0019(3\u001bV`\u001fT\u0013\u0003Wk\u0019C\u0018\u0019Zz\u0012";
      f504[1] = float.class;
      f505[1] = "java/lang/Float";
      f504[2] = double.class;
      f505[2] = "java/lang/Double";
      f504[3] = "P^~\u001c\ryP^i@\u0001vJ\u0015i^\u0001cMd>\u0007X'";
      f504[4] = int.class;
      f505[4] = "java/lang/Integer";
      f504[5] = boolean.class;
      f505[5] = "java/lang/Boolean";
      f504[6] = "e?\u0003s\u000f'y%\u0001/\u00153i&J>\u0012 oc\u0001+\u0018<~c\u0017)\u001c5oc7)\u001c5o";
      f504[7] = "/B1'q\u00163X3{k\u0002#[xjl\u0011%\u001e%lw\u0017)^1'P\u00064D?gd";
      f504[8] = "xP>\u0019\u001ay\rp5\u0016\u000b6ph&\u0011\u0002\u007f\u0018";
      f504[9] = "#\u0001N^0%?\u001bL\u0002*1/\u0018\u0007\u0013.9)\u001d]^# %]L\u0006'>8\u0000\u0007\u0002'>(\u0016[^\u0007&)\u001d]\"'>(\u0016[";
      f504[10] = "<JpQ\u0005B<Jg\r\tM&\u0001g\u0013\tX!p0JQ\u001c";
      f504[11] = "K(\u001b\u0001(=>\b\u0010\u000e9rC\u0010\u0003\t0;+";
      f504[12] = void.class;
      f505[12] = "java/lang/Void";
      f504[13] = "q^&\u000b\u001d\u0010mD$W\u0007\u0004}Goɑ";
      f504[14] = "+ \u0001he&+ \u00164i)1k\u0016*i<6\u001aDt1x";
      f504[15] = "u\fT7\u001f\n~\u0003Ex~\u0004u\bA\"";
      f504[16] = "tJeut!$Dl|\u0005@\u00129\u000e\";s#\u00057r5z*";
      f504[17] = "Ipd&l4D9:\u001dȣ[\u001d'>w`!\u0019- m";
      f504[18] = "\u0002B`R>/\u0007L;ZQԯ>\u00006\u0006+vZL/E3N";
      f504[19] = "?QA&\u000fS2\u0018\u001f\u001dҮ<j\u001bF%\u0002Q9\u0006\u0002{";
      f504[20] = "1r\u001b51gn1U3SΔ\u000f7Mj93u3Gt#X";
      f504[21] = "pG`\u0018;\t}\u000e>#Ěf \u0019+A,Zx\u000b2M";
      f504[22] = "/*_\u0016y2\"c\u0001-Ň]ys\u0006Ob ,q\u0001G";
      f504[23] = "71x\u000f_2:x&4ϳ]b;zFZ\"?p?\b";
      f504[24] = "\u0018C]$y\u001d\u0015\n\u0003\u001fɅrF\t\u0018op\b\u001b\u0010\n\u007f";
      f504[25] = "\u0016I\u0007F~l\u001b\u0000Y}Ҽ\u0003@\u0010^\u001fe~\u0015\u0012Y\u0017";
      f504[26] = "o?8\u0002B\u0018j1c\n-̆S}nVWA71w\u0015Oyc!;\u001dOD+<8\n-";
      f504[27] = "\u0010\rK\nTW\u001dD\u00151З8E\u0007ICQG\u0018L\f\r";
      f504[28] = "GRs~1\u001fJ\u001b-Eϫp\u0012Xq74\u000fO\u00134y";
      f504[29] = "&wHq\u001fm+>\u0016Jƌ\u0002r)\u00105G3;~\u0011:";
      f504[30] = "\u0007D\n\u0007\fy\n\rT<\u0002\u0016Y\u0019AV\u0005k\r\u0010A\u0002k'\u0005\u0004[R\u0016s\f\u0004\u000f<";
   }
}
