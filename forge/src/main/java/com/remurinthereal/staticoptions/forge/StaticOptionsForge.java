package com.remurinthereal.staticoptions.forge;

import com.remurinthereal.staticoptions.StaticOptions;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

import com.remurinthereal.staticoptions.client.StaticOptionsClient;
import net.minecraftforge.forgespi.Environment;

@Mod(StaticOptions.MOD_ID)
public final class StaticOptionsForge {
    public StaticOptionsForge() {
        StaticOptions.init();
        if (Environment.get().getDist() == Dist.CLIENT) {
            StaticOptionsClient.init();
        }
    }
}
