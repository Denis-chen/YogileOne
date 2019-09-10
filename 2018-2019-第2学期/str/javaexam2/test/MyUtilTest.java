import org.junit.Test;
import junit.framework.TestCase;
public class MyUtilTest extends TestCase {
    @Test
    public void testNormal() {
        assertEquals("不及格", MyUtil.percentage2fivegrade(55));
        assertEquals("及格", MyUtil.percentage2fivegrade(65));
        assertEquals("中等", MyUtil.percentage2fivegrade(75));
        assertEquals("良好", MyUtil.percentage2fivegrade(85));
        assertEquals("优秀", MyUtil.percentage2fivegrade(95));
    }
    @Test
    public void testNormalExceptions() {
        assertEquals("错误", MyUtil.percentage2fivegrade(-10));
        assertEquals("错误", MyUtil.percentage2fivegrade(101));
    }
    @Test
    public void testBoundaty() {
        assertEquals("不及格", MyUtil.percentage2fivegrade(0));
        assertEquals("及格", MyUtil.percentage2fivegrade(60));
        assertEquals("中等", MyUtil.percentage2fivegrade(70));
        assertEquals("良好", MyUtil.percentage2fivegrade(80));
        assertEquals("优秀", MyUtil.percentage2fivegrade(90));
        assertEquals("优秀", MyUtil.percentage2fivegrade(90));
    }
}