package com.remurinthereal.staticoptions.client;

import com.remurinthereal.staticoptions.StaticOptions;
import net.minecraft.Util;

public final class StaticOptionsClient {
    public static final String STATIC_OPTIONS_PATH;

    public static void init() {

    }

    static {
        Util.OS operatingSystem = Util.getPlatform();
        switch (operatingSystem) {
            case WINDOWS:
                STATIC_OPTIONS_PATH = System.getenv("APPDATA") + "\\.minecraft";
                break;
            case OSX:
                STATIC_OPTIONS_PATH = System.getProperty("user.home") + "\\Library\\Application Support\\minecraft";
                break;
            case LINUX:
                STATIC_OPTIONS_PATH = System.getProperty("user.home") + "\\.config\\.minecraft";
                break;
            default:
                STATIC_OPTIONS_PATH = null;
        }

        if (STATIC_OPTIONS_PATH != null) {
            StaticOptions.LOGGER.info("Static Options path for {} is {}.", operatingSystem, STATIC_OPTIONS_PATH);
        } else {
            StaticOptions.LOGGER.warn("Unsupported Operating System for Static Options.");
        }
    }
}
