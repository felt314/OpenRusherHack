package org.rusherhack;

import java.util.Objects;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinEntity;
import org.rusherhack.client.api.accessors.packet.IMixinServerboundMovePlayerPacket;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.render.EventRenderEntity;
import org.rusherhack.client.api.events.render.EventRenderEntity$PlayerRotations;
import org.rusherhack.client.api.system.IRotationManager;
import org.rusherhack.client.api.utils.RotationUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.client.api.feature.hud.impl.Direction;
public class Class331 implements IRotationManager, Globals {
   public float f5305;
   public boolean f5306;
   public float f5307;
   public float f5308;
   public float f5309;
   public float f5310;
   public float f5311;
   public boolean f5312;
   public long f5313;
   public float f5314;
   public boolean f5315;
   public float f5316;
   public float f5317;
   public float f5318;
   public boolean f5319;
   public float f5320;
   public float f5321;
   public boolean f5322;
   public float f5323;
   public float f5324;
   public static Object[] f5326 = new Object[182];
   public static String[] f5327 = new String[182];

   @Subscribe(
      priority = -999
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      Class331 var6;
      if (this.m10858()) {
         var6 = this;
         var1.setYaw(this.f5324);
         var1.setPitch(this.f5318);
      } else {
         this.f5311 = this.f5324 = Globals.mc.player.getYaw();
         this.f5309 = this.f5318 = Globals.mc.player.getPitch();
         var6 = this;
      }

      boolean var10001;
      if (var1.getYaw() == Globals.mc.player.getYaw() && var1.getPitch() == Globals.mc.player.getPitch()) {
         var10001 = false;
         boolean var7 = true;
      } else {
         var10001 = true;
         boolean var10003 = true;
      }

      var6.f5322 = var10001;
      this.f5310 = var1.getYaw();
      this.f5314 = var1.getPitch();
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      Packet var5;
      if ((var5 = var1.getPacket()) instanceof PlayerPositionLookS2CPacket) {
         this.f5322 = false;
      }
   }

   @Subscribe(
      priority = -999
   )
   public void m10857(Event239 var1) {
      if ((this.f5312 || this.f5319) && this.m10858()) {
         var1.m8716(this.f5306 ? this.f5324 : this.f5316);
      }
   }

   public boolean m10858() {
      if (!this.f5306 && !this.f5315) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   @Override
   public void updateRotation(BlockPos var1, net.minecraft.util.math.Direction var2, float var3) {
      float var8;
      float var12;
      Class331 var14;
      label62: {
         Class331 var9 = this;
         int var10000 = Class253.m9154();
         float[] var7 = RotationUtils.getRotations(Class220.m8439(var1, var2));
         int var6 = var10000;
         var12 = var7[0];
         boolean var10004 = true;
         var8 = var7[1];
         if (this.m10860()) {
            float var11;
            float var13 = var11 = Globals.mc.player.getYaw();

            while (var13 < Globals.mc.player.getYaw() + 360.0F) {
               var14 = var9;
               if (var6 != 0) {
                  break label62;
               }

               label65: {
                  BlockHitResult var10;
                  Type var15 = (var10 = var9.m10867(var1, var11, var8)).getType();
                  Type var18 = Type.MISS;
                  if (var6 == 0) {
                     if (var15 != Type.MISS) {
                        net.minecraft.util.math.Direction var16 = var2;
                        if (var6 == 0) {
                           if (var2 == null) {
                              break label65;
                           }

                           var16 = var2;
                        }

                        if (var16 == var10.getSide()) {
                           break label65;
                        }
                     }

                     var15 = (var10 = var9.m10867(var1, var11 - 45.0F, var8)).getType();
                     var18 = Type.MISS;
                  }

                  label41: {
                     if (var15 != var18) {
                        net.minecraft.util.math.Direction var17 = var2;
                        if (var6 == 0) {
                           if (var2 == null) {
                              break label41;
                           }

                           var17 = var2;
                        }

                        if (var17 == var10.getSide()) {
                           break label41;
                        }
                     }

                     var13 = var11 += 90.0F;
                     continue;
                  }

                  var12 = var11 - 45.0F;
                  var14 = var9;
                  break label62;
               }

               var12 = var11;
               var14 = var9;
               break label62;
            }
         }

         var14 = var9;
      }

      var14.updateRotation(var12, var8, var3);
   }

   @Override
   public boolean isLookingAt(Entity var1) {
      return this.m10864(var1, this.f5316, this.f5323);
   }

   @Override
   public BlockHitResult getLookRaycast(BlockPos var1) {
      return this.m10867(var1, this.f5316, this.f5323);
   }

   @Override
   public void updateRotation(Entity var1, float var2) {
      boolean var10003 = true;
      float[] var6 = RotationUtils.getRotations(Class220.m8443(var1, true));
      float var10001 = var6[0];
      boolean var10005 = true;
      this.updateRotation(var10001, var6[1], var2);
   }

   public boolean m10860() {
      return (Boolean)Rotations.f8891.fixRotationsOnStrictServersLike2b2t.getValue();
   }

   @Subscribe(
      stage = Stage.POST
   )
   public void m10861(Event301 var1) {
      int var4 = Class253.m9155();
      if (this.m10858() && (this.f5312 || this.f5319)) {
         Input var19 = var1.m10147();
         float var12;
         float var16 = MathHelper.sin((var12 = Globals.mc.player.getYaw()) * (float) Math.PI / 180.0F);
         var12 = MathHelper.cos(var12 * (float) Math.PI / 180.0F);
         float var7 = var19.movementSideways > 0.0F ? 1.0F : (var19.movementSideways < 0.0F ? -1.0F : 0.0F);
         float var8 = var19.movementForward > 0.0F ? 1.0F : (var19.movementForward < 0.0F ? -1.0F : 0.0F);
         float var9 = var7 * var12 - var8 * var16;
         var12 = var8 * var12 + var7 * var16;
         float var17 = this.f5306 ? this.f5324 : this.f5316;
         var7 = MathHelper.sin(var17 * (float) Math.PI / 180.0F);
         float var18 = MathHelper.cos(var17 * (float) Math.PI / 180.0F);
         var8 = Float.MAX_VALUE;
         float var10 = 0.0F;
         float var11 = 0.0F;
         int var5;
         int var10000 = var5 = -1;

         while (true) {
            boolean var10003 = true;
            if (var10000 > 1) {
               float var20 = MathHelper.clamp(0.3F + Util210.m8045(Globals.mc.player), 0.0F, 1.0F);
               if (var4 != 0) {
                  if (Globals.mc.player.shouldSlowDown()) {
                     var10 *= var20;
                     var11 *= var20;
                  }

                  var19.movementForward = var10;
                  var19.movementSideways = var11;
               }

               return;
            }

            int var13;
            var10000 = var13 = -1;

            while (true) {
               var10003 = true;
               if (var10000 > 1) {
                  var10000 = ++var5;
                  break;
               }

               float var14 = var13 * var18 - var5 * var7;
               float var15 = var5 * var18 + var13 * var7;
               var14 = var9 - var14;
               var15 = var12 - var15;
               if ((var14 = MathHelper.sqrt(var14 * var14 + var15 * var15)) < var8) {
                  var8 = var14;
                  var10 = var5;
                  var11 = var13;
               }

               var10000 = ++var13;
            }
         }
      }
   }

   @Override
   public void updateRotation(float var1, float var2, float var3) {
      this.f5311 = MathHelper.wrapDegrees(var1);
      this.f5309 = MathHelper.wrapDegrees(var2);
      float var7;
      Class331 var10;
      if ((var7 = MathHelper.subtractAngles(MathHelper.wrapDegrees(this.f5324), this.f5311)) > 0.0F) {
         var10 = this;
         this.f5324 = this.f5324 + Math.min(var7, var3);
      } else {
         if (var7 < 0.0F) {
            this.f5324 = this.f5324 + Math.max(var7, -var3);
         }

         var10 = this;
      }

      float var8;
      if ((var8 = MathHelper.subtractAngles(MathHelper.wrapDegrees(var10.f5318), this.f5309)) > 0.0F) {
         var10 = this;
         this.f5318 = this.f5318 + Math.min(var8, var3);
      } else {
         if (var8 < 0.0F) {
            this.f5318 = this.f5318 + Math.max(var8, -var3);
         }

         var10 = this;
      }

      var10.f5306 = true;
      this.f5313 = System.currentTimeMillis();
      this.f5312 = this.m10860();
   }

   @Subscribe(
      stage = Stage.ALL,
      priority = -999
   )
   public void onSend(EventPacket$Send var1) {
      PlayerMoveC2SPacket var5;
      Packet var7;
      if ((var7 = var1.getPacket()) instanceof PlayerMoveC2SPacket && (var5 = (PlayerMoveC2SPacket)var7).changesLook()) {
         if (var1.getStage().equals(Stage.PRE) && this.f5322) {
            IMixinServerboundMovePlayerPacket var8 = (IMixinServerboundMovePlayerPacket)var5;
            var8.setYaw(this.f5310);
            var8.setPitch(this.f5314);
         }

         this.f5316 = var5.getYaw(-999.0F);
         this.f5323 = var5.getPitch(-999.0F);
      }
   }

   public boolean m10864(Entity var1, float var2, float var3) {
      double var6 = var1.getBoundingBox().maxY - var1.getBoundingBox().minY;
      double var8 = var1.getBoundingBox().maxX - var1.getBoundingBox().minX;
      double var10 = var1.getBoundingBox().maxZ - var1.getBoundingBox().minZ;
      var6 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10) + 0.1;
      var6 = Util177.m7290(var1.getBoundingBox().getCenter()) + var6;
      Vec3d var17 = Globals.mc.player.getEyePos();
      Vec3d var12 = ((IMixinEntity)Globals.mc.player).invokeCalculateViewVector(var3, var2).multiply(var6);
      Vec3d var14 = var17.add(var12);
      Box var13 = Globals.mc.player.getBoundingBox().stretch(var12).expand(1.0, 1.0, 1.0);
      if (ProjectileUtil.raycast(Globals.mc.player, var17, var14, var13, var1x -> {
         return var1x.equals(var1);
      }, var6 * var6) != null) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean isLookingAt(BlockPos var1, net.minecraft.util.math.Direction var2) {
      BlockHitResult var6;
      if ((var6 = this.getLookRaycast(var1)).getType() == Type.MISS || var2 != null && var2 != var6.getSide()) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   public Class331() {
      super();
      this.f5306 = false;
      this.f5315 = false;
      this.f5313 = 0L;
      this.f5322 = false;
      this.f5312 = false;
      this.f5319 = false;
      Class170.f3362.subscribe(this);
   }

   @Subscribe(
      priority = 1000
   )
   public void onUpdate(EventUpdate var1) {
      this.f5315 = this.f5306;
      this.f5306 = this.f5322 = false;
      this.f5319 = this.f5312;
      this.f5312 = false;
   }

   public boolean m10866() {
      if (!this.f5312 && !this.f5319) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   public BlockHitResult m10867(BlockPos var1, float var2, float var3) {
      double var10000 = 1.83;
      double var8 = Util177.m7297(var1) + 1.83;
      int var12 = Class253.m9155();
      Vec3d var7;
      Vec3d var10 = (var7 = Globals.mc.player.getEyePos()).add(((IMixinEntity)Globals.mc.player).invokeCalculateViewVector(var3, var2).multiply(var8));
      int var6 = var12;
      BlockHitResult var11;
      BlockHitResult var13 = var11 = Class220.m8449(new RaycastContext(var7, var10, ShapeType.OUTLINE, FluidHandling.NONE, Globals.mc.player), var1x -> {
         return var1x.equals(var1);
      });
      if (var6 != 0) {
         if (var13 == null) {
            return BlockHitResult.createMissed(Vec3d.ZERO, net.minecraft.util.math.Direction.DOWN, var1);
         }

         var13 = var11;
      }

      if (var6 != 0) {
         if (var13.getType() != Type.MISS && !Objects.equals(var1, var11.getBlockPos())) {
            var11 = var11.withBlockPos(var1);
         }

         var13 = var11;
      }

      return var13;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.ALL
   )
   public void onRenderEntity(EventRenderEntity var1) {
        
    }

   @Override
   public void updateRotation(BlockHitResult var1, float var2) {
      Vec3d var6;
      if (!(var6 = var1.getPos()).equals(Vec3d.ZERO) && !var6.equals(Vec3d.ofCenter(var1.getBlockPos()))) {
         float[] var8 = RotationUtils.getRotations(var6);
         float var10001 = var8[0];
         boolean var10005 = true;
         this.updateRotation(var10001, var8[1], var2);
      } else {
         this.updateRotation(var1.getBlockPos(), var1.getSide(), var2);
      }
   }

   static {
      m157();
   }
   public static void m157() {
      f5326[0] = "\"fId@\u0011\"f^8L\u001e8-^&L\u000b?\\\u000e\u007f\u001eJ";
      f5326[1] = float.class;
      f5327[1] = "java/lang/Float";
      f5326[2] = "d\u0011i;xld\u0011~gtc~Z~ytvy+*!#";
      f5326[3] = "\u007foa\u0013z4cucO` sv(Ȼ";
      f5326[4] = int.class;
      f5327[4] = "java/lang/Integer";
      f5326[5] = "JCU\u000f,$JCBS +P\bBM >Wy\u0016\u0015u";
      f5326[6] = "HjU\u0000zTTpW\\`@Ds\u001cʣ";
      f5326[7] = boolean.class;
      f5327[7] = "java/lang/Boolean";
      f5326[8] = "\u0004\u0016@D`\n\u0018\fB\u0018z\u001e\b\u000f\tȸ";
      f5326[9] = "\u0004D\u0018m\u00106\u0018^\u001a1\n\"\b]Qȷ";
      f5326[10] = "Fj3\u001ak:Zp1Fq.JszWu&Lv \u001ax?@6\u0013Xv-Ht'";
      f5326[11] = "hK\u001c\r39hK\u000bQ?6r\u0000\u000bO?#uq[\u0012n";
      f5326[12] = "Jh\u001d\u0012<JVr\u001fN&^FqTƐ";
      f5326[13] = "jW\u0010\u0014\u001f^jW\u0007H\u0013Qp\u001c\u0007V\u0013DwmU\tB\u000e";
      f5326[14] = "\u007fad\f9%\u007fasP5*e*sN5?b[\"\u0011gt";
      f5326[15] = "n\u0011>DTNe\u001e/\u000b5@n\u0015+Q";
      f5326[16] = "\u00076\u0014ecf\u00076\u00039oi\u001d}\u0003'o|\u001a\fSr8:";
      f5326[17] = void.class;
      f5327[17] = "java/lang/Void";
      f5326[18] = "s7ZT\u00065o-X\b\u001c!\u007f.\u0013Һ";
      f5326[19] = "\u001b_";
      f5326[20] = "J.B\nF\u000bV>@V\\\u001fF=\u000bG[\f@x@RQ\u0010QxVPU\u0019@xvPU\u0019@";
      f5326[21] = "\u00140LA.k\b*N\u001d4\u007f\u0018)\u0005Ą";
      f5326[22] = ";W4>#7'M6b9#7N}s>01\u000b6f4, \u000b\u0016f4, g&c";
      f5326[23] = "YA\u001ac+[E[\u0018?1OUXS.5GS]\tc8^_\u001d\u0018;<@B@S?<@RV\u000fc\u001cXS]\t\u001f<@RV\u000f\b7Z_G\u0004";
      f5326[24] = "bOL=$\t~UNa>\u001dnV\u0005p:\u0015hS_=7\fd\u0013Ne3\u0012yN\u0005a3\u0012iXY=\u0013\nhS_A3\u0012iXYV8\bdIR7\u0006\u0010lDNa\u0004\u0013y\\_z9\u0012~";
      f5326[25] = "Kc.|\u0018\u0002Wy, \u0002\u0016Gzg1\u0005\u0005A?,$\u000f\u0019P?=+\u001a\u0012\nT?7\u0004\u0003";
      f5326[26] = "RQ\u0010 \u0012qRQ\u0007|\u001e~H\u001a\u0007b\u001ekOkU<F/";
      f5326[27] = "YOT\u0003\u0002\u0006EUV_\u0018\u0012UV\u001dǊ";
      f5326[28] = long.class;
      f5327[28] = "java/lang/Long";
      f5326[29] = "5)$\\lp)3&\u0000vd90m\u0011rl?57\\\u007fu3u&\u0004{k.(m\u0002rd#>1\\[s?57\"rd#>1'na;/&";
      f5326[30] = "q\u0016h\u0002GXm\fj^]L}\u000f!OYD{\n{\u0002T]wJzX\\AmJ]CALj\r`B`Yw\b|";
      f5326[31] = "T\u0012\u0007-\u00006T\u0012\u0010q\f9NY\u0010o\f,I(A7^";
      f5326[32] = "%]";
      f5326[33] = "!(2h\u0007]=204\u001dI-1{Ɗ";
      f5326[34] = "\r\u001c)b\t@\r\u001c>>\u0005O\u0017W> \u0005Z\u0010&otV\u0011";
      f5326[35] = "\u0018nk\u0003x\b\u0004ti_b\u001c\u0014w\"Nf\u0014\u0012rx\u0003k\r\u001e2mNi\u0018\u0004oc_yS\u0007}oFo\tYUADr\u0014\u0019Oi_|\u0018\u0005~cXd\u0019:szHZ\u0011\u0016ei_Z\u001c\u0014wiY";
      f5326[36] = "\u0015jTN\u0012\\\tpV\u0012\bH\u0019s\u001d\u0003\f@\u001fvGN\u0001Y\u00136V\u0016\u0005G\u000ek\u001d\u000e\u0005]\rwA\u000bNl\f}]\u00140H\u0019sV\u0014";
      f5326[37] = "[\b,P9\n[\b;\f5\u0005AC;\u00125\u0010F2jKmU";
      f5326[38] = "-\u0015\u0001e%t&\u001a\u0010*Fy3\u001c";
      f5326[39] = "\b\u0011\u0003\u007ffq\u0003\u001e\u00120\u001bd\u0011\u0004\u0010s";
      f5326[40] = "B]bG'3^G`\u001b='ND+ē";
      f5326[41] = "h0U\u0018n;h0BDb4r{BZb!u\n\u0013\u0005;`";
      f5326[42] = "b\r8HXgb\r/\u0014ThxF/\nT}\u007f7~U\u0000>";
      f5326[43] = "|\u0003d\"x\u001d|\u0003s~t\u0012fHs`t\u0007a9\"?,Pq\nq\u007ff+ R ";
      f5326[44] = double.class;
      f5327[44] = "java/lang/Double";
      f5326[45] = "P\u0019\n9MpP\u0019\u001deA\u007fJR\u001d{AjM#M.\u0015 ";
      f5326[46] = "v:\u00181!]h2\u0002~i]r8\u001a9`F2\u000b\u001c5kA\u007f:\u001a5";
      f5326[47] = "R\fli*tR\f{5&{HG{+&nO6+~r$\u0018\nt&4nc[,u";
      f5326[48] = "{T\u0014\u0012]#gN\u0016NG7wM]_C?qH\u0007\u0012N&}\b\u0012_L3gU\u001cN\\xqH\u0007U[/:o>UW?zc\u001dHF\"m";
      f5326[49] = "r^}\nvDr^jVzKh\u0015jHz^od:\u001d.\u00148XeEh^C\b0\u0012+";
      f5326[50] = "%\u0010BkY7;\u0018X$8 %\u0014W~\u0004";
      f5326[51] = "\u001ez\u0011lH;\u001ez\u00060D4\u00041\u0006.D!\u0003@Wq\u001d";
      f5326[52] = "^@\u0003T:&^@\u0014\b6)D\u000b\u0014\u00166<CzFL`z";
      f5326[53] = "GK\u0001&\u0000|GK\u0016z\fs]\u0000\u0016d\ffZqF1[#";
      f5326[54] = "0x>s\u007f\u0010,b</e\u0004<aw՛";
      f5326[55] = "\u0017Vht\u0004A\u001cYy;hB\u0012[{tD";
      f5326[56] = "P\u0005\u0002\u001f'\u001cL\u001f\u0000C=\b\\\u001cKR:\u001bZY\u0016T!\u001dV\u0019\u0002\u001f\u0017\u0006P\u001b\u0000P;:Z\u0003\u0011X;\u000e";
      f5326[57] = "\u001bPt\ty\u001a\u0007JvUc\u000e\u0017I=Dd\u001d\u0011\f`B\u007f\u001b\u001dLt\tX\n\u0000VzIl";
      f5326[58] = "y\u001f\u001eP\u0005\fo\u0013\u001a\n|Ks\u0005&V\u0000[~yG\\\u0002W`G\u001bZ\u0011U\u001e\u0012EXMK~\u001bOK\u00180";
      f5326[59] = "\u0001D\u0013zfl\u001b\u0000\u0017\u007f\t{\u000b\u0003MeeI_E\u0017=0\u001e_\u0014Sew \u0003\u0012@g\t'\r\u0001J|7{\u000b\u0012H\u0002";
      f5326[60] = "F;  X\u0001\u001d,f+7\u0013\u001e*>}`@Nw`\u0011\u000e\u0016\u0001 $/R\u0010\u0012\"";
      f5326[61] = "lG30'v/\u001byhZ˓\u0017\u001f,03'v\u0006)e?\u001b.\u00106i$%r\u0016%kZ";
      f5326[62] = "\u0012\u0012Tl\u0006;\u0007\\P\u0001^&\t\fRmlrJ\\\u000f8;r\u001e\u0012R\u007f\u0005.\u0018\u0001P\u0001\u0002 \u000b\u000bK?^&\u0018\t58P5\u0012\u0012\u000bdV&\u0010l\fjE,\u000bRPlV.u";
      f5326[63] = "\u0016\u0000\u0001\r\u0006J\u000f\u0005T\u0001:N\u001f\u0018_\u0003V|K\\\u0006U:O\u0016ZVX[V\u0013\u000fZd^OL\r\u0003\u0005GJ\u0019\u0001?";
      f5326[64] = "p\u0003\u0001,oA+\u0014G'\u0000S(\u0012\u001fqW\u0003sO@\u001d9V7\u0018\u0005#eP$\u001a";
      f5326[65] = "R*4\t\bN\u0005t\"\u0016yӬ4v9\u001e\u001f\rDumI\u0012\u007f\t~3\u0014I\u0005Njc\u0017y\u001bP);N\u0018\u0002U|7r";
      f5326[66] = "u\u0018]7\u000eN7FKe\u0005/\u0096!\u00155\u0011]=Z@>\u0002A*";
      f5326[67] = "jT%4:ExFb4BLdF\u000e-=70Q!#<\tlW2!B\\2Un?\"U8F;D";
      f5326[68] = "yI^\u0012U c\rZ\u0017:7s\u000e\u0000\rV\u0005%LYU\u0000R#\u001b\u0001\f\n(d\u000fQ\u000f:";
      f5326[69] = "\u0004Nv^aY\u0012\n/\u0005\u000f\t\u0017]*YX^M\nw5r\u0006\bH$Pd\u001aL_";
      f5326[70] = "\u0011\u0010V0'n\u0012\u0007IlJz\u0011\u001bX\u000e7`\u0016\u0019Nk!|R\u000e$s+\u007f\u0010\u000bAe7;\u0007a";
      f5326[71] = "'^\u0013#\n|7M\u0017lh}%R23\u0014y(.S9\u0016u6\u0010\u000f?\u0005wH";
      f5326[72] = "l\u0015jp\u0002it@lbmbyVRk\u0006nyV\nz\u0013jrF`a\u0017ku*";
      f5326[73] = "{\u0003fz\b\u0018x\u001193xȤGZ=t\u001fWy\u0006;g\u001d";
      f5326[74] = "%MuEnBhJ,A\t\u001cq&qAwGzO6\r0\u0014";
      f5326[75] = "!\ty>{/-S$#\u0006$#LW9z*2A\u001a>m'(Bj=9p%0";
      f5326[76] = "\u001f\u0011)\u00193p\u001c\u0003vPCĒ#Lp\b%qY\u000bdX&";
      f5326[77] = "h)~y\n\u0013k;!0z_,%'u\u0017x35'u\u001bE2I\u007fq\u0002Ems~h\u001c\u0012T5sj\u001a\u001d1%6b\u0005\"m\"0n\u0004\u001c1$#lzIo&\u007fr\u001a@e5*\t";
      f5326[78] = "\u0000I\u001aq#\u0015\u0015\u0007\u001e\u001c{\b\u001bW\u001cpI\\Z\fF!\u001e\\\fI\u001cb \u0000\nZ\u001e\u001c'\u000e\u0019P\u0005\"{\b\nR{";
      f5326[79] = "\u0002[7 4\u001f\u000bD>\u007fYA\u0005D7!5sR\tl|i$Y@/!`\u001eXY1vYN\u000bX1+bG\u0014QnF";
      f5326[80] = "_o\u0015e#%I+L>M~@mMi!L\u0014)\u00153M\u007fI/D2,fLzH\u000e";
      f5326[81] = "P\u0019\u001erC2\u0001\u000f\u001b,-ȅjZ\u0000q@f\u0001\t\u0017+O\\";
      f5326[82] = "*`W:\u0003\r}rY:i\u001d>sZ,\u0012p.v]-Y\u001b;nP3iM.oUx\u0013\n:?VH";
      f5326[83] = "Rp\u0012\u0012\u001dtG>\u0016\u007fEiIn\u0014\u0013w=\b5BD =^p\u0014\u0001\u001eaXc\u0016\u007f\u0019oKi\rAEiXks";
      f5326[84] = "EH,wt\u001e@Dy(\u0019\u0014L_Jue\u0012]Bwtb{EG.{%\u001a\\B{w\u0019\u001eDI}p%FPR(\u0012";
      f5326[85] = "C#2);\u000e@1m`Kɯ\u007fzi',AA&o4.";
      f5326[86] = "ONC\u0012I{YBGH0<ETr\u001cOG\u0011C]\u0012NyMEN\u00100,\u0013G\u0012\u000eP%\u0019TGu";
      f5326[87] = "g<2\"Z\u001ed.mk*R#0k.Gu< k.KH=\\;9TH%bg?GJ[ei,MQe9o?O/b7|5T\u0011>1o7*D`33)JMj fR";
      f5326[88] = "&Y\u000faZI/F\u0006>7\u0017!F\u000f`[%u\u0005P7\u000fr0\u0007\fg\b\u0017 B\u0004x7";
      f5326[89] = "vQ\u0014S_\\u\u0005C^-IzF\u0018RA{*\nB\u0004-^i\u0002\u0013[\u0013H-[H5";
      f5326[90] = "\u0003T\u0006\u0019'A\u0000FYPW\u0097?\r]\u00170\u000e\u0001Q[\u00042";
      f5326[91] = "V<o~\u000fd\u0001.a~e~A>jj\f};hv1\b#P;ak\u0007\u0019";
      f5326[92] = "**#=E+*r`aUB||%\\C&n|YkR,v!2~J!h\u0011";
      f5326[93] = "l A\u0015Mw1(\u0006\u0019qӝ\u00017\u001b\u000f\u0018h\u007f\"C\u0012\t";
      f5326[94] = "\u000b0;\u0011\u0003UIn-C\b4ʜ\ts\u0010\u001c\f\\h1N\n^W";
      f5326[95] = "e\u000ek\u0018\u001c*f\u0019tDq }\u0019\u0019\u001f\u001a;{\u0001'C\u001c(y\u007f M\u000f\"bA|K\u001c \u001cFrX\u0016;\"\u001atK\u0014E";
      f5326[96] = "\u0016\n*YW&K_4\u001eVVEW)\u0001^?In'\u0001N;/\r'\u0004UfUJ3TVV";
      f5326[97] = "\u001d\b\u001a2\u0003\u0019\u0004\rO>?\u001d\u0014\u0010D<S/CP\u0015f\u0004x\u0002\b\u0018=\u0000CA\u0006\u001dk?\u001c\u001dRMg^\u0005\u0018\u0007A[";
      f5326[98] = "L>\u001d*TOO,Bc$ծpgF$C\u0000N;@7A";
      f5326[99] = "\u0017\u0000E>\u000eG\u001e\u001fLac\u0019\u0010\u001fE?\u000f+D\\\u001agS|\u0019\u0007\u001b1_\u001d\u0000\u0002N=c\u0000@\u0000Eg\u0006\u0010\u0005\bZXR\u0004\u0005\u0004\u001cbS\u001d\u001bS%2\u0000\u001c\u001b\u000e\u001e;\u001f\u0015Dc";
      f5326[100] = "i1\f\u0006Clg7\u0011\f{0\u007f/\n\u001f\u0016\u001ap5\u0006\u0001\u001f8e<3\u001d\u0016.G<\u0006\u0000\u001c+\u0019h\u0006\u0002\u001c/'4\u0000\u0011\u001eQ :\u0013\u001b\u0005o|<\u0000\u0019{5}o\u0004@\u001a,x:\b|";
      f5326[101] = ".\u0012~\u001f\u0013Wu\u00058\u0014|Nz\u0012dI\u0010|,U9\u0011E+s\n:G@Jj\u000foK|";
      f5326[102] = "\u001d-y?jq\u000bi d\u0004!\u000e>%8SvTi|Ty.\u0011++1o2U<";
      f5326[103] = "a\u0005\u0007\u0019;9bQP\u0014I$y\u0013\u0002\u001b2Ii\u0016\u0005\u001ay\"|\u000e\b\u0004Iti\u000f\rO33}_\u000e\u007f";
      f5326[104] = "x{PHJyt*JI%yullVLyu\u0010ZDAdrm\rVOd\u0018";
      f5326[105] = "'[YCZ)$I\u0006\n*Ґ\u001b\u0002\u0002MMf%^\u0004^O";
      f5326[106] = "@\u0010\u0013\u001f\tVC\u0002LVyռ|A[\u0017\u001e^F@B\tIgE\u001b]\b\u0007Y\u0019\u001dN\ny^\u0017\u000eD\u0011G\u0002\u0011\u001dFo\u0013\u0004\u001c\u0016NT\u001a\u001b\u0015I#";
      f5326[107] = ")Nkw\u001d-rY-|r4}Nq!\u001e\u0006-\u0002+wr#n\nz(L5*S!F";
      f5326[108] = "qy7\nt\u0007*nq\u0001\u001b\u001e%y-\\w,s;q\u0006&{qn3\\eE-h ^\u001b";
      f5326[109] = "eNr'Xlu\u000bz8ggx\u001eu+00 K*|gu$\u0010qx\u0002ea\u0018n";
      f5326[110] = "]\u001f+@\u0010}\u000f\u001bw\u0011uѵc\u001f(\u001f\u001f~\u001b\u001c,C\u0018\u0003";
      f5326[111] = "q~\u000f\u0015&P*iI\u001eII%~\u0015C%{u2I\u001bI\u0015#|\u0012ZwI%o\u0010$\"\u0017'3\u000eD+\u001d4fu";
      f5326[112] = "A6\u001dDVAS$ZD.HO$?URXBX^_PT\\f\u0002YCV\"3\\[\u001fHB:VHJ3";
      f5326[113] = "(\u0007\u0001'FJ1\u0002T+zN!\u001f_)\u0016|u[\u0005wzV-\u001dG$\u001f@1YPN\u001eOr\n\u0003/\u0007J'\u0006?";
      f5326[114] = "j=g\n$(i/8CTsVc1\u0005i\u007f''-\u0007+\u0019h;(G2h,'*\u0005T";
      f5326[115] = "\u001b-n\u0013^j\u0018?1Z.ǥ'p7\u0002Hk]7#RK[";
      f5326[116] = "3oou_X0}0</Ǧ\u000f26dIYuu\"4Ji";
      f5326[117] = "\u000e\u0002En\r3U\u0015\u0003eb!V\u0013[35q\rD\u0007_[$I\u0019Aa\u0007\"Z\u001b";
      f5326[118] = "}GNRV4tXG\r;jzXNSWX.\u001b\u0011\u0004\u0000\u000fj\u001bB\u000fD0.\u001fRO;";
      f5326[119] = "/TE4*\u000e,F\u001a}Zձ\u0013\r\u001e:=A-Q\u0018)?";
      f5326[120] = "L\u0012\u0015A\u001b\"Y\\\u0011,C?W\f\u0013@qk\u0016WJ\u0016&k@\u0012\u0013R\u00187F\u0001\u0011,\u001f9U\u000b\n\u0012C?F\tt";
      f5326[121] = "i\u001cj\u0005,\u0000j\u000e5L\\ȃUA3\u0014:\u0001/\u0006'D9";
      f5326[122] = "A\u0018*,C\u0011B\nue3Ɋ}Aq\"T^C\u001dw1V";
      f5326[123] = "O\u001e@wvF\u0014\t\u0006|\u0019T\u0017\u000f^*N\u0004L_\u000bF Q\b\u0005Dx|W\u001b\u0007";
      f5326[124] = "]X.x\u0005R_Rowoɥ<\u0013?e\bV\u0002O9v\n(W\u0011;*\u0014H^\u001b(\u007fo";
      f5326[125] = "\u007fx7C0q(j9CZTH[S\\4h`|.\u000b&f`";
      f5326[126] = "k=\u001e\u001e!\u007fqy\u001a\u001bNhaz@\u0001\"Z5<\u001aYv\r5m^\u000103ikM\u0003N4gxG\u0018phakEf";
      f5326[127] = " Z';,*{Ma0C8xK9f\u0014h!\u001ea\nz=gA#4&;tC";
      f5326[128] = "/z\u001bQtX:\"\u0006@\u001b]<v\u0011SaG+qjQcH$,\u0001D{E:\u001c\u0001\u0003t\u0017:|\b\tgBA";
      f5326[129] = "\u001aGo\u001d%\u0010M\u0019y\u0002TϦ|Kq\u001e3\u0018FJh\u0000d!\u0000Gj\u0006kD\u0010\u0002b\u0019TE\u0018D`Z5\\\u001d\u0011lf";
      f5326[130] = "+?I\u0003Il(-\u0016J9Ӥ\u0017b\u0010\u0012_mm%\u0004B\\";
      f5326[131] = "@\b\u001c.\u001a3P\u001b\u0018ax2B\u000446\u0007]\u0016\u0013\u001b8\u0006cJ\u0015\b:x";
      f5326[132] = "~?Hf\rfh{\u0011=c=a=\u0010j\u000f\u000f5yH<c%m?\bg\u00063q{\u001f\r\u001e9r9\u001ah\b%6.pp\u0002&t+\u0015f\u001ebcA\u0002s[3b\u007f\u00147\u0002h\f";
      f5326[133] = "j\u0010\u000eP&WfJSM[\\hU5X!Od@\tm:XfRm\b0MbWST6^`)";
      f5326[134] = "\u0004G\u0004]\u000e1\u0011\t\u00000V,\u001fY\u0002\\dx^\u0002U\t3x\bG\u0002N\r$\u000eT\u00000\n*\u001d^\u001b\u000eV,\u000e\\e\tX?\u0004G[U^,\u00069";
      f5326[135] = "\b_7[[R\u000bH(\u00076X\u0018^E\\]C\u0016P{\u0000[P\u0014.|\u000eHZ\u000f\u0010 \b[Xq\u0017.\u001bQCOK(\bS=";
      f5326[136] = "V[n\u001aH\u0001WBpMqV\u001e^\u007f\u0019\n;\u000e[x\u0018AP\u001bCu\u0006q\u0006\u000eBpM\u000bA\u001a\u0012s}";
      f5326[137] = "9)W\"\u000f;b7C>oҰ\t|Z{\u0001yr|\u0001{\u0012\u00050&E'\u0011;l V%o";
      f5326[138] = "h6Q$)Tk$\u000emYĿTk\b5?U.,\u001ce<";
      f5326[139] = "B2L@CzTv\u0015\u001b-*Q!\u0010Gz}\u000bvO+P%N4\u001eNF9\n#";
      f5326[140] = "yD<xW\tp[5':W~[<yVe*\u0018c!\u00052\"_$y\u0003\b#F:.:";
      f5326[141] = "\u001dl<c;:\u001d\";|B'\u0015olg9J\u0005jkfr!\u0010rfxB#\u0014|`3)6\fq~\u0003\u007f#\rt5y87]w\u0005";
      f5326[142] = "\u001c!P2U3G6\u00169:*H!JdV\u0018\u001ec\u0016>\u0006O\u001c6TdDq@0Gf:";
      f5326[143] = "\r4\n2F\u0005V#L9)\u001cY4\u0010dE.\u000fvL>\u0017y\r#\u000edWGQ%\u001df)\u0012\u000f'AxI\u001b\u00054\u0014\u0003";
      f5326[144] = "5\u000eIo{hd\u0018L1\u0015զ\u000fMWlx<d\u001e@6w\u0006";
      f5326[145] = "B+\u001b\f8FA9DEH¢~*@\u0010.\u0005\u000e)\u0014G#wG U\u001b6I\u001b&F\u0019HN\u00155L\u0002v\u0012\u0013&N|u\u001e\u001f-\u001b\u00062\nO.+";
      f5326[146] = "U]FX\\VVO\u0019\u0011,μi\u0004\u001dVK\u0019WX\u001bEI";
      f5326[147] = "xyc;vZn=:`\u0018\nkj?<O]1=cPe\u0005t\u007f15s\u00190h";
      f5326[148] = "\u001cr\u0005\t*\u001b\n6\\RDK\u000faY\u000e\u0013\u001cU6\u0001b9D\u0010tW\u0007/XTc";
      f5326[149] = "1\nv\u0001\u001b\u00152\u000e*\u0006f\u0003k\u0002p\u00071V;W)k_\u0006t\bjU\u0003\u0000g\n";
      f5326[150] = "\r\u0002\\D\u0017uI\u0006L\u0004h$\u0011PT\u0013?sK\u0006\u000b\u007f\u0015u\u001c\u0006O@Qq\fF";
      f5326[151] = "\u0011{.<_J\u0011}zp>ƹ}*).TKF&5,E";
      f5326[152] = "%\u0016o8\u0000k&\u00040qpՌ\u0019O46\u0017$'\u00132%\u0015";
      f5326[153] = "0i\b+\u001e%k~N q<di\u0012}\u001d\u000e3-I\"JY4|\u0013|A#shC\u007fq";
      f5326[154] = ")%eyl5*7:0\u001cʽ\u0015|>w{z+ 8dy";
      f5326[155] = "9\u001f\u000377H5E^*JC;Z;*#C;&\r8.^<[Z* ^V";
      f5326[156] = "\u0005\u001ekpJc\u0006\f49:à9G0~],\u0007\u001b6m_";
      f5326[157] = "\u0001k\u000b\u0005>2B7A]C\u0090z,\u0014\u0007%`Ao\u001a\u0002s_C<\u000e\\=a\u001f:\u001d^C";
      f5326[158] = "\u0011r\u0014/[=\u0012`Kf+ɔ-/M>M<WhYnN";
      f5326[159] = "\\4\u0019ID\u007f_&F\u00004ɠ`mBGS0^1DTQ";
      f5326[160] = "c3\u0005?t\u0005`!Zv\u0004ё_j^1cJa6X\"a";
      f5326[161] = "dG&\u0016\u0011/gUy_aq5[R\u0001\u0006}\u0002Ng\r\be$''\u001e\u0019ya\u001d&\u0007\u0007.XMu\u0006\u0007scDj\u000fX\u001e";
      f5326[162] = "`_ij*\u0002d_h{|\u007f<\n.{$\u0013\u000e^b#|BY\u00069w%\r)\u0005m (\u007f=\u0003lr\u007f\u001e$\u00069~C\u001b=Y;'\"\u00028\f7\u001b1\u0001a\f<%'E8WRd!\u0005?\\< &\u000f>g/z=\u00073\u00029fy\u0010Y^kr?\u000e$\u0007lk'\u001bY";
      f5326[163] = "L!D-*\u0007Yo@@r\u001aW?B,@N\u0016d\u001b{\u0017N@!B>)\u0012F2@@.\u001cU8[~r\u001aF:%y|\tL!\u001b%z\u001aN_\u001c+i\u0010Ua@-z\u0012+";
      f5326[164] = "adgB\u00033t<zSl5hyj+\f&h`yD\u0000wra\u0016@W\">yvI]1k\u0002";
      f5326[165] = "aW\u000f..^sEH.VCoE.7),;R\u000b9(\u0012gT\u0018;V";
      f5326[166] = "\u0013e\u0011Kh;\u0010aML\u0015-Im\u0017MBx\u00198L!,(Vg\r\u001fp.Ee";
      f5326[167] = "\u0019\f\t\u0014^%\u001a\u001eV].ɓ%UR\u001aIj\u001b\tT\tK";
      f5326[168] = "K\u0015;\u001a\u001e1\u001cK-\u0005oɝ-V<\u0000\u00110RQ,\u000b\u0003\u0000RJ'\u0007Tn\u0016M-\u0006ojNH;\fTcQAda";
      f5326[169] = "=\u0010{dT](^\u007f\t\f@&\u000e}e>\u0014gU%5i\u00141\u0010}wWH7\u0003\u007f\tPF$\td7\f@7\u000b\u001a";
      f5326[170] = "M&\u0018\u001bHu\u00161^\u0010'l\u0019&\u0002MK^Od^\u0017\u0018\tM1\u001cMY7\u00117\u000fO'bO5SQGkE&\u0006*";
      f5326[171] = "d\u001c\u0013\u001d0+m\u0003\u001aB]uc\u0003\u0013\u001c1G7@LKa\u0010j\u001bM\u0012aqs\u001e\u0018\u001e]";
      f5326[172] = "Vh\b\u0018\u0017g@,QCy7E{T\u001f.`\u001f,\ns\u00048ZnZ\u0016\u0012$\u001ey";
      f5326[173] = "hPf\u0002\u001dukB9Km\u008cTR4\u0002\u0001#5]j\u0017\t";
      f5326[174] = "5\u0003Y)\u0017U'\u0011\u001e)oH;\u0011{8\u0013L6m\u001a2\u0011@(SF4\u0002BV";
      f5326[175] = "sO6=KYh\u0013'6&PmF1#q\u00077\u0017eOYZoY8(B\u0006~R";
      f5326[176] = "\u000e/hocL\u0017*=c_C\u000b&2j\b\u0014Qvm\u0006;IT\"jg\"L\u0001.";
      f5326[177] = "\u001fp$\u0007@\u001bX<cT \u001cA`>UwK\u001f7f9\u0019\u000eZ<5EB\u0019\u001c7";
      f5326[178] = "m3\u0006|a>,g]b_<}1\ta\bk#aP<_#s7\u001c33b'l\u0002";
      f5326[179] = "\u007f\tAx\u001fNcH\nzrYxIAp\u0014NYR^p7SaWZfrPgCWz\u0013_9V_\u001d";
      f5326[180] = "&\u000f\rP#U0KT\u000bM\u000e9\rU\\!<mA\u0005\u0003qk0\u0015\u000bRq\n)\u0010^^M\u0019*I^Us\u000fn\u0010\u0005;";
      f5326[181] = "78\u00126K\u0011.=G:w\u001d*!E;\fp:$B:G\u001b/<O.wM:=Jo\r\n.mI_";
   }
}
