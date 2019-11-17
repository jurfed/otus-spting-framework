package homework1.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface TestDao {


    public void initTests() throws IOException;

    public List<String[]> getTests();

    public String[] startGetTest(int id);

}
