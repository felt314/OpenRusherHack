package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.ChunkSectionPos;
import net.minecraft.world.chunk.WorldChunk;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.system.IChunkProcessor$Processee;

import org.rusherhack.client.api.feature.module.impl.render.ESP;
public class Class138 implements IChunkProcessor$Processee {
   public static long f2920 = Class066.m4320(2170637631495904531L, -8968319949746569477L, MethodHandles.lookup().lookupClass()).m4325(237010710163042L);
   public static long[] f2921;
   public static Integer[] f2922;
   public static Object[] f2924 = new Object[64];
   public static String[] f2925 = new String[64];

   @Override
   public boolean isActive() {
        return false;
    }

   public Class138() {
   }

   @Override
   public void process(ChunkPos var1, boolean var2) {
        
    }

   public boolean m6317(BlockPos var1, BlockPos var2) {
      boolean var10000;
      if (Globals.mc.world.getBlockState(var1).isAir() && Globals.mc.world.getBlockState(var2).isAir()) {
         var10000 = true;
         boolean var22 = true;
      } else {
         var10000 = false;
         boolean var10002 = true;
      }

      boolean var9 = var10000;
      if (!var9) {
         return false;
      } else {
         if (Globals.mc.world.getBlockState(var1.up()).isSolid() && Globals.mc.world.getBlockState(var2.down()).isSolid()) {
            var10000 = true;
            boolean var24 = true;
         } else {
            var10000 = false;
            boolean var23 = true;
         }

         boolean var10 = var10000;
         if (!var10) {
            return false;
         } else {
            if (Globals.mc.world.getBlockState(var1.east()).isSolid() && Globals.mc.world.getBlockState(var1.west()).isSolid()) {
               var10000 = true;
               boolean var26 = true;
            } else {
               var10000 = false;
               boolean var25 = true;
            }

            boolean var11 = var10000;
            if (Globals.mc.world.getBlockState(var1.north()).isSolid() && Globals.mc.world.getBlockState(var1.south()).isSolid()) {
               var10000 = true;
               boolean var28 = true;
            } else {
               var10000 = false;
               boolean var27 = true;
            }

            boolean var7 = var10000;
            if (Globals.mc.world.getBlockState(var2.east()).isSolid() && Globals.mc.world.getBlockState(var2.west()).isSolid()) {
               var10000 = true;
               boolean var30 = true;
            } else {
               var10000 = false;
               boolean var29 = true;
            }

            boolean var13 = var10000;
            if (Globals.mc.world.getBlockState(var2.north()).isSolid() && Globals.mc.world.getBlockState(var2.south()).isSolid()) {
               var10000 = true;
               boolean var32 = true;
            } else {
               var10000 = false;
               boolean var31 = true;
            }

            boolean var8 = var10000;
            if (var11 && var7 || !var11 && !var7) {
               var10000 = false;
               boolean var34 = true;
            } else {
               var10000 = true;
               boolean var33 = true;
            }

            boolean var14 = var10000;
            if (var13 && var8 || !var13 && !var8) {
               var10000 = false;
               boolean var36 = true;
            } else {
               var10000 = true;
               boolean var35 = true;
            }

            boolean var12 = var10000;
            if (var14 && var12) {
               boolean var37 = true;
               return true;
            } else {
               return false;
            }
         }
      }
   }

   static {
   }
   public static void m122() {
      f2924[0] = "B\u007fjz(b^eh&2vNf#ɒ";
      f2924[1] = int.class;
      f2925[1] = "java/lang/Integer";
      f2924[2] = "\\\u0004GVet\\\u0004P\ni{FOP\u0014inA>\u0002A:.";
      f2924[3] = "\u0012#D/:/\u0012#Ss6 \bhSm65\u000f\u0019\u00041`p";
      f2924[4] = "1Bs^\"\u0016-Xq\u00028\u0002=[:Ń";
      f2924[5] = "Z8t1]aF\"vmGuV!=ɫ";
      f2924[6] = "3%z\u007fM63%m#A9)nm=A,.\u001f<b\u0013g";
      f2924[7] = "1^(G\u0000-/V2\bb1(K";
      f2924[8] = "\"T2\u0012CG)[#]\"I\"P'\u0007";
      f2924[9] = boolean.class;
      f2925[9] = "java/lang/Boolean";
      f2924[10] = "r`\fzyFr`\u001b&uIh+\u001b8u\\oZJl%\u0017";
      f2924[11] = "{)<Y<ZM\f<Y+\u0006A\u0003&\u0012+\u0018A\u0016!czL\u0012Si";
      f2924[12] = "\u0014U\u001fh#_\u0014U\b4/P\u000e\u001e\b*/E\toYpv\u0006";
      f2924[13] = "[}A)XK[}VuTDA6VkTQFG\u0007?\u0007\u0014";
      f2924[14] = "\u001eq&8l/\u001eq1d` \u0004:1z`5\u0003Kd%9";
      f2924[15] = "\u0000?%@/\u001a\u0000?2\u001c#\u0015\u001at2\u0002#\u0000\u001d\u0005b_r";
      f2924[16] = "a\u0004QA\u0011!}\u001eS\u001d\u000b5m\u001d\u0018Ѯ";
      f2924[17] = "X\u001b\b]^\rn>\b]IQb1\u0012\u0016IOb$\u0015g\u0018\u00100o]";
      f2924[18] = "\u000e\u0017@>W\u001c\u0010\u001fZq\u001f\u001c\n\u0015B6\u0016\u0007J&D:\u001d\u0000\u0007\u0017B:";
      f2924[19] = "&\u001dT\u0007]4:\u0007V[G *\u0004\u001dJC(,\u0001G\u0007N1 AtE@#(\u0003@";
      f2924[20] = "\u001f\r\u0004/\u000b\u001e\u0003\u0017\u0006s\u0011\n\u0013\u0014Mʟ";
      f2924[21] = "\u0012zf\u001c\u0001\u000b\u000e`d@\u001b\u001f\u001ec/Q\u001f\u0017\u0018fu\u001c\u0012\u000e\u0014&gW\u0012\n\bzd\u001c\u001e\u0011\u0019}mW]*\u0012of^\u0016\u001f\u001fdd\u007f\u001c\u001a\bdd";
      f2924[22] = "2N&$XM9A7k4N7C5$\u0018";
      f2924[23] = "c\u0018Nrs\u0017\u007f\u0002L.i\u0003o\u0001\u0007?n\u0010iDZ9u\u0016e\u0004NrC\rc\u0006L=o1i\u001e]5o\u0005";
      f2924[24] = "8=\u000e\u0018\u0010.$'\fD\n:4$GU\r)2a\u001aS\u0016/>!\u000e\u00181>#;\u0000X\u0005";
      f2924[25] = "\r\rWlBBQWS/~Y\\[nk\u000e\\YMW<\u000e\u000f\r7P,\u0015PB[S5\u001e\u00010";
      f2924[26] = "a>W+W3i2^\u0013ԆQ=c\u0004c\u0001<m:\u000enf";
      f2924[27] = "\u00017(j[]\t;!Rȳ?]j{\"\rR\r3q/j";
      f2924[28] = "UuLpZv\u0006p\u0014!;+\u00075\u0013+W\u0019SsKt\u0005NZs\u0003)R?\u0017 \u0014>;";
      f2924[29] = ";:N\u000b\n1`aUWeolxMV\t]84\u0013\u000eX\n8?NA\u0002ghfDLe3:g]V\bccmP1";
      f2924[30] = "0d\u0014kd-0wJ`^<&F\u001ch190v{9$6=h\u0017:==l\u001a";
      f2924[31] = "\u0003ni(X%N~ep1-R{b-]\u001f\u0006?:z\rH\u0003ni(X%N~ep1";
      f2924[32] = "m|QD}I:<\u0007F\u0004F0pZFht`5\u0001\u001f;#cvQAvO`oZ\u0010\u0004";
      f2924[33] = "m\u001eN\rAN?\u001bZ\u001d0\u00121_Q\u0011\\ g\u0013\u000bG\nwbYZ\u0016B\u001ba@QG0";
      f2924[34] = "ZxP\u0004\u001c\u0019\u001e<[\u0007\u007fHa\u007f\u001a\u001d\u0003L\u00051H\u000f\u0007!]xJ\n\u0012E\u0013*X\u000e\u007f";
      f2924[35] = "\u0019\u0001V,\u0002WT\u0011Ztk_H\u0014])\u0007m\u001cP\u0005~T:\u001cS^>\fWL\nT3k\u0006L\u0003_'\u0006K\\\u000f\u0007N";
      f2924[36] = "\u0019%(p9 H 'oU=\u001d`*j9\u000f@ {2UaK\u007f:j81\u0012u7\rlc\u0013l-`<:\u0019aJ2igL}ral?\u001d\u001c";
      f2924[37] = "!O*b\t\u0015l_&:`\u001dpZ!g\f/$\u001e{>[x$\u001d\"p\u0007\u0015tD(}`";
      f2924[38] = ")\f*%U\rs\f\":4\u000e\"[<9cY}\u0006gU]Y!K4-\f\\.T";
      f2924[39] = "\u0018\u0018y_\u0005\\AHa\u001d>H\u0015U[\bZZ\u0015)8\u0011RN\u0002\u0010o\u0011\u0001\u001ax";
      f2924[40] = "-hJQL\u00167{UW6\bG?]\\T\u000f*rMP\ffyy_WD\nz`T\u00066\r-<QZO\u0007%{T7";
      f2924[41] = "UXkKHj\u0018Hg\u0013!b\u0004M`NMPP\t8\u0016\u0011\u0007UXkKHj\u0018Hg\u0013!";
      f2924[42] = "P\u001eHp(i\u0003\u001b\u0010!I4\u0002^\u0017+%\u0006V\u0018MvrQQX\u001c,;=RA\u0017}I";
      f2924[43] = "'w%gz&tr}6\u001b{u7z<wI#r$c#\u001e!py+|sq)s&\u001b";
      f2924[44] = "\u001bU?uFX_\u00114v%\u0381 R'lG\tM\u001f7`\u001f`\u001c\u0007%eL\rQ\u0017)=%^Z\u0005.uI]C\u000e\u007f\u0007";
      f2924[45] = "~z'=.=z|l|So&w3h\u00040~*n\u0004j:$j0i:c.g";
      f2924[46] = "@d\"A\u0019Z\u001c>&\u0002%R\u0010;|\u0005Hi\u0013^p\u001aG\u0018E0%\u0007G\u0018}`a\u0010EZ\u0011cx\u001b\u0014(";
      f2924[47] = "\u001e9l{7\u0017\u001a?':JEF4x.\u001d\u001a\u001ei$Bs\u0010D){/#IN$";
      f2924[48] = "\u001fewm\u000f\tRu{5f\u0001Np|h\n3\u001a4$0Zd\u001fewm\u000f\tRu{5f";
      f2924[49] = "\u0002DNHQOU\u0004\u0018J(@_HEJDr\b\n\u001f\u0014\u0015%\fNNMZI\u000fWE\u001c(";
      f2924[50] = "ce/\\/<2` CC!g -F/\u0013:gw\u0019Cxc7/H.5s;w!s4a94K$t7;M";
      f2924[51] = "\f34\u0014VpA#8L?x]&?\u0011SJ\tbgG\u0002\u001d\f34\u0014VpA#8L?";
      f2924[52] = "8W-s@W'Gy%/C1Yw'FO\bWw7B)hDx*]Ek]s{/";
      f2924[53] = "9d)lH3(x($s(>\u0004<n\u0001=4ifn\t\"";
      f2924[54] = "Z8!C9U\u0017(-\u001bP]\u000b-*F<o_ir\u001fo8Z8!C9U\u0017(-\u001bP";
      f2924[55] = "\u0007=@@\u000fGT8\u0018\u0011n\u001aU}\u001f\u001b\u0002(\b:EDnCQj\u001d\u0015\u0003\u000eAfE|^\u000fSd\u0006\u0016\tO\u0005f\u007f";
      f2924[56] = "I\u0018tQz\u0019M^ DEɀ$I!V+DFMg\u0002>";
      f2924[57] = "ys&m\u00154}5rx*Ҕ\u0014ru:\u0010jf./>S";
      f2924[58] = "&r])F:\"4\t<yºK!\u000fxG*;t\n:@";
      f2924[59] = "A\u0019B43\u0019\f\tNlZ\u0011\u0010\fI16#DH\u0013hbtDKJ&=\u0019\u0014\u0012@+Z";
      f2924[60] = "|Y\u0010\u0014\u0019L/\\HEx\u0011.\u0019OO\u0014#x\\\u0011\u0010Btz^LX\u001f\u0019*\u0007FUxMx\u0006_O\u0015\u001d!\fR(";
      f2924[61] = "@w\u0018AV&\rg\u0014\u0019?.\u0011b\u0013DS\u001cE&K\u001c\u0005K@w\u0018AV&\rg\u0014\u0019?";
      f2924[62] = "=1j'lun42v\r(oq5|a\u001a94k#2M;66kj ko<f\r";
      f2924[63] = "z$0\u001fxC74<G\u0011K+1;\u001a}y\u007fucM/.\u007fv8\rvC//2\u0000\u0011\u0012/&9\u0014|_?*a}";
   }
}
