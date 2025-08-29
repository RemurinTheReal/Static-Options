package com.remurinthereal.staticoptions.platform.client.neoforge;

import com.remurinthereal.staticoptions.neoforge.StaticOptionsConfig;

public class PlatformHelperImpl {
    public static String getStaticOptionsPath() {
        return StaticOptionsConfig.STATIC_OPTIONS_PATH.get();
    }
}