package org.rusherhack.core.command.annotations;
import java.lang.annotation.*;
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandExecutorArguments {
   CommandExecutor$Argument[] value();
}
