import javax.management.*;

public class PointCounter extends NotificationBroadcasterSupport implements PointCounterMBean {
    private int value = 0;

    private long sequenceNumber = 0;

    public void incrementValue() {
        value++;

        // Create and send a notification
        Notification notification = new Notification("com.example.PointCounter.incremented", this, sequenceNumber++, System.currentTimeMillis(), "Counter value incremented");
        sendNotification(notification);
    }

    public int getValue() {
        return value;
    }
}
