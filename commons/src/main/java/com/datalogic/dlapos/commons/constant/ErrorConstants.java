package com.datalogic.dlapos.commons.constant;

public final class ErrorConstants {
    public final static int APOS_ERROR = 100;
    public static final int APOS_EXT_ERROR = 200;

    public final static int APOS_SUCCESS = 0;
    public final static int APOS_E_CLOSED = APOS_ERROR + 1;
    public final static int APOS_E_CLAIMED = APOS_ERROR + 2;
    public final static int APOS_E_NOTCLAIMED = APOS_ERROR + 3;
    public final static int APOS_E_NOSERVICE = APOS_ERROR + 4;
    public final static int APOS_E_DISABLED = APOS_ERROR + 5;
    public final static int APOS_E_ILLEGAL = APOS_ERROR + 6;
    public final static int APOS_E_NOHARDWARE = APOS_ERROR + 7;
    public final static int APOS_E_OFFLINE = APOS_ERROR + 8;
    public final static int APOS_E_NOEXISTS = APOS_ERROR + 9;
    public final static int APOS_E_EXISTS = APOS_ERROR + 10;
    public final static int APOS_E_FAILURE = APOS_ERROR + 11;
    public final static int APOS_E_TIMEOUT = APOS_ERROR + 12;
    public final static int APOS_E_BUSY = APOS_ERROR + 13;
    public final static int APOS_E_EXTENDED = APOS_ERROR + 14;
    public final static int APOS_E_DEPRECATED = APOS_ERROR + 15;

    public static final int APOS_ESTATS_ERROR = 80 + APOS_EXT_ERROR;
    public static final int APOS_EFIRMWARE_BAD_FILE = 81 + APOS_EXT_ERROR;
    public static final int APOS_ESTATS_DEPENDENCY = 82 + APOS_EXT_ERROR;
    public static final int APOS_ESCAL_OVERWEIGHT = 83 + APOS_EXT_ERROR;
    public static final int APOS_ESCAL_UNDERWEIGHT = 84 + APOS_EXT_ERROR;
    public static final int APOS_ESCAL_UNDER_ZERO = 85 + APOS_EXT_ERROR;
    public static final int APOS_ESCAL_SAME_WEIGHT = 86 + APOS_EXT_ERROR;

    //region Error Locus
    /**
     * Error occurred while processing asynchronous output.
     */
    public static final int APOS_EL_OUTPUT = 300;
    /**
     * Error occurred while gathering or processing event-driven input. No previously buffered input data is available.
     */
    public static final int APOS_EL_INPUT = 301;
    /**
     * Error occurred while gathering or processing event-driven input, and some previously buffered data is available.
     */
    public static final int APOS_EL_INPUT_DATA = 302;
    //endregion

    //region ErrorResponse
    /**
     * Retry sending the data. The error state is exited.
     */
    public static final int APOS_ER_RETRY = 400;
    /**
     * Clear all buffered input or output data (including all asynchronous output). The error state is exited.
     */
    public static final int APOS_ER_CLEAR = 401;
    /**
     * Acknowledges that a data error has occurred and directs the Device to continue input processing. The Device remains in the error state.
     */
    public static final int APOS_ER_CONTINUEINPUT = 402;
    //endregion
}
