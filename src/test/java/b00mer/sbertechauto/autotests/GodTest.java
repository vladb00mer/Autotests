package b00mer.sbertechauto.autotests;

import b00mer.sbertechauto.CSVFileReader;
import b00mer.sbertechauto.Expression;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GodTest {
    
    String filePath = "/home/b00mer/CSV/testData.csv";
    CSVFileReader csvFileReader;
    List<Expression> expList;
    
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
    }
    
    @Test
    public void checkForResultEquality() {
        
        expList.stream().forEach((exp) -> {
            assertTrue (exp.getLocalResult() == exp.getResult());
        });
    }
}   