import javax.management.*;
import java.lang.management.ManagementFactory;


public class Main {
    public static void main(String[] args) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        PointCounter counter = new PointCounter();
        ObjectInstance instance = mbs.registerMBean(counter, new ObjectName("com.example:type=PointCounter"));

        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
