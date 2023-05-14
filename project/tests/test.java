import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import javax.management.Notification;

import org.junit.Before;
import org.junit.Test;

public class PointCounterTest {

    private PointCounter counter;

    private NotificationListener listener;

    @Before
    public void setUp() throws Exception {
        counter = new PointCounter();
        listener = mock(NotificationListener.class);
    }

    @Test
    public void testIncrementValue() {
        counter.addNotificationListener(listener, null, null);
        counter.incrementValue();
        assertEquals(1, counter.getValue());
        verify(listener).handleNotification(new Notification("com.example.PointCounter.incremented", counter, 0, System.currentTimeMillis(), "Counter value incremented"), null);
    }
}
