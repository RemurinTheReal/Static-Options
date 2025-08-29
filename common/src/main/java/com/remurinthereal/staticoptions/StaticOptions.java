package com.remurinthereal.staticoptions;

import net.minecraft.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class StaticOptions {
    public static final Logger LOGGER = LogManager.getLogger("Static Options");
    public static final String MOD_ID = "static_options";
    public static final Util.OS OS;

    public static void init() {}

    static {
        OS = Util.getPlatform();
    }
}
