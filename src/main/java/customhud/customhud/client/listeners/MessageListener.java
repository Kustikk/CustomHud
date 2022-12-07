//package customhud.customhud.client.listeners;
//
//import net.minecraft.client.MinecraftClient;
//import net.minecraft.client.network.ClientPlayerEntity;
//
//
//public class MessageListener {
//    public static void onMessage(Message.Incoming msg){
//        ClientPlayerEntity player = MinecraftClient.getInstance().player;
//        if(player != null && (!msg.hasSender() || !msg.senderIs(player)) && !msg.isEmpty())  // player exists & is msg from another client & msg not empty (this will also make it so empty patterns never match incoming messages)
//            onIncomingMessage(msg.channel(), msg.toString());
//    }
//}
