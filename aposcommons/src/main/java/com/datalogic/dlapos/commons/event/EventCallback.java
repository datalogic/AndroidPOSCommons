package com.datalogic.dlapos.commons.event;

import com.datalogic.dlapos.commons.control.BaseControl;

public interface EventCallback {

    enum EventType {
        Data,
        DirectIO,
        Error,
        StatusUpdate
    }

    void fireEvent(BaseEvent event, EventType type);

    BaseControl getEventSource();
}
