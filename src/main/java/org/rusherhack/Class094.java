package org.rusherhack;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.rusherhack.client.api.Globals;

import org.rusherhack.client.api.feature.module.impl.render.ESP;
public class Class094 implements Class228 {
   public BlockEntity f2268;
   public static Object[] f2271 = new Object[55];
   public static String[] f2272 = new String[55];

   @Override
   public Box m5076() {
      VoxelShape var5;
      return (var5 = this.f2268.getCachedState().getOutlineShape(Globals.mc.world, this.f2268.getPos())).isEmpty()
         ? VoxelShapes.fullCube().getBoundingBox().offset(this.f2268.getPos())
         : var5.getBoundingBox().offset(this.f2268.getPos());
   }

   @Override
   public int m5077() {
        return 0;
    }

   @Override
   public String getName() {
      return Text.translatable(Registries.BLOCK_ENTITY_TYPE.getId(this.f2268.getType()).toTranslationKey()).getString();
   }

   public Class094(ESP var1, BlockEntity var2) {
    }

   @Override
   public Vec3d m5078() {
      return this.f2268.getPos().toCenterPos();
   }

   public BlockEntity m5079() {
      return this.f2268;
   }

   static {
      m122();
   }
   public static void m122() {
      f2271[0] = "AnJ,;\fAn]p7\u0003[%]n7\u0016\\T\t;dV";
      f2271[1] = "@:|!Bo@:k}N`ZqkcNu]\u0000:<\u0018>";
      f2271[2] = "\u0015MJ;f;\u001eB[t\u00075\u0015I_.";
      f2271[3] = "z\rEDX\u0015z\rR\u0018T\u001a`FR\u0006T\u000fg7\u0003S\u0003L";
      f2271[4] = "5r\u0018oi\u001a5r\u000f3e\u0015/9\u000f-e\u0000(H^t<E";
      f2271[5] = "9d\u001d\"tl9d\n~xc#/\n`xv$^[9 4";
      f2271[6] = "}QN50Rv^_zMJeYV3";
      f2271[7] = "*pzDy\u000e*pm\u0018u\u00010;m\u0006u\u00147J<_\"V";
      f2271[8] = "_k\u001c1B-_k\u000bmN\"E \u000bsN7BQ]-\u001at";
      f2271[9] = "%d\u0006px59~\u0004,b!)}O\u0083";
      f2271[10] = "d\u0019he\u0011)d\u0019\u007f9\u001d&~R\u007f'\u001d3y#.~E";
      f2271[11] = "5DcN5.5Dt\u00129!/\u000ft\f94(~%Vm";
      f2271[12] = boolean.class;
      f2272[12] = "java/lang/Boolean";
      f2271[13] = "\u0015\u0001\b\u0004\u00071\u0015\u0001\u001fX\u000b>\u000fJ\u001fF\u000b+\b;N\u0019R";
      f2271[14] = "Wq'%*\u0004Wq0y&\u000bM:0g&\u001eJKa8tU";
      f2271[15] = "SMnG\n:OWl\u001b\u0010._T'ɯ";
      f2271[16] = int.class;
      f2272[16] = "java/lang/Integer";
      f2271[17] = "_p\u0002\u000bA&_p\u0015WM)E;\u0015IM<BJD\u0013\u0014\u007f";
      f2271[18] = "(`\u000f0*9(`\u0018l&62+\u0018r&#5ZJ'ub";
      f2271[19] = "O\u0016\\NuIS\f^\u0012o]C\u000f\u0015\u0003kUE\nONfLIJ|\fh^A\bH";
      f2271[20] = "~\"7bkJ~\" >gEdi  gPc\u0018p}6";
      f2271[21] = "\u0005\u0011AdBt\u0005\u0011V8N{\u001fZV&Nn\u0018+\u0003y\u0017";
      f2271[22] = "**(0]a60*lGu&3aɪ";
      f2271[23] = "G**\u0007RzG*=[^u]a=E^`Z\u0010l\u001d\f";
      f2271[24] = "j,RkFov6P7\\{f5\u001bǻ";
      f2271[25] = "A* L\u001eW]0\"\u0010\u0004CM3i˼";
      f2271[26] = "t-},]\u000eh7\u007fpG\u001ax44a@\t~qig[\u000fr1},j\u0015n2Ig[\u000fr1}";
      f2271[27] = "6l\u000f~)[*v\r\"3O:uF37G<p\u001c~:^00\u001b)(Z<sF\u00134B6l\u001bt\u0018A5q\u001a\u001d4J<";
      f2271[28] = "XsN\u00012eEf\u0016#sh]`";
      f2271[29] = "f;u\"\u00115z!w~\u000b!j\"<o\f2lgai\u00174`'u\"0%}={b\u0004";
      f2271[30] = "2u/\u000f\u0001\u00163'3Yk\u000fn4,P\u0007=2yr7Z\u0016mq([\u0001\u001bi8L\u0006V\t;\"0\u0007\u0004\u0015mH";
      f2271[31] = "5hQ2\u0013_!tA%pɠ\\r\u001d#\u0001\\lyFc\u00199";
      f2271[32] = "\u0011NY2P]G\u0017\r>,@FW\u0000>@r\u0017\u0011Xh\u0010%\u0017R\u00039VN\u0010D\r+,";
      f2271[33] = "5 >(3J>5~sNI37.-\"{duts~,2q!.7A?*s2N\u001d\"%w.\"F/!>J~F`/~-3\u0010nsN";
      f2271[34] = "!A=FgP\"Y{K\u0007ѺNK B{[%H8\u0004v";
      f2271[35] = "\u000f\u001bK\u007f7L\u000b\u0018Z)[ƿ1\u001dO8=SHL\b+'";
      f2271[36] = "F\u0006qF;B\u0017Ab\\Jԋ&\u001bfO)D^\u0001`Q ";
      f2271[37] = "+:\u0015\u001c\u0011nv%K\u0005`|{7)\u0001\u001arp$rA\u0019pv1\u0019F\u000f~dK";
      f2271[38] = "wm}(\u0012<z|t+.8{nyyyo$3\"\u0015C2{~~rLk#j";
      f2271[39] = "Li\u001dZ\u0010d\u0001?\u0013\u0006 f\u0011\u007fCYLTE:\u001b\u0001 2A`\u001bT\\3\u0013|M>";
      f2271[40] = "E{\u0004omZAx\u00159\u0001]{s\u00069y\r@,\u0015j`4\u0015g\u0011,8\u000fJtB5\u0001";
      f2271[41] = "Cj\u0016o\u0000\u0018\u001b<\u0012|r\u0013M{7|\u0016\u0001M\u0007Pk\u0015\u0002@?Un\u000f\u0018 ";
      f2271[42] = "\u0017hh]^sHcd\r' \u0018vNsmO\u001f;hMB\u007f\u0014`(U'";
      f2271[43] = "k\u000eU\u0002\u0001zd\u0002G\u0014b.8\u0002L\u001d\u000e\u001clF\u0013Eb{?@HJ\u00056iN\u0014z";
      f2271[44] = "\u007f\u000f\u0016~2Up\\T\u001c;L}\u0004CKi\u0014)P\u0016\u001clA\u007f\u0006\u001f\"lR.\u001c";
      f2271[45] = "kwr\u001f^E&!|CnG6a,\u001c\u0002ub$uCn\u0012$g#\u0000\u000fCaz6{";
      f2271[46] = "DEt\u00067ODV%\u001c\u0007\u0014\u0010U{\u0007k&D\u0011!Z>qDW|\u001egIARf\u0004\u0007K\u0018\u0010p\u001c\u007f\u001dAD|`";
      f2271[47] = "kxph\":9.7sF#=<oq*\u0011iy7/yFlz5v?,. m|F";
      f2271[48] = "\\Nx3-e\u001aJ)hTc\f]wd8Q]\u001a+<m\u0006]Xtc.mZNzqT;\u0010Fvr)f\u000f\u0018o\u0003";
      f2271[49] = "\u0019K.\u001br&\u0017\u0002 \u0011\u0011|\u001e2$\u0004q$IX)\u0015x'";
      f2271[50] = "\u000b\"`\b2:\u000f!q^^Ğ5\u007f L 0I-v\u000b;";
      f2271[51] = "bK'c6-9F#*R$>K)=>\u0016o\ttgbA<\u000e%>=?6T30R";
      f2271[52] = "%G h!jw\u0011gsEss\u0003?q)A'Fg/}\u0016u\u0014/t8p~\u0001o/E";
      f2271[53] = "\u0017\u0019\u0013\u001e)W\u0014\u0001U\u0013IS\u0015\u0000!\u0006.W\u001b1\r\u001e(@\t7\f\u0006.FxGS\u001d7X\u0004\u0015\u0005Z,<\u001aG[\u001f\"W@\u001c\u0017\u0018I^\u001a\u0000\n\u001bu\u0001\u0011\fZb";
      f2271[54] = "yS\u001aCmh+\u0005]X\tq/\u0017\u0005ZeC{R]\u00047\u0014s\u0017\u000b\u0004mx(\u001a\u000fM\t";
   }
}
