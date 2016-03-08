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
    int counter;
    
    @Title("The beginning")
    @Description("This is the beginning of test suite")
    @Before
    public void setUp() {
    
        csvFileReader = new CSVFileReader(filePath);
        expList = csvFileReader.getArrayList();
        counter = 0;
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
    
    // проверка первого выражения
    @Title("The test")
    @Description("This is the test") 
    @Test
    public void oneExpTest() {
                
        Expression expOne = expList.get(counter);
        checkRecord(expOne.getOperand1(),expOne.getOperation(),expOne.getOperand2(),expOne.getResult(), expOne);
        counter++;
    }
    
    // проверка остальных выражений
    @Title("The test")
    @Description("This is the test") 
    @Test
    public void separateTests() {
    
        for (int i = 1; i < expList.size(); i++) {
            oneExpTest();
        }
    }

/*  
    // перебор всех элементов коллекции выражений в одном тесте
    @Title("The tests")
    @Description("This is the tests") 
    @Test
    public void checkAllRecords() {
        
        for (Expression expr: expList) {
            checkRecord(expr.getOperand1(),expr.getOperation(),expr.getOperand2(),expr.getResult(), expr);
            
        }
    }
*/    
    @Step("Check if {0} {1} {2} = {3}")
    public void checkRecord(double a, String b, double c, double d, Expression exp) {
    
        assertEquals (exp.getLocalResult(), exp.getResult(), 0);  
    }
}