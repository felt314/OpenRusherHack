package org.rusherhack;

import net.minecraft.entity.Entity;
import org.rusherhack.client.api.Globals;

import org.rusherhack.client.api.feature.module.impl.render.Chams;
public class Class207 extends Targets {
   public static Object[] f3845 = new Object[19];
   public static String[] f3846 = new String[19];

   @Override
   public boolean m7993(Entity var1) {
      return var1.equals(Globals.mc.getCameraEntity()) && Globals.mc.options.getPerspective().isFirstPerson() ? false : super.m7993(var1);
   }

   public Class207(Chams var1, String var2, String var3) {
      super(var2, var3);
   }

   static {
      m343();
   }
   public static void m343() {
      f3845[0] = "\u00005\u0013\u0018M3\u00005\u0004DA<\u001a~\u0004ZA)\u001d\u000fR\u0002\u0019b";
      f3845[1] = boolean.class;
      f3846[1] = "java/lang/Boolean";
      f3845[2] = "I\u0019~\u0014'wU\u0003|H=cE\u00007Ɠ";
      f3845[3] = "&c\u0019N\u0017\u0018:y\u001b\u0012\r\f*zPȔ";
      f3845[4] = "C\b\t\u0006\fU_\u0012\u000bZ\u0016AO\u0011@Ȯ";
      f3845[5] = int.class;
      f3846[5] = "java/lang/Integer";
      f3845[6] = "VZ)\u0004gBVZ>XkML\u0011>FkXK`n\u001b?";
      f3845[7] = "\u001ccW\u0002{(\u001cc@^w'\u0006(@@w2\u0001Y\u0010\u001d&";
      f3845[8] = "\u001f`W@F5\u001f`@\u001cJ:\u0005+@\u0002J/\u0002Z\u0012\\\u0012k";
      f3845[9] = "0'\u0018o6\f,=\u001a3,\u0018<>Q\"(\u0010:;\u000bo%\t6{8-+\u001b>9\f";
      f3845[10] = "\u001c\u0019fT]\u0005\u0017\u0016w\u001b<\u000b\u001c\u001dsA";
      f3845[11] = "Q4\u000f\fdg\u0016>[=g3\u00130WQUeVh\u000b\u0001\u0002,\u001e7BV2aU10";
      f3845[12] = "k\u000b<:9{:\u001d7#\t(7\n!*^\u007fhV}F5,4]7}f*$\u0000";
      f3845[13] = "\")OG\f\u0004j>\u001fK|\t\u001bv\u001aC\u0012\u001b{0D\u001d\u0000b!sKC\u0005\u0002g-\u0015Q|";
      f3845[14] = "+\u001b\fZ\u001b1z\r\u0007C+i{\u000b\u0015AG[/JK\u001e+2)IOV[wd\u001c\b&";
      f3845[15] = "\nu{Y^BJi#\u001e B_\u0015%MY[\u0004(t[RB";
      f3845[16] = "]\u0005bgn\u0005]RkuTȢf\u0005ex(JWE\u007fwk{";
      f3845[17] = "h\u001ch\u0003\u0017I-Q=DgT/^?]\u001c9iAhB\rB1HjBgK'D.RW\u0006lBV";
      f3845[18] = "\u000f\u0015\u0016b\u0013\u001d\\\u0013\u0006?aC^\u0003\u0014?\rq\bFLd]&\r\u001bKi\u0007\u001fJ\u0011\u001fX";
   }
}
