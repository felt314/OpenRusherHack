package org.rusherhack.core.command;
import org.rusherhack.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.rusherhack.core.interfaces.INamed;
import org.rusherhack.core.setting.Setting;

public class CommandData implements INamed {
   public String[] f1444;
   public List<CommandData> f1445;
   public List<CommandData$MethodData> f1446;
   public CommandData f1447;
   public AbstractCommand f1448;
   public String f1449;
   public static Object[] f1451 = new Object[40];
   public static String[] f1452 = new String[40];

   public CommandData(AbstractCommand var1) {
      this(var1, var1.getName().toLowerCase(), var1.getAliases());
   }

   public List<CommandData$MethodData> getMethods() {
        return null;
    }

   public void addMethod(Method var1, List<CommandData$ArgumentData> var2) {
        
    }

   public AbstractCommand getCommand() {
        return null;
    }

   @Override
   public String getName() {
        return null;
    }

   @Override
   public String[] getAliases() {
        return null;
    }

   public List<CommandData> getSubCommands() {
        return null;
    }

   public CommandData findSubCommand(String var1) {
        return null;
    }

   public CommandData getParent() {
        return null;
    }

   public void setParent(CommandData var1) {
        
    }

   public CommandData(AbstractCommand var1, String var2, String... var3) {
    }

   static {
      m122();
   }
   public static void m122() {
      f1451[0] = "qX\u0015\u0004G9oP\u000fK%%hM";
      f1451[1] = int.class;
      f1452[1] = "java/lang/Integer";
      f1451[2] = "$KLZ\r`8QN\u0006\u0017t(R\u0005\u0017\u0010g.\u0017H\u001b\u0012x*WOZ<z&TJ\u001a\u001bQ*MJP2p?QD\u0010;t?X";
      f1451[3] = "\u0015f\u000fiD\"\t|\r5^6\u0019\u007fF$Y%\u001f:\u000b([:\u001bz\fiu8\u0017y\t)R\u0013\u001b`\t";
      f1451[4] = "g9\b`-5\u0012\u0019\u0003o<zo\u0001\u0010h53\u0007";
      f1451[5] = "\u007f\u0011~D\b]t\u001eo\u000buEg\u0019fB";
      f1451[6] = "YE@^$`E_B\u0002>tU\\\t\u00139gS\u0019D\u001f;xWYC^\u0017wECU\u00115auXJ\u001d7{R";
      f1451[7] = "$4+ A#\r\r7:C\u007f\u0017\u0019'9\bn\u0010\n!|Uh\u000b\f-<A#,\u001d0&Oc\u0018C";
      f1451[8] = "}sD7XUaiFkBAqj\rzERw/P|^T{oD7yEfuJwM";
      f1451[9] = "nXc,{*\u001bxh#jef`{$c,\u000e";
      f1451[10] = "BAU7` kxI-b|qlY.)mv\u007f_ktkmyS+` JhN1n`~6";
      f1451[11] = void.class;
      f1452[11] = "java/lang/Void";
      f1451[12] = "`9\u001cMF*|#\u001e\u0011\\>l Uȗ";
      f1451[13] = "Qi\\\u0018wXZfMW\u0016VQmI\r";
      f1451[14] = boolean.class;
      f1452[14] = "java/lang/Boolean";
      f1451[15] = "*\tA\u00147\u00184\u0001[[Z\u0002-\u0018V\u0007x\u0019/\u001a";
      f1451[16] = "O6[\u0001\u0015SQ>AN]SK4Y\tTH\u000b\u0003B)URc\"C\u0003OOJ9";
      f1451[17] = ".\u0010\"\u001a~e0\u00188U\u0019d!\u00035\u000f?b";
      f1451[18] = "\u007f[.'pe\n{%(a*wc6/hc\u001f";
      f1451[19] = "s.\r_dOv#\u0006R\u0007ԈI\u007fG\u0004\u007fZ#-_[l";
      f1451[20] = "\u001e\nZ\"\u0013%J\u001dHo)1\u0018\u0017V_\u0018h\u0013^F=\u00147\u001c\u001a*";
      f1451[21] = ":\fZp\u001e\u001fg\u0002U:!\u001a\u0006Q\u000e8\u001fOeV\u00077\u001a\u007f";
      f1451[22] = "NwC1\f\u0005Jn^CX\u0014\u0018\u0016\u0015|WA\u0018t\u0019#X\u0005t\u007f\u0014<\rI\tsIs]x";
      f1451[23] = "fC\n\tM\u001c#A\u001eE1ԟX\u0015\u0012[M\u00136\u000e\u0012\fU~";
      f1451[24] = "n\u001cbz\u001euz\rw)df`\u0018t*\u001ela\u0012M%\u0018\rmMb3\u00190<Ab9ddf\u001359\u001cpw\u0006fC";
      f1451[25] = "L4\u001e:e\u0001I9\u00157\u0006\u001f\u001b\"fcg\u0019\r3T\u0007m\u0012\u0018\"Biv\u0012O:/";
      f1451[26] = "F{\"\u001a\u001bMCv)\u0017xč|+r@\n\u0001\u0001/k]";
      f1451[27] = "TQc\u001b?\u007fQ\\h\u0016\\һn\u00018\u0017am\u001f\u00045\u001cl";
      f1451[28] = "O\u007fLd\u001b\u0014KfQ\u0016]\u000e\u000fb+\u007fG\u0007LdSkV\u0012\u001f\u001e\u0014m_\u0004\u001a}P}_Vu";
      f1451[29] = "~\u001a\u0005\tx1z\u0003\u0018{$0)\u0001\u000b\u0007\"6D\u0010\u000f\u000b8v6D\u0018\u0019uL";
      f1451[30] = "uA~}\u0000EpLupcǶO@-.\u001fY![-y\u0007";
      f1451[31] = "LLDKmJIAOF\u000eӤv\u001c\u0014\u0011|\u0006\u000b\u0018\r\f";
      f1451[32] = "\u0002\u0004|Or*\u0007\twB\u00114U\u0012\u000b\u001bt68U6\u0014i?R\u0007.Kz[";
      f1451[33] = "\u001eJm\u0014:GCDb^\u0005ȩ\"\u00179\\;\u0017A\u00100S>'\u001dSxAjDYCx\u0013\u0005";
      f1451[34] = "\u0017\u001e\\\u0010~\r\u0013\u0007Ab8\u0011_\u0012;\u0010y\u0014\u0016B_[z\u0010-";
      f1451[35] = "AzRv7x\u0015m@;\rjCldf}v*~\u0012t1;WrO;a\n";
      f1451[36] = "zkm\r#C\u007fff\u0000@[@1=\\1V\"z$\b|2p`0A$P;yd\f@";
      f1451[37] = "\u0006}QU\u0003!Ch]Sxŵ? \u0000O\ngB$\u0019R";
      f1451[38] = "Lj\u0017OPhIg\u001cB3Ήv<D\u001e\u000b&\u0016aJ\u0011A";
      f1451[39] = "07\\\u001e\u0013\u001ab/\u0003\rw\u001dr1S\u0002\f1d*]\u001c\u001a;b7WfL\u000bm4^\f\u001e\u00132':\u000fG\u000f7}G\u0003\u001a@gL";
   }
}
