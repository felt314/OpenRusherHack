package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.option.KeyBinding;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

public class Module375 extends ToggleableModule {
   public Timer f6138;
   public BooleanSetting f6139;
   public BooleanSetting f6140;
   public Timer f6142;
   public BooleanSetting f6143;
   public BooleanSetting f6144;
   public BooleanSetting f6145;
   public static List<KeyBinding> f6146;
   public NumberSetting<Float> f6147;
   public BooleanSetting f6148;
   public NumberSetting<Float> f6149;
   public BooleanSetting f6150;
   public BooleanSetting f6151;
   public BooleanSetting f6152;
   public static long f6153 = Class066.m4320(-3155530618304056231L, 7910007052275778656L, MethodHandles.lookup().lookupClass()).m4325(80791545761578L);
   public static String[] f6154;
   public static String[] f6155;
   public static Map f6156 = new HashMap(13);
   public static long[] f6157;
   public static Integer[] f6158;
   public static Map f6159;
   public static Object[] f6160 = new Object[115];
   public static String[] f6161 = new String[115];

   @Override
   public String getMetadata() {
      long var1 = f6153 ^ 65732964904981L;
      String var10000 = ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "ü", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, long.class, long.class)), m172(27914, 7562755655525257464L ^ var1),  -5140632321647288158L,  var1)));
      boolean var10003 = true;
      return ((java.lang.String)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "ü", java.lang.invoke.MethodType.methodType(java.lang.String.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), 
         var10000, 
         new Object[]{((java.lang.Long)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "ü", java.lang.invoke.MethodType.methodType(java.lang.Long.class, long.class, long.class, long.class)), ((java.lang.Long)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(long.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.core.utils.Timer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "o", java.lang.invoke.MethodType.methodType(org.rusherhack.core.utils.Timer.class, java.lang.Object.class, long.class, long.class)), this,  -5137502148345596448L,  var1))),  -5142922500756431705L,  var1))).longValue(),  -5140243554018258253L,  var1)))}, 
         -5139409268713964119L, 
         var1
      )));
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   

   @Override
   public void onDisable() {
      long var1 = f6153 ^ 11218634330420L;
      if (org.rusherhack.Class170.f3353 && ((net.minecraft.client.world.ClientWorld)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "o", java.lang.invoke.MethodType.methodType(net.minecraft.client.world.ClientWorld.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.client.MinecraftClient)(org.rusherhack.client.api.Globals.f286)),  -7380139354418845857L,  var1))) != null) {
         org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "ü", java.lang.invoke.MethodType.methodType(void.class, long.class, long.class)), -7383465611525006749L,  var1);
      }
   }

   public Module375() {
    }

   @Subscribe
   public void m12223(Class499 var1) {
      long var2 = f6153 ^ 108088892532455L;
      int var4 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "ü", java.lang.invoke.MethodType.methodType(int.class, long.class, long.class)), 7953033523920138335L,  var2))).intValue();
      boolean var7 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), (Boolean)((java.lang.Object)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Module375)(this)).f6145,  7949613560580370673L,  var2))),  7949072145320856431L,  var2))).booleanValue();
      if (var4 == 0) {
         if (!var7) {
            return;
         }

         var7 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.client.Freecam)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "A", java.lang.invoke.MethodType.methodType(org.rusherhack.client.Freecam.class, long.class, long.class)), 7950716699872533959L,  var2))),  7952456007611599755L,  var2))).booleanValue();
      }

      label77:
      if (var4 == 0) {
         if (var7) {
            var7 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.client.Freecam)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "A", java.lang.invoke.MethodType.methodType(org.rusherhack.client.Freecam.class, long.class, long.class)), 7950716699872533959L,  var2))),  7952235616838177850L,  var2))).booleanValue();
            if (var4 != 0) {
               break label77;
            }

            if (!var7) {
               return;
            }
         }

         var7 = ((net.minecraft.client.option.KeyBinding)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(net.minecraft.client.option.KeyBinding.class, java.lang.Object.class, long.class, long.class)), var1,  7950681435227123035L,  var2)))
            .equals(((net.minecraft.client.option.KeyBinding)(((net.minecraft.client.option.GameOptions)(((net.minecraft.client.option.GameOptions)(((net.minecraft.client.MinecraftClient)(((net.minecraft.client.MinecraftClient)(org.rusherhack.client.api.Globals.f286)))).options)))).forwardKey)));
      }

      label64:
      if (var4 == 0) {
         if (!var7) {
            var7 = ((net.minecraft.client.option.KeyBinding)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(net.minecraft.client.option.KeyBinding.class, java.lang.Object.class, long.class, long.class)), var1,  7950681435227123035L,  var2)))
               .equals(((net.minecraft.client.option.KeyBinding)(((net.minecraft.client.option.GameOptions)(((net.minecraft.client.option.GameOptions)(((net.minecraft.client.MinecraftClient)(((net.minecraft.client.MinecraftClient)(org.rusherhack.client.api.Globals.f286)))).options)))).backKey)));
            if (var4 != 0) {
               break label64;
            }

            if (!var7) {
               var7 = ((net.minecraft.client.option.KeyBinding)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(net.minecraft.client.option.KeyBinding.class, java.lang.Object.class, long.class, long.class)), var1,  7950681435227123035L,  var2)))
                  .equals(((net.minecraft.client.option.KeyBinding)(((net.minecraft.client.option.GameOptions)(((net.minecraft.client.option.GameOptions)(((net.minecraft.client.MinecraftClient)(((net.minecraft.client.MinecraftClient)(org.rusherhack.client.api.Globals.f286)))).options)))).leftKey)));
               if (var4 != 0) {
                  break label64;
               }

               if (!var7) {
                  var7 = ((net.minecraft.client.option.KeyBinding)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(net.minecraft.client.option.KeyBinding.class, java.lang.Object.class, long.class, long.class)), var1,  7950681435227123035L,  var2)))
                     .equals(((net.minecraft.client.option.KeyBinding)(((net.minecraft.client.option.GameOptions)(((net.minecraft.client.option.GameOptions)(((net.minecraft.client.MinecraftClient)(((net.minecraft.client.MinecraftClient)(org.rusherhack.client.api.Globals.f286)))).options)))).rightKey)));
                  if (var4 != 0) {
                     break label64;
                  }

                  if (!var7) {
                     var7 = ((net.minecraft.client.option.KeyBinding)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(net.minecraft.client.option.KeyBinding.class, java.lang.Object.class, long.class, long.class)), var1,  7950681435227123035L,  var2)))
                        .equals(((net.minecraft.client.option.KeyBinding)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "o", java.lang.invoke.MethodType.methodType(net.minecraft.client.option.KeyBinding.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.client.option.GameOptions)(((net.minecraft.client.MinecraftClient)(((net.minecraft.client.MinecraftClient)(org.rusherhack.client.api.Globals.f286)))).options)),  7946246625690179884L,  var2))));
                     if (var4 != 0) {
                        break label64;
                     }

                     if (!var7) {
                        var7 = ((net.minecraft.client.option.KeyBinding)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(net.minecraft.client.option.KeyBinding.class, java.lang.Object.class, long.class, long.class)), var1,  7950681435227123035L,  var2)))
                           .equals(((net.minecraft.client.option.KeyBinding)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "o", java.lang.invoke.MethodType.methodType(net.minecraft.client.option.KeyBinding.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.client.option.GameOptions)(((net.minecraft.client.MinecraftClient)(((net.minecraft.client.MinecraftClient)(org.rusherhack.client.api.Globals.f286)))).options)),  7952838427188690314L,  var2))));
                        if (var4 != 0) {
                           break label64;
                        }

                        if (!var7) {
                           return;
                        }
                     }
                  }
               }
            }
         }

         var7 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), var1,  7946541971442593280L,  var2))).booleanValue();
      }

      if (var7) {
         org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.core.utils.Timer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "o", java.lang.invoke.MethodType.methodType(org.rusherhack.core.utils.Timer.class, java.lang.Object.class, long.class, long.class)), this,  7952608724156630246L,  var2))),  7952434725520946325L,  var2);
         org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.core.utils.Timer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "o", java.lang.invoke.MethodType.methodType(org.rusherhack.core.utils.Timer.class, java.lang.Object.class, long.class, long.class)), this,  7944829691469439762L,  var2))),  7952434725520946325L,  var2);
      }
   }

   public List<Enum521> m12224() {
      long var1 = f6153 ^ 116515020522056L;
      int var10000 = ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "ü", java.lang.invoke.MethodType.methodType(int.class, long.class, long.class)), -8434753333331335836L,  var1))).intValue();
      ArrayList var5 = new ArrayList();
      int var3 = var10000;
      boolean var6 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), (Boolean)((java.lang.Object)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Module375)(this)).f6143,  -8431379671523355554L,  var1))),  -8430794894692405312L,  var1))).booleanValue();
      if (var3 != 0) {
         if (var6) {
            ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var5,  ((org.rusherhack.Enum521)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "A", java.lang.invoke.MethodType.methodType(org.rusherhack.Enum521.class, long.class, long.class)), -8434027443297093530L,  var1))),  -8433306782223831844L,  var1))).booleanValue();
         }

         var6 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), (Boolean)((java.lang.Object)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Module375)(this)).f6150,  -8431379671523355554L,  var1))),  -8430794894692405312L,  var1))).booleanValue();
      }

      if (var3 != 0) {
         if (var6) {
            ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var5,  ((org.rusherhack.Enum521)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "A", java.lang.invoke.MethodType.methodType(org.rusherhack.Enum521.class, long.class, long.class)), -8434971097338609816L,  var1))),  -8433306782223831844L,  var1))).booleanValue();
         }

         var6 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), (Boolean)((java.lang.Object)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Module375)(this)).f6144,  -8431379671523355554L,  var1))),  -8430794894692405312L,  var1))).booleanValue();
      }

      if (var3 != 0) {
         if (var6) {
            ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var5,  ((org.rusherhack.Enum521)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "A", java.lang.invoke.MethodType.methodType(org.rusherhack.Enum521.class, long.class, long.class)), -8435552319566622231L,  var1))),  -8433306782223831844L,  var1))).booleanValue();
         }

         var6 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), (Boolean)((java.lang.Object)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Module375)(this)).f6152,  -8431379671523355554L,  var1))),  -8430794894692405312L,  var1))).booleanValue();
      }

      if (var3 != 0) {
         if (var6) {
            ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var5,  ((org.rusherhack.Enum521)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "A", java.lang.invoke.MethodType.methodType(org.rusherhack.Enum521.class, long.class, long.class)), -8431718145453779073L,  var1))),  -8433306782223831844L,  var1))).booleanValue();
         }

         var6 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), (Boolean)((java.lang.Object)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Module375)(this)).f6151,  -8431379671523355554L,  var1))),  -8430794894692405312L,  var1))).booleanValue();
      }

      if (var3 != 0) {
         if (var6) {
            ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var5,  ((org.rusherhack.Enum521)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "A", java.lang.invoke.MethodType.methodType(org.rusherhack.Enum521.class, long.class, long.class)), -8437326314602732752L,  var1))),  -8433306782223831844L,  var1))).booleanValue();
         }

         var6 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), (Boolean)((java.lang.Object)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.Module375)(this)).f6140,  -8431379671523355554L,  var1))),  -8430794894692405312L,  var1))).booleanValue();
      }

      if (var3 != 0) {
         if (var6) {
            ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var5,  ((org.rusherhack.Enum521)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "A", java.lang.invoke.MethodType.methodType(org.rusherhack.Enum521.class, long.class, long.class)), -8431742448307753504L,  var1))),  -8433306782223831844L,  var1))).booleanValue();
         }

         var6 = org.rusherhack.Class170.f3353;
      }

      if (var3 != 0) {
         if (!var6) {
            return var5;
         }

         var6 = ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, long.class, long.class)), (Boolean)((java.lang.Object)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(java.lang.Object.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.core.setting.BooleanSetting)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "o", java.lang.invoke.MethodType.methodType(org.rusherhack.core.setting.BooleanSetting.class, java.lang.Object.class, long.class, long.class)), this,  -8434839610521080425L,  var1))),  -8431379671523355554L,  var1))),  -8430794894692405312L,  var1))).booleanValue();
      }

      if (var3 != 0 && var6) {
         ((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var5,  ((org.rusherhack.Enum521)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "A", java.lang.invoke.MethodType.methodType(org.rusherhack.Enum521.class, long.class, long.class)), -8436440303241622422L,  var1))),  -8433306782223831844L,  var1))).booleanValue();
      }

      return var5;
   }

   @Override
   public void onEnable() {
      long var1 = f6153 ^ 5298791939977L;
      org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.core.utils.Timer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "o", java.lang.invoke.MethodType.methodType(org.rusherhack.core.utils.Timer.class, java.lang.Object.class, long.class, long.class)), this,  3976628018416482940L,  var1))),  3977487299523866107L,  var1);
      org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "Ç", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), ((org.rusherhack.core.utils.Timer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "A", java.lang.invoke.MethodType.methodType(org.rusherhack.core.utils.Timer.class, long.class, long.class)), 3975520369536154042L,  var1))),  3977487299523866107L,  var1);
      if (org.rusherhack.Class170.f3353 && ((net.minecraft.client.world.ClientWorld)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "o", java.lang.invoke.MethodType.methodType(net.minecraft.client.world.ClientWorld.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.client.MinecraftClient)(org.rusherhack.client.api.Globals.f286)),  3974836507282328034L,  var1))) != null) {
         org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "ü", java.lang.invoke.MethodType.methodType(void.class, long.class, long.class)), 3977687188180278807L,  var1);
      }
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

   public static String m172(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1352;
      if (f6155[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f6156.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f6156.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new IllegalStateException("org/rusherhack/Ϊ", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         try {
DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f6154[var5].getBytes("ISO-8859-1");
         f6155[var5] = m221(((Cipher)var4[0]).doFinal(var9));

         } catch (Exception exception) {

            throw new IllegalStateException(exception);

         }
      }

      return f6155[var5];
   }

   public static Object m173(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = m172(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Module375.class, "m173", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ϊ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13525;
      if (f6158[var3] == null) {
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
         long var5 = f6157[var3];
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
         Object[] var9 = (Object[])f6159.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f6159.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ϊ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f6158[var3] = var15;
      }

      return f6158[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Module375.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ϊ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f6161[var4] != null) {
         return var4;
      } else {
         Object var5 = f6160[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 38;
               case 1 -> 56;
               case 2 -> 51;
               case 3 -> 53;
               case 4 -> 2;
               case 5 -> 58;
               case 6 -> 50;
               case 7 -> 42;
               case 8 -> 28;
               case 9 -> 24;
               case 10 -> 9;
               case 11 -> 27;
               case 12 -> 63;
               case 13 -> 43;
               case 14 -> 17;
               case 15 -> 4;
               case 16 -> 11;
               case 17 -> 21;
               case 18 -> 35;
               case 19 -> 59;
               case 20 -> 40;
               case 21 -> 18;
               case 22 -> 31;
               case 23 -> 12;
               case 24 -> 33;
               case 25 -> 14;
               case 26 -> 39;
               case 27 -> 8;
               case 28 -> 37;
               case 29 -> 26;
               case 30 -> 55;
               case 31 -> 48;
               case 32 -> 5;
               case 33 -> 25;
               case 34 -> 46;
               case 35 -> 44;
               case 36 -> 29;
               case 37 -> 22;
               case 38 -> 62;
               case 39 -> 60;
               case 40 -> 15;
               case 41 -> 19;
               case 42 -> 10;
               case 43 -> 34;
               case 44 -> 7;
               case 45 -> 20;
               case 46 -> 6;
               case 47 -> 3;
               case 48 -> 45;
               case 49 -> 49;
               case 50 -> 61;
               case 51 -> 54;
               case 52 -> 47;
               case 53 -> 30;
               case 54 -> 16;
               case 55 -> 57;
               case 56 -> 13;
               case 57 -> 36;
               case 58 -> 41;
               case 59 -> 23;
               case 60 -> 32;
               case 61 -> 1;
               case 62 -> 0;
               default -> 52;
            };
            int[] var7 = new int[6];

            for (int var8 = 0; var8 < 6; var8++) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for (int var14 = 0; var14 < var13.length; var14++) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            f6161[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f6160[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f6161[var4]);
            f6160[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
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

   public static Field m183(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f6160[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f6161[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f6160[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f6160[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new IllegalStateException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = m180(1298743404650384L, 0L);
            }
         }
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

   public static Method m186(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f6160[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f6161[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            var11++;
            var12++;
         } while ((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for (int var16 = 0; var16 < var11; var16++) {
            int var17 = var6.indexOf(8, var12);
            var15 = m180(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m184(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f6160[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1298743404650384L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m185(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f6160[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while (var29 < var13) {
                  var28.append(var14[var29].getName());
                  if (++var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new IllegalStateException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1298743404650384L, 0L);
            }
         }
      }
   }

   public static MethodHandle m187(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'o' && var8 != 235 && var8 != 'A' && var8 != 'N') {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 199) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 252) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'o') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 235) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'A') {
               var9 = var0.findStaticGetter(var12, var18, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var18, var14);
            }
         }

         return MethodHandles.dropArguments((MethodHandle)var9, var3.parameterCount() - 2, long.class, long.class);
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName())
            .append(" : ")
            .append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null "))
            .append(" : ")
            .append(var15.toString());
         throw new IllegalStateException(var13.toString());
      }
   }

   public static Object m188(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m187(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Module375.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ϊ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
