package customhud.customhud.mixin;

import customhud.customhud.CustomHud;
import customhud.customhud.util.Helper;
import net.minecraft.network.message.SignedMessage;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(ChatMessageS2CPacket.class)
public class ChatMessageMixin {
    @Inject(at = @At("RETURN"), method = "message")
    private void onGetMessage(CallbackInfoReturnable<SignedMessage> cir) {
        String message = cir.getReturnValue().getContent().toString();
        CustomHud.LOGGER.info(message);
        if (CustomHud.notify) {
            if (message.contains("активировал глобальный бустер")){
                Helper.PlaySound();
            }
            if (message.contains(CustomHud.playername)) {
                Helper.PlaySound();
            }

        }
    }
}

