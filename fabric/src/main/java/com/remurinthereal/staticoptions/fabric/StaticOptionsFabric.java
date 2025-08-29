package com.remurinthereal.staticoptions.fabric;

import com.remurinthereal.staticoptions.StaticOptions;
import net.fabricmc.api.ModInitializer;

public final class StaticOptionsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        StaticOptions.init();
    }
}
