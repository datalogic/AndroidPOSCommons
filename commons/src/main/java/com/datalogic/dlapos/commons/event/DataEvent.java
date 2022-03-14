package com.datalogic.dlapos.commons.event;

/**
 * Notifies the application that input data is available from the device.
 */
public class DataEvent extends BaseEvent {
    private final int _status;

    /**
     * Constructor.
     *
     * @param source The source of the event.
     * @param status The input status with its value dependent upon the device category. It may describe the type or qualities of the input data.
     */
    public DataEvent(Object source, int status) {
        super(source);
        this._status = status;
    }

    /**
     * Getter for the status.
     *
     * @return the status.
     */
    public int getStatus() {
        return _status;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getSequenceNumber() {
        return super.getSequenceNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getTimestamp() {
        return super.getTimestamp();
    }
}
