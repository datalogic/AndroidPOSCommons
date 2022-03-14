package com.datalogic.dlapos.commons.upos;

import com.datalogic.dlapos.commons.support.APosException;

public interface DLExtension {

    void claim(RequestListener listener) throws APosException;

}
