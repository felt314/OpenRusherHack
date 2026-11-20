package org.rusherhack;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.SkinTextures;
import org.rusherhack.core.event.type.Event;

public class Event488 extends Event {
   public AbstractClientPlayerEntity f7866;
   public PlayerListEntry f7867;
   public SkinTextures f7868;
   public boolean f7869;
   public static Object[] f7871 = new Object[10];
   public static String[] f7872 = new String[10];

   public Event488(SkinTextures var1, AbstractClientPlayerEntity var2, PlayerListEntry var3) {
      super();
      this.f7869 = false;
      this.f7868 = var1;
      this.f7866 = var2;
      this.f7867 = var3;
   }

   public void m15185(SkinTextures var1) {
      this.f7868 = var1;
      this.f7869 = true;
   }

   public PlayerListEntry m15186() {
      return this.f7867;
   }

   public boolean m15187() {
      return this.f7869;
   }

   public AbstractClientPlayerEntity m15188() {
      return this.f7866;
   }

   public SkinTextures m15189() {
      return this.f7868;
   }

   static {
      m122();
   }
   public static void m122() {
      f7871[0] = "{<\u000b%n`g&\tyttw%Bѽ";
      f7871[1] = "{ul\u0011U\u0017{u{MY\u0018a>{SY\rfO.\u000b\b";
      f7871[2] = boolean.class;
      f7872[2] = "java/lang/Boolean";
      f7871[3] = "`ra_WL`rv\u0003[Cz9v\u001d[V}H-G\u0002\u0010";
      f7871[4] = "0750Q\u000607\"l]\t*|\"r]\u001c-\rv*\u000e";
      f7871[5] = "P\u0019\\\u001c\u001a\\[\u0016MS{RP\u001dI\t";
      f7871[6] = "O\u0012<&sp\u0017TlTö\u0017D\rwn &\u001f\u001eh/";
      f7871[7] = "\u0015\u0015rm~-MS\"\u001fǴJ\u001fU:\u007f{4\u001e\b!m";
      f7871[8] = "\u0003\u00030\u0013\u001dN[E`aі)\u000b\u0017g\u0003\u001fB\tD4\u001b";
      f7871[9] = "*:ED\fbr|\u00156˂\u0005\"'\u0018Y\u0016|k{\u0001D";
   }
}
