package com.datalogic.dlapos.commons.upos;

import android.content.Context;

import com.datalogic.dlapos.commons.support.APosException;

/**
 * UPOS Scanner base interface, used both for Controls and Services.
 *
 * @author fpoli
 */
public interface UPOSScannerInterface {
    //region Properties

    /**
     * If true, then ScanData will be decoded into the properties {@link  UPOSScannerInterface#getScanDataLabel() ScanDataLabel} and {@link  UPOSScannerInterface#getScanDataType() ScanDataType}.
     *
     * @return true if ScanData are stored.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    boolean getDecodeData() throws APosException;

    /**
     * If true, then ScanData will be decoded into the properties {@link  UPOSScannerInterface#getScanDataLabel() ScanDataLabel} and {@link  UPOSScannerInterface#getScanDataType() ScanDataType}.
     *
     * @param decodeData value to set.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    void setDecodeData(boolean decodeData) throws APosException;

    /**
     * Holds the data read from the scanner.
     *
     * @return the data read from the scanner
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    byte[] getScanData() throws APosException;

    /**
     * Holds the decoded bar code label.
     *
     * @return the decoded bar code label.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    byte[] getScanDataLabel() throws APosException;

    /**
     * Holds the decoded bar code label type. It should be one of the values defined in {@link com.datalogic.dlapos.commons.constant.ScannerConstants ScannerConstants}
     *
     * @return the decoded bar code label type.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    int getScanDataType() throws APosException;
    //endregion

    //region Methods

    /**
     * Sets all data properties that were populated as a result of firing a DataEvent or ErrorEvent back to their default values. This does not reset the {@link  UPOSBaseInterface#getDataCount() DataCount} or {@link  UPOSScannerInterface#getState() State} properties.
     *
     * @throws APosException on error
     */
    void clearInputProperties() throws APosException;
    //endregion
}
