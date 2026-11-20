package org.rusherhack.client.api.ui.window.view;
import org.rusherhack.*;

import java.util.Iterator;
import java.util.List;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.WindowContent;

public class SimpleView extends WindowView {
   public double contentPadding;
   public SimpleView$Alignment alignment;
   public double topPadding;
   public double f1077;
   public double leftPadding;
   public static Object[] f1079 = new Object[44];
   public static String[] f1080 = new String[44];

   public void setTopPadding(double var1) {
      this.topPadding = var1;
   }

   @Override
   public double getViewHeight() {
      return super.getViewHeight() - this.topPadding * 2.0 - this.getTopOffset();
   }

   @Override
   public void renderViewContent(double var1, double var3) {
        
    }

   public SimpleView(String var1, Window var2, List<? extends WindowContent> var3) {
    }

   public void setViewWidthModifier(double var1) {
        
    }

   public void setLeftPadding(double var1) {
      this.leftPadding = var1;
   }

   public SimpleView(Window var1, List<? extends WindowContent> var2) {
    }

   public double getLeftOffset() {
      return 0.0;
   }

   @Override
   public double getViewWidth() {
        return 0.0;
    }

   public double getTopOffset() {
      return 0.0;
   }

   public void setContentPadding(double var1) {
      this.contentPadding = var1;
   }

   public void setAlignment(SimpleView$Alignment var1) {
      this.alignment = var1;
   }

   static {
      m157();
   }
   public static void m157() {
      f1079[0] = "\u00165\u000fxfL\n/\r$|X\u001a,F5xP\u001c)\u001cxuI\u0010i\u001d?:N\u0010)\f9c\u0017\u000f.\r!:j\u0010*\u0018:qo\u0010\"\u001f";
      f1079[1] = double.class;
      f1080[1] = "java/lang/Double";
      f1079[2] = "yn#PbOet!\fx[uwj\u001d|Ssr0PqJ\u007f21\u0017>M\u007fr \u0011g\u0014`u!\t>i\u007fq4\u0012ul\u007fy3ZQV\u007f{*\u0013uTb";
      f1079[3] = "JVio-\u0017VLk37\u0003FO \"3\u000b@Jzo>\u0012L\n{(q\u0015LJj.(LSMk6q5LJj.(4LAy";
      f1079[4] = void.class;
      f1080[4] = "java/lang/Void";
      f1079[5] = "!?X\u0012bF?7B]\u0005G.,O\u0007#A";
      f1079[6] = "4u7 \u0005|?z&odr4q\"5";
      f1079[7] = "S\u0011=[FHO\u000b?\u0007\\\\_\bt\u0016XTY\r.[UMUM/\u001c\u001aJU\r>\u001aC\u0013_\f4\u0001QSHM\r\u001cZYS\u0014\u0019\u001aZIY\r.";
      f1079[8] = "2'=FSEG\u00076IB\n:\u001f%NKCR";
      f1079[9] = "'D\u000bAh\u0012;^\t\u001dr\u0006+]B\fv\u000e-X\u0018A{\u0017!\u0018\u0019\u00064\u0010!X\b\u0000mI\u001f_\u0002\u000bu\u0010\u0000W\u0002\u000bv\u0002:t\r\u001c\u007f";
      f1079[10] = "&\u0011W+t\u00078\u0019Md\u0016\u001b?\u0004";
      f1079[11] = "l}~&<\u0011pg|z&\u0005`d7k\"\rfam&/\u0014j!la`\u0013ja}g9JTfwl!\u0013@`w|+\nwGxf*\bf}[i=\u0001";
      f1079[12] = boolean.class;
      f1080[12] = "java/lang/Boolean";
      f1079[13] = "$A\u001al($8[\u0018020(XSȶ";
      f1079[14] = int.class;
      f1080[14] = "java/lang/Integer";
      f1079[15] = "O9\u001arJ=\u0010bYl;;\u0018/8oV?5>\u0007a[<u!\u0004vJ=\u000e!\re;z\u00078VvG9\r#\u0017\u000e";
      f1079[16] = " (a \u0010sa)y1,rv)b]\u0010ld t0Vfp6\u001e";
      f1079[17] = "|_\u000143I>RYk\u000bW,A~;jW!A>$i@0@E$`SA";
      f1079[18] = ".!fujR)u{\rl[l\u0010\u007f`|iq\"bm\u0003Dr6opxD{%\u001e";
      f1079[19] = "hY nB)7\u0002cp3ϲR\r`.]d*A5lTT";
      f1079[20] = "\u0004G\u0001t:c\u0003\u0013\u001c\f7jTT!e?k[N\u0016\f!eBY\u0004w!lQ";
      f1079[21] = "<\u0003tOoQ;Wi7iX~0kOA[l\u0017aK\u0006G`\u0014}J}Gi\u0007\f";
      f1079[22] = "9\u000bQ~&tfP\u0012`Wfn\u001dmk1eg\fW\u0002ipePT:=pn\u0019-";
      f1079[23] = "aHzKDr>\u00139U5`6^MPSs6Dz7\n>%BzUNwdD\u0006";
      f1079[24] = "{9 D|\u000b|m=<z\u00029\u00125Ri(+8#Qio74 Mh\u00147=3<";
      f1079[25] = "*\u0017uFVx~\u0017~\u000f//y\u0012X\u0010I<y\bo7F&x\n~\r/\u007fnPr\u001aF9m\fmw";
      f1079[26] = "\u0005^L+\u00185GS\u0014t +U@,(L8X<\u0001+X5EG\u0001\"KD";
      f1079[27] = "3&\u0019Y\u0005iu%EFh`e:K\\\u0005Za:KU\u0012Kk:[U\u000e|\faE\u0007\n8}#H_U\u0000~>_I\u0015{~7L8\u001abt-ZC\u001akg\\\u001dR\u0014|}!B\tWb\ffUSXxp%_H\u0019\u0000";
      f1079[28] = "Ikj\f^\u000eN?wtX\u0007\u000bZs\u0019H*\u001ae}\u0014Kj\u0005fj\u0005J\u0011\u0005oyt";
      f1079[29] = "\u0005ds}u%Bl&q\u0007\u0019qZ\u001e\u0014>-\r}0ly%Xq";
      f1079[30] = "2!UXxKvh\u0014^\u0004Hq}QQxNw\u0010\u0010I{T1wQHcE\r";
      f1079[31] = "bJ5\u0004\u000fD=\u0011v\u001a~V5\\\t\u0015\u001fV8\\I\n\u001cA)]2\n\u0015RX";
      f1079[32] = "iPn\u0006\u0014Cn\u0004s~\u0014C6Pp\u001b\u0010A+?/\u000eLN%Gh\u0006\u0019B";
      f1079[33] = "U98*C=\u00174`u{#\u0005'WH\t.\u0010*z3\t'\u0003[";
      f1079[34] = "\u0014\u0011yD[^V\u001c!\u001bc@D\u000f\u0017&\u0011MQ\u0002;]\u0011DBs";
      f1079[35] = ")JL\"+\u001d.\u001eQZ>\u001eo}]6.\u0018qJ4( \u0001fXO()\u0012";
      f1079[36] = "\u001d\u007fE )L_r\u001d\u007f\u0011FMa*Bc_Xl\u00079cVK\u001d\b iL]f\b)z=";
      f1079[37] = "\u001eNbie+\u0019\u001a\u007f\u0011ĿORCb`q4RJq";
      f1079[38] = "Pi\u001d0\u001d\u000e\u0012dEo%\u0004\u0000wsRW\u001d\u0015z_)W\u0014\u0006\u000bP0]\u000e\u0010pP9N\u007f";
      f1079[39] = "\u0003U\b%]XBT\u00104a_Q_15\u0011C8\u0014\u0015)\u001f[\u0006\\\u0013=\u0019?";
      f1079[40] = "},CWW\f\"w\u0000I&\n*:aJK\u000e\u0018'SWFq5.GZ[\n5-T+\u001c\u0003,vGW_\t77?";
      f1079[41] = "4\u001e\u007fA.\u00123Jb9,\u0011l\rj_;.c\u001dkX!\u0019\n\u0003eA6\u000bq\u0003lR";
      f1079[42] = "/z>D!a(.#<#\u0005 w~W\"g +%[H4s--V*4/v!<";
      f1079[43] = "|`~,nl;h+ \u001cs?|.#upEyr7a/~|0'$\u0014";
   }

   public SimpleView() {}
}
