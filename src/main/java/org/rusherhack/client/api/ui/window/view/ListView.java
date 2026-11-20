package org.rusherhack.client.api.ui.window.view;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.ListItemContent;
import org.rusherhack.core.setting.Setting;

public class ListView<T extends ListItemContent> extends WindowView {
   public List<T> f1043;
   public boolean f1044;
   public ListView$ListItemView f1045;
   @Nullable
   public ListView$Column f1046;
   public List<ListView$Column> f1047;
   public Consumer<T> f1048;
   public T f1049;
   public static Object[] f1051 = new Object[46];
   public static String[] f1052 = new String[46];

   @Nullable
   public T getSelectedItem() {
        return null;
    }

   public boolean isSortAscending() {
        return false;
    }

   public List<ListView$Column> getColumns() {
        return null;
    }

   @Override
   public void renderViewContent(double var1, double var3) {
        
    }

   public ListView(String var1, Window var2, List<T> var3) {
    }

   public void setSelectedItem(ListItemContent var1) {
        
    }

   public void setDeleteCallback(Consumer<T> var1) {
        
    }

   public ListView$Column addColumn(String var1, Comparator<T> var2, double var3) {
        return null;
    }

   public void sortByColumn(ListView$Column var1) {
        
    }

   public ListView$ListItemView getItemView() {
        return null;
    }

   public void resort() {
        
    }

   @Nullable
   public ListView$Column getSortColumn() {
        return null;
    }

   public ListView$Column addColumn(String var1, double var2) {
        return null;
    }

   public ListView$Column addColumn(String var1) {
        return null;
    }

   public double getColumnWidth(ListView$Column var1) {
        return 0.0;
    }

   static {
      m157();
   }
   public static void m157() {
      f1051[0] = "\u0013x\u0013c\u0010\u001b\rp\t,r\u0007\nm";
      f1051[1] = "$*0%W+/%!j6%$.%0";
      f1051[2] = boolean.class;
      f1052[2] = "java/lang/Boolean";
      f1051[3] = "\u0006p\u00015\b[\u001aj\u0003i\u0012O\niHx\u0016G\fl\u00125\u001b^\u0000,\u0013rTY\u0000l\u0002t\r\u0000\u001fk\u0003lTb\u0000q\u0012M\u0013K\u001e";
      f1051[4] = "G\u00043xm_[\u001e1$wKK\u001dz5sCM\u0018 x~ZAX!?1]A\u001809h\u0004^\u001f1!1fA\u0005 \u0000vO_R\u0018?l^a\u00021;ICM\u0001";
      f1051[5] = "\u001fyS{\u001e\u0017\u0003cQ'\u0004\u0003\u0013`\u001a6\u0000\u000b\u0015e@{\r\u0012\u0019%A<B\u0015\u0019eP:\u001bL\u0013dZ!\t\f\u0004%x<\u001f\u00169\u007fQ8/\r\u001e\u007fQ;\u0018";
      f1051[6] = "\b\u0011\u001d0\u007fV\u0014\u000b\u001fleB\u0004\bT}aJ\u0002\r\u000e0lS\u000eM\u000fw#T\u000e\r\u001eqz\r\u0011\n\u001fi#o\u000e\u0010\u000eHdF\u0010G9qaV\n\r";
      f1051[7] = "-\u00196\nD\u001d1\u00034V^\t!\u0000\u007fGZ\u0001'\u0005%\nW\u0018+E.M\u0018\u001f+\u00055KAF4\u00024S\u0018?+\u00055KA>+\u000e&";
      f1051[8] = "_@\u0016@E#*`\u001dOTlWx\u000eH]%?";
      f1051[9] = void.class;
      f1052[9] = "java/lang/Void";
      f1051[10] = "\r03B3V\u0011*1\u001e)B\u0001)zȘ";
      f1051[11] = ",t}&a\u00002|gi<\u00014pj*a1)`i+*&2gn&\"";
      f1051[12] = double.class;
      f1052[12] = "java/lang/Double";
      f1051[13] = "EH~w\f$[@d8Q%]Li{\f\u0002[[mwO";
      f1051[14] = "\u0012\u0002\u001f2Dj\f\n\u0005}\fj\u0016\u0000\u001d:\u0005qV7\u0006\u0017\u0005j\u001a\u000f\f\u0015\u001fq\u001b\u0017\u0000<\u0004";
      f1051[15] = "y\"\u001f\u001f\\\u001ag*\u0005P1\u0000~3\b\f\u0013\u001b|1";
      f1051[16] = "e\u0018`&X\r{\u0010zi\u0010\ra\u001ab.\u0019\u0016!:y)\u0005\rb\u001cd";
      f1051[17] = "whB\u000b3+kr@W)?{q\u000bF.,}4V@5*qtB\u000b\u0012;lnLK&";
      f1051[18] = "q|~ 2>\u0004\\u/#qyDf(*8\u0011";
      f1051[19] = "\u0014hJ\nc\u0012aHA\u0005r]\u001cPR\u0002{\u0014t";
      f1051[20] = "81xT'\u0014$+z\b=\u00004(1\u00199\b2-kT4\u0011>mj\u0013{\u0016>-{\u0015\"O\u0000*q\u001e:\u0016\u0001*z\r\u001d\u00009's\u001f'#60z";
      f1051[21] = "jw\u00196l\u0014l|G\fg\u001am\u0010\u001e1kL~jJh|\u0012\u0001)K}p\u0004~!Ur|v";
      f1051[22] = "qt\u000e\u0016\rT9.M\u0011t«K-LMI\u0002+t\u000b\u0019\u001e";
      f1051[23] = "\u0002\u0006E)_7\tPW:4#ZAz<x!NSB64wMD\u001b?\n)R\u0000\u001d[\u0004wRX_'\u0005(\rX&";
      f1051[24] = "\u0002jB1\n&Nh\u0015$h5R-q;\u0005%\u007f8I6\f7EQC(\u0014b\u0004`V(V<?";
      f1051[25] = "als5S\r-n$ 1ϗ\\;d8\b\tg'}&Tq";
      f1051[26] = "==0\u0012%o+0l\u0013J,9>>\u000b1;8@:\f)5;y,\u0001u4T";
      f1051[27] = "%\u007f?gc#m%|`\u001acrgd\"f\u0019!a<#u\u007fo'cd\u001a";
      f1051[28] = "$\u001ebP,~lD!WU+s\u0001\u0015\b19{\u001b%o># G<\r8(~}";
      f1051[29] = "PlwP6P\u001864WOȎjd,Qu\b\bb'\u000f";
      f1051[30] = "_eAN\u000f\u000eJe\u0003\u00104_ZqQ\u0012Ye^qQ\u001bNaRzB=SYOz[\n4\u0002\bzV\u0014HN\n-Cv\u0004YAe\u0002H\nCOu=FRMA(\u0003HHCQ\u0017\u0003\u000b\u000bD\\qMMT\u00033";
      f1051[31] = "\by^J\u001bE_{\u0002O'Ţ43T\u0004U\u0018\n=N\nE";
      f1051[32] = "KmN \u0019\u0010\u00037\r'`Ȅq5\u0013e\u0019[\u0015e\u0011n\u0001";
      f1051[33] = "C\r%=G:BRz=>=\u000eYDlX4\u0001\u0003zbB:\u0011<";
      f1051[34] = "f\f\u001c\u0002I\u001b0\u000b\u0019\u0015$Շ\f\u001b\u0002\t\u001d^7\u0007\u001b\u0017A&";
      f1051[35] = "h/Mnv\\$-\u001a{\u0014O8hkbr\\8r\\\u0005\u007fGk.BgyL5\u0014";
      f1051[36] = "x\u000e\u001f`u90T\\g\fɽBQY30? \u0006[o5";
      f1051[37] = "W\u0007mA\u0016\u001f\u001f].FoƋm\u000f6@UG\u000f\t=\u001e";
      f1051[38] = "\u001d?b\u0004\u0000<Ue!\u0003yo'c=XG>]f?V\u001b\u0006\u0018?=\u0005A|\u001d=3Yy";
      f1051[39] = "09=\u0003\u0001P62c9\u0018N!3j\\c\u0003d=qR\u0012\b2/b9";
      f1051[40] = "3J\u0006!cY5AX\u001bz\\\"Q8r|X;B\u0001dq\u0004:-\u0006f>@7KH a\u0007X";
      f1051[41] = "\u0011\u0014U\r\u0017\u0004YN\u0016\nnӮ+\u001d\u0006\u000b^Z\u0016\u000b\u0010B\u0004";
      f1051[42] = "ED^AY(\u0012F\u0002De%\u0014By\u001a\u00002\u0010D[\u0001\u00020yWO\u001e\u0006%@ABB\u0007J";
      f1051[43] = " P\u0004\\f]vW\u0001K\u000b̟JG\u001aW2\u0018q[\u0003In`tV_Jd\u0006:\u0010\u0000\r\u000b";
      f1051[44] = "\u0013X{K/{_Z,^MhC\u001fHA xq\u0002z\\-\u0007\u001e\u0005dRr9\u0010\u001fjBM";
      f1051[45] = ",O]KBGd\u0015\u001eL;ŧ\u0016\u0015\r\u0005E\u000fi\u001d\u0013\nI";
   }

   public ListView() {}
}
