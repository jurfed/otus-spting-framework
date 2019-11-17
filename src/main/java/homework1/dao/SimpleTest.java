package homework1.dao;

import com.opencsv.CSVReader;

import javax.xml.bind.annotation.XmlAnyElement;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleTest implements TestDao {

    BufferedReader br;
    List<String[]> tests = new ArrayList<>();


    public SimpleTest(String filePath) throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(filePath).getFile());
        br = new BufferedReader(new FileReader(file));
    }

    @XmlAnyElement
    @Override
    public void initTests() throws IOException {
        CSVReader csvReader = new CSVReader(br);
        List<String[]> records = csvReader.readAll();
        this.tests = records;
    }


    public String[] startGetTest(int id){
        return tests.get(id);

    }

    public List<String[]> getTests() {
        return tests;
    }
}
