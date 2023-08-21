package hss.messages;

public class SmokeMessage implements Message{

    @Override
    public String getMessage() {
        return "smoke sensor detect smoke and water sprinkler has been activate ";
    }

    @Override
    public String getSenderPhone() {
        return "01002003000";
    }

    @Override
    public String getTargetPhone() {
        return "01002003001";
    }
}
