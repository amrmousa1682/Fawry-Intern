package hss.messages;

public class SmsSender {
    public static void send(Message msg) {
        System.out.println("send message : " + msg.getMessage() + " to " + msg.getTargetPhone() + " from " + msg.getSenderPhone());
    }
}
