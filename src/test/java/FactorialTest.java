import demo.Factorial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    Factorial obj = new Factorial();
    @Test
    public void factTest(){
        assertEquals(120,obj.fact(5));
    }
}
