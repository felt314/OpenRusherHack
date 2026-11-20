// 
// Decompiled by Procyon v0.6.0
// 

package org.rusherhack;
import net.minecraft.client.render.VertexConsumerProvider;

import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.BufferBuilderStorage;
import net.minecraft.client.render.Camera;
import net.minecraft.client.MinecraftClient;
import java.lang.reflect.UndeclaredThrowableException;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import javax.crypto.SecretKey;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.GameRenderer;
import org.joml.Matrix3f;
import net.minecraft.util.math.BlockPos;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.math.Box;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Direction;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.client.util.Window;
import org.joml.Vector3f;
import org.joml.Vector4f;
import net.minecraft.util.math.Vec2f;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.client.api.events.render.EventRender3D;
import java.util.Map;
import net.minecraft.client.render.Frustum;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.util.BufferAllocator;
import org.rusherhack.client.api.render.IRenderer3D;

public class Class352 implements IRenderer3D
{
    public BufferAllocator f5707;
    public BufferBuilder f5708;
    public BufferBuilder f5709;
    public Matrix4f f5710;
    public BufferAllocator f5711;
    public BufferAllocator f5712;
    public BufferBuilder f5713;
    public BufferAllocator f5714;
    public float f5715;
    public BufferBuilder f5716;
    public BufferAllocator f5717;
    public Matrix4f f5718;
    public MatrixStack f5719;
    public Matrix4f f5720;
    public boolean f5721;
    public Vec3d f5722;
    public Matrix4f f5723;
    public Frustum f5724;
    public static Class352 f5725;
    public boolean f5726;
    public Vec3d f5727;
    public BufferBuilder f5728;
    public Matrix4f f5729;
    public static long f5730;
    public static String[] f5731;
    public static String[] f5732;
    public static Map f5733;
    public static long[] f5734;
    public static Integer[] f5735;
    public static Map f5736;
    public static Object[] f5737;
    public static String[] f5738;
    
    @Subscribe(priority = 999)
    public void m11472(EventRender3D eventRender3D) {
        long n = Class352.f5730 ^ 0x6039BBDE6B07L;
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_6.invoke(ProcyonInvokeDynamicHelper_2.invoke(this, -6756347595804501763L, n), ProcyonInvokeDynamicHelper_5.invoke(ProcyonInvokeDynamicHelper_4.invoke(ProcyonInvokeDynamicHelper_3.invoke(eventRender3D, -6769947875021352343L, n), -6757149695580807307L, n), -6769065549256485356L, n), -6755675334938019971L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_9.invoke(ProcyonInvokeDynamicHelper_7.invoke(this, -6756261231946927451L, n), ProcyonInvokeDynamicHelper_8.invoke(-6758246962714921419L, n), -6755675334938019971L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_12.invoke(ProcyonInvokeDynamicHelper_10.invoke(this, -6769747576663910223L, n), ProcyonInvokeDynamicHelper_11.invoke(-6772481530291161284L, n), -6755675334938019971L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_20.invoke(ProcyonInvokeDynamicHelper_18.invoke(ProcyonInvokeDynamicHelper_16.invoke(ProcyonInvokeDynamicHelper_14.invoke(ProcyonInvokeDynamicHelper_13.invoke(this, -6755573819870565836L, n), new Matrix4f(), -6755675334938019971L, n), ProcyonInvokeDynamicHelper_15.invoke(this, -6756261231946927451L, n), -6763861881115753044L, n), ProcyonInvokeDynamicHelper_17.invoke(this, -6769747576663910223L, n), -6763861881115753044L, n), ProcyonInvokeDynamicHelper_19.invoke(this, -6756347595804501763L, n), -6763861881115753044L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_24.invoke(ProcyonInvokeDynamicHelper_21.invoke(this, -6756436342988488958L, n), ProcyonInvokeDynamicHelper_23.invoke(ProcyonInvokeDynamicHelper_22.invoke(this, -6755573819870565836L, n), new Matrix4f(), -6758385176511907628L, n), -6755675334938019971L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_29.invoke(this, ProcyonInvokeDynamicHelper_28.invoke(ProcyonInvokeDynamicHelper_27.invoke(ProcyonInvokeDynamicHelper_26.invoke(ProcyonInvokeDynamicHelper_25.invoke(-6756006052500820132L, n), -6758838047197720087L, n), -6759304507975240068L, n), -6757298310799516379L, n), -6769358429885574661L, n);
    }
    
    public Vec2f projectToScreen(Vec3d vec3d) {
        long n = Class352.f5730 ^ 0x5DC05A1633DBL;
        Vec3d vec3d2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_33.invoke(ProcyonInvokeDynamicHelper_32.invoke(ProcyonInvokeDynamicHelper_31.invoke(ProcyonInvokeDynamicHelper_30.invoke(-368761134728808576L, n), -364803239248737995L, n), -365321924714680672L, n), -367750333885397511L, n);
        Window window = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_35.invoke(ProcyonInvokeDynamicHelper_34.invoke(-368761134728808576L, n), -366309565848146204L, n);
        int[] array = { /* invokedynamic(!) */ProcyonInvokeDynamicHelper_36.invoke(-365504196412064746L, n), /* invokedynamic(!) */ProcyonInvokeDynamicHelper_37.invoke(-365490570728639965L, n), /* invokedynamic(!) */ProcyonInvokeDynamicHelper_38.invoke(-365395891152803898L, n), /* invokedynamic(!) */ProcyonInvokeDynamicHelper_39.invoke(-371030979317060237L, n) };
        Vector4f vector4f = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_47.invoke(new Vector4f((float)(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_40.invoke(vec3d, -371819501399987887L, n) - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_41.invoke(vec3d2, -371819501399987887L, n)), (float)(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_42.invoke(vec3d, -372722524094197198L, n) - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_43.invoke(vec3d2, -372722524094197198L, n)), (float)(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_44.invoke(vec3d, -361392009549799746L, n) - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_45.invoke(vec3d2, -361392009549799746L, n)), 1.0f), ProcyonInvokeDynamicHelper_46.invoke(this, -369123296047120351L, n), -365796223243482910L, n);
        Matrix4f matrix4f = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_50.invoke(ProcyonInvokeDynamicHelper_48.invoke(this, -369068887787492743L, n), ProcyonInvokeDynamicHelper_49.invoke(this, -373451822818754451L, n), -360900890954949264L, n);
        Vector4f vector4f2 = vector4f;
        Vector3f vector3f2;
        Vector3f vector3f = vector3f2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_54.invoke(matrix4f, ProcyonInvokeDynamicHelper_51.invoke(vector4f2, -365113292652137544L, n), ProcyonInvokeDynamicHelper_52.invoke(vector4f2, -373776098702034130L, n), ProcyonInvokeDynamicHelper_53.invoke(vector4f, -370602354376733315L, n), array, new Vector3f(), -368294059208567062L, n);
        try {
            if (/* invokedynamic(!) */ProcyonInvokeDynamicHelper_56.invoke(ProcyonInvokeDynamicHelper_55.invoke(vector3f, -367215335515117286L, n), -361101022652115046L, n) > 1.0f) {
                return null;
            }
        }
        catch (IllegalStateException ex) {

        }
        return new Vec2f((float)((double)/* invokedynamic(!) */ProcyonInvokeDynamicHelper_58.invoke(vector3f2, -366134171188245738L, n) / /* invokedynamic(!) */ProcyonInvokeDynamicHelper_59.invoke(window, -372643315679454121L, n)), (float)((double)((float)/* invokedynamic(!) */ProcyonInvokeDynamicHelper_60.invoke(window, -368017027346564241L, n) - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_61.invoke(vector3f2, -373234832899589351L, n)) / /* invokedynamic(!) */ProcyonInvokeDynamicHelper_62.invoke(window, -372643315679454121L, n)));
    }
    
    public BufferBuilder getQuadsBuffer() {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_63.invoke(this, 4860777663272931985L, Class352.f5730 ^ 0x7A88F7C18A74L);
    }
    
    public void begin(MatrixStack matrixStack) {
        
    }
    
    public void m11474(Matrix4f matrix4f, float n, float n2, float n3, float n4, float n5, float n6, int n7) {
        long n8 = Class352.f5730 ^ 0x66040126C08DL;
        n = n;
        n2 = n2;
        n3 = n3;
        n4 += n;
        n5 += n2;
        n6 += n3;
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_125.invoke(ProcyonInvokeDynamicHelper_124.invoke(ProcyonInvokeDynamicHelper_123.invoke(this, 688469148739442792L, n8), matrix4f, n, n2, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_128.invoke(ProcyonInvokeDynamicHelper_127.invoke(ProcyonInvokeDynamicHelper_126.invoke(this, 688469148739442792L, n8), matrix4f, n4, n2, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_131.invoke(ProcyonInvokeDynamicHelper_130.invoke(ProcyonInvokeDynamicHelper_129.invoke(this, 688469148739442792L, n8), matrix4f, n4, n2, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_134.invoke(ProcyonInvokeDynamicHelper_133.invoke(ProcyonInvokeDynamicHelper_132.invoke(this, 688469148739442792L, n8), matrix4f, n, n2, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_137.invoke(ProcyonInvokeDynamicHelper_136.invoke(ProcyonInvokeDynamicHelper_135.invoke(this, 688469148739442792L, n8), matrix4f, n, n5, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_140.invoke(ProcyonInvokeDynamicHelper_139.invoke(ProcyonInvokeDynamicHelper_138.invoke(this, 688469148739442792L, n8), matrix4f, n4, n5, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_143.invoke(ProcyonInvokeDynamicHelper_142.invoke(ProcyonInvokeDynamicHelper_141.invoke(this, 688469148739442792L, n8), matrix4f, n4, n5, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_146.invoke(ProcyonInvokeDynamicHelper_145.invoke(ProcyonInvokeDynamicHelper_144.invoke(this, 688469148739442792L, n8), matrix4f, n, n5, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_149.invoke(ProcyonInvokeDynamicHelper_148.invoke(ProcyonInvokeDynamicHelper_147.invoke(this, 688469148739442792L, n8), matrix4f, n, n2, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_152.invoke(ProcyonInvokeDynamicHelper_151.invoke(ProcyonInvokeDynamicHelper_150.invoke(this, 688469148739442792L, n8), matrix4f, n4, n2, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_155.invoke(ProcyonInvokeDynamicHelper_154.invoke(ProcyonInvokeDynamicHelper_153.invoke(this, 688469148739442792L, n8), matrix4f, n4, n5, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_158.invoke(ProcyonInvokeDynamicHelper_157.invoke(ProcyonInvokeDynamicHelper_156.invoke(this, 688469148739442792L, n8), matrix4f, n, n5, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_161.invoke(ProcyonInvokeDynamicHelper_160.invoke(ProcyonInvokeDynamicHelper_159.invoke(this, 688469148739442792L, n8), matrix4f, n4, n2, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_164.invoke(ProcyonInvokeDynamicHelper_163.invoke(ProcyonInvokeDynamicHelper_162.invoke(this, 688469148739442792L, n8), matrix4f, n4, n2, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_167.invoke(ProcyonInvokeDynamicHelper_166.invoke(ProcyonInvokeDynamicHelper_165.invoke(this, 688469148739442792L, n8), matrix4f, n4, n5, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_170.invoke(ProcyonInvokeDynamicHelper_169.invoke(ProcyonInvokeDynamicHelper_168.invoke(this, 688469148739442792L, n8), matrix4f, n4, n5, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_173.invoke(ProcyonInvokeDynamicHelper_172.invoke(ProcyonInvokeDynamicHelper_171.invoke(this, 688469148739442792L, n8), matrix4f, n, n2, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_176.invoke(ProcyonInvokeDynamicHelper_175.invoke(ProcyonInvokeDynamicHelper_174.invoke(this, 688469148739442792L, n8), matrix4f, n4, n2, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_179.invoke(ProcyonInvokeDynamicHelper_178.invoke(ProcyonInvokeDynamicHelper_177.invoke(this, 688469148739442792L, n8), matrix4f, n4, n5, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_182.invoke(ProcyonInvokeDynamicHelper_181.invoke(ProcyonInvokeDynamicHelper_180.invoke(this, 688469148739442792L, n8), matrix4f, n, n5, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_185.invoke(ProcyonInvokeDynamicHelper_184.invoke(ProcyonInvokeDynamicHelper_183.invoke(this, 688469148739442792L, n8), matrix4f, n, n2, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_188.invoke(ProcyonInvokeDynamicHelper_187.invoke(ProcyonInvokeDynamicHelper_186.invoke(this, 688469148739442792L, n8), matrix4f, n, n2, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_191.invoke(ProcyonInvokeDynamicHelper_190.invoke(ProcyonInvokeDynamicHelper_189.invoke(this, 688469148739442792L, n8), matrix4f, n, n5, n6, 699727789644545085L, n8), n7, 701528259625714663L, n8);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_194.invoke(ProcyonInvokeDynamicHelper_193.invoke(ProcyonInvokeDynamicHelper_192.invoke(this, 688469148739442792L, n8), matrix4f, n, n5, n3, 699727789644545085L, n8), n7, 701528259625714663L, n8);
    }
    
    public void drawBox(double n, double n2, double n3, double n4, double n5, double n6, boolean b, boolean b2, int n7) {
        long n8 = Class352.f5730 ^ 0x5B2ADAEB09EEL;
        double n9 = 0.0;
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_196.invoke(this, ProcyonInvokeDynamicHelper_195.invoke(n9, n9, n9, n4, n5, n6, -4549951884325033321L, n8), n, n2, n3, b, b2, n7, -4545082514702204941L, n8);
    }
    
    public Class352() {
    }
    
    public void drawPlane(double n, double n2, double n3, double n4, double n5, Direction direction, boolean b, boolean b2, int n6) {
        long n7 = Class352.f5730 ^ 0x18B81D0535A7L;
        Label_0224: {
            Label_0195: {
                Label_0163: {
                    Label_0134: {
                        try {
                            switch (/* invokedynamic(!) */ProcyonInvokeDynamicHelper_215.invoke(-246375166348007030L, n7)[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_216.invoke(direction, -246774902431378808L, n7)]) {
                                case 1:
                                case 2: {
                                    break;
                                }
                                case 3: {
                                    break Label_0134;
                                }
                                case 4: {
                                    break Label_0163;
                                }
                                case 5: {
                                    break Label_0195;
                                }
                                case 6: {
                                    break Label_0224;
                                }
                                default: {
                                    return;
                                }
                            }
                        }
                        catch (IllegalStateException ex) {

                        }
                        try {
                            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_218.invoke(this, n, n2, n3, n4, 0.01, n5, b, b2, n6, -245842454222418871L, n7);
                            return;
                        }
                        catch (IllegalStateException ex2) {

                        }
                    }
                    /* invokedynamic(!) */ProcyonInvokeDynamicHelper_220.invoke(this, n, n2, n3, n4, n5, 0.01, b, b2, n6, -245842454222418871L, n7);
                    return;
                }
                /* invokedynamic(!) */ProcyonInvokeDynamicHelper_221.invoke(this, n, n2, n3 + n5, n4, n5, 0.01, b, b2, n6, -245842454222418871L, n7);
                return;
            }
            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_222.invoke(this, n, n2, n3, 0.01, n5, n4, b, b2, n6, -245842454222418871L, n7);
            return;
        }
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_223.invoke(this, n + n5, n2, n3, 0.01, n5, n4, b, b2, n6, -245842454222418871L, n7);
    }
    
    public void drawBox(Entity entity, float n, boolean b, boolean b2, int n2) {
        long n3 = Class352.f5730 ^ 0xBE4EF5A77DEL;
        Box box = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_228.invoke(ProcyonInvokeDynamicHelper_224.invoke(entity, -4692462254540175308L, n3), -/* invokedynamic(!) */ProcyonInvokeDynamicHelper_225.invoke(entity, -4696783533795398852L, n3), -/* invokedynamic(!) */ProcyonInvokeDynamicHelper_226.invoke(entity, -4691607979253610103L, n3), -/* invokedynamic(!) */ProcyonInvokeDynamicHelper_227.invoke(entity, -4690140773733623773L, n3), -4690360101297444269L, n3);
        double[] array = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_229.invoke(entity, n, -4693038487971961870L, n3);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_236.invoke(this, array[0] + /* invokedynamic(!) */ProcyonInvokeDynamicHelper_230.invoke(box, -4696379509850086802L, n3), array[1] + /* invokedynamic(!) */ProcyonInvokeDynamicHelper_231.invoke(box, -4693520205261144690L, n3), array[2] + /* invokedynamic(!) */ProcyonInvokeDynamicHelper_232.invoke(box, -4690760710679048840L, n3), ProcyonInvokeDynamicHelper_233.invoke(box, -4693740551275716068L, n3), ProcyonInvokeDynamicHelper_234.invoke(box, -4688870293983557432L, n3), ProcyonInvokeDynamicHelper_235.invoke(box, -4690521839219551595L, n3), b, b2, n2, -4688382676048835024L, n3);
    }
    
    public MatrixStack getMatrixStack() {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_237.invoke(this, -2721319384886606801L, Class352.f5730 ^ 0x6BCE9F7A1306L);
    }
    
    public BufferBuilder getTriangleFanBuffer() {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_238.invoke(this, -2129581781192562357L, Class352.f5730 ^ 0x37FC1F052B73L);
    }
    
    public BufferBuilder getLineStripBuffer() {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_239.invoke(this, 2727698637446576076L, Class352.f5730 ^ 0x54535E9AECD7L);
    }
    
    public void setDepthTest(boolean b) {
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_240.invoke(this, b, -1690008743098276661L, Class352.f5730 ^ 0x61AE83F821B2L);
    }
    
    public void drawShape(VoxelShape p0, double p1, double p2, double p3, boolean p4, boolean p5, int p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          133916356135911
        //     6: lxor           
        //     7: lstore          11
        //     9: ldc2_w          -9013394492143420005
        //    12: lload           11
        //    14: invokedynamic   BootstrapMethod #0, y:(JJ)I
        //    19: istore          13
        //    21: aload_0        
        //    22: aload_1        
        //    23: astore_0       
        //    24: astore_1       
        //    25: aload_0        
        //    26: ldc2_w          -9019092065684280363
        //    29: lload           11
        //    31: invokedynamic   BootstrapMethod #0, \u00d3:(Ljava/lang/Object;JJ)Z
        //    36: iload           13
        //    38: ifeq            138
        //    41: ifne            142
        //    44: goto            58
        //    47: ldc2_w          -9019271285301145521
        //    50: lload           11
        //    52: invokedynamic   BootstrapMethod #0, y:(Ljava/lang/Object;JJ)Ljava/lang/IllegalStateException;
        //    57: athrow         
        //    58: aload_1        
        //    59: iload           13
        //    61: ifeq            143
        //    64: goto            78
        //    67: ldc2_w          -9019271285301145521
        //    70: lload           11
        //    72: invokedynamic   BootstrapMethod #0, y:(Ljava/lang/Object;JJ)Ljava/lang/IllegalStateException;
        //    77: athrow         
        //    78: ldc2_w          -9018410604111962401
        //    81: lload           11
        //    83: invokedynamic   BootstrapMethod #0, M:(Ljava/lang/Object;JJ)Lnet.minecraft.client.render.Frustum;
        //    88: aload_0        
        //    89: ldc2_w          -9012047250546235925
        //    92: lload           11
        //    94: invokedynamic   BootstrapMethod #0, \u00d3:(Ljava/lang/Object;JJ)Lnet.minecraft.util.math.Box;
        //    99: dload_2        
        //   100: dload           4
        //   102: dload           6
        //   104: ldc2_w          -9020414862164224406
        //   107: lload           11
        //   109: invokedynamic   BootstrapMethod #0, \u00d3:(Ljava/lang/Object;DDDJJ)Lnet.minecraft.util.math.Box;
        //   114: ldc2_w          -9013873314638586404
        //   117: lload           11
        //   119: invokedynamic   BootstrapMethod #0, \u00d3:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   124: goto            138
        //   127: ldc2_w          -9019271285301145521
        //   130: lload           11
        //   132: invokedynamic   BootstrapMethod #0, y:(Ljava/lang/Object;JJ)Ljava/lang/IllegalStateException;
        //   137: athrow         
        //   138: ifne            142
        //   141: return         
        //   142: aload_1        
        //   143: ldc2_w          -9017617723124917042
        //   146: lload           11
        //   148: invokedynamic   BootstrapMethod #0, M:(Ljava/lang/Object;JJ)Lnet.minecraft.client.util.math.MatrixStack;
        //   153: ldc2_w          -9017946064131686507
        //   156: lload           11
        //   158: invokedynamic   BootstrapMethod #0, \u00d3:(Ljava/lang/Object;JJ)Lnet.minecraft.client.util.math.MatrixStack.Entry;
        //   163: dup            
        //   164: astore          14
        //   166: ldc2_w          -9011866349475744012
        //   169: lload           11
        //   171: invokedynamic   BootstrapMethod #0, \u00d3:(Ljava/lang/Object;JJ)Lorg/joml/Matrix4f;
        //   176: astore          15
        //   178: dload_2        
        //   179: aload_1        
        //   180: ldc2_w          -9012140813083741925
        //   183: lload           11
        //   185: invokedynamic   BootstrapMethod #0, M:(Ljava/lang/Object;JJ)Lnet.minecraft.util.math.Vec3d;
        //   190: ldc2_w          -9013061671882731155
        //   193: lload           11
        //   195: invokedynamic   BootstrapMethod #0, M:(Ljava/lang/Object;JJ)D
        //   200: dsub           
        //   201: d2f            
        //   202: fstore_2       
        //   203: dload           4
        //   205: aload_1        
        //   206: ldc2_w          -9012140813083741925
        //   209: lload           11
        //   211: invokedynamic   BootstrapMethod #0, M:(Ljava/lang/Object;JJ)Lnet.minecraft.util.math.Vec3d;
        //   216: ldc2_w          -9011712899200816626
        //   219: lload           11
        //   221: invokedynamic   BootstrapMethod #0, M:(Ljava/lang/Object;JJ)D
        //   226: dsub           
        //   227: d2f            
        //   228: fstore_3       
        //   229: dload           6
        //   231: aload_1        
        //   232: ldc2_w          -9012140813083741925
        //   235: lload           11
        //   237: invokedynamic   BootstrapMethod #0, M:(Ljava/lang/Object;JJ)Lnet.minecraft.util.math.Vec3d;
        //   242: ldc2_w          -9025152174000249214
        //   245: lload           11
        //   247: invokedynamic   BootstrapMethod #0, M:(Ljava/lang/Object;JJ)D
        //   252: dsub           
        //   253: d2f            
        //   254: fstore          4
        //   256: iload           8
        //   258: iload           13
        //   260: ifeq            321
        //   263: ifeq            319
        //   266: goto            280
        //   269: ldc2_w          -9019271285301145521
        //   272: lload           11
        //   274: invokedynamic   BootstrapMethod #0, y:(Ljava/lang/Object;JJ)Ljava/lang/IllegalStateException;
        //   279: athrow         
        //   280: aload_0        
        //   281: aload_1        
        //   282: aload           15
        //   284: fload_2        
        //   285: fload_3        
        //   286: fload           4
        //   288: iload           10
        //   290: invokedynamic   BootstrapMethod #3, consume:(Lorg/rusherhack/Class352;Lorg/joml/Matrix4f;FFFI)Lnet.minecraft.util.shape.VoxelShapes.BoxConsumer;
        //   295: ldc2_w          -9012414223967152754
        //   298: lload           11
        //   300: invokedynamic   BootstrapMethod #0, \u00d3:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   305: goto            319
        //   308: ldc2_w          -9019271285301145521
        //   311: lload           11
        //   313: invokedynamic   BootstrapMethod #0, y:(Ljava/lang/Object;JJ)Ljava/lang/IllegalStateException;
        //   318: athrow         
        //   319: iload           9
        //   321: iload           13
        //   323: ifeq            383
        //   326: ifeq            410
        //   329: goto            343
        //   332: ldc2_w          -9019271285301145521
        //   335: lload           11
        //   337: invokedynamic   BootstrapMethod #0, y:(Ljava/lang/Object;JJ)Ljava/lang/IllegalStateException;
        //   342: athrow         
        //   343: iload           10
        //   345: sipush          25538
        //   348: ldc2_w          4354929268372459094
        //   351: lload           11
        //   353: lxor           
        //   354: invokedynamic   BootstrapMethod #2, s:(IJ)I
        //   359: ldc2_w          -9012276364530871314
        //   362: lload           11
        //   364: invokedynamic   BootstrapMethod #0, y:(IIJJ)I
        //   369: goto            383
        //   372: ldc2_w          -9019271285301145521
        //   375: lload           11
        //   377: invokedynamic   BootstrapMethod #0, y:(Ljava/lang/Object;JJ)Ljava/lang/IllegalStateException;
        //   382: athrow         
        //   383: istore          8
        //   385: aload_0        
        //   386: aload_1        
        //   387: aload           14
        //   389: fload_2        
        //   390: fload_3        
        //   391: fload           4
        //   393: iload           8
        //   395: invokedynamic   BootstrapMethod #4, consume:(Lorg/rusherhack/Class352;Lnet.minecraft.client.util.math.MatrixStack.Entry;FFFI)Lnet.minecraft.util.shape.VoxelShapes.BoxConsumer;
        //   400: ldc2_w          -9017770257500956037
        //   403: lload           11
        //   405: invokedynamic   BootstrapMethod #0, \u00d3:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   410: return         
        //    StackMapTable: 00 12 FF 00 2F 00 0A 07 02 BE 07 00 02 03 03 03 01 01 01 04 01 00 01 07 00 A2 0A 48 07 00 A2 4A 07 00 02 70 07 00 A2 4A 01 03 40 07 00 02 FF 00 7D 00 0E 07 02 BE 07 00 02 02 02 02 00 03 01 01 01 04 01 07 02 C0 07 00 79 00 01 07 00 A2 0A 5B 07 00 A2 0A 41 01 4A 07 00 A2 0A 5C 07 00 A2 4A 01 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  25     44     47     58     Ljava/lang/IllegalStateException;
        //  41     64     67     78     Ljava/lang/IllegalStateException;
        //  58     124    127    138    Ljava/lang/IllegalStateException;
        //  256    266    269    280    Ljava/lang/IllegalStateException;
        //  263    305    308    319    Ljava/lang/IllegalStateException;
        //  321    329    332    343    Ljava/lang/IllegalStateException;
        //  326    369    372    383    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setLineWidth(float n) {
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_241.invoke(this, n, -858423081874714513L, Class352.f5730 ^ 0x5359FE453D31L);
    }
    
    public BufferBuilder getTrianglesBuffer() {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_242.invoke(this, -8137534139325096866L, Class352.f5730 ^ 0x6894A6A8461AL);
    }
    
    public BufferBuilder getLinesBuffer() {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_243.invoke(this, 4473893249276911915L, Class352.f5730 ^ 0x22E47B86F716L);
    }
    
    public boolean isBuilding() {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_244.invoke(this, 3596366369773973760L, Class352.f5730 ^ 0x515CB924F8D7L);
    }
    
    static {}
    
    public void drawBox(BlockPos blockPos, boolean b, boolean b2, int n) {
        long n2 = Class352.f5730 ^ 0x5570B13FC874L;
        int n3 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_245.invoke(92772067474499823L, n2);
        Class352 obf352 = this;
        double n4 = (double)/* invokedynamic(!) */ProcyonInvokeDynamicHelper_246.invoke(blockPos, 107125031132050254L, n2);
        double n5 = (double)/* invokedynamic(!) */ProcyonInvokeDynamicHelper_247.invoke(blockPos, 106173419940626695L, n2);
        double n6 = (double)/* invokedynamic(!) */ProcyonInvokeDynamicHelper_248.invoke(blockPos, 90532809764476196L, n2);
        double n7 = 1.0;
        double n8 = 1.0;
        double n9 = 1.0;
        Label_0162: {
            Label_0160: {
                try {
                    if (n3 != 0) {
                        break Label_0162;
                    }
                    if (!/* invokedynamic(!) */ProcyonInvokeDynamicHelper_249.invoke(this, 93967418943425805L, n2)) {
                        break Label_0160;
                    }
                }
                catch (IllegalStateException ex) {

                }
                n4 -= 0.001;
                n5 -= 0.001;
                n6 -= 0.001;
                n7 += 0.002;
                n8 += 0.002;
                n9 += 0.002;
            }
            obf352 = this;
        }
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_251.invoke(obf352, n4, n5, n6, n7, n8, n9, b, b2, n, 91719471292887450L, n2);
    }
    
    public void lineStrip(double n, double n2, double n3, int n4) {
        long n5 = Class352.f5730 ^ 0x3E7FBA71FF5EL;
        int n6 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_252.invoke(3913833420952930594L, n5);
        Class352 obf352 = this;
        Class352 obf353 = this;
        Matrix4f matrix4f = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_255.invoke(ProcyonInvokeDynamicHelper_254.invoke(ProcyonInvokeDynamicHelper_253.invoke(this, 3919182538923894903L, n5), 3918297019661929260L, n5), 3915366374986482253L, n5);
        Matrix3f matrix3f = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_258.invoke(ProcyonInvokeDynamicHelper_257.invoke(ProcyonInvokeDynamicHelper_256.invoke(this, 3919182538923894903L, n5), 3918297019661929260L, n5), 3920816354612229394L, n5);
        Label_0166: {
            Label_0124: {
                try {
                    if (n6 == 0) {
                        break Label_0166;
                    }
                    long n7 = 3918223875689876916L;
                    long n8 = n5;
                    Vec3d vec3d = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_259.invoke(this, n7, n8);
                    if (vec3d == null) {
                        break Label_0124;
                    }
                    break Label_0124;
                }
                catch (IllegalStateException ex) {
                    ex.printStackTrace();
                }
                try {
                    long n7 = 3918223875689876916L;
                    long n8 = n5;
                    Vec3d vec3d = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_261.invoke(this, n7, n8);
                    if (vec3d == null) {
                        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_262.invoke(this, new Vec3d(n, n2, n3), 3918223875689876916L, n5);
                    }
                }
                catch (IllegalStateException ex2) {

                }
            }
            obf352 = this;
            obf353 = this;
        }
        Vec3d vec3d2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_264.invoke(obf353, 3918223875689876916L, n5);
        try {
            if (!/* invokedynamic(!) */ProcyonInvokeDynamicHelper_269.invoke(ProcyonInvokeDynamicHelper_265.invoke(obf352, 3918532869276691046L, n5), new Box(n, n2, n3, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_266.invoke(vec3d2, 3914309351583147476L, n5), /* invokedynamic(!) */ProcyonInvokeDynamicHelper_267.invoke(vec3d2, 3915511991379418807L, n5), /* invokedynamic(!) */ProcyonInvokeDynamicHelper_268.invoke(vec3d2, 3925292100039037499L, n5)), 3913925280275605861L, n5)) {
                return;
            }
        }
        catch (IllegalStateException ex3) {

        }
        float n9 = (float)(n - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_272.invoke(ProcyonInvokeDynamicHelper_271.invoke(this, 3915657884791227810L, n5), 3914309351583147476L, n5));
        float n10 = (float)(n2 - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_274.invoke(ProcyonInvokeDynamicHelper_273.invoke(this, 3915657884791227810L, n5), 3915511991379418807L, n5));
        float n11 = (float)(n3 - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_276.invoke(ProcyonInvokeDynamicHelper_275.invoke(this, 3915657884791227810L, n5), 3925292100039037499L, n5));
        Vector3f vector3f = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_280.invoke(matrix3f, new Vector3f((float)(n - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_277.invoke(vec3d2, 3914309351583147476L, n5)), (float)(n2 - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_278.invoke(vec3d2, 3915511991379418807L, n5)), (float)(n3 - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_279.invoke(vec3d2, 3925292100039037499L, n5))), 3914157891090705894L, n5);
        VertexConsumer vertexConsumer = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_283.invoke(ProcyonInvokeDynamicHelper_282.invoke(ProcyonInvokeDynamicHelper_281.invoke(this, 3917686026245253475L, n5), matrix4f, n9, n10, n11, 3920021513472590830L, n5), n4, 3922367301721308212L, n5);
        Vector3f vector3f2 = vector3f;
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_287.invoke(vertexConsumer, ProcyonInvokeDynamicHelper_284.invoke(vector3f2, 3922170554111920019L, n5), ProcyonInvokeDynamicHelper_285.invoke(vector3f2, 3915707641356122012L, n5), ProcyonInvokeDynamicHelper_286.invoke(vector3f, 3918694793050088863L, n5), 3925135129351562471L, n5);
    }
    
    public void drawLine(double n, double n2, double n3, double n4, double n5, double n6, int n7) {
        long n8 = Class352.f5730 ^ 0x231C993D9572L;
        Matrix4f matrix4f = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_290.invoke(ProcyonInvokeDynamicHelper_289.invoke(ProcyonInvokeDynamicHelper_288.invoke(this, 6651718389384643163L, n8), 6650843591468359936L, n8), 6663693136576407649L, n8);
        Matrix3f matrix3f = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_293.invoke(ProcyonInvokeDynamicHelper_292.invoke(ProcyonInvokeDynamicHelper_291.invoke(this, 6651718389384643163L, n8), 6650843591468359936L, n8), 6648884047524683582L, n8);
        try {
            if (!/* invokedynamic(!) */ProcyonInvokeDynamicHelper_295.invoke(ProcyonInvokeDynamicHelper_294.invoke(this, 6651097023604949066L, n8), new Box(n, n2, n3, n4, n5, n6), 6664504108033229641L, n8)) {
                return;
            }
        }
        catch (IllegalStateException ex) {

        }
        float n9 = (float)(n - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_298.invoke(ProcyonInvokeDynamicHelper_297.invoke(this, 6663967878888042382L, n8), 6664895335763415032L, n8));
        float n10 = (float)(n2 - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_300.invoke(ProcyonInvokeDynamicHelper_299.invoke(this, 6663967878888042382L, n8), 6663827757811610779L, n8));
        float n11 = (float)(n3 - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_302.invoke(ProcyonInvokeDynamicHelper_301.invoke(this, 6663967878888042382L, n8), 6653344133491800087L, n8));
        float n12 = (float)(n4 - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_304.invoke(ProcyonInvokeDynamicHelper_303.invoke(this, 6663967878888042382L, n8), 6664895335763415032L, n8));
        float n13 = (float)(n5 - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_306.invoke(ProcyonInvokeDynamicHelper_305.invoke(this, 6663967878888042382L, n8), 6663827757811610779L, n8));
        float n14 = (float)(n6 - /* invokedynamic(!) */ProcyonInvokeDynamicHelper_308.invoke(ProcyonInvokeDynamicHelper_307.invoke(this, 6663967878888042382L, n8), 6653344133491800087L, n8));
        Vector3f vector3f = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_309.invoke(matrix3f, new Vector3f((float)(n4 - n), (float)(n5 - n2), (float)(n6 - n3)), 6664760916653672394L, n8);
        VertexConsumer vertexConsumer = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_312.invoke(ProcyonInvokeDynamicHelper_311.invoke(ProcyonInvokeDynamicHelper_310.invoke(this, 6661518517907505999L, n8), matrix4f, n9, n10, n11, 6650316568899103170L, n8), n7, 6648176323979695640L, n8);
        Vector3f vector3f2 = vector3f;
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_316.invoke(vertexConsumer, ProcyonInvokeDynamicHelper_313.invoke(vector3f2, 6647950996542254527L, n8), ProcyonInvokeDynamicHelper_314.invoke(vector3f2, 6664058858448362928L, n8), ProcyonInvokeDynamicHelper_315.invoke(vector3f, 6651285885379678131L, n8), 6653220699049840331L, n8);
        VertexConsumer vertexConsumer2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_319.invoke(ProcyonInvokeDynamicHelper_318.invoke(ProcyonInvokeDynamicHelper_317.invoke(this, 6661518517907505999L, n8), matrix4f, n12, n13, n14, 6650316568899103170L, n8), n7, 6648176323979695640L, n8);
        Vector3f vector3f3 = vector3f;
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_323.invoke(vertexConsumer2, ProcyonInvokeDynamicHelper_320.invoke(vector3f3, 6647950996542254527L, n8), ProcyonInvokeDynamicHelper_321.invoke(vector3f3, 6664058858448362928L, n8), ProcyonInvokeDynamicHelper_322.invoke(vector3f, 6651285885379678131L, n8), 6653220699049840331L, n8);
    }
    
    public void end() {
        
    }
    
    public static IllegalStateException m6741(IllegalStateException ex) {
        return new IllegalStateException(ex);
    }
    
    public static String m117(byte[] array) {
        int count = 0;
        int length;
        char[] value = new char[length = array.length];
        for (int i = 0; i < length; ++i) {
            int n;
            if ((n = (0xFF & array[i])) < 192) {
                value[count++] = (char)n;
            }
            else if (n < 224) {
                value[count++] = (char)((char)((char)(n & 0x1F) << 6) | (char)(array[++i] & 0x3F));
            }
            else if (i < length - 2) {
                value[count++] = (char)((char)((char)((char)(n & 0xF) << 12) | (char)(array[++i] & 0x3F) << 6) | (char)(array[++i] & 0x3F));
            }
        }
        return new String(value, 0, count);
    }
    
    public static String m153(int n, long n2) {
        return null;
    }
    
    public static Object m154(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        String m153 = m153((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, m153), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m153;
    }
    
    public static CallSite m120(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class352.m120:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:67)
        //     at com.strobel.assembler.metadata.MethodDefinition.tryLoadBody(MethodDefinition.java:729)
        //     at com.strobel.assembler.metadata.MethodDefinition.getBody(MethodDefinition.java:83)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:194)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // Caused by: java.lang.ClassCastException: class com.strobel.assembler.ir.ConstantPool.MethodHandleEntry cannot be cast to class com.strobel.assembler.ir.ConstantPool.ConstantEntry (com.strobel.assembler.ir.ConstantPool.MethodHandleEntry and com.strobel.assembler.ir.ConstantPool.ConstantEntry are in unnamed module of loader 'app')
        //     at com.strobel.assembler.ir.ConstantPool.lookupConstant(ConstantPool.java:120)
        //     at com.strobel.assembler.metadata.ClassFileReader.Scope.lookupConstant(ClassFileReader.java:1590)
        //     at com.strobel.assembler.metadata.MethodReader.readBodyCore(MethodReader.java:299)
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:63)
        //     ... 15 more
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static int m2808(int n, long n2) {
        return 0;
    }
    
    public static int m2809(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, Object[] array) {
        int m2808 = m2808((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, m2808), 0, (Class<?>[])new Class[] { Integer.TYPE, Long.TYPE }));
        return m2808;
    }
    
    public static CallSite m132(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class352.m132:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:67)
        //     at com.strobel.assembler.metadata.MethodDefinition.tryLoadBody(MethodDefinition.java:729)
        //     at com.strobel.assembler.metadata.MethodDefinition.getBody(MethodDefinition.java:83)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:194)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // Caused by: java.lang.ClassCastException: class com.strobel.assembler.ir.ConstantPool.MethodHandleEntry cannot be cast to class com.strobel.assembler.ir.ConstantPool.ConstantEntry (com.strobel.assembler.ir.ConstantPool.MethodHandleEntry and com.strobel.assembler.ir.ConstantPool.ConstantEntry are in unnamed module of loader 'app')
        //     at com.strobel.assembler.ir.ConstantPool.lookupConstant(ConstantPool.java:120)
        //     at com.strobel.assembler.metadata.ClassFileReader.Scope.lookupConstant(ClassFileReader.java:1590)
        //     at com.strobel.assembler.metadata.MethodReader.readBodyCore(MethodReader.java:299)
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:63)
        //     ... 15 more
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static int m704(long n, long n2) {
        n ^= (n2 << 48 | n2);
        int n3 = (int)(n >>> 46);
        if (Class352.f5738[n3] != null) {
            return n3;
        }
        Object o = Class352.f5737[n3];
        if (!(o instanceof String)) {
            return n3;
        }
        int n5 = switch ((int)(n >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 35;
            case 2 -> 58;
            case 3 -> 60;
            case 4 -> 40;
            case 5 -> 37;
            case 6 -> 44;
            case 7 -> 43;
            case 8 -> 61;
            case 9 -> 47;
            case 10 -> 38;
            case 11 -> 36;
            case 12 -> 3;
            case 13 -> 4;
            case 14 -> 19;
            case 15 -> 39;
            case 16 -> 14;
            case 17 -> 24;
            case 18 -> 22;
            case 19 -> 34;
            case 20 -> 9;
            case 21 -> 52;
            case 22 -> 12;
            case 23 -> 45;
            case 24 -> 10;
            case 25 -> 1;
            case 26 -> 23;
            case 27 -> 0;
            case 28 -> 51;
            case 29 -> 17;
            case 30 -> 54;
            case 31 -> 63;
            case 32 -> 56;
            case 33 -> 13;
            case 34 -> 59;
            case 35 -> 55;
            case 36 -> 29;
            case 37 -> 32;
            case 38 -> 46;
            case 39 -> 41;
            case 40 -> 21;
            case 41 -> 53;
            case 42 -> 62;
            case 43 -> 2;
            case 44 -> 31;
            case 45 -> 48;
            case 46 -> 30;
            case 47 -> 57;
            case 48 -> 8;
            case 49 -> 20;
            case 50 -> 15;
            case 51 -> 50;
            case 52 -> 18;
            case 53 -> 7;
            case 54 -> 25;
            case 55 -> 26;
            case 56 -> 33;
            case 57 -> 11;
            case 58 -> 28;
            case 59 -> 6;
            case 60 -> 49;
            case 61 -> 42;
            case 62 -> 16;
            default -> 5;
        };
        int[] array = new int[6];
        for (int i = 0; i < 6; ++i) {
            int n6 = (int)(n >>> 7 * (5 - i) & 0x7FL) - n5;
            if (n6 < 0) {
                n6 += 128;
            }
            array[i] = n6;
        }
        char[] charArray = ((String)o).toCharArray();
        for (int j = 0; j < charArray.length; ++j) {
            int n7 = array[j % array.length];
            if (n7 == 0) {
                break;
            }
            charArray[j] ^= (char)n7;
        }
        Class352.f5738[n3] = new String(charArray);
        return n3;
    }
    
    public static void m157() {
        Object[] f5737 = Class352.f5737;
        f5737[0] = "-p=)\u0019.1j?u\u0003:!it\u02b5";
        f5737[1] = Double.TYPE;
        Class352.f5738[1] = "java/lang/Double";
        f5737[2] = Boolean.TYPE;
        Class352.f5738[2] = "java/lang/Boolean";
        f5737[3] = Integer.TYPE;
        Class352.f5738[3] = "java/lang/Integer";
        f5737[4] = Void.TYPE;
        Class352.f5738[4] = "java/lang/Void";
        f5737[5] = """
                   s\u000e)'z.x\u00018h\u001d.u
                   8'8\u0011m\u000e+#\u0011:z
                   /2=-w""";
        f5737[6] = " 5G(Ea</Et_u,,\u000e\u0404";
        f5737[7] = "l\u0015";
        f5737[8] = "Kl\u0010w=rKl\u0007+1}Q'\u000751hVVVje+";
        f5737[9] = "^C\u001fa\u001bd^C\b=\u0017kD\b\b#\u0017~CyYwA";
        f5737[10] = "%-D\\:J'3\r?1Q86[F6";
        f5737[11] = Float.TYPE;
        Class352.f5738[11] = "java/lang/Float";
        f5737[12] = "]9\u0001>M#]9\u0016bA,Gr\u0016|A9@\u0003A%\u0018r";
        f5737[13] = """
                    #\u0016;^\fD*\u00188\u0017OI,\u0018,\u0015ROn
                    /\u0003\u0015N-
                    x"\u0004E$\u001c$#\u0018X4\u001c;""";
        f5737[14] = "\u0011CqhjM\u0011Cf4fB\u000b\bf*fW\fy1w?\u0010";
        f5737[15] = "p/\u001bRJ\rp/\f\u000eF\u0002jd\f\u0010F\u0017m\u0015]H\u0014";
        f5737[16] = """
                    Tz\u0015\u0010VeVd\s]~Ia
                    
                    Zi""";
        f5737[17] = "-:wn7\u001e-:`2;\u00117q`,;\u00040\u00007ub@";
        f5737[18] = "6 4'yG6 #{uH,k#eu]+\u001at<,\u0019|&,hg]\u0007qv?!";
        f5737[19] = "Z\u000b(BWBF\u0011*\u001eMVV\u0012a\u000fI^P\u0017;BDG\\W*\u001a@YA\na\u001e@YQ\u001c=B`AP\u0017;>@YQ\u001c=";
        f5737[20] = "vZw\u000f;Cj@uS!WzC>B%_|Fd\u000f(Fp\u0006WM&TxDc";
        f5737[21] = "\u0015XV1\"\u0000\u0015XAm.\u000f\u000f\u0013As.\u001a\bb\u0011.\u007f";
        f5737[22] = "C_#s\u001b\u001eC_4/\u0017\u0011Y\u001441\u0017\u0004^e`hA";
        f5737[23] = ";\u0004m&1U;\u0004zz=Z!Ozd=O&>+;d";
        f5737[24] = "?1|]1Z?1k\u0001=U%zk\u001f=@\"\u000b9Ae\u0004";
        f5737[25] = "nwE6T\u0002rmGjN\u0016bn\f{J\u001edkV6G\u0007h+WlO\u001br+gvR\u001eu|wlO\u001br";
        f5737[26] = "$)";
        f5737[27] = "[]]Co@GG_\u001fuTWD\u0014\u026b";
        f5737[28] = "}]\u0007zl=\u007fCN\u0019g&`F\u0018g`";
        f5737[29] = "17ZXcp17M\u0004o\u007f+|M\u001aoj,\r\u001a@>-";
        f5737[30] = "{U_00\u001ayK\u0016H?\u0016`HJ-<";
        f5737[31] = "NJ;\bV\u0000NJ,TZ\u000fT\u0001,JZ\u001aSp}\u0015\bQ";
        f5737[32] = "e\u0010Ex0\u0001e\u0010R$<\u000e\u007f[R:<\u001bx*\u0002cnZ";
        f5737[33] = "/k\u001f\r\u001c(*~\u0014\r\u001f/%w\u001fO^\u0018\f*J";
        f5737[34] = "G\b'\u0017;r[\u0012%K!fK\u0011n\u0499";
        f5737[35] = "k\u001aPp\u007fE`\u0015A?\u0002]s\u0012Hv";
        f5737[36] = "\u0003MFTa\u001d\u0003MQ\bm\u0012\u0019\u0006Q\u0016m\u0007\u001ew\u000bM5M";
        f5737[37] = "\u0005Q:ypO\u0005Q-%|@\u001f\u001a-;|U\u0018kzb$\u001f";
        f5737[38] = "\u0018f+]\u0000S\u0018f<\u0001\f\\\u0002-<\u001f\fI\u0005\\kFT\rR`3\u0012\u001eI)7jJU";
        f5737[39] = "rfOOlYrfX\u0013`Vh-X\r`Co\\\tY7";
        f5737[40] = "N(\u000f2\u0000\u0011N(\u0018n\f\u001eTc\u0018p\f\u000bS\u0012B$]I";
        f5737[41] = "sB<uJ\u0002mJ&:\u0002\u0002w@>}\u000b\u00197p?d\u0014\u001bpF8";
        f5737[42] = "';\u0019\u0003\u0011O.5\u001aJRB(5\u000eHODj$\u0018L\bF+&\u0019\u0003;L\u0017 \u0015Y\u0019m%:\u0015J\u0019R`7\u0018L\u000fS\u001beD\u0019L";
        f5737[43] = "8*(iy*3%9&\u001a'&#";
        f5737[44] = "\u000f}*W_B\rcc/PN\u0014`?MS";
        f5737[45] = "\u0013\u000eVS5.\u0013\u000eA\u000f9!\tEA\u001194\u000e4\u0013Mlv";
        f5737[46] = "\u0005z";
        f5737[47] = "^1Qs6\u0016^1F/:\u0019DzF1:\fC\u000b\u0017kn";
        f5737[48] = "w+H\u007f}dw+_#qkm`_=q~j\u0011\u000ed)";
        f5737[49] = "WG\u0016o`\u000eK]\u00143z\u001a[^_\u0525";
        f5737[50] = "\u001d<w-%'\u001d<`q)(\u0007w`o)=\u0000\u00061:{j\u00105bp;\u0011Fl:5";
        f5737[51] = "ud}#zludj\u007fvco/javvh^;4'";
        f5737[52] = "r\u001eefvkr\u001er:zdhUr$zqo$#q(";
        f5737[53] = "5\b`uZ\u000e5\bw)V\u0001/Cw7V\u0014(2&n\u000eC8\u0001u(D8i[$";
        f5737[54] = "D\nfCIYX\u0010d\u001fSMH\u0013/\u000eT^NVt\u0019R@XVB\u0002WCY-u\u0004W_";
        f5737[55] = "\u0018-\u000ewP:\u0013\"\u001f814\u0018)\u001bb";
        f5737[56] = ".:\u0010xE)~xMn$.y+EwI\bb&K\u0013\u001f~#~Sq\u001c-$z/";
        f5737[57] = "\u0004G\t:<\u001d\u0014\u001b\u0006iR\b\u0013Qe9-\u001b\tJ\u001bt/]\u0019*Zy(\u0011\u0019T\u0017{n\u0001y";
        f5737[58] = "+eP*L\u001bj1@c2\u0003i0*x\\W}3\u0017`\r]lT\u0015#H^j)TwX\u0017\u0014";
        f5737[59] = "K-OU\u0019\t\txN\u000e|\r\u00165R\b\u0010?As\u0003V@hD6H\u001f\u001c\u0016\t4\u000e\u000f|W\u00043B\u000f\u0002\u001a\u0006uRoC\u0017\u00019R\u0011\u000e\u0015G)2_\u0018\u0015A,S\u001dM\u0014\u001aI";
        f5737[60] = "t#\u0016cX\u0015s|\u0012\u000e\u0286k/`\u0006~]\u0015bb@n";
        f5737[61] = "s@g!_5$\u001f\"76%{J=7ar!\u001aa[\u000f!*Nb4R1wK";
        f5737[62] = "h6N\u0006iwoiJk\u01f4\tt6K\u001bnin5G\u0010";
        f5737[63] = "/Aezl{\u007f\u00038l\rjsE\u0001qd}sC\u0011vivd9enwa~G(l1q\u001e\u0006%k}q`K'-m\u0011!F amolDfq\r.aC*qscc\u0005:\u00116,\"\u0005&s5\u007f%\u0001Z";
        f5737[64] = "#\u001f>q\u0001\u0001$@:\u001c\u03b7\u007fx\u0012.$\u001a\u00029F>m";
        f5737[65] = "POT6bI\u0011\u001bD\u007f\u001cO\u0002\u0002.dr\u0005\u0006\u0019\u0013|#\u000f\u0017~\u0011?f\f\u0011\u0003PkvEo";
        f5737[66] = "/\u001d\u001e8F\u0007.P^;>\u000e|\u0011N;R<+W\u001fe\u000ek.\\Td@\u0016o\bD->Tn\u0017^<@\u0019lQN\\\u0001\u0014k\u001dN\"L\u0016-\r.cA\u0011a\rP.CWqm\u001e8CQt\f\\mB\n\u0011";
        f5737[67] = "\u001c\u000b]`%a]_M)[dY]E50`#\u0005X\"+|]HZd;\u001c\u001cE](;bQG\u001b8[#\\@W8%n^\u0006GX%m\u0012JN('uLY';)!HS^6!yJ:D*fwJCI\">u#";
        f5737[68] = "pGf7\u0005xe@p*kl~Ge9<;$\u00108URh/C::\u000fxrF";
        f5737[69] = "\u001cG$u\u007f\u0014^\u0010~\u007f\u0000\u0001\u000f\u0014|sWUQB(&\u0000\u001dPEr`{_\u0007\u001fx";
        f5737[70] = "G\u000b\u00066{9@T\u0002[\u015aG\u001aH\u0001'g)O\t\u0016?";
        f5737[71] = "vhp#@Ccof>.\\tyw&Bn :&}\u00179 o'(\u0015V}\u007fz-.";
        f5737[72] = """
                    JW
                    Q+`L\u0003HW@4G\u0016ZZ,\u0006\u0010Q\u0001\u0004pQ\u0013\u0000
                    T{>N\u0010WQ@""";
        f5737[73] = "5\u000epb)yeL-tH|i\n\u0014i!\u007fi\f\u000bh.~[\u0017#u(\u0013;\t5y(mv\u000bsiH";
        f5737[74] = "SG\u0002s\u0011)U\b\b~r>Uw\u0002`C4\u0001K\u0015zO;";
        f5737[75] = "\u0007 \u001f\u0015t:\u0006!\u000f\u0002\r(\u0005R\u0015\fg#\f\u001fI\u0006l\"\rc\u001f\u000ba*a$NY1;\u0003'\u001d^5G";
        f5737[76] = "z570bt}j3]\u0258\n!8'eyw`l7,";
        f5737[77] = "a=&.\u0018P1\u007f{8yV=+p8\u001dF\u001a!t#\u0015t-#rEB\u0007lye'ATk}\u0019";
        f5737[78] = "L\fng\u0005'KSj\n\u0219Y\u0017\u0001~2\u001e$VUn{";
        f5737[79] = "\b\u0019em\u0002:\u000fFa\u0000\u0528DS\u0014u8\u00199\u0012@eq";
        f5737[80] = "\u0000v\"\u0002\u001e0\r~z\u0000w;c;`\u0013\u0007)\u001dvbU\u0017";
        f5737[81] = "\u001dx\"\u001b\u0003`_/x\u0011|u\u000e+z\u001d+!P}.K|iQzt\u000e\u0007+\u0006 ~";
        f5737[82] = "{\"1e\u0018f'9xny2s=!{\u0015\u0000'|z!DW!>;l\u0019)l<}|yha;1|\u0007%c}!\u001c";
        f5737[83] = "9J\u001b\u0006R\u00048K\u000b\u0011+\u0016;9\u0016\rB\u0013;\u0018wLH\u0018:\u0019\u000b\u001aE\u00152uLK\u0017E#\u0017O\u0018\u0010A_";
        f5737[84] = """
                    PiCT5aKkGG
                    hBq\u001aRfZ\u00164B	
                    4\u00165\u001fOxc\u00163\u0015W
                    6\u00121FIh5A6B5""";
        f5737[85] = "\"D1\u001cupjL,C\u0015\u04d7S\u001b,\u001aylm\u0000sIz\u000e4\u001auIw0/E&J\u0015";
        f5737[86] = "]?\u001fx\u00135Z`\u001b\u0015\u01c6KRo\u001e\u007f\u0013$@>\u001e%";
        f5737[87] = "\u0013\u0017\u0019>5\\\u001d\t\u000b?E\u027crQ\u0014f I\u000e\u0007\u0019k(%";
        f5737[88] = "e\bZz7y=Q\u0014xJ#aMJ\u007f&\u00115\u0000\u0011\"tFeV\u0014b#82\tQtJ";
        f5737[89] = "2Rc\u0003\u0004B5\rgn\u0104<?\t7\u0014\bBhVr\u0002";
        f5737[90] = "-YUh\u0000*?\bU2e +I^e\t\u0012|\u000e\u0001<]E*\fUp\u0003++\u000e\u0002\u007fe";
        f5737[91] = "\u0005OY1\u0012JG\u0018\u0003;m_\u0016\u001c\u00017:\u000bHJZjmCIM\u000f$\u0016\u0001\u001e\u0017\u0005";
        f5737[92] = "E\u0011[nS<CE\u0019h8hHP\u000beTZ\u0018\u001cQ38bHK\tlBwO]\u0014\u0002";
        f5737[93] = " \u000e\n5\u0014''Q\u000eX\u01d3Y'\u0002Z4L#z]\u00026";
        f5737[94] = "\r\u007fCS\u0001\u001c\n G>\u0406bP<DB\u001d\f\u0005}SZ";
        f5737[95] = """
                    hJ\u001d\u0014\u00069dK@\u001b{a{K\u001e\u0001\u0017S*
                    FX{>uV\u001b
                    \u0007hx[\u0013f""";
        f5737[96] = "RZ(\u000f|.\u0002\u0018u\u0019\u001d(\u0002Y~\u000ey))Fz\u0002qDX\u001f+Xa&[L,\\\u001d";
        f5737[97] = "La\u0011/,>AiI-E7/,S>5'QaQx%";
        f5737[98] = "\b|t\u0004#\u0017U#,\u0006\u001e\b\u00060.\u000fr:QwvX.mR&~\u0001%\u0002\u000f6#\u0004\u001eT\u0001|'Sq\t\u0011!\"h'\u0007[%u\u0007z\u0017\u0006 NS#QW0,PpVSL";
        f5737[99] = "$s\u0002\u000eo5f$X\u0004\u0010 7 Z\bGtiv\u0001T\u0010<hqT\u001bk~?+^";
        f5737[100] = "L\u0014\u000f\r\u0004~\u000eA\u000eVaz\u0011\f\u0012P\rHGAN\u000e\\\u001fF\u0013\u0013R\rc\u0010\u001e\u001eZa/\u0018\rHR\u0000mM\f\u00137";
        f5737[101] = "\u0004`o &lT\"26GkSq:/*LQu6'G=\b$l7%>[#hK";
        f5737[102] = "D\nFf!GCUB\u000b(CIIfl49\u0019\\\u001cb\u007fVDLAgD\u0000J\u0006E0+]Z[@\u000b}S\u0010_\u0017d CMZ,2.\tI\rCo>TL6\u0015atP\u001bYHq)U \u000fF;-\u0002ORVf(9\u0019IAw=WL\bVoD\u0000_[Pr*U\u001eLH\u000b~ZAS@w(WL[,0y\u0005\u001cJN3*\u0002\u00186";
        f5737[103] = "\u0015=0\b;O\u0002'<\u0007\u0004\u0016\u0015=a\u0000h$B{?W?s\u0006<b\u0015yN\n=?\u001a\u0004";
        f5737[104] = "\u001dp8{y \\$(2\u0007<D?/9{]\u001dp8{y \\$(2\u0007b\u0013;z=z#G+3C";
        f5737[105] = "6\u0006\u0010#b\u001c1Y\u0014NnbiY\u001776Xm\u0001\u0004%\u0007Y1W\u0003\u007f=]iD\u0011N";
        f5737[106] = ".n\feOz~,Qs.\u007frjktIrr}OoIvZ\u007fOtO`\u001f)\u0002t\u0016nbhVd_\u0010";
        f5737[107] = "\u0003_\u0012C\u0001\u001a\u0018]\u0016P>\u0013\u0011GKER!E\u0002\u0012\u001a>O\u0003VW[P\u001aBAO\"";
        f5737[108] = "Wo$\u001b;sP0 v\u042d\rKo!\u0006<mQl-\r";
        f5737[109] = "lz2E\u0017\u001f<8oSv\u0019<ydD\u0012\u0018\u0011ouR\u0016)0yq.MHa>qLN\u001bf:\r";
        f5737[110] = "\u0014#v5(\u0011H.~u\u0015\u051e(?}8e\u0019X=efv";
        f5737[111] = "`vm\u001c\u0000Juq{\u0001nUbgj\u0019\u0002g6$;BV06q:\u0017U_kag\u0012n";
        f5737[112] = "\f$\u0004p^LC<\u001d!8\u0018\u001f8\u0000!oLOn_r8OFeX=\u0004HNl\u001b4";
        f5737[113] = ">\u0013\n/Of<\u0017\u0000?!;y\u001c\u00018H8\u0003J\u0003?D0\u007f\u001c\u000e2L\\";
        f5737[114] = "Z\tp\u0018m\rM\u0013|\u0017R_V\u0018%\u001b\u0005\b\bJzw<JZ\u001a0OlVO\u0014";
        f5737[115] = "-*smfU:0\u007fbY\f-*\"e5>zls>ai9l k=Xp2|fY";
        f5737[116] = "O&\"\\\u0013GF6$\f-OR4zRA}\u0006p*\f-\u0013Uxs\u000eBNE%v5\u0014@\u000f!!ZIPR$\u001a\fG\u001aVsuQWGSH#_\u001dC\u0004'~O@F?qp\u0005D\u0011P,`XA*\u0006\"*\\\u0016E[2wY-U[q{\nANYuh5";
        f5737[117] = "2\u0004K Qcb\u0018^. >1\u0003F(L\feN\u001av\u0010[5FV-]dm\u001f\u0018/ ";
        f5737[118] = ";E\u001b]-o,^\u0019\u0001\\uF\u0001\u0007C,e8L\u0005\u0005<";
        f5737[119] = "\u0010#\u0019<g1Oa\ff\u00072\u0019!\u0005jk\u0000Me_3?WN>\u0004hk+\u00183\t`\u0007";
        f5737[120] = "\fZgH_2M]zKb/\u001d_aQ\u000e\u001dK\u001e:\rZJJ@`S\u000e6\u001cMm[b";
        f5737[121] = "\u0005\u001dN`{k\u0010\u001aX}\u0015t\u0007\fIeyF[@\u0018\u0002,{Z\u0019\u0012mqk\u0007\u001c);\u007f!\u0003KFfo|\u0006p\u0010h%xQ\u001fMxx}j\u001fDew\u007f\u0010\nCsj\u0011";
        f5737[122] = "\u0019eL[I\u0007XbQXt\u001a\b`JB\u0018(^!\u0011\u001eN\u007f_\u007fK@\u0018\u0003\trFHt";
        f5737[123] = "J\u001c<$RV\u000b\u001b!'oK[\u0019:=\u0003y\rXaaV.\f\u0006;?\u0003RZ\u000b67o";
        f5737[124] = "\b#>f@\u0004\u001f8<:1\u000b\b<]h__\u001c?`p\u000eU\rX yR\n\u000427bPVu";
        f5737[125] = "|l7H rz8uNK&q-gC'\u0014&j<\u001erC%;7Mp,x+jHK";
        f5737[126] = "\u0017\u000fH@6P\u0016\r\u001fOP[\u0016JCU<iA\r\u001c\fj>\u0019YFN.U\u0005\f\u001cJP";
        f5737[127] = "3\u0019r\u001d'kqLsFBon\u0001o@.]=E?\u001c{\noDdU$dnF3ZB5|\u0007\u007fG<x~Ao'}uy\roY0w?\u001d\u000f\u0018=ps\u001dqU?6c}?C?0f\u001c}\u0016>k\u0003";
        f5737[128] = "\u0005\u00106;/r\u0004\u0012a4Iy\u0004U=.%KS\u0012bwp\u001cV\u0018'q7a\u0017L78I";
        f5737[129] = "/hY\u0002\u00122(7]o\u057eL3h\\\u001f\u0015,)kP\u0014";
        f5737[130] = "D[t\u0010]Z\u0013\u00041\u00064JLQ.\u0006c\u001d\u0016\u0001sj\rN\u001dUq\u0005P^@P";
        f5737[131] = "P\u0018\u0011\t6b\u000fZ\u0004SVaY\u001a\r_:S\r^W\u0006m\u0004\u000e\u0005\f]:xX\b\u0001UV";
        f5737[132] = "I&\u0002/USNy\u0006B\u048e-D}V8YS\u0013\"\u0013.";
        f5737[133] = "\"3*%1F/;r'XNA~h4(_?3jr8";
        f5737[134] = "k\fnu\u0006cp\u000ejf9jy\u00147sUX-Qo+9`y\u000f5zCu~\u0019(\u0014";
        f5737[135] = "\f>N=f\f\\|\u0013+\u0007\u0002\\ \u001c\tf\nA&qix\u001cM&\u000f$zZ]FJk;ZA.I8<^=";
        f5737[136] = "jhna=yqjjr\u0002pxp7gnB,4g1\u0002,,42zp{,28b\u0002.(0k|`-{7o\u0000";
        f5737[137] = "\u0017<6\u00122~\u0010c2\u007f\u0493\u0000L1&G)}\re6\u000e";
        f5737[138] = ")\u0005IXo}{GODt\u0004lFXS~|yF\\Snu\u0010\u0006RT`hlP_Yh\u0004*_PPix|R]X\u0005>s]TYyh~P\\5";
        f5737[139] = """
                     z&X\fTS1&\u0006\u00188KmdV\u000eTy<#
                     R\u0003.{u\u000eVBE~}	R8\u0015=$
                     \u0015Z\u0016n#\u000ei""";
        f5737[140] = "H_op^r\u001d\u001ckm=|IXNvAiETPcTxG$`sVyAKr\"V#$";
        f5737[141] = "\u0007L\u001b\u001d{>\u0010W\u0019A\n%z\b\u0007\u0003z4\u0004E\u0005Ej";
        f5737[142] = "\u0016\u0005WtZQ\u0017H\u0017w\"XE\t\u0007wNj\u0016MX!\u001e=S\u0018_/XVV\u0010X+\"";
        f5737[143] = "Fi9\u0016M\u0010A6={\u01ban\u001c%c\u001fP\u0002\u001dh#\u001c";
        f5737[144] = "kXFgs2l\u0007B\n\u0484LwXCzt,m[Oq";
        f5737[145] = "O>ti\u0010\u001a\u0018a1\u007fy\nG4.\u007f.]\u001ddp\u0013@\u000e\u00160q|\u001d\u001eK5";
        f5737[146] = "OPm\u0012O?\u001f\u00120\u0004.8\u0018A8\u001dC\u0019\u0013P.\u0019r8\u0005TRB\u0013iBT0A@nF(";
        f5737[147] = "T!-\u0007P\bS~)j\u0380vH!(\u001aW\u0016R\"$\u0011";
        f5737[148] = "L\f0Bt\u0003Y\u000b&_\u001a\u0017B\f3LM@\u0018[l #\u0013\u0013\blO~\u0003N\r";
        f5737[149] = "=xEN6Wb:P\u0014VT4zY\u0018:f`>\u0003Aj1ceX\u001a:M5hU\u0012V";
        f5737[150] = "\riD(\u0015 ]+\u0019>t1Qm #\u001d&Qk{8\t4U|\u001b8Mq]\u0011@~Hv@sC-Or<";
        f5737[151] = "X\u000eo.q]_QkC\u02ae#\u0002B5'lO\u0003\u000fu$";
        f5737[152] = "\u0001\u0019\\s+![\u001b_vD\u01c8fCT'(sXX\u000bt+\u0011\u0001B\rt&/\u001a\u001d^wD";
        f5737[153] = "H!h>k=O~lS\u0281C\u0013,xkp>Rxh\"\u000e|Sgr3p1Q!bS1<Vmb-|>\u0010}\u0002lq9\\}|!s\u007fL\u001d=,t3Lcp.2#,\"})~#Ro\u007fonC\u0013bx#n=^`>3\u000eyO|g?r/BqoS5~\u0010!~16-\u0017%\u0002";
        f5737[154] = "xAo\t8gv_}\bH\u057e\u0019\u0007bQ-reQo\\%\u001e";
        f5737[155] = "7\\Y\u0015zVg\u001e\u0004\u0003\u001bPg_\u000f\u0014\u007fQMY\u0002\u001a\u001b\u0007;\u0018Z\u0002y\u0004h\u001f^~";
        f5737[156] = "X5\f\u007f&\u001a\u0005jT}\u001b\u0005VyVtw7\u0001>\u000e\" `ThQqu\u001aAoGl\u001bYDhJju\f\u0005\u007fR\u0013";
        f5737[157] = "Sf\u0007tC8_gZ{>`@g\u0004aRR\u0011'U;><G+\r=QaWv\b\u0006";
        f5737[158] = "\u0019?5]\u00136\u001fkw[xb\u0014~eV\u0014PC9>\bG\u0007@h5XCh\u001dxh]x";
        f5737[159] = "\u0011?<~p<\rjfz\u000e+\t9?y`0\t5Ya|j\u00189 lt2\u001aP:p3<\u001a)7xk>s";
        f5737[160] = "(X9/0\n?C;sA\u0012U\u001c%11\u0000+Q'w!";
        f5737[161] = "`@Bwe)g\u001fF\u001a\u01beW:\f\u0018~x;;AX}";
        f5737[162] = "(/fB\u0003n/pb/\u02f0\u0010rc<K\u001e|s.|H";
        f5737[163] = "=y/UQ\u001a%!+\u0000(\u0003;f{EP\u00059sjRe\u0004!{jNp\u0005&{j^O\u0004]z+\u000fD\tl|\u007fMBbbelOH\u001c/g*_(\u0003mbw\u0007B\u0005!'w?";
        f5737[164] = "c[[\u0014\u001f\u001ad\u0004_y\u01dbd9\u0017\u0001\u001d\u0002\b8ZA\u001e";
        f5737[165] = "4&']/q}x{PK% `%S'\u0017w'}\fs@4{*O$&uf/VK";
        f5737[166] = "\u0019\u0017\f\u0012`i\u0018\u0016\u001c\u0005\u0019{\u001bp\u0007\u0006h{\u0018N'\fwo\u0012T`]fn\u000fH\u001e\u0010d(\u001f(_\u001dcd\u001fV\u0012\u001f%t\u007f\u0013]^%h\u001d\u0010\u000eY!\u0014";
        f5737[167] = ">/LNaI\u007f2IW\u000eJ*4CRbx}r\u0012\u00045/|u\u001f\trM\u007f&\u0018\r\u000e";
        f5737[168] = "[|A6y\u000f\u0014dXg\u001f[H`EgH\f\u00142\u001f\u000b&\r\u00191Q7!\u0005\u0010rX";
        f5737[169] = "V8Q\\jOC?GA\u0004PT)VYhb\u0000j\u0007\u000555\u0000?\u0006W?Z]/[R\u0004";
        f5737[170] = "`=#tO;!:>wr&q8%m\u001e\u0014'y~1IC&'$o\u001e?p*)gr";
        f5737[171] = "\\_\u0010\r\u000fo[\u0000\u0014`\u0006kQ\u001c!\u0000\u0003iUc\u0005\u0004Sp\u0007\u000f\u001e\u0006Wc8Z\u0010P\u0003*W\u0007\u0000\r\u0006\u0011\u0001\tJ\tQ~\\\u0019\u0017\fj(RS\u0013[\u0005uB\u000e\u0016`SnU\u001f\u0003\u000e\u0006/B\u0007zY\u0015|D\u001a\u0014\fTk\\c@\u0003\u000btT\u001f\u0016\u000e\u0006|8XG\\VmZ[\u0014[R\u0011";
        f5737[172] = "6\u0007\u001brSatPAx,t%TCt{ {\u0002\u0018',hz\u0005MgW*-_G";
        f5737[173] = "~H>_\u001a\u001ckO(Bt\bpH=Q#_*\u001fc=M\f!LbR\u0010\u001c|I";
        f5737[174] = "$W,\u0018\u0015d>T \u0013wa1\u0017#\u000f\u001bSbSsPF\u0004gV\u007fT\u000bfd\u0005xPw";
        f5737[175] = "l-eMW\u0007;r [>\u0017d'?[i@>w`7W\u001e;02I\u0000A~&";
        f5737[176] = ">NU%f\u001an\f\b3\u0007\u001fbJ/)k\u001dkh\u000b#x5fJ\u0010/wp0\u0007\u0010vy\rqS\u0000?\u0007";
    }
    
    public static Class m706(long n, long n2) {
        int m704 = m704(n, n2);
        Object o = Class352.f5737[m704];
        Class<?> forName;
        try {
            if (o instanceof String) {
                forName = Class.forName(Class352.f5738[m704]);
                Class352.f5737[m704] = forName;
            }
            else {
                forName = (Class)o;
            }
        }
        catch (Exception ex) {
            throw new IllegalStateException(ex.toString());
        }
        return forName;
    }
    
    public static Field m707(Class clazz, String anObject, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(anObject) && field.getType() == clazz2) {
                return field;
            }
        }
        return null;
    }
    
    public static Field m708(Class clazz, String s, Class clazz2) {
        Field m707 = m707(clazz, s, clazz2);
        if (m707 != null) {
            return m707;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Field m708 = m708(interfaces[i], s, clazz2);
                if (m708 != null) {
                    return m708;
                }
            }
        }
        return null;
    }
    
    public static Field m709(long n, long n2) {
        int m704 = m704(n, n2);
        Object o = Class352.f5737[m704];
        if (!(o instanceof String)) {
            return (Field)o;
        }
        String s = Class352.f5738[m704];
        int index = s.indexOf(8);
        Class m705 = m706(Long.parseLong(s.substring(0, index), 36), 0L);
        ++index;
        int index2 = s.indexOf(8, index);
        String substring = s.substring(index, index2);
        ++index2;
        Class m706 = m706(Long.parseLong(s.substring(index2), 36), 0L);
        Class clazz = m705;
        while (true) {
            Field m707 = m707(clazz, substring, m706);
            if (m707 != null) {
                return (Field)(Class352.f5737[m704] = m707);
            }
            Class[] interfaces = clazz.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; ++i) {
                    Field m708 = m708(interfaces[i], substring, m706);
                    if (m708 != null) {
                        return (Field)(Class352.f5737[m704] = m708);
                    }
                }
            }
            if (clazz.getName().equals("java.lang.Object")) {
                StringBuffer sb = new StringBuffer();
                sb.append("NoSuchFieldException in ").append(m705.getName()).append(' ').append(m706.getName()).append(' ').append(substring);
                throw new IllegalStateException(sb.toString());
            }
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                continue;
            }
            clazz = m706(3914181676385505L, 0L);
        }
    }
    
    public static Method m710(Class clazz, String anObject, Class clazz2, int n, Class[] array) {
        for (Method method : clazz.getDeclaredMethods()) {
            Label_0097: {
                if (method.getName().equals(anObject) && method.getReturnType() == clazz2) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == n) {
                        for (int j = 0; j < n; ++j) {
                            if (parameterTypes[j] != array[j]) {
                                break Label_0097;
                            }
                        }
                        return method;
                    }
                }
            }
        }
        return null;
    }
    
    public static Method m711(Class clazz, String s, Class clazz2, int n, Class[] array) {
        Method m710 = m710(clazz, s, clazz2, n, array);
        if (m710 != null) {
            return m710;
        }
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces != null) {
            for (int i = 0; i < interfaces.length; ++i) {
                Method m711 = m711(interfaces[i], s, clazz2, n, array);
                if (m711 != null) {
                    return m711;
                }
            }
        }
        return null;
    }
    
    public static Method m712(long n, long n2) {
        int m704 = m704(n, n2);
        Object o = Class352.f5737[m704];
        if (o instanceof String) {
            String s = Class352.f5738[m704];
            int index = s.indexOf(8);
            Class m705 = m706(Long.parseLong(s.substring(0, index), 36), 0L);
            ++index;
            int index2 = s.indexOf(8, index);
            String substring = s.substring(index, index2);
            int n3 = -1;
            int index3 = index2;
            do {
                ++n3;
            } while ((index3 = s.indexOf(8, ++index3)) > -1);
            int n4;
            Class[] array = new Class[n4 = n3 - 1];
            Class m706 = null;
            int n5 = index2 + 1;
            for (int i = 0; i < n3; ++i) {
                int index4 = s.indexOf(8, n5);
                m706 = m706(Long.parseLong(s.substring(n5, index4), 36), 0L);
                if (i < n4) {
                    array[i] = m706;
                }
                n5 = index4 + 1;
            }
            Class superclass = m705;
            while (true) {
                do {
                    Method m707 = m710(superclass, substring, m706, n4, array);
                    if (m707 != null) {
                        return (Method)(Class352.f5737[m704] = m707);
                    }
                    if (!superclass.getName().equals("java.lang.Object")) {
                        continue;
                    }
                    Class clazz = m705;
                    while (true) {
                        Class[] interfaces;
                        if ((interfaces = clazz.getInterfaces()) != null) {
                            for (int j = 0; j < interfaces.length; ++j) {
                                Method m708 = m711(interfaces[j], substring, m706, n4, array);
                                if (m708 != null) {
                                    return (Method)(Class352.f5737[m704] = m708);
                                }
                            }
                        }
                        if (clazz.getName().equals("java.lang.Object")) {
                            StringBuffer sb = new StringBuffer();
                            sb.append("NoSuchMethodException in ").append(m705.getName()).append(' ').append(m706.getName()).append(' ').append(substring).append('(');
                            int k = 0;
                            while (k < n4) {
                                sb.append(array[k].getName());
                                if (++k < n4) {
                                    sb.append(", ");
                                }
                            }
                            sb.append(')');
                            throw new IllegalStateException(sb.toString());
                        }
                        if ((clazz = clazz.getSuperclass()) != null) {
                            continue;
                        }
                        clazz = m706(3914181676385505L, 0L);
                    }
                } while ((superclass = superclass.getSuperclass()) != null);
                m706(3914181676385505L, 0L);
                continue;
            }
        }
        return (Method)o;
    }
    
    public static MethodHandle m713(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType methodType, long n, long n2) {
        char char1 = s.charAt(0);
        Field m709 = null;
        Method m710 = null;
        try {
            MethodHandle target;
            if (char1 == 'M' || char1 == '\u00cb' || char1 == '\u00c1' || char1 == '\u00e7') {
                m709 = m709(n, n2);
                Class<?> declaringClass = m709.getDeclaringClass();
                String name = m709.getName();
                Class<?> type = m709.getType();
                if (char1 == 'M') {
                    target = lookup.findGetter(declaringClass, name, type);
                }
                else if (char1 == '\u00cb') {
                    target = lookup.findSetter(declaringClass, name, type);
                }
                else if (char1 == '\u00c1') {
                    target = lookup.findStaticGetter(declaringClass, name, type);
                }
                else {
                    target = lookup.findStaticSetter(declaringClass, name, type);
                }
            }
            else {
                m710 = m712(n, n2);
                Class<?> declaringClass2 = m710.getDeclaringClass();
                String name2 = m710.getName();
                MethodType methodType2 = MethodType.methodType(m710.getReturnType(), m710.getParameterTypes());
                if (char1 == '\u00d3') {
                    target = lookup.findVirtual(declaringClass2, name2, methodType2);
                }
                else if (char1 == 'y') {
                    target = lookup.findStatic(declaringClass2, name2, methodType2);
                }
                else {
                    target = lookup.findSpecial(declaringClass2, name2, methodType2, declaringClass2);
                }
            }
            return MethodHandles.dropArguments(target, methodType.parameterCount() - 2, (Class<?>[])new Class[] { Long.TYPE, Long.TYPE });
        }
        catch (Exception ex) {
            StringBuilder sb = new StringBuilder();
            sb.append(ex.getClass().getName()).append(" : ").append((m709 != null) ? m709.toString() : ((m710 != null) ? m710.toString() : " null ")).append(" : ").append(ex.toString());
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static Object m714(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String s, MethodType newType, Object[] array) {
        int n = array.length - 2;
        MethodHandle m713 = m713(lookup, mutableCallSite, s, newType, (long)array[n], (long)array[++n]);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(m713, newType));
        try {
           return m713.asSpreader(Object[].class, array.length).invoke(array);
        } catch (Throwable throwable) {
           throw new IllegalStateException(throwable);
        }
    }
    
    public static CallSite m265(MethodHandles.Lookup p0, String p1, MethodType p2) {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'org/rusherhack/Class352.m265:(Ljava/lang/invoke/MethodHandles.Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;'.
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:67)
        //     at com.strobel.assembler.metadata.MethodDefinition.tryLoadBody(MethodDefinition.java:729)
        //     at com.strobel.assembler.metadata.MethodDefinition.getBody(MethodDefinition.java:83)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:194)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // Caused by: java.lang.ClassCastException: class com.strobel.assembler.ir.ConstantPool.MethodHandleEntry cannot be cast to class com.strobel.assembler.ir.ConstantPool.ConstantEntry (com.strobel.assembler.ir.ConstantPool.MethodHandleEntry and com.strobel.assembler.ir.ConstantPool.ConstantEntry are in unnamed module of loader 'app')
        //     at com.strobel.assembler.ir.ConstantPool.lookupConstant(ConstantPool.java:120)
        //     at com.strobel.assembler.metadata.ClassFileReader.Scope.lookupConstant(ClassFileReader.java:1590)
        //     at com.strobel.assembler.metadata.MethodReader.readBodyCore(MethodReader.java:299)
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:63)
        //     ... 15 more
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_1
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_1.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_1.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_1.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, Object.class, float.class, float.class, float.class, float.class, float.class, float.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_1.fence = 1;
                ProcyonInvokeDynamicHelper_1.handle = handle;
                ProcyonInvokeDynamicHelper_1.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, float p2, float p3, float p4, float p5, float p6, float p7, int p8, long p9, long p10) {
            try {
                ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_2.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_2.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_2.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_2.fence = 1;
                ProcyonInvokeDynamicHelper_2.handle = handle;
                ProcyonInvokeDynamicHelper_2.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_2.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_3.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_3.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_3.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(MatrixStack.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_3.fence = 1;
                ProcyonInvokeDynamicHelper_3.handle = handle;
                ProcyonInvokeDynamicHelper_3.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack invoke(Object p0, long p1, long p2) {
            try {
                return (MatrixStack) ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_4.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_4.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_4.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_4.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_4.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(MatrixStack.Entry.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_4.fence = 1;
                ProcyonInvokeDynamicHelper_4.handle = handle;
                ProcyonInvokeDynamicHelper_4.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack.Entry invoke(Object p0, long p1, long p2) {
            try {
                return (MatrixStack.Entry) ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_5.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_5.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_5.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_5.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_5.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_5.fence = 1;
                ProcyonInvokeDynamicHelper_5.handle = handle;
                ProcyonInvokeDynamicHelper_5.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_6.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_6.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_6.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_6.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_6.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_6.fence = 1;
                ProcyonInvokeDynamicHelper_6.handle = handle;
                ProcyonInvokeDynamicHelper_6.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_6.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_7.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_7.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_7.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_7.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_7.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_7.fence = 1;
                ProcyonInvokeDynamicHelper_7.handle = handle;
                ProcyonInvokeDynamicHelper_7.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_7.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_8.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_8.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_8.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_8.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_8.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(Matrix4f.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_8.fence = 1;
                ProcyonInvokeDynamicHelper_8.handle = handle;
                ProcyonInvokeDynamicHelper_8.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(long p0, long p1) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_8.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_9.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_9.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_9.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_9.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_9.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_9.fence = 1;
                ProcyonInvokeDynamicHelper_9.handle = handle;
                ProcyonInvokeDynamicHelper_9.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_9.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_10.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_10.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_10.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_10.fence = 1;
                ProcyonInvokeDynamicHelper_10.handle = handle;
                ProcyonInvokeDynamicHelper_10.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_10.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_11.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_11.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_11.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(Matrix4f.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_11.fence = 1;
                ProcyonInvokeDynamicHelper_11.handle = handle;
                ProcyonInvokeDynamicHelper_11.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(long p0, long p1) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_11.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_12.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_12.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_12.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_12.fence = 1;
                ProcyonInvokeDynamicHelper_12.handle = handle;
                ProcyonInvokeDynamicHelper_12.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_12.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_13.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_13.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_13.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_13.fence = 1;
                ProcyonInvokeDynamicHelper_13.handle = handle;
                ProcyonInvokeDynamicHelper_13.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_13.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_14.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_14.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_14.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_14.fence = 1;
                ProcyonInvokeDynamicHelper_14.handle = handle;
                ProcyonInvokeDynamicHelper_14.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_14.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_15.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_15.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_15.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_15.fence = 1;
                ProcyonInvokeDynamicHelper_15.handle = handle;
                ProcyonInvokeDynamicHelper_15.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_15.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_16.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_16.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_16.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_16.fence = 1;
                ProcyonInvokeDynamicHelper_16.handle = handle;
                ProcyonInvokeDynamicHelper_16.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_16.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_17.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_17.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_17.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_17.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_17.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_17.fence = 1;
                ProcyonInvokeDynamicHelper_17.handle = handle;
                ProcyonInvokeDynamicHelper_17.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_17.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_18.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_18.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_18.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_18.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_18.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_18.fence = 1;
                ProcyonInvokeDynamicHelper_18.handle = handle;
                ProcyonInvokeDynamicHelper_18.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_18.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_19.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_19.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_19.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_19.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_19.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_19.fence = 1;
                ProcyonInvokeDynamicHelper_19.handle = handle;
                ProcyonInvokeDynamicHelper_19.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_19.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_20.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_20.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_20.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_20.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_20.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_20.fence = 1;
                ProcyonInvokeDynamicHelper_20.handle = handle;
                ProcyonInvokeDynamicHelper_20.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_20.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_21.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_21.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_21.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_21.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_21.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_21.fence = 1;
                ProcyonInvokeDynamicHelper_21.handle = handle;
                ProcyonInvokeDynamicHelper_21.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_21.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_22.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_22.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_22.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_22.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_22.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_22.fence = 1;
                ProcyonInvokeDynamicHelper_22.handle = handle;
                ProcyonInvokeDynamicHelper_22.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_22.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_23.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_23.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_23.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_23.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_23.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_23.fence = 1;
                ProcyonInvokeDynamicHelper_23.handle = handle;
                ProcyonInvokeDynamicHelper_23.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_23.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_24.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_24.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_24.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_24.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_24.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_24.fence = 1;
                ProcyonInvokeDynamicHelper_24.handle = handle;
                ProcyonInvokeDynamicHelper_24.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_24.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_25.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_25.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_25.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_25.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_25.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(MinecraftClient.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_25.fence = 1;
                ProcyonInvokeDynamicHelper_25.handle = handle;
                ProcyonInvokeDynamicHelper_25.fence = 0;
            }
            return handle;
        }
        
        public static MinecraftClient invoke(long p0, long p1) {
            try {
                return (MinecraftClient) ProcyonInvokeDynamicHelper_25.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_26.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_26.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_26.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_26.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_26.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(GameRenderer.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_26.fence = 1;
                ProcyonInvokeDynamicHelper_26.handle = handle;
                ProcyonInvokeDynamicHelper_26.fence = 0;
            }
            return handle;
        }
        
        public static GameRenderer invoke(Object p0, long p1, long p2) {
            try {
                return (GameRenderer) ProcyonInvokeDynamicHelper_26.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_27.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_27.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_27.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_27.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_27.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Camera.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_27.fence = 1;
                ProcyonInvokeDynamicHelper_27.handle = handle;
                ProcyonInvokeDynamicHelper_27.fence = 0;
            }
            return handle;
        }
        
        public static Camera invoke(Object p0, long p1, long p2) {
            try {
                return (Camera) ProcyonInvokeDynamicHelper_27.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_28.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_28.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_28.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_28.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_28.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_28.fence = 1;
                ProcyonInvokeDynamicHelper_28.handle = handle;
                ProcyonInvokeDynamicHelper_28.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
            try {
                return (Vec3d) ProcyonInvokeDynamicHelper_28.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_29.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_29.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_29.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_29.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_29.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, Vec3d.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_29.fence = 1;
                ProcyonInvokeDynamicHelper_29.handle = handle;
                ProcyonInvokeDynamicHelper_29.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Vec3d p1, long p2, long p3) {
            try {
                ProcyonInvokeDynamicHelper_29.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
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
            MethodHandle handle = ProcyonInvokeDynamicHelper_30.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_30.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_30.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_30.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_30.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(MinecraftClient.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_30.fence = 1;
                ProcyonInvokeDynamicHelper_30.handle = handle;
                ProcyonInvokeDynamicHelper_30.fence = 0;
            }
            return handle;
        }
        
        public static MinecraftClient invoke(long p0, long p1) {
            try {
                return (MinecraftClient) ProcyonInvokeDynamicHelper_30.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_31
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_31.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_31.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_31.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_31.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_31.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(GameRenderer.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_31.fence = 1;
                ProcyonInvokeDynamicHelper_31.handle = handle;
                ProcyonInvokeDynamicHelper_31.fence = 0;
            }
            return handle;
        }
        
        public static GameRenderer invoke(Object p0, long p1, long p2) {
            try {
                return (GameRenderer) ProcyonInvokeDynamicHelper_31.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_32
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_32.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_32.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_32.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_32.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_32.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Camera.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_32.fence = 1;
                ProcyonInvokeDynamicHelper_32.handle = handle;
                ProcyonInvokeDynamicHelper_32.fence = 0;
            }
            return handle;
        }
        
        public static Camera invoke(Object p0, long p1, long p2) {
            try {
                return (Camera) ProcyonInvokeDynamicHelper_32.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_33
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_33.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_33.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_33.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_33.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_33.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_33.fence = 1;
                ProcyonInvokeDynamicHelper_33.handle = handle;
                ProcyonInvokeDynamicHelper_33.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
            try {
                return (Vec3d) ProcyonInvokeDynamicHelper_33.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_34
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_34.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_34.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_34.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_34.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_34.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(MinecraftClient.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_34.fence = 1;
                ProcyonInvokeDynamicHelper_34.handle = handle;
                ProcyonInvokeDynamicHelper_34.fence = 0;
            }
            return handle;
        }
        
        public static MinecraftClient invoke(long p0, long p1) {
            try {
                return (MinecraftClient) ProcyonInvokeDynamicHelper_34.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_35
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_35.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_35.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_35.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_35.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_35.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Window.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_35.fence = 1;
                ProcyonInvokeDynamicHelper_35.handle = handle;
                ProcyonInvokeDynamicHelper_35.fence = 0;
            }
            return handle;
        }
        
        public static Window invoke(Object p0, long p1, long p2) {
            try {
                return (Window) ProcyonInvokeDynamicHelper_35.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_36
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_36.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_36.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_36.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_36.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_36.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_36.fence = 1;
                ProcyonInvokeDynamicHelper_36.handle = handle;
                ProcyonInvokeDynamicHelper_36.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(long p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_36.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_37
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_37.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_37.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_37.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_37.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_37.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_37.fence = 1;
                ProcyonInvokeDynamicHelper_37.handle = handle;
                ProcyonInvokeDynamicHelper_37.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(long p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_37.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_38
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_38.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_38.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_38.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_38.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_38.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_38.fence = 1;
                ProcyonInvokeDynamicHelper_38.handle = handle;
                ProcyonInvokeDynamicHelper_38.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(long p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_38.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_39
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_39.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_39.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_39.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_39.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_39.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_39.fence = 1;
                ProcyonInvokeDynamicHelper_39.handle = handle;
                ProcyonInvokeDynamicHelper_39.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(long p0, long p1) {
            try {
                return (int) ProcyonInvokeDynamicHelper_39.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_40
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_40.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_40.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_40.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_40.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_40.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_40.fence = 1;
                ProcyonInvokeDynamicHelper_40.handle = handle;
                ProcyonInvokeDynamicHelper_40.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_40.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_41
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_41.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_41.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_41.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_41.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_41.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_41.fence = 1;
                ProcyonInvokeDynamicHelper_41.handle = handle;
                ProcyonInvokeDynamicHelper_41.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_41.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_42
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_42.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_42.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_42.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_42.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_42.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_42.fence = 1;
                ProcyonInvokeDynamicHelper_42.handle = handle;
                ProcyonInvokeDynamicHelper_42.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_42.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_43
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_43.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_43.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_43.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_43.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_43.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_43.fence = 1;
                ProcyonInvokeDynamicHelper_43.handle = handle;
                ProcyonInvokeDynamicHelper_43.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_43.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_44
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_44.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_44.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_44.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_44.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_44.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_44.fence = 1;
                ProcyonInvokeDynamicHelper_44.handle = handle;
                ProcyonInvokeDynamicHelper_44.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_44.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_45
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_45.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_45.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_45.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_45.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_45.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_45.fence = 1;
                ProcyonInvokeDynamicHelper_45.handle = handle;
                ProcyonInvokeDynamicHelper_45.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
            try {
                return (double) ProcyonInvokeDynamicHelper_45.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_46
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_46.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_46.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_46.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_46.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_46.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_46.fence = 1;
                ProcyonInvokeDynamicHelper_46.handle = handle;
                ProcyonInvokeDynamicHelper_46.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_46.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_47
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_47.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_47.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_47.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_47.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_47.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Vector4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_47.fence = 1;
                ProcyonInvokeDynamicHelper_47.handle = handle;
                ProcyonInvokeDynamicHelper_47.fence = 0;
            }
            return handle;
        }
        
        public static Vector4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Vector4f) ProcyonInvokeDynamicHelper_47.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_48
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_48.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_48.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_48.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_48.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_48.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_48.fence = 1;
                ProcyonInvokeDynamicHelper_48.handle = handle;
                ProcyonInvokeDynamicHelper_48.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_48.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_49
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_49.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_49.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_49.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_49.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_49.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_49.fence = 1;
                ProcyonInvokeDynamicHelper_49.handle = handle;
                ProcyonInvokeDynamicHelper_49.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_49.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_50
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_50.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_50.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_50.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_50.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_50.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_50.fence = 1;
                ProcyonInvokeDynamicHelper_50.handle = handle;
                ProcyonInvokeDynamicHelper_50.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return (Matrix4f) ProcyonInvokeDynamicHelper_50.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_51
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_51.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_51.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_51.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_51.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_51.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_51.fence = 1;
                ProcyonInvokeDynamicHelper_51.handle = handle;
                ProcyonInvokeDynamicHelper_51.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
            try {
                return (float) ProcyonInvokeDynamicHelper_51.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_52
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_52.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_52.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_52.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_52.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_52.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_52.fence = 1;
                ProcyonInvokeDynamicHelper_52.handle = handle;
                ProcyonInvokeDynamicHelper_52.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
            try {
                return (float) ProcyonInvokeDynamicHelper_52.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_53
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_53.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_53.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_53.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_53.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_53.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_53.fence = 1;
                ProcyonInvokeDynamicHelper_53.handle = handle;
                ProcyonInvokeDynamicHelper_53.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
            try {
                return (float) ProcyonInvokeDynamicHelper_53.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_54
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_54.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_54.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_54.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_54.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_54.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Vector3f.class, Object.class, float.class, float.class, float.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_54.fence = 1;
                ProcyonInvokeDynamicHelper_54.handle = handle;
                ProcyonInvokeDynamicHelper_54.fence = 0;
            }
            return handle;
        }
        
        public static Vector3f invoke(Object p0, float p1, float p2, float p3, Object p4, Object p5, long p6, long p7) {
            try {
                return (Vector3f) ProcyonInvokeDynamicHelper_54.handle().invokeExact(p0, p1, p2, p3, p4, p5, p6, p7);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_55
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_55.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_55.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_55.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_55.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_55.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_55.fence = 1;
                ProcyonInvokeDynamicHelper_55.handle = handle;
                ProcyonInvokeDynamicHelper_55.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_56
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_56.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_56.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_56.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_56.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_56.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_56.fence = 1;
                ProcyonInvokeDynamicHelper_56.handle = handle;
                ProcyonInvokeDynamicHelper_56.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(float p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_57
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_57.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_57.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_57.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_57.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_57.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_57.fence = 1;
                ProcyonInvokeDynamicHelper_57.handle = handle;
                ProcyonInvokeDynamicHelper_57.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_58
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_58.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_58.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_58.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_58.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_58.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_58.fence = 1;
                ProcyonInvokeDynamicHelper_58.handle = handle;
                ProcyonInvokeDynamicHelper_58.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_59
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_59.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_59.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_59.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_59.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_59.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_59.fence = 1;
                ProcyonInvokeDynamicHelper_59.handle = handle;
                ProcyonInvokeDynamicHelper_59.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_60
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_60.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_60.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_60.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_60.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_60.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(int.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_60.fence = 1;
                ProcyonInvokeDynamicHelper_60.handle = handle;
                ProcyonInvokeDynamicHelper_60.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(Object p0, long p1, long p2) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_61
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_61.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_61.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_61.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_61.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_61.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_61.fence = 1;
                ProcyonInvokeDynamicHelper_61.handle = handle;
                ProcyonInvokeDynamicHelper_61.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_62
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_62.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_62.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_62.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_62.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_62.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_62.fence = 1;
                ProcyonInvokeDynamicHelper_62.handle = handle;
                ProcyonInvokeDynamicHelper_62.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_63
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_63.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_63.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_63.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_63.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_63.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_63.fence = 1;
                ProcyonInvokeDynamicHelper_63.handle = handle;
                ProcyonInvokeDynamicHelper_63.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_64
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_64.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_64.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_64.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_64.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_64.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_64.fence = 1;
                ProcyonInvokeDynamicHelper_64.handle = handle;
                ProcyonInvokeDynamicHelper_64.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(long p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_65
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_65.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_65.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_65.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_65.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_65.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_65.fence = 1;
                ProcyonInvokeDynamicHelper_65.handle = handle;
                ProcyonInvokeDynamicHelper_65.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_66
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_66.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_66.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_66.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_66.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_66.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_66.fence = 1;
                ProcyonInvokeDynamicHelper_66.handle = handle;
                ProcyonInvokeDynamicHelper_66.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_67
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_67.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_67.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_67.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_67.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_67.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_67.fence = 1;
                ProcyonInvokeDynamicHelper_67.handle = handle;
                ProcyonInvokeDynamicHelper_67.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_68
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_68.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_68.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_68.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_68.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_68.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m120(lookup, "h", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_68.fence = 1;
                ProcyonInvokeDynamicHelper_68.handle = handle;
                ProcyonInvokeDynamicHelper_68.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_69
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_69.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_69.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_69.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_69.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_69.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_69.fence = 1;
                ProcyonInvokeDynamicHelper_69.handle = handle;
                ProcyonInvokeDynamicHelper_69.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_70
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_70.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_70.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_70.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_70.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_70.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_70.fence = 1;
                ProcyonInvokeDynamicHelper_70.handle = handle;
                ProcyonInvokeDynamicHelper_70.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_71
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_71.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_71.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_71.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_71.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_71.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(MinecraftClient.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_71.fence = 1;
                ProcyonInvokeDynamicHelper_71.handle = handle;
                ProcyonInvokeDynamicHelper_71.fence = 0;
            }
            return handle;
        }
        
        public static MinecraftClient invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_72
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_72.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_72.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_72.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_72.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_72.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(BufferBuilderStorage.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_72.fence = 1;
                ProcyonInvokeDynamicHelper_72.handle = handle;
                ProcyonInvokeDynamicHelper_72.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilderStorage invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_73
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_73.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_73.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static VertexConsumerProvider.Immediate invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_74
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_74.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_74.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_74.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_74.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_74.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_74.fence = 1;
                ProcyonInvokeDynamicHelper_74.handle = handle;
                ProcyonInvokeDynamicHelper_74.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_75
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_75.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_75.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_75.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_75.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_75.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, MatrixStack.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_75.fence = 1;
                ProcyonInvokeDynamicHelper_75.handle = handle;
                ProcyonInvokeDynamicHelper_75.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, MatrixStack p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_76
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_76.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_76.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_76.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_76.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_76.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, boolean.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_76.fence = 1;
                ProcyonInvokeDynamicHelper_76.handle = handle;
                ProcyonInvokeDynamicHelper_76.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_77
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_77.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_77.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_77.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_77.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_77.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, boolean.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_77.fence = 1;
                ProcyonInvokeDynamicHelper_77.handle = handle;
                ProcyonInvokeDynamicHelper_77.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_78
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_78.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_78.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_78.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_78.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_78.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_78.fence = 1;
                ProcyonInvokeDynamicHelper_78.handle = handle;
                ProcyonInvokeDynamicHelper_78.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, float p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_79
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_79.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_79.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_79.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_79.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_79.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, Vec3d.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_79.fence = 1;
                ProcyonInvokeDynamicHelper_79.handle = handle;
                ProcyonInvokeDynamicHelper_79.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Vec3d p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_80
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_80.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_80.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_80.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_80.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_80.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(MatrixStack.Entry.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_80.fence = 1;
                ProcyonInvokeDynamicHelper_80.handle = handle;
                ProcyonInvokeDynamicHelper_80.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack.Entry invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_81
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_81.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_81.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_81.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_81.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_81.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_81.fence = 1;
                ProcyonInvokeDynamicHelper_81.handle = handle;
                ProcyonInvokeDynamicHelper_81.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_82
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_82.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_82.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_82.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_82.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_82.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(Matrix4f.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_82.fence = 1;
                ProcyonInvokeDynamicHelper_82.handle = handle;
                ProcyonInvokeDynamicHelper_82.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_83
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_83.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_83.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_83.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_83.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_83.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, Frustum.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_83.fence = 1;
                ProcyonInvokeDynamicHelper_83.handle = handle;
                ProcyonInvokeDynamicHelper_83.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Frustum p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_84
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_84.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_84.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_84.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_84.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_84.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Frustum.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_84.fence = 1;
                ProcyonInvokeDynamicHelper_84.handle = handle;
                ProcyonInvokeDynamicHelper_84.fence = 0;
            }
            return handle;
        }
        
        public static Frustum invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_85
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_85.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_85.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_85.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_85.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_85.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_85.fence = 1;
                ProcyonInvokeDynamicHelper_85.handle = handle;
                ProcyonInvokeDynamicHelper_85.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_86
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_86.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_86.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_86.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_86.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_86.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_86.fence = 1;
                ProcyonInvokeDynamicHelper_86.handle = handle;
                ProcyonInvokeDynamicHelper_86.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_87
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_87.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_87.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_87.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_87.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_87.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_87.fence = 1;
                ProcyonInvokeDynamicHelper_87.handle = handle;
                ProcyonInvokeDynamicHelper_87.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_88
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_88.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_88.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_88.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_88.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_88.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_88.fence = 1;
                ProcyonInvokeDynamicHelper_88.handle = handle;
                ProcyonInvokeDynamicHelper_88.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_89
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_89.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_89.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_89.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_89.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_89.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_89.fence = 1;
                ProcyonInvokeDynamicHelper_89.handle = handle;
                ProcyonInvokeDynamicHelper_89.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_90
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_90.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_90.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_90.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_90.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_90.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_90.fence = 1;
                ProcyonInvokeDynamicHelper_90.handle = handle;
                ProcyonInvokeDynamicHelper_90.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_91
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_91.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_91.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_91.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_91.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_91.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, double.class, double.class, double.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_91.fence = 1;
                ProcyonInvokeDynamicHelper_91.handle = handle;
                ProcyonInvokeDynamicHelper_91.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, double p1, double p2, double p3, long p4, long p5) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_92
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_92.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_92.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_92.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_92.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_92.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferAllocator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_92.fence = 1;
                ProcyonInvokeDynamicHelper_92.handle = handle;
                ProcyonInvokeDynamicHelper_92.fence = 0;
            }
            return handle;
        }
        
        public static BufferAllocator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_93
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_93.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_93.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_93.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_93.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_93.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(VertexFormat.DrawMode.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_93.fence = 1;
                ProcyonInvokeDynamicHelper_93.handle = handle;
                ProcyonInvokeDynamicHelper_93.fence = 0;
            }
            return handle;
        }
        
        public static VertexFormat.DrawMode invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_94
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_94.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_94.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_94.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_94.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_94.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(VertexFormat.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_94.fence = 1;
                ProcyonInvokeDynamicHelper_94.handle = handle;
                ProcyonInvokeDynamicHelper_94.fence = 0;
            }
            return handle;
        }
        
        public static VertexFormat invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_95
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_95.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_95.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_95.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_95.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_95.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_95.fence = 1;
                ProcyonInvokeDynamicHelper_95.handle = handle;
                ProcyonInvokeDynamicHelper_95.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_96
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_96.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_96.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_96.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_96.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_96.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferAllocator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_96.fence = 1;
                ProcyonInvokeDynamicHelper_96.handle = handle;
                ProcyonInvokeDynamicHelper_96.fence = 0;
            }
            return handle;
        }
        
        public static BufferAllocator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_97
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_97.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_97.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_97.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_97.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_97.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(VertexFormat.DrawMode.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_97.fence = 1;
                ProcyonInvokeDynamicHelper_97.handle = handle;
                ProcyonInvokeDynamicHelper_97.fence = 0;
            }
            return handle;
        }
        
        public static VertexFormat.DrawMode invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_98
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_98.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_98.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_98.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_98.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_98.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(VertexFormat.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_98.fence = 1;
                ProcyonInvokeDynamicHelper_98.handle = handle;
                ProcyonInvokeDynamicHelper_98.fence = 0;
            }
            return handle;
        }
        
        public static VertexFormat invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_99
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_99.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_99.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_99.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_99.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_99.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_99.fence = 1;
                ProcyonInvokeDynamicHelper_99.handle = handle;
                ProcyonInvokeDynamicHelper_99.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_100
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_100.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_100.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_100.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_100.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_100.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferAllocator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_100.fence = 1;
                ProcyonInvokeDynamicHelper_100.handle = handle;
                ProcyonInvokeDynamicHelper_100.fence = 0;
            }
            return handle;
        }
        
        public static BufferAllocator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_101
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_101.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_101.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_101.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_101.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_101.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(VertexFormat.DrawMode.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_101.fence = 1;
                ProcyonInvokeDynamicHelper_101.handle = handle;
                ProcyonInvokeDynamicHelper_101.fence = 0;
            }
            return handle;
        }
        
        public static VertexFormat.DrawMode invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_102
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_102.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_102.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_102.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_102.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_102.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(VertexFormat.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_102.fence = 1;
                ProcyonInvokeDynamicHelper_102.handle = handle;
                ProcyonInvokeDynamicHelper_102.fence = 0;
            }
            return handle;
        }
        
        public static VertexFormat invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_103
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_103.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_103.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_103.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_103.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_103.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_103.fence = 1;
                ProcyonInvokeDynamicHelper_103.handle = handle;
                ProcyonInvokeDynamicHelper_103.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_104
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_104.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_104.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_104.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_104.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_104.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferAllocator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_104.fence = 1;
                ProcyonInvokeDynamicHelper_104.handle = handle;
                ProcyonInvokeDynamicHelper_104.fence = 0;
            }
            return handle;
        }
        
        public static BufferAllocator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_105
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_105.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_105.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_105.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_105.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_105.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(VertexFormat.DrawMode.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_105.fence = 1;
                ProcyonInvokeDynamicHelper_105.handle = handle;
                ProcyonInvokeDynamicHelper_105.fence = 0;
            }
            return handle;
        }
        
        public static VertexFormat.DrawMode invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_106
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_106.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_106.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_106.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_106.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_106.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(VertexFormat.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_106.fence = 1;
                ProcyonInvokeDynamicHelper_106.handle = handle;
                ProcyonInvokeDynamicHelper_106.fence = 0;
            }
            return handle;
        }
        
        public static VertexFormat invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_107
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_107.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_107.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_107.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_107.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_107.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_107.fence = 1;
                ProcyonInvokeDynamicHelper_107.handle = handle;
                ProcyonInvokeDynamicHelper_107.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_108
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_108.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_108.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_108.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_108.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_108.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferAllocator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_108.fence = 1;
                ProcyonInvokeDynamicHelper_108.handle = handle;
                ProcyonInvokeDynamicHelper_108.fence = 0;
            }
            return handle;
        }
        
        public static BufferAllocator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_109
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_109.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_109.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_109.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_109.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_109.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(VertexFormat.DrawMode.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_109.fence = 1;
                ProcyonInvokeDynamicHelper_109.handle = handle;
                ProcyonInvokeDynamicHelper_109.fence = 0;
            }
            return handle;
        }
        
        public static VertexFormat.DrawMode invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_110
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_110.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_110.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_110.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_110.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_110.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(VertexFormat.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_110.fence = 1;
                ProcyonInvokeDynamicHelper_110.handle = handle;
                ProcyonInvokeDynamicHelper_110.fence = 0;
            }
            return handle;
        }
        
        public static VertexFormat invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_111
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_111.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_111.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_111.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_111.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_111.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_111.fence = 1;
                ProcyonInvokeDynamicHelper_111.handle = handle;
                ProcyonInvokeDynamicHelper_111.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_112
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_112.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_112.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_112.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_112.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_112.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_112.fence = 1;
                ProcyonInvokeDynamicHelper_112.handle = handle;
                ProcyonInvokeDynamicHelper_112.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(float p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_113
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_113.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_113.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_113.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_113.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_113.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_113.fence = 1;
                ProcyonInvokeDynamicHelper_113.handle = handle;
                ProcyonInvokeDynamicHelper_113.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_114
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_114.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_114.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_114.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_114.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_114.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_114.fence = 1;
                ProcyonInvokeDynamicHelper_114.handle = handle;
                ProcyonInvokeDynamicHelper_114.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_115
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_115.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_115.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_115.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_115.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_115.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_115.fence = 1;
                ProcyonInvokeDynamicHelper_115.handle = handle;
                ProcyonInvokeDynamicHelper_115.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_116
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_116.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_116.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_116.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_116.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_116.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_116.fence = 1;
                ProcyonInvokeDynamicHelper_116.handle = handle;
                ProcyonInvokeDynamicHelper_116.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_117
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_117.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_117.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_117.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_117.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_117.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_117.fence = 1;
                ProcyonInvokeDynamicHelper_117.handle = handle;
                ProcyonInvokeDynamicHelper_117.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_118
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_118.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_118.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_118.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_118.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_118.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_118.fence = 1;
                ProcyonInvokeDynamicHelper_118.handle = handle;
                ProcyonInvokeDynamicHelper_118.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_119
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_119.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_119.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_119.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_119.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_119.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_119.fence = 1;
                ProcyonInvokeDynamicHelper_119.handle = handle;
                ProcyonInvokeDynamicHelper_119.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_120
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_120.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_120.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_120.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_120.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_120.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_120.fence = 1;
                ProcyonInvokeDynamicHelper_120.handle = handle;
                ProcyonInvokeDynamicHelper_120.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_121
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_121.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_121.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_121.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_121.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_121.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_121.fence = 1;
                ProcyonInvokeDynamicHelper_121.handle = handle;
                ProcyonInvokeDynamicHelper_121.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_122
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_122.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_122.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_122.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_122.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_122.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_122.fence = 1;
                ProcyonInvokeDynamicHelper_122.handle = handle;
                ProcyonInvokeDynamicHelper_122.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_123
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_123.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_123.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_123.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_123.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_123.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_123.fence = 1;
                ProcyonInvokeDynamicHelper_123.handle = handle;
                ProcyonInvokeDynamicHelper_123.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_124
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_124.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_124.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_124.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_124.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_124.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_124.fence = 1;
                ProcyonInvokeDynamicHelper_124.handle = handle;
                ProcyonInvokeDynamicHelper_124.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_125
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_125.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_125.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_125.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_125.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_125.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_125.fence = 1;
                ProcyonInvokeDynamicHelper_125.handle = handle;
                ProcyonInvokeDynamicHelper_125.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_126
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_126.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_126.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_126.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_126.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_126.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_126.fence = 1;
                ProcyonInvokeDynamicHelper_126.handle = handle;
                ProcyonInvokeDynamicHelper_126.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_127
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_127.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_127.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_127.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_127.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_127.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_127.fence = 1;
                ProcyonInvokeDynamicHelper_127.handle = handle;
                ProcyonInvokeDynamicHelper_127.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_128
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_128.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_128.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_128.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_128.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_128.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_128.fence = 1;
                ProcyonInvokeDynamicHelper_128.handle = handle;
                ProcyonInvokeDynamicHelper_128.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_129
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_129.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_129.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_129.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_129.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_129.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_129.fence = 1;
                ProcyonInvokeDynamicHelper_129.handle = handle;
                ProcyonInvokeDynamicHelper_129.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_130
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_130.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_130.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_130.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_130.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_130.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_130.fence = 1;
                ProcyonInvokeDynamicHelper_130.handle = handle;
                ProcyonInvokeDynamicHelper_130.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_131
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_131.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_131.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_131.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_131.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_131.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_131.fence = 1;
                ProcyonInvokeDynamicHelper_131.handle = handle;
                ProcyonInvokeDynamicHelper_131.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_132
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_132.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_132.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_132.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_132.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_132.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_132.fence = 1;
                ProcyonInvokeDynamicHelper_132.handle = handle;
                ProcyonInvokeDynamicHelper_132.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_133
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_133.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_133.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_133.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_133.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_133.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_133.fence = 1;
                ProcyonInvokeDynamicHelper_133.handle = handle;
                ProcyonInvokeDynamicHelper_133.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_134
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_134.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_134.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_134.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_134.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_134.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_134.fence = 1;
                ProcyonInvokeDynamicHelper_134.handle = handle;
                ProcyonInvokeDynamicHelper_134.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_135
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_135.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_135.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_135.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_135.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_135.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_135.fence = 1;
                ProcyonInvokeDynamicHelper_135.handle = handle;
                ProcyonInvokeDynamicHelper_135.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_136
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_136.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_136.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_136.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_136.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_136.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_136.fence = 1;
                ProcyonInvokeDynamicHelper_136.handle = handle;
                ProcyonInvokeDynamicHelper_136.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_137
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_137.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_137.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_137.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_137.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_137.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_137.fence = 1;
                ProcyonInvokeDynamicHelper_137.handle = handle;
                ProcyonInvokeDynamicHelper_137.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_138
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_138.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_138.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_138.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_138.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_138.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_138.fence = 1;
                ProcyonInvokeDynamicHelper_138.handle = handle;
                ProcyonInvokeDynamicHelper_138.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_139
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_139.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_139.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_139.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_139.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_139.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_139.fence = 1;
                ProcyonInvokeDynamicHelper_139.handle = handle;
                ProcyonInvokeDynamicHelper_139.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_140
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_140.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_140.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_140.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_140.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_140.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_140.fence = 1;
                ProcyonInvokeDynamicHelper_140.handle = handle;
                ProcyonInvokeDynamicHelper_140.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_141
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_141.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_141.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_141.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_141.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_141.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_141.fence = 1;
                ProcyonInvokeDynamicHelper_141.handle = handle;
                ProcyonInvokeDynamicHelper_141.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_142
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_142.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_142.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_142.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_142.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_142.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_142.fence = 1;
                ProcyonInvokeDynamicHelper_142.handle = handle;
                ProcyonInvokeDynamicHelper_142.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_143
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_143.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_143.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_143.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_143.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_143.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_143.fence = 1;
                ProcyonInvokeDynamicHelper_143.handle = handle;
                ProcyonInvokeDynamicHelper_143.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_144
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_144.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_144.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_144.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_144.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_144.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_144.fence = 1;
                ProcyonInvokeDynamicHelper_144.handle = handle;
                ProcyonInvokeDynamicHelper_144.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_145
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_145.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_145.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_145.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_145.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_145.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_145.fence = 1;
                ProcyonInvokeDynamicHelper_145.handle = handle;
                ProcyonInvokeDynamicHelper_145.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_146
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_146.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_146.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_146.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_146.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_146.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_146.fence = 1;
                ProcyonInvokeDynamicHelper_146.handle = handle;
                ProcyonInvokeDynamicHelper_146.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_147
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_147.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_147.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_147.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_147.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_147.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_147.fence = 1;
                ProcyonInvokeDynamicHelper_147.handle = handle;
                ProcyonInvokeDynamicHelper_147.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_148
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_148.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_148.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_148.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_148.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_148.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_148.fence = 1;
                ProcyonInvokeDynamicHelper_148.handle = handle;
                ProcyonInvokeDynamicHelper_148.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_149
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_149.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_149.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_149.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_149.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_149.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_149.fence = 1;
                ProcyonInvokeDynamicHelper_149.handle = handle;
                ProcyonInvokeDynamicHelper_149.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_150
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_150.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_150.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_150.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_150.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_150.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_150.fence = 1;
                ProcyonInvokeDynamicHelper_150.handle = handle;
                ProcyonInvokeDynamicHelper_150.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_151
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_151.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_151.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_151.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_151.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_151.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_151.fence = 1;
                ProcyonInvokeDynamicHelper_151.handle = handle;
                ProcyonInvokeDynamicHelper_151.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_152
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_152.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_152.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_152.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_152.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_152.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_152.fence = 1;
                ProcyonInvokeDynamicHelper_152.handle = handle;
                ProcyonInvokeDynamicHelper_152.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_153
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_153.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_153.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_153.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_153.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_153.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_153.fence = 1;
                ProcyonInvokeDynamicHelper_153.handle = handle;
                ProcyonInvokeDynamicHelper_153.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_154
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_154.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_154.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_154.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_154.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_154.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_154.fence = 1;
                ProcyonInvokeDynamicHelper_154.handle = handle;
                ProcyonInvokeDynamicHelper_154.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_155
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_155.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_155.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_155.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_155.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_155.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_155.fence = 1;
                ProcyonInvokeDynamicHelper_155.handle = handle;
                ProcyonInvokeDynamicHelper_155.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_156
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_156.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_156.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_156.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_156.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_156.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_156.fence = 1;
                ProcyonInvokeDynamicHelper_156.handle = handle;
                ProcyonInvokeDynamicHelper_156.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_157
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_157.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_157.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_157.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_157.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_157.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_157.fence = 1;
                ProcyonInvokeDynamicHelper_157.handle = handle;
                ProcyonInvokeDynamicHelper_157.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_158
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_158.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_158.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_158.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_158.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_158.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_158.fence = 1;
                ProcyonInvokeDynamicHelper_158.handle = handle;
                ProcyonInvokeDynamicHelper_158.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_159
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_159.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_159.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_159.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_159.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_159.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_159.fence = 1;
                ProcyonInvokeDynamicHelper_159.handle = handle;
                ProcyonInvokeDynamicHelper_159.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_160
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_160.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_160.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_160.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_160.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_160.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_160.fence = 1;
                ProcyonInvokeDynamicHelper_160.handle = handle;
                ProcyonInvokeDynamicHelper_160.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_161
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_161.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_161.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_161.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_161.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_161.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_161.fence = 1;
                ProcyonInvokeDynamicHelper_161.handle = handle;
                ProcyonInvokeDynamicHelper_161.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_162
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_162.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_162.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_162.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_162.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_162.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_162.fence = 1;
                ProcyonInvokeDynamicHelper_162.handle = handle;
                ProcyonInvokeDynamicHelper_162.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_163
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_163.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_163.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_163.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_163.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_163.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_163.fence = 1;
                ProcyonInvokeDynamicHelper_163.handle = handle;
                ProcyonInvokeDynamicHelper_163.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_164
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_164.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_164.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_164.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_164.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_164.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_164.fence = 1;
                ProcyonInvokeDynamicHelper_164.handle = handle;
                ProcyonInvokeDynamicHelper_164.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_165
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_165.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_165.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_165.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_165.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_165.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_165.fence = 1;
                ProcyonInvokeDynamicHelper_165.handle = handle;
                ProcyonInvokeDynamicHelper_165.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_166
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_166.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_166.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_166.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_166.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_166.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_166.fence = 1;
                ProcyonInvokeDynamicHelper_166.handle = handle;
                ProcyonInvokeDynamicHelper_166.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_167
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_167.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_167.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_167.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_167.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_167.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_167.fence = 1;
                ProcyonInvokeDynamicHelper_167.handle = handle;
                ProcyonInvokeDynamicHelper_167.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_168
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_168.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_168.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_168.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_168.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_168.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_168.fence = 1;
                ProcyonInvokeDynamicHelper_168.handle = handle;
                ProcyonInvokeDynamicHelper_168.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_169
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_169.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_169.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_169.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_169.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_169.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_169.fence = 1;
                ProcyonInvokeDynamicHelper_169.handle = handle;
                ProcyonInvokeDynamicHelper_169.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_170
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_170.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_170.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_170.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_170.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_170.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_170.fence = 1;
                ProcyonInvokeDynamicHelper_170.handle = handle;
                ProcyonInvokeDynamicHelper_170.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_171
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_171.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_171.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_171.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_171.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_171.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_171.fence = 1;
                ProcyonInvokeDynamicHelper_171.handle = handle;
                ProcyonInvokeDynamicHelper_171.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_172
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_172.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_172.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_172.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_172.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_172.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_172.fence = 1;
                ProcyonInvokeDynamicHelper_172.handle = handle;
                ProcyonInvokeDynamicHelper_172.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_173
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_173.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_173.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_173.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_173.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_173.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_173.fence = 1;
                ProcyonInvokeDynamicHelper_173.handle = handle;
                ProcyonInvokeDynamicHelper_173.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_174
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_174.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_174.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_174.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_174.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_174.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_174.fence = 1;
                ProcyonInvokeDynamicHelper_174.handle = handle;
                ProcyonInvokeDynamicHelper_174.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_175
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_175.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_175.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_175.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_175.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_175.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_175.fence = 1;
                ProcyonInvokeDynamicHelper_175.handle = handle;
                ProcyonInvokeDynamicHelper_175.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_176
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_176.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_176.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_176.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_176.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_176.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_176.fence = 1;
                ProcyonInvokeDynamicHelper_176.handle = handle;
                ProcyonInvokeDynamicHelper_176.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_177
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_177.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_177.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_177.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_177.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_177.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_177.fence = 1;
                ProcyonInvokeDynamicHelper_177.handle = handle;
                ProcyonInvokeDynamicHelper_177.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_178
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_178.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_178.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_178.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_178.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_178.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_178.fence = 1;
                ProcyonInvokeDynamicHelper_178.handle = handle;
                ProcyonInvokeDynamicHelper_178.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_179
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_179.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_179.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_179.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_179.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_179.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_179.fence = 1;
                ProcyonInvokeDynamicHelper_179.handle = handle;
                ProcyonInvokeDynamicHelper_179.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_180
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_180.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_180.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_180.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_180.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_180.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_180.fence = 1;
                ProcyonInvokeDynamicHelper_180.handle = handle;
                ProcyonInvokeDynamicHelper_180.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_181
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_181.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_181.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_181.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_181.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_181.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_181.fence = 1;
                ProcyonInvokeDynamicHelper_181.handle = handle;
                ProcyonInvokeDynamicHelper_181.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_182
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_182.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_182.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_182.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_182.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_182.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_182.fence = 1;
                ProcyonInvokeDynamicHelper_182.handle = handle;
                ProcyonInvokeDynamicHelper_182.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_183
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_183.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_183.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_183.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_183.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_183.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_183.fence = 1;
                ProcyonInvokeDynamicHelper_183.handle = handle;
                ProcyonInvokeDynamicHelper_183.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_184
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_184.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_184.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_184.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_184.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_184.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_184.fence = 1;
                ProcyonInvokeDynamicHelper_184.handle = handle;
                ProcyonInvokeDynamicHelper_184.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_185
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_185.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_185.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_185.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_185.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_185.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_185.fence = 1;
                ProcyonInvokeDynamicHelper_185.handle = handle;
                ProcyonInvokeDynamicHelper_185.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_186
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_186.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_186.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_186.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_186.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_186.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_186.fence = 1;
                ProcyonInvokeDynamicHelper_186.handle = handle;
                ProcyonInvokeDynamicHelper_186.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_187
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_187.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_187.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_187.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_187.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_187.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_187.fence = 1;
                ProcyonInvokeDynamicHelper_187.handle = handle;
                ProcyonInvokeDynamicHelper_187.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_188
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_188.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_188.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_188.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_188.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_188.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_188.fence = 1;
                ProcyonInvokeDynamicHelper_188.handle = handle;
                ProcyonInvokeDynamicHelper_188.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_189
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_189.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_189.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_189.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_189.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_189.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_189.fence = 1;
                ProcyonInvokeDynamicHelper_189.handle = handle;
                ProcyonInvokeDynamicHelper_189.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_190
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_190.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_190.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_190.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_190.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_190.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_190.fence = 1;
                ProcyonInvokeDynamicHelper_190.handle = handle;
                ProcyonInvokeDynamicHelper_190.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_191
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_191.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_191.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_191.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_191.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_191.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_191.fence = 1;
                ProcyonInvokeDynamicHelper_191.handle = handle;
                ProcyonInvokeDynamicHelper_191.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_192
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_192.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_192.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_192.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_192.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_192.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_192.fence = 1;
                ProcyonInvokeDynamicHelper_192.handle = handle;
                ProcyonInvokeDynamicHelper_192.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_193
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_193.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_193.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_193.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_193.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_193.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_193.fence = 1;
                ProcyonInvokeDynamicHelper_193.handle = handle;
                ProcyonInvokeDynamicHelper_193.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_194
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_194.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_194.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_194.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_194.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_194.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_194.fence = 1;
                ProcyonInvokeDynamicHelper_194.handle = handle;
                ProcyonInvokeDynamicHelper_194.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_195
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_195.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_195.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_195.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_195.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_195.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(VoxelShape.class, double.class, double.class, double.class, double.class, double.class, double.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_195.fence = 1;
                ProcyonInvokeDynamicHelper_195.handle = handle;
                ProcyonInvokeDynamicHelper_195.fence = 0;
            }
            return handle;
        }
        
        public static VoxelShape invoke(double p0, double p1, double p2, double p3, double p4, double p5, long p6, long p7) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_196
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_196.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_196.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_196.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_196.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_196.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, Object.class, double.class, double.class, double.class, boolean.class, boolean.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_196.fence = 1;
                ProcyonInvokeDynamicHelper_196.handle = handle;
                ProcyonInvokeDynamicHelper_196.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Object p1, double p2, double p3, double p4, boolean p5, boolean p6, int p7, long p8, long p9) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_197
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_197.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_197.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_197.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_197.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_197.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_197.fence = 1;
                ProcyonInvokeDynamicHelper_197.handle = handle;
                ProcyonInvokeDynamicHelper_197.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_198
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_198.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_198.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_198.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_198.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_198.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_198.fence = 1;
                ProcyonInvokeDynamicHelper_198.handle = handle;
                ProcyonInvokeDynamicHelper_198.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_199
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_199.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_199.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_199.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_199.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_199.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_199.fence = 1;
                ProcyonInvokeDynamicHelper_199.handle = handle;
                ProcyonInvokeDynamicHelper_199.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_200
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_200.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_200.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_200.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_200.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_200.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_200.fence = 1;
                ProcyonInvokeDynamicHelper_200.handle = handle;
                ProcyonInvokeDynamicHelper_200.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_201
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_201.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_201.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_201.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_201.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_201.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_201.fence = 1;
                ProcyonInvokeDynamicHelper_201.handle = handle;
                ProcyonInvokeDynamicHelper_201.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_202
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_202.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_202.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_202.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_202.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_202.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m132(lookup, "s", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_202.fence = 1;
                ProcyonInvokeDynamicHelper_202.handle = handle;
                ProcyonInvokeDynamicHelper_202.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_203
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_203.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_203.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_203.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_203.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_203.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m132(lookup, "s", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_203.fence = 1;
                ProcyonInvokeDynamicHelper_203.handle = handle;
                ProcyonInvokeDynamicHelper_203.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_204
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_204.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_204.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_204.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_204.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_204.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m132(lookup, "s", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_204.fence = 1;
                ProcyonInvokeDynamicHelper_204.handle = handle;
                ProcyonInvokeDynamicHelper_204.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_205
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_205.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_205.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_205.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_205.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_205.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m132(lookup, "s", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_205.fence = 1;
                ProcyonInvokeDynamicHelper_205.handle = handle;
                ProcyonInvokeDynamicHelper_205.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_206
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_206.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_206.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_206.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_206.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_206.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m132(lookup, "s", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_206.fence = 1;
                ProcyonInvokeDynamicHelper_206.handle = handle;
                ProcyonInvokeDynamicHelper_206.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_207
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_207.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_207.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_207.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_207.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_207.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, MatrixStack.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_207.fence = 1;
                ProcyonInvokeDynamicHelper_207.handle = handle;
                ProcyonInvokeDynamicHelper_207.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, MatrixStack p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_208
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_208.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_208.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_208.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_208.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_208.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(Vec3d.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_208.fence = 1;
                ProcyonInvokeDynamicHelper_208.handle = handle;
                ProcyonInvokeDynamicHelper_208.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_209
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_209.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_209.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_209.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_209.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_209.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, Vec3d.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_209.fence = 1;
                ProcyonInvokeDynamicHelper_209.handle = handle;
                ProcyonInvokeDynamicHelper_209.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Vec3d p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_210
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_210.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_210.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_210.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_210.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_210.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, boolean.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_210.fence = 1;
                ProcyonInvokeDynamicHelper_210.handle = handle;
                ProcyonInvokeDynamicHelper_210.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_211
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_211.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_211.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_211.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_211.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_211.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, boolean.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_211.fence = 1;
                ProcyonInvokeDynamicHelper_211.handle = handle;
                ProcyonInvokeDynamicHelper_211.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_212
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_212.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_212.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_212.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_212.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_212.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_212.fence = 1;
                ProcyonInvokeDynamicHelper_212.handle = handle;
                ProcyonInvokeDynamicHelper_212.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, float p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_213
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_213.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_213.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_213.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_213.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_213.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(Vec3d.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_213.fence = 1;
                ProcyonInvokeDynamicHelper_213.handle = handle;
                ProcyonInvokeDynamicHelper_213.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_214
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_214.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_214.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_214.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_214.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_214.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, Vec3d.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_214.fence = 1;
                ProcyonInvokeDynamicHelper_214.handle = handle;
                ProcyonInvokeDynamicHelper_214.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Vec3d p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_215
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_215.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_215.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_215.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_215.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_215.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(int[].class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_215.fence = 1;
                ProcyonInvokeDynamicHelper_215.handle = handle;
                ProcyonInvokeDynamicHelper_215.fence = 0;
            }
            return handle;
        }
        
        public static int[] invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_216
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_216.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_216.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_216.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_216.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_216.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(int.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_216.fence = 1;
                ProcyonInvokeDynamicHelper_216.handle = handle;
                ProcyonInvokeDynamicHelper_216.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(Object p0, long p1, long p2) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_217
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_217.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_217.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_217.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_217.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_217.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_217.fence = 1;
                ProcyonInvokeDynamicHelper_217.handle = handle;
                ProcyonInvokeDynamicHelper_217.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_218
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_218.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_218.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_218.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_218.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_218.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, double.class, double.class, double.class, double.class, double.class, double.class, boolean.class, boolean.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_218.fence = 1;
                ProcyonInvokeDynamicHelper_218.handle = handle;
                ProcyonInvokeDynamicHelper_218.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, double p1, double p2, double p3, double p4, double p5, double p6, boolean p7, boolean p8, int p9, long p10, long p11) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_219
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_219.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_219.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_219.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_219.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_219.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_219.fence = 1;
                ProcyonInvokeDynamicHelper_219.handle = handle;
                ProcyonInvokeDynamicHelper_219.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_220
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_220.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_220.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_220.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_220.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_220.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, double.class, double.class, double.class, double.class, double.class, double.class, boolean.class, boolean.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_220.fence = 1;
                ProcyonInvokeDynamicHelper_220.handle = handle;
                ProcyonInvokeDynamicHelper_220.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, double p1, double p2, double p3, double p4, double p5, double p6, boolean p7, boolean p8, int p9, long p10, long p11) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_221
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_221.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_221.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_221.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_221.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_221.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, double.class, double.class, double.class, double.class, double.class, double.class, boolean.class, boolean.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_221.fence = 1;
                ProcyonInvokeDynamicHelper_221.handle = handle;
                ProcyonInvokeDynamicHelper_221.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, double p1, double p2, double p3, double p4, double p5, double p6, boolean p7, boolean p8, int p9, long p10, long p11) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_222
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_222.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_222.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_222.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_222.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_222.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, double.class, double.class, double.class, double.class, double.class, double.class, boolean.class, boolean.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_222.fence = 1;
                ProcyonInvokeDynamicHelper_222.handle = handle;
                ProcyonInvokeDynamicHelper_222.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, double p1, double p2, double p3, double p4, double p5, double p6, boolean p7, boolean p8, int p9, long p10, long p11) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_223
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_223.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_223.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_223.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_223.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_223.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, double.class, double.class, double.class, double.class, double.class, double.class, boolean.class, boolean.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_223.fence = 1;
                ProcyonInvokeDynamicHelper_223.handle = handle;
                ProcyonInvokeDynamicHelper_223.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, double p1, double p2, double p3, double p4, double p5, double p6, boolean p7, boolean p8, int p9, long p10, long p11) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_224
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_224.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_224.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_224.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_224.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_224.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Box.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_224.fence = 1;
                ProcyonInvokeDynamicHelper_224.handle = handle;
                ProcyonInvokeDynamicHelper_224.fence = 0;
            }
            return handle;
        }
        
        public static Box invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_225
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_225.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_225.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_225.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_225.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_225.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_225.fence = 1;
                ProcyonInvokeDynamicHelper_225.handle = handle;
                ProcyonInvokeDynamicHelper_225.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_226
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_226.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_226.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_226.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_226.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_226.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_226.fence = 1;
                ProcyonInvokeDynamicHelper_226.handle = handle;
                ProcyonInvokeDynamicHelper_226.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_227
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_227.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_227.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_227.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_227.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_227.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_227.fence = 1;
                ProcyonInvokeDynamicHelper_227.handle = handle;
                ProcyonInvokeDynamicHelper_227.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_228
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_228.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_228.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_228.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_228.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_228.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Box.class, Object.class, double.class, double.class, double.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_228.fence = 1;
                ProcyonInvokeDynamicHelper_228.handle = handle;
                ProcyonInvokeDynamicHelper_228.fence = 0;
            }
            return handle;
        }
        
        public static Box invoke(Object p0, double p1, double p2, double p3, long p4, long p5) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_229
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_229.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_229.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_229.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_229.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_229.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(double[].class, Object.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_229.fence = 1;
                ProcyonInvokeDynamicHelper_229.handle = handle;
                ProcyonInvokeDynamicHelper_229.fence = 0;
            }
            return handle;
        }
        
        public static double[] invoke(Object p0, float p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_230
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_230.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_230.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_230.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_230.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_230.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_230.fence = 1;
                ProcyonInvokeDynamicHelper_230.handle = handle;
                ProcyonInvokeDynamicHelper_230.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_231
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_231.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_231.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_231.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_231.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_231.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_231.fence = 1;
                ProcyonInvokeDynamicHelper_231.handle = handle;
                ProcyonInvokeDynamicHelper_231.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_232
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_232.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_232.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_232.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_232.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_232.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_232.fence = 1;
                ProcyonInvokeDynamicHelper_232.handle = handle;
                ProcyonInvokeDynamicHelper_232.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_233
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_233.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_233.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_233.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_233.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_233.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_233.fence = 1;
                ProcyonInvokeDynamicHelper_233.handle = handle;
                ProcyonInvokeDynamicHelper_233.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_234
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_234.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_234.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_234.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_234.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_234.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_234.fence = 1;
                ProcyonInvokeDynamicHelper_234.handle = handle;
                ProcyonInvokeDynamicHelper_234.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_235
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_235.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_235.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_235.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_235.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_235.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_235.fence = 1;
                ProcyonInvokeDynamicHelper_235.handle = handle;
                ProcyonInvokeDynamicHelper_235.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_236
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_236.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_236.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_236.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_236.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_236.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, double.class, double.class, double.class, double.class, double.class, double.class, boolean.class, boolean.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_236.fence = 1;
                ProcyonInvokeDynamicHelper_236.handle = handle;
                ProcyonInvokeDynamicHelper_236.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, double p1, double p2, double p3, double p4, double p5, double p6, boolean p7, boolean p8, int p9, long p10, long p11) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_237
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_237.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_237.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_237.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_237.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_237.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(MatrixStack.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_237.fence = 1;
                ProcyonInvokeDynamicHelper_237.handle = handle;
                ProcyonInvokeDynamicHelper_237.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_238
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_238.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_238.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_238.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_238.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_238.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_238.fence = 1;
                ProcyonInvokeDynamicHelper_238.handle = handle;
                ProcyonInvokeDynamicHelper_238.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_239
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_239.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_239.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_239.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_239.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_239.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_239.fence = 1;
                ProcyonInvokeDynamicHelper_239.handle = handle;
                ProcyonInvokeDynamicHelper_239.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_240
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_240.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_240.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_240.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_240.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_240.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, boolean.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_240.fence = 1;
                ProcyonInvokeDynamicHelper_240.handle = handle;
                ProcyonInvokeDynamicHelper_240.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_241
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_241.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_241.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_241.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_241.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_241.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_241.fence = 1;
                ProcyonInvokeDynamicHelper_241.handle = handle;
                ProcyonInvokeDynamicHelper_241.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, float p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_242
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_242.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_242.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_242.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_242.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_242.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_242.fence = 1;
                ProcyonInvokeDynamicHelper_242.handle = handle;
                ProcyonInvokeDynamicHelper_242.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_243
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_243.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_243.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_243.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_243.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_243.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_243.fence = 1;
                ProcyonInvokeDynamicHelper_243.handle = handle;
                ProcyonInvokeDynamicHelper_243.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_244
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_244.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_244.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_244.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_244.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_244.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_244.fence = 1;
                ProcyonInvokeDynamicHelper_244.handle = handle;
                ProcyonInvokeDynamicHelper_244.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_245
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_245.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_245.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_245.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_245.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_245.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_245.fence = 1;
                ProcyonInvokeDynamicHelper_245.handle = handle;
                ProcyonInvokeDynamicHelper_245.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(long p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_246
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_246.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_246.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_246.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_246.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_246.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(int.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_246.fence = 1;
                ProcyonInvokeDynamicHelper_246.handle = handle;
                ProcyonInvokeDynamicHelper_246.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(Object p0, long p1, long p2) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_247
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_247.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_247.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_247.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_247.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_247.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(int.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_247.fence = 1;
                ProcyonInvokeDynamicHelper_247.handle = handle;
                ProcyonInvokeDynamicHelper_247.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(Object p0, long p1, long p2) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_248
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_248.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_248.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_248.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_248.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_248.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(int.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_248.fence = 1;
                ProcyonInvokeDynamicHelper_248.handle = handle;
                ProcyonInvokeDynamicHelper_248.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(Object p0, long p1, long p2) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_249
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_249.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_249.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_249.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_249.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_249.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_249.fence = 1;
                ProcyonInvokeDynamicHelper_249.handle = handle;
                ProcyonInvokeDynamicHelper_249.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_250
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_250.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_250.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_250.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_250.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_250.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_250.fence = 1;
                ProcyonInvokeDynamicHelper_250.handle = handle;
                ProcyonInvokeDynamicHelper_250.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_251
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_251.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_251.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_251.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_251.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_251.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, double.class, double.class, double.class, double.class, double.class, double.class, boolean.class, boolean.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_251.fence = 1;
                ProcyonInvokeDynamicHelper_251.handle = handle;
                ProcyonInvokeDynamicHelper_251.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, double p1, double p2, double p3, double p4, double p5, double p6, boolean p7, boolean p8, int p9, long p10, long p11) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_252
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_252.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_252.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_252.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_252.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_252.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_252.fence = 1;
                ProcyonInvokeDynamicHelper_252.handle = handle;
                ProcyonInvokeDynamicHelper_252.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(long p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_253
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_253.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_253.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_253.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_253.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_253.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(MatrixStack.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_253.fence = 1;
                ProcyonInvokeDynamicHelper_253.handle = handle;
                ProcyonInvokeDynamicHelper_253.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_254
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_254.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_254.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_254.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_254.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_254.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(MatrixStack.Entry.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_254.fence = 1;
                ProcyonInvokeDynamicHelper_254.handle = handle;
                ProcyonInvokeDynamicHelper_254.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack.Entry invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_255
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_255.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_255.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_255.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_255.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_255.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_255.fence = 1;
                ProcyonInvokeDynamicHelper_255.handle = handle;
                ProcyonInvokeDynamicHelper_255.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_256
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_256.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_256.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_256.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_256.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_256.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(MatrixStack.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_256.fence = 1;
                ProcyonInvokeDynamicHelper_256.handle = handle;
                ProcyonInvokeDynamicHelper_256.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_257
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_257.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_257.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_257.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_257.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_257.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(MatrixStack.Entry.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_257.fence = 1;
                ProcyonInvokeDynamicHelper_257.handle = handle;
                ProcyonInvokeDynamicHelper_257.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack.Entry invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_258
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_258.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_258.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_258.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_258.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_258.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix3f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_258.fence = 1;
                ProcyonInvokeDynamicHelper_258.handle = handle;
                ProcyonInvokeDynamicHelper_258.fence = 0;
            }
            return handle;
        }
        
        public static Matrix3f invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_259
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_259.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_259.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_259.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_259.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_259.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_259.fence = 1;
                ProcyonInvokeDynamicHelper_259.handle = handle;
                ProcyonInvokeDynamicHelper_259.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_260
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_260.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_260.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_260.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_260.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_260.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_260.fence = 1;
                ProcyonInvokeDynamicHelper_260.handle = handle;
                ProcyonInvokeDynamicHelper_260.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_261
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_261.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_261.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_261.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_261.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_261.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_261.fence = 1;
                ProcyonInvokeDynamicHelper_261.handle = handle;
                ProcyonInvokeDynamicHelper_261.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_262
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_262.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_262.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_262.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_262.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_262.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, Vec3d.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_262.fence = 1;
                ProcyonInvokeDynamicHelper_262.handle = handle;
                ProcyonInvokeDynamicHelper_262.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Vec3d p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_263
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_263.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_263.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_263.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_263.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_263.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_263.fence = 1;
                ProcyonInvokeDynamicHelper_263.handle = handle;
                ProcyonInvokeDynamicHelper_263.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_264
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_264.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_264.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_264.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_264.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_264.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_264.fence = 1;
                ProcyonInvokeDynamicHelper_264.handle = handle;
                ProcyonInvokeDynamicHelper_264.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_265
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_265.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_265.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_265.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_265.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_265.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Frustum.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_265.fence = 1;
                ProcyonInvokeDynamicHelper_265.handle = handle;
                ProcyonInvokeDynamicHelper_265.fence = 0;
            }
            return handle;
        }
        
        public static Frustum invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_266
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_266.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_266.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_266.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_266.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_266.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_266.fence = 1;
                ProcyonInvokeDynamicHelper_266.handle = handle;
                ProcyonInvokeDynamicHelper_266.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_267
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_267.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_267.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_267.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_267.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_267.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_267.fence = 1;
                ProcyonInvokeDynamicHelper_267.handle = handle;
                ProcyonInvokeDynamicHelper_267.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_268
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_268.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_268.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_268.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_268.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_268.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_268.fence = 1;
                ProcyonInvokeDynamicHelper_268.handle = handle;
                ProcyonInvokeDynamicHelper_268.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_269
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_269.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_269.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_269.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_269.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_269.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(boolean.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_269.fence = 1;
                ProcyonInvokeDynamicHelper_269.handle = handle;
                ProcyonInvokeDynamicHelper_269.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, Object p1, long p2, long p3) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_270
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_270.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_270.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_270.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_270.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_270.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_270.fence = 1;
                ProcyonInvokeDynamicHelper_270.handle = handle;
                ProcyonInvokeDynamicHelper_270.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_271
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_271.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_271.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_271.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_271.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_271.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_271.fence = 1;
                ProcyonInvokeDynamicHelper_271.handle = handle;
                ProcyonInvokeDynamicHelper_271.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_272
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_272.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_272.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_272.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_272.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_272.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_272.fence = 1;
                ProcyonInvokeDynamicHelper_272.handle = handle;
                ProcyonInvokeDynamicHelper_272.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_273
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_273.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_273.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_273.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_273.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_273.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_273.fence = 1;
                ProcyonInvokeDynamicHelper_273.handle = handle;
                ProcyonInvokeDynamicHelper_273.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_274
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_274.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_274.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_274.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_274.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_274.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_274.fence = 1;
                ProcyonInvokeDynamicHelper_274.handle = handle;
                ProcyonInvokeDynamicHelper_274.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_275
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_275.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_275.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_275.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_275.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_275.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_275.fence = 1;
                ProcyonInvokeDynamicHelper_275.handle = handle;
                ProcyonInvokeDynamicHelper_275.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_276
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_276.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_276.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_276.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_276.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_276.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_276.fence = 1;
                ProcyonInvokeDynamicHelper_276.handle = handle;
                ProcyonInvokeDynamicHelper_276.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_277
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_277.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_277.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_277.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_277.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_277.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_277.fence = 1;
                ProcyonInvokeDynamicHelper_277.handle = handle;
                ProcyonInvokeDynamicHelper_277.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_278
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_278.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_278.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_278.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_278.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_278.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_278.fence = 1;
                ProcyonInvokeDynamicHelper_278.handle = handle;
                ProcyonInvokeDynamicHelper_278.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_279
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_279.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_279.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_279.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_279.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_279.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_279.fence = 1;
                ProcyonInvokeDynamicHelper_279.handle = handle;
                ProcyonInvokeDynamicHelper_279.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_280
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_280.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_280.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_280.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_280.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_280.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Vector3f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_280.fence = 1;
                ProcyonInvokeDynamicHelper_280.handle = handle;
                ProcyonInvokeDynamicHelper_280.fence = 0;
            }
            return handle;
        }
        
        public static Vector3f invoke(Object p0, Object p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_281
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_281.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_281.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_281.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_281.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_281.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_281.fence = 1;
                ProcyonInvokeDynamicHelper_281.handle = handle;
                ProcyonInvokeDynamicHelper_281.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_282
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_282.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_282.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_282.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_282.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_282.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_282.fence = 1;
                ProcyonInvokeDynamicHelper_282.handle = handle;
                ProcyonInvokeDynamicHelper_282.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_283
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_283.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_283.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_283.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_283.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_283.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_283.fence = 1;
                ProcyonInvokeDynamicHelper_283.handle = handle;
                ProcyonInvokeDynamicHelper_283.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_284
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_284.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_284.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_284.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_284.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_284.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_284.fence = 1;
                ProcyonInvokeDynamicHelper_284.handle = handle;
                ProcyonInvokeDynamicHelper_284.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_285
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_285.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_285.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_285.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_285.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_285.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_285.fence = 1;
                ProcyonInvokeDynamicHelper_285.handle = handle;
                ProcyonInvokeDynamicHelper_285.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_286
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_286.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_286.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_286.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_286.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_286.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_286.fence = 1;
                ProcyonInvokeDynamicHelper_286.handle = handle;
                ProcyonInvokeDynamicHelper_286.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_287
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_287.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_287.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_287.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_287.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_287.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_287.fence = 1;
                ProcyonInvokeDynamicHelper_287.handle = handle;
                ProcyonInvokeDynamicHelper_287.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, float p1, float p2, float p3, long p4, long p5) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_288
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_288.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_288.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_288.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_288.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_288.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(MatrixStack.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_288.fence = 1;
                ProcyonInvokeDynamicHelper_288.handle = handle;
                ProcyonInvokeDynamicHelper_288.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_289
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_289.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_289.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_289.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_289.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_289.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(MatrixStack.Entry.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_289.fence = 1;
                ProcyonInvokeDynamicHelper_289.handle = handle;
                ProcyonInvokeDynamicHelper_289.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack.Entry invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_290
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_290.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_290.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_290.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_290.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_290.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix4f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_290.fence = 1;
                ProcyonInvokeDynamicHelper_290.handle = handle;
                ProcyonInvokeDynamicHelper_290.fence = 0;
            }
            return handle;
        }
        
        public static Matrix4f invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_291
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_291.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_291.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_291.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_291.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_291.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(MatrixStack.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_291.fence = 1;
                ProcyonInvokeDynamicHelper_291.handle = handle;
                ProcyonInvokeDynamicHelper_291.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_292
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_292.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_292.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_292.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_292.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_292.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(MatrixStack.Entry.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_292.fence = 1;
                ProcyonInvokeDynamicHelper_292.handle = handle;
                ProcyonInvokeDynamicHelper_292.fence = 0;
            }
            return handle;
        }
        
        public static MatrixStack.Entry invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_293
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_293.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_293.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_293.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_293.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_293.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Matrix3f.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_293.fence = 1;
                ProcyonInvokeDynamicHelper_293.handle = handle;
                ProcyonInvokeDynamicHelper_293.fence = 0;
            }
            return handle;
        }
        
        public static Matrix3f invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_294
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_294.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_294.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_294.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_294.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_294.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Frustum.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_294.fence = 1;
                ProcyonInvokeDynamicHelper_294.handle = handle;
                ProcyonInvokeDynamicHelper_294.fence = 0;
            }
            return handle;
        }
        
        public static Frustum invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_295
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_295.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_295.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_295.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_295.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_295.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(boolean.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_295.fence = 1;
                ProcyonInvokeDynamicHelper_295.handle = handle;
                ProcyonInvokeDynamicHelper_295.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, Object p1, long p2, long p3) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_296
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_296.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_296.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_296.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_296.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_296.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_296.fence = 1;
                ProcyonInvokeDynamicHelper_296.handle = handle;
                ProcyonInvokeDynamicHelper_296.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_297
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_297.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_297.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_297.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_297.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_297.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_297.fence = 1;
                ProcyonInvokeDynamicHelper_297.handle = handle;
                ProcyonInvokeDynamicHelper_297.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_298
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_298.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_298.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_298.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_298.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_298.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_298.fence = 1;
                ProcyonInvokeDynamicHelper_298.handle = handle;
                ProcyonInvokeDynamicHelper_298.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_299
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_299.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_299.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_299.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_299.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_299.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_299.fence = 1;
                ProcyonInvokeDynamicHelper_299.handle = handle;
                ProcyonInvokeDynamicHelper_299.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_300
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_300.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_300.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_300.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_300.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_300.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_300.fence = 1;
                ProcyonInvokeDynamicHelper_300.handle = handle;
                ProcyonInvokeDynamicHelper_300.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_301
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_301.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_301.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_301.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_301.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_301.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_301.fence = 1;
                ProcyonInvokeDynamicHelper_301.handle = handle;
                ProcyonInvokeDynamicHelper_301.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_302
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_302.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_302.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_302.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_302.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_302.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_302.fence = 1;
                ProcyonInvokeDynamicHelper_302.handle = handle;
                ProcyonInvokeDynamicHelper_302.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_303
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_303.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_303.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_303.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_303.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_303.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_303.fence = 1;
                ProcyonInvokeDynamicHelper_303.handle = handle;
                ProcyonInvokeDynamicHelper_303.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_304
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_304.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_304.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_304.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_304.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_304.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_304.fence = 1;
                ProcyonInvokeDynamicHelper_304.handle = handle;
                ProcyonInvokeDynamicHelper_304.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_305
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_305.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_305.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_305.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_305.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_305.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_305.fence = 1;
                ProcyonInvokeDynamicHelper_305.handle = handle;
                ProcyonInvokeDynamicHelper_305.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_306
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_306.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_306.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_306.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_306.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_306.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_306.fence = 1;
                ProcyonInvokeDynamicHelper_306.handle = handle;
                ProcyonInvokeDynamicHelper_306.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_307
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_307.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_307.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_307.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_307.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_307.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(Vec3d.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_307.fence = 1;
                ProcyonInvokeDynamicHelper_307.handle = handle;
                ProcyonInvokeDynamicHelper_307.fence = 0;
            }
            return handle;
        }
        
        public static Vec3d invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_308
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_308.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_308.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_308.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_308.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_308.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(double.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_308.fence = 1;
                ProcyonInvokeDynamicHelper_308.handle = handle;
                ProcyonInvokeDynamicHelper_308.fence = 0;
            }
            return handle;
        }
        
        public static double invoke(Object p0, long p1, long p2) {
        return 0.0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_309
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_309.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_309.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_309.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_309.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_309.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(Vector3f.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_309.fence = 1;
                ProcyonInvokeDynamicHelper_309.handle = handle;
                ProcyonInvokeDynamicHelper_309.fence = 0;
            }
            return handle;
        }
        
        public static Vector3f invoke(Object p0, Object p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_310
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_310.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_310.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_310.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_310.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_310.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_310.fence = 1;
                ProcyonInvokeDynamicHelper_310.handle = handle;
                ProcyonInvokeDynamicHelper_310.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_311
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_311.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_311.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_311.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_311.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_311.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_311.fence = 1;
                ProcyonInvokeDynamicHelper_311.handle = handle;
                ProcyonInvokeDynamicHelper_311.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_312
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_312.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_312.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_312.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_312.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_312.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_312.fence = 1;
                ProcyonInvokeDynamicHelper_312.handle = handle;
                ProcyonInvokeDynamicHelper_312.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_313
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_313.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_313.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_313.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_313.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_313.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_313.fence = 1;
                ProcyonInvokeDynamicHelper_313.handle = handle;
                ProcyonInvokeDynamicHelper_313.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_314
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_314.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_314.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_314.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_314.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_314.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_314.fence = 1;
                ProcyonInvokeDynamicHelper_314.handle = handle;
                ProcyonInvokeDynamicHelper_314.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_315
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_315.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_315.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_315.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_315.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_315.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_315.fence = 1;
                ProcyonInvokeDynamicHelper_315.handle = handle;
                ProcyonInvokeDynamicHelper_315.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_316
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_316.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_316.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_316.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_316.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_316.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_316.fence = 1;
                ProcyonInvokeDynamicHelper_316.handle = handle;
                ProcyonInvokeDynamicHelper_316.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, float p1, float p2, float p3, long p4, long p5) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_317
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_317.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_317.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_317.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_317.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_317.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_317.fence = 1;
                ProcyonInvokeDynamicHelper_317.handle = handle;
                ProcyonInvokeDynamicHelper_317.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_318
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_318.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_318.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_318.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_318.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_318.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_318.fence = 1;
                ProcyonInvokeDynamicHelper_318.handle = handle;
                ProcyonInvokeDynamicHelper_318.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, Object p1, float p2, float p3, float p4, long p5, long p6) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_319
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_319.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_319.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_319.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_319.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_319.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_319.fence = 1;
                ProcyonInvokeDynamicHelper_319.handle = handle;
                ProcyonInvokeDynamicHelper_319.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, int p1, long p2, long p3) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_320
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_320.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_320.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_320.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_320.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_320.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_320.fence = 1;
                ProcyonInvokeDynamicHelper_320.handle = handle;
                ProcyonInvokeDynamicHelper_320.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_321
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_321.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_321.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_321.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_321.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_321.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_321.fence = 1;
                ProcyonInvokeDynamicHelper_321.handle = handle;
                ProcyonInvokeDynamicHelper_321.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_322
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_322.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_322.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_322.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_322.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_322.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_322.fence = 1;
                ProcyonInvokeDynamicHelper_322.handle = handle;
                ProcyonInvokeDynamicHelper_322.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_323
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_323.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_323.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_323.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_323.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_323.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(VertexConsumer.class, Object.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_323.fence = 1;
                ProcyonInvokeDynamicHelper_323.handle = handle;
                ProcyonInvokeDynamicHelper_323.fence = 0;
            }
            return handle;
        }
        
        public static VertexConsumer invoke(Object p0, float p1, float p2, float p3, long p4, long p5) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_324
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_324.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_324.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_324.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_324.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_324.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_324.fence = 1;
                ProcyonInvokeDynamicHelper_324.handle = handle;
                ProcyonInvokeDynamicHelper_324.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(long p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_325
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_325.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_325.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_325.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_325.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_325.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_325.fence = 1;
                ProcyonInvokeDynamicHelper_325.handle = handle;
                ProcyonInvokeDynamicHelper_325.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_326
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_326.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_326.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_326.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_326.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_326.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m120(lookup, "h", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_326.fence = 1;
                ProcyonInvokeDynamicHelper_326.handle = handle;
                ProcyonInvokeDynamicHelper_326.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(int p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_327
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_327.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_327.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_327.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_327.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_327.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_327.fence = 1;
                ProcyonInvokeDynamicHelper_327.handle = handle;
                ProcyonInvokeDynamicHelper_327.fence = 0;
            }
            return handle;
        }
        
        public static String invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_328
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_328.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_328.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_328.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_328.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_328.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_328.fence = 1;
                ProcyonInvokeDynamicHelper_328.handle = handle;
                ProcyonInvokeDynamicHelper_328.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_329
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_329.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_329.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_329.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_329.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_329.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_329.fence = 1;
                ProcyonInvokeDynamicHelper_329.handle = handle;
                ProcyonInvokeDynamicHelper_329.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(long p0, long p1) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_330
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_330.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_330.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_330.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_330.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_330.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_330.fence = 1;
                ProcyonInvokeDynamicHelper_330.handle = handle;
                ProcyonInvokeDynamicHelper_330.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(long p0, long p1) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_331
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_331.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_331.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_331.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_331.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_331.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_331.fence = 1;
                ProcyonInvokeDynamicHelper_331.handle = handle;
                ProcyonInvokeDynamicHelper_331.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(long p0, long p1) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_332
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_332.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_332.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_332.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_332.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_332.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_332.fence = 1;
                ProcyonInvokeDynamicHelper_332.handle = handle;
                ProcyonInvokeDynamicHelper_332.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(long p0, long p1) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_333
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_333.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_333.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_333.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_333.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_333.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_333.fence = 1;
                ProcyonInvokeDynamicHelper_333.handle = handle;
                ProcyonInvokeDynamicHelper_333.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_334
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_334.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_334.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_334.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_334.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_334.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_334.fence = 1;
                ProcyonInvokeDynamicHelper_334.handle = handle;
                ProcyonInvokeDynamicHelper_334.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_335
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_335.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_335.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_335.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_335.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_335.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_335.fence = 1;
                ProcyonInvokeDynamicHelper_335.handle = handle;
                ProcyonInvokeDynamicHelper_335.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_336
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_336.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_336.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_336.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_336.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_336.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_336.fence = 1;
                ProcyonInvokeDynamicHelper_336.handle = handle;
                ProcyonInvokeDynamicHelper_336.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(long p0, long p1) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_337
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_337.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_337.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_337.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_337.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_337.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_337.fence = 1;
                ProcyonInvokeDynamicHelper_337.handle = handle;
                ProcyonInvokeDynamicHelper_337.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_338
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_338.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_338.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_338.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_338.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_338.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_338.fence = 1;
                ProcyonInvokeDynamicHelper_338.handle = handle;
                ProcyonInvokeDynamicHelper_338.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(long p0, long p1) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_339
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_339.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_339.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_339.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_339.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_339.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_339.fence = 1;
                ProcyonInvokeDynamicHelper_339.handle = handle;
                ProcyonInvokeDynamicHelper_339.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_340
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_340.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_340.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_340.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_340.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_340.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_340.fence = 1;
                ProcyonInvokeDynamicHelper_340.handle = handle;
                ProcyonInvokeDynamicHelper_340.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_341
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_341.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_341.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_341.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_341.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_341.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_341.fence = 1;
                ProcyonInvokeDynamicHelper_341.handle = handle;
                ProcyonInvokeDynamicHelper_341.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_342
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_342.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_342.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_342.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_342.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_342.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(BuiltBuffer.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_342.fence = 1;
                ProcyonInvokeDynamicHelper_342.handle = handle;
                ProcyonInvokeDynamicHelper_342.fence = 0;
            }
            return handle;
        }
        
        public static BuiltBuffer invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_343
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_343.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_343.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_343.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_343.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_343.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_343.fence = 1;
                ProcyonInvokeDynamicHelper_343.handle = handle;
                ProcyonInvokeDynamicHelper_343.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_344
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_344.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_344.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_344.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_344.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_344.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_344.fence = 1;
                ProcyonInvokeDynamicHelper_344.handle = handle;
                ProcyonInvokeDynamicHelper_344.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_345
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_345.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_345.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_345.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_345.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_345.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_345.fence = 1;
                ProcyonInvokeDynamicHelper_345.handle = handle;
                ProcyonInvokeDynamicHelper_345.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_346
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_346.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_346.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_346.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_346.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_346.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_346.fence = 1;
                ProcyonInvokeDynamicHelper_346.handle = handle;
                ProcyonInvokeDynamicHelper_346.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_347
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_347.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_347.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_347.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_347.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_347.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(BuiltBuffer.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_347.fence = 1;
                ProcyonInvokeDynamicHelper_347.handle = handle;
                ProcyonInvokeDynamicHelper_347.fence = 0;
            }
            return handle;
        }
        
        public static BuiltBuffer invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_348
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_348.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_348.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_348.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_348.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_348.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_348.fence = 1;
                ProcyonInvokeDynamicHelper_348.handle = handle;
                ProcyonInvokeDynamicHelper_348.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_349
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_349.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_349.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_349.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_349.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_349.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_349.fence = 1;
                ProcyonInvokeDynamicHelper_349.handle = handle;
                ProcyonInvokeDynamicHelper_349.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_350
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_350.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_350.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_350.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_350.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_350.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_350.fence = 1;
                ProcyonInvokeDynamicHelper_350.handle = handle;
                ProcyonInvokeDynamicHelper_350.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_351
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_351.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_351.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_351.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_351.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_351.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_351.fence = 1;
                ProcyonInvokeDynamicHelper_351.handle = handle;
                ProcyonInvokeDynamicHelper_351.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_352
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_352.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_352.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_352.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_352.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_352.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(BuiltBuffer.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_352.fence = 1;
                ProcyonInvokeDynamicHelper_352.handle = handle;
                ProcyonInvokeDynamicHelper_352.fence = 0;
            }
            return handle;
        }
        
        public static BuiltBuffer invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_353
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_353.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_353.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_353.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_353.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_353.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_353.fence = 1;
                ProcyonInvokeDynamicHelper_353.handle = handle;
                ProcyonInvokeDynamicHelper_353.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_354
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_354.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_354.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_354.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_354.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_354.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_354.fence = 1;
                ProcyonInvokeDynamicHelper_354.handle = handle;
                ProcyonInvokeDynamicHelper_354.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_355
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_355.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_355.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_355.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_355.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_355.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_355.fence = 1;
                ProcyonInvokeDynamicHelper_355.handle = handle;
                ProcyonInvokeDynamicHelper_355.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_356
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_356.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_356.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_356.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_356.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_356.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(float.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_356.fence = 1;
                ProcyonInvokeDynamicHelper_356.handle = handle;
                ProcyonInvokeDynamicHelper_356.fence = 0;
            }
            return handle;
        }
        
        public static float invoke(Object p0, long p1, long p2) {
        return 0.0f;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_357
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_357.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_357.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_357.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_357.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_357.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_357.fence = 1;
                ProcyonInvokeDynamicHelper_357.handle = handle;
                ProcyonInvokeDynamicHelper_357.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(float p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_358
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_358.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_358.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_358.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_358.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_358.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_358.fence = 1;
                ProcyonInvokeDynamicHelper_358.handle = handle;
                ProcyonInvokeDynamicHelper_358.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_359
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_359.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_359.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_359.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_359.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_359.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_359.fence = 1;
                ProcyonInvokeDynamicHelper_359.handle = handle;
                ProcyonInvokeDynamicHelper_359.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_360
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_360.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_360.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_360.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_360.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_360.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(BuiltBuffer.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_360.fence = 1;
                ProcyonInvokeDynamicHelper_360.handle = handle;
                ProcyonInvokeDynamicHelper_360.fence = 0;
            }
            return handle;
        }
        
        public static BuiltBuffer invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_361
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_361.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_361.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_361.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_361.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_361.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_361.fence = 1;
                ProcyonInvokeDynamicHelper_361.handle = handle;
                ProcyonInvokeDynamicHelper_361.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_362
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_362.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_362.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_362.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_362.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_362.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_362.fence = 1;
                ProcyonInvokeDynamicHelper_362.handle = handle;
                ProcyonInvokeDynamicHelper_362.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_363
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_363.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_363.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_363.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_363.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_363.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_363.fence = 1;
                ProcyonInvokeDynamicHelper_363.handle = handle;
                ProcyonInvokeDynamicHelper_363.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_364
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_364.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_364.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_364.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_364.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_364.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferBuilder.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_364.fence = 1;
                ProcyonInvokeDynamicHelper_364.handle = handle;
                ProcyonInvokeDynamicHelper_364.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilder invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_365
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_365.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_365.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_365.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_365.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_365.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(BuiltBuffer.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_365.fence = 1;
                ProcyonInvokeDynamicHelper_365.handle = handle;
                ProcyonInvokeDynamicHelper_365.fence = 0;
            }
            return handle;
        }
        
        public static BuiltBuffer invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_366
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_366.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_366.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_366.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_366.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_366.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_366.fence = 1;
                ProcyonInvokeDynamicHelper_366.handle = handle;
                ProcyonInvokeDynamicHelper_366.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_367
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_367.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_367.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_367.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_367.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_367.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_367.fence = 1;
                ProcyonInvokeDynamicHelper_367.handle = handle;
                ProcyonInvokeDynamicHelper_367.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_368
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_368.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_368.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_368.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_368.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_368.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m132(lookup, "s", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_368.fence = 1;
                ProcyonInvokeDynamicHelper_368.handle = handle;
                ProcyonInvokeDynamicHelper_368.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_369
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_369.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_369.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_369.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_369.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_369.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_369.fence = 1;
                ProcyonInvokeDynamicHelper_369.handle = handle;
                ProcyonInvokeDynamicHelper_369.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(int p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_370
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_370.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_370.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_370.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_370.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_370.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_370.fence = 1;
                ProcyonInvokeDynamicHelper_370.handle = handle;
                ProcyonInvokeDynamicHelper_370.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(float p0, float p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_371
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_371.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_371.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_371.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_371.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_371.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00c1", MethodType.methodType(MinecraftClient.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_371.fence = 1;
                ProcyonInvokeDynamicHelper_371.handle = handle;
                ProcyonInvokeDynamicHelper_371.fence = 0;
            }
            return handle;
        }
        
        public static MinecraftClient invoke(long p0, long p1) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_372
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_372.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_372.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_372.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_372.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_372.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(BufferBuilderStorage.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_372.fence = 1;
                ProcyonInvokeDynamicHelper_372.handle = handle;
                ProcyonInvokeDynamicHelper_372.fence = 0;
            }
            return handle;
        }
        
        public static BufferBuilderStorage invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_373
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_373.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_373.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
        return null;
    }
        
        public static VertexConsumerProvider.Immediate invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_374
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_374.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_374.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_374.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_374.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_374.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_374.fence = 1;
                ProcyonInvokeDynamicHelper_374.handle = handle;
                ProcyonInvokeDynamicHelper_374.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_375
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_375.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_375.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_375.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_375.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_375.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_375.fence = 1;
                ProcyonInvokeDynamicHelper_375.handle = handle;
                ProcyonInvokeDynamicHelper_375.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(float p0, float p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_376
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_376.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_376.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_376.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_376.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_376.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m132(lookup, "s", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_376.fence = 1;
                ProcyonInvokeDynamicHelper_376.handle = handle;
                ProcyonInvokeDynamicHelper_376.fence = 0;
            }
            return handle;
        }
        
        public static int invoke(int p0, long p1) {
        return 0;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_377
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_377.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_377.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_377.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_377.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_377.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, int.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_377.fence = 1;
                ProcyonInvokeDynamicHelper_377.handle = handle;
                ProcyonInvokeDynamicHelper_377.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(int p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_378
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_378.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_378.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_378.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_378.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_378.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_378.fence = 1;
                ProcyonInvokeDynamicHelper_378.handle = handle;
                ProcyonInvokeDynamicHelper_378.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_379
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_379.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_379.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_379.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_379.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_379.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_379.fence = 1;
                ProcyonInvokeDynamicHelper_379.handle = handle;
                ProcyonInvokeDynamicHelper_379.fence = 0;
            }
            return handle;
        }
        
        public static boolean invoke(Object p0, long p1, long p2) {
        return false;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_380
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_380.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_380.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_380.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_380.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_380.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_380.fence = 1;
                ProcyonInvokeDynamicHelper_380.handle = handle;
                ProcyonInvokeDynamicHelper_380.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(long p0, long p1) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_381
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_381.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_381.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_381.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_381.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_381.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(IllegalStateException.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_381.fence = 1;
                ProcyonInvokeDynamicHelper_381.handle = handle;
                ProcyonInvokeDynamicHelper_381.fence = 0;
            }
            return handle;
        }
        
        public static IllegalStateException invoke(Object p0, long p1, long p2) {
        return new IllegalStateException((Throwable)null);
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_382
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_382.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_382.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_382.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_382.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_382.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_382.fence = 1;
                ProcyonInvokeDynamicHelper_382.handle = handle;
                ProcyonInvokeDynamicHelper_382.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(long p0, long p1) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_383
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_383.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_383.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_383.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_383.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_383.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_383.fence = 1;
                ProcyonInvokeDynamicHelper_383.handle = handle;
                ProcyonInvokeDynamicHelper_383.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(long p0, long p1) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_384
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_384.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_384.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_384.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_384.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_384.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_384.fence = 1;
                ProcyonInvokeDynamicHelper_384.handle = handle;
                ProcyonInvokeDynamicHelper_384.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(float p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_385
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_385.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_385.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_385.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_385.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_385.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "y", MethodType.methodType(void.class, float.class, float.class, float.class, float.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_385.fence = 1;
                ProcyonInvokeDynamicHelper_385.handle = handle;
                ProcyonInvokeDynamicHelper_385.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(float p0, float p1, float p2, float p3, long p4, long p5) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_386
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_386.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_386.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_386.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_386.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_386.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, MatrixStack.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_386.fence = 1;
                ProcyonInvokeDynamicHelper_386.handle = handle;
                ProcyonInvokeDynamicHelper_386.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, MatrixStack p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_387
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_387.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_387.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_387.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_387.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_387.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, boolean.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_387.fence = 1;
                ProcyonInvokeDynamicHelper_387.handle = handle;
                ProcyonInvokeDynamicHelper_387.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, boolean p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_388
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_388.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_388.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_388.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_388.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_388.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, Frustum.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_388.fence = 1;
                ProcyonInvokeDynamicHelper_388.handle = handle;
                ProcyonInvokeDynamicHelper_388.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, Frustum p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_389
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_389.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_389.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_389.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_389.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_389.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferAllocator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_389.fence = 1;
                ProcyonInvokeDynamicHelper_389.handle = handle;
                ProcyonInvokeDynamicHelper_389.fence = 0;
            }
            return handle;
        }
        
        public static BufferAllocator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_390
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_390.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_390.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_390.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_390.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_390.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_390.fence = 1;
                ProcyonInvokeDynamicHelper_390.handle = handle;
                ProcyonInvokeDynamicHelper_390.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_391
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_391.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_391.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_391.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_391.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_391.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferAllocator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_391.fence = 1;
                ProcyonInvokeDynamicHelper_391.handle = handle;
                ProcyonInvokeDynamicHelper_391.fence = 0;
            }
            return handle;
        }
        
        public static BufferAllocator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_392
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_392.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_392.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_392.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_392.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_392.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_392.fence = 1;
                ProcyonInvokeDynamicHelper_392.handle = handle;
                ProcyonInvokeDynamicHelper_392.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_393
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_393.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_393.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_393.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_393.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_393.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferAllocator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_393.fence = 1;
                ProcyonInvokeDynamicHelper_393.handle = handle;
                ProcyonInvokeDynamicHelper_393.fence = 0;
            }
            return handle;
        }
        
        public static BufferAllocator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_394
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_394.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_394.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_394.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_394.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_394.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_394.fence = 1;
                ProcyonInvokeDynamicHelper_394.handle = handle;
                ProcyonInvokeDynamicHelper_394.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_395
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_395.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_395.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_395.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_395.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_395.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferAllocator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_395.fence = 1;
                ProcyonInvokeDynamicHelper_395.handle = handle;
                ProcyonInvokeDynamicHelper_395.fence = 0;
            }
            return handle;
        }
        
        public static BufferAllocator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_396
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_396.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_396.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_396.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_396.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_396.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_396.fence = 1;
                ProcyonInvokeDynamicHelper_396.handle = handle;
                ProcyonInvokeDynamicHelper_396.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_397
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_397.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_397.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_397.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_397.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_397.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "M", MethodType.methodType(BufferAllocator.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_397.fence = 1;
                ProcyonInvokeDynamicHelper_397.handle = handle;
                ProcyonInvokeDynamicHelper_397.fence = 0;
            }
            return handle;
        }
        
        public static BufferAllocator invoke(Object p0, long p1, long p2) {
        return null;
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_398
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_398.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_398.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_398.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_398.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_398.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00d3", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_398.fence = 1;
                ProcyonInvokeDynamicHelper_398.handle = handle;
                ProcyonInvokeDynamicHelper_398.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, long p1, long p2) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_399
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_399.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_399.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_399.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_399.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_399.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_399.fence = 1;
                ProcyonInvokeDynamicHelper_399.handle = handle;
                ProcyonInvokeDynamicHelper_399.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_400
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_400.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_400.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_400.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_400.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_400.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_400.fence = 1;
                ProcyonInvokeDynamicHelper_400.handle = handle;
                ProcyonInvokeDynamicHelper_400.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_401
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_401.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_401.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_401.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_401.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_401.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_401.fence = 1;
                ProcyonInvokeDynamicHelper_401.handle = handle;
                ProcyonInvokeDynamicHelper_401.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_402
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_402.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_402.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_402.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_402.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_402.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_402.fence = 1;
                ProcyonInvokeDynamicHelper_402.handle = handle;
                ProcyonInvokeDynamicHelper_402.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    public static class ProcyonInvokeDynamicHelper_403
    {
        public static MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        public static MethodHandle handle;
        public static volatile int fence;
        
        public static MethodHandle handle() {
            MethodHandle handle = ProcyonInvokeDynamicHelper_403.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_403.ensureHandle();
        }
        
        public static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_403.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_403.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_403.LOOKUP;
                try {
                    handle = ((CallSite)Class352.m265(lookup, "\u00cb", MethodType.methodType(void.class, Object.class, BufferBuilder.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_403.fence = 1;
                ProcyonInvokeDynamicHelper_403.handle = handle;
                ProcyonInvokeDynamicHelper_403.fence = 0;
            }
            return handle;
        }
        
        public static void invoke(Object p0, BufferBuilder p1, long p2, long p3) {
        
    }
    }
}
