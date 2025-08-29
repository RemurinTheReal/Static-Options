package com.remurinthereal.staticoptions.fabric.client;

import com.remurinthereal.staticoptions.client.StaticOptionsClient;
import net.fabricmc.api.ClientModInitializer;

public final class StaticOptionsFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        StaticOptionsClient.init();
    }
}
