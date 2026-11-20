package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.MessageIndicator;
import net.minecraft.client.gui.hud.ChatHudLine.Visible;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.MutableText;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.MathHelper;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.client.IMixinMinecraft;
import org.rusherhack.client.api.accessors.gui.IMixinChatComponent;
import org.rusherhack.client.api.accessors.packet.IMixinClientboundSystemChatPacket;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.client.chat.EventAddChat;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.InputUtils;
import org.rusherhack.client.api.utils.objects.PlayerRelation;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.client.api.feature.module.impl.client.Background;
import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
public class ExtraChat extends ToggleableModule {
   public EnumSetting<ExtraChatFormatting> formatting;
   public Animation f7684;
   public BooleanSetting mentions;
   public BooleanSetting toggleTheChatBackground;
   public NumberSetting<Integer> maxlines;
   public boolean f7688;
   public ColorSetting color;
   public BooleanSetting sound;
   public BooleanSetting friends;
   public BooleanSetting stripblanklines;
   public NumberSetting<Integer> f7693;
   public BooleanSetting redactYourNameFromGameChat;
   public BooleanSetting background;
   public EnumSetting<ExtraChatAnimateTheEntryOfNewChatMessages> animateTheEntryOfNewChatMessages;
   public static ExtraChat f7697;
   public BooleanSetting highlight;
   public BooleanSetting text;
   public BooleanSetting customfont;
   public BooleanSetting donTDeleteGameChatWhenYouLeaveAServer;
   public BooleanSetting ignoreselfmsgs;
   public static long f7703 = Class066.m4320(-4818637076618960001L, -5453249681733694966L, MethodHandles.lookup().lookupClass()).m4325(529814212263L);
   public static long f7710;
   public static Object[] f7711 = new Object[251];
   public static String[] f7712 = new String[251];

   public ExtraChat() {
    }

   public int m14882(Visible var1) {
      long var2 = f7703 ^ 2682453442339L;
      return ((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "m", java.lang.invoke.MethodType.methodType(int.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Globals.mc.textRenderer,  var1.content(),  -2764518516006790895L,  var2))).intValue() + 4;
   }

   @Subscribe(
      priority = 999
   )
   public void onRender2D(EventRender2D var1) {
      this.m14893(var1.getMatrixStack(), Globals.mc.inGameHud.getTicks(), (int)InputUtils.getMouseX(), (int)InputUtils.getMouseY());
   }

   public int m14884() {
      double var3 = this.customfont.getValue() ? Renderer346.f5593.getFontHeight() : Class563.f9092.getFontHeight();
      return (int)(var3 * ((Double)Globals.mc.options.getChatLineSpacing().getValue() + 1.0));
   }

   public double m14885(double var1) {
      return (Globals.mc.getWindow().getScaledHeight() - var1 - 40.0) / (Globals.mc.inGameHud.getChatHud().getChatScale() * this.m14884());
   }

   public double m14887(double var1) {
      return var1 / Globals.mc.inGameHud.getChatHud().getChatScale() - 4.0;
   }

   public static double m14888(int var0) {
      double var3 = var0 / 200.0;
      double var5;
      double var10000 = MathHelper.clamp((var5 = 1.0 - var3) * 10.0, 0.0, 1.0);
      return var10000 * var10000;
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (this.f7688) {
         Globals.mc.player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
         this.f7688 = false;
      }
   }

   @Subscribe
   public void m14891(Event254 var1) {
      boolean var10003 = true;
      var1.setCancelled(true);
   }

   @Subscribe(
      priority = 700
   )
   public void onReceive(EventPacket$Receive var1) {
      Packet var7;
      if ((var7 = var1.getPacket()) instanceof GameMessageS2CPacket) {
         GameMessageS2CPacket var5;
         Text var8 = (var5 = (GameMessageS2CPacket)var7).content();
         IMixinClientboundSystemChatPacket var9 = (IMixinClientboundSystemChatPacket)var1.getPacket();
         if ((Boolean)this.stripblanklines.getValue() && var8.getString().contains("\n")) {
            MutableText var10 = Text.empty();
            var8.visit((var1x, var2x) -> {
               String var6 = var2x.replace("\n", "");
               var10.append(Text.literal(var6).fillStyle(var1x));
               return Optional.empty();
            }, Style.EMPTY);
            var9.setContent(var10);
         }
      }
   }

   public void m14893(MatrixStack var1, int var2, int var3, int var4) {
        
    }

   @Subscribe
   public void onAddChat(EventAddChat var1) {
        
    }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f7712[var4] != null) {
         return var4;
      } else {
         Object var5 = f7711[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 42;
               case 1 -> 20;
               case 2 -> 43;
               case 3 -> 41;
               case 4 -> 11;
               case 5 -> 61;
               case 6 -> 2;
               case 7 -> 54;
               case 8 -> 10;
               case 9 -> 40;
               case 10 -> 21;
               case 11 -> 34;
               case 12 -> 55;
               case 13 -> 29;
               case 14 -> 24;
               case 15 -> 13;
               case 16 -> 36;
               case 17 -> 18;
               case 18 -> 39;
               case 19 -> 53;
               case 20 -> 59;
               case 21 -> 22;
               case 22 -> 62;
               case 23 -> 47;
               case 24 -> 45;
               case 25 -> 58;
               case 26 -> 50;
               case 27 -> 4;
               case 28 -> 49;
               case 29 -> 6;
               case 30 -> 57;
               case 31 -> 0;
               case 32 -> 9;
               case 33 -> 44;
               case 34 -> 60;
               case 35 -> 16;
               case 36 -> 8;
               case 37 -> 33;
               case 38 -> 17;
               case 39 -> 5;
               case 40 -> 15;
               case 41 -> 51;
               case 42 -> 3;
               case 43 -> 37;
               case 44 -> 52;
               case 45 -> 7;
               case 46 -> 32;
               case 47 -> 1;
               case 48 -> 56;
               case 49 -> 27;
               case 50 -> 19;
               case 51 -> 14;
               case 52 -> 46;
               case 53 -> 35;
               case 54 -> 25;
               case 55 -> 28;
               case 56 -> 26;
               case 57 -> 31;
               case 58 -> 12;
               case 59 -> 23;
               case 60 -> 38;
               case 61 -> 48;
               case 62 -> 63;
               default -> 30;
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

            f7712[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f7711[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f7712[var4]);
            f7711[var4] = var5;
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
      Object var5 = f7711[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f7712[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f7711[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f7711[var4] = var13;
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
               var12 = m180(780750705641381L, 0L);
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
      Object var5 = f7711[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f7712[var4];
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
               f7711[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(780750705641381L, 0L);
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
                     f7711[var4] = var19;
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
               var23 = m180(780750705641381L, 0L);
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
         if (var8 != 246 && var8 != 'C' && var8 != 211 && var8 != 245) {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'm') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'O') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 246) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'C') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 211) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ExtraChat.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ў" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
