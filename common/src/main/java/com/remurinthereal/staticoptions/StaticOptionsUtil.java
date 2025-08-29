package com.remurinthereal.staticoptions;

import java.util.Locale;

public final class StaticOptionsUtil {
    public static OS getPlatform() {
        String string = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (string.contains("win")) {
            return OS.WINDOWS;
        } else if (string.contains("mac")) {
            return OS.OSX;
        } else if (string.contains("solaris")) {
            return OS.SOLARIS;
        } else if (string.contains("sunos")) {
            return OS.SOLARIS;
        } else if (string.contains("linux")) {
            return OS.LINUX;
        } else {
            return string.contains("unix") ? OS.LINUX : OS.UNKNOWN;
        }
    }

    public enum OS {
        LINUX,
        SOLARIS,
        WINDOWS,
        OSX,
        UNKNOWN
    }
}
