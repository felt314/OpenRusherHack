package org.rusherhack.client.api.feature.module.impl.player;
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
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponent.StatusEffectEntry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinLocalPlayer;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.Hunger;
import org.rusherhack.client.api.feature.module.impl.combat.AutoSurround;
import org.rusherhack.client.api.feature.module.impl.combat.AutoTotem;
public class AutoEat extends ToggleableModule {
   public Hand f2895;
   public BooleanSetting milk;
   public BooleanSetting pausebaritone;
   public BooleanSetting untilfull;
   public BooleanSetting poisonous;
   public NumberSetting<Integer> f2900;
   public EnumSetting<AutoEatMode> mode;
   public int f2902;
   public BooleanSetting chorus;
   public boolean f2904;
   public static AutoEat f2905;
   public BooleanSetting burning;
   public BooleanSetting returnToLastHeldItem;
   public int f2908;
   public NumberSetting<Integer> f2909;
   public BooleanSetting useGoldenApplesToRefillHunger;
   public static long f2911 = Class066.m4320(-2504813298469134367L, -5796402571205116583L, MethodHandles.lookup().lookupClass()).m4325(178757154506181L);
   public static String[] f2912;
   public static String[] f2913;
   public static long[] f2915;
   public static Integer[] f2916;
   public static Map f2917;
   public static Object[] f2918 = new Object[165];
   public static String[] f2919 = new String[165];

   @Override
   public void onEnable() {
      this.f2904 = false;
      this.f2895 = null;
      this.f2908 = -1;
   }

   public void m6284() {
      int var3 = Class253.m9155();
      if (var3 != 0) {
         if (Globals.mc.player != null) {
            ItemStack var5;
            if (!(var5 = Globals.mc.player.getActiveItem()).isEmpty() && Globals.mc.player.isHolding(var5.getItem())) {
               Globals.mc.player.stopUsingItem();
            }

            if (this.f2908 != -1 && (Boolean)this.returnToLastHeldItem.getValue()) {
               Globals.mc.player.getInventory().selectedSlot = this.f2908;
            }
         }

         this.f2904 = false;
         this.f2895 = null;
         this.f2908 = -1;
      }
   }

   public boolean m6285(boolean var1) {
      if ((!this.isToggled() || !this.f2904)
         && (var1 || !Globals.mc.player.isUsingItem() || !Globals.mc.player.getActiveItem().contains(DataComponentTypes.FOOD))) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   public void m6286(int var1, Hand var2) {
      AutoEat var8;
      if (var2 == Hand.MAIN_HAND) {
         if (this.f2908 == -1) {
            this.f2908 = Globals.mc.player.getInventory().selectedSlot;
         }

         Globals.mc.player.getInventory().selectedSlot = var1;
         var8 = this;
      } else {
         var8 = this;
         this.f2908 = -1;
      }

      if (!var8.m6288(Globals.mc.player.getStackInHand(var2))) {
         this.m6284();
      } else {
         Globals.mc.options.useKey.setPressed(false);
         this.f2904 = true;
         this.f2895 = var2;
         if (Globals.mc.player.getActiveItem().isEmpty() || ((IMixinLocalPlayer)Globals.mc.player).getUsingItemHand() != var2) {
            ActionResult var6;
            if ((var6 = Globals.mc.interactionManager.interactItem(Globals.mc.player, var2)).isAccepted()) {
               if (var6.shouldSwingHand()) {
                  Globals.mc.player.swingHand(var2);
               }

               Globals.mc.gameRenderer.firstPersonRenderer.resetEquipProgress(var2);
            }

            Globals.mc.player.setCurrentHand(var2);
         }
      }
   }

   @Subscribe
   public void m6287(Event547 var1) {
      if (Class170.f3353 && (Boolean)this.pausebaritone.getValue() && this.f2904) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   public boolean m6288(ItemStack var1) {
        return false;
    }

   @Subscribe(
      stage = Stage.POST,
      priority = -100
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      int var4 = Class253.m9155();
      AutoEat var5 = this;
      if (this.f2902 > 0) {
         boolean var10005 = true;
         this.f2902--;
         this.f2908 = Globals.mc.player.getInventory().selectedSlot;
      } else if (!AutoTotem.f3491.m7405() && !AutoSurround.f7212.m13915()) {
         if (this.f2904) {
            if (this.f2895 == null || !this.m6288(Globals.mc.player.getStackInHand(this.f2895))) {
               this.m6284();
               return;
            }

            this.m6286(Globals.mc.player.getInventory().selectedSlot, this.f2895);
         }

         int var11 = -1;
         int var10000;
         if (this.m6288(Globals.mc.player.getOffHandStack())) {
            var10000 = var11 = 45;
         } else {
            float var7 = -1.0F;

            int var6;
            for (int var12 = var6 = 0; var12 < 9; var12 = ++var6) {
               ItemStack var9 = Globals.mc.player.getInventory().getStack(var6);
               if (var5.m6288(var9) || var4 == 0) {
                  FoodComponent var10;
                  float var8 = (var10 = (FoodComponent)var9.get(DataComponentTypes.FOOD)) == null ? -1.0F : var10.nutrition() * var10.saturation();
                  if (var8 > var7) {
                     var7 = var8;
                     var11 = var6;
                  }
               }
            }

            var10000 = var11;
         }

         if (var10000 != -1) {
            var5.m6286(var11, var11 < 45 ? Hand.MAIN_HAND : Hand.OFF_HAND);
         } else {
            if (var5.f2904) {
               var5.m6284();
            }
         }
      } else {
         this.f2908 = -1;
         this.m6284();
      }
   }

   @Subscribe
   public void m6290(Event537 var1) {
      if (var1.m16566().equals(Globals.mc.player) && this.f2904) {
         if (!(Boolean)this.untilfull.getValue()) {
            this.m6284();
         } else {
            Item var9 = var1.m16567().getItem();
            boolean var12;
            if (this.mode.getValue() == AutoEatMode.f087 || var9 != Items.GOLDEN_APPLE && var9 != Items.ENCHANTED_GOLDEN_APPLE) {
               var12 = false;
            } else {
               var12 = true;
               boolean var10002 = true;
            }

            boolean var5 = var12;
            if (this.mode.getValue() != AutoEatMode.f088) {
               var12 = true;
               boolean var16 = true;
            } else {
               var12 = false;
            }

            boolean var10 = var12;
            if (Globals.mc.player.getHealth() >= 20.0F) {
               var12 = true;
               boolean var17 = true;
            } else {
               var12 = false;
               boolean var18 = true;
            }

            boolean var6 = var12;
            if (Globals.mc.player.getHungerManager().getFoodLevel() >= 20) {
               var12 = true;
               boolean var19 = true;
            } else {
               var12 = false;
               boolean var20 = true;
            }

            boolean var7 = var12;
            if ((!var5 || var6) && (!var10 || var7)) {
               this.m6284();
               return;
            }
         }
      }
   }

   @Override
   public void onDisable() {
      this.m6284();
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   public AutoEat() {
      super("AutoEat", "Automatically eat when you are hungry", ModuleCategory.PLAYER);
      this.mode = new EnumSetting<>("Mode", AutoEatMode.f087);
      this.f2909 = new NumberSetting<>("Hunger", 14, 0, 19)
         .clampMax()
         .setVisibility(() -> {
            if (this.mode.getValue() != AutoEatMode.f088) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
      int var10000 = Class253.m9155();
      this.f2900 = new NumberSetting<>("Health", 14, 0, 36)
         .setVisibility(() -> {
            if (this.mode.getValue() != AutoEatMode.f087) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
      this.untilfull = new BooleanSetting("UntilFull", "Keep eating until health or hunger is completely filled", false);
      boolean var10012 = true;
      this.returnToLastHeldItem = new BooleanSetting("Return", "Return to last held item", true);
      this.milk = new BooleanSetting("Milk", false);
      this.useGoldenApplesToRefillHunger = new BooleanSetting("GoldenApples", "Use golden apples to refill hunger", false);
      this.burning = new BooleanSetting("Burning", "Use enchanted golden apples for fire resistance", false);
      this.chorus = new BooleanSetting("Chorus", false).setVisibility(() -> {
         if (this.mode.getValue() != AutoEatMode.f088) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      int var3 = var10000;
      this.poisonous = new BooleanSetting("Poisonous", false).setVisibility(() -> {
         if (this.mode.getValue() != AutoEatMode.f088) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10010 = true;
      this.pausebaritone = new BooleanSetting("PauseBaritone", true);
      this.f2908 = -1;
      f2905 = this;
      boolean var10003 = true;
      this.useGoldenApplesToRefillHunger.addSubSettings(this.burning);
      AutoEat var4 = this;
      Setting[] var10001 = new Setting[9];
      var10001[0] = this.mode;
      boolean var10005 = true;
      var10001[1] = this.f2909;
      var10001[2] = this.f2900;
      var10001[3] = this.untilfull;
      var10001[4] = this.returnToLastHeldItem;
      var10001[5] = this.milk;
      var10001[6] = this.useGoldenApplesToRefillHunger;
      var10001[7] = this.chorus;
      var10001[8] = this.poisonous;
      if (var3 != 0) {
         this.registerSettings(var10001);
         if (!Class170.f3353) {
            return;
         }

         var4 = this;
         var10003 = true;
         var10001 = new Setting[]{this.pausebaritone};
      }

      var4.registerSettings(var10001);
   }

   public boolean m6292() {
      return this.m6285(false);
   }

   @Subscribe
   public void m6295(Event163 var1) {
      if (this.f2904) {
         ItemStack var6;
         if (!(var6 = Globals.mc.player.getActiveItem()).isEmpty() && this.m6288(var6)) {
            boolean var10003 = true;
            var1.setCancelled(true);
         }
      }
   }

   static {
    }
   public static String m221(byte[] var0) {
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
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21768;
      if (f2916[var3] == null) {
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
         long var5 = f2915[var3];
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
         Object[] var9 = (Object[])f2917.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f2917.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ĳ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f2916[var3] = var15;
      }

      return f2916[var3];
   }

   public static int m176(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m175(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoEat.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ĳ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m1731() {
      f2918[0] = "6m\u001a\u0010 y6m\rL,v,&\rR,c+W_\b{!";
      f2918[1] = int.class;
      f2919[1] = "java/lang/Integer";
      f2918[2] = " \u0012\u0002\fH{<\b\u0000PRo,\u000bKȤ";
      f2918[3] = "@WK?z\u001a\\MIc`\u000eLN\u0002ģ";
      f2918[4] = "|p`o'I|pw3+Ff;w-+SaJ%vs\u0019";
      f2918[5] = boolean.class;
      f2919[5] = "java/lang/Boolean";
      f2918[6] = "5\r\u00010EQ5\r\u0016lI^/F\u0016rIK(7L-\u001b\t";
      f2918[7] = "sc\u0019w\u0018}xl\b8yssg\fb";
      f2918[8] = "m|+dA\u0015qf)8[\u0001aebї";
      f2918[9] = "\u0007u\u0019s'/\u0007u\u000e/+ \u001d>\u000e1+5\u001aO\\o|~";
      f2918[10] = "\u001d\u0012.SL^\u001d\u00129\u000f@Q\u0007Y9\u0011@D\u0000(mI\u0017";
      f2918[11] = "M1\u0003\u0000\"9Q+\u0001\\8-A(JƯ";
      f2918[12] = "y\u0017@KGTy\u0017W\u0017K[c\\W\tKNd-\u0000T\u001d\t";
      f2918[13] = "K,c\u0018U%W6aDO1G5*ɂ";
      f2918[14] = void.class;
      f2919[14] = "java/lang/Void";
      f2918[15] = float.class;
      f2919[15] = "java/lang/Float";
      f2918[16] = "RH5+1vNR7w+b^Q|f/jXT&+\"sT\u0014\u0015i,a\\V!";
      f2918[17] = "\u001aJ=w\u0019X\u001aJ*+\u0015W\u0000\u0001*5\u0015B\u0007pzhD";
      f2918[18] = "NVmH>yNVz\u00142vT\u001dz\n2cSl U`$";
      f2918[19] = "3Q\u001eMM\n/K\u001c\u0011W\u001e?HWĈ";
      f2918[20] = "\u0014%i\u001a\u0003\u0010\u001f*xUo\u0013\u0011(z\u001aC";
      f2918[21] = "plhVgElvj\n}Q|u!\u001bzBz0|\u001daDvphVW_prj\u0019{czj{\u0011{W";
      f2918[22] = "r&}j/Wn<\u007f65C~?4'2Pxzi!)Vt:}j\u000eGi s*:";
      f2918[23] = "9\u0015$\u0004Y$%\u000f&XC05\fmID#3I&\\N?\"I7S[4x\"5OE%\u0015\u0006-IN=:\u0006!FN";
      f2918[24] = "Qv@C2HMlB\u001f(\\]o\t҈";
      f2918[25] = "R\u000e-GzjR\u000e:\u001bveHE:\u0005vpO4hZ':";
      f2918[26] = "\u0013P|T}?\u0013Pk\bq0\t\u001bk\u0016q%\u000ej9M d";
      f2918[27] = "YV8=;GYV/a7HC\u001d/\u007f7]Dl}$o\u001c";
      f2918[28] = "\u0015gbP\u0006^\u0015gu\f\nQ\u000f,u\u0012\nD\b]'F[\u0005";
      f2918[29] = "<R9iBd H;5Xp0Kp\u0000";
      f2918[30] = "%)ZNfP93X\u0012|D)0\u0013\u0003{W/uN\u0005`Q#5ZNQK?6n\u0005`Q#5Z";
      f2918[31] = "\fEh\u0012\u0004u\fE\u007fN\bz\u0016\u000e\u007fP\bo\u0011\u007f*\u000f_";
      f2918[32] = "\u00128\u0006:H,\u00128\u0011fD#\bs\u0011xD6\u000f\u0002C\"\u0010r";
      f2918[33] = "%lg\u0015\r%%lpI\u0001*?'pW\u0001?8V\"\tVu";
      f2918[34] = "\u00175n\u001d>T\u00175yA2[\r~y_2N\n\u000f-\u0006d";
      f2918[35] = "\t$\u0011\u0007\u001f$\t$\u0006[\u0013+\u0013o\u0006E\u0013>\u0014\u001eR\u001cK";
      f2918[36] = "c*f\b\u0001.c*qT\r!yaqJ\r4~\u0010!\u0016X";
      f2918[37] = "3\u0003\b\u00143y3\u0003\u001fH?v)H\u001fV?c.9O\u000bk";
      f2918[38] = "\u0014[Na<e\bAL=&q\u0018B\u0007,\"y\u001eG]a/`\u0012\u0007H,-u\bZF==>\u001eG]&:iU`d&6y\u0015eF,/|+EH6+b";
      f2918[39] = "\u000fpYd\u00189\u0004\u007fH+e!\u0017xAb";
      f2918[40] = "\u0007\u00027Y'6\u0019\n-\u0016@7\b\u0011 Lf1";
      f2918[41] = "\u0007\u001d7y\u0018(\u0007\u001d %\u0014'\u001dV ;\u00142\u001a'wfBuM\u001b/6\u000626AweF";
      f2918[42] = "\u001c\u0003\u001fA6.\u001c\u0003\b\u001d:!\u0006H\b\u0003:4\u00019Z]bt";
      f2918[43] = "\u001a<M>^u\u00113\\q=x\u00045";
      f2918[44] = "\"w9G{6<\u007f#\b\u0016,$z*E!*'x";
      f2918[45] = "b0nuq\u0010b0y)}\u001fx{y7}\n\u007f\n,c$I";
      f2918[46] = "cM+?ls\u007fW)cvgoTbrqti\u0011?tjreQ+?Psa])cMcxK%\u007fy";
      f2918[47] = "\u000e\u000el\f2!\u000e\u000e{P>.\u0014E{N>;\u00134)\u0010fy";
      f2918[48] = "K\"\u000f\u0005\fi@-\u001eJkkU&\u001e\u0001P";
      f2918[49] = "\n*5\u000e4@\n*\"R8O\u0010a\"L8Z\u0017\u0010p\u0012`\u001d";
      f2918[50] = "\u000frCK]2\u0011zY\u0004?.\u0016g";
      f2918[51] = "R\n\u0006P\u001e\u001eN\u0010\u0004\f\u0004\n^\u0013O\u001d\u0000\u0002X\u0016\u0015P\r\u001bTV\u0007\u001b\r\u001fH\n\u0004P\u0001\u0004Y\r\r\u001bB?R\u001f\u0006\u0012\t\n_\u0014\u00043\u0003\u000fH\u0014\u0004";
      f2918[52] = "0y#E\u0014\u000e,c!\u0019\u000e\u001a<`j\b\n\u0012:e0E\u0007\u000b6%1\u001f\u000f\u0017,%+\t\f\u001e<\u007f7E5\u0018-d(\u0007\u0004\u001a-";
      f2918[53] = "'6\u000ev0D9>\u00149xD#4\f~q_c\u0015\u0017xrT,9+bnA!>\u001de";
      f2918[54] = "m-A\\\u0013\u000bq7C\u0000\t\u001fa4\b\u0011\r\u0017g1R\\\u0000\u000ekq@\u0017\u0000\nw-C\\\f\u0011f*J\u0017O3m;S\u001e\u0004=c+C\u0015\u000e\f{";
      f2918[55] = "g\u0003AT\u001b]{\u0019C\b\u0001Ik\u001a\b\u0019\u0006Zm_E\u0015\u0004Ei\u001fBT\bZo\u0004K\u001f\u0007\\&\"R\b\u0000Fo2G\n\u001d]z\u0014";
      f2918[56] = "~{fg]4WBz}_hMVj~\u0014yJEl;I\u007fQC`{]4vR}aStB\f";
      f2918[57] = "\u001f{Ckpr\u0003aA7jf\u0013b\n&nn\u0015gPkcw\u0019'B cs\u0005{Akoh\u0014|H ,J\u001fmQ)g";
      f2918[58] = "RG`neg{~|tg;ajlw,*fyj2q,}\u007ffregZn{hk'n0";
      f2918[59] = "Pz^{H:\u0012:D{67K&YM\f`\u001d}!fLeC2HeK;IC";
      f2918[60] = "Tvc]9d\b\"b\u0013\u0005եnw!W9'\n%f\u0002g";
      f2918[61] = "Mm(53BEsw'OMD`q?#\u007f\u0013-(iOML\"jb~CYshXqD\u0017,i<2UWl\u0011>,\u0010Je-b>NW\u001c";
      f2918[62] = "UJ?\u000f*Q\b\f!\u001b\u0011ΑkJi\u0007|D\u0014G+\tk*";
      f2918[63] = "\t\u0015Z\u001dEBH\r\\\u000e(C\u0010\u0016Y:\u0013\u0014Fs\u001c\\\u0012A\u0011\u0010X\\\u0010Bw";
      f2918[64] = "4XB\u0019\u001eXz\u0005\u001b\ty\u0006fDA\u0011\u001545\u0000\u0018Gy]g\u0006\u0011\u000e\u001d\u001evFQv\u0010YoJJ\rH\u0001jX!";
      f2918[65] = "t]\u000f\u0014\u000bS|\u0006\u0017U\n\"\u0015 ;?\u007fxM]K\u0013H\u001b<U\u0010\u000b\t\u001a";
      f2918[66] = "%1ap\u0002;y#?m{b..9t\u0017Pyig-E\u0007\u007fk<~\u0015xr)2i{";
      f2918[67] = "|e\u000fc7Zf}\u000f~\u000b\u000eus3~p\u0019|f\u000eAb\u0005eb\u007feg\u0001yi\u0000t{\u0002h\u000f";
      f2918[68] = "T(ZA@yU)\u0000\u0017zaB)`\u0010\u001e}IUF\u0006\n~\u001b<A\u000bK\u0000";
      f2918[69] = "Wh>WQq_4h\u0019`~Ghg\u000b7-\u0017<3g\u001ev]un\r_n[f";
      f2918[70] = "Z|PeWP\u0001z\u0015!/V\r|N:Cd_1\u0010e/\u000fYeC3P\u0002\u001bkT]";
      f2918[71] = "mT\t\u000bn\u00131\u0000\bERƐWUK\u0001nP3\u0007\fT0";
      f2918[72] = "\u001e%#RSMB7}O*\u0014\u0015:{VF&B}%\u000f\u0017qD\u007f~\\D\u000eI=pK*";
      f2918[73] = "7ip\u0014,8k=qZ\u0010Ƣ\rh2\u001e,{i:uKr";
      f2918[74] = "}L\bJ-;y_ZIQ'~C\u0000_\u0006y%\u0015_306nD\u0019Rkt~\u0012";
      f2918[75] = "55Xd9Od$SfF_>&\fl\u0011\bazP\u0000>Ca%\u0004i*An'";
      f2918[76] = "b\u001ennr(kHr#\u001cǵ\u0002\u0018k`$kaCm%`\u0013";
      f2918[77] = "`jv+65t>o6G1a\u0007`7w0uy1&|2";
      f2918[78] = "Ya|jVJ\u0001!|o47:{~,\t\u0018\n#>,\f";
      f2918[79] = "\u0006\n\\\u0010@n\u001dZ\u001eJ'4\u0014\u001b`\u0019W(}\\\u001f\u0011J:\u0002Q]\u001f]T";
      f2918[80] = "\\\u001cS]\u0002\u0019GL\u0011\u0007eEJ\u0006U9X\u0012\u001d\u001fOZ\u001c\u0012\u001f\u001c)";
      f2918[81] = "\r1]$O Qe\\jsШ70\u001f.OcSbX{\u0011";
      f2918[82] = "=S?@`ia\u0007>\u000e\\ä\u0007R}J`*c\u0000:\u001f>";
      f2918[83] = "\u0007a<.^v[5=`bͱ=7x`Zs^l~%\u001e\u000b\u00014as\ft\fvodb";
      f2918[84] = "$l\u000e[\nyx8\u000f\u00156Ȝ\u001e<\u000f\u000e[ja1M\u0000L";
      f2918[85] = "(~OUB}{dP\u000b\u007fɇ\u0011yP\u001f\u0001!x~]^\u007f";
      f2918[86] = "B>j?\u001c\u0013\u001ejkq ɟx*-\u007f^Q\u0011- >";
      f2918[87] = "}LU5]\u00063\u0011\f%:X/PV=Vj}\u0017\nf:\\,E\b6V\f\u007fWTZ";
      f2918[88] = "m9c0JCr~h!3Al-w5OGj@v6IDwzmf\u000b\u001e\u0010";
      f2918[89] = "'%\u0005ES\u0010ix\\U4Nu9\u0006MX|&}Y\u00174B\"!\u0014AO\u001az$\u0006*";
      f2918[90] = "\u0019}r\u001bZEW +\u000b=\u001bKaq\u0013Q)\u0018%.E=DZc)\f^\u001f\\&mt";
      f2918[91] = "*hGoS\u0011v<F!oȔ\u0010>\u0013g_PmbGf\u0011";
      f2918[92] = "]=i.hw\u0013`0>\u000f)\u000f!j&c\u001b]f1{\u000fp[8g/p}\u00196pA3u\u00070d>>7\t'\n";
      f2918[93] = "\u0019\u0010\u000bM8\tCSZ\r\u0002ê)\u0013R\u0010oWV\u001e\u0010\u001ex9";
      f2918[94] = "Y4}\u0006\fn]'/\u0005prZ;u\u0013',\u0000h.\u007f\u0011cJ<l\u001eJ!Zj";
      f2918[95] = "y-:\u001b#\u000b1n=\u000ey0l\u0017\"\u0013!Q&h3\u000f\"@@m4\u001f V?|(\u001c10";
      f2918[96] = "kK}\u0007l\u001ajJ'QV\u001drRdR\u0011\r\u001bNfO(\\rIk\u000eV\u0013fR!\u0005/\u0012g\bw?";
      f2918[97] = "L_{o\u0000r\f\u0015fjy%\u001bJ~FCrM\u0016\u0006i\u0006>\u0002\u0010on\u000b\u007f|";
      f2918[98] = ",VN(S(<^\f$+=/Ln3O//0\rk\u0011;$SIk\u00138B";
      f2918[99] = "jk!v\u0013_6? 8/εPn#\"]I+6{'O\"";
      f2918[100] = "+\u0012K\u000e0^wFJ@\fΗ\u0011\u0013\t\u00040\u001duANQn";
      f2918[101] = "j63rM<$kjb*b8*0zFPknk'*n2<)wJ}hi-\u001d";
      f2918[102] = ".:m8}}npp=\u0004*y/h\u0011>}/w\u00107t? {\u007f;`:pJ";
      f2918[103] = "+h)\f^.'|,\\o &u-[\u0013& \u0018,X\u0015%=\"7\bW\u007fZ";
      f2918[104] = "gSY;~@c@\u000b8\u0002\\d\\Q.U\u00029\u000f\u000eBcMt[H#8\u000fd\r";
      f2918[105] = "#\u0013`'_n7X||<`)E`+Ul\u0010K`;Q\nr\u001ba+Ru\u007fYo<<";
      f2918[106] = "\u0005tF]2WY G\u0013\u000eȿ?|\u0014\u001dr\u0016\u0004f\f\u001do";
      f2918[107] = "Of\rrT6\u001ew\u0006p+&DuYz|q\u001a'\u0006\u0016M/Uf\f-Zx\u001fq";
      f2918[108] = "h\u0012\u0001{Ai?V\u00124;geC\u0014*l4<\u0016O{;5f\\\u0014}\u0003uk\u0013I";
      f2918[109] = "g|\u0007\u0013et?<\u0007\u0016\u0007+\u0004f\u0005U:&4>EU?";
      f2918[110] = "SQ=j\u0012\u0015A\\`U\u0000\u0004RG0\u0002QX\u0003\u001e\\-\u0011\u0015A\u001c5*\u001cT";
      f2918[111] = " Z\u001fH\u007f\u00154\u0011\u0003\u0013\u001c\u000f$\u000f\u0006D[\u001fMWBLq\u001f2Z\u0000Bfq Z\u001fH\u007f\u00154\u0011\u0003\u0013\u001c";
      f2918[112] = "\u00057\t1\u0018>E}\u00144aiR\"\f\u0018[>\u0004|tsXgX)\u000b~\u001aiOG";
      f2918[113] = "s^l9(>r\u000ficV9oR\u0002y),p\u000bk~$m\u000eL}q(cgKp0V$qD|>?#|\u0005\u0002";
      f2918[114] = ")\u00150qFMlB5vDw<-svZ\u0016vRbjY\u0007\u0010Wez[\u0011oFyyJw";
      f2918[115] = "P!!(&9\fu f\u001aνjq }w*\u0015|bs`DVt|ut;[6rb\u001a";
      f2918[116] = "?O\u007fO3Dq\u0012&_T\u001amS|G8(>\u0017!\u0011T\u0001fTlM>@~R\u007f hFeBr_e\u0004kU\u001c";
      f2918[117] = "\u001d\u0013*i>ASNsyY\u001fO\u000f)a5-\u0019Jt:izN\u0001(9%\n\\\fu\u0006";
      f2918[118] = "\u0002Dj\u000b\u001b\u0016M\f,Re\u001d\u0010\bO\u000b\u001e\u0007\u0017\u0015u\u000b\u0019\u0017}M(\u0001\u001aVE\u001esT\u001d\u0003}\u000b!\u0011\u0004\u0018\rDiW]f";
      f2918[119] = "\u0010G\u0004xaK\u0015\u0010\u000e)\u000eE\tT\n!u(M\u0018Y,hK\t\u0018[/\u000e\u0014IL\u000e+q\u0019\u000bB\u0019E";
      f2918[120] = "0=WBn8liV\fRк\n<\u0015Hn{nnR\u001d0";
      f2918[121] = "\u0004{/n4>\u0004d:5Zf\u0016u(l6TF4w0Z?Bl%e%2\u0000b2\u000b";
      f2918[122] = "Z\n\u0011KKh\r^\r\u00184rXM&\u001aRbXU\t\u001eX\t\t\b\b\u001eZv\u0004J\u0006\t4`\u000fU\u001f\u0018O8WP\rs";
      f2918[123] = "\u0000!4\u0006O\u0001@k)\u00036VW41/\f\u0001\u0001kI\u0011QWI;)\u0002\u000b\u0002MQ";
      f2918[124] = "[qOuuXVj\u001em\u000fˋ7&\u001ftb\rH+]zu";
      f2918[125] = "x\u0012jc-!'I`nF\"r\td{*\u0010$O=!FysK4d\":b\u000bt\u001c/}{\u0007ogw%~\u0015\u0004";
      f2918[126] = "~&O\bZW0{\u0016\u0018=\t,:L\u0000Q;|v\u0014V=Px#A\tB]:-Vg";
      f2918[127] = "sit$tp./j0OњMk'&\"066a86";
      f2918[128] = "r'8Jj\u007fs&y\u0014\f*g9`\u0013`\u00180~<D5O6|e\u0019b0;>k\u000e\f&0!r\u001fw~h$`t";
      f2918[129] = "v,\u0011&WF&\u007f\u0003z;Oz>\u0018\u007fW}(\u007fH&;Rh2\u0006'RUesx";
      f2918[130] = "xX\nZ<\u0002#^O\u001eD\u0004/X\u0014\u0005(6}\u0015LSD\u0000=U\u001e\u001f%[\u007fEHb";
      f2918[131] = "]RE\u0015tj^U\u001b\u001f\u0005fLT\u001c\u001diT\u001c\u0015CK\u0005}GS\f\u0017o<_U\u001fz";
      f2918[132] = "&\u0000J> %'QOd^\"2\u001a$~!7%UMy,v[\u0012[v x2\u0015V7^?$\u001aZ978)[$";
      f2918[133] = "Jm\fKE;]d\u0013_>l^|#I_e\\A\u0002_[CZf\u00122\u0000o\r0\u0006VC~Mp~";
      f2918[134] = "\u001f\u000e1MzaQSh]\u001d?M\u00122Eq\r\u001eWk\u001f\u001df\u0019\u000b?Lbk[\u0005(\"";
      f2918[135] = "`0.G~%#p`\u001aq\u001b#f>Kog4q\nGhg8m>Q\u0014\"eq,Gfk4v0V\u0014rco#Ao*;j1*";
      f2918[136] = "B?!y;\u0010\fbxi\\N\u0010#\"q0|Cg|)\\B\u001a5;|<Q@`?\u0016";
      f2918[137] = "kd8*g6\u007ff7(\u000b1r{b(\\f\".:Ds=+(`tr<jv";
      f2918[138] = "i\u0017wG\u001aA'J.W}\u001f;\u000btO\u0011-hN,\u0014}D:I.P\u0019\u0007+\td(\u0014@2\u0005\u007fSL\u00187\u0017\u0014";
      f2918[139] = "\rnGM|,^tX\u0013Aԯ4iX\u0007?p]nUFA";
      f2918[140] = ";\u0004\u0019j)#2R\u0005'Gĺ[X\u000e}zw8]Yw+\u0018";
      f2918[141] = "0Pd\u001b\u0006hkV!_~ngPzD\u0012\\7\u0013*\u0019@\u000b6NhGE3vC'\u001a~73IwM\u0001:qG`#";
      f2918[142] = "\u00174#{\"'L2f?Z!@4=$6\u0013\u0010wmyfD\u0011*/'a|Q'`zZy\u001cr4%9=\u001cp7C";
      f2918[143] = "_\u001e\u0013\r\taHIY\u001a84X\u0014\u0007\u001fof\u0001@Ys_=W\u0006\b\u0015\u0000f]\u000b";
      f2918[144] = "B~^z\u0017}\u0001o\u001e:ow\u001d\u007f\u0004&8$L+XJQuB\"\u0018.\u0012d\u0002b";
      f2918[145] = "4k\u001bC\u001c</tAD'4=U\u001b\u0016H1+e|E\u001e0+g\u0003H\\><\t";
      f2918[146] = "\u007f\u0007\u000b\u001cU#-@^Bk<\u007f\u0001oA\u0010&x\u001cUA\u00176\u0012D\bK\u0014w*\u0017S\u001e\u0013\"\u0012\u0010K\u001aWyvB\fO\tG";
      f2918[147] = "nRe-VS!\u001a#t(Hu\u000b{4mJaba|SBo\u0012.4\u0015\u001b\u0011";
      f2918[148] = "\u0005\r|\u001bN4T\u001cw\u00191$\u000e\u001e(\u0013fsPMu\u007fU;V\u001e0\u0015]%\t\f";
      f2918[149] = ";&Y\b\u0017CgrXF+ɐ\u00015QCJ@qz\u0019\u0005\u0013";
      f2918[150] = "F\u001aE0l1\bG\u001c \u000bo\u0014\u0006F8g]DK\u0017o\u000b4\u0015D\u0016'ow\u0004\u0004V_1v\u0007B^<jpB\u0006&";
      f2918[151] = "fq\u0015w\tY:%\u001495Ā\\b\u001d<TZ,-Uz\r";
      f2918[152] = "Y \u000fq\u0003L\u0005t\u000e??Xc}\r&QM^pH\u007fF1RvP/C\f_3\t8?";
      f2918[153] = "\u0015TE~s\tO\u0017\u0014>Iҿ%[\u001a&q\u0003\u0015\u0001Yw1";
      f2918[154] = "\u001e\u0001{osPBUz!Oă$\u0015</1\u0012M\u00121nO\u0013HSs'+PY\u00133_&\u0017@\u001f($~OE\rC";
      f2918[155] = "7%[$Q;'-\u0019()(5/~+C\u001a4?Y7O.\"C\u001cjS<41U;T %CLlM328\u00144H!Y";
      f2918[156] = "\f\u0013N\u0017x2BN\u0017\u0007\u001fl^\u000fM\u001fs^\rK\u0016@\u001f3O\r\u0015\u0000|hIHQx";
      f2918[157] = "?R|f`\u0005q\u000f%v\u0007[mN\u007fnki>\n%7\u0007Cy\\spd\\>Wb\t";
      f2918[158] = "\r(d\u00154\u001e\u001f%9*-\u0003\u001d:bF\u001fS]a5*0\u0011\u0011$:C7\u001cPZ?V6V\u00199dPs\u0012a";
      f2918[159] = "(\u0004]B\u0019.tP\\\f%о\u0012V\tL\u0015+v\u0015\u0018\fU";
      f2918[160] = "\u000ftO[&\u001eS N\u0015\u001aɁ5u\rQ&]Q'J\u0004x";
      f2918[161] = "\u0005V\u000b{\n-FGK;r'ZWQ'%t\u000b\u0002\u0005KL%\u0005\nM/\u000f4EJ";
      f2918[162] = ":+$\u0005HIk:/\u00077Y18p\r`\u000eoo(a\bW3:sZF\nj*";
      f2918[163] = "B<$+\u0017L\u001eh%e+ҋx(ckU\u000e\u0011/n*";
      f2918[164] = "'\f\u001d7N\u001ciQD')Bu\u0010\u001e?Ep\"PCa\u0019'y\u0013\u000f2TF\"Q\u001fd)\u001b!\t\u00136V\u0016c\u0007\u0004X";
   }
   public static Field m181(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m182(Class var0, String var1, Class var2) {
      Field var3 = m181(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m182(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }
   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m184(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m185(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }
}
