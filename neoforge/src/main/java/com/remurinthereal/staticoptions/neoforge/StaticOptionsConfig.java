package com.remurinthereal.staticoptions.neoforge;

import com.remurinthereal.staticoptions.client.StaticOptionsClient;
import net.neoforged.neoforge.common.ModConfigSpec;

public final class StaticOptionsConfig {
    public static final ModConfigSpec CONFIG;
    public static final ModConfigSpec.ConfigValue<String> STATIC_OPTIONS_PATH;

    static {
        ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
        STATIC_OPTIONS_PATH = BUILDER.define("staticOptionsPath", StaticOptionsClient.getDefaultStaticOptionsPath());

        CONFIG = BUILDER.build();
    }
}
