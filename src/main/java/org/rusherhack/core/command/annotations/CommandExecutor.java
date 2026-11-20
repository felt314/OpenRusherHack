package org.rusherhack.core.command.annotations;
import org.rusherhack.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Repeatable;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Repeatable(CommandExecutors.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandExecutor {
   String[] subCommand() default {""};
}
