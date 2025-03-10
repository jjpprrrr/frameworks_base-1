/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settingslib.mobile;

import com.android.settingslib.AccessibilityContentDescriptions;
import com.android.settingslib.R;
import com.android.settingslib.SignalIcon.MobileIconGroup;

import java.util.HashMap;
import java.util.Map;

/**
 * Telephony related icons and strings for SysUI and Settings.
 */
public class TelephonyIcons {
    //***** Data connection icons
    public static final int FLIGHT_MODE_ICON = R.drawable.stat_sys_airplane_mode;

    public static final int ICON_LTE = R.drawable.ic_lte_mobiledata;
    public static final int ICON_LTE_PLUS = R.drawable.ic_lte_plus_mobiledata;
    public static final int ICON_G = R.drawable.ic_g_mobiledata;
    public static final int ICON_E = R.drawable.ic_e_mobiledata;
    public static final int ICON_H = R.drawable.ic_h_mobiledata;
    public static final int ICON_H_PLUS = R.drawable.ic_h_plus_mobiledata;
    public static final int ICON_3G = R.drawable.ic_3g_mobiledata;
    public static final int ICON_4G = R.drawable.ic_4g_mobiledata;
    public static final int ICON_4G_PLUS = R.drawable.ic_4g_plus_mobiledata;
    public static final int ICON_5G_E = R.drawable.ic_5g_e_mobiledata;
    public static final int ICON_1X = R.drawable.ic_1x_mobiledata;
    public static final int ICON_5G = R.drawable.ic_5g_mobiledata;
    public static final int ICON_5G_PLUS = R.drawable.ic_5g_plus_mobiledata;
    public static final int ICON_CWF = R.drawable.ic_carrier_wifi;
    public static final int ICON_VOWIFI = R.drawable.ic_vowifi;
    public static final int ICON_VOWIFI_CALLING = R.drawable.ic_vowifi_calling;
    public static final int ICON_VOWIFI_ASUS = R.drawable.ic_vowifi_asus;
    public static final int ICON_VOWIFI_MOTO = R.drawable.ic_vowifi_moto;
    public static final int ICON_VOWIFI_ONEPLUS = R.drawable.ic_vowifi_oneplus;
    public static final int ICON_VOWIFI_EMUI = R.drawable.ic_vowifi_emui;
    public static final int ICON_VOWIFI_VIVO = R.drawable.ic_vowifi_vivo;
    public static final int ICON_VOWIFI_Margaritov = R.drawable.ic_vowifi_margaritov;


    public static final MobileIconGroup CARRIER_NETWORK_CHANGE = new MobileIconGroup(
            "CARRIER_NETWORK_CHANGE",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.carrier_network_change_mode,
            0,
            false);

    public static final MobileIconGroup THREE_G = new MobileIconGroup(
            "3G",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_3g,
            TelephonyIcons.ICON_3G,
            true);

    public static final MobileIconGroup WFC = new MobileIconGroup(
            "WFC",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            0, 0, false);

    public static final MobileIconGroup UNKNOWN = new MobileIconGroup(
            "Unknown",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            0, 0, false);

    public static final MobileIconGroup E = new MobileIconGroup(
            "E",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_edge,
            TelephonyIcons.ICON_E,
            false);

    public static final MobileIconGroup ONE_X = new MobileIconGroup(
            "1X",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_cdma,
            TelephonyIcons.ICON_1X,
            true);

    public static final MobileIconGroup G = new MobileIconGroup(
            "G",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_gprs,
            TelephonyIcons.ICON_G,
            false);

    public static final MobileIconGroup H = new MobileIconGroup(
            "H",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_3_5g,
            TelephonyIcons.ICON_H,
            false);

    public static final MobileIconGroup H_PLUS = new MobileIconGroup(
            "H+",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_3_5g_plus,
            TelephonyIcons.ICON_H_PLUS,
            false);

    public static final MobileIconGroup FOUR_G = new MobileIconGroup(
            "4G",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_4g,
            TelephonyIcons.ICON_4G,
            true);

    public static final MobileIconGroup FOUR_G_PLUS = new MobileIconGroup(
            "4G+",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_4g_plus,
            TelephonyIcons.ICON_4G_PLUS,
            true);

    public static final MobileIconGroup LTE = new MobileIconGroup(
            "LTE",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_lte,
            TelephonyIcons.ICON_LTE,
            true);

    public static final MobileIconGroup LTE_PLUS = new MobileIconGroup(
            "LTE+",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_lte_plus,
            TelephonyIcons.ICON_LTE_PLUS,
            true);

    public static final MobileIconGroup LTE_CA_5G_E = new MobileIconGroup(
            "5Ge",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_5ge_html,
            TelephonyIcons.ICON_5G_E,
            true);

    public static final MobileIconGroup NR_5G = new MobileIconGroup(
            "5G",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0,
            0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_5g,
            TelephonyIcons.ICON_5G,
            true);

    public static final MobileIconGroup NR_5G_PLUS = new MobileIconGroup(
            "5G_PLUS",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0,
            0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_5g_plus,
            TelephonyIcons.ICON_5G_PLUS,
            true);

    public static final MobileIconGroup DATA_DISABLED = new MobileIconGroup(
            "DataDisabled",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.cell_data_off_content_description,
            0,
            false);

    public static final MobileIconGroup NOT_DEFAULT_DATA = new MobileIconGroup(
            "NotDefaultData",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.not_default_data_content_description,
            0,
            false);

    public static final MobileIconGroup CARRIER_MERGED_WIFI = new MobileIconGroup(
            "CWF",
            /* sbIcons= */ null,
            /* qsIcons= */ null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            /* sbNullState= */ 0,
            /* qsNullState= */ 0,
            /* sbDiscState= */ 0,
            /* qsDiscState= */ 0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            R.string.data_connection_carrier_wifi,
            TelephonyIcons.ICON_CWF,
            /* isWide= */ true);

    public static final MobileIconGroup VOWIFI = new MobileIconGroup(
            "VoWIFI",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            0,
            TelephonyIcons.ICON_VOWIFI,
            false);

    public static final MobileIconGroup VOWIFI_CALLING = new MobileIconGroup(
            "VoWIFICall",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            0,
            TelephonyIcons.ICON_VOWIFI_CALLING,
            false);

    public static final MobileIconGroup VOWIFI_MOTO = new MobileIconGroup(
            "VoWIFI_Moto",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            0,
            TelephonyIcons.ICON_VOWIFI_MOTO,
            false);

    public static final MobileIconGroup VOWIFI_ASUS = new MobileIconGroup(
            "VoWIFI_ASUS",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            0,
            TelephonyIcons.ICON_VOWIFI_ASUS,
            false);

    public static final MobileIconGroup VOWIFI_ONEPLUS = new MobileIconGroup(
            "VoWIFI_OnePlus",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            0,
            TelephonyIcons.ICON_VOWIFI_ONEPLUS,
            false);

    public static final MobileIconGroup VOWIFI_EMUI = new MobileIconGroup(
            "VoWIFI_Emui",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            0,
            TelephonyIcons.ICON_VOWIFI_EMUI,
            false);

    public static final MobileIconGroup VOWIFI_VIVO = new MobileIconGroup(
            "VoWIFI_VIVO",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            0,
            TelephonyIcons.ICON_VOWIFI_VIVO,
            false);

    public static final MobileIconGroup VOWIFI_Margaritov = new MobileIconGroup(
            "VoWIFI_Syberia",
            null,
            null,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH,
            0, 0,
            0,
            0,
            AccessibilityContentDescriptions.PHONE_SIGNAL_STRENGTH[0],
            0,
            TelephonyIcons.ICON_VOWIFI_Margaritov,
            false);


    // When adding a new MobileIconGround, check if the dataContentDescription has to be filtered
    // in QSCarrier#hasValidTypeContentDescription

    /** Mapping icon name(lower case) to the icon object. */
    public static final Map<String, MobileIconGroup> ICON_NAME_TO_ICON;
    static {
        ICON_NAME_TO_ICON = new HashMap<>();
        ICON_NAME_TO_ICON.put("carrier_network_change", CARRIER_NETWORK_CHANGE);
        ICON_NAME_TO_ICON.put("3g", THREE_G);
        ICON_NAME_TO_ICON.put("wfc", WFC);
        ICON_NAME_TO_ICON.put("unknown", UNKNOWN);
        ICON_NAME_TO_ICON.put("e", E);
        ICON_NAME_TO_ICON.put("1x", ONE_X);
        ICON_NAME_TO_ICON.put("g", G);
        ICON_NAME_TO_ICON.put("h", H);
        ICON_NAME_TO_ICON.put("h+", H_PLUS);
        ICON_NAME_TO_ICON.put("4g", FOUR_G);
        ICON_NAME_TO_ICON.put("4g+", FOUR_G_PLUS);
        ICON_NAME_TO_ICON.put("5ge", LTE_CA_5G_E);
        ICON_NAME_TO_ICON.put("lte", LTE);
        ICON_NAME_TO_ICON.put("lte+", LTE_PLUS);
        ICON_NAME_TO_ICON.put("5g", NR_5G);
        ICON_NAME_TO_ICON.put("5g_plus", NR_5G_PLUS);
        ICON_NAME_TO_ICON.put("datadisable", DATA_DISABLED);
        ICON_NAME_TO_ICON.put("notdefaultdata", NOT_DEFAULT_DATA);
    }

    public static final int[] WIFI_CALL_STRENGTH_ICONS = {
        R.drawable.ic_wifi_call_strength_0,
        R.drawable.ic_wifi_call_strength_1,
        R.drawable.ic_wifi_call_strength_2,
        R.drawable.ic_wifi_call_strength_3,
        R.drawable.ic_wifi_call_strength_4
    };

    public static final int[] MOBILE_CALL_STRENGTH_ICONS = {
        R.drawable.ic_mobile_call_strength_0,
        R.drawable.ic_mobile_call_strength_1,
        R.drawable.ic_mobile_call_strength_2,
        R.drawable.ic_mobile_call_strength_3,
        R.drawable.ic_mobile_call_strength_4
    };
}

