import junit.framework.TestCase;

public class CompareTest extends TestCase {
    Compare com = new Compare ();
    public void testCompare() {
        com.compare ("20175223姚明宇","20175223姚明宇");
        com.compare ("20175223姚明宇","20175233严顺尧");
    }
}