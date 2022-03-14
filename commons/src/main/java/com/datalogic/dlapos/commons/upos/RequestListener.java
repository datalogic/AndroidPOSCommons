package com.datalogic.dlapos.commons.upos;

public interface RequestListener {
    void onSuccess();

    void onFailure(String failureDescription);
}
