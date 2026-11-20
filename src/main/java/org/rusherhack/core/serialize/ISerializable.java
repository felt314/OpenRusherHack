package org.rusherhack.core.serialize;
import org.rusherhack.*;

public interface ISerializable<T> {
   default boolean shouldSerialize(boolean var1) {
      boolean var10002 = true;
      return true;
   }

   default T serialize() { return null; }

   @Deprecated(
      forRemoval = true
   )
   default boolean shouldAutoSave() {
      boolean var10002 = true;
      return true;
   }

   default boolean deserialize(T var1) { return false; }
}
