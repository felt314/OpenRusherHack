package org.rusherhack.client;
import org.rusherhack.*;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.rusherhack.Class170;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.graphic.IGraphic;

public abstract class Util040 extends Screen implements Globals {
   public Screen f1287;
   public IGraphic f1288;
   public static int[] f1289;
   public static Object[] f1291 = new Object[39];
   public static String[] f1292 = new String[39];

   public void close() {
        
    }

   public boolean shouldPause() {
        return false;
    }

   public Util040(Text var1, IGraphic var2) {
      super(var1);
      this.f1288 = var2;
      this.f1287 = null;
   }

   public void m3050(Screen var1) {
        
    }

   public void m2802(DrawContext var1, int var2, int var3, float var4) {
        
    }

   public void render(DrawContext var1, int var2, int var3, float var4) {
        
    }

   public void m3052(IGraphic var1) {
        
    }

   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   public void renderBackground(DrawContext var1, int var2, int var3, float var4) {
        
    }

   public IGraphic m3053() {
        return null;
    }

   public void resize(MinecraftClient var1, int var2, int var3) {
        
    }

   public Util040(Text var1) {
      this(var1, null);
   }

   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
        return false;
    }

   public void init() {
        
    }

   public boolean mouseReleased(double var1, double var3, int var5) {
        return false;
    }

   public void tick() {
        
    }

   public static void m3054(int[] var0) {
        
    }

   public static int[] m3055() {
        return null;
    }

   static {
      m194();
      if (m3055() != null) {
         m3054(new int[1]);
      }
   }
   public static void m194() {
        
    }

   Util040() { super(net.minecraft.text.Text.empty()); }
}
