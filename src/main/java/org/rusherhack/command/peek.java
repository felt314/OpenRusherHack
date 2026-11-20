package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.exceptions.ValidationException;
import org.rusherhack.core.event.subscribe.Subscribe;

public class peek extends Command {
   public HandledScreen<?> f6522;
   public static long f6523 = Class066.m4320(-8351755292088210540L, -5223882061463980434L, MethodHandles.lookup().lookupClass()).m4325(231596335050433L);
   public static String[] f6524;
   public static String[] f6525;
   public static long[] f6527;
   public static Integer[] f6528;
   public static Map f6529;
   public static Object[] f6530 = new Object[53];
   public static String[] f6531 = new String[53];

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (this.f6522 != null) {
         Globals.mc.setScreen(this.f6522);
         this.f6522 = null;
         Class170.f3362.unsubscribe(this);
      }
   }

   public peek() {
      super("peek", "Look into s<\u007f\bA\u0006kers while you are <\u007f\u0012A\u0006ding them");
      String[] var10001 = new String[]{"shulkerpeek", null};
      boolean var10005 = true;
      var10001[1] = "shulker";
      this.addAliases(var10001);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   public String m12797() {
      long var1 = f6523 ^ 21583207970922L;
      label40:
      if (Globals.mc.world != null) {
         ClientPlayerEntity var10000 = Globals.mc.player;

         try {
            if (var10000 == null) {
               break label40;
            }
         } catch (Class316 var8) {
            throw m116(var8);
         }

         ItemStack var4;
         Item var9;
         if ((var9 = (var4 = Globals.mc.player.getMainHandStack()).getItem()) instanceof BlockItem && ((BlockItem)var9).getBlock() instanceof ShulkerBoxBlock) {
            DefaultedList var10 = DefaultedList.ofSize(m2808(16048, 8214927510772073639L ^ var1), ItemStack.EMPTY);
            Class438.m13992(var4, var10);
            SimpleInventory var11 = new SimpleInventory(m2808(22366, 3253577970985839944L ^ var1));

            int var6;
            for (int var13 = var6 = 0; var13 < var10.size(); var13 = var6) {
               int var10003 = var6;
               var11.setStack(var6++, (ItemStack)var10.get(var10003));
            }

            ShulkerBoxScreenHandler var12 = new ShulkerBoxScreenHandler(-1, Globals.mc.player.getInventory(), var11);
            this.f6522 = new ShulkerBoxScreen(var12, Globals.mc.player.getInventory(), Text.literal("Shulker Box"));
            Class170.f3362.subscribe(this);
            return "Opened this s<\u007f\bA\u0006ker";
         }

         return "You are not holding a shulker box";
      }

      try {
         throw new IllegalStateException("You must be in-game to use this command.");
      } catch (Class316 var7) {
         throw m116(var7);
      }
   }

   static {
    }

   public static Class316 m116(Class316 var0) {
      return var0;
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
   public static int m2808(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2326;
      if (f6528[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f6527[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f6529.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f6529.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ϓ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f6528[var3] = var15;
      }

      return f6528[var3];
   }

   public static int m2809(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m2808(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(peek.class, "m2809", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ϓ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m157() {
      f6530[0] = "_Q\u0018\u00024YCK\u001a^.MSHQϿ";
      f6530[1] = "h\u0004&L\u007fIh\u00041\u0010sFrO1\u000esSu>fT'";
      f6530[2] = "<CMN@$ YO\u0012Z00Z\u0004ɦ";
      f6530[3] = int.class;
      f6531[3] = "java/lang/Integer";
      f6530[4] = ">o`\t \u0015\"ubU:\u00012v)D=\u001243bQ7\u000e%3BQ7\u000e%_rT";
      f6530[5] = "\u001f88\u0015n.\u00147)Z\u000f \u001f<-\u0000";
      f6530[6] = void.class;
      f6531[6] = "java/lang/Void";
      f6530[7] = "\u0005Wa_|b\u0005Wv\u0003pm\u001f\u001cv\u001dpx\u0018m&@!";
      f6530[8] = "j7c\u001d+Oj7tA'@p|t_'Uw\r#\u0000q";
      f6530[9] = "\u001f+d>\u0014\u0005\u00031fb\u000e\u0011\u00132-ɤ";
      f6530[10] = "Cd\u0016\u0018<\u0002_~\u0014D&\u0016O}_U\"\u001eIx\u0005\u0018/\u0007E86Z!\u0015Mz\u0002";
      f6530[11] = " }\u0004\u0004H$<g\u0006XR0,dMŁ";
      f6530[12] = "q;jiRFm!h5HR}\"#$LZ{'yiá";
      f6530[13] = "h,\u0011~&Rc#\u00001[Jp$\tx";
      f6530[14] = "cR<\u0005hz\u007fH>YrnoKuHu}i\u000e8DwbmN?\u0005{}kU6Nt{\"s/Ysakc:[nz~E";
      f6530[15] = "f?48)8z%6d3,j&}u4?lc0y6 h#78\u001a/z9!w89J\">{:#m";
      f6530[16] = "I\u001c\u000f\f\u0003\u0014<<\u0004\u0003\u0012[A$\u0017\u0004\u001b\u0012)";
      f6530[17] = "z\tCT\f^z\tT\b\u0000Q`BT\u0016\u0000Dg3\u0006HW\u0004";
      f6530[18] = "[~,5Q&[~;i])A5;w]<FDi,\u0005v";
      f6530[19] = "\u0010\u001d\u001ezc,\u0010\u001d\t&o#\nV\t8o6\r']`8";
      f6530[20] = "S\u00143kV'O\u000e17L3_\rzѤ";
      f6530[21] = "sC<~J\u0011sC+\"F\u001ei\b+<F\u000bnyzc\u0010I";
      f6530[22] = "\u0013\u0006I!{z\u0013\u0006^}wu\tM^cw`\u000e<\f8\"$";
      f6530[23] = "\bD\u0016\u000e~p\bD\u0001Rr\u007f\u0012\u000f\u0001Lrj\u0015~P\u0012'!";
      f6530[24] = "U\u0005$\u000fHmU\u00053SDbON3MDwH?a\u0016\u001c6";
      f6530[25] = "\u007f($\u0015\u000eS\u007f(3I\u0002\\ec3W\u0002Ib\u0012a\rU\u000b";
      f6530[26] = "|iJ\n\u0013\n|i]V\u001f\u0005f\"]H\u001f\u0010aS\f\u0011HR";
      f6530[27] = "h@8\u0018LYh@/D@Vr\u000b/Z@Cuzy\u0004\u0014\u0000";
      f6530[28] = "\u0006/K9>*\u0006/\\e2%\u001cd\\{20\u001b\u0015\t$k";
      f6530[29] = "0N\u0003^{\u0005`\u001f\u0005\n\u001e\u000e6\u0003\u0002\u0006r<fC^^\u001eQk\u0003\u0002\u0013w\u001a&F\bau\u0011<\u0006\u0002\u000b|\u0007?Cb]rTfBR\\!\t=\u007f";
      f6530[30] = "I(\r\u0019\u0013\bC9\u0001aϳq\u001c:[Y\u0001\u0012J:\r_";
      f6530[31] = "D\u001a#Q\u001e\u0002B\u0018#Tg\u001bE\u0005*I\u000b)\u0016Av\u0011g\u0015R\u001e3N\r\u001cD\u001dv.";
      f6530[32] = "\u0017E\u0017=\u0019\u0018B\u001eY9pԙ-GU \u0010\u000bD\f\u0018e\u001ay";
      f6530[33] = "x!D;us00\u000f<\u001bЛHpC:#-1+G.}\u0011y\u007f\u0005z'h\"{\u0011$\u001b";
      f6530[34] = "\u001a5\bkc\u0002\u0019$\bl\u001aI] \u0010``SJ'k0h^\u0018;\u0007opQ\u001fJWg%\u000f\u001dzV4xT ";
      f6530[35] = "@)\u001bOG~C8\u001bH>3\u001c-\u0005EE%\u00007\u0012B>u\b:@^R*\u00105G/\u0002\"EkE\u001f\u0003q\u00180x";
      f6530[36] = "D4Eh\b5J3\u0006$qɘ)>\u00073\b>C7\u00110M^D0D)\u0014;I3\u00071qbEj@iAc\u00167\u001bT";
      f6530[37] = "_js{'lAm%u\u0017q\\ruu{C\u000e1,+\u0017{Sm(#|,Wh$\u0012";
      f6530[38] = "nF,yisgP/<\t|h@+geN:\rs1\ty9C(?i'tG(\u0000";
      f6530[39] = "\b5'\u0017ue\u00056d\u000f\u0010{\u0004\"sj*0\u00190l\u0003a}\\:\u001e";
      f6530[40] = "\u0011\u0006\u0013b~\u007fCR\u0014.\u001d~AJ\t9qL\u0015\u000bQa\u001d&KG\t4mrU\u000f\u0010^!w\u0013\u000bTn $NPi";
      f6530[41] = "x_\\.D\\rNPV]%*G\u001c'_AkVQ/4\u001bt[\u0011=PZe\u0016\u0019V";
      f6530[42] = "W\f\u0003\u0015\u000bxQ\u000e\u0003\u0010raV\u0013\n\r\u001eS\u0000VWVB\u0004[\u000fT\u0018\tvP\r[Sr";
      f6530[43] = "\u0017VkwGZI\u0004w :VC:(,@\u000fK^zxGC";
      f6530[44] = "\u0016k\u000ee\\f\u000f4\bs!/\u007fj\u000bw\u0019?\u00061\u000fcG\u0003NeM7\u001dz\u0015aYi!";
      f6530[45] = "\u0005\n-nDR\b\tnv!R\u0005\u0013ttM`QW.*\u001a7R_hsS^\u0019\u0012-y!\f\u001a\u0003,bMS\u0002\f+\u0013LRQ\u0012qvAQ\u0012\n\u0014";
      f6530[46] = "\u001br\u0019\u000233Mu@\u0004\f?\u001ecmXm?\tb_<f/\rjJPg-Oo$\u0000`iO2\u0014\u000134\u0014\u000f";
      f6530[47] = "6;\\'=k=?[-\\~:,\u0006%0LkkZ}d\u001bfn\u001ez`b=j\n$\\yf.\r/&c80\tB";
      f6530[48] = "OQ\u001bT0Y\u001d\u0005\u001c\u0018SS\u0013\f\u0005\u0004\u0004\u0004LQ^h0\u0006C\u0010\u0005T5W\u001d\u0013";
      f6530[49] = "e\u0015~\\w\u00117Ay\u0010\u0014\u001b9H`\fCLg\u001f8`x\u00161Z}\u001c~\u00141_";
      f6530[50] = ")\u0011\u0019\nmweQBR\u0004Ҝ\u0019\u0015V\td?)\u0016G\tc";
      f6530[51] = "\u0003\u0005M$\u0011I\u000e\u0006\u000e<tC\u0003\u001ctcDP\u000e\u0012\u001d(\t\u0015\u0004`O+\u0018\u0014\u001f\f\u00103\u0017\u0013n";
      f6530[52] = "p@^S\";yV]\u0016B?zW]F\u0015a#\u0001\u0006*)+|CY@ =\u007f\u0006";
   }
   public static Field m159(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m160(Class var0, String var1, Class var2) {
      Field var3 = m159(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m160(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }
   public static Method m162(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label33:
      for (Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for (int var10 = 0; var10 < var3; var10++) {
                  if (var9[var10] != var4[var10]) {
                     continue label33;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

   public static Method m163(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m162(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m163(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }
}
