package org.rusherhack.core.command;
import org.rusherhack.*;

import org.rusherhack.core.command.dispatch.ICommandDispatcher;
import org.rusherhack.core.feature.IFeatureManager;

public interface ICommandManager extends IFeatureManager<AbstractCommand> {
   ICommandDispatcher<?> getDispatcher();

   String getPrefix();
}
