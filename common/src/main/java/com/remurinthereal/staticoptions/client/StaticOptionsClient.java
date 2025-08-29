package com.remurinthereal.staticoptions.client;

import com.remurinthereal.staticoptions.StaticOptions;
import org.lwjgl.system.Platform;

public final class StaticOptionsClient {
    private static String defaultStaticOptionsPath = null;

    public static void init() {
        switch (StaticOptions.OS) {
            case WINDOWS -> defaultStaticOptionsPath = System.getenv("APPDATA") + "\\.minecraft";
            case OSX -> defaultStaticOptionsPath = System.getProperty("user.home") + "\\Library\\Application Support\\minecraft";
            case LINUX, SOLARIS  -> defaultStaticOptionsPath = System.getProperty("user.home") + "\\.minecraft";
        }

        if (defaultStaticOptionsPath != null) {
            StaticOptions.LOGGER.info("Default Static Options path for {} is {}.", StaticOptions.OS, defaultStaticOptionsPath);
            return;
        }

        StaticOptions.LOGGER.warn("Unsupported Operating System for Static Options as STATIC_OPTIONS_PATH is null.");
    }

    public static String getDefaultStaticOptionsPath() {
        return defaultStaticOptionsPath;
    }
}
