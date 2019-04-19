import org.junit.Test;
import junit.framework.TestCase;
public class ComplexTest extends TestCase {
    Complex test0 = new Complex(0,0);
    Complex test1 = new Complex(1,1);
    Complex test2 = new Complex(10,10);
    Complex test3 = new Complex(50,50);
    Complex test4 = new Complex(-100,-100);
    @Test
    public void testgetRealPart() throws Exception {
        assertEquals(0.0,test0.getRealPart());
        assertEquals(10.0,test2.getRealPart());
        assertEquals(-100.0,test4.getRealPart());
    }
    @Test
    public void testgetImagePart() throws Exception {
        assertEquals(0.0,test0.getImagePart());
        assertEquals(1.0,test1.getImagePart());
        assertEquals(50.0,test3.getImagePart());
    }
    @Test
    public void testcomplexAdd() throws Exception {
        test0.complexAdd(test1,test2);
        assertEquals("11.0+ 11.0i",test0.toString());
        test0.complexAdd(test3,test4);
        assertEquals("-50.0+ -50.0i",test0.toString());
    }
    @Test
    public void testcomplexSub() throws Exception {
        test0.complexSub(test1,test2);
        assertEquals("-9.0+ -9.0i",test0.toString());
        test0.complexSub(test3,test4);
        assertEquals("150.0+ 150.0i",test0.toString());
    }
    @Test
    public void testcomplexMulti() throws Exception {
        test0.complexMulti(test2,test1);
        assertEquals("0.0+ 20.0i",test0.toString());
        test0.complexMulti(test4,test3);
        assertEquals("0.0+ -10000.0i",test0.toString());
    }
    @Test
    public void testcomplexDiv() throws Exception {
        test0.complexDiv(test2,test1);
        assertEquals("10.0+ 0.0i",test0.toString());
        test0.complexDiv(test4,test3);
        assertEquals("-2.0+ 0.0i",test0.toString());
    }
}
