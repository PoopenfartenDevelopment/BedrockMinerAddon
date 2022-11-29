package com.skid.bedrockbreaker;

import com.mojang.logging.LogUtils;
import com.skid.bedrockbreaker.modules.activate;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class BedrockBreaker extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category MAIN = new Category("Main");

    @Override
    public void onInitialize() {
        LOG.info("Initializing bedrock breaker");
        Modules.get().add(new activate());

    }
    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(MAIN);
    }

    @Override
    public String getPackage() {
        return "com.skid.bedrockbreaker";
    }
}
