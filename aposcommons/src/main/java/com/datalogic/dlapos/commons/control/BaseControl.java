package com.datalogic.dlapos.commons.control;

import android.content.Context;

import com.datalogic.dlapos.commons.support.APosException;
import com.datalogic.dlapos.commons.upos.DLExtension;
import com.datalogic.dlapos.commons.upos.UPOSBaseInterface;

/**
 * Base interface for UPOS Controls.
 *
 * @author fpoli
 */
public interface BaseControl extends UPOSBaseInterface, DLExtension {

    /**
     * Holds an identifier for the UnifiedPOS Control and the company that produced it.
     *
     * @return an identifier for the UnifiedPOS Control and the company that produced it.
     */
    String getDeviceControlDescription();

    /**
     * Holds the UnifiedPOS Control version number.
     * A sample version number is:
     * 1002038
     * This value may be displayed as version "1.2.38", and interpreted as major version 1, minor version 2, build 38 of the UnifiedPOS Control.
     *
     * @return the UnifiedPOS Control version number.
     */
    int getDeviceControlVersion();

    /**
     * Opens a device for subsequent I/O.
     *
     * @param logicalDeviceName the device name to open.
     * @param context           the application context.
     * @throws APosException when:
     *                       <ul>
     *                           <li>the UnifiedPOS Control is already open (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>the specified logicalDeviceName was not found (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_NOEXISTS}),</li>
     *                           <li>Could not establish a connection to the corresponding UnifiedPOS Service (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_NOSERVICE}).</li>
     *                       </ul>
     */
    void open(String logicalDeviceName, Context context) throws APosException;



}
