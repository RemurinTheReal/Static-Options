package com.remurinthereal.staticoptions.platform.client;

import dev.architectury.injectables.annotations.ExpectPlatform;

public final class PlatformHelper {
    @ExpectPlatform
    public static String getStaticOptionsPath() {
        throw new AssertionError();
    }
}