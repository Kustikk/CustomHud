//package customhud.customhud.util;
//
//import net.minecraft.client.MinecraftClient;
//import net.minecraft.client.network.ClientPlayerEntity;
//import net.minecraft.text.Text;
//import net.minecraft.util.Formatting;
//import net.minecraft.network.message.MessageType;
//
//
//public class Message {
//    private static final Text CHAT_NAME;
//
//    static {
//        CHAT_NAME = TextUtil.buildText(
//                TextUtil.getWithFormat("[", Formatting.GRAY),
//                TextUtil.getWithFormat(Text.translatable("msg.notifmod.chat.name"), Formatting.LIGHT_PURPLE),
//                TextUtil.getWithFormat("] ", Formatting.GRAY)
//        );
//    }
//    private static ClientPlayerEntity getPlayer(){
//        return MinecraftClient.getInstance().player;
//    }
//
//    public static void chat(Text msg){
//        getPlayer().sendMessage(TextUtil.buildText(CHAT_NAME, msg), false);
//    }
//}
