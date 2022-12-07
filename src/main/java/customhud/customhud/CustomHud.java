package customhud.customhud;

import customhud.customhud.util.Helper;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomHud implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("customhud");
    public static boolean notify = true;
    public static String playername = MinecraftClient.getInstance().getSession().getUsername();

    @Override
    public void onInitialize() {
        LOGGER.info("AFK reply Loaded");
        net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {

            dispatcher.register(net.fabricmc.fabric.api.client.command.v2.ClientCommandManager.literal("Thx").executes(Helper::Notify));
        });
    }
}
