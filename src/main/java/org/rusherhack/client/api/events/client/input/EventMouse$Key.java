package org.rusherhack.client.api.events.client.input;
import org.rusherhack.*;

import org.rusherhack.client.api.utils.InputUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.setting.Setting;

public class EventMouse$Key extends EventMouse {
   public int f357;
   public int f358;
   public int f359;
   public static Object[] f361 = new Object[16];
   public static String[] f362 = new String[16];

   public int getAction() {
        return 0;
    }

   public int getModifiers() {
        return 0;
    }

   public EventMouse$Key(int var1, int var2, int var3) {
    }

   public int getButton() {
        return 0;
    }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   static {
      m786();
   }
   public static void m786() {
      f361[0] = "1(fI\u0018\u0000-2d\u0015\u0002\u0014=1/\u0004\u0006\u001c;4uI\u000b\u00057td\u0011\u000f\u001b*)/\u0004\u0006\u001c;4uI\u0003\u001b./uI/\u0003;4u*\u0005\u0000-?%,\u000f\f";
      f361[1] = int.class;
      f362[1] = "java/lang/Integer";
      f361[2] = "'\u001e\r:va;\u0004\u000fflu+\u0007Dwkf-B\u0019qp`!\u0002\r:Wq<\u0018\u0003zc";
      f361[3] = "YyD\u0015\"m,YO\u001a3\"QA\\\u001d:k9";
      f361[4] = "\u00173i0\u001f\u001f\u000b)kl\u0005\u000b\u001b* ɪ";
      f361[5] = "rObTJ\u0003nU`\bP\u0017~V+\u0019T\u001fxSqTY\u0006t\u0013`\f]\u0018iN+\u0019T\u001fxSqTQ\u0018mHqT}\u0000xSq7W\u0003nX";
      f361[6] = "C\u0017\fJsAH\u0018\u001d\u0005\u000eY[\u001f\u0014L";
      f361[7] = void.class;
      f362[7] = "java/lang/Void";
      f361[8] = ".>[P-G%1J\u001fLI.:NE";
      f361[9] = "+V~\u000e\u0016hvXj\u000f-զ\u0012\u0001l\u0010\u0011vuKo^\u0015\u0007";
      f361[10] = "pgXz\u0012zx%\u0012\u001c\u0012\u0017,&HnFzslDu{,,wP!\u0016sf{K\u001c";
      f361[11] = "\u001f\u0011\u001b8\u001dnG\u001bIi$ø$UG0Yi\u001d\u0015TiB\r";
      f361[12] = "u\u0003\u001f\u0000&A}AUfŃ,k\u0007\u0006\u0006,Ix\u001eX";
      f361[13] = "m)\u0014F*\u001dek^ »ps-\r@ \u0015`4S";
      f361[14] = "=w|gC e}.6zć\u00063 o\u0007'?s36\u001cC;32\"\u0016*o4}/z";
      f361[15] = "Z63wq\u0013Rty\u0011Ǡ~D2*q{\u001bW+t";
   }
}
