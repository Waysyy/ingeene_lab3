import javax.management.*;

public interface PointCounterMBean {
    public void incrementValue();
    public int getValue();
}