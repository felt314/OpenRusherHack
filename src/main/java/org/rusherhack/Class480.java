package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.rusherhack.client.api.Globals;

import org.rusherhack.command.peek;
public class Class480 {
   public static int f7735;
   public static long f7736 = Class066.m4320(-1936421170134825114L, -6384124475669149990L, MethodHandles.lookup().lookupClass()).m4325(18612596489612L);
   public static long[] f7737;
   public static Integer[] f7738;
   public static Object[] f7740 = new Object[54];
   public static String[] f7741 = new String[54];

   public static void m14979(Class153 var0, float var1, float var2, float var3, float var4) {
      var0.m6727(var1, var2).m6735();
      int var9 = var0.m6727(var1, var4).m6735();
      int var8 = var0.m6727(var3, var2).m6735();
      int[] var10003 = new int[]{var9, 0};
      boolean var10007 = true;
      var10003[1] = var8;
      var0.m6723(var10003);
      var0.m6727(var3, var4).m6735();
   }

   public static void m14980(Class153 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      var0.m6724(var1, var2, var3).m6738(var10).m6735();
      var0.m6724(var4, var5, var6).m6738(var10).m6735();
      var0.m6724(var7, var8, var9).m6738(var10).m6735();
   }

   public static void m14981(Class153 var0, Vec3d var1, Vec3d var2, int var3, MatrixStack var4) {
      Vec3d var7 = Globals.mc.getEntityRenderDispatcher().camera.getPos();
      Matrix4f var15 = var4.peek().getPositionMatrix();
      Matrix3f var8 = var4.peek().getNormalMatrix();
      Vector3f var10 = new Vector3f((float)(var1.x - var7.x), (float)(var1.y - var7.y), (float)(var1.z - var7.z));
      Vector3f var14 = new Vector3f((float)(var2.x - var7.x), (float)(var2.y - var7.y), (float)(var2.z - var7.z));
      Vector4f var17 = var15.transform(new Vector4f(var10, 1.0F));
      Vector4f var16 = var15.transform(new Vector4f(var14, 1.0F));
      Vector3f var11 = var10.sub(var14, new Vector3f()).normalize();
      Vector3f var12 = var8.transform(var11, new Vector3f());
      m14984(var0, var17.x, var17.y, var17.z, var16.x, var16.y, var16.z, var12.x, var12.y, var12.z, var3);
   }

   public static void m14982(
      Class153 var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13
   ) {
      int var17 = var0.m6724(var1, var2, var3).m6738(var13).m6735();
      int var18 = var0.m6724(var4, var5, var6).m6738(var13).m6735();
      var0.m6724(var7, var8, var9).m6738(var13).m6735();
      int[] var10004 = new int[]{var18, 0};
      boolean var10008 = true;
      var10004[1] = var17;
      var0.m6723(var10004);
      var0.m6724(var10, var11, var12).m6738(var13).m6735();
   }

   public static void m14983(Class153 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      var0.m6727(var1, var2).m6738(var7).m6735();
      var0.m6727(var3, var4).m6738(var7).m6735();
      var0.m6727(var5, var6).m6738(var7).m6735();
   }

   public static void m14984(Class153 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      var0.m6724(var1, var2, var3).m6738(var10).m6733(var7, var8, var9).m6735();
      var0.m6724(var4, var5, var6).m6738(var10).m6733(var7, var8, var9).m6735();
   }

   public static void m14985(Class153 var0, float var1, float var2, float var3, float var4, int var5) {
      var0.m6727(var1, var2).m6738(var5).m6735();
      int var9 = var0.m6727(var1, var4).m6738(var5).m6735();
      int var10 = var0.m6727(var3, var2).m6738(var5).m6735();
      int[] var10003 = new int[]{var9, 0};
      boolean var10007 = true;
      var10003[1] = var10;
      var0.m6723(var10003);
      var0.m6727(var3, var4).m6738(var5).m6735();
   }

   public static void m14987(Class153 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      int var10 = var0.m6724(var1, var2, var3).m6738(var7).m6735();
      int var11 = var0.m6724(var4, var2, var6).m6738(var7).m6735();
      int var12 = var0.m6724(var4, var2, var3).m6738(var7).m6735();
      int[] var10011 = new int[]{var10, 0};
      boolean var10015 = true;
      var10011[1] = var11;
      var0.m6723(var10011);
      int var16 = var0.m6724(var1, var2, var6).m6738(var7).m6735();
      int var13 = var0.m6724(var1, var5, var3).m6738(var7).m6735();
      int var14 = var0.m6724(var4, var5, var6).m6738(var7).m6735();
      int var19 = var0.m6724(var4, var5, var3).m6738(var7).m6735();
      int[] var10006 = new int[]{var13, 0};
      boolean var10010 = true;
      var10006[1] = var14;
      var0.m6723(var10006);
      int var17 = var0.m6724(var1, var5, var6).m6738(var7).m6735();
      int[] var10004 = new int[]{var10, 0, 0, 0, 0, 0};
      boolean var10008 = true;
      var10004[1] = var13;
      var10004[2] = var12;
      var10004[3] = var13;
      var10004[4] = var19;
      var10004[5] = var12;
      var0.m6723(var10004);
      int[] var10003 = new int[]{var10, 0, 0, 0, 0, 0};
      boolean var10007 = true;
      var10003[1] = var13;
      var10003[2] = var16;
      var10003[3] = var13;
      var10003[4] = var17;
      var10003[5] = var16;
      var0.m6723(var10003);
      int[] var10002 = new int[]{var11, 0, 0, 0, 0, 0};
      boolean var20 = true;
      var10002[1] = var14;
      var10002[2] = var16;
      var10002[3] = var14;
      var10002[4] = var17;
      var10002[5] = var16;
      var0.m6723(var10002);
      int[] var10001 = new int[]{var11, 0, 0, 0, 0, 0};
      boolean var10005 = true;
      var10001[1] = var14;
      var10001[2] = var12;
      var10001[3] = var14;
      var10001[4] = var19;
      var10001[5] = var12;
      var0.m6723(var10001);
   }

   public static void m14988(int var0) {
      f7735 = var0;
   }

   public static int m14989() {
      return f7735;
   }

   public static int m14990() {
      int var0 = m14989();
      return var0 == 0 ? 35 : 0;
   }

   static {
   }
   public static void m122() {
      f7740[0] = "\u0016\u0007>&xp\n\u001d<zbd\u001a\u001ewŘ";
      f7740[1] = int.class;
      f7741[1] = "java/lang/Integer";
      f7740[2] = float.class;
      f7741[2] = "java/lang/Float";
      f7740[3] = "\u0002H\u0018\u000b,l\u001eR\u001aW6x\u000eQQь";
      f7740[4] = void.class;
      f7741[4] = "java/lang/Void";
      f7740[5] = "\u001c\u00069\nDY\u0017\t(E9A\u0004\u000e!\f";
      f7740[6] = "\"C{veH>Yy*\u007f\\.Z2Ȭ";
      f7740[7] = char.class;
      f7741[7] = "java/lang/Character";
      f7740[8] = "\u0012_";
      f7740[9] = "dB}h\u007fuf\\4\u000btnyYbrs";
      f7740[10] = "nmJI)\u0010ls\u00031&\u001cup_S%";
      f7740[11] = "&|\u000e\u00035O&|\u0019_9@<7\u0019A9U;FN\u001c`\u0012";
      f7740[12] = ">\u0003Ix@T>\u0003^$L[$H^:LN#9\u000fb\u001e";
      f7740[13] = "}\u0018%\u0018|\u0014\u007f\u0006l`s\u0018f\u00050\u0005p";
      f7740[14] = "@O\u001e7\u0002\u0012BQWO\r\u001e[R\u000b*\u000e\u001e";
      f7740[15] = "\u00074SwL\r\u00074D+@\u0002\u001d\u007fD5@\u0017\u001a\u000e\u0013l\u0019SM2K8R\u00176e\u0011o\u0014";
      f7740[16] = "Bc<!\u0014K@}uB\u001fP_x#<\u0018";
      f7740[17] = "P7}\u0011g/P7jMk J|jSk5M\r=\n2q";
      f7740[18] = "?{.uN\r?{9)B\u0002%097B\u0017\"Aij\u0013";
      f7740[19] = "aP\u00136\tGaP\u0004j\u0005H{\u001b\u0004t\u0005]|j_!\\";
      f7740[20] = double.class;
      f7741[20] = "java/lang/Double";
      f7740[21] = "U\u0001JUA\u0010I\u001bH\t[\u0004Y\u0018\u0003\u0018_\f_\u001dYUR\u0015S]j\u0017\\\u0007[\u001f^";
      f7740[22] = "]XiF\u0007\u0019VWx\tf\u0017]\\|S";
      f7740[23] = "\u001bmv|+\u0014Ef#\u0010ӹ$Bn;zs\u0018@y#vM";
      f7740[24] = "I7~pw\u001d\u001aqv/NG\u001b2\u007f/\"uO\u007f$rp\"F/}+*^O\u007fs0N";
      f7740[25] = "r\u001aoe\b]r\u0001x{uD$\u000e~|\u0015 p\u0002cjK\u001cr\u0015{fu";
      f7740[26] = "\bBJ$&.@\u001b\\7[2DA h#9AL\u001a7;4\u0000+\u0011014DLYi''9\u001aI3&4^R\u0010%5I";
      f7740[27] = "\u000f\u0006O!\u00104\u0017\u0013Nsv5\u000b\u001eT-\u001a\u0007\\Y\u000btLP\f^\u000bu\u0014*[SY{v";
      f7740[28] = "Ruz\u0006\u0019,R'c\fr5TddZ\u001e\u0007\u0003#;\u0003JPP|\u007fV\u00144Hi~\u0004r";
      f7740[29] = "+o[\u001cyH3zZN\u001fI/w@\u0010s{x0\u001fI&,|r\u0010\t\u007fJxh\u001fK\u001f";
      f7740[30] = "u(B@\u000e2e1\fIvgs,]D\u001aU'm\u0003\u001avncl\u0000NN}y<V#";
      f7740[31] = ")HuW1#wC ;ʼ\u0013pK8Qi/r\\ ]Ws \u001e&]g-+KJ";
      f7740[32] = "yk7\tt(p;9\u0012\u0010:(g1\u0006Gmr7mj}8-t1Rz987";
      f7740[33] = "+\t:j@Su\u0002o\u0006Ԭcv\u0011t9\u001c\\\"\u0000|v&Y9Yil_\u0004r\u0000w\u0006";
      f7740[34] = "(mCD$4!=M_@&yaEK\u0017q#1\u0018'-$|rE\u001f*%i1";
      f7740[35] = "9B\u0000Z\u0014^l\u0016\u0002T/K\u0006\u0010BO\u0013G=PFD\u0013";
      f7740[36] = "\\\u0010\u0002%gN\u0002\u0013\u00178\u0006\u001ef\u0013\u0002$6\u001b\u0014E\f|>wZB\rvj\u0005\fLU~\u0006";
      f7740[37] = "[\u000b<Pjc\u0013R*C\u0017tj[)_+zQ\u001b-T+";
      f7740[38] = "R\u0010\f@\u000e\u0001R\u000b\u001b^s\u0017\t\u000b\bl\u000f|P\b\u0000OM@R\u001f\u0018Cs@\u0019\bNC\u001e\u0018\u0006\u0004J%";
      f7740[39] = "%;qvQ5mbge,#\u0014kdy\u0010,/+`r\u0010";
      f7740[40] = "q\u000fz,\"{/\u0004/@ŮK(\u00197|:ph\u001d<|Drn\u0014y>\u007f2j\u001fy@$\".\n#pz){f";
      f7740[41] = "a\u007f~\u0015\u001a\u00006r,\u001bx\u0006q*'Q\u0016\u001dq&A\u001b\u0000\ns${D\u0018\u00072CpC\u0012\u0007v$8\u001a\u0004\u0014\u000br(@\u0005\u0007l:qV\u0016z";
      f7740[42] = "}\f\rMS\u0013y\u0016\u0002\u000f3\t9\u001c[H]\u00129\u0010=\fXH$NZY\fJ*u\u0002X\u000e\u0012x\u0012W\f\f\u001cC";
      f7740[43] = "\u0019D\u0012\u0003'CL\u0010\u0010\r\u001cU&\u0016P\u0016 Z\u001dVT\u001d ";
      f7740[44] = "\t&uA&&W%`\\GA3 rP-!\u000f\"eH!\u001f\tk!N-fT xPG";
      f7740[45] = "\u0005A\fWO\n\u0018P\u0003B~\u0015\u00030\u0018W\u0001\u0013\u0010\u0000\bNO\u001a";
      f7740[46] = "D9\u001d\u000f)\u001b\u001a2Hcƨ+\u001d/P_1\u0010]+[_O\u0012[\"\u001e\u001dtR_)\u001ecvTVl\\X6P]l\"\u0003&\u0014H6\u0012]-A$";
      f7740[47] = "+a\u0016$@b\"1\u0018?$pzm\u0010+s' =NGIr\u007f~\u0010\u007fNsj=";
      f7740[48] = "\u0015kY#:M]2O0GLCxV7#KVo3o.@Y\u007fT'wVJ\u0002";
      f7740[49] = "\n%)s\u001e\n_q+}%\u001d5wkf\u0019\u0013\u000e7om\u0019";
      f7740[50] = "t\u001b|~h\r*\u0018ic\tŽNDx\"eR~\u001asw\t\r1V-c2M5]-\u001d0K<\u0018o&pO7\u0018\u0011$vFrZ*drMr$(b{\b0\u001fhfp\bN\u001dno5Ju]jd54w[c!w\u000f7_h!\t\r1V-c2M5]-\u001d0K<\u0018o&pO7\u0018\u0011$vFrZ*drMr$(w{^p\u0018*`cRN\u001ec$e^7C(}{4";
      f7740[51] = "[R3O|\u0003\u0013\u000b%\\\u0001\u0016j\u0002&@=\u001aQB\"K=";
      f7740[52] = "}\u0017c\u001cn?n\r3J\u0003ip\u0007;MT;/Za!<~pRf\u001eo8x\r";
      f7740[53] = "\t\u0016\t\f\u001bhW\u001d\\`ӺXP\u0000D\\\u0003c\u0010\u0004O\\}a\u0016\r\n\u001eF!\u0012\u0006\n`D'\u001bCH[\u0004#\u0010C6\u0000\u0014g\u0005\u0019\u0006^\u001f2i";
   }
}
