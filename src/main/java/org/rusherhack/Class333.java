package org.rusherhack;

import org.rusherhack.client.api.feature.hud.IHudElement;
import org.rusherhack.client.api.ui.panel.PanelBase;

import org.rusherhack.command.toggle;
public class Class333 extends Renderer271 {
   public IHudElement f5340;
   public static Object[] f5342 = new Object[31];
   public static String[] f5343 = new String[31];

   public Class333(PanelBase<?> var1, IHudElement var2) {
      super(var1, null);
      this.f5340 = var2;
      this.m5382(var2.getSettings());
   }

   @Override
   public void m6448(double var1, double var3) {
      this.getPanel().getFontRenderer().drawString(this.m4900(), 2.0, 2.0, -1);
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.m5378(var1, var3) && var5 == 0) {
         this.f5340.toggle();
         return true;
      } else {
         return super.mouseClicked(var1, var3, var5);
      }
   }

   public IHudElement m10916() {
      return this.f5340;
   }

   @Override
   public String m4900() {
      return this.f5340.getDisplayName();
   }

   @Override
   public boolean m4901() {
      return this.f5340.isToggled();
   }

   static {
      m1731();
   }
   public static void m1731() {
      f5342[0] = "\u000e/;em*\u0012599w>\u00026r(p-\u0004s:.~+\u0014/9eV\u0019\u0004<(>m:\"22-v8\u0014/=)s:";
      f5342[1] = "\u000e>\u001ax,Q\u00106\u00007NM\u0017+";
      f5342[2] = "\u0016J\u00072D\u0017\nP\u0005n^\u0003\u001aSNî";
      f5342[3] = void.class;
      f5343[3] = "java/lang/Void";
      f5342[4] = "KX;[>EWB9\u0007$QGAr\u0016#BA\u00045\u001b8UVL=\u0016)C\nc\u0012\u0014!U@";
      f5342[5] = "@\u0007EK\u0018\u001eK\bT\u0004e\u0006X\u000f]M";
      f5342[6] = "b\u0014\u000eH\b@~\u000e\f\u0014\u0012Tn\rG˶";
      f5342[7] = "MZA\\m\u001dQ@C\u0000w\tAC\b\u0011s\u0001GFR\\~\u0018K\u0006@\u0017~\u001cWZC\\w\u001dF\u0006o:j\fgDC\u001fz\u0006V";
      f5342[8] = "H,RX1wT6P\u0004+cD5\u001b\u0015,pBp\\\u00187gU8T\u0015&q\t\u0017a\u0019$eK;T\u0014/g";
      f5342[9] = boolean.class;
      f5343[9] = "java/lang/Boolean";
      f5342[10] = "\u0015\u0012l%I\u0011\t\bnyS\u0005\u0019\u000b%hW\r\u001f\u000e\u007f%Z\u0014\u0013N~b\u0015\u0014\u001b\u000eng\u00154\u001b\u000engy\u0005\t\u0005";
      f5342[11] = "w~\u00148_$kd\u0016dE0{g]uA8}b\u00078L!q\"\u0001sC5}~]pB?l\":PB?l^\u0016xI4ji\u0001";
      f5342[12] = double.class;
      f5343[12] = "java/lang/Double";
      f5342[13] = int.class;
      f5343[13] = "java/lang/Integer";
      f5342[14] = "\u0016\u001deh\u007f8\n\u0007g4e,\u001a\u0004,%a$\u001c\u0001vhl=\u0010Aw/#=\u0018\u0001g*#\u001d\u0018\u0001g*D9\u001c\u0002@'~(";
      f5342[15] = "y5\u001c\u00038Se/\u001e_\"Gu,Uə";
      f5342[16] = "e23E+By(1\u00191Vi+zɭ";
      f5342[17] = "\tvNUrA\u0002y_\u001a\u0013O\tr[@";
      f5342[18] = "VGb3\u000b\f\u0010\u0013#w2\t\u0004\u0002\u001dnT\u001a3\u00135e_\u001c\u0004\u0004S9\u000f\u0000\u0006F2lQVV~";
      f5342[19] = "G\t\",;z\u0012Wt|\u0003w\r];\u0018\u007fa\u0016R+C8~H\t'.>+JPDsed\u0015^{29!\u00164t%|y\u001d\u000b5y9zw\u0005':a%\u001dF|x9\u001bGR;!i$\u0006\u000e~\"\u0003";
      f5342[20] = "\n9GDH\u000b\u00070\u0016L#ϒ6i\u0018\u0017\u001e\n[oM\u0015Gi";
      f5342[21] = "rb\n\u00172a\u007fk[\u001fYjN`U\u000b!h(1\n\u00109\u0003'l@\u00032ev3[\u001bY";
      f5342[22] = "c^,x\f\u000btP5x~Ȣ\t\n*z\u001cEcIq8D{";
      f5342[23] = "}[\u0003Oe(,@^\u001eU&+M*N.1\"X\u0017i<,+1]Jjt%\\[\u001fh-F";
      f5342[24] = "fvvSE#5o}\u0010 Ɠ_'uUB*`f)\u0010A@oqlHJ\u007f.-)K ~&gkHXz`eq*";
      f5342[25] = "\u0011\u0017_v v\u0013P\u0014L!`\u00065\u000302l\u001c\u0001\u0015L0c\u0013_\u000e6#}\u0015n";
      f5342[26] = "`s]k\u0003\u000b3jV(fĺYlV{W\b#\u007fH}fRitSx\u001d\u00189}R\u0012";
      f5342[27] = "B;4{+OO2es@Ƣ~mgk$\u0011\u00187>s}";
      f5342[28] = "F9\r\u0012\u000e\u0019\u0019'\u000eZk\u0000\u001c-\bO\u0006|Ar\u0001@\u0001\u0007\u000b\"\bAk";
      f5342[29] = "^/Uq?5\u00011V9Z1\u0018\bX'54\u000e8?v# \u001b6Gre\"\u0001T";
      f5342[30] = "\\^`TJ\u0010\u0004Wg\u0015*\u000f\u0000ZE\u0006L\r\t&\"V\u001bZTLd\u0002Z\u001em";
   }
}
