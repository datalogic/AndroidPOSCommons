package com.datalogic.dlapos.commons.upos;

import android.content.Context;

import com.datalogic.dlapos.commons.support.APosException;

public interface UPOSScaleInterface {
    //region Properties

    /**
     * If true, the scale includes an integrated display that shows the current weight.
     * If false, the application may need to show the current weight on another display.
     *
     * @return true if the scale includes an integrated display that shows the current weight.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapDisplay() throws APosException;

    /**
     * If true, the scale includes an integrated display that shows the current weight and can also show text that describes the item being weighed.
     * If false, extra text cannot be shown on the display.
     *
     * @return true if the scale includes an integrated display that shows the current weight and can also show text that describes the item being weighed.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapDisplayText() throws APosException;

    /**
     * If true, the scale supports the ability to determine and control the state and values of the tare and unit price that it uses after a {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight}
     * or {@link  UPOSScaleInterface#doPriceCalculating(int[], int[], long[], long[], int[], int[], int[], long[], int) doPriceCalculating} method call.
     * If false, the scale does not support the {@link  UPOSScaleInterface#freezeValue(int, boolean) freezeValue} method.
     *
     * @return true if the scale supports the ability to determine and control the state and values of the tare and unit price.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapFreezeValue() throws APosException;

    /**
     * If true, the scale can calculate prices. If false, the scale only returns a weight.
     *
     * @return true if the scale can calculate prices.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapPriceCalculating() throws APosException;

    /**
     * If true, the scale supports the ability to return the weightData and the tare value with the {@link  UPOSScaleInterface#readLiveWeightWithTare(int[], int[], int) readLiveWeightWithTare} method.
     *
     * @return true if the scale supports the ability to return the weight and the tare value.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapReadLiveWeightWithTare() throws APosException;

    /**
     * If true, the scale can utilize different methods for calculating the price of a weighed item on the scale.
     * If false, the scale does not support the {@link  UPOSScaleInterface#setPriceCalculationMode(int) setPriceCalculationMode} method.
     *
     * @return true if the scale can utilize different methods for calculating the price of a weighed item on the scale.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapSetPriceCalculationMode() throws APosException;

    /**
     * If true, the scale can support a method to associate a unit price with a specific weight unit measure that is different from the default weight measure unit for the scale.
     * If false, the scale can only associate a unit price with a preset weight measure unit.
     *
     * @return true if the scale can support a method to associate a unit price with a specific weight unit measure that is different from the default weight measure unit for the scale.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapSetUnitPriceWithWeightUnit() throws APosException;

    /**
     * If true, the scale supports special tare weight components that can be used in the calculations to determine the scale net weight.
     * If false, the scale may only support standard scale tare net weight calculations.
     *
     * @return true if the scale supports special tare weight components that can be used in the calculations to determine the scale net weight.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapSpecialTare() throws APosException;

    /**
     * If true, then the scale is capable of providing scale weight status with [StatusUpdateEvents].
     *
     * @return true if the scale is capable of providing scale weight status.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapStatusUpdate() throws APosException;

    /**
     * If true, the scale supports the ability to set the order in which multiple tare weight components can be applied in the calculations used to determine the scale net weight.
     * If false, the scale does not support this {@link  UPOSScaleInterface#setTarePriority(int) setTarePriority}  method.
     *
     * @return true if the scale supports the ability to set the order in which multiple tare weight components can be applied in the calculations used to determine the scale net weight.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapTarePriority() throws APosException;

    /**
     * If true, the scale includes setting a tare value. If false, the scale does not support tare values.
     *
     * @return true if the scale includes setting a tare value.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapTareWeight() throws APosException;

    /**
     * If true, the application can set the scale weight to zero. If false, the scale does not support programmatic zeroing.
     *
     * @return true if the application can set the scale weight to zero.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getCapZeroScale() throws APosException;

    /**
     * If true, then the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method will be performed asynchronously. If false, the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method will be performed synchronously.
     *
     * @return true if the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method will be performed asynchronously.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getAsyncMode() throws APosException;

    /**
     * If true, then the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method will be performed asynchronously. If false, the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method will be performed synchronously.
     *
     * @param enable the desired value.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    void setAsyncMode(boolean enable) throws APosException;

    /**
     * Holds the number of characters that may be displayed on an integrated display for the text which describes an article.
     * If {@link  UPOSScaleInterface#getCapDisplayText() CapDisplayText} is false, then the device does not support text displaying and this property is always zero.
     *
     * @return the number of characters that may be displayed.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    int getMaxDisplayTextChars() throws APosException;

    /**
     * Holds the maximum weight measurement possible from the scale. The measurement unit is available via the {@link  UPOSScaleInterface#getWeightUnit() WeightUnit} property.
     * This property has an assumed decimal place located after the "thousands" digit position.
     * For example, an actual value of 12345 represents 12.345, and an actual value of 5 represents 0.005.
     * Changing the {@link  UPOSScaleInterface#getWeightUnit() WeightUnit} property will also cause this property to change.
     *
     * @return the maximum weight measurement possible from the scale.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    int getMaximumWeight() throws APosException;

    /**
     * Holds the minimum weight measurement possible from the scale. The measurement unit is available via the {@link  UPOSScaleInterface#getWeightUnit() WeightUnit} property.
     * This property has an assumed decimal place located after the "thousands" digit position. For example, an actual value of 5 represents 0.005.
     * Changing the {@link  UPOSScaleInterface#getWeightUnit() WeightUnit} property will also cause this property to change.
     *
     * @return the minimum weight measurement possible from the scale.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    int getMinimumWeight() throws APosException;

    /**
     * Holds the sales price read from the scale for price calculating scales.
     * For price calculating scales the scale calculates this value during the process of weighing by multiplying the {@link  UPOSScaleInterface#getUnitPrice() UnitPrice} property by the acquired weight.
     * This property is a monetary value stored using an implied four decimal places. For example, an actual value of 12345 represents 1.2345.
     *
     * @return the sales price read from the scale for price calculating scales.
     * @throws APosException if {@link  UPOSBaseInterface#setDeviceEnabled()}  enabled}  is not true.
     */
    long getSalesPrice() throws APosException;

    /**
     * Contains the returned value for the weight measured by the scale if the StatusUpdateEvent status is set to {@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SUE_STABLE_WEIGHT}, else zero.
     * The weight has an assumed decimal place located after the "thousands" digit position. For example, an actual value of 12345 represents 12.345, and an actual value of 5 represents 0.005.
     *
     * @return the returned value for the weight measured by the scale.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    int getScaleLiveWeight() throws APosException;

    /**
     * Scale weight state notification can only be set by the application if the capability {@link  UPOSScaleInterface#getCapStatusUpdate() CapStatusUpdate} is true.
     * Allowed values are:
     * - {@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SN_ENABLED},
     * - {@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SN_DISABLED}.
     * StatusNotify may only be set while the device is disabled, that is, while {@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}) (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}).
     * This property is initialized to {@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SN_DISABLED} by the open method.
     *
     * @return the notification mode status.
     * @throws APosException when
     *                       <ul>
     *                           <li>the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked,</li>
     *                           <li>the device is already enabled (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>{@link  UPOSScaleInterface#getCapStatusUpdate() CapStatusUpdate} is false(error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    int getStatusNotify() throws APosException;

    /**
     * Holds the tare weight of scale data. This property has an assumed decimal place located after the "thousands" digit position.
     * For example, an actual value of 12345 represents 12.345, and an actual value of 5 represents 0.005.
     * The measured unit is specified in the {@link  UPOSScaleInterface#getWeightUnit() WeightUnit} property.
     * If {@link  UPOSScaleInterface#getCapTareWeight() CapTareWeight} is false, then the device does not support setting of a tare value and this property is always zero.
     *
     * @return the tare weight of scale data.
     * @throws APosException when
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>an invalid tare value was specified (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>{@link  UPOSScaleInterface#getCapTareWeight() CapTareWeight} is false(error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    int getTareWeight() throws APosException;

    /**
     * Holds the tare weight of scale data. This property has an assumed decimal place located after the "thousands" digit position.
     * For example, an actual value of 12345 represents 12.345, and an actual value of 5 represents 0.005.
     * The measured unit is specified in the {@link  UPOSScaleInterface#getWeightUnit() WeightUnit} property.
     * If {@link  UPOSScaleInterface#getCapTareWeight() CapTareWeight} is false, then the device does not support setting of a tare value and this property is always zero.
     *
     * @param tareWeight the desired value
     * @throws APosException when
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>an invalid tare value was specified (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>{@link  UPOSScaleInterface#getCapTareWeight() CapTareWeight} is false(error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    void setTareWeight(int tareWeight) throws APosException;

    /**
     * Holds the unit price of the article to be weighed. For price calculating scales this property is to be set before calling the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method.
     * It is updated by the {@link  UPOSScaleInterface#doPriceCalculating(int[], int[], long[], long[], int[], int[], int[], long[], int) doPriceCalculating} method. During weighing, the scale sets the {@link  UPOSScaleInterface#getSalesPrice() SalesPrice} property to the product of the item’s weight and this property.
     * This property is a monetary value stored using an implied four decimal places. For example, an actual value of 12345 represents 1.2345.
     * If {@link  UPOSScaleInterface#getCapPriceCalculating() CapPriceCalculating} is false, then setting of a unit price is not supported and this property is always zero.
     *
     * @return the unit price of the article to be weighed.
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>an invalid price was specified (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>{@link  UPOSScaleInterface#getCapPriceCalculating() CapPriceCalculating} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    long getUnitPrice() throws APosException;

    /**
     * Holds the unit price of the article to be weighed. For price calculating scales this property is to be set before calling the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method.
     * It is updated by the {@link  UPOSScaleInterface#doPriceCalculating(int[], int[], long[], long[], int[], int[], int[], long[], int) doPriceCalculating} method. During weighing, the scale sets the {@link  UPOSScaleInterface#getSalesPrice() SalesPrice} property to the product of the item’s weight and this property.
     * This property is a monetary value stored using an implied four decimal places. For example, an actual value of 12345 represents 1.2345.
     * If {@link  UPOSScaleInterface#getCapPriceCalculating() CapPriceCalculating}  is false, then setting of a unit price is not supported and this property is always zero.
     *
     * @param unitPrice the desired value
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>an invalid price was specified (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>{@link  UPOSScaleInterface#getCapPriceCalculating() CapPriceCalculating} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    void setUnitPrice(long unitPrice) throws APosException;

    /**
     * Holds the unit of weight of scale data, and has one of the following values:
     * <ul>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_WU_GRAM},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_WU_KILOGRAM},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_WU_OUNCE},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_WU_POUND},</li>
     * </ul>
     *
     * @return the unit of weight of scale data.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    int getWeightUnit() throws APosException;

    /**
     * If true, then the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method will return zero (0.00) as a valid stable weight.
     * If false, then the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method will not return zero as a valid stable weight.
     *
     * @return true if the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method can return zero (0.00) as a valid stable weight.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    boolean getZeroValid() throws APosException;

    /**
     * If true, then the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method will return zero (0.00) as a valid stable weight.
     * If false, then the {@link  UPOSScaleInterface#readWeight(int[], int)  readWeight} method will not return zero as a valid stable weight.
     *
     * @param zeroValid the desired value.
     * @throws APosException if the {@link  UPOSBaseInterface#open(String, Context) open} method has not been invoked.
     */
    void setZeroValid(boolean zeroValid) throws APosException;

    //endregion

    //region Methods

    /**
     * If {@link  UPOSScaleInterface#getCapDisplayText() CapDisplayText} is true, updates the text shown on the integrated display. Calling this method with an empty string ("") will clear the display.
     *
     * @param data characters to display.
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>the text contains more characters than {@link  UPOSScaleInterface#getMaxDisplayTextChars() MaxDisplayTextChars} (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>{@link  UPOSScaleInterface#getCapDisplayText() CapDisplayText} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    void displayText(String data) throws APosException;

    /**
     * This method is used to have the scale calculate and return the price of the item(s) on it allowing for multiple price determining factors.
     * <p>
     * In synchronous mode ({@link  UPOSScaleInterface#setAsyncMode(boolean) AsyncMode} = false), this method starts the read weight process and when a stable weight is obtained, does a price calculation.
     * Upon successful completion, the {@link  UPOSScaleInterface#getScaleLiveWeight() ScaleLiveWeight}, {@link  UPOSScaleInterface#getTareWeight() TareWeight}, {@link  UPOSScaleInterface#getUnitPrice() UnitPrice},
     * and {@link  UPOSScaleInterface#getSalesPrice() SalesPrice} properties are updated; the values for weightData, tare, unitPrice, unitPriceX, weightUnitX, weightNumeratorX, weightDenominatorX, and the resultant price are returned.
     * </p>
     * <p>
     * In asynchronous mode ({@link  UPOSScaleInterface#setAsyncMode(boolean) AsyncMode} = true), the weighing and subsequent price calculation is done asynchronously.
     * The method returns immediately with the return values for weightData, tare, unitPrice, unitPriceX, weightUnitX, weightNumeratorX, weightDenominatorX and resultant price.
     * Upon completion of the price calculating process, the {@link  UPOSScaleInterface#getScaleLiveWeight() ScaleLiveWeight}, {@link  UPOSScaleInterface#getTareWeight() TareWeight}, {@link  UPOSScaleInterface#getUnitPrice() UnitPrice},
     * and {@link  UPOSScaleInterface#getSalesPrice() SalesPrice} properties are updated and a [DataEvent] is delivered.
     * </p>
     * <p>
     * The weight returned, weightData and {@link  UPOSScaleInterface#getScaleLiveWeight() ScaleLiveWeight}, has an assumed decimal place located after the "thousands" digit position.
     * For example, an actual value of 12345 represents 12.345, and an actual value of 5 represents 0.005.
     * </p>
     *
     * @param weightValue        The value for the net weight. If in asynchronous mode, the returned value is zero.
     * @param tare               The value used to determine the item net weight. If in asynchronous mode, the returned value is zero.
     * @param unitPrice          The cost per measurement unit. The measurement unit is the same as that in the scale {@link  UPOSScaleInterface#getWeightUnit() WeightUnit} property. If in asynchronous mode, the returned value is zero.
     * @param unitPriceX         The cost per measurement unit. The measurement unit is the same as that in the {@link  UPOSScaleInterface#setUnitPriceWithWeightUnit(long, int, int, int) setUnitPriceWithWeightUnit} method parameter, weightUnit.
     * @param weightUnitX        The value representing the unit of weight that differs from the default value for the scale and is the same as {@link  UPOSScaleInterface#setUnitPriceWithWeightUnit(long, int, int, int) setUnitPriceWithWeightUnit} method parameter, weightUnit.
     * @param weightNumeratorX   The dividend which is the weight value based on the {@link  UPOSScaleInterface#setUnitPriceWithWeightUnit(long, int, int, int) setUnitPriceWithWeightUnit} method parameter, weightNumerator.
     * @param weightDenominatorX The divisor which is the weight value based on the {@link  UPOSScaleInterface#setUnitPriceWithWeightUnit(long, int, int, int) setUnitPriceWithWeightUnit} method parameter, weightDenominator.
     * @param price              The calculated monetary value for the item on the scale. If in asynchronous mode, the returned value is zero.
     * @param timeout            In synchronous mode the number of milliseconds to wait for a settled weight before failing the method. If in asynchronous mode, the timeout value is ignored.
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>an invalid timeout parameter was specified (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>an asynchronous doPriceCalculating method is in progress (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_BUSY}),</li>
     *                           <li>a stable weight was not available before timeout milliseconds elapsed (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_TIMEOUT}),</li>
     *                           <li>the weight was over {@link  UPOSScaleInterface#getMaximumWeight() MaximumWeight} (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_OVERWEIGHT}),</li>
     *                           <li>the weight was under the {@link  UPOSScaleInterface#getMinimumWeight() MinimumWeight} (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_UNDERWEIGHT}),</li>
     *                           <li>the scale is reporting a weight that is less than zero (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_UNDER_ZERO}),</li>
     *                           <li>the scale is reporting that the item/weight on the scale is identical to the previously reported item/weight (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_SAME_WEIGHT}).</li>
     *                       </ul>
     */
    void doPriceCalculating(int[] weightValue,
                            int[] tare,
                            long[] unitPrice,
                            long[] unitPriceX,
                            int[] weightUnitX,
                            int[] weightNumeratorX,
                            int[] weightDenominatorX,
                            long[] price,
                            int timeout) throws APosException;

    /**
     * Performs a bitwise logical OR function to determine the state of the item(s) selected after a readWeight or a doPriceCalculating method call is processed.
     * If the representative item bit value is set to true, then the scale will not clear (set to zero) the associated tare values and/or unit price.
     * If the representative item bit value is set to false, then the scale will clear (set to zero) the associated tare values and/or unit price.
     * The bitmask uses these values:
     * <ul>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SFR_MANUAL_TARE},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SFR_WEIGHTED_TARE},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SFR_PERCENT_TARE},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SFR_UNITPRICE},</li>
     * </ul>
     *
     * @param item   The bitwise value setting the state of the selected parameter item(s).
     * @param freeze If the freeze value is true, the representative item is not automatically set to zero.
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>the current state of the scale device does not allow the freezing of the requested tare or unit price value (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    void freezeValue(int item, boolean freeze) throws APosException;

    /**
     * This method is used to determine the value for the displaying the net weight.
     * <p>
     * In synchronous mode ({@link  UPOSScaleInterface#setAsyncMode(boolean) AsyncMode} is false), this method starts the read weight process and when a stable weight is obtained, does a net weight calculation.
     * Upon successful completion, the {@link  UPOSScaleInterface#getScaleLiveWeight() ScaleLiveWeight} and {@link  UPOSScaleInterface#getTareWeight() TareWeight} properties are updated and the values for weightData and tare are returned.
     * </p>
     * <p>
     * In asynchronous mode ({@link  UPOSScaleInterface#setAsyncMode(boolean) AsyncMode} is true), the weighing and subsequent net weight calculation is done asynchronously.
     * The method returns immediately with the return values for weightData and tare. Upon completion of this method, the {@link  UPOSScaleInterface#getScaleLiveWeight() ScaleLiveWeight} and {@link  UPOSScaleInterface#getTareWeight() TareWeight} properties are updated and a [DataEvent] is delivered.
     * </p>
     * <p>
     * The weight returned, weightData and {@link  UPOSScaleInterface#getScaleLiveWeight() ScaleLiveWeight}, has an assumed decimal place located after the "thousands" digit position. For example, an actual value of 12345 represents 12.345, and an actual value of 5 represents 0.005.
     * </p>
     *
     * @param weightData Contains the returned value for the net weight calculated by the scale. If in asynchronous mode the returned value is zero.
     * @param tare       The value used to calculate the net weight. If in asynchronous mode, the returned value is zero.
     * @param timeout    The number of milliseconds to wait for a settled weight before failing the method. If in asynchronous mode, the timeout value is ignored.
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>an invalid timeout parameter was specified (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>an asynchronous readLiveWeightWithTare method is in progress (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_BUSY}),</li>
     *                           <li>a stable weight was not available before timeout milliseconds elapsed (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_TIMEOUT}),</li>
     *                           <li>the weight was over {@link  UPOSScaleInterface#getMaximumWeight() MaximumWeight} (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_OVERWEIGHT}),</li>
     *                           <li>the weight was under the {@link  UPOSScaleInterface#getMinimumWeight() MinimumWeight} (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_UNDERWEIGHT}),</li>
     *                           <li>the scale is reporting a weight that is less than zero (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_UNDER_ZERO}),</li>
     *                           <li>the scale is reporting that the item/weight on the scale is identical to the previously reported item/weight (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_SAME_WEIGHT}).</li>
     *                       </ul>
     */
    void readLiveWeightWithTare(int[] weightData, int[] tare, int timeout) throws APosException;

    /**
     * Reads a weight from the scale.
     * <p>
     * If {@link  UPOSScaleInterface#setAsyncMode(boolean) AsyncMode} is true, the weighing process is performed asynchronously.
     * The method will initiate a read, then return immediately. Once the weighing process is complete, a [DataEvent] is delivered with the item’s weight contained in the event’s [Status] property.
     * </p>
     * <p>
     * The weight returned, weightData, has an assumed decimal place located after the "thousands" digit position. For example, an actual value of 12345 represents 12.345, and an actual value of 5 represents 0.005.
     * </p>
     *
     * @param weightData Contains the returned value for the weight measured by the scale. If in asynchronous mode the returned value is zero.
     * @param timeout    The number of milliseconds to wait for a settled weight before failing the method. If zero, the method attempts to read the scale weight, then returns the appropriate status immediately. If -1, the method waits as long as needed until a weight is successfully read or an error occurs.
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>an invalid timeout parameter was specified (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>an asynchronous readWeight method is in progress (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_BUSY}),</li>
     *                           <li>a stable weight was not available before timeout milliseconds elapsed (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_TIMEOUT}),</li>
     *                           <li>the weight was over {@link  UPOSScaleInterface#getMaximumWeight() MaximumWeight} (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_OVERWEIGHT}),</li>
     *                           <li>the weight was under the {@link  UPOSScaleInterface#getMinimumWeight() MinimumWeight} (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_UNDERWEIGHT}),</li>
     *                           <li>the scale is reporting a weight that is less than zero (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_UNDER_ZERO}),</li>
     *                           <li>the scale is reporting that the item/weight on the scale is identical to the previously reported item/weight (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESCAL_SAME_WEIGHT}).</li>
     *                       </ul>
     */
    void readWeight(int[] weightData, int timeout) throws APosException;

    /**
     * This method allows for various modes of operation based upon the user and provides for the corresponding rules for price calculations.
     * Supported modes are:
     * <ul>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_PCM_PRICE_LABELING},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_PCM_SELF_SERVICE},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_PCM_OPERATOR},</li>
     * </ul>
     *
     * @param mode The operation functionality selected for the scale.
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>the current state of the scale device does not allow this type of functionality (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>invalid parameter (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    void setPriceCalculationMode(int mode) throws APosException;

    /**
     * Set tare special behavior using one of the following modes:
     * <ul>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SST_DEFAULT},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SST_MANUAL},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SST_PERCENT},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_SST_WEIGHTED},</li>
     * </ul>
     *
     * @param mode Select the tare mode that is to be modified.
     * @param data Provides additional information specific to the mode selected to determine the characteristics for the tare that is to be modified.
     * @throws APosException when:
     *                       <ul>
     *                             <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                             <li>the current state of the scale device does not allow this type of functionality (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    void setSpecialTare(int mode, int data) throws APosException;

    /**
     * This method provides the mechanism to select the set of rules that can be used to control the prioritization of the tare component for net weight calculations.
     * The priority has to be one of the following:
     * <ul>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_STP_NONE}</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_STP_FIRST}</li>
     * </ul>
     *
     * @param priority The sequence in which a tare value is used when determining the net weight.
     * @throws APosException when:
     *                       <ul>
     *                             <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                             <li>the current state of the scale device does not allow this type of functionality (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    void setTarePriority(int priority) throws APosException;

    /**
     * This method can be used to calculate a new unitPrice based upon a conversion factor that translates the old per unitPrice into a new per unitPrice.
     * <p>
     * The weightUnit must be one of the following:
     * <ul>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_WU_GRAM},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_WU_KILOGRAM},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_WU_OUNCE},</li>
     *     <li>{@link com.datalogic.dlapos.commons.constant.ScaleConstants#SCAL_WU_POUND},</li>
     * </ul>
     * </p>
     *
     * @param unitPrice         The cost per unit price as calculated by this method.
     * @param weightUnit        The value representing the new unit of weight that differs from the default value for the scale.
     * @param weightNumerator   The dividend which is the weight value based on the current unit weight.
     * @param weightDenominator The divisor which is the weight value based on the new unit weight.
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                           <li>the current state of the scale device does not allow this type of functionality (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>invalid parameter (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                       </ul>
     */
    void setUnitPriceWithWeightUnit(long unitPrice, int weightUnit, int weightNumerator, int weightDenominator) throws APosException;

    /**
     * If {@link  UPOSScaleInterface#getCapZeroScale() CapZeroScale} is true, sets the current scale weight to zero. It may be used for initial calibration, or to account for tare weight on the scale.
     *
     * @throws APosException when:
     *                        <ul>
     *                            <li>{@link  UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_DISABLED}),</li>
     *                            <li>{@link  UPOSScaleInterface#getCapZeroScale() CapZeroScale} is false (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                            <li>An asynchronous {@link  UPOSScaleInterface#readWeight(int[], int) readWeight} is in progress (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_BUSY})</li>
     *                       </ul>
     */
    void zeroScale() throws APosException;
    //endregion
}
