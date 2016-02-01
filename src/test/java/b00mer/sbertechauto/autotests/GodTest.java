package b00mer.sbertechauto.autotests;

import b00mer.sbertechauto.Expression;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GodTest {
    
    ArrayList<Expression> expressionList;
    
    public GodTest() {
        
        expressionList = new ArrayList();
    }
    
    @Before
    public void setUp() {
        
        expressionList.add(new Expression ("1","2","+","3"));
        expressionList.add(new Expression ("2","1","-","1"));
        expressionList.add(new Expression ("2","2","*","4"));
        expressionList.add(new Expression ("6","2","/","3"));
    }
    
    @After
    public void tearDown() {
        
        expressionList = null;
    }
    
    @Test
    public void test() {
        
        expressionList.stream().forEach((exp) -> {
            assertTrue (exp.getLocalResult() == exp.getResult());
        });
    }
}