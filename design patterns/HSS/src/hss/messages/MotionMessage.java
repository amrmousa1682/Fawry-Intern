package hss.messages;

public class MotionMessage implements Message{

    @Override
    public String getMessage() {
        return "motion sensor detect movement and alarm has been activate ";
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
