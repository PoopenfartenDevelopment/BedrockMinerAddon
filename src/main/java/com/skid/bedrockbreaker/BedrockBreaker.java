package com.skid.bedrockbreaker;

import com.mojang.logging.LogUtils;
import com.skid.bedrockbreaker.modules.BedrockPoop;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class BedrockBreaker extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOG.info("Initializing bedrock breaker");
        Modules.get().add(new BedrockPoop());

    }

    @Override
    public String getPackage() {
        return "com.skid.bedrockbreaker";
    }
}
