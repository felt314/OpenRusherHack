package org.rusherhack;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import org.rusherhack.client.api.Globals;

import org.rusherhack.client.api.feature.hud.impl.Direction;
public class Util179 implements Globals {
   public static Object[] f3465 = new Object[53];
   public static String[] f3466 = new String[53];

   @Deprecated
   public static boolean m7325(BlockPos var0) {
      if (!Globals.mc.world.getBlockState(var0).isReplaceable()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Deprecated
   public static boolean m7326(BlockPos var0) {
      int var3 = Class253.m9154();
      BlockPos var4 = var0;
      if (m7325(var0)) {
         return false;
      } else {
         net.minecraft.util.math.Direction[] var7;
         int var5 = (var7 = net.minecraft.util.math.Direction.values()).length;

         int var6;
         for (int var10000 = var6 = 0; var10000 < var5; var10000 = ++var6) {
            net.minecraft.util.math.Direction var8 = var7[var6];
            var0 = var4.add(var8.getVector());
            if (!Globals.mc.world.isAir(var0) && m7327(var0) && (Globals.mc.world.getBlockState(var4).isReplaceable() || var3 != 0)) {
               boolean var10002 = true;
               return true;
            }
         }

         return false;
      }
   }

   @Deprecated
   public static boolean m7327(BlockPos var0) {
      VoxelShape var5;
      if ((var5 = Blocks.OBSIDIAN.getDefaultState().getCollisionShape(Globals.mc.world, var0)).isEmpty()) {
         boolean var10002 = true;
         return true;
      } else {
         return Globals.mc.world.doesNotIntersectEntities(null, var5.offset(var0.getX(), var0.getY(), var0.getZ()));
      }
   }

   @Deprecated
   public static PlayerEntity m7329(Entity var0) {
      return m7332(var0, -1.0F);
   }

   @Deprecated
   public static List<BlockPos> m7330(BlockPos var0, float var1, boolean var2) {
        return null;
    }

   @Deprecated
   public static List<BlockPos> m7331(BlockPos var0, float var1) {
      BlockPos var8 = var0;
      int var10000 = Class253.m9154();
      ArrayList var9 = new ArrayList();
      int var4 = var10000;
      int var6 = var0.getX();
      int var7 = var0.getZ();
      int var11;
      var10000 = var11 = var6 - (int)var1;

      label34:
      while (var10000 <= var6 + var1) {
         int var5;
         var10000 = var5 = var7 - (int)var1;

         while (var10000 <= var7 + var1) {
            double var13;
            var10000 = (var13 = (double)((var6 - var11) * (var6 - var11) + (var7 - var5) * (var7 - var5)) - var1 * var1) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
            if (var4 != 0) {
               continue label34;
            }

            if (var4 == 0) {
               if (var10000 < 0) {
                  BlockPos var10 = new BlockPos(var11, var8.getY(), var5);
                  var9.add(var10);
               }

               var10000 = ++var5;
            }
         }

         var10000 = ++var11;
      }

      return var9;
   }

   @Deprecated
   public static PlayerEntity m7332(Entity var0, float var1) {
      return Globals.mc.world.getClosestPlayer(var0.getX(), var0.getY(), var0.getZ(), var1, var1x -> {
         if (!var1x.equals(var0)) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
   }

   static {
      m194();
   }
   public static void m194() {
      f3465[0] = "D\u000epY\\\u0003X\u0014r\u0005F\u0017H\u00179ɱ";
      f3465[1] = int.class;
      f3466[1] = "java/lang/Integer";
      f3465[2] = "\u0002aY\u001bhD\u0002aNGdK\u0018*NYd^\u001f[\u001c\u0007<\u001a";
      f3465[3] = "(]\u0005g\u000bz#R\u0014(jt(Y\u0010r";
      f3465[4] = boolean.class;
      f3466[4] = "java/lang/Boolean";
      f3465[5] = "|E|}R,`_~!H8p\\5į";
      f3465[6] = "nJm\u000e\f|rPoR\u0016hbS$ɔ";
      f3465[7] = "U\u001cVm\u000e[K\u0014L\"lGL\t";
      f3465[8] = "P\u0014hy\tOP\u0014\u007f%\u0005@J_\u007f;\u0005UM..dW\u001e";
      f3465[9] = "cZP\u0014}UcZGHqZy\u0011GVqO~`\u0012\t(";
      f3465[10] = double.class;
      f3466[10] = "java/lang/Double";
      f3465[11] = "\b\u0018\u0018\u0017L\u0017\u0016\u0010\u0002X\u0004\u0017\f\u001a\u001a\u001f\r\fL)\u001c\u0013\u0006\u000b\u0001\u0018\u001a\u0013";
      f3465[12] = "m)\u0001$B>m)\u0016xN1wb\u0016fN$p\u0013D<\u001a`";
      f3465[13] = "V\u000f\u001c\u007fu;J\u0015\u001e#o/Z\u0016U2k'\\\u0013\u000f\u007ff>PS<=h,X\u0011\b";
      f3465[14] = "JbQ\fk\u0007JbFPg\bP)FNg\u001dWX\u0016\u00136";
      f3465[15] = float.class;
      f3466[15] = "java/lang/Float";
      f3465[16] = "\u0007R4Ml#\u0007R#\u0011`,\u001d\u0019#\u000f`9\u001ahrU9z";
      f3465[17] = "[\u0005Fz_>[\u0005Q&S1ANQ8S.F?\u0000b\u0007";
      f3465[18] = "NJl\u001f8uNJ{C4zT\u0001{]4oSp*\u0003a$";
      f3465[19] = "V(\trFxV(\u001e.JwLc\u001e0JbK\u0012On\u001f'";
      f3465[20] = "\u0013(;\u0004O\u0006\u0013(,XC\t\tc,FC\u001c\u000e\u0012~\u0013\u0010]";
      f3465[21] = "4\u0015\u0013X(\u001b4\u0015\u0004\u0004$\u0014.^\u0004\u001a$\u0001)/UEpB";
      f3465[22] = "5us\f(s\u0003Ps\f?/\u000f_iG?1\u000fJn6nn[\t&";
      f3465[23] = "_B\u0016\u0015V\u001c_B\u0001IZ\u0013E\t\u0001WZ\u0006BxP\b\u0003G";
      f3465[24] = "c\u0004\u007fG'0&\tr\u0004N70\u0007|\u001a\"\u0005mE%DNk \nu\u0016(b&\u001by}$/7\u0006x\u0016<i=J\u001cG<64\u0017`G0-l{";
      f3465[25] = "t\u000e\rI\u0019\fs\t\u0003\fi\u0011sUA\u001e\u0012otS_\u0002S\u000b#OY\ri";
      f3465[26] = "#^9Tmm&X5\u0011\u0014vrSH\u0014xpz\u0001._{/e?r\\pvrCrPk.\u001e";
      f3465[27] = "qg/sz\u0014zw5\u001dվrx\u007f5$o\u000e )/g\u001e";
      f3465[28] = "K`I>\u000b)@pSPȶOBxSi\u001e3\u001a.I*o";
      f3465[29] = "/$K)2yj)Fj[~|'Ht7L!e\u0010/[$ '\u0011lkq+#K\u0013d*mbW#1!i8(,jg($\u0018yacr[\u0017\"'\"nkB)#x\u0011k\u0019sc!(eQx=\u001b!$\u0015o$|l8Uz[";
      f3465[30] = "V!bM@6_'sA+5\u0002 sCG\u0007Ug(\u001e\u0012PPmo\u001dT`\u0005fkG+";
      f3465[31] = "8(EdIT1.Th\"Wl)TjNe;n\u000f4\u001d2>dH4]\u0002koLn\"";
      f3465[32] = "\u001e7\u0017<\f\u0018B%]00ǰ%q\u001etRI\u001dw\u001akZ\"\u001f=Ce\\^\u001f1X=0";
      f3465[33] = "ebM B%5cR?+3hiR-|d19\ny+6m:P?W&ggU";
      f3465[34] = "HdB_^c\u0014v\bSbԚs%\u000f\u001e\u000b2\u0015,\t\u000f\u0007Y\u0019%L\u0000Z3\be\u000e\u0011bi\f!\u000e\u0010\u0005$\u0010a\u001bo";
      f3465[35] = "{zcKZ4}~|C1i(?{N][|{!\u0017\n\f|){\u0010@p$\u007faS1";
      f3465[36] = "|@R$\n\u0016(\u0006\u0019lj\u0016,WGq=As\n\u001c\u001dT\u0007.\u0000J\u007f\u0011\n#C";
      f3465[37] = "6yys<\u00065lih\r\u00111kvha#f),55t1/'w7\u001d&kwk\rJeotd5Lap|\u000fg\t6jrd\u007fO<&\u0016";
      f3465[38] = ",:A(\u0002|//Q33k+(N3_Yzi\u0012k\u000f\u000e|&J=_r|*Qe3";
      f3465[39] = "y2u<,\b% ?0\u0010[Bv\"~-\u0003<w,ch2~-71!L\u007f#*t\u0010";
      f3465[40] = "\u0017\u000f$4'/\u000fI.xC!\u0010\u000e../\u0013DKwqC~\u000f\u0016'%?~\u0003\r\u007fI";
      f3465[41] = "M\u0006\u0004\u0014T+J\u0001\nQ$-NEUIH\u001f\u001a\u0001\f\u0010\u001fHL\u0002U@^\"REO\u0014$";
      f3465[42] = "#hP\u0002+cfe]ABdpkS_.V-,\t\u0000B?$oQSz9 pY8(ork\u0002J+zbp3";
      f3465[43] = "4bB\u0006H.$h\u001f\u0003672z\u001c\u0007Z\u0005n;B\\681i\u0000QD;$y\u001b`";
      f3465[44] = "qoXQqa4bU\u0012\u0018f\"l[\ftTu*\u0000W'\u0003q)C\ts;w-\\\u0001\u00189=tR\u0007d91o\nk";
      f3465[45] = " ]'\u001e~X)[6\u0012\u0015[t\\6\u0010yi#\u001bmN%>&\u0011*Nj\u000es\u001a.\u0014\u0015";
      f3465[46] = "C.\u000e>1]\u0003$\u001c1U[\u0019BD)$\u0007\u0012,\u0010ooO";
      f3465[47] = "IH+\u0014R,Q\u000e!X6\"NI!\u000eZ\u0010\u001a\rpW6x\u0012Ix\u0016\u0006-\u0019M\"i\tv_\f>Y\\}[VAV\u0007;\u001aJq\u0003\f?@5+\u0014\\:G^3RVv#";
      f3465[48] = "Pa.-ADVe1%*\u0019\u0003$6(F+W`lq\u0012|W26v[\u0000\u000fd,5*";
      f3465[49] = "\u0018FCj \u0005\u0011@RfK\u000eXF[g0c\u001bW]gu\u0005PT\u0002xKYS_[o7Y_D\u0003\u0003";
      f3465[50] = "w\u0011\u0015\u0011\u000f\u007fq\u0015\n\u0019d\"$T\r\u0014\b\u0010p\u0010WMXGpB\rJ\u0015;(\u0014\u0017\td";
      f3465[51] = "LH\u0004Y\u0015\u000b\u0010ZNU)Ոw\u000e\r\u0011KZO\b\t\u000eC1MBP\u0000EMMNKX)";
      f3465[52] = "\u000e\u001cHv%%\b\u0018W~Nx]YPs\"J\t\u001d\b$w\u001d_\u001ePz4wAYJ.N#\t]R\u007fv%\rBZ\u0014";
   }
}
