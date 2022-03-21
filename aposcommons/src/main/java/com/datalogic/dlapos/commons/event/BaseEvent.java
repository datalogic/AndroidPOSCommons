package com.datalogic.dlapos.commons.event;

import java.util.EventObject;

/**
 * Base event for APOS.
 *
 * @author fpoli
 */
public abstract class BaseEvent extends EventObject {
    private static long _globalSequenceNumber = 0;

    private final long _timestamp;
    private final long _instanceSequenceNumber;

    public BaseEvent(Object source) {
        super(source);
        _timestamp = System.currentTimeMillis();
        _instanceSequenceNumber = takeSequenceNumber();
    }

    /**
     * Getter for the timestamp, in ms, of the event.
     *
     * @return the timestamp of the event.
     */
    public long getTimestamp() {
        return _timestamp;
    }

    /**
     * Getter for the sequence number of the event.
     *
     * @return the sequence number of the event.
     */
    public long getSequenceNumber() {
        return _instanceSequenceNumber;
    }

    private static synchronized long takeSequenceNumber() {
        return ++_globalSequenceNumber;
    }

}
