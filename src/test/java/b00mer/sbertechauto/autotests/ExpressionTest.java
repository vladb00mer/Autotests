package b00mer.sbertechauto.autotests;

import b00mer.sbertechauto.CSVFileReader;
import b00mer.sbertechauto.Expression;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;     
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;
       
@Title("Test Suite")
@Description("This is test suite")
public class ExpressionTest {
    
    String filePath = "./resources/CSV/testData.csv";
    CSVFileReader csvFileReader;
    List<Expression> expList;
    Expression exp;
    
    @Title("Preparation")
    @Description("This is test suite preparations")
    @Before
    public void setUp() {
    
        csvFileReader = new CSVFileReader(filePath);
        expList = csvFileReader.getArrayList();
    }
    @Title("Finishing")
    @Description("This is test suite finishing")
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
    @Description("This is first test case")
    @Test
    public void getZeroRecord() {
    
        exp = expList.get(0);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
    @Step()
    public void checkZeroRecord() {
    
        
    }
    
    @Title("Second Record")
    @Description("This is second test case")
    @Test
    public void checkFirstRecord() {
    
        exp = expList.get(1);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
    @Title("Third Record")
    @Description("This is third test case")
    @Test
    public void checkSecondRecord() {
    
        exp = expList.get(2);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
    @Title("Fourth Record")
    @Description("This is fourth test case")
    @Test
    public void checkThirdRecord() {
    
        exp = expList.get(3);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
}    