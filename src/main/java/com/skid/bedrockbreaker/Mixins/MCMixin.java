package com.skid.bedrockbreaker.Mixins;

import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import com.skid.bedrockbreaker.Utils.BreakingFlowController;

import static meteordevelopment.meteorclient.utils.player.ChatUtils.info;


@Mixin(MinecraftClient.class)
public class MCMixin {

    @Shadow
    @Nullable
    public ClientWorld world;

    @Inject(method = "handleBlockBreaking", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;swingHand(Lnet/minecraft/util/Hand;)V"), locals = LocalCapture.CAPTURE_FAILSOFT)
    private void inject(boolean bl, CallbackInfo ci, BlockHitResult blockHitResult, BlockPos blockPos, Direction direction) {
        if (world.getBlockState(blockPos).isOf(Blocks.BEDROCK) && BreakingFlowController.isWorking()) {
            BreakingFlowController.addBlockPosToList(blockPos);
        }
    }
}

