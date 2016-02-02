package b00mer.sbertechauto;

import au.com.bytecode.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSVFileReader {

    CSVReader csvReader;
    File csvFile;
    String filePath = "/home/b00mer/CSV/testData.csv";
    ArrayList<String[]> CSVArrayList;
    
    public CSVFileReader() {
    
        try {
            csvFile = new File(filePath);
            csvReader = new CSVReader(new FileReader(csvFile));
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка чтения файла: "+csvFile.getAbsolutePath()+"\n");
            Logger.getLogger(CSVFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getArrayList() {
        
        try {
            CSVArrayList = (ArrayList<String[]>) csvReader.readAll();
        } catch (IOException ex) {
            System.out.println("Ошибка чтения в ArrayList!\n");
            Logger.getLogger(CSVFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
}
