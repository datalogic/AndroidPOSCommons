package com.datalogic.dlapos.commons.event;

/**
 * Notifies the application that an error has been detected and a suitable response is necessary to process the error condition.
 *
 * @author fpoli
 */
public class ErrorEvent extends BaseEvent {
    private final int _errorCode;
    private final int _errorCodeExtended;
    private final int _errorLocus;
    private int _errorResponse;

    /**
     * Constructor.
     *
     * @param source            The source of the event.
     * @param errorCode         Error Code causing the error event.
     * @param errorCodeExtended Extended Error Code causing the error event. These values are device category specific.
     * @param errorLocus        Location of the error between the following:
     *                          <ul>
     *                          <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_EL_OUTPUT}</li>
     *                          <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_EL_INPUT}</li>
     *                          <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_EL_INPUT_DATA}</li>
     *                          </ul>
     * @param errorResponse     Error response, whose default value may be overridden by the application (i.e., this attribute is settable). Valid values are:
     *                          <ul>
     *                          <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ER_RETRY}</li>
     *                          <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ER_CLEAR}</li>
     *                          <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ER_CONTINUEINPUT}</li>
     *                          </ul>
     */
    public ErrorEvent(Object source, int errorCode, int errorCodeExtended, int errorLocus, int errorResponse) {
        super(source);
        _errorCode = errorCode;
        _errorCodeExtended = errorCodeExtended;
        _errorLocus = errorLocus;
        _errorResponse = errorResponse;
    }

    //region Getters

    /**
     * Getter for the errorCode.
     *
     * @return the errorCode.
     */
    public int getErrorCode() {
        return _errorCode;
    }

    /**
     * Getter for the errorCodeExtended.
     *
     * @return the errorCodeExtended.
     */
    public int getErrorCodeExtended() {
        return _errorCodeExtended;
    }

    /**
     * Getter for error locus. The value is one of the following:
     * <ul>
     * <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_EL_OUTPUT}</li>
     * <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_EL_INPUT}</li>
     * <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_EL_INPUT_DATA}</li>
     * </ul>
     *
     * @return the error locus.
     */
    public int getErrorLocus() {
        return _errorLocus;
    }

    /**
     * Getter for error response. The value is one of the following:
     * <ul>
     * <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ER_RETRY}</li>
     * <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ER_CLEAR}</li>
     * <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ER_CONTINUEINPUT}</li>
     * </ul>
     *
     * @return the error response.
     */
    public int getErrorResponse() {
        return _errorResponse;
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

    //endregion

    //region Setters

    /**
     * Setter for error response. Must be one of the following:
     * <ul>
     * <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ER_RETRY}</li>
     * <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ER_CLEAR}</li>
     * <li>{@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ER_CONTINUEINPUT}</li>
     * </ul>
     *
     * @param errorResponse the desired error response.
     */
    public void setErrorResponse(int errorResponse) {
        this._errorResponse = errorResponse;
    }

    //endregion
}
