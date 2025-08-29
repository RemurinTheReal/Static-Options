package com.remurinthereal.staticoptions.neoforge.client;

import com.remurinthereal.staticoptions.StaticOptions;
import com.remurinthereal.staticoptions.client.StaticOptionsClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = StaticOptions.MOD_ID, dist = Dist.CLIENT)
public final class StaticOptionsNeoForgeClient {
    public StaticOptionsNeoForgeClient() {
        StaticOptionsClient.init();
    }
}
