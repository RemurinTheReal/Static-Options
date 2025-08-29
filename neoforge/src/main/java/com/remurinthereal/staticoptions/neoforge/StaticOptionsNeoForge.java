package com.remurinthereal.staticoptions.neoforge;

import com.remurinthereal.staticoptions.StaticOptions;

import net.neoforged.fml.common.Mod;

@Mod(value = StaticOptions.MOD_ID)
public final class StaticOptionsNeoForge {
    public StaticOptionsNeoForge() {
        StaticOptions.init();
    }
}
