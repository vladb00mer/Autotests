package b00mer.sbertechauto;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSVFileReader {

    File csvFile;
    CSVReader csvReader;    
    
// чтение файла в объект CSVReader в конструкторе   
    public CSVFileReader(String filePath) {
    
        try {
            csvFile = new File(filePath.trim());
            csvReader = new CSVReader(new FileReader(csvFile), ';');
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка чтения файла: "+csvFile.getAbsolutePath()+"\n");}
    }

// получение коллекции Expression
    public List<Expression> getArrayList() {
        
        List<String[]> csvArrayList = new ArrayList();
        List<Expression> expArrayList = new ArrayList();        
        
        try {
            csvArrayList = csvReader.readAll();
            csvReader.close();
        } catch (IOException ex) {
            System.out.println("Ошибка чтения в ArrayList!\n");
            Logger.getLogger(CSVFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (String[] line: csvArrayList) {
        
            expArrayList.add(new Expression(line[0],line[1],line[2],line[3]));
        }
        
        return expArrayList;
    }       
}