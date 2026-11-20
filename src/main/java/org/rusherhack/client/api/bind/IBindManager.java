package org.rusherhack.client.api.bind;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.lang.invoke.MethodHandles;
import org.rusherhack.Class066;
import org.rusherhack.core.bind.IBindable;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;

import org.rusherhack.command.bind;
public interface IBindManager {
   long f294 = Class066.m4320(5278546605297544316L, -8715460506587691990L, MethodHandles.lookup().lookupClass()).m4325(85666379219550L);
   Object[] f295 = new Object[8];
   String[] f296 = new String[8];

   default void register(IBindable var1) {
      this.register(var1, NullKey.INSTANCE);
   }

   void setBind(String var1, IKey var2);

   IKey createKeyboardKey(int var1);

   void register(IBindable var1, IKey var2);

   Object2ObjectMap<IBindable, IKey> getBindRegistry();

   void unregister(IBindable var1);

   IKey createMouseKey(int var1);

   IKey getBind(IBindable var1);

   void setBind(IBindable var1, IKey var2);

   IKey parseKey(String var1);

   public static void m122() {
      f295[0] = "]\u0001a\"MFA\u001bc~WRQ\u0018(oPAW]deQW\u001c\u0018cu\u0011}G\u001fjGZJ";
      f295[1] = "28mK\u001c\n.\"o\u0017\u0006\u001e>!$\u0006\u0002\u00168$~K\u000f\u000f4dh\f\u0000\u001bs\u0003H\f\u0000\u001b\u0010+d\u0004\t\u001a/";
      f295[2] = "@I\u000f$s\n\\S\rxi\u001eLPFin\rJ\u0015\nco\u001b\u0001r*co\u001bNY\u0004o";
      f295[3] = "j6\u001e2\u00040v,\u001cn\u001e$f/W\u007f\u00197`j\u001bu\u0018!+/\u001ceX\fN!\u0000";
      f295[4] = void.class;
      f296[4] = "java/lang/Void";
      f295[5] = "F\u0011 \t<\"M\u001e1F],F\u00155\u001c";
      f295[6] = "Z\u007fn<X\\\u001b/xGbx0\u0019\\\u0001hskt/<XE\t5\u007f*";
      f295[7] = "W\u0007E5lv^\u0007Ch\u000e4\u0003\u0001Bqr#\u0014n\u001900uP\u001f\u001c5p\"nTEu6-\u000e_\u0012djNU^^044\u001e\u0014@j\u000e";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m122();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
