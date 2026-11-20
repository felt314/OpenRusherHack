// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.Event559;
import org.rusherhack.Event174;
import org.rusherhack.Event559;
import org.rusherhack.Event174;

import java.lang.reflect.UndeclaredThrowableException;
import net.minecraft.entity.Entity;
import org.rusherhack.core.logging.ILog;
import org.rusherhack.client.api.feature.module.Module;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.rusherhack.client.api.events.network.EventPacket;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.awt.SystemTray;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.client.api.events.client.internal.EventNotification;
import java.lang.invoke.MethodHandles;
import org.rusherhack.client.api.events.client.EventQuit$Reason;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.core.event.subscribe.Subscribe;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket;
import org.rusherhack.core.command.CommandUtils;
import net.minecraft.world.World;
import org.rusherhack.client.api.Globals;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import java.awt.TrayIcon;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.toggle;
public class Module603 extends ToggleableModule
{
    public BooleanSetting f9535;
    public static TrayIcon f9536;
    public BooleanSetting f9537;
    public BooleanSetting f9538;
    public BooleanSetting f9539;
    public BooleanSetting f9540;
    public BooleanSetting f9541;
    public BooleanSetting f9542;
    public BooleanSetting f9543;
    public BooleanSetting f9544;
    public BooleanSetting f9545;
    public static long f9546;
    public static Object[] f9553;
    
    @Subscribe
    public void m18277(EventPacket$Receive eventPacket$Receive) {
        
    }
    
    public Module603() {
    }
    
    @Subscribe
    public void m18278(EventQuit eventQuit) {
        
    }
    
    @Subscribe
    void m18279(Event174 obf174) {
        
    }
    
    
    
    public void onEnable() {
        
    }
    
    @Subscribe
    public void m18280(EventNotification eventNotification) {
        
    }
    
    public void m18281(String text) {
        
    }
    
    public void onDisable() {
        
    }
    
    @Subscribe
    void m18282(Event559 obf559) {
        
    }
    
    public static IllegalStateException m1393(Throwable t) {
        return new IllegalStateException((Throwable)null);
    }
    
    public static CallSite m174(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    public static CallSite m177(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    static {
        f9553[61] = "b\u0006\u01d8\ru?d7Yn{1no";
        f9553[62] = "\u001cJg\\\u0007z\\\u000e8C6$\u0003\u001cg]ap_H3\b66\u0019\u000eb\u0000\f:\u001eId";
        f9553[63] = "$\u000f\u001875\u001es\u0010]6\u0005Lq\u0003f0eKc\n\u0001dh\u001b}o[lg@b\u0011\tlhT\u001d";
        f9553[64] = "i\u000ek_x;dT?\t@,h\u00000\\\u0017{7]k0<;1PdV~ztV";
        f9553[65] = "\u00173U=)\u0002\u0015<D(T?8\u0015qP:\u0007\u0016#G(8\b\u00076";
        f9553[66] = "k;3a.4.:r~_8~$oz3\n.h7 _7-ca 63|5r\u001d";
        f9553[67] = "SF\u0018gBiT\u001e\u0012?|l[J\u0005^\u0018k\b\u0012W8\u001eoOLi8AiON\u0006:\u0006oO#";
        f9553[68] = "`$v*IP3k+3s\u000eoe]3\u001a\u001ay]q>\u001f\fx\u0019t4\u0010\bpv/>\u0002\u0002\u0002";
        f9553[69] = "\u0019\u0001IOef\u0007DO\u0016_\u03c9\u007f\u001e_\u0019fdDBB\ro\u000b";
        f9553[70] = """
                    |4TH"r)(Q
                    M%=>]\fMt.+U\u001b&q\u007fu
                    vpu =[F-p+z:K.*";D\u0019.%6D""";
        f9553[71] = "ym+x^\u0005mo,e8\u0005jo\u000ejS\tjoV|A\u0012?#kjS\u0010x\u0013";
        f9553[72] = "=+W\u001aw\u0005y\"\r\u0017M\u04ec\u0003%O\u0011|\u0001`+A\u001b$";
        f9553[73] = "Y:$[U\u0010\u0011%c]8\u001eD+8\u0001T,\u0010nh]\u0003{W.%\u0007\tG[>!\u00018";
        f9553[74] = "\u0014V]i\u0013\u0014CI\u0018h#U@SD/N/\u0012VM/FHF[\u001d1#\u0012NTF.]@N[RQ";
        f9553[75] = "m<\\\\7\u000e{=\u0002]I\u0006iZ_^v\f:#R\u0004\"Z";
        f9553[76] = "v\u0016\n~_:2\u001fPsenHB\u001b|\u0014?0\u0003\u000fv\t\u0007x\t\fa]\u007f9\u001d\u0006|e";
        f9553[77] = "faz\u001f\u001d+28zTr1:jq\u001e\u000e&-^}\u0019\u000e*1jke\u001f4jhy\u0003\u0018&5w\u0010X\u0011)2zn\n\u0011&&\u0005";
        f9553[78] = "tB0t\u0003,$R:+s\u03e7N\u001c+\u007f\u001cq%\u0019z!C\u001crI-\u007f\u001eww\u0018s s";
        f9553[79] = "\u0013|| 6~G%|kYqOdR=6qOb\u00163igMbj((eO\u0018";
        f9553[80] = "`8+[\u0000k7'nZ01\"\u0003(\u001bH7#$8\u000f0:gc;^Y>65(c";
        f9553[81] = "6G\u0015OtQ3\u0016K\u0010\u0019Fmj\u001d_t@AG\u0001M\u0019\u0006cA\u0015Mr\u00032\u001fJ ";
        f9553[82] = "a\u000fh%=B%\u00062(\u0007\u01ef_\u0001p.6F<\u000f~$n";
        f9553[83] = "h\u000e\u000fD\u00064aJ\u001eIh\r_z$8\u0019vuH\r@\u00102dE";
        f9553[84] = "Zk|e*\u0019Ygs>TL99j5,DYazm9";
        f9553[85] = "&J1I?\u0015'Xts0\u0001cq)\u000f>\u0002~\\'\u000f>\u000byr'\u00156\u0003rMN\u0002/\u0003z\\\"\u001c.\u000b\u001f";
        f9553[86] = "bHU}\u001bx5W\u0010|+,6Tp4P?6Mw?B2[\u0011K;\u0013s`FT~\u0012C";
        f9553[87] = "k7_d7,;'U;G\u057cQn\u0011a=m/?_y9\u001c";
        f9553[88] = ",!}QBj|1w\u000e2\u0203\u0016x3TH+h)}LLZ";
        f9553[89] = "|V\u0018;A\"'\\\n13\"sI!?H*cO\u0010?z6EI\u0001?Z(\u001e\t\u0012=\\ u\fCc\u0003MzHEc\r+|L\u0002=3";
        f9553[90] = "&Ze\u0019\u0012\trW5\u0007w\u0002xAs\u0003\u001e\u001f\\Wp\u001c\u001e\u0001t:7\u000e\u0018\u0001tQ2_F^\u0019\u0006b\b\u0018\u0003r\u00033VGnvT:\u0001\r\u0001`C;^wSzXn\u0018\t\u0001zWzg";
        f9553[91] = "/Q ( :m\u0010e.\u00109>Txr|\u000bi\u0017)%+\\/Sgt!f#T r\u0010";
        f9553[92] = "&\\\u0014HS-0K\u0015\u0017)\u0003\u000f|b.F,xT_AP;y\u000b";
        f9553[93] = "(;A\u0010\u001d2t&U\u0019rd69FM\t\t.'\u0011NCk2#]Ercq\u007fA\u0014\u001bg )R)";
        f9553[94] = "\r\u0007\u0003DY&AC\u0019\u001d=p=\u0007\u000b\u0013R1V\u0002ZM\r\\\u0001R\r\u0013P7\u0004\u0003SL=";
        f9553[95] = "k;\nWE'fa^\u0001};f$U_\u0011\t2e\u000b\t}45c[\u0005\u00140d5H8";
        f9553[96] = "kA, \u0017]~\u0007%u+\\wG\u001b'[O\u001a\u0007.%D^q\u0002\u007f{\u001b3";
        f9553[97] = "B\u0019\"_xb\u0015\u0016q_I|C\u0018\u0012Y-nCd-Swt\u001f\u00061W;\u007f.";
        f9553[98] = ":96i\u001c-/\u007f?< ,&?\u0001rX.K2go\\-3;#~QC";
        f9553[99] = "\b.\u001d[\u0006\u0010L'GV<\u01106 \u0005P\r\u0014U.\u000bZU";
        f9553[100] = "O\u0005:~cRJTd!\u000eB\u000f\u0005/muf\u0012\u00105\u00112P\u001c\u00038z7\u0001B\\U{0\u0002\u001dQ<\u007faT\u000el";
        f9553[101] = "%l\u0002);trcQ)\nl%}7;`^$m\u0010'lj2\u0011\u000197h w\u0006+hwI,\u000f$oz7~\u000f+{\u0005";
        f9553[102] = "RKe\u001e\u001e2\u0017J$\u0001o>GT9\u0005\u0003\f\u0014\u0010bXo%SU8SS)CQ>b";
        f9553[103] = "U!\u0018\u0001r\u0017]iQ\u0005HC@/:\u0001!WJ5`\u0015\"\\K:\u001fTtKDS";
        f9553[104] = "+?; \u000b@o6a-1\u04e5\u00151#+\u0000Dv?-!X";
        f9553[105] = "\u0018\u0012V\u0002ic]\u0013\u0017\u001d\u0018o\r\r\n\u0019t]]MUA\u0018q\u000bL\u0016\u0013ir\u001c\u0010\u001b~";
        f9553[106] = "o[\u00197xVj\f\u0019>\u0007Cd\u0005G5nO]\u000bG%j)i\\\u00186:@m\rN%\u0007";
        f9553[107] = "_xv\u001dr\u0015\\o*\u0010\u001f\u000bIo\u0010\u001de\u0005B|K]v\u000bK~ X'U\u0014\u0013";
        f9553[108] = "\u0013|6?JYWul2p\u0512-$5>\u001f\tF!d`@d\u0010{>4\u000f\u001aB{1 p";
        f9553[109] = "\b\u0007$P\u0016x\u0005]p\u0006.o\t\t\u007fSy8W^'?VbT\u0018jV\u0013c\u0015\u0007";
        f9553[110] = "O\u000e)\u0007\u0006}\u000eX>\boNw?\u0012&)D{/\u0005a\u0016hF\u00020\u001eW>Q\r";
        f9553[111] = "qxMY__#;K\u001enR\u007feIC\u0003.%iDB\u0011PwiKVn";
        f9553[112] = "sK3\u007f\u001d#7Bir'bME+t\u0016'.K%~N";
    }
    
    public static Field m181(Class clazz, String anObject, Class clazz2) {
        return null;
    }
    
    public static Field m182(Class clazz, String s, Class clazz2) {
        return null;
    }
    
    public static Method m184(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static Method m185(Class clazz, String s, Class clazz2, int n, Class[] array) {
        return null;
    }
    
    public static CallSite m265(MethodHandles.Lookup p0, String p1, MethodType p2) {
        return null;
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_1
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_2
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_3
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_4
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_5
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_6
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_7
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_8
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_9
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_10
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_11
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_12
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_13
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_14
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_15
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_16
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_17
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_18
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_19
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_20
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_21
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_22
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_23
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_24
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_25
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_26
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_27
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_28
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_29
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_30
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
        return null;
    }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
}
