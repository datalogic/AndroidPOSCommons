package com.datalogic.dlapos.commons.event;

/**
 * Notifies the application when a device has detected an operation status change.
 *
 * @author fpoli
 */
public class StatusUpdateEvent extends BaseEvent {

    private final int _status;

    /**
     * Constructor.
     *
     * @param source The source of the event.
     * @param status Device category-specific status, describing the type of status change.
     */
    public StatusUpdateEvent(Object source, int status) {
        super(source);
        _status = status;
    }

    /**
     * Getter for the status.
     *
     * @return the current status.
     */
    public int getStatus() {
        return _status;
    }
}
