package org.rusherhack;

import io.netty.buffer.Unpooled;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Future;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.util.collection.EmptyPaletteStorage;
import net.minecraft.util.collection.PaletteStorage;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.IdListPalette;
import net.minecraft.world.chunk.Palette;
import net.minecraft.world.chunk.SingularPalette;
import net.minecraft.world.chunk.WorldChunk;
import net.minecraft.world.chunk.PalettedContainer.Data;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.packet.IMixinClientboundSectionBlocksUpdatePacket;
import org.rusherhack.client.api.accessors.world.IMixinPalettedContainer;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.world.EventChunk$Load;
import org.rusherhack.client.api.events.world.EventChunk$Unload;
import org.rusherhack.client.api.system.IChunkProcessor;
import org.rusherhack.client.api.system.IChunkProcessor$Processee;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.clear;
public class Util494 implements Globals, IChunkProcessor {
   public LinkedHashSet<IChunkProcessor$Processee> f8024;
   public ConcurrentNavigableMap<ChunkPos, Boolean> f8025;
   public Future<?>[] f8026;
   public static long f8027 = Class066.m4320(8815495065776272975L, 1286984932439557840L, MethodHandles.lookup().lookupClass()).m4325(25822198799222L);
   public static long[] f8028;
   public static Integer[] f8029;
   public static Object[] f8031 = new Object[136];
   public static String[] f8032 = new String[136];

   public static boolean[] m15404(Predicate<BlockState> var0, Palette<BlockState> var1) {
        return null;
    }

   public static void m15406(ChunkSection var0, Predicate<BlockState> var1, BiConsumer<Vec3i, BlockState> var2) {
      if (var0 != null) {
         Data var13;
         PaletteStorage var19;
         if ((var19 = (var13 = ((IMixinPalettedContainer)var0.getBlockStateContainer()).getData()).storage()) != null
            && !(var19 instanceof EmptyPaletteStorage)) {
            Palette var22;
            if (!((var22 = var13.palette()) instanceof SingularPalette)) {
               boolean[] var21;
               if ((var21 = m15404(var1, var22)).length != 0) {
                  long[] var20 = var19.getData();
                  int var8 = var19.getSize();
                  int var9 = var19.getElementBits();
                  long var10 = (1L << var9) - 1L;
                  int var12 = 0;
                  int var6 = 0;

                  for (int var23 = var12; var23 < var20.length && var6 < var8; var23 = ++var12) {
                     long var14 = var20[var12];

                     int var16;
                     for (int var24 = var16 = 0; var24 <= 64 - var9 && var6 < var8; var24 = var16) {
                        int var17 = (int)(var14 >> var16 & var10);
                        if (var21[var17]) {
                           Vec3i var18 = new Vec3i(var6 & 0xFF & 15, var6 >> 8, (var6 & 0xFF) >> 4);
                           var2.accept(var18, (BlockState)var22.get(var17));
                        }

                        var6++;
                        var16 += var9;
                     }
                  }
               }
            }
         }
      }
   }

   public static BlockState[] m15407(Palette<BlockState> var0) {
      if (var0 instanceof IdListPalette) {
         return null;
      } else {
         PacketByteBuf var4 = new PacketByteBuf(Unpooled.buffer());
         var0.writePacket(var4);
         int var7;
         BlockState[] var8 = new BlockState[var7 = var4.readVarInt()];

         int var5;
         for (int var10000 = var5 = 0; var10000 < var7; var10000 = var5) {
            int var10001 = var5;
            BlockState var10002 = (BlockState)Block.STATE_IDS.get(var4.readVarInt());
            var5++;
            var8[var10001] = var10002;
         }

         return var8;
      }
   }

   public static double m15408(ChunkPos var0) {
      return Globals.mc.player == null ? 0.0 : Globals.mc.player.squaredDistanceTo(var0.getStartX(), Globals.mc.player.getY(), var0.getStartZ());
   }

   public void m15409(ChunkPos var1, boolean var2) {
      int var10000 = Class253.m9155();
      Iterator var8 = this.f8024.iterator();
      int var5 = var10000;

      while (var8.hasNext()) {
         IChunkProcessor$Processee var7;
         IChunkProcessor$Processee var9 = var7 = (IChunkProcessor$Processee)var8.next();
         if (var5 != 0) {
            if (!var9.isActive()) {
               continue;
            }

            var9 = var7;
         }

         var9.process(var1, var2);
         if (var5 == 0) {
            break;
         }
      }
   }

   @Subscribe(
      stage = Stage.POST
   )
   public void onRender2D(EventRender2D var1) {
        
    }

   @Subscribe(
      stage = Stage.POST
   )
   public void onReceive(EventPacket$Receive var1) {
        
    }

   @Subscribe
   public void onUnload(EventChunk$Unload var1) {
      this.f8025.remove(var1.getChunkPos());
   }

   public static boolean[] m15414(Predicate<BlockState> var0) {
      Predicate var6 = var0;
      int var10000 = Class253.m9154();
      boolean[] var4 = new boolean[Block.STATE_IDS.size()];
      Iterator var5 = Block.STATE_IDS.iterator();
      int var3 = var10000;

      while (var5.hasNext()) {
         BlockState var7 = (BlockState)var5.next();
         if (var3 == 0) {
            if (!var6.test(var7)) {
               continue;
            }

            var4[Block.STATE_IDS.getRawId(var7)] = true;
         }

         if (var3 != 0) {
            break;
         }
      }

      return var4;
   }

   @Override
   public void reloadChunks() {
      Util494 var3 = this;
      Iterator var5;
      Iterator var10000 = var5 = WorldUtils.getChunks().iterator();

      while (var10000.hasNext()) {
         WorldChunk var4 = (WorldChunk)var5.next();
         var10000 = var5;
         ConcurrentNavigableMap var10001 = var3.f8025;
         ChunkPos var10002 = var4.getPos();
         boolean var10005 = true;
         var10001.putIfAbsent(var10002, true);
      }
   }

   public Util494() {
      super();
      this.f8024 = new LinkedHashSet<>();
      this.f8025 = new ConcurrentSkipListMap<>(Comparator.comparing(Util494::m15408));
      this.f8026 = new Future[4];
      Class170.f3362.subscribe(this);
   }

   @Subscribe
   public void onLoad(EventChunk$Load var1) {
      this.f8025.put(var1.getChunkPos(), false);
   }

   public boolean m3982() {
      int var10000 = Class253.m9154();
      Iterator var5 = this.f8024.iterator();
      int var3 = var10000;

      while (var5.hasNext()) {
         boolean var6 = ((IChunkProcessor$Processee)var5.next()).isActive();

         while (var6) {
            var6 = true;
            boolean var10002 = true;
            if (var3 == 0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void scanChunk(ChunkPos var1, Predicate<BlockState> var2, Consumer<HashMap<BlockPos, BlockState>> var3) {
      int var6 = Class253.m9154();
      WorldChunk var7;
      if (!(var7 = Globals.mc.world.getChunk(var1.x, var1.z)).isEmpty()) {
         int var8 = Globals.mc.world.getBottomY();
         HashMap var9 = new HashMap();
         int var13;
         int var10000 = var13 = 0;

         while (true) {
            if (var10000 >= var7.getSectionArray().length) {
               var3.accept(var9);
               break;
            }

            if (var6 != 0) {
               break;
            }

            ChunkSection var11;
            if ((var11 = var7.getSectionArray()[var13]) != null && (!var11.isEmpty() || var6 != 0)) {
               int var12 = var8 + var13 * 16;
               m15406(var11, var2, (var3x, var4x) -> {
                  BlockPos var8x = new BlockPos(var1.getStartX() + var3x.getX(), var12 + var3x.getY(), var1.getStartZ() + var3x.getZ());
                  var9.put(var8x, var4x);
               });
            }

            var10000 = ++var13;
         }
      }
   }

   @Override
   public void registerProcessee(IChunkProcessor$Processee var1) {
      this.f8024.add(var1);
   }

   static {
    }
   public static void m194() {
      f8031[0] = "B\u001bXg,{\\\u0013B(KzM\bOrm|";
      f8031[1] = "\u0018\b\t:\u0017k\u0013\u0007\u0018uve\u0018\f\u001c/";
      f8031[2] = "{YbD1+pVs\u000b](~TqDq";
      f8031[3] = boolean.class;
      f8032[3] = "java/lang/Boolean";
      f8031[4] = "*{L[D\u001c6aN\u0007^\b&b\u0005ӻ";
      f8031[5] = "\u0017+ \u001f~@\t#:P3Z\u0013)#\f\"P\u0013>x=?[\u001e?$\f5[\t\u00047\b9R\u001c(:\u001b\u001dT\r";
      f8031[6] = "hC\r\u0014OKvK\u0017[-WqV";
      f8031[7] = "\n\t%t,\u0017\u0016\u0013'(6\u0003\u0006\u0010l92\u000b\u0000\u00156t?\u0012\fU7.7\u000e\u0016U\u00155,\u000e\u0001.632\u0011";
      f8031[8] = "AnyJ?NAnn\u00163A[%n\b3T\\T?\\c\u001f";
      f8031[9] = "T\\R]^\u000bT\\E\u0001R\u0004N\u0017E\u001fR\u0011If\u0017J\u0001Q";
      f8031[10] = " \"WjFt<8U6\\`,;\u001e'Xh*>DjUq&~U2Qo;#\u001e3[s#4\u001e\u0001Bd!$s,Ao$";
      f8031[11] = "*\u0013.pa\u001f4\u001b4?\f\u0005-\u00029c.\u001e/\u0000";
      f8031[12] = "o\t\u001e:Hnq\u0001\u0004u\u0000nk\u000b\u001c2\tu+.\u001d5\u0005ol\u0007\u0006";
      f8031[13] = "d.R&\u001f:x4Pz\u0005.h7\u001bk\u0002=nrP~\b!\u007frp~\b!\u007f\u001e@{";
      f8031[14] = void.class;
      f8032[14] = "java/lang/Void";
      f8031[15] = "Z7{>'\u0004F-yb=\u0010V.2Ż";
      f8031[16] = "\u007fm\u0013)\u0002;cw\u0011u\u0018/stZȁ";
      f8031[17] = int.class;
      f8032[17] = "java/lang/Integer";
      f8031[18] = "8$;,\u000bG8$,p\u0007H\"o,n\u0007]%\u001e}:U\u0019";
      f8031[19] = "I\u001e6\u0016UI\u007f;6\u0016B\u0015s4,]B\u000bs!+,\u0013Q*bc";
      f8031[20] = "u#\u001bU\u00041i9\u0019\t\u001e%y:Rȏ";
      f8031[21] = "\u001c,#9\u0019\u0018\u0002$9vQ\u0018\u0018.!1X\u0003X\u001d'=S\u0004\u0015,!=";
      f8031[22] = "\f\u0003";
      f8031[23] = "t}1\u001fU$t}&CY+n6&]Y>iGr\u0005\u000e";
      f8031[24] = double.class;
      f8032[24] = "java/lang/Double";
      f8031[25] = "\u001eA%CL\r\u0002['\u001fV\u0019\u0012Xl\u000eR\u0011\u0014]6C_\b\u0018\u001d\u0005\u0001Q\u001a\u0010_1";
      f8031[26] = "T*RM+=T*E\u0011'2NaE\u000f''I\u0010\u0015Rv";
      f8031[27] = "3kL\r6=-cVBT!7a_\bP)*bi\tl";
      f8031[28] = "OyA{tvScC'nbC`\b6jjEeR{gsI%U,uwEf\b\u001cEkUeM\u0005tlCnU&iq\u0004[T:efSxC0";
      f8031[29] = "\u001d+P.4r+\u000eP$#.'\u0001Jo#0'\u0014M\u001erdtQ\u0005";
      f8031[30] = "mcF:\u0000\\mcQf\fSw(Qx\fFpY\u0000,_\u0003";
      f8031[31] = "0';5/\u00170',i#\u0018*l,w#\r-\u001dy(z";
      f8031[32] = "Q~dH\u0003\"Ov~\u0007K\"U|f@B9\u0015]{jB9Hj\u007fL_";
      f8031[33] = "v\u0010\u0018r\u0016^h\u0018\u0002=^^r\u0012\u001azWE22\u0001}K^q\u0014\u001c";
      f8031[34] = "}.fr)m}.q.%bgeq0%w`\u0014 o|6";
      f8031[35] = "+}I\u0013Y\\5uS\\?H2tr\u0013\u0007";
      f8031[36] = "gB\u001d'o\u0018gB\n{c\u0017}\t\nec\u0002zx[?0G";
      f8031[37] = "yamg!ryaz;-}c*z%-hd[+z\u007f#";
      f8031[38] = "n\fG'Ayr\u0016E{[mb\u0015\u000ej_ed\u0010T'R|hPAjPir\rO{@\"q\u001fCbVx/7m`Keo=L`Vbu\u001cO|]hR\u001bC}Zco<LfPgr+PmRxd.AjXiu";
      f8031[39] = "[rz)\u0006[[rmu\nTA9mk\nAFH:7\\\u0004";
      f8031[40] = "FXm+Y~ZBowCjJA.fGbLD~+J{@\u0004osNe]Y.kN\u007f^Exn\u0005N_Odq{jJAoq";
      f8031[41] = "R\u0010e\\6\u001fR\u0010r\u0000:\u0010H[r\u001e:\u0005O*#Gb@";
      f8031[42] = "\u0003\u0001,I\u0010\u0001\u001d\t6\u0006]\u001b\u0007\u0003/ZL\u0011\u0007\u0014tnK\u0000\u001c\u0012?";
      f8031[43] = "\fNr\u0006l;\u0010TpZv/\u0000W;ԙ";
      f8031[44] = "\u0013hdSR\u0010\u0018gu\u001c.\t\u0017gsP\u0010\u0019";
      f8031[45] = "5>#[\u0003=@\u0007=S\u0019r\r\u001d'Y\u0000.\u001c\u0017'N[\u001a\u001b\u0006<H\u0010g";
      f8031[46] = "X\u000e\\\":\u001cF\u0006FmY\bBKo-`\u001bK";
      f8031[47] = "u\b";
      f8031[48] = " m>#\"@ m)\u007f.O:&)a.Z=W|9v\u0019";
      f8031[49] = "\u0013b";
      f8031[50] = "F5\u00192\nNF5\u000en\u0006A\\~\u000ep\u0006T[\u000f_$S\u0016";
      f8031[51] = "@\u001e\\~w@\\\u0004^\"mTL\u0007\u00153i\\J\u0002O~dEFBZ3fP\\\u001fT\"v\u001bX\u0003I<a\u001bf!R(l[\u007f\rW5qAJ\bx?kAN\u0005U5w";
      f8031[52] = "\u0013\u0013de\u00186\u0013\u0013s9\u00149\tXs'\u0014,\u000e)\"sAnY\u0015|*\u0006,\"@%}D";
      f8031[53] = "wv.!\r0wv9}\u0001?m=9c\u0001*jLh<Vh";
      f8031[54] = "+8`SZ\u0004+8w\u000fV\u000b1sw\u0011V\u001e6\u0002&O\u0003U";
      f8031[55] = "\u0017u\u0012Dq\u0005\u0017u\u0005\u0018}\n\r>\u0005\u0006}\u001f\nOT_(\\";
      f8031[56] = "uY\u000f>@ehO\u000f2PwzSS~p\u007flYN<@u";
      f8031[57] = "$8y\u0007Yy9.y\u000bIk+2%G~t92\u0015\u001cZ";
      f8031[58] = "!BiB\u0007\u0019cI1@uO5QQL\u001e\\9Jly\u0012[XWg\u0010NG'O0AD ";
      f8031[59] = "cES\fwH)\u0014S]MY0\u0019K\u0000\nIYG\b\u0006/]0DZ\u0004='cES\fwH)\u0014S]M";
      f8031[60] = "4$\u0005PAKgcR\n\u007f\u001ac\u007fE\u0000\u0005\u0010bu=Y\u001b\u001ch!\u0003\u0004\u0010\u000b9\u001a\rWGH: ^\u0010\u0010\u0012\u0004";
      f8031[61] = "yJ(-IR!\u0016tdN8%\u001eevKT\u0017J!,\u0014\u0006@\u0002xsPB1\u001ev),S|\u0017pi]\u0006'\u0011)\u0016";
      f8031[62] = "o\u0004|\u001a2$x\u000e:\u0014Pqa\u0004+],\u0018{\u000e#Y*ig\u0000y%!yo\u0013<T=w5ow_3|0\f~\u001a(\"\n";
      f8031[63] = "J\tyO2aJ\u0006xSKhH\u0019`W'Z\u0018[<\u0001Kb]\u0015f\u0001(m\u0018]a0$uU\u00031S+0\u001d\u0004\u0000_3}CTcPv5DeoH;k\u0014\u0006`\rsl%";
      f8031[64] = "3T(\u0019(jjC/\u001aFc`V/\u001f*Q=\u0011uHFm1N&\u000778jH\u007fx";
      f8031[65] = "MjjRi]\u000eudQ\u0010\b\u001dn;V|:I(c\t.m\u0013->\u000f \u0015\fh$\u000b\u0010";
      f8031[66] = "6I*\u001e?:&\u001a;Q@i$\u000f\u0002\u00011\u00068\u0012$\u0010:w$\u001c~l";
      f8031[67] = "i3 \u001ez?8-%\u0016\u0005:o08@i\b;vb\u0017:_;v2_>:d)(Hw_36;C?<:s \u001d\u0005";
      f8031[68] = "7!G(-D7)E}VX*;Gp:j|{\u0017&h=,{C~)Ly E'V";
      f8031[69] = "\u0017ZSE\u0017BNMTFyKDXTC\u0015y\u0019\u001f\u000e\u001ayE\u0015@][\b\u0010NF\u0004$";
      f8031[70] = "\u007fd\u00052sJsnIf\u0017J`y85kL\r<L7{ZpnN=)O\r";
      f8031[71] = "\u0006.L.\\CS-\fo\"Ĉ=vAd@OCuAdE\"PrEbZ\\TlZa\"GV/\u0002<\u001eP\\i\f^\u0013X^q\u0007=\u001a\u001dE/=";
      f8031[72] = "c\u0018bh'{1\u001ah:2\u00061Gl|\u000f?c\u0011\to'~c_i>9{k ";
      f8031[73] = "Usi\u0018\u0016z^j>\u001d+/U}a\u000b|x\n :gO?\u000b\u007faXR:Rl";
      f8031[74] = "o\u0014)y^#:\u0017i8 ǈT\u0011&nA,8H1iBBn\u00113kZ+mC1y s.L<3CzkWb\t";
      f8031[75] = "rC,\u0011g\nv]3\u0012\u001f\br_(-n\u0015zX.\\r\u001b $n\u0013t\u0016eMmAv\u0004\u001f";
      f8031[76] = "$Rq)=;+Uv/[5/Ww+7\u0007{\u0013-rgP)\u0017s%$!|Lu|[";
      f8031[77] = "[<&r\u0010+\t>, \u0005V\tc(f8o[4Mn\t6]\u007f4n\u00014\b\u0004";
      f8031[78] = "6\u00132\u0003ZZ'Ei\u000e\"B#S3YNpw\u0016h\u0006\u0013'6QjCFV>F8Q\"";
      f8031[79] = "lkg\u0013zg9h'R\u0004єW=q\u001b8~)9o\u0004;\u0006</nZ{fm1kR\u0004vo6(\u0003tkglpc";
      f8031[80] = "fJ[\u0018\u001cp3I\u001bYbѦ]JX\u0007\u0012x$\u001bSVY";
      f8031[81] = "Is\u00101{|\u0010d\u00172\u0015~\u0016`\u0013<B!N=NP~,\u0013d\b!+w\u0015=";
      f8031[82] = "0E\u001e\\*Pp\u0019P\u0003HF|\u0011\u001b\b2\\k\u0016`\u0012)X}\u0001\u0011\u000e'\u0002\u0001J\u001a\u0000,\u0007bC_\u001br=";
      f8031[83] = "/\\e\u0003d,?XeU\\89\u001b\f\u0007749\u001bT\u0015\",i\u0007(_9(0g";
      f8031[84] = "\u0014J|\u000b4.K\u0015f\u001c}KH\u001dj\u0013h'zI.C6u-\u001b*\u0017f4\\Nq\u0011?K";
      f8031[85] = "oA\u001a\u001c0X>JKWY[9V\u0012\u00124!%R\u0010\u0010#P9\\Jl(@1O\u000f\u001d4Nk3";
      f8031[86] = "|R6^y\u001e%E1]\u0017\u001c#A5S@C{\u001ci?|N&E.N)\u0015 \u001c";
      f8031[87] = "T\u001a\u0002\\n{\u0005\u0011S\u0017\u0007z\u0012\u0014m]fg\u0013\u0012\u001cAh=o\u0019\fI{x\u001e\u0005\u0002\u0013\u0007s\u000e\r\u0011Vvo\u0000Wm";
      f8031[88] = "&/pt~Is,05\u0000A\u001dy?f~\u0018`lnjk(p*cz0Ue{oo\u0000";
      f8031[89] = "xs$0`1+'s6P f 75,&`Mqc>z{|5.kA";
      f8031[90] = "Px]\rx?\fpV\u0019\u0012:[\u0015G\u0013~ \r.L\n)%";
      f8031[91] = "\u0002oVN\u0018\r\u001fj\u000f]|W\u000bm\tF\u0010e](W\u0019C2\r-\rH\u0003CXv\u000b\u0011|";
      f8031[92] = ";L\u0006\u0000\u0006'+\u001f\u0017Oyt)\n3\u001b\u001df)v\u001c\u0013\u001cg>\u0007\u0000\u001dF\u001b";
      f8031[93] = "\u00142\u0003}t$_n\u0005d;\u001eCj\fy%I\u00143_ p\u001e\u00142P&,tLn\fo+";
      f8031[94] = "w?\b7bbx8\u000f1\u0004l|:\u000e5h^(~Tl?\tzz\n;{x/!\fb\u0004";
      f8031[95] = "|/\u0001>hP$s]wo: {LejV\u0012/\b?5\u0006E}\fadE4(Wg=:";
      f8031[96] = "\fkuA(^[haB(\"_-rJ.X5i \u001a\"_\u000bj#Ns_5";
      f8031[97] = "/G-@=\nk\nx{<Rh>.\u000b ;)F(\u0019&R*\u0014*\u000b\\";
      f8031[98] = "Fmb\u0005#[Lrj\u0007LS\\q\u001a\u001d-N]wk\u0001#\u0014!|{\t0QP`uSLZ@hf\u0016=FN2\u001a";
      f8031[99] = "m+P2\u0018u)f\u0005\t\u001f)!h>x\u0018!-nOd\u0016{Q";
      f8031[100] = "-2_\u0010E8un\u0003YBRqf\u0012KG>C2V\u0011\u0018j\u0014`ROI-e5\tI\u0010Rej\u000bWZ#ydQ+";
      f8031[101] = "mp$\u001eqwb\u007f.\u0005Iյ\u0007*`\u0001 jv\u007f;\u0007y\u0015";
      f8031[102] = "=Ta\u0014tL2[k\u000fLɷW\u000e%\u000b%Q&[~\r|.";
      f8031[103] = ")('#\u001f\bm)s2!ƃTk9%H\nh&?pXa(m\"+M\u0011e{$w!";
      f8031[104] = "\u0019W\u0005Eh\u001aLTE\u0004\u0016б\"VJ^t\u0001KU\u0018\\f{";
      f8031[105] = "E%$\u001aJ?E-&O1#X?$B]\u0011\f~~\u001c\u000bFD~'\\X6G1:N1";
      f8031[106] = "\u0011q*P\u007fL\u0012q*U\u0012W\u001fqpU~eK7*\f/2\u0003w{BtS\u0015m-R\u0012";
      f8031[107] = "[\f\u000eHg\u001a\u0018S\nWX\u000e\tA.T%\u0007\u0007e\u0002OX_\u001aZ\u0004Z4\u0006\r]\u00074";
      f8031[108] = ")\bL^QU7\u0002\u0002\u0003m\u000b0.UB\f\u0014&g\u0004\u0000\u0006\b1\u000e\u0007R\u0004\u001aK";
      f8031[109] = "P^\u000bW['S^\u000bR6<^^QRZ\u000e\b\u0012\u000b\u0004\fY\t\u001cZWL0\nNXE6";
      f8031[110] = "ngu\u0006\u0000\n;d5G~\u0017U>:\u001f\u0012[%mnH\u0014";
      f8031[111] = "_]=UQ\rBXdF5WV_b]Ye\u000b\u001f3\u00055Y\u0007GkED\f\\A2:^\u000e_J}K\u000bUY\u0013\u0002\u0007M\u0003XZ2DR\r[#";
      f8031[112] = "rq\u0002\f<M1n\f\u000fE\u0018\"uS\b)*v3\u000bWy}qwT\u000e+\u0011(`S\rE";
      f8031[113] = "\u001bu1|Ka\u0014r6z-o\u0010p7~A]D4m'\u0015\n\u001603pR{Ck5)-";
      f8031[114] = "\u0002\u0006X]}gZZ\u0004\u0014z\rZC\u0004\u001cqq\\EiZ'c\u0000^X\u001ej6;";
      f8031[115] = "\u0006Mk;T\u0014PU}-&ҧo\u00192<\u0019\u001f\u0002YnrF";
      f8031[116] = "6\rH'W36\u0002I;.:4\u001dQ?B\bcZ\na\u001e_6\u0019A>\u001f<9\\\t9.";
      f8031[117] = "\u0000\u000f#\u00017\u001eM\u0019%][\u000f\u00078%\u00066nFJ)\u0002!\u0007E\u0018+\u0010[";
      f8031[118] = "\rL\u001b\u0019\u001avNS\u0015\u001ac#]HJ\u001d\u000f\u0011\t\u000e\u0010@XF\n\nA\u0018\u0019/\tXC\nc";
      f8031[119] = "\u0003Y\u001dK\u0017%RRL\u0000~7\\F\u001bA~mBH\u0016\u0001\u001dd\u0007SH;";
      f8031[120] = "MI-1 jMA/d[vPS-i7D\u0004\u0012w7f\u0013V\u0013)g$b\u0003H/>[";
      f8031[121] = "\u007f0B7YL*3\u0002v'ӊD`L?\u001eR$1R:\u0016-(a\bvZU\"l\u0003<'";
      f8031[122] = "]HD[Au\bK\u0004\u001a?ՠf\r\nU\u0004-\u0006\fDRX";
      f8031[123] = "\u0019\u0003-\u007f\u000b\nFE~`7QYP:iKW_=|?Y\u000bD\f8r\f0";
      f8031[124] = "\u000b#7\u000eTKZ(fE=JM-\u0019\u0010tXK<>\u0002=CQ4$\u0004L__nX\u000f\\WL+)\u0013R\r0 9\u001bAHA<7A=";
      f8031[125] = "\b028\u0001\u0001Mv)`\u007f\u001fXq\u0007:\u0002\u0016VvLfA\u001dJ1v9\u0007NU\r";
      f8031[126] = "3q:\u0012\f\u001cy :C6\u0019n.;\u001e_\u0015W ;\u000e[s3w4\u0011L\u001a0%6\u00036";
      f8031[127] = "\u001f|83|.Nb=;\u0003+\u0019\u007f mo\u0019M9z:3N\u001f?$c|?Jd\":\u0003?\u0015f<pr#\u001b<@";
      f8031[128] = "o\u001c\ti\\\u0004:\u001fI(\"ǋTJ\u001fa\u001e\u001d*N\u0001~\u001de$\u001f\u001e'B\u00159\u0017D\u007f\"";
      f8031[129] = "8\u00012cu.a\tdc\u0015y5\u0006b~i\u0010/\fjzoa3\u00020\u0006$j=\t5e-/&W\u000f";
      f8031[130] = "x07C\u0007rs)`F:'x>?Pmp&ig<U%`,\"PU*a0";
      f8031[131] = "Zz(qPODpf,l\bBr1|\u0017\u000b8+$v\r\u001eTr3q\u000ep\u0002+1s\u0016\u0019\u0001y3alABv>+\u000fH\u0007m`\u0011";
      f8031[132] = ">&\"\f3\nmru\n\u0003\u00130tK\u0011b\u001f b:\rlE\\\"u\u000ba\u00005!'\tsz";
      f8031[133] = "A\u0019Q?}~\u0010\u0012\u0000t\u0014\u007f\u001d\u000fZ\u0001u}\u0001\u0017s)h}\u000bkAu\u007fu\u0005WQ&n:z";
      f8031[134] = ")\u0010\u0006}qtx\u001bW6\u0018li/\fud|\u0012XWfzw{[\u0005dh\r";
      f8031[135] = "\u0019\u0007\u0017C\u000f9\u0001PFIh#\u000e\u0016F\u001f\u0004\u0011ZZ\u0018IRF]\u0014A\u0019\u0006*\u0004\u0003F\u001ah";
   }
}
