package com.datalogic.dlapos.commons.constant;

import com.datalogic.dlapos.commons.control.BaseControl;

public final class CommonsConstants {

    //region Power Reporting

    /**
     * The UnifiedPOS Service cannot determine the state of the device. Therefore, no power reporting is possible.
     */
    public static final int PR_NONE = 0;
    /**
     * The UnifiedPOS Service can determine and report two of the power states - {@link CommonsConstants#PS_OFF_OFFLINE} (that is, off or offline) and {@link CommonsConstants#PS_ONLINE }.
     */
    public static final int PR_STANDARD = 1;
    /**
     * The UnifiedPOS Service can determine and report all three power states - {@link CommonsConstants#PS_OFF }, {@link CommonsConstants#PS_OFFLINE }, and {@link CommonsConstants#PS_ONLINE }.
     */
    public static final int PR_ADVANCED = 2;

    //endregion

    //region Power State
    /**
     * Cannot determine the device’s power state for one of the following reasons:
     * <ul>
     * <li>{@link BaseControl#getCapPowerReporting() CapPowerReporting} = {@link CommonsConstants#PR_NONE}; the device does not support power reporting,</li>
     * <li>{@link BaseControl#getPowerNotify() PowerNotify} = {@link CommonsConstants#PN_DISABLED}; power notifications are disabled,</li>
     * <li>{@link BaseControl#getDeviceEnabled() DeviceEnabled } = false; power state monitoring does not occur until the device is enabled.</li>
     * </ul>
     */
    public static final int PS_UNKNOWN = 2000;
    /**
     * The device is powered on and ready for use. Can be returned if {@link BaseControl#getCapPowerReporting() CapPowerReporting} = {@link CommonsConstants#PR_STANDARD} or {@link CommonsConstants#PR_ADVANCED}.
     */
    public static final int PS_ONLINE = 2001;
    /**
     * The device is powered off or detached from the POS terminal. Can only be returned if {@link BaseControl#getCapPowerReporting() CapPowerReporting} = {@link CommonsConstants#PR_ADVANCED}.
     */
    public static final int PS_OFF = 2002;
    /**
     * The device is powered on but is either not ready or not able to respond to requests. Can only be returned if {@link BaseControl#getCapPowerReporting() CapPowerReporting} = {@link CommonsConstants#PR_ADVANCED}.
     */
    public static final int PS_OFFLINE = 2003;
    /**
     * The device is either off or off-line. Can only be returned if {@link BaseControl#getCapPowerReporting() CapPowerReporting} = {@link CommonsConstants#PR_STANDARD}.
     */
    public static final int PS_OFF_OFFLINE = 2004;

    /**
     * The device is powered on and ready for use. Can be returned if {@link BaseControl#getCapPowerReporting() CapPowerReporting} = {@link CommonsConstants#PR_STANDARD} or {@link CommonsConstants#PR_ADVANCED}.
     */
    public static final int SUE_POWER_ONLINE = 2001;
    /**
     * The device is powered off or detached from the POS terminal. Can only be returned if {@link BaseControl#getCapPowerReporting() CapPowerReporting} = {@link CommonsConstants#PR_ADVANCED}.
     */
    public static final int SUE_POWER_OFF = 2002;
    /**
     * The device is powered on but is either not ready or not able to respond to requests. Can only be returned if {@link BaseControl#getCapPowerReporting() CapPowerReporting} = {@link CommonsConstants#PR_ADVANCED}.
     */
    public static final int SUE_POWER_OFFLINE = 2003;
    /**
     * The device is either off or off-line. Can only be returned if {@link BaseControl#getCapPowerReporting() CapPowerReporting} = {@link CommonsConstants#PR_STANDARD}.
     */
    public static final int SUE_POWER_OFF_OFFLINE = 2004;
    //endregion

    //region Power Notify

    /**
     * The UnifiedPOS Service will not provide any power notifications to the application.
     * No power notification [StatusUpdateEvents] will be fired, and {@link BaseControl#getPowerState() PowerState} may not be set.
     */
    public static final int PN_DISABLED = 0;
    /**
     * The UnifiedPOS Service will fire power notification [StatusUpdateEvents] and update {@link BaseControl#getPowerState() PowerState}, beginning when {@link BaseControl#setDeviceEnabled(Boolean)}  DeviceEnabled} is set to true.
     * The level of functionality depends upon {@link BaseControl#getCapPowerReporting() CapPowerReporting}.
     */
    public static final int PN_ENABLED = 1;

    //endregion

    //region Device Status
    /**
     * The Device is closed.
     */
    public static final int S_CLOSED = 0;
    /**
     * The Device is in a good state and is not busy.
     */
    public static final int S_IDLE = 1;
    /**
     * The Device is in a good state and is busy performing output.
     */
    public static final int S_BUSY = 2;
    /**
     * An error has been reported, and the application must recover the Device to a good state before normal I/O can resume.
     */
    public static final int S_ERROR = 3;
    //endregion

    //region Check Health
    /**
     * Perform a health check that does not physically change the device.
     */
    public static final int CH_INTERNAL = 0;
    /**
     * Perform a more thorough test that may change the device.
     */
    public static final int CH_EXTERNAL = 1;

    /**
     * Perform an interactive test of the device.
     */
    public static final int CH_INTERACTIVE = 2;
    //endregion

    //region Compare Firmware
    /**
     * Indicates that the version of one or more of the firmware files is older than the firmware in the device and that none of the firmware files is newer than the firmware in the device.
     */
    public static final int CVF_FIRMWARE_OLDER = 0;
    /**
     * Indicates that the versions of all of the firmware files are the same as the firmware in the device.
     */
    public static final int CVF_FIRMWARE_SAME = 1;
    /**
     * Indicates that the version of one or more of the firmware files is newer than the firmware in the device and that none of the firmware files is older than the firmware in the device.
     */
    public static final int CVF_FIRMWARE_NEWER = 2;
    /**
     * Indicates that the version of one or more of the firmware files is different than the firmware in the device.
     */
    public static final int CVF_FIRMWARE_DIFFERENT = 3;
    /**
     * Indicates that a relationship between the two firmware versions could not be determined.
     */
    public static final int CVF_FIRMWARE_UNKNOWN = 4;
    //endregion

    //region Firmware Update
    /**
     * Firmware update completed.
     */
    public static final int SUE_UF_COMPLETE = 200;
    /**
     * Firmware update in progress.
     */
    public static final int SUE_UF_PROGRESS = 100;
    /**
     * The update firmware process failed but the device is still operational.
     */
    public static final int SUE_UF_FAILED_DEV_OK = 201;
    /**
     * The update firmware process failed and the device is neither usable nor recoverable through software. The device requires service to be returned to an operational state.
     */
    public static final int SUE_UF_FAILED_DEV_UNRECOVERABLE = 202;
    /**
     * The update firmware process failed and the device will not be operational until another attempt to update the firmware is successful.
     */
    public static final int SUE_UF_FAILED_DEV_NEEDS_FIRMWARE = 203;
    /**
     * The update firmware process failed and the device is in an indeterminate state.
     */
    public static final int SUE_UF_FAILED_DEV_UNKNOWN = 204;

    public static final int SUE_UF_COMPLETE_DEV_NOT_RESTORED = 205;
    //endregion

    //region Bus types
    public final static String DEVICE_BUS_PROP_NAME = "deviceBus";
    public final static String RS232_DEVICE_BUS = "RS232";
    public final static String PARALLEL_DEVICE_BUS = "Parallel";
    public final static String USB_DEVICE_BUS = "USB";
    public final static String RS485_DEVICE_BUS = "RS485";
    public final static String HID_DEVICE_BUS = "HID";
    public final static String PROPRIETARY_DEVICE_BUS = "Proprietary";
    public final static String UNKNOWN_DEVICE_BUS = "Unknown";
    //endregion
}
