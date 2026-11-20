package org.rusherhack.core.command.dispatch;
import org.rusherhack.*;

import org.rusherhack.core.command.ICommandSource;

public interface ICommandDispatcher<T> {
   default T execute(ICommandSource var1, String var2) { return null; }

   default T dispatch(ICommandSource var1, String var2) { return null; }
}
