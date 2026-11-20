package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import java.util.Random;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import org.rusherhack.client.api.events.client.chat.EventChatMessage;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class RusherCrypt extends ToggleableModule {
   public String f6435;
   public String f6436;
   public String f6437;
   public String f6438;
   public String f6439;
   public String f6440;
   public String f6441;
   public BooleanSetting encrypt;
   public String f6443;
   public String f6444;
   public String f6445;
   public String f6446;
   public String f6447;
   public BooleanSetting decrypt;
   public String f6449;
   public String f6450;
   public String f6451;
   public String f6452;
   public String f6453;
   public String f6454;
   public String f6455;
   public String f6456;
   public String f6457;
   public String f6458;
   public BooleanSetting chatobfuscation;
   public String f6460;
   public String f6461;
   public String f6462;
   public String f6463;

   public String m12716(String var1) {
        return null;
    }

   @Subscribe
   public void onChatMessage(EventChatMessage var1) {
      if (!var1.getMessage().startsWith("!")) {
         if (!var1.getMessage().startsWith("#")) {
            String var6 = var1.getMessage();
            if ((Boolean)this.encrypt.getValue()) {
               var6 = var6.replace("a", "Ω")
                  .replace("b", "έ")
                  .replace("c", "Җ")
                  .replace("d", "†")
                  .replace("e", "‰")
                  .replace("f", "‼")
                  .replace("g", "‿")
                  .replace("h", "‽")
                  .replace("i", "⁇")
                  .replace("j", "⁔")
                  .replace("k", "⁐")
                  .replace("l", "⁋")
                  .replace("m", "₡")
                  .replace("n", "₰")
                  .replace("o", "℃")
                  .replace("p", "℧")
                  .replace("q", "℻")
                  .replace("r", "ⅉ")
                  .replace("s", "Ⅷ")
                  .replace("t", "ↈ")
                  .replace("u", "∭")
                  .replace("v", "⌛")
                  .replace("w", "⌚")
                  .replace("x", "⎞")
                  .replace("y", "⏧")
                  .replace("z", "⏣")
                  .replace("A", "Ω")
                  .replace("B", "έ")
                  .replace("C", "Җ")
                  .replace("D", "†")
                  .replace("E", "‰")
                  .replace("F", "‼")
                  .replace("G", "‿")
                  .replace("H", "‽")
                  .replace("I", "⁇")
                  .replace("J", "⁔")
                  .replace("K", "⁐")
                  .replace("L", "⁋")
                  .replace("M", "₡")
                  .replace("N", "₰")
                  .replace("O", "℃")
                  .replace("P", "℧")
                  .replace("Q", "℻")
                  .replace("R", "ⅉ")
                  .replace("S", "Ⅷ")
                  .replace("T", "ↈ")
                  .replace("U", "∭")
                  .replace("V", "⌛")
                  .replace("W", "⌚")
                  .replace("X", "⎞")
                  .replace("Y", "⏧")
                  .replace("Z", "⏣");
            }

            if ((Boolean)this.chatobfuscation.getValue()) {
               if (var6.length() < 64) {
                  var6 = this.m12718(var6);
               }

               if (var6.length() > 64) {
                  var6 = this.m12716(var6);
               }
            }

            var1.setMessage(var6);
         }
      }
   }

   public RusherCrypt() {
      super(
         "RusherCrypt",
         "Encrypt and Decrypt chat messages that users with Decrypt online can see",
         ModuleCategory.CHAT
      );
      this.f6452 = "Ω";
      this.f6456 = "έ";
      this.f6436 = "Җ";
      this.f6440 = "†";
      this.f6447 = "‰";
      this.f6444 = "‼";
      this.f6461 = "‿";
      this.f6439 = "‽";
      this.f6438 = "⁇";
      this.f6462 = "⁔";
      this.f6441 = "⁐";
      this.f6455 = "⁋";
      this.f6453 = "₡";
      this.f6437 = "₰";
      this.f6443 = "℃";
      this.f6463 = "℧";
      this.f6450 = "℻";
      this.f6460 = "ⅉ";
      this.f6457 = "Ⅷ";
      this.f6458 = "ↈ";
      this.f6449 = "∭";
      this.f6446 = "⌛";
      this.f6445 = "⌚";
      this.f6451 = "⎞";
      this.f6435 = "⏧";
      this.f6454 = "⏣";
      boolean var10010 = true;
      this.encrypt = new BooleanSetting("Encrypt", true);
      boolean var10009 = true;
      this.decrypt = new BooleanSetting("Decrypt", true);
      boolean var10008 = true;
      this.chatobfuscation = new BooleanSetting("ChatObfuscation", true);
      Setting[] var10001 = new Setting[]{this.encrypt, null, null};
      boolean var10005 = true;
      var10001[1] = this.decrypt;
      var10001[2] = this.chatobfuscation;
      this.registerSettings(var10001);
   }

   public String m12718(String var1) {
        return null;
    }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      Packet var5;
      if ((Boolean)this.decrypt.getValue() && (var5 = var1.getPacket()) instanceof GameMessageS2CPacket) {
         ChatUtils.print(
            ((GameMessageS2CPacket)var5)
               .content()
               .getString()
               .replace("Ω", "a")
               .replace("έ", "b")
               .replace("Җ", "c")
               .replace("†", "d")
               .replace("‰", "e")
               .replace("‼", "f")
               .replace("‿", "g")
               .replace("‽", "h")
               .replace("⁇", "i")
               .replace("⁔", "j")
               .replace("⁐", "k")
               .replace("⁋", "l")
               .replace("₡", "m")
               .replace("₰", "n")
               .replace("℃", "o")
               .replace("℧", "p")
               .replace("℻", "q")
               .replace("ⅉ", "r")
               .replace("Ⅷ", "s")
               .replace("ↈ", "t")
               .replace("∭", "u")
               .replace("⌛", "v")
               .replace("⌚", "w")
               .replace("⎞", "x")
               .replace("⏧", "y")
               .replace("⏣", "z")
         );
      }
   }
}
