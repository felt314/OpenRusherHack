package org.rusherhack.core.event.subscribe;
import org.rusherhack.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.rusherhack.core.event.stage.Stage;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Subscribe {
   int priority() default 0;

   Stage stage() default Stage.DEFAULT;

   boolean ignoreCancelled() default false;
}
