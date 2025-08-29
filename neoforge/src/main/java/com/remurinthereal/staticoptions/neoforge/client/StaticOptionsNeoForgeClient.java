package com.remurinthereal.staticoptions.neoforge.client;

import com.remurinthereal.staticoptions.StaticOptions;
import com.remurinthereal.staticoptions.client.StaticOptionsClient;
import com.remurinthereal.staticoptions.neoforge.StaticOptionsConfig;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = StaticOptions.MOD_ID, dist = Dist.CLIENT)
public final class StaticOptionsNeoForgeClient {
    public StaticOptionsNeoForgeClient(ModContainer modContainer) {
        StaticOptionsClient.init();

        modContainer.registerConfig(ModConfig.Type.CLIENT, StaticOptionsConfig.CONFIG);
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
}
