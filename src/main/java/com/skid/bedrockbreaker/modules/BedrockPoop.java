package com.skid.bedrockbreaker.modules;

import com.skid.bedrockbreaker.Utils.BreakingFlowController;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Module;

public class BedrockPoop extends Module {
    public BedrockPoop() {
        super(Categories.World,"BedrockBreaker","asdjhfahefashdfpoas");
    }

    @Override
    public void onActivate(){
        BreakingFlowController.switchOnOff();
    }

    @Override
    public void onDeactivate(){
        BreakingFlowController.switchOnOff();
    }
}
