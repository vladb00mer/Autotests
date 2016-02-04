package b00mer.sbertechauto.autotests;

import b00mer.sbertechauto.CSVFileReader;
import b00mer.sbertechauto.Expression;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;     
import ru.yandex.qatools.allure.annotations.Title;
       
@Title("Test Suite")
public class ExpressionTest {
    
    String filePath = "./resources/CSV/testData.csv";
    CSVFileReader csvFileReader;
    List<Expression> expList;
    Expression exp;
    
    @Title("Preparation")
    @Before
    public void setUp() {
    
        csvFileReader = new CSVFileReader(filePath);
        expList = csvFileReader.getArrayList();
    }
    @Title("Finishing")
    @After
    public void tearDown() {
        
        csvFileReader = null;
        expList = null;
        filePath = null;
        exp = null;
    }
    // for dynamic record count
    /* @Test
    public void checkAllRecords() {
        
        for (Expression exp: expList) {
            assertTrue (exp.getLocalResult() == exp.getResult());
            
        }
    }*/
    // for fixed record count
    @Title("First Record")
    @Test
    public void checkZeroRecord() {
    
        exp = expList.get(0);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
    @Title("Second Record")
    @Test
    public void checkFirstRecord() {
    
        exp = expList.get(1);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
    @Title("Third Record")
    @Test
    public void checkSecondRecord() {
    
        exp = expList.get(2);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
    @Title("Fourth Record")
    @Test
    public void checkThirdRecord() {
    
        exp = expList.get(3);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
}    