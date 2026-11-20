package org.rusherhack.core.logging;
import org.rusherhack.*;

public interface ILogger extends ILog {
   String getName();

   ILogger getParent();
}
