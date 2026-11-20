package org.rusherhack;

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Iterator;
import java.util.Optional;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.effect.EnchantmentEffectEntry;
import net.minecraft.enchantment.effect.EnchantmentValueEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.context.LootContextParameterSet.Builder;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntry.Reference;
import net.minecraft.registry.tag.DamageTypeTags;
import org.rusherhack.client.api.Globals;

public class Util210 implements Globals {
   public static Registry<Enchantment> f3859;
   public static Object[] f3861 = new Object[140];
   public static String[] f3862 = new String[140];

   public static int m8035(RegistryEntry<Enchantment> var0, ItemStack var1) {
      return EnchantmentHelper.getLevel(var0, var1);
   }

   public static boolean m8036(LivingEntity var0) {
      if (m8039(Enchantments.AQUA_AFFINITY, var0) > 0) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public static int m8037(RegistryKey<Enchantment> var0, ItemStack var1) {
      return m8038(var0).map(var1x -> {
         return m8035(var1x, var1);
      }).orElse(0);
   }

   public static Optional<Reference<Enchantment>> m8038(RegistryKey<Enchantment> var0) {
      return m8049() == null ? Optional.empty() : m8049().getEntry(var0);
   }

   public static int m8039(RegistryKey<Enchantment> var0, LivingEntity var1) {
      return Globals.mc.world == null ? 0 : m8038(var0).map(var1x -> {
         return EnchantmentHelper.getEquipmentLevel(var1x, var1);
      }).orElse(0);
   }

   public static int m8040(RegistryEntry<Enchantment> var0, int var1, DamageSource var2) {
      if (var2.isIn(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
         return 0;
      } else if (var0.matchesKey(Enchantments.PROTECTION)) {
         return var1;
      } else if (var0.matchesKey(Enchantments.FIRE_PROTECTION) && var2.isIn(DamageTypeTags.IS_FIRE)) {
         return var1 * 2;
      } else if (var0.matchesKey(Enchantments.FEATHER_FALLING) && var2.isIn(DamageTypeTags.IS_FALL)) {
         return var1 * 3;
      } else if (var0.matchesKey(Enchantments.BLAST_PROTECTION) && var2.isIn(DamageTypeTags.IS_EXPLOSION)) {
         return var1 * 2;
      } else {
         return var0.matchesKey(Enchantments.PROJECTILE_PROTECTION) && var2.isIn(DamageTypeTags.IS_PROJECTILE) ? var1 * 2 : 0;
      }
   }

   public static boolean m8041(LivingEntity var0) {
      if (m8039(Enchantments.DEPTH_STRIDER, var0) > 0) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public static float m8042(ItemStack var0, LivingEntity var1, float var2) {
      int var5 = Class253.m9155();
      if (!var0.contains(DataComponentTypes.ENCHANTMENTS)) {
         return var2;
      } else {
         Iterator var8 = var0.getEnchantments().getEnchantmentEntries().iterator();

         while (var8.hasNext()) {
            Entry var7;
            Enchantment var11 = (Enchantment)((RegistryEntry)(var7 = (Entry)var8.next()).getKey()).value();
            int var13;
            LootContext var9 = m8048(var13 = var7.getIntValue(), var1, Globals.mc.world.getDamageSources().playerAttack(Globals.mc.player));
            Iterator var12 = var11.getEffect(EnchantmentEffectComponentTypes.DAMAGE).iterator();

            while (var12.hasNext()) {
               EnchantmentEffectEntry var10;
               if ((var10 = (EnchantmentEffectEntry)var12.next()).test(var9)) {
                  var2 = ((EnchantmentValueEffect)var10.effect()).apply(var13, Globals.mc.player.getRandom(), var2);
                  if (var5 == 0) {
                     return var2;
                  }
               }
            }
         }

         return var2;
      }
   }

   public static boolean m8043(ItemStack var0) {
      if (m8037(Enchantments.BINDING_CURSE, var0) > 0) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public static float m8044(LivingEntity var0, DamageSource var1) {
        return 0.0f;
    }

   public static float m8045(LivingEntity var0) {
      return m8039(Enchantments.SWIFT_SNEAK, var0) * 0.15F;
   }

   public static boolean m8046(ItemStack var0) {
      if (m8037(Enchantments.RIPTIDE, var0) > 0) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public static LootContext m8048(int var0, Entity var1, DamageSource var2) {
      LootContextParameterSet var6 = new Builder(null)
         .add(LootContextParameters.THIS_ENTITY, var1)
         .add(LootContextParameters.ENCHANTMENT_LEVEL, var0)
         .add(LootContextParameters.ORIGIN, var1.getPos())
         .add(LootContextParameters.DAMAGE_SOURCE, var2)
         .addOptional(LootContextParameters.ATTACKING_ENTITY, var2.getAttacker())
         .addOptional(LootContextParameters.DIRECT_ATTACKING_ENTITY, var2.getSource())
         .build(LootContextTypes.ENCHANTED_DAMAGE);
      return new LootContext(var6, Globals.mc.world.random, Globals.mc.world.getRegistryManager().createRegistryLookup());
   }

   public static Registry<Enchantment> m8049() {
      if (Globals.mc.world != null && f3859 == null) {
         f3859 = Globals.mc.world.getRegistryManager().get(Enchantments.EFFICIENCY.getRegistryRef());
      }

      return f3859;
   }

   static {
      m194();
   }
   public static void m194() {
      f3861[0] = "9sQkG2%iS7]&5j\u0018ǩ";
      f3861[1] = "f{\u000fEN\u0015f{\u0018\u0019B\u001a|0\u0018\u0007B\u000f{ANX\u0011M";
      f3861[2] = ">#\\W3P>#K\u000b?_$hK\u0015?J#\u0019\u0019Jn\u0000";
      f3861[3] = int.class;
      f3862[3] = "java/lang/Integer";
      f3861[4] = "\u0012l]\u0018t1\u000ev_Dn%\u001eu\u0014ɂ";
      f3861[5] = "XB\u0019kYpDX\u001b7CdT[PɃ";
      f3861[6] = "a!$R.\u0005a!3\u000e\"\n{j3\u0010\"\u001f|\u001baDz_";
      f3861[7] = "kwu\u001a\u000e\\u\u007foUoYu\u007fl\u0015AE";
      f3861[8] = "$\u0010g\u0016]\u0016/\u001fvY<\u0018$\u0014r\u0003";
      f3861[9] = "MY[%\u0015GQCYy\u000fSA@\u0012h\u000b[GEH%\u0006BK\u0005{g\bPCGO";
      f3861[10] = "\u0015I@X+J\u0015IW\u0004'E\u000f\u0002W\u001a'P\bs\u0007Gv";
      f3861[11] = "\u000e\fK\u001def\u0005\u0003ZR\u0002d\u0010\bZ\u00199";
      f3861[12] = "fT\u007fT\u000f)fTh\b\u0003&|\u001fh\u0016\u00033{n=IZ";
      f3861[13] = "E6\u000b\u000bCb[>\u0011D\u000bbA4\t\u0003\u0002y\u0001\u0011\b\u0004\u000ecF8\u0013";
      f3861[14] = "\u007f\u000e\u0002*\u0019@\u007f\u000e\u0015v\u0015OeE\u0015h\u0015Zb4G<M\u0019";
      f3861[15] = "\u001c&\u001f\u007f\u0018b\u001c&\b#\u0014m\u0006m\b=\u0014x\u0001\u001c]iM;";
      f3861[16] = "\b!]\u001fkW\b!JCgX\u0012jJ]gM\u0015\u001b\u0018\u0006?\u0007";
      f3861[17] = "FW0v1bX_*9VcID'cpe";
      f3861[18] = "j\u000e\u0011\u001dR\u0016j\u000e\u0006A^\u0019pE\u0006_^\fw4]\u0002\u000fF";
      f3861[19] = "HP\u0012\u0012SnHP\u0005N_aR\u001b\u0005P_tUjW\n\u000b0";
      f3861[20] = "Qm&<\u0002{Qm1`\u000etK&1~\u000eaLWc W ";
      f3861[21] = "g\u001dY\f\u001e:g\u001dNP\u00125}VNN\u0012 z'\u0014\u0011Cg";
      f3861[22] = "/\u0010\rnCO1\u0018\u0017!>_1";
      f3861[23] = "{3\u0000jI;{3\u00176E4ax\u0017(E!f\tMr\u001dj";
      f3861[24] = "\u0006\r\u0014\u000er\\\u0006\r\u0003R~S\u001cF\u0003L~F\u001b7Q\u0012&\u0002";
      f3861[25] = "\u0018\u0014\u001a\u0000u\u001d\u0018\u0014\r\\y\u0012\u0002_\rBy\u0007\u0005.Z\u0019";
      f3861[26] = "#3\bNQo#3\u001f\u0012]`9x\u001f\f]u>\tES\u000f7";
      f3861[27] = boolean.class;
      f3862[27] = "java/lang/Boolean";
      f3861[28] = "CR\t\u0019WeGO\t\bJe\u0004@F\u001fMy^OKBVn@CD\u0018J\"eDM\tZx\u0018oI\u0018tmZ\u0002b\u0002M~S";
      f3861[29] = "\f>\u0019[#\u0004\f>\u000e\u0007/\u000b\u0016u\u000e\u0019/\u001e\u0011\u0004ZAx";
      f3861[30] = "\u0007\u0005+\u0002\u001b\u0007\u0007\u0005<^\u0017\b\u001dN<@\u0017\u001d\u001a?j\u0014GW";
      f3861[31] = "{|q\u0017l\u000e{|fK`\u0001a7fU`\u0014fF4\u00019P";
      f3861[32] = "Y}*\u0002-mGu0MOq@h";
      f3861[33] = "l,&`R\\l,1<^Svg1\"^Fq\u0016k}\f\u0001";
      f3861[34] = "H\fM@6|H\fZ\u001c:sRGZ\u0002:fU6\u0000Yk$";
      f3861[35] = "Pq\u001e\b-OPq\tT!@J:\tJ!UMKS\u0011r\u0015";
      f3861[36] = float.class;
      f3862[36] = "java/lang/Float";
      f3861[37] = "Zi\u00114\u001a>Zi\u0006h\u00161@\"\u0006v\u0016$GSP.Bb";
      f3861[38] = "7M\u0003P\u000fR7M\u0014\f\u0003]-\u0006\u0014\u0012\u0003H*wOKT\f}K\u001b\u001f\u0011H\u0006\u0010BHZ";
      f3861[39] = "s\u00074\\\tes\u0007#\u0000\u0005jiL#\u001e\u0005\u007fn=qD]";
      f3861[40] = "\u000eV- <y\u000eV:|0v\u0014\u001d:b0c\u0013lh9b";
      f3861[41] = "!^Ig\u0001n!^^;\ra;\u0015^%\rt<d\f~Z";
      f3861[42] = "u+\bq\u0014'u+\u001f-\u0018(o`\u001f3\u0018=h\u0011DjOy";
      f3861[43] = "\",\u0010O\u0010p\",\u0007\u0013\u001c\u007f8g\u0007\r\u001cj?\u0016UYL";
      f3861[44] = "cF2Q&}cF%\r*ry\r%\u0013*g~|qG|%)@*\u001e8gR\u0014~Hy";
      f3861[45] = "\u0015D\u0013\u000f\u0005\u001c\u0015D\u0004S\t\u0013\u000f\u000f\u0004M\t\u0006\b~U\u0015[";
      f3861[46] = "yHHH\u00126yH_\u0014\u001e9c\u0003_\n\u001e,dr\u000eUHg";
      f3861[47] = "\t<A\u0013sB\t<VO\u007fM\u0013wVQ\u007fX\u0014\u0006\u0004\n-\u0013C:Y\\mX8a\u0005\b/";
      f3861[48] = "{,\u0001\n@jp#\u0010E'rt?\u0016\t\u0002c";
      f3861[49] = "!\u000esXFX!\u000ed\u0004JW;Ed\u001aJB<46A\u0012\u0003";
      f3861[50] = "F%d\\DZF%s\u0000HU\\ns\u001eH@[\u001f!E\u001a\u000b";
      f3861[51] = "-,$gd\u0004-,3;h\u000b7g3%h\u001e0\u0016fq?_";
      f3861[52] = "[I;\u001e|d[I,BpkA\u0002,\\p~Fsw\u0001!>";
      f3861[53] = "NgxSAcG7%0Ō\u0019\u00196nM\u0001\u007fJ{qOqs\u00118,J\u0013~_az0KsZexV\u0011(_l\u0015";
      f3861[54] = "!\u0005BMZ\r(U\u001f.\nwvTTS\u001a\u0011%\u0019KQjN/\\O\u001e\u0007\u0018p\u0001\u0010.P\u001d5\u0007BH\nF0\u000e/";
      f3861[55] = "C4ZI6/H7\u001f\u0016U2E9BO9\u0000\u0014u\u0012\u0010oWDuFEknY!K\u0013U:\u0012|H\u00159>S{\u001d(";
      f3861[56] = "/ \u000bA\u0002-\"nR\u0017x*(mT\u001f\u0014\u0018x!\nEGO(i\u000b\u0013@\">mZ\u001fx";
      f3861[57] = "Fy<v\u001dQGx=dm\\Tr6g\u0011ZR\u001f'a\u000e\u0004Mf+`\u0017W(";
      f3861[58] = "7:\u000e[k\u000b>jS8Σq0*\bJ%\u0012\"6\u0011\u0005[K3 \u0001U=\u0011h%\b86K`0^T2\ngec\u00021\u000b;7\u0005Xj\u000e2Z";
      f3861[59] = "1#Q\\\u0004\u000ef*\u000bYu^9~\u0014kO\u000bn#l\u0001\u0007\b=*\u0013R\rV2\u001b";
      f3861[60] = "jZp];(1\u0004/\u0007zA=\u0003-\u0005k\u0016oXz]=A!\u00011\u0019y&8\t.\u0013";
      f3861[61] = "l^w\u000et?7\u0000(T5V;\u0007*V$\u0001i\\}\u000evV'\u00056J61>\r)@";
      f3861[62] = "l\u001f\u0007u7ieOZ\u0016Й\u0013;N\u0011kwuh\u0003\u000ei\u0007.8\u001a\u0014nznr\u000fU\u0016";
      f3861[63] = "|4Ur\u007f\u0016n(L=\u0001\u001er!FW:I.D\u0003r<\u0016$;Pxb\u0019\u0015";
      f3861[64] = "U2nY?]\u0005<\"Q_W\b>x\f\b\bPi,`f\b\u0012.l\u00065E\r,";
      f3861[65] = "9M\u001eYu\u0002|\u001a\u0017]\u0007\u001f-\f\u0010\u0000k-|NOZ7z=\u0010\u0000\u000b}\u0007'\u000e\u0012\f\u0007";
      f3861[66] = "\u0013U5H\u0016\u0012\u0005QdD.\u001a\u0013QjDB(C\u00127\u0018\u001f\u007f\u0010Kz[^\u0013\u0011J{I.";
      f3861[67] = "fj6\\g'oh8HV9:f(D:\u000bg p\u0018V5'q:]5';hu#o<nzxN9c3%H\u0019<&5w.Cg#<\u001a";
      f3861[68] = "8\u0019ux'FmH3,M\u0018fN.\u007f\u001aO9\u0013u\u0013}\u0014f\u00184,|Hb]";
      f3861[69] = "\u0018D\u000f9x,\u0017\u0016\u000b;\nw\u0016[\u00117fEF\u0016@j0\u0012\u001f\u0017O mjFZ\u0011(\n";
      f3861[70] = "+V\u001bmoF*QLd\u001fF6FBhH\u0015n\u001b\u001e9\u001fR<QD;rQlOV";
      f3861[71] = " KA\u001d[hpE\r\u0015;b}GWHl=%\u0011\n$\u0002=gWCBQpxU";
      f3861[72] = "\u0007}%%\tSWsi-iYZq3p>\f\u000b&m'i\u000e\ng*l\u000f]Gx(";
      f3861[73] = "\b,pG\\\rHfe\u0006$\u0015\\n\u0015\bDO\bk|\bENH\u0016(\u0003A\u000eMkhITO5";
      f3861[74] = " D\u0007UWx$\u0010\nZ/\"y]8_K>r!\\\\U!rG\u0006\u0007P(\u001f";
      f3861[75] = "v\u0014\u0018\u000eaE!\u001dB\u000b\u0010\u001btPE\t|)'\u0014\u001dV.~y\\YR~FiUCT\u0010\u001c \u0011Y\u0017-\u0003b\u0013]n";
      f3861[76] = "'6\u001d\u001a_\u001f&j\u0019_!Ez(\u001cFMw+dM\u001f\u001a |%\u0004@BXw&A\u001f!";
      f3861[77] = "\r\u0012$\u007f\u0019\b\fN :gY\\\u001d!(0\u0006\u0007JtD\u0003\u0007\u0003\u0000\"<ZJ]\b";
      f3861[78] = "\">U2\u001f\u001b82Jp|K.5^c\u0000M(XOe\u001f\u00137!Cd\u0006@R";
      f3861[79] = "I@V\u0012Z\u0007\u0011VV\u001a=\u0000@EH\u0016Q2\u0013\u0001\u0010J\u0001eL[C\bQ\u0007\\\u0007G\u0000=\u0000BWZ\tA\u0000H[Yq";
      f3861[80] = "\u001dBq(\u001f'\u0000Yl1x|\tDs?\u0014NY\u0001#gE\u0019\u001fW,:\u0014r\u0006Qu?xe\u001eA}<\u001c\"\nHkX";
      f3861[81] = "\u0010:c\u000bQM\u001dt:]+J\u0017w<UGxE:d\u0003+^\u0014j3\u000fU\u0012\u000by#2";
      f3861[82] = "(#qwL>\",q~\"l/.ttu>\u007f}+#\"c,(it@sp,a";
      f3861[83] = ",\u0000W\u0015\u00177(AP@*>,F\u000e\u0018F\f|\u0007TN*;|ZQ@M6\"\u0002\b\u007f";
      f3861[84] = "$DgJ\u0004\\$R|YhAq 8\u001aWOp\u0010mK\u0011\u001b";
      f3861[85] = "6`YNch7g\u000eG\u0013h+p\u0000KD?p'Z'im0\u007f[Jj=.m";
      f3861[86] = "4T\"N\u0001&t\u001e7\u000fy6l\u0016;Ayf3\u000b9H\u0004&y\u001ex0";
      f3861[87] = "]kjR?&\u0001tdQ\u00034ZwpDTg\u0002$)\u0019\u0003;YqmDa+\u0005ue";
      f3861[88] = "\u0003h2[zw\u000fi+\b\u001fn\u0001|\u0017\u000forheh_cwUz*]g\u000e";
      f3861[89] = "P Q#.w\u0000.\u001d+N}\r,Gv\u0019\"Ux\u0018\u001aw\"\u0017<S|$o\b>";
      f3861[90] = "|\u0003\u0014]\bKq]L\u00047IqB\u0014\u0005[{%\u000fIY\u0007,bDI\u001d\fClEL\u001e7";
      f3861[91] = "zY%'b\u001d{^r.\u0012\u001dgI|\"EJ<\u001f!Nh\u0018|F'#kHbT";
      f3861[92] = "Bm\u001e.\\\u000bK=CM)qR}\u00170\u0000@\u00113\t\"";
      f3861[93] = "0E&,\u0000u\"\u000fw ~`,K{+\u0012R}\u0007 }N\u00051\u0007%'\u0011~'\u0006d+~";
      f3861[94] = "y2d@\u00100u3}\u0013u/\u007f-{yH;/>6\u0006\u001b1q1\u0007";
      f3861[95] = ":SA\u001dnzz\u0019T\\\u0016hj\u0015$^d:dX[\rndki";
      f3861[96] = "neJ{o\tj$M.R\u0000n#\u0013v>2?oL!ceq<\u0002i,\u0002h4\u001dcR\u0007:b\u000fho\u0018x`\u000b\u0011";
      f3861[97] = " \u0012,]yd)Bq> \u001euN/\u0000ts3\u001c!\u0007I%r\u001c\u007f\u0003$c \u0012x>";
      f3861[98] = "qT\u000enO|p\b\n+1&,J\u000f2]\u0014z\u000eTi\u0000C8\u000b\u0001kC;}\\\bo1";
      f3861[99] = "O;=4F&\u001f5q<&,\u00127+aqsJbs\r\u001fs\b'?kL>\u0017%";
      f3861[100] = "V%|n\u0005\u0012K>awbIB#~y\u000e{\u0012f.!],U4d|]AVdznb\u0011]b}/\u001dBW<r\u001e\u001bVM/y \u0006MP6\u001e";
      f3861[101] = "?UeURf3Yl\u0007 ո\u0003Rc\u0011Bue\b8\u0014K\u0018";
      f3861[102] = "\u0010kyvH\u0001\u0006j8z'\u0017\u0019&.y\\z])z~\u0016\u0005\u000e#$q'\u0018Yf;d\u001a\u0007\u001bd?\u001d";
      f3861[103] = "kf\u0011l\u0001r;h]dax6j\u000796'n>ZUX',z\u00133\u000bj3x";
      f3861[104] = "O.\u0002'aOC\"\u000bu\u0013ɨs)\u0004cq\\\u0015s_fx1";
      f3861[105] = "\u0018:^\u0014QuCd\u0001N\u0010\u001cOc\u0003L\u0001K\u001d8T\u0014\\\u001cSa\u001fP\u0013{Ji\u0000Z";
      f3861[106] = "#\n\u0016\n/ah\n\u0018\u000fLs9W\u0012\u0006\u001b a\nNSLf7\u0005\u0014\u0006'\u007f1\\\u0011";
      f3861[107] = "u9K\u001fz+|i\u0016|ӯQe)B\u0001&`&g\\\u0013J";
      f3861[108] = "*oA\u0012CV#?\u001cqж,~eV\u0013\u001eJ$>S\u001asLyo\u0013N\u0014A'7Jq\u001e\u0016}e\u0011\u001d\u001aWz0,\u0011\u0003Pxa\u0014\u0001\nJ~\u000f";
      f3861[109] = "Cw\u007f\u0002T?N9&T.8D: \\B\n\u0014yp\u0001\u0010]H$+BB?Xx/J.?\u0010{<B\u0013 Ry8;";
      f3861[110] = "\u0001-\u0004\u0007V*Ag\u0011F.0FZ\u0005\u0002CW\u0001e\\\u001a\u001f(Ro\u0002\u0015.jN*\u0002HQ9Dt\ry";
      f3861[111] = "^z\u0015\u000ep\u0001\b%HQ@\t\nfL\t,;Z$\u0012W@\u001c\u0001k\u0014\rq\u0006\rtVn";
      f3861[112] = ",\t0\u001dOz|\u0007|\u0015/pq\u0005&Hx/(Y\u007f$\u0016/k\u00152BEbt\u0017";
      f3861[113] = "?\u0017C\u000ex9dI\u001cT9PhN\u001eV(\u0007:\u0015I\u000e{PtL\u0002J:7mD\u001d@";
      f3861[114] = "pK-\\/w EaTO}-G;\t\u0018\"u\u0010nev\"7W/\u0003%o(U";
      f3861[115] = "\tO\u0016\n\u000f\u0019\u0012\u001eJUk\u001f\u0006]i\u000f\u0017.\u0002EU\u0004kJ\u0001[J\u0004\r\u0010Z^Ci";
      f3861[116] = "K7kihRV,vp\u000f\t_1i~c;\u000ft9&3lH&s{0\u0001Kvmi\u000fQ@pj(p\u0002J.e\u0019v\u0016P=n'k\rM$\t";
      f3861[117] = "\"\u001c]8pL0\u0000Dw\u000eJ&\u0010V-bxwT\fp3/r]M7~I!\u0010R5\u000eMrQJ33R0SNJ";
      f3861[118] = "\u0017I`4v)W\u0003uu\u000e5Q+\u007f'u9L\u000f\u0005(7iV\n87ukRs";
      f3861[119] = "i$Vf[Ump[i#\u0010?%Jhd\u0000V{]\u007fA\u00030!\u0006zHni$Vf[Ump[i#";
      f3861[120] = "\u007fNML$XvLCX\u0015F#BSTytp\u0006\n\u000f/#$\u000f\f\noA)AU\\\u0015B,UJ_wRpQB3w\u001asBJ\u000ehXqF3";
      f3861[121] = "p$w7%= *;?E7-(ab\u0012hu}:\u000e|h78uh/%(:";
      f3861[122] = "\u001aGT'\t;\u0013\u0017\tDΩA\u001dWR6G\"\u000fKKy9+E\u0018\u0000>[&\u000bAVD\u0003+\u000eET\"Yp\u000bL9";
      f3861[123] = "5f\u0015&\u001cb1'\u0012s!k5 L+MYea\u0016r!ne<\u0013sFc;dJL";
      f3861[124] = "\u00030Y7\u000b1S>\u0015?k;^<Ob<d\u0006i\u0016\u000eRdD,[h\u0001)[.";
      f3861[125] = "Ry\u000f*\u0019+S~X#i+OiV/>\u007f\u00128\b\u007fi?E~P|\u0004<\u0015`B";
      f3861[126] = "R>E]I\u007f\u0017iLY;bF\u007fK\u0004WP\u0010;\u0016X\u0003\u0007\u00122P\u001eKaA\u007fO\u001c;y[gV\u000f\n:\u0015yDc";
      f3861[127] = "q!Lp:\u0003q+@sB\u001eh#Xk>\u0018nNIm!Fq7El8\u0015\u0014";
      f3861[128] = ">\u00073\n=hb\u0018=\t\u0001z9\u001b)\u001cV)aHsI\u0001u:\u001d4\u001ccef\u0019<";
      f3861[129] = "\u007f\u0004aIj/,I~K\u001a,+IzSv\u001e{\u0005 \u000b!I\u007f\u0004aIj/,I~K\u001a";
      f3861[130] = "gr44\u0018$fuc=h$zbm1?s!56]\u0012!am60\u0011q\u007f\u007f";
      f3861[131] = "G\r3\u0012\u001fU\u0017\u0003\u007f\u001a\u007f_\u001a\u0001%G(\u0000C]\u007f+F\u0000\u0000\u00111M\u0015M\u001f\u0013";
      f3861[132] = "\u0016\\\u0001Cdn\u001f^\u000fWUpJP\u001f[9B\u0017\u0016E\u0001U|WG\rB6nK^B<?$\u0018\u0015\u0005^2jAC\u007f\u0006?oEA\u0019\\djL,";
      f3861[133] = "\u001d\u0002%j\\8\u001c\u0005rc,8\u0000\u0012|o{o[D \u0003V=\u001b\u001d'nUm\u0005\u000f";
      f3861[134] = "{i\f\rJ\u0012mhM\u0001%\u0007j4V\nrU2h\tX%\u0019;gY\t^\u000f:&U";
      f3861[135] = "\u0018)\u007fcHd\u0003x#<,b\u0017;\u0002m]\rG5|c\u001dr\u0014?\"l,";
      f3861[136] = "FT\u0013IG-\u0013\u0005U\u001d-s\u0018\u0003HNz$FT\u0010\"N~\u0007\u0007^\u001cA,\u0003\u0005";
      f3861[137] = "z\u001d\u0018hTJ~NHxi@p\u0003Ea\u0005r#G\u001f?R%'\u0015_d\u0004C}NZmiA-AUa\u0011\u0018`\u001f]\u0006\u0011@%O\u001eo\u0017\u001dr\u0010%~\f\u001d-DLxQJr\u007f";
      f3861[138] = "\r&j7_MNht%3\u0019\u001e*n-_+On4t\u000f|Jgu7C\u001a\u0019*j53AI3p2N\u0001\u0003&1J";
      f3861[139] = "Zwj;\u000f*\u0001)5aNC\r.7c_\u0014_u`:\u000bC\u0011,+\u007fM$\b$4u";
   }
}
