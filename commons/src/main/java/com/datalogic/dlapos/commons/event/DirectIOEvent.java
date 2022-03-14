package com.datalogic.dlapos.commons.event;

/**
 * This event is to be used only for those types of vendor specific functions that are not otherwise described as part of the UnifiedPOS standard.
 *
 * @author fpoli
 */
public class DirectIOEvent extends BaseEvent {
    private final int _eventNumber;
    private int _data;
    private Object _obj;

    /**
     * Constructor.
     *
     * @param source      The source of the event.
     * @param eventNumber Event number whose specific values are assigned by the UnifiedPOS Service.
     * @param data        Additional numeric data. Specific values vary by the EventNumber and the UnifiedPOS Service.
     * @param obj         Additional data whose usage varies by the EventNumber and the UnifiedPOS Service.
     */
    public DirectIOEvent(Object source, int eventNumber, int data, Object obj) {
        super(source);
        _eventNumber = eventNumber;
        _data = data;
        _obj = obj;
    }

    //region Getters

    /**
     * Getter for event number whose specific values are assigned by the UnifiedPOS Service.
     *
     * @return the event number.
     */
    public int getEventNumber() {
        return _eventNumber;
    }

    /**
     * Getter for additional numeric data. Specific values vary by the EventNumber and the UnifiedPOS Service.
     *
     * @return data.
     */
    public int getData() {
        return _data;
    }

    /**
     * Getter for additional data whose usage varies by the EventNumber and the UnifiedPOS Service.
     *
     * @return additional data.
     */
    public Object getObj() {
        return _obj;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getTimestamp() {
        return super.getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getSequenceNumber() {
        return super.getSequenceNumber();
    }

    //endregion

    //region Setters

    /**
     * Setter for additional numeric data. Specific values vary by the EventNumber and the UnifiedPOS Service.
     *
     * @param data desired additional numeric data.
     */
    public void setData(int data) {
        this._data = data;
    }

    /**
     * Setter for additional data whose usage varies by the EventNumber and the UnifiedPOS Service.
     *
     * @param obj desired additional data.
     */
    public void setObj(Object obj) {
        this._obj = obj;
    }

    //endregion
}
