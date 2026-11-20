package org.rusherhack;

import net.minecraft.client.gui.DrawContext;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;

public class Event254 extends EventCancellable {
   public DrawContext f4527;
   public int f4528;
   public int f4529;
   public int f4530;
   public static Object[] f4532 = new Object[10];
   public static String[] f4533 = new String[10];

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   public int m9176() {
      return this.f4530;
   }

   public int m9177() {
      return this.f4528;
   }

   public DrawContext m9178() {
      return this.f4527;
   }

   public Event254(DrawContext var1, int var2, int var3, int var4) {
      this.f4527 = var1;
      this.f4529 = var2;
      this.f4530 = var3;
      this.f4528 = var4;
   }

   public int m9179() {
      return this.f4529;
   }

   static {
      m122();
   }
   public static void m122() {
      f4532[0] = "\bahu\u000e\u0002\u0014{j)\u0014\u0016\u0004x!8\u0013\u0005\u0002=j-\u0019\u0019\u0013=|/\u001d\u0010\u0002=\\/\u001d\u0010\u0002";
      f4532[1] = "j\u001d\u0012\u0016=_v\u0007\u0010J'Kf\u0004[ȿ";
      f4532[2] = int.class;
      f4533[2] = "java/lang/Integer";
      f4532[3] = "}cy8Js}cndF|g(nzFi`Y>%\u0015";
      f4532[4] = "edY\u0005,!nkHJM/e`L\u0010";
      f4532[5] = "\u0002\\L3#K\u0017BJ\u0003\u001c`($B{-\n\u0002UWe+";
      f4532[6] = ";\u0006/=}C$\u00151\u0002Ơ${\u0017.m+\u001a3C5c";
      f4532[7] = "]l1y`vB\u007f/FͶ\u0011\u001es;:yvKz<x";
      f4532[8] = "~\u0007\u0010q3Sa\u0014\u000eNǌ4>\u0016\u0011!e\nvB\n/";
      f4532[9] = "pGjj\u0000YoTtUˋ>0Vk:V\u0000x\u0002p4";
   }
}
