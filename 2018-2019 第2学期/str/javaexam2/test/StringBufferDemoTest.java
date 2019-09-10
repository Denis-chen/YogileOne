import org.junit.Test;
import junit.framework.TestCase;
public class StringBufferDemoTest extends TestCase {
    String weekly = new String("i wanna test this.");
    @Test
    public void testcharAt () {
        assertEquals('i',weekly.charAt(0));
        assertEquals('a',weekly.charAt(6));
        assertEquals(' ',weekly.charAt(12));
        assertEquals('s',weekly.charAt(16));
    }

    @Test
    public void testSplit() {
        assertEquals("i",weekly.split(" ")[0]);
        assertEquals("wanna",weekly.split(" ")[1]);
        assertEquals("test",weekly.split(" ")[2]);
        assertEquals("this.",weekly.split(" ")[3]);
    }

    @Test
    public void testSort() {
        int[] i = new int[]{100,50,35,31,2,1};
        Arrays.sort(i);
        assertEquals(1,i[0]);
        assertEquals(31,i[2]);
        assertEquals(50,i[4]);
        assertEquals(100,i[5]);
    }

    @Test
    public void testBinarySearch() {
        int[] i = new int[]{100,50,35,31,2,1,123};
        Arrays.sort(i);
        assertEquals(5,Arrays.binarySearch(i,100));
        assertEquals(1,Arrays.binarySearch(i,2));
        assertEquals(0,Arrays.binarySearch(i,1));
        assertEquals(6,Arrays.binarySearch(i,123));
    }

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
