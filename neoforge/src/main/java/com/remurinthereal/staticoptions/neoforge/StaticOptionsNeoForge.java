package com.remurinthereal.staticoptions.neoforge;

import com.remurinthereal.staticoptions.StaticOptions;

import com.remurinthereal.staticoptions.client.StaticOptionsClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforgespi.Environment;

@Mod(StaticOptions.MOD_ID)
public final class StaticOptionsNeoForge {
    public StaticOptionsNeoForge() {
        StaticOptions.init();
        if (Environment.get().getDist() == Dist.CLIENT) {
            StaticOptionsClient.init();
        }
    }
}
