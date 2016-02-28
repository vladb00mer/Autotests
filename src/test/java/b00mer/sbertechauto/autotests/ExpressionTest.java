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
    Double localResult;
    
    @Title("The beginning")
    @Description("This is the beginning of test suite")
    @Before
    public void setUp() {
    
        csvFileReader = new CSVFileReader(filePath);
        expList = csvFileReader.getArrayList();
    }
    @Title("The end")
    @Description("This is the end of test suite")
    @After
    public void tearDown() {
        
        csvFileReader = null;
        expList = null;
        filePath = null;
        exp = null;
    }
    
    @Title("The Tests")
    @Description("Here are the tests runs")    
    @Test
    public void checkAllRecords() {
        
        for (Expression exp: expList) {
            checkRecord(exp.getOperand1(),exp.getOperation(),exp.getOperand2(),exp.getResult());
            
        }
    }
    
    @Step("Check if {0} {1} {2} = {3}")
    public void checkRecord(double a, String b, double c, double d) {
    
        assertTrue (exp.getLocalResult() == exp.getResult());        
    }   
}