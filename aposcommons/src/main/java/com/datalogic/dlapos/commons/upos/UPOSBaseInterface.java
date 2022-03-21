package com.datalogic.dlapos.commons.upos;

import android.content.Context;

import com.datalogic.dlapos.commons.constant.CommonsConstants;
import com.datalogic.dlapos.commons.support.APosException;

import java.io.InputStream;

/**
 * UPOS base interface, used both for Controls and Services.
 *
 * @author fpoli
 */
public interface UPOSBaseInterface {
    //region Properties

    /**
     * If true, the UnifiedPOS Service will set DeviceEnabled to false after it receives and enqueues data as a [DataEvent].
     * Before any additional input can be received, the application must set {@link UPOSBaseInterface#setDeviceEnabled() DeviceEnabled} to true.
     * If false, the UnifiedPOS Service does not automatically disable the device when data is received.
     * If an application wants to receive and process only one input, or only one input at a time, then this property should be set to true.
     *
     * @return true if AutoDisable mode is set.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    boolean getAutoDisable() throws APosException;

    /**
     * If true, the UnifiedPOS Service will set DeviceEnabled to false after it receives and enqueues data as a [DataEvent].
     * Before any additional input can be received, the application must set {@link UPOSBaseInterface#setDeviceEnabled() DeviceEnabled} to true.
     * If false, the UnifiedPOS Service does not automatically disable the device when data is received.
     * If an application wants to receive and process only one input, or only one input at a time, then this property should be set to true.
     *
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    void setAutoDisable(boolean enabled) throws APosException;

    /**
     * If true, then the Service/device supports comparing the version of the firmware in the physical device against that of a firmware file; initialized by open method.
     *
     * @return true if the Service/device supports comparing the version of the firmware.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    boolean getCapCompareFirmwareVersion() throws APosException;

    /**
     * Identifies the reporting capabilities of the Device. It has one of the following values:
     * <ul>
     * <li>{@link CommonsConstants#PR_NONE}</li>
     * <li>{@link CommonsConstants#PR_STANDARD}</li>
     * <li>{@link CommonsConstants#PR_ADVANCED}</li>
     * </ul>
     *
     * @return the reporting capabilities of the Device.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    int getCapPowerReporting() throws APosException;

    /**
     * If true, the device accumulates and can provide various statistics regarding usage; otherwise no usage statistics are accumulated.
     * The information accumulated and reported is device specific, and is retrieved using the [retrieveStatistics] method.
     *
     * @return true if the device has the ability to reporting statistics.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    boolean getCapStatisticsReporting() throws APosException;

    /**
     * If true, then the device’s firmware can be updated via the {@link UPOSBaseInterface#updateFirmware(String) updateFirmware} method; initialized by {@link UPOSBaseInterface#open(String, Context) open} method.
     *
     * @return true if the device has the ability to update firmware.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    boolean getCapUpdateFirmware() throws APosException;

    /**
     * If true, the device statistics, or some of the statistics, can be reset to zero using the {@link UPOSBaseInterface#resetStatistics(String) resetStatistics} method, or updated using the {@link UPOSBaseInterface#updateStatistics(String) updateStatistics} method.
     * If {@link UPOSBaseInterface#getCapStatisticsReporting() capStatisticsReporting} is false, then capUpdateStatistics is also false.
     *
     * @return true if the device has the ability to update statistics.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    boolean getCapUpdateStatistics() throws APosException;

    /**
     * Holds the results of the most recent call to the {@link UPOSBaseInterface#checkHealth(int) checkHealth} method.
     *
     * @return the results of the most recent call to the {@link UPOSBaseInterface#checkHealth(int) checkHealth} method.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    String getCheckHealthText() throws APosException;

    /**
     * If true, the device is claimed for exclusive access. If false, the device is released for sharing with other applications.
     * This property is initialized to false by the {@link UPOSBaseInterface#open(String, Context) open} method.
     *
     * @return true if the device is claimed.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    boolean getClaimed() throws APosException;

    /**
     * Holds the number of enqueued [DataEvents].
     *
     * @return the number of enqueued DataEvents.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    int getDataCount() throws APosException;

    /**
     * If true, a [DataEvent] will be delivered as soon as input data is enqueued
     * If changed to true and some input data is already queued, then a [DataEvent] is delivered immediately.
     * If false, input data is enqueued for later delivery to the application.
     * Also, if an input error occurs, the [ErrorEvent] is not delivered while this property is false.
     *
     * @return true if DataEvents are enabled.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    boolean getDataEventEnabled() throws APosException;

    /**
     * If true, a [DataEvent] will be delivered as soon as input data is enqueued
     * If changed to true and some input data is already queued, then a [DataEvent] is delivered immediately.
     * If false, input data is enqueued for later delivery to the application.
     * Also, if an input error occurs, the [ErrorEvent] is not delivered while this property is false.
     *
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    void setDataEventEnabled(boolean enabled) throws APosException;

    /**
     * If true, the device is in an operational state. If changed to true, then the device is brought to an operational state.
     * If false, the device has been disabled. If changed to false, then the device is physically disabled when possible, any subsequent input will be discarded, and output operations are disallowed.
     *
     * @return true if the device is in an operational state.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    boolean getDeviceEnabled() throws APosException;

    /**
     * If true, the device is in an operational state. If changed to true, then the device is brought to an operational state.
     * If false, the device has been disabled. If changed to false, then the device is physically disabled when possible, any subsequent input will be discarded, and output operations are disallowed.
     *
     * @param enabled true to enable.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    void setDeviceEnabled(Boolean enabled) throws APosException;

    /**
     * If true, the UnifiedPOS Control will not deliver events. Events will be enqueued until this property is set to false.
     * If false, the application allows events to be delivered.
     * If some events have been held while events were frozen and all other conditions are correct for delivering the events, then changing this property to false will allow these events to be delivered.
     * An application may choose to freeze events for a specific sequence of code where interruption by an event is not desirable.
     *
     * @return false if he application allows events to be delivered.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    boolean getFreezeEvents() throws APosException;

    /**
     * If true, the UnifiedPOS Control will not deliver events. Events will be enqueued until this property is set to false.
     * If false, the application allows events to be delivered.
     * If some events have been held while events were frozen and all other conditions are correct for delivering the events, then changing this property to false will allow these events to be delivered.
     * An application may choose to freeze events for a specific sequence of code where interruption by an event is not desirable.
     *
     * @param value the desired value.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    void setFreezeEvents(boolean value) throws APosException;

    /**
     * Contains the type of power notification selection made by the application. It has one of the following values:
     * <ul>
     * <li>{@link CommonsConstants#PN_DISABLED},</li>
     * <li> {@link CommonsConstants#PN_ENABLED}</li>
     * </ul>
     * <p>
     * PowerNotify may only be set while the device is disabled; that is, while {@link UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false.
     *
     * @return the type of power notification selection made by the application.
     * @throws APosException if:
     *                       <ul>
     *                       <li>the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}),</li>
     *                       <li>the device is already enabled (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                       <li>trying to set {@link CommonsConstants#PN_ENABLED} but {@link UPOSBaseInterface#getCapPowerReporting() CapPowerReporting} is {@link CommonsConstants#PR_NONE}</li>
     *                       </ul>
     */
    int getPowerNotify() throws APosException;

    /**
     * Contains the type of power notification selection made by the Application. It has one of the following values:
     * <ul>
     * <li>{@link CommonsConstants#PN_DISABLED},</li>
     * <li> {@link CommonsConstants#PN_ENABLED}</li>
     * </ul>
     * <p>
     * PowerNotify may only be set while the device is disabled; that is, while {@link UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is false.
     *
     * @throws APosException if:
     *                       <ul>
     *                       <li>the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}),</li>
     *                       <li>the device is already enabled (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                       <li>trying to set {@link CommonsConstants#PN_ENABLED} but {@link UPOSBaseInterface#getCapPowerReporting() CapPowerReporting} is {@link CommonsConstants#PR_NONE}</li>
     *                       </ul>
     */
    void setPowerNotify(int mode) throws APosException;

    /**
     * Identifies the current power condition of the device, if it can be determined.
     * It has one of the following values:
     * <ul>
     *      <li>{@link CommonsConstants#PS_UNKNOWN},</li>
     *      <li>{@link CommonsConstants#PS_ONLINE},</li>
     *      <li>{@link CommonsConstants#PS_OFF},</li>
     *      <li>{@link CommonsConstants#PS_OFFLINE}</li>
     *      <li>{@link CommonsConstants#PS_OFF_OFFLINE}</li>
     * </ul>
     * This property is initialized to {@link CommonsConstants#PS_UNKNOWN} by the open method.
     * When {@link UPOSBaseInterface#getPowerNotify() powerNotify} is set to enabled and {@link UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} is true, then this property is updated as the UnifiedPOS Service detects power condition changes.
     *
     * @return the current power condition of the device.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    int getPowerState() throws APosException;

    /**
     * Holds the current state of the device. It has one of the following values:
     * <ul>
     *     <li>{@link CommonsConstants#S_CLOSED},</li>
     *     <li>{@link CommonsConstants#S_IDLE},</li>
     *     <li>{@link CommonsConstants#S_BUSY},</li>
     *     <li>{@link CommonsConstants#S_ERROR}.</li>
     * </ul>
     *
     * @return the current state of the device.
     */
    int getState();

    /**
     * Holds an identifier for the UnifiedPOS Service and the company that produced it.
     *
     * @return an identifier for the UnifiedPOS Service and the company that produced it.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    String getDeviceServiceDescription() throws APosException;

    /**
     * Holds the UnifiedPOS Service version number.
     * A sample version number is:
     * 1002038
     * This value may be displayed as version "1.2.38", and interpreted as major version 1, minor version 2, build 38 of the UnifiedPOS Service.
     *
     * @return the UnifiedPOS Service version number.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    int getDeviceServiceVersion() throws APosException;

    /**
     * Holds an identifier for the physical device.
     *
     * @return an identifier for the physical device.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    String getPhysicalDeviceDescription() throws APosException;

    /**
     * Holds a short name identifying the physical device. This is a short version of PhysicalDeviceDescription and should be limited to 30 characters.
     *
     * @return a short name identifying the physical device.
     * @throws APosException if the {@link UPOSBaseInterface#open(String, Context) open} method has not been invoked (error code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_CLOSED}).
     */
    String getPhysicalDeviceName() throws APosException;
    //endregion

    //region Methods


    /**
     * Releases the device and its resources.
     * If the {@link UPOSBaseInterface#getDeviceEnabled() DeviceEnabled} property is true, then the device is disabled.
     * If the {@link UPOSBaseInterface#getClaimed() Claimed} property is true, then exclusive access to the device is released.
     *
     * @throws APosException on error.
     */
    void close() throws APosException;

    /**
     * Requests exclusive access to the device. When successful, the {@link UPOSBaseInterface#getClaimed() Claimed} property is changed to true.
     *
     * @param timeOut the maximum number of milliseconds to wait for exclusive access to be satisfied.
     * @throws APosException when:
     *                       <ul>
     *                           <li>the device cannot be claimed for exclusive access, or an invalid timeout parameter was specified (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}),</li>
     *                           <li>another application has exclusive access to the device, and did not relinquish control before timeout milliseconds expired (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_TIMEOUT}).</li>
     *                       </ul>
     */
    void claim(int timeOut) throws APosException;

    /**
     * Releases exclusive access to the device.
     *
     * @throws APosException when the application does not have exclusive access to the device (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).
     */
    void release() throws APosException;

    /**
     * Tests the state of a device.
     * A text description of the results of this method is placed in the {@link UPOSBaseInterface#getCheckHealthText() CheckHealthText} property. The health of many devices can only be determined by a visual inspection of these test results.
     * This method is always synchronous.
     *
     * @param level the type of health check to be performed on the device. The following values may be specified:
     *              <ul>
     *              <li>{@link CommonsConstants#CH_INTERNAL}</li>
     *              <li>{@link CommonsConstants#CH_EXTERNAL}</li>
     *              <li>{@link CommonsConstants#CH_INTERACTIVE}</li>
     *              </ul>
     * @throws APosException if the specified level is not supported by the UnifiedPOS Service (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).
     */
    void checkHealth(int level) throws APosException;

    /**
     * Clears all device input that has been buffered.
     * Any data events or input error events that are enqueued are also cleared.
     *
     * @throws APosException on error.
     */
    void clearInput() throws APosException;

    /**
     * Communicates directly with the UnifiedPOS Service.
     *
     * @param command the command number whose specific values are assigned by the UnifiedPOS Service.
     * @param data    data necessary to execute the command.
     * @param obj     additional data to execute the command.
     * @throws APosException on error.
     */
    void directIO(int command, int[] data, Object obj) throws APosException;

    /**
     * This method determines whether the version of the firmware contained in the specified file is newer than, older than, or the same as the version of the firmware in the physical device.
     * The result of the comparison is returned in the result parameter and will be one of the following values:
     * <ul>
     *     <li>{@link CommonsConstants#CVF_FIRMWARE_OLDER}</li>
     *     <li>{@link CommonsConstants#CVF_FIRMWARE_SAME}</li>
     *     <li>{@link CommonsConstants#CVF_FIRMWARE_NEWER}</li>
     *     <li>{@link CommonsConstants#CVF_FIRMWARE_DIFFERENT}</li>
     *     <li>{@link CommonsConstants#CVF_FIRMWARE_UNKNOWN}</li>
     *     </ul>
     *
     * @param firmwareFileName specifies either the name of the file containing the firmware or a file containing a set of firmware files whose versions are to be compared against those of the device.
     * @param result           the result of the comparison.
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link UPOSBaseInterface#getCapCompareFirmwareVersion() CapCompareFirmwareVersion} is false (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                           <li>firmwareFileName is invalid (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_NOEXISTS}).</li>
     *                           <li>firmware file is corrupted or not in the correct format (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_EFIRMWARE_BAD_FILE}).</li>
     *                       </ul>
     */
    void compareFirmwareVersion(String firmwareFileName, int[] result) throws APosException;

    /**
     * Resets the defined resettable statistics in a device to zero.
     * All the requested statistics must be successfully reset in order for this method to complete successfully.
     * Both {@link UPOSBaseInterface#getCapStatisticsReporting() CapStatisticsReporting} and {@link UPOSBaseInterface#getCapUpdateStatistics() CapUpdateStatistics} must be true in order to successfully use this method.
     * This method is always executed synchronously.
     *
     * @param statisticsBuffer a comma-separated list of name(s), where an empty string ("") means ALL resettable statistics are to be reset, "U_" means all UnifiedPOS defined resettable statistics are to be reset, "M_" means all manufacturer defined resettable statistics are to be reset, and "actual_name1, actual_name2" (from the Json file definitions) means that the specifically defined resettable statistic(s) are to be reset.
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link UPOSBaseInterface#getCapStatisticsReporting() CapStatisticsReporting} or {@link UPOSBaseInterface#getCapUpdateStatistics() CapUpdateStatistics} are false (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                           <li>at least one of the specified statistics could not be reset (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESTATS_ERROR}).</li>
     *                           <li>at least one other statistic is required to be reset in addition to a requested statistic (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESTATS_DEPENDENCY}).</li>
     *                       </ul>
     */
    void resetStatistics(String statisticsBuffer) throws APosException;

    /**
     * Retrieves the requested statistics from a device.
     * {@link UPOSBaseInterface#getCapStatisticsReporting() CapStatisticsReporting} must be true in order to successfully use this method.
     * This method is always executed synchronously.
     *
     * @param statisticsBuffer a comma-separated list of name(s), where an empty string ("") means ALL statistics are to be retrieved, "U_" means all UnifiedPOS defined statistics are to be retrieved, "M_" means all manufacturer defined statistics are to be retrieved, and "actual_name1, actual_name2" (from the XML file definitions) means that the specifically defined statistic(s) are to be retrieved.
     * @throws APosException when  {@link UPOSBaseInterface#getCapStatisticsReporting() CapStatisticsReporting} is false or the named statistics is not defined (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).
     */
    void retrieveStatistics(String[] statisticsBuffer) throws APosException;

    /**
     * This method updates the firmware of a device with the version of the firmware contained or defined in the file specified by the firmwareFileName parameter regardless of whether that firmware’s version is newer than, older than, or the same as the version of the firmware already in the device.
     * The status of the update firmware process is exposed firing StatusUpdateEvents with values of {@link CommonsConstants#SUE_UF_PROGRESS} + an integer between 1 and 100 indicating the completion percentage of the update firmware process.
     * If an error is detected during the asynchronous portion of a update firmware process, one of the following StatusUpdateEvents will be fired:
     * <ul>
     *     <li>{@link CommonsConstants#SUE_UF_FAILED_DEV_OK}</li>
     *     <li>{@link CommonsConstants#SUE_UF_FAILED_DEV_UNRECOVERABLE}</li>
     *     <li>{@link CommonsConstants#SUE_UF_FAILED_DEV_NEEDS_FIRMWARE}</li>
     *     <li>{@link CommonsConstants#SUE_UF_FAILED_DEV_UNKNOWN}</li>
     * </ul>
     *
     * @param firmwareFileName specifies either the name of the file containing the firmware or a file containing a set of firmware files that are to be downloaded into the device.
     * @throws APosException when:
     *                       <ul>
     *                           <li>device is not opened, claimed and enabled,</li>
     *                           <li>{@link UPOSBaseInterface#getCapUpdateFirmware() CapUpdateFirmware} is false (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                           <li>at least one firmware file does not exists (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_NOEXISTS}).</li>
     *                           <li>at least one firmware file is corrupted or not in the correct format (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_EFIRMWARE_BAD_FILE}).</li>
     *                       </ul>
     */
    void updateFirmware(String firmwareFileName) throws APosException;

    /**
     * Updates the defined resettable statistics in a device.
     * Both {@link UPOSBaseInterface#getCapStatisticsReporting() CapStatisticsReporting} and {@link UPOSBaseInterface#getCapUpdateStatistics() CapUpdateStatistics} must be true in order to successfully use this method.
     * This method is always executed synchronously.
     *
     * @param statisticsBuffer a comma-separated list of name-value pair(s), where an empty string name ("""=value1") means ALL resettable statistics are to be set to the value "value1", "U_=value2" means all UnifiedPOS defined resettable statistics are to be set to the value "value2", "M_=value3" means all manufacturer defined resettable statistics are to be set to the value "value3", and "actual_name1=value4, actual_name2=value5" (from the Json file definitions) means that the specifically defined resettable statistic(s) are to be set to the specified value(s).
     * @throws APosException when:
     *                       <ul>
     *                           <li>{@link UPOSBaseInterface#getCapStatisticsReporting() CapStatisticsReporting} or {@link UPOSBaseInterface#getCapUpdateStatistics() CapUpdateStatistics} are false (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_ILLEGAL}).</li>
     *                           <li>at least one of the specified statistics could not be updated (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESTATS_ERROR}).</li>
     *                           <li>at least one other statistic is required to be updated in addition to a requested statistic (with code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_E_EXTENDED} and extended code {@link com.datalogic.dlapos.commons.constant.ErrorConstants#APOS_ESTATS_DEPENDENCY}).</li>
     *                       </ul>
     */
    void updateStatistics(String statisticsBuffer) throws APosException;
    //endregion

}
