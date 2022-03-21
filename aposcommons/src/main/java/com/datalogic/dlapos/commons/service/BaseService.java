package com.datalogic.dlapos.commons.service;

import android.content.Context;

import com.datalogic.dlapos.commons.upos.DLExtension;
import com.datalogic.dlapos.commons.event.EventCallback;
import com.datalogic.dlapos.commons.support.APosException;
import com.datalogic.dlapos.commons.upos.UPOSBaseInterface;

/**
 * Base interface for UPOS Services.
 *
 * @author fpoli
 */
public interface BaseService extends UPOSBaseInterface, DLExtension, APosServiceInstance {

    void open(String logicalName, EventCallback cb, Context context) throws APosException;
}
