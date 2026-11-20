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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.exceptions.ValidationException;
import org.rusherhack.core.event.listener.EventListener;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;

public class breed extends Command implements EventListener {
   public List<AnimalEntity> f8847;
   public double f8848;
   public static long f8849 = Class066.m4320(-4037516240710880573L, -1180845733707745899L, MethodHandles.lookup().lookupClass()).m4325(267465554185359L);
   public static String[] f8850;
   public static String[] f8851;
   public static long[] f8853;
   public static Integer[] f8854;
   public static Map f8855;
   public static Object[] f8856 = new Object[88];
   public static String[] f8857 = new String[88];

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   @CommandExecutor$Argument({"range"})
   public String m16973(Optional<Double> var1) {
      breed var13 = this;
      label50:
      if (Globals.mc.world != null) {
         ClientPlayerEntity var14 = Globals.mc.player;

         try {
            if (var14 == null) {
               break label50;
            }
         } catch (Class316 var10) {
            throw m116(var10);
         }

         if (Globals.mc.player.isCreative()) {
            return "Cannot breed in creative";
         }

         double var5 = var1.orElse(4.0);
         this.f8848 = var5;
         Iterator var12 = WorldUtils.getEntities().iterator();

         label43:
         while (true) {
            Iterator var15 = var12;

            while (var15.hasNext()) {
               Entity var7;
               if (!((var7 = (Entity)var12.next()) instanceof AnimalEntity)) {
                  continue label43;
               }

               AnimalEntity var8 = (AnimalEntity)var7;
               if (Globals.mc.player.distanceTo(var7) > var5) {
                  var15 = var12;
               } else if (!var13.m16975(var8)) {
                  var15 = var12;
               } else {
                  var13.f8847.add(var8);
                  var15 = var12;
               }
            }

            return "Breeding " + var13.f8847.size() + " animals";
         }
      }

      try {
         throw new IllegalStateException("You must be in-game to use this command.");
      } catch (Class316 var9) {
         throw m116(var9);
      }
   }

   public boolean m16974(AnimalEntity var1, ItemStack var2) {
      if (var1 instanceof AbstractHorseEntity && var2.getItem().equals(Items.GOLDEN_APPLE) && ((AbstractHorseEntity)var1).isTame()) {
         boolean var10002 = true;
         return true;
      } else {
         return var1.isBreedingItem(var2);
      }
   }

   public boolean m16975(AnimalEntity var1) {
        return false;
    }

   @Override
   public boolean isListening() {
      if (!this.f8847.isEmpty()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
        
    }

   public breed() {
      super("breed", "Breeds animals around you");
      this.f8847 = new CopyOnWriteArrayList<>();
      this.f8848 = 4.0;
      Class170.f3362.subscribe(this);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4513;
      if (f8854[var3] == null) {
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
         long var5 = f8853[var3];
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
         Object[] var9 = (Object[])f8855.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f8855.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ԁ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f8854[var3] = var15;
      }

      return f8854[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(breed.class, "m2809", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ԁ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m157() {
      f8856[0] = "%J\r>\u0003G;B\u0017qdF*Y\u001a+B@";
      f8856[1] = "\u001f\u0017\u001ak_e\u0014\u0018\u000b$>k\u001f\u0013\u000f~";
      f8856[2] = "\u000bA2\u0002f=\u000bA%^j2\u0011\n%@j'\u0016{q\u0018=";
      f8856[3] = "!.TadI!.C=hF;eC#hS<\u0014\u0011}?\u0018";
      f8856[4] = void.class;
      f8857[4] = "java/lang/Void";
      f8856[5] = "\tR\u0006`;\u000e\tR\u0011<7\u0001\u0013\u0019\u0011\"7\u0014\u0014hCx`V";
      f8856[6] = int.class;
      f8857[6] = "java/lang/Integer";
      f8856[7] = "+uo\u001c\u0003\u000f7om@\u0019\u001b'l&ȴ";
      f8856[8] = "8\u0012(n\u0015R$\b*2\u000fF4\u000ba#\bU2N*6\u0002I#N<4\u0006@2N\u001c4\u0006@2";
      f8856[9] = boolean.class;
      f8857[9] = "java/lang/Boolean";
      f8856[10] = "\u00198Q?G\f\u0005\"Sc]\u0018\u0015!\u0018ԑ";
      f8856[11] = "\\4J\u0004\u0013(\\4]X\u001f'F\u007f]F\u001f2A\u000e\u000f\u001eLx";
      f8856[12] = "Mg\u001f\\+\u001fSo\u0005\u0013I\u0003Tr";
      f8856[13] = "e 3:\n\u007fy:1f\u0010ki9zw\u0014co< :\u0019zc|1b\u001dd~!zd\u0014ks7&:=|o< D\u0014ks7&A\bnk&1";
      f8856[14] = "S 60j\u0007S !lf\bIk!rf\u001dN\u001at-1";
      f8856[15] = "2&\u001d5O\u00182&\niC\u0017(m\nwC\u0002/\u001cX-\u0017F";
      f8856[16] = "\u0011aK:Yx\u0011a\\fUw\u000b*\\xUb\f[\u000e&\r&";
      f8856[17] = "\u000f\\x\u0011\u0010r\u000f\\oM\u001c}\u0015\u0017oS\u001ch\u0012f=\rK\"";
      f8856[18] = "6\u0013\u0002'\tC6\u0013\u0015{\u0005L,X\u0015e\u0005Y+)E8T";
      f8856[19] = "\"\\_K{T\"\\H\u0017w[8\u0017H\twN?f\u001dV\"";
      f8856[20] = "*u%|\f\u0006*u2 \u0000\t0>2>\u0000\u001c7OcgXY";
      f8856[21] = "'\u0017\u0016$zb'\u0017\u0001xvm=\\\u0001fvx:-Q3!=";
      f8856[22] = "8\u001eD\u0018c\u00078\u001eSDo\b\"USZo\u001d%$\u0001\u00017W";
      f8856[23] = float.class;
      f8857[23] = "java/lang/Float";
      f8856[24] = "dA |5lx[\" /xhXi1+pn]3|&ib\u001d\u0000>({j_4";
      f8856[25] = double.class;
      f8857[25] = "java/lang/Double";
      f8856[26] = "{\fL\u0013/~g\u0016NO5jw\u0015\u0005ɉ";
      f8856[27] = "8+cP\nD8+t\f\u0006K\"`t\u0012\u0006^%\u0011&J^\u001b";
      f8856[28] = " '^bf\u0000 'I>j\u000f:lI j\u001a=\u001d\u001b{2[";
      f8856[29] = "/|\u0018\\-\u0002/|\u000f\u0000!\r57\u000f\u001e!\u00182F]JpY";
      f8856[30] = "bF(UFm~\\*\t\\yn_a\u0018[jh\u001a*\rQvy\u001a\n\rQvyv:\b";
      f8856[31] = "kM\u0014H\u0000\u0017wW\u0016\u0014\u001a\u0003gT]č";
      f8856[32] = ";m\u0005\u001df\u001c0b\u0014R\f\u001f$n\u001f\u0019";
      f8856[33] = "FJ1\u000fq>XB+@\u0010;XB(\u0000>'";
      f8856[34] = ":5cici&/a5y}6,*ѷ";
      f8856[35] = ":x\u0000\u00124n1w\u0011]Iv\"p\u0018\u0014";
      f8856[36] = "Pvr(\u001b\u0011Llpt\u0001\u0005\\o;e\u0006\u0016Z*th\u0000\t^p|i\u0007J~j|k\b\u0010Vk{";
      f8856[37] = "\u0000K\u001e\u000b3$\u0000K\tW?+\u001a\u0000\tI?>\u001dq\\\u0016f";
      f8856[38] = "m\u000b\u001ab\u000b\u0017q\u0011\u0018>\u0011\u0003a\u0012S/\u0015\u000bg\u0017\tb\u0018\u0012kW\b8\u0010\u000eqW*#\u000b\u000ef,\t%\u0015\u0011";
      f8856[39] = "VN}ytA\r\u001ak N_\u000b\u0018kv\u0019\u000eWI2\u001arJ[\u0019j#/\r\u0015\u0011";
      f8856[40] = "gg\n>R\"{q\u0012+/?e`\u001a\"B\rky\r+/3\u007f$\t4Oji|\u001dF";
      f8856[41] = "%D09L_ \\(lrѥ\u001a\u0016sg\f\u0019q[|v\u0019a$H2<\u000e\u0004bC&?r";
      f8856[42] = "(!]$|=d'\u0002|\f3t`bge3t\u001c\u0004x|5{|\u0005ki;\u0019";
      f8856[43] = "p%\u0019.\u0000\u001es6V==\u0019$)\t%Q+vnR}=B'+R>X\u0004,?QB";
      f8856[44] = "q\rOoSW$QQg7K,\tF|Z1:\u0000YaTZ{\u0001D\u0002\t_?W]gOT+T!";
      f8856[45] = "&|K|lC%o\u0004oQDrp[w=v$5\u0006,a!#7IskQxc_*Q";
      f8856[46] = "_\u0014\u0001UrGW_\u000eYNXX\u0019\u0007Q\"j\u000f^Y\bp=\u000b\u000b\u0019\r2XM\u0000\r\u000eN";
      f8856[47] = "}l3}QC0c\"h)M /3dE\u007fsoc:)F09#eHZt*9\u0003\u0017F3h/fQM'kS";
      f8856[48] = "-<'C\u007f\"x`9K\u001b?|/$.'?,1,\u0017zxb9I";
      f8856[49] = "pyX<I&`e\u0007c'(zm\\5p\u007f%0\u0007Y_8$~^<\u0017zfo";
      f8856[50] = "O.=4 UN=(:Bm(\u0000M`!E\u001b/-a2P\u0015";
      f8856[51] = "YyDLiV\u0014vUY\u0011X\u0004:DU}jWz\u0014\b\u0011\u0003\u00078\u001fNtE\f,\u001c2";
      f8856[52] = "<o<lJ% +/v,!?n6{@\u0013m#h$,z<lm`I<7xn\u001c";
      f8856[53] = "W\u0002'k*\u007f[\u0011}|J}I\u0015cj0g^\u0012\u0018z&~W\u001cs;'c4Dt>t<J\u0011!gs\u0006";
      f8856[54] = "\b{\u0003.j=\u00000\f\"V\"\u000fv\u0005*:\u0010X1[skG\\d\u001bv*\"\u001ao\u000fuV";
      f8856[55] = "\u0005/\u0000cW\u0003\u0019k\u0013y1\u0007\u0006.\nt]5TcR\"1\u0000\u00055\fn\u0001\u0005\u00114\u000f\u0013";
      f8856[56] = "Q(>#@\u0004P7>.p\u000fUW6+\u0010\u000fP7&7OP";
      f8856[57] = "b\u0017\u0011\u0004(\u0016g\u000f\tQ\u0016Ѳ]ERZhP6\b]K}(3\b\u0007JpI/L\u0014P\u0016\u00163\u000bVFsP8\u001fU:";
      f8856[58] = "Z)\u000b2\u0014\u0018_1\u0013g*Җe+\n5ST\u0005r\u001cmG";
      f8856[59] = "\"5:>TV>#\"+)Y.+=+nIG/=\u007fPU'v+'D'\"5:>TV>#\"+)";
      f8856[60] = "\u000fX3{tOJ\u0018?\u0019)INo2i5 \u000bG!\"5EML5!I";
      f8856[61] = "FV\u001cI/\u0003\u0003\u0016\u0010+t\u0001\f[pP~\u0014\u001fD\u001b\u0011\u007f\t|";
      f8856[62] = "heusn\u0013kv:`S\u0014<iex?&o,=#SKnuicc\u001an$|\u001fh\u001dn+?a=H7,\u0005";
      f8856[63] = "SC<;<g\u0006\u001f\"3Xh\u000fNR-4y\u0000A9l5dc\u001c<(c}\u0006Z7<`\u0001";
      f8856[64] = "WuE&\u0017l\u001azT3ob\n6E?\u0003PYs\u001dio9\t4\u001e$\n\u007f\u0002 \u001dX";
      f8856[65] = "uly\u001d}\u000251#M\u0004ԏHj=\u0010h\nq7z^`o";
      f8856[66] = "\u0001\u0004C;U&AY\u0019k,Ȓ<\u0002\u00076@.\u0005_@xHK";
      f8856[67] = "\u000ewQB5r\u000fdDLW\u007fJiHO,\u0012HxYH4y\tyD+i|M/]N/wY,!";
      f8856[68] = "ZCL^\u007fd_[T\u000bAɉe\u0011Q\u000e,>\u0003D\r\u0010$";
      f8856[69] = "h\u0004A-x\u007f`\rB8Ggt \u00193*\u0000u\u0001\u0005+$k4\u0000\u0018H<lv\u000e\u001e#}mkm";
      f8856[70] = "ddeh\u001eE`ay7/Zk&y1Ch8e#i/\u0001h$\"*JGc0!V";
      f8856[71] = "B\u001eM(eJH[O\u007fX[:DF(\"\u0012Y\u0013\u0018x&w]D\u0011b=\u0014\n\u001aAfX";
      f8856[72] = ":'gBq{\"wf\u0019\r\u007f>axNaMi, \u0014\rs3p{[qho%f)g{\"'u\u0011qy2c\u0018\u00132z?a(B2+*\u001drXkyogz\u0013duS";
      f8856[73] = "\u0006{,i\u0003\u0012\u0016gs6m\u001c\fo(`:KR<u\f\u0004H\u0012i0m\u001c\u0018\u00132";
      f8856[74] = "7.\u0006\"PO6.[t\"B#+ru^L26Rh\"\u001d/9RwDHs'Z\u0013";
      f8856[75] = "\u001e\u0006'bMJ\u001d\u0013lorM\u001f\u001e|a\u001e\u007fOX#6M(\u001f[%g\bK\u001d\u0001|?r\u0013\u001e]\"<\fFK\u0004%\u0006";
      f8856[76] = "Oo\u0003 x[\u0015\u007f]?CҸ+~Cz)\u0002RrP >";
      f8856[77] = "TXHF\u0006#WK\u0007U;/\fE\\Flz\\\u0014\u0004*W%VL\u0007HT0\u001dA";
      f8856[78] = "\u001a\u000b?\\\u0003_\u0002[>\u0007\u007f[\u001eM P\u0013iI\u0000y\b\u007fW\u0013\\#E\u0003LO\t>7\u0015_\u0002\u000b-\u000f\u0003]\u0012O@Z\u0007A\u001a\b0K\u0019S\u001f1z\b\u001fR\u000f\u0001+\bNGs[1Q\u001c\u0002\tSz^\u0010>";
      f8856[79] = "ru\u0000C\u0010\u0007qfOP-\u0000&y\u0010HA2v:K\u001e-\u000f*tJB\u0015\u0019(d\u000e/B\u000e\"jI\u0017S\u000b7op";
      f8856[80] = "\u0001\r(M?`WI1MTЛg\u0016,A.y\u0004Ar\u0011*\u001c\u0000\u0016{\u000b1\u007fWH+\u000fT";
      f8856[81] = "r(NV \u000b'tP^D\f>$ZR8\n8I\u001aJ(\u000f\u007f&_\n$m";
      f8856[82] = "*|\u0014VNf*h\u001d\u000e\u007fn(}\u000b\\(0u.T0\u001dn.v\u0012\u0000\u0018z/u";
      f8856[83] = "V' \u0015z'\rs6L@2\u0007`2\u0011,\u0000W iF@k\u0011->\u0013y6Vc6v.*\u0000l4\u00172n\u0013vR";
      f8856[84] = "&V\u0007|jIs\n\u0019t\u000eNmz\fir^\u0016\t\u0007o5SsO\f{6/";
      f8856[85] = "\t,A\r\u0014\u0010X,\u0010\u0018hNR~E\r?\u001d\u0003+\u0011aR\u001fS\u007f]Q\u0003\u001f\u0002j";
      f8856[86] = " sx8\u000e30o'g`=*g|17jt0$]Y#;f%?Z0tu";
      f8856[87] = "\u0017\f\u007f\u0012\u0013c\u0012\u0014gG-4(\u000f=\u0016MgA\u0001h^M]IP9L\u00174G\u0005qL-";
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
