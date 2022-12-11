import demo.DemoClass;
import static org. junit.Assert.*;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class TestDemoClass {
//    @Test
//    public void test(){
//        fail("Not yet implemented");
//    }

    DemoClass obj = new DemoClass();

    @Test
    public void testSum(){
        assertEquals(-25,obj.sum(-10,-15));

    }
}
