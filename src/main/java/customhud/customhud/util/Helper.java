package customhud.customhud.util;

import com.mojang.brigadier.context.CommandContext;
import customhud.customhud.CustomHud;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.message.MessageType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.awt.*;

public class Helper {
    public static int Notify(CommandContext<FabricClientCommandSource> context) {
        PlayerEntity player = context.getSource().getPlayer();
        World world = player.getWorld();
        CustomHud.notify = !CustomHud.notify;
        context.getSource().sendFeedback(Text.literal("notify = " + CustomHud.notify));
        BlockPos blockPos = player.getBlockPos();

        return 0;
    }

    public static void PlaySound(int soundId) {
        MinecraftClient client = MinecraftClient.getInstance();
        PositionedSoundInstance sound;
        if(soundId == 0)
        {
            sound = new PositionedSoundInstance(SoundEvents.ENTITY_ITEM_PICKUP.getId(), SoundCategory.PLAYERS, 0.6f, 0.3f, SoundInstance.createRandom(), false, 0, SoundInstance.AttenuationType.NONE, 0, 0, 0, true);
        }
        else
        {
            sound = new PositionedSoundInstance(SoundEvents.ENTITY_ITEM_BREAK.getId(), SoundCategory.PLAYERS, 0.6f, 0.3f, SoundInstance.createRandom(), false, 0, SoundInstance.AttenuationType.NONE, 0, 0, 0, true);
        }

        client.getSoundManager().play(sound);
    }

//    public static void SendMessage(CommandContext<FabricClientCommandSource> context){
//        MinecraftClient mc = MinecraftClient.getInstance();
//        mc.inGameHud.addChatMessage(MessageType.SYSTEM, message, mc.player.getUuid());
//    }
}
//(new TextComponent("Message"));