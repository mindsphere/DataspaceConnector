package org.eclipse.dataspaceconnector.transfer.demo.protocols.object;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.dataspaceconnector.spi.monitor.Monitor;
import org.eclipse.dataspaceconnector.spi.transfer.flow.DataFlowController;
import org.eclipse.dataspaceconnector.spi.transfer.flow.DataFlowInitiateResponse;
import org.eclipse.dataspaceconnector.spi.types.domain.transfer.DataRequest;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class ObjectStorageFlowController implements DataFlowController {
    private ObjectMapper objectMapper;
    private Monitor monitor;

    public ObjectStorageFlowController(ObjectMapper objectMapper, Monitor monitor) {
        this.objectMapper = objectMapper;
        this.monitor = monitor;
    }

    @Override
    public boolean canHandle(DataRequest dataRequest) {
        return false;
    }

    @Override
    public @NotNull DataFlowInitiateResponse initiateFlow(DataRequest dataRequest) {
        return null;
    }


}