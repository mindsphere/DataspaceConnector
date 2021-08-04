/*
 * Copyright (c) Microsoft Corporation.
 * All rights reserved.
 */

package org.eclipse.dataspaceconnector.demo.ui;

import org.eclipse.dataspaceconnector.spi.message.RemoteMessageDispatcherRegistry;
import org.eclipse.dataspaceconnector.spi.monitor.Monitor;
import org.eclipse.dataspaceconnector.spi.protocol.web.WebService;
import org.eclipse.dataspaceconnector.spi.system.ServiceExtension;
import org.eclipse.dataspaceconnector.spi.system.ServiceExtensionContext;
import org.eclipse.dataspaceconnector.spi.transfer.TransferProcessManager;

/**
 *
 */
public class DemoUiApiExtension implements ServiceExtension {
    private Monitor monitor;

    @Override
    public void initialize(ServiceExtensionContext context) {
        monitor = context.getMonitor();

        var webService = context.getService(WebService.class);
        var dispatcherRegistry = context.getService(RemoteMessageDispatcherRegistry.class);
        var processManager = context.getService(TransferProcessManager.class);

        webService.registerController(new DemoUiApiController(dispatcherRegistry, processManager, monitor));

        monitor.info("Initialized Demo UI API extension");
    }

    @Override
    public void start() {
        monitor.info("Started Demo UI API extension");
    }

    @Override
    public void shutdown() {
        monitor.info("Shutdown Demo UI Catalog API extension");
    }


}