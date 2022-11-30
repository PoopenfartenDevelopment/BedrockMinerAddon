package com.skid.bedrockbreaker.modules;

import com.skid.bedrockbreaker.Utils.BreakingFlowController;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Module;

public class activate extends Module {
    public activate() {
        super(Categories.World,"activate","asdjhfahefashdfpoas");
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
