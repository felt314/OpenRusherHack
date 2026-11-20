package org.rusherhack.client.api;
import org.rusherhack.*;

import java.nio.file.Path;
import org.rusherhack.client.api.bind.IBindManager;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.system.Colors;
import org.rusherhack.client.api.system.Entities;
import org.rusherhack.client.api.system.Fonts;
import org.rusherhack.client.api.system.IChunkProcessor;
import org.rusherhack.client.api.system.IHudManager;
import org.rusherhack.client.api.system.IInteractions;
import org.rusherhack.client.api.system.INotificationManager;
import org.rusherhack.client.api.system.IRelationManager;
import org.rusherhack.client.api.system.IRotationManager;
import org.rusherhack.client.api.system.IServerState;
import org.rusherhack.client.api.system.IWindowManager;
import org.rusherhack.client.api.ui.theme.IThemeManager;
import org.rusherhack.core.command.ICommandManager;
import org.rusherhack.core.event.IEventBus;
import org.rusherhack.core.feature.IFeatureManager;
import org.rusherhack.core.logging.ILogger;

import org.rusherhack.command.bind;
public interface IRusherHack {
   IEventBus getEventBus();

   Path getConfigPath();

   IInteractions interactions();

   IServerState getServerState();

   IFeatureManager<IModule> getModuleManager();

   IThemeManager getThemeManager();

   INotificationManager getNotificationManager();

   IRotationManager getRotationManager();

   IRelationManager getRelationManager();

   ICommandManager getCommandManager();

   ILogger createLogger(String var1);

   IRenderer3D getRenderer3D();

   IWindowManager getWindowManager();

   IChunkProcessor getChunkProcessor();

   IHudManager getHudManager();

   Entities entities();

   Fonts fonts();

   IBindManager getBindManager();

   Colors colors();

   String getVersion();

   IRenderer2D getRenderer2D();
}
