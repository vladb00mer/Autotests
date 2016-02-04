package b00mer.sbertechauto.autotests;

import b00mer.sbertechauto.CSVFileReader;
import b00mer.sbertechauto.Expression;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;     
        
public class GodTest {
    
    String filePath = "./resources/CSV/testData.csv";
    CSVFileReader csvFileReader;
    List<Expression> expList;
    Expression exp;
    
    @Before
    public void setUp() {
    
        csvFileReader = new CSVFileReader(filePath);
        expList = csvFileReader.getArrayList();
    }
    
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
    @Test
    public void checkZeroRecord() {
    
        exp = expList.get(0);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
    @Test
    public void checkFirstRecord() {
    
        exp = expList.get(1);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
    @Test
    public void checkSecondRecord() {
    
        exp = expList.get(2);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
   @Test
    public void checkThirdRecord() {
    
        exp = expList.get(3);
        assertTrue (exp.getLocalResult() == exp.getResult());
    }
}    