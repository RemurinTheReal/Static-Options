package com.remurinthereal.staticoptions.platform.client.fabric;

import com.remurinthereal.staticoptions.client.StaticOptionsClient;

public class PlatformHelperImpl {
    public static String getStaticOptionsPath() {
        return StaticOptionsClient.getDefaultStaticOptionsPath();
    }
}