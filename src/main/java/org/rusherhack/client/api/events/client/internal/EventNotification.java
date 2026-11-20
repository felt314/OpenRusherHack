package org.rusherhack.client.api.events.client.internal;
import org.rusherhack.*;

import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.Setting;

public class EventNotification extends EventCancellable {
   public NotificationType f374;
   public boolean f375;
   public String f376;
   public boolean f377;
   public static boolean f378;
   public static Object[] f380 = new Object[20];
   public static String[] f381 = new String[20];

   public boolean isHud() {
        return false;
    }

   public boolean isChat() {
        return false;
    }

   public String getText() {
        return null;
    }

   public EventNotification(NotificationType var1, String var2, boolean var3, boolean var4) {
    }

   public NotificationType getType() {
        return null;
    }

   public static void m823(boolean var0) {
      f378 = var0;
   }

   public static boolean m824() {
      return f378;
   }

   public static boolean m825() {
      boolean var0 = m824();
      return !var0;
   }

   static {
    }
   public static void m122() {
      f380[0] = "sj:0UIop8lO]\u007fss}KUyv)0FLu68hBRhks}KUyv)0NRh}/pFP2]+{IHRw)wAU\u007fy)wHR";
      f380[1] = boolean.class;
      f381[1] = "java/lang/Boolean";
      f380[2] = void.class;
      f381[2] = "java/lang/Void";
      f380[3] = "\u0013a_3=\u0010\u000f{]o'\u0004\u001fx\u0016~ \u0017\u0019=Vr;\f\u001az[|;\f\u0013}\u0016S \u0011\u0015uQ~.\u0011\u0015|VI6\u0015\u0019";
      f380[4] = "\t\u000e\u0011\u0013l=\u0002\u0001\u0000\\\u0011%\u0011\u0006\t\u0015";
      f380[5] = "\u00074 &O\u0017\u001b.\"zU\u0003\u000b-ikR\u0010\rh4mI\u0016\u0001( &n\u0007\u001c2.fZ";
      f380[6] = "y\u0013\u0012v:\r\f3\u0019y+Bq+\n~\"\u000b\u0019";
      f380[7] = "7ua=$\u0006+oca>\u0012;l(ɧ";
      f380[8] = "*E!VO|_e*Y^3\"}9^WzJ";
      f380[9] = "\r0Uul\u001d\u0006?D:\r\u0013\r4@`";
      f380[10] = "X\nep\u0017(R\u0000c\u001f\u03a2H\u000e\ne \u0019\"ZW6&z";
      f380[11] = "Q,\u001es3X[&\u0018\u001c78\u0003\u007f\u0017a4_F'[d^\u0005W'[v9@\u000fk^\u001c";
      f380[12] = "K0\tn(PA:\u000f\u0001ј0\u001d0\t>&ZImZ8E";
      f380[13] = "\tzdqXs\u0003pb\u001eƺ\u0013\\&`'_|\u001e2bo";
      f380[14] = "k*@A`\u0018l6]\u000fYՈPsJL3W7uI\u001ab)";
      f380[15] = "dNyH{cnD\u007f'՜\u00032Ny\u0018uif\u0013*\u001e";
      f380[16] = "\u00055\b\u0005Yb\u000f?\u000ejՃ\u0002S5\bUWh\u0007h[S";
      f380[17] = "NjW\u001cM=D`Qsԗ]\u0018jWLC7L7\u0004J g\u001boU\u000fM9\u00113\u000fs";
      f380[18] = "K(#+H4L4>eqͺpq)&\u001b{\u0017w*pJ\u0005Jvp!\rh\u0014|,{q";
      f380[19] = ". 6\u0002'U$*0mъ5zq3\fvI<j\u007f\u0013";
   }
}
