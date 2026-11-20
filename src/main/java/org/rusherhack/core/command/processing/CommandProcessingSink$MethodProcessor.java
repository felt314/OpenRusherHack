/*
 * Decompiled with CFR 0.152.
 */
package org.rusherhack.core.command.processing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.command.CommandData;
import org.rusherhack.core.command.CommandData$ArgumentData;
import org.rusherhack.core.command.CommandData$MethodData;
import org.rusherhack.core.command.exceptions.ArgumentException;
import org.rusherhack.core.command.exceptions.BadSyntaxException;
import org.rusherhack.core.command.exceptions.CommandException;
import org.rusherhack.core.command.exceptions.UnknownArgumentTypeException;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.command.processing.CommandProcessingSink$ProcessedCommand;
import org.rusherhack.core.command.processing.CommandProcessor;

import org.rusherhack.command.clear;
public class CommandProcessingSink$MethodProcessor {
    public LinkedHashMap<CommandData$ArgumentData, Object> f1532;
    public CommandData$MethodData f1533;
    public int f1534;
    public CommandException f1535;
    public /* synthetic */ CommandProcessingSink this$0;
    public CommandData f1536;
    public static long f1537 = Class066.m4320(-7513782355295942837L, -2283174664642355306L, MethodHandles.lookup().lookupClass()).m4325(17681195128947L);
    public static String[] f1538;
    public static String[] f1539;
    public static Map f1540;
    public static Object[] f1541;
    public static String[] f1542;

    public CommandData$MethodData getMethodData() {
        return null;
    }

    public int getBaseDepth() {
        return 0;
    }

    public CommandProcessingSink$ProcessedCommand processed() {
        return null;
    }

    public CommandProcessingSink$MethodProcessor(CommandProcessingSink commandProcessingSink, CommandData object, CommandData$MethodData commandData$MethodData) {
    }

    public CommandException getError() {
        return null;
    }

    public LinkedHashMap<CommandData$ArgumentData, Object> getParsedArguments() {
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void process(String ... var1_2) {
        
    }

    public CommandData getCommandData() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
    }
    public static String m117(byte[] byArray) {
        return null;
    }

    public static String m153(int n, long l) {
        return null;
    }

    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        return null;
    }
    public static int m121(long l, long l2) {
        return 0;
    }

    public static void m122() {
        
    }

    public static Class m123(long l, long l2) {
        return null;
    }

    public static Field m124(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m125(Class clazz, String string, Class clazz2) {
        return null;
    }

    public static Field m126(long l, long l2) {
        return null;
    }

    public static Method m127(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m128(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        return null;
    }

    public static Method m129(long l, long l2) {
        return null;
    }

    public static MethodHandle m130(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        return null;
    }

    public static Object m131(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        return null;
    }
    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        return null;
    }

   public static IllegalStateException a(Throwable var0) {
        return new IllegalStateException((Throwable)null);
    }
}

