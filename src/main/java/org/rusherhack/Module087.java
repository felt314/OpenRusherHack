package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.passive.AllayEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.system.Entities;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.Speed;
public class Module087 extends Module implements Entities {
   public BooleanSetting boats;
   public BooleanSetting blazes;
   public BooleanSetting illagers;
   public BooleanSetting f2167;
   public BooleanSetting axolotls;
   public BooleanSetting passives;
   public BooleanSetting silverfish;
   public BooleanSetting villagers;
   public BooleanSetting bees;
   public BooleanSetting shulkers;
   public BooleanSetting endermite;
   public NullSetting fakeplayers;
   public BooleanSetting pandas;
   public BooleanSetting f2177;
   public BooleanSetting parrots;
   public BooleanSetting damage;
   public BooleanSetting turtles;
   public BooleanSetting withers;
   public BooleanSetting witherskeletons;
   public BooleanSetting ghasts;
   public BooleanSetting squids;
   public BooleanSetting zombiepigmen;
   public NumberSetting<Float> radius;
   public BooleanSetting camels;
   public BooleanSetting polarbears;
   public BooleanSetting mules;
   public static Module087 f2190;
   public BooleanSetting strays;
   public BooleanSetting minecarts;
   public BooleanSetting f2193;
   public EnumSetting<Enum087> movement;
   public BooleanSetting horses;
   public BooleanSetting zombies;
   public BooleanSetting irongolems;
   public BooleanSetting guardians;
   public BooleanSetting creepers;
   public BooleanSetting enderdragon;
   public BooleanSetting f2201;
   public BooleanSetting hostiles;
   public BooleanSetting foxes;
   public BooleanSetting wolves;
   public BooleanSetting vexes;
   public BooleanSetting sheep;
   public BooleanSetting pigs;
   public BooleanSetting witches;
   public BooleanSetting rabbits;
   public BooleanSetting neutrals;
   public BooleanSetting projectiles;
   public BooleanSetting vehicles;
   public BooleanSetting cows;
   public BooleanSetting chickens;
   public BooleanSetting donkeys;
   public BooleanSetting f2216;
   public BooleanSetting allays;
   public NullSetting angryneutrals;
   public BooleanSetting spiders;
   public BooleanSetting slimes;
   public BooleanSetting bosses;
   public BooleanSetting oceanic;
   public BooleanSetting llamas;
   public BooleanSetting endermen;
   public BooleanSetting ocelots;
   public BooleanSetting shulkerbullet;
   public NumberSetting<Float> speed;
   public BooleanSetting fireballs;
   public BooleanSetting bats;
   public static long f2230 = Class066.m4320(6298202144982270764L, -8586766088264315920L, MethodHandles.lookup().lookupClass()).m4325(238816711566931L);
   public static String[] f2231;
   public static String[] f2232;
   public static Object[] f2234 = new Object[60];
   public static String[] f2235 = new String[60];

   @Override
   public boolean isHostileMob(Entity var1) {
      if (var1 instanceof MobEntity && ((MobEntity)var1).isAttacking()) {
         boolean var5 = true;
         return true;
      } else if (var1 instanceof SpiderEntity) {
         if (((SpiderEntity)var1).getBrightnessAtEyes() < 0.5F) {
            boolean var4 = true;
            return true;
         } else {
            return false;
         }
      } else if (var1 instanceof PiglinEntity) {
         if (!PiglinBrain.wearsGoldArmor(Globals.mc.player)) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      } else {
         return var1 instanceof Angerable ? ((Angerable)var1).hasAngerTime() : var1 instanceof Monster;
      }
   }

   public Module087() {
      super("Entities", "Control entity preferences", ModuleCategory.CLIENT);
      boolean var10057 = true;
      this.passives = new BooleanSetting("Passives", true);
      boolean var10056 = true;
      this.allays = new BooleanSetting("Allays", true);
      boolean var10055 = true;
      this.axolotls = new BooleanSetting("Axolotls", true);
      boolean var10054 = true;
      this.bats = new BooleanSetting("Bats", true);
      boolean var10053 = true;
      this.camels = new BooleanSetting("Camels", true);
      boolean var10052 = true;
      this.chickens = new BooleanSetting("Chickens", true);
      boolean var10051 = true;
      this.cows = new BooleanSetting("Cows", true);
      boolean var10050 = true;
      this.foxes = new BooleanSetting("Foxes", true);
      boolean var10049 = true;
      this.ocelots = new BooleanSetting("Ocelots", true);
      boolean var10048 = true;
      this.pandas = new BooleanSetting("Pandas", true);
      boolean var10047 = true;
      this.pigs = new BooleanSetting("Pigs", true);
      boolean var10046 = true;
      this.rabbits = new BooleanSetting("Rabbits", true);
      boolean var10045 = true;
      this.sheep = new BooleanSetting("Sheep", true);
      boolean var10044 = true;
      this.turtles = new BooleanSetting("Turtles", true);
      boolean var10043 = true;
      this.villagers = new BooleanSetting("Villagers", true);
      boolean var10042 = true;
      this.horses = new BooleanSetting("Horses", true);
      boolean var10041 = true;
      this.donkeys = new BooleanSetting("Donkeys", true);
      boolean var10040 = true;
      this.mules = new BooleanSetting("Mules", true);
      boolean var10039 = true;
      this.llamas = new BooleanSetting("Llamas", true);
      boolean var10038 = true;
      this.parrots = new BooleanSetting("Parrots", true);
      boolean var10037 = true;
      this.oceanic = new BooleanSetting("Oceanic", true);
      boolean var10036 = true;
      this.squids = new BooleanSetting("Squids", true);
      boolean var10035 = true;
      this.neutrals = new BooleanSetting("Neutrals", true);
      boolean var10034 = true;
      this.bees = new BooleanSetting("Bees", true);
      boolean var10033 = true;
      this.wolves = new BooleanSetting("Wolves", true);
      boolean var10032 = true;
      this.irongolems = new BooleanSetting("IronGolems", true);
      boolean var10031 = true;
      this.endermen = new BooleanSetting("Endermen", true);
      boolean var10030 = true;
      this.zombiepigmen = new BooleanSetting("ZombiePigmen", true);
      boolean var10029 = true;
      this.polarbears = new BooleanSetting("PolarBears", true);
      boolean var10028 = true;
      this.hostiles = new BooleanSetting("Hostiles", true);
      boolean var10027 = true;
      this.zombies = new BooleanSetting("Zombies", true);
      boolean var10026 = true;
      this.creepers = new BooleanSetting("Creepers", true);
      boolean var10025 = true;
      this.f2201 = new BooleanSetting("Creepers", true);
      boolean var10024 = true;
      this.spiders = new BooleanSetting("Spiders", true);
      boolean var10023 = true;
      this.witherskeletons = new BooleanSetting("WitherSkeletons", true);
      boolean var10022 = true;
      this.blazes = new BooleanSetting("Blazes", true);
      boolean var10021 = true;
      this.illagers = new BooleanSetting("Illagers", true);
      boolean var10020 = true;
      this.vexes = new BooleanSetting("Vexes", true);
      boolean var10019 = true;
      this.witches = new BooleanSetting("Witches", true);
      boolean var10018 = true;
      this.slimes = new BooleanSetting("Slimes", true);
      boolean var10017 = true;
      this.silverfish = new BooleanSetting("Silverfish", true);
      boolean var10016 = true;
      this.guardians = new BooleanSetting("Guardians", true);
      boolean var10015 = true;
      this.endermite = new BooleanSetting("Endermite", true);
      boolean var10014 = true;
      this.ghasts = new BooleanSetting("Ghasts", true);
      boolean var10013 = true;
      this.shulkers = new BooleanSetting("Shulkers", true);
      boolean var10012 = true;
      this.strays = new BooleanSetting("Strays", true);
      this.angryneutrals = new NullSetting("AngryNeutrals");
      boolean var10010 = true;
      this.f2216 = new BooleanSetting("Wolves", true);
      boolean var10009 = true;
      this.f2167 = new BooleanSetting("ZombiePigmen", true);
      boolean var10008 = true;
      this.f2177 = new BooleanSetting("Endermen", true);
      boolean var10007 = true;
      this.f2193 = new BooleanSetting("IronGolems", true);
      boolean var10006 = true;
      this.bosses = new BooleanSetting("Bosses", true);
      var10016 = true;
      this.enderdragon = new BooleanSetting("EnderDragon", true);
      var10016 = true;
      this.withers = new BooleanSetting("Withers", true);
      var10015 = true;
      this.projectiles = new BooleanSetting("Projectiles", true);
      var10014 = true;
      this.shulkerbullet = new BooleanSetting("ShulkerBullet", true);
      var10013 = true;
      this.fireballs = new BooleanSetting("Fireballs", true);
      var10012 = true;
      this.vehicles = new BooleanSetting("Vehicles", true);
      boolean var10011 = true;
      this.boats = new BooleanSetting("Boats", true);
      var10010 = true;
      this.minecarts = new BooleanSetting("Minecarts", true);
      this.fakeplayers = new NullSetting("FakePlayers");
      var10008 = true;
      this.damage = new BooleanSetting("Damage", true);
      this.movement = new EnumSetting<>("Movement", Enum087.f8182);
      this.radius = new NumberSetting<>("Radius", 5.0F, 0.1F, 10.0F).setVisibility(() -> {
         if (this.movement.getValue() == Enum087.f8180) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.speed = new NumberSetting<>("Speed", 1.0F, 0.1F, 5.0F).setVisibility(() -> {
         if (this.movement.getValue() != Enum087.f8182) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      f2190 = this;
      NullSetting var10000 = this.fakeplayers;
      Setting[] var10001 = new Setting[]{this.damage, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.movement;
      var10001[2] = this.radius;
      var10001[3] = this.speed;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.registerSettings(this.fakeplayers);
   }

   @Override
   public boolean isProjectileEntity(Entity var1) {
      return var1 instanceof ProjectileEntity;
   }

   @Override
   public boolean isPassiveMob(Entity var1) {
      long var2 = f2230 ^ 8430083860492L;
      if (((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ó", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), this,  var1,  -3899225843878746869L,  var2))).booleanValue()) {
         return false;
      } else if (!(var1 instanceof AnimalEntity)
         && !(var1 instanceof WaterCreatureEntity)
         && !(var1 instanceof MerchantEntity)
         && !(var1 instanceof AllayEntity)
         && !(var1 instanceof BatEntity)) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   @Override
   public boolean isVehicleEntity(Entity var1) {
      if (!(var1 instanceof AbstractMinecartEntity) && !(var1 instanceof BoatEntity)) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   @Override
   public boolean isNeutralMob(Entity var1) {
      long var2 = f2230 ^ 63240058031087L;
      if (((java.lang.Boolean)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "ó", java.lang.invoke.MethodType.methodType(boolean.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), this,  var1,  7638127988869105384L,  var2))).booleanValue()) {
         return false;
      } else if (!(var1 instanceof Angerable) && !(var1 instanceof SpiderEntity) && !(var1 instanceof PiglinEntity)) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   static {
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
   public static int m704(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f2235[var4] != null) {
         return var4;
      } else {
         Object var5 = f2234[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 43;
               case 1 -> 14;
               case 2 -> 32;
               case 3 -> 49;
               case 4 -> 56;
               case 5 -> 2;
               case 6 -> 4;
               case 7 -> 44;
               case 8 -> 10;
               case 9 -> 27;
               case 10 -> 18;
               case 11 -> 34;
               case 12 -> 39;
               case 13 -> 11;
               case 14 -> 28;
               case 15 -> 8;
               case 16 -> 22;
               case 17 -> 40;
               case 18 -> 33;
               case 19 -> 38;
               case 20 -> 41;
               case 21 -> 21;
               case 22 -> 9;
               case 23 -> 6;
               case 24 -> 25;
               case 25 -> 63;
               case 26 -> 51;
               case 27 -> 57;
               case 28 -> 60;
               case 29 -> 48;
               case 30 -> 7;
               case 31 -> 42;
               case 32 -> 37;
               case 33 -> 26;
               case 34 -> 53;
               case 35 -> 20;
               case 36 -> 46;
               case 37 -> 61;
               case 38 -> 29;
               case 39 -> 47;
               case 40 -> 5;
               case 41 -> 58;
               case 42 -> 3;
               case 43 -> 55;
               case 44 -> 16;
               case 45 -> 52;
               case 46 -> 31;
               case 47 -> 24;
               case 48 -> 15;
               case 49 -> 35;
               case 50 -> 36;
               case 51 -> 54;
               case 52 -> 12;
               case 53 -> 17;
               case 54 -> 45;
               case 55 -> 13;
               case 56 -> 19;
               case 57 -> 59;
               case 58 -> 0;
               case 59 -> 1;
               case 60 -> 62;
               case 61 -> 30;
               case 62 -> 50;
               default -> 23;
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

            f2235[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m157() {
      f2234[0] = "\u0010\u0018R!g\u007f\u0010\u0018E}kp\nSEcke\r\"\u0017<:.";
      f2234[1] = boolean.class;
      f2235[1] = "java/lang/Boolean";
      f2234[2] = "U\u0016{]?QI\fy\u0001%EY\u000f2ɵ";
      f2234[3] = int.class;
      f2235[3] = "java/lang/Integer";
      f2234[4] = "\u001a4Y\u0007\u000e\u0001\u001a4N[\u0002\u000e\u0000\u007fNE\u0002\u001b\u0007\u000e\u0018\u001aV\\";
      f2234[5] = "Zx\u0013\u0001>sFb\u0011]$gVaZú";
      f2234[6] = "108x}*-*:$g>=)qȢ";
      f2234[7] = "jM\u0016\u000fzCjM\u0001SvLp\u0006\u0001MvYwwV\u0019$\u0012";
      f2234[8] = "\u0017\u000b!(Hc\u0017\u000b6tDl\r@6jDy\n1d5\u00153";
      f2234[9] = "^ua\u0005;\u007f^uvY7pD>vG7eCO$\u001dd.";
      f2234[10] = float.class;
      f2235[10] = "java/lang/Float";
      f2234[11] = ")%7`QS5?5<KG%<~-OO#9$`BV/y\u0017\"LD';#";
      f2234[12] = "pSvOUBpSa\u0013YMj\u0018a\rYXmi1P\b";
      f2234[13] = "\u000e\u0017DB!^\u000e\u0017S\u001e-Q\u0014\\S\u0000-D\u0013-\u0007Xz";
      f2234[14] = "+\f.}7\u0015+\f9!;\u001a1G9?;\u000f66kacK";
      f2234[15] = "j>El\u0017\u0000v$G0\r\u0014f'\fӨ";
      f2234[16] = "Sa\u0006\u0011?\u000fO{\u0004M%\u001b_xO\\\"\bY=\u0012Z9\u000eU}\u0006\u0011\b\u0014I~2Z9\u000eU}\u0006";
      f2234[17] = "uP\u0005iB2iJ\u00075X&yIL$_5\u007f\f\u0011\"D3sL\u0005ic\"nV\u000b)W";
      f2234[18] = "\u0017b\u0017pM\u001f\u001cm\u0006?,\u0011\u0017f\u0002e";
      f2234[19] = "=\u0000\u000f\b\u007f\u0010!\u001a\rTe\u00041\u0019FEa\f7\u001c\u001c\bl\u0015;\\\u000eCl\u0011'\u0000\r\b`\n6\u0007\u0004C#(=\u0016\u001dJh&3\u0006\rAb\u0017+";
      f2234[20] = "\u000bW~@\u0011\u001e\u0000Xo\u000f}\u001d\u000eZm@Q";
      f2234[21] = "S\u0017\u0016R1'O\r\u0014\u000e+3_\u000e_Ԙ";
      f2234[22] = "\b&AZ\nT\u0003)P\u0015wL\u0010.Y\\";
      f2234[23] = "{j>Ao\u0012RS\"[mNHG2X&_OT4\u001d{YTR8]o\u0012sC%GaRG\u001d";
      f2234[24] = void.class;
      f2235[24] = "java/lang/Void";
      f2234[25] = "\u001b\u001f%*v\u000f\u0007\u0005'vl\u001b\u0017\u0006lgh\u0013\u0011\u00036*e\n\u001dC7pm\u0016\u0007C-fn\u001f\u0017\u00191*W\u0019\u0006\u0002.hf\u001b\u0006";
      f2234[26] = "\u0018\u0005\u0014h}\t\u0004\u001f\u00164g\u001d\u0014\u001c]%`\u000e\u0012Y\u0000#{\b\u001e\u0019\u0014hA\t\u001a\u0015\u00164\\\u0019\u0003\u0003\u001a(h";
      f2234[27] = "\u001fX\\\bg[\u0001PFG/[\u001bZ^\u0000&@[{E\u0006%K\u0014Wy\u001c9^\u0019PO\u001b";
      f2234[28] = "(\u00062\u0002|\u001a4\u001c0^f\u000e$\u001f{Ob\u0006\"\u001a!\u0002o\u001f.Z3Io\u001b2\u00060\u0002c\u0000#\u00019I \"(\u0010 @k";
      f2234[29] = "\u001b!f\n\fh2\u0018z\u0010\u000e4(\fj\u0013E%/\u001flV\u0018#4\u0019`\u0016\fh\u0013\b}\f\u0002('V";
      f2234[30] = "Oq~39.D~o|Q.Jq|";
      f2234[31] = "\u0017_<g_5\u000bE>;E!\u001bFu*B2\u001d\u0003(,Y4\u0011C<go/\u0017A>(C\u0013\u001dY/ C'";
      f2234[32] = "u6t]\u001f&i,v\u0001\u00052y/=\u0010\u0002!\u007fj`\u0016\u0019's*t]#&v(@\u0016\u0019's*t";
      f2234[33] = "G\u00056{pm\u0014Viy\r\u001bo'GPQPG\u00056{pm\u0014Viy";
      f2234[34] = "\u0007]J{h\u000f\u001aRJg\u0005O\u0002H\u000f{B_k\u0015N'e\u000bR\u0011\u000e/e1\u0007]J{h\u000f\u001aRJg\u0005";
      f2234[35] = "UFs\u0012\u0006HX\u000b3\u000efӺ8U2XZ\u001aA\u00077\u0014\f#VB{T_Z\u0004G7\u0002f";
      f2234[36] = "\u0003\u0019\u0013\u0012/a\u0017VN\u001fD\u001dj\u000e\u0001\u00028;[\u001aN_5";
      f2234[37] = "ngf,\\S;gm)>ՑW9k,\u0004Z->5gA1";
      f2234[38] = "7\u0016\u0004W?Ib\u0016\u000fR]ɲ\u000eH\tWg@tOW\u001c\"+";
      f2234[39] = "\u0015 +&\u0013\b\u00144'su\u0010C3,,\u0019\"\u0014~qrLu\u0017s}+OL\u00133u+u";
      f2234[40] = "\u0007EE6_!\u0001FS6!ggYWm\u001dr\u001e\u000bR!KK\tN\u001ea\u00182[KR7!";
      f2234[41] = "F\rJB\u0018dD\u001c\u0012\u000f{p}QEF\u001b&C\u0006FP\u0019\u0019A\u0007V_D'\u0016\u0004@]{";
      f2234[42] = "\u0019UgWi\\@\rbBX\\\u0015\u0011GS#F\u0012\f}S.Vx\fbM![DS\u007fC!'\u0019UgWi\\@\rbBX";
      f2234[43] = ";j8\u0013O\u0019=ag\u0010.\u0011hvd\rB#85=Z.Kin4[D\u0006euaj";
      f2234[44] = "\\YZyWh^H\u000244ƛgX\u0007zQ$\u001c\u0001_\u007fD";
      f2234[45] = ",1JE<l. \u0012\b_Ƙ\u0017;\u0010S6twnTDa";
      f2234[46] = "hmu@m45\"t]\u0014 e9d\\S0\fbuU$of/yNq^hmu@m45\"t]\u0014";
      f2234[47] = ";I\u0015\u007fj!9XM2\tΨ\u0000L\r:2an\u0019\u0016k2";
      f2234[48] = "6\u0006\u001fNH\u001b:\u0000K\u0015%\u00060A*EA\u00140=\u0018\u0015X\u0013f\u0003LO[\u0003]";
      f2234[49] = "\u007f~\u0014\u0005g]'iN||Q`r\u0010\u0010N\u0002!+O| \u0000-rME$@%rw";
      f2234[50] = "\u0018H}JR\u0006\u0014N)\u0011?\u001d\u001f\u001fMUU/\u001e\u000fjIY\u001b\bsu\u0014R\n\u0010\u001ch\u0016\u0002Ds\u001ch\u0010\\\u0004\r\u0016k\u0012Zt";
      f2234[51] = "s\u0016\u000b2\u0018\u0000q\u0007S\u007f{ƅH\u0017V1\u001eL3N\u000e4\u000b";
      f2234[52] = "J\u00109H5'O\u0019u\b\tx\u001b\u001e+_eJL^t\u00018\u001dK\u0006tTxt\u001b\u001a\"G\t$JS+\u00020 \n[+8";
      f2234[53] = "\u001b\u001bYFDN\u0019\n\u0001\u000b'R[;[@[RD\u0016y\\M3\u0011\u0004A_\u0019VF\u0018\fR'\n\u001cJ\\\u0001\u001e\u000e\\B\\;";
      f2234[54] = "$\u001d_xc{~\u001a\u000bu\u0013w\u007f!\u0002q.{sPBx,h";
      f2234[55] = "\u001a>\"{\u0016K\u0000%qhu\u0001\u00154|a\t\u0016\u0002\u0000pf\t\u001a\u001e4f\u001a\u0016G\u0015%~u\u000bEEk\u001du\u000bC\u001b+c\u007f\bA\u001d[";
      f2234[56] = "U\b,9jbW\u0019tt\tԠn\f8.2f\b\r7ub";
      f2234[57] = ",HMF\u0004\u0001lAOUc\u001e}C\u0014C4I#\u0014L/RA|M\u001aO\r\t|\u001e";
      f2234[58] = "\u00191`-y,\u001b 8`\u001aӈ\"je5g2_htm*";
      f2234[59] = "\u0007BC.e\u0005\u0013\r\u001e#\u000e\u0018nUQ>r__A\u001ec\u007f";
   }

   public static Class m706(long var0, long var2) {
      Class var5 = null;
      int var4 = m704(var0, var2);
      Object var6 = f2234[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f2235[var4]);
            f2234[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m707(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m708(Class var0, String var1, Class var2) {
      Field var3 = m707(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m708(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m709(long var0, long var2) {
      int var4 = m704(var0, var2);
      Object var5 = f2234[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f2235[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m706(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m707(var12, var10, var11);
            if (var13 != null) {
               f2234[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m708(var14[var15], var10, var11);
                  if (var13 != null) {
                     f2234[var4] = var13;
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
               var12 = m706(1325510436146087L, 0L);
            }
         }
      }
   }

   public static Method m710(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m711(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m710(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m711(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m712(long var0, long var2) {
      int var4 = m704(var0, var2);
      Object var5 = f2234[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f2235[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m706(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m706(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m710(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f2234[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m706(1325510436146087L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m711(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f2234[var4] = var19;
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
               var23 = m706(1325510436146087L, 0L);
            }
         }
      }
   }

   public static MethodHandle m713(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'p' && var8 != 'S' && var8 != 'F' && var8 != 220) {
            var11 = m712(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 243) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 231) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m709(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'p') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'S') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'F') {
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

   public static Object m714(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m713(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Module087.class, "m714", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Õ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
