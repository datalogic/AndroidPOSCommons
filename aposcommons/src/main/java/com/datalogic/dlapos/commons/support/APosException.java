package com.datalogic.dlapos.commons.support;

import com.datalogic.dlapos.commons.constant.ErrorConstants;

/**
 * APOS Exception.
 *
 * @author fpoli
 */
public class APosException extends Exception {
    private final int _errorCode;
    private final int _errorCodeExtension;

    //region Constructors

    /**
     * Void constructor. The errorCode is {@link ErrorConstants#APOS_ERROR} and the errorCodeExtension {@link ErrorConstants#APOS_EXT_ERROR}.
     */
    public APosException() {
        this(ErrorConstants.APOS_ERROR, ErrorConstants.APOS_EXT_ERROR);
    }

    /**
     * Constructor with errorCode. The errorCodeExtension is {@link ErrorConstants#APOS_EXT_ERROR}.
     *
     * @param errorCode The desired errorCode.
     */
    public APosException(int errorCode) {
        this(errorCode, ErrorConstants.APOS_EXT_ERROR);
    }

    /**
     * Constructor with errorCode and cause Exception. The errorCodeExtension is {@link ErrorConstants#APOS_EXT_ERROR}.
     *
     * @param errorCode The desired ErrorCode.
     * @param causedBy  the causing Exception.
     */
    public APosException(int errorCode, Throwable causedBy) {
        super(causedBy);
        this._errorCode = errorCode;
        this._errorCodeExtension = ErrorConstants.APOS_EXT_ERROR;
    }

    /**
     * Void constructor with message. The errorCode is {@link ErrorConstants#APOS_ERROR} and the errorCodeExtension {@link ErrorConstants#APOS_EXT_ERROR}.
     *
     * @param message The desired message.
     */
    public APosException(String message) {
        super(message);
        this._errorCode = ErrorConstants.APOS_ERROR;
        this._errorCodeExtension = ErrorConstants.APOS_EXT_ERROR;
    }

    /**
     * Void constructor with message and cause Exception. The errorCode is {@link ErrorConstants#APOS_ERROR} and the errorCodeExtension {@link ErrorConstants#APOS_EXT_ERROR}.
     *
     * @param message  the desired message.
     * @param causedBy the causing Exception.
     */
    public APosException(String message, Throwable causedBy) {
        super(message, causedBy);
        this._errorCode = ErrorConstants.APOS_ERROR;
        this._errorCodeExtension = ErrorConstants.APOS_EXT_ERROR;
    }

    /**
     * Constructor with errorCode and message. The errorCodeExtension is {@link ErrorConstants#APOS_EXT_ERROR}.
     *
     * @param message   the desired message.
     * @param errorCode the desired errorCode.
     */
    public APosException(String message, int errorCode) {
        this(message, errorCode, ErrorConstants.APOS_EXT_ERROR);
    }

    /**
     * Constructor with errorCode, message and causing Exception. The errorCodeExtension is {@link ErrorConstants#APOS_EXT_ERROR}.
     *
     * @param message   the desired message.
     * @param errorCode the desired errorCode.
     * @param causedBy  the causing Exception.
     */
    public APosException(String message, int errorCode, Throwable causedBy) {
        this(message, errorCode, ErrorConstants.APOS_EXT_ERROR, causedBy);
    }

    /**
     * Constructor with message.
     *
     * @param message            the desired message.
     * @param errorCode          the desired errorCode.
     * @param errorCodeExtension the desired errorCodeExtension.
     */
    public APosException(String message, int errorCode, int errorCodeExtension) {
        super(message);
        this._errorCode = errorCode;
        this._errorCodeExtension = errorCodeExtension;
    }

    /**
     * Constructor with message and causing Exception.
     *
     * @param message            the desired message.
     * @param errorCode          the desired errorCode.
     * @param errorCodeExtension the desired errorCodeExtension.
     * @param causedBy           the causing Exception.
     */
    public APosException(String message, int errorCode, int errorCodeExtension, Throwable causedBy) {
        super(message, causedBy);
        this._errorCode = errorCode;
        this._errorCodeExtension = errorCodeExtension;
    }

    /**
     * Constructor.
     *
     * @param errorCode          the desired errorCode.
     * @param errorCodeExtension the desired errorCodeExtension.
     */
    public APosException(int errorCode, int errorCodeExtension) {
        this._errorCode = errorCode;
        this._errorCodeExtension = errorCodeExtension;
    }

    /**
     * Constructor with causing Exception.
     *
     * @param errorCode          the desired errorCode.
     * @param errorCodeExtension the desired errorCodeExtension.
     * @param causedBy           the causing Exception.
     */
    public APosException(int errorCode, int errorCodeExtension, Throwable causedBy) {
        super(causedBy);
        this._errorCode = errorCode;
        this._errorCodeExtension = errorCodeExtension;
    }
    //endregion

    //region Getters

    /**
     * ErrorCode getter.
     *
     * @return the errorCode of the APOSException.
     */
    public int getErrorCode() {
        return _errorCode;
    }

    /**
     * ErrorCodeExtension getter.
     *
     * @return the errorCodeExtension of the APOSException.
     */
    public int getErrorCodeExtension() {
        return _errorCodeExtension;
    }
    //endregion
}
