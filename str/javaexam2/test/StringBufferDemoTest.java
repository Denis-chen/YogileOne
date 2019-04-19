import org.junit.Test;
import junit.framework.TestCase;
public class StringBufferDemoTest extends TestCase {
    StringBuffer SBOne = new StringBuffer("StringBuffer");
    StringBuffer SBTwo = new StringBuffer("StringBufferStringBuffer");
    StringBuffer SBThree = new StringBuffer("StringBufferStringBufferStringBuffer");
    @Test
    public void testCharAt () {
        assertEquals('S',SBOne.charAt(0));
        assertEquals('S',SBTwo.charAt(12));
        assertEquals('S',SBThree.charAt(24));
    }
    @Test
    public void testCapacity () throws Exception{
        assertEquals(28,SBOne.capacity());
        assertEquals(40,SBTwo.capacity());
        assertEquals(52,SBThree.capacity());
    }
    @Test
    public void testIndexOf () throws Exception{
        assertEquals(1,SBOne.indexOf("tring"));
        assertEquals(2,SBTwo.indexOf("ring"));
        assertEquals(3,SBThree.indexOf("ing"));
    }
    @Test
    public void testLength () throws Exception{
        assertEquals(12,SBOne.length());
        assertEquals(24,SBTwo.length());
        assertEquals(36,SBThree.length());
    }
}