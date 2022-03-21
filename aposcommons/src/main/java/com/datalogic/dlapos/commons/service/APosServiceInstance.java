package com.datalogic.dlapos.commons.service;

import com.datalogic.dlapos.commons.support.APosException;

/**
 * Generalized APos service instance.
 *
 * @author fpoli
 */
public interface APosServiceInstance {

    /**
     * Indicate the ServiceInstance that its connection has been dropped
     *
     * @throws APosException on error.
     */
    void delete() throws APosException;
}
