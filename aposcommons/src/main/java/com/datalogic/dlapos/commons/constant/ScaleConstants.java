package com.datalogic.dlapos.commons.constant;

import com.datalogic.dlapos.commons.control.ScaleBaseControl;

public final class ScaleConstants {
    //region WeightUnits
    /**
     * Unit is a gram.
     */
    public static final int SCAL_WU_GRAM = 0;
    /**
     * Unit is a kilogram (= 1000 grams).
     */
    public static final int SCAL_WU_KILOGRAM = 1;
    /**
     * Unit is an ounce.
     */
    public static final int SCAL_WU_OUNCE = 2;
    /**
     * Unit is a pound (= 16 ounces).
     */
    public static final int SCAL_WU_POUND = 3;
    //endregion

    //region StatusNotify
    /**
     * The Control will not provide any scale weight state notifications to the application or set any related ErrorCodeExtended values.
     */
    public static final int SCAL_SN_DISABLED = 0;
    /**
     * The Control will fire scale weight state notification StatusUpdateEvents and update the {@link ScaleBaseControl#getScaleLiveWeight() ScaleLiveWeight} property beginning when {@link ScaleBaseControl#setDeviceEnabled() DeviceEnabled} is set true. The level of functionality depends upon {@link ScaleBaseControl#getCapStatusUpdate() CapStatusUpdate}.
     */
    public static final int SCAL_SN_ENABLED = 1;
    //endregion

    //region FreezeValue, Item param
    /**
     * Freezes a manual tare
     */
    public static final int SCAL_SFR_MANUAL_TARE = 1;
    /**
     * Freezes a weighted tare
     */
    public static final int SCAL_SFR_WEIGHTED_TARE = 2;
    /**
     * Freezes a percentage tare
     */
    public static final int SCAL_SFR_PERCENT_TARE = 4;
    /**
     * Freezes the unit price
     */
    public static final int SCAL_SFR_UNITPRICE = 8;
    //endregion

    //region SetPriceCalculation, Mode param
    /**
     * The scale has a printer and is capable of printing price labels.
     */
    public static final int SCAL_PCM_PRICE_LABELING = 0;
    /**
     * The customer is weighing the products placed on the scale.
     */
    public static final int SCAL_PCM_SELF_SERVICE = 1;
    /**
     * The operator is using the scale and weighing the items for the customer.
     */
    public static final int SCAL_PCM_OPERATOR = 2;
    //endregion

    //region SetSpecialTare, Mode param
    /**
     * The data argument is interpreted as a weight value.
     */
    public static final int SCAL_SST_DEFAULT = 0;
    /**
     * The data argument is interpreted as a weight value. A data value of zero disables the tare immediately and deletes the tare value.
     */
    public static final int SCAL_SST_MANUAL = 1;
    /**
     * The data argument is interpreted as a percent value. A data value of zero disables the tare immediately and deletes the tare value.
     */
    public static final int SCAL_SST_PERCENT = 2;
    /**
     * If there is a weight on the scale the data argument is ignored and the weight from the scale will be used as the tare for the next price calculation. When there is no weight on the scale the weighted tare is deleted.
     */
    public static final int SCAL_SST_WEIGHTED = 4;
    //endregion

    //region SetSpecialTare, Priority param
    /**
     * Any tare can replace the currently selected tare.
     */
    public static final int SCAL_STP_NONE = 0;
    /**
     * If a tare is active, no other tare can be selected until the current tare is disabled.
     */
    public static final int SCAL_STP_FIRST = 1;
    //endregion

    //region StatusUpdateEvent, Status param
    public static final int SCAL_SUE_STABLE_WEIGHT = 0;
    public static final int SCAL_SUE_WEIGHT_UNSTABLE = 1;
    public static final int SCAL_SUE_WEIGHT_ZERO = 2;
    public static final int SCAL_SUE_WEIGHT_OVERWEIGHT = 3;
    public static final int SCAL_SUE_WEIGHT_UNDERWEIGHT = 4;
    public static final int SCAL_SUE_NOT_READY = 5;
    public static final int SCAL_SUE_WEIGHT_UNDER_ZERO = 6;
    //endregion
}
