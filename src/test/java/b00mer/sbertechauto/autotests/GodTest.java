package b00mer.sbertechauto.autotests;

import b00mer.sbertechauto.Expression;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GodTest {
    
    Expression expression;
    
    public GodTest() {
    }
    
    @BeforeClass
    public static void setUpClass() { 
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        expression = new Expression ("1","2","+","4");
    }
    
    @After
    public void tearDown() {
        
        expression = null;
    }
    @Test
    public void test() {
    assertEquals (1,2);
    }    
}