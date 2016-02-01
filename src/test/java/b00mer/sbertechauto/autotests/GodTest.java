package b00mer.sbertechauto.autotests;

import b00mer.sbertechauto.Expression;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GodTest {
    
    Expression expression, expression1;
    
    public GodTest() {
    }
    
    @Before
    public void setUp() {
        
        expression = new Expression ("1","2","+","3");
        expression1 = new Expression ("1","2","+","5");
    }
    
    @After
    public void tearDown() {
        
        expression = null;
    }
    @Test
    public void test() {
    assertTrue (expression.getLocalResult() == expression.getResult());
    assertFalse (expression1.getLocalResult() == expression1.getResult());
    }    
}