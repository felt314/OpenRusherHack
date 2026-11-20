package org.rusherhack.core.feature;
import org.rusherhack.*;

import java.util.Optional;

public interface IFeatureManager<T extends IFeature> {
   default Optional<T> getFeature(String var1) { return Optional.empty(); }

   default Iterable<T> getFeatures() { return java.util.Collections.emptyList(); }

   default void registerFeature(T var1) {}
}
