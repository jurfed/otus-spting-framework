package homework1.service;

import homework1.dao.TestDao;

import java.io.IOException;

public interface ServiceInterface {

    public String getName();

    public void setName(String name);

    public TestDao getTestDao();

    public void enterYouName() throws IOException;

    public void startTests();

    public void checkQuestion(String a, String b);


}
